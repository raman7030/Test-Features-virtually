.class public final Ll/ۨۜۖ;
.super Ll/۟ۜۖ;
.source "J9OT"


# instance fields
.field public ۜ:I

.field public ۡ:I

.field public ۢ:I

.field public ܳ:I

.field public final ܿ:[B

.field public ᩷:I

.field public ᩻:I


# direct methods
.method public constructor <init>(ZII[B)V
    .locals 0

    const/4 p1, 0x0

    .line 589
    invoke-direct {p0, p1}, Ll/۟ۜۖ;-><init>(I)V

    const p1, 0x7fffffff

    .line 587
    iput p1, p0, Ll/ۨۜۖ;->᩻:I

    .line 590
    iput-object p4, p0, Ll/ۨۜۖ;->ܿ:[B

    add-int/2addr p3, p2

    .line 591
    iput p3, p0, Ll/ۨۜۖ;->᩷:I

    .line 592
    iput p2, p0, Ll/ۨۜۖ;->ۢ:I

    .line 593
    iput p2, p0, Ll/ۨۜۖ;->ۡ:I

    return-void
.end method

.method private ۫()V
    .locals 3

    .line 1178
    iget v0, p0, Ll/ۨۜۖ;->᩷:I

    iget v1, p0, Ll/ۨۜۖ;->ܳ:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/ۨۜۖ;->᩷:I

    .line 1179
    iget v1, p0, Ll/ۨۜۖ;->ۡ:I

    sub-int v1, v0, v1

    .line 1180
    iget v2, p0, Ll/ۨۜۖ;->᩻:I

    if-le v1, v2, :cond_0

    sub-int/2addr v1, v2

    .line 1182
    iput v1, p0, Ll/ۨۜۖ;->ܳ:I

    sub-int/2addr v0, v1

    .line 1183
    iput v0, p0, Ll/ۨۜۖ;->᩷:I

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1185
    iput v0, p0, Ll/ۨۜۖ;->ܳ:I

    return-void
.end method


# virtual methods
.method public final ֡()I
    .locals 1

    .line 946
    invoke-virtual {p0}, Ll/ۨۜۖ;->ۘ()I

    move-result v0

    invoke-static {v0}, Ll/۟ۜۖ;->ܿ(I)I

    move-result v0

    return v0
.end method

.method public final ֨()Ljava/lang/String;
    .locals 5

    .line 767
    invoke-virtual {p0}, Ll/ۨۜۖ;->ۘ()I

    move-result v0

    if-lez v0, :cond_0

    .line 768
    iget v1, p0, Ll/ۨۜۖ;->᩷:I

    iget v2, p0, Ll/ۨۜۖ;->ۢ:I

    sub-int/2addr v1, v2

    if-gt v0, v1, :cond_0

    .line 771
    new-instance v1, Ljava/lang/String;

    iget-object v3, p0, Ll/ۨۜۖ;->ܿ:[B

    sget-object v4, Ll/ܰᩴۖ;->ܽ:Ljava/nio/charset/Charset;

    invoke-direct {v1, v3, v2, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 772
    iget v2, p0, Ll/ۨۜۖ;->ۢ:I

    add-int/2addr v2, v0

    iput v2, p0, Ll/ۨۜۖ;->ۢ:I

    return-object v1

    :cond_0
    if-nez v0, :cond_1

    const-string v0, ""

    return-object v0

    :cond_1
    if-gez v0, :cond_2

    .line 780
    invoke-static {}, Ll/֫᩵ۖ;->᩻()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0

    .line 782
    :cond_2
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0
.end method

.method public final ֫(Ll/۫֡ۖ;Ll/ᩳۘۖ;)Ll/ۡ֡ۖ;
    .locals 2

    .line 857
    invoke-virtual {p0}, Ll/ۨۜۖ;->ۘ()I

    move-result v0

    .line 858
    invoke-virtual {p0}, Ll/۟ۜۖ;->֫()V

    .line 859
    invoke-virtual {p0, v0}, Ll/ۨۜۖ;->ܽ(I)I

    move-result v0

    .line 860
    iget v1, p0, Ll/۟ۜۖ;->֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/۟ۜۖ;->֫:I

    .line 861
    invoke-interface {p1, p0, p2}, Ll/۫֡ۖ;->parsePartialFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۡ֡ۖ;

    const/4 p2, 0x0

    .line 862
    invoke-virtual {p0, p2}, Ll/ۨۜۖ;->֫(I)V

    .line 863
    iget p2, p0, Ll/۟ۜۖ;->֫:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p0, Ll/۟ۜۖ;->֫:I

    .line 864
    invoke-virtual {p0}, Ll/ۨۜۖ;->ۧ()I

    move-result p2

    if-nez p2, :cond_0

    .line 867
    invoke-virtual {p0, v0}, Ll/ۨۜۖ;->ۧ(I)V

    return-object p1

    .line 865
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1
.end method

.method public final ֫(I)V
    .locals 1

    .line 615
    iget v0, p0, Ll/ۨۜۖ;->ۜ:I

    if-ne v0, p1, :cond_0

    return-void

    .line 616
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->ۧ()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1
.end method

.method public final ֫(ILl/ۢ֡ۖ;Ll/ᩳۘۖ;)V
    .locals 1

    .line 809
    invoke-virtual {p0}, Ll/۟ۜۖ;->֫()V

    .line 810
    iget v0, p0, Ll/۟ۜۖ;->֫:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/۟ۜۖ;->֫:I

    .line 811
    invoke-interface {p2, p0, p3}, Ll/ۢ֡ۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x4

    .line 812
    invoke-virtual {p0, p1}, Ll/ۨۜۖ;->֫(I)V

    .line 813
    iget p1, p0, Ll/۟ۜۖ;->֫:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/۟ۜۖ;->֫:I

    return-void
.end method

.method public final ֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V
    .locals 2

    .line 841
    invoke-virtual {p0}, Ll/ۨۜۖ;->ۘ()I

    move-result v0

    .line 842
    invoke-virtual {p0}, Ll/۟ۜۖ;->֫()V

    .line 843
    invoke-virtual {p0, v0}, Ll/ۨۜۖ;->ܽ(I)I

    move-result v0

    .line 844
    iget v1, p0, Ll/۟ۜۖ;->֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/۟ۜۖ;->֫:I

    .line 845
    invoke-interface {p1, p0, p2}, Ll/ۢ֡ۖ;->mergeFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/ۢ֡ۖ;

    const/4 p1, 0x0

    .line 846
    invoke-virtual {p0, p1}, Ll/ۨۜۖ;->֫(I)V

    .line 847
    iget p1, p0, Ll/۟ۜۖ;->֫:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/۟ۜۖ;->֫:I

    .line 848
    invoke-virtual {p0}, Ll/ۨۜۖ;->ۧ()I

    move-result p1

    if-nez p1, :cond_0

    .line 851
    invoke-virtual {p0, v0}, Ll/ۨۜۖ;->ۧ(I)V

    return-void

    .line 849
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1
.end method

.method public final ۖ()J
    .locals 2

    .line 742
    invoke-virtual {p0}, Ll/ۨۜۖ;->ۗ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۗ()J
    .locals 12

    .line 1040
    iget v0, p0, Ll/ۨۜۖ;->ۢ:I

    .line 1042
    iget v1, p0, Ll/ۨۜۖ;->᩷:I

    if-ne v1, v0, :cond_0

    goto/16 :goto_3

    :cond_0
    add-int/lit8 v2, v0, 0x1

    .line 1049
    iget-object v3, p0, Ll/ۨۜۖ;->ܿ:[B

    aget-byte v4, v3, v0

    if-ltz v4, :cond_1

    .line 1050
    iput v2, p0, Ll/ۨۜۖ;->ۢ:I

    int-to-long v0, v4

    return-wide v0

    :cond_1
    sub-int/2addr v1, v2

    const/16 v5, 0x9

    if-ge v1, v5, :cond_2

    goto/16 :goto_3

    :cond_2
    add-int/lit8 v1, v0, 0x2

    .line 1054
    aget-byte v2, v3, v2

    shl-int/lit8 v2, v2, 0x7

    xor-int/2addr v2, v4

    if-gez v2, :cond_3

    xor-int/lit8 v0, v2, -0x80

    int-to-long v2, v0

    goto/16 :goto_4

    :cond_3
    add-int/lit8 v4, v0, 0x3

    .line 1056
    aget-byte v1, v3, v1

    shl-int/lit8 v1, v1, 0xe

    xor-int/2addr v1, v2

    if-ltz v1, :cond_4

    xor-int/lit16 v0, v1, 0x3f80

    int-to-long v2, v0

    move v1, v4

    goto/16 :goto_4

    :cond_4
    add-int/lit8 v2, v0, 0x4

    .line 1058
    aget-byte v4, v3, v4

    shl-int/lit8 v4, v4, 0x15

    xor-int/2addr v1, v4

    if-gez v1, :cond_5

    const v0, -0x1fc080

    xor-int/2addr v0, v1

    int-to-long v0, v0

    :goto_0
    move-wide v10, v0

    move v1, v2

    move-wide v2, v10

    goto/16 :goto_4

    :cond_5
    int-to-long v4, v1

    add-int/lit8 v1, v0, 0x5

    .line 1060
    aget-byte v2, v3, v2

    int-to-long v6, v2

    const/16 v2, 0x1c

    shl-long/2addr v6, v2

    xor-long/2addr v4, v6

    const-wide/16 v6, 0x0

    cmp-long v2, v4, v6

    if-ltz v2, :cond_6

    const-wide/32 v2, 0xfe03f80

    goto :goto_1

    :cond_6
    add-int/lit8 v2, v0, 0x6

    .line 1062
    aget-byte v1, v3, v1

    int-to-long v8, v1

    const/16 v1, 0x23

    shl-long/2addr v8, v1

    xor-long/2addr v4, v8

    cmp-long v1, v4, v6

    if-gez v1, :cond_7

    const-wide v0, -0x7f01fc080L

    goto :goto_2

    :cond_7
    add-int/lit8 v1, v0, 0x7

    .line 1064
    aget-byte v2, v3, v2

    int-to-long v8, v2

    const/16 v2, 0x2a

    shl-long/2addr v8, v2

    xor-long/2addr v4, v8

    cmp-long v2, v4, v6

    if-ltz v2, :cond_8

    const-wide v2, 0x3f80fe03f80L

    :goto_1
    xor-long/2addr v2, v4

    goto :goto_4

    :cond_8
    add-int/lit8 v2, v0, 0x8

    .line 1066
    aget-byte v1, v3, v1

    int-to-long v8, v1

    const/16 v1, 0x31

    shl-long/2addr v8, v1

    xor-long/2addr v4, v8

    cmp-long v1, v4, v6

    if-gez v1, :cond_9

    const-wide v0, -0x1fc07f01fc080L

    :goto_2
    xor-long/2addr v0, v4

    goto :goto_0

    :cond_9
    add-int/lit8 v1, v0, 0x9

    .line 1076
    aget-byte v2, v3, v2

    int-to-long v8, v2

    const/16 v2, 0x38

    shl-long/2addr v8, v2

    xor-long/2addr v4, v8

    const-wide v8, 0xfe03f80fe03f80L

    xor-long/2addr v4, v8

    cmp-long v2, v4, v6

    if-gez v2, :cond_b

    add-int/lit8 v0, v0, 0xa

    .line 1087
    aget-byte v1, v3, v1

    int-to-long v1, v1

    cmp-long v3, v1, v6

    if-gez v3, :cond_a

    .line 1095
    :goto_3
    invoke-virtual {p0}, Ll/ۨۜۖ;->۬()J

    move-result-wide v0

    return-wide v0

    :cond_a
    move v1, v0

    :cond_b
    move-wide v2, v4

    .line 1092
    :goto_4
    iput v1, p0, Ll/ۨۜۖ;->ۢ:I

    return-wide v2
.end method

.method public final ۘ()I
    .locals 7

    .line 961
    iget v0, p0, Ll/ۨۜۖ;->ۢ:I

    .line 963
    iget v1, p0, Ll/ۨۜۖ;->᩷:I

    if-ne v1, v0, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v2, v0, 0x1

    .line 969
    iget-object v3, p0, Ll/ۨۜۖ;->ܿ:[B

    aget-byte v4, v3, v0

    if-ltz v4, :cond_1

    .line 970
    iput v2, p0, Ll/ۨۜۖ;->ۢ:I

    return v4

    :cond_1
    sub-int/2addr v1, v2

    const/16 v5, 0x9

    if-ge v1, v5, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v1, v0, 0x2

    .line 974
    aget-byte v2, v3, v2

    shl-int/lit8 v2, v2, 0x7

    xor-int/2addr v2, v4

    if-gez v2, :cond_3

    xor-int/lit8 v0, v2, -0x80

    goto :goto_3

    :cond_3
    add-int/lit8 v4, v0, 0x3

    .line 976
    aget-byte v1, v3, v1

    shl-int/lit8 v1, v1, 0xe

    xor-int/2addr v1, v2

    if-ltz v1, :cond_4

    xor-int/lit16 v0, v1, 0x3f80

    :goto_0
    move v1, v4

    goto :goto_3

    :cond_4
    add-int/lit8 v2, v0, 0x4

    .line 978
    aget-byte v4, v3, v4

    shl-int/lit8 v4, v4, 0x15

    xor-int/2addr v1, v4

    if-gez v1, :cond_5

    const v0, -0x1fc080

    xor-int/2addr v0, v1

    :goto_1
    move v1, v2

    goto :goto_3

    :cond_5
    add-int/lit8 v4, v0, 0x5

    .line 981
    aget-byte v2, v3, v2

    shl-int/lit8 v5, v2, 0x1c

    xor-int/2addr v1, v5

    const v5, 0xfe03f80

    xor-int/2addr v1, v5

    if-gez v2, :cond_8

    add-int/lit8 v2, v0, 0x6

    .line 984
    aget-byte v4, v3, v4

    if-gez v4, :cond_7

    add-int/lit8 v4, v0, 0x7

    aget-byte v2, v3, v2

    if-gez v2, :cond_8

    add-int/lit8 v2, v0, 0x8

    aget-byte v4, v3, v4

    if-gez v4, :cond_7

    add-int/lit8 v4, v0, 0x9

    aget-byte v2, v3, v2

    if-gez v2, :cond_8

    add-int/lit8 v0, v0, 0xa

    aget-byte v2, v3, v4

    if-gez v2, :cond_6

    .line 996
    :goto_2
    invoke-virtual {p0}, Ll/ۨۜۖ;->۬()J

    move-result-wide v0

    long-to-int v1, v0

    return v1

    :cond_6
    move v6, v1

    move v1, v0

    move v0, v6

    goto :goto_3

    :cond_7
    move v0, v1

    goto :goto_1

    :cond_8
    move v0, v1

    goto :goto_0

    .line 993
    :goto_3
    iput v1, p0, Ll/ۨۜۖ;->ۢ:I

    return v0
.end method

.method public final ۙ()J
    .locals 9

    .line 1129
    iget v0, p0, Ll/ۨۜۖ;->ۢ:I

    .line 1131
    iget v1, p0, Ll/ۨۜۖ;->᩷:I

    sub-int/2addr v1, v0

    const/16 v2, 0x8

    if-lt v1, v2, :cond_0

    add-int/lit8 v1, v0, 0x8

    .line 1136
    iput v1, p0, Ll/ۨۜۖ;->ۢ:I

    .line 1137
    iget-object v1, p0, Ll/ۨۜۖ;->ܿ:[B

    aget-byte v3, v1, v0

    int-to-long v3, v3

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    add-int/lit8 v7, v0, 0x1

    aget-byte v7, v1, v7

    int-to-long v7, v7

    and-long/2addr v7, v5

    shl-long/2addr v7, v2

    or-long v2, v3, v7

    add-int/lit8 v4, v0, 0x2

    aget-byte v4, v1, v4

    int-to-long v7, v4

    and-long/2addr v7, v5

    const/16 v4, 0x10

    shl-long/2addr v7, v4

    or-long/2addr v2, v7

    add-int/lit8 v4, v0, 0x3

    aget-byte v4, v1, v4

    int-to-long v7, v4

    and-long/2addr v7, v5

    const/16 v4, 0x18

    shl-long/2addr v7, v4

    or-long/2addr v2, v7

    add-int/lit8 v4, v0, 0x4

    aget-byte v4, v1, v4

    int-to-long v7, v4

    and-long/2addr v7, v5

    const/16 v4, 0x20

    shl-long/2addr v7, v4

    or-long/2addr v2, v7

    add-int/lit8 v4, v0, 0x5

    aget-byte v4, v1, v4

    int-to-long v7, v4

    and-long/2addr v7, v5

    const/16 v4, 0x28

    shl-long/2addr v7, v4

    or-long/2addr v2, v7

    add-int/lit8 v4, v0, 0x6

    aget-byte v4, v1, v4

    int-to-long v7, v4

    and-long/2addr v7, v5

    const/16 v4, 0x30

    shl-long/2addr v7, v4

    or-long/2addr v2, v7

    add-int/lit8 v0, v0, 0x7

    aget-byte v0, v1, v0

    int-to-long v0, v0

    and-long/2addr v0, v5

    const/16 v4, 0x38

    shl-long/2addr v0, v4

    or-long/2addr v0, v2

    return-wide v0

    .line 1132
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0
.end method

.method public final ۚ()J
    .locals 2

    .line 951
    invoke-virtual {p0}, Ll/ۨۜۖ;->ۗ()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/۟ۜۖ;->֫(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۜ()I
    .locals 1

    .line 931
    invoke-virtual {p0}, Ll/ۨۜۖ;->ۘ()I

    move-result v0

    return v0
.end method

.method public final ۠()Ljava/lang/String;
    .locals 3

    .line 787
    invoke-virtual {p0}, Ll/ۨۜۖ;->ۘ()I

    move-result v0

    if-lez v0, :cond_0

    .line 788
    iget v1, p0, Ll/ۨۜۖ;->᩷:I

    iget v2, p0, Ll/ۨۜۖ;->ۢ:I

    sub-int/2addr v1, v2

    if-gt v0, v1, :cond_0

    .line 789
    iget-object v1, p0, Ll/ۨۜۖ;->ܿ:[B

    invoke-static {v2, v0, v1}, Ll/۫֨ۖ;->ۧ(II[B)Ljava/lang/String;

    move-result-object v1

    .line 790
    iget v2, p0, Ll/ۨۜۖ;->ۢ:I

    add-int/2addr v2, v0

    iput v2, p0, Ll/ۨۜۖ;->ۢ:I

    return-object v1

    :cond_0
    if-nez v0, :cond_1

    const-string v0, ""

    return-object v0

    :cond_1
    if-gtz v0, :cond_2

    .line 798
    invoke-static {}, Ll/֫᩵ۖ;->᩻()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0

    .line 800
    :cond_2
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0
.end method

.method public final ۡ()F
    .locals 1

    .line 732
    invoke-virtual {p0}, Ll/ۨۜۖ;->᩶()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    return v0
.end method

.method public final ۢ()J
    .locals 2

    .line 752
    invoke-virtual {p0}, Ll/ۨۜۖ;->ۙ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ()I
    .locals 2

    .line 1197
    iget v0, p0, Ll/ۨۜۖ;->᩻:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    const/4 v0, -0x1

    return v0

    .line 1201
    :cond_0
    invoke-virtual {p0}, Ll/ۨۜۖ;->ܽ()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final ۧ(I)V
    .locals 0

    .line 1191
    iput p1, p0, Ll/ۨۜۖ;->᩻:I

    .line 1192
    invoke-direct {p0}, Ll/ۨۜۖ;->۫()V

    return-void
.end method

.method public final ۬()J
    .locals 6

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x40

    if-ge v2, v3, :cond_2

    .line 1216
    iget v3, p0, Ll/ۨۜۖ;->ۢ:I

    iget v4, p0, Ll/ۨۜۖ;->᩷:I

    if-eq v3, v4, :cond_1

    add-int/lit8 v4, v3, 0x1

    .line 1219
    iput v4, p0, Ll/ۨۜۖ;->ۢ:I

    iget-object v4, p0, Ll/ۨۜۖ;->ܿ:[B

    aget-byte v3, v4, v3

    and-int/lit8 v4, v3, 0x7f

    int-to-long v4, v4

    shl-long/2addr v4, v2

    or-long/2addr v0, v4

    and-int/lit16 v3, v3, 0x80

    if-nez v3, :cond_0

    return-wide v0

    :cond_0
    add-int/lit8 v2, v2, 0x7

    goto :goto_0

    .line 1217
    :cond_1
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0

    .line 1108
    :cond_2
    invoke-static {}, Ll/֫᩵ۖ;->ܳ()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0
.end method

.method public final ܳ()Ll/ۛۜۖ;
    .locals 4

    .line 873
    invoke-virtual {p0}, Ll/ۨۜۖ;->ۘ()I

    move-result v0

    .line 874
    iget-object v1, p0, Ll/ۨۜۖ;->ܿ:[B

    if-lez v0, :cond_0

    iget v2, p0, Ll/ۨۜۖ;->᩷:I

    iget v3, p0, Ll/ۨۜۖ;->ۢ:I

    sub-int/2addr v2, v3

    if-gt v0, v2, :cond_0

    .line 880
    invoke-static {v3, v0, v1}, Ll/ۛۜۖ;->֫(II[B)Ll/ۛۜۖ;

    move-result-object v1

    .line 881
    iget v2, p0, Ll/ۨۜۖ;->ۢ:I

    add-int/2addr v2, v0

    iput v2, p0, Ll/ۨۜۖ;->ۢ:I

    return-object v1

    :cond_0
    if-nez v0, :cond_1

    .line 885
    sget-object v0, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    return-object v0

    :cond_1
    if-lez v0, :cond_2

    .line 1224
    iget v2, p0, Ll/ۨۜۖ;->᩷:I

    iget v3, p0, Ll/ۨۜۖ;->ۢ:I

    sub-int/2addr v2, v3

    if-gt v0, v2, :cond_2

    add-int/2addr v0, v3

    .line 1226
    iput v0, p0, Ll/ۨۜۖ;->ۢ:I

    .line 1227
    invoke-static {v1, v3, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v0

    goto :goto_0

    :cond_2
    if-gtz v0, :cond_4

    if-nez v0, :cond_3

    .line 1232
    sget-object v0, Ll/ܰᩴۖ;->֫:[B

    .line 888
    :goto_0
    sget-object v1, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    .line 439
    new-instance v1, Ll/۫ۜۖ;

    invoke-direct {v1, v0}, Ll/۫ۜۖ;-><init>([B)V

    return-object v1

    .line 1234
    :cond_3
    invoke-static {}, Ll/֫᩵ۖ;->᩻()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0

    .line 1237
    :cond_4
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0
.end method

.method public final ܳ(I)V
    .locals 2

    if-ltz p1, :cond_0

    .line 1242
    iget v0, p0, Ll/ۨۜۖ;->᩷:I

    iget v1, p0, Ll/ۨۜۖ;->ۢ:I

    sub-int/2addr v0, v1

    if-gt p1, v0, :cond_0

    add-int/2addr v1, p1

    .line 1244
    iput v1, p0, Ll/ۨۜۖ;->ۢ:I

    return-void

    :cond_0
    if-gez p1, :cond_1

    .line 1249
    invoke-static {}, Ll/֫᩵ۖ;->᩻()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1

    .line 1251
    :cond_1
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1
.end method

.method public final ܶ()I
    .locals 2

    .line 599
    invoke-virtual {p0}, Ll/ۨۜۖ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 600
    iput v0, p0, Ll/ۨۜۖ;->ۜ:I

    return v0

    .line 604
    :cond_0
    invoke-virtual {p0}, Ll/ۨۜۖ;->ۘ()I

    move-result v0

    iput v0, p0, Ll/ۨۜۖ;->ۜ:I

    ushr-int/lit8 v1, v0, 0x3

    if-eqz v1, :cond_1

    return v0

    .line 608
    :cond_1
    invoke-static {}, Ll/֫᩵ۖ;->ܽ()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0
.end method

.method public final ܺ()I
    .locals 1

    .line 747
    invoke-virtual {p0}, Ll/ۨۜۖ;->ۘ()I

    move-result v0

    return v0
.end method

.method public final ܽ()I
    .locals 2

    .line 1211
    iget v0, p0, Ll/ۨۜۖ;->ۢ:I

    iget v1, p0, Ll/ۨۜۖ;->ۡ:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final ܽ(I)I
    .locals 1

    if-ltz p1, :cond_2

    .line 1162
    invoke-virtual {p0}, Ll/ۨۜۖ;->ܽ()I

    move-result v0

    add-int/2addr p1, v0

    if-ltz p1, :cond_1

    .line 1166
    iget v0, p0, Ll/ۨۜۖ;->᩻:I

    if-gt p1, v0, :cond_0

    .line 1170
    iput p1, p0, Ll/ۨۜۖ;->᩻:I

    .line 1172
    invoke-direct {p0}, Ll/ۨۜۖ;->۫()V

    return v0

    .line 1168
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1

    .line 1164
    :cond_1
    invoke-static {}, Ll/֫᩵ۖ;->ۜ()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1

    .line 1160
    :cond_2
    invoke-static {}, Ll/֫᩵ۖ;->᩻()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1
.end method

.method public final ܿ()Z
    .locals 5

    .line 762
    invoke-virtual {p0}, Ll/ۨۜۖ;->ۗ()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Z
    .locals 2

    .line 1206
    iget v0, p0, Ll/ۨۜۖ;->ۢ:I

    iget v1, p0, Ll/ۨۜۖ;->᩷:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ(I)Z
    .locals 5

    and-int/lit8 v0, p1, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_6

    if-eq v0, v2, :cond_5

    const/4 v3, 0x2

    if-eq v0, v3, :cond_4

    const/4 v3, 0x4

    const/4 v4, 0x3

    if-eq v0, v4, :cond_2

    if-eq v0, v3, :cond_1

    const/4 p1, 0x5

    if-ne v0, p1, :cond_0

    .line 645
    invoke-virtual {p0, v3}, Ll/ۨۜۖ;->ܳ(I)V

    return v2

    .line 648
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->ܿ()Ll/۟ᩴۖ;

    move-result-object p1

    throw p1

    :cond_1
    return v1

    .line 706
    :cond_2
    invoke-virtual {p0}, Ll/ۨۜۖ;->ܶ()I

    move-result v0

    if-eqz v0, :cond_3

    .line 707
    invoke-virtual {p0, v0}, Ll/ۨۜۖ;->ᩳ(I)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_3
    ushr-int/2addr p1, v4

    shl-int/2addr p1, v4

    or-int/2addr p1, v3

    .line 639
    invoke-virtual {p0, p1}, Ll/ۨۜۖ;->֫(I)V

    return v2

    .line 635
    :cond_4
    invoke-virtual {p0}, Ll/ۨۜۖ;->ۘ()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۨۜۖ;->ܳ(I)V

    return v2

    :cond_5
    const/16 p1, 0x8

    .line 632
    invoke-virtual {p0, p1}, Ll/ۨۜۖ;->ܳ(I)V

    return v2

    .line 1000
    :cond_6
    iget p1, p0, Ll/ۨۜۖ;->᩷:I

    iget v0, p0, Ll/ۨۜۖ;->ۢ:I

    sub-int/2addr p1, v0

    iget-object v0, p0, Ll/ۨۜۖ;->ܿ:[B

    const/16 v3, 0xa

    if-lt p1, v3, :cond_9

    :goto_0
    if-ge v1, v3, :cond_8

    .line 1009
    iget p1, p0, Ll/ۨۜۖ;->ۢ:I

    add-int/lit8 v4, p1, 0x1

    iput v4, p0, Ll/ۨۜۖ;->ۢ:I

    aget-byte p1, v0, p1

    if-ltz p1, :cond_7

    goto :goto_2

    :cond_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1013
    :cond_8
    invoke-static {}, Ll/֫᩵ۖ;->ܳ()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1

    :cond_9
    :goto_1
    if-ge v1, v3, :cond_c

    .line 1216
    iget p1, p0, Ll/ۨۜۖ;->ۢ:I

    iget v4, p0, Ll/ۨۜۖ;->᩷:I

    if-eq p1, v4, :cond_b

    add-int/lit8 v4, p1, 0x1

    .line 1219
    iput v4, p0, Ll/ۨۜۖ;->ۢ:I

    aget-byte p1, v0, p1

    if-ltz p1, :cond_a

    :goto_2
    return v2

    :cond_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 1217
    :cond_b
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1

    .line 1022
    :cond_c
    invoke-static {}, Ll/֫᩵ۖ;->ܳ()Ll/֫᩵ۖ;

    move-result-object p1

    throw p1
.end method

.method public final ᩴ()I
    .locals 1

    .line 936
    invoke-virtual {p0}, Ll/ۨۜۖ;->᩶()I

    move-result v0

    return v0
.end method

.method public final ᩵()J
    .locals 2

    .line 941
    invoke-virtual {p0}, Ll/ۨۜۖ;->ۙ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩶()I
    .locals 4

    .line 1113
    iget v0, p0, Ll/ۨۜۖ;->ۢ:I

    .line 1115
    iget v1, p0, Ll/ۨۜۖ;->᩷:I

    sub-int/2addr v1, v0

    const/4 v2, 0x4

    if-lt v1, v2, :cond_0

    add-int/lit8 v1, v0, 0x4

    .line 1120
    iput v1, p0, Ll/ۨۜۖ;->ۢ:I

    .line 1121
    iget-object v1, p0, Ll/ۨۜۖ;->ܿ:[B

    aget-byte v2, v1, v0

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v3, v0, 0x1

    aget-byte v3, v1, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v2, v3

    add-int/lit8 v3, v0, 0x2

    aget-byte v3, v1, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x3

    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    or-int/2addr v0, v2

    return v0

    .line 1116
    :cond_0
    invoke-static {}, Ll/֫᩵ۖ;->᩷()Ll/֫᩵ۖ;

    move-result-object v0

    throw v0
.end method

.method public final ᩷()I
    .locals 1

    .line 757
    invoke-virtual {p0}, Ll/ۨۜۖ;->᩶()I

    move-result v0

    return v0
.end method

.method public final ᩸()I
    .locals 1

    .line 926
    invoke-virtual {p0}, Ll/ۨۜۖ;->ۘ()I

    move-result v0

    return v0
.end method

.method public final ᩹()J
    .locals 2

    .line 737
    invoke-virtual {p0}, Ll/ۨۜۖ;->ۗ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩻()D
    .locals 2

    .line 727
    invoke-virtual {p0}, Ll/ۨۜۖ;->ۙ()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method
