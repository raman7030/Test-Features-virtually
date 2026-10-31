.class public Ll/۫᩷ᩴ;
.super Ll/᩺᩷ᩴ;
.source "X5U"


# instance fields
.field public final synthetic ۬:Ll/ۨ᩷ᩴ;


# direct methods
.method public constructor <init>(Ll/ۨ᩷ᩴ;)V
    .locals 1

    .line 1585
    iput-object p1, p0, Ll/۫᩷ᩴ;->۬:Ll/ۨ᩷ᩴ;

    iget-object v0, p1, Ll/ۨ᩷ᩴ;->ۗ:Ll/۟᩷ᩴ;

    invoke-direct {p0, v0}, Ll/᩺᩷ᩴ;-><init>(Ll/۟᩷ᩴ;)V

    .line 1586
    invoke-virtual {p1}, Ll/ۨ᩷ᩴ;->firstEntry()Ll/۠᩷ᩴ;

    move-result-object p1

    iput-object p1, p0, Ll/᩺᩷ᩴ;->᩶:Ll/۠᩷ᩴ;

    return-void
.end method


# virtual methods
.method public final ܽ()V
    .locals 3

    .line 1612
    iget-object v0, p0, Ll/᩺᩷ᩴ;->᩶:Ll/۠᩷ᩴ;

    invoke-virtual {v0}, Ll/۠᩷ᩴ;->ܳ()Ll/۠᩷ᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/᩺᩷ᩴ;->᩶:Ll/۠᩷ᩴ;

    .line 1613
    iget-object v1, p0, Ll/۫᩷ᩴ;->۬:Ll/ۨ᩷ᩴ;

    iget-boolean v2, v1, Ll/ۨ᩷ᩴ;->۫:Z

    if-nez v2, :cond_0

    if-eqz v0, :cond_0

    iget v0, v0, Ll/ۚܿᩴ;->᩸:I

    iget v1, v1, Ll/ۨ᩷ᩴ;->۬:I

    .line 192
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x0

    .line 1613
    iput-object v0, p0, Ll/᩺᩷ᩴ;->᩶:Ll/۠᩷ᩴ;

    :cond_0
    return-void
.end method

.method public final ᩳ()V
    .locals 3

    .line 1606
    iget-object v0, p0, Ll/᩺᩷ᩴ;->ۙ:Ll/۠᩷ᩴ;

    invoke-virtual {v0}, Ll/۠᩷ᩴ;->ۖ()Ll/۠᩷ᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/᩺᩷ᩴ;->ۙ:Ll/۠᩷ᩴ;

    .line 1607
    iget-object v1, p0, Ll/۫᩷ᩴ;->۬:Ll/ۨ᩷ᩴ;

    iget-boolean v2, v1, Ll/ۨ᩷ᩴ;->᩸:Z

    if-nez v2, :cond_0

    if-eqz v0, :cond_0

    iget v0, v0, Ll/ۚܿᩴ;->᩸:I

    iget v1, v1, Ll/ۨ᩷ᩴ;->᩶:I

    .line 192
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-gez v0, :cond_0

    const/4 v0, 0x0

    .line 1607
    iput-object v0, p0, Ll/᩺᩷ᩴ;->ۙ:Ll/۠᩷ᩴ;

    :cond_0
    return-void
.end method
