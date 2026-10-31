.class public final Ll/᩸ۗ֫;
.super Ljava/lang/Object;
.source "98TD"

# interfaces
.implements Ll/ܶۧۧ;
.implements Ll/᩸ۛ֫;


# instance fields
.field public final ᩸:Ll/᩶ۗ֫;

.field public final synthetic ᩹:Ll/ۗۗ֫;


# direct methods
.method public constructor <init>(Ll/ۗۗ֫;Ll/᩶ۗ֫;)V
    .locals 0

    .line 556
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ۗ֫;->᩹:Ll/ۗۗ֫;

    .line 557
    iput-object p2, p0, Ll/᩸ۗ֫;->᩸:Ll/᩶ۗ֫;

    return-void
.end method

.method private ᩳ(ILl/ܺۧۧ;)Landroid/util/Pair;
    .locals 8

    .line 760
    iget-object v0, p0, Ll/᩸ۗ֫;->᩸:Ll/᩶ۗ֫;

    const/4 v1, 0x0

    if-eqz p2, :cond_3

    const/4 v2, 0x0

    .line 449
    :goto_0
    iget-object v3, v0, Ll/᩶ۗ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 452
    iget-object v3, v0, Ll/᩶ۗ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܺۧۧ;

    iget-wide v3, v3, Ll/ܺۧۧ;->ܿ:J

    iget-wide v5, p2, Ll/ܺۧۧ;->ܿ:J

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    .line 454
    iget-object v2, p2, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    .line 499
    iget-object v3, v0, Ll/᩶ۗ֫;->ܿ:Ljava/lang/Object;

    sget v4, Ll/ᩴ᩹֫;->ᩳ:I

    .line 64
    invoke-static {v3, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    .line 455
    invoke-virtual {p2, v2}, Ll/ܺۧۧ;->֫(Ljava/lang/Object;)Ll/ܺۧۧ;

    move-result-object p2

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_1
    if-nez p2, :cond_2

    return-object v1

    :cond_2
    move-object v1, p2

    .line 463
    :cond_3
    iget p2, v0, Ll/᩶ۗ֫;->ۧ:I

    add-int/2addr p1, p2

    .line 768
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final ֫(ILl/ܺۧۧ;)V
    .locals 1

    .line 697
    invoke-direct {p0, p1, p2}, Ll/᩸ۗ֫;->ᩳ(ILl/ܺۧۧ;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 699
    iget-object p2, p0, Ll/᩸ۗ֫;->᩹:Ll/ۗۗ֫;

    invoke-static {p2}, Ll/ۗۗ֫;->ۧ(Ll/ۗۗ֫;)Ll/᩵ۚ֫;

    move-result-object p2

    new-instance v0, Ll/ܶۗ֫;

    invoke-direct {v0, p0, p1}, Ll/ܶۗ֫;-><init>(Ll/᩸ۗ֫;Landroid/util/Pair;)V

    invoke-interface {p2, v0}, Ll/᩵ۚ֫;->֫(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final ֫(ILl/ܺۧۧ;I)V
    .locals 1

    .line 683
    invoke-direct {p0, p1, p2}, Ll/᩸ۗ֫;->ᩳ(ILl/ܺۧۧ;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 685
    iget-object p2, p0, Ll/᩸ۗ֫;->᩹:Ll/ۗۗ֫;

    invoke-static {p2}, Ll/ۗۗ֫;->ۧ(Ll/ۗۗ֫;)Ll/᩵ۚ֫;

    move-result-object p2

    new-instance v0, Ll/᩵ۗ֫;

    invoke-direct {v0, p0, p1, p3}, Ll/᩵ۗ֫;-><init>(Ll/᩸ۗ֫;Landroid/util/Pair;I)V

    invoke-interface {p2, v0}, Ll/᩵ۚ֫;->֫(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final ֫(ILl/ܺۧۧ;Ljava/lang/Exception;)V
    .locals 1

    .line 709
    invoke-direct {p0, p1, p2}, Ll/᩸ۗ֫;->ᩳ(ILl/ܺۧۧ;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 711
    iget-object p2, p0, Ll/᩸ۗ֫;->᩹:Ll/ۗۗ֫;

    invoke-static {p2}, Ll/ۗۗ֫;->ۧ(Ll/ۗۗ֫;)Ll/᩵ۚ֫;

    move-result-object p2

    new-instance v0, Ll/۠ۗ֫;

    invoke-direct {v0, p0, p1, p3}, Ll/۠ۗ֫;-><init>(Ll/᩸ۗ֫;Landroid/util/Pair;Ljava/lang/Exception;)V

    invoke-interface {p2, v0}, Ll/᩵ۚ֫;->֫(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final ֫(ILl/ܺۧۧ;Ll/ۜۧۧ;)V
    .locals 1

    .line 649
    invoke-direct {p0, p1, p2}, Ll/᩸ۗ֫;->ᩳ(ILl/ܺۧۧ;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 651
    iget-object p2, p0, Ll/᩸ۗ֫;->᩹:Ll/ۗۗ֫;

    invoke-static {p2}, Ll/ۗۗ֫;->ۧ(Ll/ۗۗ֫;)Ll/᩵ۚ֫;

    move-result-object p2

    new-instance v0, Ll/ۡۗ֫;

    invoke-direct {v0, p0, p1, p3}, Ll/ۡۗ֫;-><init>(Ll/᩸ۗ֫;Landroid/util/Pair;Ll/ۜۧۧ;)V

    invoke-interface {p2, v0}, Ll/᩵ۚ֫;->֫(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final ֫(ILl/ܺۧۧ;Ll/ۧۧۧ;Ll/ۜۧۧ;)V
    .locals 1

    .line 609
    invoke-direct {p0, p1, p2}, Ll/᩸ۗ֫;->ᩳ(ILl/ܺۧۧ;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 611
    iget-object p2, p0, Ll/᩸ۗ֫;->᩹:Ll/ۗۗ֫;

    invoke-static {p2}, Ll/ۗۗ֫;->ۧ(Ll/ۗۗ֫;)Ll/᩵ۚ֫;

    move-result-object p2

    new-instance v0, Ll/ۖۗ֫;

    invoke-direct {v0, p0, p1, p3, p4}, Ll/ۖۗ֫;-><init>(Ll/᩸ۗ֫;Landroid/util/Pair;Ll/ۧۧۧ;Ll/ۜۧۧ;)V

    invoke-interface {p2, v0}, Ll/᩵ۚ֫;->֫(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final ֫(ILl/ܺۧۧ;Ll/ۧۧۧ;Ll/ۜۧۧ;I)V
    .locals 6

    .line 571
    invoke-direct {p0, p1, p2}, Ll/᩸ۗ֫;->ᩳ(ILl/ܺۧۧ;)Landroid/util/Pair;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 573
    iget-object p1, p0, Ll/᩸ۗ֫;->᩹:Ll/ۗۗ֫;

    invoke-static {p1}, Ll/ۗۗ֫;->ۧ(Ll/ۗۗ֫;)Ll/᩵ۚ֫;

    move-result-object p1

    new-instance p2, Ll/ܺۗ֫;

    move-object v0, p2

    move-object v1, p0

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Ll/ܺۗ֫;-><init>(Ll/᩸ۗ֫;Landroid/util/Pair;Ll/ۧۧۧ;Ll/ۜۧۧ;I)V

    invoke-interface {p1, p2}, Ll/᩵ۚ֫;->֫(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final ֫(ILl/ܺۧۧ;Ll/ۧۧۧ;Ll/ۜۧۧ;Ljava/io/IOException;Z)V
    .locals 7

    .line 628
    invoke-direct {p0, p1, p2}, Ll/᩸ۗ֫;->ᩳ(ILl/ܺۧۧ;)Landroid/util/Pair;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 630
    iget-object p1, p0, Ll/᩸ۗ֫;->᩹:Ll/ۗۗ֫;

    invoke-static {p1}, Ll/ۗۗ֫;->ۧ(Ll/ۗۗ֫;)Ll/᩵ۚ֫;

    move-result-object p1

    new-instance p2, Ll/֡ۗ֫;

    move-object v0, p2

    move-object v1, p0

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Ll/֡ۗ֫;-><init>(Ll/᩸ۗ֫;Landroid/util/Pair;Ll/ۧۧۧ;Ll/ۜۧۧ;Ljava/io/IOException;Z)V

    invoke-interface {p1, p2}, Ll/᩵ۚ֫;->֫(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final ۧ(ILl/ܺۧۧ;)V
    .locals 1

    .line 723
    invoke-direct {p0, p1, p2}, Ll/᩸ۗ֫;->ᩳ(ILl/ܺۧۧ;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 725
    iget-object p2, p0, Ll/᩸ۗ֫;->᩹:Ll/ۗۗ֫;

    invoke-static {p2}, Ll/ۗۗ֫;->ۧ(Ll/ۗۗ֫;)Ll/᩵ۚ֫;

    move-result-object p2

    new-instance v0, Ll/ۚۗ֫;

    invoke-direct {v0, p0, p1}, Ll/ۚۗ֫;-><init>(Ll/᩸ۗ֫;Landroid/util/Pair;)V

    invoke-interface {p2, v0}, Ll/᩵ۚ֫;->֫(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final ۧ(ILl/ܺۧۧ;Ll/ۜۧۧ;)V
    .locals 1

    .line 665
    invoke-direct {p0, p1, p2}, Ll/᩸ۗ֫;->ᩳ(ILl/ܺۧۧ;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 667
    iget-object p2, p0, Ll/᩸ۗ֫;->᩹:Ll/ۗۗ֫;

    invoke-static {p2}, Ll/ۗۗ֫;->ۧ(Ll/ۗۗ֫;)Ll/᩵ۚ֫;

    move-result-object p2

    new-instance v0, Ll/ۘۗ֫;

    invoke-direct {v0, p0, p1, p3}, Ll/ۘۗ֫;-><init>(Ll/᩸ۗ֫;Landroid/util/Pair;Ll/ۜۧۧ;)V

    invoke-interface {p2, v0}, Ll/᩵ۚ֫;->֫(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final ۧ(ILl/ܺۧۧ;Ll/ۧۧۧ;Ll/ۜۧۧ;)V
    .locals 1

    .line 592
    invoke-direct {p0, p1, p2}, Ll/᩸ۗ֫;->ᩳ(ILl/ܺۧۧ;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 594
    iget-object p2, p0, Ll/᩸ۗ֫;->᩹:Ll/ۗۗ֫;

    invoke-static {p2}, Ll/ۗۗ֫;->ۧ(Ll/ۗۗ֫;)Ll/᩵ۚ֫;

    move-result-object p2

    new-instance v0, Ll/֨ۗ֫;

    invoke-direct {v0, p0, p1, p3, p4}, Ll/֨ۗ֫;-><init>(Ll/᩸ۗ֫;Landroid/util/Pair;Ll/ۧۧۧ;Ll/ۜۧۧ;)V

    invoke-interface {p2, v0}, Ll/᩵ۚ֫;->֫(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final ܽ(ILl/ܺۧۧ;)V
    .locals 1

    .line 747
    invoke-direct {p0, p1, p2}, Ll/᩸ۗ֫;->ᩳ(ILl/ܺۧۧ;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 749
    iget-object p2, p0, Ll/᩸ۗ֫;->᩹:Ll/ۗۗ֫;

    invoke-static {p2}, Ll/ۗۗ֫;->ۧ(Ll/ۗۗ֫;)Ll/᩵ۚ֫;

    move-result-object p2

    new-instance v0, Ll/ᩴۗ֫;

    invoke-direct {v0, p0, p1}, Ll/ᩴۗ֫;-><init>(Ll/᩸ۗ֫;Landroid/util/Pair;)V

    invoke-interface {p2, v0}, Ll/᩵ۚ֫;->֫(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
