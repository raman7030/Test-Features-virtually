.class public final Ll/ۙۙᩳ;
.super Ljava/lang/Object;
.source "K6UK"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final synthetic ۗ:Ll/ۤۙᩳ;

.field public ۙ:Ll/᩸۬ᩳ;

.field public final ᩶:Ll/᩸۬ᩳ;

.field public ᩸:Z

.field public final ᩹:Ll/ۡۗᩳ;


# direct methods
.method public constructor <init>(Ll/ۤۙᩳ;Ll/ۡۗᩳ;Ll/᩸۬ᩳ;)V
    .locals 0

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙۙᩳ;->ۗ:Ll/ۤۙᩳ;

    .line 170
    iput-object p2, p0, Ll/ۙۙᩳ;->᩹:Ll/ۡۗᩳ;

    .line 171
    iput-object p3, p0, Ll/ۙۙᩳ;->᩶:Ll/᩸۬ᩳ;

    .line 172
    iput-object p3, p0, Ll/ۙۙᩳ;->ۙ:Ll/᩸۬ᩳ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 188
    iget-object v0, p0, Ll/ۙۙᩳ;->ۙ:Ll/᩸۬ᩳ;

    const/4 v1, 0x0

    .line 189
    iput-object v1, p0, Ll/ۙۙᩳ;->ۙ:Ll/᩸۬ᩳ;

    if-eqz v0, :cond_0

    .line 190
    invoke-virtual {v0}, Ll/᩸۬ᩳ;->᩻()V

    :cond_0
    return-void
.end method

.method public final ֫()V
    .locals 3

    .line 176
    iget-object v0, p0, Ll/ۙۙᩳ;->ۗ:Ll/ۤۙᩳ;

    monitor-enter v0

    .line 177
    :try_start_0
    iget-boolean v1, p0, Ll/ۙۙᩳ;->᩸:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 178
    iput-boolean v1, p0, Ll/ۙۙᩳ;->᩸:Z

    .line 179
    iget-object v1, p0, Ll/ۙۙᩳ;->ۗ:Ll/ۤۙᩳ;

    invoke-static {v1}, Ll/ۤۙᩳ;->֫(Ll/ۤۙᩳ;)Ll/᩸۬ᩳ;

    move-result-object v1

    iput-object v1, p0, Ll/ۙۙᩳ;->ۙ:Ll/᩸۬ᩳ;

    .line 180
    iget-object v1, p0, Ll/ۙۙᩳ;->ۗ:Ll/ۤۙᩳ;

    iget-object v2, p0, Ll/ۙۙᩳ;->᩶:Ll/᩸۬ᩳ;

    invoke-static {v1, v2}, Ll/ۤۙᩳ;->֫(Ll/ۤۙᩳ;Ll/᩸۬ᩳ;)V

    .line 181
    iget-object v1, p0, Ll/ۙۙᩳ;->ۗ:Ll/ۤۙᩳ;

    iget-object v2, p0, Ll/ۙۙᩳ;->᩹:Ll/ۡۗᩳ;

    invoke-static {v1, v2}, Ll/ۤۙᩳ;->֫(Ll/ۤۙᩳ;Ll/ۡۗᩳ;)V

    .line 182
    iget-object v1, p0, Ll/ۙۙᩳ;->ۗ:Ll/ۤۙᩳ;

    invoke-static {v1}, Ll/ۤۙᩳ;->ۧ(Ll/ۤۙᩳ;)V

    .line 183
    iget-object v1, p0, Ll/ۙۙᩳ;->ۗ:Ll/ۤۙᩳ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    monitor-exit v0

    return-void

    .line 177
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Recovery generation already installed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 184
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
