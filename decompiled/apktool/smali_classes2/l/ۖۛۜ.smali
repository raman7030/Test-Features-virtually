.class public final Ll/ۖۛۜ;
.super Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;
.source "B6LA"


# instance fields
.field public ֫:F

.field public ۧ:F

.field public final synthetic ܽ:Ll/ۚۛۜ;


# direct methods
.method public constructor <init>(Ll/ۚۛۜ;)V
    .locals 0

    .line 60
    iput-object p1, p0, Ll/ۖۛۜ;->ܽ:Ll/ۚۛۜ;

    invoke-direct {p0}, Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 3

    .line 67
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    move-result v0

    iget v1, p0, Ll/ۖۛۜ;->֫:F

    sub-float/2addr v0, v1

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    move-result v1

    iget v2, p0, Ll/ۖۛۜ;->ۧ:F

    sub-float/2addr v1, v2

    iget-object v2, p0, Ll/ۖۛۜ;->ܽ:Ll/ۚۛۜ;

    invoke-static {v2, v0, v1}, Ll/ۚۛۜ;->֫(Ll/ۚۛۜ;FF)V

    .line 68
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    move-result v0

    iput v0, p0, Ll/ۖۛۜ;->֫:F

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    move-result v0

    iput v0, p0, Ll/ۖۛۜ;->ۧ:F

    .line 69
    invoke-static {v2}, Ll/ۚۛۜ;->ܺ(Ll/ۚۛۜ;)F

    move-result v0

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    move-result p1

    mul-float p1, p1, v0

    iget v0, p0, Ll/ۖۛۜ;->֫:F

    iget v1, p0, Ll/ۖۛۜ;->ۧ:F

    invoke-static {v2, p1, v0, v1}, Ll/ۚۛۜ;->֫(Ll/ۚۛۜ;FFF)V

    const/4 p1, 0x1

    return p1
.end method

.method public final onScaleBegin(Landroid/view/ScaleGestureDetector;)Z
    .locals 1

    .line 63
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    move-result v0

    iput v0, p0, Ll/ۖۛۜ;->֫:F

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    move-result p1

    iput p1, p0, Ll/ۖۛۜ;->ۧ:F

    const/4 p1, 0x1

    return p1
.end method
