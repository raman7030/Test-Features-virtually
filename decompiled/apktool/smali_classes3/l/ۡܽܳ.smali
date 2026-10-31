.class public final synthetic Ll/ۡܽܳ;
.super Ljava/lang/Object;
.source "L70P"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/᩵᩶ᩳ;
.implements Ll/۟ۗۚ;
.implements Ll/۬ܶ۠;


# direct methods
.method public static bridge synthetic ֫(Ljava/lang/Object;)Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;
    .locals 0

    .line 0
    check-cast p0, Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    return-object p0
.end method

.method public static bridge synthetic ֫()Ljava/lang/Class;
    .locals 1

    .line 0
    const-class v0, Ljava/lang/reflect/Executable;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Ljava/lang/Object;)V
    .locals 1

    .line 0
    instance-of v0, p0, Ljava/lang/AutoCloseable;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/AutoCloseable;

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-void

    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_6

    instance-of v0, p0, Landroid/content/res/TypedArray;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/content/res/TypedArray;

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :cond_1
    instance-of v0, p0, Landroid/media/MediaMetadataRetriever;

    if-eqz v0, :cond_2

    check-cast p0, Landroid/media/MediaMetadataRetriever;

    invoke-virtual {p0}, Landroid/media/MediaMetadataRetriever;->release()V

    return-void

    :cond_2
    instance-of v0, p0, Landroid/media/MediaDrm;

    if-eqz v0, :cond_3

    check-cast p0, Landroid/media/MediaDrm;

    invoke-virtual {p0}, Landroid/media/MediaDrm;->release()V

    return-void

    :cond_3
    instance-of v0, p0, Landroid/drm/DrmManagerClient;

    if-eqz v0, :cond_4

    check-cast p0, Landroid/drm/DrmManagerClient;

    invoke-virtual {p0}, Landroid/drm/DrmManagerClient;->release()V

    return-void

    :cond_4
    instance-of v0, p0, Landroid/content/ContentProviderClient;

    if-eqz v0, :cond_5

    check-cast p0, Landroid/content/ContentProviderClient;

    invoke-virtual {p0}, Landroid/content/ContentProviderClient;->release()Z

    return-void

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :cond_6
    const/4 p0, 0x0

    throw p0
.end method

.method public static ֫([B)[I
    .locals 5

    .line 145
    array-length v0, p0

    new-array v0, v0, [I

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 146
    :goto_0
    array-length v3, p0

    if-ge v1, v3, :cond_2

    :goto_1
    if-lez v2, :cond_0

    .line 147
    aget-byte v3, p0, v1

    aget-byte v4, p0, v2

    if-eq v3, v4, :cond_0

    add-int/lit8 v2, v2, -0x1

    .line 148
    aget v2, v0, v2

    goto :goto_1

    .line 150
    :cond_0
    aget-byte v3, p0, v1

    aget-byte v4, p0, v2

    if-ne v3, v4, :cond_1

    add-int/lit8 v2, v2, 0x1

    .line 153
    :cond_1
    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static ۧ(III)V
    .locals 5

    int-to-long v0, p1

    int-to-long v2, p2

    add-long/2addr v0, v2

    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    int-to-long v2, p0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    return-void

    .line 169
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, ", length="

    const-string v2, ", arrayLength="

    const-string v3, "offset="

    .line 0
    invoke-static {v3, p1, v1, v2, p2}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 169
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ܽ(III)V
    .locals 5

    int-to-long v0, p1

    int-to-long v2, p2

    add-long/2addr v0, v2

    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    int-to-long v2, p0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    return-void

    .line 161
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, ", length="

    const-string v2, ", totalLength="

    const-string v3, "offset="

    .line 0
    invoke-static {v3, p1, v1, v2, p2}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 161
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/֨۬֫;

    .line 442
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ֫(II[B)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p1, p2, p3}, Ll/۬֨۠;->֫(II[B)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p1, p2, p3}, Ll/ۨۗۚ;->ܽ(Ll/᩸ۗۚ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ֫(III)V
    .locals 0

    return-void
.end method
