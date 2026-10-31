.class public abstract Ll/֡ܽ;
.super Ljava/lang/Object;
.source "T20C"


# instance fields
.field public final ֫:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public ۧ:Ll/֫᩹᩵;

.field public ܽ:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-boolean p1, p0, Ll/֡ܽ;->ܽ:Z

    .line 59
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Ll/֡ܽ;->֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/֫᩹᩵;
    .locals 1

    .line 60
    iget-object v0, p0, Ll/֡ܽ;->ۧ:Ll/֫᩹᩵;

    return-object v0
.end method

.method public final ֫(Ll/֫᩹᩵;)V
    .locals 0

    .line 60
    iput-object p1, p0, Ll/֡ܽ;->ۧ:Ll/֫᩹᩵;

    return-void
.end method

.method public final ֫(Ll/ۙۧ;)V
    .locals 1

    .line 107
    iget-object v0, p0, Ll/֡ܽ;->֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 55
    iput-boolean p1, p0, Ll/֡ܽ;->ܽ:Z

    .line 56
    iget-object p1, p0, Ll/֡ܽ;->ۧ:Ll/֫᩹᩵;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ll/֫᩹᩵;->֫()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public abstract ۧ()V
.end method

.method public final ۧ(Ll/ۙۧ;)V
    .locals 1

    .line 112
    iget-object v0, p0, Ll/֡ܽ;->֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 53
    iget-boolean v0, p0, Ll/֡ܽ;->ܽ:Z

    return v0
.end method

.method public final ᩳ()V
    .locals 2

    .line 67
    iget-object v0, p0, Ll/֡ܽ;->֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 116
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙۧ;

    .line 67
    invoke-interface {v1}, Ll/ۙۧ;->cancel()V

    goto :goto_0

    :cond_0
    return-void
.end method
