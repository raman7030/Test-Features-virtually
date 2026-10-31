.class public final Ll/᩶֨ܳ;
.super Ll/۠ܶۢ;
.source "E4GI"


# instance fields
.field public final synthetic ۜ:Ll/۫֨ܳ;


# direct methods
.method public constructor <init>(Ll/۫֨ܳ;)V
    .locals 0

    .line 151
    iput-object p1, p0, Ll/᩶֨ܳ;->ۜ:Ll/۫֨ܳ;

    invoke-direct {p0}, Ll/۠ܶۢ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;)Landroid/view/View;
    .locals 2

    const v0, 0x7f0d00de

    .line 154
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f0a0397

    .line 155
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a017d

    .line 156
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    .line 157
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 158
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 159
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    return-object p1
.end method

.method public final ֫(Ll/֡ۚۢ;)V
    .locals 1

    .line 182
    invoke-virtual {p1}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Ll/᩹֨ܳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final ֫(Ll/᩵ۚۢ;)V
    .locals 2

    const v0, 0x7f1201a8

    const/4 v1, 0x0

    .line 177
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    return-void
.end method

.method public final ֫(Landroid/view/View;)Z
    .locals 1

    .line 165
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    .line 166
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 167
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const p1, 0x7f120305

    const/4 v0, 0x0

    .line 168
    invoke-static {p1, v0}, Ll/᩸ۚۢ;->ۧ(II)Ll/᩸ۚۢ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸ۚۢ;->ۧ()V

    return v0

    .line 171
    :cond_0
    iget-object v0, p0, Ll/᩶֨ܳ;->ۜ:Ll/۫֨ܳ;

    invoke-static {v0}, Ll/۫֨ܳ;->ۧ(Ll/۫֨ܳ;)Ll/۬֨ܳ;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/۬֨ܳ;->֫(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method
