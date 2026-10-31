.class public final Ll/᩻ۖ;
.super Ljava/lang/Object;
.source "25PA"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field public final synthetic ֫:Ll/ۢۖ;


# direct methods
.method public constructor <init>(Ll/ۢۖ;)V
    .locals 0

    .line 1405
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ۖ;->֫:Ll/ۢۖ;

    return-void
.end method


# virtual methods
.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    return-void
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 3

    .line 1416
    iget-object p1, p0, Ll/᩻ۖ;->֫:Ll/ۢۖ;

    iget-object v0, p1, Ll/ۢۖ;->ۢ֫:Ll/᩷ۖ;

    iget-object v1, p1, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    const/4 v2, 0x1

    if-ne p2, v2, :cond_1

    .line 867
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    move-result p2

    const/4 v2, 0x2

    if-ne p2, v2, :cond_0

    return-void

    .line 1417
    :cond_0
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 1418
    iget-object p1, p1, Ll/ۢۖ;->۟:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1419
    invoke-virtual {v0}, Ll/᩷ۖ;->run()V

    :cond_1
    return-void
.end method
