.class public final Ll/ۨܿ֡;
.super Ljava/lang/Object;
.source "M6NW"

# interfaces
.implements Ll/᩺ܿ֡;


# instance fields
.field public ֫:I

.field public ۧ:I

.field public final ܳ:Ljava/lang/CharSequence;

.field public ܽ:[I

.field public final ܿ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Ljava/lang/Runnable;)V
    .locals 7

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۨܿ֡;->ܳ:Ljava/lang/CharSequence;

    .line 29
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    add-int/lit8 v3, v2, 0x1

    and-int/lit16 v2, v2, 0x3ff

    if-nez v2, :cond_0

    .line 31
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 32
    :cond_0
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v2

    if-eqz v2, :cond_3

    add-int/lit8 v2, v1, 0x1

    if-ge v2, v0, :cond_3

    .line 33
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 34
    iget-object v4, p0, Ll/ۨܿ֡;->ܽ:[I

    if-nez v4, :cond_1

    const/16 v4, 0x10

    new-array v4, v4, [I

    iput-object v4, p0, Ll/ۨܿ֡;->ܽ:[I

    goto :goto_1

    .line 35
    :cond_1
    iget v5, p0, Ll/ۨܿ֡;->ۧ:I

    array-length v6, v4

    if-ne v5, v6, :cond_2

    mul-int/lit8 v5, v5, 0x2

    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v4

    iput-object v4, p0, Ll/ۨܿ֡;->ܽ:[I

    .line 36
    :cond_2
    :goto_1
    iget-object v4, p0, Ll/ۨܿ֡;->ܽ:[I

    iget v5, p0, Ll/ۨܿ֡;->ۧ:I

    sub-int/2addr v1, v5

    aput v1, v4, v5

    add-int/lit8 v5, v5, 0x1

    .line 37
    iput v5, p0, Ll/ۨܿ֡;->ۧ:I

    move v1, v2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    move v2, v3

    goto :goto_0

    .line 41
    :cond_4
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 42
    iget p1, p0, Ll/ۨܿ֡;->ۧ:I

    sub-int/2addr v0, p1

    iput v0, p0, Ll/ۨܿ֡;->ܿ:I

    return-void
.end method

.method private ᩳ(I)I
    .locals 4

    const/4 v0, 0x0

    .line 61
    iget v1, p0, Ll/ۨܿ֡;->ۧ:I

    :goto_0
    if-ge v0, v1, :cond_1

    add-int v2, v0, v1

    ushr-int/lit8 v2, v2, 0x1

    .line 64
    iget-object v3, p0, Ll/ۨܿ֡;->ܽ:[I

    aget v3, v3, v2

    if-ge v3, p1, :cond_0

    add-int/lit8 v0, v2, 0x1

    goto :goto_0

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    add-int/2addr p1, v0

    return p1
.end method


# virtual methods
.method public final index()I
    .locals 1

    .line 72
    iget v0, p0, Ll/ۨܿ֡;->ᩳ:I

    return v0
.end method

.method public final size()I
    .locals 1

    .line 73
    iget v0, p0, Ll/ۨܿ֡;->ܿ:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 98
    iget v0, p0, Ll/ۨܿ֡;->ܿ:I

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ll/ܳ᩷֡;->֫(II)Ll/ܳ᩷֡;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۨܿ֡;->֫(Ll/ܳ᩷֡;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public final ֫(Ll/ܳ᩷֡;)Ljava/lang/String;
    .locals 6

    .line 85
    iget v0, p1, Ll/ܳ᩷֡;->֫:I

    iget v1, p0, Ll/ۨܿ֡;->ܿ:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 86
    iget v2, p1, Ll/ܳ᩷֡;->ۧ:I

    int-to-long v2, v2

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    int-to-long v4, v1

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    if-ltz v0, :cond_3

    if-lt v2, v0, :cond_3

    .line 88
    invoke-direct {p0, v0}, Ll/ۨܿ֡;->ᩳ(I)I

    move-result p1

    invoke-direct {p0, v2}, Ll/ۨܿ֡;->ᩳ(I)I

    move-result v0

    .line 89
    iget-object v1, p0, Ll/ۨܿ֡;->ܳ:Ljava/lang/CharSequence;

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    if-ne p1, v0, :cond_1

    const-string p1, ""

    return-object p1

    :cond_1
    sub-int/2addr v0, p1

    .line 91
    new-array v2, v0, [C

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    add-int v4, p1, v3

    .line 92
    invoke-interface {v1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    aput-char v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 93
    :cond_2
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v2}, Ljava/lang/String;-><init>([C)V

    return-object p1

    .line 87
    :cond_3
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Interval: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(I)V
    .locals 2

    if-ltz p1, :cond_0

    .line 78
    iget v0, p0, Ll/ۨܿ֡;->ܿ:I

    if-gt p1, v0, :cond_0

    .line 79
    iput p1, p0, Ll/ۨܿ֡;->ᩳ:I

    .line 80
    invoke-direct {p0, p1}, Ll/ۨܿ֡;->ᩳ(I)I

    move-result p1

    iput p1, p0, Ll/ۨܿ֡;->֫:I

    return-void

    .line 78
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Index: "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 78
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(I)I
    .locals 5

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 55
    :cond_0
    iget v0, p0, Ll/ۨܿ֡;->ᩳ:I

    int-to-long v1, v0

    if-lez p1, :cond_1

    add-int/lit8 p1, p1, -0x1

    :cond_1
    int-to-long v3, p1

    add-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-ltz p1, :cond_4

    .line 56
    iget p1, p0, Ll/ۨܿ֡;->ܿ:I

    int-to-long v3, p1

    cmp-long p1, v1, v3

    if-ltz p1, :cond_2

    goto :goto_1

    :cond_2
    int-to-long v3, v0

    cmp-long p1, v1, v3

    if-nez p1, :cond_3

    .line 57
    iget p1, p0, Ll/ۨܿ֡;->֫:I

    goto :goto_0

    :cond_3
    long-to-int p1, v1

    invoke-direct {p0, p1}, Ll/ۨܿ֡;->ᩳ(I)I

    move-result p1

    :goto_0
    iget-object v0, p0, Ll/ۨܿ֡;->ܳ:Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result p1

    return p1

    :cond_4
    :goto_1
    const/4 p1, -0x1

    return p1
.end method

.method public final ۧ()V
    .locals 2

    .line 47
    iget v0, p0, Ll/ۨܿ֡;->ᩳ:I

    iget v1, p0, Ll/ۨܿ֡;->ܿ:I

    if-ge v0, v1, :cond_0

    .line 48
    iget v0, p0, Ll/ۨܿ֡;->֫:I

    iget-object v1, p0, Ll/ۨܿ֡;->ܳ:Ljava/lang/CharSequence;

    invoke-static {v1, v0}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->charCount(I)I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Ll/ۨܿ֡;->֫:I

    .line 49
    iget v0, p0, Ll/ۨܿ֡;->ᩳ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۨܿ֡;->ᩳ:I

    return-void

    .line 47
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot consume EOF"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ(I)V
    .locals 0

    return-void
.end method
