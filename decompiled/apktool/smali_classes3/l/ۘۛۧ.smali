.class public final Ll/ۘۛۧ;
.super Ljava/lang/Object;
.source "C5U9"

# interfaces
.implements Ll/ۛۛۧ;


# instance fields
.field public final synthetic ֫:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 0

    .line 345
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘۛۧ;->֫:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final onTransitionCancel(Ll/ܽۨۧ;)V
    .locals 0

    return-void
.end method

.method public final onTransitionEnd(Ll/ܽۨۧ;)V
    .locals 0

    .line 351
    iget-object p1, p0, Ll/ۘۛۧ;->֫:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public final onTransitionEnd(Ll/ܽۨۧ;Z)V
    .locals 0

    .line 2525
    invoke-virtual {p0, p1}, Ll/ۘۛۧ;->onTransitionEnd(Ll/ܽۨۧ;)V

    return-void
.end method

.method public final onTransitionPause(Ll/ܽۨۧ;)V
    .locals 0

    return-void
.end method

.method public final onTransitionResume(Ll/ܽۨۧ;)V
    .locals 0

    return-void
.end method

.method public final onTransitionStart(Ll/ܽۨۧ;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final onTransitionStart(Ll/ܽۨۧ;Z)V
    .locals 0

    return-void
.end method
