.class public Ll/ۜܰܿ;
.super Landroid/view/View;
.source "D5GW"


# instance fields
.field public ֫֫:J

.field public final ۗ:Ll/ۧܰܿ;

.field public final ۙ:Ll/ۤ᩺ܿ;

.field public ۛ:I

.field public final ۜ֫:I

.field public ۟:J

.field public ۡ֫:Z

.field public ۢ֫:Z

.field public ۤ:Ll/ܿܰܿ;

.field public ۧ֫:J

.field public final ۨ:Ll/ۙܰܿ;

.field public ۫:Ll/֨ۛ;

.field public final ۬:Ll/۟᩶ܿ;

.field public ܰ:Ll/ᩴ۟ܿ;

.field public ܳ֫:Z

.field public ܽ֫:I

.field public ܿ֫:F

.field public ᩳ֫:F

.field public ᩶:I

.field public ᩷֫:J

.field public ᩸:Ll/ܽܰܿ;

.field public ᩹:Ll/ܳܰܿ;

.field public ᩺:Ll/ۚܰܿ;

.field public ᩻֫:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 91
    invoke-direct {p0, p1, p2, v0}, Ll/ۜܰܿ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 95
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 59
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide p2

    iput-wide p2, p0, Ll/ۜܰܿ;->۟:J

    const-wide/16 p2, 0x0

    .line 64
    iput-wide p2, p0, Ll/ۜܰܿ;->ۧ֫:J

    .line 76
    iput-wide p2, p0, Ll/ۜܰܿ;->֫֫:J

    const/4 p2, 0x0

    .line 98
    invoke-virtual {p0, p2}, Landroid/view/View;->setSaveEnabled(Z)V

    const/4 p2, 0x1

    .line 99
    invoke-virtual {p0, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 100
    invoke-virtual {p0, p2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 102
    new-instance p2, Ll/ܿܰܿ;

    invoke-direct {p2, p0}, Ll/ܿܰܿ;-><init>(Ll/ۜܰܿ;)V

    iput-object p2, p0, Ll/ۜܰܿ;->ۤ:Ll/ܿܰܿ;

    .line 104
    new-instance p2, Ll/ᩴ۟ܿ;

    invoke-direct {p2, p1}, Ll/ᩴ۟ܿ;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Ll/ۜܰܿ;->ܰ:Ll/ᩴ۟ܿ;

    .line 105
    new-instance p2, Ll/ᩳܰܿ;

    invoke-direct {p2, p0, p1}, Ll/ᩳܰܿ;-><init>(Ll/ۜܰܿ;Landroid/content/Context;)V

    .line 106
    new-instance p3, Ll/֨ۛ;

    invoke-direct {p3, p1, p2}, Ll/֨ۛ;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p3, p0, Ll/ۜܰܿ;->۫:Ll/֨ۛ;

    .line 107
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledOverflingDistance()I

    move-result p1

    iput p1, p0, Ll/ۜܰܿ;->ۜ֫:I

    .line 109
    new-instance p1, Ll/ۧܰܿ;

    invoke-direct {p1, p0}, Ll/ۧܰܿ;-><init>(Ll/ۜܰܿ;)V

    iput-object p1, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    .line 115
    new-instance p2, Ll/ۤ᩺ܿ;

    invoke-direct {p2, p0, p1}, Ll/ۤ᩺ܿ;-><init>(Ll/ۜܰܿ;Ll/ۧܰܿ;)V

    iput-object p2, p0, Ll/ۜܰܿ;->ۙ:Ll/ۤ᩺ܿ;

    .line 116
    new-instance p1, Ll/ۙܰܿ;

    invoke-direct {p1, p0}, Ll/ۙܰܿ;-><init>(Ll/ۜܰܿ;)V

    iput-object p1, p0, Ll/ۜܰܿ;->ۨ:Ll/ۙܰܿ;

    .line 117
    new-instance p1, Ll/۟᩶ܿ;

    invoke-direct {p1, p0}, Ll/۟᩶ܿ;-><init>(Landroid/view/View;)V

    const/16 p2, 0xdac

    .line 118
    invoke-virtual {p1, p2}, Ll/۟᩶ܿ;->ۧ(I)V

    new-instance p2, Ll/ܰ᩺ۡ;

    invoke-direct {p2, p0}, Ll/ܰ᩺ۡ;-><init>(Ljava/lang/Object;)V

    .line 119
    invoke-virtual {p1, p2}, Ll/۟᩶ܿ;->֫(Ll/ܰ᩶ܿ;)V

    iput-object p1, p0, Ll/ۜܰܿ;->۬:Ll/۟᩶ܿ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۜܰܿ;)Ll/ᩴ۟ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜܰܿ;->ܰ:Ll/ᩴ۟ܿ;

    return-object p0
.end method

.method private ֫(IZ)V
    .locals 13

    const/4 v0, 0x1

    .line 527
    iget-object v1, p0, Ll/ۜܰܿ;->ۤ:Ll/ܿܰܿ;

    if-eqz v1, :cond_0

    .line 528
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 529
    :cond_0
    iget-object v1, p0, Ll/ۜܰܿ;->۬:Ll/۟᩶ܿ;

    invoke-virtual {v1}, Ll/۟᩶ܿ;->ᩳ()V

    .line 930
    iget-object v2, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v2}, Ll/ۧܰܿ;->ۡ()Z

    move-result v3

    const v4, 0x7f120600

    if-eqz v3, :cond_1

    .line 532
    invoke-virtual {v1, v4}, Ll/۟᩶ܿ;->֫(I)V

    const v3, 0x1040001

    .line 533
    invoke-virtual {v1, v3}, Ll/۟᩶ܿ;->֫(I)V

    const v3, 0x7f1205c3

    .line 534
    invoke-virtual {v1, v3}, Ll/۟᩶ܿ;->֫(I)V

    .line 535
    invoke-direct {p0}, Ll/ۜܰܿ;->ܺ()Z

    move-result v3

    if-nez v3, :cond_2

    const v3, 0x7f1205ca

    .line 536
    invoke-virtual {v1, v3}, Ll/۟᩶ܿ;->֫(I)V

    const v3, 0x7f1205de

    .line 537
    invoke-virtual {v1, v3}, Ll/۟᩶ܿ;->֫(I)V

    goto :goto_0

    .line 540
    :cond_1
    invoke-virtual {v1, v4}, Ll/۟᩶ܿ;->֫(I)V

    .line 541
    :cond_2
    :goto_0
    invoke-direct {p0}, Ll/ۜܰܿ;->ܺ()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-static {}, Ll/ۧܰܿ;->᩶()Z

    move-result v3

    if-eqz v3, :cond_3

    const v3, 0x104000b

    .line 542
    invoke-virtual {v1, v3}, Ll/۟᩶ܿ;->֫(I)V

    .line 545
    :cond_3
    new-instance v3, Ll/ۨ۟ܿ;

    .line 3
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    const/4 v4, 0x0

    .line 546
    iget-object v5, p0, Ll/ۜܰܿ;->ۨ:Ll/ۙܰܿ;

    const/4 v6, -0x1

    if-ne p1, v6, :cond_8

    .line 548
    invoke-virtual {v5, v3}, Ll/ۙܰܿ;->֫(Ll/ۨ۟ܿ;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 550
    iget p1, v3, Ll/ۨ۟ܿ;->ۧ:I

    iget v2, v3, Ll/ۨ۟ܿ;->ܽ:I

    add-int/2addr p1, v2

    div-int/lit8 p1, p1, 0x2

    add-int/2addr p1, v0

    iput p1, v3, Ll/ۨ۟ܿ;->ܽ:I

    const/4 p1, -0x2

    goto :goto_2

    .line 922
    :cond_4
    invoke-virtual {v2}, Ll/ۧܰܿ;->᩷()I

    move-result p1

    .line 926
    invoke-virtual {v2}, Ll/ۧܰܿ;->ۜ()I

    move-result v2

    .line 555
    invoke-virtual {v5, p1, v3, v4}, Ll/ۙܰܿ;->֫(ILl/ۨ۟ܿ;Z)V

    .line 556
    iget-wide v7, v3, Ll/ۨ۟ܿ;->ᩳ:J

    .line 323
    iget-wide v9, p0, Ll/ۜܰܿ;->᩷֫:J

    sub-long/2addr v7, v9

    const-wide/16 v11, 0x0

    cmp-long v4, v7, v11

    if-ltz v4, :cond_5

    .line 556
    iget-wide v7, v3, Ll/ۨ۟ܿ;->֫:J

    sub-long/2addr v7, v9

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-long v9, v4

    cmp-long v4, v7, v9

    if-lez v4, :cond_8

    :cond_5
    if-eq p1, v2, :cond_7

    .line 559
    invoke-virtual {v5, v2, v3, v0}, Ll/ۙܰܿ;->֫(ILl/ۨ۟ܿ;Z)V

    .line 560
    iget-wide v7, v3, Ll/ۨ۟ܿ;->ᩳ:J

    .line 323
    iget-wide v9, p0, Ll/ۜܰܿ;->᩷֫:J

    sub-long/2addr v7, v9

    cmp-long p1, v7, v11

    if-ltz p1, :cond_7

    .line 560
    iget-wide v7, v3, Ll/ۨ۟ܿ;->֫:J

    sub-long/2addr v7, v9

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-long v9, p1

    cmp-long p1, v7, v9

    if-lez p1, :cond_6

    goto :goto_1

    :cond_6
    const/4 p1, 0x0

    goto :goto_3

    :cond_7
    :goto_1
    const/4 p1, -0x1

    :cond_8
    :goto_2
    const/4 v2, 0x1

    move v2, p1

    const/4 p1, 0x1

    :goto_3
    if-eq v2, v6, :cond_f

    if-ltz v2, :cond_9

    .line 571
    invoke-virtual {v5, v2, v3, p2}, Ll/ۙܰܿ;->֫(ILl/ۨ۟ܿ;Z)V

    .line 572
    :cond_9
    iget-object p2, p0, Ll/ۜܰܿ;->ۙ:Ll/ۤ᩺ܿ;

    if-nez p1, :cond_a

    .line 573
    iget-wide v4, v3, Ll/ۨ۟ܿ;->֫:J

    .line 323
    iget-wide v6, p0, Ll/ۜܰܿ;->᩷֫:J

    sub-long/2addr v4, v6

    .line 573
    invoke-virtual {v1}, Ll/۟᩶ܿ;->ۧ()I

    move-result v2

    int-to-long v6, v2

    add-long/2addr v4, v6

    iget-object v2, p2, Ll/ۤ᩺ܿ;->ۗ:Landroid/graphics/drawable/Drawable;

    .line 574
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    int-to-long v6, v2

    add-long/2addr v4, v6

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-long v6, v2

    cmp-long v2, v4, v6

    if-lez v2, :cond_b

    goto :goto_4

    .line 576
    :cond_a
    iget-wide v4, v3, Ll/ۨ۟ܿ;->ᩳ:J

    .line 323
    iget-wide v6, p0, Ll/ۜܰܿ;->᩷֫:J

    sub-long/2addr v4, v6

    .line 576
    invoke-virtual {v1}, Ll/۟᩶ܿ;->ۧ()I

    move-result v0

    int-to-long v6, v0

    cmp-long v0, v4, v6

    if-gez v0, :cond_b

    const/4 v0, 0x0

    goto :goto_4

    :cond_b
    move v0, p1

    :goto_4
    if-eqz v0, :cond_d

    .line 579
    iget p1, v3, Ll/ۨ۟ܿ;->ܽ:I

    iget-wide v2, v3, Ll/ۨ۟ܿ;->ᩳ:J

    .line 323
    iget-wide v4, p0, Ll/ۜܰܿ;->᩷֫:J

    sub-long/2addr v2, v4

    long-to-int p2, v2

    int-to-long v4, p2

    cmp-long v0, v2, v4

    if-nez v0, :cond_c

    .line 579
    invoke-virtual {v1, p1, p2}, Ll/۟᩶ܿ;->֫(II)V

    return-void

    .line 0
    :cond_c
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    .line 583
    :cond_d
    iget p1, v3, Ll/ۨ۟ܿ;->ܽ:I

    iget-wide v2, v3, Ll/ۨ۟ܿ;->֫:J

    .line 323
    iget-wide v4, p0, Ll/ۜܰܿ;->᩷֫:J

    sub-long/2addr v2, v4

    .line 586
    invoke-virtual {v1}, Ll/۟᩶ܿ;->ۧ()I

    move-result v0

    int-to-long v4, v0

    add-long/2addr v2, v4

    iget-object p2, p2, Ll/ۤ᩺ܿ;->ۗ:Landroid/graphics/drawable/Drawable;

    .line 587
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p2

    int-to-long v4, p2

    add-long/2addr v2, v4

    long-to-int p2, v2

    int-to-long v4, p2

    cmp-long v0, v2, v4

    if-nez v0, :cond_e

    .line 583
    invoke-virtual {v1, p1, p2}, Ll/۟᩶ܿ;->֫(II)V

    return-void

    .line 0
    :cond_e
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    .line 590
    :cond_f
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    .line 591
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p2

    invoke-virtual {v1}, Ll/۟᩶ܿ;->ۧ()I

    move-result v0

    add-int/2addr v0, p2

    div-int/lit8 v0, v0, 0x2

    .line 590
    invoke-virtual {v1, p1, v0}, Ll/۟᩶ܿ;->֫(II)V

    return-void
.end method

.method public static ֫(Ll/ۜܰܿ;Landroid/view/MenuItem;)V
    .locals 5

    .line 121
    iget-object v0, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    :try_start_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v1, 0x7f1205de

    const v2, 0x7f1205ca

    const v3, 0x7f1207a7

    if-eq p1, v2, :cond_0

    if-ne p1, v1, :cond_1

    .line 124
    :cond_0
    invoke-direct {p0}, Ll/ۜܰܿ;->ܺ()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 125
    invoke-static {v3}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    :cond_1
    if-ne p1, v2, :cond_2

    const/4 p1, 0x0

    .line 129
    invoke-virtual {v0, p1}, Ll/ۧܰܿ;->֫([B)V

    goto/16 :goto_0

    :cond_2
    if-ne p1, v1, :cond_3

    .line 131
    invoke-virtual {v0}, Ll/ۧܰܿ;->۠()V

    goto/16 :goto_0

    :cond_3
    const v1, 0x1040001

    if-ne p1, v1, :cond_6

    .line 23
    invoke-virtual {v0}, Ll/ۧܰܿ;->ۢ()Z

    move-result p1

    if-eqz p1, :cond_4

    const p1, 0x7f120431

    .line 25
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    goto/16 :goto_0

    .line 28
    :cond_4
    invoke-virtual {p0}, Ll/ۜܰܿ;->ۢ()Ll/ܳܰܿ;

    move-result-object p1

    if-nez p1, :cond_5

    .line 30
    invoke-static {v3}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    goto/16 :goto_0

    .line 33
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 34
    new-instance v1, Ll/ܽ۟ܿ;

    .line 114
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v2, Ll/ۧ۟ܿ;

    invoke-direct {v2, v1, p0, v0, p1}, Ll/ۧ۟ܿ;-><init>(Ll/ܽ۟ܿ;Ll/ۜܰܿ;Landroid/content/Context;Ll/ܳܰܿ;)V

    .line 103
    invoke-virtual {v2}, Ll/۟ܶۡ;->᩻()V

    goto :goto_0

    :cond_6
    const v0, 0x7f1205c3

    if-ne p1, v0, :cond_8

    .line 135
    sget p1, Ll/ۢ᩺ܿ;->֫:I

    .line 34
    invoke-static {p0}, Ll/ᩳ᩺ܿ;->ۧ(Ll/ۜܰܿ;)Ll/ᩳ᩺ܿ;

    move-result-object p1

    if-nez p1, :cond_7

    goto :goto_0

    .line 38
    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 39
    sget v1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v1, Ll/᩵ۚۢ;

    invoke-direct {v1, v0}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 39
    new-instance v0, Ll/۫ۨܿ;

    invoke-direct {v0, p0, p1}, Ll/۫ۨܿ;-><init>(Ll/ۜܰܿ;Ll/ᩳ᩺ܿ;)V

    const p1, 0x7f030009

    .line 40
    invoke-virtual {v1, p1, v0}, Ll/᩵ۚۢ;->֫(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 42
    invoke-virtual {v1}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ll/֡ۚۢ;->ܳ()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setDimAmount(F)V

    .line 44
    invoke-virtual {p1}, Ll/֡ۚۢ;->᩷()V

    goto :goto_0

    :cond_8
    const v0, 0x7f120600

    if-ne p1, v0, :cond_9

    .line 137
    invoke-static {p0}, Ll/᩸֫ܳ;->֫(Ll/ۜܰܿ;)V

    goto :goto_0

    :cond_9
    const v0, 0x104000b

    if-ne p1, v0, :cond_b

    .line 23
    new-instance p1, Ll/ۢ۟ܿ;

    .line 137
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ll/ۡ۟ܿ;

    invoke-direct {v0, p0}, Ll/ۡ۟ܿ;-><init>(Ll/ۜܰܿ;)V

    .line 26
    new-instance v1, Ll/ܿ۟ܿ;

    invoke-direct {v1, p1}, Ll/ܿ۟ܿ;-><init>(Ll/ۢ۟ܿ;)V

    new-instance v2, Ll/ܳ۟ܿ;

    invoke-direct {v2, v0}, Ll/ܳ۟ܿ;-><init>(Ll/ۡ۟ܿ;)V

    .line 25
    invoke-virtual {p0, v1, v2}, Ll/ۜܰܿ;->֫(Ljava/lang/Runnable;Ljava/lang/Runnable;)Ll/ܽܰܿ;

    move-result-object v1

    if-nez v1, :cond_a

    .line 28
    invoke-static {v3}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    goto :goto_0

    .line 32
    :cond_a
    new-instance v2, Ll/᩷۟ܿ;

    invoke-direct {v2, v0, p0, p1, v1}, Ll/᩷۟ܿ;-><init>(Ll/ۡ۟ܿ;Ll/ۜܰܿ;Ll/ۢ۟ܿ;Ll/ܽܰܿ;)V

    .line 104
    invoke-virtual {v2}, Ll/۟ܶۡ;->᩻()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 142
    invoke-virtual {p0, p1}, Ll/ۜܰܿ;->֫(Ljava/io/IOException;)V

    .line 144
    :cond_b
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public static ֫(Ll/ۜܰܿ;Ll/ܳܰܿ;)V
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 238
    :try_start_0
    iget-object v1, p0, Ll/ۜܰܿ;->᩹:Ll/ܳܰܿ;

    if-ne v1, p1, :cond_0

    const/4 p1, 0x0

    .line 239
    iput-object p1, p0, Ll/ۜܰܿ;->᩹:Ll/ܳܰܿ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 241
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ۜܰܿ;Ll/ܽܰܿ;)V
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 232
    :try_start_0
    iget-object v1, p0, Ll/ۜܰܿ;->᩸:Ll/ܽܰܿ;

    if-ne v1, p1, :cond_0

    const/4 p1, 0x0

    .line 233
    iput-object p1, p0, Ll/ۜܰܿ;->᩸:Ll/ܽܰܿ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 235
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ۜܰܿ;Z)V
    .locals 2

    if-eqz p1, :cond_0

    .line 514
    iget-object p0, p0, Ll/ۜܰܿ;->ۤ:Ll/ܿܰܿ;

    const/4 p1, 0x2

    .line 874
    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeMessages(I)V

    const-wide/16 v0, 0xfa

    .line 875
    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void

    :cond_0
    const/4 p1, -0x1

    const/4 v0, 0x0

    .line 520
    invoke-direct {p0, p1, v0}, Ll/ۜܰܿ;->֫(IZ)V

    return-void
.end method

.method private ۖ()V
    .locals 2

    .line 621
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۜܰܿ;->۟:J

    iput-wide v0, p0, Ll/ۜܰܿ;->ۧ֫:J

    .line 622
    iget-object v0, p0, Ll/ۜܰܿ;->ۤ:Ll/ܿܰܿ;

    invoke-virtual {v0}, Ll/ܿܰܿ;->ۧ()V

    return-void
.end method

.method private ۘ()V
    .locals 4

    .line 626
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۜܰܿ;->֫֫:J

    .line 869
    iget-object v0, p0, Ll/ۜܰܿ;->ۤ:Ll/ܿܰܿ;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    const-wide/16 v2, 0x5dc

    .line 870
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۜܰܿ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۜܰܿ;->֫֫:J

    return-wide v0
.end method

.method public static ܳ(Ll/ۜܰܿ;)V
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x0

    .line 520
    invoke-direct {p0, v0, v1}, Ll/ۜܰܿ;->֫(IZ)V

    return-void
.end method

.method private declared-synchronized ܺ()Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 228
    :try_start_0
    iget-boolean v1, p0, Ll/ۜܰܿ;->᩻֫:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/ۜܰܿ;->᩸:Ll/ܽܰܿ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static bridge synthetic ܽ(Ll/ۜܰܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۜܰܿ;->ۜ֫:I

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/ۜܰܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۜܰܿ;->ۘ()V

    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/ۜܰܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۜܰܿ;->ۖ()V

    return-void
.end method


# virtual methods
.method public final computeScroll()V
    .locals 2

    .line 597
    iget-object v0, p0, Ll/ۜܰܿ;->ܰ:Ll/ᩴ۟ܿ;

    invoke-virtual {v0}, Ll/ᩴ۟ܿ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 598
    invoke-direct {p0}, Ll/ۜܰܿ;->ۘ()V

    .line 599
    invoke-virtual {v0}, Ll/ᩴ۟ܿ;->ܽ()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/ۜܰܿ;->֫(J)V

    :cond_0
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 632
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 633
    iget-object v0, p0, Ll/ۜܰܿ;->ۤ:Ll/ܿܰܿ;

    invoke-virtual {v0}, Ll/ܿܰܿ;->֫()V

    .line 634
    invoke-virtual {p0}, Ll/ۜܰܿ;->ܽ()Z

    .line 635
    invoke-virtual {p0}, Ll/ۜܰܿ;->ᩳ()V

    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 10

    .line 479
    iget-boolean v0, p0, Ll/ۜܰܿ;->ۡ֫:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    const/4 v3, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x1

    goto :goto_2

    .line 482
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Ll/ۜܰܿ;->۟:J

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x3e8

    rem-long/2addr v3, v5

    const-wide/16 v5, 0x1f4

    cmp-long v0, v3, v5

    if-gez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 483
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Ll/ۜܰܿ;->ۧ֫:J

    sub-long/2addr v3, v5

    const-wide/16 v5, 0xdac

    cmp-long v7, v3, v5

    if-gez v7, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    move v6, v0

    move v7, v3

    .line 486
    :goto_2
    iget-boolean v0, p0, Ll/ۜܰܿ;->ۢ֫:Z

    const/high16 v3, 0x3f800000    # 1.0f

    if-eqz v0, :cond_3

    goto :goto_3

    .line 489
    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iget-wide v8, p0, Ll/ۜܰܿ;->֫֫:J

    sub-long/2addr v4, v8

    long-to-int v0, v4

    if-ltz v0, :cond_5

    const/16 v4, 0x5dc

    if-gt v0, v4, :cond_4

    :goto_3
    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v8, 0x3f800000    # 1.0f

    goto :goto_4

    :cond_4
    add-int/lit16 v0, v0, -0x5dc

    const/16 v4, 0x12c

    if-ge v0, v4, :cond_5

    int-to-float v0, v0

    const/high16 v4, 0x43960000    # 300.0f

    div-float/2addr v0, v4

    sub-float/2addr v3, v0

    move v8, v3

    goto :goto_4

    :cond_5
    const/4 v0, 0x0

    const/4 v8, 0x0

    .line 502
    :goto_4
    :try_start_0
    iget-object v4, p0, Ll/ۜܰܿ;->ۨ:Ll/ۙܰܿ;

    iget-boolean v9, p0, Ll/ۜܰܿ;->ۢ֫:Z

    move-object v5, p1

    invoke-virtual/range {v4 .. v9}, Ll/ۙܰܿ;->֫(Landroid/graphics/Canvas;ZZFZ)V

    .line 504
    iput-boolean v1, p0, Ll/ۜܰܿ;->ܳ֫:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 507
    iget-object v1, p0, Ll/ۜܰܿ;->ۙ:Ll/ۤ᩺ܿ;

    iget v1, v1, Ll/ۤ᩺ܿ;->ᩴ:I

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 1120
    iget-boolean p1, p0, Ll/ۜܰܿ;->ܳ֫:Z

    if-nez p1, :cond_6

    iget-object p1, p0, Ll/ۜܰܿ;->᩺:Ll/ۚܰܿ;

    if-eqz p1, :cond_6

    .line 1121
    iput-boolean v2, p0, Ll/ۜܰܿ;->ܳ֫:Z

    .line 1122
    invoke-virtual {p1, v0}, Ll/ۚܰܿ;->֫(Ljava/io/IOException;)V

    :cond_6
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 7

    .line 335
    iget-object v0, p0, Ll/ۜܰܿ;->ۨ:Ll/ۙܰܿ;

    invoke-virtual {v0}, Ll/ۙܰܿ;->᩷()Z

    move-result v1

    .line 336
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    sub-int/2addr p4, p2

    .line 340
    iget p1, p0, Ll/ۜܰܿ;->ۛ:I

    const/4 p2, 0x1

    const/4 p3, 0x0

    iget-object p5, p0, Ll/ۜܰܿ;->ۙ:Ll/ۤ᩺ܿ;

    if-eq p4, p1, :cond_0

    iget p1, p5, Ll/ۤ᩺ܿ;->ۡ:I

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 343
    :goto_0
    iget-object v2, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    if-eqz p1, :cond_2

    .line 323
    iget-wide v3, p0, Ll/ۜܰܿ;->᩷֫:J

    .line 344
    invoke-virtual {v0}, Ll/ۙܰܿ;->᩻()I

    move-result v5

    int-to-long v5, v5

    add-long/2addr v3, v5

    const/4 v5, 0x0

    .line 565
    invoke-virtual {v0, v5, v3, v4, p3}, Ll/ۙܰܿ;->֫(FJZ)I

    move-result p3

    .line 345
    iput p4, p0, Ll/ۜܰܿ;->ۛ:I

    .line 346
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    iget v3, v3, Landroid/content/res/Configuration;->orientation:I

    if-ne v3, p2, :cond_1

    const/16 p2, 0x8

    .line 347
    invoke-virtual {v2, p2}, Ll/ۧܰܿ;->ۧ(I)V

    goto :goto_1

    :cond_1
    const/16 p2, 0x10

    .line 349
    invoke-virtual {v2, p2}, Ll/ۧܰܿ;->ۧ(I)V

    .line 351
    :goto_1
    invoke-virtual {p5, p4}, Ll/ۤ᩺ܿ;->֫(I)V

    goto :goto_2

    .line 353
    :cond_2
    invoke-virtual {p5, p4}, Ll/ۤ᩺ܿ;->ۧ(I)V

    :goto_2
    if-eqz v1, :cond_4

    .line 356
    invoke-virtual {v2}, Ll/ۧܰܿ;->᩷()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۜܰܿ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_3

    .line 358
    :cond_3
    invoke-virtual {v0}, Ll/ۙܰܿ;->ܽ()J

    move-result-wide p1

    .line 323
    iget-wide p3, p0, Ll/ۜܰܿ;->᩷֫:J

    cmp-long p5, p3, p1

    if-lez p5, :cond_7

    .line 360
    invoke-virtual {p0, p1, p2}, Ll/ۜܰܿ;->֫(J)V

    return-void

    :cond_4
    if-eqz p1, :cond_6

    .line 364
    invoke-virtual {v2}, Ll/ۧܰܿ;->ܽ()I

    move-result p1

    div-int/2addr p3, p1

    .line 365
    invoke-virtual {v0, p3}, Ll/ۙܰܿ;->ۧ(I)J

    move-result-wide p1

    invoke-virtual {v0}, Ll/ۙܰܿ;->ܽ()J

    move-result-wide p3

    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    .line 366
    iget-object p3, p0, Ll/ۜܰܿ;->ܰ:Ll/ᩴ۟ܿ;

    invoke-virtual {p3}, Ll/ᩴ۟ܿ;->ᩳ()Z

    move-result p4

    if-nez p4, :cond_5

    .line 367
    invoke-virtual {p3}, Ll/ᩴ۟ܿ;->֫()V

    .line 323
    :cond_5
    iget-wide p4, p0, Ll/ۜܰܿ;->᩷֫:J

    sub-long/2addr p1, p4

    .line 368
    invoke-virtual {p3, p4, p5, p1, p2}, Ll/ᩴ۟ܿ;->֫(JJ)V

    .line 369
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    .line 372
    :cond_6
    invoke-virtual {v0}, Ll/ۙܰܿ;->ܽ()J

    move-result-wide p1

    .line 323
    iget-wide p3, p0, Ll/ۜܰܿ;->᩷֫:J

    cmp-long p5, p3, p1

    if-lez p5, :cond_7

    .line 374
    invoke-virtual {p0, p1, p2}, Ll/ۜܰܿ;->֫(J)V

    :cond_7
    :goto_3
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    .line 656
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    .line 657
    iget-object v1, p0, Ll/ۜܰܿ;->ۙ:Ll/ۤ᩺ܿ;

    iget-object v2, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    iget-object v3, p0, Ll/ۜܰܿ;->ۨ:Ll/ۙܰܿ;

    const/4 v4, 0x1

    if-eqz v0, :cond_b

    const/4 v5, 0x3

    if-eq v0, v4, :cond_8

    const/4 v6, 0x2

    if-eq v0, v6, :cond_0

    if-eq v0, v5, :cond_8

    const/4 v1, 0x5

    if-eq v0, v1, :cond_10

    const/4 v1, 0x6

    if-eq v0, v1, :cond_10

    goto/16 :goto_3

    .line 705
    :cond_0
    iget-boolean v0, p0, Ll/ۜܰܿ;->ۡ֫:Z

    if-eqz v0, :cond_5

    .line 706
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 707
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    .line 708
    iget v1, p0, Ll/ۜܰܿ;->ᩳ֫:F

    add-float/2addr v0, v1

    .line 323
    iget-wide v5, p0, Ll/ۜܰܿ;->᩷֫:J

    .line 710
    iget v1, p0, Ll/ۜܰܿ;->ܿ֫:F

    add-float/2addr v1, p1

    float-to-int v1, v1

    int-to-long v7, v1

    add-long/2addr v5, v7

    .line 708
    invoke-virtual {v3, v0, v5, v6, v4}, Ll/ۙܰܿ;->֫(FJZ)I

    move-result v0

    .line 711
    invoke-virtual {v2}, Ll/ۧܰܿ;->ۡ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 712
    iget v1, p0, Ll/ۜܰܿ;->᩶:I

    invoke-virtual {v2, v0, v1}, Ll/ۧܰܿ;->ۧ(II)V

    .line 713
    iput v0, p0, Ll/ۜܰܿ;->ܽ֫:I

    goto :goto_0

    .line 715
    :cond_1
    invoke-virtual {v3}, Ll/ۙܰܿ;->ۖ()Z

    move-result v1

    invoke-virtual {v2, v0, v1}, Ll/ۧܰܿ;->֫(IZ)V

    .line 604
    :goto_0
    invoke-virtual {v3}, Ll/ۙܰܿ;->ۜ()F

    move-result v0

    iget v1, p0, Ll/ۜܰܿ;->ܿ֫:F

    sub-float/2addr v0, v1

    cmpg-float v1, p1, v0

    if-gez v1, :cond_3

    .line 323
    iget-wide v1, p0, Ll/ۜܰܿ;->᩷֫:J

    long-to-float v1, v1

    sub-float/2addr v1, v0

    add-float/2addr v1, p1

    float-to-long v0, v1

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-gez p1, :cond_2

    move-wide v0, v2

    .line 611
    :cond_2
    invoke-virtual {p0, v0, v1}, Ll/ۜܰܿ;->֫(J)V

    return v4

    .line 612
    :cond_3
    invoke-virtual {v3}, Ll/ۙܰܿ;->֫()F

    move-result v0

    cmpl-float v1, p1, v0

    if-lez v1, :cond_4

    .line 323
    iget-wide v1, p0, Ll/ۜܰܿ;->᩷֫:J

    long-to-float v1, v1

    sub-float/2addr v1, v0

    add-float/2addr v1, p1

    float-to-long v0, v1

    .line 614
    invoke-virtual {v3}, Ll/ۙܰܿ;->ܽ()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    .line 615
    invoke-virtual {p0, v0, v1}, Ll/ۜܰܿ;->֫(J)V

    return v4

    .line 617
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v4

    .line 719
    :cond_5
    iget-boolean v0, p0, Ll/ۜܰܿ;->ۢ֫:Z

    if-eqz v0, :cond_11

    .line 720
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iget v0, p0, Ll/ۜܰܿ;->ܿ֫:F

    add-float/2addr p1, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {v3}, Ll/ۙܰܿ;->᩻()I

    move-result v2

    sub-int/2addr v0, v2

    int-to-float v0, v0

    iget v1, v1, Ll/ۤ᩺ܿ;->ۜ:F

    sub-float/2addr v0, v1

    div-float/2addr p1, v0

    float-to-double v0, p1

    const-wide/16 v5, 0x0

    cmpg-double p1, v0, v5

    if-gez p1, :cond_6

    :goto_1
    move-wide v0, v5

    goto :goto_2

    :cond_6
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    cmpl-double p1, v0, v5

    if-lez p1, :cond_7

    goto :goto_1

    .line 725
    :cond_7
    :goto_2
    invoke-virtual {v3}, Ll/ۙܰܿ;->ܽ()J

    move-result-wide v2

    long-to-double v2, v2

    mul-double v2, v2, v0

    double-to-long v0, v2

    .line 726
    invoke-virtual {p0, v0, v1}, Ll/ۜܰܿ;->֫(J)V

    return v4

    .line 732
    :cond_8
    iget-boolean v1, p0, Ll/ۜܰܿ;->ۡ֫:Z

    const/4 v3, 0x0

    if-eqz v1, :cond_a

    .line 733
    invoke-direct {p0}, Ll/ۜܰܿ;->ۖ()V

    .line 734
    iput-boolean v3, p0, Ll/ۜܰܿ;->ۡ֫:Z

    if-eq v0, v5, :cond_10

    .line 930
    invoke-virtual {v2}, Ll/ۧܰܿ;->ۡ()Z

    move-result p1

    if-eqz p1, :cond_10

    .line 736
    iget p1, p0, Ll/ۜܰܿ;->ܽ֫:I

    iget v0, p0, Ll/ۜܰܿ;->᩶:I

    if-le p1, v0, :cond_9

    const/4 v3, 0x1

    :cond_9
    invoke-direct {p0, p1, v3}, Ll/ۜܰܿ;->֫(IZ)V

    return v4

    .line 739
    :cond_a
    iget-boolean v0, p0, Ll/ۜܰܿ;->ۢ֫:Z

    if-eqz v0, :cond_11

    .line 740
    invoke-direct {p0}, Ll/ۜܰܿ;->ۘ()V

    .line 741
    iput-boolean v3, p0, Ll/ۜܰܿ;->ۢ֫:Z

    .line 742
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 1107
    iget-object p1, p0, Ll/ۜܰܿ;->᩺:Ll/ۚܰܿ;

    if-eqz p1, :cond_10

    .line 1108
    invoke-virtual {p1, v3}, Ll/ۚܰܿ;->֫(Z)V

    return v4

    .line 659
    :cond_b
    iget-object v0, p0, Ll/ۜܰܿ;->۬:Ll/۟᩶ܿ;

    invoke-virtual {v0}, Ll/۟᩶ܿ;->֫()V

    .line 660
    iget-object v0, p0, Ll/ۜܰܿ;->ܰ:Ll/ᩴ۟ܿ;

    invoke-virtual {v0}, Ll/ᩴ۟ܿ;->ᩳ()Z

    move-result v5

    if-nez v5, :cond_c

    .line 661
    invoke-virtual {v0}, Ll/ᩴ۟ܿ;->֫()V

    .line 662
    :cond_c
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 663
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    .line 665
    invoke-virtual {v3}, Ll/ۙܰܿ;->ۘ()Z

    move-result v6

    if-eqz v6, :cond_f

    .line 666
    invoke-virtual {v2}, Ll/ۧܰܿ;->ۡ()Z

    move-result v6

    const/high16 v7, 0x40000000    # 2.0f

    if-eqz v6, :cond_e

    .line 667
    invoke-virtual {v3}, Ll/ۙܰܿ;->ܿ()Landroid/graphics/RectF;

    move-result-object v6

    .line 668
    invoke-virtual {v6, v0, v5}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v8

    const/high16 v9, 0x40800000    # 4.0f

    if-eqz v8, :cond_d

    .line 669
    iget p1, v6, Landroid/graphics/RectF;->left:F

    iget v3, v6, Landroid/graphics/RectF;->right:F

    sub-float/2addr v3, p1

    const/high16 v8, 0x40400000    # 3.0f

    mul-float v3, v3, v8

    div-float/2addr v3, v9

    add-float/2addr v3, p1

    sub-float/2addr v3, v0

    iput v3, p0, Ll/ۜܰܿ;->ᩳ֫:F

    .line 670
    iget p1, v6, Landroid/graphics/RectF;->top:F

    sub-float/2addr p1, v5

    iget v0, v1, Ll/ۤ᩺ܿ;->ۡ:I

    int-to-float v0, v0

    div-float/2addr v0, v7

    sub-float/2addr p1, v0

    iput p1, p0, Ll/ۜܰܿ;->ܿ֫:F

    .line 671
    iput-boolean v4, p0, Ll/ۜܰܿ;->ۡ֫:Z

    .line 672
    invoke-virtual {v2}, Ll/ۧܰܿ;->ۜ()I

    move-result p1

    iput p1, p0, Ll/ۜܰܿ;->᩶:I

    return v4

    .line 675
    :cond_d
    invoke-virtual {v3}, Ll/ۙܰܿ;->ܳ()Landroid/graphics/RectF;

    move-result-object v6

    .line 676
    invoke-virtual {v6, v0, v5}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v8

    if-eqz v8, :cond_f

    .line 677
    iget p1, v6, Landroid/graphics/RectF;->left:F

    iget v3, v6, Landroid/graphics/RectF;->right:F

    sub-float/2addr v3, p1

    div-float/2addr v3, v9

    add-float/2addr v3, p1

    sub-float/2addr v3, v0

    iput v3, p0, Ll/ۜܰܿ;->ᩳ֫:F

    .line 678
    iget p1, v6, Landroid/graphics/RectF;->top:F

    sub-float/2addr p1, v5

    iget v0, v1, Ll/ۤ᩺ܿ;->ۡ:I

    int-to-float v0, v0

    div-float/2addr v0, v7

    sub-float/2addr p1, v0

    iput p1, p0, Ll/ۜܰܿ;->ܿ֫:F

    .line 679
    iput-boolean v4, p0, Ll/ۜܰܿ;->ۡ֫:Z

    .line 680
    invoke-virtual {v2}, Ll/ۧܰܿ;->᩷()I

    move-result p1

    iput p1, p0, Ll/ۜܰܿ;->᩶:I

    return v4

    .line 684
    :cond_e
    invoke-virtual {v3}, Ll/ۙܰܿ;->ᩳ()Landroid/graphics/RectF;

    move-result-object v2

    .line 685
    invoke-virtual {v2, v0, v5}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v6

    if-eqz v6, :cond_f

    .line 686
    iget p1, v2, Landroid/graphics/RectF;->left:F

    iget v3, v2, Landroid/graphics/RectF;->right:F

    add-float/2addr p1, v3

    div-float/2addr p1, v7

    sub-float/2addr p1, v0

    iput p1, p0, Ll/ۜܰܿ;->ᩳ֫:F

    .line 687
    iget p1, v2, Landroid/graphics/RectF;->top:F

    sub-float/2addr p1, v5

    iget v0, v1, Ll/ۤ᩺ܿ;->ۡ:I

    int-to-float v0, v0

    div-float/2addr v0, v7

    sub-float/2addr p1, v0

    iput p1, p0, Ll/ۜܰܿ;->ܿ֫:F

    .line 688
    iput-boolean v4, p0, Ll/ۜܰܿ;->ۡ֫:Z

    return v4

    .line 693
    :cond_f
    invoke-virtual {v3}, Ll/ۙܰܿ;->ۡ()Z

    move-result v1

    if-eqz v1, :cond_11

    .line 694
    invoke-virtual {v3}, Ll/ۙܰܿ;->ۧ()Ll/ܳ᩸ۡ;

    move-result-object v1

    .line 695
    invoke-virtual {v1, v0, v5}, Ll/ܳ᩸ۡ;->֫(FF)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 696
    iput-boolean v4, p0, Ll/ۜܰܿ;->ۢ֫:Z

    .line 697
    iget p1, v1, Ll/ܳ᩸ۡ;->ܿ:F

    sub-float/2addr p1, v5

    invoke-virtual {v3}, Ll/ۙܰܿ;->᩻()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr p1, v0

    iput p1, p0, Ll/ۜܰܿ;->ܿ֫:F

    .line 698
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 1107
    iget-object p1, p0, Ll/ۜܰܿ;->᩺:Ll/ۚܰܿ;

    if-eqz p1, :cond_10

    .line 1108
    invoke-virtual {p1, v4}, Ll/ۚܰܿ;->֫(Z)V

    :cond_10
    return v4

    .line 751
    :cond_11
    :goto_3
    iget-object v0, p0, Ll/ۜܰܿ;->۫:Ll/֨ۛ;

    invoke-virtual {v0, p1}, Ll/֨ۛ;->֫(Landroid/view/MotionEvent;)Z

    return v4
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 0

    .line 640
    invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V

    if-eqz p1, :cond_0

    .line 642
    invoke-direct {p0}, Ll/ۜܰܿ;->ۖ()V

    return-void

    .line 644
    :cond_0
    iget-object p1, p0, Ll/ۜܰܿ;->ۤ:Ll/ܿܰܿ;

    invoke-virtual {p1}, Ll/ܿܰܿ;->֫()V

    return-void
.end method

.method public final declared-synchronized ֫(Ljava/lang/Runnable;Ljava/lang/Runnable;)Ll/ܽܰܿ;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 163
    :try_start_0
    iget-boolean v1, p0, Ll/ۜܰܿ;->᩻֫:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/ۜܰܿ;->᩸:Ll/ܽܰܿ;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 166
    :cond_0
    new-instance v1, Ll/ܽܰܿ;

    invoke-direct {v1, p0, p1, p2}, Ll/ܽܰܿ;-><init>(Ll/ۜܰܿ;Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    iput-object v1, p0, Ll/ۜܰܿ;->᩸:Ll/ܽܰܿ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    monitor-exit v0

    return-object v1

    .line 164
    :cond_1
    :goto_0
    monitor-exit v0

    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ᩳܽܳ;)Ll/ᩳܽܳ;
    .locals 5

    const/4 v0, 0x2

    .line 265
    iget-object v1, p0, Ll/ۜܰܿ;->ۤ:Ll/ܿܰܿ;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeMessages(I)V

    const/4 v0, 0x3

    .line 266
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 267
    iget-object v0, p0, Ll/ۜܰܿ;->۬:Ll/۟᩶ܿ;

    invoke-virtual {v0}, Ll/۟᩶ܿ;->֫()V

    .line 268
    invoke-virtual {p0}, Ll/ۜܰܿ;->ᩳ()V

    .line 269
    iget-object v0, p0, Ll/ۜܰܿ;->ܰ:Ll/ᩴ۟ܿ;

    invoke-virtual {v0}, Ll/ᩴ۟ܿ;->ᩳ()Z

    move-result v2

    if-nez v2, :cond_0

    .line 270
    invoke-virtual {v0}, Ll/ᩴ۟ܿ;->֫()V

    .line 272
    :cond_0
    iget-boolean v0, p0, Ll/ۜܰܿ;->ۢ֫:Z

    const/4 v2, 0x0

    .line 273
    iput-boolean v2, p0, Ll/ۜܰܿ;->ۢ֫:Z

    .line 274
    iput-boolean v2, p0, Ll/ۜܰܿ;->ۡ֫:Z

    const-wide/16 v3, 0x0

    .line 275
    iput-wide v3, p0, Ll/ۜܰܿ;->֫֫:J

    .line 276
    iput-boolean v2, v1, Ll/ܿܰܿ;->ܽ:Z

    .line 277
    iget-object v1, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v1, p1}, Ll/ۧܰܿ;->֫(Ll/ᩳܽܳ;)Ll/ᩳܽܳ;

    move-result-object p1

    .line 278
    iput-wide v3, p0, Ll/ۜܰܿ;->᩷֫:J

    .line 279
    iput-boolean v2, p0, Ll/ۜܰܿ;->ܳ֫:Z

    if-eqz v0, :cond_1

    .line 1107
    iget-object v0, p0, Ll/ۜܰܿ;->᩺:Ll/ۚܰܿ;

    if-eqz v0, :cond_1

    .line 1108
    invoke-virtual {v0, v2}, Ll/ۚܰܿ;->֫(Z)V

    .line 284
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-object p1
.end method

.method public final ֫(Ll/ۙۧܳ;)Ll/᩻ܰܿ;
    .locals 18

    move-object/from16 v0, p0

    if-eqz p1, :cond_0

    .line 1177
    new-instance v9, Ll/᩻ܰܿ;

    iget-wide v5, v0, Ll/ۜܰܿ;->᩷֫:J

    invoke-virtual/range {p1 .. p1}, Ll/ۙۧܳ;->ܳ()I

    move-result v2

    .line 1178
    invoke-virtual/range {p1 .. p1}, Ll/ۙۧܳ;->ᩳ()I

    move-result v3

    invoke-virtual/range {p1 .. p1}, Ll/ۙۧܳ;->ܽ()Z

    move-result v7

    .line 1179
    invoke-virtual/range {p1 .. p1}, Ll/ۙۧܳ;->֫()Z

    move-result v8

    const/4 v4, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Ll/᩻ܰܿ;-><init>(IIIJZZ)V

    return-object v9

    .line 1181
    :cond_0
    new-instance v1, Ll/᩻ܰܿ;

    iget-wide v14, v0, Ll/ۜܰܿ;->᩷֫:J

    iget-object v2, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v2}, Ll/ۧܰܿ;->᩷()I

    move-result v11

    invoke-virtual {v2}, Ll/ۧܰܿ;->ۜ()I

    move-result v12

    .line 1182
    invoke-virtual {v2}, Ll/ۧܰܿ;->ܺ()Z

    move-result v16

    invoke-virtual {v2}, Ll/ۧܰܿ;->ۡ()Z

    move-result v17

    const/4 v13, 0x0

    move-object v10, v1

    invoke-direct/range {v10 .. v17}, Ll/᩻ܰܿ;-><init>(IIIJZZ)V

    return-object v1
