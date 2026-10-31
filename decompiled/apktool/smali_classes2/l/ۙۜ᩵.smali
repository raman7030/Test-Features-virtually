.class public final Ll/ۙۜ᩵;
.super Ljava/lang/Object;
.source "S9Y7"


# static fields
.field public static final ֫:Ljava/util/concurrent/atomic/AtomicReference;

.field public static volatile ۧ:Ll/ۗۜ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 74
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Ll/ۙۜ᩵;->֫:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫()Ll/ۗۜ᩵;
    .locals 2

    .line 122
    sget-object v0, Ll/ۙۜ᩵;->ۧ:Ll/ۗۜ᩵;

    if-nez v0, :cond_3

    .line 123
    const-class v0, Ll/ۙۜ᩵;

    monitor-enter v0

    .line 124
    :try_start_0
    sget-object v1, Ll/ۙۜ᩵;->ۧ:Ll/ۗۜ᩵;

    if-nez v1, :cond_2

    .line 109
    sget-object v1, Ll/ۙۜ᩵;->֫:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶ۜ᩵;

    if-eqz v1, :cond_0

    .line 111
    invoke-interface {v1}, Ll/᩶ۜ᩵;->֫()Ll/ۗۜ᩵;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    .line 113
    :cond_1
    new-instance v1, Ll/۠ۢ᩵;

    invoke-direct {v1}, Ll/۠ۢ᩵;-><init>()V

    .line 125
    :goto_1
    sput-object v1, Ll/ۙۜ᩵;->ۧ:Ll/ۗۜ᩵;

    .line 127
    :cond_2
    monitor-exit v0

    goto :goto_2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 129
    :cond_3
    :goto_2
    sget-object v0, Ll/ۙۜ᩵;->ۧ:Ll/ۗۜ᩵;

    return-object v0
.end method
