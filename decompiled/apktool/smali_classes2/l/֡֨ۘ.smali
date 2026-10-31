.class public abstract Ll/֡֨ۘ;
.super Ljava/lang/Object;
.source "289S"


# instance fields
.field public final ۙ:J

.field public final ᩶:J

.field public final ᩸:Ll/᩹ۛۖ;

.field public final ᩹:Ll/ܶܽۘ;


# direct methods
.method public constructor <init>(Ll/ܶܽۘ;Ll/ۙ֫ۘ;)V
    .locals 2

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    invoke-virtual {p1}, Ll/ܶܽۘ;->֫()Ll/᩻ۧۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩻ۧۘ;->ۜ()Ll/᩷ۧۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩷ۧۘ;->֫()Ll/᩹ۛۖ;

    move-result-object v0

    iput-object v0, p0, Ll/֡֨ۘ;->᩸:Ll/᩹ۛۖ;

    .line 47
    iput-object p1, p0, Ll/֡֨ۘ;->᩹:Ll/ܶܽۘ;

    .line 48
    invoke-virtual {p1}, Ll/ܶܽۘ;->ᩳ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/֡֨ۘ;->᩶:J

    .line 49
    invoke-virtual {p2}, Ll/ۙ֫ۘ;->ۖ()J

    move-result-wide p1

    iput-wide p1, p0, Ll/֡֨ۘ;->ۙ:J

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܽۨۖ;Ljava/util/EnumSet;)Ll/ܽۨۖ;
    .locals 3

    .line 57
    :try_start_0
    iget-object v0, p0, Ll/֡֨ۘ;->᩹:Ll/ܶܽۘ;

    const/4 v1, 0x0

    .line 305
    invoke-virtual {v0, p1, v1}, Ll/ܶܽۘ;->֫(Ll/ܽۨۖ;Z)Ll/ۧ۟ۖ;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    .line 77
    :try_start_1
    iget-wide v0, p0, Ll/֡֨ۘ;->ۙ:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ll/ۧ۟ۖ;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽۨۖ;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    .line 105
    invoke-virtual {p1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v0

    check-cast v0, Ll/᩻ۨۖ;

    .line 106
    invoke-virtual {v0}, Ll/᩻ۨۖ;->ۡ()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll/۟۫ۖ;->ᩳ(J)Ll/۟۫ۖ;

    move-result-object v1

    .line 107
    invoke-virtual {p2, v1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p1

    .line 108
    :cond_0
    new-instance p1, Ll/ᩴ֨ۘ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "expected="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, v0, p2}, Ll/ᩴ֨ۘ;-><init>(Ll/᩻ۨۖ;Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception p1

    .line 92
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 84
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-lt p2, v0, :cond_1

    .line 85
    invoke-static {}, Ll/᩵֨ۘ;->֫()Ljava/nio/channels/InterruptedByTimeoutException;

    move-result-object p2

    goto :goto_0

    .line 87
    :cond_1
    new-instance p2, Ljava/io/InterruptedIOException;

    const-string v0, "InterruptedByTimeout"

    invoke-direct {p2, v0}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 89
    :goto_0
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 90
    throw p2

    :catch_2
    move-exception p1

    .line 79
    new-instance p2, Ljava/io/InterruptedIOException;

    invoke-direct {p2}, Ljava/io/InterruptedIOException;-><init>()V

    .line 80
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 81
    throw p2

    :catch_3
    move-exception p1

    .line 71
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_4
    move-exception p1

    .line 68
    throw p1
.end method

.method public final ֫()Ll/᩹ۛۖ;
    .locals 1

    .line 53
    iget-object v0, p0, Ll/֡֨ۘ;->᩸:Ll/᩹ۛۖ;

    return-object v0
.end method

.method public final ܽ()J
    .locals 2

    .line 61
    iget-wide v0, p0, Ll/֡֨ۘ;->᩶:J

    return-wide v0
.end method
