.class public final Ll/ۜ᩵ܺ;
.super Ljava/lang/Object;
.source "ZB99"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final ۗ:Ljava/io/BufferedReader;

.field public ۙ:I

.field public ᩶:I

.field public final ᩸:Ljava/util/HashMap;

.field public ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/io/BufferedReader;)V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 71
    iput v0, p0, Ll/ۜ᩵ܺ;->᩶:I

    .line 72
    iput v0, p0, Ll/ۜ᩵ܺ;->ۙ:I

    .line 324
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۜ᩵ܺ;->᩸:Ljava/util/HashMap;

    .line 67
    iput-object p1, p0, Ll/ۜ᩵ܺ;->ۗ:Ljava/io/BufferedReader;

    return-void
.end method

.method private ֫(I)C
    .locals 2

    .line 80
    iget v0, p0, Ll/ۜ᩵ܺ;->ۙ:I

    add-int/2addr v0, p1

    iget-object v1, p0, Ll/ۜ᩵ܺ;->᩹:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 81
    iget-object v0, p0, Ll/ۜ᩵ܺ;->᩹:Ljava/lang/String;

    iget v1, p0, Ll/ۜ᩵ܺ;->ۙ:I

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    return p1

    :cond_0
    const/16 p1, 0xa

    return p1
.end method

