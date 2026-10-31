.class public Ll/ۗۨܿ;
.super Landroid/app/Service;
.source "PAKQ"

# interfaces
.implements Landroid/media/ImageReader$OnImageAvailableListener;


# static fields
.field private static final ۙ۬᩹:[S

.field public static ۜ֫:Z

.field public static final synthetic ܳ֫:I

.field public static final ᩻֫:Landroid/os/Handler;


# instance fields
.field public ֫֫:Landroid/graphics/Rect;

.field public ۗ:Ll/۠ۢۡ;

.field public ۙ:Ll/۠ۢۡ;

.field public ۛ:[I

.field public ۟:Ll/ۡۨܿ;

.field public ۤ:I

.field public ۧ֫:Landroid/content/Intent;

.field public ۨ:I

.field public ۫:Landroid/graphics/Rect;

.field public ۬:Landroid/media/projection/MediaProjection;

.field public ܰ:Ll/ۜۨܿ;

.field public ܽ֫:Landroid/graphics/Point;

.field public ܿ֫:Landroid/hardware/display/VirtualDisplay;

.field public ᩳ֫:Landroid/graphics/Point;

.field public ᩶:Landroid/media/ImageReader;

.field public ᩸:Landroid/content/BroadcastReceiver;

.field public ᩹:Z

.field public ᩺:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x5

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۗۨܿ;->ۙ۬᩹:[S

    .line 65
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Ll/ۗۨܿ;->᩻֫:Landroid/os/Handler;

    return-void

    :array_0
    .array-data 2
        0x7c8s
        -0x60fds
        -0x60fas
        -0x60eds
        -0x60fas
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 61
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 69
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Ll/ۗۨܿ;->ܽ֫:Landroid/graphics/Point;

    .line 70
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Ll/ۗۨܿ;->ᩳ֫:Landroid/graphics/Point;

    .line 71
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/ۗۨܿ;->۫:Landroid/graphics/Rect;

    .line 165
    new-instance v0, Ll/ܶۨܿ;

    invoke-direct {v0, p0}, Ll/ܶۨܿ;-><init>(Ll/ۗۨܿ;)V

    iput-object v0, p0, Ll/ۗۨܿ;->᩸:Landroid/content/BroadcastReceiver;

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 524
    iput-object v0, p0, Ll/ۗۨܿ;->ۛ:[I

    .line 525
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/ۗۨܿ;->֫֫:Landroid/graphics/Rect;

    return-void
.end method

.method private ֫(II)V
    .locals 11

    .line 426
    iget-object v0, p0, Ll/ۗۨܿ;->ܽ֫:Landroid/graphics/Point;

    const/4 v1, 0x0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 428
    :cond_0
    iget v2, v0, Landroid/graphics/Point;->x:I

    if-lt p1, v2, :cond_1

    add-int/lit8 p1, v2, -0x1

    :cond_1
    :goto_0
    if-gez p2, :cond_2

    const/4 p2, 0x0

    goto :goto_1

    .line 433
    :cond_2
    iget v2, v0, Landroid/graphics/Point;->y:I

    if-lt p2, v2, :cond_3

    add-int/lit8 p2, v2, -0x1

    .line 436
    :cond_3
    :goto_1
    iget-object v2, p0, Ll/ۗۨܿ;->۫:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->left:I

    neg-int v3, v3

    .line 437
    iget v4, v2, Landroid/graphics/Rect;->top:I

    neg-int v4, v4

    .line 515
    iget-object v5, p0, Ll/ۗۨܿ;->ܰ:Ll/ۜۨܿ;

    if-eqz v5, :cond_4

    .line 516
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    move-result v5

    if-lez v5, :cond_4

    goto :goto_2

    .line 521
    :cond_4
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f07035c

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    float-to-int v5, v5

    .line 505
    :goto_2
    iget-object v6, p0, Ll/ۗۨܿ;->۟:Ll/ۡۨܿ;

    if-eqz v6, :cond_5

    .line 506
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v6

    if-lez v6, :cond_5

    goto :goto_3

    .line 511
    :cond_5
    invoke-static {}, Ll/۬ۨܿ;->ܳ()I

    move-result v6

    .line 442
    :goto_3
    iput p1, p0, Ll/ۗۨܿ;->ۨ:I

    .line 443
    iput p2, p0, Ll/ۗۨܿ;->᩺:I

    .line 444
    div-int/lit8 v7, v5, 0x2

    sub-int v8, p1, v7

    sub-int v7, p2, v7

    .line 450
    iget v9, v2, Landroid/graphics/Rect;->left:I

    if-gt v8, v9, :cond_6

    sub-int v9, v8, v9

    goto :goto_4

    :cond_6
    add-int v9, v8, v5

    .line 452
    iget v10, v2, Landroid/graphics/Rect;->right:I

    if-lt v9, v10, :cond_7

    sub-int/2addr v9, v10

    goto :goto_4

    :cond_7
    const/4 v9, 0x0

    .line 455
    :goto_4
    iget v10, v2, Landroid/graphics/Rect;->top:I

    if-gt v7, v10, :cond_8

    sub-int v1, v7, v10

    goto :goto_5

    :cond_8
    add-int/2addr v5, v7

    .line 457
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    if-lt v5, v2, :cond_9

    sub-int v1, v5, v2

    .line 460
    :cond_9
    :goto_5
    iget-object v2, p0, Ll/ۗۨܿ;->ܰ:Ll/ۜۨܿ;

    invoke-virtual {v2, v9, v1}, Ll/ۜۨܿ;->֫(II)V

    add-int/2addr v8, v3

    add-int/2addr v7, v4

    .line 464
    iget-object v1, p0, Ll/ۗۨܿ;->ۙ:Ll/۠ۢۡ;

    invoke-virtual {v1, v8, v7}, Ll/۠ۢۡ;->֫(II)V

    .line 466
    iget v1, v0, Landroid/graphics/Point;->x:I

    iget v0, v0, Landroid/graphics/Point;->y:I

    const/high16 v2, 0x3f000000    # 0.5f

    const/high16 v5, 0x3fc00000    # 1.5f

    if-ge v1, v0, :cond_b

    .line 467
    div-int/lit8 v0, v6, 0x2

    sub-int/2addr p1, v0

    add-int/2addr p1, v3

    int-to-float p2, p2

    int-to-float v0, v6

    mul-float v5, v5, v0

    sub-float v1, p2, v5

    float-to-int v1, v1

    add-int/2addr v1, v4

    if-gtz v1, :cond_a

    mul-float v0, v0, v2

    add-float/2addr v0, p2

    float-to-int p2, v0

    add-int v1, p2, v4

    .line 472
    :cond_a
    iget-object p2, p0, Ll/ۗۨܿ;->ۗ:Ll/۠ۢۡ;

    invoke-virtual {p2, p1, v1}, Ll/۠ۢۡ;->֫(II)V

    return-void

    .line 474
    :cond_b
    div-int/lit8 v0, v6, 0x2

    sub-int/2addr p2, v0

    add-int/2addr p2, v4

    int-to-float p1, p1

    int-to-float v0, v6

    mul-float v5, v5, v0

    sub-float v1, p1, v5

    float-to-int v1, v1

    add-int/2addr v1, v3

    if-gtz v1, :cond_c

    mul-float v0, v0, v2

    add-float/2addr v0, p1

    float-to-int p1, v0

    add-int v1, p1, v3

    .line 479
    :cond_c
    iget-object p1, p0, Ll/ۗۨܿ;->ۗ:Ll/۠ۢۡ;

    invoke-virtual {p1, v1, p2}, Ll/۠ۢۡ;->֫(II)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۗۨܿ;)V
    .locals 2

    .line 335
    iget-object v0, p0, Ll/ۗۨܿ;->۟:Ll/ۡۨܿ;

    iget-object v1, p0, Ll/ۗۨܿ;->ۗ:Ll/۠ۢۡ;

    invoke-virtual {v1}, Ll/۠ۢۡ;->ۧ()F

    move-result v1

    iget-object p0, p0, Ll/ۗۨܿ;->ۗ:Ll/۠ۢۡ;

    invoke-virtual {p0}, Ll/۠ۢۡ;->ܽ()F

    move-result p0

    invoke-virtual {v0, v1, p0}, Ll/ۡۨܿ;->֫(FF)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۗۨܿ;II)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/ۗۨܿ;->֫(II)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۗۨܿ;Landroid/graphics/Point;FF)V
    .locals 1

    .line 348
    invoke-static {}, Ll/۬ۨܿ;->ᩳ()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p2, v0

    float-to-int p2, p2

    div-float/2addr p3, v0

    float-to-int p3, p3

    .line 351
    iget v0, p1, Landroid/graphics/Point;->x:I

    add-int/2addr v0, p2

    iget p1, p1, Landroid/graphics/Point;->y:I

    add-int/2addr p1, p3

    invoke-direct {p0, v0, p1}, Ll/ۗۨܿ;->֫(II)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۗۨܿ;[IFF)V
    .locals 1

    const/4 v0, 0x0

    .line 320
    aget v0, p1, v0

    int-to-float v0, v0

    add-float/2addr v0, p2

    float-to-int p2, v0

    iget-object v0, p0, Ll/ۗۨܿ;->ۙ:Ll/۠ۢۡ;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, p2

    const/4 p2, 0x1

    .line 321
    aget p1, p1, p2

    int-to-float p1, p1

    add-float/2addr p1, p3

    float-to-int p1, p1

    iget-object p2, p0, Ll/ۗۨܿ;->ۙ:Ll/۠ۢۡ;

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    add-int/2addr p2, p1

    .line 322
    invoke-direct {p0, v0, p2}, Ll/ۗۨܿ;->֫(II)V

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;)V
    .locals 2

    .line 141
    sget-boolean v0, Ll/ۗۨܿ;->ۜ֫:Z

    if-eqz v0, :cond_0

    .line 142
    new-instance p0, Landroid/content/Intent;

    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    const-class v1, Ll/ۗۨܿ;

    invoke-direct {p0, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 143
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    return-void

    .line 145
    :cond_0
    invoke-static {p0}, Ll/ۢ֨ۢ;->֫(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 146
    instance-of v0, p0, Lbin/mt/plus/Main;

    if-eqz v0, :cond_1

    check-cast p0, Lbin/mt/plus/Main;

    .line 147
    invoke-virtual {p0}, Lbin/mt/plus/Main;->᩻֫()V

    return-void

    .line 148
    :cond_1
    instance-of v0, p0, Ll/֨᩶᩷;

    if-eqz v0, :cond_2

    check-cast p0, Ll/֨᩶᩷;

    .line 149
    invoke-virtual {p0}, Ll/֨᩶᩷;->ܰ()V

    return-void

    .line 151
    :cond_2
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_3
    const/4 v0, 0x0

    .line 76
    :try_start_0
    invoke-static {p0, v0}, Ll/᩸ᩴܺ;->ܽ(Landroid/content/Context;Ll/ܶᩴܺ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    .line 546
    invoke-virtual {p0, v1, v0}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public static bridge synthetic ֫()Z
    .locals 1

    .line 0
    sget-boolean v0, Ll/ۗۨܿ;->ۜ֫:Z

    return v0
.end method

.method public static bridge synthetic ۖ(Ll/ۗۨܿ;)Ll/ۜۨܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۨܿ;->ܰ:Ll/ۜۨܿ;

    return-object p0
.end method

.method public static bridge synthetic ۘ(Ll/ۗۨܿ;)Ll/ۡۨܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۨܿ;->۟:Ll/ۡۨܿ;

    return-object p0
.end method

.method public static bridge synthetic ۜ(Ll/ۗۨܿ;)Ll/۠ۢۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۨܿ;->ۙ:Ll/۠ۢۡ;

    return-object p0
.end method

.method public static bridge synthetic ۡ(Ll/ۗۨܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۗۨܿ;->ۨ:I

    return p0
.end method

.method public static bridge synthetic ۢ(Ll/ۗۨܿ;)Landroid/graphics/Rect;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۨܿ;->۫:Landroid/graphics/Rect;

    return-object p0
.end method

.method private ۧ()V
    .locals 2

    .line 377
    iget-object v0, p0, Ll/ۗۨܿ;->ܿ֫:Landroid/hardware/display/VirtualDisplay;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 378
    invoke-virtual {v0}, Landroid/hardware/display/VirtualDisplay;->release()V

    .line 379
    iput-object v1, p0, Ll/ۗۨܿ;->ܿ֫:Landroid/hardware/display/VirtualDisplay;

    .line 381
    :cond_0
    iget-object v0, p0, Ll/ۗۨܿ;->᩶:Landroid/media/ImageReader;

    if-eqz v0, :cond_1

    .line 382
    invoke-virtual {v0}, Landroid/media/ImageReader;->close()V

    .line 383
    iput-object v1, p0, Ll/ۗۨܿ;->᩶:Landroid/media/ImageReader;

    .line 385
    :cond_1
    iget-object v0, p0, Ll/ۗۨܿ;->۬:Landroid/media/projection/MediaProjection;

    if-eqz v0, :cond_2

    .line 386
    invoke-virtual {v0}, Landroid/media/projection/MediaProjection;->stop()V

    .line 387
    iput-object v1, p0, Ll/ۗۨܿ;->۬:Landroid/media/projection/MediaProjection;

    :cond_2
    return-void
.end method

.method public static ۧ(Ll/ۗۨܿ;)V
    .locals 3

    .line 584
    sget-boolean v0, Ll/ۗۨܿ;->ۜ֫:Z

    if-eqz v0, :cond_0

    .line 287
    iget-boolean v0, p0, Ll/ۗۨܿ;->᩹:Z

    if-nez v0, :cond_0

    .line 288
    invoke-direct {p0}, Ll/ۗۨܿ;->ۧ()V

    .line 289
    invoke-direct {p0}, Ll/ۗۨܿ;->ܽ()V

    .line 290
    new-instance v0, Ll/ܺ᩷ܳ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Ll/ܺ᩷ܳ;-><init>(ILjava/lang/Object;)V

    const-wide/16 v1, 0x1f4

    invoke-static {v1, v2, v0}, Ll/ۙ᩸᩷;->֫(JLjava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public static ۧ(Ll/ۗܺ᩷;)V
    .locals 9

    const v0, 0x7f0d00f2

    .line 84
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0583

    .line 85
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ۗۘ;

    const v2, 0x7f0a0582

    .line 86
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/ۗۘ;

    const v3, 0x7f0a0553

    .line 87
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Spinner;

    const v4, 0x7f0a0555

    .line 88
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Spinner;

    const v5, 0x7f0a0556

    .line 89
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/Spinner;

    .line 90
    new-instance v6, Ll/᩶ۡۡ;

    invoke-virtual {p0}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f03001d

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, p0, v7}, Ll/᩶ۡۡ;-><init>(Landroid/content/Context;[Ljava/lang/Object;)V

    invoke-virtual {v3, v6}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 91
    new-instance v6, Ll/᩶ۡۡ;

    invoke-virtual {p0}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, p0, v7}, Ll/᩶ۡۡ;-><init>(Landroid/content/Context;[Ljava/lang/Object;)V

    invoke-virtual {v4, v6}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 92
    new-instance v6, Ll/᩶ۡۡ;

    invoke-virtual {p0}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f030011

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, p0, v7}, Ll/᩶ۡۡ;-><init>(Landroid/content/Context;[Ljava/lang/Object;)V

    invoke-virtual {v5, v6}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 93
    invoke-static {}, Ll/۬ۨܿ;->ۜ()Z

    move-result v6

    invoke-virtual {v1, v6}, Ll/ۗۘ;->setChecked(Z)V

    .line 94
    invoke-static {}, Ll/۬ۨܿ;->᩷()Z

    move-result v6

    invoke-virtual {v2, v6}, Ll/ۗۘ;->setChecked(Z)V

    .line 95
    invoke-static {}, Ll/۬ۨܿ;->ܿ()I

    move-result v6

    invoke-virtual {v3, v6}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 96
    invoke-static {}, Ll/۬ۨܿ;->ۧ()I

    move-result v6

    invoke-virtual {v4, v6}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 97
    invoke-static {}, Ll/۬ۨܿ;->ܽ()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 99
    new-instance v6, Ll/᩹᩸ۜ;

    const/4 v7, 0x1

    invoke-direct {v6, v7}, Ll/᩹᩸ۜ;-><init>(I)V

    invoke-virtual {v1, v6}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 100
    new-instance v1, Ll/ۚۨܿ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 101
    new-instance v1, Ll/ܺۨܿ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 182
    new-instance v2, Ll/᩸ۨܿ;

    invoke-direct {v2, v1}, Ll/᩸ۨܿ;-><init>(Ljava/util/function/IntConsumer;)V

    .line 101
    invoke-virtual {v3, v2}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 102
    new-instance v1, Ll/ۖۨܿ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 182
    new-instance v2, Ll/᩸ۨܿ;

    invoke-direct {v2, v1}, Ll/᩸ۨܿ;-><init>(Ljava/util/function/IntConsumer;)V

    .line 102
    invoke-virtual {v4, v2}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 103
    new-instance v1, Ll/ۘۨܿ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 182
    new-instance v2, Ll/᩸ۨܿ;

    invoke-direct {v2, v1}, Ll/᩸ۨܿ;-><init>(Ljava/util/function/IntConsumer;)V

    .line 103
    invoke-virtual {v5, v2}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ll/֡ۚۢ;

    .line 106
    new-instance v2, Ll/֨ۨܿ;

    invoke-direct {v2, v1}, Ll/֨ۨܿ;-><init>([Ll/֡ۚۢ;)V

    .line 117
    new-instance v3, Ll/۠ۨܿ;

    invoke-direct {v3, v2}, Ll/۠ۨܿ;-><init>(Landroid/content/BroadcastReceiver;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 131
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v2

    const v3, 0x7f1208ea

    .line 132
    invoke-virtual {v2, v3}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 133
    invoke-virtual {v2, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    .line 134
    sget-boolean v0, Ll/ۗۨܿ;->ۜ֫:Z

    if-eqz v0, :cond_0

    const v0, 0x7f1209e1

    goto :goto_0

    :cond_0
    const v0, 0x7f1209d2

    :goto_0
    const v3, 0x7f120189

    const/4 v4, 0x0

    .line 0
    invoke-static {v2, v0, v4, v3, v4}, Ll/۟ۖᩴ;->֫(Ll/᩵ۚۢ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/֡ۚۢ;

    move-result-object v0

    const/4 v2, 0x0

    aput-object v0, v1, v2

    .line 137
    instance-of v1, p0, Ll/֨᩶᩷;

    if-eqz v1, :cond_1

    .line 138
    new-instance v1, Ll/ᩴۨܿ;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Ll/ᩴۨܿ;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 140
    :cond_1
    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ۡ֨᩷;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0}, Ll/ۡ֨᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private ܳ()V
    .locals 1

    .line 392
    invoke-direct {p0}, Ll/ۗۨܿ;->ۧ()V

    .line 393
    iget-object v0, p0, Ll/ۗۨܿ;->ۙ:Ll/۠ۢۡ;

    if-eqz v0, :cond_0

    .line 394
    invoke-virtual {v0}, Ll/۠ۢۡ;->ᩳ()V

    .line 396
    :cond_0
    iget-object v0, p0, Ll/ۗۨܿ;->ۗ:Ll/۠ۢۡ;

    if-eqz v0, :cond_1

    .line 397
    invoke-virtual {v0}, Ll/۠ۢۡ;->ᩳ()V

    :cond_1
    return-void
.end method

.method public static ܳ(Ll/ۗۨܿ;)V
    .locals 1

    .line 584
    sget-boolean v0, Ll/ۗۨܿ;->ۜ֫:Z

    if-eqz v0, :cond_0

    .line 291
    iget-boolean v0, p0, Ll/ۗۨܿ;->᩹:Z

    if-nez v0, :cond_0

    const-string v0, "Getting screen image timed out"

    .line 292
    invoke-static {v0}, Ll/᩸ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    .line 293
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ܺ(Ll/ۗۨܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۗۨܿ;->᩺:I

    return p0
.end method

.method private ܽ()V
    .locals 10

    .line 357
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v5, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 358
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "media_projection"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/projection/MediaProjectionManager;

    const/4 v1, -0x1

    .line 359
    iget-object v2, p0, Ll/ۗۨܿ;->ۧ֫:Landroid/content/Intent;

    invoke-virtual {v0, v1, v2}, Landroid/media/projection/MediaProjectionManager;->getMediaProjection(ILandroid/content/Intent;)Landroid/media/projection/MediaProjection;

    move-result-object v0

    iput-object v0, p0, Ll/ۗۨܿ;->۬:Landroid/media/projection/MediaProjection;

    .line 360
    iget-object v0, p0, Ll/ۗۨܿ;->ܽ֫:Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->x:I

    iget v2, v0, Landroid/graphics/Point;->y:I

    const/4 v3, 0x1

    invoke-static {v1, v2, v3, v3}, Landroid/media/ImageReader;->newInstance(IIII)Landroid/media/ImageReader;

    move-result-object v1

    iput-object v1, p0, Ll/ۗۨܿ;->᩶:Landroid/media/ImageReader;

    .line 364
    iget-object v2, p0, Ll/ۗۨܿ;->۬:Landroid/media/projection/MediaProjection;

    iget v3, v0, Landroid/graphics/Point;->x:I

    iget v4, v0, Landroid/graphics/Point;->y:I

    .line 369
    invoke-virtual {v1}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v0, "MT_COLOR_PICKER"

    const/16 v6, 0x10

    move-object v1, v2

    move-object v2, v0

    .line 364
    invoke-virtual/range {v1 .. v9}, Landroid/media/projection/MediaProjection;->createVirtualDisplay(Ljava/lang/String;IIIILandroid/view/Surface;Landroid/hardware/display/VirtualDisplay$Callback;Landroid/os/Handler;)Landroid/hardware/display/VirtualDisplay;

    move-result-object v0

    iput-object v0, p0, Ll/ۗۨܿ;->ܿ֫:Landroid/hardware/display/VirtualDisplay;

    const/4 v0, 0x0

    .line 372
    iput-boolean v0, p0, Ll/ۗۨܿ;->᩹:Z

    .line 373
    iget-object v0, p0, Ll/ۗۨܿ;->᩶:Landroid/media/ImageReader;

    sget-object v1, Ll/ۗۨܿ;->᩻֫:Landroid/os/Handler;

    invoke-virtual {v0, p0, v1}, Landroid/media/ImageReader;->setOnImageAvailableListener(Landroid/media/ImageReader$OnImageAvailableListener;Landroid/os/Handler;)V

    return-void
.end method

.method public static synthetic ܽ(Ll/ۗۨܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۗۨܿ;->ܿ()V

    return-void
.end method

.method private ܿ()V
    .locals 4

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Runnable;

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 252
    new-instance v1, Ll/᩸۬ܿ;

    const/4 v3, 0x2

    invoke-direct {v1, v3, p0}, Ll/᩸۬ܿ;-><init>(ILjava/lang/Object;)V

    aput-object v1, v0, v2

    .line 301
    iget-object v1, p0, Ll/ۗۨܿ;->ۙ:Ll/۠ۢۡ;

    invoke-virtual {v1}, Ll/۠ۢۡ;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 302
    invoke-direct {p0}, Ll/ۗۨܿ;->ܳ()V

    .line 303
    aget-object v0, v0, v2

    const-wide/16 v1, 0xf

    invoke-static {v0, v1, v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void

    .line 305
    :cond_0
    aget-object v0, v0, v2

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public static ܿ(Ll/ۗۨܿ;)V
    .locals 3

    .line 584
    sget-boolean v0, Ll/ۗۨܿ;->ۜ֫:Z

    if-eqz v0, :cond_0

    .line 283
    iget-boolean v0, p0, Ll/ۗۨܿ;->᩹:Z

    if-nez v0, :cond_0

    .line 284
    invoke-direct {p0}, Ll/ۗۨܿ;->ۧ()V

    .line 285
    invoke-direct {p0}, Ll/ۗۨܿ;->ܽ()V

    .line 286
    new-instance v0, Ll/᩵۫᩷;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Ll/᩵۫᩷;-><init>(ILjava/lang/Object;)V

    const-wide/16 v1, 0x1f4

    invoke-static {v1, v2, v0}, Ll/ۙ᩸᩷;->֫(JLjava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public static ᩳ()Z
    .locals 1

    .line 584
    sget-boolean v0, Ll/ۗۨܿ;->ۜ֫:Z

    return v0
.end method

.method public static synthetic ᩳ(Ll/ۗۨܿ;)Z
    .locals 2

    .line 336
    iget-object v0, p0, Ll/ۗۨܿ;->۟:Ll/ۡۨܿ;

    iget-object v1, p0, Ll/ۗۨܿ;->ۗ:Ll/۠ۢۡ;

    invoke-virtual {v1}, Ll/۠ۢۡ;->ۧ()F

    move-result v1

    iget-object p0, p0, Ll/ۗۨܿ;->ۗ:Ll/۠ۢۡ;

    invoke-virtual {p0}, Ll/۠ۢۡ;->ܽ()F

    move-result p0

    invoke-virtual {v0, v1, p0}, Ll/ۡۨܿ;->ۧ(FF)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ᩴ(Ll/ۗۨܿ;)Landroid/graphics/Point;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۨܿ;->ᩳ֫:Landroid/graphics/Point;

    return-object p0
.end method

.method public static ᩵(Ll/ۗۨܿ;)V
    .locals 7

    .line 484
    iget-object v0, p0, Ll/ۗۨܿ;->۫:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->left:I

    neg-int v1, v1

    .line 485
    iget v0, v0, Landroid/graphics/Rect;->top:I

    neg-int v0, v0

    .line 486
    invoke-static {}, Ll/۬ۨܿ;->ܳ()I

    move-result v2

    .line 487
    iget-object v3, p0, Ll/ۗۨܿ;->ܽ֫:Landroid/graphics/Point;

    iget v4, v3, Landroid/graphics/Point;->x:I

    iget v3, v3, Landroid/graphics/Point;->y:I

    const/high16 v5, 0x3f000000    # 0.5f

    const/high16 v6, 0x3fc00000    # 1.5f

    if-ge v4, v3, :cond_1

    .line 488
    iget v3, p0, Ll/ۗۨܿ;->ۨ:I

    div-int/lit8 v4, v2, 0x2

    sub-int/2addr v3, v4

    add-int/2addr v3, v1

    .line 489
    iget v1, p0, Ll/ۗۨܿ;->᩺:I

    int-to-float v1, v1

    int-to-float v2, v2

    mul-float v6, v6, v2

    sub-float v4, v1, v6

    float-to-int v4, v4

    add-int/2addr v4, v0

    if-gtz v4, :cond_0

    mul-float v2, v2, v5

    add-float/2addr v2, v1

    float-to-int v1, v2

    add-int v4, v1, v0

    .line 493
    :cond_0
    iget-object p0, p0, Ll/ۗۨܿ;->ۗ:Ll/۠ۢۡ;

    invoke-virtual {p0, v3, v4}, Ll/۠ۢۡ;->֫(II)V

    return-void

    .line 495
    :cond_1
    iget v3, p0, Ll/ۗۨܿ;->᩺:I

    div-int/lit8 v4, v2, 0x2

    sub-int/2addr v3, v4

    add-int/2addr v3, v0

    .line 496
    iget v0, p0, Ll/ۗۨܿ;->ۨ:I

    int-to-float v0, v0

    int-to-float v2, v2

    mul-float v6, v6, v2

    sub-float v4, v0, v6

    float-to-int v4, v4

    add-int/2addr v4, v1

    if-gtz v4, :cond_2

    mul-float v2, v2, v5

    add-float/2addr v2, v0

    float-to-int v0, v2

    add-int v4, v0, v1

    .line 500
    :cond_2
    iget-object p0, p0, Ll/ۗۨܿ;->ۗ:Ll/۠ۢۡ;

    invoke-virtual {p0, v4, v3}, Ll/۠ۢۡ;->֫(II)V

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ۗۨܿ;)Ll/۠ۢۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗۨܿ;->ۗ:Ll/۠ۢۡ;

    return-object p0
.end method

.method public static ᩻(Ll/ۗۨܿ;)V
    .locals 4

    .line 253
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 254
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 255
    iget-object v1, p0, Ll/ۗۨܿ;->ᩳ֫:Landroid/graphics/Point;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 256
    iget-object v1, p0, Ll/ۗۨܿ;->ܽ֫:Landroid/graphics/Point;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 515
    iget-object v0, p0, Ll/ۗۨܿ;->ܰ:Ll/ۜۨܿ;

    if-eqz v0, :cond_0

    .line 516
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    .line 521
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f07035c

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    .line 257
    :goto_0
    div-int/lit8 v0, v0, 0x2

    .line 258
    iget-object v2, p0, Ll/ۗۨܿ;->ۙ:Ll/۠ۢۡ;

    iget v3, v1, Landroid/graphics/Point;->x:I

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v3, v0

    iget v1, v1, Landroid/graphics/Point;->y:I

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v1, v0

    invoke-virtual {v2, v3, v1}, Ll/۠ۢۡ;->֫(II)V

    .line 259
    iget-object v0, p0, Ll/ۗۨܿ;->ۙ:Ll/۠ۢۡ;

    new-instance v1, Ll/֡ۨܿ;

    invoke-direct {v1, p0}, Ll/֡ۨܿ;-><init>(Ll/ۗۨܿ;)V

    invoke-virtual {v0, v1}, Ll/۠ۢۡ;->֫(Ll/֡ۨܿ;)V

    .line 280
    iget-object v0, p0, Ll/ۗۨܿ;->ۙ:Ll/۠ۢۡ;

    invoke-virtual {v0}, Ll/۠ۢۡ;->֫()V

    .line 281
    invoke-direct {p0}, Ll/ۗۨܿ;->ܽ()V

    .line 282
    new-instance v0, Ll/᩹᩶۠;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/᩹᩶۠;-><init>(ILjava/lang/Object;)V

    const-wide/16 v1, 0x1f4

    invoke-static {v1, v2, v0}, Ll/ۙ᩸᩷;->֫(JLjava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 404
    invoke-super {p0, p1}, Landroid/app/Service;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 405
    iget v0, p0, Ll/ۗۨܿ;->ۤ:I

    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    if-eq v0, p1, :cond_0

    .line 406
    iput p1, p0, Ll/ۗۨܿ;->ۤ:I

    .line 407
    invoke-direct {p0}, Ll/ۗۨܿ;->ܳ()V

    .line 408
    new-instance p1, Ll/ۜ֨ᩳ;

    const/4 v0, 0x2

    invoke-direct {p1, v0, p0}, Ll/ۜ֨ᩳ;-><init>(ILjava/lang/Object;)V

    const-wide/16 v0, 0x32

    invoke-static {p1, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    :cond_0
    return-void
.end method

.method public final onCreate()V
    .locals 5

    .line 204
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 205
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    iput v0, p0, Ll/ۗۨܿ;->ۤ:I

    .line 206
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    const-string v2, "MT_COLOR_PICKER"

    if-lt v0, v1, :cond_0

    const-string v0, "notification"

    .line 207
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    .line 208
    new-instance v1, Landroid/app/NotificationChannel;

    const v1, 0x7f1201a3

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Landroid/app/NotificationChannel;

    const/4 v4, 0x3

    invoke-direct {v3, v2, v1, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 209
    invoke-virtual {v0, v3}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 228
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lbin/mt/plus/Main;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "android.intent.action.MAIN"

    .line 229
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.category.LAUNCHER"

    .line 230
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v1, 0x4000000

    const/4 v3, 0x0

    .line 231
    invoke-static {p0, v3, v0, v1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 232
    new-instance v1, Ll/᩷᩶;

    invoke-direct {v1, p0, v2}, Ll/᩷᩶;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 233
    invoke-virtual {v1}, Ll/᩷᩶;->ܳ()V

    const v2, 0x7f1208ea

    .line 234
    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/᩷᩶;->֫(Ljava/lang/String;)V

    .line 235
    invoke-virtual {v1, v0}, Ll/᩷᩶;->֫(Landroid/app/PendingIntent;)V

    .line 236
    invoke-virtual {v1}, Ll/᩷᩶;->ܽ()V

    .line 237
    invoke-virtual {v1, v3}, Ll/᩷᩶;->֫(Z)V

    .line 238
    invoke-virtual {v1}, Ll/᩷᩶;->֫()Landroid/app/Notification;

    move-result-object v0

    const/16 v1, 0x3e9

    .line 212
    invoke-virtual {p0, v1, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 214
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d01d1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/۠ۢۡ;

    iput-object v0, p0, Ll/ۗۨܿ;->ۙ:Ll/۠ۢۡ;

    .line 215
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d01d2

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/۠ۢۡ;

    iput-object v0, p0, Ll/ۗۨܿ;->ۗ:Ll/۠ۢۡ;

    .line 216
    iget-object v0, p0, Ll/ۗۨܿ;->ۙ:Ll/۠ۢۡ;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۜۨܿ;

    iput-object v0, p0, Ll/ۗۨܿ;->ܰ:Ll/ۜۨܿ;

    .line 217
    iget-object v0, p0, Ll/ۗۨܿ;->ۗ:Ll/۠ۢۡ;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۡۨܿ;

    iput-object v0, p0, Ll/ۗۨܿ;->۟:Ll/ۡۨܿ;

    .line 218
    iget-object v1, p0, Ll/ۗۨܿ;->ۗ:Ll/۠ۢۡ;

    const v2, 0x7f0a0397

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Ll/ۡۨܿ;->֫(Landroid/widget/TextView;)V

    .line 310
    iget-object v0, p0, Ll/ۗۨܿ;->ۙ:Ll/۠ۢۡ;

    invoke-virtual {v0}, Ll/۠ۢۡ;->ܿ()V

    const/4 v0, 0x2

    new-array v1, v0, [I

    .line 313
    iget-object v2, p0, Ll/ۗۨܿ;->ۙ:Ll/۠ۢۡ;

    new-instance v4, Ll/᩶ۨܿ;

    invoke-direct {v4, p0, v1}, Ll/᩶ۨܿ;-><init>(Ll/ۗۨܿ;[I)V

    invoke-virtual {v2, v4}, Ll/۠ۢۡ;->֫(Ll/ۚۢۡ;)V

    .line 319
    iget-object v2, p0, Ll/ۗۨܿ;->ۙ:Ll/۠ۢۡ;

    new-instance v4, Ll/ۨ֨ܳ;

    invoke-direct {v4, p0, v1}, Ll/ۨ֨ܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v4}, Ll/۠ۢۡ;->֫(Ll/֡ۢۡ;)V

    .line 328
    invoke-static {}, Ll/۬ۨܿ;->ܳ()I

    move-result v1

    :goto_0
    if-ge v3, v0, :cond_1

    .line 330
    iget-object v2, p0, Ll/ۗۨܿ;->ۗ:Ll/۠ۢۡ;

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 331
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    .line 332
    iput v1, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v1, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 333
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 335
    :cond_1
    iget-object v0, p0, Ll/ۗۨܿ;->ۗ:Ll/۠ۢۡ;

    new-instance v1, Ll/᩵֨᩷;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0}, Ll/᩵֨᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 336
    iget-object v0, p0, Ll/ۗۨܿ;->ۗ:Ll/۠ۢۡ;

    new-instance v1, Ll/᩵ۨܿ;

    invoke-direct {v1, p0}, Ll/᩵ۨܿ;-><init>(Ll/ۗۨܿ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 337
    iget-object v0, p0, Ll/ۗۨܿ;->ۗ:Ll/۠ۢۡ;

    invoke-virtual {v0}, Ll/۠ۢۡ;->ܿ()V

    .line 339
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 340
    iget-object v1, p0, Ll/ۗۨܿ;->ۗ:Ll/۠ۢۡ;

    new-instance v2, Ll/ۙۨܿ;

    invoke-direct {v2, p0, v0}, Ll/ۙۨܿ;-><init>(Ll/ۗۨܿ;Landroid/graphics/Point;)V

    invoke-virtual {v1, v2}, Ll/۠ۢۡ;->֫(Ll/ۚۢۡ;)V

    .line 347
    iget-object v1, p0, Ll/ۗۨܿ;->ۗ:Ll/۠ۢۡ;

    new-instance v2, Ll/ۚ֨᩷;

    invoke-direct {v2, p0, v0}, Ll/ۚ֨᩷;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ll/۠ۢۡ;->֫(Ll/֡ۢۡ;)V

    const/4 v0, 0x1

    .line 221
    sput-boolean v0, Ll/ۗۨܿ;->ۜ֫:Z

    .line 222
    new-instance v0, Landroid/content/Intent;

    const-string v1, "ScreenColorPicker.ACTION_START"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V

    .line 140
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "ScreenColorPickerConfig.ACTION_CONFIG_CHANGED"

    .line 141
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 142
    iget-object v1, p0, Ll/ۗۨܿ;->᩸:Landroid/content/BroadcastReceiver;

    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method public final onDestroy()V
    .locals 2

    .line 414
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 415
    invoke-direct {p0}, Ll/ۗۨܿ;->ܳ()V

    const/4 v0, 0x0

    .line 416
    sput-boolean v0, Ll/ۗۨܿ;->ۜ֫:Z

    .line 417
    new-instance v0, Landroid/content/Intent;

    const-string v1, "ScreenColorPicker.ACTION_STOP"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V

    .line 418
    sget v0, Ll/۬ۨܿ;->֫:I

    .line 146
    iget-object v0, p0, Ll/ۗۨܿ;->᩸:Landroid/content/BroadcastReceiver;

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x1

    .line 419
    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(Z)V

    return-void
.end method

.method public final onImageAvailable(Landroid/media/ImageReader;)V
    .locals 18

    move-object/from16 v0, p0

    .line 530
    invoke-virtual/range {p1 .. p1}, Landroid/media/ImageReader;->acquireNextImage()Landroid/media/Image;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    .line 534
    :cond_0
    iget-boolean v2, v0, Ll/ۗۨܿ;->᩹:Z

    const/4 v3, 0x1

    if-nez v2, :cond_1

    .line 535
    iput-boolean v3, v0, Ll/ۗۨܿ;->᩹:Z

    .line 537
    :cond_1
    iget-object v2, v0, Ll/ۗۨܿ;->ۛ:[I

    .line 538
    iget-object v4, v0, Ll/ۗۨܿ;->ۙ:Ll/۠ۢۡ;

    invoke-virtual {v4, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 539
    iget v2, v0, Ll/ۗۨܿ;->ۨ:I

    .line 540
    iget v4, v0, Ll/ۗۨܿ;->᩺:I

    const/4 v5, 0x0

    if-gez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_0

    .line 543
    :cond_2
    invoke-virtual {v1}, Landroid/media/Image;->getWidth()I

    move-result v6

    if-lt v2, v6, :cond_3

    .line 544
    invoke-virtual {v1}, Landroid/media/Image;->getWidth()I

    move-result v2

    sub-int/2addr v2, v3

    :cond_3
    :goto_0
    if-gez v4, :cond_4

    const/4 v4, 0x0

    goto :goto_1

    .line 548
    :cond_4
    invoke-virtual {v1}, Landroid/media/Image;->getHeight()I

    move-result v6

    if-lt v4, v6, :cond_5

    .line 549
    invoke-virtual {v1}, Landroid/media/Image;->getHeight()I

    move-result v4

    sub-int/2addr v4, v3

    .line 551
    :cond_5
    :goto_1
    iget-object v6, v0, Ll/ۗۨܿ;->ܰ:Ll/ۜۨܿ;

    invoke-virtual {v6}, Ll/ۜۨܿ;->֫()I

    move-result v6

    sub-int v7, v2, v6

    sub-int v8, v4, v6

    add-int v9, v2, v6

    add-int/2addr v9, v3

    add-int/2addr v6, v4

    add-int/2addr v6, v3

    .line 552
    iget-object v3, v0, Ll/ۗۨܿ;->֫֫:Landroid/graphics/Rect;

    invoke-virtual {v3, v7, v8, v9, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 553
    iget-object v6, v0, Ll/ۗۨܿ;->۟:Ll/ۡۨܿ;

    .line 558
    invoke-virtual {v1}, Landroid/media/Image;->getWidth()I

    move-result v7

    .line 559
    invoke-virtual {v1}, Landroid/media/Image;->getHeight()I

    move-result v8

    .line 560
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v9

    .line 561
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v10

    .line 562
    sget-object v11, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v9, v10, v11}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v11

    .line 563
    invoke-virtual {v1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v12

    aget-object v12, v12, v5

    .line 564
    invoke-virtual {v12}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v13

    .line 565
    invoke-virtual {v12}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v14

    .line 566
    invoke-virtual {v12}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v12

    const/4 v15, 0x0

    :goto_2
    if-ge v15, v10, :cond_9

    :goto_3
    if-ge v5, v9, :cond_8

    .line 569
    iget v0, v3, Landroid/graphics/Rect;->left:I

    add-int/2addr v0, v5

    move/from16 p1, v9

    .line 570
    iget v9, v3, Landroid/graphics/Rect;->top:I

    add-int/2addr v9, v15

    if-ltz v0, :cond_7

    if-ge v0, v7, :cond_7

    if-ltz v9, :cond_7

    if-lt v9, v8, :cond_6

    goto :goto_4

    :cond_6
    mul-int v9, v9, v14

    mul-int v0, v0, v12

    add-int/2addr v0, v9

    .line 574
    invoke-virtual {v13, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 575
    invoke-virtual {v13}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    const/16 v9, 0xff

    and-int/2addr v0, v9

    move-object/from16 v16, v3

    invoke-virtual {v13}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    and-int/2addr v3, v9

    move/from16 v17, v7

    invoke-virtual {v13}, Ljava/nio/ByteBuffer;->get()B

    move-result v7

    and-int/2addr v7, v9

    invoke-static {v9, v0, v3, v7}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    .line 576
    invoke-virtual {v11, v5, v15, v0}, Landroid/graphics/Bitmap;->setPixel(III)V

    goto :goto_5

    :cond_7
    :goto_4
    move-object/from16 v16, v3

    move/from16 v17, v7

    const/4 v0, 0x0

    .line 572
    invoke-virtual {v11, v5, v15, v0}, Landroid/graphics/Bitmap;->setPixel(III)V

    :goto_5
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v0, p0

    move/from16 v9, p1

    move-object/from16 v3, v16

    move/from16 v7, v17

    goto :goto_3

    :cond_8
    move-object/from16 v16, v3

    move/from16 v17, v7

    move/from16 p1, v9

    add-int/lit8 v15, v15, 0x1

    const/4 v5, 0x0

    move-object/from16 v0, p0

    goto :goto_2

    .line 553
    :cond_9
    invoke-virtual {v6, v11, v2, v4}, Ll/ۡۨܿ;->֫(Landroid/graphics/Bitmap;II)V

    .line 554
    invoke-virtual {v1}, Landroid/media/Image;->close()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 12

    const/4 p2, 0x0

    const/4 p3, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, 0x4593ae48

    sget v7, Ll/֨᩺;->ۨ֨۬:I

    sget v8, Ll/֡᩶;->ܳܶ۠:I

    const-string v9, "\u073d\u06e0"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0xb5d

    const v11, -0x22b4ad53

    xor-int/2addr v10, v11

    const v11, 0x74f1e1ec

    :goto_0
    xor-int/2addr v9, v11

    xor-int/2addr v6, v8

    mul-int/lit16 v6, v6, -0x7469

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    invoke-static {v3, v4, v5, v2}, Ll/֨ۡ;->ۤܿۢ([SIII)Ljava/lang/String;

    move-result-object p2

    .line 244
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    .line 228
    sget-boolean v9, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v9, :cond_1

    goto/16 :goto_3

    .line 127
    :sswitch_0
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    sget v9, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v9, :cond_2

    goto/16 :goto_4

    .line 126
    :sswitch_1
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    sget-boolean v9, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v9, :cond_c

    goto/16 :goto_2

    .line 208
    :sswitch_2
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    sget v9, Ll/ۖ;->᩹۟ۘ:I

    if-gez v9, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v9, "\u06dc\u1a73"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x1829

    const v11, -0x176f96b3

    xor-int/2addr v10, v11

    const v11, 0x5f95f082

    goto :goto_0

    .line 94
    :sswitch_3
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    goto/16 :goto_2

    .line 127
    :sswitch_4
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    const/4 p1, 0x0

    return p1

    .line 244
    :sswitch_5
    check-cast p2, Landroid/content/Intent;

    iput-object p2, p0, Ll/ۗۨܿ;->ۧ֫:Landroid/content/Intent;

    .line 245
    invoke-direct {p0}, Ll/ۗۨܿ;->ܿ()V

    const/4 p1, 0x2

    return p1

    :cond_1
    const-string v9, "\u1a7a\u06d9"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x4c55

    const v11, -0x5e5441d9

    xor-int/2addr v10, v11

    const v11, -0x595c4ec6

    goto :goto_0

    .line 0
    :sswitch_6
    sget-object v3, Ll/ۗۨܿ;->ۙ۬᩹:[S

    const/4 v4, 0x1

    const/4 v5, 0x4

    sget v9, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v9, :cond_3

    :cond_2
    const-string v9, "\u06eb\u1a75"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x7f55

    const v11, -0x7baf5d45

    xor-int/2addr v10, v11

    const v11, 0x31168944

    goto/16 :goto_0

    :cond_3
    const-string v9, "\u06d8\u06e0"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x25ed

    const v11, -0x5146bb4

    xor-int/2addr v10, v11

    const v11, -0x7ec48021

    goto/16 :goto_0

    :sswitch_7
    const/16 v2, 0x73ed

    goto :goto_1

    :sswitch_8
    const v2, 0x9f67

    :goto_1
    const-string v9, "\u05a1\u05ab"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x1d

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x33df

    const v11, 0x10eaf3e2

    xor-int/2addr v10, v11

    const v11, 0x2628caa1

    goto/16 :goto_0

    :sswitch_9
    const v9, 0x6d8351

    add-int/2addr v9, v1

    sub-int/2addr v9, v0

    if-ltz v9, :cond_4

    const-string v9, "\u1a75\u06d9"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x6673

    const v11, -0x28b4c161

    xor-int/2addr v10, v11

    const v11, 0x3221b1e0

    goto/16 :goto_0

    :cond_4
    const-string v9, "\u0733\u06d6"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x1251

    const v11, 0x2ceed00f

    xor-int/2addr v10, v11

    const v11, 0x20f4b745

    goto/16 :goto_0

    :sswitch_a
    mul-int/lit16 v0, p3, 0x14ee

    mul-int v1, p3, p3

    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v9

    if-eqz v9, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v9, "\u06db\u1a78"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x6a41

    const v11, 0x165cf4c8

    xor-int/2addr v10, v11

    const v11, 0x6b0a14a5

    goto/16 :goto_0

    :sswitch_b
    sget-object p3, Ll/ۗۨܿ;->ۙ۬᩹:[S

    const/4 v9, 0x0

    aget-short p3, p3, v9

    sget v9, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v9, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v9, "\u06e7\u073d"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x163b

    const v11, 0x45e2cad

    xor-int/2addr v10, v11

    const v11, 0x5615e0e3

    goto/16 :goto_0

    .line 243
    :sswitch_c
    sget v9, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v9, :cond_7

    goto :goto_2

    :cond_7
    const-string v9, "\u1a78\u06d6"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, 0x71

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x214d

    const v11, 0x1cf87166

    xor-int/2addr v10, v11

    const v11, -0x4f5e530e

    goto/16 :goto_0

    .line 26
    :sswitch_d
    sget-boolean v9, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v9, :cond_8

    goto :goto_3

    :cond_8
    const-string v9, "\u06e1\u1a75"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x3033

    const v11, -0x6df5a202

    xor-int/2addr v10, v11

    const v11, -0x3136af9f

    goto/16 :goto_0

    .line 43
    :sswitch_e
    sget v9, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v9, :cond_9

    :goto_2
    const-string v9, "\u06d6\u073f"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x61

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x443b

    const v11, -0x1d59d751

    xor-int/2addr v10, v11

    const v11, -0x791c9127

    goto/16 :goto_0

    :cond_9
    const-string v9, "\u1a73\u1a74"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x663d

    const v11, 0x79342e9d

    xor-int/2addr v10, v11

    const v11, -0x36c689bc    # -759652.25f

    goto/16 :goto_0

    .line 197
    :sswitch_f
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v9

    if-nez v9, :cond_a

    goto :goto_4

    :cond_a
    const-string v9, "\u06ec\u1a78"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x72db

    const v11, -0x466ac039

    xor-int/2addr v10, v11

    const v11, -0x2a2b376c

    goto/16 :goto_0

    .line 148
    :sswitch_10
    sget v9, Ll/۟;->ۗۤۛ:I

    if-eqz v9, :cond_b

    :goto_3
    const-string v9, "\u06eb\u1a7a"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x3ed5

    const v11, -0x2189ba28

    xor-int/2addr v10, v11

    const v11, -0x5cd1f4eb

    goto/16 :goto_0

    :cond_b
    const-string v9, "\u06da\u06d9"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x5b

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x5c93

    const v11, 0x795b0506

    xor-int/2addr v10, v11

    const v11, 0x22b99158

    goto/16 :goto_0

    .line 203
    :sswitch_11
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v9

    if-eqz v9, :cond_d

    :cond_c
    :goto_4
    const-string v9, "\u073a\u1a76"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x6f

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x376f

    const v11, 0x5e0c5073

    xor-int/2addr v10, v11

    const v11, -0x675eefe2

    goto/16 :goto_0

    :cond_d
    const-string v9, "\u06d9\u073a"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x2f

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x589f

    const v11, 0x56e46dd1

    xor-int/2addr v10, v11

    const v11, 0x6ea4d13e

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7eecb568 -> :sswitch_a
        -0x716e3a39 -> :sswitch_9
        -0x7135a6ee -> :sswitch_b
        -0x6d8807c1 -> :sswitch_3
        -0x6c75289d -> :sswitch_d
        -0x6b86af6d -> :sswitch_c
        -0x69e11df4 -> :sswitch_e
        -0x6037490f -> :sswitch_6
        -0x4f43c448 -> :sswitch_4
        -0x2fc19689 -> :sswitch_0
        -0x25ab0fdc -> :sswitch_4
        -0x1f1bdf92 -> :sswitch_0
        -0x1bfaf7d2 -> :sswitch_7
        -0x1a95aecf -> :sswitch_5
        -0x1a499551 -> :sswitch_6
        0xb120ecd -> :sswitch_8
        0xcafa799 -> :sswitch_2
        0x14abad49 -> :sswitch_10
        0x15dfe641 -> :sswitch_a
        0x1aefd83f -> :sswitch_c
        0x1c5fc401 -> :sswitch_3
        0x1cb2d2e5 -> :sswitch_10
        0x1e2e8f25 -> :sswitch_f
        0x217d1f87 -> :sswitch_5
        0x31ba151e -> :sswitch_9
        0x3507dbc4 -> :sswitch_2
        0x373bdd3b -> :sswitch_11
        0x4d13253b -> :sswitch_1
        0x4d721516 -> :sswitch_f
        0x57affd21 -> :sswitch_e
        0x5bbc1b24 -> :sswitch_b
        0x62c6993b -> :sswitch_11
        0x6ba696e8 -> :sswitch_1
        0x6d9488a7 -> :sswitch_d
        0x71e85170 -> :sswitch_8
        0x7a44be00 -> :sswitch_7
    .end sparse-switch
.end method
