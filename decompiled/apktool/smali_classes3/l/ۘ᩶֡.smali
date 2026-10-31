.class public final Ll/ۘ᩶֡;
.super Ll/ۚۙ֡;
.source "O69P"


# instance fields
.field public ۗ:[Ll/ۡ᩶֡;

.field public ۙ:Ll/᩸᩶֡;

.field public ۛ:Ll/ܰܶ֡;

.field public ۤ:I

.field public ۨ:I

.field public ۫:[Ll/֫᩶֡;

.field public ۬:I

.field public ᩺:[Ll/ۖ᩶֡;


# direct methods
.method public constructor <init>(Ll/ۗ᩶֡;III[Ll/֫᩶֡;[Ll/ۖ᩶֡;[Ll/ۡ᩶֡;)V
    .locals 0

    .line 99
    invoke-direct {p0, p1}, Ll/ۚۙ֡;-><init>(Ll/ۗ᩶֡;)V

    .line 101
    iput p2, p0, Ll/ۘ᩶֡;->ۨ:I

    .line 102
    iput p3, p0, Ll/ۘ᩶֡;->۬:I

    .line 103
    iput p4, p0, Ll/ۘ᩶֡;->ۤ:I

    const/4 p1, 0x0

    .line 104
    iput-object p1, p0, Ll/ۘ᩶֡;->ۙ:Ll/᩸᩶֡;

    .line 109
    iput-object p5, p0, Ll/ۘ᩶֡;->۫:[Ll/֫᩶֡;

    .line 110
    iput-object p6, p0, Ll/ۘ᩶֡;->᩺:[Ll/ۖ᩶֡;

    .line 111
    iput-object p7, p0, Ll/ۘ᩶֡;->ۗ:[Ll/ۡ᩶֡;

    return-void
.end method

.method public static ֫(Ll/ۗ᩶֡;ILjava/util/ArrayList;)Ll/ۘ᩶֡;
    .locals 9

    .line 149
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v8, 0x0

    if-lez v0, :cond_0

    .line 150
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ll/֫᩶֡;

    .line 151
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-object v6, v0

    goto :goto_0

    :cond_0
    move-object v6, v8

    .line 154
    :goto_0
    new-instance p2, Ll/ۘ᩶֡;

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v1, p2

    move-object v2, p0

    move v3, p1

    move-object v7, v8

    invoke-direct/range {v1 .. v8}, Ll/ۘ᩶֡;-><init>(Ll/ۗ᩶֡;III[Ll/֫᩶֡;[Ll/ۖ᩶֡;[Ll/ۡ᩶֡;)V

    .line 156
    iget-object p0, p0, Ll/ۗ᩶֡;->᩻:Ll/ۗۙ֡;

    invoke-virtual {p0, p2}, Ll/ۤۙ֡;->֫(Ll/ۚۙ֡;)Ll/ۚۙ֡;

    move-result-object p0

    check-cast p0, Ll/ۘ᩶֡;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 57
    check-cast p1, Ll/ۘ᩶֡;

    invoke-virtual {p0, p1}, Ll/ۘ᩶֡;->֫(Ll/ۘ᩶֡;)I

    move-result p1

    return p1
.end method

.method public final getParent()Ll/ܰܶ֡;
    .locals 1

    .line 577
    iget-object v0, p0, Ll/ۘ᩶֡;->ۛ:Ll/ܰܶ֡;

    return-object v0
.end method

.method public final ֫(I)I
    .locals 6

    .line 595
    iget-object v0, p0, Ll/ۘ᩶֡;->۫:[Ll/֫᩶֡;

    .line 597
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v5, v0, v3

    .line 598
    invoke-virtual {v5, v4}, Ll/֫᩶֡;->֫(I)I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    const/16 v1, 0x10

    .line 392
    invoke-static {v4, v0, v1, p1}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result p1

    .line 394
    iget-object v0, p0, Ll/ۘ᩶֡;->᩺:[Ll/ۖ᩶֡;

    if-eqz v0, :cond_1

    array-length v1, v0

    if-lez v1, :cond_1

    add-int/lit8 p1, p1, 0x3

    and-int/lit8 p1, p1, -0x4

    .line 397
    array-length v0, v0

    mul-int/lit8 v0, v0, 0x8

    add-int/2addr v0, p1

    .line 399
    iget-object p1, p0, Ll/ۘ᩶֡;->ۗ:[Ll/ۡ᩶֡;

    array-length p1, p1

    invoke-static {p1}, Ll/ۧᩳܽ;->ۜ(I)I

    move-result p1

    add-int/2addr p1, v0

    .line 400
    iget-object v1, p0, Ll/ۘ᩶֡;->ۗ:[Ll/ۡ᩶֡;

    array-length v3, v1

    :goto_1
    if-ge v2, v3, :cond_1

    aget-object v4, v1, v2

    .line 401
    invoke-static {p1, v0, v4}, Ll/ۡ᩶֡;->֫(IILl/ۡ᩶֡;)I

    move-result p1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return p1
.end method

.method public final ֫(Ll/ۘ᩶֡;)I
    .locals 1

    .line 516
    iget-object v0, p0, Ll/ۘ᩶֡;->ۛ:Ll/ܰܶ֡;

    if-nez v0, :cond_1

    .line 517
    iget-object p1, p1, Ll/ۘ᩶֡;->ۛ:Ll/ܰܶ֡;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1

    .line 522
    :cond_1
    iget-object p1, p1, Ll/ۘ᩶֡;->ۛ:Ll/ܰܶ֡;

    if-nez p1, :cond_2

    const/4 p1, 0x1

    return p1

    .line 525
    :cond_2
    iget-object v0, v0, Ll/ܰܶ֡;->᩶:Ll/᩹ۙ֡;

    iget-object p1, p1, Ll/ܰܶ֡;->᩶:Ll/᩹ۙ֡;

    invoke-virtual {v0, p1}, Ll/᩹ۙ֡;->֫(Ll/᩹ۙ֡;)I

    move-result p1

    return p1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 506
    iget-object v0, p0, Ll/ۘ᩶֡;->ۛ:Ll/ܰܶ֡;

    const-string v1, "code_item @0x"

    if-nez v0, :cond_0

    .line 507
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    iget v1, p0, Ll/ۚۙ֡;->᩶:I

    .line 0
    invoke-static {v0, v1}, Ll/ܰۗ;->֫(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 509
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    iget v1, p0, Ll/ۚۙ֡;->᩶:I

    .line 509
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۘ᩶֡;->ۛ:Ll/ܰܶ֡;

    iget-object v1, v1, Ll/ܰܶ֡;->᩶:Ll/᩹ۙ֡;

    invoke-virtual {v1}, Ll/᩹ۙ֡;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗ᩶֡;)Ll/ۘ᩶֡;
    .locals 14

    .line 177
    iget-object v0, p0, Ll/ۘ᩶֡;->ۛ:Ll/ܰܶ֡;

    iget-object v0, v0, Ll/ܰܶ֡;->᩶:Ll/᩹ۙ֡;

    .line 224
    iget-object v0, v0, Ll/᩹ۙ֡;->ۤ:Ll/۬ۙ֡;

    .line 220
    iget-object v0, v0, Ll/۬ۙ֡;->۬:Ll/ܰۙ֡;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    .line 196
    :cond_0
    iget-object v0, v0, Ll/ܰۙ֡;->ۗ:[Ll/᩺ۙ֡;

    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v5, v0, v3

    .line 197
    invoke-virtual {v5}, Ll/᩺ۙ֡;->᩻()I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move v0, v4

    .line 179
    :goto_1
    iget-object v2, p0, Ll/ۘ᩶֡;->ۛ:Ll/ܰܶ֡;

    iget v2, v2, Ll/ܰܶ֡;->᩸:I

    sget-object v3, Ll/۟ۙ֡;->ܳ֫:Ll/۟ۙ֡;

    invoke-virtual {v3}, Ll/۟ۙ֡;->getValue()I

    move-result v3

    and-int/2addr v2, v3

    if-nez v2, :cond_2

    add-int/lit8 v0, v0, 0x1

    .line 182
    :cond_2
    iput v0, p0, Ll/ۘ᩶֡;->۬:I

    .line 186
    new-instance v0, Ljava/util/ArrayList;

    const/4 v2, 0x3

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 305
    iget-object v3, p0, Ll/ۘ᩶֡;->᩺:[Ll/ۖ᩶֡;

    const/4 v4, 0x0

    if-nez v3, :cond_3

    move-object v12, v4

    goto :goto_5

    .line 308
    :cond_3
    array-length v3, v3

    new-array v3, v3, [Ll/ۖ᩶֡;

    const/4 v5, 0x0

    .line 309
    :goto_2
    iget-object v6, p0, Ll/ۘ᩶֡;->᩺:[Ll/ۖ᩶֡;

    array-length v7, v6

    if-ge v5, v7, :cond_6

    .line 310
    aget-object v6, v6, v5

    .line 294
    iget-object v7, v6, Ll/ۖ᩶֡;->֫:Ll/ۡ᩶֡;

    .line 276
    iget-object v8, v7, Ll/ۡ᩶֡;->ܽ:[Ll/ܺ᩶֡;

    if-nez v8, :cond_4

    move-object v9, v4

    goto :goto_4

    .line 279
    :cond_4
    array-length v8, v8

    new-array v8, v8, [Ll/ܺ᩶֡;

    const/4 v9, 0x0

    .line 280
    :goto_3
    iget-object v10, v7, Ll/ۡ᩶֡;->ܽ:[Ll/ܺ᩶֡;

    array-length v11, v10

    if-ge v9, v11, :cond_5

    .line 281
    aget-object v10, v10, v9

    .line 267
    new-instance v11, Ll/ܺ᩶֡;

    iget-object v12, v10, Ll/ܺ᩶֡;->֫:Ll/᩺ۙ֡;

    .line 270
    invoke-virtual {v12}, Ll/᩺ۙ֡;->᩷()Ljava/lang/String;

    move-result-object v12

    .line 268
    invoke-static {v12, p1}, Ll/᩺ۙ֡;->֫(Ljava/lang/String;Ll/ۗ᩶֡;)Ll/᩺ۙ֡;

    move-result-object v12

    .line 271
    invoke-virtual {v10}, Ll/ܺ᩶֡;->֫()I

    move-result v10

    invoke-direct {v11, v12, v10}, Ll/ܺ᩶֡;-><init>(Ll/᩺ۙ֡;I)V

    .line 281
    aput-object v11, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    .line 286
    :cond_5
    new-instance v9, Ll/ۡ᩶֡;

    .line 288
    invoke-virtual {v7}, Ll/ۡ᩶֡;->֫()I

    move-result v7

    invoke-direct {v9, v8, v7}, Ll/ۡ᩶֡;-><init>([Ll/ܺ᩶֡;I)V

    .line 295
    :goto_4
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 297
    new-instance v7, Ll/ۖ᩶֡;

    .line 298
    invoke-virtual {v6}, Ll/ۖ᩶֡;->֫()I

    move-result v8

    .line 299
    invoke-virtual {v6}, Ll/ۖ᩶֡;->ۧ()I

    move-result v6

    invoke-direct {v7, v8, v6, v9}, Ll/ۖ᩶֡;-><init>(IILl/ۡ᩶֡;)V

    .line 310
    aput-object v7, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_6
    move-object v12, v3

    .line 191
    :goto_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_7

    .line 192
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-array v4, v3, [Ll/ۡ᩶֡;

    .line 193
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    :cond_7
    move-object v13, v4

    .line 196
    new-instance v0, Ll/ۘ᩶֡;

    iget v8, p0, Ll/ۘ᩶֡;->ۨ:I

    iget v9, p0, Ll/ۘ᩶֡;->۬:I

    iget v10, p0, Ll/ۘ᩶֡;->ۤ:I

    .line 211
    iget-object v11, p0, Ll/ۘ᩶֡;->۫:[Ll/֫᩶֡;

    .line 213
    array-length v3, v11

    :goto_6
    if-ge v1, v3, :cond_c

    aget-object v4, v11, v1

    .line 214
    sget-object v5, Ll/ۢ᩶֡;->֫:[I

    invoke-virtual {v4}, Ll/֫᩶֡;->ۢ()Ll/᩻᩸֡;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v5, v5, v6

    packed-switch v5, :pswitch_data_0

    goto :goto_7

    .line 221
    :pswitch_0
    move-object v5, v4

    check-cast v5, Ll/ܽ᩶֡;

    .line 222
    sget-object v6, Ll/ۢ᩶֡;->ۧ:[I

    iget-object v4, v4, Ll/֫᩶֡;->֫:Ll/᩻᩶֡;

    iget-object v4, v4, Ll/᩻᩶֡;->ۙ:Ll/ۜ᩶֡;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v6, v4

    const/4 v6, 0x1

    if-eq v4, v6, :cond_b

    const/4 v6, 0x2

    if-eq v4, v6, :cond_a

    if-eq v4, v2, :cond_9

    const/4 v6, 0x4

    if-eq v4, v6, :cond_8

    goto :goto_7

    .line 249
    :cond_8
    invoke-virtual {v5}, Ll/ܽ᩶֡;->ۡ()Ll/ۚۙ֡;

    move-result-object v4

    check-cast v4, Ll/ۨۙ֡;

    .line 252
    invoke-virtual {v4}, Ll/ۨۙ֡;->᩻()Ljava/lang/String;

    move-result-object v4

    .line 250
    invoke-static {v4, p1}, Ll/ۨۙ֡;->֫(Ljava/lang/String;Ll/ۗ᩶֡;)Ll/ۨۙ֡;

    move-result-object v4

    .line 254
    invoke-virtual {v5, v4}, Ll/ܽ᩶֡;->֫(Ll/ۚۙ֡;)V

    goto :goto_7

    .line 240
    :cond_9
    invoke-virtual {v5}, Ll/ܽ᩶֡;->ۡ()Ll/ۚۙ֡;

    move-result-object v4

    check-cast v4, Ll/᩺ۙ֡;

    .line 244
    invoke-virtual {v4}, Ll/᩺ۙ֡;->᩷()Ljava/lang/String;

    move-result-object v4

    .line 242
    invoke-static {v4, p1}, Ll/᩺ۙ֡;->֫(Ljava/lang/String;Ll/ۗ᩶֡;)Ll/᩺ۙ֡;

    move-result-object v4

    .line 241
    invoke-virtual {v5, v4}, Ll/ܽ᩶֡;->֫(Ll/ۚۙ֡;)V

    goto :goto_7

    .line 232
    :cond_a
    invoke-virtual {v5}, Ll/ܽ᩶֡;->ۡ()Ll/ۚۙ֡;

    move-result-object v4

    check-cast v4, Ll/᩹ۙ֡;

    .line 234
    invoke-virtual {v4, p1}, Ll/᩹ۙ֡;->֫(Ll/ۗ᩶֡;)Ll/᩹ۙ֡;

    move-result-object v4

    .line 233
    invoke-virtual {v5, v4}, Ll/ܽ᩶֡;->֫(Ll/ۚۙ֡;)V

    goto :goto_7

    .line 224
    :cond_b
    invoke-virtual {v5}, Ll/ܽ᩶֡;->ۡ()Ll/ۚۙ֡;

    move-result-object v4

    check-cast v4, Ll/ᩴۙ֡;

    .line 226
    invoke-virtual {v4, p1}, Ll/ᩴۙ֡;->֫(Ll/ۗ᩶֡;)Ll/ᩴۙ֡;

    move-result-object v4

    .line 225
    invoke-virtual {v5, v4}, Ll/ܽ᩶֡;->֫(Ll/ۚۙ֡;)V

    :goto_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_c
    move-object v6, v0

    move-object v7, p1

    .line 202
    invoke-direct/range {v6 .. v13}, Ll/ۘ᩶֡;-><init>(Ll/ۗ᩶֡;III[Ll/֫᩶֡;[Ll/ۖ᩶֡;[Ll/ۡ᩶֡;)V

    .line 207
    iget-object p1, p1, Ll/ۗ᩶֡;->᩻:Ll/ۗۙ֡;

    invoke-virtual {p1, v0}, Ll/ۤۙ֡;->֫(Ll/ۚۙ֡;)Ll/ۚۙ֡;

    move-result-object p1

    check-cast p1, Ll/ۘ᩶֡;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ll/֫ۗ֡;)V
    .locals 6

    .line 595
    iget-object v0, p0, Ll/ۘ᩶֡;->۫:[Ll/֫᩶֡;

    .line 597
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v5, v0, v3

    .line 598
    invoke-virtual {v5, v4}, Ll/֫᩶֡;->֫(I)I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 429
    :cond_0
    iget v0, p0, Ll/ۘ᩶֡;->ۨ:I

    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ᩳ(I)V

    .line 430
    iget v0, p0, Ll/ۘ᩶֡;->۬:I

    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ᩳ(I)V

    .line 431
    iget v0, p0, Ll/ۘ᩶֡;->ۤ:I

    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ᩳ(I)V

    .line 432
    iget-object v0, p0, Ll/ۘ᩶֡;->᩺:[Ll/ۖ᩶֡;

    if-nez v0, :cond_1

    .line 433
    invoke-virtual {p1, v2}, Ll/֫ۗ֡;->ᩳ(I)V

    goto :goto_1

    .line 435
    :cond_1
    array-length v0, v0

    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ᩳ(I)V

    .line 437
    :goto_1
    iget-object v0, p0, Ll/ۘ᩶֡;->ۙ:Ll/᩸᩶֡;

    if-nez v0, :cond_2

    .line 438
    invoke-virtual {p1, v2}, Ll/֫ۗ֡;->ܽ(I)V

    goto :goto_2

    .line 202
    :cond_2
    iget v0, v0, Ll/ۚۙ֡;->᩶:I

    .line 440
    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ܽ(I)V

    .line 443
    :goto_2
    invoke-virtual {p1, v4}, Ll/֫ۗ֡;->ܽ(I)V

    .line 445
    iget-object v0, p0, Ll/ۘ᩶֡;->۫:[Ll/֫᩶֡;

    .line 447
    array-length v1, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_3
    if-ge v3, v1, :cond_3

    aget-object v5, v0, v3

    .line 448
    invoke-virtual {v5, p1, v4}, Ll/֫᩶֡;->֫(Ll/֫ۗ֡;I)I

    move-result v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 451
    :cond_3
    iget-object v0, p0, Ll/ۘ᩶֡;->᩺:[Ll/ۖ᩶֡;

    if-eqz v0, :cond_6

    array-length v0, v0

    if-lez v0, :cond_6

    .line 478
    rem-int/lit8 v4, v4, 0x2

    if-eqz v4, :cond_4

    .line 479
    invoke-virtual {p1, v2}, Ll/֫ۗ֡;->ᩳ(I)V

    .line 482
    :cond_4
    iget-object v0, p0, Ll/ۘ᩶֡;->᩺:[Ll/ۖ᩶֡;

    array-length v1, v0

    const/4 v3, 0x0

    :goto_4
    if-ge v3, v1, :cond_5

    aget-object v4, v0, v3

    .line 483
    invoke-static {v4, p1}, Ll/ۖ᩶֡;->֫(Ll/ۖ᩶֡;Ll/֫ۗ֡;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 486
    :cond_5
    iget-object v0, p0, Ll/ۘ᩶֡;->ۗ:[Ll/ۡ᩶֡;

    array-length v0, v0

    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ܳ(I)I

    .line 488
    iget-object v0, p0, Ll/ۘ᩶֡;->ۗ:[Ll/ۡ᩶֡;

    array-length v1, v0

    :goto_5
    if-ge v2, v1, :cond_6

    aget-object v3, v0, v2

    .line 489
    invoke-static {v3, p1}, Ll/ۡ᩶֡;->֫(Ll/ۡ᩶֡;Ll/֫ۗ֡;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_6
    return-void
.end method

.method public final ֫(Ll/ۧۗ֡;Ll/۫ۙ֡;)V
    .locals 10

    .line 324
    invoke-virtual {p1}, Ll/ۧۗ֡;->ᩳ()I

    move-result v0

    iput v0, p0, Ll/ۘ᩶֡;->ۨ:I

    .line 325
    invoke-virtual {p1}, Ll/ۧۗ֡;->ᩳ()I

    move-result v0

    iput v0, p0, Ll/ۘ᩶֡;->۬:I

    .line 326
    invoke-virtual {p1}, Ll/ۧۗ֡;->ᩳ()I

    move-result v0

    iput v0, p0, Ll/ۘ᩶֡;->ۤ:I

    .line 327
    invoke-virtual {p1}, Ll/ۧۗ֡;->ᩳ()I

    move-result v0

    .line 328
    sget-object v1, Ll/ܶۙ֡;->۟:Ll/ܶۙ֡;

    .line 329
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v2

    .line 328
    invoke-virtual {p2, v1, v2}, Ll/۫ۙ֡;->ۧ(Ll/ܶۙ֡;I)Ll/ۚۙ֡;

    move-result-object p2

    check-cast p2, Ll/᩸᩶֡;

    iput-object p2, p0, Ll/ۘ᩶֡;->ۙ:Ll/᩸᩶֡;

    if-eqz p2, :cond_0

    .line 331
    invoke-virtual {p2, p0}, Ll/᩸᩶֡;->֫(Ll/ۘ᩶֡;)V

    .line 334
    :cond_0
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result p2

    .line 336
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x2

    mul-int/lit8 p2, p2, 0x2

    .line 338
    invoke-virtual {p1, p2}, Ll/ۧۗ֡;->ۧ(I)[B

    move-result-object p2

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 43
    :goto_0
    array-length v5, p2

    iget-object v6, p0, Ll/ۚۙ֡;->᩸:Ll/ۗ᩶֡;

    if-ge v4, v5, :cond_7

    .line 45
    :try_start_0
    aget-byte v5, p2, v4

    invoke-static {v5}, Ll/᩻᩶֡;->֫(B)Ll/᩻᩶֡;

    move-result-object v5

    if-nez v5, :cond_1

    .line 49
    sget-object p2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unknown opcode  address: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Ll/۟᩸᩵;->֫(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_2

    .line 54
    :cond_1
    sget-object v7, Ll/᩻᩶֡;->ۗܿ:Ll/᩻᩶֡;

    if-ne v5, v7, :cond_6

    add-int/lit8 v5, v4, 0x1

    .line 55
    aget-byte v5, p2, v5

    if-eqz v5, :cond_5

    const/4 v6, 0x1

    if-eq v5, v6, :cond_4

    if-eq v5, v2, :cond_3

    const/4 v6, 0x3

    if-eq v5, v6, :cond_2

    const/4 v5, 0x0

    goto :goto_1

    .line 70
    :cond_2
    new-instance v5, Ll/ܳ᩸֡;

    invoke-direct {v5, p2, v4}, Ll/ܳ᩸֡;-><init>([BI)V

    goto :goto_1

    .line 66
    :cond_3
    new-instance v5, Ll/ܰ᩹֡;

    invoke-direct {v5, p2, v4}, Ll/ܰ᩹֡;-><init>([BI)V

    goto :goto_1

    .line 62
    :cond_4
    new-instance v5, Ll/ۛ᩹֡;

    invoke-direct {v5, p2, v4}, Ll/ۛ᩹֡;-><init>([BI)V

    goto :goto_1

    .line 58
    :cond_5
    new-instance v5, Ll/ۡ᩸֡;

    invoke-direct {v5, v7, v3}, Ll/ۡ᩸֡;-><init>(Ll/᩻᩶֡;I)V

    goto :goto_1

    .line 75
    :cond_6
    iget-object v7, v5, Ll/᩻᩶֡;->᩹:Ll/᩻᩸֡;

    iget-object v7, v7, Ll/᩻᩸֡;->᩸:Ll/۟᩹֡;

    invoke-interface {v7, v6, v5, p2, v4}, Ll/۟᩹֡;->֫(Ll/ۗ᩶֡;Ll/᩻᩶֡;[BI)Ll/֫᩶֡;

    move-result-object v5

    .line 342
    :goto_1
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    div-int/lit8 v6, v4, 0x2

    invoke-virtual {v5, v6}, Ll/֫᩶֡;->֫(I)I

    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    mul-int/lit8 v5, v5, 0x2

    add-int/2addr v4, v5

    goto :goto_0

    :catch_0
    move-exception p1

    .line 84
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Error occurred at code address "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    mul-int/lit8 v4, v4, 0x2

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Ll/ܽۗ֡;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ll/ܽۗ֡;

    move-result-object p1

    throw p1

    .line 346
    :cond_7
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p2

    new-array p2, p2, [Ll/֫᩶֡;

    iput-object p2, p0, Ll/ۘ᩶֡;->۫:[Ll/֫᩶֡;

    .line 347
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    if-lez v0, :cond_a

    const/4 p2, 0x4

    .line 350
    invoke-virtual {p1, p2}, Ll/ۧۗ֡;->֫(I)V

    .line 353
    invoke-virtual {p1}, Ll/ۧۗ֡;->֫()I

    move-result p2

    mul-int/lit8 v1, v0, 0x8

    add-int/2addr v1, p2

    .line 354
    invoke-virtual {p1, v1}, Ll/ۧۗ֡;->ܽ(I)V

    .line 357
    invoke-virtual {p1}, Ll/ۧۗ֡;->֫()I

    move-result v1

    .line 358
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܳ()I

    move-result v2

    .line 359
    new-instance v4, Ll/᩻ۗ֡;

    invoke-direct {v4, v2}, Ll/᩻ۗ֡;-><init>(I)V

    .line 360
    new-array v5, v2, [Ll/ۡ᩶֡;

    iput-object v5, p0, Ll/ۘ᩶֡;->ۗ:[Ll/ۡ᩶֡;

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v2, :cond_8

    .line 363
    :try_start_1
    invoke-virtual {p1}, Ll/ۧۗ֡;->֫()I

    move-result v7

    sub-int/2addr v7, v1

    .line 364
    iget-object v8, p0, Ll/ۘ᩶֡;->ۗ:[Ll/ۡ᩶֡;

    new-instance v9, Ll/ۡ᩶֡;

    invoke-direct {v9, v6, p1}, Ll/ۡ᩶֡;-><init>(Ll/ۗ᩶֡;Ll/ۧۗ֡;)V

    aput-object v9, v8, v5

    .line 365
    iget-object v8, p0, Ll/ۘ᩶֡;->ۗ:[Ll/ۡ᩶֡;

    aget-object v8, v8, v5

    invoke-virtual {v4, v7, v8}, Ll/᩻ۗ֡;->֫(ILjava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :catch_1
    move-exception p1

    .line 367
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Error while reading EncodedCatchHandler at index "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Ll/ܽۗ֡;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ll/ܽۗ֡;

    move-result-object p1

    throw p1

    .line 370
    :cond_8
    invoke-virtual {p1}, Ll/ۧۗ֡;->֫()I

    move-result v1

    .line 373
    invoke-virtual {p1, p2}, Ll/ۧۗ֡;->ܽ(I)V

    .line 374
    new-array p2, v0, [Ll/ۖ᩶֡;

    iput-object p2, p0, Ll/ۘ᩶֡;->᩺:[Ll/ۖ᩶֡;

    :goto_4
    if-ge v3, v0, :cond_9

    .line 377
    :try_start_2
    iget-object p2, p0, Ll/ۘ᩶֡;->᩺:[Ll/ۖ᩶֡;

    new-instance v2, Ll/ۖ᩶֡;

    invoke-direct {v2, p1, v4}, Ll/ۖ᩶֡;-><init>(Ll/ۧۗ֡;Ll/᩻ۗ֡;)V

    aput-object v2, p2, v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :catch_2
    move-exception p1

    .line 379
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Error while reading TryItem at index "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Ll/ܽۗ֡;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ll/ܽۗ֡;

    move-result-object p1

    throw p1

    .line 384
    :cond_9
    invoke-virtual {p1, v1}, Ll/ۧۗ֡;->ܽ(I)V

    :cond_a
    return-void
.end method

.method public final ֫(Ll/ܰܶ֡;)V
    .locals 0

    .line 570
    iput-object p1, p0, Ll/ۘ᩶֡;->ۛ:Ll/ܰܶ֡;

    return-void
.end method
