.class public final Ll/ۖܰᩳ;
.super Ll/ۗۤᩳ;
.source "Q5YY"


# instance fields
.field public volatile ֡֫:Ljava/lang/Throwable;

.field public volatile ֨֫:Ll/ܳ۟ᩳ;

.field public ۖ֫:F

.field public ۗ֫:I

.field public ۘ֫:Ll/᩻۟ᩳ;

.field public ۙ֫:I

.field public final ۚ֫:Ljava/util/concurrent/atomic/AtomicInteger;

.field public ۠֫:Z

.field public ۤ֫:Ll/ۤܽᩴ;

.field public ۫֫:Ll/ܽ۟ᩳ;

.field public volatile ۬֫:Ll/ܺܰᩳ;

.field public ܶ֫:F

.field public ܺ֫:F

.field public ᩴ֫:I

.field public volatile ᩵֫:Ll/ۙۤᩳ;

.field public ᩶֫:Ljava/lang/String;

.field public ᩸֫:F

.field public ᩹֫:I


# direct methods
.method public constructor <init>(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/᩺֫ܿ;)V
    .locals 6

    const/4 v4, -0x1

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 118
    invoke-direct/range {v0 .. v5}, Ll/ۖܰᩳ;-><init>(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/᩺֫ܿ;ILl/۟᩸ᩳ;)V

    return-void
.end method

.method public constructor <init>(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/᩺֫ܿ;ILl/ۗ۟ᩳ;Ll/ۢۨᩳ;Ll/۟᩸ᩳ;)V
    .locals 1

    .line 68
    invoke-direct {p0, p1, p3}, Ll/ۗۤᩳ;-><init>(Ll/۫ۨᩳ;Ll/᩺֫ܿ;)V

    .line 38
    new-instance p1, Ll/ۤܽᩴ;

    invoke-direct {p1}, Ll/ۤܽᩴ;-><init>()V

    iput-object p1, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    .line 45
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Ll/ۖܰᩳ;->ۚ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 69
    iput p4, p0, Ll/ۗۤᩳ;->ۨ:I

    if-eqz p7, :cond_0

    .line 70
    invoke-virtual {p7}, Ll/۟᩸ᩳ;->֫()Ll/۟᩸ᩳ;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Ll/ۗۤᩳ;->֫(Ll/۟᩺ᩳ;Ll/۟᩸ᩳ;)V

    .line 71
    :cond_0
    invoke-virtual {p0, p2}, Ll/ۗۤᩳ;->֫(Ll/۟᩺ᩳ;)V

    .line 73
    :try_start_0
    iget-object p1, p5, Ll/ۗ۟ᩳ;->֫:Ll/ۗۤᩳ;

    check-cast p1, Ll/ۖܰᩳ;

    iget-object p1, p1, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    .line 74
    invoke-virtual {p5, p0, p6}, Ll/ۗ۟ᩳ;->֫(Ll/ۗۤᩳ;Ljava/util/function/BooleanSupplier;)Ll/ۙ۟ᩳ;

    move-result-object p2

    .line 75
    iget-object p3, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    iget-object p4, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {p4}, Ll/᩷۟ᩳ;->size()I

    move-result p4

    invoke-virtual {p3, p4}, Ll/ۤܽᩴ;->ܿ(I)V

    const/4 p3, 0x0

    const/4 p4, 0x0

    .line 76
    :goto_0
    iget-object p6, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {p6}, Ll/᩷۟ᩳ;->size()I

    move-result p6

    const/4 p7, 0x1

    if-ge p4, p6, :cond_4

    .line 77
    invoke-virtual {p2}, Ll/ۙ۟ᩳ;->ܽ()I

    move-result p6

    if-ge p4, p6, :cond_1

    invoke-virtual {p1, p4}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result p6

    goto :goto_1

    .line 78
    :cond_1
    invoke-virtual {p2}, Ll/ۙ۟ᩳ;->֫()I

    move-result p6

    if-lt p4, p6, :cond_2

    iget p6, p5, Ll/ۗ۟ᩳ;->᩻:I

    add-int/2addr p6, p7

    add-int/2addr p6, p4

    invoke-virtual {p2}, Ll/ۙ۟ᩳ;->֫()I

    move-result p7

    sub-int/2addr p6, p7

    invoke-virtual {p1, p6}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result p6

    goto :goto_1

    :cond_2
    const/high16 p6, -0x40800000    # -1.0f

    .line 79
    :goto_1
    iget-object p7, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {p7, p6}, Ll/ۤܽᩴ;->add(F)Z

    .line 80
    iget-object p7, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    iget v0, p0, Ll/ۖܰᩳ;->ᩴ֫:I

    invoke-virtual {p7, v0}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result p7

    cmpl-float p6, p6, p7

    if-lez p6, :cond_3

    iput p4, p0, Ll/ۖܰᩳ;->ᩴ֫:I

    :cond_3
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    .line 342
    :cond_4
    invoke-virtual {p0, p3}, Ll/ۗۤᩳ;->֫(I)I

    move-result p1

    .line 82
    iput p1, p0, Ll/ۗۤᩳ;->ۙ:I

    .line 83
    iput-boolean p7, p0, Ll/ۖܰᩳ;->۠֫:Z

    .line 84
    invoke-direct {p0}, Ll/ۖܰᩳ;->۟()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    iget-boolean p1, p0, Ll/ۗۤᩳ;->۬:Z

    if-nez p1, :cond_5

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۙ()V

    :cond_5
    return-void

    :catchall_0
    move-exception p1

    iget-boolean p2, p0, Ll/ۗۤᩳ;->۬:Z

    if-nez p2, :cond_6

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۙ()V

    .line 87
    :cond_6
    throw p1
.end method

.method public constructor <init>(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/᩺֫ܿ;ILl/۟᩸ᩳ;)V
    .locals 0

    .line 122
    invoke-direct {p0, p1, p3}, Ll/ۗۤᩳ;-><init>(Ll/۫ۨᩳ;Ll/᩺֫ܿ;)V

    .line 38
    new-instance p1, Ll/ۤܽᩴ;

    invoke-direct {p1}, Ll/ۤܽᩴ;-><init>()V

    iput-object p1, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    .line 45
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Ll/ۖܰᩳ;->ۚ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 123
    iput p4, p0, Ll/ۗۤᩳ;->ۨ:I

    if-eqz p5, :cond_0

    .line 124
    invoke-virtual {p5}, Ll/۟᩸ᩳ;->֫()Ll/۟᩸ᩳ;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Ll/ۗۤᩳ;->֫(Ll/۟᩺ᩳ;Ll/۟᩸ᩳ;)V

    .line 125
    :cond_0
    invoke-virtual {p0, p2}, Ll/ۖܰᩳ;->ۧ(Ll/۟᩺ᩳ;)V

    return-void
.end method

.method public constructor <init>(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/᩺֫ܿ;Ll/۬ۜܽ;)V
    .locals 2

    .line 138
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۗۤᩳ;-><init>(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/᩺֫ܿ;Ll/۬ۜܽ;)V

    .line 38
    new-instance p1, Ll/ۤܽᩴ;

    invoke-direct {p1}, Ll/ۤܽᩴ;-><init>()V

    iput-object p1, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    .line 45
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Ll/ۖܰᩳ;->ۚ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 139
    invoke-virtual {p4}, Ll/۬ۜܽ;->readInt()I

    move-result p1

    iput p1, p0, Ll/ۖܰᩳ;->ᩴ֫:I

    .line 141
    iget-object p1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {p1}, Ll/᩷۟ᩳ;->size()I

    move-result p1

    .line 142
    iget-object p3, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {p3, p1}, Ll/ۤܽᩴ;->ܿ(I)V

    const/4 p3, 0x0

    const/4 p4, 0x0

    :goto_0
    if-ge p4, p1, :cond_0

    .line 144
    iget-object v0, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    const/high16 v1, -0x40800000    # -1.0f

    invoke-virtual {v0, v1}, Ll/ۤܽᩴ;->add(F)Z

    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    .line 146
    :cond_0
    invoke-virtual {p0, p2}, Ll/ۗۤᩳ;->֫(Ll/۟᩺ᩳ;)V

    .line 147
    :try_start_0
    invoke-virtual {p0}, Ll/ۗۤᩳ;->᩹()Ll/۟᩸ᩳ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 148
    :try_start_1
    iget-object p2, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {p2}, Ll/᩷۟ᩳ;->ۧ()Ll/ܰܰᩳ;

    move-result-object p2

    .line 149
    :goto_1
    iget-object p4, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {p4}, Ll/᩷۟ᩳ;->size()I

    move-result p4

    if-ge p3, p4, :cond_1

    .line 150
    invoke-virtual {p2, p3}, Ll/ܰܰᩳ;->֫(I)Ll/ۨܰᩳ;

    move-result-object p4

    .line 151
    invoke-virtual {p4, p1}, Ll/ۨܰᩳ;->֫(Ll/۟᩸ᩳ;)V

    .line 152
    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v0, p3, p4}, Ll/᩷۟ᩳ;->ۧ(ILl/ۨܰᩳ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    .line 154
    :cond_1
    :try_start_2
    invoke-virtual {p1}, Ll/۟᩸ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۙ()V

    .line 155
    invoke-direct {p0}, Ll/ۖܰᩳ;->۟()V

    return-void

    :catchall_0
    move-exception p2

    .line 147
    :try_start_3
    invoke-virtual {p1}, Ll/۟᩸ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    .line 154
    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۙ()V

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/ۖܰᩳ;)F
    .locals 0

    .line 0
    iget p0, p0, Ll/ۖܰᩳ;->ۖ֫:F

    return p0
.end method

