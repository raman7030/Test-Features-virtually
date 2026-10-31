.class public final synthetic Ll/ۚ᩷᩻;
.super Ljava/lang/Object;
.source "A9TM"


# direct methods
.method public static ֫(Ll/֨᩷᩻;[B)I
    .locals 4

    .line 18
    array-length v0, p1

    const/4 v1, 0x0

    .line 19
    invoke-interface {p0, p1, v1, v0}, Ll/֨᩷᩻;->read([BII)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    return v2

    :cond_0
    sub-int/2addr v0, v1

    :goto_0
    if-lez v0, :cond_2

    .line 26
    invoke-interface {p0, p1, v1, v0}, Ll/֨᩷᩻;->read([BII)I

    move-result v3

    if-ne v3, v2, :cond_1

    goto :goto_1

    :cond_1
    add-int/2addr v1, v3

    sub-int/2addr v0, v3

    goto :goto_0

    .line 33
    :cond_2
    array-length p0, p1

    if-ne v1, p0, :cond_3

    :goto_1
    return v1

    :cond_3
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method
