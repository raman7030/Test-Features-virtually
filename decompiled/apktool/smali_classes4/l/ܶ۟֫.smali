.class public final Ll/ܶ۟֫;
.super Ljava/lang/Object;
.source "M8RW"

# interfaces
.implements Ll/֨۟֫;


# instance fields
.field public final ֫:I

.field public ۧ:[Landroid/media/MediaCodecInfo;


# direct methods
.method public constructor <init>(ZZZ)V
    .locals 0

    .line 819
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_1

    if-nez p2, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 823
    :goto_1
    iput p1, p0, Ll/ܶ۟֫;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 857
    iget-object v0, p0, Ll/ܶ۟֫;->ۧ:[Landroid/media/MediaCodecInfo;

    if-nez v0, :cond_0

    .line 858
    new-instance v0, Landroid/media/MediaCodecList;

    iget v1, p0, Ll/ܶ۟֫;->֫:I

    invoke-direct {v0, v1}, Landroid/media/MediaCodecList;-><init>(I)V

    invoke-virtual {v0}, Landroid/media/MediaCodecList;->getCodecInfos()[Landroid/media/MediaCodecInfo;

    move-result-object v0

    iput-object v0, p0, Ll/ܶ۟֫;->ۧ:[Landroid/media/MediaCodecInfo;

    .line 829
    :cond_0
    iget-object v0, p0, Ll/ܶ۟֫;->ۧ:[Landroid/media/MediaCodecInfo;

    array-length v0, v0

    return v0
.end method

.method public final ֫(I)Landroid/media/MediaCodecInfo;
    .locals 2

    .line 857
    iget-object v0, p0, Ll/ܶ۟֫;->ۧ:[Landroid/media/MediaCodecInfo;

    if-nez v0, :cond_0

    .line 858
    new-instance v0, Landroid/media/MediaCodecList;

    iget v1, p0, Ll/ܶ۟֫;->֫:I

    invoke-direct {v0, v1}, Landroid/media/MediaCodecList;-><init>(I)V

    invoke-virtual {v0}, Landroid/media/MediaCodecList;->getCodecInfos()[Landroid/media/MediaCodecInfo;

    move-result-object v0

    iput-object v0, p0, Ll/ܶ۟֫;->ۧ:[Landroid/media/MediaCodecInfo;

    .line 835
    :cond_0
    iget-object v0, p0, Ll/ܶ۟֫;->ۧ:[Landroid/media/MediaCodecInfo;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z
    .locals 0

    .line 852
    invoke-virtual {p2, p1}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureRequired(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z
    .locals 0

    .line 846
    invoke-virtual {p3, p1}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
