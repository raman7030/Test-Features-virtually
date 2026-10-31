.class public final Ll/᩵ۡ᩻;
.super Ll/۟ܶۡ;
.source "TAIM"


# instance fields
.field public final synthetic ۖ:Ll/۟ۢ֫;

.field public final synthetic ۘ:Ljava/util/List;

.field public ۜ:Ljava/util/ArrayList;

.field public final synthetic ۡ:Ll/ۚۡ᩻;

.field public ۢ:Z

.field public ܳ:Ll/֫۬ܿ;

.field public final synthetic ܺ:Ljava/lang/Runnable;

.field public final synthetic ᩴ:Ll/ܽۢܳ;

.field public ᩷:Ll/ۙ֡ܿ;

.field public ᩻:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>(Ll/ۚۡ᩻;Ll/ܽۢܳ;Ll/᩷ۡ֫;Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 0

    .line 732
    iput-object p1, p0, Ll/᩵ۡ᩻;->ۡ:Ll/ۚۡ᩻;

    iput-object p2, p0, Ll/᩵ۡ᩻;->ᩴ:Ll/ܽۢܳ;

    iput-object p3, p0, Ll/᩵ۡ᩻;->ۖ:Ll/۟ۢ֫;

    iput-object p4, p0, Ll/᩵ۡ᩻;->ۘ:Ljava/util/List;

    iput-object p5, p0, Ll/᩵ۡ᩻;->ܺ:Ljava/lang/Runnable;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    .line 733
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Ll/᩵ۡ᩻;->ۜ:Ljava/util/ArrayList;

    .line 734
    new-instance p2, Ll/ۙ֡ܿ;

    const/4 p3, 0x0

    invoke-direct {p2, p3}, Ll/ۙ֡ܿ;-><init>(I)V

    iput-object p2, p0, Ll/᩵ۡ᩻;->᩷:Ll/ۙ֡ܿ;

    .line 735
    invoke-static {p1}, Ll/ۚۡ᩻;->ܽ(Ll/ۚۡ᩻;)Ll/ܶ᩵ܿ;

    move-result-object p2

    invoke-virtual {p1}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۙ֡᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    iput-object p1, p0, Ll/᩵ۡ᩻;->᩻:Ll/ܶ᩵ܿ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 818
    invoke-virtual {p0}, Ll/᩵ۡ᩻;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 820
    iget-object v0, p0, Ll/᩵ۡ᩻;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛۢܳ;

    .line 821
    invoke-virtual {v1}, Ll/ۛۢܳ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۫()Z

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x1

    .line 824
    iput-boolean v0, p0, Ll/᩵ۡ᩻;->ۢ:Z

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 830
    iget-object v0, p0, Ll/᩵ۡ᩻;->ᩴ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    .line 832
    iget-object p1, p0, Ll/᩵ۡ᩻;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛۢܳ;

    .line 833
    invoke-virtual {v0}, Ll/ۛۢܳ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۫()Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۜ()Z
    .locals 2

    .line 748
    iget-object v0, p0, Ll/᩵ۡ᩻;->ܳ:Ll/֫۬ܿ;

    invoke-virtual {v0}, Ll/֫۬ܿ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩵ۡ᩻;->ۖ:Ll/۟ۢ֫;

    invoke-virtual {v0}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    sget-object v1, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ۧ()V
    .locals 2

    .line 741
    new-instance v0, Ll/֫۬ܿ;

    iget-object v1, p0, Ll/᩵ۡ᩻;->ᩴ:Ll/ܽۢܳ;

    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/֫۬ܿ;-><init>(Ll/ۗܺ᩷;)V

    const v1, 0x7f1202d0

    .line 122
    invoke-static {v1}, Ll/ۙ᩸᩷;->ܽ(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/֫۬ܿ;->ܿ(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    .line 77
    invoke-virtual {v0, v1}, Ll/֫۬ܿ;->֫(Ll/֨۫᩷;)V

    .line 744
    invoke-virtual {v0}, Ll/֫۬ܿ;->ܳ()V

    iput-object v0, p0, Ll/᩵ۡ᩻;->ܳ:Ll/֫۬ܿ;

    return-void
.end method

.method public final ܿ()V
    .locals 10

    .line 753
    iget-object v0, p0, Ll/᩵ۡ᩻;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 754
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 756
    :cond_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 757
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 758
    iget-object v2, p0, Ll/᩵ۡ᩻;->ۡ:Ll/ۚۡ᩻;

    invoke-virtual {v2}, Ll/ۚۡ᩻;->᩶()Ll/ۗۢ᩻;

    move-result-object v2

    .line 760
    iget-object v3, p0, Ll/᩵ۡ᩻;->ۘ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const-wide/16 v4, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۤۢܳ;

    .line 761
    invoke-virtual {v6}, Ll/ۤۢܳ;->ܳ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ll/ܰܺܳ;->֫(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v7

    if-eqz v7, :cond_2

    .line 762
    move-object v8, v7

    check-cast v8, Ll/ܺۘܳ;

    invoke-virtual {v8}, Ll/ܺۘܳ;->ۙ֫()Z

    move-result v9

    if-nez v9, :cond_1

    goto :goto_1

    .line 766
    :cond_1
    invoke-virtual {v8}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v8

    add-long/2addr v4, v8

    .line 767
    new-instance v8, Ll/֡ۡ᩻;

    const/4 v9, 0x0

    invoke-direct {v8, v9}, Ll/֡ۡ᩻;-><init>(I)V

    .line 768
    iput-object v6, v8, Ll/֡ۡ᩻;->ܽ:Ll/ۤۢܳ;

    .line 769
    iput-object v7, v8, Ll/֡ۡ᩻;->ۧ:Ll/ᩳۜܳ;

    .line 770
    invoke-virtual {v6}, Ll/ۤۢܳ;->᩻()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v6

    iput-object v6, v8, Ll/֡ۡ᩻;->֫:Ll/ܶ᩵ܿ;

    .line 771
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 763
    :cond_2
    :goto_1
    invoke-virtual {v6}, Ll/ۤۢܳ;->֫()V

    goto :goto_0

    .line 773
    :cond_3
    new-instance v0, Ll/᩷۫ܳ;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v0, v3, v4, v5}, Ll/᩷۫ܳ;-><init>(IJ)V

    .line 775
    iget-object v3, p0, Ll/᩵ۡ᩻;->ܳ:Ll/֫۬ܿ;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ll/֫۬ܿ;->֫(Z)V

    .line 776
    new-instance v3, Ll/۠ۢ᩻;

    invoke-direct {v3, v2}, Ll/۠ۢ᩻;-><init>(Ll/ۗۢ᩻;)V

    .line 777
    new-instance v4, Ll/ᩴۡ᩻;

    invoke-direct {v4, p0, v0}, Ll/ᩴۡ᩻;-><init>(Ll/᩵ۡ᩻;Ll/᩷۫ܳ;)V

    .line 797
    iget-object v5, p0, Ll/᩵ۡ᩻;->᩷:Ll/ۙ֡ܿ;

    invoke-virtual {v5}, Ll/ۙ֡ܿ;->ۧ()V

    .line 799
    :try_start_0
    invoke-static {v1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v6

    new-instance v7, Ll/ۖۡ᩻;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    invoke-interface {v6, v7}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v6

    invoke-interface {v6}, Ll/ܿ᩺ᩴ;->distinct()Ll/ܿ᩺ᩴ;

    move-result-object v6

    .line 800
    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Ll/ۘۡ᩻;

    invoke-direct {v7, v2}, Ll/ۘۡ᩻;-><init>(Ll/ۗۢ᩻;)V

    invoke-interface {v6, v7}, Ll/ܿ᩺ᩴ;->forEach(Ljava/util/function/Consumer;)V

    .line 801
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ۡ᩻;

    .line 802
    iget-object v6, p0, Ll/᩵ۡ᩻;->ܳ:Ll/֫۬ܿ;

    iget-object v7, v2, Ll/֡ۡ᩻;->ܽ:Ll/ۤۢܳ;

    invoke-virtual {v7}, Ll/ۤۢܳ;->ᩳ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ll/֫۬ܿ;->ܽ(Ljava/lang/CharSequence;)V

    .line 803
    iget-object v6, v2, Ll/֡ۡ᩻;->ۧ:Ll/ᩳۜܳ;

    invoke-interface {v6}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v6

    iget-object v7, v2, Ll/֡ۡ᩻;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v3, v6, v7, v4}, Ll/۠ۢ᩻;->֫(Ljava/lang/String;Ll/ܶ᩵ܿ;Ll/ۚ᩸ܿ;)V

    .line 804
    invoke-virtual {p0}, Ll/᩵ۡ᩻;->ۜ()Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v6, :cond_4

    .line 812
    invoke-virtual {v5}, Ll/ۙ֡ܿ;->ܽ()V

    return-void

    .line 807
    :cond_4
    :try_start_1
    iget-object v6, v2, Ll/֡ۡ᩻;->ܽ:Ll/ۤۢܳ;

    iget-object v7, v2, Ll/֡ۡ᩻;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v6, v7}, Ll/ۤۢܳ;->֫(Ll/ܶ᩵ܿ;)V

    .line 808
    iget-object v6, p0, Ll/᩵ۡ᩻;->ۜ:Ljava/util/ArrayList;

    new-instance v7, Ll/ۛۢܳ;

    iget-object v8, v2, Ll/֡ۡ᩻;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v8}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v8

    iget-object v9, v2, Ll/֡ۡ᩻;->ۧ:Ll/ᩳۜܳ;

    invoke-interface {v9}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v9

    iget-object v2, v2, Ll/֡ۡ᩻;->֫:Ll/ܶ᩵ܿ;

    invoke-direct {v7, v2, v8, v9}, Ll/ۛۢܳ;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 809
    invoke-virtual {v0}, Ll/᩷۫ܳ;->᩷()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    .line 812
    :cond_5
    invoke-virtual {v5}, Ll/ۙ֡ܿ;->ܽ()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v5}, Ll/ۙ֡ܿ;->ܽ()V

    .line 813
    throw v0
