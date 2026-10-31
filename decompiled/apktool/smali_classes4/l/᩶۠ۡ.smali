.class public final synthetic Ll/᩶۠ۡ;
.super Ljava/lang/Object;
.source "86WH"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic ֫:Ll/ۛ۠ۡ;

.field public final synthetic ۧ:[F

.field public final synthetic ܽ:[F

.field public final synthetic ܿ:F

.field public final synthetic ᩳ:Ll/۟۠ۡ;


# direct methods
.method public synthetic constructor <init>(Ll/ۛ۠ۡ;[F[FLl/۟۠ۡ;F)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶۠ۡ;->֫:Ll/ۛ۠ۡ;

    iput-object p2, p0, Ll/᩶۠ۡ;->ۧ:[F

    iput-object p3, p0, Ll/᩶۠ۡ;->ܽ:[F

    iput-object p4, p0, Ll/᩶۠ۡ;->ᩳ:Ll/۟۠ۡ;

    iput p5, p0, Ll/᩶۠ۡ;->ܿ:F

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 6

    .line 0
    iget-object v3, p0, Ll/᩶۠ۡ;->ᩳ:Ll/۟۠ۡ;

    iget v4, p0, Ll/᩶۠ۡ;->ܿ:F

    iget-object v0, p0, Ll/᩶۠ۡ;->֫:Ll/ۛ۠ۡ;

    iget-object v1, p0, Ll/᩶۠ۡ;->ۧ:[F

    iget-object v2, p0, Ll/᩶۠ۡ;->ܽ:[F

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Ll/ۛ۠ۡ;->֫(Ll/ۛ۠ۡ;[F[FLl/۟۠ۡ;FLandroid/animation/ValueAnimator;)V

    return-void
.end method
