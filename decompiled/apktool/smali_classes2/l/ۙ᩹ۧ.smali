.class public final Ll/ۙ᩹ۧ;
.super Ljava/lang/Object;
.source "J9LL"


# direct methods
.method public static ֫(Landroid/content/Context;)Ljava/io/File;
    .locals 0

    .line 87
    invoke-virtual {p0}, Landroid/content/Context;->createDeviceProtectedStorageContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getCodeCacheDir()Ljava/io/File;

    move-result-object p0

    return-object p0
.end method
