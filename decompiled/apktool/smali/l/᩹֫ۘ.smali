.class public final Ll/᩹֫ۘ;
.super Ljava/lang/Object;
.source "M9DJ"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final ۗ:Ll/֫᩻֨;


# instance fields
.field public ۙ:Ll/ۚܽۘ;

.field public ᩶:Ll/ۧۤᩴ;

.field public ᩸:Ll/ܿܽۘ;

.field public ᩹:Ll/ۙ֫ۘ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 122
    const-class v0, Ll/᩹֫ۘ;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/᩹֫ۘ;->ۗ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 102
    invoke-static {}, Ll/ۙ֫ۘ;->۠()Ll/᩶֫ۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶֫ۘ;->֫()Ll/ۙ֫ۘ;

    move-result-object v0

    .line 52
    invoke-direct {p0, v0}, Ll/᩹֫ۘ;-><init>(Ll/ۙ֫ۘ;)V

    return-void
.end method

.method public constructor <init>(Ll/ۙ֫ۘ;)V
    .locals 2

    .line 56
    new-instance v0, Ll/ܿܽۘ;

    invoke-direct {v0}, Ll/ܿܽۘ;-><init>()V

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v1, Ll/ۧۤᩴ;

    invoke-direct {v1}, Ll/ۧۤᩴ;-><init>()V

    iput-object v1, p0, Ll/᩹֫ۘ;->᩶:Ll/ۧۤᩴ;

    .line 45
    new-instance v1, Ll/ۚܽۘ;

    invoke-direct {v1}, Ll/ۚܽۘ;-><init>()V

    iput-object v1, p0, Ll/᩹֫ۘ;->ۙ:Ll/ۚܽۘ;

    .line 60
    iput-object p1, p0, Ll/᩹֫ۘ;->᩹:Ll/ۙ֫ۘ;

    .line 61
    iput-object v0, p0, Ll/᩹֫ۘ;->᩸:Ll/ܿܽۘ;

    .line 62
    invoke-virtual {v0, p0}, Ll/ܿܽۘ;->֫(Ljava/lang/AutoCloseable;)V

    return-void
.end method

.method private ֫(Ll/ۧܽۘ;)V
    .locals 3
    .annotation runtime Lnet/engio/mbassy/listener/Handler;
    .end annotation

    move-object v0, p0

    .line 114
    monitor-enter v0

    .line 115
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/ۧܽۘ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/ۧܽۘ;->ۧ()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 116
    iget-object v2, p0, Ll/᩹֫ۘ;->᩶:Ll/ۧۤᩴ;

    invoke-virtual {v2, v1}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    iget-object v2, p0, Ll/᩹֫ۘ;->ۙ:Ll/ۚܽۘ;

    invoke-virtual {p1}, Ll/ۧܽۘ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ll/ۚܽۘ;->ۧ(Ljava/lang/String;)V

    .line 118
    sget-object p1, Ll/᩹֫ۘ;->ۗ:Ll/֫᩻֨;

    const-string v2, "Connection to << {} >> closed"

    invoke-interface {p1, v1, v2}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private ܽ(ILjava/lang/String;)Ll/᩻ۧۘ;
    .locals 6

    move-object v0, p0

    .line 89
    monitor-enter v0

    .line 90
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 91
    iget-object v2, p0, Ll/᩹֫ۘ;->᩶:Ll/ۧۤᩴ;

    invoke-virtual {v2, v1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻ۧۘ;

    if-eqz v2, :cond_0

    .line 93
    invoke-virtual {v2}, Ll/ܰ֫ۘ;->֫()Ll/ܰ֫ۘ;

    move-result-object v2

    check-cast v2, Ll/᩻ۧۘ;

    :cond_0
    if-eqz v2, :cond_2

    .line 95
    invoke-virtual {v2}, Ll/᩻ۧۘ;->᩵()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    .line 107
    :cond_1
    monitor-exit v0

    return-object v2

    .line 96
    :cond_2
    :goto_0
    new-instance v2, Ll/᩻ۧۘ;

    iget-object v3, p0, Ll/᩹֫ۘ;->᩹:Ll/ۙ֫ۘ;

    iget-object v4, p0, Ll/᩹֫ۘ;->᩸:Ll/ܿܽۘ;

    iget-object v5, p0, Ll/᩹֫ۘ;->ۙ:Ll/ۚܽۘ;

    invoke-direct {v2, v3, p0, v4, v5}, Ll/᩻ۧۘ;-><init>(Ll/ۙ֫ۘ;Ll/᩹֫ۘ;Ll/ܿܽۘ;Ll/ۚܽۘ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    :try_start_1
    invoke-virtual {v2, p1, p2}, Ll/᩻ۧۘ;->ۧ(ILjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 103
    :try_start_2
    iget-object p1, p0, Ll/᩹֫ۘ;->᩶:Ll/ۧۤᩴ;

    invoke-virtual {p1, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    monitor-exit v0

    return-object v2

    :catch_0
    move-exception p1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/AutoCloseable;

    const/4 v1, 0x0

    aput-object v2, p2, v1

    .line 100
    sget v2, Ll/ۙܰۖ;->֫:I

    .line 38
    aget-object p2, p2, v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p2, :cond_3

    .line 41
    :try_start_3
    check-cast p2, Ljava/lang/AutoCloseable;

    invoke-static {p2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/AutoCloseable;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 101
    :catch_1
    :cond_3
    :try_start_4
    throw p1

    :catchall_0
    move-exception p1

    .line 108
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 5

    const-string v0, "Going to close all remaining connections"

    .line 126
    sget-object v1, Ll/᩹֫ۘ;->ۗ:Ll/֫᩻֨;

    invoke-interface {v1, v0}, Ll/֫᩻֨;->ܽ(Ljava/lang/String;)V

    .line 127
    iget-object v0, p0, Ll/᩹֫ۘ;->᩶:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻ۧۘ;

    const/4 v3, 0x1

    .line 129
    :try_start_0
    invoke-virtual {v2, v3}, Ll/᩻ۧۘ;->֫(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v4, "Error closing connection to host {}"

    .line 131
    invoke-virtual {v2}, Ll/᩻ۧۘ;->ۘ()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v4}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "Exception was: "

    .line 132
    invoke-interface {v1, v2, v3}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/String;)Ll/᩻ۧۘ;
    .locals 1

    const/16 v0, 0x1bd

    .line 73
    invoke-direct {p0, v0, p1}, Ll/᩹֫ۘ;->ܽ(ILjava/lang/String;)Ll/᩻ۧۘ;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(ILjava/lang/String;)Ll/᩻ۧۘ;
    .locals 0

    .line 85
    invoke-direct {p0, p1, p2}, Ll/᩹֫ۘ;->ܽ(ILjava/lang/String;)Ll/᩻ۧۘ;

    move-result-object p1

    return-object p1
.end method
