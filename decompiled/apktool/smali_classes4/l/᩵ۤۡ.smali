.class public Ll/᩵ۤۡ;
.super Ljava/io/IOException;
.source "A2RB"


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 18
    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0

    .line 11
    invoke-virtual {p0, p1}, Ll/᩵ۤۡ;->initCause(Ljava/lang/Throwable;)V

    return-object p0
.end method

.method public final declared-synchronized initCause(Ljava/lang/Throwable;)V
    .locals 1

    move-object v0, p0

    monitor-enter v0

    .line 24
    :try_start_0
    invoke-super {p0, p1}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 31
    const-class v0, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, ": "

    .line 0
    invoke-static {v0, v2, v1}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method
