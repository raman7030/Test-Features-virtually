.class public Ll/ܺܺᩳ;
.super Landroid/app/Service;
.source "K1X4"


# static fields
.field public static ۟:Ll/᩶۫᩷;

.field public static final ۨ:Ljava/util/concurrent/ExecutorService;

.field public static ܰ:Ll/᩶۫᩷;

.field public static ᩺:Landroid/os/Handler;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation
.end field


# instance fields
.field public ۗ:Landroid/app/Application;

.field public ۙ:Ljava/util/Set;

.field public ۛ:Z

.field public ۤ:I

.field public ۫:Ll/ۧۤᩴ;

.field public ۬:Ljava/lang/Throwable;

.field public ᩶:Ll/ۛۢᩳ;

.field public final ᩸:Ll/ۘܺᩳ;

.field public ᩹:Ll/ۨۢᩳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 90
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Ll/ܺܺᩳ;->ۨ:Ljava/util/concurrent/ExecutorService;

    .line 91
    new-instance v0, Ll/᩶۫᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 92
    new-instance v1, Ll/᩶۫᩷;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 93
    sput-object v0, Ll/ܺܺᩳ;->ܰ:Ll/᩶۫᩷;

    .line 94
    sput-object v1, Ll/ܺܺᩳ;->۟:Ll/᩶۫᩷;

    .line 1048
    new-instance v0, Ll/᩷ܺᩳ;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Ll/ܺܺᩳ;->᩺:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 51
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 111
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    iput-object v0, p0, Ll/ܺܺᩳ;->۫:Ll/ۧۤᩴ;

    .line 112
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Ll/ܺܺᩳ;->ۙ:Ljava/util/Set;

    const/high16 v0, -0x80000000

    .line 119
    iput v0, p0, Ll/ܺܺᩳ;->ۤ:I

    .line 504
    new-instance v0, Ll/ۜܺᩳ;

    invoke-direct {v0, p0}, Ll/ۜܺᩳ;-><init>(Ll/ܺܺᩳ;)V

    iput-object v0, p0, Ll/ܺܺᩳ;->᩸:Ll/ۘܺᩳ;

    return-void
.end method

