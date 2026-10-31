.class public final Ll/ۨ᩻ۧ;
.super Ljava/lang/Object;
.source "78NK"


# instance fields
.field public final ֫:Ll/۫ܳۧ;

.field public final ۜ:Ll/᩷֨֫;

.field public final ۡ:Ll/᩷֨֫;

.field public final ۢ:Ll/᩶᩻ۧ;

.field public ۧ:J

.field public ܳ:Ll/ۜ֡֫;

.field public ܽ:J

.field public ܿ:J

.field public ᩳ:J

.field public final ᩷:Ll/ۙ᩻ۧ;

.field public final ᩻:Ll/ۗۚ֫;


# direct methods
.method public constructor <init>(Ll/۫ܳۧ;Ll/ۙ᩻ۧ;)V
    .locals 1

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    iput-object p1, p0, Ll/ۨ᩻ۧ;->֫:Ll/۫ܳۧ;

    .line 93
    iput-object p2, p0, Ll/ۨ᩻ۧ;->᩷:Ll/ۙ᩻ۧ;

    .line 94
    new-instance p1, Ll/᩶᩻ۧ;

    invoke-direct {p1}, Ll/᩶᩻ۧ;-><init>()V

    iput-object p1, p0, Ll/ۨ᩻ۧ;->ۢ:Ll/᩶᩻ۧ;

    .line 95
    new-instance p1, Ll/᩷֨֫;

    invoke-direct {p1}, Ll/᩷֨֫;-><init>()V

    iput-object p1, p0, Ll/ۨ᩻ۧ;->ۡ:Ll/᩷֨֫;

    .line 96
    new-instance p1, Ll/᩷֨֫;

    invoke-direct {p1}, Ll/᩷֨֫;-><init>()V

    iput-object p1, p0, Ll/ۨ᩻ۧ;->ۜ:Ll/᩷֨֫;

    .line 97
    new-instance p1, Ll/ۗۚ֫;

    invoke-direct {p1}, Ll/ۗۚ֫;-><init>()V

    iput-object p1, p0, Ll/ۨ᩻ۧ;->᩻:Ll/ۗۚ֫;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 98
    iput-wide p1, p0, Ll/ۨ᩻ۧ;->ܽ:J

    .line 99
    sget-object v0, Ll/ۜ֡֫;->ᩳ:Ll/ۜ֡֫;

    iput-object v0, p0, Ll/ۨ᩻ۧ;->ܳ:Ll/ۜ֡֫;

    .line 100
    iput-wide p1, p0, Ll/ۨ᩻ۧ;->ᩳ:J

    .line 101
    iput-wide p1, p0, Ll/ۨ᩻ۧ;->ۧ:J

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 106
    iget-object v0, p0, Ll/ۨ᩻ۧ;->᩻:Ll/ۗۚ֫;

    invoke-virtual {v0}, Ll/ۗۚ֫;->֫()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 107
    iput-wide v0, p0, Ll/ۨ᩻ۧ;->ܽ:J

    .line 108
    iput-wide v0, p0, Ll/ۨ᩻ۧ;->ᩳ:J

    .line 109
    iput-wide v0, p0, Ll/ۨ᩻ۧ;->ۧ:J

    .line 110
    iget-object v0, p0, Ll/ۨ᩻ۧ;->ۜ:Ll/᩷֨֫;

    invoke-virtual {v0}, Ll/᩷֨֫;->ܽ()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lez v1, :cond_2

    .line 282
    invoke-virtual {v0}, Ll/᩷֨֫;->ܽ()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->֫(Z)V

    .line 283
    :goto_1
    invoke-virtual {v0}, Ll/᩷֨֫;->ܽ()I

    move-result v1

    if-le v1, v3, :cond_1

    .line 284
    invoke-virtual {v0}, Ll/᩷֨֫;->ۧ()Ljava/lang/Object;

    goto :goto_1

    .line 286
    :cond_1
    invoke-virtual {v0}, Ll/᩷֨֫;->ۧ()Ljava/lang/Object;

    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۨ᩻ۧ;->ܿ:J

    .line 117
    :cond_2
    iget-object v0, p0, Ll/ۨ᩻ۧ;->ۡ:Ll/᩷֨֫;

    invoke-virtual {v0}, Ll/᩷֨֫;->ܽ()I

    move-result v1

    if-lez v1, :cond_5

    .line 282
    invoke-virtual {v0}, Ll/᩷֨֫;->ܽ()I

    move-result v1

    if-lez v1, :cond_3

    const/4 v2, 0x1

    :cond_3
    invoke-static {v2}, Ll/᩺֡֫;->֫(Z)V

    .line 283
    :goto_2
    invoke-virtual {v0}, Ll/᩷֨֫;->ܽ()I

    move-result v1

    if-le v1, v3, :cond_4

    .line 284
    invoke-virtual {v0}, Ll/᩷֨֫;->ۧ()Ljava/lang/Object;

    goto :goto_2

    .line 286
    :cond_4
    invoke-virtual {v0}, Ll/᩷֨֫;->ۧ()Ljava/lang/Object;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    check-cast v1, Ll/ۜ֡֫;

    const-wide/16 v2, 0x0

    .line 121
    invoke-virtual {v0, v2, v3, v1}, Ll/᩷֨֫;->֫(JLjava/lang/Object;)V

    :cond_5
    return-void
