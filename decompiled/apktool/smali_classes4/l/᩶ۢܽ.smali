.class public final Ll/᩶ۢܽ;
.super Ljava/lang/Object;
.source "T5RH"


# instance fields
.field public ֫:Ll/ܺܺܽ;

.field public ۧ:Z


# direct methods
.method public constructor <init>(Ll/ܺܺܽ;)V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 43
    iput-boolean v0, p0, Ll/᩶ۢܽ;->ۧ:Z

    .line 46
    iput-object p1, p0, Ll/᩶ۢܽ;->֫:Ll/ܺܺܽ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    move-object v0, p0

    .line 50
    monitor-enter v0

    const/4 v1, 0x0

    .line 51
    :try_start_0
    iput-object v1, p0, Ll/᩶ۢܽ;->֫:Ll/ܺܺܽ;

    .line 52
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    move-object v0, p0

    .line 68
    monitor-enter v0

    .line 69
    :try_start_0
    iget-object v1, p0, Ll/᩶ۢܽ;->֫:Ll/ܺܺܽ;

    if-eqz v1, :cond_0

    .line 70
    new-instance v1, Ll/ۨ᩷ܽ;

    invoke-direct {v1}, Ll/ۨ᩷ܽ;-><init>()V

    .line 71
    invoke-virtual {v1, p1}, Ll/ۨ᩷ܽ;->֫(Ljava/lang/String;)V

    .line 72
    iget-object p1, p0, Ll/᩶ۢܽ;->֫:Ll/ܺܺܽ;

    invoke-virtual {p1, v1}, Ll/ܺܺܽ;->֫(Ll/ۨ᩷ܽ;)V

    const/4 p1, 0x0

    .line 73
    iput-boolean p1, p0, Ll/᩶ۢܽ;->ۧ:Z

    const/4 p1, 0x0

    .line 74
    iput-object p1, p0, Ll/᩶ۢܽ;->֫:Ll/ܺܺܽ;

    .line 76
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
