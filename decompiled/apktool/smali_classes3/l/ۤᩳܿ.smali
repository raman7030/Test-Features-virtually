.class public final Ll/ۤᩳܿ;
.super Ljava/lang/Object;
.source "J7R3"

# interfaces
.implements Ll/᩵ᩳܿ;


# virtual methods
.method public final ֫(ILandroid/widget/EditText;Landroid/widget/Button;)Ll/ۧܿܿ;
    .locals 0

    const p1, 0x7f0a05cd

    .line 395
    invoke-virtual {p3, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۧܿܿ;

    if-nez p1, :cond_0

    .line 397
    invoke-static {p3}, Ll/֡ܳܿ;->ᩳ(Landroid/view/View;)V

    const/4 p1, 0x0

    :cond_0
    return-object p1
.end method

.method public final ֫(Landroid/widget/Button;Ll/֡ܳܿ;)V
    .locals 1

    .line 257
    new-instance v0, Ll/۫ᩳܿ;

    invoke-direct {v0, p1, p2}, Ll/۫ᩳܿ;-><init>(Landroid/widget/Button;Ll/֡ܳܿ;)V

    .line 389
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public final ֫(Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/Button;)V
    .locals 2

    const/16 v0, 0x8

    .line 245
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    const/4 p1, 0x0

    .line 246
    invoke-virtual {p3, p1}, Landroid/view/View;->setVisibility(I)V

    const v1, 0x7f0a05cd

    .line 247
    invoke-virtual {p3, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p3

    instance-of v1, p3, Ll/ۨᩳܿ;

    if-eqz v1, :cond_0

    check-cast p3, Ll/ۨᩳܿ;

    .line 248
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 249
    invoke-virtual {p3}, Ll/ۨᩳܿ;->ۜ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 251
    :cond_0
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final ֫(Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/Button;Ll/ۧܿܿ;)V
    .locals 1

    const v0, 0x7f0a05cd

    .line 239
    invoke-virtual {p3, v0, p4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 240
    invoke-virtual {p0, p1, p2, p3}, Ll/ۤᩳܿ;->֫(Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/Button;)V

    return-void
.end method
