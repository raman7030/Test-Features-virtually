.class public final Ll/֨ۡۡ;
.super Landroid/view/inputmethod/InputConnectionWrapper;
.source "E7F1"


# instance fields
.field public final synthetic ֫:Ll/ܶۡۡ;


# direct methods
.method public constructor <init>(Ll/ܶۡۡ;Landroid/view/inputmethod/InputConnection;)V
    .locals 0

    .line 79
    iput-object p1, p0, Ll/֨ۡۡ;->֫:Ll/ܶۡۡ;

    const/4 p1, 0x0

    invoke-direct {p0, p2, p1}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    return-void
.end method


# virtual methods
.method public final performEditorAction(I)Z
    .locals 1

    .line 82
    iget-object v0, p0, Ll/֨ۡۡ;->֫:Ll/ܶۡۡ;

    invoke-static {v0}, Ll/ܶۡۡ;->֫(Ll/ܶۡۡ;)Ll/۠ۡۡ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 83
    check-cast v0, Ll/۟ۢۡ;

    iget-object v0, v0, Ll/۟ۢۡ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/᩻ۡۡ;

    invoke-static {v0, p1}, Ll/᩻ۡۡ;->֫(Ll/᩻ۡۡ;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 86
    :cond_0
    invoke-super {p0, p1}, Landroid/view/inputmethod/InputConnectionWrapper;->performEditorAction(I)Z

    move-result p1

    return p1
.end method

.method public final sendKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 91
    iget-object v0, p0, Ll/֨ۡۡ;->֫:Ll/ܶۡۡ;

    invoke-static {v0}, Ll/ܶۡۡ;->֫(Ll/ܶۡۡ;)Ll/۠ۡۡ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 93
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_0

    .line 94
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    const/16 v2, 0x42

    if-ne v1, v2, :cond_0

    .line 95
    check-cast v0, Ll/۟ۢۡ;

    iget-object v0, v0, Ll/۟ۢۡ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/᩻ۡۡ;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/᩻ۡۡ;->֫(Ll/᩻ۡۡ;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 98
    :cond_0
    invoke-super {p0, p1}, Landroid/view/inputmethod/InputConnectionWrapper;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
