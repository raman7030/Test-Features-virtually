.class public final Ll/ۚܶۢ;
.super Ljava/lang/Object;
.source "CAJ1"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic ᩸:Ll/۠ܶۢ;

.field public final synthetic ᩹:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ll/۠ܶۢ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚܶۢ;->᩸:Ll/۠ܶۢ;

    iput-object p2, p0, Ll/ۚܶۢ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    const/4 p1, 0x1

    const/4 v0, 0x0

    .line 119
    iget-object v1, p0, Ll/ۚܶۢ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 120
    iget-object p1, p0, Ll/ۚܶۢ;->᩸:Ll/۠ܶۢ;

    sget-object v0, Ll/֨ܶۢ;->᩶:Ll/֨ܶۢ;

    invoke-static {p1, v0}, Ll/۠ܶۢ;->֫(Ll/۠ܶۢ;Ll/֨ܶۢ;)V

    :cond_0
    return-void
.end method
