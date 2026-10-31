.class public final Ll/ۜ۫ۢ;
.super Ljava/lang/Object;
.source "C6PQ"


# instance fields
.field public ֫:[Ll/᩹ܳ֡;

.field public ۧ:[I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 262
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v1, v0, [Ll/᩹ܳ֡;

    .line 263
    iput-object v1, p0, Ll/ۜ۫ۢ;->֫:[Ll/᩹ܳ֡;

    new-array v0, v0, [I

    .line 264
    iput-object v0, p0, Ll/ۜ۫ۢ;->ۧ:[I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬ܳ֡;)I
    .locals 12

    .line 328
    iget-object p1, p1, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x8

    if-gt v0, v1, :cond_0

    const/16 v1, 0x10

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v0, -0x1

    .line 269
    invoke-static {v1}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v1

    shl-int/lit8 v1, v1, 0x2

    .line 270
    :goto_0
    iget-object v2, p0, Ll/ۜ۫ۢ;->֫:[Ll/᩹ܳ֡;

    array-length v2, v2

    if-le v1, v2, :cond_1

    .line 271
    new-array v2, v1, [Ll/᩹ܳ֡;

    iput-object v2, p0, Ll/ۜ۫ۢ;->֫:[Ll/᩹ܳ֡;

    .line 272
    new-array v2, v1, [I

    iput-object v2, p0, Ll/ۜ۫ۢ;->ۧ:[I

    :cond_1
    add-int/lit8 v2, v1, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    const/4 v5, 0x0

    if-ge v4, v0, :cond_4

    .line 270
    :try_start_0
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩹ܳ֡;

    .line 279
    iget-object v7, v6, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget v8, v6, Ll/᩹ܳ֡;->֫:I

    iget v7, v7, Ll/᩺ܳ֡;->ܿ:I

    mul-int/lit8 v7, v7, 0x1f

    iget-object v9, v6, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    .line 97
    iget v9, v9, Ll/ܽۜ֡;->֫:I

    add-int/2addr v7, v9

    ushr-int/lit8 v9, v7, 0x10

    xor-int/2addr v7, v9

    :goto_2
    and-int/2addr v7, v2

    .line 282
    iget-object v9, p0, Ll/ۜ۫ۢ;->֫:[Ll/᩹ܳ֡;

    aget-object v10, v9, v7

    if-nez v10, :cond_2

    .line 284
    aput-object v6, v9, v7

    .line 285
    iget-object v6, p0, Ll/ۜ۫ۢ;->ۧ:[I

    aput v8, v6, v7

    goto :goto_3

    .line 288
    :cond_2
    iget-object v9, v10, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget v9, v9, Ll/᩺ܳ֡;->ܿ:I

    iget-object v11, v6, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget v11, v11, Ll/᩺ܳ֡;->ܿ:I

    if-ne v9, v11, :cond_3

    iget-object v9, v10, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    iget-object v10, v6, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    .line 289
    invoke-virtual {v9, v10}, Ll/ܽۜ֡;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 290
    iget-object v6, p0, Ll/ۜ۫ۢ;->ۧ:[I

    aget v9, v6, v7

    invoke-static {v9, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    aput v8, v6, v7

    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_6

    :cond_4
    const/4 p1, 0x0

    const/4 v0, 0x0

    :goto_4
    if-ge p1, v1, :cond_8

    .line 298
    iget-object v2, p0, Ll/ۜ۫ۢ;->֫:[Ll/᩹ܳ֡;

    aget-object v4, v2, p1

    if-nez v4, :cond_5

    goto :goto_5

    :cond_5
    if-nez v0, :cond_6

    .line 299
    iget-object v0, p0, Ll/ۜ۫ۢ;->ۧ:[I

    aget v0, v0, p1

    goto :goto_5

    .line 300
    :cond_6
    iget-object v4, p0, Ll/ۜ۫ۢ;->ۧ:[I

    aget v4, v4, p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v0, v4, :cond_7

    .line 305
    invoke-static {v2, v3, v1, v5}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    return v3

    :cond_7
    :goto_5
    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    :goto_6
    iget-object v0, p0, Ll/ۜ۫ۢ;->֫:[Ll/᩹ܳ֡;

    invoke-static {v0, v3, v1, v5}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 306
    throw p1

    .line 305
    :cond_8
    iget-object p1, p0, Ll/ۜ۫ۢ;->֫:[Ll/᩹ܳ֡;

    invoke-static {p1, v3, v1, v5}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    return v0
.end method
