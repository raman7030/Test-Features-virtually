.class public Ll/֨ۙ;
.super Ljava/lang/Object;
.source "J4M5"


# direct methods
.method public static ֫(Landroid/content/Context;I)I
    .locals 2

    .line 528
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 529
    invoke-static {p0, p1}, Ll/ᩴۙ;->֫(Landroid/content/Context;I)I

    move-result p0

    return p0

    .line 531
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p0

    return p0
.end method

.method public static ֫(Landroid/content/Context;Ljava/lang/String;)I
    .locals 2

    if-eqz p1, :cond_2

    .line 546
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-ge v0, v1, :cond_1

    const-string v0, "android.permission.POST_NOTIFICATIONS"

    .line 547
    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 548
    invoke-static {p0}, Ll/۫᩶;->֫(Landroid/content/Context;)Ll/۫᩶;

    move-result-object p0

    invoke-virtual {p0}, Ll/۫᩶;->֫()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0

    .line 552
    :cond_1
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result p0

    return p0

    .line 147
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "permission must be non-null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2

    .line 743
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 744
    invoke-static {p0, p1}, Ll/ᩴۙ;->֫(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    if-lt v0, v1, :cond_1

    .line 845
    invoke-static {p0, p1}, Ll/ᩴۙ;->ۧ(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 847
    :cond_1
    sget-object v0, Ll/ۚۙ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    :goto_0
    if-eqz p1, :cond_2

    .line 748
    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Landroid/content/Context;)Ljava/util/concurrent/Executor;
    .locals 2

    .line 683
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 684
    invoke-static {p0}, Ll/֡ۙ;->֫(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object p0

    return-object p0

    .line 686
    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-static {v0}, Ll/ۡ۫;->֫(Landroid/os/Handler;)Ljava/util/concurrent/Executor;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 699
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 700
    invoke-static {p0, p1}, Ll/᩵ۙ;->֫(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void

    .line 703
    :cond_0
    invoke-virtual {p0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method public static ۧ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 1

    .line 508
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    invoke-static {v0, p1, p0}, Ll/ۙۗ;->ۧ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 485
    invoke-static {p0, p1}, Ll/ۘۙ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method
