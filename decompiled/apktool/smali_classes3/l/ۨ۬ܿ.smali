.class public abstract Ll/ۨ۬ܿ;
.super Ljava/lang/Object;
.source "A5PU"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final ۙ:Landroid/widget/TextView;

.field public final ᩶:Landroid/widget/TextView;

.field public final ᩸:Ll/֡ۚۢ;

.field public final ᩹:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;I)V
    .locals 4

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7f0d00de

    .line 29
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0631

    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/ۨ۬ܿ;->ۙ:Landroid/widget/TextView;

    const v1, 0x7f0a0397

    .line 31
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/ۨ۬ܿ;->᩶:Landroid/widget/TextView;

    const v1, 0x7f0a017d

    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p0, Ll/ۨ۬ܿ;->᩹:Landroid/widget/EditText;

    .line 33
    sget v2, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v2, Ll/᩵ۚۢ;

    invoke-direct {v2, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 34
    invoke-virtual {v2, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const/4 p1, 0x0

    .line 35
    invoke-virtual {v2, p1}, Ll/᩵ۚۢ;->֫(Z)V

    const p1, 0x7f12070a

    const/4 v0, 0x0

    .line 36
    invoke-virtual {v2, p1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance p1, Ll/ۤ۬ܿ;

    invoke-direct {p1, p0}, Ll/ۤ۬ܿ;-><init>(Ll/ۨ۬ܿ;)V

    const v3, 0x7f12015e

    .line 37
    invoke-virtual {v2, v3, p1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const/4 p1, -0x1

    if-eq p2, p1, :cond_0

    .line 39
    invoke-virtual {v2, p2, v0}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 40
    :cond_0
    invoke-virtual {v2}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ۬ܿ;->᩸:Ll/֡ۚۢ;

    .line 41
    new-instance p2, Ll/ۛ۬ܿ;

    invoke-direct {p2, p0}, Ll/ۛ۬ܿ;-><init>(Ll/ۨ۬ܿ;)V

    invoke-virtual {p1, p2}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 42
    invoke-static {p1}, Ll/ۚۗܿ;->֫(Ll/֡ۚۢ;)V

    .line 43
    invoke-static {p1}, Ll/ۡܶۡ;->ۧ(Ll/֡ۚۢ;)V

    .line 44
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 124
    invoke-virtual {p0}, Ll/ۨ۬ܿ;->ܿ()V

    return-void
.end method

.method public final ֫()V
    .locals 1

    .line 48
    iget-object v0, p0, Ll/ۨ۬ܿ;->᩸:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 97
    iget-object v0, p0, Ll/ۨ۬ܿ;->᩶:Landroid/widget/TextView;

    if-nez p1, :cond_0

    const/16 p1, 0x8

    .line 98
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 100
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 101
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۜ()V
    .locals 2

    .line 56
    iget-object v0, p0, Ll/ۨ۬ܿ;->᩸:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->᩷()V

    .line 57
    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 58
    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 60
    new-instance v1, Ll/۫۬ܿ;

    invoke-direct {v1, p0}, Ll/۫۬ܿ;-><init>(Ll/ۨ۬ܿ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    :cond_0
    iget-object v0, p0, Ll/ۨ۬ܿ;->᩹:Landroid/widget/EditText;

    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Ll/ۨ۬ܿ;->᩹:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 1

    .line 76
    iget-object v0, p0, Ll/ۨ۬ܿ;->᩹:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ܳ()V
    .locals 1

    .line 92
    iget-object v0, p0, Ll/ۨ۬ܿ;->᩹:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->selectAll()V

    return-void
.end method

.method public ܽ()V
    .locals 0

    return-void
.end method

.method public abstract ܿ()V
.end method

.method public ᩳ()V
    .locals 0

    return-void
.end method

.method public final ᩻()V
    .locals 2

    const v0, 0x7f120306

    .line 107
    iget-object v1, p0, Ll/ۨ۬ܿ;->ۙ:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method
