.class public final Ll/ۙۗۜ;
.super Ljava/lang/Object;
.source "M799"


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/ܿۚۜ;

.field public final ܽ:Landroid/media/MediaMetadataRetriever;


# direct methods
.method public constructor <init>(ILandroid/media/MediaMetadataRetriever;Ll/ܿۚۜ;)V
    .locals 0

    .line 1042
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1043
    iput p1, p0, Ll/ۙۗۜ;->֫:I

    .line 1044
    iput-object p2, p0, Ll/ۙۗۜ;->ܽ:Landroid/media/MediaMetadataRetriever;

    .line 1045
    iput-object p3, p0, Ll/ۙۗۜ;->ۧ:Ll/ܿۚۜ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۙۗۜ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۙۗۜ;->֫:I

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ۙۗۜ;)Landroid/media/MediaMetadataRetriever;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙۗۜ;->ܽ:Landroid/media/MediaMetadataRetriever;

    return-object p0
.end method

.method public static ܽ(Ll/ۙۗۜ;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1053
    :try_start_0
    iget-object v0, p0, Ll/ۙۗۜ;->ܽ:Landroid/media/MediaMetadataRetriever;

    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1056
    :catchall_0
    iget-object p0, p0, Ll/ۙۗۜ;->ۧ:Ll/ܿۚۜ;

    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void
.end method
