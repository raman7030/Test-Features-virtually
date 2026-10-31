.class public final Ll/ۤۛܽ;
.super Ll/۟ܶۡ;
.source "H5BW"


# instance fields
.field public final synthetic ۜ:Ll/۬ܿᩳ;

.field public final synthetic ܳ:Ll/ۗܺ᩷;

.field public final synthetic ᩻:Ll/᩷ۨܽ;


# direct methods
.method public constructor <init>(Ll/᩷ۨܽ;Ll/۬ܿᩳ;Ll/ۗܺ᩷;)V
    .locals 0

    .line 659
    iput-object p3, p0, Ll/ۤۛܽ;->ܳ:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/ۤۛܽ;->ۜ:Ll/۬ܿᩳ;

    iput-object p1, p0, Ll/ۤۛܽ;->᩻:Ll/᩷ۨܽ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 673
    iget-object v0, p0, Ll/ۤۛܽ;->᩻:Ll/᩷ۨܽ;

    invoke-interface {v0}, Ll/᩷ۨܽ;->onSuccess()V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 678
    iget-object v0, p0, Ll/ۤۛܽ;->᩻:Ll/᩷ۨܽ;

    invoke-interface {v0, p1}, Ll/᩷ۨܽ;->֫(Ljava/lang/Exception;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 679
    iget-object v0, p0, Ll/ۤۛܽ;->ܳ:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_0
    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 663
    iget-object v0, p0, Ll/ۤۛܽ;->ܳ:Ll/ۗܺ᩷;

    const/16 v1, 0xc8

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->ۧ(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 1

    .line 668
    iget-object v0, p0, Ll/ۤۛܽ;->ۜ:Ll/۬ܿᩳ;

    invoke-virtual {v0}, Ll/۬ܿᩳ;->֫()V

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 685
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
