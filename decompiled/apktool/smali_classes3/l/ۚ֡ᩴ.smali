.class public final Ll/ۚ֡ᩴ;
.super Ljava/lang/Object;
.source "21EP"

# interfaces
.implements Ll/۠ۚᩴ;


# instance fields
.field public final synthetic ۙ:Ll/֨֡ᩴ;

.field public ᩶:I

.field public ᩸:Z

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/֨֡ᩴ;)V
    .locals 2

    const/4 v0, 0x0

    .line 263
    iget v1, p1, Ll/֨֡ᩴ;->᩹:I

    invoke-direct {p0, p1, v0, v1, v0}, Ll/ۚ֡ᩴ;-><init>(Ll/֨֡ᩴ;IIZ)V

    return-void
.end method

.method public constructor <init>(Ll/֨֡ᩴ;IIZ)V
    .locals 0

    .line 266
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ֡ᩴ;->ۙ:Ll/֨֡ᩴ;

    .line 268
    iput p2, p0, Ll/ۚ֡ᩴ;->᩶:I

    .line 269
    iput p3, p0, Ll/ۚ֡ᩴ;->᩹:I

    .line 270
    iput-boolean p4, p0, Ll/ۚ֡ᩴ;->᩸:Z

    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    const/16 v0, 0x4051

    return v0
.end method

.method public final estimateSize()J
    .locals 2

    .line 274
    iget-boolean v0, p0, Ll/ۚ֡ᩴ;->᩸:Z

    if-eqz v0, :cond_0

    iget v0, p0, Ll/ۚ֡ᩴ;->᩹:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/ۚ֡ᩴ;->ۙ:Ll/֨֡ᩴ;

    iget v0, v0, Ll/֨֡ᩴ;->᩹:I

    .line 284
    :goto_0
    iget v1, p0, Ll/ۚ֡ᩴ;->᩶:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    return-wide v0
.end method

.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 3

    .line 298
    iget-object v0, p0, Ll/ۚ֡ᩴ;->ۙ:Ll/֨֡ᩴ;

    iget-object v1, v0, Ll/֨֡ᩴ;->᩸:[Ljava/lang/Object;

    .line 274
    iget-boolean v2, p0, Ll/ۚ֡ᩴ;->᩸:Z

    if-eqz v2, :cond_0

    iget v0, p0, Ll/ۚ֡ᩴ;->᩹:I

    goto :goto_0

    :cond_0
    iget v0, v0, Ll/֨֡ᩴ;->᩹:I

    .line 299
    :goto_0
    iget v2, p0, Ll/ۚ֡ᩴ;->᩶:I

    if-ge v2, v0, :cond_1

    .line 300
    aget-object v2, v1, v2

    invoke-interface {p1, v2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 299
    iget v2, p0, Ll/ۚ֡ᩴ;->᩶:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/ۚ֡ᩴ;->᩶:I

    goto :goto_0

    :cond_1
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
    .locals 3

    .line 290
    iget v0, p0, Ll/ۚ֡ᩴ;->᩶:I

    .line 274
    iget-boolean v1, p0, Ll/ۚ֡ᩴ;->᩸:Z

    iget-object v2, p0, Ll/ۚ֡ᩴ;->ۙ:Ll/֨֡ᩴ;

    if-eqz v1, :cond_0

    iget v1, p0, Ll/ۚ֡ᩴ;->᩹:I

    goto :goto_0

    :cond_0
    iget v1, v2, Ll/֨֡ᩴ;->᩹:I

    :goto_0
    if-lt v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    .line 291
    :cond_1
    iget-object v1, v2, Ll/֨֡ᩴ;->᩸:[Ljava/lang/Object;

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/ۚ֡ᩴ;->᩶:I

    aget-object v0, v1, v0

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final trySplit()Ll/ܶ۫ᩴ;
    .locals 5

    .line 274
    iget-boolean v0, p0, Ll/ۚ֡ᩴ;->᩸:Z

    iget-object v1, p0, Ll/ۚ֡ᩴ;->ۙ:Ll/֨֡ᩴ;

    if-eqz v0, :cond_0

    iget v0, p0, Ll/ۚ֡ᩴ;->᩹:I

    goto :goto_0

    :cond_0
    iget v0, v1, Ll/֨֡ᩴ;->᩹:I

    .line 322
    :goto_0
    iget v2, p0, Ll/ۚ֡ᩴ;->᩶:I

    sub-int v3, v0, v2

    const/4 v4, 0x1

    shr-int/2addr v3, v4

    if-gt v3, v4, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    .line 325
    :cond_1
    iput v0, p0, Ll/ۚ֡ᩴ;->᩹:I

    add-int/2addr v3, v2

    .line 329
    iput v3, p0, Ll/ۚ֡ᩴ;->᩶:I

    .line 330
    iput-boolean v4, p0, Ll/ۚ֡ᩴ;->᩸:Z

    .line 331
    new-instance v0, Ll/ۚ֡ᩴ;

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ۚ֡ᩴ;-><init>(Ll/֨֡ᩴ;IIZ)V

    :goto_1
    return-object v0
.end method
