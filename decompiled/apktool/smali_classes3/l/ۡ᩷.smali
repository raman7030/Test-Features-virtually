.class public final Ll/ۡ᩷;
.super Ljava/lang/Object;
.source "C4MC"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic ᩸:Ll/ۖ᩷;


# direct methods
.method public constructor <init>(Ll/ۖ᩷;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡ᩷;->᩸:Ll/ۖ᩷;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 3

    .line 66
    iget-object v0, p0, Ll/ۡ᩷;->᩸:Ll/ۖ᩷;

    iget-object v1, v0, Ll/ۖ᩷;->۟:Ll/֡ۖ;

    invoke-virtual {v0}, Ll/ۖ᩷;->isShowing()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ll/ۢۖ;->ۢ()Z

    move-result v2

    if-nez v2, :cond_2

    .line 67
    iget-object v2, v0, Ll/ۖ᩷;->ܿ֫:Landroid/view/View;

    if-eqz v2, :cond_1

    .line 68
    invoke-virtual {v2}, Landroid/view/View;->isShown()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 72
    :cond_0
    invoke-virtual {v1}, Ll/ۢۖ;->show()V

    return-void

    .line 69
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ll/ۖ᩷;->dismiss()V

    :cond_2
    return-void
.end method
