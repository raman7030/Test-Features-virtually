.class public final Ll/ܶܿܺ;
.super Ll/۠ܳܺ;
.source "5BCT"


# instance fields
.field public final ܿ:Z


# direct methods
.method public constructor <init>(Ll/ۤۡܺ;Z)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Ll/۠ܳܺ;-><init>(Ll/ۤۡܺ;)V

    .line 55
    iput-boolean p2, p0, Ll/ܶܿܺ;->ܿ:Z

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(Ll/᩶ۡܺ;)Ll/ۙܿܺ;
    .locals 2

    .line 63
    new-instance p1, Ll/ܶܿܺ;

    invoke-virtual {p0}, Ll/ۙܿܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v0

    const/4 v1, 0x0

    .line 42
    invoke-direct {p1, v0, v1}, Ll/ܶܿܺ;-><init>(Ll/ۤۡܺ;Z)V

    return-object p1
.end method

.method public final ۖ()Z
    .locals 1

    .line 97
    iget-boolean v0, p0, Ll/ܶܿܺ;->ܿ:Z

    return v0
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 1

    const-string v0, "code-address"

    return-object v0
.end method
