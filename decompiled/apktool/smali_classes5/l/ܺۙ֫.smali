.class public final Ll/ܺۙ֫;
.super Ll/ܳᩴ֫;
.source "M8TF"

# interfaces
.implements Ll/ۘ᩶֫;


# instance fields
.field public final ֡:Ll/֨ܿۧ;

.field public ֡֫:Landroid/view/SurfaceHolder;

.field public ֨:Z

.field public ֨֫:Ll/ܿ֨֫;

.field public final ֫֫:Ll/᩵ۚ֫;

.field public final ۖ:Ll/ܳۚ֫;

.field public ۖ֫:Ll/֨ܽۧ;

.field public final ۗ:Ll/ۡۧۧ;

.field public ۗ֫:Ll/ۜ֡֫;

.field public ۘ:Ll/ۙ֡֫;

.field public ۘ֫:Z

.field public ۙ:Ll/ܿ᩵֫;

.field public ۙ֫:I

.field public final ۚ:Ll/ۢۙ֫;

.field public ۚ֫:Z

.field public ۛ:I

.field public final ۜ:Ll/ۧۚ֫;

.field public ۜ֫:Ll/᩷۬֫;

.field public ۟:Ll/۬ۗ֫;

.field public final ۠:Ll/᩶ۙ֫;

.field public ۠֫:Landroid/view/TextureView;

.field public final ۡ:Ll/ܳ֨֫;

.field public final ۡ֫:J

.field public final ۢ:Ll/۬ܿۧ;

.field public final ۢ֫:J

.field public ۤ:Z

.field public final ۤ֫:Ll/֨᩵֫;

.field public final ۧ:Ll/᩵۬֫;

.field public final ۧ֫:Ll/ܶ᩶֫;

.field public ۨ:I

.field public ۫:Landroid/view/Surface;

.field public final ۫֫:Ll/ᩴ۬֫;

.field public final ۬:Ljava/util/ArrayList;

.field public final ۬֫:Ll/ۖ۬֫;

.field public final ܰ:Ll/ᩴ᩵֫;

.field public final ܳ:Ll/۠᩹֫;

.field public ܳ֫:I

.field public final ܶ:Ll/᩹ۚ֫;

.field public ܶ֫:Z

.field public final ܺ:Ll/᩷ۙ֫;

.field public ܺ֫:Z

.field public final ܽ:Landroid/content/Context;

.field public ܽ֫:Z

.field public ܿ:Ll/ᩳᩴ֫;

