.class public Ll/ۡܶۧ;
.super Ll/ܳ᩸ۧ;
.source "766I"


# instance fields
.field public ۛ:Landroid/widget/EditText;

.field public ۨ:J

.field public ܰ:Ljava/lang/CharSequence;

.field public final ᩺:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 32
    invoke-direct {p0}, Ll/ܳ᩸ۧ;-><init>()V

    .line 40
    new-instance v0, Ll/ۢܶۧ;

    invoke-direct {v0, p0}, Ll/ۢܶۧ;-><init>(Ll/ۡܶۧ;)V

    iput-object v0, p0, Ll/ۡܶۧ;->᩺:Ljava/lang/Runnable;

    const-wide/16 v0, -0x1

    .line 46
    iput-wide v0, p0, Ll/ۡܶۧ;->ۨ:J

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 61
    invoke-super {p0, p1}, Ll/ܳ᩸ۧ;->onCreate(Landroid/os/Bundle;)V

    if-nez p1, :cond_0

    .line 96
    invoke-virtual {p0}, Ll/ܳ᩸ۧ;->ۧ()Ll/ۧܶۧ;

    move-result-object p1

    check-cast p1, Ll/ۜܶۧ;

    .line 63
    invoke-virtual {p1}, Ll/ۜܶۧ;->ᩴ֫()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۡܶۧ;->ܰ:Ljava/lang/CharSequence;

    return-void

    :cond_0
    const-string v0, "EditTextPreferenceDialogFragment.text"

    .line 65
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Ll/ۡܶۧ;->ܰ:Ljava/lang/CharSequence;

    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 71
    invoke-super {p0, p1}, Ll/ܳ᩸ۧ;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "EditTextPreferenceDialogFragment.text"

    .line 72
    iget-object v1, p0, Ll/ۡܶۧ;->ܰ:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 1

    .line 77
    invoke-super {p0, p1}, Ll/ܳ᩸ۧ;->֫(Landroid/view/View;)V

    const v0, 0x1020003

    .line 79
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Ll/ۡܶۧ;->ۛ:Landroid/widget/EditText;

    if-eqz p1, :cond_0

    .line 86
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 87
    iget-object p1, p0, Ll/ۡܶۧ;->ۛ:Landroid/widget/EditText;

    iget-object v0, p0, Ll/ۡܶۧ;->ܰ:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    iget-object p1, p0, Ll/ۡܶۧ;->ۛ:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 96
    invoke-virtual {p0}, Ll/ܳ᩸ۧ;->ۧ()Ll/ۧܶۧ;

    move-result-object p1

    check-cast p1, Ll/ۜܶۧ;

    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 82
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Dialog view must contain an EditText with id @android:id/edit"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 147
    iget-object p1, p0, Ll/ۡܶۧ;->ۛ:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 96
    invoke-virtual {p0}, Ll/ܳ᩸ۧ;->ۧ()Ll/ۧܶۧ;

    move-result-object v0

    check-cast v0, Ll/ۜܶۧ;

    .line 149
    invoke-virtual {v0, p1}, Ll/֫᩸ۧ;->֫(Ljava/io/Serializable;)V

    .line 150
    invoke-virtual {v0, p1}, Ll/ۜܶۧ;->ܽ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 113
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۡܶۧ;->ۨ:J

    .line 121
    invoke-virtual {p0}, Ll/ۡܶۧ;->ᩳ()V

    return-void
.end method

.method public final ᩳ()V
    .locals 7

    .line 108
    iget-wide v0, p0, Ll/ۡܶۧ;->ۨ:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_3

    const-wide/16 v4, 0x3e8

    add-long/2addr v0, v4

    .line 109
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v4

    cmp-long v6, v0, v4

    if-lez v6, :cond_3

    .line 128
    iget-object v0, p0, Ll/ۡܶۧ;->ۛ:Landroid/widget/EditText;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 132
    :cond_0
    iget-object v0, p0, Ll/ۡܶۧ;->ۛ:Landroid/widget/EditText;

    .line 133
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 135
    iget-object v1, p0, Ll/ۡܶۧ;->ۛ:Landroid/widget/EditText;

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 113
    iput-wide v2, p0, Ll/ۡܶۧ;->ۨ:J

    return-void

    .line 138
    :cond_1
    iget-object v0, p0, Ll/ۡܶۧ;->ۛ:Landroid/widget/EditText;

    iget-object v1, p0, Ll/ۡܶۧ;->᩺:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 139
    iget-object v0, p0, Ll/ۡܶۧ;->ۛ:Landroid/widget/EditText;

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 113
    :cond_2
    :goto_0
    iput-wide v2, p0, Ll/ۡܶۧ;->ۨ:J

    :cond_3
    return-void
.end method
