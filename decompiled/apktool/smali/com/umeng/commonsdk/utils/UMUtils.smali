.class public Lcom/umeng/commonsdk/utils/UMUtils;
.super Ljava/lang/Object;
.source "UMUtils.java"


# static fields
.field public static final DEFAULT_TIMEZONE:I = 0x8

.field public static final KEY_APP_KEY:Ljava/lang/String; = "appkey"

.field public static final KEY_CHANNEL:Ljava/lang/String; = "channel"

.field public static final KEY_LAST_APP_KEY:Ljava/lang/String; = "last_appkey"

.field public static final KEY_MIUI_VERSION_NAME:Ljava/lang/String; = "ro.miui.ui.version.name"

.field public static final KEY_SESSION_ID:Ljava/lang/String; = "session_id"

.field public static final KEY_SHARED_PREFERENCES_NAME:Ljava/lang/String; = "umeng_common_config"

.field public static final MOBILE_NETWORK:Ljava/lang/String; = "2G/3G"

.field public static final SD_PERMISSION:Ljava/lang/String; = "android.permission.WRITE_EXTERNAL_STORAGE"

.field public static final SP_FILE_NAME:Ljava/lang/String; = "um_session_id"

.field public static final TAG:Ljava/lang/String; = "UMUtils"

.field public static final UNKNOW:Ljava/lang/String; = ""

.field public static VALUE_ABTEST_VERSION:Ljava/lang/String; = null

.field public static VALUE_ANALYTICS_VERSION:Ljava/lang/String; = null

.field public static VALUE_APM_VERSION:Ljava/lang/String; = null

.field public static VALUE_ASMS_VERSION:Ljava/lang/String; = null

.field public static VALUE_GAME_VERSION:Ljava/lang/String; = null

.field public static VALUE_LINK_VERSION:Ljava/lang/String; = null

.field public static VALUE_PUSH_VERSION:Ljava/lang/String; = null

.field public static VALUE_REC_VERSION_NAME:Ljava/lang/String; = null

.field public static VALUE_SHARE_VERSION:Ljava/lang/String; = null

.field public static VALUE_SMS_VERSION:Ljava/lang/String; = null

.field public static VALUE_VERIFY_VERSION:Ljava/lang/String; = null

.field public static VALUE_VISUAL_VERSION:Ljava/lang/String; = null

.field public static final WIFI:Ljava/lang/String; = "Wi-Fi"

.field public static final pattern:Ljava/util/regex/Pattern;

.field public static volatile sAppVersionCode:Ljava/lang/String;

.field public static volatile sAppVersionName:Ljava/lang/String;

