.class public final Ll/ܽۡ᩷;
.super Ll/۟ܶۡ;
.source "R7YU"


# instance fields
.field public final synthetic ܳ:Ll/ۜۡ᩷;

.field public final synthetic ᩻:Landroid/view/View;


# direct methods
.method public constructor <init>(Ll/ۜۡ᩷;Landroid/view/View;)V
    .locals 0

    .line 129
    iput-object p1, p0, Ll/ܽۡ᩷;->ܳ:Ll/ۜۡ᩷;

    iput-object p2, p0, Ll/ܽۡ᩷;->᩻:Landroid/view/View;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 146
    iget-object v0, p0, Ll/ܽۡ᩷;->ܳ:Ll/ۜۡ᩷;

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f120491

    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    const v1, 0x7f120b31

    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(I)V

    const v1, 0x7f12070a

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v0

    .line 147
    invoke-static {v0}, Ll/ۡܶۡ;->֫(Ll/֡ۚۢ;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 152
    iget-object v0, p0, Ll/ܽۡ᩷;->᩻:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 153
    iget-object v0, p0, Ll/ܽۡ᩷;->ܳ:Ll/ۜۡ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 133
    iget-object v0, p0, Ll/ܽۡ᩷;->ܳ:Ll/ۜۡ᩷;

    const v1, 0x7f120b33

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 3

    const/16 v0, 0x1075

    .line 1120
    invoke-static {v0}, Ll/ᩳᩴۡ;->ᩳ(I)Ll/ᩳᩴۡ;

    move-result-object v0

    .line 1121
    invoke-virtual {v0}, Ll/ᩳᩴۡ;->ᩳ()Ll/᩻ᩴۡ;

    move-result-object v0

    .line 139
    invoke-virtual {v0}, Ll/᩻ᩴۡ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 140
    :cond_0
    new-instance v1, Ll/᩵ۤۡ;

    const v2, 0x7f120520

    .line 232
    invoke-static {v0, v2}, Ll/֫ۘۡ;->֫(Ll/᩻ᩴۡ;I)Ljava/lang/String;

    move-result-object v0

    .line 14
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 140
    throw v1
.end method

.method public final ᩳ()V
    .locals 0

    .line 158
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
