.class public final Ll/ܽ᩶᩻;
.super Ll/ۚ۠ܳ;
.source "J1YX"


# instance fields
.field public final synthetic ֫֫:Ll/ۖۢܳ;

.field public final synthetic ۟:Ljava/lang/String;

.field public final synthetic ۧ֫:Ll/ܶ᩵ܿ;

.field public final synthetic ۨ:Z

.field public final synthetic ܰ:Lbin/mt/plus/Main;

.field public final synthetic ܽ֫:Ll/ۧۗ᩻;

.field public final synthetic ᩺:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/᩻᩶᩻;Lbin/mt/plus/Main;Ljava/util/ArrayList;Ll/ۖۢܳ;Ljava/util/ArrayList;Lbin/mt/plus/Main;Ll/ۧۗ᩻;ZLjava/lang/String;Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 329
    iput-object p4, p0, Ll/ܽ᩶᩻;->֫֫:Ll/ۖۢܳ;

    iput-object p5, p0, Ll/ܽ᩶᩻;->᩺:Ljava/util/ArrayList;

    iput-object p6, p0, Ll/ܽ᩶᩻;->ܰ:Lbin/mt/plus/Main;

    iput-object p7, p0, Ll/ܽ᩶᩻;->ܽ֫:Ll/ۧۗ᩻;

    iput-boolean p8, p0, Ll/ܽ᩶᩻;->ۨ:Z

    iput-object p9, p0, Ll/ܽ᩶᩻;->۟:Ljava/lang/String;

    iput-object p10, p0, Ll/ܽ᩶᩻;->ۧ֫:Ll/ܶ᩵ܿ;

    const/4 p1, 0x0

    invoke-direct {p0, p2, p3, p1, p1}, Ll/ۚ۠ܳ;-><init>(Ll/ۗܺ᩷;Ljava/util/ArrayList;ZZ)V

    return-void
.end method

.method private synthetic ֫(Ljava/util/ArrayList;Ljava/util/ArrayList;Ll/ۧۗ᩻;ZLl/ۖۢܳ;Ljava/lang/String;Ll/ܶ᩵ܿ;)V
    .locals 10

    .line 369
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 370
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 371
    invoke-interface {v2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 373
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 374
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜۤܳ;

    .line 375
    invoke-virtual {v3}, Ll/ۜۤܳ;->ܽ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    if-ne v5, v6, :cond_1

    const/4 v5, 0x1

    goto :goto_2

    :cond_1
    const/4 v5, 0x0

    .line 376
    :goto_2
    new-instance v6, Ll/ᩳ᩶᩻;

    invoke-virtual {v3}, Ll/ۜۤܳ;->ܽ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3}, Ll/ۜۤܳ;->ۧ()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v6, v7, v3, v5, v4}, Ll/ᩳ᩶᩻;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 378
    :cond_2
    invoke-virtual {p0}, Ll/ۚ۠ܳ;->᩷()V

    .line 379
    invoke-virtual {p3}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    if-eqz p4, :cond_3

    .line 381
    invoke-virtual {p5}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v2

    new-instance v3, Ll/ۧ᩶᩻;

    move-object v4, v3

    move-object v5, p0

    move-object v6, p5

    move-object/from16 v7, p7

    move-object v8, v0

    move-object v9, v1

    invoke-direct/range {v4 .. v9}, Ll/ۧ᩶᩻;-><init>(Ll/ܽ᩶᩻;Ll/ۖۢܳ;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/util/ArrayList;)V

    move-object/from16 v0, p6

    invoke-static {v3, v2, v0}, Ll/ۤۗܳ;->֫(Ll/۬ۗܳ;Ll/ۗܺ᩷;Ljava/lang/String;)V

    return-void

    .line 386
    :cond_3
    invoke-virtual {p0}, Ll/ۚ۠ܳ;->֫()V

    .line 387
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object p1, p5

    move-object/from16 p2, p7

    move-object p3, v0

    move-object p4, v1

    move-object p5, v2

    move/from16 p6, v3

    invoke-static/range {p1 .. p6}, Ll/᩻᩶᩻;->֫(Ll/ۖۢܳ;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/util/List;Ll/ۨۧᩳ;Z)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܽ᩶᩻;Ljava/util/ArrayList;Ljava/util/ArrayList;Ll/ۧۗ᩻;ZLl/ۖۢܳ;Ljava/lang/String;Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 0
    invoke-direct/range {p0 .. p7}, Ll/ܽ᩶᩻;->֫(Ljava/util/ArrayList;Ljava/util/ArrayList;Ll/ۧۗ᩻;ZLl/ۖۢܳ;Ljava/lang/String;Ll/ܶ᩵ܿ;)V

    return-void
.end method


