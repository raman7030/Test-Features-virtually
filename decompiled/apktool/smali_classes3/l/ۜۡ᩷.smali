.class public Ll/ۜۡ᩷;
.super Ll/ۗܺ᩷;
.source "R7YU"


# static fields
.field public static final synthetic ܿۧ:I


# instance fields
.field public ᩳۧ:Ll/᩻ۡ᩷;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۜۡ᩷;)Ll/᩻ۡ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜۡ᩷;->ᩳۧ:Ll/᩻ۡ᩷;

    return-object p0
.end method

.method public static synthetic ֫(Ll/ۜۡ᩷;Landroid/widget/EditText;Ll/֡ۚۢ;Landroid/view/View;)V
    .locals 2

    .line 174
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 175
    iget-object v0, p0, Ll/ۜۡ᩷;->ᩳۧ:Ll/᩻ۡ᩷;

    invoke-static {v0}, Ll/᩻ۡ᩷;->ܳ(Ll/᩻ۡ᩷;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "\\d{6}"

    .line 176
    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const p0, 0x7f120ae3

    .line 177
    invoke-static {p0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 181
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x7

    if-ge v0, v1, :cond_1

    const p0, 0x7f120b16

    .line 182
    invoke-static {p0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 185
    :cond_1
    invoke-static {p1}, Ll/᩻֡ۡ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const p0, 0x7f120b15

    .line 186
    invoke-static {p0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 190
    :cond_2
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f120b7b

    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    iget-object v1, p0, Ll/ۜۡ᩷;->ᩳۧ:Ll/᩻ۡ᩷;

    invoke-static {v1}, Ll/᩻ۡ᩷;->ܽ(Ll/᩻ۡ᩷;)Ljava/lang/String;

    move-result-object v1

    .line 191
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v1, Ll/᩺ۢ᩷;

    invoke-direct {v1, p3, p0, p2, p1}, Ll/᩺ۢ᩷;-><init>(Landroid/view/View;Ll/ۜۡ᩷;Ll/֡ۚۢ;Ljava/lang/String;)V

    const p0, 0x7f12070a

    .line 192
    invoke-virtual {v0, p0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12015e

    const/4 p1, 0x0

    .line 239
    invoke-virtual {v0, p0, p1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 240
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۜۡ᩷;Ll/᩻ۡ᩷;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۜۡ᩷;->ᩳۧ:Ll/᩻ۡ᩷;

    return-void
.end method

.method public static ۧ(Ll/ۜۡ᩷;)V
    .locals 6

    const v0, 0x7f0d0094

    .line 111
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0397

    .line 112
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 113
    iget-object v2, p0, Ll/ۜۡ᩷;->ᩳۧ:Ll/᩻ۡ᩷;

    invoke-static {v2}, Ll/᩻ۡ᩷;->᩻(Ll/᩻ۡ᩷;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f0a00a4

    .line 114
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const/4 v2, 0x0

    .line 115
    invoke-virtual {v1, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 117
    iget-object v2, p0, Ll/ۜۡ᩷;->ᩳۧ:Ll/᩻ۡ᩷;

    invoke-static {v2}, Ll/᩻ۡ᩷;->ܳ(Ll/᩻ۡ᩷;)Z

    move-result v2

    const/16 v3, 0x8

    if-eqz v2, :cond_0

    const v2, 0x7f0a023b

    .line 119
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    const v2, 0x7f0a017d

    .line 120
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    .line 121
    new-instance v3, Ll/ۧۡ᩷;

    invoke-direct {v3, v1}, Ll/ۧۡ᩷;-><init>(Landroid/widget/Button;)V

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const v3, 0x7f0a00a5

    .line 127
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    new-instance v4, Ll/᩹ܺ᩷;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Ll/᩹ܺ᩷;-><init>(Ll/ۗܺ᩷;I)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    const v2, 0x7f0a023a

    .line 163
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    const v2, 0x7f0a017e

    .line 164
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    .line 165
    new-instance v3, Ll/ᩳۡ᩷;

    invoke-direct {v3, v1}, Ll/ᩳۡ᩷;-><init>(Landroid/widget/Button;)V

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 172
    :goto_0
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v3

    invoke-virtual {v3, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    invoke-virtual {v3}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v0

    .line 173
    new-instance v3, Ll/ᩳۚۡ;

    invoke-direct {v3, p0, v2, v0}, Ll/ᩳۚۡ;-><init>(Ll/ۜۡ᩷;Landroid/widget/EditText;Ll/֡ۚۢ;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 243
    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 8

    .line 38
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0d001c

    .line 39
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f0a063a

    .line 40
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۢᩴ;

    iput-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    .line 41
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->֫(Ll/ۢᩴ;)V

    .line 42
    invoke-virtual {p0}, Ll/ۗܺ᩷;->ۗ()V

    .line 43
    iget-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    new-instance v0, Ll/ۨۢ᩷;

    invoke-direct {v0, p0}, Ll/ۨۢ᩷;-><init>(Ll/ۜۡ᩷;)V

    invoke-virtual {p1, v0}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 p1, 0x0

    .line 44
    invoke-static {p0, p1}, Ll/᩶᩻ۡ;->֫(Landroid/content/Context;Z)Ll/ܺ᩶ۘ;

    move-result-object v2

    const v0, 0x7f0a04cc

    .line 45
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v7

    const v0, 0x7f0a05e2

    .line 46
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    const v0, 0x7f0a00da

    .line 47
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/CheckBox;

    const v0, 0x7f0a00de

    .line 48
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/CheckBox;

    const v0, 0x7f0a00a2

    .line 49
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/Button;

    .line 50
    invoke-virtual {v6, p1}, Landroid/view/View;->setEnabled(Z)V

    const/4 p1, 0x4

    .line 51
    invoke-virtual {v7, p1}, Landroid/view/View;->setVisibility(I)V

    .line 52
    new-instance p1, Ll/֫ۡ᩷;

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v7}, Ll/֫ۡ᩷;-><init>(Ll/ۜۡ᩷;Ll/ܺ᩶ۘ;Landroid/widget/TextView;Landroid/widget/CheckBox;Landroid/widget/CheckBox;Landroid/widget/Button;Landroid/view/View;)V

    .line 107
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "AccountDeletionActivity"

    return-object v0
.end method
