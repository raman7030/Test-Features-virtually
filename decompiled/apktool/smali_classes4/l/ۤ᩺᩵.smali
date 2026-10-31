.class public final Ll/ۤ᩺᩵;
.super Ll/᩺ܽ֡;
.source "V4E2"


# instance fields
.field public final synthetic ᩶:Ll/ܰ۟᩵;

.field public final synthetic ᩹:Ll/ۛ᩺᩵;


# direct methods
.method public constructor <init>(Ll/ۛ᩺᩵;Ll/ۚᩳ֡;Ll/ܰ۟᩵;)V
    .locals 0

    .line 443
    iput-object p1, p0, Ll/ۤ᩺᩵;->᩹:Ll/ۛ᩺᩵;

    iput-object p3, p0, Ll/ۤ᩺᩵;->᩶:Ll/ܰ۟᩵;

    invoke-direct {p0, p2}, Ll/᩺ܽ֡;-><init>(Ll/ۚᩳ֡;)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 445
    iget-object v0, p0, Ll/ۤ᩺᩵;->᩹:Ll/ۛ᩺᩵;

    iget-object v0, v0, Ll/ۛ᩺᩵;->ܿ:Ll/۟᩺᩵;

    monitor-enter v0

    .line 446
    :try_start_0
    iget-object v1, p0, Ll/ۤ᩺᩵;->᩹:Ll/ۛ᩺᩵;

    iget-boolean v2, v1, Ll/ۛ᩺᩵;->ܽ:Z

    if-eqz v2, :cond_0

    .line 447
    monitor-exit v0

    return-void

    :cond_0
    const/4 v2, 0x1

    .line 449
    iput-boolean v2, v1, Ll/ۛ᩺᩵;->ܽ:Z

    .line 450
    iget-object v1, v1, Ll/ۛ᩺᩵;->ܿ:Ll/۟᩺᩵;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 452
    invoke-super {p0}, Ll/᩺ܽ֡;->close()V

    .line 453
    iget-object v0, p0, Ll/ۤ᩺᩵;->᩶:Ll/ܰ۟᩵;

    invoke-virtual {v0}, Ll/ܰ۟᩵;->ۧ()V

    return-void

    :catchall_0
    move-exception v1

    .line 451
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
