.class public final Ll/ܶۧܽ;
.super Ljava/lang/Object;
.source "OANW"


# direct methods
.method public static ֫(Landroid/content/Context;)Landroidx/window/sidecar/SidecarInterface;
    .locals 0

    .line 467
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Landroidx/window/sidecar/SidecarProvider;->getSidecarImpl(Landroid/content/Context;)Landroidx/window/sidecar/SidecarInterface;

    move-result-object p0

    return-object p0
.end method

.method public static ֫()Ll/۬֫ܽ;
    .locals 2

    .line 452
    :try_start_0
    invoke-static {}, Landroidx/window/sidecar/SidecarProvider;->getApiVersion()Ljava/lang/String;

    move-result-object v0

    .line 453
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    sget v1, Ll/۬֫ܽ;->۬:I

    invoke-static {v0}, Ll/ۙ֫ܽ;->֫(Ljava/lang/String;)Ll/۬֫ܽ;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
