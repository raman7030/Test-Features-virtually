.class public Lcom/alipay/sdk/m/y/k$b;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/alipay/sdk/app/APayEntranceActivity$a;

.field public final synthetic b:Lcom/alipay/sdk/m/y/k;


# direct methods
.method public constructor <init>(Lcom/alipay/sdk/m/y/k;Lcom/alipay/sdk/app/APayEntranceActivity$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alipay/sdk/m/y/k$b;->b:Lcom/alipay/sdk/m/y/k;

    iput-object p2, p0, Lcom/alipay/sdk/m/y/k$b;->a:Lcom/alipay/sdk/app/APayEntranceActivity$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alipay/sdk/m/y/k$b;->b:Lcom/alipay/sdk/m/y/k;

    invoke-static {v0}, Lcom/alipay/sdk/m/y/k;->a(Lcom/alipay/sdk/m/y/k;)Lcom/alipay/sdk/m/w/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/alipay/sdk/m/y/k$b;->b:Lcom/alipay/sdk/m/y/k;

    invoke-static {v0}, Lcom/alipay/sdk/m/y/k;->a(Lcom/alipay/sdk/m/y/k;)Lcom/alipay/sdk/m/w/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/alipay/sdk/m/w/a;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/alipay/sdk/m/y/k$b;->b:Lcom/alipay/sdk/m/y/k;

    invoke-static {v0}, Lcom/alipay/sdk/m/y/k;->a(Lcom/alipay/sdk/m/y/k;)Lcom/alipay/sdk/m/w/a;

    move-result-object v0

    const-string v1, "ErrActNotCreated"

    const-string v2, ""

    const-string v3, "biz"

    invoke-static {v0, v3, v1, v2}, Lcom/alipay/sdk/m/m/a;->b(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/alipay/sdk/m/o/b;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/alipay/sdk/m/y/k$b;->b:Lcom/alipay/sdk/m/y/k;

    invoke-static {v0}, Lcom/alipay/sdk/m/y/k;->a(Lcom/alipay/sdk/m/y/k;)Lcom/alipay/sdk/m/w/a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/alipay/sdk/m/w/a;->b(Z)V

    .line 7
    invoke-static {}, Lcom/alipay/sdk/m/l/b;->a()Ljava/lang/String;

    move-result-object v0

    .line 8
    iget-object v1, p0, Lcom/alipay/sdk/m/y/k$b;->a:Lcom/alipay/sdk/app/APayEntranceActivity$a;

    invoke-interface {v1, v0}, Lcom/alipay/sdk/app/APayEntranceActivity$a;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