.end method

.method public final ᩳ()V
    .locals 7

    .line 839
    iget-object v0, p0, Ll/᩵ۡ᩻;->ܳ:Ll/֫۬ܿ;

    invoke-virtual {v0}, Ll/֫۬ܿ;->ۧ()V

    .line 840
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    .line 841
    iget-boolean v0, p0, Ll/᩵ۡ᩻;->ۢ:Z

    if-eqz v0, :cond_3

    .line 843
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 844
    iget-object v1, p0, Ll/᩵ۡ᩻;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛۢܳ;

    .line 845
    invoke-virtual {v3}, Ll/ۛۢܳ;->ۧ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 848
    :cond_0
    iget-object v2, p0, Ll/᩵ۡ᩻;->ۡ:Ll/ۚۡ᩻;

    invoke-virtual {v2}, Ll/ܽ᩷ܳ;->ۚ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۛۢܳ;

    .line 849
    invoke-virtual {v5}, Ll/ۛۢܳ;->ܿ()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v5}, Ll/ۛۢܳ;->ۧ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    add-int/lit8 v6, v4, 0x1

    .line 850
    invoke-virtual {v1, v4, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    move v4, v6

    goto :goto_1

    .line 853
    :cond_2
    invoke-virtual {v2, v1}, Ll/ܽ᩷ܳ;->֫(Ljava/util/ArrayList;)V

    .line 855
    :try_start_0
    iget-object v0, p0, Ll/᩵ۡ᩻;->ܺ:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 857
    iget-object v1, p0, Ll/᩵ۡ᩻;->ᩴ:Ll/ܽۢܳ;

    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    const/4 v2, 0x0

    .line 546
    invoke-virtual {v1, v0, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_3
    return-void
.end method
