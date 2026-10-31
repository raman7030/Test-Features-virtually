.class public Lcom/alipay/sdk/m/c0/d$f;
.super Ljava/lang/Object;
.source "N673"


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Lorg/json/JSONObject;

.field public e:Z


# direct methods
.method public constructor <init>(Lcom/alipay/sdk/m/c0/e;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/alipay/sdk/m/c0/d$f;->e:Z

    .line 5
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/alipay/sdk/m/c0/d$f;->a:Ljava/lang/ref/WeakReference;

    .line 6
    iput-object p2, p0, Lcom/alipay/sdk/m/c0/d$f;->b:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/alipay/sdk/m/c0/d$f;->c:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/alipay/sdk/m/c0/d$f;->d:Lorg/json/JSONObject;

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 19
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    const-string v0, "\'"

    .line 22
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/alipay/sdk/m/c0/d$f;->e:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/alipay/sdk/m/c0/d$f;->a:Ljava/lang/ref/WeakReference;

    invoke-static {v0}, Lcom/alipay/sdk/m/y/q;->a(Ljava/lang/ref/WeakReference;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/alipay/sdk/m/c0/e;

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, p0, Lcom/alipay/sdk/m/c0/d$f;->e:Z

    .line 15
    iget-object v1, p0, Lcom/alipay/sdk/m/c0/d$f;->c:Ljava/lang/String;

    .line 16
    invoke-static {v1}, Lcom/alipay/sdk/m/c0/d$f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 17
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/alipay/sdk/m/c0/d$f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "\',\'"

    const-string v3, "\');"

    const-string v4, "javascript:window.AlipayJSBridge.callBackFromNativeFunc(\'"

    .line 0
    invoke-static {v4, v1, v2, p1, v3}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 18
    invoke-virtual {v0, p1}, Lcom/alipay/sdk/m/c0/e;->a(Ljava/lang/String;)V

    return-void
.end method
