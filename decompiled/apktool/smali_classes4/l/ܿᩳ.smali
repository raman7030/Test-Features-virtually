.class public final Ll/ܿᩳ;
.super Ljava/lang/Object;
.source "DB8V"


# instance fields
.field public volatile ֫:Ll/᩻ܽ;

.field public final ۧ:Ljava/util/concurrent/CopyOnWriteArraySet;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Ll/ܿᩳ;->ۧ:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 93
    iput-object v0, p0, Ll/ܿᩳ;->֫:Ll/᩻ܽ;

    return-void
.end method

.method public final ֫(Ll/ܳᩳ;)V
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ܿᩳ;->֫:Ll/᩻ܽ;

    if-eqz v0, :cond_0

    .line 59
    invoke-interface {p1, v0}, Ll/ܳᩳ;->֫(Ll/᩻ܽ;)V

    .line 61
    :cond_0
    iget-object v0, p0, Ll/ܿᩳ;->ۧ:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/᩻ܽ;)V
    .locals 2

    .line 82
    iput-object p1, p0, Ll/ܿᩳ;->֫:Ll/᩻ܽ;

    .line 83
    iget-object v0, p0, Ll/ܿᩳ;->ۧ:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳᩳ;

    .line 84
    invoke-interface {v1, p1}, Ll/ܳᩳ;->֫(Ll/᩻ܽ;)V

    goto :goto_0

    :cond_0
    return-void
.end method