.end method

.method public final ֫(II)V
    .locals 5

    .line 177
    iget-wide v0, p0, Ll/ۨ᩻ۧ;->ܽ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    :goto_0
    new-instance v2, Ll/ۜ֡֫;

    invoke-direct {v2, p1, p2}, Ll/ۜ֡֫;-><init>(II)V

    .line 176
    iget-object p1, p0, Ll/ۨ᩻ۧ;->ۡ:Ll/᩷֨֫;

    invoke-virtual {p1, v0, v1, v2}, Ll/᩷֨֫;->֫(JLjava/lang/Object;)V

    return-void
.end method

.method public final ֫(IJ)V
    .locals 4

    .line 184
    iget-object v0, p0, Ll/ۨ᩻ۧ;->᩻:Ll/ۗۚ֫;

    invoke-virtual {v0}, Ll/ۗۚ֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 185
    iget-object v0, p0, Ll/ۨ᩻ۧ;->᩷:Ll/ۙ᩻ۧ;

    invoke-virtual {v0, p1}, Ll/ۙ᩻ۧ;->֫(I)V

    .line 186
    iput-wide p2, p0, Ll/ۨ᩻ۧ;->ܿ:J

    return-void

    .line 191
    :cond_0
    iget-wide v0, p0, Ll/ۨ᩻ۧ;->ܽ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v2

    if-nez p1, :cond_1

    const-wide/high16 v0, -0x4000000000000000L    # -2.0

    goto :goto_0

    :cond_1
    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    .line 194
    :goto_0
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    .line 190
    iget-object p2, p0, Ll/ۨ᩻ۧ;->ۜ:Ll/᩷֨֫;

    invoke-virtual {p2, v0, v1, p1}, Ll/᩷֨֫;->֫(JLjava/lang/Object;)V

    return-void
.end method

.method public final ֫(J)V
    .locals 1

    .line 204
    iget-object v0, p0, Ll/ۨ᩻ۧ;->᩻:Ll/ۗۚ֫;

    invoke-virtual {v0, p1, p2}, Ll/ۗۚ֫;->֫(J)V

    .line 205
    iput-wide p1, p0, Ll/ۨ᩻ۧ;->ܽ:J

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 206
    iput-wide p1, p0, Ll/ۨ᩻ۧ;->ۧ:J

    return-void
.end method

