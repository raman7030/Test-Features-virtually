.class public abstract Ll/ۨܿܺ;
.super Ljava/lang/Object;
.source "1BDR"


# direct methods
.method public static ֫(Ll/֨ܺܺ;)Ljava/lang/String;
    .locals 2

    .line 248
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v1, 0x23

    .line 250
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 252
    instance-of v1, p0, Ll/᩵ܺܺ;

    if-eqz v1, :cond_0

    const-string p0, "null"

    .line 253
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 255
    :cond_0
    invoke-virtual {p0}, Ll/ܰۡܺ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    .line 256
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 257
    invoke-interface {p0}, Ll/֡ᩴܺ;->֫()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/֨ܺܺ;I)Ljava/lang/String;
    .locals 3

    const/16 v0, 0x14

    const-string v1, "#"

    .line 0
    invoke-static {v0, v1}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 279
    instance-of v1, p0, Ll/ۚܺܺ;

    if-eqz v1, :cond_0

    .line 280
    check-cast p0, Ll/ۚܺܺ;

    invoke-virtual {p0}, Ll/ۚܺܺ;->֡()J

    move-result-wide v1

    goto :goto_0

    .line 282
    :cond_0
    invoke-virtual {p0}, Ll/֨ܺܺ;->ᩴ()I

    move-result p0

    int-to-long v1, p0

    :goto_0
    const/4 p0, 0x4

    if-eq p1, p0, :cond_5

    const/16 p0, 0x8

    if-eq p1, p0, :cond_4

    const/16 p0, 0x10

    if-eq p1, p0, :cond_3

    const/16 p0, 0x20

    if-eq p1, p0, :cond_2

    const/16 p0, 0x40

    if-ne p1, p0, :cond_1

    .line 299
    invoke-static {v1, v2}, Ll/ܳᩴܺ;->֫(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 302
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "shouldn\'t happen"

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    long-to-int p0, v1

    .line 296
    invoke-static {p0}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    long-to-int p0, v1

    .line 293
    invoke-static {p0}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_4
    long-to-int p0, v1

    .line 290
    invoke-static {p0}, Ll/ܳᩴܺ;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_5
    long-to-int p0, v1

    .line 287
    invoke-static {p0}, Ll/ܳᩴܺ;->ܿ(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(II)S
    .locals 1

    and-int/lit16 v0, p0, 0xff

    if-ne v0, p0, :cond_1

    and-int/lit16 v0, p1, 0xff

    if-ne v0, p1, :cond_0

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p0, p1

    int-to-short p0, p0

    return p0

    .line 495
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "high out of range 0..255"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 491
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "low out of range 0..255"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(IIII)S
    .locals 1

    and-int/lit8 v0, p0, 0xf

    if-ne v0, p0, :cond_3

    and-int/lit8 v0, p1, 0xf

    if-ne v0, p1, :cond_2

    and-int/lit8 v0, p2, 0xf

    if-ne v0, p2, :cond_1

    and-int/lit8 v0, p3, 0xf

    if-ne v0, p3, :cond_0

    shl-int/lit8 p1, p1, 0x4

    or-int/2addr p0, p1

    shl-int/lit8 p1, p2, 0x8

    or-int/2addr p0, p1

    shl-int/lit8 p1, p3, 0xc

    or-int/2addr p0, p1

    int-to-short p0, p0

    return p0

    .line 524
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "n3 out of range 0..15"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 520
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "n2 out of range 0..15"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 516
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "n1 out of range 0..15"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 512
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "n0 out of range 0..15"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ۙܿܺ;I)S
    .locals 1

    and-int/lit16 v0, p1, 0xff

    if-ne v0, p1, :cond_1

    .line 454
    invoke-virtual {p0}, Ll/ۙܿܺ;->᩻()Ll/۬ܿܺ;

    move-result-object p0

    invoke-virtual {p0}, Ll/۬ܿܺ;->ܿ()I

    move-result p0

    and-int/lit16 v0, p0, 0xff

    if-ne v0, p0, :cond_0

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p0, p1

    int-to-short p0, p0

    return p0

    .line 457
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "opcode out of range 0..255"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 451
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "arg out of range 0..255"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ۛۘܺ;SS)V
    .locals 0

    .line 567
    check-cast p0, Ll/ᩳᩴܺ;

    invoke-virtual {p0, p1}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 568
    invoke-virtual {p0, p2}, Ll/ᩳᩴܺ;->ܳ(I)V

    return-void
.end method

.method public static ֫(Ll/ᩳᩴܺ;SI)V
    .locals 1

    int-to-short v0, p2

    shr-int/lit8 p2, p2, 0x10

    int-to-short p2, p2

    .line 581
    invoke-virtual {p0, p1}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 582
    invoke-virtual {p0, v0}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 583
    invoke-virtual {p0, p2}, Ll/ᩳᩴܺ;->ܳ(I)V

    return-void
.end method

