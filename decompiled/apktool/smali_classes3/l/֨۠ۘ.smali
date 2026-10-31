.class public final Ll/֨۠ۘ;
.super Ll/ۖ᩹ۘ;
.source "51RR"


# instance fields
.field public final synthetic ֫:Ll/۠۠ۘ;

.field public final ۧ:Ll/ۘ᩹ۘ;

.field public final ܽ:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ll/۠۠ۘ;Landroid/content/Context;Ll/ۘ᩹ۘ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 151
    iput-object p1, p0, Ll/֨۠ۘ;->֫:Ll/۠۠ۘ;

    .line 152
    iput-object p2, p0, Ll/֨۠ۘ;->ܽ:Landroid/content/Context;

    .line 153
    iput-object p3, p0, Ll/֨۠ۘ;->ۧ:Ll/ۘ᩹ۘ;

    const-string p1, "openSDK_LOG.AuthAgent"

    const-string p2, "OpenUi, TokenListener()"

    .line 155
    invoke-static {p1, p2}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const-string v0, "openSDK_LOG.AuthAgent"

    const-string v1, "OpenUi, TokenListener() onCancel"

    .line 213
    invoke-static {v0, v1}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    iget-object v0, p0, Ll/֨۠ۘ;->ۧ:Ll/ۘ᩹ۘ;

    invoke-interface {v0}, Ll/ۘ᩹ۘ;->֫()V

    .line 215
    invoke-static {}, Ll/ۡ᩸ۘ;->ۧ()V

    return-void
.end method

.method public final ֫(Ll/᩵᩹ۘ;)V
    .locals 2

    const-string v0, "openSDK_LOG.AuthAgent"

    const-string v1, "OpenUi, TokenListener() onError"

    .line 206
    invoke-static {v0, v1}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    iget-object v0, p0, Ll/֨۠ۘ;->ۧ:Ll/ۘ᩹ۘ;

    invoke-interface {v0, p1}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    .line 208
    invoke-static {}, Ll/ۡ᩸ۘ;->ۧ()V

    return-void
.end method

.method public final ֫(Lorg/json/JSONObject;)V
    .locals 9

    const-string v0, "OpenUi, TokenListener() onComplete error"

    const-string v1, "pf"

    .line 160
    iget-object v2, p0, Ll/֨۠ۘ;->֫:Ll/۠۠ۘ;

    const-string v3, "OpenUi, TokenListener() onComplete"

    const-string v4, "openSDK_LOG.AuthAgent"

    invoke-static {v4, v3}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    const-string v3, "access_token"

    .line 163
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "expires_in"

    .line 164
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "openid"

    .line 165
    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 166
    iget-object v7, p0, Ll/֨۠ۘ;->ܽ:Landroid/content/Context;

    if-eqz v3, :cond_0

    :try_start_1
    invoke-static {v2}, Ll/۠۠ۘ;->֫(Ll/۠۠ۘ;)Ll/᩸۠ۘ;

    if-eqz v6, :cond_0

    .line 173
    invoke-static {v2}, Ll/۠۠ۘ;->ۧ(Ll/۠۠ۘ;)Ll/᩸۠ۘ;

    move-result-object v8

    invoke-virtual {v8, v3, v5}, Ll/᩸۠ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    invoke-static {v2}, Ll/۠۠ۘ;->ܽ(Ll/۠۠ۘ;)Ll/᩸۠ۘ;

    move-result-object v3

    invoke-virtual {v3, v6}, Ll/᩸۠ۘ;->֫(Ljava/lang/String;)V

    .line 175
    invoke-static {v2}, Ll/۠۠ۘ;->ᩳ(Ll/۠۠ۘ;)Ll/᩸۠ۘ;

    move-result-object v3

    invoke-static {v7, v3}, Ll/ۡ۠ۘ;->ܽ(Landroid/content/Context;Ll/᩸۠ۘ;)V

    .line 180
    :cond_0
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    if-eqz v3, :cond_1

    :try_start_2
    const-string v5, "pfStore"

    const/4 v6, 0x0

    .line 183
    invoke-virtual {v7, v5, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v5

    .line 185
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    invoke-interface {v5, v1, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 188
    :try_start_3
    invoke-static {v4, v0, v1}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 193
    :cond_1
    :goto_0
    invoke-static {}, Landroid/webkit/CookieSyncManager;->getInstance()Landroid/webkit/CookieSyncManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/webkit/CookieSyncManager;->sync()V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    .line 197
    invoke-static {v4, v0, v1}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 199
    :goto_1
    iget-object v0, p0, Ll/֨۠ۘ;->ۧ:Ll/ۘ᩹ۘ;

    invoke-interface {v0, p1}, Ll/ۘ᩹ۘ;->֫(Lorg/json/JSONObject;)V

    .line 200
    invoke-virtual {v2}, Ll/۠۠ۘ;->ܽ()V

    .line 201
    invoke-static {}, Ll/ۡ᩸ۘ;->ۧ()V

    return-void
.end method
