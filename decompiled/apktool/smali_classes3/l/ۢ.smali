.class public final Ll/ۢ;
.super Ljava/lang/Object;
.source "95XT"


# direct methods
.method public static ֫(Landroid/media/browse/MediaBrowser$MediaItem;)Landroid/media/MediaDescription;
    .locals 0

    .line 2389
    invoke-virtual {p0}, Landroid/media/browse/MediaBrowser$MediaItem;->getDescription()Landroid/media/MediaDescription;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Landroid/media/browse/MediaBrowser$MediaItem;)I
    .locals 0

    .line 2394
    invoke-virtual {p0}, Landroid/media/browse/MediaBrowser$MediaItem;->getFlags()I

    move-result p0

    return p0
.end method
