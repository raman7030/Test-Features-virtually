.class public final Ll/ᩴ֨ܿ;
.super Ljava/lang/Object;
.source "F7HH"


# instance fields
.field public ֫:Ljava/lang/String;

.field public final ۧ:I

.field public ܽ:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 63
    iput v0, p0, Ll/ᩴ֨ܿ;->ܽ:I

    .line 67
    iput p1, p0, Ll/ᩴ֨ܿ;->ۧ:I

    return-void
.end method

.method public static ֫(Ll/ᩴ֨ܿ;ILjava/lang/String;)V
    .locals 4

    const-string v1, "update "

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 79
    :try_start_0
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ᩴ֨ܿ;->ۧ:I

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " status "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " extra "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 80
    iput p1, p0, Ll/ᩴ֨ܿ;->ܽ:I

    .line 81
    iput-object p2, p0, Ll/ᩴ֨ܿ;->֫:Ljava/lang/String;

    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Ll/ᩴ֨ܿ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 71
    iget v0, p0, Ll/ᩴ֨ܿ;->ܽ:I

    return v0
.end method

.method public final declared-synchronized ܽ()V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 102
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 103
    invoke-static {}, Ll/᩵֨ܿ;->֫()Ll/ۙۜᩴ;

    move-result-object v1

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 104
    :try_start_1
    invoke-static {}, Ll/᩵֨ܿ;->֫()Ll/ۙۜᩴ;

    move-result-object v2

    iget v3, p0, Ll/ᩴ֨ܿ;->ۧ:I

    invoke-virtual {v2, v3}, Ll/ۙۜᩴ;->remove(I)Ljava/lang/Object;

    .line 105
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v2

    .line 105
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v2

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method

.method public final declared-synchronized ᩳ()Z
    .locals 5

    const-string v1, "waitStatusChanged "

    move-object v0, p0

    .line 4
    monitor-enter v0

    .line 86
    :try_start_0
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ᩴ֨ܿ;->ۧ:I

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 87
    iget v1, p0, Ll/ᩴ֨ܿ;->ܽ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    const/4 v3, 0x3

    if-eq v1, v3, :cond_2

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v3, 0x3a98

    .line 94
    :try_start_1
    invoke-virtual {p0, v3, v4}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    :catch_0
    :try_start_2
    iget v3, p0, Ll/ᩴ֨ܿ;->ܽ:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eq v1, v3, :cond_1

    const/4 v2, 0x1

    :cond_1
    monitor-exit v0

    return v2

    .line 91
    :cond_2
    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method
