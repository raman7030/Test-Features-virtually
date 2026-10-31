.class public final Ll/᩸᩹;
.super Ljava/lang/Object;
.source "X4NC"


# direct methods
.method public static ֫(Landroid/app/AppOpsManager;Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 268
    invoke-virtual {p0, p1, p2}, Landroid/app/AppOpsManager;->noteProxyOp(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static ֫(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 263
    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 258
    invoke-static {p0}, Landroid/app/AppOpsManager;->permissionToOp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Landroid/app/AppOpsManager;Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 274
    invoke-virtual {p0, p1, p2}, Landroid/app/AppOpsManager;->noteProxyOpNoThrow(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method
