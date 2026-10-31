.class public final Ll/ۚۗᩳ;
.super Ll/۬ᩴܺ;
.source "Q6U5"


# instance fields
.field public final ֫:I

.field public final ۧ:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    if-lt p1, v0, :cond_0

    if-lt p2, v0, :cond_0

    iput p1, p0, Ll/ۚۗᩳ;->ۧ:I

    iput p2, p0, Ll/ۚۗᩳ;->֫:I

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid text selection"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(IIII)I
    .locals 4

    if-ge p0, p1, :cond_0

    return p0

    :cond_0
    if-lt p0, p2, :cond_2

    int-to-long v0, p0

    sub-int/2addr p2, p1

    int-to-long p0, p2

    sub-long/2addr v0, p0

    int-to-long p0, p3

    add-long/2addr v0, p0

    long-to-int p0, v0

    int-to-long p1, p0

    cmp-long p3, v0, p1

    if-nez p3, :cond_1

    return p0

    .line 0
    :cond_1
    new-instance p0, Ljava/lang/ArithmeticException;

    invoke-direct {p0}, Ljava/lang/ArithmeticException;-><init>()V

    throw p0

    :cond_2
    if-eq p0, p1, :cond_4

    if-nez p3, :cond_3

    goto :goto_0

    :cond_3
    sub-int/2addr p0, p1

    int-to-long v0, p0

    int-to-long v2, p3

    mul-long v0, v0, v2

    sub-int/2addr p2, p1

    int-to-long p2, p2

    .line 20
    div-long/2addr v0, p2

    long-to-int p0, v0

    add-int/2addr p1, p0

    :cond_4
    :goto_0
    return p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 4
    instance-of v0, p1, Ll/ۚۗᩳ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۚۗᩳ;

    iget v0, p0, Ll/ۚۗᩳ;->ۧ:I

    iget v1, p1, Ll/ۚۗᩳ;->ۧ:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ۚۗᩳ;->֫:I

    iget p1, p1, Ll/ۚۗᩳ;->֫:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 4
    iget v0, p0, Ll/ۚۗᩳ;->ۧ:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ۚۗᩳ;->֫:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 4
    iget v0, p0, Ll/ۚۗᩳ;->ۧ:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Ll/ۚۗᩳ;->֫:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const-string v1, "start;end"

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    new-array v1, v3, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v4, ";"

    invoke-virtual {v1, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "TextSelection["

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_1
    array-length v5, v1

    if-ge v3, v5, :cond_2

    aget-object v5, v1, v3

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v2, v3

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v5, v1

    sub-int/2addr v5, v0

    if-eq v3, v5, :cond_1

    const-string v5, ", "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 4
    iget v0, p0, Ll/ۚۗᩳ;->֫:I

    return v0
.end method

.method public final ֫(III)Ll/ۚۗᩳ;
    .locals 3

    .line 13
    new-instance v0, Ll/ۚۗᩳ;

    iget v1, p0, Ll/ۚۗᩳ;->ۧ:I

    invoke-static {v1, p1, p2, p3}, Ll/ۚۗᩳ;->֫(IIII)I

    move-result v1

    iget v2, p0, Ll/ۚۗᩳ;->֫:I

    invoke-static {v2, p1, p2, p3}, Ll/ۚۗᩳ;->֫(IIII)I

    move-result p1

    invoke-direct {v0, v1, p1}, Ll/ۚۗᩳ;-><init>(II)V

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 4
    iget v0, p0, Ll/ۚۗᩳ;->ۧ:I

    return v0
.end method
