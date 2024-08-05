
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package bedrock.farpast.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import bedrock.farpast.FarPastMod;

public class FarPastModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FarPastMod.MODID);
	public static final RegistryObject<Item> SPINY_SPAWN_EGG = REGISTRY.register("spiny_spawn_egg", () -> new ForgeSpawnEggItem(FarPastModEntities.SPINY, -13421824, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> ANKYLO_SPAWN_EGG = REGISTRY.register("ankylo_spawn_egg", () -> new ForgeSpawnEggItem(FarPastModEntities.ANKYLO, -3407872, -6737152, new Item.Properties()));
	public static final RegistryObject<Item> AUGUSTOLOPHUS_SPAWN_EGG = REGISTRY.register("augustolophus_spawn_egg", () -> new ForgeSpawnEggItem(FarPastModEntities.AUGUSTOLOPHUS, -16750951, -1, new Item.Properties()));
	public static final RegistryObject<Item> BRACHEO_SPAWN_EGG = REGISTRY.register("bracheo_spawn_egg", () -> new ForgeSpawnEggItem(FarPastModEntities.BRACHEO, -256, -3355648, new Item.Properties()));
	public static final RegistryObject<Item> HADRO_SPAWN_EGG = REGISTRY.register("hadro_spawn_egg", () -> new ForgeSpawnEggItem(FarPastModEntities.HADRO, -26113, -1, new Item.Properties()));
	public static final RegistryObject<Item> LAMPEO_SPAWN_EGG = REGISTRY.register("lampeo_spawn_egg", () -> new ForgeSpawnEggItem(FarPastModEntities.LAMPEO, -6750055, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> OURANO_SPAWN_EGG = REGISTRY.register("ourano_spawn_egg", () -> new ForgeSpawnEggItem(FarPastModEntities.OURANO, -10092442, -256, new Item.Properties()));
	public static final RegistryObject<Item> STEGOSAURUS_SPAWN_EGG = REGISTRY.register("stegosaurus_spawn_egg", () -> new ForgeSpawnEggItem(FarPastModEntities.STEGOSAURUS, -13421824, -3381760, new Item.Properties()));
	public static final RegistryObject<Item> TREX_SPAWN_EGG = REGISTRY.register("trex_spawn_egg", () -> new ForgeSpawnEggItem(FarPastModEntities.TREX, -13421773, -10066330, new Item.Properties()));
	public static final RegistryObject<Item> TRICERA_SPAWN_EGG = REGISTRY.register("tricera_spawn_egg", () -> new ForgeSpawnEggItem(FarPastModEntities.TRICERA, -16737844, -16750900, new Item.Properties()));
	public static final RegistryObject<Item> TYLOSAUR_SPAWN_EGG = REGISTRY.register("tylosaur_spawn_egg", () -> new ForgeSpawnEggItem(FarPastModEntities.TYLOSAUR, -16750951, -16737895, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
