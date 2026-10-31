.class public abstract Ll/ۗۚᩴ;
.super Ll/ܶۚᩴ;
.source "AAQM"


# instance fields
.field public ᩶:Z

.field public ᩹:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 847
    invoke-direct {p0, p1}, Ll/ܶۚᩴ;-><init>(I)V

    const/4 p1, -0x1

    .line 843
    iput p1, p0, Ll/ۗۚᩴ;->᩹:I

    const/4 p1, 0x0

    .line 848
    iput-boolean p1, p0, Ll/ۗۚᩴ;->᩶:Z

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 852
    invoke-direct {p0, p1}, Ll/ܶۚᩴ;-><init>(I)V

    .line 853
    iput p2, p0, Ll/ۗۚᩴ;->᩹:I

    const/4 p1, 0x1

    .line 854
    iput-boolean p1, p0, Ll/ۗۚᩴ;->᩶:Z

    return-void
.end method


# virtual methods
.method public final trySplit()Ll/۠ۚᩴ;
    .locals 2

    .line 874
    invoke-super {p0}, Ll/ܶۚᩴ;->trySplit()Ll/۠ۚᩴ;

    move-result-object v0

    .line 875
    iget-boolean v1, p0, Ll/ۗۚᩴ;->᩶:Z

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    .line 876
    invoke-virtual {p0}, Ll/ۗۚᩴ;->ۧ()I

    move-result v1

    iput v1, p0, Ll/ۗۚᩴ;->᩹:I

    const/4 v1, 0x1

    .line 877
    iput-boolean v1, p0, Ll/ۗۚᩴ;->᩶:Z

    :cond_0
    return-object v0
.end method

.method public final bridge synthetic trySplit()Ll/ܶ۫ᩴ;
    .locals 1

    .line 841
    invoke-virtual {p0}, Ll/ۗۚᩴ;->trySplit()Ll/۠ۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 869
    iget-boolean v0, p0, Ll/ۗۚᩴ;->᩶:Z

    if-eqz v0, :cond_0

    iget v0, p0, Ll/ۗۚᩴ;->᩹:I

    return v0

    :cond_0
    invoke-virtual {p0}, Ll/ۗۚᩴ;->ۧ()I

    move-result v0

    return v0
.end method

.method public abstract ۧ()I
.end method
