.class public final Ll/۟ۢᩴ;
.super Ll/᩹ۡᩴ;
.source "K9S0"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0x61e71d43d2fd0301L


# instance fields
.field public final ۙ:I

.field public final ᩶:Ll/ۧۡᩴ;

.field public final transient ᩸:[I

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/ۧۡᩴ;II)V
    .locals 0

    .line 1245
    invoke-direct {p0}, Ll/ۤܿᩴ;-><init>()V

    .line 408
    iput-object p1, p0, Ll/۟ۢᩴ;->᩶:Ll/ۧۡᩴ;

    .line 409
    iput p2, p0, Ll/۟ۢᩴ;->᩹:I

    .line 410
    iput p3, p0, Ll/۟ۢᩴ;->ۙ:I

    .line 411
    invoke-static {p1}, Ll/ۧۡᩴ;->֫(Ll/ۧۡᩴ;)[I

    move-result-object p1

    iput-object p1, p0, Ll/۟ۢᩴ;->᩸:[I

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 3

    .line 679
    :try_start_0
    iget-object v0, p0, Ll/۟ۢᩴ;->᩶:Ll/ۧۡᩴ;

    iget v1, p0, Ll/۟ۢᩴ;->᩹:I

    iget v2, p0, Ll/۟ۢᩴ;->ۙ:I

    invoke-virtual {v0, v1, v2}, Ll/ۧۡᩴ;->subList(II)Ll/֨ۡᩴ;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 681
    :goto_0
    new-instance v1, Ljava/io/InvalidObjectException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/io/InvalidObjectException;

    throw v0
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 394
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Ll/۟ۢᩴ;->֫(Ljava/util/List;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    .line 631
    :cond_1
    instance-of v1, p1, Ljava/util/List;

    if-nez v1, :cond_2

    return v0

    .line 632
    :cond_2
    instance-of v1, p1, Ll/ۧۡᩴ;

    if-eqz v1, :cond_3

    .line 634
    check-cast p1, Ll/ۧۡᩴ;

    .line 635
    invoke-static {p1}, Ll/ۧۡᩴ;->֫(Ll/ۧۡᩴ;)[I

    move-result-object v1

    invoke-virtual {p1}, Ll/ۧۡᩴ;->size()I

    move-result p1

    invoke-virtual {p0, v0, p1, v1}, Ll/۟ۢᩴ;->ᩳ(II[I)Z

    move-result p1

    return p1

    .line 637
    :cond_3
    instance-of v0, p1, Ll/۟ۢᩴ;

    if-eqz v0, :cond_4

    .line 639
    check-cast p1, Ll/۟ۢᩴ;

    .line 640
    iget-object v0, p1, Ll/۟ۢᩴ;->᩸:[I

    iget v1, p1, Ll/۟ۢᩴ;->᩹:I

    iget p1, p1, Ll/۟ۢᩴ;->ۙ:I

    invoke-virtual {p0, v1, p1, v0}, Ll/۟ۢᩴ;->ᩳ(II[I)Z

    move-result p1

    return p1

    .line 642
    :cond_4
    invoke-super {p0, p1}, Ll/ۤܿᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final forEach(Ljava/util/function/IntConsumer;)V
    .locals 2

    .line 455
    iget v0, p0, Ll/۟ۢᩴ;->᩹:I

    :goto_0
    iget v1, p0, Ll/۟ۢᩴ;->ۙ:I

    if-ge v0, v1, :cond_0

    .line 456
    iget-object v1, p0, Ll/۟ۢᩴ;->᩸:[I

    aget v1, v1, v0

    invoke-interface {p1, v1}, Ljava/util/function/IntConsumer;->accept(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final getInt(I)I
    .locals 1

    .line 416
    invoke-virtual {p0, p1}, Ll/ۤܿᩴ;->ᩳ(I)V

    .line 417
    iget v0, p0, Ll/۟ۢᩴ;->᩹:I

    add-int/2addr p1, v0

    iget-object v0, p0, Ll/۟ۢᩴ;->᩸:[I

    aget p1, v0, p1

    return p1
.end method

.method public final indexOf(I)I
    .locals 3

    .line 423
    iget v0, p0, Ll/۟ۢᩴ;->᩹:I

    move v1, v0

    :goto_0
    iget v2, p0, Ll/۟ۢᩴ;->ۙ:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Ll/۟ۢᩴ;->᩸:[I

    aget v2, v2, v1

    if-ne p1, v2, :cond_0

    sub-int/2addr v1, v0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final isEmpty()Z
    .locals 2

    .line 441
    iget v0, p0, Ll/۟ۢᩴ;->ۙ:I

    iget v1, p0, Ll/۟ۢᩴ;->᩹:I

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final lastIndexOf(I)I
    .locals 3

    .line 430
    iget v0, p0, Ll/۟ۢᩴ;->ۙ:I

    :goto_0
    add-int/lit8 v1, v0, -0x1

    iget v2, p0, Ll/۟ۢᩴ;->᩹:I

    if-eq v0, v2, :cond_1

    iget-object v0, p0, Ll/۟ۢᩴ;->᩸:[I

    aget v0, v0, v1

    if-ne p1, v0, :cond_0

    sub-int/2addr v1, v2

    return v1

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final listIterator(I)Ll/ܶۡᩴ;
    .locals 1

    .line 474
    invoke-virtual {p0, p1}, Ll/ۤܿᩴ;->֫(I)V

    .line 475
    new-instance v0, Ll/᩺ۢᩴ;

    invoke-direct {v0, p0, p1}, Ll/᩺ۢᩴ;-><init>(Ll/۟ۢᩴ;I)V

    return-object v0
.end method

.method public final size()I
    .locals 2

    .line 436
    iget v0, p0, Ll/۟ۢᩴ;->ۙ:I

    iget v1, p0, Ll/۟ۢᩴ;->᩹:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/۟ۢᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 607
    new-instance v0, Ll/ܰۢᩴ;

    invoke-direct {v0, p0}, Ll/ܰۢᩴ;-><init>(Ll/۟ۢᩴ;)V

    return-object v0
.end method

.method public final spliterator()Ll/ܽܺᩴ;
    .locals 1

    .line 607
    new-instance v0, Ll/ܰۢᩴ;

    invoke-direct {v0, p0}, Ll/ܰۢᩴ;-><init>(Ll/۟ۢᩴ;)V

    return-object v0
.end method

.method public final subList(II)Ll/֨ۡᩴ;
    .locals 4

    .line 690
    invoke-virtual {p0, p1}, Ll/ۤܿᩴ;->֫(I)V

    .line 691
    invoke-virtual {p0, p2}, Ll/ۤܿᩴ;->֫(I)V

    if-ne p1, p2, :cond_0

    .line 692
    sget-object p1, Ll/ۧۡᩴ;->᩹:Ll/ۧۡᩴ;

    return-object p1

    :cond_0
    if-gt p1, p2, :cond_1

    .line 694
    new-instance v0, Ll/۟ۢᩴ;

    iget v1, p0, Ll/۟ۢᩴ;->᩹:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    iget-object v1, p0, Ll/۟ۢᩴ;->᩶:Ll/ۧۡᩴ;

    invoke-direct {v0, v1, p1, p2}, Ll/۟ۢᩴ;-><init>(Ll/ۧۡᩴ;II)V

    return-object v0

    .line 693
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, ") is greater than end index ("

    const-string v2, ")"

    const-string v3, "Start index ("

    .line 0
    invoke-static {v3, p1, v1, v2, p2}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    .line 693
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ljava/util/List;)I
    .locals 2

    .line 661
    instance-of v0, p1, Ll/ۧۡᩴ;

    if-eqz v0, :cond_0

    .line 663
    check-cast p1, Ll/ۧۡᩴ;

    .line 664
    invoke-static {p1}, Ll/ۧۡᩴ;->֫(Ll/ۧۡᩴ;)[I

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1}, Ll/ۧۡᩴ;->size()I

    move-result p1

    invoke-virtual {p0, v1, p1, v0}, Ll/۟ۢᩴ;->ܽ(II[I)I

    move-result p1

    return p1

    .line 666
    :cond_0
    instance-of v0, p1, Ll/۟ۢᩴ;

    if-eqz v0, :cond_1

    .line 668
    check-cast p1, Ll/۟ۢᩴ;

    .line 669
    iget-object v0, p1, Ll/۟ۢᩴ;->᩸:[I

    iget v1, p1, Ll/۟ۢᩴ;->᩹:I

    iget p1, p1, Ll/۟ۢᩴ;->ۙ:I

    invoke-virtual {p0, v1, p1, v0}, Ll/۟ۢᩴ;->ܽ(II[I)I

    move-result p1

    return p1

    .line 671
    :cond_1
    invoke-super {p0, p1}, Ll/ۤܿᩴ;->֫(Ljava/util/List;)I

    move-result p1

    return p1
.end method

.method public final ֫(III[I)V
    .locals 3

    .line 356
    array-length v0, p4

    invoke-static {v0, p2, p3}, Ll/ۢ᩹ۡ;->ۧ(III)V

    .line 447
    invoke-virtual {p0, p1}, Ll/ۤܿᩴ;->ᩳ(I)V

    .line 448
    iget v0, p0, Ll/۟ۢᩴ;->᩹:I

    add-int v1, v0, p3

    iget v2, p0, Ll/۟ۢᩴ;->ۙ:I

    if-gt v1, v2, :cond_0

    .line 449
    iget-object v1, p0, Ll/۟ۢᩴ;->᩸:[I

    add-int/2addr p1, v0

    invoke-static {v1, p1, p4, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    .line 448
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p4, "Final index "

    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int p4, v0, p3

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, " (startingIndex: "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, " + length: "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ") is greater then list length "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/۟ۢᩴ;->size()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܶ()[I
    .locals 3

    .line 462
    iget v0, p0, Ll/۟ۢᩴ;->᩹:I

    iget v1, p0, Ll/۟ۢᩴ;->ۙ:I

    iget-object v2, p0, Ll/۟ۢᩴ;->᩸:[I

    invoke-static {v2, v0, v1}, Ljava/util/Arrays;->copyOfRange([III)[I

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(II[I)I
    .locals 6

    const/4 v0, 0x0

    .line 647
    iget v1, p0, Ll/۟ۢᩴ;->ۙ:I

    iget v2, p0, Ll/۟ۢᩴ;->᩹:I

    iget-object v3, p0, Ll/۟ۢᩴ;->᩸:[I

    if-ne v3, p3, :cond_0

    if-ne v2, p1, :cond_0

    if-ne v1, p2, :cond_0

    return v0

    :cond_0
    :goto_0
    if-ge v2, v1, :cond_2

    if-ge v2, p2, :cond_2

    .line 652
    aget v4, v3, v2

    .line 653
    aget v5, p3, p1

    .line 654
    invoke-static {v4, v5}, Ljava/lang/Integer;->compare(II)I

    move-result v4

    if-eqz v4, :cond_1

    return v4

    :cond_1
    add-int/lit8 v2, v2, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    if-ge v2, p2, :cond_3

    const/4 p1, -0x1

    return p1

    :cond_3
    if-ge v2, v1, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    return v0
.end method

.method public final ᩳ(II[I)Z
    .locals 6

    .line 611
    iget v0, p0, Ll/۟ۢᩴ;->ۙ:I

    iget v1, p0, Ll/۟ۢᩴ;->᩹:I

    const/4 v2, 0x1

    iget-object v3, p0, Ll/۟ۢᩴ;->᩸:[I

    if-ne v3, p3, :cond_0

    if-ne v1, p1, :cond_0

    if-ne v0, p2, :cond_0

    return v2

    :cond_0
    sub-int/2addr p2, p1

    .line 614
    invoke-virtual {p0}, Ll/۟ۢᩴ;->size()I

    move-result v4

    const/4 v5, 0x0

    if-eq p2, v4, :cond_1

    return v5

    :cond_1
    :goto_0
    if-ge v1, v0, :cond_3

    add-int/lit8 p2, v1, 0x1

    .line 623
    aget v1, v3, v1

    add-int/lit8 v4, p1, 0x1

    aget p1, p3, p1

    if-eq v1, p1, :cond_2

    return v5

    :cond_2
    move v1, p2

    move p1, v4

    goto :goto_0

    :cond_3
    return v2
.end method
