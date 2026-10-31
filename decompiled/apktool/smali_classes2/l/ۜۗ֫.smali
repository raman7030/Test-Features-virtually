.class public final Ll/ۜۗ֫;
.super Ljava/lang/Object;
.source "O8RI"


# instance fields
.field public ֡:Z

.field public final ֫:Ll/᩵۬֫;

.field public ۖ:Ll/ܿۗ֫;

.field public ۘ:Ll/ܿۗ֫;

.field public final ۚ:Ll/᩶᩵֫;

.field public ۜ:J

.field public ۡ:Ll/ۖ᩶֫;

.field public ۢ:Ll/ܿۗ֫;

.field public final ۧ:Ll/᩵ۚ֫;

.field public ܳ:J

.field public ܺ:Ljava/util/ArrayList;

.field public ܽ:I

.field public final ܿ:Ll/ᩴۙ֫;

.field public ᩳ:Ll/ܿۗ֫;

.field public ᩴ:Ll/ܿۗ֫;

.field public ᩵:I

.field public final ᩷:Ll/᩹᩵֫;

.field public ᩻:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/᩵۬֫;Ll/᩵ۚ֫;Ll/ᩴۙ֫;)V
    .locals 0

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    iput-object p1, p0, Ll/ۜۗ֫;->֫:Ll/᩵۬֫;

    .line 113
    iput-object p2, p0, Ll/ۜۗ֫;->ۧ:Ll/᩵ۚ֫;

    .line 114
    iput-object p3, p0, Ll/ۜۗ֫;->ܿ:Ll/ᩴۙ֫;

    .line 115
    sget-object p1, Ll/ۖ᩶֫;->֫:Ll/ۖ᩶֫;

    iput-object p1, p0, Ll/ۜۗ֫;->ۡ:Ll/ۖ᩶֫;

    .line 116
    new-instance p1, Ll/᩹᩵֫;

    invoke-direct {p1}, Ll/᩹᩵֫;-><init>()V

    iput-object p1, p0, Ll/ۜۗ֫;->᩷:Ll/᩹᩵֫;

    .line 117
    new-instance p1, Ll/᩶᩵֫;

    invoke-direct {p1}, Ll/᩶᩵֫;-><init>()V

    iput-object p1, p0, Ll/ۜۗ֫;->ۚ:Ll/᩶᩵֫;

    .line 118
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۜۗ֫;->ܺ:Ljava/util/ArrayList;

    return-void
.end method

.method private ֫(Ll/ۙ᩵֫;)I
    .locals 7

    .line 899
    iget-object v0, p0, Ll/ۜۗ֫;->ۢ:Ll/ܿۗ֫;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 903
    :cond_0
    iget-object v1, v0, Ll/ܿۗ֫;->᩵:Ljava/lang/Object;

    invoke-virtual {p1, v1}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    move-result v1

    move v2, v1

    .line 905
    :goto_0
    iget v5, p0, Ll/ۜۗ֫;->᩵:I

    iget-boolean v6, p0, Ll/ۜۗ֫;->֡:Z

    .line 906
    iget-object v3, p0, Ll/ۜۗ֫;->᩷:Ll/᩹᩵֫;

    iget-object v4, p0, Ll/ۜۗ֫;->ۚ:Ll/᩶᩵֫;

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Ll/᩶᩵֫;IZ)I

    move-result v2

    .line 155
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 908
    invoke-virtual {v0}, Ll/ܿۗ֫;->ۧ()Ll/ܿۗ֫;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-boolean v1, v1, Ll/ܳۗ֫;->ܳ:Z

    if-nez v1, :cond_1

    .line 910
    invoke-virtual {v0}, Ll/ܿۗ֫;->ۧ()Ll/ܿۗ֫;

    move-result-object v0

    goto :goto_1

    .line 913
    :cond_1
    invoke-virtual {v0}, Ll/ܿۗ֫;->ۧ()Ll/ܿۗ֫;

    move-result-object v1

    const/4 v3, -0x1

    if-eq v2, v3, :cond_4

    if-nez v1, :cond_2

    goto :goto_2

    .line 917
    :cond_2
    iget-object v3, v1, Ll/ܿۗ֫;->᩵:Ljava/lang/Object;

    invoke-virtual {p1, v3}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    move-result v3

    if-eq v3, v2, :cond_3

    goto :goto_2

    :cond_3
    move-object v0, v1

    goto :goto_0

    .line 927
    :cond_4
    :goto_2
    invoke-virtual {p0, v0}, Ll/ۜۗ֫;->֫(Ll/ܿۗ֫;)I

    move-result v1

    .line 930
    iget-object v2, v0, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    invoke-virtual {p0, p1, v2}, Ll/ۜۗ֫;->֫(Ll/ۙ᩵֫;Ll/ܳۗ֫;)Ll/ܳۗ֫;

    move-result-object p1

    iput-object p1, v0, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    return v1
.end method

.method private ֫(Ljava/lang/Object;)J
    .locals 3

    const/4 v0, 0x0

    .line 864
    :goto_0
    iget-object v1, p0, Ll/ۜۗ֫;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 865
    iget-object v1, p0, Ll/ۜۗ֫;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿۗ֫;

    .line 866
    iget-object v2, v1, Ll/ܿۗ֫;->᩵:Ljava/lang/Object;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 868
    iget-object p1, v1, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-object p1, p1, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    iget-wide v0, p1, Ll/ܺۧۧ;->ܿ:J

    return-wide v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method private ֫(Ll/ۙ᩵֫;Ljava/lang/Object;IIJJZ)Ll/ܳۗ֫;
    .locals 17

    move/from16 v6, p3

    move/from16 v7, p4

    .line 1197
    new-instance v8, Ll/ܺۧۧ;

    move-object v0, v8

    move-object/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    move-wide/from16 v4, p7

    invoke-direct/range {v0 .. v5}, Ll/ܺۧۧ;-><init>(Ljava/lang/Object;IIJ)V

    move-object/from16 v15, p0

    .line 1201
    iget-object v0, v15, Ll/ۜۗ֫;->᩷:Ll/᩹᩵֫;

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-virtual {v1, v2, v0}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    move-result-object v1

    .line 1202
    invoke-virtual {v1, v6, v7}, Ll/᩹᩵֫;->֫(II)J

    move-result-wide v9

    .line 1204
    invoke-virtual {v0, v6}, Ll/᩹᩵֫;->ۧ(I)I

    move-result v1

    if-ne v7, v1, :cond_0

    .line 848
    iget-object v1, v0, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1208
    :cond_0
    invoke-virtual {v0, v6}, Ll/᩹᩵֫;->ᩳ(I)Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v2, 0x0

    cmp-long v4, v9, v0

    if-eqz v4, :cond_1

    cmp-long v0, v2, v9

    if-ltz v0, :cond_1

    const-wide/16 v0, 0x1

    sub-long v0, v9, v0

    .line 1211
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    move-wide v2, v0

    .line 1213
    :cond_1
    new-instance v16, Ll/ܳۗ֫;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v0, v16

    move-object v1, v8

    move-wide/from16 v4, p5

    move-wide v8, v9

    move/from16 v10, p9

    invoke-direct/range {v0 .. v14}, Ll/ܳۗ֫;-><init>(Ll/ܺۧۧ;JJJJZZZZZ)V

    return-object v16
.end method

