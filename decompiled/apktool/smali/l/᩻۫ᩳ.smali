.class public final Ll/᩻۫ᩳ;
.super Ljava/lang/Object;
.source "X1VI"


# static fields
.field public static ۘ:Ljava/util/List;


# instance fields
.field public ֫:I

.field public ۖ:Ll/ۨܰۘ;

.field public ۜ:I

.field public ۡ:I

.field public ۢ:I

.field public ۧ:Ll/۟᩺ᩳ;

.field public ܳ:I

.field public ܺ:Z

.field public final ܽ:Ll/۫ۨᩳ;

.field public ܿ:I

.field public ᩳ:Ll/ۨܰۘ;

.field public ᩷:I

.field public ᩻:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "[]"

    const-string v1, "()"

    const-string v2, "{}"

    .line 20
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll/᩻۫ᩳ;->ۘ:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ll/۫ۨᩳ;)V
    .locals 3

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ll/ۨܰۘ;

    sget-object v1, Ll/᩻۫ᩳ;->ۘ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ll/ۨܰۘ;-><init>(I)V

    iput-object v0, p0, Ll/᩻۫ᩳ;->ᩳ:Ll/ۨܰۘ;

    .line 24
    new-instance v0, Ll/ۨܰۘ;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ll/ۨܰۘ;-><init>(I)V

    iput-object v0, p0, Ll/᩻۫ᩳ;->ۖ:Ll/ۨܰۘ;

    .line 38
    iput-object p1, p0, Ll/᩻۫ᩳ;->ܽ:Ll/۫ۨᩳ;

    .line 39
    invoke-virtual {p0, v1}, Ll/᩻۫ᩳ;->֫(Ljava/util/List;)V

    return-void
.end method

.method public static ֫(Ll/ܶۜܿ;CZ)C
    .locals 4

    .line 319
    invoke-virtual {p0}, Ll/ܶۜܿ;->ܽ()Ljava/util/List;

    move-result-object p0

    if-nez p0, :cond_0

    .line 321
    sget-object p0, Ll/᩻۫ᩳ;->ۘ:Ljava/util/List;

    :cond_0
    xor-int/lit8 v0, p2, 0x1

    .line 326
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    :cond_1
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_2

    .line 327
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 328
    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v3, p1, :cond_1

    .line 329
    invoke-virtual {v2, p2}, Ljava/lang/String;->charAt(I)C

    move-result p0

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private ֫(Ll/ۜۢܿ;III)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_1

    .line 311
    iget-object p1, p0, Ll/᩻۫ᩳ;->ܽ:Ll/۫ۨᩳ;

    invoke-virtual {p1, p3}, Ll/۫ۨᩳ;->֫(I)I

    move-result p1

    if-ne p1, p4, :cond_0

    return v1

    :cond_0
    return v0

    .line 313
    :cond_1
    invoke-virtual {p1, p3}, Ll/ۜۢܿ;->֫(I)I

    move-result v2

    if-ne v2, p2, :cond_2

    .line 314
    invoke-virtual {p1, p3}, Ll/ۜۢܿ;->ܳ(I)I

    move-result p1

    if-ne p1, p4, :cond_2

    return v1

    :cond_2
    return v0
.end method