.field public static spLock:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "UTDID\">([^<]+)"

    .line 111
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/utils/UMUtils;->pattern:Ljava/util/regex/Pattern;

    .line 119
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/utils/UMUtils;->spLock:Ljava/lang/Object;

    const-string v0, ""

    .line 121
    sput-object v0, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_ANALYTICS_VERSION:Ljava/lang/String;

    .line 122
    sput-object v0, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_GAME_VERSION:Ljava/lang/String;

    .line 124
    sput-object v0, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_PUSH_VERSION:Ljava/lang/String;

    .line 125
    sput-object v0, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_SHARE_VERSION:Ljava/lang/String;

    .line 126
    sput-object v0, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_APM_VERSION:Ljava/lang/String;

    .line 127
    sput-object v0, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_VERIFY_VERSION:Ljava/lang/String;

    .line 128
    sput-object v0, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_SMS_VERSION:Ljava/lang/String;

    .line 129
    sput-object v0, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_REC_VERSION_NAME:Ljava/lang/String;

    .line 130
    sput-object v0, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_VISUAL_VERSION:Ljava/lang/String;

    .line 133
    sput-object v0, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_ASMS_VERSION:Ljava/lang/String;

    .line 135
    sput-object v0, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_LINK_VERSION:Ljava/lang/String;

    .line 136
    sput-object v0, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_ABTEST_VERSION:Ljava/lang/String;

    .line 139
    sput-object v0, Lcom/umeng/commonsdk/utils/UMUtils;->sAppVersionName:Ljava/lang/String;

    .line 140
    sput-object v0, Lcom/umeng/commonsdk/utils/UMUtils;->sAppVersionCode:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static MD5(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 1320
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    const-string v2, "MD5"

    .line 1321
    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    .line 1322
    invoke-virtual {v2}, Ljava/security/MessageDigest;->reset()V

    .line 1323
    invoke-virtual {v2, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 1324
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    .line 1325
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 1326
    :goto_0
    array-length v5, v1

    if-ge v4, v5, :cond_1

    const-string v5, "%02X"

    .line 1327
    aget-byte v6, v1, v4

    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v6

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v6, v7, v3

    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1330
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_1

    :catch_0
    :try_start_1
    const-string v1, "[^[a-z][A-Z][0-9][.][_]]"

    const-string v2, ""

    .line 1333
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p0

    .line 1341
    :goto_1
    sget-boolean v1, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v1, :cond_2

    .line 1342
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_2
    return-object v0

    :catch_1
    move-exception p0

    .line 1336
    sget-boolean v1, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v1, :cond_3

    .line 1337
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_3
    return-object v0
.end method

.method public static byte2HexFormatted([B)Ljava/lang/String;
    .locals 7

    .line 1262
    new-instance v0, Ljava/lang/StringBuilder;

    array-length v1, p0

    const/4 v2, 0x2

    mul-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    .line 1263
    :goto_0
    array-length v3, p0

    if-ge v1, v3, :cond_3

    .line 1264
    aget-byte v3, p0, v1

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    .line 1265
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    const-string v6, "0"

    .line 1267
    invoke-virtual {v6, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_0
    if-le v4, v2, :cond_1

    add-int/lit8 v6, v4, -0x2

    .line 1269
    invoke-virtual {v3, v6, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 1270
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1272
    array-length v3, p0

    sub-int/2addr v3, v5

    if-ge v1, v3, :cond_2

    const/16 v3, 0x3a

    .line 1273
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1275
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bytes2Hex([B)Ljava/lang/String;
    .locals 5

    const-string v0, ""

    const/4 v1, 0x0

    .line 1426
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    .line 1427
    aget-byte v2, p0, v1

    and-int/lit16 v2, v2, 0xff

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    .line 1428
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    const-string v3, "0"

    .line 0
    invoke-static {v0, v3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-static {v0, v2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static checkAndroidManifest(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x0

    .line 1595
    :try_start_0
    new-instance v1, Landroid/content/ComponentName;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1596
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    .line 1597
    invoke-virtual {p0, v1, v0}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    return v0
.end method

.method public static checkIntentFilterData(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 4

    const-string v0, "tencent"

    const/4 v1, 0x0

    .line 1613
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string v3, "android.intent.action.VIEW"

    .line 1614
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "android.intent.category.DEFAULT"

    .line 1615
    invoke-virtual {v2, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "android.intent.category.BROWSABLE"

    .line 1616
    invoke-virtual {v2, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 1618
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ":"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1619
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 1620
    invoke-virtual {v2, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 1621
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const/16 v0, 0x40

    invoke-virtual {p1, v2, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p1

    .line 1623
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 1624
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 1625
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    if-eqz v0, :cond_0

    .line 1626
    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :catchall_0
    :cond_1
    return v1
.end method

.method public static checkMetaData(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 3

    .line 1673
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    .line 1676
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v2, 0x80

    invoke-virtual {v0, p0, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 1679
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_0
    return v1
.end method

.method public static checkPath(Ljava/lang/String;)Z
    .locals 0

    .line 1573
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    const/4 p0, 0x0

    return p0
.end method

.method public static checkPermission(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 6

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 1237
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    const/4 v3, 0x1

    if-lt v1, v2, :cond_2

    :try_start_0
    const-string v1, "android.content.Context"

    .line 1239
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "checkSelfPermission"

    new-array v4, v3, [Ljava/lang/Class;

    .line 1240
    const-class v5, Ljava/lang/String;

    aput-object v5, v4, v0

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    aput-object p1, v2, v0

    .line 1241
    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p0, :cond_1

    return v3

    :cond_1
    return v0

    :catch_0
    move-exception p1

    .line 1248
    invoke-static {p0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return v0

    .line 1252
    :cond_2
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 1253
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p1, p0}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_3

    return v3

    :cond_3
    return v0
.end method

.method public static checkResource(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    .line 1652
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 1653
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    .line 1652
    invoke-virtual {v1, p1, p2, p0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gtz p0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x1

    return p0

    :catchall_0
    return v0
.end method

.method public static encryptBySHA1(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    .line 1400
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    const-string v1, "SHA1"

    .line 1402
    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    .line 1403
    invoke-virtual {v1, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 1404
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Lcom/umeng/commonsdk/utils/UMUtils;->bytes2Hex([B)Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p0

    :catch_0
    return-object v0

    :catchall_0
    move-exception p0

    .line 1415
    sget-boolean v1, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v1, :cond_0

    .line 1416
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_0
    return-object v0

    :catch_1
    move-exception p0

    .line 1410
    sget-boolean v1, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v1, :cond_1

    .line 1411
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_1
    return-object v0
.end method

.method public static genId()Ljava/lang/String;
    .locals 1

    const-string v0, "1234567890"

    return-object v0
.end method

.method public static genIv()[B
    .locals 11

    .line 2173
    invoke-static {}, Lcom/umeng/commonsdk/utils/UMUtils;->getMiniArray()[B

    move-result-object v0

    const/16 v1, 0x10

    new-array v1, v1, [B

    const/4 v2, 0x0

    const/16 v3, 0xa

    aput-byte v3, v1, v2

    const/4 v4, 0x1

    aput-byte v4, v1, v4

    const/16 v5, 0xa

    add-int/2addr v5, v4

    int-to-byte v5, v5

    const/4 v6, 0x2

    aput-byte v5, v1, v6

    const/4 v5, 0x3

    const/4 v7, 0x5

    aput-byte v7, v1, v5

    const/4 v8, 0x4

    aput-byte v8, v1, v8

    const/16 v9, 0xa

    add-int/2addr v9, v7

    int-to-byte v9, v9

    aput-byte v9, v1, v7

    const/4 v7, 0x6

    const/4 v9, 0x7

    aput-byte v9, v1, v7

    const/16 v7, 0x9

    aput-byte v7, v1, v9

    const/16 v9, 0x8

    const/16 v10, 0x17

    aput-byte v10, v1, v9

    aput-byte v5, v1, v7

    .line 2185
    aget-byte v2, v0, v2

    aput-byte v2, v1, v3

    const/16 v2, 0xb

    .line 2186
    aget-byte v3, v0, v4

    aput-byte v3, v1, v2

    const/16 v2, 0xc

    .line 2187
    aget-byte v3, v0, v6

    aput-byte v3, v1, v2

    const/16 v2, 0xd

    .line 2188
    aget-byte v3, v0, v5

    aput-byte v3, v1, v2

    const/16 v2, 0xe

    .line 2189
    aget-byte v0, v0, v8

    aput-byte v0, v1, v2

    rsub-int/lit8 v0, v7, 0x64

    int-to-byte v0, v0

    const/16 v2, 0xf

    aput-byte v0, v1, v2

    return-object v1
.end method

.method public static getActiveUser(Landroid/content/Context;)[Ljava/lang/String;
    .locals 0

    .line 2141
    invoke-static {p0}, Lcom/umeng/analytics/c;->a(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getApmFlag()Ljava/lang/String;
    .locals 4

    :try_start_0
    const-string v0, "com.umeng.umcrash.UMCrash"

    .line 2124
    invoke-static {v0}, Lcom/umeng/commonsdk/utils/UMUtils;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "getUMAPMFlag"

    const/4 v2, 0x0

    .line 2127
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v3, 0x1

    .line 2129
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 2130
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public static getAppHashKey(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 1719
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getAppHashKey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getAppMD5Signature(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    const-string v0, ""

    .line 1702
    :try_start_0
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getAppMD5Signature(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1703
    :try_start_1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, ":"

    .line 1704
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1705
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_0
    return-object p0

    :catchall_0
    move-object v0, p0

    :catchall_1
    return-object v0
.end method

.method public static getAppName(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 1302
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getAppName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getAppSHA1Key(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 1715
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getAppSHA1Key(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getAppVersinoCode(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, ""

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 1147
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/umeng/commonsdk/utils/b;->a()Lcom/umeng/commonsdk/utils/b;

    move-result-object v1

    const/16 v2, 0x40

    invoke-virtual {v1, p0, p1, v2}, Lcom/umeng/commonsdk/utils/b;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 1149
    iget p0, p0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 1150
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 1158
    sget-boolean p1, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz p1, :cond_1

    .line 1159
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    goto :goto_0

    :catch_0
    move-exception p0

    .line 1153
    sget-boolean p1, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz p1, :cond_1

    .line 1154
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static getAppVersionCode(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 1103
    sget-object v0, Lcom/umeng/commonsdk/utils/UMUtils;->sAppVersionCode:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1104
    sget-object p0, Lcom/umeng/commonsdk/utils/UMUtils;->sAppVersionCode:Ljava/lang/String;

    return-object p0

    :cond_0
    const-string v0, ""

    if-nez p0, :cond_1

    goto :goto_0

    .line 1112
    :cond_1
    :try_start_0
    invoke-static {}, Lcom/umeng/commonsdk/utils/b;->a()Lcom/umeng/commonsdk/utils/b;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x40

    invoke-virtual {v1, p0, v2, v3}, Lcom/umeng/commonsdk/utils/b;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 1114
    iget p0, p0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 1115
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    .line 1116
    sput-object p0, Lcom/umeng/commonsdk/utils/UMUtils;->sAppVersionCode:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :cond_2
    :goto_0
    return-object v0

    :catchall_0
    move-exception p0

    .line 1125
    sget-boolean v1, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v1, :cond_3

    .line 1126
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    goto :goto_1

    :catch_0
    move-exception p0

    .line 1119
    sget-boolean v1, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v1, :cond_3

    .line 1120
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_3
    :goto_1
    return-object v0
.end method

.method public static getAppVersionName(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 1173
    sget-object v0, Lcom/umeng/commonsdk/utils/UMUtils;->sAppVersionName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1174
    sget-object p0, Lcom/umeng/commonsdk/utils/UMUtils;->sAppVersionName:Ljava/lang/String;

    return-object p0

    :cond_0
    const-string v0, ""

    if-nez p0, :cond_1

    goto :goto_0

    .line 1183
    :cond_1
    :try_start_0
    invoke-static {}, Lcom/umeng/commonsdk/utils/b;->a()Lcom/umeng/commonsdk/utils/b;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x40

    invoke-virtual {v1, p0, v2, v3}, Lcom/umeng/commonsdk/utils/b;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 1185
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 1186
    sput-object p0, Lcom/umeng/commonsdk/utils/UMUtils;->sAppVersionName:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :cond_2
    :goto_0
    return-object v0

    :catchall_0
    move-exception p0

    .line 1189
    sget-boolean v1, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v1, :cond_3

    .line 1190
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_3
    return-object v0
.end method

.method public static getAppVersionName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, ""

    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    .line 1211
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/umeng/commonsdk/utils/b;->a()Lcom/umeng/commonsdk/utils/b;

    move-result-object v1

    const/16 v2, 0x40

    invoke-virtual {v1, p0, p1, v2}, Lcom/umeng/commonsdk/utils/b;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 1213
    iget-object p0, p1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p1

    .line 1217
    sget-boolean v1, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v1, :cond_1

    .line 1218
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1220
    :cond_1
    invoke-static {p0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    return-object v0
.end method

.method public static getAppkey(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 320
    :cond_0
    :try_start_0
    sget-object v1, Lcom/umeng/commonsdk/UMConfigure;->sAppkey:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 321
    sget-object p0, Lcom/umeng/commonsdk/UMConfigure;->sAppkey:Ljava/lang/String;

    return-object p0

    :cond_1
    const-string v1, "appkey"

    .line 329
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/utils/UMUtils;->getMultiProcessSP(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception v1

    .line 337
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_2

    .line 338
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 340
    :cond_2
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-object v0

    :catch_0
    move-exception v1

    .line 331
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_3

    .line 332
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 334
    :cond_3
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static getAppkeyByXML(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 1509
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 1510
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0x80

    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 1513
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v0, "UMENG_APPKEY"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 1516
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 1518
    :cond_0
    sget-boolean p0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz p0, :cond_1

    const-string p0, "MobclickAgent"

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Could not read UMENG_APPKEY meta-data from AndroidManifest.xml."

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 1519
    invoke-static {p0, v0}, Lcom/umeng/commonsdk/statistics/common/MLog;->i(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getBuildProp()Ljava/util/Properties;
    .locals 6

    .line 1021
    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    const/4 v1, 0x0

    .line 1024
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    new-instance v3, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getRootDirectory()Ljava/io/File;

    move-result-object v4

    const-string v5, "build.prop"

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v2, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1025
    :try_start_1
    invoke-virtual {v0, v2}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1031
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    return-object v0

    :catchall_0
    move-exception v0

    move-object v1, v2

    goto :goto_0

    :catch_0
    move-object v1, v2

    goto :goto_1

    :catchall_1
    move-exception v0

    :goto_0
    if-eqz v1, :cond_0

    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 1034
    :catch_1
    :cond_0
    throw v0

    :catch_2
    nop

    :goto_1
    if-eqz v1, :cond_1

    .line 1031
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    :cond_1
    return-object v0
.end method

.method public static getCPU()Ljava/lang/String;
    .locals 5

    const-string v0, ""

    const/4 v1, 0x0

    .line 595
    :try_start_0
    new-instance v2, Ljava/io/FileReader;

    const-string v3, "/proc/cpuinfo"

    invoke-direct {v2, v3}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 598
    :try_start_1
    new-instance v3, Ljava/io/BufferedReader;

    const/16 v4, 0x400

    invoke-direct {v3, v2, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    .line 599
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    .line 600
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V

    .line 601
    invoke-virtual {v2}, Ljava/io/Reader;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 603
    :try_start_2
    sget-boolean v3, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v3, :cond_0

    .line 604
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_2

    :catch_2
    move-exception v2

    .line 609
    :try_start_3
    sget-boolean v3, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v3, :cond_0

    .line 610
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_0
    :goto_0
    if-eqz v1, :cond_1

    const/16 v2, 0x3a

    .line 614
    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    .line 615
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 616
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_1
    return-object v0

    .line 625
    :goto_1
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_2

    .line 626
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_2
    return-object v0

    .line 620
    :goto_2
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_3

    .line 621
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_3
    return-object v0
.end method

.method public static getChannel(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 388
    :cond_0
    :try_start_0
    sget-object v1, Lcom/umeng/commonsdk/UMConfigure;->sChannel:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 389
    sget-object p0, Lcom/umeng/commonsdk/UMConfigure;->sChannel:Ljava/lang/String;

    return-object p0

    :cond_1
    const-string v1, "channel"

    .line 397
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/utils/UMUtils;->getMultiProcessSP(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception v1

    .line 405
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_2

    .line 406
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 408
    :cond_2
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-object v0

    :catch_0
    move-exception v1

    .line 399
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_3

    .line 400
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 402
    :cond_3
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static getChannelByXML(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 1539
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 1540
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0x80

    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 1542
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz p0, :cond_1

    const-string v0, "UMENG_CHANNEL"

    .line 1543
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 1545
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 1548
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 1550
    :cond_0
    sget-boolean p0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz p0, :cond_1

    const-string p0, "MobclickAgent"

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Could not read UMENG_CHANNEL meta-data from AndroidManifest.xml."

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 1551
    invoke-static {p0, v0}, Lcom/umeng/commonsdk/statistics/common/MLog;->i(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getClass(Ljava/lang/String;)Ljava/lang/Class;
    .locals 0

    .line 1852
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getDeviceToken(Landroid/content/Context;)Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 1475
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    :try_start_0
    const-string v1, "com.umeng.message.MessageSharedPrefs"

    .line 1477
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getInstance"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    .line 1479
    const-class v5, Landroid/content/Context;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    if-eqz v2, :cond_0

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p0, v3, v6

    .line 1481
    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v2, "getDeviceToken"

    .line 1483
    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 1485
    invoke-virtual {v1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 1486
    instance-of v1, p0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 1487
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    :cond_0
    return-object v0
.end method

.method public static getDeviceType(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    const-string v0, "Phone"

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    .line 1068
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget v2, v2, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v2, v2, 0xf

    const/4 v3, 0x3

    if-lt v2, v3, :cond_1

    const-string p0, "Tablet"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :cond_1
    return-object v0

    :catchall_0
    move-exception v0

    .line 1083
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_2

    .line 1084
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1086
    :cond_2
    invoke-static {p0, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-object v1

    :catch_0
    move-exception v0

    .line 1077
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_3

    .line 1078
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1080
    :cond_3
    invoke-static {p0, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public static getDisplayResolution(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    const-string v0, ""

    if-nez p0, :cond_0

    return-object v0

    .line 669
    :cond_0
    :try_start_0
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    const-string v2, "window"

    .line 670
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/WindowManager;

    if-nez v2, :cond_1

    return-object v0

    .line 674
    :cond_1
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 676
    iget v2, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 677
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 679
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "*"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception v1

    .line 688
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_2

    .line 689
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 691
    :cond_2
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-object v0

    :catch_0
    move-exception v1

    .line 682
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_3

    .line 683
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 685
    :cond_3
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static getFileMD5(Ljava/io/File;)Ljava/lang/String;
    .locals 7

    const/16 v0, 0x400

    const/4 v1, 0x0

    :try_start_0
    new-array v2, v0, [B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1362
    :try_start_1
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    move-result v3

    if-nez v3, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    const-string v3, "MD5"

    .line 1365
    invoke-static {v3}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v3

    .line 1366
    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    :goto_0
    const/4 p0, 0x0

    .line 1367
    invoke-virtual {v4, v2, p0, v0}, Ljava/io/FileInputStream;->read([BII)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_1

    .line 1368
    invoke-virtual {v3, v2, p0, v5}, Ljava/security/MessageDigest;->update([BII)V

    goto :goto_0

    .line 1370
    :cond_1
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1375
    :try_start_2
    new-instance v0, Ljava/math/BigInteger;

    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v0, v3, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    const-string v2, "%1$032x"

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, p0

    .line 1376
    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object p0

    :catch_0
    return-object v1

    :catchall_0
    move-exception p0

    .line 1383
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v0, :cond_2

    .line 1384
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_2
    return-object v1

    :catch_1
    move-exception p0

    .line 1378
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v0, :cond_3

    .line 1379
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_3
    return-object v1
.end method

.method public static getFlymeVersion(Ljava/util/Properties;)Ljava/lang/String;
    .locals 1

    :try_start_0
    const-string v0, "ro.build.display.id"

    .line 1006
    invoke-virtual {p0, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "flyme os"

    .line 1007
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, " "

    .line 1008
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x2

    aget-object p0, p0, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getGPU(Ljavax/microedition/khronos/opengles/GL10;)[Ljava/lang/String;
    .locals 3

    const/16 v0, 0x1f00

    const/4 v1, 0x0

    .line 566
    :try_start_0
    invoke-interface {p0, v0}, Ljavax/microedition/khronos/opengles/GL10;->glGetString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x1f01

    .line 567
    invoke-interface {p0, v2}, Ljavax/microedition/khronos/opengles/GL10;->glGetString(I)Ljava/lang/String;

    move-result-object p0

    .line 569
    filled-new-array {v0, p0}, [Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 577
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v0, :cond_0

    .line 578
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_0
    new-array p0, v1, [Ljava/lang/String;

    return-object p0

    :catch_0
    move-exception p0

    .line 572
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v0, :cond_1

    .line 573
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_1
    new-array p0, v1, [Ljava/lang/String;

    return-object p0
.end method

.method public static getLastAppkey(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    const-string v1, "last_appkey"

    .line 260
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/utils/UMUtils;->getMultiProcessSP(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception v1

    .line 268
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_1

    .line 269
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 271
    :cond_1
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-object v0

    :catch_0
    move-exception v1

    .line 262
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_2

    .line 263
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 265
    :cond_2
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static getLocale(Landroid/content/Context;)Ljava/util/Locale;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 783
    :cond_0
    :try_start_0
    new-instance v1, Landroid/content/res/Configuration;

    invoke-direct {v1}, Landroid/content/res/Configuration;-><init>()V

    .line 784
    invoke-virtual {v1}, Landroid/content/res/Configuration;->setToDefaults()V

    .line 785
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-static {v2, v1}, Landroid/provider/Settings$System;->getConfiguration(Landroid/content/ContentResolver;Landroid/content/res/Configuration;)V

    .line 787
    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    .line 790
    :try_start_1
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_1

    .line 791
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_1
    move-object v1, v0

    :goto_0
    if-nez v1, :cond_2

    .line 796
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    return-object v1

    .line 807
    :goto_1
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_3

    .line 808
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 810
    :cond_3
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-object v0

    :catch_1
    move-exception v1

    .line 801
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_4

    .line 802
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 804
    :cond_4
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static getMac(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    const-string v1, "wifi"

    .line 829
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/wifi/WifiManager;

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    const-string v2, "android.permission.ACCESS_WIFI_STATE"

    .line 833
    invoke-static {p0, v2}, Lcom/umeng/commonsdk/utils/UMUtils;->checkPermission(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 834
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v1

    .line 835
    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 837
    :cond_2
    sget-object v1, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->OS:Ljava/lang/String;

    const-string p0, ""
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception v1

    .line 851
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_3

    .line 852
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 855
    :cond_3
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-object v0

    :catch_0
    move-exception v1

    .line 844
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_4

    .line 845
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 848
    :cond_4
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static getMiniArray()[B
    .locals 1

    const/4 v0, 0x5

    new-array v0, v0, [B

    .line 2168
    fill-array-data v0, :array_0

    return-object v0

    nop

    :array_0
    .array-data 1
        0x1t
        0x6t
        0x8t
        0xct
        0xdt
    .end array-data
.end method

.method public static getMultiProcessSP(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const-string v1, "_umeng_common_config"

    const/4 v2, 0x0

    .line 184
    :try_start_0
    sget-object v0, Lcom/umeng/commonsdk/utils/UMUtils;->spLock:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p0, :cond_3

    .line 185
    :try_start_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    .line 190
    :cond_0
    invoke-static {p0}, Lcom/umeng/commonsdk/utils/UMUtils;->isMainProgress(Landroid/content/Context;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    .line 191
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v1, "umeng_common_config"

    .line 192
    invoke-virtual {p0, v1, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    goto :goto_0

    .line 195
    :cond_1
    invoke-static {p0}, Lcom/umeng/commonsdk/framework/UMFrUtils;->getSubProcessName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 196
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 197
    invoke-virtual {p0, v1, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_2

    .line 201
    invoke-interface {p0, p1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    monitor-exit v0

    return-object p0

    .line 203
    :cond_2
    monitor-exit v0

    return-object v2

    .line 186
    :cond_3
    :goto_1
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p0

    .line 204
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_0
    :catchall_1
    return-object v2
.end method

.method public static getNetworkAccessMode(Landroid/content/Context;)[Ljava/lang/String;
    .locals 6

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, ""

    aput-object v2, v0, v1

    const/4 v3, 0x1

    aput-object v2, v0, v3

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    const-string v4, "android.permission.ACCESS_NETWORK_STATE"

    .line 710
    invoke-static {p0, v4}, Lcom/umeng/commonsdk/utils/UMUtils;->checkPermission(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    aput-object v2, v0, v1

    return-object v0

    :cond_1
    const-string v4, "connectivity"

    .line 715
    invoke-virtual {p0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/net/ConnectivityManager;

    if-nez v4, :cond_2

    aput-object v2, v0, v1

    return-object v0

    .line 720
    :cond_2
    invoke-virtual {v4, v3}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 722
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v2

    sget-object v5, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    if-ne v2, v5, :cond_3

    const-string v2, "Wi-Fi"

    aput-object v2, v0, v1

    return-object v0

    .line 727
    :cond_3
    invoke-virtual {v4, v1}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 729
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v4

    sget-object v5, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    if-ne v4, v5, :cond_6

    const-string v4, "2G/3G"

    aput-object v4, v0, v1

    .line 731
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getSubtypeName()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v1

    .line 742
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_4

    .line 743
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 745
    :cond_4
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_0
    move-exception v1

    .line 737
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_5

    .line 738
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 740
    :cond_5
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    :cond_6
    :goto_0
    return-object v0
.end method

.method public static getNetworkOperatorName(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 655
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getNetworkOperatorName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getOaidRequiredTime(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    const-string v0, "header_device_oaid"

    .line 1763
    invoke-static {v0}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    const-string v0, "umeng_sp_oaid"

    const/4 v1, 0x0

    .line 1766
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v0, "key_umeng_sp_oaid_required_time"

    const-string v1, ""

    .line 1769
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getOperator(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 868
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getRegisteredOperator(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    .line 869
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "Unknown"

    :cond_0
    return-object p0
.end method

.method public static getRegisteredOperator(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 644
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getRegisteredOperator(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getSubOSName(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 891
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/umeng/commonsdk/utils/UMUtils;->getBuildProp()Ljava/util/Properties;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    const-string v2, "ro.miui.ui.version.name"

    .line 893
    invoke-virtual {v1, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 894
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 895
    invoke-static {}, Lcom/umeng/commonsdk/utils/UMUtils;->isFlyMe()Z

    move-result v3

    if-eqz v3, :cond_1

    const-string p0, "Flyme"

    return-object p0

    .line 898
    :cond_1
    invoke-static {v1}, Lcom/umeng/commonsdk/utils/UMUtils;->getYunOSVersion(Ljava/util/Properties;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string p0, "YunOS"

    return-object p0

    :cond_2
    return-object v2

    :cond_3
    const-string p0, "MIUI"
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p0

    :catch_0
    move-exception v1

    .line 908
    :try_start_2
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object v0

    :catchall_0
    move-exception v1

    .line 918
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_4

    .line 919
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 921
    :cond_4
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-object v0

    :catch_1
    move-exception v1

    .line 912
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_5

    .line 913
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 915
    :cond_5
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static getSubOSVersion(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 941
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/umeng/commonsdk/utils/UMUtils;->getBuildProp()Ljava/util/Properties;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    const-string v2, "ro.miui.ui.version.name"

    .line 943
    invoke-virtual {v1, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 944
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 945
    invoke-static {}, Lcom/umeng/commonsdk/utils/UMUtils;->isFlyMe()Z

    move-result v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_1

    .line 947
    :try_start_2
    invoke-static {v1}, Lcom/umeng/commonsdk/utils/UMUtils;->getFlymeVersion(Ljava/util/Properties;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    move-object v0, p0

    goto :goto_1

    .line 952
    :cond_1
    invoke-static {v1}, Lcom/umeng/commonsdk/utils/UMUtils;->getYunOSVersion(Ljava/util/Properties;)Ljava/lang/String;

    move-result-object p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_0
    :cond_2
    move-object v0, v2

    goto :goto_1

    :catch_1
    move-exception v1

    .line 960
    :try_start_3
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    return-object v0

    :catchall_0
    move-exception v1

    .line 970
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_3

    .line 971
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 973
    :cond_3
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-object v0

    :catch_2
    move-exception v1

    .line 964
    sget-boolean v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v2, :cond_4

    .line 965
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 967
    :cond_4
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static getSystemProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    :try_start_0
    const-string v0, "android.os.SystemProperties"

    .line 1840
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "get"

    const/4 v2, 0x2

    new-array v3, v2, [Ljava/lang/Class;

    .line 1841
    const-class v4, Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v6, 0x1

    aput-object v4, v3, v6

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    aput-object p0, v1, v5

    aput-object p1, v1, v6

    const/4 p0, 0x0

    .line 1842
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    return-object p1
.end method

.method public static getTargetSdkVersion(Landroid/content/Context;)I
    .locals 0

    .line 1725
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    iget p0, p0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    const/4 p0, 0x0

    return p0
.end method

.method public static getUMId(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 1446
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "umid"

    invoke-static {v1, v2, v0}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v1

    .line 1449
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    :cond_0
    return-object v0
.end method

.method public static getUUIDForZid(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1801
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "um_session_id"

    const/4 v1, 0x0

    .line 1802
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v0, ""

    if-eqz p0, :cond_0

    const-string v1, "session_id"

    .line 1804
    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static getUmengToken(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 1459
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "ztoken"

    invoke-static {v1, v2, v0}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v1

    .line 1462
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    :cond_0
    return-object v0
.end method

.method public static getYunOSVersion(Ljava/util/Properties;)Ljava/lang/String;
    .locals 1

    :try_start_0
    const-string v0, "ro.yunos.version"

    .line 987
    invoke-virtual {p0, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 988
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    return-object p0

    :catchall_0
    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getZid(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1786
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 1787
    invoke-static {p0}, Lcom/umeng/commonsdk/UMConfigure;->needSendZcfgEnv(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1789
    invoke-static {p0}, Lcom/umeng/commonsdk/internal/b;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/umeng/commonsdk/internal/b;->a()Lcom/umeng/commonsdk/internal/c;

    move-result-object p0

    invoke-virtual {p0}, Lcom/umeng/commonsdk/internal/c;->a()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static isAppInstalled(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 2151
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/umeng/commonsdk/utils/b;->a()Lcom/umeng/commonsdk/utils/b;

    move-result-object v1

    invoke-virtual {v1, p0, p1, v0}, Lcom/umeng/commonsdk/utils/b;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :catchall_0
    :cond_1
    return v0
.end method

.method public static isApplication(Landroid/content/Context;)Z
    .locals 1

    .line 1751
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    .line 1752
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "android.app.Application"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static isDebug(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 1289
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget p0, v1, Landroid/content/pm/ApplicationInfo;->flags:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    and-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v0

    :catch_0
    move-exception v1

    .line 1291
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return v0
.end method

.method public static isFlyMe()Z
    .locals 3

    .line 1049
    :try_start_0
    const-class v0, Landroid/os/Build;

    const-string v1, "hasSmartBar"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method public static isMainProgress(Landroid/content/Context;)Z
    .locals 2

    .line 1735
    :try_start_0
    invoke-static {p0}, Lcom/umeng/commonsdk/framework/UMFrUtils;->getCurrentProcessName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 1736
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    .line 1737
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1738
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1739
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static isSdCardWrittenable()Z
    .locals 2

    .line 759
    :try_start_0
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v0

    :catchall_0
    const/4 v0, 0x0

    return v0
.end method

.method public static parseId(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 491
    :cond_0
    :try_start_0
    sget-object v1, Lcom/umeng/commonsdk/utils/UMUtils;->pattern:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 493
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 494
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    :cond_1
    return-object v0
.end method

.method public static readStreamToString(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 4

    .line 510
    new-instance v0, Ljava/io/InputStreamReader;

    invoke-direct {v0, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    const/16 p0, 0x400

    new-array p0, p0, [C

    .line 515
    new-instance v1, Ljava/io/StringWriter;

    invoke-direct {v1}, Ljava/io/StringWriter;-><init>()V

    .line 517
    :goto_0
    invoke-virtual {v0, p0}, Ljava/io/Reader;->read([C)I

    move-result v2

    const/4 v3, -0x1

    if-eq v3, v2, :cond_0

    const/4 v3, 0x0

    .line 518
    invoke-virtual {v1, p0, v3, v2}, Ljava/io/StringWriter;->write([CII)V

    goto :goto_0

    .line 521
    :cond_0
    invoke-virtual {v1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static safeClose(Ljava/io/InputStream;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 480
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static saveSDKComponent()V
    .locals 15

    const-string v0, "UABTEST SDK\u7248\u672c\u53f7: "

    const-string v1, "ULink SDK\u7248\u672c\u53f7: "

    const-string v2, "APM SDK\u7248\u672c\u53f7: "

    const-string v3, "\u77ed\u4fe1\u9a8c\u8bc1\u7801SDK\u7248\u672c\u53f7: "

    const-string v4, "\u667a\u80fd\u63a8\u8350SDK\u7248\u672c\u53f7: "

    const-string v5, "\u5206\u4eabSDK\u7248\u672c\u53f7: "

    const-string v6, "\u63a8\u9001SDK\u7248\u672c\u53f7: "

    const-string v7, "\u53ef\u89c6\u5316\u57cb\u70b9SDK\u7248\u672c\u53f7: "

    const-string v8, "\u6e38\u620f\u7edf\u8ba1SDK\u7248\u672c\u53f7: "

    .line 1861
    new-instance v9, Ljava/lang/StringBuffer;

    invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V

    const-string v10, "a"

    .line 1862
    invoke-virtual {v9, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1863
    invoke-static {}, Lcom/umeng/commonsdk/UMConfigure;->isDebugLog()Z

    move-result v10

    const/4 v11, 0x2

    if-eqz v10, :cond_0

    const-string v10, "\u7edf\u8ba1SDK\u7248\u672c\u53f7: 9.5.2"

    .line 1864
    filled-new-array {v10}, [Ljava/lang/String;

    move-result-object v10

    invoke-static {v11, v10}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(I[Ljava/lang/String;)V

    :cond_0
    const-string v10, "9.5.2"

    .line 1866
    sput-object v10, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_ANALYTICS_VERSION:Ljava/lang/String;

    .line 1868
    invoke-static {}, Lcom/umeng/commonsdk/internal/c;->b()Ljava/lang/String;

    move-result-object v10

    .line 1869
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_1

    .line 1870
    sput-object v10, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_ASMS_VERSION:Ljava/lang/String;

    .line 1871
    invoke-static {}, Lcom/umeng/commonsdk/UMConfigure;->isDebugLog()Z

    move-result v12

    if-eqz v12, :cond_1

    const-string v12, "ZID SDK\u7248\u672c\u53f7: "

    .line 0
    invoke-static {v12, v10}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 1872
    filled-new-array {v10}, [Ljava/lang/String;

    move-result-object v10

    invoke-static {v11, v10}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(I[Ljava/lang/String;)V

    :cond_1
    const-string v10, "com.umeng.analytics.game.GameSdkVersion"

    .line 1876
    invoke-static {v10}, Lcom/umeng/commonsdk/utils/UMUtils;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    const-string v12, "SDK_VERSION"

    const-string v13, "g"

    if-eqz v10, :cond_2

    .line 1878
    invoke-virtual {v9, v13}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1881
    :try_start_0
    invoke-virtual {v10, v12}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v14

    .line 1882
    invoke-virtual {v14, v10}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 1883
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_2

    .line 1884
    sput-object v10, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_GAME_VERSION:Ljava/lang/String;

    .line 1885
    invoke-static {}, Lcom/umeng/commonsdk/UMConfigure;->isDebugLog()Z

    move-result v14

    if-eqz v14, :cond_2

    .line 1886
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/String;

    move-result-object v8

    invoke-static {v11, v8}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(I[Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    :cond_2
    :goto_0
    const-string v8, "com.umeng.vt.V"

    .line 1894
    invoke-static {v8}, Lcom/umeng/commonsdk/utils/UMUtils;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    if-eqz v8, :cond_3

    const-string v10, "v"

    .line 1896
    invoke-virtual {v9, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :try_start_1
    const-string v10, "VERSION"

    .line 1899
    invoke-virtual {v8, v10}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v10

    .line 1900
    invoke-virtual {v10, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 1901
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_3

    .line 1902
    sput-object v8, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_VISUAL_VERSION:Ljava/lang/String;

    .line 1903
    invoke-static {}, Lcom/umeng/commonsdk/UMConfigure;->isDebugLog()Z

    move-result v10

    if-eqz v10, :cond_3

    .line 1904
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v11, v7}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(I[Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    nop

    :cond_3
    :goto_1
    const-string v7, "com.umeng.message.PushAgent"

    .line 1912
    invoke-static {v7}, Lcom/umeng/commonsdk/utils/UMUtils;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    if-eqz v7, :cond_4

    const-string v7, "p"

    .line 1914
    invoke-virtual {v9, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v7, "com.umeng.message.MsgConstant"

    .line 1916
    invoke-static {v7}, Lcom/umeng/commonsdk/utils/UMUtils;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    if-eqz v7, :cond_4

    .line 1919
    :try_start_2
    invoke-virtual {v7, v12}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8

    .line 1920
    invoke-virtual {v8, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 1921
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_4

    .line 1922
    sput-object v7, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_PUSH_VERSION:Ljava/lang/String;

    .line 1923
    invoke-static {}, Lcom/umeng/commonsdk/UMConfigure;->isDebugLog()Z

    move-result v8

    if-eqz v8, :cond_4

    .line 1924
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v11, v6}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(I[Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    nop

    :cond_4
    :goto_2
    const-string v6, "com.umeng.socialize.UMShareAPI"

    .line 1933
    invoke-static {v6}, Lcom/umeng/commonsdk/utils/UMUtils;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    if-eqz v6, :cond_5

    const-string v6, "s"

    .line 1935
    invoke-virtual {v9, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v6, "com.umeng.a"

    .line 1937
    invoke-static {v6}, Lcom/umeng/commonsdk/utils/UMUtils;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    if-eqz v6, :cond_5

    .line 1940
    :try_start_3
    invoke-virtual {v6, v13}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    .line 1941
    invoke-virtual {v7, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 1942
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_5

    .line 1944
    invoke-static {}, Lcom/umeng/commonsdk/UMConfigure;->isDebugLog()Z

    move-result v7

    if-eqz v7, :cond_5

    .line 1945
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v11, v5}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(I[Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_3

    :catchall_3
    nop

    :cond_5
    :goto_3
    const-string v5, "com.umeng.error.UMError"

    .line 1954
    invoke-static {v5}, Lcom/umeng/commonsdk/utils/UMUtils;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    if-eqz v5, :cond_6

    const-string v5, "e"

    .line 1956
    invoke-virtual {v9, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_6
    const-string v5, "com.umeng.umzid.ZIDManager"

    .line 1959
    invoke-static {v5}, Lcom/umeng/commonsdk/utils/UMUtils;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    if-eqz v5, :cond_7

    const-string v5, "z"

    .line 1961
    invoke-virtual {v9, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_7
    const-string v5, "i"

    .line 1969
    invoke-virtual {v9, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1971
    sget v5, Lcom/umeng/commonsdk/statistics/SdkVersion;->SDK_TYPE:I

    const/4 v6, 0x1

    if-eq v5, v6, :cond_8

    const-string v5, "com.umeng.commonsdk.internal.UMOplus"

    .line 1972
    invoke-static {v5}, Lcom/umeng/commonsdk/utils/UMUtils;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    if-eqz v5, :cond_8

    const-string v5, "o"

    .line 1974
    invoke-virtual {v9, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_8
    const-string v5, "com.umeng.airec.RecAgent"

    .line 1979
    invoke-static {v5}, Lcom/umeng/commonsdk/utils/UMUtils;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    if-eqz v5, :cond_9

    const-string v5, "u"

    .line 1981
    invoke-virtual {v9, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v5, "com.umeng.airec.BuildConfig"

    .line 1983
    invoke-static {v5}, Lcom/umeng/commonsdk/utils/UMUtils;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    if-eqz v5, :cond_9

    :try_start_4
    const-string v7, "VERSION_NAME"

    .line 1986
    invoke-virtual {v5, v7}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    .line 1987
    invoke-virtual {v7, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 1988
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_9

    .line 1989
    sput-object v5, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_REC_VERSION_NAME:Ljava/lang/String;

    .line 1990
    invoke-static {}, Lcom/umeng/commonsdk/UMConfigure;->isDebugLog()Z

    move-result v7

    if-eqz v7, :cond_9

    .line 1991
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v11, v4}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(I[Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_4

    :catchall_4
    nop

    :cond_9
    :goto_4
    const-string v4, "com.umeng.umverify.UMVerifyHelper"

    .line 2001
    invoke-static {v4}, Lcom/umeng/commonsdk/utils/UMUtils;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    if-eqz v4, :cond_a

    const-string v4, "n"

    .line 2003
    invoke-virtual {v9, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_a
    const-string v4, "com.umeng.sms.UMSMS"

    .line 2032
    invoke-static {v4}, Lcom/umeng/commonsdk/utils/UMUtils;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const-string v5, "getVersion"

    const/4 v7, 0x0

    if-eqz v4, :cond_b

    const-string v8, "m"

    .line 2034
    invoke-virtual {v9, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 2037
    :try_start_5
    invoke-virtual {v4, v5, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    if-eqz v8, :cond_b

    .line 2039
    invoke-virtual {v8, v4, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 2040
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_b

    .line 2041
    sput-object v4, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_SMS_VERSION:Ljava/lang/String;

    .line 2042
    invoke-static {}, Lcom/umeng/commonsdk/UMConfigure;->isDebugLog()Z

    move-result v8

    if-eqz v8, :cond_b

    .line 2043
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v11, v3}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(I[Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    :catchall_5
    :cond_b
    :try_start_6
    const-string v3, "com.umeng.umcrash.UMCrash"

    .line 2056
    invoke-static {v3}, Lcom/umeng/commonsdk/utils/UMUtils;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    if-eqz v3, :cond_c

    const-string v4, "c"

    .line 2058
    invoke-virtual {v9, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v4, "crashSdkVersion"

    .line 2061
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 2062
    invoke-virtual {v4, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 2063
    invoke-virtual {v4, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 2064
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_c

    .line 2065
    sput-object v3, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_APM_VERSION:Ljava/lang/String;

    .line 2066
    invoke-static {}, Lcom/umeng/commonsdk/UMConfigure;->isDebugLog()Z

    move-result v4

    if-eqz v4, :cond_c

    .line 2067
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v11, v2}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(I[Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto :goto_5

    :catchall_6
    nop

    :cond_c
    :goto_5
    const-string v2, "com.umeng.umlink.MobclickLink"

    .line 2077
    invoke-static {v2}, Lcom/umeng/commonsdk/utils/UMUtils;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    if-eqz v2, :cond_d

    const-string v3, "l"

    .line 2079
    invoke-virtual {v9, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 2082
    :try_start_7
    invoke-virtual {v2, v5, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    if-eqz v3, :cond_d

    .line 2084
    invoke-virtual {v3, v2, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 2085
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_d

    .line 2086
    sput-object v2, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_LINK_VERSION:Ljava/lang/String;

    .line 2087
    invoke-static {}, Lcom/umeng/commonsdk/UMConfigure;->isDebugLog()Z

    move-result v3

    if-eqz v3, :cond_d

    .line 2088
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v1}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(I[Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    goto :goto_6

    :catchall_7
    nop

    :cond_d
    :goto_6
    const-string v1, "com.umeng.cconfig.UMRemoteConfig"

    .line 2096
    invoke-static {v1}, Lcom/umeng/commonsdk/utils/UMUtils;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    if-eqz v1, :cond_e

    .line 2099
    :try_start_8
    invoke-virtual {v1, v5, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    if-eqz v2, :cond_e

    const-string v3, "t"

    .line 2101
    invoke-virtual {v9, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 2102
    invoke-virtual {v2, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 2103
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_e

    .line 2104
    sput-object v1, Lcom/umeng/commonsdk/utils/UMUtils;->VALUE_ABTEST_VERSION:Ljava/lang/String;

    .line 2105
    invoke-static {}, Lcom/umeng/commonsdk/UMConfigure;->isDebugLog()Z

    move-result v2

    if-eqz v2, :cond_e

    .line 2106
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(I[Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    goto :goto_7

    :catchall_8
    nop

    .line 2113
    :cond_e
    :goto_7
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_f

    .line 2114
    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/statistics/b;->a:Ljava/lang/String;

    :cond_f
    return-void
.end method

.method public static setAppkey(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    if-eqz p0, :cond_3

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    const-string v0, "appkey"

    .line 295
    invoke-static {p0, v0, p1}, Lcom/umeng/commonsdk/utils/UMUtils;->setMultiProcessSP(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 302
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v0, :cond_1

    .line 303
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 305
    :cond_1
    invoke-static {p0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_0
    move-exception p1

    .line 297
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v0, :cond_2

    .line 298
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 300
    :cond_2
    invoke-static {p0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public static setChannel(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    if-eqz p0, :cond_3

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    const-string v0, "channel"

    .line 363
    invoke-static {p0, v0, p1}, Lcom/umeng/commonsdk/utils/UMUtils;->setMultiProcessSP(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 370
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v0, :cond_1

    .line 371
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 373
    :cond_1
    invoke-static {p0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_0
    move-exception p1

    .line 365
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v0, :cond_2

    .line 366
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 368
    :cond_2
    invoke-static {p0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public static setLastAppkey(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    if-eqz p0, :cond_3

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    const-string v0, "last_appkey"

    .line 229
    invoke-static {p0, v0, p1}, Lcom/umeng/commonsdk/utils/UMUtils;->setMultiProcessSP(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 236
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v0, :cond_1

    .line 237
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 239
    :cond_1
    invoke-static {p0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_0
    move-exception p1

    .line 231
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz v0, :cond_2

    .line 232
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 234
    :cond_2
    invoke-static {p0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public static setMultiProcessSP(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    const-string v1, "_umeng_common_config"

    .line 151
    :try_start_0
    sget-object v0, Lcom/umeng/commonsdk/utils/UMUtils;->spLock:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p0, :cond_3

    .line 152
    :try_start_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    if-nez p2, :cond_0

    goto :goto_1

    .line 156
    :cond_0
    invoke-static {p0}, Lcom/umeng/commonsdk/utils/UMUtils;->isMainProgress(Landroid/content/Context;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 157
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v1, "umeng_common_config"

    .line 158
    invoke-virtual {p0, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    goto :goto_0

    .line 161
    :cond_1
    invoke-static {p0}, Lcom/umeng/commonsdk/framework/UMFrUtils;->getSubProcessName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 162
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 163
    invoke-virtual {p0, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_2

    .line 167
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 169
    :cond_2
    monitor-exit v0

    return-void

    .line 153
    :cond_3
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 169
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_0
    :catchall_1
    return-void
.end method

.method public static setUUIDForZid(Landroid/content/Context;)V
    .locals 2

    .line 1817
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "um_session_id"

    const/4 v1, 0x0

    .line 1818
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    .line 1819
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    .line 1821
    :try_start_0
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const-string v0, ""

    :goto_0
    if-eqz p0, :cond_0

    .line 1826
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string v1, "session_id"

    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_0
    return-void
.end method