.method private ֫(Ll/ۙ᩵֫;Ljava/lang/Object;JJJZ)Ll/ܳۗ֫;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-wide/from16 v3, p3

    .line 1233
    iget-object v5, v0, Ll/ۜۗ֫;->᩷:Ll/᩹᩵֫;

    invoke-virtual {v1, v2, v5}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    .line 1234
    invoke-virtual {v5, v3, v4}, Ll/᩹᩵֫;->֫(J)I

    move-result v6

    const/4 v7, 0x0

    const/4 v8, -0x1

    if-ne v6, v8, :cond_0

    .line 704
    iget-object v9, v5, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    iget v9, v9, Ll/۟ۘ֫;->֫:I

    if-lez v9, :cond_1

    .line 1240
    invoke-virtual {v5, v7}, Ll/᩹᩵֫;->ᩳ(I)Z

    goto :goto_0

    .line 1241
    :cond_0
    invoke-virtual {v5, v6}, Ll/᩹᩵֫;->ᩳ(I)Z

    .line 1249
    :cond_1
    :goto_0
    new-instance v11, Ll/ܺۧۧ;

    move-wide/from16 v9, p7

    invoke-direct {v11, v6, v9, v10, v2}, Ll/ܺۧۧ;-><init>(IJLjava/lang/Object;)V

    .line 1288
    invoke-virtual {v11}, Ll/ܺۧۧ;->֫()Z

    move-result v2

    const/4 v9, 0x1

    if-nez v2, :cond_2

    if-ne v6, v8, :cond_2

    const/4 v7, 0x1

    .line 1251
    :cond_2
    invoke-direct {v0, v1, v11}, Ll/ۜۗ֫;->֫(Ll/ۙ᩵֫;Ll/ܺۧۧ;)Z

    move-result v23

    .line 1252
    invoke-direct {v0, v1, v11, v7}, Ll/ۜۗ֫;->֫(Ll/ۙ᩵֫;Ll/ܺۧۧ;Z)Z

    move-result v24

    if-eq v6, v8, :cond_3

    .line 1255
    invoke-virtual {v5, v6}, Ll/᩹᩵֫;->ᩳ(I)Z

    :cond_3
    if-eq v6, v8, :cond_4

    .line 1259
    invoke-virtual {v5, v6}, Ll/᩹᩵֫;->ܽ(I)Z

    :cond_4
    const-wide/16 v1, 0x0

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    if-eq v6, v8, :cond_5

    .line 1263
    invoke-virtual {v5, v6}, Ll/᩹᩵֫;->֫(I)J

    move-wide/from16 v16, v1

    goto :goto_1

    :cond_5
    move-wide/from16 v16, v12

    :goto_1
    cmp-long v6, v16, v12

    if-eqz v6, :cond_7

    const-wide/high16 v14, -0x8000000000000000L

    cmp-long v6, v16, v14

    if-nez v6, :cond_6

    goto :goto_2

    :cond_6
    move-wide/from16 v18, v16

    goto :goto_3

    .line 1267
    :cond_7
    :goto_2
    iget-wide v5, v5, Ll/᩹᩵֫;->ۧ:J

    move-wide/from16 v18, v5

    :goto_3
    cmp-long v5, v18, v12

    if-eqz v5, :cond_8

    cmp-long v5, v3, v18

    if-ltz v5, :cond_8

    int-to-long v3, v9

    sub-long v3, v18, v3

    .line 1272
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    move-wide v12, v1

    goto :goto_4

    :cond_8
    move-wide v12, v3

    .line 1274
    :goto_4
    new-instance v1, Ll/ܳۗ֫;

    const/16 v21, 0x0

    move-object v10, v1

    move-wide/from16 v14, p5

    move/from16 v20, p9

    move/from16 v22, v7

    invoke-direct/range {v10 .. v24}, Ll/ܳۗ֫;-><init>(Ll/ܺۧۧ;JJJJZZZZZ)V

    return-object v1
.end method

.method private ֫(Ll/ۙ᩵֫;Ll/ܺۧۧ;JJ)Ll/ܳۗ֫;
    .locals 13

    move-object v0, p2

    .line 1168
    iget-object v1, v0, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    move-object v12, p0

    iget-object v2, v12, Ll/ۜۗ֫;->᩷:Ll/᩹᩵֫;

    move-object v3, p1

    invoke-virtual {p1, v1, v2}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    .line 1169
    invoke-virtual {p2}, Ll/ܺۧۧ;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1170
    iget-object v4, v0, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget v5, v0, Ll/ܺۧۧ;->֫:I

    iget v6, v0, Ll/ܺۧۧ;->ۧ:I

    iget-wide v9, v0, Ll/ܺۧۧ;->ܿ:J

    const/4 v11, 0x0

    move-object v2, p0

    move-object v3, p1

    move-wide/from16 v7, p3

    invoke-direct/range {v2 .. v11}, Ll/ۜۗ֫;->֫(Ll/ۙ᩵֫;Ljava/lang/Object;IIJJZ)Ll/ܳۗ֫;

    move-result-object v0

    return-object v0

    .line 1179
    :cond_0
    iget-object v4, v0, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget-wide v9, v0, Ll/ܺۧۧ;->ܿ:J

    const/4 v11, 0x0

    move-object v2, p0

    move-object v3, p1

    move-wide/from16 v5, p5

    move-wide/from16 v7, p3

    invoke-direct/range {v2 .. v11}, Ll/ۜۗ֫;->֫(Ll/ۙ᩵֫;Ljava/lang/Object;JJJZ)Ll/ܳۗ֫;

    move-result-object v0

    return-object v0
.end method