.method private ֫(Ll/۟᩸ᩳ;IIILl/ۜۢܿ;)Z
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    const/4 v6, 0x0

    if-lt v2, v3, :cond_8

    if-lt v2, v4, :cond_0

    goto/16 :goto_3

    .line 196
    :cond_0
    invoke-virtual/range {p1 .. p2}, Ll/۟᩸ᩳ;->charAt(I)C

    move-result v7

    const/4 v8, -0x1

    const/4 v9, 0x1

    if-eqz v5, :cond_3

    add-int/lit8 v10, v2, 0x1

    .line 201
    invoke-virtual {v5, v2, v10}, Ll/ۜۢܿ;->ۧ(II)Z

    move-result v10

    if-nez v10, :cond_1

    goto/16 :goto_3

    .line 204
    :cond_1
    invoke-virtual {v5, v2}, Ll/ۜۢܿ;->֫(I)I

    move-result v10

    .line 205
    invoke-virtual {v5, v10}, Ll/ۜۢܿ;->ܽ(I)Ll/ܶۜܿ;

    move-result-object v11

    if-nez v11, :cond_2

    goto :goto_3

    .line 209
    :cond_2
    invoke-static {v11, v7, v9}, Ll/᩻۫ᩳ;->֫(Ll/ܶۜܿ;CZ)C

    move-result v11

    .line 210
    invoke-virtual {v5, v10}, Ll/ۜۢܿ;->ܿ(I)I

    move-result v12

    invoke-static {v3, v12}, Ljava/lang/Math;->max(II)I

    .line 211
    invoke-virtual {v5, v10}, Ll/ۜۢܿ;->ᩳ(I)I

    move-result v3

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 212
    invoke-virtual {v5, v2}, Ll/ۜۢܿ;->ܳ(I)I

    move-result v4

    goto :goto_0

    .line 214
    :cond_3
    iget-object v3, v0, Ll/᩻۫ᩳ;->ᩳ:Ll/ۨܰۘ;

    invoke-virtual {v3, v7}, Ll/ۨܰۘ;->ۧ(C)C

    move-result v11

    .line 215
    iget-object v3, v0, Ll/᩻۫ᩳ;->ܽ:Ll/۫ۨᩳ;

    invoke-virtual {v3, v2}, Ll/۫ۨᩳ;->֫(I)I

    move-result v3

    const/4 v10, -0x1

    move/from16 v17, v4

    move v4, v3

    move/from16 v3, v17

    :goto_0
    if-eqz v11, :cond_8

    add-int/lit8 v12, v2, 0x1

    .line 219
    invoke-virtual {v1, v11, v12, v3}, Ll/۟᩸ᩳ;->indexOf(CII)I

    move-result v13

    const/4 v14, 0x0

    :goto_1
    if-eq v13, v8, :cond_8

    .line 224
    invoke-direct {v0, v5, v10, v13, v4}, Ll/᩻۫ᩳ;->֫(Ll/ۜۢܿ;III)Z

    move-result v15

    if-eqz v15, :cond_7

    .line 297
    invoke-virtual {v1, v7, v12, v13}, Ll/۟᩸ᩳ;->indexOf(CII)I

    move-result v12

    const/4 v15, 0x0

    :goto_2
    if-eq v12, v8, :cond_5

    .line 299
    invoke-direct {v0, v5, v10, v12, v4}, Ll/᩻۫ᩳ;->֫(Ll/ۜۢܿ;III)Z

    move-result v16

    if-eqz v16, :cond_4

    add-int/lit8 v15, v15, 0x1

    :cond_4
    add-int/lit8 v12, v12, 0x1

    .line 302
    invoke-virtual {v1, v7, v12, v13}, Ll/۟᩸ᩳ;->indexOf(CII)I

    move-result v12

    goto :goto_2

    :cond_5
    add-int/2addr v14, v15

    if-nez v14, :cond_6

    .line 228
    iput v2, v0, Ll/᩻۫ᩳ;->ۜ:I

    .line 229
    iput v13, v0, Ll/᩻۫ᩳ;->᩷:I

    return v9

    :cond_6
    add-int/lit8 v12, v13, 0x1

    add-int/lit8 v14, v14, -0x1

    :cond_7
    add-int/lit8 v13, v13, 0x1

    .line 235
    invoke-virtual {v1, v11, v13, v3}, Ll/۟᩸ᩳ;->indexOf(CII)I

    move-result v13

    goto :goto_1

    :cond_8
    :goto_3
    return v6
.end method