.method public static ֫(I)Z
    .locals 1

    and-int/lit16 v0, p0, 0xff

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ll/᩶ۡܺ;)Z
    .locals 6

    .line 404
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 410
    invoke-virtual {p0, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    .line 414
    invoke-virtual {p0, v3}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v4

    .line 415
    invoke-virtual {v4}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v5

    if-eq v5, v2, :cond_1

    return v1

    .line 418
    :cond_1
    invoke-virtual {v4}, Ll/᩸ۡܺ;->ۧ()I

    move-result v4

    add-int/2addr v2, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ(II)I
    .locals 1

    and-int/lit8 v0, p0, 0xf

    if-ne v0, p0, :cond_1

    and-int/lit8 v0, p1, 0xf

    if-ne v0, p1, :cond_0

    shl-int/lit8 p1, p1, 0x4

    or-int/2addr p0, p1

    return p0

    .line 543
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "high out of range 0..15"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 539
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "low out of range 0..15"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ll/᩶ۡܺ;)Ljava/lang/String;
    .locals 4

    .line 181
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    .line 182
    new-instance v1, Ljava/lang/StringBuilder;

    mul-int/lit8 v2, v0, 0x5

    add-int/lit8 v2, v2, 0x2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v2, 0x7b

    .line 184
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    if-eqz v2, :cond_0

    const-string v3, ", "

    .line 188
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    :cond_0
    invoke-virtual {p0, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩸ۡܺ;->۠()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/16 p0, 0x7d

    .line 193
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 195
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(I)Z
    .locals 1

    and-int/lit8 v0, p0, 0xf

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ܽ(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 6

    .line 330
    check-cast p0, Ll/ۚܳܺ;

    .line 331
    invoke-virtual {p0}, Ll/ۚܳܺ;->ᩴ()I

    move-result p0

    int-to-short v0, p0

    if-ne p0, v0, :cond_2

    const/4 v0, 0x5

    new-array v0, v0, [C

    const/4 v1, 0x0

    if-gez p0, :cond_0

    const/16 v2, 0x2d

    aput-char v2, v0, v1

    neg-int p0, p0

    goto :goto_0

    :cond_0
    const/16 v2, 0x2b

    aput-char v2, v0, v1

    :goto_0
    const/4 v2, 0x4

    if-ge v1, v2, :cond_1

    rsub-int/lit8 v3, v1, 0x4

    and-int/lit8 v4, p0, 0xf

    const/16 v5, 0x10

    .line 204
    invoke-static {v4, v5}, Ljava/lang/Character;->forDigit(II)C

    move-result v4

    aput-char v4, v0, v3

    shr-int/2addr p0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 208
    :cond_1
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    return-object p0

    .line 333
    :cond_2
    invoke-static {p0}, Ll/ܳᩴܺ;->֫(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Ll/᩶ۡܺ;)Ljava/lang/String;
    .locals 6

    .line 206
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    const/16 v1, 0x1e

    const-string v2, "{"

    .line 0
    invoke-static {v1, v2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-eqz v0, :cond_2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v3, :cond_1

    sub-int/2addr v0, v3

    .line 221
    invoke-virtual {p0, v0}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    .line 222
    invoke-virtual {v0}, Ll/᩸ۡܺ;->ۧ()I

    move-result v4

    const/4 v5, 0x2

    if-ne v4, v5, :cond_0

    .line 227
    invoke-virtual {v0, v3}, Ll/᩸ۡܺ;->֫(I)Ll/᩸ۡܺ;

    move-result-object v0

    .line 230
    :cond_0
    invoke-virtual {p0, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object p0

    invoke-virtual {p0}, Ll/᩸ۡܺ;->۠()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".."

    .line 231
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    invoke-virtual {v0}, Ll/᩸ۡܺ;->۠()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 217
    :cond_1
    invoke-virtual {p0, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object p0

    invoke-virtual {p0}, Ll/᩸ۡܺ;->۠()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    :goto_0
    const-string p0, "}"

    .line 236
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(I)Z
    .locals 1

    const v0, 0xffff

    and-int/2addr v0, p0

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ᩳ(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 1

    .line 317
    check-cast p0, Ll/ۚܳܺ;

    .line 318
    invoke-virtual {p0}, Ll/ۚܳܺ;->ۘ()I

    move-result p0

    int-to-char v0, p0

    if-ne p0, v0, :cond_0

    .line 320
    invoke-static {p0}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract ֫()I
.end method

.method public abstract ֫(Ll/ۤܿܺ;)Ljava/lang/String;
.end method

.method public ֫(Ll/ۙܿܺ;)Ljava/util/BitSet;
    .locals 0

    .line 143
    new-instance p1, Ljava/util/BitSet;

    invoke-direct {p1}, Ljava/util/BitSet;-><init>()V

    return-object p1
.end method

.method public abstract ֫(Ll/ᩳᩴܺ;Ll/ۤܿܺ;)V
.end method

.method public ֫(Ll/ۚܳܺ;)Z
    .locals 0

    .line 0
    instance-of p1, p0, Ll/ܽ᩻ܺ;

    return p1
.end method

.method public abstract ۧ(Ll/ۤܿܺ;)Ljava/lang/String;
.end method

.method public abstract ۧ(Ll/ۙܿܺ;)Z
.end method
