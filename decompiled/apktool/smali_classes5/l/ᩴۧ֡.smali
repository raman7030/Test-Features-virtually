.class public final Ll/ᩴۧ֡;
.super Ll/ܶ۟᩵;
.source "I4F9"


# instance fields
.field public final synthetic ᩹:Ll/᩹ۧ֡;


# direct methods
.method public constructor <init>(Ll/᩹ۧ֡;)V
    .locals 2

    .line 392
    iput-object p1, p0, Ll/ᩴۧ֡;->᩹:Ll/᩹ۧ֡;

    .line 393
    iget-object p1, p1, Ll/᩹ۧ֡;->ۤ:Ljava/lang/String;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "OkHttp %s ping"

    invoke-direct {p0, p1, v0}, Ll/ܶ۟᩵;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 8

    .line 398
    iget-object v0, p0, Ll/ᩴۧ֡;->᩹:Ll/᩹ۧ֡;

    monitor-enter v0

    .line 399
    :try_start_0
    iget-object v1, p0, Ll/ᩴۧ֡;->᩹:Ll/᩹ۧ֡;

    invoke-static {v1}, Ll/᩹ۧ֡;->ۧ(Ll/᩹ۧ֡;)J

    move-result-wide v1

    iget-object v3, p0, Ll/ᩴۧ֡;->᩹:Ll/᩹ۧ֡;

    invoke-static {v3}, Ll/᩹ۧ֡;->ᩳ(Ll/᩹ۧ֡;)J

    move-result-wide v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    cmp-long v7, v1, v3

    if-gez v7, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    .line 402
    :cond_0
    iget-object v1, p0, Ll/ᩴۧ֡;->᩹:Ll/᩹ۧ֡;

    invoke-static {v1}, Ll/᩹ۧ֡;->ܿ(Ll/᩹ۧ֡;)V

    const/4 v1, 0x0

    .line 405
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 407
    iget-object v0, p0, Ll/ᩴۧ֡;->᩹:Ll/᩹ۧ֡;

    .line 526
    :try_start_1
    sget-object v1, Ll/ܰ֫֡;->ܰ:Ll/ܰ֫֡;

    invoke-virtual {v0, v1, v1}, Ll/᩹ۧ֡;->֫(Ll/ܰ֫֡;Ll/ܰ֫֡;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    .line 409
    :cond_1
    iget-object v0, p0, Ll/ᩴۧ֡;->᩹:Ll/᩹ۧ֡;

    invoke-virtual {v0, v5, v6, v6}, Ll/᩹ۧ֡;->֫(IIZ)V

    return-void

    :catchall_0
    move-exception v1

    .line 405
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method
