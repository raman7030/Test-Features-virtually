.class public Ll/֫ۛۡ;
.super Ljava/lang/Exception;
.source "32SL"


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 20
    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Ll/֫ۛۡ;->initCause(Ljava/lang/Throwable;)Ll/֫ۛۡ;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized initCause(Ljava/lang/Throwable;)Ll/֫ۛۡ;
    .locals 1

    move-object v0, p0

    monitor-enter v0

    .line 26
    :try_start_0
    invoke-super {p0, p1}, Ljava/lang/Exception;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 33
    const-class v0, Ljava/lang/Exception;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .line 34
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
