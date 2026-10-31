.class public Lcom/umeng/commonsdk/internal/c$4;
.super Ljava/lang/Object;
.source "1474"

# interfaces
.implements Lcom/umeng/commonsdk/listener/OnGetOaidListener;


# instance fields
.field public final synthetic a:Lcom/umeng/commonsdk/internal/c;


# direct methods
.method public constructor <init>(Lcom/umeng/commonsdk/internal/c;)V
    .locals 0

    .line 327
    iput-object p1, p0, Lcom/umeng/commonsdk/internal/c$4;->a:Lcom/umeng/commonsdk/internal/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGetOaid(Ljava/lang/String;)V
    .locals 3

    const-string v0, "--->>> OAID\u4e91\u63a7\u53c2\u6570\u66f4\u65b0(\u4e0d\u91c7\u96c6->\u91c7\u96c6)\uff1a\u91c7\u96c6\u5b8c\u6210"

    const-string v1, "MobclickRT"

    .line 331
    invoke-static {v1, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "--->>> oaid\u8fd4\u56denull\u6216\u8005\u7a7a\u4e32\uff0c\u4e0d\u9700\u8981 \u4f2a\u51b7\u542f\u52a8\u3002"

    .line 333
    invoke-static {v1, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 337
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c$4;->a:Lcom/umeng/commonsdk/internal/c;

    invoke-static {v0}, Lcom/umeng/commonsdk/internal/c;->a(Lcom/umeng/commonsdk/internal/c;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "umeng_sp_oaid"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 340
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "key_umeng_sp_oaid"

    .line 341
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 342
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 347
    :catchall_0
    :cond_1
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c$4;->a:Lcom/umeng/commonsdk/internal/c;

    invoke-static {p1}, Lcom/umeng/commonsdk/internal/c;->a(Lcom/umeng/commonsdk/internal/c;)Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c$4;->a:Lcom/umeng/commonsdk/internal/c;

    .line 348
    invoke-static {v0}, Lcom/umeng/commonsdk/internal/c;->a(Lcom/umeng/commonsdk/internal/c;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/umeng/commonsdk/internal/b;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/umeng/commonsdk/internal/b;->a()Lcom/umeng/commonsdk/internal/c;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x8014

    .line 347
    invoke-static {p1, v2, v0, v1}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    return-void
.end method
