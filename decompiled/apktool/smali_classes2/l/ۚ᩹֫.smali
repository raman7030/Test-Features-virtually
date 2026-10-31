.class public final Ll/ۚ᩹֫;
.super Landroid/content/BroadcastReceiver;
.source "M8IS"


# instance fields
.field public final ֫:Ll/᩵ۚ֫;

.field public final ۧ:Ll/֨᩹֫;

.field public final synthetic ܽ:Ll/۠᩹֫;


# direct methods
.method public constructor <init>(Ll/۠᩹֫;Ll/᩵ۚ֫;Ll/֨᩹֫;)V
    .locals 0

    .line 90
    iput-object p1, p0, Ll/ۚ᩹֫;->ܽ:Ll/۠᩹֫;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 91
    iput-object p2, p0, Ll/ۚ᩹֫;->֫:Ll/᩵ۚ֫;

    .line 92
    iput-object p3, p0, Ll/ۚ᩹֫;->ۧ:Ll/֨᩹֫;

    return-void
.end method

.method public static ֫(Ll/ۚ᩹֫;)V
    .locals 1

    .line 103
    iget-object v0, p0, Ll/ۚ᩹֫;->ܽ:Ll/۠᩹֫;

    invoke-static {v0}, Ll/۠᩹֫;->ۧ(Ll/۠᩹֫;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    iget-object p0, p0, Ll/ۚ᩹֫;->ۧ:Ll/֨᩹֫;

    check-cast p0, Ll/᩷ۙ֫;

    .line 3311
    iget-object p0, p0, Ll/᩷ۙ֫;->᩸:Ll/ܺۙ֫;

    invoke-static {p0}, Ll/ܺۙ֫;->ۡ(Ll/ܺۙ֫;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    const-string p1, "android.media.AUDIO_BECOMING_NOISY"

    .line 97
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 98
    new-instance p1, Ll/֡᩹֫;

    invoke-direct {p1, p0}, Ll/֡᩹֫;-><init>(Ll/ۚ᩹֫;)V

    iget-object p2, p0, Ll/ۚ᩹֫;->֫:Ll/᩵ۚ֫;

    invoke-interface {p2, p1}, Ll/᩵ۚ֫;->֫(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
