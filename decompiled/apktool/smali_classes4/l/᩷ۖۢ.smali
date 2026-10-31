.class public final Ll/᩷ۖۢ;
.super Ljava/lang/Object;
.source "F764"


# static fields
.field public static ֫:Ll/ۜۖۢ;

.field public static volatile ۧ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 11
    new-instance v0, Ll/۟ۤ᩻;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/᩷ۖۢ;->֫:Ll/ۜۖۢ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫()V
    .locals 4

    .line 32
    sget-boolean v0, Ll/᩷ۖۢ;->ۧ:Z

    if-eqz v0, :cond_0

    return-void

    .line 35
    :cond_0
    const-class v0, Ll/᩷ۖۢ;

    monitor-enter v0

    .line 36
    :try_start_0
    sget-boolean v1, Ll/᩷ۖۢ;->ۧ:Z

    if-eqz v1, :cond_1

    .line 37
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 40
    :cond_1
    :try_start_1
    sget-object v1, Ll/᩷ۖۢ;->֫:Ll/ۜۖۢ;

    invoke-interface {v1}, Ll/ۜۖۢ;->֫()V

    .line 41
    invoke-static {}, Lbin/mt/radare2/Radare2Native;->nativeVersion()Ljava/lang/String;
    :try_end_1
    .catch Ll/ۢۖۢ; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/LinkageError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x1

    .line 47
    :try_start_2
    sput-boolean v1, Ll/᩷ۖۢ;->ۧ:Z

    .line 48
    monitor-exit v0

    return-void

    :catch_0
    move-exception v1

    .line 45
    new-instance v2, Ll/ۢۖۢ;

    const-string v3, "Failed to load libmt-radare2.so"

    .line 19
    invoke-direct {v2, v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    throw v2

    :catch_1
    move-exception v1

    .line 43
    throw v1

    :catchall_0
    move-exception v1

    .line 48
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public static ֫(Ll/ܺۡ᩷;)V
    .locals 2

    .line 21
    const-class v0, Ll/᩷ۖۢ;

    monitor-enter v0

    .line 22
    :try_start_0
    sget-boolean v1, Ll/᩷ۖۢ;->ۧ:Z

    if-nez v1, :cond_0

    .line 23
    sput-object p0, Ll/᩷ۖۢ;->֫:Ll/ۜۖۢ;

    .line 25
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
