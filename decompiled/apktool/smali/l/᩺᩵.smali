.class public final Ll/᩺᩵;
.super Ll/۫᩵;
.source "W9N5"


# instance fields
.field public final ֫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public final ۧ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public final ܽ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public final ܿ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public final ᩳ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;)V
    .locals 0

    .line 1069
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1106
    iput-object p1, p0, Ll/᩺᩵;->ᩳ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 1107
    iput-object p2, p0, Ll/᩺᩵;->ܽ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 1108
    iput-object p3, p0, Ll/᩺᩵;->ܿ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 1109
    iput-object p4, p0, Ll/᩺᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 1110
    iput-object p5, p0, Ll/᩺᩵;->ۧ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֫֡;Ljava/lang/Thread;)V
    .locals 1

    .line 1115
    iget-object v0, p0, Ll/᩺᩵;->ᩳ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/֫֡;Ll/֫֡;)V
    .locals 1

    .line 1120
    iget-object v0, p0, Ll/᩺᩵;->ܽ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/ۧ֡;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 0
    :cond_0
    iget-object v0, p0, Ll/᩺᩵;->ۧ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p2, :cond_0

    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/ۧ֡;Ll/֫֡;Ll/֫֡;)Z
    .locals 2

    .line 0
    :cond_0
    iget-object v0, p0, Ll/᩺᩵;->ܿ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p2, :cond_0

    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/ۧ֡;Ll/ۨ᩵;Ll/ۨ᩵;)Z
    .locals 2

    .line 0
    :cond_0
    iget-object v0, p0, Ll/᩺᩵;->֫:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p2, :cond_0

    const/4 p1, 0x0

    return p1
.end method
