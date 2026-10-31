.class public Lcom/umeng/commonsdk/statistics/proto/Response$b;
.super Ljava/lang/Object;
.source "Response.java"

# interfaces
.implements Lcom/umeng/analytics/pro/cd;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/umeng/commonsdk/statistics/proto/Response$1;)V
    .locals 0

    .line 351
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/proto/Response$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/umeng/commonsdk/statistics/proto/Response$a;
    .locals 2

    .line 354
    new-instance v0, Lcom/umeng/commonsdk/statistics/proto/Response$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/umeng/commonsdk/statistics/proto/Response$a;-><init>(Lcom/umeng/commonsdk/statistics/proto/Response$1;)V

    return-object v0
.end method

.method public synthetic b()Lcom/umeng/analytics/pro/cc;
    .locals 1

    .line 351
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/Response$b;->a()Lcom/umeng/commonsdk/statistics/proto/Response$a;

    move-result-object v0

    return-object v0
.end method
