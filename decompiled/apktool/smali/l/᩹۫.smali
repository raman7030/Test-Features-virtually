.class public final Ll/᩹۫;
.super Ljava/lang/Object;
.source "U9SU"


# direct methods
.method public static ֫(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/net/Uri;)Z
    .locals 0

    .line 297
    invoke-static {p0, p1, p2}, Landroid/provider/DocumentsContract;->removeDocument(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/net/Uri;)Z

    move-result p0

    return p0
.end method

.method public static ֫(Landroid/net/Uri;)Z
    .locals 0

    .line 291
    invoke-static {p0}, Landroid/provider/DocumentsContract;->isTreeUri(Landroid/net/Uri;)Z

    move-result p0

    return p0
.end method
