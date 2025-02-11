package bedrock.farpast.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import bedrock.farpast.entity.SpinyEntity;

public class SpinyModel extends GeoModel<SpinyEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpinyEntity entity) {
		return ResourceLocation.parse("far_past:animations/pa_spiny.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpinyEntity entity) {
		return ResourceLocation.parse("far_past:geo/pa_spiny.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpinyEntity entity) {
		return ResourceLocation.parse("far_past:textures/entities/" + entity.getTexture() + ".png");
	}

}
