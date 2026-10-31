.class public final Ll/ܶۘܿ;
.super Ljava/lang/Object;
.source "J703"


# instance fields
.field public final ֫:Z

.field public final ۧ:[I

.field public final ܳ:I

.field public final ܽ:I

.field public final ܿ:[I

.field public final ᩳ:[I

.field public final ᩻:[I


# direct methods
.method public constructor <init>(II[I[I[I[IZ)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput p1, p0, Ll/ܶۘܿ;->ܳ:I

    .line 34
    iput p2, p0, Ll/ܶۘܿ;->ܽ:I

    .line 35
    iput-object p3, p0, Ll/ܶۘܿ;->᩻:[I

    .line 36
    iput-object p4, p0, Ll/ܶۘܿ;->ܿ:[I

    .line 37
    iput-object p5, p0, Ll/ܶۘܿ;->ᩳ:[I

    .line 38
    iput-object p6, p0, Ll/ܶۘܿ;->ۧ:[I

    .line 39
    iput-boolean p7, p0, Ll/ܶۘܿ;->֫:Z

    return-void
.end method

.method public static ֫(ILl/֨ۘܿ;I[I[I[I[I)I
    .locals 1

    const-string v0, "affinity"

    .line 245
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    if-ltz p0, :cond_4

    if-gt p0, p2, :cond_4

    .line 249
    invoke-static {p3, p0}, Ljava/util/Arrays;->binarySearch([II)I

    move-result p2

    if-ltz p2, :cond_1

    .line 251
    aget p0, p3, p2

    aget p3, p4, p2

    if-ne p0, p3, :cond_0

    sget-object p0, Ll/֨ۘܿ;->᩹:Ll/֨ۘܿ;

    if-ne p1, p0, :cond_0

    .line 252
    aget p0, p6, p2

    return p0

    .line 254
    :cond_0
    aget p0, p5, p2

    return p0

    :cond_1
    neg-int p1, p2

    add-int/lit8 p1, p1, -0x2

    if-gez p1, :cond_2

    return p0

    .line 260
    :cond_2
    aget p2, p4, p1

    if-ge p0, p2, :cond_3

    const/4 p0, -0x1

    return p0

    :cond_3
    sub-int/2addr p0, p2

    .line 264
    aget p1, p6, p1

    add-int/2addr p0, p1

    return p0

    .line 247
    :cond_4
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Offset outside document: "

    .line 0
    invoke-static {p0, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 247
    invoke-direct {p1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static varargs ֫(I[Ll/۠ۘܿ;)Ll/ܶۘܿ;
    .locals 20

    move/from16 v1, p0

    move-object/from16 v0, p1

    if-ltz v1, :cond_c

    const-string v2, "edits"

    .line 50
    invoke-static {v0, v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    int-to-long v2, v1

    .line 55
    array-length v4, v0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, -0x1

    const/4 v8, 0x0

    :goto_0
    if-ge v5, v4, :cond_4

    aget-object v9, v0, v5

    .line 56
    invoke-static {v9, v1}, Ll/ܶۘܿ;->֫(Ll/۠ۘܿ;I)V

    .line 57
    invoke-static {v9}, Ll/۠ۘܿ;->ܽ(Ll/۠ۘܿ;)I

    move-result v10

    invoke-static {v9}, Ll/۠ۘܿ;->ۧ(Ll/۠ۘܿ;)I

    move-result v11

    if-ne v10, v11, :cond_0

    invoke-static {v9}, Ll/۠ۘܿ;->֫(Ll/۠ۘܿ;)I

    move-result v10

    if-nez v10, :cond_0

    goto :goto_2

    .line 60
    :cond_0
    invoke-static {v9}, Ll/۠ۘܿ;->ܽ(Ll/۠ۘܿ;)I

    move-result v10

    if-lt v10, v7, :cond_3

    .line 63
    invoke-static {v9}, Ll/۠ۘܿ;->ܽ(Ll/۠ۘܿ;)I

    move-result v10

    if-eq v10, v7, :cond_1

    add-int/lit8 v6, v6, 0x1

    .line 66
    :cond_1
    invoke-static {v9}, Ll/۠ۘܿ;->ۧ(Ll/۠ۘܿ;)I

    move-result v7

    .line 67
    invoke-static {v9}, Ll/۠ۘܿ;->֫(Ll/۠ۘܿ;)I

    move-result v10

    int-to-long v10, v10

    invoke-static {v9}, Ll/۠ۘܿ;->ۧ(Ll/۠ۘܿ;)I

    move-result v12

    invoke-static {v9}, Ll/۠ۘܿ;->ܽ(Ll/۠ۘܿ;)I

    move-result v13

    sub-int/2addr v12, v13

    int-to-long v12, v12

    sub-long/2addr v10, v12

    add-long/2addr v10, v2

    .line 68
    invoke-static {v9}, Ll/۠ۘܿ;->ۧ(Ll/۠ۘܿ;)I

    move-result v2

    if-ne v2, v1, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    or-int/2addr v2, v8

    move v8, v2

    move-wide v2, v10

    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 61
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Edits must be ordered and non-overlapping"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    const-wide/16 v4, 0x0

    cmp-long v7, v2, v4

    if-ltz v7, :cond_b

    const-wide/32 v9, 0x7fffffff

    cmp-long v7, v2, v9

    if-gtz v7, :cond_b

    .line 74
    new-array v7, v6, [I

    .line 75
    new-array v9, v6, [I

    .line 76
    new-array v10, v6, [I

    .line 77
    new-array v11, v6, [I

    .line 80
    array-length v12, v0

    const/4 v13, 0x0

    const/4 v14, -0x1

    :goto_3
    if-ge v13, v12, :cond_8

    aget-object v15, v0, v13

    .line 81
    invoke-static {v15}, Ll/۠ۘܿ;->ܽ(Ll/۠ۘܿ;)I

    move-result v0

    invoke-static {v15}, Ll/۠ۘܿ;->ۧ(Ll/۠ۘܿ;)I

    move-result v1

    if-ne v0, v1, :cond_5

    invoke-static {v15}, Ll/۠ۘܿ;->֫(Ll/۠ۘܿ;)I

    move-result v0

    if-nez v0, :cond_5

    move-wide/from16 v17, v2

    move/from16 v16, v8

    move/from16 v19, v12

    goto :goto_5

    .line 84
    :cond_5
    invoke-static {v15}, Ll/۠ۘܿ;->ܽ(Ll/۠ۘܿ;)I

    move-result v0

    int-to-long v0, v0

    add-long/2addr v0, v4

    move/from16 v16, v8

    .line 85
    invoke-static {v15}, Ll/۠ۘܿ;->֫(Ll/۠ۘܿ;)I

    move-result v8

    move-wide/from16 v17, v2

    int-to-long v2, v8

    add-long/2addr v2, v0

    if-ltz v14, :cond_6

    .line 86
    aget v8, v9, v14

    move/from16 v19, v12

    invoke-static {v15}, Ll/۠ۘܿ;->ܽ(Ll/۠ۘܿ;)I

    move-result v12

    if-ne v8, v12, :cond_7

    .line 87
    invoke-static {v15}, Ll/۠ۘܿ;->ۧ(Ll/۠ۘܿ;)I

    move-result v0

    aput v0, v9, v14

    long-to-int v0, v2

    .line 88
    aput v0, v11, v14

    goto :goto_4

    :cond_6
    move/from16 v19, v12

    :cond_7
    add-int/lit8 v14, v14, 0x1

    .line 91
    invoke-static {v15}, Ll/۠ۘܿ;->ܽ(Ll/۠ۘܿ;)I

    move-result v8

    aput v8, v7, v14

    .line 92
    invoke-static {v15}, Ll/۠ۘܿ;->ۧ(Ll/۠ۘܿ;)I

    move-result v8

    aput v8, v9, v14

    long-to-int v1, v0

    .line 93
    aput v1, v10, v14

    long-to-int v0, v2

    .line 94
    aput v0, v11, v14

    .line 96
    :goto_4
    invoke-static {v15}, Ll/۠ۘܿ;->֫(Ll/۠ۘܿ;)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v15}, Ll/۠ۘܿ;->ۧ(Ll/۠ۘܿ;)I

    move-result v2

    invoke-static {v15}, Ll/۠ۘܿ;->ܽ(Ll/۠ۘܿ;)I

    move-result v3

    sub-int/2addr v2, v3

    int-to-long v2, v2

    sub-long/2addr v0, v2

    add-long/2addr v0, v4

    move-wide v4, v0

    :goto_5
    add-int/lit8 v13, v13, 0x1

    move/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v8, v16

    move-wide/from16 v2, v17

    move/from16 v12, v19

    goto :goto_3

    :cond_8
    move-wide/from16 v17, v2

    move/from16 v16, v8

    const/4 v0, 0x0

    :goto_6
    if-ge v0, v6, :cond_a

    if-nez v16, :cond_a

    .line 100
    aget v1, v9, v0

    aget v2, v7, v0

    sub-int/2addr v1, v2

    aget v2, v11, v0

    aget v3, v10, v0

    sub-int/2addr v2, v3

    if-eq v1, v2, :cond_9

    const/4 v1, 0x1

    const/16 v16, 0x1

    goto :goto_7

    :cond_9
    const/4 v1, 0x0

    const/16 v16, 0x0

    :goto_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    .line 102
    :cond_a
    new-instance v8, Ll/ܶۘܿ;

    move-wide/from16 v2, v17

    long-to-int v2, v2

    move-object v0, v8

    move/from16 v1, p0

    move-object v3, v7

    move-object v4, v9

    move-object v5, v10

    move-object v6, v11

    move/from16 v7, v16

    invoke-direct/range {v0 .. v7}, Ll/ܶۘܿ;-><init>(II[I[I[I[IZ)V

    return-object v8

    .line 72
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "New length exceeds the supported range"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 48
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Old length must not be negative"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ll/۠ۘܿ;I)V
    .locals 2

    const-string v0, "edit"

    .line 233
    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 234
    invoke-static {p0}, Ll/۠ۘܿ;->ܽ(Ll/۠ۘܿ;)I

    move-result v0

    if-ltz v0, :cond_1

    invoke-static {p0}, Ll/۠ۘܿ;->ۧ(Ll/۠ۘܿ;)I

    move-result v0

    invoke-static {p0}, Ll/۠ۘܿ;->ܽ(Ll/۠ۘܿ;)I

    move-result v1

    if-lt v0, v1, :cond_1

    invoke-static {p0}, Ll/۠ۘܿ;->ۧ(Ll/۠ۘܿ;)I

    move-result v0

    if-gt v0, p1, :cond_1

    .line 237
    invoke-static {p0}, Ll/۠ۘܿ;->֫(Ll/۠ۘܿ;)I

    move-result p0

    if-ltz p0, :cond_0

    return-void

    .line 238
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Replacement length must not be negative"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 235
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Edit range is outside the old document"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ᩻()Ll/ܶۘܿ;
    .locals 7

    .line 168
    iget-object v0, p0, Ll/ܶۘܿ;->᩻:[I

    array-length v1, v0

    const/16 v2, 0x40

    if-gt v1, v2, :cond_0

    return-object p0

    :cond_0
    array-length v1, v0

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    .line 153
    new-instance v3, Ll/۠ۘܿ;

    const/4 v4, 0x0

    aget v0, v0, v4

    iget-object v5, p0, Ll/ܶۘܿ;->ܿ:[I

    aget v5, v5, v1

    iget-object v6, p0, Ll/ܶۘܿ;->ۧ:[I

    aget v1, v6, v1

    iget-object v6, p0, Ll/ܶۘܿ;->ᩳ:[I

    aget v6, v6, v4

    sub-int/2addr v1, v6

    invoke-direct {v3, v0, v5, v1}, Ll/۠ۘܿ;-><init>(III)V

    new-array v0, v2, [Ll/۠ۘܿ;

    aput-object v3, v0, v4

    iget v1, p0, Ll/ܶۘܿ;->ܳ:I

    invoke-static {v1, v0}, Ll/ܶۘܿ;->֫(I[Ll/۠ۘܿ;)Ll/ܶۘܿ;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final ֫(I)I
    .locals 1

    .line 196
    iget-object v0, p0, Ll/ܶۘܿ;->ܿ:[I

    invoke-static {v0, p1}, Ljava/util/Arrays;->binarySearch([II)I

    move-result p1

    if-ltz p1, :cond_0

    return p1

    :cond_0
    neg-int p1, p1

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public final ֫(ILl/֨ۘܿ;)I
    .locals 7

    .line 223
    iget-object v5, p0, Ll/ܶۘܿ;->᩻:[I

    iget-object v6, p0, Ll/ܶۘܿ;->ܿ:[I

    iget v2, p0, Ll/ܶۘܿ;->ܽ:I

    iget-object v3, p0, Ll/ܶۘܿ;->ᩳ:[I

    iget-object v4, p0, Ll/ܶۘܿ;->ۧ:[I

    move v0, p1

    move-object v1, p2

    invoke-static/range {v0 .. v6}, Ll/ܶۘܿ;->֫(ILl/֨ۘܿ;I[I[I[I[I)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/۠ۘܿ;)Ll/ܶۘܿ;
    .locals 17

    move-object/from16 v0, p0

    .line 111
    iget v1, v0, Ll/ܶۘܿ;->ܽ:I

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Ll/ܶۘܿ;->֫(Ll/۠ۘܿ;I)V

    int-to-long v3, v1

    .line 112
    invoke-static/range {p1 .. p1}, Ll/۠ۘܿ;->֫(Ll/۠ۘܿ;)I

    move-result v1

    int-to-long v5, v1

    add-long/2addr v3, v5

    invoke-static/range {p1 .. p1}, Ll/۠ۘܿ;->ۧ(Ll/۠ۘܿ;)I

    move-result v1

    invoke-static/range {p1 .. p1}, Ll/۠ۘܿ;->ܽ(Ll/۠ۘܿ;)I

    move-result v5

    sub-int/2addr v1, v5

    int-to-long v5, v1

    sub-long/2addr v3, v5

    const-wide/32 v5, 0x7fffffff

    cmp-long v1, v3, v5

    if-gtz v1, :cond_7

    .line 116
    invoke-static/range {p1 .. p1}, Ll/۠ۘܿ;->ܽ(Ll/۠ۘܿ;)I

    move-result v1

    invoke-static/range {p1 .. p1}, Ll/۠ۘܿ;->ۧ(Ll/۠ۘܿ;)I

    move-result v3

    if-ne v1, v3, :cond_0

    invoke-static/range {p1 .. p1}, Ll/۠ۘܿ;->֫(Ll/۠ۘܿ;)I

    move-result v1

    if-nez v1, :cond_0

    invoke-direct/range {p0 .. p0}, Ll/ܶۘܿ;->᩻()Ll/ܶۘܿ;

    move-result-object v1

    return-object v1

    :cond_0
    const/4 v1, 0x0

    .line 168
    :goto_0
    iget-object v3, v0, Ll/ܶۘܿ;->᩻:[I

    array-length v4, v3

    .line 119
    iget-object v5, v0, Ll/ܶۘܿ;->ۧ:[I

    if-ge v1, v4, :cond_1

    aget v4, v5, v1

    invoke-static/range {p1 .. p1}, Ll/۠ۘܿ;->ܽ(Ll/۠ۘܿ;)I

    move-result v6

    if-ge v4, v6, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v4, v1

    .line 168
    :goto_1
    array-length v6, v3

    .line 121
    iget-object v7, v0, Ll/ܶۘܿ;->ᩳ:[I

    if-ge v4, v6, :cond_2

    aget v6, v7, v4

    invoke-static/range {p1 .. p1}, Ll/۠ۘܿ;->ۧ(Ll/۠ۘܿ;)I

    move-result v8

    if-gt v6, v8, :cond_2

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 122
    :cond_2
    invoke-static/range {p1 .. p1}, Ll/۠ۘܿ;->ܽ(Ll/۠ۘܿ;)I

    move-result v6

    .line 123
    invoke-static/range {p1 .. p1}, Ll/۠ۘܿ;->ۧ(Ll/۠ۘܿ;)I

    move-result v8

    .line 126
    iget-object v9, v0, Ll/ܶۘܿ;->ܿ:[I

    if-ge v1, v4, :cond_3

    .line 128
    aget v10, v7, v1

    invoke-static {v6, v10}, Ljava/lang/Math;->min(II)I

    move-result v6

    add-int/lit8 v10, v4, -0x1

    .line 129
    aget v11, v5, v10

    invoke-static {v8, v11}, Ljava/lang/Math;->max(II)I

    move-result v8

    .line 130
    aget v11, v3, v1

    sget-object v12, Ll/֨ۘܿ;->᩶:Ll/֨ۘܿ;

    invoke-virtual {v0, v6, v12}, Ll/ܶۘܿ;->֫(ILl/֨ۘܿ;)I

    move-result v12

    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    move-result v11

    .line 131
    aget v10, v9, v10

    sget-object v12, Ll/֨ۘܿ;->᩹:Ll/֨ۘܿ;

    invoke-virtual {v0, v8, v12}, Ll/ܶۘܿ;->֫(ILl/֨ۘܿ;)I

    move-result v12

    invoke-static {v10, v12}, Ljava/lang/Math;->max(II)I

    move-result v10

    goto :goto_2

    .line 133
    :cond_3
    sget-object v10, Ll/֨ۘܿ;->᩶:Ll/֨ۘܿ;

    invoke-virtual {v0, v6, v10}, Ll/ܶۘܿ;->֫(ILl/֨ۘܿ;)I

    move-result v11

    .line 134
    sget-object v10, Ll/֨ۘܿ;->᩹:Ll/֨ۘܿ;

    invoke-virtual {v0, v8, v10}, Ll/ܶۘܿ;->֫(ILl/֨ۘܿ;)I

    move-result v10

    :goto_2
    int-to-long v12, v8

    int-to-long v14, v6

    sub-long/2addr v12, v14

    .line 136
    invoke-static/range {p1 .. p1}, Ll/۠ۘܿ;->ۧ(Ll/۠ۘܿ;)I

    move-result v6

    invoke-static/range {p1 .. p1}, Ll/۠ۘܿ;->ܽ(Ll/۠ۘܿ;)I

    move-result v8

    sub-int/2addr v6, v8

    int-to-long v14, v6

    sub-long/2addr v12, v14

    invoke-static/range {p1 .. p1}, Ll/۠ۘܿ;->֫(Ll/۠ۘܿ;)I

    move-result v2

    int-to-long v14, v2

    add-long/2addr v12, v14

    long-to-int v2, v12

    int-to-long v14, v2

    cmp-long v6, v12, v14

    if-nez v6, :cond_6

    .line 138
    new-instance v6, Ljava/util/ArrayList;

    .line 168
    array-length v8, v3

    add-int/lit8 v8, v8, 0x1

    .line 138
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v8, 0x0

    :goto_3
    if-ge v8, v1, :cond_4

    .line 140
    new-instance v12, Ll/۠ۘܿ;

    aget v13, v3, v8

    aget v14, v9, v8

    aget v15, v5, v8

    aget v16, v7, v8

    sub-int v15, v15, v16

    invoke-direct {v12, v13, v14, v15}, Ll/۠ۘܿ;-><init>(III)V

    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 142
    :cond_4
    new-instance v1, Ll/۠ۘܿ;

    invoke-direct {v1, v11, v10, v2}, Ll/۠ۘܿ;-><init>(III)V

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    :goto_4
    array-length v1, v3

    if-ge v4, v1, :cond_5

    .line 144
    new-instance v1, Ll/۠ۘܿ;

    aget v2, v3, v4

    aget v8, v9, v4

    aget v10, v5, v4

    aget v11, v7, v4

    sub-int/2addr v10, v11

    invoke-direct {v1, v2, v8, v10}, Ll/۠ۘܿ;-><init>(III)V

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_5
    const/4 v1, 0x0

    new-array v1, v1, [Ll/۠ۘܿ;

    .line 146
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ll/۠ۘܿ;

    iget v2, v0, Ll/ܶۘܿ;->ܳ:I

    invoke-static {v2, v1}, Ll/ܶۘܿ;->֫(I[Ll/۠ۘܿ;)Ll/ܶۘܿ;

    move-result-object v1

    invoke-direct {v1}, Ll/ܶۘܿ;->᩻()Ll/ܶۘܿ;

    move-result-object v1

    return-object v1

    .line 0
    :cond_6
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    .line 114
    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "New length exceeds the supported range"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ֫()Z
    .locals 1

    .line 228
    iget-boolean v0, p0, Ll/ܶۘܿ;->֫:Z

    return v0
.end method

.method public final ۧ()I
    .locals 2

    .line 178
    iget-object v0, p0, Ll/ܶۘܿ;->᩻:[I

    array-length v1, v0

    if-nez v1, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method public final ۧ(I)I
    .locals 1

    .line 207
    iget-object v0, p0, Ll/ܶۘܿ;->ۧ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ۧ(ILl/֨ۘܿ;)I
    .locals 7

    .line 215
    iget-object v5, p0, Ll/ܶۘܿ;->ᩳ:[I

    iget-object v6, p0, Ll/ܶۘܿ;->ۧ:[I

    iget v2, p0, Ll/ܶۘܿ;->ܳ:I

    iget-object v3, p0, Ll/ܶۘܿ;->᩻:[I

    iget-object v4, p0, Ll/ܶۘܿ;->ܿ:[I

    move v0, p1

    move-object v1, p2

    invoke-static/range {v0 .. v6}, Ll/ܶۘܿ;->֫(ILl/֨ۘܿ;I[I[I[I[I)I

    move-result p1

    return p1
.end method

.method public final ܳ()I
    .locals 1

    .line 168
    iget-object v0, p0, Ll/ܶۘܿ;->᩻:[I

    array-length v0, v0

    return v0
.end method

.method public final ܽ(I)I
    .locals 1

    .line 202
    iget-object v0, p0, Ll/ܶۘܿ;->ᩳ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ܽ()Z
    .locals 1

    .line 173
    iget-object v0, p0, Ll/ܶۘܿ;->᩻:[I

    array-length v0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 158
    iget v0, p0, Ll/ܶۘܿ;->ܳ:I

    return v0
.end method

.method public final ܿ(I)I
    .locals 1

    .line 183
    iget-object v0, p0, Ll/ܶۘܿ;->᩻:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ᩳ()I
    .locals 1

    .line 163
    iget v0, p0, Ll/ܶۘܿ;->ܽ:I

    return v0
.end method

.method public final ᩳ(I)I
    .locals 1

    .line 188
    iget-object v0, p0, Ll/ܶۘܿ;->ܿ:[I

    aget p1, v0, p1

    return p1
.end method
