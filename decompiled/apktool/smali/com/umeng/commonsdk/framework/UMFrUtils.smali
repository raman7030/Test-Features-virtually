.class public Lcom/umeng/commonsdk/framework/UMFrUtils;
.super Ljava/lang/Object;
.source "UMFrUtils.java"


# static fields
.field public static final KEY_LAST_INSTANT_SUCC_BUILD_TIME:Ljava/lang/String; = "last_instant_build_time"

.field public static final KEY_LAST_SUCC_BUILD_TIME:Ljava/lang/String; = "last_successful_build_time"

.field public static mDefaultEnvelopeDir:Ljava/lang/String; = "envelope"

.field public static mDefaultEnvelopeDirPath:Ljava/lang/String; = null

.field public static mEnvelopeBuildTimeLock:Ljava/lang/Object; = null

.field public static mEnvelopeFileLock:Ljava/lang/Object; = null

.field public static sCurrentProcessName:Ljava/lang/String; = ""


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 49
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/framework/UMFrUtils;->mEnvelopeBuildTimeLock:Ljava/lang/Object;

    .line 52
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/framework/UMFrUtils;->mEnvelopeFileLock:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static checkPermission(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 7

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    .line 161
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 162
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    const/4 v4, 0x1

    if-lt v2, v3, :cond_1

    :try_start_0
    const-string v2, "android.content.Context"

    .line 164
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v3, "checkSelfPermission"

    new-array v5, v4, [Ljava/lang/Class;

    .line 165
    const-class v6, Ljava/lang/String;

    aput-object v6, v5, v0

    invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v3, v4, [Ljava/lang/Object;

    aput-object p1, v3, v0

    .line 166
    invoke-virtual {v2, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p0, :cond_0

    return v4

    :cond_0
    return v0

    :catchall_0
    move-exception p0

    .line 170
    invoke-static {v1, p0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 174
    :cond_1
    :try_start_1
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    .line 175
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p1, v2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez p0, :cond_2

    return v4

    :catchall_1
    move-exception p0

    .line 180
    invoke-static {v1, p0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    return v0
.end method

.method public static envelopeFileNumber(Landroid/content/Context;)I
    .locals 4

    const/4 v1, 0x0

    if-eqz p0, :cond_1

    .line 224
    :try_start_0
    new-instance v2, Ljava/io/File;

    invoke-static {p0}, Lcom/umeng/commonsdk/framework/UMFrUtils;->getEnvelopeDirPath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 225
    sget-object v0, Lcom/umeng/commonsdk/framework/UMFrUtils;->mEnvelopeFileLock:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 226
    :try_start_1
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 227
    invoke-virtual {v2}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 229
    array-length v2, v2

    monitor-exit v0

    return v2

    .line 232
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    .line 234
    invoke-static {p0, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return v1
.end method

.method public static getCurrentProcessName(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 85
    sget-object v0, Lcom/umeng/commonsdk/framework/UMFrUtils;->sCurrentProcessName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 88
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 89
    invoke-static {}, Landroid/app/Application;->getProcessName()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 92
    :goto_0
    :try_start_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 93
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    .line 95
    invoke-static {v0}, Lcom/umeng/commonsdk/framework/UMFrUtils;->getProcessName(I)Ljava/lang/String;

    move-result-object v1

    .line 96
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 97
    sput-object v1, Lcom/umeng/commonsdk/framework/UMFrUtils;->sCurrentProcessName:Ljava/lang/String;

    goto :goto_1

    :cond_1
    const-string v1, "activity"

    .line 99
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/ActivityManager;

    if-eqz v1, :cond_4

    .line 101
    invoke-virtual {v1}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 102
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_4

    .line 103
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 104
    iget v3, v2, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    if-ne v3, v0, :cond_2

    .line 105
    iget-object v0, v2, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    sput-object v0, Lcom/umeng/commonsdk/framework/UMFrUtils;->sCurrentProcessName:Ljava/lang/String;

    goto :goto_1

    .line 113
    :cond_3
    sput-object v0, Lcom/umeng/commonsdk/framework/UMFrUtils;->sCurrentProcessName:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    .line 116
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 119
    :cond_4
    :goto_1
    sget-object p0, Lcom/umeng/commonsdk/framework/UMFrUtils;->sCurrentProcessName:Ljava/lang/String;

    return-object p0
.end method

.method public static getDistanceDays(JJ)J
    .locals 1

    cmp-long v0, p0, p2

    if-gez v0, :cond_0

    sub-long/2addr p2, p0

    goto :goto_0

    :cond_0
    sub-long p2, p0, p2

    :goto_0
    const-wide/32 p0, 0x5265c00

    .line 256
    div-long/2addr p2, p0

    return-wide p2
.end method

.method public static getEnvelopeDirPath(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 428
    sget-object v0, Lcom/umeng/commonsdk/framework/UMFrUtils;->mEnvelopeFileLock:Ljava/lang/Object;

    monitor-enter v0

    .line 430
    :try_start_0
    sget-object v1, Lcom/umeng/commonsdk/framework/UMFrUtils;->mDefaultEnvelopeDirPath:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 431
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/umeng/commonsdk/framework/UMFrUtils;->mDefaultEnvelopeDir:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/umeng/commonsdk/framework/UMFrUtils;->mDefaultEnvelopeDirPath:Ljava/lang/String;

    .line 433
    :cond_0
    new-instance v1, Ljava/io/File;

    sget-object v2, Lcom/umeng/commonsdk/framework/UMFrUtils;->mDefaultEnvelopeDirPath:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 434
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_1

    .line 435
    invoke-virtual {v1}, Ljava/io/File;->mkdir()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "--->>> Create Envelope Directory failed!!!"

    .line 436
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 440
    :try_start_1
    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 442
    :cond_1
    :goto_0
    sget-object p0, Lcom/umeng/commonsdk/framework/UMFrUtils;->mDefaultEnvelopeDirPath:Ljava/lang/String;

    monitor-exit v0

    return-object p0

    :catchall_1
    move-exception p0

    .line 443
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p0
.end method

.method public static getEnvelopeFile(Landroid/content/Context;)Ljava/io/File;
    .locals 3

    const/4 v1, 0x0

    if-nez p0, :cond_0

    return-object v1

    .line 320
    :cond_0
    new-instance v2, Ljava/io/File;

    invoke-static {p0}, Lcom/umeng/commonsdk/framework/UMFrUtils;->getEnvelopeDirPath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 321
    sget-object p0, Lcom/umeng/commonsdk/framework/UMFrUtils;->mEnvelopeFileLock:Ljava/lang/Object;

    move-object v0, p0

    monitor-enter v0

    .line 322
    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 323
    array-length v2, p0

    if-nez v2, :cond_1

    goto :goto_0

    .line 327
    :cond_1
    new-instance v1, Lcom/umeng/commonsdk/framework/UMFrUtils$2;

    invoke-direct {v1}, Lcom/umeng/commonsdk/framework/UMFrUtils$2;-><init>()V

    invoke-static {p0, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    const/4 v1, 0x0

    .line 341
    aget-object p0, p0, v1

    monitor-exit v0

    return-object p0

    .line 324
    :cond_2
    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    .line 342
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static getLastInstantBuildTime(Landroid/content/Context;)J
    .locals 4

    .line 454
    sget-object v0, Lcom/umeng/commonsdk/framework/UMFrUtils;->mEnvelopeBuildTimeLock:Ljava/lang/Object;

    monitor-enter v0

    .line 455
    :try_start_0
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v1, "last_instant_build_time"

    const-wide/16 v2, 0x0

    .line 456
    invoke-interface {p0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception p0

    .line 457
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static getLastSuccessfulBuildTime(Landroid/content/Context;)J
    .locals 4

    .line 447
    sget-object v0, Lcom/umeng/commonsdk/framework/UMFrUtils;->mEnvelopeBuildTimeLock:Ljava/lang/Object;

    monitor-enter v0

    .line 448
    :try_start_0
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v1, "last_successful_build_time"

    const-wide/16 v2, 0x0

    .line 449
    invoke-interface {p0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception p0

    .line 450
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static getLegacyEnvelopeDir(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 409
    :try_start_0
    invoke-static {p0}, Lcom/umeng/commonsdk/framework/UMFrUtils;->getCurrentProcessName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 410
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0x3a

    const/16 v2, 0x5f

    .line 412
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    const-string v1, "--->>> getEnvelopeDir: use current process name as envelope directory."

    .line 413
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    .line 417
    invoke-static {p0, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 419
    :cond_0
    sget-object p0, Lcom/umeng/commonsdk/framework/UMFrUtils;->mDefaultEnvelopeDir:Ljava/lang/String;

    return-object p0
.end method

.method public static getProcessName(I)Ljava/lang/String;
    .locals 5

    const-string v0, "/proc/"

    const/4 v1, 0x0

    .line 59
    :try_start_0
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/FileReader;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "/cmdline"

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v3, p0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 60
    :try_start_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p0

    .line 61
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 62
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 70
    :cond_0
    :try_start_2
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    return-object p0

    :catchall_1
    nop

    goto :goto_0

    :catchall_2
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_1

    :try_start_3
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :catchall_3
    :cond_1
    return-object v1
.end method

.method public static getSubProcessName(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    const-string v0, ""

    .line 130
    :try_start_0
    invoke-static {p0}, Lcom/umeng/commonsdk/framework/UMFrUtils;->getCurrentProcessName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ":"

    .line 131
    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-ltz v2, :cond_0

    add-int/lit8 v3, v2, 0x1

    .line 133
    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    :cond_0
    if-gez v2, :cond_2

    .line 136
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 137
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    .line 138
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-le v4, v3, :cond_1

    .line 140
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :cond_1
    return-object v1

    :cond_2
    return-object v0

    :catchall_0
    move-exception v1

    .line 146
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static hasEnvelopeFile(Landroid/content/Context;Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;)Z
    .locals 6

    const-string v0, "a"

    .line 584
    sget-object v1, Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;->U_INTERNAL:Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;

    if-ne p1, v1, :cond_0

    const-string v0, "i"

    .line 587
    :cond_0
    sget-object v1, Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;->U_ZeroEnv:Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;

    if-ne p1, v1, :cond_1

    const-string v0, "z"

    .line 590
    :cond_1
    sget-object v1, Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;->U_Silent:Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;

    if-ne p1, v1, :cond_2

    const-string v0, "h"

    :cond_2
    move-object p1, v0

    .line 593
    invoke-static {p0}, Lcom/umeng/commonsdk/framework/UMFrUtils;->getEnvelopeDirPath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    .line 595
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 596
    sget-object v0, Lcom/umeng/commonsdk/framework/UMFrUtils;->mEnvelopeFileLock:Ljava/lang/Object;

    monitor-enter v0

    .line 598
    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 599
    array-length v3, v2

    if-nez v3, :cond_3

    goto :goto_1

    .line 602
    :cond_3
    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_6

    aget-object v5, v2, v4

    .line 603
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v5, :cond_4

    const/4 p0, 0x1

    .line 604
    :try_start_1
    monitor-exit v0

    return p0

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 600
    :cond_5
    :goto_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception p0

    goto :goto_2

    :catchall_1
    move-exception p1

    .line 608
    invoke-static {p0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 610
    :cond_6
    monitor-exit v0

    return v1

    .line 611
    :goto_2
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    :cond_7
    return v1
.end method

.method public static isOnline(Landroid/content/Context;)Z
    .locals 1

    :try_start_0
    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    .line 200
    invoke-static {p0, v0}, Lcom/umeng/commonsdk/framework/UMFrUtils;->checkPermission(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "connectivity"

    .line 201
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_0

    .line 203
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 205
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    move-exception v0

    .line 210
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static removeEnvelopeFile(Ljava/io/File;)Z
    .locals 3

    .line 527
    invoke-static {}, Lcom/umeng/commonsdk/framework/UMModuleRegister;->getAppContext()Landroid/content/Context;

    move-result-object v1

    .line 528
    sget-object v0, Lcom/umeng/commonsdk/framework/UMFrUtils;->mEnvelopeFileLock:Ljava/lang/Object;

    monitor-enter v0

    if-eqz p0, :cond_0

    .line 530
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 531
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    .line 534
    invoke-static {v1, p0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 536
    :cond_0
    monitor-exit v0

    const/4 p0, 0x1

    return p0

    :catchall_1
    move-exception p0

    .line 537
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p0
.end method

.method public static removeRedundantEnvelopeFiles(Landroid/content/Context;I)V
    .locals 5

    .line 269
    new-instance v1, Ljava/io/File;

    invoke-static {p0}, Lcom/umeng/commonsdk/framework/UMFrUtils;->getEnvelopeDirPath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 270
    sget-object v0, Lcom/umeng/commonsdk/framework/UMFrUtils;->mEnvelopeFileLock:Ljava/lang/Object;

    monitor-enter v0

    .line 271
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 273
    array-length v2, v1

    if-gt v2, p1, :cond_0

    goto :goto_1

    .line 277
    :cond_0
    new-instance v2, Lcom/umeng/commonsdk/framework/UMFrUtils$1;

    invoke-direct {v2}, Lcom/umeng/commonsdk/framework/UMFrUtils$1;-><init>()V

    invoke-static {v1, v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 292
    array-length v2, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-le v2, p1, :cond_2

    const/4 v2, 0x0

    .line 295
    :goto_0
    :try_start_1
    array-length v3, v1

    sub-int/2addr v3, p1

    if-ge v2, v3, :cond_2

    .line 296
    aget-object v3, v1, v2

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    move-result v3

    if-nez v3, :cond_1

    .line 298
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "--->>> remove ["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "] file fail."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/umeng/commonsdk/statistics/common/ULog;->d(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 302
    :try_start_2
    invoke-static {p0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 305
    :cond_2
    monitor-exit v0

    return-void

    .line 274
    :cond_3
    :goto_1
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    .line 305
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p0
.end method

.method public static saveEnvelopeFile(Landroid/content/Context;Ljava/lang/String;[B)I
    .locals 5

    const/16 v1, 0x65

    if-nez p2, :cond_0

    return v1

    .line 491
    :cond_0
    new-instance v2, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lcom/umeng/commonsdk/framework/UMFrUtils;->getEnvelopeDirPath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    .line 0
    invoke-static {v0, v3, p1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 491
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 492
    sget-object v0, Lcom/umeng/commonsdk/framework/UMFrUtils;->mEnvelopeFileLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v3, 0x0

    .line 495
    :try_start_0
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 496
    :try_start_1
    invoke-virtual {v4, p2}, Ljava/io/FileOutputStream;->write([B)V

    .line 497
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 514
    :try_start_2
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/internal/a;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/internal/a;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/umeng/commonsdk/statistics/internal/a;->a(Ljava/lang/String;)Z

    move-result p2

    .line 515
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/internal/a;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/internal/a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/umeng/commonsdk/statistics/internal/a;->b(Ljava/lang/String;)Z

    move-result p1

    if-eqz p2, :cond_1

    .line 517
    invoke-static {p0}, Lcom/umeng/commonsdk/framework/UMFrUtils;->updateLastSuccessfulBuildTime(Landroid/content/Context;)V

    :cond_1
    if-eqz p1, :cond_2

    .line 520
    invoke-static {p0}, Lcom/umeng/commonsdk/framework/UMFrUtils;->updateLastInstantBuildTime(Landroid/content/Context;)V

    :cond_2
    const/4 p0, 0x0

    .line 522
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    return p0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    move-object v3, v4

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 501
    :goto_0
    :try_start_3
    invoke-static {p0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v3, :cond_3

    .line 506
    :try_start_4
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p1

    .line 508
    :try_start_5
    invoke-static {p0, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 509
    :cond_3
    :goto_1
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    return v1

    :goto_2
    move-object v4, v3

    :goto_3
    if-eqz v4, :cond_4

    .line 506
    :try_start_6
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception p2

    .line 508
    :try_start_7
    invoke-static {p0, p2}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 509
    :cond_4
    :goto_4
    throw p1

    :catchall_4
    move-exception p0

    .line 523
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    throw p0
.end method

.method public static syncLegacyEnvelopeIfNeeded(Landroid/content/Context;)V
    .locals 8

    if-nez p0, :cond_0

    goto/16 :goto_2

    .line 355
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/umeng/commonsdk/framework/UMFrUtils;->getLegacyEnvelopeDir(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 357
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_2

    .line 361
    :cond_1
    sget-object v1, Lcom/umeng/commonsdk/framework/UMFrUtils;->mDefaultEnvelopeDir:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_2

    .line 365
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 366
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 367
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    .line 371
    :cond_3
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 372
    array-length v2, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-nez v2, :cond_4

    goto :goto_1

    .line 384
    :cond_4
    :try_start_1
    invoke-static {p0}, Lcom/umeng/commonsdk/framework/UMFrUtils;->getEnvelopeDirPath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    .line 385
    :goto_0
    array-length v4, v0

    if-ge v3, v4, :cond_5

    .line 386
    aget-object v4, v0, v3

    new-instance v5, Ljava/io/File;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v7, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v7, v0, v3

    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 388
    :cond_5
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 389
    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    .line 392
    :try_start_2
    invoke-static {p0, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    .line 374
    :cond_6
    :goto_1
    :try_start_3
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 375
    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return-void

    :catchall_1
    move-exception v0

    .line 378
    :try_start_4
    invoke-static {p0, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    .line 395
    invoke-static {p0, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    :cond_7
    :goto_2
    return-void
.end method

.method public static toByteArray(Ljava/lang/String;)[B
    .locals 11

    .line 550
    invoke-static {}, Lcom/umeng/commonsdk/framework/UMModuleRegister;->getAppContext()Landroid/content/Context;

    move-result-object v1

    .line 552
    sget-object v0, Lcom/umeng/commonsdk/framework/UMFrUtils;->mEnvelopeFileLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v2, 0x0

    .line 554
    :try_start_0
    new-instance v3, Ljava/io/RandomAccessFile;

    const-string v4, "r"

    invoke-direct {v3, p0, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3}, Ll/ᩴۖܽ;->֫(Ljava/io/RandomAccessFile;)Ljava/nio/channels/FileChannel;

    move-result-object v2

    .line 555
    sget-object v6, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;

    .line 556
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v9

    const-wide/16 v7, 0x0

    move-object v5, v2

    .line 555
    invoke-virtual/range {v5 .. v10}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    move-result-object p0

    .line 556
    invoke-virtual {p0}, Ljava/nio/MappedByteBuffer;->load()Ljava/nio/MappedByteBuffer;

    move-result-object p0

    .line 558
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v3

    long-to-int v4, v3

    new-array v3, v4, [B

    .line 559
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v4

    if-lez v4, :cond_0

    .line 560
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {p0, v3, v5, v4}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 568
    :cond_0
    :try_start_1
    invoke-virtual {v2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 570
    :try_start_2
    invoke-static {v1, p0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 571
    :goto_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    return-object v3

    :catchall_1
    move-exception p0

    goto :goto_1

    :catch_0
    move-exception p0

    .line 564
    :try_start_3
    invoke-static {v1, p0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 565
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 568
    :goto_1
    :try_start_4
    invoke-virtual {v2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v2

    .line 570
    :try_start_5
    invoke-static {v1, v2}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 571
    :goto_2
    throw p0

    :catchall_3
    move-exception p0

    .line 573
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    throw p0
.end method

.method public static updateLastInstantBuildTime(Landroid/content/Context;)V
    .locals 4

    .line 469
    sget-object v0, Lcom/umeng/commonsdk/framework/UMFrUtils;->mEnvelopeBuildTimeLock:Ljava/lang/Object;

    monitor-enter v0

    .line 470
    :try_start_0
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    .line 471
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 472
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string v3, "last_instant_build_time"

    invoke-interface {p0, v3, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 473
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static updateLastSuccessfulBuildTime(Landroid/content/Context;)V
    .locals 4

    .line 461
    sget-object v0, Lcom/umeng/commonsdk/framework/UMFrUtils;->mEnvelopeBuildTimeLock:Ljava/lang/Object;

    monitor-enter v0

    .line 462
    :try_start_0
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    .line 463
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 464
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string v3, "last_successful_build_time"

    invoke-interface {p0, v3, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 465
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