.method private ֫(Ll/۟᩺ᩳ;Ll/ۢ۫ۡ;)Ll/ܳ۟ᩳ;
    .locals 12

    .line 318
    iget v0, p0, Ll/ۗۤᩳ;->ۨ:I

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Ll/ۖܰᩳ;->᩻()Ll/ۙۤᩳ;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->ۧ(Ll/۟᩺ᩳ;)Ll/ۙۤᩳ;

    move-result-object p1

    :goto_0
    const/4 v0, 0x0

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-nez p1, :cond_2

    .line 320
    new-instance p1, Ll/ۙۤᩳ;

    iget-object v2, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v2}, Landroid/view/View;->getScrollX()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget-object v3, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    .line 321
    invoke-virtual {v3}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget-object v4, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v4}, Ll/۫ۨᩳ;->ۜ֫()I

    move-result v4

    iget-object v5, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v5}, Ll/۫ۨᩳ;->᩻֫()I

    move-result v5

    invoke-direct {p1, v2, v3, v4, v5}, Ll/ۙۤᩳ;-><init>(IIII)V

    .line 322
    :cond_2
    invoke-virtual {p1}, Ll/ۙۤᩳ;->ܳ()I

    move-result v2

    const/4 v3, 0x0

    if-lez v2, :cond_12

    invoke-virtual {p1}, Ll/ۙۤᩳ;->֫()I

    move-result v2

    if-lez v2, :cond_12

    .line 323
    invoke-virtual {p1}, Ll/ۙۤᩳ;->ᩳ()I

    move-result v2

    .line 264
    invoke-virtual {p0}, Ll/ۗۤᩳ;->ܿ()D

    move-result-wide v4

    double-to-float v4, v4

    float-to-int v4, v4

    .line 323
    invoke-virtual {p1}, Ll/ۙۤᩳ;->֫()I

    move-result v5

    sub-int/2addr v4, v5

    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    if-le v2, v4, :cond_3

    goto/16 :goto_7

    .line 324
    :cond_3
    invoke-virtual {p1}, Ll/ۙۤᩳ;->ᩳ()I

    move-result v2

    int-to-double v4, v2

    invoke-virtual {p0, v4, v5}, Ll/ۗۤᩳ;->֫(D)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 325
    iget-object v4, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v4}, Ll/᩷۟ᩳ;->size()I

    move-result v4

    .line 326
    invoke-virtual {p1}, Ll/ۙۤᩳ;->ᩳ()I

    move-result v5

    int-to-long v5, v5

    invoke-virtual {p1}, Ll/ۙۤᩳ;->֫()I

    move-result v7

    int-to-long v7, v7

    add-long/2addr v5, v7

    const-wide/32 v7, 0x7fffffff

    .line 325
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    long-to-int v6, v5

    int-to-double v5, v6

    invoke-virtual {p0, v5, v6}, Ll/ۗۤᩳ;->֫(D)I

    move-result v5

    add-int/lit8 v5, v5, 0x2

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 328
    iget v5, p0, Ll/ۗۤᩳ;->ۨ:I

    if-ltz v5, :cond_4

    add-int/lit8 v2, v2, -0x10

    .line 329
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 330
    iget-object v5, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v5}, Ll/᩷۟ᩳ;->size()I

    move-result v5

    add-int/lit8 v4, v4, 0x10

    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 332
    :cond_4
    iget-object v5, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v5}, Ll/۫ۨᩳ;->۫֫()I

    move-result v5

    invoke-virtual {p0, v5}, Ll/ۗۤᩳ;->ܿ(I)I

    move-result v5

    .line 333
    iget-object v6, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v6}, Ll/۫ۨᩳ;->۬֫()I

    move-result v6

    invoke-virtual {p0, v6}, Ll/ۗۤᩳ;->ܿ(I)I

    move-result v6

    .line 334
    new-instance v7, Ll/ܳ۟ᩳ;

    invoke-direct {v7, v2, v4, v5, v6}, Ll/ܳ۟ᩳ;-><init>(IIII)V

    .line 335
    invoke-virtual {p0}, Ll/ۗۤᩳ;->᩹()Ll/۟᩸ᩳ;

    move-result-object v8

    .line 336
    :try_start_0
    new-instance v9, Ll/᩷۫ۡ;

    invoke-direct {v9, v8}, Ll/᩷۫ۡ;-><init>(Ll/۟᩸ᩳ;)V

    .line 337
    iget v10, p0, Ll/ۖܰᩳ;->ᩴ֫:I

    invoke-direct {p0, v9, p2, v10}, Ll/ۖܰᩳ;->֫(Ll/᩷۫ۡ;Ll/ۢ۫ۡ;I)V

    move v10, v2

    :goto_2
    if-ge v10, v4, :cond_7

    .line 339
    iget-boolean v11, p0, Ll/ۗۤᩳ;->ᩳ:Z

    if-nez v11, :cond_6

    iget-boolean v11, p0, Ll/ۗۤᩳ;->ܳ֫:Z

    if-eqz v11, :cond_5

    goto :goto_3

    .line 340
    :cond_5
    invoke-direct {p0, v9, p2, v10}, Ll/ۖܰᩳ;->֫(Ll/᩷۫ۡ;Ll/ۢ۫ۡ;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 345
    :cond_6
    :goto_3
    invoke-virtual {v8}, Ll/۟᩸ᩳ;->close()V

    return-object v3

    :cond_7
    if-lt v5, v2, :cond_8

    if-lt v5, v4, :cond_9

    .line 342
    :cond_8
    :try_start_1
    invoke-direct {p0, v9, p2, v5}, Ll/ۖܰᩳ;->֫(Ll/᩷۫ۡ;Ll/ۢ۫ۡ;I)V

    :cond_9
    if-eq v6, v5, :cond_b

    if-lt v6, v2, :cond_a

    if-lt v6, v4, :cond_b

    .line 344
    :cond_a
    invoke-direct {p0, v9, p2, v6}, Ll/ۖܰᩳ;->֫(Ll/᩷۫ۡ;Ll/ۢ۫ۡ;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 345
    :cond_b
    invoke-virtual {v8}, Ll/۟᩸ᩳ;->close()V

    if-eqz v1, :cond_c

    .line 347
    invoke-virtual {p1}, Ll/ۙۤᩳ;->ܽ()I

    move-result p2

    invoke-virtual {p1}, Ll/ۙۤᩳ;->ܳ()I

    move-result v1

    invoke-virtual {p0, p2, v1}, Ll/ۖܰᩳ;->᩻(II)V

    .line 349
    :cond_c
    iget p2, p0, Ll/ۗۤᩳ;->ۨ:I

    if-ltz p2, :cond_d

    new-instance p2, Ll/ۙۤᩳ;

    invoke-virtual {p1}, Ll/ۙۤᩳ;->ܽ()I

    move-result v1

    .line 350
    invoke-virtual {p0}, Ll/ۖܰᩳ;->ۢ()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p1}, Ll/ۙۤᩳ;->ܳ()I

    move-result v8

    sub-int/2addr v3, v8

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 349
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 350
    invoke-virtual {p1}, Ll/ۙۤᩳ;->ᩳ()I

    move-result v3

    invoke-virtual {p1}, Ll/ۙۤᩳ;->ܳ()I

    move-result v8

    invoke-virtual {p1}, Ll/ۙۤᩳ;->֫()I

    move-result p1

    invoke-direct {p2, v1, v3, v8, p1}, Ll/ۙۤᩳ;-><init>(IIII)V

    move-object p1, p2

    .line 351
    :cond_d
    iget-object p2, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {p2, v5}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result p2

    const/4 v1, 0x0

    cmpl-float p2, p2, v1

    if-ltz p2, :cond_e

    iget-object p2, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {p2, v6}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result p2

    cmpl-float p2, p2, v1

    if-ltz p2, :cond_e

    const/4 p2, 0x1

    goto :goto_4

    :cond_e
    const/4 p2, 0x0

    :goto_4
    if-ge v2, v4, :cond_10

    if-eqz p2, :cond_10

    .line 352
    iget-object p2, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {p2, v2}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result p2

    cmpl-float p2, p2, v1

    if-ltz p2, :cond_f

    const/4 p2, 0x1

    goto :goto_5

    :cond_f
    const/4 p2, 0x0

    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_10
    if-eqz p2, :cond_11

    .line 353
    iget-boolean p2, p0, Ll/ۗۤᩳ;->ᩳ:Z

    if-nez p2, :cond_11

    iget-boolean p2, p0, Ll/ۗۤᩳ;->ܳ֫:Z

    if-nez p2, :cond_11

    .line 354
    invoke-virtual {p1}, Ll/ۙۤᩳ;->ܽ()I

    move-result p2

    invoke-virtual {p0}, Ll/ۖܰᩳ;->ۢ()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p1}, Ll/ۙۤᩳ;->ܳ()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-gt p2, v0, :cond_11

    .line 355
    iput-object v7, p0, Ll/ۖܰᩳ;->֨֫:Ll/ܳ۟ᩳ;

    .line 356
    iput-object p1, p0, Ll/ۖܰᩳ;->᩵֫:Ll/ۙۤᩳ;

    :cond_11
    return-object v7

    :catchall_0
    move-exception p1

    .line 335
    :try_start_2
    invoke-virtual {v8}, Ll/۟᩸ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw p1

    :cond_12
    :goto_7
    return-object v3
.end method

