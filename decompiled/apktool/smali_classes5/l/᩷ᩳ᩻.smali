.class public final Ll/᩷ᩳ᩻;
.super Ll/֫ۜܳ;
.source "Y96B"


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 10

    .line 60
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v0

    const v1, 0x7f0d00a4

    .line 61
    invoke-virtual {v0, v1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a05d0

    .line 62
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/google/android/material/textfield/TextInputLayout;

    const v2, 0x7f0a05d2

    .line 63
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/google/android/material/textfield/TextInputLayout;

    .line 64
    invoke-static {v4}, Ll/ۤ۬ۡ;->֫(Lcom/google/android/material/textfield/TextInputLayout;)V

    .line 65
    invoke-static {v5}, Ll/ۤ۬ۡ;->֫(Lcom/google/android/material/textfield/TextInputLayout;)V

    .line 66
    invoke-static {v4}, Lcom/google/android/material/textfield/TextInputLayoutHelper;->getEndIconDelegateOnClickListener(Lcom/google/android/material/textfield/TextInputLayout;)Landroid/view/View$OnClickListener;

    move-result-object v2

    .line 67
    new-instance v3, Ll/ᩳᩳ᩻;

    invoke-direct {v3, v2, v4, v5}, Ll/ᩳᩳ᩻;-><init>(Landroid/view/View$OnClickListener;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;)V

    invoke-virtual {v4, v3}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f0a00d9

    .line 75
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroid/widget/CheckBox;

    .line 76
    new-instance v7, Ll/ܳᩳ᩻;

    invoke-direct {v7}, Ll/ܳᩳ᩻;-><init>()V

    .line 77
    invoke-virtual {v7}, Ll/ܳᩳ᩻;->֫()V

    .line 78
    invoke-virtual {v0}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/high16 v3, 0x7f110000

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܺ()I

    move-result v6

    invoke-virtual {v2, v3, v6}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    iget-boolean v2, v7, Ll/ܳᩳ᩻;->ۧ:Z

    invoke-virtual {v8, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 80
    iget-boolean v2, v7, Ll/ܳᩳ᩻;->ܽ:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 81
    invoke-static {v4, v2}, Lcom/google/android/material/textfield/TextInputLayoutHelper;->setPasswordTransformation(Lcom/google/android/material/textfield/TextInputLayout;Z)V

    const/16 v2, 0x8

    .line 82
    invoke-virtual {v5, v2}, Landroid/view/View;->setVisibility(I)V

    .line 84
    :cond_0
    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v1, 0x7f12070a

    const/4 v2, 0x0

    .line 85
    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f12015e

    .line 86
    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 87
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v6

    .line 88
    invoke-virtual {v4}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    .line 89
    invoke-virtual {v6}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ܿᩳ᩻;

    move-object v3, v1

    move-object v9, p1

    invoke-direct/range {v3 .. v9}, Ll/ܿᩳ᩻;-><init>(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Ll/֡ۚۢ;Ll/ܳᩳ᩻;Landroid/widget/CheckBox;Ll/ۖۢܳ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 1

    const-string v0, "local"

    .line 49
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 55
    :cond_1
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۚ()Z

    move-result p1

    return p1
.end method
