package com.magistuarmory.antiquelegacy.client.render.model.decoration;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class GreekCrestModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, -16.575F, -5.45F, 0.0F, 17.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.6F, -16.575F, -5.45F, 0.0F, 17.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.6F, -16.575F, -5.45F, 0.0F, 17.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.0F, -11.575F, -3.45F, 2.0F, 3.0F, 8.0F, new CubeDeformation(-0.0001F))
				.texOffs(0, 0).addBox(-1.0F, -9.575F, 4.55F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.0001F))
				.texOffs(0, 11).addBox(-1.0F, -10.575F, 4.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.0001F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);
		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}