.method private ֫(IIILl/۟᩸ᩳ;)V
    .locals 19

    move-object/from16 v7, p0

    move/from16 v0, p1

    move-object/from16 v8, p4

    .line 670
    invoke-virtual/range {p0 .. p1}, Ll/ۗۤᩳ;->ܿ(I)I

    move-result v9

    if-lez p2, :cond_0

    add-int v1, v0, p2

    .line 677
    invoke-virtual {v7, v1}, Ll/ۗۤᩳ;->ܿ(I)I

    move-result v1

    sub-int/2addr v1, v9

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 680
    :goto_0
    iget-object v10, v7, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    if-lez p3, :cond_1

    invoke-virtual {v10}, Ll/۫ۨᩳ;->֫ܽ()Z

    move-result v2

    if-nez v2, :cond_1

    add-int v2, v0, p3

    .line 681
    invoke-virtual {v8, v2}, Ll/۟᩸ᩳ;->ۧ(I)I

    move-result v2

    invoke-virtual {v8, v0}, Ll/۟᩸ᩳ;->ۧ(I)I

    move-result v0

    sub-int/2addr v2, v0

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    sub-int v0, v2, v1

    .line 687
    iget-object v11, v7, Ll/ۖܰᩳ;->۫֫:Ll/ܽ۟ᩳ;

    .line 689
    iget-object v2, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v2, v9}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v2

    .line 690
    iget v2, v2, Ll/ۨܰᩳ;->᩶:I

    .line 691
    iget-object v3, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    add-int/2addr v1, v9

    invoke-virtual {v3, v1}, Ll/᩷۟ᩳ;->ۧ(I)I

    move-result v1

    add-int v1, v1, p3

    sub-int v12, v1, p2

    const/high16 v1, -0x40800000    # -1.0f

    if-eqz v0, :cond_4

    const/4 v3, 0x0

    .line 694
    iput-object v3, v7, Ll/ۖܰᩳ;->۫֫:Ll/ܽ۟ᩳ;

    if-gez v0, :cond_2

    .line 696
    iget-object v1, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    sub-int v3, v9, v0

    invoke-virtual {v1, v9, v3}, Ll/᩷۟ᩳ;->֫(II)V

    .line 697
    iget-object v1, v7, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    invoke-virtual {v1, v9, v3}, Ll/᩸ܰᩳ;->֫(II)V

    .line 698
    iget-object v1, v7, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {v1, v9, v3}, Ll/ۤܽᩴ;->֫(II)V

    goto :goto_3

    .line 701
    :cond_2
    new-instance v3, Ll/᩷۟ᩳ;

    invoke-direct {v3}, Ll/᩷۟ᩳ;-><init>()V

    .line 702
    new-instance v4, Ll/ۨܰᩳ;

    invoke-direct {v4}, Ll/ۨܰᩳ;-><init>()V

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v0, :cond_3

    .line 704
    invoke-virtual {v3, v4}, Ll/᩷۟ᩳ;->֫(Ll/ۨܰᩳ;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 705
    :cond_3
    new-array v4, v0, [F

    .line 706
    invoke-static {v4, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 708
    iget-object v1, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v1, v9, v3}, Ll/᩷۟ᩳ;->addAll(ILjava/util/Collection;)Z

    .line 709
    iget-object v1, v7, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    invoke-virtual {v1, v9, v0}, Ll/᩸ܰᩳ;->ۧ(II)V

    .line 710
    iget-object v1, v7, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-static {v4}, Ll/ۤܽᩴ;->֫([F)Ll/ۤܽᩴ;

    move-result-object v3

    invoke-virtual {v1, v9, v3}, Ll/ۤܽᩴ;->֫(ILl/ۙᩳᩴ;)Z

    .line 781
    :cond_4
    :goto_3
    iget-object v13, v7, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v13}, Ll/ۢ۫ۡ;->ۡ()I

    move-result v14

    .line 789
    iget-object v1, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v1}, Ll/᩷۟ᩳ;->ۧ()Ll/ܰܰᩳ;

    move-result-object v15

    .line 790
    invoke-virtual {v7, v8, v2, v12}, Ll/ۗۤᩳ;->֫(Ll/۟᩸ᩳ;II)Ll/᩺᩸ᩳ;

    move-result-object v16

    const/4 v1, 0x1

    move v5, v2

    move v6, v9

    :goto_4
    if-eqz v1, :cond_a

    .line 792
    :try_start_0
    invoke-virtual/range {v16 .. v16}, Ll/᩺᩸ᩳ;->֫()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_6

    if-lt v2, v12, :cond_5

    goto :goto_5

    :cond_5
    move/from16 v17, v1

    move v4, v2

    goto :goto_6

    :cond_6
    :goto_5
    const/4 v1, 0x0

    move v4, v12

    const/16 v17, 0x0

    .line 797
    :goto_6
    invoke-virtual {v15, v6}, Ll/ܰܰᩳ;->֫(I)Ll/ۨܰᩳ;

    move-result-object v1

    .line 798
    invoke-virtual {v1, v5, v4, v6}, Ll/ۨܰᩳ;->֫(III)V

    .line 799
    iget-object v2, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v2, v6, v1}, Ll/᩷۟ᩳ;->ۧ(ILl/ۨܰᩳ;)V

    .line 9843
    iget-boolean v2, v10, Ll/۫ۨᩳ;->ۜۧ:Z

    if-nez v2, :cond_9

    .line 801
    iget v2, v1, Ll/ۨܰᩳ;->᩸:I

    iget v3, v1, Ll/ۨܰᩳ;->᩶:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-int/2addr v2, v3

    const/16 v3, 0x2710

    if-ge v2, v3, :cond_7

    .line 613
    :try_start_1
    invoke-virtual {v1, v8, v13}, Ll/ۨܰᩳ;->֫(Ljava/lang/CharSequence;Ll/ۢ۫ۡ;)F

    move-result v1

    .line 614
    iget-object v2, v7, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {v2, v1, v6}, Ll/ۤܽᩴ;->֫(FI)F

    .line 615
    iget-object v1, v7, Ll/ۖܰᩳ;->۫֫:Ll/ܽ۟ᩳ;

    if-eqz v1, :cond_8

    invoke-virtual {v1, v6}, Ll/ܽ۟ᩳ;->֫(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_7

    .line 803
    :cond_7
    :try_start_2
    iget-object v1, v7, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    const/high16 v2, -0x40800000    # -1.0f

    invoke-virtual {v1, v2, v6}, Ll/ۤܽᩴ;->֫(FI)F

    .line 804
    iget-object v1, v7, Ll/ۖܰᩳ;->۫֫:Ll/ܽ۟ᩳ;

    if-eqz v1, :cond_8

    invoke-virtual {v1, v6}, Ll/ܽ۟ᩳ;->֫(I)V

    .line 806
    :catch_0
    :cond_8
    :goto_7
    iget-object v1, v7, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    move v2, v6

    move-object/from16 v3, p0

    move/from16 v18, v4

    move-object/from16 v4, p4

    move v8, v6

    move v6, v14

    invoke-virtual/range {v1 .. v6}, Ll/᩸ܰᩳ;->֫(ILl/ۗۤᩳ;Ll/۟᩸ᩳ;II)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_8

    :cond_9
    move/from16 v18, v4

    move v8, v6

    :goto_8
    add-int/lit8 v5, v18, 0x1

    add-int/lit8 v6, v8, 0x1

    move-object/from16 v8, p4

    move/from16 v1, v17

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 790
    :try_start_3
    invoke-virtual/range {v16 .. v16}, Ll/᩺᩸ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_9

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_9
    throw v1

    :cond_a
    move v8, v6

    .line 813
    invoke-virtual/range {v16 .. v16}, Ll/᩺᩸ᩳ;->close()V

    .line 814
    iput v9, v7, Ll/ۖܰᩳ;->ۙ֫:I

    .line 815
    iput v8, v7, Ll/ۖܰᩳ;->ۗ֫:I

    if-eqz v0, :cond_b

    .line 717
    iget-object v1, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v1, v9, v8}, Ll/᩷۟ᩳ;->ۧ(II)V

    .line 718
    :cond_b
    iget-object v1, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v1}, Ll/᩷۟ᩳ;->size()I

    move-result v2

    sub-int v3, p3, p2

    invoke-virtual {v1, v8, v2, v3, v0}, Ll/᩷۟ᩳ;->֫(IIII)V

    .line 9843
    iget-boolean v1, v10, Ll/۫ۨᩳ;->ۜۧ:Z

    if-eqz v1, :cond_d

    .line 721
    iget v1, v7, Ll/ۖܰᩳ;->ᩴ֫:I

    if-lt v1, v9, :cond_c

    add-int/2addr v1, v0

    .line 722
    iput v1, v7, Ll/ۖܰᩳ;->ᩴ֫:I

    :cond_c
    return-void

    .line 727
    :cond_d
    iget v8, v7, Ll/ۖܰᩳ;->ۙ֫:I

    .line 728
    iget v12, v7, Ll/ۖܰᩳ;->ۗ֫:I

    .line 729
    invoke-virtual {v13}, Ll/ۢ۫ۡ;->ۡ()I

    move-result v13

    .line 730
    iget-object v1, v10, Ll/۫ۨᩳ;->ۤᩳ:Ll/ۜܺܿ;

    iget-object v1, v1, Ll/ۜܺܿ;->ܽ:Ll/᩻ܺܿ;

    .line 731
    iget-boolean v2, v1, Ll/᩻ܺܿ;->ܽ:Z

    if-eqz v2, :cond_10

    .line 732
    iget v2, v1, Ll/᩻ܺܿ;->ۧ:I

    invoke-virtual {v7, v2}, Ll/ۗۤᩳ;->ܿ(I)I

    move-result v2

    .line 733
    iget v1, v1, Ll/᩻ܺܿ;->֫:I

    invoke-virtual {v7, v1}, Ll/ۗۤᩳ;->ܿ(I)I

    move-result v1

    .line 568
    iget-object v3, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v3, v2}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v2

    iget-object v3, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v3, v1}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v1

    .line 738
    iget v2, v2, Ll/ۨܰᩳ;->᩹:I

    invoke-static {v8, v2}, Ljava/lang/Math;->min(II)I

    move-result v10

    .line 739
    iget v1, v1, Ll/ۨܰᩳ;->᩹:I

    add-int/lit8 v1, v1, 0x1

    invoke-static {v12, v1}, Ljava/lang/Math;->max(II)I

    move-result v14

    move v15, v10

    :goto_a
    if-ge v15, v8, :cond_e

    .line 742
    iget-object v1, v7, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    iget-object v2, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v2, v15}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v5

    move v2, v15

    move-object/from16 v3, p0

    move-object/from16 v4, p4

    move v6, v13

    invoke-virtual/range {v1 .. v6}, Ll/᩸ܰᩳ;->֫(ILl/ۗۤᩳ;Ll/۟᩸ᩳ;II)V

    add-int/lit8 v15, v15, 0x1

    goto :goto_a

    :cond_e
    :goto_b
    if-ge v12, v14, :cond_f

    .line 746
    iget-object v1, v7, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    iget-object v2, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v2, v12}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v5

    move v2, v12

    move-object/from16 v3, p0

    move-object/from16 v4, p4

    move v6, v13

    invoke-virtual/range {v1 .. v6}, Ll/᩸ܰᩳ;->֫(ILl/ۗۤᩳ;Ll/۟᩸ᩳ;II)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_b

    :cond_f
    move v8, v10

    move v12, v14

    .line 753
    :cond_10
    iget-object v1, v7, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    invoke-virtual {v1, v8, v12}, Ll/᩸ܰᩳ;->ᩳ(II)V

    if-eqz v0, :cond_12

    if-eqz v11, :cond_11

    .line 760
    invoke-virtual {v11, v9}, Ll/ܽ۟ᩳ;->ۧ(I)Z

    move-result v0

    if-eqz v0, :cond_12

    iput-object v11, v7, Ll/ۖܰᩳ;->۫֫:Ll/ܽ۟ᩳ;

    goto :goto_c

    .line 762
    :cond_11
    iget-object v0, v7, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-static {v0}, Ll/ܽ۟ᩳ;->֫(Ll/ۤܽᩴ;)Ll/ܽ۟ᩳ;

    move-result-object v0

    iput-object v0, v7, Ll/ۖܰᩳ;->۫֫:Ll/ܽ۟ᩳ;

    .line 765
    :cond_12
    :goto_c
    iget-object v0, v7, Ll/ۖܰᩳ;->۫֫:Ll/ܽ۟ᩳ;

    if-nez v0, :cond_13

    iget-object v0, v7, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-static {v0}, Ll/ܽ۟ᩳ;->֫(Ll/ۤܽᩴ;)Ll/ܽ۟ᩳ;

    move-result-object v0

    iput-object v0, v7, Ll/ۖܰᩳ;->۫֫:Ll/ܽ۟ᩳ;

    .line 766
    :cond_13
    iget-object v0, v7, Ll/ۖܰᩳ;->۫֫:Ll/ܽ۟ᩳ;

    invoke-virtual {v0}, Ll/ܽ۟ᩳ;->֫()I

    move-result v0

    iput v0, v7, Ll/ۖܰᩳ;->ᩴ֫:I

    .line 768
    iget-object v1, v7, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {v1, v0}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 769
    iget-object v1, v7, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v1}, Ll/᩷۟ᩳ;->size()I

    move-result v1

    const/16 v2, 0x32

    if-ge v1, v2, :cond_14

    invoke-virtual/range {p0 .. p0}, Ll/ۗۤᩳ;->۬()I

    move-result v1

    const/16 v2, 0x2710

    if-ge v1, v2, :cond_14

    goto :goto_d

    .line 770
    :cond_14
    iget v1, v7, Ll/ۖܰᩳ;->ۖ֫:F

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    :goto_d
    iput v0, v7, Ll/ۖܰᩳ;->ۖ֫:F

    const/4 v0, 0x0

    .line 342
    invoke-virtual {v7, v0}, Ll/ۗۤᩳ;->֫(I)I

    move-result v0

    .line 772
    iput v0, v7, Ll/ۗۤᩳ;->ۙ:I

    return-void
.end method

.method private ֫(IILl/ܺۢᩴ;Ljava/util/ArrayList;)V
    .locals 3

    .line 475
    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v0}, Ll/᩷۟ᩳ;->ۧ()Ll/ܰܰᩳ;

    move-result-object v0

    :goto_0
    if-ge p1, p2, :cond_1

    .line 476
    invoke-virtual {p3}, Ll/ܺۢᩴ;->size()I

    move-result v1

    const/16 v2, 0x20

    if-ge v1, v2, :cond_1

    .line 477
    iget-object v1, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {v1, p1}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-gez v1, :cond_0

    .line 478
    invoke-virtual {p3, p1}, Ll/ܺۢᩴ;->add(I)Z

    .line 479
    invoke-virtual {v0, p1}, Ll/ܰܰᩳ;->֫(I)Ll/ۨܰᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۨܰᩳ;->clone()Ll/ۨܰᩳ;

    move-result-object v1

    invoke-virtual {p4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۖܰᩳ;F)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۖܰᩳ;->ۖ֫:F

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۖܰᩳ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۖܰᩳ;->ᩴ֫:I

    return-void
