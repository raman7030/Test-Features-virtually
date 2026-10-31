.class public Lcom/umeng/commonsdk/debug/UMRTLog;
.super Ljava/lang/Object;
.source "UMRTLog.java"


# static fields
.field public static final RTLOG_ENABLE:Ljava/lang/String; = "1"

.field public static final RTLOG_PROP:Ljava/lang/String; = "debug.umeng.rtlog"

.field public static final RTLOG_TAG:Ljava/lang/String; = "MobclickRT"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 52
    invoke-static {}, Lcom/umeng/commonsdk/debug/UMRTLog;->shouldOutput()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    .line 53
    invoke-static {p1, p0}, Lcom/umeng/commonsdk/debug/UMRTLog;->warpperMsg(Ljava/lang/String;Z)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 34
    invoke-static {}, Lcom/umeng/commonsdk/debug/UMRTLog;->shouldOutput()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    .line 35
    invoke-static {p1, p0}, Lcom/umeng/commonsdk/debug/UMRTLog;->warpperMsg(Ljava/lang/String;Z)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 46
    invoke-static {}, Lcom/umeng/commonsdk/debug/UMRTLog;->shouldOutput()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    .line 47
    invoke-static {p1, p0}, Lcom/umeng/commonsdk/debug/UMRTLog;->warpperMsg(Ljava/lang/String;Z)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static sd(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 83
    invoke-static {}, Lcom/umeng/commonsdk/debug/UMRTLog;->shouldOutput()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    .line 84
    invoke-static {p1, p0}, Lcom/umeng/commonsdk/debug/UMRTLog;->warpperMsg(Ljava/lang/String;Z)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static se(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 65
    invoke-static {}, Lcom/umeng/commonsdk/debug/UMRTLog;->shouldOutput()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    .line 66
    invoke-static {p1, p0}, Lcom/umeng/commonsdk/debug/UMRTLog;->warpperMsg(Ljava/lang/String;Z)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static shouldOutput()Z
    .locals 2

    const-string v0, "debug.umeng.rtlog"

    const-string v1, "0"

    .line 27
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/utils/UMUtils;->getSystemProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static si(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 77
    invoke-static {}, Lcom/umeng/commonsdk/debug/UMRTLog;->shouldOutput()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    .line 78
    invoke-static {p1, p0}, Lcom/umeng/commonsdk/debug/UMRTLog;->warpperMsg(Ljava/lang/String;Z)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static sv(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 89
    invoke-static {}, Lcom/umeng/commonsdk/debug/UMRTLog;->shouldOutput()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    .line 90
    invoke-static {p1, p0}, Lcom/umeng/commonsdk/debug/UMRTLog;->warpperMsg(Ljava/lang/String;Z)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static sw(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 71
    invoke-static {}, Lcom/umeng/commonsdk/debug/UMRTLog;->shouldOutput()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    .line 72
    invoke-static {p1, p0}, Lcom/umeng/commonsdk/debug/UMRTLog;->warpperMsg(Ljava/lang/String;Z)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static v(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 58
    invoke-static {}, Lcom/umeng/commonsdk/debug/UMRTLog;->shouldOutput()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    .line 59
    invoke-static {p1, p0}, Lcom/umeng/commonsdk/debug/UMRTLog;->warpperMsg(Ljava/lang/String;Z)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 40
    invoke-static {}, Lcom/umeng/commonsdk/debug/UMRTLog;->shouldOutput()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    .line 41
    invoke-static {p1, p0}, Lcom/umeng/commonsdk/debug/UMRTLog;->warpperMsg(Ljava/lang/String;Z)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static warpperMsg(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 5

    const-string v0, ":"

    if-nez p1, :cond_0

    goto :goto_1

    .line 102
    :cond_0
    :try_start_0
    new-instance p1, Ljava/lang/Throwable;

    invoke-direct {p1}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    .line 103
    array-length v1, p1

    const/4 v2, 0x3

    if-lt v1, v2, :cond_1

    const/4 v1, 0x2

    .line 104
    aget-object v2, p1, v1

    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v2

    .line 105
    aget-object v3, p1, v1

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v3

    .line 106
    aget-object p1, p1, v1

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result p1

    .line 107
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v4, "<"

    .line 108
    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 109
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 110
    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 111
    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 112
    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 113
    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string p1, "> "

    .line 114
    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 115
    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 121
    :goto_0
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    :catchall_0
    :goto_1
    return-object p0
.end method
