.class public final synthetic Ll/֨ۢ᩻;
.super Ljava/lang/Object;
.source "RAHU"

# interfaces
.implements Ll/᩻᩻᩻;


# instance fields
.field public final synthetic ֫:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۢ᩻;->֫:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۖ᩻᩻;Z)V
    .locals 1

    if-nez p2, :cond_2

    .line 259
    iget-object p1, p1, Ll/ۖ᩻᩻;->᩻:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Exception;

    if-eqz p1, :cond_2

    .line 0
    :cond_0
    iget-object p2, p0, Ll/֨ۢ᩻;->֫:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-virtual {p2, v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_0

    :cond_2
    :goto_0
    return-void
.end method
