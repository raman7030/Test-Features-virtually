.class public abstract Ll/۠ۘᩴ;
.super Ll/᩺ܺᩴ;
.source "DAOW"


# instance fields
.field public ᩸:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 711
    iput p1, p0, Ll/۠ۘᩴ;->᩸:I

    return-void
.end method


# virtual methods
.method public characteristics()I
    .locals 1

    const/16 v0, 0x4150

    return v0
.end method

.method public final estimateSize()J
    .locals 4

    .line 814
    invoke-virtual {p0}, Ll/۠ۘᩴ;->֫()I

    move-result v0

    int-to-long v0, v0

    iget v2, p0, Ll/۠ۘᩴ;->᩸:I

    int-to-long v2, v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public forEachRemaining(Ljava/util/function/LongConsumer;)V
    .locals 3

    .line 826
    invoke-virtual {p0}, Ll/۠ۘᩴ;->֫()I

    move-result v0

    :goto_0
    iget v1, p0, Ll/۠ۘᩴ;->᩸:I

    if-ge v1, v0, :cond_0

    .line 827
    invoke-virtual {p0, v1}, Ll/۠ۘᩴ;->֫(I)J

    move-result-wide v1

    invoke-interface {p1, v1, v2}, Ljava/util/function/LongConsumer;->accept(J)V

    .line 826
    iget v1, p0, Ll/۠ۘᩴ;->᩸:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/۠ۘᩴ;->᩸:I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public tryAdvance(Ljava/util/function/LongConsumer;)Z
    .locals 2

    .line 819
    iget v0, p0, Ll/۠ۘᩴ;->᩸:I

    invoke-virtual {p0}, Ll/۠ۘᩴ;->֫()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 820
    :cond_0
    iget v0, p0, Ll/۠ۘᩴ;->᩸:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/۠ۘᩴ;->᩸:I

    invoke-virtual {p0, v0}, Ll/۠ۘᩴ;->֫(I)J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Ljava/util/function/LongConsumer;->accept(J)V

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic trySplit()Ll/֡۫ᩴ;
    .locals 1

    .line 696
    invoke-virtual {p0}, Ll/۠ۘᩴ;->trySplit()Ll/֨ۘᩴ;

    move-result-object v0

    return-object v0
.end method

.method public trySplit()Ll/֨ۘᩴ;
    .locals 5

    .line 867
    invoke-virtual {p0}, Ll/۠ۘᩴ;->֫()I

    move-result v0

    .line 795
    iget v1, p0, Ll/۠ۘᩴ;->᩸:I

    invoke-virtual {p0}, Ll/۠ۘᩴ;->֫()I

    move-result v2

    iget v3, p0, Ll/۠ۘᩴ;->᩸:I

    const/4 v4, 0x2

    invoke-static {v2, v3, v4, v1}, Ll/۟ۤ᩻;->֫(IIII)I

    move-result v1

    if-eq v1, v3, :cond_2

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    if-lt v1, v3, :cond_1

    if-gt v1, v0, :cond_1

    .line 872
    invoke-virtual {p0, v3, v1}, Ll/۠ۘᩴ;->֫(II)Ll/֨ۘᩴ;

    move-result-object v0

    .line 873
    iput v1, p0, Ll/۠ۘᩴ;->᩸:I

    return-object v0

    .line 802
    :cond_1
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    const-string v3, "splitPoint "

    const-string v4, " outside of range of current position "

    .line 0
    invoke-static {v1, v3, v4}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 802
    iget v3, p0, Ll/۠ۘᩴ;->᩸:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " and range end "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic trySplit()Ll/֨۫ᩴ;
    .locals 1

    .line 696
    invoke-virtual {p0}, Ll/۠ۘᩴ;->trySplit()Ll/֨ۘᩴ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic trySplit()Ll/ܶ۫ᩴ;
    .locals 1

    .line 696
    invoke-virtual {p0}, Ll/۠ۘᩴ;->trySplit()Ll/֨ۘᩴ;

    move-result-object v0

    return-object v0
.end method

.method public abstract ֫()I
.end method

.method public abstract ֫(I)J
.end method

.method public abstract ֫(II)Ll/֨ۘᩴ;
.end method
