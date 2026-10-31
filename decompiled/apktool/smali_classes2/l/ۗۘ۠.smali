.class public Ll/ۗۘ۠;
.super Ll/۫ۘ۠;
.source "J7QN"


# instance fields
.field public final ۡ:I

.field public ۢ:I


# direct methods
.method public constructor <init>(Ll/ۘۘ۠;[CI)V
    .locals 1

    .line 592
    array-length v0, p2

    invoke-direct {p0, p1, p2, v0}, Ll/۫ۘ۠;-><init>(Ll/ۘۘ۠;[CI)V

    .line 593
    iput p3, p0, Ll/ۗۘ۠;->ۡ:I

    const/4 p1, 0x0

    .line 594
    iput p1, p0, Ll/ۗۘ۠;->ۢ:I

    return-void
.end method


# virtual methods
.method public final ۜ()C
    .locals 1

    .line 604
    invoke-super {p0}, Ll/۫ۘ۠;->ۜ()C

    const/16 v0, 0xa

    .line 380
    invoke-virtual {p0, v0}, Ll/۫ۘ۠;->ܽ(C)Z

    move-result v0

    if-nez v0, :cond_2

    const/16 v0, 0xd

    invoke-virtual {p0, v0}, Ll/۫ۘ۠;->ܽ(C)Z

    move-result v0

    if-nez v0, :cond_2

    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Ll/۫ۘ۠;->ܽ(C)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x9

    .line 608
    invoke-virtual {p0, v0}, Ll/۫ۘ۠;->ܽ(C)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 609
    iget v0, p0, Ll/ۗۘ۠;->ۢ:I

    .line 75
    div-int/lit8 v0, v0, 0x8

    mul-int/lit8 v0, v0, 0x8

    add-int/lit8 v0, v0, 0x8

    .line 609
    iput v0, p0, Ll/ۗۘ۠;->ۢ:I

    goto :goto_1

    .line 611
    :cond_1
    iget v0, p0, Ll/ۗۘ۠;->ۢ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۗۘ۠;->ۢ:I

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 607
    iput v0, p0, Ll/ۗۘ۠;->ۢ:I

    .line 614
    :goto_1
    invoke-virtual {p0}, Ll/۫ۘ۠;->֫()C

    move-result v0

    return v0
.end method

.method public final ۡ()I
    .locals 2

    .line 632
    invoke-virtual {p0}, Ll/۫ۘ۠;->᩷()I

    move-result v0

    iget v1, p0, Ll/ۗۘ۠;->ۡ:I

    add-int/2addr v0, v1

    return v0
.end method
