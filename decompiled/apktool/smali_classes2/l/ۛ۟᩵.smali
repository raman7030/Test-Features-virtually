.class public final Ll/ۛ۟᩵;
.super Ljava/lang/Object;
.source "A4DP"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۧ֫֡;


# direct methods
.method public constructor <init>(Ll/ۧ֫֡;)V
    .locals 0

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛ۟᩵;->᩸:Ll/ۧ֫֡;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 171
    iget-object v0, p0, Ll/ۛ۟᩵;->᩸:Ll/ۧ֫֡;

    monitor-enter v0

    .line 172
    :try_start_0
    iget-object v1, p0, Ll/ۛ۟᩵;->᩸:Ll/ۧ֫֡;

    iget-boolean v2, v1, Ll/ۧ֫֡;->ۤ:Z

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    iget-boolean v4, v1, Ll/ۧ֫֡;->᩶:Z

    or-int/2addr v2, v4

    if-eqz v2, :cond_0

    .line 173
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 177
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Ll/ۧ֫֡;->ܳ()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 179
    :catch_0
    :try_start_2
    iget-object v1, p0, Ll/ۛ۟᩵;->᩸:Ll/ۧ֫֡;

    iput-boolean v3, v1, Ll/ۧ֫֡;->ܽ֫:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 183
    :goto_0
    :try_start_3
    iget-object v1, p0, Ll/ۛ۟᩵;->᩸:Ll/ۧ֫֡;

    invoke-virtual {v1}, Ll/ۧ֫֡;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 184
    iget-object v1, p0, Ll/ۛ۟᩵;->᩸:Ll/ۧ֫֡;

    invoke-virtual {v1}, Ll/ۧ֫֡;->ᩳ()V

    .line 185
    iget-object v1, p0, Ll/ۛ۟᩵;->᩸:Ll/ۧ֫֡;

    const/4 v2, 0x0

    iput v2, v1, Ll/ۧ֫֡;->ܿ֫:I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    .line 188
    :catch_1
    :try_start_4
    iget-object v1, p0, Ll/ۛ۟᩵;->᩸:Ll/ۧ֫֡;

    iput-boolean v3, v1, Ll/ۧ֫֡;->ۧ֫:Z

    .line 189
    invoke-static {}, Ll/᩻ᩳ֡;->֫()Ll/ۚᩳ֡;

    move-result-object v2

    invoke-static {v2}, Ll/᩻ᩳ֡;->֫(Ll/ۚᩳ֡;)Ll/ۤܽ֡;

    move-result-object v2

    iput-object v2, v1, Ll/ۧ֫֡;->ܰ:Ll/ۤܽ֡;

    .line 191
    :cond_1
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v1
.end method
