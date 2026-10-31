.class public final Ll/ۛ֫ܿ;
.super Ll/֡۟ᩳ;
.source "96RH"


# static fields
.field public static final ֨֫:Ll/ۧۤᩴ;


# instance fields
.field public final ֡֫:Ll/ۗ᩻᩵;

.field public final ۖ֫:Ll/᩷۠ᩴ;

.field public final ۘ֫:Ll/ܶ᩵ܿ;

.field public final ۚ֫:Ll/᩻۬ᩳ;

.field public volatile ۡ֫:Z

.field public final ܺ֫:Ll/֨֫ܿ;

.field public ᩴ֫:Ll/۟᩹ᩳ;

.field public final ᩵֫:Ll/᩹ᩴᩳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    sput-object v0, Ll/ۛ֫ܿ;->֨֫:Ll/ۧۤᩴ;

    return-void
.end method

.method public constructor <init>(Ll/᩻۬ᩳ;Ll/ܶ᩵ܿ;Ll/᩷۠ᩴ;Ll/᩹ᩴᩳ;)V
    .locals 2

    .line 35
    invoke-direct {p0, p1}, Ll/֡۟ᩳ;-><init>(Ll/᩻۬ᩳ;)V

    .line 30
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    iput-object v0, p0, Ll/ۛ֫ܿ;->֡֫:Ll/ۗ᩻᩵;

    .line 32
    sget-object v0, Ll/۟᩹ᩳ;->֫:Ll/۟᩹ᩳ;

    iput-object v0, p0, Ll/ۛ֫ܿ;->ᩴ֫:Ll/۟᩹ᩳ;

    .line 36
    iput-object p4, p0, Ll/ۛ֫ܿ;->᩵֫:Ll/᩹ᩴᩳ;

    .line 37
    iput-object p1, p0, Ll/ۛ֫ܿ;->ۚ֫:Ll/᩻۬ᩳ;

    iput-object p2, p0, Ll/ۛ֫ܿ;->ۘ֫:Ll/ܶ᩵ܿ;

    iput-object p3, p0, Ll/ۛ֫ܿ;->ۖ֫:Ll/᩷۠ᩴ;

    .line 39
    invoke-virtual {p1}, Ll/᩻۬ᩳ;->᩹()J

    move-result-wide p2

    const-wide/16 v0, 0x0

    cmp-long p4, p2, v0

    if-nez p4, :cond_0

    const-wide/32 p2, 0x1000000

    invoke-virtual {p1, p2, p3}, Ll/᩻۬ᩳ;->ᩳ(J)V

    .line 40
    :cond_0
    new-instance p1, Ll/֨֫ܿ;

    invoke-direct {p1, p0}, Ll/֨֫ܿ;-><init>(Ll/۟᩺ᩳ;)V

    iput-object p1, p0, Ll/ۛ֫ܿ;->ܺ֫:Ll/֨֫ܿ;

    return-void
.end method

