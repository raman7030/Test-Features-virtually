.class public final Ll/ܺܳ᩻;
.super Ll/۬ۗܿ;
.source "OAHZ"


# instance fields
.field public final synthetic ֫֫:Ll/ᩳۜܳ;

.field public final synthetic ۟:Ljava/lang/Object;

.field public final synthetic ۧ֫:Z

.field public final synthetic ܽ֫:Ljava/lang/String;

.field public final synthetic ܿ֫:Ll/ۗۢ᩻;

.field public final synthetic ᩳ֫:Ll/ۖۢܳ;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Ljava/lang/String;ZLjava/util/Map;Ll/ᩳۜܳ;Ll/ۖۢܳ;Ll/ۗۢ᩻;)V
    .locals 0

    .line 91
    iput-object p2, p0, Ll/ܺܳ᩻;->ܽ֫:Ljava/lang/String;

    iput-boolean p3, p0, Ll/ܺܳ᩻;->ۧ֫:Z

    iput-object p4, p0, Ll/ܺܳ᩻;->۟:Ljava/lang/Object;

    iput-object p5, p0, Ll/ܺܳ᩻;->֫֫:Ll/ᩳۜܳ;

    iput-object p6, p0, Ll/ܺܳ᩻;->ᩳ֫:Ll/ۖۢܳ;

    iput-object p7, p0, Ll/ܺܳ᩻;->ܿ֫:Ll/ۗۢ᩻;

    const/4 p2, -0x1

    .line 40
    invoke-direct {p0, p1, p2}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 13

    .line 95
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v4

    .line 97
    iget-object v0, p0, Ll/ܺܳ᩻;->ܽ֫:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v1, "\\"

    .line 99
    invoke-virtual {v4, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_9

    const-string v1, "/"

    invoke-virtual {v4, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_3

    .line 101
    :cond_1
    iget-boolean v1, p0, Ll/ܺܳ᩻;->ۧ֫:Z

    if-eqz v1, :cond_2

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    :cond_2
    iget-object v0, p0, Ll/ܺܳ᩻;->۟:Ljava/lang/Object;

    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 103
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    const v0, 0x7f1208c2

    .line 104
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    :cond_3
    const v0, 0x7f1208c1

    .line 106
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    .line 108
    iget-object v3, p0, Ll/ܺܳ᩻;->֫֫:Ll/ᩳۜܳ;

    invoke-interface {v3}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 217
    iget-object v7, p0, Ll/ܺܳ᩻;->ᩳ֫:Ll/ۖۢܳ;

    invoke-virtual {v7}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v5

    const v0, 0x7f0d00ec

    .line 218
    invoke-virtual {v5, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a03b2

    .line 219
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f0a047a

    .line 221
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v6, 0x8

    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    const v2, 0x7f0a0478

    .line 223
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RadioButton;

    const v6, 0x7f0a0479

    .line 224
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/RadioButton;

    const v8, 0x7f0a047b

    .line 225
    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/RadioButton;

    const/4 v9, 0x3

    new-array v10, v9, [Landroid/widget/RadioButton;

    const/4 v11, 0x0

    aput-object v2, v10, v11

    const/4 v2, 0x1

    aput-object v6, v10, v2

    const/4 v6, 0x2

    aput-object v8, v10, v6

    .line 227
    invoke-interface {v3}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v8

    new-array v12, v6, [Ljava/lang/Object;

    aput-object v8, v12, v11

    aput-object v4, v12, v2

    const v8, 0x7f120887

    invoke-virtual {v5, v8, v12}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v8, "rcon"

    invoke-interface {v1, v11, v8}, Ll/۫ۤۡ;->֫(BLjava/lang/String;)B

    move-result v1

    if-ltz v1, :cond_5

    if-le v1, v6, :cond_4

    goto :goto_0

    :cond_4
    move v6, v1

    goto :goto_1

    :cond_5
    :goto_0
    const/4 v1, 0x0

    const/4 v6, 0x0

    .line 234
    :goto_1
    aget-object v1, v10, v6

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 235
    new-instance v1, Ll/᩷ܳ᩻;

    invoke-direct {v1, v10}, Ll/᩷ܳ᩻;-><init>([Landroid/widget/RadioButton;)V

    const/4 v2, 0x0

    :goto_2
    if-ge v2, v9, :cond_6

    .line 240
    aget-object v8, v10, v2

    .line 241
    invoke-virtual {v8, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 244
    :cond_6
    invoke-virtual {v5}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v9

    .line 245
    invoke-virtual {v9, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    new-instance v12, Ll/ۢܳ᩻;

    iget-object v8, p0, Ll/ܺܳ᩻;->ܿ֫:Ll/ۗۢ᩻;

    move-object v0, v12

    move-object v1, v10

    move v2, v6

    move-object v6, v8

    move-object v8, p0

    invoke-direct/range {v0 .. v8}, Ll/ۢܳ᩻;-><init>([Landroid/widget/RadioButton;ILl/ᩳۜܳ;Ljava/lang/String;Lbin/mt/plus/Main;Ll/ۗۢ᩻;Ll/ۖۢܳ;Ll/۬ۗܿ;)V

    const v0, 0x7f12070a

    .line 246
    invoke-virtual {v9, v0, v12}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    const/4 v1, 0x0

    .line 339
    invoke-virtual {v9, v0, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 340
    invoke-virtual {v9, v11}, Ll/᩵ۚۢ;->֫(Z)V

    .line 341
    invoke-virtual {v9}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    :cond_7
    return-void

    .line 113
    :cond_8
    new-instance v0, Ll/ۡܳ᩻;

    invoke-direct {v0, p0, v4}, Ll/ۡܳ᩻;-><init>(Ll/ܺܳ᩻;Ljava/lang/String;)V

    .line 149
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void

    :cond_9
    :goto_3
    const v0, 0x7f1203ae

    .line 100
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 98
    :cond_a
    :goto_4
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
