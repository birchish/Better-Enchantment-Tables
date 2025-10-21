package bet.enchanttable;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.math.BlockPos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

import static bet.enchanttable.mixin.EnchantTableRangeAccessorMixin.BetEnchantTable_setPOWER_PROVIDER_OFFSETS;

public class BetterEnchantmentTables implements ModInitializer {
    @Override
    public void onInitialize() {
        List<BlockPos> area = BlockPos.stream(-4, -1, -4, 4, 2, 4)
                .map(BlockPos::toImmutable)
                .toList();
        BetEnchantTable_setPOWER_PROVIDER_OFFSETS(area);
    }
}