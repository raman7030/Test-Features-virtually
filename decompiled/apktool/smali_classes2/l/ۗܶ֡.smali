.class public final Ll/ۗܶ֡;
.super Ll/ۚۙ֡;
.source "85TO"


# instance fields
.field public ۗ:[Ll/ᩴۙ֡;

.field public ۙ:Ll/ۤܶ֡;

.field public ۛ:[Ll/᩹ۙ֡;

.field public ۤ:[Ll/ۤܶ֡;

.field public ۨ:[Ll/ۛܶ֡;

.field public ۫:[Ll/᩹ۙ֡;

.field public ۬:[Ll/ۤܶ֡;

.field public ᩺:Ll/ۧ᩸֡;


# direct methods
.method public constructor <init>(Ll/ۗ᩶֡;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Ll/ۚۙ֡;-><init>(Ll/ۗ᩶֡;)V

    const/4 p1, 0x0

    .line 57
    iput-object p1, p0, Ll/ۗܶ֡;->᩺:Ll/ۧ᩸֡;

    return-void
.end method

.method private ᩻()Z
    .locals 1

    .line 516
    iget-object v0, p0, Ll/ۗܶ֡;->ۙ:Ll/ۤܶ֡;

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/ۗܶ֡;->۬:[Ll/ۤܶ֡;

    if-eqz v0, :cond_0

    array-length v0, v0

    if-nez v0, :cond_3

    :cond_0
    iget-object v0, p0, Ll/ۗܶ֡;->ۤ:[Ll/ۤܶ֡;

    if-eqz v0, :cond_1

    array-length v0, v0

    if-nez v0, :cond_3

    :cond_1
    iget-object v0, p0, Ll/ۗܶ֡;->ۨ:[Ll/ۛܶ֡;

    if-eqz v0, :cond_2

    array-length v0, v0

    if-nez v0, :cond_3

    :cond_2
    const/4 v0, 0x1

    return v0

    :cond_3
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 38
    check-cast p1, Ll/ۗܶ֡;

    invoke-virtual {p0, p1}, Ll/ۗܶ֡;->֫(Ll/ۗܶ֡;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 549
    const-class v2, Ll/ۗܶ֡;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 553
    :cond_1
    check-cast p1, Ll/ۗܶ֡;

    .line 554
    invoke-virtual {p0, p1}, Ll/ۗܶ֡;->֫(Ll/ۗܶ֡;)I

    move-result p1

    if-nez p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    .line 538
    invoke-direct {p0}, Ll/ۗܶ֡;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    .line 539
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0

    .line 541
    :cond_0
    iget-object v0, p0, Ll/ۗܶ֡;->ۙ:Ll/ۤܶ֡;

    invoke-virtual {v0}, Ll/ۤܶ֡;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֫(I)I
    .locals 3

    add-int/lit8 p1, p1, 0x10

    .line 293
    iget-object v0, p0, Ll/ۗܶ֡;->۬:[Ll/ۤܶ֡;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    array-length v0, v0

    .line 294
    :goto_0
    iget-object v2, p0, Ll/ۗܶ֡;->ۤ:[Ll/ۤܶ֡;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    array-length v2, v2

    :goto_1
    add-int/2addr v0, v2

    .line 295
    iget-object v2, p0, Ll/ۗܶ֡;->ۨ:[Ll/ۛܶ֡;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    array-length v1, v2

    :goto_2
    const/16 v2, 0x8

    invoke-static {v0, v1, v2, p1}, Ll/᩶ۢᩴ;->֫(IIII)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۗܶ֡;)I
    .locals 1

    .line 406
    invoke-direct {p0}, Ll/ۗܶ֡;->᩻()Z

    move-result v0

    if-nez v0, :cond_1

    .line 407
    invoke-direct {p1}, Ll/ۗܶ֡;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    .line 408
    iget-object v0, p0, Ll/ۗܶ֡;->᩺:Ll/ۧ᩸֡;

    iget-object p1, p1, Ll/ۗܶ֡;->᩺:Ll/ۧ᩸֡;

    .line 202
    iget v0, v0, Ll/ۚۙ֡;->᩶:I

    iget p1, p1, Ll/ۚۙ֡;->᩶:I

    sub-int/2addr v0, p1

    return v0

    :cond_0
    const/4 p1, -0x1

    return p1

    .line 413
    :cond_1
    invoke-direct {p1}, Ll/ۗܶ֡;->᩻()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 p1, 0x1

    return p1

    .line 417
    :cond_2
    iget-object v0, p0, Ll/ۗܶ֡;->ۙ:Ll/ۤܶ֡;

    iget-object p1, p1, Ll/ۗܶ֡;->ۙ:Ll/ۤܶ֡;

    invoke-virtual {v0, p1}, Ll/ۤܶ֡;->֫(Ll/ۤܶ֡;)I

    move-result p1

    return p1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 396
    iget-object v0, p0, Ll/ۗܶ֡;->᩺:Ll/ۧ᩸֡;

    const-string v1, "annotation_directory_item @0x"

    if-nez v0, :cond_0

    .line 397
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    iget v1, p0, Ll/ۚۙ֡;->᩶:I

    .line 0
    invoke-static {v0, v1}, Ll/ܰۗ;->֫(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 399
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    iget v1, p0, Ll/ۚۙ֡;->᩶:I

    .line 399
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۗܶ֡;->᩺:Ll/ۧ᩸֡;

    invoke-virtual {v1}, Ll/ۧ᩸֡;->᩷()Ll/᩺ۙ֡;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗ᩶֡;)Ll/ۗܶ֡;
    .locals 13

    .line 182
    iget-object v0, p0, Ll/ۗܶ֡;->ۗ:[Ll/ᩴۙ֡;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 183
    array-length v3, v0

    new-array v3, v3, [Ll/ᩴۙ֡;

    .line 184
    array-length v4, v0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v7, v0, v5

    add-int/lit8 v8, v6, 0x1

    .line 185
    invoke-virtual {v7, p1}, Ll/ᩴۙ֡;->֫(Ll/ۗ᩶֡;)Ll/ᩴۙ֡;

    move-result-object v7

    aput-object v7, v3, v6

    add-int/lit8 v5, v5, 0x1

    move v6, v8

    goto :goto_0

    :cond_0
    move-object v3, v2

    .line 188
    :cond_1
    iget-object v0, p0, Ll/ۗܶ֡;->۬:[Ll/ۤܶ֡;

    if-eqz v0, :cond_2

    .line 189
    array-length v4, v0

    new-array v4, v4, [Ll/ۤܶ֡;

    .line 191
    array-length v5, v0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_1
    if-ge v6, v5, :cond_3

    aget-object v8, v0, v6

    add-int/lit8 v9, v7, 0x1

    .line 192
    invoke-virtual {v8, p1}, Ll/ۤܶ֡;->֫(Ll/ۗ᩶֡;)Ll/ۤܶ֡;

    move-result-object v8

    aput-object v8, v4, v7

    add-int/lit8 v6, v6, 0x1

    move v7, v9

    goto :goto_1

    :cond_2
    move-object v4, v2

    .line 195
    :cond_3
    iget-object v0, p0, Ll/ۗܶ֡;->۫:[Ll/᩹ۙ֡;

    if-eqz v0, :cond_4

    .line 196
    array-length v5, v0

    new-array v5, v5, [Ll/᩹ۙ֡;

    .line 198
    array-length v6, v0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_2
    if-ge v7, v6, :cond_5

    aget-object v9, v0, v7

    add-int/lit8 v10, v8, 0x1

    .line 199
    invoke-virtual {v9, p1}, Ll/᩹ۙ֡;->֫(Ll/ۗ᩶֡;)Ll/᩹ۙ֡;

    move-result-object v9

    aput-object v9, v5, v8

    add-int/lit8 v7, v7, 0x1

    move v8, v10

    goto :goto_2

    :cond_4
    move-object v5, v2

    .line 202
    :cond_5
    iget-object v0, p0, Ll/ۗܶ֡;->ۤ:[Ll/ۤܶ֡;

    if-eqz v0, :cond_6

    .line 203
    array-length v6, v0

    new-array v6, v6, [Ll/ۤܶ֡;

    .line 205
    array-length v7, v0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_3
    if-ge v8, v7, :cond_7

    aget-object v10, v0, v8

    add-int/lit8 v11, v9, 0x1

    .line 206
    invoke-virtual {v10, p1}, Ll/ۤܶ֡;->֫(Ll/ۗ᩶֡;)Ll/ۤܶ֡;

    move-result-object v10

    aput-object v10, v6, v9

    add-int/lit8 v8, v8, 0x1

    move v9, v11

    goto :goto_3

    :cond_6
    move-object v6, v2

    .line 210
    :cond_7
    iget-object v0, p0, Ll/ۗܶ֡;->ۛ:[Ll/᩹ۙ֡;

    if-eqz v0, :cond_8

    .line 211
    array-length v7, v0

    new-array v7, v7, [Ll/᩹ۙ֡;

    .line 213
    array-length v8, v0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_4
    if-ge v9, v8, :cond_9

    aget-object v11, v0, v9

    add-int/lit8 v12, v10, 0x1

    .line 214
    invoke-virtual {v11, p1}, Ll/᩹ۙ֡;->֫(Ll/ۗ᩶֡;)Ll/᩹ۙ֡;

    move-result-object v11

    aput-object v11, v7, v10

    add-int/lit8 v9, v9, 0x1

    move v10, v12

    goto :goto_4

    :cond_8
    move-object v7, v2

    .line 217
    :cond_9
    iget-object v0, p0, Ll/ۗܶ֡;->ۨ:[Ll/ۛܶ֡;

    if-eqz v0, :cond_a

    .line 218
    array-length v8, v0

    new-array v8, v8, [Ll/ۛܶ֡;

    .line 220
    array-length v9, v0

    const/4 v10, 0x0

    :goto_5
    if-ge v1, v9, :cond_b

    aget-object v11, v0, v1

    add-int/lit8 v12, v10, 0x1

    .line 221
    invoke-virtual {v11, p1}, Ll/ۛܶ֡;->֫(Ll/ۗ᩶֡;)Ll/ۛܶ֡;

    move-result-object v11

    aput-object v11, v8, v10

    add-int/lit8 v1, v1, 0x1

    move v10, v12

    goto :goto_5

    :cond_a
    move-object v8, v2

    .line 225
    :cond_b
    new-instance v0, Ll/ۗܶ֡;

    .line 227
    iget-object v1, p0, Ll/ۗܶ֡;->ۙ:Ll/ۤܶ֡;

    if-nez v1, :cond_c

    move-object v1, v2

    goto :goto_6

    :cond_c
    invoke-virtual {v1, p1}, Ll/ۤܶ֡;->֫(Ll/ۗ᩶֡;)Ll/ۤܶ֡;

    move-result-object v1

    .line 91
    :goto_6
    invoke-direct {v0, p1}, Ll/ۚۙ֡;-><init>(Ll/ۗ᩶֡;)V

    .line 57
    iput-object v2, v0, Ll/ۗܶ֡;->᩺:Ll/ۧ᩸֡;

    .line 92
    iput-object v1, v0, Ll/ۗܶ֡;->ۙ:Ll/ۤܶ֡;

    .line 93
    iput-object v3, v0, Ll/ۗܶ֡;->ۗ:[Ll/ᩴۙ֡;

    .line 94
    iput-object v4, v0, Ll/ۗܶ֡;->۬:[Ll/ۤܶ֡;

    .line 95
    iput-object v5, v0, Ll/ۗܶ֡;->۫:[Ll/᩹ۙ֡;

    .line 96
    iput-object v6, v0, Ll/ۗܶ֡;->ۤ:[Ll/ۤܶ֡;

    .line 97
    iput-object v7, v0, Ll/ۗܶ֡;->ۛ:[Ll/᩹ۙ֡;

    .line 98
    iput-object v8, v0, Ll/ۗܶ֡;->ۨ:[Ll/ۛܶ֡;

    .line 235
    iget-object p1, p1, Ll/ۗ᩶֡;->֫:Ll/ۗۙ֡;

    invoke-virtual {p1, v0}, Ll/ۤۙ֡;->֫(Ll/ۚۙ֡;)Ll/ۚۙ֡;

    move-result-object p1

    check-cast p1, Ll/ۗܶ֡;

    return-object p1
.end method

.method public final ֫(Ll/֫ۗ֡;)V
    .locals 3

    .line 358
    iget-object v0, p0, Ll/ۗܶ֡;->ۙ:Ll/ۤܶ֡;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 202
    :cond_0
    iget v0, v0, Ll/ۚۙ֡;->᩶:I

    .line 358
    :goto_0
    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ܽ(I)V

    .line 359
    iget-object v0, p0, Ll/ۗܶ֡;->۬:[Ll/ۤܶ֡;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    array-length v0, v0

    :goto_1
    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ܽ(I)V

    .line 360
    iget-object v0, p0, Ll/ۗܶ֡;->ۤ:[Ll/ۤܶ֡;

    if-nez v0, :cond_2

    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    array-length v0, v0

    :goto_2
    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ܽ(I)V

    .line 361
    iget-object v0, p0, Ll/ۗܶ֡;->ۨ:[Ll/ۛܶ֡;

    if-nez v0, :cond_3

    const/4 v0, 0x0

    goto :goto_3

    :cond_3
    array-length v0, v0

    :goto_3
    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ܽ(I)V

    .line 363
    iget-object v0, p0, Ll/ۗܶ֡;->۬:[Ll/ۤܶ֡;

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    .line 364
    :goto_4
    iget-object v2, p0, Ll/ۗܶ֡;->۬:[Ll/ۤܶ֡;

    array-length v2, v2

    if-ge v0, v2, :cond_4

    .line 365
    iget-object v2, p0, Ll/ۗܶ֡;->ۗ:[Ll/ᩴۙ֡;

    aget-object v2, v2, v0

    .line 209
    iget v2, v2, Ll/ۚۙ֡;->᩹:I

    .line 365
    invoke-virtual {p1, v2}, Ll/֫ۗ֡;->ܽ(I)V

    .line 366
    iget-object v2, p0, Ll/ۗܶ֡;->۬:[Ll/ۤܶ֡;

    aget-object v2, v2, v0

    .line 202
    iget v2, v2, Ll/ۚۙ֡;->᩶:I

    .line 366
    invoke-virtual {p1, v2}, Ll/֫ۗ֡;->ܽ(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 370
    :cond_4
    iget-object v0, p0, Ll/ۗܶ֡;->ۤ:[Ll/ۤܶ֡;

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    .line 371
    :goto_5
    iget-object v2, p0, Ll/ۗܶ֡;->ۤ:[Ll/ۤܶ֡;

    array-length v2, v2

    if-ge v0, v2, :cond_5

    .line 372
    iget-object v2, p0, Ll/ۗܶ֡;->۫:[Ll/᩹ۙ֡;

    aget-object v2, v2, v0

    .line 209
    iget v2, v2, Ll/ۚۙ֡;->᩹:I

    .line 372
    invoke-virtual {p1, v2}, Ll/֫ۗ֡;->ܽ(I)V

    .line 373
    iget-object v2, p0, Ll/ۗܶ֡;->ۤ:[Ll/ۤܶ֡;

    aget-object v2, v2, v0

    .line 202
    iget v2, v2, Ll/ۚۙ֡;->᩶:I

    .line 373
    invoke-virtual {p1, v2}, Ll/֫ۗ֡;->ܽ(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    .line 377
    :cond_5
    iget-object v0, p0, Ll/ۗܶ֡;->ۨ:[Ll/ۛܶ֡;

    if-eqz v0, :cond_6

    .line 378
    :goto_6
    iget-object v0, p0, Ll/ۗܶ֡;->ۨ:[Ll/ۛܶ֡;

    array-length v0, v0

    if-ge v1, v0, :cond_6

    .line 379
    iget-object v0, p0, Ll/ۗܶ֡;->ۛ:[Ll/᩹ۙ֡;

    aget-object v0, v0, v1

    .line 209
    iget v0, v0, Ll/ۚۙ֡;->᩹:I

    .line 379
    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ܽ(I)V

    .line 380
    iget-object v0, p0, Ll/ۗܶ֡;->ۨ:[Ll/ۛܶ֡;

    aget-object v0, v0, v1

    .line 202
    iget v0, v0, Ll/ۚۙ֡;->᩶:I

    .line 380
    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ܽ(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_6
    return-void
.end method

.method public final ֫(Ll/ۧۗ֡;Ll/۫ۙ֡;)V
    .locals 6

    .line 243
    sget-object v0, Ll/ܶۙ֡;->ۤ:Ll/ܶۙ֡;

    .line 244
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v1

    .line 243
    invoke-virtual {p2, v0, v1}, Ll/۫ۙ֡;->ۧ(Ll/ܶۙ֡;I)Ll/ۚۙ֡;

    move-result-object v0

    check-cast v0, Ll/ۤܶ֡;

    iput-object v0, p0, Ll/ۗܶ֡;->ۙ:Ll/ۤܶ֡;

    .line 245
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v0

    new-array v1, v0, [Ll/ᩴۙ֡;

    iput-object v1, p0, Ll/ۗܶ֡;->ۗ:[Ll/ᩴۙ֡;

    .line 246
    new-array v0, v0, [Ll/ۤܶ֡;

    iput-object v0, p0, Ll/ۗܶ֡;->۬:[Ll/ۤܶ֡;

    .line 248
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v0

    new-array v1, v0, [Ll/᩹ۙ֡;

    iput-object v1, p0, Ll/ۗܶ֡;->۫:[Ll/᩹ۙ֡;

    .line 249
    new-array v0, v0, [Ll/ۤܶ֡;

    iput-object v0, p0, Ll/ۗܶ֡;->ۤ:[Ll/ۤܶ֡;

    .line 251
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v0

    new-array v1, v0, [Ll/᩹ۙ֡;

    iput-object v1, p0, Ll/ۗܶ֡;->ۛ:[Ll/᩹ۙ֡;

    .line 252
    new-array v0, v0, [Ll/ۛܶ֡;

    iput-object v0, p0, Ll/ۗܶ֡;->ۨ:[Ll/ۛܶ֡;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 254
    :goto_0
    iget-object v2, p0, Ll/ۗܶ֡;->۬:[Ll/ۤܶ֡;

    array-length v2, v2

    iget-object v3, p0, Ll/ۚۙ֡;->᩸:Ll/ۗ᩶֡;

    if-ge v1, v2, :cond_0

    .line 256
    :try_start_0
    iget-object v2, p0, Ll/ۗܶ֡;->ۗ:[Ll/ᩴۙ֡;

    iget-object v3, v3, Ll/ۗ᩶֡;->ۢ:Ll/֡ۙ֡;

    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v4

    invoke-virtual {v3, v4}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object v3

    check-cast v3, Ll/ᩴۙ֡;

    aput-object v3, v2, v1

    .line 257
    iget-object v2, p0, Ll/ۗܶ֡;->۬:[Ll/ۤܶ֡;

    sget-object v3, Ll/ܶۙ֡;->ۤ:Ll/ܶۙ֡;

    .line 258
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v4

    .line 257
    invoke-virtual {p2, v3, v4}, Ll/۫ۙ֡;->֫(Ll/ܶۙ֡;I)Ll/ۚۙ֡;

    move-result-object v3

    check-cast v3, Ll/ۤܶ֡;

    aput-object v3, v2, v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 260
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Error occured while reading FieldAnnotation at index "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Ll/ܽۗ֡;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ll/ܽۗ֡;

    move-result-object p1

    throw p1

    :cond_0
    const/4 v1, 0x0

    .line 265
    :goto_1
    iget-object v2, p0, Ll/ۗܶ֡;->ۤ:[Ll/ۤܶ֡;

    array-length v2, v2

    if-ge v1, v2, :cond_1

    .line 267
    :try_start_1
    iget-object v2, p0, Ll/ۗܶ֡;->۫:[Ll/᩹ۙ֡;

    iget-object v4, v3, Ll/ۗ᩶֡;->ۖ:Ll/֡ۙ֡;

    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v5

    invoke-virtual {v4, v5}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object v4

    check-cast v4, Ll/᩹ۙ֡;

    aput-object v4, v2, v1

    .line 268
    iget-object v2, p0, Ll/ۗܶ֡;->ۤ:[Ll/ۤܶ֡;

    sget-object v4, Ll/ܶۙ֡;->ۤ:Ll/ܶۙ֡;

    .line 269
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v5

    .line 268
    invoke-virtual {p2, v4, v5}, Ll/۫ۙ֡;->֫(Ll/ܶۙ֡;I)Ll/ۚۙ֡;

    move-result-object v4

    check-cast v4, Ll/ۤܶ֡;

    aput-object v4, v2, v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 271
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Error occured while reading MethodAnnotation at index "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Ll/ܽۗ֡;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ll/ܽۗ֡;

    move-result-object p1

    throw p1

    .line 276
    :cond_1
    :goto_2
    iget-object v1, p0, Ll/ۗܶ֡;->ۨ:[Ll/ۛܶ֡;

    array-length v1, v1

    if-ge v0, v1, :cond_2

    .line 278
    :try_start_2
    iget-object v1, p0, Ll/ۗܶ֡;->ۛ:[Ll/᩹ۙ֡;

    iget-object v2, v3, Ll/ۗ᩶֡;->ۖ:Ll/֡ۙ֡;

    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v4

    invoke-virtual {v2, v4}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object v2

    check-cast v2, Ll/᩹ۙ֡;

    aput-object v2, v1, v0

    .line 279
    iget-object v1, p0, Ll/ۗܶ֡;->ۨ:[Ll/ۛܶ֡;

    sget-object v2, Ll/ܶۙ֡;->ۛ:Ll/ܶۙ֡;

    .line 280
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v4

    .line 279
    invoke-virtual {p2, v2, v4}, Ll/۫ۙ֡;->֫(Ll/ܶۙ֡;I)Ll/ۚۙ֡;

    move-result-object v2

    check-cast v2, Ll/ۛܶ֡;

    aput-object v2, v1, v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :catch_2
    move-exception p1

    .line 282
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Error occured while reading ParameterAnnotation at index "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Ll/ܽۗ֡;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ll/ܽۗ֡;

    move-result-object p1

    throw p1

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ۧ᩸֡;)V
    .locals 0

    .line 531
    iput-object p1, p0, Ll/ۗܶ֡;->᩺:Ll/ۧ᩸֡;

    return-void
.end method
