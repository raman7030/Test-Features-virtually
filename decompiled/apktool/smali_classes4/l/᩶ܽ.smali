.class public final Ll/᩶ܽ;
.super Ljava/lang/Object;
.source "K234"


# static fields
.field public static final ֫:Ll/᩶ܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2
    new-instance v0, Ll/᩶ܽ;

    .line 347
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 0
    sput-object v0, Ll/᩶ܽ;->֫:Ll/᩶ܽ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֫᩹᩵;)Landroid/window/OnBackInvokedCallback;
    .locals 1

    const-string v0, "onBackInvoked"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 369
    new-instance v0, Ll/᩹ܽ;

    invoke-direct {v0, p1}, Ll/᩹ܽ;-><init>(Ll/֫᩹᩵;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 1

    const-string v0, "dispatcher"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    .line 10
    invoke-static {p3, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 355
    check-cast p1, Landroid/window/OnBackInvokedDispatcher;

    .line 356
    check-cast p3, Landroid/window/OnBackInvokedCallback;

    .line 357
    invoke-interface {p1, p2, p3}, Landroid/window/OnBackInvokedDispatcher;->registerOnBackInvokedCallback(ILandroid/window/OnBackInvokedCallback;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "dispatcher"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    .line 10
    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 362
    check-cast p1, Landroid/window/OnBackInvokedDispatcher;

    .line 363
    check-cast p2, Landroid/window/OnBackInvokedCallback;

    .line 364
    invoke-interface {p1, p2}, Landroid/window/OnBackInvokedDispatcher;->unregisterOnBackInvokedCallback(Landroid/window/OnBackInvokedCallback;)V

    return-void
.end method
