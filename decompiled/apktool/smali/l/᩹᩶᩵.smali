.class public Ll/᩹᩶᩵;
.super Ljava/lang/Object;
.source "NAX7"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final ᩶:I

.field public final ᩸:I

.field public final ᩹:I


# direct methods
.method public constructor <init>(III)V
    .locals 1

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p3, :cond_1

    const/high16 v0, -0x80000000

    if-eq p3, v0, :cond_0

    .line 94
    iput p1, p0, Ll/᩹᩶᩵;->᩸:I

    .line 99
    invoke-static {p1, p2, p3}, Ll/᩻ۙ۠;->֫(III)I

    move-result p1

    iput p1, p0, Ll/᩹᩶᩵;->᩹:I

    .line 104
    iput p3, p0, Ll/᩹᩶᩵;->᩶:I

    return-void

    .line 88
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 87
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Step must be non-zero."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 117
    instance-of v0, p1, Ll/᩹᩶᩵;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ll/᩹᩶᩵;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ll/᩹᩶᩵;

    invoke-virtual {v0}, Ll/᩹᩶᩵;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 118
    :cond_0
    check-cast p1, Ll/᩹᩶᩵;

    iget v0, p1, Ll/᩹᩶᩵;->᩸:I

    iget v1, p0, Ll/᩹᩶᩵;->᩸:I

    if-ne v1, v0, :cond_2

    iget v0, p0, Ll/᩹᩶᩵;->᩹:I

    iget v1, p1, Ll/᩹᩶᩵;->᩹:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Ll/᩹᩶᩵;->᩶:I

    iget p1, p1, Ll/᩹᩶᩵;->᩶:I

    if-ne v0, p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final getFirst()I
    .locals 1

    .line 94
    iget v0, p0, Ll/᩹᩶᩵;->᩸:I

    return v0
.end method

.method public final getLast()I
    .locals 1

    .line 99
    iget v0, p0, Ll/᩹᩶᩵;->᩹:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 121
    invoke-virtual {p0}, Ll/᩹᩶᩵;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    iget v0, p0, Ll/᩹᩶᩵;->᩸:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/᩹᩶᩵;->᩹:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/᩹᩶᩵;->᩶:I

    add-int/2addr v0, v1

    return v0
.end method

.method public isEmpty()Z
    .locals 5

    .line 114
    iget v0, p0, Ll/᩹᩶᩵;->᩶:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    iget v3, p0, Ll/᩹᩶᩵;->᩹:I

    iget v4, p0, Ll/᩹᩶᩵;->᩸:I

    if-lez v0, :cond_1

    if-le v4, v3, :cond_0

    return v2

    :cond_0
    return v1

    :cond_1
    if-ge v4, v3, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 4

    .line 106
    new-instance v0, Ll/᩶᩶᩵;

    iget v1, p0, Ll/᩹᩶᩵;->᩹:I

    iget v2, p0, Ll/᩹᩶᩵;->᩶:I

    iget v3, p0, Ll/᩹᩶᩵;->᩸:I

    invoke-direct {v0, v3, v1, v2}, Ll/᩶᩶᩵;-><init>(III)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    const-string v0, " step "

    .line 123
    iget v1, p0, Ll/᩹᩶᩵;->᩹:I

    iget v2, p0, Ll/᩹᩶᩵;->᩸:I

    iget v3, p0, Ll/᩹᩶᩵;->᩶:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-lez v3, :cond_0

    const-string v2, ".."

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v2, " downTo "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    neg-int v0, v3

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 104
    iget v0, p0, Ll/᩹᩶᩵;->᩶:I

    return v0
.end method