.method private ֫(Ll/ۙ᩵֫;Ll/ܿۗ֫;J)Ll/ܳۗ֫;
    .locals 21

    move-object/from16 v10, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    .line 964
    iget-object v0, v9, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    .line 969
    invoke-virtual/range {p2 .. p2}, Ll/ܿۗ֫;->ܽ()J

    move-result-wide v1

    iget-wide v3, v0, Ll/ܳۗ֫;->֫:J

    add-long/2addr v1, v3

    sub-long v6, v1, p3

    .line 970
    iget-boolean v0, v0, Ll/ܳۗ֫;->ܳ:Z

    if-eqz v0, :cond_6

    .line 990
    iget-object v0, v9, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    .line 991
    iget-object v11, v0, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    iget-wide v12, v0, Ll/ܳۗ֫;->᩷:J

    iget-object v0, v11, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    invoke-virtual {v8, v0}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    move-result v1

    .line 992
    iget v4, v10, Ll/ۜۗ֫;->᩵:I

    iget-boolean v5, v10, Ll/ۜۗ֫;->֡:Z

    .line 993
    iget-object v2, v10, Ll/ۜۗ֫;->᩷:Ll/᩹᩵֫;

    iget-object v3, v10, Ll/ۜۗ֫;->ۚ:Ll/᩶᩵֫;

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v5}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Ll/᩶᩵֫;IZ)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 1002
    :cond_0
    iget-object v14, v10, Ll/ۜۗ֫;->᩷:Ll/᩹᩵֫;

    const/4 v1, 0x1

    invoke-virtual {v8, v0, v14, v1}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;

    move-result-object v1

    iget v3, v1, Ll/᩹᩵֫;->᩻:I

    .line 1003
    iget-object v1, v14, Ll/᩹᩵֫;->ܳ:Ljava/lang/Object;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1004
    iget-wide v4, v11, Ll/ܺۧۧ;->ܿ:J

    .line 1005
    iget-object v2, v10, Ll/ۜۗ֫;->ۚ:Ll/᩶᩵֫;

    move-wide/from16 p3, v4

    const-wide/16 v4, 0x0

    .line 1097
    invoke-virtual {v8, v3, v2, v4, v5}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object v2

    .line 1005
    iget v2, v2, Ll/᩶᩵֫;->ᩳ:I

    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    if-ne v2, v0, :cond_4

    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 1017
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    .line 1012
    iget-object v1, v10, Ll/ۜۗ֫;->ۚ:Ll/᩶᩵֫;

    iget-object v2, v10, Ll/ۜۗ֫;->᩷:Ll/᩹᩵֫;

    move-object/from16 v0, p1

    move-wide/from16 v4, v17

    invoke-virtual/range {v0 .. v7}, Ll/ۙ᩵֫;->֫(Ll/᩶᩵֫;Ll/᩹᩵֫;IJJ)Landroid/util/Pair;

    move-result-object v0

    if-nez v0, :cond_1

    :goto_0
    const/4 v0, 0x0

    goto/16 :goto_3

    .line 1021
    :cond_1
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1022
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 1023
    invoke-virtual/range {p2 .. p2}, Ll/ܿۗ֫;->ۧ()Ll/ܿۗ֫;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1024
    iget-object v4, v0, Ll/ܿۗ֫;->᩵:Ljava/lang/Object;

    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1025
    iget-object v0, v0, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-object v0, v0, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    iget-wide v4, v0, Ll/ܺۧۧ;->ܿ:J

    goto :goto_1

    .line 1028
    :cond_2
    invoke-direct {v10, v1}, Ll/ۜۗ֫;->֫(Ljava/lang/Object;)J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_3

    .line 1031
    iget-wide v4, v10, Ll/ۜۗ֫;->ܳ:J

    const-wide/16 v6, 0x1

    add-long/2addr v6, v4

    iput-wide v6, v10, Ll/ۜۗ֫;->ܳ:J

    :cond_3
    :goto_1
    move-wide/from16 v19, v2

    move-wide/from16 v17, v15

    goto :goto_2

    :cond_4
    move-wide/from16 v17, v4

    move-wide/from16 v19, v17

    move-wide/from16 v4, p3

    .line 1037
    :goto_2
    iget-object v6, v10, Ll/ۜۗ֫;->ۚ:Ll/᩶᩵֫;

    iget-object v7, v10, Ll/ۜۗ֫;->᩷:Ll/᩹᩵֫;

    move-object/from16 v0, p1

    move-wide/from16 v2, v19

    .line 1038
    invoke-static/range {v0 .. v7}, Ll/ۜۗ֫;->֫(Ll/ۙ᩵֫;Ljava/lang/Object;JJLl/᩶᩵֫;Ll/᩹᩵֫;)Ll/ܺۧۧ;

    move-result-object v2

    cmp-long v0, v17, v15

    if-eqz v0, :cond_5

    cmp-long v0, v12, v15

    if-eqz v0, :cond_5

    .line 1042
    iget-object v0, v11, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    .line 1159
    invoke-virtual {v8, v0, v14}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    move-result-object v0

    .line 704
    iget-object v0, v0, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    iget v0, v0, Ll/۟ۘ֫;->֫:I

    .line 712
    iget-object v1, v14, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-lez v0, :cond_5

    const/4 v0, 0x0

    .line 1162
    invoke-virtual {v14, v0}, Ll/᩹᩵֫;->ᩳ(I)Z

    :cond_5
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v3, v17

    move-wide/from16 v5, v19

    .line 1053
    invoke-direct/range {v0 .. v6}, Ll/ۜۗ֫;->֫(Ll/ۙ᩵֫;Ll/ܺۧۧ;JJ)Ll/ܳۗ֫;

    move-result-object v0

    :goto_3
    return-object v0

    .line 1068
    :cond_6
    iget-object v9, v9, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    .line 1069
    iget-object v11, v9, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    .line 1070
    iget-object v12, v11, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget v0, v11, Ll/ܺۧۧ;->ܽ:I

    iget-object v13, v10, Ll/ۜۗ֫;->᩷:Ll/᩹᩵֫;

    invoke-virtual {v8, v12, v13}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    .line 1071
    iget-boolean v14, v9, Ll/ܳۗ֫;->ܿ:Z

    .line 1073
    invoke-virtual {v11}, Ll/ܺۧۧ;->֫()Z

    move-result v1

    const/4 v2, -0x1

    if-eqz v1, :cond_b

    .line 1074
    iget v3, v11, Ll/ܺۧۧ;->֫:I

    .line 798
    iget-object v0, v13, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    invoke-virtual {v0, v3}, Ll/۟ۘ֫;->֫(I)Ll/ܰۘ֫;

    move-result-object v0

    iget v0, v0, Ll/ܰۘ֫;->֫:I

    if-ne v0, v2, :cond_7

    goto :goto_4

    .line 1079
    :cond_7
    iget v1, v11, Ll/ܺۧۧ;->ۧ:I

    .line 750
    iget-object v2, v13, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    invoke-virtual {v2, v3}, Ll/۟ۘ֫;->֫(I)Ll/ܰۘ֫;

    move-result-object v2

    invoke-virtual {v2, v1}, Ll/ܰۘ֫;->֫(I)I

    move-result v4

    if-ge v4, v0, :cond_8

    .line 1083
    iget-object v2, v11, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget-wide v5, v9, Ll/ܳۗ֫;->᩷:J

    iget-wide v11, v11, Ll/ܺۧۧ;->ܿ:J

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v7, v11

    move v9, v14

    invoke-direct/range {v0 .. v9}, Ll/ۜۗ֫;->֫(Ll/ۙ᩵֫;Ljava/lang/Object;IIJJZ)Ll/ܳۗ֫;

    move-result-object v0

    return-object v0

    .line 1093
    :cond_8
    iget-wide v0, v9, Ll/ܳۗ֫;->᩷:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v4, 0x0

    cmp-long v15, v0, v2

    if-nez v15, :cond_a

    .line 1098
    iget v3, v13, Ll/᩹᩵֫;->᩻:I

    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 1104
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    .line 1099
    iget-object v1, v10, Ll/ۜۗ֫;->ۚ:Ll/᩶᩵֫;

    move-object/from16 v0, p1

    move-object v2, v13

    move-object/from16 v17, v9

    move-wide v9, v4

    move-wide v4, v15

    invoke-virtual/range {v0 .. v7}, Ll/ۙ᩵֫;->֫(Ll/᩶᩵֫;Ll/᩹᩵֫;IJJ)Landroid/util/Pair;

    move-result-object v0

    if-nez v0, :cond_9

    :goto_4
    const/4 v0, 0x0

    return-object v0

    .line 1108
    :cond_9
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_5

    :cond_a
    move-object/from16 v17, v9

    move-wide v9, v4

    .line 1110
    :goto_5
    iget v2, v11, Ll/ܺۧۧ;->֫:I

    .line 1311
    invoke-virtual {v8, v12, v13}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    .line 1312
    invoke-virtual {v13, v2}, Ll/᩹᩵֫;->֫(I)J

    .line 872
    iget-object v3, v13, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    invoke-virtual {v3, v2}, Ll/۟ۘ֫;->֫(I)Ll/ܰۘ֫;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1113
    iget-object v2, v11, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    .line 1116
    invoke-static {v9, v10, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    move-object/from16 v1, v17

    iget-wide v5, v1, Ll/ܳۗ֫;->᩷:J

    iget-wide v9, v11, Ll/ܺۧۧ;->ܿ:J

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v7, v9

    move v9, v14

    .line 1113
    invoke-direct/range {v0 .. v9}, Ll/ۜۗ֫;->֫(Ll/ۙ᩵֫;Ljava/lang/Object;JJJZ)Ll/ܳۗ֫;

    move-result-object v0

    return-object v0

    :cond_b
    move-object v1, v9

    if-eq v0, v2, :cond_c

    .line 1122
    invoke-virtual {v13, v0}, Ll/᩹᩵֫;->ܽ(I)Z

    .line 1127
    :cond_c
    invoke-virtual {v13, v0}, Ll/᩹᩵֫;->ۧ(I)I

    move-result v4

    .line 1129
    invoke-virtual {v13, v0}, Ll/᩹᩵֫;->ᩳ(I)Z

    .line 798
    iget-object v2, v13, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    invoke-virtual {v2, v0}, Ll/۟ۘ֫;->֫(I)Ll/ܰۘ֫;

    move-result-object v2

    iget v2, v2, Ll/ܰۘ֫;->֫:I

    if-eq v4, v2, :cond_d

    .line 1147
    iget-object v2, v11, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget v3, v11, Ll/ܺۧۧ;->ܽ:I

    iget-wide v5, v1, Ll/ܳۗ֫;->֫:J

    iget-wide v9, v11, Ll/ܺۧۧ;->ܿ:J

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v7, v9

    move v9, v14

    invoke-direct/range {v0 .. v9}, Ll/ۜۗ֫;->֫(Ll/ۙ᩵֫;Ljava/lang/Object;IIJJZ)Ll/ܳۗ֫;

    move-result-object v0

    return-object v0

    .line 1311
    :cond_d
    invoke-virtual {v8, v12, v13}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    .line 1312
    invoke-virtual {v13, v0}, Ll/᩹᩵֫;->֫(I)J

    .line 872
    iget-object v2, v13, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    invoke-virtual {v2, v0}, Ll/۟ۘ֫;->֫(I)Ll/ܰۘ֫;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1139
    iget-object v2, v11, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget-wide v5, v1, Ll/ܳۗ֫;->֫:J

    iget-wide v9, v11, Ll/ܺۧۧ;->ܿ:J

    const/4 v11, 0x0

    const-wide/16 v3, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v7, v9

    move v9, v11

    invoke-direct/range {v0 .. v9}, Ll/ۜۗ֫;->֫(Ll/ۙ᩵֫;Ljava/lang/Object;JJJZ)Ll/ܳۗ֫;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ll/ۙ᩵֫;Ljava/lang/Object;JJLl/᩶᩵֫;Ll/᩹᩵֫;)Ll/ܺۧۧ;
    .locals 8

    .line 717
    invoke-virtual {p0, p1, p7}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    .line 718
    iget v0, p7, Ll/᩹᩵֫;->᩻:I

    invoke-virtual {p0, v0, p6}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;)V

    .line 720
    invoke-virtual {p0, p1}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    .line 704
    iget-object p6, p7, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    iget p6, p6, Ll/۟ۘ֫;->֫:I

    if-eqz p6, :cond_1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p6, v0, :cond_0

    .line 740
    invoke-virtual {p7, v1}, Ll/᩹᩵֫;->ܽ(I)Z

    .line 712
    :cond_0
    iget-object p6, p7, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 741
    invoke-virtual {p7, v1}, Ll/᩹᩵֫;->ᩳ(I)Z

    .line 726
    :cond_1
    invoke-virtual {p0, p1, p7}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    .line 727
    invoke-virtual {p7, p2, p3}, Ll/᩹᩵֫;->ۧ(J)I

    move-result v4

    const/4 p0, -0x1

    if-ne v4, p0, :cond_2

    .line 729
    invoke-virtual {p7, p2, p3}, Ll/᩹᩵֫;->֫(J)I

    move-result p0

    .line 730
    new-instance p2, Ll/ܺۧۧ;

    invoke-direct {p2, p0, p4, p5, p1}, Ll/ܺۧۧ;-><init>(IJLjava/lang/Object;)V

    return-object p2

    .line 732
    :cond_2
    invoke-virtual {p7, v4}, Ll/᩹᩵֫;->ۧ(I)I

    move-result v5

    .line 733
    new-instance p0, Ll/ܺۧۧ;

    move-object v2, p0

    move-object v3, p1

    move-wide v6, p4

    invoke-direct/range {v2 .. v7}, Ll/ܺۧۧ;-><init>(Ljava/lang/Object;IIJ)V

    return-object p0
