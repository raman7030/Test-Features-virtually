.class public final Ll/ۧ֨֫;
.super Ljava/lang/Object;
.source "J8TX"


# static fields
.field public static ܳ:Ll/ۧ֨֫;


# instance fields
.field public final ֫:Ljava/util/concurrent/Executor;

.field public ۧ:Z

.field public final ܽ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public ܿ:I

.field public final ᩳ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    invoke-static {}, Ll/ۧ۠᩵;->֫()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Ll/ۧ֨֫;->֫:Ljava/util/concurrent/Executor;

    .line 99
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Ll/ۧ֨֫;->ܽ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 100
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Ll/ۧ֨֫;->ᩳ:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 101
    iput v1, p0, Ll/ۧ֨֫;->ܿ:I

    .line 102
    new-instance v1, Ll/۫ۚ֫;

    invoke-direct {v1, p1, p0}, Ll/۫ۚ֫;-><init>(Landroid/content/Context;Ll/ۧ֨֫;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۧ֨֫;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧ֨֫;->֫:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public static declared-synchronized ֫(Landroid/content/Context;)Ll/ۧ֨֫;
    .locals 2

    .line 2
    const-class v0, Ll/ۧ֨֫;

    .line 3
    monitor-enter v0

    .line 85
    :try_start_0
    sget-object v1, Ll/ۧ֨֫;->ܳ:Ll/ۧ֨֫;

    if-nez v1, :cond_0

    .line 86
    new-instance v1, Ll/ۧ֨֫;

    invoke-direct {v1, p0}, Ll/ۧ֨֫;-><init>(Landroid/content/Context;)V

    sput-object v1, Ll/ۧ֨֫;->ܳ:Ll/ۧ֨֫;

    .line 88
    :cond_0
    sget-object p0, Ll/ۧ֨֫;->ܳ:Ll/ۧ֨֫;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method private ֫(I)V
    .locals 4

    .line 154
    iget-object v0, p0, Ll/ۧ֨֫;->ܽ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۚ֫;

    .line 155
    invoke-virtual {v2}, Ll/ܰۚ֫;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 156
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 174
    :cond_1
    iget-object v0, p0, Ll/ۧ֨֫;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 175
    :try_start_0
    iget-boolean v1, p0, Ll/ۧ֨֫;->ۧ:Z

    if-eqz v1, :cond_2

    iget v1, p0, Ll/ۧ֨֫;->ܿ:I

    if-ne v1, p1, :cond_2

    .line 176
    monitor-exit v0

    return-void

    :cond_2
    const/4 v1, 0x1

    .line 178
    iput-boolean v1, p0, Ll/ۧ֨֫;->ۧ:Z

    .line 179
    iput p1, p0, Ll/ۧ֨֫;->ܿ:I

    .line 180
    iget-object p1, p0, Ll/ۧ֨֫;->ܽ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 181
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 183
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰۚ֫;

    invoke-virtual {v0}, Ll/ܰۚ֫;->֫()V

    goto :goto_1

    :cond_3
    return-void

    :catchall_0
    move-exception p1

    .line 181
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public static ֫(Landroid/content/Context;Ll/ۧ֨֫;)V
    .locals 8

    const-string v0, "connectivity"

    .line 192
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    const/4 v1, 0x5

    const/4 v2, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    .line 197
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v3, 0x1

    if-eqz v0, :cond_6

    .line 202
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    .line 205
    :cond_1
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v4

    const/16 v5, 0x9

    const/4 v6, 0x6

    const/4 v7, 0x4

    if-eqz v4, :cond_3

    if-eq v4, v3, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v1, :cond_3

    if-eq v4, v6, :cond_5

    if-eq v4, v5, :cond_2

    const/16 v2, 0x8

    goto :goto_1

    :cond_2
    const/4 v2, 0x7

    goto :goto_1

    .line 222
    :cond_3
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    const/4 v2, 0x6

    goto :goto_1

    .line 243
    :pswitch_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-lt v0, v3, :cond_7

    const/16 v2, 0x9

    goto :goto_1

    :cond_4
    :pswitch_2
    const/4 v2, 0x2

    goto :goto_1

    :cond_5
    :pswitch_3
    const/4 v2, 0x5

    goto :goto_1

    :pswitch_4
    const/4 v2, 0x4

    goto :goto_1

    :pswitch_5
    const/4 v2, 0x3

    goto :goto_1

    :cond_6
    :goto_0
    const/4 v2, 0x1

    goto :goto_1

    :catch_0
    nop

    .line 163
    :cond_7
    :goto_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1f

    if-lt v0, v3, :cond_8

    if-ne v2, v1, :cond_8

    .line 165
    invoke-static {p0, p1}, Ll/ۛۚ֫;->֫(Landroid/content/Context;Ll/ۧ֨֫;)V

    goto :goto_2

    .line 167
    :cond_8
    invoke-direct {p1, v2}, Ll/ۧ֨֫;->֫(I)V

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_0
        :pswitch_4
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static bridge synthetic ֫(Ll/ۧ֨֫;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۧ֨֫;->֫(I)V

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 141
    iget-object v0, p0, Ll/ۧ֨֫;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 142
    :try_start_0
    iget v1, p0, Ll/ۧ֨֫;->ܿ:I

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 143
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(Ll/ۤܿۧ;Ljava/util/concurrent/Executor;)V
    .locals 4

    .line 154
    iget-object v0, p0, Ll/ۧ֨֫;->ܽ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۚ֫;

    .line 155
    invoke-virtual {v2}, Ll/ܰۚ֫;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 156
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 127
    :cond_1
    new-instance v1, Ll/ܰۚ֫;

    invoke-direct {v1, p0, p1, p2}, Ll/ܰۚ֫;-><init>(Ll/ۧ֨֫;Ll/ۤܿۧ;Ljava/util/concurrent/Executor;)V

    .line 128
    iget-object p1, p0, Ll/ۧ֨֫;->ᩳ:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0

    .line 129
    :try_start_0
    iget-object p1, p0, Ll/ۧ֨֫;->ܽ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    iget-boolean p1, p0, Ll/ۧ֨֫;->ۧ:Z

    .line 131
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_2

    .line 135
    invoke-virtual {v1}, Ll/ܰۚ֫;->֫()V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    .line 131
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
