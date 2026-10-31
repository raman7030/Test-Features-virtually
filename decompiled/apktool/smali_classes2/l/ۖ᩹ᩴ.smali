.class public final Ll/ۖ᩹ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/۫ۗᩴ;
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# static fields
.field public static final ZERO:Ll/ۖ᩹ᩴ;

.field public static final c:Ljava/math/BigInteger;

.field public static final serialVersionUID:J = 0x2aba9d02d1c4f832L


# instance fields
.field public final a:J

.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 139
    new-instance v0, Ll/ۖ᩹ᩴ;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Ll/ۖ᩹ᩴ;-><init>(JI)V

    sput-object v0, Ll/ۖ᩹ᩴ;->ZERO:Ll/ۖ᩹ᩴ;

    const-wide/32 v0, 0x3b9aca00

    .line 147
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Ll/ۖ᩹ᩴ;->c:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>(JI)V
    .locals 0

    .line 527
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 528
    iput-wide p1, p0, Ll/ۖ᩹ᩴ;->a:J

    .line 529
    iput p3, p0, Ll/ۖ᩹ᩴ;->b:I

    return-void
.end method

.method public static between(Ll/ܺۗᩴ;Ll/ܺۗᩴ;)Ll/ۖ᩹ᩴ;
    .locals 8

    .line 488
    :try_start_0
    sget-object v0, Ll/ۡۗᩴ;->NANOS:Ll/ۡۗᩴ;

    invoke-interface {p0, p1, v0}, Ll/ܺۗᩴ;->g(Ll/ܺۗᩴ;Ll/ۘۗᩴ;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/ۖ᩹ᩴ;->n(J)Ll/ۖ᩹ᩴ;

    move-result-object p0
    :try_end_0
    .catch Ll/ܺ᩹ᩴ; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 490
    :catch_0
    sget-object v0, Ll/ۡۗᩴ;->SECONDS:Ll/ۡۗᩴ;

    invoke-interface {p0, p1, v0}, Ll/ܺۗᩴ;->g(Ll/ܺۗᩴ;Ll/ۘۗᩴ;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    .line 493
    :try_start_1
    sget-object v4, Ll/ᩴۗᩴ;->NANO_OF_SECOND:Ll/ᩴۗᩴ;

    invoke-interface {p1, v4}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v5

    invoke-interface {p0, v4}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide p0
    :try_end_1
    .catch Ll/ܺ᩹ᩴ; {:try_start_1 .. :try_end_1} :catch_1

    sub-long/2addr v5, p0

    const-wide/16 p0, 0x1

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    cmp-long v7, v5, v2

    if-gez v7, :cond_0

    add-long/2addr v0, p0

    goto :goto_0

    :cond_0
    if-gez v4, :cond_1

    cmp-long v4, v5, v2

    if-lez v4, :cond_1

    sub-long/2addr v0, p0

    :cond_1
    :goto_0
    move-wide v2, v5

    .line 502
    :catch_1
    invoke-static {v0, v1, v2, v3}, Ll/ۖ᩹ᩴ;->s(JJ)Ll/ۖ᩹ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static m(JI)Ll/ۖ᩹ᩴ;
    .locals 5

    int-to-long v0, p2

    or-long/2addr v0, p0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 515
    sget-object p0, Ll/ۖ᩹ᩴ;->ZERO:Ll/ۖ᩹ᩴ;

    return-object p0

    .line 517
    :cond_0
    new-instance v0, Ll/ۖ᩹ᩴ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۖ᩹ᩴ;-><init>(JI)V

    return-object v0
.end method

.method public static n(J)Ll/ۖ᩹ᩴ;
    .locals 4

    const-wide/32 v0, 0x3b9aca00

    .line 281
    div-long v2, p0, v0

    .line 282
    rem-long/2addr p0, v0

    long-to-int p1, p0

    if-gez p1, :cond_0

    int-to-long p0, p1

    add-long/2addr p0, v0

    long-to-int p1, p0

    const-wide/16 v0, 0x1

    sub-long/2addr v2, v0

    .line 287
    :cond_0
    invoke-static {v2, v3, p1}, Ll/ۖ᩹ᩴ;->m(JI)Ll/ۖ᩹ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static of(JLl/ۘۗᩴ;)Ll/ۖ᩹ᩴ;
    .locals 11

    .line 310
    sget-object v0, Ll/ۖ᩹ᩴ;->ZERO:Ll/ۖ᩹ᩴ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "unit"

    .line 710
    invoke-static {p2, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 711
    sget-object v1, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    const-wide/16 v2, 0x0

    if-ne p2, v1, :cond_0

    const p2, 0x15180

    int-to-long v4, p2

    .line 0
    invoke-static {p0, p1, v4, v5}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide p0

    .line 712
    invoke-virtual {v0, p0, p1, v2, v3}, Ll/ۖ᩹ᩴ;->C(JJ)Ll/ۖ᩹ᩴ;

    move-result-object p0

    return-object p0

    .line 714
    :cond_0
    invoke-interface {p2}, Ll/ۘۗᩴ;->isDurationEstimated()Z

    move-result v1

    if-nez v1, :cond_a

    cmp-long v1, p0, v2

    if-nez v1, :cond_1

    return-object v0

    .line 720
    :cond_1
    instance-of v4, p2, Ll/ۡۗᩴ;

    const/4 v5, 0x1

    if-eqz v4, :cond_6

    .line 721
    sget-object v1, Ll/۬᩶ᩴ;->a:[I

    move-object v4, p2

    check-cast v4, Ll/ۡۗᩴ;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v1, v1, v4

    if-eq v1, v5, :cond_5

    const/4 v4, 0x2

    const-wide/16 v5, 0x3e8

    if-eq v1, v4, :cond_4

    const/4 v4, 0x3

    if-eq v1, v4, :cond_3

    const/4 v4, 0x4

    if-eq v1, v4, :cond_2

    .line 727
    invoke-interface {p2}, Ll/ۘۗᩴ;->getDuration()Ll/ۖ᩹ᩴ;

    move-result-object p2

    iget-wide v4, p2, Ll/ۖ᩹ᩴ;->a:J

    invoke-static {v4, v5, p0, p1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide p0

    .line 786
    invoke-virtual {v0, p0, p1, v2, v3}, Ll/ۖ᩹ᩴ;->C(JJ)Ll/ۖ᩹ᩴ;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-virtual {v0, p0, p1, v2, v3}, Ll/ۖ᩹ᩴ;->C(JJ)Ll/ۖ᩹ᩴ;

    move-result-object p0

    return-object p0

    .line 799
    :cond_3
    div-long v1, p0, v5

    rem-long/2addr p0, v5

    const-wide/32 v3, 0xf4240

    mul-long p0, p0, v3

    invoke-virtual {v0, v1, v2, p0, p1}, Ll/ۖ᩹ᩴ;->C(JJ)Ll/ۖ᩹ᩴ;

    move-result-object p0

    return-object p0

    :cond_4
    const-wide/32 v7, 0x3b9aca00

    .line 723
    div-long v9, p0, v7

    mul-long v9, v9, v5

    .line 786
    invoke-virtual {v0, v9, v10, v2, v3}, Ll/ۖ᩹ᩴ;->C(JJ)Ll/ۖ᩹ᩴ;

    move-result-object p2

    .line 723
    rem-long/2addr p0, v7

    mul-long p0, p0, v5

    .line 812
    invoke-virtual {p2, v2, v3, p0, p1}, Ll/ۖ᩹ᩴ;->C(JJ)Ll/ۖ᩹ᩴ;

    move-result-object p0

    return-object p0

    :cond_5
    invoke-virtual {v0, v2, v3, p0, p1}, Ll/ۖ᩹ᩴ;->C(JJ)Ll/ۖ᩹ᩴ;

    move-result-object p0

    return-object p0

    .line 729
    :cond_6
    invoke-interface {p2}, Ll/ۘۗᩴ;->getDuration()Ll/ۖ᩹ᩴ;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v1, :cond_7

    move-object p2, v0

    goto :goto_0

    :cond_7
    const-wide/16 v6, 0x1

    cmp-long v1, p0, v6

    if-nez v1, :cond_8

    goto :goto_0

    .line 1024
    :cond_8
    iget-wide v6, p2, Ll/ۖ᩹ᩴ;->a:J

    invoke-static {v6, v7}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v1

    iget p2, p2, Ll/ۖ᩹ᩴ;->b:I

    int-to-long v6, p2

    const/16 p2, 0x9

    invoke-static {v6, v7, p2}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v1

    .line 977
    invoke-static {p0, p1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p0

    .line 1035
    invoke-virtual {p0, p2}, Ljava/math/BigDecimal;->movePointRight(I)Ljava/math/BigDecimal;

    move-result-object p0

    invoke-virtual {p0}, Ljava/math/BigDecimal;->toBigIntegerExact()Ljava/math/BigInteger;

    move-result-object p0

    .line 1036
    sget-object p1, Ll/ۖ᩹ᩴ;->c:Ljava/math/BigInteger;

    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->divideAndRemainder(Ljava/math/BigInteger;)[Ljava/math/BigInteger;

    move-result-object p1

    const/4 p2, 0x0

    .line 1037
    aget-object v1, p1, p2

    invoke-virtual {v1}, Ljava/math/BigInteger;->bitLength()I

    move-result v1

    const/16 v4, 0x3f

    if-gt v1, v4, :cond_9

    .line 1040
    aget-object p0, p1, p2

    invoke-virtual {p0}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v6

    aget-object p0, p1, v5

    invoke-virtual {p0}, Ljava/math/BigInteger;->intValue()I

    move-result p0

    int-to-long p0, p0

    invoke-static {v6, v7, p0, p1}, Ll/ۖ᩹ᩴ;->s(JJ)Ll/ۖ᩹ᩴ;

    move-result-object p2

    .line 625
    :goto_0
    iget-wide p0, p2, Ll/ۖ᩹ᩴ;->a:J

    .line 786
    invoke-virtual {v0, p0, p1, v2, v3}, Ll/ۖ᩹ᩴ;->C(JJ)Ll/ۖ᩹ᩴ;

    move-result-object p0

    .line 643
    iget p1, p2, Ll/ۖ᩹ᩴ;->b:I

    int-to-long p1, p1

    .line 812
    invoke-virtual {p0, v2, v3, p1, p2}, Ll/ۖ᩹ᩴ;->C(JJ)Ll/ۖ᩹ᩴ;

    move-result-object p0

    return-object p0

    .line 1038
    :cond_9
    new-instance p1, Ljava/lang/ArithmeticException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Exceeds capacity of Duration: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 715
    :cond_a
    new-instance p0, Ll/ۨۗᩴ;

    const-string p1, "Unit must not have an estimated duration"

    .line 88
    invoke-direct {p0, p1}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 715
    throw p0
.end method

.method public static ofMillis(J)Ll/ۖ᩹ᩴ;
    .locals 4

    const-wide/16 v0, 0x3e8

    .line 262
    div-long v2, p0, v0

    .line 263
    rem-long/2addr p0, v0

    long-to-int p1, p0

    if-gez p1, :cond_0

    add-int/lit16 p1, p1, 0x3e8

    const-wide/16 v0, 0x1

    sub-long/2addr v2, v0

    :cond_0
    const p0, 0xf4240

    mul-int p1, p1, p0

    .line 268
    invoke-static {v2, v3, p1}, Ll/ۖ᩹ᩴ;->m(JI)Ll/ۖ᩹ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static ofMinutes(J)Ll/ۖ᩹ᩴ;
    .locals 2

    const/16 v0, 0x3c

    int-to-long v0, v0

    .line 0
    invoke-static {p0, p1, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide p0

    const/4 v0, 0x0

    .line 211
    invoke-static {p0, p1, v0}, Ll/ۖ᩹ᩴ;->m(JI)Ll/ۖ᩹ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static ofSeconds(J)Ll/ۖ᩹ᩴ;
    .locals 1

    const/4 v0, 0x0

    .line 224
    invoke-static {p0, p1, v0}, Ll/ۖ᩹ᩴ;->m(JI)Ll/ۖ᩹ᩴ;

    move-result-object p0

    return-object p0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 1543
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization via serialization delegate"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static s(JJ)Ll/ۖ᩹ᩴ;
    .locals 4

    const-wide/32 v0, 0x3b9aca00

    .line 247
    invoke-static {p2, p3, v0, v1}, Ll/᩺ۚᩴ;->z(JJ)J

    move-result-wide v2

    invoke-static {p0, p1, v2, v3}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide p0

    .line 248
    invoke-static {p2, p3, v0, v1}, Ll/᩺ۚᩴ;->O(JJ)J

    move-result-wide p2

    long-to-int p3, p2

    .line 249
    invoke-static {p0, p1, p3}, Ll/ۖ᩹ᩴ;->m(JI)Ll/ۖ᩹ᩴ;

    move-result-object p0

    return-object p0
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    .line 1533
    new-instance v0, Ll/᩷ۗᩴ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/᩷ۗᩴ;-><init>(BLjava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final C(JJ)Ll/ۖ᩹ᩴ;
    .locals 5

    or-long v0, p1, p3

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-object p0

    .line 829
    :cond_0
    iget-wide v0, p0, Ll/ۖ᩹ᩴ;->a:J

    invoke-static {v0, v1, p1, p2}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide p1

    const-wide/32 v0, 0x3b9aca00

    .line 830
    div-long v2, p3, v0

    invoke-static {p1, p2, v2, v3}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide p1

    .line 831
    rem-long/2addr p3, v0

    .line 832
    iget v0, p0, Ll/ۖ᩹ᩴ;->b:I

    int-to-long v0, v0

    add-long/2addr v0, p3

    .line 833
    invoke-static {p1, p2, v0, v1}, Ll/ۖ᩹ᩴ;->s(JJ)Ll/ۖ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 133
    check-cast p1, Ll/ۖ᩹ᩴ;

    invoke-virtual {p0, p1}, Ll/ۖ᩹ᩴ;->compareTo(Ll/ۖ᩹ᩴ;)I

    move-result p1

    return p1
.end method

.method public compareTo(Ll/ۖ᩹ᩴ;)I
    .locals 4

    .line 1409
    iget-wide v0, p0, Ll/ۖ᩹ᩴ;->a:J

    iget-wide v2, p1, Ll/ۖ᩹ᩴ;->a:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 1413
    :cond_0
    iget v0, p0, Ll/ۖ᩹ᩴ;->b:I

    iget p1, p1, Ll/ۖ᩹ᩴ;->b:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1430
    :cond_0
    instance-of v1, p1, Ll/ۖ᩹ᩴ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 1431
    check-cast p1, Ll/ۖ᩹ᩴ;

    .line 1432
    iget-wide v3, p0, Ll/ۖ᩹ᩴ;->a:J

    iget-wide v5, p1, Ll/ۖ᩹ᩴ;->a:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    iget v1, p0, Ll/ۖ᩹ᩴ;->b:I

    iget p1, p1, Ll/ۖ᩹ᩴ;->b:I

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final hashCode()I
    .locals 4

    .line 1445
    iget-wide v0, p0, Ll/ۖ᩹ᩴ;->a:J

    const/16 v2, 0x20

    ushr-long v2, v0, v2

    xor-long/2addr v0, v2

    long-to-int v1, v0

    iget v0, p0, Ll/ۖ᩹ᩴ;->b:I

    mul-int/lit8 v0, v0, 0x33

    add-int/2addr v0, v1

    return v0
.end method

.method public isNegative()Z
    .locals 5

    .line 606
    iget-wide v0, p0, Ll/ۖ᩹ᩴ;->a:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isZero()Z
    .locals 5

    .line 593
    iget-wide v0, p0, Ll/ۖ᩹ᩴ;->a:J

    iget v2, p0, Ll/ۖ᩹ᩴ;->b:I

    int-to-long v2, v2

    or-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final l(Ll/ܺۗᩴ;)Ll/ܺۗᩴ;
    .locals 5

    .line 1101
    iget-wide v0, p0, Ll/ۖ᩹ᩴ;->a:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 1102
    sget-object v2, Ll/ۡۗᩴ;->SECONDS:Ll/ۡۗᩴ;

    invoke-interface {p1, v0, v1, v2}, Ll/ܺۗᩴ;->d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    .line 1104
    :cond_0
    iget v0, p0, Ll/ۖ᩹ᩴ;->b:I

    if-eqz v0, :cond_1

    int-to-long v0, v0

    .line 1105
    sget-object v2, Ll/ۡۗᩴ;->NANOS:Ll/ۡۗᩴ;

    invoke-interface {p1, v0, v1, v2}, Ll/ܺۗᩴ;->d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public toMillis()J
    .locals 7

    .line 1217
    iget-wide v0, p0, Ll/ۖ᩹ᩴ;->a:J

    .line 1218
    iget v2, p0, Ll/ۖ᩹ᩴ;->b:I

    int-to-long v2, v2

    const-wide/16 v4, 0x0

    cmp-long v6, v0, v4

    if-gez v6, :cond_0

    const-wide/16 v4, 0x1

    add-long/2addr v0, v4

    const-wide/32 v4, 0x3b9aca00

    sub-long/2addr v2, v4

    :cond_0
    const/16 v4, 0x3e8

    int-to-long v4, v4

    .line 0
    invoke-static {v0, v1, v4, v5}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide v0

    const-wide/32 v4, 0xf4240

    .line 1226
    div-long/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public toNanos()J
    .locals 9

    .line 1240
    iget-wide v0, p0, Ll/ۖ᩹ᩴ;->a:J

    .line 1241
    iget v2, p0, Ll/ۖ᩹ᩴ;->b:I

    int-to-long v2, v2

    const-wide/16 v4, 0x0

    const-wide/32 v6, 0x3b9aca00

    cmp-long v8, v0, v4

    if-gez v8, :cond_0

    const-wide/16 v4, 0x1

    add-long/2addr v0, v4

    sub-long/2addr v2, v6

    .line 1248
    :cond_0
    invoke-static {v0, v1, v6, v7}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide v0

    .line 1249
    invoke-static {v0, v1, v2, v3}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    .line 1473
    sget-object v0, Ll/ۖ᩹ᩴ;->ZERO:Ll/ۖ᩹ᩴ;

    if-ne p0, v0, :cond_0

    const-string v0, "PT0S"

    return-object v0

    .line 1476
    :cond_0
    iget-wide v0, p0, Ll/ۖ᩹ᩴ;->a:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    .line 1477
    iget v4, p0, Ll/ۖ᩹ᩴ;->b:I

    if-lez v4, :cond_1

    const-wide/16 v4, 0x1

    add-long/2addr v0, v4

    :cond_1
    const-wide/16 v4, 0xe10

    .line 1480
    div-long v6, v0, v4

    .line 1481
    rem-long v4, v0, v4

    const-wide/16 v8, 0x3c

    div-long/2addr v4, v8

    long-to-int v5, v4

    .line 1482
    rem-long/2addr v0, v8

    long-to-int v1, v0

    .line 1483
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v4, 0x18

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "PT"

    .line 1484
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    cmp-long v4, v6, v2

    if-eqz v4, :cond_2

    .line 1486
    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v4, 0x48

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    if-eqz v5, :cond_3

    .line 1489
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v4, 0x4d

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    if-nez v1, :cond_4

    .line 1491
    iget v4, p0, Ll/ۖ᩹ᩴ;->b:I

    if-nez v4, :cond_4

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    const/4 v5, 0x2

    if-le v4, v5, :cond_4

    .line 1492
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1494
    :cond_4
    iget-wide v4, p0, Ll/ۖ᩹ᩴ;->a:J

    cmp-long v6, v4, v2

    if-gez v6, :cond_6

    iget v4, p0, Ll/ۖ᩹ᩴ;->b:I

    if-lez v4, :cond_6

    if-nez v1, :cond_5

    const-string v1, "-0"

    .line 1496
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 1498
    :cond_5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 1501
    :cond_6
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1503
    :goto_0
    iget v1, p0, Ll/ۖ᩹ᩴ;->b:I

    if-lez v1, :cond_9

    .line 1504
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    .line 1505
    iget-wide v4, p0, Ll/ۖ᩹ᩴ;->a:J

    cmp-long v6, v4, v2

    if-gez v6, :cond_7

    .line 1506
    iget v2, p0, Ll/ۖ᩹ᩴ;->b:I

    int-to-long v2, v2

    const-wide/32 v4, 0x77359400

    sub-long/2addr v4, v2

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 1508
    :cond_7
    iget v2, p0, Ll/ۖ᩹ᩴ;->b:I

    int-to-long v2, v2

    const-wide/32 v4, 0x3b9aca00

    add-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1510
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    if-ne v2, v3, :cond_8

    .line 1511
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    goto :goto_1

    :cond_8
    const/16 v2, 0x2e

    .line 1513
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    :cond_9
    const/16 v1, 0x53

    .line 1515
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1516
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
