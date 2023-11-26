package ijex.liminality.item;

import ijex.liminality.Liminality;
import ijex.liminality.item.custom.DivingArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DIVNG_HELMET = registerItem("diving_helmet",
            new DivingArmorItem(ModArmorMaterials.DIVING, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item DIVING_CHESTPLATE = registerItem("diving_chestplate",
            new DivingArmorItem(ModArmorMaterials.DIVING, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item DIVING_LEGGINGS = registerItem("diving_leggings",
            new DivingArmorItem(ModArmorMaterials.DIVING, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item DIVING_BOOTS = registerItem("diving_boots",
            new DivingArmorItem(ModArmorMaterials.DIVING, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Liminality.MOD_ID, id), item);
    }

    public static void init() {
        Liminality.LOGGER.info("[Liminality] Registering items");
    }
}
