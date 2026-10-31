.class public final Ll/֫ۗ֡;
.super Ljava/lang/Object;
.source "J5T5"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:[B


# direct methods
.method public constructor <init>([B)V
    .locals 1

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 83
    iput v0, p0, Ll/֫ۗ֡;->֫:I

    .line 120
    iput-object p1, p0, Ll/֫ۗ֡;->ܽ:[B

    .line 121
    iput v0, p0, Ll/֫ۗ֡;->ۧ:I

    return-void
.end method

.method public static ܽ()V
    .locals 2

    .line 612
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "attempt to write past the end"

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 433
    iget v0, p0, Ll/֫ۗ֡;->֫:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/֫ۗ֡;->֫:I

    if-gez v0, :cond_0

    const/4 v0, 0x0

    .line 435
    iput v0, p0, Ll/֫ۗ֡;->֫:I

    :cond_0
    return-void
.end method

.method public final ֫(I)V
    .locals 1

    add-int/lit8 v0, p1, -0x1

    if-ltz p1, :cond_1

    and-int/2addr p1, v0

    if-nez p1, :cond_1

    .line 385
    iget p1, p0, Ll/֫ۗ֡;->ۧ:I

    add-int/2addr p1, v0

    not-int v0, v0

    and-int/2addr p1, v0

    .line 389
    iget-object v0, p0, Ll/֫ۗ֡;->ܽ:[B

    array-length v0, v0

    if-gt p1, v0, :cond_0

    .line 399
    iput p1, p0, Ll/֫ۗ֡;->ۧ:I

    return-void

    .line 390
    :cond_0
    invoke-static {}, Ll/֫ۗ֡;->ܽ()V

    const/4 p1, 0x0

    throw p1

    .line 382
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "bogus alignment"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(J)V
    .locals 6

    .line 232
    iget v0, p0, Ll/֫ۗ֡;->ۧ:I

    add-int/lit8 v1, v0, 0x8

    .line 237
    iget-object v2, p0, Ll/֫ۗ֡;->ܽ:[B

    array-length v3, v2

    if-gt v1, v3, :cond_0

    long-to-int v3, p1

    int-to-byte v4, v3

    .line 243
    aput-byte v4, v2, v0

    add-int/lit8 v4, v0, 0x1

    shr-int/lit8 v5, v3, 0x8

    int-to-byte v5, v5

    .line 244
    aput-byte v5, v2, v4

    add-int/lit8 v4, v0, 0x2

    shr-int/lit8 v5, v3, 0x10

    int-to-byte v5, v5

    .line 245
    aput-byte v5, v2, v4

    add-int/lit8 v4, v0, 0x3

    shr-int/lit8 v3, v3, 0x18

    int-to-byte v3, v3

    .line 246
    aput-byte v3, v2, v4

    const/16 v3, 0x20

    shr-long/2addr p1, v3

    long-to-int p2, p1

    add-int/lit8 p1, v0, 0x4

    int-to-byte v3, p2

    .line 249
    aput-byte v3, v2, p1

    add-int/lit8 p1, v0, 0x5

    shr-int/lit8 v3, p2, 0x8

    int-to-byte v3, v3

    .line 250
    aput-byte v3, v2, p1

    add-int/lit8 p1, v0, 0x6

    shr-int/lit8 v3, p2, 0x10

    int-to-byte v3, v3

    .line 251
    aput-byte v3, v2, p1

    add-int/lit8 v0, v0, 0x7

    shr-int/lit8 p1, p2, 0x18

    int-to-byte p1, p1

    .line 252
    aput-byte p1, v2, v0

    .line 254
    iput v1, p0, Ll/֫ۗ֡;->ۧ:I

    return-void

    .line 238
    :cond_0
    invoke-static {}, Ll/֫ۗ֡;->ܽ()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final ֫([BII)V
    .locals 4

    .line 321
    iget v0, p0, Ll/֫ۗ֡;->ۧ:I

    add-int v1, v0, p3

    add-int v2, p2, p3

    or-int v3, p2, p3

    or-int/2addr v3, v1

    if-ltz v3, :cond_1

    .line 326
    array-length v3, p1

    if-gt v2, v3, :cond_1

    .line 334
    iget-object v2, p0, Ll/֫ۗ֡;->ܽ:[B

    array-length v3, v2

    if-gt v1, v3, :cond_0

    .line 339
    invoke-static {p1, p2, v2, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 340
    iput v1, p0, Ll/֫ۗ֡;->ۧ:I

    return-void

    .line 335
    :cond_0
    invoke-static {}, Ll/֫ۗ֡;->ܽ()V

    const/4 p1, 0x0

    throw p1

    .line 327
    :cond_1
    new-instance p3, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "bytes.length "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length p1, p1

    const-string v2, "; "

    const-string v3, "..!"

    .line 0
    invoke-static {v0, p1, v2, p2, v3}, Ll/ۛۙܽ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 327
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p3
.end method

.method public final ۧ()V
    .locals 1

    .line 429
    iget v0, p0, Ll/֫ۗ֡;->֫:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/֫ۗ֡;->֫:I

    return-void
.end method

.method public final ۧ(I)V
    .locals 4

    .line 174
    iget v0, p0, Ll/֫ۗ֡;->ۧ:I

    add-int/lit8 v1, v0, 0x1

    .line 179
    iget-object v2, p0, Ll/֫ۗ֡;->ܽ:[B

    array-length v3, v2

    if-gt v1, v3, :cond_0

    int-to-byte p1, p1

    .line 184
    aput-byte p1, v2, v0

    .line 185
    iput v1, p0, Ll/֫ۗ֡;->ۧ:I

    return-void

    .line 180
    :cond_0
    invoke-static {}, Ll/֫ۗ֡;->ܽ()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final ܳ(I)I
    .locals 12

    int-to-long v0, p1

    const-wide v2, 0xffffffffL

    and-long/2addr v2, v0

    const/4 p1, 0x7

    shr-long/2addr v2, p1

    const/4 v4, 0x0

    :goto_0
    move-wide v10, v0

    move-wide v0, v2

    move-wide v2, v10

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x7f

    cmp-long v9, v0, v5

    if-eqz v9, :cond_0

    and-long/2addr v2, v7

    long-to-int v3, v2

    or-int/lit16 v2, v3, 0x80

    .line 266
    invoke-virtual {p0, v2}, Ll/֫ۗ֡;->ۧ(I)V

    shr-long v2, v0, p1

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    and-long v0, v2, v7

    long-to-int p1, v0

    .line 272
    invoke-virtual {p0, p1}, Ll/֫ۗ֡;->ۧ(I)V

    add-int/lit8 v4, v4, 0x1

    return v4
.end method

.method public final ܽ(I)V
    .locals 5

    .line 211
    iget v0, p0, Ll/֫ۗ֡;->ۧ:I

    add-int/lit8 v1, v0, 0x4

    .line 216
    iget-object v2, p0, Ll/֫ۗ֡;->ܽ:[B

    array-length v3, v2

    if-gt v1, v3, :cond_0

    int-to-byte v3, p1

    .line 221
    aput-byte v3, v2, v0

    add-int/lit8 v3, v0, 0x1

    shr-int/lit8 v4, p1, 0x8

    int-to-byte v4, v4

    .line 222
    aput-byte v4, v2, v3

    add-int/lit8 v3, v0, 0x2

    shr-int/lit8 v4, p1, 0x10

    int-to-byte v4, v4

    .line 223
    aput-byte v4, v2, v3

    add-int/lit8 v0, v0, 0x3

    shr-int/lit8 p1, p1, 0x18

    int-to-byte p1, p1

    .line 224
    aput-byte p1, v2, v0

    .line 225
    iput v1, p0, Ll/֫ۗ֡;->ۧ:I

    return-void

    .line 217
    :cond_0
    invoke-static {}, Ll/֫ۗ֡;->ܽ()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final ܿ(I)I
    .locals 6

    shr-int/lit8 v0, p1, 0x7

    const/high16 v1, -0x80000000

    and-int/2addr v1, p1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    :goto_0
    const/4 v2, 0x1

    const/4 v3, 0x0

    :goto_1
    move v5, v0

    move v0, p1

    move p1, v5

    if-eqz v2, :cond_4

    if-ne p1, v1, :cond_2

    and-int/lit8 v2, p1, 0x1

    shr-int/lit8 v4, v0, 0x6

    and-int/lit8 v4, v4, 0x1

    if-eq v2, v4, :cond_1

    goto :goto_2

    :cond_1
    const/4 v2, 0x0

    goto :goto_3

    :cond_2
    :goto_2
    const/4 v2, 0x1

    :goto_3
    and-int/lit8 v0, v0, 0x7f

    if-eqz v2, :cond_3

    const/16 v4, 0x80

    goto :goto_4

    :cond_3
    const/4 v4, 0x0

    :goto_4
    or-int/2addr v0, v4

    .line 289
    invoke-virtual {p0, v0}, Ll/֫ۗ֡;->ۧ(I)V

    shr-int/lit8 v0, p1, 0x7

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    return v3
.end method

.method public final ᩳ(I)V
    .locals 4

    .line 192
    iget v0, p0, Ll/֫ۗ֡;->ۧ:I

    add-int/lit8 v1, v0, 0x2

    .line 197
    iget-object v2, p0, Ll/֫ۗ֡;->ܽ:[B

    array-length v3, v2

    if-gt v1, v3, :cond_0

    int-to-byte v3, p1

    .line 202
    aput-byte v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    shr-int/lit8 p1, p1, 0x8

    int-to-byte p1, p1

    .line 203
    aput-byte p1, v2, v0

    .line 204
    iput v1, p0, Ll/֫ۗ֡;->ۧ:I

    return-void

    .line 198
    :cond_0
    invoke-static {}, Ll/֫ۗ֡;->ܽ()V

    const/4 p1, 0x0

    throw p1
.end method
