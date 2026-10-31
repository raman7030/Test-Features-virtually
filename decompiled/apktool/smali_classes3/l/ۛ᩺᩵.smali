.class public final Ll/ۛ᩺᩵;
.super Ljava/lang/Object;
.source "V4E2"

# interfaces
.implements Ll/۬۟᩵;


# instance fields
.field public ֫:Ll/ۚᩳ֡;

.field public ۧ:Ll/ۚᩳ֡;

.field public ܽ:Z

.field public final synthetic ܿ:Ll/۟᩺᩵;

.field public final ᩳ:Ll/ܰ۟᩵;


# direct methods
.method public constructor <init>(Ll/۟᩺᩵;Ll/ܰ۟᩵;)V
    .locals 1

    .line 440
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛ᩺᩵;->ܿ:Ll/۟᩺᩵;

    .line 441
    iput-object p2, p0, Ll/ۛ᩺᩵;->ᩳ:Ll/ܰ۟᩵;

    const/4 p1, 0x1

    .line 442
    invoke-virtual {p2, p1}, Ll/ܰ۟᩵;->֫(I)Ll/ۚᩳ֡;

    move-result-object p1

    iput-object p1, p0, Ll/ۛ᩺᩵;->ۧ:Ll/ۚᩳ֡;

    .line 443
    new-instance v0, Ll/ۤ᩺᩵;

    invoke-direct {v0, p0, p1, p2}, Ll/ۤ᩺᩵;-><init>(Ll/ۛ᩺᩵;Ll/ۚᩳ֡;Ll/ܰ۟᩵;)V

    iput-object v0, p0, Ll/ۛ᩺᩵;->֫:Ll/ۚᩳ֡;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 459
    iget-object v0, p0, Ll/ۛ᩺᩵;->ܿ:Ll/۟᩺᩵;

    monitor-enter v0

    .line 460
    :try_start_0
    iget-boolean v1, p0, Ll/ۛ᩺᩵;->ܽ:Z

    if-eqz v1, :cond_0

    .line 461
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 463
    iput-boolean v1, p0, Ll/ۛ᩺᩵;->ܽ:Z

    .line 464
    iget-object v1, p0, Ll/ۛ᩺᩵;->ܿ:Ll/۟᩺᩵;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 466
    iget-object v0, p0, Ll/ۛ᩺᩵;->ۧ:Ll/ۚᩳ֡;

    invoke-static {v0}, Ll/᩶۟᩵;->֫(Ljava/io/Closeable;)V

    .line 468
    :try_start_1
    iget-object v0, p0, Ll/ۛ᩺᩵;->ᩳ:Ll/ܰ۟᩵;

    invoke-virtual {v0}, Ll/ܰ۟᩵;->֫()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception v1

    .line 465
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final ۧ()Ll/ۚᩳ֡;
    .locals 1

    .line 474
    iget-object v0, p0, Ll/ۛ᩺᩵;->֫:Ll/ۚᩳ֡;

    return-object v0
.end method
