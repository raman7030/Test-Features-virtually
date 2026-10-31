.class public final Ll/ۘۜ;
.super Ljava/lang/Object;
.source "E50U"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic ᩸:Ll/ۚۜ;


# direct methods
.method public constructor <init>(Ll/ۚۜ;)V
    .locals 0

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘۜ;->᩸:Ll/ۚۜ;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    .line 126
    iget-object v0, p0, Ll/ۘۜ;->᩸:Ll/ۚۜ;

    iget-object v1, v0, Ll/ۚۜ;->ۡ֫:Landroid/view/ViewTreeObserver;

    if-eqz v1, :cond_1

    .line 127
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-nez v1, :cond_0

    .line 128
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    iput-object v1, v0, Ll/ۚۜ;->ۡ֫:Landroid/view/ViewTreeObserver;

    .line 130
    :cond_0
    iget-object v1, v0, Ll/ۚۜ;->ۡ֫:Landroid/view/ViewTreeObserver;

    iget-object v0, v0, Ll/ۚۜ;->۫:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 132
    :cond_1
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void
.end method
