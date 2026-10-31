.class public final Ll/ܳ۟֫;
.super Ljava/lang/Object;
.source "I8QN"


# direct methods
.method public static ֫(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)I
    .locals 2

    .line 100
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getSupportedPerformancePoints()Ljava/util/List;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_9

    .line 101
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    .line 108
    :cond_0
    new-instance v1, Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    double-to-int p3, p3

    new-instance p4, Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    invoke-direct {p4, p1, p2, p3}, Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;-><init>(III)V

    const/4 p1, 0x0

    .line 192
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    const/4 p3, 0x2

    const/4 v1, 0x1

    if-ge p1, p2, :cond_2

    .line 193
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Ll/ۡܽܳ;->֫(Ljava/lang/Object;)Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    move-result-object p2

    invoke-virtual {p2, p4}, Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;->covers(Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p0, 0x2

    goto :goto_1

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    :goto_1
    if-ne p0, v1, :cond_8

    .line 115
    invoke-static {}, Ll/᩻۟֫;->֫()Ljava/lang/Boolean;

    move-result-object p1

    if-nez p1, :cond_8

    .line 133
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x23

    if-lt p1, p2, :cond_3

    goto :goto_2

    .line 139
    :cond_3
    invoke-static {v0}, Ll/ܳ۟֫;->֫(Z)I

    move-result p1

    .line 142
    invoke-static {v1}, Ll/ܳ۟֫;->֫(Z)I

    move-result p2

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    if-nez p2, :cond_5

    if-eq p1, p3, :cond_6

    goto :goto_3

    :cond_5
    if-ne p1, p3, :cond_7

    if-eq p2, p3, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    const/4 v1, 0x0

    .line 120
    :cond_7
    :goto_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Ll/᩻۟֫;->֫(Ljava/lang/Boolean;)V

    .line 121
    invoke-static {}, Ll/᩻۟֫;->֫()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_4

    :cond_8
    return p0

    :cond_9
    :goto_4
    return v0
.end method

.method public static ֫(Z)I
    .locals 5

    const/4 v0, 0x0

    .line 157
    :try_start_0
    new-instance v1, Ll/֨ᩴ֫;

    invoke-direct {v1}, Ll/֨ᩴ֫;-><init>()V

    const-string v2, "video/avc"

    invoke-virtual {v1, v2}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    invoke-virtual {v1}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v1

    iget-object v2, v1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    if-eqz v2, :cond_4

    .line 210
    invoke-static {v2, p0, v0}, Ll/᩹۟֫;->֫(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v2

    .line 245
    invoke-static {v1}, Ll/᩹۟֫;->֫(Ll/۠ᩴ֫;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    .line 247
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p0

    goto :goto_0

    .line 249
    :cond_0
    invoke-static {v1, p0, v0}, Ll/᩹۟֫;->֫(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p0

    .line 726
    :goto_0
    new-instance v1, Ll/֫۬ܺ;

    invoke-direct {v1}, Ll/֫۬ܺ;-><init>()V

    .line 216
    invoke-virtual {v1, v2}, Ll/ۛۗܺ;->֫(Ljava/util/List;)V

    .line 217
    invoke-virtual {v1, p0}, Ll/ۛۗܺ;->֫(Ljava/util/List;)V

    .line 218
    invoke-virtual {v1}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object p0

    const/4 v1, 0x0

    .line 166
    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 167
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿ۟֫;

    iget-object v2, v2, Ll/ܿ۟֫;->ۧ:Landroid/media/MediaCodecInfo$CodecCapabilities;

    if-eqz v2, :cond_3

    .line 169
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿ۟֫;

    iget-object v2, v2, Ll/ܿ۟֫;->ۧ:Landroid/media/MediaCodecInfo$CodecCapabilities;

    invoke-virtual {v2}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 172
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getSupportedPerformancePoints()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 173
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    .line 174
    new-instance p0, Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    new-instance p0, Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    const/16 v1, 0x500

    const/16 v3, 0x2d0

    const/16 v4, 0x3c

    invoke-direct {p0, v1, v3, v4}, Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;-><init>(III)V

    const/4 v1, 0x0

    .line 192
    :goto_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_2

    .line 193
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ll/ۡܽܳ;->֫(Ljava/lang/Object;)Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    move-result-object v3

    invoke-virtual {v3, p0}, Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;->covers(Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;)Z

    move-result v3
    :try_end_0
    .catch Ll/ۚ۟֫; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :catch_0
    :cond_4
    return v0
.end method
