.class public final Ll/ᩴ᩹;
.super Ll/֨ۙ;
.source "U5Z7"


# direct methods
.method public static ֫(Landroid/app/Activity;[Ljava/lang/String;I)V
    .locals 6

    .line 512
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 513
    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_2

    .line 514
    aget-object v3, p1, v2

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 519
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x21

    if-ge v3, v4, :cond_0

    .line 520
    aget-object v3, p1, v2

    const-string v4, "android.permission.POST_NOTIFICATIONS"

    invoke-static {v3, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 521
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 515
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Permission request for permissions "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 516
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, " must not contain null or empty values"

    .line 0
    invoke-static {p2, p1, v0}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 516
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 526
    :cond_2
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v2

    if-lez v2, :cond_3

    .line 528
    array-length v3, p1

    sub-int/2addr v3, v2

    new-array v3, v3, [Ljava/lang/String;

    goto :goto_1

    :cond_3
    move-object v3, p1

    :goto_1
    if-lez v2, :cond_6

    .line 530
    array-length v4, p1

    if-ne v2, v4, :cond_4

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    .line 533
    :goto_2
    array-length v4, p1

    if-ge v1, v4, :cond_6

    .line 534
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    add-int/lit8 v4, v2, 0x1

    .line 535
    aget-object v5, p1, v1

    aput-object v5, v3, v2

    move v2, v4

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 540
    :cond_6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_8

    .line 541
    instance-of v0, p0, Ll/ۘ᩹;

    if-eqz v0, :cond_7

    .line 542
    move-object v0, p0

    check-cast v0, Ll/ۘ᩹;

    .line 545
    :cond_7
    invoke-static {p0, p1, p2}, Ll/ۢ᩹;->֫(Landroid/app/Activity;[Ljava/lang/String;I)V

    return-void

    .line 546
    :cond_8
    instance-of p1, p0, Ll/ۖ᩹;

    if-eqz p1, :cond_9

    .line 547
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 548
    new-instance v0, Ll/᩷᩹;

    invoke-direct {v0, p0, v3, p2}, Ll/᩷᩹;-><init>(Landroid/app/Activity;[Ljava/lang/String;I)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_9
    :goto_3
    return-void
.end method

.method public static ֫(Landroid/app/Activity;Ljava/lang/String;)Z
    .locals 2

    .line 581
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-ge v0, v1, :cond_0

    const-string v1, "android.permission.POST_NOTIFICATIONS"

    .line 582
    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x20

    if-lt v0, v1, :cond_1

    .line 587
    invoke-static {p0, p1}, Ll/ܺ᩹;->֫(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result p0

    return p0

    :cond_1
    const/16 v1, 0x1f

    if-ne v0, v1, :cond_2

    .line 589
    invoke-static {p0, p1}, Ll/ۡ᩹;->֫(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result p0

    return p0

    :cond_2
    const/16 v1, 0x17

    if-lt v0, v1, :cond_3

    .line 591
    invoke-static {p0, p1}, Ll/ۢ᩹;->֫(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result p0

    return p0

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return p0
.end method
