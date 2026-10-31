.class public final Ll/ܰ֡ۜ;
.super Ljava/lang/Object;
.source "Q8FL"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public ᩸:Z

.field public final ᩹:Landroid/media/MediaDataSource;


# direct methods
.method public constructor <init>(Landroid/media/MediaDataSource;)V
    .locals 0

    .line 1583
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1584
    iput-object p1, p0, Ll/ܰ֡ۜ;->᩹:Landroid/media/MediaDataSource;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1601
    iget-boolean v0, p0, Ll/ܰ֡ۜ;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 1604
    iput-boolean v0, p0, Ll/ܰ֡ۜ;->᩸:Z

    .line 1605
    iget-object v0, p0, Ll/ܰ֡ۜ;->᩹:Landroid/media/MediaDataSource;

    invoke-virtual {v0}, Landroid/media/MediaDataSource;->close()V

    return-void
.end method

.method public final ֫(Landroid/media/MediaMetadataRetriever;)V
    .locals 1

    .line 1590
    iget-object v0, p0, Ll/ܰ֡ۜ;->᩹:Landroid/media/MediaDataSource;

    invoke-virtual {p1, v0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/media/MediaDataSource;)V

    .line 1591
    iget-object p1, p0, Ll/ܰ֡ۜ;->᩹:Landroid/media/MediaDataSource;

    instance-of v0, p1, Ll/ۛ᩶ۜ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۛ᩶ۜ;

    .line 1592
    invoke-virtual {p1}, Ll/ۛ᩶ۜ;->֫()V

    :cond_0
    return-void
.end method
