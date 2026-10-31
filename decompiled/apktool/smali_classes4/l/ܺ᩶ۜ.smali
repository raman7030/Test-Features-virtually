.class public final Ll/ܺ᩶ۜ;
.super Landroid/content/BroadcastReceiver;
.source "Q8UX"


# instance fields
.field public final synthetic ֫:Ll/ۘ᩶ۜ;


# direct methods
.method public constructor <init>(Ll/ۘ᩶ۜ;)V
    .locals 0

    .line 85
    iput-object p1, p0, Ll/ܺ᩶ۜ;->֫:Ll/ۘ᩶ۜ;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    const-string p1, "android.media.AUDIO_BECOMING_NOISY"

    .line 88
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 89
    invoke-static {}, Ll/᩷᩶ۜ;->ܿ()Ll/ۜ᩶ۜ;

    move-result-object p1

    .line 90
    iget-object p2, p0, Ll/ܺ᩶ۜ;->֫:Ll/ۘ᩶ۜ;

    invoke-static {p2, p1}, Ll/ۘ᩶ۜ;->֫(Ll/ۘ᩶ۜ;Ll/ۜ᩶ۜ;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 91
    invoke-virtual {p1}, Ll/ۜ᩶ۜ;->֫()V

    :cond_0
    return-void
.end method
