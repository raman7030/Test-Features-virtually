.class public Ll/ۛ᩻ۡ;
.super Ll/ۗܺ᩷;
.source "88W8"


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

    .line 24
    new-instance v0, Ll/ۙۤۡ;

    invoke-direct {v0}, Ll/ۙۤۡ;-><init>()V

    sput-object v0, Ll/ۛ᩻ۡ;->᩷ۧ:Ll/ۙۤۡ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    .line 28
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ۛ᩻ۡ;->ۜۧ:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۛ᩻ۡ;)Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩻ۡ;->ᩳۧ:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۛ᩻ۡ;Ljava/util/List;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۛ᩻ۡ;->ۜۧ:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۛ᩻ۡ;)Ll/ܺ᩶ۘ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩻ۡ;->ܿۧ:Ll/ܺ᩶ۘ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۛ᩻ۡ;)Ll/۬۬ۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩻ۡ;->ܳۧ:Ll/۬۬ۧ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ۛ᩻ۡ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩻ۡ;->ۜۧ:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۛ᩻ۡ;)Ll/۫ۤۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩻ۡ;->᩻ۧ:Ll/۫ۤۧ;

    return-object p0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 38
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0d004f

    .line 39
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f120a9d

    .line 40
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f0a063a

    .line 41
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۢᩴ;

    iput-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    .line 42
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->֫(Ll/ۢᩴ;)V

    .line 43
    invoke-virtual {p0}, Ll/ۗܺ᩷;->ۗ()V

    .line 44
    iget-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    new-instance v0, Ll/ۧۡۡ;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p0}, Ll/ۧۡۡ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 p1, 0x1

    .line 46
    invoke-static {p0, p1}, Ll/᩶᩻ۡ;->֫(Landroid/content/Context;Z)Ll/ܺ᩶ۘ;

    move-result-object p1

    iput-object p1, p0, Ll/ۛ᩻ۡ;->ܿۧ:Ll/ܺ᩶ۘ;

    const p1, 0x7f0a04a1

    .line 47
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/۫ۤۧ;

    iput-object p1, p0, Ll/ۛ᩻ۡ;->᩻ۧ:Ll/۫ۤۧ;

    const p1, 0x7f0a0486

    .line 48
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/۬۬ۧ;

    iput-object p1, p0, Ll/ۛ᩻ۡ;->ܳۧ:Ll/۬۬ۧ;

    const p1, 0x7f0a0191

    .line 49
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ۛ᩻ۡ;->ᩳۧ:Landroid/widget/TextView;

    const v0, 0x7f12051e

    .line 50
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 51
    iget-object p1, p0, Ll/ۛ᩻ۡ;->ᩳۧ:Landroid/widget/TextView;

    new-instance v0, Ll/ۙ᩻ۡ;

    invoke-direct {v0, p0}, Ll/ۙ᩻ۡ;-><init>(Ll/ۛ᩻ۡ;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 52
    iget-object p1, p0, Ll/ۛ᩻ۡ;->ܳۧ:Ll/۬۬ۧ;

    new-instance v0, Ll/ۤ᩻ۡ;

    invoke-direct {v0, p0}, Ll/ۤ᩻ۡ;-><init>(Ll/ۛ᩻ۡ;)V

    invoke-virtual {p1, v0}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 59
    new-instance p1, Ll/۫᩻ۡ;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Ll/۫᩻ۡ;-><init>(Ll/ۛ᩻ۡ;Z)V

    .line 97
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    .line 54
    iget-object p1, p0, Ll/ۛ᩻ۡ;->᩻ۧ:Ll/۫ۤۧ;

    new-instance v0, Ll/ۗ᩻ۡ;

    invoke-direct {v0, p0}, Ll/ۗ᩻ۡ;-><init>(Ll/ۛ᩻ۡ;)V

    invoke-virtual {p1, v0}, Ll/۫ۤۧ;->֫(Ll/ۙۤۧ;)V

    .line 55
    new-instance p1, Ll/۬᩻ۡ;

    invoke-direct {p1, p0}, Ll/۬᩻ۡ;-><init>(Ll/ۛ᩻ۡ;)V

    sget-object v0, Ll/ۛ᩻ۡ;->᩷ۧ:Ll/ۙۤۡ;

    invoke-virtual {v0, p0, p1}, Ll/ۙۤۡ;->֫(Ll/᩻ۡ֫;Ll/᩶ۤۡ;)V

    return-void
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "TutorialListActivity"

    return-object v0
.end method
