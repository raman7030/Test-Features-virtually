.class public final Ll/۬۬ۡ;
.super Ljava/lang/Object;
.source "Z71W"

# interfaces
.implements Ll/᩺۬ۡ;


# instance fields
.field public final ᩶:Ljava/lang/CharSequence;

.field public final ᩸:I

.field public final ᩹:I


# direct methods
.method public constructor <init>(IILjava/lang/CharSequence;)V
    .locals 4

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ltz p1, :cond_1

    if-gt p2, v0, :cond_1

    if-gt p1, p2, :cond_1

    .line 21
    instance-of v0, p3, Ll/۬۬ۡ;

    if-eqz v0, :cond_0

    check-cast p3, Ll/۬۬ۡ;

    .line 22
    iget-object v0, p3, Ll/۬۬ۡ;->᩶:Ljava/lang/CharSequence;

    iput-object v0, p0, Ll/۬۬ۡ;->᩶:Ljava/lang/CharSequence;

    .line 23
    iget p3, p3, Ll/۬۬ۡ;->᩹:I

    add-int/2addr p3, p1

    iput p3, p0, Ll/۬۬ۡ;->᩹:I

    goto :goto_0

    .line 25
    :cond_0
    iput-object p3, p0, Ll/۬۬ۡ;->᩶:Ljava/lang/CharSequence;

    .line 26
    iput p1, p0, Ll/۬۬ۡ;->᩹:I

    :goto_0
    sub-int/2addr p2, p1

    .line 28
    iput p2, p0, Ll/۬۬ۡ;->᩸:I

    return-void

    .line 18
    :cond_1
    new-instance p3, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, ", end = "

    const-string v2, ", length = "

    const-string v3, "start = "

    .line 0
    invoke-static {v3, p1, v1, v2, p2}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p3
.end method


# virtual methods
.method public final charAt(I)C
    .locals 4

    .line 38
    iget v0, p0, Ll/۬۬ۡ;->᩸:I

    if-ltz p1, :cond_0

    if-ge p1, v0, :cond_0

    .line 41
    iget v0, p0, Ll/۬۬ۡ;->᩹:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/۬۬ۡ;->᩶:Ljava/lang/CharSequence;

    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    return p1

    .line 39
    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "index = "

    const-string v3, ", length = "

    .line 0
    invoke-static {v2, p1, v0, v3}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 39
    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final indexOf(CII)I
    .locals 4

    .line 49
    iget v0, p0, Ll/۬۬ۡ;->᩸:I

    if-ltz p2, :cond_7

    if-gt p3, v0, :cond_7

    if-gt p2, p3, :cond_7

    const/4 v0, -0x1

    if-ne p2, p3, :cond_0

    return v0

    .line 56
    :cond_0
    iget-object v1, p0, Ll/۬۬ۡ;->᩶:Ljava/lang/CharSequence;

    instance-of v2, v1, Ll/᩺۬ۡ;

    iget v3, p0, Ll/۬۬ۡ;->᩹:I

    if-eqz v2, :cond_4

    check-cast v1, Ll/᩺۬ۡ;

    add-int/2addr p2, v3

    add-int/2addr p3, v3

    .line 59
    invoke-interface {v1, p1, p2, p3}, Ll/᩺۬ۡ;->indexOf(CII)I

    move-result p1

    if-lt p1, v0, :cond_3

    if-ltz p1, :cond_1

    if-lt p1, p2, :cond_3

    if-ge p1, p3, :cond_3

    :cond_1
    if-gez p1, :cond_2

    return v0

    :cond_2
    sub-int/2addr p1, v3

    return p1

    .line 61
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Searchable character sequence returned an invalid index"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_0
    if-ge p2, p3, :cond_6

    add-int v2, v3, p2

    .line 66
    invoke-interface {v1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    if-ne v2, p1, :cond_5

    return p2

    :cond_5
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_6
    return v0

    .line 50
    :cond_7
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, ", end = "

    const-string v2, ", length = "

    const-string v3, "start = "

    .line 0
    invoke-static {v3, p2, v1, v2, p3}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 50
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final lastIndexOf(CII)I
    .locals 4

    .line 76
    iget p1, p0, Ll/۬۬ۡ;->᩸:I

    if-ltz p2, :cond_6

    if-gt p3, p1, :cond_6

    if-gt p2, p3, :cond_6

    const/4 p1, -0x1

    if-ne p2, p3, :cond_0

    goto :goto_0

    .line 81
    :cond_0
    iget-object v0, p0, Ll/۬۬ۡ;->᩶:Ljava/lang/CharSequence;

    instance-of v1, v0, Ll/᩺۬ۡ;

    const/16 v2, 0xa

    iget v3, p0, Ll/۬۬ۡ;->᩹:I

    if-eqz v1, :cond_4

    check-cast v0, Ll/᩺۬ۡ;

    add-int/2addr p2, v3

    add-int/2addr p3, v3

    .line 84
    invoke-interface {v0, v2, p2, p3}, Ll/᩺۬ۡ;->lastIndexOf(CII)I

    move-result v0

    if-lt v0, p1, :cond_3

    if-ltz v0, :cond_1

    if-lt v0, p2, :cond_3

    if-ge v0, p3, :cond_3

    :cond_1
    if-gez v0, :cond_2

    goto :goto_0

    :cond_2
    sub-int/2addr v0, v3

    return v0

    .line 86
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Searchable character sequence returned an invalid index"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    add-int/lit8 p3, p3, -0x1

    if-lt p3, p2, :cond_5

    add-int v1, v3, p3

    .line 91
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    if-ne v1, v2, :cond_4

    return p3

    :cond_5
    :goto_0
    return p1

    .line 77
    :cond_6
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, ", end = "

    const-string v2, ", length = "

    const-string v3, "start = "

    .line 0
    invoke-static {v3, p2, v1, v2, p3}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 77
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final length()I
    .locals 1

    .line 33
    iget v0, p0, Ll/۬۬ۡ;->᩸:I

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 5

    .line 99
    iget v0, p0, Ll/۬۬ۡ;->᩸:I

    if-ltz p1, :cond_1

    if-gt p2, v0, :cond_1

    if-gt p1, p2, :cond_1

    if-nez p1, :cond_0

    if-ne p2, v0, :cond_0

    return-object p0

    .line 106
    :cond_0
    new-instance v0, Ll/۬۬ۡ;

    iget v1, p0, Ll/۬۬ۡ;->᩹:I

    add-int/2addr p1, v1

    add-int/2addr v1, p2

    iget-object p2, p0, Ll/۬۬ۡ;->᩶:Ljava/lang/CharSequence;

    invoke-direct {v0, p1, v1, p2}, Ll/۬۬ۡ;-><init>(IILjava/lang/CharSequence;)V

    return-object v0

    .line 100
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, ", end = "

    const-string v3, ", length = "

    const-string v4, "start = "

    .line 0
    invoke-static {v4, p1, v2, v3, p2}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 100
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 112
    iget v0, p0, Ll/۬۬ۡ;->᩸:I

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    .line 115
    :cond_0
    new-array v1, v0, [C

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 117
    iget v3, p0, Ll/۬۬ۡ;->᩹:I

    add-int/2addr v3, v2

    iget-object v4, p0, Ll/۬۬ۡ;->᩶:Ljava/lang/CharSequence;

    invoke-interface {v4, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    aput-char v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 119
    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method
