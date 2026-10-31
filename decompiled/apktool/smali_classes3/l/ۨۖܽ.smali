.class public final Ll/ۨۖܽ;
.super Ljava/lang/Object;
.source "Z96R"

# interfaces
.implements Ljava/lang/Appendable;
.implements Ljava/lang/CharSequence;
.implements Landroid/text/GetChars;


# instance fields
.field public ᩸:I

.field public ᩹:[C


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x10

    .line 25
    invoke-direct {p0, v0}, Ll/ۨۖܽ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-array p1, p1, [C

    iput-object p1, p0, Ll/ۨۖܽ;->᩹:[C

    return-void
.end method

.method private ۧ()V
    .locals 6

    .line 261
    iget v0, p0, Ll/ۨۖܽ;->᩸:I

    add-int/lit8 v1, v0, 0x4

    .line 262
    invoke-direct {p0, v1}, Ll/ۨۖܽ;->ܽ(I)V

    .line 263
    iget-object v2, p0, Ll/ۨۖܽ;->᩹:[C

    add-int/lit8 v3, v0, 0x1

    const/16 v4, 0x6e

    .line 264
    aput-char v4, v2, v0

    add-int/lit8 v4, v0, 0x2

    const/16 v5, 0x75

    .line 265
    aput-char v5, v2, v3

    add-int/lit8 v0, v0, 0x3

    const/16 v3, 0x6c

    .line 266
    aput-char v3, v2, v4

    .line 267
    aput-char v3, v2, v0

    .line 268
    iput v1, p0, Ll/ۨۖܽ;->᩸:I

    return-void
.end method

.method private ܽ(I)V
    .locals 4

    .line 76
    iget-object v0, p0, Ll/ۨۖܽ;->᩹:[C

    array-length v1, v0

    sub-int v1, p1, v1

    if-lez v1, :cond_5

    .line 103
    array-length v1, v0

    shl-int/lit8 v1, v1, 0x1

    add-int/lit8 v1, v1, 0x2

    sub-int v2, v1, p1

    if-gez v2, :cond_0

    move v1, p1

    :cond_0
    const v2, 0x7ffffff7

    if-lez v1, :cond_2

    sub-int v3, v2, v1

    if-gez v3, :cond_1

    goto :goto_0

    :cond_1
    move p1, v1

    goto :goto_1

    :cond_2
    :goto_0
    const v1, 0x7fffffff

    sub-int/2addr v1, p1

    if-ltz v1, :cond_4

    if-le p1, v2, :cond_3

    goto :goto_1

    :cond_3
    const p1, 0x7ffffff7

    .line 77
    :goto_1
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object p1

    iput-object p1, p0, Ll/ۨۖܽ;->᩹:[C

    return-void

    .line 114
    :cond_4
    new-instance p1, Ljava/lang/OutOfMemoryError;

    invoke-direct {p1}, Ljava/lang/OutOfMemoryError;-><init>()V

    throw p1

    :cond_5
    return-void
.end method


# virtual methods
.method public final bridge synthetic append(C)Ljava/lang/Appendable;
    .locals 0

    .line 10
    invoke-virtual {p0, p1}, Ll/ۨۖܽ;->append(C)V

    return-object p0
.end method

.method public final bridge synthetic append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 0

    .line 10
    invoke-virtual {p0, p1}, Ll/ۨۖܽ;->append(Ljava/lang/CharSequence;)Ll/ۨۖܽ;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 0

    .line 10
    invoke-virtual {p0, p1, p2, p3}, Ll/ۨۖܽ;->append(Ljava/lang/CharSequence;II)V

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;)Ll/ۨۖܽ;
    .locals 2

    if-nez p1, :cond_0

    .line 251
    invoke-direct {p0}, Ll/ۨۖܽ;->ۧ()V

    return-object p0

    .line 252
    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 253
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ll/ۨۖܽ;->ۧ(Ljava/lang/String;)V

    return-object p0

    .line 254
    :cond_1
    instance-of v0, p1, Ll/ۨۖܽ;

    if-eqz v0, :cond_2

    .line 255
    check-cast p1, Ll/ۨۖܽ;

    invoke-virtual {p0, p1}, Ll/ۨۖܽ;->append(Ljava/lang/CharSequence;)Ll/ۨۖܽ;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 v0, 0x0

    .line 257
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Ll/ۨۖܽ;->append(Ljava/lang/CharSequence;II)V

    return-object p0
.end method

.method public final append(C)V
    .locals 3

    .line 386
    iget v0, p0, Ll/ۨۖܽ;->᩸:I

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Ll/ۨۖܽ;->ܽ(I)V

    .line 387
    iget-object v0, p0, Ll/ۨۖܽ;->᩹:[C

    iget v1, p0, Ll/ۨۖܽ;->᩸:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۨۖܽ;->᩸:I

    aput-char p1, v0, v1

    return-void
.end method

.method public final append(Ljava/lang/CharSequence;II)V
    .locals 4

    if-nez p1, :cond_0

    const-string p1, "null"

    :cond_0
    sub-int v0, p3, p2

    .line 307
    iget v1, p0, Ll/ۨۖܽ;->᩸:I

    add-int/2addr v1, v0

    invoke-direct {p0, v1}, Ll/ۨۖܽ;->ܽ(I)V

    .line 308
    iget v1, p0, Ll/ۨۖܽ;->᩸:I

    :goto_0
    if-ge p2, p3, :cond_1

    .line 309
    iget-object v2, p0, Ll/ۨۖܽ;->᩹:[C

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    aput-char v3, v2, v1

    add-int/lit8 p2, p2, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 310
    :cond_1
    iget p1, p0, Ll/ۨۖܽ;->᩸:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/ۨۖܽ;->᩸:I

    return-void
.end method

.method public final charAt(I)C
    .locals 1

    .line 175
    iget-object v0, p0, Ll/ۨۖܽ;->᩹:[C

    aget-char p1, v0, p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 490
    instance-of v0, p1, Ll/ۨۖܽ;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    check-cast p1, Ll/ۨۖܽ;

    .line 491
    iget v0, p0, Ll/ۨۖܽ;->᩸:I

    iget v2, p1, Ll/ۨۖܽ;->᩸:I

    if-eq v0, v2, :cond_0

    return v1

    .line 494
    :cond_0
    iget-object v2, p0, Ll/ۨۖܽ;->᩹:[C

    .line 495
    iget-object p1, p1, Ll/ۨۖܽ;->᩹:[C

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    .line 497
    aget-char v4, v2, v3

    aget-char v5, p1, v3

    if-eq v4, v5, :cond_1

    return v1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1

    .line 503
    :cond_3
    instance-of v0, p1, Ljava/lang/CharSequence;

    if-eqz v0, :cond_4

    check-cast p1, Ljava/lang/CharSequence;

    .line 504
    invoke-static {p0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    return p1

    :cond_4
    return v1
.end method

.method public final getChars(II[CI)V
    .locals 1

    if-ltz p1, :cond_2

    if-ltz p2, :cond_1

    .line 210
    iget v0, p0, Ll/ۨۖܽ;->᩸:I

    if-gt p2, v0, :cond_1

    if-gt p1, p2, :cond_0

    .line 214
    iget-object v0, p0, Ll/ۨۖܽ;->᩹:[C

    sub-int/2addr p2, p1

    invoke-static {v0, p1, p3, p4, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    .line 213
    :cond_0
    new-instance p1, Ljava/lang/StringIndexOutOfBoundsException;

    const-string p2, "srcBegin > srcEnd"

    invoke-direct {p1, p2}, Ljava/lang/StringIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 211
    :cond_1
    new-instance p1, Ljava/lang/StringIndexOutOfBoundsException;

    invoke-direct {p1, p2}, Ljava/lang/StringIndexOutOfBoundsException;-><init>(I)V

    throw p1

    .line 209
    :cond_2
    new-instance p2, Ljava/lang/StringIndexOutOfBoundsException;

    invoke-direct {p2, p1}, Ljava/lang/StringIndexOutOfBoundsException;-><init>(I)V

    throw p2
.end method

.method public final getValue()[C
    .locals 1

    .line 480
    iget-object v0, p0, Ll/ۨۖܽ;->᩹:[C

    return-object v0
.end method

.method public final hashCode()I
    .locals 5

    .line 511
    iget-object v0, p0, Ll/ۨۖܽ;->᩹:[C

    .line 512
    iget v1, p0, Ll/ۨۖܽ;->᩸:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    mul-int/lit8 v3, v3, 0x1f

    .line 515
    aget-char v4, v0, v2

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method

.method public final length()I
    .locals 1

    .line 43
    iget v0, p0, Ll/ۨۖܽ;->᩸:I

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 0

    .line 433
    invoke-virtual {p0, p1, p2}, Ll/ۨۖܽ;->֫(II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 473
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Ll/ۨۖܽ;->᩹:[C

    const/4 v2, 0x0

    iget v3, p0, Ll/ۨۖܽ;->᩸:I

    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method public final ֫(II)Ljava/lang/String;
    .locals 2

    if-ltz p1, :cond_2

    .line 453
    iget v0, p0, Ll/ۨۖܽ;->᩸:I

    if-gt p2, v0, :cond_1

    if-gt p1, p2, :cond_0

    .line 457
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Ll/ۨۖܽ;->᩹:[C

    sub-int/2addr p2, p1

    invoke-direct {v0, v1, p1, p2}, Ljava/lang/String;-><init>([CII)V

    return-object v0

    .line 456
    :cond_0
    new-instance v0, Ljava/lang/StringIndexOutOfBoundsException;

    sub-int/2addr p2, p1

    invoke-direct {v0, p2}, Ljava/lang/StringIndexOutOfBoundsException;-><init>(I)V

    throw v0

    .line 454
    :cond_1
    new-instance p1, Ljava/lang/StringIndexOutOfBoundsException;

    invoke-direct {p1, p2}, Ljava/lang/StringIndexOutOfBoundsException;-><init>(I)V

    throw p1

    .line 452
    :cond_2
    new-instance p2, Ljava/lang/StringIndexOutOfBoundsException;

    invoke-direct {p2, p1}, Ljava/lang/StringIndexOutOfBoundsException;-><init>(I)V

    throw p2
.end method

.method public final ֫()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [C

    .line 484
    iput-object v0, p0, Ll/ۨۖܽ;->᩹:[C

    const/4 v0, 0x0

    .line 485
    iput v0, p0, Ll/ۨۖܽ;->᩸:I

    return-void
.end method

.method public final ֫([C)V
    .locals 4

    .line 331
    array-length v0, p1

    .line 332
    iget v1, p0, Ll/ۨۖܽ;->᩸:I

    add-int/2addr v1, v0

    invoke-direct {p0, v1}, Ll/ۨۖܽ;->ܽ(I)V

    .line 333
    iget-object v1, p0, Ll/ۨۖܽ;->᩹:[C

    iget v2, p0, Ll/ۨۖܽ;->᩸:I

    const/4 v3, 0x0

    invoke-static {p1, v3, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 334
    iget p1, p0, Ll/ۨۖܽ;->᩸:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/ۨۖܽ;->᩸:I

    return-void
.end method

.method public final ֫([CII)V
    .locals 2

    if-lez p3, :cond_0

    .line 361
    iget v0, p0, Ll/ۨۖܽ;->᩸:I

    add-int/2addr v0, p3

    invoke-direct {p0, v0}, Ll/ۨۖܽ;->ܽ(I)V

    .line 363
    :cond_0
    iget-object v0, p0, Ll/ۨۖܽ;->᩹:[C

    iget v1, p0, Ll/ۨۖܽ;->᩸:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 364
    iget p1, p0, Ll/ۨۖܽ;->᩸:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/ۨۖܽ;->᩸:I

    return-void
.end method

.method public final ۧ(I)V
    .locals 3

    .line 147
    invoke-direct {p0, p1}, Ll/ۨۖܽ;->ܽ(I)V

    .line 149
    iget v0, p0, Ll/ۨۖܽ;->᩸:I

    if-ge v0, p1, :cond_0

    .line 150
    iget-object v1, p0, Ll/ۨۖܽ;->᩹:[C

    const/4 v2, 0x0

    invoke-static {v1, v0, p1, v2}, Ljava/util/Arrays;->fill([CIIC)V

    .line 153
    :cond_0
    iput p1, p0, Ll/ۨۖܽ;->᩸:I

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 4

    if-nez p1, :cond_0

    .line 238
    invoke-direct {p0}, Ll/ۨۖܽ;->ۧ()V

    return-void

    .line 239
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    .line 240
    iget v1, p0, Ll/ۨۖܽ;->᩸:I

    add-int/2addr v1, v0

    invoke-direct {p0, v1}, Ll/ۨۖܽ;->ܽ(I)V

    .line 241
    iget-object v1, p0, Ll/ۨۖܽ;->᩹:[C

    iget v2, p0, Ll/ۨۖܽ;->᩸:I

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v0, v1, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 242
    iget p1, p0, Ll/ۨۖܽ;->᩸:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/ۨۖܽ;->᩸:I

    return-void
.end method
