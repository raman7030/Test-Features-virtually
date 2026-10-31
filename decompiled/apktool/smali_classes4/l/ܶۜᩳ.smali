.class public final Ll/ܶۜᩳ;
.super Ljava/lang/Object;
.source "P5WS"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/text/TextWatcher;


# instance fields
.field public ۗ:Landroid/widget/EditText;

.field public ۙ:Z

.field public final ۛ:Ll/᩻ۜᩳ;

.field public ۤ:Landroid/widget/TextView;

.field public ۫:Landroid/view/View;

.field public ۬:Landroid/widget/EditText;

.field public ᩶:Z

.field public final ᩸:Ll/ۜۜᩳ;

.field public ᩹:Ll/֡ۚۢ;


# direct methods
.method public constructor <init>(Ll/ۜۜᩳ;)V
    .locals 3

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 43
    iput-boolean v0, p0, Ll/ܶۜᩳ;->ۙ:Z

    .line 28
    iput-object p1, p0, Ll/ܶۜᩳ;->᩸:Ll/ۜۜᩳ;

    .line 29
    iget-object v0, p1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iput-object v0, p0, Ll/ܶۜᩳ;->ۛ:Ll/᩻ۜᩳ;

    const v0, 0x7f0d0083

    .line 30
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a017d

    .line 31
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p0, Ll/ܶۜᩳ;->ۗ:Landroid/widget/EditText;

    const v1, 0x7f0a017e

    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p0, Ll/ܶۜᩳ;->۬:Landroid/widget/EditText;

    const v2, 0x7f0a05d2

    .line 33
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Ll/ܶۜᩳ;->۫:Landroid/view/View;

    const v2, 0x7f0a05ef

    .line 34
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Ll/ܶۜᩳ;->ۤ:Landroid/widget/TextView;

    .line 35
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 36
    sget v1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v1, Ll/᩵ۚۢ;

    invoke-direct {v1, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 37
    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const p1, 0x7f12070a

    const/4 v0, 0x0

    .line 38
    invoke-virtual {v1, p1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    .line 39
    invoke-virtual {v1, p1, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 40
    invoke-virtual {v1}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object p1

    iput-object p1, p0, Ll/ܶۜᩳ;->᩹:Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 104
    invoke-static {p1}, Ll/ۢ᩺ۡ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 105
    invoke-static {p1}, Ll/ۢ᩺ۡ;->ۜ(Ljava/lang/String;)I

    move-result p1

    .line 106
    iget-object v0, p0, Ll/ܶۜᩳ;->ۛ:Ll/᩻ۜᩳ;

    iget-object v0, v0, Ll/᩻ۜᩳ;->ۛ:Ll/۫ܽܽ;

    invoke-virtual {v0, p1}, Ll/۫ܽܽ;->ܽ(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 108
    :goto_0
    iget-object v0, p0, Ll/ܶۜᩳ;->ۤ:Landroid/widget/TextView;

    if-eqz p1, :cond_1

    .line 109
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 110
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    .line 111
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 112
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result p1

    const/16 v1, 0x8

    if-eq p1, v1, :cond_2

    .line 113
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 67
    iget-object p1, p0, Ll/ܶۜᩳ;->ۗ:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 68
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 69
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    const p1, 0x7f1200ee

    .line 70
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 73
    :cond_0
    iget-object p1, p0, Ll/ܶۜᩳ;->ۛ:Ll/᩻ۜᩳ;

    iget-object v1, p1, Ll/᩻ۜᩳ;->ۗ:Ll/ᩴܿܽ;

    .line 74
    iget-boolean v2, p0, Ll/ܶۜᩳ;->᩶:Z

    if-eqz v2, :cond_2

    .line 75
    iget-object v2, p0, Ll/ܶۜᩳ;->۬:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 76
    invoke-static {v3}, Ll/ۢ᩺ۡ;->֫(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 77
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    const p1, 0x7f120b48

    .line 78
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 81
    :cond_1
    invoke-static {v3}, Ll/ۢ᩺ۡ;->ۜ(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ᩴܿܽ;->֡(I)V

    .line 83
    :cond_2
    invoke-virtual {v1}, Ll/ᩴܿܽ;->۟֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 84
    invoke-virtual {v1, v0}, Ll/ᩴܿܽ;->֫(Ljava/lang/String;)V

    .line 85
    :cond_3
    iget-object v0, p0, Ll/ܶۜᩳ;->᩹:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    .line 86
    iget-object v0, p0, Ll/ܶۜᩳ;->᩸:Ll/ۜۜᩳ;

    iget-object v0, v0, Ll/ۜۜᩳ;->ᩳۧ:Ll/۫᩵ۘ;

    invoke-virtual {v0}, Ll/ۙ᩵ۘ;->notifyDataSetChanged()V

    const/4 v0, 0x1

    .line 87
    iput-boolean v0, p1, Ll/᩻ۜᩳ;->᩺:Z

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final ֫()V
    .locals 6

    .line 46
    iget-object v0, p0, Ll/ܶۜᩳ;->ۛ:Ll/᩻ۜᩳ;

    iget-object v1, v0, Ll/᩻ۜᩳ;->ۗ:Ll/ᩴܿܽ;

    .line 47
    invoke-virtual {v1}, Ll/ᩴܿܽ;->᩻֫()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    iget-object v0, v0, Ll/᩻ۜᩳ;->ۤ:Ll/᩶ܿܽ;

    invoke-virtual {v0}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "style"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Ll/ܶۜᩳ;->᩶:Z

    .line 48
    iget-object v2, p0, Ll/ܶۜᩳ;->۫:Landroid/view/View;

    iget-object v5, p0, Ll/ܶۜᩳ;->ۗ:Landroid/widget/EditText;

    if-eqz v0, :cond_1

    .line 49
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 50
    invoke-virtual {v1}, Ll/ᩴܿܽ;->۟֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    invoke-virtual {v1}, Ll/᩷ᩳܽ;->getParent()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    aput-object v0, v1, v4

    const-string v0, "%08X"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ܶۜᩳ;->۬:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_1
    const/16 v0, 0x8

    .line 53
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 54
    invoke-virtual {v1}, Ll/ᩴܿܽ;->۟֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    :goto_1
    iget-object v0, p0, Ll/ܶۜᩳ;->᩹:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->᩷()V

    .line 57
    iget-boolean v1, p0, Ll/ܶۜᩳ;->ۙ:Z

    if-eqz v1, :cond_2

    .line 58
    iput-boolean v4, p0, Ll/ܶۜᩳ;->ۙ:Z

    .line 59
    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 60
    iget-object v0, p0, Ll/ܶۜᩳ;->ۤ:Landroid/widget/TextView;

    invoke-static {v0}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;)V

    .line 62
    :cond_2
    invoke-static {v5}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    return-void
.end method
