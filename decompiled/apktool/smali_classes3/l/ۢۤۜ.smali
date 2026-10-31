.class public final synthetic Ll/ۢۤۜ;
.super Ljava/lang/Object;
.source "D8GL"

# interfaces
.implements Landroid/animation/TimeInterpolator;


# instance fields
.field public final synthetic ֫:F


# direct methods
.method public synthetic constructor <init>(F)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ۢۤۜ;->֫:F

    return-void
.end method


# virtual methods
.method public final getInterpolation(F)F
    .locals 2

    .line 0
    iget v0, p0, Ll/ۢۤۜ;->֫:F

    add-float/2addr p1, v0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v0

    if-lez v1, :cond_0

    sub-float/2addr p1, v0

    :cond_0
    return p1
.end method
