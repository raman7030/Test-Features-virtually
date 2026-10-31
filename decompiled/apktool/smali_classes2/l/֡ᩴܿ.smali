.class public final Ll/֡ᩴܿ;
.super Ljava/lang/Object;
.source "N15M"


# instance fields
.field public final ֫:Ll/ۗܺ᩷;

.field public ۧ:Ljava/lang/Object;

.field public final ܳ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public ܽ:Z

.field public ܿ:Ll/᩵᩷ᩳ;

.field public ᩳ:I

.field public final ᩻:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;)V
    .locals 1

    const-string v0, "activity"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ᩴܿ;->֫:Ll/ۗܺ᩷;

    const/4 v0, -0x1

    .line 38
    iput v0, p0, Ll/֡ᩴܿ;->ᩳ:I

    .line 39
    sget-object v0, Ll/ۡܶ᩵;->᩸:Ll/ۡܶ᩵;

    iput-object v0, p0, Ll/֡ᩴܿ;->ۧ:Ljava/lang/Object;

    .line 41
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Ll/֡ᩴܿ;->᩻:Ljava/util/Set;

    .line 42
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/֡ᩴܿ;->ܳ:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x1

    .line 45
    iput-boolean v0, p0, Ll/֡ᩴܿ;->ܽ:Z

    .line 382
    invoke-virtual {p1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    new-instance v0, Ll/᩻ᩴܿ;

    invoke-direct {v0, p0}, Ll/᩻ᩴܿ;-><init>(Ll/֡ᩴܿ;)V

    invoke-virtual {p1, v0}, Ll/۟ۢ֫;->֫(Ll/ܳۡ֫;)V

    return-void
.end method

.method public static final synthetic ֫(Ll/֡ᩴܿ;)Ll/ۗܺ᩷;
    .locals 0

    .line 37
    iget-object p0, p0, Ll/֡ᩴܿ;->֫:Ll/ۗܺ᩷;

    return-object p0
.end method

.method public static ֫(Landroid/widget/TextView;Ll/۫ۨᩳ;Ll/֡ۚۢ;Ll/֡ᩴܿ;Ll/᩵ᩴܿ;Landroid/view/MenuItem;)V
    .locals 1

    .line 183
    iget-object p3, p3, Ll/֡ᩴܿ;->֫:Ll/ۗܺ᩷;

    invoke-interface {p5}, Landroid/view/MenuItem;->getItemId()I

    move-result p5

    const v0, 0x7f1201fe

    if-ne p5, v0, :cond_0

    .line 184
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const v0, 0x7f120899

    if-ne p5, v0, :cond_2

    .line 186
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۨۧ()Z

    move-result p3

    if-nez p3, :cond_1

    .line 187
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll/۫ۨᩳ;->֫(Ljava/lang/String;)V

    .line 189
    :cond_1
    invoke-virtual {p2}, Ll/֡ۚۢ;->dismiss()V

    goto :goto_0

    :cond_2
    const p0, 0x7f12076f

    if-ne p5, p0, :cond_3

    .line 192
    new-instance p0, Landroid/content/Intent;

    .line 194
    const-class p1, Ll/᩺ܿ᩷;

    .line 192
    invoke-direct {p0, p3, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 191
    invoke-virtual {p3, p0}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :cond_3
    const p0, 0x7f1202a6

    if-ne p5, p0, :cond_4

    .line 198
    new-instance p0, Landroid/content/Intent;

    const-class p1, Ll/᩶᩶ܽ;

    invoke-direct {p0, p3, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 199
    invoke-virtual {p3, p0}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :cond_4
    const p0, 0x7f12044e

    if-ne p5, p0, :cond_5

    .line 201
    new-instance p0, Ll/ܽۨܺ;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ll/ܽۨܺ;-><init>(ILjava/lang/Object;)V

    invoke-static {p3, p0}, Ll/֫۟ܽ;->֫(Ll/ۗܺ᩷;Ljava/lang/Runnable;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public static final synthetic ֫(Ll/֡ᩴܿ;I)V
    .locals 0

    .line 37
    iput p1, p0, Ll/֡ᩴܿ;->ᩳ:I

    return-void
.end method

.method public static final synthetic ֫(Ll/֡ᩴܿ;Ljava/util/ArrayList;)V
    .locals 0

    .line 37
    iput-object p1, p0, Ll/֡ᩴܿ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ll/֡ᩴܿ;Ll/᩺ۢ֫;)V
    .locals 3

    .line 383
    sget-object v0, Ll/᩺ۢ֫;->۫:Ll/᩺ۢ֫;

    if-ne p1, v0, :cond_5

    .line 384
    iget p1, p0, Ll/֡ᩴܿ;->ᩳ:I

    iget-object v0, p0, Ll/֡ᩴܿ;->᩻:Ljava/util/Set;

    invoke-static {}, Ll/۬ܿ᩷;->ܽ()I

    move-result v1

    const-string v2, "translatorBinders"

    if-eq p1, v1, :cond_3

    .line 317
    invoke-static {}, Ll/᩺᩵ۡ;->ۘ()Z

    move-result p1

    if-nez p1, :cond_0

    .line 318
    sget-object p1, Ll/ۡܶ᩵;->᩸:Ll/ۡܶ᩵;

    iput-object p1, p0, Ll/֡ᩴܿ;->ۧ:Ljava/lang/Object;

    const/4 p1, -0x1

    .line 319
    iput p1, p0, Ll/֡ᩴܿ;->ᩳ:I

    return-void

    .line 322
    :cond_0
    iget p1, p0, Ll/֡ᩴܿ;->ᩳ:I

    invoke-static {}, Ll/۬ܿ᩷;->ܽ()I

    move-result v1

    if-ne p1, v1, :cond_2

    .line 323
    invoke-static {v0, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1915
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗᩴܿ;

    if-eqz p1, :cond_1

    .line 323
    invoke-virtual {p1}, Ll/ۗᩴܿ;->֫()V

    goto :goto_0

    .line 326
    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 327
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 328
    new-instance v1, Ll/ۖᩴܿ;

    invoke-direct {v1, p0, v0, p1}, Ll/ۖᩴܿ;-><init>(Ll/֡ᩴܿ;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 378
    invoke-virtual {v1}, Ll/۟ܶۡ;->᩻()V

    return-void

    .line 387
    :cond_3
    invoke-static {v0, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1915
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_4
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗᩴܿ;

    if-eqz p1, :cond_4

    .line 387
    invoke-virtual {p1}, Ll/ۗᩴܿ;->֫()V

    goto :goto_1

    :cond_5
    return-void
.end method

.method public static ֫(Ll/᩵ᩴܿ;Ll/᩻᩶᩵;Ll/֡ᩴܿ;Ll/᩻᩶᩵;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ProgressBar;Ll/֡ۚۢ;)V
    .locals 11

    move-object v0, p2

    .line 149
    invoke-virtual {p0}, Ll/ۗᩴܿ;->ܽ()Ll/۬ᩴܿ;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v0, "Error"

    .line 151
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return-void

    .line 153
    :cond_0
    invoke-interface {v1}, Ll/۬ᩴܿ;->getId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getId(...)"

    invoke-static {v2, v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p1

    iput-object v2, v3, Ll/᩻᩶᩵;->᩸:Ljava/lang/Object;

    .line 154
    new-instance v10, Ll/ܺᩴܿ;

    .line 156
    iget-object v2, v0, Ll/֡ᩴܿ;->ܳ:Ljava/util/concurrent/atomic/AtomicInteger;

    move-object v3, p3

    .line 157
    iget-object v3, v3, Ll/᩻᩶᩵;->᩸:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    .line 158
    iget-object v4, v0, Ll/֡ᩴܿ;->֫:Ll/ۗܺ᩷;

    .line 159
    invoke-static {p4}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 160
    invoke-static/range {p5 .. p5}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 161
    invoke-static/range {p6 .. p6}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 162
    invoke-static/range {p7 .. p7}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 163
    invoke-virtual/range {p8 .. p8}, Ll/֡ۚۢ;->ܽ()Landroid/widget/Button;

    move-result-object v9

    const-string v0, "getNegativeButton(...)"

    invoke-static {v9, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v10

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    .line 154
    invoke-direct/range {v0 .. v9}, Ll/ܺᩴܿ;-><init>(Ll/۬ᩴܿ;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/lang/String;Ll/ۗܺ᩷;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Landroid/widget/Button;)V

    .line 164
    invoke-virtual {v10}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public static final synthetic ۧ(Ll/֡ᩴܿ;)Ljava/util/List;
    .locals 0

    .line 37
    iget-object p0, p0, Ll/֡ᩴܿ;->ۧ:Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic ܳ(Ll/֡ᩴܿ;)V
    .locals 1

    const/4 v0, 0x0

    .line 37
    iput-boolean v0, p0, Ll/֡ᩴܿ;->ܽ:Z

    return-void
.end method

.method public static final synthetic ܽ(Ll/֡ᩴܿ;)Ljava/lang/Runnable;
    .locals 0

    .line 37
    iget-object p0, p0, Ll/֡ᩴܿ;->ܿ:Ll/᩵᩷ᩳ;

    return-object p0
.end method

.method public static final synthetic ܿ(Ll/֡ᩴܿ;)Ljava/util/Set;
    .locals 0

    .line 37
    iget-object p0, p0, Ll/֡ᩴܿ;->᩻:Ljava/util/Set;

    return-object p0
.end method

.method public static final synthetic ᩳ(Ll/֡ᩴܿ;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 37
    iget-object p0, p0, Ll/֡ᩴܿ;->ܳ:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static final synthetic ᩻(Ll/֡ᩴܿ;)V
    .locals 1

    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Ll/֡ᩴܿ;->ܿ:Ll/᩵᩷ᩳ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ۨᩳ;)V
    .locals 29

    move-object/from16 v10, p0

    .line 50
    invoke-static {}, Ll/᩺᩵ۡ;->ۘ()Z

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x7f120415

    .line 51
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 54
    :cond_0
    iget-boolean v0, v10, Ll/֡ᩴܿ;->ܽ:Z

    if-eqz v0, :cond_1

    .line 55
    new-instance v0, Ll/᩵᩷ᩳ;

    const/4 v1, 0x2

    move-object/from16 v9, p1

    invoke-direct {v0, v1, v10, v9}, Ll/᩵᩷ᩳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, v10, Ll/֡ᩴܿ;->ܿ:Ll/᩵᩷ᩳ;

    return-void

    :cond_1
    move-object/from16 v9, p1

    .line 44
    iget-object v0, v10, Ll/֡ᩴܿ;->ۧ:Ljava/lang/Object;

    .line 1807
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    iget-object v15, v10, Ll/֡ᩴܿ;->֫:Ll/ۗܺ᩷;

    if-eqz v1, :cond_3

    :cond_2
    move-object v9, v15

    goto/16 :goto_1

    .line 1808
    :cond_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ᩴܿ;

    .line 44
    instance-of v1, v1, Ll/֫ᩴܿ;

    if-eqz v1, :cond_5

    .line 65
    invoke-virtual/range {p1 .. p1}, Ll/۫ۨᩳ;->ۗ֫()[I

    move-result-object v0

    const/4 v1, 0x1

    .line 66
    aget v2, v0, v1

    const/4 v3, 0x0

    aget v4, v0, v3

    sub-int/2addr v2, v4

    const/16 v5, 0x2710

    if-le v2, v5, :cond_4

    add-int/2addr v4, v5

    .line 67
    aput v4, v0, v1

    .line 69
    :cond_4
    new-instance v12, Ll/᩻᩶᩵;

    move-object v11, v12

    .line 13
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 69
    invoke-virtual/range {p1 .. p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    const-string v4, "getText(...)"

    invoke-static {v2, v4}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    aget v3, v0, v3

    aget v0, v0, v1

    invoke-interface {v2, v3, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v12, Ll/᩻᩶᩵;->᩸:Ljava/lang/Object;

    const v0, 0x7f0d00a3

    .line 70
    invoke-virtual {v15, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a017f

    .line 71
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Landroid/widget/TextView;

    move-object v14, v13

    const v1, 0x7f0a064f

    .line 72
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroid/widget/TextView;

    const v1, 0x7f0a064e

    .line 73
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/Spinner;

    move-object v1, v6

    const v2, 0x7f0a0650

    .line 74
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Landroid/widget/Spinner;

    move-object v3, v4

    const v2, 0x7f0a0651

    .line 75
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    move-object v5, v2

    const v7, 0x7f0a0287

    .line 76
    invoke-virtual {v0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    move-object/from16 v16, v2

    const v2, 0x7f0a02cd

    .line 77
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v17, v4

    const v4, -0xcacacb

    move-object/from16 v18, v6

    const v6, -0xf0f10

    .line 78
    invoke-static {v4, v6}, Ll/᩹֡᩷;->֫(II)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 80
    iget-object v4, v10, Ll/֡ᩴܿ;->ۧ:Ljava/lang/Object;

    new-instance v6, Ll/ᩴᩴܿ;

    move-object/from16 v9, v16

    move-object v2, v6

    invoke-direct {v6, v15, v4}, Ll/᩶ۡۡ;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 87
    new-instance v4, Ll/᩶ۡۡ;

    move-object/from16 v16, v4

    move-object/from16 v10, v17

    move-object/from16 v17, v12

    move-object/from16 v12, v16

    invoke-direct {v12, v15}, Ll/᩶ۡۡ;-><init>(Landroid/content/Context;)V

    move-object/from16 v16, v13

    .line 88
    new-instance v13, Ll/᩶ۡۡ;

    move-object/from16 v19, v1

    move-object/from16 v1, v18

    move-object/from16 v18, v2

    move-object v6, v13

    invoke-direct {v13, v15}, Ll/᩶ۡۡ;-><init>(Landroid/content/Context;)V

    .line 89
    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 90
    invoke-virtual {v10, v12}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 91
    invoke-virtual {v9, v13}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    const v1, 0x7f0a017d

    .line 93
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v20, v1

    check-cast v20, Landroid/widget/TextView;

    move-object/from16 v1, v16

    move-object/from16 v13, v20

    const v9, 0x7f0a017e

    .line 94
    invoke-virtual {v0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    move-object/from16 v21, v9

    check-cast v21, Landroid/widget/TextView;

    move-object/from16 v10, v17

    move-object/from16 v12, v21

    const v9, 0x7f0a0458

    .line 95
    invoke-virtual {v0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    move-object/from16 v17, v9

    check-cast v17, Landroid/widget/ProgressBar;

    move-object v9, v15

    move-object/from16 v15, v17

    .line 96
    invoke-virtual {v9}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v9

    invoke-virtual {v9, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v0, 0x7f120189

    move-object/from16 v22, v1

    const/4 v1, 0x0

    .line 97
    invoke-virtual {v9, v0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f1205f5

    .line 98
    invoke-virtual {v9, v0, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f120634

    .line 99
    invoke-virtual {v9, v0, v1}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 100
    invoke-virtual {v9}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object v1

    move-object/from16 v16, v1

    .line 102
    new-instance v0, Ll/᩻᩶᩵;

    move-object v9, v0

    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v23, v1

    const-string v1, ""

    .line 102
    iput-object v1, v0, Ll/᩻᩶᩵;->᩸:Ljava/lang/Object;

    .line 104
    new-instance v1, Ll/᩵ᩴܿ;

    move-object/from16 v24, v0

    move-object v0, v1

    move-object/from16 v25, v10

    move-object/from16 v10, p0

    move-object/from16 v28, v1

    move-object/from16 v27, v2

    move-object/from16 v1, v19

    move-object/from16 v26, v22

    invoke-direct/range {v0 .. v16}, Ll/᩵ᩴܿ;-><init>(Landroid/widget/Spinner;Ll/ᩴᩴܿ;Landroid/widget/Spinner;Ll/᩶ۡۡ;Landroid/widget/Spinner;Ll/᩶ۡۡ;Landroid/view/View;Landroid/widget/TextView;Ll/᩻᩶᩵;Ll/֡ᩴܿ;Ll/᩻᩶᩵;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ProgressBar;Ll/֡ۚۢ;)V

    .line 145
    iget-object v0, v10, Ll/֡ᩴܿ;->᩻:Ljava/util/Set;

    move-object/from16 v11, v28

    invoke-interface {v0, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 146
    invoke-virtual/range {v23 .. v23}, Ll/֡ۚۢ;->᩷()V

    .line 147
    invoke-static/range {v23 .. v23}, Ll/ۡܶۡ;->ۧ(Ll/֡ۚۢ;)V

    .line 148
    invoke-virtual/range {v23 .. v23}, Ll/֡ۚۢ;->ܽ()Landroid/widget/Button;

    move-result-object v12

    new-instance v13, Ll/ۜᩴܿ;

    move-object v0, v13

    move-object v1, v11

    move-object/from16 v2, v24

    move-object/from16 v3, p0

    move-object/from16 v4, v25

    move-object/from16 v5, v21

    move-object/from16 v6, v20

    move-object/from16 v7, v26

    move-object/from16 v8, v17

    move-object/from16 v9, v23

    invoke-direct/range {v0 .. v9}, Ll/ۜᩴܿ;-><init>(Ll/᩵ᩴܿ;Ll/᩻᩶᩵;Ll/֡ᩴܿ;Ll/᩻᩶᩵;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ProgressBar;Ll/֡ۚۢ;)V

    invoke-virtual {v12, v13}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 167
    invoke-virtual/range {v23 .. v23}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v6

    new-instance v7, Ll/᩷ᩴܿ;

    move-object v0, v7

    move-object/from16 v1, v20

    move-object/from16 v2, p1

    move-object v3, v11

    move-object/from16 v4, p0

    move-object/from16 v5, v23

    invoke-direct/range {v0 .. v5}, Ll/᩷ᩴܿ;-><init>(Landroid/widget/TextView;Ll/۫ۨᩳ;Ll/᩵ᩴܿ;Ll/֡ᩴܿ;Ll/֡ۚۢ;)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 209
    new-instance v0, Ll/ۢᩴܿ;

    const/4 v1, 0x0

    move-object/from16 v4, v23

    move-object/from16 v2, v25

    move-object/from16 v3, v26

    invoke-direct {v0, v2, v3, v4, v1}, Ll/ۢᩴܿ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll/֡ۚۢ;I)V

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 216
    new-instance v0, Ll/ۘᩴܿ;

    invoke-direct {v0, v10, v4}, Ll/ۘᩴܿ;-><init>(Ll/֡ᩴܿ;Ll/֡ۚۢ;)V

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Landroid/widget/BaseAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    return-void

    :cond_5
    move-object/from16 v9, p1

    goto/16 :goto_0

    :goto_1
    const v0, 0x7f120a94

    .line 61
    invoke-static {v0}, Ll/᩸ۚۢ;->ۧ(I)V

    .line 62
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/᩺ܿ᩷;

    invoke-direct {v0, v9, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v9, v0}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
