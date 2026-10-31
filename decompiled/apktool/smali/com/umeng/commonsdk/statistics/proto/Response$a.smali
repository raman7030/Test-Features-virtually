.class public Lcom/umeng/commonsdk/statistics/proto/Response$a;
.super Lcom/umeng/analytics/pro/ce;
.source "Response.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 358
    invoke-direct {p0}, Lcom/umeng/analytics/pro/ce;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/umeng/commonsdk/statistics/proto/Response$1;)V
    .locals 0

    .line 358
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/proto/Response$a;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lcom/umeng/analytics/pro/bu;Lcom/umeng/analytics/pro/av;)V
    .locals 0

    .line 358
    check-cast p2, Lcom/umeng/commonsdk/statistics/proto/Response;

    invoke-virtual {p0, p1, p2}, Lcom/umeng/commonsdk/statistics/proto/Response$a;->b(Lcom/umeng/analytics/pro/bu;Lcom/umeng/commonsdk/statistics/proto/Response;)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/bu;Lcom/umeng/commonsdk/statistics/proto/Response;)V
    .locals 4

    .line 363
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->j()Lcom/umeng/analytics/pro/bz;

    .line 365
    :goto_0
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->l()Lcom/umeng/analytics/pro/bp;

    move-result-object v0

    .line 366
    iget-byte v1, v0, Lcom/umeng/analytics/pro/bp;->b:B

    if-nez v1, :cond_1

    .line 400
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->k()V

    .line 404
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/Response;->isSetResp_code()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 408
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/Response;->validate()V

    return-void

    .line 405
    :cond_0
    new-instance p1, Lcom/umeng/analytics/pro/bv;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Required field \'resp_code\' was not found in serialized data! Struct: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 406
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/umeng/analytics/pro/bv;-><init>(Ljava/lang/String;)V

    throw p1

    .line 369
    :cond_1
    iget-short v0, v0, Lcom/umeng/analytics/pro/bp;->c:S

    const/4 v2, 0x1

    if-eq v0, v2, :cond_6

    const/4 v3, 0x2

    if-eq v0, v3, :cond_4

    const/4 v3, 0x3

    if-eq v0, v3, :cond_2

    .line 396
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/bx;->a(Lcom/umeng/analytics/pro/bu;B)V

    goto :goto_1

    :cond_2
    const/16 v0, 0xc

    if-ne v1, v0, :cond_3

    .line 388
    new-instance v0, Lcom/umeng/commonsdk/statistics/proto/d;

    invoke-direct {v0}, Lcom/umeng/commonsdk/statistics/proto/d;-><init>()V

    iput-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/Response;->imprint:Lcom/umeng/commonsdk/statistics/proto/d;

    .line 389
    invoke-virtual {v0, p1}, Lcom/umeng/commonsdk/statistics/proto/d;->read(Lcom/umeng/analytics/pro/bu;)V

    .line 390
    invoke-virtual {p2, v2}, Lcom/umeng/commonsdk/statistics/proto/Response;->setImprintIsSet(Z)V

    goto :goto_1

    .line 392
    :cond_3
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/bx;->a(Lcom/umeng/analytics/pro/bu;B)V

    goto :goto_1

    :cond_4
    const/16 v0, 0xb

    if-ne v1, v0, :cond_5

    .line 380
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->z()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/Response;->msg:Ljava/lang/String;

    .line 381
    invoke-virtual {p2, v2}, Lcom/umeng/commonsdk/statistics/proto/Response;->setMsgIsSet(Z)V

    goto :goto_1

    .line 383
    :cond_5
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/bx;->a(Lcom/umeng/analytics/pro/bu;B)V

    goto :goto_1

    :cond_6
    const/16 v0, 0x8

    if-ne v1, v0, :cond_7

    .line 372
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->w()I

    move-result v0

    iput v0, p2, Lcom/umeng/commonsdk/statistics/proto/Response;->resp_code:I

    .line 373
    invoke-virtual {p2, v2}, Lcom/umeng/commonsdk/statistics/proto/Response;->setResp_codeIsSet(Z)V

    goto :goto_1

    .line 375
    :cond_7
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/bx;->a(Lcom/umeng/analytics/pro/bu;B)V

    .line 398
    :goto_1
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->m()V

    goto :goto_0
.end method

.method public synthetic b(Lcom/umeng/analytics/pro/bu;Lcom/umeng/analytics/pro/av;)V
    .locals 0

    .line 358
    check-cast p2, Lcom/umeng/commonsdk/statistics/proto/Response;

    invoke-virtual {p0, p1, p2}, Lcom/umeng/commonsdk/statistics/proto/Response$a;->a(Lcom/umeng/analytics/pro/bu;Lcom/umeng/commonsdk/statistics/proto/Response;)V

    return-void
.end method

.method public b(Lcom/umeng/analytics/pro/bu;Lcom/umeng/commonsdk/statistics/proto/Response;)V
    .locals 1

    .line 413
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/Response;->validate()V

    .line 415
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/Response;->access$300()Lcom/umeng/analytics/pro/bz;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Lcom/umeng/analytics/pro/bz;)V

    .line 416
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/Response;->access$400()Lcom/umeng/analytics/pro/bp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Lcom/umeng/analytics/pro/bp;)V

    .line 417
    iget v0, p2, Lcom/umeng/commonsdk/statistics/proto/Response;->resp_code:I

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(I)V

    .line 418
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->c()V

    .line 419
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/Response;->msg:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 420
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/Response;->isSetMsg()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 421
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/Response;->access$500()Lcom/umeng/analytics/pro/bp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Lcom/umeng/analytics/pro/bp;)V

    .line 422
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/Response;->msg:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Ljava/lang/String;)V

    .line 423
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->c()V

    .line 426
    :cond_0
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/Response;->imprint:Lcom/umeng/commonsdk/statistics/proto/d;

    if-eqz v0, :cond_1

    .line 427
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/Response;->isSetImprint()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 428
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/Response;->access$600()Lcom/umeng/analytics/pro/bp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Lcom/umeng/analytics/pro/bp;)V

    .line 429
    iget-object p2, p2, Lcom/umeng/commonsdk/statistics/proto/Response;->imprint:Lcom/umeng/commonsdk/statistics/proto/d;

    invoke-virtual {p2, p1}, Lcom/umeng/commonsdk/statistics/proto/d;->write(Lcom/umeng/analytics/pro/bu;)V

    .line 430
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->c()V

    .line 433
    :cond_1
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->d()V

    .line 434
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->b()V

    return-void
.end method
