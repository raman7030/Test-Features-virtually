.class public final Ll/ܺۨۘ;
.super Ljava/lang/Object;
.source "F90M"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic ᩸:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۨۘ;->᩸:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    .line 51
    iget-object v0, p0, Ll/ܺۨۘ;->᩸:Landroid/widget/TextView;

    invoke-static {v0}, Ll/᩵ۨۘ;->ܽ(Landroid/widget/TextView;)V

    .line 52
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    const v0, 0x7f0a02f9

    const/4 v1, 0x0

    .line 53
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method
