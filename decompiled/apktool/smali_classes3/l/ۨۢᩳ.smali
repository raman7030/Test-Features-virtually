.class public final Ll/ۨۢᩳ;
.super Ldalvik/system/DexClassLoader;
.source "A1X2"


# instance fields
.field public ֫:Landroid/content/pm/ApplicationInfo;


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 52
    iget-object v0, p0, Ll/ۨۢᩳ;->֫:Landroid/content/pm/ApplicationInfo;

    if-nez v0, :cond_0

    .line 53
    invoke-super {p0}, Ldalvik/system/DexClassLoader;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 54
    :cond_0
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    iget-object v1, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    const-string v2, "\"],nativeLibraryDirectories=["

    const-string v3, ", /system/lib, /system/product/lib]]]"

    const-string v4, "dalvik.system.DexClassLoader[DexPathList[[zip file \""

    .line 0
    invoke-static {v4, v1, v2, v0, v3}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Landroid/content/pm/ApplicationInfo;)V
    .locals 0

    .line 46
    iput-object p1, p0, Ll/ۨۢᩳ;->֫:Landroid/content/pm/ApplicationInfo;

    return-void
.end method
