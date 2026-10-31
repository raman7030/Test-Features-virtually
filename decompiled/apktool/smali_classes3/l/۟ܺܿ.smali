.class public final Ll/۟ܺܿ;
.super Ljava/lang/Object;
.source "T70E"

# interfaces
.implements Ll/᩺۬ۡ;


# instance fields
.field public final ᩸:Ljava/lang/CharSequence;

.field public final synthetic ᩹:Ll/֫ۖܿ;


# direct methods
.method public constructor <init>(Ll/֫ۖܿ;Ljava/lang/CharSequence;)V
    .locals 0

    .line 392
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ܺܿ;->᩹:Ll/֫ۖܿ;

    .line 393
    iput-object p2, p0, Ll/۟ܺܿ;->᩸:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final charAt(I)C
    .locals 3

    .line 403
    iget-object v0, p0, Ll/۟ܺܿ;->᩸:Ljava/lang/CharSequence;

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    add-int/lit8 v1, p1, 0x1

    .line 404
    iget-object v2, p0, Ll/۟ܺܿ;->᩹:Ll/֫ۖܿ;

    invoke-static {v2, p1, v1}, Ll/֫ۖܿ;->֫(Ll/֫ۖܿ;II)V

    return v0
.end method

.method public final indexOf(CII)I
    .locals 5

    const/4 v0, 0x0

    .line 413
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 414
    iget-object v0, p0, Ll/۟ܺܿ;->᩹:Ll/֫ۖܿ;

    invoke-static {v0}, Ll/֫ۖܿ;->֫(Ll/֫ۖܿ;)I

    move-result v1

    invoke-static {v1, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    const/4 v1, -0x1

    if-lt p2, p3, :cond_0

    return v1

    .line 417
    :cond_0
    iget-object v2, p0, Ll/۟ܺܿ;->᩸:Ljava/lang/CharSequence;

    instance-of v3, v2, Ll/᩺۬ۡ;

    if-eqz v3, :cond_3

    check-cast v2, Ll/᩺۬ۡ;

    .line 418
    invoke-interface {v2, p1, p2, p3}, Ll/᩺۬ۡ;->indexOf(CII)I

    move-result p1

    if-lt p1, v1, :cond_2

    if-ltz p1, :cond_1

    if-lt p1, p2, :cond_2

    if-ge p1, p3, :cond_2

    :cond_1
    move v1, p1

    goto :goto_1

    .line 420
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Searchable syntax text returned an invalid index"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    move v3, p2

    :goto_0
    if-ge v3, p3, :cond_5

    .line 425
    invoke-interface {v2, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    if-ne v4, p1, :cond_4

    move v1, v3

    goto :goto_1

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    if-gez v1, :cond_6

    goto :goto_2

    :cond_6
    add-int/lit8 p3, v1, 0x1

    .line 431
    :goto_2
    invoke-static {v0, p2, p3}, Ll/֫ۖܿ;->֫(Ll/֫ۖܿ;II)V

    return v1
.end method

.method public final lastIndexOf(CII)I
    .locals 1

    const/4 p1, 0x0

    .line 17
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 398
    iget-object p2, p0, Ll/۟ܺܿ;->᩹:Ll/֫ۖܿ;

    invoke-static {p2}, Ll/֫ۖܿ;->֫(Ll/֫ۖܿ;)I

    move-result p2

    .line 18
    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_0
    if-le p2, p1, :cond_1

    add-int/lit8 p2, p2, -0x1

    .line 20
    invoke-virtual {p0, p2}, Ll/۟ܺܿ;->charAt(I)C

    move-result p3

    const/16 v0, 0xa

    if-ne p3, v0, :cond_0

    return p2

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final length()I
    .locals 1

    .line 398
    iget-object v0, p0, Ll/۟ܺܿ;->᩹:Ll/֫ۖܿ;

    invoke-static {v0}, Ll/֫ۖܿ;->֫(Ll/֫ۖܿ;)I

    move-result v0

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 1

    .line 438
    new-instance v0, Ll/۬۬ۡ;

    invoke-direct {v0, p1, p2, p0}, Ll/۬۬ۡ;-><init>(IILjava/lang/CharSequence;)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 445
    iget-object v0, p0, Ll/۟ܺܿ;->᩸:Ljava/lang/CharSequence;

    instance-of v1, v0, Ljava/lang/String;

    const/4 v2, 0x0

    iget-object v3, p0, Ll/۟ܺܿ;->᩹:Ll/֫ۖܿ;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/String;

    .line 447
    invoke-static {v3}, Ll/֫ۖܿ;->֫(Ll/֫ۖܿ;)I

    move-result v1

    invoke-static {v3, v2, v1}, Ll/֫ۖܿ;->֫(Ll/֫ۖܿ;II)V

    return-object v0

    .line 450
    :cond_0
    new-instance v0, Ll/۬۬ۡ;

    invoke-static {v3}, Ll/֫ۖܿ;->֫(Ll/֫ۖܿ;)I

    move-result v1

    invoke-direct {v0, v2, v1, p0}, Ll/۬۬ۡ;-><init>(IILjava/lang/CharSequence;)V

    invoke-virtual {v0}, Ll/۬۬ۡ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
