.class public final Ll/֡᩷ܺ;
.super Ll/ۘ᩷ܺ;
.source "NBEI"


# instance fields
.field public final ۜ:I

.field public final ܳ:I

.field public final ܿ:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/۠ۢܺ;IIIIII)V
    .locals 7

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    .line 51
    invoke-direct/range {v0 .. v6}, Ll/ۘ᩷ܺ;-><init>(Ll/۠ۢܺ;IIIJ)V

    .line 53
    iput p4, p0, Ll/֡᩷ܺ;->ܿ:I

    .line 54
    iput p5, p0, Ll/֡᩷ܺ;->ܳ:I

    .line 55
    iput p6, p0, Ll/֡᩷ܺ;->᩻:I

    .line 56
    iput p7, p0, Ll/֡᩷ܺ;->ۜ:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 72
    iget v0, p0, Ll/֡᩷ܺ;->ܿ:I

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 80
    iget v0, p0, Ll/֡᩷ܺ;->ܳ:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 88
    iget v0, p0, Ll/֡᩷ܺ;->᩻:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 96
    iget v0, p0, Ll/֡᩷ܺ;->ۜ:I

    return v0
.end method

.method public final ᩴ()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method
