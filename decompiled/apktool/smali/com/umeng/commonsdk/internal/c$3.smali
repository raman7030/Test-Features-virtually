.class public final Lcom/umeng/commonsdk/internal/c$3;
.super Ljava/lang/Object;
.source "1474"

# interfaces
.implements Lcom/umeng/commonsdk/listener/OnGetOaidListener;


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 291
    iput-object p1, p0, Lcom/umeng/commonsdk/internal/c$3;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGetOaid(Ljava/lang/String;)V
    .locals 4

    const-string v0, "key_umeng_sp_oaid"

    .line 294
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 298
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/c$3;->a:Landroid/content/Context;

    const-string v2, "umeng_sp_oaid"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v2, ""

    .line 301
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 302
    invoke-virtual {v2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "MobclickRT"

    const-string v3, "--->>> \u66f4\u65b0\u672c\u5730\u7f13\u5b58OAID"

    .line 303
    invoke-static {v2, v3}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 305
    invoke-interface {v1, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 306
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method
