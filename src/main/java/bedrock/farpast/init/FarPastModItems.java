
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package bedrock.farpast.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.item.Item;

import bedrock.farpast.FarPastMod;

public class FarPastModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(FarPastMod.MODID);
	public static final DeferredItem<Item> SPINY_SPAWN_EGG = REGISTRY.register("spiny_spawn_egg", () -> new DeferredSpawnEggItem(FarPastModEntities.SPINY, -13421824, -16777216, new Item.Properties()));
	public static final DeferredItem<Item> ANKYLO_SPAWN_EGG = REGISTRY.register("ankylo_spawn_egg", () -> new DeferredSpawnEggItem(FarPastModEntities.ANKYLO, -3407872, -6737152, new Item.Properties()));
	public static final DeferredItem<Item> AUGUSTOLOPHUS_SPAWN_EGG = REGISTRY.register("augustolophus_spawn_egg", () -> new DeferredSpawnEggItem(FarPastModEntities.AUGUSTOLOPHUS, -16750951, -1, new Item.Properties()));
	public static final DeferredItem<Item> BRACHEO_SPAWN_EGG = REGISTRY.register("bracheo_spawn_egg", () -> new DeferredSpawnEggItem(FarPastModEntities.BRACHEO, -256, -3355648, new Item.Properties()));
	public static final DeferredItem<Item> HADRO_SPAWN_EGG = REGISTRY.register("hadro_spawn_egg", () -> new DeferredSpawnEggItem(FarPastModEntities.HADRO, -26113, -1, new Item.Properties()));
	public static final DeferredItem<Item> LAMPEO_SPAWN_EGG = REGISTRY.register("lampeo_spawn_egg", () -> new DeferredSpawnEggItem(FarPastModEntities.LAMPEO, -6750055, -16777216, new Item.Properties()));
	public static final DeferredItem<Item> OURANO_SPAWN_EGG = REGISTRY.register("ourano_spawn_egg", () -> new DeferredSpawnEggItem(FarPastModEntities.OURANO, -10092442, -256, new Item.Properties()));
	public static final DeferredItem<Item> STEGOSAURUS_SPAWN_EGG = REGISTRY.register("stegosaurus_spawn_egg", () -> new DeferredSpawnEggItem(FarPastModEntities.STEGOSAURUS, -13421824, -3381760, new Item.Properties()));
	public static final DeferredItem<Item> TREX_SPAWN_EGG = REGISTRY.register("trex_spawn_egg", () -> new DeferredSpawnEggItem(FarPastModEntities.TREX, -13421773, -10066330, new Item.Properties()));
	public static final DeferredItem<Item> TRICERA_SPAWN_EGG = REGISTRY.register("tricera_spawn_egg", () -> new DeferredSpawnEggItem(FarPastModEntities.TRICERA, -16737844, -16750900, new Item.Properties()));
	public static final DeferredItem<Item> TYLOSAUR_SPAWN_EGG = REGISTRY.register("tylosaur_spawn_egg", () -> new DeferredSpawnEggItem(FarPastModEntities.TYLOSAUR, -16750951, -16737895, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
