package com.aqupd.caracal;

import com.aqupd.caracal.client.model.CaracalEntityModel;
import com.aqupd.caracal.client.renderer.CaracalEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;

@Environment(EnvType.CLIENT)
public class CaracalMainClient implements ClientModInitializer {

  public static final EntityModelLayer CARACAL_MODEL_LAYER = new EntityModelLayer(
    CaracalMain.CARACAL_ID,
    "main"
  );

  @Override
  public void onInitializeClient() {
    EntityModelLayerRegistry.registerModelLayer(
      CARACAL_MODEL_LAYER,
      CaracalEntityModel::getTexturedModelData
    );
    //Register the renderer
    EntityRendererRegistry.register(
      CaracalMain.CARACAL,
      CaracalEntityRenderer::new
    );
  }
}
