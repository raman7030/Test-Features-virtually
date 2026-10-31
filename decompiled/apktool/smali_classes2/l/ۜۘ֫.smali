.class public final Ll/ۜۘ֫;
.super Ljava/lang/Object;
.source "X6AW"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:I

.field public final synthetic ۙ:Ljava/lang/String;

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/֡ۘ֫;

.field public final synthetic ᩹:Ll/֨ۘ֫;


# direct methods
.method public constructor <init>(IILandroid/os/Bundle;Ll/֡ۘ֫;Ll/֨ۘ֫;Ljava/lang/String;)V
    .locals 0

    .line 913
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Ll/ۜۘ֫;->᩸:Ll/֡ۘ֫;

    iput-object p5, p0, Ll/ۜۘ֫;->᩹:Ll/֨ۘ֫;

    iput-object p6, p0, Ll/ۜۘ֫;->ۙ:Ljava/lang/String;

    iput p1, p0, Ll/ۜۘ֫;->᩶:I

    iput p2, p0, Ll/ۜۘ֫;->ۗ:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1152
    iget-object v6, p0, Ll/ۜۘ֫;->᩹:Ll/֨ۘ֫;

    iget-object v0, v6, Ll/֨ۘ֫;->֫:Landroid/os/Messenger;

    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    move-result-object v7

    .line 919
    iget-object v0, p0, Ll/ۜۘ֫;->᩸:Ll/֡ۘ֫;

    iget-object v1, v0, Ll/֡ۘ֫;->֫:Ll/ܶۘ֫;

    iget-object v1, v1, Ll/ܶۘ֫;->᩸:Ll/ۖ᩵;

    invoke-virtual {v1, v7}, Ll/ۗ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 921
    new-instance v8, Ll/ۤۖ֫;

    iget-object v9, v0, Ll/֡ۘ֫;->֫:Ll/ܶۘ֫;

    iget v3, p0, Ll/ۜۘ֫;->᩶:I

    iget v4, p0, Ll/ۜۘ֫;->ۗ:I

    iget-object v2, p0, Ll/ۜۘ֫;->ۙ:Ljava/lang/String;

    move-object v0, v8

    move-object v1, v9

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Ll/ۤۖ֫;-><init>(Ll/ܶۘ֫;Ljava/lang/String;IILl/֨ۘ֫;)V

    .line 924
    invoke-virtual {v9}, Ll/ܶۘ֫;->֫()Ll/۬ۖ֫;

    move-result-object v0

    if-nez v0, :cond_0

    .line 932
    :try_start_0
    invoke-virtual {v6}, Ll/֨ۘ֫;->֫()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    return-void

    .line 939
    :cond_0
    :try_start_1
    iget-object v0, v9, Ll/ܶۘ֫;->᩸:Ll/ۖ᩵;

    invoke-virtual {v0, v7, v8}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 940
    invoke-interface {v7, v8, v0}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    .line 948
    :catch_0
    iget-object v0, v9, Ll/ܶۘ֫;->᩸:Ll/ۖ᩵;

    invoke-virtual {v0, v7}, Ll/ۗ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :catch_1
    return-void
.end method
