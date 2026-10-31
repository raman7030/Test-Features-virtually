.class public final Ll/ۛۚ֫;
.super Ljava/lang/Object;
.source "J8TX"


# direct methods
.method public static ֫(Landroid/content/Context;Ll/ۧ֨֫;)V
    .locals 2

    :try_start_0
    const-string v0, "phone"

    .line 267
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/telephony/TelephonyManager;

    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    new-instance v0, Ll/ۤۚ֫;

    invoke-direct {v0, p1}, Ll/ۤۚ֫;-><init>(Ll/ۧ֨֫;)V

    .line 269
    invoke-static {p1}, Ll/ۧ֨֫;->֫(Ll/ۧ֨֫;)Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Landroid/telephony/TelephonyManager;->registerTelephonyCallback(Ljava/util/concurrent/Executor;Landroid/telephony/TelephonyCallback;)V

    .line 272
    invoke-virtual {p0, v0}, Landroid/telephony/TelephonyManager;->unregisterTelephonyCallback(Landroid/telephony/TelephonyCallback;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p0, 0x5

    .line 275
    invoke-static {p1, p0}, Ll/ۧ֨֫;->֫(Ll/ۧ֨֫;I)V

    return-void
.end method
