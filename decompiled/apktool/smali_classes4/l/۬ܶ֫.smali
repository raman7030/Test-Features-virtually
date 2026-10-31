.class public final Ll/۬ܶ֫;
.super Ljava/lang/Object;
.source "V742"

# interfaces
.implements Ll/᩸۠֫;


# instance fields
.field public ֡:J

.field public ֨:Z

.field public ֫:Landroid/net/Uri;

.field public ۖ:Z

.field public final ۘ:Z

.field public ۚ:Ll/ۗ۠֫;

.field public ۜ:J

.field public final ۠:Ll/᩸۠֫;

.field public ۡ:Ll/ۗ۠֫;

.field public ۢ:J

.field public final ۧ:Z

.field public final ܳ:Ll/᩸۠֫;

.field public ܺ:Ll/᩺ܶ֫;

.field public ܽ:J

.field public final ܿ:Ll/ۨܶ֫;

.field public final ᩳ:Ll/᩸ܶ֫;

.field public final ᩴ:Z

.field public final ᩵:Z

.field public ᩷:Ll/᩸۠֫;

.field public final ᩻:Ll/᩵ܶ֫;


# direct methods
.method public constructor <init>(Ll/᩸ܶ֫;Ll/᩸۠֫;Ll/᩸۠֫;Ll/ۙܶ֫;Ll/ۨܶ֫;IZ)V
    .locals 0

    .line 555
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 556
    iput-object p1, p0, Ll/۬ܶ֫;->ᩳ:Ll/᩸ܶ֫;

    .line 557
    iput-object p3, p0, Ll/۬ܶ֫;->ܳ:Ll/᩸۠֫;

    .line 558
    iput-object p5, p0, Ll/۬ܶ֫;->ܿ:Ll/ۨܶ֫;

    const/4 p1, 0x0

    .line 559
    iput-boolean p1, p0, Ll/۬ܶ֫;->ۧ:Z

    and-int/lit8 p3, p6, 0x2

    if-eqz p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 560
    :goto_0
    iput-boolean p3, p0, Ll/۬ܶ֫;->ᩴ:Z

    .line 561
    iput-boolean p1, p0, Ll/۬ܶ֫;->ۘ:Z

    .line 563
    iput-boolean p7, p0, Ll/۬ܶ֫;->᩵:Z

    const/4 p1, 0x0

    if-eqz p2, :cond_2

    .line 570
    iput-object p2, p0, Ll/۬ܶ֫;->۠:Ll/᩸۠֫;

    if-eqz p4, :cond_1

    .line 573
    new-instance p1, Ll/᩵ܶ֫;

    invoke-direct {p1, p2, p4}, Ll/᩵ܶ֫;-><init>(Ll/᩸۠֫;Ll/۠۠֫;)V

    .line 574
    :cond_1
    iput-object p1, p0, Ll/۬ܶ֫;->᩻:Ll/᩵ܶ֫;

    return-void

    .line 576
    :cond_2
    sget-object p2, Ll/ܺܶ֫;->ۧ:Ll/ܺܶ֫;

    iput-object p2, p0, Ll/۬ܶ֫;->۠:Ll/᩸۠֫;

    .line 577
    iput-object p1, p0, Ll/۬ܶ֫;->᩻:Ll/᩵ܶ֫;

    return-void
.end method

