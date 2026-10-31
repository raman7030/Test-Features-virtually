.class public final Ll/ܿܳܺ;
.super Ll/֨ܳܺ;
.source "OB9P"


# direct methods
.method public constructor <init>(Ll/ۤۡܺ;)V
    .locals 1

    .line 38
    sget-object v0, Ll/᩶ۡܺ;->᩶:Ll/᩶ۡܺ;

    invoke-direct {p0, p1, v0}, Ll/֨ܳܺ;-><init>(Ll/ۤۡܺ;Ll/᩶ۡܺ;)V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(Ll/᩶ۡܺ;)Ll/ۙܿܺ;
    .locals 1

    .line 64
    new-instance p1, Ll/ܿܳܺ;

    invoke-virtual {p0}, Ll/ۙܿܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/ܿܳܺ;-><init>(Ll/ۤۡܺ;)V

    return-object p1
.end method

.method public final ֫(Ll/ᩳᩴܺ;)V
    .locals 1

    .line 54
    invoke-virtual {p0}, Ll/ܿܳܺ;->ۧ()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 55
    invoke-static {v0, v0}, Ll/ۨܿܺ;->֫(II)S

    move-result v0

    invoke-virtual {p1, v0}, Ll/ᩳᩴܺ;->ܳ(I)V

    :cond_0
    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 46
    invoke-virtual {p0}, Ll/ۙܿܺ;->ܿ()I

    move-result v0

    and-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 1

    .line 80
    invoke-virtual {p0}, Ll/ܿܳܺ;->ۧ()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const-string v0, "nop // spacer"

    return-object v0
.end method