.method private ۧ(IIII)V
    .locals 14

    move-object v7, p0

    move v0, p1

    .line 113
    iget-object v8, v7, Ll/᩻۫ᩳ;->ܽ:Ll/۫ۨᩳ;

    iget-object v1, v8, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget-boolean v1, v1, Ll/᩺֫ܿ;->ۘ֫:Z

    const/4 v9, 0x0

    if-nez v1, :cond_0

    .line 114
    iget-boolean v0, v7, Ll/᩻۫ᩳ;->᩻:Z

    if-eqz v0, :cond_d

    .line 115
    iput-boolean v9, v7, Ll/᩻۫ᩳ;->᩻:Z

    return-void

    .line 119
    :cond_0
    invoke-virtual {v8}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v10

    .line 121
    iget-object v1, v8, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget-boolean v1, v1, Ll/᩺֫ܿ;->ܰۧ:Z

    if-eqz v1, :cond_1

    .line 122
    iget-object v1, v8, Ll/۫ۨᩳ;->ۤᩳ:Ll/ۜܺܿ;

    invoke-virtual {v1}, Ll/ۜܺܿ;->ܳ()Ll/ۜۢܿ;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    move-object v11, v1

    .line 124
    :try_start_0
    invoke-interface {v10}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object v12
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 125
    :try_start_1
    invoke-virtual {v12}, Ll/۟᩸ᩳ;->length()I

    move-result v13

    move/from16 v1, p2

    if-ne v0, v1, :cond_b

    if-ltz v0, :cond_b

    if-gt v0, v13, :cond_b

    if-ge v0, v13, :cond_2

    move-object v1, p0

    move-object v2, v12

    move v3, p1

    move/from16 v4, p3

    move/from16 v5, p4

    move-object v6, v11

    .line 131
    invoke-direct/range {v1 .. v6}, Ll/᩻۫ᩳ;->֫(Ll/۟᩸ᩳ;IIILl/ۜۢܿ;)Z

    move-result v1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_3

    if-lez v0, :cond_3

    add-int/lit8 v3, v0, -0x1

    move-object v1, p0

    move-object v2, v12

    move/from16 v4, p3

    move/from16 v5, p4

    move-object v6, v11

    .line 135
    invoke-direct/range {v1 .. v6}, Ll/᩻۫ᩳ;->ۧ(Ll/۟᩸ᩳ;IIILl/ۜۢܿ;)Z

    move-result v1

    :cond_3
    if-nez v1, :cond_4

    if-lez v0, :cond_4

    add-int/lit8 v3, v0, -0x1

    move-object v1, p0

    move-object v2, v12

    move/from16 v4, p3

    move/from16 v5, p4

    move-object v6, v11

    .line 140
    invoke-direct/range {v1 .. v6}, Ll/᩻۫ᩳ;->֫(Ll/۟᩸ᩳ;IIILl/ۜۢܿ;)Z

    move-result v1

    :cond_4
    if-nez v1, :cond_5

    if-ge v0, v13, :cond_5

    move-object v1, p0

    move-object v2, v12

    move v3, p1

    move/from16 v4, p3

    move/from16 v5, p4

    move-object v6, v11

    .line 145
    invoke-direct/range {v1 .. v6}, Ll/᩻۫ᩳ;->ۧ(Ll/۟᩸ᩳ;IIILl/ۜۢܿ;)Z

    move-result v1

    :cond_5
    if-eqz v1, :cond_b

    .line 150
    iget-boolean v0, v7, Ll/᩻۫ᩳ;->᩻:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_7

    iget v0, v7, Ll/᩻۫ᩳ;->ۢ:I

    iget v2, v7, Ll/᩻۫ᩳ;->ۜ:I

    if-ne v0, v2, :cond_7

    iget v0, v7, Ll/᩻۫ᩳ;->ۡ:I

    iget v2, v7, Ll/᩻۫ᩳ;->᩷:I

    if-eq v0, v2, :cond_6

    goto :goto_2

    :cond_6
    const/4 v0, 0x0

    goto :goto_3

    :cond_7
    :goto_2
    const/4 v0, 0x1

    .line 151
    :goto_3
    iput-boolean v1, v7, Ll/᩻۫ᩳ;->᩻:Z

    .line 152
    iput-boolean v9, v7, Ll/᩻۫ᩳ;->ܺ:Z

    .line 153
    iput-object v10, v7, Ll/᩻۫ᩳ;->ۧ:Ll/۟᩺ᩳ;

    .line 154
    invoke-virtual {v12}, Ll/۟᩸ᩳ;->ܳ()I

    move-result v1

    iput v1, v7, Ll/᩻۫ᩳ;->֫:I

    .line 155
    iget v1, v7, Ll/᩻۫ᩳ;->ۜ:I

    iget v2, v7, Ll/᩻۫ᩳ;->᩷:I

    if-gt v1, v2, :cond_8

    .line 156
    iput v1, v7, Ll/᩻۫ᩳ;->ۢ:I

    .line 157
    iput v2, v7, Ll/᩻۫ᩳ;->ۡ:I

    goto :goto_4

    .line 159
    :cond_8
    iput v2, v7, Ll/᩻۫ᩳ;->ۢ:I

    .line 160
    iput v1, v7, Ll/᩻۫ᩳ;->ۡ:I

    .line 163
    :goto_4
    iget v1, v7, Ll/᩻۫ᩳ;->ۢ:I

    invoke-virtual {v12, v1}, Ll/۟᩸ᩳ;->ۧ(I)I

    move-result v1

    iput v1, v7, Ll/᩻۫ᩳ;->ܿ:I

    .line 164
    iget v1, v7, Ll/᩻۫ᩳ;->ۡ:I

    invoke-virtual {v12, v1}, Ll/۟᩸ᩳ;->ۧ(I)I

    move-result v1

    iput v1, v7, Ll/᩻۫ᩳ;->ܳ:I

    if-eqz v0, :cond_a

    .line 166
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_9

    .line 167
    invoke-virtual {v8}, Landroid/view/View;->postInvalidate()V

    goto :goto_5

    .line 169
    :cond_9
    invoke-virtual {v8}, Landroid/view/View;->invalidate()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 175
    :cond_a
    :goto_5
    :try_start_2
    invoke-virtual {v12}, Ll/۟᩸ᩳ;->close()V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_6

    :cond_b
    invoke-virtual {v12}, Ll/۟᩸ᩳ;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_8

    :goto_6
    move-object v1, v0

    .line 124
    :try_start_3
    invoke-virtual {v12}, Ll/۟᩸ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_7

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_4
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    nop

    .line 181
    :goto_8
    iget-boolean v0, v7, Ll/᩻۫ᩳ;->᩻:Z

    if-eqz v0, :cond_d

    .line 182
    iput-boolean v9, v7, Ll/᩻۫ᩳ;->᩻:Z

    .line 183
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_c

    .line 184
    invoke-virtual {v8}, Landroid/view/View;->postInvalidate()V

    goto :goto_9

    .line 186
    :cond_c
    invoke-virtual {v8}, Landroid/view/View;->invalidate()V

    :cond_d
    :goto_9
    return-void
