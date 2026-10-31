.class public Lcom/amazonaws/util/DateUtils;
.super Ljava/lang/Object;
.source "DateUtils.java"


# static fields
.field public static final ֫:Ljava/util/TimeZone;

.field public static final ۧ:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "GMT"

    .line 51
    invoke-static {v0}, Ll/ۗ۬ᩴ;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/util/DateUtils;->֫:Ljava/util/TimeZone;

    .line 56
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/amazonaws/util/DateUtils;->ۧ:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/util/Date;)Ljava/lang/String;
    .locals 0

    .line 111
    invoke-static {p0}, Lcom/amazonaws/util/DateUtils;->֫(Ljava/lang/String;)Ljava/lang/ThreadLocal;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/text/SimpleDateFormat;

    invoke-virtual {p0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/ThreadLocal;
    .locals 3

    .line 66
    sget-object v1, Lcom/amazonaws/util/DateUtils;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/ThreadLocal;

    if-nez v2, :cond_1

    move-object v0, v1

    .line 68
    monitor-enter v0

    .line 69
    :try_start_0
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ThreadLocal;

    if-nez v2, :cond_0

    .line 71
    new-instance v2, Lcom/amazonaws/util/DateUtils$1;

    invoke-direct {v2, p0}, Lcom/amazonaws/util/DateUtils$1;-><init>(Ljava/lang/String;)V

    .line 80
    invoke-virtual {v1, p0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    :cond_0
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    return-object v2
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;
    .locals 0

    .line 97
    :try_start_0
    invoke-static {p0}, Lcom/amazonaws/util/DateUtils;->֫(Ljava/lang/String;)Ljava/lang/ThreadLocal;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/text/SimpleDateFormat;

    invoke-virtual {p0, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 99
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static ֫(Ljava/util/Date;)Ljava/util/Date;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 180
    :cond_0
    new-instance v0, Ljava/util/Date;

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    return-object v0
.end method

.method public static synthetic ֫()Ljava/util/TimeZone;
    .locals 1

    .line 33
    sget-object v0, Lcom/amazonaws/util/DateUtils;->֫:Ljava/util/TimeZone;

    return-object v0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/util/Date;
    .locals 1

    :try_start_0
    const-string v0, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    .line 123
    invoke-static {v0, p0}, Lcom/amazonaws/util/DateUtils;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const-string v0, "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'"

    .line 127
    invoke-static {v0, p0}, Lcom/amazonaws/util/DateUtils;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method
