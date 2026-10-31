.class public final Ll/᩵ۘ֫;
.super Ljava/lang/Object;
.source "X6AW"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Ll/᩸ۧ;

.field public final synthetic ۙ:Landroid/os/Bundle;

.field public final synthetic ᩶:Ll/֨ۘ֫;

.field public final synthetic ᩸:Ll/֡ۘ֫;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/֡ۘ֫;Ll/֨ۘ֫;Ljava/lang/String;Landroid/os/Bundle;Ll/᩸ۧ;)V
    .locals 0

    .line 1117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۘ֫;->᩸:Ll/֡ۘ֫;

    iput-object p2, p0, Ll/᩵ۘ֫;->᩶:Ll/֨ۘ֫;

    iput-object p3, p0, Ll/᩵ۘ֫;->᩹:Ljava/lang/String;

    iput-object p4, p0, Ll/᩵ۘ֫;->ۙ:Landroid/os/Bundle;

    iput-object p5, p0, Ll/᩵ۘ֫;->ۗ:Ll/᩸ۧ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1120
    iget-object v0, p0, Ll/᩵ۘ֫;->᩶:Ll/֨ۘ֫;

    .line 1152
    iget-object v0, v0, Ll/֨ۘ֫;->֫:Landroid/os/Messenger;

    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    move-result-object v0

    .line 1122
    iget-object v1, p0, Ll/᩵ۘ֫;->᩸:Ll/֡ۘ֫;

    iget-object v1, v1, Ll/֡ۘ֫;->֫:Ll/ܶۘ֫;

    iget-object v1, v1, Ll/ܶۘ֫;->᩸:Ll/ۖ᩵;

    const/4 v2, 0x0

    .line 369
    invoke-virtual {v1, v0, v2}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 1122
    check-cast v0, Ll/ۤۖ֫;

    .line 1123
    iget-object v1, p0, Ll/᩵ۘ֫;->ۙ:Landroid/os/Bundle;

    if-nez v0, :cond_0

    .line 1124
    invoke-static {v1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    return-void

    .line 1871
    :cond_0
    new-instance v0, Ll/ۗۖ֫;

    iget-object v2, p0, Ll/᩵ۘ֫;->᩹:Ljava/lang/String;

    iget-object v3, p0, Ll/᩵ۘ֫;->ۗ:Ll/᩸ۧ;

    invoke-direct {v0, v2, v3}, Ll/ۗۖ֫;-><init>(Ljava/lang/Object;Ll/᩸ۧ;)V

    .line 1456
    invoke-virtual {v0}, Ll/ܳۘ֫;->ܿ()V

    .line 1892
    invoke-virtual {v0}, Ll/ܳۘ֫;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 1893
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "onCustomAction must call detach() or sendResult() or sendError() before returning for action="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " extras="

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
