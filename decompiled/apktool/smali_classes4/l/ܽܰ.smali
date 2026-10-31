.class public final Ll/ܽܰ;
.super Ll/ᩳܰ;
.source "R9NW"


# instance fields
.field public final ܿ:Landroid/view/WindowInsetsAnimation;


# direct methods
.method public constructor <init>(Landroid/view/WindowInsetsAnimation;)V
    .locals 4

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    .line 973
    invoke-direct {p0, v3, v0, v1, v2}, Ll/ᩳܰ;-><init>(ILandroid/view/animation/Interpolator;J)V

    .line 974
    iput-object p1, p0, Ll/ܽܰ;->ܿ:Landroid/view/WindowInsetsAnimation;

    return-void
.end method

.method public static ֫(Landroid/view/WindowInsetsAnimation$Bounds;)Ll/ۧ۬;
    .locals 0

    .line 1104
    invoke-virtual {p0}, Landroid/view/WindowInsetsAnimation$Bounds;->getUpperBound()Landroid/graphics/Insets;

    move-result-object p0

    invoke-static {p0}, Ll/ۧ۬;->֫(Landroid/graphics/Insets;)Ll/ۧ۬;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/view/View;Ll/۬᩺;)V
    .locals 1

    .line 1086
    new-instance v0, Ll/ۧܰ;

    invoke-direct {v0, p1}, Ll/ۧܰ;-><init>(Ll/۬᩺;)V

    .line 1087
    invoke-virtual {p0, v0}, Landroid/view/View;->setWindowInsetsAnimationCallback(Landroid/view/WindowInsetsAnimation$Callback;)V

    return-void
.end method

.method public static ۧ(Landroid/view/WindowInsetsAnimation$Bounds;)Ll/ۧ۬;
    .locals 0

    .line 1099
    invoke-virtual {p0}, Landroid/view/WindowInsetsAnimation$Bounds;->getLowerBound()Landroid/graphics/Insets;

    move-result-object p0

    invoke-static {p0}, Ll/ۧ۬;->֫(Landroid/graphics/Insets;)Ll/ۧ۬;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 994
    iget-object v0, p0, Ll/ܽܰ;->ܿ:Landroid/view/WindowInsetsAnimation;

    invoke-virtual {v0}, Landroid/view/WindowInsetsAnimation;->getDurationMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫(F)V
    .locals 1

    .line 1004
    iget-object v0, p0, Ll/ܽܰ;->ܿ:Landroid/view/WindowInsetsAnimation;

    invoke-virtual {v0, p1}, Landroid/view/WindowInsetsAnimation;->setFraction(F)V

    return-void
.end method

.method public final ۧ()F
    .locals 1

    .line 1009
    iget-object v0, p0, Ll/ܽܰ;->ܿ:Landroid/view/WindowInsetsAnimation;

    invoke-virtual {v0}, Landroid/view/WindowInsetsAnimation;->getInterpolatedFraction()F

    move-result v0

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 983
    iget-object v0, p0, Ll/ܽܰ;->ܿ:Landroid/view/WindowInsetsAnimation;

    invoke-virtual {v0}, Landroid/view/WindowInsetsAnimation;->getTypeMask()I

    move-result v0

    return v0
.end method
