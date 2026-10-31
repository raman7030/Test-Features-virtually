.class public final Ll/ܳ᩸ۘ;
.super Landroid/webkit/WebChromeClient;
.source "51RR"


# instance fields
.field public final synthetic ֫:Lcom/tencent/open/c;


# direct methods
.method public constructor <init>(Lcom/tencent/open/c;)V
    .locals 0

    .line 35
    iput-object p1, p0, Ll/ܳ᩸ۘ;->֫:Lcom/tencent/open/c;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onConsoleMessage(Ljava/lang/String;ILjava/lang/String;)V
    .locals 2

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "WebChromeClient onConsoleMessage"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " -- From 222 line "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " of "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "openSDK_LOG.JsDialog"

    invoke-static {p2, p1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 41
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "WebChromeClient onConsoleMessage"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -- From  111 line "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->lineNumber()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->sourceId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "openSDK_LOG.JsDialog"

    .line 41
    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    iget-object v0, p0, Ll/ܳ᩸ۘ;->֫:Lcom/tencent/open/c;

    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/open/c;->֫(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method
