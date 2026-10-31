.class public final Ll/۠ܿ֫;
.super Ljava/lang/Object;
.source "9B11"

# interfaces
.implements Landroid/text/method/KeyListener;


# instance fields
.field public final ᩸:Landroid/text/method/KeyListener;


# direct methods
.method public constructor <init>(Landroid/text/method/KeyListener;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Ll/۠ܿ֫;->᩸:Landroid/text/method/KeyListener;

    return-void
.end method


# virtual methods
.method public final clearMetaKeyState(Landroid/view/View;Landroid/text/Editable;I)V
    .locals 1

    .line 73
    iget-object v0, p0, Ll/۠ܿ֫;->᩸:Landroid/text/method/KeyListener;

    invoke-interface {v0, p1, p2, p3}, Landroid/text/method/KeyListener;->clearMetaKeyState(Landroid/view/View;Landroid/text/Editable;I)V

    return-void
.end method

.method public final getInputType()I
    .locals 1

    .line 51
    iget-object v0, p0, Ll/۠ܿ֫;->᩸:Landroid/text/method/KeyListener;

    invoke-interface {v0}, Landroid/text/method/KeyListener;->getInputType()I

    move-result v0

    return v0
.end method

.method public final onKeyDown(Landroid/view/View;Landroid/text/Editable;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 79
    invoke-static {p2, p3, p4}, Ll/ۜᩳ֫;->֫(Landroid/text/Editable;ILandroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 58
    iget-object v0, p0, Ll/۠ܿ֫;->᩸:Landroid/text/method/KeyListener;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/text/method/KeyListener;->onKeyDown(Landroid/view/View;Landroid/text/Editable;ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final onKeyOther(Landroid/view/View;Landroid/text/Editable;Landroid/view/KeyEvent;)Z
    .locals 1

    .line 68
    iget-object v0, p0, Ll/۠ܿ֫;->᩸:Landroid/text/method/KeyListener;

    invoke-interface {v0, p1, p2, p3}, Landroid/text/method/KeyListener;->onKeyOther(Landroid/view/View;Landroid/text/Editable;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onKeyUp(Landroid/view/View;Landroid/text/Editable;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 63
    iget-object v0, p0, Ll/۠ܿ֫;->᩸:Landroid/text/method/KeyListener;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/text/method/KeyListener;->onKeyUp(Landroid/view/View;Landroid/text/Editable;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