.end method

.method public final ֫()V
    .locals 4

    .line 1102
    iget-object v0, p0, Ll/ۜܰܿ;->᩺:Ll/ۚܰܿ;

    if-eqz v0, :cond_0

    .line 1141
    iget-object v1, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v1}, Ll/ۧܰܿ;->ۧ()Z

    move-result v2

    .line 1145
    invoke-virtual {v1}, Ll/ۧܰܿ;->֫()Z

    move-result v3

    .line 1166
    invoke-virtual {v1}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ᩳܽܳ;->ᩴ()Z

    move-result v1

    .line 1103
    invoke-virtual {v0, v2, v3, v1}, Ll/ۚܰܿ;->֫(ZZZ)V

    :cond_0
    return-void
.end method

.method public final ֫(II)V
    .locals 10

    .line 300
    iget-object v0, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0, p1, p2}, Ll/ۧܰܿ;->ۧ(II)V

    .line 301
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 302
    invoke-virtual {v0}, Ll/ۧܰܿ;->᩷()I

    move-result p1

    invoke-virtual {v0}, Ll/ۧܰܿ;->ۜ()I

    move-result p2

    .line 418
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    if-eqz v1, :cond_d

    iget-object v1, p0, Ll/ۜܰܿ;->ۨ:Ll/ۙܰܿ;

    if-nez v1, :cond_0

    goto/16 :goto_4

    .line 421
    :cond_0
    invoke-virtual {v1}, Ll/ۙܰܿ;->ܽ()J

    move-result-wide v2

    .line 323
    iget-wide v4, p0, Ll/ۜܰܿ;->᩷֫:J

    .line 425
    invoke-virtual {v0}, Ll/ۧܰܿ;->ܽ()I

    move-result v6

    div-int/2addr p1, v6

    .line 427
    invoke-virtual {v1, p1}, Ll/ۙܰܿ;->ۧ(I)J

    move-result-wide v6

    cmp-long v8, v4, v6

    if-lez v8, :cond_1

    goto :goto_0

    .line 433
    :cond_1
    invoke-virtual {v1, p1}, Ll/ۙܰܿ;->֫(I)J

    move-result-wide v6

    cmp-long v8, v4, v6

    if-gez v8, :cond_2

    goto :goto_0

    :cond_2
    move-wide v6, v4

    :goto_0
    cmp-long v8, v6, v2

    if-lez v8, :cond_3

    move-wide v6, v2

    .line 438
    :cond_3
    invoke-virtual {v0}, Ll/ۧܰܿ;->ܽ()I

    move-result v0

    div-int/2addr p2, v0

    if-eq p1, p2, :cond_b

    .line 441
    invoke-virtual {v1, p2}, Ll/ۙܰܿ;->ۧ(I)J

    move-result-wide v8

    cmp-long p1, v4, v8

    if-lez p1, :cond_4

    goto :goto_1

    .line 447
    :cond_4
    invoke-virtual {v1, p2}, Ll/ۙܰܿ;->֫(I)J

    move-result-wide v8

    cmp-long p1, v4, v8

    if-gez p1, :cond_5

    goto :goto_1

    :cond_5
    move-wide v8, v4

    :goto_1
    cmp-long p1, v8, v2

    if-lez p1, :cond_6

    goto :goto_2

    :cond_6
    move-wide v2, v8

    :goto_2
    cmp-long p1, v4, v6

    if-nez p1, :cond_7

    cmp-long p2, v4, v2

    if-eqz p2, :cond_7

    move-wide v6, v2

    goto :goto_3

    :cond_7
    if-eqz p1, :cond_8

    cmp-long p2, v4, v2

    if-nez p2, :cond_8

    goto :goto_3

    :cond_8
    if-eqz p1, :cond_a

    if-lez p1, :cond_9

    cmp-long p2, v4, v2

    if-lez p2, :cond_9

    .line 458
    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    goto :goto_3

    :cond_9
    if-gez p1, :cond_a

    cmp-long p1, v4, v2

    if-gez p1, :cond_a

    .line 460
    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    goto :goto_3

    :cond_a
    move-wide v6, v4

    :cond_b
    :goto_3
    cmp-long p1, v4, v6

    if-eqz p1, :cond_d

    .line 467
    iget-object p1, p0, Ll/ۜܰܿ;->ܰ:Ll/ᩴ۟ܿ;

    invoke-virtual {p1}, Ll/ᩴ۟ܿ;->ᩳ()Z

    move-result p2

    if-nez p2, :cond_c

    .line 468
    invoke-virtual {p1}, Ll/ᩴ۟ܿ;->֫()V

    :cond_c
    sub-long/2addr v6, v4

    .line 469
    invoke-virtual {p1, v4, v5, v6, v7}, Ll/ᩴ۟ܿ;->֫(JJ)V

    .line 470
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_d
    :goto_4
    return-void
