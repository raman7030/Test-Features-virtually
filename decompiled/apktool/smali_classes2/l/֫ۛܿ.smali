.class public abstract Ll/֫ۛܿ;
.super Ljava/lang/Object;
.source "M8VR"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;
.implements Landroid/view/View$OnClickListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final ᩶:Landroid/widget/TextView;

.field public final ᩸:Ll/֡ۚۢ;

.field public final ᩹:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;)V
    .locals 3

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7f0d00a1

    .line 40
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0631

    .line 41
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/֫ۛܿ;->᩶:Landroid/widget/TextView;

    const v1, 0x7f0a0199

    .line 42
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v1, 0x7f0a03b2

    .line 43
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v1, 0x7f0a03b5

    .line 44
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v1, 0x7f0a017d

    .line 45
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p0, Ll/֫ۛܿ;->᩹:Landroid/widget/EditText;

    const v2, 0x7f0a010e

    .line 46
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout;

    const v2, 0x7f0a00a4

    .line 47
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 49
    sget v2, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v2, Ll/᩵ۚۢ;

    invoke-direct {v2, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 50
    invoke-virtual {v2, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const/4 p1, 0x0

    .line 51
    invoke-virtual {v2, p1}, Ll/᩵ۚۢ;->֫(Z)V

    const p1, 0x7f12070a

    const/4 v0, 0x0

    .line 52
    invoke-virtual {v2, p1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    invoke-virtual {v2, p1, p0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 55
    invoke-virtual {v2}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object p1

    iput-object p1, p0, Ll/֫ۛܿ;->᩸:Ll/֡ۚۢ;

    .line 56
    new-instance v0, Ll/ܰۤܿ;

    invoke-direct {v0, p0}, Ll/ܰۤܿ;-><init>(Ll/֫ۛܿ;)V

    invoke-virtual {p1, v0}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 66
    invoke-virtual {p1, p0}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 67
    new-instance p1, Ll/۟ۤܿ;

    invoke-direct {p1, p0}, Ll/۟ۤܿ;-><init>(Ll/֫ۛܿ;)V

    invoke-virtual {v1, p1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    return-void
.end method

.method public static ֫(Ll/֫ۛܿ;ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 68
    iget-object v0, p0, Ll/֫ۛܿ;->᩹:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/TextView;->getInputType()I

    move-result v1

    sget v2, Ll/ۤۤᩳ;->۠ܿ:I

    const v2, 0x2000f

    and-int/2addr v1, v2

    const v2, 0x20001

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x42

    if-eq p1, v1, :cond_1

    const/16 v1, 0xa0

    if-ne p1, v1, :cond_2

    .line 70
    :cond_1
    invoke-virtual {v0}, Landroid/widget/TextView;->getImeOptions()I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_3

    const/4 v0, 0x4

    if-eq p1, v0, :cond_3

    const/4 v0, 0x6

    if-eq p1, v0, :cond_3

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0

    .line 75
    :cond_3
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_4

    .line 76
    invoke-virtual {p0}, Ll/֫ۛܿ;->ܽ()V

    :cond_4
    return p2
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 335
    invoke-virtual {p0}, Ll/֫ۛܿ;->ܽ()V

    return-void
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    return-void
.end method

.method public final ֫()V
    .locals 1

    .line 137
    iget-object v0, p0, Ll/֫ۛܿ;->᩸:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 264
    iget-object v0, p0, Ll/֫ۛܿ;->᩶:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 200
    iget-object v0, p0, Ll/֫ۛܿ;->᩹:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 141
    iget-object v0, p0, Ll/֫ۛܿ;->᩹:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 1

    .line 195
    iget-object v0, p0, Ll/֫ۛܿ;->᩹:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ܳ()V
    .locals 2

    const/4 v0, 0x2

    .line 122
    iget-object v1, p0, Ll/֫ۛܿ;->᩹:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setInputType(I)V

    return-void
.end method

.method public abstract ܽ()V
.end method

.method public final ܿ()V
    .locals 2

    const/4 v0, 0x6

    .line 127
    iget-object v1, p0, Ll/֫ۛܿ;->᩹:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setImeOptions(I)V

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 232
    iget-object v0, p0, Ll/֫ۛܿ;->᩹:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->selectAll()V

    return-void
.end method

.method public final ᩻()V
    .locals 1

    .line 153
    iget-object v0, p0, Ll/֫ۛܿ;->᩸:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->᩷()V

    .line 154
    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 160
    iget-object v0, p0, Ll/֫ۛܿ;->᩹:Landroid/widget/EditText;

    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    return-void
.end method