.end method

.method public static ֫(Ll/ۖܰᩳ;ILl/۟᩺ᩳ;Ll/᩷۟ᩳ;Ll/ۤܽᩴ;ILjava/lang/Runnable;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 383
    :try_start_0
    iget-object v2, p0, Ll/ۖܰᩳ;->ۚ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    if-ne p1, v2, :cond_1

    iget-boolean p1, p0, Ll/ۗۤᩳ;->ܳ֫:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    if-ne p1, p3, :cond_1

    iget-object p1, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    if-ne p1, p4, :cond_1

    .line 384
    invoke-virtual {p0}, Ll/ۗۤᩳ;->۫()I

    move-result p1

    if-ne p1, p5, :cond_1

    .line 385
    iget-object p1, p0, Ll/ۖܰᩳ;->ۘ֫:Ll/᩻۟ᩳ;

    invoke-virtual {p1}, Ll/᩻۟ᩳ;->ۧ()I

    move-result p1

    iput p1, p0, Ll/ۖܰᩳ;->ᩴ֫:I

    .line 386
    iget-object p1, p0, Ll/ۖܰᩳ;->ۘ֫:Ll/᩻۟ᩳ;

    invoke-virtual {p1}, Ll/᩻۟ᩳ;->֫()Ljava/lang/Throwable;

    move-result-object p1

    .line 387
    iput-object p1, p0, Ll/ۖܰᩳ;->֡֫:Ljava/lang/Throwable;

    if-nez p1, :cond_0

    .line 388
    invoke-static {p4}, Ll/ܽ۟ᩳ;->֫(Ll/ۤܽᩴ;)Ll/ܽ۟ᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۖܰᩳ;->۫֫:Ll/ܽ۟ᩳ;

    .line 389
    :cond_0
    iget p1, p0, Ll/ۖܰᩳ;->ۖ֫:F

    iget p3, p0, Ll/ۖܰᩳ;->ᩴ֫:I

    invoke-virtual {p4, p3}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result p3

    const/4 p4, 0x0

    invoke-static {p4, p3}, Ljava/lang/Math;->max(FF)F

    move-result p3

    invoke-static {p1, p3}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Ll/ۖܰᩳ;->ۖ֫:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 395
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۙ()V

    .line 396
    invoke-interface {p2, v1}, Ll/۟᩺ᩳ;->setReadOnly(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz p6, :cond_2

    .line 399
    :try_start_2
    invoke-interface {p6}, Ljava/lang/Runnable;->run()V

    .line 400
    :cond_2
    iget-object p1, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 402
    iput-object v0, p0, Ll/ۖܰᩳ;->ۘ֫:Ll/᩻۟ᩳ;

    .line 403
    iput-boolean v1, p0, Ll/ۗۤᩳ;->۬:Z

    .line 404
    iget-object p1, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p1, p0}, Ll/۫ۨᩳ;->ᩳ(Ll/ۗۤᩳ;)V

    return-void

    :catchall_0
    move-exception p1

    .line 402
    iput-object v0, p0, Ll/ۖܰᩳ;->ۘ֫:Ll/᩻۟ᩳ;

    .line 403
    iput-boolean v1, p0, Ll/ۗۤᩳ;->۬:Z

    .line 404
    iget-object p2, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p2, p0}, Ll/۫ۨᩳ;->ᩳ(Ll/ۗۤᩳ;)V

    .line 405
    throw p1

    :catchall_1
    move-exception p1

    if-eqz p6, :cond_3

    .line 399
    :try_start_3
    invoke-interface {p6}, Ljava/lang/Runnable;->run()V

    .line 400
    :cond_3
    iget-object p2, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p2}, Landroid/view/View;->postInvalidate()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 402
    iput-object v0, p0, Ll/ۖܰᩳ;->ۘ֫:Ll/᩻۟ᩳ;

    .line 403
    iput-boolean v1, p0, Ll/ۗۤᩳ;->۬:Z

    .line 404
    iget-object p2, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p2, p0}, Ll/۫ۨᩳ;->ᩳ(Ll/ۗۤᩳ;)V

    .line 406
    throw p1

    :catchall_2
    move-exception p1

    .line 402
    iput-object v0, p0, Ll/ۖܰᩳ;->ۘ֫:Ll/᩻۟ᩳ;

    .line 403
    iput-boolean v1, p0, Ll/ۗۤᩳ;->۬:Z

    .line 404
    iget-object p2, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p2, p0}, Ll/۫ۨᩳ;->ᩳ(Ll/ۗۤᩳ;)V

    .line 405
    throw p1

    :catchall_3
    move-exception p1

    .line 395
    :try_start_4
    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۙ()V

    .line 396
    invoke-interface {p2, v1}, Ll/۟᩺ᩳ;->setReadOnly(Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    if-eqz p6, :cond_4

    .line 399
    :try_start_5
    invoke-interface {p6}, Ljava/lang/Runnable;->run()V

    .line 400
    :cond_4
    iget-object p2, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p2}, Landroid/view/View;->postInvalidate()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 402
    iput-object v0, p0, Ll/ۖܰᩳ;->ۘ֫:Ll/᩻۟ᩳ;

    .line 403
    iput-boolean v1, p0, Ll/ۗۤᩳ;->۬:Z

    .line 404
    iget-object p2, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p2, p0}, Ll/۫ۨᩳ;->ᩳ(Ll/ۗۤᩳ;)V

    .line 407
    throw p1

    :catchall_4
    move-exception p1

    .line 402
    iput-object v0, p0, Ll/ۖܰᩳ;->ۘ֫:Ll/᩻۟ᩳ;

    .line 403
    iput-boolean v1, p0, Ll/ۗۤᩳ;->۬:Z

    .line 404
    iget-object p2, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p2, p0}, Ll/۫ۨᩳ;->ᩳ(Ll/ۗۤᩳ;)V

    .line 405
    throw p1

    :catchall_5
    move-exception p1

    if-eqz p6, :cond_5

    .line 399
    :try_start_6
    invoke-interface {p6}, Ljava/lang/Runnable;->run()V

    .line 400
    :cond_5
    iget-object p2, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p2}, Landroid/view/View;->postInvalidate()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 402
    iput-object v0, p0, Ll/ۖܰᩳ;->ۘ֫:Ll/᩻۟ᩳ;

    .line 403
    iput-boolean v1, p0, Ll/ۗۤᩳ;->۬:Z

    .line 404
    iget-object p2, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p2, p0}, Ll/۫ۨᩳ;->ᩳ(Ll/ۗۤᩳ;)V

    .line 406
    throw p1

    :catchall_6
    move-exception p1

    .line 402
    iput-object v0, p0, Ll/ۖܰᩳ;->ۘ֫:Ll/᩻۟ᩳ;

    .line 403
    iput-boolean v1, p0, Ll/ۗۤᩳ;->۬:Z

    .line 404
    iget-object p2, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {p2, p0}, Ll/۫ۨᩳ;->ᩳ(Ll/ۗۤᩳ;)V

    .line 405
    throw p1
.end method

.method public static bridge synthetic ֫(Ll/ۖܰᩳ;Ll/ܽ۟ᩳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۖܰᩳ;->۫֫:Ll/ܽ۟ᩳ;

    return-void
.end method

.method private ֫(Ll/᩷۫ۡ;Ll/ۢ۫ۡ;I)V
    .locals 3

    .line 368
    iget-boolean v0, p0, Ll/ۖܰᩳ;->۠֫:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {v0, p3}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    goto :goto_0

    .line 369
    :cond_0
    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v0, p3}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v0

    .line 371
    iget v1, v0, Ll/ۨܰᩳ;->᩸:I

    iget v2, v0, Ll/ۨܰᩳ;->᩶:I

    sub-int/2addr v1, v2

    .line 372
    iget v2, p0, Ll/ۖܰᩳ;->᩹֫:I

    if-lt v1, v2, :cond_1

    goto :goto_0

    :cond_1
    sub-int/2addr v2, v1

    .line 373
    iput v2, p0, Ll/ۖܰᩳ;->᩹֫:I

    .line 374
    invoke-virtual {v0, p1, p2}, Ll/ۨܰᩳ;->֫(Ljava/lang/CharSequence;Ll/ۢ۫ۡ;)F

    move-result p1

    .line 375
    iget-object p2, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {p2, p1, p3}, Ll/ۤܽᩴ;->֫(FI)F

    .line 376
    iget-object p2, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    iget v0, p0, Ll/ۖܰᩳ;->ᩴ֫:I

    invoke-virtual {p2, v0}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result p2

    cmpl-float p1, p1, p2

    if-lez p1, :cond_2

    iput p3, p0, Ll/ۖܰᩳ;->ᩴ֫:I

    :cond_2
    :goto_0
    return-void
.end method

