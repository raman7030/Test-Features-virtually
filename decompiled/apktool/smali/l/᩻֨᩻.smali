.class public final Ll/᩻֨᩻;
.super Ljava/io/InputStream;
.source "M9Q4"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final synthetic ۗ:Ll/ᩴ֨᩻;

.field public ۙ:[B

.field public final synthetic ۤ:Ljava/util/Iterator;

.field public final synthetic ۫:I

.field public final synthetic ۬:J

.field public ᩶:J

.field public ᩸:Ljava/io/InputStream;

.field public ᩹:J


# direct methods
.method public constructor <init>(Ll/ᩴ֨᩻;Ljava/util/Iterator;IJ)V
    .locals 0

    .line 182
    iput-object p1, p0, Ll/᩻֨᩻;->ۗ:Ll/ᩴ֨᩻;

    iput-object p2, p0, Ll/᩻֨᩻;->ۤ:Ljava/util/Iterator;

    iput p3, p0, Ll/᩻֨᩻;->۫:I

    iput-wide p4, p0, Ll/᩻֨᩻;->۬:J

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const-wide/16 p1, 0x0

    .line 185
    iput-wide p1, p0, Ll/᩻֨᩻;->᩶:J

    .line 186
    iput-wide p1, p0, Ll/᩻֨᩻;->᩹:J

    .line 189
    invoke-direct {p0}, Ll/᩻֨᩻;->֫()V

    return-void
.end method

.method private ֫()V
    .locals 12

    .line 203
    iget-object v0, p0, Ll/᩻֨᩻;->ۤ:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    .line 204
    iput-object v0, p0, Ll/᩻֨᩻;->᩸:Ljava/io/InputStream;

    return-void

    .line 207
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ܶ᩻;

    .line 209
    invoke-virtual {v0}, Ll/֫ܶ᩻;->getDstExtentsList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-wide/16 v2, 0x0

    move-wide v4, v2

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۫۠᩻;

    .line 210
    invoke-virtual {v6}, Ll/۫۠᩻;->getNumBlocks()J

    move-result-wide v6

    iget v8, p0, Ll/᩻֨᩻;->۫:I

    int-to-long v8, v8

    mul-long v6, v6, v8

    add-long/2addr v4, v6

    goto :goto_0

    .line 212
    :cond_1
    iput-wide v4, p0, Ll/᩻֨᩻;->᩶:J

    .line 213
    iput-wide v2, p0, Ll/᩻֨᩻;->᩹:J

    .line 214
    invoke-virtual {v0}, Ll/֫ܶ᩻;->getType()Ll/۟۠᩻;

    move-result-object v1

    sget-object v2, Ll/۟۠᩻;->ZERO:Ll/۟۠᩻;

    if-ne v1, v2, :cond_2

    .line 215
    new-instance v0, Ll/ۚۛۡ;

    invoke-direct {v0, v4, v5}, Ll/ۚۛۡ;-><init>(J)V

    iput-object v0, p0, Ll/᩻֨᩻;->᩸:Ljava/io/InputStream;

    return-void

    .line 218
    :cond_2
    invoke-virtual {v0}, Ll/֫ܶ᩻;->getDataLength()J

    move-result-wide v10

    .line 219
    iget-wide v1, p0, Ll/᩻֨᩻;->۬:J

    invoke-virtual {v0}, Ll/֫ܶ᩻;->getDataOffset()J

    move-result-wide v3

    add-long v8, v3, v1

    .line 220
    new-instance v1, Ll/ۖ֨᩻;

    iget-object v2, p0, Ll/᩻֨᩻;->ۗ:Ll/ᩴ֨᩻;

    invoke-static {v2}, Ll/ᩴ֨᩻;->֫(Ll/ᩴ֨᩻;)Ll/۠ۖܽ;

    move-result-object v7

    move-object v6, v1

    invoke-direct/range {v6 .. v11}, Ll/ۖ֨᩻;-><init>(Ll/۠ۖܽ;JJ)V

    .line 221
    sget-object v2, Ll/᩷֨᩻;->֫:[I

    invoke-virtual {v0}, Ll/֫ܶ᩻;->getType()Ll/۟۠᩻;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_8

    const/4 v3, 0x2

    const/high16 v4, 0x20000

    if-eq v2, v3, :cond_6

    const/4 v3, 0x3

    if-eq v2, v3, :cond_4

    const/4 v3, 0x4

    if-ne v2, v3, :cond_3

    .line 234
    new-instance v0, Lcom/github/luben/zstd/ZstdInputStream;

    sget-object v2, Lcom/github/luben/zstd/RecyclingBufferPool;->INSTANCE:Lcom/github/luben/zstd/BufferPool;

    invoke-direct {v0, v1, v2}, Lcom/github/luben/zstd/ZstdInputStream;-><init>(Ljava/io/InputStream;Lcom/github/luben/zstd/BufferPool;)V

    iput-object v0, p0, Ll/᩻֨᩻;->᩸:Ljava/io/InputStream;

    return-void

    .line 237
    :cond_3
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unsupported operation type: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/֫ܶ᩻;->getType()Ll/۟۠᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟۠᩻;->getNumber()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 230
    :cond_4
    new-instance v0, Ll/ᩴܺᩴ;

    .line 245
    iget-object v2, p0, Ll/᩻֨᩻;->ۙ:[B

    if-nez v2, :cond_5

    new-array v2, v4, [B

    .line 247
    iput-object v2, p0, Ll/᩻֨᩻;->ۙ:[B

    .line 231
    :cond_5
    invoke-direct {v0, v1, v2}, Ll/ᩴܺᩴ;-><init>(Ljava/io/InputStream;[B)V

    .line 230
    invoke-static {v0}, Ll/֨ۨۡ;->֫(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, p0, Ll/᩻֨᩻;->᩸:Ljava/io/InputStream;

    return-void

    .line 226
    :cond_6
    new-instance v0, Ll/ۢ۠֡;

    new-instance v2, Ll/ᩴܺᩴ;

    .line 245
    iget-object v3, p0, Ll/᩻֨᩻;->ۙ:[B

    if-nez v3, :cond_7

    new-array v3, v4, [B

    .line 247
    iput-object v3, p0, Ll/᩻֨᩻;->ۙ:[B

    .line 227
    :cond_7
    invoke-direct {v2, v1, v3}, Ll/ᩴܺᩴ;-><init>(Ljava/io/InputStream;[B)V

    invoke-direct {v0, v2}, Ll/ۢ۠֡;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Ll/᩻֨᩻;->᩸:Ljava/io/InputStream;

    return-void

    .line 223
    :cond_8
    iput-object v1, p0, Ll/᩻֨᩻;->᩸:Ljava/io/InputStream;

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 1

    .line 253
    iget-object v0, p0, Ll/᩻֨᩻;->᩸:Ljava/io/InputStream;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 256
    :cond_0
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    return v0
.end method

.method public final close()V
    .locals 1

    .line 293
    iget-object v0, p0, Ll/᩻֨᩻;->᩸:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    .line 294
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    const/4 v0, 0x0

    .line 295
    iput-object v0, p0, Ll/᩻֨᩻;->᩸:Ljava/io/InputStream;

    :cond_0
    return-void
.end method

.method public final read()I
    .locals 5

    .line 260
    :goto_0
    iget-object v0, p0, Ll/᩻֨᩻;->᩸:Ljava/io/InputStream;

    const/4 v1, -0x1

    if-eqz v0, :cond_3

    .line 261
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 263
    iget-wide v1, p0, Ll/᩻֨᩻;->᩹:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/᩻֨᩻;->᩹:J

    return v0

    .line 193
    :cond_0
    iget-object v0, p0, Ll/᩻֨᩻;->᩸:Ljava/io/InputStream;

    if-eqz v0, :cond_2

    .line 194
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 195
    iget-wide v0, p0, Ll/᩻֨᩻;->᩶:J

    iget-wide v2, p0, Ll/᩻֨᩻;->᩹:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    goto :goto_1

    .line 196
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Size check fail"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 199
    :cond_2
    :goto_1
    invoke-direct {p0}, Ll/᩻֨᩻;->֫()V

    goto :goto_0

    :cond_3
    return v1
.end method

.method public final read([BII)I
    .locals 5

    .line 272
    iget-object v0, p0, Ll/᩻֨᩻;->᩸:Ljava/io/InputStream;

    if-nez v0, :cond_0

    goto :goto_1

    .line 275
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ltz p2, :cond_5

    if-ltz p3, :cond_5

    .line 276
    array-length v0, p1

    sub-int/2addr v0, p2

    if-gt p3, v0, :cond_5

    if-nez p3, :cond_1

    const/4 p1, 0x0

    return p1

    .line 282
    :cond_1
    iget-object v0, p0, Ll/᩻֨᩻;->᩸:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    if-lez v0, :cond_2

    .line 284
    iget-wide p1, p0, Ll/᩻֨᩻;->᩹:J

    int-to-long v1, v0

    add-long/2addr p1, v1

    iput-wide p1, p0, Ll/᩻֨᩻;->᩹:J

    return v0

    .line 193
    :cond_2
    iget-object v0, p0, Ll/᩻֨᩻;->᩸:Ljava/io/InputStream;

    if-eqz v0, :cond_4

    .line 194
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 195
    iget-wide v0, p0, Ll/᩻֨᩻;->᩶:J

    iget-wide v2, p0, Ll/᩻֨᩻;->᩹:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_3

    goto :goto_0

    .line 196
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Size check fail"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 199
    :cond_4
    :goto_0
    invoke-direct {p0}, Ll/᩻֨᩻;->֫()V

    .line 288
    iget-object v0, p0, Ll/᩻֨᩻;->᩸:Ljava/io/InputStream;

    if-nez v0, :cond_1

    :goto_1
    const/4 p1, -0x1

    return p1

    .line 277
    :cond_5
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
