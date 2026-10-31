.class public final Ll/ۜ᩷֫;
.super Ljava/lang/Object;
.source "451G"

# interfaces
.implements Landroid/transition/Transition$TransitionListener;


# instance fields
.field public final synthetic ֫:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 0

    .line 271
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜ᩷֫;->֫:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final onTransitionCancel(Landroid/transition/Transition;)V
    .locals 0

    return-void
.end method

.method public final onTransitionEnd(Landroid/transition/Transition;)V
    .locals 0

    .line 277
    iget-object p1, p0, Ll/ۜ᩷֫;->֫:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public final onTransitionPause(Landroid/transition/Transition;)V
    .locals 0

    return-void
.end method

.method public final onTransitionResume(Landroid/transition/Transition;)V
    .locals 0

    return-void
.end method

.method public final onTransitionStart(Landroid/transition/Transition;)V
    .locals 0

    return-void
.end method
