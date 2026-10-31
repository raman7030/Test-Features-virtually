.class public final Ll/ۘۙ;
.super Ljava/lang/Object;
.source "J4M5"


# direct methods
.method public static ֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1049
    invoke-virtual {p0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/content/Context;)Ljava/io/File;
    .locals 0

    .line 1059
    invoke-virtual {p0}, Landroid/content/Context;->getCodeCacheDir()Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Landroid/content/Context;)Ljava/io/File;
    .locals 0

    .line 1054
    invoke-virtual {p0}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    move-result-object p0

    return-object p0
.end method
