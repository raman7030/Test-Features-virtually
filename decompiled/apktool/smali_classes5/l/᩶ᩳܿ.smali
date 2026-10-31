.class public final Ll/᩶ᩳܿ;
.super Ljava/lang/Object;
.source "G7PV"

# interfaces
.implements Ll/᩵ᩳܿ;


# virtual methods
.method public final ֫(ILandroid/widget/EditText;Landroid/widget/Button;)Ll/ۧܿܿ;
    .locals 0

    .line 154
    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 155
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 156
    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    .line 157
    invoke-static {p2}, Ll/֡ܳܿ;->ᩳ(Landroid/view/View;)V

    const p1, 0x7f120304

    .line 158
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    const/4 p1, 0x0

    return-object p1

    .line 161
    :cond_0
    new-instance p2, Ll/ۙᩳܿ;

    invoke-direct {p2, p1}, Ll/ۙᩳܿ;-><init>(Ljava/lang/String;)V

    return-object p2
.end method

.method public final ֫(Landroid/widget/Button;Ll/֡ܳܿ;)V
    .locals 0

    .line 148
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/Button;)V
    .locals 1

    const/4 v0, 0x0

    .line 141
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    const/16 p1, 0x8

    .line 142
    invoke-virtual {p3, p1}, Landroid/view/View;->setVisibility(I)V

    .line 143
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final ֫(Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/Button;Ll/ۧܿܿ;)V
    .locals 0

    .line 135
    invoke-virtual {p4}, Ll/ۧܿܿ;->֫()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 136
    invoke-virtual {p0, p1, p2, p3}, Ll/᩶ᩳܿ;->֫(Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/Button;)V

    return-void
.end method