.end method

.method public final ֫(IIZ)V
    .locals 2

    .line 1091
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۜܰܿ;->۟:J

    .line 1092
    iget-object v0, p0, Ll/ۜܰܿ;->᩺:Ll/ۚܰܿ;

    if-eqz v0, :cond_0

    .line 1093
    iget-object v1, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v1}, Ll/ۧܰܿ;->ᩳ()I

    move-result v1

    invoke-virtual {v0, p1, p2, v1, p3}, Ll/ۚܰܿ;->֫(IIIZ)V

    :cond_0
    return-void
.end method

.method public final ֫(J)V
    .locals 0

    .line 327
    iput-wide p1, p0, Ll/ۜܰܿ;->᩷֫:J

    .line 328
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ֫(Ljava/io/IOException;)V
    .locals 1

    .line 1113
    iget-object v0, p0, Ll/ۜܰܿ;->᩺:Ll/ۚܰܿ;

    if-eqz v0, :cond_0

    .line 1114
    invoke-virtual {v0, p1}, Ll/ۚܰܿ;->֫(Ljava/io/IOException;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۚܰܿ;)V
    .locals 0

    .line 1087
    iput-object p1, p0, Ll/ۜܰܿ;->᩺:Ll/ۚܰܿ;

    return-void
.end method

