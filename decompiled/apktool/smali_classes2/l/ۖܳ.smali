.class public abstract Ll/ۖܳ;
.super Ljava/lang/Object;
.source "422Y"


# instance fields
.field public ֫:Landroid/content/BroadcastReceiver;

.field public final synthetic ۧ:Ll/ۚܳ;


# direct methods
.method public constructor <init>(Ll/ۚܳ;)V
    .locals 0

    .line 3612
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖܳ;->ۧ:Ll/ۚܳ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 3644
    iget-object v0, p0, Ll/ۖܳ;->֫:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 3646
    :try_start_0
    iget-object v1, p0, Ll/ۖܳ;->ۧ:Ll/ۚܳ;

    iget-object v1, v1, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x0

    .line 3651
    iput-object v0, p0, Ll/ۖܳ;->֫:Landroid/content/BroadcastReceiver;

    :cond_0
    return-void
.end method

.method public abstract ۧ()Landroid/content/IntentFilter;
.end method

.method public abstract ܽ()V
.end method

.method public final ᩳ()V
    .locals 3

    .line 3621
    invoke-virtual {p0}, Ll/ۖܳ;->֫()V

    .line 3623
    invoke-virtual {p0}, Ll/ۖܳ;->ۧ()Landroid/content/IntentFilter;

    move-result-object v0

    .line 3624
    invoke-virtual {v0}, Landroid/content/IntentFilter;->countActions()I

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 3629
    :cond_0
    iget-object v1, p0, Ll/ۖܳ;->֫:Landroid/content/BroadcastReceiver;

    if-nez v1, :cond_1

    .line 3630
    new-instance v1, Ll/ܺܳ;

    invoke-direct {v1, p0}, Ll/ܺܳ;-><init>(Ll/ۖܳ;)V

    iput-object v1, p0, Ll/ۖܳ;->֫:Landroid/content/BroadcastReceiver;

    .line 3637
    :cond_1
    iget-object v1, p0, Ll/ۖܳ;->ۧ:Ll/ۚܳ;

    iget-object v1, v1, Ll/ۚܳ;->ۖ֫:Landroid/content/Context;

    iget-object v2, p0, Ll/ۖܳ;->֫:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method
