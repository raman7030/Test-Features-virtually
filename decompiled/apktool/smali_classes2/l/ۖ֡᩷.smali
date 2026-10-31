.class public final Ll/ۖ֡᩷;
.super Ll/۟ܶۡ;
.source "6AY4"


# instance fields
.field public ۖ:Ljava/util/List;

.field public final synthetic ۘ:Ll/᩵֡᩷;

.field public final synthetic ۜ:Ll/֫᩹᩵;

.field public final synthetic ۡ:Ll/ܽܽ᩻;

.field public final synthetic ۢ:Z

.field public final synthetic ܳ:Ll/᩷ۡ֫;

.field public ܺ:Z

.field public ᩴ:Z

.field public final synthetic ᩷:Z

.field public final synthetic ᩻:I


# direct methods
.method public constructor <init>(ZLl/᩵֡᩷;Ll/ܽܽ᩻;Ll/᩷ۡ֫;ILl/֫᩹᩵;Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Ll/ۖ֡᩷;->᩷:Z

    .line 4
    iput-object p2, p0, Ll/ۖ֡᩷;->ۘ:Ll/᩵֡᩷;

    .line 6
    iput-object p3, p0, Ll/ۖ֡᩷;->ۡ:Ll/ܽܽ᩻;

    .line 8
    iput-object p4, p0, Ll/ۖ֡᩷;->ܳ:Ll/᩷ۡ֫;

    .line 10
    iput p5, p0, Ll/ۖ֡᩷;->᩻:I

    .line 12
    iput-object p6, p0, Ll/ۖ֡᩷;->ۜ:Ll/֫᩹᩵;

    .line 14
    iput-boolean p7, p0, Ll/ۖ֡᩷;->ۢ:Z

    .line 623
    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    const/4 p1, 0x1

    .line 625
    iput-boolean p1, p0, Ll/ۖ֡᩷;->ᩴ:Z

    return-void
.end method

.method public static ֫(Ll/ۖ֡᩷;Ll/᩵֡᩷;)V
    .locals 0

    .line 631
    iget-boolean p0, p0, Ll/ۖ֡᩷;->ᩴ:Z

    if-eqz p0, :cond_1

    .line 632
    invoke-static {p1}, Ll/᩵֡᩷;->۠(Ll/᩵֡᩷;)Ll/۫ۤۧ;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ll/۫ۤۧ;->֫(Z)V

    return-void

    :cond_0
    const-string p0, "swipeRefreshLayout"

    invoke-static {p0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    const/4 v0, 0x0

    .line 709
    iput-boolean v0, p0, Ll/ۖ֡᩷;->ᩴ:Z

    .line 710
    iget-object v0, p0, Ll/ۖ֡᩷;->ܳ:Ll/᩷ۡ֫;

    invoke-virtual {v0}, Ll/᩷ۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    sget-object v1, Ll/ܰۢ֫;->᩹:Ll/ܰۢ֫;

    invoke-virtual {v0, v1}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۖ֡᩷;->ۘ:Ll/᩵֡᩷;

    invoke-static {v0}, Ll/᩵֡᩷;->ۖ(Ll/᩵֡᩷;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    iget v2, p0, Ll/ۖ֡᩷;->᩻:I

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 713
    :cond_0
    iget-boolean v1, p0, Ll/ۖ֡᩷;->᩷:Z

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Ll/ۖ֡᩷;->ܺ:Z

    if-eqz v1, :cond_2

    .line 714
    :cond_1
    invoke-virtual {p0}, Ll/ۖ֡᩷;->ۜ()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Ll/᩵֡᩷;->֫(Ll/᩵֡᩷;Ljava/util/List;)V

    .line 715
    iget-object v0, p0, Ll/ۖ֡᩷;->ۜ:Ll/֫᩹᩵;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ll/֫᩹᩵;->֫()Ljava/lang/Object;

    :cond_2
    :goto_0
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 3

    const/4 v0, 0x0

    .line 720
    iput-boolean v0, p0, Ll/ۖ֡᩷;->ᩴ:Z

    .line 721
    iget-object v0, p0, Ll/ۖ֡᩷;->ܳ:Ll/᩷ۡ֫;

    invoke-virtual {v0}, Ll/᩷ۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    sget-object v1, Ll/ܰۢ֫;->᩹:Ll/ܰۢ֫;

    invoke-virtual {v0, v1}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۖ֡᩷;->ۘ:Ll/᩵֡᩷;

    invoke-static {v0}, Ll/᩵֡᩷;->ۖ(Ll/᩵֡᩷;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    iget v2, p0, Ll/ۖ֡᩷;->᩻:I

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    .line 725
    iget-boolean p1, p0, Ll/ۖ֡᩷;->ۢ:Z

    if-eqz p1, :cond_1

    .line 726
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const-string v1, "emptyList(...)"

    invoke-static {p1, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Ll/᩵֡᩷;->֫(Ll/᩵֡᩷;Ljava/util/List;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۜ()Ljava/util/List;
    .locals 1

    .line 624
    iget-object v0, p0, Ll/ۖ֡᩷;->ۖ:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "tempItems"

    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final ۧ()V
    .locals 5

    .line 629
    iget-boolean v0, p0, Ll/ۖ֡᩷;->᩷:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/ۖ֡᩷;->ۘ:Ll/᩵֡᩷;

    invoke-static {v0}, Ll/᩵֡᩷;->۠(Ll/᩵֡᩷;)Ll/۫ۤۧ;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "swipeRefreshLayout"

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ll/۫ۤۧ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_2

    .line 630
    invoke-static {v0}, Ll/᩵֡᩷;->۠(Ll/᩵֡᩷;)Ll/۫ۤۧ;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Ll/ۢۖ᩷;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p0, v0}, Ll/ۢۖ᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v3, 0x12c

    invoke-virtual {v1, v2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    invoke-static {v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v2

    .line 629
    :cond_1
    invoke-static {v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    throw v2

    :cond_2
    return-void
.end method

.method public final ܿ()V
    .locals 9

    .line 639
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v1, p0, Ll/ۖ֡᩷;->ۡ:Ll/ܽܽ᩻;

    const/16 v2, 0x1e

    if-lt v0, v2, :cond_0

    .line 640
    sget-object v3, Ll/۬۠ܿ;->᩺:Ll/᩶۠ܿ;

    invoke-virtual {v1}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v3

    const-string v4, "getPath(...)"

    invoke-static {v3, v4}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Ll/᩶۠ܿ;->ܽ(Ljava/lang/String;)V

    .line 642
    :cond_0
    invoke-virtual {v1}, Ll/ܽܽ᩻;->ۤ()Ljava/util/List;

    move-result-object v3

    const-string v4, "list(...)"

    invoke-static {v3, v4}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 624
    iput-object v3, p0, Ll/ۖ֡᩷;->ۖ:Ljava/util/List;

    if-lt v0, v2, :cond_1

    .line 644
    sget-object v0, Ll/۬۠ܿ;->᩺:Ll/᩶۠ܿ;

    const-string v0, ""

    invoke-static {v0}, Ll/᩶۠ܿ;->ܽ(Ljava/lang/String;)V

    .line 646
    :cond_1
    iget-object v0, p0, Ll/ۖ֡᩷;->ۘ:Ll/᩵֡᩷;

    invoke-static {v0}, Ll/᩵֡᩷;->ܶ(Ll/᩵֡᩷;)I

    move-result v2

    const-string v3, "collect(...)"

    if-nez v2, :cond_2

    .line 648
    invoke-virtual {p0}, Ll/ۖ֡᩷;->ۜ()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    new-instance v4, Ll/᩷֡᩷;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Ll/ۢ֡᩷;

    invoke-direct {v5, v4}, Ll/ۢ֡᩷;-><init>(Ll/᩷֡᩷;)V

    invoke-interface {v2, v5}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    .line 649
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v4

    invoke-interface {v2, v4}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v2

    .line 648
    invoke-static {v2, v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/List;

    .line 624
    :goto_0
    iput-object v2, p0, Ll/ۖ֡᩷;->ۖ:Ljava/util/List;

    goto :goto_1

    .line 650
    :cond_2
    invoke-static {v0}, Ll/᩵֡᩷;->ۚ(Ll/᩵֡᩷;)Ljava/util/HashSet;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v0}, Ll/᩵֡᩷;->֨(Ll/᩵֡᩷;)Ljava/util/HashSet;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    .line 651
    :cond_3
    invoke-virtual {p0}, Ll/ۖ֡᩷;->ۜ()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    new-instance v4, Ll/ۡ֡᩷;

    invoke-direct {v4, v0}, Ll/ۡ֡᩷;-><init>(Ll/᩵֡᩷;)V

    new-instance v5, Ll/ܺ֡᩷;

    invoke-direct {v5, v4}, Ll/ܺ֡᩷;-><init>(Ll/ۡ֡᩷;)V

    invoke-interface {v2, v5}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    .line 664
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v4

    invoke-interface {v2, v4}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v2

    .line 651
    invoke-static {v2, v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/List;

    goto :goto_0

    .line 667
    :cond_4
    :goto_1
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 668
    invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;

    move-result-object v3

    .line 669
    invoke-virtual {p0}, Ll/ۖ֡᩷;->ۜ()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Ll/ۘ۬ܳ;->֫(Ljava/util/List;)Z

    move-result v4

    .line 670
    invoke-virtual {p0}, Ll/ۖ֡᩷;->ۜ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۜܳ;

    .line 671
    invoke-interface {v6}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ll/ۤ۬ܳ;

    invoke-interface {v6}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v8, v3, v6, v4}, Ll/ۤ۬ܳ;-><init>(Ljava/text/Collator;Ljava/lang/String;Z)V

    invoke-virtual {v2, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 673
    :cond_5
    invoke-virtual {v1}, Ll/ܽ᩷ܳ;->ܶ()Ljava/lang/String;

    move-result-object v1

    const-string v5, "local:"

    .line 0
    invoke-static {v5, v1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 676
    sget-object v5, Ll/᩶ۖ᩷;->ܺ:Ljava/util/HashMap;

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 677
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 678
    invoke-static {v1}, Ll/۟۬ܳ;->֫(I)I

    move-result v5

    .line 679
    invoke-static {v1}, Ll/۟۬ܳ;->ۧ(I)Z

    move-result v1

    goto :goto_3

    .line 681
    :cond_6
    invoke-static {v0}, Ll/᩵֡᩷;->֡(Ll/᩵֡᩷;)I

    move-result v5

    .line 682
    invoke-static {v0}, Ll/᩵֡᩷;->᩵(Ll/᩵֡᩷;)Z

    move-result v1

    :goto_3
    const/4 v6, 0x1

    if-eqz v5, :cond_a

    if-eq v5, v6, :cond_9

    const/4 v7, 0x2

    if-eq v5, v7, :cond_8

    const/4 v7, 0x3

    if-ne v5, v7, :cond_7

    .line 688
    new-instance v5, Ll/ܰ۬ܳ;

    invoke-direct {v5, v2, v1}, Ll/ܰ۬ܳ;-><init>(Ljava/util/HashMap;Z)V

    goto :goto_4

    .line 689
    :cond_7
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 687
    :cond_8
    new-instance v5, Ll/᩺۬ܳ;

    invoke-direct {v5, v2, v1}, Ll/᩺۬ܳ;-><init>(Ljava/util/HashMap;Z)V

    goto :goto_4

    .line 686
    :cond_9
    new-instance v5, Ll/۫۬ܳ;

    invoke-direct {v5, v2, v1, v6}, Ll/۫۬ܳ;-><init>(Ljava/util/HashMap;ZZ)V

    goto :goto_4

    .line 685
    :cond_a
    new-instance v5, Ll/ۨ۬ܳ;

    invoke-direct {v5, v2, v1}, Ll/ۨ۬ܳ;-><init>(Ljava/util/HashMap;Z)V

    .line 692
    :goto_4
    :try_start_0
    invoke-virtual {p0}, Ll/ۖ֡᩷;->ۜ()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v5}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    :catch_0
    move-exception v1

    if-nez v4, :cond_d

    .line 697
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 698
    invoke-virtual {p0}, Ll/ۖ֡᩷;->ۜ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳۜܳ;

    .line 699
    invoke-interface {v4}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ll/ۤ۬ܳ;

    invoke-interface {v4}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v8, v3, v4, v6}, Ll/ۤ۬ܳ;-><init>(Ljava/text/Collator;Ljava/lang/String;Z)V

    invoke-virtual {v2, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 701
    :cond_b
    invoke-virtual {p0}, Ll/ۖ֡᩷;->ۜ()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v5}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 703
    :goto_6
    iget-boolean v1, p0, Ll/ۖ֡᩷;->᩷:Z

    if-eqz v1, :cond_c

    invoke-virtual {p0}, Ll/ۖ֡᩷;->ۜ()Ljava/util/List;

    move-result-object v1

    invoke-static {v0}, Ll/᩵֡᩷;->ۘ(Ll/᩵֡᩷;)Ljava/util/List;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ܽۢܳ;->֫(Ljava/util/List;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 704
    iput-boolean v6, p0, Ll/ۖ֡᩷;->ܺ:Z

    :cond_c
    return-void

    .line 695
    :cond_d
    throw v1
.end method

.method public final ᩳ()V
    .locals 2

    .line 731
    iget-object v0, p0, Ll/ۖ֡᩷;->ۘ:Ll/᩵֡᩷;

    invoke-static {v0}, Ll/᩵֡᩷;->۠(Ll/᩵֡᩷;)Ll/۫ۤۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/۫ۤۧ;->֫(Z)V

    return-void

    :cond_0
    const-string v0, "swipeRefreshLayout"

    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method
