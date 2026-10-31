.class public final Ll/ۛۛܽ;
.super Ll/ۨ۬ܿ;
.source "H5BW"


# instance fields
.field public final synthetic ۗ:Ll/᩷ۨܽ;

.field public final synthetic ۬:Ll/۬ܿᩳ;


# direct methods
.method public constructor <init>(Ll/᩷ۨܽ;Ll/۬ܿᩳ;Ll/ۗܺ᩷;)V
    .locals 0

    .line 690
    iput-object p2, p0, Ll/ۛۛܽ;->۬:Ll/۬ܿᩳ;

    iput-object p1, p0, Ll/ۛۛܽ;->ۗ:Ll/᩷ۨܽ;

    const/4 p1, -0x1

    .line 24
    invoke-direct {p0, p3, p1}, Ll/ۨ۬ܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ܽ()V
    .locals 1

    .line 712
    iget-object v0, p0, Ll/ۛۛܽ;->ۗ:Ll/᩷ۨܽ;

    invoke-interface {v0}, Ll/᩷ۨܽ;->onCanceled()V

    return-void
.end method

.method public final ܿ()V
    .locals 3

    .line 694
    invoke-virtual {p0}, Ll/ۨ۬ܿ;->ۧ()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۛۛܽ;->۬:Ll/۬ܿᩳ;

    invoke-virtual {v1, v0}, Ll/۬ܿᩳ;->ۧ(Ljava/lang/String;)V

    .line 695
    invoke-virtual {p0}, Ll/ۨ۬ܿ;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    iget-object v2, p0, Ll/ۛۛܽ;->ۗ:Ll/᩷ۨܽ;

    if-nez v0, :cond_0

    .line 697
    :try_start_0
    invoke-virtual {v1}, Ll/۬ܿᩳ;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 703
    invoke-interface {v2}, Ll/᩷ۨܽ;->onSuccess()V

    goto :goto_0

    :catchall_0
    const v0, 0x7f12048d

    .line 699
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 700
    invoke-virtual {p0}, Ll/ۨ۬ܿ;->ܳ()V

    return-void

    .line 705
    :cond_0
    invoke-interface {v2}, Ll/᩷ۨܽ;->onCanceled()V

    .line 707
    :goto_0
    invoke-virtual {p0}, Ll/ۨ۬ܿ;->֫()V

    return-void
.end method
