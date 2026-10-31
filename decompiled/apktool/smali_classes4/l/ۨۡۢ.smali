.class public final Ll/ۨۡۢ;
.super Ll/۟ܶۡ;
.source "31PG"


# instance fields
.field public final synthetic ܳ:Ll/ܰۡۢ;


# direct methods
.method public constructor <init>(Ll/ܰۡۢ;)V
    .locals 0

    .line 1051
    iput-object p1, p0, Ll/ۨۡۢ;->ܳ:Ll/ܰۡۢ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 1065
    new-instance v0, Ll/᩵ۡۢ;

    iget-object v1, p0, Ll/ۨۡۢ;->ܳ:Ll/ܰۡۢ;

    iget-object v2, v1, Ll/ܰۡۢ;->۬:Ll/۟ۡۢ;

    invoke-direct {v0, v2}, Ll/᩵ۡۢ;-><init>(Ll/۟ۡۢ;)V

    .line 1066
    iget-object v0, v1, Ll/ܰۡۢ;->ۗ:Ll/ܽܺۢ;

    iget-object v1, v1, Ll/ܰۡۢ;->ۙ:Landroid/widget/TextView;

    invoke-static {v2, v0, v1}, Ll/۟ۡۢ;->֫(Ll/۟ۡۢ;Ll/ܽܺۢ;Landroid/widget/TextView;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 1071
    iget-object v0, p0, Ll/ۨۡۢ;->ܳ:Ll/ܰۡۢ;

    iget-object v0, v0, Ll/ܰۡۢ;->۬:Ll/۟ۡۢ;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 1055
    iget-object v0, p0, Ll/ۨۡۢ;->ܳ:Ll/ܰۡۢ;

    iget-object v0, v0, Ll/ܰۡۢ;->۬:Ll/۟ۡۢ;

    const v1, 0x7f120b33

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 3

    .line 1060
    iget-object v0, p0, Ll/ۨۡۢ;->ܳ:Ll/ܰۡۢ;

    iget-object v0, v0, Ll/ܰۡۢ;->ۗ:Ll/ܽܺۢ;

    .line 139
    invoke-static {}, Ll/֫ܺۢ;->֫()V

    const/16 v1, 0x1048

    .line 141
    invoke-static {v1}, Ll/ᩳᩴۡ;->ᩳ(I)Ll/ᩳᩴۡ;

    move-result-object v1

    iget v2, v0, Ll/ܽܺۢ;->ۙ:I

    .line 142
    invoke-virtual {v1, v2}, Ll/ᩳᩴۡ;->ۧ(I)V

    .line 143
    invoke-virtual {v1}, Ll/ᩳᩴۡ;->ᩳ()Ll/᩻ᩴۡ;

    move-result-object v1

    .line 144
    invoke-virtual {v1}, Ll/᩻ᩴۡ;->ܳ()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x0

    .line 147
    iput v1, v0, Ll/ܽܺۢ;->۫:I

    return-void

    .line 145
    :cond_0
    new-instance v0, Ll/֫ۛۡ;

    const v2, 0x7f120520

    .line 232
    invoke-static {v1, v2}, Ll/֫ۘۡ;->֫(Ll/᩻ᩴۡ;I)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 145
    throw v0
.end method

.method public final ᩳ()V
    .locals 0

    .line 1076
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
