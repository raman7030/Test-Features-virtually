.class public final Ll/᩵ۤܿ;
.super Ljava/lang/Object;
.source "964K"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final ֡ܰ᩹:[S

.field public static ۟:Z

.field public static ܰ:Ljava/lang/ref/WeakReference;

.field public static final ᩺:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public final ۗ:Ll/ܶ᩵ܿ;

.field public ۙ:Ll/֡ۚۢ;

.field public ۛ:Landroid/view/View;

.field public ۤ:Z

.field public final ۨ:Ll/ܽۢܳ;

.field public ۫:Z

.field public ۬:Z

.field public ᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public ᩸:Ll/ۘܶۡ;

.field public ᩹:Ll/ۙۧᩳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x61

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩵ۤܿ;->֡ܰ᩹:[S

    .line 101
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Ll/᩵ۤܿ;->᩺:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x1

    .line 102
    sput-boolean v0, Ll/᩵ۤܿ;->۟:Z

    return-void

    :array_0
    .array-data 2
        0x325s
        0x19f2s
        0x19eas
        0x19c6s
        0x19fbs
        0x19f8s
        0x19f7s
        0x19c6s
        0x19e9s
        0x19f2s
        0x19eas
        0x19b5s
        0x19cas
        0x19f6s
        0x19ebs
        0x19ebs
        0x19e0s
        0x19b5s
        0x19b9s
        0x19eds
        0x19f1s
        0x19f0s
        0x19eas
        0x19b9s
        0x19ffs
        0x19ecs
        0x19f7s
        0x19fas
        0x19eds
        0x19f0s
        0x19f6s
        0x19f7s
        0x19b9s
        0x19f0s
        0x19eas
        0x19b9s
        0x19f7s
        0x19f6s
        0x19eds
        0x19b9s
        0x19eas
        0x19ecs
        0x19e9s
        0x19e9s
        0x19f6s
        0x19ebs
        0x19eds
        0x19fcs
        0x19fds
        0x19b9s
        0x19ffs
        0x19f6s
        0x19ebs
        0x19b9s
        0x19eds
        0x19f1s
        0x19f0s
        0x19eas
        0x19b9s
        0x19f8s
        0x19e9s
        0x19e9s
        0x19b9s
        0x19f8s
        0x19eds
        0x19b9s
        0x19eds
        0x19f1s
        0x19fcs
        0x19b9s
        0x19f4s
        0x19f6s
        0x19f4s
        0x19fcs
        0x19f7s
        0x19eds
        0x19b8s
        0x4611s
        0x7b28s
        0x72d0s
        -0x196bs
        0x7f1bs
        0x7c6fs
        0x5794s
        0x7cb6s
        0x7a98s
        0x4260s
        -0x6d84s
        0x470ds
        0x6cb1s
        0x56e6s
        0x6cb1s
        0x4a22s
        0x62e7s
        0x4b06s
        -0x669cs
        -0x1968s
    .end array-data
.end method

.method public constructor <init>(Ll/ܽۢܳ;Ljava/lang/String;)V
    .locals 3

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/᩵ۤܿ;->᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    .line 111
    iput-boolean v0, p0, Ll/᩵ۤܿ;->ۤ:Z

    .line 115
    iput-object p1, p0, Ll/᩵ۤܿ;->ۨ:Ll/ܽۢܳ;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 116
    invoke-static {p2, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p2

    iput-object p2, p0, Ll/᩵ۤܿ;->ۗ:Ll/ܶ᩵ܿ;

    .line 117
    sget-object p2, Ll/᩵ۤܿ;->᩺:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p2

    .line 118
    new-instance v0, Ll/۬۬ܿ;

    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    const v2, 0x7f120528

    invoke-direct {v0, v1, v2}, Ll/۬۬ܿ;-><init>(Ll/ۗܺ᩷;I)V

    .line 119
    new-instance v1, Ll/ۨ۫ܿ;

    invoke-direct {v1, p0, v0, p2, p1}, Ll/ۨ۫ܿ;-><init>(Ll/᩵ۤܿ;Ll/۬۬ܿ;ILl/ܽۢܳ;)V

    .line 232
    sget-object p1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ֫(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 6

    .line 375
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 376
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    const/high16 v2, 0x43480000    # 200.0f

    .line 377
    invoke-static {v2}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v2

    if-ge v0, v2, :cond_0

    int-to-float v3, v2

    int-to-float v0, v0

    div-float/2addr v3, v0

    int-to-float v0, v1

    mul-float v0, v0, v3

    float-to-int v1, v0

    move v0, v2

    .line 384
    :cond_0
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 385
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 386
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->copyBounds()Landroid/graphics/Rect;

    move-result-object v4

    const/4 v5, 0x0

    .line 387
    invoke-virtual {p0, v5, v5, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 388
    invoke-virtual {p0, v3}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 389
    invoke-virtual {p0, v4}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-object v2
.end method

.method public static synthetic ֫(Ljava/lang/String;Ljava/lang/Runnable;Ll/ܽۢܳ;Ll/ܶ᩵ܿ;I)V
    .locals 2

    const v0, 0x7f1204ee

    if-ne p4, v0, :cond_0

    .line 824
    invoke-static {p0}, Ll/᩵ۤܿ;->֫(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 828
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_1
    const p1, 0x7f120088

    if-ne p4, p1, :cond_2

    .line 831
    invoke-virtual {p3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x1

    const/4 p4, 0x0

    invoke-static {p2, p1, p0, p3, p4}, Ll/ܶۗܽ;->֫(Ll/ܽۢܳ;[Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-void

    :cond_2
    const p1, 0x7f120082

    if-ne p4, p1, :cond_3

    .line 833
    invoke-static {p3, p2, p0}, Ll/ܶۗܽ;->ۜ(Ll/ܶ᩵ܿ;Ll/ܽۢܳ;Ljava/lang/String;)V

    return-void

    :cond_3
    const p1, 0x7f12004d

    if-ne p4, p1, :cond_4

    .line 835
    invoke-static {p3, p2, p0}, Ll/ܶۗܽ;->ۧ(Ll/ܶ᩵ܿ;Ll/ܽۢܳ;Ljava/lang/String;)V

    return-void

    :cond_4
    const p1, 0x7f1208a6

    if-ne p4, p1, :cond_5

    .line 837
    invoke-static {p3, p2, p0}, Ll/ܶۗܽ;->ۡ(Ll/ܶ᩵ܿ;Ll/ܽۢܳ;Ljava/lang/String;)V

    return-void

    :cond_5
    const p1, 0x7f1208a5

    if-ne p4, p1, :cond_6

    .line 839
    invoke-static {p3, p2, p0}, Ll/ܶۗܽ;->֫(Ll/ܶ᩵ܿ;Ll/ܽۢܳ;Ljava/lang/String;)V

    return-void

    :cond_6
    if-ne p4, v0, :cond_7

    .line 841
    invoke-static {p3, p2, p0}, Ll/ܶۗܽ;->᩻(Ll/ܶ᩵ܿ;Ll/ܽۢܳ;Ljava/lang/String;)V

    return-void

    :cond_7
    const p1, 0x7f12010c

    if-ne p4, p1, :cond_8

    .line 843
    invoke-static {p3, p2, p0}, Ll/ܶۗܽ;->ۖ(Ll/ܶ᩵ܿ;Ll/ܽۢܳ;Ljava/lang/String;)V

    return-void

    :cond_8
    const p1, 0x7f120533

    if-ne p4, p1, :cond_9

    .line 845
    invoke-static {p3, p2, p0}, Ll/ܶۗܽ;->ܳ(Ll/ܶ᩵ܿ;Ll/ܽۢܳ;Ljava/lang/String;)V

    return-void

    :cond_9
    const p1, 0x7f120493

    if-ne p4, p1, :cond_b

    .line 847
    invoke-static {}, Ll/᩺᩵ۡ;->ܺ()Z

    move-result p1

    if-nez p1, :cond_a

    const p0, 0x7f120757

    .line 848
    invoke-static {p0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 850
    :cond_a
    invoke-static {p3, p2, p0}, Ll/ܶۗܽ;->ܿ(Ll/ܶ᩵ܿ;Ll/ܽۢܳ;Ljava/lang/String;)V

    return-void

    :cond_b
    const p1, 0x7f120274

    if-ne p4, p1, :cond_c

    .line 853
    invoke-static {p3, p2, p0}, Ll/ܶۗܽ;->ᩳ(Ll/ܶ᩵ܿ;Ll/ܽۢܳ;Ljava/lang/String;)V

    return-void

    :cond_c
    const p1, 0x7f12025d

    if-ne p4, p1, :cond_d

    .line 855
    invoke-static {p3, p2, p0}, Ll/ܶۗܽ;->᩷(Ll/ܶ᩵ܿ;Ll/ܽۢܳ;Ljava/lang/String;)V

    return-void

    :cond_d
    const p1, 0x7f12028c

    if-ne p4, p1, :cond_e

    .line 857
    invoke-static {p3, p2, p0}, Ll/ܶۗܽ;->ۢ(Ll/ܶ᩵ܿ;Ll/ܽۢܳ;Ljava/lang/String;)V

    return-void

    :cond_e
    const p1, 0x7f120223

    if-ne p4, p1, :cond_f

    .line 859
    invoke-static {p3, p2, p0}, Ll/ܶۗܽ;->ܽ(Ll/ܶ᩵ܿ;Ll/ܽۢܳ;Ljava/lang/String;)V

    return-void

    :cond_f
    const p1, 0x7f1208b0

    if-ne p4, p1, :cond_10

    .line 861
    invoke-static {p3, p2, p0}, Ll/ܶۗܽ;->ܺ(Ll/ܶ᩵ܿ;Ll/ܽۢܳ;Ljava/lang/String;)V

    return-void

    :cond_10
    const p1, 0x7f120b89

    if-ne p4, p1, :cond_11

    .line 863
    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p2}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p4

    const-class v0, Ll/᩵ܰܽ;

    invoke-direct {p1, p4, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p4, "android.intent.action.VIEW"

    .line 864
    invoke-virtual {p1, p4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 865
    invoke-virtual {p3}, Ll/ܶ᩵ܿ;->ܶۧ()Landroid/net/Uri;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string p3, "packageName"

    .line 866
    invoke-virtual {p1, p3, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 867
    invoke-virtual {p2}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p0

    invoke-virtual {p0, p1}, Lbin/mt/plus/Main;->startActivity(Landroid/content/Intent;)V

    :cond_11
    :goto_0
    return-void
.end method

.method public static synthetic ֫(Ll/۬۬ܿ;)V
    .locals 1

    .line 123
    sget-object v0, Ll/᩵ۤܿ;->᩺:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 124
    invoke-virtual {p0}, Ll/۬۬ܿ;->֫()V

    return-void
.end method

.method public static ֫(Ll/ܽۢܳ;Ll/ܶ᩵ܿ;Ljava/lang/String;Ll/᩷۠᩷;)V
    .locals 16

    .line 779
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f050008

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    .line 780
    new-instance v1, Ll/᩸ܺۡ;

    invoke-virtual/range {p0 .. p0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Ll/᩸ܺۡ;-><init>(Lbin/mt/plus/Main;Landroid/view/View;)V

    const v2, 0x7f12028c

    const v3, 0x7f120533

    const v4, 0x7f12025d

    const v5, 0x7f120223

    const v6, 0x7f120274

    const v7, 0x7f1204ee

    const v8, 0x7f1208a5

    const v9, 0x7f1208b0

    const v10, 0x7f1208a6

    const v11, 0x7f12004d

    const v12, 0x7f12010c

    const v13, 0x7f120082

    const v14, 0x7f120b89

    const v15, 0x7f120088

    if-eqz v0, :cond_0

    .line 782
    invoke-virtual {v1, v15, v15}, Ll/᩸ܺۡ;->֫(II)V

    .line 783
    invoke-virtual {v1, v14, v14}, Ll/᩸ܺۡ;->֫(II)V

    .line 785
    invoke-virtual {v1, v13, v13}, Ll/᩸ܺۡ;->֫(II)V

    .line 786
    invoke-virtual {v1, v12, v12}, Ll/᩸ܺۡ;->֫(II)V

    .line 788
    invoke-virtual {v1, v11, v11}, Ll/᩸ܺۡ;->֫(II)V

    .line 789
    invoke-virtual {v1, v10, v10}, Ll/᩸ܺۡ;->֫(II)V

    .line 791
    invoke-virtual {v1, v9, v9}, Ll/᩸ܺۡ;->֫(II)V

    .line 792
    invoke-virtual {v1, v8, v8}, Ll/᩸ܺۡ;->֫(II)V

    .line 794
    invoke-virtual {v1, v7, v7}, Ll/᩸ܺۡ;->֫(II)V

    .line 795
    invoke-virtual {v1, v6, v6}, Ll/᩸ܺۡ;->֫(II)V

    .line 797
    invoke-virtual {v1, v5, v5}, Ll/᩸ܺۡ;->֫(II)V

    .line 798
    invoke-virtual {v1, v4, v4}, Ll/᩸ܺۡ;->֫(II)V

    .line 800
    invoke-virtual {v1, v3, v3}, Ll/᩸ܺۡ;->֫(II)V

    .line 801
    invoke-virtual {v1, v2, v2}, Ll/᩸ܺۡ;->֫(II)V

    const v2, 0x7f120493

    .line 803
    invoke-virtual {v1, v2, v2}, Ll/᩸ܺۡ;->֫(II)V

    goto :goto_0

    .line 805
    :cond_0
    invoke-virtual {v1, v15, v15}, Ll/᩸ܺۡ;->֫(II)V

    .line 806
    invoke-virtual {v1, v11, v11}, Ll/᩸ܺۡ;->֫(II)V

    .line 807
    invoke-virtual {v1, v13, v13}, Ll/᩸ܺۡ;->֫(II)V

    .line 809
    invoke-virtual {v1, v2, v2}, Ll/᩸ܺۡ;->֫(II)V

    .line 810
    invoke-virtual {v1, v4, v4}, Ll/᩸ܺۡ;->֫(II)V

    .line 811
    invoke-virtual {v1, v6, v6}, Ll/᩸ܺۡ;->֫(II)V

    .line 812
    invoke-virtual {v1, v10, v10}, Ll/᩸ܺۡ;->֫(II)V

    .line 813
    invoke-virtual {v1, v8, v8}, Ll/᩸ܺۡ;->֫(II)V

    .line 814
    invoke-virtual {v1, v9, v9}, Ll/᩸ܺۡ;->֫(II)V

    .line 816
    invoke-virtual {v1, v12, v12}, Ll/᩸ܺۡ;->֫(II)V

    .line 817
    invoke-virtual {v1, v14, v14}, Ll/᩸ܺۡ;->֫(II)V

    .line 818
    invoke-virtual {v1, v7, v7}, Ll/᩸ܺۡ;->֫(II)V

    .line 819
    invoke-virtual {v1, v5, v5}, Ll/᩸ܺۡ;->֫(II)V

    const v2, 0x7f120493

    .line 820
    invoke-virtual {v1, v2, v2}, Ll/᩸ܺۡ;->֫(II)V

    .line 821
    invoke-virtual {v1, v3, v3}, Ll/᩸ܺۡ;->֫(II)V

    .line 823
    :goto_0
    new-instance v2, Ll/᩺۫ܿ;

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    invoke-direct {v2, v5, v6, v3, v4}, Ll/᩺۫ܿ;-><init>(Ljava/lang/String;Ljava/lang/Runnable;Ll/ܽۢܳ;Ll/ܶ᩵ܿ;)V

    invoke-virtual {v1, v2}, Ll/᩸ܺۡ;->֫(Ll/ܶܺۡ;)V

    if-eqz v0, :cond_1

    .line 871
    invoke-virtual {v1}, Ll/᩸ܺۡ;->ۧ()V

    return-void

    .line 873
    :cond_1
    invoke-virtual {v1}, Ll/᩸ܺۡ;->ܽ()V

    return-void
.end method

.method public static ֫(Ll/ᩳܰۡ;Ll/ۡܰۡ;Ll/۫ܽܽ;IZLl/ۡܿܽ;)V
    .locals 14

    move-object v6, p0

    .line 394
    invoke-virtual/range {p2 .. p3}, Ll/۫ܽܽ;->֫(I)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷᩻ܽ;

    const/4 v1, 0x0

    if-eqz p4, :cond_1

    .line 200
    invoke-interface {v0}, Ll/᩷᩻ܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v2

    .line 201
    invoke-interface {v0}, Ll/᩷᩻ܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v3

    .line 202
    invoke-interface {v0}, Ll/᩷᩻ܽ;->ܿ()Ll/ۜ᩻ܽ;

    move-result-object v4

    .line 203
    invoke-interface {v2}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v5

    invoke-interface {v2}, Ll/ۘ᩻ܽ;->getPackageName()Ljava/lang/String;

    move-result-object v8

    move-object/from16 v9, p5

    invoke-virtual {v9, v5, v8}, Ll/ۡܿܽ;->֫(ILjava/lang/String;)Ll/۠ܿܽ;

    move-result-object v5

    .line 204
    invoke-interface {v2}, Ll/ۘ᩻ܽ;->֫ۧ()Ll/ۤܽܽ;

    move-result-object v2

    invoke-virtual {v5, v2}, Ll/۠ܿܽ;->֫(Ll/ۤܽܽ;)V

    .line 205
    invoke-interface {v3}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result v3

    invoke-virtual {v5, v3, v2}, Ll/۠ܿܽ;->ۧ(ILjava/lang/String;)Ll/᩶ܿܽ;

    move-result-object v2

    .line 206
    invoke-interface {v4}, Ll/ۜ᩻ܽ;->۟()Ll/᩸ܽܽ;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩶ܿܽ;->֫(Ll/᩸ܽܽ;)Ll/ۖܿܽ;

    move-result-object v3

    .line 207
    invoke-interface {v0}, Ll/᩷᩻ܽ;->ۚۧ()I

    move-result v4

    invoke-interface {v0}, Ll/᩷᩻ܽ;->۟֫()Ljava/lang/String;

    move-result-object v5

    .line 102
    invoke-virtual {v2, v4, v5, v1}, Ll/᩶ܿܽ;->֫(ILjava/lang/String;Z)V

    .line 208
    invoke-interface {v0}, Ll/᩷᩻ܽ;->ۚۧ()I

    move-result v1

    invoke-virtual {v3, v1}, Ll/ۖܿܽ;->֫(I)Ll/ᩴܿܽ;

    move-result-object v1

    .line 209
    invoke-virtual {v1, v0}, Ll/ᩴܿܽ;->֫(Ll/᩷᩻ܽ;)V

    goto :goto_1

    :cond_1
    move-object/from16 v9, p5

    .line 398
    :goto_1
    invoke-interface {v0}, Ll/᩷᩻ܽ;->᩻֫()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    .line 401
    :cond_2
    invoke-interface {v0}, Ll/᩷᩻ܽ;->getValue()Ll/֨᩻ܽ;

    move-result-object v0

    .line 402
    invoke-interface {v0}, Ll/֨᩻ܽ;->ᩳ֫()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 403
    invoke-interface {v0}, Ll/֨᩻ܽ;->ܿۧ()Ll/ۗ᩻ܽ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v0

    if-eqz v0, :cond_5

    move-object v8, p1

    .line 405
    invoke-virtual {p1, v0, p0}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/ᩳܰۡ;)V

    const/4 v1, 0x0

    .line 1757
    invoke-virtual {p0, v0, v1}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B

    move-result-object v0

    .line 408
    :try_start_0
    invoke-static {v0}, Ll/ܶۨۡ;->ۧ([B)Ll/ܶۨۡ;

    move-result-object v0

    .line 409
    invoke-virtual {v0}, Ll/ܶۨۡ;->᩻()Ll/ۤۨۡ;

    move-result-object v10

    .line 411
    :cond_3
    invoke-virtual {v10}, Ll/ۤۨۡ;->next()I

    move-result v0

    const/4 v11, 0x1

    if-eq v0, v11, :cond_0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 413
    invoke-virtual {v10}, Ll/ۤۨۡ;->getAttributeCount()I

    move-result v12

    const/4 v0, 0x0

    const/4 v13, 0x0

    :goto_2
    if-ge v13, v12, :cond_3

    .line 415
    invoke-virtual {v10, v13}, Ll/ۤۨۡ;->᩻(I)I

    move-result v0

    if-ne v0, v11, :cond_4

    .line 416
    invoke-virtual {v10, v13}, Ll/ۤۨۡ;->ᩳ(I)I

    move-result v3

    const/4 v4, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v5, p5

    invoke-static/range {v0 .. v5}, Ll/᩵ۤܿ;->֫(Ll/ᩳܰۡ;Ll/ۡܰۡ;Ll/۫ܽܽ;IZLl/ۡܿܽ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    :catch_0
    nop

    goto/16 :goto_0

    :cond_5
    move-object v8, p1

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method public static synthetic ֫(Ll/᩵ۤܿ;)V
    .locals 1

    const/4 v0, 0x0

    .line 590
    invoke-direct {p0, v0}, Ll/᩵ۤܿ;->֫(Z)V

    return-void
.end method

.method public static ֫(Ll/᩵ۤܿ;Landroid/content/DialogInterface;I)V
    .locals 4

    .line 276
    iget-object v0, p0, Ll/᩵ۤܿ;->ۨ:Ll/ܽۢܳ;

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    const/4 p1, 0x0

    if-eqz p2, :cond_1

    const/4 v1, 0x1

    if-eq p2, v1, :cond_0

    const/4 v1, 0x2

    if-eq p2, v1, :cond_0

    return-void

    :cond_0
    const-string v1, ".png"

    const-string v2, ".webp"

    .line 329
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    .line 330
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Ll/᩵ۤܿ;->᩸:Ll/ۘܶۡ;

    invoke-virtual {v3}, Ll/ۘܶۡ;->ܽ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "_icon"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, p2, -0x1

    aget-object v1, v1, v3

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2122
    invoke-virtual {v0, v1, p1}, Ll/ܽۢܳ;->֫(Ljava/lang/String;Z)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 331
    new-instance v0, Ll/ܳۤܿ;

    invoke-direct {v0, p0, p1, p2}, Ll/ܳۤܿ;-><init>(Ll/᩵ۤܿ;Ll/ܶ᩵ܿ;I)V

    .line 368
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void

    .line 279
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩵ۤܿ;->᩸:Ll/ۘܶۡ;

    invoke-virtual {v1}, Ll/ۘܶۡ;->ܽ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_icon.zip"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 2122
    invoke-virtual {v0, p2, p1}, Ll/ܽۢܳ;->֫(Ljava/lang/String;Z)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 280
    new-instance p2, Ll/ܿۤܿ;

    invoke-direct {p2, p0, p1}, Ll/ܿۤܿ;-><init>(Ll/᩵ۤܿ;Ll/ܶ᩵ܿ;)V

    .line 326
    invoke-virtual {p2}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public static ֫(Ll/᩵ۤܿ;Landroid/view/View;)V
    .locals 3

    .line 582
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v1, "apk_installation_verify"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 584
    invoke-direct {p0, v2}, Ll/᩵ۤܿ;->֫(Z)V

    return-void

    .line 586
    :cond_0
    iget-object v0, p0, Ll/᩵ۤܿ;->᩹:Ll/ۙۧᩳ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/ۙۧᩳ;->ۡ()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩵ۤܿ;->᩹:Ll/ۙۧᩳ;

    invoke-virtual {v0}, Ll/ۙۧᩳ;->ۢ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 587
    iget-object p1, p0, Ll/᩵ۤܿ;->ۨ:Ll/ܽۢܳ;

    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    const v0, 0x7f120b7b

    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->ۧ(I)V

    const v0, 0x7f12005e

    .line 588
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->֫(I)V

    const v0, 0x7f120189

    const/4 v1, 0x0

    .line 589
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v0, Ll/ۗ᩻ᩳ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Ll/ۗ᩻ᩳ;-><init>(ILjava/lang/Object;)V

    const p0, 0x7f1204b4

    .line 590
    invoke-virtual {p1, p0, v0}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 591
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p0

    .line 592
    invoke-static {p0}, Ll/ۡܶۡ;->֫(Ll/֡ۚۢ;)V

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 595
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 596
    new-instance v0, Ll/ۡۤܿ;

    invoke-direct {v0, p0, p1}, Ll/ۡۤܿ;-><init>(Ll/᩵ۤܿ;Landroid/view/View;)V

    .line 720
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public static synthetic ֫(Ll/᩵ۤܿ;Landroid/widget/TextView;)V
    .locals 3

    .line 220
    :try_start_0
    iget-object v0, p0, Ll/᩵ۤܿ;->ۗ:Ll/ܶ᩵ܿ;

    invoke-static {v0}, Ll/ۚܶۡ;->֫(Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object v0

    .line 221
    iget-object v1, p0, Ll/᩵ۤܿ;->ۙ:Ll/֡ۚۢ;

    invoke-virtual {v1}, Ll/֡ۚۢ;->ۜ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 222
    new-instance v1, Ll/ۛ۫ܿ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1, v0}, Ll/ۛ۫ܿ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    nop

    .line 224
    iget-object p0, p0, Ll/᩵ۤܿ;->ۙ:Ll/֡ۚۢ;

    invoke-virtual {p0}, Ll/֡ۚۢ;->ۜ()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 225
    new-instance p0, Ll/۠ۚۢ;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Ll/۠ۚۢ;-><init>(ILjava/lang/Object;)V

    invoke-static {p0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/᩵ۤܿ;Ll/ۙۧᩳ;)V
    .locals 0

    .line 229
    iput-object p1, p0, Ll/᩵ۤܿ;->᩹:Ll/ۙۧᩳ;

    return-void
.end method

.method public static synthetic ֫(Ll/᩵ۤܿ;Ll/۬۬ܿ;)V
    .locals 1

    .line 121
    iget-boolean p0, p0, Ll/᩵ۤܿ;->ۤ:Z

    if-eqz p0, :cond_0

    .line 122
    new-instance p0, Ll/ܳ۫᩻;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Ll/ܳ۫᩻;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, p0}, Ll/۬۬ܿ;->֫(Ljava/lang/Runnable;)V

    .line 126
    invoke-virtual {p1}, Ll/۬۬ܿ;->ܳ()V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/᩵ۤܿ;Ll/۬۬ܿ;ILjava/lang/String;Ll/ܽۢܳ;)V
    .locals 9

    .line 141
    iget-object v0, p0, Ll/᩵ۤܿ;->ۗ:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/۬۬ܿ;->֫()V

    .line 142
    sget-object p1, Ll/᩵ۤܿ;->᩺:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    if-eq p2, p1, :cond_0

    return-void

    .line 145
    :cond_0
    iget-object p1, p0, Ll/᩵ۤܿ;->᩸:Ll/ۘܶۡ;

    const p2, 0x7f120413

    const v1, 0x7f120b5e

    if-nez p1, :cond_2

    if-nez p3, :cond_1

    .line 147
    invoke-static {p4, v0}, Ll/᩵ܺܳ;->ܿ(Ll/ܽۢܳ;Ll/ܶ᩵ܿ;)V

    return-void

    .line 150
    :cond_1
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    .line 151
    invoke-static {p2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/String;

    move-result-object p1

    .line 153
    invoke-virtual {p4}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p2

    new-instance v0, Ll/֫ۤܿ;

    invoke-direct {v0, p0, p4, p3}, Ll/֫ۤܿ;-><init>(Ll/᩵ۤܿ;Ll/ܽۢܳ;Ljava/lang/String;)V

    const/4 p0, -0x1

    invoke-virtual {p2, p1, p0, v0}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f1205f0

    .line 160
    invoke-virtual {p2, p0}, Ll/᩵ۚۢ;->ۧ(I)V

    invoke-virtual {p2}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 164
    :cond_2
    invoke-virtual {p4}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    const p3, 0x7f0d0076

    .line 165
    invoke-virtual {p1, p3}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v2, 0x7f0a0278

    .line 166
    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/ImageView;

    .line 167
    iget-object v2, p0, Ll/᩵ۤܿ;->᩸:Ll/ۘܶۡ;

    invoke-virtual {v2}, Ll/ۘܶۡ;->᩻()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {p3, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 168
    new-instance v2, Ll/ۡ֨᩷;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p0}, Ll/ۡ֨᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 169
    iget-object p3, p0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v2, 0x7f0a0073

    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object v2, p0, Ll/᩵ۤܿ;->᩸:Ll/ۘܶۡ;

    invoke-virtual {v2}, Ll/ۘܶۡ;->ܽ()Ljava/lang/String;

    move-result-object v2

    invoke-static {p3, v2}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 170
    iget-object p3, p0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v2, 0x7f0a006f

    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object v2, p0, Ll/᩵ۤܿ;->᩸:Ll/ۘܶۡ;

    invoke-virtual {v2}, Ll/ۘܶۡ;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-static {p3, v2}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 171
    iget-object p3, p0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v2, 0x7f0a0678

    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object v2, p0, Ll/᩵ۤܿ;->᩸:Ll/ۘܶۡ;

    invoke-virtual {v2}, Ll/ۘܶۡ;->ۢ()Ljava/lang/String;

    move-result-object v2

    invoke-static {p3, v2}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 172
    iget-object p3, p0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v2, 0x7f0a0679

    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object v2, p0, Ll/᩵ۤܿ;->᩸:Ll/ۘܶۡ;

    invoke-virtual {v2}, Ll/ۘܶۡ;->᩷()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {p3, v2}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 173
    iget-object p3, p0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v2, 0x7f0a052c

    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object v2, p0, Ll/᩵ۤܿ;->᩸:Ll/ۘܶۡ;

    invoke-virtual {v2}, Ll/ۘܶۡ;->ᩳ()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll/᩺ۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {p3, v2}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 174
    iget-object p3, p0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v2, 0x7f0a05b7

    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object v2, p0, Ll/᩵ۤܿ;->᩸:Ll/ۘܶۡ;

    invoke-virtual {v2}, Ll/ۘܶۡ;->ۜ()I

    move-result v2

    invoke-static {v2}, Ll/ۚ۫ۡ;->֫(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p3, v2}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 175
    iget-object p3, p0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v2, 0x7f0a03a1

    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object v2, p0, Ll/᩵ۤܿ;->᩸:Ll/ۘܶۡ;

    invoke-virtual {v2}, Ll/ۘܶۡ;->ܿ()I

    move-result v2

    invoke-static {v2}, Ll/ۚ۫ۡ;->֫(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p3, v2}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 176
    iget-object p3, p0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v2, 0x7f0a0460

    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 177
    iget-object v2, p0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v3, 0x7f0a0523

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroid/widget/TextView;

    .line 178
    iget-object v2, p0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v3, 0x7f0a0526

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    .line 179
    invoke-static {p3}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;)V

    .line 181
    invoke-direct {p0}, Ll/᩵ۤܿ;->ܽ()V

    .line 183
    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v2

    iget-object v3, p0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    .line 184
    invoke-virtual {v2, v3}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v3, 0x7f1204b2

    const/4 v4, 0x0

    .line 185
    invoke-virtual {v2, v3, v4}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 186
    invoke-virtual {v2, v1, p0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const-string v1, "local"

    .line 187
    invoke-virtual {p4, v1}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 188
    invoke-virtual {v2, p2, p0}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 189
    :cond_3
    sget-object p2, Ll/᩵ۤܿ;->ܰ:Ljava/lang/ref/WeakReference;

    if-eqz p2, :cond_4

    .line 190
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/֡ۚۢ;

    if-eqz p2, :cond_4

    .line 191
    invoke-virtual {p2}, Ll/֡ۚۢ;->ۜ()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 192
    invoke-virtual {p2}, Ll/֡ۚۢ;->dismiss()V

    .line 195
    :cond_4
    invoke-virtual {v2}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p2

    iput-object p2, p0, Ll/᩵ۤܿ;->ۙ:Ll/֡ۚۢ;

    .line 196
    new-instance p2, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Ll/᩵ۤܿ;->ۙ:Ll/֡ۚۢ;

    invoke-direct {p2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object p2, Ll/᩵ۤܿ;->ܰ:Ljava/lang/ref/WeakReference;

    .line 197
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ll/ۧۨ᩻;->֫(Ljava/lang/String;)J

    move-result-wide v1

    .line 198
    iget-object p2, p0, Ll/᩵ۤܿ;->ۙ:Ll/֡ۚۢ;

    invoke-virtual {p2}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object p2

    .line 199
    iget-object v0, p0, Ll/᩵ۤܿ;->ۙ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    new-instance v3, Ll/ۧۤܿ;

    const/4 v4, 0x0

    invoke-direct {v3, v4, p0}, Ll/ۧۤܿ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 200
    iget-object v0, p0, Ll/᩵ۤܿ;->ۙ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    new-instance v3, Ll/ܽۤܿ;

    invoke-direct {v3, p0, p4}, Ll/ܽۤܿ;-><init>(Ll/᩵ۤܿ;Ll/ܽۢܳ;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 204
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 206
    new-instance v4, Ll/ᩴۤܿ;

    invoke-direct {v4, p0}, Ll/ᩴۤܿ;-><init>(Ll/᩵ۤܿ;)V

    .line 207
    invoke-virtual {p1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p2

    invoke-virtual {p2, v4}, Ll/۟ۢ֫;->֫(Ll/ܳۡ֫;)V

    .line 208
    invoke-static {p1}, Ll/ۖۖ֫;->֫(Landroid/content/ContextWrapper;)Ll/ۖۖ֫;

    move-result-object v5

    .line 209
    new-instance v6, Ll/ۘۤܿ;

    invoke-direct {v6, p0}, Ll/ۘۤܿ;-><init>(Ll/᩵ۤܿ;)V

    .line 210
    new-instance p2, Landroid/content/IntentFilter;

    const-string p4, "bin.mt.plus.ACTION_INSTALL_FAILED_DOWNGRADE"

    invoke-direct {p2, p4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v6, p2}, Ll/ۖۖ֫;->֫(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 211
    iget-object p2, p0, Ll/᩵ۤܿ;->ۙ:Ll/֡ۚۢ;

    new-instance p4, Ll/ᩳۤܿ;

    move-object v0, p4

    move-object v3, p1

    invoke-direct/range {v0 .. v6}, Ll/ᩳۤܿ;-><init>(JLbin/mt/plus/Main;Ll/ܿۡ֫;Ll/ۖۖ֫;Landroid/content/BroadcastReceiver;)V

    invoke-virtual {p2, p4}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 216
    sget-object p2, Ll/᩷֨ܿ;->֫:Ll/ۚۡ֫;

    iget-object p4, p0, Ll/᩵ۤܿ;->ۙ:Ll/֡ۚۢ;

    new-instance v0, Ll/ۙ۫ܿ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ۙ۫ܿ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p2, p4, v0}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    .line 218
    sget-object p2, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance p4, Ll/ۗ۫ܿ;

    const/4 v0, 0x0

    invoke-direct {p4, v0, p0, p3}, Ll/ۗ۫ܿ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p2, p4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 228
    iget-object v2, p0, Ll/᩵ۤܿ;->ۗ:Ll/ܶ᩵ܿ;

    new-instance v5, Ll/۬۫ܿ;

    invoke-direct {v5, p0}, Ll/۬۫ܿ;-><init>(Ll/᩵ۤܿ;)V

    new-instance v6, Ll/۫۫ܿ;

    invoke-direct {v6, p0}, Ll/۫۫ܿ;-><init>(Ll/᩵ۤܿ;)V

    iget-object p0, p0, Ll/᩵ۤܿ;->᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v4, 0x1

    move-object v0, v7

    move-object v1, v8

    move-object v7, p0

    invoke-static/range {v0 .. v7}, Ll/۠۫ܽ;->֫(Landroid/widget/TextView;Landroid/view/View;Ll/ܶ᩵ܿ;Ll/ۗܺ᩷;ZLl/۬۫ܿ;Ll/ܿۖ᩷;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩵ۤܿ;Ll/۬۬ܿ;ILl/ܽۢܳ;)V
    .locals 9

    .line 120
    new-instance v0, Ll/ܰ۫ܿ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, Ll/ܰ۫ܿ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v1, 0x12c

    invoke-static {v1, v2, v0}, Ll/ۙ᩸᩷;->֫(JLjava/lang/Runnable;)V

    .line 129
    iget-object v0, p0, Ll/᩵ۤܿ;->ۗ:Ll/ܶ᩵ܿ;

    invoke-static {v0}, Ll/ᩴܶۡ;->ܽ(Ll/ܶ᩵ܿ;)Ll/ۘܶۡ;

    move-result-object v1

    iput-object v1, p0, Ll/᩵ۤܿ;->᩸:Ll/ۘܶۡ;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 132
    :try_start_0
    new-instance v1, Ll/ᩳܰۡ;

    invoke-direct {v1, v0}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    :try_start_1
    invoke-static {v1}, Ll/᩹ۨۡ;->֫(Ll/ᩳܰۡ;)Ljava/lang/String;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    :try_start_2
    invoke-virtual {v1}, Ll/ᩳܰۡ;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catchall_0
    move-exception v0

    .line 132
    :try_start_3
    invoke-virtual {v1}, Ll/ᩳܰۡ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    :cond_0
    :goto_1
    move-object v7, v2

    const/4 v0, 0x0

    .line 138
    iput-boolean v0, p0, Ll/᩵ۤܿ;->ۤ:Z

    .line 140
    new-instance v0, Ll/۟۫ܿ;

    move-object v3, v0

    move-object v4, p0

    move-object v5, p1

    move v6, p2

    move-object v8, p3

    invoke-direct/range {v3 .. v8}, Ll/۟۫ܿ;-><init>(Ll/᩵ۤܿ;Ll/۬۬ܿ;ILjava/lang/String;Ll/ܽۢܳ;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩵ۤܿ;Ll/ܽۢܳ;)V
    .locals 0

    .line 201
    iget-object p0, p0, Ll/᩵ۤܿ;->ۗ:Ll/ܶ᩵ܿ;

    invoke-static {p1, p0}, Ll/ۘ۠ܿ;->֫(Ll/ܽۢܳ;Ll/ܶ᩵ܿ;)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩵ۤܿ;Ll/ܽۢܳ;Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 154
    iget-object p0, p0, Ll/᩵ۤܿ;->ۗ:Ll/ܶ᩵ܿ;

    invoke-interface {p3}, Landroid/content/DialogInterface;->dismiss()V

    if-nez p4, :cond_0

    .line 156
    invoke-static {p1, p0}, Ll/᩵ܺܳ;->ܿ(Ll/ܽۢܳ;Ll/ܶ᩵ܿ;)V

    return-void

    :cond_0
    const/4 p3, 0x0

    .line 158
    invoke-static {p1, p0, p2, p3}, Ll/᩵ۤܿ;->֫(Ll/ܽۢܳ;Ll/ܶ᩵ܿ;Ljava/lang/String;Ll/᩷۠᩷;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩵ۤܿ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/᩵ۤܿ;->۫:Z

    return-void
.end method

.method private ֫(Z)V
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 724
    sget-object v1, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v2, "apk_installation_confirm"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    :cond_0
    const/4 v1, 0x1

    if-eqz p1, :cond_2

    .line 728
    invoke-static {}, Ll/᩷֨ܿ;->ܳ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1452
    invoke-static {}, Ll/᩵ܶ᩷;->ܽ()Ll/᩵ܶ᩷;

    move-result-object v2

    const-string v3, "disable_install_by_shizuku"

    .line 1453
    invoke-virtual {v2, v3}, Ll/᩵ܶ᩷;->֫(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 728
    invoke-static {}, Ll/᩷֨ܿ;->ᩳ()I

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 729
    :goto_0
    invoke-static {}, Ll/᩷֨ܿ;->ܿ()Z

    move-result v3

    if-nez v2, :cond_2

    if-nez v3, :cond_2

    const/4 p1, 0x0

    .line 734
    :cond_2
    iget-object v2, p0, Ll/᩵ۤܿ;->ۗ:Ll/ܶ᩵ܿ;

    iget-object v3, p0, Ll/᩵ۤܿ;->ۨ:Ll/ܽۢܳ;

    if-eqz p1, :cond_3

    .line 735
    invoke-virtual {v3}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    const v3, 0x7f120491

    .line 736
    invoke-virtual {p1, v3}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 737
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v2, v1, v0

    const v2, 0x7f1204b3

    invoke-static {v2, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v1, Ll/᩶۫ܿ;

    invoke-direct {v1, v0, p0}, Ll/᩶۫ܿ;-><init>(ILjava/lang/Object;)V

    const v0, 0x7f12070a

    .line 738
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    const/4 v1, 0x0

    .line 739
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 740
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 742
    :cond_3
    invoke-virtual {v3}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    iget-object v0, p0, Ll/᩵ۤܿ;->᩸:Ll/ۘܶۡ;

    invoke-virtual {v0}, Ll/ۘܶۡ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v2, v0}, Ll/᩷֨ܿ;->֫(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic ֫()Z
    .locals 1

    .line 0
    sget-boolean v0, Ll/᩵ۤܿ;->۟:Z

    return v0
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 6

    sget-object v0, Ll/᩵ۤܿ;->֡ܰ᩹:[S

    const/4 v1, 0x0

    .line 88
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v2

    if-gtz v2, :cond_0

    goto/16 :goto_4

    :cond_0
    aget-short v0, v0, v1

    .line 652
    sget v1, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v1, :cond_1

    goto/16 :goto_2

    :cond_1
    add-int/lit16 v1, v0, 0x22ec

    mul-int v1, v1, v1

    const v2, 0x8bb0

    .line 370
    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v3, :cond_2

    goto :goto_1

    :cond_2
    mul-int v0, v0, v2

    sub-int/2addr v0, v1

    if-lez v0, :cond_3

    const/16 v0, 0x74dc

    goto :goto_0

    :cond_3
    const/16 v0, 0x1999

    .line 878
    :goto_0
    invoke-static {}, Ll/᩵ܶ᩷;->ܽ()Ll/᩵ܶ᩷;

    move-result-object v1

    sget-object v2, Ll/᩵ۤܿ;->֡ܰ᩹:[S

    const/4 v3, 0x1

    .line 437
    sget v4, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v4, :cond_4

    goto :goto_2

    :cond_4
    const/16 v4, 0xa

    .line 520
    sget v5, Ll/۟;->ۗۤۛ:I

    if-eqz v5, :cond_5

    goto/16 :goto_4

    .line 878
    :cond_5
    invoke-static {v2, v3, v4, v0}, Ll/ۗ᩶;->᩶ܶۡ([SIII)Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Ll/᩵ܶ᩷;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 681
    sget v2, Ll/֡۬;->۠֡᩶:I

    if-gtz v2, :cond_6

    goto :goto_1

    .line 878
    :cond_6
    sget-object v2, Ll/᩵ۤܿ;->֡ܰ᩹:[S

    const/16 v3, 0xb

    const/4 v4, 0x1

    .line 800
    sget v5, Ll/֨۟;->᩹֫᩷:I

    if-eqz v5, :cond_8

    .line 316
    :goto_1
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    sget p0, Ll/֨᩺;->ۨ֨۬:I

    if-gtz p0, :cond_7

    goto :goto_4

    :cond_7
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    sget p0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-gez p0, :cond_a

    goto :goto_3

    .line 878
    :cond_8
    invoke-static {v2, v3, v4, v0}, Ll/֫᩵;->᩻ۚܺ([SIII)Ljava/lang/String;

    move-result-object v2

    .line 3
    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v3, :cond_9

    goto :goto_4

    .line 878
    :cond_9
    invoke-static {v1, v2}, Ll/֫ܿ;->ܳۖ᩷(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/String;

    move-result-object v1

    .line 879
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_f

    .line 880
    invoke-static {}, Ll/ۢۤۡ;->ܽ()Z

    move-result p0

    if-eqz p0, :cond_c

    sget-object p0, Ll/᩵ۤܿ;->֡ܰ᩹:[S

    const/16 v1, 0x4d

    const/16 v2, 0x14

    .line 843
    sget v3, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v3, :cond_b

    .line 59
    :cond_a
    :goto_2
    sget p0, Ll/֨۟;->᩹֫᩷:I

    if-eqz p0, :cond_d

    goto :goto_4

    .line 880
    :cond_b
    invoke-static {p0, v1, v2, v0}, Ll/ۨ;->۟᩹ܽ([SIII)Ljava/lang/String;

    move-result-object p0

    .line 881
    invoke-static {p0}, Ll/᩸ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    goto :goto_5

    :cond_c
    sget-object p0, Ll/᩵ۤܿ;->֡ܰ᩹:[S

    const/16 v1, 0xc

    const/16 v2, 0x41

    .line 134
    sget v3, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v3, :cond_e

    .line 291
    :cond_d
    :goto_3
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    .line 699
    :goto_4
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    const/4 p0, 0x0

    return p0

    .line 881
    :cond_e
    invoke-static {p0, v1, v2, v0}, Ll/ۘ᩶;->᩻ۤܶ([SIII)Ljava/lang/String;

    move-result-object p0

    .line 883
    invoke-static {p0}, Ll/᩸ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    :goto_5
    const/4 p0, 0x1

    return p0

    :cond_f
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic ۖ(Ll/᩵ۤܿ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/᩵ۤܿ;->۬:Z

    return-void
.end method

.method public static bridge synthetic ۘ(Ll/᩵ۤܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩵ۤܿ;->ܽ()V

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/᩵ۤܿ;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵ۤܿ;->᩶:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static bridge synthetic ۡ(Ll/᩵ۤܿ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩵ۤܿ;->۫:Z

    return p0
.end method

.method public static bridge synthetic ۢ(Ll/᩵ۤܿ;)Ll/ܶ᩵ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵ۤܿ;->ۗ:Ll/ܶ᩵ܿ;

    return-object p0
.end method

.method public static bridge synthetic ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 0
    sput-boolean v0, Ll/᩵ۤܿ;->۟:Z

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩵ۤܿ;Z)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩵ۤܿ;->֫(Z)V

    return-void
.end method

.method public static synthetic ۧ(Ll/᩵ۤܿ;)Z
    .locals 0

    .line 229
    iget-object p0, p0, Ll/᩵ۤܿ;->ۙ:Ll/֡ۚۢ;

    invoke-virtual {p0}, Ll/֡ۚۢ;->ۜ()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static bridge synthetic ܳ(Ll/᩵ۤܿ;)Ll/ۘܶۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵ۤܿ;->᩸:Ll/ۘܶۡ;

    return-object p0
.end method

.method public static bridge synthetic ܺ(Ll/᩵ۤܿ;)Ll/ܽۢܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵ۤܿ;->ۨ:Ll/ܽۢܳ;

    return-object p0
.end method

.method private ܽ()V
    .locals 16

    move-object/from16 v0, p0

    .line 459
    iget-boolean v1, v0, Ll/᩵ۤܿ;->۬:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 461
    iput-boolean v2, v0, Ll/᩵ۤܿ;->۬:Z

    .line 464
    :cond_0
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v3

    const/4 v4, 0x0

    .line 469
    :try_start_0
    invoke-virtual {v3, v2}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v6, 0x0

    :cond_1
    :try_start_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/pm/PackageInfo;

    .line 470
    iget-object v8, v7, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v8, v8, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 v8, v8, 0x81

    if-nez v8, :cond_2

    add-int/lit8 v6, v6, 0x1

    .line 476
    :cond_2
    iget-object v8, v7, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iget-object v9, v0, Ll/᩵ۤܿ;->᩸:Ll/ۘܶۡ;

    invoke-virtual {v9}, Ll/ۘܶۡ;->ܳ()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v8, :cond_1

    goto :goto_0

    :catchall_0
    const/4 v6, 0x0

    :catchall_1
    :cond_3
    move-object v7, v4

    :goto_0
    const/4 v5, 0x1

    if-nez v7, :cond_4

    if-gt v6, v5, :cond_4

    .line 485
    :try_start_2
    iget-object v5, v0, Ll/᩵ۤܿ;->᩸:Ll/ۘܶۡ;

    invoke-virtual {v5}, Ll/ۘܶۡ;->ܳ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_2
    nop

    :cond_4
    :goto_1
    if-eqz v7, :cond_7

    .line 490
    iget-object v3, v7, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 491
    iget v5, v7, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 492
    iget-object v6, v7, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v8, v6, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 493
    iget-object v6, v6, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 494
    sget-object v9, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Android/data/"

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v11, v7, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v9

    .line 495
    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v10

    if-eqz v10, :cond_5

    .line 496
    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    .line 497
    :cond_5
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x22

    if-lt v10, v11, :cond_6

    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v10

    invoke-interface {v10}, Ll/֡᩶ܿ;->֫()Z

    move-result v10

    if-nez v10, :cond_6

    .line 498
    iget-object v10, v7, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v10, v10, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 v10, v10, 0x81

    if-nez v10, :cond_6

    .line 500
    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v4

    .line 503
    :cond_6
    :goto_2
    iget-object v9, v7, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v9, v9, Landroid/content/pm/ApplicationInfo;->uid:I

    .line 504
    iget-wide v10, v7, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    .line 505
    iget-wide v12, v7, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    move v7, v5

    move-object v5, v3

    move-object v3, v4

    move-object v4, v8

    goto :goto_3

    :cond_7
    const-wide/16 v10, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    move-object v3, v4

    move-object v5, v3

    move-object v6, v5

    move-wide v12, v10

    const/4 v7, 0x0

    :goto_3
    const v8, 0x7f0a0071

    const v14, 0x7f0a05a3

    if-eqz v4, :cond_8

    .line 507
    iget-object v15, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    invoke-virtual {v15, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v15

    invoke-virtual {v15}, Landroid/view/View;->getVisibility()I

    move-result v15

    if-nez v15, :cond_8

    .line 508
    iget-object v15, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    invoke-virtual {v15, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    .line 509
    invoke-virtual {v8}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v8

    invoke-interface {v8}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    goto/16 :goto_6

    :cond_8
    const v8, 0x7f0a05a5

    if-eqz v4, :cond_c

    .line 514
    iget-object v1, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    invoke-virtual {v1, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 515
    iget-object v1, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 516
    iget-object v1, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v8, 0x7f0a05a6

    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    if-eqz v6, :cond_9

    .line 519
    iget-object v8, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v14, 0x7f0a05a4

    const/high16 v15, 0x41500000    # 13.0f

    invoke-virtual {v8, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8, v2}, Landroid/view/View;->setVisibility(I)V

    .line 520
    iget-object v8, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v14, 0x7f0a0133

    invoke-virtual {v8, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    .line 521
    new-instance v14, Landroid/text/SpannableString;

    invoke-direct {v14, v6}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 522
    new-instance v6, Landroid/text/style/AbsoluteSizeSpan;

    invoke-static {v15}, Ll/ۧ᩸ۡ;->ܽ(F)I

    move-result v1

    invoke-direct {v6, v1}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-virtual {v14}, Landroid/text/SpannableString;->length()I

    move-result v1

    const/16 v15, 0x11

    invoke-virtual {v14, v6, v2, v1, v15}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 523
    invoke-virtual {v8, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 524
    invoke-static {v8}, Ll/ܳ᩹ۡ;->ۧ(Landroid/widget/TextView;)V

    .line 525
    invoke-virtual {v8, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/high16 v15, 0x41500000    # 13.0f

    goto :goto_4

    :cond_9
    const/high16 v15, 0x41500000    # 13.0f

    .line 527
    iget-object v1, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v6, 0x7f0a05a4

    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/16 v6, 0x8

    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    :goto_4
    if-eqz v3, :cond_a

    .line 530
    iget-object v1, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v6, 0x7f0a05a7

    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 531
    iget-object v1, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v6, 0x7f0a05f7

    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v6, 0x7f120222

    invoke-static {v6}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v8

    const-string v14, " 1"

    invoke-virtual {v8, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 532
    iget-object v1, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v8, 0x7f0a05e5

    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-static {v6}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v6

    const-string v8, " 2"

    invoke-virtual {v6, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 533
    iget-object v1, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v6, 0x7f0a0134

    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 534
    new-instance v6, Landroid/text/SpannableString;

    invoke-direct {v6, v3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 535
    new-instance v3, Landroid/text/style/AbsoluteSizeSpan;

    invoke-static {v15}, Ll/ۧ᩸ۡ;->ܽ(F)I

    move-result v8

    invoke-direct {v3, v8}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-virtual {v6}, Landroid/text/SpannableString;->length()I

    move-result v8

    const/16 v14, 0x11

    invoke-virtual {v6, v3, v2, v8, v14}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 536
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 537
    invoke-static {v1}, Ll/ܳ᩹ۡ;->ۧ(Landroid/widget/TextView;)V

    .line 538
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_5

    .line 540
    :cond_a
    iget-object v1, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v3, 0x7f0a05a7

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 546
    :goto_5
    iget-object v1, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v3, 0x7f0a029e

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " ("

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ")"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 548
    iget-object v1, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v3, 0x7f0a0071

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 549
    new-instance v3, Landroid/text/SpannableString;

    invoke-direct {v3, v4}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 550
    new-instance v4, Landroid/text/style/AbsoluteSizeSpan;

    invoke-static {v15}, Ll/ۧ᩸ۡ;->ܽ(F)I

    move-result v5

    invoke-direct {v4, v5}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-virtual {v3}, Landroid/text/SpannableString;->length()I

    move-result v5

    const/16 v6, 0x11

    invoke-virtual {v3, v4, v2, v5, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 551
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 552
    invoke-static {v1}, Ll/ܳ᩹ۡ;->ۧ(Landroid/widget/TextView;)V

    .line 553
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 555
    iget-object v1, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v3, 0x7f0a0658

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 556
    iget-object v1, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v3, 0x7f0a01f8

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-static {v10, v11}, Ll/ܿۤۡ;->ۧ(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 557
    iget-object v1, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v3, 0x7f0a02cc

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-static {v12, v13}, Ll/ܿۤۡ;->ۧ(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    int-to-long v3, v7

    .line 559
    iget-object v1, v0, Ll/᩵ۤܿ;->᩸:Ll/ۘܶۡ;

    invoke-virtual {v1}, Ll/ۘܶۡ;->᩷()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-lez v1, :cond_b

    const/4 v2, 0x1

    :cond_b
    iput-boolean v2, v0, Ll/᩵ۤܿ;->۫:Z

    goto :goto_6

    .line 561
    :cond_c
    iget-object v3, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    invoke-virtual {v3, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 562
    iget-object v3, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v5, 0x7f0a05a4

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 563
    iget-object v3, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    invoke-virtual {v3, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 564
    iget-object v3, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v5, 0x7f0a05a6

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 565
    iget-object v3, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v5, 0x7f0a05a7

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 566
    iget-object v3, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v5, 0x7f0a05a8

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 567
    iget-object v3, v0, Ll/᩵ۤܿ;->ۛ:Landroid/view/View;

    const v5, 0x7f0a05a9

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 569
    iput-boolean v2, v0, Ll/᩵ۤܿ;->۫:Z

    if-eqz v1, :cond_d

    .line 571
    invoke-direct {v0, v2}, Ll/᩵ۤܿ;->֫(Z)V

    :cond_d
    :goto_6
    return-void
.end method

.method public static synthetic ܽ(Ll/᩵ۤܿ;)V
    .locals 0

    .line 216
    invoke-direct {p0}, Ll/᩵ۤܿ;->ܽ()V

    return-void
.end method

.method public static synthetic ܿ(Ll/᩵ۤܿ;)V
    .locals 2

    .line 738
    iget-object v0, p0, Ll/᩵ۤܿ;->ۨ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    iget-object v1, p0, Ll/᩵ۤܿ;->ۗ:Ll/ܶ᩵ܿ;

    iget-object p0, p0, Ll/᩵ۤܿ;->᩸:Ll/ۘܶۡ;

    invoke-virtual {p0}, Ll/ۘܶۡ;->ܳ()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, v1, p0}, Ll/᩷֨ܿ;->֫(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    return-void
.end method

.method public static ᩳ(Ll/᩵ۤܿ;)V
    .locals 5

    const v0, 0x7f120366

    .line 271
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120364

    .line 272
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f120365

    .line 273
    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/CharSequence;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    .line 275
    iget-object v0, p0, Ll/᩵ۤܿ;->ۨ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f120363

    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    new-instance v1, Ll/ۤ۫ܿ;

    invoke-direct {v1, p0}, Ll/ۤ۫ܿ;-><init>(Ll/᩵ۤܿ;)V

    const/4 p0, -0x1

    invoke-virtual {v0, v3, p0, v1}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    .line 371
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/᩵ۤܿ;)Ll/֡ۚۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵ۤܿ;->ۙ:Ll/֡ۚۢ;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/᩵ۤܿ;)Ll/ۙۧᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵ۤܿ;->᩹:Ll/ۙۧᩳ;

    return-object p0
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 578
    iget-object p1, p0, Ll/᩵ۤܿ;->ۨ:Ll/ܽۢܳ;

    iget-object p2, p0, Ll/᩵ۤܿ;->ۗ:Ll/ܶ᩵ܿ;

    invoke-static {p1, p2}, Ll/᩵ܺܳ;->ܿ(Ll/ܽۢܳ;Ll/ܶ᩵ܿ;)V

    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 748
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0a0133

    const/4 v2, 0x1

    iget-object v3, p0, Ll/᩵ۤܿ;->ۨ:Ll/ܽۢܳ;

    if-ne v0, v1, :cond_1

    .line 749
    iget-object v0, p0, Ll/᩵ۤܿ;->ۙ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    .line 750
    invoke-static {}, Ll/ۢ֨ۢ;->᩷()Z

    move-result v0

    if-nez v0, :cond_0

    .line 751
    iget-object v0, p0, Ll/᩵ۤܿ;->᩸:Ll/ۘܶۡ;

    invoke-virtual {v0}, Ll/ۘܶۡ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴܶܿ;->ۧ(Ljava/lang/String;)Ll/ۘܶܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 753
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ll/ۘܶܿ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/data"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1, v2}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;Z)V

    return-void

    .line 757
    :cond_0
    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1, v2}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;Z)V

    return-void

    .line 758
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0a0134

    if-ne v0, v1, :cond_3

    .line 759
    iget-object v0, p0, Ll/᩵ۤܿ;->ۙ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    .line 760
    invoke-static {}, Ll/ۢ֨ۢ;->᩷()Z

    move-result v0

    if-nez v0, :cond_2

    .line 761
    iget-object v0, p0, Ll/᩵ۤܿ;->᩸:Ll/ۘܶۡ;

    invoke-virtual {v0}, Ll/ۘܶۡ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴܶܿ;->ۧ(Ljava/lang/String;)Ll/ۘܶܿ;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 763
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ll/ۘܶܿ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/android_data"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1, v2}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;Z)V

    return-void

    .line 767
    :cond_2
    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1, v2}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;Z)V

    return-void

    .line 768
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0a0071

    if-ne v0, v1, :cond_4

    .line 769
    iget-object v0, p0, Ll/᩵ۤܿ;->ۙ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    .line 770
    new-instance v0, Ljava/io/File;

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 771
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ll/ܽۢܳ;->ᩳ(Ljava/lang/String;)V

    .line 772
    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1, v2}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;Z)V

    return-void

    .line 774
    :cond_4
    iget-object p1, p0, Ll/᩵ۤܿ;->᩸:Ll/ۘܶۡ;

    invoke-virtual {p1}, Ll/ۘܶۡ;->ܳ()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/᩵ۤܿ;->ۙ:Ll/֡ۚۢ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ll/᩷۠᩷;

    const/4 v2, 0x3

    invoke-direct {v1, v2, v0}, Ll/᩷۠᩷;-><init>(ILjava/lang/Object;)V

    iget-object v0, p0, Ll/᩵ۤܿ;->ۗ:Ll/ܶ᩵ܿ;

    invoke-static {v3, v0, p1, v1}, Ll/᩵ۤܿ;->֫(Ll/ܽۢܳ;Ll/ܶ᩵ܿ;Ljava/lang/String;Ll/᩷۠᩷;)V

    return-void
.end method
