.class public final Ll/ۖ᩻ۧ;
.super Ljava/lang/Object;
.source "Q8Q4"

# interfaces
.implements Ll/ۜۜۧ;
.implements Ll/ۘ᩻ۧ;


# instance fields
.field public ֫:J

.field public ۜ:Ll/ܳ۬ܺ;

.field public ۧ:Ll/۠ᩴ֫;

.field public ܳ:Ljava/util/concurrent/Executor;

.field public ܽ:Z

.field public ܿ:Ll/ܿۜۧ;

.field public ᩳ:J

.field public final ᩷:I

.field public final synthetic ᩻:Ll/֨᩻ۧ;


# direct methods
.method public constructor <init>(Ll/֨᩻ۧ;Landroid/content/Context;)V
    .locals 0

    .line 701
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖ᩻ۧ;->᩻:Ll/֨᩻ۧ;

    .line 3620
    invoke-static {p2}, Ll/ۘ֨֫;->ۧ(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x5

    .line 707
    :goto_0
    iput p1, p0, Ll/ۖ᩻ۧ;->᩷:I

    .line 708
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ۖ᩻ۧ;->ۜ:Ll/ܳ۬ܺ;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 709
    iput-wide p1, p0, Ll/ۖ᩻ۧ;->ᩳ:J

    .line 710
    sget-object p1, Ll/ܿۜۧ;->֫:Ll/ܿۜۧ;

    iput-object p1, p0, Ll/ۖ᩻ۧ;->ܿ:Ll/ܿۜۧ;

    .line 711
    invoke-static {}, Ll/֨᩻ۧ;->᩻()Ll/᩸ܳۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ۖ᩻ۧ;->ܳ:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private ۧ(Ll/۠ᩴ֫;)V
    .locals 2

    .line 1051
    invoke-virtual {p1}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v0

    iget-object p1, p1, Ll/۠ᩴ֫;->᩻:Ll/᩷ᩴ֫;

    if-eqz p1, :cond_0

    .line 665
    invoke-virtual {p1}, Ll/᩷ᩴ֫;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 666
    :cond_0
    sget-object p1, Ll/᩷ᩴ֫;->ۜ:Ll/᩷ᩴ֫;

    .line 1052
    :goto_0
    invoke-virtual {v0, p1}, Ll/֨ᩴ֫;->֫(Ll/᩷ᩴ֫;)V

    .line 1053
    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    .line 1059
    iget-object p1, p0, Ll/ۖ᩻ۧ;->᩻:Ll/֨᩻ۧ;

    invoke-static {p1}, Ll/֨᩻ۧ;->᩻(Ll/֨᩻ۧ;)Ll/᩻֡֫;

    move-result-object p1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1060
    invoke-interface {p1}, Ll/᩻֡֫;->ۡ()V

    return-void
.end method


# virtual methods
.method public final isInitialized()Z
    .locals 1

    .line 743
    iget-boolean v0, p0, Ll/ۖ᩻ۧ;->ܽ:Z

    return v0
.end method

.method public final ֫()V
    .locals 1

    .line 1007
    iget-object v0, p0, Ll/ۖ᩻ۧ;->᩻:Ll/֨᩻ۧ;

    invoke-virtual {v0}, Ll/֨᩻ۧ;->ܽ()V

    return-void
.end method

.method public final ֫(F)V
    .locals 1

    .line 899
    iget-object v0, p0, Ll/ۖ᩻ۧ;->᩻:Ll/֨᩻ۧ;

    invoke-static {v0, p1}, Ll/֨᩻ۧ;->֫(Ll/֨᩻ۧ;F)V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 933
    iget-object v0, p0, Ll/ۖ᩻ۧ;->᩻:Ll/֨᩻ۧ;

    invoke-static {v0, p1}, Ll/֨᩻ۧ;->֫(Ll/֨᩻ۧ;I)V

    return-void
.end method

.method public final ֫(J)V
    .locals 0

    .line 916
    iput-wide p1, p0, Ll/ۖ᩻ۧ;->֫:J

    return-void
.end method

.method public final ֫(JJ)V
    .locals 2

    .line 994
    iget-wide v0, p0, Ll/ۖ᩻ۧ;->֫:J

    add-long/2addr p1, v0

    iget-object v0, p0, Ll/ۖ᩻ۧ;->᩻:Ll/֨᩻ۧ;

    invoke-static {v0, p1, p2, p3, p4}, Ll/֨᩻ۧ;->֫(Ll/֨᩻ۧ;JJ)V

    return-void
.end method

.method public final ֫(Landroid/view/Surface;Ll/ܿ֨֫;)V
    .locals 1

    .line 921
    iget-object v0, p0, Ll/ۖ᩻ۧ;->᩻:Ll/֨᩻ۧ;

    invoke-virtual {v0, p1, p2}, Ll/֨᩻ۧ;->֫(Landroid/view/Surface;Ll/ܿ֨֫;)V

    return-void
.end method

.method public final ֫(Ljava/util/List;)V
    .locals 1

    .line 905
    iget-object v0, p0, Ll/ۖ᩻ۧ;->ۜ:Ll/ܳ۬ܺ;

    invoke-virtual {v0, p1}, Ll/ܳ۬ܺ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 908
    :cond_0
    invoke-static {p1}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ۖ᩻ۧ;->ۜ:Ll/ܳ۬ܺ;

    .line 909
    iget-object p1, p0, Ll/ۖ᩻ۧ;->ۧ:Ll/۠ᩴ֫;

    if-eqz p1, :cond_1

    .line 910
    invoke-direct {p0, p1}, Ll/ۖ᩻ۧ;->ۧ(Ll/۠ᩴ֫;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(Ll/ۜ֡֫;)V
    .locals 3

    .line 1032
    iget-object v0, p0, Ll/ۖ᩻ۧ;->ܿ:Ll/ܿۜۧ;

    .line 1033
    iget-object v1, p0, Ll/ۖ᩻ۧ;->ܳ:Ljava/util/concurrent/Executor;

    new-instance v2, Ll/ܺ᩻ۧ;

    invoke-direct {v2, v0, p1}, Ll/ܺ᩻ۧ;-><init>(Ll/ܿۜۧ;Ll/ۜ֡֫;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ֫(Ll/۠ᩴ֫;JILjava/util/List;)V
    .locals 8

    .line 743
    iget-boolean v0, p0, Ll/ۖ᩻ۧ;->ܽ:Z

    .line 813
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 814
    invoke-static {p5}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object p5

    iput-object p5, p0, Ll/ۖ᩻ۧ;->ۜ:Ll/ܳ۬ܺ;

    .line 816
    iput-object p1, p0, Ll/ۖ᩻ۧ;->ۧ:Ll/۠ᩴ֫;

    .line 817
    iget-object p5, p0, Ll/ۖ᩻ۧ;->᩻:Ll/֨᩻ۧ;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    invoke-static {p5, v0, v1}, Ll/֨᩻ۧ;->֫(Ll/֨᩻ۧ;J)V

    .line 818
    invoke-static {p5}, Ll/֨᩻ۧ;->ۜ(Ll/֨᩻ۧ;)V

    .line 819
    invoke-direct {p0, p1}, Ll/ۖ᩻ۧ;->ۧ(Ll/۠ᩴ֫;)V

    .line 820
    iget-wide v2, p0, Ll/ۖ᩻ۧ;->ᩳ:J

    cmp-long p1, v2, v0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 821
    :goto_0
    invoke-static {p5}, Ll/֨᩻ۧ;->ۧ(Ll/֨᩻ۧ;)Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    const-wide/high16 v0, -0x4000000000000000L    # -2.0

    goto :goto_2

    .line 828
    :cond_3
    iget-wide v0, p0, Ll/ۖ᩻ۧ;->ᩳ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    .line 830
    :goto_2
    invoke-static {p5}, Ll/֨᩻ۧ;->ܳ(Ll/֨᩻ۧ;)Ll/᩷֨֫;

    move-result-object p1

    new-instance p5, Ll/ۚ᩻ۧ;

    iget-wide v2, p0, Ll/ۖ᩻ۧ;->֫:J

    add-long v3, p2, v2

    move-object v2, p5

    move v5, p4

    move-wide v6, v0

    invoke-direct/range {v2 .. v7}, Ll/ۚ᩻ۧ;-><init>(JIJ)V

    invoke-virtual {p1, v0, v1, p5}, Ll/᩷֨֫;->֫(JLjava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/ܿۜۧ;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 730
    iput-object p1, p0, Ll/ۖ᩻ۧ;->ܿ:Ll/ܿۜۧ;

    .line 731
    iput-object p2, p0, Ll/ۖ᩻ۧ;->ܳ:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public final ֫(Ll/᩹᩻ۧ;)V
    .locals 1

    .line 892
    iget-object v0, p0, Ll/ۖ᩻ۧ;->᩻:Ll/֨᩻ۧ;

    invoke-static {v0, p1}, Ll/֨᩻ۧ;->֫(Ll/֨᩻ۧ;Ll/᩹᩻ۧ;)V

    return-void
.end method

.method public final ֫(JLl/ܳۜۧ;)Z
    .locals 3

    .line 743
    iget-boolean v0, p0, Ll/ۖ᩻ۧ;->ܽ:Z

    .line 940
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 942
    iget-object v0, p0, Ll/ۖ᩻ۧ;->᩻:Ll/֨᩻ۧ;

    invoke-static {v0}, Ll/֨᩻ۧ;->ۡ(Ll/֨᩻ۧ;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 945
    :cond_0
    invoke-static {v0}, Ll/֨᩻ۧ;->᩻(Ll/֨᩻ۧ;)Ll/᩻֡֫;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 945
    invoke-interface {v1}, Ll/᩻֡֫;->ۢ()I

    move-result v1

    iget v2, p0, Ll/ۖ᩻ۧ;->᩷:I

    if-lt v1, v2, :cond_1

    goto :goto_0

    .line 949
    :cond_1
    invoke-static {v0}, Ll/֨᩻ۧ;->᩻(Ll/֨᩻ۧ;)Ll/᩻֡֫;

    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 949
    invoke-interface {v0}, Ll/᩻֡֫;->᩷()Z

    move-result v0

    if-nez v0, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 963
    :cond_2
    iget-wide v0, p0, Ll/ۖ᩻ۧ;->֫:J

    add-long/2addr p1, v0

    .line 964
    iput-wide p1, p0, Ll/ۖ᩻ۧ;->ᩳ:J

    const-wide/16 v0, 0x3e8

    mul-long p1, p1, v0

    .line 968
    check-cast p3, Ll/۟ܳۧ;

    invoke-virtual {p3, p1, p2}, Ll/۟ܳۧ;->֫(J)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(Ll/۠ᩴ֫;)Z
    .locals 2

    .line 743
    iget-boolean v0, p0, Ll/ۖ᩻ۧ;->ܽ:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    .line 736
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 737
    iget-object v0, p0, Ll/ۖ᩻ۧ;->᩻:Ll/֨᩻ۧ;

    invoke-static {v0, p1}, Ll/֨᩻ۧ;->֫(Ll/֨᩻ۧ;Ll/۠ᩴ֫;)Z

    iput-boolean v1, p0, Ll/ۖ᩻ۧ;->ܽ:Z

    return v1
.end method

.method public final ֫(Z)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 743
    iget-boolean p1, p0, Ll/ۖ᩻ۧ;->ܽ:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 778
    :goto_0
    iget-object v0, p0, Ll/ۖ᩻ۧ;->᩻:Ll/֨᩻ۧ;

    invoke-static {v0, p1}, Ll/֨᩻ۧ;->ۧ(Ll/֨᩻ۧ;Z)Z

    move-result p1

    return p1
.end method

.method public final ۜ()V
    .locals 11

    .line 850
    iget-object v0, p0, Ll/ۖ᩻ۧ;->᩻:Ll/֨᩻ۧ;

    invoke-static {v0}, Ll/֨᩻ۧ;->ܳ(Ll/֨᩻ۧ;)Ll/᩷֨֫;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩷֨֫;->ܽ()I

    move-result v1

    if-nez v1, :cond_0

    .line 853
    invoke-static {v0}, Ll/֨᩻ۧ;->᩷(Ll/֨᩻ۧ;)V

    return-void

    .line 856
    :cond_0
    new-instance v1, Ll/᩷֨֫;

    invoke-direct {v1}, Ll/᩷֨֫;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x1

    .line 858
    :goto_0
    invoke-static {v0}, Ll/֨᩻ۧ;->ܳ(Ll/֨᩻ۧ;)Ll/᩷֨֫;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩷֨֫;->ܽ()I

    move-result v4

    if-lez v4, :cond_4

    .line 859
    invoke-static {v0}, Ll/֨᩻ۧ;->ܳ(Ll/֨᩻ۧ;)Ll/᩷֨֫;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩷֨֫;->ۧ()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۚ᩻ۧ;

    .line 155
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v3, :cond_3

    .line 861
    iget v3, v4, Ll/ۚ᩻ۧ;->֫:I

    if-eqz v3, :cond_2

    if-ne v3, v2, :cond_1

    goto :goto_1

    .line 873
    :cond_1
    invoke-static {v0}, Ll/֨᩻ۧ;->᩷(Ll/֨᩻ۧ;)V

    goto :goto_2

    .line 865
    :cond_2
    :goto_1
    new-instance v3, Ll/ۚ᩻ۧ;

    iget-wide v6, v4, Ll/ۚ᩻ۧ;->ܽ:J

    const/4 v8, 0x0

    iget-wide v9, v4, Ll/ۚ᩻ۧ;->ۧ:J

    move-object v5, v3

    invoke-direct/range {v5 .. v10}, Ll/ۚ᩻ۧ;-><init>(JIJ)V

    move-object v4, v3

    :goto_2
    const/4 v3, 0x0

    .line 877
    :cond_3
    iget-wide v5, v4, Ll/ۚ᩻ۧ;->ۧ:J

    invoke-virtual {v1, v5, v6, v4}, Ll/᩷֨֫;->֫(JLjava/lang/Object;)V

    goto :goto_0

    .line 879
    :cond_4
    invoke-static {v0, v1}, Ll/֨᩻ۧ;->֫(Ll/֨᩻ۧ;Ll/᩷֨֫;)V

    return-void
.end method

.method public final ۡ()V
    .locals 1

    .line 926
    iget-object v0, p0, Ll/ۖ᩻ۧ;->᩻:Ll/֨᩻ۧ;

    invoke-virtual {v0}, Ll/֨᩻ۧ;->֫()V

    return-void
.end method

.method public final ۢ()V
    .locals 2

    .line 716
    iget-object v0, p0, Ll/ۖ᩻ۧ;->᩻:Ll/֨᩻ۧ;

    invoke-static {v0}, Ll/֨᩻ۧ;->ۧ(Ll/֨᩻ۧ;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 717
    invoke-virtual {v0}, Ll/֨᩻ۧ;->ܿ()V

    :cond_0
    return-void
.end method

.method public final ۧ(Z)V
    .locals 4

    .line 743
    iget-boolean v0, p0, Ll/ۖ᩻ۧ;->ܽ:Z

    .line 764
    iget-object v1, p0, Ll/ۖ᩻ۧ;->᩻:Ll/֨᩻ۧ;

    if-eqz v0, :cond_0

    .line 765
    invoke-static {v1}, Ll/֨᩻ۧ;->᩻(Ll/֨᩻ۧ;)Ll/᩻֡֫;

    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 765
    invoke-interface {v0}, Ll/᩻֡֫;->flush()V

    :cond_0
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 767
    iput-wide v2, p0, Ll/ۖ᩻ۧ;->ᩳ:J

    .line 768
    invoke-static {v1, p1}, Ll/֨᩻ۧ;->֫(Ll/֨᩻ۧ;Z)V

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 743
    iget-boolean v0, p0, Ll/ۖ᩻ۧ;->ܽ:Z

    if-eqz v0, :cond_0

    .line 803
    iget-object v0, p0, Ll/ۖ᩻ۧ;->᩻:Ll/֨᩻ۧ;

    invoke-static {v0}, Ll/֨᩻ۧ;->ۢ(Ll/֨᩻ۧ;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()V
    .locals 3

    .line 1026
    iget-object v0, p0, Ll/ۖ᩻ۧ;->ܿ:Ll/ܿۜۧ;

    .line 1027
    iget-object v1, p0, Ll/ۖ᩻ۧ;->ܳ:Ljava/util/concurrent/Executor;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ll/ۡ᩻ۧ;

    invoke-direct {v2, v0}, Ll/ۡ᩻ۧ;-><init>(Ll/ܿۜۧ;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ܽ()V
    .locals 4

    .line 1020
    iget-object v0, p0, Ll/ۖ᩻ۧ;->ܿ:Ll/ܿۜۧ;

    .line 1021
    iget-object v1, p0, Ll/ۖ᩻ۧ;->ܳ:Ljava/util/concurrent/Executor;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ll/ۤ᩸ۡ;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v0}, Ll/ۤ᩸ۡ;-><init>(ILjava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ܽ(Z)V
    .locals 2

    .line 1000
    iget-object v0, p0, Ll/ۖ᩻ۧ;->᩻:Ll/֨᩻ۧ;

    invoke-static {v0}, Ll/֨᩻ۧ;->ۧ(Ll/֨᩻ۧ;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1001
    invoke-static {v0, p1}, Ll/֨᩻ۧ;->ܽ(Ll/֨᩻ۧ;Z)V

    :cond_0
    return-void
.end method

.method public final ܿ()Landroid/view/Surface;
    .locals 1

    .line 743
    iget-boolean v0, p0, Ll/ۖ᩻ۧ;->ܽ:Z

    .line 884
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 885
    iget-object v0, p0, Ll/ۖ᩻ۧ;->᩻:Ll/֨᩻ۧ;

    invoke-static {v0}, Ll/֨᩻ۧ;->᩻(Ll/֨᩻ۧ;)Ll/᩻֡֫;

    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 885
    invoke-interface {v0}, Ll/᩻֡֫;->ܿ()Landroid/view/Surface;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()V
    .locals 4

    .line 743
    iget-boolean v0, p0, Ll/ۖ᩻ۧ;->ܽ:Z

    if-nez v0, :cond_0

    return-void

    .line 753
    :cond_0
    iget-object v0, p0, Ll/ۖ᩻ۧ;->᩻:Ll/֨᩻ۧ;

    invoke-static {v0}, Ll/֨᩻ۧ;->ᩳ(Ll/֨᩻ۧ;)J

    move-result-wide v1

    const/4 v3, 0x0

    .line 754
    invoke-static {v0, v3}, Ll/֨᩻ۧ;->֫(Ll/֨᩻ۧ;Z)V

    .line 755
    invoke-static {v0}, Ll/֨᩻ۧ;->᩻(Ll/֨᩻ۧ;)Ll/᩻֡֫;

    move-result-object v3

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 755
    invoke-interface {v3}, Ll/᩻֡֫;->ᩳ()V

    .line 756
    invoke-static {v0, v1, v2}, Ll/֨᩻ۧ;->ۧ(Ll/֨᩻ۧ;J)V

    return-void
.end method

.method public final ᩷()V
    .locals 2

    .line 723
    iget-object v0, p0, Ll/ۖ᩻ۧ;->᩻:Ll/֨᩻ۧ;

    invoke-static {v0}, Ll/֨᩻ۧ;->ۧ(Ll/֨᩻ۧ;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 724
    invoke-virtual {v0}, Ll/֨᩻ۧ;->ܳ()V

    :cond_0
    return-void
.end method

.method public final ᩻()V
    .locals 6

    .line 784
    iget-wide v0, p0, Ll/ۖ᩻ۧ;->ᩳ:J

    iget-object v2, p0, Ll/ۖ᩻ۧ;->᩻:Ll/֨᩻ۧ;

    invoke-static {v2, v0, v1}, Ll/֨᩻ۧ;->֫(Ll/֨᩻ۧ;J)V

    .line 785
    invoke-static {v2}, Ll/֨᩻ۧ;->ᩳ(Ll/֨᩻ۧ;)J

    move-result-wide v0

    invoke-static {v2}, Ll/֨᩻ۧ;->ܽ(Ll/֨᩻ۧ;)J

    move-result-wide v3

    cmp-long v5, v0, v3

    if-ltz v5, :cond_0

    .line 786
    invoke-static {v2}, Ll/֨᩻ۧ;->ܺ(Ll/֨᩻ۧ;)V

    :cond_0
    return-void
.end method
