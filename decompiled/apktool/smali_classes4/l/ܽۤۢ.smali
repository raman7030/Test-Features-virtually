.class public final Ll/ܽۤۢ;
.super Ljava/lang/Object;
.source "F6QC"

# interfaces
.implements Ljava/lang/CharSequence;


# instance fields
.field public final ᩸:I

.field public final ᩹:[Ljava/lang/CharSequence;


# direct methods
.method public varargs constructor <init>([Ljava/lang/CharSequence;)V
    .locals 8

    .line 398
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 399
    iput-object p1, p0, Ll/ܽۤۢ;->᩹:[Ljava/lang/CharSequence;

    .line 401
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v3, p1, v1

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    int-to-long v4, v2

    int-to-long v2, v3

    add-long/2addr v4, v2

    long-to-int v2, v4

    int-to-long v6, v2

    cmp-long v3, v4, v6

    if-nez v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 0
    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    .line 402
    :cond_1
    iput v2, p0, Ll/ܽۤۢ;->᩸:I

    return-void
.end method


# virtual methods
.method public final charAt(I)C
    .locals 5

    if-ltz p1, :cond_2

    .line 406
    iget v0, p0, Ll/ܽۤۢ;->᩸:I

    if-ge p1, v0, :cond_2

    .line 407
    iget-object v0, p0, Ll/ܽۤۢ;->᩹:[Ljava/lang/CharSequence;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 408
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge p1, v4, :cond_0

    invoke-interface {v3, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    return p1

    .line 409
    :cond_0
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    sub-int/2addr p1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 411
    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    .line 406
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final length()I
    .locals 1

    .line 404
    iget v0, p0, Ll/ܽۤۢ;->᩸:I

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 1

    .line 413
    new-instance v0, Ll/۬۬ۡ;

    invoke-direct {v0, p1, p2, p0}, Ll/۬۬ۡ;-><init>(IILjava/lang/CharSequence;)V

    return-object v0
.end method
