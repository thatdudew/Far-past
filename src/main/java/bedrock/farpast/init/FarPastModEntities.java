
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package bedrock.farpast.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import bedrock.farpast.entity.TylosaurEntity;
import bedrock.farpast.entity.TriceraEntity;
import bedrock.farpast.entity.TrexEntity;
import bedrock.farpast.entity.StegosaurusEntity;
import bedrock.farpast.entity.SpinyEntity;
import bedrock.farpast.entity.OuranoEntity;
import bedrock.farpast.entity.LampeoEntity;
import bedrock.farpast.entity.HadroEntity;
import bedrock.farpast.entity.BracheoEntity;
import bedrock.farpast.entity.AugustolophusEntity;
import bedrock.farpast.entity.AnkyloEntity;
import bedrock.farpast.FarPastMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FarPastModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FarPastMod.MODID);
	public static final RegistryObject<EntityType<SpinyEntity>> SPINY = register("spiny",
			EntityType.Builder.<SpinyEntity>of(SpinyEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpinyEntity::new)

					.sized(2f, 3f));
	public static final RegistryObject<EntityType<AnkyloEntity>> ANKYLO = register("ankylo",
			EntityType.Builder.<AnkyloEntity>of(AnkyloEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AnkyloEntity::new)

					.sized(2f, 2f));
	public static final RegistryObject<EntityType<AugustolophusEntity>> AUGUSTOLOPHUS = register("augustolophus",
			EntityType.Builder.<AugustolophusEntity>of(AugustolophusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AugustolophusEntity::new)

					.sized(2f, 2.5f));
	public static final RegistryObject<EntityType<BracheoEntity>> BRACHEO = register("bracheo",
			EntityType.Builder.<BracheoEntity>of(BracheoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BracheoEntity::new)

					.sized(4f, 6f));
	public static final RegistryObject<EntityType<HadroEntity>> HADRO = register("hadro",
			EntityType.Builder.<HadroEntity>of(HadroEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HadroEntity::new)

					.sized(2f, 2.5f));
	public static final RegistryObject<EntityType<LampeoEntity>> LAMPEO = register("lampeo",
			EntityType.Builder.<LampeoEntity>of(LampeoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LampeoEntity::new)

					.sized(2f, 2.5f));
	public static final RegistryObject<EntityType<OuranoEntity>> OURANO = register("ourano",
			EntityType.Builder.<OuranoEntity>of(OuranoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OuranoEntity::new)

					.sized(2f, 2.5f));
	public static final RegistryObject<EntityType<StegosaurusEntity>> STEGOSAURUS = register("stegosaurus",
			EntityType.Builder.<StegosaurusEntity>of(StegosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StegosaurusEntity::new)

					.sized(2f, 2.5f));
	public static final RegistryObject<EntityType<TrexEntity>> TREX = register("trex",
			EntityType.Builder.<TrexEntity>of(TrexEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TrexEntity::new)

					.sized(3f, 5f));
	public static final RegistryObject<EntityType<TriceraEntity>> TRICERA = register("tricera",
			EntityType.Builder.<TriceraEntity>of(TriceraEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TriceraEntity::new)

					.sized(2f, 2.5f));
	public static final RegistryObject<EntityType<TylosaurEntity>> TYLOSAUR = register("tylosaur",
			EntityType.Builder.<TylosaurEntity>of(TylosaurEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TylosaurEntity::new)

					.sized(1.5f, 1.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SpinyEntity.init();
			AnkyloEntity.init();
			AugustolophusEntity.init();
			BracheoEntity.init();
			HadroEntity.init();
			LampeoEntity.init();
			OuranoEntity.init();
			StegosaurusEntity.init();
			TrexEntity.init();
			TriceraEntity.init();
			TylosaurEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SPINY.get(), SpinyEntity.createAttributes().build());
		event.put(ANKYLO.get(), AnkyloEntity.createAttributes().build());
		event.put(AUGUSTOLOPHUS.get(), AugustolophusEntity.createAttributes().build());
		event.put(BRACHEO.get(), BracheoEntity.createAttributes().build());
		event.put(HADRO.get(), HadroEntity.createAttributes().build());
		event.put(LAMPEO.get(), LampeoEntity.createAttributes().build());
		event.put(OURANO.get(), OuranoEntity.createAttributes().build());
		event.put(STEGOSAURUS.get(), StegosaurusEntity.createAttributes().build());
		event.put(TREX.get(), TrexEntity.createAttributes().build());
		event.put(TRICERA.get(), TriceraEntity.createAttributes().build());
		event.put(TYLOSAUR.get(), TylosaurEntity.createAttributes().build());
	}
}
