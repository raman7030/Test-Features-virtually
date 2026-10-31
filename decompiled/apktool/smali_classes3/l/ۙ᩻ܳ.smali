.class public Ll/ۙ᩻ܳ;
.super Ll/ۗܺ᩷;
.source "K7HV"


# static fields
.field public static final synthetic ᩻ۧ:I


# instance fields
.field public ܳۧ:Ljava/util/ArrayList;

.field public ܿۧ:Ll/ۚ᩻ܳ;

.field public ᩳۧ:Ll/֡᩻ܳ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۙ᩻ܳ;)Ll/֡᩻ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙ᩻ܳ;->ᩳۧ:Ll/֡᩻ܳ;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۙ᩻ܳ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۙ᩻ܳ;->ᩳ(I)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۙ᩻ܳ;Ll/ۤۤᩳ;[Landroid/widget/RadioButton;Landroid/widget/CheckBox;ILl/֡ۚۢ;)V
    .locals 2

    .line 168
    invoke-virtual {p1}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result v0

    if-nez v0, :cond_0

    .line 169
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    const p0, 0x7f12073e

    .line 170
    invoke-static {p0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x4

    if-ge v0, v1, :cond_2

    .line 175
    aget-object v1, p2, v0

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 178
    :cond_2
    :goto_1
    new-instance p2, Ll/֨᩻ܳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ܽ᩷ܳ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p3

    invoke-static {v0, p3}, Ll/۟۬ܳ;->֫(IZ)I

    move-result p3

    invoke-direct {p2, p1, p3}, Ll/֨᩻ܳ;-><init>(Ljava/lang/String;I)V

    const/4 p1, -0x1

    if-ne p4, p1, :cond_3

    .line 180
    iget-object p1, p0, Ll/ۙ᩻ܳ;->ܳۧ:Ljava/util/ArrayList;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 181
    iget-object p1, p0, Ll/ۙ᩻ܳ;->ᩳۧ:Ll/֡᩻ܳ;

    iget-object p3, p0, Ll/ۙ᩻ܳ;->ܳۧ:Ljava/util/ArrayList;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    add-int/lit8 p3, p3, -0x1

    invoke-virtual {p1, p3}, Ll/᩶ۗۧ;->notifyItemInserted(I)V

    goto :goto_2

    .line 183
    :cond_3
    iget-object p1, p0, Ll/ۙ᩻ܳ;->ܳۧ:Ljava/util/ArrayList;

    invoke-interface {p1, p4, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 184
    iget-object p1, p0, Ll/ۙ᩻ܳ;->ᩳۧ:Ll/֡᩻ܳ;

    invoke-virtual {p1, p4}, Ll/᩶ۗۧ;->notifyItemChanged(I)V

    .line 186
    :goto_2
    iget-object p0, p0, Ll/ۙ᩻ܳ;->ܿۧ:Ll/ۚ᩻ܳ;

    invoke-interface {p0, p2}, Ll/ۚ᩻ܳ;->֫(Ll/֨᩻ܳ;)V

    .line 187
    invoke-virtual {p5}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۙ᩻ܳ;)Ll/ۚ᩻ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙ᩻ܳ;->ܿۧ:Ll/ۚ᩻ܳ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۙ᩻ܳ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙ᩻ܳ;->ܳۧ:Ljava/util/ArrayList;

    return-object p0
.end method

.method private ᩳ(I)V
    .locals 12

    const v0, 0x7f0d0070

    .line 130
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, -0x1

    if-ne p1, v1, :cond_0

    const v2, 0x7f0a0631

    .line 132
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f1205ad

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    const v2, 0x7f0a042d

    .line 134
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/ۤۤᩳ;

    const v3, 0x7f0a047e

    .line 136
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RadioButton;

    const v4, 0x7f0a047d

    .line 137
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/RadioButton;

    const v5, 0x7f0a047f

    .line 138
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/RadioButton;

    const v6, 0x7f0a0480

    .line 139
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/RadioButton;

    const/4 v7, 0x4

    new-array v8, v7, [Landroid/widget/RadioButton;

    const/4 v9, 0x0

    aput-object v3, v8, v9

    const/4 v3, 0x1

    aput-object v4, v8, v3

    const/4 v4, 0x2

    aput-object v5, v8, v4

    const/4 v4, 0x3

    aput-object v6, v8, v4

    const v4, 0x7f0a0540

    .line 140
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Landroid/widget/CheckBox;

    .line 141
    new-instance v4, Ll/ۘ᩻ܳ;

    invoke-direct {v4, v8}, Ll/ۘ᩻ܳ;-><init>([Landroid/widget/RadioButton;)V

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v7, :cond_1

    .line 146
    aget-object v6, v8, v5

    .line 147
    invoke-virtual {v6, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    if-ne p1, v1, :cond_2

    .line 150
    aget-object v4, v8, v9

    invoke-virtual {v4, v3}, Landroid/widget/CompoundButton;->setChecked(Z)V

    goto :goto_2

    .line 152
    :cond_2
    iget-object v4, p0, Ll/ۙ᩻ܳ;->ܳۧ:Ljava/util/ArrayList;

    invoke-interface {v4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֨᩻ܳ;

    .line 153
    invoke-virtual {v4}, Ll/֨᩻ܳ;->ܽ()I

    move-result v5

    invoke-static {v5}, Ll/۟۬ܳ;->֫(I)I

    move-result v5

    .line 154
    invoke-virtual {v4}, Ll/֨᩻ܳ;->ܽ()I

    move-result v6

    invoke-static {v6}, Ll/۟۬ܳ;->ۧ(I)Z

    move-result v6

    .line 155
    invoke-static {v4}, Ll/֨᩻ܳ;->֫(Ll/֨᩻ܳ;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    if-ltz v5, :cond_3

    if-ge v5, v7, :cond_3

    .line 157
    aget-object v4, v8, v5

    invoke-virtual {v4, v3}, Landroid/widget/CompoundButton;->setChecked(Z)V

    goto :goto_1

    .line 159
    :cond_3
    aget-object v4, v8, v9

    invoke-virtual {v4, v3}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 161
    :goto_1
    invoke-virtual {v10, v6}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 163
    :goto_2
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v3

    invoke-virtual {v3, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v0, 0x7f12070a

    const/4 v4, 0x0

    .line 164
    invoke-virtual {v3, v0, v4}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    .line 165
    invoke-virtual {v3, v0, v4}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 166
    invoke-virtual {v3}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v9

    .line 167
    invoke-virtual {v9}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    new-instance v11, Ll/ᩴ᩻ܳ;

    move-object v3, v11

    move-object v4, p0

    move-object v5, v2

    move-object v6, v8

    move-object v7, v10

    move v8, p1

    invoke-direct/range {v3 .. v9}, Ll/ᩴ᩻ܳ;-><init>(Ll/ۙ᩻ܳ;Ll/ۤۤᩳ;[Landroid/widget/RadioButton;Landroid/widget/CheckBox;ILl/֡ۚۢ;)V

    invoke-virtual {v0, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-ne p1, v1, :cond_4

    .line 190
    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    :cond_4
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 50
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0d004d

    .line 51
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f120219

    .line 52
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f0a063a

    .line 53
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۢᩴ;

    iput-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    .line 54
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->֫(Ll/ۢᩴ;)V

    .line 55
    invoke-virtual {p0}, Ll/ۗܺ᩷;->ۗ()V

    .line 56
    iget-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    new-instance v0, Ll/ܺ᩻ܳ;

    invoke-direct {v0, p0}, Ll/ܺ᩻ܳ;-><init>(Ll/ۙ᩻ܳ;)V

    invoke-virtual {p1, v0}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f0a0486

    .line 57
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/۬۬ۧ;

    const v0, 0x7f0a0191

    .line 58
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f1206eb

    .line 59
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 61
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "NetworkConfigId"

    const/4 v3, -0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    if-ne v1, v3, :cond_0

    .line 63
    new-instance v1, Ll/۠᩻ܳ;

    .line 310
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 63
    iput-object v1, p0, Ll/ۙ᩻ܳ;->ܿۧ:Ll/ۚ᩻ܳ;

    goto :goto_0

    .line 65
    :cond_0
    invoke-static {v1}, Ll/۫᩻᩻;->ܽ(I)Ll/ۗ᩻᩻;

    move-result-object v2

    if-nez v2, :cond_1

    .line 67
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Network config not found: id-"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    .line 68
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 71
    :cond_1
    new-instance v1, Ll/ܶ᩻ܳ;

    invoke-direct {v1, v2}, Ll/ܶ᩻ܳ;-><init>(Ll/ۗ᩻᩻;)V

    iput-object v1, p0, Ll/ۙ᩻ܳ;->ܿۧ:Ll/ۚ᩻ܳ;

    .line 73
    :goto_0
    iget-object v1, p0, Ll/ۙ᩻ܳ;->ܿۧ:Ll/ۚ᩻ܳ;

    invoke-interface {v1}, Ll/ۚ᩻ܳ;->֫()Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Ll/ۙ᩻ܳ;->ܳۧ:Ljava/util/ArrayList;

    .line 74
    new-instance v2, Ll/ۖ᩻ܳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v2}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 76
    new-instance v1, Ll/֡᩻ܳ;

    invoke-direct {v1, p0}, Ll/֡᩻ܳ;-><init>(Ll/ۙ᩻ܳ;)V

    iput-object v1, p0, Ll/ۙ᩻ܳ;->ᩳۧ:Ll/֡᩻ܳ;

    .line 77
    new-instance v2, Ll/᩵᩻ܳ;

    invoke-direct {v2, p0, v0}, Ll/᩵᩻ܳ;-><init>(Ll/ۙ᩻ܳ;Landroid/widget/TextView;)V

    invoke-virtual {v1, v2}, Ll/᩶ۗۧ;->registerAdapterDataObserver(Ll/ۗۗۧ;)V

    .line 108
    iget-object v1, p0, Ll/ۙ᩻ܳ;->ܳۧ:Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    const/16 v1, 0x8

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 109
    iget-object v0, p0, Ll/ۙ᩻ܳ;->ᩳۧ:Ll/֡᩻ܳ;

    invoke-virtual {p1, v0}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    return-void
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 3

    const v0, 0x7f0a0327

    const v1, 0x7f1205ad

    const/4 v2, 0x0

    .line 114
    invoke-interface {p1, v2, v0, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const/4 v0, 0x2

    .line 115
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setShowAsAction(I)V

    const v0, 0x7f0801a4

    .line 116
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/4 p1, 0x1

    return p1
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .line 122
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f0a0327

    if-ne p1, v0, :cond_0

    const/4 p1, -0x1

    .line 123
    invoke-direct {p0, p1}, Ll/ۙ᩻ܳ;->ᩳ(I)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "CustomSortingMethodActivity"

    return-object v0
.end method
