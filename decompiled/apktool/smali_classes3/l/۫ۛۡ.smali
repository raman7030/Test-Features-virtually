.class public final Ll/۫ۛۡ;
.super Ljava/lang/Object;
.source "86JZ"


# instance fields
.field public ֫:I

.field public final ۧ:[B

.field public ܽ:J

.field public final ܿ:Ljava/io/InputStream;

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    .line 309
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x8000

    new-array v0, v0, [B

    .line 306
    iput-object v0, p0, Ll/۫ۛۡ;->ۧ:[B

    const-wide/16 v0, 0x12

    .line 307
    iput-wide v0, p0, Ll/۫ۛۡ;->ܽ:J

    .line 309
    iput-object p1, p0, Ll/۫ۛۡ;->ܿ:Ljava/io/InputStream;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 9

    .line 312
    iget-wide v0, p0, Ll/۫ۛۡ;->ܽ:J

    const-wide/32 v2, 0x10000000

    cmp-long v4, v0, v2

    if-gez v4, :cond_4

    .line 313
    iget v4, p0, Ll/۫ۛۡ;->֫:I

    iget v5, p0, Ll/۫ۛۡ;->ᩳ:I

    const-wide/16 v6, 0x1

    iget-object v8, p0, Ll/۫ۛۡ;->ۧ:[B

    if-ne v4, v5, :cond_3

    .line 314
    array-length v4, v8

    int-to-long v4, v4

    sub-long/2addr v2, v0

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    iget-object v0, p0, Ll/۫ۛۡ;->ܿ:Ljava/io/InputStream;

    const/4 v2, 0x0

    invoke-virtual {v0, v8, v2, v1}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    iput v1, p0, Ll/۫ۛۡ;->ᩳ:I

    .line 315
    iput v2, p0, Ll/۫ۛۡ;->֫:I

    const-string v2, "Truncated TGA pixels"

    if-nez v1, :cond_1

    .line 317
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-ltz v0, :cond_0

    .line 319
    iget-wide v1, p0, Ll/۫ۛۡ;->ܽ:J

    add-long/2addr v1, v6

    iput-wide v1, p0, Ll/۫ۛۡ;->ܽ:J

    return v0

    .line 318
    :cond_0
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0, v2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    if-ltz v1, :cond_2

    goto :goto_0

    .line 322
    :cond_2
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0, v2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 324
    :cond_3
    :goto_0
    iget-wide v0, p0, Ll/۫ۛۡ;->ܽ:J

    add-long/2addr v0, v6

    iput-wide v0, p0, Ll/۫ۛۡ;->ܽ:J

    .line 325
    iget v0, p0, Ll/۫ۛۡ;->֫:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/۫ۛۡ;->֫:I

    aget-byte v0, v8, v0

    and-int/lit16 v0, v0, 0xff

    return v0

    .line 312
    :cond_4
    new-instance v0, Ll/ۛۛۡ;

    const-string v1, "TGA input exceeds byte limit"

    .line 291
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 312
    throw v0
.end method

.method public final ֫(J)V
    .locals 5

    const-wide/16 v0, 0x12

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    const-wide/32 v0, 0x10000000

    cmp-long v2, p1, v0

    if-gtz v2, :cond_1

    .line 330
    iget-wide v0, p0, Ll/۫ۛۡ;->ܽ:J

    iget v2, p0, Ll/۫ۛۡ;->֫:I

    int-to-long v2, v2

    sub-long/2addr v0, v2

    .line 331
    iget v2, p0, Ll/۫ۛۡ;->ᩳ:I

    if-lez v2, :cond_0

    cmp-long v3, p1, v0

    if-ltz v3, :cond_0

    int-to-long v2, v2

    add-long/2addr v2, v0

    cmp-long v4, p1, v2

    if-gtz v4, :cond_0

    sub-long v0, p1, v0

    long-to-int v1, v0

    .line 332
    iput v1, p0, Ll/۫ۛۡ;->֫:I

    .line 333
    iput-wide p1, p0, Ll/۫ۛۡ;->ܽ:J

    return-void

    .line 336
    :cond_0
    iget-object v0, p0, Ll/۫ۛۡ;->ܿ:Ljava/io/InputStream;

    check-cast v0, Ljava/io/FileInputStream;

    invoke-static {v0}, Ll/᩶ᩴᩳ;->֫(Ljava/io/FileInputStream;)Ljava/nio/channels/FileChannel;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    .line 337
    iput-wide p1, p0, Ll/۫ۛۡ;->ܽ:J

    const/4 p1, 0x0

    .line 338
    iput p1, p0, Ll/۫ۛۡ;->ᩳ:I

    iput p1, p0, Ll/۫ۛۡ;->֫:I

    return-void

    .line 329
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid TGA offset"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
