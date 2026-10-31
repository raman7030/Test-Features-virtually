.class public final Ll/ܽ᩵֫;
.super Ljava/lang/Object;
.source "R8MQ"


# static fields
.field public static final ֫:Ljava/util/HashSet;

.field public static ۧ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 58
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Ll/ܽ᩵֫;->֫:Ljava/util/HashSet;

    const-string v0, "media3.common"

    .line 59
    sput-object v0, Ll/ܽ᩵֫;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public static declared-synchronized ֫()Ljava/lang/String;
    .locals 2

    .line 2
    const-class v0, Ll/ܽ᩵֫;

    .line 3
    monitor-enter v0

    .line 65
    :try_start_0
    sget-object v1, Ll/ܽ᩵֫;->ۧ:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static declared-synchronized ֫(Ljava/lang/String;)V
    .locals 3

    .line 2
    const-class v0, Ll/ܽ᩵֫;

    .line 3
    monitor-enter v0

    .line 74
    :try_start_0
    sget-object v1, Ll/ܽ᩵֫;->֫:Ljava/util/HashSet;

    invoke-virtual {v1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 75
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Ll/ܽ᩵֫;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sput-object p0, Ll/ܽ᩵֫;->ۧ:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method
