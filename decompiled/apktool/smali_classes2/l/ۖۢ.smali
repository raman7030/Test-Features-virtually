.class public final Ll/ۖۢ;
.super Ljava/lang/Object;
.source "S696"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic ᩸:Ll/۠ۢ;


# direct methods
.method public constructor <init>(Ll/۠ۢ;)V
    .locals 0

    .line 148
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖۢ;->᩸:Ll/۠ۢ;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 2

    .line 429
    iget-object v0, p0, Ll/ۖۢ;->᩸:Ll/۠ۢ;

    invoke-virtual {v0}, Ll/۠ۢ;->ۧ()Ll/ۢۖ;

    move-result-object v1

    .line 859
    iget-object v1, v1, Ll/ۢۖ;->᩷֫:Landroid/widget/PopupWindow;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 152
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v1

    if-nez v1, :cond_0

    .line 153
    invoke-virtual {v0}, Ll/۠ۢ;->ۧ()Ll/ۢۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢۖ;->dismiss()V

    return-void

    .line 155
    :cond_0
    invoke-virtual {v0}, Ll/۠ۢ;->ۧ()Ll/ۢۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢۖ;->show()V

    :cond_1
    return-void
.end method