.method private ֫(Ljava/lang/Object;Landroid/content/pm/ApplicationInfo;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x0

    :try_start_0
    const-string v4, "android.app.LoadedApk"

    .line 323
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const-string v5, "android.app.ActivityThread"

    .line 324
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const-string v6, "android.content.res.CompatibilityInfo"

    .line 325
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    const/4 v7, 0x1

    :try_start_1
    const-string v8, "DEFAULT_COMPATIBILITY_INFO"

    .line 496
    invoke-virtual {v6, v8}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8

    .line 497
    invoke-virtual {v8, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 498
    invoke-virtual {v8, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-object v8, v3

    :goto_0
    const/4 v9, 0x0

    const/4 v10, 0x7

    :try_start_2
    new-array v11, v10, [Ljava/lang/Class;

    aput-object v5, v11, v9

    .line 328
    const-class v12, Landroid/content/pm/ApplicationInfo;

    aput-object v12, v11, v7

    const/4 v12, 0x2

    aput-object v6, v11, v12

    const-class v6, Ljava/lang/ClassLoader;

    const/4 v13, 0x3

    aput-object v6, v11, v13

    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v14, 0x4

    aput-object v6, v11, v14

    const/4 v15, 0x5

    aput-object v6, v11, v15

    const/16 v16, 0x6

    aput-object v6, v11, v16

    invoke-virtual {v4, v11}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    .line 337
    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 338
    new-instance v11, Landroid/content/pm/ApplicationInfo;

    invoke-direct {v11, v2}, Landroid/content/pm/ApplicationInfo;-><init>(Landroid/content/pm/ApplicationInfo;)V

    iget-object v3, v0, Ll/ܺܺᩳ;->᩹:Ll/ۨۢᩳ;

    new-array v10, v10, [Ljava/lang/Object;

    aput-object v1, v10, v9

    aput-object v11, v10, v7

    aput-object v8, v10, v12

    aput-object v3, v10, v13

    .line 339
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v3, v10, v14

    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v11, v10, v15

    aput-object v3, v10, v16

    .line 338
    invoke-virtual {v6, v10}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-object v1

    :catchall_1
    :try_start_3
    new-array v3, v7, [Ljava/lang/Class;

    aput-object v5, v3, v9

    .line 343
    invoke-virtual {v4, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    .line 344
    invoke-virtual {v3, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v5, v7, [Ljava/lang/Object;

    aput-object v1, v5, v9

    .line 345
    invoke-virtual {v3, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    return-object v1

    .line 348
    :catchall_2
    :try_start_4
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v3

    array-length v4, v3

    :goto_1
    if-ge v9, v4, :cond_1

    aget-object v5, v3, v9

    .line 349
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v6

    new-instance v10, Landroid/content/pm/ApplicationInfo;

    invoke-direct {v10, v2}, Landroid/content/pm/ApplicationInfo;-><init>(Landroid/content/pm/ApplicationInfo;)V

    invoke-direct {v0, v6, v1, v10, v8}, Ll/ܺܺᩳ;->֫([Ljava/lang/Class;Ljava/lang/Object;Landroid/content/pm/ApplicationInfo;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    if-nez v6, :cond_0

    goto :goto_2

    .line 355
    :cond_0
    :try_start_5
    invoke-virtual {v5, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 356
    invoke-virtual {v5, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    return-object v1

    :catchall_3
    :goto_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :catchall_4
    :cond_1
    const/4 v1, 0x0

    return-object v1
.end method

.method private ֫(Ljava/lang/Object;Landroid/content/pm/ApplicationInfo;Ljava/io/File;Ljava/io/File;Ljava/io/File;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    .line 286
    :try_start_0
    invoke-direct {p0, p1, p2}, Ll/ܺܺᩳ;->֫(Ljava/lang/Object;Landroid/content/pm/ApplicationInfo;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string v1, "mActivityThread"

    .line 291
    invoke-static {v1, p1, v0}, Ll/ܺܺᩳ;->ܽ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "mPackageName"

    .line 292
    iget-object v2, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    invoke-virtual {v2}, Ll/ۛۢᩳ;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, p1, v2}, Ll/ܺܺᩳ;->ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "mApplicationInfo"

    .line 293
    invoke-static {v1, p1, p2}, Ll/ܺܺᩳ;->ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "mAppDir"

    .line 294
    iget-object v2, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    invoke-virtual {v2}, Ll/ۛۢᩳ;->getPackageResourcePath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, p1, v2}, Ll/ܺܺᩳ;->ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "mResDir"

    .line 295
    iget-object v2, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    invoke-virtual {v2}, Ll/ۛۢᩳ;->getPackageResourcePath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, p1, v2}, Ll/ܺܺᩳ;->ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "mDataDir"

    .line 296
    invoke-virtual {p3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, p1, v2}, Ll/ܺܺᩳ;->ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "mLibDir"

    .line 297
    iget-object p2, p2, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    invoke-static {v1, p1, p2}, Ll/ܺܺᩳ;->ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p2, "mDataDirFile"

    .line 298
    invoke-static {p2, p1, p3}, Ll/ܺܺᩳ;->ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p2, "mBaseClassLoader"

    .line 299
    iget-object p3, p0, Ll/ܺܺᩳ;->᩹:Ll/ۨۢᩳ;

    invoke-static {p2, p1, p3}, Ll/ܺܺᩳ;->ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p2, "mResources"

    .line 300
    iget-object p3, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    invoke-virtual {p3}, Ll/ۛۢᩳ;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-static {p2, p1, p3}, Ll/ܺܺᩳ;->ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p2, "mApplication"

    .line 301
    iget-object p3, p0, Ll/ܺܺᩳ;->ۗ:Landroid/app/Application;

    invoke-static {p2, p1, p3}, Ll/ܺܺᩳ;->ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p2, "mClassLoader"

    .line 302
    iget-object p3, p0, Ll/ܺܺᩳ;->᩹:Ll/ۨۢᩳ;

    invoke-static {p2, p1, p3}, Ll/ܺܺᩳ;->ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p2, "mDefaultClassLoader"

    .line 303
    iget-object p3, p0, Ll/ܺܺᩳ;->᩹:Ll/ۨۢᩳ;

    invoke-static {p2, p1, p3}, Ll/ܺܺᩳ;->ܽ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p2, "mSecurityViolation"

    .line 304
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2, p1, p3}, Ll/ܺܺᩳ;->ܽ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p2, "mIncludeCode"

    .line 305
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p2, p1, p3}, Ll/ܺܺᩳ;->ܽ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p2, "mDeviceProtectedDataDirFile"

    .line 306
    invoke-static {p2, p1, p4}, Ll/ܺܺᩳ;->ܽ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p2, "mCredentialProtectedDataDirFile"

    .line 307
    invoke-static {p2, p1, p5}, Ll/ܺܺᩳ;->ܽ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p2, "mDeviceProtectedDataDir"

    .line 308
    invoke-virtual {p4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p1, p3}, Ll/ܺܺᩳ;->ܽ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p2, "mCredentialProtectedDataDir"

    .line 309
    invoke-virtual {p5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p1, p3}, Ll/ܺܺᩳ;->ܽ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    :goto_0
    return-object v0
.end method

.method public static ֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 938
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    const/4 v0, 0x1

    .line 939
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 940
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۢܺᩳ;)Ljava/lang/Object;
    .locals 2

    .line 1041
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 1042
    invoke-interface {p0}, Ll/ۢܺᩳ;->call()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 1044
    :cond_0
    new-instance v0, Ll/ۡܺᩳ;

    invoke-direct {v0, p0}, Ll/ۡܺᩳ;-><init>(Ll/ۢܺᩳ;)V

    invoke-virtual {v0}, Ll/ۡܺᩳ;->֫()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܺܺᩳ;Ll/ۢܺᩳ;)Ljava/lang/Object;
    .locals 2

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1026
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    .line 1027
    invoke-virtual {v0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    .line 1028
    iget-object p0, p0, Ll/ܺܺᩳ;->᩹:Ll/ۨۢᩳ;

    if-eqz p0, :cond_0

    .line 1029
    invoke-virtual {v0, p0}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    .line 1032
    :cond_0
    :try_start_0
    invoke-interface {p1}, Ll/ۢܺᩳ;->call()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1034
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    .line 1035
    throw p0
.end method

.method public static bridge synthetic ֫()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 0
    sget-object v0, Ll/ܺܺᩳ;->ۨ:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/ܺܺᩳ;)Ll/ۨۢᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺܺᩳ;->᩹:Ll/ۨۢᩳ;

    return-object p0
.end method

.method private ֫(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 373
    :try_start_0
    invoke-static {p2, p1}, Ll/ܺܺᩳ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    if-nez p3, :cond_1

    const/4 p2, 0x0

    goto :goto_0

    .line 377
    :cond_1
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 378
    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p3

    .line 379
    iget-object v0, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    invoke-virtual {v0}, Ll/ۛۢᩳ;->getPackageName()Ljava/lang/String;

    move-result-object v0

    if-nez p2, :cond_2

    .line 381
    invoke-interface {p1, p3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 385
    :cond_2
    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_1
    return-void
.end method

.method public static ֫(Ll/ܺܺᩳ;I)V
    .locals 2

    .line 969
    iput p1, p0, Ll/ܺܺᩳ;->ۤ:I

    if-nez p1, :cond_0

    .line 972
    invoke-static {p1}, Ll/֨ۧܺ;->֫(I)Ljava/lang/String;

    return-void

    .line 976
    :cond_0
    invoke-static {p1}, Ll/֨ۧܺ;->֫(I)Ljava/lang/String;

    .line 977
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Seccomp fatal: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ll/֨ۧܺ;->֫(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ֫(Ll/ܺܺᩳ;Ljava/lang/Throwable;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܺܺᩳ;->۬:Ljava/lang/Throwable;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺܺᩳ;Ll/ۛۢᩳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺܺᩳ;Ll/ۨۢᩳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܺܺᩳ;->᩹:Ll/ۨۢᩳ;

    return-void
.end method

.method public static synthetic ֫(Ll/ܺܺᩳ;Z)V
    .locals 9

    .line 159
    const-class v0, Landroid/content/Context;

    const-string v1, "attachBaseContext"

    const-class v2, Landroid/content/ContextWrapper;

    iget-object v3, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    invoke-virtual {v3}, Ll/ۛۢᩳ;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->className:Ljava/lang/String;

    .line 161
    new-instance v3, Landroid/app/Application;

    invoke-direct {v3}, Landroid/app/Application;-><init>()V

    iput-object v3, p0, Ll/ܺܺᩳ;->ۗ:Landroid/app/Application;

    .line 162
    iget-object v4, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    invoke-virtual {v4, v3}, Ll/ۛۢᩳ;->֫(Landroid/content/Context;)V

    const/4 v3, 0x0

    const/4 v4, 0x1

    :try_start_0
    new-array v5, v4, [Ljava/lang/Class;

    aput-object v0, v5, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v6, "attachBaseContext"

    .line 164
    :try_start_1
    invoke-virtual {v2, v6, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 165
    invoke-virtual {v5, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 166
    iget-object v6, p0, Ll/ܺܺᩳ;->ۗ:Landroid/app/Application;

    iget-object v7, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    new-array v8, v4, [Ljava/lang/Object;

    aput-object v7, v8, v3

    invoke-virtual {v5, v6, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    .line 171
    :goto_0
    invoke-direct {p0}, Ll/ܺܺᩳ;->ܿ()V

    if-eqz p1, :cond_1

    .line 173
    const-class p1, Landroid/app/Application;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    invoke-virtual {v6}, Ll/ۛۢᩳ;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v6

    iget-object v6, v6, Landroid/content/pm/ApplicationInfo;->className:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 175
    :try_start_2
    iget-object v5, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    invoke-virtual {v5}, Ll/ۛۢᩳ;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v5

    iget-object v5, v5, Landroid/content/pm/ApplicationInfo;->className:Ljava/lang/String;

    .line 178
    iget-object v5, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    invoke-virtual {v5}, Ll/ۛۢᩳ;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v5

    iget-object v5, v5, Landroid/content/pm/ApplicationInfo;->className:Ljava/lang/String;

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 179
    iget-object p1, p0, Ll/ܺܺᩳ;->᩹:Ll/ۨۢᩳ;

    iget-object v5, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    invoke-virtual {v5}, Ll/ۛۢᩳ;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v5

    iget-object v5, v5, Landroid/content/pm/ApplicationInfo;->className:Ljava/lang/String;

    invoke-virtual {p1, v5}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    iput-object p1, p0, Ll/ܺܺᩳ;->ۗ:Landroid/app/Application;

    goto :goto_1

    .line 181
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    iput-object p1, p0, Ll/ܺܺᩳ;->ۗ:Landroid/app/Application;

    .line 183
    :goto_1
    iget-object p1, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    iget-object v5, p0, Ll/ܺܺᩳ;->ۗ:Landroid/app/Application;

    invoke-virtual {p1, v5}, Ll/ۛۢᩳ;->֫(Landroid/content/Context;)V

    .line 186
    invoke-direct {p0}, Ll/ܺܺᩳ;->ܿ()V

    new-array p1, v4, [Ljava/lang/Class;

    aput-object v0, p1, v3

    .line 188
    invoke-virtual {v2, v1, p1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    .line 189
    invoke-virtual {p1, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 190
    iget-object v0, p0, Ll/ܺܺᩳ;->ۗ:Landroid/app/Application;

    iget-object v1, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    new-array v2, v4, [Ljava/lang/Object;

    aput-object v1, v2, v3

    invoke-virtual {p1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    iget-object p0, p0, Ll/ܺܺᩳ;->ۗ:Landroid/app/Application;

    invoke-virtual {p0}, Landroid/app/Application;->onCreate()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    :cond_1
    return-void
.end method

.method private ֫([Ljava/lang/Class;Ljava/lang/Object;Landroid/content/pm/ApplicationInfo;Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 7

    .line 422
    array-length v0, p1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 424
    :goto_0
    array-length v4, p1

    if-ge v2, v4, :cond_f

    .line 425
    aget-object v4, p1, v2

    .line 426
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "android.app.ActivityThread"

    .line 427
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 428
    aput-object p2, v0, v2

    goto/16 :goto_2

    .line 431
    :cond_0
    const-class v6, Landroid/content/pm/ApplicationInfo;

    if-ne v4, v6, :cond_1

    .line 432
    new-instance v4, Landroid/content/pm/ApplicationInfo;

    invoke-direct {v4, p3}, Landroid/content/pm/ApplicationInfo;-><init>(Landroid/content/pm/ApplicationInfo;)V

    aput-object v4, v0, v2

    goto/16 :goto_2

    :cond_1
    const-string v6, "android.content.res.CompatibilityInfo"

    .line 435
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 436
    aput-object p4, v0, v2

    goto/16 :goto_2

    .line 439
    :cond_2
    const-class v5, Ljava/lang/ClassLoader;

    if-ne v4, v5, :cond_3

    .line 440
    iget-object v4, p0, Ll/ܺܺᩳ;->᩹:Ll/ۨۢᩳ;

    aput-object v4, v0, v2

    goto/16 :goto_2

    .line 443
    :cond_3
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v4, v5, :cond_5

    add-int/lit8 v4, v3, 0x1

    const/4 v5, 0x1

    if-ne v3, v5, :cond_4

    goto :goto_1

    :cond_4
    const/4 v5, 0x0

    .line 445
    :goto_1
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v0, v2

    move v3, v4

    goto/16 :goto_2

    .line 448
    :cond_5
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v4, v5, :cond_6

    .line 449
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v0, v2

    goto :goto_2

    .line 452
    :cond_6
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v4, v5, :cond_7

    const-wide/16 v4, 0x0

    .line 453
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v0, v2

    goto :goto_2

    .line 456
    :cond_7
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v4, v5, :cond_8

    const/4 v4, 0x0

    .line 457
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    aput-object v4, v0, v2

    goto :goto_2

    .line 460
    :cond_8
    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v4, v5, :cond_9

    const-wide/16 v4, 0x0

    .line 461
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    aput-object v4, v0, v2

    goto :goto_2

    .line 464
    :cond_9
    sget-object v5, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne v4, v5, :cond_a

    .line 465
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    aput-object v4, v0, v2

    goto :goto_2

    .line 468
    :cond_a
    sget-object v5, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v4, v5, :cond_b

    .line 469
    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    aput-object v4, v0, v2

    goto :goto_2

    .line 472
    :cond_b
    sget-object v5, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne v4, v5, :cond_c

    .line 473
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v4

    aput-object v4, v0, v2

    goto :goto_2

    .line 476
    :cond_c
    const-class v5, Ljava/lang/String;

    if-ne v4, v5, :cond_d

    .line 477
    iget-object v4, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    invoke-virtual {v4}, Ll/ۛۢᩳ;->getPackageName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v2

    goto :goto_2

    .line 480
    :cond_d
    invoke-virtual {v4}, Ljava/lang/Class;->isPrimitive()Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_e

    .line 481
    aput-object v5, v0, v2

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_e
    return-object v5

    :cond_f
    return-object v0
.end method

.method public static bridge synthetic ۜ(Ll/ܺܺᩳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ܺܺᩳ;->ۛ:Z

    return-void
.end method

.method public static bridge synthetic ۧ()Landroid/os/Handler;
    .locals 1

    .line 0
    sget-object v0, Ll/ܺܺᩳ;->᩺:Landroid/os/Handler;

    return-object v0
.end method

.method public static bridge synthetic ۧ(Ll/ܺܺᩳ;)Ll/ۛۢᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 916
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    const/4 v0, 0x1

    .line 917
    invoke-virtual {p0, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 918
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static ۧ(Ll/ܺܺᩳ;Z)V
    .locals 3

    .line 1026
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    .line 1027
    invoke-virtual {v0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    .line 1028
    iget-object v2, p0, Ll/ܺܺᩳ;->᩹:Ll/ۨۢᩳ;

    if-eqz v2, :cond_0

    .line 1029
    invoke-virtual {v0, v2}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    .line 1032
    :cond_0
    :try_start_0
    invoke-static {p0, p1}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1034
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    .line 1035
    throw p0
.end method

.method public static bridge synthetic ܳ(Ll/ܺܺᩳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܺܺᩳ;->ۤ:I

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ܺܺᩳ;)Ljava/util/Set;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺܺᩳ;->ۙ:Ljava/util/Set;

    return-object p0
.end method

.method public static bridge synthetic ܽ()Ll/᩶۫᩷;
    .locals 1

    .line 0
    sget-object v0, Ll/ܺܺᩳ;->ܰ:Ll/᩶۫᩷;

    return-object v0
.end method

.method public static ܽ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 930
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    const/4 v0, 0x1

    .line 931
    invoke-virtual {p0, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 932
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static ܽ(Ll/ܺܺᩳ;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 1009
    iput-object v0, p0, Ll/ܺܺᩳ;->᩹:Ll/ۨۢᩳ;

    .line 1010
    iput-object v0, p0, Ll/ܺܺᩳ;->ۗ:Landroid/app/Application;

    .line 1011
    iput-object v0, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    .line 1012
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    iput-object v0, p0, Ll/ܺܺᩳ;->۫:Ll/ۧۤᩴ;

    .line 1013
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Ll/ܺܺᩳ;->ۙ:Ljava/util/Set;

    const/4 v0, 0x0

    .line 1014
    iput-boolean v0, p0, Ll/ܺܺᩳ;->ۛ:Z

    if-eqz p1, :cond_0

    const/high16 p1, -0x80000000

    .line 1017
    iput p1, p0, Ll/ܺܺᩳ;->ۤ:I

    :cond_0
    return-void
.end method

.method public static bridge synthetic ܿ(Ll/ܺܺᩳ;)Ljava/util/Map;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺܺᩳ;->۫:Ll/ۧۤᩴ;

    return-object p0
.end method

.method private ܿ()V
    .locals 9

    :try_start_0
    const-string v0, "android.app.ActivityThread"

    .line 206
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "currentActivityThread"

    const/4 v2, 0x0

    .line 207
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 208
    iget-object v1, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    invoke-virtual {v1}, Ll/ۛۢᩳ;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    .line 209
    iget-object v2, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    invoke-virtual {v2}, Ll/ۛۢᩳ;->getDataDir()Ljava/io/File;

    move-result-object v6

    .line 210
    iget-object v2, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    invoke-virtual {v2}, Ll/ۛۢᩳ;->ۧ()Ljava/io/File;

    move-result-object v7

    .line 211
    iget-object v2, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    invoke-virtual {v2}, Ll/ۛۢᩳ;->֫()Ljava/io/File;

    move-result-object v8

    move-object v3, p0

    move-object v4, v0

    move-object v5, v1

    .line 212
    invoke-direct/range {v3 .. v8}, Ll/ܺܺᩳ;->֫(Ljava/lang/Object;Landroid/content/pm/ApplicationInfo;Ljava/io/File;Ljava/io/File;Ljava/io/File;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "mInitialApplication"

    .line 215
    iget-object v4, p0, Ll/ܺܺᩳ;->ۗ:Landroid/app/Application;

    invoke-static {v3, v0, v4}, Ll/ܺܺᩳ;->ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5

    :try_start_1
    const-string v3, "mAllApplications"

    .line 219
    invoke-static {v0, v3}, Ll/ܺܺᩳ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 220
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 221
    iget-object v4, p0, Ll/ܺܺᩳ;->ۗ:Landroid/app/Application;

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :try_start_2
    const-string v3, "mBoundApplication"

    .line 227
    invoke-static {v0, v3}, Ll/ܺܺᩳ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "appInfo"

    .line 229
    invoke-static {v4, v3, v1}, Ll/ܺܺᩳ;->ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "processName"

    .line 230
    iget-object v4, p0, Ll/ܺܺᩳ;->᩶:Ll/ۛۢᩳ;

    invoke-virtual {v4}, Ll/ۛۢᩳ;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v3, v4}, Ll/ܺܺᩳ;->ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "info"

    .line 232
    invoke-static {v1, v3, v2}, Ll/ܺܺᩳ;->ܽ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "providers"

    .line 233
    invoke-static {v3, v1}, Ll/ܺܺᩳ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_0

    .line 235
    invoke-interface {v1}, Ljava/util/List;->clear()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :cond_0
    :try_start_3
    const-string v1, "mPackages"

    .line 243
    invoke-direct {p0, v1, v0, v2}, Ll/ܺܺᩳ;->֫(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "mResourcePackages"

    .line 244
    invoke-direct {p0, v1, v0, v2}, Ll/ܺܺᩳ;->֫(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :try_start_4
    const-string v1, "mServices"

    .line 397
    invoke-static {v0, v1}, Ll/ܺܺᩳ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-eqz v1, :cond_3

    .line 398
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    .line 401
    :cond_1
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 402
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 403
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 404
    instance-of v4, v3, Ljava/util/Map$Entry;

    if-eqz v4, :cond_2

    check-cast v3, Ljava/util/Map$Entry;

    .line 407
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, p0, :cond_2

    .line 408
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_0

    :catch_3
    :cond_3
    :goto_1
    :try_start_5
    const-string v1, "mActivities"

    .line 257
    invoke-static {v0, v1}, Ll/ܺܺᩳ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 258
    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 265
    :catch_4
    :try_start_6
    const-class v0, Landroid/app/Application;

    const-string v1, "mLoadedApk"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 266
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 268
    iget-object v1, p0, Ll/ܺܺᩳ;->ۗ:Landroid/app/Application;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    :catch_5
    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/ܺܺᩳ;)Ljava/lang/Throwable;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺܺᩳ;->۬:Ljava/lang/Throwable;

    return-object p0
.end method

.method public static bridge synthetic ᩳ()Ll/᩶۫᩷;
    .locals 1

    .line 0
    sget-object v0, Ll/ܺܺᩳ;->۟:Ll/᩶۫᩷;

    return-object v0
.end method

.method public static ᩷(Ll/ܺܺᩳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 986
    iput v0, p0, Ll/ܺܺᩳ;->ۤ:I

    .line 988
    invoke-static {v0}, Ll/֨ۧܺ;->֫(I)Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ᩻(Ll/ܺܺᩳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܺܺᩳ;->ۛ:Z

    return p0
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 129
    iget-object p1, p0, Ll/ܺܺᩳ;->᩸:Ll/ۘܺᩳ;

    return-object p1
.end method
