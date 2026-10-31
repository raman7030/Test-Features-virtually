.class public final Ll/᩹ۢܳ;
.super Ljava/lang/Object;
.source "I29D"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic ۗ:I

.field public final synthetic ۙ:Ljava/lang/Runnable;

.field public final synthetic ᩶:Ljava/util/function/BooleanSupplier;

.field public final ᩸:Ll/ۗۢܳ;

.field public final synthetic ᩹:Ll/۫ۢܳ;


# direct methods
.method public constructor <init>(Ll/۫ۢܳ;Ljava/util/function/BooleanSupplier;ILjava/lang/Runnable;)V
    .locals 0

    .line 248
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ۢܳ;->᩹:Ll/۫ۢܳ;

    iput-object p2, p0, Ll/᩹ۢܳ;->᩶:Ljava/util/function/BooleanSupplier;

    iput p3, p0, Ll/᩹ۢܳ;->ۗ:I

    iput-object p4, p0, Ll/᩹ۢܳ;->ۙ:Ljava/lang/Runnable;

    .line 249
    new-instance p2, Ll/ۗۢܳ;

    invoke-direct {p2, p1}, Ll/ۗۢܳ;-><init>(Ll/۫ۢܳ;)V

    iput-object p2, p0, Ll/᩹ۢܳ;->᩸:Ll/ۗۢܳ;

    return-void
.end method

.method private ֫()V
    .locals 2

    .line 267
    iget-object v0, p0, Ll/᩹ۢܳ;->᩹:Ll/۫ۢܳ;

    invoke-static {v0}, Ll/۫ۢܳ;->ܽ(Ll/۫ۢܳ;)Ll/ۢۢۡ;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 268
    invoke-static {v0}, Ll/۫ۢܳ;->ܽ(Ll/۫ۢܳ;)Ll/ۢۢۡ;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 3

    .line 253
    iget-object v0, p0, Ll/᩹ۢܳ;->᩶:Ljava/util/function/BooleanSupplier;

    invoke-interface {v0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 254
    invoke-direct {p0}, Ll/᩹ۢܳ;->֫()V

    return v1

    .line 257
    :cond_0
    iget-object v0, p0, Ll/᩹ۢܳ;->᩸:Ll/ۗۢܳ;

    iget v2, p0, Ll/᩹ۢܳ;->ۗ:I

    invoke-virtual {v0, v2}, Ll/ۗۢܳ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 258
    :cond_1
    invoke-direct {p0}, Ll/᩹ۢܳ;->֫()V

    .line 259
    iget-object v0, p0, Ll/᩹ۢܳ;->ۙ:Ljava/lang/Runnable;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_2
    return v1
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    .line 264
    invoke-direct {p0}, Ll/᩹ۢܳ;->֫()V

    return-void
.end method
