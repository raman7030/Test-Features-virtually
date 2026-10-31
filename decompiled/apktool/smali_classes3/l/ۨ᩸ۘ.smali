.class public final Ll/ۨ᩸ۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ljava/util/HashMap;

.field public final synthetic ᩹:Ll/᩺᩸ۘ;


# direct methods
.method public constructor <init>(Ll/᩺᩸ۘ;Ljava/util/HashMap;)V
    .locals 0

    .line 194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨ᩸ۘ;->᩹:Ll/᩺᩸ۘ;

    iput-object p2, p0, Ll/ۨ᩸ۘ;->᩸:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 198
    iget-object v0, p0, Ll/ۨ᩸ۘ;->᩹:Ll/᩺᩸ۘ;

    const-string v1, "openSDK_LOG.OpenConfig"

    const-string v2, "update: get config statusCode "

    :try_start_0
    invoke-static {}, Ll/᩶ܶۘ;->֫()Ll/᩶ܶۘ;

    move-result-object v3

    const-string v4, "https://cgi.connect.qq.com/qqconnectopen/openapi/policy_conf"

    iget-object v5, p0, Ll/ۨ᩸ۘ;->᩸:Ljava/util/HashMap;

    invoke-virtual {v3, v5, v4}, Ll/᩶ܶۘ;->֫(Ljava/util/HashMap;Ljava/lang/String;)Ll/ۙܶۘ;

    move-result-object v3

    .line 199
    invoke-interface {v3}, Ll/ۙܶۘ;->a()Ljava/lang/String;

    move-result-object v4

    .line 200
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v3}, Ll/ۙܶۘ;->d()I

    move-result v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    invoke-static {v4}, Ll/ᩳ᩹ۘ;->ᩳ(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 202
    invoke-static {v0, v2}, Ll/᩺᩸ۘ;->֫(Ll/᩺᩸ۘ;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "get config error "

    .line 204
    invoke-static {v1, v3, v2}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 206
    :goto_0
    invoke-static {v0}, Ll/᩺᩸ۘ;->֫(Ll/᩺᩸ۘ;)V

    return-void
.end method
