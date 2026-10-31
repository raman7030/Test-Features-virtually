.class public Ll/ܺܶۜ;
.super Ll/ۗܺ᩷;
.source "X8B6"


# static fields
.field public static final ۫ۧ:[I

.field public static final synthetic ۬ۧ:I


# instance fields
.field public ֡ۧ:Landroid/widget/TextView;

.field public ֨ۧ:Ll/᩶᩺ۜ;

.field public ۖۧ:Z

.field public ۗۧ:Z

.field public ۘۧ:Z

.field public ۙۧ:Z

.field public ۚۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public ۜۧ:Z

.field public ۠ۧ:Landroid/view/View;

.field public ۡۧ:F

.field public ۢۧ:Landroid/widget/CheckBox;

.field public ܳۧ:I

.field public ܶۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public ܺۧ:Landroid/view/MenuItem;

.field public ܿۧ:Landroid/animation/ValueAnimator;

.field public ᩳۧ:I

.field public ᩴۧ:Ll/ۗۛۜ;

.field public ᩵ۧ:Ll/۬ۛۜ;

.field public ᩶ۧ:Ll/ۡܶۜ;

.field public ᩷ۧ:Landroid/view/View;

.field public ᩸ۧ:Ll/۬۬ܿ;

.field public final ᩹ۧ:Ljava/util/ArrayList;

.field public ᩻ۧ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, -0x1

    const v1, -0x777778

    const/high16 v2, -0x1000000

    .line 86
    filled-new-array {v2, v0, v1}, [I

    move-result-object v0

    sput-object v0, Ll/ܺܶۜ;->۫ۧ:[I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 75
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    .line 91
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܺܶۜ;->᩹ۧ:Ljava/util/ArrayList;

    .line 98
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/ܺܶۜ;->ۚۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/16 v0, 0xff

    .line 108
    iput v0, p0, Ll/ܺܶۜ;->ᩳۧ:I

    return-void
.end method

.method public static synthetic ֡(Ll/ܺܶۜ;)Ll/ۢᩴ;
    .locals 0

    .line 75
    iget-object p0, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    return-object p0
.end method

.method public static synthetic ֫(Ll/ܺܶۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܺܶۜ;->᩻֫()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺܶۜ;F)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܺܶۜ;->ۡۧ:F

    return-void
.end method

.method public static ֫(Ll/ܺܶۜ;I)V
    .locals 2

    .line 651
    iget v0, p0, Ll/ܺܶۜ;->ܳۧ:I

    if-ne p1, v0, :cond_2

    iget-boolean p1, p0, Ll/ܺܶۜ;->ۘۧ:Z

    if-nez p1, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 616
    :cond_0
    iget-boolean p1, p0, Ll/ܺܶۜ;->ۜۧ:Z

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    .line 617
    iput-boolean p1, p0, Ll/ܺܶۜ;->ۜۧ:Z

    .line 618
    iget p1, p0, Ll/ܺܶۜ;->ᩳۧ:I

    const/4 v0, 0x0

    filled-new-array {p1, v0}, [I

    move-result-object p1

    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object p1

    iput-object p1, p0, Ll/ܺܶۜ;->ܿۧ:Landroid/animation/ValueAnimator;

    const-wide/16 v0, 0xb4

    .line 619
    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 620
    iget-object p1, p0, Ll/ܺܶۜ;->ܿۧ:Landroid/animation/ValueAnimator;

    new-instance v0, Ll/֫ܶۜ;

    invoke-direct {v0, p0}, Ll/֫ܶۜ;-><init>(Ll/ܺܶۜ;)V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 624
    iget-object p0, p0, Ll/ܺܶۜ;->ܿۧ:Landroid/animation/ValueAnimator;

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    :cond_2
    :goto_0
    return-void
.end method

.method public static synthetic ֫(Ll/ܺܶۜ;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 621
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Ll/ܺܶۜ;->ᩳۧ:I

    .line 622
    invoke-direct {p0}, Ll/ܺܶۜ;->ܽ֫()V

    return-void
.end method

.method public static synthetic ֫(Ll/ܺܶۜ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    .line 317
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Ll/ܺܶۜ;->۟()V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ܺܶۜ;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/ۖܶۜ;)V
    .locals 0

    .line 312
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 313
    :cond_0
    iget-object p1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iput-object p2, p1, Ll/ۡܶۜ;->ۙ:Ll/ۖܶۜ;

    .line 314
    invoke-direct {p0}, Ll/ܺܶۜ;->ۨ()V

    :cond_1
    :goto_0
    return-void
.end method

.method public static ֫(Ll/ܺܶۜ;Ll/۬۬ܿ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    .line 545
    invoke-virtual {p1}, Ll/۬۬ܿ;->֫()V

    .line 546
    iget-object p1, p0, Ll/ܺܶۜ;->ܶۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Ll/ܺܶۜ;->ܶۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Ll/ܺܶۜ;->᩸ۧ:Ll/۬۬ܿ;

    .line 547
    :cond_0
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_1

    const p1, 0x7f120711

    .line 556
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 548
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-direct {p0}, Ll/ܺܶۜ;->᩻֫()V

    :cond_2
    return-void
.end method

.method public static ֫(Ll/ܺܶۜ;Ll/۬۬ܿ;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/ۗ᩺ۜ;Ljava/util/ArrayList;)V
    .locals 2

    .line 531
    invoke-virtual {p1}, Ll/۬۬ܿ;->֫()V

    .line 532
    iget-object p1, p0, Ll/ܺܶۜ;->ܶۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Ll/ܺܶۜ;->ܶۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Ll/ܺܶۜ;->᩸ۧ:Ll/۬۬ܿ;

    .line 534
    :cond_0
    :try_start_0
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_3

    .line 535
    :cond_1
    new-instance p1, Ll/ܿۙ;

    invoke-direct {p1, p0}, Ll/ܿۙ;-><init>(Ll/ۗܺ᩷;)V

    .line 536
    invoke-virtual {p1}, Ll/ܿۙ;->֫()V

    .line 509
    invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 p4, 0x0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺ۨۜ;

    .line 510
    invoke-virtual {v1}, Ll/᩺ۨۜ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p4, 0x1

    goto :goto_0

    :cond_3
    if-eqz p4, :cond_4

    if-eqz v0, :cond_4

    const-string p2, "*/*"

    goto :goto_1

    :cond_4
    if-eqz v0, :cond_5

    const-string p2, "video/*"

    goto :goto_1

    :cond_5
    const-string p2, "image/*"

    .line 536
    :goto_1
    invoke-virtual {p1, p2}, Ll/ܿۙ;->ۧ(Ljava/lang/String;)V

    .line 537
    invoke-virtual {p3}, Ll/ۗ᩺ۜ;->֫()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/net/Uri;

    invoke-virtual {p1, p4}, Ll/ܿۙ;->֫(Landroid/net/Uri;)V

    goto :goto_2

    .line 538
    :cond_6
    invoke-virtual {p1}, Ll/ܿۙ;->ۧ()V

    .line 539
    invoke-virtual {p3}, Ll/ۗ᩺ۜ;->ܽ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 540
    :try_start_1
    invoke-virtual {p3}, Ll/ۗ᩺ۜ;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 541
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_8

    invoke-direct {p0}, Ll/ܺܶۜ;->᩻֫()V

    return-void

    .line 540
    :cond_7
    :goto_3
    :try_start_2
    invoke-virtual {p3}, Ll/ۗ᩺ۜ;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 541
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_8

    invoke-direct {p0}, Ll/ܺܶۜ;->᩻֫()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_5

    :catchall_1
    move-exception p1

    .line 533
    :try_start_3
    invoke-virtual {p3}, Ll/ۗ᩺ۜ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception p2

    :try_start_4
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catch_0
    const p1, 0x7f120711

    .line 556
    :try_start_5
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 541
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_8

    invoke-direct {p0}, Ll/ܺܶۜ;->᩻֫()V

    :cond_8
    return-void

    :goto_5
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p2

    if-nez p2, :cond_9

    invoke-direct {p0}, Ll/ܺܶۜ;->᩻֫()V

    :cond_9
    throw p1
.end method

.method public static synthetic ֫(Ll/ܺܶۜ;Ll/᩸ܰ;)V
    .locals 5

    const/16 v0, 0x87

    .line 221
    invoke-virtual {p1, v0}, Ll/᩸ܰ;->ۧ(I)Ll/ۧ۬;

    move-result-object p1

    .line 223
    iget-object v0, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    iget v1, p1, Ll/ۧ۬;->ۧ:I

    iget v2, p1, Ll/ۧ۬;->ᩳ:I

    iget v3, p1, Ll/ۧ۬;->ܽ:I

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 224
    iget-object p0, p0, Ll/ܺܶۜ;->᩷ۧ:Landroid/view/View;

    iget v0, p1, Ll/ۧ۬;->ۧ:I

    iget p1, p1, Ll/ۧ۬;->֫:I

    invoke-virtual {p0, v0, v4, v3, p1}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܺܶۜ;Z)V
    .locals 2

    .line 262
    iget-boolean v0, p0, Ll/ܺܶۜ;->ۗۧ:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-boolean v1, v0, Ll/ۡܶۜ;->ۤ:Z

    if-eqz v1, :cond_3

    iget-object v0, v0, Ll/ۡܶۜ;->ۙ:Ll/ۖܶۜ;

    if-nez v0, :cond_0

    goto :goto_1

    .line 263
    :cond_0
    invoke-direct {p0}, Ll/ܺܶۜ;->ܰ()Ll/ᩳۜܳ;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_2

    .line 265
    iget-object p1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object p1, p1, Ll/ۡܶۜ;->ܰ:Ljava/util/HashSet;

    invoke-interface {v0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 267
    :cond_2
    iget-object p1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object p1, p1, Ll/ۡܶۜ;->ܰ:Ljava/util/HashSet;

    invoke-interface {v0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 268
    iget-object p1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object p1, p1, Ll/ۡܶۜ;->᩺:Ljava/util/ArrayList;

    invoke-interface {v0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 270
    :goto_0
    invoke-direct {p0}, Ll/ܺܶۜ;->᩻֫()V

    :cond_3
    :goto_1
    return-void
.end method

.method private ֫(Z)V
    .locals 5

    .line 569
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_8

    iget-boolean v0, p0, Ll/ܺܶۜ;->ۘۧ:Z

    if-eqz v0, :cond_0

    goto/16 :goto_2

    .line 570
    :cond_0
    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    if-eqz v0, :cond_2

    iget-boolean v1, v0, Ll/ۡܶۜ;->ۤ:Z

    if-eqz v1, :cond_2

    iget-object v0, v0, Ll/ۡܶۜ;->ۙ:Ll/ۖܶۜ;

    if-eqz v0, :cond_2

    .line 571
    invoke-direct {p0}, Ll/ܺܶۜ;->ۧ֫()Ljava/util/ArrayList;

    move-result-object v0

    .line 572
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    iget-object v2, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v2, v2, Ll/ۡܶۜ;->۫:Ljava/lang/String;

    const-string v3, "gallery.currentPath"

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    .line 573
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "paths"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    :cond_1
    const/4 v0, -0x1

    .line 574
    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    :cond_2
    const/4 v0, 0x1

    .line 576
    iput-boolean v0, p0, Ll/ܺܶۜ;->ۘۧ:Z

    .line 592
    invoke-direct {p0}, Ll/ܺܶۜ;->ܰ()Ll/ᩳۜܳ;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_3

    goto :goto_0

    .line 594
    :cond_3
    iget-object v3, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v3, v3, Ll/ۡܶۜ;->ۙ:Ll/ۖܶۜ;

    invoke-virtual {v3}, Ll/ۖܶۜ;->ᩳ()Ll/ܰܺܳ;

    move-result-object v3

    instance-of v3, v3, Ll/ۖۧ᩻;

    if-eqz v3, :cond_4

    .line 595
    invoke-interface {v0}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v3

    instance-of v3, v3, Ll/ܳ᩸ܿ;

    if-nez v3, :cond_5

    invoke-interface {v0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Ll/ۡᩴܳ;->ۧ:Ll/ۡᩴܳ;

    const-string v3, "path"

    .line 0
    invoke-static {v0, v3}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    invoke-static {v0, v1}, Ll/ۡᩴܳ;->֫(Ljava/lang/String;Ll/ܿᩴܳ;)V

    goto :goto_0

    .line 596
    :cond_4
    iget-object v3, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v3, v3, Ll/ۡܶۜ;->ۙ:Ll/ۖܶۜ;

    invoke-virtual {v3}, Ll/ۖܶۜ;->ᩳ()Ll/ܰܺܳ;

    move-result-object v3

    instance-of v4, v3, Ll/ۗۢ᩻;

    if-eqz v4, :cond_5

    check-cast v3, Ll/ۗۢ᩻;

    .line 597
    invoke-virtual {v3}, Ll/ۗۢ᩻;->ۜ()Ll/ۗ᩻᩻;

    move-result-object v3

    iget v3, v3, Ll/ۗ᩻᩻;->᩶:I

    invoke-static {v3}, Ll/۫᩻᩻;->ܽ(I)Ll/ۗ᩻᩻;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 599
    invoke-interface {v0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ll/ܿᩴܳ;

    invoke-direct {v4, v3, v2}, Ll/ܿᩴܳ;-><init>(Ll/ۗ᩻᩻;Z)V

    invoke-static {v0, v4}, Ll/ۡᩴܳ;->֫(Ljava/lang/String;Ll/ܿᩴܳ;)V

    .line 628
    :cond_5
    :goto_0
    iget-object v0, p0, Ll/ܺܶۜ;->ܿۧ:Landroid/animation/ValueAnimator;

    if-nez v0, :cond_6

    goto :goto_1

    .line 629
    :cond_6
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 630
    iput-object v1, p0, Ll/ܺܶۜ;->ܿۧ:Landroid/animation/ValueAnimator;

    .line 579
    :goto_1
    invoke-direct {p0}, Ll/ܺܶۜ;->ܳ֫()V

    if-nez p1, :cond_7

    .line 582
    iget-object v0, p0, Ll/ܺܶۜ;->᩵ۧ:Ll/۬ۛۜ;

    invoke-virtual {v0}, Ll/۬ۛۜ;->֫()V

    .line 583
    iget-boolean v0, p0, Ll/ܺܶۜ;->ۙۧ:Z

    if-eqz v0, :cond_7

    invoke-direct {p0, v2}, Ll/ܺܶۜ;->ᩳ(Z)V

    .line 585
    :cond_7
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    if-eqz p1, :cond_8

    .line 587
    invoke-virtual {p0, v2, v2}, Landroid/app/Activity;->overridePendingTransition(II)V

    :cond_8
    :goto_2
    return-void
.end method

.method private ֫֫()V
    .locals 5

    .line 324
    iget-object v0, p0, Ll/ܺܶۜ;->᩵ۧ:Ll/۬ۛۜ;

    .line 325
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 326
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v2

    .line 327
    iget-object v3, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-boolean v3, v3, Ll/ۡܶۜ;->۬:Z

    if-eqz v3, :cond_0

    new-instance v3, Ll/ۚۛۜ;

    invoke-direct {v3, p0}, Ll/ۚۛۜ;-><init>(Ll/ܺܶۜ;)V

    goto :goto_0

    :cond_0
    new-instance v3, Ll/۠ܰۜ;

    const/4 v4, 0x0

    .line 76
    invoke-direct {v3, p0, v4}, Ll/۠ܰۜ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 327
    :goto_0
    iput-object v3, p0, Ll/ܺܶۜ;->᩵ۧ:Ll/۬ۛۜ;

    const v4, 0x7f0a0226

    .line 328
    invoke-virtual {v3, v4}, Landroid/view/View;->setId(I)V

    .line 329
    iget-object v3, p0, Ll/ܺܶۜ;->᩵ۧ:Ll/۬ۛۜ;

    iget-object v4, p0, Ll/ܺܶۜ;->ᩴۧ:Ll/ۗۛۜ;

    invoke-virtual {v3, v4}, Ll/۬ۛۜ;->֫(Ll/ۗۛۜ;)V

    .line 330
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 331
    iget-object v3, p0, Ll/ܺܶۜ;->᩵ۧ:Ll/۬ۛۜ;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {v1, v3, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public static ۖ(Ll/ܺܶۜ;)V
    .locals 1

    const/4 v0, 0x0

    .line 566
    invoke-direct {p0, v0}, Ll/ܺܶۜ;->֫(Z)V

    return-void
.end method

.method public static bridge synthetic ۘ(Ll/ܺܶۜ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    invoke-direct {p0, v0}, Ll/ܺܶۜ;->֫(Z)V

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ܺܶۜ;)Ll/۬ۛۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺܶۜ;->᩵ۧ:Ll/۬ۛۜ;

    return-object p0
.end method

.method private ۟()V
    .locals 1

    const v0, 0x7f120711

    .line 561
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 562
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public static bridge synthetic ۡ(Ll/ܺܶۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܺܶۜ;->ۙۧ:Z

    return p0
.end method

.method public static bridge synthetic ۢ(Ll/ܺܶۜ;)Ll/ۡܶۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ܺܶۜ;I)Ll/ᩳۜܳ;
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܺܶۜ;->ᩳ(I)Ll/ᩳۜܳ;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/ܺܶۜ;)V
    .locals 1

    const/4 v0, 0x0

    .line 566
    invoke-direct {p0, v0}, Ll/ܺܶۜ;->֫(Z)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܺܶۜ;Z)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܺܶۜ;->ܽ(Z)V

    return-void
.end method

.method private ۧ(Z)V
    .locals 8

    .line 280
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 282
    invoke-virtual {v0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 283
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    if-eqz v1, :cond_1

    .line 284
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-nez p1, :cond_1

    const-string p1, "ImageViewerArguments"

    .line 285
    invoke-static {p1}, Ll/ۗۖ᩷;->ۧ(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖܶۜ;

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_6

    .line 287
    invoke-virtual {p1}, Ll/ۖܶۜ;->ᩳ()Ll/ܰܺܳ;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Ll/ۖܶۜ;->ܽ()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Ll/ۖܶۜ;->ܽ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 288
    invoke-virtual {p1}, Ll/ۖܶۜ;->֫()I

    move-result v0

    if-ltz v0, :cond_5

    invoke-virtual {p1}, Ll/ۖܶۜ;->֫()I

    move-result v0

    invoke-virtual {p1}, Ll/ۖܶۜ;->ܽ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_2

    goto :goto_2

    .line 292
    :cond_2
    invoke-virtual {p1}, Ll/ۖܶۜ;->ܽ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۜܳ;

    if-nez v1, :cond_3

    .line 293
    invoke-direct {p0}, Ll/ܺܶۜ;->۟()V

    return-void

    .line 295
    :cond_4
    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    new-instance v1, Ll/ۖܶۜ;

    invoke-virtual {p1}, Ll/ۖܶۜ;->ᩳ()Ll/ܰܺܳ;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ll/ۖܶۜ;->ܽ()Ljava/util/List;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1}, Ll/ۖܶۜ;->֫()I

    move-result v5

    invoke-direct {v1, v3, v4, v5}, Ll/ۖܶۜ;-><init>(Ll/ܰܺܳ;Ljava/util/List;I)V

    iput-object v1, v0, Ll/ۡܶۜ;->ۙ:Ll/ۖܶۜ;

    .line 296
    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iput-boolean v2, v0, Ll/ۡܶۜ;->ۤ:Z

    .line 297
    invoke-virtual {p1}, Ll/ۖܶۜ;->֫()I

    move-result p1

    invoke-direct {p0, p1}, Ll/ܺܶۜ;->ᩳ(I)Ll/ᩳۜܳ;

    move-result-object p1

    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Ll/ۡܶۜ;->۫:Ljava/lang/String;

    .line 298
    invoke-direct {p0}, Ll/ܺܶۜ;->ۨ()V

    return-void

    .line 289
    :cond_5
    :goto_2
    invoke-direct {p0}, Ll/ܺܶۜ;->۟()V

    return-void

    .line 301
    :cond_6
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v5

    .line 305
    iget-object v7, p0, Ll/ܺܶۜ;->ۚۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 306
    new-instance v6, Ljava/util/ArrayList;

    iget-object p1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object p1, p1, Ll/ۡܶۜ;->᩺:Ljava/util/ArrayList;

    invoke-direct {v6, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 307
    sget-object p1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ll/᩻ܶۜ;

    move-object v2, v0

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Ll/᩻ܶۜ;-><init>(Ll/ܺܶۜ;ZLandroid/net/Uri;Ljava/util/ArrayList;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private ۧ֫()Ljava/util/ArrayList;
    .locals 6

    .line 672
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 673
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 674
    iget-object v2, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v2, v2, Ll/ۡܶۜ;->᩺:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 675
    iget-object v4, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v4, v4, Ll/ۡܶۜ;->ܰ:Ljava/util/HashSet;

    invoke-virtual {v4, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 676
    :cond_1
    iget-object v2, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v2, v2, Ll/ۡܶۜ;->ۙ:Ll/ۖܶۜ;

    if-eqz v2, :cond_3

    .line 677
    invoke-virtual {v2}, Ll/ۖܶۜ;->ܽ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 678
    iget-object v4, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v4, v4, Ll/ۡܶۜ;->ܰ:Ljava/util/HashSet;

    invoke-interface {v3}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    return-object v0
.end method

.method private ۨ()V
    .locals 6

    .line 350
    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v0, v0, Ll/ۡܶۜ;->ۙ:Ll/ۖܶۜ;

    .line 351
    invoke-virtual {v0}, Ll/ۖܶۜ;->֫()I

    move-result v1

    .line 352
    iget-object v2, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v2, v2, Ll/ۡܶۜ;->۫:Ljava/lang/String;

    if-eqz v2, :cond_2

    const/4 v1, 0x0

    .line 354
    :goto_0
    invoke-virtual {v0}, Ll/ۖܶۜ;->ܽ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 355
    iget-object v2, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v2, v2, Ll/ۡܶۜ;->۫:Ljava/lang/String;

    invoke-direct {p0, v1}, Ll/ܺܶۜ;->ᩳ(I)Ll/ᩳۜܳ;

    move-result-object v3

    invoke-interface {v3}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :cond_2
    :goto_1
    if-ltz v1, :cond_6

    .line 357
    invoke-virtual {v0}, Ll/ۖܶۜ;->ܽ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v1, v2, :cond_3

    goto :goto_3

    .line 359
    :cond_3
    :try_start_0
    invoke-virtual {v0}, Ll/ۖܶۜ;->ܽ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v4, p0, Ll/ܺܶۜ;->᩹ۧ:Ljava/util/ArrayList;

    if-eqz v3, :cond_4

    :try_start_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 360
    invoke-virtual {v0}, Ll/ۖܶۜ;->ᩳ()Ll/ܰܺܳ;

    move-result-object v5

    invoke-static {p0, v5, v3}, Ll/᩺ۨۜ;->֫(Ll/ܺܶۜ;Ll/ܰܺܳ;Ll/ᩳۜܳ;)Ll/᩺ۨۜ;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 361
    :cond_4
    new-instance v0, Ll/᩶᩺ۜ;

    invoke-direct {v0, p0, v4}, Ll/᩶᩺ۜ;-><init>(Ll/ܺܶۜ;Ljava/util/ArrayList;)V

    iput-object v0, p0, Ll/ܺܶۜ;->֨ۧ:Ll/᩶᩺ۜ;

    .line 362
    invoke-virtual {p0}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v2

    invoke-virtual {v2}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v2

    sget-object v3, Ll/ܰۢ֫;->ۗ:Ll/ܰۢ֫;

    invoke-virtual {v2, v3}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result v2

    invoke-virtual {v0, v2}, Ll/᩶᩺ۜ;->֫(Z)V

    .line 363
    iget-object v0, p0, Ll/ܺܶۜ;->֨ۧ:Ll/᩶᩺ۜ;

    new-instance v2, Ll/ۜ۫᩻;

    const/4 v3, 0x2

    invoke-direct {v2, v3, p0}, Ll/ۜ۫᩻;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Ll/᩶᩺ۜ;->֫(Ll/ۜ۫᩻;)V

    .line 364
    iget-object v0, p0, Ll/ܺܶۜ;->֨ۧ:Ll/᩶᩺ۜ;

    iget-object v2, p0, Ll/ܺܶۜ;->᩵ۧ:Ll/۬ۛۜ;

    invoke-virtual {v0, v2, v1}, Ll/᩶᩺ۜ;->֫(Ll/۬ۛۜ;I)V

    .line 365
    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v0, v0, Ll/ۡܶۜ;->۟:Landroid/os/Bundle;

    if-eqz v0, :cond_5

    iget-object v2, p0, Ll/ܺܶۜ;->᩵ۧ:Ll/۬ۛۜ;

    invoke-virtual {v2, v0}, Ll/۬ۛۜ;->֫(Landroid/os/Bundle;)Z

    .line 366
    :cond_5
    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    invoke-direct {p0, v1}, Ll/ܺܶۜ;->ᩳ(I)Ll/ᩳۜܳ;

    move-result-object v1

    invoke-interface {v1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۡܶۜ;->۫:Ljava/lang/String;

    .line 367
    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-boolean v0, v0, Ll/ۡܶۜ;->ۗ:Z

    invoke-direct {p0, v0}, Ll/ܺܶۜ;->ܽ(Z)V

    .line 368
    invoke-direct {p0}, Ll/ܺܶۜ;->᩻֫()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    .line 369
    :catch_0
    invoke-direct {p0}, Ll/ܺܶۜ;->۟()V

    return-void

    .line 357
    :cond_6
    :goto_3
    invoke-direct {p0}, Ll/ܺܶۜ;->۟()V

    return-void
.end method

.method private ܰ()Ll/ᩳۜܳ;
    .locals 2

    .line 374
    iget-object v0, p0, Ll/ܺܶۜ;->᩵ۧ:Ll/۬ۛۜ;

    invoke-virtual {v0}, Ll/۬ۛۜ;->ۧ()I

    move-result v0

    .line 375
    iget-object v1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v1, v1, Ll/ۡܶۜ;->ۙ:Ll/ۖܶۜ;

    if-eqz v1, :cond_1

    if-ltz v0, :cond_1

    invoke-virtual {v1}, Ll/ۖܶۜ;->ܽ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, v0}, Ll/ܺܶۜ;->ᩳ(I)Ll/ᩳۜܳ;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static bridge synthetic ܳ(Ll/ܺܶۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܺܶۜ;->ۖۧ:Z

    return p0
.end method

.method private ܳ֫()V
    .locals 3

    .line 417
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 418
    :cond_0
    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-boolean v0, v0, Ll/ۡܶۜ;->ۗ:Z

    const/4 v1, 0x7

    if-nez v0, :cond_2

    iget v0, p0, Ll/ܺܶۜ;->ۡۧ:F

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    if-gtz v0, :cond_2

    iget-boolean v0, p0, Ll/ܺܶۜ;->ۘۧ:Z

    if-eqz v0, :cond_1

    goto :goto_0

    .line 420
    :cond_1
    invoke-virtual {p0}, Ll/ۗܺ᩷;->᩸()Ll/۫ܰ;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/۫ܰ;->֫(I)V

    return-void

    .line 419
    :cond_2
    :goto_0
    invoke-virtual {p0}, Ll/ۗܺ᩷;->᩸()Ll/۫ܰ;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/۫ܰ;->ܽ(I)V

    :cond_3
    :goto_1
    return-void
.end method

.method public static bridge synthetic ܺ(Ll/ܺܶۜ;)Ll/ᩳۜܳ;
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܺܶۜ;->ܰ()Ll/ᩳۜܳ;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Ll/ܺܶۜ;)V
    .locals 6

    .line 517
    iget-object v0, p0, Ll/ܺܶۜ;->᩹ۧ:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܺܶۜ;->֨ۧ:Ll/᩶᩺ۜ;

    if-eqz v1, :cond_4

    iget-object v1, p0, Ll/ܺܶۜ;->ܶۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-nez v1, :cond_4

    invoke-direct {p0}, Ll/ܺܶۜ;->ܰ()Ll/ᩳۜܳ;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 518
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 519
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_2

    .line 520
    iget-object v4, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v4, v4, Ll/ۡܶۜ;->ܰ:Ljava/util/HashSet;

    invoke-direct {p0, v3}, Ll/ܺܶۜ;->ᩳ(I)Ll/ᩳۜܳ;

    move-result-object v5

    invoke-interface {v5}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩺ۨۜ;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 521
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Ll/ܺܶۜ;->᩵ۧ:Ll/۬ۛۜ;

    invoke-virtual {v3}, Ll/۬ۛۜ;->ۧ()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ۨۜ;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 522
    :cond_3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/ܺܶۜ;->ܶۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 523
    new-instance v3, Ll/۬۬ܿ;

    const v4, 0x7f120797

    invoke-direct {v3, p0, v4}, Ll/۬۬ܿ;-><init>(Ll/ۗܺ᩷;I)V

    iput-object v3, p0, Ll/ܺܶۜ;->᩸ۧ:Ll/۬۬ܿ;

    .line 524
    new-instance v4, Ll/ۛ᩷ᩳ;

    const/4 v5, 0x4

    invoke-direct {v4, v5, v0}, Ll/ۛ᩷ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v3, v4}, Ll/۬۬ܿ;->֫(Ljava/lang/Runnable;)V

    const/16 v4, 0xc8

    .line 525
    invoke-virtual {v3, v4}, Ll/۬۬ܿ;->ܽ(I)V

    .line 526
    iget-object v4, p0, Ll/ܺܶۜ;->۠ۧ:Landroid/view/View;

    invoke-virtual {v4, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 527
    sget-object v2, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v4, Ll/᩺۠ۜ;

    invoke-direct {v4, p0, v1, v0, v3}, Ll/᩺۠ۜ;-><init>(Ll/ܺܶۜ;Ljava/util/ArrayList;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/۬۬ܿ;)V

    invoke-interface {v2, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public static ܽ(Ll/ܺܶۜ;I)V
    .locals 6

    .line 489
    iget-object v0, p0, Ll/ܺܶۜ;->᩹ۧ:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܺܶۜ;->֨ۧ:Ll/᩶᩺ۜ;

    if-eqz v1, :cond_5

    iget-boolean v1, p0, Ll/ܺܶۜ;->ۘۧ:Z

    if-nez v1, :cond_5

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_5

    if-ltz p1, :cond_5

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt p1, v1, :cond_0

    goto :goto_2

    .line 490
    :cond_0
    invoke-direct {p0, p1}, Ll/ܺܶۜ;->ᩳ(I)Ll/ᩳۜܳ;

    move-result-object v1

    .line 491
    invoke-static {v1}, Ll/ۜۚۜ;->֫(Ll/ᩳۜܳ;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_2

    .line 492
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, -0x1

    const/4 v4, 0x0

    .line 494
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_4

    .line 495
    invoke-direct {p0, v4}, Ll/ܺܶۜ;->ᩳ(I)Ll/ᩳۜܳ;

    move-result-object v5

    invoke-static {v5}, Ll/ۜۚۜ;->֫(Ll/ᩳۜܳ;)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    if-ne v4, p1, :cond_3

    .line 496
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 497
    :cond_3
    invoke-direct {p0, v4}, Ll/ܺܶۜ;->ᩳ(I)Ll/ᩳۜܳ;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 499
    :cond_4
    invoke-direct {p0}, Ll/ܺܶۜ;->᩺()V

    .line 500
    new-instance p1, Ll/ۖܶۜ;

    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v0, v0, Ll/ۡܶۜ;->ۙ:Ll/ۖܶۜ;

    invoke-virtual {v0}, Ll/ۖܶۜ;->ᩳ()Ll/ܰܺܳ;

    move-result-object v0

    invoke-direct {p1, v0, v2, v3}, Ll/ۖܶۜ;-><init>(Ll/ܰܺܳ;Ljava/util/List;I)V

    const-class v0, Ll/ܺܶۜ;

    const-string v2, "VideoPlayerArguments"

    invoke-static {v0, p1, v2}, Ll/ۗۖ᩷;->֫(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)V

    .line 501
    new-instance p1, Landroid/content/Intent;

    const-class v0, Ll/ۤۤۜ;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 502
    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v0, v0, Ll/ۡܶۜ;->ۙ:Ll/ۖܶۜ;

    invoke-virtual {v0}, Ll/ۖܶۜ;->ᩳ()Ll/ܰܺܳ;

    move-result-object v0

    invoke-static {p0, p1, v0, v1}, Ll/ۤۤۜ;->֫(Ll/ۗܺ᩷;Landroid/content/Intent;Ll/ܰܺܳ;Ll/ᩳۜܳ;)V

    .line 503
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ܺܶۜ;Z)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܺܶۜ;->ᩳ(Z)V

    return-void
.end method

.method private ܽ(Z)V
    .locals 3

    .line 409
    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iput-boolean p1, v0, Ll/ۡܶۜ;->ۗ:Z

    .line 411
    iget-object v0, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    const/4 v1, 0x4

    if-eqz p1, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/4 v2, 0x4

    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 412
    iget-object v0, p0, Ll/ܺܶۜ;->᩷ۧ:Landroid/view/View;

    if-eqz p1, :cond_1

    const/4 v1, 0x0

    :cond_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 413
    invoke-direct {p0}, Ll/ܺܶۜ;->ܳ֫()V

    return-void
.end method

.method private ܽ֫()V
    .locals 4

    const v0, 0x7f0a02f3

    .line 610
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    iget v1, p0, Ll/ܺܶۜ;->ᩳۧ:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 611
    :cond_0
    sget-object v2, Ll/ܺܶۜ;->۫ۧ:[I

    iget v3, p0, Ll/ܺܶۜ;->᩻ۧ:I

    aget v2, v2, v3

    const v3, 0xffffff

    and-int/2addr v2, v3

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v1, v2

    .line 610
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public static bridge synthetic ܿ(Ll/ܺܶۜ;)F
    .locals 0

    .line 0
    iget p0, p0, Ll/ܺܶۜ;->ۡۧ:F

    return p0
.end method

.method private ܿ֫()V
    .locals 3

    .line 605
    iget-object v0, p0, Ll/ܺܶۜ;->᩵ۧ:Ll/۬ۛۜ;

    sget-object v1, Ll/ܺܶۜ;->۫ۧ:[I

    iget v2, p0, Ll/ܺܶۜ;->᩻ۧ:I

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Ll/۬ۛۜ;->ܽ(I)V

    .line 606
    invoke-direct {p0}, Ll/ܺܶۜ;->ܽ֫()V

    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/ܺܶۜ;)Landroid/view/View;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺܶۜ;->᩷ۧ:Landroid/view/View;

    return-object p0
.end method

.method private ᩳ(I)Ll/ᩳۜܳ;
    .locals 1

    .line 372
    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v0, v0, Ll/ۡܶۜ;->ۙ:Ll/ۖܶۜ;

    invoke-virtual {v0}, Ll/ۖܶۜ;->ܽ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳۜܳ;

    return-object p1
.end method

.method private ᩳ(Z)V
    .locals 9

    if-eqz p1, :cond_0

    .line 636
    iget-boolean v0, p0, Ll/ܺܶۜ;->ۙۧ:Z

    if-eqz v0, :cond_0

    goto :goto_2

    .line 637
    :cond_0
    iget v0, p0, Ll/ܺܶۜ;->ܳۧ:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ll/ܺܶۜ;->ܳۧ:I

    .line 628
    iget-object v2, p0, Ll/ܺܶۜ;->ܿۧ:Landroid/animation/ValueAnimator;

    const/4 v3, 0x0

    if-nez v2, :cond_1

    goto :goto_0

    .line 629
    :cond_1
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->cancel()V

    .line 630
    iput-object v3, p0, Ll/ܺܶۜ;->ܿۧ:Landroid/animation/ValueAnimator;

    :goto_0
    const/4 v2, 0x0

    .line 639
    iput-boolean v2, p0, Ll/ܺܶۜ;->ۜۧ:Z

    const/16 v4, 0xff

    .line 640
    iput v4, p0, Ll/ܺܶۜ;->ᩳۧ:I

    .line 641
    invoke-direct {p0}, Ll/ܺܶۜ;->ܿ֫()V

    .line 643
    const-class v4, Landroid/app/Activity;

    if-eqz p1, :cond_2

    :try_start_0
    const-string v5, "android.app.Activity$TranslucentConversionListener"

    .line 645
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    .line 646
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    new-array v7, v1, [Ljava/lang/Class;

    aput-object v5, v7, v2

    new-instance v8, Ll/ۧܶۜ;

    invoke-direct {v8, p0, v0}, Ll/ۧܶۜ;-><init>(Ll/ܺܶۜ;I)V

    invoke-static {v6, v7, v8}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    const-string v6, "convertToTranslucent"

    const/4 v7, 0x2

    new-array v8, v7, [Ljava/lang/Class;

    aput-object v5, v8, v2

    .line 657
    const-class v5, Landroid/app/ActivityOptions;

    aput-object v5, v8, v1

    invoke-virtual {v4, v6, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    new-array v5, v7, [Ljava/lang/Object;

    aput-object v0, v5, v2

    aput-object v3, v5, v1

    .line 658
    invoke-virtual {v4, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 659
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_3

    .line 660
    invoke-virtual {p0, v2}, Landroid/app/Activity;->setTranslucent(Z)Z

    goto :goto_1

    :cond_3
    const-string v0, "convertFromTranslucent"

    .line 662
    invoke-virtual {v4, v0, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 664
    :goto_1
    iput-boolean p1, p0, Ll/ܺܶۜ;->ۙۧ:Z
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_2
    return-void
.end method

.method private ᩳ֫()V
    .locals 3

    .line 451
    invoke-direct {p0}, Ll/ܺܶۜ;->ܰ()Ll/ᩳۜܳ;

    move-result-object v0

    .line 452
    iget-object v1, p0, Ll/ܺܶۜ;->ܺۧ:Landroid/view/MenuItem;

    if-eqz v1, :cond_1

    instance-of v2, v0, Ll/ۢۧ᩻;

    if-eqz v2, :cond_0

    .line 453
    check-cast v0, Ll/ܺۘܳ;

    invoke-virtual {v0}, Ll/ܺۘܳ;->getName()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, ".9.png"

    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܺܶۜ;->֨ۧ:Ll/᩶᩺ۜ;

    if-eqz v0, :cond_0

    iget-object v2, p0, Ll/ܺܶۜ;->᩵ۧ:Ll/۬ۛۜ;

    .line 454
    invoke-virtual {v2}, Ll/۬ۛۜ;->ۧ()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/᩶᩺ۜ;->֫(I)Ll/ܶۨۜ;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 452
    :goto_0
    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :cond_1
    return-void
.end method

.method public static bridge synthetic ᩴ(Ll/ܺܶۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܺܶۜ;->ܳ֫()V

    return-void
.end method

.method public static bridge synthetic ᩵(Ll/ܺܶۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܺܶۜ;->᩻֫()V

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ܺܶۜ;)Ll/᩶᩺ۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺܶۜ;->֨ۧ:Ll/᩶᩺ۜ;

    return-object p0
.end method

.method private ᩺()V
    .locals 3

    .line 684
    iget-object v0, p0, Ll/ܺܶۜ;->֨ۧ:Ll/᩶᩺ۜ;

    if-eqz v0, :cond_2

    invoke-direct {p0}, Ll/ܺܶۜ;->ܰ()Ll/ᩳۜܳ;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 685
    :cond_0
    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    invoke-direct {p0}, Ll/ܺܶۜ;->ܰ()Ll/ᩳۜܳ;

    move-result-object v1

    invoke-interface {v1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۡܶۜ;->۫:Ljava/lang/String;

    .line 686
    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v1, p0, Ll/ܺܶۜ;->᩵ۧ:Ll/۬ۛۜ;

    invoke-virtual {v1}, Ll/۬ۛۜ;->ܳ()Landroid/os/Bundle;

    move-result-object v1

    iput-object v1, v0, Ll/ۡܶۜ;->۟:Landroid/os/Bundle;

    .line 687
    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    .line 688
    iget-boolean v1, v0, Ll/ۡܶۜ;->ۤ:Z

    if-eqz v1, :cond_1

    iget-object v1, v0, Ll/ۡܶۜ;->ۙ:Ll/ۖܶۜ;

    .line 687
    invoke-virtual {v1}, Ll/ۖܶۜ;->ᩳ()Ll/ܰܺܳ;

    move-result-object v1

    sget-object v2, Ll/ۖۧ᩻;->᩹:Ll/ۖۧ᩻;

    if-ne v1, v2, :cond_1

    .line 688
    invoke-direct {p0}, Ll/ܺܶۜ;->ܰ()Ll/ᩳۜܳ;

    move-result-object v1

    instance-of v1, v1, Ll/ۢۧ᩻;

    if-eqz v1, :cond_1

    invoke-direct {p0}, Ll/ܺܶۜ;->ܰ()Ll/ᩳۜܳ;

    move-result-object v1

    invoke-interface {v1}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 689
    invoke-direct {p0}, Ll/ܺܶۜ;->ܰ()Ll/ᩳۜܳ;

    move-result-object v1

    invoke-interface {v1}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܶۧ()Landroid/net/Uri;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iput-object v1, v0, Ll/ۡܶۜ;->ۛ:Landroid/net/Uri;

    :cond_2
    :goto_1
    return-void
.end method

.method public static bridge synthetic ᩻(Ll/ܺܶۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܺܶۜ;->ۘۧ:Z

    return p0
.end method

.method private ᩻֫()V
    .locals 14

    .line 379
    invoke-direct {p0}, Ll/ܺܶۜ;->ܰ()Ll/ᩳۜܳ;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 381
    :cond_0
    iget-object v1, p0, Ll/ܺܶۜ;->᩵ۧ:Ll/۬ۛۜ;

    invoke-virtual {v1}, Ll/۬ۛۜ;->ۧ()I

    move-result v1

    .line 382
    invoke-interface {v0}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 383
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Ll/ܺܶۜ;->᩹ۧ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v3, v5, v6

    const/4 v3, 0x1

    aput-object v4, v5, v3

    const-string v4, "%d/%d"

    invoke-static {v2, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 384
    iget-object v4, p0, Ll/ܺܶۜ;->֡ۧ:Landroid/widget/TextView;

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 385
    iget-object v4, p0, Ll/ܺܶۜ;->᩵ۧ:Ll/۬ۛۜ;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v0}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 386
    iget-object v2, p0, Ll/ܺܶۜ;->֨ۧ:Ll/᩶᩺ۜ;

    invoke-virtual {v2, v1}, Ll/᩶᩺ۜ;->֫(I)Ll/ܶۨۜ;

    move-result-object v2

    const/4 v4, 0x0

    if-nez v2, :cond_2

    .line 387
    iget-object v2, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    iget-object v5, p0, Ll/ܺܶۜ;->֨ۧ:Ll/᩶᩺ۜ;

    invoke-virtual {v5, v1}, Ll/᩶᩺ۜ;->ۧ(I)Z

    move-result v1

    if-eqz v1, :cond_1

    const v1, 0x7f120711

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v4

    :goto_0
    invoke-virtual {v2, v1}, Ll/ۢᩴ;->setSubtitle(Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    :cond_2
    iget v1, v2, Ll/ܶۨۜ;->ۜ:I

    iget v5, v2, Ll/ܶۨۜ;->ۧ:I

    iget-object v7, v2, Ll/ܶۨۜ;->᩻:Ll/ۨۨۜ;

    .line 389
    iget-wide v8, v2, Ll/ܶۨۜ;->֫:J

    const-wide/16 v10, 0x0

    cmp-long v12, v8, v10

    if-ltz v12, :cond_3

    goto :goto_1

    :cond_3
    iget-wide v8, v7, Ll/ۨۨۜ;->ۧ:J

    :goto_1
    cmp-long v12, v8, v10

    if-gtz v12, :cond_4

    .line 390
    invoke-interface {v0}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v8

    .line 391
    :cond_4
    iget-wide v12, v7, Ll/ۨۨۜ;->ܽ:J

    cmp-long v7, v12, v10

    if-ltz v7, :cond_5

    invoke-static {v12, v13}, Ll/᩺ۤۡ;->ۧ(J)Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    :cond_5
    move-object v7, v4

    .line 392
    :goto_2
    iget v2, v2, Ll/ܶۨۜ;->ᩳ:I

    const/4 v12, 0x5

    if-lt v2, v12, :cond_6

    move v13, v5

    goto :goto_3

    :cond_6
    move v13, v1

    :goto_3
    if-lt v2, v12, :cond_7

    goto :goto_4

    :cond_7
    move v1, v5

    .line 394
    :goto_4
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v2, "x"

    const-string v5, ")"

    const-string v12, "("

    .line 0
    invoke-static {v12, v13, v2, v5, v1}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    .line 395
    invoke-static {v0}, Ll/ۜۚۜ;->֫(Ll/ᩳۜܳ;)Z

    move-result v2

    const-string v5, "  "

    if-eqz v2, :cond_8

    if-nez v7, :cond_a

    const-string v7, ""

    goto :goto_5

    :cond_8
    if-nez v7, :cond_9

    move-object v7, v1

    goto :goto_5

    .line 0
    :cond_9
    invoke-static {v7, v5, v1}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 397
    :cond_a
    :goto_5
    iget-object v1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    cmp-long v2, v8, v10

    if-lez v2, :cond_b

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v8, v9}, Ll/ܿۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    :cond_b
    invoke-virtual {v1, v7}, Ll/ۢᩴ;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 399
    :goto_6
    iput-boolean v3, p0, Ll/ܺܶۜ;->ۗۧ:Z

    .line 400
    iget-object v1, p0, Ll/ܺܶۜ;->ۢۧ:Landroid/widget/CheckBox;

    iget-object v2, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-boolean v2, v2, Ll/ۡܶۜ;->ۤ:Z

    if-eqz v2, :cond_c

    const/4 v2, 0x0

    goto :goto_7

    :cond_c
    const/16 v2, 0x8

    :goto_7
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 401
    iget-object v1, p0, Ll/ܺܶۜ;->ۢۧ:Landroid/widget/CheckBox;

    iget-object v2, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v2, v2, Ll/ۡܶۜ;->ܰ:Ljava/util/HashSet;

    invoke-interface {v0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 402
    iget-object v0, p0, Ll/ܺܶۜ;->ۢۧ:Landroid/widget/CheckBox;

    iget-object v1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v1, v1, Ll/ۡܶۜ;->ܰ:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_8

    :cond_d
    iget-object v1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v1, v1, Ll/ۡܶۜ;->ܰ:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    :goto_8
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 403
    iput-boolean v6, p0, Ll/ܺܶۜ;->ۗۧ:Z

    .line 404
    iget-object v0, p0, Ll/ܺܶۜ;->۠ۧ:Landroid/view/View;

    iget-object v1, p0, Ll/ܺܶۜ;->ܶۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-nez v1, :cond_e

    const/4 v6, 0x1

    :cond_e
    invoke-virtual {v0, v6}, Landroid/view/View;->setEnabled(Z)V

    .line 405
    invoke-direct {p0}, Ll/ܺܶۜ;->ᩳ֫()V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 8

    const/4 v0, 0x0

    .line 139
    iput-boolean v0, p0, Ll/ۗܺ᩷;->ۗ֫:Z

    const v1, 0x7f13000f

    .line 140
    invoke-virtual {p0, v1}, Ll/֨ܿ;->setTheme(I)V

    .line 141
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    .line 142
    new-instance v1, Ll/ۙܺ֫;

    invoke-direct {v1, p0}, Ll/ۙܺ֫;-><init>(Ll/۬ܺ֫;)V

    const-class v2, Ll/ۡܶۜ;

    invoke-virtual {v1, v2}, Ll/ۙܺ֫;->֫(Ljava/lang/Class;)Ll/ۚܺ֫;

    move-result-object v1

    check-cast v1, Ll/ۡܶۜ;

    iput-object v1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    const v1, 0x7f0d0033

    .line 143
    invoke-virtual {p0, v1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const v1, 0x7f0a0226

    .line 144
    invoke-virtual {p0, v1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/۬ۛۜ;

    iput-object v1, p0, Ll/ܺܶۜ;->᩵ۧ:Ll/۬ۛۜ;

    .line 145
    iget-object v1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-boolean v1, v1, Ll/ۡܶۜ;->ۨ:Z

    const/4 v4, 0x1

    if-nez v1, :cond_1

    .line 146
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "pvc"

    invoke-interface {v1, v2, v0}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 147
    iget-object v2, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string v3, "gallery.continuous"

    invoke-virtual {p1, v3, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    :goto_0
    iput-boolean v1, v2, Ll/ۡܶۜ;->۬:Z

    .line 148
    iget-object v1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iput-boolean v4, v1, Ll/ۡܶۜ;->ۨ:Z

    .line 150
    :cond_1
    iget-object v1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-boolean v1, v1, Ll/ۡܶۜ;->۬:Z

    if-eqz v1, :cond_2

    invoke-direct {p0}, Ll/ܺܶۜ;->֫֫()V

    :cond_2
    const v1, 0x7f0a0090

    .line 151
    invoke-virtual {p0, v1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Ll/ܺܶۜ;->᩷ۧ:Landroid/view/View;

    const v1, 0x7f0a063a

    .line 152
    invoke-virtual {p0, v1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ۢᩴ;

    iput-object v1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    const v1, 0x7f0a00da

    .line 153
    invoke-virtual {p0, v1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    iput-object v1, p0, Ll/ܺܶۜ;->ۢۧ:Landroid/widget/CheckBox;

    const v1, 0x7f0a0292

    .line 154
    invoke-virtual {p0, v1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/ܺܶۜ;->֡ۧ:Landroid/widget/TextView;

    const v1, 0x7f0a03f0

    .line 155
    invoke-virtual {p0, v1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Ll/ܺܶۜ;->۠ۧ:Landroid/view/View;

    .line 200
    iget-object v1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    invoke-virtual {p0, v1}, Ll/ۗܺ᩷;->֫(Ll/ۢᩴ;)V

    .line 201
    invoke-virtual {p0}, Ll/ۗܺ᩷;->ۗ()V

    .line 202
    iget-object v1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    new-instance v2, Ll/ܽܶۜ;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p0}, Ll/ܽܶۜ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 203
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    .line 204
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1c

    const/4 v5, 0x3

    if-lt v2, v3, :cond_4

    .line 205
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    const/16 v6, 0x1e

    if-lt v2, v6, :cond_3

    const/4 v2, 0x3

    goto :goto_1

    :cond_3
    const/4 v2, 0x1

    .line 208
    :goto_1
    invoke-static {v3, v2}, Ll/ۧ۬֫;->֫(Landroid/view/WindowManager$LayoutParams;I)V

    .line 209
    invoke-virtual {v1, v3}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    :cond_4
    const v2, 0x106000d

    .line 211
    invoke-virtual {v1, v2}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 212
    invoke-static {v1, v0}, Ll/ۙ᩺;->֫(Landroid/view/Window;Z)V

    .line 213
    invoke-virtual {v1, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 214
    invoke-virtual {v1, v0}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 215
    invoke-virtual {p0}, Ll/ۗܺ᩷;->᩸()Ll/۫ܰ;

    move-result-object v1

    .line 216
    invoke-virtual {v1, v0}, Ll/۫ܰ;->ۧ(Z)V

    .line 217
    invoke-virtual {v1, v0}, Ll/۫ܰ;->֫(Z)V

    const/4 v2, 0x2

    .line 218
    invoke-virtual {v1, v2}, Ll/۫ܰ;->ۧ(I)V

    const v1, 0x7f0a02f3

    .line 219
    invoke-virtual {p0, v1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Ll/ܽ۫᩷;

    const/4 v3, 0x5

    invoke-direct {v2, v3, p0}, Ll/ܽ۫᩷;-><init>(ILjava/lang/Object;)V

    invoke-static {v1, v2}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܽۨ;)V

    .line 227
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "pvbi"

    invoke-interface {v1, v2, v0}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Ll/ܺܶۜ;->᩻ۧ:I

    if-ltz v1, :cond_5

    if-lt v1, v5, :cond_6

    .line 228
    :cond_5
    iput v0, p0, Ll/ܺܶۜ;->᩻ۧ:I

    .line 229
    :cond_6
    invoke-direct {p0}, Ll/ܺܶۜ;->ܿ֫()V

    .line 230
    new-instance v1, Ll/ۢܶۜ;

    invoke-direct {v1, p0}, Ll/ۢܶۜ;-><init>(Ll/ܺܶۜ;)V

    iput-object v1, p0, Ll/ܺܶۜ;->ᩴۧ:Ll/ۗۛۜ;

    .line 258
    iget-object v2, p0, Ll/ܺܶۜ;->᩵ۧ:Ll/۬ۛۜ;

    invoke-virtual {v2, v1}, Ll/۬ۛۜ;->֫(Ll/ۗۛۜ;)V

    .line 259
    iget-object v1, p0, Ll/ܺܶۜ;->ۢۧ:Landroid/widget/CheckBox;

    invoke-virtual {v1, v0}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 260
    iget-object v1, p0, Ll/ܺܶۜ;->ۢۧ:Landroid/widget/CheckBox;

    const v2, 0x7f120600

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 261
    iget-object v1, p0, Ll/ܺܶۜ;->ۢۧ:Landroid/widget/CheckBox;

    new-instance v2, Ll/ᩳܶۜ;

    invoke-direct {v2, p0}, Ll/ᩳܶۜ;-><init>(Ll/ܺܶۜ;)V

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 272
    iget-object v1, p0, Ll/ܺܶۜ;->۠ۧ:Landroid/view/View;

    const v2, 0x7f120606

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 273
    iget-object v1, p0, Ll/ܺܶۜ;->۠ۧ:Landroid/view/View;

    new-instance v2, Ll/ܿܶۜ;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Ll/ܿܶۜ;-><init>(Ll/ۗܺ᩷;I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 274
    iget-object v1, p0, Ll/ܺܶۜ;->۠ۧ:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 275
    iget-object v1, p0, Ll/ܺܶۜ;->ۢۧ:Landroid/widget/CheckBox;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 276
    iget-object v1, p0, Ll/ܺܶۜ;->֡ۧ:Landroid/widget/TextView;

    const v2, 0x7f120528

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    if-eqz p1, :cond_7

    .line 158
    invoke-direct {p0, v0}, Ll/ܺܶۜ;->ᩳ(Z)V

    .line 159
    :cond_7
    invoke-virtual {p0}, Ll/᩻ܽ;->getOnBackPressedDispatcher()Ll/ۨܽ;

    move-result-object v1

    new-instance v2, Ll/᩷ܶۜ;

    invoke-direct {v2, p0}, Ll/᩷ܶۜ;-><init>(Ll/ܺܶۜ;)V

    invoke-virtual {v1, p0, v2}, Ll/ۨܽ;->֫(Ll/᩻ۡ֫;Ll/֡ܽ;)V

    .line 162
    iget-object v1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v2, v1, Ll/ۡܶۜ;->ۙ:Ll/ۖܶۜ;

    if-eqz v2, :cond_8

    .line 163
    invoke-direct {p0}, Ll/ܺܶۜ;->ۨ()V

    return-void

    :cond_8
    if-eqz p1, :cond_c

    const-string v2, "gallery.internal"

    .line 166
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, v1, Ll/ۡܶۜ;->ۤ:Z

    .line 167
    iget-object v1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    const-string v2, "gallery.path"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Ll/ۡܶۜ;->۫:Ljava/lang/String;

    .line 168
    iget-object v1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    const-string v2, "gallery.viewport"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    iput-object v2, v1, Ll/ۡܶۜ;->۟:Landroid/os/Bundle;

    .line 169
    iget-object v1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    const-string v2, "gallery.bars"

    invoke-virtual {p1, v2, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, v1, Ll/ۡܶۜ;->ۗ:Z

    .line 170
    iget-object v1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-boolean v1, v1, Ll/ۡܶۜ;->ۤ:Z

    if-eqz v1, :cond_c

    const-string v0, "gallery.localUri"

    .line 171
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_9

    .line 174
    invoke-direct {p0}, Ll/ܺܶۜ;->۟()V

    return-void

    .line 177
    :cond_9
    iget-object v1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, v1, Ll/ۡܶۜ;->ۛ:Landroid/net/Uri;

    const-string v0, "gallery.selected"

    .line 178
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_b

    .line 180
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_a
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 181
    iget-object v1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v1, v1, Ll/ۡܶۜ;->ܰ:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v1, v1, Ll/ۡܶۜ;->᩺:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 183
    :cond_b
    iget-object p1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v5, p1, Ll/ۡܶۜ;->ۛ:Landroid/net/Uri;

    .line 305
    iget-object v7, p0, Ll/ܺܶۜ;->ۚۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 306
    new-instance v6, Ljava/util/ArrayList;

    iget-object p1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object p1, p1, Ll/ۡܶۜ;->᩺:Ljava/util/ArrayList;

    invoke-direct {v6, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 307
    sget-object p1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ll/᩻ܶۜ;

    move-object v2, v0

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Ll/᩻ܶۜ;-><init>(Ll/ܺܶۜ;ZLandroid/net/Uri;Ljava/util/ArrayList;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_c
    if-nez p1, :cond_d

    const/4 v0, 0x1

    .line 187
    :cond_d
    invoke-direct {p0, v0}, Ll/ܺܶۜ;->ۧ(Z)V

    return-void
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 4

    const v0, 0x7f12014a

    const/4 v1, 0x0

    .line 425
    invoke-interface {p1, v1, v0, v1, v0}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    const v2, 0x7f0801ad

    .line 426
    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v2, 0x2

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setShowAsActionFlags(I)Landroid/view/MenuItem;

    move-result-object v0

    iput-object v0, p0, Ll/ܺܶۜ;->ܺۧ:Landroid/view/MenuItem;

    const v0, 0x7f120610

    .line 427
    invoke-interface {p1, v1, v0, v1, v0}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    const v3, 0x7f0801ca

    .line 428
    invoke-interface {v0, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setShowAsActionFlags(I)Landroid/view/MenuItem;

    const v0, 0x7f0a03ae

    const v3, 0x7f1205ac

    .line 429
    invoke-interface {p1, v1, v0, v1, v3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const v0, 0x7f0801bb

    .line 430
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1, v2}, Landroid/view/MenuItem;->setShowAsActionFlags(I)Landroid/view/MenuItem;

    .line 431
    invoke-direct {p0}, Ll/ܺܶۜ;->ᩳ֫()V

    const/4 p1, 0x1

    return p1
.end method

.method public final onDestroy()V
    .locals 2

    .line 628
    iget-object v0, p0, Ll/ܺܶۜ;->ܿۧ:Landroid/animation/ValueAnimator;

    if-nez v0, :cond_0

    goto :goto_0

    .line 629
    :cond_0
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    const/4 v0, 0x0

    .line 630
    iput-object v0, p0, Ll/ܺܶۜ;->ܿۧ:Landroid/animation/ValueAnimator;

    .line 766
    :goto_0
    iget-object v0, p0, Ll/ܺܶۜ;->ۚۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 767
    iget-object v0, p0, Ll/ܺܶۜ;->ܶۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 768
    :cond_1
    iget-object v0, p0, Ll/ܺܶۜ;->᩸ۧ:Ll/۬۬ܿ;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ll/۬۬ܿ;->֫()V

    .line 769
    :cond_2
    iget-object v0, p0, Ll/ܺܶۜ;->֨ۧ:Ll/᩶᩺ۜ;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ll/᩶᩺ۜ;->close()V

    .line 770
    :cond_3
    invoke-super {p0}, Ll/ۗܺ᩷;->onDestroy()V

    return-void
.end method

.method public final onEnterAnimationComplete()V
    .locals 3

    .line 193
    invoke-super {p0}, Landroid/app/Activity;->onEnterAnimationComplete()V

    const/4 v0, 0x1

    .line 194
    iput-boolean v0, p0, Ll/ܺܶۜ;->ۖۧ:Z

    .line 196
    iget v1, p0, Ll/ܺܶۜ;->ۡۧ:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_0

    iget-boolean v1, p0, Ll/ܺܶۜ;->ۘۧ:Z

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {p0, v0}, Ll/ܺܶۜ;->ᩳ(Z)V

    :cond_0
    return-void
.end method

.method public final onLowMemory()V
    .locals 1

    .line 722
    invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V

    .line 723
    iget-object v0, p0, Ll/ܺܶۜ;->֨ۧ:Ll/᩶᩺ۜ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩶᩺ۜ;->ܳ()V

    :cond_0
    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 5

    .line 743
    invoke-super {p0, p1}, Ll/᩻ܽ;->onNewIntent(Landroid/content/Intent;)V

    const/4 v0, 0x0

    .line 744
    iput-boolean v0, p0, Ll/ܺܶۜ;->ۘۧ:Z

    .line 745
    iget-object v1, p0, Ll/ܺܶۜ;->ۚۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 746
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v1, p0, Ll/ܺܶۜ;->ۚۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 747
    iget-object v1, p0, Ll/ܺܶۜ;->ܶۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 748
    :cond_0
    iget-object v1, p0, Ll/ܺܶۜ;->֨ۧ:Ll/᩶᩺ۜ;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ll/᩶᩺ۜ;->close()V

    :cond_1
    const/4 v1, 0x0

    .line 749
    iput-object v1, p0, Ll/ܺܶۜ;->֨ۧ:Ll/᩶᩺ۜ;

    .line 750
    iget-object v3, p0, Ll/ܺܶۜ;->᩹ۧ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 751
    iget-object v3, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    .line 123
    iput-object v1, v3, Ll/ۡܶۜ;->ۙ:Ll/ۖܶۜ;

    .line 124
    iget-object v4, v3, Ll/ۡܶۜ;->ܰ:Ljava/util/HashSet;

    invoke-virtual {v4}, Ljava/util/HashSet;->clear()V

    .line 125
    iget-object v4, v3, Ll/ۡܶۜ;->᩺:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 126
    iput-object v1, v3, Ll/ۡܶۜ;->۫:Ljava/lang/String;

    .line 127
    iput-object v1, v3, Ll/ۡܶۜ;->ۛ:Landroid/net/Uri;

    .line 128
    iput-object v1, v3, Ll/ۡܶۜ;->۟:Landroid/os/Bundle;

    .line 129
    iput-boolean v0, v3, Ll/ۡܶۜ;->ۤ:Z

    .line 130
    iput-boolean v2, v3, Ll/ۡܶۜ;->ۗ:Z

    .line 752
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    const p1, 0x7f12074d

    .line 753
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setTitle(I)V

    .line 754
    iget-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    invoke-virtual {p1, v1}, Ll/ۢᩴ;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 755
    iget-object p1, p0, Ll/ܺܶۜ;->֡ۧ:Landroid/widget/TextView;

    const v1, 0x7f120528

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V

    .line 756
    iget-object p1, p0, Ll/ܺܶۜ;->ۢۧ:Landroid/widget/CheckBox;

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 757
    iget-object p1, p0, Ll/ܺܶۜ;->۠ۧ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 758
    invoke-direct {p0, v2}, Ll/ܺܶۜ;->ܽ(Z)V

    .line 759
    invoke-direct {p0}, Ll/ܺܶۜ;->ᩳ֫()V

    .line 760
    invoke-direct {p0, v2}, Ll/ܺܶۜ;->ۧ(Z)V

    return-void
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 6

    .line 459
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f120419

    const/4 v2, 0x0

    const v3, 0x7f120418

    const/4 v4, 0x1

    const v5, 0x7f0a03ae

    if-ne v0, v5, :cond_0

    .line 437
    iget-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 438
    invoke-static {p1}, Ll/᩶ۖ;->֫(Landroid/view/View;)Ll/᩸ۖ;

    move-result-object p1

    .line 439
    invoke-virtual {p1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v0

    const v5, 0x7f120417

    .line 440
    invoke-static {v0, v5}, Ll/۬ۜ;->֫(Ll/ۗۜ;I)V

    .line 441
    invoke-virtual {v0, v2, v1, v2, v1}, Ll/ۗۜ;->add(IIII)Landroid/view/MenuItem;

    move-result-object v1

    .line 442
    invoke-interface {v1, v4}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    move-result-object v1

    iget-object v5, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-boolean v5, v5, Ll/ۡܶۜ;->۬:Z

    xor-int/2addr v5, v4

    invoke-interface {v1, v5}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 443
    invoke-virtual {v0, v2, v3, v4, v3}, Ll/ۗۜ;->add(IIII)Landroid/view/MenuItem;

    move-result-object v1

    .line 444
    invoke-interface {v1, v4}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    move-result-object v1

    iget-object v3, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-boolean v3, v3, Ll/ۡܶۜ;->۬:Z

    invoke-interface {v1, v3}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 445
    invoke-virtual {v0, v2, v4, v4}, Ll/ۗۜ;->setGroupCheckable(IZZ)V

    .line 446
    new-instance v0, Ll/ܳܶۜ;

    invoke-direct {v0, p0}, Ll/ܳܶۜ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 447
    invoke-static {p1}, Ll/᩶ۖ;->֫(Ll/᩸ۖ;)Ll/ᩳ᩷;

    move-result-object p1

    invoke-static {p1}, Ll/ᩴ᩷;->֫(Ll/ᩳ᩷;)V

    return v4

    .line 463
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    if-eq v0, v1, :cond_5

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    if-ne v0, v3, :cond_1

    goto/16 :goto_1

    .line 468
    :cond_1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f120610

    if-ne v0, v1, :cond_2

    .line 469
    iget p1, p0, Ll/ܺܶۜ;->᩻ۧ:I

    add-int/2addr p1, v4

    rem-int/lit8 p1, p1, 0x3

    iput p1, p0, Ll/ܺܶۜ;->᩻ۧ:I

    .line 470
    invoke-direct {p0}, Ll/ܺܶۜ;->ܿ֫()V

    .line 471
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    const-string v0, "pvbi"

    iget v1, p0, Ll/ܺܶۜ;->᩻ۧ:I

    invoke-interface {p1, v1, v0}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    return v4

    .line 474
    :cond_2
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f12014a

    if-ne v0, v1, :cond_4

    .line 475
    invoke-direct {p0}, Ll/ܺܶۜ;->ܰ()Ll/ᩳۜܳ;

    move-result-object p1

    .line 476
    instance-of v0, p1, Ll/ۢۧ᩻;

    if-eqz v0, :cond_8

    move-object v0, p1

    check-cast v0, Ll/ܺۘܳ;

    invoke-virtual {v0}, Ll/ܺۘܳ;->getName()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ".9.png"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 477
    check-cast p1, Ll/ۢۧ᩻;

    invoke-virtual {p1}, Ll/ۢۧ᩻;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 479
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩵֫()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܶۧ()Landroid/net/Uri;

    move-result-object p1

    .line 480
    :goto_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/ܺܶ᩷;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "android.intent.action.VIEW"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return v4

    .line 484
    :cond_4
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    .line 464
    :cond_5
    :goto_1
    invoke-interface {p1, v4}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 465
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    if-ne p1, v3, :cond_6

    const/4 v2, 0x1

    .line 335
    :cond_6
    iget-object p1, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-boolean p1, p1, Ll/ۡܶۜ;->۬:Z

    if-eq p1, v2, :cond_8

    iget-object p1, p0, Ll/ܺܶۜ;->֨ۧ:Ll/᩶᩺ۜ;

    if-eqz p1, :cond_8

    iget-boolean p1, p0, Ll/ܺܶۜ;->ۘۧ:Z

    if-eqz p1, :cond_7

    goto :goto_2

    .line 336
    :cond_7
    invoke-direct {p0}, Ll/ܺܶۜ;->᩺()V

    .line 337
    iget-object p1, p0, Ll/ܺܶۜ;->᩵ۧ:Ll/۬ۛۜ;

    invoke-virtual {p1}, Ll/۬ۛۜ;->ۧ()I

    move-result p1

    .line 338
    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iput-boolean v2, v0, Ll/ۡܶۜ;->۬:Z

    const/4 v1, 0x0

    .line 340
    iput-object v1, v0, Ll/ۡܶۜ;->۟:Landroid/os/Bundle;

    .line 341
    invoke-direct {p0}, Ll/ܺܶۜ;->֫֫()V

    .line 342
    iget-object v0, p0, Ll/ܺܶۜ;->֨ۧ:Ll/᩶᩺ۜ;

    iget-object v1, p0, Ll/ܺܶۜ;->᩵ۧ:Ll/۬ۛۜ;

    invoke-virtual {v0, v1, p1}, Ll/᩶᩺ۜ;->ۧ(Ll/۬ۛۜ;I)V

    .line 343
    invoke-direct {p0}, Ll/ܺܶۜ;->ܿ֫()V

    .line 344
    invoke-direct {p0}, Ll/ܺܶۜ;->᩻֫()V

    .line 345
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    const-string v0, "pvc"

    invoke-interface {p1, v0, v2}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    .line 346
    invoke-virtual {p0}, Ll/֨ܿ;->invalidateOptionsMenu()V

    :cond_8
    :goto_2
    return v4
.end method

.method public final onPause()V
    .locals 2

    .line 728
    invoke-direct {p0}, Ll/ܺܶۜ;->᩺()V

    .line 729
    iget-object v0, p0, Ll/ܺܶۜ;->֨ۧ:Ll/᩶᩺ۜ;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/᩶᩺ۜ;->֫(Z)V

    .line 730
    :cond_0
    iget-object v0, p0, Ll/ܺܶۜ;->᩵ۧ:Ll/۬ۛۜ;

    invoke-virtual {v0}, Ll/۬ۛۜ;->֫()V

    .line 731
    invoke-super {p0}, Ll/ۗܺ᩷;->onPause()V

    return-void
.end method

.method public final onResume()V
    .locals 2

    .line 709
    invoke-super {p0}, Ll/ۗܺ᩷;->onResume()V

    .line 710
    iget-object v0, p0, Ll/ܺܶۜ;->֨ۧ:Ll/᩶᩺ۜ;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/᩶᩺ۜ;->֫(Z)V

    :cond_0
    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 694
    invoke-direct {p0}, Ll/ܺܶۜ;->᩺()V

    .line 695
    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-boolean v0, v0, Ll/ۡܶۜ;->ۤ:Z

    const-string v1, "gallery.internal"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 696
    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v0, v0, Ll/ۡܶۜ;->۫:Ljava/lang/String;

    const-string v1, "gallery.path"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 697
    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-object v0, v0, Ll/ۡܶۜ;->۟:Landroid/os/Bundle;

    const-string v1, "gallery.viewport"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 698
    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-boolean v0, v0, Ll/ۡܶۜ;->ۗ:Z

    const-string v1, "gallery.bars"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 699
    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-boolean v0, v0, Ll/ۡܶۜ;->۬:Z

    const-string v1, "gallery.continuous"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 700
    iget-object v0, p0, Ll/ܺܶۜ;->᩶ۧ:Ll/ۡܶۜ;

    iget-boolean v1, v0, Ll/ۡܶۜ;->ۤ:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Ll/ۡܶۜ;->ۛ:Landroid/net/Uri;

    if-eqz v0, :cond_0

    const-string v1, "gallery.localUri"

    .line 701
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "gallery.selected"

    .line 702
    invoke-direct {p0}, Ll/ܺܶۜ;->ۧ֫()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 704
    :cond_0
    invoke-super {p0, p1}, Ll/᩻ܽ;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public final onStop()V
    .locals 2

    .line 736
    iget-object v0, p0, Ll/ܺܶۜ;->ܶۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 737
    :cond_0
    iget-object v0, p0, Ll/ܺܶۜ;->᩸ۧ:Ll/۬۬ܿ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/۬۬ܿ;->֫()V

    .line 738
    :cond_1
    invoke-super {p0}, Ll/ۗܺ᩷;->onStop()V

    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 2

    .line 715
    invoke-super {p0, p1}, Ll/᩻ܽ;->onTrimMemory(I)V

    .line 717
    iget-object v0, p0, Ll/ܺܶۜ;->֨ۧ:Ll/᩶᩺ۜ;

    if-eqz v0, :cond_0

    const/16 v1, 0x14

    if-eq p1, v1, :cond_0

    invoke-virtual {v0}, Ll/᩶᩺ۜ;->ܳ()V

    :cond_0
    return-void
.end method

.method public final ۘ()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "ImageViewerActivity"

    return-object v0
.end method
