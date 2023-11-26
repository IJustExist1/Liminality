package ijex.liminality.block.entity;

import ijex.liminality.Liminality;
import ijex.liminality.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<GlowOrbBlockEntity> GLOW_ORB_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
            new Identifier(Liminality.MOD_ID, "glow_orb_be"), FabricBlockEntityTypeBuilder.create(GlowOrbBlockEntity::new, ModBlocks.GLOW_ORB).build());

    public static final BlockEntityType<DustBlockEntity> DUST_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
            new Identifier(Liminality.MOD_ID, "dust_be"),
            FabricBlockEntityTypeBuilder.create(DustBlockEntity::new, ModBlocks.DUST).build());

    public static void init() {
        Liminality.LOGGER.info("[Liminality] Registering block entities");
    }
}
