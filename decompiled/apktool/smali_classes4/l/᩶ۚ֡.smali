.class public final Ll/᩶ۚ֡;
.super Ljava/lang/Object;
.source "F7SA"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(IIII)V
    .locals 1

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, " must be >= 0"

    if-ltz p1, :cond_3

    if-ltz p2, :cond_2

    if-ltz p3, :cond_1

    if-ltz p4, :cond_0

    .line 63
    iput p1, p0, Ll/᩶ۚ֡;->ᩳ:I

    .line 64
    iput p2, p0, Ll/᩶ۚ֡;->֫:I

    .line 65
    iput p3, p0, Ll/᩶ۚ֡;->ۧ:I

    .line 66
    iput p4, p0, Ll/᩶ۚ֡;->ܽ:I

    return-void

    .line 61
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "length "

    .line 0
    invoke-static {p4, p2, v0}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 61
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 58
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "inputIndex "

    .line 0
    invoke-static {p3, p2, v0}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 58
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 55
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p3, "columnIndex "

    .line 0
    invoke-static {p2, p3, v0}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 52
    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string p3, "lineIndex "

    .line 0
    invoke-static {p1, p3, v0}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 52
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static ֫(IIII)Ll/᩶ۚ֡;
    .locals 1

    .line 38
    new-instance v0, Ll/᩶ۚ֡;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/᩶ۚ֡;-><init>(IIII)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 137
    const-class v2, Ll/᩶ۚ֡;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 140
    :cond_1
    check-cast p1, Ll/᩶ۚ֡;

    .line 141
    iget v2, p0, Ll/᩶ۚ֡;->ᩳ:I

    iget v3, p1, Ll/᩶ۚ֡;->ᩳ:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/᩶ۚ֡;->֫:I

    iget v3, p1, Ll/᩶ۚ֡;->֫:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/᩶ۚ֡;->ۧ:I

    iget v3, p1, Ll/᩶ۚ֡;->ۧ:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/᩶ۚ֡;->ܽ:I

    iget p1, p1, Ll/᩶ۚ֡;->ܽ:I

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 6

    .line 149
    iget v0, p0, Ll/᩶ۚ֡;->ᩳ:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Ll/᩶ۚ֡;->֫:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Ll/᩶ۚ֡;->ۧ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Ll/᩶ۚ֡;->ܽ:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    invoke-static {v4}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 154
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SourceSpan{line="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/᩶ۚ֡;->ᩳ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", column="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩶ۚ֡;->֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", input="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩶ۚ֡;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", length="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩶ۚ֡;->ܽ:I

    const-string v2, "}"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 81
    iget v0, p0, Ll/᩶ۚ֡;->֫:I

    return v0
.end method

.method public final ֫(I)Ll/᩶ۚ֡;
    .locals 1

    .line 100
    iget v0, p0, Ll/᩶ۚ֡;->ܽ:I

    invoke-virtual {p0, p1, v0}, Ll/᩶ۚ֡;->֫(II)Ll/᩶ۚ֡;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(II)Ll/᩶ۚ֡;
    .locals 5

    const-string v0, " + must be >= 0"

    const-string v1, "beginIndex "

    if-ltz p1, :cond_5

    const-string v2, " must be <= length "

    .line 107
    iget v3, p0, Ll/᩶ۚ֡;->ܽ:I

    if-gt p1, v3, :cond_4

    const-string v4, "endIndex "

    if-ltz p2, :cond_3

    if-gt p2, v3, :cond_2

    if-gt p1, p2, :cond_1

    if-nez p1, :cond_0

    if-ne p2, v3, :cond_0

    return-object p0

    .line 125
    :cond_0
    new-instance v0, Ll/᩶ۚ֡;

    iget v1, p0, Ll/᩶ۚ֡;->֫:I

    add-int/2addr v1, p1

    iget v2, p0, Ll/᩶ۚ֡;->ۧ:I

    add-int/2addr v2, p1

    sub-int/2addr p2, p1

    iget p1, p0, Ll/᩶ۚ֡;->ᩳ:I

    invoke-direct {v0, p1, v1, v2, p2}, Ll/᩶ۚ֡;-><init>(IIII)V

    return-object v0

    .line 119
    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, " must be <= endIndex "

    .line 0
    invoke-static {v1, p1, p2, v2}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 119
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 115
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    .line 0
    invoke-static {v4, p2, v3, v2}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 115
    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 112
    :cond_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    .line 0
    invoke-static {p2, v4, v0}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 112
    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 108
    :cond_4
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    .line 0
    invoke-static {v1, p1, v3, v2}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 108
    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 105
    :cond_5
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    .line 0
    invoke-static {p1, v1, v0}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 105
    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final ۧ()I
    .locals 1

    .line 89
    iget v0, p0, Ll/᩶ۚ֡;->ۧ:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 96
    iget v0, p0, Ll/᩶ۚ֡;->ܽ:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 73
    iget v0, p0, Ll/᩶ۚ֡;->ᩳ:I

    return v0
.end method
