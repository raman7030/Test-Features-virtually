.class public Lcom/alipay/sdk/m/c0/d$a;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/alipay/sdk/m/c0/d;


# direct methods
.method public constructor <init>(Lcom/alipay/sdk/m/c0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alipay/sdk/m/c0/d$a;->a:Lcom/alipay/sdk/m/c0/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alipay/sdk/m/c0/d$a;->a:Lcom/alipay/sdk/m/c0/d;

    iget-object v0, v0, Lcom/alipay/sdk/m/c0/c;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method
