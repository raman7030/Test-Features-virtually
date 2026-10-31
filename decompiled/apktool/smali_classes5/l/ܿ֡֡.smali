.class public final Ll/ܿ֡֡;
.super Ll/ۡ֨֡;
.source "4900"


# instance fields
.field public final ֫:Ll/᩵ۚ֡;

.field public ۧ:I

.field public ܽ:Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ll/᩵ۚ֡;

    invoke-direct {v0}, Ll/᩵ۚ֡;-><init>()V

    iput-object v0, p0, Ll/ܿ֡֡;->֫:Ll/᩵ۚ֡;

    .line 24
    iput p1, p0, Ll/ܿ֡֡;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩵֨֡;)Ll/ܳ᩵֡;
    .locals 3

    .line 56
    invoke-interface {p1}, Ll/᩵֨֡;->֫()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 57
    iget-object v0, p0, Ll/ܿ֡֡;->֫:Ll/᩵ۚ֡;

    invoke-virtual {v0}, Ll/֡ۚ֡;->֫()Ll/֡ۚ֡;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 61
    :cond_0
    invoke-interface {p1}, Ll/᩵֨֡;->ܿ()Ll/ۖ֨֡;

    move-result-object v0

    invoke-interface {v0}, Ll/ۖ֨֡;->ܿ()Ll/ۨ֡֡;

    move-result-object v0

    .line 64
    instance-of v2, v0, Ll/᩸ۚ֡;

    if-nez v2, :cond_1

    instance-of v0, v0, Ll/᩵ۚ֡;

    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    iput-boolean v1, p0, Ll/ܿ֡֡;->ܽ:Z

    .line 65
    invoke-interface {p1}, Ll/᩵֨֡;->ᩳ()I

    move-result p1

    invoke-static {p1}, Ll/ܳ᩵֡;->֫(I)Ll/ܳ᩵֡;

    move-result-object p1

    return-object p1

    .line 69
    :cond_3
    invoke-interface {p1}, Ll/᩵֨֡;->ܽ()I

    move-result v0

    iget v2, p0, Ll/ܿ֡֡;->ۧ:I

    if-lt v0, v2, :cond_4

    .line 70
    invoke-interface {p1}, Ll/᩵֨֡;->ۧ()I

    move-result p1

    add-int/2addr p1, v2

    .line 19
    new-instance v0, Ll/ܳ᩵֡;

    const/4 v2, -0x1

    invoke-direct {v0, v2, p1, v1}, Ll/ܳ᩵֡;-><init>(IIZ)V

    return-object v0

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ۨ֡֡;)Z
    .locals 1

    .line 36
    iget-boolean p1, p0, Ll/ܿ֡֡;->ܽ:Z

    if-eqz p1, :cond_0

    .line 41
    iget-object p1, p0, Ll/ܿ֡֡;->֫:Ll/᩵ۚ֡;

    invoke-virtual {p1}, Ll/ۨ֡֡;->ᩳ()Ll/ۨ֡֡;

    move-result-object p1

    .line 42
    instance-of v0, p1, Ll/ᩴۚ֡;

    if-eqz v0, :cond_0

    .line 43
    check-cast p1, Ll/ᩴۚ֡;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ᩴۚ֡;->֫(Z)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ܳ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܿ()Ll/ۨ֡֡;
    .locals 1

    .line 51
    iget-object v0, p0, Ll/ܿ֡֡;->֫:Ll/᩵ۚ֡;

    return-object v0
.end method
