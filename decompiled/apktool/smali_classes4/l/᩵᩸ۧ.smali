.class public final Ll/᩵᩸ۧ;
.super Ljava/lang/Object;
.source "I5JQ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/᩸᩸ۧ;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩸᩸ۧ;Ljava/lang/String;)V
    .locals 0

    .line 698
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵᩸ۧ;->᩸:Ll/᩸᩸ۧ;

    iput-object p2, p0, Ll/᩵᩸ۧ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 701
    iget-object v0, p0, Ll/᩵᩸ۧ;->᩸:Ll/᩸᩸ۧ;

    iget-object v1, v0, Ll/᩸᩸ۧ;->۬:Ll/۬۬ۧ;

    invoke-virtual {v1}, Ll/۬۬ۧ;->getAdapter()Ll/᩶ۗۧ;

    move-result-object v1

    .line 702
    instance-of v2, v1, Ll/᩹᩸ۧ;

    if-nez v2, :cond_1

    if-nez v1, :cond_0

    return-void

    .line 705
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Adapter must implement PreferencePositionCallback"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 717
    :cond_1
    move-object v2, v1

    check-cast v2, Ll/᩹᩸ۧ;

    .line 718
    iget-object v3, p0, Ll/᩵᩸ۧ;->᩹:Ljava/lang/String;

    invoke-interface {v2, v3}, Ll/᩹᩸ۧ;->֫(Ljava/lang/String;)I

    move-result v2

    const/4 v4, -0x1

    if-eq v2, v4, :cond_2

    .line 721
    iget-object v0, v0, Ll/᩸᩸ۧ;->۬:Ll/۬۬ۧ;

    invoke-virtual {v0, v2}, Ll/۬۬ۧ;->scrollToPosition(I)V

    return-void

    .line 724
    :cond_2
    new-instance v2, Ll/ܶ᩸ۧ;

    iget-object v0, v0, Ll/᩸᩸ۧ;->۬:Ll/۬۬ۧ;

    invoke-direct {v2, v1, v0, v3}, Ll/ܶ᩸ۧ;-><init>(Ll/᩶ۗۧ;Ll/۬۬ۧ;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ll/᩶ۗۧ;->registerAdapterDataObserver(Ll/ۗۗۧ;)V

    return-void
.end method
