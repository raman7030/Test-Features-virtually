.class public Lcom/umeng/commonsdk/stateless/b$a;
.super Landroid/os/FileObserver;
.source "G47B"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 71
    invoke-direct {p0, p1}, Landroid/os/FileObserver;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onEvent(ILjava/lang/String;)V
    .locals 1

    const/16 v0, 0x8

    and-int/2addr p1, v0

    if-eq p1, v0, :cond_0

    return-void

    .line 80
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "--->>> envelope file created >>> "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "MobclickRT"

    invoke-static {p2, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x112

    .line 81
    invoke-static {p1}, Lcom/umeng/commonsdk/stateless/b;->a(I)V

    return-void
.end method
