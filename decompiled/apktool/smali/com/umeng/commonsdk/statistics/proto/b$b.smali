.class public Lcom/umeng/commonsdk/statistics/proto/b$b;
.super Ljava/lang/Object;
.source "T5ZW"

# interfaces
.implements Lcom/umeng/analytics/pro/cd;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/umeng/commonsdk/statistics/proto/b$1;)V
    .locals 0

    .line 344
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/proto/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/umeng/commonsdk/statistics/proto/b$a;
    .locals 2

    .line 347
    new-instance v0, Lcom/umeng/commonsdk/statistics/proto/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/umeng/commonsdk/statistics/proto/b$a;-><init>(Lcom/umeng/commonsdk/statistics/proto/b$1;)V

    return-object v0
.end method

.method public synthetic b()Lcom/umeng/analytics/pro/cc;
    .locals 1

    .line 344
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/proto/b$b;->a()Lcom/umeng/commonsdk/statistics/proto/b$a;

    move-result-object v0

    return-object v0
.end method
