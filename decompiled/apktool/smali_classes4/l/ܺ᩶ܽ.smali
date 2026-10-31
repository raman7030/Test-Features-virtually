.class public abstract Ll/ܺ᩶ܽ;
.super Ljava/lang/Object;
.source "251F"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final ۗ:Landroid/widget/CheckBox;

.field public final ۙ:Landroid/widget/CheckBox;

.field public final ۬:Landroid/widget/TextView;

.field public final ᩶:Ll/ۚۖۡ;

.field public final ᩸:Ll/᩷᩶ܽ;

.field public final ᩹:Ll/֡ۚۢ;


# direct methods
.method public constructor <init>(Ll/᩷᩶ܽ;)V
    .locals 6

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Ll/ܺ᩶ܽ;->᩸:Ll/᩷᩶ܽ;

    const v0, 0x7f0d009d

    .line 31
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a017d

    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ۚۖۡ;

    iput-object v1, p0, Ll/ܺ᩶ܽ;->᩶:Ll/ۚۖۡ;

    const v1, 0x7f0a00da

    .line 33
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    iput-object v1, p0, Ll/ܺ᩶ܽ;->ۙ:Landroid/widget/CheckBox;

    const v2, 0x7f0a00de

    .line 34
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckBox;

    iput-object v2, p0, Ll/ܺ᩶ܽ;->ۗ:Landroid/widget/CheckBox;

    const v3, 0x7f0a0631

    .line 35
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Ll/ܺ᩶ܽ;->۬:Landroid/widget/TextView;

    .line 37
    sget-object v3, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v4, "dex_search_match_case"

    const/4 v5, 0x0

    invoke-interface {v3, v4, v5}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 38
    new-instance v1, Ll/ۢ᩶ܽ;

    invoke-direct {v1, p0}, Ll/ۢ᩶ܽ;-><init>(Ll/ܺ᩶ܽ;)V

    invoke-virtual {v2, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 39
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "dex_search_regex"

    invoke-interface {v1, v3, v5}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v2, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 42
    sget v1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v1, Ll/᩵ۚۢ;

    invoke-direct {v1, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 43
    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const p1, 0x7f12070a

    const/4 v0, 0x0

    .line 44
    invoke-virtual {v1, p1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    .line 45
    invoke-virtual {v1, p1, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 46
    invoke-virtual {v1}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object p1

    iput-object p1, p0, Ll/ܺ᩶ܽ;->᩹:Ll/֡ۚۢ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺ᩶ܽ;)Ll/ۗܺ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺ᩶ܽ;->᩸:Ll/᩷᩶ܽ;

    return-object p0
.end method

.method public static synthetic ֫(Ll/ܺ᩶ܽ;Z)V
    .locals 0

    .line 38
    iget-object p0, p0, Ll/ܺ᩶ܽ;->᩶:Ll/ۚۖۡ;

    invoke-virtual {p0, p1}, Ll/ۚۖۡ;->ۧ(Z)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 61
    iget-object p1, p0, Ll/ܺ᩶ܽ;->ۙ:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    .line 62
    iget-object v0, p0, Ll/ܺ᩶ܽ;->ۗ:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    .line 63
    iget-object v1, p0, Ll/ܺ᩶ܽ;->᩶:Ll/ۚۖۡ;

    invoke-virtual {v1}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    if-nez v0, :cond_0

    .line 66
    invoke-static {v2}, Ll/ۘ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    if-eqz p1, :cond_1

    const/16 v4, 0x8

    .line 71
    :try_start_0
    invoke-static {v3, v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v3

    goto :goto_1

    :cond_1
    const/16 v4, 0x4a

    .line 73
    invoke-static {v3, v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v3
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    :goto_1
    sget-object v4, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v4}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v4

    const-string v5, "dex_search_match_case"

    .line 83
    invoke-interface {v4, v5, p1}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    const-string v4, "dex_search_regex"

    .line 84
    invoke-interface {p1, v4, v0}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    .line 85
    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    .line 86
    invoke-virtual {v1}, Ll/ۚۖۡ;->ܳ()V

    .line 88
    iget-object p1, p0, Ll/ܺ᩶ܽ;->᩹:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    .line 90
    new-instance p1, Ll/ۡ᩶ܽ;

    invoke-direct {p1, p0, v3, v2}, Ll/ۡ᩶ܽ;-><init>(Ll/ܺ᩶ܽ;Ljava/util/regex/Pattern;Ljava/lang/String;)V

    .line 119
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    return-void

    :catch_0
    move-exception p1

    .line 77
    invoke-virtual {p1}, Ljava/util/regex/PatternSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    .line 78
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    return-void
.end method

.method public abstract ֫()V
.end method

.method public abstract ֫(Ljava/util/regex/Pattern;Ljava/lang/String;)V
.end method

.method public final ֫(Z)V
    .locals 1

    if-eqz p1, :cond_0

    const p1, 0x7f12090f

    goto :goto_0

    :cond_0
    const p1, 0x7f1208f4

    .line 50
    :goto_0
    iget-object v0, p0, Ll/ܺ᩶ܽ;->۬:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 51
    iget-object p1, p0, Ll/ܺ᩶ܽ;->᩹:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->᩷()V

    .line 52
    invoke-virtual {p1}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