.method public final ֫(Ll/᩻ܰܿ;)V
    .locals 12

    const-string v0, "state"

    .line 1187
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-boolean v0, p1, Ll/᩻ܰܿ;->ܽ:Z

    iget-boolean v1, p1, Ll/᩻ܰܿ;->֫:Z

    .line 1188
    iget-object v2, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v2}, Ll/ۧܰܿ;->ᩳ()I

    move-result v3

    .line 1221
    iget v4, p1, Ll/᩻ܰܿ;->ᩳ:I

    iget v5, p1, Ll/᩻ܰܿ;->ܿ:I

    if-ltz v3, :cond_5

    iget-wide v6, p1, Ll/᩻ܰܿ;->ۧ:J

    const-wide/16 v8, 0x0

    cmp-long p1, v6, v8

    if-ltz p1, :cond_5

    if-eqz v1, :cond_1

    if-eqz v3, :cond_0

    if-ltz v5, :cond_0

    if-lt v4, v5, :cond_0

    int-to-long v8, v4

    int-to-long v10, v3

    cmp-long p1, v8, v10

    if-gez p1, :cond_0

    goto :goto_0

    .line 1227
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid range selection"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    if-ltz v5, :cond_4

    if-ne v5, v4, :cond_4

    int-to-long v8, v5

    int-to-long v10, v3

    cmp-long p1, v8, v10

    if-gtz p1, :cond_4

    if-ne v5, v3, :cond_2

    if-eqz v0, :cond_4

    .line 1189
    :cond_2
    :goto_0
    iget-object p1, p0, Ll/ۜܰܿ;->ۨ:Ll/ۙܰܿ;

    invoke-virtual {p1}, Ll/ۙܰܿ;->ܽ()J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    iput-wide v6, p0, Ll/ۜܰܿ;->᩷֫:J

    if-eqz v1, :cond_3

    .line 180
    invoke-virtual {v2, v5, v4}, Ll/ۧܰܿ;->ۧ(II)V

    goto :goto_1

    .line 182
    :cond_3
    invoke-virtual {v2, v5, v0}, Ll/ۧܰܿ;->֫(IZ)V

    .line 1192
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    .line 1232
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid cursor selection"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1222
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Negative UI state value"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final declared-synchronized ֫(Z)V
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 153
    :try_start_0
    iput-boolean p1, p0, Ll/ۜܰܿ;->᩻֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(I)Z
    .locals 8

    .line 388
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Ll/ۜܰܿ;->ۨ:Ll/ۙܰܿ;

    if-nez v0, :cond_0

    goto :goto_2

    .line 391
    :cond_0
    iget-object v1, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v1}, Ll/ۧܰܿ;->ܽ()I

    move-result v1

    div-int/2addr p1, v1

    .line 392
    invoke-virtual {v0, p1}, Ll/ۙܰܿ;->ۧ(I)J

    move-result-wide v1

    .line 394
    invoke-virtual {v0}, Ll/ۙܰܿ;->ܽ()J

    move-result-wide v3

    .line 323
    iget-wide v5, p0, Ll/ۜܰܿ;->᩷֫:J

    cmp-long v7, v5, v1

    if-lez v7, :cond_1

    goto :goto_0

    .line 400
    :cond_1
    invoke-virtual {v0, p1}, Ll/ۙܰܿ;->֫(I)J

    move-result-wide v1

    cmp-long p1, v5, v1

    if-gez p1, :cond_2

    goto :goto_0

    :cond_2
    move-wide v1, v5

    :goto_0
    cmp-long p1, v1, v3

    if-lez p1, :cond_3

    goto :goto_1

    :cond_3
    move-wide v3, v1

    :goto_1
    cmp-long p1, v5, v3

    if-eqz p1, :cond_5

    .line 407
    iget-object p1, p0, Ll/ۜܰܿ;->ܰ:Ll/ᩴ۟ܿ;

    invoke-virtual {p1}, Ll/ᩴ۟ܿ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_4

    .line 408
    invoke-virtual {p1}, Ll/ᩴ۟ܿ;->֫()V

    :cond_4
    sub-long/2addr v3, v5

    .line 409
    invoke-virtual {p1, v5, v6, v3, v4}, Ll/ᩴ۟ܿ;->֫(JJ)V

    .line 410
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    const/4 p1, 0x1

    return p1

    :cond_5
    :goto_2
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ljava/lang/Runnable;)Z
    .locals 2

    move-object v0, p0

    .line 217
    monitor-enter v0

    .line 218
    :try_start_0
    iget-object v1, p0, Ll/ۜܰܿ;->᩸:Ll/ܽܰܿ;

    .line 219
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 223
    :cond_0
    invoke-virtual {v1, p1}, Ll/ܽܰܿ;->֫(Ljava/lang/Runnable;)V

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    .line 219
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫([B)Z
    .locals 2

    .line 245
    invoke-direct {p0}, Ll/ۜܰܿ;->ܺ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 248
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0, p1}, Ll/ۧܰܿ;->֫([B)V
    :try_end_0
    .catch Ll/۟֫ܳ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 256
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    .line 253
    invoke-virtual {p0, p1}, Ll/ۜܰܿ;->֫(Ljava/io/IOException;)V

    return v1

    :catch_1
    const p1, 0x7f12030d

    .line 250
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return v1
.end method

.method public final ۜ()V
    .locals 1

    .line 939
    iget-object v0, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0}, Ll/ۧܰܿ;->ۖ()V

    const/4 v0, 0x0

    .line 940
    iput-boolean v0, p0, Ll/ۜܰܿ;->ܳ֫:Z

    .line 941
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ۡ()V
    .locals 1

    .line 1149
    invoke-direct {p0}, Ll/ۜܰܿ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 1151
    :cond_0
    iget-object v0, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0}, Ll/ۧܰܿ;->ۚ()V

    .line 1152
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 1153
    invoke-virtual {v0}, Ll/ۧܰܿ;->᩷()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ۜܰܿ;->֫(I)Z

    return-void
