.class public final Ll/ۚ᩹ۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ll/֡᩹ۘ;


# virtual methods
.method public final ֫(Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 8

    .line 26
    invoke-static {}, Ll/ۡܶۘ;->֫()Ll/ۡܶۘ;

    move-result-object p2

    const/16 v0, 0x2b5d

    invoke-virtual {p2, v0}, Ll/ۡܶۘ;->֫(I)Ll/ۘ᩹ۘ;

    move-result-object p2

    const-string v0, "AuthActionHandler"

    if-nez p2, :cond_0

    const-string p1, "handleActionAuth listener is null"

    .line 28
    invoke-static {v0, p1}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v1, -0x6

    if-nez p1, :cond_1

    const-string p1, "handleActionAuth intent null"

    .line 32
    invoke-static {v0, p1}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    new-instance p1, Ll/᩵᩹ۘ;

    const-string v0, "\u65e0\u6cd5\u89e3\u6790\u56de\u8c03\u6570\u636e\uff1aintent\u6570\u636e\u4e3a\u7a7a"

    invoke-direct {p1, v1, v0, v0}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, p1}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    return-void

    :cond_1
    const-string v2, "key_auth_result_code"

    const/high16 v3, -0x80000000

    .line 36
    invoke-virtual {p1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    .line 37
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "handleActionAuth resultCode: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, -0x1

    if-eq v2, v3, :cond_3

    if-eqz v2, :cond_2

    .line 64
    new-instance p1, Ll/᩵᩹ۘ;

    const-string v0, "\u65e0\u6cd5\u89e3\u6790\u56de\u8c03\u6570\u636e\uff1aresultCode="

    .line 0
    invoke-static {v2, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 64
    invoke-direct {p1, v1, v3, v0}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, p1}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    return-void

    .line 60
    :cond_2
    invoke-interface {p2}, Ll/ۘ᩹ۘ;->֫()V

    return-void

    :cond_3
    const-string v2, "key_auth_result_data"

    .line 41
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_4

    const-string p1, "handleActionAuth resultOk but data is null"

    .line 43
    invoke-static {v0, p1}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    new-instance p1, Ll/᩵᩹ۘ;

    const-string v0, "\u65e0\u6cd5\u89e3\u6790\u56de\u8c03\u6570\u636e\uff1adata\u4e3a\u7a7a"

    invoke-direct {p1, v1, v0, v0}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, p1}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    return-void

    :cond_4
    :try_start_0
    const-string v2, "key_response"

    .line 72
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 84
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_7

    .line 85
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v2, "openid"

    .line 86
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "access_token"

    .line 87
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "proxy_code"

    .line 88
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "proxy_expires_in"

    .line 89
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 90
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "--checkAuthJsonDataValid--openid and token not empty, setResult ACTIVITY_OK"

    .line 91
    invoke-static {v0, v2}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 93
    :cond_5
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    const-wide/16 v2, 0x0

    cmp-long v4, v6, v2

    if-eqz v4, :cond_6

    const-string v2, "--checkAuthJsonDataValid--proxy_code and proxy_expires_in are valid"

    .line 94
    invoke-static {v0, v2}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    :goto_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "key_action"

    const-string v2, "action_login"

    .line 54
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 55
    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 56
    invoke-static {}, Ll/ۡܶۘ;->֫()Ll/ۡܶۘ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, p2}, Ll/ۡܶۘ;->֫(Landroid/content/Intent;Ll/ۘ᩹ۘ;)V

    return-void

    :cond_6
    :try_start_1
    const-string p1, "--checkAuthJsonDataValid--openid or token is empty, setResult ACTIVITY_CANCEL"

    .line 97
    invoke-static {v0, p1}, Ll/ۡ᩸ۘ;->ܿ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    const-string v2, "--checkAuthJsonDataValid--parse response failed"

    .line 102
    invoke-static {v0, v2}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "--checkAuthJsonDataValid--parse response exception"

    .line 103
    invoke-static {v0, v2, p1}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    :goto_1
    const-string p1, "handleActionAuth resultOk but data is invalid"

    .line 49
    invoke-static {v0, p1}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    new-instance p1, Ll/᩵᩹ۘ;

    const-string v0, "\u65e0\u6cd5\u89e3\u6790\u56de\u8c03\u6570\u636e\uff1adata\u89e3\u6790\u5f02\u5e38"

    invoke-direct {p1, v1, v0, v0}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, p1}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    return-void
.end method
