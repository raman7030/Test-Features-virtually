.class public Lcom/tencent/connect/auth/a;
.super Landroid/app/Dialog;
.source "51RR"


# instance fields
.field public ֫֫:I

.field public ۗ:Landroid/widget/FrameLayout;

.field public ۙ:Landroid/os/Handler;

.field public ۛ:Ljava/lang/String;

.field public ۟:Z

.field public ۤ:Landroid/widget/ProgressBar;

.field public ۧ֫:Ljava/lang/String;

.field public ۨ:Ll/ۢ᩸ۘ;

.field public ۫:Landroid/widget/FrameLayout;

.field public ۬:Landroid/widget/LinearLayout;

.field public ܰ:Ll/ۢ᩹ۘ;

.field public ܳ֫:Ljava/util/HashMap;

.field public ܽ֫:Ljava/lang/String;

.field public ܿ֫:J

.field public ᩳ֫:J

.field public ᩶:Ll/ۘ᩹ۘ;

.field public ᩸:Ljava/lang/String;

.field public ᩹:Ll/ۤ۠ۘ;

.field public ᩺:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ll/ۘ᩹ۘ;Ll/᩸۠ۘ;)V
    .locals 2

    const v0, 0x1030010

    .line 120
    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 v0, 0x0

    .line 107
    iput-boolean v0, p0, Lcom/tencent/connect/auth/a;->۟:Z

    const-wide/16 v0, 0x0

    .line 114
    iput-wide v0, p0, Lcom/tencent/connect/auth/a;->ᩳ֫:J

    const-wide/16 v0, 0x7530

    .line 116
    iput-wide v0, p0, Lcom/tencent/connect/auth/a;->ܿ֫:J

    .line 121
    iput-object p1, p0, Lcom/tencent/connect/auth/a;->᩺:Landroid/content/Context;

    .line 122
    iput-object p2, p0, Lcom/tencent/connect/auth/a;->᩸:Ljava/lang/String;

    .line 123
    new-instance v0, Ll/ۤ۠ۘ;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, p0, p2, p3}, Ll/ۤ۠ۘ;-><init>(Lcom/tencent/connect/auth/a;Ljava/lang/String;Ll/ۘ᩹ۘ;)V

    iput-object v0, p0, Lcom/tencent/connect/auth/a;->᩹:Ll/ۤ۠ۘ;

    .line 124
    new-instance p2, Ll/ۛ۠ۘ;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {p2, p0, v0, p1}, Ll/ۛ۠ۘ;-><init>(Lcom/tencent/connect/auth/a;Ll/ۤ۠ۘ;Landroid/os/Looper;)V

    iput-object p2, p0, Lcom/tencent/connect/auth/a;->ۙ:Landroid/os/Handler;

    .line 125
    iput-object p3, p0, Lcom/tencent/connect/auth/a;->᩶:Ll/ۘ᩹ۘ;

    const-string p1, "action_login"

    .line 126
    iput-object p1, p0, Lcom/tencent/connect/auth/a;->ۛ:Ljava/lang/String;

    .line 127
    new-instance p1, Ll/ۢ᩹ۘ;

    .line 15
    invoke-direct {p1}, Ll/ܿ᩸ۘ;-><init>()V

    .line 127
    iput-object p1, p0, Lcom/tencent/connect/auth/a;->ܰ:Ll/ۢ᩹ۘ;

    .line 129
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 p2, 0x20

    invoke-virtual {p1, p2}, Landroid/view/Window;->setSoftInputMode(I)V

    return-void
.end method

.method public static synthetic ֫(Lcom/tencent/connect/auth/a;)Landroid/content/Context;
    .locals 0

    .line 68
    iget-object p0, p0, Lcom/tencent/connect/auth/a;->᩺:Landroid/content/Context;

    return-object p0
.end method