.method private ֫(Ll/ۗ۠֫;Z)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 733
    iget-object v8, v0, Ll/ۗ۠֫;->ܿ:Ljava/lang/String;

    sget-object v2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 734
    iget-boolean v2, v1, Ll/۬ܶ֫;->ۖ:Z

    iget-object v9, v1, Ll/۬ܶ֫;->ᩳ:Ll/᩸ܶ֫;

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    .line 736
    :cond_0
    iget-boolean v2, v1, Ll/۬ܶ֫;->ۧ:Z

    if-eqz v2, :cond_1

    .line 738
    :try_start_0
    iget-wide v4, v1, Ll/۬ܶ֫;->֡:J

    iget-wide v6, v1, Ll/۬ܶ֫;->ܽ:J

    move-object v2, v9

    move-object v3, v8

    invoke-interface/range {v2 .. v7}, Ll/᩸ܶ֫;->ܿ(Ljava/lang/String;JJ)Ll/᩺ܶ֫;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 740
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 741
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0

    .line 744
    :cond_1
    iget-wide v4, v1, Ll/۬ܶ֫;->֡:J

    iget-wide v6, v1, Ll/۬ܶ֫;->ܽ:J

    move-object v2, v9

    move-object v3, v8

    invoke-interface/range {v2 .. v7}, Ll/᩸ܶ֫;->ܽ(Ljava/lang/String;JJ)Ll/᩺ܶ֫;

    move-result-object v2

    .line 749
    :goto_0
    iget-object v3, v1, Ll/۬ܶ֫;->᩻:Ll/᩵ܶ֫;

    iget-object v4, v1, Ll/۬ܶ֫;->ܳ:Ll/᩸۠֫;

    iget-object v5, v1, Ll/۬ܶ֫;->۠:Ll/᩸۠֫;

    if-nez v2, :cond_2

    .line 754
    invoke-virtual/range {p1 .. p1}, Ll/ۗ۠֫;->֫()Ll/ۙ۠֫;

    move-result-object v6

    iget-wide v10, v1, Ll/۬ܶ֫;->֡:J

    invoke-virtual {v6, v10, v11}, Ll/ۙ۠֫;->ۧ(J)V

    iget-wide v10, v1, Ll/۬ܶ֫;->ܽ:J

    invoke-virtual {v6, v10, v11}, Ll/ۙ۠֫;->֫(J)V

    invoke-virtual {v6}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object v6

    const-wide/16 v10, -0x1

    move-object/from16 v17, v4

    move-object/from16 v18, v5

    goto/16 :goto_2

    .line 749
    :cond_2
    iget-wide v6, v2, Ll/᩺ܶ֫;->ۗ:J

    .line 755
    iget-boolean v10, v2, Ll/᩺ܶ֫;->᩹:Z

    if-eqz v10, :cond_4

    .line 757
    iget-object v10, v2, Ll/᩺ܶ֫;->᩸:Ljava/io/File;

    invoke-static {v10}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v10

    .line 758
    iget-wide v11, v2, Ll/᩺ܶ֫;->۬:J

    .line 759
    iget-wide v13, v1, Ll/۬ܶ֫;->֡:J

    sub-long/2addr v13, v11

    sub-long/2addr v6, v13

    move-object/from16 v17, v4

    move-object/from16 v18, v5

    .line 761
    iget-wide v4, v1, Ll/۬ܶ֫;->ܽ:J

    const-wide/16 v15, -0x1

    cmp-long v19, v4, v15

    if-eqz v19, :cond_3

    .line 762
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    .line 766
    :cond_3
    invoke-virtual/range {p1 .. p1}, Ll/ۗ۠֫;->֫()Ll/ۙ۠֫;

    move-result-object v4

    .line 767
    invoke-virtual {v4, v10}, Ll/ۙ۠֫;->֫(Landroid/net/Uri;)V

    .line 768
    invoke-virtual {v4, v11, v12}, Ll/ۙ۠֫;->ܽ(J)V

    .line 769
    invoke-virtual {v4, v13, v14}, Ll/ۙ۠֫;->ۧ(J)V

    .line 770
    invoke-virtual {v4, v6, v7}, Ll/ۙ۠֫;->֫(J)V

    .line 771
    invoke-virtual {v4}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object v6

    move-wide v10, v15

    move-object/from16 v5, v17

    goto :goto_2

    :cond_4
    move-object/from16 v17, v4

    move-object/from16 v18, v5

    const-wide/16 v10, -0x1

    cmp-long v4, v6, v10

    if-nez v4, :cond_5

    .line 777
    iget-wide v6, v1, Ll/۬ܶ֫;->ܽ:J

    goto :goto_1

    .line 780
    :cond_5
    iget-wide v4, v1, Ll/۬ܶ֫;->ܽ:J

    cmp-long v12, v4, v10

    if-eqz v12, :cond_6

    .line 781
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    .line 785
    :cond_6
    :goto_1
    invoke-virtual/range {p1 .. p1}, Ll/ۗ۠֫;->֫()Ll/ۙ۠֫;

    move-result-object v4

    iget-wide v12, v1, Ll/۬ܶ֫;->֡:J

    invoke-virtual {v4, v12, v13}, Ll/ۙ۠֫;->ۧ(J)V

    invoke-virtual {v4, v6, v7}, Ll/ۙ۠֫;->֫(J)V

    invoke-virtual {v4}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object v6

    if-eqz v3, :cond_7

    move-object v5, v3

    goto :goto_2

    .line 790
    :cond_7
    invoke-interface {v9, v2}, Ll/᩸ܶ֫;->֫(Ll/᩺ܶ֫;)V

    const/4 v2, 0x0

    move-object/from16 v5, v18

    .line 796
    :goto_2
    iget-boolean v4, v1, Ll/۬ܶ֫;->ۖ:Z

    if-nez v4, :cond_8

    move-object/from16 v4, v18

    if-ne v5, v4, :cond_9

    .line 797
    iget-wide v12, v1, Ll/۬ܶ֫;->֡:J

    const-wide/32 v14, 0x19000

    add-long/2addr v12, v14

    goto :goto_3

    :cond_8
    move-object/from16 v4, v18

    :cond_9
    const-wide v12, 0x7fffffffffffffffL

    .line 798
    :goto_3
    iput-wide v12, v1, Ll/۬ܶ֫;->ۜ:J

    const/4 v7, 0x0

    if-eqz p2, :cond_d

    .line 862
    iget-object v12, v1, Ll/۬ܶ֫;->᩷:Ll/᩸۠֫;

    if-ne v12, v4, :cond_a

    const/4 v12, 0x1

    goto :goto_4

    :cond_a
    const/4 v12, 0x0

    .line 800
    :goto_4
    invoke-static {v12}, Ll/᩺֡֫;->ۧ(Z)V

    if-ne v5, v4, :cond_b

    return-void

    .line 807
    :cond_b
    :try_start_1
    invoke-direct/range {p0 .. p0}, Ll/۬ܶ֫;->ۜ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception v0

    move-object v3, v0

    .line 88
    iget-boolean v0, v2, Ll/᩺ܶ֫;->᩹:Z

    if-nez v0, :cond_c

    .line 811
    invoke-interface {v9, v2}, Ll/᩸ܶ֫;->֫(Ll/᩺ܶ֫;)V

    .line 813
    :cond_c
    throw v3

    :cond_d
    :goto_5
    if-eqz v2, :cond_e

    .line 88
    iget-boolean v4, v2, Ll/᩺ܶ֫;->᩹:Z

    if-nez v4, :cond_e

    .line 818
    iput-object v2, v1, Ll/۬ܶ֫;->ܺ:Ll/᩺ܶ֫;

    .line 820
    :cond_e
    iput-object v5, v1, Ll/۬ܶ֫;->᩷:Ll/᩸۠֫;

    .line 821
    iput-object v6, v1, Ll/۬ܶ֫;->ۡ:Ll/ۗ۠֫;

    const-wide/16 v12, 0x0

    .line 822
    iput-wide v12, v1, Ll/۬ܶ֫;->ۢ:J

    .line 823
    invoke-interface {v5, v6}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J

    move-result-wide v12

    .line 826
    new-instance v2, Ll/᩻᩸֫;

    invoke-direct {v2}, Ll/᩻᩸֫;-><init>()V

    .line 827
    iget-wide v14, v6, Ll/ۗ۠֫;->ܳ:J

    cmp-long v4, v14, v10

    if-nez v4, :cond_f

    cmp-long v4, v12, v10

    if-eqz v4, :cond_f

    .line 828
    iput-wide v12, v1, Ll/۬ܶ֫;->ܽ:J

    .line 829
    iget-wide v10, v1, Ll/۬ܶ֫;->֡:J

    add-long/2addr v10, v12

    invoke-static {v2, v10, v11}, Ll/᩻᩸֫;->֫(Ll/᩻᩸֫;J)V

    .line 866
    :cond_f
    iget-object v4, v1, Ll/۬ܶ֫;->᩷:Ll/᩸۠֫;

    move-object/from16 v6, v17

    if-ne v4, v6, :cond_10

    const/4 v7, 0x1

    :cond_10
    if-nez v7, :cond_12

    .line 832
    invoke-interface {v5}, Ll/᩸۠֫;->ܿ()Landroid/net/Uri;

    move-result-object v4

    iput-object v4, v1, Ll/۬ܶ֫;->֫:Landroid/net/Uri;

    .line 833
    iget-boolean v5, v1, Ll/۬ܶ֫;->᩵:Z

    if-eqz v5, :cond_12

    .line 834
    iget-object v0, v0, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    invoke-virtual {v0, v4}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    .line 835
    iget-object v0, v1, Ll/۬ܶ֫;->֫:Landroid/net/Uri;

    goto :goto_6

    :cond_11
    const/4 v0, 0x0

    :goto_6
    invoke-static {v2, v0}, Ll/᩻᩸֫;->֫(Ll/᩻᩸֫;Landroid/net/Uri;)V

    .line 870
    :cond_12
    iget-object v0, v1, Ll/۬ܶ֫;->᩷:Ll/᩸۠֫;

    if-ne v0, v3, :cond_13

    .line 839
    invoke-interface {v9, v8, v2}, Ll/᩸ܶ֫;->֫(Ljava/lang/String;Ll/᩻᩸֫;)V

    :cond_13
    return-void
