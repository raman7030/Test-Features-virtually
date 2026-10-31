.class public final Ll/᩸ۢܺ;
.super Ll/ۘ᩷ܺ;
.source "DBG5"


# instance fields
.field public final ܳ:I

.field public final ܿ:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/۠ۢܺ;IIIII)V
    .locals 7

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    .line 38
    invoke-direct/range {v0 .. v6}, Ll/ۘ᩷ܺ;-><init>(Ll/۠ۢܺ;IIIJ)V

    int-to-short p1, p6

    if-ne p6, p1, :cond_0

    .line 42
    iput p4, p0, Ll/᩸ۢܺ;->ܿ:I

    .line 43
    iput p5, p0, Ll/᩸ۢܺ;->᩻:I

    .line 44
    iput p6, p0, Ll/᩸ۢܺ;->ܳ:I

    return-void

    .line 40
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "protoIndex doesn\'t fit in a short: "

    .line 0
    invoke-static {p6, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 40
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ۘ()S
    .locals 1

    .line 78
    iget v0, p0, Ll/᩸ۢܺ;->ܳ:I

    int-to-short v0, v0

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 54
    iget v0, p0, Ll/᩸ۢܺ;->ܿ:I

    return v0
.end method

.method public final ᩴ()I
    .locals 1

    .line 49
    iget v0, p0, Ll/᩸ۢܺ;->᩻:I

    return v0
.end method
