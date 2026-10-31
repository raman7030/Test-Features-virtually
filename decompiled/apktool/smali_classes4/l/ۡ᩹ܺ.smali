.class public Ll/ۡ᩹ܺ;
.super Ll/᩵᩸ܺ;
.source "E3QI"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0x1L


# instance fields
.field public final ۗ:Ll/ۧܶܺ;

.field public final ۙ:J

.field public final ۛ:Ll/ۘ᩶ܺ;

.field public final ۟:Ll/᩵᩶ܺ;

.field public final ۤ:J

.field public final ۨ:Ll/ᩳ᩸ܺ;

.field public final ۫:Ll/ᩴ᩸ܺ;

.field public final ۬:Ll/֨᩹ܺ;

.field public final ܰ:Ll/֨᩹ܺ;

.field public final ᩶:J

.field public final ᩸:I

.field public transient ᩹:Ll/᩻᩸ܺ;

.field public final ᩺:Ll/ۧܶܺ;


# direct methods
.method public constructor <init>(Ll/ܳ᩶ܺ;)V
    .locals 14

    .line 4516
    iget-object v0, p1, Ll/ܳ᩶ܺ;->ۨ:Ll/֨᩹ܺ;

    iget-object v1, p1, Ll/ܳ᩶ܺ;->᩻֫:Ll/֨᩹ܺ;

    iget-object v2, p1, Ll/ܳ᩶ܺ;->ۤ:Ll/ۧܶܺ;

    iget-object v3, p1, Ll/ܳ᩶ܺ;->ܳ֫:Ll/ۧܶܺ;

    iget-wide v4, p1, Ll/ܳ᩶ܺ;->۬:J

    iget-wide v6, p1, Ll/ܳ᩶ܺ;->ۗ:J

    iget-wide v8, p1, Ll/ܳ᩶ܺ;->᩺:J

    iget-object v10, p1, Ll/ܳ᩶ܺ;->᩷֫:Ll/᩵᩶ܺ;

    iget v11, p1, Ll/ܳ᩶ܺ;->᩸:I

    iget-object v12, p1, Ll/ܳ᩶ܺ;->۟:Ll/ۘ᩶ܺ;

    iget-object v13, p1, Ll/ܳ᩶ܺ;->ܿ֫:Ll/ᩳ᩸ܺ;

    iget-object p1, p1, Ll/ܳ᩶ܺ;->᩹:Ll/ᩴ᩸ܺ;

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4544
    iput-object v0, p0, Ll/ۡ᩹ܺ;->۬:Ll/֨᩹ܺ;

    .line 4545
    iput-object v1, p0, Ll/ۡ᩹ܺ;->ܰ:Ll/֨᩹ܺ;

    .line 4546
    iput-object v2, p0, Ll/ۡ᩹ܺ;->ۗ:Ll/ۧܶܺ;

    .line 4547
    iput-object v3, p0, Ll/ۡ᩹ܺ;->᩺:Ll/ۧܶܺ;

    .line 4548
    iput-wide v4, p0, Ll/ۡ᩹ܺ;->ۙ:J

    .line 4549
    iput-wide v6, p0, Ll/ۡ᩹ܺ;->᩶:J

    .line 4550
    iput-wide v8, p0, Ll/ۡ᩹ܺ;->ۤ:J

    .line 4551
    iput-object v10, p0, Ll/ۡ᩹ܺ;->۟:Ll/᩵᩶ܺ;

    .line 4552
    iput v11, p0, Ll/ۡ᩹ܺ;->᩸:I

    .line 4553
    iput-object v12, p0, Ll/ۡ᩹ܺ;->ۛ:Ll/ۘ᩶ܺ;

    .line 4554
    invoke-static {}, Ll/ᩳ᩸ܺ;->ۧ()Ll/ᩳ᩸ܺ;

    move-result-object v0

    if-eq v13, v0, :cond_0

    sget-object v0, Ll/ۖ᩸ܺ;->᩵:Ll/ᩳ᩸ܺ;

    if-ne v13, v0, :cond_1

    :cond_0
    const/4 v13, 0x0

    :cond_1
    iput-object v13, p0, Ll/ۡ᩹ܺ;->ۨ:Ll/ᩳ᩸ܺ;

    .line 4555
    iput-object p1, p0, Ll/ۡ᩹ܺ;->۫:Ll/ᩴ᩸ܺ;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 0

    .line 4591
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 4592
    invoke-virtual {p0}, Ll/ۡ᩹ܺ;->᩻()Ll/ۖ᩸ܺ;

    move-result-object p1

    .line 4593
    invoke-virtual {p1}, Ll/ۖ᩸ܺ;->֫()Ll/᩻᩸ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ۡ᩹ܺ;->᩹:Ll/᩻᩸ܺ;

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    .line 4597
    iget-object v0, p0, Ll/ۡ᩹ܺ;->᩹:Ll/᩻᩸ܺ;

    return-object v0
