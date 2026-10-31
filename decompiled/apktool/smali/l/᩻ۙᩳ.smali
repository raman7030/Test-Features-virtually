.class public final Ll/᩻ۙᩳ;
.super Ljava/lang/Object;
.source "L6TZ"

# interfaces
.implements Ll/ۡ᩹ᩳ;


# instance fields
.field public final ֫:Z

.field public ۧ:Ll/ܺۙᩳ;

.field public final ܳ:Ljava/util/function/Supplier;

.field public ܽ:J

.field public final ܿ:Ll/ܰ᩶ᩳ;

.field public ᩳ:J


# direct methods
.method public constructor <init>(Ll/ܰ᩶ᩳ;JJLjava/util/function/Supplier;Z)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ll/ܺۙᩳ;

    invoke-direct {v0}, Ll/ܺۙᩳ;-><init>()V

    iput-object v0, p0, Ll/᩻ۙᩳ;->ۧ:Ll/ܺۙᩳ;

    .line 25
    iput-boolean p7, p0, Ll/᩻ۙᩳ;->֫:Z

    .line 26
    sget-object p7, Ll/ܰ᩶ᩳ;->۫:Ll/ܰ᩶ᩳ;

    if-eq p1, p7, :cond_1

    sget-object p7, Ll/ܰ᩶ᩳ;->᩹:Ll/ܰ᩶ᩳ;

    if-ne p1, p7, :cond_0

    goto :goto_0

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Only user edits produce history"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 29
    :cond_1
    :goto_0
    iput-object p1, p0, Ll/᩻ۙᩳ;->ܿ:Ll/ܰ᩶ᩳ;

    .line 30
    iput-wide p2, p0, Ll/᩻ۙᩳ;->ܽ:J

    .line 31
    iput-wide p4, p0, Ll/᩻ۙᩳ;->ᩳ:J

    .line 32
    iput-object p6, p0, Ll/᩻ۙᩳ;->ܳ:Ljava/util/function/Supplier;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۢ۬ᩳ;J)Ll/ۢ۬ᩳ;
    .locals 3

    .line 64
    iget-object v0, p0, Ll/᩻ۙᩳ;->ۧ:Ll/ܺۙᩳ;

    invoke-virtual {v0}, Ll/ܺۙᩳ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    .line 65
    :cond_0
    iget-object v0, p0, Ll/᩻ۙᩳ;->ܿ:Ll/ܰ᩶ᩳ;

    sget-object v1, Ll/ܰ᩶ᩳ;->᩹:Ll/ܰ᩶ᩳ;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Ll/᩻ۙᩳ;->ۧ:Ll/ܺۙᩳ;

    invoke-virtual {p1, v0, p2, p3}, Ll/ۢ۬ᩳ;->֫(Ll/ܺۙᩳ;J)Ll/ۢ۬ᩳ;

    move-result-object p1

    return-object p1

    .line 67
    :cond_1
    iget-object v0, p0, Ll/᩻ۙᩳ;->ۧ:Ll/ܺۙᩳ;

    invoke-virtual {v0}, Ll/ܺۙᩳ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    move-object v1, v0

    check-cast v1, Ll/᩷ۙᩳ;

    invoke-virtual {v1}, Ll/᩷ۙᩳ;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ll/᩷ۙᩳ;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺᩶ᩳ;

    invoke-virtual {p1, v1, p2, p3}, Ll/ۢ۬ᩳ;->֫(Ll/᩺᩶ᩳ;J)Ll/ۢ۬ᩳ;

    move-result-object p1

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method public final ֫()Ll/ܺۙᩳ;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/᩻ۙᩳ;->ۧ:Ll/ܺۙᩳ;

    return-object v0
.end method

