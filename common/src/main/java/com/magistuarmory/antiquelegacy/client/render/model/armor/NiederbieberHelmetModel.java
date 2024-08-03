package com.magistuarmory.antiquelegacy.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;


public class NiederbieberHelmetModel {
	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(24, 22).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.6F))
		.texOffs(24, 14).addBox(-5.0F, -6.3F, -7.75F, 10.0F, 1.0F, 5.0F, new CubeDeformation(0.7F))
		.texOffs(22, 38).addBox(0.7F, -11.3F, -5.0F, 1.0F, 10.0F, 10.0F, new CubeDeformation(0.7F))
		.texOffs(0, 0).addBox(-6.0F, -0.8F, 0.9F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.9F))
		.texOffs(38, 59).addBox(-5.5F, -5.0F, -2.15F, 11.0F, 3.0F, 2.0F, new CubeDeformation(0.17F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 30).addBox(0.7F, -10.3F, -5.0F, 1.0F, 10.0F, 10.0F, new CubeDeformation(0.7F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);
		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}