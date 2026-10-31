.class public final Ll/ۚۙ۠;
.super Ljava/lang/Object;
.source "28VZ"

# interfaces
.implements Landroid/view/ScaleGestureDetector$OnScaleGestureListener;


# instance fields
.field public final synthetic ֫:Ll/֨ۙ۠;


# direct methods
.method public constructor <init>(Ll/֨ۙ۠;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚۙ۠;->֫:Ll/֨ۙ۠;

    return-void
.end method


# virtual methods
.method public final onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 3

    .line 36
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    move-result v0

    .line 37
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 40
    :cond_0
    iget-object v1, p0, Ll/ۚۙ۠;->֫:Ll/֨ۙ۠;

    iget-object v1, v1, Ll/֨ۙ۠;->ᩳ:Ll/ᩴۙ۠;

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    move-result p1

    invoke-virtual {v1, v0, v2, p1}, Ll/ᩴۙ۠;->֫(FFF)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onScaleBegin(Landroid/view/ScaleGestureDetector;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final onScaleEnd(Landroid/view/ScaleGestureDetector;)V
    .locals 0

    return-void
.end method
