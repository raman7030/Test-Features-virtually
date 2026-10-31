.class public Ll/۟᩹ۧ;
.super Landroid/content/BroadcastReceiver;
.source "39N7"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    if-nez p2, :cond_0

    goto/16 :goto_2

    .line 102
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "androidx.profileinstaller.action.INSTALL_PROFILE"

    .line 103
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 104
    new-instance p2, Ll/᩺᩹ۧ;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ll/ܰ᩹ۧ;

    invoke-direct {v0, p0}, Ll/ܰ᩹ۧ;-><init>(Ll/۟᩹ۧ;)V

    const/4 v1, 0x1

    invoke-static {p1, p2, v0, v1}, Ll/ܽ᩶ۧ;->֫(Landroid/content/Context;Ljava/util/concurrent/Executor;Ll/ۧ᩶ۧ;Z)V

    return-void

    :cond_1
    const-string v1, "androidx.profileinstaller.action.SKIP_FILE"

    .line 106
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/16 v2, 0xa

    if-eqz v1, :cond_3

    .line 107
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_a

    const-string v0, "EXTRA_SKIP_FILE_OPERATION"

    .line 109
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "WRITE_SKIP_FILE"

    .line 110
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 601
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    .line 602
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p2

    .line 603
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    .line 606
    :try_start_0
    invoke-virtual {v0, p2, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p2
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 611
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    .line 612
    invoke-static {p2, p1}, Ll/ܽ᩶ۧ;->֫(Landroid/content/pm/PackageInfo;Ljava/io/File;)V

    .line 166
    invoke-virtual {p0, v2}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    goto/16 :goto_2

    :catch_0
    const/4 p1, 0x7

    goto/16 :goto_1

    :cond_2
    const-string v0, "DELETE_SKIP_FILE"

    .line 112
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    .line 630
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    .line 407
    new-instance p2, Ljava/io/File;

    const-string v0, "profileinstaller_profileWrittenFor_lastUpdateTime.dat"

    invoke-direct {p2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 408
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    const/16 p1, 0xb

    .line 166
    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    return-void

    :cond_3
    const-string v1, "androidx.profileinstaller.action.SAVE_PROFILE"

    .line 117
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/16 v3, 0x18

    if-eqz v1, :cond_5

    .line 149
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v3, :cond_4

    .line 150
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result p1

    invoke-static {p1, v2}, Landroid/os/Process;->sendSignal(II)V

    const/16 p1, 0xc

    .line 166
    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    return-void

    :cond_4
    const/16 p1, 0xd

    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    return-void

    :cond_5
    const-string v1, "androidx.profileinstaller.action.BENCHMARK_OPERATION"

    .line 119
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 120
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_a

    const-string v0, "EXTRA_BENCHMARK_OPERATION"

    .line 122
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "DROP_SHADER_CACHE"

    .line 124
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_9

    .line 35
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v3, :cond_6

    .line 37
    invoke-static {p1}, Ll/ۙ᩹ۧ;->֫(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    goto :goto_0

    :cond_6
    const/16 v0, 0x17

    if-lt p2, v0, :cond_7

    .line 79
    invoke-virtual {p1}, Landroid/content/Context;->getCodeCacheDir()Ljava/io/File;

    move-result-object p1

    goto :goto_0

    .line 42
    :cond_7
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    .line 44
    :goto_0
    invoke-static {p1}, Ll/ۗ᩹ۧ;->֫(Ljava/io/File;)Z

    move-result p1

    if-eqz p1, :cond_8

    const/16 p1, 0xe

    .line 166
    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    return-void

    :cond_8
    const/16 p1, 0xf

    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    return-void

    :cond_9
    const/16 p1, 0x10

    :goto_1
    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    :cond_a
    :goto_2
    return-void
.end method
