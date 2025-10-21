package better.enchantment;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.util.math.BlockPos;
import static better.enchantment.mixin.client.EnchantingTableBlockClientAccessorMixin.BetterEnchantmentTable$setPOWER_PROVIDER_OFFSETS;

public class BetterEnchantmentClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BetterEnchantmentTable$setPOWER_PROVIDER_OFFSETS(BlockPos.stream(-4, -1, -4, 4, 2, 4)
                .filter(pos -> Math.abs(pos.getX()) == 4 || Math.abs(pos.getZ()) == 4)
                .map(BlockPos::toImmutable)
                .toList());
    }
}
