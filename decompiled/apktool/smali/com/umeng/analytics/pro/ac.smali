.class public Lcom/umeng/analytics/pro/ac;
.super Ljava/lang/Object;
.source "ABL6"


# static fields
.field public static final a:Ljava/lang/String; = "ro.build.version.emui"

.field public static final b:Ljava/lang/String; = "hw_sc.build.platform.version"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/umeng/analytics/pro/z;
    .locals 3

    .line 18
    sget-object p0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Brand"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p0, v0, v1

    const-string v1, "Device"

    .line 19
    invoke-static {v1, v0}, Lcom/umeng/analytics/pro/al;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    const-string v0, "huawei"

    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_f

    const-string v0, "honor"

    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_f

    const-string v0, "\u534e\u4e3a"

    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v0, "xiaomi"

    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_e

    const-string v0, "redmi"

    .line 28
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_e

    const-string v0, "meitu"

    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_e

    const-string v0, "\u5c0f\u7c73"

    .line 30
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_e

    const-string v0, "blackshark"

    .line 31
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v0, "vivo"

    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 34
    new-instance p0, Lcom/umeng/analytics/pro/aj;

    invoke-direct {p0}, Lcom/umeng/analytics/pro/aj;-><init>()V

    return-object p0

    :cond_3
    const-string v0, "oppo"

    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_d

    const-string v0, "oneplus"

    .line 36
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_d

    const-string v0, "realme"

    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    const-string v0, "lenovo"

    .line 39
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_c

    const-string v0, "zuk"

    .line 40
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_1

    :cond_5
    const-string v0, "nubia"

    .line 42
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 43
    new-instance p0, Lcom/umeng/analytics/pro/ag;

    invoke-direct {p0}, Lcom/umeng/analytics/pro/ag;-><init>()V

    return-object p0

    .line 44
    :cond_6
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v2, "SAMSUNG"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 45
    new-instance p0, Lcom/umeng/analytics/pro/ai;

    invoke-direct {p0}, Lcom/umeng/analytics/pro/ai;-><init>()V

    return-object p0

    .line 46
    :cond_7
    invoke-static {}, Lcom/umeng/analytics/pro/ac;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 47
    new-instance p0, Lcom/umeng/analytics/pro/ab;

    invoke-direct {p0}, Lcom/umeng/analytics/pro/ab;-><init>()V

    return-object p0

    .line 48
    :cond_8
    invoke-static {}, Lcom/umeng/analytics/pro/ac;->a()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 49
    new-instance p0, Lcom/umeng/analytics/pro/ad;

    invoke-direct {p0}, Lcom/umeng/analytics/pro/ad;-><init>()V

    return-object p0

    :cond_9
    const-string v0, "meizu"

    .line 50
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "mblu"

    .line 51
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_a

    goto :goto_0

    :cond_a
    return-object v1

    .line 52
    :cond_b
    :goto_0
    new-instance p0, Lcom/umeng/analytics/pro/af;

    invoke-direct {p0}, Lcom/umeng/analytics/pro/af;-><init>()V

    return-object p0

    .line 41
    :cond_c
    :goto_1
    new-instance p0, Lcom/umeng/analytics/pro/ae;

    invoke-direct {p0}, Lcom/umeng/analytics/pro/ae;-><init>()V

    return-object p0

    .line 38
    :cond_d
    :goto_2
    new-instance p0, Lcom/umeng/analytics/pro/ah;

    invoke-direct {p0}, Lcom/umeng/analytics/pro/ah;-><init>()V

    return-object p0

    .line 32
    :cond_e
    :goto_3
    new-instance p0, Lcom/umeng/analytics/pro/ak;

    invoke-direct {p0}, Lcom/umeng/analytics/pro/ak;-><init>()V

    return-object p0

    .line 26
    :cond_f
    :goto_4
    new-instance p0, Lcom/umeng/analytics/pro/ad;

    invoke-direct {p0}, Lcom/umeng/analytics/pro/ad;-><init>()V

    return-object p0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    :try_start_0
    const-string v0, "android.os.SystemProperties"

    .line 79
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "get"

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Class;

    .line 80
    const-class v4, Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    aput-object p0, v1, v5

    const/4 p0, 0x0

    .line 81
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    const-string p0, ""

    return-object p0
.end method

.method public static a()Z
    .locals 2

    const-string v0, "ro.build.version.emui"

    .line 58
    invoke-static {v0}, Lcom/umeng/analytics/pro/ac;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "hw_sc.build.platform.version"

    .line 59
    invoke-static {v1}, Lcom/umeng/analytics/pro/ac;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 61
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public static b()Z
    .locals 1

    const-string v0, "ro.coolos.version"

    .line 68
    invoke-static {v0}, Lcom/umeng/analytics/pro/ac;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 69
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
