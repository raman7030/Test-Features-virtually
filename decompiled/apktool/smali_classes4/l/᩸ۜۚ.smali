.class public abstract Ll/᩸ۜۚ;
.super Ljava/lang/Object;
.source "L5VZ"


# static fields
.field public static ᩷֫:Ljava/util/Comparator;


# instance fields
.field public ֡:I

.field public ֨:I

.field public ֫:I

.field public ֫֫:I

.field public ۖ:I

.field public ۗ:I

.field public final ۘ:Ljava/util/HashMap;

.field public final ۙ:Ll/ۗۢۚ;

.field public final ۚ:Ll/ۘۢۚ;

.field public ۛ:I

.field public final ۜ:Ll/ۖ᩷ۚ;

.field public ۜ֫:I

.field public final ۟:Ll/ۛۢۚ;

.field public ۠:Z

.field public ۡ:I

.field public ۢ:I

.field public ۤ:I

.field public final ۧ:Ll/᩻ۜۚ;

.field public ۧ֫:I

.field public ۨ:I

.field public ۫:I

.field public ۬:I

.field public final ܰ:[Ll/ۙۜۚ;

.field public ܳ:I

.field public ܳ֫:I

.field public ܶ:I

.field public final ܺ:Ll/᩶᩷ۚ;

.field public ܽ:I

.field public ܽ֫:I

.field public final ܿ:Ll/ۜۜۚ;

.field public final ܿ֫:Ll/֫᩷ۚ;

.field public ᩳ:I

.field public final ᩳ֫:Ll/۟ۜۚ;

.field public ᩴ:I

.field public final ᩵:Ll/ۗ᩷ۚ;

.field public ᩶:I

.field public ᩷:I

.field public ᩸:I

.field public final ᩹:Ll/ܶۢۚ;

.field public final ᩺:Ll/۠ۗ֡;

.field public ᩻:Ljava/util/Comparator;

.field public final ᩻֫:Ll/ܳۡۚ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 184
    new-instance v0, Ll/ۖۜۚ;

    .line 185
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 184
    sput-object v0, Ll/᩸ۜۚ;->᩷֫:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Ll/۠ۗ֡;)V
    .locals 8

    .line 248
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 205
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩸ۜۚ;->ۘ:Ljava/util/HashMap;

    const/4 v0, 0x0

    .line 206
    iput v0, p0, Ll/᩸ۜۚ;->ܽ֫:I

    .line 207
    iput v0, p0, Ll/᩸ۜۚ;->ۜ֫:I

    .line 208
    iput v0, p0, Ll/᩸ۜۚ;->֫֫:I

    .line 209
    iput v0, p0, Ll/᩸ۜۚ;->֨:I

    .line 210
    iput v0, p0, Ll/᩸ۜۚ;->ۗ:I

    .line 211
    iput v0, p0, Ll/᩸ۜۚ;->ۡ:I

    .line 212
    iput v0, p0, Ll/᩸ۜۚ;->᩷:I

    .line 213
    iput v0, p0, Ll/᩸ۜۚ;->᩶:I

    .line 214
    iput v0, p0, Ll/᩸ۜۚ;->ۧ֫:I

    .line 215
    iput v0, p0, Ll/᩸ۜۚ;->ۢ:I

    .line 220
    iput v0, p0, Ll/᩸ۜۚ;->ܳ֫:I

    .line 221
    iput v0, p0, Ll/᩸ۜۚ;->֡:I

    .line 222
    iput v0, p0, Ll/᩸ۜۚ;->ܽ:I

    .line 223
    iput v0, p0, Ll/᩸ۜۚ;->ܳ:I

    .line 224
    iput v0, p0, Ll/᩸ۜۚ;->ᩳ:I

    .line 225
    iput v0, p0, Ll/᩸ۜۚ;->֫:I

    .line 226
    iput v0, p0, Ll/᩸ۜۚ;->ᩴ:I

    .line 227
    iput v0, p0, Ll/᩸ۜۚ;->ۖ:I

    .line 228
    iput v0, p0, Ll/᩸ۜۚ;->ܶ:I

    .line 229
    iput v0, p0, Ll/᩸ۜۚ;->᩸:I

    .line 231
    iput-boolean v0, p0, Ll/᩸ۜۚ;->۠:Z

    .line 233
    iput v0, p0, Ll/᩸ۜۚ;->۫:I

    .line 234
    iput v0, p0, Ll/᩸ۜۚ;->۬:I

    .line 235
    iput v0, p0, Ll/᩸ۜۚ;->ۨ:I

    .line 236
    iput v0, p0, Ll/᩸ۜۚ;->ۛ:I

    .line 237
    iput v0, p0, Ll/᩸ۜۚ;->ۤ:I

    .line 238
    new-instance v1, Ll/ۘۜۚ;

    move-object v2, p0

    check-cast v2, Ll/᩵ۡۚ;

    invoke-direct {v1, v2}, Ll/ۘۜۚ;-><init>(Ll/᩵ۡۚ;)V

    iput-object v1, p0, Ll/᩸ۜۚ;->᩻:Ljava/util/Comparator;

    .line 249
    iput-object p1, p0, Ll/᩸ۜۚ;->᩺:Ll/۠ۗ֡;

    .line 251
    invoke-virtual {p0}, Ll/᩸ۜۚ;->֫()Ll/ᩴۡۚ;

    move-result-object p1

    .line 252
    invoke-virtual {p1}, Ll/ᩴۡۚ;->ۢ()Ll/۟ۜۚ;

    move-result-object v1

    iput-object v1, p0, Ll/᩸ۜۚ;->ᩳ֫:Ll/۟ۜۚ;

    .line 253
    invoke-virtual {p1}, Ll/ᩴۡۚ;->ܺ()Ll/ܳۡۚ;

    move-result-object v1

    iput-object v1, p0, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    .line 254
    invoke-virtual {p1}, Ll/ᩴۡۚ;->᩷()Ll/ۛۢۚ;

    move-result-object v2

    iput-object v2, p0, Ll/᩸ۜۚ;->۟:Ll/ۛۢۚ;

    .line 255
    invoke-virtual {p1}, Ll/ᩴۡۚ;->ܳ()Ll/ۘۢۚ;

    move-result-object v3

    iput-object v3, p0, Ll/᩸ۜۚ;->ۚ:Ll/ۘۢۚ;

    .line 256
    invoke-virtual {p1}, Ll/ᩴۡۚ;->ۜ()Ll/ۗۢۚ;

    move-result-object v4

    iput-object v4, p0, Ll/᩸ۜۚ;->ۙ:Ll/ۗۢۚ;

    .line 257
    invoke-virtual {p1}, Ll/ᩴۡۚ;->ᩳ()Ll/᩶᩷ۚ;

    move-result-object v5

    iput-object v5, p0, Ll/᩸ۜۚ;->ܺ:Ll/᩶᩷ۚ;

    .line 258
    invoke-virtual {p1}, Ll/ᩴۡۚ;->ܽ()Ll/ۖ᩷ۚ;

    move-result-object v5

    iput-object v5, p0, Ll/᩸ۜۚ;->ۜ:Ll/ۖ᩷ۚ;

    .line 259
    invoke-virtual {p1}, Ll/ᩴۡۚ;->᩻()Ll/ܶۢۚ;

    move-result-object v6

    iput-object v6, p0, Ll/᩸ۜۚ;->᩹:Ll/ܶۢۚ;

    .line 260
    invoke-virtual {p1}, Ll/ᩴۡۚ;->ۡ()Ll/֫᩷ۚ;

    move-result-object v7

    iput-object v7, p0, Ll/᩸ۜۚ;->ܿ֫:Ll/֫᩷ۚ;

    .line 261
    invoke-virtual {p1}, Ll/ᩴۡۚ;->֫()Ll/᩻ۜۚ;

    move-result-object v7

    iput-object v7, p0, Ll/᩸ۜۚ;->ۧ:Ll/᩻ۜۚ;

    .line 262
    invoke-virtual {p1}, Ll/ᩴۡۚ;->ۧ()Ll/ۜۜۚ;

    move-result-object v7

    iput-object v7, p0, Ll/᩸ۜۚ;->ܿ:Ll/ۜۜۚ;

    .line 263
    invoke-virtual {p1}, Ll/ᩴۡۚ;->ܿ()Ll/ۗ᩷ۚ;

    move-result-object p1

    iput-object p1, p0, Ll/᩸ۜۚ;->᩵:Ll/ۗ᩷ۚ;

    const/4 p1, 0x6

    new-array p1, p1, [Ll/ۙۜۚ;

    aput-object v1, p1, v0

    const/4 v0, 0x1

    aput-object v2, p1, v0

    const/4 v0, 0x2

    aput-object v3, p1, v0

    const/4 v0, 0x3

    aput-object v4, p1, v0

    const/4 v0, 0x4

    aput-object v5, p1, v0

    const/4 v0, 0x5

    aput-object v6, p1, v0

    .line 265
    iput-object p1, p0, Ll/᩸ۜۚ;->ܰ:[Ll/ۙۜۚ;

    return-void
.end method

.method private ֫(Ll/ܺۜۚ;Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;Ljava/util/List;Ljava/lang/Iterable;I)I
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v12, p2

    move-object/from16 v2, p3

    move/from16 v3, p6

    if-nez p5, :cond_0

    if-nez v3, :cond_0

    const/4 v0, -0x1

    return v0

    .line 1301
    :cond_0
    iget v4, v1, Ll/᩸ۜۚ;->ۛ:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v1, Ll/᩸ۜۚ;->ۛ:I

    .line 1303
    invoke-virtual/range {p1 .. p1}, Ll/ܺۜۚ;->֫()V

    .line 1305
    invoke-virtual/range {p1 .. p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v13

    .line 1307
    iget-object v14, v1, Ll/᩸ۜۚ;->ܺ:Ll/᩶᩷ۚ;

    invoke-virtual {v14, v2}, Ll/᩶᩷ۚ;->֨(Ljava/lang/Object;)I

    move-result v4

    .line 1308
    invoke-virtual {v0, v4}, Ll/ܺۜۚ;->ۧ(I)V

    .line 1310
    sget-object v5, Ll/ܺۗ֡;->ܳ֫:Ll/ܺۗ֡;

    invoke-virtual {v14, v2}, Ll/᩶᩷ۚ;->ۘ(Ljava/lang/Object;)I

    move-result v6

    invoke-virtual {v5, v6}, Ll/ܺۗ֡;->֫(I)Z

    move-result v5

    .line 1312
    iget-object v8, v1, Ll/᩸ۜۚ;->ۙ:Ll/ۗۢۚ;

    invoke-virtual {v8, v2}, Ll/ۗۢۚ;->᩷(Ljava/lang/Object;)Ll/۬ۢۚ;

    move-result-object v6

    iget-object v9, v1, Ll/᩸ۜۚ;->۟:Ll/ۛۢۚ;

    invoke-virtual {v9, v6}, Ll/ۛۢۚ;->֫(Ll/֡ܽۚ;)Ll/֫ۡۚ;

    move-result-object v6

    .line 1311
    iget-object v7, v1, Ll/᩸ۜۚ;->ܿ֫:Ll/֫᩷ۚ;

    invoke-interface {v7, v6}, Ll/֫᩷ۚ;->֫(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    .line 1314
    invoke-static {v6, v5}, Ll/ܿۜۚ;->֫(Ljava/util/List;Z)I

    move-result v5

    const/4 v6, 0x3

    if-gt v5, v4, :cond_16

    .line 1319
    invoke-virtual {v0, v5}, Ll/ܺۜۚ;->ۧ(I)V

    if-eqz p5, :cond_15

    .line 1322
    invoke-static/range {p4 .. p4}, Ll/ᩳܺۚ;->֫(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v15

    .line 1326
    invoke-interface/range {p5 .. p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/16 v16, 0x0

    const/4 v11, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    const/16 v17, 0x2

    if-eqz v10, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩺֫ۚ;

    .line 1327
    invoke-interface {v10}, Ll/᩺֫ۚ;->ۚ()I

    move-result v17

    add-int v11, v17, v11

    .line 1329
    invoke-interface {v10}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v2

    iget v2, v2, Ll/֨ۗ֡;->۬:I

    if-eq v2, v6, :cond_2

    const/4 v6, 0x5

    if-eq v2, v6, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    .line 1342
    :cond_1
    check-cast v10, Ll/ۜۧۚ;

    invoke-interface {v10}, Ll/ۜۧۚ;->᩻()I

    move-result v2

    :goto_1
    move-object/from16 v18, v5

    goto :goto_5

    .line 1331
    :cond_2
    move-object v2, v10

    check-cast v2, Ll/ۧۧۚ;

    .line 1332
    invoke-interface {v2}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v2

    check-cast v2, Ll/ۚܽۚ;

    .line 1333
    invoke-interface {v10}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v6

    move-object/from16 v18, v5

    .line 47
    sget-object v5, Ll/֨ۗ֡;->֡ᩳ:Ll/֨ۗ֡;

    if-eq v6, v5, :cond_6

    sget-object v5, Ll/֨ۗ֡;->ۚᩳ:Ll/֨ۗ֡;

    if-ne v6, v5, :cond_3

    goto :goto_4

    .line 43
    :cond_3
    sget-object v5, Ll/֨ۗ֡;->֨ᩳ:Ll/֨ۗ֡;

    if-eq v6, v5, :cond_5

    sget-object v5, Ll/֨ۗ֡;->۠ᩳ:Ll/֨ۗ֡;

    if-ne v6, v5, :cond_4

    goto :goto_2

    :cond_4
    const/4 v5, 0x0

    goto :goto_3

    :cond_5
    :goto_2
    const/4 v5, 0x1

    .line 90
    :goto_3
    invoke-interface {v2}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v5}, Ll/ܿۜۚ;->֫(Ljava/util/List;Z)I

    move-result v2

    goto :goto_5

    .line 1335
    :cond_6
    :goto_4
    check-cast v10, Ll/ۜۧۚ;

    invoke-interface {v10}, Ll/ۜۧۚ;->᩻()I

    move-result v2

    :goto_5
    if-le v2, v7, :cond_7

    move v7, v2

    :cond_7
    const/4 v6, 0x3

    move-object/from16 v2, p3

    move-object/from16 v5, v18

    goto :goto_0

    :cond_8
    const/4 v2, 0x1

    const/4 v5, 0x5

    if-le v7, v5, :cond_a

    if-gt v7, v4, :cond_9

    goto :goto_6

    .line 1351
    :cond_9
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v3, v6, v16

    aput-object v4, v6, v2

    aput-object v5, v6, v17

    const-string v2, "outs_size (%dd) > registers_size (%dd): %s"

    invoke-static {v2, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1354
    :cond_a
    :goto_6
    invoke-virtual {v0, v7}, Ll/ܺۜۚ;->ۧ(I)V

    .line 1355
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/ܺۜۚ;->ۧ(I)V

    .line 130
    invoke-static {v0, v3}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 160
    new-instance v10, Ll/۬ۜۚ;

    iget-object v3, v1, Ll/᩸ۜۚ;->᩺:Ll/۠ۗ֡;

    iget-object v5, v1, Ll/᩸ۜۚ;->ᩳ֫:Ll/۟ۜۚ;

    iget-object v7, v1, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    iget-object v6, v1, Ll/᩸ۜۚ;->ۚ:Ll/ۘۢۚ;

    iget-object v4, v1, Ll/᩸ۜۚ;->᩹:Ll/ܶۢۚ;

    iget-object v2, v1, Ll/᩸ۜۚ;->ۜ:Ll/ۖ᩷ۚ;

    move-object/from16 v17, v2

    move-object v2, v10

    move-object/from16 v18, v4

    move-object/from16 v4, p1

    move-object/from16 v19, v6

    move-object v6, v7

    move-object v1, v7

    move-object/from16 v7, v19

    move/from16 v19, v13

    move-object v13, v10

    move-object/from16 v10, v18

    move-object/from16 v18, v1

    move v1, v11

    move-object/from16 v11, v17

    invoke-direct/range {v2 .. v11}, Ll/۬ۜۚ;-><init>(Ll/۠ۗ֡;Ll/ܺۜۚ;Ll/۟ۜۚ;Ll/ܳۡۚ;Ll/ۘۢۚ;Ll/ۗۢۚ;Ll/ۛۢۚ;Ll/ܶۢۚ;Ll/ۖ᩷ۚ;)V

    .line 130
    invoke-static {v0, v1}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 1364
    invoke-interface/range {p5 .. p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺֫ۚ;

    .line 1366
    :try_start_0
    sget-object v5, Ll/֡ۜۚ;->֫:[I

    invoke-interface {v3}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v6

    iget-object v6, v6, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v5, v5, v6

    packed-switch v5, :pswitch_data_0

    .line 1476
    new-instance v0, Ll/ܶ᩵ۚ;

    goto/16 :goto_9

    .line 1473
    :pswitch_0
    move-object v4, v3

    check-cast v4, Ll/ܺܽۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/ܺܽۚ;)V

    goto/16 :goto_8

    .line 1470
    :pswitch_1
    move-object v4, v3

    check-cast v4, Ll/ۡܽۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/ۡܽۚ;)V

    goto/16 :goto_8

    .line 1467
    :pswitch_2
    move-object v4, v3

    check-cast v4, Ll/ۡۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/ۡۧۚ;)V

    goto/16 :goto_8

    .line 1464
    :pswitch_3
    move-object v4, v3

    check-cast v4, Ll/ۢܽۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/ۢܽۚ;)V

    goto/16 :goto_8

    .line 1461
    :pswitch_4
    move-object v4, v3

    check-cast v4, Ll/᩷ܽۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/᩷ܽۚ;)V

    goto/16 :goto_8

    .line 1458
    :pswitch_5
    move-object v4, v3

    check-cast v4, Ll/ۜܽۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/ۜܽۚ;)V

    goto/16 :goto_8

    .line 1455
    :pswitch_6
    move-object v4, v3

    check-cast v4, Ll/᩻ܽۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/᩻ܽۚ;)V

    goto/16 :goto_8

    .line 1452
    :pswitch_7
    move-object v4, v3

    check-cast v4, Ll/ܳܽۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/ܳܽۚ;)V

    goto/16 :goto_8

    .line 1449
    :pswitch_8
    move-object v4, v3

    check-cast v4, Ll/ܿܽۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/ܿܽۚ;)V

    goto/16 :goto_8

    .line 1446
    :pswitch_9
    move-object v4, v3

    check-cast v4, Ll/ᩳܽۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/ᩳܽۚ;)V

    goto/16 :goto_8

    .line 1443
    :pswitch_a
    move-object v4, v3

    check-cast v4, Ll/ܽܽۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/ܽܽۚ;)V

    goto/16 :goto_8

    .line 1440
    :pswitch_b
    move-object v4, v3

    check-cast v4, Ll/ۧܽۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/ۧܽۚ;)V

    goto/16 :goto_8

    .line 1437
    :pswitch_c
    move-object v4, v3

    check-cast v4, Ll/֫ܽۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/֫ܽۚ;)V

    goto/16 :goto_8

    .line 1434
    :pswitch_d
    move-object v4, v3

    check-cast v4, Ll/۟ۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/۟ۧۚ;)V

    goto/16 :goto_8

    .line 1431
    :pswitch_e
    move-object v4, v3

    check-cast v4, Ll/ܰۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/ܰۧۚ;)V

    goto/16 :goto_8

    .line 1428
    :pswitch_f
    move-object v4, v3

    check-cast v4, Ll/᩺ۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/᩺ۧۚ;)V

    goto/16 :goto_8

    .line 1425
    :pswitch_10
    move-object v4, v3

    check-cast v4, Ll/ۨۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/ۨۧۚ;)V

    goto/16 :goto_8

    .line 1422
    :pswitch_11
    move-object v4, v3

    check-cast v4, Ll/ۛۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/ۛۧۚ;)V

    goto/16 :goto_8

    .line 1419
    :pswitch_12
    move-object v4, v3

    check-cast v4, Ll/ۤۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/ۤۧۚ;)V

    goto/16 :goto_8

    .line 1416
    :pswitch_13
    move-object v4, v3

    check-cast v4, Ll/۫ۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/۫ۧۚ;)V

    goto/16 :goto_8

    .line 1413
    :pswitch_14
    move-object v4, v3

    check-cast v4, Ll/۬ۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/۬ۧۚ;)V

    goto/16 :goto_8

    .line 1410
    :pswitch_15
    move-object v4, v3

    check-cast v4, Ll/ۗۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/ۗۧۚ;)V

    goto :goto_8

    .line 1407
    :pswitch_16
    move-object v4, v3

    check-cast v4, Ll/ۙۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/ۙۧۚ;)V

    goto :goto_8

    .line 1404
    :pswitch_17
    move-object v4, v3

    check-cast v4, Ll/᩶ۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/᩶ۧۚ;)V

    goto :goto_8

    .line 1401
    :pswitch_18
    move-object v4, v3

    check-cast v4, Ll/᩹ۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/᩹ۧۚ;)V

    goto :goto_8

    .line 1398
    :pswitch_19
    move-object v4, v3

    check-cast v4, Ll/᩸ۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/᩸ۧۚ;)V

    goto :goto_8

    .line 1395
    :pswitch_1a
    move-object v4, v3

    check-cast v4, Ll/ܶۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/ܶۧۚ;)V

    goto :goto_8

    .line 1392
    :pswitch_1b
    move-object v4, v3

    check-cast v4, Ll/۠ۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/۠ۧۚ;)V

    goto :goto_8

    .line 1389
    :pswitch_1c
    move-object v4, v3

    check-cast v4, Ll/֨ۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/֨ۧۚ;)V

    goto :goto_8

    .line 1386
    :pswitch_1d
    move-object v4, v3

    check-cast v4, Ll/ۚۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/ۚۧۚ;)V

    goto :goto_8

    .line 1383
    :pswitch_1e
    move-object v4, v3

    check-cast v4, Ll/֡ۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/֡ۧۚ;)V

    goto :goto_8

    .line 1380
    :pswitch_1f
    move-object v4, v3

    check-cast v4, Ll/᩵ۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/᩵ۧۚ;)V

    goto :goto_8

    .line 1377
    :pswitch_20
    move-object v4, v3

    check-cast v4, Ll/ᩴۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/ᩴۧۚ;)V

    goto :goto_8

    .line 1374
    :pswitch_21
    move-object v4, v3

    check-cast v4, Ll/ۘۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/ۘۧۚ;)V

    goto :goto_8

    .line 1371
    :pswitch_22
    move-object v4, v3

    check-cast v4, Ll/ۖۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/ۖۧۚ;)V

    goto :goto_8

    .line 1368
    :pswitch_23
    move-object v4, v3

    check-cast v4, Ll/ܺۧۚ;

    invoke-virtual {v13, v4}, Ll/۬ۜۚ;->֫(Ll/ܺۧۚ;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1482
    :goto_8
    invoke-interface {v3}, Ll/᩺֫ۚ;->ۚ()I

    move-result v3

    add-int/2addr v2, v3

    goto/16 :goto_7

    :goto_9
    :try_start_1
    const-string v1, "Unsupported instruction format: %s"

    .line 1477
    invoke-interface {v3}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v3

    iget-object v3, v3, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v3, v5, v16

    .line 46
    invoke-direct {v0, v4, v1, v5}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1477
    throw v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v0

    .line 1480
    new-instance v1, Ll/ܶ᩵ۚ;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v2, v3, v16

    const-string v2, "Error while writing instruction at code offset 0x%x"

    invoke-direct {v1, v0, v2, v3}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    throw v1

    .line 1485
    :cond_b
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_14

    .line 1486
    invoke-virtual/range {p1 .. p1}, Ll/ܺۜۚ;->֫()V

    .line 238
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 1490
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚ֫ۚ;

    .line 1491
    invoke-interface {v3}, Ll/ۚ֫ۚ;->ۧ()Ljava/util/List;

    move-result-object v3

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    .line 1493
    :cond_c
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v2

    invoke-static {v12, v2}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    .line 1495
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_d
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚ֫ۚ;

    .line 1496
    invoke-interface {v3}, Ll/ۚ֫ۚ;->֫()I

    move-result v5

    .line 1497
    invoke-interface {v3}, Ll/ۚ֫ۚ;->ܽ()I

    move-result v6

    add-int/2addr v6, v5

    sub-int/2addr v6, v5

    .line 130
    invoke-static {v0, v5}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 1502
    invoke-virtual {v0, v6}, Ll/ܺۜۚ;->ۧ(I)V

    .line 1504
    invoke-interface {v3}, Ll/ۚ֫ۚ;->ۧ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-eqz v5, :cond_12

    .line 1508
    invoke-interface {v3}, Ll/ۚ֫ۚ;->ۧ()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    .line 1509
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-eqz v6, :cond_e

    .line 1511
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0, v3}, Ll/ܺۜۚ;->ۧ(I)V

    goto :goto_b

    .line 1514
    :cond_e
    invoke-virtual/range {p2 .. p2}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 1515
    invoke-virtual {v0, v5}, Ll/ܺۜۚ;->ۧ(I)V

    .line 1516
    invoke-interface {v3}, Ll/ۚ֫ۚ;->ۧ()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1519
    invoke-interface {v3}, Ll/ۚ֫ۚ;->ۧ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    .line 1520
    invoke-interface {v3}, Ll/ۚ֫ۚ;->ۧ()Ljava/util/List;

    move-result-object v6

    add-int/lit8 v7, v5, -0x1

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۖ֫ۚ;

    .line 1521
    invoke-interface {v6}, Ll/ۖ֫ۚ;->ܽۧ()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_f

    mul-int/lit8 v5, v5, -0x1

    add-int/lit8 v5, v5, 0x1

    .line 1526
    :cond_f
    invoke-static {v12, v5}, Ll/ܺۜۚ;->ۧ(Ljava/io/OutputStream;I)V

    .line 1527
    invoke-interface {v3}, Ll/ۚ֫ۚ;->ۧ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۖ֫ۚ;

    .line 1528
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    invoke-interface {v5}, Ll/ۖ֫ۚ;->۫ۧ()Ll/᩸ܽۚ;

    move-result-object v6

    if-nez v6, :cond_10

    move-object v6, v4

    goto :goto_d

    .line 434
    :cond_10
    :try_start_2
    check-cast v6, Ll/᩻ۡۚ;
    :try_end_2
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_1

    .line 1530
    :goto_d
    invoke-interface {v5}, Ll/ۖ֫ۚ;->۟()I

    move-result v5

    if-eqz v6, :cond_11

    move-object/from16 v7, v18

    .line 1534
    invoke-virtual {v7, v6}, Ll/ܳۡۚ;->ܳ(Ljava/lang/Object;)I

    move-result v6

    invoke-static {v12, v6}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    .line 1535
    invoke-static {v12, v5}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    goto :goto_c

    :cond_11
    move-object/from16 v7, v18

    .line 1538
    invoke-static {v12, v5}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    goto :goto_c

    .line 436
    :catch_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Only TypeReference instances returned by DexBuilder.internTypeReference or DexBuilder.internNullableTypeReference may be used."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1505
    :cond_12
    new-instance v0, Ll/ܶ᩵ۚ;

    const-string v1, "No exception handlers for the try block!"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    .line 46
    invoke-direct {v0, v4, v1, v2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1505
    throw v0

    .line 1544
    :cond_13
    invoke-virtual/range {p2 .. p2}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v1

    if-lez v1, :cond_14

    .line 1545
    invoke-virtual {v12, v0}, Ljava/io/ByteArrayOutputStream;->writeTo(Ljava/io/OutputStream;)V

    .line 1546
    invoke-virtual/range {p2 .. p2}, Ljava/io/ByteArrayOutputStream;->reset()V

    :cond_14
    return v19

    :cond_15
    move/from16 v19, v13

    const/4 v1, 0x0

    .line 1551
    invoke-virtual {v0, v1}, Ll/ܺۜۚ;->ۧ(I)V

    .line 1552
    invoke-virtual {v0, v1}, Ll/ܺۜۚ;->ۧ(I)V

    .line 130
    invoke-static {v0, v3}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    invoke-static {v0, v1}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    return v19

    :cond_16
    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 1316
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v3, v6, v0

    const/4 v0, 0x1

    aput-object v4, v6, v0

    aput-object v5, v6, v1

    const-string v0, "ins_size (%dd) > registers_size (%dd): %s"

    invoke-static {v0, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private ֫(Ll/ܺۜۚ;Ll/ܺۜۚ;ILjava/util/Map$Entry;)I
    .locals 8

    if-nez p4, :cond_0

    goto :goto_0

    .line 756
    :cond_0
    invoke-interface {p4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    :goto_0
    return p3

    .line 761
    :cond_1
    invoke-interface {p4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Comparable;

    const/4 v1, 0x0

    .line 764
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p4, v2}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 768
    iget-object v2, p0, Ll/᩸ۜۚ;->ܺ:Ll/᩶᩷ۚ;

    invoke-virtual {v2, v0}, Ll/᩶᩷ۚ;->ۖ(Ljava/lang/Comparable;)Ll/᩻ۡۚ;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩶᩷ۚ;->֫(Ljava/lang/CharSequence;)Ljava/util/Map$Entry;

    move-result-object v3

    .line 769
    invoke-direct {p0, p1, p2, p3, v3}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;Ll/ܺۜۚ;ILjava/util/Map$Entry;)I

    move-result p3

    .line 772
    invoke-virtual {v2, v0}, Ll/᩶᩷ۚ;->ᩳ(Ljava/lang/Comparable;)Ll/֫ۡۚ;

    move-result-object v3

    iget-object v4, p0, Ll/᩸ۜۚ;->ܿ֫:Ll/֫᩷ۚ;

    invoke-interface {v4, v3}, Ll/֫᩷ۚ;->֫(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    .line 773
    invoke-virtual {v2, v5}, Ll/᩶᩷ۚ;->֫(Ljava/lang/CharSequence;)Ljava/util/Map$Entry;

    move-result-object v5

    .line 774
    invoke-direct {p0, p1, p2, p3, v5}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;Ll/ܺۜۚ;ILjava/util/Map$Entry;)I

    move-result p3

    goto :goto_1

    :cond_2
    add-int/lit8 v3, p3, 0x1

    .line 778
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p4, p3}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 782
    invoke-virtual {v2, v0}, Ll/᩶᩷ۚ;->ۘ(Ljava/lang/Comparable;)Ll/᩻ۡۚ;

    move-result-object p3

    iget-object p4, p0, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    invoke-virtual {p4, p3}, Ll/ܳۡۚ;->ܳ(Ljava/lang/Object;)I

    move-result p3

    .line 130
    invoke-static {p1, p3}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 783
    invoke-virtual {v2, v0}, Ll/᩶᩷ۚ;->֫(Ljava/lang/Comparable;)I

    move-result p3

    .line 130
    invoke-static {p1, p3}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 784
    invoke-virtual {v2, v0}, Ll/᩶᩷ۚ;->ۖ(Ljava/lang/Comparable;)Ll/᩻ۡۚ;

    move-result-object p3

    invoke-virtual {p4, p3}, Ll/ܳۡۚ;->ܽ(Ljava/lang/Object;)I

    move-result p3

    .line 130
    invoke-static {p1, p3}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 785
    invoke-virtual {v2, v0}, Ll/᩶᩷ۚ;->ᩳ(Ljava/lang/Comparable;)Ll/֫ۡۚ;

    move-result-object p3

    invoke-interface {v4, p3}, Ll/ۨۜۚ;->ᩳ(Ljava/lang/Object;)I

    move-result p3

    .line 130
    invoke-static {p1, p3}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 786
    iget-object p3, p0, Ll/᩸ۜۚ;->ᩳ֫:Ll/۟ۜۚ;

    invoke-virtual {v2, v0}, Ll/᩶᩷ۚ;->ۡ(Ljava/lang/Comparable;)Ll/۟ۢۚ;

    move-result-object p4

    invoke-interface {p3, p4}, Ll/ۛۜۚ;->ܽ(Ljava/lang/Object;)I

    move-result p3

    .line 130
    invoke-static {p1, p3}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 787
    invoke-virtual {v2, v0}, Ll/᩶᩷ۚ;->ۧ(Ljava/lang/Comparable;)I

    move-result p3

    .line 130
    invoke-static {p1, p3}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 789
    invoke-virtual {v2, v0}, Ll/᩶᩷ۚ;->᩷(Ljava/lang/Comparable;)Ljava/util/SortedSet;

    move-result-object p3

    .line 790
    invoke-virtual {v2, v0}, Ll/᩶᩷ۚ;->᩻(Ljava/lang/Comparable;)Ljava/util/SortedSet;

    move-result-object p4

    .line 791
    invoke-virtual {v2, v0}, Ll/᩶᩷ۚ;->ܿ(Ljava/lang/Comparable;)Ll/᩻۫ܺ;

    move-result-object v4

    .line 792
    invoke-virtual {v2, v0}, Ll/᩶᩷ۚ;->ۢ(Ljava/lang/Comparable;)Ll/᩻۫ܺ;

    move-result-object v5

    .line 793
    invoke-interface {p3}, Ljava/util/Collection;->size()I

    move-result v6

    if-gtz v6, :cond_4

    .line 794
    invoke-interface {p4}, Ljava/util/Collection;->size()I

    move-result v6

    if-gtz v6, :cond_4

    .line 795
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v6

    if-gtz v6, :cond_4

    .line 796
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v6

    if-lez v6, :cond_3

    goto :goto_2

    :cond_3
    const/4 v6, 0x0

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v6, 0x1

    :goto_3
    if-eqz v6, :cond_5

    .line 799
    invoke-virtual {p2}, Ll/ܺۜۚ;->getPosition()I

    move-result v7

    .line 130
    invoke-static {p1, v7}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    goto :goto_4

    :cond_5
    invoke-static {p1, v1}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 804
    :goto_4
    invoke-virtual {v2, v0}, Ll/᩶᩷ۚ;->ܺ(Ljava/lang/Comparable;)Ll/۫᩷ۚ;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 806
    iget-object v1, p0, Ll/᩸ۜۚ;->᩵:Ll/ۗ᩷ۚ;

    invoke-virtual {v1, v0}, Ll/ۗ᩷ۚ;->ۧ(Ljava/lang/Object;)I

    move-result v0

    .line 130
    invoke-static {p1, v0}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    goto :goto_5

    :cond_6
    invoke-static {p1, v1}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    :goto_5
    if-eqz v6, :cond_7

    .line 813
    iget p1, p0, Ll/᩸ۜۚ;->ۤ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/᩸ۜۚ;->ۤ:I

    .line 815
    invoke-interface {p3}, Ljava/util/Collection;->size()I

    move-result p1

    .line 157
    invoke-static {p2, p1}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    .line 816
    invoke-interface {p4}, Ljava/util/Collection;->size()I

    move-result p1

    .line 157
    invoke-static {p2, p1}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    .line 817
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result p1

    .line 157
    invoke-static {p2, p1}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    .line 818
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result p1

    .line 157
    invoke-static {p2, p1}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    .line 820
    invoke-direct {p0, p2, p3}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;Ljava/util/SortedSet;)V

    .line 821
    invoke-direct {p0, p2, p4}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;Ljava/util/SortedSet;)V

    .line 822
    invoke-direct {p0, p2, v4}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;Ll/᩻۫ܺ;)V

    .line 823
    invoke-direct {p0, p2, v5}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;Ll/᩻۫ܺ;)V

    :cond_7
    return v3
