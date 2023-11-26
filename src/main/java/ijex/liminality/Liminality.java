package ijex.liminality;

import ijex.liminality.block.ModBlocks;
import ijex.liminality.block.entity.ModBlockEntities;
import ijex.liminality.item.ModItemGroups;
import ijex.liminality.item.ModItems;
import ijex.liminality.portals.ModPortals;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Liminality implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger(Liminality.MOD_ID);

	public static final String MOD_ID = "liminality";

	@Override
	public void onInitialize() {
		ModItems.init();
		ModBlocks.init();
		ModItemGroups.init();
		ModPortals.init();
		ModBlockEntities.init();
	}
}