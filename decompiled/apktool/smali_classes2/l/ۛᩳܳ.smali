.class public final Ll/ۛᩳܳ;
.super Ljava/lang/Object;
.source "R6KO"


# direct methods
.method public static ֫(Landroid/content/Context;I)I
    .locals 0

    int-to-float p1, p1

    .line 103
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    mul-float p1, p1, p0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p0

    return p0
.end method

.method public static ֫(Landroid/widget/LinearLayout;Ljava/lang/String;IZI)V
    .locals 2

    .line 91
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 92
    new-instance v1, Ll/ܳܺ;

    invoke-direct {v1, v0}, Ll/ܳܺ;-><init>(Landroid/content/Context;)V

    .line 93
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    int-to-float p1, p2

    .line 94
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextSize(F)V

    if-eqz p3, :cond_0

    .line 95
    sget p1, Ll/᩹֡᩷;->ۜ֫:I

    goto :goto_0

    :cond_0
    sget p1, Ll/᩹֡᩷;->ܳ֫:I

    :goto_0
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 96
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 p2, -0x1

    const/4 p3, -0x2

    invoke-direct {p1, p2, p3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 98
    invoke-static {v0, p4}, Ll/ۛᩳܳ;->֫(Landroid/content/Context;I)I

    move-result p2

    iput p2, p1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 99
    invoke-virtual {p0, v1, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public static ֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;)V
    .locals 17

    .line 27
    invoke-virtual/range {p0 .. p0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v8

    .line 28
    invoke-interface/range {p1 .. p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֨ᩳܳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "multipart/related"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    const/4 v0, 0x0

    .line 83
    :try_start_0
    invoke-static/range {p0 .. p1}, Ll/ᩴܿܳ;->֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;)Ll/ᩴܿܳ;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v10, v1

    goto :goto_0

    :catch_0
    move-object v10, v0

    .line 30
    :goto_0
    invoke-virtual/range {p0 .. p0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v11

    .line 31
    invoke-virtual {v11}, Ll/᩵ۚۢ;->ۧ()Landroid/content/Context;

    move-result-object v1

    .line 32
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x1

    .line 33
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v4, 0x18

    .line 34
    invoke-static {v1, v4}, Ll/ۛᩳܳ;->֫(Landroid/content/Context;I)I

    move-result v4

    const/16 v5, 0xc

    .line 35
    invoke-static {v1, v5}, Ll/ۛᩳܳ;->֫(Landroid/content/Context;I)I

    move-result v6

    const/4 v7, 0x0

    invoke-virtual {v2, v4, v6, v4, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 36
    new-instance v12, Ll/֨ܿܳ;

    sget-object v4, Ll/ۙ᩸᩷;->᩻:Ll/۫ۤۡ;

    invoke-direct {v12, v4}, Ll/֨ܿܳ;-><init>(Ll/۫ۤۡ;)V

    if-nez v10, :cond_0

    move-object v13, v0

    goto :goto_2

    :cond_0
    if-eqz v9, :cond_1

    .line 37
    invoke-virtual {v10}, Ll/ᩴܿܳ;->֫()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    invoke-virtual {v12, v10}, Ll/֨ܿܳ;->֫(Ll/ᩴܿܳ;)Ljava/lang/String;

    move-result-object v4

    :goto_1
    move-object v13, v4

    :goto_2
    new-array v14, v3, [Z

    aput-boolean v7, v14, v7

    if-nez v9, :cond_3

    if-nez v10, :cond_2

    goto :goto_3

    :cond_2
    const v0, 0x7f12045a

    .line 44
    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0xe

    invoke-static {v2, v0, v3, v7, v7}, Ll/ۛᩳܳ;->֫(Landroid/widget/LinearLayout;Ljava/lang/String;IZI)V

    .line 45
    new-instance v0, Ll/ܳܺ;

    invoke-direct {v0, v1}, Ll/ܳܺ;-><init>(Landroid/content/Context;)V

    const/high16 v4, 0x41600000    # 14.0f

    .line 46
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 47
    sget v4, Ll/᩹֡᩷;->ܳ֫:I

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 48
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "/"

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v13}, Ll/ᩴܿܳ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    new-instance v4, Ll/ۢܿܳ;

    new-instance v6, Ll/ۗᩳܳ;

    invoke-direct {v6, v14, v0, v10}, Ll/ۗᩳܳ;-><init>([ZLl/ܳܺ;Ll/ᩴܿܳ;)V

    invoke-direct {v4, v1, v10, v13, v6}, Ll/ۢܿܳ;-><init>(Landroid/content/Context;Ll/ᩴܿܳ;Ljava/lang/String;Ll/ۗᩳܳ;)V

    .line 53
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, -0x1

    const/4 v15, -0x2

    invoke-direct {v6, v7, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v7, 0xa

    .line 55
    invoke-static {v1, v7}, Ll/ۛᩳܳ;->֫(Landroid/content/Context;I)I

    move-result v7

    iput v7, v6, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 56
    invoke-virtual {v2, v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const v6, 0x7f120459

    .line 57
    invoke-virtual {v1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x1

    invoke-static {v2, v1, v5, v6, v3}, Ll/ۛᩳܳ;->֫(Landroid/widget/LinearLayout;Ljava/lang/String;IZI)V

    .line 58
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 59
    invoke-virtual {v11, v2}, Ll/᩵ۚۢ;->ۧ(Landroid/view/View;)V

    move-object v15, v4

    goto :goto_4

    :cond_3
    :goto_3
    move-object v15, v0

    :goto_4
    const v0, 0x7f120145

    .line 61
    invoke-virtual {v11, v0}, Ll/᩵ۚۢ;->ۧ(I)V

    new-instance v7, Ll/۬ᩳܳ;

    move-object v0, v7

    move-object/from16 v1, p0

    move-object v2, v8

    move-object v3, v15

    move-object v4, v12

    move-object v5, v10

    move-object v6, v14

    move-object/from16 v16, v14

    move-object v14, v7

    move-object/from16 v7, p1

    invoke-direct/range {v0 .. v7}, Ll/۬ᩳܳ;-><init>(Ll/ܽۢܳ;Ll/ܽ᩷ܳ;Ll/ۢܿܳ;Ll/֨ܿܳ;Ll/ᩴܿܳ;[ZLl/ᩳۜܳ;)V

    const v0, 0x7f1202dd

    .line 62
    invoke-virtual {v11, v0, v14}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v14, Ll/۫ᩳܳ;

    move-object v0, v14

    move-object v3, v10

    move-object v4, v15

    move-object v5, v13

    move-object/from16 v6, p1

    move v7, v9

    move-object v8, v12

    move-object/from16 v9, v16

    invoke-direct/range {v0 .. v9}, Ll/۫ᩳܳ;-><init>(Ll/ܽۢܳ;Ll/ܽ᩷ܳ;Ll/ᩴܿܳ;Ll/ۢܿܳ;Ljava/lang/String;Ll/ᩳۜܳ;ZLl/֨ܿܳ;[Z)V

    const v0, 0x7f12079c

    .line 68
    invoke-virtual {v11, v0, v14}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 78
    invoke-virtual {v11}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
