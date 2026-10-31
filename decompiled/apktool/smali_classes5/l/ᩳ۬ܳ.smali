.class public final Ll/ᩳ۬ܳ;
.super Ll/۟ܶۡ;
.source "Y5PI"


# instance fields
.field public final synthetic ۜ:Lbin/mt/plus/Main;

.field public final synthetic ۡ:Landroid/widget/Spinner;

.field public final synthetic ۢ:Ll/ۗۘ;

.field public ܳ:Ll/᩺ۤܿ;

.field public final synthetic ܺ:Ll/ܽۢܳ;

.field public final synthetic ᩷:Ll/ۗۘ;

.field public final synthetic ᩻:Ll/ۡ۬ܳ;


# direct methods
.method public constructor <init>(Ll/ۡ۬ܳ;Landroid/widget/Spinner;Lbin/mt/plus/Main;Ll/ۗۘ;Ll/ۗۘ;Ll/ܽۢܳ;)V
    .locals 0

    .line 119
    iput-object p1, p0, Ll/ᩳ۬ܳ;->᩻:Ll/ۡ۬ܳ;

    iput-object p2, p0, Ll/ᩳ۬ܳ;->ۡ:Landroid/widget/Spinner;

    iput-object p3, p0, Ll/ᩳ۬ܳ;->ۜ:Lbin/mt/plus/Main;

    iput-object p4, p0, Ll/ᩳ۬ܳ;->᩷:Ll/ۗۘ;

    iput-object p5, p0, Ll/ᩳ۬ܳ;->ۢ:Ll/ۗۘ;

    iput-object p6, p0, Ll/ᩳ۬ܳ;->ܺ:Ll/ܽۢܳ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 161
    iget-object v0, p0, Ll/ᩳ۬ܳ;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    iget-object v1, p0, Ll/ᩳ۬ܳ;->᩻:Ll/ۡ۬ܳ;

    if-eqz v0, :cond_0

    .line 162
    invoke-static {v1}, Ll/ۡ۬ܳ;->ܽ(Ll/ۡ۬ܳ;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    return-void

    .line 164
    :cond_0
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "dfb"

    const/4 v3, 0x1

    invoke-interface {v0, v2, v3}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 165
    invoke-static {v1}, Ll/ۡ۬ܳ;->֫(Ll/ۡ۬ܳ;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩶()V

    goto :goto_0

    .line 167
    :cond_1
    invoke-static {v1}, Ll/ۡ۬ܳ;->֫(Ll/ۡ۬ܳ;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۫()Z

    .line 169
    :goto_0
    invoke-static {v1}, Ll/ۡ۬ܳ;->ܽ(Ll/ۡ۬ܳ;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-static {v1}, Ll/ۡ۬ܳ;->֫(Ll/ۡ۬ܳ;)Ll/ܶ᩵ܿ;

    move-result-object v2

    const/4 v3, 0x0

    .line 991
    invoke-virtual {v0, v2, v3}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/Runnable;)V

    .line 170
    invoke-static {v1}, Ll/ۡ۬ܳ;->֫(Ll/ۡ۬ܳ;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ᩳ۬ܳ;->ܺ:Ll/ܽۢܳ;

    invoke-virtual {v1, v0}, Ll/ܽۢܳ;->ᩳ(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 5

    .line 176
    iget-object v0, p0, Ll/ᩳ۬ܳ;->ۢ:Ll/ۗۘ;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    iget-object v1, p0, Ll/ᩳ۬ܳ;->ۜ:Lbin/mt/plus/Main;

    if-nez v0, :cond_1

    move-object v0, p1

    :goto_0
    if-eqz v0, :cond_1

    .line 196
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v3, "Invalid element width"

    .line 197
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 178
    new-instance v0, Ljava/lang/Exception;

    const v2, 0x7f12029e

    .line 179
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const v2, 0x7f120299

    .line 178
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object p1, v0

    goto :goto_1

    .line 195
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_1
    :goto_1
    const/4 v0, 0x0

    .line 546
    invoke-virtual {v1, p1, v0}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    .line 182
    iget-object p1, p0, Ll/ᩳ۬ܳ;->᩻:Ll/ۡ۬ܳ;

    invoke-static {p1}, Ll/ۡ۬ܳ;->ܽ(Ll/ۡ۬ܳ;)Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 125
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    iget-object v1, p0, Ll/ᩳ۬ܳ;->ۡ:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v1

    const-string v2, "dex_fixer_dex_version"

    invoke-interface {v0, v1, v2}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    .line 126
    new-instance v0, Ll/᩺ۤܿ;

    iget-object v1, p0, Ll/ᩳ۬ܳ;->ۜ:Lbin/mt/plus/Main;

    invoke-direct {v0, v1}, Ll/᩺ۤܿ;-><init>(Ll/ۗܺ᩷;)V

    const/4 v1, 0x0

    .line 65
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->֫(Ljava/lang/Runnable;)Ll/᩺ۤܿ;

    const v1, 0x7f120298

    .line 128
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->ܽ(I)V

    const v1, 0x7f120797

    .line 129
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->֫(I)V

    .line 130
    invoke-virtual {v0}, Ll/᩺ۤܿ;->ۡ()Ll/᩺ۤܿ;

    iput-object v0, p0, Ll/ᩳ۬ܳ;->ܳ:Ll/᩺ۤܿ;

    return-void
.end method

.method public final ܿ()V
    .locals 8

    .line 135
    new-instance v0, Ll/ܽ۬ܳ;

    invoke-direct {v0, p0}, Ll/ܽ۬ܳ;-><init>(Ll/ᩳ۬ܳ;)V

    iget-object v1, p0, Ll/ᩳ۬ܳ;->᩻:Ll/ۡ۬ܳ;

    invoke-static {v1, v0}, Ll/ۡ۬ܳ;->֫(Ll/ۡ۬ܳ;Ll/ܳ۬ܳ;)V

    .line 156
    invoke-static {v1}, Ll/ۡ۬ܳ;->֫(Ll/ۡ۬ܳ;)Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-static {v1}, Ll/ۡ۬ܳ;->ܽ(Ll/ۡ۬ܳ;)Ll/ܶ᩵ܿ;

    move-result-object v3

    iget-object v0, p0, Ll/ᩳ۬ܳ;->ۡ:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v4

    iget-object v0, p0, Ll/ᩳ۬ܳ;->᩷:Ll/ۗۘ;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v5

    iget-object v0, p0, Ll/ᩳ۬ܳ;->ۢ:Ll/ۗۘ;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v6

    invoke-static {v1}, Ll/ۡ۬ܳ;->ۧ(Ll/ۡ۬ܳ;)Ll/ܳ۬ܳ;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Ll/ۡ۬ܳ;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;IZZLl/ܳ۬ܳ;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 187
    iget-object v0, p0, Ll/ᩳ۬ܳ;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->ᩳ()V

    .line 188
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method
