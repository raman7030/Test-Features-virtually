.class public final Ll/ۘ֫ᩳ;
.super Ll/۟ܶۡ;
.source "B9R5"


# instance fields
.field public final synthetic ܳ:Ll/֨֫ᩳ;

.field public final synthetic ᩻:Z


# direct methods
.method public constructor <init>(Ll/֨֫ᩳ;Z)V
    .locals 0

    .line 346
    iput-object p1, p0, Ll/ۘ֫ᩳ;->ܳ:Ll/֨֫ᩳ;

    iput-boolean p2, p0, Ll/ۘ֫ᩳ;->᩻:Z

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 401
    iget-boolean v0, p0, Ll/ۘ֫ᩳ;->᩻:Z

    iget-object v1, p0, Ll/ۘ֫ᩳ;->ܳ:Ll/֨֫ᩳ;

    if-eqz v0, :cond_0

    .line 402
    invoke-virtual {v1}, Ll/֨֫ᩳ;->finish()V

    return-void

    .line 404
    :cond_0
    invoke-static {v1}, Ll/֨֫ᩳ;->ۜ(Ll/֨֫ᩳ;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/֨֫ᩳ;->֫(Ll/֨֫ᩳ;Ljava/lang/String;)V

    .line 405
    invoke-static {v1}, Ll/֨֫ᩳ;->᩻(Ll/֨֫ᩳ;)V

    const v0, 0x7f1208d1

    .line 406
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 412
    iget-object v0, p0, Ll/ۘ֫ᩳ;->ܳ:Ll/֨֫ᩳ;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 350
    iget-object v0, p0, Ll/ۘ֫ᩳ;->ܳ:Ll/֨֫ᩳ;

    const v1, 0x7f1208d2

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 15

    const-string v0, "bin.mt.plus.TranslationData"

    .line 355
    new-instance v1, Ll/ۤۜܽ;

    invoke-direct {v1}, Ll/ۤۜܽ;-><init>()V

    .line 356
    invoke-static {}, Ll/֨֫ᩳ;->ۨ()Ll/ܶ᩵ܿ;

    move-result-object v2

    const-string v3, "arsc"

    invoke-virtual {v2, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 59
    sget-object v3, Ll/ۢܿܽ;->᩶:Ll/ۢܿܽ;

    .line 79
    new-instance v4, Ll/᩺᩻ܽ;

    invoke-direct {v4, v2}, Ll/᩺᩻ܽ;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-static {v4, v3}, Ll/ۡܿܽ;->֫(Ll/ۡᩳܽ;Ll/ۢܿܽ;)Ll/ۡܿܽ;

    move-result-object v2

    .line 357
    iget-object v3, p0, Ll/ۘ֫ᩳ;->ܳ:Ll/֨֫ᩳ;

    invoke-static {v3}, Ll/֨֫ᩳ;->ܳ(Ll/֨֫ᩳ;)Ljava/util/HashMap;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۠֫ᩳ;

    .line 358
    invoke-virtual {v5}, Ll/۠֫ᩳ;->ۜ()V

    .line 359
    invoke-virtual {v5}, Ll/۠֫ᩳ;->ܿ()Z

    move-result v7

    if-nez v7, :cond_1

    goto :goto_0

    .line 362
    :cond_1
    new-instance v7, Ll/۬᩵;

    invoke-direct {v7}, Ll/۬᩵;-><init>()V

    .line 363
    invoke-virtual {v2}, Ll/ۡᩳܽ;->᩺()Ljava/lang/Iterable;

    move-result-object v8

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/۠ܿܽ;

    .line 364
    invoke-virtual {v9}, Ll/۠ᩳܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v9

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩶ܿܽ;

    .line 365
    invoke-virtual {v10}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v11

    const-string v12, "string"

    .line 366
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    const-string v12, "array"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    const-string v12, "plurals"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    .line 367
    :cond_4
    invoke-virtual {v10}, Ll/ۤᩳܽ;->ۢ()Ljava/lang/Iterable;

    move-result-object v10

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۖܿܽ;

    .line 368
    invoke-virtual {v11}, Ll/ۜᩳܽ;->۟()Ll/᩸ܽܽ;

    move-result-object v12

    invoke-virtual {v12}, Ll/᩸ܽܽ;->ܽ()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5}, Ll/۠֫ᩳ;->ᩳ()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    .line 369
    invoke-virtual {v11}, Ll/ۜᩳܽ;->ᩳ()Ljava/lang/Iterable;

    move-result-object v11

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_5

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ᩴܿܽ;

    .line 370
    invoke-virtual {v12}, Ll/᩷ᩳܽ;->ۧ֫()I

    move-result v13

    invoke-virtual {v7, v13, v12}, Ll/۬᩵;->ܽ(ILjava/lang/Object;)V

    goto :goto_1

    .line 377
    :cond_6
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_7
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܶ֫ᩳ;

    .line 378
    iget v9, v8, Ll/ܶ֫ᩳ;->֫:I

    .line 109
    invoke-virtual {v7, v9, v6}, Ll/۬᩵;->֫(ILjava/lang/Integer;)Ljava/lang/Object;

    move-result-object v9

    .line 378
    check-cast v9, Ll/ᩴܿܽ;

    .line 379
    invoke-static {v9}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget v10, v8, Ll/ܶ֫ᩳ;->ܿ:I

    invoke-virtual {v9, v10}, Ll/ᩴܿܽ;->getValue(I)Ll/ۙܿܽ;

    move-result-object v9

    .line 380
    iget-object v10, v8, Ll/ܶ֫ᩳ;->ᩳ:Ljava/lang/String;

    if-eqz v10, :cond_8

    .line 381
    invoke-static {v10}, Ll/᩹֫ᩳ;->֫(Ljava/lang/String;)Ll/᩹֫ᩳ;

    move-result-object v8

    .line 382
    invoke-virtual {v8}, Ll/᩹֫ᩳ;->ۧ()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8}, Ll/᩹֫ᩳ;->֫()[Ll/᩸᩻ܽ;

    move-result-object v8

    invoke-virtual {v9, v10, v8}, Ll/ۙܿܽ;->֫(Ljava/lang/String;[Ll/᩸᩻ܽ;)V

    goto :goto_2

    .line 383
    :cond_8
    invoke-virtual {v9}, Ll/ۙܿܽ;->ܿۧ()Ll/ۗܿܽ;

    move-result-object v10

    invoke-virtual {v10}, Ll/ۗܿܽ;->getValue()Ljava/lang/String;

    move-result-object v10

    iget-object v11, v8, Ll/ܶ֫ᩳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_7

    .line 384
    iget-object v8, v8, Ll/ܶ֫ᩳ;->ۧ:Ljava/lang/String;

    invoke-static {v8}, Ll/᩹֫ᩳ;->֫(Ljava/lang/String;)Ll/᩹֫ᩳ;

    move-result-object v8

    .line 385
    invoke-virtual {v8}, Ll/᩹֫ᩳ;->ۧ()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8}, Ll/᩹֫ᩳ;->֫()[Ll/᩸᩻ܽ;

    move-result-object v8

    invoke-virtual {v9, v10, v8}, Ll/ۙܿܽ;->֫(Ljava/lang/String;[Ll/᩸᩻ܽ;)V

    goto :goto_2

    .line 389
    :cond_9
    invoke-static {v3}, Ll/֨֫ᩳ;->ۧ(Ll/֨֫ᩳ;)Ll/ۙۢ;

    move-result-object v4

    invoke-virtual {v4}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v4

    if-eqz v4, :cond_19

    .line 390
    invoke-static {v3}, Ll/֨֫ᩳ;->ܳ(Ll/֨֫ᩳ;)Ljava/util/HashMap;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v4

    .line 117
    invoke-virtual {v2}, Ll/ۡܿܽ;->ۧ()Ll/۠ܿܽ;

    move-result-object v5

    if-eqz v5, :cond_a

    goto :goto_4

    :cond_a
    const/16 v5, 0x17

    :goto_3
    const/16 v7, 0x26

    if-ge v5, v7, :cond_18

    .line 122
    :try_start_0
    invoke-virtual {v2, v5, v0}, Ll/ۡܿܽ;->֫(ILjava/lang/String;)Ll/۠ܿܽ;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 133
    :goto_4
    invoke-virtual {v5}, Ll/۠ᩳܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v7, v6

    move-object v8, v7

    :cond_b
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩶ܿܽ;

    .line 134
    invoke-virtual {v9}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v10

    const-string v11, "a"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    move-object v7, v9

    goto :goto_5

    .line 136
    :cond_c
    invoke-virtual {v9}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v10

    const-string v11, "b"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    move-object v8, v9

    goto :goto_5

    :cond_d
    if-eqz v7, :cond_e

    .line 141
    invoke-virtual {v7}, Ll/ۤᩳܽ;->ۘ֫()I

    move-result v0

    invoke-virtual {v5, v0}, Ll/۠ܿܽ;->֫(I)V

    :cond_e
    if-eqz v8, :cond_f

    .line 143
    invoke-virtual {v8}, Ll/ۤᩳܽ;->ۘ֫()I

    move-result v0

    invoke-virtual {v5, v0}, Ll/۠ܿܽ;->֫(I)V

    .line 92
    :cond_f
    invoke-virtual {v5}, Ll/۠ᩳܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩶ܿܽ;

    .line 93
    invoke-virtual {v7}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v8

    const-string v9, "c"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_10

    goto :goto_6

    :cond_11
    move-object v7, v6

    :goto_6
    if-nez v7, :cond_12

    .line 99
    invoke-virtual {v5}, Ll/۠ܿܽ;->᩶()Ll/᩶ܿܽ;

    move-result-object v7

    .line 100
    :cond_12
    invoke-virtual {v7}, Ll/᩶ܿܽ;->ܳ()V

    .line 102
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_17

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/۠֫ᩳ;

    .line 147
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 148
    invoke-virtual {v8}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_13
    :goto_8
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_14

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ܶ֫ᩳ;

    .line 149
    iget-object v12, v11, Ll/ܶ֫ᩳ;->ᩳ:Ljava/lang/String;

    if-eqz v12, :cond_13

    .line 150
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 153
    :cond_14
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_15

    goto :goto_a

    .line 156
    :cond_15
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-virtual {v7, v5}, Ll/᩶ܿܽ;->ᩳ(I)V

    .line 160
    :try_start_1
    invoke-virtual {v8}, Ll/۠֫ᩳ;->ᩳ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ll/᩶ܿܽ;->ۧ(Ljava/lang/String;)Ll/ۖܿܽ;

    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v8, 0x0

    .line 165
    :goto_9
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v10

    const/4 v11, 0x1

    if-ge v8, v10, :cond_16

    .line 166
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܶ֫ᩳ;

    const-string v12, "_"

    .line 102
    invoke-virtual {v7, v8, v12, v4}, Ll/᩶ܿܽ;->֫(ILjava/lang/String;Z)V

    .line 168
    invoke-virtual {v5, v8}, Ll/ۖܿܽ;->֫(I)Ll/ᩴܿܽ;

    move-result-object v4

    .line 169
    invoke-virtual {v4, v11}, Ll/ᩴܿܽ;->ۧ(Z)V

    .line 170
    iget v11, v10, Ll/ܶ֫ᩳ;->֫:I

    invoke-virtual {v4, v11}, Ll/ᩴܿܽ;->֡(I)V

    .line 171
    iget-object v11, v10, Ll/ܶ֫ᩳ;->ۧ:Ljava/lang/String;

    invoke-static {v11}, Ll/᩹֫ᩳ;->֫(Ljava/lang/String;)Ll/᩹֫ᩳ;

    move-result-object v11

    .line 172
    iget-object v12, v10, Ll/ܶ֫ᩳ;->ᩳ:Ljava/lang/String;

    invoke-static {v12}, Ll/᩹֫ᩳ;->֫(Ljava/lang/String;)Ll/᩹֫ᩳ;

    move-result-object v12

    .line 173
    invoke-virtual {v11}, Ll/᩹֫ᩳ;->ۧ()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11}, Ll/᩹֫ᩳ;->֫()[Ll/᩸᩻ܽ;

    move-result-object v11

    const/4 v14, -0x1

    .line 112
    invoke-virtual {v4, v13, v11, v14}, Ll/ᩴܿܽ;->֫(Ljava/lang/String;[Ll/᩸᩻ܽ;I)Ll/ۙܿܽ;

    move-result-object v11

    .line 173
    iget v13, v10, Ll/ܶ֫ᩳ;->ܿ:I

    invoke-virtual {v11, v13}, Ll/ۙܿܽ;->ᩳ(I)V

    .line 174
    invoke-virtual {v12}, Ll/᩹֫ᩳ;->ۧ()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v12}, Ll/᩹֫ᩳ;->֫()[Ll/᩸᩻ܽ;

    move-result-object v12

    .line 112
    invoke-virtual {v4, v11, v12, v14}, Ll/ᩴܿܽ;->֫(Ljava/lang/String;[Ll/᩸᩻ܽ;I)Ll/ۙܿܽ;

    move-result-object v4

    .line 174
    iget v10, v10, Ll/ܶ֫ᩳ;->ܿ:I

    invoke-virtual {v4, v10}, Ll/ۙܿܽ;->ᩳ(I)V

    add-int/lit8 v8, v8, 0x1

    const/4 v4, 0x0

    goto :goto_9

    :cond_16
    const/4 v4, 0x1

    const/4 v5, 0x1

    :goto_a
    const/4 v4, 0x0

    goto/16 :goto_7

    :catch_0
    move-exception v0

    .line 162
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_17
    if-nez v5, :cond_1a

    .line 108
    invoke-virtual {v2}, Ll/ۡܿܽ;->ۜ()V

    goto :goto_b

    :catch_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_3

    .line 127
    :cond_18
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "This should not happen"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 113
    :cond_19
    invoke-virtual {v2}, Ll/ۡܿܽ;->ۜ()V

    .line 394
    :cond_1a
    :goto_b
    invoke-virtual {v2}, Ll/ۡܿܽ;->ۡ()V

    .line 236
    invoke-virtual {v2, v1, v6}, Ll/ۡܿܽ;->֫(Ll/ۙۜܽ;Ll/᩵ۛۡ;)V

    .line 396
    invoke-static {v3}, Ll/֨֫ᩳ;->ᩳ(Ll/֨֫ᩳ;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 975
    new-instance v2, Ll/ܺ᩵ܿ;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v1}, Ll/ܺ᩵ܿ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Ll/ܶ᩵ܿ;->֫(Ll/۬֡ܿ;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 417
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
