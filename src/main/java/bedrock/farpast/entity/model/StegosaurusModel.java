package bedrock.farpast.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import bedrock.farpast.entity.StegosaurusEntity;

public class StegosaurusModel extends GeoModel<StegosaurusEntity> {
	@Override
	public ResourceLocation getAnimationResource(StegosaurusEntity entity) {
		return new ResourceLocation("far_past", "animations/pa_stegosauruss.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StegosaurusEntity entity) {
		return new ResourceLocation("far_past", "geo/pa_stegosauruss.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StegosaurusEntity entity) {
		return new ResourceLocation("far_past", "textures/entities/" + entity.getTexture() + ".png");
	}

}
