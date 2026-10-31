.class public final Ll/ۖ֡ۜ;
.super Ljava/io/FileNotFoundException;
.source "77UM"


# direct methods
.method public static ֫(Ljava/lang/Exception;)Z
    .locals 1

    :goto_0
    if-eqz p0, :cond_1

    .line 20
    instance-of v0, p0, Ll/ۖ֡ۜ;

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    .line 23
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method
