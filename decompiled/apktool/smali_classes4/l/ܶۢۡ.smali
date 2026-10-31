.class public final synthetic Ll/ܶۢۡ;
.super Ljava/lang/Object;
.source "I5VL"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic ֫:Ll/᩹ۢۡ;

.field public final synthetic ۧ:[J

.field public final synthetic ܽ:Ll/᩸ۢۡ;

.field public final synthetic ܿ:I

.field public final synthetic ᩳ:I


# direct methods
.method public synthetic constructor <init>(Ll/᩹ۢۡ;[JLl/᩸ۢۡ;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶۢۡ;->֫:Ll/᩹ۢۡ;

    iput-object p2, p0, Ll/ܶۢۡ;->ۧ:[J

    iput-object p3, p0, Ll/ܶۢۡ;->ܽ:Ll/᩸ۢۡ;

    iput p4, p0, Ll/ܶۢۡ;->ᩳ:I

    iput p5, p0, Ll/ܶۢۡ;->ܿ:I

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 6

    .line 0
    iget v3, p0, Ll/ܶۢۡ;->ᩳ:I

    iget v4, p0, Ll/ܶۢۡ;->ܿ:I

    iget-object v0, p0, Ll/ܶۢۡ;->֫:Ll/᩹ۢۡ;

    iget-object v1, p0, Ll/ܶۢۡ;->ۧ:[J

    iget-object v2, p0, Ll/ܶۢۡ;->ܽ:Ll/᩸ۢۡ;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Ll/᩹ۢۡ;->֫(Ll/᩹ۢۡ;[JLl/᩸ۢۡ;IILandroid/animation/ValueAnimator;)V

    return-void
.end method
