.class public final Ll/ۡ۫ۢ;
.super Ll/᩺᩻֡;
.source "C6PQ"


# instance fields
.field public ֡:I

.field public final ۖ:Ll/᩻۫ۢ;

.field public ۘ:Ll/ۜ۫ۢ;

.field public ۚ:I

.field public ᩴ:Ll/ܶۜ֡;

.field public ᩵:I


# direct methods
.method public constructor <init>(Ll/ۗ۬ۢ;Ll/᩻۫ۢ;)V
    .locals 2

    .line 55
    invoke-virtual {p1}, Ll/ᩴܳ֡;->ܽ()Ll/᩸ܳ֡;

    move-result-object v0

    iget-object v1, p2, Ll/᩻۫ۢ;->ܿ:[Ll/ۛۜ֡;

    invoke-direct {p0, p1, v0, v1, p2}, Ll/᩺᩻֡;-><init>(Ll/ۢܳ֡;Ll/᩸ܳ֡;[Ll/ۛۜ֡;Ll/ᩳۜ֡;)V

    .line 56
    iput-object p2, p0, Ll/ۡ۫ۢ;->ۖ:Ll/᩻۫ۢ;

    return-void
.end method

.method private ֫(Ll/۬ܳ֡;Ljava/util/HashSet;Z)V
    .locals 2

    .line 236
    iget v0, p0, Ll/ۡ۫ۢ;->ۚ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۡ۫ۢ;->ۚ:I

    and-int/lit16 v0, v0, 0xff

    if-nez v0, :cond_0

    invoke-static {}, Ll/ᩴ۫ۢ;->ܽ()V

    :cond_0
    const/16 v0, 0x1000

    if-nez p3, :cond_2

    .line 237
    iget v1, p0, Ll/ۡ۫ۢ;->ۚ:I

    if-gt v1, v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Ll/᩷۫ۢ;->᩸:Ll/᩷۫ۢ;

    throw p1

    :cond_2
    :goto_0
    if-eqz p3, :cond_4

    .line 239
    iget p3, p0, Ll/ۡ۫ۢ;->֡:I

    add-int/lit8 p3, p3, 0x1

    iput p3, p0, Ll/ۡ۫ۢ;->֡:I

    const/high16 v1, 0x10000

    if-gt p3, v1, :cond_3

    .line 328
    iget-object p1, p1, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge p1, v0, :cond_3

    .line 240
    invoke-virtual {p2}, Ljava/util/HashSet;->size()I

    move-result p1

    if-ge p1, v0, :cond_3

    goto :goto_1

    .line 241
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Parser prediction exceeds formatter limit"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    return-void
.end method

.method private ܽ(ILl/֫ܳ֡;Ll/ۡܳ֡;)I
    .locals 10

    .line 113
    invoke-interface {p2}, Ll/ܳܳ֡;->index()I

    move-result v0

    iput v0, p0, Ll/ۡ۫ۢ;->᩵:I

    const/4 v0, 0x0

    .line 114
    iput v0, p0, Ll/ۡ۫ۢ;->֡:I

    iput v0, p0, Ll/ۡ۫ۢ;->ۚ:I

    .line 115
    iget-object v1, p0, Ll/ۡ۫ۢ;->ۖ:Ll/᩻۫ۢ;

    iget-object v1, v1, Ll/᩻۫ۢ;->ۜ:[Z

    aget-boolean v1, v1, p1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    .line 117
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ll/᩺᩻֡;->֫(ILl/֫ܳ֡;Ll/ۡܳ֡;)I

    move-result p1
    :try_end_0
    .catch Ll/᩷۫ۢ; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    .line 120
    :catch_0
    iget-object v1, p0, Ll/᩺᩻֡;->ۜ:[Ll/ۛۜ֡;

    aget-object v1, v1, p1

    iget-object v1, v1, Ll/ۛۜ֡;->ᩳ:Ll/ܰۜ֡;

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/ۡ۫ۢ;->ۖ:Ll/᩻۫ۢ;

    iget-object v1, v1, Ll/᩻۫ۢ;->ۜ:[Z

    aput-boolean v2, v1, p1

    .line 124
    :cond_0
    invoke-interface {p2}, Ll/ܳܳ֡;->֫()I

    move-result v1

    .line 125
    iput-object p2, p0, Ll/᩺᩻֡;->ܿ:Ll/֫ܳ֡;

    .line 126
    iget v3, p0, Ll/ۡ۫ۢ;->᩵:I

    iput v3, p0, Ll/᩺᩻֡;->᩻:I

    .line 127
    iput-object p3, p0, Ll/᩺᩻֡;->ܳ:Ll/ۡܳ֡;

    .line 128
    iput v0, p0, Ll/ۡ۫ۢ;->֡:I

    iput v0, p0, Ll/ۡ۫ۢ;->ۚ:I

    .line 129
    iget-object v0, p0, Ll/᩺᩻֡;->ۜ:[Ll/ۛۜ֡;

    aget-object v4, v0, p1

    const/4 p1, 0x0

    .line 131
    :try_start_1
    iget-object v0, v4, Ll/ۛۜ֡;->֫:Ll/ۜ᩻֡;

    invoke-virtual {p0, v0, p3, v2}, Ll/᩺᩻֡;->֫(Ll/᩺ܳ֡;Ll/ۡܳ֡;Z)Ll/۬ܳ֡;

    move-result-object v6

    .line 132
    iget v8, p0, Ll/ۡ۫ۢ;->᩵:I

    const/4 v5, 0x0

    move-object v3, p0

    move-object v7, p2

    move-object v9, p3

    invoke-virtual/range {v3 .. v9}, Ll/ۡ۫ۢ;->֫(Ll/ۛۜ֡;Ll/ܰۜ֡;Ll/۬ܳ֡;Ll/֫ܳ֡;ILl/ۡܳ֡;)I

    move-result p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    iget v0, p0, Ll/ۡ۫ۢ;->᩵:I

    invoke-interface {p2, v0}, Ll/ܳܳ֡;->֫(I)V

    .line 135
    invoke-interface {p2, v1}, Ll/ܳܳ֡;->ܽ(I)V

    .line 136
    iput-object p1, p0, Ll/᩺᩻֡;->᩷:Ll/ۧ᩷֡;

    return p3

    :catchall_0
    move-exception p3

    .line 134
    iget v0, p0, Ll/ۡ۫ۢ;->᩵:I

    invoke-interface {p2, v0}, Ll/ܳܳ֡;->֫(I)V

    .line 135
    invoke-interface {p2, v1}, Ll/ܳܳ֡;->ܽ(I)V

    .line 136
    iput-object p1, p0, Ll/᩺᩻֡;->᩷:Ll/ۧ᩷֡;

    .line 137
    throw p3
.end method


# virtual methods
.method public final ֫(ILl/֫ܳ֡;Ll/ۡܳ֡;)I
    .locals 5

    .line 75
    invoke-static {}, Ll/ᩴ۫ۢ;->ܽ()V

    .line 76
    iget-object v0, p0, Ll/ۡ۫ۢ;->ۖ:Ll/᩻۫ۢ;

    iget v1, v0, Ll/᩻۫ۢ;->ܽ:I

    iget-object v2, p0, Ll/᩺᩻֡;->ۡ:Ll/ۢܳ֡;

    const/4 v3, 0x1

    if-ne p1, v1, :cond_0

    instance-of v1, p3, Ll/۫ۙۢ;

    if-eqz v1, :cond_0

    move-object v1, v2

    check-cast v1, Ll/ۗ۬ۢ;

    .line 77
    invoke-virtual {v1}, Ll/ۗ۬ۢ;->ܰ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 78
    :cond_0
    iget v1, v0, Ll/᩻۫ۢ;->ܳ:I

    if-ne p1, v1, :cond_2

    instance-of v1, p3, Ll/ܳۗۢ;

    if-eqz v1, :cond_2

    .line 80
    invoke-interface {p2, v3}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v1

    const/16 v4, 0x5d

    if-ne v1, v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, -0x1

    if-eq v1, v4, :cond_2

    .line 82
    move-object v1, v2

    check-cast v1, Ll/ۗ۬ۢ;

    invoke-virtual {v1}, Ll/ۗ۬ۢ;->۫()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 p1, 0x3

    return p1

    .line 84
    :cond_2
    iget v1, v0, Ll/᩻۫ۢ;->᩷:I

    if-ne p1, v1, :cond_3

    instance-of v1, p3, Ll/ۢۗۢ;

    if-eqz v1, :cond_3

    .line 85
    invoke-interface {p2, v3}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v1

    const/16 v4, 0x5b

    if-ne v1, v4, :cond_3

    :goto_0
    return v3

    .line 86
    :cond_3
    iget v1, v0, Ll/᩻۫ۢ;->ۢ:I

    if-ne p1, v1, :cond_4

    instance-of v1, p3, Ll/۠ۗۢ;

    if-eqz v1, :cond_4

    .line 87
    move-object v1, v2

    check-cast v1, Ll/ۗ۬ۢ;

    invoke-virtual {v1}, Ll/ۗ۬ۢ;->۬()I

    move-result v1

    if-eqz v1, :cond_4

    return v1

    .line 90
    :cond_4
    iget-object v1, v0, Ll/᩻۫ۢ;->ܺ:Ll/ۢ۫ۢ;

    if-eqz v1, :cond_5

    .line 91
    iget v4, v1, Ll/ۢ۫ۢ;->ۧ:I

    if-ne p1, v4, :cond_5

    instance-of v4, p3, Ll/֫۬ۢ;

    if-eqz v4, :cond_5

    .line 92
    move-object v4, v2

    check-cast v4, Ll/ۗ۬ۢ;

    invoke-virtual {v4}, Ll/ۗ۬ۢ;->۟()I

    move-result v4

    if-ltz v4, :cond_5

    .line 93
    iget-object v1, v1, Ll/ۢ۫ۢ;->֫:[I

    aget v1, v1, v4

    if-eqz v1, :cond_5

    return v1

    .line 96
    :cond_5
    iget v1, v0, Ll/᩻۫ۢ;->ۡ:I

    if-ne p1, v1, :cond_6

    instance-of v1, p3, Ll/ܶۗۢ;

    if-eqz v1, :cond_6

    .line 115
    iget-object v1, p3, Ll/᩵ܳ֡;->ۧ:Ll/ۡܳ֡;

    .line 97
    instance-of v1, v1, Ll/ᩳۗۢ;

    if-nez v1, :cond_6

    .line 98
    check-cast v2, Ll/ۗ۬ۢ;

    invoke-virtual {v2}, Ll/ۗ۬ۢ;->ۤ()I

    move-result v1

    if-eqz v1, :cond_6

    return v1

    .line 101
    :cond_6
    iget v1, v0, Ll/᩻۫ۢ;->ۧ:I

    if-nez v1, :cond_8

    iget v1, v0, Ll/᩻۫ۢ;->ᩳ:I

    const/high16 v2, 0x10000

    if-ge v1, v2, :cond_7

    invoke-virtual {v0}, Ll/ᩳۜ֡;->֫()I

    move-result v1

    if-lt v1, v2, :cond_8

    .line 102
    :cond_7
    invoke-virtual {v0}, Ll/᩻۫ۢ;->ۧ()V

    .line 104
    :cond_8
    iget v1, v0, Ll/᩻۫ۢ;->ۧ:I

    add-int/2addr v1, v3

    iput v1, v0, Ll/᩻۫ۢ;->ۧ:I

    .line 106
    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Ll/ۡ۫ۢ;->ܽ(ILl/֫ܳ֡;Ll/ۡܳ֡;)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    iget p2, v0, Ll/᩻۫ۢ;->ۧ:I

    sub-int/2addr p2, v3

    iput p2, v0, Ll/᩻۫ۢ;->ۧ:I

    return p1

    :catchall_0
    move-exception p1

    iget p2, v0, Ll/᩻۫ۢ;->ۧ:I

    sub-int/2addr p2, v3

    iput p2, v0, Ll/᩻۫ۢ;->ۧ:I

    .line 109
    throw p1
.end method

.method public final ֫(Ll/ۛۜ֡;Ll/ܰۜ֡;Ll/۬ܳ֡;Ll/֫ܳ֡;ILl/ۡܳ֡;)I
    .locals 8

    .line 177
    invoke-interface {p4, p5}, Ll/ܳܳ֡;->֫(I)V

    :goto_0
    const/4 p2, 0x1

    .line 180
    invoke-interface {p4, p2}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v0

    .line 181
    invoke-virtual {p0, p3, v0, p2}, Ll/ۡ۫ۢ;->֫(Ll/۬ܳ֡;IZ)Ll/۬ܳ֡;

    move-result-object v7

    if-nez v7, :cond_1

    .line 183
    invoke-virtual {p0, p5, p4, p6}, Ll/᩺᩻֡;->ۧ(ILl/֫ܳ֡;Ll/ۡܳ֡;)Ll/᩷ܳ֡;

    move-result-object p1

    .line 184
    invoke-interface {p4, p5}, Ll/ܳܳ֡;->֫(I)V

    .line 185
    invoke-virtual {p0, p3, p6}, Ll/᩺᩻֡;->֫(Ll/۬ܳ֡;Ll/ۡܳ֡;)I

    move-result p2

    if-eqz p2, :cond_0

    return p2

    .line 187
    :cond_0
    throw p1

    .line 189
    :cond_1
    invoke-static {v7}, Ll/᩺᩻֡;->ܿ(Ll/۬ܳ֡;)I

    move-result v3

    iput v3, v7, Ll/۬ܳ֡;->ۨ:I

    if-eqz v3, :cond_2

    .line 191
    invoke-interface {p4}, Ll/ܳܳ֡;->index()I

    move-result v6

    move-object v1, p0

    move-object v2, p1

    move-object v4, v7

    move v5, p5

    invoke-virtual/range {v1 .. v6}, Ll/᩺᩻֡;->֫(Ll/ۛۜ֡;ILl/۬ܳ֡;II)V

    .line 192
    iget p1, v7, Ll/۬ܳ֡;->ۨ:I

    return p1

    .line 194
    :cond_2
    invoke-virtual {p0}, Ll/᩺᩻֡;->ܽ()Ll/᩻ۜ֡;

    move-result-object p2

    sget-object p3, Ll/᩻ۜ֡;->᩶:Ll/᩻ۜ֡;

    const/4 v1, 0x0

    if-ne p2, p3, :cond_3

    const/4 p2, 0x1

    const/4 v5, 0x1

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    const/4 v5, 0x0

    :goto_1
    if-nez v5, :cond_5

    .line 197
    iget-object p2, p0, Ll/ۡ۫ۢ;->ۘ:Ll/ۜ۫ۢ;

    if-nez p2, :cond_4

    new-instance p2, Ll/ۜ۫ۢ;

    invoke-direct {p2}, Ll/ۜ۫ۢ;-><init>()V

    iput-object p2, p0, Ll/ۡ۫ۢ;->ۘ:Ll/ۜ۫ۢ;

    .line 198
    :cond_4
    iget-object p2, p0, Ll/ۡ۫ۢ;->ۘ:Ll/ۜ۫ۢ;

    invoke-virtual {p2, v7}, Ll/ۜ۫ۢ;->֫(Ll/۬ܳ֡;)I

    move-result v1

    :goto_2
    move p2, v1

    goto :goto_3

    .line 201
    :cond_5
    invoke-static {v7}, Ll/᩻ۜ֡;->ܽ(Ll/۬ܳ֡;)Ljava/util/Collection;

    move-result-object p2

    .line 202
    invoke-static {p2}, Ll/᩻ۜ֡;->֫(Ljava/util/Collection;)Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-static {p2}, Ll/᩻ۜ֡;->ۧ(Ljava/util/Collection;)Z

    move-result p3

    if-eqz p3, :cond_6

    .line 203
    invoke-static {p2}, Ll/᩻ۜ֡;->ᩳ(Ljava/util/Collection;)I

    move-result v1

    goto :goto_2

    :cond_6
    const/4 p2, 0x0

    :goto_3
    if-eqz p2, :cond_7

    .line 207
    invoke-interface {p4}, Ll/ܳܳ֡;->index()I

    move-result v4

    invoke-virtual {v7}, Ll/۬ܳ֡;->ۧ()Ljava/util/BitSet;

    move-result-object v6

    move-object v1, p0

    move-object v2, p1

    move v3, p5

    invoke-virtual/range {v1 .. v7}, Ll/᩺᩻֡;->֫(Ll/ۛۜ֡;IIZLjava/util/BitSet;Ll/۬ܳ֡;)V

    return p2

    :cond_7
    const/4 p2, -0x1

    if-eq v0, p2, :cond_8

    .line 211
    invoke-interface {p4}, Ll/ܳܳ֡;->ۧ()V

    :cond_8
    move-object p3, v7

    goto/16 :goto_0
.end method

.method public final ֫(Ll/۬ܳ֡;IZ)Ll/۬ܳ֡;
    .locals 1

    if-eqz p3, :cond_0

    const/4 v0, 0x0

    .line 143
    iput v0, p0, Ll/ۡ۫ۢ;->֡:I

    const/4 v0, 0x0

    .line 144
    iput-object v0, p0, Ll/᩺᩻֡;->᩷:Ll/ۧ᩷֡;

    .line 146
    :cond_0
    invoke-super {p0, p1, p2, p3}, Ll/᩺᩻֡;->֫(Ll/۬ܳ֡;IZ)Ll/۬ܳ֡;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Z)Ll/۬ܳ֡;
    .locals 2

    .line 61
    new-instance v0, Ll/۬ܳ֡;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Ll/۬ܳ֡;-><init>(ZZ)V

    return-object v0
.end method

.method public final ֫(ILl/ܰۜ֡;)Ll/ܰۜ֡;
    .locals 3

    .line 150
    iget-object v0, p0, Ll/ۡ۫ۢ;->ۖ:Ll/᩻۫ۢ;

    iget-object v1, v0, Ll/᩻۫ۢ;->᩻:Ljava/util/IdentityHashMap;

    invoke-virtual {v1, p2}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/BitSet;

    if-eqz v1, :cond_1

    add-int/lit8 v2, p1, 0x1

    .line 151
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ll/᩷۫ۢ;->᩸:Ll/᩷۫ۢ;

    throw p1

    .line 153
    :cond_1
    :goto_0
    iget-object v1, p0, Ll/᩺᩻֡;->ܿ:Ll/֫ܳ֡;

    invoke-interface {v1}, Ll/ܳܳ֡;->index()I

    move-result v1

    iget v2, p0, Ll/ۡ۫ۢ;->᩵:I

    sub-int/2addr v1, v2

    const/16 v2, 0x80

    if-ge v1, v2, :cond_2

    .line 157
    invoke-super {p0, p1, p2}, Ll/᩺᩻֡;->֫(ILl/ܰۜ֡;)Ll/ܰۜ֡;

    move-result-object p1

    return-object p1

    .line 171
    :cond_2
    iget-object v0, v0, Ll/᩻۫ۢ;->᩻:Ljava/util/IdentityHashMap;

    new-instance v1, Ll/ۙۢۡ;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ll/ۙۢۡ;-><init>(I)V

    invoke-static {v0, p2, v1}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/BitSet;

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, p1}, Ljava/util/BitSet;->set(I)V

    .line 155
    sget-object p1, Ll/᩷۫ۢ;->᩸:Ll/᩷۫ۢ;

    throw p1
.end method

.method public final ֫(Ll/ۛۜ֡;Ll/ܰۜ֡;)Ll/ܰۜ֡;
    .locals 2

    .line 255
    iget-object v0, p1, Ll/ۛۜ֡;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v1

    .line 256
    invoke-super {p0, p1, p2}, Ll/᩺᩻֡;->֫(Ll/ۛۜ֡;Ll/ܰۜ֡;)Ll/ܰۜ֡;

    move-result-object p1

    .line 257
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result p2

    if-eq p2, v1, :cond_0

    iget-object p2, p0, Ll/ۡ۫ۢ;->ۖ:Ll/᩻۫ۢ;

    iget v0, p2, Ll/᩻۫ۢ;->ᩳ:I

    iget-object v1, p1, Ll/ܰۜ֡;->֫:Ll/۬ܳ֡;

    .line 328
    iget-object v1, v1, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/2addr v1, v0

    .line 257
    iput v1, p2, Ll/᩻۫ۢ;->ᩳ:I

    :cond_0
    return-object p1
.end method

.method public final ֫(Ll/ۛۜ֡;Ll/ܰۜ֡;I)Ll/ܰۜ֡;
    .locals 2

    .line 162
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ll/᩺᩻֡;->֫(Ll/ۛۜ֡;Ll/ܰۜ֡;I)Ll/ܰۜ֡;

    move-result-object p1
    :try_end_0
    .catch Ll/᩷۫ۢ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 171
    :catch_0
    iget-object p1, p0, Ll/ۡ۫ۢ;->ۖ:Ll/᩻۫ۢ;

    iget-object p1, p1, Ll/᩻۫ۢ;->᩻:Ljava/util/IdentityHashMap;

    new-instance v0, Ll/ۙۢۡ;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ll/ۙۢۡ;-><init>(I)V

    invoke-static {p1, p2, v0}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/BitSet;

    add-int/lit8 p3, p3, 0x1

    invoke-virtual {p1, p3}, Ljava/util/BitSet;->set(I)V

    .line 165
    sget-object p1, Ll/᩷۫ۢ;->᩸:Ll/᩷۫ۢ;

    throw p1
.end method

.method public final ֫(Ll/ܽۜ֡;)Ll/ܽۜ֡;
    .locals 2

    .line 247
    invoke-virtual {p1}, Ll/ܽۜ֡;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    .line 248
    :cond_0
    iget-object v0, p0, Ll/ۡ۫ۢ;->ۖ:Ll/᩻۫ۢ;

    monitor-enter v0

    .line 249
    :try_start_0
    iget-object v1, p0, Ll/ۡ۫ۢ;->ۖ:Ll/᩻۫ۢ;

    invoke-virtual {v1, p1}, Ll/ᩳۜ֡;->֫(Ll/ܽۜ֡;)Ll/ܽۜ֡;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 250
    :cond_1
    invoke-super {p0, p1}, Ll/ۨܳ֡;->֫(Ll/ܽۜ֡;)Ll/ܽۜ֡;

    move-result-object v1

    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    .line 251
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/᩹ܳ֡;Ll/۬ܳ֡;Ljava/util/HashSet;ZZIZ)V
    .locals 0

    .line 218
    invoke-direct {p0, p2, p3, p5}, Ll/ۡ۫ۢ;->֫(Ll/۬ܳ֡;Ljava/util/HashSet;Z)V

    .line 219
    invoke-super/range {p0 .. p7}, Ll/᩺᩻֡;->֫(Ll/᩹ܳ֡;Ll/۬ܳ֡;Ljava/util/HashSet;ZZIZ)V

    return-void
.end method

.method public final ֫(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/۬ܳ֡;Ljava/util/HashSet;ZZIZ)V
    .locals 0

    .line 230
    invoke-direct {p0, p3, p4, p6}, Ll/ۡ۫ۢ;->֫(Ll/۬ܳ֡;Ljava/util/HashSet;Z)V

    .line 231
    invoke-super/range {p0 .. p8}, Ll/᩺᩻֡;->֫(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/۬ܳ֡;Ljava/util/HashSet;ZZIZ)V

    return-void
.end method

.method public final ۧ(Ll/۬ܳ֡;)Ljava/util/BitSet;
    .locals 0

    .line 71
    invoke-virtual {p1}, Ll/۬ܳ֡;->ۧ()Ljava/util/BitSet;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ(Ll/۬ܳ֡;)Z
    .locals 2

    .line 65
    iget-object v0, p0, Ll/ۡ۫ۢ;->ᩴ:Ll/ܶۜ֡;

    if-nez v0, :cond_0

    new-instance v0, Ll/ܶۜ֡;

    invoke-direct {v0}, Ll/ܶۜ֡;-><init>()V

    iput-object v0, p0, Ll/ۡ۫ۢ;->ᩴ:Ll/ܶۜ֡;

    .line 66
    :cond_0
    iget-object v0, p0, Ll/ۡ۫ۢ;->ᩴ:Ll/ܶۜ֡;

    invoke-virtual {p0}, Ll/᩺᩻֡;->ܽ()Ll/᩻ۜ֡;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ll/ܶۜ֡;->֫(Ll/᩻ۜ֡;Ll/۬ܳ֡;)Z

    move-result p1

    return p1
.end method
