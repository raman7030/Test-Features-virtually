.class public final Ll/۟᩹᩻;
.super Ll/۬ۗܿ;
.source "J1YX"


# instance fields
.field public final synthetic ֫֫:Z

.field public final synthetic ۜ֫:Ll/ܶ᩵ܿ;

.field public final synthetic ۟:Ll/᩻᩶᩻;

.field public final synthetic ۧ֫:Ljava/util/List;

.field public final synthetic ܳ֫:Ljava/lang/String;

.field public final synthetic ܽ֫:Ll/ᩳۜܳ;

.field public final synthetic ܿ֫:Ljava/lang/String;

.field public final synthetic ᩳ֫:Z

.field public final synthetic ᩻֫:Ll/ۖۢܳ;


# direct methods
.method public constructor <init>(Ll/᩻᩶᩻;Lbin/mt/plus/Main;Ljava/lang/String;Ll/ᩳۜܳ;Ljava/util/List;Ll/ۖۢܳ;ZLjava/lang/String;Ll/ܶ᩵ܿ;Z)V
    .locals 0

    .line 124
    iput-object p1, p0, Ll/۟᩹᩻;->۟:Ll/᩻᩶᩻;

    iput-object p3, p0, Ll/۟᩹᩻;->ܿ֫:Ljava/lang/String;

    iput-object p4, p0, Ll/۟᩹᩻;->ܽ֫:Ll/ᩳۜܳ;

    iput-object p5, p0, Ll/۟᩹᩻;->ۧ֫:Ljava/util/List;

    iput-object p6, p0, Ll/۟᩹᩻;->᩻֫:Ll/ۖۢܳ;

    iput-boolean p7, p0, Ll/۟᩹᩻;->֫֫:Z

    iput-object p8, p0, Ll/۟᩹᩻;->ܳ֫:Ljava/lang/String;

    iput-object p9, p0, Ll/۟᩹᩻;->ۜ֫:Ll/ܶ᩵ܿ;

    iput-boolean p10, p0, Ll/۟᩹᩻;->ᩳ֫:Z

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 17

    move-object/from16 v13, p0

    .line 127
    invoke-virtual/range {p0 .. p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    :goto_0
    const-string v0, "/"

    .line 128
    invoke-virtual {v4, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v14, 0x0

    if-eqz v1, :cond_0

    .line 0
    invoke-static {v2, v14, v4}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 132
    :cond_0
    iget-object v5, v13, Ll/۟᩹᩻;->ܿ֫:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    .line 133
    iget-object v1, v13, Ll/۟᩹᩻;->ܽ֫:Ll/ᩳۜܳ;

    invoke-interface {v1}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v1

    iget-object v12, v13, Ll/۟᩹᩻;->ۜ֫:Ll/ܶ᩵ܿ;

    iget-object v3, v13, Ll/۟᩹᩻;->ۧ֫:Ljava/util/List;

    iget-object v11, v13, Ll/۟᩹᩻;->᩻֫:Ll/ۖۢܳ;

    if-eqz v1, :cond_5

    .line 134
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ᩺ۡ;

    .line 135
    invoke-virtual {v1}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const v0, 0x7f1208c1

    .line 137
    invoke-virtual {v13, v0}, Ll/۬ۗܿ;->ۧ(I)V

    .line 189
    invoke-virtual {v11}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v8

    const v0, 0x7f0d00ec

    .line 190
    invoke-virtual {v8, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a03b2

    .line 191
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v3, 0x7f0a0478

    .line 193
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RadioButton;

    const v6, 0x7f0a0479

    .line 194
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/RadioButton;

    const v7, 0x7f0a047b

    .line 195
    invoke-virtual {v0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/RadioButton;

    const/4 v9, 0x3

    new-array v10, v9, [Landroid/widget/RadioButton;

    aput-object v3, v10, v14

    aput-object v6, v10, v2

    const/4 v3, 0x2

    aput-object v7, v10, v3

    const v6, 0x7f0a047a

    .line 198
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    const/16 v7, 0x8

    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 200
    invoke-static {v5}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 201
    invoke-static {v4}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-array v15, v3, [Ljava/lang/Object;

    aput-object v6, v15, v14

    aput-object v7, v15, v2

    const v6, 0x7f120887

    .line 202
    invoke-virtual {v8, v6, v15}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 204
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v6, "rcoz"

    invoke-interface {v1, v14, v6}, Ll/۫ۤۡ;->֫(BLjava/lang/String;)B

    move-result v1

    if-ltz v1, :cond_3

    if-le v1, v3, :cond_2

    goto :goto_1

    :cond_2
    move v6, v1

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v1, 0x0

    const/4 v6, 0x0

    .line 208
    :goto_2
    aget-object v1, v10, v6

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 210
    new-instance v1, Ll/֨ۚۡ;

    invoke-direct {v1, v3, v10}, Ll/֨ۚۡ;-><init>(ILjava/lang/Object;)V

    const/4 v2, 0x0

    :goto_3
    if-ge v2, v9, :cond_4

    .line 215
    aget-object v3, v10, v2

    .line 216
    invoke-virtual {v3, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 220
    :cond_4
    invoke-virtual {v8}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v15

    .line 221
    invoke-virtual {v15, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    new-instance v9, Ll/ۨ᩹᩻;

    iget-object v1, v13, Ll/۟᩹᩻;->۟:Ll/᩻᩶᩻;

    iget-object v7, v13, Ll/۟᩹᩻;->ۧ֫:Ljava/util/List;

    iget-boolean v3, v13, Ll/۟᩹᩻;->֫֫:Z

    iget-object v2, v13, Ll/۟᩹᩻;->ܳ֫:Ljava/lang/String;

    move-object v0, v9

    move-object/from16 v16, v2

    move-object v2, v10

    move v10, v3

    move v3, v6

    move-object v6, v7

    move v7, v10

    move-object v10, v9

    move-object/from16 v9, v16

    move-object v14, v10

    move-object/from16 v10, p0

    invoke-direct/range {v0 .. v12}, Ll/ۨ᩹᩻;-><init>(Ll/᩻᩶᩻;[Landroid/widget/RadioButton;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLbin/mt/plus/Main;Ljava/lang/String;Ll/۬ۗܿ;Ll/ۖۢܳ;Ll/ܶ᩵ܿ;)V

    const v0, 0x7f12070a

    .line 222
    invoke-virtual {v15, v0, v14}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    const/4 v1, 0x0

    .line 267
    invoke-virtual {v15, v0, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const/4 v1, 0x0

    .line 268
    invoke-virtual {v15, v1}, Ll/᩵ۚۢ;->֫(Z)V

    .line 269
    invoke-virtual {v15}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 144
    :cond_5
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 145
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗ᩺ۡ;

    .line 146
    invoke-virtual {v3}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    const v0, 0x7f1208c2

    .line 147
    invoke-virtual {v13, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 152
    :cond_7
    new-instance v0, Ll/ᩳ᩶᩻;

    iget-boolean v1, v13, Ll/۟᩹᩻;->ᩳ֫:Z

    invoke-direct {v0, v5, v4, v1, v2}, Ll/ᩳ᩶᩻;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 153
    iget-boolean v1, v13, Ll/۟᩹᩻;->֫֫:Z

    if-eqz v1, :cond_8

    .line 154
    invoke-virtual {v11}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v1

    new-instance v2, Ll/ܰ᩹᩻;

    invoke-direct {v2, v13, v11, v12, v0}, Ll/ܰ᩹᩻;-><init>(Ll/۟᩹᩻;Ll/ۖۢܳ;Ll/ܶ᩵ܿ;Ll/ᩳ᩶᩻;)V

    iget-object v0, v13, Ll/۟᩹᩻;->ܳ֫:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ll/ۤۗܳ;->֫(Ll/۬ۗܳ;Ll/ۗܺ᩷;Ljava/lang/String;)V

    return-void

    .line 159
    :cond_8
    invoke-virtual/range {p0 .. p0}, Ll/۬ۗܿ;->ۧ()V

    .line 160
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 v10, 0x0

    const/4 v0, 0x0

    const-string v8, ""

    move-object v6, v11

    move-object v7, v12

    move v11, v0

    invoke-static/range {v6 .. v11}, Ll/᩻᩶᩻;->֫(Ll/ۖۢܳ;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/util/List;Ll/ۨۧᩳ;Z)V

    return-void

    .line 163
    :cond_9
    invoke-virtual/range {p0 .. p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
