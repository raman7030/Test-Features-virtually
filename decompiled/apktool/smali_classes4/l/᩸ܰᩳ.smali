.class public final Ll/᩸ܰᩳ;
.super Ljava/lang/Object;
.source "XAZX"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public ۙ:I

.field public ᩶:I

.field public final ᩸:Ljava/util/ArrayList;

.field public ᩹:[I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩸ܰᩳ;->᩸:Ljava/util/ArrayList;

    const/16 v0, 0x8

    new-array v0, v0, [I

    .line 16
    iput-object v0, p0, Ll/᩸ܰᩳ;->᩹:[I

    return-void
.end method

.method private ֫(I)I
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 181
    :cond_0
    iget-object v0, p0, Ll/᩸ܰᩳ;->᩹:[I

    add-int/lit8 p1, p1, -0x1

    aget p1, v0, p1

    return p1
.end method

.method public static bridge synthetic ֫(Ll/᩸ܰᩳ;I)I
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩸ܰᩳ;->֫(I)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic ֫(Ll/᩸ܰᩳ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ܰᩳ;->᩸:Ljava/util/ArrayList;

    return-object p0
.end method

.method private declared-synchronized ֫(III)V
    .locals 17

    move-object/from16 v1, p0

    move/from16 v0, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v16, p0

    .line 1
    monitor-enter v16

    if-lt v0, v2, :cond_0

    .line 258
    monitor-exit v16

    return-void

    .line 259
    :cond_0
    :try_start_0
    invoke-direct/range {p0 .. p1}, Ll/᩸ܰᩳ;->ۧ(I)I

    move-result v4

    add-int/lit8 v5, v2, -0x1

    invoke-direct {v1, v5}, Ll/᩸ܰᩳ;->ۧ(I)I

    move-result v5

    sub-int v6, v5, v4

    const/4 v7, 0x1

    add-int/2addr v6, v7

    .line 260
    new-array v8, v6, [Ll/۠ܰᩳ;

    move v9, v4

    :goto_0
    const/4 v10, 0x0

    if-gt v9, v5, :cond_1

    .line 262
    invoke-direct {v1, v9}, Ll/᩸ܰᩳ;->֫(I)I

    move-result v11

    sub-int v12, v9, v4

    .line 263
    new-instance v13, Ll/۠ܰᩳ;

    iget-object v14, v1, Ll/᩸ܰᩳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ۚܰᩳ;

    sub-int v15, v0, v11

    invoke-static {v10, v15}, Ljava/lang/Math;->max(II)I

    move-result v10

    iget-object v15, v1, Ll/᩸ܰᩳ;->᩸:Ljava/util/ArrayList;

    .line 264
    invoke-virtual {v15, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/ۚܰᩳ;

    iget v15, v15, Ll/ۚܰᩳ;->ᩳ:I

    sub-int v11, v2, v11

    invoke-static {v15, v11}, Ljava/lang/Math;->min(II)I

    move-result v11

    invoke-direct {v13, v14, v10, v11}, Ll/۠ܰᩳ;-><init>(Ll/ۚܰᩳ;II)V

    aput-object v13, v8, v12

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 266
    :cond_1
    new-instance v2, Ll/ܶܰᩳ;

    invoke-direct {v2, v1, v8, v4}, Ll/ܶܰᩳ;-><init>(Ll/᩸ܰᩳ;[Ll/۠ܰᩳ;I)V

    .line 267
    invoke-virtual {v2, v0, v3}, Ll/ܶܰᩳ;->֫(II)V

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v6, :cond_2

    .line 268
    aget-object v5, v8, v4

    invoke-virtual {v5}, Ll/۠ܰᩳ;->֫()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 269
    :cond_2
    iput-boolean v7, v2, Ll/ܶܰᩳ;->ܽ:Z

    .line 270
    invoke-virtual {v2, v0, v3}, Ll/ܶܰᩳ;->֫(II)V

    :goto_2
    if-ge v10, v6, :cond_4

    .line 271
    aget-object v0, v8, v10

    .line 423
    iget-object v2, v0, Ll/۠ܰᩳ;->ܿ:Ll/ۚܰᩳ;

    iget-object v3, v0, Ll/۠ܰᩳ;->ۧ:[C

    if-nez v3, :cond_3

    const/4 v0, 0x0

    goto :goto_3

    :cond_3
    iget-object v0, v0, Ll/۠ܰᩳ;->ܽ:[I

    :goto_3
    iput-object v0, v2, Ll/ۚܰᩳ;->ܽ:[I

    .line 424
    iput-object v3, v2, Ll/ۚܰᩳ;->ۧ:[C
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 272
    :cond_4
    monitor-exit v16

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private ۧ(I)I
    .locals 3

    .line 184
    iget v0, p0, Ll/᩸ܰᩳ;->᩶:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    .line 185
    iget-object v0, p0, Ll/᩸ܰᩳ;->᩹:[I

    iget-object v1, p0, Ll/᩸ܰᩳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 p1, p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, p1}, Ljava/util/Arrays;->binarySearch([IIII)I

    move-result p1

    if-ltz p1, :cond_0

    return p1

    :cond_0
    neg-int p1, p1

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public static bridge synthetic ۧ(Ll/᩸ܰᩳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩸ܰᩳ;->᩶:I

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/᩸ܰᩳ;I)I
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩸ܰᩳ;->ۧ(I)I

    move-result p0

    return p0
.end method

.method private ܳ()V
    .locals 4

    .line 175
    invoke-direct {p0}, Ll/᩸ܰᩳ;->ܿ()V

    const/4 v0, 0x0

    .line 176
    iput v0, p0, Ll/᩸ܰᩳ;->᩶:I

    .line 177
    :goto_0
    iget-object v1, p0, Ll/᩸ܰᩳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Ll/᩸ܰᩳ;->᩹:[I

    iget v3, p0, Ll/᩸ܰᩳ;->᩶:I

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚܰᩳ;

    iget v1, v1, Ll/ۚܰᩳ;->ᩳ:I

    add-int/2addr v3, v1

    iput v3, p0, Ll/᩸ܰᩳ;->᩶:I

    aput v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 178
    :cond_0
    iget v0, p0, Ll/᩸ܰᩳ;->ۙ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩸ܰᩳ;->ۙ:I

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/᩸ܰᩳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩸ܰᩳ;->ۙ:I

    return p0
.end method

.method private ܿ()V
    .locals 3

    .line 171
    iget-object v0, p0, Ll/᩸ܰᩳ;->᩹:[I

    array-length v0, v0

    iget-object v1, p0, Ll/᩸ܰᩳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    iget-object v0, p0, Ll/᩸ܰᩳ;->᩹:[I

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v2, p0, Ll/᩸ܰᩳ;->᩹:[I

    array-length v2, v2

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/᩸ܰᩳ;->᩹:[I

    :cond_0
    return-void
.end method

.method private ᩳ(I)I
    .locals 4

    .line 147
    iget v0, p0, Ll/᩸ܰᩳ;->᩶:I

    iget-object v1, p0, Ll/᩸ܰᩳ;->᩸:Ljava/util/ArrayList;

    if-ne p1, v0, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    return p1

    .line 148
    :cond_0
    invoke-direct {p0, p1}, Ll/᩸ܰᩳ;->ۧ(I)I

    move-result v0

    invoke-direct {p0, v0}, Ll/᩸ܰᩳ;->֫(I)I

    move-result v2

    sub-int/2addr p1, v2

    if-nez p1, :cond_1

    return v0

    .line 150
    :cond_1
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚܰᩳ;

    const/4 v3, 0x0

    .line 151
    invoke-virtual {v2, v3, p1}, Ll/ۚܰᩳ;->֫(II)Ll/ۚܰᩳ;

    move-result-object v3

    invoke-virtual {v1, v0, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    .line 152
    iget v3, v2, Ll/ۚܰᩳ;->ᩳ:I

    invoke-virtual {v2, p1, v3}, Ll/ۚܰᩳ;->֫(II)Ll/ۚܰᩳ;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 153
    invoke-direct {p0}, Ll/᩸ܰᩳ;->ܳ()V

    return v0
.end method

.method private ᩳ()V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 160
    :goto_0
    iget-object v2, p0, Ll/᩸ܰᩳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v0, v3, :cond_1

    .line 161
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚܰᩳ;

    if-lez v1, :cond_0

    add-int/lit8 v4, v1, -0x1

    .line 162
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۚܰᩳ;

    iget v5, v5, Ll/ۚܰᩳ;->ᩳ:I

    iget v6, v3, Ll/ۚܰᩳ;->ᩳ:I

    add-int/2addr v5, v6

    const/16 v6, 0x400

    if-gt v5, v6, :cond_0

    .line 163
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۚܰᩳ;

    invoke-static {v5, v3}, Ll/ۚܰᩳ;->֫(Ll/ۚܰᩳ;Ll/ۚܰᩳ;)Ll/ۚܰᩳ;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v1, 0x1

    .line 164
    invoke-virtual {v2, v1, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move v1, v4

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 166
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {v2, v1, v0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 167
    invoke-direct {p0}, Ll/᩸ܰᩳ;->ܳ()V

    return-void
.end method


# virtual methods
.method public final add(I)V
    .locals 7

    .line 52
    iget v0, p0, Ll/᩸ܰᩳ;->᩶:I

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_5

    .line 53
    iget-object v0, p0, Ll/᩸ܰᩳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 0
    :cond_0
    invoke-static {v0, v2}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v1

    .line 53
    check-cast v1, Ll/ۚܰᩳ;

    :goto_0
    const/16 v3, 0x400

    if-eqz v1, :cond_1

    .line 54
    iget v4, v1, Ll/ۚܰᩳ;->ᩳ:I

    if-ne v4, v3, :cond_2

    .line 55
    :cond_1
    new-instance v1, Ll/ۚܰᩳ;

    const/16 v4, 0x8

    invoke-direct {v1, v4}, Ll/ۚܰᩳ;-><init>(I)V

    .line 56
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    invoke-direct {p0}, Ll/᩸ܰᩳ;->ܿ()V

    .line 339
    :cond_2
    iget v4, v1, Ll/ۚܰᩳ;->ᩳ:I

    iget-object v5, v1, Ll/ۚܰᩳ;->֫:[I

    array-length v6, v5

    if-ne v4, v6, :cond_3

    .line 340
    array-length v4, v5

    mul-int/lit8 v4, v4, 0x2

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v5, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    iput-object v3, v1, Ll/ۚܰᩳ;->֫:[I

    .line 341
    iget-object v4, v1, Ll/ۚܰᩳ;->ܽ:[I

    if-eqz v4, :cond_3

    array-length v3, v3

    add-int/2addr v3, v2

    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    iput-object v3, v1, Ll/ۚܰᩳ;->ܽ:[I

    .line 343
    :cond_3
    iget-object v3, v1, Ll/ۚܰᩳ;->֫:[I

    iget v4, v1, Ll/ۚܰᩳ;->ᩳ:I

    add-int/lit8 v5, v4, 0x1

    iput v5, v1, Ll/ۚܰᩳ;->ᩳ:I

    aput p1, v3, v4

    .line 344
    iget-object p1, v1, Ll/ۚܰᩳ;->ܽ:[I

    if-eqz p1, :cond_4

    aget v1, p1, v4

    aput v1, p1, v5

    .line 60
    :cond_4
    iget-object p1, p0, Ll/᩸ܰᩳ;->᩹:[I

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v2

    iget v1, p0, Ll/᩸ܰᩳ;->᩶:I

    add-int/2addr v1, v2

    iput v1, p0, Ll/᩸ܰᩳ;->᩶:I

    aput v1, p1, v0

    .line 61
    iget p1, p0, Ll/᩸ܰᩳ;->ۙ:I

    add-int/2addr p1, v2

    iput p1, p0, Ll/᩸ܰᩳ;->ۙ:I

    return-void

    .line 52
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Too many indent lines"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final clear()V
    .locals 1

    .line 23
    iget-object v0, p0, Ll/᩸ܰᩳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/16 v0, 0x8

    new-array v0, v0, [I

    .line 24
    iput-object v0, p0, Ll/᩸ܰᩳ;->᩹:[I

    const/4 v0, 0x0

    .line 25
    iput v0, p0, Ll/᩸ܰᩳ;->᩶:I

    .line 26
    iget v0, p0, Ll/᩸ܰᩳ;->ۙ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩸ܰᩳ;->ۙ:I

    return-void
.end method

.method public final isEmpty()Z
    .locals 1

    .line 20
    iget v0, p0, Ll/᩸ܰᩳ;->᩶:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 222
    new-instance v0, Ll/֡ܰᩳ;

    invoke-direct {v0, p0}, Ll/֡ܰᩳ;-><init>(Ll/᩸ܰᩳ;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 19
    iget v0, p0, Ll/᩸ܰᩳ;->᩶:I

    return v0
.end method

.method public final ֫(II)V
    .locals 1

    .line 112
    iget v0, p0, Ll/᩸ܰᩳ;->᩶:I

    invoke-static {p1, p2, v0}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    if-ne p1, p2, :cond_0

    return-void

    .line 114
    :cond_0
    invoke-direct {p0, p1}, Ll/᩸ܰᩳ;->ᩳ(I)I

    move-result p1

    invoke-direct {p0, p2}, Ll/᩸ܰᩳ;->ᩳ(I)I

    move-result p2

    .line 115
    iget-object v0, p0, Ll/᩸ܰᩳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 116
    invoke-direct {p0}, Ll/᩸ܰᩳ;->ᩳ()V

    return-void
.end method

.method public final ֫(ILl/ۗۤᩳ;Ll/۟᩸ᩳ;II)V
    .locals 2

    .line 66
    invoke-direct {p0, p1}, Ll/᩸ܰᩳ;->ۧ(I)I

    move-result v0

    .line 67
    iget-object v1, p0, Ll/᩸ܰᩳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚܰᩳ;

    iget-object v1, v1, Ll/ۚܰᩳ;->֫:[I

    invoke-direct {p0, v0}, Ll/᩸ܰᩳ;->֫(I)I

    move-result v0

    sub-int/2addr p1, v0

    invoke-static {p2, p3, p4, p5}, Ll/᩵ܰᩳ;->֫(Ll/ۗۤᩳ;Ljava/lang/CharSequence;II)I

    move-result p2

    aput p2, v1, p1

    return-void
.end method

.method public final ֫(Ll/ۗۤᩳ;Ll/᩶᩸ᩳ;Ll/᩷۟ᩳ;I)V
    .locals 5

    .line 31
    invoke-interface {p2}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object p2

    .line 38
    :try_start_0
    invoke-virtual {p0}, Ll/᩸ܰᩳ;->clear()V

    .line 40
    invoke-virtual {p3}, Ll/᩷۟ᩳ;->ۧ()Ll/ܰܰᩳ;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 41
    :goto_0
    invoke-virtual {p3}, Ll/᩷۟ᩳ;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    .line 42
    invoke-virtual {v0, v1}, Ll/ܰܰᩳ;->֫(I)Ll/ۨܰᩳ;

    move-result-object v3

    .line 43
    iget v4, v3, Ll/ۨܰᩳ;->᩹:I

    if-ne v4, v2, :cond_0

    .line 44
    iget v3, v3, Ll/ۨܰᩳ;->᩶:I

    invoke-static {p1, p2, v3, p4}, Ll/᩵ܰᩳ;->֫(Ll/ۗۤᩳ;Ljava/lang/CharSequence;II)I

    move-result v3

    invoke-virtual {p0, v3}, Ll/᩸ܰᩳ;->add(I)V

    add-int/lit8 v2, v2, 0x1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {p0}, Ll/᩸ܰᩳ;->ܽ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    invoke-virtual {p2}, Ll/۟᩸ᩳ;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 31
    :try_start_1
    invoke-virtual {p2}, Ll/۟᩸ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
.end method

.method public final ֫(Ll/᩸ܰᩳ;II)V
    .locals 5

    if-eq p1, p0, :cond_3

    .line 122
    iget v0, p1, Ll/᩸ܰᩳ;->᩶:I

    invoke-static {p2, p3, v0}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    .line 123
    iget v0, p0, Ll/᩸ܰᩳ;->᩶:I

    int-to-long v0, v0

    int-to-long v2, p3

    add-long/2addr v0, v2

    int-to-long v2, p2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, v0, v2

    if-gtz v4, :cond_2

    :goto_0
    if-ge p2, p3, :cond_1

    .line 125
    invoke-direct {p1, p2}, Ll/᩸ܰᩳ;->ۧ(I)I

    move-result v0

    invoke-direct {p1, v0}, Ll/᩸ܰᩳ;->֫(I)I

    move-result v1

    .line 126
    iget-object v2, p1, Ll/᩸ܰᩳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚܰᩳ;

    .line 127
    iget v2, v0, Ll/ۚܰᩳ;->ᩳ:I

    add-int/2addr v2, v1

    invoke-static {p3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    sub-int/2addr p2, v1

    sub-int v1, v2, v1

    .line 128
    invoke-virtual {v0, p2, v1}, Ll/ۚܰᩳ;->֫(II)Ll/ۚܰᩳ;

    move-result-object p2

    .line 134
    iget-object v0, p0, Ll/᩸ܰᩳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_0

    .line 135
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚܰᩳ;

    iget v3, v3, Ll/ۚܰᩳ;->ᩳ:I

    iget v4, p2, Ll/ۚܰᩳ;->ᩳ:I

    add-int/2addr v3, v4

    const/16 v4, 0x400

    if-gt v3, v4, :cond_0

    .line 136
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚܰᩳ;

    invoke-static {v3, p2}, Ll/ۚܰᩳ;->֫(Ll/ۚܰᩳ;Ll/ۚܰᩳ;)Ll/ۚܰᩳ;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 138
    :cond_0
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    invoke-direct {p0}, Ll/᩸ܰᩳ;->ܿ()V

    .line 141
    :goto_1
    iget v1, p0, Ll/᩸ܰᩳ;->᩶:I

    iget p2, p2, Ll/ۚܰᩳ;->ᩳ:I

    add-int/2addr v1, p2

    iput v1, p0, Ll/᩸ܰᩳ;->᩶:I

    .line 142
    iget-object p2, p0, Ll/᩸ܰᩳ;->᩹:[I

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget v1, p0, Ll/᩸ܰᩳ;->᩶:I

    aput v1, p2, v0

    .line 143
    iget p2, p0, Ll/᩸ܰᩳ;->ۙ:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Ll/᩸ܰᩳ;->ۙ:I

    move p2, v2

    goto :goto_0

    :cond_1
    return-void

    .line 123
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Too many indent lines"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 121
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Cannot append indent lines from self"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()Ll/֨ܰᩳ;
    .locals 1

    .line 189
    new-instance v0, Ll/֨ܰᩳ;

    invoke-direct {v0, p0}, Ll/֨ܰᩳ;-><init>(Ll/᩸ܰᩳ;)V

    return-object v0
.end method

.method public final ۧ(II)V
    .locals 5

    .line 95
    iget v0, p0, Ll/᩸ܰᩳ;->᩶:I

    invoke-static {p1, p1, v0}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    if-ltz p2, :cond_2

    .line 96
    iget v0, p0, Ll/᩸ܰᩳ;->᩶:I

    int-to-long v0, v0

    int-to-long v2, p2

    add-long/2addr v0, v2

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, v0, v2

    if-gtz v4, :cond_2

    if-nez p2, :cond_0

    return-void

    .line 98
    :cond_0
    invoke-direct {p0, p1}, Ll/᩸ܰᩳ;->ᩳ(I)I

    move-result p1

    .line 99
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    if-lez p2, :cond_1

    const/16 v1, 0x400

    .line 101
    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 102
    new-instance v2, Ll/ۚܰᩳ;

    invoke-direct {v2, v1}, Ll/ۚܰᩳ;-><init>(I)V

    .line 103
    iput v1, v2, Ll/ۚܰᩳ;->ᩳ:I

    .line 104
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sub-int/2addr p2, v1

    goto :goto_0

    .line 107
    :cond_1
    iget-object p2, p0, Ll/᩸ܰᩳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {p2, p1, v0}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 108
    invoke-direct {p0}, Ll/᩸ܰᩳ;->ᩳ()V

    return-void

    .line 96
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid indent line count"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܽ()V
    .locals 2

    const/4 v0, 0x0

    .line 254
    iget v1, p0, Ll/᩸ܰᩳ;->᩶:I

    invoke-direct {p0, v0, v1, v1}, Ll/᩸ܰᩳ;->֫(III)V

    return-void
.end method

.method public final ᩳ(II)V
    .locals 2

    .line 189
    new-instance v0, Ll/֨ܰᩳ;

    invoke-direct {v0, p0}, Ll/֨ܰᩳ;-><init>(Ll/᩸ܰᩳ;)V

    if-lez p1, :cond_1

    :cond_0
    add-int/lit8 p1, p1, -0x1

    if-lez p1, :cond_2

    .line 237
    invoke-virtual {v0, p1}, Ll/֨ܰᩳ;->ܽ(I)Z

    .line 218
    invoke-virtual {v0}, Ll/֨ܰᩳ;->ܽ()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ll/֨ܰᩳ;->֫()C

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 242
    :cond_2
    :goto_0
    iget v1, p0, Ll/᩸ܰᩳ;->᩶:I

    if-ge p2, v1, :cond_4

    add-int/lit8 p2, p2, 0x1

    move v1, p2

    .line 244
    :goto_1
    iget p2, p0, Ll/᩸ܰᩳ;->᩶:I

    if-ge v1, p2, :cond_4

    .line 245
    invoke-virtual {v0, v1}, Ll/֨ܰᩳ;->ܽ(I)Z

    .line 218
    invoke-virtual {v0}, Ll/֨ܰᩳ;->ܽ()I

    move-result p2

    if-nez p2, :cond_3

    invoke-virtual {v0}, Ll/֨ܰᩳ;->֫()C

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 251
    :cond_4
    :goto_2
    iget p2, p0, Ll/᩸ܰᩳ;->᩶:I

    if-ge v1, p2, :cond_5

    add-int/lit8 p2, v1, 0x1

    goto :goto_3

    :cond_5
    move p2, v1

    :goto_3
    invoke-direct {p0, p1, v1, p2}, Ll/᩸ܰᩳ;->֫(III)V

    return-void
.end method
