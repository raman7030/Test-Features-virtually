.class public Lcom/alipay/sdk/m/o0/b;
.super Ljava/lang/Object;
.source "N673"


# static fields
.field public static final a:Ljava/lang/String; = "IdentifierManager"

.field public static b:Ljava/lang/Object;

.field public static c:Ljava/lang/Class;

.field public static d:Ljava/lang/reflect/Method;

.field public static e:Ljava/lang/reflect/Method;

.field public static f:Ljava/lang/reflect/Method;

.field public static g:Ljava/lang/reflect/Method;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 1
    const-class v0, Landroid/content/Context;

    :try_start_0
    const-string v1, "com.android.id.impl.IdProviderImpl"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Lcom/alipay/sdk/m/o0/b;->c:Ljava/lang/Class;

    .line 2
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    sput-object v1, Lcom/alipay/sdk/m/o0/b;->b:Ljava/lang/Object;

    .line 3
    sget-object v1, Lcom/alipay/sdk/m/o0/b;->c:Ljava/lang/Class;

    const-string v2, "getUDID"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    sput-object v1, Lcom/alipay/sdk/m/o0/b;->d:Ljava/lang/reflect/Method;

    .line 4
    sget-object v1, Lcom/alipay/sdk/m/o0/b;->c:Ljava/lang/Class;

    const-string v2, "getOAID"

    new-array v4, v3, [Ljava/lang/Class;

    aput-object v0, v4, v5

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    sput-object v1, Lcom/alipay/sdk/m/o0/b;->e:Ljava/lang/reflect/Method;

    .line 5
    sget-object v1, Lcom/alipay/sdk/m/o0/b;->c:Ljava/lang/Class;

    const-string v2, "getVAID"

    new-array v4, v3, [Ljava/lang/Class;

    aput-object v0, v4, v5

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    sput-object v1, Lcom/alipay/sdk/m/o0/b;->f:Ljava/lang/reflect/Method;

    .line 6
    sget-object v1, Lcom/alipay/sdk/m/o0/b;->c:Ljava/lang/Class;

    const-string v2, "getAAID"

    new-array v3, v3, [Ljava/lang/Class;

    aput-object v0, v3, v5

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lcom/alipay/sdk/m/o0/b;->g:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 2
    sget-object v0, Lcom/alipay/sdk/m/o0/b;->g:Ljava/lang/reflect/Method;

    invoke-static {p0, v0}, Lcom/alipay/sdk/m/o0/b;->a(Landroid/content/Context;Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 3

    .line 3
    sget-object v0, Lcom/alipay/sdk/m/o0/b;->b:Ljava/lang/Object;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    .line 5
    invoke-virtual {p1, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 7
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/alipay/sdk/m/o0/b;->c:Ljava/lang/Class;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/alipay/sdk/m/o0/b;->b:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/alipay/sdk/m/o0/b;->e:Ljava/lang/reflect/Method;

    invoke-static {p0, v0}, Lcom/alipay/sdk/m/o0/b;->a(Landroid/content/Context;Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/alipay/sdk/m/o0/b;->d:Ljava/lang/reflect/Method;

    invoke-static {p0, v0}, Lcom/alipay/sdk/m/o0/b;->a(Landroid/content/Context;Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/alipay/sdk/m/o0/b;->f:Ljava/lang/reflect/Method;

    invoke-static {p0, v0}, Lcom/alipay/sdk/m/o0/b;->a(Landroid/content/Context;Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
