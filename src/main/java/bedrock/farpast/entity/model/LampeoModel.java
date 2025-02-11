package bedrock.farpast.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import bedrock.farpast.entity.LampeoEntity;

public class LampeoModel extends GeoModel<LampeoEntity> {
	@Override
	public ResourceLocation getAnimationResource(LampeoEntity entity) {
		return ResourceLocation.parse("far_past:animations/lampeo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LampeoEntity entity) {
		return ResourceLocation.parse("far_past:geo/lampeo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LampeoEntity entity) {
		return ResourceLocation.parse("far_past:textures/entities/" + entity.getTexture() + ".png");
	}

}