.end method


# virtual methods
.method public final ܿ()Ljava/lang/Object;
    .locals 1

    .line 4602
    iget-object v0, p0, Ll/ۡ᩹ܺ;->᩹:Ll/᩻᩸ܺ;

    return-object v0
.end method

.method public final ᩻()Ll/ۖ᩸ܺ;
    .locals 17

    move-object/from16 v0, p0

    .line 4560
    invoke-static {}, Ll/ۖ᩸ܺ;->ᩳ()Ll/ۖ᩸ܺ;

    move-result-object v1

    .line 633
    iget-object v2, v1, Ll/ۖ᩸ܺ;->ܿ:Ll/֨᩹ܺ;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    const-string v5, "Key strength was already set to %s"

    invoke-static {v2, v5, v4}, Ll/ۘܶܺ;->ۧ(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 902
    iget-object v2, v0, Ll/ۡ᩹ܺ;->۬:Ll/֨᩹ܺ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 634
    iput-object v2, v1, Ll/ۖ᩸ܺ;->ܿ:Ll/֨᩹ܺ;

    .line 693
    iget-object v2, v1, Ll/ۖ᩸ܺ;->ۖ:Ll/֨᩹ܺ;

    if-nez v2, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    const-string v5, "Value strength was already set to %s"

    invoke-static {v2, v5, v4}, Ll/ۘܶܺ;->ۧ(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 902
    iget-object v2, v0, Ll/ۡ᩹ܺ;->ܰ:Ll/֨᩹ܺ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 694
    iput-object v2, v1, Ll/ۖ᩸ܺ;->ۖ:Ll/֨᩹ܺ;

    .line 369
    iget-object v2, v1, Ll/ۖ᩸ܺ;->ᩳ:Ll/ۧܶܺ;

    if-nez v2, :cond_2

    const/4 v4, 0x1

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    const-string v5, "key equivalence was already set to %s"

    invoke-static {v2, v5, v4}, Ll/ۘܶܺ;->ۧ(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 902
    iget-object v2, v0, Ll/ۡ᩹ܺ;->ۗ:Ll/ۧܶܺ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    iput-object v2, v1, Ll/ۖ᩸ܺ;->ᩳ:Ll/ۧܶܺ;

    .line 390
    iget-object v2, v1, Ll/ۖ᩸ܺ;->ܺ:Ll/ۧܶܺ;

    if-nez v2, :cond_3

    const/4 v4, 0x1

    goto :goto_3

    :cond_3
    const/4 v4, 0x0

    :goto_3
    const-string v5, "value equivalence was already set to %s"

    invoke-static {v2, v5, v4}, Ll/ۘܶܺ;->ۧ(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 902
    iget-object v2, v0, Ll/ۡ᩹ܺ;->᩺:Ll/ۧܶܺ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    iput-object v2, v1, Ll/ۖ᩸ܺ;->ܺ:Ll/ۧܶܺ;

    .line 4564
    iget v2, v0, Ll/ۡ᩹ܺ;->᩸:I

    .line 4565
    invoke-virtual {v1, v2}, Ll/ۖ᩸ܺ;->֫(I)V

    .line 981
    iget-object v2, v1, Ll/ۖ᩸ܺ;->ۜ:Ll/ۘ᩶ܺ;

    if-nez v2, :cond_4

    const/4 v2, 0x1

    goto :goto_4

    :cond_4
    const/4 v2, 0x0

    :goto_4
    invoke-static {v2}, Ll/ۘܶܺ;->ۧ(Z)V

    .line 902
    iget-object v2, v0, Ll/ۡ᩹ܺ;->ۛ:Ll/ۘ᩶ܺ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 986
    iput-object v2, v1, Ll/ۖ᩸ܺ;->ۜ:Ll/ۘ᩶ܺ;

    .line 4567
    iput-boolean v3, v1, Ll/ۖ᩸ܺ;->ۢ:Z

    const/4 v2, 0x2

    const-string v3, "duration cannot be negative: %s %s"

    const-wide/16 v4, -0x1

    const-wide/16 v6, 0x0

    .line 4568
    iget-wide v8, v0, Ll/ۡ᩹ܺ;->ۙ:J

    cmp-long v10, v8, v6

    if-lez v10, :cond_8

    .line 4569
    sget-object v11, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 757
    iget-wide v12, v1, Ll/ۖ᩸ܺ;->ܽ:J

    cmp-long v14, v12, v4

    if-nez v14, :cond_5

    const/4 v14, 0x1

    goto :goto_5

    :cond_5
    const/4 v14, 0x0

    :goto_5
    const/4 v15, 0x1

    const/16 v16, 0x0

    const-string v4, "expireAfterWrite was already set to %s ns"

    invoke-static {v12, v13, v4, v14}, Ll/ۘܶܺ;->ۧ(JLjava/lang/String;Z)V

    if-ltz v10, :cond_6

    const/4 v4, 0x1

    goto :goto_6

    :cond_6
    const/4 v4, 0x0

    :goto_6
    if-eqz v4, :cond_7

    .line 762
    invoke-virtual {v11, v8, v9}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v4

    iput-wide v4, v1, Ll/ۖ᩸ܺ;->ܽ:J

    goto :goto_7

    .line 385
    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v4, v2, v16

    aput-object v11, v2, v15

    .line 82
    invoke-static {v3, v2}, Ll/ۤܶܺ;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 385
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    const/4 v15, 0x1

    const/16 v16, 0x0

    .line 4571
    :goto_7
    iget-wide v4, v0, Ll/ۡ᩹ܺ;->᩶:J

    cmp-long v8, v4, v6

    if-lez v8, :cond_c

    .line 4572
    sget-object v6, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 836
    iget-wide v9, v1, Ll/ۖ᩸ܺ;->ۧ:J

    const-wide/16 v11, -0x1

    cmp-long v7, v9, v11

    if-nez v7, :cond_9

    const/4 v7, 0x1

    goto :goto_8

    :cond_9
    const/4 v7, 0x0

    :goto_8
    const-string v11, "expireAfterAccess was already set to %s ns"

    invoke-static {v9, v10, v11, v7}, Ll/ۘܶܺ;->ۧ(JLjava/lang/String;Z)V

    if-ltz v8, :cond_a

    const/4 v7, 0x1

    goto :goto_9

    :cond_a
    const/4 v7, 0x0

    :goto_9
    if-eqz v7, :cond_b

    .line 841
    invoke-virtual {v6, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v2

    iput-wide v2, v1, Ll/ۖ᩸ܺ;->ۧ:J

    goto :goto_a

    .line 385
    :cond_b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v4, v2, v16

    aput-object v6, v2, v15

    .line 82
    invoke-static {v3, v2}, Ll/ۤܶܺ;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 385
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 4574
    :cond_c
    :goto_a
    sget-object v2, Ll/ܺ᩸ܺ;->᩹:Ll/ܺ᩸ܺ;

    iget-wide v3, v0, Ll/ۡ᩹ܺ;->ۤ:J

    iget-object v5, v0, Ll/ۡ᩹ܺ;->۟:Ll/᩵᩶ܺ;

    if-eq v5, v2, :cond_d

    .line 4575
    invoke-virtual {v1, v5}, Ll/ۖ᩸ܺ;->֫(Ll/᩵᩶ܺ;)V

    const-wide/16 v5, -0x1

    cmp-long v2, v3, v5

    if-eqz v2, :cond_e

    .line 4577
    invoke-virtual {v1, v3, v4}, Ll/ۖ᩸ܺ;->ۧ(J)V

    goto :goto_b

    :cond_d
    const-wide/16 v5, -0x1

    cmp-long v2, v3, v5

    if-eqz v2, :cond_e

    .line 4581
    invoke-virtual {v1, v3, v4}, Ll/ۖ᩸ܺ;->֫(J)V

    .line 4584
    :cond_e
    :goto_b
    iget-object v2, v0, Ll/ۡ᩹ܺ;->ۨ:Ll/ᩳ᩸ܺ;

    if-eqz v2, :cond_10

    .line 947
    iget-object v3, v1, Ll/ۖ᩸ܺ;->ۡ:Ll/ᩳ᩸ܺ;

    if-nez v3, :cond_f

    const/4 v3, 0x1

    goto :goto_c

    :cond_f
    const/4 v3, 0x0

    :goto_c
    invoke-static {v3}, Ll/ۘܶܺ;->ۧ(Z)V

    .line 948
    iput-object v2, v1, Ll/ۖ᩸ܺ;->ۡ:Ll/ᩳ᩸ܺ;

    :cond_10
    return-object v1
.end method
