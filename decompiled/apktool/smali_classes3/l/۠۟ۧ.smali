.class public final Ll/۠۟ۧ;
.super Ljava/lang/Object;
.source "H6ZH"


# static fields
.field public static final synthetic ֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "*"

    .line 78
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    const-string v0, ""

    .line 79
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 82
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    return-void
.end method

.method public static ֫()Landroid/content/pm/PackageInfo;
    .locals 2

    .line 393
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 394
    invoke-static {}, Ll/ۨ۟ۧ;->֫()Landroid/content/pm/PackageInfo;

    move-result-object v0

    return-object v0

    .line 397
    :cond_0
    :try_start_0
    invoke-static {}, Ll/۠۟ۧ;->ۧ()Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static ۧ()Landroid/content/pm/PackageInfo;
    .locals 3

    const-string v0, "android.webkit.WebViewFactory"

    .line 413
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getLoadedPackageInfo"

    const/4 v2, 0x0

    .line 414
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 415
    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    return-object v0
.end method
