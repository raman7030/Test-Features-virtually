.class public final Ll/ۨܺ;
.super Ljava/lang/Object;
.source "44YF"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ܰܺ;


# direct methods
.method public constructor <init>(Ll/ܰܺ;)V
    .locals 0

    .line 315
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨܺ;->᩸:Ll/ܰܺ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 320
    iget-object v0, p0, Ll/ۨܺ;->᩸:Ll/ܰܺ;

    iget-object v0, v0, Ll/ܰܺ;->۬:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 322
    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_0
    return-void
.end method