.end method

.method public static synthetic ֫(Ll/ۜۗ֫;Ll/֫۬ܺ;Ll/ܺۧۧ;)V
    .locals 0

    .line 803
    iget-object p0, p0, Ll/ۜۗ֫;->֫:Ll/᩵۬֫;

    invoke-virtual {p1}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object p1

    invoke-interface {p0, p1, p2}, Ll/᩵۬֫;->֫(Ljava/util/List;Ll/ܺۧۧ;)V

    return-void
.end method

.method private ֫(Ll/ۙ᩵֫;Ll/ܺۧۧ;)Z
    .locals 6

    .line 1288
    invoke-virtual {p2}, Ll/ܺۧۧ;->֫()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    iget v0, p2, Ll/ܺۧۧ;->ܽ:I

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1292
    :goto_0
    iget-object p2, p2, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    if-nez v0, :cond_1

    goto :goto_1

    .line 1295
    :cond_1
    iget-object v0, p0, Ll/ۜۗ֫;->᩷:Ll/᩹᩵֫;

    invoke-virtual {p1, p2, v0}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    move-result-object v0

    iget v0, v0, Ll/᩹᩵֫;->᩻:I

    .line 1296
    invoke-virtual {p1, p2}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    move-result p2

    .line 1297
    iget-object v3, p0, Ll/ۜۗ֫;->ۚ:Ll/᩶᩵֫;

    const-wide/16 v4, 0x0

    .line 1097
    invoke-virtual {p1, v0, v3, v4, v5}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object p1

    .line 1297
    iget p1, p1, Ll/᩶᩵֫;->ۜ:I

    if-ne p1, p2, :cond_2

    return v1

    :cond_2
    :goto_1
    return v2
.end method

.method private ֫(Ll/ۙ᩵֫;Ll/ܺۧۧ;Z)Z
    .locals 7

    .line 1302
    iget-object p2, p2, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    invoke-virtual {p1, p2}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    move-result v1

    .line 1275
    iget-object p2, p0, Ll/ۜۗ֫;->᩷:Ll/᩹᩵֫;

    const/4 v6, 0x0

    invoke-virtual {p1, v1, p2, v6}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;

    move-result-object p2

    .line 1303
    iget p2, p2, Ll/᩹᩵֫;->᩻:I

    .line 1304
    iget-object v0, p0, Ll/ۜۗ֫;->ۚ:Ll/᩶᩵֫;

    const-wide/16 v2, 0x0

    .line 1097
    invoke-virtual {p1, p2, v0, v2, v3}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object p2

    .line 1304
    iget-boolean p2, p2, Ll/᩶᩵֫;->ܿ:Z

    if-nez p2, :cond_0

    iget v4, p0, Ll/ۜۗ֫;->᩵:I

    iget-boolean v5, p0, Ll/ۜۗ֫;->֡:Z

    .line 1160
    iget-object v2, p0, Ll/ۜۗ֫;->᩷:Ll/᩹᩵֫;

    iget-object v3, p0, Ll/ۜۗ֫;->ۚ:Ll/᩶᩵֫;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Ll/᩶᩵֫;IZ)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v6
.end method

