.class public final Ll/᩷ۘ֫;
.super Ljava/lang/Object;
.source "X6AW"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/֡ۘ֫;

.field public final synthetic ᩹:Ll/֨ۘ֫;


# direct methods
.method public constructor <init>(Ll/֡ۘ֫;Ll/֨ۘ֫;)V
    .locals 0

    .line 956
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۘ֫;->᩸:Ll/֡ۘ֫;

    iput-object p2, p0, Ll/᩷ۘ֫;->᩹:Ll/֨ۘ֫;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 959
    iget-object v0, p0, Ll/᩷ۘ֫;->᩹:Ll/֨ۘ֫;

    .line 1152
    iget-object v0, v0, Ll/֨ۘ֫;->֫:Landroid/os/Messenger;

    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    move-result-object v0

    .line 962
    iget-object v1, p0, Ll/᩷ۘ֫;->᩸:Ll/֡ۘ֫;

    iget-object v1, v1, Ll/֡ۘ֫;->֫:Ll/ܶۘ֫;

    iget-object v1, v1, Ll/ܶۘ֫;->᩸:Ll/ۖ᩵;

    invoke-virtual {v1, v0}, Ll/ۗ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤۖ֫;

    if-eqz v0, :cond_0

    .line 965
    iget-object v1, v0, Ll/ۤۖ֫;->֫:Ll/ۚۘ֫;

    check-cast v1, Ll/֨ۘ֫;

    .line 1152
    iget-object v1, v1, Ll/֨ۘ֫;->֫:Landroid/os/Messenger;

    invoke-virtual {v1}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    .line 965
    invoke-interface {v1, v0, v2}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    :cond_0
    return-void
.end method
