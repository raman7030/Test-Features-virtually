.class public final Ll/ۙܽᩴ;
.super Ljava/lang/Object;
.source "HBSC"

# interfaces
.implements Ll/ܽܿᩴ;


# instance fields
.field public final synthetic ۙ:Ll/ۤܽᩴ;

.field public ᩶:I

.field public ᩸:Z

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ۤܽᩴ;)V
    .locals 2

    const/4 v0, 0x0

    .line 841
    iget v1, p1, Ll/ۤܽᩴ;->᩹:I

    invoke-direct {p0, p1, v0, v1, v0}, Ll/ۙܽᩴ;-><init>(Ll/ۤܽᩴ;IIZ)V

    return-void
.end method

.method public constructor <init>(Ll/ۤܽᩴ;IIZ)V
    .locals 0

    .line 844
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙܽᩴ;->ۙ:Ll/ۤܽᩴ;

    .line 846
    iput p2, p0, Ll/ۙܽᩴ;->᩶:I

    .line 847
    iput p3, p0, Ll/ۙܽᩴ;->᩹:I

    .line 848
    iput-boolean p4, p0, Ll/ۙܽᩴ;->᩸:Z

    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    const/16 v0, 0x4150

    return v0
.end method

.method public final estimateSize()J
    .locals 2

    .line 852
    iget-boolean v0, p0, Ll/ۙܽᩴ;->᩸:Z

    if-eqz v0, :cond_0

    iget v0, p0, Ll/ۙܽᩴ;->᩹:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/ۙܽᩴ;->ۙ:Ll/ۤܽᩴ;

    iget v0, v0, Ll/ۤܽᩴ;->᩹:I

    .line 862
    :goto_0
    iget v1, p0, Ll/ۙܽᩴ;->᩶:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    return-wide v0
.end method

.method public final forEachRemaining(Ljava/lang/Object;)V
    .locals 3

    .line 833
    check-cast p1, Ll/ۘᩳᩴ;

    .line 874
    iget-object v0, p0, Ll/ۙܽᩴ;->ۙ:Ll/ۤܽᩴ;

    iget-object v1, v0, Ll/ۤܽᩴ;->᩸:[F

    .line 852
    iget-boolean v2, p0, Ll/ۙܽᩴ;->᩸:Z

    if-eqz v2, :cond_0

    iget v0, p0, Ll/ۙܽᩴ;->᩹:I

    goto :goto_0

    :cond_0
    iget v0, v0, Ll/ۤܽᩴ;->᩹:I

    .line 875
    :goto_0
    iget v2, p0, Ll/ۙܽᩴ;->᩶:I

    if-ge v2, v0, :cond_1

    .line 876
    aget v2, v1, v2

    invoke-interface {p1, v2}, Ll/ۘᩳᩴ;->֫(F)V

    .line 875
    iget v2, p0, Ll/ۙܽᩴ;->᩶:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/ۙܽᩴ;->᩶:I

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۧܿᩴ;->֫(Ll/ܽܿᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final getComparator()Ljava/util/Comparator;
    .locals 1

    .line 103
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public synthetic getExactSizeIfKnown()J
    .locals 2

    .line 0
    invoke-static {p0}, Ll/ۖ۫ᩴ;->$default$getExactSizeIfKnown(Ll/ܶ۫ᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic hasCharacteristics(I)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۖ۫ᩴ;->$default$hasCharacteristics(Ll/ܶ۫ᩴ;I)Z

    move-result p1

    return p1
.end method

.method public final tryAdvance(Ljava/lang/Object;)Z
    .locals 3

    .line 833
    check-cast p1, Ll/ۘᩳᩴ;

    .line 867
    iget v0, p0, Ll/ۙܽᩴ;->᩶:I

    .line 852
    iget-boolean v1, p0, Ll/ۙܽᩴ;->᩸:Z

    iget-object v2, p0, Ll/ۙܽᩴ;->ۙ:Ll/ۤܽᩴ;

    if-eqz v1, :cond_0

    iget v1, p0, Ll/ۙܽᩴ;->᩹:I

    goto :goto_0

    :cond_0
    iget v1, v2, Ll/ۤܽᩴ;->᩹:I

    :goto_0
    if-lt v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    .line 868
    :cond_1
    iget-object v1, v2, Ll/ۤܽᩴ;->᩸:[F

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/ۙܽᩴ;->᩶:I

    aget v0, v1, v0

    invoke-interface {p1, v0}, Ll/ۘᩳᩴ;->֫(F)V

    const/4 p1, 0x1

    return p1
.end method

.method public final synthetic tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۧܿᩴ;->ۧ(Ll/ܽܿᩴ;Ljava/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic trySplit()Ll/֨۫ᩴ;
    .locals 1

    .line 833
    invoke-virtual {p0}, Ll/ۙܽᩴ;->trySplit()Ll/ܽܿᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic trySplit()Ll/ܶ۫ᩴ;
    .locals 1

    .line 833
    invoke-virtual {p0}, Ll/ۙܽᩴ;->trySplit()Ll/ܽܿᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final trySplit()Ll/ܽܿᩴ;
    .locals 5

    .line 852
    iget-boolean v0, p0, Ll/ۙܽᩴ;->᩸:Z

    iget-object v1, p0, Ll/ۙܽᩴ;->ۙ:Ll/ۤܽᩴ;

    if-eqz v0, :cond_0

    iget v0, p0, Ll/ۙܽᩴ;->᩹:I

    goto :goto_0

    :cond_0
    iget v0, v1, Ll/ۤܽᩴ;->᩹:I

    .line 898
    :goto_0
    iget v2, p0, Ll/ۙܽᩴ;->᩶:I

    sub-int v3, v0, v2

    const/4 v4, 0x1

    shr-int/2addr v3, v4

    if-gt v3, v4, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 901
    :cond_1
    iput v0, p0, Ll/ۙܽᩴ;->᩹:I

    add-int/2addr v3, v2

    .line 905
    iput v3, p0, Ll/ۙܽᩴ;->᩶:I

    .line 906
    iput-boolean v4, p0, Ll/ۙܽᩴ;->᩸:Z

    .line 907
    new-instance v0, Ll/ۙܽᩴ;

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ۙܽᩴ;-><init>(Ll/ۤܽᩴ;IIZ)V

    return-object v0
.end method
