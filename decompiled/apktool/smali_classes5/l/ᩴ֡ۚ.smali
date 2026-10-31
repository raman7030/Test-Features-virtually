.class public final Ll/ᩴ֡ۚ;
.super Ll/ۤ֡ۚ;
.source "RBIO"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ll/ۤ֡ۚ;-><init>()V

    .line 16
    iput-object p1, p0, Ll/ۤ֡ۚ;->ۙ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 54
    invoke-super {p0}, Ll/ۨ֡ۚ;->clone()Ll/ۨ֡ۚ;

    move-result-object v0

    check-cast v0, Ll/ᩴ֡ۚ;

    return-object v0
.end method

.method public final clone()Ll/ۨ֡ۚ;
    .locals 1

    .line 54
    invoke-super {p0}, Ll/ۨ֡ۚ;->clone()Ll/ۨ֡ۚ;

    move-result-object v0

    check-cast v0, Ll/ᩴ֡ۚ;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 49
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->ۖ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Appendable;ILl/֡֡ۚ;)V
    .locals 0

    .line 28
    invoke-virtual {p0}, Ll/ۤ֡ۚ;->᩶()Ljava/lang/String;

    move-result-object p2

    .line 42
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method

.method public final ۧ(Ljava/lang/Appendable;ILl/֡֡ۚ;)V
    .locals 0

    return-void
.end method

.method public final ܳ()Ll/ۨ֡ۚ;
    .locals 0

    return-object p0
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 1

    const-string v0, "#data"

    return-object v0
.end method

.method public final bridge synthetic ᩳ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
