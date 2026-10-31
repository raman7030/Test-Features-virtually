.class public final Ll/ۢ۬ᩳ;
.super Ljava/lang/Object;
.source "46TC"


# instance fields
.field public final ֫:Z

.field public final ۧ:J

.field public final ܽ:Ll/ܺۙᩳ;

.field public final ᩳ:Ll/ܺۙᩳ;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 10
    new-instance v1, Ll/ܺۙᩳ;

    invoke-direct {v1}, Ll/ܺۙᩳ;-><init>()V

    new-instance v2, Ll/ܺۙᩳ;

    invoke-direct {v2}, Ll/ܺۙᩳ;-><init>()V

    const-wide/16 v3, 0x1

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ll/ۢ۬ᩳ;-><init>(Ll/ܺۙᩳ;Ll/ܺۙᩳ;JZ)V

    return-void
.end method

.method public constructor <init>(Ll/ܺۙᩳ;Ll/ܺۙᩳ;JZ)V
    .locals 3

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v2, p3, v0

    if-lez v2, :cond_0

    .line 14
    iput-object p1, p0, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    .line 15
    iput-object p2, p0, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    .line 16
    iput-wide p3, p0, Ll/ۢ۬ᩳ;->ۧ:J

    .line 17
    iput-boolean p5, p0, Ll/ۢ۬ᩳ;->֫:Z

    return-void

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid next history identity"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ll/ܺۙᩳ;)J
    .locals 5

    .line 85
    invoke-virtual {p0}, Ll/ܺۙᩳ;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const-wide/16 v0, 0x0

    :cond_0
    :goto_0
    move-object v2, p0

    check-cast v2, Ll/᩷ۙᩳ;

    invoke-virtual {v2}, Ll/᩷ۙᩳ;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Ll/᩷ۙᩳ;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡ۬ᩳ;

    .line 90
    iget-object v2, v2, Ll/ۡ۬ᩳ;->֫:Ll/ܺۙᩳ;

    invoke-virtual {v2}, Ll/ܺۙᩳ;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    move-object v3, v2

    check-cast v3, Ll/᩷ۙᩳ;

    invoke-virtual {v3}, Ll/᩷ۙᩳ;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ll/᩷ۙᩳ;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺᩶ᩳ;

    invoke-virtual {v3}, Ll/᩺᩶ᩳ;->֫()Z

    move-result v3

    if-nez v3, :cond_1

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    goto :goto_0

    :cond_2
    return-wide v0
.end method