.end method

.method public final declared-synchronized ۢ()Ll/ܳܰܿ;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 177
    :try_start_0
    iget-object v1, p0, Ll/ۜܰܿ;->᩹:Ll/ܳܰܿ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 178
    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    .line 180
    :cond_0
    :try_start_1
    new-instance v1, Ll/ܳܰܿ;

    invoke-direct {v1, p0}, Ll/ܳܰܿ;-><init>(Ll/ۜܰܿ;)V

    iput-object v1, p0, Ll/ۜܰܿ;->᩹:Ll/ܳܰܿ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 181
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final ۧ()V
    .locals 1

    .line 1097
    iget-object v0, p0, Ll/ۜܰܿ;->᩺:Ll/ۚܰܿ;

    if-eqz v0, :cond_0

    .line 1098
    invoke-virtual {v0}, Ll/ۚܰܿ;->ۧ֫()V

    :cond_0
    return-void
.end method

.method public final ۧ(I)V
    .locals 2

    const/4 v0, 0x1

    .line 156
    iget-object v1, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v1, p1, v0}, Ll/ۧܰܿ;->֫(IZ)V

    .line 380
    invoke-direct {p0}, Ll/ۜܰܿ;->ۖ()V

    .line 381
    invoke-virtual {v1}, Ll/ۧܰܿ;->᩷()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۜܰܿ;->֫(I)Z

    return-void
