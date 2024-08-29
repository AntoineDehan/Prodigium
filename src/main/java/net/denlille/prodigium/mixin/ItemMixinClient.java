package net.denlille.prodigium.mixin;

import net.denlille.prodigium.util.ModTags;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.denlille.prodigium.util.ModTags.Items.ITEM_GLOWING;

@Mixin(ItemEntity.class)
public class ItemMixinClient extends EntityMixin {
    @Override
    public void shouldItemGlow(CallbackInfoReturnable<Boolean> cir) {
        if (is(ITEM_GLOWING)) cir.setReturnValue(true);
    }

    @Shadow
    public ItemStack getItem() {
        throw new IllegalStateException("Shadow for getItem() failed.");
    }
}
