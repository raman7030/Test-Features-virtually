.class public Lorg/simpleframework/xml/transform/DateType$DateFormat;
.super Ljava/lang/Object;
.source "DateType.java"


# instance fields
.field public format:Ljava/text/SimpleDateFormat;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 162
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 163
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-direct {v0, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/simpleframework/xml/transform/DateType$DateFormat;->format:Ljava/text/SimpleDateFormat;

    return-void
.end method


# virtual methods
.method public declared-synchronized getDate(Ljava/lang/String;)Ljava/util/Date;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 189
    :try_start_0
    iget-object v1, p0, Lorg/simpleframework/xml/transform/DateType$DateFormat;->format:Ljava/text/SimpleDateFormat;

    invoke-virtual {v1, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized getText(Ljava/util/Date;)Ljava/lang/String;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 176
    :try_start_0
    iget-object v1, p0, Lorg/simpleframework/xml/transform/DateType$DateFormat;->format:Ljava/text/SimpleDateFormat;

    invoke-virtual {v1, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
