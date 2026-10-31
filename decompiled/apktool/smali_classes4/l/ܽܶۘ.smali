.class public final Ll/ܽܶۘ;
.super Landroid/os/Handler;
.source "51RR"


# instance fields
.field public final synthetic ֫:Lcom/tencent/connect/common/AssistActivity;


# direct methods
.method public constructor <init>(Lcom/tencent/connect/common/AssistActivity;Landroid/os/Looper;)V
    .locals 0

    .line 66
    iput-object p1, p0, Ll/ܽܶۘ;->֫:Lcom/tencent/connect/common/AssistActivity;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 70
    iget p1, p1, Landroid/os/Message;->what:I

    if-nez p1, :cond_0

    .line 71
    iget-object p1, p0, Ll/ܽܶۘ;->֫:Lcom/tencent/connect/common/AssistActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 72
    invoke-static {p1}, Lcom/tencent/connect/common/AssistActivity;->֫(Lcom/tencent/connect/common/AssistActivity;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "-->finish by timeout"

    invoke-static {v0, v1}, Ll/ۡ᩸ۘ;->ܿ(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method