.method public final ֫(IILl/ۨ᩹ᩳ;Ll/ۨ᩹ᩳ;I)V
    .locals 15

    move-object v1, p0

    move/from16 v0, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    .line 41
    iget-wide v6, v1, Ll/᩻ۙᩳ;->ᩳ:J

    const-wide v8, 0x7fffffffffffffffL

    cmp-long v10, v6, v8

    if-eqz v10, :cond_6

    .line 42
    iget-object v6, v1, Ll/᩻ۙᩳ;->ܳ:Ljava/util/function/Supplier;

    invoke-interface {v6}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۚۗᩳ;

    invoke-static {v6}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    invoke-virtual {v6}, Ll/ۚۗᩳ;->ܽ()I

    move-result v7

    invoke-virtual/range {p3 .. p3}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v8

    if-gt v7, v8, :cond_5

    invoke-virtual {v6}, Ll/ۚۗᩳ;->֫()I

    move-result v7

    invoke-virtual/range {p3 .. p3}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v8

    if-gt v7, v8, :cond_5

    .line 46
    iget-boolean v7, v1, Ll/᩻ۙᩳ;->֫:Z

    if-eqz v7, :cond_0

    if-le v2, v0, :cond_0

    if-lez v5, :cond_0

    invoke-virtual {v6}, Ll/ۚۗᩳ;->ܽ()I

    move-result v7

    if-ne v7, v2, :cond_0

    invoke-virtual {v6}, Ll/ۚۗᩳ;->֫()I

    move-result v7

    if-ne v7, v2, :cond_0

    .line 48
    new-instance v6, Ll/ۚۗᩳ;

    invoke-direct {v6, v0, v2}, Ll/ۚۗᩳ;-><init>(II)V

    :cond_0
    move-object v8, v6

    .line 50
    iget-object v6, v1, Ll/᩻ۙᩳ;->ۧ:Ll/ܺۙᩳ;

    sub-int v7, v2, v0

    const-wide/16 v11, 0x1

    if-eq v7, v5, :cond_1

    goto :goto_1

    .line 73
    :cond_1
    invoke-virtual/range {p3 .. p4}, Ll/ۨ᩹ᩳ;->ۧ(Ll/ۨ᩹ᩳ;)Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_3

    .line 74
    :cond_2
    new-instance v7, Ll/᩷᩹ᩳ;

    invoke-direct {v7, v3, v0}, Ll/᩷᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;I)V

    .line 75
    :try_start_0
    new-instance v9, Ll/᩷᩹ᩳ;

    invoke-direct {v9, v4, v0}, Ll/᩷᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v5, :cond_4

    .line 77
    :try_start_1
    invoke-virtual {v7}, Ll/᩷᩹ᩳ;->ܽ()C

    move-result v13

    invoke-virtual {v9}, Ll/᩷᩹ᩳ;->ܽ()C

    move-result v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eq v13, v14, :cond_3

    .line 79
    :try_start_2
    invoke-virtual {v9}, Ll/᩷᩹ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {v7}, Ll/᩷᩹ᩳ;->close()V

    .line 52
    :goto_1
    invoke-virtual {v3, v0, v2}, Ll/ۨ᩹ᩳ;->֫(II)Ll/ۨ᩹ᩳ;

    move-result-object v9

    add-int v2, v0, v5

    .line 53
    invoke-virtual {v4, v0, v2}, Ll/ۨ᩹ᩳ;->֫(II)Ll/ۨ᩹ᩳ;

    move-result-object v10

    .line 54
    new-instance v13, Ll/᩺᩶ᩳ;

    iget-wide v4, v1, Ll/᩻ۙᩳ;->ܽ:J

    iget-wide v2, v1, Ll/᩻ۙᩳ;->ᩳ:J

    add-long v6, v2, v11

    move-object v2, v13

    move/from16 v3, p1

    invoke-direct/range {v2 .. v10}, Ll/᩺᩶ᩳ;-><init>(IJJLl/ۚۗᩳ;Ll/ۨ᩹ᩳ;Ll/ۨ᩹ᩳ;)V

    .line 55
    iget-object v0, v1, Ll/᩻ۙᩳ;->ۧ:Ll/ܺۙᩳ;

    invoke-virtual {v0, v13}, Ll/ܺۙᩳ;->֫(Ljava/lang/Object;)Ll/ܺۙᩳ;

    move-result-object v6

    goto :goto_3

    :cond_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 74
    :try_start_3
    invoke-virtual {v9}, Ll/᩷᩹ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_4
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v2

    .line 79
    :cond_4
    invoke-virtual {v9}, Ll/᩷᩹ᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    invoke-virtual {v7}, Ll/᩷᩹ᩳ;->close()V

    .line 58
    :goto_3
    iput-object v6, v1, Ll/᩻ۙᩳ;->ۧ:Ll/ܺۙᩳ;

    .line 59
    iget-wide v2, v1, Ll/᩻ۙᩳ;->ᩳ:J

    add-long/2addr v2, v11

    iput-wide v2, v1, Ll/᩻ۙᩳ;->ᩳ:J

    iput-wide v2, v1, Ll/᩻ۙᩳ;->ܽ:J

    return-void

    :catchall_2
    move-exception v0

    move-object v2, v0

    .line 74
    :try_start_5
    invoke-virtual {v7}, Ll/᩷᩹ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v2

    .line 44
    :cond_5
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "Selection exceeds text length"

    invoke-direct {v0, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 41
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Edit mark exhausted"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ()J
    .locals 2

    .line 35
    iget-wide v0, p0, Ll/᩻ۙᩳ;->ܽ:J

    return-wide v0
.end method

.method public final ܽ()J
    .locals 2

    .line 36
    iget-wide v0, p0, Ll/᩻ۙᩳ;->ᩳ:J

    return-wide v0
.end method
