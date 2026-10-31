.class public final Ll/ۡܳ;
.super Ll/ۖܳ;
.source "422Y"


# instance fields
.field public final ܽ:Landroid/os/PowerManager;

.field public final synthetic ᩳ:Ll/ۚܳ;


# direct methods
.method public constructor <init>(Ll/ۚܳ;Landroid/content/Context;)V
    .locals 0

    .line 3691
    iput-object p1, p0, Ll/ۡܳ;->ᩳ:Ll/ۚܳ;

    invoke-direct {p0, p1}, Ll/ۖܳ;-><init>(Ll/ۚܳ;)V

    .line 3692
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "power"

    .line 3693
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/PowerManager;

    iput-object p1, p0, Ll/ۡܳ;->ܽ:Landroid/os/PowerManager;

    return-void
.end method


# virtual methods
.method public final ۧ()Landroid/content/IntentFilter;
    .locals 2

    .line 3713
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.os.action.POWER_SAVE_MODE_CHANGED"

    .line 3714
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ܽ()V
    .locals 1

    .line 3707
    iget-object v0, p0, Ll/ۡܳ;->ᩳ:Ll/ۚܳ;

    invoke-virtual {v0}, Ll/ۚܳ;->ۧ()Z

    return-void
.end method

.method public final ܿ()I
    .locals 1

    .line 3700
    iget-object v0, p0, Ll/ۡܳ;->ܽ:Landroid/os/PowerManager;

    invoke-static {v0}, Ll/ܿܳ;->֫(Landroid/os/PowerManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
