.class public final Ll/ۡ᩵֡;
.super Ljava/lang/Object;
.source "Z6LO"


# instance fields
.field public final ֫:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    packed-switch p1, :pswitch_data_0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ۡ᩵֡;->֫:Ljava/lang/Object;

    return-void

    .line 28
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Ll/ۡ᩵֡;->֫:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public ֫(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 30
    iget-object v0, p0, Ll/ۡ᩵֡;->֫:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    const-class v1, Ll/ۘۚ֡;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽۚ֡;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 25
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܽۚ֡;->֫(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized ֫(Ll/ۚ۟᩵;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 38
    :try_start_0
    iget-object v1, p0, Ll/ۡ᩵֡;->֫:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashSet;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public ֫(Ll/ܽۚ֡;)V
    .locals 2

    .line 12
    invoke-virtual {p1}, Ll/ܽۚ֡;->֫()Ljava/lang/Class;

    move-result-object v0

    .line 30
    iget-object v1, p0, Ll/ۡ᩵֡;->֫:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽۚ֡;

    if-nez v0, :cond_0

    .line 14
    invoke-virtual {p1}, Ll/ܽۚ֡;->֫()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 16
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܽۚ֡;->֫(Ll/ܽۚ֡;)V

    return-void
.end method

.method public declared-synchronized ۧ(Ll/ۚ۟᩵;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 33
    :try_start_0
    iget-object v1, p0, Ll/ۡ᩵֡;->֫:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashSet;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized ܽ(Ll/ۚ۟᩵;)Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 43
    :try_start_0
    iget-object v1, p0, Ll/ۡ᩵֡;->֫:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashSet;

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
