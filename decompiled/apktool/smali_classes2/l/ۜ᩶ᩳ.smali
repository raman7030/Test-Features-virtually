.class public final Ll/ۜ᩶ᩳ;
.super Ljava/lang/Object;
.source "A6SP"


# instance fields
.field public final ֫:[B

.field public ۧ:I

.field public final synthetic ܳ:Ll/ۡ᩶ᩳ;

.field public ܽ:J

.field public ܿ:J

.field public ᩳ:J


# direct methods
.method public constructor <init>(Ll/ۡ᩶ᩳ;J)V
    .locals 2

    .line 226
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜ᩶ᩳ;->ܳ:Ll/ۡ᩶ᩳ;

    const/16 p1, 0x2000

    new-array p1, p1, [B

    .line 223
    iput-object p1, p0, Ll/ۜ᩶ᩳ;->֫:[B

    const-wide/16 v0, -0x1

    .line 224
    iput-wide v0, p0, Ll/ۜ᩶ᩳ;->ܽ:J

    .line 226
    iput-wide p2, p0, Ll/ۜ᩶ᩳ;->ᩳ:J

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 9

    const-wide/16 v0, 0x1

    .line 233
    invoke-virtual {p0, v0, v1}, Ll/ۜ᩶ᩳ;->֫(J)J

    .line 234
    iget-wide v2, p0, Ll/ۜ᩶ᩳ;->ܿ:J

    iget-wide v4, p0, Ll/ۜ᩶ᩳ;->ܽ:J

    iget-object v6, p0, Ll/ۜ᩶ᩳ;->֫:[B

    cmp-long v7, v2, v4

    if-ltz v7, :cond_0

    iget v7, p0, Ll/ۜ᩶ᩳ;->ۧ:I

    int-to-long v7, v7

    add-long/2addr v4, v7

    cmp-long v7, v2, v4

    if-ltz v7, :cond_1

    .line 235
    :cond_0
    iput-wide v2, p0, Ll/ۜ᩶ᩳ;->ܽ:J

    .line 236
    iget-object v2, p0, Ll/ۜ᩶ᩳ;->ܳ:Ll/ۡ᩶ᩳ;

    invoke-static {v2}, Ll/ۡ᩶ᩳ;->֫(Ll/ۡ᩶ᩳ;)Ljava/nio/channels/FileChannel;

    move-result-object v2

    invoke-static {v6}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v3

    iget-wide v4, p0, Ll/ۜ᩶ᩳ;->ܿ:J

    invoke-virtual {v2, v3, v4, v5}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;J)I

    move-result v2

    iput v2, p0, Ll/ۜ᩶ᩳ;->ۧ:I

    if-lez v2, :cond_2

    .line 239
    :cond_1
    iget-wide v2, p0, Ll/ۜ᩶ᩳ;->ܿ:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۜ᩶ᩳ;->ܿ:J

    iget-wide v0, p0, Ll/ۜ᩶ᩳ;->ܽ:J

    sub-long/2addr v2, v0

    long-to-int v0, v2

    aget-byte v0, v6, v0

    and-int/lit16 v0, v0, 0xff

    return v0

    .line 237
    :cond_2
    new-instance v0, Ljava/io/EOFException;

    const-string v1, "Truncated legacy state"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(I)I
    .locals 7

    .line 249
    invoke-virtual {p0}, Ll/ۜ᩶ᩳ;->ۧ()I

    move-result v0

    if-ltz v0, :cond_0

    int-to-long v1, v0

    .line 250
    iget-wide v3, p0, Ll/ۜ᩶ᩳ;->ᩳ:J

    iget-wide v5, p0, Ll/ۜ᩶ᩳ;->ܿ:J

    sub-long/2addr v3, v5

    int-to-long v5, p1

    div-long/2addr v3, v5

    cmp-long p1, v1, v3

    if-gtz p1, :cond_0

    return v0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid legacy state item count"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(J)J
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 228
    iget-wide v0, p0, Ll/ۜ᩶ᩳ;->ᩳ:J

    iget-wide v2, p0, Ll/ۜ᩶ᩳ;->ܿ:J

    sub-long/2addr v0, v2

    cmp-long v4, p1, v0

    if-gtz v4, :cond_0

    add-long/2addr v2, p1

    return-wide v2

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    const-string p2, "Invalid legacy state field boundary"

    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫([I)V
    .locals 7

    const/16 v0, 0xc

    .line 255
    invoke-virtual {p0, v0}, Ll/ۜ᩶ᩳ;->֫(I)I

    move-result v0

    const/4 v1, 0x0

    .line 256
    aget v2, p1, v1

    const v3, 0x186a0

    sub-int v4, v3, v2

    if-gt v0, v4, :cond_3

    add-int/2addr v2, v0

    .line 257
    aput v2, p1, v1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    const/16 v2, 0x1c

    .line 259
    invoke-virtual {p0, v2}, Ll/ۜ᩶ᩳ;->֫(I)I

    move-result v2

    if-lez v2, :cond_1

    const/4 v4, 0x1

    .line 260
    aget v5, p1, v4

    sub-int v6, v3, v5

    if-gt v2, v6, :cond_1

    add-int/2addr v5, v2

    .line 261
    aput v5, p1, v4

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v2, :cond_0

    const-wide/16 v5, 0x14

    .line 262
    invoke-virtual {p0, v5, v6}, Ll/ۜ᩶ᩳ;->ۧ(J)V

    invoke-virtual {p0}, Ll/ۜ᩶ᩳ;->ܿ()V

    invoke-virtual {p0}, Ll/ۜ᩶ᩳ;->ܿ()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    const-wide/16 v4, 0x8

    .line 263
    invoke-virtual {p0, v4, v5}, Ll/ۜ᩶ᩳ;->ۧ(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 260
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid legacy history change count"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void

    .line 256
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Legacy history record limit exceeded"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()I
    .locals 2

    .line 241
    invoke-virtual {p0}, Ll/ۜ᩶ᩳ;->֫()I

    move-result v0

    invoke-virtual {p0}, Ll/ۜ᩶ᩳ;->֫()I

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    invoke-virtual {p0}, Ll/ۜ᩶ᩳ;->֫()I

    move-result v1

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    invoke-virtual {p0}, Ll/ۜ᩶ᩳ;->֫()I

    move-result v1

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v0, v1

    return v0
.end method

.method public final ۧ(I)V
    .locals 1

    .line 245
    invoke-virtual {p0}, Ll/ۜ᩶ᩳ;->ۧ()I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid legacy state magic"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(J)V
    .locals 0

    .line 231
    invoke-virtual {p0, p1, p2}, Ll/ۜ᩶ᩳ;->֫(J)J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۜ᩶ᩳ;->ܿ:J

    return-void
.end method

.method public final ܽ()Ll/ۢ᩶ᩳ;
    .locals 7

    .line 267
    iget-wide v0, p0, Ll/ۜ᩶ᩳ;->ܿ:J

    .line 268
    iget-wide v2, p0, Ll/ۜ᩶ᩳ;->ᩳ:J

    sub-long/2addr v2, v0

    const-wide/16 v4, 0x4

    cmp-long v6, v2, v4

    if-ltz v6, :cond_0

    .line 243
    invoke-virtual {p0}, Ll/ۜ᩶ᩳ;->ۧ()I

    move-result v2

    iput-wide v0, p0, Ll/ۜ᩶ᩳ;->ܿ:J

    const v3, -0x5d7d9e7d

    if-ne v2, v3, :cond_0

    .line 268
    invoke-virtual {p0, v4, v5}, Ll/ۜ᩶ᩳ;->ۧ(J)V

    .line 242
    invoke-virtual {p0}, Ll/ۜ᩶ᩳ;->֫()I

    move-result v2

    invoke-virtual {p0}, Ll/ۜ᩶ᩳ;->֫()I

    move-result v3

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v2, v3

    int-to-long v2, v2

    const-wide/16 v4, 0x8

    mul-long v2, v2, v4

    .line 268
    invoke-virtual {p0, v2, v3}, Ll/ۜ᩶ᩳ;->ۧ(J)V

    .line 269
    :cond_0
    iget-object v2, p0, Ll/ۜ᩶ᩳ;->ܳ:Ll/ۡ᩶ᩳ;

    iget-wide v3, p0, Ll/ۜ᩶ᩳ;->ܿ:J

    invoke-static {v2, v0, v1, v3, v4}, Ll/ۡ᩶ᩳ;->֫(Ll/ۡ᩶ᩳ;JJ)Ll/ۢ᩶ᩳ;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()V
    .locals 2

    .line 246
    invoke-virtual {p0}, Ll/ۜ᩶ᩳ;->ۧ()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p0, v0, v1}, Ll/ۜ᩶ᩳ;->ۧ(J)V

    return-void
.end method

.method public final ᩳ()V
    .locals 5

    .line 253
    iget-wide v0, p0, Ll/ۜ᩶ᩳ;->ܿ:J

    iget-wide v2, p0, Ll/ۜ᩶ᩳ;->ᩳ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Trailing bytes in legacy state record"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
