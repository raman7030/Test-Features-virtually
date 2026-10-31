.class public final Ll/ۤۚۜ;
.super Ljava/lang/Object;
.source "574A"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final synthetic ᩶:Ll/ۨۚۜ;

.field public final ᩸:Ll/۫ۚۜ;

.field public ᩹:Ll/ۛۚۜ;


# direct methods
.method public constructor <init>(Ll/ۨۚۜ;Ll/۫ۚۜ;)V
    .locals 0

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤۚۜ;->᩶:Ll/ۨۚۜ;

    .line 76
    sget-object p1, Ll/ۛۚۜ;->ۗ:Ll/ۛۚۜ;

    iput-object p1, p0, Ll/ۤۚۜ;->᩹:Ll/ۛۚۜ;

    .line 80
    iput-object p2, p0, Ll/ۤۚۜ;->᩸:Ll/۫ۚۜ;

    return-void
.end method

.method private ۖ()V
    .locals 2

    .line 179
    iget-object v0, p0, Ll/ۤۚۜ;->᩶:Ll/ۨۚۜ;

    invoke-static {v0}, Ll/ۨۚۜ;->֫(Ll/ۨۚۜ;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۤۚۜ;->᩹:Ll/ۛۚۜ;

    sget-object v1, Ll/ۛۚۜ;->ۙ:Ll/ۛۚۜ;

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    const-string v0, "HLS playlist cache lease was released"

    const/4 v1, 0x0

    .line 180
    invoke-static {v0, v1}, Ll/ۨۚۜ;->֫(Ljava/lang/String;Ljava/lang/InterruptedException;)Ljava/io/InterruptedIOException;

    move-result-object v0

    throw v0
.end method

.method private ۘ()V
    .locals 2

    .line 169
    :try_start_0
    iget-object v0, p0, Ll/ۤۚۜ;->᩶:Ll/ۨۚۜ;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 175
    invoke-direct {p0}, Ll/ۤۚۜ;->ۖ()V

    return-void

    :catch_0
    move-exception v0

    .line 171
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 172
    invoke-direct {p0}, Ll/ۤۚۜ;->ۜ()V

    const-string v1, "Interrupted while waiting for HLS playlist cache"

    .line 173
    invoke-static {v1, v0}, Ll/ۨۚۜ;->֫(Ljava/lang/String;Ljava/lang/InterruptedException;)Ljava/io/InterruptedIOException;

    move-result-object v0

    throw v0
.end method

.method private ۜ()V
    .locals 3

    .line 191
    iget-object v0, p0, Ll/ۤۚۜ;->᩹:Ll/ۛۚۜ;

    sget-object v1, Ll/ۛۚۜ;->ۗ:Ll/ۛۚۜ;

    iget-object v2, p0, Ll/ۤۚۜ;->᩸:Ll/۫ۚۜ;

    if-ne v0, v1, :cond_0

    .line 192
    invoke-static {v2}, Ll/۫ۚۜ;->ᩳ(Ll/۫ۚۜ;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v2, v0}, Ll/۫ۚۜ;->ۧ(Ll/۫ۚۜ;I)V

    goto :goto_0

    .line 193
    :cond_0
    sget-object v1, Ll/ۛۚۜ;->᩹:Ll/ۛۚۜ;

    if-ne v0, v1, :cond_1

    .line 194
    invoke-static {v2}, Ll/۫ۚۜ;->ܽ(Ll/۫ۚۜ;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v2, v0}, Ll/۫ۚۜ;->֫(Ll/۫ۚۜ;I)V

    goto :goto_0

    .line 195
    :cond_1
    sget-object v1, Ll/ۛۚۜ;->᩶:Ll/ۛۚۜ;

    if-ne v0, v1, :cond_2

    invoke-static {v2}, Ll/۫ۚۜ;->ۧ(Ll/۫ۚۜ;)Ll/ۤۚۜ;

    move-result-object v0

    if-ne v0, p0, :cond_2

    const/4 v0, 0x0

    .line 196
    invoke-static {v2, v0}, Ll/۫ۚۜ;->֫(Ll/۫ۚۜ;Ll/ۤۚۜ;)V

    .line 198
    :cond_2
    :goto_0
    sget-object v0, Ll/ۛۚۜ;->ۙ:Ll/ۛۚۜ;

    iput-object v0, p0, Ll/ۤۚۜ;->᩹:Ll/ۛۚۜ;

    .line 199
    iget-object v0, p0, Ll/ۤۚۜ;->᩶:Ll/ۨۚۜ;

    invoke-static {v0, v2}, Ll/ۨۚۜ;->֫(Ll/ۨۚۜ;Ll/۫ۚۜ;)V

    .line 200
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 206
    iget-object v0, p0, Ll/ۤۚۜ;->᩶:Ll/ۨۚۜ;

    monitor-enter v0

    .line 207
    :try_start_0
    iget-object v1, p0, Ll/ۤۚۜ;->᩹:Ll/ۛۚۜ;

    sget-object v2, Ll/ۛۚۜ;->ۙ:Ll/ۛۚۜ;

    if-eq v1, v2, :cond_0

    .line 208
    invoke-direct {p0}, Ll/ۤۚۜ;->ۜ()V

    .line 210
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫()V
    .locals 4

    .line 85
    iget-object v0, p0, Ll/ۤۚۜ;->᩶:Ll/ۨۚۜ;

    monitor-enter v0

    .line 86
    :try_start_0
    sget-object v1, Ll/ۛۚۜ;->ۗ:Ll/ۛۚۜ;

    .line 185
    iget-object v2, p0, Ll/ۤۚۜ;->᩹:Ll/ۛۚۜ;

    if-ne v2, v1, :cond_1

    .line 87
    :goto_0
    iget-object v1, p0, Ll/ۤۚۜ;->᩸:Ll/۫ۚۜ;

    invoke-static {v1}, Ll/۫ۚۜ;->ۧ(Ll/۫ۚۜ;)Ll/ۤۚۜ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 88
    invoke-direct {p0}, Ll/ۤۚۜ;->ۘ()V

    goto :goto_0

    .line 90
    :cond_0
    invoke-direct {p0}, Ll/ۤۚۜ;->ۖ()V

    .line 91
    iget-object v1, p0, Ll/ۤۚۜ;->᩸:Ll/۫ۚۜ;

    invoke-static {v1}, Ll/۫ۚۜ;->ᩳ(Ll/۫ۚۜ;)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v1, v2}, Ll/۫ۚۜ;->ۧ(Ll/۫ۚۜ;I)V

    .line 92
    iget-object v1, p0, Ll/ۤۚۜ;->᩸:Ll/۫ۚۜ;

    invoke-static {v1}, Ll/۫ۚۜ;->ܽ(Ll/۫ۚۜ;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-static {v1, v2}, Ll/۫ۚۜ;->֫(Ll/۫ۚۜ;I)V

    .line 93
    sget-object v1, Ll/ۛۚۜ;->᩹:Ll/ۛۚۜ;

    iput-object v1, p0, Ll/ۤۚۜ;->᩹:Ll/ۛۚۜ;

    .line 94
    monitor-exit v0

    return-void

    .line 186
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected HLS playlist cache lease state: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ll/ۤۚۜ;->᩹:Ll/ۛۚۜ;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 94
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܳ()Z
    .locals 4

    .line 114
    iget-object v0, p0, Ll/ۤۚۜ;->᩶:Ll/ۨۚۜ;

    monitor-enter v0

    .line 115
    :try_start_0
    sget-object v1, Ll/ۛۚۜ;->᩹:Ll/ۛۚۜ;

    .line 185
    iget-object v2, p0, Ll/ۤۚۜ;->᩹:Ll/ۛۚۜ;

    if-ne v2, v1, :cond_3

    .line 116
    iget-object v1, p0, Ll/ۤۚۜ;->᩸:Ll/۫ۚۜ;

    invoke-static {v1}, Ll/۫ۚۜ;->ܽ(Ll/۫ۚۜ;)I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-static {v1, v2}, Ll/۫ۚۜ;->֫(Ll/۫ۚۜ;I)V

    .line 117
    iget-object v1, p0, Ll/ۤۚۜ;->᩸:Ll/۫ۚۜ;

    invoke-static {v1}, Ll/۫ۚۜ;->ۧ(Ll/۫ۚۜ;)Ll/ۤۚۜ;

    move-result-object v1

    if-nez v1, :cond_1

    .line 118
    sget-object v1, Ll/ۛۚۜ;->᩶:Ll/ۛۚۜ;

    iput-object v1, p0, Ll/ۤۚۜ;->᩹:Ll/ۛۚۜ;

    .line 119
    iget-object v1, p0, Ll/ۤۚۜ;->᩸:Ll/۫ۚۜ;

    invoke-static {v1, p0}, Ll/۫ۚۜ;->֫(Ll/۫ۚۜ;Ll/ۤۚۜ;)V

    .line 120
    iget-object v1, p0, Ll/ۤۚۜ;->᩶:Ll/ۨۚۜ;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 121
    :goto_0
    iget-object v1, p0, Ll/ۤۚۜ;->᩸:Ll/۫ۚۜ;

    invoke-static {v1}, Ll/۫ۚۜ;->ܽ(Ll/۫ۚۜ;)I

    move-result v1

    if-lez v1, :cond_0

    .line 122
    invoke-direct {p0}, Ll/ۤۚۜ;->ۘ()V

    goto :goto_0

    .line 124
    :cond_0
    invoke-direct {p0}, Ll/ۤۚۜ;->ۖ()V

    .line 125
    monitor-exit v0

    return v3

    .line 128
    :cond_1
    sget-object v1, Ll/ۛۚۜ;->ۗ:Ll/ۛۚۜ;

    iput-object v1, p0, Ll/ۤۚۜ;->᩹:Ll/ۛۚۜ;

    .line 129
    iget-object v1, p0, Ll/ۤۚۜ;->᩸:Ll/۫ۚۜ;

    invoke-static {v1}, Ll/۫ۚۜ;->ᩳ(Ll/۫ۚۜ;)I

    move-result v2

    add-int/2addr v2, v3

    invoke-static {v1, v2}, Ll/۫ۚۜ;->ۧ(Ll/۫ۚۜ;I)V

    .line 130
    iget-object v1, p0, Ll/ۤۚۜ;->᩶:Ll/ۨۚۜ;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 131
    :goto_1
    iget-object v1, p0, Ll/ۤۚۜ;->᩸:Ll/۫ۚۜ;

    invoke-static {v1}, Ll/۫ۚۜ;->ۧ(Ll/۫ۚۜ;)Ll/ۤۚۜ;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 132
    invoke-direct {p0}, Ll/ۤۚۜ;->ۘ()V

    goto :goto_1

    .line 134
    :cond_2
    invoke-direct {p0}, Ll/ۤۚۜ;->ۖ()V

    .line 135
    iget-object v1, p0, Ll/ۤۚۜ;->᩸:Ll/۫ۚۜ;

    invoke-static {v1}, Ll/۫ۚۜ;->ᩳ(Ll/۫ۚۜ;)I

    move-result v2

    sub-int/2addr v2, v3

    invoke-static {v1, v2}, Ll/۫ۚۜ;->ۧ(Ll/۫ۚۜ;I)V

    .line 136
    iget-object v1, p0, Ll/ۤۚۜ;->᩸:Ll/۫ۚۜ;

    invoke-static {v1}, Ll/۫ۚۜ;->ܽ(Ll/۫ۚۜ;)I

    move-result v2

    add-int/2addr v2, v3

    invoke-static {v1, v2}, Ll/۫ۚۜ;->֫(Ll/۫ۚۜ;I)V

    .line 137
    sget-object v1, Ll/ۛۚۜ;->᩹:Ll/ۛۚۜ;

    iput-object v1, p0, Ll/ۤۚۜ;->᩹:Ll/ۛۚۜ;

    const/4 v1, 0x0

    .line 138
    monitor-exit v0

    return v1

    .line 186
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected HLS playlist cache lease state: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ll/ۤۚۜ;->᩹:Ll/ۛۚۜ;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 139
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܽ()V
    .locals 3

    .line 99
    iget-object v0, p0, Ll/ۤۚۜ;->᩶:Ll/ۨۚۜ;

    monitor-enter v0

    .line 100
    :try_start_0
    iget-object v1, p0, Ll/ۤۚۜ;->᩹:Ll/ۛۚۜ;

    sget-object v2, Ll/ۛۚۜ;->᩹:Ll/ۛۚۜ;

    if-eq v1, v2, :cond_0

    .line 101
    monitor-exit v0

    return-void

    .line 103
    :cond_0
    iget-object v1, p0, Ll/ۤۚۜ;->᩸:Ll/۫ۚۜ;

    invoke-static {v1}, Ll/۫ۚۜ;->ܽ(Ll/۫ۚۜ;)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v1, v2}, Ll/۫ۚۜ;->֫(Ll/۫ۚۜ;I)V

    .line 104
    sget-object v1, Ll/ۛۚۜ;->ۙ:Ll/ۛۚۜ;

    iput-object v1, p0, Ll/ۤۚۜ;->᩹:Ll/ۛۚۜ;

    .line 105
    iget-object v1, p0, Ll/ۤۚۜ;->᩶:Ll/ۨۚۜ;

    iget-object v2, p0, Ll/ۤۚۜ;->᩸:Ll/۫ۚۜ;

    invoke-static {v1, v2}, Ll/ۨۚۜ;->֫(Ll/ۨۚۜ;Ll/۫ۚۜ;)V

    .line 106
    iget-object v1, p0, Ll/ۤۚۜ;->᩶:Ll/ۨۚۜ;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 107
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ᩳ()V
    .locals 3

    .line 144
    iget-object v0, p0, Ll/ۤۚۜ;->᩶:Ll/ۨۚۜ;

    monitor-enter v0

    .line 145
    :try_start_0
    iget-object v1, p0, Ll/ۤۚۜ;->᩹:Ll/ۛۚۜ;

    sget-object v2, Ll/ۛۚۜ;->᩶:Ll/ۛۚۜ;

    if-eq v1, v2, :cond_0

    .line 146
    monitor-exit v0

    return-void

    .line 148
    :cond_0
    iget-object v1, p0, Ll/ۤۚۜ;->᩸:Ll/۫ۚۜ;

    invoke-static {v1}, Ll/۫ۚۜ;->ۧ(Ll/۫ۚۜ;)Ll/ۤۚۜ;

    move-result-object v1

    if-ne v1, p0, :cond_1

    .line 149
    iget-object v1, p0, Ll/ۤۚۜ;->᩸:Ll/۫ۚۜ;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ll/۫ۚۜ;->֫(Ll/۫ۚۜ;Ll/ۤۚۜ;)V

    .line 151
    :cond_1
    sget-object v1, Ll/ۛۚۜ;->ۙ:Ll/ۛۚۜ;

    iput-object v1, p0, Ll/ۤۚۜ;->᩹:Ll/ۛۚۜ;

    .line 152
    iget-object v1, p0, Ll/ۤۚۜ;->᩶:Ll/ۨۚۜ;

    iget-object v2, p0, Ll/ۤۚۜ;->᩸:Ll/۫ۚۜ;

    invoke-static {v1, v2}, Ll/ۨۚۜ;->֫(Ll/ۨۚۜ;Ll/۫ۚۜ;)V

    .line 153
    iget-object v1, p0, Ll/ۤۚۜ;->᩶:Ll/ۨۚۜ;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 154
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ᩻()V
    .locals 2

    .line 159
    iget-object v0, p0, Ll/ۤۚۜ;->᩶:Ll/ۨۚۜ;

    monitor-enter v0

    .line 160
    :try_start_0
    invoke-direct {p0}, Ll/ۤۚۜ;->ۖ()V

    .line 161
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "Interrupted while loading HLS playlist"

    const/4 v1, 0x0

    .line 163
    invoke-static {v0, v1}, Ll/ۨۚۜ;->֫(Ljava/lang/String;Ljava/lang/InterruptedException;)Ljava/io/InterruptedIOException;

    move-result-object v0

    throw v0

    :catchall_0
    move-exception v1

    .line 161
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
