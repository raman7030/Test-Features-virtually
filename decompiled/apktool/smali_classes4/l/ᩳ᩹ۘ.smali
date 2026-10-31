.class public final Ll/ᩳ᩹ۘ;
.super Ljava/lang/Object;
.source "51RR"


# static fields
.field public static ֫:Ljava/lang/String; = ""

.field public static ۧ:Ljava/lang/String; = ""


# direct methods
.method public static ֫(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 8

    .line 88
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    if-eqz p0, :cond_2

    :try_start_0
    const-string v1, "&"

    .line 91
    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 92
    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, p0, v3

    const-string v5, "="

    .line 106
    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    const/4 v6, -0x1

    const/4 v7, 0x1

    if-ne v5, v6, :cond_0

    .line 108
    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    .line 111
    :cond_0
    invoke-virtual {v4, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    add-int/2addr v5, v7

    .line 112
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v6, v4}, [Ljava/lang/String;

    move-result-object v4

    .line 94
    :goto_1
    array-length v5, v4

    const/4 v6, 0x2

    if-ne v5, v6, :cond_1

    .line 95
    aget-object v5, v4, v2

    invoke-static {v5}, Ll/ۗ֨ᩴ;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aget-object v4, v4, v7

    invoke-static {v4}, Ll/ۗ֨ᩴ;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v5, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    return-object p0

    :cond_2
    return-object v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 2

    .line 741
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "openid"

    .line 742
    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "report_type"

    .line 743
    invoke-virtual {v0, p0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "act_type"

    .line 744
    invoke-virtual {v0, p0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "via"

    .line 745
    invoke-virtual {v0, p0, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "app_id"

    .line 746
    invoke-virtual {v0, p0, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "type"

    .line 747
    invoke-virtual {v0, p0, p6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "login_status"

    .line 748
    invoke-virtual {v0, p0, p7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "need_user_auth"

    .line 749
    invoke-virtual {v0, p0, p8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "to_uin"

    .line 750
    invoke-virtual {v0, p0, p9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "call_source"

    .line 751
    invoke-virtual {v0, p0, p10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "to_type"

    .line 752
    invoke-virtual {v0, p0, p11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "platform"

    const-string p1, "1"

    .line 753
    invoke-virtual {v0, p0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "result"

    .line 734
    invoke-virtual {v0, p0, p5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static ֫([B)Ljava/lang/String;
    .locals 5

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 469
    :cond_0
    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    .line 470
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v0, 0x0

    .line 471
    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_2

    .line 472
    aget-byte v2, p0, v0

    and-int/lit16 v2, v2, 0xff

    const/16 v3, 0x10

    invoke-static {v2, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    .line 473
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    const-string v3, "0"

    .line 474
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 476
    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 478
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 6

    if-nez p0, :cond_0

    .line 118
    new-instance p0, Lorg/json/JSONObject;

    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    :cond_0
    if-eqz p1, :cond_2

    const-string v0, "&"

    .line 121
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 122
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p1, v2

    const-string v4, "="

    .line 123
    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 124
    array-length v4, v3

    const/4 v5, 0x2

    if-ne v4, v5, :cond_1

    const/4 v4, 0x1

    .line 128
    :try_start_0
    aget-object v5, v3, v1

    invoke-static {v5}, Ll/ۗ֨ᩴ;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v1

    .line 129
    aget-object v5, v3, v4

    invoke-static {v5}, Ll/ۗ֨ᩴ;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    :catch_0
    :try_start_1
    aget-object v5, v3, v1

    aget-object v3, v3, v4

    invoke-virtual {p0, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v3

    .line 135
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "decodeUrlToJson has exception: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "openSDK_LOG.Util"

    invoke-static {v4, v3}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object p0
.end method

.method public static ֫(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 364
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 365
    new-instance v1, Landroid/content/ComponentName;

    invoke-direct {v1, p1, p2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const-string p1, "android.intent.action.VIEW"

    .line 366
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const/high16 p1, 0x40000000    # 2.0f

    .line 367
    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 p1, 0x10000000

    .line 368
    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 370
    invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 372
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static ֫(Landroid/content/Context;)Z
    .locals 6

    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    .line 717
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    const-string v4, "openSDK_LOG.Util"

    if-lt v2, v3, :cond_1

    .line 719
    :try_start_0
    invoke-virtual {p0, v1}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_1

    return v0

    :catch_0
    move-exception v1

    const-string v2, "checkSelfPermission exception"

    .line 724
    invoke-static {v4, v2, v1}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    const/4 v1, 0x0

    :try_start_1
    const-string v2, "connectivity"

    .line 670
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/ConnectivityManager;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    const-string v2, "Util.isNetWorkAvailable getConnectivity has exception"

    .line 672
    invoke-static {v4, v2, p0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object p0, v1

    :goto_0
    if-nez p0, :cond_2

    return v0

    :cond_2
    const/4 v2, 0x0

    .line 679
    :try_start_2
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v5, v3, :cond_6

    .line 680
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v3

    if-nez v3, :cond_3

    return v2

    .line 685
    :cond_3
    invoke-virtual {p0, v3}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 687
    invoke-virtual {v3, v0}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v5

    if-nez v5, :cond_5

    .line 688
    invoke-virtual {v3, v2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v5

    if-nez v5, :cond_5

    const/4 v5, 0x3

    .line 689
    invoke-virtual {v3, v5}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :cond_5
    :goto_1
    return v0

    .line 692
    :cond_6
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 693
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz p0, :cond_7

    goto :goto_2

    :cond_7
    const/4 v0, 0x0

    :goto_2
    return v0

    .line 701
    :catchall_1
    :try_start_3
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getAllNetworkInfo()[Landroid/net/NetworkInfo;

    move-result-object v1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_3

    :catch_1
    move-exception p0

    const-string v3, "Util.isNetWorkAvailable has exception: "

    .line 703
    invoke-static {v4, v3, p0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    if-eqz v1, :cond_a

    .line 705
    array-length p0, v1

    if-nez p0, :cond_8

    goto :goto_5

    .line 708
    :cond_8
    array-length p0, v1

    const/4 v3, 0x0

    :goto_4
    if-ge v3, p0, :cond_a

    aget-object v4, v1, v3

    .line 709
    invoke-virtual {v4}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result v4

    if-eqz v4, :cond_9

    return v0

    :cond_9
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_a
    :goto_5
    return v2
.end method

.method public static ֫(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 7

    const-string v0, "com.android.browser"

    const-string v1, "com.android.browser.BrowserActivity"

    const/4 v2, 0x0

    .line 312
    :try_start_0
    invoke-static {p0}, Ll/ᩳ᩹ۘ;->ܽ(Landroid/content/Context;)Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v3, :cond_0

    :try_start_1
    const-string v4, "com.tencent.mtt"

    const-string v5, "com.tencent.mtt.MainActivity"

    .line 314
    invoke-static {p0, v4, v5, p1}, Ll/ᩳ᩹ۘ;->֫(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 317
    :cond_0
    invoke-static {p0, v0, v1, p1}, Ll/ᩳ᩹ۘ;->֫(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    nop

    goto :goto_0

    :catch_1
    const/4 v3, 0x0

    :goto_0
    const-string v4, "com.google.android.apps.chrome.Main"

    const-string v5, "com.android.chrome"

    const-string v6, "com.google.android.browser"

    if-eqz v3, :cond_1

    .line 326
    :try_start_2
    invoke-static {p0, v0, v1, p1}, Ll/ᩳ᩹ۘ;->֫(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    .line 331
    :catch_2
    :try_start_3
    invoke-static {p0, v6, v1, p1}, Ll/ᩳ᩹ۘ;->֫(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_1

    .line 335
    :catch_3
    :try_start_4
    invoke-static {p0, v5, v4, p1}, Ll/ᩳ᩹ۘ;->֫(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_1

    :catch_4
    return v2

    .line 345
    :cond_1
    :try_start_5
    invoke-static {p0, v6, v1, p1}, Ll/ᩳ᩹ۘ;->֫(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_1

    .line 349
    :catch_5
    :try_start_6
    invoke-static {p0, v5, v4, p1}, Ll/ᩳ᩹ۘ;->֫(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    :goto_1
    const/4 p0, 0x1

    return p0

    :catch_6
    return v2
.end method

.method public static ۧ(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 2

    const-string v0, "auth://"

    const-string v1, "http://"

    .line 151
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 153
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 154
    invoke-virtual {v0}, Ljava/net/URL;->getQuery()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ᩳ᩹ۘ;->֫(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    .line 155
    invoke-virtual {v0}, Ljava/net/URL;->getRef()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩹ۘ;->֫(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 158
    :catch_0
    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    return-object p0
.end method

.method public static ۧ(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    const-string v0, "com.tencent.mobileqq"

    .line 794
    invoke-static {p0, v0}, Ll/ᩳ᩹ۘ;->ۧ(Landroid/content/Context;Ljava/lang/String;)V

    .line 795
    sget-object p0, Ll/ᩳ᩹ۘ;->ۧ:Ljava/lang/String;

    return-object p0
.end method

.method public static ۧ(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    const-string v0, "getPackageInfo has exception: "

    const-string v1, "openSDK_LOG.Util"

    if-nez p0, :cond_0

    goto :goto_0

    .line 778
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    .line 779
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    sput-object p0, Ll/ᩳ᩹ۘ;->ۧ:Ljava/lang/String;

    const/16 p1, 0x2e

    .line 780
    invoke-virtual {p0, p1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    sput-object p0, Ll/ᩳ᩹ۘ;->֫:Ljava/lang/String;

    .line 781
    sget-object p0, Ll/ᩳ᩹ۘ;->ۧ:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    sget-object v2, Ll/ᩳ᩹ۘ;->ۧ:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p0, p1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 786
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception p0

    .line 784
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static ܽ(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    if-nez p0, :cond_0

    const-string p0, ""

    return-object p0

    .line 802
    :cond_0
    invoke-static {p0, p1}, Ll/ᩳ᩹ۘ;->ۧ(Landroid/content/Context;Ljava/lang/String;)V

    .line 803
    sget-object p0, Ll/ᩳ᩹ۘ;->֫:Ljava/lang/String;

    return-object p0
.end method

.method public static ܽ(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2

    const-string v0, "auth://"

    const-string v1, "http://"

    .line 164
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 166
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 167
    invoke-virtual {v0}, Ljava/net/URL;->getQuery()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-static {v1, p0}, Ll/ᩳ᩹ۘ;->֫(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    .line 168
    invoke-virtual {v0}, Ljava/net/URL;->getRef()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ll/ᩳ᩹ۘ;->֫(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 171
    :catch_0
    new-instance p0, Lorg/json/JSONObject;

    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    return-object p0
.end method

.method public static ܽ(Landroid/content/Context;)Z
    .locals 4

    const-string v0, "isQQBrowerAvailable has exception: "

    const/4 v1, 0x0

    .line 269
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string v2, "com.tencent.mtt"

    const/16 v3, 0x40

    invoke-virtual {p0, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    .line 271
    iget-object v2, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    const-string v3, "4.3"

    .line 272
    invoke-static {v2, v3}, Ll/۟᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    if-ltz v3, :cond_0

    const-string v3, "4.4"

    .line 273
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 274
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz p0, :cond_0

    :try_start_1
    const-string v2, "MD5"

    .line 278
    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    .line 279
    aget-object p0, p0, v1

    invoke-virtual {p0}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 280
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Ll/ᩳ᩹ۘ;->֫([B)Ljava/lang/String;

    move-result-object p0

    .line 281
    invoke-virtual {v2}, Ljava/security/MessageDigest;->reset()V

    const-string v2, "d8391a394d4a179e6fe7bdb8a301258b"

    .line 284
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :catch_0
    move-exception p0

    :try_start_2
    const-string v2, "openSDK_LOG.Util"

    .line 289
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :cond_0
    return v1
.end method

.method public static ܿ(Ljava/lang/String;)[B
    .locals 2

    :try_start_0
    const-string v0, "UTF-8"

    .line 816
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string v0, "openSDK_LOG.Util"

    const-string v1, "getBytesUTF8: UnsupportedEncodingException"

    .line 818
    invoke-static {v0, v1, p0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    new-array p0, p0, [B

    return-object p0
.end method

.method public static ᩳ(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2

    const-string v0, "false"

    .line 193
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "{value : false}"

    :cond_0
    const-string v0, "true"

    .line 197
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "{value : true}"

    :cond_1
    const-string v0, "allback("

    .line 202
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "[\\s\\S]*allback\\(([\\s\\S]*)\\);[^\\)]*\\z"

    const-string v1, "$1"

    .line 203
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 205
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    :cond_2
    const-string v0, "online[0]="

    .line 208
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 209
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{online:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p0, "}"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 211
    :cond_3
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
