.class public Lcom/tencent/tauth/AuthActivity;
.super Landroid/app/Activity;
.source "51RR"


# static fields
.field public static ᩹:I


# instance fields
.field public final ᩸:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 61
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/tencent/tauth/AuthActivity;->᩸:Ljava/util/HashMap;

    return-void
.end method

.method private ֫()V
    .locals 6

    const-string v0, "onCreate exception: "

    .line 80
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "openSDK_LOG.AuthActivity"

    if-nez v1, :cond_0

    const-string v0, "-->onCreate, getIntent() return null"

    .line 82
    invoke-static {v2, v0}, Ll/ۡ᩸ۘ;->ܿ(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    return-void

    .line 89
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    .line 92
    invoke-static {v2, v0, v3}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v3, 0x0

    .line 95
    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "-->onCreate, uri: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    :try_start_1
    invoke-direct {p0, v1, v3}, Lcom/tencent/tauth/AuthActivity;->֫(Landroid/content/Intent;Landroid/net/Uri;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    .line 101
    invoke-static {v2, v0, v1}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 102
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    :goto_1
    return-void
.end method

.method private ֫(Landroid/content/Intent;Landroid/net/Uri;)V
    .locals 10

    const-string v0, "activityid"

    const-string v1, "-->handleActionUri--start"

    const-string v2, "openSDK_LOG.AuthActivity"

    .line 124
    invoke-static {v2, v1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_11

    .line 125
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_11

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, ""

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_2

    .line 130
    :cond_0
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "#"

    .line 131
    invoke-virtual {p2, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    const/4 v4, 0x1

    add-int/2addr v1, v4

    invoke-virtual {p2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    .line 133
    invoke-static {p2}, Ll/ᩳ᩹ۘ;->֫(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p2

    if-nez p2, :cond_1

    const-string p1, "-->handleActionUri, bundle is null"

    .line 135
    invoke-static {v2, p1}, Ll/ۡ᩸ۘ;->ܿ(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    return-void

    :cond_1
    const-string v1, "action"

    .line 140
    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 141
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "-->handleActionUri, action: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v1, :cond_2

    .line 144
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    return-void

    :cond_2
    const-string v5, "shareToQQ"

    .line 145
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const-string v6, "shareToQzone"

    const/4 v7, 0x0

    const/high16 v8, 0x24000000

    const-class v9, Lcom/tencent/connect/common/AssistActivity;

    if-nez v5, :cond_f

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_f

    const-string v5, "sendToMyComputer"

    .line 147
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_f

    const-string v5, "shareToTroopBar"

    .line 148
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto/16 :goto_1

    :cond_3
    const-string v5, "addToQQFavorites"

    .line 172
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 173
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    .line 174
    invoke-virtual {p1, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const-string p2, "key_action"

    const-string v0, "action_share"

    .line 175
    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 177
    invoke-static {}, Ll/ۡܶۘ;->֫()Ll/ۡܶۘ;

    move-result-object p2

    invoke-virtual {p2, v1}, Ll/ۡܶۘ;->֫(Ljava/lang/String;)Ll/ۘ᩹ۘ;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 179
    invoke-static {}, Ll/ۡܶۘ;->֫()Ll/ۡܶۘ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p2}, Ll/ۡܶۘ;->֫(Landroid/content/Intent;Ll/ۘ᩹ۘ;)V

    .line 181
    :cond_4
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    return-void

    :cond_5
    const-string v5, "sharePrize"

    .line 182
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 183
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    const-string v1, "response"

    .line 185
    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 189
    :try_start_0
    invoke-static {p2}, Ll/ᩳ᩹ۘ;->ᩳ(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p2

    .line 190
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    const-string v1, "sharePrize parseJson has exception."

    .line 192
    invoke-static {v2, v1, p2}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 195
    :goto_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_6

    .line 196
    invoke-virtual {p1, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 197
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 198
    invoke-virtual {p2, v0, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    invoke-virtual {p1, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 201
    :cond_6
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 202
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    return-void

    :cond_7
    const-string v0, "sdkSetAvatar"

    .line 203
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v3, "key_request_code"

    const-string v4, "stay_back_stack"

    if-eqz v0, :cond_8

    .line 205
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    .line 206
    invoke-virtual {p1, v4, v7}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    .line 207
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p0, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 v1, 0x277c

    .line 208
    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 209
    invoke-virtual {v0, v4, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 210
    invoke-virtual {v0, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 211
    invoke-virtual {v0, v8}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 212
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 213
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    return-void

    :cond_8
    const-string v0, "sdkSetDynamicAvatar"

    .line 214
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 215
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    .line 216
    invoke-virtual {p1, v4, v7}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    .line 217
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p0, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 v1, 0x277e

    .line 218
    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 219
    invoke-virtual {v0, v4, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 220
    invoke-virtual {v0, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 221
    invoke-virtual {v0, v8}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 222
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 223
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    return-void

    :cond_9
    const-string v0, "sdkSetEmotion"

    .line 224
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 225
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    .line 226
    invoke-virtual {p1, v4, v7}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    .line 227
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p0, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 v1, 0x277d

    .line 228
    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 229
    invoke-virtual {v0, v4, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 230
    invoke-virtual {v0, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 231
    invoke-virtual {v0, v8}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 232
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 233
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    return-void

    :cond_a
    const-string v0, "bindGroup"

    .line 234
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    const-string p1, "-->handleActionUri--bind group callback."

    .line 235
    invoke-static {v2, p1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    .line 237
    invoke-virtual {p1, v4, v7}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    .line 238
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p0, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 v1, 0x2780

    .line 239
    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 240
    invoke-virtual {v0, v4, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 241
    invoke-virtual {v0, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 242
    invoke-virtual {v0, v8}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 243
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 244
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    return-void

    :cond_b
    const-string v0, "joinGroup"

    .line 245
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    const-string p1, "-->handleActionUri--join group callback. "

    .line 246
    invoke-static {v2, p1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    .line 248
    invoke-virtual {p1, v4, v7}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    .line 249
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p0, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 v1, 0x277f

    .line 250
    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 251
    invoke-virtual {v0, v4, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 252
    invoke-virtual {v0, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 253
    invoke-virtual {v0, v8}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 254
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 255
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    return-void

    :cond_c
    const-string v0, "guildOpen"

    .line 256
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 258
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1, p0, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 259
    invoke-virtual {p1, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/16 p2, 0x2781

    .line 260
    invoke-virtual {p1, v3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 261
    invoke-virtual {p1, v8}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 262
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 263
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    return-void

    .line 265
    :cond_d
    iget-object v0, p0, Lcom/tencent/tauth/AuthActivity;->᩸:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡᩹ۘ;

    .line 266
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "actionHandler: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_e

    .line 268
    invoke-interface {v0, p1, p2}, Ll/֡᩹ۘ;->֫(Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 270
    :cond_e
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    return-void

    .line 153
    :cond_f
    :goto_1
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_10

    const-string p1, "com.tencent.mobileqq"

    .line 154
    invoke-static {p0, p1}, Ll/۟᩸ۘ;->֫(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_10

    const-string v0, "5.2.0"

    .line 491
    invoke-static {p0, p1}, Ll/۟᩸ۘ;->֫(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 492
    invoke-static {p1, v0}, Ll/۟᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    if-gez p1, :cond_10

    .line 157
    sget p1, Lcom/tencent/tauth/AuthActivity;->᩹:I

    add-int/2addr p1, v4

    sput p1, Lcom/tencent/tauth/AuthActivity;->᩹:I

    const/4 v0, 0x2

    if-ne p1, v0, :cond_10

    .line 159
    sput v7, Lcom/tencent/tauth/AuthActivity;->᩹:I

    .line 160
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    return-void

    :cond_10
    const-string p1, "-->handleActionUri, most share action, start assistactivity"

    .line 165
    invoke-static {v2, p1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1, p0, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 168
    invoke-virtual {p1, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 169
    invoke-virtual {p1, v8}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 170
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 171
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    return-void

    :cond_11
    :goto_2
    const-string p1, "-->handleActionUri, uri invalid"

    .line 126
    invoke-static {v2, p1}, Ll/ۡ᩸ۘ;->ܿ(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    invoke-virtual {p0}, Lcom/tencent/tauth/AuthActivity;->finish()V

    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 3

    .line 278
    :try_start_0
    invoke-super {p0}, Landroid/app/Activity;->finish()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "openSDK_LOG.AuthActivity"

    const-string v2, "activity finish exception: "

    .line 280
    invoke-static {v1, v2, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 65
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const-string p1, "openSDK_LOG.AuthActivity"

    const-string v0, "->onCreate"

    .line 66
    invoke-static {p1, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    new-instance p1, Ll/ܺ᩹ۘ;

    invoke-direct {p1, p0}, Ll/ܺ᩹ۘ;-><init>(Lcom/tencent/tauth/AuthActivity;)V

    iget-object v0, p0, Lcom/tencent/tauth/AuthActivity;->᩸:Ljava/util/HashMap;

    const-string v1, "action_common_channel"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    new-instance p1, Ll/ۚ᩹ۘ;

    .line 0
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const-string v1, "action_auth"

    .line 120
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    invoke-direct {p0}, Lcom/tencent/tauth/AuthActivity;->֫()V

    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .line 74
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    const-string p1, "openSDK_LOG.AuthActivity"

    const-string v0, "->onNewIntent"

    .line 75
    invoke-static {p1, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    invoke-direct {p0}, Lcom/tencent/tauth/AuthActivity;->֫()V

    return-void
.end method
