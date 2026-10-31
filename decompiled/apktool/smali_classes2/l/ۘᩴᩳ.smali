.class public final Ll/ۘᩴᩳ;
.super Ljava/lang/Object;
.source "P6SA"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic ᩸:Ll/᩵ᩴᩳ;


# direct methods
.method public constructor <init>(Ll/᩵ᩴᩳ;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘᩴᩳ;->᩸:Ll/᩵ᩴᩳ;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 3

    .line 109
    iget-object p1, p0, Ll/ۘᩴᩳ;->᩸:Ll/᩵ᩴᩳ;

    iget-object v0, p1, Ll/᩵ᩴᩳ;->ۚ:Ll/۫ۨᩳ;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 110
    invoke-static {p1}, Ll/᩵ᩴᩳ;->ᩳ(Ll/᩵ᩴᩳ;)V

    .line 112
    invoke-static {p1}, Ll/᩵ᩴᩳ;->ܽ(Ll/᩵ᩴᩳ;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Ll/᩻᩸ᩳ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p1}, Ll/᩻᩸ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
