.class public final Ll/֨᩻֫;
.super Landroid/view/animation/AnimationSet;
.source "G1H1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ۗ:Z

.field public final ۙ:Landroid/view/ViewGroup;

.field public ᩶:Z

.field public ᩸:Z

.field public final ᩹:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    .line 215
    invoke-direct {p0, v0}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    const/4 v0, 0x1

    .line 211
    iput-boolean v0, p0, Ll/֨᩻֫;->᩸:Z

    .line 216
    iput-object p2, p0, Ll/֨᩻֫;->ۙ:Landroid/view/ViewGroup;

    .line 217
    iput-object p3, p0, Ll/֨᩻֫;->᩹:Landroid/view/View;

    .line 218
    invoke-virtual {p0, p1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 221
    invoke-virtual {p2, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public final getTransformation(JLandroid/view/animation/Transformation;)Z
    .locals 2

    const/4 v0, 0x1

    .line 226
    iput-boolean v0, p0, Ll/֨᩻֫;->᩸:Z

    .line 227
    iget-boolean v1, p0, Ll/֨᩻֫;->᩶:Z

    if-eqz v1, :cond_0

    .line 228
    iget-boolean p1, p0, Ll/֨᩻֫;->ۗ:Z

    xor-int/2addr p1, v0

    return p1

    .line 230
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/animation/AnimationSet;->getTransformation(JLandroid/view/animation/Transformation;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 232
    iput-boolean v0, p0, Ll/֨᩻֫;->᩶:Z

    .line 233
    iget-object p1, p0, Ll/֨᩻֫;->ۙ:Landroid/view/ViewGroup;

    invoke-static {p1, p0}, Ll/ܳۨ;->֫(Landroid/view/View;Ljava/lang/Runnable;)V

    :cond_1
    return v0
.end method

.method public final getTransformation(JLandroid/view/animation/Transformation;F)Z
    .locals 2

    const/4 v0, 0x1

    .line 241
    iput-boolean v0, p0, Ll/֨᩻֫;->᩸:Z

    .line 242
    iget-boolean v1, p0, Ll/֨᩻֫;->᩶:Z

    if-eqz v1, :cond_0

    .line 243
    iget-boolean p1, p0, Ll/֨᩻֫;->ۗ:Z

    xor-int/2addr p1, v0

    return p1

    .line 245
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/animation/AnimationSet;->getTransformation(JLandroid/view/animation/Transformation;F)Z

    move-result p1

    if-nez p1, :cond_1

    .line 247
    iput-boolean v0, p0, Ll/֨᩻֫;->᩶:Z

    .line 248
    iget-object p1, p0, Ll/֨᩻֫;->ۙ:Landroid/view/ViewGroup;

    invoke-static {p1, p0}, Ll/ܳۨ;->֫(Landroid/view/View;Ljava/lang/Runnable;)V

    :cond_1
    return v0
.end method

.method public final run()V
    .locals 2

    .line 255
    iget-boolean v0, p0, Ll/֨᩻֫;->᩶:Z

    iget-object v1, p0, Ll/֨᩻֫;->ۙ:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/֨᩻֫;->᩸:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 256
    iput-boolean v0, p0, Ll/֨᩻֫;->᩸:Z

    .line 258
    invoke-virtual {v1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 260
    :cond_0
    iget-object v0, p0, Ll/֨᩻֫;->᩹:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    const/4 v0, 0x1

    .line 261
    iput-boolean v0, p0, Ll/֨᩻֫;->ۗ:Z

    return-void
.end method
