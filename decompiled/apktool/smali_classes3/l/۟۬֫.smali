.class public final Ll/۟۬֫;
.super Ljava/lang/Object;
.source "H8RW"


# direct methods
.method public static ֫(Landroid/media/AudioManager;Ll/ۢ۫֫;)Z
    .locals 6

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez p1, :cond_0

    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    invoke-virtual {p0, v0}, Landroid/media/AudioManager;->getDevices(I)[Landroid/media/AudioDeviceInfo;

    move-result-object p0

    goto :goto_0

    :cond_0
    new-array p0, v2, [Landroid/media/AudioDeviceInfo;

    .line 555
    iget-object p1, p1, Ll/ۢ۫֫;->֫:Landroid/media/AudioDeviceInfo;

    aput-object p1, p0, v1

    .line 575
    :goto_0
    new-instance p1, Ll/۫۬ܺ;

    invoke-direct {p1}, Ll/۫۬ܺ;-><init>()V

    const/16 v3, 0x8

    .line 577
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v5, v0, [Ljava/lang/Integer;

    aput-object v3, v5, v1

    aput-object v4, v5, v2

    invoke-virtual {p1, v5}, Ll/۫۬ܺ;->֫([Ljava/lang/Object;)Ll/۫۬ܺ;

    .line 578
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1f

    if-lt v3, v4, :cond_1

    const/16 v4, 0x1a

    .line 580
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v5, 0x1b

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-array v0, v0, [Ljava/lang/Integer;

    aput-object v4, v0, v1

    aput-object v5, v0, v2

    .line 579
    invoke-virtual {p1, v0}, Ll/۫۬ܺ;->֫([Ljava/lang/Object;)Ll/۫۬ܺ;

    :cond_1
    const/16 v0, 0x21

    if-lt v3, v0, :cond_2

    const/16 v0, 0x1e

    .line 583
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/۫۬ܺ;->֫(Ljava/lang/Object;)Ll/۫۬ܺ;

    .line 585
    :cond_2
    invoke-virtual {p1}, Ll/۫۬ܺ;->֫()Ll/ۛ۬ܺ;

    move-result-object p1

    .line 557
    array-length v0, p0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v0, :cond_4

    aget-object v4, p0, v3

    .line 558
    invoke-virtual {v4}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p1, v4}, Ll/᩺ۗܺ;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    return v2

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    return v1
.end method