.end method

.method private ۧ(Ll/۟᩸ᩳ;IIILl/ۜۢܿ;)Z
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    const/4 v6, 0x0

    if-lt v2, v3, :cond_8

    if-lt v2, v4, :cond_0

    goto/16 :goto_3

    .line 247
    :cond_0
    invoke-virtual/range {p1 .. p2}, Ll/۟᩸ᩳ;->charAt(I)C

    move-result v7

    const/4 v8, -0x1

    if-eqz v5, :cond_3

    add-int/lit8 v9, v2, 0x1

    .line 252
    invoke-virtual {v5, v2, v9}, Ll/ۜۢܿ;->ۧ(II)Z

    move-result v9

    if-nez v9, :cond_1

    goto :goto_3

    .line 255
    :cond_1
    invoke-virtual {v5, v2}, Ll/ۜۢܿ;->֫(I)I

    move-result v9

    .line 256
    invoke-virtual {v5, v9}, Ll/ۜۢܿ;->ܽ(I)Ll/ܶۜܿ;

    move-result-object v10

    if-nez v10, :cond_2

    goto :goto_3

    .line 260
    :cond_2
    invoke-static {v10, v7, v6}, Ll/᩻۫ᩳ;->֫(Ll/ܶۜܿ;CZ)C

    move-result v10

    .line 261
    invoke-virtual {v5, v9}, Ll/ۜۢܿ;->ܿ(I)I

    move-result v11

    invoke-static {v3, v11}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 262
    invoke-virtual {v5, v9}, Ll/ۜۢܿ;->ᩳ(I)I

    move-result v11

    invoke-static {v4, v11}, Ljava/lang/Math;->min(II)I

    .line 263
    invoke-virtual {v5, v2}, Ll/ۜۢܿ;->ܳ(I)I

    move-result v4

    goto :goto_0

    .line 265
    :cond_3
    iget-object v4, v0, Ll/᩻۫ᩳ;->ۖ:Ll/ۨܰۘ;

    invoke-virtual {v4, v7}, Ll/ۨܰۘ;->ۧ(C)C

    move-result v10

    .line 266
    iget-object v4, v0, Ll/᩻۫ᩳ;->ܽ:Ll/۫ۨᩳ;

    invoke-virtual {v4, v2}, Ll/۫ۨᩳ;->֫(I)I

    move-result v4

    const/4 v9, -0x1

    :goto_0
    if-eqz v10, :cond_8

    .line 270
    invoke-virtual {v1, v10, v3, v2}, Ll/۟᩸ᩳ;->lastIndexOf(CII)I

    move-result v11

    add-int/lit8 v12, v2, -0x1

    const/4 v13, 0x0

    :goto_1
    if-eq v11, v8, :cond_8

    .line 276
    invoke-direct {v0, v5, v9, v11, v4}, Ll/᩻۫ᩳ;->֫(Ll/ۜۢܿ;III)Z

    move-result v14

    if-eqz v14, :cond_7

    add-int/lit8 v14, v11, 0x1

    add-int/lit8 v12, v12, 0x1

    .line 297
    invoke-virtual {v1, v7, v14, v12}, Ll/۟᩸ᩳ;->indexOf(CII)I

    move-result v14

    const/4 v15, 0x0

    :goto_2
    if-eq v14, v8, :cond_5

    .line 299
    invoke-direct {v0, v5, v9, v14, v4}, Ll/᩻۫ᩳ;->֫(Ll/ۜۢܿ;III)Z

    move-result v16

    if-eqz v16, :cond_4

    add-int/lit8 v15, v15, 0x1

    :cond_4
    add-int/lit8 v14, v14, 0x1

    .line 302
    invoke-virtual {v1, v7, v14, v12}, Ll/۟᩸ᩳ;->indexOf(CII)I

    move-result v14

    goto :goto_2

    :cond_5
    add-int/2addr v13, v15

    if-nez v13, :cond_6

    .line 280
    iput v11, v0, Ll/᩻۫ᩳ;->ۜ:I

    .line 281
    iput v2, v0, Ll/᩻۫ᩳ;->᩷:I

    const/4 v1, 0x1

    return v1

    :cond_6
    add-int/lit8 v12, v11, -0x1

    add-int/lit8 v13, v13, -0x1

    .line 287
    :cond_7
    invoke-virtual {v1, v10, v3, v11}, Ll/۟᩸ᩳ;->lastIndexOf(CII)I

    move-result v11

    goto :goto_1

    :cond_8
    :goto_3
    return v6
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 410
    iget v0, p0, Ll/᩻۫ᩳ;->ܿ:I

    return v0