.method public static ֫(Ll/۬ۜܽ;Ll/ܶ᩵ܿ;)Ljava/lang/String;
    .locals 3

    .line 121
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    const v1, -0x1dcdacac

    if-ne v0, v1, :cond_2

    .line 122
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object p0

    if-nez p1, :cond_0

    .line 123
    sget-object p1, Ll/۟᩹ᩳ;->֫:Ll/۟᩹ᩳ;

    invoke-interface {p1, p0}, Ll/۟᩹ᩳ;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 124
    :cond_0
    invoke-static {p1}, Ll/ۛ֫ܿ;->ܽ(Ll/ܶ᩵ܿ;)Ll/᩷۠ᩴ;

    move-result-object p0

    .line 125
    sget-object p1, Ll/ۛ֫ܿ;->֨֫:Ll/ۧۤᩴ;

    invoke-virtual {p1, p0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛ֫ܿ;

    if-eqz p1, :cond_1

    .line 126
    iget-boolean v0, p1, Ll/ۛ֫ܿ;->ۡ֫:Z

    if-nez v0, :cond_1

    .line 127
    invoke-virtual {p1}, Ll/ۤ᩸ᩳ;->᩻()Ll/۫᩹ᩳ;

    move-result-object p0

    :try_start_0
    invoke-virtual {p0}, Ll/۬᩹ᩳ;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Ll/۬᩹ᩳ;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {p0}, Ll/۬᩹ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    .line 129
    :cond_1
    invoke-static {p0}, Ll/᩹ᩴᩳ;->֫(Ll/᩷۠ᩴ;)Ll/᩹ᩴᩳ;

    move-result-object p1

    const/4 v0, 0x0

    .line 131
    :try_start_2
    invoke-virtual {p1}, Ll/᩹ᩴᩳ;->֫()Ll/ۗ᩻᩵;

    move-result-object v1

    invoke-static {v1}, Ll/ۛ֫ܿ;->֫(Ll/ۗ᩻᩵;)V

    .line 133
    invoke-static {}, Ll/ۜ֡ᩳ;->֫()Ll/֨۬ᩳ;

    move-result-object v1

    invoke-static {}, Ll/ۜ֡ᩳ;->ܽ()Ll/ۙ۬ᩳ;

    move-result-object v2

    .line 132
    invoke-static {p0, v1, v2}, Ll/᩻۬ᩳ;->ۧ(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;Ll/ۙ۬ᩳ;)Ll/ܿ۬ᩳ;

    move-result-object p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 134
    :try_start_3
    invoke-virtual {p0}, Ll/ܿ۬ᩳ;->᩻()Ll/۫᩹ᩳ;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 135
    :try_start_4
    invoke-virtual {v1}, Ll/۬᩹ᩳ;->toString()Ljava/lang/String;

    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 136
    :try_start_5
    invoke-virtual {v1}, Ll/۬᩹ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :try_start_6
    invoke-virtual {p0}, Ll/ܿ۬ᩳ;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 138
    invoke-virtual {p1, v0}, Ll/᩹ᩴᩳ;->֫(Ljava/lang/Throwable;)V

    return-object v2

    :catchall_2
    move-exception v2

    .line 132
    :try_start_7
    invoke-virtual {v1}, Ll/۬᩹ᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v1

    :try_start_8
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :catchall_4
    move-exception v1

    :try_start_9
    invoke-virtual {p0}, Ll/ܿ۬ᩳ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto :goto_2

    :catchall_5
    move-exception p0

    :try_start_a
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    :catchall_6
    move-exception p0

    goto :goto_3

    :catch_0
    move-exception p0

    .line 137
    :try_start_b
    new-instance v1, Ljava/io/UncheckedIOException;

    invoke-direct {v1, p0}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 138
    :goto_3
    invoke-virtual {p1, v0}, Ll/᩹ᩴᩳ;->֫(Ljava/lang/Throwable;)V

    throw p0

    .line 121
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid stored text magic"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/۬ۜܽ;Ll/۟᩹ᩳ;)Ll/ۛ֫ܿ;
    .locals 2

    .line 107
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    const v1, -0x1dcdacac

    if-ne v0, v1, :cond_2

    if-nez p1, :cond_0

    .line 108
    sget-object p1, Ll/۟᩹ᩳ;->֫:Ll/۟᩹ᩳ;

    .line 110
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Ll/۟᩹ᩳ;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 112
    invoke-static {p0}, Ll/ۛ֫ܿ;->ܽ(Ll/ܶ᩵ܿ;)Ll/᩷۠ᩴ;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ll/ܳ۠ᩴ;

    invoke-static {v0, v1}, Ll/ܿ۠ᩴ;->isDirectory(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 113
    invoke-static {p0}, Ll/ۛ֫ܿ;->ᩳ(Ll/ܶ᩵ܿ;)Ll/ۛ֫ܿ;

    move-result-object p0

    .line 142
    iput-object p1, p0, Ll/ۛ֫ܿ;->ᩴ֫:Ll/۟᩹ᩳ;

    return-object p0

    .line 112
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Text storage is missing"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 116
    new-instance p1, Ljava/io/UncheckedIOException;

    invoke-direct {p1, p0}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw p1

    .line 107
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid stored text magic"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ۗ᩻᩵;)V
    .locals 2

    .line 191
    :try_start_0
    invoke-virtual {p0}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;
    :try_end_0
    .catch Ll/۬᩻᩵; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 192
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Text storage persistence failed"

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static synthetic ֫(Ll/ۛ֫ܿ;Ljava/lang/Throwable;)V
    .locals 3

    .line 161
    iget-object v0, p0, Ll/ۛ֫ܿ;->֡֫:Ll/ۗ᩻᩵;

    sget-object v1, Ll/ۛ֫ܿ;->֨֫:Ll/ۧۤᩴ;

    iget-object v2, p0, Ll/ۛ֫ܿ;->ۖ֫:Ll/᩷۠ᩴ;

    invoke-virtual {v1, v2, p0}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    iget-object p0, p0, Ll/ۛ֫ܿ;->᩵֫:Ll/᩹ᩴᩳ;

    invoke-virtual {p0, p1}, Ll/᩹ᩴᩳ;->֫(Ljava/lang/Throwable;)V

    if-nez p1, :cond_0

    const/4 p0, 0x0

    .line 163
    invoke-virtual {v0, p0}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    return-void

    .line 164
    :cond_0
    invoke-virtual {v0, p1}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static ۧ(Ll/ܶ᩵ܿ;)Ll/ۗ᩻᩵;
    .locals 5

    .line 180
    invoke-static {p0}, Ll/ۛ֫ܿ;->ܽ(Ll/ܶ᩵ܿ;)Ll/᩷۠ᩴ;

    move-result-object v0

    .line 181
    invoke-static {v0}, Ll/᩹ᩴᩳ;->֫(Ll/᩷۠ᩴ;)Ll/᩹ᩴᩳ;

    move-result-object v1

    .line 182
    invoke-virtual {v1}, Ll/᩹ᩴᩳ;->֫()Ll/ۗ᩻᩵;

    move-result-object v2

    new-instance v3, Ll/۫֫ܿ;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v0, p0}, Ll/۫֫ܿ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sget-object p0, Ll/֫ۨۡ;->ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v2, v3, p0}, Ll/ۗ᩻᩵;->ۧ(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)Ll/ۗ᩻᩵;

    move-result-object p0

    new-instance v0, Ll/ۤ֫ܿ;

    invoke-direct {v0, v1}, Ll/ۤ֫ܿ;-><init>(Ll/᩹ᩴᩳ;)V

    .line 187
    invoke-virtual {p0, v0}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Ll/ܶ᩵ܿ;)Ll/᩷۠ᩴ;
    .locals 1

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".editable2"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p0, v0}, Ll/ۜ۠ᩴ;->of(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p0

    invoke-interface {p0}, Ll/᩷۠ᩴ;->toAbsolutePath()Ll/᩷۠ᩴ;

    move-result-object p0

    invoke-interface {p0}, Ll/᩷۠ᩴ;->normalize()Ll/᩷۠ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ(Ll/ܶ᩵ܿ;)Ll/ۛ֫ܿ;
    .locals 7

    .line 50
    invoke-static {p0}, Ll/ۛ֫ܿ;->ܽ(Ll/ܶ᩵ܿ;)Ll/᩷۠ᩴ;

    move-result-object v0

    .line 51
    sget-object v1, Ll/ۛ֫ܿ;->֨֫:Ll/ۧۤᩴ;

    invoke-virtual {v1, v0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֫ܿ;

    if-eqz v2, :cond_1

    .line 53
    iget-boolean v3, v2, Ll/ۛ֫ܿ;->ۡ֫:Z

    if-eqz v3, :cond_0

    .line 54
    iget-object v2, v2, Ll/ۛ֫ܿ;->֡֫:Ll/ۗ᩻᩵;

    invoke-static {v2}, Ll/ۛ֫ܿ;->֫(Ll/ۗ᩻᩵;)V

    goto :goto_0

    .line 53
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Text storage is already in use"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 56
    :cond_1
    :goto_0
    invoke-static {v0}, Ll/᩹ᩴᩳ;->֫(Ll/᩷۠ᩴ;)Ll/᩹ᩴᩳ;

    move-result-object v2

    const/4 v3, 0x0

    .line 59
    :try_start_0
    invoke-virtual {v2}, Ll/᩹ᩴᩳ;->֫()Ll/ۗ᩻᩵;

    move-result-object v4

    invoke-static {v4}, Ll/ۛ֫ܿ;->֫(Ll/ۗ᩻᩵;)V

    .line 60
    invoke-interface {v0}, Ll/᩷۠ᩴ;->getParent()Ll/᩷۠ᩴ;

    move-result-object v4

    const/4 v5, 0x0

    new-array v6, v5, [Ll/᩹۠ᩴ;

    invoke-static {v4, v6}, Ll/ܿ۠ᩴ;->createDirectories(Ll/᩷۠ᩴ;[Ll/᩹۠ᩴ;)Ll/᩷۠ᩴ;

    new-array v4, v5, [Ll/ܳ۠ᩴ;

    .line 61
    invoke-static {v0, v4}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 63
    invoke-static {}, Ll/ۜ֡ᩳ;->֫()Ll/֨۬ᩳ;

    move-result-object v4

    invoke-static {}, Ll/ۜ֡ᩳ;->ܽ()Ll/ۙ۬ᩳ;

    move-result-object v5

    .line 62
    invoke-static {v0, v4, v5}, Ll/᩻۬ᩳ;->ۧ(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;Ll/ۙ۬ᩳ;)Ll/ܿ۬ᩳ;

    move-result-object v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_3

    .line 64
    :try_start_1
    invoke-virtual {v4}, Ll/ܿ۬ᩳ;->ܽ()Ll/᩻۬ᩳ;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    :try_start_2
    invoke-virtual {v4}, Ll/ܿ۬ᩳ;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catchall_0
    move-exception p0

    .line 62
    :try_start_3
    invoke-virtual {v4}, Ll/ܿ۬ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p0

    .line 67
    :cond_2
    invoke-static {}, Ll/ۜ֡ᩳ;->֫()Ll/֨۬ᩳ;

    move-result-object v4

    invoke-static {}, Ll/ۜ֡ᩳ;->ܽ()Ll/ۙ۬ᩳ;

    move-result-object v5

    invoke-static {v0, v4, v5}, Ll/᩻۬ᩳ;->֫(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;Ll/ۙ۬ᩳ;)Ll/᩻۬ᩳ;

    move-result-object v5
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_3

    .line 69
    :goto_2
    :try_start_5
    new-instance v4, Ll/ۛ֫ܿ;

    invoke-direct {v4, v5, p0, v0, v2}, Ll/ۛ֫ܿ;-><init>(Ll/᩻۬ᩳ;Ll/ܶ᩵ܿ;Ll/᩷۠ᩴ;Ll/᩹ᩴᩳ;)V

    .line 70
    invoke-virtual {v1, v0, v4}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_0

    return-object v4

    :catch_0
    move-exception p0

    goto :goto_4

    :catch_1
    move-exception p0

    goto :goto_4

    :catch_2
    move-exception p0

    goto :goto_4

    :catch_3
    move-exception p0

    goto :goto_3

    :catch_4
    move-exception p0

    goto :goto_3

    :catch_5
    move-exception p0

    :goto_3
    move-object v5, v3

    :goto_4
    if-eqz v5, :cond_3

    .line 73
    :try_start_6
    invoke-virtual {v5}, Ll/᩻۬ᩳ;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception p0

    goto :goto_5

    :catch_6
    move-exception v0

    .line 74
    :try_start_7
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_6

    .line 75
    :goto_5
    invoke-virtual {v2, v3}, Ll/᩹ᩴᩳ;->֫(Ljava/lang/Throwable;)V

    throw p0

    :cond_3
    :goto_6
    invoke-virtual {v2, v3}, Ll/᩹ᩴᩳ;->֫(Ljava/lang/Throwable;)V

    .line 76
    throw p0
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 157
    invoke-virtual {p0}, Ll/ۛ֫ܿ;->᩵()V

    invoke-super {p0}, Ll/֡۟ᩳ;->close()V

    return-void
.end method

.method public final ֡()V
    .locals 3

    .line 151
    :try_start_0
    iget-object v0, p0, Ll/ۛ֫ܿ;->ۚ֫:Ll/᩻۬ᩳ;

    invoke-virtual {v0}, Ll/᩻۬ᩳ;->᩺()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/᩻۬ᩳ;->ۧ(J)Ll/ۗ᩻᩵;

    move-result-object v0

    invoke-static {v0}, Ll/ۛ֫ܿ;->֫(Ll/ۗ᩻᩵;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 152
    new-instance v1, Ljava/io/UncheckedIOException;

    invoke-direct {v1, v0}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw v1
.end method

.method public final ֫(Ll/۟᩹ᩳ;)V
    .locals 0

    if-nez p1, :cond_0

    .line 142
    sget-object p1, Ll/۟᩹ᩳ;->֫:Ll/۟᩹ᩳ;

    :cond_0
    iput-object p1, p0, Ll/ۛ֫ܿ;->ᩴ֫:Ll/۟᩹ᩳ;

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 2

    .line 146
    invoke-virtual {p0}, Ll/ۛ֫ܿ;->֡()V

    const v0, -0x1dcdacac

    .line 147
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 148
    iget-object v0, p0, Ll/ۛ֫ܿ;->ᩴ֫:Ll/۟᩹ᩳ;

    iget-object v1, p0, Ll/ۛ֫ܿ;->ۘ֫:Ll/ܶ᩵ܿ;

    invoke-interface {v0, v1}, Ll/۟᩹ᩳ;->֫(Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 168
    invoke-virtual {p0}, Ll/ۛ֫ܿ;->close()V

    if-eqz p1, :cond_0

    .line 170
    :try_start_0
    iget-object p1, p0, Ll/ۛ֫ܿ;->֡֫:Ll/ۗ᩻᩵;

    invoke-static {p1}, Ll/ۛ֫ܿ;->֫(Ll/ۗ᩻᩵;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 171
    new-instance v0, Ljava/io/UncheckedIOException;

    invoke-direct {v0, p1}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ܶ᩵ܿ;)Z
    .locals 1

    .line 46
    iget-object v0, p0, Ll/ۛ֫ܿ;->ۖ֫:Ll/᩷۠ᩴ;

    invoke-static {p1}, Ll/ۛ֫ܿ;->ܽ(Ll/ܶ᩵ܿ;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-interface {v0, p1}, Ll/᩷۠ᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۘ()V
    .locals 2

    .line 159
    invoke-super {p0}, Ll/֡۟ᩳ;->ۘ()V

    .line 160
    iget-object v0, p0, Ll/ۛ֫ܿ;->ۚ֫:Ll/᩻۬ᩳ;

    invoke-virtual {v0}, Ll/᩻۬ᩳ;->ᩴ()Ll/ۗ᩻᩵;

    move-result-object v0

    new-instance v1, Ll/۬֫ܿ;

    invoke-direct {v1, p0}, Ll/۬֫ܿ;-><init>(Ll/ۛ֫ܿ;)V

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;

    return-void
.end method

.method public final ܺۧ()V
    .locals 1

    .line 154
    iget-object v0, p0, Ll/ۛ֫ܿ;->ۚ֫:Ll/᩻۬ᩳ;

    invoke-virtual {v0}, Ll/᩻۬ᩳ;->۬()V

    return-void
.end method

.method public final ᩵()V
    .locals 1

    const/4 v0, 0x1

    .line 156
    iput-boolean v0, p0, Ll/ۛ֫ܿ;->ۡ֫:Z

    iget-object v0, p0, Ll/ۛ֫ܿ;->ܺ֫:Ll/֨֫ܿ;

    invoke-virtual {v0}, Ll/֨֫ܿ;->close()V

    return-void
.end method

.method public final ᩸֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ᩹֫()V
    .locals 1

    .line 175
    invoke-virtual {p0}, Ll/ۛ֫ܿ;->close()V

    iget-object v0, p0, Ll/ۛ֫ܿ;->֡֫:Ll/ۗ᩻᩵;

    invoke-static {v0}, Ll/ۛ֫ܿ;->֫(Ll/ۗ᩻᩵;)V

    return-void
.end method
