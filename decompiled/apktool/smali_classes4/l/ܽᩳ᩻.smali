.class public final Ll/ܽᩳ᩻;
.super Ll/֫ۜܳ;
.source "J951"


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f120a8b

    const/4 v1, -0x1

    .line 47
    invoke-direct {p0, v0, v1}, Ll/֫ۜܳ;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 10

    .line 63
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v3

    const v0, 0x7f0d00a4

    .line 64
    invoke-virtual {v3, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0631

    .line 65
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f120a8b

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    const v1, 0x7f0a05d0

    .line 66
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/google/android/material/textfield/TextInputLayout;

    .line 67
    invoke-static {v2}, Ll/ۤ۬ۡ;->֫(Lcom/google/android/material/textfield/TextInputLayout;)V

    const v1, 0x7f0a05d2

    .line 68
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/16 v4, 0x8

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    const v1, 0x7f0a03b2

    .line 69
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    const v1, 0x7f0a00d9

    .line 70
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/CheckBox;

    .line 71
    new-instance v6, Ll/ܳᩳ᩻;

    invoke-direct {v6}, Ll/ܳᩳ᩻;-><init>()V

    .line 72
    invoke-virtual {v6}, Ll/ܳᩳ᩻;->֫()V

    .line 73
    invoke-virtual {v3}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/high16 v4, 0x7f110000

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܺ()I

    move-result v5

    invoke-virtual {v1, v4, v5}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    iget-boolean v1, v6, Ll/ܳᩳ᩻;->֫:Z

    invoke-virtual {v7, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 75
    invoke-virtual {v3}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const/4 v0, 0x0

    const v4, 0x7f12015e

    const v5, 0x7f12070a

    .line 0
    invoke-static {v1, v5, v0, v4, v0}, Ll/۟ۖᩴ;->֫(Ll/᩵ۚۢ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/֡ۚۢ;

    move-result-object v5

    .line 79
    invoke-virtual {v2}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    .line 80
    invoke-virtual {v5}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v8

    new-instance v9, Ll/ۨܽ᩻;

    move-object v0, v9

    move-object v1, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v7}, Ll/ۨܽ᩻;-><init>(Ll/ܽᩳ᩻;Lcom/google/android/material/textfield/TextInputLayout;Lbin/mt/plus/Main;Ll/ۖۢܳ;Ll/֡ۚۢ;Ll/ܳᩳ᩻;Landroid/widget/CheckBox;)V

    invoke-virtual {v8, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 1

    const-string v0, "local"

    .line 52
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 58
    :cond_1
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۚ()Z

    move-result p1

    return p1
.end method
