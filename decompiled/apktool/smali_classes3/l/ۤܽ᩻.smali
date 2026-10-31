.class public final Ll/ۤܽ᩻;
.super Ll/֫ۜܳ;
.source "795C"


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 13

    .line 62
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    const-string v1, "local"

    .line 63
    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    .line 64
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܺ()I

    move-result v2

    const/4 v3, 0x1

    const v4, 0x7f120a89

    if-ne v2, v3, :cond_1

    .line 74
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۡ()Ll/ᩳۜܳ;

    move-result-object v0

    invoke-interface {v0}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 75
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v2

    const v3, 0x7f0d0090

    invoke-virtual {v2, v3}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f0a017d

    .line 76
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Landroid/widget/EditText;

    const v3, 0x7f0a017e

    .line 77
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Landroid/widget/EditText;

    const v3, 0x7f0a017f

    .line 78
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Landroid/widget/EditText;

    const v3, 0x7f0a05d0

    .line 79
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Lcom/google/android/material/textfield/TextInputLayout;

    const v3, 0x7f0a05d2

    .line 80
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/google/android/material/textfield/TextInputLayout;

    .line 81
    invoke-static {v9}, Ll/ۤ۬ۡ;->֫(Lcom/google/android/material/textfield/TextInputLayout;)V

    .line 83
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v11

    .line 84
    invoke-virtual {v11, v1}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v11}, Ll/ܽۢܳ;->۫()Z

    move-result v1

    if-nez v1, :cond_0

    .line 85
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۢ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11}, Ll/ܽۢܳ;->֨()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 86
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    invoke-virtual {v11}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, -0x1

    .line 89
    invoke-virtual {v3, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconMode(I)V

    const v1, 0x7f080221

    .line 90
    invoke-virtual {v3, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconDrawable(I)V

    .line 91
    new-instance v1, Ll/֫᩸ܽ;

    invoke-direct {v1, p1, v11, v7}, Ll/֫᩸ܽ;-><init>(Ll/ۖۢܳ;Ll/ܽۢܳ;Landroid/widget/EditText;)V

    invoke-virtual {v3, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 125
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۧ֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "-link"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۘ֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 126
    invoke-virtual {p1}, Ll/ۖۢܳ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 128
    :goto_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۖ֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 130
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    .line 131
    invoke-virtual {v0, v4}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 132
    invoke-virtual {v0, v2}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v1, 0x7f12070a

    const v2, 0x7f12015e

    const/4 v3, 0x0

    .line 0
    invoke-static {v0, v1, v3, v2, v3}, Ll/۟ۖᩴ;->֫(Ll/᩵ۚۢ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/֡ۚۢ;

    move-result-object v10

    .line 136
    invoke-virtual {v10}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ۗܽ᩻;

    move-object v5, v1

    move-object v12, p1

    invoke-direct/range {v5 .. v12}, Ll/ۗܽ᩻;-><init>(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Lcom/google/android/material/textfield/TextInputLayout;Ll/֡ۚۢ;Ll/ܽۢܳ;Ll/ۖۢܳ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    .line 68
    :cond_1
    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->֫(Ljava/lang/String;)V

    const v0, 0x7f1205e8

    .line 69
    invoke-static {p1, v0}, Ll/֫ۜܳ;->֫(Ll/ۖۢܳ;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v4, v0}, Ll/֫ۜܳ;->֫(Ll/ۖۢܳ;ILjava/lang/CharSequence;)Ll/֡ۚۢ;

    return-void
.end method

.method public final ܿ(Ll/ۖۢܳ;)V
    .locals 3

    .line 166
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    const-string v1, "local"

    .line 167
    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->֫(Ljava/lang/String;)V

    .line 169
    sget v1, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v1, Ll/֨۠ۢ;

    const-class v2, Ll/۫ܽ᩻;

    invoke-direct {v1, v2}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 170
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/֨۠ۢ;->֫(Ljava/util/List;)V

    .line 171
    invoke-virtual {v1, p1}, Ll/֨۠ۢ;->ۧ(Ll/ۖۢܳ;)V

    const-string p1, "targetPath"

    .line 172
    invoke-virtual {v0}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    invoke-virtual {v1}, Ll/֨۠ۢ;->֫()I

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 4

    const-string v0, "local"

    .line 48
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v1

    .line 52
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 53
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܺ()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    invoke-virtual {v1, v0}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 54
    invoke-virtual {v1}, Ll/ܽۢܳ;->۫()Z

    move-result v0

    if-nez v0, :cond_2

    .line 55
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۢ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Ll/ܽۢܳ;->֨()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    return v3

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
