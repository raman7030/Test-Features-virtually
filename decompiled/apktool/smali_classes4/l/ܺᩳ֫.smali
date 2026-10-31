.class public final Ll/ܺᩳ֫;
.super Ll/ܳᩳ֫;
.source "EB24"


# instance fields
.field public final synthetic ֫:Ljava/util/concurrent/ThreadPoolExecutor;

.field public final synthetic ۧ:Ll/ܳᩳ֫;


# direct methods
.method public constructor <init>(Ll/ܳᩳ֫;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    .line 1315
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 180
    iput-object p1, p0, Ll/ܺᩳ֫;->ۧ:Ll/ܳᩳ֫;

    iput-object p2, p0, Ll/ܺᩳ֫;->֫:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Throwable;)V
    .locals 2

    .line 195
    iget-object v0, p0, Ll/ܺᩳ֫;->֫:Ljava/util/concurrent/ThreadPoolExecutor;

    :try_start_0
    iget-object v1, p0, Ll/ܺᩳ֫;->ۧ:Ll/ܳᩳ֫;

    invoke-virtual {v1, p1}, Ll/ܳᩳ֫;->֫(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 197
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 198
    throw p1
.end method

.method public final ֫(Ll/᩺ᩳ֫;)V
    .locals 2

    .line 185
    iget-object v0, p0, Ll/ܺᩳ֫;->֫:Ljava/util/concurrent/ThreadPoolExecutor;

    :try_start_0
    iget-object v1, p0, Ll/ܺᩳ֫;->ۧ:Ll/ܳᩳ֫;

    invoke-virtual {v1, p1}, Ll/ܳᩳ֫;->֫(Ll/᩺ᩳ֫;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 187
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 188
    throw p1
.end method
