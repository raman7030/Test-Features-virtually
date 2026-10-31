.class public final Ll/ܺۛ᩵;
.super Ljava/lang/Object;
.source "4AYL"


# static fields
.field public static final synthetic ܳ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final ܿ:Ll/ܶۛ᩵;

.field public static final synthetic ᩻:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;


# instance fields
.field public volatile synthetic _next:Ljava/lang/Object;

.field public volatile synthetic _state:J

.field public synthetic ֫:Ljava/util/concurrent/atomic/AtomicReferenceArray;

.field public final ۧ:I

.field public final ܽ:I

.field public final ᩳ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 288
    new-instance v0, Ll/ܶۛ᩵;

    const-string v1, "REMOVE_FROZEN"

    invoke-direct {v0, v1}, Ll/ܶۛ᩵;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ܺۛ᩵;->ܿ:Ll/ܶۛ᩵;

    const-class v0, Ljava/lang/Object;

    const-string v1, "_next"

    const-class v2, Ll/ܺۛ᩵;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ܺۛ᩵;->ܳ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_state"

    invoke-static {v2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ܺۛ᩵;->᩻:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 2

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput p1, p0, Ll/ܺۛ᩵;->ۧ:I

    .line 78
    iput-boolean p2, p0, Ll/ܺۛ᩵;->ᩳ:Z

    add-int/lit8 p2, p1, -0x1

    .line 80
    iput p2, p0, Ll/ܺۛ᩵;->ܽ:I

    const/4 v0, 0x0

    .line 81
    iput-object v0, p0, Ll/ܺۛ᩵;->_next:Ljava/lang/Object;

    const-wide/16 v0, 0x0

    .line 82
    iput-wide v0, p0, Ll/ܺۛ᩵;->_state:J

    .line 83
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    iput-object v0, p0, Ll/ܺۛ᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    const v0, 0x3fffffff    # 1.9999999f

    const-string v1, "Check failed."

    if-gt p2, v0, :cond_1

    and-int/2addr p1, p2

    if-nez p1, :cond_0

    return-void

    .line 87
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 86
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)I
    .locals 14

    .line 320
    :cond_0
    iget-wide v2, p0, Ll/ܺۛ᩵;->_state:J

    const-wide/high16 v0, 0x3000000000000000L    # 1.727233711018889E-77

    and-long/2addr v0, v2

    const-wide/16 v6, 0x0

    cmp-long v4, v0, v6

    if-eqz v4, :cond_1

    const-wide/high16 v0, 0x2000000000000000L

    and-long/2addr v0, v2

    cmp-long p1, v0, v6

    if-eqz p1, :cond_3

    const/4 p1, 0x2

    return p1

    :cond_1
    const-wide/32 v0, 0x3fffffff

    and-long/2addr v0, v2

    long-to-int v1, v0

    const-wide v4, 0xfffffffc0000000L

    and-long/2addr v4, v2

    const/16 v0, 0x1e

    shr-long/2addr v4, v0

    long-to-int v8, v4

    .line 108
    iget v9, p0, Ll/ܺۛ᩵;->ܽ:I

    add-int/lit8 v0, v8, 0x2

    and-int/2addr v0, v9

    and-int v4, v1, v9

    if-ne v0, v4, :cond_2

    goto :goto_0

    .line 114
    :cond_2
    iget-boolean v0, p0, Ll/ܺۛ᩵;->ᩳ:Z

    const v4, 0x3fffffff    # 1.9999999f

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/ܺۛ᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    and-int v5, v8, v9

    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 120
    iget v0, p0, Ll/ܺۛ᩵;->ۧ:I

    const/16 v2, 0x400

    if-lt v0, v2, :cond_3

    sub-int/2addr v8, v1

    and-int v1, v8, v4

    shr-int/lit8 v0, v0, 0x1

    if-le v1, v0, :cond_0

    :cond_3
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_4
    add-int/lit8 v0, v8, 0x1

    and-int/2addr v0, v4

    const/16 v1, 0x1e

    .line 127
    sget-object v4, Ll/ܺۛ᩵;->᩻:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-wide v10, -0xfffffffc0000001L    # -3.1050369248997324E231

    and-long/2addr v10, v2

    int-to-long v12, v0

    shl-long v0, v12, v1

    or-long/2addr v10, v0

    move-object v0, v4

    move-object v1, p0

    move-wide v4, v10

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 129
    iget-object v0, p0, Ll/ܺۛ᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    and-int v1, v8, v9

    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    move-object v0, p0

    .line 133
    :cond_5
    iget-wide v1, v0, Ll/ܺۛ᩵;->_state:J

    const-wide/high16 v3, 0x1000000000000000L

    and-long/2addr v1, v3

    cmp-long v3, v1, v6

    if-eqz v3, :cond_7

    .line 134
    invoke-virtual {v0}, Ll/ܺۛ᩵;->ᩳ()Ll/ܺۛ᩵;

    move-result-object v0

    .line 143
    iget-object v1, v0, Ll/ܺۛ᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iget v2, v0, Ll/ܺۛ᩵;->ܽ:I

    and-int/2addr v2, v8

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 154
    instance-of v4, v3, Ll/ۡۛ᩵;

    if-eqz v4, :cond_6

    check-cast v3, Ll/ۡۛ᩵;

    iget v3, v3, Ll/ۡۛ᩵;->֫:I

    if-ne v3, v8, :cond_6

    .line 155
    invoke-virtual {v1, v2, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    goto :goto_1

    :cond_6
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_5

    :cond_7
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫()Z
    .locals 10

    .line 316
    :goto_0
    iget-wide v2, p0, Ll/ܺۛ᩵;->_state:J

    const-wide/high16 v0, 0x2000000000000000L

    and-long v4, v2, v0

    const/4 v6, 0x1

    const-wide/16 v7, 0x0

    cmp-long v9, v4, v7

    if-eqz v9, :cond_0

    return v6

    :cond_0
    const-wide/high16 v4, 0x1000000000000000L

    and-long/2addr v4, v2

    cmp-long v9, v4, v7

    if-eqz v9, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    or-long v4, v2, v0

    .line 318
    sget-object v0, Ll/ܺۛ᩵;->᩻:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    return v6
.end method

.method public final ۧ()I
    .locals 6

    .line 92
    iget-wide v0, p0, Ll/ܺۛ᩵;->_state:J

    const-wide/32 v2, 0x3fffffff

    and-long/2addr v2, v0

    long-to-int v3, v2

    const-wide v4, 0xfffffffc0000000L

    and-long/2addr v0, v4

    const/16 v2, 0x1e

    shr-long/2addr v0, v2

    long-to-int v1, v0

    sub-int/2addr v1, v3

    const v0, 0x3fffffff    # 1.9999999f

    and-int/2addr v0, v1

    return v0
.end method

.method public final ܽ()Z
    .locals 6

    .line 91
    iget-wide v0, p0, Ll/ܺۛ᩵;->_state:J

    const-wide/32 v2, 0x3fffffff

    and-long/2addr v2, v0

    long-to-int v3, v2

    const-wide v4, 0xfffffffc0000000L

    and-long/2addr v0, v4

    const/16 v2, 0x1e

    shr-long/2addr v0, v2

    long-to-int v1, v0

    if-ne v3, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()Ljava/lang/Object;
    .locals 26

    move-object/from16 v6, p0

    .line 325
    :cond_0
    iget-wide v2, v6, Ll/ܺۛ᩵;->_state:J

    const-wide/high16 v7, 0x1000000000000000L

    and-long v0, v2, v7

    const-wide/16 v9, 0x0

    cmp-long v4, v0, v9

    if-eqz v4, :cond_1

    .line 166
    sget-object v0, Ll/ܺۛ᩵;->ܿ:Ll/ܶۛ᩵;

    return-object v0

    :cond_1
    const-wide/32 v11, 0x3fffffff

    and-long v0, v2, v11

    long-to-int v13, v0

    const-wide v0, 0xfffffffc0000000L

    and-long/2addr v0, v2

    const/16 v4, 0x1e

    shr-long/2addr v0, v4

    long-to-int v1, v0

    .line 168
    iget v0, v6, Ll/ܺۛ᩵;->ܽ:I

    and-int/2addr v1, v0

    and-int/2addr v0, v13

    const/4 v14, 0x0

    if-ne v1, v0, :cond_2

    goto :goto_0

    .line 169
    :cond_2
    iget-object v1, v6, Ll/ܺۛ᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v15

    if-nez v15, :cond_3

    .line 172
    iget-boolean v0, v6, Ll/ܺۛ᩵;->ᩳ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 177
    :cond_3
    instance-of v0, v15, Ll/ۡۛ᩵;

    if-eqz v0, :cond_4

    :goto_0
    return-object v14

    :cond_4
    add-int/lit8 v0, v13, 0x1

    const v1, 0x3fffffff    # 1.9999999f

    and-int/2addr v0, v1

    .line 180
    sget-object v1, Ll/ܺۛ᩵;->᩻:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-wide/32 v16, -0x40000000

    and-long v4, v2, v16

    int-to-long v9, v0

    or-long/2addr v4, v9

    move-object v0, v1

    move-object/from16 v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 183
    iget-object v0, v6, Ll/ܺۛ᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iget v1, v6, Ll/ܺۛ᩵;->ܽ:I

    and-int/2addr v1, v13

    invoke-virtual {v0, v1, v14}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    return-object v15

    .line 187
    :cond_5
    iget-boolean v0, v6, Ll/ܺۛ᩵;->ᩳ:Z

    if-eqz v0, :cond_0

    move-object v0, v6

    .line 330
    :cond_6
    iget-wide v1, v0, Ll/ܺۛ᩵;->_state:J

    and-long v3, v1, v11

    long-to-int v4, v3

    and-long v20, v1, v7

    const-wide/16 v18, 0x0

    cmp-long v3, v20, v18

    if-eqz v3, :cond_7

    .line 204
    invoke-virtual {v0}, Ll/ܺۛ᩵;->ᩳ()Ll/ܺۛ᩵;

    move-result-object v0

    goto :goto_1

    .line 206
    :cond_7
    sget-object v20, Ll/ܺۛ᩵;->᩻:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    and-long v21, v1, v16

    or-long v24, v21, v9

    move-object/from16 v21, v0

    move-wide/from16 v22, v1

    invoke-virtual/range {v20 .. v25}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 207
    iget-object v1, v0, Ll/ܺۛ᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iget v0, v0, Ll/ܺۛ᩵;->ܽ:I

    and-int/2addr v0, v4

    invoke-virtual {v1, v0, v14}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    move-object v0, v14

    :goto_1
    if-nez v0, :cond_6

    return-object v15
.end method

.method public final ᩳ()Ll/ܺۛ᩵;
    .locals 9

    .line 336
    :cond_0
    iget-wide v2, p0, Ll/ܺۛ᩵;->_state:J

    const-wide/high16 v0, 0x1000000000000000L

    and-long v4, v2, v0

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-eqz v8, :cond_1

    goto :goto_0

    :cond_1
    or-long v6, v2, v0

    .line 338
    sget-object v0, Ll/ܺۛ᩵;->᩻:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-object v1, p0

    move-wide v4, v6

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    move-wide v2, v6

    .line 340
    :goto_0
    iget-object v0, p0, Ll/ܺۛ᩵;->_next:Ljava/lang/Object;

    check-cast v0, Ll/ܺۛ᩵;

    if-eqz v0, :cond_2

    return-object v0

    .line 225
    :cond_2
    sget-object v0, Ll/ܺۛ᩵;->ܳ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 230
    new-instance v1, Ll/ܺۛ᩵;

    iget v4, p0, Ll/ܺۛ᩵;->ۧ:I

    mul-int/lit8 v4, v4, 0x2

    iget-boolean v5, p0, Ll/ܺۛ᩵;->ᩳ:Z

    invoke-direct {v1, v4, v5}, Ll/ܺۛ᩵;-><init>(IZ)V

    const-wide/32 v4, 0x3fffffff

    and-long/2addr v4, v2

    long-to-int v5, v4

    const-wide v6, 0xfffffffc0000000L

    and-long/2addr v6, v2

    const/16 v4, 0x1e

    shr-long/2addr v6, v4

    long-to-int v4, v6

    .line 233
    :goto_1
    iget v6, p0, Ll/ܺۛ᩵;->ܽ:I

    and-int v7, v5, v6

    and-int/2addr v6, v4

    if-eq v7, v6, :cond_4

    .line 235
    iget-object v6, p0, Ll/ܺۛ᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v6, v7}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_3

    new-instance v6, Ll/ۡۛ᩵;

    invoke-direct {v6, v5}, Ll/ۡۛ᩵;-><init>(I)V

    .line 236
    :cond_3
    iget-object v7, v1, Ll/ܺۛ᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iget v8, v1, Ll/ܺۛ᩵;->ܽ:I

    and-int/2addr v8, v5

    invoke-virtual {v7, v8, v6}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    const-wide v4, -0x1000000000000001L    # -3.1050361846014175E231

    and-long/2addr v4, v2

    .line 239
    iput-wide v4, v1, Ll/ܺۛ᩵;->_state:J

    :cond_5
    const/4 v4, 0x0

    .line 0
    invoke-virtual {v0, p0, v4, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_0

    :cond_6
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_5

    goto :goto_0
.end method