.end method

.method public final ֫(I)I
    .locals 4

    .line 65
    iget-boolean v0, p0, Ll/᩻۫ᩳ;->᩻:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Ll/᩻۫ᩳ;->ܺ:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 68
    :cond_0
    iget v0, p0, Ll/᩻۫ᩳ;->ۢ:I

    if-ne p1, v0, :cond_1

    .line 69
    iget p1, p0, Ll/᩻۫ᩳ;->ۡ:I

    add-int/lit8 p1, p1, 0x1

    return p1

    .line 71
    :cond_1
    iget v1, p0, Ll/᩻۫ᩳ;->ۡ:I

    add-int/lit8 v2, v1, 0x1

    if-ne p1, v2, :cond_2

    goto :goto_0

    :cond_2
    add-int/lit8 v3, v0, 0x1

    if-ne p1, v3, :cond_3

    return v2

    :cond_3
    if-ne p1, v1, :cond_4

    :goto_0
    return v0

    :cond_4
    :goto_1
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫(III)J
    .locals 4

    .line 337
    iget-object v0, p0, Ll/᩻۫ᩳ;->ܽ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    .line 338
    iget-boolean v1, p0, Ll/᩻۫ᩳ;->᩻:Z

    if-eqz v1, :cond_5

    iget-object v1, p0, Ll/᩻۫ᩳ;->ۧ:Ll/۟᩺ᩳ;

    if-ne v1, v0, :cond_5

    iget v1, p0, Ll/᩻۫ᩳ;->֫:I

    add-int/lit8 v1, v1, 0x1

    invoke-interface {v0}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v0

    if-ne v1, v0, :cond_5

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    add-int v0, p1, p2

    .line 343
    iget v1, p0, Ll/᩻۫ᩳ;->ۢ:I

    if-gt p1, v1, :cond_1

    if-lt v1, v0, :cond_5

    :cond_1
    iget v2, p0, Ll/᩻۫ᩳ;->ۡ:I

    if-gt p1, v2, :cond_2

    if-ge v2, v0, :cond_2

    goto :goto_0

    :cond_2
    sub-int/2addr p3, p2

    if-lt v1, v0, :cond_3

    add-int/2addr v1, p3

    :cond_3
    if-lt v2, v0, :cond_4

    add-int/2addr v2, p3

    :cond_4
    int-to-long p1, v1

    const/16 p3, 0x20

    shl-long/2addr p1, p3

    int-to-long v0, v2

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    or-long/2addr p1, v0

    return-wide p1

    :cond_5
    :goto_0
    const-wide/16 p1, -0x1

    return-wide p1
