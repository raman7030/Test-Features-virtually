.class public final Ll/ᩴۘ֫;
.super Ljava/lang/Object;
.source "X6AW"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ll/᩸ۧ;

.field public final synthetic ᩶:Ljava/lang/String;

.field public final synthetic ᩸:Ll/֡ۘ֫;

.field public final synthetic ᩹:Ll/֨ۘ֫;


# direct methods
.method public constructor <init>(Ll/֡ۘ֫;Ll/֨ۘ֫;Ljava/lang/String;Landroid/os/Bundle;Ll/᩸ۧ;)V
    .locals 0

    .line 1096
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴۘ֫;->᩸:Ll/֡ۘ֫;

    iput-object p2, p0, Ll/ᩴۘ֫;->᩹:Ll/֨ۘ֫;

    iput-object p3, p0, Ll/ᩴۘ֫;->᩶:Ljava/lang/String;

    iput-object p5, p0, Ll/ᩴۘ֫;->ۙ:Ll/᩸ۧ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1099
    iget-object v0, p0, Ll/ᩴۘ֫;->᩹:Ll/֨ۘ֫;

    .line 1152
    iget-object v0, v0, Ll/֨ۘ֫;->֫:Landroid/os/Messenger;

    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    move-result-object v0

    .line 1101
    iget-object v1, p0, Ll/ᩴۘ֫;->᩸:Ll/֡ۘ֫;

    iget-object v1, v1, Ll/֡ۘ֫;->֫:Ll/ܶۘ֫;

    iget-object v1, v1, Ll/ܶۘ֫;->᩸:Ll/ۖ᩵;

    const/4 v2, 0x0

    .line 369
    invoke-virtual {v1, v0, v2}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 1101
    check-cast v0, Ll/ۤۖ֫;

    if-nez v0, :cond_0

    goto :goto_0

    .line 1843
    :cond_0
    new-instance v0, Ll/ۙۖ֫;

    iget-object v1, p0, Ll/ᩴۘ֫;->᩶:Ljava/lang/String;

    iget-object v2, p0, Ll/ᩴۘ֫;->ۙ:Ll/᩸ۧ;

    invoke-direct {v0, v1, v2}, Ll/ۙۖ֫;-><init>(Ljava/lang/Object;Ll/᩸ۧ;)V

    const/4 v2, 0x4

    .line 1431
    invoke-virtual {v0, v2}, Ll/ܳۘ֫;->֫(I)V

    .line 1432
    invoke-virtual {v0}, Ll/ܳۘ֫;->ܳ()V

    .line 1863
    invoke-virtual {v0}, Ll/ܳۘ֫;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    .line 1864
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "onSearch must call detach() or sendResult() before returning for query="

    .line 0
    invoke-static {v2, v1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1864
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
