.class public final Ll/ᩴۗܿ;
.super Ljava/lang/Object;
.source "Y5CH"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# static fields
.field public static final ֫:Ll/ᩴۗܿ;

.field public static ۧ:Ljava/lang/Thread$UncaughtExceptionHandler;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 37
    new-instance v0, Ll/ᩴۗܿ;

    .line 39
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 37
    sput-object v0, Ll/ᩴۗܿ;->֫:Ll/ᩴۗܿ;

    return-void
.end method

.method public static ֫(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 4

    .line 107
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    invoke-static {}, Ll/ۢ֨ۢ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ROOT"

    goto :goto_0

    .line 111
    :cond_0
    invoke-static {}, Ll/ۢ֨ۢ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "SHELL"

    goto :goto_0

    :cond_1
    const-string v0, "APP"

    .line 116
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "VER: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "2.26.10(26101061)\nPERMISSION: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\nABI: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    invoke-static {}, Lbin/mt/plus/Features;->getABI()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\nMODEL: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\nSDK: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\nRELEASE: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :try_start_0
    const-string v2, "TARGET_SDK: "

    .line 123
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ll/ۙ᩸᩷;->֫()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    iget v2, v2, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    nop

    .line 126
    :goto_1
    invoke-static {}, Ll/ۢ֨ۢ;->ۢ()Z

    move-result v2

    if-eqz v2, :cond_2

    instance-of v2, p0, Ll/֨ܽܽ;

    if-eqz v2, :cond_2

    const-string v2, "at android.os.BinderProxy.transactNative(Native Method)"

    invoke-static {v1, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    const-string v2, "===============================================\n\u8be5\u9519\u8bef\u53ef\u80fd\u662f\u7531 Shizuku \u5bfc\u81f4\u7684\uff0c\u8bf7\u5c1d\u8bd5\u8fdb\u5165 Shizuku \u4e2d\n\u5173\u6389 MT \u7ba1\u7406\u5668\u7684\u6388\u6743\uff0c\u7136\u540e\u518d\u91cd\u65b0\u6253\u5f00 MT \u7ba1\u7406\u5668\uff01\n===============================================\nThis error may be caused by Shizuku. Please try to enter Shizuku,\nturn off the authorization of MT and then reopen MT!\n===============================================\n"

    .line 127
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const-string v2, "---StackTrace---"

    .line 137
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 138
    invoke-static {v1, p0}, Ll/ۘ۫ۡ;->֫(Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 139
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ()Ll/ᩴۗܿ;
    .locals 1

    .line 43
    sget-object v0, Ll/ᩴۗܿ;->֫:Ll/ᩴۗܿ;

    return-object v0
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 6

    .line 63
    invoke-static {}, Ll/᩶ۘܽ;->ۧ()V

    if-eqz p2, :cond_5

    .line 90
    sget-object v0, Ll/ᩴۗܿ;->ۧ:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-nez v0, :cond_0

    goto/16 :goto_3

    .line 92
    :cond_0
    invoke-static {p2}, Ll/ᩴۗܿ;->֫(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    .line 95
    :try_start_0
    new-instance v1, Ljava/io/File;

    const-string v2, "/data/data/bin.mt.plus/DEBUG.log"

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 96
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v2

    sget v3, Ll/ܺۢ֡;->֫:I

    const/4 v3, 0x0

    .line 3259
    invoke-static {v0, v3}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 3550
    invoke-static {v1}, Ll/ܺۢ֡;->ܿ(Ljava/io/File;)Ljava/io/OutputStream;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 3551
    :try_start_1
    sget-object v4, Ll/᩹ۢ֡;->֫:[B

    if-eqz v3, :cond_2

    .line 3597
    invoke-static {v1}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;

    move-result-object v4

    sget v5, Ll/ۡۢ֡;->֫:I

    if-nez v2, :cond_1

    .line 217
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v2

    .line 3597
    :cond_1
    invoke-virtual {v2, v3}, Ljava/nio/charset/Charset;->encode(Ljava/lang/String;)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    if-eqz v1, :cond_4

    .line 3552
    :try_start_2
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_0
    move-exception v2

    if-eqz v1, :cond_3

    .line 3550
    :try_start_3
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_0
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 100
    :catchall_2
    :cond_4
    :goto_1
    :try_start_5
    invoke-static {}, Ll/ܽ֡ܿ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v1

    const-string v2, "DEBUG.log"

    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ۡ(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_2

    :catchall_3
    nop

    .line 64
    :goto_2
    sget-boolean v0, Ll/ܰۛۡ;->֫:Z

    if-eqz v0, :cond_5

    .line 66
    :try_start_6
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 67
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v1

    const-class v2, Ll/۬ۖ᩷;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    const/high16 v1, 0x10000000

    .line 68
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 69
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 70
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_4

    :catchall_4
    nop

    .line 75
    :cond_5
    :goto_3
    sget-object v0, Ll/ᩴۗܿ;->ۧ:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_6

    .line 76
    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 77
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string p2, "use DefaultHandler"

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_6
    :goto_4
    return-void
.end method

.method public final ֫()V
    .locals 1

    .line 50
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    .line 55
    sput-object v0, Ll/ᩴۗܿ;->ۧ:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 51
    invoke-static {p0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-void
.end method
