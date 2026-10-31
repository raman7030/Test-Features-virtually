.class public final Ll/᩹۠ܳ;
.super Ljava/lang/Object;
.source "P4TK"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final ۗ:Landroid/widget/CheckBox;

.field public final ۙ:[Landroid/widget/RadioButton;

.field public final ۫:Ll/ܽۢܳ;

.field public final ۬:Landroid/widget/CheckBox;

.field public ᩶:Ll/ۗ᩻᩻;

.field public final ᩸:Ljava/lang/String;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Ll/ܽۢܳ;)V
    .locals 10

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v1, v0, [Landroid/widget/RadioButton;

    .line 34
    iput-object v1, p0, Ll/᩹۠ܳ;->ۙ:[Landroid/widget/RadioButton;

    .line 42
    iput-object p2, p0, Ll/᩹۠ܳ;->۫:Ll/ܽۢܳ;

    .line 43
    sget v2, Ll/۟۬ܳ;->֫:I

    const-string v2, "local"

    .line 202
    invoke-virtual {p2, v2}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 204
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "local:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ll/ܽۢܳ;->ۚ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 206
    :cond_0
    invoke-virtual {p2}, Ll/ܽۢܳ;->ۚ()Ljava/lang/String;

    move-result-object v3

    .line 43
    :goto_0
    iput-object v3, p0, Ll/᩹۠ܳ;->᩹:Ljava/lang/String;

    .line 214
    invoke-virtual {p2}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v3

    invoke-static {v3}, Ll/۟۬ܳ;->֫(Ll/ܽ᩷ܳ;)Ljava/lang/String;

    move-result-object v3

    .line 44
    iput-object v3, p0, Ll/᩹۠ܳ;->᩸:Ljava/lang/String;

    .line 45
    invoke-virtual {p2, v2}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v2

    const-string v4, "net"

    .line 46
    invoke-virtual {p2, v4}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 47
    invoke-virtual {p2}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v5

    check-cast v5, Ll/ۚۡ᩻;

    invoke-virtual {v5}, Ll/ۚۡ᩻;->ܿ֫()Ll/ۗ᩻᩻;

    move-result-object v5

    iput-object v5, p0, Ll/᩹۠ܳ;->᩶:Ll/ۗ᩻᩻;

    :cond_1
    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez v3, :cond_4

    if-nez v2, :cond_2

    .line 49
    iget-object v3, p0, Ll/᩹۠ܳ;->᩶:Ll/ۗ᩻᩻;

    if-eqz v3, :cond_3

    :cond_2
    invoke-virtual {p2}, Ll/ܽۢܳ;->۫()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v3, 0x1

    :goto_2
    const v7, 0x7f0d00f9

    .line 51
    invoke-virtual {p1, v7}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v7

    const v8, 0x7f0a0631

    .line 52
    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    const v9, 0x7f0a047e

    .line 53
    invoke-virtual {v7, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/RadioButton;

    aput-object v9, v1, v6

    const v9, 0x7f0a047d

    .line 54
    invoke-virtual {v7, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/RadioButton;

    aput-object v9, v1, v5

    const v5, 0x7f0a047f

    .line 55
    invoke-virtual {v7, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/RadioButton;

    const/4 v9, 0x2

    aput-object v5, v1, v9

    const v5, 0x7f0a0480

    .line 56
    invoke-virtual {v7, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/RadioButton;

    const/4 v9, 0x3

    aput-object v5, v1, v9

    :goto_3
    if-ge v6, v0, :cond_5

    .line 57
    aget-object v5, v1, v6

    .line 58
    invoke-virtual {v5, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_5
    const v0, 0x7f0a0540

    .line 60
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Ll/᩹۠ܳ;->۬:Landroid/widget/CheckBox;

    const v0, 0x7f0a053f

    .line 61
    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Ll/᩹۠ܳ;->ۗ:Landroid/widget/CheckBox;

    .line 62
    iget-object v1, p0, Ll/᩹۠ܳ;->᩸:Ljava/lang/String;

    if-eqz v1, :cond_6

    const v1, 0x7f12060c

    .line 63
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 65
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x7f12060b

    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ll/ܽۢܳ;->᩺()Z

    move-result v1

    if-eqz v1, :cond_7

    const v1, 0x7f120514

    goto :goto_4

    :cond_7
    const v1, 0x7f1208be

    :goto_4
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    new-instance v0, Ll/֨۠ܳ;

    invoke-direct {v0, p0, v3, v2, p2}, Ll/֨۠ܳ;-><init>(Ll/᩹۠ܳ;ZZLl/ܽۢܳ;)V

    .line 102
    invoke-virtual {p1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v1

    .line 103
    new-instance v2, Ll/᩸۠ܳ;

    invoke-direct {v2, v0}, Ll/᩸۠ܳ;-><init>(Ll/֨۠ܳ;)V

    .line 109
    invoke-virtual {v1, v2}, Ll/۟ۢ֫;->֫(Ll/ܳۡ֫;)V

    .line 110
    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    invoke-virtual {v0, v7}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v3, 0x7f12070a

    .line 111
    invoke-virtual {v0, v3, p0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v3, 0x7f12015e

    const/4 v5, 0x0

    .line 112
    invoke-virtual {v0, v3, v5}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v3, 0x7f120715

    .line 113
    invoke-virtual {v0, v3, v5}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v3, Ll/۠۠ܳ;

    check-cast v1, Ll/᩷ۡ֫;

    invoke-direct {v3, v1, v2}, Ll/۠۠ܳ;-><init>(Ll/᩷ۡ֫;Ll/᩸۠ܳ;)V

    .line 114
    invoke-virtual {v0, v3}, Ll/᩵ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 115
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v0

    .line 116
    invoke-virtual {p2, v4}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_8

    iget-object p2, p0, Ll/᩹۠ܳ;->᩶:Ll/ۗ᩻᩻;

    if-nez p2, :cond_8

    .line 117
    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 119
    :cond_8
    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object p2

    new-instance v0, Ll/ܶ۠ܳ;

    invoke-direct {v0, p0, p1}, Ll/ܶ۠ܳ;-><init>(Ll/᩹۠ܳ;Ll/ۗܺ᩷;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    const/4 p1, 0x0

    const/4 p2, 0x0

    :goto_0
    const/4 v0, 0x4

    if-ge p2, v0, :cond_1

    .line 133
    iget-object v0, p0, Ll/᩹۠ܳ;->ۙ:[Landroid/widget/RadioButton;

    aget-object v0, v0, p2

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 137
    :cond_1
    :goto_1
    iget-object v0, p0, Ll/᩹۠ܳ;->ۗ:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    const-string v2, "local"

    iget-object v3, p0, Ll/᩹۠ܳ;->᩸:Ljava/lang/String;

    iget-object v4, p0, Ll/᩹۠ܳ;->᩶:Ll/ۗ᩻᩻;

    iget-object v5, p0, Ll/᩹۠ܳ;->۫:Ll/ܽۢܳ;

    iget-object v6, p0, Ll/᩹۠ܳ;->۬:Landroid/widget/CheckBox;

    iget-object v7, p0, Ll/᩹۠ܳ;->᩹:Ljava/lang/String;

    if-eqz v1, :cond_4

    if-eqz v3, :cond_2

    .line 140
    invoke-virtual {v6}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    invoke-static {p2, v3, v0}, Ll/۟۬ܳ;->֫(ILjava/lang/String;Z)V

    goto/16 :goto_3

    :cond_2
    if-eqz v4, :cond_3

    .line 143
    iget-object v0, v4, Ll/ۗ᩻᩻;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v6}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    invoke-static {p2, v1}, Ll/۟۬ܳ;->֫(IZ)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, v7, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    invoke-static {}, Ll/۫᩻᩻;->᩻()V

    goto :goto_3

    .line 146
    :cond_3
    invoke-virtual {v5, v2}, Ll/ܽۢܳ;->֫(Ljava/lang/String;)V

    .line 147
    sget-object p1, Ll/᩶ۖ᩷;->ܺ:Ljava/util/HashMap;

    invoke-virtual {v6}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    invoke-static {p2, v0}, Ll/۟۬ܳ;->֫(IZ)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, v7, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    goto :goto_3

    .line 151
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_7

    if-eqz v3, :cond_5

    .line 154
    invoke-static {v3}, Ll/۟۬ܳ;->֫(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    if-eqz v4, :cond_6

    .line 155
    iget-object v0, v4, Ll/ۗ᩻᩻;->ܰ:Ljava/util/HashMap;

    .line 157
    invoke-virtual {v0, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 158
    invoke-virtual {v0, v7}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    invoke-static {}, Ll/۫᩻᩻;->᩻()V

    goto :goto_2

    .line 162
    :cond_6
    invoke-virtual {v5, v2}, Ll/ܽۢܳ;->֫(Ljava/lang/String;)V

    .line 163
    sget-object v0, Ll/᩶ۖ᩷;->ܺ:Ljava/util/HashMap;

    invoke-virtual {v0, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 164
    invoke-virtual {v0, v7}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    .line 170
    :cond_7
    :goto_2
    invoke-virtual {v5}, Ll/ܽۢܳ;->᩺()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 171
    sput p2, Ll/᩶ۖ᩷;->ܽ:I

    .line 172
    invoke-virtual {v6}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p2

    sput-boolean p2, Ll/᩶ۖ᩷;->ܿ:Z

    goto :goto_3

    .line 174
    :cond_8
    sput p2, Ll/᩶ۖ᩷;->ᩳ:I

    .line 175
    invoke-virtual {v6}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p2

    sput-boolean p2, Ll/᩶ۖ᩷;->ܳ:Z

    .line 178
    :goto_3
    invoke-virtual {v5}, Ll/ܽۢܳ;->᩺()Z

    move-result p2

    sget v0, Ll/᩶ۖ᩷;->ܽ:I

    .line 79
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    if-eqz p1, :cond_9

    .line 81
    sget-object p1, Ll/᩶ۖ᩷;->ܺ:Ljava/util/HashMap;

    invoke-static {p1}, Ll/᩶ۖ᩷;->֫(Ljava/util/HashMap;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "sort_only_in_path_list"

    invoke-interface {v0, v1, p1}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    :cond_9
    if-eqz p2, :cond_a

    const-string p1, "file_cmp_sort_left"

    .line 83
    sget p2, Ll/᩶ۖ᩷;->ܽ:I

    invoke-interface {v0, p2, p1}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    const-string p1, "file_cmp_reverse_left"

    .line 84
    sget-boolean p2, Ll/᩶ۖ᩷;->ܿ:Z

    invoke-interface {v0, p1, p2}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    goto :goto_4

    :cond_a
    const-string p1, "file_cmp_sort_right"

    .line 86
    sget p2, Ll/᩶ۖ᩷;->ᩳ:I

    invoke-interface {v0, p2, p1}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    const-string p1, "file_cmp_reverse_right"

    .line 87
    sget-boolean p2, Ll/᩶ۖ᩷;->ܳ:Z

    invoke-interface {v0, p1, p2}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    .line 89
    :goto_4
    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    .line 179
    invoke-virtual {v5}, Ll/ܽۢܳ;->ܽ֫()V

    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 184
    iget-object v0, p0, Ll/᩹۠ܳ;->ۙ:[Landroid/widget/RadioButton;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    if-ne v3, p1, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    .line 185
    :goto_1
    invoke-virtual {v3, v4}, Landroid/widget/CompoundButton;->setChecked(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
