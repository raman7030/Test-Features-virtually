.class public Lcom/umeng/commonsdk/utils/b;
.super Ljava/lang/Object;
.source "TAJ0"


# static fields
.field public static a:Ljava/util/HashMap;

.field public static b:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 13
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/utils/b;->a:Ljava/util/HashMap;

    .line 14
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/utils/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/umeng/commonsdk/utils/b$1;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/umeng/commonsdk/utils/b;-><init>()V

    return-void
.end method

.method public static a()Lcom/umeng/commonsdk/utils/b;
    .locals 1

    .line 25
    invoke-static {}, Lcom/umeng/commonsdk/utils/b$a;->a()Lcom/umeng/commonsdk/utils/b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    .locals 5

    const-string v1, "--->>> pkg: "

    const-string v2, "--->>> pkg\uff1a "

    const-string v3, "--->>> pkg\uff1a "

    .line 30
    sget-object v0, Lcom/umeng/commonsdk/utils/b;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 31
    :try_start_0
    sget-object v4, Lcom/umeng/commonsdk/utils/b;->a:Ljava/util/HashMap;

    invoke-virtual {v4, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string p1, "MobclickRT"

    .line 32
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", pkgInfo\u7f13\u5b58\u547d\u4e2d\uff0c\u76f4\u63a5\u8fd4\u56de"

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p3}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    sget-object p1, Lcom/umeng/commonsdk/utils/b;->a:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/pm/PackageInfo;

    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    :try_start_1
    invoke-virtual {p1, p2, p3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    const-string p3, "MobclickRT"

    .line 38
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", \u83b7\u53d6pkgInfo\u5e76\u7f13\u5b58"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p3, v2}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    sget-object p3, Lcom/umeng/commonsdk/utils/b;->a:Ljava/util/HashMap;

    invoke-virtual {p3, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 43
    :catch_0
    :try_start_2
    sget-object p1, Lcom/umeng/commonsdk/utils/b;->a:Ljava/util/HashMap;

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "MobclickRT"

    .line 44
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\uff0c\u76ee\u6807\u5305\u672a\u5b89\u88c5\u3002"

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    move-object p1, p3

    .line 47
    :goto_0
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
