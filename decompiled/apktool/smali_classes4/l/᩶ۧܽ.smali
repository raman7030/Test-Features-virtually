.class public final Ll/᩶ۧܽ;
.super Ljava/lang/Object;
.source "OANW"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final ᩸:Ljava/lang/ref/WeakReference;

.field public final ᩹:Ll/۬ۧܽ;


# direct methods
.method public constructor <init>(Ll/۬ۧܽ;Landroid/app/Activity;)V
    .locals 0

    .line 302
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 303
    iput-object p1, p0, Ll/᩶ۧܽ;->᩹:Ll/۬ۧܽ;

    .line 306
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ll/᩶ۧܽ;->᩸:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    const-string v0, "view"

    .line 6
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 308
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 309
    iget-object p1, p0, Ll/᩶ۧܽ;->᩸:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    .line 475
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, v1, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    :goto_0
    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    if-nez v0, :cond_4

    :goto_1
    return-void

    .line 323
    :cond_4
    iget-object v1, p0, Ll/᩶ۧܽ;->᩹:Ll/۬ۧܽ;

    invoke-virtual {v1, v0, p1}, Ll/۬ۧܽ;->֫(Landroid/os/IBinder;Landroid/app/Activity;)V

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    const-string v0, "view"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
