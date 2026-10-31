.class public final Ll/ۘܳ;
.super Ll/ۖܳ;
.source "422Y"


# instance fields
.field public final ܽ:Ll/۟ܳ;

.field public final synthetic ᩳ:Ll/ۚܳ;


# direct methods
.method public constructor <init>(Ll/ۚܳ;Ll/۟ܳ;)V
    .locals 0

    .line 3663
    iput-object p1, p0, Ll/ۘܳ;->ᩳ:Ll/ۚܳ;

    invoke-direct {p0, p1}, Ll/ۖܳ;-><init>(Ll/ۚܳ;)V

    .line 3664
    iput-object p2, p0, Ll/ۘܳ;->ܽ:Ll/۟ܳ;

    return-void
.end method


# virtual methods
.method public final ۧ()Landroid/content/IntentFilter;
    .locals 2

    .line 3680
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.TIME_SET"

    .line 3681
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIMEZONE_CHANGED"

    .line 3682
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIME_TICK"

    .line 3683
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ܽ()V
    .locals 1

    .line 3675
    iget-object v0, p0, Ll/ۘܳ;->ᩳ:Ll/ۚܳ;

    invoke-virtual {v0}, Ll/ۚܳ;->ۧ()Z

    return-void
.end method

.method public final ܿ()I
    .locals 1

    .line 3670
    iget-object v0, p0, Ll/ۘܳ;->ܽ:Ll/۟ܳ;

    invoke-virtual {v0}, Ll/۟ܳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