.method private ֫()V
    .locals 6

    .line 551
    new-instance v0, Landroid/widget/ProgressBar;

    iget-object v1, p0, Lcom/tencent/connect/auth/a;->᩺:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/tencent/connect/auth/a;->ۤ:Landroid/widget/ProgressBar;

    .line 552
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v0, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 555
    iget-object v3, p0, Lcom/tencent/connect/auth/a;->ۤ:Landroid/widget/ProgressBar;

    invoke-virtual {v3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 556
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/tencent/connect/auth/a;->۬:Landroid/widget/LinearLayout;

    .line 558
    iget-object v0, p0, Lcom/tencent/connect/auth/a;->ۛ:Ljava/lang/String;

    const-string v3, "action_login"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 559
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v3, 0x10

    .line 562
    iput v3, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    const/4 v3, 0x5

    .line 563
    iput v3, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 564
    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 565
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    const-string v5, "zh"

    .line 566
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "\u767b\u5f55\u4e2d..."

    .line 567
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const-string v4, "Logging in..."

    .line 569
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    const/16 v4, 0xff

    .line 571
    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v4, 0x41900000    # 18.0f

    .line 572
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 573
    invoke-virtual {v3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    .line 576
    :goto_1
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v2, 0x11

    .line 579
    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 580
    iget-object v4, p0, Lcom/tencent/connect/auth/a;->۬:Landroid/widget/LinearLayout;

    invoke-virtual {v4, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 581
    iget-object v0, p0, Lcom/tencent/connect/auth/a;->۬:Landroid/widget/LinearLayout;

    iget-object v4, p0, Lcom/tencent/connect/auth/a;->ۤ:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    if-eqz v3, :cond_2

    .line 583
    iget-object v0, p0, Lcom/tencent/connect/auth/a;->۬:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 585
    :cond_2
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/tencent/connect/auth/a;->۫:Landroid/widget/FrameLayout;

    .line 586
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 589
    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 590
    iget-object v1, p0, Lcom/tencent/connect/auth/a;->۫:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 591
    iget-object v0, p0, Lcom/tencent/connect/auth/a;->۫:Landroid/widget/FrameLayout;

    const-string v1, "#B3000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 592
    iget-object v0, p0, Lcom/tencent/connect/auth/a;->۫:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/tencent/connect/auth/a;->۬:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private ֫(Landroid/widget/FrameLayout;)V
    .locals 8

    .line 521
    new-instance v0, Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/tencent/connect/auth/a;->᩺:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 11
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    const v3, 0x4179999a    # 15.6f

    mul-float v2, v2, v3

    const/high16 v3, 0x3f000000    # 0.5f

    add-float/2addr v2, v3

    float-to-int v2, v2

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    const v5, 0x41c9999a    # 25.2f

    mul-float v4, v4, v5

    add-float/2addr v4, v3

    float-to-int v4, v4

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    const/high16 v6, 0x41200000    # 10.0f

    mul-float v5, v5, v6

    add-float/2addr v5, v3

    float-to-int v3, v5

    .line 528
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    mul-int/lit8 v6, v3, 0x2

    add-int/2addr v2, v6

    add-int/2addr v4, v6

    invoke-direct {v5, v2, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 529
    iput v3, v5, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 530
    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 531
    invoke-virtual {v0, v3, v3, v3, v3}, Landroid/view/View;->setPadding(IIII)V

    const-string v2, "h5_qr_back.png"

    const-string v3, "inputStream close exception: "

    const-string v4, "openSDK_LOG.Util"

    const-string v5, "getDrawable exception: "

    .line 1201
    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const/4 v6, 0x0

    .line 1205
    :try_start_0
    invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1206
    :try_start_1
    invoke-static {v1, v2}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v6
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1211
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    .line 1213
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    move-object v6, v1

    goto :goto_3

    :catch_1
    move-exception v2

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_3

    :catch_2
    move-exception v2

    move-object v1, v6

    .line 1208
    :goto_0
    :try_start_3
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1211
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_2

    :catch_3
    move-exception v1

    .line 1213
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 533
    :goto_2
    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 534
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 536
    new-instance v1, Ll/᩹۠ۘ;

    invoke-direct {v1, p0}, Ll/᩹۠ۘ;-><init>(Lcom/tencent/connect/auth/a;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 547
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    .line 1211
    :goto_3
    :try_start_5
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    goto :goto_4

    :catch_4
    move-exception v0

    .line 1213
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 1216
    :goto_4
    throw p1
.end method

.method public static synthetic ֫(Lcom/tencent/connect/auth/a;J)V
    .locals 0

    .line 68
    iput-wide p1, p0, Lcom/tencent/connect/auth/a;->ᩳ֫:J

    return-void
.end method

.method public static ֫(Lcom/tencent/connect/auth/a;Ljava/lang/String;)V
    .locals 1

    .line 249
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 250
    iget-object p1, p0, Lcom/tencent/connect/auth/a;->ܽ֫:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/tencent/connect/auth/a;->ܽ֫:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v0, 0x4

    if-lt p1, v0, :cond_0

    .line 251
    iget-object p0, p0, Lcom/tencent/connect/auth/a;->ܽ֫:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    sub-int/2addr p1, v0

    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Lcom/tencent/connect/auth/a;Z)V
    .locals 0

    .line 68
    iput-boolean p1, p0, Lcom/tencent/connect/auth/a;->۟:Z

    return-void
.end method

.method public static synthetic ۖ(Lcom/tencent/connect/auth/a;)V
    .locals 1

    .line 68
    iget v0, p0, Lcom/tencent/connect/auth/a;->֫֫:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/tencent/connect/auth/a;->֫֫:I

    return-void
.end method

.method public static synthetic ۘ(Lcom/tencent/connect/auth/a;)Landroid/os/Handler;
    .locals 0

    .line 68
    iget-object p0, p0, Lcom/tencent/connect/auth/a;->ۙ:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic ۜ(Lcom/tencent/connect/auth/a;)Ll/ۢ᩹ۘ;
    .locals 0

    .line 68
    iget-object p0, p0, Lcom/tencent/connect/auth/a;->ܰ:Ll/ۢ᩹ۘ;

    return-object p0
.end method

.method public static synthetic ۡ(Lcom/tencent/connect/auth/a;)I
    .locals 0

    .line 68
    iget p0, p0, Lcom/tencent/connect/auth/a;->֫֫:I

    return p0
.end method

.method public static synthetic ۢ(Lcom/tencent/connect/auth/a;)J
    .locals 2

    .line 68
    iget-wide v0, p0, Lcom/tencent/connect/auth/a;->ᩳ֫:J

    return-wide v0
.end method

.method public static synthetic ۧ(Lcom/tencent/connect/auth/a;Ljava/lang/String;)V
    .locals 2

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/tencent/connect/auth/a;->᩸:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/connect/auth/a;->᩸:Ljava/lang/String;

    return-void
.end method

.method public static ۧ(Lcom/tencent/connect/auth/a;)Z
    .locals 11

    .line 22
    sget-object v0, Ll/ܰ۠ۘ;->ۧ:Ll/ܰ۠ۘ;

    if-nez v0, :cond_0

    .line 23
    new-instance v0, Ll/ܰ۠ۘ;

    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, v0, Ll/ܰ۠ۘ;->֫:Ljava/util/HashMap;

    .line 23
    sput-object v0, Ll/ܰ۠ۘ;->ۧ:Ll/ܰ۠ۘ;

    .line 25
    :cond_0
    sget-object v0, Ll/ܰ۠ۘ;->ۧ:Ll/ܰ۠ۘ;

    .line 679
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v1

    const-wide/high16 v3, 0x4034000000000000L    # 20.0

    mul-double v1, v1, v3

    const-wide/high16 v3, 0x4008000000000000L    # 3.0

    add-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    const-string v2, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"

    .line 57
    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    .line 58
    array-length v3, v2

    .line 59
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v1, :cond_1

    .line 61
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v7

    int-to-double v9, v3

    mul-double v7, v7, v9

    double-to-int v7, v7

    .line 62
    aget-char v7, v2, v7

    invoke-virtual {v4, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    .line 680
    new-instance v2, Ll/᩺۠ۘ;

    .line 0
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 681
    iget-object v3, p0, Lcom/tencent/connect/auth/a;->᩶:Ll/ۘ᩹ۘ;

    iput-object v3, v2, Ll/᩺۠ۘ;->֫:Ll/ۘ᩹ۘ;

    .line 684
    invoke-virtual {v0, v2}, Ll/ܰ۠ۘ;->֫(Ll/᩺۠ۘ;)Ljava/lang/String;

    move-result-object v0

    .line 685
    iget-object v2, p0, Lcom/tencent/connect/auth/a;->᩸:Ljava/lang/String;

    const-string v3, "?"

    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v2, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 686
    iget-object v4, p0, Lcom/tencent/connect/auth/a;->᩸:Ljava/lang/String;

    invoke-static {v4}, Ll/ᩳ᩹ۘ;->ۧ(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    const-string v5, "token_key"

    .line 687
    invoke-virtual {v4, v5, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "serial"

    .line 688
    invoke-virtual {v4, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "browser"

    const-string v1, "1"

    .line 689
    invoke-virtual {v4, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 690
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Ll/᩸᩸ۘ;->ۧ(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/connect/auth/a;->᩸:Ljava/lang/String;

    .line 691
    iget-object p0, p0, Lcom/tencent/connect/auth/a;->᩺:Landroid/content/Context;

    invoke-static {p0, v0}, Ll/ᩳ᩹ۘ;->֫(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ܳ(Lcom/tencent/connect/auth/a;)Ll/ۤ۠ۘ;
    .locals 0

    .line 68
    iget-object p0, p0, Lcom/tencent/connect/auth/a;->᩹:Ll/ۤ۠ۘ;

    return-object p0
.end method

.method public static synthetic ܺ(Lcom/tencent/connect/auth/a;)J
    .locals 2

    .line 68
    iget-wide v0, p0, Lcom/tencent/connect/auth/a;->ܿ֫:J

    return-wide v0
.end method

.method public static synthetic ܽ(Lcom/tencent/connect/auth/a;Ljava/lang/String;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/tencent/connect/auth/a;->ܽ֫:Ljava/lang/String;

    return-void
.end method

.method public static synthetic ܽ(Lcom/tencent/connect/auth/a;)Z
    .locals 0

    .line 68
    iget-boolean p0, p0, Lcom/tencent/connect/auth/a;->۟:Z

    return p0
.end method

.method public static synthetic ܿ(Lcom/tencent/connect/auth/a;)Ll/ۢ᩸ۘ;
    .locals 0

    .line 68
    iget-object p0, p0, Lcom/tencent/connect/auth/a;->ۨ:Ll/ۢ᩸ۘ;

    return-object p0
.end method

.method public static synthetic ᩳ(Lcom/tencent/connect/auth/a;)Ljava/lang/String;
    .locals 0

    .line 68
    iget-object p0, p0, Lcom/tencent/connect/auth/a;->᩸:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic ᩳ(Lcom/tencent/connect/auth/a;Ljava/lang/String;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/tencent/connect/auth/a;->ۧ֫:Ljava/lang/String;

    return-void
.end method

.method public static ᩴ(Lcom/tencent/connect/auth/a;)Ljava/lang/String;
    .locals 2

    .line 478
    iget-object p0, p0, Lcom/tencent/connect/auth/a;->᩸:Ljava/lang/String;

    const-string v0, "?"

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 479
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "https://imgcache.qq.com/ptlogin/static/qzsjump.html?"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "openSDK_LOG.AuthDialog"

    const-string v1, "-->generateDownloadUrl, url: https://imgcache.qq.com/ptlogin/static/qzsjump.html?"

    .line 480
    invoke-static {v0, v1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic ᩵(Lcom/tencent/connect/auth/a;)Ljava/util/HashMap;
    .locals 0

    .line 68
    iget-object p0, p0, Lcom/tencent/connect/auth/a;->ܳ֫:Ljava/util/HashMap;

    return-object p0
.end method

.method public static synthetic ᩷(Lcom/tencent/connect/auth/a;)Ljava/lang/String;
    .locals 0

    .line 68
    iget-object p0, p0, Lcom/tencent/connect/auth/a;->ۧ֫:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic ᩻(Lcom/tencent/connect/auth/a;)Landroid/widget/FrameLayout;
    .locals 0

    .line 68
    iget-object p0, p0, Lcom/tencent/connect/auth/a;->۫:Landroid/widget/FrameLayout;

    return-object p0
.end method


# virtual methods
.method public final dismiss()V
    .locals 4

    const-string v0, "openSDK_LOG.AuthDialog"

    .line 718
    iget-object v1, p0, Lcom/tencent/connect/auth/a;->ܳ֫:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 719
    iget-object v1, p0, Lcom/tencent/connect/auth/a;->ۙ:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 723
    :try_start_0
    iget-object v1, p0, Lcom/tencent/connect/auth/a;->᩺:Landroid/content/Context;

    instance-of v3, v1, Landroid/app/Activity;

    if-eqz v3, :cond_0

    .line 724
    check-cast v1, Landroid/app/Activity;

    .line 725
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 726
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    const-string v1, "-->dismiss dialog"

    .line 727
    invoke-static {v0, v1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v3, "-->dismiss dialog exception:"

    .line 731
    invoke-static {v0, v3, v1}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 733
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/tencent/connect/auth/a;->ۨ:Ll/ۢ᩸ۘ;

    if-eqz v0, :cond_1

    .line 734
    invoke-virtual {v0}, Ll/ۜ᩸ۘ;->destroy()V

    .line 735
    iput-object v2, p0, Lcom/tencent/connect/auth/a;->ۨ:Ll/ۢ᩸ۘ;

    :cond_1
    return-void
.end method

.method public final onBackPressed()V
    .locals 1

    .line 147
    iget-boolean v0, p0, Lcom/tencent/connect/auth/a;->۟:Z

    if-nez v0, :cond_0

    .line 148
    iget-object v0, p0, Lcom/tencent/connect/auth/a;->᩹:Ll/ۤ۠ۘ;

    invoke-virtual {v0}, Ll/ۤ۠ۘ;->֫()V

    .line 150
    :cond_0
    invoke-super {p0}, Landroid/app/Dialog;->onBackPressed()V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 6

    const-string v0, "openSDK_LOG.AuthDialog"

    const/4 v1, 0x1

    .line 134
    invoke-virtual {p0, v1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 136
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 137
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-static {p1}, Ll/ۗܶۘ;->֫(Landroid/view/Window;)V

    .line 486
    iget-object p1, p0, Lcom/tencent/connect/auth/a;->᩺:Landroid/content/Context;

    const/4 v2, -0x1

    :try_start_0
    invoke-direct {p0}, Lcom/tencent/connect/auth/a;->֫()V

    .line 487
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v3, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 490
    new-instance v4, Ll/ۢ᩸ۘ;

    .line 24
    invoke-direct {v4, p1}, Ll/ۜ᩸ۘ;-><init>(Landroid/content/Context;)V

    .line 490
    iput-object v4, p0, Lcom/tencent/connect/auth/a;->ۨ:Ll/ۢ᩸ۘ;

    const/4 v5, 0x0

    .line 493
    invoke-virtual {v4, v1, v5}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 496
    iget-object v4, p0, Lcom/tencent/connect/auth/a;->ۨ:Ll/ۢ᩸ۘ;

    invoke-virtual {v4, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v4, 0x11

    .line 498
    iput v4, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 500
    new-instance v4, Ll/᩷᩸ۘ;

    .line 22
    invoke-direct {v4, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 501
    invoke-virtual {v4, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 502
    iget-object v3, p0, Lcom/tencent/connect/auth/a;->ۨ:Ll/ۢ᩸ۘ;

    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 504
    new-instance v3, Landroid/widget/FrameLayout;

    invoke-direct {v3, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Lcom/tencent/connect/auth/a;->ۗ:Landroid/widget/FrameLayout;

    .line 505
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 506
    iget-object v3, p0, Lcom/tencent/connect/auth/a;->ۗ:Landroid/widget/FrameLayout;

    invoke-virtual {v3, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 507
    iget-object v3, p0, Lcom/tencent/connect/auth/a;->ۗ:Landroid/widget/FrameLayout;

    iget-object v4, p0, Lcom/tencent/connect/auth/a;->۫:Landroid/widget/FrameLayout;

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 508
    iget-object v3, p0, Lcom/tencent/connect/auth/a;->᩸:Ljava/lang/String;

    invoke-static {v3}, Ll/ᩳ᩹ۘ;->ۧ(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "style"

    .line 509
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    const-string v4, "qr"

    .line 510
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 511
    iget-object v3, p0, Lcom/tencent/connect/auth/a;->ۗ:Landroid/widget/FrameLayout;

    invoke-direct {p0, v3}, Lcom/tencent/connect/auth/a;->֫(Landroid/widget/FrameLayout;)V

    .line 513
    :cond_0
    iget-object v3, p0, Lcom/tencent/connect/auth/a;->ۗ:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v3}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v3

    const-string v4, "onCreateView exception"

    .line 515
    invoke-static {v0, v4, v3}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 516
    iget-object v3, p0, Lcom/tencent/connect/auth/a;->ۙ:Landroid/os/Handler;

    invoke-static {p0, v3}, Ll/ۗܶۘ;->֫(Landroid/app/Dialog;Landroid/os/Handler;)V

    .line 600
    :goto_0
    iget-object v3, p0, Lcom/tencent/connect/auth/a;->ۨ:Ll/ۢ᩸ۘ;

    if-eqz v3, :cond_1

    const/4 v4, 0x0

    .line 601
    invoke-virtual {v3, v4}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 602
    iget-object v3, p0, Lcom/tencent/connect/auth/a;->ۨ:Ll/ۢ᩸ۘ;

    invoke-virtual {v3, v4}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 603
    iget-object v3, p0, Lcom/tencent/connect/auth/a;->ۨ:Ll/ۢ᩸ۘ;

    new-instance v5, Ll/۫۠ۘ;

    invoke-direct {v5, p0}, Ll/۫۠ۘ;-><init>(Lcom/tencent/connect/auth/a;)V

    invoke-virtual {v3, v5}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 604
    iget-object v3, p0, Lcom/tencent/connect/auth/a;->ۨ:Ll/ۢ᩸ۘ;

    new-instance v5, Landroid/webkit/WebChromeClient;

    invoke-direct {v5}, Landroid/webkit/WebChromeClient;-><init>()V

    invoke-virtual {v3, v5}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 605
    iget-object v3, p0, Lcom/tencent/connect/auth/a;->ۨ:Ll/ۢ᩸ۘ;

    invoke-virtual {v3}, Landroid/webkit/WebView;->clearFormData()V

    .line 608
    iget-object v3, p0, Lcom/tencent/connect/auth/a;->ۨ:Ll/ۢ᩸ۘ;

    invoke-virtual {v3}, Landroid/webkit/WebView;->clearSslPreferences()V

    .line 609
    iget-object v3, p0, Lcom/tencent/connect/auth/a;->ۨ:Ll/ۢ᩸ۘ;

    new-instance v5, Ll/᩶۠ۘ;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v3, v5}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 617
    iget-object v3, p0, Lcom/tencent/connect/auth/a;->ۨ:Ll/ۢ᩸ۘ;

    new-instance v5, Ll/ۙ۠ۘ;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v3, v5}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 634
    iget-object v3, p0, Lcom/tencent/connect/auth/a;->ۨ:Ll/ۢ᩸ۘ;

    invoke-virtual {v3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v3

    .line 635
    iget-object v5, p0, Lcom/tencent/connect/auth/a;->ۨ:Ll/ۢ᩸ۘ;

    invoke-static {v5}, Ll/᩻᩹ۘ;->֫(Landroid/webkit/WebView;)V

    .line 636
    invoke-virtual {v3, v4}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V

    .line 638
    invoke-virtual {v3, v2}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 641
    invoke-virtual {v3, v4}, Landroid/webkit/WebSettings;->setNeedInitialFocus(Z)V

    .line 642
    invoke-virtual {v3, v1}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 643
    invoke-virtual {v3, v1}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 645
    sget-object v2, Landroid/webkit/WebSettings$RenderPriority;->HIGH:Landroid/webkit/WebSettings$RenderPriority;

    invoke-virtual {v3, v2}, Landroid/webkit/WebSettings;->setRenderPriority(Landroid/webkit/WebSettings$RenderPriority;)V

    .line 647
    invoke-virtual {v3, v1}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V

    const-string v2, "databases"

    .line 649
    invoke-virtual {p1, v2, v4}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    .line 648
    invoke-virtual {v3, p1}, Landroid/webkit/WebSettings;->setDatabasePath(Ljava/lang/String;)V

    .line 650
    invoke-virtual {v3, v1}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 652
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "-->mUrl : "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/tencent/connect/auth/a;->᩸:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 653
    iget-object p1, p0, Lcom/tencent/connect/auth/a;->᩸:Ljava/lang/String;

    iput-object p1, p0, Lcom/tencent/connect/auth/a;->ۧ֫:Ljava/lang/String;

    .line 654
    iget-object v0, p0, Lcom/tencent/connect/auth/a;->ۨ:Ll/ۢ᩸ۘ;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 655
    iget-object p1, p0, Lcom/tencent/connect/auth/a;->ۨ:Ll/ۢ᩸ۘ;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 657
    new-instance p1, Ll/ۜ᩹ۘ;

    .line 6
    invoke-direct {p1}, Ll/۫ܶۘ;-><init>()V

    const-string v0, "SecureJsInterface"

    .line 657
    iget-object v1, p0, Lcom/tencent/connect/auth/a;->ܰ:Ll/ۢ᩹ۘ;

    invoke-virtual {v1, p1, v0}, Ll/ܿ᩸ۘ;->֫(Ll/۫ܶۘ;Ljava/lang/String;)V

    .line 661
    new-instance p1, Ll/ۗ۠ۘ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-super {p0, p1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 142
    :cond_1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/tencent/connect/auth/a;->ܳ֫:Ljava/util/HashMap;

    return-void
.end method

.method public final onStop()V
    .locals 0

    .line 155
    invoke-super {p0}, Landroid/app/Dialog;->onStop()V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 709
    iget-object v0, p0, Lcom/tencent/connect/auth/a;->ۨ:Ll/ۢ᩸ۘ;

    if-eqz v0, :cond_0

    const-string v0, "javascript:"

    const-string v1, "();void("

    .line 0
    invoke-static {v0, p1, v1}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 710
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ");"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 711
    iget-object v0, p0, Lcom/tencent/connect/auth/a;->ۨ:Ll/ۢ᩸ۘ;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
