.class public final Ll/᩺ۚܿ;
.super Ljava/lang/Object;
.source "LAQJ"


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۧ:J

.field public ܽ:Ljava/util/ArrayList;

.field public ܿ:Ljava/lang/String;

.field public ᩳ:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 690
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 692
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩺ۚܿ;->֫:Ljava/util/ArrayList;

    .line 693
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩺ۚܿ;->ܽ:Ljava/util/ArrayList;

    const-wide/16 v0, 0x0

    .line 694
    iput-wide v0, p0, Ll/᩺ۚܿ;->ۧ:J

    .line 695
    iput-wide v0, p0, Ll/᩺ۚܿ;->ᩳ:J

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܳ֨ܿ;Landroid/content/pm/PackageInstaller$Session;Ljava/util/concurrent/ExecutorService;)V
    .locals 4

    .line 738
    iget-object v0, p0, Ll/᩺ۚܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ᩺ۡ;

    .line 739
    new-instance v3, Ll/ۜ֨ܿ;

    invoke-direct {v3, p1, v2, p2}, Ll/ۜ֨ܿ;-><init>(Ll/ܳ֨ܿ;Ll/ۗ᩺ۡ;Landroid/content/pm/PackageInstaller$Session;)V

    invoke-interface {p3, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 742
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p3

    if-ge p2, p3, :cond_3

    .line 743
    iget-object p3, p1, Ll/ܳ֨ܿ;->ᩳ:Ljava/util/concurrent/ArrayBlockingQueue;

    const-wide/16 v1, 0x1f4

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p3, v1, v2, v3}, Ljava/util/concurrent/ArrayBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Runnable;

    if-eqz p3, :cond_1

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    .line 746
    :cond_1
    iget-boolean p3, p1, Ll/ܳ֨ܿ;->ۧ:Z

    if-eqz p3, :cond_2

    goto :goto_2

    .line 749
    :cond_2
    invoke-virtual {p1}, Ll/ܳ֨ܿ;->֫()V

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method public final ֫(Ll/ܳ֨ܿ;Ll/᩺ۤܿ;Ljava/util/concurrent/ExecutorService;)V
    .locals 5

    .line 756
    iget-object v0, p0, Ll/᩺ۚܿ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 757
    invoke-virtual {p2}, Ll/᩺ۤܿ;->ܽ()V

    const/4 v1, 0x0

    .line 758
    invoke-virtual {p2, v1}, Ll/᩺ۤܿ;->֫(Z)V

    .line 759
    new-instance v2, Ll/᩵ۛۡ;

    iget-wide v3, p0, Ll/᩺ۚܿ;->ᩳ:J

    invoke-direct {v2, v3, v4}, Ll/᩵ۛۡ;-><init>(J)V

    new-instance v3, Ll/᩻ۡܳ;

    invoke-direct {v3, p2}, Ll/᩻ۡܳ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    iput-object v2, p1, Ll/ܳ֨ܿ;->ܽ:Ll/᩵ۛۡ;

    .line 760
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗ᩺ۡ;

    .line 761
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v2

    .line 762
    new-instance v3, Ll/᩻֨ܿ;

    sget-object v4, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v4, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-direct {v3, p1, v0, v2, v1}, Ll/᩻֨ܿ;-><init>(Ll/ܳ֨ܿ;Ll/ۗ᩺ۡ;Ll/ܶ᩵ܿ;Z)V

    invoke-interface {p3, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_0

    .line 764
    :cond_0
    invoke-static {p3}, Ll/֫ۨۡ;->֫(Ljava/util/concurrent/ExecutorService;)V

    .line 765
    invoke-virtual {p1}, Ll/ܳ֨ܿ;->֫()V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ᩳܰۡ;Ljava/util/List;)V
    .locals 6

    const-string v0, "manifest.json"

    .line 701
    invoke-virtual {p1, v0}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 1757
    :try_start_0
    invoke-virtual {p1, v0, v1}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B

    move-result-object v0

    .line 705
    new-instance v2, Ljava/lang/String;

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v2, v0, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-static {v2}, Ll/ۚ۟ۡ;->֫(Ljava/lang/String;)Ll/᩸۟ۡ;

    move-result-object v0

    const-string v2, "package_name"

    .line 706
    invoke-virtual {v0, v2}, Ll/᩸۟ۡ;->ܿ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩺ۚܿ;->ܿ:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :cond_0
    :goto_0
    if-nez p2, :cond_1

    goto :goto_1

    .line 713
    :cond_1
    invoke-static {p1, p2}, Ll/ܶܶۡ;->֫(Ll/ᩳܰۡ;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v1

    .line 714
    :goto_1
    invoke-virtual {p1}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    iget-object v2, p0, Ll/᩺ۚܿ;->֫:Ljava/util/ArrayList;

    const/4 v3, 0x0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗ᩺ۡ;

    .line 715
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v4

    .line 716
    invoke-static {v4}, Ll/ܶܶۡ;->֫(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    if-eqz v1, :cond_3

    .line 718
    invoke-interface {v1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_2

    .line 721
    :cond_3
    invoke-static {v4, v3}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    .line 722
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v5, "add "

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 723
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 724
    iget-wide v2, p0, Ll/᩺ۚܿ;->ۧ:J

    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v4

    add-long/2addr v4, v2

    iput-wide v4, p0, Ll/᩺ۚܿ;->ۧ:J

    goto :goto_2

    .line 727
    :cond_4
    invoke-virtual {p1}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۗ᩺ۡ;

    .line 728
    invoke-virtual {p2}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p2}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Android/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 729
    invoke-virtual {p2}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    .line 730
    iget-object v0, p0, Ll/᩺ۚܿ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 731
    iget-wide v0, p0, Ll/᩺ۚܿ;->ᩳ:J

    invoke-virtual {p2}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v4

    add-long/2addr v4, v0

    iput-wide v4, p0, Ll/᩺ۚܿ;->ᩳ:J

    goto :goto_3

    .line 734
    :cond_6
    new-instance p1, Ll/ۨۚܿ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {v2, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method
