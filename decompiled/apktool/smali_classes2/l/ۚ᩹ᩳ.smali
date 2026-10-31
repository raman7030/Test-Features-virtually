.class public final Ll/ۚ᩹ᩳ;
.super Ljava/lang/Object;
.source "T6QD"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ۗ:I

.field public final ۙ:I

.field public final ۤ:Ljava/lang/Object;

.field public final ۫:Ll/᩸۬ᩳ;

.field public final ۬:Ll/᩸۬ᩳ;

.field public final ᩶:Ljava/util/IdentityHashMap;

.field public ᩸:Ljava/lang/Runnable;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/᩸۬ᩳ;Ll/᩸۬ᩳ;)V
    .locals 5

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۚ᩹ᩳ;->ۤ:Ljava/lang/Object;

    .line 15
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v0, p0, Ll/ۚ᩹ᩳ;->᩶:Ljava/util/IdentityHashMap;

    .line 19
    new-instance v0, Ll/֡᩹ᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۚ᩹ᩳ;->᩸:Ljava/lang/Runnable;

    if-eq p1, p2, :cond_0

    .line 25
    iget-object v0, p1, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v1, p2, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    if-ne v0, v1, :cond_0

    iget v0, p1, Ll/᩸۬ᩳ;->ۗ:I

    iget v1, p2, Ll/᩸۬ᩳ;->ۗ:I

    if-ne v0, v1, :cond_0

    iget v0, p1, Ll/᩸۬ᩳ;->ۤ:I

    iget v1, p2, Ll/᩸۬ᩳ;->ۤ:I

    if-ne v0, v1, :cond_0

    iget-object v0, p1, Ll/᩸۬ᩳ;->ۧ֫:Ljava/util/UUID;

    iget-object v1, p2, Ll/᩸۬ᩳ;->ۧ֫:Ljava/util/UUID;

    .line 26
    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p2, Ll/᩸۬ᩳ;->ۨ:J

    iget-wide v2, p1, Ll/᩸۬ᩳ;->ۨ:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 29
    iput-object p1, p0, Ll/ۚ᩹ᩳ;->۬:Ll/᩸۬ᩳ;

    .line 30
    iput-object p2, p0, Ll/ۚ᩹ᩳ;->۫:Ll/᩸۬ᩳ;

    const p1, 0xf4240

    .line 31
    iput p1, p0, Ll/ۚ᩹ᩳ;->ۙ:I

    .line 32
    invoke-direct {p0}, Ll/ۚ᩹ᩳ;->ܽ()V

    return-void

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid recovery graph copy configuration"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ll/᩸۬ᩳ;Ll/᩸۬ᩳ;I)V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance p3, Ljava/lang/Object;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Ll/ۚ᩹ᩳ;->ۤ:Ljava/lang/Object;

    .line 15
    new-instance p3, Ljava/util/IdentityHashMap;

    invoke-direct {p3}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p3, p0, Ll/ۚ᩹ᩳ;->᩶:Ljava/util/IdentityHashMap;

    .line 19
    new-instance p3, Ll/֡᩹ᩳ;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Ll/ۚ᩹ᩳ;->᩸:Ljava/lang/Runnable;

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 41
    iget p3, p1, Ll/᩸۬ᩳ;->ۗ:I

    iget v0, p2, Ll/᩸۬ᩳ;->ۗ:I

    if-ne p3, v0, :cond_0

    iget p3, p1, Ll/᩸۬ᩳ;->ۤ:I

    iget v0, p2, Ll/᩸۬ᩳ;->ۤ:I

    if-ne p3, v0, :cond_0

    goto :goto_0

    .line 43
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid session graph copy configuration"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 44
    :cond_1
    :goto_0
    iput-object p1, p0, Ll/ۚ᩹ᩳ;->۬:Ll/᩸۬ᩳ;

    .line 45
    iput-object p2, p0, Ll/ۚ᩹ᩳ;->۫:Ll/᩸۬ᩳ;

    const p1, 0xf4240

    .line 46
    iput p1, p0, Ll/ۚ᩹ᩳ;->ۙ:I

    .line 47
    invoke-direct {p0}, Ll/ۚ᩹ᩳ;->ܽ()V

    return-void
.end method

.method public static ֫(Ll/᩸۬ᩳ;Ll/᩸۬ᩳ;)Ll/ۚ᩹ᩳ;
    .locals 2

    .line 37
    new-instance v0, Ll/ۚ᩹ᩳ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Ll/ۚ᩹ᩳ;-><init>(Ll/᩸۬ᩳ;Ll/᩸۬ᩳ;I)V

    return-object v0
