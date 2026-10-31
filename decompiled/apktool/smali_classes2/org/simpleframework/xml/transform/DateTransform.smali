.class public Lorg/simpleframework/xml/transform/DateTransform;
.super Ljava/lang/Object;
.source "DateTransform.java"

# interfaces
.implements Lorg/simpleframework/xml/transform/Transform;


# instance fields
.field public final factory:Lorg/simpleframework/xml/transform/DateFactory;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    new-instance v0, Lorg/simpleframework/xml/transform/DateFactory;

    invoke-direct {v0, p1}, Lorg/simpleframework/xml/transform/DateFactory;-><init>(Ljava/lang/Class;)V

    iput-object v0, p0, Lorg/simpleframework/xml/transform/DateTransform;->factory:Lorg/simpleframework/xml/transform/DateFactory;

    return-void
.end method


# virtual methods
.method public bridge synthetic read(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 44
    invoke-virtual {p0, p1}, Lorg/simpleframework/xml/transform/DateTransform;->read(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized read(Ljava/lang/String;)Ljava/util/Date;
    .locals 4

    move-object v0, p0

    monitor-enter v0

    .line 75
    :try_start_0
    invoke-static {p1}, Lorg/simpleframework/xml/transform/DateType;->getDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    .line 76
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    .line 78
    iget-object v1, p0, Lorg/simpleframework/xml/transform/DateTransform;->factory:Lorg/simpleframework/xml/transform/DateFactory;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v1, v2}, Lorg/simpleframework/xml/transform/DateFactory;->getInstance([Ljava/lang/Object;)Ljava/util/Date;

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

.method public bridge synthetic write(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 44
    check-cast p1, Ljava/util/Date;

    invoke-virtual {p0, p1}, Lorg/simpleframework/xml/transform/DateTransform;->write(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized write(Ljava/util/Date;)Ljava/lang/String;
    .locals 1

    move-object v0, p0

    monitor-enter v0

    .line 92
    :try_start_0
    invoke-static {p1}, Lorg/simpleframework/xml/transform/DateType;->getText(Ljava/util/Date;)Ljava/lang/String;

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
