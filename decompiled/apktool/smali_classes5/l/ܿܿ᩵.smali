.class public final Ll/ܿܿ᩵;
.super Ll/᩷֫᩵;
.source "N673"


# instance fields
.field public final synthetic s:J

.field public final synthetic t:J


# direct methods
.method public constructor <init>(Ll/ۨ֫᩵;IJJ)V
    .locals 0

    .line 115
    iput-wide p3, p0, Ll/ܿܿ᩵;->s:J

    iput-wide p5, p0, Ll/ܿܿ᩵;->t:J

    .line 94
    invoke-direct {p0, p1, p2}, Ll/۫᩺ᩴ;-><init>(Ll/۫᩺ᩴ;I)V

    return-void
.end method


# virtual methods
.method public final n0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;
    .locals 12

    .line 158
    invoke-virtual {p1, p2}, Ll/ۡ᩺ᩴ;->R(Ll/ܶ۫ᩴ;)J

    move-result-wide v0

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-lez v5, :cond_1

    const/16 v5, 0x4000

    .line 159
    invoke-interface {p2, v5}, Ll/ܶ۫ᩴ;->hasCharacteristics(I)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 165
    move-object v0, p1

    check-cast v0, Ll/۫᩺ᩴ;

    .line 461
    :goto_0
    iget v1, v0, Ll/۫᩺ᩴ;->l:I

    if-lez v1, :cond_0

    .line 462
    iget-object v0, v0, Ll/۫᩺ᩴ;->i:Ll/۫᩺ᩴ;

    goto :goto_0

    .line 464
    :cond_0
    invoke-virtual {v0}, Ll/۫᩺ᩴ;->m0()Ll/ۡ֫᩵;

    move-result-object v3

    .line 165
    iget-wide v5, p0, Ll/ܿܿ᩵;->s:J

    iget-wide v7, p0, Ll/ܿܿ᩵;->t:J

    move-object v4, p2

    invoke-static/range {v3 .. v8}, Ll/᩹ܰᩴ;->b(Ll/ۡ֫᩵;Ll/ܶ۫ᩴ;JJ)Ll/ܶ۫ᩴ;

    move-result-object p2

    .line 166
    invoke-static {p1, p2, v2, p3}, Ll/ۡ᩺ᩴ;->H(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;ZLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    return-object p1

    .line 167
    :cond_1
    sget-object v5, Ll/۟۟ᩴ;->ORDERED:Ll/۟۟ᩴ;

    move-object v6, p1

    check-cast v6, Ll/۫᩺ᩴ;

    .line 509
    iget v6, v6, Ll/۫᩺ᩴ;->m:I

    .line 167
    invoke-virtual {v5, v6}, Ll/۟۟ᩴ;->s(I)Z

    move-result v5

    if-nez v5, :cond_4

    .line 169
    invoke-virtual {p1, p2}, Ll/ۡ᩺ᩴ;->h0(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;

    move-result-object v7

    iget-wide p1, p0, Ll/ܿܿ᩵;->s:J

    iget-wide v5, p0, Ll/ܿܿ᩵;->t:J

    cmp-long v8, p1, v0

    if-gtz v8, :cond_3

    cmp-long v8, v5, v3

    sub-long/2addr v0, p1

    if-ltz v8, :cond_2

    .line 121
    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    :cond_2
    move-wide v10, v0

    move-wide v8, v3

    goto :goto_1

    :cond_3
    move-wide v8, p1

    move-wide v10, v5

    .line 124
    :goto_1
    new-instance p1, Ll/֫֫᩵;

    move-object v6, p1

    .line 1002
    invoke-direct/range {v6 .. v11}, Ll/᩹֫᩵;-><init>(Ll/ܶ۫ᩴ;JJ)V

    .line 175
    invoke-static {p0, p1, v2, p3}, Ll/ۡ᩺ᩴ;->H(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;ZLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    return-object p1

    .line 178
    :cond_4
    new-instance v9, Ll/ܺܰᩴ;

    iget-wide v5, p0, Ll/ܿܿ᩵;->s:J

    iget-wide v7, p0, Ll/ܿܿ᩵;->t:J

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v8}, Ll/ܺܰᩴ;-><init>(Ll/۫᩺ᩴ;Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;JJ)V

    .line 179
    invoke-virtual {v9}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚ۟ᩴ;

    return-object p1
.end method

.method public final o0(Ll/۫᩺ᩴ;Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;
    .locals 16

    move-object/from16 v9, p0

    .line 129
    invoke-virtual/range {p1 .. p2}, Ll/۫᩺ᩴ;->R(Ll/ܶ۫ᩴ;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/16 v4, 0x4000

    move-object/from16 v5, p2

    .line 130
    invoke-interface {v5, v4}, Ll/ܶ۫ᩴ;->hasCharacteristics(I)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 131
    new-instance v0, Ll/ܽܰᩴ;

    .line 132
    invoke-virtual/range {p1 .. p2}, Ll/۫᩺ᩴ;->h0(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;

    move-result-object v11

    iget-wide v12, v9, Ll/ܿܿ᩵;->s:J

    iget-wide v1, v9, Ll/ܿܿ᩵;->t:J

    .line 0
    invoke-static {v12, v13, v1, v2}, Ll/᩹ܰᩴ;->c(JJ)J

    move-result-wide v14

    move-object v10, v0

    .line 134
    invoke-direct/range {v10 .. v15}, Ll/ܽܰᩴ;-><init>(Ll/ܶ۫ᩴ;JJ)V

    return-object v0

    :cond_0
    move-object/from16 v5, p2

    .line 135
    :cond_1
    sget-object v4, Ll/۟۟ᩴ;->ORDERED:Ll/۟۟ᩴ;

    move-object/from16 v6, p1

    .line 509
    iget v7, v6, Ll/۫᩺ᩴ;->m:I

    .line 135
    invoke-virtual {v4, v7}, Ll/۟۟ᩴ;->s(I)Z

    move-result v4

    if-nez v4, :cond_4

    .line 137
    invoke-virtual/range {p1 .. p2}, Ll/۫᩺ᩴ;->h0(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;

    move-result-object v11

    iget-wide v4, v9, Ll/ܿܿ᩵;->s:J

    iget-wide v6, v9, Ll/ܿܿ᩵;->t:J

    cmp-long v8, v4, v0

    if-gtz v8, :cond_3

    cmp-long v8, v6, v2

    sub-long/2addr v0, v4

    if-ltz v8, :cond_2

    .line 121
    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    :cond_2
    move-wide v14, v0

    move-wide v12, v2

    goto :goto_0

    :cond_3
    move-wide v12, v4

    move-wide v14, v6

    .line 124
    :goto_0
    new-instance v0, Ll/֫֫᩵;

    move-object v10, v0

    .line 1002
    invoke-direct/range {v10 .. v15}, Ll/᩹֫᩵;-><init>(Ll/ܶ۫ᩴ;JJ)V

    return-object v0

    .line 149
    :cond_4
    new-instance v10, Ll/ܺܰᩴ;

    .line 77
    new-instance v4, Ll/᩻ܰᩴ;

    const/16 v0, 0xb

    .line 0
    invoke-direct {v4, v0}, Ll/᩻ܰᩴ;-><init>(I)V

    .line 149
    iget-wide v7, v9, Ll/ܿܿ᩵;->s:J

    iget-wide v11, v9, Ll/ܿܿ᩵;->t:J

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-wide v5, v7

    move-wide v7, v11

    invoke-direct/range {v0 .. v8}, Ll/ܺܰᩴ;-><init>(Ll/۫᩺ᩴ;Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;JJ)V

    .line 150
    invoke-virtual {v10}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚ۟ᩴ;

    invoke-interface {v0}, Ll/ۚ۟ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final q0(ILl/֡ᩳ᩵;)Ll/֡ᩳ᩵;
    .locals 0

    .line 185
    new-instance p1, Ll/۫ᩳ᩵;

    invoke-direct {p1, p0, p2}, Ll/۫ᩳ᩵;-><init>(Ll/ܿܿ᩵;Ll/֡ᩳ᩵;)V

    return-object p1
.end method
