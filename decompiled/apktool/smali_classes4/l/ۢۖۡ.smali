.class public Ll/ۢۖۡ;
.super Ll/ۗܺ᩷;
.source "T8W7"


# static fields
.field public static final synthetic ᩻ۧ:I


# instance fields
.field public ܳۧ:Ll/֫ۗۧ;

.field public ܿۧ:Ljava/util/ArrayList;

.field public ᩳۧ:Ll/ܳۖۡ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    .line 38
    invoke-static {}, Ll/֫ۖۡ;->ۧ()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Ll/ۢۖۡ;->ܿۧ:Ljava/util/ArrayList;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۢۖۡ;)Ll/ܳۖۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۖۡ;->ᩳۧ:Ll/ܳۖۡ;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۢۖۡ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۢۖۡ;->ᩳ(I)V

    return-void
.end method

.method public static ֫(Ll/ۢۖۡ;Ll/ۤۤᩳ;Ll/۟ܺۡ;Ll/ۤۤᩳ;ILl/֡ۚۢ;)V
    .locals 2

    .line 179
    iget-object v0, p0, Ll/ۢۖۡ;->ܿۧ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result v1

    if-nez v1, :cond_0

    const p0, 0x7f120304

    .line 180
    invoke-static {p0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 183
    :cond_0
    invoke-virtual {p3}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ll/۟ܺۡ;->֫(Ljava/lang/String;)V

    .line 184
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/۟ܺۡ;->ۧ(Ljava/lang/String;)V

    const/4 p1, -0x1

    const/4 p3, 0x1

    if-ne p4, p1, :cond_1

    .line 186
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    iget-object p0, p0, Ll/ۢۖۡ;->ᩳۧ:Ll/ܳۖۡ;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, p3

    invoke-virtual {p0, p1}, Ll/᩶ۗۧ;->notifyItemInserted(I)V

    goto :goto_0

    .line 189
    :cond_1
    iget-object p0, p0, Ll/ۢۖۡ;->ᩳۧ:Ll/ܳۖۡ;

    invoke-virtual {p0, p4}, Ll/᩶ۗۧ;->notifyItemChanged(I)V

    .line 191
    :goto_0
    sget p0, Ll/֫ۖۡ;->֫:I

    .line 59
    new-instance p0, Ll/ᩴܶ᩷;

    invoke-direct {p0, p3}, Ll/ᩴܶ᩷;-><init>(I)V

    const-class p1, Ll/֫ۖۡ;

    const-wide/16 p2, 0x1f4

    invoke-static {p0, p1, p2, p3}, Ll/֫ۨۡ;->֫(Ljava/lang/Runnable;Ljava/lang/Object;J)V

    .line 192
    invoke-virtual {p5}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۢۖۡ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۖۡ;->ܿۧ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۢۖۡ;)Ll/֫ۗۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۖۡ;->ܳۧ:Ll/֫ۗۧ;

    return-object p0
.end method