.method public final ֫(JJ)V
    .locals 21

    move-object/from16 v0, p0

    .line 133
    :goto_0
    iget-object v1, v0, Ll/ۨ᩻ۧ;->᩻:Ll/ۗۚ֫;

    invoke-virtual {v1}, Ll/ۗۚ֫;->ܽ()Z

    move-result v2

    if-nez v2, :cond_8

    .line 134
    invoke-virtual {v1}, Ll/ۗۚ֫;->ۧ()J

    move-result-wide v14

    .line 261
    iget-object v2, v0, Ll/ۨ᩻ۧ;->ۜ:Ll/᩷֨֫;

    invoke-virtual {v2, v14, v15}, Ll/᩷֨֫;->ۧ(J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    const/4 v13, 0x2

    .line 262
    iget-object v12, v0, Ll/ۨ᩻ۧ;->᩷:Ll/ۙ᩻ۧ;

    if-eqz v2, :cond_0

    .line 263
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-wide v5, v0, Ll/ۨ᩻ۧ;->ܿ:J

    cmp-long v7, v3, v5

    if-eqz v7, :cond_0

    .line 264
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iput-wide v2, v0, Ll/ۨ᩻ۧ;->ܿ:J

    .line 137
    invoke-virtual {v12, v13}, Ll/ۙ᩻ۧ;->֫(I)V

    .line 141
    :cond_0
    iget-wide v10, v0, Ll/ۨ᩻ۧ;->ܿ:J

    const/4 v2, 0x0

    const/16 v16, 0x0

    .line 142
    iget-object v3, v0, Ll/ۨ᩻ۧ;->᩷:Ll/ۙ᩻ۧ;

    iget-object v8, v0, Ll/ۨ᩻ۧ;->ۢ:Ll/᩶᩻ۧ;

    move-wide v4, v14

    move-wide/from16 v6, p1

    move-object/from16 v17, v8

    move-wide/from16 v8, p3

    move-object/from16 v18, v12

    move v12, v2

    const/4 v2, 0x2

    move/from16 v13, v16

    move-wide/from16 v19, v14

    move-object/from16 v14, v17

    invoke-virtual/range {v3 .. v14}, Ll/ۙ᩻ۧ;->֫(JJJJZZLl/᩶᩻ۧ;)I

    move-result v3

    .line 150
    iget-object v4, v0, Ll/ۨ᩻ۧ;->֫:Ll/۫ܳۧ;

    const/4 v5, 0x1

    if-eqz v3, :cond_4

    if-eq v3, v5, :cond_4

    if-eq v3, v2, :cond_3

    const/4 v2, 0x3

    if-eq v3, v2, :cond_3

    const/4 v1, 0x4

    if-eq v3, v1, :cond_2

    const/4 v1, 0x5

    if-ne v3, v1, :cond_1

    goto/16 :goto_3

    .line 169
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    move-wide/from16 v6, v19

    .line 159
    iput-wide v6, v0, Ll/ۨ᩻ۧ;->ᩳ:J

    goto :goto_0

    :cond_3
    move-wide/from16 v6, v19

    .line 155
    iput-wide v6, v0, Ll/ۨ᩻ۧ;->ᩳ:J

    .line 240
    invoke-virtual {v1}, Ll/ۗۚ֫;->ᩳ()J

    .line 299
    iget-object v1, v4, Ll/۫ܳۧ;->ۧ:Ll/ۤܳۧ;

    invoke-static {v1}, Ll/ۤܳۧ;->ܽ(Ll/ۤܳۧ;)Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Ll/ۗܳۧ;

    invoke-direct {v3, v4}, Ll/ۗܳۧ;-><init>(Ll/۫ܳۧ;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 300
    invoke-static {v1}, Ll/ۤܳۧ;->ܿ(Ll/ۤܳۧ;)Ljava/util/ArrayDeque;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳۜۧ;

    invoke-interface {v1}, Ll/ܳۜۧ;->skip()V

    goto/16 :goto_0

    :cond_4
    move-wide/from16 v6, v19

    .line 163
    iput-wide v6, v0, Ll/ۨ᩻ۧ;->ᩳ:J

    if-nez v3, :cond_5

    goto :goto_1

    :cond_5
    const/4 v5, 0x0

    .line 245
    :goto_1
    invoke-virtual {v1}, Ll/ۗۚ֫;->ᩳ()J

    move-result-wide v7

    .line 271
    iget-object v1, v0, Ll/ۨ᩻ۧ;->ۡ:Ll/᩷֨֫;

    invoke-virtual {v1, v7, v8}, Ll/᩷֨֫;->ۧ(J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜ֡֫;

    if-eqz v1, :cond_6

    .line 272
    sget-object v2, Ll/ۜ֡֫;->ᩳ:Ll/ۜ֡֫;

    .line 273
    invoke-virtual {v1, v2}, Ll/ۜ֡֫;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, v0, Ll/ۨ᩻ۧ;->ܳ:Ll/ۜ֡֫;

    .line 274
    invoke-virtual {v1, v2}, Ll/ۜ֡֫;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 275
    iput-object v1, v0, Ll/ۨ᩻ۧ;->ܳ:Ll/ۜ֡֫;

    .line 249
    invoke-virtual {v4, v1}, Ll/۫ܳۧ;->֫(Ll/ۜ֡֫;)V

    :cond_6
    if-eqz v5, :cond_7

    .line 50
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    goto :goto_2

    .line 254
    :cond_7
    invoke-virtual/range {v17 .. v17}, Ll/᩶᩻ۧ;->ۧ()J

    move-result-wide v1

    :goto_2
    move-wide v5, v1

    .line 256
    invoke-virtual/range {v18 .. v18}, Ll/ۙ᩻ۧ;->ۧ()Z

    move-result v9

    .line 255
    invoke-virtual/range {v4 .. v9}, Ll/۫ܳۧ;->֫(JJZ)V

    goto/16 :goto_0

    :cond_8
    :goto_3
    return-void
.end method

.method public final ۧ()Z
    .locals 5

    .line 235
    iget-wide v0, p0, Ll/ۨ᩻ۧ;->ۧ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-wide v2, p0, Ll/ۨ᩻ۧ;->ᩳ:J

    cmp-long v4, v2, v0

    if-nez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()V
    .locals 5

    .line 216
    iget-wide v0, p0, Ll/ۨ᩻ۧ;->ܽ:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    .line 220
    iput-wide v0, p0, Ll/ۨ᩻ۧ;->ܽ:J

    .line 221
    iput-wide v0, p0, Ll/ۨ᩻ۧ;->ᩳ:J

    .line 223
    :cond_0
    iget-wide v0, p0, Ll/ۨ᩻ۧ;->ܽ:J

    iput-wide v0, p0, Ll/ۨ᩻ۧ;->ۧ:J

    return-void
.end method
