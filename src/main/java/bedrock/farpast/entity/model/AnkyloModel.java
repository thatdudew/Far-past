package bedrock.farpast.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import bedrock.farpast.entity.AnkyloEntity;

public class AnkyloModel extends GeoModel<AnkyloEntity> {
	@Override
	public ResourceLocation getAnimationResource(AnkyloEntity entity) {
		return ResourceLocation.parse("far_past:animations/ankylo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AnkyloEntity entity) {
		return ResourceLocation.parse("far_past:geo/ankylo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AnkyloEntity entity) {
		return ResourceLocation.parse("far_past:textures/entities/" + entity.getTexture() + ".png");
	}

}
