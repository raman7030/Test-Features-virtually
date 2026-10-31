.class public final Ll/ۘ۠ۘ;
.super Ll/֡۠ۘ;
.source "51RR"


# instance fields
.field public final synthetic ۙ:Ll/ۚ۠ۘ;

.field public final synthetic ᩶:Lorg/json/JSONObject;

.field public final synthetic ᩹:Ll/ۘ᩹ۘ;


# direct methods
.method public constructor <init>(Ll/ۚ۠ۘ;Landroid/app/Dialog;Ll/ۘ᩹ۘ;Lorg/json/JSONObject;)V
    .locals 0

    .line 682
    iput-object p1, p0, Ll/ۘ۠ۘ;->ۙ:Ll/ۚ۠ۘ;

    iput-object p3, p0, Ll/ۘ۠ۘ;->᩹:Ll/ۘ᩹ۘ;

    iput-object p4, p0, Ll/ۘ۠ۘ;->᩶:Lorg/json/JSONObject;

    invoke-direct {p0, p2}, Ll/֡۠ۘ;-><init>(Landroid/app/Dialog;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 686
    iget-object p1, p0, Ll/ۘ۠ۘ;->ۙ:Ll/ۚ۠ۘ;

    .line 918
    iget-object p1, p1, Ll/ۚ۠ۘ;->ۧ:Ll/۠۠ۘ;

    invoke-static {p1}, Ll/۠۠ۘ;->ۢ(Ll/۠۠ۘ;)Landroid/os/Bundle;

    move-result-object v0

    .line 919
    invoke-static {p1}, Ll/۠۠ۘ;->ܿ(Ll/۠۠ۘ;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 922
    :cond_0
    invoke-static {p1}, Ll/۠۠ۘ;->ܿ(Ll/۠۠ۘ;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    if-eqz v1, :cond_1

    .line 924
    invoke-static {p1}, Ll/۠۠ۘ;->ۡ(Ll/۠۠ۘ;)Ll/᩸۠ۘ;

    move-result-object p1

    invoke-static {p1, v1, v0}, Ll/᩸᩸ۘ;->ۧ(Ll/᩸۠ۘ;Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 687
    :cond_1
    :goto_0
    iget-object p1, p0, Ll/֡۠ۘ;->᩸:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 688
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 690
    :cond_2
    iget-object p1, p0, Ll/ۘ۠ۘ;->᩹:Ll/ۘ᩹ۘ;

    if-eqz p1, :cond_3

    .line 691
    iget-object v0, p0, Ll/ۘ۠ۘ;->᩶:Lorg/json/JSONObject;

    invoke-interface {p1, v0}, Ll/ۘ᩹ۘ;->֫(Lorg/json/JSONObject;)V

    :cond_3
    return-void
.end method