.method private ֫(Ll/ܺۙᩳ;JLl/ܰ᩶ᩳ;)Ll/ۢ۬ᩳ;
    .locals 11

    .line 41
    invoke-virtual {p1}, Ll/ܺۙᩳ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    .line 42
    iget-wide v3, p0, Ll/ۢ۬ᩳ;->ۧ:J

    cmp-long v2, v3, v0

    if-eqz v2, :cond_1

    .line 43
    new-instance v0, Ll/ۡ۬ᩳ;

    move-object v2, v0

    move-wide v5, p2

    move-object v7, p4

    move-object v8, p1

    invoke-direct/range {v2 .. v8}, Ll/ۡ۬ᩳ;-><init>(JJLl/ܰ᩶ᩳ;Ll/ܺۙᩳ;)V

    .line 44
    new-instance p1, Ll/ۢ۬ᩳ;

    iget-object p2, p0, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    invoke-virtual {p2, v0}, Ll/ܺۙᩳ;->֫(Ljava/lang/Object;)Ll/ܺۙᩳ;

    move-result-object v6

    new-instance v7, Ll/ܺۙᩳ;

    invoke-direct {v7}, Ll/ܺۙᩳ;-><init>()V

    iget-wide p2, p0, Ll/ۢ۬ᩳ;->ۧ:J

    const-wide/16 v0, 0x1

    add-long v8, p2, v0

    const/4 v10, 0x0

    move-object v5, p1

    invoke-direct/range {v5 .. v10}, Ll/ۢ۬ᩳ;-><init>(Ll/ܺۙᩳ;Ll/ܺۙᩳ;JZ)V

    return-object p1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "History identity exhausted"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫(Ll/ܳۙᩳ;JZ)Ll/ۢ۬ᩳ;
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    const-wide/16 v2, 0x0

    cmp-long v4, p2, v2

    if-ltz v4, :cond_9

    .line 63
    iget-object v5, v0, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    iget-object v6, v0, Ll/ۢ۬ᩳ;->ܽ:Ll/ܺۙᩳ;

    invoke-virtual {v1, v5, v6}, Ll/ܳۙᩳ;->֫(Ll/ܺۙᩳ;Ll/ܺۙᩳ;)V

    if-eqz p4, :cond_0

    if-lez v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_1

    .line 66
    invoke-virtual/range {p1 .. p1}, Ll/ܳۙᩳ;->֫()J

    move-result-wide v8

    cmp-long v10, v8, p2

    if-lez v10, :cond_1

    invoke-static {v5}, Ll/ۢ۬ᩳ;->֫(Ll/ܺۙᩳ;)J

    move-result-wide v2

    invoke-static {v6}, Ll/ۢ۬ᩳ;->֫(Ll/ܺۙᩳ;)J

    move-result-wide v8

    add-long/2addr v2, v8

    :cond_1
    move-object v9, v5

    move-object v10, v6

    .line 67
    :goto_1
    invoke-virtual/range {p1 .. p1}, Ll/ܳۙᩳ;->֫()J

    move-result-wide v11

    cmp-long v8, v11, p2

    if-lez v8, :cond_7

    const-wide/16 v11, 0x1

    if-eqz v4, :cond_2

    cmp-long v8, v2, v11

    if-eqz v8, :cond_7

    .line 68
    invoke-virtual {v9}, Ll/ܺۙᩳ;->ۧ()I

    move-result v8

    int-to-long v13, v8

    invoke-virtual {v10}, Ll/ܺۙᩳ;->ۧ()I

    move-result v8

    int-to-long v7, v8

    add-long/2addr v13, v7

    cmp-long v7, v13, v11

    if-nez v7, :cond_2

    goto :goto_3

    .line 70
    :cond_2
    invoke-virtual {v9}, Ll/ܺۙᩳ;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_3

    const/4 v7, 0x0

    .line 31
    invoke-virtual {v9, v7}, Ll/ܺۙᩳ;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 71
    check-cast v8, Ll/ۡ۬ᩳ;

    .line 72
    invoke-virtual {v9}, Ll/ܺۙᩳ;->removeFirst()Ll/ܺۙᩳ;

    move-result-object v9

    goto :goto_2

    :cond_3
    const/4 v7, 0x0

    .line 73
    invoke-virtual {v10}, Ll/ܺۙᩳ;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_6

    .line 31
    invoke-virtual {v10, v7}, Ll/ܺۙᩳ;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 74
    check-cast v8, Ll/ۡ۬ᩳ;

    .line 75
    invoke-virtual {v10}, Ll/ܺۙᩳ;->removeFirst()Ll/ܺۙᩳ;

    move-result-object v10

    :goto_2
    if-eqz v4, :cond_5

    .line 90
    iget-object v8, v8, Ll/ۡ۬ᩳ;->֫:Ll/ܺۙᩳ;

    invoke-virtual {v8}, Ll/ܺۙᩳ;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_4
    move-object v13, v8

    check-cast v13, Ll/᩷ۙᩳ;

    invoke-virtual {v13}, Ll/᩷ۙᩳ;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_5

    invoke-virtual {v13}, Ll/᩷ۙᩳ;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/᩺᩶ᩳ;

    invoke-virtual {v13}, Ll/᩺᩶ᩳ;->֫()Z

    move-result v13

    if-nez v13, :cond_4

    sub-long/2addr v2, v11

    .line 78
    :cond_5
    invoke-virtual {v1, v9, v10}, Ll/ܳۙᩳ;->֫(Ll/ܺۙᩳ;Ll/ܺۙᩳ;)V

    goto :goto_1

    .line 76
    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Nonempty budget without history roots"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    :goto_3
    if-ne v9, v5, :cond_8

    if-ne v10, v6, :cond_8

    return-object v0

    .line 80
    :cond_8
    new-instance v1, Ll/ۢ۬ᩳ;

    iget-wide v11, v0, Ll/ۢ۬ᩳ;->ۧ:J

    iget-boolean v13, v0, Ll/ۢ۬ᩳ;->֫:Z

    move-object v8, v1

    invoke-direct/range {v8 .. v13}, Ll/ۢ۬ᩳ;-><init>(Ll/ܺۙᩳ;Ll/ܺۙᩳ;JZ)V

    return-object v1

    .line 61
    :cond_9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid history budget"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ֫(Ll/ܺۙᩳ;J)Ll/ۢ۬ᩳ;
    .locals 1

    .line 37
    sget-object v0, Ll/ܰ᩶ᩳ;->᩹:Ll/ܰ᩶ᩳ;

    invoke-direct {p0, p1, p2, p3, v0}, Ll/ۢ۬ᩳ;->֫(Ll/ܺۙᩳ;JLl/ܰ᩶ᩳ;)Ll/ۢ۬ᩳ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩺᩶ᩳ;J)Ll/ۢ۬ᩳ;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v4, p2

    .line 28
    iget-boolean v2, v0, Ll/ۢ۬ᩳ;->֫:Z

    if-nez v2, :cond_5

    invoke-virtual/range {p0 .. p0}, Ll/ۢ۬ᩳ;->֫()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v8, v0, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    invoke-virtual {v8}, Ll/ܺۙᩳ;->last()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡ۬ᩳ;

    sget-object v3, Ll/ܰ᩶ᩳ;->۫:Ll/ܰ᩶ᩳ;

    .line 26
    iget-object v6, v2, Ll/ۡ۬ᩳ;->֫:Ll/ܺۙᩳ;

    iget-object v7, v2, Ll/ۡ۬ᩳ;->ܽ:Ll/ܰ᩶ᩳ;

    if-ne v7, v3, :cond_5

    .line 27
    iget-wide v2, v2, Ll/ۡ۬ᩳ;->ܳ:J

    cmp-long v7, v4, v2

    if-ltz v7, :cond_0

    sub-long v2, v4, v2

    goto :goto_0

    :cond_0
    sub-long/2addr v2, v4

    :goto_0
    const-wide/16 v9, 0x0

    cmp-long v7, v2, v9

    if-ltz v7, :cond_5

    const-wide/16 v9, 0xfa

    cmp-long v7, v2, v9

    if-gez v7, :cond_5

    .line 28
    invoke-virtual {v6}, Ll/ܺۙᩳ;->ۧ()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_1

    invoke-virtual {v6}, Ll/ܺۙᩳ;->last()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺᩶ᩳ;

    invoke-virtual {v2}, Ll/᩺᩶ᩳ;->֫()Z

    move-result v2

    if-nez v2, :cond_5

    .line 29
    :cond_1
    invoke-virtual {v8}, Ll/ܺۙᩳ;->last()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡ۬ᩳ;

    .line 32
    iget-object v3, v2, Ll/ۡ۬ᩳ;->֫:Ll/ܺۙᩳ;

    invoke-virtual {v3}, Ll/ܺۙᩳ;->last()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩺᩶ᩳ;

    .line 36
    iget v7, v6, Ll/᩺᩶ᩳ;->ۜ:I

    int-to-long v9, v7

    iget-object v7, v6, Ll/᩺᩶ᩳ;->֫:Ll/ۨ᩹ᩳ;

    invoke-virtual {v7}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v11

    int-to-long v11, v11

    add-long/2addr v9, v11

    .line 37
    invoke-virtual/range {p1 .. p1}, Ll/᩺᩶ᩳ;->֫()Z

    move-result v11

    iget-object v12, v1, Ll/᩺᩶ᩳ;->᩻:Ll/ۚۗᩳ;

    if-nez v11, :cond_3

    iget-wide v13, v6, Ll/᩺᩶ᩳ;->ۧ:J

    iget-wide v4, v1, Ll/᩺᩶ᩳ;->ܽ:J

    cmp-long v11, v13, v4

    if-nez v11, :cond_3

    iget v4, v1, Ll/᩺᩶ᩳ;->ۜ:I

    int-to-long v4, v4

    cmp-long v11, v4, v9

    if-nez v11, :cond_3

    .line 38
    invoke-virtual {v12}, Ll/ۚۗᩳ;->ܽ()I

    move-result v4

    int-to-long v4, v4

    cmp-long v11, v4, v9

    if-nez v11, :cond_3

    invoke-virtual {v12}, Ll/ۚۗᩳ;->֫()I

    move-result v4

    int-to-long v4, v4

    cmp-long v11, v4, v9

    if-nez v11, :cond_3

    iget-object v4, v1, Ll/᩺᩶ᩳ;->ܳ:Ll/ۨ᩹ᩳ;

    invoke-virtual {v4}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    .line 39
    :cond_2
    new-instance v4, Ll/᩺᩶ᩳ;

    iget v10, v6, Ll/᩺᩶ᩳ;->ۜ:I

    iget-wide v11, v6, Ll/᩺᩶ᩳ;->ܽ:J

    iget-wide v13, v1, Ll/᩺᩶ᩳ;->ۧ:J

    iget-object v15, v6, Ll/᩺᩶ᩳ;->᩻:Ll/ۚۗᩳ;

    iget-object v5, v6, Ll/᩺᩶ᩳ;->ܳ:Ll/ۨ᩹ᩳ;

    iget-object v6, v1, Ll/᩺᩶ᩳ;->֫:Ll/ۨ᩹ᩳ;

    invoke-virtual {v7, v6}, Ll/ۨ᩹ᩳ;->֫(Ll/ۨ᩹ᩳ;)Ll/ۨ᩹ᩳ;

    move-result-object v17

    move-object v9, v4

    move-object/from16 v16, v5

    invoke-direct/range {v9 .. v17}, Ll/᩺᩶ᩳ;-><init>(IJJLl/ۚۗᩳ;Ll/ۨ᩹ᩳ;Ll/ۨ᩹ᩳ;)V

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v4, 0x0

    .line 33
    :goto_2
    new-instance v9, Ll/ۡ۬ᩳ;

    iget-wide v5, v2, Ll/ۡ۬ᩳ;->ۧ:J

    iget-object v7, v2, Ll/ۡ۬ᩳ;->ܽ:Ll/ܰ᩶ᩳ;

    if-nez v4, :cond_4

    invoke-virtual {v3, v1}, Ll/ܺۙᩳ;->֫(Ljava/lang/Object;)Ll/ܺۙᩳ;

    move-result-object v1

    goto :goto_3

    :cond_4
    invoke-virtual {v3, v4}, Ll/ܺۙᩳ;->ۧ(Ljava/lang/Object;)Ll/ܺۙᩳ;

    move-result-object v1

    :goto_3
    move-object v10, v1

    move-object v1, v9

    move-wide v2, v5

    move-wide/from16 v4, p2

    move-object v6, v7

    move-object v7, v10

    invoke-direct/range {v1 .. v7}, Ll/ۡ۬ᩳ;-><init>(JJLl/ܰ᩶ᩳ;Ll/ܺۙᩳ;)V

    .line 30
    new-instance v1, Ll/ۢ۬ᩳ;

    invoke-virtual {v8, v9}, Ll/ܺۙᩳ;->ۧ(Ljava/lang/Object;)Ll/ܺۙᩳ;

    move-result-object v12

    new-instance v13, Ll/ܺۙᩳ;

    invoke-direct {v13}, Ll/ܺۙᩳ;-><init>()V

    iget-wide v14, v0, Ll/ۢ۬ᩳ;->ۧ:J

    const/16 v16, 0x0

    move-object v11, v1

    invoke-direct/range {v11 .. v16}, Ll/ۢ۬ᩳ;-><init>(Ll/ܺۙᩳ;Ll/ܺۙᩳ;JZ)V

    return-object v1

    .line 32
    :cond_5
    new-instance v2, Ll/ܺۙᩳ;

    invoke-direct {v2}, Ll/ܺۙᩳ;-><init>()V

    invoke-virtual {v2, v1}, Ll/ܺۙᩳ;->֫(Ljava/lang/Object;)Ll/ܺۙᩳ;

    move-result-object v1

    sget-object v2, Ll/ܰ᩶ᩳ;->۫:Ll/ܰ᩶ᩳ;

    move-wide/from16 v3, p2

    invoke-direct {v0, v1, v3, v4, v2}, Ll/ۢ۬ᩳ;->֫(Ll/ܺۙᩳ;JLl/ܰ᩶ᩳ;)Ll/ۢ۬ᩳ;

    move-result-object v1

    return-object v1
.end method

.method public final ֫()Z
    .locals 1

    .line 20
    iget-object v0, p0, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    invoke-virtual {v0}, Ll/ܺۙᩳ;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ۧ()Ll/ۡ۬ᩳ;
    .locals 1

    .line 22
    invoke-virtual {p0}, Ll/ۢ۬ᩳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۢ۬ᩳ;->ᩳ:Ll/ܺۙᩳ;

    invoke-virtual {v0}, Ll/ܺۙᩳ;->last()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۡ۬ᩳ;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
