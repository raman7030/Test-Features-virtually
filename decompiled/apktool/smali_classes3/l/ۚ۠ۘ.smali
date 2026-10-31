.class public final Ll/ۚ۠ۘ;
.super Ll/ۖ᩹ۘ;
.source "51RR"


# instance fields
.field public ֫:Ljava/lang/ref/WeakReference;

.field public final synthetic ۧ:Ll/۠۠ۘ;


# direct methods
.method public constructor <init>(Ll/۠۠ۘ;Ll/ۘ᩹ۘ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 602
    iput-object p1, p0, Ll/ۚ۠ۘ;->ۧ:Ll/۠۠ۘ;

    .line 603
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ll/ۚ۠ۘ;->֫:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static ֫(Landroid/app/Activity;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 4

    const-string v0, "openSDK_LOG.AuthAgent"

    .line 738
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 739
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p0

    const/4 v1, 0x0

    .line 743
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    const-string v2, ".9.png"

    .line 747
    invoke-virtual {p1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v2, :cond_2

    .line 750
    :try_start_1
    invoke-static {p0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    :try_start_2
    const-string p0, "getDrawable oom"

    .line 752
    invoke-static {v0, p0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    .line 755
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B

    move-result-object p1

    .line 756
    invoke-static {p1}, Landroid/graphics/NinePatch;->isNinePatchChunk([B)Z

    .line 757
    new-instance v2, Landroid/graphics/drawable/NinePatchDrawable;

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    invoke-direct {v2, p0, p1, v3, v1}, Landroid/graphics/drawable/NinePatchDrawable;-><init>(Landroid/graphics/Bitmap;[BLandroid/graphics/Rect;Ljava/lang/String;)V

    goto :goto_3

    :cond_1
    :goto_1
    return-object v1

    .line 763
    :cond_2
    invoke-static {p0, p1}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 764
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    move-exception p0

    const-string p1, "getDrawable exception"

    .line 767
    invoke-static {v0, p1, p0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    move-object v2, v1

    :goto_3
    return-object v2
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 939
    iget-object v0, p0, Ll/ۚ۠ۘ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 940
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘ᩹ۘ;

    invoke-interface {v0}, Ll/ۘ᩹ۘ;->֫()V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/᩵᩹ۘ;)V
    .locals 2

    .line 932
    iget-object v0, p0, Ll/ۚ۠ۘ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 933
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘ᩹ۘ;

    invoke-interface {v0, p1}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    :cond_0
    return-void
.end method

.method public final ֫(Lorg/json/JSONObject;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v3, "openSDK_LOG.AuthAgent"

    const/4 v4, 0x1

    const/4 v5, 0x0

    :try_start_0
    const-string v0, "sendinstall"

    .line 614
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v0, v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    :try_start_1
    const-string v6, "installwording"

    .line 615
    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_0
    const/4 v0, 0x0

    :catch_1
    const-string v6, "FeedConfirmListener onComplete There is no value for sendinstall."

    .line 617
    invoke-static {v3, v6}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, ""

    .line 620
    :goto_1
    invoke-static {v6}, Ll/ۗ֨ᩴ;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 621
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, " WORDING = "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "xx,showConfirmDialog="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v7, 0x0

    .line 622
    iget-object v8, v1, Ll/ۚ۠ۘ;->֫:Ljava/lang/ref/WeakReference;

    iget-object v9, v1, Ll/ۚ۠ۘ;->ۧ:Ll/۠۠ۘ;

    if-eqz v0, :cond_5

    .line 623
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 624
    invoke-virtual {v8}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ll/ۘ᩹ۘ;

    .line 657
    invoke-static {v9}, Ll/۠۠ۘ;->ܿ(Ll/۠۠ۘ;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "showFeedConfirmDialog mActivity null and return"

    .line 658
    invoke-static {v3, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 661
    :cond_1
    invoke-static {v9}, Ll/۠۠ۘ;->ܿ(Ll/۠۠ۘ;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/app/Activity;

    if-nez v9, :cond_2

    const-string v0, "showFeedConfirmDialog mActivity.get() null and return"

    .line 663
    invoke-static {v3, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    move-object/from16 v16, v3

    goto/16 :goto_4

    .line 666
    :cond_2
    new-instance v10, Landroid/app/Dialog;

    invoke-direct {v10, v9}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 667
    invoke-virtual {v10, v4}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 669
    invoke-virtual {v9}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v11

    .line 673
    :try_start_2
    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    :catch_2
    move-exception v0

    const-string v12, "showFeedConfirmDialog exception:"

    .line 675
    invoke-static {v3, v12, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v7

    :goto_3
    if-eqz v0, :cond_3

    .line 679
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0, v11}, Landroid/content/pm/PackageItemInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    .line 682
    :cond_3
    new-instance v0, Ll/ۘ۠ۘ;

    invoke-direct {v0, v1, v10, v8, v2}, Ll/ۘ۠ۘ;-><init>(Ll/ۚ۠ۘ;Landroid/app/Dialog;Ll/ۘ᩹ۘ;Lorg/json/JSONObject;)V

    .line 697
    new-instance v11, Ll/ᩴ۠ۘ;

    invoke-direct {v11, v10, v8, v2}, Ll/ᩴ۠ۘ;-><init>(Landroid/app/Dialog;Ll/ۘ᩹ۘ;Lorg/json/JSONObject;)V

    .line 713
    new-instance v12, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v12}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    .line 714
    invoke-virtual {v12, v5}, Landroid/graphics/drawable/ColorDrawable;->setAlpha(I)V

    .line 715
    invoke-virtual {v10}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v5

    invoke-virtual {v5, v12}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 773
    new-instance v5, Landroid/util/DisplayMetrics;

    invoke-direct {v5}, Landroid/util/DisplayMetrics;-><init>()V

    const-string v12, "window"

    .line 774
    invoke-virtual {v9, v12}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/WindowManager;

    .line 775
    invoke-interface {v12}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v12

    invoke-virtual {v12, v5}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 776
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 778
    new-instance v12, Landroid/widget/RelativeLayout;

    invoke-direct {v12, v9}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 781
    new-instance v13, Landroid/widget/ImageView;

    invoke-direct {v13, v9}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 782
    invoke-virtual {v13, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 783
    sget-object v7, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v13, v7}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 784
    invoke-virtual {v13, v4}, Landroid/view/View;->setId(I)V

    const/high16 v4, 0x42700000    # 60.0f

    mul-float v4, v4, v5

    float-to-int v4, v4

    const/high16 v7, 0x41600000    # 14.0f

    mul-float v7, v7, v5

    float-to-int v7, v7

    const/high16 v14, 0x41900000    # 18.0f

    mul-float v14, v14, v5

    float-to-int v14, v14

    const/high16 v15, 0x40c00000    # 6.0f

    mul-float v15, v15, v5

    float-to-int v15, v15

    .line 792
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v4, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v4, 0x9

    .line 793
    invoke-virtual {v1, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/4 v4, 0x0

    .line 794
    invoke-virtual {v1, v4, v14, v15, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 796
    invoke-virtual {v12, v13, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 799
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, v9}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 800
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v6, 0x41600000    # 14.0f

    .line 801
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v6, 0x3

    .line 802
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 805
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 806
    invoke-virtual {v1, v4, v4, v4, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    const/4 v4, 0x2

    .line 807
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setLines(I)V

    const/4 v4, 0x5

    .line 808
    invoke-virtual {v1, v4}, Landroid/view/View;->setId(I)V

    const/high16 v4, 0x43390000    # 185.0f

    mul-float v4, v4, v5

    float-to-int v4, v4

    .line 809
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 810
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v13, -0x2

    invoke-direct {v4, v13, v13}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/4 v13, 0x1

    .line 811
    invoke-virtual {v4, v13, v13}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/4 v14, 0x6

    .line 812
    invoke-virtual {v4, v14, v13}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/high16 v13, 0x40a00000    # 5.0f

    mul-float v13, v13, v5

    float-to-int v14, v13

    const/4 v15, 0x0

    .line 814
    invoke-virtual {v4, v15, v15, v14, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 815
    invoke-virtual {v12, v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 818
    new-instance v1, Landroid/view/View;

    invoke-direct {v1, v9}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/16 v4, 0xd6

    .line 819
    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    move-result v4

    invoke-virtual {v1, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 820
    invoke-virtual {v1, v6}, Landroid/view/View;->setId(I)V

    .line 821
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v14, 0x2

    const/4 v15, -0x2

    invoke-direct {v4, v15, v14}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/4 v14, 0x1

    .line 822
    invoke-virtual {v4, v6, v14}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/4 v6, 0x5

    .line 824
    invoke-virtual {v4, v6, v14}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/4 v14, 0x7

    .line 825
    invoke-virtual {v4, v14, v6}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/high16 v14, 0x41400000    # 12.0f

    mul-float v14, v14, v5

    float-to-int v14, v14

    const/4 v15, 0x0

    .line 826
    invoke-virtual {v4, v15, v15, v15, v14}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 827
    invoke-virtual {v12, v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 830
    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, v9}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 831
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v15, -0x2

    invoke-direct {v4, v15, v15}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/4 v15, 0x1

    .line 832
    invoke-virtual {v4, v6, v15}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/4 v15, 0x7

    .line 833
    invoke-virtual {v4, v15, v6}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/4 v6, 0x3

    .line 834
    invoke-virtual {v4, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 836
    new-instance v6, Landroid/widget/Button;

    invoke-direct {v6, v9}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    const-string v15, "\u8df3\u8fc7"

    .line 837
    invoke-virtual {v6, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v15, "buttonNegt.png"

    .line 838
    invoke-static {v9, v15}, Ll/ۚ۠ۘ;->֫(Landroid/app/Activity;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v15

    .line 839
    invoke-virtual {v6, v15}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    const/16 v15, 0x61

    move-object/from16 v16, v3

    const/16 v3, 0x83

    const/16 v2, 0x24

    .line 840
    invoke-static {v2, v15, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v2, 0x41a00000    # 20.0f

    .line 841
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 842
    invoke-virtual {v6, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v2, 0x4

    .line 843
    invoke-virtual {v6, v2}, Landroid/view/View;->setId(I)V

    .line 844
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v3, 0x42340000    # 45.0f

    mul-float v3, v3, v5

    float-to-int v3, v3

    const/4 v11, 0x0

    invoke-direct {v2, v11, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 845
    iput v7, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    const/high16 v11, 0x40800000    # 4.0f

    mul-float v11, v11, v5

    float-to-int v11, v11

    .line 846
    iput v11, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    const/high16 v15, 0x3f800000    # 1.0f

    .line 847
    iput v15, v2, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 848
    invoke-virtual {v1, v6, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 850
    new-instance v2, Landroid/widget/Button;

    invoke-direct {v2, v9}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    const-string v6, "\u786e\u5b9a"

    .line 851
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v6, 0x41a00000    # 20.0f

    .line 852
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextSize(F)V

    const/16 v6, 0xff

    .line 853
    invoke-static {v6, v6, v6}, Landroid/graphics/Color;->rgb(III)I

    move-result v6

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v6, "buttonPost.png"

    .line 854
    invoke-static {v9, v6}, Ll/ۚ۠ۘ;->֫(Landroid/app/Activity;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 855
    invoke-virtual {v2, v6}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 856
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 857
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, 0x0

    invoke-direct {v0, v6, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 858
    iput v15, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 859
    iput v11, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 860
    invoke-virtual {v1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 866
    invoke-virtual {v12, v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const v0, 0x438b8000    # 279.0f

    mul-float v0, v0, v5

    float-to-int v0, v0

    const/high16 v1, 0x43230000    # 163.0f

    mul-float v5, v5, v1

    float-to-int v1, v5

    .line 903
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/4 v0, 0x0

    .line 905
    invoke-virtual {v12, v7, v0, v14, v14}, Landroid/view/View;->setPadding(IIII)V

    .line 906
    invoke-virtual {v12, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v0, 0xf7

    const/16 v1, 0xfb

    .line 907
    invoke-static {v0, v1, v0}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    invoke-virtual {v12, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 910
    new-instance v2, Landroid/graphics/drawable/PaintDrawable;

    invoke-static {v0, v1, v0}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    invoke-direct {v2, v0}, Landroid/graphics/drawable/PaintDrawable;-><init>(I)V

    .line 911
    invoke-virtual {v2, v13}, Landroid/graphics/drawable/PaintDrawable;->setCornerRadius(F)V

    .line 912
    invoke-virtual {v12, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 717
    invoke-virtual {v10, v12}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 718
    new-instance v0, Ll/᩵۠ۘ;

    move-object/from16 v1, p1

    invoke-direct {v0, v8, v1}, Ll/᩵۠ۘ;-><init>(Ll/ۘ᩹ۘ;Lorg/json/JSONObject;)V

    .line 729
    invoke-virtual {v10, v0}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 730
    invoke-virtual {v9}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_4

    .line 731
    invoke-virtual {v10}, Landroid/app/Dialog;->show()V

    :cond_4
    :goto_4
    const-string v0, " WORDING is not empty and return"

    move-object/from16 v2, v16

    .line 625
    invoke-static {v2, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_5
    move-object v1, v2

    move-object v2, v3

    .line 630
    invoke-virtual {v8}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘ᩹ۘ;

    if-eqz v0, :cond_7

    .line 633
    invoke-static {v9}, Ll/۠۠ۘ;->ۜ(Ll/۠۠ۘ;)Ll/᩸۠ۘ;

    .line 634
    invoke-static {v9}, Ll/۠۠ۘ;->᩷(Ll/۠۠ۘ;)Ll/᩸۠ۘ;

    move-result-object v3

    invoke-virtual {v3, v1}, Ll/᩸۠ۘ;->֫(Lorg/json/JSONObject;)Z

    move-result v3

    .line 635
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, " saveSession saveSuccess="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v3, :cond_6

    .line 639
    invoke-interface {v0, v1}, Ll/ۘ᩹ۘ;->֫(Lorg/json/JSONObject;)V

    goto :goto_5

    .line 641
    :cond_6
    new-instance v1, Ll/᩵᩹ۘ;

    const/4 v2, -0x6

    const-string v3, "\u6301\u4e45\u5316\u5931\u8d25!"

    invoke-direct {v1, v2, v3, v7}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    goto :goto_5

    :cond_7
    const-string v0, " userListener is null"

    .line 644
    invoke-static {v2, v0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    :goto_5
    return-void
.end method
