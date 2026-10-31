.class public final Ll/۬ۛۡ;
.super Ljava/lang/Object;
.source "Q9B5"


# direct methods
.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 78
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object p0

    .line 79
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x12c

    add-long/2addr v0, v2

    .line 82
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Process;->exitValue()I
    :try_end_0
    .catch Ljava/lang/IllegalThreadStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object p0

    const/4 v1, 0x0

    .line 51
    invoke-static {p0, v1}, Ll/֡ۤۡ;->֫(Ljava/io/InputStream;I)[B

    move-result-object p0

    .line 93
    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 85
    :catch_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v4, v2, v0

    if-gtz v4, :cond_0

    const-wide/16 v2, 0x1

    .line 90
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    goto :goto_0

    .line 86
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Process;->destroy()V

    .line 87
    new-instance p0, Ljava/util/concurrent/TimeoutException;

    invoke-direct {p0}, Ljava/util/concurrent/TimeoutException;-><init>()V

    throw p0
.end method

.method public static ֫(Z)Ljava/lang/String;
    .locals 12

    const-string v0, " -h"

    .line 28
    sget-object v1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v2, "custom_su_command"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 30
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    :cond_0
    const-string v2, " --mount-master"

    const-string v4, "--mount-master"

    const-string v5, " --target 1"

    const-string v6, "--target"

    const-string v7, " --interactive"

    const-string v8, "--interactive"

    if-eqz v1, :cond_4

    .line 32
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v9

    if-lez v9, :cond_4

    const-string v9, "magisk su"

    .line 33
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    :try_start_0
    const-string v9, "magisk su -h"

    .line 35
    invoke-static {v9}, Ll/۬ۛۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 36
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p0, :cond_1

    .line 37
    invoke-virtual {v9, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_1

    .line 38
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    :cond_1
    invoke-virtual {v9, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_2

    .line 41
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 43
    :cond_2
    invoke-virtual {v9, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 44
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    nop

    goto :goto_0

    :cond_3
    const-string v9, "-"

    .line 48
    invoke-virtual {v1, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_4

    return-object v1

    :cond_4
    :goto_0
    if-eqz v1, :cond_5

    .line 52
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_6

    :cond_5
    const-string v1, "su"

    .line 57
    :cond_6
    :try_start_1
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/۬ۛۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 58
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p0, :cond_7

    .line 59
    invoke-virtual {v0, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_7

    .line 60
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    :cond_7
    invoke-virtual {v0, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_8

    .line 63
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 65
    :cond_8
    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_9

    .line 66
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-object p0

    :catchall_1
    move-exception p0

    .line 69
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_9

    const-string v0, "Permission denied"

    .line 70
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_9

    return-object v3

    :cond_9
    return-object v1
.end method