.method private ۖ()V
    .locals 3

    .line 795
    sget v0, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance v0, Ll/֫۬ܺ;

    invoke-direct {v0}, Ll/֫۬ܺ;-><init>()V

    .line 796
    iget-object v1, p0, Ll/ۜۗ֫;->ۢ:Ll/ܿۗ֫;

    :goto_0
    if-eqz v1, :cond_0

    .line 798
    iget-object v2, v1, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-object v2, v2, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    invoke-virtual {v0, v2}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    .line 799
    invoke-virtual {v1}, Ll/ܿۗ֫;->ۧ()Ll/ܿۗ֫;

    move-result-object v1

    goto :goto_0

    .line 801
    :cond_0
    iget-object v1, p0, Ll/ۜۗ֫;->ᩴ:Ll/ܿۗ֫;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    iget-object v1, v1, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-object v1, v1, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    .line 802
    :goto_1
    new-instance v2, Ll/᩻ۗ֫;

    invoke-direct {v2, p0, v0, v1}, Ll/᩻ۗ֫;-><init>(Ll/ۜۗ֫;Ll/֫۬ܺ;Ll/ܺۧۧ;)V

    iget-object v0, p0, Ll/ۜۗ֫;->ۧ:Ll/᩵ۚ֫;

    invoke-interface {v0, v2}, Ll/᩵ۚ֫;->֫(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۙ᩵֫;I)I
    .locals 0

    .line 134
    iput p2, p0, Ll/ۜۗ֫;->᩵:I

    .line 135
    invoke-direct {p0, p1}, Ll/ۜۗ֫;->֫(Ll/ۙ᩵֫;)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۙ᩵֫;JJJ)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 566
    iget-object v2, v0, Ll/ۜۗ֫;->ۢ:Ll/ܿۗ֫;

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x0

    if-eqz v2, :cond_d

    .line 568
    iget-object v5, v2, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    if-nez v3, :cond_0

    .line 576
    invoke-virtual {v0, v1, v5}, Ll/ۜۗ֫;->֫(Ll/ۙ᩵֫;Ll/ܳۗ֫;)Ll/ܳۗ֫;

    move-result-object v3

    move-wide/from16 v6, p2

    goto :goto_1

    :cond_0
    move-wide/from16 v6, p2

    .line 579
    invoke-direct {v0, v1, v3, v6, v7}, Ll/ۜۗ֫;->֫(Ll/ۙ᩵֫;Ll/ܿۗ֫;J)Ll/ܳۗ֫;

    move-result-object v8

    if-eqz v8, :cond_c

    .line 879
    iget-wide v9, v5, Ll/ܳۗ֫;->ۢ:J

    iget-wide v11, v8, Ll/ܳۗ֫;->ۢ:J

    cmp-long v13, v9, v11

    if-nez v13, :cond_c

    iget-object v9, v5, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    iget-object v10, v8, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    invoke-virtual {v9, v10}, Ll/ܺۧۧ;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_c

    move-object v3, v8

    .line 589
    :goto_1
    iget-wide v8, v3, Ll/ܳۗ֫;->֫:J

    iget-wide v10, v5, Ll/ܳۗ֫;->᩷:J

    iget-wide v12, v5, Ll/ܳۗ֫;->֫:J

    .line 590
    invoke-virtual {v3, v10, v11}, Ll/ܳۗ֫;->֫(J)Ll/ܳۗ֫;

    move-result-object v10

    iput-object v10, v2, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    cmp-long v10, v12, v8

    if-eqz v10, :cond_b

    .line 595
    invoke-virtual {v2}, Ll/ܿۗ֫;->ۢ()V

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v8, v6

    if-nez v1, :cond_1

    const-wide v8, 0x7fffffffffffffffL

    goto :goto_2

    .line 600
    :cond_1
    invoke-virtual {v2, v8, v9}, Ll/ܿۗ֫;->ᩳ(J)J

    move-result-wide v8

    .line 601
    :goto_2
    iget-object v1, v0, Ll/ۜۗ֫;->ᩴ:Ll/ܿۗ֫;

    const-wide/high16 v10, -0x8000000000000000L

    if-ne v2, v1, :cond_3

    iget-object v1, v2, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-boolean v1, v1, Ll/ܳۗ֫;->ܿ:Z

    if-nez v1, :cond_3

    cmp-long v1, p4, v10

    if-eqz v1, :cond_2

    cmp-long v1, p4, v8

    if-ltz v1, :cond_3

    :cond_2
    const/4 v1, 0x1

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    .line 606
    :goto_3
    iget-object v14, v0, Ll/ۜۗ֫;->ۘ:Ll/ܿۗ֫;

    if-ne v2, v14, :cond_5

    cmp-long v14, p6, v10

    if-eqz v14, :cond_4

    cmp-long v14, p6, v8

    if-ltz v14, :cond_5

    :cond_4
    const/4 v8, 0x1

    goto :goto_4

    :cond_5
    const/4 v8, 0x0

    .line 611
    :goto_4
    invoke-virtual {v0, v2}, Ll/ۜۗ֫;->֫(Ll/ܿۗ֫;)I

    move-result v2

    if-eqz v2, :cond_6

    return v2

    :cond_6
    cmp-long v2, v12, v6

    if-nez v2, :cond_7

    .line 615
    iget-wide v12, v5, Ll/ܳۗ֫;->ۧ:J

    cmp-long v5, v12, v10

    if-nez v5, :cond_7

    iget-wide v12, v3, Ll/ܳۗ֫;->ۧ:J

    cmp-long v3, v12, v6

    if-eqz v3, :cond_7

    cmp-long v3, v12, v10

    if-eqz v3, :cond_7

    const/4 v3, 0x1

    goto :goto_5

    :cond_7
    const/4 v3, 0x0

    :goto_5
    if-eqz v1, :cond_9

    if-nez v2, :cond_8

    if-eqz v3, :cond_9

    :cond_8
    const/4 v4, 0x1

    :cond_9
    if-eqz v8, :cond_a

    or-int/lit8 v1, v4, 0x2

    return v1

    :cond_a
    return v4

    .line 632
    :cond_b
    invoke-virtual {v2}, Ll/ܿۗ֫;->ۧ()Ll/ܿۗ֫;

    move-result-object v3

    move-object v15, v3

    move-object v3, v2

    move-object v2, v15

    goto/16 :goto_0

    .line 583
    :cond_c
    invoke-virtual {v0, v3}, Ll/ۜۗ֫;->֫(Ll/ܿۗ֫;)I

    move-result v1

    return v1

    :cond_d
    return v4
.end method

.method public final ֫(Ll/ۙ᩵֫;Z)I
    .locals 0

    .line 152
    iput-boolean p2, p0, Ll/ۜۗ֫;->֡:Z

    .line 153
    invoke-direct {p0, p1}, Ll/ۜۗ֫;->֫(Ll/ۙ᩵֫;)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ܿۗ֫;)I
    .locals 2

    .line 462
    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 463
    iget-object v0, p0, Ll/ۜۗ֫;->ᩳ:Ll/ܿۗ֫;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 467
    :cond_0
    iput-object p1, p0, Ll/ۜۗ֫;->ᩳ:Ll/ܿۗ֫;

    .line 468
    :goto_0
    invoke-virtual {p1}, Ll/ܿۗ֫;->ۧ()Ll/ܿۗ֫;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 469
    invoke-virtual {p1}, Ll/ܿۗ֫;->ۧ()Ll/ܿۗ֫;

    move-result-object p1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 470
    iget-object v0, p0, Ll/ۜۗ֫;->ᩴ:Ll/ܿۗ֫;

    if-ne p1, v0, :cond_1

    .line 471
    iget-object v0, p0, Ll/ۜۗ֫;->ۢ:Ll/ܿۗ֫;

    iput-object v0, p0, Ll/ۜۗ֫;->ᩴ:Ll/ܿۗ֫;

    .line 472
    iput-object v0, p0, Ll/ۜۗ֫;->ۘ:Ll/ܿۗ֫;

    const/4 v1, 0x3

    .line 476
    :cond_1
    iget-object v0, p0, Ll/ۜۗ֫;->ۘ:Ll/ܿۗ֫;

    if-ne p1, v0, :cond_2

    .line 477
    iget-object v0, p0, Ll/ۜۗ֫;->ᩴ:Ll/ܿۗ֫;

    iput-object v0, p0, Ll/ۜۗ֫;->ۘ:Ll/ܿۗ֫;

    or-int/lit8 v0, v1, 0x2

    move v1, v0

    .line 480
    :cond_2
    invoke-virtual {p1}, Ll/ܿۗ֫;->᩷()V

    .line 481
    iget v0, p0, Ll/ۜۗ֫;->ܽ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۜۗ֫;->ܽ:I

    goto :goto_0

    .line 483
    :cond_3
    iget-object p1, p0, Ll/ۜۗ֫;->ᩳ:Ll/ܿۗ֫;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 483
    invoke-virtual {p1, v0}, Ll/ܿۗ֫;->֫(Ll/ܿۗ֫;)V

    .line 484
    invoke-direct {p0}, Ll/ۜۗ֫;->ۖ()V

    return v1
.end method

