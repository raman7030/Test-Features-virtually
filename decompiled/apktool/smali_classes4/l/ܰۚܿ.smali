.class public final Ll/ܰۚܿ;
.super Ll/᩹֨ܿ;
.source "LAQJ"


# instance fields
.field public ֫:Ljava/util/concurrent/CountDownLatch;

.field public ۧ:Landroid/content/Intent;


# virtual methods
.method public final send(Landroid/content/Intent;)V
    .locals 0

    .line 1263
    iput-object p1, p0, Ll/ܰۚܿ;->ۧ:Landroid/content/Intent;

    .line 1264
    iget-object p1, p0, Ll/ܰۚܿ;->֫:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method
