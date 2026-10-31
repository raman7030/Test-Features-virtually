.class public final Ll/۠۠ۘ;
.super Ll/᩻ܶۘ;
.source "51RR"


# static fields
.field public static ۢ:Ljava/lang/String; = null

.field public static ᩷:Ljava/lang/String; = "libwbsafeedit"


# instance fields
.field public ۜ:Ljava/lang/ref/WeakReference;

.field public ܳ:Ll/ۘ᩹ۘ;

.field public ᩻:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const-string v0, "libwbsafeedit"

    const-string v1, ".so"

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 97
    sput-object v2, Ll/۠۠ۘ;->ۢ:Ljava/lang/String;

    .line 109
    sget-object v2, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    const-string v3, "is arm(default) architecture"

    const-string v4, "openSDK_LOG.AuthAgent"

    if-eqz v2, :cond_3

    const-string v5, ""

    .line 110
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    const-string v5, "arm64-v8a"

    .line 111
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v0, "libwbsafeedit_64"

    .line 112
    sput-object v0, Ll/۠۠ۘ;->᩷:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 113
    sput-object v0, Ll/۠۠ۘ;->ۢ:Ljava/lang/String;

    const-string v0, "is arm64-v8a architecture"

    .line 114
    invoke-static {v4, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v5, "x86"

    .line 115
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v0, "libwbsafeedit_x86"

    .line 116
    sput-object v0, Ll/۠۠ۘ;->᩷:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 117
    sput-object v0, Ll/۠۠ۘ;->ۢ:Ljava/lang/String;

    const-string v0, "is x86 architecture"

    .line 118
    invoke-static {v4, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v5, "x86_64"

    .line 119
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v0, "libwbsafeedit_x86_64"

    .line 120
    sput-object v0, Ll/۠۠ۘ;->᩷:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 121
    sput-object v0, Ll/۠۠ۘ;->ۢ:Ljava/lang/String;

    const-string v0, "is x86_64 architecture"

    .line 122
    invoke-static {v4, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 124
    :cond_2
    sput-object v0, Ll/۠۠ۘ;->᩷:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 125
    sput-object v0, Ll/۠۠ۘ;->ۢ:Ljava/lang/String;

    .line 126
    invoke-static {v4, v3}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 129
    :cond_3
    sput-object v0, Ll/۠۠ۘ;->᩷:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 130
    sput-object v0, Ll/۠۠ۘ;->ۢ:Ljava/lang/String;

    .line 131
    invoke-static {v4, v3}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic ֫(Ll/۠۠ۘ;)Ljava/lang/String;
    .locals 0

    .line 81
    invoke-virtual {p0}, Ll/᩻ܶۘ;->֫()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Ll/۠۠ۘ;)Ll/᩸۠ۘ;
    .locals 0

    .line 81
    iget-object p0, p0, Ll/᩻ܶۘ;->֫:Ll/᩸۠ۘ;

    return-object p0
.end method

.method public static synthetic ۜ(Ll/۠۠ۘ;)Ll/᩸۠ۘ;
    .locals 0

    .line 81
    iget-object p0, p0, Ll/᩻ܶۘ;->֫:Ll/᩸۠ۘ;

    return-object p0
.end method

.method public static synthetic ۡ(Ll/۠۠ۘ;)Ll/᩸۠ۘ;
    .locals 0

    .line 81
    iget-object p0, p0, Ll/᩻ܶۘ;->֫:Ll/᩸۠ۘ;

    return-object p0
.end method

.method public static synthetic ۢ(Ll/۠۠ۘ;)Landroid/os/Bundle;
    .locals 0

    .line 81
    invoke-virtual {p0}, Ll/᩻ܶۘ;->ۧ()Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۧ(Ll/۠۠ۘ;)Ll/᩸۠ۘ;
    .locals 0

    .line 81
    iget-object p0, p0, Ll/᩻ܶۘ;->֫:Ll/᩸۠ۘ;

    return-object p0
.end method

.method public static synthetic ܳ(Ll/۠۠ۘ;)Ll/᩸۠ۘ;
    .locals 0

    .line 81
    iget-object p0, p0, Ll/᩻ܶۘ;->֫:Ll/᩸۠ۘ;

    return-object p0
.end method

.method public static synthetic ܽ(Ll/۠۠ۘ;)Ll/᩸۠ۘ;
    .locals 0

    .line 81
    iget-object p0, p0, Ll/᩻ܶۘ;->֫:Ll/᩸۠ۘ;

    return-object p0
.end method

.method public static synthetic ܿ(Ll/۠۠ۘ;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 81
    iget-object p0, p0, Ll/۠۠ۘ;->ۜ:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method public static synthetic ᩳ(Ll/۠۠ۘ;)Ll/᩸۠ۘ;
    .locals 0

    .line 81
    iget-object p0, p0, Ll/᩻ܶۘ;->֫:Ll/᩸۠ۘ;

    return-object p0
.end method

.method public static synthetic ᩷(Ll/۠۠ۘ;)Ll/᩸۠ۘ;
    .locals 0

    .line 81
    iget-object p0, p0, Ll/᩻ܶۘ;->֫:Ll/᩸۠ۘ;

    return-object p0
.end method

.method public static synthetic ᩻(Ll/۠۠ۘ;)Ll/᩸۠ۘ;
    .locals 0

    .line 81
    iget-object p0, p0, Ll/᩻ܶۘ;->֫:Ll/᩸۠ۘ;

    return-object p0
.end method


# virtual methods
.method public final ֫(Landroid/app/Activity;Ll/ۘ᩹ۘ;)I
    .locals 29

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    .line 32
    invoke-static {}, Ll/ᩴ᩹ۘ;->ܽ()Z

    move-result v3

    const-string v4, "openSDK_LOG.AuthAgent"

    if-eqz v3, :cond_0

    const-string v2, "permission not granted"

    .line 33
    invoke-static {v4, v2}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    new-instance v2, Ll/᩵᩹ۘ;

    const/4 v3, -0x6

    const-string v4, "\u7528\u6237\u672a\u6388\u6743\uff0c\u6682\u65f6\u65e0\u6cd5\u4f7f\u7528QQ\u767b\u5f55\u53ca\u5206\u4eab\u7b49\u529f\u80fd"

    invoke-direct {v2, v3, v4, v4}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ll/ۘ᩹ۘ;->֫(Ll/᩵᩹ۘ;)V

    const/4 v0, -0x1

    return v0

    :cond_0
    const-string v3, "get_simple_userinfo"

    .line 228
    iput-object v3, v1, Ll/۠۠ۘ;->᩻:Ljava/lang/String;

    .line 229
    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v3, v1, Ll/۠۠ۘ;->ۜ:Ljava/lang/ref/WeakReference;

    .line 230
    iput-object v0, v1, Ll/۠۠ۘ;->ܳ:Ll/ۘ᩹ۘ;

    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/Object;

    .line 233
    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v5, 0x0

    if-eqz v0, :cond_1

    const-string v6, "KEY_FORCE_QR_LOGIN"

    .line 234
    invoke-virtual {v0, v6, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const-string v5, "101492915"

    .line 235
    invoke-static {v2, v5}, Ll/᩺᩸ۘ;->֫(Landroid/content/Context;Ljava/lang/String;)Ll/᩺᩸ۘ;

    move-result-object v6

    const-string v7, "C_LoginWeb"

    invoke-virtual {v6, v7}, Ll/᩺᩸ۘ;->ۧ(Ljava/lang/String;)Z

    move-result v6

    .line 236
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "doLogin needForceQrLogin="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v8, ", toWebLogin="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v7}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "5"

    const-string v8, "openSDK_LOG.SystemUtils"

    const-string v9, "openmobile_android"

    const-string v10, "-"

    const-string v11, "-android-"

    const-string v12, "desktop_m_qq-"

    const-string v14, "scope"

    const-string v13, "pf"

    const-string v15, "1"

    move-object/from16 v16, v7

    const-string v7, "client_id"

    move-object/from16 v17, v3

    const-string v3, ""

    move-object/from16 v18, v3

    .line 237
    iget-object v3, v1, Ll/᩻ܶۘ;->֫:Ll/᩸۠ۘ;

    if-nez v0, :cond_f

    if-nez v6, :cond_f

    const-string v0, "startActionActivity() -- start"

    .line 379
    invoke-static {v4, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 374
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v6, "com.tencent.mobileqq"

    move-object/from16 v19, v3

    const-string v3, "com.tencent.open.agent.AgentActivity"

    .line 376
    invoke-virtual {v0, v6, v3}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 378
    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v0}, Ll/۟᩸ۘ;->֫(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v6

    const/16 v20, 0x0

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    const-string v6, "com.tencent.tim"

    .line 383
    invoke-virtual {v0, v6, v3}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 384
    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v0}, Ll/۟᩸ۘ;->֫(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_1
    move-object/from16 v24, v4

    move-object/from16 v25, v5

    move-object/from16 v21, v8

    move-object v6, v9

    move-object/from16 v22, v10

    move-object v2, v11

    move-object/from16 v23, v12

    goto/16 :goto_5

    .line 387
    :cond_3
    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object v6

    .line 838
    :try_start_0
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    .line 840
    iget v2, v6, Landroid/util/DisplayMetrics;->widthPixels:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    int-to-float v2, v2

    move-object/from16 v21, v8

    :try_start_1
    iget v8, v6, Landroid/util/DisplayMetrics;->xdpi:F

    div-float/2addr v2, v8

    .line 842
    iget v8, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v8, v8

    iget v6, v6, Landroid/util/DisplayMetrics;->ydpi:F
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    div-float/2addr v8, v6

    move-object v6, v9

    move-object/from16 v22, v10

    float-to-double v9, v2

    move-object v2, v11

    move-object/from16 v23, v12

    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    .line 844
    :try_start_2
    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object/from16 v24, v4

    move-object/from16 v25, v5

    float-to-double v4, v8

    .line 846
    :try_start_3
    invoke-static {v4, v5, v11, v12}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    add-double/2addr v9, v4

    .line 844
    invoke-static {v9, v10}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_4

    :catchall_0
    move-object/from16 v24, v4

    move-object/from16 v25, v5

    goto :goto_3

    :catchall_1
    move-object/from16 v24, v4

    move-object/from16 v25, v5

    :goto_2
    move-object v6, v9

    move-object/from16 v22, v10

    move-object v2, v11

    move-object/from16 v23, v12

    goto :goto_3

    :catchall_2
    move-object/from16 v24, v4

    move-object/from16 v25, v5

    move-object/from16 v21, v8

    goto :goto_2

    :catchall_3
    :goto_3
    const-wide/16 v4, 0x0

    :goto_4
    const-wide/high16 v8, 0x401a000000000000L    # 6.5

    cmpl-double v10, v4, v8

    if-lez v10, :cond_4

    const-string v4, "com.tencent.minihd.qq"

    .line 389
    invoke-virtual {v0, v4, v3}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 390
    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Ll/۟᩸ۘ;->֫(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v3

    if-eqz v3, :cond_4

    :goto_5
    move-object v3, v0

    goto :goto_6

    :cond_4
    move-object/from16 v3, v20

    :goto_6
    if-eqz v3, :cond_e

    .line 384
    invoke-virtual/range {p0 .. p0}, Ll/᩻ܶۘ;->֫()Landroid/os/Bundle;

    move-result-object v4

    .line 388
    iget-object v0, v1, Ll/۠۠ۘ;->᩻:Ljava/lang/String;

    invoke-virtual {v4, v14, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v5, v25

    .line 389
    invoke-virtual {v4, v7, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 391
    sget-boolean v0, Ll/᩻ܶۘ;->ᩳ:Z

    if-eqz v0, :cond_5

    .line 392
    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v8, v23

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v9, Ll/᩻ܶۘ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v9, Ll/᩻ܶۘ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v9, v22

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v10, Ll/᩻ܶۘ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v13, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    :cond_5
    move-object/from16 v9, v22

    move-object/from16 v8, v23

    .line 394
    invoke-virtual {v4, v13, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :goto_7
    const-string v0, "need_pay"

    .line 396
    invoke-virtual {v4, v0, v15}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 398
    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object v10

    invoke-static {v10}, Ll/۟᩸ۘ;->֫(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "oauth_app_name"

    invoke-virtual {v4, v11, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v10, "key_action"

    const-string v11, "action_login"

    .line 399
    invoke-virtual {v3, v10, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v10, "key_params"

    .line 400
    invoke-virtual {v3, v10, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    const-string v10, "appid"

    .line 401
    invoke-virtual {v3, v10, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v10, "status_os"

    .line 469
    invoke-virtual {v4, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "status_machine"

    .line 470
    invoke-virtual {v4, v11}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "status_version"

    .line 471
    invoke-virtual {v4, v12}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v22, v6

    const-string v6, "sdkv"

    .line 472
    invoke-virtual {v4, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v23, v9

    .line 473
    invoke-virtual {v4, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 474
    invoke-virtual {v4, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v25, v2

    .line 475
    invoke-virtual {v4, v13}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v26, v13

    const-string v13, ", machine="

    move-object/from16 v27, v8

    const-string v8, ", version="

    move-object/from16 v28, v7

    const-string v7, "os="

    .line 0
    invoke-static {v7, v10, v13, v11, v8}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ", sdkv="

    const-string v13, ", appId="

    invoke-static {v7, v12, v8, v6, v13}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v8, ", needPay="

    const-string v13, ", pf="

    invoke-static {v7, v9, v8, v0, v13}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 481
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v8, v24

    invoke-static {v8, v7}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 484
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    if-nez v10, :cond_6

    move-object/from16 v10, v18

    :cond_6
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v11, :cond_7

    move-object/from16 v11, v18

    .line 485
    :cond_7
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v12, :cond_8

    move-object/from16 v12, v18

    .line 486
    :cond_8
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v6, :cond_9

    move-object/from16 v6, v18

    .line 487
    :cond_9
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v9, :cond_a

    move-object/from16 v9, v18

    .line 488
    :cond_a
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v0, :cond_b

    move-object/from16 v0, v18

    .line 489
    :cond_b
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v2, :cond_c

    move-object/from16 v2, v18

    .line 490
    :cond_c
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :try_start_4
    const-string v2, "SHA-256"

    .line 51
    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    .line 52
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 53
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v20
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :goto_8
    move-object/from16 v0, v20

    goto :goto_9

    :catch_0
    move-exception v0

    :try_start_5
    const-string v2, "DESUtils"

    const-string v6, "encryptSha"

    .line 55
    invoke-static {v2, v6, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_8

    :goto_9
    if-nez v0, :cond_d

    const-string v0, "getEncryptPkgName shaBytes==null !!!!!!"
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    move-object/from16 v2, v21

    .line 311
    :try_start_6
    invoke-static {v2, v0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_b

    :cond_d
    move-object/from16 v2, v21

    const/16 v6, 0x8

    new-array v7, v6, [B

    const/4 v9, 0x5

    const/4 v10, 0x0

    .line 317
    invoke-static {v0, v9, v7, v10, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v9, 0x10

    new-array v11, v9, [B

    .line 320
    invoke-static {v0, v6, v11, v10, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 322
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11}, Ll/۬᩸ۘ;->֫([B)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v7, v6}, Ll/۬᩸ۘ;->֫(Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_c

    :catch_1
    move-exception v0

    goto :goto_a

    :catch_2
    move-exception v0

    move-object/from16 v2, v21

    :goto_a
    const-string v6, "getEncryptPkgName"

    .line 324
    invoke-static {v2, v6, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_b
    move-object/from16 v0, v18

    :goto_c
    const-string v6, "ppsts"

    .line 403
    invoke-virtual {v4, v6, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 406
    :try_start_7
    new-instance v0, Ll/ۚ۠ۘ;

    iget-object v4, v1, Ll/۠۠ۘ;->ܳ:Ll/ۘ᩹ۘ;

    invoke-direct {v0, v1, v4}, Ll/ۚ۠ۘ;-><init>(Ll/۠۠ۘ;Ll/ۘ᩹ۘ;)V

    .line 407
    iput-object v0, v1, Ll/۠۠ۘ;->ܳ:Ll/ۘ᩹ۘ;

    .line 409
    invoke-static {}, Ll/ۡܶۘ;->֫()Ll/ۡܶۘ;

    move-result-object v0

    iget-object v4, v1, Ll/۠۠ۘ;->ܳ:Ll/ۘ᩹ۘ;

    invoke-virtual {v0, v4}, Ll/ۡܶۘ;->֫(Ll/ۘ᩹ۘ;)V

    const-string v0, "startAssitActivity activity"

    .line 414
    invoke-static {v8, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v4, p1

    .line 415
    invoke-static {v4, v3}, Ll/᩻ܶۘ;->֫(Landroid/app/Activity;Landroid/content/Intent;)V

    const-string v0, "startActionActivity() -- end, found activity for loginIntent"

    .line 417
    invoke-static {v8, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 418
    invoke-static {}, Ll/۟ܶۘ;->֫()Ll/۟ܶۘ;

    move-result-object v0

    .line 419
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 418
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "0"

    const/4 v3, 0x0

    aput-object v0, v17, v3

    const/4 v4, 0x1

    .line 421
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v17, v4
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    const-string v0, "OpenUi, showUi, return Constants.UI_ACTIVITY"

    .line 238
    invoke-static {v8, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    invoke-static {}, Ll/۟ܶۘ;->֫()Ll/۟ܶۘ;

    move-result-object v0

    invoke-virtual/range {v19 .. v19}, Ll/᩸۠ۘ;->ۧ()Ljava/lang/String;

    move-result-object v2

    aget-object v3, v17, v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v6, v16

    invoke-static {v2, v5, v6, v3}, Ll/۟ܶۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    aget-object v0, v17, v4

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :catch_3
    move-exception v0

    move-object/from16 v6, v16

    const-string v3, "startActionActivity() exception"

    .line 425
    invoke-static {v8, v3, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_d

    :cond_e
    move-object/from16 v28, v7

    move-object/from16 v26, v13

    move-object/from16 v27, v23

    move-object/from16 v8, v24

    move-object/from16 v5, v25

    move-object/from16 v25, v2

    move-object/from16 v2, v21

    move-object/from16 v23, v22

    move-object/from16 v22, v6

    move-object/from16 v6, v16

    .line 428
    :goto_d
    invoke-static {}, Ll/۟ܶۘ;->֫()Ll/۟ܶۘ;

    move-result-object v0

    .line 429
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 428
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "startActionActivity() -- end, no target activity for loginIntent"

    .line 430
    invoke-static {v8, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_e

    :cond_f
    move-object/from16 v19, v3

    move-object/from16 v28, v7

    move-object v2, v8

    move-object/from16 v22, v9

    move-object/from16 v23, v10

    move-object/from16 v25, v11

    move-object/from16 v27, v12

    move-object/from16 v26, v13

    move-object/from16 v6, v16

    move-object v8, v4

    .line 244
    :goto_e
    invoke-static {}, Ll/۟ܶۘ;->֫()Ll/۟ܶۘ;

    move-result-object v0

    invoke-virtual/range {v19 .. v19}, Ll/᩸۠ۘ;->ۧ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v5, v6, v15}, Ll/۟ܶۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "doLogin startActivity fail show dialog."

    .line 247
    invoke-static {v8, v0}, Ll/ۡ᩸ۘ;->ܿ(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    iget-object v0, v1, Ll/۠۠ۘ;->᩻:Ljava/lang/String;

    const-string v3, "server_side"

    if-eqz v0, :cond_10

    .line 15
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_f

    .line 249
    :cond_10
    new-instance v0, Ll/ۚ۠ۘ;

    iget-object v4, v1, Ll/۠۠ۘ;->ܳ:Ll/ۘ᩹ۘ;

    invoke-direct {v0, v1, v4}, Ll/ۚ۠ۘ;-><init>(Ll/۠۠ۘ;Ll/ۘ᩹ۘ;)V

    iput-object v0, v1, Ll/۠۠ۘ;->ܳ:Ll/ۘ᩹ۘ;

    .line 251
    :goto_f
    iget-object v4, v1, Ll/۠۠ۘ;->ܳ:Ll/ۘ᩹ۘ;

    .line 266
    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    .line 268
    invoke-virtual/range {p0 .. p0}, Ll/᩻ܶۘ;->֫()Landroid/os/Bundle;

    move-result-object v6

    .line 272
    iget-object v0, v1, Ll/۠۠ۘ;->᩻:Ljava/lang/String;

    invoke-virtual {v6, v14, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v7, v28

    .line 273
    invoke-virtual {v6, v7, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    sget-boolean v0, Ll/᩻ܶۘ;->ᩳ:Z

    if-eqz v0, :cond_11

    .line 275
    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v5, v27

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v5, Ll/᩻ܶۘ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v5, v25

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, Ll/᩻ܶۘ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v5, v23

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, Ll/᩻ܶۘ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v5, v26

    invoke-virtual {v6, v5, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_10

    :cond_11
    move-object/from16 v7, v22

    move-object/from16 v5, v26

    .line 277
    invoke-virtual {v6, v5, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    :goto_10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    const-wide/16 v11, 0x3e8

    div-long/2addr v9, v11

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-object/from16 v5, v18

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 282
    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object v0

    sget v9, Ll/۟᩸ۘ;->֫:I

    const-string v9, "_"

    const-string v10, "-->signEncryped: "

    const-string v11, "-->sign: "

    const-string v12, "OpenUi, getSignValidString"

    .line 266
    invoke-static {v2, v12}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    :try_start_8
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v12

    .line 270
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/16 v13, 0x40

    .line 271
    invoke-virtual {v0, v12, v13}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 273
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const-string v13, "MD5"

    .line 275
    invoke-static {v13}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v13

    const/4 v14, 0x0

    .line 276
    aget-object v0, v0, v14

    invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 277
    invoke-virtual {v13}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩹ۘ;->֫([B)Ljava/lang/String;

    move-result-object v0

    .line 278
    invoke-virtual {v13}, Ljava/security/MessageDigest;->reset()V

    .line 280
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v2, v11}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 283
    invoke-static {v0}, Ll/ᩳ᩹ۘ;->ܿ(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 284
    invoke-virtual {v13}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩹ۘ;->֫([B)Ljava/lang/String;

    move-result-object v5

    .line 285
    invoke-virtual {v13}, Ljava/security/MessageDigest;->reset()V

    .line 287
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    goto :goto_11

    :catch_4
    move-exception v0

    const-string v9, "OpenUi, getSignValidString error"

    .line 289
    invoke-static {v2, v9, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_11
    const-string v0, "sign"

    .line 283
    invoke-virtual {v6, v0, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "time"

    .line 284
    invoke-virtual {v6, v0, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "display"

    const-string v2, "mobile"

    .line 287
    invoke-virtual {v6, v0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    iget-object v0, v1, Ll/۠۠ۘ;->᩻:Ljava/lang/String;

    if-eqz v0, :cond_12

    .line 15
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_12

    const/4 v0, 0x1

    goto :goto_12

    :cond_12
    const/4 v0, 0x0

    :goto_12
    const-string v2, "response_type"

    const-string v3, "token"

    .line 289
    invoke-virtual {v6, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "redirect_uri"

    const-string v3, "auth://tauth.qq.com/"

    .line 290
    invoke-virtual {v6, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "cancel_display"

    .line 292
    invoke-virtual {v6, v2, v15}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "switch"

    .line 293
    invoke-virtual {v6, v2, v15}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "compat_v"

    .line 294
    invoke-virtual {v6, v2, v15}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "OpenUI, showDialog addLoginAccount: "

    .line 300
    invoke-static {v8, v2}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "show_download_ui"

    const/4 v3, 0x1

    .line 306
    invoke-static {v3}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "OpenUi, showDialog -- start, isShowDownloadUi="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v8, v2}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 310
    invoke-static {}, Ll/ܰ᩸ۘ;->֫()Ll/ܰ᩸ۘ;

    move-result-object v3

    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object v5

    const-string v7, "https://openmobile.qq.com/oauth2.0/m_authorize?"

    invoke-virtual {v3, v5, v7}, Ll/ܰ᩸ۘ;->֫(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    invoke-static {v6}, Ll/᩸᩸ۘ;->ۧ(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    if-eqz v0, :cond_13

    goto :goto_13

    .line 317
    :cond_13
    new-instance v0, Ll/֨۠ۘ;

    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v0, v1, v3, v4}, Ll/֨۠ۘ;-><init>(Ll/۠۠ۘ;Landroid/content/Context;Ll/ۘ᩹ۘ;)V

    move-object v4, v0

    :goto_13
    const-string v0, "OpenUi, showDialog TDialog"

    .line 319
    invoke-static {v8, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    new-instance v0, Ll/ۖ۠ۘ;

    invoke-direct {v0, v1, v2, v4}, Ll/ۖ۠ۘ;-><init>(Ll/۠۠ۘ;Ljava/lang/String;Ll/ۘ᩹ۘ;)V

    invoke-static {v0}, Ll/ܽ᩹ۘ;->֫(Ljava/lang/Runnable;)V

    const-string v0, "OpenUi, showDialog -- end"

    .line 353
    invoke-static {v8, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x2

    return v2
.end method

.method public final ܽ()V
    .locals 1

    const/4 v0, 0x0

    .line 258
    iput-object v0, p0, Ll/۠۠ۘ;->ܳ:Ll/ۘ᩹ۘ;

    return-void
.end method