.method public final ֫(JLl/۬ۗ֫;)Ll/ܳۗ֫;
    .locals 8

    .line 209
    iget-object v0, p0, Ll/ۜۗ֫;->ᩳ:Ll/ܿۗ֫;

    if-nez v0, :cond_0

    .line 940
    iget-object v2, p3, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    iget-object v3, p3, Ll/۬ۗ֫;->ܿ:Ll/ܺۧۧ;

    iget-wide v4, p3, Ll/۬ۗ֫;->ۘ:J

    iget-wide v6, p3, Ll/۬ۗ֫;->ۖ:J

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Ll/ۜۗ֫;->֫(Ll/ۙ᩵֫;Ll/ܺۧۧ;JJ)Ll/ܳۗ֫;

    move-result-object p1

    return-object p1

    .line 211
    :cond_0
    iget-object p3, p3, Ll/۬ۗ֫;->֡:Ll/ۙ᩵֫;

    invoke-direct {p0, p3, v0, p1, p2}, Ll/ۜۗ֫;->֫(Ll/ۙ᩵֫;Ll/ܿۗ֫;J)Ll/ܳۗ֫;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۙ᩵֫;Ll/ܳۗ֫;)Ll/ܳۗ֫;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 647
    iget-object v3, v2, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    .line 1288
    invoke-virtual {v3}, Ll/ܺۧۧ;->֫()Z

    move-result v4

    iget v5, v3, Ll/ܺۧۧ;->ܽ:I

    const/4 v6, -0x1

    if-nez v4, :cond_0

    if-ne v5, v6, :cond_0

    const/4 v4, 0x1

    const/4 v13, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    const/4 v13, 0x0

    .line 648
    :goto_0
    iget v4, v3, Ll/ܺۧۧ;->֫:I

    .line 649
    invoke-direct {v0, v1, v3}, Ll/ۜۗ֫;->֫(Ll/ۙ᩵֫;Ll/ܺۧۧ;)Z

    move-result v14

    .line 650
    invoke-direct {v0, v1, v3, v13}, Ll/ۜۗ֫;->֫(Ll/ۙ᩵֫;Ll/ܺۧۧ;Z)Z

    move-result v15

    .line 651
    iget-object v7, v3, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget-object v8, v0, Ll/ۜۗ֫;->᩷:Ll/᩹᩵֫;

    invoke-virtual {v1, v7, v8}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    .line 653
    invoke-virtual {v3}, Ll/ܺۧۧ;->֫()Z

    move-result v1

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v1, :cond_2

    if-ne v5, v6, :cond_1

    goto :goto_1

    .line 655
    :cond_1
    invoke-virtual {v8, v5}, Ll/᩹᩵֫;->֫(I)J

    const-wide/16 v11, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    move-wide v11, v9

    .line 657
    :goto_2
    invoke-virtual {v3}, Ll/ܺۧۧ;->֫()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 658
    iget v1, v3, Ll/ܺۧۧ;->ۧ:I

    invoke-virtual {v8, v4, v1}, Ll/᩹᩵֫;->֫(II)J

    move-result-wide v9

    goto :goto_4

    :cond_3
    cmp-long v1, v11, v9

    if-eqz v1, :cond_5

    const-wide/high16 v9, -0x8000000000000000L

    cmp-long v1, v11, v9

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    move-wide v9, v11

    goto :goto_4

    .line 675
    :cond_5
    :goto_3
    iget-wide v9, v8, Ll/᩹᩵֫;->ۧ:J

    .line 663
    :goto_4
    invoke-virtual {v3}, Ll/ܺۧۧ;->֫()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 664
    invoke-virtual {v8, v4}, Ll/᩹᩵֫;->ᩳ(I)Z

    goto :goto_5

    :cond_6
    if-eq v5, v6, :cond_7

    .line 666
    invoke-virtual {v8, v5}, Ll/᩹᩵֫;->ᩳ(I)Z

    .line 667
    :cond_7
    :goto_5
    new-instance v16, Ll/ܳۗ֫;

    iget-wide v4, v2, Ll/ܳۗ֫;->ۢ:J

    iget-wide v6, v2, Ll/ܳۗ֫;->᩷:J

    iget-boolean v8, v2, Ll/ܳۗ֫;->ۜ:Z

    const/16 v17, 0x0

    move-object/from16 v1, v16

    move-object v2, v3

    move-wide v3, v4

    move-wide v5, v6

    move/from16 v18, v8

    move-wide v7, v11

    move/from16 v11, v18

    move/from16 v12, v17

    invoke-direct/range {v1 .. v15}, Ll/ܳۗ֫;-><init>(Ll/ܺۧۧ;JJJJZZZZZ)V

    return-object v16
.end method

.method public final ֫(Ll/ۙ᩵֫;Ljava/lang/Object;J)Ll/ܺۧۧ;
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 816
    iget-object v3, v0, Ll/ۜۗ֫;->᩷:Ll/᩹᩵֫;

    invoke-virtual {v1, v2, v3}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    move-result-object v4

    iget v4, v4, Ll/᩹᩵֫;->᩻:I

    .line 817
    iget-object v5, v0, Ll/ۜۗ֫;->᩻:Ljava/lang/Object;

    const/4 v6, 0x0

    const/4 v7, -0x1

    if-eqz v5, :cond_1

    .line 818
    invoke-virtual {v1, v5}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    move-result v5

    if-eq v5, v7, :cond_1

    .line 1275
    invoke-virtual {v1, v5, v3, v6}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;

    move-result-object v5

    .line 820
    iget v5, v5, Ll/᩹᩵֫;->᩻:I

    if-ne v5, v4, :cond_1

    .line 823
    iget-wide v4, v0, Ll/ۜۗ֫;->ۜ:J

    :cond_0
    :goto_0
    move-wide v5, v4

    goto :goto_3

    .line 827
    :cond_1
    iget-object v5, v0, Ll/ۜۗ֫;->ۢ:Ll/ܿۗ֫;

    :goto_1
    if-eqz v5, :cond_3

    .line 829
    iget-object v8, v5, Ll/ܿۗ֫;->᩵:Ljava/lang/Object;

    invoke-virtual {v8, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 831
    iget-object v4, v5, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-object v4, v4, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    iget-wide v4, v4, Ll/ܺۧۧ;->ܿ:J

    goto :goto_0

    .line 833
    :cond_2
    invoke-virtual {v5}, Ll/ܿۗ֫;->ۧ()Ll/ܿۗ֫;

    move-result-object v5

    goto :goto_1

    .line 835
    :cond_3
    iget-object v5, v0, Ll/ۜۗ֫;->ۢ:Ll/ܿۗ֫;

    :goto_2
    if-eqz v5, :cond_5

    .line 837
    iget-object v8, v5, Ll/ܿۗ֫;->᩵:Ljava/lang/Object;

    invoke-virtual {v1, v8}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    move-result v8

    if-eq v8, v7, :cond_4

    .line 1275
    invoke-virtual {v1, v8, v3, v6}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;

    move-result-object v8

    .line 839
    iget v8, v8, Ll/᩹᩵֫;->᩻:I

    if-ne v8, v4, :cond_4

    .line 842
    iget-object v4, v5, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-object v4, v4, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    iget-wide v4, v4, Ll/ܺۧۧ;->ܿ:J

    goto :goto_0

    .line 845
    :cond_4
    invoke-virtual {v5}, Ll/ܿۗ֫;->ۧ()Ll/ܿۗ֫;

    move-result-object v5

    goto :goto_2

    .line 848
    :cond_5
    invoke-direct {p0, v2}, Ll/ۜۗ֫;->֫(Ljava/lang/Object;)J

    move-result-wide v4

    const-wide/16 v8, -0x1

    cmp-long v6, v4, v8

    if-eqz v6, :cond_6

    goto :goto_0

    .line 854
    :cond_6
    iget-wide v4, v0, Ll/ۜۗ֫;->ܳ:J

    const-wide/16 v8, 0x1

    add-long/2addr v8, v4

    iput-wide v8, v0, Ll/ۜۗ֫;->ܳ:J

    .line 855
    iget-object v6, v0, Ll/ۜۗ֫;->ۢ:Ll/ܿۗ֫;

    if-nez v6, :cond_0

    .line 857
    iput-object v2, v0, Ll/ۜۗ֫;->᩻:Ljava/lang/Object;

    .line 858
    iput-wide v4, v0, Ll/ۜۗ֫;->ۜ:J

    goto :goto_0

    .line 771
    :goto_3
    invoke-virtual {v1, v2, v3}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    .line 772
    iget v4, v3, Ll/᩹᩵֫;->᩻:I

    iget-object v8, v0, Ll/ۜۗ֫;->ۚ:Ll/᩶᩵֫;

    invoke-virtual {v1, v4, v8}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;)V

    .line 775
    invoke-virtual/range {p1 .. p2}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    move-result v4

    const/4 v9, 0x0

    :goto_4
    iget v10, v8, Ll/᩶᩵֫;->ᩳ:I

    if-lt v4, v10, :cond_a

    const/4 v10, 0x1

    .line 776
    invoke-virtual {v1, v4, v3, v10}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;

    .line 704
    iget-object v11, v3, Ll/᩹᩵֫;->֫:Ll/۟ۘ֫;

    iget v11, v11, Ll/۟ۘ֫;->֫:I

    if-lez v11, :cond_7

    goto :goto_5

    :cond_7
    const/4 v10, 0x0

    :goto_5
    or-int/2addr v9, v10

    .line 779
    iget-wide v11, v3, Ll/᩹᩵֫;->ۧ:J

    invoke-virtual {v3, v11, v12}, Ll/᩹᩵֫;->ۧ(J)I

    move-result v11

    if-eq v11, v7, :cond_8

    .line 781
    iget-object v2, v3, Ll/᩹᩵֫;->ܳ:Ljava/lang/Object;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_8
    if-eqz v9, :cond_9

    if-eqz v10, :cond_a

    .line 783
    iget-wide v10, v3, Ll/᩹᩵֫;->ۧ:J

    const-wide/16 v12, 0x0

    cmp-long v14, v10, v12

    if-eqz v14, :cond_9

    goto :goto_6

    :cond_9
    add-int/lit8 v4, v4, -0x1

    goto :goto_4

    .line 788
    :cond_a
    :goto_6
    iget-object v7, v0, Ll/ۜۗ֫;->ۚ:Ll/᩶᩵֫;

    iget-object v8, v0, Ll/ۜۗ֫;->᩷:Ll/᩹᩵֫;

    move-object/from16 v1, p1

    move-wide/from16 v3, p3

    invoke-static/range {v1 .. v8}, Ll/ۜۗ֫;->֫(Ll/ۙ᩵֫;Ljava/lang/Object;JJLl/᩶᩵֫;Ll/᩹᩵֫;)Ll/ܺۧۧ;

    move-result-object v1

    return-object v1
