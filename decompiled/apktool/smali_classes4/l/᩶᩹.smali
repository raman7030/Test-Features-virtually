.class public final Ll/᩶᩹;
.super Ljava/lang/Object;
.source "X4NC"


# direct methods
.method public static ֫(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .line 170
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 171
    const-class v0, Landroid/app/AppOpsManager;

    invoke-static {p0, v0}, Ll/᩸᩹;->֫(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/AppOpsManager;

    .line 172
    invoke-static {p0, p1, p2}, Ll/᩸᩹;->ۧ(Landroid/app/AppOpsManager;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)I
    .locals 2

    .line 193
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 194
    invoke-static {p0}, Ll/᩹᩹;->ۧ(Landroid/content/Context;)Landroid/app/AppOpsManager;

    move-result-object v0

    .line 196
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    .line 197
    invoke-static {v0, p1, v1, p2}, Ll/᩹᩹;->֫(Landroid/app/AppOpsManager;Ljava/lang/String;ILjava/lang/String;)I

    move-result p2

    if-eqz p2, :cond_0

    return p2

    .line 204
    :cond_0
    invoke-static {p0}, Ll/᩹᩹;->֫(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    .line 205
    invoke-static {v0, p1, p3, p0}, Ll/᩹᩹;->֫(Landroid/app/AppOpsManager;Ljava/lang/String;ILjava/lang/String;)I

    move-result p0

    return p0

    .line 208
    :cond_1
    invoke-static {p0, p1, p2}, Ll/᩶᩹;->֫(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 78
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 79
    invoke-static {p0}, Ll/᩸᩹;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
