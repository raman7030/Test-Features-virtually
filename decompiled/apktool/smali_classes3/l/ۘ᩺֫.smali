.class public final Ll/ۘ᩺֫;
.super Ljava/lang/Object;
.source "K7MX"

# interfaces
.implements Ll/ᩳܳۧ;


# instance fields
.field public ۗ:J

.field public ۙ:J

.field public ۛ:Ljava/io/IOException;

.field public final ۤ:Ll/ۡܳۧ;

.field public ۨ:Ll/ۙ᩺֫;

.field public final ۫:Ll/᩸۠֫;

.field public ۬:Z

.field public final synthetic ܰ:Ll/ᩴ᩺֫;

.field public ᩶:J

.field public ᩸:Z

.field public ᩹:J

.field public final ᩺:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Ll/ᩴ᩺֫;Landroid/net/Uri;)V
    .locals 1

    .line 591
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘ᩺֫;->ܰ:Ll/ᩴ᩺֫;

    .line 592
    iput-object p2, p0, Ll/ۘ᩺֫;->᩺:Landroid/net/Uri;

    .line 593
    new-instance p2, Ll/ۡܳۧ;

    const-string v0, "DefaultHlsPlaylistTracker:MediaPlaylist"

    invoke-direct {p2, v0}, Ll/ۡܳۧ;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Ll/ۘ᩺֫;->ۤ:Ll/ۡܳۧ;

    .line 594
    invoke-static {p1}, Ll/ᩴ᩺֫;->֫(Ll/ᩴ᩺֫;)Ll/᩸ۨ֫;

    move-result-object p1

    const/4 p2, 0x4

    invoke-interface {p1, p2}, Ll/᩸ۨ֫;->֫(I)Ll/᩸۠֫;

    move-result-object p1

    iput-object p1, p0, Ll/ۘ᩺֫;->۫:Ll/᩸۠֫;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۘ᩺֫;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۘ᩺֫;->᩶:J

    return-wide v0
.end method

