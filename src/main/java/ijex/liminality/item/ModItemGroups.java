package ijex.liminality.item;

import ijex.liminality.Liminality;
import ijex.liminality.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup LIMINALITY = Registry.register(Registries.ITEM_GROUP, new Identifier(Liminality.MOD_ID, "liminality"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.liminality")).icon(() -> new ItemStack(ModBlocks.TILE))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.TILE);
                        entries.add(ModBlocks.CARPET);
                        entries.add(ModBlocks.PLASTER);
                        entries.add(ModBlocks.BASEBOARD_PLASTER);
                        entries.add(ModBlocks.PLASTER_STAIRS);
                        entries.add(ModBlocks.CEILING_TILE);
                        entries.add(ModBlocks.FLUORESCENT_LIGHT);
                        entries.add(ModBlocks.FIELDS_PORTAL_FRAME);
                        entries.add(ModBlocks.THLASSHOPHOBIA_PORTAL_FRAME);
                        entries.add(ModItems.DIVNG_HELMET);
                        entries.add(ModItems.DIVING_CHESTPLATE);
                        entries.add(ModItems.DIVING_LEGGINGS);
                        entries.add(ModItems.DIVING_BOOTS);
                        entries.add(ModBlocks.GLOW_ORB);
                        entries.add(ModBlocks.DUST);
                    }).build());

    public static void init() {
        Liminality.LOGGER.info("[Liminality] Registering item groups");
    }
}

