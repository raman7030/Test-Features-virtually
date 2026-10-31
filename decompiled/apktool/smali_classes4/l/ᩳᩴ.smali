.class public final Ll/ᩳᩴ;
.super Ljava/lang/Object;
.source "V659"


# direct methods
.method public static ֫(Ljava/lang/Runnable;)Landroid/window/OnBackInvokedCallback;
    .locals 1

    .line 2825
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ܽᩴ;

    invoke-direct {v0, p0}, Ll/ܽᩴ;-><init>(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public static ֫(Landroid/view/View;)Landroid/window/OnBackInvokedDispatcher;
    .locals 0

    .line 2819
    invoke-virtual {p0}, Landroid/view/View;->findOnBackInvokedDispatcher()Landroid/window/OnBackInvokedDispatcher;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 2804
    check-cast p0, Landroid/window/OnBackInvokedDispatcher;

    const v0, 0xf4240

    .line 2805
    check-cast p1, Landroid/window/OnBackInvokedCallback;

    invoke-interface {p0, v0, p1}, Landroid/window/OnBackInvokedDispatcher;->registerOnBackInvokedCallback(ILandroid/window/OnBackInvokedCallback;)V

    return-void
.end method

.method public static ۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2812
    check-cast p0, Landroid/window/OnBackInvokedDispatcher;

    .line 2813
    check-cast p1, Landroid/window/OnBackInvokedCallback;

    invoke-interface {p0, p1}, Landroid/window/OnBackInvokedDispatcher;->unregisterOnBackInvokedCallback(Landroid/window/OnBackInvokedCallback;)V

    return-void
.end method
