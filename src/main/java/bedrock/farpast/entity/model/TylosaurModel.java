package bedrock.farpast.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import bedrock.farpast.entity.TylosaurEntity;

public class TylosaurModel extends GeoModel<TylosaurEntity> {
	@Override
	public ResourceLocation getAnimationResource(TylosaurEntity entity) {
		return ResourceLocation.parse("far_past:animations/pa_tylosau.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TylosaurEntity entity) {
		return ResourceLocation.parse("far_past:geo/pa_tylosau.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TylosaurEntity entity) {
		return ResourceLocation.parse("far_past:textures/entities/" + entity.getTexture() + ".png");
	}

}
