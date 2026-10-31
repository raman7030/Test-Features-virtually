.class public final Ll/ᩴۧᩳ;
.super Ll/۟ܶۡ;
.source "56B1"


# instance fields
.field public final synthetic ۜ:Ll/֨ۧᩳ;

.field public final synthetic ܳ:Ll/ۚۧᩳ;

.field public final synthetic ᩻:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/ۚۧᩳ;Ll/֨ۧᩳ;Ljava/util/List;)V
    .locals 0

    .line 283
    iput-object p1, p0, Ll/ᩴۧᩳ;->ܳ:Ll/ۚۧᩳ;

    iput-object p2, p0, Ll/ᩴۧᩳ;->ۜ:Ll/֨ۧᩳ;

    iput-object p3, p0, Ll/ᩴۧᩳ;->᩻:Ljava/util/List;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 401
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v0}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f12003d

    .line 402
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    goto :goto_0

    :cond_0
    const v0, 0x7f1203ea

    .line 404
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 405
    :goto_0
    iget-object v0, p0, Ll/ᩴۧᩳ;->ܳ:Ll/ۚۧᩳ;

    invoke-static {v0}, Ll/ۚۧᩳ;->ܽ(Ll/ۚۧᩳ;)Ll/۫۟ܽ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۫۟ܽ;->ᩳ֫()V

    .line 406
    iget-object v0, p0, Ll/ᩴۧᩳ;->ۜ:Ll/֨ۧᩳ;

    invoke-virtual {v0}, Ll/֨ۧᩳ;->֫()V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 3

    .line 411
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v0}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v0

    iget-object v1, p0, Ll/ᩴۧᩳ;->ܳ:Ll/ۚۧᩳ;

    if-eqz v0, :cond_0

    const p1, 0x7f12003d

    .line 412
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    goto :goto_0

    .line 413
    :cond_0
    iget-object v0, p0, Ll/ᩴۧᩳ;->ۜ:Ll/֨ۧᩳ;

    invoke-virtual {v0, p1}, Ll/֨ۧᩳ;->֫(Ljava/lang/Exception;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 414
    invoke-static {v1}, Ll/ۚۧᩳ;->ܽ(Ll/ۚۧᩳ;)Ll/۫۟ܽ;

    move-result-object v0

    const/4 v2, 0x0

    .line 546
    invoke-virtual {v0, p1, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    .line 415
    :cond_1
    :goto_0
    invoke-static {v1}, Ll/ۚۧᩳ;->ܽ(Ll/ۚۧᩳ;)Ll/۫۟ܽ;

    move-result-object p1

    invoke-virtual {p1}, Ll/۫۟ܽ;->ᩳ֫()V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 287
    iget-object v0, p0, Ll/ᩴۧᩳ;->ܳ:Ll/ۚۧᩳ;

    invoke-static {v0}, Ll/ۚۧᩳ;->ܽ(Ll/ۚۧᩳ;)Ll/۫۟ܽ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;)V

    .line 288
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    const/4 v1, 0x0

    .line 43
    invoke-virtual {v0, v1}, Ll/۬۬ܿ;->֫(Ljava/lang/Runnable;)V

    .line 289
    iget-object v0, p0, Ll/ᩴۧᩳ;->ۜ:Ll/֨ۧᩳ;

    invoke-virtual {v0}, Ll/֨ۧᩳ;->ۧ()V

    return-void
.end method

.method public final ܿ()V
    .locals 20

    move-object/from16 v0, p0

    .line 294
    iget-object v1, v0, Ll/ᩴۧᩳ;->ۜ:Ll/֨ۧᩳ;

    invoke-virtual {v1}, Ll/֨ۧᩳ;->ۜ()V

    .line 295
    invoke-virtual {v1}, Ll/֨ۧᩳ;->᩷()Z

    move-result v2

    iget-object v3, v0, Ll/ᩴۧᩳ;->ܳ:Ll/ۚۧᩳ;

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    invoke-static {v3}, Ll/ۚۧᩳ;->᩻(Ll/ۚۧᩳ;)Landroid/widget/CheckBox;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    .line 296
    :goto_1
    invoke-static {}, Ll/ۡۤۡ;->᩻()Ll/ۡۤۡ;

    move-result-object v5

    .line 299
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 300
    iget-object v7, v0, Ll/ᩴۧᩳ;->᩻:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_2
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۡ۟ܽ;

    .line 301
    iget-object v9, v8, Ll/ۡ۟ܽ;->ܿ:Ljava/lang/String;

    if-eqz v9, :cond_2

    if-nez v2, :cond_3

    .line 111
    iget-object v9, v8, Ll/ۡ۟ܽ;->᩷:Ljava/lang/String;

    if-nez v9, :cond_2

    .line 302
    :cond_3
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 306
    :cond_4
    invoke-virtual {v1}, Ll/֨ۧᩳ;->ۢ()Z

    move-result v2

    const/4 v7, 0x3

    const/16 v8, 0x64

    if-eqz v2, :cond_11

    .line 307
    invoke-virtual {v1}, Ll/֨ۧᩳ;->ᩳ()Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;

    move-result-object v2

    const/4 v10, 0x0

    .line 311
    :goto_3
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v10, v11, :cond_16

    iget-object v11, v0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v11}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v11

    if-nez v11, :cond_16

    .line 313
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 314
    invoke-interface {v2}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->reset()V

    .line 316
    :goto_4
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-ge v10, v12, :cond_a

    .line 317
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۡ۟ܽ;

    .line 318
    iget-object v13, v12, Ll/ۡ۟ܽ;->ܿ:Ljava/lang/String;

    const/4 v14, 0x1

    iget-object v15, v12, Ll/ۡ۟ܽ;->᩷:Ljava/lang/String;

    invoke-virtual {v1, v13, v15}, Ll/֨ۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 320
    invoke-interface {v2, v15}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->tryAdd(Ljava/lang/String;)Z

    move-result v15

    if-nez v15, :cond_9

    .line 321
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_8

    .line 323
    invoke-virtual {v5}, Ll/ۡۤۡ;->֫()Z

    move-result v15

    if-eqz v15, :cond_5

    .line 324
    iget-object v15, v0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    const/16 v16, 0x2

    invoke-static {v3}, Ll/ۚۧᩳ;->ܽ(Ll/ۚۧᩳ;)Ll/۫۟ܽ;

    move-result-object v9

    add-int/lit8 v17, v10, 0x1

    .line 325
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v18

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    invoke-static {v8, v13}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v19, v2

    new-array v2, v7, [Ljava/lang/Object;

    aput-object v17, v2, v4

    aput-object v18, v2, v14

    aput-object v8, v2, v16

    const v8, 0x7f120a93

    .line 324
    invoke-virtual {v9, v8, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v2}, Ll/۬۬ܿ;->֫(Ljava/lang/String;)V

    goto :goto_5

    :cond_5
    move-object/from16 v19, v2

    const/16 v16, 0x2

    .line 327
    :goto_5
    iget-object v2, v12, Ll/ۡ۟ܽ;->᩷:Ljava/lang/String;

    invoke-virtual {v1, v13, v2}, Ll/֨ۧᩳ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 328
    iget-object v8, v0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v8}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v8

    if-eqz v8, :cond_6

    goto :goto_7

    :cond_6
    if-eqz v2, :cond_7

    .line 334
    invoke-virtual {v12, v2}, Ll/ۡ۟ܽ;->֫(Ljava/lang/String;)V

    :cond_7
    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_8
    move-object/from16 v19, v2

    goto :goto_6

    :cond_9
    move-object/from16 v19, v2

    .line 341
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    const/16 v8, 0x64

    goto :goto_4

    :cond_a
    move-object/from16 v19, v2

    const/4 v14, 0x1

    :goto_6
    const/16 v16, 0x2

    .line 345
    :goto_7
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_b

    goto/16 :goto_a

    .line 351
    :cond_b
    invoke-virtual {v5}, Ll/ۡۤۡ;->֫()Z

    move-result v2

    if-eqz v2, :cond_c

    .line 352
    iget-object v2, v0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-static {v3}, Ll/ۚۧᩳ;->ܽ(Ll/ۚۧᩳ;)Ll/۫۟ܽ;

    move-result-object v8

    .line 353
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۡ۟ܽ;

    iget-object v4, v4, Ll/ۡ۟ܽ;->ܿ:Ljava/lang/String;

    const/16 v13, 0x64

    const/4 v15, 0x0

    invoke-static {v13, v4}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-array v13, v7, [Ljava/lang/Object;

    aput-object v9, v13, v15

    aput-object v12, v13, v14

    aput-object v4, v13, v16

    const v4, 0x7f120a93

    .line 352
    invoke-virtual {v8, v4, v13}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Ll/۬۬ܿ;->֫(Ljava/lang/String;)V

    .line 357
    :cond_c
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    .line 358
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v4

    new-array v4, v4, [Ljava/lang/String;

    const/4 v8, 0x0

    .line 359
    :goto_8
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v8, v9, :cond_d

    .line 360
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۡ۟ܽ;

    .line 361
    iget-object v12, v9, Ll/ۡ۟ܽ;->ܿ:Ljava/lang/String;

    aput-object v12, v2, v8

    .line 362
    iget-object v9, v9, Ll/ۡ۟ܽ;->᩷:Ljava/lang/String;

    aput-object v9, v4, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_8

    .line 366
    :cond_d
    invoke-virtual {v1, v2, v4}, Ll/֨ۧᩳ;->֫([Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 368
    iget-object v4, v0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v4}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v4

    if-eqz v4, :cond_e

    goto/16 :goto_d

    :cond_e
    const/4 v4, 0x0

    .line 373
    :goto_9
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v4, v8, :cond_10

    .line 374
    aget-object v8, v2, v4

    if-eqz v8, :cond_f

    .line 375
    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۡ۟ܽ;

    aget-object v9, v2, v4

    invoke-virtual {v8, v9}, Ll/ۡ۟ܽ;->֫(Ljava/lang/String;)V

    :cond_f
    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    :cond_10
    :goto_a
    const/4 v4, 0x0

    const/16 v8, 0x64

    move-object/from16 v2, v19

    goto/16 :goto_3

    :cond_11
    const/4 v2, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 380
    :goto_b
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v9, v10, :cond_16

    .line 381
    iget-object v10, v0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v10}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v10

    if-eqz v10, :cond_12

    goto :goto_d

    .line 383
    :cond_12
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۡ۟ܽ;

    .line 384
    invoke-virtual {v5}, Ll/ۡۤۡ;->֫()Z

    move-result v11

    if-eqz v11, :cond_13

    .line 385
    iget-object v11, v0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-static {v3}, Ll/ۚۧᩳ;->ܽ(Ll/ۚۧᩳ;)Ll/۫۟ܽ;

    move-result-object v12

    add-int/lit8 v13, v9, 0x1

    .line 386
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    iget-object v15, v10, Ll/ۡ۟ܽ;->ܿ:Ljava/lang/String;

    const/16 v4, 0x64

    invoke-static {v4, v15}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-array v15, v7, [Ljava/lang/Object;

    aput-object v13, v15, v8

    aput-object v14, v15, v2

    const/4 v13, 0x2

    aput-object v4, v15, v13

    const v4, 0x7f120a93

    .line 385
    invoke-virtual {v12, v4, v15}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ll/۬۬ܿ;->֫(Ljava/lang/String;)V

    goto :goto_c

    :cond_13
    const v4, 0x7f120a93

    const/4 v13, 0x2

    .line 388
    :goto_c
    iget-object v11, v10, Ll/ۡ۟ܽ;->ܿ:Ljava/lang/String;

    iget-object v12, v10, Ll/ۡ۟ܽ;->᩷:Ljava/lang/String;

    invoke-virtual {v1, v11, v12}, Ll/֨ۧᩳ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 389
    iget-object v12, v0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v12}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v12

    if-eqz v12, :cond_14

    goto :goto_d

    :cond_14
    if-eqz v11, :cond_15

    .line 392
    invoke-virtual {v10, v11}, Ll/ۡ۟ܽ;->֫(Ljava/lang/String;)V

    :cond_15
    add-int/lit8 v9, v9, 0x1

    goto :goto_b

    .line 396
    :cond_16
    :goto_d
    invoke-virtual {v1}, Ll/֨ۧᩳ;->ܳ()V

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 420
    iget-object v0, p0, Ll/ᩴۧᩳ;->ܳ:Ll/ۚۧᩳ;

    invoke-static {v0}, Ll/ۚۧᩳ;->ܽ(Ll/ۚۧᩳ;)Ll/۫۟ܽ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۫۟ܽ;->ۜ֫()V

    .line 421
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v0}, Ll/۬۬ܿ;->֫()V

    return-void
.end method
