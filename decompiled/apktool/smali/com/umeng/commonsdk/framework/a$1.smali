.class public final Lcom/umeng/commonsdk/framework/a$1;
.super Landroid/content/BroadcastReceiver;
.source "747B"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 233
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 237
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 238
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 240
    invoke-static {p1}, Lcom/umeng/commonsdk/internal/b;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/b;

    move-result-object p2

    invoke-virtual {p2}, Lcom/umeng/commonsdk/internal/b;->a()Lcom/umeng/commonsdk/internal/c;

    move-result-object p2

    const/4 v0, 0x0

    const v1, 0x8023

    .line 239
    invoke-static {p1, v1, p2, v0}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
