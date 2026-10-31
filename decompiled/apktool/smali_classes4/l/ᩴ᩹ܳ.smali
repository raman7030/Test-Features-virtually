.class public final Ll/ᩴ᩹ܳ;
.super Ljava/lang/Object;
.source "164Z"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final synthetic ᩶:Landroid/view/ViewTreeObserver;

.field public final synthetic ᩸:Ll/֡ۚۢ;

.field public final synthetic ᩹:Ll/۬۬ۧ;


# direct methods
.method public constructor <init>(Landroid/view/ViewTreeObserver;Ll/֡ۚۢ;Ll/۬۬ۧ;)V
    .locals 0

    .line 1084
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ᩹ܳ;->᩶:Landroid/view/ViewTreeObserver;

    iput-object p2, p0, Ll/ᩴ᩹ܳ;->᩸:Ll/֡ۚۢ;

    iput-object p3, p0, Ll/ᩴ᩹ܳ;->᩹:Ll/۬۬ۧ;

    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 5

    .line 1087
    iget-object v0, p0, Ll/ᩴ᩹ܳ;->᩶:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1088
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_0
    const/4 v0, 0x1

    .line 1090
    iget-object v1, p0, Ll/ᩴ᩹ܳ;->᩸:Ll/֡ۚۢ;

    if-nez v1, :cond_1

    return v0

    .line 1093
    :cond_1
    iget-object v2, p0, Ll/ᩴ᩹ܳ;->᩹:Ll/۬۬ۧ;

    invoke-virtual {v2}, Ll/۬۬ۧ;->getItemAnimator()Ll/᩺ۗۧ;

    move-result-object v2

    if-nez v2, :cond_2

    .line 1108
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Ll/᩸ۛᩳ;

    const/4 v4, 0x3

    invoke-direct {v3, v4, v1}, Ll/᩸ۛᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return v0

    .line 1097
    :cond_2
    new-instance v3, Ll/ۘ᩹ܳ;

    invoke-direct {v3, v1}, Ll/ۘ᩹ܳ;-><init>(Ll/֡ۚۢ;)V

    invoke-virtual {v2, v3}, Ll/᩺ۗۧ;->֫(Ll/ۘ᩹ܳ;)Z

    return v0
.end method
