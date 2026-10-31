.class public final Ll/۫ܺۜ;
.super Ljava/lang/Object;
.source "Y6XM"


# instance fields
.field public final ֫:[C

.field public ۧ:I

.field public ܽ:I

.field public final ᩳ:Ljava/io/InputStreamReader;


# direct methods
.method public constructor <init>(Ljava/io/InputStreamReader;)V
    .locals 1

    .line 409
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    new-array v0, v0, [C

    .line 405
    iput-object v0, p0, Ll/۫ܺۜ;->֫:[C

    .line 410
    iput-object p1, p0, Ll/۫ܺۜ;->ᩳ:Ljava/io/InputStreamReader;

    return-void
.end method

.method private ֫()I
    .locals 3

    .line 433
    :cond_0
    iget v0, p0, Ll/۫ܺۜ;->ܽ:I

    iget v1, p0, Ll/۫ܺۜ;->ۧ:I

    iget-object v2, p0, Ll/۫ܺۜ;->֫:[C

    if-lt v0, v1, :cond_1

    .line 434
    iget-object v0, p0, Ll/۫ܺۜ;->ᩳ:Ljava/io/InputStreamReader;

    invoke-virtual {v0, v2}, Ljava/io/Reader;->read([C)I

    move-result v0

    iput v0, p0, Ll/۫ܺۜ;->ۧ:I

    const/4 v1, 0x0

    .line 435
    iput v1, p0, Ll/۫ܺۜ;->ܽ:I

    if-gez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_1
    add-int/lit8 v1, v0, 0x1

    .line 443
    iput v1, p0, Ll/۫ܺۜ;->ܽ:I

    aget-char v0, v2, v0

    return v0
.end method

.method public static ֫(Ll/۫ܺۜ;)V
    .locals 5

    .line 450
    iget-object v0, p0, Ll/۫ܺۜ;->֫:[C

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    .line 452
    :cond_0
    :goto_1
    iget v3, p0, Ll/۫ܺۜ;->ܽ:I

    iget v4, p0, Ll/۫ܺۜ;->ۧ:I

    if-ge v3, v4, :cond_4

    add-int/lit8 v4, v3, 0x1

    .line 453
    iput v4, p0, Ll/۫ܺۜ;->ܽ:I

    aget-char v3, v0, v3

    if-eqz v2, :cond_2

    .line 455
    invoke-static {v3}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 456
    :cond_1
    new-instance p0, Ll/ۛܺۜ;

    invoke-direct {p0}, Ll/ۛܺۜ;-><init>()V

    throw p0

    .line 459
    :cond_2
    invoke-static {v3}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v4

    if-nez v4, :cond_3

    .line 461
    invoke-static {v3}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    .line 460
    :cond_3
    new-instance p0, Ll/ۛܺۜ;

    invoke-direct {p0}, Ll/ۛܺۜ;-><init>()V

    throw p0

    .line 465
    :cond_4
    iget-object v3, p0, Ll/۫ܺۜ;->ᩳ:Ljava/io/InputStreamReader;

    invoke-virtual {v3, v0}, Ljava/io/Reader;->read([C)I

    move-result v3

    iput v3, p0, Ll/۫ܺۜ;->ۧ:I

    .line 466
    iput v1, p0, Ll/۫ܺۜ;->ܽ:I

    if-gez v3, :cond_0

    if-nez v2, :cond_5

    return-void

    .line 469
    :cond_5
    new-instance p0, Ll/ۛܺۜ;

    invoke-direct {p0}, Ll/ۛܺۜ;-><init>()V

    throw p0
.end method

.method public static ۧ(Ll/۫ܺۜ;)I
    .locals 3

    .line 414
    invoke-direct {p0}, Ll/۫ܺۜ;->֫()I

    move-result v0

    if-gez v0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    int-to-char v1, v0

    .line 419
    invoke-static {v1}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v2

    if-nez v2, :cond_3

    .line 422
    invoke-static {v1}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v2

    if-nez v2, :cond_1

    return v0

    .line 425
    :cond_1
    invoke-direct {p0}, Ll/۫ܺۜ;->֫()I

    move-result p0

    if-ltz p0, :cond_2

    int-to-char p0, p0

    .line 426
    invoke-static {p0}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 429
    invoke-static {v1, p0}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result p0

    return p0

    .line 427
    :cond_2
    new-instance p0, Ll/ۛܺۜ;

    invoke-direct {p0}, Ll/ۛܺۜ;-><init>()V

    throw p0

    .line 420
    :cond_3
    new-instance p0, Ll/ۛܺۜ;

    invoke-direct {p0}, Ll/ۛܺۜ;-><init>()V

    throw p0
.end method
