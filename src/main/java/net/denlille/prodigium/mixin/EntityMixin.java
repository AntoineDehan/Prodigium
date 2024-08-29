package net.denlille.prodigium.mixin;

import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class EntityMixin {

    @Inject(method = "isCurrentlyGlowing", at = @At("RETURN"), cancellable = true)
    protected void shouldItemGlow(CallbackInfoReturnable<Boolean> cir) {
    }

    @Inject(at = @At("RETURN"), method = "isNoGravity", cancellable = true)
    protected void shouldItemFloat(CallbackInfoReturnable<Boolean> cir) {
    }

    @Inject(at = @At("RETURN"), method = "getDeltaMovement", cancellable = true)
    protected void setMovement(CallbackInfoReturnable<Vec3> cir) {
    }

    protected boolean is(TagKey<Item> tag) {
        return getItem().is(tag);
    }

    public abstract ItemStack getItem();
}
