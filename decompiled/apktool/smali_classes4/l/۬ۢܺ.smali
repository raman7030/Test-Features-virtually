.class public final Ll/۬ۢܺ;
.super Ll/ۘ᩷ܺ;
.source "8BGM"


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

    .line 46
    invoke-direct/range {v0 .. v6}, Ll/ۘ᩷ܺ;-><init>(Ll/۠ۢܺ;IIIJ)V

    .line 48
    iput p4, p0, Ll/۬ۢܺ;->ܿ:I

    .line 49
    iput p5, p0, Ll/۬ۢܺ;->ܳ:I

    .line 50
    iput p6, p0, Ll/۬ۢܺ;->᩻:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 66
    iget v0, p0, Ll/۬ۢܺ;->ܿ:I

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 74
    iget v0, p0, Ll/۬ۢܺ;->ܳ:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 82
    iget v0, p0, Ll/۬ۢܺ;->᩻:I

    return v0
.end method

.method public final ᩴ()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method
