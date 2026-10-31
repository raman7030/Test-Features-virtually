.class public final Ll/ۛ᩷᩵;
.super Ljava/lang/Object;
.source "XA2E"


# static fields
.field public static final ۧ:Ljava/util/concurrent/atomic/AtomicReference;

.field public static volatile ܽ:Ll/ۛ᩷᩵;


# instance fields
.field public final ֫:Ll/ۧۤᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 58
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Ll/ۛ᩷᩵;->ۧ:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    new-instance v0, Ll/ۧۤᩴ;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ll/ۧۤᩴ;-><init>(I)V

    iput-object v0, p0, Ll/ۛ᩷᩵;->֫:Ll/ۧۤᩴ;

    return-void
.end method

.method public static ֫()Ll/ۛ᩷᩵;
    .locals 2

    .line 108
    sget-object v0, Ll/ۛ᩷᩵;->ܽ:Ll/ۛ᩷᩵;

    if-nez v0, :cond_1

    .line 109
    const-class v0, Ll/ۛ᩷᩵;

    monitor-enter v0

    .line 110
    :try_start_0
    sget-object v1, Ll/ۛ᩷᩵;->ܽ:Ll/ۛ᩷᩵;

    if-nez v1, :cond_0

    .line 111
    new-instance v1, Ll/ۛ᩷᩵;

    invoke-direct {v1}, Ll/ۛ᩷᩵;-><init>()V

    sput-object v1, Ll/ۛ᩷᩵;->ܽ:Ll/ۛ᩷᩵;

    .line 113
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 115
    :cond_1
    :goto_0
    sget-object v0, Ll/ۛ᩷᩵;->ܽ:Ll/ۛ᩷᩵;

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ۡۢ᩵;)V
    .locals 1

    .line 139
    iget-object v0, p0, Ll/ۛ᩷᩵;->֫:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ۧ(Ll/ۡۢ᩵;)Ll/ۨ᩷᩵;
    .locals 2

    .line 125
    iget-object v0, p0, Ll/ۛ᩷᩵;->֫:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ᩷᩵;

    if-nez v1, :cond_2

    .line 95
    sget-object v1, Ll/ۛ᩷᩵;->ۧ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤ᩷᩵;

    if-eqz v1, :cond_0

    .line 97
    invoke-interface {v1}, Ll/ۤ᩷᩵;->֫()Ll/ۨ᩷᩵;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    .line 99
    :cond_1
    new-instance v1, Ll/۫᩷᩵;

    invoke-direct {v1, p1}, Ll/۫᩷᩵;-><init>(Ll/ۡۢ᩵;)V

    .line 127
    :goto_1
    invoke-virtual {v0, p1, v1}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۨ᩷᩵;

    return-object p1

    :cond_2
    return-object v1
.end method
