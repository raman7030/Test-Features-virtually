.class public final Ll/ܶۜ֡;
.super Ljava/lang/Object;
.source "B6N7"


# instance fields
.field public ֫:[Ll/᩹ܳ֡;

.field public ۧ:[Z

.field public ܽ:[Ll/᩹ܳ֡;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v1, v0, [Ll/᩹ܳ֡;

    .line 7
    iput-object v1, p0, Ll/ܶۜ֡;->ܽ:[Ll/᩹ܳ֡;

    new-array v1, v0, [Z

    .line 8
    iput-object v1, p0, Ll/ܶۜ֡;->ۧ:[Z

    new-array v0, v0, [Ll/᩹ܳ֡;

    .line 9
    iput-object v0, p0, Ll/ܶۜ֡;->֫:[Ll/᩹ܳ֡;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻ۜ֡;Ll/۬ܳ֡;)Z
    .locals 13

    .line 13
    iget-object v0, p2, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-static {p2}, Ll/᩻ۜ֡;->֫(Ll/۬ܳ֡;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    return v2

    .line 14
    :cond_0
    sget-object v1, Ll/᩻ۜ֡;->ۙ:Ll/᩻ۜ֡;

    if-ne p1, v1, :cond_1

    iget-boolean v1, p2, Ll/۬ܳ֡;->ۤ:Z

    if-eqz v1, :cond_1

    .line 16
    invoke-static {p1, p2}, Ll/᩻ۜ֡;->֫(Ll/᩻ۜ֡;Ll/۬ܳ֡;)Z

    move-result p1

    return p1

    .line 328
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/16 p2, 0x8

    if-gt p1, p2, :cond_2

    const/16 p2, 0x10

    goto :goto_0

    :cond_2
    add-int/lit8 p2, p1, -0x1

    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result p2

    shl-int/lit8 p2, p2, 0x2

    .line 20
    :goto_0
    iget-object v1, p0, Ll/ܶۜ֡;->ܽ:[Ll/᩹ܳ֡;

    array-length v1, v1

    if-le p2, v1, :cond_3

    .line 21
    new-array v1, p2, [Ll/᩹ܳ֡;

    iput-object v1, p0, Ll/ܶۜ֡;->ܽ:[Ll/᩹ܳ֡;

    .line 22
    new-array v1, p2, [Z

    iput-object v1, p0, Ll/ܶۜ֡;->ۧ:[Z

    :cond_3
    add-int/lit8 v1, p2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_1
    const/4 v6, 0x0

    if-ge v4, p1, :cond_7

    .line 270
    :try_start_0
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩹ܳ֡;

    .line 29
    iget-object v8, v7, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget v8, v8, Ll/᩺ܳ֡;->ܿ:I

    ushr-int/lit8 v9, v8, 0x10

    xor-int/2addr v9, v8

    :goto_2
    and-int/2addr v9, v1

    .line 31
    iget-object v10, p0, Ll/ܶۜ֡;->ܽ:[Ll/᩹ܳ֡;

    aget-object v11, v10, v9

    if-eqz v11, :cond_4

    iget-object v12, v11, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget v12, v12, Ll/᩺ܳ֡;->ܿ:I

    if-eq v12, v8, :cond_4

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_4
    if-nez v11, :cond_5

    .line 35
    aput-object v7, v10, v9

    .line 36
    iget-object v7, p0, Ll/ܶۜ֡;->ۧ:[Z

    aput-boolean v3, v7, v9

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 38
    :cond_5
    iget-object v8, p0, Ll/ܶۜ֡;->ۧ:[Z

    aget-boolean v10, v8, v9

    if-nez v10, :cond_6

    iget v10, v11, Ll/᩹ܳ֡;->֫:I

    iget v7, v7, Ll/᩹ܳ֡;->֫:I

    if-eq v10, v7, :cond_6

    .line 39
    aput-boolean v2, v8, v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v5, v5, -0x1

    :cond_6
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    :cond_7
    if-eqz v5, :cond_8

    .line 68
    iget-object p1, p0, Ll/ܶۜ֡;->ܽ:[Ll/᩹ܳ֡;

    invoke-static {p1, v3, p2, v6}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 69
    iget-object p1, p0, Ll/ܶۜ֡;->֫:[Ll/᩹ܳ֡;

    array-length v0, p1

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {p1, v3, p2, v6}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    return v3

    .line 45
    :cond_8
    :try_start_1
    iget-object v4, p0, Ll/ܶۜ֡;->֫:[Ll/᩹ܳ֡;

    array-length v4, v4

    if-le p2, v4, :cond_9

    new-array v4, p2, [Ll/᩹ܳ֡;

    iput-object v4, p0, Ll/ܶۜ֡;->֫:[Ll/᩹ܳ֡;

    :cond_9
    const/4 v4, 0x0

    :goto_4
    if-ge v4, p1, :cond_d

    .line 270
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩹ܳ֡;

    .line 48
    iget-object v7, v5, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget v7, v7, Ll/᩺ܳ֡;->ܿ:I

    mul-int/lit8 v7, v7, 0x1f

    iget-object v8, v5, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    .line 97
    iget v8, v8, Ll/ܽۜ֡;->֫:I

    add-int/2addr v7, v8

    ushr-int/lit8 v8, v7, 0x10

    xor-int/2addr v7, v8

    :goto_5
    and-int/2addr v7, v1

    .line 51
    iget-object v8, p0, Ll/ܶۜ֡;->֫:[Ll/᩹ܳ֡;

    aget-object v9, v8, v7

    if-nez v9, :cond_a

    .line 53
    aput-object v5, v8, v7

    goto :goto_6

    .line 56
    :cond_a
    iget-object v8, v9, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget v8, v8, Ll/᩺ܳ֡;->ܿ:I

    iget-object v10, v5, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget v10, v10, Ll/᩺ܳ֡;->ܿ:I

    if-ne v8, v10, :cond_c

    iget-object v8, v9, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    iget-object v10, v5, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    .line 57
    invoke-virtual {v8, v10}, Ll/ܽۜ֡;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_c

    .line 59
    iget v7, v9, Ll/᩹ܳ֡;->֫:I

    iget v5, v5, Ll/᩹ܳ֡;->֫:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eq v7, v5, :cond_b

    .line 68
    iget-object p1, p0, Ll/ܶۜ֡;->ܽ:[Ll/᩹ܳ֡;

    invoke-static {p1, v3, p2, v6}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 69
    iget-object p1, p0, Ll/ܶۜ֡;->֫:[Ll/᩹ܳ֡;

    array-length v0, p1

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {p1, v3, p2, v6}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    return v2

    :cond_b
    :goto_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_c
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    .line 68
    :cond_d
    iget-object p1, p0, Ll/ܶۜ֡;->ܽ:[Ll/᩹ܳ֡;

    invoke-static {p1, v3, p2, v6}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 69
    iget-object p1, p0, Ll/ܶۜ֡;->֫:[Ll/᩹ܳ֡;

    array-length v0, p1

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {p1, v3, p2, v6}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    return v3

    .line 68
    :goto_7
    iget-object v0, p0, Ll/ܶۜ֡;->ܽ:[Ll/᩹ܳ֡;

    invoke-static {v0, v3, p2, v6}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 69
    iget-object v0, p0, Ll/ܶۜ֡;->֫:[Ll/᩹ܳ֡;

    array-length v1, v0

    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {v0, v3, p2, v6}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 70
    throw p1
.end method
