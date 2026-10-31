.class public final Ll/ܳܶۘ;
.super Landroid/content/BroadcastReceiver;
.source "51RR"


# instance fields
.field public final synthetic ֫:Lcom/tencent/connect/common/AssistActivity;


# direct methods
.method public constructor <init>(Lcom/tencent/connect/common/AssistActivity;)V
    .locals 0

    .line 557
    iput-object p1, p0, Ll/ܳܶۘ;->֫:Lcom/tencent/connect/common/AssistActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    const-string p1, "#"

    .line 561
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "key_action"

    .line 562
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 563
    iget-object v3, p0, Ll/ܳܶۘ;->֫:Lcom/tencent/connect/common/AssistActivity;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    .line 566
    :cond_0
    invoke-static {v3}, Lcom/tencent/connect/common/AssistActivity;->֫(Lcom/tencent/connect/common/AssistActivity;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "QQStayReceiver action: "

    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 567
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_1

    :cond_1
    :goto_0
    const-string v2, "action_share"

    .line 564
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :goto_1
    :try_start_0
    const-string v1, "uriData"

    .line 570
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Landroid/net/Uri;

    .line 572
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    .line 573
    invoke-virtual {v1, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    const-string p1, "?"

    :goto_2
    invoke-virtual {v1, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    const/4 v2, 0x1

    add-int/2addr p1, v2

    .line 574
    invoke-virtual {v1, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "&"

    .line 575
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 576
    array-length v1, p1

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v1, :cond_3

    aget-object v6, p1, v5

    const-string v7, "="

    .line 577
    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 578
    aget-object v7, v6, v4

    aget-object v6, v6, v2

    invoke-virtual {v0, v7, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 580
    :cond_3
    invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p1

    .line 582
    invoke-static {v3}, Lcom/tencent/connect/common/AssistActivity;->֫(Lcom/tencent/connect/common/AssistActivity;)Ljava/lang/String;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "QQStayReceiver parse uri error : "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "result"

    const-string p2, "error"

    .line 584
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "response"

    const-string p2, "parse error."

    .line 585
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :goto_4
    const/4 p1, -0x1

    .line 587
    invoke-virtual {v3, p1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    return-void
.end method
