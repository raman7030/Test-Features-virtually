.class public final Ll/᩹۫᩵;
.super Ljava/lang/Object;
.source "UAXR"


# static fields
.field public static volatile choreographer:Landroid/view/Choreographer;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 109
    :try_start_0
    new-instance v0, Ll/ܶ۫᩵;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v1}, Ll/᩹۫᩵;->֫(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ܶ۫᩵;-><init>(Landroid/os/Handler;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Throwable;)Ll/ۖ۠᩵;

    move-result-object v0

    .line 38
    :goto_0
    instance-of v1, v0, Ll/ۖ۠᩵;

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    .line 109
    :cond_0
    check-cast v0, Ll/᩸۫᩵;

    return-void
.end method

.method public static final ֫(Landroid/os/Looper;)Landroid/os/Handler;
    .locals 8

    .line 86
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 90
    const-class v5, Landroid/os/Looper;

    const-class v6, Landroid/os/Handler;

    if-lt v0, v1, :cond_1

    new-array v0, v3, [Ljava/lang/Class;

    aput-object v5, v0, v2

    const-string v1, "createAsync"

    .line 92
    invoke-virtual {v6, v1, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p0, v1, v2

    .line 93
    invoke-virtual {v0, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    check-cast p0, Landroid/os/Handler;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type android.os.Handler"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const/4 v0, 0x3

    :try_start_0
    new-array v1, v0, [Ljava/lang/Class;

    aput-object v5, v1, v2

    .line 98
    const-class v5, Landroid/os/Handler$Callback;

    aput-object v5, v1, v3

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v7, 0x2

    aput-object v5, v1, v7

    invoke-virtual {v6, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p0, v0, v2

    aput-object v4, v0, v3

    .line 104
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object p0, v0, v7

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/Handler;

    return-object p0

    .line 102
    :catch_0
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object v0
.end method
