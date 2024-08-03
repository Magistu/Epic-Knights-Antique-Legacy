package com.magistuarmory.antiquelegacy.client.render.model.shield;

import com.magistuarmory.client.render.model.item.MedievalShieldModel;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@Environment(EnvType.CLIENT)
public class HoplonModel extends MedievalShieldModel
{
	public HoplonModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		partdefinition.addOrReplaceChild("plate", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -7.0F, -2.0F, 14.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(-9.0F, -9.0F, 0.0F, 18.0F, 18.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(1, 0).mirror().addBox(-5.0F, -7.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(4, 12).addBox(-5.0F, 5.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F))
				.texOffs(46, 0).addBox(-7.0F, -7.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 4).addBox(-7.0F, -5.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F))
				.texOffs(0, 12).addBox(-7.0F, 4.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F))
				.texOffs(9, 2).mirror().addBox(5.0F, -5.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(8, 0).addBox(3.0F, -7.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F))
				.texOffs(8, 12).addBox(3.0F, 5.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F))
				.texOffs(12, 12).addBox(5.0F, 3.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F))
				.texOffs(46, 3).addBox(5.0F, 5.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 58).addBox(-5.0F, 7.0F, 0.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 6).addBox(7.0F, -5.0F, 0.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 6).addBox(-9.0F, -5.0F, 0.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 61).addBox(-5.0F, -9.0F, 0.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 3).addBox(-7.0F, 5.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 0).addBox(5.0F, -7.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		partdefinition.addOrReplaceChild("handle", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}