.end method

.method public final ֫(II)V
    .locals 3

    .line 371
    iget-boolean v0, p0, Ll/᩻۫ᩳ;->ܺ:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩻۫ᩳ;->ۧ:Ll/۟᩺ᩳ;

    iget-object v1, p0, Ll/᩻۫ᩳ;->ܽ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    if-ne v0, v2, :cond_1

    iget v0, p0, Ll/᩻۫ᩳ;->֫:I

    .line 372
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    invoke-interface {v2}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v2

    if-ne v0, v2, :cond_1

    iget-object v0, v1, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget-boolean v0, v0, Ll/᩺֫ܿ;->ۘ֫:Z

    if-eqz v0, :cond_1

    .line 374
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ܽܽ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 9843
    iget-boolean v0, v1, Ll/۫ۨᩳ;->ۜۧ:Z

    if-nez v0, :cond_1

    if-ne p1, p2, :cond_1

    .line 375
    iget p2, p0, Ll/᩻۫ᩳ;->ۢ:I

    if-eq p1, p2, :cond_0

    add-int/lit8 p2, p2, 0x1

    if-eq p1, p2, :cond_0

    iget p2, p0, Ll/᩻۫ᩳ;->ۡ:I

    if-eq p1, p2, :cond_0

    add-int/lit8 p2, p2, 0x1

    if-eq p1, p2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 378
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/᩻۫ᩳ;->᩻()V

    return-void
.end method