# virtual methods
.method public final ۜ()V
    .locals 16

    move-object/from16 v9, p0

    .line 333
    invoke-virtual/range {p0 .. p0}, Ll/ۚ۠ܳ;->ܳ()Ljava/lang/String;

    move-result-object v6

    .line 334
    invoke-virtual/range {p0 .. p0}, Ll/ۚ۠ܳ;->ܿ()Ljava/lang/String;

    move-result-object v2

    .line 335
    invoke-virtual/range {p0 .. p0}, Ll/ۚ۠ܳ;->ᩳ()Ljava/lang/String;

    move-result-object v3

    .line 336
    iget-object v7, v9, Ll/ܽ᩶᩻;->֫֫:Ll/ۖۢܳ;

    invoke-virtual {v7}, Ll/ۖۢܳ;->ۧ()Ljava/util/List;

    move-result-object v0

    .line 337
    new-instance v8, Ll/֡ۤܳ;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v4, 0x1

    invoke-direct {v8, v1, v4}, Ll/֡ۤܳ;-><init>(IZ)V

    .line 338
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۜܳ;

    .line 339
    invoke-interface {v1}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result v4

    if-nez v4, :cond_0

    .line 340
    invoke-interface {v1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Ll/֡ۤܳ;->֫(Ljava/lang/String;)V

    goto :goto_0

    .line 343
    :cond_1
    invoke-virtual/range {p0 .. p0}, Ll/ۚ۠ܳ;->᩻()Z

    move-result v4

    .line 54
    sget-object v5, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iget-object v10, v9, Ll/ܽ᩶᩻;->᩺:Ljava/util/ArrayList;

    move-object v0, v10

    move-object v1, v6

    invoke-static/range {v0 .. v5}, Ll/᩷ۤܳ;->֫(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)Ljava/util/ArrayList;

    move-result-object v0

    .line 344
    invoke-static {v0}, Ll/᩷ۤܳ;->֫(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v3

    .line 345
    invoke-static {v8, v3}, Ll/᩷ۤܳ;->֫(Ll/֡ۤܳ;Ljava/util/ArrayList;)V

    .line 346
    new-instance v11, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v11, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 348
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜۤܳ;

    .line 349
    invoke-virtual {v2}, Ll/ۜۤܳ;->ᩳ()Z

    move-result v4

    if-nez v4, :cond_2

    const/4 v1, 0x1

    .line 352
    :cond_2
    invoke-virtual {v2}, Ll/ۜۤܳ;->֫()Landroid/text/Spanned;

    move-result-object v2

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    const v0, 0x7f0d00cc

    .line 354
    iget-object v2, v9, Ll/ܽ᩶᩻;->ܰ:Lbin/mt/plus/Main;

    invoke-virtual {v2, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v4, 0x7f0a0631

    .line 355
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    const v8, 0x7f12079c

    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setText(I)V

    const v5, 0x7f0a02e0

    .line 356
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ListView;

    .line 357
    invoke-static {v5}, Ll/ۙ᩸ۡ;->֫(Landroid/widget/ListView;)V

    .line 358
    new-instance v8, Ll/֫᩷ۡ;

    const v12, 0x7f0d01c5

    .line 200
    invoke-direct {v8, v12, v2, v11}, Ll/֫᩷ۡ;-><init>(ILandroid/content/Context;Ljava/util/List;)V

    .line 358
    invoke-virtual {v5, v8}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 359
    invoke-virtual {v2}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v12

    invoke-virtual {v12, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const-string v2, "{P}{S}"

    .line 360
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const v5, 0x7f120189

    const/4 v13, 0x0

    if-eqz v2, :cond_4

    invoke-virtual/range {p0 .. p0}, Ll/ۚ۠ܳ;->ܿ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 361
    invoke-virtual {v12, v5, v13}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    goto :goto_2

    :cond_4
    if-eqz v1, :cond_5

    .line 363
    invoke-virtual/range {p0 .. p0}, Ll/ۚ۠ܳ;->ۢ()V

    .line 364
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f12079d

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 365
    invoke-virtual {v12, v5, v13}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    goto :goto_2

    .line 367
    :cond_5
    invoke-virtual/range {p0 .. p0}, Ll/ۚ۠ܳ;->ۢ()V

    .line 368
    new-instance v14, Ll/֫᩶᩻;

    iget-object v4, v9, Ll/ܽ᩶᩻;->ܽ֫:Ll/ۧۗ᩻;

    iget-boolean v5, v9, Ll/ܽ᩶᩻;->ۨ:Z

    iget-object v8, v9, Ll/ܽ᩶᩻;->۟:Ljava/lang/String;

    iget-object v15, v9, Ll/ܽ᩶᩻;->ۧ֫:Ll/ܶ᩵ܿ;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object v2, v10

    move-object v6, v7

    move-object v7, v8

    move-object v8, v15

    invoke-direct/range {v0 .. v8}, Ll/֫᩶᩻;-><init>(Ll/ܽ᩶᩻;Ljava/util/ArrayList;Ljava/util/ArrayList;Ll/ۧۗ᩻;ZLl/ۖۢܳ;Ljava/lang/String;Ll/ܶ᩵ܿ;)V

    const v0, 0x7f1205f9

    invoke-virtual {v12, v0, v14}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    .line 389
    invoke-virtual {v12, v0, v13}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    :goto_2
    const v0, 0x7f1205c2

    .line 391
    invoke-virtual {v12, v0, v13}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 392
    invoke-virtual {v12}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ۧۤܿ;

    const/4 v2, 0x2

    invoke-direct {v1, v2, v11}, Ll/ۧۤܿ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
