.class public final synthetic Ll/᩵۟֫;
.super Ljava/lang/Object;
.source "M8RW"

# interfaces
.implements Ll/᩸۟֫;


# virtual methods
.method public final ֫(Ljava/lang/Object;)I
    .locals 2

    .line 2
    check-cast p1, Ll/ܿ۟֫;

    .line 633
    iget-object p1, p1, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    const-string v0, "OMX.google"

    .line 634
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "c2.android"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 638
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_1

    const-string v0, "OMX.MTK.AUDIO.DECODER.RAW"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
