.class public final Ll/ۨ۠ۡ;
.super Ljava/lang/Object;
.source "H6W9"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/nio/ByteBuffer;

.field public final ܽ:F

.field public final ܿ:Ljava/nio/ByteBuffer;

.field public final ᩳ:F


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V
    .locals 4

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Ll/ۨ۠ۡ;->ܿ:Ljava/nio/ByteBuffer;

    .line 19
    iput-object p2, p0, Ll/ۨ۠ۡ;->ۧ:Ljava/nio/ByteBuffer;

    .line 20
    invoke-virtual {p2}, Ljava/nio/Buffer;->capacity()I

    move-result p2

    const/4 v0, 0x2

    div-int/2addr p2, v0

    iput p2, p0, Ll/ۨ۠ۡ;->֫:I

    const/high16 p2, 0x7f800000    # Float.POSITIVE_INFINITY

    const/high16 v1, -0x800000    # Float.NEGATIVE_INFINITY

    .line 22
    :goto_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 23
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x43800000    # 256.0f

    div-float/2addr v2, v3

    .line 24
    invoke-static {p2, v2}, Ljava/lang/Math;->min(FF)F

    move-result p2

    .line 25
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    add-int/lit8 v0, v0, 0xc

    goto :goto_0

    .line 27
    :cond_0
    iput p2, p0, Ll/ۨ۠ۡ;->ᩳ:F

    .line 28
    iput v1, p0, Ll/ۨ۠ۡ;->ܽ:F

    return-void
.end method

.method public static ֫(IILl/۬ۜܽ;)Ljava/nio/ByteBuffer;
    .locals 6

    mul-int v0, p0, p1

    .line 56
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    if-ge v2, p0, :cond_0

    .line 60
    invoke-virtual {p2}, Ll/۬ۜܽ;->readByte()B

    move-result v4

    and-int/lit16 v4, v4, 0xff

    add-int/2addr v3, v4

    and-int/lit16 v3, v3, 0xff

    mul-int v4, v2, p1

    add-int/2addr v4, v1

    int-to-byte v5, v3

    .line 61
    invoke-virtual {v0, v4, v5}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static ֫(Ll/۬ۜܽ;)Ljava/util/ArrayList;
    .locals 13

    .line 32
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v0

    const-wide/16 v2, 0x8

    cmp-long v4, v0, v2

    if-ltz v4, :cond_7

    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    const v1, 0x5133544d

    if-ne v0, v1, :cond_7

    .line 35
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_6

    const/16 v1, 0x20

    if-gt v0, v1, :cond_6

    .line 37
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_4

    .line 39
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v5

    cmp-long v7, v5, v2

    if-ltz v7, :cond_3

    .line 40
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v5

    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v6

    int-to-long v7, v5

    const-wide/16 v9, 0xc

    mul-long v7, v7, v9

    int-to-long v9, v6

    const-wide/16 v11, 0x2

    mul-long v9, v9, v11

    add-long/2addr v9, v7

    const/4 v7, 0x3

    if-lt v5, v7, :cond_2

    const v8, 0xea60

    if-gt v5, v8, :cond_2

    if-lt v6, v7, :cond_2

    .line 42
    rem-int/lit8 v7, v6, 0x3

    if-nez v7, :cond_2

    .line 43
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v7

    cmp-long v11, v9, v7

    if-gtz v11, :cond_2

    const/16 v7, 0xc

    .line 44
    invoke-static {v5, v7, p0}, Ll/ۨ۠ۡ;->֫(IILl/۬ۜܽ;)Ljava/nio/ByteBuffer;

    move-result-object v7

    const/4 v8, 0x2

    .line 45
    invoke-static {v6, v8, p0}, Ll/ۨ۠ۡ;->֫(IILl/۬ۜܽ;)Ljava/nio/ByteBuffer;

    move-result-object v6

    const/4 v8, 0x0

    .line 46
    :goto_1
    invoke-virtual {v6}, Ljava/nio/Buffer;->capacity()I

    move-result v9

    if-ge v8, v9, :cond_1

    .line 47
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v9

    const v10, 0xffff

    and-int/2addr v9, v10

    if-ge v9, v5, :cond_0

    add-int/lit8 v8, v8, 0x2

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid logo mesh index"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 49
    :cond_1
    new-instance v5, Ll/ۨ۠ۡ;

    invoke-direct {v5, v7, v6}, Ll/ۨ۠ۡ;-><init>(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 43
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid logo mesh lengths"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 39
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Truncated logo mesh"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 51
    :cond_4
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long p0, v2, v4

    if-nez p0, :cond_5

    return-object v1

    :cond_5
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Trailing logo mesh data"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 36
    :cond_6
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid logo mesh count"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 33
    :cond_7
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid logo mesh header"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
