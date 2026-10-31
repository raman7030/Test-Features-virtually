.class public final Ll/ܶ᩺ᩳ;
.super Ljava/lang/Object;
.source "G4ML"

# interfaces
.implements Ll/᩹᩺ᩳ;


# static fields
.field public static ۫:Z

.field public static final synthetic ۬:I


# instance fields
.field public final ֡:Landroid/view/View;

.field public ֨:Z

.field public final ֫:Ll/ۗܺ᩷;

.field public final ۖ:Ll/۬ۡۡ;

.field public ۗ:Landroid/view/MenuItem;

.field public final ۘ:Ljava/lang/String;

.field public final ۙ:Ll/۬ۡۡ;

.field public final ۚ:Landroid/view/View;

.field public final ۜ:Ll/ۚۖۡ;

.field public ۠:Ll/֨ۧܿ;

.field public final ۡ:Ll/۬ۡۡ;

.field public final ۢ:Ll/۬ۡۡ;

.field public final ۧ:Ll/۠᩺ᩳ;

.field public ܳ:Ll/ܰ᩺ᩳ;

.field public final ܶ:Landroid/view/View;

.field public final ܺ:Ll/۬ۡۡ;

.field public ܽ:Z

.field public final ܿ:Ll/֨᩷ۡ;

.field public final ᩳ:Ll/۫ۨᩳ;

.field public final ᩴ:Ll/۬ۡۡ;

.field public final ᩵:Landroid/view/View;

.field public final ᩶:Landroid/widget/TextView;

.field public final ᩷:Ll/ۚۖۡ;

.field public ᩸:Ll/֨ۚۢ;

.field public final ᩹:Landroid/widget/TextView;

.field public final ᩻:Ll/᩸᩺ᩳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 100
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "sesrt"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Ll/ܶ᩺ᩳ;->۫:Z

    return-void
.end method

