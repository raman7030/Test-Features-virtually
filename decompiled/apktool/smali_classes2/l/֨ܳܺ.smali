.class public abstract Ll/֨ܳܺ;
.super Ll/ۙܿܺ;
.source "ZBI5"


# direct methods
.method public constructor <init>(Ll/ۤۡܺ;Ll/᩶ۡܺ;)V
    .locals 1

    .line 35
    sget-object v0, Ll/۫ܿܺ;->ᩴᩳ:Ll/۬ܿܺ;

    invoke-direct {p0, v0, p1, p2}, Ll/ۙܿܺ;-><init>(Ll/۬ܿܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬ܿܺ;)Ll/ۙܿܺ;
    .locals 1

    .line 43
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "unsupported"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(I)Ll/ۙܿܺ;
    .locals 1

    .line 51
    invoke-virtual {p0}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/᩶ۡܺ;->ܿ(I)Ll/᩶ۡܺ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۙܿܺ;->֫(Ll/᩶ۡܺ;)Ll/ۙܿܺ;

    move-result-object p1

    return-object p1
.end method
