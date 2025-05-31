package net.marshmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;

public class TerranceModel {

    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "terry"), "main");
    private final ModelPart terry;
    private final ModelPart legs;
    private final ModelPart left;
    private final ModelPart sole;
    private final ModelPart right;
    private final ModelPart sole2;
    private final ModelPart body;
    private final ModelPart eyes;
    private final ModelPart right2;
    private final ModelPart left2;
    private final ModelPart hat;
    private final ModelPart rim;

    public terry(ModelPart root) {
        this.terry = root.getChild("terry");
        this.legs = this.terry.getChild("legs");
        this.left = this.legs.getChild("left");
        this.sole = this.left.getChild("sole");
        this.right = this.legs.getChild("right");
        this.sole2 = this.right.getChild("sole2");
        this.body = this.terry.getChild("body");
        this.eyes = this.body.getChild("eyes");
        this.right2 = this.eyes.getChild("right2");
        this.left2 = this.eyes.getChild("left2");
        this.hat = this.body.getChild("hat");
        this.rim = this.hat.getChild("rim");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition terry = partdefinition.addOrReplaceChild("terry", CubeListBuilder.create(), PartPose.offset(0.0F, 20.0F, 0.0F));

        PartDefinition legs = terry.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.25F));

        PartDefinition left = legs.addOrReplaceChild("left", CubeListBuilder.create().texOffs(36, 41).addBox(-1.0F, -0.25F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offset(-2.0F, 0.25F, 0.0F));

        PartDefinition sole = left.addOrReplaceChild("sole", CubeListBuilder.create().texOffs(40, 17).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.75F, 0.0F));

        PartDefinition right = legs.addOrReplaceChild("right", CubeListBuilder.create().texOffs(44, 41).addBox(-1.0F, -0.25F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offset(2.0F, 0.25F, 0.0F));

        PartDefinition sole2 = right.addOrReplaceChild("sole2", CubeListBuilder.create().texOffs(40, 23).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.75F, 0.0F));

        PartDefinition body = terry.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 17).addBox(-5.5F, -7.5F, -4.5F, 11.0F, 8.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(0, 34).addBox(-5.0F, -7.0F, -4.0F, 10.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition eyes = body.addOrReplaceChild("eyes", CubeListBuilder.create(), PartPose.offset(0.0F, -3.5F, -0.75F));

        PartDefinition right2 = eyes.addOrReplaceChild("right2", CubeListBuilder.create().texOffs(46, 0).addBox(-1.25F, -2.5F, -4.0F, 2.5F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 0.5F, 0.0F));

        PartDefinition left2 = eyes.addOrReplaceChild("left2", CubeListBuilder.create().texOffs(40, 29).addBox(-1.25F, -2.5F, -4.0F, 2.5F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 0.5F, 0.0F));

        PartDefinition hat = body.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -5.5F, -5.5F, 12.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.5F, 0.0F));

        PartDefinition rim = hat.addOrReplaceChild("rim", CubeListBuilder.create().texOffs(36, 39).addBox(-5.0F, -0.5F, -5.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 34).addBox(-6.0F, -0.5F, -4.0F, 12.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -5.5F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        terry.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
}
