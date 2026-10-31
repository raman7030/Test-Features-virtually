.class public Ll/֨۟ۘ;
.super Ll/᩹۟ۘ;
.source "5SO"


# instance fields
.field public final synthetic ۬:Ll/᩸۟ۘ;


# direct methods
.method public constructor <init>(Ll/᩸۟ۘ;)V
    .locals 1

    .line 1642
    iput-object p1, p0, Ll/֨۟ۘ;->۬:Ll/᩸۟ۘ;

    iget-object v0, p1, Ll/᩸۟ۘ;->ۗ:Ll/ۙ۟ۘ;

    invoke-direct {p0, v0}, Ll/᩹۟ۘ;-><init>(Ll/ۙ۟ۘ;)V

    .line 1643
    invoke-virtual {p1}, Ll/᩸۟ۘ;->firstEntry()Ll/ۡ۟ۘ;

    move-result-object p1

    iput-object p1, p0, Ll/᩹۟ۘ;->᩶:Ll/ۡ۟ۘ;

    return-void
.end method


# virtual methods
.method public final ܽ()V
    .locals 3

    .line 1669
    iget-object v0, p0, Ll/᩹۟ۘ;->᩶:Ll/ۡ۟ۘ;

    invoke-virtual {v0}, Ll/ۡ۟ۘ;->ᩳ()Ll/ۡ۟ۘ;

    move-result-object v0

    iput-object v0, p0, Ll/᩹۟ۘ;->᩶:Ll/ۡ۟ۘ;

    .line 1670
    iget-object v1, p0, Ll/֨۟ۘ;->۬:Ll/᩸۟ۘ;

    iget-boolean v2, v1, Ll/᩸۟ۘ;->۫:Z

    if-nez v2, :cond_0

    if-eqz v0, :cond_0

    iget-char v0, v0, Ll/ܿܰۘ;->᩸:C

    iget-char v1, v1, Ll/᩸۟ۘ;->۬:C

    .line 191
    invoke-static {v0, v1}, Ljava/lang/Character;->compare(CC)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x0

    .line 1670
    iput-object v0, p0, Ll/᩹۟ۘ;->᩶:Ll/ۡ۟ۘ;

    :cond_0
    return-void
.end method

.method public final ᩳ()V
    .locals 3

    .line 1663
    iget-object v0, p0, Ll/᩹۟ۘ;->ۙ:Ll/ۡ۟ۘ;

    invoke-virtual {v0}, Ll/ۡ۟ۘ;->ۜ()Ll/ۡ۟ۘ;

    move-result-object v0

    iput-object v0, p0, Ll/᩹۟ۘ;->ۙ:Ll/ۡ۟ۘ;

    .line 1664
    iget-object v1, p0, Ll/֨۟ۘ;->۬:Ll/᩸۟ۘ;

    iget-boolean v2, v1, Ll/᩸۟ۘ;->᩸:Z

    if-nez v2, :cond_0

    if-eqz v0, :cond_0

    iget-char v0, v0, Ll/ܿܰۘ;->᩸:C

    iget-char v1, v1, Ll/᩸۟ۘ;->᩶:C

    .line 191
    invoke-static {v0, v1}, Ljava/lang/Character;->compare(CC)I

    move-result v0

    if-gez v0, :cond_0

    const/4 v0, 0x0

    .line 1664
    iput-object v0, p0, Ll/᩹۟ۘ;->ۙ:Ll/ۡ۟ۘ;

    :cond_0
    return-void
.end method
