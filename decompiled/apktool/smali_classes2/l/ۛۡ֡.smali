.class public abstract Ll/ۛۡ֡;
.super Ljava/io/OutputStream;
.source "Y7JV"


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public ᩶:[B

.field public final ᩸:Ljava/util/ArrayList;

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 106
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 86
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۛۡ֡;->᩸:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 95
    iput v0, p0, Ll/ۛۡ֡;->ۙ:I

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 290
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0}, Ll/ۛۡ֡;->֫()[B

    move-result-object v1

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method

.method public write(I)V
    .locals 0

    .line 229
    invoke-virtual {p0, p1}, Ll/ۛۡ֡;->ۧ(I)V

    return-void
.end method

.method public final write([B)V
    .locals 2

    const/4 v0, 0x0

    .line 328
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/ۛۡ֡;->write([BII)V

    return-void
.end method

.method public abstract write([BII)V
.end method

.method public final ֫(I)V
    .locals 3

    .line 140
    iget v0, p0, Ll/ۛۡ֡;->ۙ:I

    iget-object v1, p0, Ll/ۛۡ֡;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v0, v2, :cond_0

    .line 142
    iget p1, p0, Ll/ۛۡ֡;->ۗ:I

    iget-object v0, p0, Ll/ۛۡ֡;->᩶:[B

    array-length v0, v0

    add-int/2addr p1, v0

    iput p1, p0, Ll/ۛۡ֡;->ۗ:I

    .line 143
    iget p1, p0, Ll/ۛۡ֡;->ۙ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۛۡ֡;->ۙ:I

    .line 144
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Ll/ۛۡ֡;->᩶:[B

    return-void

    .line 148
    :cond_0
    iget-object v0, p0, Ll/ۛۡ֡;->᩶:[B

    if-nez v0, :cond_2

    if-lez p1, :cond_1

    goto :goto_0

    :cond_1
    const/16 p1, 0x400

    :goto_0
    const/4 v0, 0x0

    .line 151
    iput v0, p0, Ll/ۛۡ֡;->ۗ:I

    goto :goto_1

    .line 153
    :cond_2
    array-length v0, v0

    shl-int/lit8 v0, v0, 0x1

    iget v2, p0, Ll/ۛۡ֡;->ۗ:I

    sub-int/2addr p1, v2

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 154
    iget v0, p0, Ll/ۛۡ֡;->ۗ:I

    iget-object v2, p0, Ll/ۛۡ֡;->᩶:[B

    array-length v2, v2

    add-int/2addr v0, v2

    iput v0, p0, Ll/ۛۡ֡;->ۗ:I

    .line 156
    :goto_1
    iget v0, p0, Ll/ۛۡ֡;->ۙ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۛۡ֡;->ۙ:I

    .line 157
    sget-object v0, Ll/᩹ۢ֡;->֫:[B

    .line 373
    new-array p1, p1, [B

    .line 157
    iput-object p1, p0, Ll/ۛۡ֡;->᩶:[B

    .line 158
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public abstract ֫()[B
.end method

.method public final ۧ(I)V
    .locals 3

    .line 418
    iget v0, p0, Ll/ۛۡ֡;->᩹:I

    iget v1, p0, Ll/ۛۡ֡;->ۗ:I

    sub-int v1, v0, v1

    .line 419
    iget-object v2, p0, Ll/ۛۡ֡;->᩶:[B

    array-length v2, v2

    if-ne v1, v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 420
    invoke-virtual {p0, v0}, Ll/ۛۡ֡;->֫(I)V

    const/4 v1, 0x0

    .line 423
    :cond_0
    iget-object v0, p0, Ll/ۛۡ֡;->᩶:[B

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    .line 424
    iget p1, p0, Ll/ۛۡ֡;->᩹:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۛۡ֡;->᩹:I

    return-void
.end method

.method public final ܽ()[B
    .locals 7

    .line 214
    iget v0, p0, Ll/ۛۡ֡;->᩹:I

    if-nez v0, :cond_0

    .line 216
    sget-object v0, Ll/᩹ۢ֡;->֫:[B

    return-object v0

    .line 218
    :cond_0
    sget-object v1, Ll/᩹ۢ֡;->֫:[B

    .line 373
    new-array v1, v0, [B

    .line 220
    iget-object v2, p0, Ll/ۛۡ֡;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [B

    .line 221
    array-length v6, v5

    invoke-static {v6, v0}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 222
    invoke-static {v5, v3, v1, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v4, v6

    sub-int/2addr v0, v6

    if-nez v0, :cond_1

    :cond_2
    return-object v1
.end method

.method public final ܿ(II[B)V
    .locals 6

    .line 370
    iget v0, p0, Ll/ۛۡ֡;->᩹:I

    add-int v1, v0, p2

    .line 372
    iget v2, p0, Ll/ۛۡ֡;->ۗ:I

    sub-int/2addr v0, v2

    move v2, p2

    :cond_0
    :goto_0
    if-lez v2, :cond_1

    .line 374
    iget-object v3, p0, Ll/ۛۡ֡;->᩶:[B

    array-length v3, v3

    sub-int/2addr v3, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    add-int v4, p1, p2

    sub-int/2addr v4, v2

    .line 375
    iget-object v5, p0, Ll/ۛۡ֡;->᩶:[B

    invoke-static {p3, v4, v5, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int/2addr v2, v3

    if-lez v2, :cond_0

    .line 378
    invoke-virtual {p0, v1}, Ll/ۛۡ֡;->֫(I)V

    const/4 v0, 0x0

    goto :goto_0

    .line 382
    :cond_1
    iput v1, p0, Ll/ۛۡ֡;->᩹:I

    return-void
.end method
