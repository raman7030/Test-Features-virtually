.class public Lcom/umeng/commonsdk/statistics/idtracking/h;
.super Lcom/umeng/commonsdk/statistics/idtracking/a;
.source "OBLD"


# static fields
.field public static final a:Ljava/lang/String; = "umeng_sp_oaid"

.field public static final b:Ljava/lang/String; = "key_umeng_sp_oaid"

.field public static final c:Ljava/lang/String; = "key_umeng_sp_oaid_required_time"

.field public static final d:Ljava/lang/String; = "oaid"


# instance fields
.field public e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "oaid"

    .line 21
    invoke-direct {p0, v0}, Lcom/umeng/commonsdk/statistics/idtracking/a;-><init>(Ljava/lang/String;)V

    .line 22
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/idtracking/h;->e:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public f()Ljava/lang/String;
    .locals 3

    const-string v0, "header_device_oaid"

    .line 28
    invoke-static {v0}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 30
    :try_start_0
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/h;->e:Landroid/content/Context;

    const-string v1, "umeng_sp_oaid"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "key_umeng_sp_oaid"

    const-string v2, ""

    .line 33
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
