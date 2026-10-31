.class public Ll/ܶۜۡ;
.super Ll/ۗܺ᩷;
.source "A91T"


# static fields
.field public static final ᩷ۧ:Ll/ۙۤۡ;


# instance fields
.field public ۜۧ:Ljava/util/List;

.field public ܳۧ:Ll/۬۬ۧ;

.field public ܿۧ:Ll/ܺ᩶ۘ;

.field public ᩳۧ:Landroid/widget/TextView;

.field public ᩻ۧ:Ll/۫ۤۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 29
    new-instance v0, Ll/ۙۤۡ;

    invoke-direct {v0}, Ll/ۙۤۡ;-><init>()V

    sput-object v0, Ll/ܶۜۡ;->᩷ۧ:Ll/ۙۤۡ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    .line 33
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ܶۜۡ;->ۜۧ:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܶۜۡ;)Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۜۡ;->ᩳۧ:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ܶۜۡ;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܶۜۡ;->ۜۧ:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܶۜۡ;)Ll/ܺ᩶ۘ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۜۡ;->ܿۧ:Ll/ܺ᩶ۘ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ܶۜۡ;)Ll/۬۬ۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۜۡ;->ܳۧ:Ll/۬۬ۧ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ܶۜۡ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۜۡ;->ۜۧ:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ܶۜۡ;)Ll/۫ۤۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۜۡ;->᩻ۧ:Ll/۫ۤۧ;

    return-object p0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 43
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0d004f

    .line 44
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f120a9e

    .line 45
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f0a063a

    .line 46
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۢᩴ;

    iput-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    .line 47
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->֫(Ll/ۢᩴ;)V

    .line 48
    invoke-virtual {p0}, Ll/ۗܺ᩷;->ۗ()V

    .line 49
    iget-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    new-instance v0, Ll/ۧܺ᩷;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Ll/ۧܺ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 p1, 0x1

    .line 51
    invoke-static {p0, p1}, Ll/᩶᩻ۡ;->֫(Landroid/content/Context;Z)Ll/ܺ᩶ۘ;

    move-result-object p1

    iput-object p1, p0, Ll/ܶۜۡ;->ܿۧ:Ll/ܺ᩶ۘ;

    const p1, 0x7f0a04a1

    .line 52
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/۫ۤۧ;

    iput-object p1, p0, Ll/ܶۜۡ;->᩻ۧ:Ll/۫ۤۧ;

    const p1, 0x7f0a0486

    .line 53
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/۬۬ۧ;

    iput-object p1, p0, Ll/ܶۜۡ;->ܳۧ:Ll/۬۬ۧ;

    const p1, 0x7f0a0191

    .line 54
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ܶۜۡ;->ᩳۧ:Landroid/widget/TextView;

    const v0, 0x7f12051e

    .line 55
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 56
    iget-object p1, p0, Ll/ܶۜۡ;->ᩳۧ:Landroid/widget/TextView;

    new-instance v0, Ll/᩵ۜۡ;

    invoke-direct {v0, p0}, Ll/᩵ۜۡ;-><init>(Ll/ܶۜۡ;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    iget-object p1, p0, Ll/ܶۜۡ;->ܳۧ:Ll/۬۬ۧ;

    new-instance v0, Ll/۠ۜۡ;

    invoke-direct {v0, p0}, Ll/۠ۜۡ;-><init>(Ll/ܶۜۡ;)V

    invoke-virtual {p1, v0}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 100
    new-instance p1, Ll/֨ۜۡ;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Ll/֨ۜۡ;-><init>(Ll/ܶۜۡ;Z)V

    .line 131
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    .line 59
    iget-object p1, p0, Ll/ܶۜۡ;->᩻ۧ:Ll/۫ۤۧ;

    new-instance v0, Ll/֡ۜۡ;

    invoke-direct {v0, p0}, Ll/֡ۜۡ;-><init>(Ll/ܶۜۡ;)V

    invoke-virtual {p1, v0}, Ll/۫ۤۧ;->֫(Ll/ۙۤۧ;)V

    .line 60
    new-instance p1, Ll/ۚۜۡ;

    invoke-direct {p1, p0}, Ll/ۚۜۡ;-><init>(Ll/ܶۜۡ;)V

    sget-object v0, Ll/ܶۜۡ;->᩷ۧ:Ll/ۙۤۡ;

    invoke-virtual {v0, p0, p1}, Ll/ۙۤۡ;->֫(Ll/᩻ۡ֫;Ll/᩶ۤۡ;)V

    return-void
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 3

    const v0, 0x7f120a9b

    const/4 v1, 0x0

    .line 65
    invoke-interface {p1, v1, v0, v1, v0}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    const v2, 0x7f0801bd

    .line 66
    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/4 v2, 0x2

    .line 67
    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setShowAsAction(I)V

    const v0, 0x7f120a9d

    .line 68
    invoke-interface {p1, v1, v0, v1, v0}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const v0, 0x7f0801ac

    .line 69
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 70
    invoke-interface {p1, v2}, Landroid/view/MenuItem;->setShowAsAction(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .line 76
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f120a9d

    const v1, 0x7f120757

    const/4 v2, 0x1

    if-ne p1, v0, :cond_1

    .line 78
    invoke-static {}, Ll/᩺᩵ۡ;->ܺ()Z

    move-result p1

    if-nez p1, :cond_0

    .line 79
    invoke-static {v1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 80
    new-instance p1, Ll/֡֡ۡ;

    invoke-direct {p1, p0}, Ll/֡֡ۡ;-><init>(Ll/ۗܺ᩷;)V

    return v2

    .line 83
    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-class v0, Ll/ۛ᩻ۡ;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 84
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return v2

    :cond_1
    const v0, 0x7f120a9b

    if-ne p1, v0, :cond_3

    .line 87
    invoke-static {}, Ll/᩺᩵ۡ;->ܺ()Z

    move-result p1

    if-nez p1, :cond_2

    .line 88
    invoke-static {v1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 89
    new-instance p1, Ll/֡֡ۡ;

    invoke-direct {p1, p0}, Ll/֡֡ۡ;-><init>(Ll/ۗܺ᩷;)V

    return v2

    .line 92
    :cond_2
    new-instance p1, Landroid/content/Intent;

    const-class v0, Ll/ۨۜۡ;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 93
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return v2

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "TutorialListActivity"

    return-object v0
.end method
