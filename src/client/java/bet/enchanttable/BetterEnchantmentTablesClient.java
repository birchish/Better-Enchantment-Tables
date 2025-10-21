package bet.enchanttable;

import bet.enchanttable.mixin.EnchantTableRangeAccessorMixin;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.util.math.BlockPos;

import java.util.List;

import static bet.enchanttable.mixin.client.EnchantTableRangeAccessorClientMixin.BetEnchantTable_setPOWER_PROVIDER_OFFSETS;

public class BetterEnchantmentTablesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // A clone of the logic that sets the variable in POWER_PROVIDER_OFFSETS
        List<BlockPos> area = BlockPos.stream(-4, -1, -4, 4, 2, 4)
                .map(BlockPos::toImmutable)
                .toList();

        EnchantTableRangeAccessorMixin.BetEnchantTable_setPOWER_PROVIDER_OFFSETS(area);
    }
}