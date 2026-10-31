.class public Ll/ۢ᩸ۘ;
.super Ll/ۜ᩸ۘ;
.source "51RR"


# static fields
.field public static ᩸:Z


# virtual methods
.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "-->dispatchKeyEvent, is device support: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-boolean v1, Ll/ۢ᩸ۘ;->᩸:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "openSDK_LOG.SecureWebView"

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    sget-boolean v0, Ll/ۢ᩸ۘ;->᩸:Z

    if-nez v0, :cond_0

    .line 31
    invoke-super {p0, p1}, Landroid/webkit/WebView;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    .line 33
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_5

    .line 34
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_4

    const/16 v1, 0x42

    if-eq v0, v1, :cond_3

    const/16 v1, 0x43

    if-eq v0, v1, :cond_2

    .line 49
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    move-result v0

    if-nez v0, :cond_1

    .line 50
    invoke-super {p0, p1}, Landroid/webkit/WebView;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    .line 65
    :cond_1
    invoke-super {p0, p1}, Landroid/webkit/WebView;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    .line 37
    :cond_2
    sget-object v0, Ll/᩷᩹ۘ;->֫:Ljava/lang/String;

    .line 38
    invoke-super {p0, p1}, Landroid/webkit/WebView;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    .line 44
    :cond_3
    invoke-super {p0, p1}, Landroid/webkit/WebView;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    .line 41
    :cond_4
    invoke-super {p0, p1}, Landroid/webkit/WebView;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    .line 71
    :cond_5
    invoke-super {p0, p1}, Landroid/webkit/WebView;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 4

    const-string v0, "-->create input connection, is edit: false"

    const-string v1, "openSDK_LOG.SecureWebView"

    .line 126
    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    .line 129
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "-->onCreateInputConnection, inputConn is "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 131
    sput-boolean v0, Ll/ۢ᩸ۘ;->᩸:Z

    .line 132
    new-instance v0, Ll/᩷᩹ۘ;

    .line 133
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    .line 17
    invoke-direct {v0, p1, v1}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    return-object v0

    .line 136
    :cond_0
    sput-boolean v1, Ll/ۢ᩸ۘ;->᩸:Z

    return-object v0
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "-->onKeyDown, is device support: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-boolean v1, Ll/ۢ᩸ۘ;->᩸:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "openSDK_LOG.SecureWebView"

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    sget-boolean v0, Ll/ۢ᩸ۘ;->᩸:Z

    if-nez v0, :cond_0

    .line 81
    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    .line 83
    :cond_0
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_5

    .line 84
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_4

    const/16 v1, 0x42

    if-eq v0, v1, :cond_3

    const/16 v1, 0x43

    if-eq v0, v1, :cond_2

    .line 99
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getUnicodeChar()I

    move-result v0

    if-nez v0, :cond_1

    .line 100
    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    .line 116
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    .line 87
    :cond_2
    sget-object v0, Ll/᩷᩹ۘ;->֫:Ljava/lang/String;

    .line 88
    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    .line 94
    :cond_3
    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    .line 91
    :cond_4
    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    .line 119
    :cond_5
    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
