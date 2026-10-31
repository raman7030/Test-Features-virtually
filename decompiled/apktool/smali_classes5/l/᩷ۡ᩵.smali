.class public abstract Ll/᩷ۡ᩵;
.super Ll/֫ۡ᩵;
.source "T9Y2"


# static fields
.field public static ۗ:Ll/֫᩻֨;

.field public static ۙ:I


# instance fields
.field public final ᩶:I

.field public ᩹:Ll/۟ۢ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 26
    const-class v0, Ll/᩷ۡ᩵;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/String;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/᩷ۡ᩵;->ۗ:Ll/֫᩻֨;

    .line 33
    sget v0, Ll/۬ۢ᩵;->ۧ:I

    sput v0, Ll/᩷ۡ᩵;->ۙ:I

    return-void
.end method

.method public constructor <init>(Ll/ۡۢ᩵;I)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Ll/֫ۡ᩵;-><init>(Ll/ۡۢ᩵;)V

    const/4 p1, 0x0

    .line 38
    iput-object p1, p0, Ll/᩷ۡ᩵;->᩹:Ll/۟ۢ᩵;

    .line 61
    iput p2, p0, Ll/᩷ۡ᩵;->᩶:I

    return-void
.end method

.method public static ۡ()I
    .locals 1

    .line 43
    sget v0, Ll/᩷ۡ᩵;->ۙ:I

    return v0
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 102
    invoke-virtual {p0}, Ll/᩷ۡ᩵;->ܿ()Ll/ܳ᩷᩵;

    move-result-object v1

    .line 104
    :try_start_0
    invoke-virtual {p0}, Ll/᩷ۡ᩵;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 105
    invoke-virtual {p0}, Ljava/util/TimerTask;->cancel()Z

    return-void

    .line 108
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 110
    invoke-virtual {p0}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 111
    :try_start_1
    invoke-virtual {p0}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v3

    .line 177
    iget-object v4, p0, Ll/᩷ۡ᩵;->᩹:Ll/۟ۢ᩵;

    .line 111
    invoke-virtual {v3, p0, v4}, Ll/ۡۢ᩵;->ۧ(Ll/᩷ۡ᩵;Ll/۟ۢ᩵;)Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x3

    if-eqz v3, :cond_1

    .line 112
    sget-object v3, Ll/᩷ۡ᩵;->ۗ:Ll/֫᩻֨;

    const-string v8, "{}.run() JmDNS {} {}"

    invoke-virtual {p0}, Ll/֫ۡ᩵;->ۧ()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0}, Ll/᩷ۡ᩵;->᩻()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p0}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v11

    invoke-virtual {v11}, Ll/ۡۢ᩵;->getName()Ljava/lang/String;

    move-result-object v11

    new-array v12, v7, [Ljava/lang/Object;

    aput-object v9, v12, v6

    aput-object v10, v12, v5

    aput-object v11, v12, v4

    invoke-interface {v3, v8, v12}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    invoke-virtual {p0}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    invoke-virtual {p0, v1}, Ll/᩷ۡ᩵;->֫(Ll/ܳ᩷᩵;)Ll/ܳ᩷᩵;

    move-result-object v1

    .line 116
    :cond_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 118
    :try_start_2
    invoke-virtual {p0}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡۢ᩵;->۬()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    check-cast v0, Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤۜ᩵;

    .line 119
    move-object v8, v0

    check-cast v8, Ll/᩶ۢ᩵;

    move-object v0, v8

    .line 121
    monitor-enter v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 177
    :try_start_3
    iget-object v9, p0, Ll/᩷ۡ᩵;->᩹:Ll/۟ۢ᩵;

    .line 122
    invoke-virtual {v8, p0, v9}, Ll/᩶ۢ᩵;->ۧ(Ll/᩷ۡ᩵;Ll/۟ۢ᩵;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 123
    sget-object v9, Ll/᩷ۡ᩵;->ۗ:Ll/֫᩻֨;

    const-string v10, "{}.run() JmDNS {} {}"

    invoke-virtual {p0}, Ll/֫ۡ᩵;->ۧ()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {p0}, Ll/᩷ۡ᩵;->᩻()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8}, Ll/᩶ۢ᩵;->ۘ()Ljava/lang/String;

    move-result-object v13

    new-array v14, v7, [Ljava/lang/Object;

    aput-object v11, v14, v6

    aput-object v12, v14, v5

    aput-object v13, v14, v4

    invoke-interface {v9, v10, v14}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    invoke-virtual {p0, v8, v1}, Ll/᩷ۡ᩵;->֫(Ll/᩶ۢ᩵;Ll/ܳ᩷᩵;)Ll/ܳ᩷᩵;

    move-result-object v1

    .line 127
    :cond_2
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v1

    .line 129
    :cond_3
    invoke-virtual {v1}, Ll/ᩳ᩷᩵;->ۜ()Z

    move-result v0

    if-nez v0, :cond_4

    .line 130
    sget-object v0, Ll/᩷ۡ᩵;->ۗ:Ll/֫᩻֨;

    const-string v3, "{}.run() JmDNS {} #{}"

    invoke-virtual {p0}, Ll/֫ۡ᩵;->ۧ()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0}, Ll/᩷ۡ᩵;->᩻()Ljava/lang/String;

    move-result-object v9

    .line 177
    iget-object v10, p0, Ll/᩷ۡ᩵;->᩹:Ll/۟ۢ᩵;

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v8, v7, v6

    aput-object v9, v7, v5

    aput-object v10, v7, v4

    .line 130
    invoke-interface {v0, v3, v7}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    invoke-virtual {p0}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/ۡۢ᩵;->֫(Ll/ܳ᩷᩵;)V

    .line 134
    invoke-virtual {p0, v2}, Ll/᩷ۡ᩵;->֫(Ljava/util/ArrayList;)V

    goto :goto_1

    .line 137
    :cond_4
    invoke-virtual {p0, v2}, Ll/᩷ۡ᩵;->֫(Ljava/util/ArrayList;)V

    .line 140
    invoke-virtual {p0}, Ljava/util/TimerTask;->cancel()Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    return-void

    :catchall_1
    move-exception v1

    .line 116
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    .line 144
    sget-object v1, Ll/᩷ۡ᩵;->ۗ:Ll/֫᩻֨;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/֫ۡ᩵;->ۧ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".run() exception "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 145
    invoke-virtual {p0}, Ll/᩷ۡ᩵;->᩷()V

    .line 148
    :goto_1
    invoke-virtual {p0}, Ll/᩷ۡ᩵;->ܽ()V

    return-void
.end method

.method public abstract ֫(Ll/ܳ᩷᩵;)Ll/ܳ᩷᩵;
.end method

.method public abstract ֫(Ll/᩶ۢ᩵;Ll/ܳ᩷᩵;)Ll/ܳ᩷᩵;
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 2

    .line 161
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/ۗ᩷᩵;

    move-object v0, v1

    .line 162
    monitor-enter v0

    .line 163
    :try_start_0
    invoke-interface {v1, p0}, Ll/ۗ᩷᩵;->֫(Ll/֫ۡ᩵;)V

    .line 164
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    return-void
.end method

.method public final ֫(Ll/۟ۢ᩵;)V
    .locals 2

    .line 77
    invoke-virtual {p0}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    monitor-enter v0

    .line 78
    :try_start_0
    invoke-virtual {p0}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v1

    invoke-virtual {v1, p0, p1}, Ll/ۡۢ᩵;->֫(Ll/᩷ۡ᩵;Ll/۟ۢ᩵;)V

    .line 79
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    invoke-virtual {p0}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡۢ᩵;->۬()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    check-cast v0, Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤۜ᩵;

    .line 81
    check-cast v1, Ll/᩶ۢ᩵;

    invoke-virtual {v1, p0, p1}, Ll/᩶ۢ᩵;->֫(Ll/᩷ۡ᩵;Ll/۟ۢ᩵;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 79
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۜ()Ll/۟ۢ᩵;
    .locals 1

    .line 177
    iget-object v0, p0, Ll/᩷ۡ᩵;->᩹:Ll/۟ۢ᩵;

    return-object v0
.end method

.method public final ۢ()V
    .locals 2

    .line 90
    invoke-virtual {p0}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    monitor-enter v0

    .line 91
    :try_start_0
    invoke-virtual {p0}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v1

    invoke-virtual {v1, p0}, Ll/ۡۢ᩵;->֫(Ll/᩷ۡ᩵;)V

    .line 92
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    invoke-virtual {p0}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡۢ᩵;->۬()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    check-cast v0, Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤۜ᩵;

    .line 96
    check-cast v1, Ll/᩶ۢ᩵;

    invoke-virtual {v1, p0}, Ll/᩶ۢ᩵;->֫(Ll/᩷ۡ᩵;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    .line 92
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ۧ(Ll/۟ۢ᩵;)V
    .locals 0

    .line 184
    iput-object p1, p0, Ll/᩷ۡ᩵;->᩹:Ll/۟ۢ᩵;

    return-void
.end method

.method public final ܳ()I
    .locals 1

    .line 68
    iget v0, p0, Ll/᩷ۡ᩵;->᩶:I

    return v0
.end method

.method public abstract ܽ()V
.end method

.method public abstract ܿ()Ll/ܳ᩷᩵;
.end method

.method public abstract ᩳ()Z
.end method

.method public abstract ᩷()V
.end method

.method public abstract ᩻()Ljava/lang/String;
.end method
