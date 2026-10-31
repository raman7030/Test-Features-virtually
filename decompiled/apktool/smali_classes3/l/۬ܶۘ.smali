.class public Ll/۬ܶۘ;
.super Ljava/lang/Object;
.source "51RR"


# instance fields
.field public ֫:Ljava/lang/ref/WeakReference;

.field public ۧ:J


# direct methods
.method public constructor <init>(Landroid/webkit/WebView;J)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/۬ܶۘ;->֫:Ljava/lang/ref/WeakReference;

    .line 36
    iput-wide p2, p0, Ll/۬ܶۘ;->ۧ:J

    return-void
.end method


# virtual methods
.method public ֫()V
    .locals 4

    .line 47
    iget-object v0, p0, Ll/۬ܶۘ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    if-nez v0, :cond_0

    return-void

    .line 64
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "javascript:window.JsBridge&&JsBridge.callback("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Ll/۬ܶۘ;->ۧ:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",{\'r\':0,\'result\':"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\'undefined\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "});"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method public ֫(Ljava/lang/String;)V
    .locals 3

    .line 80
    iget-object v0, p0, Ll/۬ܶۘ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 82
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "javascript:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public ۧ()V
    .locals 4

    .line 67
    iget-object v0, p0, Ll/۬ܶۘ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    if-nez v0, :cond_0

    return-void

    .line 71
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "javascript:window.JsBridge&&JsBridge.callback("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Ll/۬ܶۘ;->ۧ:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",{\'r\':1,\'result\':\'no such method\'})"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method
