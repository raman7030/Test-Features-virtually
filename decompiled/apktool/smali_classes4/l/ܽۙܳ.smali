.class public final Ll/ܽۙܳ;
.super Ljava/lang/Object;
.source "X5LN"


# instance fields
.field public ֫:Z

.field public ۧ:I

.field public ܽ:Ljava/util/ArrayList;

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 856
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 851
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܽۙܳ;->ܽ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 852
    iput v0, p0, Ll/ܽۙܳ;->ۧ:I

    const/4 v0, 0x1

    .line 854
    iput-boolean v0, p0, Ll/ܽۙܳ;->֫:Z

    .line 857
    iput-object p1, p0, Ll/ܽۙܳ;->ܿ:Ljava/lang/String;

    .line 858
    iput-object p2, p0, Ll/ܽۙܳ;->ᩳ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    .line 876
    :try_start_0
    iput-boolean v1, p0, Ll/ܽۙܳ;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 877
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫(Ll/۫ۙܳ;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 865
    :try_start_0
    iget-boolean v1, p0, Ll/ܽۙܳ;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 866
    monitor-exit v0

    return-void

    .line 868
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/ܽۙܳ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 869
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
