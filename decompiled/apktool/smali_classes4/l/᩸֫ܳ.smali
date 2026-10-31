.class public final Ll/᩸֫ܳ;
.super Ljava/lang/Object;
.source "1599"


# static fields
.field public static ֫:Z = true

.field public static ۧ:Z = true


# direct methods
.method public static ֫(Landroid/widget/EditText;I)V
    .locals 1

    .line 256
    sget-boolean v0, Ll/᩸֫ܳ;->֫:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x10

    goto :goto_0

    :cond_0
    const/16 v0, 0xa

    :goto_0
    invoke-static {p1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 257
    invoke-virtual {p0}, Landroid/widget/TextView;->length()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setSelection(I)V

    return-void
.end method

.method public static bridge synthetic ֫(Landroid/widget/EditText;Landroid/widget/EditText;I)V
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/᩸֫ܳ;->ۧ(Landroid/widget/EditText;Landroid/widget/EditText;I)V

    return-void
.end method

.method public static ֫(Landroid/widget/EditText;Landroid/widget/EditText;Ll/ۜܰܿ;Ll/֡ۚۢ;)V
    .locals 12

    .line 127
    iget-object v0, p2, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    const v1, 0x7f120b48

    const/4 v2, 0x0

    .line 215
    :try_start_0
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    sget-boolean v4, Ll/᩸֫ܳ;->֫:Z

    const/16 v5, 0xa

    if-eqz v4, :cond_0

    const/16 v4, 0x10

    goto :goto_0

    :cond_0
    const/16 v4, 0xa

    :goto_0
    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    sget-boolean v4, Ll/᩸֫ܳ;->֫:Z

    if-eqz v4, :cond_1

    const/16 v5, 0x10

    :cond_1
    invoke-static {v3, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 934
    invoke-virtual {v0}, Ll/ۧܰܿ;->ᩳ()I

    move-result v1

    .line 141
    sget-boolean v3, Ll/᩸֫ܳ;->ۧ:Z

    const/4 v4, 0x1

    const v5, 0x7f12030d

    if-eqz v3, :cond_6

    :try_start_2
    const-string v3, "Selection range is out of bounds"
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    if-ltz v1, :cond_5

    if-ltz p0, :cond_5

    if-gt p0, v1, :cond_5

    if-ltz p1, :cond_5

    if-nez p1, :cond_2

    move v3, p0

    goto :goto_1

    :cond_2
    int-to-long v6, p0

    int-to-long v8, p1

    add-long/2addr v6, v8

    const-wide/16 v8, 0x1

    sub-long/2addr v6, v8

    if-eq p0, v1, :cond_4

    int-to-long v8, v1

    cmp-long v10, v6, v8

    if-gez v10, :cond_4

    long-to-int v3, v6

    :goto_1
    if-nez p1, :cond_3

    .line 156
    invoke-virtual {v0, p0, v4}, Ll/ۧܰܿ;->֫(IZ)V

    .line 295
    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    .line 296
    invoke-virtual {v0}, Ll/ۧܰܿ;->᩷()I

    move-result p0

    invoke-virtual {p2, p0}, Ll/ۜܰܿ;->֫(I)Z

    .line 151
    invoke-virtual {p3}, Ll/֡ۚۢ;->dismiss()V

    return-void

    :cond_3
    move p1, v3

    goto :goto_2

    .line 185
    :cond_4
    :try_start_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 178
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_0

    .line 146
    :catch_0
    invoke-static {v5, v2}, Ll/᩸ۚۢ;->ۧ(II)Ll/᩸ۚۢ;

    move-result-object p0

    invoke-virtual {p0}, Ll/᩸ۚۢ;->ۧ()V

    goto :goto_4

    :cond_6
    if-nez v1, :cond_7

    if-nez p0, :cond_7

    if-nez p1, :cond_7

    .line 156
    invoke-virtual {v0, v2, v4}, Ll/ۧܰܿ;->֫(IZ)V

    .line 295
    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    .line 296
    invoke-virtual {v0}, Ll/ۧܰܿ;->᩷()I

    move-result p0

    invoke-virtual {p2, p0}, Ll/ۜܰܿ;->֫(I)Z

    .line 156
    invoke-virtual {p3}, Ll/֡ۚۢ;->dismiss()V

    return-void

    :cond_7
    if-le p0, p1, :cond_8

    move v11, p1

    move p1, p0

    move p0, v11

    :cond_8
    :goto_2
    if-ltz p0, :cond_a

    if-lt p1, v1, :cond_9

    goto :goto_3

    .line 168
    :cond_9
    invoke-virtual {p2, p0, p1}, Ll/ۜܰܿ;->֫(II)V

    .line 169
    invoke-virtual {p3}, Ll/֡ۚۢ;->dismiss()V

    return-void

    .line 164
    :cond_a
    :goto_3
    invoke-static {v5, v2}, Ll/᩸ۚۢ;->ۧ(II)Ll/᩸ۚۢ;

    move-result-object p0

    invoke-virtual {p0}, Ll/᩸ۚۢ;->ۧ()V

    return-void

    .line 136
    :catch_1
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 137
    invoke-static {v1, v2}, Ll/᩸ۚۢ;->ۧ(II)Ll/᩸ۚۢ;

    move-result-object p0

    invoke-virtual {p0}, Ll/᩸ۚۢ;->ۧ()V

    goto :goto_4

    .line 129
    :catch_2
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 130
    invoke-static {v1, v2}, Ll/᩸ۚۢ;->ۧ(II)Ll/᩸ۚۢ;

    move-result-object p0

    invoke-virtual {p0}, Ll/᩸ۚۢ;->ۧ()V

    :goto_4
    return-void
.end method

.method public static ֫(Landroid/widget/EditText;Landroid/widget/EditText;Ll/ۜܰܿ;Z)V
    .locals 2

    .line 59
    sput-boolean p3, Ll/᩸֫ܳ;->֫:Z

    const/16 p3, 0x10

    .line 220
    :try_start_0
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sget-boolean v1, Ll/᩸֫ܳ;->֫:Z

    if-eqz v1, :cond_0

    const/16 v1, 0xa

    goto :goto_0

    :cond_0
    const/16 v1, 0x10

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    .line 221
    invoke-static {p0, v0}, Ll/᩸֫ܳ;->֫(Landroid/widget/EditText;I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 220
    :catch_0
    :try_start_1
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sget-boolean v1, Ll/᩸֫ܳ;->֫:Z

    if-eqz v1, :cond_1

    const/16 p3, 0xa

    :cond_1
    invoke-static {v0, p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p3

    .line 221
    invoke-static {p1, p3}, Ll/᩸֫ܳ;->֫(Landroid/widget/EditText;I)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 934
    :catch_1
    iget-object p2, p2, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {p2}, Ll/ۧܰܿ;->ᩳ()I

    move-result p2

    .line 62
    invoke-static {p0, p1, p2}, Ll/᩸֫ܳ;->ۧ(Landroid/widget/EditText;Landroid/widget/EditText;I)V

    return-void
.end method

.method public static ֫(Landroid/widget/TextView;Landroid/widget/EditText;Landroid/widget/EditText;Ll/ۜܰܿ;Z)V
    .locals 4

    .line 47
    sput-boolean p4, Ll/᩸֫ܳ;->ۧ:Z

    const/16 v0, 0x10

    if-eqz p4, :cond_3

    const p4, 0x7f12043c

    .line 49
    invoke-virtual {p0, p4}, Landroid/widget/TextView;->setText(I)V

    .line 229
    :try_start_0
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    sget-boolean p4, Ll/᩸֫ܳ;->֫:Z

    if-eqz p4, :cond_0

    const/16 p4, 0x10

    goto :goto_0

    :cond_0
    const/16 p4, 0xa

    :goto_0
    invoke-static {p0, p4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p0

    .line 230
    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p4

    sget-boolean v1, Ll/᩸֫ܳ;->֫:Z

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v0, 0xa

    :goto_1
    invoke-static {p4, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p4

    if-ge p4, p0, :cond_2

    .line 232
    invoke-static {p1, p4}, Ll/᩸֫ܳ;->֫(Landroid/widget/EditText;I)V

    sub-int/2addr p0, p4

    add-int/lit8 p0, p0, 0x1

    .line 233
    invoke-static {p2, p0}, Ll/᩸֫ܳ;->֫(Landroid/widget/EditText;I)V

    goto :goto_4

    :cond_2
    sub-int/2addr p4, p0

    add-int/lit8 p4, p4, 0x1

    .line 235
    invoke-static {p2, p4}, Ll/᩸֫ܳ;->֫(Landroid/widget/EditText;I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :cond_3
    const p4, 0x7f12043b

    .line 52
    invoke-virtual {p0, p4}, Landroid/widget/TextView;->setText(I)V

    .line 243
    :try_start_1
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    sget-boolean p4, Ll/᩸֫ܳ;->֫:Z

    if-eqz p4, :cond_4

    const/16 p4, 0x10

    goto :goto_2

    :cond_4
    const/16 p4, 0xa

    :goto_2
    invoke-static {p0, p4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p0

    .line 244
    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p4

    sget-boolean v1, Ll/᩸֫ܳ;->֫:Z

    if-eqz v1, :cond_5

    goto :goto_3

    :cond_5
    const/16 v0, 0xa

    :goto_3
    invoke-static {p4, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p4

    int-to-long v0, p0

    int-to-long v2, p4

    add-long/2addr v0, v2

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    const-wide/32 v2, -0x80000000

    cmp-long p0, v0, v2

    if-ltz p0, :cond_6

    const-wide/32 v2, 0x7fffffff

    cmp-long p0, v0, v2

    if-gtz p0, :cond_6

    long-to-int p0, v0

    .line 248
    invoke-static {p2, p0}, Ll/᩸֫ܳ;->֫(Landroid/widget/EditText;I)V

    goto :goto_4

    .line 247
    :cond_6
    new-instance p0, Ljava/lang/NumberFormatException;

    invoke-direct {p0}, Ljava/lang/NumberFormatException;-><init>()V

    throw p0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 934
    :catch_0
    :goto_4
    iget-object p0, p3, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {p0}, Ll/ۧܰܿ;->ᩳ()I

    move-result p0

    .line 55
    invoke-static {p1, p2, p0}, Ll/᩸֫ܳ;->ۧ(Landroid/widget/EditText;Landroid/widget/EditText;I)V

    return-void
.end method

.method public static ֫(Ll/ۜܰܿ;)V
    .locals 13

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0d00bb

    const/4 v2, 0x0

    .line 24
    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    const v3, 0x7f0a017d

    .line 25
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    const v4, 0x7f0a017e

    .line 26
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/EditText;

    const v5, 0x7f0a05e2

    .line 27
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    const v6, 0x7f0a00da

    .line 28
    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/CheckBox;

    const v7, 0x7f0a00de

    .line 29
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/CheckBox;

    .line 30
    sget-boolean v8, Ll/᩸֫ܳ;->ۧ:Z

    invoke-virtual {v6, v8}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 31
    sget-boolean v8, Ll/᩸֫ܳ;->֫:Z

    invoke-virtual {v7, v8}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 922
    iget-object v8, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v8}, Ll/ۧܰܿ;->᩷()I

    move-result v9

    .line 34
    invoke-static {v3, v9}, Ll/᩸֫ܳ;->֫(Landroid/widget/EditText;I)V

    .line 930
    invoke-virtual {v8}, Ll/ۧܰܿ;->ۡ()Z

    move-result v10

    const/4 v11, 0x1

    if-eqz v10, :cond_1

    .line 926
    invoke-virtual {v8}, Ll/ۧܰܿ;->ۜ()I

    move-result v10

    .line 38
    sget-boolean v12, Ll/᩸֫ܳ;->ۧ:Z

    if-eqz v12, :cond_0

    sub-int/2addr v10, v9

    add-int/2addr v10, v11

    .line 39
    invoke-static {v4, v10}, Ll/᩸֫ܳ;->֫(Landroid/widget/EditText;I)V

    goto :goto_0

    :cond_0
    const v9, 0x7f12043b

    .line 41
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setText(I)V

    .line 42
    invoke-static {v4, v10}, Ll/᩸֫ܳ;->֫(Landroid/widget/EditText;I)V

    .line 46
    :cond_1
    :goto_0
    new-instance v9, Ll/֡֫ܳ;

    invoke-direct {v9, v5, v3, v4, p0}, Ll/֡֫ܳ;-><init>(Landroid/widget/TextView;Landroid/widget/EditText;Landroid/widget/EditText;Ll/ۜܰܿ;)V

    invoke-virtual {v6, v9}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 58
    new-instance v5, Ll/ۚ֫ܳ;

    invoke-direct {v5, v3, v4, p0}, Ll/ۚ֫ܳ;-><init>(Landroid/widget/EditText;Landroid/widget/EditText;Ll/ۜܰܿ;)V

    invoke-virtual {v7, v5}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 65
    new-instance v5, Ll/ܶ֫ܳ;

    invoke-direct {v5, v3, v4, p0}, Ll/ܶ֫ܳ;-><init>(Landroid/widget/EditText;Landroid/widget/EditText;Ll/ۜܰܿ;)V

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 934
    invoke-virtual {v8}, Ll/ۧܰܿ;->ᩳ()I

    move-result v5

    .line 81
    invoke-static {v3, v4, v5}, Ll/᩸֫ܳ;->ۧ(Landroid/widget/EditText;Landroid/widget/EditText;I)V

    .line 83
    sget v5, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v5, Ll/᩵ۚۢ;

    invoke-direct {v5, v0}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 84
    invoke-virtual {v5, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v0, 0x7f12070a

    .line 85
    invoke-virtual {v5, v0, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    const v1, 0x7f120600

    .line 0
    invoke-static {v5, v0, v2, v1, v2}, Ll/ۛۙܽ;->֫(Ll/᩵ۚۢ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/֡ۚۢ;

    move-result-object v0

    .line 89
    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v1

    new-instance v2, Ll/᩹۫᩻;

    invoke-direct {v2, p0, v3, v4, v11}, Ll/᩹۫᩻;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 123
    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v1

    new-instance v2, Ll/֨֫ܳ;

    invoke-direct {v2, v3, v4, p0, v0}, Ll/֨֫ܳ;-><init>(Landroid/widget/EditText;Landroid/widget/EditText;Ll/ۜܰܿ;Ll/֡ۚۢ;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static ֫(Ll/ۜܰܿ;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/view/MenuItem;)V
    .locals 3

    .line 95
    invoke-interface {p3}, Landroid/view/MenuItem;->getItemId()I

    move-result p3

    .line 934
    iget-object p0, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {p0}, Ll/ۧܰܿ;->ᩳ()I

    move-result v0

    const v1, 0x104000d

    const/4 v2, 0x0

    if-ne p3, v1, :cond_1

    .line 98
    sget-boolean p0, Ll/᩸֫ܳ;->ۧ:Z

    if-eqz p0, :cond_0

    .line 99
    invoke-static {p1, v2}, Ll/᩸֫ܳ;->֫(Landroid/widget/EditText;I)V

    .line 100
    invoke-static {p2, v0}, Ll/᩸֫ܳ;->֫(Landroid/widget/EditText;I)V

    return-void

    .line 102
    :cond_0
    invoke-static {p1, v2}, Ll/᩸֫ܳ;->֫(Landroid/widget/EditText;I)V

    add-int/lit8 v0, v0, -0x1

    .line 103
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {p2, p0}, Ll/᩸֫ܳ;->֫(Landroid/widget/EditText;I)V

    return-void

    :cond_1
    const v1, 0x7f120602

    if-ne p3, v1, :cond_4

    .line 106
    sget-boolean p3, Ll/᩸֫ܳ;->ۧ:Z

    if-eqz p3, :cond_3

    .line 107
    invoke-static {p1, v2}, Ll/᩸֫ܳ;->֫(Landroid/widget/EditText;I)V

    if-nez v0, :cond_2

    goto :goto_0

    .line 926
    :cond_2
    invoke-virtual {p0}, Ll/ۧܰܿ;->ۜ()I

    move-result p0

    add-int/lit8 v2, p0, 0x1

    .line 108
    :goto_0
    invoke-static {p2, v2}, Ll/᩸֫ܳ;->֫(Landroid/widget/EditText;I)V

    return-void

    .line 110
    :cond_3
    invoke-static {p1, v2}, Ll/᩸֫ܳ;->֫(Landroid/widget/EditText;I)V

    return-void

    :cond_4
    const p1, 0x7f120603

    if-ne p3, p1, :cond_6

    .line 113
    sget-boolean p1, Ll/᩸֫ܳ;->ۧ:Z

    if-eqz p1, :cond_5

    .line 922
    invoke-virtual {p0}, Ll/ۧܰܿ;->᩷()I

    move-result p0

    sub-int/2addr v0, p0

    .line 114
    invoke-static {p2, v0}, Ll/᩸֫ܳ;->֫(Landroid/widget/EditText;I)V

    return-void

    :cond_5
    add-int/lit8 v0, v0, -0x1

    .line 116
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {p2, p0}, Ll/᩸֫ܳ;->֫(Landroid/widget/EditText;I)V

    :cond_6
    return-void
.end method

.method public static ۧ(Landroid/widget/EditText;Landroid/widget/EditText;I)V
    .locals 2

    .line 193
    :try_start_0
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    sget-boolean v0, Ll/᩸֫ܳ;->֫:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x10

    goto :goto_0

    :cond_0
    const/16 v0, 0xa

    :goto_0
    invoke-static {p0, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p0

    if-ge p0, p2, :cond_4

    .line 196
    sget-boolean v0, Ll/᩸֫ܳ;->ۧ:Z

    if-eqz v0, :cond_2

    sub-int/2addr p2, p0

    .line 198
    sget-boolean p0, Ll/᩸֫ܳ;->֫:Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v0, "1\u2026"

    if-eqz p0, :cond_1

    .line 199
    :try_start_1
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    return-void

    .line 201
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    return-void

    :cond_2
    add-int/lit8 p2, p2, -0x1

    .line 204
    sget-boolean v0, Ll/᩸֫ܳ;->֫:Z
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    const-string v1, "\u2026"

    if-eqz v0, :cond_3

    .line 205
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    return-void

    .line 207
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    return-void

    .line 195
    :cond_4
    new-instance p0, Ljava/lang/NumberFormatException;

    invoke-direct {p0}, Ljava/lang/NumberFormatException;-><init>()V

    throw p0
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    const/4 p0, 0x0

    .line 210
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method
