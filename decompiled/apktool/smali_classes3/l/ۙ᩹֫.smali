.class public abstract Ll/ۙ᩹֫;
.super Ljava/lang/Object;
.source "C8I7"

# interfaces
.implements Ll/֫۬֫;
.implements Ll/ᩳ۬֫;


# instance fields
.field public ֫֫:Z

.field public ۗ:J

.field public ۙ:I

.field public ۛ:J

.field public ۟:[Ll/۠ᩴ֫;

.field public ۤ:Ll/ܰ۬֫;

.field public ۧ֫:J

.field public ۨ:Ll/ܽ۬֫;

.field public ۫:Ll/ܺۧۧ;

.field public final ۬:Ljava/lang/Object;

.field public ܰ:Ll/ᩴܽۧ;

.field public ܽ֫:Z

.field public final ܿ֫:I

.field public ᩳ֫:Ll/ۙ᩵֫;

.field public final ᩶:Ll/ۗۙ֫;

.field public ᩸:Ll/ܽۚ֫;

.field public ᩹:Ll/ܿ۬֫;

.field public ᩺:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۙ᩹֫;->۬:Ljava/lang/Object;

    .line 99
    iput p1, p0, Ll/ۙ᩹֫;->ܿ֫:I

    .line 100
    new-instance p1, Ll/ۗۙ֫;

    .line 25
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 100
    iput-object p1, p0, Ll/ۙ᩹֫;->᩶:Ll/ۗۙ֫;

    const-wide/high16 v0, -0x8000000000000000L

    .line 101
    iput-wide v0, p0, Ll/ۙ᩹֫;->ۛ:J

    .line 102
    sget-object p1, Ll/ۙ᩵֫;->֫:Ll/ۙ᩵֫;

    iput-object p1, p0, Ll/ۙ᩹֫;->ᩳ֫:Ll/ۙ᩵֫;

    return-void
.end method


# virtual methods
.method public final getState()I
    .locals 1

    .line 131
    iget v0, p0, Ll/ۙ᩹֫;->᩺:I

    return v0
.end method

.method public final reset()V
    .locals 1

    .line 253
    iget v0, p0, Ll/ۙ᩹֫;->᩺:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 254
    iget-object v0, p0, Ll/ۙ᩹֫;->᩶:Ll/ۗۙ֫;

    invoke-virtual {v0}, Ll/ۗۙ֫;->֫()V

    .line 255
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩺()V

    return-void
.end method

.method public final start()V
    .locals 2

    .line 157
    iget v0, p0, Ll/ۙ᩹֫;->᩺:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    const/4 v0, 0x2

    .line 158
    iput v0, p0, Ll/ۙ᩹֫;->᩺:I

    .line 159
    invoke-virtual {p0}, Ll/ۙ᩹֫;->ܰ()V

    return-void
.end method

.method public final stop()V
    .locals 3

    .line 234
    iget v0, p0, Ll/ۙ᩹֫;->᩺:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 235
    iput v2, p0, Ll/ۙ᩹֫;->᩺:I

    .line 236
    invoke-virtual {p0}, Ll/ۙ᩹֫;->۟()V

    return-void
.end method

.method public final ֡()J
    .locals 2

    .line 194
    iget-wide v0, p0, Ll/ۙ᩹֫;->ۛ:J

    return-wide v0
.end method

.method public final ֨()V
    .locals 2

    .line 280
    iget-object v0, p0, Ll/ۙ᩹֫;->۬:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 281
    :try_start_0
    iput-object v1, p0, Ll/ۙ᩹֫;->ۨ:Ll/ܽ۬֫;

    .line 282
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(Ll/ۗۙ֫;Ll/᩸᩸֫;I)I
    .locals 5

    .line 577
    iget-object v0, p0, Ll/ۙ᩹֫;->ܰ:Ll/ᩴܽۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 577
    invoke-interface {v0, p1, p2, p3}, Ll/ᩴܽۧ;->֫(Ll/ۗۙ֫;Ll/᩸᩸֫;I)I

    move-result p3

    const/4 v0, -0x4

    if-ne p3, v0, :cond_2

    .line 579
    invoke-virtual {p2}, Ll/ۘ᩸֫;->᩻()Z

    move-result p1

    if-eqz p1, :cond_1

    const-wide/high16 p1, -0x8000000000000000L

    .line 580
    iput-wide p1, p0, Ll/ۙ᩹֫;->ۛ:J

    .line 581
    iget-boolean p1, p0, Ll/ۙ᩹֫;->֫֫:Z

    if-eqz p1, :cond_0

    return v0

    :cond_0
    const/4 p1, -0x3

    return p1

    .line 583
    :cond_1
    iget-wide v0, p2, Ll/᩸᩸֫;->ۤ:J

    iget-wide v2, p0, Ll/ۙ᩹֫;->ۧ֫:J

    add-long/2addr v0, v2

    iput-wide v0, p2, Ll/᩸᩸֫;->ۤ:J

    .line 584
    iget-wide p1, p0, Ll/ۙ᩹֫;->ۛ:J

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۙ᩹֫;->ۛ:J

    return p3

    :cond_2
    const/4 p2, -0x5

    if-ne p3, p2, :cond_3

    .line 586
    iget-object p2, p1, Ll/ۗۙ֫;->ۧ:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v0, p2, Ll/۠ᩴ֫;->ܳ֫:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v4, v0, v2

    if-eqz v4, :cond_3

    .line 590
    invoke-virtual {p2}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object p2

    iget-wide v2, p0, Ll/ۙ᩹֫;->ۧ֫:J

    add-long/2addr v0, v2

    .line 591
    invoke-virtual {p2, v0, v1}, Ll/֨ᩴ֫;->֫(J)V

    .line 592
    invoke-virtual {p2}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p2

    .line 593
    iput-object p2, p1, Ll/ۗۙ֫;->ۧ:Ll/۠ᩴ֫;

    :cond_3
    return p3
.end method

.method public final ֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;I)Ll/ᩳ᩶֫;
    .locals 1

    const/4 v0, 0x0

    .line 514
    invoke-virtual {p0, p1, p2, v0, p3}, Ll/ۙ᩹֫;->֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;ZI)Ll/ᩳ᩶֫;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/Throwable;Ll/۠ᩴ֫;ZI)Ll/ᩳ᩶֫;
    .locals 10

    if-eqz p2, :cond_0

    .line 534
    iget-boolean v0, p0, Ll/ۙ᩹֫;->ܽ֫:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 536
    iput-boolean v0, p0, Ll/ۙ᩹֫;->ܽ֫:Z

    const/4 v0, 0x0

    .line 538
    :try_start_0
    invoke-interface {p0, p2}, Ll/ᩳ۬֫;->֫(Ll/۠ᩴ֫;)I

    move-result v1
    :try_end_0
    .catch Ll/ᩳ᩶֫; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    and-int/lit8 v1, v1, 0x7

    .line 542
    iput-boolean v0, p0, Ll/ۙ᩹֫;->ܽ֫:Z

    move v6, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    iput-boolean v0, p0, Ll/ۙ᩹֫;->ܽ֫:Z

    .line 543
    throw p1

    .line 542
    :catch_0
    iput-boolean v0, p0, Ll/ۙ᩹֫;->ܽ֫:Z

    :cond_0
    const/4 v1, 0x4

    const/4 v6, 0x4

    .line 547
    :goto_0
    invoke-interface {p0}, Ll/֫۬֫;->getName()Ljava/lang/String;

    move-result-object v3

    .line 466
    iget v4, p0, Ll/ۙ᩹֫;->ۙ:I

    .line 548
    iget-object v7, p0, Ll/ۙ᩹֫;->۫:Ll/ܺۧۧ;

    move-object v2, p1

    move-object v5, p2

    move v8, p3

    move v9, p4

    .line 545
    invoke-static/range {v2 .. v9}, Ll/ᩳ᩶֫;->֫(Ljava/lang/Throwable;Ljava/lang/String;ILl/۠ᩴ֫;ILl/ܺۧۧ;ZI)Ll/ᩳ᩶֫;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()V
    .locals 1

    .line 260
    iget v0, p0, Ll/ۙ᩹֫;->᩺:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 261
    invoke-virtual {p0}, Ll/ۙ᩹֫;->ۛ()V

    return-void
