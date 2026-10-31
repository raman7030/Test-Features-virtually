.class public Ll/ۢۛ᩵;
.super Ljava/lang/Object;
.source "4AYL"


# static fields
.field public static final synthetic ֫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public volatile synthetic _cur:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 0
    const-class v0, Ljava/lang/Object;

    const-string v1, "_cur"

    const-class v2, Ll/ۢۛ᩵;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ۢۛ᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Ll/ܺۛ᩵;

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ܺۛ᩵;-><init>(IZ)V

    iput-object v0, p0, Ll/ۢۛ᩵;->_cur:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 310
    :goto_0
    iget-object v0, p0, Ll/ۢۛ᩵;->_cur:Ljava/lang/Object;

    check-cast v0, Ll/ܺۛ᩵;

    .line 41
    invoke-virtual {v0}, Ll/ܺۛ᩵;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 42
    :cond_0
    sget-object v1, Ll/ۢۛ᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0}, Ll/ܺۛ᩵;->ᩳ()Ll/ܺۛ᩵;

    move-result-object v2

    .line 0
    :cond_1
    invoke-virtual {v1, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v0, :cond_1

    goto :goto_0
.end method

.method public final ֫(Ljava/lang/Runnable;)Z
    .locals 4

    .line 312
    :goto_0
    iget-object v0, p0, Ll/ۢۛ᩵;->_cur:Ljava/lang/Object;

    check-cast v0, Ll/ܺۛ᩵;

    .line 48
    invoke-virtual {v0, p1}, Ll/ܺۛ᩵;->֫(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v2, :cond_1

    const/4 v0, 0x2

    if-eq v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 51
    :cond_1
    sget-object v1, Ll/ۢۛ᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0}, Ll/ܺۛ᩵;->ᩳ()Ll/ܺۛ᩵;

    move-result-object v3

    .line 0
    :cond_2
    invoke-virtual {v1, p0, v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v0, :cond_2

    goto :goto_0

    :cond_4
    return v2
.end method

.method public final ۧ()I
    .locals 1

    .line 37
    iget-object v0, p0, Ll/ۢۛ᩵;->_cur:Ljava/lang/Object;

    check-cast v0, Ll/ܺۛ᩵;

    invoke-virtual {v0}, Ll/ܺۛ᩵;->ۧ()I

    move-result v0

    return v0
.end method

.method public final ܽ()Ljava/lang/Object;
    .locals 4

    .line 314
    :goto_0
    iget-object v0, p0, Ll/ۢۛ᩵;->_cur:Ljava/lang/Object;

    check-cast v0, Ll/ܺۛ᩵;

    .line 59
    invoke-virtual {v0}, Ll/ܺۛ᩵;->ܿ()Ljava/lang/Object;

    move-result-object v1

    .line 60
    sget-object v2, Ll/ܺۛ᩵;->ܿ:Ll/ܶۛ᩵;

    if-eq v1, v2, :cond_0

    return-object v1

    .line 61
    :cond_0
    sget-object v1, Ll/ۢۛ᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0}, Ll/ܺۛ᩵;->ᩳ()Ll/ܺۛ᩵;

    move-result-object v2

    .line 0
    :cond_1
    invoke-virtual {v1, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v0, :cond_1

    goto :goto_0
.end method
