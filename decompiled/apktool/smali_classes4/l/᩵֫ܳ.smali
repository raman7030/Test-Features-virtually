.class public final Ll/᩵֫ܳ;
.super Ljava/lang/Object;
.source "J57U"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public ֫֫:Z

.field public ۗ:Z

.field public ۙ:Ll/ۚܰܿ;

.field public ۛ:Landroid/view/View;

.field public ۟:Landroid/view/View;

.field public ۤ:Ll/ۢ֫ܳ;

.field public ۨ:Z

.field public ۫:Z

.field public ۬:Ll/᩷֫ܳ;

.field public ܰ:Ll/ۢ֫ܳ;

.field public ᩶:Landroid/view/View;

.field public volatile ᩸:Ll/ᩴ֫ܳ;

.field public ᩹:Landroid/view/View;

.field public ᩺:Landroid/view/View;


# direct methods
.method public static ֫(JZ)I
    .locals 2

    if-eqz p2, :cond_0

    const-wide/16 v0, -0x1

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    cmp-long p2, p0, v0

    if-ltz p2, :cond_1

    const-wide/32 v0, 0x7fffffff

    cmp-long p2, p0, v0

    if-gtz p2, :cond_1

    long-to-int p1, p0

    return p1

    .line 786
    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Search offset="

    .line 0
    invoke-static {p0, p1, v0}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 786
    invoke-direct {p2, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static bridge synthetic ֫(Ll/᩵֫ܳ;)Ll/ۚܰܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵֫ܳ;->ۙ:Ll/ۚܰܿ;

    return-object p0
.end method

.method public static ֫(Ll/ᩳܽܳ;Ll/ܺܽܳ;[B[BLl/᩻֫ܳ;)Ll/ۡ֫ܳ;
    .locals 10

    const-string v0, "document"

    .line 516
    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "pattern"

    .line 518
    invoke-static {p2, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 519
    array-length v0, p2

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    if-nez v0, :cond_0

    .line 837
    new-instance p0, Ll/ۡ֫ܳ;

    invoke-direct {p0, v1, v2, v3, v3}, Ll/ۡ֫ܳ;-><init>(JIZ)V

    return-object p0

    :cond_0
    if-nez p3, :cond_1

    new-array p3, v3, [B

    :cond_1
    move-object v8, p3

    .line 523
    invoke-static {p4}, Ll/ܽۖ᩷;->֫(Ll/ܿۖ᩷;)Ll/ܿۖ᩷;

    move-result-object p3

    .line 524
    invoke-virtual {p0, p1}, Ll/ᩳܽܳ;->֫(Ll/ܺܽܳ;)Ll/ۧܽܳ;

    move-result-object p0

    .line 525
    :try_start_0
    array-length p4, p2

    invoke-virtual {p1}, Ll/ܺܽܳ;->length()I

    move-result v0

    if-le p4, v0, :cond_2

    .line 837
    new-instance p1, Ll/ۡ֫ܳ;

    invoke-direct {p1, v1, v2, v3, v3}, Ll/ۡ֫ܳ;-><init>(JIZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 560
    invoke-virtual {p0}, Ll/ۧܽܳ;->close()V

    return-object p1

    .line 528
    :cond_2
    :try_start_1
    array-length p4, p2

    .line 529
    invoke-virtual {p0, p4, v8}, Ll/ۧܽܳ;->֫(I[B)Ll/֫ܽܳ;

    move-result-object v5

    .line 530
    new-instance p4, Ll/ܺ֫ܳ;

    invoke-virtual {p1}, Ll/ܺܽܳ;->length()I

    move-result v6

    move-object v4, p4

    move-object v7, p2

    move-object v9, p3

    invoke-direct/range {v4 .. v9}, Ll/ܺ֫ܳ;-><init>(Ll/֫ܽܳ;I[B[BLl/ܿۖ᩷;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 534
    :try_start_2
    invoke-virtual {p1}, Ll/ܺܽܳ;->length()I

    move-result p2

    invoke-virtual {p1, p4, p2}, Ll/ܺܽܳ;->֫(Ljava/io/OutputStream;I)V
    :try_end_2
    .catch Ll/ۘ֫ܳ; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 538
    :try_start_3
    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 539
    invoke-static {}, Ll/ۡ֫ܳ;->֫()Ll/ۡ֫ܳ;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 560
    invoke-virtual {p0}, Ll/ۧܽܳ;->close()V

    return-object p1

    .line 543
    :cond_3
    :try_start_4
    invoke-virtual {p4}, Ll/ܺ֫ܳ;->finish()Ll/ۡ֫ܳ;

    move-result-object p1
    :try_end_4
    .catch Ll/᩻ܽܳ; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 548
    :try_start_5
    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result p2

    if-eqz p2, :cond_4

    .line 549
    invoke-static {}, Ll/ۡ֫ܳ;->֫()Ll/ۡ֫ܳ;

    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 560
    invoke-virtual {p0}, Ll/ۧܽܳ;->close()V

    return-object p1

    .line 551
    :cond_4
    :try_start_6
    iget-wide v3, p1, Ll/ۡ֫ܳ;->ۧ:J

    cmp-long p2, v3, v1

    if-eqz p2, :cond_5

    .line 553
    iget p2, p1, Ll/ۡ֫ܳ;->ܽ:I

    invoke-virtual {p0, p2, p2}, Ll/ۧܽܳ;->ۧ(II)V

    .line 555
    invoke-virtual {p0, p3}, Ll/ۧܽܳ;->֫(Ll/ܿۖ᩷;)Z

    move-result p2

    if-nez p2, :cond_5

    .line 556
    invoke-static {}, Ll/ۡ֫ܳ;->֫()Ll/ۡ֫ܳ;

    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 560
    invoke-virtual {p0}, Ll/ۧܽܳ;->close()V

    return-object p1

    :cond_5
    invoke-virtual {p0}, Ll/ۧܽܳ;->close()V

    return-object p1

    .line 545
    :catch_0
    :try_start_7
    invoke-static {}, Ll/ۡ֫ܳ;->֫()Ll/ۡ֫ܳ;

    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 560
    invoke-virtual {p0}, Ll/ۧܽܳ;->close()V

    return-object p1

    .line 536
    :catch_1
    :try_start_8
    invoke-static {}, Ll/ۡ֫ܳ;->֫()Ll/ۡ֫ܳ;

    move-result-object p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 560
    invoke-virtual {p0}, Ll/ۧܽܳ;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 524
    :try_start_9
    invoke-virtual {p0}, Ll/ۧܽܳ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public static ֫(Ll/ۚܰܿ;)Ll/᩵֫ܳ;
    .locals 14

    .line 99
    new-instance v0, Ll/᩵֫ܳ;

    .line 58
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 46
    iput-boolean v1, v0, Ll/᩵֫ܳ;->֫֫:Z

    .line 47
    iput-boolean v1, v0, Ll/᩵֫ܳ;->ۨ:Z

    const/4 v1, 0x1

    .line 271
    iput-boolean v1, v0, Ll/᩵֫ܳ;->ۗ:Z

    .line 59
    iput-object p0, v0, Ll/᩵֫ܳ;->ۙ:Ll/ۚܰܿ;

    const v2, 0x7f0a04df

    .line 60
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, v0, Ll/᩵֫ܳ;->۟:Landroid/view/View;

    const v2, 0x7f0a04b5

    .line 61
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, v0, Ll/᩵֫ܳ;->ۛ:Landroid/view/View;

    const v2, 0x7f0a01f5

    .line 62
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f0a01f4

    .line 63
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f0a04ad

    .line 64
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, v0, Ll/᩵֫ܳ;->᩹:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f0a04ae

    .line 65
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, v0, Ll/᩵֫ܳ;->᩶:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f0a0102

    .line 66
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f0a04b3

    .line 67
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, v0, Ll/᩵֫ܳ;->᩺:Landroid/view/View;

    .line 68
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, v0, Ll/᩵֫ܳ;->᩺:Landroid/view/View;

    .line 71
    new-instance v1, Ll/ۢ֫ܳ;

    const v2, 0x7f0a04d6

    .line 72
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ll/ۚۖۡ;

    const v2, 0x7f0a04db

    .line 73
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroid/widget/TextView;

    const v2, 0x7f0a04e4

    .line 74
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroid/widget/Spinner;

    const v2, 0x7f0a04da

    .line 75
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroid/widget/CheckBox;

    const/4 v3, 0x1

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Ll/ۢ֫ܳ;-><init>(ZLl/ۚۖۡ;Landroid/widget/TextView;Landroid/widget/Spinner;Landroid/widget/CheckBox;)V

    iput-object v1, v0, Ll/᩵֫ܳ;->ܰ:Ll/ۢ֫ܳ;

    .line 77
    new-instance v1, Ll/ۢ֫ܳ;

    const v2, 0x7f0a04af

    .line 78
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Ll/ۚۖۡ;

    const v2, 0x7f0a04b2

    .line 79
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroid/widget/TextView;

    const v2, 0x7f0a04b4

    .line 80
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroid/widget/Spinner;

    const v2, 0x7f0a04b0

    .line 81
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p0

    move-object v13, p0

    check-cast v13, Landroid/widget/CheckBox;

    const/4 v9, 0x0

    move-object v8, v1

    invoke-direct/range {v8 .. v13}, Ll/ۢ֫ܳ;-><init>(ZLl/ۚۖۡ;Landroid/widget/TextView;Landroid/widget/Spinner;Landroid/widget/CheckBox;)V

    iput-object v1, v0, Ll/᩵֫ܳ;->ۤ:Ll/ۢ֫ܳ;

    return-object v0
.end method

.method public static ֫(Ll/ܽܽܳ;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 761
    invoke-virtual {p0}, Ll/ܽܽܳ;->close()V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/᩵֫ܳ;Ll/ۜܰܿ;Ll/ᩳܽܳ;Ljava/lang/Exception;)V
    .locals 0

    .line 746
    invoke-direct {p0, p2}, Ll/᩵֫ܳ;->֫(Ll/ᩳܽܳ;)Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    .line 749
    :cond_0
    instance-of p2, p3, Ll/۟֫ܳ;

    if-eqz p2, :cond_1

    const p0, 0x7f12030d

    .line 750
    invoke-static {p0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 751
    :cond_1
    instance-of p2, p3, Ljava/io/IOException;

    if-eqz p2, :cond_2

    .line 752
    check-cast p3, Ljava/io/IOException;

    invoke-virtual {p1, p3}, Ll/ۜܰܿ;->֫(Ljava/io/IOException;)V

    return-void

    .line 754
    :cond_2
    iget-object p0, p0, Ll/᩵֫ܳ;->ۙ:Ll/ۚܰܿ;

    const/4 p1, 0x0

    .line 546
    invoke-virtual {p0, p3, p1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public static ֫(Ll/᩵֫ܳ;Ll/ᩴ֫ܳ;)V
    .locals 1

    .line 711
    iget-object v0, p0, Ll/᩵֫ܳ;->᩸:Ll/ᩴ֫ܳ;

    if-nez v0, :cond_0

    .line 714
    iput-object p1, p0, Ll/᩵֫ܳ;->᩸:Ll/ᩴ֫ܳ;

    return-void

    .line 712
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Another search task is active"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ֫(Ll/᩵֫ܳ;Ll/᩷֫ܳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩵֫ܳ;->۬:Ll/᩷֫ܳ;

    return-void
.end method

.method private ֫(Ll/ᩳܽܳ;)Z
    .locals 2

    .line 730
    iget-object v0, p0, Ll/᩵֫ܳ;->ۙ:Ll/ۚܰܿ;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v0, v0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 290
    iget-object v0, v0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v0

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static bridge synthetic ֫(Ll/᩵֫ܳ;Ll/ᩳܽܳ;)Z
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩵֫ܳ;->֫(Ll/ᩳܽܳ;)Z

    move-result p0

    return p0
.end method

.method public static ֫(Ll/᩵֫ܳ;Ll/ᩳܽܳ;Ll/ܺܽܳ;)Z
    .locals 2

    if-eqz p2, :cond_0

    .line 738
    invoke-direct {p0, p1}, Ll/᩵֫ܳ;->֫(Ll/ᩳܽܳ;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 739
    invoke-virtual {p1}, Ll/ᩳܽܳ;->ۖ()J

    move-result-wide p0

    invoke-virtual {p2}, Ll/ܺܽܳ;->֫()J

    move-result-wide v0

    cmp-long p2, p0, v0

    if-nez p2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ll/᩵֫ܳ;Ll/ᩴ֫ܳ;)V
    .locals 1

    .line 721
    iget-object v0, p0, Ll/᩵֫ܳ;->᩸:Ll/ᩴ֫ܳ;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    .line 722
    iput-object p1, p0, Ll/᩵֫ܳ;->᩸:Ll/ᩴ֫ܳ;

    :cond_0
    return-void
.end method

.method private ܳ()V
    .locals 9

    const/4 v0, 0x1

    .line 278
    iput-boolean v0, p0, Ll/᩵֫ܳ;->ۗ:Z

    .line 279
    iget-object v0, p0, Ll/᩵֫ܳ;->ܰ:Ll/ۢ֫ܳ;

    invoke-virtual {v0}, Ll/ۢ֫ܳ;->֫()V

    .line 280
    iget-object v1, p0, Ll/᩵֫ܳ;->ۙ:Ll/ۚܰܿ;

    iget-object v8, v1, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 290
    iget-object v1, v8, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v1}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v5

    .line 282
    iget-object v6, v0, Ll/ۢ֫ܳ;->᩹:[B

    const/4 v0, 0x0

    if-eqz v6, :cond_2

    .line 283
    array-length v2, v6

    if-nez v2, :cond_0

    goto :goto_1

    .line 287
    :cond_0
    iput-object v0, p0, Ll/᩵֫ܳ;->۬:Ll/᩷֫ܳ;

    .line 930
    invoke-virtual {v1}, Ll/ۧܰܿ;->ۡ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 922
    invoke-virtual {v1}, Ll/ۧܰܿ;->᩷()I

    move-result v0

    int-to-long v0, v0

    goto :goto_0

    .line 926
    :cond_1
    invoke-virtual {v1}, Ll/ۧܰܿ;->ۜ()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    :goto_0
    const/4 v2, 0x0

    .line 290
    invoke-static {v0, v1, v2}, Ll/᩵֫ܳ;->֫(JZ)I

    move-result v7

    .line 291
    new-instance v4, Ll/ᩴ֫ܳ;

    .line 871
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 292
    new-instance v0, Ll/ܿ֫ܳ;

    move-object v2, v0

    move-object v3, p0

    invoke-direct/range {v2 .. v8}, Ll/ܿ֫ܳ;-><init>(Ll/᩵֫ܳ;Ll/ᩴ֫ܳ;Ll/ᩳܽܳ;[BILl/ۜܰܿ;)V

    .line 356
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void

    .line 284
    :cond_2
    :goto_1
    iput-object v0, p0, Ll/᩵֫ܳ;->۬:Ll/᩷֫ܳ;

    return-void
.end method

.method private ᩻()V
    .locals 10

    const/4 v0, 0x0

    .line 194
    iput-boolean v0, p0, Ll/᩵֫ܳ;->ۗ:Z

    .line 195
    iget-object v0, p0, Ll/᩵֫ܳ;->ܰ:Ll/ۢ֫ܳ;

    invoke-virtual {v0}, Ll/ۢ֫ܳ;->֫()V

    .line 196
    iget-object v1, p0, Ll/᩵֫ܳ;->ۙ:Ll/ۚܰܿ;

    iget-object v9, v1, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 290
    iget-object v1, v9, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v1}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v5

    .line 198
    iget-object v6, v0, Ll/ۢ֫ܳ;->᩹:[B

    const/4 v0, 0x0

    if-eqz v6, :cond_2

    .line 199
    array-length v2, v6

    if-nez v2, :cond_0

    goto :goto_1

    .line 203
    :cond_0
    iput-object v0, p0, Ll/᩵֫ܳ;->۬:Ll/᩷֫ܳ;

    .line 930
    invoke-virtual {v1}, Ll/ۧܰܿ;->ۡ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 922
    invoke-virtual {v1}, Ll/ۧܰܿ;->᩷()I

    move-result v0

    int-to-long v0, v0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ll/ۧܰܿ;->᩷()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    :goto_0
    move-wide v7, v0

    .line 206
    new-instance v4, Ll/ᩴ֫ܳ;

    .line 871
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 207
    new-instance v0, Ll/ۧ֫ܳ;

    move-object v2, v0

    move-object v3, p0

    invoke-direct/range {v2 .. v9}, Ll/ۧ֫ܳ;-><init>(Ll/᩵֫ܳ;Ll/ᩴ֫ܳ;Ll/ᩳܽܳ;[BJLl/ۜܰܿ;)V

    .line 268
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void

    .line 200
    :cond_2
    :goto_1
    iput-object v0, p0, Ll/᩵֫ܳ;->۬:Ll/᩷֫ܳ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 14

    .line 155
    iget-object v0, p0, Ll/᩵֫ܳ;->᩺:Landroid/view/View;

    iget-object v1, p0, Ll/᩵֫ܳ;->ۛ:Landroid/view/View;

    iget-object v2, p0, Ll/᩵֫ܳ;->ۤ:Ll/ۢ֫ܳ;

    iget-object v3, p0, Ll/᩵֫ܳ;->ۙ:Ll/ۚܰܿ;

    invoke-virtual {p0}, Ll/᩵֫ܳ;->ᩳ()Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_2

    .line 158
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v4, 0x7f1207a7

    const v5, 0x7f0a04ae

    const v6, 0x7f0a04ad

    if-eq p1, v6, :cond_1

    if-ne p1, v5, :cond_2

    .line 159
    :cond_1
    iget-object v7, v3, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 160
    invoke-virtual {v7}, Ll/ۜܰܿ;->ܳ()Z

    move-result v7

    if-eqz v7, :cond_2

    .line 161
    invoke-static {v4}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    :cond_2
    const v7, 0x7f0a01f5

    if-ne p1, v7, :cond_3

    .line 165
    invoke-direct {p0}, Ll/᩵֫ܳ;->᩻()V

    return-void

    :cond_3
    const v7, 0x7f0a01f4

    if-ne p1, v7, :cond_4

    .line 167
    invoke-direct {p0}, Ll/᩵֫ܳ;->ܳ()V

    return-void

    :cond_4
    if-ne p1, v6, :cond_a

    .line 360
    iget-object p1, v3, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 361
    iget-object v0, p0, Ll/᩵֫ܳ;->۬:Ll/᩷֫ܳ;

    if-eqz v0, :cond_8

    .line 290
    iget-object v1, p1, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v1}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v3

    .line 922
    invoke-virtual {v1}, Ll/ۧܰܿ;->᩷()I

    move-result v4

    .line 926
    invoke-virtual {v1}, Ll/ۧܰܿ;->ۜ()I

    move-result v5

    .line 930
    invoke-virtual {v1}, Ll/ۧܰܿ;->ۡ()Z

    move-result v1

    .line 362
    invoke-virtual {v0, v3, v4, v5, v1}, Ll/᩷֫ܳ;->֫(Ll/ᩳܽܳ;IIZ)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    .line 371
    :cond_5
    invoke-virtual {v2}, Ll/ۢ֫ܳ;->֫()V

    .line 372
    iget-object v0, v2, Ll/ۢ֫ܳ;->᩹:[B

    invoke-virtual {p1, v0}, Ll/ۜܰܿ;->֫([B)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_2

    .line 375
    :cond_6
    iget-boolean p1, p0, Ll/᩵֫ܳ;->ۗ:Z

    if-eqz p1, :cond_7

    .line 376
    invoke-direct {p0}, Ll/᩵֫ܳ;->ܳ()V

    return-void

    .line 378
    :cond_7
    invoke-direct {p0}, Ll/᩵֫ܳ;->᩻()V

    return-void

    .line 365
    :cond_8
    :goto_0
    iget-boolean p1, p0, Ll/᩵֫ܳ;->ۗ:Z

    if-eqz p1, :cond_9

    .line 366
    invoke-direct {p0}, Ll/᩵֫ܳ;->ܳ()V

    return-void

    .line 368
    :cond_9
    invoke-direct {p0}, Ll/᩵֫ܳ;->᩻()V

    return-void

    :cond_a
    if-ne p1, v5, :cond_e

    .line 385
    iget-object p1, p0, Ll/᩵֫ܳ;->ܰ:Ll/ۢ֫ܳ;

    invoke-virtual {p1}, Ll/ۢ֫ܳ;->֫()V

    .line 386
    invoke-virtual {v2}, Ll/ۢ֫ܳ;->֫()V

    .line 388
    iget-object v13, v3, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 290
    iget-object v0, v13, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v8

    .line 390
    iget-object v11, p1, Ll/ۢ֫ܳ;->᩹:[B

    .line 391
    iget-object v12, v2, Ll/ۢ֫ܳ;->᩹:[B

    if-eqz v11, :cond_d

    .line 392
    array-length p1, v11

    if-nez p1, :cond_b

    goto :goto_1

    .line 397
    :cond_b
    new-instance v7, Ll/ᩴ֫ܳ;

    .line 871
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 398
    new-instance v10, Ll/ۖ֫ܳ;

    invoke-direct {v10, p0, v13, v8}, Ll/ۖ֫ܳ;-><init>(Ll/᩵֫ܳ;Ll/ۜܰܿ;Ll/ᩳܽܳ;)V

    .line 400
    new-instance p1, Ll/᩺۟ܿ;

    invoke-direct {p1, v7}, Ll/᩺۟ܿ;-><init>(Ll/ᩴ֫ܳ;)V

    new-instance v0, Ll/ܰ۟ܿ;

    invoke-direct {v0, v10}, Ll/ܰ۟ܿ;-><init>(Ll/ۖ֫ܳ;)V

    invoke-virtual {v13, p1, v0}, Ll/ۜܰܿ;->֫(Ljava/lang/Runnable;Ljava/lang/Runnable;)Ll/ܽܰܿ;

    move-result-object v9

    if-nez v9, :cond_c

    .line 402
    invoke-static {v4}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 405
    :cond_c
    new-instance p1, Ll/ۜ֫ܳ;

    move-object v5, p1

    move-object v6, p0

    invoke-direct/range {v5 .. v13}, Ll/ۜ֫ܳ;-><init>(Ll/᩵֫ܳ;Ll/ᩴ֫ܳ;Ll/ᩳܽܳ;Ll/ܽܰܿ;Ll/ۖ֫ܳ;[B[BLl/ۜܰܿ;)V

    .line 480
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    return-void

    :cond_d
    :goto_1
    const/4 p1, 0x0

    .line 393
    iput-object p1, p0, Ll/᩵֫ܳ;->۬:Ll/᩷֫ܳ;

    return-void

    :cond_e
    const v2, 0x7f0a0102

    if-ne p1, v2, :cond_f

    .line 173
    invoke-virtual {p0}, Ll/᩵֫ܳ;->ܽ()V

    return-void

    :cond_f
    const v2, 0x7f0a04b3

    if-ne p1, v2, :cond_11

    .line 175
    iget-boolean p1, p0, Ll/᩵֫ܳ;->۫:Z

    if-nez p1, :cond_11

    .line 176
    iget-boolean p1, p0, Ll/᩵֫ܳ;->ۨ:Z

    const/4 v2, 0x0

    if-eqz p1, :cond_10

    .line 177
    iput-boolean v2, p0, Ll/᩵֫ܳ;->ۨ:Z

    const/16 p1, 0x8

    .line 178
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    const/4 p1, 0x0

    .line 179
    invoke-virtual {v0, p1}, Landroid/view/View;->setRotationX(F)V

    return-void

    :cond_10
    const/4 p1, 0x1

    .line 181
    iput-boolean p1, p0, Ll/᩵֫ܳ;->ۨ:Z

    .line 182
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    const/high16 p1, 0x43340000    # 180.0f

    .line 183
    invoke-virtual {v0, p1}, Landroid/view/View;->setRotationX(F)V

    :cond_11
    :goto_2
    return-void
.end method

.method public final ֫()V
    .locals 1

    .line 113
    iget-object v0, p0, Ll/᩵֫ܳ;->᩸:Ll/ᩴ֫ܳ;

    if-eqz v0, :cond_0

    .line 115
    invoke-virtual {v0}, Ll/ᩴ֫ܳ;->cancel()V

    :cond_0
    return-void
.end method

.method public final ֫(Z)V
    .locals 3

    .line 85
    iget-object v0, p0, Ll/᩵֫ܳ;->᩺:Landroid/view/View;

    iput-boolean p1, p0, Ll/᩵֫ܳ;->۫:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 87
    iget-boolean p1, p0, Ll/᩵֫ܳ;->ۨ:Z

    const/16 v2, 0x8

    if-eqz p1, :cond_0

    .line 88
    iput-boolean v1, p0, Ll/᩵֫ܳ;->ۨ:Z

    .line 89
    iget-object p1, p0, Ll/᩵֫ܳ;->ۛ:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    const/4 p1, 0x0

    .line 90
    invoke-virtual {v0, p1}, Landroid/view/View;->setRotationX(F)V

    .line 92
    :cond_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 94
    :cond_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final ۧ()V
    .locals 5

    .line 120
    iget-object v0, p0, Ll/᩵֫ܳ;->᩶:Landroid/view/View;

    iget-object v1, p0, Ll/᩵֫ܳ;->᩹:Landroid/view/View;

    iget-object v2, p0, Ll/᩵֫ܳ;->ܰ:Ll/ۢ֫ܳ;

    iget-boolean v3, v2, Ll/ۢ֫ܳ;->᩶:Z

    if-nez v3, :cond_4

    iget-boolean v2, v2, Ll/ۢ֫ܳ;->ۙ:Z

    if-eqz v2, :cond_0

    goto :goto_2

    .line 124
    :cond_0
    iget-boolean v2, p0, Ll/᩵֫ܳ;->ۨ:Z

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/᩵֫ܳ;->ۤ:Ll/ۢ֫ܳ;

    iget-boolean v2, v2, Ll/ۢ֫ܳ;->ۙ:Z

    if-eqz v2, :cond_1

    goto :goto_0

    .line 128
    :cond_1
    invoke-virtual {v1, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 129
    invoke-virtual {v0, v4}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_1

    .line 125
    :cond_2
    :goto_0
    invoke-virtual {v1, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 126
    invoke-virtual {v0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 135
    :goto_1
    iget-boolean v0, p0, Ll/᩵֫ܳ;->֫֫:Z

    if-eqz v0, :cond_3

    return-void

    .line 137
    :cond_3
    iget-object v0, p0, Ll/᩵֫ܳ;->ۙ:Ll/ۚܰܿ;

    invoke-virtual {v0}, Ll/ۚܰܿ;->ܰ()V

    .line 138
    iget-object v0, p0, Ll/᩵֫ܳ;->۟:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 139
    iput-boolean v4, p0, Ll/᩵֫ܳ;->֫֫:Z

    return-void

    .line 121
    :cond_4
    :goto_2
    invoke-virtual {p0}, Ll/᩵֫ܳ;->ܽ()V

    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 143
    iget-boolean v0, p0, Ll/᩵֫ܳ;->֫֫:Z

    if-nez v0, :cond_0

    return-void

    .line 145
    :cond_0
    iget-object v0, p0, Ll/᩵֫ܳ;->۟:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x0

    .line 146
    iput-boolean v0, p0, Ll/᩵֫ܳ;->֫֫:Z

    return-void
.end method

.method public final ܿ()Z
    .locals 1

    .line 150
    iget-boolean v0, p0, Ll/᩵֫ܳ;->֫֫:Z

    return v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 106
    iget-object v0, p0, Ll/᩵֫ܳ;->᩸:Ll/ᩴ֫ܳ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
