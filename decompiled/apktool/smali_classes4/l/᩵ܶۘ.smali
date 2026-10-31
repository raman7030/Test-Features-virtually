.class public final Ll/᩵ܶۘ;
.super Landroid/os/Handler;
.source "51RR"


# instance fields
.field public final synthetic ֫:Lcom/tencent/open/TDialog;

.field public ۧ:Ll/ᩴܶۘ;


# direct methods
.method public constructor <init>(Lcom/tencent/open/TDialog;Ll/ᩴܶۘ;Landroid/os/Looper;)V
    .locals 0

    .line 99
    iput-object p1, p0, Ll/᩵ܶۘ;->֫:Lcom/tencent/open/TDialog;

    .line 100
    invoke-direct {p0, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 101
    iput-object p2, p0, Ll/᩵ܶۘ;->ۧ:Ll/ᩴܶۘ;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "--handleMessage--msg.WHAT = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p1, Landroid/os/Message;->what:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "openSDK_LOG.TDialog"

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    iget v0, p1, Landroid/os/Message;->what:I

    iget-object v1, p0, Ll/᩵ܶۘ;->ۧ:Ll/ᩴܶۘ;

    const/4 v2, 0x1

    if-eq v0, v2, :cond_6

    const/4 v3, 0x2

    if-eq v0, v3, :cond_5

    const/4 v1, 0x3

    iget-object v3, p0, Ll/᩵ܶۘ;->֫:Lcom/tencent/open/TDialog;

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    goto/16 :goto_2

    .line 127
    :cond_0
    invoke-static {v3}, Lcom/tencent/open/TDialog;->֫(Lcom/tencent/open/TDialog;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {v3}, Lcom/tencent/open/TDialog;->֫(Lcom/tencent/open/TDialog;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 128
    invoke-static {v3}, Lcom/tencent/open/TDialog;->֫(Lcom/tencent/open/TDialog;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/tencent/open/TDialog;->֫(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    .line 119
    :cond_1
    invoke-static {v3}, Lcom/tencent/open/TDialog;->֫(Lcom/tencent/open/TDialog;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {v3}, Lcom/tencent/open/TDialog;->֫(Lcom/tencent/open/TDialog;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 120
    invoke-static {v3}, Lcom/tencent/open/TDialog;->֫(Lcom/tencent/open/TDialog;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    .line 520
    :try_start_0
    invoke-static {p1}, Ll/ᩳ᩹ۘ;->ᩳ(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v1, "type"

    .line 521
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    const-string v3, "msg"

    .line 523
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez v1, :cond_3

    .line 526
    sget-object v1, Lcom/tencent/open/TDialog;->᩺:Landroid/widget/Toast;

    const/4 v2, 0x0

    if-nez v1, :cond_2

    .line 527
    invoke-static {v0, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    sput-object p1, Lcom/tencent/open/TDialog;->᩺:Landroid/widget/Toast;

    goto :goto_0

    .line 530
    :cond_2
    invoke-virtual {v1}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 531
    sget-object v0, Lcom/tencent/open/TDialog;->᩺:Landroid/widget/Toast;

    invoke-virtual {v0, p1}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 532
    sget-object p1, Lcom/tencent/open/TDialog;->᩺:Landroid/widget/Toast;

    invoke-virtual {p1, v2}, Landroid/widget/Toast;->setDuration(I)V

    .line 534
    :goto_0
    sget-object p1, Lcom/tencent/open/TDialog;->᩺:Landroid/widget/Toast;

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_2

    :cond_3
    if-ne v1, v2, :cond_7

    .line 536
    sget-object v1, Lcom/tencent/open/TDialog;->᩺:Landroid/widget/Toast;

    if-nez v1, :cond_4

    .line 538
    invoke-static {v0, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    sput-object p1, Lcom/tencent/open/TDialog;->᩺:Landroid/widget/Toast;

    goto :goto_1

    .line 540
    :cond_4
    invoke-virtual {v1}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 541
    sget-object v0, Lcom/tencent/open/TDialog;->᩺:Landroid/widget/Toast;

    invoke-virtual {v0, p1}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 542
    sget-object p1, Lcom/tencent/open/TDialog;->᩺:Landroid/widget/Toast;

    invoke-virtual {p1, v2}, Landroid/widget/Toast;->setDuration(I)V

    .line 544
    :goto_1
    sget-object p1, Lcom/tencent/open/TDialog;->᩺:Landroid/widget/Toast;

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_2

    .line 113
    :cond_5
    invoke-virtual {v1}, Ll/ᩴܶۘ;->֫()V

    return-void

    .line 109
    :cond_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    .line 138
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    :try_start_1
    invoke-static {p1}, Ll/ᩳ᩹ۘ;->ᩳ(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 157
    invoke-virtual {v1, v0}, Ll/ᩴܶۘ;->֫(Lorg/json/JSONObject;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    .line 160
    :catch_0
    new-instance v0, Ll/᩵᩹ۘ;

    const/4 v2, -0x4

    const-string v3, "\u670d\u52a1\u5668\u8fd4\u56de\u6570\u636e\u683c\u5f0f\u6709\u8bef!"

    invoke-direct {v0, v2, v3, p1}, Ll/᩵᩹ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ll/ᩴܶۘ;->֫(Ll/᩵᩹ۘ;)V

    :catch_1
    :cond_7
    :goto_2
    return-void
.end method