.method public final ֫(IIII)V
    .locals 3

    .line 102
    iget-object v0, p0, Ll/᩻۫ᩳ;->ܽ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result v0

    if-ltz p3, :cond_0

    if-gt p3, p4, :cond_0

    if-gt p4, v0, :cond_0

    .line 108
    invoke-direct {p0, p1, p2, p3, p4}, Ll/᩻۫ᩳ;->ۧ(IIII)V

    return-void

    .line 104
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, ", "

    const-string v1, ") for length "

    const-string v2, "Invalid syntax coverage ["

    .line 0
    invoke-static {v2, p3, p2, v1, p4}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 104
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(J)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x20

    ushr-long v0, p1, v0

    long-to-int v1, v0

    .line 357
    iput v1, p0, Ll/᩻۫ᩳ;->ۢ:I

    long-to-int p2, p1

    .line 358
    iput p2, p0, Ll/᩻۫ᩳ;->ۡ:I

    .line 359
    iget-object p1, p0, Ll/᩻۫ᩳ;->ܽ:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p2

    invoke-interface {p2}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result p2

    iput p2, p0, Ll/᩻۫ᩳ;->֫:I

    const/4 p2, 0x1

    .line 360
    iput-boolean p2, p0, Ll/᩻۫ᩳ;->ܺ:Z

    .line 361
    iput-boolean p2, p0, Ll/᩻۫ᩳ;->᩻:Z

    .line 362
    invoke-virtual {p1}, Ll/۫ۨᩳ;->۫֫()I

    move-result p2

    invoke-virtual {p1}, Ll/۫ۨᩳ;->۬֫()I

    move-result v0

    invoke-virtual {p0, p2, v0}, Ll/᩻۫ᩳ;->֫(II)V

    .line 363
    iget-boolean p2, p0, Ll/᩻۫ᩳ;->᩻:Z

    if-eqz p2, :cond_1

    .line 364
    iget p2, p0, Ll/᩻۫ᩳ;->ۢ:I

    invoke-virtual {p1, p2}, Ll/۫ۨᩳ;->ۧ(I)I

    move-result p2

    iput p2, p0, Ll/᩻۫ᩳ;->ܿ:I

    .line 365
    iget p2, p0, Ll/᩻۫ᩳ;->ۡ:I

    invoke-virtual {p1, p2}, Ll/۫ۨᩳ;->ۧ(I)I

    move-result p1

    iput p1, p0, Ll/᩻۫ᩳ;->ܳ:I

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(Landroid/graphics/Canvas;IIFFLl/֫ۖܽ;Ll/᩺֫ܿ;Ll/ۧۧܿ;)V
    .locals 12

    move-object v0, p0

    move v1, p2

    move v2, p3

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    .line 427
    iget-boolean v3, v0, Ll/᩻۫ᩳ;->᩻:Z

    if-eqz v3, :cond_2

    iget-object v3, v0, Ll/᩻۫ᩳ;->ܽ:Ll/۫ۨᩳ;

    invoke-virtual {v3}, Landroid/view/View;->isFocused()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 431
    :cond_0
    iget v3, v0, Ll/᩻۫ᩳ;->ۢ:I

    const/4 v11, 0x0

    if-gt v1, v3, :cond_1

    if-ge v3, v2, :cond_1

    .line 432
    move-object/from16 v4, p8

    check-cast v4, Ll/᩶ۤᩳ;

    invoke-virtual {v4, p2, v11, v3}, Ll/᩶ۤᩳ;->֫(IFI)F

    move-result v3

    .line 433
    iget v5, v0, Ll/᩻۫ᩳ;->ۢ:I

    add-int/lit8 v6, v5, 0x1

    invoke-virtual {v4, v5, v11, v6}, Ll/᩶ۤᩳ;->֫(IFI)F

    move-result v4

    .line 434
    iget v5, v10, Ll/᩺֫ܿ;->ۙۧ:I

    invoke-virtual {v9, v5}, Landroid/graphics/Paint;->setColor(I)V

    add-float v5, v3, v11

    add-float v6, v3, v4

    move-object v3, p1

    move v4, v5

    move/from16 v5, p4

    move/from16 v7, p5

    move-object/from16 v8, p6

    .line 435
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 438
    :cond_1
    iget v3, v0, Ll/᩻۫ᩳ;->ۡ:I

    if-gt v1, v3, :cond_2

    if-ge v3, v2, :cond_2

    .line 439
    move-object/from16 v2, p8

    check-cast v2, Ll/᩶ۤᩳ;

    invoke-virtual {v2, p2, v11, v3}, Ll/᩶ۤᩳ;->֫(IFI)F

    move-result v1

    .line 440
    iget v3, v0, Ll/᩻۫ᩳ;->ۡ:I

    add-int/lit8 v4, v3, 0x1

    invoke-virtual {v2, v3, v11, v4}, Ll/᩶ۤᩳ;->֫(IFI)F

    move-result v2

    .line 441
    iget v3, v10, Ll/᩺֫ܿ;->ۙۧ:I

    invoke-virtual {v9, v3}, Landroid/graphics/Paint;->setColor(I)V

    add-float v3, v1, v11

    add-float v4, v1, v2

    move-object v1, p1

    move v2, v3

    move/from16 v3, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    .line 442
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final ֫(Ljava/util/List;)V
    .locals 7

    .line 51
    invoke-virtual {p0}, Ll/᩻۫ᩳ;->᩻()V

    if-nez p1, :cond_0

    .line 53
    sget-object p1, Ll/᩻۫ᩳ;->ۘ:Ljava/util/List;

    .line 54
    :cond_0
    iget-object v0, p0, Ll/᩻۫ᩳ;->ᩳ:Ll/ۨܰۘ;

    invoke-virtual {v0}, Ll/ۨܰۘ;->clear()V

    .line 55
    iget-object v1, p0, Ll/᩻۫ᩳ;->ۖ:Ll/ۨܰۘ;

    invoke-virtual {v1}, Ll/ۨܰۘ;->clear()V

    .line 56
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 57
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    const/4 v3, 0x0

    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/4 v5, 0x1

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-virtual {v0, v4, v6}, Ll/ۨܰۘ;->֫(CC)C

    .line 60
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v1, v4, v2}, Ll/ۨܰۘ;->֫(CC)C

    goto :goto_0

    .line 58
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 414
    iget v0, p0, Ll/᩻۫ᩳ;->ܳ:I

    return v0
