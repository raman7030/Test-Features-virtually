.class public final Ll/ܰܰܳ;
.super Ll/֫ۜܳ;
.source "21XP"


# instance fields
.field public ۗ:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f1205cd

    const v1, 0x7f08021f

    .line 45
    invoke-direct {p0, v0, v1}, Ll/֫ۜܳ;-><init>(II)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܰܰܳ;)Ll/ܶ᩵ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰܰܳ;->ۗ:Ll/ܶ᩵ܿ;

    return-object p0
.end method

.method public static ֫(Ll/ܰܰܳ;Ljava/lang/String;)Z
    .locals 0

    .line 213
    iget-object p0, p0, Ll/ܰܰܳ;->ۗ:Ll/ܶ᩵ܿ;

    invoke-virtual {p0, p1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p0

    return p0
.end method

.method public static ᩻(Ll/ۖۢܳ;)Z
    .locals 2

    .line 220
    invoke-virtual {p0}, Ll/ۖۢܳ;->ܺ()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 222
    :cond_0
    invoke-virtual {p0}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۜܳ;

    .line 223
    invoke-interface {v0}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, ".dex"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0

    :cond_3
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 5

    const-string v0, "zip"

    .line 59
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const p1, 0x7f12036c

    .line 60
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 63
    :cond_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/᩹᩷ܳ;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/᩹᩷ܳ;-><init>(I)V

    .line 64
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 65
    invoke-static {}, Ll/᩺ۨᩴ;->toSet()Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 66
    invoke-virtual {p1}, Ll/ۖۢܳ;->᩻()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v1, v3}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    iput-object v1, p0, Ll/ܰܰܳ;->ۗ:Ll/ܶ᩵ܿ;

    .line 67
    new-instance v1, Ll/ۨܰܳ;

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v3

    invoke-direct {v1, p0, v3, v0, p1}, Ll/ۨܰܳ;-><init>(Ll/ܰܰܳ;Lbin/mt/plus/Main;Ljava/util/Set;Ll/ۖۢܳ;)V

    const v0, 0x7f1205cd

    .line 89
    invoke-virtual {v1, v0}, Ll/۬ۗܿ;->ۡ(I)V

    const v0, 0x7f120237

    const/4 v3, 0x0

    .line 232
    invoke-virtual {v1, v0, v3, v3}, Ll/۬ۗܿ;->֫(ILandroid/view/View$OnClickListener;Ll/᩻۟ܳ;)V

    .line 209
    iget-object v3, p0, Ll/ܰܰܳ;->ۗ:Ll/ܶ᩵ܿ;

    const-string v4, "classes_merge.dex"

    invoke-virtual {v3, v4}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    const/4 v4, 0x1

    .line 1147
    invoke-virtual {v3, v4}, Ll/ܶ᩵ܿ;->֫(Z)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 209
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v3

    .line 91
    invoke-virtual {v1, v3}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    const/4 v3, 0x6

    .line 92
    invoke-virtual {v1, v3}, Ll/۬ۗܿ;->ᩳ(I)V

    .line 93
    invoke-virtual {v1}, Ll/۬ۗܿ;->֫()V

    .line 94
    invoke-virtual {v1, v2}, Ll/۬ۗܿ;->ۧ(Z)V

    .line 95
    invoke-virtual {v1}, Ll/۬ۗܿ;->᩷()Landroid/widget/Button;

    move-result-object v1

    .line 96
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    .line 97
    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v1

    .line 98
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object p1

    const v4, 0x7f0d01cf

    invoke-virtual {p1, v4}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    .line 99
    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 100
    invoke-virtual {v3, p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 101
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 102
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "delete_dex_files_after_merged"

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 103
    new-instance v0, Ll/ۛܰܳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 1

    const-string v0, "local"

    .line 50
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "zip"

    .line 51
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 52
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