.method public static bridge synthetic ֫(Ll/ۜ᩵ܺ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۜ᩵ܺ;->᩶:I

    return p0
.end method

.method private ֫()Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    .line 424
    invoke-direct {p0, v0}, Ll/ۜ᩵ܺ;->֫(I)C

    move-result v1

    const/16 v2, 0x30

    if-gt v2, v1, :cond_1

    const/16 v2, 0x39

    if-gt v1, v2, :cond_1

    .line 427
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ܳ()I

    move-result v1

    .line 428
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۖ()V

    .line 429
    invoke-direct {p0, v0}, Ll/ۜ᩵ܺ;->֫(I)C

    move-result v0

    const/16 v2, 0x3a

    if-eq v0, v2, :cond_0

    .line 430
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 432
    :cond_0
    invoke-direct {p0, v2}, Ll/ۜ᩵ܺ;->ۧ(C)V

    .line 433
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۖ()V

    .line 434
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ܳ()I

    move-result v0

    .line 435
    new-instance v2, Ll/᩷᩵ܺ;

    invoke-direct {v2, v1, v0}, Ll/᩷᩵ܺ;-><init>(II)V

    return-object v2

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private ֫(Z)Ljava/lang/String;
    .locals 4

    .line 346
    iget v0, p0, Ll/ۜ᩵ܺ;->ۙ:I

    const/4 v1, 0x0

    .line 347
    invoke-direct {p0, v1}, Ll/ۜ᩵ܺ;->ۧ(Z)V

    .line 348
    :goto_0
    invoke-direct {p0, v1}, Ll/ۜ᩵ܺ;->֫(I)C

    move-result v2

    const/16 v3, 0x2e

    if-ne v2, v3, :cond_0

    .line 349
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ܽ()C

    .line 350
    invoke-direct {p0, v1}, Ll/ۜ᩵ܺ;->ۧ(Z)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 353
    :goto_1
    invoke-direct {p0, v1}, Ll/ۜ᩵ܺ;->֫(I)C

    move-result p1

    const/16 v2, 0x5b

    if-ne p1, v2, :cond_1

    .line 354
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ܽ()C

    const/16 p1, 0x5d

    .line 355
    invoke-direct {p0, p1}, Ll/ۜ᩵ܺ;->ۧ(C)V

    goto :goto_1

    .line 327
    :cond_1
    iget-object p1, p0, Ll/ۜ᩵ܺ;->᩹:Ljava/lang/String;

    iget v1, p0, Ll/ۜ᩵ܺ;->ۙ:I

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 328
    iget-object v0, p0, Ll/ۜ᩵ܺ;->᩸:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 329
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    .line 331
    :cond_2
    invoke-virtual {v0, p1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method private ۖ()V
    .locals 2

    .line 86
    :goto_0
    iget v0, p0, Ll/ۜ᩵ܺ;->ۙ:I

    iget-object v1, p0, Ll/ۜ᩵ܺ;->᩹:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 145
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->᩻()I

    move-result v0

    invoke-static {v0}, Ll/ۗᩳۘ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ᩳ()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ۜ()Z
    .locals 6

    const/4 v0, 0x0

    .line 131
    iput v0, p0, Ll/ۜ᩵ܺ;->ۙ:I

    .line 133
    :cond_0
    :goto_0
    iget v1, p0, Ll/ۜ᩵ܺ;->᩶:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Ll/ۜ᩵ܺ;->᩶:I

    .line 134
    iget-object v1, p0, Ll/ۜ᩵ܺ;->ۗ:Ljava/io/BufferedReader;

    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ۜ᩵ܺ;->᩹:Ljava/lang/String;

    if-eqz v1, :cond_4

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 119
    :goto_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_0

    .line 120
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x23

    if-ne v4, v5, :cond_2

    goto :goto_0

    .line 123
    :cond_2
    invoke-static {v4}, Ll/ۗᩳۘ;->֫(I)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 140
    :cond_4
    :goto_2
    iget-object v1, p0, Ll/ۜ᩵ܺ;->᩹:Ljava/lang/String;

    if-eqz v1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public static bridge synthetic ۧ(Ll/ۜ᩵ܺ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۜ᩵ܺ;->ۙ:I

    return p0
.end method

.method private ۧ(C)V
    .locals 4

    .line 86
    iget v0, p0, Ll/ۜ᩵ܺ;->ۙ:I

    iget-object v1, p0, Ll/ۜ᩵ܺ;->᩹:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const-string v2, "\'"

    const-string v3, "Expected \'"

    if-ge v0, v1, :cond_1

    .line 165
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ܽ()C

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    .line 166
    :cond_0
    new-instance v0, Ll/᩻᩵ܺ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    .line 458
    invoke-direct {v0, p0, p1, v1}, Ll/᩻᩵ܺ;-><init>(Ll/ۜ᩵ܺ;Ljava/lang/String;Z)V

    .line 166
    throw v0

    .line 163
    :cond_1
    new-instance v0, Ll/᩻᩵ܺ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Ll/᩻᩵ܺ;-><init>(Ll/ۜ᩵ܺ;Ljava/lang/String;Z)V

    throw v0
.end method

.method private ۧ(Z)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 295
    invoke-direct {p0, v0}, Ll/ۜ᩵ܺ;->֫(I)C

    move-result p1

    const/16 v1, 0x3c

    if-ne p1, v1, :cond_0

    .line 297
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ܽ()C

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 304
    :goto_0
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->᩻()I

    move-result v1

    .line 10
    invoke-static {v1}, Ll/᩶ۛ᩻;->֫(I)Z

    move-result v1

    const/16 v2, 0x3f

    if-nez v1, :cond_2

    .line 305
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->᩻()I

    move-result v1

    if-ne v1, v2, :cond_1

    goto :goto_1

    .line 306
    :cond_1
    new-instance p1, Ll/᩻᩵ܺ;

    const-string v1, "Identifier expected"

    .line 458
    invoke-direct {p1, p0, v1, v0}, Ll/᩻᩵ܺ;-><init>(Ll/ۜ᩵ܺ;Ljava/lang/String;Z)V

    .line 306
    throw p1

    .line 308
    :cond_2
    :goto_1
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ᩳ()V

    .line 309
    :goto_2
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->᩻()I

    move-result v1

    invoke-static {v1}, Ll/᩶ۛ᩻;->֫(I)Z

    move-result v1

    if-nez v1, :cond_6

    .line 310
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->᩻()I

    move-result v1

    if-ne v1, v2, :cond_3

    goto :goto_3

    :cond_3
    if-eqz p1, :cond_4

    const/16 p1, 0x3e

    .line 314
    invoke-direct {p0, p1}, Ll/ۜ᩵ܺ;->ۧ(C)V

    .line 316
    :cond_4
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->᩻()I

    move-result p1

    invoke-static {p1}, Ll/᩶ۛ᩻;->֫(I)Z

    move-result p1

    if-nez p1, :cond_5

    return-void

    .line 317
    :cond_5
    new-instance p1, Ll/᩻᩵ܺ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "End of identifier expected (was 0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 318
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->᩻()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 458
    invoke-direct {p1, p0, v1, v0}, Ll/᩻᩵ܺ;-><init>(Ll/ۜ᩵ܺ;Ljava/lang/String;Z)V

    .line 318
    throw p1

    .line 311
    :cond_6
    :goto_3
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ᩳ()V

    goto :goto_2
.end method

.method private ܳ()I
    .locals 5

    const/4 v0, 0x0

    .line 440
    invoke-direct {p0, v0}, Ll/ۜ᩵ܺ;->֫(I)C

    move-result v1

    const/16 v2, 0x30

    if-gt v2, v1, :cond_1

    const/16 v3, 0x39

    if-gt v1, v3, :cond_1

    const/4 v1, 0x0

    :goto_0
    mul-int/lit8 v1, v1, 0xa

    .line 445
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ܽ()C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->getNumericValue(C)I

    move-result v4

    add-int/2addr v1, v4

    .line 446
    invoke-direct {p0, v0}, Ll/ۜ᩵ܺ;->֫(I)C

    move-result v4

    if-gt v2, v4, :cond_0

    if-gt v4, v3, :cond_0

    goto :goto_0

    :cond_0
    return v1

    .line 441
    :cond_1
    new-instance v1, Ll/᩻᩵ܺ;

    const-string v2, "Number expected"

    .line 458
    invoke-direct {v1, p0, v2, v0}, Ll/᩻᩵ܺ;-><init>(Ll/ۜ᩵ܺ;Ljava/lang/String;Z)V

    .line 441
    throw v1
.end method

.method private ܽ()C
    .locals 3

    .line 102
    :try_start_0
    iget-object v0, p0, Ll/ۜ᩵ܺ;->᩹:Ljava/lang/String;

    iget v1, p0, Ll/ۜ᩵ܺ;->ۙ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۜ᩵ܺ;->ۙ:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    .line 104
    :catch_0
    new-instance v0, Ll/᩻᩵ܺ;

    const-string v1, "Unexpected end of line"

    const/4 v2, 0x0

    .line 458
    invoke-direct {v0, p0, v1, v2}, Ll/᩻᩵ܺ;-><init>(Ll/ۜ᩵ܺ;Ljava/lang/String;Z)V

    .line 104
    throw v0
.end method

.method private ᩳ()V
    .locals 3

    .line 91
    :try_start_0
    iget-object v0, p0, Ll/ۜ᩵ܺ;->᩹:Ljava/lang/String;

    iget v1, p0, Ll/ۜ᩵ܺ;->ۙ:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->codePointAt(I)I

    move-result v0

    .line 92
    iget v1, p0, Ll/ۜ᩵ܺ;->ۙ:I

    invoke-static {v0}, Ljava/lang/Character;->charCount(I)I

    move-result v0

    add-int/2addr v1, v0

    iput v1, p0, Ll/ۜ᩵ܺ;->ۙ:I
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 95
    :catch_0
    new-instance v0, Ll/᩻᩵ܺ;

    const-string v1, "Unexpected end of line"

    const/4 v2, 0x0

    .line 458
    invoke-direct {v0, p0, v1, v2}, Ll/᩻᩵ܺ;-><init>(Ll/ۜ᩵ܺ;Ljava/lang/String;Z)V

    .line 95
    throw v0
.end method

.method private ᩻()I
    .locals 2

    .line 76
    iget v0, p0, Ll/ۜ᩵ܺ;->ۙ:I

    iget-object v1, p0, Ll/ۜ᩵ܺ;->᩹:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Ll/ۜ᩵ܺ;->᩹:Ljava/lang/String;

    iget v1, p0, Ll/ۜ᩵ܺ;->ۙ:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->codePointAt(I)I

    move-result v0

    return v0

    :cond_0
    const/16 v0, 0xa

    return v0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ۜ᩵ܺ;->ۗ:Ljava/io/BufferedReader;

    if-eqz v0, :cond_0

    .line 62
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/۫ᩴܺ;)V
    .locals 14

    .line 173
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/ۜ᩵ܺ;->ۗ:Ljava/io/BufferedReader;

    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۜ᩵ܺ;->᩹:Ljava/lang/String;

    .line 174
    iget v1, p0, Ll/ۜ᩵ܺ;->᩶:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Ll/ۜ᩵ܺ;->᩶:I

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 119
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_0

    .line 120
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x23

    if-ne v4, v5, :cond_2

    goto :goto_0

    .line 123
    :cond_2
    invoke-static {v4}, Ll/ۗᩳۘ;->֫(I)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 140
    :cond_4
    :goto_2
    iget-object v0, p0, Ll/ۜ᩵ܺ;->᩹:Ljava/lang/String;

    if-eqz v0, :cond_24

    .line 183
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۖ()V

    .line 184
    invoke-direct {p0, v1}, Ll/ۜ᩵ܺ;->֫(Z)Ljava/lang/String;

    move-result-object v0

    .line 185
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۖ()V

    const-string v3, "package-info"

    .line 187
    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 188
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۜ()Z

    goto :goto_2

    :cond_5
    const-string v3, "-"

    .line 191
    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    const/16 v4, 0x3e

    const/16 v5, 0x2d

    if-eqz v3, :cond_7

    .line 409
    invoke-direct {p0, v1}, Ll/ۜ᩵ܺ;->֫(I)C

    move-result v3

    const-string v6, ">"

    invoke-virtual {v6, v1}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-eq v3, v6, :cond_6

    goto :goto_3

    .line 414
    :cond_6
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ܽ()C

    .line 0
    invoke-static {v2, v1, v0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    .line 196
    :cond_7
    :goto_3
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۖ()V

    .line 399
    invoke-direct {p0, v1}, Ll/ۜ᩵ܺ;->֫(I)C

    move-result v3

    if-ne v3, v5, :cond_8

    invoke-direct {p0, v2}, Ll/ۜ᩵ܺ;->֫(I)C

    move-result v3

    if-ne v3, v4, :cond_8

    .line 400
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ܽ()C

    .line 401
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ܽ()C

    .line 199
    :cond_8
    :goto_4
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۖ()V

    .line 200
    invoke-direct {p0, v1}, Ll/ۜ᩵ܺ;->֫(Z)Ljava/lang/String;

    move-result-object v3

    .line 201
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۖ()V

    const/16 v4, 0x3a

    .line 202
    invoke-direct {p0, v4}, Ll/ۜ᩵ܺ;->ۧ(C)V

    .line 204
    invoke-virtual {p1, v3, v0}, Ll/۫ᩴܺ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/᩺ᩴܺ;

    move-result-object v0

    .line 205
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۖ()V

    .line 109
    iget-object v3, p0, Ll/ۜ᩵ܺ;->᩹:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    iget v5, p0, Ll/ۜ᩵ܺ;->ۙ:I

    const-string v6, "Expected end of line"

    if-ne v3, v5, :cond_23

    .line 112
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۜ()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    .line 221
    :goto_5
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->᩻()I

    move-result v8

    invoke-static {v8}, Ll/ۗᩳۘ;->֫(I)Z

    move-result v8

    if-nez v8, :cond_9

    goto/16 :goto_12

    .line 224
    :cond_9
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۖ()V

    .line 225
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->֫()Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_b

    .line 227
    instance-of v9, v8, Ll/᩷᩵ܺ;

    if-eqz v9, :cond_a

    .line 231
    check-cast v8, Ll/᩷᩵ܺ;

    .line 232
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۖ()V

    .line 233
    invoke-direct {p0, v4}, Ll/ۜ᩵ܺ;->ۧ(C)V

    move-object v4, v8

    goto :goto_6

    .line 228
    :cond_a
    new-instance p1, Ll/᩻᩵ܺ;

    new-array v0, v2, [Ljava/lang/Object;

    aput-object v8, v0, v1

    const-string v2, "Invalid obfuscated line number range (%s)."

    .line 229
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 458
    invoke-direct {p1, p0, v0, v1}, Ll/᩻᩵ܺ;-><init>(Ll/ۜ᩵ܺ;Ljava/lang/String;Z)V

    .line 229
    throw p1

    :cond_b
    const/4 v4, 0x0

    .line 235
    :goto_6
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۖ()V

    .line 362
    invoke-direct {p0, v2}, Ll/ۜ᩵ܺ;->֫(Z)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    .line 86
    :goto_7
    iget v10, p0, Ll/ۜ᩵ܺ;->ۙ:I

    iget-object v11, p0, Ll/ۜ᩵ܺ;->᩹:Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v11

    if-ge v10, v11, :cond_d

    .line 152
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->᩻()I

    move-result v10

    invoke-static {v10}, Ll/ۗᩳۘ;->֫(I)Z

    move-result v10

    if-eqz v10, :cond_d

    if-nez v9, :cond_c

    .line 153
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->᩻()I

    move-result v9

    const v10, 0xfeff

    if-ne v9, v10, :cond_c

    const/4 v9, 0x0

    goto :goto_8

    :cond_c
    const/4 v9, 0x1

    .line 154
    :goto_8
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ᩳ()V

    goto :goto_7

    :cond_d
    if-eqz v9, :cond_22

    .line 336
    iget v9, p0, Ll/ۜ᩵ܺ;->ۙ:I

    .line 337
    invoke-direct {p0, v2}, Ll/ۜ᩵ܺ;->ۧ(Z)V

    .line 338
    :goto_9
    invoke-direct {p0, v1}, Ll/ۜ᩵ܺ;->֫(I)C

    move-result v10

    const/16 v11, 0x2e

    if-ne v10, v11, :cond_e

    .line 339
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ܽ()C

    .line 340
    invoke-direct {p0, v2}, Ll/ۜ᩵ܺ;->ۧ(Z)V

    goto :goto_9

    .line 327
    :cond_e
    iget-object v10, p0, Ll/ۜ᩵ܺ;->᩹:Ljava/lang/String;

    iget v11, p0, Ll/ۜ᩵ܺ;->ۙ:I

    invoke-virtual {v10, v9, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    .line 328
    iget-object v10, p0, Ll/ۜ᩵ܺ;->᩸:Ljava/util/HashMap;

    invoke-virtual {v10, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_f

    .line 329
    invoke-virtual {v10, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    goto :goto_a

    .line 331
    :cond_f
    invoke-virtual {v10, v9, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    :goto_a
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۖ()V

    .line 367
    invoke-direct {p0, v1}, Ll/ۜ᩵ܺ;->֫(I)C

    move-result v11

    const/16 v12, 0x28

    if-ne v11, v12, :cond_12

    .line 368
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ܽ()C

    .line 369
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۖ()V

    .line 371
    invoke-direct {p0, v1}, Ll/ۜ᩵ܺ;->֫(I)C

    move-result v11

    const/16 v12, 0x29

    if-ne v11, v12, :cond_10

    new-array v11, v1, [Ljava/lang/String;

    goto :goto_c

    .line 374
    :cond_10
    new-instance v11, Ljava/util/LinkedList;

    invoke-direct {v11}, Ljava/util/LinkedList;-><init>()V

    .line 375
    invoke-direct {p0, v2}, Ll/ۜ᩵ܺ;->֫(Z)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v13}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 376
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۖ()V

    .line 377
    :goto_b
    invoke-direct {p0, v1}, Ll/ۜ᩵ܺ;->֫(I)C

    move-result v13

    if-eq v13, v12, :cond_11

    .line 378
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۖ()V

    const/16 v13, 0x2c

    .line 379
    invoke-direct {p0, v13}, Ll/ۜ᩵ܺ;->ۧ(C)V

    .line 380
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۖ()V

    .line 381
    invoke-direct {p0, v2}, Ll/ۜ᩵ܺ;->֫(Z)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v13}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_11
    new-array v13, v1, [Ljava/lang/String;

    .line 383
    invoke-virtual {v11, v13}, Ljava/util/LinkedList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [Ljava/lang/String;

    .line 385
    :goto_c
    invoke-direct {p0, v12}, Ll/ۜ᩵ܺ;->ۧ(C)V

    .line 386
    new-instance v12, Ll/ܽ᩵ܺ;

    invoke-direct {v12, v9, v8, v11}, Ll/ܽ᩵ܺ;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    goto :goto_d

    .line 388
    :cond_12
    new-instance v12, Ll/ۧ᩵ܺ;

    invoke-direct {v12, v9, v8}, Ll/ۧ᩵ܺ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    :goto_d
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۖ()V

    .line 238
    invoke-direct {p0, v1}, Ll/ۜ᩵ܺ;->֫(I)C

    move-result v8

    const/16 v9, 0x3a

    if-ne v8, v9, :cond_14

    .line 240
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ܽ()C

    .line 241
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۖ()V

    .line 242
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->֫()Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_13

    goto :goto_e

    .line 244
    :cond_13
    new-instance p1, Ll/᩻᩵ܺ;

    const-string v0, "No number follows the colon after the method signature."

    .line 458
    invoke-direct {p1, p0, v0, v1}, Ll/᩻᩵ܺ;-><init>(Ll/ۜ᩵ܺ;Ljava/lang/String;Z)V

    .line 244
    throw p1

    :cond_14
    const/4 v8, 0x0

    :goto_e
    if-nez v4, :cond_16

    if-nez v8, :cond_15

    goto :goto_f

    .line 248
    :cond_15
    new-instance p1, Ll/᩻᩵ܺ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "No mapping for original range "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 458
    invoke-direct {p1, p0, v0, v1}, Ll/᩻᩵ܺ;-><init>(Ll/ۜ᩵ܺ;Ljava/lang/String;Z)V

    .line 248
    throw p1

    .line 251
    :cond_16
    :goto_f
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۖ()V

    const/16 v9, 0x2d

    .line 394
    invoke-direct {p0, v9}, Ll/ۜ᩵ܺ;->ۧ(C)V

    const/16 v9, 0x3e

    .line 395
    invoke-direct {p0, v9}, Ll/ۜ᩵ܺ;->ۧ(C)V

    .line 253
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۖ()V

    .line 336
    iget v9, p0, Ll/ۜ᩵ܺ;->ۙ:I

    .line 337
    invoke-direct {p0, v2}, Ll/ۜ᩵ܺ;->ۧ(Z)V

    .line 338
    :goto_10
    invoke-direct {p0, v1}, Ll/ۜ᩵ܺ;->֫(I)C

    move-result v11

    const/16 v13, 0x2e

    if-ne v11, v13, :cond_17

    .line 339
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ܽ()C

    .line 340
    invoke-direct {p0, v2}, Ll/ۜ᩵ܺ;->ۧ(Z)V

    goto :goto_10

    .line 327
    :cond_17
    iget-object v11, p0, Ll/ۜ᩵ܺ;->᩹:Ljava/lang/String;

    iget v13, p0, Ll/ۜ᩵ܺ;->ۙ:I

    invoke-virtual {v11, v9, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    .line 328
    invoke-virtual {v10, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_18

    .line 329
    invoke-virtual {v10, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    goto :goto_11

    .line 331
    :cond_18
    invoke-virtual {v10, v9, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    :goto_11
    instance-of v10, v12, Ll/ܽ᩵ܺ;

    if-eqz v10, :cond_19

    .line 257
    move-object v10, v12

    check-cast v10, Ll/ܽ᩵ܺ;

    invoke-virtual {v0, v4, v10, v8, v9}, Ll/᩺ᩴܺ;->֫(Ll/᩷᩵ܺ;Ll/ܽ᩵ܺ;Ljava/lang/Object;Ljava/lang/String;)V

    :cond_19
    if-eqz v5, :cond_1c

    .line 79
    iget-object v8, v5, Ll/ܳ᩵ܺ;->֫:Ll/ܿ᩵ܺ;

    iget-object v8, v8, Ll/ܿ᩵ܺ;->֫:Ljava/lang/String;

    .line 267
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    .line 268
    invoke-static {v7, v4}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v8, :cond_1a

    if-eqz v7, :cond_1a

    if-nez v10, :cond_1c

    :cond_1a
    if-eqz v3, :cond_1b

    .line 67
    iget-object v7, v3, Ll/ܳ᩵ܺ;->ۧ:Ll/ܿ᩵ܺ;

    .line 271
    iget-object v8, v5, Ll/ܳ᩵ܺ;->ۧ:Ll/ܿ᩵ܺ;

    invoke-virtual {v7, v8}, Ll/ܿ᩵ܺ;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1c

    .line 272
    :cond_1b
    invoke-virtual {v0, v5}, Ll/᩺ᩴܺ;->֫(Ll/ܳ᩵ܺ;)Ll/᩺ᩴܺ;

    move-object v3, v5

    .line 277
    :cond_1c
    new-instance v5, Ll/ܳ᩵ܺ;

    invoke-direct {v5, v12, v9}, Ll/ܳ᩵ܺ;-><init>(Ll/ܿ᩵ܺ;Ljava/lang/String;)V

    .line 109
    iget-object v7, p0, Ll/ۜ᩵ܺ;->᩹:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    iget v8, p0, Ll/ۜ᩵ܺ;->ۙ:I

    if-ne v7, v8, :cond_21

    .line 112
    invoke-direct {p0}, Ll/ۜ᩵ܺ;->ۜ()Z

    move-result v7

    if-nez v7, :cond_20

    move-object v7, v4

    :goto_12
    if-eqz v5, :cond_4

    if-eqz v3, :cond_1e

    .line 67
    iget-object v3, v3, Ll/ܳ᩵ܺ;->ۧ:Ll/ܿ᩵ܺ;

    .line 284
    iget-object v4, v5, Ll/ܳ᩵ܺ;->ۧ:Ll/ܿ᩵ܺ;

    invoke-virtual {v3, v4}, Ll/ܿ᩵ܺ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1d

    goto :goto_13

    :cond_1d
    const/4 v3, 0x0

    goto :goto_14

    :cond_1e
    :goto_13
    const/4 v3, 0x1

    :goto_14
    if-eqz v7, :cond_1f

    if-eqz v3, :cond_4

    .line 286
    :cond_1f
    invoke-virtual {v0, v5}, Ll/᩺ᩴܺ;->֫(Ll/ܳ᩵ܺ;)Ll/᩺ᩴܺ;

    goto/16 :goto_2

    :cond_20
    const/16 v7, 0x3a

    move-object v7, v4

    const/16 v4, 0x3a

    goto/16 :goto_5

    .line 110
    :cond_21
    new-instance p1, Ll/᩻᩵ܺ;

    .line 458
    invoke-direct {p1, p0, v6, v1}, Ll/᩻᩵ܺ;-><init>(Ll/ۜ᩵ܺ;Ljava/lang/String;Z)V

    .line 110
    throw p1

    .line 157
    :cond_22
    new-instance p1, Ll/᩻᩵ܺ;

    const-string v0, "Expected whitespace"

    invoke-direct {p1, p0, v0, v2}, Ll/᩻᩵ܺ;-><init>(Ll/ۜ᩵ܺ;Ljava/lang/String;Z)V

    throw p1

    .line 110
    :cond_23
    new-instance p1, Ll/᩻᩵ܺ;

    .line 458
    invoke-direct {p1, p0, v6, v1}, Ll/᩻᩵ܺ;-><init>(Ll/ۜ᩵ܺ;Ljava/lang/String;Z)V

    .line 110
    throw p1

    :cond_24
    return-void
.end method
