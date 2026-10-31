.class public final Ll/᩹᩷ᩳ;
.super Ll/۟ܶۡ;
.source "61L9"


# instance fields
.field public final synthetic ܳ:Ll/֫ۢᩳ;

.field public final synthetic ᩻:Z


# direct methods
.method public constructor <init>(Ll/֫ۢᩳ;Z)V
    .locals 0

    .line 611
    iput-object p1, p0, Ll/᩹᩷ᩳ;->ܳ:Ll/֫ۢᩳ;

    iput-boolean p2, p0, Ll/᩹᩷ᩳ;->᩻:Z

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 625
    iget-object v0, p0, Ll/᩹᩷ᩳ;->ܳ:Ll/֫ۢᩳ;

    invoke-static {v0}, Ll/֫ۢᩳ;->᩷(Ll/֫ۢᩳ;)Ll/۟۫ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟۫ᩳ;->ܳ()I

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x7f1206ed

    .line 626
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 632
    iget-object v0, p0, Ll/᩹᩷ᩳ;->ܳ:Ll/֫ۢᩳ;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 615
    iget-object v0, p0, Ll/᩹᩷ᩳ;->ܳ:Ll/֫ۢᩳ;

    const v1, 0x7f120808

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 2

    .line 620
    iget-object v0, p0, Ll/᩹᩷ᩳ;->ܳ:Ll/֫ۢᩳ;

    invoke-static {v0}, Ll/֫ۢᩳ;->᩷(Ll/֫ۢᩳ;)Ll/۟۫ᩳ;

    move-result-object v0

    iget-boolean v1, p0, Ll/᩹᩷ᩳ;->᩻:Z

    invoke-virtual {v0, v1}, Ll/۟۫ᩳ;->ᩳ(Z)V

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 637
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
