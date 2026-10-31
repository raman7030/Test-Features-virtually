.class public final Ll/ᩴ᩹ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ܺۗᩴ;
.implements Ll/ۗۗᩴ;
.implements Ll/۬᩹ᩴ;
.implements Ljava/io/Serializable;


# static fields
.field public static final d:Ll/ᩴ᩹ᩴ;

.field public static final e:Ll/ᩴ᩹ᩴ;

.field public static final serialVersionUID:J = 0x28d617b1d8f33f1eL


# instance fields
.field public final a:I

.field public final b:S

.field public final c:S


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const v0, -0x3b9ac9ff

    const/4 v1, 0x1

    .line 146
    invoke-static {v0, v1, v1}, Ll/ᩴ᩹ᩴ;->h0(III)Ll/ᩴ᩹ᩴ;

    move-result-object v0

    sput-object v0, Ll/ᩴ᩹ᩴ;->d:Ll/ᩴ᩹ᩴ;

    const/16 v0, 0xc

    const/16 v2, 0x1f

    const v3, 0x3b9ac9ff

    .line 151
    invoke-static {v3, v0, v2}, Ll/ᩴ᩹ᩴ;->h0(III)Ll/ᩴ᩹ᩴ;

    move-result-object v0

    sput-object v0, Ll/ᩴ᩹ᩴ;->e:Ll/ᩴ᩹ᩴ;

    const/16 v0, 0x7b2

    .line 155
    invoke-static {v0, v1, v1}, Ll/ᩴ᩹ᩴ;->h0(III)Ll/ᩴ᩹ᩴ;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 496
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 497
    iput p1, p0, Ll/ᩴ᩹ᩴ;->a:I

    int-to-short p1, p2

    .line 498
    iput-short p1, p0, Ll/ᩴ᩹ᩴ;->b:S

    int-to-short p1, p3

    .line 499
    iput-short p1, p0, Ll/ᩴ᩹ᩴ;->c:S

    return-void
.end method

.method public static W(III)Ll/ᩴ᩹ᩴ;
    .locals 5

    const/16 v0, 0x1c

    if-le p2, v0, :cond_4

    const/4 v1, 0x2

    const/16 v2, 0x1d

    if-eq p1, v1, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    const/16 v0, 0x9

    if-eq p1, v0, :cond_0

    const/16 v0, 0xb

    if-eq p1, v0, :cond_0

    const/16 v0, 0x1f

    goto :goto_0

    :cond_0
    const/16 v0, 0x1e

    goto :goto_0

    .line 446
    :cond_1
    sget-object v1, Ll/۠᩶ᩴ;->c:Ll/۠᩶ᩴ;

    int-to-long v3, p0

    invoke-virtual {v1, v3, v4}, Ll/۠᩶ᩴ;->S(J)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v0, 0x1d

    :cond_2
    :goto_0
    if-le p2, v0, :cond_4

    if-ne p2, v2, :cond_3

    .line 457
    new-instance p1, Ll/ܺ᩹ᩴ;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Invalid date \'February 29\' as \'"

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "\' is not a leap year"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw p1

    .line 459
    :cond_3
    new-instance p0, Ll/ܺ᩹ᩴ;

    invoke-static {p1}, Ll/ۧۗᩴ;->Y(I)Ll/ۧۗᩴ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid date \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw p0

    .line 463
    :cond_4
    new-instance v0, Ll/ᩴ᩹ᩴ;

    invoke-direct {v0, p0, p1, p2}, Ll/ᩴ᩹ᩴ;-><init>(III)V

    return-object v0
.end method

