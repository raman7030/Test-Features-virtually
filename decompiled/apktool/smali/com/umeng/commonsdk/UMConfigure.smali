.class public Lcom/umeng/commonsdk/UMConfigure;
.super Ljava/lang/Object;
.source "UMConfigure.java"


# static fields
.field public static AUTO_ACTIVITY_PAGE_COLLECTION:Lcom/umeng/analytics/MobclickAgent$PageMode; = null

.field public static final BUSINESS_TYPE:[Ljava/lang/String;

.field public static final DEVICE_TYPE_BOX:I = 0x2

.field public static final DEVICE_TYPE_PHONE:I = 0x1

.field public static final KEY_FILE_NAME_APPKEY:Ljava/lang/String; = "APPKEY"

.field public static final KEY_FILE_NAME_LOG:Ljava/lang/String; = "LOG"

.field public static final KEY_METHOD_NAME_PUSH_SETCHANNEL:Ljava/lang/String; = "setMessageChannel"

.field public static final KEY_METHOD_NAME_PUSH_SET_SECRET:Ljava/lang/String; = "setSecret"

.field public static final KEY_METHOD_NAME_SETAPPKEY:Ljava/lang/String; = "setAppkey"

.field public static final KEY_METHOD_NAME_SETCHANNEL:Ljava/lang/String; = "setChannel"

.field public static final KEY_METHOD_NAME_SETDEBUGMODE:Ljava/lang/String; = "setDebugMode"

.field public static PreInitLock:Ljava/lang/Object; = null

.field public static final TAG:Ljava/lang/String; = "UMConfigure"

.field public static final WRAPER_TYPE_COCOS2DX_X:Ljava/lang/String; = "Cocos2d-x"

.field public static final WRAPER_TYPE_COCOS2DX_XLUA:Ljava/lang/String; = "Cocos2d-x_lua"

.field public static final WRAPER_TYPE_FLUTTER:Ljava/lang/String; = "flutter"

.field public static final WRAPER_TYPE_HYBRID:Ljava/lang/String; = "hybrid"

.field public static final WRAPER_TYPE_NATIVE:Ljava/lang/String; = "native"

.field public static final WRAPER_TYPE_PHONEGAP:Ljava/lang/String; = "phonegap"

.field public static final WRAPER_TYPE_REACTNATIVE:Ljava/lang/String; = "react-native"

.field public static final WRAPER_TYPE_UNITY:Ljava/lang/String; = "Unity"

.field public static final WRAPER_TYPE_WEEX:Ljava/lang/String; = "weex"

.field public static debugLog:Z

.field public static isFinish:Z

.field public static isInit:Z

.field public static lock:Ljava/lang/Object;

.field public static lockObject:Ljava/lang/Object;

.field public static mOnGetOaidListener:Lcom/umeng/commonsdk/listener/OnGetOaidListener;

.field public static policyGrantInvokedFlag:I

.field public static policyGrantResult:I

.field public static preInitComplete:Z

.field public static preInitInvokedFlag:I

.field public static sAppkey:Ljava/lang/String;

.field public static sChannel:Ljava/lang/String;

.field public static shouldCheckShareSdk:Z

.field public static umDebugLog:Lcom/umeng/commonsdk/debug/UMLog;


# direct methods
.method public static constructor <clinit>()V
    .locals 12

    .line 64
    new-instance v0, Lcom/umeng/commonsdk/debug/UMLog;

    invoke-direct {v0}, Lcom/umeng/commonsdk/debug/UMLog;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/UMConfigure;->umDebugLog:Lcom/umeng/commonsdk/debug/UMLog;

    const/4 v0, 0x0

    .line 66
    sput-boolean v0, Lcom/umeng/commonsdk/UMConfigure;->preInitComplete:Z

    .line 67
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sput-object v1, Lcom/umeng/commonsdk/UMConfigure;->PreInitLock:Ljava/lang/Object;

    const-string v1, ""

    .line 68
    sput-object v1, Lcom/umeng/commonsdk/UMConfigure;->sAppkey:Ljava/lang/String;

    .line 69
    sput-object v1, Lcom/umeng/commonsdk/UMConfigure;->sChannel:Ljava/lang/String;

    .line 84
    sput-boolean v0, Lcom/umeng/commonsdk/UMConfigure;->isInit:Z

    .line 85
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sput-object v1, Lcom/umeng/commonsdk/UMConfigure;->lock:Ljava/lang/Object;

    .line 86
    sput v0, Lcom/umeng/commonsdk/UMConfigure;->preInitInvokedFlag:I

    .line 87
    sput v0, Lcom/umeng/commonsdk/UMConfigure;->policyGrantInvokedFlag:I

    .line 88
    sput v0, Lcom/umeng/commonsdk/UMConfigure;->policyGrantResult:I

    const/4 v1, 0x1

    .line 90
    sput-boolean v1, Lcom/umeng/commonsdk/UMConfigure;->shouldCheckShareSdk:Z

    .line 92
    sget-object v1, Lcom/umeng/analytics/MobclickAgent$PageMode;->AUTO:Lcom/umeng/analytics/MobclickAgent$PageMode;

    sput-object v1, Lcom/umeng/commonsdk/UMConfigure;->AUTO_ACTIVITY_PAGE_COLLECTION:Lcom/umeng/analytics/MobclickAgent$PageMode;

    const-string v10, "game"

    const-string v11, "zid"

    const-string v2, "apm"

    const-string v3, "push"

    const-string v4, "share"

    const-string v5, "ulink"

    const-string v6, "uverify"

    const-string v7, "usms"

    const-string v8, "urec"

    const-string v9, "abtest"

    .line 112
    filled-new-array/range {v2 .. v11}, [Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/umeng/commonsdk/UMConfigure;->BUSINESS_TYPE:[Ljava/lang/String;

    .line 303
    sput-boolean v0, Lcom/umeng/commonsdk/UMConfigure;->isFinish:Z

    .line 304
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/UMConfigure;->lockObject:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic access$000()Lcom/umeng/commonsdk/listener/OnGetOaidListener;
    .locals 1

    .line 58
    sget-object v0, Lcom/umeng/commonsdk/UMConfigure;->mOnGetOaidListener:Lcom/umeng/commonsdk/listener/OnGetOaidListener;

    return-object v0
.end method

.method public static checkShareSdk(Ljava/lang/Class;)Z
    .locals 1

    :try_start_0
    const-string v0, "isZyb"

    .line 322
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :catchall_0
    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static deleteModuleTag(Lcom/umeng/commonsdk/UMConfigure$BS_TYPE;Ljava/lang/String;)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    .line 1075
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 1080
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    array-length v0, v0

    const/16 v1, 0x40

    if-le v0, v1, :cond_2

    return-void

    .line 1086
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    const-string v0, ""

    .line 1088
    sget-object v1, Lcom/umeng/commonsdk/UMConfigure;->BUSINESS_TYPE:[Ljava/lang/String;

    array-length v2, v1

    if-ge p0, v2, :cond_3

    .line 1089
    aget-object v0, v1, p0

    .line 1091
    :cond_3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_4

    return-void

    .line 1095
    :cond_4
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 1096
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/TagHelper;->deleteModuleTag(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static getClass(Ljava/lang/String;)Ljava/lang/Class;
    .locals 0

    .line 123
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getDecInstanceObject(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 143
    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object p0, v0

    :goto_0
    if-eqz p0, :cond_0

    const/4 v1, 0x1

    .line 150
    invoke-virtual {p0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 152
    :try_start_1
    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_0
    return-object v0
.end method

.method public static getDecMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 1

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 192
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :goto_0
    if-eqz v0, :cond_0

    const/4 p0, 0x1

    .line 199
    invoke-virtual {v0, p0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :cond_0
    return-object v0
.end method

.method public static getInitStatus()Z
    .locals 2

    .line 308
    sget-object v0, Lcom/umeng/commonsdk/UMConfigure;->lockObject:Ljava/lang/Object;

    monitor-enter v0

    .line 309
    :try_start_0
    sget-boolean v1, Lcom/umeng/commonsdk/UMConfigure;->isFinish:Z

    .line 310
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static getModuleTags()Ljava/util/Map;
    .locals 1

    .line 1105
    :try_start_0
    invoke-static {}, Lcom/umeng/commonsdk/statistics/TagHelper;->getModuleTags()Ljava/util/Map;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getOaid(Landroid/content/Context;Lcom/umeng/commonsdk/listener/OnGetOaidListener;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 1200
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 1201
    sput-object p1, Lcom/umeng/commonsdk/UMConfigure;->mOnGetOaidListener:Lcom/umeng/commonsdk/listener/OnGetOaidListener;

    .line 1202
    new-instance p1, Ljava/lang/Thread;

    new-instance v0, Lcom/umeng/commonsdk/UMConfigure$4;

    invoke-direct {v0, p0}, Lcom/umeng/commonsdk/UMConfigure$4;-><init>(Landroid/content/Context;)V

    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 1210
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static getTestDeviceInfo(Landroid/content/Context;)[Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    if-eqz p0, :cond_0

    .line 1179
    :try_start_0
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getDeviceIdForGeneral(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 1180
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getMac(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x1

    aput-object p0, v0, v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-object v0
.end method

.method public static getUMIDString(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    if-eqz p0, :cond_0

    .line 1002
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 1003
    invoke-static {p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getUMId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getUmengZID(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    if-eqz p0, :cond_0

    .line 1011
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 1012
    invoke-static {p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getZid(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ignoreSdkCheck(Landroid/content/Context;)V
    .locals 0

    const/4 p0, 0x0

    .line 117
    sput-boolean p0, Lcom/umeng/commonsdk/UMConfigure;->shouldCheckShareSdk:Z

    return-void
.end method

.method public static init(Landroid/content/Context;ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 338
    invoke-static {p0, v0, v0, p1, p2}, Lcom/umeng/commonsdk/UMConfigure;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public static init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 10

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 451
    :try_start_0
    sget-boolean v0, Lcom/umeng/commonsdk/UMConfigure;->isInit:Z

    if-eqz v0, :cond_1

    return-void

    .line 458
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    .line 459
    invoke-static {v4}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getInstance(Landroid/content/Context;)Lcom/umeng/commonsdk/service/UMGlobalContext;

    .line 462
    invoke-static {}, Lcom/umeng/commonsdk/utils/c;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 464
    invoke-static {}, Lcom/umeng/commonsdk/UMConfigure;->isPreInit()Z

    move-result p3

    if-nez p3, :cond_2

    .line 465
    invoke-static {v4, p1, p2}, Lcom/umeng/commonsdk/UMConfigure;->preInitInternal(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 466
    invoke-static {}, Lcom/umeng/commonsdk/UMConfigure;->isPreInit()Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_6

    .line 472
    :cond_2
    invoke-static {v4}, Lcom/umeng/commonsdk/internal/b;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/umeng/commonsdk/internal/b;->a()Lcom/umeng/commonsdk/internal/c;

    move-result-object p1

    const p2, 0x8022

    .line 471
    invoke-static {v4, p2, p1, v2}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_c

    return-void

    :cond_3
    :try_start_1
    const-string v0, "com.umeng.umzid.ZIDManager"

    .line 478
    invoke-static {v0}, Lcom/umeng/commonsdk/UMConfigure;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_4

    .line 481
    new-instance v0, Lcom/umeng/commonsdk/UMConfigure$1;

    invoke-direct {v0, v4}, Lcom/umeng/commonsdk/UMConfigure$1;-><init>(Landroid/content/Context;)V

    .line 493
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    :cond_4
    :try_start_2
    const-string v0, "com.umeng.message.PushAgent"

    .line 503
    invoke-static {v0}, Lcom/umeng/commonsdk/UMConfigure;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 505
    invoke-static {v0}, Lcom/umeng/commonsdk/UMConfigure;->checkShareSdk(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 507
    sget-boolean v0, Lcom/umeng/commonsdk/UMConfigure;->shouldCheckShareSdk:Z

    if-eqz v0, :cond_5

    .line 508
    new-instance v0, Lcom/umeng/commonsdk/UMConfigure$2;

    invoke-direct {v0, v4}, Lcom/umeng/commonsdk/UMConfigure$2;-><init>(Landroid/content/Context;)V

    .line 520
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    :cond_5
    :try_start_3
    const-string v0, "com.umeng.socialize.UMShareAPI"

    .line 528
    invoke-static {v0}, Lcom/umeng/commonsdk/UMConfigure;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 530
    invoke-static {v0}, Lcom/umeng/commonsdk/UMConfigure;->checkShareSdk(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 532
    sget-boolean v0, Lcom/umeng/commonsdk/UMConfigure;->shouldCheckShareSdk:Z

    if-eqz v0, :cond_6

    .line 533
    new-instance v0, Lcom/umeng/commonsdk/UMConfigure$3;

    invoke-direct {v0, v4}, Lcom/umeng/commonsdk/UMConfigure$3;-><init>(Landroid/content/Context;)V

    .line 545
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 556
    :catchall_2
    :cond_6
    :try_start_4
    invoke-static {}, Lcom/umeng/commonsdk/UMConfigure;->isPreInit()Z

    move-result v0

    if-nez v0, :cond_7

    .line 557
    invoke-static {v4, p1, p2}, Lcom/umeng/commonsdk/UMConfigure;->preInitInternal(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 558
    invoke-static {}, Lcom/umeng/commonsdk/UMConfigure;->isPreInit()Z

    move-result p1

    if-nez p1, :cond_7

    goto/16 :goto_6

    .line 563
    :cond_7
    invoke-static {v4}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->registerNetReceiver(Landroid/content/Context;)V

    .line 565
    sget-object p1, Lcom/umeng/commonsdk/UMConfigure;->sAppkey:Ljava/lang/String;

    invoke-static {v4, p1}, Lcom/umeng/commonsdk/utils/UMUtils;->setAppkey(Landroid/content/Context;Ljava/lang/String;)V

    .line 566
    invoke-static {v4}, Lcom/umeng/commonsdk/utils/UMUtils;->getLastAppkey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 567
    sget-object p2, Lcom/umeng/commonsdk/UMConfigure;->sAppkey:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    const/4 v0, 0x2

    if-nez p2, :cond_9

    sget-object p2, Lcom/umeng/commonsdk/UMConfigure;->sAppkey:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    .line 568
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_8

    .line 569
    sget-boolean p1, Lcom/umeng/commonsdk/UMConfigure;->debugLog:Z

    if-eqz p1, :cond_8

    const-string p1, "AppKey\u6539\u53d8!!!"

    const-string p2, ""

    .line 570
    invoke-static {p1, v0, p2}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(Ljava/lang/String;ILjava/lang/String;)V

    .line 573
    :cond_8
    sget-object p1, Lcom/umeng/commonsdk/UMConfigure;->sAppkey:Ljava/lang/String;

    invoke-static {v4, p1}, Lcom/umeng/commonsdk/utils/UMUtils;->setLastAppkey(Landroid/content/Context;Ljava/lang/String;)V

    .line 575
    :cond_9
    sget-boolean p1, Lcom/umeng/commonsdk/UMConfigure;->debugLog:Z

    const/4 p2, 0x3

    if-eqz p1, :cond_a

    .line 579
    invoke-static {v4}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppkeyByXML(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 580
    sget-object v5, Lcom/umeng/commonsdk/UMConfigure;->sAppkey:Ljava/lang/String;

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_a

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_a

    sget-object v5, Lcom/umeng/commonsdk/UMConfigure;->sAppkey:Ljava/lang/String;

    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    const-string v5, "@"

    const-string v6, "#"

    .line 581
    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v5

    .line 582
    sget-object v6, Lcom/umeng/commonsdk/UMConfigure;->sAppkey:Ljava/lang/String;

    filled-new-array {v6, p1}, [Ljava/lang/String;

    move-result-object p1

    const-string v6, "\u8bf7\u6ce8\u610f\uff1a\u60a8init\u63a5\u53e3\u4e2d\u8bbe\u7f6e\u7684AppKey\u662f@\uff0cmanifest\u4e2d\u8bbe\u7f6e\u7684AppKey\u662f#\uff0cinit\u63a5\u53e3\u8bbe\u7f6e\u7684AppKey\u4f1a\u8986\u76d6manifest\u4e2d\u8bbe\u7f6e\u7684AppKey"

    const-string v7, ""

    .line 583
    invoke-static {v6, p2, v7, v5, p1}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V

    .line 586
    :cond_a
    sget-object p1, Lcom/umeng/commonsdk/UMConfigure;->sChannel:Ljava/lang/String;

    invoke-static {v4, p1}, Lcom/umeng/commonsdk/utils/UMUtils;->setChannel(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_c

    .line 598
    :try_start_5
    const-class p1, Lcom/umeng/analytics/MobclickAgent;

    const-string v5, "init"

    new-array v6, v3, [Ljava/lang/Class;

    .line 600
    const-class v7, Landroid/content/Context;

    aput-object v7, v6, v1

    invoke-virtual {p1, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    if-eqz v5, :cond_c

    .line 602
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v6, v3, [Ljava/lang/Object;

    aput-object v4, v6, v1

    .line 603
    invoke-virtual {v5, p1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "header_first_resume"

    .line 604
    invoke-static {v5}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_b

    const-string v5, "MobclickRT"

    const-string v6, "--->>> FirstResumeTrigger enabled."

    .line 605
    invoke-static {v5, v6}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 606
    invoke-static {v4}, Lcom/umeng/analytics/pro/l;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/l;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/umeng/analytics/pro/l;->b(Landroid/content/Context;)V

    goto :goto_0

    :cond_b
    const-string v5, "MobclickRT"

    const-string v6, "--->>> FirstResumeTrigger disabled."

    .line 608
    invoke-static {v5, v6}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 610
    :goto_0
    sget-boolean v5, Lcom/umeng/commonsdk/UMConfigure;->debugLog:Z

    if-eqz v5, :cond_c

    const-string v5, "\u7edf\u8ba1SDK\u521d\u59cb\u5316\u6210\u529f"

    const-string v6, ""

    .line 611
    invoke-static {v5, v0, v6}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(Ljava/lang/String;ILjava/lang/String;)V

    :cond_c
    const-string v5, "com.umeng.analytics.game.UMGameAgent"

    .line 615
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    const-string v5, "setGameScenarioType"

    new-array v6, v3, [Ljava/lang/Class;

    .line 617
    const-class v7, Landroid/content/Context;

    aput-object v7, v6, v1

    invoke-virtual {p1, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    if-eqz v5, :cond_d

    .line 619
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v6, v3, [Ljava/lang/Object;

    aput-object v4, v6, v1

    .line 620
    invoke-virtual {v5, p1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 625
    :cond_d
    sget-object p1, Lcom/umeng/commonsdk/statistics/b;->a:Ljava/lang/String;

    const-string v5, "e"

    invoke-virtual {p1, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    if-ltz p1, :cond_e

    .line 627
    const-class p1, Lcom/umeng/analytics/MobclickAgent;

    const-string v5, "disableExceptionCatch"

    .line 629
    invoke-virtual {p1, v5, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    if-eqz v5, :cond_e

    .line 631
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 632
    invoke-virtual {v5, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    :cond_e
    :try_start_6
    const-string p1, "com.umeng.message.MessageSharedPrefs"

    .line 642
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-string v5, "getInstance"

    new-array v6, v3, [Ljava/lang/Class;

    .line 644
    const-class v7, Landroid/content/Context;

    aput-object v7, v6, v1

    invoke-virtual {p1, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    if-eqz v5, :cond_12

    new-array v6, v3, [Ljava/lang/Object;

    aput-object v4, v6, v1

    .line 646
    invoke-virtual {v5, p1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_12

    const-string v6, "setMessageAppKey"

    new-array v7, v3, [Ljava/lang/Class;

    .line 648
    const-class v8, Ljava/lang/String;

    aput-object v8, v7, v1

    invoke-virtual {p1, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    if-eqz v6, :cond_f

    .line 650
    invoke-virtual {v6, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v7, v3, [Ljava/lang/Object;

    .line 651
    sget-object v8, Lcom/umeng/commonsdk/UMConfigure;->sAppkey:Ljava/lang/String;

    aput-object v8, v7, v1

    invoke-virtual {v6, v5, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 652
    sget-boolean v6, Lcom/umeng/commonsdk/UMConfigure;->debugLog:Z

    if-eqz v6, :cond_f

    const-string v6, "PUSH AppKey\u8bbe\u7f6e\u6210\u529f"

    const-string v7, ""

    .line 653
    invoke-static {v6, v0, v7}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(Ljava/lang/String;ILjava/lang/String;)V

    :cond_f
    const-string v6, "setMessageChannel"

    new-array v7, v3, [Ljava/lang/Class;

    .line 657
    const-class v8, Ljava/lang/String;

    aput-object v8, v7, v1

    invoke-virtual {p1, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    if-eqz v6, :cond_10

    .line 659
    invoke-virtual {v6, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v7, v3, [Ljava/lang/Object;

    .line 660
    sget-object v8, Lcom/umeng/commonsdk/UMConfigure;->sChannel:Ljava/lang/String;

    aput-object v8, v7, v1

    invoke-virtual {v6, v5, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 661
    sget-boolean v6, Lcom/umeng/commonsdk/UMConfigure;->debugLog:Z

    if-eqz v6, :cond_10

    const-string v6, "PUSH Channel\u8bbe\u7f6e\u6210\u529f"

    const-string v7, ""

    .line 662
    invoke-static {v6, v0, v7}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(Ljava/lang/String;ILjava/lang/String;)V

    .line 666
    :cond_10
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_11

    goto :goto_1

    :cond_11
    const-string v6, "setMessageAppSecret"

    new-array v7, v3, [Ljava/lang/Class;

    .line 674
    const-class v8, Ljava/lang/String;

    aput-object v8, v7, v1

    invoke-virtual {p1, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_12

    .line 676
    invoke-virtual {p1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v6, v3, [Ljava/lang/Object;

    aput-object p4, v6, v1

    .line 677
    invoke-virtual {p1, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 678
    sget-boolean p1, Lcom/umeng/commonsdk/UMConfigure;->debugLog:Z

    if-eqz p1, :cond_12

    const-string p1, "PUSH Secret\u8bbe\u7f6e\u6210\u529f"

    const-string v5, ""

    .line 679
    invoke-static {p1, v0, v5}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_c

    :catch_0
    :cond_12
    :goto_1
    :try_start_7
    const-string p1, "com.umeng.socialize.UMShareAPI"

    .line 693
    invoke-static {p1}, Lcom/umeng/commonsdk/UMConfigure;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-string v5, "APPKEY"

    .line 694
    sget-object v6, Lcom/umeng/commonsdk/UMConfigure;->sAppkey:Ljava/lang/String;

    invoke-static {p1, v5, v6}, Lcom/umeng/commonsdk/UMConfigure;->setFile(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_13

    const-string v5, "init"

    new-array v6, v0, [Ljava/lang/Class;

    .line 696
    const-class v7, Landroid/content/Context;

    aput-object v7, v6, v1

    const-class v7, Ljava/lang/String;

    aput-object v7, v6, v3

    invoke-virtual {p1, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    if-eqz v5, :cond_13

    .line 698
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v6, v0, [Ljava/lang/Object;

    aput-object v4, v6, v1

    .line 699
    sget-object v7, Lcom/umeng/commonsdk/UMConfigure;->sAppkey:Ljava/lang/String;

    aput-object v7, v6, v3

    invoke-virtual {v5, p1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 701
    sget-boolean p1, Lcom/umeng/commonsdk/UMConfigure;->debugLog:Z

    if-eqz p1, :cond_13

    const-string p1, "Share AppKey\u8bbe\u7f6e\u6210\u529f"

    const-string v5, ""

    .line 702
    invoke-static {p1, v0, v5}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 712
    :catchall_4
    :cond_13
    :try_start_8
    invoke-static {p3}, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->setDeviceType(I)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_c

    :try_start_9
    const-string p1, "com.umeng.error.UMError"

    .line 716
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-string v5, "init"

    new-array v6, v3, [Ljava/lang/Class;

    .line 719
    const-class v7, Landroid/content/Context;

    aput-object v7, v6, v1

    invoke-virtual {p1, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    if-eqz v5, :cond_14

    .line 721
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v6, v3, [Ljava/lang/Object;

    aput-object v4, v6, v1

    .line 722
    invoke-virtual {v5, p1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 723
    sget-boolean p1, Lcom/umeng/commonsdk/UMConfigure;->debugLog:Z

    if-eqz p1, :cond_14

    const-string p1, "\u9519\u8bef\u5206\u6790SDK\u521d\u59cb\u5316\u6210\u529f"

    const-string v5, ""

    .line 724
    invoke-static {p1, v0, v5}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    :catchall_5
    :cond_14
    :try_start_a
    const-string p1, "com.umeng.umcrash.UMCrash"

    .line 733
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    .line 735
    sget v5, Lcom/umeng/commonsdk/statistics/SdkVersion;->SDK_TYPE:I

    if-ne v5, v3, :cond_15

    const-string v5, "useIntlServices"

    new-array v6, v3, [Ljava/lang/Class;

    .line 737
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v7, v6, v1

    invoke-virtual {p1, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    if-eqz v5, :cond_15

    .line 739
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v6, v3, [Ljava/lang/Object;

    .line 740
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v7, v6, v1

    invoke-virtual {v5, p1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_15
    const-string v5, "init"

    new-array v6, p2, [Ljava/lang/Class;

    .line 743
    const-class v7, Landroid/content/Context;

    aput-object v7, v6, v1

    const-class v7, Ljava/lang/String;

    aput-object v7, v6, v3

    aput-object v7, v6, v0

    invoke-virtual {p1, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    if-eqz v5, :cond_16

    .line 745
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v6, p2, [Ljava/lang/Object;

    aput-object v4, v6, v1

    .line 746
    sget-object v7, Lcom/umeng/commonsdk/UMConfigure;->sAppkey:Ljava/lang/String;

    aput-object v7, v6, v3

    sget-object v7, Lcom/umeng/commonsdk/UMConfigure;->sChannel:Ljava/lang/String;

    aput-object v7, v6, v0

    invoke-virtual {v5, p1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 747
    sget-boolean p1, Lcom/umeng/commonsdk/UMConfigure;->debugLog:Z

    if-eqz p1, :cond_16

    const-string p1, "APM SDK\u521d\u59cb\u5316\u6210\u529f"

    const-string v5, ""

    .line 748
    invoke-static {p1, v0, v5}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    :catchall_6
    :cond_16
    :try_start_b
    const-string p1, "com.umeng.vt.facade.EventFacade"

    .line 756
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-string v5, "init"

    const/4 v6, 0x5

    new-array v7, v6, [Ljava/lang/Class;

    .line 757
    const-class v8, Landroid/app/Application;

    aput-object v8, v7, v1

    const-class v8, Ljava/lang/String;

    aput-object v8, v7, v3

    aput-object v8, v7, v0

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v9, v7, p2

    const/4 v9, 0x4

    aput-object v8, v7, v9

    invoke-virtual {p1, v5, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_17

    .line 759
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    new-array v5, v6, [Ljava/lang/Object;

    aput-object v4, v5, v1

    sget-object v6, Lcom/umeng/commonsdk/UMConfigure;->sAppkey:Ljava/lang/String;

    aput-object v6, v5, v3

    sget-object v6, Lcom/umeng/commonsdk/UMConfigure;->sChannel:Ljava/lang/String;

    aput-object v6, v5, v0

    aput-object p3, v5, p2

    aput-object p4, v5, v9

    invoke-virtual {p1, v2, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "MobclickRT"

    const-string p2, "--->>>\u521d\u59cb\u5316 EventFacade \u6210\u529f."

    .line 760
    invoke-static {p1, p2}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/lang/ClassNotFoundException; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    :catch_1
    :catchall_7
    :cond_17
    :try_start_c
    const-string p1, "com.umeng.vt.common.VTTracker"

    .line 768
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-string p2, "init"

    new-array p3, v0, [Ljava/lang/Class;

    .line 769
    const-class p4, Landroid/app/Application;

    aput-object p4, p3, v1

    const-class p4, Ljava/lang/String;

    aput-object p4, p3, v3

    invoke-virtual {p1, p2, p3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_18

    new-array p2, v0, [Ljava/lang/Object;

    aput-object v4, p2, v1

    .line 771
    sget-object p3, Lcom/umeng/commonsdk/UMConfigure;->sAppkey:Ljava/lang/String;

    aput-object p3, p2, v3

    invoke-virtual {p1, v2, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "MobclickRT"

    const-string p2, "--->>>\u521d\u59cb\u5316 VTTracker \u6210\u529f."

    .line 772
    invoke-static {p1, p2}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catch Ljava/lang/ClassNotFoundException; {:try_start_c .. :try_end_c} :catch_2
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 779
    :catch_2
    :catchall_8
    :cond_18
    :try_start_d
    sget-object p1, Lcom/umeng/commonsdk/UMConfigure;->lockObject:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_3
    .catchall {:try_start_d .. :try_end_d} :catchall_c

    .line 780
    :try_start_e
    sput-boolean v3, Lcom/umeng/commonsdk/UMConfigure;->isFinish:Z

    .line 781
    monitor-exit v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_b

    .line 784
    :try_start_f
    invoke-static {v4}, Lcom/umeng/commonsdk/UMConfigure;->needCheckPolicyResult(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_19

    .line 788
    sget-object p1, Lcom/umeng/commonsdk/UMConfigure;->lock:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_3
    .catchall {:try_start_f .. :try_end_f} :catchall_c

    .line 799
    :try_start_10
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    const-string p3, "preInitInvoked"

    .line 800
    sget p4, Lcom/umeng/commonsdk/UMConfigure;->preInitInvokedFlag:I

    invoke-virtual {p2, p3, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p3, "policyGrantInvoked"

    .line 801
    sget p4, Lcom/umeng/commonsdk/UMConfigure;->policyGrantInvokedFlag:I

    invoke-virtual {p2, p3, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string p3, "policyGrantResult"

    .line 802
    sget p4, Lcom/umeng/commonsdk/UMConfigure;->policyGrantResult:I

    invoke-virtual {p2, p3, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 804
    invoke-static {v4}, Lcom/umeng/commonsdk/internal/b;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/b;

    move-result-object p3

    invoke-virtual {p3}, Lcom/umeng/commonsdk/internal/b;->a()Lcom/umeng/commonsdk/internal/c;

    move-result-object p3

    const p4, 0x8019

    .line 803
    invoke-static {v4, p4, p3, p2}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    .line 808
    :catchall_9
    :try_start_11
    monitor-exit v0

    goto :goto_2

    :catchall_a
    move-exception p2

    monitor-exit p1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_a

    :try_start_12
    throw p2

    .line 815
    :cond_19
    :goto_2
    invoke-static {v4}, Lcom/umeng/commonsdk/UMConfigure;->needSendZcfgEnv(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_1a

    const-string p1, "MobclickRT"

    const-string p2, "--->>> \u8d70\u96f6\u53f7\u62a5\u6587\u53d1\u9001\u903b\u8f91"

    .line 817
    invoke-static {p1, p2}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 820
    invoke-static {v4}, Lcom/umeng/commonsdk/internal/b;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/umeng/commonsdk/internal/b;->a()Lcom/umeng/commonsdk/internal/c;

    move-result-object p1

    const p2, 0x800d

    .line 819
    invoke-static {v4, p2, p1, v2}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    goto :goto_3

    :cond_1a
    const-string p1, "MobclickRT"

    const-string p2, "--->>> \u8d70\u6b63\u5e38\u903b\u8f91."

    .line 823
    invoke-static {p1, p2}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 824
    invoke-static {}, Lcom/umeng/commonsdk/config/FieldManager;->b()Z

    move-result p1

    if-eqz p1, :cond_1b

    .line 827
    invoke-static {v4}, Lcom/umeng/commonsdk/internal/b;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/umeng/commonsdk/internal/b;->a()Lcom/umeng/commonsdk/internal/c;

    move-result-object p1

    const p2, 0x8017

    .line 826
    invoke-static {v4, p2, p1, v2}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 832
    :cond_1b
    :goto_3
    invoke-static {}, Lcom/umeng/commonsdk/UMConfigure;->isDebugLog()Z

    move-result p1

    if-eqz p1, :cond_1c

    .line 834
    invoke-static {v4}, Lcom/umeng/commonsdk/UMConfigureInternation;->doSelfCheck(Landroid/content/Context;)V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_3
    .catchall {:try_start_12 .. :try_end_12} :catchall_c

    goto :goto_4

    :catchall_b
    move-exception p1

    .line 781
    :try_start_13
    monitor-exit v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_b

    :try_start_14
    throw p1
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_3
    .catchall {:try_start_14 .. :try_end_14} :catchall_c

    :catchall_c
    move-exception p1

    .line 842
    sget-boolean p2, Lcom/umeng/commonsdk/UMConfigure;->debugLog:Z

    if-eqz p2, :cond_1c

    .line 843
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    goto :goto_4

    :catch_3
    move-exception p1

    .line 838
    sget-boolean p2, Lcom/umeng/commonsdk/UMConfigure;->debugLog:Z

    if-eqz p2, :cond_1c

    .line 839
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 855
    :cond_1c
    :goto_4
    :try_start_15
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "com.umeng.cconfig.UMRemoteConfig"

    .line 856
    invoke-static {p2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p2

    const-string p3, "getInstance"

    .line 858
    invoke-virtual {p2, p3, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p3

    if-eqz p3, :cond_1d

    .line 860
    invoke-virtual {p3, p2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_1d

    const-string p4, "init"

    new-array v0, v3, [Ljava/lang/Class;

    .line 862
    const-class v4, Landroid/content/Context;

    aput-object v4, v0, v1

    invoke-virtual {p2, p4, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p2

    if-eqz p2, :cond_1d

    .line 864
    invoke-virtual {p2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array p4, v3, [Ljava/lang/Object;

    aput-object p1, p4, v1

    .line 865
    invoke-virtual {p2, p3, p4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_4

    goto :goto_5

    :catch_4
    nop

    .line 876
    :cond_1d
    :goto_5
    invoke-static {p0}, Lcom/umeng/commonsdk/internal/b;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/umeng/commonsdk/internal/b;->a()Lcom/umeng/commonsdk/internal/c;

    move-result-object p1

    const p2, 0x8024

    .line 875
    invoke-static {p0, p2, p1, v2}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 878
    sget-boolean p0, Lcom/umeng/commonsdk/UMConfigure;->isInit:Z

    if-nez p0, :cond_1e

    .line 879
    sput-boolean v3, Lcom/umeng/commonsdk/UMConfigure;->isInit:Z

    :cond_1e
    :goto_6
    return-void
.end method

.method public static invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 224
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static invoke(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
    .locals 1

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    .line 250
    :try_start_0
    invoke-virtual {p0, v0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static isDebugLog()Z
    .locals 1

    .line 930
    sget-boolean v0, Lcom/umeng/commonsdk/UMConfigure;->debugLog:Z

    return v0
.end method

.method public static isPreInit()Z
    .locals 2

    .line 342
    sget-object v0, Lcom/umeng/commonsdk/UMConfigure;->PreInitLock:Ljava/lang/Object;

    monitor-enter v0

    .line 343
    :try_start_0
    sget-boolean v1, Lcom/umeng/commonsdk/UMConfigure;->preInitComplete:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 344
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static isSilentMode()Z
    .locals 3

    .line 924
    invoke-static {}, Lcom/umeng/commonsdk/utils/c;->a()Z

    move-result v0

    .line 925
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "--->>> isSilentMode() return: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "MobclickRT"

    invoke-static {v2, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method

.method public static needCheckPolicyResult(Landroid/content/Context;)Z
    .locals 3

    .line 913
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    .line 914
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p0, Ljava/io/File;->separator:Ljava/lang/String;

    const-string v2, "umeng_policy_result_flag"

    .line 0
    invoke-static {v1, p0, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 914
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 916
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method public static needSendZcfgEnv(Landroid/content/Context;)Z
    .locals 3

    .line 893
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    .line 894
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p0, Ljava/io/File;->separator:Ljava/lang/String;

    const-string v2, "umeng_zcfg_flag"

    .line 0
    invoke-static {v1, p0, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 894
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 896
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method public static preInit(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 348
    sget-object v0, Lcom/umeng/commonsdk/UMConfigure;->lock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 349
    :try_start_0
    sput v1, Lcom/umeng/commonsdk/UMConfigure;->preInitInvokedFlag:I

    .line 350
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 351
    invoke-static {p0, p1, p2}, Lcom/umeng/commonsdk/UMConfigure;->preInitInternal(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p0

    .line 350
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static preInitInternal(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 384
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 386
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 387
    invoke-static {p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppkeyByXML(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 391
    :cond_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 392
    invoke-static {p0}, Lcom/umeng/commonsdk/utils/UMUtils;->getChannelByXML(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    .line 394
    :cond_2
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p2, "Unknown"

    .line 398
    :cond_3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_0

    .line 401
    :cond_4
    sput-object p1, Lcom/umeng/commonsdk/UMConfigure;->sAppkey:Ljava/lang/String;

    .line 402
    sput-object p2, Lcom/umeng/commonsdk/UMConfigure;->sChannel:Ljava/lang/String;

    .line 404
    invoke-static {p0}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getInstance(Landroid/content/Context;)Lcom/umeng/commonsdk/service/UMGlobalContext;

    .line 406
    invoke-static {p0}, Lcom/umeng/analytics/pro/l;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/l;

    .line 409
    invoke-static {p0}, Lcom/umeng/commonsdk/UMConfigure;->needSendZcfgEnv(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 410
    invoke-static {}, Lcom/umeng/commonsdk/config/FieldManager;->a()Lcom/umeng/commonsdk/config/FieldManager;

    move-result-object p1

    .line 411
    invoke-virtual {p1, p0}, Lcom/umeng/commonsdk/config/FieldManager;->a(Landroid/content/Context;)V

    .line 414
    :cond_5
    sget-object p0, Lcom/umeng/commonsdk/UMConfigure;->PreInitLock:Ljava/lang/Object;

    move-object v0, p0

    monitor-enter v0

    const/4 p0, 0x1

    .line 415
    :try_start_0
    sput-boolean p0, Lcom/umeng/commonsdk/UMConfigure;->preInitComplete:Z

    .line 416
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 418
    invoke-static {}, Lcom/umeng/commonsdk/utils/c;->a()Z

    move-result p0

    .line 420
    sget-boolean p1, Lcom/umeng/commonsdk/UMConfigure;->debugLog:Z

    if-eqz p1, :cond_6

    if-eqz p0, :cond_6

    const-string p0, "MobclickRT"

    const-string p1, "--->>> \u5f53\u524d\u5904\u4e8e\u9759\u9ed8\u6a21\u5f0f!"

    .line 422
    invoke-static {p0, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_0
    return-void

    :catchall_0
    move-exception p0

    .line 416
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static setCheckDevice(Z)V
    .locals 0

    .line 1118
    sput-boolean p0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->CHECK_DEVICE:Z

    return-void
.end method

.method public static setEncryptEnabled(Z)V
    .locals 0

    .line 991
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/b;->a(Z)V

    return-void
.end method

.method public static setFile(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 270
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    .line 271
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static setFile(Ljava/lang/Class;Ljava/lang/String;Z)V
    .locals 0

    if-eqz p0, :cond_0

    .line 288
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    .line 289
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static setLatencyWindow(J)V
    .locals 0

    long-to-int p1, p0

    mul-int/lit16 p1, p1, 0x3e8

    .line 1028
    sput p1, Lcom/umeng/commonsdk/statistics/a;->c:I

    return-void
.end method

.method public static setLogEnabled(Z)V
    .locals 7

    .line 940
    :try_start_0
    sput-boolean p0, Lcom/umeng/commonsdk/UMConfigure;->debugLog:Z

    .line 954
    sput-boolean p0, Lcom/umeng/commonsdk/statistics/common/MLog;->DEBUG:Z

    const-string v0, "com.umeng.message.PushAgent"

    .line 957
    invoke-static {v0}, Lcom/umeng/commonsdk/UMConfigure;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 958
    invoke-static {v0}, Lcom/umeng/commonsdk/UMConfigure;->getDecInstanceObject(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "setDebugMode"

    .line 959
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Class;

    const/4 v6, 0x0

    aput-object v3, v5, v6

    invoke-static {v0, v2, v5}, Lcom/umeng/commonsdk/UMConfigure;->getDecMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 961
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    new-array v5, v4, [Ljava/lang/Object;

    aput-object v2, v5, v6

    invoke-static {v0, v1, v5}, Lcom/umeng/commonsdk/UMConfigure;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)V

    const-string v0, "com.umeng.socialize.Config"

    .line 967
    invoke-static {v0}, Lcom/umeng/commonsdk/UMConfigure;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "DEBUG"

    .line 968
    invoke-static {v0, v1, p0}, Lcom/umeng/commonsdk/UMConfigure;->setFile(Ljava/lang/Class;Ljava/lang/String;Z)V

    const-string v0, "com.umeng.umcrash.UMCrash"

    .line 970
    invoke-static {v0}, Lcom/umeng/commonsdk/UMConfigure;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "setDebug"

    new-array v2, v4, [Ljava/lang/Class;

    aput-object v3, v2, v6

    .line 971
    invoke-static {v0, v1, v2}, Lcom/umeng/commonsdk/UMConfigure;->getDecMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 972
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    new-array v1, v4, [Ljava/lang/Object;

    aput-object p0, v1, v6

    invoke-static {v0, v1}, Lcom/umeng/commonsdk/UMConfigure;->invoke(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 979
    sget-boolean v0, Lcom/umeng/commonsdk/UMConfigure;->debugLog:Z

    if-eqz v0, :cond_0

    .line 980
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    goto :goto_0

    :catch_0
    move-exception p0

    .line 975
    sget-boolean v0, Lcom/umeng/commonsdk/UMConfigure;->debugLog:Z

    if-eqz v0, :cond_0

    .line 976
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_0
    :goto_0
    return-void
.end method

.method public static setModuleTag(Lcom/umeng/commonsdk/UMConfigure$BS_TYPE;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    .line 1037
    :cond_0
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 1041
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    array-length v0, v0

    const/16 v1, 0x40

    if-le v0, v1, :cond_2

    return-void

    .line 1046
    :cond_2
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    array-length v0, v0

    const/16 v1, 0x80

    if-le v0, v1, :cond_3

    return-void

    .line 1052
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    const-string v0, ""

    .line 1054
    sget-object v1, Lcom/umeng/commonsdk/UMConfigure;->BUSINESS_TYPE:[Ljava/lang/String;

    array-length v2, v1

    if-ge p0, v2, :cond_4

    .line 1055
    aget-object v0, v1, p0

    .line 1057
    :cond_4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_5

    return-void

    .line 1061
    :cond_5
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 1063
    invoke-static {p0, p2}, Lcom/umeng/commonsdk/statistics/TagHelper;->setModuleTag(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_6
    :goto_0
    return-void
.end method

.method public static setProcessEvent(Z)V
    .locals 0

    .line 1024
    sput-boolean p0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->SUB_PROCESS_EVENT:Z

    return-void
.end method

.method public static setWraperType(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1132
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string v0, "native"

    .line 1136
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1137
    sput-object v0, Lcom/umeng/commonsdk/stateless/a;->a:Ljava/lang/String;

    .line 1138
    sput-object v0, Lcom/umeng/commonsdk/statistics/a;->a:Ljava/lang/String;

    goto/16 :goto_0

    :cond_1
    const-string v0, "Cocos2d-x"

    .line 1139
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1140
    sput-object v0, Lcom/umeng/commonsdk/stateless/a;->a:Ljava/lang/String;

    .line 1141
    sput-object v0, Lcom/umeng/commonsdk/statistics/a;->a:Ljava/lang/String;

    goto :goto_0

    :cond_2
    const-string v0, "Cocos2d-x_lua"

    .line 1142
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1143
    sput-object v0, Lcom/umeng/commonsdk/stateless/a;->a:Ljava/lang/String;

    .line 1144
    sput-object v0, Lcom/umeng/commonsdk/statistics/a;->a:Ljava/lang/String;

    goto :goto_0

    :cond_3
    const-string v0, "Unity"

    .line 1145
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 1146
    sput-object v0, Lcom/umeng/commonsdk/stateless/a;->a:Ljava/lang/String;

    .line 1147
    sput-object v0, Lcom/umeng/commonsdk/statistics/a;->a:Ljava/lang/String;

    goto :goto_0

    :cond_4
    const-string v0, "react-native"

    .line 1148
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 1149
    sput-object v0, Lcom/umeng/commonsdk/stateless/a;->a:Ljava/lang/String;

    .line 1150
    sput-object v0, Lcom/umeng/commonsdk/statistics/a;->a:Ljava/lang/String;

    goto :goto_0

    :cond_5
    const-string v0, "phonegap"

    .line 1151
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 1152
    sput-object v0, Lcom/umeng/commonsdk/stateless/a;->a:Ljava/lang/String;

    .line 1153
    sput-object v0, Lcom/umeng/commonsdk/statistics/a;->a:Ljava/lang/String;

    goto :goto_0

    :cond_6
    const-string v0, "weex"

    .line 1154
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 1155
    sput-object v0, Lcom/umeng/commonsdk/stateless/a;->a:Ljava/lang/String;

    .line 1156
    sput-object v0, Lcom/umeng/commonsdk/statistics/a;->a:Ljava/lang/String;

    goto :goto_0

    :cond_7
    const-string v0, "hybrid"

    .line 1157
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 1158
    sput-object v0, Lcom/umeng/commonsdk/stateless/a;->a:Ljava/lang/String;

    .line 1159
    sput-object v0, Lcom/umeng/commonsdk/statistics/a;->a:Ljava/lang/String;

    goto :goto_0

    :cond_8
    const-string v0, "flutter"

    .line 1160
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_9

    .line 1161
    sput-object v0, Lcom/umeng/commonsdk/stateless/a;->a:Ljava/lang/String;

    .line 1162
    sput-object v0, Lcom/umeng/commonsdk/statistics/a;->a:Ljava/lang/String;

    .line 1166
    :cond_9
    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_a

    return-void

    .line 1169
    :cond_a
    sput-object p1, Lcom/umeng/commonsdk/stateless/a;->b:Ljava/lang/String;

    .line 1170
    sput-object p1, Lcom/umeng/commonsdk/statistics/a;->b:Ljava/lang/String;

    return-void
.end method

.method public static submitPolicyGrantResult(Landroid/content/Context;Z)V
    .locals 3

    .line 361
    invoke-static {p0}, Lcom/umeng/commonsdk/internal/b;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/umeng/commonsdk/internal/b;->a()Lcom/umeng/commonsdk/internal/c;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x8020

    .line 360
    invoke-static {p0, v2, v0, v1}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 363
    sget-object v0, Lcom/umeng/commonsdk/UMConfigure;->lock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 364
    :try_start_0
    sput v1, Lcom/umeng/commonsdk/UMConfigure;->policyGrantInvokedFlag:I

    if-eqz p1, :cond_0

    .line 366
    sput v1, Lcom/umeng/commonsdk/UMConfigure;->policyGrantResult:I

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    .line 368
    sput p1, Lcom/umeng/commonsdk/UMConfigure;->policyGrantResult:I

    .line 370
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 372
    invoke-static {p0}, Lcom/umeng/commonsdk/internal/b;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/umeng/commonsdk/internal/b;->a()Lcom/umeng/commonsdk/internal/c;

    move-result-object p1

    sget v0, Lcom/umeng/commonsdk/UMConfigure;->policyGrantResult:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const v1, 0x8018

    .line 371
    invoke-static {p0, v1, p1, v0}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p0

    .line 370
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method
