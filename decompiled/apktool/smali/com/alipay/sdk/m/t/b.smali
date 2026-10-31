.class public final Lcom/alipay/sdk/m/t/b;
.super Ljava/lang/Object;
.source "N673"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/alipay/sdk/m/t/b;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/alipay/sdk/m/t/b;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alipay/sdk/m/t/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alipay/sdk/m/t/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lorg/json/JSONObject;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alipay/sdk/m/t/b;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 7
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    iget-object v2, p0, Lcom/alipay/sdk/m/t/b;->b:Ljava/lang/String;

    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 9
    invoke-static {v0}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alipay/sdk/m/t/b;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/alipay/sdk/m/t/b;->b:Ljava/lang/String;

    const-string v2, " body="

    const-string v3, ">"

    const-string v4, "<Letter envelop="

    .line 0
    invoke-static {v4, v0, v2, v1, v3}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
