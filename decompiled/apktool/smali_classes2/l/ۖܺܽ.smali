.class public final Ll/ۖܺܽ;
.super Ljava/lang/Object;
.source "Y74I"

# interfaces
.implements Ljava/lang/CharSequence;


# instance fields
.field public ᩸:[C

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 274
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x40

    new-array v0, v0, [C

    .line 275
    iput-object v0, p0, Ll/ۖܺܽ;->᩸:[C

    return-void
.end method


# virtual methods
.method public final charAt(I)C
    .locals 3

    if-ltz p1, :cond_0

    .line 309
    iget v0, p0, Ll/ۖܺܽ;->᩹:I

    if-ge p1, v0, :cond_0

    .line 312
    iget-object v0, p0, Ll/ۖܺܽ;->᩸:[C

    aget-char p1, v0, p1

    return p1

    .line 310
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "index = "

    const-string v2, ", length = "

    .line 0
    invoke-static {p1, v1, v2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 310
    iget v1, p0, Ll/ۖܺܽ;->᩹:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final length()I
    .locals 1

    .line 304
    iget v0, p0, Ll/ۖܺܽ;->᩹:I

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 4

    if-ltz p1, :cond_0

    .line 317
    iget v0, p0, Ll/ۖܺܽ;->᩹:I

    if-gt p2, v0, :cond_0

    if-gt p1, p2, :cond_0

    .line 321
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Ll/ۖܺܽ;->᩸:[C

    sub-int/2addr p2, p1

    invoke-direct {v0, v1, p1, p2}, Ljava/lang/String;-><init>([CII)V

    return-object v0

    .line 318
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, ", end = "

    const-string v2, ", length = "

    const-string v3, "start = "

    .line 0
    invoke-static {v3, p1, v1, v2, p2}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 318
    iget p2, p0, Ll/ۖܺܽ;->᩹:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 326
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Ll/ۖܺܽ;->᩸:[C

    const/4 v2, 0x0

    iget v3, p0, Ll/ۖܺܽ;->᩹:I

    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method public final ֫(IIILjava/lang/String;)V
    .locals 3

    sub-int/2addr p2, p1

    .line 330
    iget-object v0, p0, Ll/ۖܺܽ;->᩸:[C

    array-length v1, v0

    if-lt v1, p2, :cond_0

    goto :goto_1

    .line 333
    :cond_0
    array-length v0, v0

    :goto_0
    if-ge v0, p2, :cond_1

    mul-int/lit8 v0, v0, 0x2

    goto :goto_0

    .line 337
    :cond_1
    new-array v0, v0, [C

    iput-object v0, p0, Ll/ۖܺܽ;->᩸:[C

    :goto_1
    const/4 v0, 0x0

    :goto_2
    if-ge v0, p2, :cond_2

    .line 297
    iget-object v1, p0, Ll/ۖܺܽ;->᩸:[C

    add-int v2, p1, v0

    invoke-virtual {p4, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2, p3}, Ll/ۘܺܽ;->֫(CI)C

    move-result v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 299
    :cond_2
    iput p2, p0, Ll/ۖܺܽ;->᩹:I

    return-void
.end method

.method public final ֫(IILjava/lang/String;)V
    .locals 5

    sub-int v0, p2, p1

    add-int/lit8 v1, v0, 0x2

    .line 330
    iget-object v2, p0, Ll/ۖܺܽ;->᩸:[C

    array-length v3, v2

    if-lt v3, v1, :cond_0

    goto :goto_1

    .line 333
    :cond_0
    array-length v2, v2

    :goto_0
    if-ge v2, v1, :cond_1

    mul-int/lit8 v2, v2, 0x2

    goto :goto_0

    .line 337
    :cond_1
    new-array v2, v2, [C

    iput-object v2, p0, Ll/ۖܺܽ;->᩸:[C

    .line 284
    :goto_1
    iget-object v2, p0, Ll/ۖܺܽ;->᩸:[C

    const/4 v3, 0x0

    const/16 v4, 0x4c

    aput-char v4, v2, v3

    const/4 v3, 0x1

    .line 285
    invoke-virtual {p3, p1, p2, v2, v3}, Ljava/lang/String;->getChars(II[CI)V

    .line 286
    iget-object p1, p0, Ll/ۖܺܽ;->᩸:[C

    add-int/2addr v0, v3

    const/16 p2, 0x3b

    aput-char p2, p1, v0

    .line 287
    iput v1, p0, Ll/ۖܺܽ;->᩹:I

    return-void
.end method
