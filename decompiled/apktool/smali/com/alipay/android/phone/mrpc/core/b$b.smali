.class public Lcom/alipay/android/phone/mrpc/core/b$b;
.super Ljava/lang/Object;
.source "N673"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I


# direct methods
.method public static synthetic a(Lcom/alipay/android/phone/mrpc/core/b$b;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lcom/alipay/android/phone/mrpc/core/b$b;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method private a()Z
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/alipay/android/phone/mrpc/core/b$b;->a:Ljava/lang/String;

    iget v1, p0, Lcom/alipay/android/phone/mrpc/core/b$b;->b:I

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    return v0
.end method

.method public static synthetic a(Lcom/alipay/android/phone/mrpc/core/b$b;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Lcom/alipay/android/phone/mrpc/core/b$b;->a()Z

    move-result p0

    return p0
.end method
