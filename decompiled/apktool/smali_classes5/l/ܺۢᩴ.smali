.class public final Ll/ܺۢᩴ;
.super Ll/ۤܿᩴ;
.source "N1QM"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Ljava/lang/Cloneable;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583eaL


# instance fields
.field public transient ᩸:[I

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 99
    invoke-direct {p0}, Ll/ۤܿᩴ;-><init>()V

    .line 100
    sget-object v0, Ll/᩵ۢᩴ;->֫:[I

    iput-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 93
    invoke-direct {p0}, Ll/ۤܿᩴ;-><init>()V

    .line 94
    invoke-direct {p0, p1}, Ll/ܺۢᩴ;->᩻(I)V

    return-void
.end method

.method public constructor <init>(Ll/֨ۡᩴ;)V
    .locals 3

    .line 146
    invoke-direct {p0}, Ll/ۤܿᩴ;-><init>()V

    .line 147
    instance-of v0, p1, Ll/ܺۢᩴ;

    if-eqz v0, :cond_1

    .line 148
    check-cast p1, Ll/ܺۢᩴ;

    .line 67
    iget-object v0, p1, Ll/ܺۢᩴ;->᩸:[I

    iget p1, p1, Ll/ܺۢᩴ;->᩹:I

    if-nez p1, :cond_0

    .line 62
    sget-object p1, Ll/᩵ۢᩴ;->ۧ:[I

    goto :goto_0

    .line 63
    :cond_0
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    .line 148
    :goto_0
    iput-object p1, p0, Ll/ܺۢᩴ;->᩸:[I

    .line 149
    array-length p1, p1

    iput p1, p0, Ll/ܺۢᩴ;->᩹:I

    return-void

    .line 151
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p0, v0}, Ll/ܺۢᩴ;->᩻(I)V

    .line 152
    iget-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    iput v1, p0, Ll/ܺۢᩴ;->᩹:I

    const/4 v2, 0x0

    invoke-interface {p1, v2, v2, v1, v0}, Ll/֨ۡᩴ;->֫(III[I)V

    return-void
.end method

.method public constructor <init>([I)V
    .locals 0

    .line 78
    invoke-direct {p0}, Ll/ۤܿᩴ;-><init>()V

    .line 79
    iput-object p1, p0, Ll/ܺۢᩴ;->᩸:[I

    return-void
.end method

.method public constructor <init>([II)V
    .locals 3

    const/16 p2, 0x22

    .line 173
    invoke-direct {p0, p2}, Ll/ܺۢᩴ;-><init>(I)V

    .line 174
    iget-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v2, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 175
    iput p2, p0, Ll/ܺۢᩴ;->᩹:I

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 3

    .line 1089
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 1090
    iget v0, p0, Ll/ܺۢᩴ;->᩹:I

    new-array v0, v0, [I

    iput-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    const/4 v1, 0x0

    .line 1091
    :goto_0
    iget v2, p0, Ll/ܺۢᩴ;->᩹:I

    if-ge v1, v2, :cond_0

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 3

    .line 1083
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 1084
    iget-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    const/4 v1, 0x0

    .line 1085
    :goto_0
    iget v2, p0, Ll/ܺۢᩴ;->᩹:I

    if-ge v1, v2, :cond_0

    aget v2, v0, v1

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ֫([I)Ll/ܺۢᩴ;
    .locals 4

    .line 236
    array-length v0, p0

    .line 219
    array-length v1, p0

    if-gt v0, v1, :cond_0

    .line 220
    new-instance v1, Ll/ܺۢᩴ;

    invoke-direct {v1, p0}, Ll/ܺۢᩴ;-><init>([I)V

    .line 221
    iput v0, v1, Ll/ܺۢᩴ;->᩹:I

    return-object v1

    .line 219
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "The specified length ("

    const-string v3, ") is greater than the array size ("

    .line 0
    invoke-static {v0, v2, v3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 219
    array-length p0, p0

    const-string v2, ")"

    .line 0
    invoke-static {p0, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    .line 219
    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private ܿ(I)V
    .locals 5

    .line 314
    iget-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    array-length v1, v0

    if-gt p1, v1, :cond_0

    return-void

    .line 315
    :cond_0
    sget-object v1, Ll/᩵ۢᩴ;->֫:[I

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

    .line 317
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    iget v1, p0, Ll/ܺۢᩴ;->᩹:I

    .line 125
    new-array p1, p1, [I

    const/4 v2, 0x0

    .line 126
    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 317
    iput-object p1, p0, Ll/ܺۢᩴ;->᩸:[I

    return-void
.end method

.method private ᩻(I)V
    .locals 3

    if-ltz p1, :cond_1

    if-nez p1, :cond_0

    .line 84
    sget-object p1, Ll/᩵ۢᩴ;->ۧ:[I

    iput-object p1, p0, Ll/ܺۢᩴ;->᩸:[I

    return-void

    .line 85
    :cond_0
    new-array p1, p1, [I

    iput-object p1, p0, Ll/ܺۢᩴ;->᩸:[I

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


# virtual methods
.method public final add(II)V
    .locals 3

    .line 323
    invoke-virtual {p0, p1}, Ll/ۤܿᩴ;->֫(I)V

    .line 324
    iget v0, p0, Ll/ܺۢᩴ;->᩹:I

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Ll/ܺۢᩴ;->ܿ(I)V

    .line 325
    iget v0, p0, Ll/ܺۢᩴ;->᩹:I

    if-eq p1, v0, :cond_0

    iget-object v1, p0, Ll/ܺۢᩴ;->᩸:[I

    add-int/lit8 v2, p1, 0x1

    sub-int/2addr v0, p1

    invoke-static {v1, p1, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 326
    :cond_0
    iget-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    aput p2, v0, p1

    .line 327
    iget p1, p0, Ll/ܺۢᩴ;->᩹:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ܺۢᩴ;->᩹:I

    return-void
.end method

.method public final add(I)Z
    .locals 4

    .line 333
    iget v0, p0, Ll/ܺۢᩴ;->᩹:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Ll/ܺۢᩴ;->ܿ(I)V

    .line 334
    iget-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    iget v2, p0, Ll/ܺۢᩴ;->᩹:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/ܺۢᩴ;->᩹:I

    aput p1, v0, v2

    return v1
.end method

.method public final clear()V
    .locals 1

    const/4 v0, 0x0

    .line 389
    iput v0, p0, Ll/ܺۢᩴ;->᩹:I

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 3

    .line 988
    new-instance v0, Ll/ܺۢᩴ;

    iget-object v1, p0, Ll/ܺۢᩴ;->᩸:[I

    iget v2, p0, Ll/ܺۢᩴ;->᩹:I

    if-nez v2, :cond_0

    .line 62
    sget-object v1, Ll/᩵ۢᩴ;->ۧ:[I

    goto :goto_0

    .line 63
    :cond_0
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    .line 988
    :goto_0
    invoke-direct {v0, v1}, Ll/ܺۢᩴ;-><init>([I)V

    .line 989
    iget v1, p0, Ll/ܺۢᩴ;->᩹:I

    iput v1, v0, Ll/ܺۢᩴ;->᩹:I

    return-object v0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 45
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Ll/ܺۢᩴ;->֫(Ljava/util/List;)I

    move-result p1

    return p1
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

    .line 1031
    :cond_1
    instance-of v2, p1, Ljava/util/List;

    if-nez v2, :cond_2

    return v1

    .line 1032
    :cond_2
    instance-of v2, p1, Ll/ܺۢᩴ;

    if-eqz v2, :cond_8

    .line 1034
    check-cast p1, Ll/ܺۢᩴ;

    if-ne p1, p0, :cond_3

    goto :goto_2

    .line 395
    :cond_3
    iget v2, p0, Ll/ܺۢᩴ;->᩹:I

    iget v3, p1, Ll/ܺۢᩴ;->᩹:I

    if-eq v2, v3, :cond_4

    goto :goto_1

    .line 1019
    :cond_4
    iget-object v4, p0, Ll/ܺۢᩴ;->᩸:[I

    .line 1020
    iget-object p1, p1, Ll/ܺۢᩴ;->᩸:[I

    if-ne v4, p1, :cond_5

    if-ne v2, v3, :cond_5

    goto :goto_2

    :cond_5
    :goto_0
    add-int/lit8 v3, v2, -0x1

    if-eqz v2, :cond_7

    .line 1022
    aget v2, v4, v3

    aget v5, p1, v3

    if-eq v2, v5, :cond_6

    :goto_1
    return v1

    :cond_6
    move v2, v3

    goto :goto_0

    :cond_7
    :goto_2
    return v0

    .line 1036
    :cond_8
    instance-of v0, p1, Ll/ۡۢᩴ;

    if-eqz v0, :cond_9

    .line 1039
    check-cast p1, Ll/ۡۢᩴ;

    invoke-virtual {p1, p0}, Ll/ۡۢᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 1041
    :cond_9
    invoke-super {p0, p1}, Ll/ۤܿᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final forEach(Ljava/util/function/IntConsumer;)V
    .locals 3

    .line 706
    iget-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    const/4 v1, 0x0

    .line 707
    :goto_0
    iget v2, p0, Ll/ܺۢᩴ;->᩹:I

    if-ge v1, v2, :cond_0

    .line 708
    aget v2, v0, v1

    invoke-interface {p1, v2}, Ljava/util/function/IntConsumer;->accept(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final getInt(I)I
    .locals 3

    .line 341
    iget v0, p0, Ll/ܺۢᩴ;->᩹:I

    if-ge p1, v0, :cond_0

    .line 342
    iget-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    aget p1, v0, p1

    return p1

    .line 341
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Index ("

    const-string v2, ") is greater than or equal to list size ("

    .line 0
    invoke-static {p1, v1, v2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 341
    iget v1, p0, Ll/ܺۢᩴ;->᩹:I

    const-string v2, ")"

    .line 0
    invoke-static {v1, v2, p1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 341
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final indexOf(I)I
    .locals 3

    .line 347
    iget-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    const/4 v1, 0x0

    .line 348
    :goto_0
    iget v2, p0, Ll/ܺۢᩴ;->᩹:I

    if-ge v1, v2, :cond_1

    aget v2, v0, v1

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

    .line 407
    iget v0, p0, Ll/ܺۢᩴ;->᩹:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final lastIndexOf(I)I
    .locals 3

    .line 354
    iget-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    .line 355
    iget v1, p0, Ll/ܺۢᩴ;->᩹:I

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

    .line 771
    invoke-virtual {p0, p1}, Ll/ۤܿᩴ;->֫(I)V

    .line 772
    new-instance v0, Ll/᩻ۢᩴ;

    invoke-direct {v0, p1, p0}, Ll/᩻ۢᩴ;-><init>(ILl/ܺۢᩴ;)V

    return-object v0
.end method

.method public final set(II)I
    .locals 2

    .line 381
    iget v0, p0, Ll/ܺۢᩴ;->᩹:I

    if-ge p1, v0, :cond_0

    .line 382
    iget-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    aget v1, v0, p1

    .line 383
    aput p2, v0, p1

    return v1

    .line 381
    :cond_0
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Index ("

    const-string v1, ") is greater than or equal to list size ("

    .line 0
    invoke-static {p1, v0, v1}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 381
    iget v0, p0, Ll/ܺۢᩴ;->᩹:I

    const-string v1, ")"

    .line 0
    invoke-static {v0, v1, p1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 381
    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final size()I
    .locals 1

    .line 395
    iget v0, p0, Ll/ܺۢᩴ;->᩹:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ܺۢᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 959
    new-instance v0, Ll/ۜۢᩴ;

    invoke-direct {v0, p0}, Ll/ۜۢᩴ;-><init>(Ll/ܺۢᩴ;)V

    return-object v0
.end method

.method public final spliterator()Ll/ܽܺᩴ;
    .locals 1

    .line 959
    new-instance v0, Ll/ۜۢᩴ;

    invoke-direct {v0, p0}, Ll/ۜۢᩴ;-><init>(Ll/ܺۢᩴ;)V

    return-object v0
.end method

.method public final subList(II)Ll/֨ۡᩴ;
    .locals 4

    if-nez p1, :cond_0

    .line 395
    iget v0, p0, Ll/ܺۢᩴ;->᩹:I

    if-ne p2, v0, :cond_0

    return-object p0

    .line 637
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۤܿᩴ;->֫(I)V

    .line 638
    invoke-virtual {p0, p2}, Ll/ۤܿᩴ;->֫(I)V

    if-gt p1, p2, :cond_1

    .line 640
    new-instance v0, Ll/ۡۢᩴ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۡۢᩴ;-><init>(Ll/ܺۢᩴ;II)V

    return-object v0

    .line 639
    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, ") is greater than end index ("

    const-string v2, ")"

    const-string v3, "Start index ("

    .line 0
    invoke-static {v3, p1, v1, v2, p2}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    .line 639
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ljava/util/List;)I
    .locals 7

    .line 1072
    instance-of v0, p1, Ll/ܺۢᩴ;

    if-eqz v0, :cond_5

    .line 1073
    check-cast p1, Ll/ܺۢᩴ;

    .line 395
    iget v0, p0, Ll/ܺۢᩴ;->᩹:I

    iget v1, p1, Ll/ܺۢᩴ;->᩹:I

    .line 1057
    iget-object v2, p0, Ll/ܺۢᩴ;->᩸:[I

    iget-object p1, p1, Ll/ܺۢᩴ;->᩸:[I

    const/4 v3, 0x0

    if-ne v2, p1, :cond_0

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_2

    if-ge v4, v1, :cond_2

    .line 1063
    aget v5, v2, v4

    .line 1064
    aget v6, p1, v4

    .line 1065
    invoke-static {v5, v6}, Ljava/lang/Integer;->compare(II)I

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

    .line 1075
    :cond_5
    instance-of v0, p1, Ll/ۡۢᩴ;

    if-eqz v0, :cond_6

    .line 1077
    check-cast p1, Ll/ۡۢᩴ;

    invoke-virtual {p1, p0}, Ll/ۡۢᩴ;->֫(Ljava/util/List;)I

    move-result p1

    neg-int p1, p1

    return p1

    .line 1079
    :cond_6
    invoke-super {p0, p1}, Ll/ۤܿᩴ;->֫(Ljava/util/List;)I

    move-result p1

    return p1
.end method

.method public final ֫(II)V
    .locals 2

    .line 665
    iget v0, p0, Ll/ܺۢᩴ;->᩹:I

    invoke-static {v0, p1, p2}, Ll/ۢ᩹ۡ;->֫(III)V

    .line 666
    iget-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    iget v1, p0, Ll/ܺۢᩴ;->᩹:I

    sub-int/2addr v1, p2

    invoke-static {v0, p2, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 667
    iget v0, p0, Ll/ܺۢᩴ;->᩹:I

    sub-int/2addr p2, p1

    sub-int/2addr v0, p2

    iput v0, p0, Ll/ܺۢᩴ;->᩹:I

    return-void
.end method

.method public final ֫(III[I)V
    .locals 1

    .line 356
    array-length v0, p4

    invoke-static {v0, p2, p3}, Ll/ۢ᩹ۡ;->ۧ(III)V

    .line 654
    iget-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    invoke-static {v0, p1, p4, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final ֫(II[I)V
    .locals 3

    .line 698
    invoke-virtual {p0, p1}, Ll/ۤܿᩴ;->֫(I)V

    .line 356
    array-length v0, p3

    const/4 v1, 0x0

    invoke-static {v0, v1, p2}, Ll/ۢ᩹ۡ;->ۧ(III)V

    add-int v0, p1, p2

    .line 700
    iget v2, p0, Ll/ܺۢᩴ;->᩹:I

    if-gt v0, v2, :cond_0

    .line 701
    iget-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    invoke-static {p3, v1, v0, p1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    .line 700
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "End index ("

    const-string p3, ") is greater than list size ("

    .line 0
    invoke-static {v0, p2, p3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 700
    iget p3, p0, Ll/ܺۢᩴ;->᩹:I

    const-string v0, ")"

    .line 0
    invoke-static {p3, v0, p2}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    .line 700
    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(ILl/֨ۡᩴ;)Z
    .locals 5

    .line 731
    invoke-virtual {p0, p1}, Ll/ۤܿᩴ;->֫(I)V

    .line 732
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 734
    :cond_0
    iget v2, p0, Ll/ܺۢᩴ;->᩹:I

    add-int/2addr v2, v0

    invoke-direct {p0, v2}, Ll/ܺۢᩴ;->ܿ(I)V

    .line 735
    iget-object v2, p0, Ll/ܺۢᩴ;->᩸:[I

    add-int v3, p1, v0

    iget v4, p0, Ll/ܺۢᩴ;->᩹:I

    sub-int/2addr v4, p1

    invoke-static {v2, p1, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 736
    iget-object v2, p0, Ll/ܺۢᩴ;->᩸:[I

    invoke-interface {p2, v1, p1, v0, v2}, Ll/֨ۡᩴ;->֫(III[I)V

    .line 737
    iget p1, p0, Ll/ܺۢᩴ;->᩹:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/ܺۢᩴ;->᩹:I

    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(ILl/֨ۢᩴ;)Z
    .locals 4

    .line 714
    instance-of v0, p2, Ll/֨ۡᩴ;

    if-eqz v0, :cond_0

    .line 715
    check-cast p2, Ll/֨ۡᩴ;

    invoke-virtual {p0, p1, p2}, Ll/ܺۢᩴ;->֫(ILl/֨ۡᩴ;)Z

    move-result p1

    return p1

    .line 717
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۤܿᩴ;->֫(I)V

    .line 718
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 720
    :cond_1
    iget v1, p0, Ll/ܺۢᩴ;->᩹:I

    add-int/2addr v1, v0

    invoke-direct {p0, v1}, Ll/ܺۢᩴ;->ܿ(I)V

    .line 721
    iget-object v1, p0, Ll/ܺۢᩴ;->᩸:[I

    add-int v2, p1, v0

    iget v3, p0, Ll/ܺۢᩴ;->᩹:I

    sub-int/2addr v3, p1

    invoke-static {v1, p1, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 722
    invoke-interface {p2}, Ll/֨ۢᩴ;->iterator()Ll/ۜۡᩴ;

    move-result-object p2

    .line 723
    iget v1, p0, Ll/ܺۢᩴ;->᩹:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ܺۢᩴ;->᩹:I

    :goto_0
    add-int/lit8 v1, v0, -0x1

    if-eqz v0, :cond_2

    .line 724
    iget-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    add-int/lit8 v2, p1, 0x1

    invoke-interface {p2}, Ll/ܳ۫ᩴ;->nextInt()I

    move-result v3

    aput v3, v0, p1

    move v0, v1

    move p1, v2

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(Ljava/util/function/IntPredicate;)Z
    .locals 6

    .line 754
    iget-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 756
    :goto_0
    iget v4, p0, Ll/ܺۢᩴ;->᩹:I

    if-ge v2, v4, :cond_1

    aget v4, v0, v2

    invoke-interface {p1, v4}, Ljava/util/function/IntPredicate;->test(I)Z

    move-result v4

    if-nez v4, :cond_0

    add-int/lit8 v4, v3, 0x1

    aget v5, v0, v2

    aput v5, v0, v3

    move v3, v4

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    if-eq v4, v3, :cond_2

    const/4 v1, 0x1

    .line 758
    :cond_2
    iput v3, p0, Ll/ܺۢᩴ;->᩹:I

    return v1
.end method

.method public final ۖ(I)Z
    .locals 1

    .line 372
    invoke-virtual {p0, p1}, Ll/ܺۢᩴ;->indexOf(I)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 374
    :cond_0
    invoke-virtual {p0, p1}, Ll/ܺۢᩴ;->ۘ(I)I

    const/4 p1, 0x1

    return p1
.end method

.method public final ۘ(I)I
    .locals 4

    .line 361
    iget v0, p0, Ll/ܺۢᩴ;->᩹:I

    if-ge p1, v0, :cond_1

    .line 362
    iget-object v1, p0, Ll/ܺۢᩴ;->᩸:[I

    .line 363
    aget v2, v1, p1

    add-int/lit8 v0, v0, -0x1

    .line 364
    iput v0, p0, Ll/ܺۢᩴ;->᩹:I

    if-eq p1, v0, :cond_0

    add-int/lit8 v3, p1, 0x1

    sub-int/2addr v0, p1

    .line 365
    invoke-static {v1, v3, v1, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_0
    return v2

    .line 361
    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Index ("

    const-string v2, ") is greater than or equal to list size ("

    .line 0
    invoke-static {p1, v1, v2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 361
    iget v1, p0, Ll/ܺۢᩴ;->᩹:I

    const-string v2, ")"

    .line 0
    invoke-static {v1, v2, p1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 361
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(II[I)V
    .locals 4

    .line 680
    invoke-virtual {p0, p1}, Ll/ۤܿᩴ;->֫(I)V

    .line 356
    array-length v0, p3

    const/4 v1, 0x0

    invoke-static {v0, v1, p2}, Ll/ۢ᩹ۡ;->ۧ(III)V

    .line 682
    iget v0, p0, Ll/ܺۢᩴ;->᩹:I

    add-int/2addr v0, p2

    invoke-direct {p0, v0}, Ll/ܺۢᩴ;->ܿ(I)V

    .line 683
    iget-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    add-int v2, p1, p2

    iget v3, p0, Ll/ܺۢᩴ;->᩹:I

    sub-int/2addr v3, p1

    invoke-static {v0, p1, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 684
    iget-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    invoke-static {p3, v1, v0, p1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 685
    iget p1, p0, Ll/ܺۢᩴ;->᩹:I

    add-int/2addr p1, p2

    iput p1, p0, Ll/ܺۢᩴ;->᩹:I

    return-void
.end method

.method public final ۧ(Ll/ۙۢᩴ;)V
    .locals 3

    if-nez p1, :cond_0

    .line 974
    iget-object p1, p0, Ll/ܺۢᩴ;->᩸:[I

    iget v0, p0, Ll/ܺۢᩴ;->᩹:I

    invoke-static {v0, p1}, Ll/᩵ۢᩴ;->֫(I[I)V

    return-void

    .line 976
    :cond_0
    iget-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    iget v1, p0, Ll/ܺۢᩴ;->᩹:I

    const/4 v2, 0x0

    .line 1405
    invoke-static {v0, v2, v1, p1}, Ll/᩵ۢᩴ;->֫([IIILl/ۙۢᩴ;)V

    return-void
.end method

.method public final ܽ(Ll/ۙۢᩴ;)V
    .locals 4

    if-nez p1, :cond_0

    .line 965
    iget-object p1, p0, Ll/ܺۢᩴ;->᩸:[I

    iget v0, p0, Ll/ܺۢᩴ;->᩹:I

    .line 1580
    invoke-static {v0, p1}, Ll/᩵ۢᩴ;->֫(I[I)V

    return-void

    .line 967
    :cond_0
    iget-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    iget v1, p0, Ll/ܺۢᩴ;->᩹:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 1545
    invoke-static {v0, v3, v1, p1, v2}, Ll/᩵ۢᩴ;->֫([IIILl/ۙۢᩴ;[I)V

    return-void
.end method

.method public final ܽ(Ll/֨ۢᩴ;)Z
    .locals 6

    .line 744
    iget-object v0, p0, Ll/ܺۢᩴ;->᩸:[I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 746
    :goto_0
    iget v4, p0, Ll/ܺۢᩴ;->᩹:I

    if-ge v2, v4, :cond_1

    aget v4, v0, v2

    invoke-interface {p1, v4}, Ll/֨ۢᩴ;->contains(I)Z

    move-result v4

    if-nez v4, :cond_0

    add-int/lit8 v4, v3, 0x1

    aget v5, v0, v2

    aput v5, v0, v3

    move v3, v4

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    if-eq v4, v3, :cond_2

    const/4 v1, 0x1

    .line 748
    :cond_2
    iput v3, p0, Ll/ܺۢᩴ;->᩹:I

    return v1
.end method