.method private ֫(Landroid/net/Uri;)V
    .locals 4

    .line 785
    iget-object v0, p0, Ll/ۘ᩺֫;->ܰ:Ll/ᩴ᩺֫;

    invoke-static {v0}, Ll/ᩴ᩺֫;->᩻(Ll/ᩴ᩺֫;)Ll/ܰ᩺֫;

    move-result-object v1

    invoke-static {v0}, Ll/ᩴ᩺֫;->ܿ(Ll/ᩴ᩺֫;)Ll/۫᩺֫;

    move-result-object v2

    iget-object v3, p0, Ll/ۘ᩺֫;->ۨ:Ll/ۙ᩺֫;

    .line 786
    invoke-interface {v1, v2, v3}, Ll/ܰ᩺֫;->֫(Ll/۫᩺֫;Ll/ۙ᩺֫;)Ll/ܺܳۧ;

    move-result-object v1

    .line 787
    new-instance v2, Ll/ۙ۠֫;

    invoke-direct {v2}, Ll/ۙ۠֫;-><init>()V

    .line 789
    invoke-virtual {v2, p1}, Ll/ۙ۠֫;->֫(Landroid/net/Uri;)V

    const/4 p1, 0x1

    .line 790
    invoke-virtual {v2, p1}, Ll/ۙ۠֫;->֫(I)V

    .line 791
    invoke-virtual {v2}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object p1

    .line 801
    new-instance v2, Ll/ۖܳۧ;

    iget-object v3, p0, Ll/ۘ᩺֫;->۫:Ll/᩸۠֫;

    invoke-direct {v2, v3, p1, v1}, Ll/ۖܳۧ;-><init>(Ll/᩸۠֫;Ll/ۗ۠֫;Ll/ܺܳۧ;)V

    .line 804
    invoke-static {v0}, Ll/ᩴ᩺֫;->ᩳ(Ll/ᩴ᩺֫;)Ll/ۧܳۧ;

    move-result-object p1

    iget v0, v2, Ll/ۖܳۧ;->ܳ:I

    .line 807
    invoke-interface {p1, v0}, Ll/ۧܳۧ;->֫(I)I

    move-result p1

    .line 804
    iget-object v0, p0, Ll/ۘ᩺֫;->ۤ:Ll/ۡܳۧ;

    invoke-virtual {v0, v2, p0, p1}, Ll/ۡܳۧ;->֫(Ll/᩻ܳۧ;Ll/ᩳܳۧ;I)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۘ᩺֫;Landroid/net/Uri;)V
    .locals 1

    const/4 v0, 0x0

    .line 775
    iput-boolean v0, p0, Ll/ۘ᩺֫;->۬:Z

    .line 776
    invoke-direct {p0, p1}, Ll/ۘ᩺֫;->֫(Landroid/net/Uri;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۘ᩺֫;Ll/ۙ᩺֫;Ll/ۧۧۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/ۘ᩺֫;->֫(Ll/ۙ᩺֫;Ll/ۧۧۧ;)V

    return-void
.end method

.method private ֫(Ll/ۙ᩺֫;Ll/ۧۧۧ;)V
    .locals 13

    .line 812
    iget-object v0, p0, Ll/ۘ᩺֫;->ۨ:Ll/ۙ᩺֫;

    .line 813
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    .line 814
    iput-wide v1, p0, Ll/ۘ᩺֫;->ۗ:J

    .line 815
    iget-object v3, p0, Ll/ۘ᩺֫;->ܰ:Ll/ᩴ᩺֫;

    invoke-static {v3, v0, p1}, Ll/ᩴ᩺֫;->֫(Ll/ᩴ᩺֫;Ll/ۙ᩺֫;Ll/ۙ᩺֫;)Ll/ۙ᩺֫;

    move-result-object v4

    iput-object v4, p0, Ll/ۘ᩺֫;->ۨ:Ll/ۙ᩺֫;

    const/4 v5, 0x0

    .line 816
    iget-object v6, p0, Ll/ۘ᩺֫;->᩺:Landroid/net/Uri;

    if-eq v4, v0, :cond_0

    .line 817
    iput-object v5, p0, Ll/ۘ᩺֫;->ۛ:Ljava/io/IOException;

    .line 818
    iput-wide v1, p0, Ll/ۘ᩺֫;->ۙ:J

    .line 819
    invoke-static {v3, v6, v4}, Ll/ᩴ᩺֫;->֫(Ll/ᩴ᩺֫;Landroid/net/Uri;Ll/ۙ᩺֫;)V

    goto :goto_1

    .line 820
    :cond_0
    iget-boolean v4, v4, Ll/ۙ᩺֫;->᩻:Z

    if-nez v4, :cond_3

    .line 823
    iget-wide v7, p1, Ll/ۙ᩺֫;->ۡ:J

    iget-object p1, p1, Ll/ۙ᩺֫;->֡:Ll/ܳ۬ܺ;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    int-to-long v9, p1

    add-long/2addr v7, v9

    iget-object p1, p0, Ll/ۘ᩺֫;->ۨ:Ll/ۙ᩺֫;

    iget-wide v9, p1, Ll/ۙ᩺֫;->ۡ:J

    const/4 v4, 0x1

    cmp-long v11, v7, v9

    if-gez v11, :cond_1

    .line 829
    new-instance v5, Ll/ۧܰ֫;

    .line 117
    invoke-direct {v5}, Ljava/io/IOException;-><init>()V

    const/4 p1, 0x1

    goto :goto_0

    .line 830
    :cond_1
    iget-wide v7, p0, Ll/ۘ᩺֫;->ۙ:J

    sub-long v7, v1, v7

    long-to-double v7, v7

    iget-wide v9, p1, Ll/ۙ᩺֫;->ܶ:J

    .line 831
    invoke-static {v9, v10}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v9

    long-to-double v9, v9

    const-wide/high16 v11, 0x400c000000000000L    # 3.5

    mul-double v9, v9, v11

    const/4 p1, 0x0

    cmpl-double v11, v7, v9

    if-lez v11, :cond_2

    .line 834
    new-instance v5, Ll/ܽܰ֫;

    .line 101
    invoke-direct {v5}, Ljava/io/IOException;-><init>()V

    :cond_2
    :goto_0
    if-eqz v5, :cond_3

    .line 837
    iput-object v5, p0, Ll/ۘ᩺֫;->ۛ:Ljava/io/IOException;

    .line 838
    new-instance v7, Ll/֫ܳۧ;

    invoke-direct {v7, v5, v4}, Ll/֫ܳۧ;-><init>(Ljava/io/IOException;I)V

    invoke-static {v3, v6, v7, p1}, Ll/ᩴ᩺֫;->֫(Ll/ᩴ᩺֫;Landroid/net/Uri;Ll/֫ܳۧ;Z)Z

    .line 849
    :cond_3
    :goto_1
    iget-object p1, p0, Ll/ۘ᩺֫;->ۨ:Ll/ۙ᩺֫;

    iget-object v4, p1, Ll/ۙ᩺֫;->ۚ:Ll/᩶᩺֫;

    iget-wide v7, p1, Ll/ۙ᩺֫;->ܶ:J

    iget-boolean v4, v4, Ll/᩶᩺֫;->֫:Z

    const-wide/16 v9, 0x2

    if-nez v4, :cond_5

    if-eq p1, v0, :cond_4

    goto :goto_2

    .line 855
    :cond_4
    div-long/2addr v7, v9

    goto :goto_2

    :cond_5
    if-ne p1, v0, :cond_7

    .line 861
    iget-wide v4, p1, Ll/ۙ᩺֫;->ܺ:J

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v4, v11

    if-eqz p1, :cond_6

    .line 862
    div-long v7, v4, v9

    goto :goto_2

    .line 863
    :cond_6
    div-long/2addr v7, v9

    goto :goto_2

    :cond_7
    const-wide/16 v7, 0x0

    .line 866
    :goto_2
    invoke-static {v7, v8}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v4

    add-long/2addr v4, v1

    iget-wide p1, p2, Ll/ۧۧۧ;->֫:J

    sub-long/2addr v4, p1

    iput-wide v4, p0, Ll/ۘ᩺֫;->᩹:J

    .line 870
    iget-object p1, p0, Ll/ۘ᩺֫;->ۨ:Ll/ۙ᩺֫;

    iget-boolean p1, p1, Ll/ۙ᩺֫;->᩻:Z

    if-nez p1, :cond_9

    invoke-static {v3}, Ll/ᩴ᩺֫;->ۢ(Ll/ᩴ᩺֫;)Landroid/net/Uri;

    move-result-object p1

    .line 871
    invoke-virtual {v6, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    iget-boolean p1, p0, Ll/ۘ᩺֫;->᩸:Z

    if-eqz p1, :cond_9

    .line 872
    :cond_8
    invoke-direct {p0}, Ll/ۘ᩺֫;->ܳ()Landroid/net/Uri;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ۘ᩺֫;->ۧ(Landroid/net/Uri;)V

    :cond_9
    return-void
.end method

.method public static ֫(Ll/ۘ᩺֫;J)Z
    .locals 2

    .line 912
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    add-long/2addr v0, p1

    iput-wide v0, p0, Ll/ۘ᩺֫;->᩶:J

    .line 913
    iget-object p1, p0, Ll/ۘ᩺֫;->᩺:Landroid/net/Uri;

    iget-object p0, p0, Ll/ۘ᩺֫;->ܰ:Ll/ᩴ᩺֫;

    invoke-static {p0}, Ll/ᩴ᩺֫;->ۢ(Ll/ᩴ᩺֫;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p0}, Ll/ᩴ᩺֫;->ۡ(Ll/ᩴ᩺֫;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ۘ᩺֫;)Ll/ۙ᩺֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘ᩺֫;->ۨ:Ll/ۙ᩺֫;

    return-object p0
.end method

.method private ۧ(Landroid/net/Uri;)V
    .locals 6

    const-wide/16 v0, 0x0

    .line 765
    iput-wide v0, p0, Ll/ۘ᩺֫;->᩶:J

    .line 766
    iget-boolean v0, p0, Ll/ۘ᩺֫;->۬:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/ۘ᩺֫;->ۤ:Ll/ۡܳۧ;

    invoke-virtual {v0}, Ll/ۡܳۧ;->ᩳ()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Ll/ۡܳۧ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 770
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 771
    iget-wide v2, p0, Ll/ۘ᩺֫;->᩹:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    const/4 v2, 0x1

    .line 772
    iput-boolean v2, p0, Ll/ۘ᩺֫;->۬:Z

    .line 773
    iget-object v2, p0, Ll/ۘ᩺֫;->ܰ:Ll/ᩴ᩺֫;

    invoke-static {v2}, Ll/ᩴ᩺֫;->ۜ(Ll/ᩴ᩺֫;)Landroid/os/Handler;

    move-result-object v2

    new-instance v3, Ll/ۖ᩺֫;

    invoke-direct {v3, p0, p1}, Ll/ۖ᩺֫;-><init>(Ll/ۘ᩺֫;Landroid/net/Uri;)V

    iget-wide v4, p0, Ll/ۘ᩺֫;->᩹:J

    sub-long/2addr v4, v0

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 780
    :cond_1
    invoke-direct {p0, p1}, Ll/ۘ᩺֫;->֫(Landroid/net/Uri;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۘ᩺֫;Landroid/net/Uri;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۘ᩺֫;->ۧ(Landroid/net/Uri;)V

    return-void
.end method

.method private ܳ()Landroid/net/Uri;
    .locals 8

    .line 877
    iget-object v0, p0, Ll/ۘ᩺֫;->ۨ:Ll/ۙ᩺֫;

    iget-object v1, p0, Ll/ۘ᩺֫;->᩺:Landroid/net/Uri;

    if-eqz v0, :cond_5

    iget-object v0, v0, Ll/ۙ᩺֫;->ۚ:Ll/᩶᩺֫;

    iget-wide v2, v0, Ll/᩶᩺֫;->ܿ:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    iget-boolean v0, v0, Ll/᩶᩺֫;->֫:Z

    if-nez v0, :cond_0

    goto :goto_1

    .line 882
    :cond_0
    invoke-virtual {v1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    .line 883
    iget-object v1, p0, Ll/ۘ᩺֫;->ۨ:Ll/ۙ᩺֫;

    iget-object v2, v1, Ll/ۙ᩺֫;->ۚ:Ll/᩶᩺֫;

    iget-boolean v2, v2, Ll/᩶᩺֫;->֫:Z

    if-eqz v2, :cond_2

    .line 884
    iget-wide v2, v1, Ll/ۙ᩺֫;->ۡ:J

    iget-object v1, v1, Ll/ۙ᩺֫;->֡:Ll/ܳ۬ܺ;

    .line 885
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    int-to-long v6, v1

    add-long/2addr v2, v6

    const-string v1, "_HLS_msn"

    .line 886
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 887
    iget-object v1, p0, Ll/ۘ᩺֫;->ۨ:Ll/ۙ᩺֫;

    iget-wide v2, v1, Ll/ۙ᩺֫;->ܺ:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_2

    .line 888
    iget-object v1, v1, Ll/ۙ᩺֫;->᩸:Ll/ܳ۬ܺ;

    .line 889
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    .line 890
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {v1}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠᩺֫;

    iget-boolean v1, v1, Ll/۠᩺֫;->۟:Z

    if-eqz v1, :cond_1

    add-int/lit8 v2, v2, -0x1

    :cond_1
    const-string v1, "_HLS_part"

    .line 894
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 897
    :cond_2
    iget-object v1, p0, Ll/ۘ᩺֫;->ۨ:Ll/ۙ᩺֫;

    iget-object v1, v1, Ll/ۙ᩺֫;->ۚ:Ll/᩶᩺֫;

    iget-wide v2, v1, Ll/᩶᩺֫;->ܿ:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_4

    .line 899
    iget-boolean v1, v1, Ll/᩶᩺֫;->ۧ:Z

    if-eqz v1, :cond_3

    const-string v1, "v2"

    goto :goto_0

    :cond_3
    const-string v1, "YES"

    :goto_0
    const-string v2, "_HLS_skip"

    .line 898
    invoke-virtual {v0, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 901
    :cond_4
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    return-object v0

    :cond_5
    :goto_1
    return-object v1
.end method

.method public static bridge synthetic ܽ(Ll/ۘ᩺֫;)Landroid/net/Uri;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘ᩺֫;->᩺:Landroid/net/Uri;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/ۙ᩺֫;
    .locals 1

    .line 599
    iget-object v0, p0, Ll/ۘ᩺֫;->ۨ:Ll/ۙ᩺֫;

    return-object v0
.end method

.method public final ֫(Ll/᩻ܳۧ;JJLjava/io/IOException;I)Ll/ܿܳۧ;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v12, p6

    .line 572
    move-object/from16 v1, p1

    check-cast v1, Ll/ۖܳۧ;

    .line 711
    new-instance v2, Ll/ۧۧۧ;

    iget-wide v3, v1, Ll/ۖܳۧ;->ܽ:J

    iget v3, v1, Ll/ۖܳۧ;->ܳ:I

    .line 715
    invoke-virtual {v1}, Ll/ۖܳۧ;->ܳ()Landroid/net/Uri;

    .line 716
    invoke-virtual {v1}, Ll/ۖܳۧ;->ᩳ()Ljava/util/Map;

    move-result-object v4

    .line 719
    invoke-virtual {v1}, Ll/ۖܳۧ;->ܽ()J

    move-wide/from16 v5, p4

    invoke-direct {v2, v5, v6, v4}, Ll/ۧۧۧ;-><init>(JLjava/util/Map;)V

    .line 720
    invoke-virtual {v1}, Ll/ۖܳۧ;->ܳ()Landroid/net/Uri;

    move-result-object v1

    const-string v4, "_HLS_msn"

    invoke-virtual {v1, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v13, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 721
    :goto_0
    instance-of v5, v12, Ll/ۛ᩺֫;

    .line 722
    sget-object v14, Ll/ۡܳۧ;->ᩳ:Ll/ܿܳۧ;

    iget-object v15, v0, Ll/ۘ᩺֫;->ܰ:Ll/ᩴ᩺֫;

    if-nez v1, :cond_1

    if-eqz v5, :cond_3

    .line 724
    :cond_1
    instance-of v1, v12, Ll/᩻ܶ֫;

    if-eqz v1, :cond_2

    .line 725
    move-object v1, v12

    check-cast v1, Ll/᩻ܶ֫;

    iget v1, v1, Ll/᩻ܶ֫;->۬:I

    goto :goto_1

    :cond_2
    const v1, 0x7fffffff

    :goto_1
    if-nez v5, :cond_7

    const/16 v5, 0x190

    if-eq v1, v5, :cond_7

    const/16 v5, 0x1f7

    if-ne v1, v5, :cond_3

    goto :goto_3

    .line 739
    :cond_3
    new-instance v1, Ll/֫ܳۧ;

    move/from16 v5, p7

    invoke-direct {v1, v12, v5}, Ll/֫ܳۧ;-><init>(Ljava/io/IOException;I)V

    .line 741
    iget-object v5, v0, Ll/ۘ᩺֫;->᩺:Landroid/net/Uri;

    .line 742
    invoke-static {v15, v5, v1, v4}, Ll/ᩴ᩺֫;->֫(Ll/ᩴ᩺֫;Landroid/net/Uri;Ll/֫ܳۧ;Z)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 745
    invoke-static {v15}, Ll/ᩴ᩺֫;->ᩳ(Ll/ᩴ᩺֫;)Ll/ۧܳۧ;

    move-result-object v5

    invoke-interface {v5, v1}, Ll/ۧܳۧ;->֫(Ll/֫ܳۧ;)J

    move-result-wide v5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v5, v7

    if-eqz v1, :cond_4

    .line 748
    invoke-static {v5, v6, v4}, Ll/ۡܳۧ;->֫(JZ)Ll/ܿܳۧ;

    move-result-object v1

    goto :goto_2

    .line 749
    :cond_4
    sget-object v1, Ll/ۡܳۧ;->ܿ:Ll/ܿܳۧ;

    :goto_2
    move-object v14, v1

    .line 754
    :cond_5
    invoke-virtual {v14}, Ll/ܿܳۧ;->֫()Z

    move-result v16

    xor-int/lit8 v13, v16, 0x1

    .line 755
    invoke-static {v15}, Ll/ᩴ᩺֫;->ۧ(Ll/ᩴ᩺֫;)Ll/۠ۧۧ;

    move-result-object v1

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v12, p6

    .line 410
    invoke-virtual/range {v1 .. v13}, Ll/۠ۧۧ;->֫(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    if-nez v16, :cond_6

    .line 757
    invoke-static {v15}, Ll/ᩴ᩺֫;->ᩳ(Ll/ᩴ᩺֫;)Ll/ۧܳۧ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_6
    return-object v14

    .line 731
    :cond_7
    :goto_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    iput-wide v5, v0, Ll/ۘ᩺֫;->᩹:J

    .line 732
    invoke-virtual {v0, v4}, Ll/ۘ᩺֫;->֫(Z)V

    .line 733
    invoke-static {v15}, Ll/ᩴ᩺֫;->ۧ(Ll/ᩴ᩺֫;)Ll/۠ۧۧ;

    move-result-object v1

    sget-object v4, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v12, p6

    .line 410
    invoke-virtual/range {v1 .. v13}, Ll/۠ۧۧ;->֫(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    return-object v14
.end method

.method public final ֫(Ll/᩻ܳۧ;JJ)V
    .locals 16

    move-object/from16 v0, p0

    .line 572
    move-object/from16 v1, p1

    check-cast v1, Ll/ۖܳۧ;

    .line 662
    invoke-virtual {v1}, Ll/ۖܳۧ;->ܿ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤ᩺֫;

    .line 663
    new-instance v4, Ll/ۧۧۧ;

    .line 667
    invoke-virtual {v1}, Ll/ۖܳۧ;->ܳ()Landroid/net/Uri;

    .line 668
    invoke-virtual {v1}, Ll/ۖܳۧ;->ᩳ()Ljava/util/Map;

    move-result-object v3

    .line 671
    invoke-virtual {v1}, Ll/ۖܳۧ;->ܽ()J

    move-wide/from16 v5, p4

    invoke-direct {v4, v5, v6, v3}, Ll/ۧۧۧ;-><init>(JLjava/util/Map;)V

    .line 672
    instance-of v1, v2, Ll/ۙ᩺֫;

    iget-object v15, v0, Ll/ۘ᩺֫;->ܰ:Ll/ᩴ᩺֫;

    if-eqz v1, :cond_0

    .line 673
    check-cast v2, Ll/ۙ᩺֫;

    invoke-direct {v0, v2, v4}, Ll/ۘ᩺֫;->֫(Ll/ۙ᩺֫;Ll/ۧۧۧ;)V

    .line 674
    invoke-static {v15}, Ll/ᩴ᩺֫;->ۧ(Ll/ᩴ᩺֫;)Ll/۠ۧۧ;

    move-result-object v3

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v5, 0x4

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 319
    invoke-virtual/range {v3 .. v13}, Ll/۠ۧۧ;->ۧ(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJ)V

    move-object v2, v15

    goto :goto_0

    :cond_0
    const-string v1, "Loaded playlist has unexpected type."

    .line 677
    invoke-static {v1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object v1

    iput-object v1, v0, Ll/ۘ᩺֫;->ۛ:Ljava/io/IOException;

    .line 679
    invoke-static {v15}, Ll/ᩴ᩺֫;->ۧ(Ll/ᩴ᩺֫;)Ll/۠ۧۧ;

    move-result-object v3

    iget-object v14, v0, Ll/ۘ᩺֫;->ۛ:Ljava/io/IOException;

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v5, 0x4

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v1, 0x1

    move-object v2, v15

    move v15, v1

    .line 410
    invoke-virtual/range {v3 .. v15}, Ll/۠ۧۧ;->֫(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 682
    :goto_0
    invoke-static {v2}, Ll/ᩴ᩺֫;->ᩳ(Ll/ᩴ᩺֫;)Ll/ۧܳۧ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ֫(Ll/᩻ܳۧ;JJI)V
    .locals 14

    .line 572
    move-object v0, p1

    check-cast v0, Ll/ۖܳۧ;

    if-nez p6, :cond_0

    .line 647
    new-instance v1, Ll/ۧۧۧ;

    iget-wide v2, v0, Ll/ۖܳۧ;->ܽ:J

    iget-object v2, v0, Ll/ۖܳۧ;->ۧ:Ll/ۗ۠֫;

    invoke-direct {v1, v2}, Ll/ۧۧۧ;-><init>(Ll/ۗ۠֫;)V

    goto :goto_0

    .line 648
    :cond_0
    new-instance v1, Ll/ۧۧۧ;

    iget-wide v2, v0, Ll/ۖܳۧ;->ܽ:J

    .line 651
    invoke-virtual {v0}, Ll/ۖܳۧ;->ܳ()Landroid/net/Uri;

    .line 652
    invoke-virtual {v0}, Ll/ۖܳۧ;->ᩳ()Ljava/util/Map;

    move-result-object v2

    .line 655
    invoke-virtual {v0}, Ll/ۖܳۧ;->ܽ()J

    move-wide/from16 v3, p4

    invoke-direct {v1, v3, v4, v2}, Ll/ۧۧۧ;-><init>(JLjava/util/Map;)V

    :goto_0
    move-object v2, v1

    move-object v13, p0

    .line 656
    iget-object v1, v13, Ll/ۘ᩺֫;->ܰ:Ll/ᩴ᩺֫;

    invoke-static {v1}, Ll/ᩴ᩺֫;->ۧ(Ll/ᩴ᩺֫;)Ll/۠ۧۧ;

    move-result-object v1

    iget v3, v0, Ll/ۖܳۧ;->ܳ:I

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move/from16 v12, p6

    .line 237
    invoke-virtual/range {v1 .. v12}, Ll/۠ۧۧ;->֫(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJI)V

    return-void
.end method

.method public final ֫(Ll/᩻ܳۧ;JJZ)V
    .locals 12

    .line 572
    move-object v0, p1

    check-cast v0, Ll/ۖܳۧ;

    .line 691
    new-instance v2, Ll/ۧۧۧ;

    iget-wide v3, v0, Ll/ۖܳۧ;->ܽ:J

    .line 695
    invoke-virtual {v0}, Ll/ۖܳۧ;->ܳ()Landroid/net/Uri;

    .line 696
    invoke-virtual {v0}, Ll/ۖܳۧ;->ᩳ()Ljava/util/Map;

    move-result-object v1

    .line 699
    invoke-virtual {v0}, Ll/ۖܳۧ;->ܽ()J

    move-wide/from16 v3, p4

    invoke-direct {v2, v3, v4, v1}, Ll/ۧۧۧ;-><init>(JLjava/util/Map;)V

    move-object v0, p0

    .line 700
    iget-object v1, v0, Ll/ۘ᩺֫;->ܰ:Ll/ᩴ᩺֫;

    invoke-static {v1}, Ll/ᩴ᩺֫;->ᩳ(Ll/ᩴ᩺֫;)Ll/ۧܳۧ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 701
    invoke-static {v1}, Ll/ᩴ᩺֫;->ۧ(Ll/ᩴ᩺֫;)Ll/۠ۧۧ;

    move-result-object v1

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v3, 0x4

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 361
    invoke-virtual/range {v1 .. v11}, Ll/۠ۧۧ;->֫(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 615
    invoke-direct {p0}, Ll/ۘ᩺֫;->ܳ()Landroid/net/Uri;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ll/ۘ᩺֫;->᩺:Landroid/net/Uri;

    :goto_0
    invoke-direct {p0, p1}, Ll/ۘ᩺֫;->ۧ(Landroid/net/Uri;)V

    return-void
.end method

.method public final ۧ(Z)V
    .locals 0

    .line 630
    iput-boolean p1, p0, Ll/ۘ᩺֫;->᩸:Z

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 626
    iget-boolean v0, p0, Ll/ۘ᩺֫;->᩸:Z

    return v0
.end method

.method public final ܽ()Z
    .locals 10

    .line 603
    iget-object v0, p0, Ll/ۘ᩺֫;->ۨ:Ll/ۙ᩺֫;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 606
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    .line 607
    iget-object v0, p0, Ll/ۘ᩺֫;->ۨ:Ll/ۙ᩺֫;

    iget-wide v4, v0, Ll/ۙ᩺֫;->ܿ:J

    invoke-static {v4, v5}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v4

    const-wide/16 v6, 0x7530

    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    .line 608
    iget-object v0, p0, Ll/ۘ᩺֫;->ۨ:Ll/ۙ᩺֫;

    iget-boolean v6, v0, Ll/ۙ᩺֫;->᩻:Z

    const/4 v7, 0x1

    if-nez v6, :cond_2

    iget v0, v0, Ll/ۙ᩺֫;->ۖ:I

    const/4 v6, 0x2

    if-eq v0, v6, :cond_2

    if-eq v0, v7, :cond_2

    iget-wide v8, p0, Ll/ۘ᩺֫;->ۗ:J

    add-long/2addr v8, v4

    cmp-long v0, v8, v2

    if-lez v0, :cond_1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_0
    return v7
.end method

.method public final ܿ()V
    .locals 2

    .line 634
    iget-object v0, p0, Ll/ۘ᩺֫;->ۤ:Ll/ۡܳۧ;

    const/4 v1, 0x0

    .line 318
    invoke-virtual {v0, v1}, Ll/ۡܳۧ;->֫(Ll/ۜܳۧ;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 2

    .line 619
    iget-object v0, p0, Ll/ۘ᩺֫;->ۤ:Ll/ۡܳۧ;

    const/high16 v1, -0x80000000

    .line 341
    invoke-virtual {v0, v1}, Ll/ۡܳۧ;->֫(I)V

    .line 620
    iget-object v0, p0, Ll/ۘ᩺֫;->ۛ:Ljava/io/IOException;

    if-nez v0, :cond_0

    return-void

    .line 621
    :cond_0
    throw v0
.end method