.end method

.method public final ۧ(II)V
    .locals 2

    .line 97
    iget-object v0, p0, Ll/᩻۫ᩳ;->ܽ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v1, v0}, Ll/᩻۫ᩳ;->ۧ(IIII)V

    return-void
.end method

.method public final ۧ(I)[I
    .locals 3

    .line 84
    iget-boolean v0, p0, Ll/᩻۫ᩳ;->᩻:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Ll/᩻۫ᩳ;->ܺ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 87
    :cond_0
    iget v0, p0, Ll/᩻۫ᩳ;->ۢ:I

    if-eq p1, v0, :cond_1

    iget v1, p0, Ll/᩻۫ᩳ;->ۡ:I

    add-int/lit8 v2, v1, 0x1

    if-eq p1, v2, :cond_1

    add-int/lit8 v2, v0, 0x1

    if-eq p1, v2, :cond_1

    if-ne p1, v1, :cond_2

    .line 88
    :cond_1
    iget p1, p0, Ll/᩻۫ᩳ;->ۡ:I

    filled-new-array {v0, p1}, [I

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ܳ()V
    .locals 1

    const/4 v0, 0x0

    .line 387
    iput-boolean v0, p0, Ll/᩻۫ᩳ;->ܺ:Z

    .line 388
    iput-boolean v0, p0, Ll/᩻۫ᩳ;->᩻:Z

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 418
    iget v0, p0, Ll/᩻۫ᩳ;->ۢ:I

    return v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 383
    iget-boolean v0, p0, Ll/᩻۫ᩳ;->᩻:Z

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 422
    iget v0, p0, Ll/᩻۫ᩳ;->ۡ:I

    return v0
.end method

.method public final ᩻()V
    .locals 4

    const/4 v0, 0x0

    .line 393
    iput-boolean v0, p0, Ll/᩻۫ᩳ;->ܺ:Z

    .line 394
    iget-object v1, p0, Ll/᩻۫ᩳ;->ۧ:Ll/۟᩺ᩳ;

    iget-object v2, p0, Ll/᩻۫ᩳ;->ܽ:Ll/۫ۨᩳ;

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v3

    if-eq v1, v3, :cond_0

    const/4 v1, 0x0

    .line 396
    iput-object v1, p0, Ll/᩻۫ᩳ;->ۧ:Ll/۟᩺ᩳ;

    .line 398
    :cond_0
    iget-boolean v1, p0, Ll/᩻۫ᩳ;->᩻:Z

    if-nez v1, :cond_1

    return-void

    .line 401
    :cond_1
    iput-boolean v0, p0, Ll/᩻۫ᩳ;->᩻:Z

    .line 402
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 403
    invoke-virtual {v2}, Landroid/view/View;->postInvalidate()V

    return-void

    .line 405
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    return-void
.end method
