.class public final Ll/ᩴ᩹ۘ;
.super Ljava/lang/Object;
.source "51RR"


# static fields
.field public static ۧ:Ll/ᩴ᩹ۘ;

.field public static ܽ:Z


# instance fields
.field public final ֫:Ll/۟۠ۘ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    invoke-static {p1}, Ll/۟۠ۘ;->֫(Landroid/content/Context;)Ll/۟۠ۘ;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴ᩹ۘ;->֫:Ll/۟۠ۘ;

    .line 86
    invoke-static {}, Ll/ۨܶۘ;->֫()Ll/ۨܶۘ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۨܶۘ;->֫(Landroid/content/Context;)V

    .line 87
    invoke-static {}, Ll/ۤ᩸ۘ;->ᩳ()Ll/ۤ᩸ۘ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۤ᩸ۘ;->֫(Landroid/content/Context;)V

    return-void
.end method

.method public static ֫(IILandroid/content/Intent;Ll/ۘ᩹ۘ;)V
    .locals 11

    const-string v0, ", resultcode = "

    const-string v1, ", data = null ? "

    const-string v2, "onActivityResultData() reqcode = "

    .line 0
    invoke-static {v2, p0, v0, v1, p1}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez p2, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 746
    :goto_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", listener = null ? "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "openSDK_LOG.Tencent"

    invoke-static {v3, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 748
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "requestCode"

    aput-object v5, v4, v1

    aput-object v0, v4, v2

    const-string v0, "resultCode"

    const/4 v2, 0x2

    aput-object v0, v4, v2

    const/4 v0, 0x3

    aput-object v3, v4, v0

    const-string v0, "onActivityResultData"

    invoke-static {v0, v4}, Ll/ᩴ᩹ۘ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 750
    invoke-static {}, Ll/ۡܶۘ;->֫()Ll/ۡܶۘ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "message"

    .line 187
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "onActivityResult req="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " res="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "openSDK_LOG.UIListenerManager"

    invoke-static {v4, v3}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    invoke-virtual {v0, p0}, Ll/ۡܶۘ;->֫(I)Ll/ۘ᩹ۘ;

    move-result-object v0

    if-nez v0, :cond_5

    if-eqz p3, :cond_4

    const/16 v0, 0x2b5d

    if-ne p0, v0, :cond_2

    const-string p0, "\u767b\u5f55\u7684\u63a5\u53e3\u56de\u8c03\u4e0d\u80fd\u91cd\u65b0\u6784\u5efa\uff0c\u6682\u65f6\u65e0\u6cd5\u63d0\u4f9b\uff0c\u5148\u8bb0\u5f55\u4e0b\u6765\u8fd9\u79cd\u60c5\u51b5\u662f\u5426\u5b58\u5728"

    .line 176
    invoke-static {v4, p0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    const/16 v0, 0x2b61

    if-ne p0, v0, :cond_3

    const-string p0, "Social Api \u7684\u63a5\u53e3\u56de\u8c03\u9700\u8981\u4f7f\u7528param\u6765\u91cd\u65b0\u6784\u5efa\uff0c\u6682\u65f6\u65e0\u6cd5\u63d0\u4f9b\uff0c\u5148\u8bb0\u5f55\u4e0b\u6765\u8fd9\u79cd\u60c5\u51b5\u662f\u5426\u5b58\u5728"

    .line 178
    invoke-static {v4, p0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    const/16 v0, 0x2b62

    if-ne p0, v0, :cond_6

    const-string p0, "Social Api \u7684H5\u63a5\u53e3\u56de\u8c03\u9700\u8981\u4f7f\u7528param\u6765\u91cd\u65b0\u6784\u5efa\uff0c\u6682\u65f6\u65e0\u6cd5\u63d0\u4f9b\uff0c\u5148\u8bb0\u5f55\u4e0b\u6765\u8fd9\u79cd\u60c5\u51b5\u662f\u5426\u5b58\u5728"

    .line 180
    invoke-static {v4, p0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    const-string p0, "onActivityResult can\'t find the listener"

    .line 195
    invoke-static {v4, p0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_5
    move-object p3, v0

    :cond_6
    :goto_2
    const/4 p0, -0x1

    if-ne p1, p0, :cond_17

    const/4 p0, -0x6

    if-nez p2, :cond_7

    .line 202
    new-instance p1, Ll/᩵᩹ۘ;

    const-string p2, "onActivityResult intent data is null."

    invoke-direct {p1, p0, p2, p2}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, p1}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    return-void

    :cond_7
    const-string p1, "key_action"

    .line 207
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "action_login"

    .line 209
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v3, "key_response"

    const-string v5, "key_error_detail"

    const-string v6, "key_error_msg"

    const-string v7, "key_error_code"

    const-string v8, "\u670d\u52a1\u5668\u8fd4\u56de\u6570\u636e\u683c\u5f0f\u6709\u8bef!"

    const/4 v9, -0x4

    if-eqz v0, :cond_b

    const-string p0, "key_auth_ignore_on_activity_result"

    .line 281
    invoke-virtual {p2, p0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_8

    const-string p0, "OpenUi, onActivityResult, ignoreOnActivityResult"

    .line 283
    invoke-static {v4, p0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_5

    .line 286
    :cond_8
    invoke-virtual {p2, v7, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p0

    if-eqz p0, :cond_9

    .line 288
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "OpenUi, onActivityResult, onError = "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    invoke-virtual {p2, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 290
    invoke-virtual {p2, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 291
    new-instance v0, Ll/᩵᩹ۘ;

    invoke-direct {v0, p0, p1, p2}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, v0}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    goto/16 :goto_5

    .line 295
    :cond_9
    invoke-virtual {p2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_a

    const-string p0, "OpenUi, onActivityResult, onComplete"

    .line 297
    invoke-static {v4, p0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    new-instance p0, Ll/᩵᩹ۘ;

    const-string p1, "response is null"

    invoke-direct {p0, v9, v8, p1}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, p0}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    goto/16 :goto_5

    .line 303
    :cond_a
    :try_start_0
    invoke-static {p0}, Ll/ᩳ᩹ۘ;->ᩳ(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 304
    invoke-interface {p3, p1}, Ll/ۘ᩹ۘ;->֫(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_5

    :catch_0
    move-exception p1

    .line 306
    new-instance p2, Ll/᩵᩹ۘ;

    invoke-direct {p2, v9, v8, p0}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, p2}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    const-string p0, "OpenUi, onActivityResult, json error"

    .line 308
    invoke-static {v4, p0, p1}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_5

    :cond_b
    const-string v0, "action_share"

    .line 211
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v10, "response"

    if-nez v0, :cond_12

    const-string v0, "action_request_avatar"

    .line 212
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    const-string v0, "action_request_dynamic_avatar"

    .line 213
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    const-string v0, "action_request_set_emotion"

    .line 214
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    const-string v0, "guildOpen"

    .line 215
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto/16 :goto_3

    :cond_c
    const-string p0, "action_common_channel"

    .line 231
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_f

    .line 233
    invoke-virtual {p2, v7, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p0

    if-nez p0, :cond_e

    .line 235
    invoke-virtual {p2, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_d

    .line 238
    :try_start_1
    invoke-virtual {p2, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 239
    invoke-static {p0}, Ll/ᩳ᩹ۘ;->ᩳ(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p2

    .line 240
    invoke-virtual {p2, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 241
    invoke-interface {p3, p2}, Ll/ۘ᩹ۘ;->֫(Lorg/json/JSONObject;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_5

    .line 243
    :catch_1
    new-instance p1, Ll/᩵᩹ۘ;

    invoke-direct {p1, v9, v8, p0}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, p1}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    goto/16 :goto_5

    .line 246
    :cond_d
    new-instance p0, Lorg/json/JSONObject;

    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    invoke-interface {p3, p0}, Ll/ۘ᩹ۘ;->֫(Lorg/json/JSONObject;)V

    goto/16 :goto_5

    .line 249
    :cond_e
    invoke-virtual {p2, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 250
    invoke-virtual {p2, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 251
    new-instance v0, Ll/᩵᩹ۘ;

    invoke-direct {v0, p0, p1, p2}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, v0}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    goto/16 :goto_5

    .line 254
    :cond_f
    invoke-virtual {p2, v7, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p0

    if-nez p0, :cond_11

    .line 256
    invoke-virtual {p2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_10

    .line 259
    :try_start_2
    invoke-static {p0}, Ll/ᩳ᩹ۘ;->ᩳ(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 260
    invoke-interface {p3, p1}, Ll/ۘ᩹ۘ;->֫(Lorg/json/JSONObject;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_5

    .line 262
    :catch_2
    new-instance p1, Ll/᩵᩹ۘ;

    invoke-direct {p1, v9, v8, p0}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, p1}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    goto/16 :goto_5

    .line 265
    :cond_10
    new-instance p0, Lorg/json/JSONObject;

    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    invoke-interface {p3, p0}, Ll/ۘ᩹ۘ;->֫(Lorg/json/JSONObject;)V

    goto :goto_5

    .line 268
    :cond_11
    invoke-virtual {p2, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 269
    invoke-virtual {p2, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 270
    new-instance v0, Ll/᩵᩹ۘ;

    invoke-direct {v0, p0, p1, p2}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, v0}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    goto :goto_5

    :cond_12
    :goto_3
    const-string p1, "result"

    .line 216
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 217
    invoke-virtual {p2, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "cancel"

    .line 219
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 220
    invoke-interface {p3}, Ll/ۘ᩹ۘ;->֫()V

    goto :goto_5

    :cond_13
    const-string v0, "error"

    .line 221
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_14

    .line 222
    new-instance p1, Ll/᩵᩹ۘ;

    const-string v0, "unknown error"

    .line 0
    invoke-static {p2, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 222
    invoke-direct {p1, p0, v0, p2}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, p1}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    goto :goto_5

    :cond_14
    const-string p0, "complete"

    .line 223
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_16

    .line 225
    :try_start_3
    new-instance p0, Lorg/json/JSONObject;

    if-nez p2, :cond_15

    const-string p1, "{\"ret\": 0}"

    goto :goto_4

    :cond_15
    move-object p1, p2

    :goto_4
    invoke-direct {p0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-interface {p3, p0}, Ll/ۘ᩹ۘ;->֫(Lorg/json/JSONObject;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_5

    :catch_3
    move-exception p0

    const-string p1, "JSONException"

    .line 227
    invoke-static {v4, p1, p0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 228
    new-instance p0, Ll/᩵᩹ۘ;

    const-string p1, "json error"

    .line 0
    invoke-static {p2, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 228
    invoke-direct {p0, v9, p1, p2}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, p0}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    :cond_16
    :goto_5
    return-void

    .line 274
    :cond_17
    invoke-interface {p3}, Ll/ۘ᩹ۘ;->֫()V

    return-void
.end method

.method public static varargs ֫(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 5

    .line 1105
    array-length v0, p1

    const-string v1, ""

    if-nez v0, :cond_0

    goto :goto_0

    .line 1109
    :cond_0
    array-length v0, p1

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    :goto_0
    move-object p1, v1

    goto :goto_2

    .line 1113
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1114
    array-length v2, p1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_3

    if-lez v3, :cond_2

    const/16 v4, 0x7c

    .line 1117
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1119
    :cond_2
    aget-object v4, p1, v3

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v4, 0x3a

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v3, 0x1

    aget-object v4, p1, v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x2

    goto :goto_1

    .line 1121
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1101
    :goto_2
    invoke-static {}, Ll/ۨܶۘ;->֫()Ll/ۨܶۘ;

    move-result-object v0

    .line 103
    invoke-virtual {v0, p0, p1, v1}, Ll/ۨܶۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static ֫(Landroid/content/Context;)Z
    .locals 7

    const-string v0, "checkManifestConfig exception"

    const-string v1, "openSDK_LOG.Tencent"

    const/4 v2, 0x0

    const/16 v3, 0x80

    .line 220
    :try_start_0
    new-instance v4, Landroid/content/ComponentName;

    .line 221
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "com.tencent.tauth.AuthActivity"

    invoke-direct {v4, v5, v6}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    .line 224
    invoke-virtual {v5, v4, v3}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v4

    .line 243
    invoke-static {v1, v0, v4}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 248
    :goto_0
    :try_start_1
    new-instance v4, Landroid/content/ComponentName;

    .line 249
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "com.tencent.connect.common.AssistActivity"

    invoke-direct {v4, v5, v6}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    .line 252
    invoke-virtual {p0, v4, v3}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    .line 266
    invoke-static {v1, v0, p0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    const/4 p0, 0x1

    return p0

    :catch_0
    const-string p0, "AndroidManifest.xml \u6ca1\u6709\u68c0\u6d4b\u5230com.tencent.connect.common.AssistActivity\n\u6ca1\u6709\u5728AndroidManifest.xml\u4e2d\u68c0\u6d4b\u5230com.tencent.connect.common.AssistActivity,\u8bf7\u52a0\u4e0acom.tencent.connect.common.AssistActivity,\u8be6\u7ec6\u4fe1\u606f\u8bf7\u67e5\u770b\u5b98\u7f51\u6587\u6863.\n\u914d\u7f6e\u793a\u4f8b\u5982\u4e0b: \n<activity\n     android:name=\"com.tencent.connect.common.AssistActivity\"\n     android:screenOrientation=\"behind\"\n     android:theme=\"@android:style/Theme.Translucent.NoTitleBar\"\n     android:configChanges=\"orientation|keyboardHidden\">\n</activity>"

    .line 261
    invoke-static {v1, p0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return v2

    :catch_1
    const-string p0, "AndroidManifest.xml \u6ca1\u6709\u68c0\u6d4b\u5230com.tencent.tauth.AuthActivity\u6ca1\u6709\u5728AndroidManifest.xml\u4e2d\u68c0\u6d4b\u5230com.tencent.tauth.AuthActivity,\u8bf7\u52a0\u4e0acom.tencent.tauth.AuthActivity,\u5e76\u914d\u7f6e<data android:scheme=\"tencent101492915\" />,\u8be6\u7ec6\u4fe1\u606f\u8bf7\u67e5\u770b\u5b98\u7f51\u6587\u6863.\n\u914d\u7f6e\u793a\u4f8b\u5982\u4e0b: \n<activity\n     android:name=\"com.tencent.tauth.AuthActivity\"\n     android:noHistory=\"true\"\n     android:launchMode=\"singleTask\">\n<intent-filter>\n    <action android:name=\"android.intent.action.VIEW\" />\n    <category android:name=\"android.intent.category.DEFAULT\" />\n    <category android:name=\"android.intent.category.BROWSABLE\" />\n    <data android:scheme=\"tencent101492915\" />\n</intent-filter>\n</activity>"

    .line 238
    invoke-static {v1, p0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return v2
.end method

.method public static declared-synchronized ۧ(Landroid/content/Context;)Ll/ᩴ᩹ۘ;
    .locals 7

    const-string v1, "101492915"

    .line 4
    const-class v0, Ll/ᩴ᩹ۘ;

    .line 5
    monitor-enter v0

    .line 160
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Ll/᩺ۤۡ;->֫(Landroid/content/Context;)V

    const-string v2, "openSDK_LOG.Tencent"

    const-string v3, "createInstance()  -- start, appId = 101492915"

    .line 161
    invoke-static {v2, v3}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const-string p0, "openSDK_LOG.Tencent"

    const-string v1, "appId should not be empty!"

    .line 163
    invoke-static {p0, v1}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 164
    monitor-exit v0

    return-object v3

    .line 166
    :cond_0
    :try_start_1
    sget-object v2, Ll/ᩴ᩹ۘ;->ۧ:Ll/ᩴ᩹ۘ;

    if-nez v2, :cond_1

    .line 167
    new-instance v2, Ll/ᩴ᩹ۘ;

    invoke-direct {v2, p0}, Ll/ᩴ᩹ۘ;-><init>(Landroid/content/Context;)V

    sput-object v2, Ll/ᩴ᩹ۘ;->ۧ:Ll/ᩴ᩹ۘ;

    goto :goto_0

    .line 762
    :cond_1
    iget-object v2, v2, Ll/ᩴ᩹ۘ;->֫:Ll/۟۠ۘ;

    invoke-virtual {v2}, Ll/۟۠ۘ;->֫()Ll/᩸۠ۘ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "101492915"

    const-string v4, "openSDK_LOG.Tencent"

    const-string v5, "getAppId() appid =101492915"

    .line 763
    invoke-static {v4, v5}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "getAppId"

    .line 1125
    invoke-static {}, Ll/ۨܶۘ;->֫()Ll/ۨܶۘ;

    move-result-object v5

    const-string v6, ""

    .line 107
    invoke-virtual {v5, v4, v6, v2}, Ll/ۨܶۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 175
    :goto_0
    invoke-static {p0}, Ll/ᩴ᩹ۘ;->֫(Landroid/content/Context;)Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_2

    .line 176
    monitor-exit v0

    return-object v3

    :cond_2
    :try_start_2
    const-string v2, "createInstance"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "appid"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    aput-object v1, v3, v4

    .line 179
    invoke-static {v2, v3}, Ll/ᩴ᩹ۘ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    invoke-static {p0, v1}, Ll/᩺᩸ۘ;->֫(Landroid/content/Context;Ljava/lang/String;)Ll/᩺᩸ۘ;

    move-result-object p0

    .line 183
    invoke-static {}, Ll/᩶ܶۘ;->֫()Ll/᩶ܶۘ;

    move-result-object v1

    invoke-virtual {v1, p0}, Ll/᩶ܶۘ;->֫(Ll/᩺᩸ۘ;)V

    const-string p0, "openSDK_LOG.Tencent"

    const-string v1, "createInstance()  -- end"

    .line 184
    invoke-static {p0, v1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    sget-object p0, Ll/ᩴ᩹ۘ;->ۧ:Ll/ᩴ᩹ۘ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0
.end method

.method public static ܽ()Z
    .locals 1

    .line 126
    sget-boolean v0, Ll/ᩴ᩹ۘ;->ܽ:Z

    if-eqz v0, :cond_1

    invoke-static {}, Ll/ۤ᩸ۘ;->ᩳ()Ll/ۤ᩸ۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۤ᩸ۘ;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public static ᩳ()V
    .locals 4

    const-string v0, "setIsPermissionGranted, isPermissionGranted: true"

    const-string v1, "openSDK_LOG.Tencent"

    .line 99
    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    invoke-static {}, Ll/ۤ᩸ۘ;->ᩳ()Ll/ۤ᩸ۘ;

    move-result-object v0

    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ۤ᩸ۘ;->֫(Landroid/content/Context;)V

    .line 102
    invoke-static {}, Ll/ۤ᩸ۘ;->ᩳ()Ll/ۤ᩸ۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۤ᩸ۘ;->ۧ()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 103
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 104
    :cond_0
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 111
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "setIsPermissionGranted, isPermissionGranted: true, model = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_2

    .line 113
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 114
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "setIsPermissionGranted error! model= ["

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "unknown"

    :cond_3
    const/4 v1, 0x1

    .line 120
    sput-boolean v1, Ll/ᩴ᩹ۘ;->ܽ:Z

    .line 122
    invoke-static {}, Ll/ۤ᩸ۘ;->ᩳ()Ll/ۤ᩸ۘ;

    move-result-object v1

    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ll/ۤ᩸ۘ;->֫(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;Ll/ۘ᩹ۘ;)V
    .locals 3

    const-string v0, "openSDK_LOG.Tencent"

    const-string v1, "login() with activity, scope is get_simple_userinfo"

    .line 357
    invoke-static {v0, v1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "scope"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "get_simple_userinfo"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "login_scope"

    .line 358
    invoke-static {v1, v0}, Ll/ᩴ᩹ۘ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    iget-object v0, p0, Ll/ᩴ᩹ۘ;->֫:Ll/۟۠ۘ;

    invoke-virtual {v0, p1, p2}, Ll/۟۠ۘ;->֫(Landroid/app/Activity;Ll/ۘ᩹ۘ;)I

    return-void
.end method

.method public final ֫()Z
    .locals 5

    .line 754
    iget-object v0, p0, Ll/ᩴ᩹ۘ;->֫:Ll/۟۠ۘ;

    invoke-virtual {v0}, Ll/۟۠ۘ;->ۧ()Z

    move-result v0

    .line 755
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "isSessionValid() isvalid ="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "openSDK_LOG.Tencent"

    invoke-static {v2, v1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 756
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 1125
    invoke-static {}, Ll/ۨܶۘ;->֫()Ll/ۨܶۘ;

    move-result-object v2

    const-string v3, ""

    const-string v4, "isSessionValid"

    .line 107
    invoke-virtual {v2, v4, v3, v1}, Ll/ۨܶۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return v0
.end method

.method public final ۧ()V
    .locals 4

    const-string v0, "openSDK_LOG.Tencent"

    const-string v1, "logout()"

    .line 546
    invoke-static {v0, v1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "logout"

    .line 547
    invoke-static {v1, v0}, Ll/ᩴ᩹ۘ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 549
    iget-object v0, p0, Ll/ᩴ᩹ۘ;->֫:Ll/۟۠ۘ;

    invoke-virtual {v0}, Ll/۟۠ۘ;->֫()Ll/᩸۠ۘ;

    move-result-object v1

    const-string v2, "0"

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Ll/᩸۠ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 550
    invoke-virtual {v0}, Ll/۟۠ۘ;->֫()Ll/᩸۠ۘ;

    move-result-object v1

    invoke-virtual {v1, v3}, Ll/᩸۠ۘ;->֫(Ljava/lang/String;)V

    .line 551
    invoke-virtual {v0}, Ll/۟۠ۘ;->֫()Ll/᩸۠ۘ;

    move-result-object v1

    invoke-virtual {v0}, Ll/۟۠ۘ;->֫()Ll/᩸۠ۘ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "101492915"

    invoke-static {v0}, Ll/᩸۠ۘ;->ܽ(Ljava/lang/String;)V

    return-void
.end method
