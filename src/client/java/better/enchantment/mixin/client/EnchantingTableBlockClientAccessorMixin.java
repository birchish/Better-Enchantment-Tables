package better.enchantment.mixin.client;


import net.minecraft.block.EnchantingTableBlock;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;


@Mixin(value = EnchantingTableBlock.class, priority = 1001)//
public interface EnchantingTableBlockClientAccessorMixin {
	@Accessor("POWER_PROVIDER_OFFSETS")
	@Mutable()
    static void BetterEnchantmentTable$setPOWER_PROVIDER_OFFSETS (List<BlockPos> blockStream) {
		throw new AssertionError();
	}
}