.end method

.method private ֫(Ll/᩶᩹ᩳ;)Ll/᩶᩹ᩳ;
    .locals 12

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 77
    :cond_0
    iget-object v1, p0, Ll/ۚ᩹ᩳ;->᩶:Ljava/util/IdentityHashMap;

    invoke-virtual {v1, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶᩹ᩳ;

    if-eqz v2, :cond_1

    return-object v2

    .line 79
    :cond_1
    invoke-virtual {p0}, Ll/ۚ᩹ᩳ;->֫()V

    .line 81
    instance-of v2, p1, Ll/᩸᩹ᩳ;

    const/4 v3, 0x0

    iget-object v5, p0, Ll/ۚ᩹ᩳ;->ۤ:Ljava/lang/Object;

    if-eqz v2, :cond_5

    .line 82
    move-object v2, p1

    check-cast v2, Ll/᩸᩹ᩳ;

    .line 83
    iget-object v4, v2, Ll/᩸᩹ᩳ;->᩷:Ll/۠۬ᩳ;

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, v4, Ll/۠۬ᩳ;->ۜ:Ll/᩸۬ᩳ;

    :goto_0
    iget-object v4, p0, Ll/ۚ᩹ᩳ;->۬:Ll/᩸۬ᩳ;

    if-ne v0, v4, :cond_4

    .line 85
    invoke-virtual {v2}, Ll/᩸᩹ᩳ;->ᩳ()Ljava/lang/Object;

    move-result-object v0

    .line 86
    invoke-virtual {v1, v0}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩸᩹ᩳ;

    if-nez v4, :cond_7

    .line 88
    invoke-virtual {p0}, Ll/ۚ᩹ᩳ;->֫()V

    .line 89
    invoke-virtual {v2}, Ll/᩸᩹ᩳ;->ܽ()Ll/ܶ᩹ᩳ;

    move-result-object v11

    iget-object v4, v11, Ll/ܶ᩹ᩳ;->᩹:Ll/ۧ۫ᩳ;

    .line 90
    :try_start_0
    iget-object v6, p0, Ll/ۚ᩹ᩳ;->۫:Ll/᩸۬ᩳ;

    if-eqz v6, :cond_3

    new-instance v2, Ll/᩸᩹ᩳ;

    invoke-virtual {v6, v4}, Ll/᩸۬ᩳ;->֫(Ll/ۧ۫ᩳ;)Ll/۠۬ᩳ;

    move-result-object v3

    invoke-direct {v2, v5, v3}, Ll/᩸᩹ᩳ;-><init>(Ljava/lang/Object;Ll/۠۬ᩳ;)V

    move-object v4, v2

    goto :goto_1

    .line 92
    :cond_3
    iget v9, v2, Ll/᩶᩹ᩳ;->ۧ:I

    new-array v7, v9, [C

    .line 93
    invoke-virtual {v4, v3, v9, v7, v3}, Ll/ۧ۫ᩳ;->֫(II[CI)V

    .line 94
    new-instance v3, Ll/᩸᩹ᩳ;

    invoke-virtual {v2}, Ll/᩸᩹ᩳ;->֫()I

    move-result v6

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v4, v3

    .line 16
    invoke-direct/range {v4 .. v10}, Ll/᩸᩹ᩳ;-><init>(Ljava/lang/Object;I[CIILl/᩸۬ᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v4, v3

    .line 96
    :goto_1
    invoke-virtual {v11}, Ll/ܶ᩹ᩳ;->close()V

    .line 97
    invoke-virtual {v1, v0, v4}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :catchall_0
    move-exception p1

    .line 89
    :try_start_1
    invoke-virtual {v11}, Ll/ܶ᩹ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1

    .line 84
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Text page belongs to another recovery generation"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 103
    :cond_5
    move-object v0, p1

    check-cast v0, Ll/᩻᩹ᩳ;

    iget-object v0, v0, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    .line 104
    array-length v2, v0

    new-array v2, v2, [Ll/᩶᩹ᩳ;

    .line 105
    :goto_3
    array-length v4, v0

    if-ge v3, v4, :cond_6

    aget-object v4, v0, v3

    invoke-direct {p0, v4}, Ll/ۚ᩹ᩳ;->֫(Ll/᩶᩹ᩳ;)Ll/᩶᩹ᩳ;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 106
    :cond_6
    new-instance v4, Ll/᩻᩹ᩳ;

    invoke-direct {v4, v5, v2}, Ll/᩻᩹ᩳ;-><init>(Ljava/lang/Object;[Ll/᩶᩹ᩳ;)V

    .line 108
    :cond_7
    :goto_4
    invoke-virtual {v1, p1, v4}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v4
.end method

.method private ܽ()V
    .locals 2

    .line 51
    iget-object v0, p0, Ll/ۚ᩹ᩳ;->۬:Ll/᩸۬ᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->᩺ۧ()V

    .line 52
    :cond_0
    :try_start_0
    iget-object v1, p0, Ll/ۚ᩹ᩳ;->۫:Ll/᩸۬ᩳ;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->᩺ۧ()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    :goto_0
    if-eqz v0, :cond_2

    .line 53
    invoke-virtual {v0}, Ll/᩸۬ᩳ;->᩻()V

    :cond_2
    throw v1
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 120
    iget-object v0, p0, Ll/ۚ᩹ᩳ;->۬:Ll/᩸۬ᩳ;

    iget-boolean v1, p0, Ll/ۚ᩹ᩳ;->᩹:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 121
    iput-boolean v1, p0, Ll/ۚ᩹ᩳ;->᩹:Z

    .line 122
    iget-object v1, p0, Ll/ۚ᩹ᩳ;->᩶:Ljava/util/IdentityHashMap;

    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->clear()V

    .line 123
    :try_start_0
    iget-object v1, p0, Ll/ۚ᩹ᩳ;->۫:Ll/᩸۬ᩳ;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->᩻()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->᩻()V

    :cond_2
    :goto_0
    return-void

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->᩻()V

    :cond_3
    throw v1
.end method

.method public final ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 56
    iget-object v0, p0, Ll/ۚ᩹ᩳ;->᩶:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۨ᩹ᩳ;)Ll/ۨ᩹ᩳ;
    .locals 6

    .line 63
    iget-object v0, p1, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    iget v1, p1, Ll/ۨ᩹ᩳ;->ۧ:I

    iget v2, p1, Ll/ۨ᩹ᩳ;->֫:I

    iget-object v3, p0, Ll/ۚ᩹ᩳ;->۬:Ll/᩸۬ᩳ;

    if-ne v0, v3, :cond_3

    iget-object v0, p0, Ll/ۚ᩹ᩳ;->۫:Ll/᩸۬ᩳ;

    if-eqz v0, :cond_0

    iget v4, v0, Ll/᩸۬ᩳ;->ۗ:I

    if-ne v2, v4, :cond_3

    iget v4, v0, Ll/᩸۬ᩳ;->ۤ:I

    if-ne v1, v4, :cond_3

    :cond_0
    if-nez v3, :cond_1

    if-nez v0, :cond_1

    return-object p1

    .line 67
    :cond_1
    iget-object v3, p0, Ll/ۚ᩹ᩳ;->᩶:Ljava/util/IdentityHashMap;

    invoke-virtual {v3, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۨ᩹ᩳ;

    if-eqz v4, :cond_2

    return-object v4

    .line 69
    :cond_2
    invoke-virtual {p0}, Ll/ۚ᩹ᩳ;->֫()V

    .line 70
    new-instance v4, Ll/ۨ᩹ᩳ;

    iget-object v5, p1, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    invoke-direct {p0, v5}, Ll/ۚ᩹ᩳ;->֫(Ll/᩶᩹ᩳ;)Ll/᩶᩹ᩳ;

    move-result-object v5

    invoke-direct {v4, v5, v2, v1, v0}, Ll/ۨ᩹ᩳ;-><init>(Ll/᩶᩹ᩳ;IILl/᩸۬ᩳ;)V

    .line 71
    invoke-virtual {v3, p1, v4}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v4

    .line 64
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string v0, "History tree belongs to another recovery generation"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()V
    .locals 2

    .line 113
    iget-object v0, p0, Ll/ۚ᩹ᩳ;->᩸:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 114
    iget v0, p0, Ll/ۚ᩹ᩳ;->ۗ:I

    iget v1, p0, Ll/ۚ᩹ᩳ;->ۙ:I

    if-eq v0, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 115
    iput v0, p0, Ll/ۚ᩹ᩳ;->ۗ:I

    return-void

    .line 114
    :cond_0
    new-instance v0, Ll/ܰ۬ᩳ;

    const-string v1, "Recovery graph copy object limit exceeded"

    .line 8
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 114
    throw v0
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ۚ᩹ᩳ;->᩶:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ljava/lang/Runnable;)V
    .locals 0

    .line 22
    iput-object p1, p0, Ll/ۚ᩹ᩳ;->᩸:Ljava/lang/Runnable;

    return-void
.end method
