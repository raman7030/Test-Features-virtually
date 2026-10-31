.class public final Ll/ۡܶۘ;
.super Ljava/lang/Object;
.source "51RR"


# static fields
.field public static ۧ:Ll/ۡܶۘ;


# instance fields
.field public ֫:Ljava/util/Map;


# direct methods
.method public static ֫()Ll/ۡܶۘ;
    .locals 2

    .line 28
    sget-object v0, Ll/ۡܶۘ;->ۧ:Ll/ۡܶۘ;

    if-nez v0, :cond_1

    .line 29
    new-instance v0, Ll/ۡܶۘ;

    .line 35
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 313
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-static {v1}, Ll/᩶۬ᩴ;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, v0, Ll/ۡܶۘ;->֫:Ljava/util/Map;

    if-nez v1, :cond_0

    .line 37
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-static {v1}, Ll/᩶۬ᩴ;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, v0, Ll/ۡܶۘ;->֫:Ljava/util/Map;

    .line 29
    :cond_0
    sput-object v0, Ll/ۡܶۘ;->ۧ:Ll/ۡܶۘ;

    .line 32
    :cond_1
    sget-object v0, Ll/ۡܶۘ;->ۧ:Ll/ۡܶۘ;

    return-object v0
.end method

.method public static ֫(Landroid/content/Intent;Ll/ۘ᩹ۘ;)V
    .locals 5

    const-string v0, "handleDataToListener"

    const-string v1, "openSDK_LOG.UIListenerManager"

    .line 115
    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "key_action"

    .line 123
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "action_login"

    .line 125
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, -0x4

    const-string v4, ""

    if-eqz v2, :cond_2

    const-string v0, "key_error_code"

    const/4 v2, 0x0

    .line 126
    invoke-virtual {p0, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "key_response"

    .line 128
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 131
    :try_start_0
    invoke-static {p0}, Ll/ᩳ᩹ۘ;->ᩳ(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 132
    invoke-interface {p1, v0}, Ll/ۘ᩹ۘ;->֫(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    :catch_0
    move-exception v0

    .line 134
    new-instance v2, Ll/᩵᩹ۘ;

    const-string v4, "\u670d\u52a1\u5668\u8fd4\u56de\u6570\u636e\u683c\u5f0f\u6709\u8bef!"

    invoke-direct {v2, v3, v4, p0}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v2}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    const-string p0, "OpenUi, onActivityResult, json error"

    .line 136
    invoke-static {v1, p0, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_1

    :cond_0
    const-string p0, "OpenUi, onActivityResult, onComplete"

    .line 140
    invoke-static {v1, p0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    new-instance p0, Lorg/json/JSONObject;

    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    invoke-interface {p1, p0}, Ll/ۘ᩹ۘ;->֫(Lorg/json/JSONObject;)V

    goto/16 :goto_1

    .line 145
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "OpenUi, onActivityResult, onError = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "key_error_msg"

    .line 146
    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "key_error_detail"

    .line 147
    invoke-virtual {p0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 148
    new-instance v2, Ll/᩵᩹ۘ;

    invoke-direct {v2, v0, v1, p0}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v2}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    goto :goto_1

    :cond_2
    const-string v1, "action_share"

    .line 150
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "result"

    .line 151
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "response"

    .line 152
    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "cancel"

    .line 154
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 155
    invoke-interface {p1}, Ll/ۘ᩹ۘ;->֫()V

    return-void

    :cond_3
    const-string v1, "error"

    .line 156
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 157
    new-instance v0, Ll/᩵᩹ۘ;

    const-string v1, "unknown error"

    .line 0
    invoke-static {p0, v4}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v2, -0x6

    .line 157
    invoke-direct {v0, v2, v1, p0}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    return-void

    :cond_4
    const-string v1, "complete"

    .line 159
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 161
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    if-nez p0, :cond_5

    const-string v1, "{\"ret\": 0}"

    goto :goto_0

    :cond_5
    move-object v1, p0

    :goto_0
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 162
    invoke-interface {p1, v0}, Ll/ۘ᩹ۘ;->֫(Lorg/json/JSONObject;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    .line 165
    :catch_1
    new-instance v0, Ll/᩵᩹ۘ;

    const-string v1, "json error"

    .line 0
    invoke-static {p0, v4}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 165
    invoke-direct {v0, v3, v1, p0}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    :cond_6
    :goto_1
    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/ۘ᩹ۘ;
    .locals 2

    .line 80
    invoke-static {p1}, Ll/۟᩸ۘ;->֫(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getListner action is null! rquestCode="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "openSDK_LOG.UIListenerManager"

    invoke-static {v0, p1}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    .line 87
    :cond_0
    invoke-virtual {p0, v0}, Ll/ۡܶۘ;->֫(Ljava/lang/String;)Ll/ۘ᩹ۘ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)Ll/ۘ᩹ۘ;
    .locals 4

    const/4 v1, 0x0

    if-nez p1, :cond_0

    const-string p1, "openSDK_LOG.UIListenerManager"

    const-string v0, "getListnerWithAction action is null!"

    .line 92
    invoke-static {p1, v0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 97
    :cond_0
    iget-object v0, p0, Ll/ۡܶۘ;->֫:Ljava/util/Map;

    monitor-enter v0

    .line 98
    :try_start_0
    iget-object v2, p0, Ll/ۡܶۘ;->֫:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢܶۘ;

    .line 99
    iget-object v3, p0, Ll/ۡܶۘ;->֫:Ljava/util/Map;

    invoke-interface {v3, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    return-object v1

    .line 104
    :cond_1
    iget-object p1, v2, Ll/ۢܶۘ;->֫:Ll/ۘ᩹ۘ;

    return-object p1

    :catchall_0
    move-exception p1

    .line 100
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ۘ᩹ۘ;)V
    .locals 4

    const/16 v0, 0x2b5d

    .line 42
    invoke-static {v0}, Ll/۟᩸ۘ;->֫(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string p1, "openSDK_LOG.UIListenerManager"

    const-string v0, "setListener action is null! rquestCode=11101"

    .line 44
    invoke-static {p1, v0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 49
    :cond_0
    iget-object v0, p0, Ll/ۡܶۘ;->֫:Ljava/util/Map;

    monitor-enter v0

    .line 50
    :try_start_0
    iget-object v2, p0, Ll/ۡܶۘ;->֫:Ljava/util/Map;

    new-instance v3, Ll/ۢܶۘ;

    .line 316
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 318
    iput-object p1, v3, Ll/ۢܶۘ;->֫:Ll/ۘ᩹ۘ;

    .line 50
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۢܶۘ;

    .line 51
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
