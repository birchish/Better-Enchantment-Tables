package better.enchantment.mixin;


import net.minecraft.util.math.BlockPos;
import net.minecraft.block.EnchantingTableBlock;
// import net.minecraft.registry.tag.BlockTags;
// import net.minecraft.world.World;

import java.util.List;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;


@Mixin(value = EnchantingTableBlock.class, priority = 1001)//
public interface EnchantingTableBlockAccessorMixin {
	@Accessor("POWER_PROVIDER_OFFSETS")
	@Mutable()
    static void BetterEnchantmentTable$setPOWER_PROVIDER_OFFSETS (List<BlockPos> blockStream) {
		throw new AssertionError();
	}
}
