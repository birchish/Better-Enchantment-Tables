package better.enchantment;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.math.BlockPos;

import static better.enchantment.mixin.EnchantingTableBlockAccessorMixin.modid$setPOWER_PROVIDER_OFFSETS;

public class BetterEnchantment implements ModInitializer {
	public static final String MOD_ID = "better-enchantment";

	@Override
	public void onInitialize() {
		modid$setPOWER_PROVIDER_OFFSETS(BlockPos.stream(-4, -1, -4, 4, 2, 4)
				.filter(pos -> Math.abs(pos.getX()) == 4 || Math.abs(pos.getZ()) == 4)
				.map(BlockPos::toImmutable)
				.toList());
	}
}