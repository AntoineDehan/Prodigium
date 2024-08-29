package net.denlille.prodigium.mixin;

import net.denlille.prodigium.util.ModTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.denlille.prodigium.util.ModTags.Items.*;
import static net.minecraft.world.phys.Vec3.ZERO;

@Mixin(ItemEntity.class)
public class ItemMixin extends EntityMixin {
    @Inject(at = @At("HEAD"), method = "hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurt(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        if (is(ITEM_IMMUNE))
            cir.setReturnValue(false);
    }

    @Override
    protected void setMovement(CallbackInfoReturnable<Vec3> cir) {
        if (is(ITEM_FLOATING)) cir.setReturnValue(ZERO);
    }


    @Shadow
    public ItemStack getItem() {
        throw new IllegalStateException("Shadow for getItem() failed.");
    }

}
