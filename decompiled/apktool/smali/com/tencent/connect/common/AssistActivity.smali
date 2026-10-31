.class public Lcom/tencent/connect/common/AssistActivity;
.super Landroid/app/Activity;
.source "51RR"


# instance fields
.field public ۗ:Ljava/lang/String;

.field public ۙ:Z

.field public ۤ:Ll/֫ܶۘ;

.field public ۫:Z

.field public ۬:Ll/ܳܶۘ;

.field public final ᩶:Ljava/lang/String;

.field public ᩸:Z

.field public ᩹:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 38
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "openSDK_LOG.AssistActivity_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->᩶:Ljava/lang/String;

    const/4 v0, 0x0

    .line 45
    iput-boolean v0, p0, Lcom/tencent/connect/common/AssistActivity;->ۙ:Z

    .line 53
    iput-boolean v0, p0, Lcom/tencent/connect/common/AssistActivity;->᩸:Z

    .line 59
    new-instance v0, Ll/֫ܶۘ;

    invoke-direct {v0}, Ll/֫ܶۘ;-><init>()V

    iput-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->ۤ:Ll/֫ܶۘ;

    .line 66
    new-instance v0, Ll/ܽܶۘ;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ll/ܽܶۘ;-><init>(Lcom/tencent/connect/common/AssistActivity;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->᩹:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic ֫(Lcom/tencent/connect/common/AssistActivity;)Ljava/lang/String;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/tencent/connect/common/AssistActivity;->᩶:Ljava/lang/String;

    return-object p0
.end method

.method private ֫(Landroid/content/Intent;Z)V
    .locals 2

    .line 218
    sget-object v0, Ll/ۜܶۘ;->ۧ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    const-string p2, "0"

    goto :goto_0

    :cond_0
    const-string p2, "1"

    :goto_0
    const-string v1, "result"

    .line 734
    invoke-virtual {v0, v1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    sget-object p2, Ll/ۜܶۘ;->ܽ:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    .line 222
    invoke-static {}, Ll/ᩳ᩸ۘ;->ۧ()Ll/ᩳ᩸ۘ;

    move-result-object p2

    iget-object v1, p0, Lcom/tencent/connect/common/AssistActivity;->ۗ:Ljava/lang/String;

    invoke-virtual {p2, v0, v1, p1}, Ll/ᩳ᩸ۘ;->֫(Landroid/os/Bundle;Ljava/lang/String;Z)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 8

    const-string v0, " | resultCode: "

    const-string v1, "data = null ? "

    const-string v2, "--onActivityResult--requestCode: "

    .line 0
    invoke-static {v2, p1, v0, v1, p2}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    if-nez p3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 412
    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/tencent/connect/common/AssistActivity;->᩶:Ljava/lang/String;

    invoke-static {v2, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 414
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    if-nez p1, :cond_1

    goto/16 :goto_3

    .line 418
    :cond_1
    invoke-static {p0}, Ll/ۧܶۘ;->֫(Lcom/tencent/connect/common/AssistActivity;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 419
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "onActivityResult callPack: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getCallingPackage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 420
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_2
    if-eqz p3, :cond_3

    const-string p2, "key_action"

    const-string v0, "action_login"

    .line 425
    invoke-virtual {p3, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_3
    if-nez p3, :cond_4

    const/4 p2, 0x0

    goto :goto_1

    .line 428
    :cond_4
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    :goto_1
    const-string p3, ""

    if-nez p2, :cond_5

    const-string p2, "--setResultData--bundle is null, setResult ACTIVITY_CANCEL"

    .line 455
    invoke-static {v2, p2}, Ll/ۡ᩸ۘ;->ܿ(Ljava/lang/String;Ljava/lang/String;)V

    .line 456
    invoke-virtual {p0, v1}, Landroid/app/Activity;->setResult(I)V

    const/16 p2, 0x2b5d

    if-ne p1, p2, :cond_9

    .line 459
    invoke-static {}, Ll/۟ܶۘ;->֫()Ll/۟ܶۘ;

    move-result-object p1

    iget-object p2, p0, Lcom/tencent/connect/common/AssistActivity;->ۗ:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "2"

    invoke-static {p3, p2, p1}, Ll/۟ܶۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_5
    :try_start_0
    const-string p1, "key_response"

    .line 467
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "--setResultDataForLogin-- "

    .line 468
    invoke-static {v2, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 469
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 470
    invoke-virtual {v0, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 472
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    const/4 v3, -0x1

    if-nez p2, :cond_8

    .line 473
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "openid"

    .line 474
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v4, "access_token"

    .line 475
    invoke-virtual {p2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "proxy_code"

    .line 476
    invoke-virtual {p2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "proxy_expires_in"

    .line 477
    invoke-virtual {p2, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 480
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_6

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_6

    const-string p2, "--setResultData--openid and token not empty, setResult ACTIVITY_OK"

    .line 481
    invoke-static {v2, p2}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 482
    invoke-virtual {p0, v3, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 484
    invoke-static {}, Ll/۟ܶۘ;->֫()Ll/۟ܶۘ;

    move-result-object p2

    iget-object p3, p0, Lcom/tencent/connect/common/AssistActivity;->ۗ:Ljava/lang/String;

    const-string v0, "0"

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p3, v0}, Ll/۟ܶۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 486
    :cond_6
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_7

    const-wide/16 p1, 0x0

    cmp-long v4, v6, p1

    if-eqz v4, :cond_7

    const-string p1, "--setResultData--proxy_code and proxy_expires_in are valid"

    .line 487
    invoke-static {v2, p1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 488
    invoke-virtual {p0, v3, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    goto :goto_2

    :cond_7
    const-string p1, "--setResultData--openid or token is empty, setResult ACTIVITY_CANCEL"

    .line 490
    invoke-static {v2, p1}, Ll/ۡ᩸ۘ;->ܿ(Ljava/lang/String;Ljava/lang/String;)V

    .line 491
    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 493
    invoke-static {}, Ll/۟ܶۘ;->֫()Ll/۟ܶۘ;

    move-result-object p1

    iget-object p2, p0, Lcom/tencent/connect/common/AssistActivity;->ۗ:Ljava/lang/String;

    const-string v0, "1"

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3, p2, v0}, Ll/۟ܶۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_8
    const-string p1, "--setResultData--response is empty, setResult ACTIVITY_OK"

    .line 507
    invoke-static {v2, p1}, Ll/ۡ᩸ۘ;->ܿ(Ljava/lang/String;Ljava/lang/String;)V

    .line 509
    invoke-virtual {p0, v3, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    const-string p2, "--setResultData--parse response failed"

    .line 512
    invoke-static {v2, p2}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "--setResultData--parse response exception"

    .line 513
    invoke-static {v2, p2, p1}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 430
    :cond_9
    :goto_2
    iget-boolean p1, p0, Lcom/tencent/connect/common/AssistActivity;->۫:Z

    if-nez p1, :cond_a

    const-string p1, "onActivityResult finish immediate"

    .line 431
    invoke-static {v2, p1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_3

    .line 434
    :cond_a
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p2, Ll/ܿܶۘ;

    invoke-direct {p2, p0}, Ll/ܿܶۘ;-><init>(Lcom/tencent/connect/common/AssistActivity;)V

    const-wide/16 v0, 0xc8

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_3
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 29

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    const-string v9, "--onCreate--startActException"

    const-string v10, "--onCreate--startActivity exception, ActivityNotFoundException : "

    const-string v11, "--onCreate--startActivity exception: "

    .line 82
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/high16 v2, 0x4000000

    invoke-virtual {v1, v2}, Landroid/view/Window;->addFlags(I)V

    const/4 v12, 0x1

    .line 83
    invoke-virtual {v8, v12}, Landroid/app/Activity;->requestWindowFeature(I)Z

    .line 84
    invoke-static/range {p0 .. p0}, Ll/᩶᩸ۘ;->֫(Lcom/tencent/connect/common/AssistActivity;)V

    .line 85
    invoke-super/range {p0 .. p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 86
    iget-object v1, v8, Lcom/tencent/connect/common/AssistActivity;->ۤ:Ll/֫ܶۘ;

    const/4 v13, 0x0

    invoke-virtual {v1, v13}, Ll/֫ܶۘ;->֫(I)V

    .line 88
    invoke-static/range {p0 .. p0}, Ll/ۧܶۘ;->֫(Lcom/tencent/connect/common/AssistActivity;)Z

    move-result v1

    iget-object v14, v8, Lcom/tencent/connect/common/AssistActivity;->᩶:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 89
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getCallingPackage()Ljava/lang/String;

    move-result-object v0

    .line 90
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "--onCreate-- callPack: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 95
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    sget-object v2, Ll/ۜܶۘ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v1, v2, v13}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v8, Lcom/tencent/connect/common/AssistActivity;->۫:Z

    .line 96
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "--onCreate-- mRestoreLandscape="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, v8, Lcom/tencent/connect/common/AssistActivity;->۫:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v14, v1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, "-->onCreate--getIntent() returns null"

    .line 98
    invoke-static {v14, v1}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->finish()V

    .line 102
    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "openSDK_LOG.AssistActivity.ExtraIntent"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Landroid/content/Intent;

    if-nez v15, :cond_2

    const/4 v1, 0x0

    const/4 v7, 0x0

    goto :goto_0

    :cond_2
    const-string v1, "key_request_code"

    .line 105
    invoke-virtual {v15, v1, v13}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    move v7, v1

    :goto_0
    const-string v6, ""

    if-nez v15, :cond_3

    move-object v1, v6

    goto :goto_1

    :cond_3
    const-string v1, "appid"

    .line 106
    invoke-virtual {v15, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_1
    iput-object v1, v8, Lcom/tencent/connect/common/AssistActivity;->ۗ:Ljava/lang/String;

    .line 108
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "h5_share_data"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v0, :cond_4

    const-string v2, "RESTART_FLAG"

    .line 111
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, v8, Lcom/tencent/connect/common/AssistActivity;->ۙ:Z

    const-string v2, "RESUME_FLAG"

    .line 112
    invoke-virtual {v0, v2, v13}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, v8, Lcom/tencent/connect/common/AssistActivity;->᩸:Z

    .line 114
    :cond_4
    iget-boolean v0, v8, Lcom/tencent/connect/common/AssistActivity;->ۙ:Z

    if-nez v0, :cond_13

    if-nez v1, :cond_e

    .line 118
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "key_extra_pending_intent"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/app/PendingIntent;

    if-eqz v15, :cond_b

    if-eqz v1, :cond_b

    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "--onCreate--activityIntent not null, will start activity, reqcode = "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "com.tencent.tauth.opensdk.SHARE_SUCCESS_AND_STAY_QQ_"

    .line 178
    :try_start_0
    invoke-virtual {v15}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "share_id"

    .line 182
    invoke-virtual {v2, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 183
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 184
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 185
    iget-object v0, v8, Lcom/tencent/connect/common/AssistActivity;->۬:Ll/ܳܶۘ;

    if-nez v0, :cond_6

    .line 186
    new-instance v0, Ll/ܳܶۘ;

    invoke-direct {v0, v8}, Ll/ܳܶۘ;-><init>(Lcom/tencent/connect/common/AssistActivity;)V

    iput-object v0, v8, Lcom/tencent/connect/common/AssistActivity;->۬:Ll/ܳܶۘ;

    .line 188
    :cond_6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x21

    if-lt v0, v3, :cond_7

    .line 189
    iget-object v0, v8, Lcom/tencent/connect/common/AssistActivity;->۬:Ll/ܳܶۘ;

    const/4 v3, 0x2

    invoke-virtual {v8, v0, v2, v3}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    goto :goto_2

    .line 191
    :cond_7
    iget-object v0, v8, Lcom/tencent/connect/common/AssistActivity;->۬:Ll/ܳܶۘ;

    invoke-virtual {v8, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const-string v2, "registerReceiver exception: "

    .line 194
    invoke-static {v14, v2, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 125
    :goto_2
    :try_start_1
    invoke-virtual {v1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v2

    const-string v0, "for_result"

    .line 126
    invoke-virtual {v15, v0, v12}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_8

    const/4 v0, 0x0

    const/16 v16, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move v3, v7

    move-object v13, v6

    move v6, v0

    move/from16 v17, v7

    move/from16 v7, v16

    .line 127
    :try_start_2
    invoke-virtual/range {v1 .. v7}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_4

    :catch_2
    move-exception v0

    goto :goto_5

    :cond_8
    move-object v13, v6

    move/from16 v17, v7

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p0

    .line 129
    invoke-virtual/range {v1 .. v6}, Landroid/content/Context;->startIntentSender(Landroid/content/IntentSender;Landroid/content/Intent;III)V

    .line 131
    :goto_3
    invoke-direct {v8, v15, v12}, Lcom/tencent/connect/common/AssistActivity;->֫(Landroid/content/Intent;Z)V
    :try_end_2
    .catch Landroid/content/ActivityNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_e

    :catchall_0
    move-exception v0

    goto :goto_6

    .line 148
    :goto_4
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 149
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 152
    invoke-static {v14, v9}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->finish()V

    goto/16 :goto_e

    :catchall_1
    move-exception v0

    goto :goto_7

    :catch_3
    move-exception v0

    move-object v13, v6

    move/from16 v17, v7

    .line 134
    :goto_5
    :try_start_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    invoke-static {}, Ll/ۡܶۘ;->֫()Ll/ۡܶۘ;

    move-result-object v0

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ll/ۡܶۘ;->֫(I)Ll/ۘ᩹ۘ;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 137
    new-instance v1, Ll/᩵᩹ۘ;

    const-string v2, "\u624bQ\u7248\u672c\u8fc7\u4f4e\uff0c\u8bf7\u4e0b\u8f7d\u5b89\u88c5\u6700\u65b0\u7248\u624bQ"

    const/16 v3, -0x14

    invoke-direct {v1, v3, v2, v13}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    :cond_9
    const/4 v1, 0x0

    .line 139
    invoke-direct {v8, v15, v1}, Lcom/tencent/connect/common/AssistActivity;->֫(Landroid/content/Intent;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_e

    :goto_6
    const/4 v12, 0x0

    :goto_7
    if-eqz v12, :cond_a

    .line 152
    invoke-static {v14, v9}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->finish()V

    .line 155
    :cond_a
    throw v0

    .line 157
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "--onCreate--activityIntent or pendingIntent is null. activityIntent is null? "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-nez v15, :cond_c

    const/4 v2, 0x1

    goto :goto_8

    :cond_c
    const/4 v2, 0x0

    :goto_8
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", pendingIntent is null? "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v1, :cond_d

    goto :goto_9

    :cond_d
    const/4 v12, 0x0

    :goto_9
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v14, v0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->finish()V

    goto/16 :goto_e

    :cond_e
    move-object v13, v6

    const-string v0, "--onCreate--h5 bundle not null, will open browser"

    .line 165
    invoke-static {v14, v0}, Ll/ۡ᩸ۘ;->ܿ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "viaShareType"

    .line 522
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v23

    const-string v0, "callbackAction"

    .line 523
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "url"

    .line 524
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "openId"

    .line 525
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    const-string v3, "appId"

    .line 526
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "shareToQQ"

    .line 530
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    const-string v3, "ANDROIDQQ.SHARETOQQ.XX"

    const-string v4, "10"

    :goto_a
    move-object v6, v4

    goto :goto_b

    :cond_f
    const-string v3, "shareToQzone"

    .line 533
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    const-string v3, "ANDROIDQQ.SHARETOQZ.XX"

    const-string v4, "11"

    goto :goto_a

    :goto_b
    move-object/from16 v20, v3

    move-object/from16 v18, v6

    goto :goto_c

    :cond_10
    move-object/from16 v18, v13

    move-object/from16 v20, v18

    .line 538
    :goto_c
    invoke-static {v8, v2}, Ll/ᩳ᩹ۘ;->֫(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_12

    .line 540
    invoke-static {}, Ll/ۡܶۘ;->֫()Ll/ۡܶۘ;

    move-result-object v2

    invoke-virtual {v2, v0}, Ll/ۡܶۘ;->֫(Ljava/lang/String;)Ll/ۘ᩹ۘ;

    move-result-object v0

    if-eqz v0, :cond_11

    .line 542
    new-instance v2, Ll/᩵᩹ۘ;

    const/4 v3, -0x6

    const-string v4, "\u6253\u5f00\u6d4f\u89c8\u5668\u5931\u8d25!"

    const/4 v5, 0x0

    invoke-direct {v2, v3, v4, v5}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    .line 545
    :cond_11
    invoke-static {}, Ll/۟ܶۘ;->֫()Ll/۟ܶۘ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v24, ""

    const-string v25, ""

    const-string v19, "3"

    const-string v22, "1"

    const-string v26, "0"

    const-string v27, "2"

    const-string v28, "0"

    move-object/from16 v21, v1

    .line 88
    invoke-static/range {v17 .. v28}, Ll/ᩳ᩹ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 90
    invoke-static {}, Ll/ᩳ᩸ۘ;->ۧ()Ll/ᩳ᩸ۘ;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v1, v3}, Ll/ᩳ᩸ۘ;->֫(Landroid/os/Bundle;Ljava/lang/String;Z)V

    .line 548
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->finish()V

    goto :goto_d

    .line 550
    :cond_12
    invoke-static {}, Ll/۟ܶۘ;->֫()Ll/۟ܶۘ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v24, ""

    const-string v25, ""

    const-string v19, "3"

    const-string v22, "0"

    const-string v26, "0"

    const-string v27, "2"

    const-string v28, "0"

    move-object/from16 v21, v1

    .line 88
    invoke-static/range {v17 .. v28}, Ll/ᩳ᩹ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 90
    invoke-static {}, Ll/ᩳ᩸ۘ;->ۧ()Ll/ᩳ᩸ۘ;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v1, v3}, Ll/ᩳ᩸ۘ;->֫(Landroid/os/Bundle;Ljava/lang/String;Z)V

    .line 554
    :goto_d
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "shareH5"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    goto :goto_e

    :cond_13
    const-string v0, "is restart"

    .line 170
    invoke-static {v14, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    :goto_e
    const v0, 0x1020002

    .line 199
    invoke-virtual {v8, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_14

    goto :goto_f

    .line 203
    :cond_14
    new-instance v1, Ll/ᩳܶۘ;

    invoke-direct {v1, v8}, Ll/ᩳܶۘ;-><init>(Lcom/tencent/connect/common/AssistActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :goto_f
    return-void
.end method

.method public final onDestroy()V
    .locals 2

    .line 294
    iget-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->᩶:Ljava/lang/String;

    const-string v1, "-->onDestroy"

    invoke-static {v0, v1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 296
    iget-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->ۤ:Ll/֫ܶۘ;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ll/֫ܶۘ;->֫(I)V

    .line 297
    iget-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->۬:Ll/ܳܶۘ;

    if-eqz v0, :cond_0

    .line 298
    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    :cond_0
    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 8

    .line 305
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "--onNewIntent: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/connect/common/AssistActivity;->᩶:Ljava/lang/String;

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 307
    iget-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->ۤ:Ll/֫ܶۘ;

    const/4 v2, 0x6

    invoke-virtual {v0, v2}, Ll/֫ܶۘ;->֫(I)V

    if-eqz p1, :cond_0

    .line 60
    invoke-virtual {p1}, Landroid/content/Intent;->getFlags()I

    move-result v0

    and-int/lit16 v0, v0, -0xc4

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    :cond_0
    const-string v0, "key_request_code"

    const/4 v2, -0x1

    .line 314
    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 315
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "--onNewIntent callbackRequestCode= "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0x277c

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-string v6, "stay_back_stack"

    const-string v7, "key_action"

    if-ne v0, v3, :cond_2

    const-string v0, "action_request_avatar"

    .line 317
    invoke-virtual {p1, v7, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 318
    invoke-virtual {p1, v6, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 320
    invoke-virtual {p0, v4}, Landroid/app/Activity;->moveTaskToBack(Z)Z

    .line 322
    :cond_1
    invoke-virtual {p0, v2, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 323
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_d

    .line 324
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_2
    const/16 v3, 0x277d

    if-ne v0, v3, :cond_4

    const-string v0, "action_request_set_emotion"

    .line 327
    invoke-virtual {p1, v7, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 328
    invoke-virtual {p1, v6, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 330
    invoke-virtual {p0, v4}, Landroid/app/Activity;->moveTaskToBack(Z)Z

    .line 332
    :cond_3
    invoke-virtual {p0, v2, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 333
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_d

    .line 334
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_4
    const/16 v3, 0x277e

    if-ne v0, v3, :cond_6

    const-string v0, "action_request_dynamic_avatar"

    .line 337
    invoke-virtual {p1, v7, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 338
    invoke-virtual {p1, v6, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 340
    invoke-virtual {p0, v4}, Landroid/app/Activity;->moveTaskToBack(Z)Z

    .line 342
    :cond_5
    invoke-virtual {p0, v2, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 343
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_d

    .line 344
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_6
    const/16 v3, 0x277f

    if-ne v0, v3, :cond_8

    const-string v0, "joinGroup"

    .line 347
    invoke-virtual {p1, v7, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 348
    invoke-virtual {p1, v6, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 350
    invoke-virtual {p0, v4}, Landroid/app/Activity;->moveTaskToBack(Z)Z

    .line 352
    :cond_7
    invoke-virtual {p0, v2, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 353
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_d

    .line 354
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_8
    const/16 v3, 0x2780

    if-ne v0, v3, :cond_a

    const-string v0, "bindGroup"

    .line 357
    invoke-virtual {p1, v7, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 358
    invoke-virtual {p1, v6, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 360
    invoke-virtual {p0, v4}, Landroid/app/Activity;->moveTaskToBack(Z)Z

    .line 362
    :cond_9
    invoke-virtual {p0, v2, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 363
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_d

    .line 364
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_a
    const/16 v3, 0x2781

    const-string v4, "action"

    const-string v5, "--onNewIntent--activity not finished, finish now"

    if-ne v0, v3, :cond_b

    .line 367
    invoke-virtual {p1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v7, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 368
    invoke-virtual {p0, v2, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 369
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_d

    .line 370
    invoke-static {v1, v5}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_b
    const/16 v3, 0x2782

    if-eq v0, v3, :cond_c

    const-string v0, "action_share"

    .line 387
    invoke-virtual {p1, v7, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 388
    invoke-virtual {p0, v2, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 389
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_d

    .line 390
    invoke-static {v1, v5}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 391
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 377
    :cond_c
    invoke-virtual {p1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v7, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 378
    invoke-virtual {p0, v2, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 379
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_d

    .line 380
    invoke-static {v1, v5}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 381
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_d
    return-void
.end method

.method public final onPause()V
    .locals 2

    .line 267
    iget-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->᩶:Ljava/lang/String;

    const-string v1, "-->onPause"

    invoke-static {v0, v1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    iget-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->᩹:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 269
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 270
    iget-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->ۤ:Ll/֫ܶۘ;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ll/֫ܶۘ;->֫(I)V

    return-void
.end method

.method public final onResume()V
    .locals 4

    .line 235
    iget-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->᩶:Ljava/lang/String;

    const-string v1, "-->onResume"

    invoke-static {v0, v1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    const/4 v0, 0x2

    .line 237
    iget-object v1, p0, Lcom/tencent/connect/common/AssistActivity;->ۤ:Ll/֫ܶۘ;

    invoke-virtual {v1, v0}, Ll/֫ܶۘ;->֫(I)V

    .line 246
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "is_login"

    const/4 v3, 0x0

    .line 247
    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    const-string v2, "is_qq_mobile_share"

    .line 251
    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 252
    iget-boolean v0, p0, Lcom/tencent/connect/common/AssistActivity;->ۙ:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 253
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 256
    :cond_1
    iget-boolean v0, p0, Lcom/tencent/connect/common/AssistActivity;->᩸:Z

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Ll/֫ܶۘ;->֫()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 257
    iget-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->᩹:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    .line 258
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void

    :cond_2
    const/4 v0, 0x1

    .line 261
    iput-boolean v0, p0, Lcom/tencent/connect/common/AssistActivity;->᩸:Z

    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 401
    iget-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->᩶:Ljava/lang/String;

    const-string v1, "--onSaveInstanceState--"

    invoke-static {v0, v1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "RESTART_FLAG"

    const/4 v1, 0x1

    .line 402
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "RESUME_FLAG"

    .line 403
    iget-boolean v1, p0, Lcom/tencent/connect/common/AssistActivity;->᩸:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 404
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public final onStart()V
    .locals 2

    .line 228
    iget-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->᩶:Ljava/lang/String;

    const-string v1, "-->onStart"

    invoke-static {v0, v1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 230
    iget-object v0, p0, Lcom/tencent/connect/common/AssistActivity;->ۤ:Ll/֫ܶۘ;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/֫ܶۘ;->֫(I)V

    return-void
.end method

.method public final onStop()V
    .locals 5

    const-string v0, "getRequestedOrientation= "

    const-string v1, "-->onStop"

    .line 275
    iget-object v2, p0, Lcom/tencent/connect/common/AssistActivity;->᩶:Ljava/lang/String;

    invoke-static {v2, v1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 277
    iget-object v1, p0, Lcom/tencent/connect/common/AssistActivity;->ۤ:Ll/֫ܶۘ;

    const/4 v3, 0x4

    invoke-virtual {v1, v3}, Ll/֫ܶۘ;->֫(I)V

    .line 280
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v3, "key_request_orientation"

    const/4 v4, -0x1

    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    .line 282
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    if-eq v1, v4, :cond_0

    .line 284
    invoke-virtual {p0, v1}, Lcom/tencent/connect/common/AssistActivity;->setRequestedOrientation(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    const-string v1, "reset requestedOrientation catch exception"

    .line 287
    invoke-static {v2, v1, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final setRequestedOrientation(I)V
    .locals 1

    .line 446
    invoke-static {p0}, Ll/᩶᩸ۘ;->ۧ(Lcom/tencent/connect/common/AssistActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 449
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method
