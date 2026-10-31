.class public final Ll/֨ۨܿ;
.super Landroid/content/BroadcastReceiver;
.source "PAKQ"


# instance fields
.field public final synthetic ֫:[Ll/֡ۚۢ;


# direct methods
.method public constructor <init>([Ll/֡ۚۢ;)V
    .locals 0

    .line 106
    iput-object p1, p0, Ll/֨ۨܿ;->֫:[Ll/֡ۚۢ;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 109
    iget-object p1, p0, Ll/֨ۨܿ;->֫:[Ll/֡ۚۢ;

    const/4 p2, 0x0

    aget-object p1, p1, p2

    .line 110
    invoke-static {}, Ll/ۗۨܿ;->֫()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 111
    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    return-void

    .line 113
    :cond_0
    invoke-virtual {p1}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object p1

    const p2, 0x7f1209d2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method
