.class public final Ll/᩹֫ᩴ;
.super Ll/᩵ܰۘ;
.source "UCGS"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Ljava/lang/Cloneable;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583eaL


# instance fields
.field public transient ᩸:[C

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 99
    invoke-direct {p0}, Ll/᩵ܰۘ;-><init>()V

    .line 100
    sget-object v0, Ll/۬֫ᩴ;->֫:[C

    iput-object v0, p0, Ll/᩹֫ᩴ;->᩸:[C

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    .line 93
    invoke-direct {p0}, Ll/᩵ܰۘ;-><init>()V

    if-ltz p1, :cond_1

    if-nez p1, :cond_0

    .line 84
    sget-object p1, Ll/۬֫ᩴ;->ۧ:[C

    iput-object p1, p0, Ll/᩹֫ᩴ;->᩸:[C

    return-void

    .line 85
    :cond_0
    new-array p1, p1, [C

    iput-object p1, p0, Ll/᩹֫ᩴ;->᩸:[C

    return-void

    .line 83
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Initial capacity ("

    const-string v2, ") is negative"

    .line 0
    invoke-static {p1, v1, v2}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 83
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>([C)V
    .locals 3

    .line 162
    array-length v0, p1

    .line 173
    invoke-direct {p0, v0}, Ll/᩹֫ᩴ;-><init>(I)V

    .line 174
    iget-object v1, p0, Ll/᩹֫ᩴ;->᩸:[C

    const/4 v2, 0x0

    invoke-static {p1, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 175
    iput v0, p0, Ll/᩹֫ᩴ;->᩹:I

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 3

    .line 1055
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 1056
    iget v0, p0, Ll/᩹֫ᩴ;->᩹:I

    new-array v0, v0, [C

    iput-object v0, p0, Ll/᩹֫ᩴ;->᩸:[C

    const/4 v1, 0x0

    .line 1057
    :goto_0
    iget v2, p0, Ll/᩹֫ᩴ;->᩹:I

    if-ge v1, v2, :cond_0

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readChar()C

    move-result v2

    aput-char v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 3

    .line 1049
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 1050
    iget-object v0, p0, Ll/᩹֫ᩴ;->᩸:[C

    const/4 v1, 0x0

    .line 1051
    :goto_0
    iget v2, p0, Ll/᩹֫ᩴ;->᩹:I

    if-ge v1, v2, :cond_0

    aget-char v2, v0, v1

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeChar(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ܿ(I)V
    .locals 5

    .line 280
    iget-object v0, p0, Ll/᩹֫ᩴ;->᩸:[C

    array-length v1, v0

    if-gt p1, v1, :cond_0

    return-void

    .line 281
    :cond_0
    sget-object v1, Ll/۬֫ᩴ;->֫:[C

    if-eq v0, v1, :cond_1

    array-length v1, v0

    int-to-long v1, v1

    array-length v0, v0

    shr-int/lit8 v0, v0, 0x1

    int-to-long v3, v0

    add-long/2addr v1, v3

    const-wide/32 v3, 0x7ffffff7

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    int-to-long v2, p1

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    long-to-int p1, v0

    goto :goto_0

    :cond_1
    const/16 v0, 0xa

    if-ge p1, v0, :cond_2

    const/16 p1, 0xa

    .line 283
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/᩹֫ᩴ;->᩸:[C

    iget v1, p0, Ll/᩹֫ᩴ;->᩹:I

    .line 126
    new-array p1, p1, [C

    const/4 v2, 0x0

    .line 127
    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 283
    iput-object p1, p0, Ll/᩹֫ᩴ;->᩸:[C

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    const/4 v0, 0x0

    .line 355
    iput v0, p0, Ll/᩹֫ᩴ;->᩹:I

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 3

    .line 954
    new-instance v0, Ll/᩹֫ᩴ;

    iget-object v1, p0, Ll/᩹֫ᩴ;->᩸:[C

    iget v2, p0, Ll/᩹֫ᩴ;->᩹:I

    if-nez v2, :cond_0

    .line 62
    sget-object v1, Ll/۬֫ᩴ;->ۧ:[C

    goto :goto_0

    .line 63
    :cond_0
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object v1

    .line 78
    :goto_0
    invoke-direct {v0}, Ll/᩵ܰۘ;-><init>()V

    .line 79
    iput-object v1, v0, Ll/᩹֫ᩴ;->᩸:[C

    .line 955
    iget v1, p0, Ll/᩹֫ᩴ;->᩹:I

    iput v1, v0, Ll/᩹֫ᩴ;->᩹:I

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    .line 997
    :cond_1
    instance-of v2, p1, Ljava/util/List;

    if-nez v2, :cond_2

    return v1

    .line 998
    :cond_2
    instance-of v2, p1, Ll/᩹֫ᩴ;

    if-eqz v2, :cond_8

    .line 1000
    check-cast p1, Ll/᩹֫ᩴ;

    if-ne p1, p0, :cond_3

    goto :goto_2

    .line 361
    :cond_3
    iget v2, p0, Ll/᩹֫ᩴ;->᩹:I

    iget v3, p1, Ll/᩹֫ᩴ;->᩹:I

    if-eq v2, v3, :cond_4

    goto :goto_1

    .line 985
    :cond_4
    iget-object v4, p0, Ll/᩹֫ᩴ;->᩸:[C

    .line 986
    iget-object p1, p1, Ll/᩹֫ᩴ;->᩸:[C

    if-ne v4, p1, :cond_5

    if-ne v2, v3, :cond_5

    goto :goto_2

    :cond_5
    :goto_0
    add-int/lit8 v3, v2, -0x1

    if-eqz v2, :cond_7

    .line 988
    aget-char v2, v4, v3

    aget-char v5, p1, v3

    if-eq v2, v5, :cond_6

    :goto_1
    return v1

    :cond_6
    move v2, v3

    goto :goto_0

    :cond_7
    :goto_2
    return v0

    .line 1002
    :cond_8
    instance-of v0, p1, Ll/᩸֫ᩴ;

    if-eqz v0, :cond_9

    .line 1005
    check-cast p1, Ll/᩸֫ᩴ;

    invoke-virtual {p1, p0}, Ll/᩸֫ᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 1007
    :cond_9
    invoke-super {p0, p1}, Ll/᩵ܰۘ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final getChar(I)C
    .locals 3

    .line 307
    iget v0, p0, Ll/᩹֫ᩴ;->᩹:I

    if-ge p1, v0, :cond_0

    .line 308
    iget-object v0, p0, Ll/᩹֫ᩴ;->᩸:[C

    aget-char p1, v0, p1

    return p1

    .line 307
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Index ("

    const-string v2, ") is greater than or equal to list size ("

    .line 0
    invoke-static {p1, v1, v2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 307
    iget v1, p0, Ll/᩹֫ᩴ;->᩹:I

    const-string v2, ")"

    .line 0
    invoke-static {v1, v2, p1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 307
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final indexOf(C)I
    .locals 3

    .line 313
    iget-object v0, p0, Ll/᩹֫ᩴ;->᩸:[C

    const/4 v1, 0x0

    .line 314
    :goto_0
    iget v2, p0, Ll/᩹֫ᩴ;->᩹:I

    if-ge v1, v2, :cond_1

    aget-char v2, v0, v1

    if-ne p1, v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 373
    iget v0, p0, Ll/᩹֫ᩴ;->᩹:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final lastIndexOf(C)I
    .locals 3

    .line 320
    iget-object v0, p0, Ll/᩹֫ᩴ;->᩸:[C

    .line 321
    iget v1, p0, Ll/᩹֫ᩴ;->᩹:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_1

    aget-char v1, v0, v2

    if-ne p1, v1, :cond_0

    return v2

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final listIterator(I)Ll/ܶۧᩴ;
    .locals 1

    .line 737
    invoke-virtual {p0, p1}, Ll/᩵ܰۘ;->֫(I)V

    .line 738
    new-instance v0, Ll/ۚ֫ᩴ;

    invoke-direct {v0, p0, p1}, Ll/ۚ֫ᩴ;-><init>(Ll/᩹֫ᩴ;I)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 361
    iget v0, p0, Ll/᩹֫ᩴ;->᩹:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/᩹֫ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 925
    new-instance v0, Ll/֨֫ᩴ;

    invoke-direct {v0, p0}, Ll/֨֫ᩴ;-><init>(Ll/᩹֫ᩴ;)V

    return-object v0
.end method

.method public final spliterator()Ll/ܽܽᩴ;
    .locals 1

    .line 925
    new-instance v0, Ll/֨֫ᩴ;

    invoke-direct {v0, p0}, Ll/֨֫ᩴ;-><init>(Ll/᩹֫ᩴ;)V

    return-object v0
.end method

.method public final subList(II)Ljava/util/List;
    .locals 4

    if-nez p1, :cond_0

    .line 361
    iget v0, p0, Ll/᩹֫ᩴ;->᩹:I

    if-ne p2, v0, :cond_0

    move-object v0, p0

    goto :goto_0

    .line 603
    :cond_0
    invoke-virtual {p0, p1}, Ll/᩵ܰۘ;->֫(I)V

    .line 604
    invoke-virtual {p0, p2}, Ll/᩵ܰۘ;->֫(I)V

    if-gt p1, p2, :cond_1

    .line 606
    new-instance v0, Ll/᩸֫ᩴ;

    invoke-direct {v0, p0, p1, p2}, Ll/᩸֫ᩴ;-><init>(Ll/᩹֫ᩴ;II)V

    :goto_0
    return-object v0

    .line 605
    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, ") is greater than end index ("

    const-string v2, ")"

    const-string v3, "Start index ("

    .line 0
    invoke-static {v3, p1, v1, v2, p2}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    .line 605
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֡(I)C
    .locals 4

    .line 327
    iget v0, p0, Ll/᩹֫ᩴ;->᩹:I

    if-ge p1, v0, :cond_1

    .line 328
    iget-object v1, p0, Ll/᩹֫ᩴ;->᩸:[C

    .line 329
    aget-char v2, v1, p1

    add-int/lit8 v0, v0, -0x1

    .line 330
    iput v0, p0, Ll/᩹֫ᩴ;->᩹:I

    if-eq p1, v0, :cond_0

    add-int/lit8 v3, p1, 0x1

    sub-int/2addr v0, p1

    .line 331
    invoke-static {v1, v3, v1, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_0
    return v2

    .line 327
    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Index ("

    const-string v2, ") is greater than or equal to list size ("

    .line 0
    invoke-static {p1, v1, v2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 327
    iget v1, p0, Ll/᩹֫ᩴ;->᩹:I

    const-string v2, ")"

    .line 0
    invoke-static {v1, v2, p1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 327
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(CI)C
    .locals 2

    .line 347
    iget v0, p0, Ll/᩹֫ᩴ;->᩹:I

    if-ge p2, v0, :cond_0

    .line 348
    iget-object v0, p0, Ll/᩹֫ᩴ;->᩸:[C

    aget-char v1, v0, p2

    .line 349
    aput-char p1, v0, p2

    return v1

    .line 347
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Index ("

    const-string v1, ") is greater than or equal to list size ("

    .line 0
    invoke-static {p2, v0, v1}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 347
    iget v0, p0, Ll/᩹֫ᩴ;->᩹:I

    const-string v1, ")"

    .line 0
    invoke-static {v0, v1, p2}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    .line 347
    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/util/List;)I
    .locals 7

    .line 1038
    instance-of v0, p1, Ll/᩹֫ᩴ;

    if-eqz v0, :cond_5

    .line 1039
    check-cast p1, Ll/᩹֫ᩴ;

    .line 361
    iget v0, p0, Ll/᩹֫ᩴ;->᩹:I

    iget v1, p1, Ll/᩹֫ᩴ;->᩹:I

    .line 1023
    iget-object v2, p0, Ll/᩹֫ᩴ;->᩸:[C

    iget-object p1, p1, Ll/᩹֫ᩴ;->᩸:[C

    const/4 v3, 0x0

    if-ne v2, p1, :cond_0

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_2

    if-ge v4, v1, :cond_2

    .line 1029
    aget-char v5, v2, v4

    .line 1030
    aget-char v6, p1, v4

    .line 1031
    invoke-static {v5, v6}, Ljava/lang/Character;->compare(CC)I

    move-result v5

    if-eqz v5, :cond_1

    return v5

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-ge v4, v1, :cond_3

    const/4 p1, -0x1

    return p1

    :cond_3
    if-ge v4, v0, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_1
    return v3

    .line 1041
    :cond_5
    instance-of v0, p1, Ll/᩸֫ᩴ;

    if-eqz v0, :cond_6

    .line 1043
    check-cast p1, Ll/᩸֫ᩴ;

    invoke-virtual {p1, p0}, Ll/᩸֫ᩴ;->֫(Ljava/util/List;)I

    move-result p1

    neg-int p1, p1

    return p1

    .line 1045
    :cond_6
    invoke-super {p0, p1}, Ll/᩵ܰۘ;->֫(Ljava/util/List;)I

    move-result p1

    return p1
.end method

.method public final ֫(II)V
    .locals 2

    .line 631
    iget v0, p0, Ll/᩹֫ᩴ;->᩹:I

    invoke-static {v0, p1, p2}, Ll/ۢ᩹ۡ;->֫(III)V

    .line 632
    iget-object v0, p0, Ll/᩹֫ᩴ;->᩸:[C

    iget v1, p0, Ll/᩹֫ᩴ;->᩹:I

    sub-int/2addr v1, p2

    invoke-static {v0, p2, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 633
    iget v0, p0, Ll/᩹֫ᩴ;->᩹:I

    sub-int/2addr p2, p1

    sub-int/2addr v0, p2

    iput v0, p0, Ll/᩹֫ᩴ;->᩹:I

    return-void
.end method

.method public final ֫(II[CI)V
    .locals 1

    .line 357
    array-length v0, p3

    invoke-static {v0, p2, p4}, Ll/ۢ᩹ۡ;->ۧ(III)V

    .line 620
    iget-object v0, p0, Ll/᩹֫ᩴ;->᩸:[C

    invoke-static {v0, p1, p3, p2, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final ֫(Ll/֫ۧᩴ;)V
    .locals 4

    if-nez p1, :cond_0

    .line 931
    iget-object p1, p0, Ll/᩹֫ᩴ;->᩸:[C

    iget v0, p0, Ll/᩹֫ᩴ;->᩹:I

    .line 1581
    invoke-static {p1, v0}, Ll/۬֫ᩴ;->֫([CI)V

    return-void

    .line 933
    :cond_0
    iget-object v0, p0, Ll/᩹֫ᩴ;->᩸:[C

    iget v1, p0, Ll/᩹֫ᩴ;->᩹:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 1546
    invoke-static {v0, v3, v1, p1, v2}, Ll/۬֫ᩴ;->֫([CIILl/֫ۧᩴ;[C)V

    return-void
.end method

.method public final ֫(Ll/᩻ۧᩴ;)V
    .locals 3

    .line 672
    iget-object v0, p0, Ll/᩹֫ᩴ;->᩸:[C

    const/4 v1, 0x0

    .line 673
    :goto_0
    iget v2, p0, Ll/᩹֫ᩴ;->᩹:I

    if-ge v1, v2, :cond_0

    .line 674
    aget-char v2, v0, v1

    invoke-interface {p1, v2}, Ll/᩻ۧᩴ;->ܽ(C)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫([CII)V
    .locals 3

    .line 664
    invoke-virtual {p0, p2}, Ll/᩵ܰۘ;->֫(I)V

    .line 357
    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {v0, v1, p3}, Ll/ۢ᩹ۡ;->ۧ(III)V

    add-int v0, p2, p3

    .line 666
    iget v2, p0, Ll/᩹֫ᩴ;->᩹:I

    if-gt v0, v2, :cond_0

    .line 667
    iget-object v0, p0, Ll/᩹֫ᩴ;->᩸:[C

    invoke-static {p1, v1, v0, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    .line 666
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "End index ("

    const-string p3, ") is greater than list size ("

    .line 0
    invoke-static {v0, p2, p3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 666
    iget p3, p0, Ll/᩹֫ᩴ;->᩹:I

    const-string v0, ")"

    .line 0
    invoke-static {p3, v0, p2}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    .line 666
    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(ILl/ۛ֫ᩴ;)Z
    .locals 6

    .line 680
    instance-of v0, p2, Ll/֨ۧᩴ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 681
    check-cast p2, Ll/֨ۧᩴ;

    .line 697
    invoke-virtual {p0, p1}, Ll/᩵ܰۘ;->֫(I)V

    .line 698
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 700
    :cond_0
    iget v3, p0, Ll/᩹֫ᩴ;->᩹:I

    add-int/2addr v3, v0

    invoke-direct {p0, v3}, Ll/᩹֫ᩴ;->ܿ(I)V

    .line 701
    iget-object v3, p0, Ll/᩹֫ᩴ;->᩸:[C

    add-int v4, p1, v0

    iget v5, p0, Ll/᩹֫ᩴ;->᩹:I

    sub-int/2addr v5, p1

    invoke-static {v3, p1, v3, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 702
    iget-object v3, p0, Ll/᩹֫ᩴ;->᩸:[C

    invoke-interface {p2, v1, p1, v3, v0}, Ll/֨ۧᩴ;->֫(II[CI)V

    .line 703
    iget p1, p0, Ll/᩹֫ᩴ;->᩹:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/᩹֫ᩴ;->᩹:I

    return v2

    .line 683
    :cond_1
    invoke-virtual {p0, p1}, Ll/᩵ܰۘ;->֫(I)V

    .line 684
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v0

    if-nez v0, :cond_2

    :goto_0
    return v1

    .line 686
    :cond_2
    iget v1, p0, Ll/᩹֫ᩴ;->᩹:I

    add-int/2addr v1, v0

    invoke-direct {p0, v1}, Ll/᩹֫ᩴ;->ܿ(I)V

    .line 687
    iget-object v1, p0, Ll/᩹֫ᩴ;->᩸:[C

    add-int v3, p1, v0

    iget v4, p0, Ll/᩹֫ᩴ;->᩹:I

    sub-int/2addr v4, p1

    invoke-static {v1, p1, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 688
    invoke-interface {p2}, Ll/ۛ֫ᩴ;->iterator()Ll/ܺۧᩴ;

    move-result-object p2

    .line 689
    iget v1, p0, Ll/᩹֫ᩴ;->᩹:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/᩹֫ᩴ;->᩹:I

    :goto_1
    add-int/lit8 v1, v0, -0x1

    if-eqz v0, :cond_3

    .line 690
    iget-object v0, p0, Ll/᩹֫ᩴ;->᩸:[C

    add-int/lit8 v3, p1, 0x1

    invoke-interface {p2}, Ll/ܺۧᩴ;->֡ۧ()C

    move-result v4

    aput-char v4, v0, p1

    move v0, v1

    move p1, v3

    goto :goto_1

    :cond_3
    return v2
.end method

.method public final ֫(Ll/ۛۧᩴ;)Z
    .locals 6

    .line 720
    iget-object v0, p0, Ll/᩹֫ᩴ;->᩸:[C

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 722
    :goto_0
    iget v4, p0, Ll/᩹֫ᩴ;->᩹:I

    if-ge v2, v4, :cond_1

    aget-char v4, v0, v2

    invoke-interface {p1, v4}, Ll/ۛۧᩴ;->ۜ(C)Z

    move-result v4

    if-nez v4, :cond_0

    add-int/lit8 v4, v3, 0x1

    aget-char v5, v0, v2

    aput-char v5, v0, v3

    move v3, v4

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    if-eq v4, v3, :cond_2

    const/4 v1, 0x1

    .line 724
    :cond_2
    iput v3, p0, Ll/᩹֫ᩴ;->᩹:I

    return v1
.end method

.method public final ۧ(CI)V
    .locals 3

    .line 289
    invoke-virtual {p0, p2}, Ll/᩵ܰۘ;->֫(I)V

    .line 290
    iget v0, p0, Ll/᩹֫ᩴ;->᩹:I

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Ll/᩹֫ᩴ;->ܿ(I)V

    .line 291
    iget v0, p0, Ll/᩹֫ᩴ;->᩹:I

    if-eq p2, v0, :cond_0

    iget-object v1, p0, Ll/᩹֫ᩴ;->᩸:[C

    add-int/lit8 v2, p2, 0x1

    sub-int/2addr v0, p2

    invoke-static {v1, p2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 292
    :cond_0
    iget-object v0, p0, Ll/᩹֫ᩴ;->᩸:[C

    aput-char p1, v0, p2

    .line 293
    iget p1, p0, Ll/᩹֫ᩴ;->᩹:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/᩹֫ᩴ;->᩹:I

    return-void
.end method

.method public final ۧ(Ll/֫ۧᩴ;)V
    .locals 3

    if-nez p1, :cond_0

    .line 940
    iget-object p1, p0, Ll/᩹֫ᩴ;->᩸:[C

    iget v0, p0, Ll/᩹֫ᩴ;->᩹:I

    invoke-static {p1, v0}, Ll/۬֫ᩴ;->֫([CI)V

    return-void

    .line 942
    :cond_0
    iget-object v0, p0, Ll/᩹֫ᩴ;->᩸:[C

    iget v1, p0, Ll/᩹֫ᩴ;->᩹:I

    const/4 v2, 0x0

    .line 1406
    invoke-static {v0, v2, v1, p1}, Ll/۬֫ᩴ;->֫([CIILl/֫ۧᩴ;)V

    return-void
.end method

.method public final ۧ(C)Z
    .locals 4

    .line 299
    iget v0, p0, Ll/᩹֫ᩴ;->᩹:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Ll/᩹֫ᩴ;->ܿ(I)V

    .line 300
    iget-object v0, p0, Ll/᩹֫ᩴ;->᩸:[C

    iget v2, p0, Ll/᩹֫ᩴ;->᩹:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/᩹֫ᩴ;->᩹:I

    aput-char p1, v0, v2

    return v1
.end method

.method public final ܽ(Ll/ۛ֫ᩴ;)Z
    .locals 6

    .line 710
    iget-object v0, p0, Ll/᩹֫ᩴ;->᩸:[C

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 712
    :goto_0
    iget v4, p0, Ll/᩹֫ᩴ;->᩹:I

    if-ge v2, v4, :cond_1

    aget-char v4, v0, v2

    invoke-interface {p1, v4}, Ll/ۛ֫ᩴ;->᩻(C)Z

    move-result v4

    if-nez v4, :cond_0

    add-int/lit8 v4, v3, 0x1

    aget-char v5, v0, v2

    aput-char v5, v0, v3

    move v3, v4

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    if-eq v4, v3, :cond_2

    const/4 v1, 0x1

    .line 714
    :cond_2
    iput v3, p0, Ll/᩹֫ᩴ;->᩹:I

    return v1
.end method

.method public final ܿ(C)Z
    .locals 1

    .line 338
    invoke-virtual {p0, p1}, Ll/᩹֫ᩴ;->indexOf(C)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 340
    :cond_0
    invoke-virtual {p0, p1}, Ll/᩹֫ᩴ;->֡(I)C

    const/4 p1, 0x1

    return p1
.end method
