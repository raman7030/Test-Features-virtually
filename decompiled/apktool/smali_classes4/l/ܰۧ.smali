.class public Ll/ܰۧ;
.super Ljava/lang/Object;
.source "V22O"

# interfaces
.implements Ll/ܿۡ֫;


# instance fields
.field public final synthetic ᩸:Ll/᩻ܽ;


# direct methods
.method public constructor <init>(Ll/᩻ܽ;)V
    .locals 0

    .line 287
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰۧ;->᩸:Ll/᩻ܽ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 1

    .line 291
    sget-object p1, Ll/᩺ۢ֫;->ۗ:Ll/᩺ۢ֫;

    if-ne p2, p1, :cond_1

    .line 293
    iget-object p1, p0, Ll/ܰۧ;->᩸:Ll/᩻ܽ;

    iget-object p2, p1, Ll/᩻ܽ;->᩶:Ll/ܿᩳ;

    invoke-virtual {p2}, Ll/ܿᩳ;->֫()V

    .line 295
    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result p2

    if-nez p2, :cond_0

    .line 296
    invoke-virtual {p1}, Ll/᩻ܽ;->getViewModelStore()Ll/ۗܺ֫;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۗܺ֫;->֫()V

    .line 298
    :cond_0
    iget-object p1, p1, Ll/᩻ܽ;->ᩳ֫:Ll/ܳܽ;

    .line 1218
    iget-object p2, p1, Ll/ܳܽ;->ۙ:Ll/᩻ܽ;

    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1219
    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    :cond_1
    return-void
.end method
