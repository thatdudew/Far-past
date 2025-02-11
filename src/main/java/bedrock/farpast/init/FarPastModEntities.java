
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package bedrock.farpast.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

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

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class FarPastModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, FarPastMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<SpinyEntity>> SPINY = register("spiny",
			EntityType.Builder.<SpinyEntity>of(SpinyEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 3f));
	public static final DeferredHolder<EntityType<?>, EntityType<AnkyloEntity>> ANKYLO = register("ankylo",
			EntityType.Builder.<AnkyloEntity>of(AnkyloEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<AugustolophusEntity>> AUGUSTOLOPHUS = register("augustolophus",
			EntityType.Builder.<AugustolophusEntity>of(AugustolophusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BracheoEntity>> BRACHEO = register("bracheo",
			EntityType.Builder.<BracheoEntity>of(BracheoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(4f, 6f));
	public static final DeferredHolder<EntityType<?>, EntityType<HadroEntity>> HADRO = register("hadro",
			EntityType.Builder.<HadroEntity>of(HadroEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<LampeoEntity>> LAMPEO = register("lampeo",
			EntityType.Builder.<LampeoEntity>of(LampeoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<OuranoEntity>> OURANO = register("ourano",
			EntityType.Builder.<OuranoEntity>of(OuranoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<StegosaurusEntity>> STEGOSAURUS = register("stegosaurus",
			EntityType.Builder.<StegosaurusEntity>of(StegosaurusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<TrexEntity>> TREX = register("trex",
			EntityType.Builder.<TrexEntity>of(TrexEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(3f, 5f));
	public static final DeferredHolder<EntityType<?>, EntityType<TriceraEntity>> TRICERA = register("tricera",
			EntityType.Builder.<TriceraEntity>of(TriceraEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<TylosaurEntity>> TYLOSAUR = register("tylosaur",
			EntityType.Builder.<TylosaurEntity>of(TylosaurEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.5f, 1.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		SpinyEntity.init(event);
		AnkyloEntity.init(event);
		AugustolophusEntity.init(event);
		BracheoEntity.init(event);
		HadroEntity.init(event);
		LampeoEntity.init(event);
		OuranoEntity.init(event);
		StegosaurusEntity.init(event);
		TrexEntity.init(event);
		TriceraEntity.init(event);
		TylosaurEntity.init(event);
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
