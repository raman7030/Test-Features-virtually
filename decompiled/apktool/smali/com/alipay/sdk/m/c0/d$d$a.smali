.class public Lcom/alipay/sdk/m/c0/d$d$a;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/alipay/sdk/m/c0/d$d;


# direct methods
.method public constructor <init>(Lcom/alipay/sdk/m/c0/d$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alipay/sdk/m/c0/d$d$a;->a:Lcom/alipay/sdk/m/c0/d$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/alipay/sdk/m/c0/d$d$a;->a:Lcom/alipay/sdk/m/c0/d$d;

    iget-object p1, p1, Lcom/alipay/sdk/m/c0/d$d;->b:Landroid/webkit/SslErrorHandler;

    invoke-virtual {p1}, Landroid/webkit/SslErrorHandler;->cancel()V

    .line 2
    iget-object p1, p0, Lcom/alipay/sdk/m/c0/d$d$a;->a:Lcom/alipay/sdk/m/c0/d$d;

    iget-object p1, p1, Lcom/alipay/sdk/m/c0/d$d;->c:Lcom/alipay/sdk/m/c0/d;

    invoke-static {p1}, Lcom/alipay/sdk/m/c0/d;->b(Lcom/alipay/sdk/m/c0/d;)Lcom/alipay/sdk/m/w/a;

    move-result-object p1

    const-string p2, "SSLDenied"

    const-string v0, "2"

    const-string v1, "net"

    invoke-static {p1, v1, p2, v0}, Lcom/alipay/sdk/m/m/a;->b(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lcom/alipay/sdk/m/l/b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/alipay/sdk/m/l/b;->a(Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/alipay/sdk/m/c0/d$d$a;->a:Lcom/alipay/sdk/m/c0/d$d;

    iget-object p1, p1, Lcom/alipay/sdk/m/c0/d$d;->a:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
