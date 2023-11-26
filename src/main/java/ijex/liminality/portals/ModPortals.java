package ijex.liminality.portals;

import ijex.liminality.Liminality;
import ijex.liminality.block.ModBlocks;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModPortals {
    public static void init() {
        Liminality.LOGGER.info("[Liminality] Registering portals");

        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.FIELDS_PORTAL_FRAME)
                .lightWithItem(Items.GHAST_TEAR)
                .destDimID(new Identifier("liminality:the_fields"))
                .tintColor(255, 255, 255)
                .flatPortal()
                .registerPortal();

        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.THLASSHOPHOBIA_PORTAL_FRAME)
                .lightWithItem(Items.GHAST_TEAR)
                .destDimID(new Identifier("liminality:thalassophobia"))
                .tintColor(13, 71, 161)
                .registerPortal();
    }
}
