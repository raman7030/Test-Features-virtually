.class public final Ll/ۜ۫ۘ;
.super Ljava/lang/Object;
.source "5BIC"


# instance fields
.field public ֫:I

.field public final ۜ:[Ljava/lang/String;

.field public ۧ:I

.field public final ܳ:Ljava/io/StringReader;

.field public ܽ:I

.field public final ܿ:[C

.field public ᩳ:I

.field public ᩻:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 43
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x80

    new-array p1, p1, [Ljava/lang/String;

    .line 28
    iput-object p1, p0, Ll/ۜ۫ۘ;->ۜ:[Ljava/lang/String;

    .line 32
    invoke-virtual {v0}, Ljava/io/Reader;->markSupported()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 33
    iput-object v0, p0, Ll/ۜ۫ۘ;->ܳ:Ljava/io/StringReader;

    const/16 p1, 0x1000

    new-array p1, p1, [C

    .line 34
    iput-object p1, p0, Ll/ۜ۫ۘ;->ܿ:[C

    .line 35
    invoke-direct {p0}, Ll/ۜ۫ۘ;->ۚ()V

    return-void

    .line 39
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Must be true"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫([C[Ljava/lang/String;II)Ljava/lang/String;
    .locals 7

    const/16 v0, 0xc

    if-le p3, v0, :cond_0

    .line 450
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p0, p2, p3}, Ljava/lang/String;-><init>([CII)V

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ge p3, v0, :cond_1

    const-string p0, ""

    return-object p0

    :cond_1
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v4, p2

    :goto_0
    if-ge v2, p3, :cond_2

    mul-int/lit8 v3, v3, 0x1f

    add-int/lit8 v5, v4, 0x1

    .line 458
    aget-char v4, p0, v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    move v4, v5

    goto :goto_0

    .line 462
    :cond_2
    array-length v2, p1

    sub-int/2addr v2, v0

    and-int v0, v3, v2

    .line 463
    aget-object v2, p1, v0

    if-nez v2, :cond_3

    .line 466
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p0, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 467
    aput-object v1, p1, v0

    return-object v1

    .line 483
    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-ne p3, v3, :cond_6

    move v4, p2

    move v3, p3

    :goto_1
    add-int/lit8 v5, v3, -0x1

    if-eqz v3, :cond_5

    add-int/lit8 v3, v4, 0x1

    .line 487
    aget-char v4, p0, v4

    add-int/lit8 v6, v1, 0x1

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-eq v4, v1, :cond_4

    goto :goto_2

    :cond_4
    move v4, v3

    move v3, v5

    move v1, v6

    goto :goto_1

    :cond_5
    return-object v2

    .line 472
    :cond_6
    :goto_2
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p0, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 473
    aput-object v1, p1, v0

    return-object v1
.end method

.method private ۚ()V
    .locals 3

    .line 56
    iget-object v0, p0, Ll/ۜ۫ۘ;->ܳ:Ljava/io/StringReader;

    iget v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    iget v2, p0, Ll/ۜ۫ۘ;->ᩳ:I

    if-ge v1, v2, :cond_0

    goto :goto_0

    :cond_0
    int-to-long v1, v1

    .line 60
    :try_start_0
    invoke-virtual {v0, v1, v2}, Ljava/io/Reader;->skip(J)J

    const/16 v1, 0x1000

    .line 61
    invoke-virtual {v0, v1}, Ljava/io/Reader;->mark(I)V

    .line 62
    iget-object v1, p0, Ll/ۜ۫ۘ;->ܿ:[C

    invoke-virtual {v0, v1}, Ljava/io/Reader;->read([C)I

    move-result v1

    .line 63
    invoke-virtual {v0}, Ljava/io/Reader;->reset()V

    const/4 v0, -0x1

    if-eq v1, v0, :cond_2

    .line 65
    iput v1, p0, Ll/ۜ۫ۘ;->֫:I

    .line 66
    iget v0, p0, Ll/ۜ۫ۘ;->᩻:I

    iget v2, p0, Ll/ۜ۫ۘ;->ܽ:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/ۜ۫ۘ;->᩻:I

    const/4 v0, 0x0

    .line 67
    iput v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    .line 68
    iput v0, p0, Ll/ۜ۫ۘ;->ۧ:I

    const/16 v0, 0xc00

    if-le v1, v0, :cond_1

    const/16 v1, 0xc00

    .line 69
    :cond_1
    iput v1, p0, Ll/ۜ۫ۘ;->ᩳ:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_0
    return-void

    :catch_0
    move-exception v0

    .line 72
    new-instance v1, Ll/ܽ۫ۘ;

    .line 7
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 72
    throw v1
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 437
    new-instance v0, Ljava/lang/String;

    iget v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    iget v2, p0, Ll/ۜ۫ۘ;->֫:I

    sub-int/2addr v2, v1

    iget-object v3, p0, Ll/ۜ۫ۘ;->ܿ:[C

    invoke-direct {v0, v3, v1, v2}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method public final ֡()V
    .locals 1

    .line 117
    iget v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    return-void
.end method

.method public final ֫(C)Ljava/lang/String;
    .locals 4

    .line 143
    invoke-direct {p0}, Ll/ۜ۫ۘ;->ۚ()V

    .line 144
    iget v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    :goto_0
    iget v1, p0, Ll/ۜ۫ۘ;->֫:I

    const/4 v2, -0x1

    iget-object v3, p0, Ll/ۜ۫ۘ;->ܿ:[C

    if-ge v0, v1, :cond_1

    .line 145
    aget-char v1, v3, v0

    if-ne p1, v1, :cond_0

    .line 146
    iget p1, p0, Ll/ۜ۫ۘ;->ܽ:I

    sub-int/2addr v0, p1

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    .line 184
    :goto_1
    iget-object p1, p0, Ll/ۜ۫ۘ;->ۜ:[Ljava/lang/String;

    if-eq v0, v2, :cond_2

    .line 185
    iget v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    invoke-static {v3, p1, v1, v0}, Ll/ۜ۫ۘ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    .line 186
    iget v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    return-object p1

    .line 278
    :cond_2
    invoke-direct {p0}, Ll/ۜ۫ۘ;->ۚ()V

    .line 279
    iget v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    iget v1, p0, Ll/ۜ۫ۘ;->֫:I

    sub-int/2addr v1, v0

    invoke-static {v3, p1, v0, v1}, Ll/ۜ۫ۘ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    .line 280
    iget v0, p0, Ll/ۜ۫ۘ;->֫:I

    iput v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    return-object p1
.end method

.method public final varargs ֫([C)Ljava/lang/String;
    .locals 7

    .line 211
    invoke-direct {p0}, Ll/ۜ۫ۘ;->ۚ()V

    .line 212
    iget v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    .line 213
    iget v1, p0, Ll/ۜ۫ۘ;->֫:I

    .line 217
    :goto_0
    iget v2, p0, Ll/ۜ۫ۘ;->ܽ:I

    iget-object v3, p0, Ll/ۜ۫ۘ;->ܿ:[C

    if-ge v2, v1, :cond_2

    .line 218
    array-length v2, p1

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v2, :cond_1

    aget-char v5, p1, v4

    .line 219
    iget v6, p0, Ll/ۜ۫ۘ;->ܽ:I

    aget-char v6, v3, v6

    if-ne v6, v5, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 222
    :cond_1
    iget v2, p0, Ll/ۜ۫ۘ;->ܽ:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/ۜ۫ۘ;->ܽ:I

    goto :goto_0

    .line 225
    :cond_2
    :goto_2
    iget p1, p0, Ll/ۜ۫ۘ;->ܽ:I

    if-le p1, v0, :cond_3

    iget-object v1, p0, Ll/ۜ۫ۘ;->ۜ:[Ljava/lang/String;

    sub-int/2addr p1, v0

    invoke-static {v3, v1, v0, p1}, Ll/ۜ۫ۘ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    const-string p1, ""

    return-object p1
.end method

.method public final ֫()V
    .locals 1

    .line 124
    iget v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    return-void
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 6

    .line 410
    invoke-direct {p0}, Ll/ۜ۫ۘ;->ۚ()V

    .line 351
    invoke-direct {p0}, Ll/ۜ۫ۘ;->ۚ()V

    .line 352
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    .line 353
    iget v1, p0, Ll/ۜ۫ۘ;->֫:I

    iget v2, p0, Ll/ۜ۫ۘ;->ܽ:I

    sub-int/2addr v1, v2

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 357
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    iget v4, p0, Ll/ۜ۫ۘ;->ܽ:I

    add-int/2addr v4, v1

    iget-object v5, p0, Ll/ۜ۫ۘ;->ܿ:[C

    aget-char v4, v5, v4

    if-eq v3, v4, :cond_1

    :goto_1
    return v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 412
    :cond_2
    iget v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v0

    iput p1, p0, Ll/ۜ۫ۘ;->ܽ:I

    const/4 p1, 0x1

    return p1
.end method

.method public final ۖ()Z
    .locals 2

    .line 403
    invoke-virtual {p0}, Ll/ۜ۫ۘ;->ۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 405
    :cond_0
    iget-object v0, p0, Ll/ۜ۫ۘ;->ܿ:[C

    iget v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    aget-char v0, v0, v1

    const/16 v1, 0x30

    if-lt v0, v1, :cond_1

    const/16 v1, 0x39

    if-gt v0, v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۘ()Z
    .locals 3

    .line 396
    invoke-virtual {p0}, Ll/ۜ۫ۘ;->ۡ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 398
    :cond_0
    iget-object v0, p0, Ll/ۜ۫ۘ;->ܿ:[C

    iget v2, p0, Ll/ۜ۫ۘ;->ܽ:I

    aget-char v0, v0, v2

    const/16 v2, 0x41

    if-lt v0, v2, :cond_1

    const/16 v2, 0x5a

    if-le v0, v2, :cond_3

    :cond_1
    const/16 v2, 0x61

    if-lt v0, v2, :cond_2

    const/16 v2, 0x7a

    if-le v0, v2, :cond_3

    .line 399
    :cond_2
    invoke-static {v0}, Ljava/lang/Character;->isLetter(C)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    const/4 v0, 0x1

    return v0

    :cond_4
    return v1
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 6

    .line 262
    invoke-direct {p0}, Ll/ۜ۫ۘ;->ۚ()V

    .line 263
    iget v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    .line 264
    iget v1, p0, Ll/ۜ۫ۘ;->֫:I

    .line 267
    :goto_0
    iget v2, p0, Ll/ۜ۫ۘ;->ܽ:I

    iget-object v3, p0, Ll/ۜ۫ۘ;->ܿ:[C

    if-ge v2, v1, :cond_1

    .line 268
    aget-char v4, v3, v2

    const/16 v5, 0x9

    if-eq v4, v5, :cond_1

    const/16 v5, 0xa

    if-eq v4, v5, :cond_1

    const/16 v5, 0xd

    if-eq v4, v5, :cond_1

    const/16 v5, 0xc

    if-eq v4, v5, :cond_1

    const/16 v5, 0x20

    if-eq v4, v5, :cond_1

    const/16 v5, 0x2f

    if-eq v4, v5, :cond_1

    const/16 v5, 0x3e

    if-eq v4, v5, :cond_1

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 271
    iput v2, p0, Ll/ۜ۫ۘ;->ܽ:I

    goto :goto_0

    :cond_1
    :goto_1
    if-le v2, v0, :cond_2

    .line 274
    iget-object v1, p0, Ll/ۜ۫ۘ;->ۜ:[Ljava/lang/String;

    sub-int/2addr v2, v0

    invoke-static {v3, v1, v0, v2}, Ll/ۜ۫ۘ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    const-string v0, ""

    return-object v0
.end method

.method public final ۡ()Z
    .locals 2

    .line 91
    invoke-direct {p0}, Ll/ۜ۫ۘ;->ۚ()V

    .line 92
    iget v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    iget v1, p0, Ll/ۜ۫ۘ;->֫:I

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()C
    .locals 2

    .line 105
    invoke-direct {p0}, Ll/ۜ۫ۘ;->ۚ()V

    .line 96
    iget v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    iget v1, p0, Ll/ۜ۫ۘ;->֫:I

    if-lt v0, v1, :cond_0

    const v0, 0xffff

    return v0

    .line 106
    :cond_0
    iget-object v1, p0, Ll/ۜ۫ۘ;->ܿ:[C

    aget-char v0, v1, v0

    return v0
.end method

.method public final ۧ()C
    .locals 2

    .line 110
    invoke-direct {p0}, Ll/ۜ۫ۘ;->ۚ()V

    .line 96
    iget v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    iget v1, p0, Ll/ۜ۫ۘ;->֫:I

    if-lt v0, v1, :cond_0

    const v1, 0xffff

    goto :goto_0

    .line 111
    :cond_0
    iget-object v1, p0, Ll/ۜ۫ۘ;->ܿ:[C

    aget-char v1, v1, v0

    :goto_0
    add-int/lit8 v0, v0, 0x1

    .line 112
    iput v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    return v1
.end method

.method public final varargs ۧ([C)Ljava/lang/String;
    .locals 4

    .line 229
    invoke-direct {p0}, Ll/ۜ۫ۘ;->ۚ()V

    .line 230
    iget v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    .line 231
    iget v1, p0, Ll/ۜ۫ۘ;->֫:I

    .line 234
    :goto_0
    iget v2, p0, Ll/ۜ۫ۘ;->ܽ:I

    iget-object v3, p0, Ll/ۜ۫ۘ;->ܿ:[C

    if-ge v2, v1, :cond_1

    .line 235
    aget-char v2, v3, v2

    invoke-static {p1, v2}, Ljava/util/Arrays;->binarySearch([CC)I

    move-result v2

    if-ltz v2, :cond_0

    goto :goto_1

    .line 237
    :cond_0
    iget v2, p0, Ll/ۜ۫ۘ;->ܽ:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/ۜ۫ۘ;->ܽ:I

    goto :goto_0

    .line 240
    :cond_1
    :goto_1
    iget p1, p0, Ll/ۜ۫ۘ;->ܽ:I

    if-le p1, v0, :cond_2

    iget-object v1, p0, Ll/ۜ۫ۘ;->ۜ:[Ljava/lang/String;

    sub-int/2addr p1, v0

    invoke-static {v3, v1, v0, p1}, Ll/ۜ۫ۘ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    const-string p1, ""

    return-object p1
.end method

.method public final ۧ(C)Z
    .locals 2

    .line 346
    invoke-virtual {p0}, Ll/ۜ۫ۘ;->ۡ()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۜ۫ۘ;->ܿ:[C

    iget v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    aget-char v0, v0, v1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ljava/lang/String;)Z
    .locals 6

    .line 363
    invoke-direct {p0}, Ll/ۜ۫ۘ;->ۚ()V

    .line 364
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    .line 365
    iget v1, p0, Ll/ۜ۫ۘ;->֫:I

    iget v2, p0, Ll/ۜ۫ۘ;->ܽ:I

    sub-int/2addr v1, v2

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 369
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v3

    .line 370
    iget v4, p0, Ll/ۜ۫ۘ;->ܽ:I

    add-int/2addr v4, v1

    iget-object v5, p0, Ll/ۜ۫ۘ;->ܿ:[C

    aget-char v4, v5, v4

    invoke-static {v4}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v4

    if-eq v3, v4, :cond_1

    :goto_1
    return v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 421
    :cond_2
    iget v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v0

    iput p1, p0, Ll/ۜ۫ۘ;->ܽ:I

    const/4 p1, 0x1

    return p1
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 4

    .line 285
    invoke-direct {p0}, Ll/ۜ۫ۘ;->ۚ()V

    .line 286
    iget v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    .line 287
    :goto_0
    iget v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    iget v2, p0, Ll/ۜ۫ۘ;->֫:I

    iget-object v3, p0, Ll/ۜ۫ۘ;->ܿ:[C

    if-ge v1, v2, :cond_3

    .line 288
    aget-char v1, v3, v1

    const/16 v2, 0x41

    if-lt v1, v2, :cond_0

    const/16 v2, 0x5a

    if-le v1, v2, :cond_2

    :cond_0
    const/16 v2, 0x61

    if-lt v1, v2, :cond_1

    const/16 v2, 0x7a

    if-le v1, v2, :cond_2

    .line 289
    :cond_1
    invoke-static {v1}, Ljava/lang/Character;->isLetter(C)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 290
    :cond_2
    iget v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    goto :goto_0

    .line 295
    :cond_3
    iget v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    sub-int/2addr v1, v0

    iget-object v2, p0, Ll/ۜ۫ۘ;->ۜ:[Ljava/lang/String;

    invoke-static {v3, v2, v0, v1}, Ll/ۜ۫ۘ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܺ()V
    .locals 1

    .line 128
    iget v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    iput v0, p0, Ll/ۜ۫ۘ;->ۧ:I

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)I
    .locals 9

    .line 158
    invoke-direct {p0}, Ll/ۜ۫ۘ;->ۚ()V

    const/4 v0, 0x0

    .line 160
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 161
    iget v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    :goto_0
    iget v2, p0, Ll/ۜ۫ۘ;->֫:I

    if-ge v1, v2, :cond_3

    .line 163
    iget-object v2, p0, Ll/ۜ۫ۘ;->ܿ:[C

    aget-char v3, v2, v1

    const/4 v4, 0x1

    if-eq v0, v3, :cond_0

    :goto_1
    add-int/2addr v1, v4

    .line 164
    iget v3, p0, Ll/ۜ۫ۘ;->֫:I

    if-ge v1, v3, :cond_0

    aget-char v3, v2, v1

    if-eq v0, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v1, 0x1

    .line 166
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v5, v3

    sub-int/2addr v5, v4

    .line 167
    iget v6, p0, Ll/ۜ۫ۘ;->֫:I

    if-ge v1, v6, :cond_2

    if-gt v5, v6, :cond_2

    move v6, v3

    :goto_2
    if-ge v6, v5, :cond_1

    .line 168
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v7

    aget-char v8, v2, v6

    if-ne v7, v8, :cond_1

    add-int/lit8 v6, v6, 0x1

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_1
    if-ne v6, v5, :cond_2

    .line 170
    iget p1, p0, Ll/ۜ۫ۘ;->ܽ:I

    sub-int/2addr v1, p1

    return v1

    :cond_2
    move v1, v3

    goto :goto_0

    :cond_3
    const/4 p1, -0x1

    return p1
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 6

    .line 245
    invoke-direct {p0}, Ll/ۜ۫ۘ;->ۚ()V

    .line 246
    iget v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    .line 247
    iget v1, p0, Ll/ۜ۫ۘ;->֫:I

    .line 250
    :goto_0
    iget v2, p0, Ll/ۜ۫ۘ;->ܽ:I

    iget-object v3, p0, Ll/ۜ۫ۘ;->ܿ:[C

    if-ge v2, v1, :cond_1

    .line 251
    aget-char v4, v3, v2

    const/16 v5, 0x26

    if-eq v4, v5, :cond_1

    const/16 v5, 0x3c

    if-eq v4, v5, :cond_1

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 254
    iput v2, p0, Ll/ۜ۫ۘ;->ܽ:I

    goto :goto_0

    :cond_1
    :goto_1
    if-le v2, v0, :cond_2

    .line 257
    iget-object v1, p0, Ll/ۜ۫ۘ;->ۜ:[Ljava/lang/String;

    sub-int/2addr v2, v0

    invoke-static {v3, v1, v0, v2}, Ll/ۜ۫ۘ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    const-string v0, ""

    return-object v0
.end method

.method public final varargs ܽ([C)Z
    .locals 5

    .line 378
    invoke-virtual {p0}, Ll/ۜ۫ۘ;->ۡ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 381
    :cond_0
    invoke-direct {p0}, Ll/ۜ۫ۘ;->ۚ()V

    .line 382
    iget-object v0, p0, Ll/ۜ۫ۘ;->ܿ:[C

    iget v2, p0, Ll/ۜ۫ۘ;->ܽ:I

    aget-char v0, v0, v2

    .line 383
    array-length v2, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-char v4, p1, v3

    if-ne v4, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v1
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 5

    .line 320
    invoke-direct {p0}, Ll/ۜ۫ۘ;->ۚ()V

    .line 321
    iget v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    .line 322
    :goto_0
    iget v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    iget v2, p0, Ll/ۜ۫ۘ;->֫:I

    iget-object v3, p0, Ll/ۜ۫ۘ;->ܿ:[C

    if-ge v1, v2, :cond_3

    .line 323
    aget-char v2, v3, v1

    const/16 v4, 0x30

    if-lt v2, v4, :cond_0

    const/16 v4, 0x39

    if-le v2, v4, :cond_2

    :cond_0
    const/16 v4, 0x41

    if-lt v2, v4, :cond_1

    const/16 v4, 0x46

    if-le v2, v4, :cond_2

    :cond_1
    const/16 v4, 0x61

    if-lt v2, v4, :cond_3

    const/16 v4, 0x66

    if-gt v2, v4, :cond_3

    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 325
    iput v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    goto :goto_0

    .line 329
    :cond_3
    iget-object v2, p0, Ll/ۜ۫ۘ;->ۜ:[Ljava/lang/String;

    sub-int/2addr v1, v0

    invoke-static {v3, v2, v0, v1}, Ll/ۜ۫ۘ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 5

    .line 333
    invoke-direct {p0}, Ll/ۜ۫ۘ;->ۚ()V

    .line 334
    iget v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    .line 335
    :goto_0
    iget v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    iget v2, p0, Ll/ۜ۫ۘ;->֫:I

    iget-object v3, p0, Ll/ۜ۫ۘ;->ܿ:[C

    if-ge v1, v2, :cond_0

    .line 336
    aget-char v2, v3, v1

    const/16 v4, 0x30

    if-lt v2, v4, :cond_0

    const/16 v4, 0x39

    if-gt v2, v4, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 338
    iput v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    goto :goto_0

    .line 342
    :cond_0
    iget-object v2, p0, Ll/ۜ۫ۘ;->ۜ:[Ljava/lang/String;

    sub-int/2addr v1, v0

    invoke-static {v3, v2, v0, v1}, Ll/ۜ۫ۘ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ([C)Z
    .locals 2

    .line 391
    invoke-direct {p0}, Ll/ۜ۫ۘ;->ۚ()V

    .line 392
    invoke-virtual {p0}, Ll/ۜ۫ۘ;->ۡ()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۜ۫ۘ;->ܿ:[C

    iget v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    aget-char v0, v0, v1

    invoke-static {p1, v0}, Ljava/util/Arrays;->binarySearch([CC)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩴ()I
    .locals 2

    .line 82
    iget v0, p0, Ll/ۜ۫ۘ;->᩻:I

    iget v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final ᩵()V
    .locals 1

    .line 132
    iget v0, p0, Ll/ۜ۫ۘ;->ۧ:I

    iput v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    return-void
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 4

    const-string v0, "]]>"

    .line 194
    invoke-virtual {p0, v0}, Ll/ۜ۫ۘ;->ܽ(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    .line 195
    iget-object v2, p0, Ll/ۜ۫ۘ;->ۜ:[Ljava/lang/String;

    iget-object v3, p0, Ll/ۜ۫ۘ;->ܿ:[C

    if-eq v0, v1, :cond_0

    .line 196
    iget v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    invoke-static {v3, v2, v1, v0}, Ll/ۜ۫ۘ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    .line 197
    iget v2, p0, Ll/ۜ۫ۘ;->ܽ:I

    add-int/2addr v2, v0

    iput v2, p0, Ll/ۜ۫ۘ;->ܽ:I

    return-object v1

    .line 278
    :cond_0
    invoke-direct {p0}, Ll/ۜ۫ۘ;->ۚ()V

    .line 279
    iget v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    iget v1, p0, Ll/ۜ۫ۘ;->֫:I

    sub-int/2addr v1, v0

    invoke-static {v3, v2, v0, v1}, Ll/ۜ۫ۘ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    .line 280
    iget v1, p0, Ll/ۜ۫ۘ;->֫:I

    iput v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 5

    .line 299
    invoke-direct {p0}, Ll/ۜ۫ۘ;->ۚ()V

    .line 300
    iget v0, p0, Ll/ۜ۫ۘ;->ܽ:I

    .line 301
    :goto_0
    iget v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    iget v2, p0, Ll/ۜ۫ۘ;->֫:I

    iget-object v3, p0, Ll/ۜ۫ۘ;->ܿ:[C

    if-ge v1, v2, :cond_3

    .line 302
    aget-char v1, v3, v1

    const/16 v2, 0x41

    if-lt v1, v2, :cond_0

    const/16 v2, 0x5a

    if-le v1, v2, :cond_2

    :cond_0
    const/16 v2, 0x61

    if-lt v1, v2, :cond_1

    const/16 v2, 0x7a

    if-le v1, v2, :cond_2

    .line 303
    :cond_1
    invoke-static {v1}, Ljava/lang/Character;->isLetter(C)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 304
    :cond_2
    iget v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    goto :goto_0

    .line 96
    :cond_3
    :goto_1
    iget v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    iget v2, p0, Ll/ۜ۫ۘ;->֫:I

    if-lt v1, v2, :cond_4

    goto :goto_2

    .line 309
    :cond_4
    aget-char v2, v3, v1

    const/16 v4, 0x30

    if-lt v2, v4, :cond_5

    const/16 v4, 0x39

    if-gt v2, v4, :cond_5

    add-int/lit8 v1, v1, 0x1

    .line 311
    iput v1, p0, Ll/ۜ۫ۘ;->ܽ:I

    goto :goto_1

    .line 316
    :cond_5
    :goto_2
    iget-object v2, p0, Ll/ۜ۫ۘ;->ۜ:[Ljava/lang/String;

    sub-int/2addr v1, v0

    invoke-static {v3, v2, v0, v1}, Ll/ۜ۫ۘ;->֫([C[Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