.method private ᩳ(I)V
    .locals 10

    const v0, 0x7f0d006f

    .line 149
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, -0x1

    if-ne p1, v1, :cond_0

    const v2, 0x7f0a0631

    .line 151
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f1205ad

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    const v2, 0x7f0a0635

    .line 153
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ll/ۤۤᩳ;

    const v2, 0x7f0a0677

    .line 154
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/ۤۤᩳ;

    .line 155
    new-instance v3, Ll/ܿۖۡ;

    invoke-direct {v3, v7}, Ll/ܿۖۡ;-><init>(Ll/ۤۤᩳ;)V

    invoke-virtual {v2, v3}, Ll/۫ۨᩳ;->֫(Landroid/text/TextWatcher;)V

    const/4 v3, 0x0

    if-ne p1, v1, :cond_1

    .line 171
    new-instance v1, Ll/۟ܺۡ;

    const-string v4, ""

    invoke-direct {v1, v3, v4}, Ll/۟ܺۡ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ll/ۢۖۡ;->ܿۧ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ܺۡ;

    :goto_0
    move-object v6, v1

    .line 172
    invoke-virtual {v6}, Ll/۟ܺۡ;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    .line 173
    invoke-virtual {v6}, Ll/۟ܺۡ;->ܽ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    .line 174
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v0, 0x7f12070a

    const v4, 0x7f12015e

    .line 0
    invoke-static {v1, v0, v3, v4, v3}, Ll/۟ۖᩴ;->֫(Ll/᩵ۚۢ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/֡ۚۢ;

    move-result-object v9

    .line 178
    invoke-virtual {v9}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ۧۖۡ;

    move-object v3, v1

    move-object v4, p0

    move-object v5, v2

    move v8, p1

    invoke-direct/range {v3 .. v9}, Ll/ۧۖۡ;-><init>(Ll/ۢۖۡ;Ll/ۤۤᩳ;Ll/۟ܺۡ;Ll/ۤۤᩳ;ILl/֡ۚۢ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 194
    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    .line 195
    invoke-virtual {v2}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result p1

    invoke-virtual {v2, p1}, Ll/ۤۤᩳ;->ᩴ(I)V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 49
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0d004d

    .line 50
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f1206ad

    .line 51
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f0a063a

    .line 52
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۢᩴ;

    iput-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    .line 53
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->֫(Ll/ۢᩴ;)V

    .line 54
    invoke-virtual {p0}, Ll/ۗܺ᩷;->ۗ()V

    .line 55
    iget-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    new-instance v0, Ll/ۘ۫ܳ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Ll/ۘ۫ܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f0a0486

    .line 56
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/۬۬ۧ;

    const v0, 0x7f0a0191

    .line 57
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f1206ae

    .line 58
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 59
    new-instance v1, Ll/ܳۖۡ;

    invoke-direct {v1, p0}, Ll/ܳۖۡ;-><init>(Ll/ۢۖۡ;)V

    iput-object v1, p0, Ll/ۢۖۡ;->ᩳۧ:Ll/ܳۖۡ;

    .line 60
    new-instance v2, Ll/ܽۖۡ;

    invoke-direct {v2, p0, v0}, Ll/ܽۖۡ;-><init>(Ll/ۢۖۡ;Landroid/widget/TextView;)V

    invoke-virtual {v1, v2}, Ll/᩶ۗۧ;->registerAdapterDataObserver(Ll/ۗۗۧ;)V

    .line 91
    iget-object v1, p0, Ll/ۢۖۡ;->ܿۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 92
    iget-object v0, p0, Ll/ۢۖۡ;->ᩳۧ:Ll/ܳۖۡ;

    invoke-virtual {p1, v0}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 93
    new-instance v0, Ll/֫ۗۧ;

    new-instance v1, Ll/ᩳۖۡ;

    invoke-direct {v1, p0}, Ll/ᩳۖۡ;-><init>(Ll/ۢۖۡ;)V

    invoke-direct {v0, v1}, Ll/֫ۗۧ;-><init>(Ll/ۤۙۧ;)V

    iput-object v0, p0, Ll/ۢۖۡ;->ܳۧ:Ll/֫ۗۧ;

    .line 128
    invoke-virtual {v0, p1}, Ll/֫ۗۧ;->֫(Ll/۬۬ۧ;)V

    return-void
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 3

    const v0, 0x7f0a0327

    const v1, 0x7f1205ad

    const/4 v2, 0x0

    .line 133
    invoke-interface {p1, v2, v0, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const/4 v0, 0x2

    .line 134
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setShowAsAction(I)V

    const v0, 0x7f0801a4

    .line 135
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/4 p1, 0x1

    return p1
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .line 141
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f0a0327

    if-ne p1, v0, :cond_0

    const/4 p1, -0x1

    .line 142
    invoke-direct {p0, p1}, Ll/ۢۖۡ;->ᩳ(I)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "MyFavoritesRecordActivity"

    return-object v0
.end method
