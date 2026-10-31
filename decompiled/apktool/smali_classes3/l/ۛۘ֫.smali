.class public final Ll/ۛۘ֫;
.super Ll/ۖ;
.source "X59Z"


# instance fields
.field public final ܳ:Landroid/content/BroadcastReceiver$PendingResult;

.field public final ܽ:Landroid/content/Context;

.field public ܿ:Ll/۫;

.field public final ᩳ:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/Intent;Landroid/content/BroadcastReceiver$PendingResult;)V
    .locals 0

    .line 192
    invoke-direct {p0}, Ll/ۖ;-><init>()V

    .line 193
    iput-object p1, p0, Ll/ۛۘ֫;->ܽ:Landroid/content/Context;

    .line 194
    iput-object p2, p0, Ll/ۛۘ֫;->ᩳ:Landroid/content/Intent;

    .line 195
    iput-object p3, p0, Ll/ۛۘ֫;->ܳ:Landroid/content/BroadcastReceiver$PendingResult;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 205
    new-instance v0, Ll/ܶ֫;

    iget-object v1, p0, Ll/ۛۘ֫;->ܿ:Ll/۫;

    .line 206
    invoke-virtual {v1}, Ll/۫;->ܽ()Ll/ܳۧ;

    move-result-object v1

    iget-object v2, p0, Ll/ۛۘ֫;->ܽ:Landroid/content/Context;

    invoke-direct {v0, v2, v1}, Ll/ܶ֫;-><init>(Landroid/content/Context;Ll/ܳۧ;)V

    .line 207
    iget-object v1, p0, Ll/ۛۘ֫;->ᩳ:Landroid/content/Intent;

    const-string v2, "android.intent.extra.KEY_EVENT"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/view/KeyEvent;

    .line 208
    invoke-virtual {v0, v1}, Ll/ܶ֫;->֫(Landroid/view/KeyEvent;)V

    .line 223
    iget-object v0, p0, Ll/ۛۘ֫;->ܿ:Ll/۫;

    invoke-virtual {v0}, Ll/۫;->ۧ()V

    .line 224
    iget-object v0, p0, Ll/ۛۘ֫;->ܳ:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    return-void
.end method

.method public final ֫(Ll/۫;)V
    .locals 0

    .line 199
    iput-object p1, p0, Ll/ۛۘ֫;->ܿ:Ll/۫;

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 223
    iget-object v0, p0, Ll/ۛۘ֫;->ܿ:Ll/۫;

    invoke-virtual {v0}, Ll/۫;->ۧ()V

    .line 224
    iget-object v0, p0, Ll/ۛۘ֫;->ܳ:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 223
    iget-object v0, p0, Ll/ۛۘ֫;->ܿ:Ll/۫;

    invoke-virtual {v0}, Ll/۫;->ۧ()V

    .line 224
    iget-object v0, p0, Ll/ۛۘ֫;->ܳ:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    return-void
.end method
