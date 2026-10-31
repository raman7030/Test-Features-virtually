.class public final Ll/᩸ۛۡ;
.super Ljava/lang/Object;
.source "97MC"

# interfaces
.implements Ljava/lang/CharSequence;
.implements Landroid/text/GetChars;
.implements Ljava/lang/Comparable;


# static fields
.field public static final ۗ:Ll/᩸ۛۡ;


# instance fields
.field public final ۙ:[C

.field public final ᩶:I

.field public ᩸:I

.field public final ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 15
    new-instance v0, Ll/᩸ۛۡ;

    const-string v1, ""

    invoke-direct {v0, v1}, Ll/᩸ۛۡ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/᩸ۛۡ;->ۗ:Ll/᩸ۛۡ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 23
    iput v0, p0, Ll/᩸ۛۡ;->᩸:I

    if-eqz p1, :cond_0

    .line 45
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    iput-object p1, p0, Ll/᩸ۛۡ;->ۙ:[C

    const/4 v0, 0x0

    .line 46
    iput v0, p0, Ll/᩸ۛۡ;->᩶:I

    .line 47
    array-length p1, p1

    iput p1, p0, Ll/᩸ۛۡ;->᩹:I

    return-void

    .line 43
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "String cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>([CII)V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 23
    iput v0, p0, Ll/᩸ۛۡ;->᩸:I

    .line 54
    iput-object p1, p0, Ll/᩸ۛۡ;->ۙ:[C

    .line 55
    iput p2, p0, Ll/᩸ۛۡ;->᩶:I

    .line 56
    iput p3, p0, Ll/᩸ۛۡ;->᩹:I

    return-void
.end method

.method public static ۧ(Ljava/lang/String;)Ll/᩸ۛۡ;
    .locals 1

    if-eqz p0, :cond_1

    .line 29
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 30
    sget-object p0, Ll/᩸ۛۡ;->ۗ:Ll/᩸ۛۡ;

    return-object p0

    .line 35
    :cond_0
    new-instance v0, Ll/᩸ۛۡ;

    invoke-virtual {p0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/᩸ۛۡ;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 27
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "String cannot be null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final charAt(I)C
    .locals 4

    .line 77
    iget v0, p0, Ll/᩸ۛۡ;->᩹:I

    if-ltz p1, :cond_0

    if-ge p1, v0, :cond_0

    .line 81
    iget v0, p0, Ll/᩸ۛۡ;->᩶:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/᩸ۛۡ;->ۙ:[C

    aget-char p1, p1, v0

    return p1

    .line 78
    :cond_0
    new-instance v1, Ljava/lang/StringIndexOutOfBoundsException;

    const-string v2, "Index: "

    const-string v3, ", Length: "

    .line 0
    invoke-static {v2, p1, v0, v3}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 78
    invoke-direct {v1, p1}, Ljava/lang/StringIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 7

    .line 14
    check-cast p1, Ll/᩸ۛۡ;

    .line 248
    iget v0, p1, Ll/᩸ۛۡ;->᩹:I

    .line 249
    iget v1, p0, Ll/᩸ۛۡ;->᩹:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 253
    iget v4, p0, Ll/᩸ۛۡ;->᩶:I

    add-int/2addr v4, v3

    iget-object v5, p0, Ll/᩸ۛۡ;->ۙ:[C

    aget-char v4, v5, v4

    .line 254
    iget-object v5, p1, Ll/᩸ۛۡ;->ۙ:[C

    iget v6, p1, Ll/᩸ۛۡ;->᩶:I

    add-int/2addr v6, v3

    aget-char v5, v5, v6

    if-eq v4, v5, :cond_0

    sub-int/2addr v4, v5

    return v4

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    sub-int/2addr v1, v0

    return v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 198
    :cond_0
    instance-of v1, p1, Ll/᩸ۛۡ;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    check-cast p1, Ll/᩸ۛۡ;

    .line 202
    iget v1, p1, Ll/᩸ۛۡ;->᩹:I

    iget v3, p0, Ll/᩸ۛۡ;->᩹:I

    if-eq v3, v1, :cond_1

    return v2

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v3, :cond_3

    .line 208
    iget v4, p0, Ll/᩸ۛۡ;->᩶:I

    add-int/2addr v4, v1

    iget-object v5, p0, Ll/᩸ۛۡ;->ۙ:[C

    aget-char v4, v5, v4

    iget-object v5, p1, Ll/᩸ۛۡ;->ۙ:[C

    iget v6, p1, Ll/᩸ۛۡ;->᩶:I

    add-int/2addr v6, v1

    aget-char v5, v5, v6

    if-eq v4, v5, :cond_2

    return v2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return v0

    :cond_4
    return v2
.end method

.method public final getChars(II[CI)V
    .locals 2

    if-eqz p3, :cond_5

    const-string v0, "srcBegin: "

    if-ltz p1, :cond_4

    .line 322
    iget v1, p0, Ll/᩸ۛۡ;->᩹:I

    if-gt p2, v1, :cond_3

    if-gt p1, p2, :cond_2

    if-ltz p4, :cond_1

    sub-int/2addr p2, p1

    add-int v0, p4, p2

    .line 334
    array-length v1, p3

    if-gt v0, v1, :cond_0

    .line 341
    iget v0, p0, Ll/᩸ۛۡ;->᩶:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/᩸ۛۡ;->ۙ:[C

    invoke-static {p1, v0, p3, p4, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    .line 335
    :cond_0
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string p2, "dstBegin + copyLength: "

    const-string p4, " > dst.length: "

    .line 0
    invoke-static {v0, p2, p4}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 335
    array-length p3, p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 330
    :cond_1
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string p2, "dstBegin: "

    .line 0
    invoke-static {p4, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 330
    invoke-direct {p1, p2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 326
    :cond_2
    new-instance p3, Ljava/lang/StringIndexOutOfBoundsException;

    const-string p4, " > srcEnd: "

    .line 0
    invoke-static {v0, p1, p2, p4}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 326
    invoke-direct {p3, p1}, Ljava/lang/StringIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p3

    .line 323
    :cond_3
    new-instance p1, Ljava/lang/StringIndexOutOfBoundsException;

    const-string p3, "srcEnd: "

    .line 0
    invoke-static {p2, p3}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 323
    invoke-direct {p1, p2}, Ljava/lang/StringIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 320
    :cond_4
    new-instance p2, Ljava/lang/StringIndexOutOfBoundsException;

    .line 0
    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 320
    invoke-direct {p2, p1}, Ljava/lang/StringIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 317
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Destination array cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final hashCode()I
    .locals 4

    .line 232
    iget v0, p0, Ll/᩸ۛۡ;->᩸:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 234
    :goto_0
    iget v2, p0, Ll/᩸ۛۡ;->᩹:I

    if-ge v0, v2, :cond_0

    mul-int/lit8 v1, v1, 0x1f

    .line 235
    iget v2, p0, Ll/᩸ۛۡ;->᩶:I

    add-int/2addr v2, v0

    iget-object v3, p0, Ll/᩸ۛۡ;->ۙ:[C

    aget-char v2, v3, v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 237
    :cond_0
    iput v1, p0, Ll/᩸ۛۡ;->᩸:I

    .line 239
    :cond_1
    iget v0, p0, Ll/᩸ۛۡ;->᩸:I

    return v0
.end method

.method public final indexOf(I)I
    .locals 2

    if-gez p1, :cond_0

    const/4 p1, 0x0

    .line 123
    :cond_0
    :goto_0
    iget v0, p0, Ll/᩸ۛۡ;->᩹:I

    if-ge p1, v0, :cond_2

    .line 124
    iget v0, p0, Ll/᩸ۛۡ;->᩶:I

    add-int/2addr v0, p1

    iget-object v1, p0, Ll/᩸ۛۡ;->ۙ:[C

    aget-char v0, v1, v0

    const/16 v1, 0x2f

    if-ne v0, v1, :cond_1

    return p1

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 70
    iget v0, p0, Ll/᩸ۛۡ;->᩹:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final length()I
    .locals 1

    .line 63
    iget v0, p0, Ll/᩸ۛۡ;->᩹:I

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 0

    .line 439
    invoke-virtual {p0, p1, p2}, Ll/᩸ۛۡ;->ܽ(II)Ll/᩸ۛۡ;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 448
    new-instance v0, Ljava/lang/String;

    iget v1, p0, Ll/᩸ۛۡ;->᩶:I

    iget v2, p0, Ll/᩸ۛۡ;->᩹:I

    iget-object v3, p0, Ll/᩸ۛۡ;->ۙ:[C

    invoke-direct {v0, v3, v1, v2}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/CharSequence;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 216
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    iget v2, p0, Ll/᩸ۛۡ;->᩹:I

    if-eq v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_2

    .line 220
    iget v3, p0, Ll/᩸ۛۡ;->᩶:I

    add-int/2addr v3, v1

    iget-object v4, p0, Ll/᩸ۛۡ;->ۙ:[C

    aget-char v3, v4, v3

    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    if-eq v3, v4, :cond_1

    return v0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_1
    return v0
.end method

.method public final ۧ(I)Ll/᩸ۛۡ;
    .locals 1

    .line 88
    iget v0, p0, Ll/᩸ۛۡ;->᩹:I

    invoke-virtual {p0, p1, v0}, Ll/᩸ۛۡ;->ܽ(II)Ll/᩸ۛۡ;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ(II)Ll/᩸ۛۡ;
    .locals 3

    const-string v0, "Begin index: "

    if-ltz p1, :cond_3

    .line 95
    iget v1, p0, Ll/᩸ۛۡ;->᩹:I

    if-gt p2, v1, :cond_2

    if-gt p1, p2, :cond_1

    sub-int/2addr p2, p1

    if-nez p2, :cond_0

    .line 105
    sget-object p1, Ll/᩸ۛۡ;->ۗ:Ll/᩸ۛۡ;

    return-object p1

    .line 109
    :cond_0
    new-instance v0, Ll/᩸ۛۡ;

    iget v1, p0, Ll/᩸ۛۡ;->᩶:I

    add-int/2addr v1, p1

    iget-object p1, p0, Ll/᩸ۛۡ;->ۙ:[C

    invoke-direct {v0, p1, v1, p2}, Ll/᩸ۛۡ;-><init>([CII)V

    return-object v0

    .line 99
    :cond_1
    new-instance v1, Ljava/lang/StringIndexOutOfBoundsException;

    const-string v2, " > End index: "

    .line 0
    invoke-static {v0, p1, p2, v2}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 99
    invoke-direct {v1, p1}, Ljava/lang/StringIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 96
    :cond_2
    new-instance p1, Ljava/lang/StringIndexOutOfBoundsException;

    const-string v0, "End index: "

    .line 0
    invoke-static {p2, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 96
    invoke-direct {p1, p2}, Ljava/lang/StringIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 93
    :cond_3
    new-instance p2, Ljava/lang/StringIndexOutOfBoundsException;

    .line 0
    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 93
    invoke-direct {p2, p1}, Ljava/lang/StringIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
