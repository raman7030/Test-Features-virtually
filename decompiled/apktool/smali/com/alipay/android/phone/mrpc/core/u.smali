.class public abstract Lcom/alipay/android/phone/mrpc/core/u;
.super Ljava/lang/Object;
.source "N673"


# instance fields
.field public a:Lcom/alipay/android/phone/mrpc/core/ae;

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/alipay/android/phone/mrpc/core/u;->b:Z

    return-void
.end method


# virtual methods
.method public f()Lcom/alipay/android/phone/mrpc/core/ae;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/alipay/android/phone/mrpc/core/u;->a:Lcom/alipay/android/phone/mrpc/core/ae;

    return-object v0
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Lcom/alipay/android/phone/mrpc/core/u;->b:Z

    return-void
.end method

.method public h()Z
    .locals 1

    .line 0
    iget-boolean v0, p0, Lcom/alipay/android/phone/mrpc/core/u;->b:Z

    return v0
.end method
