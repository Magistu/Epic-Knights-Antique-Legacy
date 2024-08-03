package com.magistuarmory.antiquelegacy.client.render.model.shield;

import com.magistuarmory.client.render.model.item.MedievalShieldModel;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@Environment(EnvType.CLIENT)
public class ImperialScutumModel extends MedievalShieldModel
{
	public ImperialScutumModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition plate = partdefinition.addOrReplaceChild("plate", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -10.5F, -1.0F, 7.0F, 21.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 0).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = plate.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(31, 22).addBox(-6.5F, -16.0F, -1.0F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 22).addBox(-5.5F, -20.0F, -1.0F, 3.0F, 21.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 0).addBox(-6.5F, -20.0F, -1.0F, 4.0F, 21.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9079F, 9.5F, -1.7286F, 0.0F, 0.6545F, 0.0F));

		PartDefinition cube_r2 = plate.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(27, 0).addBox(5.5F, -16.0F, -1.0F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 22).addBox(2.5F, -20.0F, -1.0F, 3.0F, 21.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 22).addBox(2.5F, -20.0F, -1.0F, 4.0F, 21.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9079F, 9.5F, -1.7286F, 0.0F, -0.6545F, 0.0F));

		PartDefinition handle = partdefinition.addOrReplaceChild("handle", CubeListBuilder.create().texOffs(46, 0).addBox(-3.0F, -0.5F, 0.0F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}