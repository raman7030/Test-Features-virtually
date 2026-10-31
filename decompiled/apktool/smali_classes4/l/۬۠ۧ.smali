.class public final Ll/۬۠ۧ;
.super Ljava/lang/Object;
.source "V2SC"

# interfaces
.implements Ll/ۤ۠ۧ;


# virtual methods
.method public final ֫([F)Z
    .locals 4

    const/4 v0, 0x2

    .line 980
    aget v0, p1, v0

    const v1, 0x3f733333    # 0.95f

    const/4 v2, 0x0

    cmpl-float v1, v0, v1

    if-ltz v1, :cond_0

    goto :goto_0

    :cond_0
    const v1, 0x3d4ccccd    # 0.05f

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_1

    goto :goto_0

    .line 987
    :cond_1
    aget v0, p1, v2

    const/high16 v1, 0x41200000    # 10.0f

    const/4 v3, 0x1

    cmpl-float v1, v0, v1

    if-ltz v1, :cond_2

    const/high16 v1, 0x42140000    # 37.0f

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_2

    aget p1, p1, v3

    const v0, 0x3f51eb85    # 0.82f

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_2

    :goto_0
    return v2

    :cond_2
    return v3
.end method
