.class public final Ll/ۘܳۘ;
.super Ll/ۛܿۘ;
.source "A1NH"


# instance fields
.field public final ܳ:I

.field public final ܽ:I

.field public final ܿ:Ll/ۜܳۘ;

.field public final ᩳ:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/ۜܳۘ;IIII)V
    .locals 2

    sub-int v0, p3, p2

    sub-int v1, p5, p4

    .line 33
    invoke-direct {p0, v0, v1}, Ll/ۛܿۘ;-><init>(II)V

    .line 34
    iput-object p1, p0, Ll/ۘܳۘ;->ܿ:Ll/ۜܳۘ;

    .line 35
    iput p2, p0, Ll/ۘܳۘ;->ܳ:I

    .line 36
    iput p4, p0, Ll/ۘܳۘ;->᩻:I

    .line 37
    iput p3, p0, Ll/ۘܳۘ;->ܽ:I

    .line 38
    iput p5, p0, Ll/ۘܳۘ;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final ᩻()Ll/۬ܿۘ;
    .locals 7

    .line 44
    new-instance v6, Ll/ۖܳۘ;

    iget v4, p0, Ll/ۘܳۘ;->᩻:I

    iget v5, p0, Ll/ۘܳۘ;->ᩳ:I

    iget-object v1, p0, Ll/ۘܳۘ;->ܿ:Ll/ۜܳۘ;

    iget v2, p0, Ll/ۘܳۘ;->ܳ:I

    iget v3, p0, Ll/ۘܳۘ;->ܽ:I

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ۖܳۘ;-><init>(Ll/ۜܳۘ;IIII)V

    return-object v6
.end method