.method public constructor <init>(Ll/ۗܺ᩷;Ll/۫ۨᩳ;Ljava/lang/String;Ll/۠᩺ᩳ;)V
    .locals 11

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    new-instance v0, Ll/֨ۚۢ;

    new-instance v1, Ll/۠ۢ֡;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, p0, v1}, Ll/֨ۚۢ;-><init>(Ljava/lang/Object;Ll/ۚۚۢ;)V

    iput-object v0, p0, Ll/ܶ᩺ᩳ;->᩸:Ll/֨ۚۢ;

    .line 111
    iput-object p1, p0, Ll/ܶ᩺ᩳ;->֫:Ll/ۗܺ᩷;

    .line 112
    iput-object p2, p0, Ll/ܶ᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    .line 113
    iput-object p3, p0, Ll/ܶ᩺ᩳ;->ۘ:Ljava/lang/String;

    .line 114
    new-instance v0, Ll/᩸᩺ᩳ;

    invoke-direct {v0, p1, p2}, Ll/᩸᩺ᩳ;-><init>(Ll/ۗܺ᩷;Ll/۫ۨᩳ;)V

    iput-object v0, p0, Ll/ܶ᩺ᩳ;->᩻:Ll/᩸᩺ᩳ;

    .line 115
    iput-object p4, p0, Ll/ܶ᩺ᩳ;->ۧ:Ll/۠᩺ᩳ;

    .line 116
    invoke-interface {p4}, Ll/۠᩺ᩳ;->֫()Landroid/view/View;

    move-result-object p4

    iput-object p4, p0, Ll/ܶ᩺ᩳ;->ܶ:Landroid/view/View;

    const v0, 0x7f0a04b5

    .line 117
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/ܶ᩺ᩳ;->ۚ:Landroid/view/View;

    const v0, 0x7f0a04ae

    .line 118
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/ܶ᩺ᩳ;->֡:Landroid/view/View;

    const v0, 0x7f0a04ad

    .line 119
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/ܶ᩺ᩳ;->᩵:Landroid/view/View;

    const v0, 0x7f0a018a

    .line 120
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۚۖۡ;

    iput-object v0, p0, Ll/ܶ᩺ᩳ;->᩷:Ll/ۚۖۡ;

    const v1, 0x7f0a0187

    .line 121
    invoke-virtual {p4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ۚۖۡ;

    iput-object v1, p0, Ll/ܶ᩺ᩳ;->ۜ:Ll/ۚۖۡ;

    const v2, 0x7f0a0598

    .line 123
    invoke-virtual {p4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/۬ۡۡ;

    iput-object v2, p0, Ll/ܶ᩺ᩳ;->ᩴ:Ll/۬ۡۡ;

    const v3, 0x7f0a058a

    .line 124
    invoke-virtual {p4, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Ll/۬ۡۡ;

    iput-object v3, p0, Ll/ܶ᩺ᩳ;->ۢ:Ll/۬ۡۡ;

    const v4, 0x7f0a059b

    .line 125
    invoke-virtual {p4, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Ll/۬ۡۡ;

    iput-object v4, p0, Ll/ܶ᩺ᩳ;->ۙ:Ll/۬ۡۡ;

    const v5, 0x7f0a0595

    .line 126
    invoke-virtual {p4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Ll/۬ۡۡ;

    iput-object v5, p0, Ll/ܶ᩺ᩳ;->ۡ:Ll/۬ۡۡ;

    const v6, 0x7f0a0597

    .line 127
    invoke-virtual {p4, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Ll/۬ۡۡ;

    iput-object v6, p0, Ll/ܶ᩺ᩳ;->ۖ:Ll/۬ۡۡ;

    const v7, 0x7f0a0596

    .line 128
    invoke-virtual {p4, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Ll/۬ۡۡ;

    iput-object v7, p0, Ll/ܶ᩺ᩳ;->ܺ:Ll/۬ۡۡ;

    const v8, 0x7f0a04e1

    .line 129
    invoke-virtual {p4, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    iput-object v8, p0, Ll/ܶ᩺ᩳ;->᩶:Landroid/widget/TextView;

    const v9, 0x7f0a04e0

    .line 130
    invoke-virtual {p4, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    iput-object v9, p0, Ll/ܶ᩺ᩳ;->᩹:Landroid/widget/TextView;

    const v9, 0x7f0a01db

    .line 131
    invoke-virtual {p4, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Ll/֨᩷ۡ;

    iput-object v9, p0, Ll/ܶ᩺ᩳ;->ܿ:Ll/֨᩷ۡ;

    .line 132
    sget-boolean v10, Ll/ܶ᩺ᩳ;->۫:Z

    if-nez v10, :cond_0

    .line 133
    move-object v10, p4

    check-cast v10, Landroid/view/ViewGroup;

    invoke-virtual {v10, v9}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 135
    :cond_0
    new-instance v9, Ll/ۜ᩺ᩳ;

    const/4 v10, 0x0

    invoke-direct {v9, v10, p1, p0}, Ll/ۜ᩺ᩳ;-><init>(ILl/ۗܺ᩷;Ljava/lang/Object;)V

    invoke-virtual {v8, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const-string v8, "_s"

    .line 173
    invoke-virtual {p3, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    .line 248
    invoke-virtual {v0, v8, v9}, Ll/ۚۖۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "_r"

    .line 174
    invoke-virtual {p3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 248
    invoke-virtual {v1, p3, v9}, Ll/ۚۖۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    new-instance p3, Ll/֨ۧܿ;

    invoke-direct {p3, p1, p2}, Ll/֨ۧܿ;-><init>(Ll/ۗܺ᩷;Ll/۫ۨᩳ;)V

    iput-object p3, p0, Ll/ܶ᩺ᩳ;->۠:Ll/֨ۧܿ;

    .line 259
    new-instance p1, Ll/᩹ۧܿ;

    const v0, 0x7f0a0638

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-direct {p1, v0}, Ll/᩹ۧܿ;-><init>(Landroid/widget/TextView;)V

    .line 260
    new-instance v0, Ll/ۘ᩺ᩳ;

    invoke-direct {v0, p0, p1}, Ll/ۘ᩺ᩳ;-><init>(Ll/ܶ᩺ᩳ;Ll/᩹ۧܿ;)V

    invoke-virtual {p3, v0}, Ll/֨ۧܿ;->֫(Ll/ۘۧܿ;)V

    .line 300
    new-instance p3, Ll/۟ۨᩳ;

    invoke-direct {p3, p0}, Ll/۟ۨᩳ;-><init>(Ll/ܶ᩺ᩳ;)V

    .line 316
    new-instance v0, Ll/֫᩺ᩳ;

    invoke-direct {v0, p0}, Ll/֫᩺ᩳ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p2, v0}, Ll/۫ۨᩳ;->֫(Ll/֫᩺ᩳ;)V

    .line 321
    new-instance v0, Ll/ۧ᩺ᩳ;

    invoke-direct {v0, p0, p1}, Ll/ۧ᩺ᩳ;-><init>(Ll/ܶ᩺ᩳ;Ll/᩹ۧܿ;)V

    invoke-virtual {v6, v0}, Ll/۬ۡۡ;->֫(Ll/ۗۡۡ;)V

    .line 328
    new-instance v0, Ll/ۜ֡ۡ;

    invoke-direct {v0, p0, p1}, Ll/ۜ֡ۡ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 366
    invoke-virtual {v2, v0}, Ll/۬ۡۡ;->֫(Ll/ۗۡۡ;)V

    .line 367
    invoke-virtual {v3, v0}, Ll/۬ۡۡ;->֫(Ll/ۗۡۡ;)V

    .line 368
    invoke-virtual {v4, v0}, Ll/۬ۡۡ;->֫(Ll/ۗۡۡ;)V

    .line 369
    invoke-virtual {v5, v0}, Ll/۬ۡۡ;->֫(Ll/ۗۡۡ;)V

    .line 370
    invoke-virtual {v7, v0}, Ll/۬ۡۡ;->֫(Ll/ۗۡۡ;)V

    const p1, 0x7f0a01f4

    const v0, 0x7f0a0102

    const v1, 0x7f0a01f5

    const v2, 0x7f0a04ae

    const v3, 0x7f0a04ad

    .line 372
    filled-new-array {v1, p1, v3, v2, v0}, [I

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x5

    if-ge v0, v1, :cond_1

    .line 373
    aget v1, p1, v0

    .line 374
    invoke-virtual {p4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 375
    invoke-static {v1}, Ll/᩶ۖ᩷;->֫(Landroid/view/View;)V

    .line 376
    invoke-virtual {v1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 378
    :cond_1
    iget-object p1, p0, Ll/ܶ᩺ᩳ;->᩷:Ll/ۚۖۡ;

    new-instance p3, Ll/ᩴ᩺ᩳ;

    invoke-direct {p3, p0}, Ll/ᩴ᩺ᩳ;-><init>(Ll/ܶ᩺ᩳ;)V

    invoke-virtual {p1, p3}, Ll/ۚۖۡ;->֫(Landroid/text/TextWatcher;)V

    .line 399
    new-instance p1, Ll/ܽ᩺ᩳ;

    invoke-direct {p1, p0}, Ll/ܽ᩺ᩳ;-><init>(Ll/ܶ᩺ᩳ;)V

    invoke-virtual {p2, p1}, Ll/۫ۨᩳ;->֫(Ljava/lang/Runnable;)V

    .line 400
    new-instance p1, Ll/ᩳ᩺ᩳ;

    invoke-direct {p1, p0}, Ll/ᩳ᩺ᩳ;-><init>(Ll/ܶ᩺ᩳ;)V

    invoke-virtual {p2, p1}, Ll/۫ۨᩳ;->֫(Ll/۠۟ᩳ;)V

    .line 177
    invoke-virtual {p0}, Ll/ܶ᩺ᩳ;->ܺ()V

    .line 178
    invoke-virtual {p2, p0}, Ll/۫ۨᩳ;->֫(Ll/᩹᩺ᩳ;)V

    .line 179
    invoke-direct {p0}, Ll/ܶ᩺ᩳ;->ᩴ()V

    return-void
.end method

.method public constructor <init>(Ll/ܿۛ᩷;Ll/۫ۨᩳ;Landroid/view/View;)V
    .locals 2

    .line 103
    new-instance v0, Ll/ۘ᩹ܽ;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p3}, Ll/ۘ᩹ܽ;-><init>(ILjava/lang/Object;)V

    const-string p3, "code"

    invoke-direct {p0, p1, p2, p3, v0}, Ll/ܶ᩺ᩳ;-><init>(Ll/ۗܺ᩷;Ll/۫ۨᩳ;Ljava/lang/String;Ll/۠᩺ᩳ;)V

    return-void
.end method

.method private ֡()V
    .locals 4

    .line 404
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->۠:Ll/֨ۧܿ;

    invoke-virtual {v0}, Ll/֨ۧܿ;->ܳ()Z

    move-result v1

    .line 112
    iget-object v2, p0, Ll/ܶ᩺ᩳ;->ᩴ:Ll/۬ۡۡ;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Ll/۬ۡۡ;->֫(ZZ)V

    .line 405
    iget-object v1, p0, Ll/ܶ᩺ᩳ;->ۢ:Ll/۬ۡۡ;

    invoke-virtual {v0}, Ll/֨ۧܿ;->ܽ()Z

    move-result v2

    .line 112
    invoke-virtual {v1, v2, v3}, Ll/۬ۡۡ;->֫(ZZ)V

    .line 406
    iget-object v1, p0, Ll/ܶ᩺ᩳ;->ۙ:Ll/۬ۡۡ;

    invoke-virtual {v0}, Ll/֨ۧܿ;->᩻()Z

    move-result v2

    .line 112
    invoke-virtual {v1, v2, v3}, Ll/۬ۡۡ;->֫(ZZ)V

    .line 407
    iget-object v1, p0, Ll/ܶ᩺ᩳ;->ۡ:Ll/۬ۡۡ;

    invoke-virtual {v0}, Ll/֨ۧܿ;->ᩳ()Z

    move-result v2

    .line 112
    invoke-virtual {v1, v2, v3}, Ll/۬ۡۡ;->֫(ZZ)V

    .line 408
    iget-object v1, p0, Ll/ܶ᩺ᩳ;->ܺ:Ll/۬ۡۡ;

    invoke-virtual {v0}, Ll/֨ۧܿ;->ܿ()Z

    move-result v0

    .line 112
    invoke-virtual {v1, v0, v3}, Ll/۬ۡۡ;->֫(ZZ)V

    return-void
.end method

.method private ֫(I)V
    .locals 17

    move-object/from16 v10, p0

    .line 425
    invoke-direct/range {p0 .. p0}, Ll/ܶ᩺ᩳ;->ۖ()V

    .line 426
    iget-boolean v0, v10, Ll/ܶ᩺ᩳ;->ܽ:Z

    if-nez v0, :cond_2

    iget-boolean v0, v10, Ll/ܶ᩺ᩳ;->֨:Z

    if-nez v0, :cond_2

    const/4 v0, 0x3

    iget-object v6, v10, Ll/ܶ᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    move/from16 v9, p1

    if-ne v9, v0, :cond_0

    invoke-virtual {v6}, Ll/۫ۨᩳ;->ۨۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 427
    :cond_0
    iget-object v0, v10, Ll/ܶ᩺ᩳ;->᩷:Ll/ۚۖۡ;

    invoke-virtual {v0}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    .line 420
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "srep"

    const-string v2, "$0\\n"

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 421
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v8, v2

    goto :goto_0

    :cond_1
    move-object v8, v0

    .line 429
    :goto_0
    iget-object v0, v10, Ll/ܶ᩺ᩳ;->۠:Ll/֨ۧܿ;

    invoke-virtual {v0}, Ll/֨ۧܿ;->ۧ()I

    move-result v11

    .line 430
    invoke-virtual {v6}, Ll/۫ۨᩳ;->᩶֫()Ll/۬۟ᩳ;

    move-result-object v12

    .line 431
    invoke-virtual {v6}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v13

    .line 432
    invoke-interface {v13}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v14

    .line 433
    new-instance v15, Ll/ܰ᩺ᩳ;

    new-instance v5, Ll/ܳ᩺ᩳ;

    move-object v0, v5

    move-object/from16 v1, p0

    move-object v2, v7

    move v3, v11

    move-object v4, v12

    move-object v9, v5

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Ll/ܳ᩺ᩳ;-><init>(Ll/ܶ᩺ᩳ;Ljava/lang/String;ILl/۬۟ᩳ;Ljava/lang/String;)V

    iget-object v0, v10, Ll/ܶ᩺ᩳ;->֫:Ll/ۗܺ᩷;

    const v1, 0x7f1207a7

    invoke-direct {v15, v6, v0, v1, v9}, Ll/ܰ᩺ᩳ;-><init>(Ll/۫ۨᩳ;Ll/ۗܺ᩷;ILjava/util/function/BooleanSupplier;)V

    .line 438
    iput-object v15, v10, Ll/ܶ᩺ᩳ;->ܳ:Ll/ܰ᩺ᩳ;

    .line 439
    new-instance v16, Ll/֡᩺ᩳ;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    move-object v2, v15

    move-object v3, v13

    move v4, v14

    move-object v5, v7

    move v6, v11

    move-object v7, v8

    move-object v8, v12

    move/from16 v9, p1

    invoke-direct/range {v0 .. v9}, Ll/֡᩺ᩳ;-><init>(Ll/ܶ᩺ᩳ;Ll/ܰ᩺ᩳ;Ll/۟᩺ᩳ;ILjava/lang/String;ILjava/lang/String;Ll/۬۟ᩳ;I)V

    .line 527
    invoke-virtual/range {v16 .. v16}, Ll/۟ܶۡ;->᩻()V

    :cond_2
    :goto_1
    return-void
.end method

.method public static ֫(Landroid/view/MenuItem;Ll/۫ۨᩳ;)V
    .locals 17

    .line 988
    invoke-virtual/range {p1 .. p1}, Ll/۫ۨᩳ;->ۗۧ()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual/range {p1 .. p1}, Ll/۫ۨᩳ;->ۨۧ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 989
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x1

    const/4 v8, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    const/4 v8, 0x0

    .line 990
    :goto_1
    invoke-virtual/range {p1 .. p1}, Ll/۫ۨᩳ;->۫֫()I

    move-result v2

    .line 991
    invoke-virtual/range {p1 .. p1}, Ll/۫ۨᩳ;->۬֫()I

    move-result v3

    if-le v2, v3, :cond_2

    move v10, v2

    move v9, v3

    goto :goto_2

    :cond_2
    move v9, v2

    move v10, v3

    .line 998
    :goto_2
    invoke-interface/range {p0 .. p0}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v11

    .line 1000
    invoke-interface {v11}, Landroid/view/Menu;->clear()V

    .line 1002
    invoke-static {}, Ll/֡᩻ܿ;->ܽ()Ljava/util/List;

    move-result-object v2

    .line 1003
    invoke-static {}, Ll/֡᩻ܿ;->ᩳ()Ljava/util/Map;

    move-result-object v12

    .line 1005
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    const/4 v2, 0x0

    move-object v14, v2

    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Ll/ۖ᩻ܿ;

    .line 1006
    invoke-virtual {v15}, Ll/ۖ᩻ܿ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v12, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Ljava/lang/Integer;

    if-nez v16, :cond_3

    goto :goto_3

    :cond_3
    move-object v2, v15

    move-object/from16 v3, p1

    move v4, v0

    move v5, v8

    move v6, v9

    move v7, v10

    .line 1010
    invoke-virtual/range {v2 .. v7}, Ll/ۖ᩻ܿ;->֫(Ll/۫ۨᩳ;ZZII)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    .line 1014
    :cond_4
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x12c

    if-lt v2, v3, :cond_6

    if-nez v14, :cond_5

    const v2, 0xffff

    const v3, 0x7f120634

    .line 1016
    invoke-interface {v11, v1, v1, v2, v3}, Landroid/view/Menu;->addSubMenu(IIII)Landroid/view/SubMenu;

    move-result-object v2

    const v3, 0x7f080221

    .line 1017
    invoke-interface {v2, v3}, Landroid/view/SubMenu;->setIcon(I)Landroid/view/SubMenu;

    move-object v14, v2

    .line 1019
    :cond_5
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v15}, Ll/ۖ᩻ܿ;->ۧ()Ll/ܺ᩻ܿ;

    move-result-object v3

    invoke-interface {v14, v1, v1, v2, v3}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v2

    goto :goto_4

    .line 1021
    :cond_6
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v15}, Ll/ۖ᩻ܿ;->ۧ()Ll/ܺ᩻ܿ;

    move-result-object v3

    invoke-interface {v11, v1, v1, v2, v3}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v2

    .line 1023
    :goto_4
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v15, v3}, Ll/ۖ᩻ܿ;->֫(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    goto :goto_3

    :cond_7
    return-void
.end method

.method private ֫(Ll/ۗܰᩳ;Ljava/lang/Runnable;)V
    .locals 6

    .line 652
    iget-boolean v0, p1, Ll/ۗܰᩳ;->ܿ:Z

    iget-boolean v1, p1, Ll/ۗܰᩳ;->ᩳ:Z

    .line 653
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 654
    invoke-direct {p0}, Ll/ܶ᩺ᩳ;->֡()V

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    const/4 v4, 0x0

    goto :goto_0

    :cond_0
    const/16 v4, 0x8

    .line 655
    :goto_0
    iget-object v5, p0, Ll/ܶ᩺ᩳ;->ܶ:Landroid/view/View;

    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    .line 656
    :cond_1
    iget-object v4, p0, Ll/ܶ᩺ᩳ;->ۚ:Landroid/view/View;

    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 657
    invoke-direct {p0}, Ll/ܶ᩺ᩳ;->ᩴ()V

    .line 658
    iget-object v2, p0, Ll/ܶ᩺ᩳ;->᩷:Ll/ۚۖۡ;

    if-eqz v0, :cond_2

    .line 659
    iget-object v4, p1, Ll/ۗܰᩳ;->ܽ:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ll/ۚۖۡ;->֫(Ljava/lang/CharSequence;)V

    .line 660
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    :cond_2
    if-eqz v1, :cond_3

    .line 663
    iget-object v4, p0, Ll/ܶ᩺ᩳ;->ۜ:Ll/ۚۖۡ;

    iget-object p1, p1, Ll/ۗܰᩳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v4, p1}, Ll/ۚۖۡ;->֫(Ljava/lang/CharSequence;)V

    .line 664
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 665
    iget-object p1, p0, Ll/ܶ᩺ᩳ;->ۡ:Ll/۬ۡۡ;

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 667
    :cond_3
    iget-object p1, p0, Ll/ܶ᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    if-eqz v0, :cond_5

    .line 668
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->֡:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 669
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۨۧ()Z

    move-result v3

    const/4 v4, 0x1

    xor-int/2addr v3, v4

    iget-object v5, p0, Ll/ܶ᩺ᩳ;->᩵:Landroid/view/View;

    invoke-virtual {v5, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 671
    invoke-virtual {v2}, Ll/ۚۖۡ;->ᩳ()I

    move-result v2

    if-eqz v2, :cond_4

    .line 672
    invoke-virtual {p0}, Ll/ܶ᩺ᩳ;->ۢ()V

    :cond_4
    if-eqz v1, :cond_6

    .line 674
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۨۧ()Z

    move-result p1

    if-nez p1, :cond_6

    .line 675
    invoke-virtual {v0, v4}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_1

    .line 678
    :cond_5
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ܶܽ()V

    .line 680
    :cond_6
    :goto_1
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public static synthetic ֫(Ll/ܶ᩺ᩳ;)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 907
    new-instance v0, Landroid/content/Intent;

    iget-object p0, p0, Ll/ܶ᩺ᩳ;->֫:Ll/ۗܺ᩷;

    const-class v1, Ll/᩺᩸᩷;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 908
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܶ᩺ᩳ;I[Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eq p1, p4, :cond_0

    .line 897
    aget-object p1, p2, p4

    .line 898
    invoke-virtual {p0, p1}, Ll/ܶ᩺ᩳ;->ۧ(Ljava/lang/String;)V

    .line 899
    iget-object p0, p0, Ll/ܶ᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {p0, p1}, Ll/۫ۨᩳ;->ۧ(Ljava/lang/String;)V

    .line 901
    :cond_0
    invoke-interface {p3}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method public static ֫(Ll/ܶ᩺ᩳ;Landroid/view/MenuItem;)V
    .locals 2

    .line 157
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f120373

    if-ne p1, v0, :cond_1

    .line 533
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v0, "srep"

    const-string v1, "$0\\n"

    invoke-interface {p1, v0, v1}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 534
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, p1

    .line 538
    :goto_0
    new-instance p1, Ll/ۚ᩺ᩳ;

    iget-object v0, p0, Ll/ܶ᩺ᩳ;->֫:Ll/ۗܺ᩷;

    invoke-direct {p1, p0, v0, v1}, Ll/ۚ᩺ᩳ;-><init>(Ll/ܶ᩺ᩳ;Ll/ۗܺ᩷;Ljava/lang/String;)V

    return-void

    :cond_1
    const v0, 0x7f12036f

    if-ne p1, v0, :cond_2

    const/4 p1, 0x1

    .line 161
    invoke-direct {p0, p1}, Ll/ܶ᩺ᩳ;->֫(I)V

    return-void

    :cond_2
    const v0, 0x7f120370

    if-ne p1, v0, :cond_3

    const/4 p1, 0x2

    .line 163
    invoke-direct {p0, p1}, Ll/ܶ᩺ᩳ;->֫(I)V

    return-void

    :cond_3
    const v0, 0x7f120371

    if-ne p1, v0, :cond_4

    const/4 p1, 0x3

    .line 165
    invoke-direct {p0, p1}, Ll/ܶ᩺ᩳ;->֫(I)V

    return-void

    :cond_4
    const v0, 0x7f120372

    if-ne p1, v0, :cond_5

    const/4 p1, 0x4

    .line 167
    invoke-direct {p0, p1}, Ll/ܶ᩺ᩳ;->֫(I)V

    :cond_5
    return-void
.end method

.method public static synthetic ֫(Ll/ܶ᩺ᩳ;Landroid/view/View;)V
    .locals 4

    .line 301
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->ۜ:Ll/ۚۖۡ;

    iget-object v1, p0, Ll/ܶ᩺ᩳ;->᩷:Ll/ۚۖۡ;

    iget-object v2, p0, Ll/ܶ᩺ᩳ;->۠:Ll/֨ۧܿ;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v3, 0x7f0a01f5

    if-ne p1, v3, :cond_0

    .line 303
    invoke-virtual {v1}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ll/֨ۧܿ;->ۧ(Ljava/lang/String;)V

    return-void

    :cond_0
    const v3, 0x7f0a01f4

    if-ne p1, v3, :cond_1

    .line 305
    invoke-virtual {v1}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ll/֨ۧܿ;->֫(Ljava/lang/String;)V

    return-void

    :cond_1
    const v3, 0x7f0a04ad

    if-ne p1, v3, :cond_2

    const/4 p1, 0x0

    .line 307
    invoke-virtual {p0, p1}, Ll/ܶ᩺ᩳ;->֫(Z)Z

    move-result p0

    if-nez p0, :cond_4

    .line 308
    invoke-virtual {v1}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p0, p1}, Ll/֨ۧܿ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    const v3, 0x7f0a04ae

    if-ne p1, v3, :cond_3

    .line 311
    invoke-virtual {v1}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p0, p1}, Ll/֨ۧܿ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    const v0, 0x7f0a0102

    if-ne p1, v0, :cond_4

    .line 313
    invoke-virtual {p0}, Ll/ܶ᩺ᩳ;->ܽ()V

    :cond_4
    return-void
.end method

.method public static ֫(Ll/ܶ᩺ᩳ;Ljava/util/regex/PatternSyntaxException;)V
    .locals 1

    .line 251
    iget-object p0, p0, Ll/ܶ᩺ᩳ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p0

    const v0, 0x7f120307

    .line 252
    invoke-virtual {p0, v0}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 253
    invoke-static {p1}, Ll/ۨۘܽ;->֫(Ljava/util/regex/PatternSyntaxException;)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    const p1, 0x7f120189

    const/4 v0, 0x0

    .line 254
    invoke-virtual {p0, p1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 255
    invoke-virtual {p0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public static synthetic ֫(Ll/ܶ᩺ᩳ;Ll/ۗܰᩳ;)V
    .locals 2

    .line 647
    new-instance v0, Ll/۠֡ᩳ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/۠֡ᩳ;-><init>(I)V

    invoke-direct {p0, p1, v0}, Ll/ܶ᩺ᩳ;->֫(Ll/ۗܰᩳ;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ֫(Ll/ܶ᩺ᩳ;Ll/ۗܺ᩷;Landroid/view/View;)V
    .locals 4

    .line 136
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->᩶:Landroid/widget/TextView;

    sget-boolean v1, Ll/ܶ᩺ᩳ;->۫:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 137
    sput-boolean v2, Ll/ܶ᩺ᩳ;->۫:Z

    .line 138
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "sesrt"

    .line 0
    invoke-static {v1, v3, v2}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    .line 139
    iget-object v1, p0, Ll/ܶ᩺ᩳ;->ܿ:Ll/֨᩷ۡ;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 140
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Paint;->isUnderlineText()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 141
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    .line 142
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 145
    :cond_0
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->᩹:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    .line 146
    new-instance v3, Ll/᩸ۖ;

    .line 68
    invoke-direct {v3, p1, p2, v2}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 147
    invoke-virtual {v3}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    .line 148
    invoke-virtual {p1, v1}, Ll/ۗۜ;->setOptionalIconsVisible(Z)V

    .line 149
    invoke-virtual {p1, v1}, Ll/ۗۜ;->setGroupDividerEnabled(Z)V

    const p2, 0x7f12036e

    .line 150
    invoke-static {p1, p2}, Ll/۬ۜ;->֫(Ll/ۗۜ;I)V

    const p2, 0x7f12036f

    .line 151
    invoke-virtual {p1, v2, p2, v2, p2}, Ll/ۗۜ;->add(IIII)Landroid/view/MenuItem;

    move-result-object p2

    const v1, 0x7f080252

    invoke-interface {p2, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object p2

    invoke-interface {p2, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const p2, 0x7f120370

    .line 152
    invoke-virtual {p1, v2, p2, v2, p2}, Ll/ۗۜ;->add(IIII)Landroid/view/MenuItem;

    move-result-object p2

    const v1, 0x7f0801e3

    invoke-interface {p2, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object p2

    invoke-interface {p2, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const p2, 0x7f120371

    .line 153
    invoke-virtual {p1, v2, p2, v2, p2}, Ll/ۗۜ;->add(IIII)Landroid/view/MenuItem;

    move-result-object p2

    const v1, 0x7f080232

    invoke-interface {p2, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object p2

    invoke-interface {p2, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const p2, 0x7f120372

    .line 154
    invoke-virtual {p1, v2, p2, v2, p2}, Ll/ۗۜ;->add(IIII)Landroid/view/MenuItem;

    move-result-object p2

    const v1, 0x7f0801f0

    invoke-interface {p2, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object p2

    invoke-interface {p2, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const p2, 0x7f120373

    .line 155
    invoke-virtual {p1, p2, p2, v2, p2}, Ll/ۗۜ;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const p2, 0x7f08023d

    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 156
    new-instance p1, Ll/ܿ᩺ᩳ;

    invoke-direct {p1, p0}, Ll/ܿ᩺ᩳ;-><init>(Ll/ܶ᩺ᩳ;)V

    invoke-virtual {v3, p1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 171
    invoke-static {v3}, Ll/᩶ۖ;->֫(Ll/᩸ۖ;)Ll/ᩳ᩷;

    move-result-object p0

    invoke-virtual {p0}, Ll/ᩳ᩷;->ܳ()V

    return-void
.end method

.method public static synthetic ֫(Ll/ܶ᩺ᩳ;Ll/۟᩺ᩳ;)V
    .locals 1

    .line 699
    iget-boolean v0, p0, Ll/ܶ᩺ᩳ;->ܽ:Z

    if-nez v0, :cond_0

    iget-object p0, p0, Ll/ܶ᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {p0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p0

    if-ne p0, p1, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string p1, "Editor owner changed during restoration"

    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ֫(Ll/ܶ᩺ᩳ;Ll/᩹ۧܿ;Ll/۬ۡۡ;ZZ)V
    .locals 4

    .line 329
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->ۘ:Ljava/lang/String;

    iget-object v1, p0, Ll/ܶ᩺ᩳ;->۠:Ll/֨ۧܿ;

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result p2

    const v2, 0x7f0a0598

    const-string v3, "_bit"

    if-ne p2, v2, :cond_2

    .line 331
    invoke-virtual {v1, p3}, Ll/֨ۧܿ;->ᩳ(Z)V

    if-eqz p4, :cond_1

    if-eqz p3, :cond_0

    const p2, 0x7f120802

    goto :goto_0

    :cond_0
    const p2, 0x7f120801

    .line 333
    :goto_0
    invoke-virtual {p1, p2}, Ll/᩹ۧܿ;->֫(I)V

    .line 335
    :cond_1
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    .line 0
    invoke-static {v0, v3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 335
    invoke-virtual {v1}, Ll/֨ۧܿ;->֫()B

    move-result p3

    invoke-interface {p1, p3, p2}, Ll/۬ۤۡ;->֫(BLjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    .line 336
    invoke-virtual {p0}, Ll/ܶ᩺ᩳ;->ۢ()V

    return-void

    :cond_2
    const v2, 0x7f0a059b

    if-ne p2, v2, :cond_5

    .line 338
    invoke-virtual {v1, p3}, Ll/֨ۧܿ;->ܿ(Z)V

    if-eqz p4, :cond_4

    if-eqz p3, :cond_3

    const p2, 0x7f120b84

    goto :goto_1

    :cond_3
    const p2, 0x7f120b83

    .line 340
    :goto_1
    invoke-virtual {p1, p2}, Ll/᩹ۧܿ;->֫(I)V

    .line 342
    :cond_4
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    .line 0
    invoke-static {v0, v3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 342
    invoke-virtual {v1}, Ll/֨ۧܿ;->֫()B

    move-result p3

    invoke-interface {p1, p3, p2}, Ll/۬ۤۡ;->֫(BLjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    .line 343
    invoke-virtual {p0}, Ll/ܶ᩺ᩳ;->ۢ()V

    return-void

    :cond_5
    const v2, 0x7f0a058a

    if-ne p2, v2, :cond_8

    .line 345
    invoke-virtual {v1, p3}, Ll/֨ۧܿ;->֫(Z)V

    if-eqz p4, :cond_7

    if-eqz p3, :cond_6

    const p2, 0x7f120550

    goto :goto_2

    :cond_6
    const p2, 0x7f12054f

    .line 347
    :goto_2
    invoke-virtual {p1, p2}, Ll/᩹ۧܿ;->֫(I)V

    .line 349
    :cond_7
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    .line 0
    invoke-static {v0, v3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 349
    invoke-virtual {v1}, Ll/֨ۧܿ;->֫()B

    move-result p3

    invoke-interface {p1, p3, p2}, Ll/۬ۤۡ;->֫(BLjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    .line 350
    invoke-virtual {p0}, Ll/ܶ᩺ᩳ;->ۢ()V

    return-void

    :cond_8
    const v2, 0x7f0a0596

    if-ne p2, v2, :cond_b

    .line 352
    invoke-virtual {v1, p3}, Ll/֨ۧܿ;->ܽ(Z)V

    if-eqz p4, :cond_a

    if-eqz p3, :cond_9

    const p2, 0x7f120732

    goto :goto_3

    :cond_9
    const p2, 0x7f120731

    .line 354
    :goto_3
    invoke-virtual {p1, p2}, Ll/᩹ۧܿ;->֫(I)V

    if-eqz p3, :cond_a

    .line 355
    iget-object p0, p0, Ll/ܶ᩺ᩳ;->֫:Ll/ۗܺ᩷;

    const-string p1, "page_search"

    const p2, 0x7f120733

    invoke-static {p2, p0, p1}, Ll/ۧۛܿ;->ۧ(ILl/ۗܺ᩷;Ljava/lang/String;)V

    .line 357
    :cond_a
    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p0

    .line 0
    invoke-static {v0, v3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 357
    invoke-virtual {v1}, Ll/֨ۧܿ;->֫()B

    move-result p2

    invoke-interface {p0, p2, p1}, Ll/۬ۤۡ;->֫(BLjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    return-void

    :cond_b
    const p0, 0x7f0a0595

    if-ne p2, p0, :cond_e

    .line 359
    invoke-virtual {v1, p3}, Ll/֨ۧܿ;->ۧ(Z)V

    if-eqz p4, :cond_d

    if-eqz p3, :cond_c

    const p0, 0x7f1206f0

    goto :goto_4

    :cond_c
    const p0, 0x7f1200ff

    :goto_4
    const/16 p2, 0x5dc

    .line 361
    invoke-virtual {p1, p0, p2}, Ll/᩹ۧܿ;->֫(II)V

    .line 363
    :cond_d
    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p0

    .line 0
    invoke-static {v0, v3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 363
    invoke-virtual {v1}, Ll/֨ۧܿ;->֫()B

    move-result p2

    invoke-interface {p0, p2, p1}, Ll/۬ۤۡ;->֫(BLjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    :cond_e
    return-void
.end method

.method public static synthetic ֫(Ll/ܶ᩺ᩳ;Ll/᩹ۧܿ;ZZ)V
    .locals 0

    if-nez p2, :cond_0

    if-eqz p3, :cond_0

    .line 323
    iget-object p2, p0, Ll/ܶ᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {p2}, Ll/۫ۨᩳ;->ܶܽ()V

    .line 324
    invoke-virtual {p0}, Ll/ܶ᩺ᩳ;->ۢ()V

    const p0, 0x7f1208fe

    const/16 p2, 0x7d0

    .line 325
    invoke-virtual {p1, p0, p2}, Ll/᩹ۧܿ;->֫(II)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ܶ᩺ᩳ;Z)V
    .locals 2

    .line 317
    invoke-direct {p0}, Ll/ܶ᩺ᩳ;->ۖ()V

    .line 318
    iget-object p0, p0, Ll/ܶ᩺ᩳ;->ۖ:Ll/۬ۡۡ;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 112
    invoke-virtual {p0, p1, v0}, Ll/۬ۡۡ;->֫(ZZ)V

    return-void
.end method

.method public static ֫(Ll/ܶ᩺ᩳ;Ljava/lang/String;ILl/۬۟ᩳ;Ljava/lang/String;)Z
    .locals 1

    .line 434
    iget-boolean v0, p0, Ll/ܶ᩺ᩳ;->ܽ:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/ܶ᩺ᩳ;->֨:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ܶ᩺ᩳ;->᩷:Ll/ۚۖۡ;

    .line 435
    invoke-virtual {v0}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Ll/ܶ᩺ᩳ;->۠:Ll/֨ۧܿ;

    invoke-virtual {p1}, Ll/֨ۧܿ;->ۧ()I

    move-result p1

    if-ne p2, p1, :cond_1

    iget-object p0, p0, Ll/ܶ᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    .line 436
    invoke-virtual {p0}, Ll/۫ۨᩳ;->᩶֫()Ll/۬۟ᩳ;

    move-result-object p0

    invoke-static {p3, p0}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 420
    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string p1, "srep"

    const-string p2, "$0\\n"

    invoke-interface {p0, p1, p2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 421
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, p0

    .line 437
    :goto_0
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private ۖ()V
    .locals 1

    .line 413
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->ܳ:Ll/ܰ᩺ᩳ;

    if-eqz v0, :cond_0

    .line 414
    invoke-virtual {v0}, Ll/ܰ᩺ᩳ;->ܽ()V

    const/4 v0, 0x0

    .line 415
    iput-object v0, p0, Ll/ܶ᩺ᩳ;->ܳ:Ll/ܰ᩺ᩳ;

    :cond_0
    return-void
.end method

.method private ۘ()V
    .locals 2

    .line 833
    iget-boolean v0, p0, Ll/ܶ᩺ᩳ;->ܽ:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/ܶ᩺ᩳ;->֨:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/ܶ᩺ᩳ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 834
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->᩷:Ll/ۚۖۡ;

    invoke-virtual {v0}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ܶ᩺ᩳ;->۠:Ll/֨ۧܿ;

    invoke-virtual {v1, v0}, Ll/֨ۧܿ;->ܽ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ܶ᩺ᩳ;)Ll/ܰ᩺ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ᩺ᩳ;->ܳ:Ll/ܰ᩺ᩳ;

    return-object p0
.end method

.method public static bridge synthetic ۡ(Ll/ܶ᩺ᩳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/ܶ᩺ᩳ;->ܳ:Ll/ܰ᩺ᩳ;

    return-void
.end method

.method public static bridge synthetic ۢ(Ll/ܶ᩺ᩳ;)Ll/֨ۚۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ᩺ᩳ;->᩸:Ll/֨ۚۢ;

    return-object p0
.end method

.method public static ۧ(Landroid/view/MenuItem;Ll/۫ۨᩳ;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 227
    :cond_0
    new-instance v0, Ll/ۜۛᩳ;

    invoke-direct {v0, p0, p1}, Ll/ۜۛᩳ;-><init>(Landroid/view/MenuItem;Ll/۫ۨᩳ;)V

    .line 229
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    if-ne p0, p1, :cond_1

    .line 230
    invoke-virtual {v0}, Ll/ۜۛᩳ;->run()V

    return-void

    .line 232
    :cond_1
    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic ۧ(Ll/ܶ᩺ᩳ;)V
    .locals 2

    .line 241
    iget-object p0, p0, Ll/ܶ᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    const/4 v0, 0x0

    invoke-virtual {p0}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ll/۫ۨᩳ;->scrollTo(II)V

    .line 242
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ܶ᩺ᩳ;)Ll/ۗܺ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ᩺ᩳ;->֫:Ll/ۗܺ᩷;

    return-object p0
.end method

.method public static bridge synthetic ܺ(Ll/ܶ᩺ᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܶ᩺ᩳ;->ۖ()V

    return-void
.end method

.method public static synthetic ܽ(Ll/ܶ᩺ᩳ;)V
    .locals 0

    .line 400
    invoke-direct {p0}, Ll/ܶ᩺ᩳ;->᩵()V

    return-void
.end method

.method public static synthetic ܿ(Ll/ܶ᩺ᩳ;)V
    .locals 0

    .line 97
    invoke-direct {p0}, Ll/ܶ᩺ᩳ;->ۘ()V

    return-void
.end method

.method public static synthetic ᩳ(Ll/ܶ᩺ᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܶ᩺ᩳ;->᩵()V

    return-void
.end method

.method private ᩴ()V
    .locals 3

    .line 839
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->ܶ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    iget-object v2, p0, Ll/ܶ᩺ᩳ;->֫:Ll/ۗܺ᩷;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 840
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    sget v1, Ll/᩹֡᩷;->ۖ:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    return-void

    .line 842
    :cond_0
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    iget-object v1, p0, Ll/ܶ᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    .line 1084
    iget-object v1, v1, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget v1, v1, Ll/᩺֫ܿ;->ܽ֫:I

    .line 842
    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    return-void
.end method

.method private ᩵()V
    .locals 8

    .line 578
    invoke-virtual {p0}, Ll/ܶ᩺ᩳ;->ܳ()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 581
    :cond_0
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->᩷:Ll/ۚۖۡ;

    invoke-virtual {v0}, Ll/ۚۖۡ;->ᩳ()I

    move-result v0

    iget-object v1, p0, Ll/ܶ᩺ᩳ;->᩹:Landroid/widget/TextView;

    iget-object v2, p0, Ll/ܶ᩺ᩳ;->᩶:Landroid/widget/TextView;

    if-nez v0, :cond_2

    .line 615
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    const-string v3, "0"

    invoke-static {v3, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 616
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 583
    :cond_1
    sget-object v0, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 584
    sget-object v0, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void

    .line 587
    :cond_2
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    iget-object v3, v0, Ll/۫ۨᩳ;->֡ᩳ:Ll/ۜ֫ܿ;

    .line 589
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۗ֫()[I

    move-result-object v4

    .line 590
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v5, 0x0

    aget v6, v4, v5

    const/4 v7, 0x1

    aget v4, v4, v7

    invoke-virtual {v3, v0, v6, v4}, Ll/ۜ֫ܿ;->֫(Landroid/content/Context;II)Ll/ܽ֫ܿ;

    move-result-object v0

    .line 592
    sget-boolean v3, Ll/ܶ᩺ᩳ;->۫:Z

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Ll/ܽ֫ܿ;->size()I

    move-result v3

    const/16 v4, 0xa

    if-lt v3, v4, :cond_3

    .line 593
    invoke-virtual {v2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    .line 594
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    .line 595
    iget-object v3, p0, Ll/ܶ᩺ᩳ;->ܿ:Ll/֨᩷ۡ;

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/16 v6, 0x8

    if-ne v4, v6, :cond_3

    .line 596
    invoke-virtual {v3, v5, v5}, Landroid/view/View;->measure(II)V

    .line 597
    invoke-virtual {v3}, Ll/֨᩷ۡ;->ܽ()Ll/ۚ᩷ۡ;

    move-result-object v4

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v6

    int-to-float v6, v6

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v6, v7

    invoke-virtual {v4, v6}, Ll/ۚ᩷ۡ;->֫(F)V

    .line 36
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    const/4 v4, 0x0

    .line 37
    invoke-virtual {v3, v4}, Landroid/view/View;->setAlpha(F)V

    const/4 v4, 0x2

    new-array v4, v4, [F

    .line 38
    fill-array-data v4, :array_0

    const-string v5, "alpha"

    invoke-static {v3, v5, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v3

    const-wide/16 v4, 0x96

    invoke-virtual {v3, v4, v5}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v3

    invoke-virtual {v3}, Landroid/animation/ObjectAnimator;->start()V

    .line 601
    :cond_3
    invoke-virtual {v0}, Ll/ܽ֫ܿ;->֫()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 602
    sget-object v3, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 603
    sget-object v2, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    .line 604
    :cond_4
    invoke-virtual {v0}, Ll/ܽ֫ܿ;->ᩳ()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 605
    sget v3, Ll/᩹֡᩷;->ۘ֫:I

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 606
    sget v2, Ll/᩹֡᩷;->ۘ֫:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 608
    :cond_5
    sget-object v3, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 609
    sget-object v2, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 611
    :goto_0
    invoke-virtual {v0}, Ll/ܽ֫ܿ;->ܽ()Ljava/lang/String;

    move-result-object v0

    .line 615
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 616
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    :goto_1
    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static bridge synthetic ᩷(Ll/ܶ᩺ᩳ;)Ll/֨ۧܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ᩺ᩳ;->۠:Ll/֨ۧܿ;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/ܶ᩺ᩳ;)Ll/۫ۨᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 745
    invoke-virtual {p0, v0, v1}, Ll/ܶ᩺ᩳ;->֫(ZZ)V

    return-void
.end method

.method public final ֫(Landroid/view/MenuItem;)V
    .locals 1

    .line 218
    iput-object p1, p0, Ll/ܶ᩺ᩳ;->ۗ:Landroid/view/MenuItem;

    .line 219
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    invoke-static {p1, v0}, Ll/ܶ᩺ᩳ;->ۧ(Landroid/view/MenuItem;Ll/۫ۨᩳ;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Class;)V
    .locals 1

    .line 870
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->᩻:Ll/᩸᩺ᩳ;

    invoke-virtual {v0, p1}, Ll/᩸᩺ᩳ;->֫(Ljava/lang/Class;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 213
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->᩻:Ll/᩸᩺ᩳ;

    invoke-virtual {v0, p1}, Ll/᩸᩺ᩳ;->֫(Ljava/lang/String;)V

    .line 214
    iget-object p1, p0, Ll/ܶ᩺ᩳ;->ۗ:Landroid/view/MenuItem;

    iget-object v0, p0, Ll/ܶ᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    invoke-static {p1, v0}, Ll/ܶ᩺ᩳ;->ۧ(Landroid/view/MenuItem;Ll/۫ۨᩳ;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Z)V
    .locals 1

    .line 866
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->᩻:Ll/᩸᩺ᩳ;

    invoke-virtual {v0, p1, p2}, Ll/᩸᩺ᩳ;->֫(Ljava/lang/String;Z)V

    return-void
.end method

.method public final ֫(Ll/ۗ֫ܿ;Ll/ۙܰᩳ;Ll/ۗܰᩳ;)V
    .locals 7

    .line 695
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۙ()V

    .line 696
    iget-boolean v1, p0, Ll/ܶ᩺ᩳ;->ܽ:Z

    if-nez v1, :cond_3

    iget-boolean v1, p0, Ll/ܶ᩺ᩳ;->֨:Z

    if-nez v1, :cond_3

    .line 697
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    .line 698
    new-instance v2, Ll/᩻᩺ᩳ;

    invoke-direct {v2, p0, v1}, Ll/᩻᩺ᩳ;-><init>(Ll/ܶ᩺ᩳ;Ll/۟᩺ᩳ;)V

    const/4 v1, 0x1

    .line 701
    iput-boolean v1, p0, Ll/ܶ᩺ᩳ;->֨:Z

    .line 702
    iget-object v1, p0, Ll/ܶ᩺ᩳ;->᩸:Ll/֨ۚۢ;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    const/4 v4, 0x0

    .line 704
    :try_start_0
    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->֫(Ll/ۗ֫ܿ;)Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v6, p0, Ll/ܶ᩺ᩳ;->᩻:Ll/᩸᩺ᩳ;

    if-nez v5, :cond_0

    .line 705
    :try_start_1
    invoke-virtual {v6, p2}, Ll/᩸᩺ᩳ;->֫(Ll/ۙܰᩳ;)Ll/᩶۟ᩳ;

    move-result-object p2

    .line 706
    invoke-virtual {v0, p1, p2}, Ll/۫ۨᩳ;->֫(Ll/ۗ֫ܿ;Ll/᩶۟ᩳ;)V

    .line 708
    :cond_0
    invoke-virtual {v2}, Ll/᩻᩺ᩳ;->run()V

    .line 709
    invoke-virtual {v6}, Ll/᩸᩺ᩳ;->֫()V

    .line 710
    iget-object p1, p0, Ll/ܶ᩺ᩳ;->ۗ:Landroid/view/MenuItem;

    invoke-static {p1, v0}, Ll/ܶ᩺ᩳ;->ۧ(Landroid/view/MenuItem;Ll/۫ۨᩳ;)V

    .line 711
    iget-boolean p1, p3, Ll/ۗܰᩳ;->ܿ:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Ll/ܶ᩺ᩳ;->۠:Ll/֨ۧܿ;

    iget-object p2, p3, Ll/ۗܰᩳ;->֫:Ljava/lang/Byte;

    if-nez p2, :cond_1

    .line 712
    sget-object p2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Ll/ܶ᩺ᩳ;->ۘ:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "_bit"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v4, v0}, Ll/۫ۤۡ;->֫(BLjava/lang/String;)B

    move-result p2

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Byte;->byteValue()B

    move-result p2

    .line 711
    :goto_0
    invoke-virtual {p1, p2}, Ll/֨ۧܿ;->֫(B)V

    .line 713
    :cond_2
    invoke-direct {p0, p3, v2}, Ll/ܶ᩺ᩳ;->֫(Ll/ۗܰᩳ;Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 715
    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 716
    iput-boolean v4, p0, Ll/ܶ᩺ᩳ;->֨:Z

    .line 718
    invoke-virtual {p0}, Ll/ܶ᩺ᩳ;->ۢ()V

    return-void

    :catchall_0
    move-exception p1

    .line 715
    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 716
    iput-boolean v4, p0, Ll/ܶ᩺ᩳ;->֨:Z

    .line 717
    throw p1

    .line 696
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Editor helper cannot restore session state"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۗ֫ܿ;Ll/ۙܰᩳ;Ll/ۙ֫ܿ;Ll/᩸ۨᩳ;)V
    .locals 1

    .line 686
    iget-boolean v0, p0, Ll/ܶ᩺ᩳ;->ܽ:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/ܶ᩺ᩳ;->֨:Z

    if-nez v0, :cond_0

    .line 687
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->᩻:Ll/᩸᩺ᩳ;

    invoke-virtual {v0, p2}, Ll/᩸᩺ᩳ;->֫(Ll/ۙܰᩳ;)Ll/᩶۟ᩳ;

    move-result-object p2

    iget-object v0, p0, Ll/ܶ᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/۫ۨᩳ;->֫(Ll/ۗ֫ܿ;Ll/᩶۟ᩳ;Ll/ۙ֫ܿ;Ll/᩸ۨᩳ;)V

    return-void

    .line 686
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Editor helper cannot prepare session state"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 1

    .line 851
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->᩻:Ll/᩸᩺ᩳ;

    invoke-virtual {v0, p1}, Ll/᩸᩺ᩳ;->֫(Ll/ۤۜܽ;)V

    return-void
.end method

.method public final ֫(Ll/۬ۜܽ;)V
    .locals 1

    .line 855
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->᩻:Ll/᩸᩺ᩳ;

    invoke-virtual {v0, p1}, Ll/᩸᩺ᩳ;->֫(Ll/۬ۜܽ;)V

    .line 856
    iget-object p1, p0, Ll/ܶ᩺ᩳ;->ۗ:Landroid/view/MenuItem;

    iget-object v0, p0, Ll/ܶ᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    invoke-static {p1, v0}, Ll/ܶ᩺ᩳ;->ۧ(Landroid/view/MenuItem;Ll/۫ۨᩳ;)V

    return-void
.end method

.method public final ֫(Ll/᩻ۡ֫;Ll/ۙ֡ᩳ;Ljava/lang/Class;)V
    .locals 2

    .line 190
    new-instance v0, Ll/ۖ᩺ᩳ;

    invoke-direct {v0, p0, p3}, Ll/ۖ᩺ᩳ;-><init>(Ll/ܶ᩺ᩳ;Ljava/lang/Class;)V

    iget-object p3, p0, Ll/ܶ᩺ᩳ;->᩷:Ll/ۚۖۡ;

    .line 208
    invoke-virtual {p3}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object p3

    iget-object v1, p0, Ll/ܶ᩺ᩳ;->ۜ:Ll/ۚۖۡ;

    .line 209
    invoke-virtual {v1}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object v1

    .line 190
    invoke-virtual {p2, p1, v0, p3, v1}, Ll/ۙ֡ᩳ;->֫(Ll/᩻ۡ֫;Ll/֫ܿܿ;Ll/ۤۤᩳ;Ll/ۤۤᩳ;)V

    return-void
.end method

.method public final ֫(ZZ)V
    .locals 8

    .line 750
    invoke-virtual {p0}, Ll/ܶ᩺ᩳ;->ܳ()Z

    move-result v0

    const/4 v1, 0x1

    .line 751
    iget-object v2, p0, Ll/ܶ᩺ᩳ;->۠:Ll/֨ۧܿ;

    const/4 v3, 0x0

    iget-object v4, p0, Ll/ܶ᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    if-nez v0, :cond_1

    .line 752
    iget-object v5, v4, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v5}, Ll/ۗۤᩳ;->ۖ()Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_1

    .line 754
    :cond_0
    sget-object v5, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Ll/ܶ᩺ᩳ;->ۘ:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "_bit"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v3, v6}, Ll/۫ۤۡ;->֫(BLjava/lang/String;)B

    move-result v5

    invoke-virtual {v2, v5}, Ll/֨ۧܿ;->֫(B)V

    .line 755
    invoke-direct {p0}, Ll/ܶ᩺ᩳ;->֡()V

    .line 756
    iget-object v5, p0, Ll/ܶ᩺ᩳ;->ܶ:Landroid/view/View;

    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    .line 757
    iget-object v5, p0, Ll/ܶ᩺ᩳ;->ۚ:Landroid/view/View;

    const/16 v6, 0x8

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 758
    invoke-direct {p0}, Ll/ܶ᩺ᩳ;->ᩴ()V

    .line 759
    iget-object v5, p0, Ll/ܶ᩺ᩳ;->ۡ:Ll/۬ۡۡ;

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 760
    iget-object v5, p0, Ll/ܶ᩺ᩳ;->֡:Landroid/view/View;

    invoke-virtual {v5, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 761
    invoke-virtual {v4}, Ll/۫ۨᩳ;->ۨۧ()Z

    move-result v5

    xor-int/2addr v5, v1

    iget-object v6, p0, Ll/ܶ᩺ᩳ;->᩵:Landroid/view/View;

    invoke-virtual {v6, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 763
    :cond_1
    iget-object v5, p0, Ll/ܶ᩺ᩳ;->᩷:Ll/ۚۖۡ;

    if-eqz p1, :cond_2

    .line 764
    invoke-virtual {v5}, Landroid/view/View;->requestFocus()Z

    .line 765
    invoke-virtual {v5}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object v6

    invoke-static {v6}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    .line 767
    :cond_2
    invoke-virtual {v4}, Ll/۫ۨᩳ;->ۗ֫()[I

    move-result-object v6

    .line 768
    aget v3, v6, v3

    .line 769
    aget v1, v6, v1

    if-eq v3, v1, :cond_4

    if-nez p2, :cond_4

    .line 772
    :try_start_0
    invoke-virtual {v4}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p2

    invoke-interface {p2, v3, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    .line 773
    invoke-virtual {v2}, Ll/֨ۧܿ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 774
    invoke-static {p2}, Ll/ۘ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "\r"

    const-string v1, "\\r"

    .line 775
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "\t"

    const-string v1, "\\t"

    .line 776
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    .line 777
    :cond_3
    invoke-virtual {v5, p2}, Ll/ۚۖۡ;->֫(Ljava/lang/CharSequence;)V

    if-eqz p1, :cond_6

    .line 779
    invoke-virtual {v5}, Ll/ۚۖۡ;->᩷()V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    :cond_4
    if-nez v0, :cond_5

    .line 785
    invoke-virtual {v5}, Ll/ۚۖۡ;->ۜ()V

    if-eqz p1, :cond_6

    .line 787
    invoke-virtual {v5}, Ll/ۚۖۡ;->᩷()V

    goto :goto_0

    :cond_5
    if-nez p2, :cond_6

    goto :goto_1

    .line 792
    :cond_6
    :goto_0
    invoke-virtual {v5}, Ll/ۚۖۡ;->ᩳ()I

    move-result p1

    if-eqz p1, :cond_7

    .line 793
    invoke-virtual {p0}, Ll/ܶ᩺ᩳ;->ۢ()V

    goto :goto_1

    .line 795
    :cond_7
    invoke-direct {p0}, Ll/ܶ᩺ᩳ;->᩵()V

    :goto_1
    return-void
.end method

.method public final ֫(Z)Z
    .locals 3

    .line 723
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->ۚ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 724
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 725
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->ۡ:Ll/۬ۡۡ;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 726
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->֡:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 727
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->ۜ:Ll/ۚۖۡ;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 728
    invoke-virtual {v0}, Ll/ۚۖۡ;->ۜ()V

    .line 729
    invoke-virtual {v0}, Ll/ۚۖۡ;->᩷()V

    if-eqz p1, :cond_0

    .line 731
    invoke-virtual {v0}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object p1

    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    :cond_0
    return v1

    :cond_1
    return v2
.end method

.method public final ۜ()Z
    .locals 1

    .line 882
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->᩻:Ll/᩸᩺ᩳ;

    invoke-virtual {v0}, Ll/᩸᩺ᩳ;->ۜ()Z

    move-result v0

    return v0
.end method

.method public final ۡ()V
    .locals 1

    .line 920
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->᩻:Ll/᩸᩺ᩳ;

    invoke-virtual {v0}, Ll/᩸᩺ᩳ;->ۢ()V

    return-void
.end method

.method public final ۢ()V
    .locals 2

    .line 827
    invoke-direct {p0}, Ll/ܶ᩺ᩳ;->ۖ()V

    .line 828
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->᩸:Ll/֨ۚۢ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 829
    invoke-direct {p0}, Ll/ܶ᩺ᩳ;->ۘ()V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 745
    invoke-virtual {p0, v0, v0}, Ll/ܶ᩺ᩳ;->֫(ZZ)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 2

    .line 913
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->᩻:Ll/᩸᩺ᩳ;

    invoke-virtual {v0, p1}, Ll/᩸᩺ᩳ;->ۧ(Ljava/lang/String;)V

    .line 914
    invoke-virtual {v0}, Ll/᩸᩺ᩳ;->᩻()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Ll/᩸᩺ᩳ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 915
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    const/4 v1, 0x1

    .line 2070
    invoke-virtual {v0, p1, v1}, Ll/۫ۨᩳ;->֫(Ljava/lang/String;Z)V

    return-void
.end method

.method public final ۧ(Ll/ۤۜܽ;)V
    .locals 5

    .line 621
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->ܶ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 622
    iget-object v2, p0, Ll/ܶ᩺ᩳ;->ۚ:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_1

    const/4 v1, 0x1

    .line 623
    :cond_1
    iget-object v2, p0, Ll/ܶ᩺ᩳ;->᩷:Ll/ۚۖۡ;

    if-eqz v0, :cond_2

    .line 624
    invoke-virtual {v2}, Ll/ۚۖۡ;->ܳ()V

    .line 626
    :cond_2
    iget-object v3, p0, Ll/ܶ᩺ᩳ;->ۜ:Ll/ۚۖۡ;

    if-eqz v1, :cond_3

    .line 627
    invoke-virtual {v3}, Ll/ۚۖۡ;->ܳ()V

    .line 629
    :cond_3
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Z)V

    .line 630
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->֫(Z)V

    const-string v4, ""

    if-eqz v0, :cond_4

    .line 631
    invoke-virtual {v2}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    move-object v0, v4

    :goto_1
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    if-eqz v1, :cond_5

    .line 632
    invoke-virtual {v3}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    :cond_5
    invoke-virtual {p1, v4}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    const/16 v0, 0x7272

    .line 633
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ۡ(I)V

    .line 634
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->۠:Ll/֨ۧܿ;

    invoke-virtual {v0}, Ll/֨ۧܿ;->֫()B

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeByte(I)V

    return-void
.end method

.method public final ۧ(Ll/۬ۜܽ;)V
    .locals 3

    .line 638
    invoke-static {p1}, Ll/ۗܰᩳ;->֫(Ll/۬ۜܽ;)Ll/ۗܰᩳ;

    move-result-object p1

    .line 643
    iget-boolean v0, p1, Ll/ۗܰᩳ;->ܿ:Z

    if-eqz v0, :cond_1

    .line 644
    iget-object v0, p1, Ll/ۗܰᩳ;->֫:Ljava/lang/Byte;

    if-nez v0, :cond_0

    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ܶ᩺ᩳ;->ۘ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_bit"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Ll/۫ۤۡ;->֫(BLjava/lang/String;)B

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    :goto_0
    iget-object v1, p0, Ll/ܶ᩺ᩳ;->۠:Ll/֨ۧܿ;

    invoke-virtual {v1, v0}, Ll/֨ۧܿ;->֫(B)V

    .line 647
    :cond_1
    new-instance v0, Ll/ܺ֨ۡ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p1}, Ll/ܺ֨ۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ۧ(Landroid/view/MenuItem;)Z
    .locals 6

    .line 951
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f0a0489

    const/4 v2, 0x1

    .line 952
    iget-object v3, p0, Ll/ܶ᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    if-ne v0, v1, :cond_0

    .line 953
    invoke-virtual {v3}, Ll/۫ۨᩳ;->֡ܽ()V

    return v2

    :cond_0
    const v1, 0x7f0a065c

    if-ne v0, v1, :cond_1

    .line 955
    invoke-virtual {v3}, Ll/۫ۨᩳ;->ܽᩳ()V

    return v2

    :cond_1
    const v1, 0x7f0a032e

    if-ne v0, v1, :cond_2

    .line 957
    invoke-virtual {v3}, Ll/۫ۨᩳ;->ᩳ()V

    return v2

    :cond_2
    const v1, 0x7f0a0345

    if-ne v0, v1, :cond_3

    .line 959
    invoke-virtual {v3}, Ll/۫ۨᩳ;->ܽ֫()V

    return v2

    :cond_3
    const v1, 0x7f0a037c

    if-ne v0, v1, :cond_4

    .line 961
    invoke-virtual {p0}, Ll/ܶ᩺ᩳ;->֫()V

    return v2

    :cond_4
    const v1, 0x7f0a035a

    if-ne v0, v1, :cond_5

    .line 963
    invoke-virtual {p0}, Ll/ܶ᩺ᩳ;->᩻()V

    return v2

    :cond_5
    const v1, 0x7f0a038c

    .line 964
    iget-object v4, p0, Ll/ܶ᩺ᩳ;->֫:Ll/ۗܺ᩷;

    const/4 v5, 0x0

    if-ne v0, v1, :cond_6

    .line 891
    invoke-static {}, Ll/ۜ᩷ܿ;->ܳ()Ljava/util/List;

    move-result-object p1

    new-array v0, v5, [Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    .line 892
    invoke-static {}, Ll/ۜ᩷ܿ;->ܳ()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Ll/ܶ᩺ᩳ;->᩻:Ll/᩸᩺ᩳ;

    invoke-virtual {v1}, Ll/᩸᩺ᩳ;->ܿ()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 893
    invoke-virtual {v4}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    const v3, 0x7f120611

    .line 894
    invoke-virtual {v1, v3}, Ll/᩵ۚۢ;->ۧ(I)V

    new-instance v3, Ll/᩷᩺ᩳ;

    invoke-direct {v3, p0, v0, p1}, Ll/᩷᩺ᩳ;-><init>(Ll/ܶ᩺ᩳ;I[Ljava/lang/String;)V

    .line 895
    invoke-virtual {v1, p1, v0, v3}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f120189

    const/4 v0, 0x0

    .line 903
    invoke-virtual {v1, p1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f120a15

    .line 904
    invoke-virtual {v1, p1, v0}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 905
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    .line 906
    invoke-virtual {p1}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Ll/ۢ᩺ᩳ;

    invoke-direct {v0, p0}, Ll/ۢ᩺ᩳ;-><init>(Ll/ܶ᩺ᩳ;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return v2

    :cond_6
    const v1, 0x7f0a0380

    if-ne v0, v1, :cond_7

    .line 967
    const-class p1, Ll/ۧۖᩳ;

    invoke-virtual {p0, p1}, Ll/ܶ᩺ᩳ;->֫(Ljava/lang/Class;)V

    return v2

    :cond_7
    const v1, 0x7f0a038a

    if-ne v0, v1, :cond_8

    .line 969
    invoke-virtual {p0}, Ll/ܶ᩺ᩳ;->᩷()V

    return v2

    :cond_8
    const v1, 0x7f0a0536

    if-ne v0, v1, :cond_a

    .line 971
    invoke-virtual {v3}, Ll/۫ۨᩳ;->ۧܽ()Z

    move-result v0

    xor-int/2addr v0, v2

    invoke-virtual {v3, v0}, Ll/۫ۨᩳ;->ۚ(Z)V

    .line 972
    invoke-virtual {v3}, Ll/۫ۨᩳ;->ۧܽ()Z

    move-result v0

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 973
    invoke-virtual {v3}, Ll/۫ۨᩳ;->ۧܽ()Z

    move-result p1

    if-eqz p1, :cond_9

    const-string p1, "smooth_mode"

    const v0, 0x7f1209b3

    .line 974
    invoke-static {v0, v4, p1}, Ll/ۧۛܿ;->֫(ILl/ۗܺ᩷;Ljava/lang/String;)V

    :cond_9
    return v2

    :cond_a
    const v1, 0x7f0a033b

    if-ne v0, v1, :cond_b

    .line 977
    invoke-static {p1, v3}, Ll/ܶ᩺ᩳ;->֫(Landroid/view/MenuItem;Ll/۫ۨᩳ;)V

    return v2

    .line 978
    :cond_b
    invoke-interface {p1}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object p1

    instance-of v0, p1, Ll/ܺ᩻ܿ;

    if-eqz v0, :cond_c

    check-cast p1, Ll/ܺ᩻ܿ;

    .line 979
    invoke-virtual {p1}, Ll/ܺ᩻ܿ;->֫()Ll/ۖ᩻ܿ;

    move-result-object p1

    invoke-virtual {p1, v3}, Ll/ۖ᩻ܿ;->֫(Ll/۫ۨᩳ;)V

    return v2

    :cond_c
    return v5
.end method

.method public final ܳ()Z
    .locals 1

    .line 799
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->ܶ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܺ()V
    .locals 3

    .line 184
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->ۧ:Ll/۠᩺ᩳ;

    invoke-interface {v0}, Ll/۠᩺ᩳ;->ۧ()Ll/ۖۧܿ;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x8

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 185
    :goto_0
    iget-object v2, p0, Ll/ܶ᩺ᩳ;->ܺ:Ll/۬ۡۡ;

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 186
    iget-object v1, p0, Ll/ܶ᩺ᩳ;->۠:Ll/֨ۧܿ;

    invoke-virtual {v1, v0}, Ll/֨ۧܿ;->֫(Ll/ۖۧܿ;)V

    return-void
.end method

.method public final ܽ()V
    .locals 5

    .line 803
    invoke-direct {p0}, Ll/ܶ᩺ᩳ;->ۖ()V

    .line 804
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ܶܽ()V

    .line 805
    iget-object v1, p0, Ll/ܶ᩺ᩳ;->۠:Ll/֨ۧܿ;

    .line 268
    invoke-virtual {v1}, Ll/֨ۧܿ;->ۜ()V

    .line 806
    iget-object v1, p0, Ll/ܶ᩺ᩳ;->ܶ:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-nez v2, :cond_0

    .line 807
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 808
    invoke-direct {p0}, Ll/ܶ᩺ᩳ;->ᩴ()V

    .line 809
    iget-object v1, p0, Ll/ܶ᩺ᩳ;->᩷:Ll/ۚۖۡ;

    invoke-virtual {v1}, Ll/ۚۖۡ;->ܳ()V

    .line 811
    :cond_0
    iget-object v1, p0, Ll/ܶ᩺ᩳ;->ۚ:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_1

    .line 812
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 813
    iget-object v1, p0, Ll/ܶ᩺ᩳ;->ۜ:Ll/ۚۖۡ;

    invoke-virtual {v1}, Ll/ۚۖۡ;->ܳ()V

    .line 815
    :cond_1
    sget-boolean v1, Ll/ܶ᩺ᩳ;->۫:Z

    if-eqz v1, :cond_2

    .line 816
    iget-object v1, p0, Ll/ܶ᩺ᩳ;->ܿ:Ll/֨᩷ۡ;

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 817
    iget-object v1, p0, Ll/ܶ᩺ᩳ;->᩶:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Paint;->isUnderlineText()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 818
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    .line 819
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 822
    :cond_2
    iget-object v1, p0, Ll/ܶ᩺ᩳ;->ۡ:Ll/۬ۡۡ;

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 823
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    return-void
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 924
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->᩻:Ll/᩸᩺ᩳ;

    invoke-virtual {v0}, Ll/᩸᩺ᩳ;->ܿ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()V
    .locals 2

    const/4 v0, 0x1

    .line 874
    iput-boolean v0, p0, Ll/ܶ᩺ᩳ;->ܽ:Z

    .line 875
    invoke-direct {p0}, Ll/ܶ᩺ᩳ;->ۖ()V

    .line 876
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->۠:Ll/֨ۧܿ;

    .line 268
    invoke-virtual {v0}, Ll/֨ۧܿ;->ۜ()V

    .line 877
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->᩸:Ll/֨ۚۢ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 878
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->᩻:Ll/᩸᩺ᩳ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    :try_start_0
    sget-object v1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final ᩷()V
    .locals 3

    .line 237
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->ۗ:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->isChecked()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 238
    iget-object v0, p0, Ll/ܶ᩺ᩳ;->ۗ:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->isChecked()Z

    move-result v0

    iget-object v1, p0, Ll/ܶ᩺ᩳ;->᩻:Ll/᩸᩺ᩳ;

    invoke-virtual {v1, v0}, Ll/᩸᩺ᩳ;->֫(Z)V

    .line 239
    invoke-virtual {v1}, Ll/᩸᩺ᩳ;->ܽ()Ll/᩶۟ᩳ;

    move-result-object v0

    .line 240
    new-instance v1, Ll/ۖ۫ᩳ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/ۖ۫ᩳ;-><init>(ILjava/lang/Object;)V

    iget-object v2, p0, Ll/ܶ᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    invoke-virtual {v2, v0, v1}, Ll/۫ۨᩳ;->֫(Ll/᩶۟ᩳ;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ᩻()V
    .locals 4

    .line 928
    new-instance v0, Ll/֨᩺ᩳ;

    iget-object v1, p0, Ll/ܶ᩺ᩳ;->֫:Ll/ۗܺ᩷;

    invoke-direct {v0, p0, v1}, Ll/֨᩺ᩳ;-><init>(Ll/ܶ᩺ᩳ;Ll/ۗܺ᩷;)V

    const v1, 0x7f1205e5

    .line 942
    invoke-virtual {v0, v1}, Ll/۬ۗܿ;->ۡ(I)V

    const/4 v1, 0x2

    .line 943
    invoke-virtual {v0, v1}, Ll/۬ۗܿ;->ܿ(I)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "1\u2026"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ll/ܶ᩺ᩳ;->ᩳ:Ll/۫ۨᩳ;

    .line 944
    invoke-virtual {v3}, Ll/۫ۨᩳ;->֨֫()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/۬ۗܿ;->ۧ(Ljava/lang/String;)V

    .line 945
    invoke-virtual {v0}, Ll/۬ۗܿ;->֫()V

    .line 946
    invoke-virtual {v0, v1}, Ll/۬ۗܿ;->ᩳ(I)V

    const/4 v1, 0x1

    .line 205
    invoke-virtual {v0, v1}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void
.end method
