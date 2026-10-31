.class public final Ll/ۚܳܺ;
.super Ll/ۤܿܺ;
.source "2BA4"


# instance fields
.field public ܿ:Ll/ܶܿܺ;


# direct methods
.method public constructor <init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ll/ܶܿܺ;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2, p3}, Ll/ۙܿܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;)V

    if-eqz p4, :cond_0

    .line 51
    iput-object p4, p0, Ll/ۚܳܺ;->ܿ:Ll/ܶܿܺ;

    return-void

    .line 48
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "target == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Ll/ۚܳܺ;->ܿ:Ll/ܶܿܺ;

    if-nez v0, :cond_0

    const-string v0, "????"

    return-object v0

    .line 138
    :cond_0
    invoke-virtual {v0}, Ll/ۙܿܺ;->ۡ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/۬ܿܺ;)Ll/ۙܿܺ;
    .locals 4

    .line 59
    new-instance v0, Ll/ۚܳܺ;

    invoke-virtual {p0}, Ll/ۙܿܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v1

    invoke-virtual {p0}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v2

    iget-object v3, p0, Ll/ۚܳܺ;->ܿ:Ll/ܶܿܺ;

    invoke-direct {v0, p1, v1, v2, v3}, Ll/ۚܳܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ll/ܶܿܺ;)V

    return-object v0
.end method

.method public final ֫(Ll/᩶ۡܺ;)Ll/ۙܿܺ;
    .locals 4

    .line 67
    new-instance v0, Ll/ۚܳܺ;

    invoke-virtual {p0}, Ll/ۙܿܺ;->᩻()Ll/۬ܿܺ;

    move-result-object v1

    invoke-virtual {p0}, Ll/ۙܿܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v2

    iget-object v3, p0, Ll/ۚܳܺ;->ܿ:Ll/ܶܿܺ;

    invoke-direct {v0, v1, v2, p1, v3}, Ll/ۚܳܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ll/ܶܿܺ;)V

    return-object v0
.end method

.method public final ۖ()Ll/ܶܿܺ;
    .locals 1

    .line 92
    iget-object v0, p0, Ll/ۚܳܺ;->ܿ:Ll/ܶܿܺ;

    return-object v0
.end method

.method public final ۘ()I
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ۚܳܺ;->ܿ:Ll/ܶܿܺ;

    invoke-virtual {v0}, Ll/ۙܿܺ;->ܿ()I

    move-result v0

    return v0
.end method

.method public final ᩴ()I
    .locals 2

    .line 116
    iget-object v0, p0, Ll/ۚܳܺ;->ܿ:Ll/ܶܿܺ;

    invoke-virtual {v0}, Ll/ۙܿܺ;->ܿ()I

    move-result v0

    invoke-virtual {p0}, Ll/ۙܿܺ;->ܿ()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final ᩵()Z
    .locals 1

    .line 126
    invoke-virtual {p0}, Ll/ۙܿܺ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۚܳܺ;->ܿ:Ll/ܶܿܺ;

    invoke-virtual {v0}, Ll/ۙܿܺ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
