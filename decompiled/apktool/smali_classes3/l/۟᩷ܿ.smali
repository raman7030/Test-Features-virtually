.class public final Ll/۟᩷ܿ;
.super Ljava/lang/Object;
.source "N6ZQ"


# instance fields
.field public ֡:I

.field public ֨:Ll/ۧۢܿ;

.field public ֫:I

.field public final ۖ:[I

.field public final ۗ:Z

.field public ۘ:I

.field public final ۙ:I

.field public final ۚ:I

.field public ۜ:I

.field public ۠:I

.field public final ۡ:[Ll/ܶۜܿ;

.field public final ۢ:[I

.field public ۧ:Ll/ܰ᩷ܿ;

.field public ۫:I

.field public ۬:Z

.field public final ܳ:I

.field public ܶ:[I

.field public ܺ:I

.field public ܽ:[J

.field public ܿ:I

.field public ᩳ:I

.field public ᩴ:I

.field public ᩵:Ll/ᩳۢܿ;

.field public ᩶:I

.field public ᩷:[I

.field public final ᩸:[I

.field public ᩹:I

.field public ᩻:I


# direct methods
.method public constructor <init>(IIII[I[I[I[Ll/ܶۜܿ;Z)V
    .locals 2

    .line 618
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 595
    iput v0, p0, Ll/۟᩷ܿ;->ܺ:I

    const/4 v1, -0x1

    .line 611
    iput v1, p0, Ll/۟᩷ܿ;->ᩴ:I

    .line 619
    iput p4, p0, Ll/۟᩷ܿ;->ۚ:I

    sub-int p4, p3, p2

    .line 620
    iput p4, p0, Ll/۟᩷ܿ;->ۙ:I

    .line 621
    iput p2, p0, Ll/۟᩷ܿ;->ܳ:I

    .line 622
    iput-object p5, p0, Ll/۟᩷ܿ;->᩸:[I

    .line 623
    iput-object p6, p0, Ll/۟᩷ܿ;->ۢ:[I

    .line 624
    iput-object p7, p0, Ll/۟᩷ܿ;->ۖ:[I

    .line 625
    iput-object p8, p0, Ll/۟᩷ܿ;->ۡ:[Ll/ܶۜܿ;

    const/4 p7, 0x0

    if-nez p2, :cond_1

    if-eq p3, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 626
    :goto_1
    iput-boolean p1, p0, Ll/۟᩷ܿ;->ۗ:Z

    if-eqz p9, :cond_2

    const/16 p1, 0x10

    .line 628
    iput p1, p0, Ll/۟᩷ܿ;->ۘ:I

    return-void

    :cond_2
    if-nez p1, :cond_3

    .line 630
    iput v0, p0, Ll/۟᩷ܿ;->ۘ:I

    return-void

    .line 632
    :cond_3
    aput p7, p5, p7

    .line 633
    aput p4, p6, p7

    .line 634
    iput p7, p0, Ll/۟᩷ܿ;->ۘ:I

    return-void
.end method

.method private ܽ()Z
    .locals 10

    .line 837
    iget v0, p0, Ll/۟᩷ܿ;->᩹:I

    const/4 v1, 0x0

    iget-object v2, p0, Ll/۟᩷ܿ;->ۢ:[I

    iget-object v3, p0, Ll/۟᩷ܿ;->᩸:[I

    const-wide v4, 0x7fffffffffffffffL

    iget v6, p0, Ll/۟᩷ܿ;->ۚ:I

    const/4 v7, 0x1

    if-eqz v0, :cond_b

    const/4 v8, 0x2

    if-eq v0, v7, :cond_9

    const/4 v9, 0x3

    if-eq v0, v8, :cond_7

    if-ne v0, v9, :cond_6

    .line 862
    iget v0, p0, Ll/۟᩷ܿ;->۠:I

    if-lt v0, v6, :cond_0

    iget v8, p0, Ll/۟᩷ܿ;->ۜ:I

    if-lt v8, v6, :cond_0

    goto/16 :goto_2

    :cond_0
    if-ge v0, v6, :cond_1

    .line 864
    iget-object v7, p0, Ll/۟᩷ܿ;->ܶ:[I

    aget v0, v7, v0

    aget v0, v3, v0

    int-to-long v7, v0

    goto :goto_0

    :cond_1
    move-wide v7, v4

    .line 865
    :goto_0
    iget v0, p0, Ll/۟᩷ܿ;->ۜ:I

    if-ge v0, v6, :cond_2

    .line 866
    iget-object v3, p0, Ll/۟᩷ܿ;->᩷:[I

    aget v0, v3, v0

    aget v0, v2, v0

    int-to-long v4, v0

    .line 867
    :cond_2
    invoke-static {v7, v8, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    .line 868
    iget v0, p0, Ll/۟᩷ܿ;->᩶:I

    int-to-long v4, v0

    cmp-long v0, v2, v4

    if-lez v0, :cond_5

    .line 869
    iget-object v0, p0, Ll/۟᩷ܿ;->ۧ:Ll/ܰ᩷ܿ;

    invoke-virtual {v0}, Ll/ܰ᩷ܿ;->ۧ()I

    move-result v0

    if-ltz v0, :cond_4

    .line 874
    iget v2, p0, Ll/۟᩷ܿ;->ᩴ:I

    if-eq v0, v2, :cond_5

    .line 875
    iget-boolean v2, p0, Ll/۟᩷ܿ;->۬:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/۟᩷ܿ;->ܽ:[J

    iget v3, p0, Ll/۟᩷ܿ;->֡:I

    iget v4, p0, Ll/۟᩷ܿ;->᩶:I

    invoke-static {v4, v0}, Ll/ᩳۢܿ;->ܽ(II)J

    move-result-wide v4

    aput-wide v4, v2, v3

    .line 876
    :cond_3
    iget v2, p0, Ll/۟᩷ܿ;->֡:I

    invoke-static {v2}, Ll/ᩳۢܿ;->ۡ(I)I

    move-result v2

    iput v2, p0, Ll/۟᩷ܿ;->֡:I

    .line 877
    iput v0, p0, Ll/۟᩷ܿ;->ᩴ:I

    goto :goto_1

    .line 871
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Syntax context ranges do not cover the text"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 880
    :cond_5
    :goto_1
    iput v1, p0, Ll/۟᩷ܿ;->᩹:I

    return v1

    .line 882
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid syntax context sweep phase"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 855
    :cond_7
    iget v0, p0, Ll/۟᩷ܿ;->۠:I

    if-ge v0, v6, :cond_8

    iget-object v2, p0, Ll/۟᩷ܿ;->ܶ:[I

    aget v2, v2, v0

    aget v3, v3, v2

    iget v4, p0, Ll/۟᩷ܿ;->᩶:I

    if-ne v3, v4, :cond_8

    .line 856
    iget-object v3, p0, Ll/۟᩷ܿ;->ۧ:Ll/ܰ᩷ܿ;

    add-int/2addr v0, v7

    iput v0, p0, Ll/۟᩷ܿ;->۠:I

    invoke-virtual {v3, v2}, Ll/ܰ᩷ܿ;->֫(I)V

    return v1

    .line 858
    :cond_8
    iput v9, p0, Ll/۟᩷ܿ;->᩹:I

    return v1

    .line 848
    :cond_9
    iget v0, p0, Ll/۟᩷ܿ;->ۜ:I

    if-ge v0, v6, :cond_a

    iget-object v3, p0, Ll/۟᩷ܿ;->᩷:[I

    aget v3, v3, v0

    aget v2, v2, v3

    iget v4, p0, Ll/۟᩷ܿ;->᩶:I

    if-ne v2, v4, :cond_a

    .line 849
    iget-object v2, p0, Ll/۟᩷ܿ;->ۧ:Ll/ܰ᩷ܿ;

    add-int/2addr v0, v7

    iput v0, p0, Ll/۟᩷ܿ;->ۜ:I

    invoke-virtual {v2, v3}, Ll/ܰ᩷ܿ;->ۧ(I)V

    return v1

    .line 851
    :cond_a
    iput v8, p0, Ll/۟᩷ܿ;->᩹:I

    return v1

    .line 839
    :cond_b
    iget v0, p0, Ll/۟᩷ܿ;->۠:I

    if-lt v0, v6, :cond_c

    iget v8, p0, Ll/۟᩷ܿ;->ۜ:I

    if-lt v8, v6, :cond_c

    :goto_2
    return v7

    :cond_c
    if-ge v0, v6, :cond_d

    .line 841
    iget-object v8, p0, Ll/۟᩷ܿ;->ܶ:[I

    aget v0, v8, v0

    aget v0, v3, v0

    int-to-long v8, v0

    goto :goto_3

    :cond_d
    move-wide v8, v4

    .line 842
    :goto_3
    iget v0, p0, Ll/۟᩷ܿ;->ۜ:I

    if-ge v0, v6, :cond_e

    .line 843
    iget-object v3, p0, Ll/۟᩷ܿ;->᩷:[I

    aget v0, v3, v0

    aget v0, v2, v0

    int-to-long v4, v0

    .line 844
    :cond_e
    invoke-static {v8, v9, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v0, v2

    iput v0, p0, Ll/۟᩷ܿ;->᩶:I

    .line 845
    iput v7, p0, Ll/۟᩷ܿ;->᩹:I

    return v1
.end method

.method private ܿ()V
    .locals 9

    .line 943
    new-instance v8, Ll/ᩳۢܿ;

    iget-object v6, p0, Ll/۟᩷ܿ;->ۡ:[Ll/ܶۜܿ;

    iget-object v7, p0, Ll/۟᩷ܿ;->ܽ:[J

    iget v1, p0, Ll/۟᩷ܿ;->ۙ:I

    iget v2, p0, Ll/۟᩷ܿ;->ۚ:I

    iget-object v3, p0, Ll/۟᩷ܿ;->᩸:[I

    iget-object v4, p0, Ll/۟᩷ܿ;->ۢ:[I

    iget-object v5, p0, Ll/۟᩷ܿ;->ۖ:[I

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ll/ᩳۢܿ;-><init>(II[I[I[I[Ll/ܶۜܿ;[J)V

    iput-object v8, p0, Ll/۟᩷ܿ;->᩵:Ll/ᩳۢܿ;

    const/4 v0, 0x0

    .line 945
    iput-object v0, p0, Ll/۟᩷ܿ;->᩷:[I

    iput-object v0, p0, Ll/۟᩷ܿ;->ܶ:[I

    .line 946
    iput-object v0, p0, Ll/۟᩷ܿ;->֨:Ll/ۧۢܿ;

    .line 947
    iput-object v0, p0, Ll/۟᩷ܿ;->ۧ:Ll/ܰ᩷ܿ;

    const/16 v0, 0xf

    .line 948
    iput v0, p0, Ll/۟᩷ܿ;->ۘ:I

    return-void
.end method

.method private ᩳ()V
    .locals 1

    const/4 v0, 0x0

    .line 802
    iput-object v0, p0, Ll/۟᩷ܿ;->᩷:[I

    iput-object v0, p0, Ll/۟᩷ܿ;->ܶ:[I

    .line 803
    iput-object v0, p0, Ll/۟᩷ܿ;->ܽ:[J

    const/4 v0, 0x0

    .line 804
    iput v0, p0, Ll/۟᩷ܿ;->۫:I

    iput v0, p0, Ll/۟᩷ܿ;->֡:I

    const/4 v0, 0x6

    .line 805
    iput v0, p0, Ll/۟᩷ܿ;->ۘ:I

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 11

    .line 640
    iget v0, p0, Ll/۟᩷ܿ;->ۘ:I

    const/4 v1, -0x1

    iget v2, p0, Ll/۟᩷ܿ;->ۙ:I

    iget-object v3, p0, Ll/۟᩷ܿ;->ۖ:[I

    iget-object v4, p0, Ll/۟᩷ܿ;->᩸:[I

    const/4 v5, 0x0

    iget-object v6, p0, Ll/۟᩷ܿ;->ۢ:[I

    iget v7, p0, Ll/۟᩷ܿ;->ۚ:I

    const/4 v8, 0x1

    packed-switch v0, :pswitch_data_0

    .line 673
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid syntax context build phase"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 680
    :pswitch_0
    iget v0, p0, Ll/۟᩷ܿ;->ܺ:I

    if-lt v0, v7, :cond_1

    .line 681
    iput v8, p0, Ll/۟᩷ܿ;->ܺ:I

    .line 682
    iget-boolean v0, p0, Ll/۟᩷ܿ;->ۗ:Z

    if-eqz v0, :cond_0

    .line 683
    aput v5, v4, v5

    .line 684
    aput v2, v6, v5

    .line 685
    iput v5, p0, Ll/۟᩷ܿ;->ۘ:I

    goto/16 :goto_3

    .line 687
    :cond_0
    iput v8, p0, Ll/۟᩷ܿ;->ۘ:I

    goto/16 :goto_3

    .line 691
    :cond_1
    aget v1, v3, v0

    if-ltz v1, :cond_2

    if-ge v1, v0, :cond_2

    .line 692
    aget v2, v4, v0

    aget v3, v4, v1

    if-lt v2, v3, :cond_2

    aget v3, v6, v0

    if-le v3, v2, :cond_2

    aget v1, v6, v1

    if-gt v3, v1, :cond_2

    add-int/2addr v0, v8

    .line 696
    iput v0, p0, Ll/۟᩷ܿ;->ܺ:I

    goto/16 :goto_3

    .line 694
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid syntax context node: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/۟᩷ܿ;->ܺ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 667
    :pswitch_1
    invoke-direct {p0}, Ll/۟᩷ܿ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_20

    .line 914
    iget v0, p0, Ll/۟᩷ܿ;->֡:I

    iget v1, p0, Ll/۟᩷ܿ;->۫:I

    if-ne v0, v1, :cond_4

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/۟᩷ܿ;->ܽ:[J

    aget-wide v1, v0, v5

    const/16 v0, 0x20

    ushr-long v0, v1, v0

    long-to-int v1, v0

    if-nez v1, :cond_4

    .line 918
    :cond_3
    invoke-direct {p0}, Ll/۟᩷ܿ;->ܿ()V

    goto/16 :goto_3

    .line 916
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Syntax context ranges do not cover the text"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 898
    :pswitch_2
    iget v0, p0, Ll/۟᩷ܿ;->ᩳ:I

    iget-object v2, p0, Ll/۟᩷ܿ;->ۧ:Ll/ܰ᩷ܿ;

    invoke-static {v2}, Ll/ܰ᩷ܿ;->֫(Ll/ܰ᩷ܿ;)[[J

    move-result-object v2

    array-length v2, v2

    if-lt v0, v2, :cond_5

    .line 933
    iput v5, p0, Ll/۟᩷ܿ;->ۜ:I

    iput v5, p0, Ll/۟᩷ܿ;->۠:I

    .line 934
    iput v5, p0, Ll/۟᩷ܿ;->᩶:I

    .line 935
    iput v5, p0, Ll/۟᩷ܿ;->᩹:I

    .line 936
    iput v1, p0, Ll/۟᩷ܿ;->ᩴ:I

    .line 937
    iput v5, p0, Ll/۟᩷ܿ;->֡:I

    .line 938
    iput-boolean v8, p0, Ll/۟᩷ܿ;->۬:Z

    const/16 v0, 0xe

    .line 900
    iput v0, p0, Ll/۟᩷ܿ;->ۘ:I

    goto/16 :goto_3

    .line 903
    :cond_5
    iget-object v0, p0, Ll/۟᩷ܿ;->ۧ:Ll/ܰ᩷ܿ;

    invoke-static {v0}, Ll/ܰ᩷ܿ;->֫(Ll/ܰ᩷ܿ;)[[J

    move-result-object v0

    iget v1, p0, Ll/۟᩷ܿ;->ᩳ:I

    aget-object v0, v0, v1

    .line 904
    iget v2, p0, Ll/۟᩷ܿ;->ܿ:I

    array-length v3, v0

    if-lt v2, v3, :cond_6

    add-int/2addr v1, v8

    .line 905
    iput v1, p0, Ll/۟᩷ܿ;->ᩳ:I

    .line 906
    iput v5, p0, Ll/۟᩷ܿ;->ܿ:I

    goto/16 :goto_3

    :cond_6
    add-int/lit8 v1, v2, 0x1

    .line 909
    iput v1, p0, Ll/۟᩷ܿ;->ܿ:I

    const-wide/16 v3, 0x0

    aput-wide v3, v0, v2

    goto/16 :goto_3

    .line 889
    :pswitch_3
    iget v0, p0, Ll/۟᩷ܿ;->֡:I

    if-nez v0, :cond_7

    invoke-static {}, Ll/ᩳۢܿ;->ܽ()[J

    move-result-object v0

    goto :goto_0

    :cond_7
    new-array v0, v0, [J

    :goto_0
    iput-object v0, p0, Ll/۟᩷ܿ;->ܽ:[J

    .line 890
    iget v0, p0, Ll/۟᩷ܿ;->֡:I

    iput v0, p0, Ll/۟᩷ܿ;->۫:I

    .line 891
    iput v5, p0, Ll/۟᩷ܿ;->֡:I

    .line 892
    iput v5, p0, Ll/۟᩷ܿ;->ܿ:I

    iput v5, p0, Ll/۟᩷ܿ;->ᩳ:I

    const/16 v0, 0xd

    .line 893
    iput v0, p0, Ll/۟᩷ܿ;->ۘ:I

    goto/16 :goto_3

    .line 660
    :pswitch_4
    invoke-direct {p0}, Ll/۟᩷ܿ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_20

    const/16 v0, 0xc

    .line 661
    iput v0, p0, Ll/۟᩷ܿ;->ۘ:I

    goto/16 :goto_3

    .line 828
    :pswitch_5
    iget-object v0, p0, Ll/۟᩷ܿ;->֨:Ll/ۧۢܿ;

    invoke-virtual {v0}, Ll/ۧۢܿ;->֫()Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_3

    :cond_8
    const/4 v0, 0x0

    .line 829
    iput-object v0, p0, Ll/۟᩷ܿ;->֨:Ll/ۧۢܿ;

    .line 830
    new-instance v0, Ll/ܰ᩷ܿ;

    invoke-direct {v0, v7}, Ll/ܰ᩷ܿ;-><init>(I)V

    iput-object v0, p0, Ll/۟᩷ܿ;->ۧ:Ll/ܰ᩷ܿ;

    .line 933
    iput v5, p0, Ll/۟᩷ܿ;->ۜ:I

    iput v5, p0, Ll/۟᩷ܿ;->۠:I

    .line 934
    iput v5, p0, Ll/۟᩷ܿ;->᩶:I

    .line 935
    iput v5, p0, Ll/۟᩷ܿ;->᩹:I

    .line 936
    iput v1, p0, Ll/۟᩷ܿ;->ᩴ:I

    .line 937
    iput v5, p0, Ll/۟᩷ܿ;->֡:I

    .line 938
    iput-boolean v5, p0, Ll/۟᩷ܿ;->۬:Z

    const/16 v0, 0xb

    .line 832
    iput v0, p0, Ll/۟᩷ܿ;->ۘ:I

    goto/16 :goto_3

    .line 821
    :pswitch_6
    iget-object v0, p0, Ll/۟᩷ܿ;->֨:Ll/ۧۢܿ;

    invoke-virtual {v0}, Ll/ۧۢܿ;->֫()Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_3

    .line 822
    :cond_9
    iget-object v0, p0, Ll/۟᩷ܿ;->֨:Ll/ۧۢܿ;

    iget-object v1, p0, Ll/۟᩷ܿ;->᩷:[I

    invoke-virtual {v0, v1, v6}, Ll/ۧۢܿ;->֫([I[I)V

    const/16 v0, 0xa

    .line 823
    iput v0, p0, Ll/۟᩷ܿ;->ۘ:I

    goto/16 :goto_3

    .line 810
    :pswitch_7
    iget v0, p0, Ll/۟᩷ܿ;->ܺ:I

    if-lt v0, v7, :cond_a

    .line 811
    new-instance v0, Ll/ۧۢܿ;

    iget-object v1, p0, Ll/۟᩷ܿ;->ܶ:[I

    invoke-direct {v0, v1, v4}, Ll/ۧۢܿ;-><init>([I[I)V

    iput-object v0, p0, Ll/۟᩷ܿ;->֨:Ll/ۧۢܿ;

    const/16 v0, 0x9

    .line 812
    iput v0, p0, Ll/۟᩷ܿ;->ۘ:I

    goto/16 :goto_3

    .line 815
    :cond_a
    iget-object v1, p0, Ll/۟᩷ܿ;->ܶ:[I

    iget-object v2, p0, Ll/۟᩷ܿ;->᩷:[I

    aput v0, v2, v0

    aput v0, v1, v0

    add-int/2addr v0, v8

    .line 816
    iput v0, p0, Ll/۟᩷ܿ;->ܺ:I

    goto/16 :goto_3

    .line 652
    :pswitch_8
    new-array v0, v7, [I

    iput-object v0, p0, Ll/۟᩷ܿ;->᩷:[I

    .line 653
    iput v5, p0, Ll/۟᩷ܿ;->ܺ:I

    const/16 v0, 0x8

    .line 654
    iput v0, p0, Ll/۟᩷ܿ;->ۘ:I

    goto/16 :goto_3

    .line 648
    :pswitch_9
    new-array v0, v7, [I

    iput-object v0, p0, Ll/۟᩷ܿ;->ܶ:[I

    const/4 v0, 0x7

    .line 649
    iput v0, p0, Ll/۟᩷ܿ;->ۘ:I

    goto/16 :goto_3

    .line 788
    :pswitch_a
    iget v0, p0, Ll/۟᩷ܿ;->֫:I

    if-ltz v0, :cond_c

    .line 789
    aget v1, v6, v0

    iget v2, p0, Ll/۟᩷ܿ;->᩻:I

    if-le v1, v2, :cond_b

    iget-object v1, p0, Ll/۟᩷ܿ;->ܽ:[J

    iget v4, p0, Ll/۟᩷ܿ;->۫:I

    add-int/lit8 v7, v4, 0x1

    iput v7, p0, Ll/۟᩷ܿ;->۫:I

    invoke-static {v2, v0}, Ll/ᩳۢܿ;->ܽ(II)J

    move-result-wide v9

    aput-wide v9, v1, v4

    .line 790
    :cond_b
    iget v0, p0, Ll/۟᩷ܿ;->֫:I

    aget v1, v6, v0

    iput v1, p0, Ll/۟᩷ܿ;->᩻:I

    .line 791
    aget v0, v3, v0

    iput v0, p0, Ll/۟᩷ܿ;->֫:I

    goto/16 :goto_3

    .line 794
    :cond_c
    iget v0, p0, Ll/۟᩷ܿ;->۫:I

    iget v1, p0, Ll/۟᩷ܿ;->֡:I

    if-ne v0, v1, :cond_d

    iget v0, p0, Ll/۟᩷ܿ;->᩻:I

    if-ne v0, v2, :cond_d

    .line 797
    invoke-direct {p0}, Ll/۟᩷ܿ;->ܿ()V

    goto/16 :goto_3

    .line 795
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Ordered syntax context run count changed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 770
    :pswitch_b
    iget v0, p0, Ll/۟᩷ܿ;->ܺ:I

    if-lt v0, v7, :cond_e

    const/4 v0, 0x5

    .line 771
    iput v0, p0, Ll/۟᩷ܿ;->ۘ:I

    goto/16 :goto_3

    .line 774
    :cond_e
    aget v1, v3, v0

    .line 775
    iget v2, p0, Ll/۟᩷ܿ;->֫:I

    if-eq v2, v1, :cond_10

    .line 776
    aget v0, v6, v2

    iget v1, p0, Ll/۟᩷ܿ;->᩻:I

    if-le v0, v1, :cond_f

    iget-object v0, p0, Ll/۟᩷ܿ;->ܽ:[J

    iget v4, p0, Ll/۟᩷ܿ;->۫:I

    add-int/lit8 v7, v4, 0x1

    iput v7, p0, Ll/۟᩷ܿ;->۫:I

    invoke-static {v1, v2}, Ll/ᩳۢܿ;->ܽ(II)J

    move-result-wide v1

    aput-wide v1, v0, v4

    .line 777
    :cond_f
    iget v0, p0, Ll/۟᩷ܿ;->֫:I

    aget v1, v6, v0

    iput v1, p0, Ll/۟᩷ܿ;->᩻:I

    .line 778
    aget v0, v3, v0

    iput v0, p0, Ll/۟᩷ܿ;->֫:I

    goto/16 :goto_3

    .line 781
    :cond_10
    aget v0, v4, v0

    iget v1, p0, Ll/۟᩷ܿ;->᩻:I

    if-le v0, v1, :cond_11

    iget-object v0, p0, Ll/۟᩷ܿ;->ܽ:[J

    iget v3, p0, Ll/۟᩷ܿ;->۫:I

    add-int/lit8 v6, v3, 0x1

    iput v6, p0, Ll/۟᩷ܿ;->۫:I

    invoke-static {v1, v2}, Ll/ᩳۢܿ;->ܽ(II)J

    move-result-wide v1

    aput-wide v1, v0, v3

    .line 782
    :cond_11
    iget v0, p0, Ll/۟᩷ܿ;->ܺ:I

    aget v1, v4, v0

    iput v1, p0, Ll/۟᩷ܿ;->᩻:I

    add-int/lit8 v1, v0, 0x1

    .line 783
    iput v1, p0, Ll/۟᩷ܿ;->ܺ:I

    iput v0, p0, Ll/۟᩷ܿ;->֫:I

    goto/16 :goto_3

    .line 762
    :pswitch_c
    iget v0, p0, Ll/۟᩷ܿ;->֡:I

    if-nez v0, :cond_12

    invoke-static {}, Ll/ᩳۢܿ;->ܽ()[J

    move-result-object v0

    iput-object v0, p0, Ll/۟᩷ܿ;->ܽ:[J

    goto :goto_1

    :cond_12
    if-ne v7, v8, :cond_13

    if-ne v0, v8, :cond_13

    .line 763
    invoke-static {}, Ll/ᩳۢܿ;->ᩳ()[J

    move-result-object v0

    iput-object v0, p0, Ll/۟᩷ܿ;->ܽ:[J

    goto :goto_1

    .line 764
    :cond_13
    new-array v0, v0, [J

    iput-object v0, p0, Ll/۟᩷ܿ;->ܽ:[J

    .line 923
    :goto_1
    iput v8, p0, Ll/۟᩷ܿ;->ܺ:I

    .line 924
    iput v5, p0, Ll/۟᩷ܿ;->֫:I

    .line 925
    iput v5, p0, Ll/۟᩷ܿ;->᩻:I

    .line 926
    iput v5, p0, Ll/۟᩷ܿ;->۫:I

    const/4 v0, 0x4

    .line 928
    iput v0, p0, Ll/۟᩷ܿ;->ۘ:I

    goto/16 :goto_3

    .line 746
    :pswitch_d
    iget v0, p0, Ll/۟᩷ܿ;->֫:I

    if-gez v0, :cond_15

    .line 747
    iget v0, p0, Ll/۟᩷ܿ;->᩻:I

    if-eq v0, v2, :cond_14

    invoke-direct {p0}, Ll/۟᩷ܿ;->ᩳ()V

    goto/16 :goto_3

    :cond_14
    const/4 v0, 0x3

    .line 748
    iput v0, p0, Ll/۟᩷ܿ;->ۘ:I

    goto/16 :goto_3

    .line 751
    :cond_15
    aget v0, v6, v0

    iget v1, p0, Ll/۟᩷ܿ;->᩻:I

    if-ge v0, v1, :cond_16

    .line 752
    invoke-direct {p0}, Ll/۟᩷ܿ;->ᩳ()V

    goto/16 :goto_3

    :cond_16
    if-le v0, v1, :cond_17

    .line 755
    iget v0, p0, Ll/۟᩷ܿ;->֡:I

    invoke-static {v0}, Ll/ᩳۢܿ;->ۡ(I)I

    move-result v0

    iput v0, p0, Ll/۟᩷ܿ;->֡:I

    .line 756
    :cond_17
    iget v0, p0, Ll/۟᩷ܿ;->֫:I

    aget v1, v6, v0

    iput v1, p0, Ll/۟᩷ܿ;->᩻:I

    .line 757
    aget v0, v3, v0

    iput v0, p0, Ll/۟᩷ܿ;->֫:I

    goto/16 :goto_3

    .line 720
    :pswitch_e
    iget v0, p0, Ll/۟᩷ܿ;->ܺ:I

    if-lt v0, v7, :cond_18

    const/4 v0, 0x2

    .line 721
    iput v0, p0, Ll/۟᩷ܿ;->ۘ:I

    goto/16 :goto_3

    .line 724
    :cond_18
    aget v1, v3, v0

    .line 725
    iget v2, p0, Ll/۟᩷ܿ;->֫:I

    if-eq v2, v1, :cond_1c

    if-eqz v2, :cond_1b

    .line 726
    aget v0, v6, v2

    iget v1, p0, Ll/۟᩷ܿ;->᩻:I

    if-ge v0, v1, :cond_19

    goto :goto_2

    :cond_19
    if-le v0, v1, :cond_1a

    .line 730
    iget v0, p0, Ll/۟᩷ܿ;->֡:I

    invoke-static {v0}, Ll/ᩳۢܿ;->ۡ(I)I

    move-result v0

    iput v0, p0, Ll/۟᩷ܿ;->֡:I

    .line 731
    :cond_1a
    iget v0, p0, Ll/۟᩷ܿ;->֫:I

    aget v1, v6, v0

    iput v1, p0, Ll/۟᩷ܿ;->᩻:I

    .line 732
    aget v0, v3, v0

    iput v0, p0, Ll/۟᩷ܿ;->֫:I

    goto :goto_3

    .line 727
    :cond_1b
    :goto_2
    invoke-direct {p0}, Ll/۟᩷ܿ;->ᩳ()V

    goto :goto_3

    .line 735
    :cond_1c
    aget v0, v4, v0

    iget v1, p0, Ll/۟᩷ܿ;->᩻:I

    if-ge v0, v1, :cond_1d

    .line 736
    invoke-direct {p0}, Ll/۟᩷ܿ;->ᩳ()V

    goto :goto_3

    :cond_1d
    if-le v0, v1, :cond_1e

    .line 739
    iget v0, p0, Ll/۟᩷ܿ;->֡:I

    invoke-static {v0}, Ll/ᩳۢܿ;->ۡ(I)I

    move-result v0

    iput v0, p0, Ll/۟᩷ܿ;->֡:I

    .line 740
    :cond_1e
    iget v0, p0, Ll/۟᩷ܿ;->ܺ:I

    aget v1, v4, v0

    iput v1, p0, Ll/۟᩷ܿ;->᩻:I

    add-int/lit8 v1, v0, 0x1

    .line 741
    iput v1, p0, Ll/۟᩷ܿ;->ܺ:I

    iput v0, p0, Ll/۟᩷ܿ;->֫:I

    goto :goto_3

    .line 709
    :pswitch_f
    iget v0, p0, Ll/۟᩷ܿ;->ܺ:I

    if-lt v0, v7, :cond_1f

    .line 923
    iput v8, p0, Ll/۟᩷ܿ;->ܺ:I

    .line 924
    iput v5, p0, Ll/۟᩷ܿ;->֫:I

    .line 925
    iput v5, p0, Ll/۟᩷ܿ;->᩻:I

    .line 926
    iput v5, p0, Ll/۟᩷ܿ;->۫:I

    .line 927
    iput v5, p0, Ll/۟᩷ܿ;->֡:I

    .line 928
    iput v8, p0, Ll/۟᩷ܿ;->ۘ:I

    goto :goto_3

    .line 713
    :cond_1f
    aget v1, v4, v0

    iget v3, p0, Ll/۟᩷ܿ;->ܳ:I

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    sub-int/2addr v1, v3

    aput v1, v4, v0

    .line 714
    iget v0, p0, Ll/۟᩷ܿ;->ܺ:I

    aget v1, v6, v0

    add-int/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    sub-int/2addr v1, v3

    aput v1, v6, v0

    .line 715
    iget v0, p0, Ll/۟᩷ܿ;->ܺ:I

    add-int/2addr v0, v8

    iput v0, p0, Ll/۟᩷ܿ;->ܺ:I

    .line 675
    :cond_20
    :goto_3
    iget v0, p0, Ll/۟᩷ܿ;->ۘ:I

    const/16 v1, 0xf

    if-ne v0, v1, :cond_21

    :pswitch_10
    return v8

    :cond_21
    return v5

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_10
        :pswitch_0
    .end packed-switch
.end method

.method public final ۧ()Ll/ᩳۢܿ;
    .locals 2

    .line 701
    iget-object v0, p0, Ll/۟᩷ܿ;->᩵:Ll/ᩳۢܿ;

    if-eqz v0, :cond_0

    return-object v0

    .line 702
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Syntax context index is not complete"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
