.class public abstract Ll/۠ܳܺ;
.super Ll/ۙܿܺ;
.source "HBDI"


# direct methods
.method public constructor <init>(Ll/ۤۡܺ;)V
    .locals 2

    .line 36
    sget-object v0, Ll/۫ܿܺ;->ᩴᩳ:Ll/۬ܿܺ;

    sget-object v1, Ll/᩶ۡܺ;->᩶:Ll/᩶ۡܺ;

    invoke-direct {p0, v0, p1, v1}, Ll/ۙܿܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬ܿܺ;)Ll/ۙܿܺ;
    .locals 1

    .line 60
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "unsupported"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ᩳᩴܺ;)V
    .locals 0

    return-void
.end method

.method public final ۧ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۧ(I)Ll/ۙܿܺ;
    .locals 1

    .line 68
    invoke-virtual {p0}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/᩶ۡܺ;->ܿ(I)Ll/᩶ۡܺ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۙܿܺ;->֫(Ll/᩶ۡܺ;)Ll/ۙܿܺ;

    move-result-object p1

    return-object p1
.end method
