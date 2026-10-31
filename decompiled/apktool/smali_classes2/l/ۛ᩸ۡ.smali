.class public final Ll/ۛ᩸ۡ;
.super Ljava/lang/Object;
.source "Z6W9"


# static fields
.field public static ֫:Z


# direct methods
.method public static ֫(Landroid/view/View;Ll/ۗܺ᩷;Ll/֡ۚۢ;)Ll/ۤ᩸ۡ;
    .locals 4

    const/4 v0, 0x1

    new-array v0, v0, [Z

    const/4 v1, 0x0

    aput-boolean v1, v0, v1

    .line 101
    new-instance v2, Ll/ۗ᩸ۡ;

    invoke-direct {v2, v0, p0, p1}, Ll/ۗ᩸ۡ;-><init>([ZLandroid/view/View;Ll/ۗܺ᩷;)V

    .line 110
    new-instance v0, Ll/֫۫᩻;

    const/4 v3, 0x4

    invoke-direct {v0, v3, p1}, Ll/֫۫᩻;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    new-instance p0, Ll/۬᩸ۡ;

    invoke-direct {p0, v2}, Ll/۬᩸ۡ;-><init>(Ll/ۗ᩸ۡ;)V

    .line 116
    invoke-virtual {p1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/۟ۢ֫;->֫(Ll/ܳۡ֫;)V

    .line 117
    invoke-virtual {p1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    sget-object v3, Ll/ܰۢ֫;->ۗ:Ll/ܰۢ֫;

    invoke-virtual {v0, v3}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 118
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2, v0}, Ll/ۗ᩸ۡ;->accept(Ljava/lang/Object;)V

    .line 120
    :cond_0
    invoke-virtual {p2}, Ll/֡ۚۢ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p2

    new-instance v0, Ll/۫᩸ۡ;

    invoke-direct {v0, p1, p0}, Ll/۫᩸ۡ;-><init>(Ll/ۗܺ᩷;Ll/۬᩸ۡ;)V

    invoke-virtual {p2, v0}, Ll/۟ۢ֫;->֫(Ll/ܳۡ֫;)V

    .line 125
    new-instance p0, Ll/ۤ᩸ۡ;

    invoke-direct {p0, v1, v2}, Ll/ۤ᩸ۡ;-><init>(ILjava/lang/Object;)V

    return-object p0
.end method

.method public static ֫()Z
    .locals 2

    .line 45
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x25

    if-ne v0, v1, :cond_0

    const-string v0, "Xiaomi"

    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static ֫(Landroid/content/Context;Z)Z
    .locals 5

    const-string v0, "android.permission.ACCESS_LOCAL_NETWORK"

    const/4 v1, 0x0

    if-nez p1, :cond_0

    .line 50
    sget-boolean p1, Ll/ۛ᩸ۡ;->֫:Z

    if-nez p1, :cond_7

    :cond_0
    invoke-static {}, Ll/ۛ᩸ۡ;->֫()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_3

    .line 54
    :cond_1
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result p1

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-ne p1, v2, :cond_2

    goto :goto_2

    .line 58
    :cond_2
    invoke-static {v0}, Landroid/app/AppOpsManager;->permissionToOp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "appops"

    .line 59
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/AppOpsManager;

    if-eqz v0, :cond_4

    if-nez v2, :cond_3

    goto :goto_0

    .line 61
    :cond_3
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v4

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, v0, v4, p0}, Landroid/app/AppOpsManager;->checkOpNoThrow(Ljava/lang/String;ILjava/lang/String;)I

    move-result p0

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p0, 0x3

    :goto_1
    if-eq p0, v3, :cond_6

    const/4 v0, 0x2

    if-ne p0, v0, :cond_5

    goto :goto_2

    :cond_5
    if-nez p1, :cond_7

    if-nez p0, :cond_7

    .line 66
    sput-boolean v3, Ll/ۛ᩸ۡ;->֫:Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :cond_6
    :goto_2
    return v3

    :catch_0
    :cond_7
    :goto_3
    return v1
.end method

.method public static ֫(Ll/ۗܺ᩷;)Z
    .locals 2

    const/4 v0, 0x0

    .line 84
    invoke-static {p0, v0}, Ll/ۛ᩸ۡ;->֫(Landroid/content/Context;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p0, 0x1

    return p0

    .line 87
    :cond_0
    invoke-static {p0}, Ll/ۛ᩸ۡ;->ۧ(Ll/ۗܺ᩷;)V

    return v0
.end method

.method public static ֫(Ll/ۗܺ᩷;Ll/ۗ᩻᩻;)Z
    .locals 5

    .line 76
    sget-boolean v0, Ll/ۛ᩸ۡ;->֫:Z

    const/4 v1, 0x1

    if-nez v0, :cond_e

    invoke-static {}, Ll/ۛ᩸ۡ;->֫()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 144
    instance-of v0, p1, Ll/֫ܺ᩻;

    if-eqz v0, :cond_0

    check-cast p1, Ll/֫ܺ᩻;

    .line 145
    iget-object p1, p1, Ll/֫ܺ᩻;->ۧ֫:Ljava/lang/String;

    goto :goto_0

    .line 146
    :cond_0
    instance-of v0, p1, Ll/ۜܺ᩻;

    if-eqz v0, :cond_1

    check-cast p1, Ll/ۜܺ᩻;

    .line 147
    iget-object p1, p1, Ll/ۜܺ᩻;->ܽ֫:Ljava/lang/String;

    goto :goto_0

    .line 148
    :cond_1
    instance-of v0, p1, Ll/᩻֡᩻;

    if-eqz v0, :cond_2

    check-cast p1, Ll/᩻֡᩻;

    .line 149
    iget-object p1, p1, Ll/᩻֡᩻;->ۧ֫:Ljava/lang/String;

    goto :goto_0

    .line 150
    :cond_2
    instance-of v0, p1, Ll/ܳᩴ᩻;

    if-eqz v0, :cond_4

    check-cast p1, Ll/ܳᩴ᩻;

    .line 152
    :try_start_0
    iget v0, p1, Ll/ܳᩴ᩻;->ᩳ֫:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_3

    iget-object p1, p1, Ll/ܳᩴ᩻;->ۧ֫:Ljava/lang/String;

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Ll/ܳᩴ᩻;->ۢ()Ll/ۖۘ᩻;

    move-result-object p1

    iget-object p1, p1, Ll/ۖۘ᩻;->֫֫:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 156
    :cond_4
    instance-of v0, p1, Ll/ۖۘ᩻;

    if-eqz v0, :cond_5

    check-cast p1, Ll/ۖۘ᩻;

    .line 157
    iget-object p1, p1, Ll/ۖۘ᩻;->֫֫:Ljava/lang/String;

    goto :goto_0

    .line 158
    :cond_5
    instance-of v0, p1, Ll/ۚۚ᩻;

    if-eqz v0, :cond_6

    check-cast p1, Ll/ۚۚ᩻;

    .line 159
    iget-object p1, p1, Ll/ۚۚ᩻;->ᩳ֫:Ljava/lang/String;

    invoke-static {p1}, Ll/ۗۢ᩻;->ܺ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 160
    :cond_6
    instance-of v0, p1, Ll/۬ۖ᩻;

    if-eqz v0, :cond_e

    check-cast p1, Ll/۬ۖ᩻;

    .line 161
    iget-object p1, p1, Ll/۬ۖ᩻;->ᩳ֫:Ljava/lang/String;

    invoke-static {p1}, Ll/ۗۢ᩻;->ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_7

    goto/16 :goto_2

    .line 173
    :cond_7
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "."

    .line 174
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_8

    .line 0
    invoke-static {v1, v2, p1}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_8
    const-string v0, ".local"

    .line 177
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    const/16 v3, 0x3a

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v4, 0x6

    if-le v0, v4, :cond_9

    const/16 v0, 0x2f

    .line 178
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_9

    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_9

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_9

    goto :goto_1

    :cond_9
    const-string v0, "["

    .line 181
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    const-string v0, "]"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 0
    invoke-static {v1, v1, p1}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_a
    const/16 v0, 0x25

    .line 185
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-ltz v0, :cond_b

    .line 186
    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-ltz v3, :cond_b

    .line 187
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 190
    :cond_b
    :try_start_1
    invoke-static {p1}, Ll/᩹᩺ܺ;->֫(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object p1

    .line 191
    invoke-virtual {p1}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v0

    if-nez v0, :cond_e

    invoke-virtual {p1}, Ljava/net/InetAddress;->isAnyLocalAddress()Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_2

    .line 194
    :cond_c
    invoke-virtual {p1}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v0

    .line 195
    invoke-virtual {p1}, Ljava/net/InetAddress;->isSiteLocalAddress()Z

    move-result v3

    if-nez v3, :cond_d

    invoke-virtual {p1}, Ljava/net/InetAddress;->isLinkLocalAddress()Z

    move-result p1

    if-nez p1, :cond_d

    array-length p1, v0

    const/16 v3, 0x10

    if-ne p1, v3, :cond_e

    aget-byte p1, v0, v2
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    and-int/lit16 p1, p1, 0xfe

    const/16 v0, 0xfc

    if-ne p1, v0, :cond_e

    .line 79
    :cond_d
    :goto_1
    invoke-static {p0}, Ll/ۛ᩸ۡ;->֫(Ll/ۗܺ᩷;)Z

    move-result p0

    return p0

    :catch_0
    :cond_e
    :goto_2
    return v1
.end method

.method public static ۧ(Ll/ۗܺ᩷;)V
    .locals 3

    .line 133
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f120491

    .line 134
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    const v1, 0x7f12052d

    .line 135
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(I)V

    new-instance v1, Ll/ۧۤ᩷;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p0}, Ll/ۧۤ᩷;-><init>(ILjava/lang/Object;)V

    const p0, 0x7f12081a

    .line 136
    invoke-virtual {v0, p0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12015e

    const/4 v1, 0x0

    .line 138
    invoke-virtual {v0, p0, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 139
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public static ܽ(Ll/ۗܺ᩷;)V
    .locals 1

    .line 93
    sget-boolean v0, Ll/ۛ᩸ۡ;->֫:Z

    if-nez v0, :cond_0

    invoke-static {}, Ll/ۛ᩸ۡ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 129
    invoke-static {}, Ll/۬ۘۢ;->ۧ()Ljava/net/Inet4Address;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 93
    invoke-static {p0, v0}, Ll/ۛ᩸ۡ;->֫(Landroid/content/Context;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    invoke-static {p0}, Ll/ۛ᩸ۡ;->ۧ(Ll/ۗܺ᩷;)V

    :cond_0
    return-void
.end method
