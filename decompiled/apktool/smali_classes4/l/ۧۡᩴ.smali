.class public final Ll/ۧۡᩴ;
.super Ll/᩹ۡᩴ;
.source "K9S0"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Ljava/lang/Cloneable;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J

.field public static final ᩹:Ll/ۧۡᩴ;


# instance fields
.field public final ᩸:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 39
    new-instance v0, Ll/ۧۡᩴ;

    sget-object v1, Ll/᩵ۢᩴ;->ۧ:[I

    invoke-direct {v0, v1}, Ll/ۧۡᩴ;-><init>([I)V

    sput-object v0, Ll/ۧۡᩴ;->᩹:Ll/ۧۡᩴ;

    return-void
.end method

.method public constructor <init>([I)V
    .locals 0

    .line 1245
    invoke-direct {p0}, Ll/ۤܿᩴ;-><init>()V

    .line 52
    iput-object p1, p0, Ll/ۧۡᩴ;->᩸:[I

    return-void
.end method

.method public static synthetic ֫(Ll/ۧۡᩴ;)[I
    .locals 0

    .line 36
    iget-object p0, p0, Ll/ۧۡᩴ;->᩸:[I

    return-object p0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 36
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Ll/ۧۡᩴ;->֫(Ljava/util/List;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    .line 746
    :cond_1
    instance-of v2, p1, Ljava/util/List;

    if-nez v2, :cond_2

    return v1

    .line 747
    :cond_2
    instance-of v2, p1, Ll/ۧۡᩴ;

    if-eqz v2, :cond_6

    .line 748
    check-cast p1, Ll/ۧۡᩴ;

    if-ne p1, p0, :cond_3

    goto :goto_0

    .line 733
    :cond_3
    iget-object p1, p1, Ll/ۧۡᩴ;->᩸:[I

    iget-object v2, p0, Ll/ۧۡᩴ;->᩸:[I

    if-ne v2, p1, :cond_4

    :goto_0
    return v0

    .line 193
    :cond_4
    array-length v0, v2

    array-length v3, p1

    if-eq v0, v3, :cond_5

    return v1

    .line 738
    :cond_5
    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    return p1

    .line 750
    :cond_6
    instance-of v0, p1, Ll/۟ۢᩴ;

    if-eqz v0, :cond_7

    .line 752
    check-cast p1, Ll/۟ۢᩴ;

    invoke-virtual {p1, p0}, Ll/۟ۢᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 754
    :cond_7
    invoke-super {p0, p1}, Ll/ۤܿᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final forEach(Ljava/util/function/IntConsumer;)V
    .locals 3

    const/4 v0, 0x0

    .line 218
    :goto_0
    iget-object v1, p0, Ll/ۧۡᩴ;->᩸:[I

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 219
    aget v1, v1, v0

    invoke-interface {p1, v1}, Ljava/util/function/IntConsumer;->accept(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final getInt(I)I
    .locals 4

    .line 173
    iget-object v0, p0, Ll/ۧۡᩴ;->᩸:[I

    array-length v1, v0

    if-ge p1, v1, :cond_0

    .line 174
    aget p1, v0, p1

    return p1

    .line 173
    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "Index ("

    const-string v3, ") is greater than or equal to list size ("

    .line 0
    invoke-static {p1, v2, v3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 173
    array-length v0, v0

    const-string v2, ")"

    .line 0
    invoke-static {v0, v2, p1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 173
    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final indexOf(I)I
    .locals 4

    .line 180
    iget-object v0, p0, Ll/ۧۡᩴ;->᩸:[I

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget v3, v0, v2

    if-ne p1, v3, :cond_0

    return v2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 198
    iget-object v0, p0, Ll/ۧۡᩴ;->᩸:[I

    array-length v0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final lastIndexOf(I)I
    .locals 3

    .line 187
    iget-object v0, p0, Ll/ۧۡᩴ;->᩸:[I

    array-length v1, v0

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_1

    aget v1, v0, v2

    if-ne p1, v1, :cond_0

    return v2

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final listIterator(I)Ll/ܶۡᩴ;
    .locals 1

    .line 238
    invoke-virtual {p0, p1}, Ll/ۤܿᩴ;->֫(I)V

    .line 239
    new-instance v0, Ll/ۨۢᩴ;

    invoke-direct {v0, p0, p1}, Ll/ۨۢᩴ;-><init>(Ll/ۧۡᩴ;I)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 193
    iget-object v0, p0, Ll/ۧۡᩴ;->᩸:[I

    array-length v0, v0

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ۧۡᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 391
    new-instance v0, Ll/֫ۡᩴ;

    invoke-direct {v0, p0}, Ll/֫ۡᩴ;-><init>(Ll/ۧۡᩴ;)V

    return-object v0
.end method

.method public final spliterator()Ll/ܽܺᩴ;
    .locals 1

    .line 391
    new-instance v0, Ll/֫ۡᩴ;

    invoke-direct {v0, p0}, Ll/֫ۡᩴ;-><init>(Ll/ۧۡᩴ;)V

    return-object v0
.end method

.method public final subList(II)Ll/֨ۡᩴ;
    .locals 4

    if-nez p1, :cond_0

    .line 193
    iget-object v0, p0, Ll/ۧۡᩴ;->᩸:[I

    array-length v0, v0

    if-ne p2, v0, :cond_0

    return-object p0

    .line 710
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۤܿᩴ;->֫(I)V

    .line 711
    invoke-virtual {p0, p2}, Ll/ۤܿᩴ;->֫(I)V

    if-ne p1, p2, :cond_1

    .line 712
    sget-object p1, Ll/ۧۡᩴ;->᩹:Ll/ۧۡᩴ;

    return-object p1

    :cond_1
    if-gt p1, p2, :cond_2

    .line 714
    new-instance v0, Ll/۟ۢᩴ;

    invoke-direct {v0, p0, p1, p2}, Ll/۟ۢᩴ;-><init>(Ll/ۧۡᩴ;II)V

    return-object v0

    .line 713
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, ") is greater than end index ("

    const-string v2, ")"

    const-string v3, "Start index ("

    .line 0
    invoke-static {v3, p1, v1, v2, p2}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    .line 713
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ljava/util/List;)I
    .locals 7

    .line 785
    instance-of v0, p1, Ll/ۧۡᩴ;

    if-eqz v0, :cond_5

    .line 786
    check-cast p1, Ll/ۧۡᩴ;

    .line 769
    iget-object p1, p1, Ll/ۧۡᩴ;->᩸:[I

    const/4 v0, 0x0

    iget-object v1, p0, Ll/ۧۡᩴ;->᩸:[I

    if-ne v1, p1, :cond_0

    goto :goto_1

    .line 193
    :cond_0
    array-length v2, v1

    array-length v3, p1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    if-ge v4, v3, :cond_2

    .line 776
    aget v5, v1, v4

    .line 777
    aget v6, p1, v4

    .line 778
    invoke-static {v5, v6}, Ljava/lang/Integer;->compare(II)I

    move-result v5

    if-eqz v5, :cond_1

    return v5

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-ge v4, v3, :cond_3

    const/4 p1, -0x1

    return p1

    :cond_3
    if-ge v4, v2, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_1
    return v0

    .line 788
    :cond_5
    instance-of v0, p1, Ll/۟ۢᩴ;

    if-eqz v0, :cond_6

    .line 791
    check-cast p1, Ll/۟ۢᩴ;

    .line 793
    invoke-virtual {p1, p0}, Ll/۟ۢᩴ;->֫(Ljava/util/List;)I

    move-result p1

    neg-int p1, p1

    return p1

    .line 795
    :cond_6
    invoke-super {p0, p1}, Ll/ۤܿᩴ;->֫(Ljava/util/List;)I

    move-result p1

    return p1
.end method

.method public final ֫(III[I)V
    .locals 1

    .line 356
    array-length v0, p4

    invoke-static {v0, p2, p3}, Ll/ۢ᩹ۡ;->ۧ(III)V

    .line 212
    iget-object v0, p0, Ll/ۧۡᩴ;->᩸:[I

    invoke-static {v0, p1, p4, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final ܶ()[I
    .locals 2

    .line 225
    iget-object v0, p0, Ll/ۧۡᩴ;->᩸:[I

    array-length v1, v0

    if-nez v1, :cond_0

    sget-object v0, Ll/᩵ۢᩴ;->ۧ:[I

    return-object v0

    .line 226
    :cond_0
    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method
