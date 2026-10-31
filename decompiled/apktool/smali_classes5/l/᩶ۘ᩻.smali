.class public Ll/᩶ۘ᩻;
.super Ll/ۗܺ᩷;
.source "J7J5"


# static fields
.field public static final synthetic ۢۧ:I


# instance fields
.field public ۜۧ:Ll/ۚۡ֫;

.field public ܳۧ:I

.field public final ܿۧ:Ljava/util/List;

.field public ᩳۧ:Ll/۠ۘ᩻;

.field public ᩷ۧ:Ll/֫ۗۧ;

.field public ᩻ۧ:Ll/ۛ᩵᩷;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    .line 34
    invoke-static {}, Ll/۫᩻᩻;->ܿ()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ۘ᩻;->ܿۧ:Ljava/util/List;

    .line 38
    new-instance v0, Ll/ۚۡ֫;

    invoke-direct {v0}, Ll/ۚۡ֫;-><init>()V

    iput-object v0, p0, Ll/᩶ۘ᩻;->ۜۧ:Ll/ۚۡ֫;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩶ۘ᩻;)Ll/۠ۘ᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶ۘ᩻;->ᩳۧ:Ll/۠ۘ᩻;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/᩶ۘ᩻;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩶ۘ᩻;->ܳۧ:I

    return-void
.end method

.method public static synthetic ֫(Ll/᩶ۘ᩻;Ljava/lang/String;)V
    .locals 0

    .line 49
    iget-object p0, p0, Ll/᩶ۘ᩻;->ۜۧ:Ll/ۚۡ֫;

    invoke-virtual {p0, p1}, Ll/ۚۡ֫;->ۧ(Ljava/lang/Object;)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩶ۘ᩻;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶ۘ᩻;->ܿۧ:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩶ۘ᩻;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩶ۘ᩻;->ܳۧ:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩶ۘ᩻;)Ll/֫ۗۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶ۘ᩻;->᩷ۧ:Ll/֫ۗۧ;

    return-object p0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 48
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    .line 49
    new-instance p1, Ll/ܿۡܳ;

    const/4 v0, 0x1

    invoke-direct {p1, v0, p0}, Ll/ܿۡܳ;-><init>(ILjava/lang/Object;)V

    invoke-static {p0, p1}, Ll/᩵֡᩷;->֫(Ll/ۗܺ᩷;Ll/᩺᩵᩷;)Ll/ۛ᩵᩷;

    move-result-object p1

    iput-object p1, p0, Ll/᩶ۘ᩻;->᩻ۧ:Ll/ۛ᩵᩷;

    const p1, 0x7f0d004d

    .line 50
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f1204c8

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

    new-instance v0, Ll/֡ۘ᩻;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/֡ۘ᩻;-><init>(ILjava/lang/Object;)V

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

    const v1, 0x7f1206eb

    .line 58
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 59
    new-instance v1, Ll/۠ۘ᩻;

    invoke-direct {v1, p0}, Ll/۠ۘ᩻;-><init>(Ll/᩶ۘ᩻;)V

    iput-object v1, p0, Ll/᩶ۘ᩻;->ᩳۧ:Ll/۠ۘ᩻;

    .line 60
    new-instance v2, Ll/ۚۘ᩻;

    invoke-direct {v2, p0, v0}, Ll/ۚۘ᩻;-><init>(Ll/᩶ۘ᩻;Landroid/widget/TextView;)V

    invoke-virtual {v1, v2}, Ll/᩶ۗۧ;->registerAdapterDataObserver(Ll/ۗۗۧ;)V

    .line 91
    iget-object v1, p0, Ll/᩶ۘ᩻;->ܿۧ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 92
    iget-object v0, p0, Ll/᩶ۘ᩻;->ᩳۧ:Ll/۠ۘ᩻;

    invoke-virtual {p1, v0}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 93
    new-instance v0, Ll/֫ۗۧ;

    new-instance v1, Ll/֨ۘ᩻;

    invoke-direct {v1, p0}, Ll/֨ۘ᩻;-><init>(Ll/᩶ۘ᩻;)V

    invoke-direct {v0, v1}, Ll/֫ۗۧ;-><init>(Ll/ۤۙۧ;)V

    iput-object v0, p0, Ll/᩶ۘ᩻;->᩷ۧ:Ll/֫ۗۧ;

    .line 127
    invoke-virtual {v0, p1}, Ll/֫ۗۧ;->֫(Ll/۬۬ۧ;)V

    return-void
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 3

    const v0, 0x7f0a0327

    const v1, 0x7f1205ad

    const/4 v2, 0x0

    .line 132
    invoke-interface {p1, v2, v0, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const/4 v0, 0x2

    .line 133
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setShowAsAction(I)V

    const v0, 0x7f0801a4

    .line 134
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/4 p1, 0x1

    return p1
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .line 140
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f0a0327

    if-ne p1, v0, :cond_0

    .line 141
    invoke-static {p0}, Ll/ۖۘ᩻;->֫(Ll/᩶ۘ᩻;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "JumpHostManager"

    return-object v0
.end method

.method public final ۟()V
    .locals 2

    .line 162
    iget-object v0, p0, Ll/᩶ۘ᩻;->ᩳۧ:Ll/۠ۘ᩻;

    iget v1, p0, Ll/᩶ۘ᩻;->ܳۧ:I

    invoke-virtual {v0, v1}, Ll/᩶ۗۧ;->notifyItemChanged(I)V

    return-void
.end method

.method public final ۨ()Ll/ۛ᩵᩷;
    .locals 1

    .line 148
    iget-object v0, p0, Ll/᩶ۘ᩻;->᩻ۧ:Ll/ۛ᩵᩷;

    return-object v0
.end method

.method public final ܰ()V
    .locals 2

    .line 156
    iget-object v0, p0, Ll/᩶ۘ᩻;->ᩳۧ:Ll/۠ۘ᩻;

    iget-object v1, p0, Ll/᩶ۘ᩻;->ܿۧ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ll/᩶ۗۧ;->notifyItemInserted(I)V

    return-void
.end method

.method public final ᩺()Ll/ۚۡ֫;
    .locals 1

    .line 152
    iget-object v0, p0, Ll/᩶ۘ᩻;->ۜۧ:Ll/ۚۡ֫;

    return-object v0
.end method
