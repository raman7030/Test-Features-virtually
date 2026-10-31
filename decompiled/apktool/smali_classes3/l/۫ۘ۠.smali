.class public Ll/۫ۘ۠;
.super Ljava/lang/Object;
.source "J7QN"


# instance fields
.field public final ֫:[C

.field public ۜ:Z

.field public ۧ:C

.field public ܳ:I

.field public ܽ:I

.field public final ܿ:Ll/᩹ܶ۠;

.field public final ᩳ:I

.field public ᩷:I

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/ۘۘ۠;[CI)V
    .locals 0

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    iput-object p2, p0, Ll/۫ۘ۠;->֫:[C

    .line 107
    iput p3, p0, Ll/۫ۘ۠;->ᩳ:I

    const/4 p2, 0x0

    .line 108
    iput p2, p0, Ll/۫ۘ۠;->ܳ:I

    .line 109
    iput p2, p0, Ll/۫ۘ۠;->᩷:I

    .line 110
    iput-char p2, p0, Ll/۫ۘ۠;->ۧ:C

    .line 111
    iput p2, p0, Ll/۫ۘ۠;->ܽ:I

    .line 112
    iput-boolean p2, p0, Ll/۫ۘ۠;->᩻:Z

    .line 113
    iput-boolean p2, p0, Ll/۫ۘ۠;->ۜ:Z

    .line 114
    iget-object p1, p1, Ll/ۘۘ۠;->ۧ:Ll/᩹ܶ۠;

    iput-object p1, p0, Ll/۫ۘ۠;->ܿ:Ll/᩹ܶ۠;

    .line 116
    invoke-direct {p0}, Ll/۫ۘ۠;->ۡ()V

    return-void
.end method

.method private ۡ()V
    .locals 5

    .line 199
    invoke-direct {p0}, Ll/۫ۘ۠;->ܺ()V

    .line 202
    invoke-virtual {p0}, Ll/۫ۘ۠;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_2

    iget-char v0, p0, Ll/۫ۘ۠;->ۧ:C

    invoke-static {v0}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 207
    :cond_0
    iget-char v0, p0, Ll/۫ۘ۠;->ۧ:C

    .line 208
    iget v1, p0, Ll/۫ۘ۠;->ܳ:I

    .line 209
    iget v2, p0, Ll/۫ۘ۠;->᩷:I

    .line 212
    invoke-direct {p0}, Ll/۫ۘ۠;->ܺ()V

    .line 213
    iget-char v3, p0, Ll/۫ۘ۠;->ۧ:C

    .line 215
    invoke-static {v3}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 217
    iput v1, p0, Ll/۫ۘ۠;->ܳ:I

    .line 218
    iget v1, p0, Ll/۫ۘ۠;->᩷:I

    add-int/2addr v1, v2

    iput v1, p0, Ll/۫ۘ۠;->᩷:I

    .line 220
    invoke-static {v0, v3}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v0

    iput v0, p0, Ll/۫ۘ۠;->ܽ:I

    return-void

    .line 223
    :cond_1
    iput v1, p0, Ll/۫ۘ۠;->ܳ:I

    .line 224
    iput v2, p0, Ll/۫ۘ۠;->᩷:I

    .line 225
    iput-char v0, p0, Ll/۫ۘ۠;->ۧ:C

    .line 226
    iput v0, p0, Ll/۫ۘ۠;->ܽ:I

    :cond_2
    :goto_0
    return-void
.end method

.method private ܺ()V
    .locals 10

    .line 163
    iget v0, p0, Ll/۫ۘ۠;->ܳ:I

    iget v1, p0, Ll/۫ۘ۠;->᩷:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/۫ۘ۠;->ܳ:I

    const/4 v1, 0x0

    .line 165
    iput v1, p0, Ll/۫ۘ۠;->᩷:I

    .line 146
    iget-object v2, p0, Ll/۫ۘ۠;->֫:[C

    const/4 v3, 0x1

    iget v4, p0, Ll/۫ۘ۠;->ᩳ:I

    if-gt v4, v0, :cond_0

    const/16 v5, 0x1a

    .line 148
    iput-char v5, p0, Ll/۫ۘ۠;->ۧ:C

    goto :goto_0

    .line 151
    :cond_0
    aget-char v5, v2, v0

    iput-char v5, p0, Ll/۫ۘ۠;->ۧ:C

    .line 153
    iput v3, p0, Ll/۫ۘ۠;->᩷:I

    .line 170
    :goto_0
    iget-char v5, p0, Ll/۫ۘ۠;->ۧ:C

    const/16 v6, 0x5c

    if-ne v5, v6, :cond_d

    iget-boolean v5, p0, Ll/۫ۘ۠;->᩻:Z

    if-eqz v5, :cond_1

    iget-boolean v5, p0, Ll/۫ۘ۠;->ۜ:Z

    if-eqz v5, :cond_d

    .line 238
    :cond_1
    iget v5, p0, Ll/۫ۘ۠;->᩷:I

    add-int/2addr v0, v5

    .line 241
    iput-char v6, p0, Ll/۫ۘ۠;->ۧ:C

    .line 242
    iput v3, p0, Ll/۫ۘ۠;->᩷:I

    move v5, v0

    :goto_1
    if-ge v5, v4, :cond_3

    .line 247
    aget-char v7, v2, v5

    const/16 v8, 0x75

    if-eq v7, v8, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    if-ne v5, v0, :cond_4

    .line 254
    sget-object v0, Ll/۬ۘ۠;->᩹:Ll/۬ۘ۠;

    goto :goto_6

    :cond_4
    const/4 v0, 0x0

    const/4 v7, 0x0

    :goto_3
    const/4 v8, 0x4

    if-ge v0, v8, :cond_7

    if-ge v5, v4, :cond_5

    .line 261
    aget-char v8, v2, v5

    const/16 v9, 0x10

    invoke-static {v8, v9}, Ljava/lang/Character;->digit(CI)I

    move-result v8

    goto :goto_4

    :cond_5
    const/4 v8, -0x1

    :goto_4
    shl-int/lit8 v7, v7, 0x4

    or-int/2addr v7, v8

    if-gez v7, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 274
    :cond_7
    :goto_5
    iget v0, p0, Ll/۫ۘ۠;->ܳ:I

    sub-int v0, v5, v0

    iput v0, p0, Ll/۫ۘ۠;->᩷:I

    if-ltz v7, :cond_8

    int-to-char v0, v7

    .line 278
    iput-char v0, p0, Ll/۫ۘ۠;->ۧ:C

    .line 279
    sget-object v0, Ll/۬ۘ۠;->ۙ:Ll/۬ۘ۠;

    goto :goto_6

    .line 281
    :cond_8
    iget-object v0, p0, Ll/۫ۘ۠;->ܿ:Ll/᩹ܶ۠;

    sget-object v2, Ll/ۛᩴ۠;->ܿۧ:Ll/۫۠۠;

    invoke-virtual {v0, v5, v2}, Ll/ۖ֨۠;->֫(ILl/۫۠۠;)V

    .line 282
    sget-object v0, Ll/۬ۘ۠;->᩶:Ll/۬ۘ۠;

    .line 172
    :goto_6
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_c

    if-eq v0, v3, :cond_a

    const/4 v1, 0x2

    if-eq v0, v1, :cond_9

    goto :goto_7

    .line 181
    :cond_9
    invoke-direct {p0}, Ll/۫ۘ۠;->ܺ()V

    goto :goto_7

    .line 178
    :cond_a
    iput-boolean v3, p0, Ll/۫ۘ۠;->ۜ:Z

    .line 179
    iget-char v0, p0, Ll/۫ۘ۠;->ۧ:C

    if-ne v0, v6, :cond_b

    iget-boolean v0, p0, Ll/۫ۘ۠;->᩻:Z

    if-nez v0, :cond_b

    const/4 v1, 0x1

    :cond_b
    iput-boolean v1, p0, Ll/۫ۘ۠;->᩻:Z

    goto :goto_7

    .line 174
    :cond_c
    iput-boolean v1, p0, Ll/۫ۘ۠;->ۜ:Z

    .line 175
    iget-boolean v0, p0, Ll/۫ۘ۠;->᩻:Z

    xor-int/2addr v0, v3

    iput-boolean v0, p0, Ll/۫ۘ۠;->᩻:Z

    goto :goto_7

    .line 184
    :cond_d
    iput-boolean v1, p0, Ll/۫ۘ۠;->᩻:Z

    .line 185
    iput-boolean v1, p0, Ll/۫ۘ۠;->ۜ:Z

    .line 189
    :goto_7
    iget-char v0, p0, Ll/۫ۘ۠;->ۧ:C

    iput v0, p0, Ll/۫ۘ۠;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫()C
    .locals 1

    .line 321
    iget-char v0, p0, Ll/۫ۘ۠;->ۧ:C

    return v0
.end method

.method public final ֫(I)I
    .locals 3

    const/16 v0, 0x39

    .line 520
    invoke-virtual {p0, v0}, Ll/۫ۘ۠;->ۧ(C)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 522
    iget-char v0, p0, Ll/۫ۘ۠;->ۧ:C

    add-int/lit8 v0, v0, -0x30

    if-ge v0, p1, :cond_0

    return v0

    :cond_0
    const/4 p1, -0x1

    return p1

    .line 528
    :cond_1
    invoke-virtual {p0}, Ll/۫ۘ۠;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Ll/۫ۘ۠;->ܽ:I

    invoke-static {v0, p1}, Ljava/lang/Character;->digit(II)I

    move-result p1

    goto :goto_0

    .line 529
    :cond_2
    iget-char v0, p0, Ll/۫ۘ۠;->ۧ:C

    invoke-static {v0, p1}, Ljava/lang/Character;->digit(CI)I

    move-result p1

    :goto_0
    if-ltz p1, :cond_3

    .line 531
    invoke-virtual {p0}, Ll/۫ۘ۠;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_3

    .line 298
    iget v0, p0, Ll/۫ۘ۠;->ܳ:I

    .line 532
    sget-object v1, Ll/ۛᩴ۠;->ۨ֫:Ll/۫۠۠;

    iget-object v2, p0, Ll/۫ۘ۠;->ܿ:Ll/᩹ܶ۠;

    invoke-virtual {v2, v0, v1}, Ll/ۖ֨۠;->֫(ILl/۫۠۠;)V

    const-string v0, "0123456789abcdef"

    .line 533
    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    iput-char v0, p0, Ll/۫ۘ۠;->ۧ:C

    :cond_3
    return p1
.end method

.method public final ֫(C)Z
    .locals 0

    .line 406
    invoke-virtual {p0, p1}, Ll/۫ۘ۠;->ܽ(C)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 407
    invoke-virtual {p0}, Ll/۫ۘ۠;->ۜ()C

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(CC)Z
    .locals 0

    .line 377
    invoke-virtual {p0, p1}, Ll/۫ۘ۠;->ܽ(C)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0, p2}, Ll/۫ۘ۠;->ܽ(C)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 5

    .line 483
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {p0, v0}, Ll/۫ۘ۠;->ܽ(C)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 488
    :cond_0
    iget v0, p0, Ll/۫ۘ۠;->ܳ:I

    .line 490
    invoke-direct {p0}, Ll/۫ۘ۠;->ۡ()V

    const/4 v2, 0x1

    const/4 v3, 0x1

    .line 493
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_2

    .line 494
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-virtual {p0, v4}, Ll/۫ۘ۠;->ܽ(C)Z

    move-result v4

    if-nez v4, :cond_1

    .line 496
    invoke-virtual {p0, v0}, Ll/۫ۘ۠;->ۧ(I)V

    return v1

    .line 501
    :cond_1
    invoke-direct {p0}, Ll/۫ۘ۠;->ۡ()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v2

    :cond_3
    :goto_1
    return v1
.end method

.method public final ֫(II)[C
    .locals 1

    .line 564
    iget-object v0, p0, Ll/۫ۘ۠;->֫:[C

    invoke-static {v0, p1, p2}, Ljava/util/Arrays;->copyOfRange([CII)[C

    move-result-object p1

    return-object p1
.end method

.method public ۜ()C
    .locals 1

    .line 357
    invoke-direct {p0}, Ll/۫ۘ۠;->ۡ()V

    .line 359
    iget-char v0, p0, Ll/۫ۘ۠;->ۧ:C

    return v0
.end method

.method public final ۢ()V
    .locals 1

    :goto_0
    const/16 v0, 0x20

    .line 380
    invoke-virtual {p0, v0}, Ll/۫ۘ۠;->ܽ(C)Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0x9

    invoke-virtual {p0, v0}, Ll/۫ۘ۠;->ܽ(C)Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Ll/۫ۘ۠;->ܽ(C)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    return-void

    .line 430
    :cond_1
    :goto_1
    invoke-virtual {p0}, Ll/۫ۘ۠;->ۜ()C

    goto :goto_0
.end method

.method public final ۧ()I
    .locals 1

    .line 330
    iget v0, p0, Ll/۫ۘ۠;->ܽ:I

    return v0
.end method

.method public final ۧ(I)V
    .locals 0

    .line 308
    iput p1, p0, Ll/۫ۘ۠;->ܳ:I

    const/4 p1, 0x0

    .line 309
    iput p1, p0, Ll/۫ۘ۠;->᩷:I

    .line 310
    iput-boolean p1, p0, Ll/۫ۘ۠;->᩻:Z

    .line 311
    iput-boolean p1, p0, Ll/۫ۘ۠;->ۜ:Z

    .line 312
    invoke-direct {p0}, Ll/۫ۘ۠;->ۡ()V

    return-void
.end method

.method public final ۧ(C)Z
    .locals 2

    .line 395
    iget-char v0, p0, Ll/۫ۘ۠;->ۧ:C

    const/16 v1, 0x30

    if-gt v1, v0, :cond_0

    if-gt v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܳ()Z
    .locals 2

    const v0, 0xffff

    .line 339
    iget v1, p0, Ll/۫ۘ۠;->ܽ:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ(C)Z
    .locals 1

    .line 370
    iget-char v0, p0, Ll/۫ۘ۠;->ۧ:C

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ()[C
    .locals 3

    .line 545
    iget-object v0, p0, Ll/۫ۘ۠;->֫:[C

    array-length v1, v0

    iget v2, p0, Ll/۫ۘ۠;->ᩳ:I

    if-ne v2, v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Z
    .locals 2

    .line 135
    iget v0, p0, Ll/۫ۘ۠;->ܳ:I

    iget v1, p0, Ll/۫ۘ۠;->ᩳ:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Z
    .locals 2

    .line 348
    iget-char v0, p0, Ll/۫ۘ۠;->ۧ:C

    const/16 v1, 0x7f

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()I
    .locals 1

    .line 298
    iget v0, p0, Ll/۫ۘ۠;->ܳ:I

    return v0
.end method

.method public final ᩻()I
    .locals 1

    .line 126
    iget v0, p0, Ll/۫ۘ۠;->ᩳ:I

    return v0
.end method
