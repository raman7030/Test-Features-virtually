.class public final Ll/᩻ۨܳ;
.super Ljava/lang/Object;
.source "F8CE"

# interfaces
.implements Ll/ۢۨܳ;


# static fields
.field public static final ֫:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/16 v0, 0x13

    const/16 v1, 0x16

    const/4 v2, -0x5

    const/4 v3, -0x1

    const/4 v4, 0x3

    .line 141
    filled-new-array {v2, v3, v4, v0, v1}, [I

    move-result-object v0

    sput-object v0, Ll/᩻ۨܳ;->֫:[I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠ۖܽ;)J
    .locals 7

    const-wide/16 v0, 0x16

    .line 72
    invoke-interface {p1}, Ll/۠ۖܽ;->length()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    new-array v0, v1, [B

    const-wide/16 v1, 0x0

    .line 73
    invoke-interface {p1, v1, v2}, Ll/۠ۖܽ;->seek(J)V

    .line 74
    invoke-interface {p1, v0}, Ll/۠ۖܽ;->readFully([B)V

    const-wide/16 v3, -0x1

    .line 76
    :try_start_0
    invoke-static {v0}, Lcom/github/luben/zstd/Zstd;->getFrameContentSize([B)J

    move-result-wide v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    cmp-long p1, v5, v1

    if-gtz p1, :cond_0

    return-wide v3

    :cond_0
    return-wide v5

    :catch_0
    return-wide v3
.end method

.method public final ֫(Ljava/io/InputStream;)Ljava/io/InputStream;
    .locals 1

    .line 137
    new-instance v0, Lcom/github/luben/zstd/ZstdInputStream;

    invoke-direct {v0, p1}, Lcom/github/luben/zstd/ZstdInputStream;-><init>(Ljava/io/InputStream;)V

    return-object v0
.end method

.method public final ֫(Ljava/io/OutputStream;IJ)Ljava/io/OutputStream;
    .locals 0

    .line 145
    new-instance p3, Lcom/github/luben/zstd/ZstdOutputStream;

    sget-object p4, Ll/᩻ۨܳ;->֫:[I

    aget p2, p4, p2

    invoke-direct {p3, p1, p2}, Lcom/github/luben/zstd/ZstdOutputStream;-><init>(Ljava/io/OutputStream;I)V

    return-object p3
.end method

.method public final ֫([BI)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x4

    if-ge p2, v1, :cond_0

    goto :goto_1

    .line 46
    :cond_0
    invoke-static {p1, v0, p2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 47
    sget-object p2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 49
    :goto_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result p2

    if-ge p2, v1, :cond_1

    goto :goto_1

    .line 52
    :cond_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p2

    const v2, -0x2d04ad8

    if-ne p2, v2, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const v2, 0x184d2a50

    if-ne p2, v2, :cond_5

    .line 57
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result p2

    if-ge p2, v1, :cond_3

    goto :goto_1

    .line 60
    :cond_3
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p2

    .line 61
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    if-ge v2, p2, :cond_4

    goto :goto_1

    .line 64
    :cond_4
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v2

    add-int/2addr v2, p2

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_0

    :cond_5
    :goto_1
    return v0
.end method
