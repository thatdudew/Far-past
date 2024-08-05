package bedrock.farpast.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import bedrock.farpast.entity.TriceraEntity;

public class TriceraModel extends GeoModel<TriceraEntity> {
	@Override
	public ResourceLocation getAnimationResource(TriceraEntity entity) {
		return new ResourceLocation("far_past", "animations/pa_tricer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TriceraEntity entity) {
		return new ResourceLocation("far_past", "geo/pa_tricer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TriceraEntity entity) {
		return new ResourceLocation("far_past", "textures/entities/" + entity.getTexture() + ".png");
	}

}
