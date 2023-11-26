package ijex.liminality.block;

import ijex.liminality.Liminality;
import ijex.liminality.block.custom.DustBlock;
import ijex.liminality.block.custom.FluorescentLightBlock;
import ijex.liminality.block.custom.GlowOrbBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks extends FabricBlockSettings{

    public static final Block TILE = registerBlock("tile",
            new Block(FabricBlockSettings.create()
                    .mapColor(MapColor.GRAY)
                    .sounds(BlockSoundGroup.STONE)
                    .dropsNothing()
                    .strength(-1.0f, 3600000.0f)));

    public static final Block CARPET = registerBlock("carpet",
            new Block(FabricBlockSettings.create()
                    .mapColor(MapColor.GRAY)
                    .sounds(BlockSoundGroup.WOOL)
                    .dropsNothing()
                    .strength(-1.0f, 3600000.0f)));

    public static final Block PLASTER = registerBlock("plaster",
            new Block(FabricBlockSettings.create()
                    .mapColor(MapColor.GRAY)
                    .sounds(BlockSoundGroup.WOOD)
                    .dropsNothing()
                    .strength(-1.0f, 3600000.0f)));

    public static final Block BASEBOARD_PLASTER = registerBlock("baseboard_plaster",
            new Block(FabricBlockSettings.create()
                    .mapColor(MapColor.GRAY)
                    .sounds(BlockSoundGroup.WOOD)
                    .dropsNothing()
                    .strength(-1.0f, 3600000.0f)));

    public static final Block PLASTER_STAIRS = registerBlock("plaster_stairs",
            new StairsBlock(ModBlocks.PLASTER.getDefaultState(), FabricBlockSettings.create()
                    .mapColor(MapColor.GRAY)
                    .sounds(BlockSoundGroup.WOOD)
                    .dropsNothing()
                    .strength(-1.0f, 3600000.0f)));

    public static final Block CEILING_TILE = registerBlock("ceiling_tile",
            new Block(FabricBlockSettings.create()
                    .mapColor(MapColor.GRAY)
                    .sounds(BlockSoundGroup.WOOD)
                    .dropsNothing()
                    .strength(-1.0f, 3600000.0f)));

    public static final Block FLUORESCENT_LIGHT = registerBlock("fluorescent_light",
            new FluorescentLightBlock(FabricBlockSettings.create()
                    .mapColor(MapColor.GRAY)
                    .sounds(BlockSoundGroup.GLASS)
                    .strength(-1.0f, 3600000.0f)
                    .dropsNothing()
                    .luminance(state -> state.get(FluorescentLightBlock.LIT) ? 15 : 0)));

    public static final Block FIELDS_PORTAL_FRAME = registerBlock("fields_portal_frame",
            new Block(FabricBlockSettings.create()
                    .mapColor(MapColor.GRAY)
                    .sounds(BlockSoundGroup.STONE)
                    .strength(-1.0f, 3600000.0f)
                    .dropsNothing()
                    .luminance(7)));

    public static final Block THLASSHOPHOBIA_PORTAL_FRAME = registerBlock("thlassophobia_portal_frame",
            new Block(FabricBlockSettings.create()
                    .mapColor(MapColor.WATER_BLUE)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)
                    .strength(-1.0f, 3600000.0f)
                    .dropsNothing()
                    .luminance(7)));

    public static final Block DUST = registerBlock("dust",
            new DustBlock(FabricBlockSettings.create()
                    .mapColor(MapColor.GRAY)
                    .sounds(BlockSoundGroup.WOOL)
                    .breakInstantly()
                    .dropsNothing()
                    .noCollision()
                    .nonOpaque()));

    public static final Block GLOW_ORB = registerBlock("glow_orb",
            new GlowOrbBlock(FabricBlockSettings.create()
                    .mapColor(MapColor.WHITE)
                    .luminance(7)
                    .breakInstantly()
                    .nonOpaque()
                    .collidable(true)));



    private static Block registerBlock(String name, Block block) {
        registerBlocKItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Liminality.MOD_ID, name), block);
    }

    private static Item registerBlocKItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Liminality.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void init() {
        Liminality.LOGGER.info("[Liminality] Registering blocks");
    }
}
