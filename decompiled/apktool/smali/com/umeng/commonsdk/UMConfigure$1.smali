.class public final Lcom/umeng/commonsdk/UMConfigure$1;
.super Ljava/lang/Thread;
.source "UMConfigure.java"


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 481
    iput-object p1, p0, Lcom/umeng/commonsdk/UMConfigure$1;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 485
    :try_start_0
    invoke-static {}, Landroid/os/Looper;->prepare()V

    .line 486
    iget-object v0, p0, Lcom/umeng/commonsdk/UMConfigure$1;->a:Landroid/content/Context;

    const-string v1, "SDK \u521d\u59cb\u5316\u5931\u8d25\uff0c\u8bf7\u68c0\u67e5\u662f\u5426\u96c6\u6210umeng-asms-1.2.X.aar\u5e93\u3002"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 488
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 489
    invoke-static {}, Landroid/os/Looper;->loop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method