.end method

.method public final declared-synchronized ܳ()Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 172
    :try_start_0
    iget-object v1, p0, Ll/ۜܰܿ;->᩸:Ll/ܽܰܿ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ܽ(I)V
    .locals 2

    .line 306
    invoke-direct {p0}, Ll/ۜܰܿ;->ܺ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 930
    iget-object v0, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0}, Ll/ۧܰܿ;->ۡ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 309
    :cond_0
    :try_start_0
    invoke-virtual {v0, p1}, Ll/ۧܰܿ;->֫(I)V
    :try_end_0
    .catch Ll/۟֫ܳ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 317
    invoke-direct {p0}, Ll/ۜܰܿ;->ۖ()V

    .line 318
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 319
    invoke-virtual {v0}, Ll/ۧܰܿ;->᩷()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۜܰܿ;->֫(I)Z

    return-void

    :catch_0
    move-exception p1

    .line 314
    invoke-virtual {p0, p1}, Ll/ۜܰܿ;->֫(Ljava/io/IOException;)V

    return-void

    :catch_1
    const p1, 0x7f12030d

    .line 311
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :cond_1
    :goto_0
    return-void
.end method

.method public final ܽ()Z
    .locals 2

    move-object v0, p0

    .line 203
    monitor-enter v0

    .line 204
    :try_start_0
    iget-object v1, p0, Ll/ۜܰܿ;->᩸:Ll/ܽܰܿ;

    .line 205
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 207
    invoke-virtual {v1}, Ll/ܽܰܿ;->ܽ()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v1

    .line 205
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ܿ()J
    .locals 2

    .line 323
    iget-wide v0, p0, Ll/ۜܰܿ;->᩷֫:J

    return-wide v0
.end method

.method public final ᩳ()V
    .locals 2

    move-object v0, p0

    .line 192
    monitor-enter v0

    .line 193
    :try_start_0
    iget-object v1, p0, Ll/ۜܰܿ;->᩹:Ll/ܳܰܿ;

    .line 194
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 196
    invoke-virtual {v1}, Ll/ܳܰܿ;->֫()V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    .line 194
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩷()V
    .locals 1

    .line 1157
    invoke-direct {p0}, Ll/ۜܰܿ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 1159
    :cond_0
    iget-object v0, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0}, Ll/ۧܰܿ;->᩵()V

    .line 1160
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 1161
    invoke-virtual {v0}, Ll/ۧܰܿ;->᩷()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ۜܰܿ;->֫(I)Z

    return-void
.end method

.method public final declared-synchronized ᩻()Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 186
    :try_start_0
    iget-object v1, p0, Ll/ۜܰܿ;->᩹:Ll/ܳܰܿ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