.end method

.method public static bridge synthetic ֫(Ll/ۚۡۚ;I)Ll/ܺۜۚ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩸ۜۚ;->ۧ(Ll/ۚۡۚ;I)Ll/ܺۜۚ;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ll/ۚۡۚ;Ll/ܺۜۚ;Ll/ܺۜۚ;)V
    .locals 4

    .line 608
    invoke-virtual {p2}, Ll/ܺۜۚ;->getPosition()I

    move-result v0

    iput v0, p0, Ll/᩸ۜۚ;->ۡ:I

    .line 609
    invoke-virtual {p3}, Ll/ܺۜۚ;->getPosition()I

    move-result v0

    iput v0, p0, Ll/᩸ۜۚ;->ۢ:I

    .line 611
    iget-object v0, p0, Ll/᩸ۜۚ;->ܺ:Ll/᩶᩷ۚ;

    invoke-virtual {v0}, Ll/᩶᩷ۚ;->֫()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/util/AbstractCollection;

    .line 135
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 278
    new-instance v1, Ll/ᩴۜۚ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 612
    invoke-static {v2, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 615
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 616
    invoke-direct {p0, p2, p3, v2, v3}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;Ll/ܺۜۚ;ILjava/util/Map$Entry;)I

    move-result v2

    goto :goto_0

    .line 619
    :cond_0
    invoke-virtual {p0}, Ll/᩸ۜۚ;->ܽ()Z

    move-result p2

    if-nez p2, :cond_1

    return-void

    .line 623
    :cond_1
    invoke-virtual {p3}, Ll/ܺۜۚ;->֫()V

    .line 624
    invoke-virtual {p3}, Ll/ܺۜۚ;->getPosition()I

    move-result p2

    iput p2, p0, Ll/᩸ۜۚ;->ܶ:I

    .line 626
    invoke-virtual {v0}, Ll/᩶᩷ۚ;->֫()Ljava/util/Collection;

    move-result-object p2

    check-cast p2, Ljava/util/AbstractCollection;

    .line 135
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 287
    new-instance p2, Ll/᩵ۜۚ;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 627
    invoke-static {v1, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 628
    new-instance p2, Ll/۠ۜۚ;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {p2, p1, p3, v2}, Ll/۠ۜۚ;-><init>(Ll/ۚۡۚ;Ll/ܺۜۚ;I)V

    .line 631
    :try_start_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    .line 633
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Comparable;

    invoke-virtual {v0, v1}, Ll/᩶᩷ۚ;->᩷(Ljava/lang/Comparable;)Ljava/util/SortedSet;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 634
    invoke-virtual {v0, v2}, Ll/᩶᩷ۚ;->ܺ(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual {p2, v2}, Ll/۠ۜۚ;->֫(Ljava/util/Set;)V

    goto :goto_2

    .line 637
    :cond_2
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Comparable;

    invoke-virtual {v0, v1}, Ll/᩶᩷ۚ;->᩻(Ljava/lang/Comparable;)Ljava/util/SortedSet;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 638
    invoke-virtual {v0, v2}, Ll/᩶᩷ۚ;->ܺ(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual {p2, v2}, Ll/۠ۜۚ;->֫(Ljava/util/Set;)V

    goto :goto_3

    .line 641
    :cond_3
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Comparable;

    invoke-virtual {v0, v1}, Ll/᩶᩷ۚ;->ܿ(Ljava/lang/Comparable;)Ll/᩻۫ܺ;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 642
    invoke-virtual {v0, v2}, Ll/᩶᩷ۚ;->᩵(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual {p2, v2}, Ll/۠ۜۚ;->֫(Ljava/util/Set;)V

    goto :goto_4

    .line 645
    :cond_4
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Comparable;

    invoke-virtual {v0, p3}, Ll/᩶᩷ۚ;->ۢ(Ljava/lang/Comparable;)Ll/᩻۫ܺ;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_5
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 646
    invoke-virtual {v0, v1}, Ll/᩶᩷ۚ;->᩵(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p2, v1}, Ll/۠ۜۚ;->֫(Ljava/util/Set;)V

    goto :goto_5

    .line 649
    :cond_5
    invoke-virtual {p2}, Ll/۠ۜۚ;->ۧ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_1

    .line 652
    :cond_6
    invoke-virtual {p2}, Ll/۠ۜۚ;->֫()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p2}, Ll/۠ۜۚ;->֫()V

    .line 653
    throw p1
.end method

.method private ֫(Ll/ܺۜۚ;)V
    .locals 14

    .line 1043
    invoke-virtual {p1}, Ll/ܺۜۚ;->֫()V

    .line 1044
    invoke-virtual {p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v0

    iput v0, p0, Ll/᩸ۜۚ;->֫:I

    .line 238
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/high16 v1, 0x10000

    .line 1047
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 1048
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1050
    iget-object v2, p0, Ll/᩸ۜۚ;->ܺ:Ll/᩶᩷ۚ;

    invoke-virtual {v2}, Ll/᩶᩷ۚ;->ᩳ()Ll/ܳ۬ܺ;

    move-result-object v3

    const/4 v4, 0x0

    .line 375
    invoke-virtual {v3, v4}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v3

    .line 1050
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Comparable;

    .line 1054
    invoke-virtual {v2, v5}, Ll/᩶᩷ۚ;->ܳ(Ljava/lang/Comparable;)Ljava/util/Collection;

    move-result-object v6

    .line 1055
    invoke-virtual {v2, v5}, Ll/᩶᩷ۚ;->ۜ(Ljava/lang/Comparable;)Ljava/util/Collection;

    move-result-object v7

    .line 1058
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v8

    mul-int/lit8 v8, v8, 0x8

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v9

    mul-int/lit8 v9, v9, 0x10

    add-int/2addr v9, v8

    .line 1059
    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    move-result v8

    if-le v9, v8, :cond_1

    .line 1060
    invoke-static {v9}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 1061
    sget-object v8, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1064
    :cond_1
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 1070
    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v8, 0x0

    :cond_2
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    iget-object v10, p0, Ll/᩸ۜۚ;->ܿ:Ll/ۜۜۚ;

    if-eqz v9, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 1071
    invoke-virtual {v2, v9}, Ll/᩶᩷ۚ;->ۡ(Ljava/lang/Object;)Ll/ۜ᩷ۚ;

    move-result-object v11

    if-eqz v11, :cond_2

    add-int/lit8 v8, v8, 0x1

    .line 1074
    iget-object v12, p0, Ll/᩸ۜۚ;->ۚ:Ll/ۘۢۚ;

    invoke-virtual {v12, v9}, Ll/ۘۢۚ;->᩻(Ljava/lang/Object;)I

    move-result v9

    invoke-virtual {v1, v9}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 1075
    invoke-interface {v10, v11}, Ll/᩺ۜۚ;->ۧ(Ljava/lang/Object;)I

    move-result v9

    invoke-virtual {v1, v9}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    goto :goto_1

    .line 1079
    :cond_3
    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v9, 0x0

    :cond_4
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    iget-object v12, p0, Ll/᩸ۜۚ;->ۙ:Ll/ۗۢۚ;

    if-eqz v11, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 1080
    invoke-virtual {v2, v11}, Ll/᩶᩷ۚ;->ᩴ(Ljava/lang/Object;)Ll/ۜ᩷ۚ;

    move-result-object v13

    if-eqz v13, :cond_4

    add-int/lit8 v9, v9, 0x1

    .line 1083
    invoke-virtual {v12, v11}, Ll/ۗۢۚ;->᩻(Ljava/lang/Object;)I

    move-result v11

    invoke-virtual {v1, v11}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 1084
    invoke-interface {v10, v13}, Ll/᩺ۜۚ;->ۧ(Ljava/lang/Object;)I

    move-result v11

    invoke-virtual {v1, v11}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    goto :goto_2

    .line 1088
    :cond_5
    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v7, 0x0

    :cond_6
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 1089
    invoke-virtual {v2, v11}, Ll/᩶᩷ۚ;->᩻(Ljava/lang/Object;)I

    move-result v13

    if-eqz v13, :cond_6

    add-int/lit8 v7, v7, 0x1

    .line 1092
    invoke-virtual {v12, v11}, Ll/ۗۢۚ;->᩻(Ljava/lang/Object;)I

    move-result v11

    invoke-virtual {v1, v11}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 1093
    invoke-virtual {v1, v13}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    goto :goto_3

    .line 1099
    :cond_7
    invoke-virtual {v2, v5}, Ll/᩶᩷ۚ;->ܽ(Ljava/lang/Comparable;)Ll/ۜ᩷ۚ;

    move-result-object v6

    if-nez v8, :cond_9

    if-nez v9, :cond_9

    if-nez v7, :cond_9

    if-eqz v6, :cond_0

    .line 1103
    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    if-eqz v11, :cond_8

    .line 1105
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {v2, v6, v5}, Ll/᩶᩷ۚ;->֫(ILjava/lang/Comparable;)V

    goto/16 :goto_0

    .line 1108
    :cond_8
    invoke-virtual {p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v0, v6, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1116
    :cond_9
    iget v11, p0, Ll/᩸ۜۚ;->۬:I

    add-int/lit8 v11, v11, 0x1

    iput v11, p0, Ll/᩸ۜۚ;->۬:I

    .line 1117
    invoke-virtual {p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v11

    invoke-virtual {v2, v11, v5}, Ll/᩶᩷ۚ;->֫(ILjava/lang/Comparable;)V

    .line 1119
    invoke-interface {v10, v6}, Ll/ۨۜۚ;->ᩳ(Ljava/lang/Object;)I

    move-result v5

    .line 130
    invoke-static {p1, v5}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    invoke-static {p1, v8}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    invoke-static {p1, v9}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    invoke-static {p1, v7}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 1123
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v5

    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    move-result v6

    invoke-virtual {p1, v5, v4, v6}, Ll/ܺۜۚ;->write([BII)V

    goto/16 :goto_0

    :cond_a
    return-void
.end method

.method private ֫(Ll/ܺۜۚ;II)V
    .locals 3

    .line 1677
    iget-object v0, p0, Ll/᩸ۜۚ;->᩺:Ll/۠ۗ֡;

    iget v0, v0, Ll/۠ۗ֡;->֫:I

    invoke-static {v0}, Ll/ۚܰ֡;->֫(I)[B

    move-result-object v0

    .line 115
    array-length v1, v0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Ll/ܺۜۚ;->write([BII)V

    .line 130
    invoke-static {p1, v2}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    const/16 v0, 0x14

    new-array v1, v0, [B

    .line 115
    invoke-virtual {p1, v1, v2, v0}, Ll/ܺۜۚ;->write([BII)V

    .line 130
    invoke-static {p1, p3}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    const/16 v0, 0x70

    invoke-static {p1, v0}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    const v0, 0x12345678

    invoke-static {p1, v0}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    invoke-static {p1, v2}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    invoke-static {p1, v2}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 1694
    iget v0, p0, Ll/᩸ۜۚ;->᩸:I

    .line 130
    invoke-static {p1, v0}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 1698
    iget-object v0, p0, Ll/᩸ۜۚ;->ᩳ֫:Ll/۟ۜۚ;

    invoke-interface {v0}, Ll/ۙۜۚ;->֫()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ll/ۚۢۚ;

    invoke-virtual {v0}, Ll/ۚۢۚ;->size()I

    move-result v0

    iget v1, p0, Ll/᩸ۜۚ;->ܽ֫:I

    invoke-static {p1, v0, v1}, Ll/᩸ۜۚ;->ۧ(Ll/ܺۜۚ;II)V

    .line 1699
    iget-object v0, p0, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    invoke-virtual {v0}, Ll/ܳۡۚ;->֫()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ll/ۚۢۚ;

    invoke-virtual {v0}, Ll/ۚۢۚ;->size()I

    move-result v0

    iget v1, p0, Ll/᩸ۜۚ;->ۜ֫:I

    invoke-static {p1, v0, v1}, Ll/᩸ۜۚ;->ۧ(Ll/ܺۜۚ;II)V

    .line 1700
    iget-object v0, p0, Ll/᩸ۜۚ;->۟:Ll/ۛۢۚ;

    invoke-virtual {v0}, Ll/ۛۢۚ;->֫()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ll/ۚۢۚ;

    invoke-virtual {v0}, Ll/ۚۢۚ;->size()I

    move-result v0

    iget v1, p0, Ll/᩸ۜۚ;->֫֫:I

    invoke-static {p1, v0, v1}, Ll/᩸ۜۚ;->ۧ(Ll/ܺۜۚ;II)V

    .line 1701
    iget-object v0, p0, Ll/᩸ۜۚ;->ۚ:Ll/ۘۢۚ;

    invoke-virtual {v0}, Ll/ۘۢۚ;->֫()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ll/ۚۢۚ;

    invoke-virtual {v0}, Ll/ۚۢۚ;->size()I

    move-result v0

    iget v1, p0, Ll/᩸ۜۚ;->֨:I

    invoke-static {p1, v0, v1}, Ll/᩸ۜۚ;->ۧ(Ll/ܺۜۚ;II)V

    .line 1702
    iget-object v0, p0, Ll/᩸ۜۚ;->ۙ:Ll/ۗۢۚ;

    invoke-virtual {v0}, Ll/ۗۢۚ;->֫()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ll/ۚۢۚ;

    invoke-virtual {v0}, Ll/ۚۢۚ;->size()I

    move-result v0

    iget v1, p0, Ll/᩸ۜۚ;->ۗ:I

    invoke-static {p1, v0, v1}, Ll/᩸ۜۚ;->ۧ(Ll/ܺۜۚ;II)V

    .line 1703
    iget-object v0, p0, Ll/᩸ۜۚ;->ܺ:Ll/᩶᩷ۚ;

    invoke-virtual {v0}, Ll/᩶᩷ۚ;->֫()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ll/ۚۢۚ;

    invoke-virtual {v0}, Ll/ۚۢۚ;->size()I

    move-result v0

    iget v1, p0, Ll/᩸ۜۚ;->ۡ:I

    invoke-static {p1, v0, v1}, Ll/᩸ۜۚ;->ۧ(Ll/ܺۜۚ;II)V

    sub-int/2addr p3, p2

    .line 130
    invoke-static {p1, p3}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    invoke-static {p1, p2}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    return-void
.end method

.method public static ֫(Ll/ܺۜۚ;III)V
    .locals 0

    if-lez p2, :cond_0

    .line 1668
    invoke-virtual {p0, p1}, Ll/ܺۜۚ;->ۧ(I)V

    const/4 p1, 0x0

    .line 1669
    invoke-virtual {p0, p1}, Ll/ܺۜۚ;->ۧ(I)V

    .line 130
    invoke-static {p0, p2}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    invoke-static {p0, p3}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    :cond_0
    return-void
.end method

.method private ֫(Ll/ܺۜۚ;Ljava/util/SortedSet;)V
    .locals 5

    .line 908
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 909
    iget-object v2, p0, Ll/᩸ۜۚ;->ۚ:Ll/ۘۢۚ;

    invoke-virtual {v2, v1}, Ll/ۘۢۚ;->᩻(Ljava/lang/Object;)I

    move-result v2

    .line 910
    iget-object v3, p0, Ll/᩸ۜۚ;->ܺ:Ll/᩶᩷ۚ;

    invoke-virtual {v3, v1}, Ll/᩶᩷ۚ;->ܺ(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    const/4 v4, 0x1

    .line 911
    iput-boolean v4, p0, Ll/᩸ۜۚ;->۠:Z

    :cond_0
    sub-int v0, v2, v0

    .line 157
    invoke-static {p1, v0}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    .line 914
    invoke-virtual {v3, v1}, Ll/᩶᩷ۚ;->ۢ(Ljava/lang/Object;)I

    move-result v0

    .line 157
    invoke-static {p1, v0}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    move v0, v2

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ֫(Ll/ܺۜۚ;Ll/ܺۜۚ;)V
    .locals 5

    .line 529
    invoke-virtual {p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v0

    iput v0, p0, Ll/᩸ۜۚ;->ܽ֫:I

    .line 530
    invoke-virtual {p2}, Ll/ܺۜۚ;->getPosition()I

    move-result v0

    iput v0, p0, Ll/᩸ۜۚ;->ۧ֫:I

    .line 532
    iget-object v0, p0, Ll/᩸ۜۚ;->ᩳ֫:Ll/۟ۜۚ;

    invoke-interface {v0}, Ll/ۙۜۚ;->֫()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/util/AbstractCollection;

    .line 135
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 533
    sget-object v0, Ll/᩸ۜۚ;->᩷֫:Ljava/util/Comparator;

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 535
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    add-int/lit8 v4, v2, 0x1

    .line 536
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 537
    invoke-virtual {p2}, Ll/ܺۜۚ;->getPosition()I

    move-result v2

    .line 130
    invoke-static {p1, v2}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 538
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    .line 539
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    .line 157
    invoke-static {p2, v3}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    .line 540
    invoke-virtual {p2, v2}, Ll/ܺۜۚ;->֫(Ljava/lang/String;)V

    .line 541
    invoke-virtual {p2, v1}, Ll/ܺۜۚ;->write(I)V

    move v2, v4

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ֫(Ll/ܺۜۚ;Ll/᩶ۡۚ;)V
    .locals 27

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    move-object/from16 v9, p2

    .line 1129
    new-instance v10, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v10}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 1130
    invoke-virtual/range {p1 .. p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v1

    iput v1, v8, Ll/᩸ۜۚ;->ᩴ:I

    .line 1132
    new-instance v11, Ll/ܺۜۚ;

    const/4 v1, 0x0

    invoke-direct {v11, v9, v1}, Ll/ܺۜۚ;-><init>(Ljava/io/OutputStream;I)V

    .line 87
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 1136
    iget-object v13, v8, Ll/᩸ۜۚ;->ܺ:Ll/᩶᩷ۚ;

    invoke-virtual {v13}, Ll/᩶᩷ۚ;->ᩳ()Ll/ܳ۬ܺ;

    move-result-object v2

    .line 375
    invoke-virtual {v2, v1}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v14

    .line 1136
    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Comparable;

    .line 1137
    invoke-virtual {v13, v1}, Ll/᩶᩷ۚ;->ܿ(Ljava/lang/Comparable;)Ll/᩻۫ܺ;

    move-result-object v2

    .line 1138
    invoke-virtual {v13, v1}, Ll/᩶᩷ۚ;->ۢ(Ljava/lang/Comparable;)Ll/᩻۫ܺ;

    move-result-object v1

    .line 1140
    invoke-static {v2, v1}, Ll/ۡ۫ܺ;->֫(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;

    move-result-object v1

    .line 1142
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 1144
    invoke-virtual {v13, v7}, Ll/᩶᩷ۚ;->۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 1145
    invoke-virtual {v13, v7}, Ll/᩶᩷ۚ;->ۖ(Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object v2

    .line 1146
    invoke-virtual {v13, v7}, Ll/᩶᩷ۚ;->᩷(Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object v3

    .line 1148
    iget-object v4, v8, Ll/᩸ۜۚ;->ᩳ֫:Ll/۟ۜۚ;

    if-eqz v2, :cond_4

    invoke-interface {v4}, Ll/۟ۜۚ;->ۧ()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 1150
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩺֫ۚ;

    move-object/from16 v16, v1

    .line 1151
    invoke-interface {v6}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v1

    move-object/from16 v17, v2

    sget-object v2, Ll/֨ۗ֡;->ۡۧ:Ll/֨ۗ֡;

    if-ne v1, v2, :cond_3

    .line 1152
    check-cast v6, Ll/ۧۧۚ;

    .line 1153
    invoke-interface {v6}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v1

    check-cast v1, Ll/ܶܽۚ;

    .line 1152
    invoke-interface {v4, v1}, Ll/۟ۜۚ;->֫(Ll/ܶܽۚ;)I

    move-result v1

    const/high16 v2, 0x10000

    if-lt v1, v2, :cond_3

    .line 1162
    invoke-virtual {v13, v7}, Ll/᩶᩷ۚ;->ܶ(Ljava/lang/Object;)Ll/֨۫֡;

    move-result-object v1

    .line 1200
    invoke-virtual {v1}, Ll/֨۫֡;->᩷()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    .line 1202
    :goto_3
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    if-ge v3, v5, :cond_2

    .line 1203
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩺֫ۚ;

    .line 1205
    invoke-interface {v5}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v6

    move-object/from16 v16, v2

    sget-object v2, Ll/֨ۗ֡;->ۡۧ:Ll/֨ۗ֡;

    if-ne v6, v2, :cond_0

    .line 1206
    move-object v2, v5

    check-cast v2, Ll/ۧۧۚ;

    .line 1207
    invoke-interface {v2}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v6

    check-cast v6, Ll/ܶܽۚ;

    .line 1206
    invoke-interface {v4, v6}, Ll/۟ۜۚ;->֫(Ll/ܶܽۚ;)I

    move-result v6

    move-object/from16 v18, v14

    const/high16 v14, 0x10000

    if-lt v6, v14, :cond_1

    .line 1208
    new-instance v6, Ll/ᩴۤ֡;

    sget-object v14, Ll/֨ۗ֡;->ܺۧ:Ll/֨ۗ֡;

    check-cast v5, Ll/֫ۧۚ;

    .line 1209
    invoke-interface {v5}, Ll/֫ۧۚ;->֫()I

    move-result v5

    .line 1210
    invoke-interface {v2}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v2

    invoke-direct {v6, v14, v5, v2}, Ll/ᩴۤ֡;-><init>(Ll/֨ۗ֡;ILl/۠ܽۚ;)V

    .line 1208
    invoke-virtual {v1, v3, v6}, Ll/֨۫֡;->ۧ(ILl/۟۬֡;)V

    goto :goto_4

    :cond_0
    move-object/from16 v18, v14

    :cond_1
    :goto_4
    add-int/lit8 v3, v3, 0x1

    move-object/from16 v2, v16

    move-object/from16 v14, v18

    goto :goto_3

    :cond_2
    move-object/from16 v18, v14

    .line 1165
    invoke-virtual {v1}, Ll/֨۫֡;->᩷()Ljava/util/List;

    move-result-object v2

    .line 1166
    invoke-virtual {v1}, Ll/֨۫֡;->ۜ()Ljava/util/List;

    move-result-object v3

    .line 1167
    invoke-virtual {v1}, Ll/֨۫֡;->ۢ()Ljava/lang/Iterable;

    move-result-object v1

    move-object v6, v2

    move-object v5, v3

    move-object v3, v1

    goto :goto_5

    :cond_3
    move-object/from16 v18, v14

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    move-object/from16 v14, v18

    goto/16 :goto_2

    :cond_4
    move-object/from16 v16, v1

    move-object/from16 v17, v2

    move-object/from16 v18, v14

    move-object/from16 v5, v16

    move-object/from16 v6, v17

    .line 1171
    :goto_5
    invoke-virtual {v13, v7}, Ll/᩶᩷ۚ;->ۚ(Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object v1

    .line 1222
    invoke-static {v1}, Ll/ۡ۫ܺ;->ᩳ(Ljava/lang/Iterable;)I

    move-result v2

    .line 1224
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    const/16 v16, -0x1

    const/16 v17, 0x0

    move-object/from16 v19, v15

    const/4 v15, -0x1

    :goto_6
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_6

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/CharSequence;

    if-eqz v16, :cond_5

    move/from16 v15, v17

    :cond_5
    add-int/lit8 v17, v17, 0x1

    goto :goto_6

    :cond_6
    const/4 v14, -0x1

    if-ne v15, v14, :cond_8

    if-eqz v3, :cond_7

    .line 1233
    invoke-static {v3}, Ll/ۡ۫ܺ;->ܽ(Ljava/lang/Iterable;)Z

    move-result v14

    if-eqz v14, :cond_8

    :cond_7
    const/4 v1, 0x0

    move-object/from16 v20, v5

    move-object/from16 v17, v6

    move-object/from16 v16, v12

    const/4 v14, 0x0

    goto/16 :goto_10

    .line 1237
    :cond_8
    invoke-virtual/range {p1 .. p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v14

    if-eqz v3, :cond_a

    .line 1241
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_7
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_a

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v17, v15

    move-object/from16 v15, v16

    check-cast v15, Ll/۠֫ۚ;

    .line 1242
    instance-of v9, v15, Ll/᩸֫ۚ;

    if-eqz v9, :cond_9

    .line 1243
    check-cast v15, Ll/᩸֫ۚ;

    invoke-interface {v15}, Ll/᩸֫ۚ;->getLineNumber()I

    move-result v9

    goto :goto_8

    :cond_9
    move-object/from16 v9, p2

    move-object/from16 v15, v17

    goto :goto_7

    :cond_a
    const/4 v9, 0x0

    .line 1249
    :goto_8
    new-instance v15, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v15}, Ljava/io/ByteArrayOutputStream;-><init>()V

    move-object/from16 v16, v12

    .line 1250
    new-instance v12, Ll/ܺۜۚ;

    move-object/from16 v17, v6

    const/16 v6, 0x40

    move-object/from16 v20, v5

    const/4 v5, 0x0

    invoke-direct {v12, v15, v5, v6}, Ll/ܺۜۚ;-><init>(Ljava/io/OutputStream;II)V

    .line 1251
    new-instance v5, Ll/ۡۜۚ;

    iget-object v6, v8, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    invoke-direct {v5, v4, v6, v12}, Ll/ۡۜۚ;-><init>(Ll/۟ۜۚ;Ll/ܳۡۚ;Ll/ܺۜۚ;)V

    .line 157
    invoke-static {v12, v9}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    invoke-static {v12, v2}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    .line 1258
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v6, 0x0

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v22, v1

    move-object/from16 v1, v21

    check-cast v1, Ljava/lang/CharSequence;

    if-ne v6, v2, :cond_b

    goto :goto_a

    :cond_b
    add-int/lit8 v6, v6, 0x1

    .line 1263
    invoke-interface {v4, v1}, Ll/ۛۜۚ;->ܽ(Ljava/lang/Object;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    .line 157
    invoke-static {v12, v1}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    move-object/from16 v1, v22

    goto :goto_9

    :cond_c
    :goto_a
    if-eqz v3, :cond_11

    .line 1268
    invoke-virtual {v5, v9}, Ll/ۡۜۚ;->֫(I)V

    .line 1270
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠֫ۚ;

    .line 1271
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    invoke-interface {v2}, Ll/۠֫ۚ;->ܽ()I

    move-result v3

    const-string v4, "Only StringReference instances returned by DexBuilder.internStringReference or DexBuilder.internNullableStringReference may be used."

    const/4 v6, 0x0

    packed-switch v3, :pswitch_data_0

    .line 484
    :pswitch_0
    new-instance v0, Ll/ܶ᩵ۚ;

    invoke-interface {v2}, Ll/۠֫ۚ;->ܽ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const-string v1, "Unexpected debug item type: %d"

    .line 46
    invoke-direct {v0, v6, v1, v2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 484
    throw v0

    .line 473
    :pswitch_1
    check-cast v2, Ll/᩸֫ۚ;

    .line 474
    invoke-interface {v2}, Ll/۠֫ۚ;->ᩳ()I

    move-result v3

    invoke-interface {v2}, Ll/᩸֫ۚ;->getLineNumber()I

    move-result v2

    invoke-virtual {v5, v3, v2}, Ll/ۡۜۚ;->ۧ(II)V

    goto :goto_b

    .line 478
    :pswitch_2
    check-cast v2, Ll/ۙ֫ۚ;

    .line 479
    invoke-interface {v2}, Ll/۠֫ۚ;->ᩳ()I

    move-result v3

    .line 480
    invoke-interface {v2}, Ll/ۙ֫ۚ;->ۧ()Ll/ܶܽۚ;

    move-result-object v2

    if-nez v2, :cond_d

    goto :goto_c

    .line 421
    :cond_d
    :try_start_0
    move-object v6, v2

    check-cast v6, Ll/۟ۢۚ;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 479
    :goto_c
    invoke-virtual {v5, v3, v6}, Ll/ۡۜۚ;->֫(ILl/۟ۢۚ;)V

    goto :goto_b

    .line 423
    :catch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 469
    :pswitch_3
    invoke-interface {v2}, Ll/۠֫ۚ;->ᩳ()I

    move-result v2

    invoke-virtual {v5, v2}, Ll/ۡۜۚ;->ۧ(I)V

    goto :goto_b

    .line 465
    :pswitch_4
    invoke-interface {v2}, Ll/۠֫ۚ;->ᩳ()I

    move-result v2

    invoke-virtual {v5, v2}, Ll/ۡۜۚ;->ܽ(I)V

    goto :goto_b

    .line 460
    :pswitch_5
    check-cast v2, Ll/᩶֫ۚ;

    .line 461
    invoke-interface {v2}, Ll/۠֫ۚ;->ᩳ()I

    move-result v3

    invoke-interface {v2}, Ll/᩶֫ۚ;->֫()I

    move-result v2

    invoke-virtual {v5, v3, v2}, Ll/ۡۜۚ;->ܽ(II)V

    goto :goto_b

    .line 455
    :pswitch_6
    check-cast v2, Ll/ܶ֫ۚ;

    .line 456
    invoke-interface {v2}, Ll/۠֫ۚ;->ᩳ()I

    move-result v3

    invoke-interface {v2}, Ll/ܶ֫ۚ;->֫()I

    move-result v2

    invoke-virtual {v5, v3, v2}, Ll/ۡۜۚ;->֫(II)V

    goto/16 :goto_b

    .line 446
    :pswitch_7
    check-cast v2, Ll/ۗ֫ۚ;

    .line 447
    invoke-interface {v2}, Ll/۠֫ۚ;->ᩳ()I

    move-result v22

    .line 448
    invoke-interface {v2}, Ll/ۗ֫ۚ;->֫()I

    move-result v23

    .line 449
    invoke-interface {v2}, Ll/ۗ֫ۚ;->᩻()Ll/ܶܽۚ;

    move-result-object v3

    if-nez v3, :cond_e

    move-object/from16 v24, v6

    goto :goto_d

    .line 421
    :cond_e
    :try_start_1
    check-cast v3, Ll/۟ۢۚ;
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_3

    move-object/from16 v24, v3

    .line 450
    :goto_d
    invoke-interface {v2}, Ll/ۗ֫ۚ;->ۡ()Ll/᩸ܽۚ;

    move-result-object v3

    if-nez v3, :cond_f

    move-object/from16 v25, v6

    goto :goto_e

    .line 434
    :cond_f
    :try_start_2
    check-cast v3, Ll/᩻ۡۚ;
    :try_end_2
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_2

    move-object/from16 v25, v3

    .line 451
    :goto_e
    invoke-interface {v2}, Ll/ۗ֫ۚ;->ᩴ()Ll/ܶܽۚ;

    move-result-object v2

    if-nez v2, :cond_10

    move-object/from16 v26, v6

    goto :goto_f

    .line 421
    :cond_10
    :try_start_3
    check-cast v2, Ll/۟ۢۚ;
    :try_end_3
    .catch Ljava/lang/ClassCastException; {:try_start_3 .. :try_end_3} :catch_1

    move-object/from16 v26, v2

    :goto_f
    move-object/from16 v21, v5

    .line 447
    invoke-virtual/range {v21 .. v26}, Ll/ۡۜۚ;->֫(IILl/۟ۢۚ;Ll/᩻ۡۚ;Ll/۟ۢۚ;)V

    goto/16 :goto_b

    .line 423
    :catch_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 436
    :catch_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Only TypeReference instances returned by DexBuilder.internTypeReference or DexBuilder.internNullableTypeReference may be used."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 423
    :catch_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    const/4 v1, 0x0

    .line 1275
    invoke-virtual {v12, v1}, Ll/ܺۜۚ;->write(I)V

    .line 1277
    invoke-virtual {v12}, Ljava/io/OutputStream;->flush()V

    .line 1278
    invoke-virtual {v15}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 1279
    new-instance v2, Ll/ۢۜۚ;

    invoke-direct {v2, v1}, Ll/ۢۜۚ;-><init>([B)V

    const/4 v3, -0x1

    .line 1280
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, v8, Ll/᩸ۜۚ;->ۘ:Ljava/util/HashMap;

    invoke-static {v4, v2, v3}, Ll/ܰ۬ᩴ;->getOrDefault(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ltz v3, :cond_12

    move v14, v3

    goto :goto_10

    .line 1284
    :cond_12
    invoke-virtual {v0, v1}, Ll/ܺۜۚ;->write([B)V

    .line 1285
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1286
    iget v1, v8, Ll/᩸ۜۚ;->ۨ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v8, Ll/᩸ۜۚ;->ۨ:I

    :goto_10
    move-object/from16 v1, p0

    move-object v2, v11

    move-object v3, v10

    move-object v4, v7

    move-object/from16 v5, v20

    move-object/from16 v6, v17

    move-object v9, v7

    move v7, v14

    .line 1174
    :try_start_4
    invoke-direct/range {v1 .. v7}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;Ljava/util/List;Ljava/lang/Iterable;I)I

    move-result v1
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_4

    const/4 v2, -0x1

    if-eq v1, v2, :cond_13

    .line 1182
    new-instance v2, Ll/ۚۜۚ;

    .line 1731
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1732
    iput v1, v2, Ll/ۚۜۚ;->֫:I

    .line 1733
    iput-object v9, v2, Ll/ۚۜۚ;->ۧ:Ljava/lang/Object;

    move-object/from16 v1, v16

    .line 1182
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_13
    move-object/from16 v1, v16

    :goto_11
    move-object/from16 v9, p2

    move-object v12, v1

    move-object/from16 v14, v18

    move-object/from16 v15, v19

    goto/16 :goto_1

    :catch_4
    move-exception v0

    move-object v1, v0

    .line 1177
    new-instance v0, Ll/ܶ᩵ۚ;

    iget-object v2, v8, Ll/᩸ۜۚ;->ۙ:Ll/ۗۢۚ;

    .line 1178
    invoke-virtual {v2, v9}, Ll/ۗۢۚ;->ۜ(Ljava/lang/Object;)Ll/۫ۢۚ;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const-string v2, "Exception occurred while writing code_item for method %s"

    invoke-direct {v0, v1, v2, v3}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0

    :cond_14
    move-object/from16 v9, p2

    goto/16 :goto_0

    :cond_15
    move-object v1, v12

    .line 1187
    invoke-virtual/range {p1 .. p1}, Ll/ܺۜۚ;->֫()V

    .line 1188
    invoke-virtual/range {p1 .. p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v2

    iput v2, v8, Ll/᩸ۜۚ;->ۖ:I

    .line 1190
    invoke-virtual {v11}, Ljava/io/OutputStream;->close()V

    move-object/from16 v2, p2

    .line 1191
    invoke-virtual {v2, v0}, Ll/᩶ۡۚ;->֫(Ll/ܺۜۚ;)V

    .line 1192
    invoke-virtual/range {p2 .. p2}, Ljava/io/OutputStream;->close()V

    .line 1194
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚۜۚ;

    .line 1195
    iget-object v2, v1, Ll/ۚۜۚ;->ۧ:Ljava/lang/Object;

    iget v3, v8, Ll/᩸ۜۚ;->ۖ:I

    iget v1, v1, Ll/ۚۜۚ;->֫:I

    add-int/2addr v3, v1

    invoke-virtual {v13, v3, v2}, Ll/᩶᩷ۚ;->ۧ(ILjava/lang/Object;)V

    goto :goto_12

    :cond_16
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private ֫(Ll/ܺۜۚ;Ll/᩻۫ܺ;)V
    .locals 5

    .line 922
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 923
    iget-object v2, p0, Ll/᩸ۜۚ;->ۙ:Ll/ۗۢۚ;

    invoke-virtual {v2, v1}, Ll/ۗۢۚ;->᩻(Ljava/lang/Object;)I

    move-result v2

    .line 924
    iget-object v3, p0, Ll/᩸ۜۚ;->ܺ:Ll/᩶᩷ۚ;

    invoke-virtual {v3, v1}, Ll/᩶᩷ۚ;->᩵(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    const/4 v4, 0x1

    .line 925
    iput-boolean v4, p0, Ll/᩸ۜۚ;->۠:Z

    :cond_0
    sub-int v0, v2, v0

    .line 157
    invoke-static {p1, v0}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    .line 928
    invoke-virtual {v3, v1}, Ll/᩶᩷ۚ;->ۘ(Ljava/lang/Object;)I

    move-result v0

    .line 157
    invoke-static {p1, v0}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    .line 929
    invoke-virtual {v3, v1}, Ll/᩶᩷ۚ;->ۜ(Ljava/lang/Object;)I

    move-result v0

    .line 157
    invoke-static {p1, v0}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    move v0, v2

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ۖ(Ll/ܺۜۚ;)V
    .locals 5

    .line 546
    invoke-virtual {p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v0

    iput v0, p0, Ll/᩸ۜۚ;->ۜ֫:I

    .line 549
    iget-object v0, p0, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    invoke-virtual {v0}, Ll/ܳۡۚ;->֫()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/util/AbstractCollection;

    .line 135
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 550
    sget-object v1, Ll/᩸ۜۚ;->᩷֫:Ljava/util/Comparator;

    invoke-static {v2, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 552
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    add-int/lit8 v4, v2, 0x1

    .line 553
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 554
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Ll/ܳۡۚ;->֫(Ljava/lang/CharSequence;)Ll/۟ۢۚ;

    move-result-object v2

    iget-object v3, p0, Ll/᩸ۜۚ;->ᩳ֫:Ll/۟ۜۚ;

    invoke-interface {v3, v2}, Ll/ۙۜۚ;->ܳ(Ljava/lang/Object;)I

    move-result v2

    .line 130
    invoke-static {p1, v2}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    move v2, v4

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ۜ(Ll/ܺۜۚ;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1627
    invoke-virtual/range {p1 .. p1}, Ll/ܺۜۚ;->֫()V

    .line 1628
    invoke-virtual/range {p1 .. p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v2

    iput v2, v0, Ll/᩸ۜۚ;->᩸:I

    .line 1566
    iget-object v2, v0, Ll/᩸ۜۚ;->ᩳ֫:Ll/۟ۜۚ;

    invoke-interface {v2}, Ll/ۙۜۚ;->֫()Ljava/util/Collection;

    move-result-object v3

    check-cast v3, Ll/ۚۢۚ;

    invoke-virtual {v3}, Ll/ۚۢۚ;->size()I

    move-result v3

    if-lez v3, :cond_0

    const/4 v3, 0x3

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    .line 1569
    :goto_0
    iget-object v4, v0, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    invoke-virtual {v4}, Ll/ܳۡۚ;->֫()Ljava/util/Collection;

    move-result-object v5

    check-cast v5, Ll/ۚۢۚ;

    invoke-virtual {v5}, Ll/ۚۢۚ;->size()I

    move-result v5

    if-lez v5, :cond_1

    add-int/lit8 v3, v3, 0x1

    .line 1572
    :cond_1
    iget-object v5, v0, Ll/᩸ۜۚ;->۟:Ll/ۛۢۚ;

    invoke-virtual {v5}, Ll/ۛۢۚ;->֫()Ljava/util/Collection;

    move-result-object v6

    check-cast v6, Ll/ۚۢۚ;

    invoke-virtual {v6}, Ll/ۚۢۚ;->size()I

    move-result v6

    if-lez v6, :cond_2

    add-int/lit8 v3, v3, 0x1

    .line 1575
    :cond_2
    iget-object v6, v0, Ll/᩸ۜۚ;->ۚ:Ll/ۘۢۚ;

    invoke-virtual {v6}, Ll/ۘۢۚ;->֫()Ljava/util/Collection;

    move-result-object v7

    check-cast v7, Ll/ۚۢۚ;

    invoke-virtual {v7}, Ll/ۚۢۚ;->size()I

    move-result v7

    if-lez v7, :cond_3

    add-int/lit8 v3, v3, 0x1

    .line 1578
    :cond_3
    iget-object v7, v0, Ll/᩸ۜۚ;->ۙ:Ll/ۗۢۚ;

    invoke-virtual {v7}, Ll/ۗۢۚ;->֫()Ljava/util/Collection;

    move-result-object v8

    check-cast v8, Ll/ۚۢۚ;

    invoke-virtual {v8}, Ll/ۚۢۚ;->size()I

    move-result v8

    if-lez v8, :cond_4

    add-int/lit8 v3, v3, 0x1

    .line 1581
    :cond_4
    iget-object v8, v0, Ll/᩸ۜۚ;->ۜ:Ll/ۖ᩷ۚ;

    invoke-virtual {v8}, Ll/ۖ᩷ۚ;->ܽ()I

    move-result v9

    if-lez v9, :cond_5

    add-int/lit8 v3, v3, 0x1

    .line 1584
    :cond_5
    iget-object v9, v0, Ll/᩸ۜۚ;->᩹:Ll/ܶۢۚ;

    invoke-virtual {v9}, Ll/ܶۢۚ;->֫()Ljava/util/Collection;

    move-result-object v10

    check-cast v10, Ll/ۚۢۚ;

    invoke-virtual {v10}, Ll/ۚۢۚ;->size()I

    move-result v10

    if-lez v10, :cond_6

    add-int/lit8 v3, v3, 0x1

    .line 1587
    :cond_6
    iget-object v10, v0, Ll/᩸ۜۚ;->ܿ֫:Ll/֫᩷ۚ;

    invoke-interface {v10}, Ll/᩺ۜۚ;->֫()Ljava/util/Collection;

    move-result-object v11

    check-cast v11, Ll/ۚۢۚ;

    invoke-virtual {v11}, Ll/ۚۢۚ;->size()I

    move-result v11

    if-lez v11, :cond_7

    add-int/lit8 v3, v3, 0x1

    .line 1590
    :cond_7
    iget-object v11, v0, Ll/᩸ۜۚ;->᩵:Ll/ۗ᩷ۚ;

    invoke-virtual {v11}, Ll/ۗ᩷ۚ;->֫()Ljava/util/Collection;

    move-result-object v12

    check-cast v12, Ll/ۚۢۚ;

    invoke-virtual {v12}, Ll/ۚۢۚ;->size()I

    move-result v12

    if-lez v12, :cond_8

    add-int/lit8 v3, v3, 0x1

    .line 1593
    :cond_8
    iget-object v12, v0, Ll/᩸ۜۚ;->ۧ:Ll/᩻ۜۚ;

    invoke-interface {v12}, Ll/᩺ۜۚ;->֫()Ljava/util/Collection;

    move-result-object v13

    check-cast v13, Ll/ۚۢۚ;

    invoke-virtual {v13}, Ll/ۚۢۚ;->size()I

    move-result v13

    if-lez v13, :cond_9

    add-int/lit8 v3, v3, 0x1

    .line 1596
    :cond_9
    iget-object v13, v0, Ll/᩸ۜۚ;->ܿ:Ll/ۜۜۚ;

    invoke-interface {v13}, Ll/᩺ۜۚ;->֫()Ljava/util/Collection;

    move-result-object v14

    check-cast v14, Ll/ۚۢۚ;

    invoke-virtual {v14}, Ll/ۚۢۚ;->size()I

    move-result v14

    iget-object v15, v0, Ll/᩸ۜۚ;->᩺:Ll/۠ۗ֡;

    if-gtz v14, :cond_a

    .line 1723
    iget v14, v15, Ll/۠ۗ֡;->֫:I

    move-object/from16 v17, v15

    const/16 v15, 0x11

    if-ge v14, v15, :cond_b

    goto :goto_1

    :cond_a
    move-object/from16 v17, v15

    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 1599
    :cond_b
    iget v14, v0, Ll/᩸ۜۚ;->۫:I

    if-lez v14, :cond_c

    add-int/lit8 v3, v3, 0x1

    .line 1602
    :cond_c
    iget v14, v0, Ll/᩸ۜۚ;->۬:I

    if-lez v14, :cond_d

    add-int/lit8 v3, v3, 0x1

    .line 1605
    :cond_d
    iget v14, v0, Ll/᩸ۜۚ;->ۨ:I

    if-lez v14, :cond_e

    add-int/lit8 v3, v3, 0x1

    .line 1608
    :cond_e
    iget v14, v0, Ll/᩸ۜۚ;->ۛ:I

    if-lez v14, :cond_f

    add-int/lit8 v3, v3, 0x1

    .line 1611
    :cond_f
    iget-object v14, v0, Ll/᩸ۜۚ;->ܺ:Ll/᩶᩷ۚ;

    invoke-virtual {v14}, Ll/᩶᩷ۚ;->֫()Ljava/util/Collection;

    move-result-object v15

    check-cast v15, Ll/ۚۢۚ;

    invoke-virtual {v15}, Ll/ۚۢۚ;->size()I

    move-result v15

    if-lez v15, :cond_10

    add-int/lit8 v3, v3, 0x1

    .line 1614
    :cond_10
    iget v15, v0, Ll/᩸ۜۚ;->ۤ:I

    if-lez v15, :cond_11

    add-int/lit8 v3, v3, 0x1

    .line 1617
    :cond_11
    invoke-virtual/range {p0 .. p0}, Ll/᩸ۜۚ;->ܽ()Z

    move-result v15

    if-eqz v15, :cond_12

    add-int/lit8 v3, v3, 0x1

    :cond_12
    add-int/lit8 v3, v3, 0x1

    .line 130
    invoke-static {v1, v3}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    const/4 v3, 0x0

    const/4 v15, 0x1

    .line 1634
    invoke-static {v1, v3, v15, v3}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;III)V

    .line 1635
    invoke-interface {v2}, Ll/ۙۜۚ;->֫()Ljava/util/Collection;

    move-result-object v3

    check-cast v3, Ll/ۚۢۚ;

    invoke-virtual {v3}, Ll/ۚۢۚ;->size()I

    move-result v3

    move-object/from16 v16, v13

    iget v13, v0, Ll/᩸ۜۚ;->ܽ֫:I

    invoke-static {v1, v15, v3, v13}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;III)V

    .line 1636
    invoke-virtual {v4}, Ll/ܳۡۚ;->֫()Ljava/util/Collection;

    move-result-object v3

    check-cast v3, Ll/ۚۢۚ;

    invoke-virtual {v3}, Ll/ۚۢۚ;->size()I

    move-result v3

    iget v4, v0, Ll/᩸ۜۚ;->ۜ֫:I

    const/4 v13, 0x2

    invoke-static {v1, v13, v3, v4}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;III)V

    .line 1637
    invoke-virtual {v5}, Ll/ۛۢۚ;->֫()Ljava/util/Collection;

    move-result-object v3

    check-cast v3, Ll/ۚۢۚ;

    invoke-virtual {v3}, Ll/ۚۢۚ;->size()I

    move-result v3

    iget v4, v0, Ll/᩸ۜۚ;->֫֫:I

    const/4 v5, 0x3

    invoke-static {v1, v5, v3, v4}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;III)V

    .line 1638
    invoke-virtual {v6}, Ll/ۘۢۚ;->֫()Ljava/util/Collection;

    move-result-object v3

    check-cast v3, Ll/ۚۢۚ;

    invoke-virtual {v3}, Ll/ۚۢۚ;->size()I

    move-result v3

    iget v4, v0, Ll/᩸ۜۚ;->֨:I

    const/4 v5, 0x4

    invoke-static {v1, v5, v3, v4}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;III)V

    .line 1639
    invoke-virtual {v7}, Ll/ۗۢۚ;->֫()Ljava/util/Collection;

    move-result-object v3

    check-cast v3, Ll/ۚۢۚ;

    invoke-virtual {v3}, Ll/ۚۢۚ;->size()I

    move-result v3

    iget v4, v0, Ll/᩸ۜۚ;->ۗ:I

    const/4 v5, 0x5

    invoke-static {v1, v5, v3, v4}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;III)V

    .line 1640
    invoke-virtual {v14}, Ll/᩶᩷ۚ;->֫()Ljava/util/Collection;

    move-result-object v3

    check-cast v3, Ll/ۚۢۚ;

    invoke-virtual {v3}, Ll/ۚۢۚ;->size()I

    move-result v3

    iget v4, v0, Ll/᩸ۜۚ;->ۡ:I

    const/4 v5, 0x6

    invoke-static {v1, v5, v3, v4}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;III)V

    .line 1641
    invoke-virtual {v8}, Ll/ۖ᩷ۚ;->ܽ()I

    move-result v3

    iget v4, v0, Ll/᩸ۜۚ;->᩷:I

    const/4 v5, 0x7

    invoke-static {v1, v5, v3, v4}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;III)V

    .line 1642
    invoke-virtual {v9}, Ll/ܶۢۚ;->֫()Ljava/util/Collection;

    move-result-object v3

    check-cast v3, Ll/ۚۢۚ;

    invoke-virtual {v3}, Ll/ۚۢۚ;->size()I

    move-result v3

    iget v4, v0, Ll/᩸ۜۚ;->᩶:I

    const/16 v5, 0x8

    invoke-static {v1, v5, v3, v4}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;III)V

    .line 1646
    invoke-interface {v2}, Ll/ۙۜۚ;->֫()Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ll/ۚۢۚ;

    invoke-virtual {v2}, Ll/ۚۢۚ;->size()I

    move-result v2

    iget v3, v0, Ll/᩸ۜۚ;->ۧ֫:I

    const/16 v4, 0x2002

    invoke-static {v1, v4, v2, v3}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;III)V

    .line 1647
    invoke-interface {v10}, Ll/᩺ۜۚ;->֫()Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ll/ۚۢۚ;

    invoke-virtual {v2}, Ll/ۚۢۚ;->size()I

    move-result v2

    iget v3, v0, Ll/᩸ۜۚ;->ܳ֫:I

    const/16 v4, 0x1001

    invoke-static {v1, v4, v2, v3}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;III)V

    .line 1648
    invoke-virtual {v11}, Ll/ۗ᩷ۚ;->֫()Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ll/ۚۢۚ;

    invoke-virtual {v2}, Ll/ۚۢۚ;->size()I

    move-result v2

    iget v3, v0, Ll/᩸ۜۚ;->֡:I

    const/16 v4, 0x2005

    invoke-static {v1, v4, v2, v3}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;III)V

    .line 1650
    invoke-interface {v12}, Ll/᩺ۜۚ;->֫()Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ll/ۚۢۚ;

    invoke-virtual {v2}, Ll/ۚۢۚ;->size()I

    move-result v2

    iget v3, v0, Ll/᩸ۜۚ;->ܽ:I

    const/16 v4, 0x2004

    invoke-static {v1, v4, v2, v3}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;III)V

    .line 1652
    invoke-interface/range {v16 .. v16}, Ll/᩺ۜۚ;->֫()Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ll/ۚۢۚ;

    invoke-virtual {v2}, Ll/ۚۢۚ;->size()I

    move-result v2

    move-object/from16 v3, v17

    .line 1723
    iget v3, v3, Ll/۠ۗ֡;->֫:I

    const/16 v4, 0x11

    if-ge v3, v4, :cond_13

    const/4 v3, 0x1

    goto :goto_2

    :cond_13
    const/4 v3, 0x0

    :goto_2
    add-int/2addr v2, v3

    .line 1652
    iget v3, v0, Ll/᩸ۜۚ;->ܳ:I

    const/16 v4, 0x1003

    .line 1651
    invoke-static {v1, v4, v2, v3}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;III)V

    .line 1654
    iget v2, v0, Ll/᩸ۜۚ;->۫:I

    iget v3, v0, Ll/᩸ۜۚ;->ᩳ:I

    const/16 v4, 0x1002

    invoke-static {v1, v4, v2, v3}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;III)V

    .line 1655
    iget v2, v0, Ll/᩸ۜۚ;->۬:I

    iget v3, v0, Ll/᩸ۜۚ;->֫:I

    const/16 v4, 0x2006

    invoke-static {v1, v4, v2, v3}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;III)V

    .line 1657
    iget v2, v0, Ll/᩸ۜۚ;->ۨ:I

    iget v3, v0, Ll/᩸ۜۚ;->ᩴ:I

    const/16 v4, 0x2003

    invoke-static {v1, v4, v2, v3}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;III)V

    .line 1658
    iget v2, v0, Ll/᩸ۜۚ;->ۛ:I

    iget v3, v0, Ll/᩸ۜۚ;->ۖ:I

    const/16 v4, 0x2001

    invoke-static {v1, v4, v2, v3}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;III)V

    .line 1659
    iget v2, v0, Ll/᩸ۜۚ;->ۤ:I

    iget v3, v0, Ll/᩸ۜۚ;->ۢ:I

    const/16 v4, 0x2000

    invoke-static {v1, v4, v2, v3}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;III)V

    .line 1660
    invoke-virtual/range {p0 .. p0}, Ll/᩸ۜۚ;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_14

    const v2, 0xf000

    .line 1661
    iget v3, v0, Ll/᩸ۜۚ;->ܶ:I

    const/4 v4, 0x1

    invoke-static {v1, v2, v4, v3}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;III)V

    goto :goto_3

    :cond_14
    const/4 v4, 0x1

    :goto_3
    const/16 v2, 0x1000

    .line 1663
    iget v3, v0, Ll/᩸ۜۚ;->᩸:I

    invoke-static {v1, v2, v4, v3}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;III)V

    return-void
.end method

.method private ۡ(Ll/ܺۜۚ;)V
    .locals 6

    .line 559
    invoke-virtual {p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v0

    iput v0, p0, Ll/᩸ۜۚ;->֫֫:I

    .line 562
    iget-object v0, p0, Ll/᩸ۜۚ;->۟:Ll/ۛۢۚ;

    invoke-virtual {v0}, Ll/ۛۢۚ;->֫()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/util/AbstractCollection;

    .line 135
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 278
    new-instance v1, Ll/ᩴۜۚ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 563
    invoke-static {v2, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 565
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    add-int/lit8 v4, v2, 0x1

    .line 566
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 567
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ܽۚ;

    .line 568
    iget-object v3, p0, Ll/᩸ۜۚ;->ᩳ֫:Ll/۟ۜۚ;

    invoke-virtual {v0, v2}, Ll/ۛۢۚ;->ܽ(Ll/֡ܽۚ;)Ll/۟ۢۚ;

    move-result-object v5

    invoke-interface {v3, v5}, Ll/ۙۜۚ;->ܳ(Ljava/lang/Object;)I

    move-result v3

    .line 130
    invoke-static {p1, v3}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 569
    iget-object v3, p0, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    invoke-virtual {v0, v2}, Ll/ۛۢۚ;->ۧ(Ll/֡ܽۚ;)Ll/᩻ۡۚ;

    move-result-object v5

    invoke-virtual {v3, v5}, Ll/ܳۡۚ;->ܳ(Ljava/lang/Object;)I

    move-result v3

    .line 130
    invoke-static {p1, v3}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 570
    iget-object v3, p0, Ll/᩸ۜۚ;->ܿ֫:Ll/֫᩷ۚ;

    invoke-virtual {v0, v2}, Ll/ۛۢۚ;->֫(Ll/֡ܽۚ;)Ll/֫ۡۚ;

    move-result-object v2

    invoke-interface {v3, v2}, Ll/ۨۜۚ;->ᩳ(Ljava/lang/Object;)I

    move-result v2

    .line 130
    invoke-static {p1, v2}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    move v2, v4

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ۢ(Ll/ܺۜۚ;)V
    .locals 6

    .line 591
    invoke-virtual {p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v0

    iput v0, p0, Ll/᩸ۜۚ;->ۗ:I

    .line 594
    iget-object v0, p0, Ll/᩸ۜۚ;->ۙ:Ll/ۗۢۚ;

    invoke-virtual {v0}, Ll/ۗۢۚ;->֫()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/util/AbstractCollection;

    .line 135
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 278
    new-instance v1, Ll/ᩴۜۚ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 595
    invoke-static {v2, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 597
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    add-int/lit8 v4, v2, 0x1

    .line 598
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 599
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚܽۚ;

    .line 600
    iget-object v3, p0, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    invoke-virtual {v0, v2}, Ll/ۗۢۚ;->֫(Ll/ۚܽۚ;)Ll/᩻ۡۚ;

    move-result-object v5

    invoke-virtual {v3, v5}, Ll/ܳۡۚ;->ܳ(Ljava/lang/Object;)I

    move-result v3

    invoke-virtual {p1, v3}, Ll/ܺۜۚ;->ۧ(I)V

    .line 601
    iget-object v3, p0, Ll/᩸ۜۚ;->۟:Ll/ۛۢۚ;

    invoke-virtual {v0, v2}, Ll/ۗۢۚ;->ܽ(Ll/ۚܽۚ;)Ll/۬ۢۚ;

    move-result-object v5

    invoke-virtual {v3, v5}, Ll/ۛۢۚ;->ܳ(Ljava/lang/Object;)I

    move-result v3

    invoke-virtual {p1, v3}, Ll/ܺۜۚ;->ۧ(I)V

    .line 602
    iget-object v3, p0, Ll/᩸ۜۚ;->ᩳ֫:Ll/۟ۜۚ;

    invoke-virtual {v0, v2}, Ll/ۗۢۚ;->ۧ(Ll/ۚܽۚ;)Ll/۟ۢۚ;

    move-result-object v2

    invoke-interface {v3, v2}, Ll/ۙۜۚ;->ܳ(Ljava/lang/Object;)I

    move-result v2

    .line 130
    invoke-static {p1, v2}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    move v2, v4

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ۧ(Ll/ۚۡۚ;I)Ll/ܺۜۚ;
    .locals 1

    .line 296
    new-instance v0, Ll/ܺۜۚ;

    invoke-interface {p0, p1}, Ll/ۚۡۚ;->֨(I)Ljava/io/OutputStream;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Ll/ܺۜۚ;-><init>(Ljava/io/OutputStream;I)V

    return-object v0
.end method

.method public static ۧ(Ll/ۚۡۚ;)V
    .locals 5

    :try_start_0
    const-string v0, "SHA-1"

    .line 487
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v1, 0x1000

    new-array v1, v1, [B

    const/16 v2, 0x20

    .line 493
    invoke-interface {p0, v2}, Ll/ۚۡۚ;->ۚ(I)Ljava/io/InputStream;

    move-result-object v2

    .line 494
    invoke-virtual {v2, v1}, Ljava/io/InputStream;->read([B)I

    move-result v3

    :goto_0
    if-ltz v3, :cond_0

    const/4 v4, 0x0

    .line 496
    invoke-virtual {v0, v1, v4, v3}, Ljava/security/MessageDigest;->update([BII)V

    .line 497
    invoke-virtual {v2, v1}, Ljava/io/InputStream;->read([B)I

    move-result v3

    goto :goto_0

    .line 500
    :cond_0
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    .line 501
    array-length v1, v0

    const/16 v2, 0x14

    if-ne v1, v2, :cond_1

    const/16 v1, 0xc

    .line 506
    invoke-interface {p0, v1}, Ll/ۚۡۚ;->֨(I)Ljava/io/OutputStream;

    move-result-object p0

    .line 507
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    .line 508
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V

    return-void

    .line 502
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unexpected digest write: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v0, v0

    const-string v2, " bytes"

    .line 0
    invoke-static {v0, v2, v1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    .line 502
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_0
    move-exception p0

    .line 489
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private ۧ(Ll/ܺۜۚ;)V
    .locals 9

    .line 1007
    invoke-virtual {p1}, Ll/ܺۜۚ;->֫()V

    .line 1008
    invoke-virtual {p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v0

    iput v0, p0, Ll/᩸ۜۚ;->ᩳ:I

    .line 238
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1011
    iget-object v1, p0, Ll/᩸ۜۚ;->ܺ:Ll/᩶᩷ۚ;

    invoke-virtual {v1}, Ll/᩶᩷ۚ;->ᩳ()Ll/ܳ۬ܺ;

    move-result-object v2

    const/4 v3, 0x0

    .line 375
    invoke-virtual {v2, v3}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v2

    .line 1011
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Comparable;

    .line 1012
    invoke-virtual {v1, v4}, Ll/᩶᩷ۚ;->ۜ(Ljava/lang/Comparable;)Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 1013
    invoke-virtual {v1, v5}, Ll/᩶᩷ۚ;->֡(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 1015
    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    if-eqz v7, :cond_2

    .line 1017
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {v1, v6, v5}, Ll/᩶᩷ۚ;->֫(ILjava/lang/Object;)V

    goto :goto_0

    .line 1019
    :cond_2
    invoke-virtual {p1}, Ll/ܺۜۚ;->֫()V

    .line 1020
    invoke-virtual {p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v7

    .line 1021
    invoke-virtual {v1, v7, v5}, Ll/᩶᩷ۚ;->֫(ILjava/lang/Object;)V

    .line 1022
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1024
    iget v5, p0, Ll/᩸ۜۚ;->۫:I

    add-int/lit8 v5, v5, 0x1

    iput v5, p0, Ll/᩸ۜۚ;->۫:I

    .line 1026
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v5

    .line 130
    invoke-static {p1, v5}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 1027
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 1028
    iget-object v7, p0, Ll/᩸ۜۚ;->ܿ:Ll/ۜۜۚ;

    invoke-interface {v7, v6}, Ll/ۜۜۚ;->ܿ(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v8

    if-lez v8, :cond_3

    .line 1029
    invoke-interface {v7, v6}, Ll/᩺ۜۚ;->ۧ(Ljava/lang/Object;)I

    move-result v6

    .line 130
    :goto_2
    invoke-static {p1, v6}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    goto :goto_1

    .line 1723
    :cond_3
    iget-object v6, p0, Ll/᩸ۜۚ;->᩺:Ll/۠ۗ֡;

    iget v6, v6, Ll/۠ۗ֡;->֫:I

    const/16 v7, 0x11

    if-ge v6, v7, :cond_4

    .line 1031
    iget v6, p0, Ll/᩸ۜۚ;->ܳ:I

    goto :goto_2

    .line 130
    :cond_4
    invoke-static {p1, v3}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    goto :goto_1

    :cond_5
    return-void
.end method

.method public static ۧ(Ll/ܺۜۚ;II)V
    .locals 0

    .line 130
    invoke-static {p0, p1}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    if-lez p1, :cond_0

    invoke-static {p0, p2}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    return-void

    :cond_0
    const/4 p1, 0x0

    invoke-static {p0, p1}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    return-void
.end method

.method private ܳ(Ll/ܺۜۚ;)V
    .locals 5

    .line 950
    new-instance v0, Ll/֨ۜۚ;

    invoke-direct {v0, p0, p1}, Ll/֨ۜۚ;-><init>(Ll/᩸ۜۚ;Ll/ܺۜۚ;)V

    .line 951
    invoke-virtual {p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v1

    iput v1, p0, Ll/᩸ۜۚ;->֡:I

    .line 953
    iget-object v1, p0, Ll/᩸ۜۚ;->᩵:Ll/ۗ᩷ۚ;

    invoke-virtual {v1}, Ll/ۗ᩷ۚ;->֫()Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ll/ۚۢۚ;

    invoke-virtual {v2}, Ll/ۚۢۚ;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 954
    invoke-virtual {p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 955
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ۗ᩷ۚ;->᩻(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 956
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    .line 157
    invoke-static {p1, v4}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    .line 957
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 958
    invoke-virtual {p0, v0, v4}, Ll/᩸ۜۚ;->֫(Ll/֨ۜۚ;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ܺ(Ll/ܺۜۚ;)V
    .locals 5

    .line 935
    invoke-virtual {p1}, Ll/ܺۜۚ;->֫()V

    .line 936
    invoke-virtual {p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v0

    iput v0, p0, Ll/᩸ۜۚ;->ܳ֫:I

    .line 937
    iget-object v0, p0, Ll/᩸ۜۚ;->ܿ֫:Ll/֫᩷ۚ;

    invoke-interface {v0}, Ll/᩺ۜۚ;->֫()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ll/ۚۢۚ;

    invoke-virtual {v1}, Ll/ۚۢۚ;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 938
    invoke-virtual {p1}, Ll/ܺۜۚ;->֫()V

    .line 939
    invoke-virtual {p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 941
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ll/֫᩷ۚ;->֫(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 942
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v3

    .line 130
    invoke-static {p1, v3}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 943
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    .line 944
    iget-object v4, p0, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    invoke-virtual {v4, v3}, Ll/ܳۡۚ;->ܳ(Ljava/lang/Object;)I

    move-result v3

    invoke-virtual {p1, v3}, Ll/ܺۜۚ;->ۧ(I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ܽ(Ll/ܺۜۚ;)V
    .locals 6

    .line 988
    invoke-virtual {p1}, Ll/ܺۜۚ;->֫()V

    .line 989
    invoke-virtual {p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v0

    iput v0, p0, Ll/᩸ۜۚ;->ܳ:I

    .line 1723
    iget-object v0, p0, Ll/᩸ۜۚ;->᩺:Ll/۠ۗ֡;

    iget v0, v0, Ll/۠ۗ֡;->֫:I

    const/16 v1, 0x11

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    .line 130
    invoke-static {p1, v2}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 993
    :cond_0
    iget-object v0, p0, Ll/᩸ۜۚ;->ܿ:Ll/ۜۜۚ;

    invoke-interface {v0}, Ll/᩺ۜۚ;->֫()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ll/ۚۢۚ;

    invoke-virtual {v1}, Ll/ۚۢۚ;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 994
    sget-object v4, Ll/ᩳ۬֡;->᩸:Ljava/util/Comparator;

    invoke-static {v4}, Ll/ۤۤܺ;->ۧ(Ljava/util/Comparator;)Ll/ۤۤܺ;

    move-result-object v4

    .line 995
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v0, v5}, Ll/ۜۜۚ;->ܿ(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    .line 886
    invoke-static {v4, v5}, Ll/ܳ۬ܺ;->֫(Ljava/util/Comparator;Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object v4

    .line 997
    invoke-virtual {p1}, Ll/ܺۜۚ;->֫()V

    .line 998
    invoke-virtual {p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 999
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v3

    .line 130
    invoke-static {p1, v3}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 375
    invoke-virtual {v4, v2}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v3

    .line 1000
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷֫ۚ;

    .line 1001
    iget-object v5, p0, Ll/᩸ۜۚ;->ۧ:Ll/᩻ۜۚ;

    invoke-interface {v5, v4}, Ll/᩺ۜۚ;->ۧ(Ljava/lang/Object;)I

    move-result v4

    .line 130
    invoke-static {p1, v4}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private ܿ(Ll/ܺۜۚ;)V
    .locals 9

    .line 830
    invoke-virtual {p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v0

    iput v0, p0, Ll/᩸ۜۚ;->᩷:I

    .line 832
    new-instance v0, Ll/᩵᩷ᩴ;

    invoke-direct {v0}, Ll/᩵᩷ᩴ;-><init>()V

    .line 833
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 835
    iget-object v2, p0, Ll/᩸ۜۚ;->ۜ:Ll/ۖ᩷ۚ;

    invoke-virtual {v2}, Ll/ۖ᩷ۚ;->֫()Ljava/util/Collection;

    move-result-object v3

    check-cast v3, Ll/ۚۢۚ;

    invoke-virtual {v3}, Ll/ۚۢۚ;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, -0x1

    const/4 v5, -0x1

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 836
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۘܽۚ;

    invoke-interface {v7}, Ll/ۘܽۚ;->getIndex()I

    move-result v7

    if-ltz v7, :cond_2

    const/high16 v8, 0x10000

    if-ge v7, v8, :cond_2

    .line 837
    invoke-virtual {v0, v7}, Ll/᩵᩷ᩴ;->֫(I)Z

    move-result v8

    if-eqz v8, :cond_1

    goto :goto_1

    .line 840
    :cond_1
    invoke-virtual {v0, v7, v6}, Ll/᩵᩷ᩴ;->֫(ILjava/lang/Object;)Ljava/lang/Object;

    if-le v7, v5, :cond_0

    move v5, v7

    goto :goto_0

    .line 838
    :cond_2
    :goto_1
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 846
    :cond_3
    iget-object v3, p0, Ll/᩸ۜۚ;->᩻:Ljava/util/Comparator;

    invoke-static {v1, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 847
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    .line 849
    :goto_2
    iget-object v6, p0, Ll/᩸ۜۚ;->᩵:Ll/ۗ᩷ۚ;

    if-gt v3, v5, :cond_6

    .line 850
    invoke-virtual {v0, v3}, Ll/᩵᩷ᩴ;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    if-nez v7, :cond_4

    .line 851
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    .line 852
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    :cond_4
    if-eqz v7, :cond_5

    .line 855
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 856
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۘܽۚ;

    invoke-virtual {v2, v7}, Ll/ۖ᩷ۚ;->֫(Ll/ۘܽۚ;)Ll/۫᩷ۚ;

    move-result-object v7

    invoke-virtual {v6, v7}, Ll/ۗ᩷ۚ;->ۧ(Ljava/lang/Object;)I

    move-result v6

    .line 130
    invoke-static {p1, v6}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    goto :goto_3

    :cond_5
    invoke-static {p1, v4}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 861
    :cond_6
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 862
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    add-int/lit8 v5, v5, 0x1

    .line 863
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 864
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘܽۚ;

    invoke-virtual {v2, v0}, Ll/ۖ᩷ۚ;->֫(Ll/ۘܽۚ;)Ll/۫᩷ۚ;

    move-result-object v0

    invoke-virtual {v6, v0}, Ll/ۗ᩷ۚ;->ۧ(Ljava/lang/Object;)I

    move-result v0

    .line 130
    invoke-static {p1, v0}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    goto :goto_4

    :cond_7
    return-void
.end method

.method private ᩳ()I
    .locals 2

    .line 306
    iget-object v0, p0, Ll/᩸ۜۚ;->ᩳ֫:Ll/۟ۜۚ;

    .line 307
    invoke-interface {v0}, Ll/ۙۜۚ;->getItemCount()I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0x70

    iget-object v1, p0, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    .line 308
    invoke-virtual {v1}, Ll/ܳۡۚ;->getItemCount()I

    move-result v1

    mul-int/lit8 v1, v1, 0x4

    add-int/2addr v1, v0

    iget-object v0, p0, Ll/᩸ۜۚ;->۟:Ll/ۛۢۚ;

    .line 309
    invoke-virtual {v0}, Ll/ۛۢۚ;->getItemCount()I

    move-result v0

    mul-int/lit8 v0, v0, 0xc

    add-int/2addr v0, v1

    iget-object v1, p0, Ll/᩸ۜۚ;->ۚ:Ll/ۘۢۚ;

    .line 310
    invoke-virtual {v1}, Ll/ۘۢۚ;->getItemCount()I

    move-result v1

    mul-int/lit8 v1, v1, 0x8

    add-int/2addr v1, v0

    iget-object v0, p0, Ll/᩸ۜۚ;->ۙ:Ll/ۗۢۚ;

    .line 311
    invoke-virtual {v0}, Ll/ۗۢۚ;->getItemCount()I

    move-result v0

    mul-int/lit8 v0, v0, 0x8

    add-int/2addr v0, v1

    iget-object v1, p0, Ll/᩸ۜۚ;->ܺ:Ll/᩶᩷ۚ;

    .line 312
    invoke-virtual {v1}, Ll/᩶᩷ۚ;->getItemCount()I

    move-result v1

    mul-int/lit8 v1, v1, 0x20

    add-int/2addr v1, v0

    iget-object v0, p0, Ll/᩸ۜۚ;->ۜ:Ll/ۖ᩷ۚ;

    .line 313
    invoke-virtual {v0}, Ll/ۖ᩷ۚ;->ܽ()I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    add-int/2addr v0, v1

    iget-object v1, p0, Ll/᩸ۜۚ;->᩹:Ll/ܶۢۚ;

    .line 314
    invoke-virtual {v1}, Ll/ܶۢۚ;->getItemCount()I

    move-result v1

    mul-int/lit8 v1, v1, 0x8

    add-int/2addr v1, v0

    return v1
.end method

.method private ᩳ(Ll/ܺۜۚ;)V
    .locals 7

    .line 964
    new-instance v0, Ll/֨ۜۚ;

    invoke-direct {v0, p0, p1}, Ll/֨ۜۚ;-><init>(Ll/᩸ۜۚ;Ll/ܺۜۚ;)V

    .line 966
    invoke-virtual {p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v1

    iput v1, p0, Ll/᩸ۜۚ;->ܽ:I

    .line 967
    iget-object v1, p0, Ll/᩸ۜۚ;->ۧ:Ll/᩻ۜۚ;

    invoke-interface {v1}, Ll/᩺ۜۚ;->֫()Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ll/ۚۢۚ;

    invoke-virtual {v2}, Ll/ۚۢۚ;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 968
    invoke-virtual {p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 970
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷֫ۚ;

    .line 972
    invoke-interface {v1, v3}, Ll/᩻ۜۚ;->ۧ(Ll/᩷֫ۚ;)I

    move-result v4

    invoke-virtual {p1, v4}, Ll/ܺۜۚ;->֫(I)V

    .line 973
    iget-object v4, p0, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    invoke-interface {v1, v3}, Ll/᩻ۜۚ;->֫(Ll/᩷֫ۚ;)Ll/᩻ۡۚ;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/ܳۡۚ;->ܳ(Ljava/lang/Object;)I

    move-result v4

    .line 157
    invoke-static {p1, v4}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    .line 975
    sget-object v4, Ll/ܳ۬֡;->᩸:Ljava/util/Comparator;

    invoke-static {v4}, Ll/ۤۤܺ;->ۧ(Ljava/util/Comparator;)Ll/ۤۤܺ;

    move-result-object v4

    .line 976
    invoke-interface {v1, v3}, Ll/᩻ۜۚ;->ܽ(Ll/᩷֫ۚ;)Ljava/util/Set;

    move-result-object v3

    .line 886
    invoke-static {v4, v3}, Ll/ܳ۬ܺ;->֫(Ljava/util/Comparator;Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object v3

    .line 978
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v4

    .line 157
    invoke-static {p1, v4}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    const/4 v4, 0x0

    .line 375
    invoke-virtual {v3, v4}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v3

    .line 980
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۢ֫ۚ;

    .line 981
    iget-object v5, p0, Ll/᩸ۜۚ;->ᩳ֫:Ll/۟ۜۚ;

    invoke-interface {v1, v4}, Ll/᩻ۜۚ;->ۧ(Ll/ۢ֫ۚ;)Ll/۟ۢۚ;

    move-result-object v6

    invoke-interface {v5, v6}, Ll/ۙۜۚ;->ܳ(Ljava/lang/Object;)I

    move-result v5

    .line 157
    invoke-static {p1, v5}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    .line 982
    invoke-interface {v1, v4}, Ll/᩻ۜۚ;->֫(Ll/ۢ֫ۚ;)Ll/ܰ᩷ۚ;

    move-result-object v4

    invoke-virtual {p0, v0, v4}, Ll/᩸ۜۚ;->֫(Ll/֨ۜۚ;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ᩷(Ll/ܺۜۚ;)V
    .locals 6

    .line 869
    invoke-virtual {p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v0

    iput v0, p0, Ll/᩸ۜۚ;->᩶:I

    .line 873
    iget-object v0, p0, Ll/᩸ۜۚ;->᩹:Ll/ܶۢۚ;

    invoke-virtual {v0}, Ll/ܶۢۚ;->֫()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ll/ۚۢۚ;

    invoke-virtual {v1}, Ll/ۚۢۚ;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    add-int/lit8 v5, v3, 0x1

    .line 874
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 875
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩵ܽۚ;

    .line 876
    invoke-interface {v3}, Ll/᩵ܽۚ;->֫ۧ()I

    move-result v4

    invoke-virtual {p1, v4}, Ll/ܺۜۚ;->ۧ(I)V

    .line 877
    invoke-virtual {p1, v2}, Ll/ܺۜۚ;->ۧ(I)V

    .line 879
    invoke-interface {v3}, Ll/᩵ܽۚ;->֫ۧ()I

    move-result v4

    packed-switch v4, :pswitch_data_0

    .line 896
    new-instance p1, Ll/ܶ᩵ۚ;

    .line 897
    invoke-interface {v3}, Ll/᩵ܽۚ;->֫ۧ()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const/4 v0, 0x0

    const-string v2, "Invalid method handle type: %d"

    .line 46
    invoke-direct {p1, v0, v2, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 897
    throw p1

    .line 892
    :pswitch_0
    iget-object v4, p0, Ll/᩸ۜۚ;->ۙ:Ll/ۗۢۚ;

    .line 893
    invoke-virtual {v0, v3}, Ll/ܶۢۚ;->ۧ(Ll/᩵ܽۚ;)Ll/۫ۢۚ;

    move-result-object v3

    .line 892
    invoke-virtual {v4, v3}, Ll/ۗۢۚ;->ܳ(Ljava/lang/Object;)I

    move-result v3

    goto :goto_1

    .line 884
    :pswitch_1
    iget-object v4, p0, Ll/᩸ۜۚ;->ۚ:Ll/ۘۢۚ;

    .line 885
    invoke-virtual {v0, v3}, Ll/ܶۢۚ;->֫(Ll/᩵ܽۚ;)Ll/ᩴۢۚ;

    move-result-object v3

    .line 884
    invoke-virtual {v4, v3}, Ll/ۘۢۚ;->ܳ(Ljava/lang/Object;)I

    move-result v3

    .line 900
    :goto_1
    invoke-virtual {p1, v3}, Ll/ܺۜۚ;->ۧ(I)V

    .line 901
    invoke-virtual {p1, v2}, Ll/ܺۜۚ;->ۧ(I)V

    move v3, v5

    goto :goto_0

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private ᩻(Ll/ܺۜۚ;)V
    .locals 6

    .line 575
    invoke-virtual {p1}, Ll/ܺۜۚ;->getPosition()I

    move-result v0

    iput v0, p0, Ll/᩸ۜۚ;->֨:I

    .line 578
    iget-object v0, p0, Ll/᩸ۜۚ;->ۚ:Ll/ۘۢۚ;

    invoke-virtual {v0}, Ll/ۘۢۚ;->֫()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/util/AbstractCollection;

    .line 135
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 278
    new-instance v1, Ll/ᩴۜۚ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 579
    invoke-static {v2, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 581
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    add-int/lit8 v4, v2, 0x1

    .line 582
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 583
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴܽۚ;

    .line 584
    invoke-virtual {v0, v2}, Ll/ۘۢۚ;->֫(Ll/ᩴܽۚ;)Ll/᩻ۡۚ;

    move-result-object v3

    iget-object v5, p0, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    invoke-virtual {v5, v3}, Ll/ܳۡۚ;->ܳ(Ljava/lang/Object;)I

    move-result v3

    invoke-virtual {p1, v3}, Ll/ܺۜۚ;->ۧ(I)V

    .line 585
    invoke-virtual {v0, v2}, Ll/ۘۢۚ;->ۧ(Ll/ᩴܽۚ;)Ll/᩻ۡۚ;

    move-result-object v3

    invoke-virtual {v5, v3}, Ll/ܳۡۚ;->ܳ(Ljava/lang/Object;)I

    move-result v3

    invoke-virtual {p1, v3}, Ll/ܺۜۚ;->ۧ(I)V

    .line 586
    iget-object v3, p0, Ll/᩸ۜۚ;->ᩳ֫:Ll/۟ۜۚ;

    invoke-virtual {v0, v2}, Ll/ۘۢۚ;->ܽ(Ll/ᩴܽۚ;)Ll/۟ۢۚ;

    move-result-object v2

    invoke-interface {v3, v2}, Ll/ۙۜۚ;->ܳ(Ljava/lang/Object;)I

    move-result v2

    .line 130
    invoke-static {p1, v2}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    move v2, v4

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public abstract ֫()Ll/ᩴۡۚ;
.end method

.method public abstract ֫(Ll/֨ۜۚ;Ljava/lang/Object;)V
.end method

.method public final ֫(Ll/ۚۡۚ;)V
    .locals 10

    .line 385
    invoke-static {}, Ll/᩶ۡۚ;->֫()Ll/֡ۡۚ;

    move-result-object v0

    .line 409
    iget-object v1, p0, Ll/᩸ۜۚ;->ܺ:Ll/᩶᩷ۚ;

    iget-object v2, p0, Ll/᩸ۜۚ;->ۙ:Ll/ۗۢۚ;

    invoke-virtual {v2}, Ll/ۗۢۚ;->getItemCount()I

    move-result v2

    const/high16 v3, 0x10000

    if-gt v2, v3, :cond_5

    .line 365
    invoke-virtual {p0}, Ll/᩸ۜۚ;->ۧ()Z

    move-result v2

    if-nez v2, :cond_4

    .line 417
    iget-object v2, p0, Ll/᩸ۜۚ;->ۜ:Ll/ۖ᩷ۚ;

    invoke-virtual {v2}, Ll/ۖ᩷ۚ;->֫()Ljava/util/Collection;

    move-result-object v4

    check-cast v4, Ll/ۚۢۚ;

    invoke-virtual {v4}, Ll/ۚۢۚ;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, -0x1

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 418
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۘܽۚ;

    invoke-interface {v6}, Ll/ۘܽۚ;->getIndex()I

    move-result v6

    if-ltz v6, :cond_0

    if-ge v6, v3, :cond_0

    if-le v6, v5, :cond_0

    move v5, v6

    goto :goto_0

    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 423
    invoke-virtual {v2}, Ll/ۖ᩷ۚ;->getItemCount()I

    move-result v3

    sub-int/2addr v5, v3

    if-lez v5, :cond_2

    .line 425
    invoke-virtual {v2, v5}, Ll/ۖ᩷ۚ;->֫(I)V

    .line 429
    :cond_2
    :try_start_0
    invoke-direct {p0}, Ll/᩸ۜۚ;->ᩳ()I

    move-result v3

    const/4 v4, 0x0

    .line 430
    invoke-static {p1, v4}, Ll/᩸ۜۚ;->ۧ(Ll/ۚۡۚ;I)Ll/ܺۜۚ;

    move-result-object v5

    const/16 v6, 0x70

    .line 431
    invoke-static {p1, v6}, Ll/᩸ۜۚ;->ۧ(Ll/ۚۡۚ;I)Ll/ܺۜۚ;

    move-result-object v6

    .line 432
    invoke-static {p1, v3}, Ll/᩸ۜۚ;->ۧ(Ll/ۚۡۚ;I)Ll/ܺۜۚ;

    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 434
    :try_start_1
    invoke-direct {p0, v6, v7}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;Ll/ܺۜۚ;)V

    .line 435
    invoke-direct {p0, v6}, Ll/᩸ۜۚ;->ۖ(Ll/ܺۜۚ;)V

    .line 436
    invoke-direct {p0, v7}, Ll/᩸ۜۚ;->ܺ(Ll/ܺۜۚ;)V

    .line 437
    invoke-direct {p0, v6}, Ll/᩸ۜۚ;->ۡ(Ll/ܺۜۚ;)V

    .line 438
    invoke-direct {p0, v6}, Ll/᩸ۜۚ;->᩻(Ll/ܺۜۚ;)V

    .line 439
    invoke-direct {p0, v6}, Ll/᩸ۜۚ;->ۢ(Ll/ܺۜۚ;)V

    .line 442
    invoke-virtual {v6}, Ll/ܺۜۚ;->getPosition()I

    move-result v8

    .line 443
    invoke-virtual {v1}, Ll/᩶᩷ۚ;->getItemCount()I

    move-result v9

    mul-int/lit8 v9, v9, 0x20

    add-int/2addr v9, v8

    .line 444
    invoke-virtual {v2}, Ll/ۖ᩷ۚ;->ܽ()I

    move-result v2

    mul-int/lit8 v2, v2, 0x4

    add-int/2addr v2, v9

    .line 442
    invoke-static {p1, v2}, Ll/᩸ۜۚ;->ۧ(Ll/ۚۡۚ;I)Ll/ܺۜۚ;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 446
    :try_start_2
    invoke-direct {p0, v2}, Ll/᩸ۜۚ;->᩷(Ll/ܺۜۚ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 448
    :try_start_3
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    .line 452
    invoke-direct {p0, v7}, Ll/᩸ۜۚ;->ܳ(Ll/ܺۜۚ;)V

    .line 455
    invoke-virtual {v6}, Ll/ܺۜۚ;->getPosition()I

    move-result v2

    .line 456
    invoke-virtual {v1}, Ll/᩶᩷ۚ;->getItemCount()I

    move-result v1

    mul-int/lit8 v1, v1, 0x20

    add-int/2addr v1, v2

    .line 455
    invoke-static {p1, v1}, Ll/᩸ۜۚ;->ۧ(Ll/ۚۡۚ;I)Ll/ܺۜۚ;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 458
    :try_start_4
    invoke-direct {p0, v1}, Ll/᩸ۜۚ;->ܿ(Ll/ܺۜۚ;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 460
    :try_start_5
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 463
    invoke-direct {p0, v7}, Ll/᩸ۜۚ;->ᩳ(Ll/ܺۜۚ;)V

    .line 464
    invoke-direct {p0, v7}, Ll/᩸ۜۚ;->ܽ(Ll/ܺۜۚ;)V

    .line 465
    invoke-direct {p0, v7}, Ll/᩸ۜۚ;->ۧ(Ll/ܺۜۚ;)V

    .line 466
    invoke-direct {p0, v7}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;)V

    .line 467
    invoke-interface {v0}, Ll/֡ۡۚ;->֫()Ll/᩶ۡۚ;

    move-result-object v0

    invoke-direct {p0, v7, v0}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;Ll/᩶ۡۚ;)V

    .line 468
    invoke-direct {p0, p1, v6, v7}, Ll/᩸ۜۚ;->֫(Ll/ۚۡۚ;Ll/ܺۜۚ;Ll/ܺۜۚ;)V

    .line 470
    invoke-direct {p0, v7}, Ll/᩸ۜۚ;->ۜ(Ll/ܺۜۚ;)V

    .line 471
    invoke-virtual {v7}, Ll/ܺۜۚ;->getPosition()I

    move-result v0

    invoke-direct {p0, v5, v3, v0}, Ll/᩸ۜۚ;->֫(Ll/ܺۜۚ;II)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 473
    :try_start_6
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V

    .line 474
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V

    .line 475
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V

    .line 477
    invoke-static {p1}, Ll/᩸ۜۚ;->ۧ(Ll/ۚۡۚ;)V

    .line 512
    new-instance v0, Ljava/util/zip/Adler32;

    invoke-direct {v0}, Ljava/util/zip/Adler32;-><init>()V

    const/16 v1, 0x1000

    new-array v1, v1, [B

    const/16 v2, 0xc

    .line 515
    invoke-interface {p1, v2}, Ll/ۚۡۚ;->ۚ(I)Ljava/io/InputStream;

    move-result-object v2

    .line 516
    invoke-virtual {v2, v1}, Ljava/io/InputStream;->read([B)I

    move-result v3

    :goto_1
    if-ltz v3, :cond_3

    .line 518
    invoke-virtual {v0, v1, v4, v3}, Ljava/util/zip/Adler32;->update([BII)V

    .line 519
    invoke-virtual {v2, v1}, Ljava/io/InputStream;->read([B)I

    move-result v3

    goto :goto_1

    :cond_3
    const/16 v1, 0x8

    .line 523
    invoke-interface {p1, v1}, Ll/ۚۡۚ;->֨(I)Ljava/io/OutputStream;

    move-result-object v1

    .line 524
    invoke-virtual {v0}, Ljava/util/zip/Adler32;->getValue()J

    move-result-wide v2

    long-to-int v0, v2

    invoke-static {v1, v0}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 525
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 480
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    return-void

    :catchall_0
    move-exception v0

    .line 460
    :try_start_7
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 461
    throw v0

    :catchall_1
    move-exception v0

    .line 448
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    .line 449
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception v0

    .line 473
    :try_start_8
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V

    .line 474
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V

    .line 475
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V

    .line 476
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :catchall_3
    move-exception v0

    .line 480
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    .line 481
    throw v0

    .line 413
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Number of section items overflowed: 65535"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 410
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const v0, 0x7f120285

    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ܶ᩵ܿ;)V
    .locals 2

    .line 389
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ".tmp"

    .line 899
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 392
    :try_start_0
    new-instance v1, Ll/֨ۡۚ;

    invoke-direct {v1, v0}, Ll/֨ۡۚ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 393
    :try_start_1
    invoke-virtual {p0, v1}, Ll/᩸ۜۚ;->֫(Ll/ۚۡۚ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 394
    :try_start_2
    invoke-virtual {v1}, Ll/֨ۡۚ;->close()V

    const/4 v1, 0x0

    .line 991
    invoke-virtual {v0, p1, v1}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 397
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 392
    :try_start_3
    invoke-virtual {v1}, Ll/֨ۡۚ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    .line 397
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 398
    throw p1

    .line 400
    :cond_0
    new-instance v0, Ll/֨ۡۚ;

    invoke-direct {v0, p1}, Ll/֨ۡۚ;-><init>(Ll/ܶ᩵ܿ;)V

    .line 401
    :try_start_5
    invoke-virtual {p0, v0}, Ll/᩸ۜۚ;->֫(Ll/ۚۡۚ;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 402
    invoke-virtual {v0}, Ll/֨ۡۚ;->close()V

    .line 404
    :goto_1
    invoke-static {p1}, Ll/ܿ֡ܿ;->֫(Ll/ܶ᩵ܿ;)V

    return-void

    :catchall_3
    move-exception p1

    .line 400
    :try_start_6
    invoke-virtual {v0}, Ll/֨ۡۚ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_2

    :catchall_4
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final ۧ()Z
    .locals 7

    .line 375
    iget-object v0, p0, Ll/᩸ۜۚ;->ܰ:[Ll/ۙۜۚ;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    .line 376
    invoke-interface {v4}, Ll/ۙۜۚ;->getItemCount()I

    move-result v5

    const/high16 v6, 0x10000

    if-le v5, v6, :cond_0

    .line 377
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Number of section items overflowed: 65535: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v4}, Ll/ۙۜۚ;->getItemCount()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public ܽ()Z
    .locals 2

    .line 657
    iget-boolean v0, p0, Ll/᩸ۜۚ;->۠:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩸ۜۚ;->᩺:Ll/۠ۗ֡;

    iget v0, v0, Ll/۠ۗ֡;->֫:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
