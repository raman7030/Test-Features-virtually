.class public final Ll/֨ۗ᩷;
.super Ll/۟ܶۡ;
.source "Z3WS"


# instance fields
.field public final synthetic ܳ:Ll/۠ۗ᩷;

.field public final synthetic ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/۠ۗ᩷;Ljava/lang/String;)V
    .locals 0

    .line 190
    iput-object p1, p0, Ll/֨ۗ᩷;->ܳ:Ll/۠ۗ᩷;

    iput-object p2, p0, Ll/֨ۗ᩷;->᩻:Ljava/lang/String;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 207
    iget-object v0, p0, Ll/֨ۗ᩷;->ܳ:Ll/۠ۗ᩷;

    invoke-virtual {v0}, Ll/۬ۗܿ;->ۧ()V

    .line 208
    iget-object v1, v0, Ll/۠ۗ᩷;->ۧ֫:Ll/֡ۚۢ;

    invoke-virtual {v1}, Ll/֡ۚۢ;->dismiss()V

    .line 209
    iget-object v1, v0, Ll/۠ۗ᩷;->۟:Ll/᩶ۗ᩷;

    iget-object v0, v0, Ll/۠ۗ᩷;->֫֫:Ll/ۗܺ᩷;

    invoke-virtual {v1, v0}, Ll/᩶ۗ᩷;->֫(Ll/ۗܺ᩷;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 214
    iget-object v0, p0, Ll/֨ۗ᩷;->ܳ:Ll/۠ۗ᩷;

    iget-object v0, v0, Ll/۠ۗ᩷;->֫֫:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 194
    iget-object v0, p0, Ll/֨ۗ᩷;->ܳ:Ll/۠ۗ᩷;

    iget-object v0, v0, Ll/۠ۗ᩷;->֫֫:Ll/ۗܺ᩷;

    const v1, 0x7f12088f

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 3

    .line 199
    iget-object v0, p0, Ll/֨ۗ᩷;->ܳ:Ll/۠ۗ᩷;

    iget-object v0, v0, Ll/۠ۗ᩷;->ܽ֫:Ll/۟᩵ۡ;

    invoke-virtual {v0}, Ll/۟᩵ۡ;->ᩳ()J

    move-result-wide v0

    const/16 v2, 0x1066

    .line 1094
    invoke-static {v2}, Ll/ᩳᩴۡ;->ᩳ(I)Ll/ᩳᩴۡ;

    move-result-object v2

    .line 1095
    invoke-virtual {v2, v0, v1}, Ll/ᩳᩴۡ;->֫(J)V

    .line 1096
    iget-object v0, p0, Ll/֨ۗ᩷;->᩻:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ll/ᩳᩴۡ;->ۧ(Ljava/lang/String;)V

    .line 1097
    invoke-virtual {v2}, Ll/ᩳᩴۡ;->ܿ()Ll/᩻ᩴۡ;

    move-result-object v0

    .line 200
    invoke-virtual {v0}, Ll/᩻ᩴۡ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 201
    :cond_0
    new-instance v1, Ll/֫ۛۡ;

    const v2, 0x7f120520

    .line 232
    invoke-static {v0, v2}, Ll/֫ۘۡ;->֫(Ll/᩻ᩴۡ;I)Ljava/lang/String;

    move-result-object v0

    .line 16
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 201
    throw v1
.end method

.method public final ᩳ()V
    .locals 0

    .line 219
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
