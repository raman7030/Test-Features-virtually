.class public final Lcom/tencent/mm/opensdk/channel/a/a;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/Context;Lcom/tencent/mm/opensdk/channel/a/a$a;)Z
    .locals 8

    const/4 v0, 0x0

    const-string v1, "MicroMsg.SDK.MMessage"

    if-nez p0, :cond_0

    const-string p0, "send fail, invalid argument"

    goto :goto_0

    .line 14
    :cond_0
    iget-object v2, p1, Lcom/tencent/mm/opensdk/channel/a/a$a;->action:Ljava/lang/String;

    .line 17
    invoke-static {v2}, Lcom/tencent/mm/opensdk/utils/d;->b(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string p0, "send fail, action is null"

    .line 11
    :goto_0
    invoke-static {v1, p0}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v0

    .line 26
    :cond_1
    iget-object v0, p1, Lcom/tencent/mm/opensdk/channel/a/a$a;->a:Ljava/lang/String;

    .line 29
    invoke-static {v0}, Lcom/tencent/mm/opensdk/utils/d;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 37
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    iget-object v2, p1, Lcom/tencent/mm/opensdk/channel/a/a$a;->a:Ljava/lang/String;

    const-string v3, ".permission.MM_MESSAGE"

    .line 0
    invoke-static {v0, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    new-instance v2, Landroid/content/Intent;

    iget-object v3, p1, Lcom/tencent/mm/opensdk/channel/a/a$a;->action:Ljava/lang/String;

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v3, p1, Lcom/tencent/mm/opensdk/channel/a/a$a;->bundle:Landroid/os/Bundle;

    if-eqz v3, :cond_3

    invoke-virtual {v2, v3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "_mmessage_sdkVersion"

    const v5, 0x26082200

    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v4, "_mmessage_appPackage"

    invoke-virtual {v2, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v4, "_mmessage_content"

    iget-object v6, p1, Lcom/tencent/mm/opensdk/channel/a/a$a;->content:Ljava/lang/String;

    invoke-virtual {v2, v4, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v4, "_mmessage_support_content_type"

    iget-wide v6, p1, Lcom/tencent/mm/opensdk/channel/a/a$a;->b:J

    invoke-virtual {v2, v4, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    iget-object p1, p1, Lcom/tencent/mm/opensdk/channel/a/a$a;->content:Ljava/lang/String;

    invoke-static {p1, v5, v3}, Lcom/tencent/mm/opensdk/channel/a/b;->a(Ljava/lang/String;ILjava/lang/String;)[B

    move-result-object p1

    const-string v3, "_mmessage_checksum"

    invoke-virtual {v2, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    invoke-virtual {p0, v2, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "send mm message, intent="

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", perm="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/tencent/mm/opensdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method
