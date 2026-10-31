.class public final Ll/ۛܳ֫;
.super Ll/ۢᩳ;
.source "J4LB"


# instance fields
.field public final synthetic ֫:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    .line 3604
    iput-object p1, p0, Ll/ۛܳ֫;->֫:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p0}, Ll/ۢᩳ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 3617
    iget-object v0, p0, Ll/ۛܳ֫;->֫:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢᩳ;

    if-eqz v0, :cond_0

    .line 3619
    invoke-virtual {v0}, Ll/ۢᩳ;->֫()V

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 1

    .line 3607
    iget-object v0, p0, Ll/ۛܳ֫;->֫:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢᩳ;

    if-eqz v0, :cond_0

    .line 3612
    invoke-virtual {v0, p1}, Ll/ۢᩳ;->֫(Ljava/lang/Object;)V

    return-void

    .line 3609
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Operation cannot be started before fragment is in created state"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
