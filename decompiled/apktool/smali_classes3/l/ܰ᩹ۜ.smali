.class public final Ll/ܰ᩹ۜ;
.super Landroid/content/BroadcastReceiver;
.source "K5ZN"


# instance fields
.field public final synthetic ֫:Ll/֡ۚۢ;


# direct methods
.method public constructor <init>(Ll/֡ۚۢ;)V
    .locals 0

    .line 403
    iput-object p1, p0, Ll/ܰ᩹ۜ;->֫:Ll/֡ۚۢ;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 406
    iget-object p1, p0, Ll/ܰ᩹ۜ;->֫:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->ۜ()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 407
    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    :cond_0
    return-void
.end method
