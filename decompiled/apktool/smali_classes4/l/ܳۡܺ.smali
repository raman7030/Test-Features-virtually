.class public abstract Ll/ܳۡܺ;
.super Ll/ܺۡܺ;
.source "SBH2"


# instance fields
.field public final ۗ:Ll/ܰۡܺ;


# direct methods
.method public constructor <init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩸ۡܺ;Ll/᩶ۡܺ;Ll/ܰۡܺ;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ܺۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩸ۡܺ;Ll/᩶ۡܺ;)V

    if-eqz p5, :cond_0

    .line 48
    iput-object p5, p0, Ll/ܳۡܺ;->ۗ:Ll/ܰۡܺ;

    return-void

    .line 45
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "cst == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫(Ll/ܺۡܺ;)Z
    .locals 1

    .line 77
    invoke-super {p0, p1}, Ll/ܺۡܺ;->֫(Ll/ܺۡܺ;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Ll/ܳۡܺ;

    .line 65
    iget-object p1, p1, Ll/ܳۡܺ;->ۗ:Ll/ܰۡܺ;

    .line 78
    iget-object v0, p0, Ll/ܳۡܺ;->ۗ:Ll/ܰۡܺ;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public ᩳ()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Ll/ܳۡܺ;->ۗ:Ll/ܰۡܺ;

    invoke-interface {v0}, Ll/֡ᩴܺ;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩴ()Ll/ܰۡܺ;
    .locals 1

    .line 65
    iget-object v0, p0, Ll/ܳۡܺ;->ۗ:Ll/ܰۡܺ;

    return-object v0
.end method
