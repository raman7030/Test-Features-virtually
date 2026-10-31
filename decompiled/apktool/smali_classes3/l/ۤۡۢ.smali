.class public final Ll/ۤۡۢ;
.super Ljava/lang/Object;
.source "31PG"

# interfaces
.implements Ll/᩷ۨܽ;


# instance fields
.field public final synthetic ֫:Ll/ܰۡۢ;

.field public final synthetic ۜ:Ll/ܽ᩺ܽ;

.field public final synthetic ۧ:Ll/ۜۨܽ;

.field public final synthetic ܳ:Ll/ۨۧᩳ;

.field public final synthetic ܽ:Z

.field public final synthetic ܿ:Landroid/widget/TextView;

.field public final synthetic ᩳ:Ll/֡ۚۢ;

.field public final synthetic ᩷:Ll/ܳۨܽ;

.field public final synthetic ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ܰۡۢ;ZLl/ܳۨܽ;Ll/֡ۚۢ;Ll/ۜۨܽ;Ll/ܽ᩺ܽ;Ljava/lang/String;Ll/ۨۧᩳ;Landroid/widget/TextView;)V
    .locals 0

    .line 972
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤۡۢ;->֫:Ll/ܰۡۢ;

    iput-boolean p2, p0, Ll/ۤۡۢ;->ܽ:Z

    iput-object p3, p0, Ll/ۤۡۢ;->᩷:Ll/ܳۨܽ;

    iput-object p4, p0, Ll/ۤۡۢ;->ᩳ:Ll/֡ۚۢ;

    iput-object p5, p0, Ll/ۤۡۢ;->ۧ:Ll/ۜۨܽ;

    iput-object p6, p0, Ll/ۤۡۢ;->ۜ:Ll/ܽ᩺ܽ;

    iput-object p7, p0, Ll/ۤۡۢ;->᩻:Ljava/lang/String;

    iput-object p8, p0, Ll/ۤۡۢ;->ܳ:Ll/ۨۧᩳ;

    iput-object p9, p0, Ll/ۤۡۢ;->ܿ:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final synthetic onCanceled()V
    .locals 0

    return-void
.end method

.method public final onSuccess()V
    .locals 4

    .line 975
    iget-boolean v0, p0, Ll/ۤۡۢ;->ܽ:Z

    iget-object v1, p0, Ll/ۤۡۢ;->ᩳ:Ll/֡ۚۢ;

    if-eqz v0, :cond_1

    .line 976
    iget-object v0, p0, Ll/ۤۡۢ;->᩷:Ll/ܳۨܽ;

    invoke-virtual {v0, v1}, Ll/ܳۨܽ;->֫(Ll/֡ۚۢ;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    return-void

    .line 980
    :cond_1
    iget-object v0, p0, Ll/ۤۡۢ;->ۧ:Ll/ۜۨܽ;

    iget-object v2, p0, Ll/ۤۡۢ;->ۜ:Ll/ܽ᩺ܽ;

    invoke-interface {v0, v2}, Ll/ۜۨܽ;->֫(Ll/ܽ᩺ܽ;)V

    .line 981
    invoke-virtual {v1}, Ll/֡ۚۢ;->dismiss()V

    .line 1010
    new-instance v0, Ll/ۛۡۢ;

    iget-object v1, p0, Ll/ۤۡۢ;->֫:Ll/ܰۡۢ;

    iget-object v2, p0, Ll/ۤۡۢ;->ܳ:Ll/ۨۧᩳ;

    iget-object v3, p0, Ll/ۤۡۢ;->᩻:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Ll/ۛۡۢ;-><init>(Ll/ܰۡۢ;Ll/ۨۧᩳ;Ljava/lang/String;)V

    .line 1047
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)Z
    .locals 4

    .line 987
    iget-boolean v0, p0, Ll/ۤۡۢ;->ܽ:Z

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ۤۡۢ;->ᩳ:Ll/֡ۚۢ;

    if-eqz v0, :cond_1

    .line 988
    iget-object v0, p0, Ll/ۤۡۢ;->᩷:Ll/ܳۨܽ;

    invoke-virtual {v0, v2}, Ll/ܳۨܽ;->֫(Ll/֡ۚۢ;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v2}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    return v1

    .line 992
    :cond_1
    instance-of v0, p1, Ll/᩸ܿᩳ;

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Ll/᩸ܿᩳ;

    .line 993
    iget-object v0, p0, Ll/ۤۡۢ;->ܿ:Landroid/widget/TextView;

    invoke-static {v0, p1}, Ll/ۡۨܽ;->֫(Landroid/widget/TextView;Ll/᩸ܿᩳ;)V

    .line 994
    invoke-virtual {v2}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/View;->setEnabled(Z)V

    return v1

    :cond_2
    return v3
.end method
