.class public final Ll/ܿܿᩴ;
.super Ljava/lang/Object;
.source "OAQ5"

# interfaces
.implements Ll/ܽܿᩴ;


# instance fields
.field public final ۗ:I

.field public ۙ:I

.field public ᩶:I

.field public final ᩸:[F

.field public final ᩹:I


# direct methods
.method public constructor <init>(III[F)V
    .locals 0

    .line 211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 212
    iput-object p4, p0, Ll/ܿܿᩴ;->᩸:[F

    .line 213
    iput p1, p0, Ll/ܿܿᩴ;->ۗ:I

    .line 214
    iput p2, p0, Ll/ܿܿᩴ;->ۙ:I

    or-int/lit16 p1, p3, 0x4150

    .line 215
    iput p1, p0, Ll/ܿܿᩴ;->᩹:I

    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    .line 233
    iget v0, p0, Ll/ܿܿᩴ;->᩹:I

    return v0
.end method

.method public final estimateSize()J
    .locals 2

    .line 228
    iget v0, p0, Ll/ܿܿᩴ;->ۙ:I

    iget v1, p0, Ll/ܿܿᩴ;->᩶:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    return-wide v0
.end method

.method public final forEachRemaining(Ljava/lang/Object;)V
    .locals 2

    .line 204
    check-cast p1, Ll/ۘᩳᩴ;

    .line 254
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    :goto_0
    iget v0, p0, Ll/ܿܿᩴ;->᩶:I

    iget v1, p0, Ll/ܿܿᩴ;->ۙ:I

    if-ge v0, v1, :cond_0

    .line 257
    iget v1, p0, Ll/ܿܿᩴ;->ۗ:I

    add-int/2addr v1, v0

    iget-object v0, p0, Ll/ܿܿᩴ;->᩸:[F

    aget v0, v0, v1

    invoke-interface {p1, v0}, Ll/ۘᩳᩴ;->֫(F)V

    .line 256
    iget v0, p0, Ll/ܿܿᩴ;->᩶:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܿܿᩴ;->᩶:I

    goto :goto_0

    :cond_0
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
    .locals 2

    .line 204
    check-cast p1, Ll/ۘᩳᩴ;

    .line 220
    iget v0, p0, Ll/ܿܿᩴ;->᩶:I

    iget v1, p0, Ll/ܿܿᩴ;->ۙ:I

    if-lt v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 221
    :cond_0
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    iget v0, p0, Ll/ܿܿᩴ;->᩶:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ܿܿᩴ;->᩶:I

    iget v1, p0, Ll/ܿܿᩴ;->ۗ:I

    add-int/2addr v1, v0

    iget-object v0, p0, Ll/ܿܿᩴ;->᩸:[F

    aget v0, v0, v1

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

    .line 204
    invoke-virtual {p0}, Ll/ܿܿᩴ;->trySplit()Ll/ܽܿᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic trySplit()Ll/ܶ۫ᩴ;
    .locals 1

    .line 204
    invoke-virtual {p0}, Ll/ܿܿᩴ;->trySplit()Ll/ܽܿᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final trySplit()Ll/ܽܿᩴ;
    .locals 5

    .line 242
    iget v0, p0, Ll/ܿܿᩴ;->᩶:I

    iget v1, p0, Ll/ܿܿᩴ;->ۙ:I

    sub-int/2addr v1, v0

    const/4 v2, 0x1

    shr-int/2addr v1, v2

    if-gt v1, v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    add-int v2, v0, v1

    .line 245
    iget v3, p0, Ll/ܿܿᩴ;->ۗ:I

    add-int/2addr v3, v0

    .line 247
    iput v2, p0, Ll/ܿܿᩴ;->᩶:I

    .line 237
    new-instance v0, Ll/ܿܿᩴ;

    iget-object v2, p0, Ll/ܿܿᩴ;->᩸:[F

    iget v4, p0, Ll/ܿܿᩴ;->᩹:I

    invoke-direct {v0, v3, v1, v4, v2}, Ll/ܿܿᩴ;-><init>(III[F)V

    return-object v0
.end method
