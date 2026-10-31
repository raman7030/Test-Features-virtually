.class public final Ll/ۙܰܺ;
.super Ljava/lang/Object;
.source "X95L"


# instance fields
.field public final ֫:Ljava/lang/Object;

.field public volatile ۧ:Ljava/util/logging/Logger;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۙܰܺ;->֫:Ljava/lang/Object;

    .line 30
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۙܰܺ;->ܽ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/logging/Logger;
    .locals 2

    .line 45
    iget-object v0, p0, Ll/ۙܰܺ;->ۧ:Ljava/util/logging/Logger;

    if-eqz v0, :cond_0

    return-object v0

    .line 49
    :cond_0
    iget-object v0, p0, Ll/ۙܰܺ;->֫:Ljava/lang/Object;

    monitor-enter v0

    .line 50
    :try_start_0
    iget-object v1, p0, Ll/ۙܰܺ;->ۧ:Ljava/util/logging/Logger;

    if-eqz v1, :cond_1

    .line 52
    monitor-exit v0

    return-object v1

    .line 54
    :cond_1
    iget-object v1, p0, Ll/ۙܰܺ;->ܽ:Ljava/lang/String;

    invoke-static {v1}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v1

    iput-object v1, p0, Ll/ۙܰܺ;->ۧ:Ljava/util/logging/Logger;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 55
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