.end method

.method private ۜ()V
    .locals 4

    .line 874
    iget-object v0, p0, Ll/۬ܶ֫;->ᩳ:Ll/᩸ܶ֫;

    iget-object v1, p0, Ll/۬ܶ֫;->᩷:Ll/᩸۠֫;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 878
    :try_start_0
    invoke-interface {v1}, Ll/᩸۠֫;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 880
    iput-object v2, p0, Ll/۬ܶ֫;->ۡ:Ll/ۗ۠֫;

    .line 881
    iput-object v2, p0, Ll/۬ܶ֫;->᩷:Ll/᩸۠֫;

    .line 882
    iget-object v1, p0, Ll/۬ܶ֫;->ܺ:Ll/᩺ܶ֫;

    if-eqz v1, :cond_1

    .line 883
    invoke-interface {v0, v1}, Ll/᩸ܶ֫;->֫(Ll/᩺ܶ֫;)V

    .line 884
    iput-object v2, p0, Ll/۬ܶ֫;->ܺ:Ll/᩺ܶ֫;

    :cond_1
    :goto_0
    return-void

    :catchall_0
    move-exception v1

    .line 880
    iput-object v2, p0, Ll/۬ܶ֫;->ۡ:Ll/ۗ۠֫;

    .line 881
    iput-object v2, p0, Ll/۬ܶ֫;->᩷:Ll/᩸۠֫;

    .line 882
    iget-object v3, p0, Ll/۬ܶ֫;->ܺ:Ll/᩺ܶ֫;

    if-eqz v3, :cond_2

    .line 883
    invoke-interface {v0, v3}, Ll/᩸ܶ֫;->֫(Ll/᩺ܶ֫;)V

    .line 884
    iput-object v2, p0, Ll/۬ܶ֫;->ܺ:Ll/᩺ܶ֫;

    .line 886
    :cond_2
    throw v1
