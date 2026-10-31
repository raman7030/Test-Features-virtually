.class public final Ll/ۖۘ֫;
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

    .line 1037
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Ll/ۖۘ֫;->᩸:Ll/֡ۘ֫;

    iput-object p5, p0, Ll/ۖۘ֫;->᩹:Ll/֨ۘ֫;

    iput p1, p0, Ll/ۖۘ֫;->ۗ:I

    iput-object p6, p0, Ll/ۖۘ֫;->ۙ:Ljava/lang/String;

    iput p2, p0, Ll/ۖۘ֫;->᩶:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1152
    iget-object v6, p0, Ll/ۖۘ֫;->᩹:Ll/֨ۘ֫;

    iget-object v0, v6, Ll/֨ۘ֫;->֫:Landroid/os/Messenger;

    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    move-result-object v7

    .line 1042
    iget-object v0, p0, Ll/ۖۘ֫;->᩸:Ll/֡ۘ֫;

    iget-object v1, v0, Ll/֡ۘ֫;->֫:Ll/ܶۘ֫;

    iget-object v1, v1, Ll/ܶۘ֫;->᩸:Ll/ۖ᩵;

    invoke-virtual {v1, v7}, Ll/ۗ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1045
    iget-object v8, v0, Ll/֡ۘ֫;->֫:Ll/ܶۘ֫;

    iget-object v0, v8, Ll/ܶۘ֫;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    .line 1046
    :cond_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 1047
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤۖ֫;

    .line 1050
    iget v2, v0, Ll/ۤۖ֫;->ܳ:I

    iget v3, p0, Ll/ۖۘ֫;->ۗ:I

    if-ne v2, v3, :cond_0

    .line 1052
    iget-object v2, p0, Ll/ۖۘ֫;->ۙ:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    iget v2, p0, Ll/ۖۘ֫;->᩶:I

    if-gtz v2, :cond_2

    .line 1055
    :cond_1
    new-instance v10, Ll/ۤۖ֫;

    iget-object v2, v0, Ll/ۤۖ֫;->ܽ:Ljava/lang/String;

    iget v3, v0, Ll/ۤۖ֫;->ۧ:I

    iget v4, v0, Ll/ۤۖ֫;->ܳ:I

    move-object v0, v10

    move-object v1, v8

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Ll/ۤۖ֫;-><init>(Ll/ܶۘ֫;Ljava/lang/String;IILl/֨ۘ֫;)V

    move-object v1, v10

    .line 1059
    :cond_2
    invoke-interface {v9}, Ljava/util/Iterator;->remove()V

    :cond_3
    if-nez v1, :cond_4

    .line 1064
    new-instance v9, Ll/ۤۖ֫;

    iget v3, p0, Ll/ۖۘ֫;->᩶:I

    iget v4, p0, Ll/ۖۘ֫;->ۗ:I

    iget-object v2, p0, Ll/ۖۘ֫;->ۙ:Ljava/lang/String;

    move-object v0, v9

    move-object v1, v8

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Ll/ۤۖ֫;-><init>(Ll/ܶۘ֫;Ljava/lang/String;IILl/֨ۘ֫;)V

    move-object v1, v9

    .line 1066
    :cond_4
    iget-object v0, v8, Ll/ܶۘ֫;->᩸:Ll/ۖ᩵;

    invoke-virtual {v0, v7, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 1068
    :try_start_0
    invoke-interface {v7, v1, v0}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
