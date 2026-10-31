.class public final Ll/֫᩻ۘ;
.super Ljava/lang/Object;
.source "J1L5"


# instance fields
.field public final ֫:Ljava/util/BitSet;

.field public final ۧ:Ljava/util/BitSet;

.field public final ܳ:[I

.field public final ܽ:I

.field public final ܿ:[I

.field public final ᩳ:I


# direct methods
.method public constructor <init>([I[I)V
    .locals 5

    .line 33
    array-length v0, p1

    array-length v1, p2

    new-instance v2, Ljava/util/BitSet;

    array-length v3, p1

    invoke-direct {v2, v3}, Ljava/util/BitSet;-><init>(I)V

    new-instance v3, Ljava/util/BitSet;

    array-length v4, p2

    invoke-direct {v3, v4}, Ljava/util/BitSet;-><init>(I)V

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Ll/֫᩻ۘ;->ܿ:[I

    .line 38
    iput-object p2, p0, Ll/֫᩻ۘ;->ܳ:[I

    .line 41
    iput v0, p0, Ll/֫᩻ۘ;->ܽ:I

    .line 42
    iput v1, p0, Ll/֫᩻ۘ;->ᩳ:I

    .line 44
    iput-object v2, p0, Ll/֫᩻ۘ;->֫:Ljava/util/BitSet;

    .line 45
    iput-object v3, p0, Ll/֫᩻ۘ;->ۧ:Ljava/util/BitSet;

    return-void
.end method

.method private ֫(IIIII)V
    .locals 24

    move-object/from16 v6, p0

    move/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    if-nez v1, :cond_0

    if-nez v3, :cond_0

    return-void

    .line 62
    :cond_0
    iget-object v15, v6, Ll/֫᩻ۘ;->ۧ:Ljava/util/BitSet;

    iget-object v14, v6, Ll/֫᩻ۘ;->֫:Ljava/util/BitSet;

    if-eqz v1, :cond_14

    if-nez v3, :cond_1

    goto/16 :goto_a

    .line 133
    :cond_1
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v4

    const/4 v7, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    .line 135
    :goto_0
    iget-object v9, v6, Ll/֫᩻ۘ;->ܳ:[I

    iget-object v10, v6, Ll/֫᩻ۘ;->ܿ:[I

    if-ge v5, v4, :cond_3

    add-int v11, v0, v5

    .line 136
    aget v11, v10, v11

    add-int v12, v2, v5

    aget v12, v9, v12

    if-eq v11, v12, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    add-int v11, v0, v8

    add-int v12, v2, v8

    sub-int v0, v1, v8

    sub-int v1, v3, v8

    .line 143
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v8, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    :goto_2
    if-gt v3, v2, :cond_5

    add-int v5, v11, v0

    sub-int/2addr v5, v3

    .line 146
    aget v5, v10, v5

    add-int v13, v12, v1

    sub-int/2addr v13, v3

    aget v13, v9, v13

    if-eq v5, v13, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_5
    :goto_3
    sub-int v13, v0, v4

    sub-int v23, v1, v4

    if-eqz v13, :cond_13

    if-nez v23, :cond_6

    goto/16 :goto_9

    .line 80
    :cond_6
    iget v0, v6, Ll/֫᩻ۘ;->ᩳ:I

    iget v1, v6, Ll/֫᩻ۘ;->ܽ:I

    if-nez p5, :cond_9

    mul-int/lit8 v2, v13, 0x2

    if-ge v2, v1, :cond_7

    goto :goto_4

    :cond_7
    mul-int/lit8 v2, v23, 0x2

    if-ge v2, v0, :cond_8

    goto :goto_4

    .line 164
    :cond_8
    new-instance v0, Ll/ܰܳۘ;

    invoke-direct {v0}, Ll/ܰܳۘ;-><init>()V

    throw v0

    :cond_9
    :goto_4
    const/4 v2, -0x1

    add-int/lit8 v3, p5, -0x1

    .line 81
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 83
    new-instance v2, Ll/ܽ᩻ۘ;

    iget-object v3, v6, Ll/֫᩻ۘ;->ܿ:[I

    iget-object v4, v6, Ll/֫᩻ۘ;->ܳ:[I

    move-object/from16 v16, v2

    move/from16 v17, v11

    move/from16 v18, v13

    move-object/from16 v19, v3

    move/from16 v20, v12

    move-object/from16 v21, v4

    move/from16 v22, v23

    invoke-direct/range {v16 .. v22}, Ll/ܽ᩻ۘ;-><init>(II[II[II)V

    .line 84
    invoke-virtual {v2}, Ll/ܽ᩻ۘ;->֫()[[I

    move-result-object v10

    if-nez v10, :cond_d

    if-ltz v9, :cond_c

    mul-int/lit8 v2, v13, 0x2

    if-ge v2, v1, :cond_a

    goto :goto_5

    :cond_a
    mul-int/lit8 v1, v23, 0x2

    if-ge v1, v0, :cond_b

    goto :goto_5

    .line 164
    :cond_b
    new-instance v0, Ll/ܰܳۘ;

    invoke-direct {v0}, Ll/ܰܳۘ;-><init>()V

    throw v0

    .line 88
    :cond_c
    :goto_5
    new-instance v0, Ll/۟ܳۘ;

    iget-object v8, v6, Ll/֫᩻ۘ;->ܿ:[I

    iget-object v9, v6, Ll/֫᩻ۘ;->ܳ:[I

    move-object v7, v0

    move v10, v11

    move v11, v13

    move/from16 v13, v23

    invoke-direct/range {v7 .. v15}, Ll/۟ܳۘ;-><init>([I[IIIIILjava/util/BitSet;Ljava/util/BitSet;)V

    .line 89
    invoke-virtual {v0}, Ll/۟ܳۘ;->֫()V

    return-void

    .line 92
    :cond_d
    aget-object v0, v10, v7

    array-length v14, v0

    .line 95
    aget v2, v0, v7

    .line 96
    aget-object v0, v10, v8

    aget v4, v0, v7

    move-object/from16 v0, p0

    move v1, v11

    move v3, v12

    move v5, v9

    .line 98
    invoke-direct/range {v0 .. v5}, Ll/֫᩻ۘ;->֫(IIIII)V

    const/4 v0, 0x1

    const/4 v15, 0x1

    .line 100
    :goto_6
    aget-object v0, v10, v7

    array-length v1, v0

    if-ge v15, v1, :cond_10

    add-int/lit8 v1, v15, -0x1

    .line 101
    aget v2, v0, v1

    add-int/2addr v2, v8

    .line 102
    aget-object v3, v10, v8

    aget v1, v3, v1

    add-int/2addr v1, v8

    .line 104
    aget v0, v0, v15

    sub-int v4, v0, v2

    .line 105
    aget v0, v3, v15

    sub-int v5, v0, v1

    if-gtz v4, :cond_e

    if-lez v5, :cond_f

    :cond_e
    add-int/2addr v2, v11

    add-int v3, v12, v1

    move-object/from16 v0, p0

    move v1, v2

    move v2, v4

    move v4, v5

    move v5, v9

    .line 108
    invoke-direct/range {v0 .. v5}, Ll/֫᩻ۘ;->֫(IIIII)V

    :cond_f
    add-int/lit8 v15, v15, 0x1

    goto :goto_6

    :cond_10
    sub-int/2addr v14, v8

    .line 112
    aget v0, v0, v14

    add-int/lit8 v1, v13, -0x1

    if-ne v0, v1, :cond_11

    const/4 v0, 0x0

    const/4 v2, 0x0

    goto :goto_7

    :cond_11
    add-int/lit8 v1, v0, 0x1

    sub-int/2addr v13, v1

    move v2, v13

    .line 119
    :goto_7
    aget-object v0, v10, v8

    aget v0, v0, v14

    add-int/lit8 v3, v23, -0x1

    if-ne v0, v3, :cond_12

    const/4 v0, 0x0

    const/4 v4, 0x0

    goto :goto_8

    :cond_12
    add-int/lit8 v3, v0, 0x1

    sub-int v23, v23, v3

    move/from16 v4, v23

    :goto_8
    add-int/2addr v1, v11

    add-int/2addr v3, v12

    move-object/from16 v0, p0

    move v5, v9

    .line 127
    invoke-direct/range {v0 .. v5}, Ll/֫᩻ۘ;->֫(IIIII)V

    return-void

    :cond_13
    :goto_9
    add-int/2addr v13, v11

    .line 153
    invoke-virtual {v14, v11, v13}, Ljava/util/BitSet;->set(II)V

    add-int v0, v12, v23

    .line 154
    invoke-virtual {v15, v12, v0}, Ljava/util/BitSet;->set(II)V

    return-void

    :cond_14
    :goto_a
    add-int/2addr v1, v0

    .line 153
    invoke-virtual {v14, v0, v1}, Ljava/util/BitSet;->set(II)V

    add-int v0, v2, v3

    .line 154
    invoke-virtual {v15, v2, v0}, Ljava/util/BitSet;->set(II)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 6

    const/4 v3, 0x0

    .line 54
    iget v4, p0, Ll/֫᩻ۘ;->ᩳ:I

    const/4 v1, 0x0

    iget v2, p0, Ll/֫᩻ۘ;->ܽ:I

    const/4 v5, 0x2

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ll/֫᩻ۘ;->֫(IIIII)V

    return-void
.end method

.method public final ۧ()[Ljava/util/BitSet;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/util/BitSet;

    const/4 v1, 0x0

    .line 158
    iget-object v2, p0, Ll/֫᩻ۘ;->֫:Ljava/util/BitSet;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Ll/֫᩻ۘ;->ۧ:Ljava/util/BitSet;

    aput-object v2, v0, v1

    return-object v0
.end method
