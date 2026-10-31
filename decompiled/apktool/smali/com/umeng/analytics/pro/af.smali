.class public Lcom/umeng/analytics/pro/af;
.super Ljava/lang/Object;
.source "RAPL"

# interfaces
.implements Lcom/umeng/analytics/pro/z;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    if-nez p1, :cond_0

    goto :goto_0

    .line 17
    :cond_0
    invoke-static {}, Ll/۠ܳ֨;->֫()Z

    move-result v0

    .line 18
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "isSupported"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const-string v1, "getOAID"

    invoke-static {v1, v2}, Lcom/umeng/analytics/pro/al;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez v0, :cond_1

    :goto_0
    const/4 p1, 0x0

    return-object p1

    .line 23
    :cond_1
    invoke-static {p1}, Ll/۠ܳ֨;->֫(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
