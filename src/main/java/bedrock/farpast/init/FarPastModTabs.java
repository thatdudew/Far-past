
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package bedrock.farpast.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import bedrock.farpast.FarPastMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class FarPastModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FarPastMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(FarPastModItems.SPINY_SPAWN_EGG.get());
			tabData.accept(FarPastModItems.ANKYLO_SPAWN_EGG.get());
			tabData.accept(FarPastModItems.AUGUSTOLOPHUS_SPAWN_EGG.get());
			tabData.accept(FarPastModItems.BRACHEO_SPAWN_EGG.get());
			tabData.accept(FarPastModItems.HADRO_SPAWN_EGG.get());
			tabData.accept(FarPastModItems.LAMPEO_SPAWN_EGG.get());
			tabData.accept(FarPastModItems.OURANO_SPAWN_EGG.get());
			tabData.accept(FarPastModItems.STEGOSAURUS_SPAWN_EGG.get());
			tabData.accept(FarPastModItems.TREX_SPAWN_EGG.get());
			tabData.accept(FarPastModItems.TRICERA_SPAWN_EGG.get());
			tabData.accept(FarPastModItems.TYLOSAUR_SPAWN_EGG.get());
		}
	}
}
