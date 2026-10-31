.class public Lcom/umeng/umzid/ZIDManager;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static c:Lcom/umeng/umzid/ZIDManager;


# instance fields
.field public a:Z

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/umeng/umzid/ZIDManager;->a:Z

    iput-boolean v0, p0, Lcom/umeng/umzid/ZIDManager;->b:Z

    return-void
.end method

.method public static synthetic a(Lcom/umeng/umzid/ZIDManager;Landroid/content/Context;)Ljava/lang/String;
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/umeng/umzid/ZIDManager;->a:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/umeng/umzid/ZIDManager;->a:Z

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    invoke-static {}, Lcom/umeng/umzid/Spy;->getID()Ljava/lang/String;

    move-result-object v3

    const-string v4, "zdata"

    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {p1}, Lcom/umeng/umzid/c;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "mac"

    invoke-virtual {v2, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {p1}, Lcom/umeng/umzid/c;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "oaid"

    invoke-virtual {v2, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p0, p1, v2}, Lcom/umeng/umzid/ZIDManager;->a(Landroid/content/Context;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v6, "https://aaid.umeng.com/api/postZdata"

    :try_start_1
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Lcom/umeng/umzid/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_3

    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v2, "suc"

    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v2

    if-ne v2, v0, :cond_3

    invoke-static {p1, v3}, Lcom/umeng/umzid/c;->f(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {p1, v4}, Lcom/umeng/umzid/c;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {p1, v5}, Lcom/umeng/umzid/c;->b(Landroid/content/Context;Ljava/lang/String;)V

    const-string v0, "aaid"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1, v1}, Lcom/umeng/umzid/c;->e(Landroid/content/Context;Ljava/lang/String;)V

    :cond_1
    const-string v0, "uabc"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {p1, v0}, Lcom/umeng/umzid/c;->d(Landroid/content/Context;Ljava/lang/String;)V

    :cond_2
    const-string v0, "resetToken"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {p1, v0}, Lcom/umeng/umzid/c;->c(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :cond_3
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/umeng/umzid/ZIDManager;->a:Z

    return-object v1
.end method

.method public static declared-synchronized getInstance()Lcom/umeng/umzid/ZIDManager;
    .locals 2

    .line 0
    const-class v0, Lcom/umeng/umzid/ZIDManager;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/umeng/umzid/ZIDManager;->c:Lcom/umeng/umzid/ZIDManager;

    if-nez v1, :cond_0

    new-instance v1, Lcom/umeng/umzid/ZIDManager;

    invoke-direct {v1}, Lcom/umeng/umzid/ZIDManager;-><init>()V

    sput-object v1, Lcom/umeng/umzid/ZIDManager;->c:Lcom/umeng/umzid/ZIDManager;

    :cond_0
    sget-object v1, Lcom/umeng/umzid/ZIDManager;->c:Lcom/umeng/umzid/ZIDManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static getSDKVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "1.4.1"

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 10

    const-class v0, Landroid/content/Context;

    const-class v1, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;

    invoke-static {}, Lcom/umeng/umzid/Spy;->getVersion()Ljava/lang/String;

    move-result-object v2

    const-string v3, "zdata_ver"

    invoke-virtual {p2, v3, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v4, 0x1

    .line 2
    :try_start_0
    sget-object v5, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->UNKNOW:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, "getAndroidId"

    :try_start_1
    new-array v6, v4, [Ljava/lang/Class;

    aput-object v0, v6, v3

    invoke-virtual {v1, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v6, v4, [Ljava/lang/Object;

    aput-object p1, v6, v3

    invoke-virtual {v5, v1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_0

    instance-of v6, v5, Ljava/lang/String;

    if-eqz v6, :cond_0

    check-cast v5, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    :cond_0
    move-object v5, v2

    :goto_0
    const-string v6, "android_id"

    .line 3
    invoke-virtual {p2, v6, v5}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 4
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v5

    const-string v6, "mounted"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    const-string v6, "mounted_ro"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    const-wide/16 v5, 0x0

    goto :goto_2

    .line 5
    :cond_2
    :goto_1
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getFreeSpace()J

    move-result-wide v5

    .line 6
    :goto_2
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const-string v6, "storage"

    invoke-virtual {p2, v6, v5}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v5, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const-string v6, "os_version"

    invoke-virtual {p2, v6, v5}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const/4 v5, 0x0

    if-nez p1, :cond_3

    goto :goto_4

    .line 7
    :cond_3
    :try_start_2
    new-instance v6, Landroid/content/res/Configuration;

    invoke-direct {v6}, Landroid/content/res/Configuration;-><init>()V

    invoke-virtual {v6}, Landroid/content/res/Configuration;->setToDefaults()V

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v7

    invoke-static {v7, v6}, Landroid/provider/Settings$System;->getConfiguration(Landroid/content/ContentResolver;Landroid/content/res/Configuration;)V

    iget-object v6, v6, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-object v6, v5

    :goto_3
    if-nez v6, :cond_4

    :try_start_3
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    .line 8
    :cond_4
    invoke-static {v6}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v6

    const v7, 0x36ee80

    div-int/2addr v6, v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_5

    :catchall_2
    :cond_5
    :goto_4
    const/16 v6, 0x8

    .line 9
    :goto_5
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v7, "timezone"

    invoke-virtual {p2, v7, v6}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v7, "model"

    invoke-virtual {p2, v7, v6}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 10
    :try_start_4
    sget-object v6, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->UNKNOW:Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    const-string v6, "getImeiNew"

    :try_start_5
    new-array v7, v4, [Ljava/lang/Class;

    aput-object v0, v7, v3

    invoke-virtual {v1, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    if-eqz v6, :cond_6

    invoke-virtual {v6, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v7, v4, [Ljava/lang/Object;

    aput-object p1, v7, v3

    invoke-virtual {v6, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_6

    instance-of v7, v6, Ljava/lang/String;

    if-eqz v7, :cond_6

    check-cast v6, Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_6

    :catchall_3
    :cond_6
    move-object v6, v2

    :goto_6
    const-string v7, "imei"

    .line 11
    invoke-virtual {p2, v7, v6}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 12
    :try_start_6
    const-class v6, Landroid/os/Build;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    const-string v7, "getString"

    :try_start_7
    new-array v8, v4, [Ljava/lang/Class;

    const-class v9, Ljava/lang/String;

    aput-object v9, v8, v3

    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v7, v4, [Ljava/lang/Object;

    const-string v8, "net.hostname"

    aput-object v8, v7, v3

    invoke-virtual {v6, v5, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    if-eqz v6, :cond_8

    :try_start_8
    invoke-virtual {v6, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    if-nez v7, :cond_8

    :try_start_9
    const-string v7, "MD5"

    .line 13
    invoke-static {v7}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v7

    invoke-virtual {v6}, Ljava/lang/String;->getBytes()[B

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v7}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v8, 0x0

    :goto_7
    array-length v9, v6

    if-ge v8, v9, :cond_7

    aget-byte v9, v6, v8

    and-int/lit16 v9, v9, 0xff

    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    :cond_7
    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v6
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    goto :goto_8

    :catchall_4
    move-object v6, v2

    goto :goto_8

    :catch_0
    nop

    goto :goto_8

    :catch_1
    move-object v6, v5

    :cond_8
    :goto_8
    const-string v7, "hostname"

    .line 14
    invoke-virtual {p2, v7, v6}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v6, "sdk_version"

    const-string v7, "1.4.1"

    invoke-virtual {p2, v6, v7}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-nez p1, :cond_9

    move-object v6, v5

    goto :goto_9

    .line 15
    :cond_9
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    :goto_9
    const-string v7, "package_name"

    .line 16
    invoke-virtual {p2, v7, v6}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v6, "sdk_type"

    const-string v7, "Android"

    invoke-virtual {p2, v6, v7}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 17
    invoke-static {p1}, Lcom/umeng/umzid/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v6

    const-string v7, "uuid"

    if-eqz v6, :cond_a

    invoke-interface {v6, v7, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_a

    :cond_a
    move-object v6, v2

    .line 18
    :goto_a
    invoke-virtual {p2, v7, v6}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v6, "source_id"

    const-string v7, "umeng"

    invoke-virtual {p2, v6, v7}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 19
    :try_start_a
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v6

    iget-object v6, v6, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2

    goto :goto_b

    :catch_2
    move-object v6, v5

    :goto_b
    const-string v7, "app_version"

    .line 20
    invoke-virtual {p2, v7, v6}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 21
    :try_start_b
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v6

    iget-object v6, v6, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v6, v6, Landroid/content/pm/ApplicationInfo;->labelRes:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_3

    goto :goto_c

    :catch_3
    move-object v6, v5

    :goto_c
    const-string v7, "app_name"

    .line 22
    invoke-virtual {p2, v7, v6}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 23
    :try_start_c
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v6

    iget-object v6, v6, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v6}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v6
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_4

    goto :goto_d

    :catch_4
    move-object v6, v5

    :goto_d
    const-string v7, "country"

    .line 24
    invoke-virtual {p2, v7, v6}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v6, "appkey"

    if-eqz p1, :cond_b

    .line 25
    invoke-static {p1}, Lcom/umeng/umzid/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v7

    if-eqz v7, :cond_b

    invoke-interface {v7, v6, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 26
    :cond_b
    invoke-virtual {p2, v6, v5}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    :try_start_d
    sget-object v5, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->UNKNOW:Ljava/lang/String;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    const-string v5, "getIdfa"

    :try_start_e
    new-array v6, v4, [Ljava/lang/Class;

    aput-object v0, v6, v3

    invoke-virtual {v1, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v3

    invoke-virtual {v0, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_c

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_c

    check-cast p1, Ljava/lang/String;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    move-object v2, p1

    :catchall_5
    :cond_c
    const-string p1, "gaid"

    .line 28
    invoke-virtual {p2, p1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object p2
.end method

.method public declared-synchronized getZID(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    move-object v0, p0

    .line 0
    monitor-enter v0

    if-nez p1, :cond_0

    :try_start_0
    const-string p1, ""
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :cond_0
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/umeng/umzid/c;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v1, Lcom/umeng/umzid/ZIDManager$c;

    invoke-direct {v1, p0, p1}, Lcom/umeng/umzid/ZIDManager$c;-><init>(Lcom/umeng/umzid/ZIDManager;Landroid/content/Context;)V

    invoke-static {v1}, Lcom/umeng/umzid/b;->a(Ljava/lang/Runnable;)V

    const-string p1, ""
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p1

    :cond_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public declared-synchronized init(Landroid/content/Context;Ljava/lang/String;Lcom/umeng/umzid/IZIDCompletionCallback;)V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    if-nez p1, :cond_1

    if-eqz p3, :cond_0

    :try_start_0
    const-string p1, "1001"

    const-string p2, "\u4f20\u5165\u53c2\u6570Context\u4e3anull"

    .line 12
    invoke-interface {p3, p1, p2}, Lcom/umeng/umzid/IZIDCompletionCallback;->onFailure(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    :cond_0
    monitor-exit v0

    return-void

    .line 21
    :cond_1
    :try_start_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    if-eqz p3, :cond_2

    const-string p1, "1003"

    const-string p2, "\u4f20\u5165\u53c2\u6570appkey\u4e3a\u7a7a"

    .line 33
    invoke-interface {p3, p1, p2}, Lcom/umeng/umzid/IZIDCompletionCallback;->onFailure(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 34
    :cond_2
    monitor-exit v0

    return-void

    .line 38
    :cond_3
    :try_start_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_4

    if-eqz p2, :cond_4

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {v1}, Lcom/umeng/umzid/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    if-eqz v2, :cond_4

    const-string v3, "appkey"

    invoke-interface {v2, v3, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 2
    :cond_4
    invoke-static {v1}, Lcom/umeng/umzid/c;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_0

    :cond_5
    new-instance v2, Lcom/umeng/umzid/ZIDManager$b;

    invoke-direct {v2, p0, v1}, Lcom/umeng/umzid/ZIDManager$b;-><init>(Lcom/umeng/umzid/ZIDManager;Landroid/content/Context;)V

    invoke-static {v2}, Lcom/umeng/umzid/b;->a(Ljava/lang/Runnable;)V

    if-eqz p3, :cond_7

    invoke-interface {p3, p2}, Lcom/umeng/umzid/IZIDCompletionCallback;->onSuccess(Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    :goto_0
    new-instance p2, Lcom/umeng/umzid/ZIDManager$a;

    invoke-direct {p2, p0, v1, p3}, Lcom/umeng/umzid/ZIDManager$a;-><init>(Lcom/umeng/umzid/ZIDManager;Landroid/content/Context;Lcom/umeng/umzid/IZIDCompletionCallback;)V

    invoke-static {p2}, Lcom/umeng/umzid/b;->a(Ljava/lang/Runnable;)V

    :cond_7
    :goto_1
    const-string p2, ""

    .line 3
    invoke-static {p1}, Lcom/umeng/umzid/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p3

    if-eqz p3, :cond_8

    const-string p2, "uuid"

    const-string v1, ""

    invoke-interface {p3, p2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 4
    :cond_8
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_9

    const-string p2, ""

    .line 5
    invoke-static {p1}, Lcom/umeng/umzid/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {p3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :catchall_0
    nop

    :goto_2
    if-eqz p1, :cond_9

    :try_start_4
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string p3, "uuid"

    invoke-interface {p1, p3, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_9
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p1

    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1
.end method
