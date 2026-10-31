.class public final Ll/ۜ֫ܽ;
.super Ll/᩶۟ۧ;
.source "F6YU"


# virtual methods
.method public final ܽ()Z
    .locals 2

    .line 580
    invoke-super {p0}, Ll/ۛ۟ۧ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "MULTI_PROCESS"

    .line 583
    invoke-static {v0}, Ll/ܰۘܺ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 584
    sget v0, Ll/۠۟ۧ;->֫:I

    .line 1081
    sget-object v0, Ll/ۢ֫ܽ;->ᩳ:Ll/᩶۟ۧ;

    .line 1082
    invoke-virtual {v0}, Ll/ۛ۟ۧ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 43
    sget-object v0, Ll/ܺ֫ܽ;->֫:Ll/ۘ֫ܽ;

    .line 1083
    invoke-interface {v0}, Ll/ۘ֫ܽ;->getStatics()Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;->isMultiProcessEnabled()Z

    move-result v0

    return v0

    .line 841
    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This method is not supported by the current version of the framework and the current WebView APK"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 1085
    throw v0

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return v0
.end method
