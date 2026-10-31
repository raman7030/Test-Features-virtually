.class public final Ll/ۨܶۜ;
.super Ljava/lang/Object;
.source "A75O"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/nio/ByteBuffer;

.field public final ܽ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Landroid/media/Image$Plane;)V
    .locals 1

    .line 1034
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1035
    invoke-virtual {p1}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Ll/ۨܶۜ;->ۧ:Ljava/nio/ByteBuffer;

    .line 1036
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    iput v0, p0, Ll/ۨܶۜ;->֫:I

    .line 1037
    invoke-virtual {p1}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v0

    iput v0, p0, Ll/ۨܶۜ;->ᩳ:I

    .line 1038
    invoke-virtual {p1}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result p1

    iput p1, p0, Ll/ۨܶۜ;->ܽ:I

    return-void
.end method

.method public static ֫(Ll/ۨܶۜ;II)I
    .locals 7

    .line 1042
    iget-object v0, p0, Ll/ۨܶۜ;->ۧ:Ljava/nio/ByteBuffer;

    iget v1, p0, Ll/ۨܶۜ;->֫:I

    int-to-long v1, v1

    int-to-long v3, p2

    iget p2, p0, Ll/ۨܶۜ;->ᩳ:I

    int-to-long v5, p2

    mul-long v3, v3, v5

    add-long/2addr v3, v1

    int-to-long p1, p1

    iget p0, p0, Ll/ۨܶۜ;->ܽ:I

    int-to-long v5, p0

    mul-long p1, p1, v5

    add-long/2addr p1, v3

    cmp-long p0, p1, v1

    if-ltz p0, :cond_0

    .line 1043
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result p0

    int-to-long v1, p0

    cmp-long p0, p1, v1

    if-gez p0, :cond_0

    long-to-int p0, p1

    .line 1046
    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p0

    and-int/lit16 p0, p0, 0xff

    return p0

    .line 1044
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "MPEG-TS decoder plane is truncated"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
