package com.magistuarmory.antiquelegacy.client.render.model.decoration;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class GreekHighCrestModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 14).addBox(0.6F, -21.9F, -3.0F, 0.0F, 14.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-1.0F, -17.9F, -2.1F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(-0.6F, -21.9F, -3.0F, 0.0F, 14.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(14, 0).addBox(-1.0F, -16.9F, 1.9F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(20, 6).addBox(-0.5F, -15.9F, 0.9F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, -21.9F, -3.0F, 0.0F, 14.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 7).addBox(-0.5F, -15.9F, -1.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);
		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}