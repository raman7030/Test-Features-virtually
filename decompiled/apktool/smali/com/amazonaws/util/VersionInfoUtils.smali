.class public Lcom/amazonaws/util/VersionInfoUtils;
.super Ljava/lang/Object;
.source "VersionInfoUtils.java"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Lcom/amazonaws/logging/Log;

.field public static volatile ܽ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 42
    const-class v0, Lcom/amazonaws/util/VersionInfoUtils;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/util/VersionInfoUtils;->ۧ:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫()Ljava/lang/String;
    .locals 2

    .line 78
    sget-object v0, Lcom/amazonaws/util/VersionInfoUtils;->ܽ:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 79
    const-class v0, Lcom/amazonaws/util/VersionInfoUtils;

    monitor-enter v0

    .line 80
    :try_start_0
    sget-object v1, Lcom/amazonaws/util/VersionInfoUtils;->ܽ:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 81
    invoke-static {}, Lcom/amazonaws/util/VersionInfoUtils;->ۧ()V

    .line 82
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 84
    :cond_1
    :goto_0
    sget-object v0, Lcom/amazonaws/util/VersionInfoUtils;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public static ۧ()V
    .locals 6

    const/16 v0, 0x80

    const-string v1, "aws-sdk-"

    .line 0
    invoke-static {v0, v1}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "android"

    .line 100
    invoke-static {v1}, Lcom/amazonaws/util/StringUtils;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/2.81.1 "

    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "os.name"

    .line 105
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x5f

    const/16 v3, 0x20

    if-eqz v1, :cond_0

    .line 136
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    .line 105
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "os.version"

    .line 107
    invoke-static {v4}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 136
    invoke-virtual {v4, v3, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v4

    .line 107
    :cond_1
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " "

    .line 109
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "java.vm.name"

    .line 110
    invoke-static {v5}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 136
    invoke-virtual {v5, v3, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v5

    .line 110
    :cond_2
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "java.vm.version"

    .line 112
    invoke-static {v5}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 136
    invoke-virtual {v5, v3, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v5

    .line 112
    :cond_3
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "java.version"

    .line 114
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 136
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    .line 114
    :cond_4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "user.language"

    .line 116
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "user.region"

    .line 117
    invoke-static {v5}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v1, :cond_5

    if-eqz v5, :cond_5

    .line 120
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_"

    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    invoke-virtual {v5, v3, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 93
    sput-object v0, Lcom/amazonaws/util/VersionInfoUtils;->ܽ:Ljava/lang/String;

    return-void
.end method
