.class public final Ll/ᩳܿ۠;
.super Ljava/lang/Thread;
.source "F43P"


# instance fields
.field public final synthetic ᩸:Ll/ۨܿ۠;


# direct methods
.method public constructor <init>(Ll/ۨܿ۠;Ljava/lang/String;)V
    .locals 0

    .line 146
    iput-object p1, p0, Ll/ᩳܿ۠;->᩸:Ll/ۨܿ۠;

    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 150
    :try_start_0
    iget-object v0, p0, Ll/ᩳܿ۠;->᩸:Ll/ۨܿ۠;

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 151
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 152
    :goto_0
    iget-object v3, p0, Ll/ᩳܿ۠;->᩸:Ll/ۨܿ۠;

    invoke-static {v3}, Ll/᩷ܿ۠;->֫(Ll/ۨܿ۠;)J

    move-result-wide v3

    iget-object v5, p0, Ll/ᩳܿ۠;->᩸:Ll/ۨܿ۠;

    iget-wide v6, v5, Ll/᩷ܿ۠;->۬:J

    add-long/2addr v3, v6

    cmp-long v6, v1, v3

    if-gez v6, :cond_0

    .line 153
    invoke-static {v5}, Ll/᩷ܿ۠;->֫(Ll/ۨܿ۠;)J

    move-result-wide v3

    iget-object v6, p0, Ll/ᩳܿ۠;->᩸:Ll/ۨܿ۠;

    iget-wide v6, v6, Ll/᩷ܿ۠;->۬:J

    add-long/2addr v3, v6

    sub-long/2addr v3, v1

    invoke-virtual {v5, v3, v4}, Ljava/lang/Object;->wait(J)V

    .line 154
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x0

    .line 156
    iput-wide v1, v5, Ll/᩷ܿ۠;->۬:J

    .line 157
    invoke-virtual {v5}, Ll/ۨܿ۠;->close()V

    .line 158
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    return-void
.end method
