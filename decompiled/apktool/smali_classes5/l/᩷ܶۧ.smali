.class public Ll/᩷ܶۧ;
.super Ll/ᩳ᩸ۧ;
.source "S4SM"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public ۛ:Landroid/widget/EditText;

.field public ۨ:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 46
    invoke-direct {p0}, Ll/ᩳ᩸ۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 64
    invoke-super {p0, p1}, Ll/ᩳ᩸ۧ;->onCreate(Landroid/os/Bundle;)V

    if-nez p1, :cond_0

    .line 96
    invoke-virtual {p0}, Ll/ᩳ᩸ۧ;->֫()Ll/ۧܶۧ;

    move-result-object p1

    check-cast p1, Ll/ۜܶۧ;

    .line 66
    invoke-virtual {p1}, Ll/ۜܶۧ;->ᩴ֫()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ܶۧ;->ۨ:Ljava/lang/CharSequence;

    return-void

    :cond_0
    const-string v0, "EditTextPreferenceDialogFragment.text"

    .line 68
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ܶۧ;->ۨ:Ljava/lang/CharSequence;

    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 74
    invoke-super {p0, p1}, Ll/ᩳ᩸ۧ;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "EditTextPreferenceDialogFragment.text"

    .line 75
    iget-object v1, p0, Ll/᩷ܶۧ;->ۨ:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 1

    .line 80
    invoke-super {p0, p1}, Ll/ᩳ᩸ۧ;->֫(Landroid/view/View;)V

    const v0, 0x1020003

    .line 82
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Ll/᩷ܶۧ;->ۛ:Landroid/widget/EditText;

    .line 83
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 85
    iget-object p1, p0, Ll/᩷ܶۧ;->ۛ:Landroid/widget/EditText;

    if-eqz p1, :cond_0

    .line 90
    iget-object v0, p0, Ll/᩷ܶۧ;->ۨ:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    iget-object p1, p0, Ll/᩷ܶۧ;->ۛ:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setSelection(I)V

    return-void

    .line 86
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Dialog view must contain an EditText with id @android:id/edit"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p1, :cond_0

    .line 115
    iget-object p1, p0, Ll/᩷ܶۧ;->ۛ:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 96
    invoke-virtual {p0}, Ll/ᩳ᩸ۧ;->֫()Ll/ۧܶۧ;

    move-result-object v0

    check-cast v0, Ll/ۜܶۧ;

    .line 116
    invoke-virtual {v0, p1}, Ll/֫᩸ۧ;->֫(Ljava/io/Serializable;)V

    .line 96
    invoke-virtual {p0}, Ll/ᩳ᩸ۧ;->֫()Ll/ۧܶۧ;

    move-result-object v0

    check-cast v0, Ll/ۜܶۧ;

    .line 117
    invoke-virtual {v0, p1}, Ll/ۜܶۧ;->ܽ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
