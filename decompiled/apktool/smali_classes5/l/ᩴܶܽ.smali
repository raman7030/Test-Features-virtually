.class public final Ll/ᩴܶܽ;
.super Ll/۟ܶۡ;
.source "4646"


# instance fields
.field public final synthetic ܳ:Ll/۠ܶܽ;


# direct methods
.method public constructor <init>(Ll/۠ܶܽ;)V
    .locals 0

    .line 227
    iput-object p1, p0, Ll/ᩴܶܽ;->ܳ:Ll/۠ܶܽ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 241
    iget-object v0, p0, Ll/ᩴܶܽ;->ܳ:Ll/۠ܶܽ;

    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v1

    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v2

    iget-object v2, v2, Ll/֨ܶܽ;->ۗ:Ll/ܶۨۡ;

    invoke-virtual {v2}, Ll/ܶۨۡ;->ܿ()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Ll/֨ܶܽ;->ܰ:Ljava/lang/String;

    .line 242
    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v1

    iget-object v1, v1, Ll/֨ܶܽ;->ܰ:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 243
    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v1

    const-string v2, "Error"

    iput-object v2, v1, Ll/֨ܶܽ;->ܰ:Ljava/lang/String;

    .line 244
    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v1

    iget-object v1, v1, Ll/֨ܶܽ;->ۗ:Ll/ܶۨۡ;

    invoke-virtual {v1}, Ll/ܶۨۡ;->ܽ()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f120757

    .line 245
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    const v2, 0x7f120756

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 248
    :cond_0
    invoke-static {v1}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return-void

    :cond_1
    :goto_0
    const/4 v2, 0x0

    .line 516
    invoke-virtual {v0, v1, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/String;Z)V

    return-void

    .line 251
    :cond_2
    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v1

    iget-object v1, v1, Ll/֨ܶܽ;->ܰ:Ljava/lang/String;

    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v2

    iget-object v2, v2, Ll/֨ܶܽ;->۫:Ljava/lang/String;

    const/4 v3, 0x0

    .line 323
    invoke-static {v0, v1, v2, v3, v3}, Ll/ܶۖᩳ;->֫(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 256
    iget-object v0, p0, Ll/ᩴܶܽ;->ܳ:Ll/۠ܶܽ;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 231
    iget-object v0, p0, Ll/ᩴܶܽ;->ܳ:Ll/۠ܶܽ;

    invoke-virtual {p0, v0}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;)V

    return-void
.end method

.method public final ܿ()V
    .locals 3

    .line 236
    iget-object v0, p0, Ll/ᩴܶܽ;->ܳ:Ll/۠ܶܽ;

    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v0

    iget-object v0, v0, Ll/֨ܶܽ;->ۗ:Ll/ܶۨۡ;

    new-instance v1, Ll/۫ܽܽ;

    invoke-direct {v1}, Ll/۫ܽܽ;-><init>()V

    invoke-static {}, Ll/ܽ֨ᩳ;->ۧ֫()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Ll/ܶۨۡ;->֫(Ll/۫ܽܽ;Z)V

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 261
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
