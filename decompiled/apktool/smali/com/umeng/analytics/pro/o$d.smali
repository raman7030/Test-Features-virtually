.class public Lcom/umeng/analytics/pro/o$d;
.super Ljava/lang/Object;
.source "D45J"


# instance fields
.field public a:Ljava/util/Map;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1418
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 1413
    iput-object v0, p0, Lcom/umeng/analytics/pro/o$d;->a:Ljava/util/Map;

    .line 1414
    iput-object v0, p0, Lcom/umeng/analytics/pro/o$d;->b:Ljava/lang/String;

    .line 1415
    iput-object v0, p0, Lcom/umeng/analytics/pro/o$d;->c:Ljava/lang/String;

    const-wide/16 v0, 0x0

    .line 1416
    iput-wide v0, p0, Lcom/umeng/analytics/pro/o$d;->d:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;J)V
    .locals 0

    .line 1421
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1422
    iput-object p2, p0, Lcom/umeng/analytics/pro/o$d;->a:Ljava/util/Map;

    .line 1423
    iput-object p1, p0, Lcom/umeng/analytics/pro/o$d;->b:Ljava/lang/String;

    .line 1424
    iput-wide p4, p0, Lcom/umeng/analytics/pro/o$d;->d:J

    .line 1425
    iput-object p3, p0, Lcom/umeng/analytics/pro/o$d;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1

    .line 1429
    iget-object v0, p0, Lcom/umeng/analytics/pro/o$d;->a:Ljava/util/Map;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1433
    iget-object v0, p0, Lcom/umeng/analytics/pro/o$d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1437
    iget-object v0, p0, Lcom/umeng/analytics/pro/o$d;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()J
    .locals 2

    .line 1441
    iget-wide v0, p0, Lcom/umeng/analytics/pro/o$d;->d:J

    return-wide v0
.end method
