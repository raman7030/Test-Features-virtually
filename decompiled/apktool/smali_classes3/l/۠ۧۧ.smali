.class public final Ll/۠ۧۧ;
.super Ljava/lang/Object;
.source "Q8T9"


# instance fields
.field public final ֫:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final ۧ:Ll/ܺۧۧ;

.field public final ܽ:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 160
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Ll/۠ۧۧ;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILl/ܺۧۧ;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILl/ܺۧۧ;)V
    .locals 0

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 170
    iput-object p1, p0, Ll/۠ۧۧ;->֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 171
    iput p2, p0, Ll/۠ۧۧ;->ܽ:I

    .line 172
    iput-object p3, p0, Ll/۠ۧۧ;->ۧ:Ll/ܺۧۧ;

    return-void
.end method


# virtual methods
.method public final ֫(ILl/ܺۧۧ;)Ll/۠ۧۧ;
    .locals 2

    .line 185
    new-instance v0, Ll/۠ۧۧ;

    iget-object v1, p0, Ll/۠ۧۧ;->֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0, v1, p1, p2}, Ll/۠ۧۧ;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILl/ܺۧۧ;)V

    return-object v0
.end method

.method public final ֫(Landroid/os/Handler;Ll/ܶۧۧ;)V
    .locals 1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    new-instance v0, Ll/֨ۧۧ;

    .line 525
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 526
    iput-object p1, v0, Ll/֨ۧۧ;->֫:Landroid/os/Handler;

    .line 527
    iput-object p2, v0, Ll/֨ۧۧ;->ۧ:Ljava/lang/Object;

    .line 210
    iget-object p1, p0, Ll/۠ۧۧ;->֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJ)V
    .locals 12

    move-object v0, p0

    .line 382
    new-instance v11, Ll/ۜۧۧ;

    .line 390
    invoke-static/range {p7 .. p8}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v7

    .line 391
    invoke-static/range {p9 .. p10}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Ll/ۜۧۧ;-><init>(IILl/۠ᩴ֫;ILjava/lang/Object;JJ)V

    .line 396
    new-instance v1, Ll/᩵ۧۧ;

    move-object v2, p1

    invoke-direct {v1, p0, p1, v11}, Ll/᩵ۧۧ;-><init>(Ll/۠ۧۧ;Ll/ۧۧۧ;Ll/ۜۧۧ;)V

    invoke-virtual {p0, v1}, Ll/۠ۧۧ;->֫(Ll/᩻ۚ֫;)V

    return-void
.end method

.method public final ֫(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJI)V
    .locals 12

    move-object v0, p0

    .line 286
    new-instance v11, Ll/ۜۧۧ;

    .line 294
    invoke-static/range {p7 .. p8}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v7

    .line 295
    invoke-static/range {p9 .. p10}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Ll/ۜۧۧ;-><init>(IILl/۠ᩴ֫;ILjava/lang/Object;JJ)V

    .line 311
    new-instance v1, Ll/ۚۧۧ;

    move-object v2, p1

    move/from16 v3, p11

    invoke-direct {v1, p0, p1, v11, v3}, Ll/ۚۧۧ;-><init>(Ll/۠ۧۧ;Ll/ۧۧۧ;Ll/ۜۧۧ;I)V

    invoke-virtual {p0, v1}, Ll/۠ۧۧ;->֫(Ll/᩻ۚ֫;)V

    return-void
.end method

.method public final ֫(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJLjava/io/IOException;Z)V
    .locals 11

    .line 438
    new-instance v10, Ll/ۜۧۧ;

    .line 446
    invoke-static/range {p7 .. p8}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v6

    .line 447
    invoke-static/range {p9 .. p10}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v8

    move-object v0, v10

    move v1, p2

    move v2, p3

    move-object v3, p4

    move/from16 v4, p5

    move-object/from16 v5, p6

    invoke-direct/range {v0 .. v9}, Ll/ۜۧۧ;-><init>(IILl/۠ᩴ֫;ILjava/lang/Object;JJ)V

    .line 461
    new-instance v0, Ll/ᩴۧۧ;

    move-object p2, v0

    move-object p3, p0

    move-object p4, p1

    move-object/from16 p5, v10

    move-object/from16 p6, p11

    move/from16 p7, p12

    invoke-direct/range {p2 .. p7}, Ll/ᩴۧۧ;-><init>(Ll/۠ۧۧ;Ll/ۧۧۧ;Ll/ۜۧۧ;Ljava/io/IOException;Z)V

    move-object v1, p0

    invoke-virtual {p0, v0}, Ll/۠ۧۧ;->֫(Ll/᩻ۚ֫;)V

    return-void
.end method

.method public final ֫(Ll/ܶۧۧ;)V
    .locals 4

    .line 219
    iget-object v0, p0, Ll/۠ۧۧ;->֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨ۧۧ;

    .line 220
    iget-object v3, v2, Ll/֨ۧۧ;->ۧ:Ljava/lang/Object;

    if-ne v3, p1, :cond_0

    .line 221
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(Ll/᩻ۚ֫;)V
    .locals 5

    .line 514
    iget-object v0, p0, Ll/۠ۧۧ;->֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨ۧۧ;

    .line 515
    iget-object v2, v1, Ll/֨ۧۧ;->ۧ:Ljava/lang/Object;

    .line 516
    iget-object v1, v1, Ll/֨ۧۧ;->֫:Landroid/os/Handler;

    new-instance v3, Ll/ۗ۫ܿ;

    const/4 v4, 0x2

    invoke-direct {v3, v4, p1, v2}, Ll/ۗ۫ܿ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v3}, Ll/ۘ֨֫;->֫(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/ۧۧۧ;IILl/۠ᩴ֫;ILjava/lang/Object;JJ)V
    .locals 12

    move-object v0, p0

    .line 340
    new-instance v11, Ll/ۜۧۧ;

    .line 348
    invoke-static/range {p7 .. p8}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v7

    .line 349
    invoke-static/range {p9 .. p10}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Ll/ۜۧۧ;-><init>(IILl/۠ᩴ֫;ILjava/lang/Object;JJ)V

    .line 354
    new-instance v1, Ll/֡ۧۧ;

    move-object v2, p1

    invoke-direct {v1, p0, p1, v11}, Ll/֡ۧۧ;-><init>(Ll/۠ۧۧ;Ll/ۧۧۧ;Ll/ۜۧۧ;)V

    invoke-virtual {p0, v1}, Ll/۠ۧۧ;->֫(Ll/᩻ۚ֫;)V

    return-void
.end method
