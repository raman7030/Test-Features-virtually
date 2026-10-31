.class public final Ll/᩷۫ᩳ;
.super Ljava/lang/Object;
.source "56O8"

# interfaces
.implements Ll/᩺۬ۡ;
.implements Landroid/text/GetChars;


# instance fields
.field public final ᩶:Ll/۟᩸ᩳ;

.field public final ᩸:I

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/۟᩸ᩳ;II)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p3, :cond_0

    if-ltz p2, :cond_0

    .line 17
    invoke-virtual {p1}, Ll/۟᩸ᩳ;->length()I

    move-result v0

    sub-int/2addr v0, p3

    if-gt p2, v0, :cond_0

    .line 19
    iput-object p1, p0, Ll/᩷۫ᩳ;->᩶:Ll/۟᩸ᩳ;

    .line 20
    iput p2, p0, Ll/᩷۫ᩳ;->᩹:I

    .line 21
    iput p3, p0, Ll/᩷۫ᩳ;->᩸:I

    return-void

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Invalid deletion preview range"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final charAt(I)C
    .locals 1

    if-ltz p1, :cond_1

    .line 29
    invoke-virtual {p0}, Ll/᩷۫ᩳ;->length()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 30
    iget v0, p0, Ll/᩷۫ᩳ;->᩹:I

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Ll/᩷۫ᩳ;->᩸:I

    add-int/2addr p1, v0

    :goto_0
    iget-object v0, p0, Ll/᩷۫ᩳ;->᩶:Ll/۟᩸ᩳ;

    invoke-virtual {v0, p1}, Ll/۟᩸ᩳ;->charAt(I)C

    move-result p1

    return p1

    .line 29
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Invalid preview index"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getChars(II[CI)V
    .locals 2

    if-ltz p1, :cond_3

    if-lt p2, p1, :cond_3

    .line 77
    invoke-virtual {p0}, Ll/᩷۫ᩳ;->length()I

    move-result v0

    if-gt p2, v0, :cond_3

    if-ltz p4, :cond_2

    .line 65
    array-length v0, p3

    sub-int v1, p2, p1

    sub-int/2addr v0, v1

    if-gt p4, v0, :cond_2

    .line 67
    iget v0, p0, Ll/᩷۫ᩳ;->᩹:I

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 68
    iget-object v1, p0, Ll/᩷۫ᩳ;->᩶:Ll/۟᩸ᩳ;

    if-ge p1, v0, :cond_0

    .line 69
    invoke-virtual {v1, p1, v0, p3, p4}, Ll/۟᩸ᩳ;->getChars(II[CI)V

    sub-int p1, v0, p1

    add-int/2addr p4, p1

    move p1, v0

    :cond_0
    if-ge p1, p2, :cond_1

    .line 73
    iget v0, p0, Ll/᩷۫ᩳ;->᩸:I

    add-int/2addr p1, v0

    add-int/2addr p2, v0

    invoke-virtual {v1, p1, p2, p3, p4}, Ll/۟᩸ᩳ;->getChars(II[CI)V

    :cond_1
    return-void

    .line 66
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Invalid preview destination"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 78
    :cond_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Invalid preview range"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final indexOf(CII)I
    .locals 4

    const/4 v0, 0x0

    .line 35
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 36
    invoke-virtual {p0}, Ll/᩷۫ᩳ;->length()I

    move-result v0

    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    const/4 v0, -0x1

    if-lt p2, p3, :cond_0

    return v0

    .line 38
    :cond_0
    iget-object v1, p0, Ll/᩷۫ᩳ;->᩶:Ll/۟᩸ᩳ;

    iget v2, p0, Ll/᩷۫ᩳ;->᩹:I

    if-ge p2, v2, :cond_2

    .line 39
    invoke-static {v2, p3}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-virtual {v1, p1, p2, v3}, Ll/۟᩸ᩳ;->indexOf(CII)I

    move-result p2

    if-ltz p2, :cond_1

    return p2

    :cond_1
    move p2, v2

    :cond_2
    if-lt p2, p3, :cond_3

    return v0

    .line 44
    :cond_3
    iget v2, p0, Ll/᩷۫ᩳ;->᩸:I

    add-int/2addr p2, v2

    add-int/2addr p3, v2

    invoke-virtual {v1, p1, p2, p3}, Ll/۟᩸ᩳ;->indexOf(CII)I

    move-result p1

    if-gez p1, :cond_4

    return v0

    :cond_4
    sub-int/2addr p1, v2

    return p1
.end method

.method public final lastIndexOf(CII)I
    .locals 4

    const/4 p1, 0x0

    .line 50
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 51
    invoke-virtual {p0}, Ll/᩷۫ᩳ;->length()I

    move-result p2

    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p2

    if-lt p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/16 p3, 0xa

    .line 53
    iget-object v0, p0, Ll/᩷۫ᩳ;->᩶:Ll/۟᩸ᩳ;

    iget v1, p0, Ll/᩷۫ᩳ;->᩹:I

    if-le p2, v1, :cond_2

    .line 54
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v3, p0, Ll/᩷۫ᩳ;->᩸:I

    add-int/2addr v2, v3

    add-int/2addr p2, v3

    invoke-virtual {v0, p3, v2, p2}, Ll/۟᩸ᩳ;->lastIndexOf(CII)I

    move-result p2

    if-ltz p2, :cond_1

    sub-int/2addr p2, v3

    return p2

    :cond_1
    move p2, v1

    :cond_2
    if-ge p1, p2, :cond_3

    .line 58
    invoke-virtual {v0, p3, p1, p2}, Ll/۟᩸ᩳ;->lastIndexOf(CII)I

    move-result p1

    return p1

    :cond_3
    :goto_0
    const/4 p1, -0x1

    return p1
.end method

.method public final length()I
    .locals 2

    .line 25
    iget-object v0, p0, Ll/᩷۫ᩳ;->᩶:Ll/۟᩸ᩳ;

    invoke-virtual {v0}, Ll/۟᩸ᩳ;->length()I

    move-result v0

    iget v1, p0, Ll/᩷۫ᩳ;->᩸:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 2

    if-ltz p1, :cond_0

    if-lt p2, p1, :cond_0

    .line 77
    invoke-virtual {p0}, Ll/᩷۫ᩳ;->length()I

    move-result v0

    if-gt p2, v0, :cond_0

    sub-int v0, p2, p1

    .line 85
    new-array v0, v0, [C

    const/4 v1, 0x0

    .line 86
    invoke-virtual {p0, p1, p2, v0, v1}, Ll/᩷۫ᩳ;->getChars(II[CI)V

    .line 87
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/lang/String;-><init>([C)V

    return-object p1

    .line 78
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Invalid preview range"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 92
    invoke-virtual {p0}, Ll/᩷۫ᩳ;->length()I

    move-result v0

    if-ltz v0, :cond_0

    .line 77
    invoke-virtual {p0}, Ll/᩷۫ᩳ;->length()I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 85
    new-array v1, v0, [C

    const/4 v2, 0x0

    .line 86
    invoke-virtual {p0, v2, v0, v1, v2}, Ll/᩷۫ᩳ;->getChars(II[CI)V

    .line 87
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0

    .line 78
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Invalid preview range"

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
