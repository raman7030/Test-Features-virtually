.class public final Ll/۬ܰܳ;
.super Ll/֫ۜܳ;
.source "D1K5"


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f1205ce

    const v1, 0x7f0801e8

    .line 41
    invoke-direct {p0, v0, v1}, Ll/֫ۜܳ;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 8

    const-string v0, "zip"

    .line 53
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const p1, 0x7f12036c

    .line 54
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 57
    :cond_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v0

    const v1, 0x7f0d00ed

    .line 58
    invoke-virtual {v0, v1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v1

    .line 59
    invoke-static {v0, v1}, Ll/ۡ۬ܳ;->֫(Lbin/mt/plus/Main;Landroid/view/View;)Landroid/widget/Spinner;

    move-result-object v0

    const v2, 0x7f0a0576

    .line 60
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/ۗۘ;

    .line 61
    sget-object v3, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v4, "dfb"

    const/4 v5, 0x1

    invoke-interface {v3, v4, v5}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v2, v3}, Ll/ۗۘ;->setChecked(Z)V

    .line 62
    new-instance v3, Ll/ܶܰܳ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2, v3}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v2, 0x7f0a03b2

    .line 64
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f0a03b4

    .line 65
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v4, 0x7f0a0577

    .line 66
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Ll/ۗۘ;

    const v6, 0x7f0a0578

    .line 67
    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Ll/ۗۘ;

    .line 68
    new-instance v7, Ll/᩸ܰܳ;

    invoke-direct {v7, v2, v3, v6, v0}, Ll/᩸ܰܳ;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;Ll/ۗۘ;Landroid/widget/Spinner;)V

    invoke-virtual {v4, v7}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 75
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "dfoh"

    const/4 v7, 0x0

    invoke-interface {v2, v3, v7}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v4, v2}, Ll/ۗۘ;->setChecked(Z)V

    .line 77
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "dfrwn"

    invoke-interface {v2, v3, v5}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v6, v2}, Ll/ۗۘ;->setChecked(Z)V

    .line 78
    new-instance v2, Ll/᩹᩸ۜ;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Ll/᩹᩸ۜ;-><init>(I)V

    invoke-virtual {v6, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 80
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v2

    .line 81
    invoke-virtual {v2, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    new-instance v1, Ll/᩹ܰܳ;

    invoke-direct {v1, v0, p1, v4, v6}, Ll/᩹ܰܳ;-><init>(Landroid/widget/Spinner;Ll/ۖۢܳ;Ll/ۗۘ;Ll/ۗۘ;)V

    const p1, 0x7f12070a

    .line 82
    invoke-virtual {v2, p1, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 v0, 0x0

    .line 101
    invoke-virtual {v2, p1, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 102
    invoke-virtual {v2}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 1

    const-string v0, "local"

    .line 46
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "zip"

    .line 47
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 48
    :cond_0
    invoke-static {p1}, Ll/ܰܰܳ;->᩻(Ll/ۖۢܳ;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
