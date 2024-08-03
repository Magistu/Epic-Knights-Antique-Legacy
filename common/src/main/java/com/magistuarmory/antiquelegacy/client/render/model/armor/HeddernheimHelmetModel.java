package com.magistuarmory.antiquelegacy.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;


public class HeddernheimHelmetModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(34, 38).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.6F))
		.texOffs(48, 0).addBox(-4.0F, -9.0F, -11.2F, 8.0F, 9.0F, 6.0F, new CubeDeformation(0.6F))
		.texOffs(0, 0).addBox(-0.5F, -13.6F, -1.4F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(36, 0).addBox(-0.5F, -9.6F, 4.6F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(40, 7).addBox(-0.5F, -12.6F, 2.6F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.5F, -11.6F, 4.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 38).addBox(-0.5F, -14.6F, -3.4F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.0F, 1.4F, 1.95F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.8F))
		.texOffs(34, 0).addBox(0.0F, -21.5F, -4.4F, 0.0F, 21.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).mirror().addBox(0.5F, -21.5F, -4.4F, 0.0F, 21.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).addBox(-0.5F, -21.5F, -4.4F, 0.0F, 21.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);
		return LayerDefinition.create(meshdefinition, 128, 128);
	}
}