.end method


# virtual methods
.method public final close()V
    .locals 3

    const/4 v0, 0x0

    .line 704
    iput-object v0, p0, Ll/۬ܶ֫;->ۚ:Ll/ۗ۠֫;

    .line 705
    iput-object v0, p0, Ll/۬ܶ֫;->֫:Landroid/net/Uri;

    const-wide/16 v0, 0x0

    .line 706
    iput-wide v0, p0, Ll/۬ܶ֫;->֡:J

    .line 709
    :try_start_0
    invoke-direct {p0}, Ll/۬ܶ֫;->ۜ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 866
    iget-object v1, p0, Ll/۬ܶ֫;->᩷:Ll/᩸۠֫;

    iget-object v2, p0, Ll/۬ܶ֫;->ܳ:Ll/᩸۠֫;

    if-eq v1, v2, :cond_0

    .line 890
    instance-of v1, v0, Ll/۠ܶ֫;

    if-eqz v1, :cond_1

    :cond_0
    const/4 v1, 0x1

    .line 891
    iput-boolean v1, p0, Ll/۬ܶ֫;->֨:Z

    .line 712
    :cond_1
    throw v0
.end method

.method public final read([BII)I
    .locals 16

    move-object/from16 v1, p0

    move/from16 v0, p3

    .line 647
    iget-object v2, v1, Ll/۬ܶ֫;->ܳ:Ll/᩸۠֫;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    return v3

    .line 650
    :cond_0
    iget-wide v4, v1, Ll/۬ܶ֫;->ܽ:J

    const/4 v6, -0x1

    const-wide/16 v7, 0x0

    cmp-long v9, v4, v7

    if-nez v9, :cond_1

    return v6

    .line 653
    :cond_1
    iget-object v4, v1, Ll/۬ܶ֫;->ۚ:Ll/ۗ۠֫;

    .line 155
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 654
    iget-object v5, v1, Ll/۬ܶ֫;->ۡ:Ll/ۗ۠֫;

    .line 155
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v9, 0x1

    .line 656
    :try_start_0
    iget-wide v10, v1, Ll/۬ܶ֫;->֡:J

    iget-wide v12, v1, Ll/۬ܶ֫;->ۜ:J

    cmp-long v14, v10, v12

    if-ltz v14, :cond_2

    .line 657
    invoke-direct {v1, v4, v9}, Ll/۬ܶ֫;->֫(Ll/ۗ۠֫;Z)V

    .line 659
    :cond_2
    iget-object v9, v1, Ll/۬ܶ֫;->᩷:Ll/᩸۠֫;

    .line 155
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v10, p1

    move/from16 v11, p2

    .line 659
    invoke-interface {v9, v10, v11, v0}, Ll/ۢᩴ֫;->read([BII)I

    move-result v9

    const-wide/16 v12, -0x1

    if-eq v9, v6, :cond_3

    .line 664
    iget-wide v3, v1, Ll/۬ܶ֫;->֡:J

    int-to-long v5, v9

    add-long/2addr v3, v5

    iput-wide v3, v1, Ll/۬ܶ֫;->֡:J

    .line 665
    iget-wide v3, v1, Ll/۬ܶ֫;->ۢ:J

    add-long/2addr v3, v5

    iput-wide v3, v1, Ll/۬ܶ֫;->ۢ:J

    .line 666
    iget-wide v3, v1, Ll/۬ܶ֫;->ܽ:J

    cmp-long v0, v3, v12

    if-eqz v0, :cond_8

    sub-long/2addr v3, v5

    .line 667
    iput-wide v3, v1, Ll/۬ܶ֫;->ܽ:J

    return v9

    .line 866
    :cond_3
    iget-object v6, v1, Ll/۬ܶ֫;->᩷:Ll/᩸۠֫;

    if-ne v6, v2, :cond_4

    const/4 v14, 0x1

    goto :goto_0

    :cond_4
    const/4 v14, 0x0

    :goto_0
    if-nez v14, :cond_7

    .line 669
    iget-wide v14, v5, Ll/ۗ۠֫;->ܳ:J

    cmp-long v5, v14, v12

    if-eqz v5, :cond_5

    iget-wide v12, v1, Ll/۬ܶ֫;->ۢ:J

    cmp-long v5, v12, v14

    if-gez v5, :cond_7

    .line 675
    :cond_5
    iget-object v0, v4, Ll/ۗ۠֫;->ܿ:Ljava/lang/String;

    sget-object v4, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 844
    iput-wide v7, v1, Ll/۬ܶ֫;->ܽ:J

    .line 870
    iget-object v4, v1, Ll/۬ܶ֫;->᩻:Ll/᩵ܶ֫;

    if-ne v6, v4, :cond_6

    const/4 v3, 0x1

    :cond_6
    if-eqz v3, :cond_8

    .line 846
    new-instance v3, Ll/᩻᩸֫;

    invoke-direct {v3}, Ll/᩻᩸֫;-><init>()V

    .line 847
    iget-wide v4, v1, Ll/۬ܶ֫;->֡:J

    invoke-static {v3, v4, v5}, Ll/᩻᩸֫;->֫(Ll/᩻᩸֫;J)V

    .line 848
    iget-object v4, v1, Ll/۬ܶ֫;->ᩳ:Ll/᩸ܶ֫;

    invoke-interface {v4, v0, v3}, Ll/᩸ܶ֫;->֫(Ljava/lang/String;Ll/᩻᩸֫;)V

    return v9

    .line 676
    :cond_7
    iget-wide v5, v1, Ll/۬ܶ֫;->ܽ:J

    cmp-long v12, v5, v7

    if-gtz v12, :cond_9

    const-wide/16 v7, -0x1

    cmp-long v12, v5, v7

    if-nez v12, :cond_8

    goto :goto_1

    :cond_8
    return v9

    .line 677
    :cond_9
    :goto_1
    invoke-direct/range {p0 .. p0}, Ll/۬ܶ֫;->ۜ()V

    .line 678
    invoke-direct {v1, v4, v3}, Ll/۬ܶ֫;->֫(Ll/ۗ۠֫;Z)V

    .line 679
    invoke-virtual/range {p0 .. p3}, Ll/۬ܶ֫;->read([BII)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    move-exception v0

    .line 866
    iget-object v3, v1, Ll/۬ܶ֫;->᩷:Ll/᩸۠֫;

    if-eq v3, v2, :cond_a

    .line 890
    instance-of v2, v0, Ll/۠ܶ֫;

    if-eqz v2, :cond_b

    :cond_a
    const/4 v2, 0x1

    .line 891
    iput-boolean v2, v1, Ll/۬ܶ֫;->֨:Z

    .line 684
    :cond_b
    throw v0
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 13

    const/4 v0, 0x1

    .line 602
    :try_start_0
    iget-object v1, p0, Ll/۬ܶ֫;->ܿ:Ll/ۨܶ֫;

    invoke-interface {v1, p1}, Ll/ۨܶ֫;->֫(Ll/ۗ۠֫;)Ljava/lang/String;

    move-result-object v1

    .line 603
    invoke-virtual {p1}, Ll/ۗ۠֫;->֫()Ll/ۙ۠֫;

    move-result-object v2

    iget-wide v3, p1, Ll/ۗ۠֫;->᩻:J

    iget-wide v5, p1, Ll/ۗ۠֫;->ܳ:J

    invoke-virtual {v2, v1}, Ll/ۙ۠֫;->֫(Ljava/lang/String;)V

    invoke-virtual {v2}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object p1

    iget-object v2, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    .line 604
    iput-object p1, p0, Ll/۬ܶ֫;->ۚ:Ll/ۗ۠֫;

    .line 606
    iget-boolean v7, p0, Ll/۬ܶ֫;->᩵:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v8, p0, Ll/۬ܶ֫;->ᩳ:Ll/᩸ܶ֫;

    if-eqz v7, :cond_1

    .line 853
    :try_start_1
    invoke-interface {v8, v1}, Ll/᩸ܶ֫;->֫(Ljava/lang/String;)Ll/ۜ᩸֫;

    move-result-object v7

    const-string v9, "exo_redir"

    .line 86
    invoke-virtual {v7, v9}, Ll/ۜ᩸֫;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_0

    const/4 v7, 0x0

    goto :goto_0

    .line 87
    :cond_0
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    :goto_0
    if-eqz v7, :cond_1

    move-object v2, v7

    .line 608
    :cond_1
    iput-object v2, p0, Ll/۬ܶ֫;->֫:Landroid/net/Uri;

    .line 609
    iput-wide v3, p0, Ll/۬ܶ֫;->֡:J

    .line 896
    iget-boolean v2, p0, Ll/۬ܶ֫;->ᩴ:Z

    const/4 v7, 0x0

    const-wide/16 v9, -0x1

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Ll/۬ܶ֫;->֨:Z

    if-eqz v2, :cond_2

    goto :goto_1

    .line 898
    :cond_2
    iget-boolean v2, p0, Ll/۬ܶ֫;->ۘ:Z

    if-eqz v2, :cond_3

    cmp-long v2, v5, v9

    if-nez v2, :cond_3

    :goto_1
    const/4 v2, 0x1

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    .line 612
    :goto_2
    iput-boolean v2, p0, Ll/۬ܶ֫;->ۖ:Z

    const-wide/16 v11, 0x0

    if-eqz v2, :cond_4

    .line 618
    iput-wide v9, p0, Ll/۬ܶ֫;->ܽ:J

    goto :goto_3

    .line 620
    :cond_4
    invoke-interface {v8, v1}, Ll/᩸ܶ֫;->֫(Ljava/lang/String;)Ll/ۜ᩸֫;

    move-result-object v1

    invoke-static {v1}, Ll/۬᩵ᩳ;->֫(Ll/ܳ᩸֫;)J

    move-result-wide v1

    iput-wide v1, p0, Ll/۬ܶ֫;->ܽ:J

    cmp-long v8, v1, v9

    if-eqz v8, :cond_6

    sub-long/2addr v1, v3

    .line 622
    iput-wide v1, p0, Ll/۬ܶ֫;->ܽ:J

    cmp-long v3, v1, v11

    if-ltz v3, :cond_5

    goto :goto_3

    .line 624
    :cond_5
    new-instance p1, Ll/᩹۠֫;

    const/16 v1, 0x7d8

    invoke-direct {p1, v1}, Ll/᩹۠֫;-><init>(I)V

    throw p1

    :cond_6
    :goto_3
    cmp-long v1, v5, v9

    if-eqz v1, :cond_8

    .line 631
    iget-wide v2, p0, Ll/۬ܶ֫;->ܽ:J

    cmp-long v4, v2, v9

    if-nez v4, :cond_7

    move-wide v2, v5

    goto :goto_4

    .line 633
    :cond_7
    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    :goto_4
    iput-wide v2, p0, Ll/۬ܶ֫;->ܽ:J

    .line 635
    :cond_8
    iget-wide v2, p0, Ll/۬ܶ֫;->ܽ:J

    cmp-long v4, v2, v11

    if-gtz v4, :cond_9

    cmp-long v4, v2, v9

    if-nez v4, :cond_a

    .line 636
    :cond_9
    invoke-direct {p0, p1, v7}, Ll/۬ܶ֫;->֫(Ll/ۗ۠֫;Z)V

    :cond_a
    if-eqz v1, :cond_b

    return-wide v5

    .line 638
    :cond_b
    iget-wide v0, p0, Ll/۬ܶ֫;->ܽ:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-wide v0

    :catchall_0
    move-exception p1

    .line 866
    iget-object v1, p0, Ll/۬ܶ֫;->᩷:Ll/᩸۠֫;

    iget-object v2, p0, Ll/۬ܶ֫;->ܳ:Ll/᩸۠֫;

    if-eq v1, v2, :cond_c

    .line 890
    instance-of v1, p1, Ll/۠ܶ֫;

    if-eqz v1, :cond_d

    .line 891
    :cond_c
    iput-boolean v0, p0, Ll/۬ܶ֫;->֨:Z

    .line 641
    :cond_d
    throw p1
.end method

.method public final ֫()Ljava/util/Map;
    .locals 2

    .line 866
    iget-object v0, p0, Ll/۬ܶ֫;->᩷:Ll/᩸۠֫;

    iget-object v1, p0, Ll/۬ܶ֫;->ܳ:Ll/᩸۠֫;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 698
    iget-object v0, p0, Ll/۬ܶ֫;->۠:Ll/᩸۠֫;

    invoke-interface {v0}, Ll/᩸۠֫;->֫()Ljava/util/Map;

    move-result-object v0

    return-object v0

    .line 699
    :cond_1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object v0
.end method

.method public final ֫(Ll/֡ܶ֫;)V
    .locals 1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 595
    iget-object v0, p0, Ll/۬ܶ֫;->ܳ:Ll/᩸۠֫;

    invoke-interface {v0, p1}, Ll/᩸۠֫;->֫(Ll/֡ܶ֫;)V

    .line 596
    iget-object v0, p0, Ll/۬ܶ֫;->۠:Ll/᩸۠֫;

    invoke-interface {v0, p1}, Ll/᩸۠֫;->֫(Ll/֡ܶ֫;)V

    return-void
.end method

.method public final ܳ()Ll/᩸ܶ֫;
    .locals 1

    .line 584
    iget-object v0, p0, Ll/۬ܶ֫;->ᩳ:Ll/᩸ܶ֫;

    return-object v0
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 691
    iget-object v0, p0, Ll/۬ܶ֫;->֫:Landroid/net/Uri;

    return-object v0
.end method

.method public final ᩻()Ll/ۨܶ֫;
    .locals 1

    .line 589
    iget-object v0, p0, Ll/۬ܶ֫;->ܿ:Ll/ۨܶ֫;

    return-object v0
.end method
