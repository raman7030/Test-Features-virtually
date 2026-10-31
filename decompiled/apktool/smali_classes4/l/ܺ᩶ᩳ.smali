.class public final Ll/ܺ᩶ᩳ;
.super Ljava/io/Reader;
.source "16SN"


# instance fields
.field public final ֫֫:Ll/ۚ۬ᩳ;

.field public ۗ:I

.field public ۙ:J

.field public final ۛ:Ljava/nio/channels/FileChannel;

.field public final ۟:I

.field public ۤ:Z

.field public ۧ֫:[C

.field public ۨ:I

.field public ۫:[B

.field public final ۬:I

.field public final ܰ:I

.field public final ܽ֫:I

.field public ᩶:I

.field public ᩸:I

.field public ᩹:I

.field public ᩺:I


# direct methods
.method public constructor <init>(Ljava/nio/channels/FileChannel;Ll/֨۬ᩳ;)V
    .locals 12

    .line 44
    invoke-direct {p0}, Ljava/io/Reader;-><init>()V

    const/4 v0, -0x1

    .line 27
    iput v0, p0, Ll/ܺ᩶ᩳ;->᩹:I

    .line 45
    iput-object p1, p0, Ll/ܺ᩶ᩳ;->ۛ:Ljava/nio/channels/FileChannel;

    const/4 v1, 0x4

    new-array v2, v1, [B

    const-wide/16 v3, 0x0

    .line 47
    invoke-static {p1, v3, v4, v2, v1}, Ll/ܺ᩶ᩳ;->֫(Ljava/nio/channels/FileChannel;J[BI)V

    .line 48
    new-instance v3, Ll/۬ۜܽ;

    invoke-direct {v3, v2}, Ll/۬ۜܽ;-><init>([B)V

    invoke-virtual {v3}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    const v3, 0x7a67b36c

    if-eq v2, v3, :cond_2

    const v3, 0x7a67b86c

    if-eq v2, v3, :cond_1

    const v3, 0x7a67bf6c

    if-ne v2, v3, :cond_0

    const/high16 v2, 0x20000

    goto :goto_0

    .line 53
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Unsupported legacy text file magic"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const v2, 0x8000

    goto :goto_0

    :cond_2
    const/16 v2, 0x2000

    :goto_0
    iput v2, p0, Ll/ܺ᩶ᩳ;->ܰ:I

    .line 55
    invoke-virtual {p1}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v3

    int-to-long v5, v2

    cmp-long v7, v3, v5

    if-ltz v7, :cond_b

    sub-int/2addr v2, v1

    .line 56
    div-int/lit8 v2, v2, 0x2

    int-to-long v3, v2

    const-wide/16 v5, 0x2

    mul-long v3, v3, v5

    const-wide/16 v7, 0x17

    add-long/2addr v3, v7

    const-wide/16 v7, -0x8

    and-long/2addr v3, v7

    const-wide/16 v7, 0x1090

    add-long/2addr v3, v7

    .line 57
    invoke-virtual {p2, v3, v4}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object p2

    iput-object p2, p0, Ll/ܺ᩶ᩳ;->֫֫:Ll/ۚ۬ᩳ;

    .line 59
    :try_start_0
    new-array p2, v2, [C

    iput-object p2, p0, Ll/ܺ᩶ᩳ;->ۧ֫:[C

    const/16 p2, 0x1000

    new-array p2, p2, [B

    .line 60
    iput-object p2, p0, Ll/ܺ᩶ᩳ;->۫:[B

    const/4 p2, 0x0

    const/4 v1, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x0

    :cond_3
    if-ge v1, v2, :cond_6

    .line 63
    iget-object v7, p0, Ll/ܺ᩶ᩳ;->۫:[B

    array-length v7, v7

    div-int/lit8 v7, v7, 0x2

    sub-int v8, v2, v1

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    int-to-long v8, v1

    mul-long v8, v8, v5

    const-wide/16 v10, 0x4

    add-long/2addr v8, v10

    .line 64
    iget-object v10, p0, Ll/ܺ᩶ᩳ;->۫:[B

    mul-int/lit8 v11, v7, 0x2

    invoke-static {p1, v8, v9, v10, v11}, Ll/ܺ᩶ᩳ;->֫(Ljava/nio/channels/FileChannel;J[BI)V

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_3

    mul-int/lit8 v9, v8, 0x2

    .line 66
    invoke-direct {p0, v9}, Ll/ܺ᩶ᩳ;->ۧ(I)C

    move-result v9

    const v10, 0xffff

    if-ne v9, v10, :cond_4

    goto :goto_2

    :cond_4
    if-ge v9, v2, :cond_5

    .line 68
    iget-object v10, p0, Ll/ܺ᩶ᩳ;->ۧ֫:[C

    aget-char v11, v10, v9

    if-nez v11, :cond_5

    add-int/lit8 v11, v1, 0x1

    int-to-char v11, v11

    .line 69
    aput-char v11, v10, v9

    .line 70
    invoke-static {v3, v9}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/lit8 v4, v4, 0x1

    :goto_2
    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 68
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid legacy text block order"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    add-int/lit8 v3, v3, 0x1

    if-ne v3, v4, :cond_a

    .line 75
    iput v4, p0, Ll/ܺ᩶ᩳ;->۬:I

    const/4 p1, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    .line 79
    :goto_3
    iget v4, p0, Ll/ܺ᩶ᩳ;->۬:I

    if-ge p1, v4, :cond_8

    .line 80
    invoke-direct {p0, p1}, Ll/ܺ᩶ᩳ;->֫(I)V

    .line 81
    iget v4, p0, Ll/ܺ᩶ᩳ;->᩶:I

    int-to-long v4, v4

    add-long/2addr v2, v4

    mul-int/lit8 v1, v1, 0x1f

    .line 82
    iget v4, p0, Ll/ܺ᩶ᩳ;->᩸:I

    add-int/2addr v1, v4

    const-wide/32 v4, 0x7fffffff

    cmp-long v6, v2, v4

    if-gtz v6, :cond_7

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    .line 83
    :cond_7
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Legacy text exceeds coordinate limit"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    long-to-int p1, v2

    .line 85
    iput p1, p0, Ll/ܺ᩶ᩳ;->۟:I

    mul-int/lit8 p1, p1, 0x1f

    if-nez v4, :cond_9

    const v1, 0xf0297a

    :cond_9
    add-int/2addr p1, v1

    .line 87
    iput p1, p0, Ll/ܺ᩶ᩳ;->ܽ֫:I

    .line 88
    iput v0, p0, Ll/ܺ᩶ᩳ;->᩹:I

    .line 89
    iput p2, p0, Ll/ܺ᩶ᩳ;->ۗ:I

    iput p2, p0, Ll/ܺ᩶ᩳ;->᩶:I

    return-void

    .line 74
    :cond_a
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Missing legacy text block ordinal"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    goto :goto_4

    :catch_1
    move-exception p1

    goto :goto_4

    :catch_2
    move-exception p1

    .line 91
    :goto_4
    iget-object p2, p0, Ll/ܺ᩶ᩳ;->֫֫:Ll/ۚ۬ᩳ;

    invoke-virtual {p2}, Ll/ۚ۬ᩳ;->close()V

    .line 92
    throw p1

    .line 55
    :cond_b
    new-instance p1, Ljava/io/EOFException;

    const-string p2, "Truncated legacy text partition table"

    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;)Ll/ܺ᩶ᩳ;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ll/᩻۠ᩴ;

    .line 32
    sget-object v1, Ll/ۘ۠ᩴ;->READ:Ll/ۘ۠ᩴ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p0, v0}, Ll/۫֨ᩴ;->open(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/nio/channels/FileChannel;

    move-result-object p0

    .line 37
    :try_start_0
    new-instance v0, Ll/ܺ᩶ᩳ;

    invoke-direct {v0, p0, p1}, Ll/ܺ᩶ᩳ;-><init>(Ljava/nio/channels/FileChannel;Ll/֨۬ᩳ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    .line 39
    :goto_0
    :try_start_1
    invoke-virtual {p0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_1

    :catch_3
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 40
    :goto_1
    throw p1
.end method

.method private ֫(I)V
    .locals 8

    .line 101
    iget v0, p0, Ll/ܺ᩶ᩳ;->ܰ:I

    int-to-long v0, v0

    iget-object v2, p0, Ll/ܺ᩶ᩳ;->ۧ֫:[C

    aget-char v2, v2, p1

    add-int/lit8 v2, v2, -0x1

    int-to-long v2, v2

    const-wide/32 v4, 0x8000

    mul-long v2, v2, v4

    add-long/2addr v2, v0

    iput-wide v2, p0, Ll/ܺ᩶ᩳ;->ۙ:J

    .line 102
    iget-object v0, p0, Ll/ܺ᩶ᩳ;->ۛ:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v6

    sub-long/2addr v6, v4

    cmp-long v1, v2, v6

    if-gtz v1, :cond_1

    .line 103
    iget-wide v1, p0, Ll/ܺ᩶ᩳ;->ۙ:J

    iget-object v3, p0, Ll/ܺ᩶ᩳ;->۫:[B

    const/16 v4, 0xc

    invoke-static {v0, v1, v2, v3, v4}, Ll/ܺ᩶ᩳ;->֫(Ljava/nio/channels/FileChannel;J[BI)V

    .line 104
    new-instance v0, Ll/۬ۜܽ;

    iget-object v1, p0, Ll/ܺ᩶ᩳ;->۫:[B

    invoke-direct {v0, v1}, Ll/۬ۜܽ;-><init>([B)V

    .line 105
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    .line 106
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    iput v2, p0, Ll/ܺ᩶ᩳ;->᩺:I

    .line 107
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    iput v0, p0, Ll/ܺ᩶ᩳ;->ۨ:I

    .line 108
    iget v2, p0, Ll/ܺ᩶ᩳ;->᩺:I

    if-ltz v2, :cond_0

    if-ltz v0, :cond_0

    const/16 v3, 0x3ffa

    if-gt v2, v3, :cond_0

    rsub-int v3, v2, 0x3ffa

    if-gt v0, v3, :cond_0

    rsub-int v3, v0, 0x3ffa

    .line 111
    iput v3, p0, Ll/ܺ᩶ᩳ;->᩶:I

    mul-int/lit8 v2, v2, 0x1f

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    .line 112
    iget-object v0, p0, Ll/ܺ᩶ᩳ;->ۧ֫:[C

    aget-char v0, v0, p1

    add-int/2addr v2, v0

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ܺ᩶ᩳ;->᩸:I

    const/4 v0, 0x0

    .line 113
    iput v0, p0, Ll/ܺ᩶ᩳ;->ۗ:I

    .line 114
    iput p1, p0, Ll/ܺ᩶ᩳ;->᩹:I

    return-void

    .line 109
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid legacy text gap"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 102
    :cond_1
    new-instance p1, Ljava/io/EOFException;

    const-string v0, "Truncated legacy text block"

    invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ljava/nio/channels/FileChannel;J[BI)V
    .locals 2

    const/4 v0, 0x0

    .line 160
    invoke-static {p3, v0, p4}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p3

    .line 161
    :goto_0
    invoke-virtual {p3}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result p4

    if-eqz p4, :cond_2

    .line 162
    invoke-virtual {p0, p3, p1, p2}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;J)I

    move-result p4

    if-ltz p4, :cond_1

    if-eqz p4, :cond_0

    int-to-long v0, p4

    add-long/2addr p1, v0

    goto :goto_0

    .line 164
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Legacy text read made no progress"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 163
    :cond_1
    new-instance p0, Ljava/io/EOFException;

    const-string p1, "Truncated legacy text data"

    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    return-void
.end method

.method private ۧ(I)C
    .locals 2

    .line 156
    iget-object v0, p0, Ll/ܺ᩶ᩳ;->۫:[B

    aget-byte v1, v0, p1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 p1, p1, 0x1

    aget-byte p1, v0, p1

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p1, v1

    int-to-char p1, p1

    return p1
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 176
    iget-object v0, p0, Ll/ܺ᩶ᩳ;->֫֫:Ll/ۚ۬ᩳ;

    iget-boolean v1, p0, Ll/ܺ᩶ᩳ;->ۤ:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 177
    iput-boolean v1, p0, Ll/ܺ᩶ᩳ;->ۤ:Z

    const/4 v1, 0x0

    .line 178
    :try_start_0
    iget-object v2, p0, Ll/ܺ᩶ᩳ;->ۛ:Ljava/nio/channels/FileChannel;

    invoke-virtual {v2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    iput-object v1, p0, Ll/ܺ᩶ᩳ;->ۧ֫:[C

    iput-object v1, p0, Ll/ܺ᩶ᩳ;->۫:[B

    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V

    return-void

    :catchall_0
    move-exception v2

    iput-object v1, p0, Ll/ܺ᩶ᩳ;->ۧ֫:[C

    iput-object v1, p0, Ll/ܺ᩶ᩳ;->۫:[B

    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V

    throw v2
.end method

.method public final length()I
    .locals 1

    .line 96
    iget v0, p0, Ll/ܺ᩶ᩳ;->۟:I

    return v0
.end method

.method public final read()I
    .locals 7

    .line 170
    iget-boolean v0, p0, Ll/ܺ᩶ᩳ;->ۤ:Z

    if-nez v0, :cond_3

    .line 144
    :goto_0
    iget v0, p0, Ll/ܺ᩶ᩳ;->ۗ:I

    iget v1, p0, Ll/ܺ᩶ᩳ;->᩶:I

    if-ne v0, v1, :cond_1

    .line 145
    iget v0, p0, Ll/ܺ᩶ᩳ;->᩹:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Ll/ܺ᩶ᩳ;->۬:I

    if-ne v0, v1, :cond_0

    const/4 v0, -0x1

    return v0

    .line 146
    :cond_0
    invoke-direct {p0, v0}, Ll/ܺ᩶ᩳ;->֫(I)V

    goto :goto_0

    .line 153
    :cond_1
    iget-wide v1, p0, Ll/ܺ᩶ᩳ;->ۙ:J

    const-wide/16 v3, 0xc

    add-long/2addr v1, v3

    int-to-long v3, v0

    const-wide/16 v5, 0x2

    mul-long v3, v3, v5

    add-long/2addr v3, v1

    iget v1, p0, Ll/ܺ᩶ᩳ;->᩺:I

    const/4 v2, 0x0

    if-lt v0, v1, :cond_2

    iget v0, p0, Ll/ܺ᩶ᩳ;->ۨ:I

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    int-to-long v0, v0

    add-long/2addr v3, v0

    .line 120
    iget-object v0, p0, Ll/ܺ᩶ᩳ;->۫:[B

    const/4 v1, 0x2

    iget-object v5, p0, Ll/ܺ᩶ᩳ;->ۛ:Ljava/nio/channels/FileChannel;

    invoke-static {v5, v3, v4, v0, v1}, Ll/ܺ᩶ᩳ;->֫(Ljava/nio/channels/FileChannel;J[BI)V

    .line 121
    iget v0, p0, Ll/ܺ᩶ᩳ;->ۗ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܺ᩶ᩳ;->ۗ:I

    .line 122
    invoke-direct {p0, v2}, Ll/ܺ᩶ᩳ;->ۧ(I)C

    move-result v0

    return v0

    .line 170
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Legacy text reader is closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final read([CII)I
    .locals 10

    .line 170
    iget-boolean v0, p0, Ll/ܺ᩶ᩳ;->ۤ:Z

    const-string v1, "Legacy text reader is closed"

    if-nez v0, :cond_9

    .line 128
    invoke-static {p1, p2, p3}, Ll/۬᩹ᩳ;->֫([CII)V

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_7

    .line 170
    iget-boolean v2, p0, Ll/ܺ᩶ᩳ;->ۤ:Z

    if-nez v2, :cond_6

    .line 144
    :goto_1
    iget v2, p0, Ll/ܺ᩶ᩳ;->ۗ:I

    iget v3, p0, Ll/ܺ᩶ᩳ;->᩶:I

    if-ne v2, v3, :cond_2

    .line 145
    iget v2, p0, Ll/ܺ᩶ᩳ;->᩹:I

    add-int/lit8 v2, v2, 0x1

    iget v3, p0, Ll/ܺ᩶ᩳ;->۬:I

    if-ne v2, v3, :cond_1

    goto :goto_4

    .line 146
    :cond_1
    invoke-direct {p0, v2}, Ll/ܺ᩶ᩳ;->֫(I)V

    goto :goto_1

    .line 132
    :cond_2
    iget v4, p0, Ll/ܺ᩶ᩳ;->᩺:I

    if-ge v2, v4, :cond_3

    move v3, v4

    :cond_3
    sub-int v4, p3, v0

    sub-int/2addr v3, v2

    .line 133
    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-object v3, p0, Ll/ܺ᩶ᩳ;->۫:[B

    array-length v3, v3

    div-int/lit8 v3, v3, 0x2

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 153
    iget-wide v3, p0, Ll/ܺ᩶ᩳ;->ۙ:J

    const-wide/16 v5, 0xc

    add-long/2addr v3, v5

    iget v5, p0, Ll/ܺ᩶ᩳ;->ۗ:I

    int-to-long v6, v5

    const-wide/16 v8, 0x2

    mul-long v6, v6, v8

    add-long/2addr v6, v3

    iget v3, p0, Ll/ܺ᩶ᩳ;->᩺:I

    if-lt v5, v3, :cond_4

    iget v3, p0, Ll/ܺ᩶ᩳ;->ۨ:I

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    :goto_2
    int-to-long v3, v3

    add-long/2addr v6, v3

    .line 134
    iget-object v3, p0, Ll/ܺ᩶ᩳ;->۫:[B

    mul-int/lit8 v4, v2, 0x2

    iget-object v5, p0, Ll/ܺ᩶ᩳ;->ۛ:Ljava/nio/channels/FileChannel;

    invoke-static {v5, v6, v7, v3, v4}, Ll/ܺ᩶ᩳ;->֫(Ljava/nio/channels/FileChannel;J[BI)V

    const/4 v3, 0x0

    :goto_3
    if-ge v3, v2, :cond_5

    add-int v4, p2, v0

    add-int/2addr v4, v3

    mul-int/lit8 v5, v3, 0x2

    .line 135
    invoke-direct {p0, v5}, Ll/ܺ᩶ᩳ;->ۧ(I)C

    move-result v5

    aput-char v5, p1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_5
    add-int/2addr v0, v2

    .line 137
    iget v3, p0, Ll/ܺ᩶ᩳ;->ۗ:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/ܺ᩶ᩳ;->ۗ:I

    goto :goto_0

    .line 170
    :cond_6
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    :goto_4
    if-nez v0, :cond_8

    const/4 p1, -0x1

    return p1

    :cond_8
    return v0

    :cond_9
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()I
    .locals 1

    .line 98
    iget v0, p0, Ll/ܺ᩶ᩳ;->ܽ֫:I

    return v0
.end method
