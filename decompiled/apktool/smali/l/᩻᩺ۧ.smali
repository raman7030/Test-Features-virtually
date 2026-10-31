.class public final Ll/᩻᩺ۧ;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "560O"


# instance fields
.field public ֫:Landroid/animation/AnimatorSet;

.field public ۧ:Ljava/util/ArrayList;

.field public ܽ:Ll/ۖ᩵;

.field public ᩳ:Ll/᩹᩺ۧ;


# virtual methods
.method public final getChangingConfigurations()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 634
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No constant state support for SDK < 24."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 639
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No constant state support for SDK < 24."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
