.class public Ll/᩸ۚᩴ;
.super Ljava/lang/Object;
.source "AAQM"

# interfaces
.implements Ll/۠ۚᩴ;


# instance fields
.field public final ۗ:I

.field public ۙ:I

.field public ᩶:I

.field public final ᩸:[Ljava/lang/Object;

.field public final ᩹:I


# direct methods
.method public constructor <init>(III[Ljava/lang/Object;)V
    .locals 0

    .line 216
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 217
    iput-object p4, p0, Ll/᩸ۚᩴ;->᩸:[Ljava/lang/Object;

    .line 218
    iput p1, p0, Ll/᩸ۚᩴ;->ۗ:I

    .line 219
    iput p2, p0, Ll/᩸ۚᩴ;->ۙ:I

    or-int/lit16 p1, p3, 0x4050

    .line 220
    iput p1, p0, Ll/᩸ۚᩴ;->᩹:I

    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    .line 238
    iget v0, p0, Ll/᩸ۚᩴ;->᩹:I

    return v0
.end method

.method public final estimateSize()J
    .locals 2

    .line 233
    iget v0, p0, Ll/᩸ۚᩴ;->ۙ:I

    iget v1, p0, Ll/᩸ۚᩴ;->᩶:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    return-wide v0
.end method

.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 2

    .line 259
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    :goto_0
    iget v0, p0, Ll/᩸ۚᩴ;->᩶:I

    iget v1, p0, Ll/᩸ۚᩴ;->ۙ:I

    if-ge v0, v1, :cond_0

    .line 262
    iget v1, p0, Ll/᩸ۚᩴ;->ۗ:I

    add-int/2addr v1, v0

    iget-object v0, p0, Ll/᩸ۚᩴ;->᩸:[Ljava/lang/Object;

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 261
    iget v0, p0, Ll/᩸ۚᩴ;->᩶:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩸ۚᩴ;->᩶:I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public synthetic getComparator()Ljava/util/Comparator;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/ۖ۫ᩴ;->$default$getComparator(Ll/ܶ۫ᩴ;)Ljava/util/Comparator;

    move-result-object v0

    return-object v0
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

.method public final tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 2

    .line 225
    iget v0, p0, Ll/᩸ۚᩴ;->᩶:I

    iget v1, p0, Ll/᩸ۚᩴ;->ۙ:I

    if-lt v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 226
    :cond_0
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    iget v0, p0, Ll/᩸ۚᩴ;->᩶:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/᩸ۚᩴ;->᩶:I

    iget v1, p0, Ll/᩸ۚᩴ;->ۗ:I

    add-int/2addr v1, v0

    iget-object v0, p0, Ll/᩸ۚᩴ;->᩸:[Ljava/lang/Object;

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final trySplit()Ll/۠ۚᩴ;
    .locals 4

    .line 247
    iget v0, p0, Ll/᩸ۚᩴ;->᩶:I

    iget v1, p0, Ll/᩸ۚᩴ;->ۙ:I

    sub-int/2addr v1, v0

    const/4 v2, 0x1

    shr-int/2addr v1, v2

    if-gt v1, v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    add-int v2, v0, v1

    .line 250
    iget v3, p0, Ll/᩸ۚᩴ;->ۗ:I

    add-int/2addr v3, v0

    .line 252
    iput v2, p0, Ll/᩸ۚᩴ;->᩶:I

    .line 254
    invoke-virtual {p0, v3, v1}, Ll/᩸ۚᩴ;->֫(II)Ll/᩸ۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic trySplit()Ll/ܶ۫ᩴ;
    .locals 1

    .line 209
    invoke-virtual {p0}, Ll/᩸ۚᩴ;->trySplit()Ll/۠ۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public ֫(II)Ll/᩸ۚᩴ;
    .locals 3

    .line 242
    new-instance v0, Ll/᩸ۚᩴ;

    iget-object v1, p0, Ll/᩸ۚᩴ;->᩸:[Ljava/lang/Object;

    iget v2, p0, Ll/᩸ۚᩴ;->᩹:I

    invoke-direct {v0, p1, p2, v2, v1}, Ll/᩸ۚᩴ;-><init>(III[Ljava/lang/Object;)V

    return-object v0
.end method
