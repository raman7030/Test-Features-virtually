.class public final synthetic Ll/ۨ۫ᩳ;
.super Ljava/lang/Object;
.source "28WH"

# interfaces
.implements Ll/۬ۤ;


# instance fields
.field public final synthetic ֫:Ll/᩺۫ᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/᩺۫ᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨ۫ᩳ;->֫:Ll/᩺۫ᩳ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 16

    .line 4
    move-object/from16 v0, p1

    check-cast v0, Ll/۫ۨᩳ;

    move-object/from16 v1, p0

    .line 2386
    iget-object v0, v1, Ll/ۨ۫ᩳ;->֫:Ll/᩺۫ᩳ;

    iget-object v2, v0, Ll/᩺۫ᩳ;->ۙ:Ll/۟۫ᩳ;

    iget-object v3, v0, Ll/᩺۫ᩳ;->᩹:Ll/۫ۨᩳ;

    iget-boolean v4, v0, Ll/᩺۫ᩳ;->᩶:Z

    iget-object v0, v0, Ll/᩺۫ᩳ;->᩸:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۨۧ()Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_1

    .line 2389
    :cond_0
    invoke-virtual {v3}, Ll/۫ۨᩳ;->ۗ֫()[I

    move-result-object v5

    .line 2390
    new-instance v6, Ll/ܺۢᩴ;

    invoke-direct {v6}, Ll/ܺۢᩴ;-><init>()V

    .line 2391
    new-instance v7, Ll/ܺۢᩴ;

    invoke-direct {v7}, Ll/ܺۢᩴ;-><init>()V

    .line 2392
    invoke-static {v2}, Ll/۟۫ᩳ;->ᩳ(Ll/۟۫ᩳ;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eqz v9, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/֡ܳۘ;

    .line 2393
    invoke-interface {v9, v4}, Ll/ᩴܳۘ;->֫(Z)I

    move-result v12

    .line 2394
    invoke-interface {v9, v4}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result v13

    .line 2395
    aget v10, v5, v10

    aget v11, v5, v11

    if-ge v12, v11, :cond_3

    if-ge v10, v13, :cond_3

    xor-int/lit8 v10, v4, 0x1

    .line 2396
    invoke-interface {v9, v10}, Ll/ᩴܳۘ;->֫(Z)I

    move-result v11

    .line 2397
    invoke-interface {v9, v10}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result v14

    .line 2398
    invoke-interface {v9, v4}, Ll/֡ܳۘ;->ۧ(Z)I

    move-result v15

    invoke-interface {v9, v4}, Ll/֡ܳۘ;->ᩳ(Z)I

    move-result v1

    if-ne v15, v1, :cond_1

    invoke-virtual {v3}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ne v13, v1, :cond_1

    if-lez v11, :cond_1

    add-int/lit8 v11, v11, -0x1

    .line 2401
    :cond_1
    invoke-interface {v9, v10}, Ll/֡ܳۘ;->ۧ(Z)I

    move-result v1

    invoke-interface {v9, v10}, Ll/֡ܳۘ;->ᩳ(Z)I

    move-result v9

    if-ne v1, v9, :cond_2

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ne v14, v1, :cond_2

    if-lez v12, :cond_2

    add-int/lit8 v12, v12, -0x1

    .line 2404
    :cond_2
    invoke-virtual {v6, v12}, Ll/ܺۢᩴ;->add(I)Z

    .line 2405
    invoke-virtual {v6, v13}, Ll/ܺۢᩴ;->add(I)Z

    .line 2406
    invoke-virtual {v7, v11}, Ll/ܺۢᩴ;->add(I)Z

    .line 2407
    invoke-virtual {v7, v14}, Ll/ܺۢᩴ;->add(I)Z

    :cond_3
    move-object/from16 v1, p0

    goto :goto_0

    .line 2410
    :cond_4
    invoke-virtual {v6}, Ll/ܺۢᩴ;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    :goto_1
    return-void

    :cond_5
    const/4 v1, 0x0

    .line 2413
    invoke-virtual {v6, v1}, Ll/ܺۢᩴ;->ܽ(Ll/ۙۢᩴ;)V

    .line 2414
    invoke-virtual {v7, v1}, Ll/ܺۢᩴ;->ܽ(Ll/ۙۢᩴ;)V

    .line 2415
    invoke-virtual {v6, v10}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v1

    .line 2416
    invoke-virtual {v6}, Ll/ܺۢᩴ;->size()I

    move-result v5

    sub-int/2addr v5, v11

    invoke-virtual {v6, v5}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v5

    .line 2417
    invoke-virtual {v7, v10}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v6

    .line 2418
    invoke-virtual {v7}, Ll/ܺۢᩴ;->size()I

    move-result v8

    sub-int/2addr v8, v11

    invoke-virtual {v7, v8}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v7

    .line 2419
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v8

    invoke-virtual {v3}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v9

    invoke-interface {v9, v1, v5}, Ll/᩶᩸ᩳ;->ۧ(II)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v8, v6, v7, v1}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 2420
    invoke-virtual {v3}, Ll/۫ۨᩳ;->۫֫()I

    move-result v1

    invoke-virtual {v3}, Ll/۫ۨᩳ;->۬֫()I

    move-result v3

    invoke-static {v2, v4, v1, v3}, Ll/۟۫ᩳ;->֫(Ll/۟۫ᩳ;ZII)V

    .line 2421
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    return-void
.end method
