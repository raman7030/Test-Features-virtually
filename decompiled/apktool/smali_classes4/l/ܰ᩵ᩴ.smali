.class public final Ll/ܰ᩵ᩴ;
.super Ll/᩻֡ᩴ;
.source "DD2"

# interfaces
.implements Ll/۠ۚᩴ;


# instance fields
.field public final synthetic ۫:Ll/ۢ֡ᩴ;


# direct methods
.method public constructor <init>(Ll/ۢ֡ᩴ;)V
    .locals 0

    .line 916
    iput-object p1, p0, Ll/ܰ᩵ᩴ;->۫:Ll/ۢ֡ᩴ;

    invoke-direct {p0, p1}, Ll/᩻֡ᩴ;-><init>(Ll/ۢ֡ᩴ;)V

    return-void
.end method

.method public constructor <init>(Ll/ۢ֡ᩴ;IIZ)V
    .locals 0

    .line 919
    iput-object p1, p0, Ll/ܰ᩵ᩴ;->۫:Ll/ۢ֡ᩴ;

    .line 920
    invoke-direct {p0, p1, p2, p3, p4}, Ll/᩻֡ᩴ;-><init>(Ll/ۢ֡ᩴ;IIZ)V

    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    .line 925
    iget-boolean v0, p0, Ll/᩻֡ᩴ;->᩹:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/16 v0, 0x41

    return v0
.end method

.method public synthetic getComparator()Ljava/util/Comparator;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/ۖ۫ᩴ;->$default$getComparator(Ll/ܶ۫ᩴ;)Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public synthetic getExactSizeIfKnown()J
    .locals 2

    .line 0
    invoke-static {p0}, Ll/ۖ۫ᩴ;->$default$getExactSizeIfKnown(Ll/ܶ۫ᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic hasCharacteristics(I)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۖ۫ᩴ;->$default$hasCharacteristics(Ll/ܶ۫ᩴ;I)Z

    move-result p1

    return p1
.end method

.method public final ֫(IIZ)Ll/᩻֡ᩴ;
    .locals 2

    .line 935
    new-instance v0, Ll/ܰ᩵ᩴ;

    iget-object v1, p0, Ll/ܰ᩵ᩴ;->۫:Ll/ۢ֡ᩴ;

    invoke-direct {v0, v1, p1, p2, p3}, Ll/ܰ᩵ᩴ;-><init>(Ll/ۢ֡ᩴ;IIZ)V

    return-object v0
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 2

    .line 913
    check-cast p2, Ljava/util/function/Consumer;

    .line 930
    new-instance v0, Ll/ᩳ֡ᩴ;

    iget-object v1, p0, Ll/ܰ᩵ᩴ;->۫:Ll/ۢ֡ᩴ;

    invoke-direct {v0, v1, p1}, Ll/ᩳ֡ᩴ;-><init>(Ll/ۢ֡ᩴ;I)V

    invoke-interface {p2, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method
