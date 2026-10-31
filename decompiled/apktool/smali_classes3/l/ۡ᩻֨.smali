.class public final Ll/ۡ᩻֨;
.super Ljava/lang/Object;
.source "J9W9"

# interfaces
.implements Ll/۟ܳ֨;


# instance fields
.field public ᩶:Z

.field public final ᩸:Ljava/util/concurrent/LinkedBlockingQueue;

.field public final ᩹:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 45
    iput-boolean v0, p0, Ll/ۡ᩻֨;->᩶:Z

    .line 47
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۡ᩻֨;->᩹:Ljava/util/HashMap;

    .line 49
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Ll/ۡ᩻֨;->᩸:Ljava/util/concurrent/LinkedBlockingQueue;

    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫(Ljava/lang/String;)Ll/֫᩻֨;
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 52
    :try_start_0
    iget-object v1, p0, Ll/ۡ᩻֨;->᩹:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢ᩻֨;

    if-nez v1, :cond_0

    .line 54
    new-instance v1, Ll/ۢ᩻֨;

    iget-object v2, p0, Ll/ۡ᩻֨;->᩸:Ljava/util/concurrent/LinkedBlockingQueue;

    iget-boolean v3, p0, Ll/ۡ᩻֨;->᩶:Z

    invoke-direct {v1, p1, v2, v3}, Ll/ۢ᩻֨;-><init>(Ljava/lang/String;Ljava/util/concurrent/LinkedBlockingQueue;Z)V

    .line 55
    iget-object v2, p0, Ll/ۡ᩻֨;->᩹:Ljava/util/HashMap;

    invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫()V
    .locals 1

    .line 77
    iget-object v0, p0, Ll/ۡ᩻֨;->᩹:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 78
    iget-object v0, p0, Ll/ۡ᩻֨;->᩸:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    return-void
.end method

.method public final ۧ()Ljava/util/concurrent/LinkedBlockingQueue;
    .locals 1

    .line 69
    iget-object v0, p0, Ll/ۡ᩻֨;->᩸:Ljava/util/concurrent/LinkedBlockingQueue;

    return-object v0
.end method

.method public final ܽ()Ljava/util/ArrayList;
    .locals 2

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ۡ᩻֨;->᩹:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final ᩳ()V
    .locals 1

    const/4 v0, 0x1

    .line 73
    iput-boolean v0, p0, Ll/ۡ᩻֨;->᩶:Z

    return-void
.end method