.method public static X(Ll/ۖۗᩴ;)Ll/ᩴ᩹ᩴ;
    .locals 4

    const-string v0, "temporal"

    .line 392
    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 393
    sget-object v0, Ll/ۛۗᩴ;->f:Ll/ۡ֨ᩴ;

    invoke-interface {p0, v0}, Ll/ۖۗᩴ;->T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴ᩹ᩴ;

    if-eqz v0, :cond_0

    return-object v0

    .line 395
    :cond_0
    new-instance v0, Ll/ܺ᩹ᩴ;

    .line 396
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to obtain LocalDate from TemporalAccessor: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " of type "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static g0(Ll/۠᩹ᩴ;)Ll/ᩴ᩹ᩴ;
    .locals 4

    const-string v0, "clock"

    .line 228
    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 229
    invoke-virtual {p0}, Ll/۠᩹ᩴ;->instant()Ll/ۘ᩹ᩴ;

    move-result-object v0

    .line 503
    iget-object p0, p0, Ll/۠᩹ᩴ;->a:Ll/ۚ᩹ᩴ;

    const-string v1, "instant"

    .line 319
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v1, "zone"

    .line 320
    invoke-static {p0, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 321
    invoke-virtual {p0}, Ll/ۚ᩹ᩴ;->W()Ll/ܺ۬ᩴ;

    move-result-object p0

    .line 322
    invoke-virtual {p0, v0}, Ll/ܺ۬ᩴ;->d(Ll/ۘ᩹ᩴ;)Ll/ᩳ۬ᩴ;

    move-result-object p0

    .line 323
    invoke-virtual {v0}, Ll/ۘ᩹ᩴ;->getEpochSecond()J

    move-result-wide v0

    .line 474
    iget p0, p0, Ll/ᩳ۬ᩴ;->b:I

    int-to-long v2, p0

    add-long/2addr v0, v2

    const p0, 0x15180

    int-to-long v2, p0

    .line 0
    invoke-static {v0, v1, v2, v3}, Ll/᩺ۚᩴ;->z(JJ)J

    move-result-wide v0

    .line 325
    invoke-static {v0, v1}, Ll/ᩴ᩹ᩴ;->i0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static h0(III)Ll/ᩴ᩹ᩴ;
    .locals 3

    .line 268
    sget-object v0, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    int-to-long v1, p0

    invoke-virtual {v0, v1, v2}, Ll/ᩴۗᩴ;->T(J)V

    .line 269
    sget-object v0, Ll/ᩴۗᩴ;->MONTH_OF_YEAR:Ll/ᩴۗᩴ;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Ll/ᩴۗᩴ;->T(J)V

    .line 270
    sget-object v0, Ll/ᩴۗᩴ;->DAY_OF_MONTH:Ll/ᩴۗᩴ;

    int-to-long v1, p2

    invoke-virtual {v0, v1, v2}, Ll/ᩴۗᩴ;->T(J)V

    .line 271
    invoke-static {p0, p1, p2}, Ll/ᩴ᩹ᩴ;->W(III)Ll/ᩴ᩹ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static i0(J)Ll/ᩴ᩹ᩴ;
    .locals 22

    move-wide/from16 v0, p0

    .line 341
    sget-object v2, Ll/ᩴۗᩴ;->EPOCH_DAY:Ll/ᩴۗᩴ;

    invoke-virtual {v2, v0, v1}, Ll/ᩴۗᩴ;->T(J)V

    const-wide/32 v2, 0xafa6c

    add-long/2addr v2, v0

    const-wide/16 v4, 0x1

    const-wide/32 v6, 0x23ab1

    const-wide/16 v8, 0x190

    const-wide/16 v10, 0x0

    cmp-long v12, v2, v10

    if-gez v12, :cond_0

    const-wide/32 v12, 0xafa6d

    add-long/2addr v0, v12

    .line 348
    div-long/2addr v0, v6

    sub-long/2addr v0, v4

    mul-long v12, v0, v8

    neg-long v0, v0

    mul-long v0, v0, v6

    add-long/2addr v2, v0

    goto :goto_0

    :cond_0
    move-wide v12, v10

    :goto_0
    mul-long v0, v2, v8

    const-wide/16 v14, 0x24f

    add-long/2addr v0, v14

    .line 352
    div-long/2addr v0, v6

    const-wide/16 v6, 0x16d

    mul-long v14, v0, v6

    const-wide/16 v16, 0x4

    .line 353
    div-long v18, v0, v16

    add-long v18, v18, v14

    const-wide/16 v14, 0x64

    div-long v20, v0, v14

    sub-long v18, v18, v20

    div-long v20, v0, v8

    add-long v20, v20, v18

    sub-long v18, v2, v20

    cmp-long v20, v18, v10

    if-gez v20, :cond_1

    sub-long/2addr v0, v4

    mul-long v6, v6, v0

    .line 357
    div-long v4, v0, v16

    add-long/2addr v4, v6

    div-long v6, v0, v14

    sub-long/2addr v4, v6

    div-long v6, v0, v8

    add-long/2addr v6, v4

    sub-long v18, v2, v6

    :cond_1
    move-wide/from16 v2, v18

    add-long/2addr v0, v12

    long-to-int v3, v2

    mul-int/lit8 v2, v3, 0x5

    add-int/lit8 v2, v2, 0x2

    .line 363
    div-int/lit16 v2, v2, 0x99

    add-int/lit8 v4, v2, 0x2

    .line 364
    rem-int/lit8 v4, v4, 0xc

    add-int/lit8 v4, v4, 0x1

    mul-int/lit16 v5, v2, 0x132

    add-int/lit8 v5, v5, 0x5

    .line 365
    div-int/lit8 v5, v5, 0xa

    sub-int/2addr v3, v5

    add-int/lit8 v3, v3, 0x1

    .line 366
    div-int/lit8 v2, v2, 0xa

    int-to-long v5, v2

    add-long/2addr v0, v5

    .line 369
    sget-object v2, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    .line 669
    iget-object v5, v2, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 732
    invoke-virtual {v5, v0, v1, v2}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result v0

    .line 370
    new-instance v1, Ll/ᩴ᩹ᩴ;

    invoke-direct {v1, v0, v4, v3}, Ll/ᩴ᩹ᩴ;-><init>(III)V

    return-object v1
.end method

.method public static j0(II)Ll/ᩴ᩹ᩴ;
    .locals 5

    .line 288
    sget-object v0, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    int-to-long v1, p0

    invoke-virtual {v0, v1, v2}, Ll/ᩴۗᩴ;->T(J)V

    .line 289
    sget-object v0, Ll/ᩴۗᩴ;->DAY_OF_YEAR:Ll/ᩴۗᩴ;

    int-to-long v3, p1

    invoke-virtual {v0, v3, v4}, Ll/ᩴۗᩴ;->T(J)V

    .line 290
    sget-object v0, Ll/۠᩶ᩴ;->c:Ll/۠᩶ᩴ;

    invoke-virtual {v0, v1, v2}, Ll/۠᩶ᩴ;->S(J)Z

    move-result v0

    const/16 v1, 0x16e

    if-ne p1, v1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    .line 292
    :cond_0
    new-instance p1, Ll/ܺ᩹ᩴ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid date \'DayOfYear 366\' as \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "\' is not a leap year"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    add-int/lit8 v1, p1, -0x1

    .line 294
    div-int/lit8 v1, v1, 0x1f

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ll/ۧۗᩴ;->Y(I)Ll/ۧۗᩴ;

    move-result-object v1

    .line 295
    invoke-virtual {v1, v0}, Ll/ۧۗᩴ;->V(Z)I

    move-result v2

    invoke-virtual {v1, v0}, Ll/ۧۗᩴ;->W(Z)I

    move-result v3

    add-int/2addr v3, v2

    add-int/lit8 v3, v3, -0x1

    if-le p1, v3, :cond_2

    const-wide/16 v2, 0x1

    long-to-int v3, v2

    .line 394
    sget-object v2, Ll/ۧۗᩴ;->a:[Ll/ۧۗᩴ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    add-int/lit8 v3, v3, 0xc

    add-int/2addr v3, v1

    rem-int/lit8 v3, v3, 0xc

    aget-object v1, v2, v3

    .line 299
    :cond_2
    invoke-virtual {v1, v0}, Ll/ۧۗᩴ;->V(Z)I

    move-result v0

    sub-int/2addr p1, v0

    add-int/lit8 p1, p1, 0x1

    .line 300
    new-instance v0, Ll/ᩴ᩹ᩴ;

    invoke-virtual {v1}, Ll/ۧۗᩴ;->getValue()I

    move-result v1

    invoke-direct {v0, p0, v1, p1}, Ll/ᩴ᩹ᩴ;-><init>(III)V

    return-object v0
.end method

.method public static now()Ll/ᩴ᩹ᩴ;
    .locals 1

    .line 198
    invoke-static {}, Ll/ۡ᩹ᩴ;->a()Ll/۠᩹ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ᩹ᩴ;->g0(Ll/۠᩹ᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public static p0(III)Ll/ᩴ᩹ᩴ;
    .locals 3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    const/16 v0, 0x9

    if-eq p1, v0, :cond_0

    const/16 v0, 0xb

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    const/16 v0, 0x1e

    .line 483
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    goto :goto_1

    .line 477
    :cond_1
    sget-object v0, Ll/۠᩶ᩴ;->c:Ll/۠᩶ᩴ;

    int-to-long v1, p0

    invoke-virtual {v0, v1, v2}, Ll/۠᩶ᩴ;->S(J)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x1d

    goto :goto_0

    :cond_2
    const/16 v0, 0x1c

    :goto_0
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 486
    :goto_1
    new-instance v0, Ll/ᩴ᩹ᩴ;

    invoke-direct {v0, p0, p1, p2}, Ll/ᩴ᩹ᩴ;-><init>(III)V

    return-object v0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 2214
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization via serialization delegate"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    .line 2204
    new-instance v0, Ll/᩷ۗᩴ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Ll/᩷ۗᩴ;-><init>(BLjava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic B(Ll/ۗۗᩴ;)Ll/۬᩹ᩴ;
    .locals 0

    .line 139
    invoke-virtual {p0, p1}, Ll/ᩴ᩹ᩴ;->r0(Ll/ۗۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic C(JLl/ۡۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 139
    invoke-virtual {p0, p1, p2, p3}, Ll/ᩴ᩹ᩴ;->e0(JLl/ۘۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final G(Ll/ۤۗᩴ;)J
    .locals 2

    .line 680
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_2

    .line 681
    sget-object v0, Ll/ᩴۗᩴ;->EPOCH_DAY:Ll/ᩴۗᩴ;

    if-ne p1, v0, :cond_0

    .line 682
    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->H()J

    move-result-wide v0

    return-wide v0

    .line 684
    :cond_0
    sget-object v0, Ll/ᩴۗᩴ;->PROLEPTIC_MONTH:Ll/ᩴۗᩴ;

    if-ne p1, v0, :cond_1

    .line 685
    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->b0()J

    move-result-wide v0

    return-wide v0

    .line 687
    :cond_1
    invoke-virtual {p0, p1}, Ll/ᩴ᩹ᩴ;->Y(Ll/ۤۗᩴ;)I

    move-result p1

    int-to-long v0, p1

    return-wide v0

    .line 689
    :cond_2
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->C(Ll/ۖۗᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final H()J
    .locals 12

    .line 1954
    iget v0, p0, Ll/ᩴ᩹ᩴ;->a:I

    int-to-long v0, v0

    .line 1955
    iget-short v2, p0, Ll/ᩴ᩹ᩴ;->b:S

    int-to-long v2, v2

    const-wide/16 v4, 0x16d

    mul-long v4, v4, v0

    const-wide/16 v6, 0x0

    cmp-long v8, v0, v6

    if-ltz v8, :cond_0

    const-wide/16 v6, 0x3

    add-long/2addr v6, v0

    const-wide/16 v8, 0x4

    .line 1959
    div-long/2addr v6, v8

    const-wide/16 v8, 0x63

    add-long/2addr v8, v0

    const-wide/16 v10, 0x64

    div-long/2addr v8, v10

    sub-long/2addr v6, v8

    const-wide/16 v8, 0x18f

    add-long/2addr v0, v8

    const-wide/16 v8, 0x190

    div-long/2addr v0, v8

    add-long/2addr v0, v6

    add-long/2addr v0, v4

    goto :goto_0

    :cond_0
    const-wide/16 v6, -0x4

    .line 1961
    div-long v6, v0, v6

    const-wide/16 v8, -0x64

    div-long v8, v0, v8

    sub-long/2addr v6, v8

    const-wide/16 v8, -0x190

    div-long/2addr v0, v8

    add-long/2addr v0, v6

    sub-long v0, v4, v0

    :goto_0
    const-wide/16 v4, 0x16f

    mul-long v4, v4, v2

    const-wide/16 v6, 0x16a

    sub-long/2addr v4, v6

    const-wide/16 v6, 0xc

    .line 1963
    div-long/2addr v4, v6

    add-long/2addr v4, v0

    .line 1964
    iget-short v0, p0, Ll/ᩴ᩹ᩴ;->c:S

    add-int/lit8 v0, v0, -0x1

    int-to-long v0, v0

    add-long/2addr v4, v0

    const-wide/16 v0, 0x2

    cmp-long v6, v2, v0

    if-lez v6, :cond_2

    const-wide/16 v2, 0x1

    sub-long v2, v4, v2

    .line 1967
    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->u()Z

    move-result v6

    if-nez v6, :cond_1

    sub-long/2addr v4, v0

    goto :goto_1

    :cond_1
    move-wide v4, v2

    :cond_2
    :goto_1
    const-wide/32 v0, 0xafaa8

    sub-long/2addr v4, v0

    return-wide v4
.end method

.method public final I(Ll/۟ۙᩴ;)Ll/ܰ᩹ᩴ;
    .locals 0

    .line 1831
    invoke-static {p0, p1}, Ll/᩺ۙᩴ;->Y(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)Ll/᩺ۙᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final K()Ll/ۘ᩶ᩴ;
    .locals 2

    .line 762
    iget v0, p0, Ll/ᩴ᩹ᩴ;->a:I

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    .line 748
    sget-object v0, Ll/ܶ᩶ᩴ;->CE:Ll/ܶ᩶ᩴ;

    return-object v0

    :cond_0
    sget-object v0, Ll/ܶ᩶ᩴ;->BCE:Ll/ܶ᩶ᩴ;

    return-object v0
.end method

.method public final N(Ll/۫ۗᩴ;)Ll/۬᩹ᩴ;
    .locals 4

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 1170
    check-cast p1, Ll/ۜۗᩴ;

    .line 859
    iget v0, p1, Ll/ۜۗᩴ;->a:I

    int-to-long v0, v0

    const-wide/16 v2, 0xc

    mul-long v0, v0, v2

    iget v2, p1, Ll/ۜۗᩴ;->b:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 1171
    invoke-virtual {p0, v0, v1}, Ll/ᩴ᩹ᩴ;->m0(J)Ll/ᩴ᩹ᩴ;

    move-result-object v0

    .line 543
    iget p1, p1, Ll/ۜۗᩴ;->c:I

    int-to-long v1, p1

    .line 1171
    invoke-virtual {v0, v1, v2}, Ll/ᩴ᩹ᩴ;->l0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    :cond_1
    const-string v0, "amountToAdd"

    .line 1173
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1174
    check-cast p1, Ll/ۜۗᩴ;

    invoke-virtual {p1, p0}, Ll/ۜۗᩴ;->l(Ll/ܺۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    check-cast p1, Ll/ᩴ᩹ᩴ;

    return-object p1
.end method

.method public final Q()I
    .locals 1

    .line 890
    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x16e

    return v0

    :cond_0
    const/16 v0, 0x16d

    return v0
.end method

.method public final R(Ll/۬᩹ᩴ;)I
    .locals 1

    .line 2014
    instance-of v0, p1, Ll/ᩴ᩹ᩴ;

    if-eqz v0, :cond_0

    .line 2015
    check-cast p1, Ll/ᩴ᩹ᩴ;

    invoke-virtual {p0, p1}, Ll/ᩴ᩹ᩴ;->V(Ll/ᩴ᩹ᩴ;)I

    move-result p1

    return p1

    .line 2017
    :cond_0
    invoke-static {p0, p1}, Ll/᩺ۚᩴ;->b(Ll/۬᩹ᩴ;Ll/۬᩹ᩴ;)I

    move-result p1

    return p1
.end method

.method public final T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;
    .locals 1

    .line 1560
    sget-object v0, Ll/ۛۗᩴ;->f:Ll/ۡ֨ᩴ;

    if-ne p1, v0, :cond_0

    return-object p0

    .line 1563
    :cond_0
    invoke-static {p0, p1}, Ll/᩺ۚᩴ;->g(Ll/۬᩹ᩴ;Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final V(Ll/ᩴ᩹ᩴ;)I
    .locals 2

    .line 2021
    iget v0, p0, Ll/ᩴ᩹ᩴ;->a:I

    iget v1, p1, Ll/ᩴ᩹ᩴ;->a:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    .line 2023
    iget-short v0, p0, Ll/ᩴ᩹ᩴ;->b:S

    iget-short v1, p1, Ll/ᩴ᩹ᩴ;->b:S

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    .line 2025
    iget-short v0, p0, Ll/ᩴ᩹ᩴ;->c:S

    iget-short p1, p1, Ll/ᩴ᩹ᩴ;->c:S

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final Y(Ll/ۤۗᩴ;)I
    .locals 2

    .line 693
    sget-object v0, Ll/ۤ᩶ᩴ;->a:[I

    move-object v1, p1

    check-cast v1, Ll/ᩴۗᩴ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    .line 708
    new-instance v0, Ll/ۨۗᩴ;

    const-string v1, "Unsupported field: "

    .line 0
    invoke-static {v1, p1}, Ll/ܶ᩹ᩴ;->a(Ljava/lang/String;Ll/ۤۗᩴ;)Ljava/lang/String;

    move-result-object p1

    .line 88
    invoke-direct {v0, p1}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 708
    throw v0

    .line 706
    :pswitch_0
    iget p1, p0, Ll/ᩴ᩹ᩴ;->a:I

    if-lt p1, v1, :cond_0

    return v1

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 705
    :pswitch_1
    iget p1, p0, Ll/ᩴ᩹ᩴ;->a:I

    return p1

    .line 703
    :pswitch_2
    new-instance p1, Ll/ۨۗᩴ;

    const-string v0, "Invalid field \'ProlepticMonth\' for get() method, use getLong() instead"

    .line 88
    invoke-direct {p1, v0}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 703
    throw p1

    .line 702
    :pswitch_3
    iget-short p1, p0, Ll/ᩴ᩹ᩴ;->b:S

    return p1

    .line 701
    :pswitch_4
    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->a0()I

    move-result p1

    sub-int/2addr p1, v1

    div-int/lit8 p1, p1, 0x7

    add-int/2addr p1, v1

    return p1

    .line 699
    :pswitch_5
    new-instance p1, Ll/ۨۗᩴ;

    const-string v0, "Invalid field \'EpochDay\' for get() method, use getLong() instead"

    .line 88
    invoke-direct {p1, v0}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 699
    throw p1

    .line 696
    :pswitch_6
    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->a0()I

    move-result p1

    sub-int/2addr p1, v1

    rem-int/lit8 p1, p1, 0x7

    add-int/2addr p1, v1

    return p1

    .line 695
    :pswitch_7
    iget-short p1, p0, Ll/ᩴ᩹ᩴ;->c:S

    sub-int/2addr p1, v1

    rem-int/lit8 p1, p1, 0x7

    add-int/2addr p1, v1

    return p1

    .line 694
    :pswitch_8
    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->Z()Ll/᩸᩹ᩴ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸᩹ᩴ;->getValue()I

    move-result p1

    return p1

    .line 704
    :pswitch_9
    iget p1, p0, Ll/ᩴ᩹ᩴ;->a:I

    if-lt p1, v1, :cond_1

    return p1

    :cond_1
    sub-int/2addr v1, p1

    return v1

    .line 700
    :pswitch_a
    iget-short p1, p0, Ll/ᩴ᩹ᩴ;->c:S

    sub-int/2addr p1, v1

    div-int/lit8 p1, p1, 0x7

    add-int/2addr p1, v1

    return p1

    .line 698
    :pswitch_b
    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->a0()I

    move-result p1

    return p1

    .line 697
    :pswitch_c
    iget-short p1, p0, Ll/ᩴ᩹ᩴ;->c:S

    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final Z()Ll/᩸᩹ᩴ;
    .locals 4

    .line 830
    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->H()J

    move-result-wide v0

    const-wide/16 v2, 0x3

    add-long/2addr v0, v2

    const/4 v2, 0x7

    int-to-long v2, v2

    .line 0
    invoke-static {v0, v1, v2, v3}, Ll/᩺ۚᩴ;->O(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    add-int/lit8 v1, v1, 0x1

    .line 831
    invoke-static {v1}, Ll/᩸᩹ᩴ;->V(I)Ll/᩸᩹ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final a()Ll/ۖ᩶ᩴ;
    .locals 1

    .line 728
    sget-object v0, Ll/۠᩶ᩴ;->c:Ll/۠᩶ᩴ;

    return-object v0
.end method

.method public final a0()I
    .locals 2

    .line 791
    iget-short v0, p0, Ll/ᩴ᩹ᩴ;->b:S

    invoke-static {v0}, Ll/ۧۗᩴ;->Y(I)Ll/ۧۗᩴ;

    move-result-object v0

    .line 813
    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->u()Z

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۧۗᩴ;->V(Z)I

    move-result v0

    iget-short v1, p0, Ll/ᩴ᩹ᩴ;->c:S

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public atStartOfDay(Ll/ۚ᩹ᩴ;)Ll/֨᩹ᩴ;
    .locals 5

    const-string v0, "zone"

    .line 1937
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1940
    sget-object v0, Ll/۟ۙᩴ;->g:Ll/۟ۙᩴ;

    .line 1831
    invoke-static {p0, v0}, Ll/᩺ۙᩴ;->Y(Ll/ᩴ᩹ᩴ;Ll/۟ۙᩴ;)Ll/᩺ۙᩴ;

    move-result-object v0

    .line 1941
    instance-of v1, p1, Ll/ᩳ۬ᩴ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    .line 1942
    invoke-virtual {p1}, Ll/ۚ᩹ᩴ;->W()Ll/ܺ۬ᩴ;

    move-result-object v1

    .line 684
    invoke-virtual {v1, v0}, Ll/ܺ۬ᩴ;->e(Ll/᩺ۙᩴ;)Ljava/lang/Object;

    move-result-object v1

    .line 685
    instance-of v3, v1, Ll/ۜ۬ᩴ;

    if-eqz v3, :cond_0

    check-cast v1, Ll/ۜ۬ᩴ;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    .line 1944
    invoke-virtual {v1}, Ll/ۜ۬ᩴ;->l()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 294
    iget-object v0, v1, Ll/ۜ۬ᩴ;->b:Ll/᩺ۙᩴ;

    .line 316
    iget-object v3, v1, Ll/ۜ۬ᩴ;->d:Ll/ᩳ۬ᩴ;

    .line 474
    iget v3, v3, Ll/ᩳ۬ᩴ;->b:I

    .line 305
    iget-object v1, v1, Ll/ۜ۬ᩴ;->c:Ll/ᩳ۬ᩴ;

    .line 474
    iget v1, v1, Ll/ᩳ۬ᩴ;->b:I

    sub-int/2addr v3, v1

    int-to-long v3, v3

    .line 294
    invoke-virtual {v0, v3, v4}, Ll/᩺ۙᩴ;->b0(J)Ll/᩺ۙᩴ;

    move-result-object v0

    .line 293
    :cond_1
    invoke-static {v0, p1, v2}, Ll/֨᩹ᩴ;->W(Ll/᩺ۙᩴ;Ll/ۚ᩹ᩴ;Ll/ᩳ۬ᩴ;)Ll/֨᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final b0()J
    .locals 4

    .line 712
    iget v0, p0, Ll/ᩴ᩹ᩴ;->a:I

    int-to-long v0, v0

    const-wide/16 v2, 0xc

    mul-long v0, v0, v2

    iget-short v2, p0, Ll/ᩴ᩹ᩴ;->b:S

    int-to-long v2, v2

    add-long/2addr v0, v2

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public final bridge synthetic c(JLl/ۤۗᩴ;)Ll/۬᩹ᩴ;
    .locals 0

    .line 139
    invoke-virtual {p0, p1, p2, p3}, Ll/ᩴ᩹ᩴ;->q0(JLl/ۤۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 139
    invoke-virtual {p0, p1, p2, p3}, Ll/ᩴ᩹ᩴ;->q0(JLl/ۤۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final c0(Ll/۬᩹ᩴ;)Z
    .locals 7

    .line 2083
    instance-of v0, p1, Ll/ᩴ᩹ᩴ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 2084
    check-cast p1, Ll/ᩴ᩹ᩴ;

    invoke-virtual {p0, p1}, Ll/ᩴ᩹ᩴ;->V(Ll/ᩴ᩹ᩴ;)I

    move-result p1

    if-gez p1, :cond_0

    return v2

    :cond_0
    return v1

    .line 747
    :cond_1
    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->H()J

    move-result-wide v3

    invoke-interface {p1}, Ll/۬᩹ᩴ;->H()J

    move-result-wide v5

    cmp-long p1, v3, v5

    if-gez p1, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 139
    check-cast p1, Ll/۬᩹ᩴ;

    invoke-virtual {p0, p1}, Ll/ᩴ᩹ᩴ;->R(Ll/۬᩹ᩴ;)I

    move-result p1

    return p1
.end method

.method public final bridge synthetic d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;
    .locals 0

    .line 139
    invoke-virtual {p0, p1, p2, p3}, Ll/ᩴ᩹ᩴ;->k0(JLl/ۘۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 139
    invoke-virtual {p0, p1, p2, p3}, Ll/ᩴ᩹ᩴ;->k0(JLl/ۘۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final d0()I
    .locals 2

    .line 868
    iget-short v0, p0, Ll/ᩴ᩹ᩴ;->b:S

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    const/16 v1, 0xb

    if-eq v0, v1, :cond_0

    const/16 v0, 0x1f

    return v0

    :cond_0
    const/16 v0, 0x1e

    return v0

    .line 870
    :cond_1
    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->u()Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x1d

    return v0

    :cond_2
    const/16 v0, 0x1c

    return v0
.end method

.method public final e(Ll/ۤۗᩴ;)Z
    .locals 0

    .line 540
    invoke-static {p0, p1}, Ll/᩺ۚᩴ;->f(Ll/۬᩹ᩴ;Ll/ۤۗᩴ;)Z

    move-result p1

    return p1
.end method

.method public final e0(JLl/ۘۗᩴ;)Ll/ᩴ᩹ᩴ;
    .locals 3

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    .line 1448
    invoke-virtual {p0, p1, p2, p3}, Ll/ᩴ᩹ᩴ;->k0(JLl/ۘۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Ll/ᩴ᩹ᩴ;->k0(JLl/ۘۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Ll/ᩴ᩹ᩴ;->k0(JLl/ۘۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 2136
    :cond_0
    instance-of v1, p1, Ll/ᩴ᩹ᩴ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 2137
    check-cast p1, Ll/ᩴ᩹ᩴ;

    invoke-virtual {p0, p1}, Ll/ᩴ᩹ᩴ;->V(Ll/ᩴ᩹ᩴ;)I

    move-result p1

    if-nez p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final f0(Ll/ᩴ᩹ᩴ;)J
    .locals 8

    .line 1666
    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->b0()J

    move-result-wide v0

    const-wide/16 v2, 0x20

    mul-long v0, v0, v2

    .line 802
    iget-short v4, p0, Ll/ᩴ᩹ᩴ;->c:S

    int-to-long v4, v4

    add-long/2addr v0, v4

    .line 1667
    invoke-virtual {p1}, Ll/ᩴ᩹ᩴ;->b0()J

    move-result-wide v4

    mul-long v4, v4, v2

    .line 802
    iget-short p1, p1, Ll/ᩴ᩹ᩴ;->c:S

    int-to-long v6, p1

    add-long/2addr v4, v6

    sub-long/2addr v4, v0

    .line 1668
    div-long/2addr v4, v2

    return-wide v4
.end method

.method public final g(Ll/ܺۗᩴ;Ll/ۘۗᩴ;)J
    .locals 2

    .line 1644
    invoke-static {p1}, Ll/ᩴ᩹ᩴ;->X(Ll/ۖۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    .line 1645
    instance-of v0, p2, Ll/ۡۗᩴ;

    if-eqz v0, :cond_0

    .line 1646
    sget-object v0, Ll/ۤ᩶ᩴ;->b:[I

    move-object v1, p2

    check-cast v1, Ll/ۡۗᩴ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 1656
    new-instance p1, Ll/ۨۗᩴ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported unit: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 88
    invoke-direct {p1, p2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 1656
    throw p1

    .line 1654
    :pswitch_0
    sget-object p2, Ll/ᩴۗᩴ;->ERA:Ll/ᩴۗᩴ;

    invoke-virtual {p1, p2}, Ll/ᩴ᩹ᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    invoke-virtual {p0, p2}, Ll/ᩴ᩹ᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide p1

    sub-long/2addr v0, p1

    return-wide v0

    .line 1653
    :pswitch_1
    invoke-virtual {p0, p1}, Ll/ᩴ᩹ᩴ;->f0(Ll/ᩴ᩹ᩴ;)J

    move-result-wide p1

    const-wide/16 v0, 0x2ee0

    div-long/2addr p1, v0

    return-wide p1

    .line 1652
    :pswitch_2
    invoke-virtual {p0, p1}, Ll/ᩴ᩹ᩴ;->f0(Ll/ᩴ᩹ᩴ;)J

    move-result-wide p1

    const-wide/16 v0, 0x4b0

    div-long/2addr p1, v0

    return-wide p1

    .line 1651
    :pswitch_3
    invoke-virtual {p0, p1}, Ll/ᩴ᩹ᩴ;->f0(Ll/ᩴ᩹ᩴ;)J

    move-result-wide p1

    const-wide/16 v0, 0x78

    div-long/2addr p1, v0

    return-wide p1

    .line 1650
    :pswitch_4
    invoke-virtual {p0, p1}, Ll/ᩴ᩹ᩴ;->f0(Ll/ᩴ᩹ᩴ;)J

    move-result-wide p1

    const-wide/16 v0, 0xc

    div-long/2addr p1, v0

    return-wide p1

    .line 1649
    :pswitch_5
    invoke-virtual {p0, p1}, Ll/ᩴ᩹ᩴ;->f0(Ll/ᩴ᩹ᩴ;)J

    move-result-wide p1

    return-wide p1

    .line 1662
    :pswitch_6
    invoke-virtual {p1}, Ll/ᩴ᩹ᩴ;->H()J

    move-result-wide p1

    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->H()J

    move-result-wide v0

    sub-long/2addr p1, v0

    const-wide/16 v0, 0x7

    .line 1648
    div-long/2addr p1, v0

    return-wide p1

    .line 1662
    :pswitch_7
    invoke-virtual {p1}, Ll/ᩴ᩹ᩴ;->H()J

    move-result-wide p1

    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->H()J

    move-result-wide v0

    sub-long/2addr p1, v0

    return-wide p1

    .line 1658
    :cond_0
    invoke-interface {p2, p0, p1}, Ll/ۘۗᩴ;->l(Ll/ܺۗᩴ;Ll/ܺۗᩴ;)J

    move-result-wide p1

    return-wide p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final hashCode()I
    .locals 4

    .line 2149
    iget v0, p0, Ll/ᩴ᩹ᩴ;->a:I

    .line 2150
    iget-short v1, p0, Ll/ᩴ᩹ᩴ;->b:S

    .line 2151
    iget-short v2, p0, Ll/ᩴ᩹ᩴ;->c:S

    and-int/lit16 v3, v0, -0x800

    shl-int/lit8 v0, v0, 0xb

    shl-int/lit8 v1, v1, 0x6

    add-int/2addr v0, v1

    add-int/2addr v0, v2

    xor-int/2addr v0, v3

    return v0
.end method

.method public final k0(JLl/ۘۗᩴ;)Ll/ᩴ᩹ᩴ;
    .locals 2

    .line 1260
    instance-of v0, p3, Ll/ۡۗᩴ;

    if-eqz v0, :cond_0

    .line 1261
    move-object v0, p3

    check-cast v0, Ll/ۡۗᩴ;

    .line 1262
    sget-object v1, Ll/ۤ᩶ᩴ;->b:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 1272
    new-instance p1, Ll/ۨۗᩴ;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unsupported unit: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 88
    invoke-direct {p1, p2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 1272
    throw p1

    .line 1270
    :pswitch_0
    sget-object p3, Ll/ᩴۗᩴ;->ERA:Ll/ᩴۗᩴ;

    invoke-virtual {p0, p3}, Ll/ᩴ᩹ᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, p3}, Ll/ᩴ᩹ᩴ;->q0(JLl/ۤۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    :pswitch_1
    const/16 p3, 0x3e8

    int-to-long v0, p3

    .line 0
    invoke-static {p1, p2, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide p1

    .line 1269
    invoke-virtual {p0, p1, p2}, Ll/ᩴ᩹ᩴ;->o0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    :pswitch_2
    const/16 p3, 0x64

    int-to-long v0, p3

    .line 0
    invoke-static {p1, p2, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide p1

    .line 1268
    invoke-virtual {p0, p1, p2}, Ll/ᩴ᩹ᩴ;->o0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    :pswitch_3
    const/16 p3, 0xa

    int-to-long v0, p3

    .line 0
    invoke-static {p1, p2, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide p1

    .line 1267
    invoke-virtual {p0, p1, p2}, Ll/ᩴ᩹ᩴ;->o0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 1266
    :pswitch_4
    invoke-virtual {p0, p1, p2}, Ll/ᩴ᩹ᩴ;->o0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 1265
    :pswitch_5
    invoke-virtual {p0, p1, p2}, Ll/ᩴ᩹ᩴ;->m0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 1264
    :pswitch_6
    invoke-virtual {p0, p1, p2}, Ll/ᩴ᩹ᩴ;->n0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 1263
    :pswitch_7
    invoke-virtual {p0, p1, p2}, Ll/ᩴ᩹ᩴ;->l0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 1274
    :cond_0
    invoke-interface {p3, p0, p1, p2}, Ll/ۘۗᩴ;->m(Ll/ܺۗᩴ;J)Ll/ܺۗᩴ;

    move-result-object p1

    check-cast p1, Ll/ᩴ᩹ᩴ;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final l(Ll/ۤۗᩴ;)I
    .locals 1

    .line 649
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_0

    .line 650
    invoke-virtual {p0, p1}, Ll/ᩴ᩹ᩴ;->Y(Ll/ۤۗᩴ;)I

    move-result p1

    return p1

    .line 652
    :cond_0
    invoke-static {p0, p1}, Ll/ۛۗᩴ;->a(Ll/ۖۗᩴ;Ll/ۤۗᩴ;)I

    move-result p1

    return p1
.end method

.method public final l0(J)Ll/ᩴ᩹ᩴ;
    .locals 7

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    return-object p0

    .line 1375
    :cond_0
    iget-short v2, p0, Ll/ᩴ᩹ᩴ;->c:S

    int-to-long v2, v2

    add-long/2addr v2, p1

    cmp-long v4, v2, v0

    if-lez v4, :cond_4

    const-wide/16 v0, 0x1c

    cmp-long v4, v2, v0

    if-gtz v4, :cond_1

    .line 1378
    new-instance p1, Ll/ᩴ᩹ᩴ;

    iget p2, p0, Ll/ᩴ᩹ᩴ;->a:I

    iget-short v0, p0, Ll/ᩴ᩹ᩴ;->b:S

    long-to-int v1, v2

    invoke-direct {p1, p2, v0, v1}, Ll/ᩴ᩹ᩴ;-><init>(III)V

    return-object p1

    :cond_1
    const-wide/16 v0, 0x3b

    cmp-long v4, v2, v0

    if-gtz v4, :cond_4

    .line 1380
    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->d0()I

    move-result p1

    int-to-long p1, p1

    cmp-long v0, v2, p1

    if-gtz v0, :cond_2

    .line 1382
    new-instance p1, Ll/ᩴ᩹ᩴ;

    iget p2, p0, Ll/ᩴ᩹ᩴ;->a:I

    iget-short v0, p0, Ll/ᩴ᩹ᩴ;->b:S

    long-to-int v1, v2

    invoke-direct {p1, p2, v0, v1}, Ll/ᩴ᩹ᩴ;-><init>(III)V

    return-object p1

    .line 1383
    :cond_2
    iget-short v0, p0, Ll/ᩴ᩹ᩴ;->b:S

    const/16 v1, 0xc

    const/4 v4, 0x1

    if-ge v0, v1, :cond_3

    .line 1384
    new-instance v1, Ll/ᩴ᩹ᩴ;

    iget v5, p0, Ll/ᩴ᩹ᩴ;->a:I

    add-int/2addr v0, v4

    sub-long/2addr v2, p1

    long-to-int p1, v2

    invoke-direct {v1, v5, v0, p1}, Ll/ᩴ᩹ᩴ;-><init>(III)V

    return-object v1

    .line 1386
    :cond_3
    sget-object v0, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    iget v1, p0, Ll/ᩴ᩹ᩴ;->a:I

    add-int/2addr v1, v4

    int-to-long v5, v1

    invoke-virtual {v0, v5, v6}, Ll/ᩴۗᩴ;->T(J)V

    .line 1387
    new-instance v0, Ll/ᩴ᩹ᩴ;

    iget v1, p0, Ll/ᩴ᩹ᩴ;->a:I

    add-int/2addr v1, v4

    sub-long/2addr v2, p1

    long-to-int p1, v2

    invoke-direct {v0, v1, v4, p1}, Ll/ᩴ᩹ᩴ;-><init>(III)V

    return-object v0

    .line 1392
    :cond_4
    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->H()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide p1

    .line 1393
    invoke-static {p1, p2}, Ll/ᩴ᩹ᩴ;->i0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic m(Ll/ᩴ᩹ᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 139
    invoke-virtual {p0, p1}, Ll/ᩴ᩹ᩴ;->r0(Ll/ۗۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final m0(J)Ll/ᩴ᩹ᩴ;
    .locals 6

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    return-object p0

    .line 1330
    :cond_0
    iget v0, p0, Ll/ᩴ᩹ᩴ;->a:I

    int-to-long v0, v0

    const-wide/16 v2, 0xc

    mul-long v0, v0, v2

    iget-short v2, p0, Ll/ᩴ᩹ᩴ;->b:S

    add-int/lit8 v2, v2, -0x1

    int-to-long v2, v2

    add-long/2addr v0, v2

    add-long/2addr v0, p1

    .line 1332
    sget-object p1, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    const/16 p2, 0xc

    int-to-long v2, p2

    .line 0
    invoke-static {v0, v1, v2, v3}, Ll/᩺ۚᩴ;->z(JJ)J

    move-result-wide v4

    .line 669
    iget-object p2, p1, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 732
    invoke-virtual {p2, v4, v5, p1}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result p1

    .line 0
    invoke-static {v0, v1, v2, v3}, Ll/᩺ۚᩴ;->O(JJ)J

    move-result-wide v0

    long-to-int p2, v0

    add-int/lit8 p2, p2, 0x1

    .line 1334
    iget-short v0, p0, Ll/ᩴ᩹ᩴ;->c:S

    invoke-static {p1, p2, v0}, Ll/ᩴ᩹ᩴ;->p0(III)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;
    .locals 4

    .line 603
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_7

    .line 604
    move-object v0, p1

    check-cast v0, Ll/ᩴۗᩴ;

    .line 605
    invoke-virtual {v0}, Ll/ᩴۗᩴ;->isDateBased()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 606
    sget-object p1, Ll/ۤ᩶ᩴ;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget p1, p1, v1

    const/4 v1, 0x1

    const-wide/16 v2, 0x1

    if-eq p1, v1, :cond_5

    const/4 v1, 0x2

    if-eq p1, v1, :cond_4

    const/4 v1, 0x3

    if-eq p1, v1, :cond_2

    const/4 v1, 0x4

    if-eq p1, v1, :cond_0

    .line 669
    iget-object p1, v0, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    return-object p1

    .line 762
    :cond_0
    iget p1, p0, Ll/ᩴ᩹ᩴ;->a:I

    if-gtz p1, :cond_1

    const-wide/32 v0, 0x3b9aca00

    .line 611
    invoke-static {v2, v3, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    :cond_1
    const-wide/32 v0, 0x3b9ac9ff

    invoke-static {v2, v3, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 791
    :cond_2
    iget-short p1, p0, Ll/ᩴ᩹ᩴ;->b:S

    invoke-static {p1}, Ll/ۧۗᩴ;->Y(I)Ll/ۧۗᩴ;

    move-result-object p1

    .line 609
    sget-object v0, Ll/ۧۗᩴ;->FEBRUARY:Ll/ۧۗᩴ;

    if-ne p1, v0, :cond_3

    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->u()Z

    move-result p1

    if-nez p1, :cond_3

    const-wide/16 v0, 0x4

    goto :goto_0

    :cond_3
    const-wide/16 v0, 0x5

    :goto_0
    invoke-static {v2, v3, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 608
    :cond_4
    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->Q()I

    move-result p1

    int-to-long v0, p1

    invoke-static {v2, v3, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 607
    :cond_5
    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->d0()I

    move-result p1

    int-to-long v0, p1

    invoke-static {v2, v3, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 615
    :cond_6
    new-instance v0, Ll/ۨۗᩴ;

    const-string v1, "Unsupported field: "

    .line 0
    invoke-static {v1, p1}, Ll/ܶ᩹ᩴ;->a(Ljava/lang/String;Ll/ۤۗᩴ;)Ljava/lang/String;

    move-result-object p1

    .line 88
    invoke-direct {v0, p1}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 615
    throw v0

    .line 617
    :cond_7
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->m(Ll/ۖۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final n0(J)Ll/ᩴ᩹ᩴ;
    .locals 2

    const/4 v0, 0x7

    int-to-long v0, v0

    .line 0
    invoke-static {p1, p2, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide p1

    .line 1353
    invoke-virtual {p0, p1, p2}, Ll/ᩴ᩹ᩴ;->l0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final o0(J)Ll/ᩴ᩹ᩴ;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    return-object p0

    .line 1302
    :cond_0
    sget-object v0, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    iget v1, p0, Ll/ᩴ᩹ᩴ;->a:I

    int-to-long v1, v1

    add-long/2addr v1, p1

    .line 669
    iget-object p1, v0, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 732
    invoke-virtual {p1, v1, v2, v0}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result p1

    .line 1303
    iget-short p2, p0, Ll/ᩴ᩹ᩴ;->b:S

    iget-short v0, p0, Ll/ᩴ᩹ᩴ;->c:S

    invoke-static {p1, p2, v0}, Ll/ᩴ᩹ᩴ;->p0(III)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final q0(JLl/ۤۗᩴ;)Ll/ᩴ᩹ᩴ;
    .locals 4

    .line 1046
    instance-of v0, p3, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_5

    .line 1047
    move-object v0, p3

    check-cast v0, Ll/ᩴۗᩴ;

    .line 1048
    invoke-virtual {v0, p1, p2}, Ll/ᩴۗᩴ;->T(J)V

    .line 1049
    sget-object v1, Ll/ۤ᩶ᩴ;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    .line 1064
    new-instance p1, Ll/ۨۗᩴ;

    const-string p2, "Unsupported field: "

    .line 0
    invoke-static {p2, p3}, Ll/ܶ᩹ᩴ;->a(Ljava/lang/String;Ll/ۤۗᩴ;)Ljava/lang/String;

    move-result-object p2

    .line 88
    invoke-direct {p1, p2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 1064
    throw p1

    .line 1062
    :pswitch_0
    sget-object p3, Ll/ᩴۗᩴ;->ERA:Ll/ᩴۗᩴ;

    invoke-virtual {p0, p3}, Ll/ᩴ᩹ᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v2

    cmp-long p3, v2, p1

    if-nez p3, :cond_0

    goto/16 :goto_1

    :cond_0
    iget p1, p0, Ll/ᩴ᩹ᩴ;->a:I

    sub-int/2addr v1, p1

    invoke-virtual {p0, v1}, Ll/ᩴ᩹ᩴ;->s0(I)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    :pswitch_1
    long-to-int p2, p1

    .line 1061
    invoke-virtual {p0, p2}, Ll/ᩴ᩹ᩴ;->s0(I)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 1059
    :pswitch_2
    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->b0()J

    move-result-wide v0

    sub-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ll/ᩴ᩹ᩴ;->m0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    :pswitch_3
    long-to-int p2, p1

    .line 1101
    iget-short p1, p0, Ll/ᩴ᩹ᩴ;->b:S

    if-ne p1, p2, :cond_1

    goto/16 :goto_1

    .line 1104
    :cond_1
    sget-object p1, Ll/ᩴۗᩴ;->MONTH_OF_YEAR:Ll/ᩴۗᩴ;

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Ll/ᩴۗᩴ;->T(J)V

    .line 1105
    iget p1, p0, Ll/ᩴ᩹ᩴ;->a:I

    iget-short p3, p0, Ll/ᩴ᩹ᩴ;->c:S

    invoke-static {p1, p2, p3}, Ll/ᩴ᩹ᩴ;->p0(III)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 1057
    :pswitch_4
    sget-object p3, Ll/ᩴۗᩴ;->ALIGNED_WEEK_OF_YEAR:Ll/ᩴۗᩴ;

    invoke-virtual {p0, p3}, Ll/ᩴ᩹ᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    sub-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ll/ᩴ᩹ᩴ;->n0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 1055
    :pswitch_5
    invoke-static {p1, p2}, Ll/ᩴ᩹ᩴ;->i0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 1052
    :pswitch_6
    sget-object p3, Ll/ᩴۗᩴ;->ALIGNED_DAY_OF_WEEK_IN_YEAR:Ll/ᩴۗᩴ;

    invoke-virtual {p0, p3}, Ll/ᩴ᩹ᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    sub-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ll/ᩴ᩹ᩴ;->l0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 1051
    :pswitch_7
    sget-object p3, Ll/ᩴۗᩴ;->ALIGNED_DAY_OF_WEEK_IN_MONTH:Ll/ᩴۗᩴ;

    invoke-virtual {p0, p3}, Ll/ᩴ᩹ᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    sub-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ll/ᩴ᩹ᩴ;->l0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 1050
    :pswitch_8
    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->Z()Ll/᩸᩹ᩴ;

    move-result-object p3

    invoke-virtual {p3}, Ll/᩸᩹ᩴ;->getValue()I

    move-result p3

    int-to-long v0, p3

    sub-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ll/ᩴ᩹ᩴ;->l0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 1060
    :pswitch_9
    iget p3, p0, Ll/ᩴ᩹ᩴ;->a:I

    if-lt p3, v1, :cond_2

    goto :goto_0

    :cond_2
    const-wide/16 v0, 0x1

    sub-long p1, v0, p1

    :goto_0
    long-to-int p2, p1

    invoke-virtual {p0, p2}, Ll/ᩴ᩹ᩴ;->s0(I)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 1056
    :pswitch_a
    sget-object p3, Ll/ᩴۗᩴ;->ALIGNED_WEEK_OF_MONTH:Ll/ᩴۗᩴ;

    invoke-virtual {p0, p3}, Ll/ᩴ᩹ᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    sub-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ll/ᩴ᩹ᩴ;->n0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    :pswitch_b
    long-to-int p2, p1

    .line 1140
    invoke-virtual {p0}, Ll/ᩴ᩹ᩴ;->a0()I

    move-result p1

    if-ne p1, p2, :cond_3

    goto :goto_1

    .line 1143
    :cond_3
    iget p1, p0, Ll/ᩴ᩹ᩴ;->a:I

    invoke-static {p1, p2}, Ll/ᩴ᩹ᩴ;->j0(II)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    :pswitch_c
    long-to-int p2, p1

    .line 1121
    iget-short p1, p0, Ll/ᩴ᩹ᩴ;->c:S

    if-ne p1, p2, :cond_4

    :goto_1
    return-object p0

    .line 1124
    :cond_4
    iget p1, p0, Ll/ᩴ᩹ᩴ;->a:I

    iget-short p3, p0, Ll/ᩴ᩹ᩴ;->b:S

    invoke-static {p1, p3, p2}, Ll/ᩴ᩹ᩴ;->h0(III)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 1066
    :cond_5
    invoke-interface {p3, p0, p1, p2}, Ll/ۤۗᩴ;->G(Ll/ܺۗᩴ;J)Ll/ܺۗᩴ;

    move-result-object p1

    check-cast p1, Ll/ᩴ᩹ᩴ;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r0(Ll/ۗۗᩴ;)Ll/ᩴ᩹ᩴ;
    .locals 1

    .line 934
    instance-of v0, p1, Ll/ᩴ᩹ᩴ;

    if-eqz v0, :cond_0

    .line 935
    check-cast p1, Ll/ᩴ᩹ᩴ;

    return-object p1

    .line 937
    :cond_0
    invoke-interface {p1, p0}, Ll/ۗۗᩴ;->s(Ll/ܺۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    check-cast p1, Ll/ᩴ᩹ᩴ;

    return-object p1
.end method

.method public final s(Ll/ܺۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 1592
    invoke-static {p0, p1}, Ll/᩺ۚᩴ;->a(Ll/۬᩹ᩴ;Ll/ܺۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final s0(I)Ll/ᩴ᩹ᩴ;
    .locals 3

    .line 1082
    iget v0, p0, Ll/ᩴ᩹ᩴ;->a:I

    if-ne v0, p1, :cond_0

    return-object p0

    .line 1085
    :cond_0
    sget-object v0, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Ll/ᩴۗᩴ;->T(J)V

    .line 1086
    iget-short v0, p0, Ll/ᩴ᩹ᩴ;->b:S

    iget-short v1, p0, Ll/ᩴ᩹ᩴ;->c:S

    invoke-static {p1, v0, v1}, Ll/ᩴ᩹ᩴ;->p0(III)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 2165
    iget v0, p0, Ll/ᩴ᩹ᩴ;->a:I

    .line 2166
    iget-short v1, p0, Ll/ᩴ᩹ᩴ;->b:S

    .line 2167
    iget-short v2, p0, Ll/ᩴ᩹ᩴ;->c:S

    .line 2168
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v3

    .line 2169
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v5, 0xa

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v6, 0x3e8

    if-ge v3, v6, :cond_1

    if-gez v0, :cond_0

    add-int/lit16 v0, v0, -0x2710

    .line 2172
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    add-int/lit16 v0, v0, 0x2710

    .line 2174
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const/16 v3, 0x270f

    if-le v0, v3, :cond_2

    const/16 v3, 0x2b

    .line 2178
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2180
    :cond_2
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_0
    const-string v0, "-"

    const-string v3, "-0"

    if-ge v1, v5, :cond_3

    move-object v6, v3

    goto :goto_1

    :cond_3
    move-object v6, v0

    .line 2182
    :goto_1
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2183
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-ge v2, v5, :cond_4

    move-object v0, v3

    .line 2184
    :cond_4
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2185
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2186
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Z
    .locals 3

    .line 855
    sget-object v0, Ll/۠᩶ᩴ;->c:Ll/۠᩶ᩴ;

    iget v1, p0, Ll/ᩴ᩹ᩴ;->a:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Ll/۠᩶ᩴ;->S(J)Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic w(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;
    .locals 0

    .line 139
    invoke-virtual {p0, p1, p2, p3}, Ll/ᩴ᩹ᩴ;->e0(JLl/ۘۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method