.method public static synthetic ֫(Ll/ۖܰᩳ;ILl/۟᩺ᩳ;Ll/᩷۟ᩳ;Ll/ۤܽᩴ;I)Z
    .locals 1

    .line 297
    iget-boolean v0, p0, Ll/ۗۤᩳ;->ܳ֫:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۖܰᩳ;->ۚ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    if-ne p1, p3, :cond_1

    iget-object p1, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    if-ne p1, p4, :cond_1

    .line 299
    invoke-virtual {p0}, Ll/ۗۤᩳ;->۫()I

    move-result p0

    if-eq p0, p5, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private ֫(Ll/ܳ۟ᩳ;)[I
    .locals 6

    .line 413
    new-instance v0, Ljava/util/PriorityQueue;

    new-instance v1, Ll/᩻ܰᩳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 414
    invoke-static {v1}, Ll/۠۬ᩴ;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    move-result-object v1

    const/16 v2, 0x20

    invoke-direct {v0, v2, v1}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    .line 415
    iget-object v1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v1}, Ll/᩷۟ᩳ;->ۧ()Ll/ܰܰᩳ;

    move-result-object v1

    const/4 v3, 0x0

    .line 416
    :goto_0
    iget-object v4, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v4}, Ll/᩷۟ᩳ;->size()I

    move-result v4

    if-ge v3, v4, :cond_2

    .line 417
    invoke-virtual {v1, v3}, Ll/ܰܰᩳ;->֫(I)Ll/ۨܰᩳ;

    move-result-object v4

    .line 418
    invoke-virtual {v4}, Ll/ۨܰᩳ;->֫()I

    move-result v5

    iget v4, v4, Ll/ۨܰᩳ;->᩶:I

    sub-int/2addr v5, v4

    .line 419
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->size()I

    move-result v4

    if-ge v4, v2, :cond_0

    new-instance v4, Ll/ۜܰᩳ;

    invoke-direct {v4, v3, v5}, Ll/ۜܰᩳ;-><init>(II)V

    invoke-virtual {v0, v4}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 420
    :cond_0
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۜܰᩳ;

    invoke-virtual {v4}, Ll/ۜܰᩳ;->length()I

    move-result v4

    if-le v5, v4, :cond_1

    .line 421
    invoke-virtual {v0}, Ljava/util/AbstractQueue;->remove()Ljava/lang/Object;

    .line 422
    new-instance v4, Ll/ۜܰᩳ;

    invoke-direct {v4, v3, v5}, Ll/ۜܰᩳ;-><init>(II)V

    invoke-virtual {v0, v4}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 425
    :cond_2
    new-instance v1, Ll/ܳۢᩴ;

    invoke-direct {v1}, Ll/ܳۢᩴ;-><init>()V

    .line 426
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜܰᩳ;

    invoke-virtual {v2}, Ll/ۜܰᩳ;->֫()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ܳۢᩴ;->add(I)Z

    goto :goto_2

    .line 427
    :cond_3
    iget v0, p0, Ll/ۖܰᩳ;->ᩴ֫:I

    invoke-virtual {v1, v0}, Ll/ܳۢᩴ;->add(I)Z

    if-eqz p1, :cond_5

    .line 429
    invoke-virtual {p1}, Ll/ܳ۟ᩳ;->ܳ()I

    move-result v0

    :goto_3
    invoke-virtual {p1}, Ll/ܳ۟ᩳ;->֫()I

    move-result v2

    if-ge v0, v2, :cond_4

    invoke-virtual {v1, v0}, Ll/ܳۢᩴ;->add(I)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 430
    :cond_4
    invoke-virtual {p1}, Ll/ܳ۟ᩳ;->ᩳ()I

    move-result v0

    invoke-virtual {v1, v0}, Ll/ܳۢᩴ;->add(I)Z

    .line 431
    invoke-virtual {p1}, Ll/ܳ۟ᩳ;->ܽ()I

    move-result p1

    invoke-virtual {v1, p1}, Ll/ܳۢᩴ;->add(I)Z

    .line 433
    :cond_5
    invoke-virtual {v1}, Ll/᩸ܿᩴ;->ܶ()[I

    move-result-object p1

    return-object p1
.end method

.method private ۟()V
    .locals 25

    move-object/from16 v9, p0

    .line 249
    iget-object v0, v9, Ll/ۖܰᩳ;->ۚ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    .line 250
    invoke-virtual/range {p0 .. p0}, Ll/ۖܰᩳ;->ۧ()V

    const/4 v1, 0x0

    .line 251
    iput-object v1, v9, Ll/ۖܰᩳ;->᩵֫:Ll/ۙۤᩳ;

    .line 252
    iput-object v1, v9, Ll/ۖܰᩳ;->۫֫:Ll/ܽ۟ᩳ;

    .line 253
    iput-object v1, v9, Ll/ۖܰᩳ;->֨֫:Ll/ܳ۟ᩳ;

    .line 254
    iput-object v1, v9, Ll/ۖܰᩳ;->֡֫:Ljava/lang/Throwable;

    .line 255
    iget-boolean v2, v9, Ll/ۖܰᩳ;->۠֫:Z

    if-nez v2, :cond_0

    invoke-virtual/range {p0 .. p0}, Ll/ۗۤᩳ;->ܽ()V

    .line 256
    :cond_0
    iget-object v10, v9, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    .line 257
    invoke-virtual {v9, v10}, Ll/ۗۤᩳ;->֫(Ll/۟᩺ᩳ;)V

    const/4 v11, 0x1

    .line 259
    invoke-interface {v10, v11}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 260
    iput-boolean v11, v9, Ll/ۗۤᩳ;->۬:Z

    const/4 v12, 0x0

    .line 261
    iput-boolean v12, v9, Ll/ۗۤᩳ;->ܳ֫:Z

    const/16 v2, 0x2710

    .line 263
    iput v2, v9, Ll/ۖܰᩳ;->᩹֫:I

    .line 265
    :try_start_0
    iget v3, v9, Ll/ۖܰᩳ;->ᩴ֫:I

    iget-object v4, v9, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v4}, Ll/᩷۟ᩳ;->size()I

    move-result v4

    if-lt v3, v4, :cond_1

    iput v12, v9, Ll/ۖܰᩳ;->ᩴ֫:I

    .line 266
    :cond_1
    invoke-virtual/range {p0 .. p0}, Ll/ۗۤᩳ;->᩹()Ll/۟᩸ᩳ;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 267
    :try_start_1
    iget-object v4, v9, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    iget v5, v9, Ll/ۖܰᩳ;->ᩴ֫:I

    invoke-virtual {v4, v5}, Ll/᩷۟ᩳ;->ۧ(I)I

    move-result v4

    iget-object v5, v9, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    iget v6, v9, Ll/ۖܰᩳ;->ᩴ֫:I

    invoke-virtual {v5, v6}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v5

    sub-int/2addr v4, v5

    const/4 v5, 0x0

    if-ge v4, v2, :cond_4

    iget-boolean v4, v9, Ll/ۖܰᩳ;->۠֫:Z

    if-eqz v4, :cond_2

    iget-object v4, v9, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    iget v6, v9, Ll/ۖܰᩳ;->ᩴ֫:I

    .line 268
    invoke-virtual {v4, v6}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result v4

    cmpg-float v4, v4, v5

    if-gez v4, :cond_4

    .line 269
    :cond_2
    iget v4, v9, Ll/ۖܰᩳ;->ᩴ֫:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 605
    :try_start_2
    iget-object v6, v9, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v6, v4}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v6

    .line 613
    iget-object v7, v9, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v6, v3, v7}, Ll/ۨܰᩳ;->֫(Ljava/lang/CharSequence;Ll/ۢ۫ۡ;)F

    move-result v6

    .line 614
    iget-object v7, v9, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {v7, v6, v4}, Ll/ۤܽᩴ;->֫(FI)F

    .line 615
    iget-object v6, v9, Ll/ۖܰᩳ;->۫֫:Ll/ܽ۟ᩳ;

    if-eqz v6, :cond_3

    invoke-virtual {v6, v4}, Ll/ܽ۟ᩳ;->֫(I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 270
    :catch_0
    :cond_3
    :try_start_3
    iget v4, v9, Ll/ۖܰᩳ;->᩹֫:I

    iget-object v6, v9, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    iget v7, v9, Ll/ۖܰᩳ;->ᩴ֫:I

    invoke-virtual {v6, v7}, Ll/᩷۟ᩳ;->ۧ(I)I

    move-result v6

    iget-object v7, v9, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    iget v8, v9, Ll/ۖܰᩳ;->ᩴ֫:I

    invoke-virtual {v7, v8}, Ll/᩷۟ᩳ;->ۚ(I)I

    move-result v7

    sub-int/2addr v6, v7

    sub-int/2addr v4, v6

    iput v4, v9, Ll/ۖܰᩳ;->᩹֫:I

    .line 272
    :cond_4
    iget-object v4, v9, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v4}, Ll/᩷۟ᩳ;->size()I

    move-result v4

    const/16 v6, 0x32

    if-ge v4, v6, :cond_9

    invoke-virtual/range {p0 .. p0}, Ll/ۗۤᩳ;->۬()I

    move-result v4

    if-ge v4, v2, :cond_9

    .line 273
    iget-object v0, v9, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    iget v1, v9, Ll/ۖܰᩳ;->ᩴ֫:I

    invoke-virtual {v0, v1}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result v0

    const/4 v1, 0x0

    .line 274
    :goto_0
    iget-object v2, v9, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v2}, Ll/᩷۟ᩳ;->size()I

    move-result v2

    if-ge v1, v2, :cond_8

    .line 275
    iget-boolean v2, v9, Ll/ۖܰᩳ;->۠֫:Z

    if-eqz v2, :cond_5

    iget-object v2, v9, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {v2, v1}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result v2

    cmpl-float v2, v2, v5

    if-ltz v2, :cond_5

    .line 276
    iget-object v2, v9, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {v2, v1}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    goto :goto_1

    .line 605
    :cond_5
    :try_start_4
    iget-object v2, v9, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v2, v1}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v2

    .line 613
    iget-object v4, v9, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v2, v3, v4}, Ll/ۨܰᩳ;->֫(Ljava/lang/CharSequence;Ll/ۢ۫ۡ;)F

    move-result v2

    .line 614
    iget-object v4, v9, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {v4, v2, v1}, Ll/ۤܽᩴ;->֫(FI)F

    .line 615
    iget-object v4, v9, Ll/ۖܰᩳ;->۫֫:Ll/ܽ۟ᩳ;

    if-eqz v4, :cond_6

    invoke-virtual {v4, v1}, Ll/ܽ۟ᩳ;->֫(I)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_1

    :catch_1
    const/4 v2, 0x0

    :cond_6
    :goto_1
    cmpl-float v4, v2, v0

    if-lez v4, :cond_7

    .line 279
    :try_start_5
    iput v1, v9, Ll/ۖܰᩳ;->ᩴ֫:I

    move v0, v2

    :cond_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 282
    :cond_8
    iget-object v0, v9, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-static {v0}, Ll/ܽ۟ᩳ;->֫(Ll/ۤܽᩴ;)Ll/ܽ۟ᩳ;

    move-result-object v0

    iput-object v0, v9, Ll/ۖܰᩳ;->۫֫:Ll/ܽ۟ᩳ;

    .line 283
    iget v0, v9, Ll/ۖܰᩳ;->ۖ֫:F

    iget-object v1, v9, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    iget v2, v9, Ll/ۖܰᩳ;->ᩴ֫:I

    invoke-virtual {v1, v2}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result v1

    invoke-static {v5, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, v9, Ll/ۖܰᩳ;->ۖ֫:F
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 286
    :try_start_6
    invoke-virtual {v3}, Ll/۟᩸ᩳ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 310
    :try_start_7
    invoke-virtual/range {p0 .. p0}, Ll/ۗۤᩳ;->ۙ()V

    invoke-interface {v10, v12}, Ll/۟᩺ᩳ;->setReadOnly(Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 311
    iput-boolean v12, v9, Ll/ۗۤᩳ;->۬:Z

    return-void

    :catchall_0
    move-exception v0

    iput-boolean v12, v9, Ll/ۗۤᩳ;->۬:Z

    throw v0

    .line 286
    :cond_9
    :try_start_8
    invoke-virtual {v3}, Ll/۟᩸ᩳ;->close()V

    .line 287
    iget-object v15, v9, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 288
    iget-object v14, v9, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    .line 289
    invoke-virtual/range {p0 .. p0}, Ll/ۗۤᩳ;->۫()I

    move-result v8

    .line 291
    iget-object v2, v9, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    move-object/from16 v16, v2

    monitor-enter v16
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 292
    :try_start_9
    iget-object v2, v9, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v2}, Ll/ۢ۫ۡ;->ۧ()Ll/ۢ۫ۡ;

    move-result-object v13

    .line 293
    monitor-exit v16
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 294
    :try_start_a
    invoke-direct {v9, v10, v13}, Ll/ۖܰᩳ;->֫(Ll/۟᩺ᩳ;Ll/ۢ۫ۡ;)Ll/ܳ۟ᩳ;

    move-result-object v7

    .line 295
    invoke-virtual {v15}, Ll/᩷۟ᩳ;->size()I

    move-result v2

    const v3, 0x186a0

    if-le v2, v3, :cond_a

    iget-object v1, v9, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 878
    new-instance v2, Ll/۟ۤᩳ;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v1}, Ll/۟ۤᩳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 882
    new-instance v2, Ll/֫ۛᩳ;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v1}, Ll/֫ۛᩳ;-><init>(ILjava/lang/Object;)V

    move-object/from16 v16, v2

    goto :goto_2

    :cond_a
    move-object/from16 v16, v1

    .line 296
    :goto_2
    new-instance v6, Ll/᩻۟ᩳ;

    new-instance v5, Ll/ᩳܰᩳ;

    const/4 v1, 0x0

    invoke-direct {v5, v1, v9}, Ll/ᩳܰᩳ;-><init>(ILjava/lang/Object;)V

    iget v4, v9, Ll/ۖܰᩳ;->ᩴ֫:I

    iget-boolean v3, v9, Ll/ۖܰᩳ;->۠֫:Z

    new-instance v21, Ll/ܿܰᩳ;

    move-object/from16 v1, v21

    move-object/from16 v2, p0

    move/from16 v20, v3

    move v3, v0

    move/from16 v18, v4

    move-object v4, v10

    move-object/from16 v17, v5

    move-object v5, v15

    move-object/from16 v23, v6

    move-object v6, v14

    move-object/from16 v24, v7

    move v7, v8

    invoke-direct/range {v1 .. v7}, Ll/ܿܰᩳ;-><init>(Ll/ۖܰᩳ;ILl/۟᩺ᩳ;Ll/᩷۟ᩳ;Ll/ۤܽᩴ;I)V

    new-instance v22, Ll/ܳܰᩳ;

    move-object/from16 v1, v22

    move-object/from16 v2, p0

    move v3, v0

    move-object v4, v10

    move-object v5, v15

    move-object v6, v14

    move v7, v8

    move-object/from16 v8, v16

    invoke-direct/range {v1 .. v8}, Ll/ܳܰᩳ;-><init>(Ll/ۖܰᩳ;ILl/۟᩺ᩳ;Ll/᩷۟ᩳ;Ll/ۤܽᩴ;ILl/֫ۛᩳ;)V

    move-object v0, v13

    move-object/from16 v13, v23

    move-object v1, v14

    move-object/from16 v14, v17

    move-object/from16 v16, v1

    move-object/from16 v17, v0

    move-object/from16 v19, v24

    invoke-direct/range {v13 .. v22}, Ll/᩻۟ᩳ;-><init>(Ll/ᩳܰᩳ;Ll/᩷۟ᩳ;Ll/ۤܽᩴ;Ll/ۢ۫ۡ;ILl/ܳ۟ᩳ;ZLl/ܿܰᩳ;Ll/ܳܰᩳ;)V

    move-object/from16 v0, v24

    .line 301
    invoke-direct {v9, v0}, Ll/ۖܰᩳ;->֫(Ll/ܳ۟ᩳ;)[I

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Ll/᩻۟ᩳ;->֫([I)V

    .line 302
    iput-object v1, v9, Ll/ۖܰᩳ;->ۘ֫:Ll/᩻۟ᩳ;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 306
    :try_start_b
    invoke-interface {v10}, Ll/۟᩺ᩳ;->᩵֫()Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance v0, Ll/᩺᩹ۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_3

    :cond_b
    sget-object v0, Ll/֫ۨۡ;->֫:Ljava/util/concurrent/ExecutorService;

    :goto_3
    sget v2, Ll/ܿ᩸ۡ;->֫:I

    const/4 v3, 0x2

    .line 307
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 306
    invoke-virtual {v1, v0, v2}, Ll/᩻۟ᩳ;->֫(Ljava/util/concurrent/Executor;I)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    return-void

    :catchall_1
    move-exception v0

    goto :goto_6

    :catchall_2
    move-exception v0

    goto :goto_5

    :catchall_3
    move-exception v0

    .line 293
    :try_start_c
    monitor-exit v16
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :try_start_d
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    :catchall_4
    move-exception v0

    move-object v1, v0

    .line 266
    :try_start_e
    invoke-virtual {v3}, Ll/۟᩸ᩳ;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    goto :goto_4

    :catchall_5
    move-exception v0

    move-object v2, v0

    :try_start_f
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    :goto_5
    const/4 v11, 0x0

    :goto_6
    if-nez v11, :cond_c

    .line 310
    :try_start_10
    invoke-virtual/range {p0 .. p0}, Ll/ۗۤᩳ;->ۙ()V

    invoke-interface {v10, v12}, Ll/۟᩺ᩳ;->setReadOnly(Z)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    .line 311
    iput-boolean v12, v9, Ll/ۗۤᩳ;->۬:Z

    goto :goto_7

    :catchall_6
    move-exception v0

    iput-boolean v12, v9, Ll/ۗۤᩳ;->۬:Z

    throw v0

    .line 313
    :cond_c
    :goto_7
    throw v0
.end method

.method public static bridge synthetic ۧ(Ll/ۖܰᩳ;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۖܰᩳ;->ۚ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method private ܰ()V
    .locals 6

    .line 166
    iget-object v0, p0, Ll/ۗۤᩳ;->ܶ:Ll/᩷۟ᩳ;

    invoke-virtual {v0}, Ll/᩷۟ᩳ;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 167
    iget-object v3, p0, Ll/ۗۤᩳ;->ܶ:Ll/᩷۟ᩳ;

    invoke-virtual {v3, v2}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v3

    iget-object v4, p0, Ll/ۗۤᩳ;->۠:Ljava/lang/String;

    iget-object v5, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v3, v4, v5}, Ll/ۨܰᩳ;->֫(Ljava/lang/CharSequence;Ll/ۢ۫ۡ;)F

    move-result v3

    cmpl-float v4, v3, v1

    if-lez v4, :cond_0

    move v1, v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 172
    :cond_1
    iput v1, p0, Ll/ۖܰᩳ;->ܺ֫:F

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ۖܰᩳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/ۖܰᩳ;->۬֫:Ll/ܺܰᩳ;

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ۖܰᩳ;)Ll/ܺܰᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۖܰᩳ;->۬֫:Ll/ܺܰᩳ;

    return-object p0
.end method

.method private ܽ(Ll/۟᩺ᩳ;)V
    .locals 11

    .line 185
    invoke-virtual {p0}, Ll/ۗۤᩳ;->ܽ()V

    const/4 v0, 0x0

    .line 186
    iput-boolean v0, p0, Ll/ۖܰᩳ;->۠֫:Z

    const/4 v1, 0x0

    .line 187
    iput v1, p0, Ll/ۖܰᩳ;->ܶ֫:F

    .line 188
    invoke-virtual {p0}, Ll/ۖܰᩳ;->ۧ()V

    .line 189
    iput-boolean v0, p0, Ll/ۗۤᩳ;->ᩳ:Z

    .line 190
    invoke-virtual {p0, p1}, Ll/ۗۤᩳ;->֫(Ll/۟᩺ᩳ;)V

    .line 192
    iget-object p1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    goto :goto_0

    :cond_0
    new-instance p1, Ll/᩷۟ᩳ;

    invoke-direct {p1}, Ll/᩷۟ᩳ;-><init>()V

    .line 193
    :goto_0
    iget-object v2, p0, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    invoke-virtual {v2}, Ll/᩸ܰᩳ;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    goto :goto_1

    :cond_1
    new-instance v2, Ll/᩸ܰᩳ;

    invoke-direct {v2}, Ll/᩸ܰᩳ;-><init>()V

    .line 195
    :goto_1
    new-instance v3, Ll/ۤܽᩴ;

    invoke-direct {v3}, Ll/ۤܽᩴ;-><init>()V

    iput-object v3, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    const/4 v3, 0x0

    .line 196
    iput-object v3, p0, Ll/ۖܰᩳ;->۫֫:Ll/ܽ۟ᩳ;

    .line 197
    iput v1, p0, Ll/ۖܰᩳ;->ۖ֫:F

    .line 198
    invoke-virtual {v2}, Ll/᩸ܰᩳ;->clear()V

    .line 200
    invoke-virtual {p0}, Ll/ۗۤᩳ;->᩹()Ll/۟᩸ᩳ;

    move-result-object v1

    .line 205
    :try_start_0
    iget-object v3, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v3}, Ll/ۢ۫ۡ;->ۡ()I

    move-result v3

    .line 206
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->length()I

    move-result v4

    invoke-virtual {p0, v1, v0, v4}, Ll/ۗۤᩳ;->֫(Ll/۟᩸ᩳ;II)Ll/᩺᩸ᩳ;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 207
    :try_start_1
    new-instance v5, Ll/ۨܰᩳ;

    invoke-direct {v5}, Ll/ۨܰᩳ;-><init>()V

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_2
    if-eqz v6, :cond_4

    .line 209
    iget-boolean v9, p0, Ll/ۗۤᩳ;->ᩳ:Z

    if-eqz v9, :cond_2

    .line 210
    invoke-virtual {p1}, Ll/᩷۟ᩳ;->clear()V

    .line 211
    iget-object p1, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {p1}, Ll/ۤܽᩴ;->clear()V

    .line 212
    invoke-virtual {v2}, Ll/᩸ܰᩳ;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 228
    :try_start_2
    invoke-virtual {v4}, Ll/᩺᩸ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 237
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V

    return-void

    .line 216
    :cond_2
    :try_start_3
    invoke-static {p0, v1, v7, v3}, Ll/᩵ܰᩳ;->֫(Ll/ۗۤᩳ;Ljava/lang/CharSequence;II)I

    move-result v9

    invoke-virtual {v2, v9}, Ll/᩸ܰᩳ;->add(I)V

    .line 217
    invoke-virtual {v4}, Ll/᩺᩸ᩳ;->֫()I

    move-result v9

    const/4 v10, -0x1

    if-ne v9, v10, :cond_3

    .line 220
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->length()I

    move-result v9

    const/4 v6, 0x0

    .line 222
    :cond_3
    invoke-virtual {v5, v7, v9, v8}, Ll/ۨܰᩳ;->֫(III)V

    .line 223
    invoke-virtual {p1, v5}, Ll/᩷۟ᩳ;->֫(Ll/ۨܰᩳ;)V

    .line 224
    iget-object v7, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    const/high16 v10, -0x40800000    # -1.0f

    invoke-virtual {v7, v10}, Ll/ۤܽᩴ;->add(F)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    add-int/lit8 v7, v9, 0x1

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 228
    :cond_4
    :try_start_4
    invoke-virtual {v4}, Ll/᩺᩸ᩳ;->close()V

    .line 230
    invoke-virtual {v2}, Ll/᩸ܰᩳ;->ܽ()V

    .line 231
    invoke-virtual {p1}, Ll/᩷۟ᩳ;->ۧ()Ll/ܰܰᩳ;

    move-result-object v3

    const/4 v4, 0x0

    .line 232
    :goto_3
    invoke-virtual {p1}, Ll/᩷۟ᩳ;->size()I

    move-result v5

    if-ge v4, v5, :cond_5

    .line 233
    invoke-virtual {v3, v4}, Ll/ܰܰᩳ;->֫(I)Ll/ۨܰᩳ;

    move-result-object v5

    .line 234
    invoke-virtual {v5, v1}, Ll/ۨܰᩳ;->֫(Ll/۟᩸ᩳ;)V

    .line 235
    invoke-virtual {p1, v4, v5}, Ll/᩷۟ᩳ;->ۧ(ILl/ۨܰᩳ;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 237
    :cond_5
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V

    .line 238
    iput-object p1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 239
    iput-object v2, p0, Ll/ۗۤᩳ;->᩸:Ll/᩸ܰᩳ;

    .line 342
    invoke-virtual {p0, v0}, Ll/ۗۤᩳ;->֫(I)I

    move-result p1

    .line 240
    iput p1, p0, Ll/ۗۤᩳ;->ۙ:I

    .line 242
    invoke-direct {p0}, Ll/ۖܰᩳ;->۟()V

    return-void

    :catchall_0
    move-exception p1

    .line 206
    :try_start_5
    invoke-virtual {v4}, Ll/᩺᩸ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    :try_start_6
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p1

    .line 200
    :try_start_7
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw p1
.end method

.method public static bridge synthetic ܿ(Ll/ۖܰᩳ;)Ll/ۤܽᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۖܰᩳ;)Ll/ܽ۟ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۖܰᩳ;->۫֫:Ll/ܽ۟ᩳ;

    return-object p0
