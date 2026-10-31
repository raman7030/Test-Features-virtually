.class public final Ll/ܶ۬ᩳ;
.super Ljava/lang/Object;
.source "06UY"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ᩸:Z

.field public final synthetic ᩹:Ll/᩸۬ᩳ;


# direct methods
.method public constructor <init>(Ll/᩸۬ᩳ;)V
    .locals 0

    .line 214
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶ۬ᩳ;->᩹:Ll/᩸۬ᩳ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 225
    iget-object v0, p0, Ll/ܶ۬ᩳ;->᩹:Ll/᩸۬ᩳ;

    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v0, v0, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 226
    :try_start_0
    iget-boolean v1, p0, Ll/ܶ۬ᩳ;->᩸:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 227
    iput-boolean v1, p0, Ll/ܶ۬ᩳ;->᩸:Z

    .line 228
    iget-object v2, p0, Ll/ܶ۬ᩳ;->᩹:Ll/᩸۬ᩳ;

    invoke-static {v2}, Ll/᩸۬ᩳ;->֫(Ll/᩸۬ᩳ;)I

    move-result v3

    sub-int/2addr v3, v1

    invoke-static {v2, v3}, Ll/᩸۬ᩳ;->֫(Ll/᩸۬ᩳ;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v3, :cond_3

    .line 229
    :try_start_1
    iget-object v1, p0, Ll/ܶ۬ᩳ;->᩹:Ll/᩸۬ᩳ;

    iget-object v1, v1, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    check-cast v1, Ll/ܺ۬ᩳ;

    invoke-virtual {v1}, Ll/ܺ۬ᩳ;->֫()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 231
    :try_start_2
    iget-object v1, p0, Ll/ܶ۬ᩳ;->᩹:Ll/᩸۬ᩳ;

    invoke-static {v1}, Ll/᩸۬ᩳ;->ۧ(Ll/᩸۬ᩳ;)Ll/ۚ۬ᩳ;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ܶ۬ᩳ;->᩹:Ll/᩸۬ᩳ;

    invoke-static {v1}, Ll/᩸۬ᩳ;->ۧ(Ll/᩸۬ᩳ;)Ll/ۚ۬ᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۚ۬ᩳ;->close()V

    .line 232
    :cond_1
    iget-object v1, p0, Ll/ܶ۬ᩳ;->᩹:Ll/᩸۬ᩳ;

    invoke-static {v1}, Ll/᩸۬ᩳ;->ܽ(Ll/᩸۬ᩳ;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 231
    iget-object v2, p0, Ll/ܶ۬ᩳ;->᩹:Ll/᩸۬ᩳ;

    invoke-static {v2}, Ll/᩸۬ᩳ;->ۧ(Ll/᩸۬ᩳ;)Ll/ۚ۬ᩳ;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/ܶ۬ᩳ;->᩹:Ll/᩸۬ᩳ;

    invoke-static {v2}, Ll/᩸۬ᩳ;->ۧ(Ll/᩸۬ᩳ;)Ll/ۚ۬ᩳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۚ۬ᩳ;->close()V

    .line 232
    :cond_2
    iget-object v2, p0, Ll/ܶ۬ᩳ;->᩹:Ll/᩸۬ᩳ;

    invoke-static {v2}, Ll/᩸۬ᩳ;->ܽ(Ll/᩸۬ᩳ;)V

    .line 233
    throw v1

    .line 235
    :cond_3
    iget-object v1, p0, Ll/ܶ۬ᩳ;->᩹:Ll/᩸۬ᩳ;

    iget-object v1, v1, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    check-cast v1, Ll/ܺ۬ᩳ;

    invoke-virtual {v1}, Ll/ܺ۬ᩳ;->flush()V

    .line 237
    :goto_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public final flush()V
    .locals 3

    .line 218
    iget-object v0, p0, Ll/ܶ۬ᩳ;->᩹:Ll/᩸۬ᩳ;

    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object v0, v0, Ll/֨۬ᩳ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 219
    :try_start_0
    iget-boolean v1, p0, Ll/ܶ۬ᩳ;->᩸:Z

    if-nez v1, :cond_0

    .line 220
    iget-object v1, p0, Ll/ܶ۬ᩳ;->᩹:Ll/᩸۬ᩳ;

    iget-object v1, v1, Ll/᩸۬ᩳ;->ۛ:Ll/ۤ۬ᩳ;

    check-cast v1, Ll/ܺ۬ᩳ;

    invoke-virtual {v1}, Ll/ܺ۬ᩳ;->flush()V

    .line 221
    monitor-exit v0

    return-void

    .line 219
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Recovery append batch is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 221
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
