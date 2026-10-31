.class public final Ll/֨᩺ܿ;
.super Ljava/lang/Object;
.source "44R4"


# static fields
.field public static ֫:Z = true


# direct methods
.method public static ֫(Landroid/widget/EditText;Ll/ۜܰܿ;Z)V
    .locals 3

    .line 33
    sput-boolean p2, Ll/֨᩺ܿ;->֫:Z

    const/16 v0, 0x10

    .line 35
    :try_start_0
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz p2, :cond_0

    const/16 v2, 0xa

    goto :goto_0

    :cond_0
    const/16 v2, 0x10

    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    if-eqz p2, :cond_1

    const/16 v2, 0x10

    goto :goto_1

    :cond_1
    const/16 v2, 0xa

    .line 36
    :goto_1
    invoke-static {v1, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    invoke-virtual {p0}, Landroid/widget/TextView;->length()I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/widget/EditText;->setSelection(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    nop

    .line 41
    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "0\u2026"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 934
    iget-object p1, p1, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {p1}, Ll/ۧܰܿ;->ᩳ()I

    move-result p1

    if-eqz p2, :cond_2

    goto :goto_3

    :cond_2
    const/16 v0, 0xa

    .line 41
    :goto_3
    invoke-static {p1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static ֫(Ll/ۜܰܿ;)V
    .locals 7

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0d00ba

    const/4 v2, 0x0

    .line 21
    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    const v3, 0x7f0a017d

    .line 22
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    .line 23
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "0\u2026"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 934
    iget-object v5, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v5}, Ll/ۧܰܿ;->ᩳ()I

    move-result v5

    .line 23
    sget-boolean v6, Ll/֨᩺ܿ;->֫:Z

    if-eqz v6, :cond_0

    const/16 v6, 0x10

    goto :goto_0

    :cond_0
    const/16 v6, 0xa

    :goto_0
    invoke-static {v5, v6}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    const v4, 0x7f0a00da

    .line 24
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/CheckBox;

    .line 25
    sget-boolean v5, Ll/֨᩺ܿ;->֫:Z

    invoke-virtual {v4, v5}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 26
    sget v5, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v5, Ll/᩵ۚۢ;

    invoke-direct {v5, v0}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 27
    invoke-virtual {v5, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v0, 0x7f12070a

    .line 28
    invoke-virtual {v5, v0, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    .line 29
    invoke-virtual {v5, v0, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 30
    invoke-virtual {v5}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v0

    .line 31
    invoke-static {v3}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    .line 32
    new-instance v1, Ll/֡᩺ܿ;

    invoke-direct {v1, v3, p0}, Ll/֡᩺ܿ;-><init>(Landroid/widget/EditText;Ll/ۜܰܿ;)V

    invoke-virtual {v4, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 43
    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v1

    new-instance v2, Ll/ۚ᩺ܿ;

    invoke-direct {v2, v3, v4, p0, v0}, Ll/ۚ᩺ܿ;-><init>(Landroid/widget/EditText;Landroid/widget/CheckBox;Ll/ۜܰܿ;Ll/֡ۚۢ;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