.end method

.method public final ֫()Ll/ܿۗ֫;
    .locals 3

    .line 423
    iget-object v0, p0, Ll/ۜۗ֫;->ۢ:Ll/ܿۗ֫;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 426
    :cond_0
    iget-object v2, p0, Ll/ۜۗ֫;->ᩴ:Ll/ܿۗ֫;

    if-ne v0, v2, :cond_1

    .line 427
    invoke-virtual {v0}, Ll/ܿۗ֫;->ۧ()Ll/ܿۗ֫;

    move-result-object v0

    iput-object v0, p0, Ll/ۜۗ֫;->ᩴ:Ll/ܿۗ֫;

    .line 429
    :cond_1
    iget-object v0, p0, Ll/ۜۗ֫;->ۢ:Ll/ܿۗ֫;

    iget-object v2, p0, Ll/ۜۗ֫;->ۘ:Ll/ܿۗ֫;

    if-ne v0, v2, :cond_2

    .line 430
    invoke-virtual {v0}, Ll/ܿۗ֫;->ۧ()Ll/ܿۗ֫;

    move-result-object v0

    iput-object v0, p0, Ll/ۜۗ֫;->ۘ:Ll/ܿۗ֫;

    .line 432
    :cond_2
    iget-object v0, p0, Ll/ۜۗ֫;->ۢ:Ll/ܿۗ֫;

    invoke-virtual {v0}, Ll/ܿۗ֫;->᩷()V

    .line 433
    iget v0, p0, Ll/ۜۗ֫;->ܽ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۜۗ֫;->ܽ:I

    if-nez v0, :cond_3

    .line 435
    iput-object v1, p0, Ll/ۜۗ֫;->ᩳ:Ll/ܿۗ֫;

    .line 436
    iget-object v0, p0, Ll/ۜۗ֫;->ۢ:Ll/ܿۗ֫;

    iget-object v1, v0, Ll/ܿۗ֫;->᩵:Ljava/lang/Object;

    iput-object v1, p0, Ll/ۜۗ֫;->᩻:Ljava/lang/Object;

    .line 437
    iget-object v0, v0, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-object v0, v0, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    iget-wide v0, v0, Ll/ܺۧۧ;->ܿ:J

    iput-wide v0, p0, Ll/ۜۗ֫;->ۜ:J

    .line 439
    :cond_3
    iget-object v0, p0, Ll/ۜۗ֫;->ۢ:Ll/ܿۗ֫;

    invoke-virtual {v0}, Ll/ܿۗ֫;->ۧ()Ll/ܿۗ֫;

    move-result-object v0

    iput-object v0, p0, Ll/ۜۗ֫;->ۢ:Ll/ܿۗ֫;

    .line 440
    invoke-direct {p0}, Ll/ۜۗ֫;->ۖ()V

    .line 441
    iget-object v0, p0, Ll/ۜۗ֫;->ۢ:Ll/ܿۗ֫;

    return-object v0
.end method

.method public final ֫(Ll/ۢۧۧ;)Ll/ܿۗ֫;
    .locals 3

    const/4 v0, 0x0

    .line 508
    :goto_0
    iget-object v1, p0, Ll/ۜۗ֫;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 509
    iget-object v1, p0, Ll/ۜۗ֫;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿۗ֫;

    .line 510
    iget-object v2, v1, Ll/ܿۗ֫;->ܿ:Ljava/lang/Object;

    if-ne v2, p1, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ܳۗ֫;)Ll/ܿۗ֫;
    .locals 11

    .line 222
    iget-object v0, p0, Ll/ۜۗ֫;->ᩳ:Ll/ܿۗ֫;

    if-nez v0, :cond_0

    const-wide v0, 0xe8d4a51000L

    goto :goto_0

    .line 224
    :cond_0
    invoke-virtual {v0}, Ll/ܿۗ֫;->ܽ()J

    move-result-wide v0

    iget-object v2, p0, Ll/ۜۗ֫;->ᩳ:Ll/ܿۗ֫;

    iget-object v2, v2, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-wide v2, v2, Ll/ܳۗ֫;->֫:J

    add-long/2addr v0, v2

    iget-wide v2, p1, Ll/ܳۗ֫;->ۢ:J

    sub-long/2addr v0, v2

    :goto_0
    const/4 v2, 0x0

    .line 297
    :goto_1
    iget-object v3, p0, Ll/ۜۗ֫;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 298
    iget-object v3, p0, Ll/ۜۗ֫;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܿۗ֫;

    .line 525
    iget-object v3, v3, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-wide v4, v3, Ll/ܳۗ֫;->֫:J

    iget-wide v6, p1, Ll/ܳۗ֫;->֫:J

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v10, v4, v8

    if-eqz v10, :cond_1

    cmp-long v8, v4, v6

    if-nez v8, :cond_2

    :cond_1
    iget-wide v4, v3, Ll/ܳۗ֫;->ۢ:J

    iget-wide v6, p1, Ll/ܳۗ֫;->ۢ:J

    cmp-long v8, v4, v6

    if-nez v8, :cond_2

    iget-object v3, v3, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    iget-object v4, p1, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    .line 527
    invoke-virtual {v3, v4}, Ll/ܺۧۧ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 300
    iget-object v3, p0, Ll/ۜۗ֫;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿۗ֫;

    goto :goto_2

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_2
    if-nez v2, :cond_4

    .line 227
    iget-object v2, p0, Ll/ۜۗ֫;->ܿ:Ll/ᩴۙ֫;

    iget-object v2, v2, Ll/ᩴۙ֫;->֫:Ll/᩶ۙ֫;

    invoke-static {v2, p1, v0, v1}, Ll/᩶ۙ֫;->֫(Ll/᩶ۙ֫;Ll/ܳۗ֫;J)Ll/ܿۗ֫;

    move-result-object v2

    goto :goto_3

    .line 229
    :cond_4
    iput-object p1, v2, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    .line 230
    invoke-virtual {v2, v0, v1}, Ll/ܿۗ֫;->ۧ(J)V

    .line 232
    :goto_3
    iget-object p1, p0, Ll/ۜۗ֫;->ᩳ:Ll/ܿۗ֫;

    if-eqz p1, :cond_5

    .line 233
    invoke-virtual {p1, v2}, Ll/ܿۗ֫;->֫(Ll/ܿۗ֫;)V

    goto :goto_4

    .line 235
    :cond_5
    iput-object v2, p0, Ll/ۜۗ֫;->ۢ:Ll/ܿۗ֫;

    .line 236
    iput-object v2, p0, Ll/ۜۗ֫;->ᩴ:Ll/ܿۗ֫;

    .line 237
    iput-object v2, p0, Ll/ۜۗ֫;->ۘ:Ll/ܿۗ֫;

    :goto_4
    const/4 p1, 0x0

    .line 239
    iput-object p1, p0, Ll/ۜۗ֫;->᩻:Ljava/lang/Object;

    .line 240
    iput-object v2, p0, Ll/ۜۗ֫;->ᩳ:Ll/ܿۗ֫;

    .line 241
    iget p1, p0, Ll/ۜۗ֫;->ܽ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۜۗ֫;->ܽ:I

    .line 242
    invoke-direct {p0}, Ll/ۜۗ֫;->ۖ()V

    return-object v2
.end method

