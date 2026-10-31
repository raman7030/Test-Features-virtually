.class public final Ll/۫ۖ֫;
.super Ljava/lang/Object;
.source "X6AW"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۤۖ֫;


# direct methods
.method public constructor <init>(Ll/ۤۖ֫;)V
    .locals 0

    .line 749
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۖ֫;->᩸:Ll/ۤۖ֫;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 752
    iget-object v0, p0, Ll/۫ۖ֫;->᩸:Ll/ۤۖ֫;

    iget-object v1, v0, Ll/ۤۖ֫;->ܿ:Ll/ܶۘ֫;

    iget-object v1, v1, Ll/ܶۘ֫;->᩸:Ll/ۖ᩵;

    iget-object v0, v0, Ll/ۤۖ֫;->֫:Ll/ۚۘ֫;

    check-cast v0, Ll/֨ۘ֫;

    .line 1152
    iget-object v0, v0, Ll/֨ۘ֫;->֫:Landroid/os/Messenger;

    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    move-result-object v0

    .line 752
    invoke-virtual {v1, v0}, Ll/ۗ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
