.class public Lcom/umeng/commonsdk/statistics/proto/Response$c;
.super Lcom/umeng/analytics/pro/cf;
.source "Response.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 446
    invoke-direct {p0}, Lcom/umeng/analytics/pro/cf;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/umeng/commonsdk/statistics/proto/Response$1;)V
    .locals 0

    .line 446
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/proto/Response$c;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/umeng/analytics/pro/bu;Lcom/umeng/analytics/pro/av;)V
    .locals 0

    .line 446
    check-cast p2, Lcom/umeng/commonsdk/statistics/proto/Response;

    invoke-virtual {p0, p1, p2}, Lcom/umeng/commonsdk/statistics/proto/Response$c;->a(Lcom/umeng/analytics/pro/bu;Lcom/umeng/commonsdk/statistics/proto/Response;)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/bu;Lcom/umeng/commonsdk/statistics/proto/Response;)V
    .locals 2

    .line 451
    check-cast p1, Lcom/umeng/analytics/pro/ca;

    .line 452
    iget v0, p2, Lcom/umeng/commonsdk/statistics/proto/Response;->resp_code:I

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bo;->a(I)V

    .line 453
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 454
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/Response;->isSetMsg()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 455
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 457
    :cond_0
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/Response;->isSetImprint()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 458
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    :cond_1
    const/4 v1, 0x2

    .line 460
    invoke-virtual {p1, v0, v1}, Lcom/umeng/analytics/pro/ca;->a(Ljava/util/BitSet;I)V

    .line 461
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/Response;->isSetMsg()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 462
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/Response;->msg:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bo;->a(Ljava/lang/String;)V

    .line 464
    :cond_2
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/Response;->isSetImprint()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 465
    iget-object p2, p2, Lcom/umeng/commonsdk/statistics/proto/Response;->imprint:Lcom/umeng/commonsdk/statistics/proto/d;

    invoke-virtual {p2, p1}, Lcom/umeng/commonsdk/statistics/proto/d;->write(Lcom/umeng/analytics/pro/bu;)V

    :cond_3
    return-void
.end method

.method public bridge synthetic b(Lcom/umeng/analytics/pro/bu;Lcom/umeng/analytics/pro/av;)V
    .locals 0

    .line 446
    check-cast p2, Lcom/umeng/commonsdk/statistics/proto/Response;

    invoke-virtual {p0, p1, p2}, Lcom/umeng/commonsdk/statistics/proto/Response$c;->b(Lcom/umeng/analytics/pro/bu;Lcom/umeng/commonsdk/statistics/proto/Response;)V

    return-void
.end method

.method public b(Lcom/umeng/analytics/pro/bu;Lcom/umeng/commonsdk/statistics/proto/Response;)V
    .locals 3

    .line 472
    check-cast p1, Lcom/umeng/analytics/pro/ca;

    .line 473
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bo;->w()I

    move-result v0

    iput v0, p2, Lcom/umeng/commonsdk/statistics/proto/Response;->resp_code:I

    const/4 v0, 0x1

    .line 474
    invoke-virtual {p2, v0}, Lcom/umeng/commonsdk/statistics/proto/Response;->setResp_codeIsSet(Z)V

    const/4 v1, 0x2

    .line 475
    invoke-virtual {p1, v1}, Lcom/umeng/analytics/pro/ca;->b(I)Ljava/util/BitSet;

    move-result-object v1

    const/4 v2, 0x0

    .line 476
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 477
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bo;->z()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p2, Lcom/umeng/commonsdk/statistics/proto/Response;->msg:Ljava/lang/String;

    .line 478
    invoke-virtual {p2, v0}, Lcom/umeng/commonsdk/statistics/proto/Response;->setMsgIsSet(Z)V

    .line 480
    :cond_0
    invoke-virtual {v1, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 481
    new-instance v1, Lcom/umeng/commonsdk/statistics/proto/d;

    invoke-direct {v1}, Lcom/umeng/commonsdk/statistics/proto/d;-><init>()V

    iput-object v1, p2, Lcom/umeng/commonsdk/statistics/proto/Response;->imprint:Lcom/umeng/commonsdk/statistics/proto/d;

    .line 482
    invoke-virtual {v1, p1}, Lcom/umeng/commonsdk/statistics/proto/d;->read(Lcom/umeng/analytics/pro/bu;)V

    .line 483
    invoke-virtual {p2, v0}, Lcom/umeng/commonsdk/statistics/proto/Response;->setImprintIsSet(Z)V

    :cond_1
    return-void
.end method