.end method

.method private ᩺()F
    .locals 4

    .line 592
    iget v0, p0, Ll/ۖܰᩳ;->ܶ֫:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    iget v0, p0, Ll/ۖܰᩳ;->᩸֫:F

    iget-object v1, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    iget-object v1, v1, Ll/ۢ۫ۡ;->ۛ:Ll/֫ۖܽ;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v1

    iget v2, p0, Ll/ۖܰᩳ;->ܶ֫:F

    div-float/2addr v1, v2

    mul-float v1, v1, v0

    return v1

    .line 593
    :cond_0
    iget v0, p0, Ll/ۖܰᩳ;->ۖ֫:F

    iget v2, p0, Ll/ۖܰᩳ;->ᩴ֫:I

    iget-object v3, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {v3}, Ll/ۤܽᩴ;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    iget-object v2, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    iget v3, p0, Ll/ۖܰᩳ;->ᩴ֫:I

    invoke-virtual {v2, v3}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    :cond_1
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    return v0
.end method


# virtual methods
.method public final ֫(II)I
    .locals 3

    .line 130
    iget-object v0, p0, Ll/ۖܰᩳ;->֨֫:Ll/ܳ۟ᩳ;

    if-nez v0, :cond_0

    .line 131
    invoke-super {p0, p1, p2}, Ll/ۗۤᩳ;->֫(II)I

    move-result p1

    return p1

    .line 132
    :cond_0
    invoke-virtual {v0}, Ll/ܳ۟ᩳ;->ܳ()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v2}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v2

    mul-float v2, v2, v1

    float-to-double v1, v2

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    .line 133
    invoke-virtual {v0}, Ll/ܳ۟ᩳ;->֫()I

    move-result v0

    int-to-float v0, v0

    iget-object v2, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v2}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v2

    mul-float v2, v2, v0

    float-to-int v0, v2

    sub-int/2addr v0, p2

    add-int/lit8 v0, v0, -0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 134
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۙۤᩳ;)I
    .locals 4

    .line 104
    iget-boolean v0, p0, Ll/ۗۤᩳ;->ܳ֫:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/ۖܰᩳ;->֡֫:Ljava/lang/Throwable;

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/ۖܰᩳ;->᩵֫:Ll/ۙۤᩳ;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ll/ۙۤᩳ;->֫()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_0

    .line 105
    :cond_0
    iget v0, p0, Ll/ۗۤᩳ;->ۨ:I

    if-gez v0, :cond_1

    iget-object v0, p0, Ll/ۖܰᩳ;->᩵֫:Ll/ۙۤᩳ;

    invoke-virtual {p1, v0}, Ll/ۙۤᩳ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ll/ۙۤᩳ;->֫()I

    move-result p1

    return p1

    .line 106
    :cond_1
    iget-object v0, p0, Ll/ۖܰᩳ;->֨֫:Ll/ܳ۟ᩳ;

    if-eqz v0, :cond_3

    .line 107
    invoke-virtual {p1}, Ll/ۙۤᩳ;->ܳ()I

    move-result v1

    iget-object v2, p0, Ll/ۖܰᩳ;->᩵֫:Ll/ۙۤᩳ;

    invoke-virtual {v2}, Ll/ۙۤᩳ;->ܳ()I

    move-result v2

    if-ne v1, v2, :cond_3

    invoke-virtual {p1}, Ll/ۙۤᩳ;->ܽ()I

    move-result v1

    if-ltz v1, :cond_3

    .line 108
    invoke-virtual {p1}, Ll/ۙۤᩳ;->ᩳ()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0}, Ll/ܳ۟ᩳ;->ܳ()I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v3}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v3

    mul-float v3, v3, v2

    cmpg-float v1, v1, v3

    if-gez v1, :cond_2

    goto :goto_0

    .line 109
    :cond_2
    invoke-virtual {v0}, Ll/ܳ۟ᩳ;->֫()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    invoke-virtual {v1}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v1

    mul-float v1, v1, v0

    float-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v0, v2

    invoke-virtual {p1}, Ll/ۙۤᩳ;->ᩳ()I

    move-result v2

    int-to-double v2, v2

    sub-double/2addr v0, v2

    .line 110
    invoke-virtual {p1}, Ll/ۙۤᩳ;->֫()I

    move-result p1

    int-to-double v2, p1

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    double-to-int p1, v0

    return p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(F)V
    .locals 2

    .line 821
    iget v0, p0, Ll/ۖܰᩳ;->ܶ֫:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 822
    iget-object v0, p0, Ll/ۖܰᩳ;->ۚ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 823
    invoke-virtual {p0}, Ll/ۖܰᩳ;->ۧ()V

    .line 824
    iget v0, p0, Ll/ۖܰᩳ;->ᩴ֫:I

    iget-object v1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v1}, Ll/᩷۟ᩳ;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 825
    invoke-direct {p0}, Ll/ۖܰᩳ;->᩺()F

    move-result v0

    iput v0, p0, Ll/ۖܰᩳ;->᩸֫:F

    .line 826
    iput p1, p0, Ll/ۖܰᩳ;->ܶ֫:F

    :cond_0
    const/4 p1, 0x0

    .line 342
    invoke-virtual {p0, p1}, Ll/ۗۤᩳ;->֫(I)I

    move-result p1

    .line 829
    iput p1, p0, Ll/ۗۤᩳ;->ۙ:I

    return-void
