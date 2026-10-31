.class public final Ll/ۢۨܿ;
.super Landroid/os/Handler;
.source "YALU"


# instance fields
.field public final ֫:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 179
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 180
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ۢۨܿ;->֫:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 185
    iget-object p1, p0, Ll/ۢۨܿ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 187
    fill-array-data v0, :array_0

    const-string v1, "alpha"

    invoke-static {p1, v1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 188
    new-instance v1, Ll/᩷ۨܿ;

    invoke-direct {v1, p1}, Ll/᩷ۨܿ;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    const-wide/16 v1, 0x96

    .line 209
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 210
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    :cond_0
    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method
