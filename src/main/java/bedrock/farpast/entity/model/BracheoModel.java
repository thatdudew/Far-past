package bedrock.farpast.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import bedrock.farpast.entity.BracheoEntity;

public class BracheoModel extends GeoModel<BracheoEntity> {
	@Override
	public ResourceLocation getAnimationResource(BracheoEntity entity) {
		return ResourceLocation.parse("far_past:animations/bracheo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BracheoEntity entity) {
		return ResourceLocation.parse("far_past:geo/bracheo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BracheoEntity entity) {
		return ResourceLocation.parse("far_past:textures/entities/" + entity.getTexture() + ".png");
	}

}
