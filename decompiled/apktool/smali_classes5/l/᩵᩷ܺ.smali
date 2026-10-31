.class public final Ll/᩵᩷ܺ;
.super Ll/ۘ᩷ܺ;
.source "FBAO"


# instance fields
.field public final ۜ:I

.field public final ܳ:I

.field public final ܿ:I

.field public final ᩷:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/۠ۢܺ;IIIIIII)V
    .locals 7

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    .line 56
    invoke-direct/range {v0 .. v6}, Ll/ۘ᩷ܺ;-><init>(Ll/۠ۢܺ;IIIJ)V

    .line 58
    iput p4, p0, Ll/᩵᩷ܺ;->ܿ:I

    .line 59
    iput p5, p0, Ll/᩵᩷ܺ;->ܳ:I

    .line 60
    iput p6, p0, Ll/᩵᩷ܺ;->᩻:I

    .line 61
    iput p7, p0, Ll/᩵᩷ܺ;->ۜ:I

    .line 62
    iput p8, p0, Ll/᩵᩷ܺ;->᩷:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 78
    iget v0, p0, Ll/᩵᩷ܺ;->ܿ:I

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 86
    iget v0, p0, Ll/᩵᩷ܺ;->ܳ:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 94
    iget v0, p0, Ll/᩵᩷ܺ;->᩻:I

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 110
    iget v0, p0, Ll/᩵᩷ܺ;->᩷:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 102
    iget v0, p0, Ll/᩵᩷ܺ;->ۜ:I

    return v0
.end method

.method public final ᩴ()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method
