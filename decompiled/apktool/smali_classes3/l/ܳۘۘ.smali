.class public final Ll/ܳۘۘ;
.super Ljava/lang/Object;
.source "R5PD"


# direct methods
.method public static ֫([B)V
    .locals 3

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 33
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    .line 34
    aput-byte v0, p0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
