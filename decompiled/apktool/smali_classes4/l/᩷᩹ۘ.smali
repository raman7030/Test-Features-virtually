.class public final Ll/᩷᩹ۘ;
.super Landroid/view/inputmethod/InputConnectionWrapper;
.source "51RR"


# static fields
.field public static ֫:Ljava/lang/String;


# virtual methods
.method public final commitText(Ljava/lang/CharSequence;I)Z
    .locals 2

    .line 32
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/᩷᩹ۘ;->֫:Ljava/lang/String;

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "-->commitText: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "openSDK_LOG.CaptureInputConnection"

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->commitText(Ljava/lang/CharSequence;I)Z

    move-result p1

    return p1
.end method

.method public final sendKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 39
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const-string v1, "openSDK_LOG.CaptureInputConnection"

    if-nez v0, :cond_0

    const-string v0, "sendKeyEvent"

    .line 40
    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    move-result v0

    int-to-char v0, v0

    .line 43
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/᩷᩹ۘ;->֫:Ljava/lang/String;

    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "s: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Ll/᩷᩹ۘ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "-->sendKeyEvent: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Ll/᩷᩹ۘ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    invoke-super {p0, p1}, Landroid/view/inputmethod/InputConnectionWrapper;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final setComposingText(Ljava/lang/CharSequence;I)Z
    .locals 2

    .line 24
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/᩷᩹ۘ;->֫:Ljava/lang/String;

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "-->setComposingText: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "openSDK_LOG.CaptureInputConnection"

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->setComposingText(Ljava/lang/CharSequence;I)Z

    move-result p1

    return p1
.end method