.end method

.method public final ֫(III)V
    .locals 3

    .line 649
    invoke-virtual {p0}, Ll/ۗۤᩳ;->ܺ()V

    .line 650
    invoke-virtual {p0}, Ll/ۖܰᩳ;->ۨ()V

    .line 651
    iget v0, p0, Ll/ۖܰᩳ;->ܶ֫:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 652
    :goto_0
    iput v1, p0, Ll/ۖܰᩳ;->ܶ֫:F

    .line 2111
    iget-boolean v1, p0, Ll/ۗۤᩳ;->۬:Z

    if-nez v1, :cond_3

    .line 655
    iget-object v1, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    invoke-virtual {p0, v1}, Ll/ۗۤᩳ;->֫(Ll/۟᩺ᩳ;)V

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 658
    iput-object v1, p0, Ll/ۖܰᩳ;->۫֫:Ll/ܽ۟ᩳ;

    .line 659
    iget-object v1, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {v1}, Ll/ۤܽᩴ;->ܿ()[F

    move-result-object v1

    const/high16 v2, -0x40800000    # -1.0f

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([FF)V

    .line 662
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Ll/ۗۤᩳ;->᩹()Ll/۟᩸ᩳ;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 663
    :try_start_1
    invoke-direct {p0, p1, p2, p3, v1}, Ll/ۖܰᩳ;->֫(IIILl/۟᩸ᩳ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 664
    :try_start_2
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۙ()V

    if-eqz v0, :cond_2

    .line 666
    iget-object p1, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    .line 9843
    iget-boolean p1, p1, Ll/۫ۨᩳ;->ۜۧ:Z

    if-nez p1, :cond_2

    .line 666
    invoke-virtual {p0}, Ll/ۖܰᩳ;->᩸()V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    .line 662
    :try_start_3
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p2

    :try_start_4
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    .line 664
    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۙ()V

    throw p1

    .line 654
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Layout is still preparing"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Landroid/graphics/Canvas;IFILl/֫ۖܽ;)V
    .locals 8

    .line 626
    iget-object v0, p0, Ll/ۖܰᩳ;->᩶֫:Ljava/lang/String;

    if-nez v0, :cond_0

    const v0, 0x7f1202e7

    .line 627
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۖܰᩳ;->᩶֫:Ljava/lang/String;

    :cond_0
    const/4 v0, 0x0

    .line 597
    iget-object v1, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    if-ltz p2, :cond_2

    iget-object v2, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {v2}, Ll/ۤܽᩴ;->size()I

    move-result v2

    if-lt p2, v2, :cond_1

    goto :goto_0

    .line 598
    :cond_1
    iget-object v2, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {v2, p2}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result p2

    cmpl-float v2, p2, v0

    if-ltz v2, :cond_3

    .line 599
    iget v2, p0, Ll/ۖܰᩳ;->ܶ֫:F

    cmpl-float v2, v2, v0

    if-lez v2, :cond_3

    .line 600
    iget-object v2, v1, Ll/ۢ۫ۡ;->ۛ:Ll/֫ۖܽ;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextSize()F

    move-result v2

    iget v3, p0, Ll/ۖܰᩳ;->ܶ֫:F

    div-float/2addr v2, v3

    mul-float p2, p2, v2

    goto :goto_1

    :cond_2
    :goto_0
    const/high16 p2, -0x40800000    # -1.0f

    :cond_3
    :goto_1
    cmpg-float v2, p2, v0

    if-gez v2, :cond_4

    goto :goto_2

    .line 631
    :cond_4
    iget-object v2, p0, Ll/ۖܰᩳ;->᩶֫:Ljava/lang/String;

    invoke-virtual {p5, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v2

    sub-float/2addr p2, v2

    int-to-float v5, p4

    add-float/2addr v0, p2

    cmpl-float p2, v5, v0

    if-lez p2, :cond_5

    .line 634
    invoke-virtual {v1}, Ll/ۢ۫ۡ;->᩻()F

    move-result p2

    sub-float v4, p3, p2

    .line 635
    invoke-virtual {v1}, Ll/ۢ۫ۡ;->ۜ()F

    move-result p2

    add-float/2addr p2, v4

    float-to-double v2, p2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-float v6, v2

    const/high16 p2, -0x10000

    .line 636
    invoke-virtual {p5, p2}, Landroid/graphics/Paint;->setColor(I)V

    move-object v2, p1

    move v3, v0

    move-object v7, p5

    .line 637
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    const/4 p2, -0x1

    .line 638
    invoke-virtual {p5, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 639
    iget-object p2, p0, Ll/ۖܰᩳ;->᩶֫:Ljava/lang/String;

    invoke-virtual {v1}, Ll/ۢ۫ۡ;->ۢ()F

    move-result p4

    add-float/2addr p4, v0

    invoke-virtual {p1, p2, p4, p3, p5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public final ֫(Landroid/graphics/RectF;I)V
    .locals 2

    .line 445
    invoke-super {p0, p1, p2}, Ll/ۗۤᩳ;->֫(Landroid/graphics/RectF;I)V

    .line 446
    invoke-virtual {p0}, Ll/ۗۤᩳ;->۬()I

    move-result v0

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/4 v0, 0x0

    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-virtual {p0, p2}, Ll/ۗۤᩳ;->ܿ(I)I

    move-result p2

    .line 447
    iget v0, p0, Ll/ۖܰᩳ;->ܶ֫:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {v0, p2}, Ll/ۤܽᩴ;->getFloat(I)F

    move-result p2

    cmpg-float p2, p2, v1

    if-gez p2, :cond_0

    .line 448
    iget p2, p0, Ll/ۖܰᩳ;->ۖ֫:F

    iget p1, p1, Landroid/graphics/RectF;->right:F

    invoke-virtual {p0}, Ll/ۖܰᩳ;->ܳ()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr p1, v0

    invoke-static {p2, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Ll/ۖܰᩳ;->ۖ֫:F

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 160
    invoke-super {p0, p1}, Ll/ۗۤᩳ;->֫(Ljava/lang/String;)V

    .line 161
    invoke-direct {p0}, Ll/ۖܰᩳ;->ܰ()V

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 1

    .line 870
    invoke-super {p0, p1}, Ll/ۗۤᩳ;->֫(Ll/ۤۜܽ;)V

    .line 871
    iget v0, p0, Ll/ۖܰᩳ;->ᩴ֫:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ۛ()Z
    .locals 2

    .line 57
    iget v0, p0, Ll/ۖܰᩳ;->ܶ֫:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {v0}, Ll/ۤܽᩴ;->size()I

    move-result v0

    iget-object v1, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v1}, Ll/᩷۟ᩳ;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۜ()I
    .locals 2

    .line 573
    iget-object v0, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    iget-boolean v1, v0, Ll/᩺֫ܿ;->᩷ۧ:Z

    if-eqz v1, :cond_0

    .line 574
    invoke-super {p0}, Ll/ۗۤᩳ;->ۜ()I

    move-result v1

    iget v0, v0, Ll/᩺֫ܿ;->ܽܽ:I

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0

    .line 576
    :cond_0
    invoke-super {p0}, Ll/ۗۤᩳ;->ۜ()I

    move-result v0

    return v0
.end method

.method public final ۢ()F
    .locals 3

    .line 582
    invoke-virtual {p0}, Ll/ۗۤᩳ;->۠()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 583
    iget-object v0, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    iget-boolean v1, v0, Ll/᩺֫ܿ;->᩷ۧ:Z

    if-eqz v1, :cond_0

    .line 584
    invoke-virtual {p0}, Ll/ۖܰᩳ;->ܳ()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Ll/ۖܰᩳ;->ܺ֫:F

    add-float/2addr v1, v2

    iget v0, v0, Ll/᩺֫ܿ;->ۡ֫:I

    goto :goto_0

    .line 586
    :cond_0
    invoke-virtual {p0}, Ll/ۖܰᩳ;->ۜ()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Ll/ۖܰᩳ;->ܺ֫:F

    add-float/2addr v1, v2

    iget v0, v0, Ll/᩺֫ܿ;->ۡ֫:I

    :goto_0
    int-to-float v0, v0

    add-float/2addr v1, v0

    return v1

    .line 588
    :cond_1
    invoke-virtual {p0}, Ll/ۖܰᩳ;->ܳ()I

    move-result v0

    int-to-float v0, v0

    invoke-direct {p0}, Ll/ۖܰᩳ;->᩺()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {p0}, Ll/ۖܰᩳ;->ۜ()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    return v0
.end method

.method public final ۤ()I
    .locals 1

    .line 91
    iget-object v0, p0, Ll/ۖܰᩳ;->ۚ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public final ۧ()V
    .locals 2

    .line 491
    invoke-virtual {p0}, Ll/ۖܰᩳ;->ۨ()V

    .line 2115
    iget-boolean v0, p0, Ll/ۗۤᩳ;->۬:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 2116
    iput-boolean v0, p0, Ll/ۗۤᩳ;->ܳ֫:Z

    .line 2117
    :goto_0
    iget-boolean v0, p0, Ll/ۗۤᩳ;->۬:Z

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x64

    .line 2118
    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/۟᩺ᩳ;)V
    .locals 1

    .line 180
    :try_start_0
    invoke-direct {p0, p1}, Ll/ۖܰᩳ;->ܽ(Ll/۟᩺ᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    iget-boolean p1, p0, Ll/ۗۤᩳ;->۬:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۙ()V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    iget-boolean v0, p0, Ll/ۗۤᩳ;->۬:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/ۗۤᩳ;->ۙ()V

    :cond_1
    throw p1
.end method

.method public final ۧ(Ll/ۙۤᩳ;)Z
    .locals 1

    .line 99
    invoke-virtual {p1}, Ll/ۙۤᩳ;->֫()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0, p1}, Ll/ۖܰᩳ;->֫(Ll/ۙۤᩳ;)I

    move-result v0

    invoke-virtual {p1}, Ll/ۙۤᩳ;->֫()I

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۨ()V
    .locals 2

    .line 485
    iget-object v0, p0, Ll/ۖܰᩳ;->۬֫:Ll/ܺܰᩳ;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 486
    iput-boolean v1, v0, Ll/ܺܰᩳ;->᩸:Z

    :cond_0
    return-void
.end method

.method public final ܳ()I
    .locals 2

    .line 564
    iget-object v0, p0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    iget-boolean v1, v0, Ll/᩺֫ܿ;->᩷ۧ:Z

    if-eqz v1, :cond_0

    .line 565
    invoke-super {p0}, Ll/ۗۤᩳ;->ܳ()I

    move-result v0

    return v0

    .line 567
    :cond_0
    invoke-super {p0}, Ll/ۗۤᩳ;->ܳ()I

    move-result v1

    iget v0, v0, Ll/᩺֫ܿ;->ܽܽ:I

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public final ܳ(II)V
    .locals 5

    .line 453
    iget-boolean v0, p0, Ll/ۗۤᩳ;->۬:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Ll/ۗۤᩳ;->ܳ֫:Z

    if-nez v0, :cond_2

    iget v0, p0, Ll/ۖܰᩳ;->ܶ֫:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-gtz v0, :cond_2

    if-lez p2, :cond_2

    iget-object v0, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    iget-object v0, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    if-ne v0, p0, :cond_2

    .line 454
    invoke-virtual {p0}, Ll/ۗۤᩳ;->֡()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۖܰᩳ;->۬֫:Ll/ܺܰᩳ;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 455
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result v1

    int-to-double v1, v1

    invoke-virtual {p0, v1, v2}, Ll/ۗۤᩳ;->֫(D)I

    move-result v1

    .line 456
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    int-to-double v2, p1

    int-to-double p1, p2

    add-double/2addr v2, p1

    invoke-virtual {p0, v2, v3}, Ll/ۗۤᩳ;->֫(D)I

    move-result p1

    add-int/lit8 p2, p1, 0x1

    .line 457
    new-instance v2, Ll/ܺۢᩴ;

    invoke-direct {v2}, Ll/ܺۢᩴ;-><init>()V

    .line 458
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 460
    invoke-direct {p0, v1, p2, v2, v3}, Ll/ۖܰᩳ;->֫(IILl/ܺۢᩴ;Ljava/util/ArrayList;)V

    .line 461
    iget-object v4, p0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v4}, Ll/᩷۟ᩳ;->size()I

    move-result v4

    add-int/lit8 p1, p1, 0x11

    invoke-static {v4, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-direct {p0, p2, p1, v2, v3}, Ll/ۖܰᩳ;->֫(IILl/ܺۢᩴ;Ljava/util/ArrayList;)V

    add-int/lit8 p1, v1, -0x10

    .line 462
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-direct {p0, p1, v1, v2, v3}, Ll/ۖܰᩳ;->֫(IILl/ܺۢᩴ;Ljava/util/ArrayList;)V

    .line 463
    invoke-virtual {v2}, Ll/ܺۢᩴ;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 464
    :cond_1
    new-instance p1, Ll/ܺܰᩳ;

    invoke-virtual {v2}, Ll/ۤܿᩴ;->ܶ()[I

    move-result-object p2

    new-array v0, v0, [Ll/ۨܰᩳ;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۨܰᩳ;

    invoke-direct {p1, p0, p2, v0}, Ll/ܺܰᩳ;-><init>(Ll/ۖܰᩳ;[I[Ll/ۨܰᩳ;)V

    .line 465
    iput-object p1, p0, Ll/ۖܰᩳ;->۬֫:Ll/ܺܰᩳ;

    .line 466
    :try_start_0
    sget-object p2, Ll/֫ۨۡ;->֫:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x0

    .line 468
    iput-object p1, p0, Ll/ۖܰᩳ;->۬֫:Ll/ܺܰᩳ;

    :cond_2
    :goto_0
    return-void
.end method

.method public final ᩶()Ljava/lang/Throwable;
    .locals 1

    .line 94
    iget-object v0, p0, Ll/ۖܰᩳ;->֡֫:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final ᩷()B
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩸()V
    .locals 4

    .line 834
    invoke-virtual {p0}, Ll/ۗۤᩳ;->֡()Z

    move-result v0

    iget-object v1, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    if-nez v0, :cond_1

    .line 835
    iget-object v0, v1, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    if-ne v0, p0, :cond_0

    invoke-virtual {v1}, Ll/۫ۨᩳ;->᩶ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 836
    :cond_0
    iget-object v0, p0, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    invoke-virtual {p0, v0}, Ll/ۖܰᩳ;->ۧ(Ll/۟᩺ᩳ;)V

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 839
    iput v0, p0, Ll/ۖܰᩳ;->ܶ֫:F

    .line 840
    iget-object v2, p0, Ll/ۖܰᩳ;->ۚ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 841
    invoke-virtual {p0}, Ll/ۖܰᩳ;->ۧ()V

    const/4 v2, 0x0

    .line 342
    invoke-virtual {p0, v2}, Ll/ۗۤᩳ;->֫(I)I

    move-result v3

    .line 842
    iput v3, p0, Ll/ۗۤᩳ;->ۙ:I

    .line 843
    iput-boolean v2, p0, Ll/ۖܰᩳ;->۠֫:Z

    .line 844
    iput v0, p0, Ll/ۖܰᩳ;->ۖ֫:F

    .line 845
    iget-object v0, p0, Ll/ۖܰᩳ;->ۤ֫:Ll/ۤܽᩴ;

    invoke-virtual {v0}, Ll/ۤܽᩴ;->ܿ()[F

    move-result-object v0

    const/high16 v2, -0x40800000    # -1.0f

    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([FF)V

    .line 846
    invoke-direct {p0}, Ll/ۖܰᩳ;->۟()V

    .line 847
    invoke-direct {p0}, Ll/ۖܰᩳ;->ܰ()V

    .line 848
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۡܽ()V

    return-void
.end method

.method public final ᩻()Ll/ۙۤᩳ;
    .locals 1

    .line 363
    iget-object v0, p0, Ll/ۖܰᩳ;->᩵֫:Ll/ۙۤᩳ;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۖܰᩳ;->᩵֫:Ll/ۙۤᩳ;

    return-object v0

    :cond_0
    invoke-super {p0}, Ll/ۗۤᩳ;->᩻()Ll/ۙۤᩳ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻(II)V
    .locals 1

    if-lez p1, :cond_0

    if-lez p2, :cond_0

    .line 439
    iget v0, p0, Ll/ۖܰᩳ;->ۖ֫:F

    int-to-float p1, p1

    int-to-float p2, p2

    add-float/2addr p1, p2

    invoke-virtual {p0}, Ll/ۖܰᩳ;->ܳ()I

    move-result p2

    int-to-float p2, p2

    sub-float/2addr p1, p2

    invoke-virtual {p0}, Ll/ۖܰᩳ;->ۜ()I

    move-result p2

    int-to-float p2, p2

    sub-float/2addr p1, p2

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Ll/ۖܰᩳ;->ۖ֫:F

    :cond_0
    return-void
.end method
