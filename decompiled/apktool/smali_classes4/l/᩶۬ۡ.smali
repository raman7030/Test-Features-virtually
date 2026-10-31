.class public final Ll/᩶۬ۡ;
.super Ljava/lang/Object;
.source "Y91P"

# interfaces
.implements Ljava/lang/CharSequence;
.implements Landroid/text/Spanned;


# instance fields
.field public final ᩶:I

.field public final ᩸:I

.field public final ᩹:Landroid/text/Spanned;


# direct methods
.method public constructor <init>(Landroid/text/Spanned;II)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Ll/᩶۬ۡ;->᩹:Landroid/text/Spanned;

    .line 44
    iput p2, p0, Ll/᩶۬ۡ;->᩶:I

    sub-int/2addr p3, p2

    .line 45
    iput p3, p0, Ll/᩶۬ۡ;->᩸:I

    return-void
.end method


# virtual methods
.method public final charAt(I)C
    .locals 1

    if-ltz p1, :cond_1

    .line 53
    iget v0, p0, Ll/᩶۬ۡ;->᩸:I

    if-ge p1, v0, :cond_1

    .line 56
    iget v0, p0, Ll/᩶۬ۡ;->᩶:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/᩶۬ۡ;->᩹:Landroid/text/Spanned;

    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    .line 57
    invoke-static {p1}, Ljava/lang/Character;->isLowerCase(C)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 58
    invoke-static {p1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result p1

    :cond_0
    return p1

    .line 54
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final getSpanEnd(Ljava/lang/Object;)I
    .locals 1

    .line 90
    iget-object v0, p0, Ll/᩶۬ۡ;->᩹:Landroid/text/Spanned;

    invoke-interface {v0, p1}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result p1

    iget v0, p0, Ll/᩶۬ۡ;->᩶:I

    sub-int/2addr p1, v0

    return p1
.end method

.method public final getSpanFlags(Ljava/lang/Object;)I
    .locals 1

    .line 94
    iget-object v0, p0, Ll/᩶۬ۡ;->᩹:Landroid/text/Spanned;

    invoke-interface {v0, p1}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final getSpanStart(Ljava/lang/Object;)I
    .locals 1

    .line 86
    iget-object v0, p0, Ll/᩶۬ۡ;->᩹:Landroid/text/Spanned;

    invoke-interface {v0, p1}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result p1

    iget v0, p0, Ll/᩶۬ۡ;->᩶:I

    sub-int/2addr p1, v0

    return p1
.end method

.method public final getSpans(IILjava/lang/Class;)[Ljava/lang/Object;
    .locals 1

    .line 82
    iget v0, p0, Ll/᩶۬ۡ;->᩶:I

    add-int/2addr p1, v0

    add-int/2addr v0, p2

    iget-object p2, p0, Ll/᩶۬ۡ;->᩹:Landroid/text/Spanned;

    invoke-interface {p2, p1, v0, p3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final length()I
    .locals 1

    .line 49
    iget v0, p0, Ll/᩶۬ۡ;->᩸:I

    return v0
.end method

.method public final nextSpanTransition(IILjava/lang/Class;)I
    .locals 2

    .line 98
    iget v0, p0, Ll/᩶۬ۡ;->᩶:I

    add-int/2addr p1, v0

    add-int/2addr p2, v0

    iget-object v1, p0, Ll/᩶۬ۡ;->᩹:Landroid/text/Spanned;

    invoke-interface {v1, p1, p2, p3}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    move-result p1

    sub-int/2addr p1, v0

    return p1
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 2

    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    .line 65
    iget v0, p0, Ll/᩶۬ۡ;->᩸:I

    if-gt p2, v0, :cond_0

    if-gt p1, p2, :cond_0

    .line 68
    new-instance v0, Ll/᩶۬ۡ;

    iget v1, p0, Ll/᩶۬ۡ;->᩶:I

    add-int/2addr p1, v1

    add-int/2addr v1, p2

    iget-object p2, p0, Ll/᩶۬ۡ;->᩹:Landroid/text/Spanned;

    invoke-direct {v0, p2, p1, v1}, Ll/᩶۬ۡ;-><init>(Landroid/text/Spanned;II)V

    return-object v0

    .line 66
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 74
    iget v0, p0, Ll/᩶۬ۡ;->᩸:I

    new-array v1, v0, [C

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 76
    invoke-virtual {p0, v2}, Ll/᩶۬ۡ;->charAt(I)C

    move-result v3

    aput-char v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 78
    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method
