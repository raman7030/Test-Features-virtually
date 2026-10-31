.class public Ll/ۖᩳۘ;
.super Ljava/lang/Object;
.source "623X"

# interfaces
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static final ֫֫:Ll/ᩴᩳۘ;

.field public static final ۧ֫:Ll/ᩴᩳۘ;

.field public static final ܽ֫:Ll/ᩴᩳۘ;

.field public static final ᩳ֫:Ll/ᩴᩳۘ;


# instance fields
.field public ۗ:Ll/ܶܽۘ;

.field public final ۙ:J

.field public final ۛ:J

.field public final ۟:J

.field public final ۤ:I

.field public final ۨ:Ll/᩵ᩳۘ;

.field public final ۫:Ll/ܽۧۘ;

.field public final ۬:J

.field public final ܰ:I

.field public final ᩶:I

.field public final ᩸:Ll/᩹ۛۖ;

.field public final ᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ᩺:J


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 73
    new-instance v0, Ll/۫ۛۖ;

    const/16 v1, 0x8

    new-array v2, v1, [B

    fill-array-data v2, :array_0

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-direct {v0, v2, v1}, Ll/۫ۛۖ;-><init>([B[B)V

    .line 79
    new-instance v0, Ll/᩷ᩳۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۖᩳۘ;->ᩳ֫:Ll/ᩴᩳۘ;

    .line 86
    new-instance v0, Ll/ۢᩳۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۖᩳۘ;->ܽ֫:Ll/ᩴᩳۘ;

    .line 94
    new-instance v0, Ll/ۡᩳۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۖᩳۘ;->ۧ֫:Ll/ᩴᩳۘ;

    .line 101
    new-instance v0, Ll/ܺᩳۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۖᩳۘ;->֫֫:Ll/ᩴᩳۘ;

    .line 254
    new-instance v0, Ll/ۡܽۘ;

    invoke-direct {v0}, Ll/ۡܽۘ;-><init>()V

    return-void

    nop

    :array_0
    .array-data 1
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
    .end array-data

    :array_1
    .array-data 1
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
    .end array-data
.end method

.method public constructor <init>(Ll/ܽۧۘ;Ll/᩵ᩳۘ;)V
    .locals 4

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ll/ۖᩳۘ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 124
    iput-object p1, p0, Ll/ۖᩳۘ;->۫:Ll/ܽۧۘ;

    .line 125
    iput-object p2, p0, Ll/ۖᩳۘ;->ۨ:Ll/᩵ᩳۘ;

    .line 126
    invoke-virtual {p2}, Ll/᩵ᩳۘ;->ᩳ()Ll/ܶܽۘ;

    move-result-object p1

    iput-object p1, p0, Ll/ۖᩳۘ;->ۗ:Ll/ܶܽۘ;

    .line 127
    invoke-virtual {p2}, Ll/᩵ᩳۘ;->ܽ()Ll/᩷ۧۘ;

    move-result-object v0

    .line 128
    invoke-virtual {v0}, Ll/᩷ۧۘ;->֫()Ll/᩹ۛۖ;

    move-result-object v1

    iput-object v1, p0, Ll/ۖᩳۘ;->᩸:Ll/᩹ۛۖ;

    .line 129
    invoke-virtual {p2}, Ll/᩵ᩳۘ;->ۧ()Ll/ۙ֫ۘ;

    move-result-object v1

    .line 130
    invoke-virtual {v1}, Ll/ۙ֫ۘ;->ܿ()I

    move-result v2

    invoke-virtual {v0}, Ll/᩷ۧۘ;->ۧ()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, p0, Ll/ۖᩳۘ;->᩶:I

    .line 131
    invoke-virtual {v1}, Ll/ۙ֫ۘ;->ܳ()J

    move-result-wide v2

    iput-wide v2, p0, Ll/ۖᩳۘ;->ۙ:J

    .line 132
    invoke-virtual {v1}, Ll/ۙ֫ۘ;->ᩴ()I

    move-result v2

    invoke-virtual {v0}, Ll/᩷ۧۘ;->ᩳ()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, p0, Ll/ۖᩳۘ;->ܰ:I

    .line 133
    invoke-virtual {v1}, Ll/ۙ֫ۘ;->᩵()J

    move-result-wide v2

    iput-wide v2, p0, Ll/ۖᩳۘ;->۟:J

    .line 134
    invoke-virtual {v1}, Ll/ۙ֫ۘ;->ܺ()I

    move-result v2

    invoke-virtual {v0}, Ll/᩷ۧۘ;->ܽ()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Ll/ۖᩳۘ;->ۤ:I

    .line 135
    invoke-virtual {v1}, Ll/ۙ֫ۘ;->ۖ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۖᩳۘ;->ۛ:J

    .line 136
    invoke-virtual {p1}, Ll/ܶܽۘ;->ᩳ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۖᩳۘ;->۬:J

    .line 137
    invoke-virtual {p2}, Ll/᩵ᩳۘ;->ܳ()J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۖᩳۘ;->᩺:J

    return-void
.end method

.method private ֫(Ll/ܽۨۖ;)Ll/ۧ۟ۖ;
    .locals 2

    .line 148
    iget-object v0, p0, Ll/ۖᩳۘ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 399
    :try_start_0
    iget-object v0, p0, Ll/ۖᩳۘ;->ۗ:Ll/ܶܽۘ;

    const/4 v1, 0x0

    .line 305
    invoke-virtual {v0, p1, v1}, Ll/ܶܽۘ;->֫(Ll/ܽۨۖ;Z)Ll/ۧ۟ۖ;

    move-result-object p1
    :try_end_0
    .catch Ll/ۖ۟ۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 401
    new-instance v0, Ll/ۧۧۘ;

    .line 34
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 401
    throw v0

    .line 395
    :cond_0
    new-instance p1, Ll/ۧۧۘ;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, " has already been closed"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 38
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 395
    throw p1
.end method

.method public static ֫(Ll/ۧ۟ۖ;Ljava/lang/String;Ljava/lang/Object;Ll/ᩴᩳۘ;J)Ll/ܽۨۖ;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p4, v0

    if-lez v2, :cond_0

    .line 420
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v0, Ll/ۖ۟ۖ;->᩸:Ll/ܽ۟ۖ;

    invoke-static {p4, p5, p0}, Ll/ᩳ۟ۖ;->֫(JLjava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܽۨۖ;

    goto :goto_0

    .line 422
    :cond_0
    sget-object p4, Ll/ۖ۟ۖ;->᩸:Ll/ܽ۟ۖ;
    :try_end_0
    .catch Ll/ۖ۟ۖ; {:try_start_0 .. :try_end_0} :catch_2

    .line 30
    :try_start_1
    invoke-virtual {p0}, Ll/ۧ۟ۖ;->get()Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ll/ۖ۟ۖ; {:try_start_1 .. :try_end_1} :catch_2

    .line 422
    :try_start_2
    check-cast p0, Ll/ܽۨۖ;
    :try_end_2
    .catch Ll/ۖ۟ۖ; {:try_start_2 .. :try_end_2} :catch_2

    .line 409
    :goto_0
    invoke-virtual {p0}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object p4

    check-cast p4, Ll/᩻ۨۖ;

    invoke-virtual {p4}, Ll/᩻ۨۖ;->ۡ()J

    move-result-wide p4

    .line 410
    invoke-interface {p3, p4, p5}, Ll/ᩴᩳۘ;->֫(J)Z

    move-result p3

    if-eqz p3, :cond_1

    return-object p0

    .line 411
    :cond_1
    new-instance p3, Ll/֨ۨۖ;

    invoke-virtual {p0}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object p0

    check-cast p0, Ll/᩻ۨۖ;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " failed for "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p0, p1}, Ll/֨ۨۖ;-><init>(Ll/᩻ۨۖ;Ljava/lang/String;)V

    throw p3

    :catch_0
    move-exception p0

    .line 35
    :try_start_3
    invoke-interface {p4, p0}, Ll/ܽ۟ۖ;->֫(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0

    :catch_1
    move-exception p0

    .line 32
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 33
    invoke-interface {p4, p0}, Ll/ܽ۟ۖ;->֫(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0
    :try_end_3
    .catch Ll/ۖ۟ۖ; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    move-exception p0

    .line 425
    new-instance p1, Ll/ۧۧۘ;

    .line 34
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 425
    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 142
    iget-object v0, p0, Ll/ۖᩳۘ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 143
    iget-object v0, p0, Ll/ۖᩳۘ;->ۨ:Ll/᩵ᩳۘ;

    invoke-virtual {v0}, Ll/᩵ᩳۘ;->֫()V

    :cond_0
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    .line 450
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    .line 454
    :cond_2
    check-cast p1, Ll/ۖᩳۘ;

    iget-object p1, p1, Ll/ۖᩳۘ;->۫:Ll/ܽۧۘ;

    .line 455
    iget-object v2, p0, Ll/ۖᩳۘ;->۫:Ll/ܽۧۘ;

    if-nez v2, :cond_3

    if-eqz p1, :cond_4

    return v1

    .line 459
    :cond_3
    invoke-virtual {v2, p1}, Ll/ܽۧۘ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 438
    iget-object v0, p0, Ll/ۖᩳۘ;->۫:Ll/ܽۧۘ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ll/ܽۧۘ;->hashCode()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, 0x1f

    return v0
.end method

.method public final ֫(Ll/۫ۛۖ;Ljava/util/EnumSet;Ll/ۧۤۖ;)Ll/֫᩺ۖ;
    .locals 18

    move-object/from16 v0, p0

    .line 228
    new-instance v11, Ll/۟ۨۖ;

    iget-wide v5, v0, Ll/ۖᩳۘ;->᩺:J

    iget v10, v0, Ll/ۖᩳۘ;->ۤ:I

    iget-object v2, v0, Ll/ۖᩳۘ;->᩸:Ll/᩹ۛۖ;

    iget-wide v3, v0, Ll/ۖᩳۘ;->۬:J

    move-object v1, v11

    move-object/from16 v7, p1

    move-object/from16 v8, p3

    move-object/from16 v9, p2

    invoke-direct/range {v1 .. v10}, Ll/۟ۨۖ;-><init>(Ll/᩹ۛۖ;JJLl/۫ۛۖ;Ll/ۧۤۖ;Ljava/util/Set;I)V

    .line 231
    iget-wide v1, v0, Ll/ۖᩳۘ;->ۛ:J

    .line 389
    invoke-direct {v0, v11}, Ll/ۖᩳۘ;->֫(Ll/ܽۨۖ;)Ll/ۧ۟ۖ;

    move-result-object v12

    const-string v13, "Query directory"

    .line 390
    sget-object v15, Ll/ۖᩳۘ;->ܽ֫:Ll/ᩴᩳۘ;

    move-object/from16 v14, p1

    move-wide/from16 v16, v1

    invoke-static/range {v12 .. v17}, Ll/ۖᩳۘ;->֫(Ll/ۧ۟ۖ;Ljava/lang/String;Ljava/lang/Object;Ll/ᩴᩳۘ;J)Ll/ܽۨۖ;

    move-result-object v1

    .line 231
    check-cast v1, Ll/֫᩺ۖ;

    return-object v1
.end method

.method public final ֫(Ll/۫ۛۖ;Ll/᩷ܽۘ;)Ll/ۧ۟ۖ;
    .locals 10

    .line 240
    new-instance v9, Ll/ۘ᩺ۖ;

    iget-wide v3, p0, Ll/ۖᩳۘ;->۬:J

    iget-wide v5, p0, Ll/ۖᩳۘ;->᩺:J

    iget-object v1, p0, Ll/ۖᩳۘ;->᩸:Ll/᩹ۛۖ;

    iget v8, p0, Ll/ۖᩳۘ;->ܰ:I

    move-object v0, v9

    move-object v2, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v8}, Ll/ۘ᩺ۖ;-><init>(Ll/᩹ۛۖ;Ll/۫ۛۖ;JJLl/᩷ܽۘ;I)V

    .line 241
    invoke-direct {p0, v9}, Ll/ۖᩳۘ;->֫(Ll/ܽۨۖ;)Ll/ۧ۟ۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/۫ۛۖ;JI)Ll/ᩳ᩺ۖ;
    .locals 6

    .line 245
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/ۖᩳۘ;->ۧ(Ll/۫ۛۖ;JI)Ll/ۧ۟ۖ;

    move-result-object v0

    sget-object v3, Ll/ۖᩳۘ;->ۧ֫:Ll/ᩴᩳۘ;

    iget-wide v4, p0, Ll/ۖᩳۘ;->ۙ:J

    const-string v1, "Read"

    move-object v2, p1

    invoke-static/range {v0 .. v5}, Ll/ۖᩳۘ;->֫(Ll/ۧ۟ۖ;Ljava/lang/String;Ljava/lang/Object;Ll/ᩴᩳۘ;J)Ll/ܽۨۖ;

    move-result-object p1

    check-cast p1, Ll/ᩳ᩺ۖ;

    return-object p1
.end method

.method public ֫()Ll/ᩴᩳۘ;
    .locals 1

    .line 192
    sget-object v0, Ll/ۖᩳۘ;->ᩳ֫:Ll/ᩴᩳۘ;

    return-object v0
.end method

.method public final ֫(Ll/ܽۧۘ;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ll/۠ۛۖ;Ljava/util/Set;)Ll/᩶ۨۖ;
    .locals 15

    move-object v0, p0

    .line 185
    new-instance v14, Ll/᩹ۨۖ;

    iget-wide v3, v0, Ll/ۖᩳۘ;->۬:J

    iget-wide v5, v0, Ll/ۖᩳۘ;->᩺:J

    iget-object v2, v0, Ll/ۖᩳۘ;->᩸:Ll/᩹ۛۖ;

    const/4 v7, 0x0

    move-object v1, v14

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    move-object/from16 v12, p6

    move-object/from16 v13, p1

    invoke-direct/range {v1 .. v13}, Ll/᩹ۨۖ;-><init>(Ll/᩹ۛۖ;JJLl/ۨۛۖ;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ll/۠ۛۖ;Ljava/util/Set;Ll/ܽۧۘ;)V

    .line 187
    invoke-virtual {p0}, Ll/ۖᩳۘ;->֫()Ll/ᩴᩳۘ;

    move-result-object v11

    iget-wide v12, v0, Ll/ۖᩳۘ;->ۛ:J

    .line 389
    invoke-direct {p0, v14}, Ll/ۖᩳۘ;->֫(Ll/ܽۨۖ;)Ll/ۧ۟ۖ;

    move-result-object v8

    const-string v9, "Create"

    move-object/from16 v10, p1

    .line 390
    invoke-static/range {v8 .. v13}, Ll/ۖᩳۘ;->֫(Ll/ۧ۟ۖ;Ljava/lang/String;Ljava/lang/Object;Ll/ᩴᩳۘ;J)Ll/ܽۨۖ;

    move-result-object v1

    .line 187
    check-cast v1, Ll/᩶ۨۖ;

    return-object v1
.end method

.method public ֫(Ll/۫ۛۖ;)V
    .locals 14

    .line 201
    new-instance v7, Ll/᩸ۨۖ;

    iget-wide v2, p0, Ll/ۖᩳۘ;->۬:J

    iget-wide v4, p0, Ll/ۖᩳۘ;->᩺:J

    iget-object v1, p0, Ll/ۖᩳۘ;->᩸:Ll/᩹ۛۖ;

    move-object v0, v7

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Ll/᩸ۨۖ;-><init>(Ll/᩹ۛۖ;JJLl/۫ۛۖ;)V

    .line 202
    iget-wide v12, p0, Ll/ۖᩳۘ;->ۛ:J

    .line 389
    invoke-direct {p0, v7}, Ll/ۖᩳۘ;->֫(Ll/ܽۨۖ;)Ll/ۧ۟ۖ;

    move-result-object v8

    const-string v9, "Close"

    .line 390
    sget-object v11, Ll/ۖᩳۘ;->֫֫:Ll/ᩴᩳۘ;

    move-object v10, p1

    invoke-static/range {v8 .. v13}, Ll/ۖᩳۘ;->֫(Ll/ۧ۟ۖ;Ljava/lang/String;Ljava/lang/Object;Ll/ᩴᩳۘ;J)Ll/ܽۨۖ;

    return-void
.end method

.method public final ֫(Ll/۫ۛۖ;Ll/ۜ᩺ۖ;Ll/ۧۤۖ;[B)V
    .locals 18

    move-object/from16 v0, p0

    .line 220
    new-instance v11, Ll/᩷᩺ۖ;

    iget-wide v3, v0, Ll/ۖᩳۘ;->۬:J

    iget-wide v5, v0, Ll/ۖᩳۘ;->᩺:J

    iget-object v2, v0, Ll/ۖᩳۘ;->᩸:Ll/᩹ۛۖ;

    move-object v1, v11

    move-object/from16 v7, p2

    move-object/from16 v8, p1

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    invoke-direct/range {v1 .. v10}, Ll/᩷᩺ۖ;-><init>(Ll/᩹ۛۖ;JJLl/ۜ᩺ۖ;Ll/۫ۛۖ;Ll/ۧۤۖ;[B)V

    .line 222
    iget-wide v1, v0, Ll/ۖᩳۘ;->ۛ:J

    .line 389
    invoke-direct {v0, v11}, Ll/ۖᩳۘ;->֫(Ll/ܽۨۖ;)Ll/ۧ۟ۖ;

    move-result-object v12

    const-string v13, "SetInfo"

    .line 390
    sget-object v15, Ll/ᩴᩳۘ;->֫:Ll/ᩴᩳۘ;

    move-object/from16 v14, p1

    move-wide/from16 v16, v1

    invoke-static/range {v12 .. v17}, Ll/ۖᩳۘ;->֫(Ll/ۧ۟ۖ;Ljava/lang/String;Ljava/lang/Object;Ll/ᩴᩳۘ;J)Ll/ܽۨۖ;

    return-void
.end method

.method public final ۖ()J
    .locals 2

    .line 172
    iget-wide v0, p0, Ll/ۖᩳۘ;->۟:J

    return-wide v0
.end method

.method public final ۜ()I
    .locals 1

    .line 168
    iget v0, p0, Ll/ۖᩳۘ;->ܰ:I

    return v0
.end method

.method public final ۧ(Ll/۫ۛۖ;JI)Ll/ۧ۟ۖ;
    .locals 11

    .line 249
    new-instance v10, Ll/ܽ᩺ۖ;

    iget v0, p0, Ll/ۖᩳۘ;->᩶:I

    .line 250
    invoke-static {p4, v0}, Ljava/lang/Math;->min(II)I

    move-result v9

    iget-object v1, p0, Ll/ۖᩳۘ;->᩸:Ll/᩹ۛۖ;

    iget-wide v3, p0, Ll/ۖᩳۘ;->۬:J

    iget-wide v5, p0, Ll/ۖᩳۘ;->᩺:J

    move-object v0, v10

    move-object v2, p1

    move-wide v7, p2

    invoke-direct/range {v0 .. v9}, Ll/ܽ᩺ۖ;-><init>(Ll/᩹ۛۖ;Ll/۫ۛۖ;JJJI)V

    .line 251
    invoke-direct {p0, v10}, Ll/ۖᩳۘ;->֫(Ll/ܽۨۖ;)Ll/ۧ۟ۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ܳ()Ll/ܽۧۘ;
    .locals 1

    .line 152
    iget-object v0, p0, Ll/ۖᩳۘ;->۫:Ll/ܽۧۘ;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 160
    iget v0, p0, Ll/ۖᩳۘ;->᩶:I

    return v0
.end method

.method public final ᩳ()J
    .locals 2

    .line 164
    iget-wide v0, p0, Ll/ۖᩳۘ;->ۙ:J

    return-wide v0
.end method

.method public final ᩻()Ll/᩵ᩳۘ;
    .locals 1

    .line 156
    iget-object v0, p0, Ll/ۖᩳۘ;->ۨ:Ll/᩵ᩳۘ;

    return-object v0
.end method
