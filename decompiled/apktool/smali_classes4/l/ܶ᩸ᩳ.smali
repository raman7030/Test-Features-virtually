.class public final Ll/ܶ᩸ᩳ;
.super Ljava/lang/Object;
.source "S9AL"

# interfaces
.implements Ljava/lang/CharSequence;
.implements Landroid/text/GetChars;


# instance fields
.field public ᩶:I

.field public ᩸:[C

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 260
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v1, v0, [C

    .line 261
    iput-object v1, p0, Ll/ܶ᩸ᩳ;->᩸:[C

    .line 263
    iput v0, p0, Ll/ܶ᩸ᩳ;->᩹:I

    return-void
.end method

.method private ۧ(I)V
    .locals 4

    .line 349
    iget v0, p0, Ll/ܶ᩸ᩳ;->᩶:I

    if-ge p1, v0, :cond_0

    sub-int/2addr v0, p1

    .line 351
    iget-object v1, p0, Ll/ܶ᩸ᩳ;->᩸:[C

    iget v2, p0, Ll/ܶ᩸ᩳ;->᩹:I

    sub-int/2addr v2, v0

    invoke-static {v1, p1, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 352
    iget v1, p0, Ll/ܶ᩸ᩳ;->᩹:I

    sub-int/2addr v1, v0

    iput v1, p0, Ll/ܶ᩸ᩳ;->᩹:I

    goto :goto_0

    :cond_0
    if-le p1, v0, :cond_1

    sub-int v1, p1, v0

    .line 355
    iget-object v2, p0, Ll/ܶ᩸ᩳ;->᩸:[C

    iget v3, p0, Ll/ܶ᩸ᩳ;->᩹:I

    invoke-static {v2, v3, v2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 356
    iget v0, p0, Ll/ܶ᩸ᩳ;->᩹:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/ܶ᩸ᩳ;->᩹:I

    .line 358
    :cond_1
    :goto_0
    iput p1, p0, Ll/ܶ᩸ᩳ;->᩶:I

    return-void
.end method


# virtual methods
.method public final charAt(I)C
    .locals 3

    if-ltz p1, :cond_1

    .line 272
    invoke-virtual {p0}, Ll/ܶ᩸ᩳ;->length()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 273
    iget-object v0, p0, Ll/ܶ᩸ᩳ;->᩸:[C

    iget v1, p0, Ll/ܶ᩸ᩳ;->᩶:I

    if-ge p1, v1, :cond_0

    goto :goto_0

    :cond_0
    iget v2, p0, Ll/ܶ᩸ᩳ;->᩹:I

    add-int/2addr p1, v2

    sub-int/2addr p1, v1

    :goto_0
    aget-char p1, v0, p1

    return p1

    .line 272
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final clear()V
    .locals 1

    const/4 v0, 0x0

    .line 362
    iput v0, p0, Ll/ܶ᩸ᩳ;->᩶:I

    .line 363
    iget-object v0, p0, Ll/ܶ᩸ᩳ;->᩸:[C

    array-length v0, v0

    iput v0, p0, Ll/ܶ᩸ᩳ;->᩹:I

    return-void
.end method

.method public final delete(II)V
    .locals 1

    if-ltz p1, :cond_1

    if-lt p2, p1, :cond_1

    .line 323
    invoke-virtual {p0}, Ll/ܶ᩸ᩳ;->length()I

    move-result v0

    if-gt p2, v0, :cond_1

    if-ne p1, p2, :cond_0

    return-void

    .line 325
    :cond_0
    invoke-direct {p0, p1}, Ll/ܶ᩸ᩳ;->ۧ(I)V

    .line 326
    iget v0, p0, Ll/ܶ᩸ᩳ;->᩹:I

    sub-int/2addr p2, p1

    add-int/2addr p2, v0

    iput p2, p0, Ll/ܶ᩸ᩳ;->᩹:I

    return-void

    .line 323
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final getChars(II[CI)V
    .locals 3

    if-ltz p1, :cond_2

    if-lt p2, p1, :cond_2

    .line 287
    invoke-virtual {p0}, Ll/ܶ᩸ᩳ;->length()I

    move-result v0

    if-gt p2, v0, :cond_2

    if-ltz p4, :cond_2

    sub-int v0, p2, p1

    array-length v1, p3

    sub-int/2addr v1, p4

    if-gt v0, v1, :cond_2

    .line 291
    iget v0, p0, Ll/ܶ᩸ᩳ;->᩶:I

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 293
    iget-object v1, p0, Ll/ܶ᩸ᩳ;->᩸:[C

    sub-int v2, v0, p1

    invoke-static {v1, p1, p3, p4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p4, v2

    move p1, v0

    :cond_0
    if-ge p1, p2, :cond_1

    .line 298
    iget-object v0, p0, Ll/ܶ᩸ᩳ;->᩸:[C

    iget v1, p0, Ll/ܶ᩸ᩳ;->᩹:I

    add-int/2addr v1, p1

    iget v2, p0, Ll/ܶ᩸ᩳ;->᩶:I

    sub-int/2addr v1, v2

    sub-int/2addr p2, p1

    invoke-static {v0, v1, p3, p4, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    return-void

    .line 289
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final length()I
    .locals 2

    .line 267
    iget-object v0, p0, Ll/ܶ᩸ᩳ;->᩸:[C

    array-length v0, v0

    iget v1, p0, Ll/ܶ᩸ᩳ;->᩹:I

    sub-int/2addr v0, v1

    iget v1, p0, Ll/ܶ᩸ᩳ;->᩶:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 2

    if-ltz p1, :cond_0

    if-lt p2, p1, :cond_0

    .line 279
    invoke-virtual {p0}, Ll/ܶ᩸ᩳ;->length()I

    move-result v0

    if-gt p2, v0, :cond_0

    sub-int v0, p2, p1

    .line 280
    new-array v0, v0, [C

    const/4 v1, 0x0

    .line 281
    invoke-virtual {p0, p1, p2, v0, v1}, Ll/ܶ᩸ᩳ;->getChars(II[CI)V

    .line 282
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/lang/String;-><init>([C)V

    return-object p1

    .line 279
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 370
    invoke-virtual {p0}, Ll/ܶ᩸ᩳ;->length()I

    move-result v0

    invoke-direct {p0, v0}, Ll/ܶ᩸ᩳ;->ۧ(I)V

    .line 371
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Ll/ܶ᩸ᩳ;->᩸:[C

    const/4 v2, 0x0

    iget v3, p0, Ll/ܶ᩸ᩳ;->᩶:I

    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method public final ֫(IIILjava/lang/CharSequence;)V
    .locals 11

    if-ltz p1, :cond_8

    .line 307
    invoke-virtual {p0}, Ll/ܶ᩸ᩳ;->length()I

    move-result v0

    if-gt p1, v0, :cond_8

    if-ltz p2, :cond_8

    if-lt p3, p2, :cond_8

    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p3, v0, :cond_8

    sub-int v0, p3, p2

    if-nez v0, :cond_0

    return-void

    .line 330
    :cond_0
    iget v1, p0, Ll/ܶ᩸ᩳ;->᩹:I

    iget v2, p0, Ll/ܶ᩸ᩳ;->᩶:I

    sub-int/2addr v1, v2

    const/4 v2, 0x0

    if-gt v0, v1, :cond_1

    .line 331
    invoke-direct {p0, p1}, Ll/ܶ᩸ᩳ;->ۧ(I)V

    goto :goto_0

    .line 334
    :cond_1
    invoke-virtual {p0}, Ll/ܶ᩸ᩳ;->length()I

    move-result v1

    int-to-long v3, v1

    int-to-long v5, v0

    add-long/2addr v3, v5

    const-wide/32 v5, 0x7ffffff7

    cmp-long v7, v3, v5

    if-gtz v7, :cond_7

    .line 337
    iget-object v7, p0, Ll/ܶ᩸ᩳ;->᩸:[C

    array-length v7, v7

    int-to-long v7, v7

    const-wide/16 v9, 0x2

    mul-long v7, v7, v9

    .line 338
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    .line 337
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v4, v3

    .line 339
    new-array v3, v4, [C

    sub-int v5, v1, p1

    sub-int/2addr v4, v5

    .line 341
    invoke-virtual {p0, v2, p1, v3, v2}, Ll/ܶ᩸ᩳ;->getChars(II[CI)V

    .line 342
    invoke-virtual {p0, p1, v1, v3, v4}, Ll/ܶ᩸ᩳ;->getChars(II[CI)V

    .line 343
    iput-object v3, p0, Ll/ܶ᩸ᩳ;->᩸:[C

    .line 344
    iput p1, p0, Ll/ܶ᩸ᩳ;->᩶:I

    .line 345
    iput v4, p0, Ll/ܶ᩸ᩳ;->᩹:I

    .line 314
    :goto_0
    instance-of p1, p4, Landroid/text/GetChars;

    if-eqz p1, :cond_2

    check-cast p4, Landroid/text/GetChars;

    iget-object p1, p0, Ll/ܶ᩸ᩳ;->᩸:[C

    iget v1, p0, Ll/ܶ᩸ᩳ;->᩶:I

    invoke-interface {p4, p2, p3, p1, v1}, Landroid/text/GetChars;->getChars(II[CI)V

    goto :goto_2

    .line 315
    :cond_2
    instance-of p1, p4, Ljava/lang/String;

    if-eqz p1, :cond_3

    check-cast p4, Ljava/lang/String;

    iget-object p1, p0, Ll/ܶ᩸ᩳ;->᩸:[C

    iget v1, p0, Ll/ܶ᩸ᩳ;->᩶:I

    invoke-virtual {p4, p2, p3, p1, v1}, Ljava/lang/String;->getChars(II[CI)V

    goto :goto_2

    .line 316
    :cond_3
    instance-of p1, p4, Ljava/lang/StringBuilder;

    if-eqz p1, :cond_4

    check-cast p4, Ljava/lang/StringBuilder;

    iget-object p1, p0, Ll/ܶ᩸ᩳ;->᩸:[C

    iget v1, p0, Ll/ܶ᩸ᩳ;->᩶:I

    invoke-virtual {p4, p2, p3, p1, v1}, Ljava/lang/StringBuilder;->getChars(II[CI)V

    goto :goto_2

    .line 317
    :cond_4
    instance-of p1, p4, Ljava/lang/StringBuffer;

    if-eqz p1, :cond_5

    check-cast p4, Ljava/lang/StringBuffer;

    iget-object p1, p0, Ll/ܶ᩸ᩳ;->᩸:[C

    iget v1, p0, Ll/ܶ᩸ᩳ;->᩶:I

    invoke-virtual {p4, p2, p3, p1, v1}, Ljava/lang/StringBuffer;->getChars(II[CI)V

    goto :goto_2

    :cond_5
    :goto_1
    if-ge v2, v0, :cond_6

    .line 318
    iget-object p1, p0, Ll/ܶ᩸ᩳ;->᩸:[C

    iget p3, p0, Ll/ܶ᩸ᩳ;->᩶:I

    add-int/2addr p3, v2

    add-int v1, p2, v2

    invoke-interface {p4, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    aput-char v1, p1, p3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 319
    :cond_6
    :goto_2
    iget p1, p0, Ll/ܶ᩸ᩳ;->᩶:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/ܶ᩸ᩳ;->᩶:I

    return-void

    .line 336
    :cond_7
    new-instance p1, Ljava/lang/OutOfMemoryError;

    const-string p2, "Required array length is too large"

    invoke-direct {p1, p2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw p1

    .line 308
    :cond_8
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method
