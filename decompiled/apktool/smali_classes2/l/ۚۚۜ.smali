.class public final Ll/ۚۚۜ;
.super Ljava/lang/Object;
.source "B75R"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ᩸:Landroid/media/MediaMetadataRetriever;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 738
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 739
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    iput-object v0, p0, Ll/ۚۚۜ;->᩸:Landroid/media/MediaMetadataRetriever;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 767
    iget-object v0, p0, Ll/ۚۚۜ;->᩸:Landroid/media/MediaMetadataRetriever;

    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V

    return-void
.end method

.method public final ֫(II)Landroid/graphics/Bitmap;
    .locals 8

    .line 750
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    iget-object v2, p0, Ll/ۚۚۜ;->᩸:Landroid/media/MediaMetadataRetriever;

    if-lt v0, v1, :cond_0

    const-wide/16 v3, -0x1

    const/4 v5, 0x2

    move v6, p1

    move v7, p2

    .line 751
    invoke-virtual/range {v2 .. v7}, Landroid/media/MediaMetadataRetriever;->getScaledFrameAtTime(JIII)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :cond_0
    const-wide/16 v0, -0x1

    const/4 v3, 0x2

    .line 754
    invoke-virtual {v2, v0, v1, v3}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JI)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 756
    invoke-static {v0, p1, p2}, Ll/ۙۚۜ;->֫(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(I)Ljava/lang/String;
    .locals 1

    .line 762
    iget-object v0, p0, Ll/ۚۚۜ;->᩸:Landroid/media/MediaMetadataRetriever;

    invoke-virtual {v0, p1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroid/media/MediaDataSource;)V
    .locals 1

    .line 744
    iget-object v0, p0, Ll/ۚۚۜ;->᩸:Landroid/media/MediaMetadataRetriever;

    invoke-virtual {v0, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/media/MediaDataSource;)V

    return-void
.end method
