.class public final Ll/ۛܰۘ;
.super Ll/᩷ܰۘ;
.source "YCK3"


# instance fields
.field public final synthetic ᩸:Ll/ۨܰۘ;


# direct methods
.method public constructor <init>(Ll/ۨܰۘ;)V
    .locals 0

    .line 631
    iput-object p1, p0, Ll/ۛܰۘ;->᩸:Ll/ۨܰۘ;

    .line 35
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 2

    .line 730
    iget-object v0, p0, Ll/ۛܰۘ;->᩸:Ll/ۨܰۘ;

    const/4 v1, 0x0

    .line 453
    iput v1, v0, Ll/ۨܰۘ;->ۙ:I

    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 639
    new-instance v0, Ll/۫ܰۘ;

    invoke-direct {v0, p0}, Ll/۫ܰۘ;-><init>(Ll/ۛܰۘ;)V

    return-object v0
.end method

.method public final iterator()Ll/ܺۧᩴ;
    .locals 1

    .line 639
    new-instance v0, Ll/۫ܰۘ;

    invoke-direct {v0, p0}, Ll/۫ܰۘ;-><init>(Ll/ۛܰۘ;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 725
    iget-object v0, p0, Ll/ۛܰۘ;->᩸:Ll/ۨܰۘ;

    iget v0, v0, Ll/ۨܰۘ;->ۙ:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ۛܰۘ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 631
    invoke-virtual {p0}, Ll/ۛܰۘ;->spliterator()Ll/ܽܽᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܽܽᩴ;
    .locals 3

    .line 711
    new-instance v0, Ll/ۤܰۘ;

    iget-object v1, p0, Ll/ۛܰۘ;->᩸:Ll/ۨܰۘ;

    iget v1, v1, Ll/ۨܰۘ;->ۙ:I

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Ll/ۤܰۘ;-><init>(Ll/ۛܰۘ;II)V

    return-object v0
.end method

.method public final ֫(Ll/᩻ۧᩴ;)V
    .locals 4

    .line 717
    iget-object v0, p0, Ll/ۛܰۘ;->᩸:Ll/ۨܰۘ;

    iget-object v1, v0, Ll/ۨܰۘ;->ۗ:[C

    .line 718
    iget v0, v0, Ll/ۨܰۘ;->ۙ:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 719
    aget-char v3, v1, v2

    invoke-interface {p1, v3}, Ll/᩻ۧᩴ;->ܽ(C)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ᩻(C)Z
    .locals 3

    .line 463
    iget-object v0, p0, Ll/ۛܰۘ;->᩸:Ll/ۨܰۘ;

    iget-object v1, v0, Ll/ۨܰۘ;->ۗ:[C

    .line 464
    iget v0, v0, Ll/ۨܰۘ;->ۙ:I

    :goto_0
    add-int/lit8 v2, v0, -0x1

    if-eqz v0, :cond_1

    aget-char v0, v1, v2

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
