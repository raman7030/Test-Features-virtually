.class public final Ll/ۘܳۡ;
.super Ljava/lang/Object;
.source "YBJ2"


# instance fields
.field public final ֫:Ll/ۢܳۡ;


# direct methods
.method public constructor <init>(Ll/ۢܳۡ;)V
    .locals 0

    .line 385
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 386
    iput-object p1, p0, Ll/ۘܳۡ;->֫:Ll/ۢܳۡ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۖܳۡ;Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 417
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x400

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v1, 0x3c

    .line 403
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 404
    invoke-virtual {p1}, Ll/ۖܳۡ;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 420
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Ll/ۘܳۡ;->֫:Ll/ۢܳۡ;

    invoke-virtual {p2}, Ll/ۢܳۡ;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 422
    invoke-virtual {p1}, Ll/ۖܳۡ;->֫()I

    move-result v1

    const-string v2, "\n"

    const-string v3, " "

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v1, v5, :cond_1

    .line 423
    invoke-virtual {p1, v4}, Ll/ۖܳۡ;->֫(I)Ll/ۡܳۡ;

    move-result-object v1

    .line 424
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ll/ۡܳۡ;->֫()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ll/ۡܳۡ;->ۧ()C

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ll/ۡܳۡ;->ܽ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ll/ۡܳۡ;->ۧ()C

    move-result v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 425
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v5, 0x50

    if-le v4, v5, :cond_0

    .line 426
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 429
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_5

    :cond_1
    const/4 v1, 0x0

    .line 434
    :goto_1
    invoke-virtual {p1}, Ll/ۖܳۡ;->֫()I

    move-result v6

    const-string v7, "xmlns"

    const-string v8, "xmlns:"

    const/16 v9, 0x3d

    if-ge v1, v6, :cond_5

    .line 435
    invoke-virtual {p1, v1}, Ll/ۖܳۡ;->֫(I)Ll/ۡܳۡ;

    move-result-object v6

    .line 483
    invoke-virtual {v6}, Ll/ۡܳۡ;->֫()Ljava/lang/String;

    move-result-object v10

    .line 484
    invoke-virtual {v10, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_2

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    :cond_2
    if-eqz v5, :cond_3

    .line 442
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v5, 0x0

    goto :goto_2

    .line 444
    :cond_3
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 445
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    :goto_2
    invoke-virtual {v6}, Ll/ۡܳۡ;->֫()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 449
    invoke-virtual {v6}, Ll/ۡܳۡ;->ۧ()C

    move-result v7

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 450
    invoke-virtual {v6}, Ll/ۡܳۡ;->ܽ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    invoke-virtual {v6}, Ll/ۡܳۡ;->ۧ()C

    move-result v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 454
    :cond_5
    :goto_3
    invoke-virtual {p1}, Ll/ۖܳۡ;->֫()I

    move-result v1

    if-ge v4, v1, :cond_8

    .line 455
    invoke-virtual {p1, v4}, Ll/ۖܳۡ;->֫(I)Ll/ۡܳۡ;

    move-result-object v1

    .line 483
    invoke-virtual {v1}, Ll/ۡܳۡ;->֫()Ljava/lang/String;

    move-result-object v3

    .line 484
    invoke-virtual {v3, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_7

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_4

    .line 460
    :cond_6
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 462
    invoke-virtual {v1}, Ll/ۡܳۡ;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 463
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 464
    invoke-virtual {v1}, Ll/ۡܳۡ;->ۧ()C

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 465
    invoke-virtual {v1}, Ll/ۡܳۡ;->ܽ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 466
    invoke-virtual {v1}, Ll/ۡܳۡ;->ۧ()C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_7
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 408
    :cond_8
    :goto_5
    invoke-virtual {p1}, Ll/ۖܳۡ;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_9

    const-string p1, " /"

    .line 409
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    const/16 p1, 0x3e

    .line 412
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 472
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
