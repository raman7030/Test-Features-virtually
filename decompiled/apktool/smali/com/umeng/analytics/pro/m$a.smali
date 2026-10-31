.class public Lcom/umeng/analytics/pro/m$a;
.super Ljava/lang/Object;
.source "UBMB"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/umeng/analytics/pro/m;


# direct methods
.method public constructor <init>(Lcom/umeng/analytics/pro/m;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/umeng/analytics/pro/m$a;->a:Lcom/umeng/analytics/pro/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 44
    iget-object v0, p0, Lcom/umeng/analytics/pro/m$a;->a:Lcom/umeng/analytics/pro/m;

    invoke-static {v0}, Lcom/umeng/analytics/pro/m;->a(Lcom/umeng/analytics/pro/m;)Z

    move-result v0

    const-string v1, "MobclickRT"

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/umeng/analytics/pro/m$a;->a:Lcom/umeng/analytics/pro/m;

    invoke-static {v0}, Lcom/umeng/analytics/pro/m;->b(Lcom/umeng/analytics/pro/m;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 45
    iget-object v0, p0, Lcom/umeng/analytics/pro/m$a;->a:Lcom/umeng/analytics/pro/m;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/umeng/analytics/pro/m;->a(Lcom/umeng/analytics/pro/m;Z)Z

    const-string v0, "--->>> went background."

    .line 46
    invoke-static {v1, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    :goto_0
    iget-object v0, p0, Lcom/umeng/analytics/pro/m$a;->a:Lcom/umeng/analytics/pro/m;

    invoke-static {v0}, Lcom/umeng/analytics/pro/m;->c(Lcom/umeng/analytics/pro/m;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 48
    iget-object v0, p0, Lcom/umeng/analytics/pro/m$a;->a:Lcom/umeng/analytics/pro/m;

    invoke-static {v0}, Lcom/umeng/analytics/pro/m;->c(Lcom/umeng/analytics/pro/m;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/umeng/analytics/pro/n;

    invoke-interface {v0}, Lcom/umeng/analytics/pro/n;->n()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    const-string v0, "--->>> still foreground."

    .line 51
    invoke-static {v1, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