.method public final ֫(J)V
    .locals 1

    .line 184
    iget-object v0, p0, Ll/ۜۗ֫;->ᩳ:Ll/ܿۗ֫;

    if-eqz v0, :cond_0

    .line 185
    invoke-virtual {v0, p1, p2}, Ll/ܿۗ֫;->֫(J)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۙ᩵֫;Ll/ۖ᩶֫;)V
    .locals 0

    .line 164
    iput-object p2, p0, Ll/ۜۗ֫;->ۡ:Ll/ۖ᩶֫;

    .line 248
    iget-object p1, p0, Ll/ۜۗ֫;->ۡ:Ll/ۖ᩶֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    invoke-virtual {p0}, Ll/ۜۗ֫;->ۡ()V

    return-void
.end method

.method public final ۜ()Ll/ܿۗ֫;
    .locals 1

    .line 387
    iget-object v0, p0, Ll/ۜۗ֫;->ۘ:Ll/ܿۗ֫;

    return-object v0
.end method

.method public final ۡ()V
    .locals 3

    .line 290
    iget-object v0, p0, Ll/ۜۗ֫;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 291
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 307
    :goto_0
    iget-object v2, p0, Ll/ۜۗ֫;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 308
    iget-object v2, p0, Ll/ۜۗ֫;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿۗ֫;

    invoke-virtual {v2}, Ll/ܿۗ֫;->᩷()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 310
    :cond_0
    iput-object v0, p0, Ll/ۜۗ֫;->ܺ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 311
    iput-object v0, p0, Ll/ۜۗ֫;->ۖ:Ll/ܿۗ֫;

    .line 312
    invoke-virtual {p0}, Ll/ۜۗ֫;->ۢ()V

    :cond_1
    return-void
.end method

.method public final ۢ()V
    .locals 3

    .line 493
    iget-object v0, p0, Ll/ۜۗ֫;->ۖ:Ll/ܿۗ֫;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܿۗ֫;->ۜ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 496
    iput-object v0, p0, Ll/ۜۗ֫;->ۖ:Ll/ܿۗ֫;

    const/4 v0, 0x0

    .line 497
    :goto_0
    iget-object v1, p0, Ll/ۜۗ֫;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 498
    iget-object v1, p0, Ll/ۜۗ֫;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿۗ֫;

    .line 499
    invoke-virtual {v1}, Ll/ܿۗ֫;->ۜ()Z

    move-result v2

    if-nez v2, :cond_1

    .line 500
    iput-object v1, p0, Ll/ۜۗ֫;->ۖ:Ll/ܿۗ֫;

    return-void

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 410
    iget-object v0, p0, Ll/ۜۗ֫;->ۘ:Ll/ܿۗ֫;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ll/ܿۗ֫;->ۧ()Ll/ܿۗ֫;

    move-result-object v0

    iput-object v0, p0, Ll/ۜۗ֫;->ۘ:Ll/ܿۗ֫;

    .line 411
    invoke-direct {p0}, Ll/ۜۗ֫;->ۖ()V

    .line 412
    iget-object v0, p0, Ll/ۜۗ֫;->ۘ:Ll/ܿۗ֫;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ(Ll/ۢۧۧ;)Z
    .locals 1

    .line 170
    iget-object v0, p0, Ll/ۜۗ֫;->ᩳ:Ll/ܿۗ֫;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/ܿۗ֫;->ܿ:Ljava/lang/Object;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܳ()Ll/ܿۗ֫;
    .locals 1

    .line 375
    iget-object v0, p0, Ll/ۜۗ֫;->ۢ:Ll/ܿۗ֫;

    return-object v0
.end method

.method public final ܺ()Z
    .locals 5

    .line 191
    iget-object v0, p0, Ll/ۜۗ֫;->ᩳ:Ll/ܿۗ֫;

    if-eqz v0, :cond_1

    iget-object v1, v0, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-boolean v1, v1, Ll/ܳۗ֫;->ᩳ:Z

    if-nez v1, :cond_0

    .line 193
    invoke-virtual {v0}, Ll/ܿۗ֫;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۜۗ֫;->ᩳ:Ll/ܿۗ֫;

    iget-object v0, v0, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-wide v0, v0, Ll/ܳۗ֫;->֫:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget v0, p0, Ll/ۜۗ֫;->ܽ:I

    const/16 v1, 0x64

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()Ll/ܿۗ֫;
    .locals 2

    .line 396
    iget-object v0, p0, Ll/ۜۗ֫;->ۘ:Ll/ܿۗ֫;

    iget-object v1, p0, Ll/ۜۗ֫;->ᩴ:Ll/ܿۗ֫;

    if-ne v0, v1, :cond_0

    .line 397
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ll/ܿۗ֫;->ۧ()Ll/ܿۗ֫;

    move-result-object v0

    iput-object v0, p0, Ll/ۜۗ֫;->ۘ:Ll/ܿۗ֫;

    .line 399
    :cond_0
    iget-object v0, p0, Ll/ۜۗ֫;->ᩴ:Ll/ܿۗ֫;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ll/ܿۗ֫;->ۧ()Ll/ܿۗ֫;

    move-result-object v0

    iput-object v0, p0, Ll/ۜۗ֫;->ᩴ:Ll/ܿۗ֫;

    .line 400
    invoke-direct {p0}, Ll/ۜۗ֫;->ۖ()V

    .line 401
    iget-object v0, p0, Ll/ۜۗ֫;->ᩴ:Ll/ܿۗ֫;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final ܽ(Ll/ۢۧۧ;)Z
    .locals 1

    .line 175
    iget-object v0, p0, Ll/ۜۗ֫;->ۖ:Ll/ܿۗ֫;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/ܿۗ֫;->ܿ:Ljava/lang/Object;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܿ()Ll/ܿۗ֫;
    .locals 1

    .line 360
    iget-object v0, p0, Ll/ۜۗ֫;->ᩳ:Ll/ܿۗ֫;

    return-object v0
.end method

.method public final ᩳ()V
    .locals 3

    .line 519
    iget v0, p0, Ll/ۜۗ֫;->ܽ:I

    if-nez v0, :cond_0

    return-void

    .line 522
    :cond_0
    iget-object v0, p0, Ll/ۜۗ֫;->ۢ:Ll/ܿۗ֫;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 523
    iget-object v1, v0, Ll/ܿۗ֫;->᩵:Ljava/lang/Object;

    iput-object v1, p0, Ll/ۜۗ֫;->᩻:Ljava/lang/Object;

    .line 524
    iget-object v1, v0, Ll/ܿۗ֫;->ܽ:Ll/ܳۗ֫;

    iget-object v1, v1, Ll/ܳۗ֫;->ܽ:Ll/ܺۧۧ;

    iget-wide v1, v1, Ll/ܺۧۧ;->ܿ:J

    iput-wide v1, p0, Ll/ۜۗ֫;->ۜ:J

    :goto_0
    if-eqz v0, :cond_1

    .line 526
    invoke-virtual {v0}, Ll/ܿۗ֫;->᩷()V

    .line 527
    invoke-virtual {v0}, Ll/ܿۗ֫;->ۧ()Ll/ܿۗ֫;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 529
    iput-object v0, p0, Ll/ۜۗ֫;->ۢ:Ll/ܿۗ֫;

    .line 530
    iput-object v0, p0, Ll/ۜۗ֫;->ᩳ:Ll/ܿۗ֫;

    .line 531
    iput-object v0, p0, Ll/ۜۗ֫;->ᩴ:Ll/ܿۗ֫;

    .line 532
    iput-object v0, p0, Ll/ۜۗ֫;->ۘ:Ll/ܿۗ֫;

    const/4 v0, 0x0

    .line 533
    iput v0, p0, Ll/ۜۗ֫;->ܽ:I

    .line 534
    invoke-direct {p0}, Ll/ۜۗ֫;->ۖ()V

    return-void
.end method

.method public final ᩷()Ll/ܿۗ֫;
    .locals 1

    .line 381
    iget-object v0, p0, Ll/ۜۗ֫;->ᩴ:Ll/ܿۗ֫;

    return-object v0
.end method

.method public final ᩻()Ll/ܿۗ֫;
    .locals 1

    .line 366
    iget-object v0, p0, Ll/ۜۗ֫;->ۖ:Ll/ܿۗ֫;

    return-object v0
.end method
