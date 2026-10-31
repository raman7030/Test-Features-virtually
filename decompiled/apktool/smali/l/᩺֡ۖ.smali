.class public final Ll/᩺֡ۖ;
.super Ll/᩵ۜۖ;
.source "G93V"

# interfaces
.implements Ljava/util/RandomAccess;


# static fields
.field public static final ۙ:Ll/᩺֡ۖ;


# instance fields
.field public ᩶:I

.field public ᩹:[Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 17
    new-instance v0, Ll/᩺֡ۖ;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1, v1}, Ll/᩺֡ۖ;-><init>([Ljava/lang/Object;IZ)V

    sput-object v0, Ll/᩺֡ۖ;->ۙ:Ll/᩺֡ۖ;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;IZ)V
    .locals 0

    .line 34
    invoke-direct {p0, p3}, Ll/᩵ۜۖ;-><init>(Z)V

    .line 35
    iput-object p1, p0, Ll/᩺֡ۖ;->᩹:[Ljava/lang/Object;

    .line 36
    iput p2, p0, Ll/᩺֡ۖ;->᩶:I

    return-void
.end method

.method private ֫(I)V
    .locals 3

    if-ltz p1, :cond_0

    .line 141
    iget v0, p0, Ll/᩺֡ۖ;->᩶:I

    if-ge p1, v0, :cond_0

    return-void

    .line 142
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Index:"

    const-string v2, ", Size:"

    .line 0
    invoke-static {p1, v1, v2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 147
    iget v1, p0, Ll/᩺֡ۖ;->᩶:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 142
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ܽ()Ll/᩺֡ۖ;
    .locals 1

    .line 22
    sget-object v0, Ll/᩺֡ۖ;->ۙ:Ll/᩺֡ۖ;

    return-object v0
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 5

    .line 70
    invoke-virtual {p0}, Ll/᩵ۜۖ;->ۧ()V

    if-ltz p1, :cond_1

    .line 72
    iget v0, p0, Ll/᩺֡ۖ;->᩶:I

    if-gt p1, v0, :cond_1

    .line 76
    iget-object v1, p0, Ll/᩺֡ۖ;->᩹:[Ljava/lang/Object;

    array-length v2, v1

    const/4 v3, 0x1

    if-ge v0, v2, :cond_0

    add-int/lit8 v2, p1, 0x1

    sub-int/2addr v0, p1

    .line 78
    invoke-static {v1, p1, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x3

    const/4 v4, 0x2

    .line 81
    invoke-static {v0, v2, v4, v3}, Ll/᩻ᩳᩴ;->֫(IIII)I

    move-result v0

    .line 137
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 85
    invoke-static {v1, v2, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 88
    iget-object v1, p0, Ll/᩺֡ۖ;->᩹:[Ljava/lang/Object;

    add-int/lit8 v2, p1, 0x1

    iget v4, p0, Ll/᩺֡ۖ;->᩶:I

    sub-int/2addr v4, p1

    invoke-static {v1, p1, v0, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 89
    iput-object v0, p0, Ll/᩺֡ۖ;->᩹:[Ljava/lang/Object;

    .line 92
    :goto_0
    iget-object v0, p0, Ll/᩺֡ۖ;->᩹:[Ljava/lang/Object;

    aput-object p2, v0, p1

    .line 93
    iget p1, p0, Ll/᩺֡ۖ;->᩶:I

    add-int/2addr p1, v3

    iput p1, p0, Ll/᩺֡ۖ;->᩶:I

    .line 94
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/2addr p1, v3

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void

    .line 73
    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Index:"

    const-string v1, ", Size:"

    .line 0
    invoke-static {p1, v0, v1}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 147
    iget v0, p0, Ll/᩺֡ۖ;->᩶:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 73
    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 4

    .line 52
    invoke-virtual {p0}, Ll/᩵ۜۖ;->ۧ()V

    .line 54
    iget v0, p0, Ll/᩺֡ۖ;->᩶:I

    iget-object v1, p0, Ll/᩺֡ۖ;->᩹:[Ljava/lang/Object;

    array-length v2, v1

    const/4 v3, 0x1

    if-ne v0, v2, :cond_0

    mul-int/lit8 v0, v0, 0x3

    .line 56
    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v3

    .line 57
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    .line 59
    iput-object v0, p0, Ll/᩺֡ۖ;->᩹:[Ljava/lang/Object;

    .line 62
    :cond_0
    iget-object v0, p0, Ll/᩺֡ۖ;->᩹:[Ljava/lang/Object;

    iget v1, p0, Ll/᩺֡ۖ;->᩶:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/᩺֡ۖ;->᩶:I

    aput-object p1, v0, v1

    .line 63
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/2addr p1, v3

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return v3
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 99
    invoke-direct {p0, p1}, Ll/᩺֡ۖ;->֫(I)V

    .line 100
    iget-object v0, p0, Ll/᩺֡ۖ;->᩹:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 4

    .line 105
    invoke-virtual {p0}, Ll/᩵ۜۖ;->ۧ()V

    .line 106
    invoke-direct {p0, p1}, Ll/᩺֡ۖ;->֫(I)V

    .line 108
    iget-object v0, p0, Ll/᩺֡ۖ;->᩹:[Ljava/lang/Object;

    aget-object v1, v0, p1

    .line 109
    iget v2, p0, Ll/᩺֡ۖ;->᩶:I

    add-int/lit8 v3, v2, -0x1

    if-ge p1, v3, :cond_0

    add-int/lit8 v3, p1, 0x1

    sub-int/2addr v2, p1

    add-int/lit8 v2, v2, -0x1

    .line 110
    invoke-static {v0, v3, v0, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 113
    :cond_0
    iget p1, p0, Ll/᩺֡ۖ;->᩶:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/᩺֡ۖ;->᩶:I

    .line 114
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-object v1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 120
    invoke-virtual {p0}, Ll/᩵ۜۖ;->ۧ()V

    .line 121
    invoke-direct {p0, p1}, Ll/᩺֡ۖ;->֫(I)V

    .line 123
    iget-object v0, p0, Ll/᩺֡ۖ;->᩹:[Ljava/lang/Object;

    aget-object v1, v0, p1

    .line 124
    aput-object p2, v0, p1

    .line 126
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-object v1
.end method

.method public final size()I
    .locals 1

    .line 132
    iget v0, p0, Ll/᩺֡ۖ;->᩶:I

    return v0
.end method

.method public final ᩷(I)Ll/᩺ᩴۖ;
    .locals 3

    .line 41
    iget v0, p0, Ll/᩺֡ۖ;->᩶:I

    if-lt p1, v0, :cond_0

    .line 45
    iget-object v0, p0, Ll/᩺֡ۖ;->᩹:[Ljava/lang/Object;

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    .line 47
    new-instance v0, Ll/᩺֡ۖ;

    iget v1, p0, Ll/᩺֡ۖ;->᩶:I

    const/4 v2, 0x1

    invoke-direct {v0, p1, v1, v2}, Ll/᩺֡ۖ;-><init>([Ljava/lang/Object;IZ)V

    return-object v0

    .line 42
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method
