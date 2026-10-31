.class public final Ll/ۧ۬ۘ;
.super Ljava/lang/Object;
.source "C8ZQ"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic ᩸:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧ۬ۘ;->᩸:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    .line 29
    iget-object p1, p0, Ll/ۧ۬ۘ;->᩸:Landroid/widget/TextView;

    invoke-static {p1}, Ll/ܿ۬ۘ;->֫(Landroid/widget/TextView;)V

    .line 30
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    const v0, 0x7f0a02fb

    const/4 v1, 0x0

    .line 31
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method
