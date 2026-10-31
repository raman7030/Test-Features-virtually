.class public final Ll/᩵ۨܳ;
.super Ljava/lang/Object;
.source "77HY"


# direct methods
.method public static ֫(Ll/۫ᩴܿ;)Ljava/lang/String;
    .locals 5

    .line 82
    invoke-virtual {p0}, Ll/۫ᩴܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 83
    instance-of v0, p0, Ll/۬۠ܿ;

    const-string v1, "unknown"

    if-eqz v0, :cond_0

    .line 84
    invoke-static {}, Ll/ۢ֨ۢ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 86
    :try_start_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶᩶ܿ;->֫(Ljava/lang/String;)Ll/ܿ᩹ܿ;

    move-result-object v0

    .line 87
    invoke-virtual {v0}, Ll/ܿ᩹ܿ;->ᩳ()I

    move-result v2

    invoke-static {v2}, Ll/ۧ۠᩵;->ۧ(I)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 88
    :try_start_1
    invoke-virtual {v0}, Ll/ܿ᩹ܿ;->ۡ()I

    move-result v3

    invoke-static {v3}, Lbin/mt/plus/Features;->ۧ(I)Ljava/lang/String;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 89
    :try_start_2
    invoke-virtual {v0}, Ll/ܿ᩹ܿ;->֫()I

    move-result v0

    invoke-static {v0}, Lbin/mt/plus/Features;->ۧ(I)Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :goto_0
    move-object v1, v0

    goto :goto_1

    .line 93
    :cond_0
    instance-of v0, p0, Ll/ۨᩴܿ;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ll/ۨᩴܿ;

    .line 95
    :try_start_3
    invoke-virtual {v0}, Ll/ۨᩴܿ;->᩶ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/system/Os;->lstat(Ljava/lang/String;)Landroid/system/StructStat;

    move-result-object v0

    .line 96
    iget v2, v0, Landroid/system/StructStat;->st_mode:I

    invoke-static {v2}, Ll/ۧ۠᩵;->ۧ(I)Ljava/lang/String;

    move-result-object v2
    :try_end_3
    .catch Landroid/system/ErrnoException; {:try_start_3 .. :try_end_3} :catch_1

    .line 97
    :try_start_4
    iget v3, v0, Landroid/system/StructStat;->st_uid:I

    invoke-static {v3}, Lbin/mt/plus/Features;->ۧ(I)Ljava/lang/String;

    move-result-object v3
    :try_end_4
    .catch Landroid/system/ErrnoException; {:try_start_4 .. :try_end_4} :catch_0

    .line 98
    :try_start_5
    iget v0, v0, Landroid/system/StructStat;->st_gid:I

    invoke-static {v0}, Lbin/mt/plus/Features;->ۧ(I)Ljava/lang/String;

    move-result-object v0
    :try_end_5
    .catch Landroid/system/ErrnoException; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_0

    :catch_0
    move-object v3, v1

    goto :goto_1

    :catch_1
    move-object v2, v1

    move-object v3, v2

    :catch_2
    :goto_1
    move-object v0, v1

    move-object v1, v2

    goto :goto_2

    :cond_1
    move-object v0, v1

    move-object v3, v0

    .line 102
    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "AndroidDataFileUnreadableException///"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "///"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 0
    invoke-static {v2, v3, p0, v0}, Ll/᩺᩵ܿ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۗܺ᩷;Ljava/lang/String;)V
    .locals 4

    const-string v0, "///"

    .line 106
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 107
    array-length v1, v0

    const/4 v2, 0x5

    if-ne v1, v2, :cond_0

    const/4 p1, 0x1

    .line 108
    aget-object p1, v0, p1

    const/4 v1, 0x2

    aget-object v1, v0, v1

    const/4 v2, 0x3

    aget-object v2, v0, v2

    const/4 v3, 0x4

    aget-object v0, v0, v3

    invoke-static {p0, p1, v1, v2, v0}, Ll/᩵ۨܳ;->֫(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 516
    invoke-virtual {p0, p1, v0}, Ll/ۗܺ᩷;->֫(Ljava/lang/String;Z)V

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const v0, 0x7f0d0071

    .line 119
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "Android"

    .line 120
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 122
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_0
    const v1, 0x7f0a01e0

    .line 124
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f0a01e2

    .line 125
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f0a0434

    .line 126
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v4, 0x7f0a041d

    .line 127
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v5, 0x7f0a0232

    .line 128
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 129
    invoke-static {p1}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 130
    invoke-static {p1}, Ll/ۢۤۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 131
    invoke-static {v3, p2}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 132
    invoke-static {v4, p3}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 133
    invoke-static {v5, p4}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    const-string p1, "unknown"

    .line 134
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 135
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_1
    const p1, 0x7f0a053d

    .line 137
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance p2, Ll/᩶ܶ᩷;

    const/4 p3, 0x3

    invoke-direct {p2, p3, p0}, Ll/᩶ܶ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 138
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p0

    invoke-virtual {p0, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const p1, 0x7f120189

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    invoke-virtual {p0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
