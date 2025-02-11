
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package bedrock.farpast.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import bedrock.farpast.client.renderer.TylosaurRenderer;
import bedrock.farpast.client.renderer.TriceraRenderer;
import bedrock.farpast.client.renderer.TrexRenderer;
import bedrock.farpast.client.renderer.StegosaurusRenderer;
import bedrock.farpast.client.renderer.SpinyRenderer;
import bedrock.farpast.client.renderer.OuranoRenderer;
import bedrock.farpast.client.renderer.LampeoRenderer;
import bedrock.farpast.client.renderer.HadroRenderer;
import bedrock.farpast.client.renderer.BracheoRenderer;
import bedrock.farpast.client.renderer.AugustolophusRenderer;
import bedrock.farpast.client.renderer.AnkyloRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FarPastModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FarPastModEntities.SPINY.get(), SpinyRenderer::new);
		event.registerEntityRenderer(FarPastModEntities.ANKYLO.get(), AnkyloRenderer::new);
		event.registerEntityRenderer(FarPastModEntities.AUGUSTOLOPHUS.get(), AugustolophusRenderer::new);
		event.registerEntityRenderer(FarPastModEntities.BRACHEO.get(), BracheoRenderer::new);
		event.registerEntityRenderer(FarPastModEntities.HADRO.get(), HadroRenderer::new);
		event.registerEntityRenderer(FarPastModEntities.LAMPEO.get(), LampeoRenderer::new);
		event.registerEntityRenderer(FarPastModEntities.OURANO.get(), OuranoRenderer::new);
		event.registerEntityRenderer(FarPastModEntities.STEGOSAURUS.get(), StegosaurusRenderer::new);
		event.registerEntityRenderer(FarPastModEntities.TREX.get(), TrexRenderer::new);
		event.registerEntityRenderer(FarPastModEntities.TRICERA.get(), TriceraRenderer::new);
		event.registerEntityRenderer(FarPastModEntities.TYLOSAUR.get(), TylosaurRenderer::new);
	}
}
