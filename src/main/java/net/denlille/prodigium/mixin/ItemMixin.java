package net.denlille.prodigium.mixin;

import net.denlille.prodigium.util.ModTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemEntity.class)
public class ItemMixin {
    @Inject(at = @At("HEAD"), method = "hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurt(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        if (ModTags.Items.tagEnabled(getItem(), "Immune", ModTags.Items.ITEM_IMMUNE)) {
            cir.setReturnValue(false);
        }
    }

    @Shadow
    public ItemStack getItem() {
        throw new IllegalStateException("Shadow for getItem() failed.");
    }

}
