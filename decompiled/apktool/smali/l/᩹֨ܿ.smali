.class public abstract Ll/᩹֨ܿ;
.super Landroid/content/IIntentSender$Stub;
.source "28BC"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 76
    invoke-direct {p0}, Landroid/content/IIntentSender$Stub;-><init>()V

    return-void
.end method


# virtual methods
.method public send(ILandroid/content/Intent;Ljava/lang/String;Landroid/content/IIntentReceiver;Ljava/lang/String;Landroid/os/Bundle;)I
    .locals 0

    .line 82
    invoke-virtual {p0, p2}, Ll/᩹֨ܿ;->send(Landroid/content/Intent;)V

    const/4 p1, 0x0

    return p1
.end method

.method public send(ILandroid/content/Intent;Ljava/lang/String;Landroid/os/IBinder;Landroid/content/IIntentReceiver;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 88
    invoke-virtual {p0, p2}, Ll/᩹֨ܿ;->send(Landroid/content/Intent;)V

    return-void
.end method

.method public abstract send(Landroid/content/Intent;)V
.end method