.end method

.method public synthetic ֫(FF)V
    .locals 0

    return-void
.end method

.method public ֫(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final ֫(ILl/ܰ۬֫;Ll/ܽۚ֫;)V
    .locals 0

    .line 117
    iput p1, p0, Ll/ۙ᩹֫;->ۙ:I

    .line 118
    iput-object p2, p0, Ll/ۙ᩹֫;->ۤ:Ll/ܰ۬֫;

    .line 119
    iput-object p3, p0, Ll/ۙ᩹֫;->᩸:Ll/ܽۚ֫;

    return-void
.end method

.method public final ֫(J)V
    .locals 1

    const/4 v0, 0x0

    .line 226
    iput-boolean v0, p0, Ll/ۙ᩹֫;->֫֫:Z

    .line 227
    iput-wide p1, p0, Ll/ۙ᩹֫;->ۗ:J

    .line 228
    iput-wide p1, p0, Ll/ۙ᩹֫;->ۛ:J

    .line 229
    invoke-virtual {p0, p1, p2, v0}, Ll/ۙ᩹֫;->֫(JZ)V

    return-void
.end method

.method public abstract ֫(JZ)V
.end method

.method public final ֫(Ll/ۙ᩵֫;)V
    .locals 1

    .line 214
    iget-object v0, p0, Ll/ۙ᩹֫;->ᩳ֫:Ll/ۙ᩵֫;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 215
    iput-object p1, p0, Ll/ۙ᩹֫;->ᩳ֫:Ll/ۙ᩵֫;

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ܽ۬֫;)V
    .locals 1

    .line 273
    iget-object v0, p0, Ll/ۙ᩹֫;->۬:Ljava/lang/Object;

    monitor-enter v0

    .line 274
    :try_start_0
    iput-object p1, p0, Ll/ۙ᩹֫;->ۨ:Ll/ܽ۬֫;

    .line 275
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ܿ۬֫;[Ll/۠ᩴ֫;Ll/ᩴܽۧ;ZZJJLl/ܺۧۧ;)V
    .locals 13

    move-object v8, p0

    move/from16 v9, p4

    move-wide/from16 v10, p6

    .line 146
    iget v0, v8, Ll/ۙ᩹֫;->᩺:I

    const/4 v12, 0x0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    move-object v0, p1

    .line 147
    iput-object v0, v8, Ll/ۙ᩹֫;->᩹:Ll/ܿ۬֫;

    move-object/from16 v7, p10

    .line 148
    iput-object v7, v8, Ll/ۙ᩹֫;->۫:Ll/ܺۧۧ;

    .line 149
    iput v1, v8, Ll/ۙ᩹֫;->᩺:I

    move/from16 v0, p5

    .line 150
    invoke-virtual {p0, v9, v0}, Ll/ۙ᩹֫;->֫(ZZ)V

    move-object v0, p0

    move-object v1, p2

    move-object/from16 v2, p3

    move-wide/from16 v3, p6

    move-wide/from16 v5, p8

    .line 151
    invoke-virtual/range {v0 .. v7}, Ll/ۙ᩹֫;->֫([Ll/۠ᩴ֫;Ll/ᩴܽۧ;JJLl/ܺۧۧ;)V

    .line 226
    iput-boolean v12, v8, Ll/ۙ᩹֫;->֫֫:Z

    .line 227
    iput-wide v10, v8, Ll/ۙ᩹֫;->ۗ:J

    .line 228
    iput-wide v10, v8, Ll/ۙ᩹֫;->ۛ:J

    .line 229
    invoke-virtual {p0, v10, v11, v9}, Ll/ۙ᩹֫;->֫(JZ)V

    return-void
.end method

.method public ֫(ZZ)V
    .locals 0

    return-void
.end method

.method public ֫([Ll/۠ᩴ֫;JJLl/ܺۧۧ;)V
    .locals 0

    return-void
.end method

.method public final ֫([Ll/۠ᩴ֫;Ll/ᩴܽۧ;JJLl/ܺۧۧ;)V
    .locals 7

    .line 170
    iget-boolean v0, p0, Ll/ۙ᩹֫;->֫֫:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 171
    iput-object p2, p0, Ll/ۙ᩹֫;->ܰ:Ll/ᩴܽۧ;

    .line 172
    iput-object p7, p0, Ll/ۙ᩹֫;->۫:Ll/ܺۧۧ;

    .line 173
    iget-wide v0, p0, Ll/ۙ᩹֫;->ۛ:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    .line 174
    iput-wide p3, p0, Ll/ۙ᩹֫;->ۛ:J

    .line 176
    :cond_0
    iput-object p1, p0, Ll/ۙ᩹֫;->۟:[Ll/۠ᩴ֫;

    .line 177
    iput-wide p5, p0, Ll/ۙ᩹֫;->ۧ֫:J

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p3

    move-wide v4, p5

    move-object v6, p7

    .line 178
    invoke-virtual/range {v0 .. v6}, Ll/ۙ᩹֫;->֫([Ll/۠ᩴ֫;JJLl/ܺۧۧ;)V

    return-void
.end method

.method public final ۖ()I
    .locals 1

    .line 107
    iget v0, p0, Ll/ۙ᩹֫;->ܿ֫:I

    return v0
.end method

.method public final ۗ()J
    .locals 2

    .line 431
    iget-wide v0, p0, Ll/ۙ᩹֫;->ۧ֫:J

    return-wide v0
.end method

.method public final ۘ()Ll/ۙ᩹֫;
    .locals 0

    return-object p0
.end method

.method public final ۙ()[Ll/۠ᩴ֫;
    .locals 1

    .line 447
    iget-object v0, p0, Ll/ۙ᩹֫;->۟:[Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0
.end method

.method public ۚ()Ll/᩺ۙ֫;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ۛ()V
    .locals 0

    return-void
.end method

.method public synthetic ۜ()V
    .locals 0

    return-void
.end method

.method public ۟()V
    .locals 0

    return-void
.end method

.method public final ۠()Ll/ܽۚ֫;
    .locals 1

    .line 484
    iget-object v0, p0, Ll/ۙ᩹֫;->᩸:Ll/ܽۚ֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0
.end method

.method public final ۡ()V
    .locals 1

    .line 209
    iget-object v0, p0, Ll/ۙ᩹֫;->ܰ:Ll/ᩴܽۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    invoke-interface {v0}, Ll/ᩴܽۧ;->֫()V

    return-void
.end method

.method public abstract ۤ()V
.end method

.method public final ۧ(J)I
    .locals 3

    .line 610
    iget-object v0, p0, Ll/ۙ᩹֫;->ܰ:Ll/ᩴܽۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    iget-wide v1, p0, Ll/ۙ᩹֫;->ۧ֫:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Ll/ᩴܽۧ;->֫(J)I

    move-result p1

    return p1
.end method

.method public ۧ(JJ)J
    .locals 0

    .line 131
    iget p1, p0, Ll/ۙ᩹֫;->᩺:I

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    .line 571
    invoke-interface {p0}, Ll/֫۬֫;->ܿ()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {p0}, Ll/֫۬֫;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const-wide/32 p1, 0xf4240

    return-wide p1

    :cond_1
    const-wide/16 p1, 0x2710

    return-wide p1
.end method

.method public ۧ()Z
    .locals 1

    .line 116
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩻()Z

    move-result v0

    return v0
.end method

.method public final ۨ()V
    .locals 2

    .line 626
    iget-object v0, p0, Ll/ۙ᩹֫;->۬:Ljava/lang/Object;

    monitor-enter v0

    .line 627
    :try_start_0
    iget-object v1, p0, Ll/ۙ᩹֫;->ۨ:Ll/ܽ۬֫;

    .line 628
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 630
    check-cast v1, Ll/ۜܿۧ;

    invoke-virtual {v1, p0}, Ll/ۜܿۧ;->ۧ(Ll/ۙ᩹֫;)V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    .line 628
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ۫()Z
    .locals 1

    .line 620
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۙ᩹֫;->֫֫:Z

    return v0

    :cond_0
    iget-object v0, p0, Ll/ۙ᩹֫;->ܰ:Ll/ᩴܽۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 620
    invoke-interface {v0}, Ll/ᩴܽۧ;->ܿ()Z

    move-result v0

    return v0
.end method

.method public final ۬()Ll/ۙ᩵֫;
    .locals 1

    .line 489
    iget-object v0, p0, Ll/ۙ᩹֫;->ᩳ֫:Ll/ۙ᩵֫;

    return-object v0
.end method

.method public ܰ()V
    .locals 0

    return-void
.end method

.method public final ܳ()Ll/ᩴܽۧ;
    .locals 1

    .line 184
    iget-object v0, p0, Ll/ۙ᩹֫;->ܰ:Ll/ᩴܽۧ;

    return-object v0
.end method

.method public final ܶ()Ll/ܿ۬֫;
    .locals 1

    .line 457
    iget-object v0, p0, Ll/ۙ᩹֫;->᩹:Ll/ܿ۬֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0
.end method

.method public final ܺ()Z
    .locals 1

    .line 204
    iget-boolean v0, p0, Ll/ۙ᩹֫;->֫֫:Z

    return v0
.end method

.method public final ᩳ()V
    .locals 3

    .line 241
    iget v0, p0, Ll/ۙ᩹֫;->᩺:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Z)V

    .line 242
    iget-object v0, p0, Ll/ۙ᩹֫;->᩶:Ll/ۗۙ֫;

    invoke-virtual {v0}, Ll/ۗۙ֫;->֫()V

    .line 243
    iput v1, p0, Ll/ۙ᩹֫;->᩺:I

    const/4 v0, 0x0

    .line 244
    iput-object v0, p0, Ll/ۙ᩹֫;->ܰ:Ll/ᩴܽۧ;

    .line 245
    iput-object v0, p0, Ll/ۙ᩹֫;->۟:[Ll/۠ᩴ֫;

    .line 246
    iput-boolean v1, p0, Ll/ۙ᩹֫;->֫֫:Z

    .line 247
    invoke-virtual {p0}, Ll/ۙ᩹֫;->ۤ()V

    .line 248
    iput-object v0, p0, Ll/ۙ᩹֫;->۫:Ll/ܺۧۧ;

    return-void
.end method

.method public ᩵()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩶()Ll/ܰ۬֫;
    .locals 1

    .line 475
    iget-object v0, p0, Ll/ۙ᩹֫;->ۤ:Ll/ܰ۬֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0
.end method

.method public final ᩷()V
    .locals 1

    const/4 v0, 0x1

    .line 199
    iput-boolean v0, p0, Ll/ۙ᩹֫;->֫֫:Z

    return-void
.end method

.method public final ᩸()Ll/ۗۙ֫;
    .locals 1

    .line 436
    iget-object v0, p0, Ll/ۙ᩹֫;->᩶:Ll/ۗۙ֫;

    invoke-virtual {v0}, Ll/ۗۙ֫;->֫()V

    return-object v0
.end method

.method public final ᩹()J
    .locals 2

    .line 422
    iget-wide v0, p0, Ll/ۙ᩹֫;->ۗ:J

    return-wide v0
.end method

.method public ᩺()V
    .locals 0

    return-void
.end method

.method public final ᩻()Z
    .locals 5

    .line 189
    iget-wide v0, p0, Ll/ۙ᩹֫;->ۛ:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
