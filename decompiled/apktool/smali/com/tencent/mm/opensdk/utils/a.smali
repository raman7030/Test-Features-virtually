.class public final Lcom/tencent/mm/opensdk/utils/a;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/os/Bundle;Ljava/lang/String;)I
    .locals 2

    const/4 v0, -0x1

    if-nez p0, :cond_0

    return v0

    .line 7
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    .line 12
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "getIntExtra exception:"

    .line 17
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "MicroMsg.IntentUtil"

    .line 0
    invoke-static {p0, p1, v1}, Ll/ۡܶ֫;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    return v0
.end method

.method public static b(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 7
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 12
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "getStringExtra exception:"

    .line 17
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "MicroMsg.IntentUtil"

    .line 0
    invoke-static {p0, p1, v1}, Ll/ۡܶ֫;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    return-object v0
.end method
