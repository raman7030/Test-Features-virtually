.class public final Lcom/tencent/mm/opensdk/utils/c$a;
.super Ljava/lang/Object;


# direct methods
.method public static a(ILjava/lang/String;)Ljava/lang/Object;
    .locals 2

    const-string v0, "MicroMsg.SDK.PluginProvider.Resolver"

    packed-switch p0, :pswitch_data_0

    :try_start_0
    const-string p0, "unknown type"

    goto :goto_0

    .line 17
    :pswitch_0
    invoke-static {p1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    .line 22
    :pswitch_1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    .line 27
    :pswitch_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :pswitch_3
    return-object p1

    .line 33
    :pswitch_4
    invoke-static {p1}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    .line 38
    :pswitch_5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_1

    .line 11
    :goto_0
    invoke-static {v0, p0}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 42
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "resolveObj exception:"

    .line 48
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, p1, v0}, Ll/ۡܶ֫;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :goto_2
    const/4 p0, 0x0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
