package ijex.liminality.datagen;

import ijex.liminality.block.ModBlocks;
import ijex.liminality.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.item.ArmorItem;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
//        BlockStateModelGenerator.BlockTexturePool plasterPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PLASTER);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TILE);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CARPET);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLASTER);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CEILING_TILE);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BASEBOARD_PLASTER);
//        plasterPool.stairs(ModBlocks.PLASTER_STAIRS);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.THLASSHOPHOBIA_PORTAL_FRAME);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FIELDS_PORTAL_FRAME);
//        blockStateModelGenerator.registerSimpleState(ModBlocks.GLOW_ORB);
        blockStateModelGenerator.registerSimpleState(ModBlocks.DUST);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
//        itemModelGenerator.registerArmor((ArmorItem)ModItems.DIVNG_HELMET);
//        itemModelGenerator.registerArmor((ArmorItem)ModItems.DIVING_CHESTPLATE);
//        itemModelGenerator.registerArmor((ArmorItem)ModItems.DIVING_LEGGINGS);
//        itemModelGenerator.registerArmor((ArmorItem)ModItems.DIVING_BOOTS);
    }
}
