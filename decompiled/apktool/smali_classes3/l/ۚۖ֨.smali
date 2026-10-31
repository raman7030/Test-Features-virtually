.class public final Ll/ۚۖ֨;
.super Ll/֨ۖ֨;
.source "R7L8"


# virtual methods
.method public final varargs init()V
    .locals 2

    .line 79
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "doclint not available"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "-Xmsgs"

    .line 85
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "-Xmsgs:"

    .line 86
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "-XcheckPackage:"

    .line 87
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