.field public final ܿ֫:[Ll/֫۬֫;

.field public final ᩳ:Landroid/os/Looper;

.field public ᩳ֫:I

.field public final ᩴ:J

.field public ᩴ֫:Ll/᩶ۜۧ;

.field public ᩵:Ll/ۛ۬ܺ;

.field public ᩵֫:Ll/ܿ᩵֫;

.field public final ᩶:J

.field public ᩶֫:Ljava/lang/Object;

.field public ᩷:Ll/ᩴ᩵֫;

.field public final ᩷֫:[Ll/֫۬֫;

.field public ᩸:I

.field public final ᩸֫:Ll/ۚܿۧ;

.field public ᩹:J

.field public final ᩹֫:Z

.field public final ᩺:Ll/᩹᩵֫;

.field public final ᩻:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public ᩻֫:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "media3.exoplayer"

    .line 132
    invoke-static {v0}, Ll/ܽ᩵֫;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ll/ܺ᩶֫;)V
    .locals 42

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 239
    iget-object v8, v0, Ll/ܺ᩶֫;->ܳ:Landroid/content/ContextWrapper;

    const/4 v2, 0x0

    .line 405
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const-string v3, " [AndroidXMedia3/1.8.0] ["

    const-string v4, "Init "

    .line 239
    invoke-direct/range {p0 .. p0}, Ll/ܳᩴ֫;-><init>()V

    .line 240
    new-instance v5, Ll/ܳۚ֫;

    invoke-direct {v5}, Ll/ܳۚ֫;-><init>()V

    iput-object v5, v1, Ll/ܺۙ֫;->ۖ:Ll/ܳۚ֫;

    .line 242
    :try_start_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 245
    invoke-static/range {p0 .. p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "]"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 242
    invoke-static {v3}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V

    .line 251
    iget-object v7, v0, Ll/ܺ᩶֫;->ܿ:Ll/ܳ֨֫;

    invoke-virtual {v8}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    iput-object v3, v1, Ll/ܺۙ֫;->ܽ:Landroid/content/Context;

    .line 252
    iget-object v3, v0, Ll/ܺ᩶֫;->֫:Ll/ܺܶۡ;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ll/᩶۬֫;

    invoke-direct {v3, v7}, Ll/᩶۬֫;-><init>(Ll/ܽۚ֫;)V

    iput-object v3, v1, Ll/ܺۙ֫;->ۧ:Ll/᩵۬֫;

    .line 253
    iget v3, v0, Ll/ܺ᩶֫;->ۘ:I

    iput v3, v1, Ll/ܺۙ֫;->ᩳ֫:I

    .line 255
    iget-object v3, v0, Ll/ܺ᩶֫;->ۧ:Ll/ᩳᩴ֫;

    iput-object v3, v1, Ll/ܺۙ֫;->ܿ:Ll/ᩳᩴ֫;

    .line 256
    iget v3, v0, Ll/ܺ᩶֫;->᩶:I

    iput v3, v1, Ll/ܺۙ֫;->ۙ֫:I

    .line 258
    iput-boolean v2, v1, Ll/ܺۙ֫;->ۘ֫:Z

    .line 259
    iget-wide v2, v0, Ll/ܺ᩶֫;->᩻:J

    iput-wide v2, v1, Ll/ܺۙ֫;->ᩴ:J

    .line 260
    new-instance v14, Ll/᩷ۙ֫;

    invoke-direct {v14, v1}, Ll/᩷ۙ֫;-><init>(Ll/ܺۙ֫;)V

    iput-object v14, v1, Ll/ܺۙ֫;->ܺ:Ll/᩷ۙ֫;

    .line 261
    new-instance v2, Ll/ۢۙ֫;

    .line 3343
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 261
    iput-object v2, v1, Ll/ܺۙ֫;->ۚ:Ll/ۢۙ֫;

    .line 262
    new-instance v10, Landroid/os/Handler;

    iget-object v2, v0, Ll/ܺ᩶֫;->ۢ:Landroid/os/Looper;

    invoke-direct {v10, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 263
    iget-object v2, v0, Ll/ܺ᩶֫;->᩵:Ll/ۛܶܺ;

    invoke-interface {v2}, Ll/ۛܶܺ;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻۬֫;

    move-object v9, v2

    move-object v11, v14

    move-object v12, v14

    move-object v13, v14

    .line 265
    invoke-interface/range {v9 .. v14}, Ll/᩻۬֫;->֫(Landroid/os/Handler;Ll/ܽۜۧ;Ll/ۚ۫֫;Ll/ۡᩳۧ;Ll/ۤ۟֫;)[Ll/֫۬֫;

    move-result-object v3

    iput-object v3, v1, Ll/ܺۙ֫;->ܿ֫:[Ll/֫۬֫;

    .line 271
    array-length v4, v3

    if-lez v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-static {v4}, Ll/᩺֡֫;->ۧ(Z)V

    .line 272
    array-length v3, v3

    new-array v3, v3, [Ll/֫۬֫;

    iput-object v3, v1, Ll/ܺۙ֫;->᩷֫:[Ll/֫۬֫;

    const/4 v3, 0x0

    .line 273
    :goto_1
    iget-object v4, v1, Ll/ܺۙ֫;->᩷֫:[Ll/֫۬֫;

    array-length v5, v4

    const/4 v6, 0x0

    if-ge v3, v5, :cond_1

    .line 275
    iget-object v5, v1, Ll/ܺۙ֫;->ܿ֫:[Ll/֫۬֫;

    aget-object v5, v5, v3

    .line 276
    invoke-interface {v2, v5}, Ll/᩻۬֫;->֫(Ll/֫۬֫;)V

    aput-object v6, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 284
    :cond_1
    iget-object v2, v0, Ll/ܺ᩶֫;->ܶ:Ll/ۜ᩶֫;

    invoke-virtual {v2}, Ll/ۜ᩶֫;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚܿۧ;

    iput-object v2, v1, Ll/ܺۙ֫;->᩸֫:Ll/ۚܿۧ;

    .line 285
    iget-object v3, v0, Ll/ܺ᩶֫;->ܺ:Ll/ۛܶܺ;

    invoke-interface {v3}, Ll/ۛܶܺ;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡۧۧ;

    iput-object v3, v1, Ll/ܺۙ֫;->ۗ:Ll/ۡۧۧ;

    .line 286
    iget-object v3, v0, Ll/ܺ᩶֫;->ܽ:Ll/ᩳ۫ܽ;

    iget-object v3, v3, Ll/ᩳ۫ܽ;->᩹:Ljava/lang/Object;

    check-cast v3, Landroid/content/ContextWrapper;

    .line 427
    invoke-static {v3}, Ll/ۨܿۧ;->֫(Landroid/content/ContextWrapper;)Ll/ۨܿۧ;

    move-result-object v3

    .line 286
    iput-object v3, v1, Ll/ܺۙ֫;->ۢ:Ll/۬ܿۧ;

    .line 287
    iget-boolean v4, v0, Ll/ܺ᩶֫;->᩸:Z

    iput-boolean v4, v1, Ll/ܺۙ֫;->᩹֫:Z

    .line 288
    iget-object v4, v0, Ll/ܺ᩶֫;->۠:Ll/ۢ۬֫;

    .line 289
    iget-wide v9, v0, Ll/ܺ᩶֫;->ۚ:J

    iput-wide v9, v1, Ll/ܺۙ֫;->ۢ֫:J

    .line 290
    iget-wide v9, v0, Ll/ܺ᩶֫;->֨:J

    iput-wide v9, v1, Ll/ܺۙ֫;->ۡ֫:J

    .line 291
    iget-wide v9, v0, Ll/ܺ᩶֫;->ۡ:J

    iput-wide v9, v1, Ll/ܺۙ֫;->᩶:J

    .line 292
    iget-object v5, v0, Ll/ܺ᩶֫;->֡:Ll/᩷۬֫;

    iput-object v5, v1, Ll/ܺۙ֫;->ۜ֫:Ll/᩷۬֫;

    .line 294
    iget-object v12, v0, Ll/ܺ᩶֫;->ۢ:Landroid/os/Looper;

    iput-object v12, v1, Ll/ܺۙ֫;->ᩳ:Landroid/os/Looper;

    .line 295
    iput-object v7, v1, Ll/ܺۙ֫;->ۡ:Ll/ܳ֨֫;

    .line 296
    iput-object v1, v1, Ll/ܺۙ֫;->ۤ֫:Ll/֨᩵֫;

    .line 297
    new-instance v9, Ll/᩹ۚ֫;

    new-instance v10, Ll/۟֫ᩴ;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    invoke-direct {v9, v12, v7, v10}, Ll/᩹ۚ֫;-><init>(Landroid/os/Looper;Ll/ܽۚ֫;Ll/ܶۚ֫;)V

    iput-object v9, v1, Ll/ܺۙ֫;->ܶ:Ll/᩹ۚ֫;

    .line 302
    new-instance v9, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v9}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v9, v1, Ll/ܺۙ֫;->᩻:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 303
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, v1, Ll/ܺۙ֫;->۬:Ljava/util/ArrayList;

    .line 304
    new-instance v10, Ll/ۚܽۧ;

    invoke-direct {v10}, Ll/ۚܽۧ;-><init>()V

    iput-object v10, v1, Ll/ܺۙ֫;->ۖ֫:Ll/֨ܽۧ;

    .line 306
    new-instance v10, Ll/֨ܿۧ;

    iget-object v11, v1, Ll/ܺۙ֫;->ܿ֫:[Ll/֫۬֫;

    array-length v13, v11

    new-array v13, v13, [Ll/ܿ۬֫;

    array-length v11, v11

    new-array v11, v11, [Ll/ۢܿۧ;

    sget-object v14, Ll/ܰ᩵֫;->ۧ:Ll/ܰ᩵֫;

    invoke-direct {v10, v13, v11, v14, v6}, Ll/֨ܿۧ;-><init>([Ll/ܿ۬֫;[Ll/ۢܿۧ;Ll/ܰ᩵֫;Ljava/lang/Object;)V

    iput-object v10, v1, Ll/ܺۙ֫;->֡:Ll/֨ܿۧ;

    .line 312
    new-instance v11, Ll/᩹᩵֫;

    invoke-direct {v11}, Ll/᩹᩵֫;-><init>()V

    iput-object v11, v1, Ll/ܺۙ֫;->᩺:Ll/᩹᩵֫;

    .line 313
    new-instance v11, Ll/ۘ᩵֫;

    invoke-direct {v11}, Ll/ۘ᩵֫;-><init>()V

    const/16 v13, 0x14

    new-array v13, v13, [I

    fill-array-data v13, :array_0

    .line 315
    invoke-virtual {v11, v13}, Ll/ۘ᩵֫;->֫([I)V

    .line 0
    instance-of v13, v2, Ll/ۜܿۧ;

    const/16 v14, 0x1d

    .line 336
    invoke-virtual {v11, v14, v13}, Ll/ۘ᩵֫;->֫(IZ)V

    const/16 v13, 0x17

    const/4 v14, 0x0

    .line 338
    invoke-virtual {v11, v13, v14}, Ll/ۘ᩵֫;->֫(IZ)V

    const/16 v13, 0x19

    .line 339
    invoke-virtual {v11, v13, v14}, Ll/ۘ᩵֫;->֫(IZ)V

    const/16 v13, 0x21

    .line 340
    invoke-virtual {v11, v13, v14}, Ll/ۘ᩵֫;->֫(IZ)V

    const/16 v13, 0x1a

    .line 341
    invoke-virtual {v11, v13, v14}, Ll/ۘ᩵֫;->֫(IZ)V

    const/16 v13, 0x22

    .line 342
    invoke-virtual {v11, v13, v14}, Ll/ۘ᩵֫;->֫(IZ)V

    .line 343
    invoke-virtual {v11}, Ll/ۘ᩵֫;->֫()Ll/ᩴ᩵֫;

    move-result-object v11

    iput-object v11, v1, Ll/ܺۙ֫;->ܰ:Ll/ᩴ᩵֫;

    .line 344
    new-instance v13, Ll/ۘ᩵֫;

    invoke-direct {v13}, Ll/ۘ᩵֫;-><init>()V

    .line 346
    invoke-virtual {v13, v11}, Ll/ۘ᩵֫;->֫(Ll/ᩴ᩵֫;)V

    const/4 v11, 0x4

    .line 347
    invoke-virtual {v13, v11}, Ll/ۘ᩵֫;->֫(I)V

    const/16 v11, 0xa

    .line 348
    invoke-virtual {v13, v11}, Ll/ۘ᩵֫;->֫(I)V

    .line 349
    invoke-virtual {v13}, Ll/ۘ᩵֫;->֫()Ll/ᩴ᩵֫;

    move-result-object v11

    iput-object v11, v1, Ll/ܺۙ֫;->᩷:Ll/ᩴ᩵֫;

    .line 350
    invoke-virtual {v7, v12, v6}, Ll/ܳ֨֫;->֫(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ll/᩵ۚ֫;

    move-result-object v6

    iput-object v6, v1, Ll/ܺۙ֫;->֫֫:Ll/᩵ۚ֫;

    .line 351
    new-instance v6, Ll/ܶ᩶֫;

    invoke-direct {v6, v1}, Ll/ܶ᩶֫;-><init>(Ll/ܺۙ֫;)V

    iput-object v6, v1, Ll/ܺۙ֫;->ۧ֫:Ll/ܶ᩶֫;

    .line 354
    invoke-static {v10}, Ll/۬ۗ֫;->֫(Ll/֨ܿۧ;)Ll/۬ۗ֫;

    move-result-object v11

    iput-object v11, v1, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    .line 355
    iget-object v11, v1, Ll/ܺۙ֫;->ۧ:Ll/᩵۬֫;

    invoke-interface {v11, v1, v12}, Ll/᩵۬֫;->֫(Ll/֨᩵֫;Landroid/os/Looper;)V

    .line 356
    new-instance v11, Ll/ܰ۬֫;

    iget-object v13, v0, Ll/ܺ᩶֫;->ۖ:Ljava/lang/String;

    invoke-direct {v11, v13}, Ll/ܰ۬֫;-><init>(Ljava/lang/String;)V

    .line 357
    new-instance v14, Ll/᩶ۙ֫;

    iget-object v13, v1, Ll/ܺۙ֫;->ܽ:Landroid/content/Context;

    move-object/from16 v36, v5

    iget-object v5, v1, Ll/ܺۙ֫;->ܿ֫:[Ll/֫۬֫;

    move-object/from16 v37, v8

    iget-object v8, v1, Ll/ܺۙ֫;->᩷֫:[Ll/֫۬֫;

    move-object/from16 v38, v15

    iget-object v15, v0, Ll/ܺ᩶֫;->᩷:Ll/᩷᩶֫;

    .line 364
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v22, Ll/ۨ᩹֫;

    invoke-direct/range {v22 .. v22}, Ll/ۨ᩹֫;-><init>()V

    iget v15, v1, Ll/ܺۙ֫;->ܳ֫:I

    move-object/from16 v39, v9

    iget-boolean v9, v1, Ll/ܺۙ֫;->ܺ֫:Z

    move-object/from16 v40, v11

    iget-object v11, v1, Ll/ܺۙ֫;->ۧ:Ll/᩵۬֫;

    move-object/from16 v33, v6

    iget-object v6, v0, Ll/ܺ᩶֫;->ۜ:Ll/ۤ᩹֫;

    move-object/from16 v28, v6

    move-object/from16 v41, v7

    iget-wide v6, v0, Ll/ܺ᩶֫;->ᩴ:J

    iget-object v0, v1, Ll/ܺۙ֫;->ۚ:Ll/ۢۙ֫;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x1

    move-object/from16 v16, v14

    move-object/from16 v17, v13

    move-object/from16 v18, v5

    move-object/from16 v19, v8

    move-object/from16 v20, v2

    move-object/from16 v21, v10

    move-object/from16 v23, v3

    move/from16 v24, v15

    move/from16 v25, v9

    move-object/from16 v26, v11

    move-object/from16 v27, v4

    move-wide/from16 v29, v6

    move-object/from16 v31, v12

    move-object/from16 v32, v41

    move-object/from16 v34, v40

    move-object/from16 v35, v0

    :try_start_1
    invoke-direct/range {v16 .. v35}, Ll/᩶ۙ֫;-><init>(Landroid/content/Context;[Ll/֫۬֫;[Ll/֫۬֫;Ll/ۚܿۧ;Ll/֨ܿۧ;Ll/ۤۙ֫;Ll/۬ܿۧ;IZLl/᩵۬֫;Ll/ۢ۬֫;Ll/ۤ᩹֫;JLandroid/os/Looper;Ll/ܳ֨֫;Ll/ܶ᩶֫;Ll/ܰ۬֫;Ll/᩹᩻ۧ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x1

    move-object/from16 v1, p0

    :try_start_2
    iput-object v14, v1, Ll/ܺۙ֫;->۠:Ll/᩶ۙ֫;

    .line 381
    invoke-virtual {v14}, Ll/᩶ۙ֫;->ܽ()Landroid/os/Looper;

    move-result-object v8

    const/4 v2, 0x0

    .line 384
    iput v2, v1, Ll/ܺۙ֫;->ܳ֫:I

    .line 385
    sget-object v2, Ll/ܿ᩵֫;->֫֫:Ll/ܿ᩵֫;

    iput-object v2, v1, Ll/ܺۙ֫;->ۙ:Ll/ܿ᩵֫;

    .line 387
    iput-object v2, v1, Ll/ܺۙ֫;->᩵֫:Ll/ܿ᩵֫;

    const/4 v15, -0x1

    .line 388
    iput v15, v1, Ll/ܺۙ֫;->᩸:I

    .line 389
    sget-object v2, Ll/ۙ֡֫;->ܽ:Ll/ۙ֡֫;

    iput-object v2, v1, Ll/ܺۙ֫;->ۘ:Ll/ۙ֡֫;

    .line 390
    iput-boolean v0, v1, Ll/ܺۙ֫;->ܶ֫:Z

    .line 392
    iget-object v0, v1, Ll/ܺۙ֫;->ۧ:Ll/᩵۬֫;

    invoke-virtual {v1, v0}, Ll/ܺۙ֫;->ۧ(Ll/֡᩵֫;)V

    .line 393
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, v12}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object v2, v1, Ll/ܺۙ֫;->ۧ:Ll/᩵۬֫;

    invoke-interface {v3, v0, v2}, Ll/۬ܿۧ;->֫(Landroid/os/Handler;Ll/ۗܿۧ;)V

    .line 394
    iget-object v0, v1, Ll/ܺۙ֫;->ܺ:Ll/᩷ۙ֫;

    move-object/from16 v2, v39

    .line 493
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 398
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-lt v0, v2, :cond_2

    .line 399
    iget-object v0, v1, Ll/ܺۙ֫;->ܽ:Landroid/content/Context;

    move-object/from16 v2, p1

    iget-boolean v3, v2, Ll/ܺ᩶֫;->᩹:Z

    .line 475
    invoke-virtual {v14}, Ll/᩶ۙ֫;->ܽ()Landroid/os/Looper;

    move-result-object v4

    const/4 v5, 0x0

    move-object/from16 v7, v41

    .line 3440
    invoke-virtual {v7, v4, v5}, Ll/ܳ֨֫;->֫(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ll/᩵ۚ֫;

    move-result-object v4

    .line 3441
    new-instance v6, Ll/ܽۙ֫;

    move-object/from16 v9, v40

    invoke-direct {v6, v0, v3, v1, v9}, Ll/ܽۙ֫;-><init>(Landroid/content/Context;ZLl/ܺۙ֫;Ll/ܰ۬֫;)V

    invoke-interface {v4, v6}, Ll/᩵ۚ֫;->֫(Ljava/lang/Runnable;)Z

    goto :goto_2

    :cond_2
    move-object/from16 v2, p1

    move-object/from16 v7, v41

    const/4 v5, 0x0

    :goto_2
    move-object v0, v5

    .line 403
    new-instance v3, Ll/ۧۚ֫;

    .line 405
    new-instance v4, Ll/᩹᩶֫;

    invoke-direct {v4, v1}, Ll/᩹᩶֫;-><init>(Ll/ܺۙ֫;)V

    const/4 v6, 0x1

    move-object v9, v3

    move-object/from16 v10, v38

    move-object v11, v8

    move-object v13, v7

    move-object v5, v14

    move-object v14, v4

    invoke-direct/range {v9 .. v14}, Ll/ۧۚ֫;-><init>(Ljava/lang/Object;Landroid/os/Looper;Landroid/os/Looper;Ll/ܳ֨֫;Ll/֫ۚ֫;)V

    iput-object v3, v1, Ll/ܺۙ֫;->ۜ:Ll/ۧۚ֫;

    .line 410
    new-instance v4, Ll/᩶᩶֫;

    invoke-direct {v4, v1}, Ll/᩶᩶֫;-><init>(Ll/ܺۙ֫;)V

    invoke-virtual {v3, v4}, Ll/ۧۚ֫;->֫(Ljava/lang/Runnable;)V

    .line 414
    new-instance v9, Ll/۠᩹֫;

    iget-object v10, v2, Ll/ܺ᩶֫;->ۢ:Landroid/os/Looper;

    iget-object v11, v1, Ll/ܺۙ֫;->ܺ:Ll/᩷ۙ֫;

    const/4 v12, 0x4

    move-object v2, v9

    move-object/from16 v3, v37

    move-object v4, v8

    move-object v14, v5

    move-object/from16 v13, v36

    move-object v5, v10

    const/4 v10, 0x1

    move-object v6, v11

    move-object v11, v7

    invoke-direct/range {v2 .. v7}, Ll/۠᩹֫;-><init>(Landroid/content/ContextWrapper;Landroid/os/Looper;Landroid/os/Looper;Ll/֨᩹֫;Ll/ܳ֨֫;)V

    iput-object v9, v1, Ll/ܺۙ֫;->ܳ:Ll/۠᩹֫;

    .line 417
    invoke-virtual {v9}, Ll/۠᩹֫;->֫()V

    .line 443
    new-instance v2, Ll/ۖ۬֫;

    .line 52
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 53
    invoke-virtual/range {v37 .. v37}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 54
    invoke-virtual {v11, v8, v0}, Ll/ܳ֨֫;->֫(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ll/᩵ۚ֫;

    .line 443
    iput-object v2, v1, Ll/ܺۙ֫;->۬֫:Ll/ۖ۬֫;

    .line 445
    new-instance v2, Ll/ᩴ۬֫;

    .line 51
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 52
    invoke-virtual/range {v37 .. v37}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 53
    invoke-virtual {v11, v8, v0}, Ll/ܳ֨֫;->֫(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ll/᩵ۚ֫;

    .line 445
    iput-object v2, v1, Ll/ܺۙ֫;->۫֫:Ll/ᩴ۬֫;

    .line 447
    sget-object v0, Ll/ܺᩴ֫;->ᩳ:Ll/ܺᩴ֫;

    .line 448
    sget-object v0, Ll/ۜ֡֫;->ᩳ:Ll/ۜ֡֫;

    iput-object v0, v1, Ll/ܺۙ֫;->ۗ֫:Ll/ۜ֡֫;

    .line 449
    sget-object v0, Ll/ܿ֨֫;->ܽ:Ll/ܿ֨֫;

    iput-object v0, v1, Ll/ܺۙ֫;->֨֫:Ll/ܿ֨֫;

    .line 451
    invoke-virtual {v14, v13}, Ll/᩶ۙ֫;->֫(Ll/᩷۬֫;)V

    .line 452
    iget-object v0, v1, Ll/ܺۙ֫;->ܿ:Ll/ᩳᩴ֫;

    invoke-virtual {v14, v0}, Ll/᩶ۙ֫;->֫(Ll/ᩳᩴ֫;)V

    .line 453
    iget-object v0, v1, Ll/ܺۙ֫;->ܿ:Ll/ᩳᩴ֫;

    const/4 v2, 0x3

    invoke-direct {v1, v10, v2, v0}, Ll/ܺۙ֫;->֫(IILjava/lang/Object;)V

    .line 454
    iget v0, v1, Ll/ܺۙ֫;->ۙ֫:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x2

    invoke-direct {v1, v2, v12, v0}, Ll/ܺۙ֫;->֫(IILjava/lang/Object;)V

    const/4 v0, 0x5

    move-object/from16 v3, v38

    .line 455
    invoke-direct {v1, v2, v0, v3}, Ll/ܺۙ֫;->֫(IILjava/lang/Object;)V

    .line 457
    iget-boolean v0, v1, Ll/ܺۙ֫;->ۘ֫:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/16 v2, 0x9

    invoke-direct {v1, v10, v2, v0}, Ll/ܺۙ֫;->֫(IILjava/lang/Object;)V

    .line 458
    iget-object v0, v1, Ll/ܺۙ֫;->ۚ:Ll/ۢۙ֫;

    const/4 v2, 0x6

    const/16 v3, 0x8

    invoke-direct {v1, v2, v3, v0}, Ll/ܺۙ֫;->֫(IILjava/lang/Object;)V

    .line 460
    iget v0, v1, Ll/ܺۙ֫;->ᩳ֫:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v2, 0x10

    .line 2928
    invoke-direct {v1, v15, v2, v0}, Ll/ܺۙ֫;->֫(IILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 462
    iget-object v0, v1, Ll/ܺۙ֫;->ۖ:Ll/ܳۚ֫;

    invoke-virtual {v0}, Ll/ܳۚ֫;->ܿ()Z

    return-void

    :catchall_0
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_3

    :catchall_1
    move-exception v0

    :goto_3
    iget-object v2, v1, Ll/ܺۙ֫;->ۖ:Ll/ܳۚ֫;

    invoke-virtual {v2}, Ll/ܳۚ֫;->ܿ()Z

    .line 463
    throw v0

    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x1f
        0x14
        0x1e
        0x15
        0x23
        0x16
        0x18
        0x1b
        0x1c
        0x20
    .end array-data
.end method

.method private ֫(Ll/۬ۗ֫;)J
    .locals 7

    .line 1999
    iget-object v0, p1, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    iget-wide v1, p1, Ll/۬ۗ֫;->ۘ:J

    iget-object v3, p1, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    invoke-virtual {v0}, Ll/ܺۧۧ;->֫()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2000
    iget-object v0, p1, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    iget-object v0, v0, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget-object v4, p0, Ll/ܺۙ֫;->᩺:Ll/᩹᩵֫;

    invoke-virtual {v3, v0, v4}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v1, v5

    if-nez v0, :cond_0

    .line 2004
    invoke-direct {p0, p1}, Ll/ܺۙ֫;->ܽ(Ll/۬ۗ֫;)I

    move-result p1

    iget-object v0, p0, Ll/ܳᩴ֫;->֫:Ll/᩶᩵֫;

    const-wide/16 v1, 0x0

    .line 1097
    invoke-virtual {v3, p1, v0, v1, v2}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object p1

    .line 320
    iget-wide v0, p1, Ll/᩶᩵֫;->֫:J

    invoke-static {v0, v1}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v0

    return-wide v0

    .line 684
    :cond_0
    iget-wide v3, v4, Ll/᩹᩵֫;->ܿ:J

    invoke-static {v3, v4}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v3

    .line 2006
    invoke-static {v1, v2}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v0

    add-long/2addr v0, v3

    return-wide v0

    .line 2008
    :cond_1
    invoke-direct {p0, p1}, Ll/ܺۙ֫;->ۧ(Ll/۬ۗ֫;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v0

    return-wide v0
.end method

.method private ֫(Ll/ۙ᩵֫;IJ)Landroid/util/Pair;
    .locals 6

    .line 2700
    invoke-virtual {p1}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_1

    .line 2702
    iput p2, p0, Ll/ܺۙ֫;->᩸:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p3, p1

    if-nez v0, :cond_0

    move-wide p3, v1

    .line 2703
    :cond_0
    iput-wide p3, p0, Ll/ܺۙ֫;->᩹:J

    const/4 p1, 0x0

    return-object p1

    :cond_1
    const/4 v0, -0x1

    if-eq p2, v0, :cond_2

    .line 2707
    invoke-virtual {p1}, Ll/ۙ᩵֫;->ۧ()I

    move-result v0

    if-lt p2, v0, :cond_3

    .line 2710
    :cond_2
    iget-boolean p2, p0, Ll/ܺۙ֫;->ܺ֫:Z

    invoke-virtual {p1, p2}, Ll/ۙ᩵֫;->֫(Z)I

    move-result p2

    .line 2711
    iget-object p3, p0, Ll/ܳᩴ֫;->֫:Ll/᩶᩵֫;

    .line 1097
    invoke-virtual {p1, p2, p3, v1, v2}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object p3

    .line 320
    iget-wide p3, p3, Ll/᩶᩵֫;->֫:J

    invoke-static {p3, p4}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide p3

    :cond_3
    move v3, p2

    .line 2713
    iget-object v2, p0, Ll/ܺۙ֫;->᩺:Ll/᩹᩵֫;

    invoke-static {p3, p4}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v4

    iget-object v1, p0, Ll/ܳᩴ֫;->֫:Ll/᩶᩵֫;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Ll/ۙ᩵֫;->֫(Ll/᩶᩵֫;Ll/᩹᩵֫;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method private ֫(ILl/۬ۗ֫;I)Ll/ۚ᩵֫;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 2260
    new-instance v2, Ll/᩹᩵֫;

    invoke-direct {v2}, Ll/᩹᩵֫;-><init>()V

    .line 2261
    iget-object v3, v1, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    invoke-virtual {v3}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v3

    const/4 v4, -0x1

    if-nez v3, :cond_0

    .line 2262
    iget-object v3, v1, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    iget-object v3, v3, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    .line 2263
    iget-object v5, v1, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    invoke-virtual {v5, v3, v2}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    .line 2264
    iget v5, v2, Ll/᩹᩵֫;->᩻:I

    .line 2265
    iget-object v6, v1, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    invoke-virtual {v6, v3}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    move-result v6

    .line 2266
    iget-object v7, v1, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    iget-object v8, v0, Ll/ܳᩴ֫;->֫:Ll/᩶᩵֫;

    const-wide/16 v9, 0x0

    .line 1097
    invoke-virtual {v7, v5, v8, v9, v10}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object v7

    .line 2266
    iget-object v7, v7, Ll/᩶᩵֫;->ᩴ:Ljava/lang/Object;

    .line 2267
    iget-object v8, v0, Ll/ܳᩴ֫;->֫:Ll/᩶᩵֫;

    iget-object v8, v8, Ll/᩶᩵֫;->ۡ:Ll/ۧ᩵֫;

    move-object v11, v3

    move v9, v5

    move v12, v6

    move-object v10, v8

    move-object v8, v7

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    const/4 v6, -0x1

    move/from16 v9, p3

    move-object v8, v3

    move-object v10, v8

    move-object v11, v10

    const/4 v12, -0x1

    :goto_0
    if-nez p1, :cond_3

    .line 2272
    iget-object v3, v1, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    invoke-virtual {v3}, Ll/ܺۧۧ;->֫()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 2274
    iget-object v3, v1, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    iget v4, v3, Ll/ܺۧۧ;->֫:I

    iget v3, v3, Ll/ܺۧۧ;->ۧ:I

    .line 2275
    invoke-virtual {v2, v4, v3}, Ll/᩹᩵֫;->֫(II)J

    move-result-wide v2

    .line 2278
    invoke-static/range {p2 .. p2}, Ll/ܺۙ֫;->ᩳ(Ll/۬ۗ֫;)J

    move-result-wide v4

    goto :goto_2

    .line 2279
    :cond_1
    iget-object v3, v1, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    iget v3, v3, Ll/ܺۧۧ;->ܽ:I

    if-eq v3, v4, :cond_2

    .line 2282
    iget-object v2, v0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    invoke-static {v2}, Ll/ܺۙ֫;->ᩳ(Ll/۬ۗ֫;)J

    move-result-wide v2

    goto :goto_1

    .line 2286
    :cond_2
    iget-wide v3, v2, Ll/᩹᩵֫;->ܿ:J

    iget-wide v5, v2, Ll/᩹᩵֫;->ۧ:J

    add-long/2addr v3, v5

    move-wide v2, v3

    goto :goto_1

    .line 2289
    :cond_3
    iget-object v3, v1, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    invoke-virtual {v3}, Ll/ܺۧۧ;->֫()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 2290
    iget-wide v2, v1, Ll/۬ۗ֫;->ۖ:J

    .line 2291
    invoke-static/range {p2 .. p2}, Ll/ܺۙ֫;->ᩳ(Ll/۬ۗ֫;)J

    move-result-wide v4

    goto :goto_2

    .line 2293
    :cond_4
    iget-wide v2, v2, Ll/᩹᩵֫;->ܿ:J

    iget-wide v4, v1, Ll/۬ۗ֫;->ۖ:J

    add-long/2addr v2, v4

    :goto_1
    move-wide v4, v2

    .line 2296
    :goto_2
    new-instance v6, Ll/ۚ᩵֫;

    .line 2302
    invoke-static {v2, v3}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v13

    .line 2303
    invoke-static {v4, v5}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v15

    iget-object v1, v1, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    iget v2, v1, Ll/ܺۧۧ;->֫:I

    iget v1, v1, Ll/ܺۧۧ;->ۧ:I

    move-object v7, v6

    move/from16 v17, v2

    move/from16 v18, v1

    invoke-direct/range {v7 .. v18}, Ll/ۚ᩵֫;-><init>(Ljava/lang/Object;ILl/ۧ᩵֫;Ljava/lang/Object;IJJII)V

    return-object v6
.end method

.method private ֫(Ll/ۛۗ֫;)Ll/ۨۗ֫;
    .locals 9

    .line 2724
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    invoke-direct {p0, v0}, Ll/ܺۙ֫;->ܽ(Ll/۬ۗ֫;)I

    move-result v0

    .line 2725
    new-instance v8, Ll/ۨۗ֫;

    iget-object v1, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v4, v1, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    const/4 v5, 0x0

    goto :goto_0

    :cond_0
    move v5, v0

    .line 2729
    :goto_0
    iget-object v6, p0, Ll/ܺۙ֫;->ۡ:Ll/ܳ֨֫;

    .line 2731
    iget-object v2, p0, Ll/ܺۙ֫;->۠:Ll/᩶ۙ֫;

    invoke-virtual {v2}, Ll/᩶ۙ֫;->ܽ()Landroid/os/Looper;

    move-result-object v7

    move-object v1, v8

    move-object v3, p1

    invoke-direct/range {v1 .. v7}, Ll/ۨۗ֫;-><init>(Ll/ۤۗ֫;Ll/ۛۗ֫;Ll/ۙ᩵֫;ILl/ܳ֨֫;Landroid/os/Looper;)V

    return-object v8
.end method

.method public static ֫(Ll/۬ۗ֫;I)Ll/۬ۗ֫;
    .locals 1

    .line 2651
    invoke-virtual {p0, p1}, Ll/۬ۗ֫;->֫(I)Ll/۬ۗ֫;

    move-result-object p0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 2653
    invoke-virtual {p0, p1}, Ll/۬ۗ֫;->֫(Z)Ll/۬ۗ֫;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ll/۬ۗ֫;Ll/ۙ᩵֫;Landroid/util/Pair;)Ll/۬ۗ֫;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    .line 2545
    invoke-virtual/range {p2 .. p2}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_1

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    :goto_1
    invoke-static {v3}, Ll/᩺֡֫;->֫(Z)V

    move-object/from16 v3, p1

    .line 2547
    iget-object v5, v3, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    .line 2548
    invoke-direct/range {p0 .. p1}, Ll/ܺۙ֫;->֫(Ll/۬ۗ֫;)J

    move-result-wide v6

    .line 2550
    invoke-virtual/range {p1 .. p2}, Ll/۬ۗ֫;->֫(Ll/ۙ᩵֫;)Ll/۬ۗ֫;

    move-result-object v8

    .line 2552
    invoke-virtual/range {p2 .. p2}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 2554
    invoke-static {}, Ll/۬ۗ֫;->ᩳ()Ll/ܺۧۧ;

    move-result-object v1

    .line 2555
    iget-wide v2, v0, Ll/ܺۙ֫;->᩹:J

    invoke-static {v2, v3}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v14

    .line 2556
    sget-object v18, Ll/ۛܽۧ;->ᩳ:Ll/ۛܽۧ;

    iget-object v2, v0, Ll/ܺۙ֫;->֡:Ll/֨ܿۧ;

    .line 2565
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v20

    const-wide/16 v16, 0x0

    move-object v9, v1

    move-wide v10, v14

    move-wide v12, v14

    move-object/from16 v19, v2

    .line 2557
    invoke-virtual/range {v8 .. v20}, Ll/۬ۗ֫;->֫(Ll/ܺۧۧ;JJJJLl/ۛܽۧ;Ll/֨ܿۧ;Ljava/util/List;)Ll/۬ۗ֫;

    move-result-object v2

    .line 2566
    invoke-virtual {v2, v1}, Ll/۬ۗ֫;->֫(Ll/ܺۧۧ;)Ll/۬ۗ֫;

    move-result-object v1

    .line 2567
    iget-wide v2, v1, Ll/۬ۗ֫;->ۖ:J

    iput-wide v2, v1, Ll/۬ۗ֫;->֫:J

    return-object v1

    .line 2571
    :cond_2
    iget-object v3, v8, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    iget-object v3, v3, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    .line 2572
    iget-object v9, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v3, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    .line 2574
    new-instance v10, Ll/ܺۧۧ;

    iget-object v11, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-direct {v10, v11}, Ll/ܺۧۧ;-><init>(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v10, v8, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    :goto_2
    move-object v14, v10

    .line 2575
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    .line 2576
    invoke-static {v6, v7}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v6

    .line 2577
    invoke-virtual {v5}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v2

    if-nez v2, :cond_4

    .line 2578
    iget-object v2, v0, Ll/ܺۙ֫;->᩺:Ll/᩹᩵֫;

    .line 2579
    invoke-virtual {v5, v3, v2}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    move-result-object v2

    .line 693
    iget-wide v2, v2, Ll/᩹᩵֫;->ܿ:J

    sub-long/2addr v6, v2

    :cond_4
    if-eqz v9, :cond_b

    cmp-long v2, v12, v6

    if-gez v2, :cond_5

    goto/16 :goto_5

    :cond_5
    if-nez v2, :cond_9

    .line 2599
    iget-object v2, v8, Ll/۬ۗ֫;->ᩳ:Ll/ܺۧۧ;

    iget-object v2, v2, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    .line 2600
    invoke-virtual {v1, v2}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_7

    .line 2601
    iget-object v3, v0, Ll/ܺۙ֫;->᩺:Ll/᩹᩵֫;

    .line 1275
    invoke-virtual {v1, v2, v3, v4}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;

    move-result-object v2

    .line 2602
    iget v2, v2, Ll/᩹᩵֫;->᩻:I

    iget-object v3, v14, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget-object v4, v0, Ll/ܺۙ֫;->᩺:Ll/᩹᩵֫;

    .line 2603
    invoke-virtual {v1, v3, v4}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    move-result-object v3

    iget v3, v3, Ll/᩹᩵֫;->᩻:I

    if-eq v2, v3, :cond_6

    goto :goto_3

    :cond_6
    return-object v8

    .line 2606
    :cond_7
    :goto_3
    iget-object v2, v14, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget-object v3, v0, Ll/ܺۙ֫;->᩺:Ll/᩹᩵֫;

    invoke-virtual {v1, v2, v3}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    .line 2608
    invoke-virtual {v14}, Ll/ܺۧۧ;->֫()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 2609
    iget-object v1, v0, Ll/ܺۙ֫;->᩺:Ll/᩹᩵֫;

    iget v2, v14, Ll/ܺۧۧ;->֫:I

    iget v3, v14, Ll/ܺۧۧ;->ۧ:I

    invoke-virtual {v1, v2, v3}, Ll/᩹᩵֫;->֫(II)J

    move-result-wide v1

    goto :goto_4

    .line 2610
    :cond_8
    iget-object v1, v0, Ll/ܺۙ֫;->᩺:Ll/᩹᩵֫;

    iget-wide v1, v1, Ll/᩹᩵֫;->ۧ:J

    .line 2611
    :goto_4
    iget-wide v10, v8, Ll/۬ۗ֫;->ۖ:J

    iget-wide v12, v8, Ll/۬ۗ֫;->ۖ:J

    iget-wide v3, v8, Ll/۬ۗ֫;->ۧ:J

    iget-wide v5, v8, Ll/۬ۗ֫;->ۖ:J

    sub-long v16, v1, v5

    iget-object v5, v8, Ll/۬ۗ֫;->֨:Ll/ۛܽۧ;

    iget-object v6, v8, Ll/۬ۗ֫;->۠:Ll/֨ܿۧ;

    iget-object v7, v8, Ll/۬ۗ֫;->᩵:Ljava/util/List;

    move-object v9, v14

    move-object v0, v14

    move-wide v14, v3

    move-object/from16 v18, v5

    move-object/from16 v19, v6

    move-object/from16 v20, v7

    .line 2612
    invoke-virtual/range {v8 .. v20}, Ll/۬ۗ֫;->֫(Ll/ܺۧۧ;JJJJLl/ۛܽۧ;Ll/֨ܿۧ;Ljava/util/List;)Ll/۬ۗ֫;

    move-result-object v3

    .line 2621
    invoke-virtual {v3, v0}, Ll/۬ۗ֫;->֫(Ll/ܺۧۧ;)Ll/۬ۗ֫;

    move-result-object v0

    .line 2622
    iput-wide v1, v0, Ll/۬ۗ֫;->֫:J

    return-object v0

    :cond_9
    move-object v0, v14

    .line 2625
    invoke-virtual {v0}, Ll/ܺۧۧ;->֫()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 2627
    iget-wide v1, v8, Ll/۬ۗ֫;->ۚ:J

    sub-long v3, v12, v6

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x0

    .line 2628
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v16

    .line 2631
    iget-wide v1, v8, Ll/۬ۗ֫;->֫:J

    .line 2632
    iget-object v3, v8, Ll/۬ۗ֫;->ᩳ:Ll/ܺۧۧ;

    iget-object v4, v8, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    invoke-virtual {v3, v4}, Ll/ܺۧۧ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    add-long v1, v12, v16

    .line 2635
    :cond_a
    iget-object v3, v8, Ll/۬ۗ֫;->֨:Ll/ۛܽۧ;

    iget-object v4, v8, Ll/۬ۗ֫;->۠:Ll/֨ܿۧ;

    iget-object v5, v8, Ll/۬ۗ֫;->᩵:Ljava/util/List;

    move-object v9, v0

    move-wide v10, v12

    move-wide v6, v12

    move-wide v14, v6

    move-object/from16 v18, v3

    move-object/from16 v19, v4

    move-object/from16 v20, v5

    .line 2636
    invoke-virtual/range {v8 .. v20}, Ll/۬ۗ֫;->֫(Ll/ܺۧۧ;JJJJLl/ۛܽۧ;Ll/֨ܿۧ;Ljava/util/List;)Ll/۬ۗ֫;

    move-result-object v0

    .line 2645
    iput-wide v1, v0, Ll/۬ۗ֫;->֫:J

    return-object v0

    :cond_b
    :goto_5
    move-wide v6, v12

    move-object v0, v14

    .line 2583
    invoke-virtual {v0}, Ll/ܺۧۧ;->֫()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    if-nez v9, :cond_c

    .line 2592
    sget-object v1, Ll/ۛܽۧ;->ᩳ:Ll/ۛܽۧ;

    goto :goto_6

    :cond_c
    iget-object v1, v8, Ll/۬ۗ֫;->֨:Ll/ۛܽۧ;

    :goto_6
    move-object/from16 v18, v1

    if-nez v9, :cond_d

    move-object v1, v0

    move-object/from16 v0, p0

    .line 2593
    iget-object v2, v0, Ll/ܺۙ֫;->֡:Ll/֨ܿۧ;

    goto :goto_7

    :cond_d
    move-object v1, v0

    move-object/from16 v0, p0

    iget-object v2, v8, Ll/۬ۗ֫;->۠:Ll/֨ܿۧ;

    :goto_7
    move-object/from16 v19, v2

    if-nez v9, :cond_e

    .line 2594
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v2

    goto :goto_8

    :cond_e
    iget-object v2, v8, Ll/۬ۗ֫;->᩵:Ljava/util/List;

    :goto_8
    move-object/from16 v20, v2

    const-wide/16 v16, 0x0

    move-object v9, v1

    move-wide v10, v6

    move-wide v12, v6

    move-wide v14, v6

    .line 2586
    invoke-virtual/range {v8 .. v20}, Ll/۬ۗ֫;->֫(Ll/ܺۧۧ;JJJJLl/ۛܽۧ;Ll/֨ܿۧ;Ljava/util/List;)Ll/۬ۗ֫;

    move-result-object v2

    .line 2595
    invoke-virtual {v2, v1}, Ll/۬ۗ֫;->֫(Ll/ܺۧۧ;)Ll/۬ۗ֫;

    move-result-object v1

    .line 2596
    iput-wide v6, v1, Ll/۬ۗ֫;->֫:J

    return-object v1
.end method

.method private ֫(II)V
    .locals 3

    .line 2827
    iget-object v0, p0, Ll/ܺۙ֫;->֨֫:Ll/ܿ֨֫;

    invoke-virtual {v0}, Ll/ܿ֨֫;->ۧ()I

    move-result v0

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Ll/ܺۙ֫;->֨֫:Ll/ܿ֨֫;

    invoke-virtual {v0}, Ll/ܿ֨֫;->֫()I

    move-result v0

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 2828
    :cond_1
    :goto_0
    new-instance v0, Ll/ܿ֨֫;

    invoke-direct {v0, p1, p2}, Ll/ܿ֨֫;-><init>(II)V

    iput-object v0, p0, Ll/ܺۙ֫;->֨֫:Ll/ܿ֨֫;

    .line 2829
    new-instance v0, Ll/֨᩶֫;

    invoke-direct {v0, p1, p2}, Ll/֨᩶֫;-><init>(II)V

    iget-object v1, p0, Ll/ܺۙ֫;->ܶ:Ll/᩹ۚ֫;

    const/16 v2, 0x18

    invoke-virtual {v1, v2, v0}, Ll/᩹ۚ֫;->ۧ(ILl/۠ۚ֫;)V

    .line 2831
    new-instance v0, Ll/ܿ֨֫;

    invoke-direct {v0, p1, p2}, Ll/ܿ֨֫;-><init>(II)V

    const/4 p1, 0x2

    const/16 p2, 0xe

    invoke-direct {p0, p1, p2, v0}, Ll/ܺۙ֫;->֫(IILjava/lang/Object;)V

    return-void
.end method

.method private ֫(IILjava/lang/Object;)V
    .locals 6

    .line 2933
    iget-object v0, p0, Ll/ܺۙ֫;->ܿ֫:[Ll/֫۬֫;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, -0x1

    if-ge v3, v1, :cond_2

    aget-object v5, v0, v3

    if-eq p1, v4, :cond_0

    .line 2934
    invoke-interface {v5}, Ll/֫۬֫;->ۖ()I

    move-result v4

    if-ne v4, p1, :cond_1

    .line 2935
    :cond_0
    invoke-direct {p0, v5}, Ll/ܺۙ֫;->֫(Ll/ۛۗ֫;)Ll/ۨۗ֫;

    move-result-object v4

    invoke-virtual {v4, p2}, Ll/ۨۗ֫;->֫(I)V

    invoke-virtual {v4, p3}, Ll/ۨۗ֫;->֫(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ll/ۨۗ֫;->ܿ()V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 2938
    :cond_2
    iget-object v0, p0, Ll/ܺۙ֫;->᩷֫:[Ll/֫۬֫;

    array-length v1, v0

    :goto_1
    if-ge v2, v1, :cond_5

    aget-object v3, v0, v2

    if-eqz v3, :cond_4

    if-eq p1, v4, :cond_3

    .line 2939
    invoke-interface {v3}, Ll/֫۬֫;->ۖ()I

    move-result v5

    if-ne v5, p1, :cond_4

    .line 2940
    :cond_3
    invoke-direct {p0, v3}, Ll/ܺۙ֫;->֫(Ll/ۛۗ֫;)Ll/ۨۗ֫;

    move-result-object v3

    invoke-virtual {v3, p2}, Ll/ۨۗ֫;->֫(I)V

    invoke-virtual {v3, p3}, Ll/ۨۗ֫;->֫(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ll/ۨۗ֫;->ܿ()V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    return-void
.end method

.method private ֫(IZ)V
    .locals 12

    .line 2871
    iget-boolean v0, p0, Ll/ܺۙ֫;->᩻֫:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    .line 2878
    :cond_0
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget v0, v0, Ll/۬ۗ֫;->ۡ:I

    if-ne v0, v1, :cond_1

    if-nez p2, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 2844
    :goto_0
    iget-object v2, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-boolean v3, v2, Ll/۬ۗ֫;->ܳ:Z

    if-ne v3, p2, :cond_2

    iget v3, v2, Ll/۬ۗ֫;->ۡ:I

    if-ne v3, v0, :cond_2

    iget v3, v2, Ll/۬ۗ֫;->᩻:I

    if-ne v3, p1, :cond_2

    return-void

    .line 2849
    :cond_2
    iget v3, p0, Ll/ܺۙ֫;->ۨ:I

    add-int/2addr v3, v1

    iput v3, p0, Ll/ܺۙ֫;->ۨ:I

    .line 2852
    iget-boolean v1, v2, Ll/۬ۗ֫;->ᩴ:Z

    if-eqz v1, :cond_3

    .line 2853
    invoke-virtual {v2}, Ll/۬ۗ֫;->֫()Ll/۬ۗ֫;

    move-result-object v2

    .line 2856
    :cond_3
    invoke-virtual {v2, p1, v0, p2}, Ll/۬ۗ֫;->֫(IIZ)Ll/۬ۗ֫;

    move-result-object v4

    .line 2858
    iget-object v1, p0, Ll/ܺۙ֫;->۠:Ll/᩶ۙ֫;

    invoke-virtual {v1, p1, v0, p2}, Ll/᩶ۙ֫;->֫(IIZ)V

    const/4 v10, -0x1

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x5

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    move-object v3, p0

    .line 2860
    invoke-direct/range {v3 .. v11}, Ll/ܺۙ֫;->֫(Ll/۬ۗ֫;IZIJIZ)V

    return-void
.end method

.method private ֫(Landroid/view/SurfaceHolder;)V
    .locals 2

    const/4 v0, 0x0

    .line 2814
    iput-boolean v0, p0, Ll/ܺۙ֫;->ۚ֫:Z

    .line 2815
    iput-object p1, p0, Ll/ܺۙ֫;->֡֫:Landroid/view/SurfaceHolder;

    .line 2816
    iget-object v1, p0, Ll/ܺۙ֫;->ܺ:Ll/᩷ۙ֫;

    invoke-interface {p1, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 2817
    iget-object p1, p0, Ll/ܺۙ֫;->֡֫:Landroid/view/SurfaceHolder;

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2818
    invoke-virtual {p1}, Landroid/view/Surface;->isValid()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2819
    iget-object p1, p0, Ll/ܺۙ֫;->֡֫:Landroid/view/SurfaceHolder;

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    move-result-object p1

    .line 2820
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    invoke-direct {p0, v0, p1}, Ll/ܺۙ֫;->֫(II)V

    return-void

    .line 2822
    :cond_0
    invoke-direct {p0, v0, v0}, Ll/ܺۙ֫;->֫(II)V

    return-void
.end method

.method private ֫(Ljava/lang/Object;)V
    .locals 4

    .line 2781
    iget-object v0, p0, Ll/ܺۙ֫;->᩶֫:Ljava/lang/Object;

    if-eqz v0, :cond_0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 2782
    iget-wide v1, p0, Ll/ܺۙ֫;->ᩴ:J

    goto :goto_1

    :cond_1
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 2785
    :goto_1
    iget-object v3, p0, Ll/ܺۙ֫;->۠:Ll/᩶ۙ֫;

    invoke-virtual {v3, v1, v2, p1}, Ll/᩶ۙ֫;->֫(JLjava/lang/Object;)Z

    move-result v1

    if-eqz v0, :cond_2

    .line 2787
    iget-object v0, p0, Ll/ܺۙ֫;->᩶֫:Ljava/lang/Object;

    iget-object v2, p0, Ll/ܺۙ֫;->۫:Landroid/view/Surface;

    if-ne v0, v2, :cond_2

    .line 2789
    invoke-virtual {v2}, Landroid/view/Surface;->release()V

    const/4 v0, 0x0

    .line 2790
    iput-object v0, p0, Ll/ܺۙ֫;->۫:Landroid/view/Surface;

    .line 2793
    :cond_2
    iput-object p1, p0, Ll/ܺۙ֫;->᩶֫:Ljava/lang/Object;

    if-nez v1, :cond_3

    .line 2795
    new-instance p1, Ll/ۙۙ֫;

    const-string v0, "Detaching surface timed out."

    .line 76
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x3eb

    .line 2796
    invoke-static {p1, v0}, Ll/ᩳ᩶֫;->֫(Ljava/lang/RuntimeException;I)Ll/ᩳ᩶֫;

    move-result-object p1

    .line 2795
    invoke-direct {p0, p1}, Ll/ܺۙ֫;->֫(Ll/ᩳ᩶֫;)V

    :cond_3
    return-void
.end method

.method private ֫(Ljava/util/ArrayList;IJZ)V
    .locals 16

    move-object/from16 v9, p0

    move/from16 v0, p2

    .line 2415
    iget-object v1, v9, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    invoke-direct {v9, v1}, Ll/ܺۙ֫;->ܽ(Ll/۬ۗ֫;)I

    move-result v1

    .line 2416
    invoke-virtual/range {p0 .. p0}, Ll/ܺۙ֫;->getCurrentPosition()J

    move-result-wide v2

    .line 2417
    iget v4, v9, Ll/ܺۙ֫;->ۨ:I

    const/4 v5, 0x1

    add-int/2addr v4, v5

    iput v4, v9, Ll/ܺۙ֫;->ۨ:I

    .line 2418
    iget-object v4, v9, Ll/ܺۙ֫;->۬:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_1

    .line 2420
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    add-int/lit8 v7, v6, -0x1

    :goto_0
    if-ltz v7, :cond_0

    .line 2534
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v7, v7, -0x1

    goto :goto_0

    .line 2536
    :cond_0
    iget-object v7, v9, Ll/ܺۙ֫;->ۖ֫:Ll/֨ܽۧ;

    invoke-interface {v7, v6}, Ll/֨ܽۧ;->֫(I)Ll/ۚܽۧ;

    move-result-object v6

    iput-object v6, v9, Ll/ܺۙ֫;->ۖ֫:Ll/֨ܽۧ;

    .line 2470
    :cond_1
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    const/4 v6, 0x0

    .line 2471
    :goto_1
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v6, v7, :cond_2

    .line 2472
    new-instance v7, Ll/᩶ۗ֫;

    move-object/from16 v8, p1

    .line 2473
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۘۧۧ;

    iget-boolean v11, v9, Ll/ܺۙ֫;->᩹֫:Z

    invoke-direct {v7, v10, v11}, Ll/᩶ۗ֫;-><init>(Ll/ۘۧۧ;Z)V

    .line 2474
    invoke-virtual {v15, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2475
    new-instance v10, Ll/ۡۙ֫;

    iget-object v11, v7, Ll/᩶ۗ֫;->ܿ:Ljava/lang/Object;

    iget-object v7, v7, Ll/᩶ۗ֫;->ᩳ:Ll/᩻ۧۧ;

    invoke-direct {v10, v11, v7}, Ll/ۡۙ֫;-><init>(Ljava/lang/Object;Ll/᩻ۧۧ;)V

    invoke-virtual {v4, v6, v10}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 2478
    :cond_2
    iget-object v6, v9, Ll/ܺۙ֫;->ۖ֫:Ll/֨ܽۧ;

    .line 2480
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v7

    .line 2479
    invoke-interface {v6, v7}, Ll/֨ܽۧ;->ᩳ(I)Ll/ۚܽۧ;

    move-result-object v6

    iput-object v6, v9, Ll/ܺۙ֫;->ۖ֫:Ll/֨ܽۧ;

    .line 2540
    new-instance v6, Ll/ܰۗ֫;

    iget-object v7, v9, Ll/ܺۙ֫;->ۖ֫:Ll/֨ܽۧ;

    invoke-direct {v6, v4, v7}, Ll/ܰۗ֫;-><init>(Ljava/util/List;Ll/֨ܽۧ;)V

    .line 2425
    invoke-virtual {v6}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {v6}, Ll/ܰۗ֫;->ۧ()I

    move-result v4

    if-ge v0, v4, :cond_3

    goto :goto_2

    .line 2426
    :cond_3
    new-instance v0, Ll/ܶᩴ֫;

    .line 41
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 2426
    throw v0

    :cond_4
    :goto_2
    const/4 v4, -0x1

    if-eqz p5, :cond_5

    .line 2430
    iget-boolean v0, v9, Ll/ܺۙ֫;->ܺ֫:Z

    invoke-virtual {v6, v0}, Ll/ᩴ᩹֫;->֫(Z)I

    move-result v0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_3

    :cond_5
    if-ne v0, v4, :cond_6

    move v11, v1

    goto :goto_4

    :cond_6
    move-wide/from16 v1, p3

    :goto_3
    move v11, v0

    move-wide v2, v1

    .line 2436
    :goto_4
    iget-object v0, v9, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    .line 2440
    invoke-direct {v9, v6, v11, v2, v3}, Ll/ܺۙ֫;->֫(Ll/ۙ᩵֫;IJ)Landroid/util/Pair;

    move-result-object v1

    .line 2437
    invoke-direct {v9, v0, v6, v1}, Ll/ܺۙ֫;->֫(Ll/۬ۗ֫;Ll/ۙ᩵֫;Landroid/util/Pair;)Ll/۬ۗ֫;

    move-result-object v0

    .line 2442
    iget v1, v0, Ll/۬ۗ֫;->ۢ:I

    if-eq v11, v4, :cond_9

    if-eq v1, v5, :cond_9

    .line 2445
    invoke-virtual {v6}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {v6}, Ll/ܰۗ֫;->ۧ()I

    move-result v1

    if-lt v11, v1, :cond_7

    goto :goto_5

    :cond_7
    const/4 v1, 0x2

    goto :goto_6

    :cond_8
    :goto_5
    const/4 v1, 0x4

    .line 2452
    :cond_9
    :goto_6
    invoke-static {v0, v1}, Ll/ܺۙ֫;->֫(Ll/۬ۗ֫;I)Ll/۬ۗ֫;

    move-result-object v1

    .line 2454
    invoke-static {v2, v3}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v12

    iget-object v14, v9, Ll/ܺۙ֫;->ۖ֫:Ll/֨ܽۧ;

    .line 2453
    iget-object v10, v9, Ll/ܺۙ֫;->۠:Ll/᩶ۙ֫;

    invoke-virtual/range {v10 .. v15}, Ll/᩶ۙ֫;->֫(IJLl/֨ܽۧ;Ljava/util/ArrayList;)V

    .line 2455
    iget-object v0, v9, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v0, v0, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    iget-object v0, v0, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget-object v2, v1, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    iget-object v2, v2, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    .line 2456
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, v9, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v0, v0, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    .line 2457
    invoke-virtual {v0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v0

    if-nez v0, :cond_a

    const/4 v0, 0x1

    const/4 v3, 0x1

    goto :goto_7

    :cond_a
    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 2463
    :goto_7
    invoke-direct {v9, v1}, Ll/ܺۙ֫;->ۧ(Ll/۬ۗ֫;)J

    move-result-wide v5

    const/4 v7, -0x1

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x4

    move-object/from16 v0, p0

    .line 2458
    invoke-direct/range {v0 .. v8}, Ll/ܺۙ֫;->֫(Ll/۬ۗ֫;IZIJIZ)V

    return-void
.end method

.method private ֫(Ll/۬ۗ֫;IZIJIZ)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p4

    .line 2100
    iget-object v3, v0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    .line 2102
    iput-object v1, v0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    .line 2104
    iget-object v4, v3, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    iget-object v5, v1, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    iget-boolean v6, v1, Ll/۬ۗ֫;->ᩴ:Z

    iget-object v7, v1, Ll/۬ۗ֫;->ۜ:Ll/ᩳ᩶֫;

    iget-object v8, v1, Ll/۬ۗ֫;->᩵:Ljava/util/List;

    invoke-virtual {v4, v5}, Ll/ۙ᩵֫;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, -0x1

    .line 2356
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 2353
    iget-object v9, v3, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    iget-object v10, v3, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    .line 2354
    iget-object v11, v1, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    iget-object v12, v1, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    .line 2355
    invoke-virtual {v11}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v13

    iget-object v14, v0, Ll/ܳᩴ֫;->֫:Ll/᩶᩵֫;

    iget-object v15, v0, Ll/ܺۙ֫;->᩺:Ll/᩹᩵֫;

    const/16 v18, 0x3

    if-eqz v13, :cond_0

    invoke-virtual {v9}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v13

    if-eqz v13, :cond_0

    .line 2356
    new-instance v9, Landroid/util/Pair;

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v9, v10, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move/from16 v19, v6

    goto :goto_0

    .line 2357
    :cond_0
    invoke-virtual {v11}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v13

    move/from16 v19, v6

    invoke-virtual {v9}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v6

    if-eq v13, v6, :cond_1

    .line 2358
    new-instance v9, Landroid/util/Pair;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {v9, v5, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    move-object v13, v7

    move-object/from16 v18, v8

    goto/16 :goto_2

    .line 2361
    :cond_1
    iget-object v6, v10, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    .line 2362
    invoke-virtual {v9, v6, v15}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    move-result-object v6

    iget v6, v6, Ll/᩹᩵֫;->᩻:I

    move-object v13, v7

    move-object/from16 v18, v8

    const-wide/16 v7, 0x0

    .line 1097
    invoke-virtual {v9, v6, v14, v7, v8}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object v6

    .line 2363
    iget-object v6, v6, Ll/᩶᩵֫;->ᩴ:Ljava/lang/Object;

    .line 2364
    iget-object v9, v12, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    .line 2365
    invoke-virtual {v11, v9, v15}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    move-result-object v9

    iget v9, v9, Ll/᩹᩵֫;->᩻:I

    .line 1097
    invoke-virtual {v11, v9, v14, v7, v8}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object v7

    .line 2366
    iget-object v7, v7, Ll/᩶᩵֫;->ᩴ:Ljava/lang/Object;

    .line 2367
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    if-eqz p3, :cond_2

    if-nez v2, :cond_2

    const/4 v5, 0x1

    goto :goto_1

    :cond_2
    if-eqz p3, :cond_3

    const/4 v5, 0x1

    if-ne v2, v5, :cond_3

    const/4 v5, 0x2

    goto :goto_1

    :cond_3
    if-nez v4, :cond_4

    const/4 v5, 0x3

    .line 2381
    :goto_1
    new-instance v9, Landroid/util/Pair;

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v9, v6, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    .line 2379
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_5
    if-eqz p3, :cond_6

    if-nez v2, :cond_6

    .line 2385
    iget-wide v6, v10, Ll/ܺۧۧ;->ܿ:J

    iget-wide v8, v12, Ll/ܺۧۧ;->ܿ:J

    cmp-long v10, v6, v8

    if-gez v10, :cond_6

    .line 2389
    new-instance v9, Landroid/util/Pair;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {v9, v5, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    if-eqz p3, :cond_7

    const/4 v6, 0x1

    if-ne v2, v6, :cond_7

    if-eqz p8, :cond_7

    .line 2394
    new-instance v9, Landroid/util/Pair;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v6, 0x2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {v9, v5, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    .line 2397
    :cond_7
    new-instance v9, Landroid/util/Pair;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v9, v6, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2113
    :goto_2
    iget-object v5, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    .line 2114
    iget-object v6, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-eqz v5, :cond_9

    .line 2117
    invoke-virtual {v11}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v7

    if-nez v7, :cond_8

    .line 2118
    iget-object v7, v12, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    .line 2119
    invoke-virtual {v11, v7, v15}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    move-result-object v7

    iget v7, v7, Ll/᩹᩵֫;->᩻:I

    const-wide/16 v8, 0x0

    .line 1097
    invoke-virtual {v11, v7, v14, v8, v9}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object v7

    .line 2121
    iget-object v7, v7, Ll/᩶᩵֫;->ۡ:Ll/ۧ᩵֫;

    goto :goto_3

    :cond_8
    const/4 v7, 0x0

    .line 2123
    :goto_3
    sget-object v8, Ll/ܿ᩵֫;->֫֫:Ll/ܿ᩵֫;

    iput-object v8, v0, Ll/ܺۙ֫;->᩵֫:Ll/ܿ᩵֫;

    goto :goto_4

    :cond_9
    const/4 v7, 0x0

    :goto_4
    if-nez v5, :cond_a

    .line 2125
    iget-object v8, v3, Ll/۬ۗ֫;->᩵:Ljava/util/List;

    move-object/from16 v9, v18

    .line 2126
    invoke-interface {v8, v9}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_d

    goto :goto_5

    :cond_a
    move-object/from16 v9, v18

    .line 2127
    :goto_5
    iget-object v8, v0, Ll/ܺۙ֫;->᩵֫:Ll/ܿ᩵֫;

    .line 2129
    invoke-virtual {v8}, Ll/ܿ᩵֫;->֫()Ll/ᩳ᩵֫;

    move-result-object v8

    const/4 v10, 0x0

    .line 491
    :goto_6
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v11

    if-ge v10, v11, :cond_c

    .line 492
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩻᩵֫;

    const/4 v12, 0x0

    move-object/from16 v18, v9

    .line 493
    :goto_7
    invoke-virtual {v11}, Ll/᩻᩵֫;->֫()I

    move-result v9

    if-ge v12, v9, :cond_b

    .line 494
    invoke-virtual {v11, v12}, Ll/᩻᩵֫;->֫(I)Ll/ܳ᩵֫;

    move-result-object v9

    .line 495
    invoke-interface {v9, v8}, Ll/ܳ᩵֫;->֫(Ll/ᩳ᩵֫;)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_7

    :cond_b
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v9, v18

    goto :goto_6

    .line 2131
    :cond_c
    invoke-virtual {v8}, Ll/ᩳ᩵֫;->֫()Ll/ܿ᩵֫;

    move-result-object v8

    iput-object v8, v0, Ll/ܺۙ֫;->᩵֫:Ll/ܿ᩵֫;

    .line 2133
    :cond_d
    invoke-direct/range {p0 .. p0}, Ll/ܺۙ֫;->ܺ֫()Ll/ܿ᩵֫;

    move-result-object v8

    .line 2134
    iget-object v9, v0, Ll/ܺۙ֫;->ۙ:Ll/ܿ᩵֫;

    invoke-virtual {v8, v9}, Ll/ܿ᩵֫;->equals(Ljava/lang/Object;)Z

    move-result v9

    .line 2135
    iput-object v8, v0, Ll/ܺۙ֫;->ۙ:Ll/ܿ᩵֫;

    .line 2136
    iget-boolean v8, v3, Ll/۬ۗ֫;->ܳ:Z

    iget-boolean v10, v1, Ll/۬ۗ֫;->ܳ:Z

    if-eq v8, v10, :cond_e

    const/4 v8, 0x1

    goto :goto_8

    :cond_e
    const/4 v8, 0x0

    .line 2138
    :goto_8
    iget v10, v3, Ll/۬ۗ֫;->ۢ:I

    iget v11, v1, Ll/۬ۗ֫;->ۢ:I

    if-eq v10, v11, :cond_f

    const/4 v10, 0x1

    goto :goto_9

    :cond_f
    const/4 v10, 0x0

    :goto_9
    if-nez v10, :cond_10

    if-eqz v8, :cond_11

    .line 2141
    :cond_10
    invoke-direct/range {p0 .. p0}, Ll/ܺۙ֫;->ᩴ֫()V

    .line 2143
    :cond_11
    iget-boolean v11, v3, Ll/۬ۗ֫;->ܽ:Z

    iget-boolean v12, v1, Ll/۬ۗ֫;->ܽ:Z

    if-eq v11, v12, :cond_12

    const/4 v11, 0x1

    goto :goto_a

    :cond_12
    const/4 v11, 0x0

    .line 2148
    :goto_a
    iget-object v12, v0, Ll/ܺۙ֫;->ܶ:Ll/᩹ۚ֫;

    if-nez v4, :cond_13

    .line 2149
    new-instance v4, Ll/᩸᩶֫;

    move-object/from16 v16, v13

    move/from16 v13, p2

    invoke-direct {v4, v1, v13}, Ll/᩸᩶֫;-><init>(Ll/۬ۗ֫;I)V

    const/4 v13, 0x0

    invoke-virtual {v12, v13, v4}, Ll/᩹ۚ֫;->֫(ILl/۠ۚ֫;)V

    goto :goto_b

    :cond_13
    move-object/from16 v16, v13

    :goto_b
    if-eqz p3, :cond_16

    move/from16 v4, p7

    .line 2155
    invoke-direct {v0, v2, v3, v4}, Ll/ܺۙ֫;->֫(ILl/۬ۗ֫;I)Ll/ۚ᩵֫;

    move-result-object v4

    .line 2311
    invoke-virtual/range {p0 .. p0}, Ll/ܺۙ֫;->۟()I

    move-result v13

    move/from16 p8, v8

    .line 2314
    iget-object v8, v0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v8, v8, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    invoke-virtual {v8}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v8

    if-nez v8, :cond_14

    .line 2315
    iget-object v8, v0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    move/from16 v17, v10

    iget-object v10, v8, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    iget-object v10, v10, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    .line 2316
    iget-object v8, v8, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    invoke-virtual {v8, v10, v15}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    .line 2317
    iget-object v8, v0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v8, v8, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    invoke-virtual {v8, v10}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    move-result v8

    .line 2318
    iget-object v15, v0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v15, v15, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    move-object/from16 v20, v10

    move/from16 v18, v11

    const-wide/16 v10, 0x0

    .line 1097
    invoke-virtual {v15, v13, v14, v10, v11}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object v10

    .line 2318
    iget-object v10, v10, Ll/᩶᩵֫;->ᩴ:Ljava/lang/Object;

    .line 2319
    iget-object v11, v14, Ll/᩶᩵֫;->ۡ:Ll/ۧ᩵֫;

    move/from16 v25, v8

    move-object/from16 v21, v10

    move-object/from16 v23, v11

    move-object/from16 v24, v20

    goto :goto_c

    :cond_14
    move/from16 v17, v10

    move/from16 v18, v11

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, -0x1

    move-object/from16 v21, v8

    move-object/from16 v23, v10

    move-object/from16 v24, v11

    const/16 v25, -0x1

    .line 2321
    :goto_c
    invoke-static/range {p5 .. p6}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v26

    .line 2322
    new-instance v8, Ll/ۚ᩵֫;

    .line 2329
    iget-object v10, v0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v10, v10, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    invoke-virtual {v10}, Ll/ܺۧۧ;->֫()Z

    move-result v10

    if-eqz v10, :cond_15

    .line 2330
    iget-object v10, v0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    invoke-static {v10}, Ll/ܺۙ֫;->ᩳ(Ll/۬ۗ֫;)J

    move-result-wide v10

    invoke-static {v10, v11}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v10

    move-wide/from16 v28, v10

    goto :goto_d

    :cond_15
    move-wide/from16 v28, v26

    .line 2331
    :goto_d
    iget-object v10, v0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v10, v10, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    iget v11, v10, Ll/ܺۧۧ;->֫:I

    iget v10, v10, Ll/ܺۧۧ;->ۧ:I

    move-object/from16 v20, v8

    move/from16 v22, v13

    move/from16 v30, v11

    move/from16 v31, v10

    invoke-direct/range {v20 .. v31}, Ll/ۚ᩵֫;-><init>(Ljava/lang/Object;ILl/ۧ᩵֫;Ljava/lang/Object;IJJII)V

    .line 2158
    new-instance v10, Ll/ܰ᩶֫;

    invoke-direct {v10, v2, v4, v8}, Ll/ܰ᩶֫;-><init>(ILl/ۚ᩵֫;Ll/ۚ᩵֫;)V

    const/16 v2, 0xb

    invoke-virtual {v12, v2, v10}, Ll/᩹ۚ֫;->֫(ILl/۠ۚ֫;)V

    goto :goto_e

    :cond_16
    move/from16 p8, v8

    move/from16 v17, v10

    move/from16 v18, v11

    :goto_e
    if-eqz v5, :cond_17

    .line 2168
    new-instance v2, Ll/۟᩶֫;

    invoke-direct {v2, v7, v6}, Ll/۟᩶֫;-><init>(Ll/ۧ᩵֫;I)V

    const/4 v4, 0x1

    invoke-virtual {v12, v4, v2}, Ll/᩹ۚ֫;->֫(ILl/۠ۚ֫;)V

    .line 2172
    :cond_17
    iget-object v2, v3, Ll/۬ۗ֫;->ۜ:Ll/ᩳ᩶֫;

    move-object/from16 v4, v16

    if-eq v2, v4, :cond_18

    .line 2173
    new-instance v2, Ll/֫ۙ֫;

    invoke-direct {v2, v1}, Ll/֫ۙ֫;-><init>(Ll/۬ۗ֫;)V

    const/16 v5, 0xa

    invoke-virtual {v12, v5, v2}, Ll/᩹ۚ֫;->֫(ILl/۠ۚ֫;)V

    if-eqz v4, :cond_18

    .line 2177
    new-instance v2, Ll/ۧۙ֫;

    invoke-direct {v2, v1}, Ll/ۧۙ֫;-><init>(Ll/۬ۗ֫;)V

    invoke-virtual {v12, v5, v2}, Ll/᩹ۚ֫;->֫(ILl/۠ۚ֫;)V

    .line 2182
    :cond_18
    iget-object v2, v3, Ll/۬ۗ֫;->۠:Ll/֨ܿۧ;

    iget-object v4, v1, Ll/۬ۗ֫;->۠:Ll/֨ܿۧ;

    if-eq v2, v4, :cond_19

    .line 2183
    iget-object v2, v0, Ll/ܺۙ֫;->᩸֫:Ll/ۚܿۧ;

    iget-object v4, v4, Ll/֨ܿۧ;->֫:Ljava/lang/Object;

    invoke-virtual {v2, v4}, Ll/ۚܿۧ;->֫(Ljava/lang/Object;)V

    .line 2184
    new-instance v2, Ll/ᩴ᩶֫;

    invoke-direct {v2, v1}, Ll/ᩴ᩶֫;-><init>(Ll/۬ۗ֫;)V

    const/4 v4, 0x2

    invoke-virtual {v12, v4, v2}, Ll/᩹ۚ֫;->֫(ILl/۠ۚ֫;)V

    :cond_19
    if-nez v9, :cond_1a

    .line 2189
    iget-object v2, v0, Ll/ܺۙ֫;->ۙ:Ll/ܿ᩵֫;

    .line 2190
    new-instance v4, Ll/᩶ܽܽ;

    invoke-direct {v4, v2}, Ll/᩶ܽܽ;-><init>(Ljava/lang/Object;)V

    const/16 v2, 0xe

    invoke-virtual {v12, v2, v4}, Ll/᩹ۚ֫;->֫(ILl/۠ۚ֫;)V

    :cond_1a
    if-eqz v18, :cond_1b

    .line 2195
    new-instance v2, Ll/᩵᩶֫;

    invoke-direct {v2, v1}, Ll/᩵᩶֫;-><init>(Ll/۬ۗ֫;)V

    const/4 v4, 0x3

    invoke-virtual {v12, v4, v2}, Ll/᩹ۚ֫;->֫(ILl/۠ۚ֫;)V

    :cond_1b
    if-nez v17, :cond_1c

    if-eqz p8, :cond_1d

    .line 2203
    :cond_1c
    new-instance v2, Ll/֡᩶֫;

    invoke-direct {v2, v1}, Ll/֡᩶֫;-><init>(Ll/۬ۗ֫;)V

    const/4 v4, -0x1

    invoke-virtual {v12, v4, v2}, Ll/᩹ۚ֫;->֫(ILl/۠ۚ֫;)V

    :cond_1d
    if-eqz v17, :cond_1e

    .line 2210
    new-instance v2, Ll/ۚ᩶֫;

    invoke-direct {v2, v1}, Ll/ۚ᩶֫;-><init>(Ll/۬ۗ֫;)V

    const/4 v4, 0x4

    invoke-virtual {v12, v4, v2}, Ll/᩹ۚ֫;->֫(ILl/۠ۚ֫;)V

    :cond_1e
    if-nez p8, :cond_1f

    .line 2214
    iget v2, v3, Ll/۬ۗ֫;->᩻:I

    iget v4, v1, Ll/۬ۗ֫;->᩻:I

    if-eq v2, v4, :cond_20

    .line 2217
    :cond_1f
    new-instance v2, Ll/ۤ᩶֫;

    invoke-direct {v2, v1}, Ll/ۤ᩶֫;-><init>(Ll/۬ۗ֫;)V

    const/4 v4, 0x5

    invoke-virtual {v12, v4, v2}, Ll/᩹ۚ֫;->֫(ILl/۠ۚ֫;)V

    .line 2223
    :cond_20
    iget v2, v3, Ll/۬ۗ֫;->ۡ:I

    iget v4, v1, Ll/۬ۗ֫;->ۡ:I

    if-eq v2, v4, :cond_21

    .line 2225
    new-instance v2, Ll/ۛ᩶֫;

    invoke-direct {v2, v1}, Ll/ۛ᩶֫;-><init>(Ll/۬ۗ֫;)V

    const/4 v4, 0x6

    invoke-virtual {v12, v4, v2}, Ll/᩹ۚ֫;->֫(ILl/۠ۚ֫;)V

    .line 2231
    :cond_21
    invoke-virtual {v3}, Ll/۬ۗ֫;->ܽ()Z

    move-result v2

    invoke-virtual/range {p1 .. p1}, Ll/۬ۗ֫;->ܽ()Z

    move-result v4

    if-eq v2, v4, :cond_22

    .line 2232
    new-instance v2, Ll/ۨ᩶֫;

    invoke-direct {v2, v1}, Ll/ۨ᩶֫;-><init>(Ll/۬ۗ֫;)V

    const/4 v4, 0x7

    invoke-virtual {v12, v4, v2}, Ll/᩹ۚ֫;->֫(ILl/۠ۚ֫;)V

    .line 2236
    :cond_22
    iget-object v2, v3, Ll/۬ۗ֫;->᩷:Ll/ۖ᩵֫;

    iget-object v4, v1, Ll/۬ۗ֫;->᩷:Ll/ۖ᩵֫;

    invoke-virtual {v2, v4}, Ll/ۖ᩵֫;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_23

    .line 2237
    new-instance v2, Ll/᩺᩶֫;

    invoke-direct {v2, v1}, Ll/᩺᩶֫;-><init>(Ll/۬ۗ֫;)V

    const/16 v1, 0xc

    invoke-virtual {v12, v1, v2}, Ll/᩹ۚ֫;->֫(ILl/۠ۚ֫;)V

    .line 2241
    :cond_23
    invoke-direct/range {p0 .. p0}, Ll/ܺۙ֫;->ۘ֫()V

    .line 2242
    invoke-virtual {v12}, Ll/᩹ۚ֫;->֫()V

    .line 2244
    iget-boolean v1, v3, Ll/۬ۗ֫;->ᩴ:Z

    move/from16 v2, v19

    if-eq v1, v2, :cond_24

    .line 2245
    iget-object v1, v0, Ll/ܺۙ֫;->᩻:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿ᩶֫;

    .line 2246
    invoke-interface {v2}, Ll/ܿ᩶֫;->֫()V

    goto :goto_f

    :cond_24
    return-void
.end method

.method public static ֫(Ll/ܺۙ֫;)V
    .locals 2

    .line 412
    iget-object v0, p0, Ll/ܺۙ֫;->ۜ:Ll/ۧۚ֫;

    iget-object p0, p0, Ll/ܺۙ֫;->ܽ:Landroid/content/Context;

    .line 413
    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 2546
    invoke-static {p0}, Ll/ۖ֡֫;->֫(Landroid/content/Context;)Landroid/media/AudioManager;

    move-result-object p0

    invoke-virtual {p0}, Landroid/media/AudioManager;->generateAudioSessionId()I

    move-result p0

    .line 413
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    .line 412
    invoke-virtual {v0, p0}, Ll/ۧۚ֫;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method public static ֫(Ll/ܺۙ֫;I)V
    .locals 3

    .line 3009
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 3010
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0xa

    invoke-direct {p0, v1, v2, v0}, Ll/ܺۙ֫;->֫(IILjava/lang/Object;)V

    const/4 v0, 0x2

    .line 3011
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v0, v2, v1}, Ll/ܺۙ֫;->֫(IILjava/lang/Object;)V

    .line 3012
    iget-object p0, p0, Ll/ܺۙ֫;->ܶ:Ll/᩹ۚ֫;

    new-instance v0, Ll/۫᩶֫;

    invoke-direct {v0, p1}, Ll/۫᩶֫;-><init>(I)V

    const/16 p1, 0x15

    invoke-virtual {p0, p1, v0}, Ll/᩹ۚ֫;->ۧ(ILl/۠ۚ֫;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺۙ֫;II)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/ܺۙ֫;->֫(II)V

    return-void
.end method

.method public static ֫(Ll/ܺۙ֫;Landroid/graphics/SurfaceTexture;)V
    .locals 1

    .line 2775
    new-instance v0, Landroid/view/Surface;

    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 2776
    invoke-direct {p0, v0}, Ll/ܺۙ֫;->֫(Ljava/lang/Object;)V

    .line 2777
    iput-object v0, p0, Ll/ܺۙ֫;->۫:Landroid/view/Surface;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺۙ֫;Landroid/view/Surface;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܺۙ֫;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܺۙ֫;Ll/֡᩵֫;)V
    .locals 0

    .line 2406
    iget-object p0, p0, Ll/ܺۙ֫;->᩷:Ll/ᩴ᩵֫;

    invoke-interface {p1, p0}, Ll/֡᩵֫;->֫(Ll/ᩴ᩵֫;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺۙ֫;Ll/ۙ֡֫;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܺۙ֫;->ۘ:Ll/ۙ֡֫;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺۙ֫;Ll/ۜ֡֫;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܺۙ֫;->ۗ֫:Ll/ۜ֡֫;

    return-void
.end method

.method public static ֫(Ll/ܺۙ֫;Ll/ܶۙ֫;)V
    .locals 12

    .line 2037
    iget v2, p0, Ll/ܺۙ֫;->ۨ:I

    iget v3, p1, Ll/ܶۙ֫;->ܽ:I

    sub-int/2addr v2, v3

    iput v2, p0, Ll/ܺۙ֫;->ۨ:I

    .line 2038
    iget-boolean v3, p1, Ll/ܶۙ֫;->ܿ:Z

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    .line 2039
    iget v3, p1, Ll/ܶۙ֫;->֫:I

    iput v3, p0, Ll/ܺۙ֫;->ۛ:I

    .line 2040
    iput-boolean v4, p0, Ll/ܺۙ֫;->ۤ:Z

    :cond_0
    if-nez v2, :cond_a

    .line 2043
    iget-object v2, p1, Ll/ܶۙ֫;->ᩳ:Ll/۬ۗ֫;

    iget-object v2, v2, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    .line 2044
    iget-object v3, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v3, v3, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    invoke-virtual {v3}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, -0x1

    .line 2047
    iput v3, p0, Ll/ܺۙ֫;->᩸:I

    const-wide/16 v5, 0x0

    .line 2048
    iput-wide v5, p0, Ll/ܺۙ֫;->᩹:J

    .line 2051
    :cond_1
    invoke-virtual {v2}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v3

    const/4 v5, 0x0

    if-nez v3, :cond_3

    .line 2052
    move-object v3, v2

    check-cast v3, Ll/ܰۗ֫;

    invoke-virtual {v3}, Ll/ܰۗ֫;->ᩳ()Ljava/util/List;

    move-result-object v3

    .line 2053
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    iget-object v7, p0, Ll/ܺۙ֫;->۬:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ne v6, v7, :cond_2

    const/4 v6, 0x1

    goto :goto_0

    :cond_2
    const/4 v6, 0x0

    :goto_0
    invoke-static {v6}, Ll/᩺֡֫;->ۧ(Z)V

    const/4 v6, 0x0

    .line 2054
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_3

    .line 2055
    iget-object v7, p0, Ll/ܺۙ֫;->۬:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۡۙ֫;

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۙ᩵֫;

    invoke-virtual {v7, v8}, Ll/ۡۙ֫;->֫(Ll/ۙ᩵֫;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 2060
    :cond_3
    iget-boolean v3, p0, Ll/ܺۙ֫;->ۤ:Z

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v3, :cond_9

    .line 2061
    iget-object v3, p1, Ll/ܶۙ֫;->ᩳ:Ll/۬ۗ֫;

    iget-object v3, v3, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    iget-object v8, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v8, v8, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    .line 2062
    invoke-virtual {v3, v8}, Ll/ܺۧۧ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, p1, Ll/ܶۙ֫;->ᩳ:Ll/۬ۗ֫;

    iget-wide v8, v3, Ll/۬ۗ֫;->ۧ:J

    iget-object v3, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-wide v10, v3, Ll/۬ۗ֫;->ۖ:J

    cmp-long v3, v8, v10

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    :cond_5
    :goto_2
    if-eqz v4, :cond_8

    .line 2067
    invoke-virtual {v2}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v3

    if-nez v3, :cond_7

    iget-object v3, p1, Ll/ܶۙ֫;->ᩳ:Ll/۬ۗ֫;

    iget-object v3, v3, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    invoke-virtual {v3}, Ll/ܺۧۧ;->֫()Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_3

    .line 2069
    :cond_6
    iget-object v3, p1, Ll/ܶۙ֫;->ᩳ:Ll/۬ۗ֫;

    iget-object v6, v3, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    iget-wide v7, v3, Ll/۬ۗ֫;->ۧ:J

    .line 2718
    iget-object v3, v6, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget-object v6, p0, Ll/ܺۙ֫;->᩺:Ll/᩹᩵֫;

    invoke-virtual {v2, v3, v6}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    .line 693
    iget-wide v2, v6, Ll/᩹᩵֫;->ܿ:J

    add-long v6, v7, v2

    goto :goto_4

    .line 2068
    :cond_7
    :goto_3
    iget-object v2, p1, Ll/ܶۙ֫;->ᩳ:Ll/۬ۗ֫;

    iget-wide v6, v2, Ll/۬ۗ֫;->ۧ:J

    :cond_8
    :goto_4
    move v3, v4

    goto :goto_5

    :cond_9
    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 2075
    :goto_5
    iput-boolean v5, p0, Ll/ܺۙ֫;->ۤ:Z

    .line 2076
    iget-object v1, p1, Ll/ܶۙ֫;->ᩳ:Ll/۬ۗ֫;

    iget v4, p0, Ll/ܺۙ֫;->ۛ:I

    const/4 v8, -0x1

    const/4 v9, 0x0

    const/4 v2, 0x1

    move-object v0, p0

    move-wide v5, v6

    move v7, v8

    move v8, v9

    invoke-direct/range {v0 .. v8}, Ll/ܺۙ֫;->֫(Ll/۬ۗ֫;IZIJIZ)V

    :cond_a
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺۙ֫;Ll/ܿ᩵֫;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܺۙ֫;->ۙ:Ll/ܿ᩵֫;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺۙ֫;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/ܺۙ֫;->ۘ֫:Z

    return-void
.end method

.method private ֫(Ll/ᩳ᩶֫;)V
    .locals 11

    .line 1970
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v1, v0, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    .line 1971
    invoke-virtual {v0, v1}, Ll/۬ۗ֫;->֫(Ll/ܺۧۧ;)Ll/۬ۗ֫;

    move-result-object v0

    .line 1972
    iget-wide v1, v0, Ll/۬ۗ֫;->ۖ:J

    iput-wide v1, v0, Ll/۬ۗ֫;->֫:J

    const-wide/16 v1, 0x0

    .line 1973
    iput-wide v1, v0, Ll/۬ۗ֫;->ۚ:J

    const/4 v1, 0x1

    .line 1974
    invoke-static {v0, v1}, Ll/ܺۙ֫;->֫(Ll/۬ۗ֫;I)Ll/۬ۗ֫;

    move-result-object v0

    if-eqz p1, :cond_0

    .line 1976
    invoke-virtual {v0, p1}, Ll/۬ۗ֫;->֫(Ll/ᩳ᩶֫;)Ll/۬ۗ֫;

    move-result-object v0

    :cond_0
    move-object v3, v0

    .line 1978
    iget p1, p0, Ll/ܺۙ֫;->ۨ:I

    add-int/2addr p1, v1

    iput p1, p0, Ll/ܺۙ֫;->ۨ:I

    .line 1979
    iget-object p1, p0, Ll/ܺۙ֫;->۠:Ll/᩶ۙ֫;

    invoke-virtual {p1}, Ll/᩶ۙ֫;->ۜ()V

    const/4 v9, -0x1

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    move-object v2, p0

    .line 1980
    invoke-direct/range {v2 .. v10}, Ll/ܺۙ֫;->֫(Ll/۬ۗ֫;IZIJIZ)V

    return-void
.end method

.method private ۖ֫()V
    .locals 4

    .line 2752
    iget-object v0, p0, Ll/ܺۙ֫;->ᩴ֫:Ll/᩶ۜۧ;

    iget-object v1, p0, Ll/ܺۙ֫;->ܺ:Ll/᩷ۙ֫;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 2753
    iget-object v0, p0, Ll/ܺۙ֫;->ۚ:Ll/ۢۙ֫;

    invoke-direct {p0, v0}, Ll/ܺۙ֫;->֫(Ll/ۛۗ֫;)Ll/ۨۗ֫;

    move-result-object v0

    const/16 v3, 0x2710

    .line 2754
    invoke-virtual {v0, v3}, Ll/ۨۗ֫;->֫(I)V

    .line 2755
    invoke-virtual {v0, v2}, Ll/ۨۗ֫;->֫(Ljava/lang/Object;)V

    .line 2756
    invoke-virtual {v0}, Ll/ۨۗ֫;->ܿ()V

    .line 2757
    iget-object v0, p0, Ll/ܺۙ֫;->ᩴ֫:Ll/᩶ۜۧ;

    invoke-virtual {v0, v1}, Ll/᩶ۜۧ;->ۧ(Ll/᩹ۜۧ;)V

    .line 2758
    iput-object v2, p0, Ll/ܺۙ֫;->ᩴ֫:Ll/᩶ۜۧ;

    .line 2760
    :cond_0
    iget-object v0, p0, Ll/ܺۙ֫;->۠֫:Landroid/view/TextureView;

    if-eqz v0, :cond_2

    .line 2761
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    move-result-object v0

    if-eq v0, v1, :cond_1

    const-string v0, "SurfaceTextureListener already unset or replaced."

    .line 2762
    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_0

    .line 2764
    :cond_1
    iget-object v0, p0, Ll/ܺۙ֫;->۠֫:Landroid/view/TextureView;

    invoke-virtual {v0, v2}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 2766
    :goto_0
    iput-object v2, p0, Ll/ܺۙ֫;->۠֫:Landroid/view/TextureView;

    .line 2768
    :cond_2
    iget-object v0, p0, Ll/ܺۙ֫;->֡֫:Landroid/view/SurfaceHolder;

    if-eqz v0, :cond_3

    .line 2769
    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 2770
    iput-object v2, p0, Ll/ܺۙ֫;->֡֫:Landroid/view/SurfaceHolder;

    :cond_3
    return-void
.end method

.method private ۘ֫()V
    .locals 13

    .line 2401
    iget-object v0, p0, Ll/ܺۙ֫;->᩷:Ll/ᩴ᩵֫;

    .line 2402
    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 3675
    iget-object v1, p0, Ll/ܺۙ֫;->ۤ֫:Ll/֨᩵֫;

    check-cast v1, Ll/ܺۙ֫;

    invoke-virtual {v1}, Ll/ܺۙ֫;->᩷()Z

    move-result v2

    .line 3676
    invoke-virtual {v1}, Ll/ܳᩴ֫;->ۡ֫()Z

    move-result v3

    .line 3677
    invoke-virtual {v1}, Ll/ܳᩴ֫;->ۜ֫()Z

    move-result v4

    .line 3678
    invoke-virtual {v1}, Ll/ܳᩴ֫;->᩻֫()Z

    move-result v5

    .line 3679
    invoke-virtual {v1}, Ll/ܳᩴ֫;->ۢ֫()Z

    move-result v6

    .line 3680
    invoke-virtual {v1}, Ll/ܳᩴ֫;->᩷֫()Z

    move-result v7

    .line 3681
    invoke-virtual {v1}, Ll/ܺۙ֫;->ۚ()Ll/ۙ᩵֫;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v1

    .line 3682
    new-instance v8, Ll/ۘ᩵֫;

    invoke-direct {v8}, Ll/ۘ᩵֫;-><init>()V

    .line 3683
    iget-object v9, p0, Ll/ܺۙ֫;->ܰ:Ll/ᩴ᩵֫;

    invoke-virtual {v8, v9}, Ll/ۘ᩵֫;->֫(Ll/ᩴ᩵֫;)V

    xor-int/lit8 v9, v2, 0x1

    const/4 v10, 0x4

    .line 3684
    invoke-virtual {v8, v10, v9}, Ll/ۘ᩵֫;->֫(IZ)V

    const/4 v10, 0x0

    if-eqz v3, :cond_0

    if-nez v2, :cond_0

    const/4 v11, 0x1

    goto :goto_0

    :cond_0
    const/4 v11, 0x0

    :goto_0
    const/4 v12, 0x5

    .line 3685
    invoke-virtual {v8, v12, v11}, Ll/ۘ᩵֫;->֫(IZ)V

    if-eqz v4, :cond_1

    if-nez v2, :cond_1

    const/4 v11, 0x1

    goto :goto_1

    :cond_1
    const/4 v11, 0x0

    :goto_1
    const/4 v12, 0x6

    .line 3686
    invoke-virtual {v8, v12, v11}, Ll/ۘ᩵֫;->֫(IZ)V

    if-nez v1, :cond_3

    if-nez v4, :cond_2

    if-eqz v6, :cond_2

    if-eqz v3, :cond_3

    :cond_2
    if-nez v2, :cond_3

    const/4 v4, 0x1

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    :goto_2
    const/4 v11, 0x7

    .line 3687
    invoke-virtual {v8, v11, v4}, Ll/ۘ᩵֫;->֫(IZ)V

    if-eqz v5, :cond_4

    if-nez v2, :cond_4

    const/4 v4, 0x1

    goto :goto_3

    :cond_4
    const/4 v4, 0x0

    :goto_3
    const/16 v11, 0x8

    .line 3692
    invoke-virtual {v8, v11, v4}, Ll/ۘ᩵֫;->֫(IZ)V

    if-nez v1, :cond_6

    if-nez v5, :cond_5

    if-eqz v6, :cond_6

    if-eqz v7, :cond_6

    :cond_5
    if-nez v2, :cond_6

    const/4 v1, 0x1

    goto :goto_4

    :cond_6
    const/4 v1, 0x0

    :goto_4
    const/16 v4, 0x9

    .line 3693
    invoke-virtual {v8, v4, v1}, Ll/ۘ᩵֫;->֫(IZ)V

    const/16 v1, 0xa

    .line 3698
    invoke-virtual {v8, v1, v9}, Ll/ۘ᩵֫;->֫(IZ)V

    if-eqz v3, :cond_7

    if-nez v2, :cond_7

    const/4 v1, 0x1

    goto :goto_5

    :cond_7
    const/4 v1, 0x0

    :goto_5
    const/16 v4, 0xb

    .line 3699
    invoke-virtual {v8, v4, v1}, Ll/ۘ᩵֫;->֫(IZ)V

    if-eqz v3, :cond_8

    if-nez v2, :cond_8

    const/4 v10, 0x1

    :cond_8
    const/16 v1, 0xc

    .line 3700
    invoke-virtual {v8, v1, v10}, Ll/ۘ᩵֫;->֫(IZ)V

    .line 3701
    invoke-virtual {v8}, Ll/ۘ᩵֫;->֫()Ll/ᩴ᩵֫;

    move-result-object v1

    .line 2402
    iput-object v1, p0, Ll/ܺۙ֫;->᩷:Ll/ᩴ᩵֫;

    .line 2403
    invoke-virtual {v1, v0}, Ll/ᩴ᩵֫;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 2404
    new-instance v0, Ll/۬᩶֫;

    invoke-direct {v0, p0}, Ll/۬᩶֫;-><init>(Ll/ܺۙ֫;)V

    iget-object v1, p0, Ll/ܺۙ֫;->ܶ:Ll/᩹ۚ֫;

    const/16 v2, 0xd

    invoke-virtual {v1, v2, v0}, Ll/᩹ۚ֫;->֫(ILl/۠ۚ֫;)V

    :cond_9
    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ܺۙ֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܺۙ֫;->ۚ֫:Z

    return p0
.end method

.method public static bridge synthetic ۡ(Ll/ܺۙ֫;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    .line 0
    invoke-direct {p0, v1, v0}, Ll/ܺۙ֫;->֫(IZ)V

    return-void
.end method

.method public static bridge synthetic ۢ(Ll/ܺۙ֫;)Ll/ܿ᩵֫;
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܺۙ֫;->ܺ֫()Ll/ܿ᩵֫;

    move-result-object p0

    return-object p0
.end method

.method private ۧ(Ll/۬ۗ֫;)J
    .locals 4

    .line 2012
    iget-object v0, p1, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    invoke-virtual {v0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2013
    iget-wide v0, p0, Ll/ܺۙ֫;->᩹:J

    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v0

    return-wide v0

    .line 2017
    :cond_0
    iget-boolean v0, p1, Ll/۬ۗ֫;->ᩴ:Z

    if-eqz v0, :cond_1

    .line 2018
    invoke-virtual {p1}, Ll/۬ۗ֫;->ۧ()J

    move-result-wide v0

    goto :goto_0

    .line 2019
    :cond_1
    iget-wide v0, p1, Ll/۬ۗ֫;->ۖ:J

    .line 2021
    :goto_0
    iget-object v2, p1, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    invoke-virtual {v2}, Ll/ܺۧۧ;->֫()Z

    move-result v2

    if-eqz v2, :cond_2

    return-wide v0

    .line 2024
    :cond_2
    iget-object v2, p1, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    iget-object p1, p1, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    .line 2718
    iget-object p1, p1, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget-object v3, p0, Ll/ܺۙ֫;->᩺:Ll/᩹᩵֫;

    invoke-virtual {v2, p1, v3}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    .line 693
    iget-wide v2, v3, Ll/᩹᩵֫;->ܿ:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method private ۧ(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 4

    .line 2029
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 2030
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 2031
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧ᩵֫;

    iget-object v3, p0, Ll/ܺۙ֫;->ۗ:Ll/ۡۧۧ;

    invoke-interface {v3, v2}, Ll/ۡۧۧ;->֫(Ll/ۧ᩵֫;)Ll/ۘۧۧ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static bridge synthetic ۧ(Ll/ܺۙ֫;)Ll/᩵۬֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۙ֫;->ۧ:Ll/᩵۬֫;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/ܺۙ֫;Ll/ܶۙ֫;)V
    .locals 2

    .line 353
    iget-object v0, p0, Ll/ܺۙ֫;->֫֫:Ll/᩵ۚ֫;

    new-instance v1, Ll/ۙ᩶֫;

    invoke-direct {v1, p0, p1}, Ll/ۙ᩶֫;-><init>(Ll/ܺۙ֫;Ll/ܶۙ֫;)V

    invoke-interface {v0, v1}, Ll/᩵ۚ֫;->֫(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܺۙ֫;Ll/ܿ᩵֫;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܺۙ֫;->᩵֫:Ll/ܿ᩵֫;

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ܺۙ֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܺۙ֫;->ۘ֫:Z

    return p0
.end method

.method public static bridge synthetic ܺ(Ll/ܺۙ֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܺۙ֫;->ᩴ֫()V

    return-void
.end method

.method private ܺ֫()Ll/ܿ᩵֫;
    .locals 5

    .line 2742
    invoke-virtual {p0}, Ll/ܺۙ֫;->ۚ()Ll/ۙ᩵֫;

    move-result-object v0

    .line 2743
    invoke-virtual {v0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2744
    iget-object v0, p0, Ll/ܺۙ֫;->᩵֫:Ll/ܿ᩵֫;

    return-object v0

    .line 2746
    :cond_0
    invoke-virtual {p0}, Ll/ܺۙ֫;->۟()I

    move-result v1

    iget-object v2, p0, Ll/ܳᩴ֫;->֫:Ll/᩶᩵֫;

    const-wide/16 v3, 0x0

    .line 1097
    invoke-virtual {v0, v1, v2, v3, v4}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object v0

    .line 2746
    iget-object v0, v0, Ll/᩶᩵֫;->ۡ:Ll/ۧ᩵֫;

    .line 2748
    iget-object v1, p0, Ll/ܺۙ֫;->᩵֫:Ll/ܿ᩵֫;

    invoke-virtual {v1}, Ll/ܿ᩵֫;->֫()Ll/ᩳ᩵֫;

    move-result-object v1

    iget-object v0, v0, Ll/ۧ᩵֫;->ܿ:Ll/ܿ᩵֫;

    invoke-virtual {v1, v0}, Ll/ᩳ᩵֫;->֫(Ll/ܿ᩵֫;)V

    invoke-virtual {v1}, Ll/ᩳ᩵֫;->֫()Ll/ܿ᩵֫;

    move-result-object v0

    return-object v0
.end method

.method private ܽ(Ll/۬ۗ֫;)I
    .locals 2

    .line 1991
    iget-object v0, p1, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    invoke-virtual {v0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1992
    iget p1, p0, Ll/ܺۙ֫;->᩸:I

    return p1

    .line 1994
    :cond_0
    iget-object v0, p1, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    iget-object p1, p1, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    iget-object p1, p1, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget-object v1, p0, Ll/ܺۙ֫;->᩺:Ll/᩹᩵֫;

    invoke-virtual {v0, p1, v1}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    move-result-object p1

    iget p1, p1, Ll/᩹᩵֫;->᩻:I

    return p1
.end method

.method public static bridge synthetic ܽ(Ll/ܺۙ֫;)Ll/ۧۚ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۙ֫;->ۜ:Ll/ۧۚ֫;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ܺۙ֫;)Ll/ܿ᩵֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۙ֫;->ۙ:Ll/ܿ᩵֫;

    return-object p0
.end method

.method public static ᩳ(Ll/۬ۗ֫;)J
    .locals 7

    .line 2337
    new-instance v0, Ll/᩶᩵֫;

    invoke-direct {v0}, Ll/᩶᩵֫;-><init>()V

    .line 2338
    new-instance v1, Ll/᩹᩵֫;

    invoke-direct {v1}, Ll/᩹᩵֫;-><init>()V

    .line 2339
    iget-object v2, p0, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    iget-object v3, p0, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    iget-object v3, v3, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    invoke-virtual {v2, v3, v1}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    .line 2340
    iget-wide v2, p0, Ll/۬ۗ֫;->ۘ:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    .line 2341
    iget-object p0, p0, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    iget v1, v1, Ll/᩹᩵֫;->᩻:I

    const-wide/16 v2, 0x0

    .line 1097
    invoke-virtual {p0, v1, v0, v2, v3}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object p0

    .line 330
    iget-wide v0, p0, Ll/᩶᩵֫;->֫:J

    return-wide v0

    .line 693
    :cond_0
    iget-wide v0, v1, Ll/᩹᩵֫;->ܿ:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public static bridge synthetic ᩳ(Ll/ܺۙ֫;)Ll/᩹ۚ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۙ֫;->ܶ:Ll/᩹ۚ֫;

    return-object p0
.end method

.method private ᩴ֫()V
    .locals 5

    .line 2887
    invoke-virtual {p0}, Ll/ܺۙ֫;->ᩳ()I

    move-result v0

    .line 2888
    iget-object v1, p0, Ll/ܺۙ֫;->۫֫:Ll/ᩴ۬֫;

    iget-object v2, p0, Ll/ܺۙ֫;->۬֫:Ll/ۖ۬֫;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v0, v4, :cond_3

    const/4 v4, 0x2

    if-eq v0, v4, :cond_1

    const/4 v4, 0x3

    if-eq v0, v4, :cond_1

    const/4 v4, 0x4

    if-ne v0, v4, :cond_0

    goto :goto_0

    .line 2902
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 468
    :cond_1
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 469
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-boolean v0, v0, Ll/۬ۗ֫;->ᩴ:Z

    .line 2892
    invoke-virtual {p0}, Ll/ܺۙ֫;->᩶()Z

    move-result v4

    if-eqz v4, :cond_2

    if-nez v0, :cond_2

    const/4 v3, 0x1

    :cond_2
    invoke-virtual {v2, v3}, Ll/ۖ۬֫;->֫(Z)V

    .line 2894
    invoke-virtual {p0}, Ll/ܺۙ֫;->᩶()Z

    move-result v0

    invoke-virtual {v1, v0}, Ll/ᩴ۬֫;->֫(Z)V

    return-void

    .line 2898
    :cond_3
    :goto_0
    invoke-virtual {v2, v3}, Ll/ۖ۬֫;->֫(Z)V

    .line 2899
    invoke-virtual {v1, v3}, Ll/ᩴ۬֫;->֫(Z)V

    return-void
.end method

.method private ᩵֫()V
    .locals 5

    .line 2909
    iget-object v0, p0, Ll/ܺۙ֫;->ۖ:Ll/ܳۚ֫;

    invoke-virtual {v0}, Ll/ܳۚ֫;->ۧ()V

    .line 2910
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Ll/ܺۙ֫;->ᩳ:Landroid/os/Looper;

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v2

    if-eq v0, v2, :cond_2

    .line 2918
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    .line 2912
    sget-object v2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1126
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "\'\nExpected thread: \'"

    const-string v3, "\'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread"

    const-string v4, "Player is accessed on the wrong thread.\nCurrent thread: \'"

    .line 0
    invoke-static {v4, v0, v2, v1, v3}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2919
    iget-boolean v1, p0, Ll/ܺۙ֫;->ܶ֫:Z

    if-nez v1, :cond_1

    .line 2922
    iget-boolean v1, p0, Ll/ܺۙ֫;->֨:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    :goto_0
    invoke-static {v0, v1}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x1

    .line 2923
    iput-boolean v0, p0, Ll/ܺۙ֫;->֨:Z

    return-void

    .line 2920
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ܺۙ֫;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۙ֫;->᩶֫:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/ܺۙ֫;)Ll/ܿ᩵֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۙ֫;->᩵֫:Ll/ܿ᩵֫;

    return-object p0
.end method


# virtual methods
.method public final getCurrentPosition()J
    .locals 2

    .line 1119
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1120
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    invoke-direct {p0, v0}, Ll/ܺۙ֫;->ۧ(Ll/۬ۗ֫;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final getDuration()J
    .locals 4

    .line 1107
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1108
    invoke-virtual {p0}, Ll/ܺۙ֫;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1109
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v1, v0, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    .line 1110
    iget-object v0, v0, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    iget-object v2, v1, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget-object v3, p0, Ll/ܺۙ֫;->᩺:Ll/᩹᩵֫;

    invoke-virtual {v0, v2, v3}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    .line 1111
    iget v0, v1, Ll/ܺۧۧ;->֫:I

    iget v1, v1, Ll/ܺۧۧ;->ۧ:I

    invoke-virtual {v3, v0, v1}, Ll/᩹᩵֫;->֫(II)J

    move-result-wide v0

    .line 1112
    invoke-static {v0, v1}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v0

    return-wide v0

    .line 1114
    :cond_0
    invoke-virtual {p0}, Ll/ܳᩴ֫;->۬()J

    move-result-wide v0

    return-wide v0
.end method

.method public final stop()V
    .locals 4

    .line 1014
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    const/4 v0, 0x0

    .line 1015
    invoke-direct {p0, v0}, Ll/ܺۙ֫;->֫(Ll/ᩳ᩶֫;)V

    .line 1016
    new-instance v0, Ll/ۙ֡֫;

    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v1

    iget-object v2, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-wide v2, v2, Ll/۬ۗ֫;->ۖ:J

    invoke-direct {v0, v1}, Ll/ۙ֡֫;-><init>(Ljava/util/List;)V

    iput-object v0, p0, Ll/ܺۙ֫;->ۘ:Ll/ۙ֡֫;

    return-void
.end method

.method public final ֡()I
    .locals 1

    .line 516
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 517
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget v0, v0, Ll/۬ۗ֫;->ۡ:I

    return v0
.end method

.method public final ֨()Landroid/os/Looper;
    .locals 1

    .line 481
    iget-object v0, p0, Ll/ܺۙ֫;->ᩳ:Landroid/os/Looper;

    return-object v0
.end method

.method public final ֫()V
    .locals 4

    .line 1021
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Release "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1024
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " [AndroidXMedia3/1.8.0] ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1030
    invoke-static {}, Ll/ܽ᩵֫;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1021
    invoke-static {v0}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V

    .line 1032
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1033
    iget-object v0, p0, Ll/ܺۙ֫;->ܳ:Ll/۠᩹֫;

    invoke-virtual {v0}, Ll/۠᩹֫;->֫()V

    .line 1037
    iget-object v0, p0, Ll/ܺۙ֫;->۬֫:Ll/ۖ۬֫;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ۖ۬֫;->֫(Z)V

    .line 1038
    iget-object v0, p0, Ll/ܺۙ֫;->۫֫:Ll/ᩴ۬֫;

    invoke-virtual {v0, v1}, Ll/ᩴ۬֫;->֫(Z)V

    .line 1042
    iget-object v0, p0, Ll/ܺۙ֫;->۠:Ll/᩶ۙ֫;

    invoke-virtual {v0}, Ll/᩶ۙ֫;->ܳ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1044
    iget-object v0, p0, Ll/ܺۙ֫;->ܶ:Ll/᩹ۚ֫;

    new-instance v1, Ll/᩶ۢᩴ;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Ll/᩶ۢᩴ;-><init>(I)V

    const/16 v2, 0xa

    invoke-virtual {v0, v2, v1}, Ll/᩹ۚ֫;->ۧ(ILl/۠ۚ֫;)V

    .line 1052
    :cond_0
    iget-object v0, p0, Ll/ܺۙ֫;->ܶ:Ll/᩹ۚ֫;

    invoke-virtual {v0}, Ll/᩹ۚ֫;->ۧ()V

    .line 1053
    iget-object v0, p0, Ll/ܺۙ֫;->֫֫:Ll/᩵ۚ֫;

    invoke-interface {v0}, Ll/᩵ۚ֫;->ۧ()V

    .line 1054
    iget-object v0, p0, Ll/ܺۙ֫;->ۢ:Ll/۬ܿۧ;

    iget-object v1, p0, Ll/ܺۙ֫;->ۧ:Ll/᩵۬֫;

    invoke-interface {v0, v1}, Ll/۬ܿۧ;->֫(Ll/ۗܿۧ;)V

    .line 1055
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-boolean v1, v0, Ll/۬ۗ֫;->ᩴ:Z

    if-eqz v1, :cond_1

    .line 1056
    invoke-virtual {v0}, Ll/۬ۗ֫;->֫()Ll/۬ۗ֫;

    move-result-object v0

    iput-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    .line 1058
    :cond_1
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ll/ܺۙ֫;->֫(Ll/۬ۗ֫;I)Ll/۬ۗ֫;

    move-result-object v0

    iput-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    .line 1059
    iget-object v2, v0, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    invoke-virtual {v0, v2}, Ll/۬ۗ֫;->֫(Ll/ܺۧۧ;)Ll/۬ۗ֫;

    move-result-object v0

    iput-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    .line 1060
    iget-wide v2, v0, Ll/۬ۗ֫;->ۖ:J

    iput-wide v2, v0, Ll/۬ۗ֫;->֫:J

    .line 1061
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    const-wide/16 v2, 0x0

    iput-wide v2, v0, Ll/۬ۗ֫;->ۚ:J

    .line 1062
    iget-object v0, p0, Ll/ܺۙ֫;->ۧ:Ll/᩵۬֫;

    invoke-interface {v0}, Ll/᩵۬֫;->֫()V

    .line 1063
    invoke-direct {p0}, Ll/ܺۙ֫;->ۖ֫()V

    .line 1064
    iget-object v0, p0, Ll/ܺۙ֫;->۫:Landroid/view/Surface;

    if-eqz v0, :cond_2

    .line 1065
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    const/4 v0, 0x0

    .line 1066
    iput-object v0, p0, Ll/ܺۙ֫;->۫:Landroid/view/Surface;

    .line 1072
    :cond_2
    sget-object v0, Ll/ۙ֡֫;->ܽ:Ll/ۙ֡֫;

    iput-object v0, p0, Ll/ܺۙ֫;->ۘ:Ll/ۙ֡֫;

    .line 1073
    iput-boolean v1, p0, Ll/ܺۙ֫;->ܽ֫:Z

    return-void
.end method

.method public final ֫(I)V
    .locals 2

    .line 825
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 826
    iget v0, p0, Ll/ܺۙ֫;->ܳ֫:I

    if-eq v0, p1, :cond_0

    .line 827
    iput p1, p0, Ll/ܺۙ֫;->ܳ֫:I

    .line 828
    iget-object v0, p0, Ll/ܺۙ֫;->۠:Ll/᩶ۙ֫;

    invoke-virtual {v0, p1}, Ll/᩶ۙ֫;->ۧ(I)V

    .line 829
    new-instance v0, Ll/۠᩶֫;

    invoke-direct {v0, p1}, Ll/۠᩶֫;-><init>(I)V

    iget-object p1, p0, Ll/ܺۙ֫;->ܶ:Ll/᩹ۚ֫;

    const/16 v1, 0x8

    invoke-virtual {p1, v1, v0}, Ll/᩹ۚ֫;->֫(ILl/۠ۚ֫;)V

    .line 831
    invoke-direct {p0}, Ll/ܺۙ֫;->ۘ֫()V

    .line 832
    invoke-virtual {p1}, Ll/᩹ۚ֫;->֫()V

    :cond_0
    return-void
.end method

.method public final ֫(JIZ)V
    .locals 11

    .line 889
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    const/4 v0, -0x1

    if-ne p3, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    if-ltz p3, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 893
    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->֫(Z)V

    .line 894
    iget-object v1, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v1, v1, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    .line 895
    invoke-virtual {v1}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1}, Ll/ۙ᩵֫;->ۧ()I

    move-result v2

    if-lt p3, v2, :cond_2

    :goto_1
    return-void

    .line 898
    :cond_2
    iget-object v2, p0, Ll/ܺۙ֫;->ۧ:Ll/᩵۬֫;

    invoke-interface {v2}, Ll/᩵۬֫;->ܽ()V

    .line 899
    iget v2, p0, Ll/ܺۙ֫;->ۨ:I

    add-int/2addr v2, v0

    iput v2, p0, Ll/ܺۙ֫;->ۨ:I

    .line 900
    invoke-virtual {p0}, Ll/ܺۙ֫;->᩷()Z

    move-result v2

    if-eqz v2, :cond_3

    const-string p1, "seekTo ignored because an ad is playing"

    .line 904
    invoke-static {p1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 905
    new-instance p1, Ll/ܶۙ֫;

    iget-object p2, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    invoke-direct {p1, p2}, Ll/ܶۙ֫;-><init>(Ll/۬ۗ֫;)V

    .line 907
    invoke-virtual {p1, v0}, Ll/ܶۙ֫;->֫(I)V

    .line 908
    iget-object p2, p0, Ll/ܺۙ֫;->ۧ֫:Ll/ܶ᩶֫;

    iget-object p2, p2, Ll/ܶ᩶֫;->֫:Ll/ܺۙ֫;

    invoke-static {p2, p1}, Ll/ܺۙ֫;->ۧ(Ll/ܺۙ֫;Ll/ܶۙ֫;)V

    return-void

    .line 911
    :cond_3
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    .line 912
    iget v2, v0, Ll/۬ۗ֫;->ۢ:I

    const/4 v3, 0x3

    if-eq v2, v3, :cond_4

    const/4 v3, 0x4

    if-ne v2, v3, :cond_5

    .line 913
    invoke-virtual {v1}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v2

    if-nez v2, :cond_5

    .line 914
    :cond_4
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    const/4 v2, 0x2

    .line 2651
    invoke-virtual {v0, v2}, Ll/۬ۗ֫;->֫(I)Ll/۬ۗ֫;

    move-result-object v0

    .line 916
    :cond_5
    invoke-virtual {p0}, Ll/ܺۙ֫;->۟()I

    move-result v9

    .line 921
    invoke-direct {p0, v1, p3, p1, p2}, Ll/ܺۙ֫;->֫(Ll/ۙ᩵֫;IJ)Landroid/util/Pair;

    move-result-object v2

    .line 918
    invoke-direct {p0, v0, v1, v2}, Ll/ܺۙ֫;->֫(Ll/۬ۗ֫;Ll/ۙ᩵֫;Landroid/util/Pair;)Ll/۬ۗ֫;

    move-result-object v3

    .line 922
    iget-object v0, p0, Ll/ܺۙ֫;->۠:Ll/᩶ۙ֫;

    invoke-static {p1, p2}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide p1

    invoke-virtual {v0, v1, p3, p1, p2}, Ll/᩶ۙ֫;->֫(Ll/ۙ᩵֫;IJ)V

    const/4 v6, 0x1

    .line 928
    invoke-direct {p0, v3}, Ll/ܺۙ֫;->ۧ(Ll/۬ۗ֫;)J

    move-result-wide v7

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v2, p0

    move v10, p4

    .line 923
    invoke-direct/range {v2 .. v10}, Ll/ܺۙ֫;->֫(Ll/۬ۗ֫;IZIJIZ)V

    return-void
.end method

.method public final ֫(JLjava/util/List;)V
    .locals 6

    .line 577
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 578
    invoke-direct {p0, p3}, Ll/ܺۙ֫;->ۧ(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v1

    .line 619
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-wide v3, p1

    .line 620
    invoke-direct/range {v0 .. v5}, Ll/ܺۙ֫;->֫(Ljava/util/ArrayList;IJZ)V

    return-void
.end method

.method public final ֫(Landroid/view/SurfaceView;)V
    .locals 3

    .line 1421
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1422
    instance-of v0, p1, Ll/᩸᩻ۧ;

    if-eqz v0, :cond_0

    .line 1423
    invoke-direct {p0}, Ll/ܺۙ֫;->ۖ֫()V

    .line 1424
    invoke-direct {p0, p1}, Ll/ܺۙ֫;->֫(Ljava/lang/Object;)V

    .line 1425
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ܺۙ֫;->֫(Landroid/view/SurfaceHolder;)V

    return-void

    .line 1426
    :cond_0
    instance-of v0, p1, Ll/᩶ۜۧ;

    iget-object v1, p0, Ll/ܺۙ֫;->ܺ:Ll/᩷ۙ֫;

    if-eqz v0, :cond_1

    .line 1427
    invoke-direct {p0}, Ll/ܺۙ֫;->ۖ֫()V

    .line 1428
    move-object v0, p1

    check-cast v0, Ll/᩶ۜۧ;

    iput-object v0, p0, Ll/ܺۙ֫;->ᩴ֫:Ll/᩶ۜۧ;

    .line 1429
    iget-object v0, p0, Ll/ܺۙ֫;->ۚ:Ll/ۢۙ֫;

    invoke-direct {p0, v0}, Ll/ܺۙ֫;->֫(Ll/ۛۗ֫;)Ll/ۨۗ֫;

    move-result-object v0

    const/16 v2, 0x2710

    .line 1430
    invoke-virtual {v0, v2}, Ll/ۨۗ֫;->֫(I)V

    iget-object v2, p0, Ll/ܺۙ֫;->ᩴ֫:Ll/᩶ۜۧ;

    .line 1431
    invoke-virtual {v0, v2}, Ll/ۨۗ֫;->֫(Ljava/lang/Object;)V

    .line 1432
    invoke-virtual {v0}, Ll/ۨۗ֫;->ܿ()V

    .line 1433
    iget-object v0, p0, Ll/ܺۙ֫;->ᩴ֫:Ll/᩶ۜۧ;

    invoke-virtual {v0, v1}, Ll/᩶ۜۧ;->֫(Ll/᩹ۜۧ;)V

    .line 1434
    iget-object v0, p0, Ll/ܺۙ֫;->ᩴ֫:Ll/᩶ۜۧ;

    invoke-virtual {v0}, Ll/᩶ۜۧ;->ܽ()Landroid/view/Surface;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ܺۙ֫;->֫(Ljava/lang/Object;)V

    .line 1435
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ܺۙ֫;->֫(Landroid/view/SurfaceHolder;)V

    return-void

    :cond_1
    const/4 v0, 0x0

    if-nez p1, :cond_2

    move-object p1, v0

    goto :goto_0

    .line 1437
    :cond_2
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    .line 1391
    :goto_0
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    if-nez p1, :cond_3

    .line 1393
    invoke-virtual {p0}, Ll/ܺۙ֫;->ۨ()V

    return-void

    .line 1395
    :cond_3
    invoke-direct {p0}, Ll/ܺۙ֫;->ۖ֫()V

    const/4 v2, 0x1

    .line 1396
    iput-boolean v2, p0, Ll/ܺۙ֫;->ۚ֫:Z

    .line 1397
    iput-object p1, p0, Ll/ܺۙ֫;->֡֫:Landroid/view/SurfaceHolder;

    .line 1398
    invoke-interface {p1, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 1399
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 1400
    invoke-virtual {v1}, Landroid/view/Surface;->isValid()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 1401
    invoke-direct {p0, v1}, Ll/ܺۙ֫;->֫(Ljava/lang/Object;)V

    .line 1402
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    move-result-object p1

    .line 1403
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    invoke-direct {p0, v0, p1}, Ll/ܺۙ֫;->֫(II)V

    return-void

    .line 1405
    :cond_4
    invoke-direct {p0, v0}, Ll/ܺۙ֫;->֫(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 1406
    invoke-direct {p0, p1, p1}, Ll/ܺۙ֫;->֫(II)V

    return-void
.end method

.method public final ֫(Landroid/view/TextureView;)V
    .locals 2

    .line 1449
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    if-nez p1, :cond_0

    .line 1451
    invoke-virtual {p0}, Ll/ܺۙ֫;->ۨ()V

    return-void

    .line 1453
    :cond_0
    invoke-direct {p0}, Ll/ܺۙ֫;->ۖ֫()V

    .line 1454
    iput-object p1, p0, Ll/ܺۙ֫;->۠֫:Landroid/view/TextureView;

    .line 1455
    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v0, "Replacing existing SurfaceTextureListener."

    .line 1456
    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 1458
    :cond_1
    iget-object v0, p0, Ll/ܺۙ֫;->ܺ:Ll/᩷ۙ֫;

    invoke-virtual {p1, v0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 1461
    invoke-virtual {p1}, Landroid/view/TextureView;->isAvailable()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_3

    .line 1463
    invoke-direct {p0, v1}, Ll/ܺۙ֫;->֫(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 1464
    invoke-direct {p0, p1, p1}, Ll/ܺۙ֫;->֫(II)V

    return-void

    .line 2775
    :cond_3
    new-instance v1, Landroid/view/Surface;

    invoke-direct {v1, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 2776
    invoke-direct {p0, v1}, Ll/ܺۙ֫;->֫(Ljava/lang/Object;)V

    .line 2777
    iput-object v1, p0, Ll/ܺۙ֫;->۫:Landroid/view/Surface;

    .line 1467
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-direct {p0, v0, p1}, Ll/ܺۙ֫;->֫(II)V

    return-void
.end method

.method public final ֫(Ljava/util/List;)V
    .locals 6

    .line 571
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 572
    invoke-direct {p0, p1}, Ll/ܺۙ֫;->ۧ(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v1

    .line 608
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    const/4 v2, -0x1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v5, 0x1

    move-object v0, p0

    .line 609
    invoke-direct/range {v0 .. v5}, Ll/ܺۙ֫;->֫(Ljava/util/ArrayList;IJZ)V

    return-void
.end method

.method public final ֫(Ll/֡᩵֫;)V
    .locals 1

    .line 1805
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1806
    iget-object v0, p0, Ll/ܺۙ֫;->ܶ:Ll/᩹ۚ֫;

    invoke-virtual {v0, p1}, Ll/᩹ۚ֫;->֫(Ll/֡᩵֫;)V

    return-void
.end method

.method public final ֫(Ll/ۖ᩵֫;)V
    .locals 10

    .line 953
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 957
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v0, v0, Ll/۬ۗ֫;->᩷:Ll/ۖ᩵֫;

    invoke-virtual {v0, p1}, Ll/ۖ᩵֫;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 960
    :cond_0
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    invoke-virtual {v0, p1}, Ll/۬ۗ֫;->֫(Ll/ۖ᩵֫;)Ll/۬ۗ֫;

    move-result-object v2

    .line 961
    iget v0, p0, Ll/ܺۙ֫;->ۨ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܺۙ֫;->ۨ:I

    .line 962
    iget-object v0, p0, Ll/ܺۙ֫;->۠:Ll/᩶ۙ֫;

    invoke-virtual {v0, p1}, Ll/᩶ۙ֫;->ۧ(Ll/ۖ᩵֫;)V

    const/4 v8, -0x1

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x5

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move-object v1, p0

    .line 963
    invoke-direct/range {v1 .. v9}, Ll/ܺۙ֫;->֫(Ll/۬ۗ֫;IZIJIZ)V

    return-void
.end method

.method public final ֫(Ll/ۨ۬֫;)V
    .locals 1

    .line 1668
    iget-object v0, p0, Ll/ܺۙ֫;->ۧ:Ll/᩵۬֫;

    invoke-interface {v0, p1}, Ll/᩵۬֫;->֫(Ll/ۨ۬֫;)V

    return-void
.end method

.method public final ֫(Ll/ۨ᩵֫;)V
    .locals 6

    .line 1252
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1253
    iget-object v0, p0, Ll/ܺۙ֫;->᩸֫:Ll/ۚܿۧ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v1, v0, Ll/ۜܿۧ;

    if-nez v1, :cond_0

    goto :goto_2

    .line 1256
    :cond_0
    invoke-virtual {p0}, Ll/ܺۙ֫;->۠()Ll/ۨ᩵֫;

    move-result-object v1

    .line 1258
    iget-boolean v2, p0, Ll/ܺۙ֫;->᩻֫:Z

    if-eqz v2, :cond_2

    .line 1259
    iget-object v2, p1, Ll/ۨ᩵֫;->ۧ:Ll/ۛ۬ܺ;

    iput-object v2, p0, Ll/ܺۙ֫;->᩵:Ll/ۛ۬ܺ;

    .line 1260
    iget-object v2, p0, Ll/ܺۙ֫;->ۜ֫:Ll/᩷۬֫;

    iget-object v2, v2, Ll/᩷۬֫;->ۧ:Ll/ۛ۬ܺ;

    .line 3025
    invoke-virtual {p1}, Ll/ۨ᩵֫;->֫()Ll/ۛ᩵֫;

    move-result-object v3

    .line 3026
    invoke-virtual {v2}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    .line 3027
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x1

    invoke-virtual {v3, v4, v5}, Ll/ۛ᩵֫;->֫(IZ)Ll/ۛ᩵֫;

    goto :goto_0

    .line 3029
    :cond_1
    invoke-virtual {v3}, Ll/ۛ᩵֫;->֫()Ll/ۨ᩵֫;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, p1

    .line 1265
    :goto_1
    invoke-virtual {v0}, Ll/ۚܿۧ;->ۧ()Ll/ۨ᩵֫;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/ۨ᩵֫;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 1266
    invoke-virtual {v0, v2}, Ll/ۚܿۧ;->֫(Ll/ۨ᩵֫;)V

    .line 1268
    :cond_3
    invoke-virtual {v1, p1}, Ll/ۨ᩵֫;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1269
    new-instance v0, Ll/ۡ᩵ܿ;

    invoke-direct {v0, p1}, Ll/ۡ᩵ܿ;-><init>(Ljava/lang/Object;)V

    iget-object p1, p0, Ll/ܺۙ֫;->ܶ:Ll/᩹ۚ֫;

    const/16 v1, 0x13

    invoke-virtual {p1, v1, v0}, Ll/᩹ۚ֫;->ۧ(ILl/۠ۚ֫;)V

    :cond_4
    :goto_2
    return-void
.end method

.method public final ֫(Ll/ܺܰ֫;)V
    .locals 2

    .line 1950
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    const/4 v0, 0x4

    const/16 v1, 0xf

    .line 1951
    invoke-direct {p0, v0, v1, p1}, Ll/ܺۙ֫;->֫(IILjava/lang/Object;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 813
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    const/4 v0, 0x1

    .line 814
    invoke-direct {p0, v0, p1}, Ll/ܺۙ֫;->֫(IZ)V

    return-void
.end method

.method public final ֫֫()Z
    .locals 1

    .line 858
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 859
    iget-boolean v0, p0, Ll/ܺۙ֫;->ܺ֫:Z

    return v0
.end method

.method public final ۖ()Ll/ᩳ᩶֫;
    .locals 1

    .line 523
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 524
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v0, v0, Ll/۬ۗ֫;->ۜ:Ll/ᩳ᩶֫;

    return-object v0
.end method

.method public final ۗ()V
    .locals 18

    move-object/from16 v9, p0

    .line 672
    invoke-direct/range {p0 .. p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 674
    iget-object v0, v9, Ll/ܺۙ֫;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const v2, 0x7fffffff

    .line 675
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-lez v1, :cond_a

    if-nez v2, :cond_0

    goto/16 :goto_6

    .line 680
    :cond_0
    iget-object v1, v9, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    .line 2505
    invoke-direct {v9, v1}, Ll/ܺۙ֫;->ܽ(Ll/۬ۗ֫;)I

    move-result v10

    .line 2506
    invoke-direct {v9, v1}, Ll/ܺۙ֫;->֫(Ll/۬ۗ֫;)J

    move-result-wide v3

    .line 2507
    iget-object v15, v1, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    .line 2508
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v14

    .line 2509
    iget v5, v9, Ll/ܺۙ֫;->ۨ:I

    add-int/lit8 v5, v5, 0x1

    iput v5, v9, Ll/ܺۙ֫;->ۨ:I

    add-int/lit8 v5, v2, -0x1

    :goto_0
    if-ltz v5, :cond_1

    .line 2534
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    .line 2536
    :cond_1
    iget-object v5, v9, Ll/ܺۙ֫;->ۖ֫:Ll/֨ܽۧ;

    invoke-interface {v5, v2}, Ll/֨ܽۧ;->֫(I)Ll/ۚܽۧ;

    move-result-object v5

    iput-object v5, v9, Ll/ܺۙ֫;->ۖ֫:Ll/֨ܽۧ;

    .line 2540
    new-instance v13, Ll/ܰۗ֫;

    iget-object v5, v9, Ll/ܺۙ֫;->ۖ֫:Ll/֨ܽۧ;

    invoke-direct {v13, v0, v5}, Ll/ܰۗ֫;-><init>(Ljava/util/List;Ll/֨ܽۧ;)V

    .line 2664
    invoke-virtual {v15}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v0

    const/4 v11, -0x1

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_5

    invoke-virtual {v13}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    .line 2672
    :cond_2
    iget-object v5, v9, Ll/ܺۙ֫;->᩺:Ll/᩹᩵֫;

    .line 2674
    invoke-static {v3, v4}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v16

    .line 2673
    iget-object v4, v9, Ll/ܳᩴ֫;->֫:Ll/᩶᩵֫;

    move-object v3, v15

    move v6, v10

    move-wide/from16 v7, v16

    invoke-virtual/range {v3 .. v8}, Ll/ۙ᩵֫;->֫(Ll/᩶᩵֫;Ll/᩹᩵֫;IJ)Landroid/util/Pair;

    move-result-object v0

    .line 2675
    iget-object v3, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 2676
    invoke-virtual {v13, v3}, Ll/ᩴ᩹֫;->֫(Ljava/lang/Object;)I

    move-result v4

    if-eq v4, v11, :cond_3

    const/4 v3, 0x1

    move-object v7, v13

    move v8, v14

    goto/16 :goto_5

    :cond_3
    const/4 v0, 0x1

    .line 2681
    iget v4, v9, Ll/ܺۙ֫;->ܳ֫:I

    iget-boolean v5, v9, Ll/ܺۙ֫;->ܺ֫:Z

    .line 2682
    iget-object v11, v9, Ll/ܳᩴ֫;->֫:Ll/᩶᩵֫;

    iget-object v12, v9, Ll/ܺۙ֫;->᩺:Ll/᩹᩵֫;

    const/4 v6, -0x1

    move-object v7, v13

    move v13, v4

    move v8, v14

    move v14, v5

    move-object v5, v15

    move-object v15, v3

    move-object/from16 v16, v5

    move-object/from16 v17, v7

    invoke-static/range {v11 .. v17}, Ll/᩶ۙ֫;->֫(Ll/᩶᩵֫;Ll/᩹᩵֫;IZLjava/lang/Object;Ll/ۙ᩵֫;Ll/ۙ᩵֫;)I

    move-result v3

    if-eq v3, v6, :cond_4

    const-wide/16 v4, 0x0

    .line 1097
    iget-object v6, v9, Ll/ܳᩴ֫;->֫:Ll/᩶᩵֫;

    invoke-virtual {v7, v3, v6, v4, v5}, Ll/ᩴ᩹֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    .line 320
    iget-wide v4, v6, Ll/᩶᩵֫;->֫:J

    invoke-static {v4, v5}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v4

    .line 2686
    invoke-direct {v9, v7, v3, v4, v5}, Ll/ܺۙ֫;->֫(Ll/ۙ᩵֫;IJ)Landroid/util/Pair;

    move-result-object v3

    goto :goto_1

    :cond_4
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 2692
    invoke-direct {v9, v7, v6, v11, v12}, Ll/ܺۙ֫;->֫(Ll/ۙ᩵֫;IJ)Landroid/util/Pair;

    move-result-object v3

    :goto_1
    move-object v0, v3

    const/4 v3, 0x1

    goto :goto_5

    :cond_5
    :goto_2
    move-wide v11, v7

    move-object v7, v13

    move v8, v14

    move-object v5, v15

    const/4 v0, 0x1

    const/4 v6, -0x1

    .line 2665
    invoke-virtual {v5}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v5

    if-nez v5, :cond_6

    invoke-virtual {v7}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v5, 0x1

    goto :goto_3

    :cond_6
    const/4 v5, 0x0

    :goto_3
    if-eqz v5, :cond_7

    goto :goto_4

    :cond_7
    move v6, v10

    :goto_4
    if-eqz v5, :cond_8

    move-wide v3, v11

    .line 2666
    :cond_8
    invoke-direct {v9, v7, v6, v3, v4}, Ll/ܺۙ֫;->֫(Ll/ۙ᩵֫;IJ)Landroid/util/Pair;

    move-result-object v3

    goto :goto_1

    .line 2513
    :goto_5
    invoke-direct {v9, v1, v7, v0}, Ll/ܺۙ֫;->֫(Ll/۬ۗ֫;Ll/ۙ᩵֫;Landroid/util/Pair;)Ll/۬ۗ֫;

    move-result-object v0

    .line 2519
    iget v1, v0, Ll/۬ۗ֫;->ۢ:I

    if-eq v1, v3, :cond_9

    const/4 v4, 0x4

    if-eq v1, v4, :cond_9

    if-lez v2, :cond_9

    if-ne v2, v8, :cond_9

    iget-object v1, v0, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    .line 2524
    invoke-virtual {v1}, Ll/ۙ᩵֫;->ۧ()I

    move-result v1

    if-lt v10, v1, :cond_9

    .line 2526
    invoke-static {v0, v4}, Ll/ܺۙ֫;->֫(Ll/۬ۗ֫;I)Ll/۬ۗ֫;

    move-result-object v0

    :cond_9
    move-object v1, v0

    .line 2528
    iget-object v0, v9, Ll/ܺۙ֫;->۠:Ll/᩶ۙ֫;

    iget-object v4, v9, Ll/ܺۙ֫;->ۖ֫:Ll/֨ܽۧ;

    invoke-virtual {v0, v2, v4}, Ll/᩶ۙ֫;->֫(ILl/֨ܽۧ;)V

    .line 681
    iget-object v0, v1, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    iget-object v0, v0, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget-object v2, v9, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v2, v2, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    iget-object v2, v2, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    .line 682
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v3, v0

    .line 688
    invoke-direct {v9, v1}, Ll/ܺۙ֫;->ۧ(Ll/۬ۗ֫;)J

    move-result-wide v5

    const/4 v7, -0x1

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x4

    move-object/from16 v0, p0

    .line 683
    invoke-direct/range {v0 .. v8}, Ll/ܺۙ֫;->֫(Ll/۬ۗ֫;IZIJIZ)V

    :cond_a
    :goto_6
    return-void
.end method

.method public final ۘ()Ll/ܰ᩵֫;
    .locals 1

    .line 1234
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1235
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v0, v0, Ll/۬ۗ֫;->۠:Ll/֨ܿۧ;

    iget-object v0, v0, Ll/֨ܿۧ;->ܿ:Ll/ܰ᩵֫;

    return-object v0
.end method

.method public final ۙ()J
    .locals 2

    .line 947
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 948
    iget-wide v0, p0, Ll/ܺۙ֫;->᩶:J

    return-wide v0
.end method

.method public final ۚ()Ll/ۙ᩵֫;
    .locals 1

    .line 1302
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1303
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v0, v0, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    return-object v0
.end method

.method public final ۛ()I
    .locals 1

    .line 1154
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1155
    invoke-virtual {p0}, Ll/ܺۙ֫;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v0, v0, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    iget v0, v0, Ll/ܺۧۧ;->ۧ:I

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final ۜ()I
    .locals 1

    .line 838
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 839
    iget v0, p0, Ll/ܺۙ֫;->ܳ֫:I

    return v0
.end method

.method public final ۟()I
    .locals 2

    .line 1100
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1101
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    invoke-direct {p0, v0}, Ll/ܺۙ֫;->ܽ(Ll/۬ۗ֫;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return v0
.end method

.method public final ۠()Ll/ۨ᩵֫;
    .locals 2

    .line 1240
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1241
    iget-object v0, p0, Ll/ܺۙ֫;->᩸֫:Ll/ۚܿۧ;

    invoke-virtual {v0}, Ll/ۚܿۧ;->ۧ()Ll/ۨ᩵֫;

    move-result-object v0

    .line 1242
    iget-boolean v1, p0, Ll/ܺۙ֫;->᩻֫:Z

    if-eqz v1, :cond_0

    .line 1244
    invoke-virtual {v0}, Ll/ۨ᩵֫;->֫()Ll/ۛ᩵֫;

    move-result-object v0

    iget-object v1, p0, Ll/ܺۙ֫;->᩵:Ll/ۛ۬ܺ;

    .line 1245
    invoke-virtual {v0, v1}, Ll/ۛ᩵֫;->֫(Ljava/util/Set;)Ll/ۛ᩵֫;

    move-result-object v0

    .line 1246
    invoke-virtual {v0}, Ll/ۛ᩵֫;->֫()Ll/ۨ᩵֫;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final ۢ()J
    .locals 2

    .line 1136
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1137
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-wide v0, v0, Ll/۬ۗ֫;->ۚ:J

    invoke-static {v0, v1}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۤ()Ll/ۜ֡֫;
    .locals 1

    .line 1354
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1355
    iget-object v0, p0, Ll/ܺۙ֫;->ۗ֫:Ll/ۜ֡֫;

    return-object v0
.end method

.method public final ۧ()V
    .locals 12

    .line 529
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 530
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget v1, v0, Ll/۬ۗ֫;->ۢ:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 533
    invoke-virtual {v0, v1}, Ll/۬ۗ֫;->֫(Ll/ᩳ᩶֫;)Ll/۬ۗ֫;

    move-result-object v0

    .line 536
    iget-object v1, v0, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    invoke-virtual {v1}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    .line 535
    :goto_0
    invoke-static {v0, v1}, Ll/ܺۙ֫;->֫(Ll/۬ۗ֫;I)Ll/۬ۗ֫;

    move-result-object v4

    .line 541
    iget v0, p0, Ll/ܺۙ֫;->ۨ:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/ܺۙ֫;->ۨ:I

    .line 542
    iget-object v0, p0, Ll/ܺۙ֫;->۠:Ll/᩶ۙ֫;

    invoke-virtual {v0}, Ll/᩶ۙ֫;->ܿ()V

    const/4 v10, -0x1

    const/4 v11, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x5

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    move-object v3, p0

    .line 543
    invoke-direct/range {v3 .. v11}, Ll/ܺۙ֫;->֫(Ll/۬ۗ֫;IZIJIZ)V

    return-void
.end method

.method public final ۧ(Landroid/view/SurfaceView;)V
    .locals 1

    .line 1443
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 1444
    :cond_0
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    .line 1413
    :goto_0
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    if-eqz p1, :cond_1

    .line 1414
    iget-object v0, p0, Ll/ܺۙ֫;->֡֫:Landroid/view/SurfaceHolder;

    if-ne p1, v0, :cond_1

    .line 1415
    invoke-virtual {p0}, Ll/ܺۙ֫;->ۨ()V

    :cond_1
    return-void
.end method

.method public final ۧ(Landroid/view/TextureView;)V
    .locals 1

    .line 1474
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    if-eqz p1, :cond_0

    .line 1475
    iget-object v0, p0, Ll/ܺۙ֫;->۠֫:Landroid/view/TextureView;

    if-ne p1, v0, :cond_0

    .line 1476
    invoke-virtual {p0}, Ll/ܺۙ֫;->ۨ()V

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/֡᩵֫;)V
    .locals 1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1800
    iget-object v0, p0, Ll/ܺۙ֫;->ܶ:Ll/᩹ۚ֫;

    invoke-virtual {v0, p1}, Ll/᩹ۚ֫;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ(Z)V
    .locals 2

    .line 844
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 845
    iget-boolean v0, p0, Ll/ܺۙ֫;->ܺ֫:Z

    if-eq v0, p1, :cond_0

    .line 846
    iput-boolean p1, p0, Ll/ܺۙ֫;->ܺ֫:Z

    .line 847
    iget-object v0, p0, Ll/ܺۙ֫;->۠:Ll/᩶ۙ֫;

    invoke-virtual {v0, p1}, Ll/᩶ۙ֫;->ۧ(Z)V

    .line 848
    new-instance v0, Ll/ۗ᩶֫;

    invoke-direct {v0, p1}, Ll/ۗ᩶֫;-><init>(Z)V

    iget-object p1, p0, Ll/ܺۙ֫;->ܶ:Ll/᩹ۚ֫;

    const/16 v1, 0x9

    invoke-virtual {p1, v1, v0}, Ll/᩹ۚ֫;->֫(ILl/۠ۚ֫;)V

    .line 851
    invoke-direct {p0}, Ll/ܺۙ֫;->ۘ֫()V

    .line 852
    invoke-virtual {p1}, Ll/᩹ۚ֫;->֫()V

    :cond_0
    return-void
.end method

.method public final ۧ֫()J
    .locals 8

    .line 1166
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1167
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v0, v0, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    invoke-virtual {v0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1168
    iget-wide v0, p0, Ll/ܺۙ֫;->᩹:J

    return-wide v0

    .line 1170
    :cond_0
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v1, v0, Ll/۬ۗ֫;->ᩳ:Ll/ܺۧۧ;

    iget-wide v1, v1, Ll/ܺۧۧ;->ܿ:J

    iget-object v3, v0, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    iget-wide v3, v3, Ll/ܺۧۧ;->ܿ:J

    const-wide/16 v5, 0x0

    cmp-long v7, v1, v3

    if-eqz v7, :cond_1

    .line 1172
    iget-object v0, v0, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    invoke-virtual {p0}, Ll/ܺۙ֫;->۟()I

    move-result v1

    iget-object v2, p0, Ll/ܳᩴ֫;->֫:Ll/᩶᩵֫;

    .line 1097
    invoke-virtual {v0, v1, v2, v5, v6}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object v0

    .line 335
    iget-wide v0, v0, Ll/᩶᩵֫;->ۧ:J

    invoke-static {v0, v1}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v0

    return-wide v0

    .line 1174
    :cond_1
    iget-wide v0, v0, Ll/۬ۗ֫;->֫:J

    .line 1175
    iget-object v2, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v2, v2, Ll/۬ۗ֫;->ᩳ:Ll/ܺۧۧ;

    invoke-virtual {v2}, Ll/ܺۧۧ;->֫()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1176
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v1, v0, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    iget-object v0, v0, Ll/۬ۗ֫;->ᩳ:Ll/ܺۧۧ;

    iget-object v0, v0, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget-object v2, p0, Ll/ܺۙ֫;->᩺:Ll/᩹᩵֫;

    .line 1177
    invoke-virtual {v1, v0, v2}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    move-result-object v0

    .line 1178
    iget-object v1, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v1, v1, Ll/۬ۗ֫;->ᩳ:Ll/ܺۧۧ;

    iget v1, v1, Ll/ܺۧۧ;->֫:I

    .line 1179
    invoke-virtual {v0, v1}, Ll/᩹᩵֫;->֫(I)J

    goto :goto_0

    :cond_2
    move-wide v5, v0

    .line 1184
    :goto_0
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v1, v0, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    iget-object v0, v0, Ll/۬ۗ֫;->ᩳ:Ll/ܺۧۧ;

    .line 2718
    iget-object v0, v0, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget-object v2, p0, Ll/ܺۙ֫;->᩺:Ll/᩹᩵֫;

    invoke-virtual {v1, v0, v2}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    .line 693
    iget-wide v0, v2, Ll/᩹᩵֫;->ܿ:J

    add-long/2addr v5, v0

    .line 1184
    invoke-static {v5, v6}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۨ()V
    .locals 1

    .line 1366
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1367
    invoke-direct {p0}, Ll/ܺۙ֫;->ۖ֫()V

    const/4 v0, 0x0

    .line 1368
    invoke-direct {p0, v0}, Ll/ܺۙ֫;->֫(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 1369
    invoke-direct {p0, v0, v0}, Ll/ܺۙ֫;->֫(II)V

    return-void
.end method

.method public final ۫()I
    .locals 2

    .line 1090
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1091
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v0, v0, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    invoke-virtual {v0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 1094
    :cond_0
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v1, v0, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    iget-object v0, v0, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    iget-object v0, v0, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ܰ()J
    .locals 2

    .line 1160
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1161
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    invoke-direct {p0, v0}, Ll/ܺۙ֫;->֫(Ll/۬ۗ֫;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܳ֫()J
    .locals 2

    .line 935
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 936
    iget-wide v0, p0, Ll/ܺۙ֫;->ۢ֫:J

    return-wide v0
.end method

.method public final ܽ()Ll/ۖ᩵֫;
    .locals 1

    .line 975
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 976
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v0, v0, Ll/۬ۗ֫;->᩷:Ll/ۖ᩵֫;

    return-object v0
.end method

.method public final ܽ(Z)V
    .locals 6

    .line 1589
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1590
    iget-boolean v0, p0, Ll/ܺۙ֫;->᩻֫:Z

    if-ne p1, v0, :cond_0

    return-void

    .line 1593
    :cond_0
    iput-boolean p1, p0, Ll/ܺۙ֫;->᩻֫:Z

    .line 1594
    iget-object v0, p0, Ll/ܺۙ֫;->ۜ֫:Ll/᩷۬֫;

    iget-object v1, v0, Ll/᩷۬֫;->ۧ:Ll/ۛ۬ܺ;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 1595
    iget-object v1, p0, Ll/ܺۙ֫;->᩸֫:Ll/ۚܿۧ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v2, v1, Ll/ۜܿۧ;

    if-eqz v2, :cond_3

    .line 1596
    invoke-virtual {v1}, Ll/ۚܿۧ;->ۧ()Ll/ۨ᩵֫;

    move-result-object v2

    if-eqz p1, :cond_2

    .line 1599
    iget-object v3, v2, Ll/ۨ᩵֫;->ۧ:Ll/ۛ۬ܺ;

    iput-object v3, p0, Ll/ܺۙ֫;->᩵:Ll/ۛ۬ܺ;

    .line 1601
    iget-object v0, v0, Ll/᩷۬֫;->ۧ:Ll/ۛ۬ܺ;

    .line 3025
    invoke-virtual {v2}, Ll/ۨ᩵֫;->֫()Ll/ۛ᩵֫;

    move-result-object v3

    .line 3026
    invoke-virtual {v0}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    .line 3027
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x1

    invoke-virtual {v3, v4, v5}, Ll/ۛ᩵֫;->֫(IZ)Ll/ۛ᩵֫;

    goto :goto_0

    .line 3029
    :cond_1
    invoke-virtual {v3}, Ll/ۛ᩵֫;->֫()Ll/ۨ᩵֫;

    move-result-object v0

    goto :goto_1

    .line 1607
    :cond_2
    invoke-virtual {v2}, Ll/ۨ᩵֫;->֫()Ll/ۛ᩵֫;

    move-result-object v0

    iget-object v3, p0, Ll/ܺۙ֫;->᩵:Ll/ۛ۬ܺ;

    .line 1608
    invoke-virtual {v0, v3}, Ll/ۛ᩵֫;->֫(Ljava/util/Set;)Ll/ۛ᩵֫;

    move-result-object v0

    .line 1609
    invoke-virtual {v0}, Ll/ۛ᩵֫;->֫()Ll/ۨ᩵֫;

    move-result-object v0

    const/4 v3, 0x0

    .line 1610
    iput-object v3, p0, Ll/ܺۙ֫;->᩵:Ll/ۛ۬ܺ;

    .line 1614
    :goto_1
    invoke-virtual {v0, v2}, Ll/ۨ᩵֫;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 1615
    invoke-virtual {v1, v0}, Ll/ۚܿۧ;->֫(Ll/ۨ᩵֫;)V

    .line 1618
    :cond_3
    iget-object v0, p0, Ll/ܺۙ֫;->۠:Ll/᩶ۙ֫;

    invoke-virtual {v0, p1}, Ll/᩶ۙ֫;->֫(Z)V

    .line 2837
    iget-object p1, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-boolean v0, p1, Ll/۬ۗ֫;->ܳ:Z

    iget p1, p1, Ll/۬ۗ֫;->᩻:I

    invoke-direct {p0, p1, v0}, Ll/ܺۙ֫;->֫(IZ)V

    return-void
.end method

.method public final ܿ֫()Ll/ܿ᩵֫;
    .locals 1

    .line 1277
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1278
    iget-object v0, p0, Ll/ܺۙ֫;->ۙ:Ll/ܿ᩵֫;

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 510
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 511
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget v0, v0, Ll/۬ۗ֫;->ۢ:I

    return v0
.end method

.method public final ᩴ()Ll/ۙ֡֫;
    .locals 1

    .line 1793
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1794
    iget-object v0, p0, Ll/ܺۙ֫;->ۘ:Ll/ۙ֡֫;

    return-object v0
.end method

.method public final ᩵()I
    .locals 1

    .line 1148
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1149
    invoke-virtual {p0}, Ll/ܺۙ֫;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v0, v0, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    iget v0, v0, Ll/ܺۧۧ;->֫:I

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final ᩶()Z
    .locals 1

    .line 819
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 820
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-boolean v0, v0, Ll/۬ۗ֫;->ܳ:Z

    return v0
.end method

.method public final ᩷()Z
    .locals 1

    .line 1142
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1143
    iget-object v0, p0, Ll/ܺۙ֫;->۟:Ll/۬ۗ֫;

    iget-object v0, v0, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    invoke-virtual {v0}, Ll/ܺۧۧ;->֫()Z

    move-result v0

    return v0
.end method

.method public final ᩸()Z
    .locals 1

    .line 1624
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1625
    iget-boolean v0, p0, Ll/ܺۙ֫;->᩻֫:Z

    return v0
.end method

.method public final ᩹()Ll/ᩴ᩵֫;
    .locals 1

    .line 504
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 505
    iget-object v0, p0, Ll/ܺۙ֫;->᩷:Ll/ᩴ᩵֫;

    return-object v0
.end method

.method public final ᩺()J
    .locals 2

    .line 941
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 942
    iget-wide v0, p0, Ll/ܺۙ֫;->ۡ֫:J

    return-wide v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 1078
    invoke-direct {p0}, Ll/ܺۙ֫;->᩵֫()V

    .line 1079
    iget-boolean v0, p0, Ll/ܺۙ֫;->ܽ֫:Z

    return v0
.end method
