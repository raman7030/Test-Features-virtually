.class public final Ll/ۚۜۖ;
.super Ll/᩵ۜۖ;
.source "RGS"

# interfaces
.implements Ll/᩶ᩴۖ;
.implements Ljava/util/RandomAccess;
.implements Ll/ۤ֡ۖ;


# static fields
.field public static final ۙ:Ll/ۚۜۖ;


# instance fields
.field public ᩶:I

.field public ᩹:[Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 25
    new-instance v0, Ll/ۚۜۖ;

    const/4 v1, 0x0

    new-array v2, v1, [Z

    invoke-direct {v0, v2, v1, v1}, Ll/ۚۜۖ;-><init>([ZIZ)V

    sput-object v0, Ll/ۚۜۖ;->ۙ:Ll/ۚۜۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/16 v0, 0xa

    new-array v0, v0, [Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 42
    invoke-direct {p0, v0, v1, v2}, Ll/ۚۜۖ;-><init>([ZIZ)V

    return-void
.end method

.method public constructor <init>([ZIZ)V
    .locals 0

    .line 50
    invoke-direct {p0, p3}, Ll/᩵ۜۖ;-><init>(Z)V

    .line 51
    iput-object p1, p0, Ll/ۚۜۖ;->᩹:[Z

    .line 52
    iput p2, p0, Ll/ۚۜۖ;->᩶:I

    return-void
.end method

.method private ֫(I)V
    .locals 3

    if-ltz p1, :cond_0

    .line 265
    iget v0, p0, Ll/ۚۜۖ;->᩶:I

    if-ge p1, v0, :cond_0

    return-void

    .line 266
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Index:"

    const-string v2, ", Size:"

    .line 0
    invoke-static {p1, v1, v2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 271
    iget v1, p0, Ll/ۚۜۖ;->᩶:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 266
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ܽ()Ll/ۚۜۖ;
    .locals 1

    .line 28
    sget-object v0, Ll/ۚۜۖ;->ۙ:Ll/ۚۜۖ;

    return-object v0
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 5

    .line 22
    check-cast p2, Ljava/lang/Boolean;

    .line 165
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    .line 186
    invoke-virtual {p0}, Ll/᩵ۜۖ;->ۧ()V

    if-ltz p1, :cond_1

    .line 187
    iget v0, p0, Ll/ۚۜۖ;->᩶:I

    if-gt p1, v0, :cond_1

    .line 191
    iget-object v1, p0, Ll/ۚۜۖ;->᩹:[Z

    array-length v2, v1

    const/4 v3, 0x1

    if-ge v0, v2, :cond_0

    add-int/lit8 v2, p1, 0x1

    sub-int/2addr v0, p1

    .line 193
    invoke-static {v1, p1, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x3

    const/4 v4, 0x2

    .line 196
    invoke-static {v0, v2, v4, v3}, Ll/᩻ᩳᩴ;->֫(IIII)I

    move-result v0

    .line 197
    new-array v0, v0, [Z

    const/4 v2, 0x0

    .line 200
    invoke-static {v1, v2, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 203
    iget-object v1, p0, Ll/ۚۜۖ;->᩹:[Z

    add-int/lit8 v2, p1, 0x1

    iget v4, p0, Ll/ۚۜۖ;->᩶:I

    sub-int/2addr v4, p1

    invoke-static {v1, p1, v0, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 204
    iput-object v0, p0, Ll/ۚۜۖ;->᩹:[Z

    .line 207
    :goto_0
    iget-object v0, p0, Ll/ۚۜۖ;->᩹:[Z

    aput-boolean p2, v0, p1

    .line 208
    iget p1, p0, Ll/ۚۜۖ;->᩶:I

    add-int/2addr p1, v3

    iput p1, p0, Ll/ۚۜۖ;->᩶:I

    .line 209
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/2addr p1, v3

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void

    .line 188
    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Index:"

    const-string v1, ", Size:"

    .line 0
    invoke-static {p1, v0, v1}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 271
    iget v0, p0, Ll/ۚۜۖ;->᩶:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 188
    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 0

    .line 22
    check-cast p1, Ljava/lang/Boolean;

    .line 159
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۚۜۖ;->֫(Z)V

    const/4 p1, 0x1

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 5

    .line 214
    invoke-virtual {p0}, Ll/᩵ۜۖ;->ۧ()V

    .line 216
    sget-object v0, Ll/ܰᩴۖ;->֫:[B

    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    instance-of v0, p1, Ll/ۚۜۖ;

    if-nez v0, :cond_0

    .line 220
    invoke-super {p0, p1}, Ll/᩵ۜۖ;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1

    .line 223
    :cond_0
    check-cast p1, Ll/ۚۜۖ;

    .line 224
    iget v0, p1, Ll/ۚۜۖ;->᩶:I

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    .line 228
    :cond_1
    iget v2, p0, Ll/ۚۜۖ;->᩶:I

    const v3, 0x7fffffff

    sub-int/2addr v3, v2

    if-lt v3, v0, :cond_3

    add-int/2addr v2, v0

    .line 235
    iget-object v0, p0, Ll/ۚۜۖ;->᩹:[Z

    array-length v3, v0

    if-le v2, v3, :cond_2

    .line 236
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object v0

    iput-object v0, p0, Ll/ۚۜۖ;->᩹:[Z

    .line 239
    :cond_2
    iget-object v0, p1, Ll/ۚۜۖ;->᩹:[Z

    iget-object v3, p0, Ll/ۚۜۖ;->᩹:[Z

    iget v4, p0, Ll/ۚۜۖ;->᩶:I

    iget p1, p1, Ll/ۚۜۖ;->᩶:I

    invoke-static {v0, v1, v3, v4, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 240
    iput v2, p0, Ll/ۚۜۖ;->᩶:I

    .line 241
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    const/4 v0, 0x1

    add-int/2addr p1, v0

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return v0

    .line 231
    :cond_3
    new-instance p1, Ljava/lang/OutOfMemoryError;

    invoke-direct {p1}, Ljava/lang/OutOfMemoryError;-><init>()V

    throw p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 135
    invoke-virtual {p0, p1}, Ll/ۚۜۖ;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 72
    :cond_0
    instance-of v1, p1, Ll/ۚۜۖ;

    if-nez v1, :cond_1

    .line 73
    invoke-super {p0, p1}, Ll/᩵ۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 75
    :cond_1
    check-cast p1, Ll/ۚۜۖ;

    .line 76
    iget v1, p0, Ll/ۚۜۖ;->᩶:I

    iget v2, p1, Ll/ۚۜۖ;->᩶:I

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    .line 80
    :cond_2
    iget-object p1, p1, Ll/ۚۜۖ;->᩹:[Z

    const/4 v1, 0x0

    .line 81
    :goto_0
    iget v2, p0, Ll/ۚۜۖ;->᩶:I

    if-ge v1, v2, :cond_4

    .line 82
    iget-object v2, p0, Ll/ۚۜۖ;->᩹:[Z

    aget-boolean v2, v2, v1

    aget-boolean v4, p1, v1

    if-eq v2, v4, :cond_3

    return v3

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 114
    invoke-direct {p0, p1}, Ll/ۚۜۖ;->֫(I)V

    .line 115
    iget-object v0, p0, Ll/ۚۜۖ;->᩹:[Z

    aget-boolean p1, v0, p1

    .line 109
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 93
    :goto_0
    iget v2, p0, Ll/ۚۜۖ;->᩶:I

    if-ge v1, v2, :cond_0

    mul-int/lit8 v0, v0, 0x1f

    .line 94
    iget-object v2, p0, Ll/ۚۜۖ;->᩹:[Z

    aget-boolean v2, v2, v1

    invoke-static {v2}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 4

    .line 120
    instance-of v0, p1, Ljava/lang/Boolean;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    .line 123
    :cond_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 140
    iget v0, p0, Ll/ۚۜۖ;->᩶:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 126
    iget-object v3, p0, Ll/ۚۜۖ;->᩹:[Z

    aget-boolean v3, v3, v2

    if-ne v3, p1, :cond_1

    return v2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 4

    .line 247
    invoke-virtual {p0}, Ll/᩵ۜۖ;->ۧ()V

    .line 248
    invoke-direct {p0, p1}, Ll/ۚۜۖ;->֫(I)V

    .line 249
    iget-object v0, p0, Ll/ۚۜۖ;->᩹:[Z

    aget-boolean v1, v0, p1

    .line 250
    iget v2, p0, Ll/ۚۜۖ;->᩶:I

    add-int/lit8 v3, v2, -0x1

    if-ge p1, v3, :cond_0

    add-int/lit8 v3, p1, 0x1

    sub-int/2addr v2, p1

    add-int/lit8 v2, v2, -0x1

    .line 251
    invoke-static {v0, v3, v0, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 253
    :cond_0
    iget p1, p0, Ll/ۚۜۖ;->᩶:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ۚۜۖ;->᩶:I

    .line 254
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    .line 255
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final removeRange(II)V
    .locals 2

    .line 57
    invoke-virtual {p0}, Ll/᩵ۜۖ;->ۧ()V

    if-lt p2, p1, :cond_0

    .line 62
    iget-object v0, p0, Ll/ۚۜۖ;->᩹:[Z

    iget v1, p0, Ll/ۚۜۖ;->᩶:I

    sub-int/2addr v1, p2

    invoke-static {v0, p2, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 63
    iget v0, p0, Ll/ۚۜۖ;->᩶:I

    sub-int/2addr p2, p1

    sub-int/2addr v0, p2

    iput v0, p0, Ll/ۚۜۖ;->᩶:I

    .line 64
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void

    .line 59
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "toIndex < fromIndex"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 22
    check-cast p2, Ljava/lang/Boolean;

    .line 145
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    .line 150
    invoke-virtual {p0}, Ll/᩵ۜۖ;->ۧ()V

    .line 151
    invoke-direct {p0, p1}, Ll/ۚۜۖ;->֫(I)V

    .line 152
    iget-object v0, p0, Ll/ۚۜۖ;->᩹:[Z

    aget-boolean v1, v0, p1

    .line 153
    aput-boolean p2, v0, p1

    .line 145
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 140
    iget v0, p0, Ll/ۚۜۖ;->᩶:I

    return v0
.end method

.method public final ֫(Z)V
    .locals 5

    .line 171
    invoke-virtual {p0}, Ll/᩵ۜۖ;->ۧ()V

    .line 172
    iget v0, p0, Ll/ۚۜۖ;->᩶:I

    iget-object v1, p0, Ll/ۚۜۖ;->᩹:[Z

    array-length v2, v1

    if-ne v0, v2, :cond_0

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    .line 174
    invoke-static {v0, v2, v3, v4}, Ll/᩻ᩳᩴ;->֫(IIII)I

    move-result v2

    .line 175
    new-array v2, v2, [Z

    const/4 v3, 0x0

    .line 177
    invoke-static {v1, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 178
    iput-object v2, p0, Ll/ۚۜۖ;->᩹:[Z

    .line 181
    :cond_0
    iget-object v0, p0, Ll/ۚۜۖ;->᩹:[Z

    iget v1, p0, Ll/ۚۜۖ;->᩶:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۚۜۖ;->᩶:I

    aput-boolean p1, v0, v1

    return-void
.end method

.method public final ᩷(I)Ll/᩺ᩴۖ;
    .locals 3

    .line 101
    iget v0, p0, Ll/ۚۜۖ;->᩶:I

    if-lt p1, v0, :cond_0

    .line 104
    new-instance v0, Ll/ۚۜۖ;

    iget-object v1, p0, Ll/ۚۜۖ;->᩹:[Z

    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object p1

    iget v1, p0, Ll/ۚۜۖ;->᩶:I

    const/4 v2, 0x1

    invoke-direct {v0, p1, v1, v2}, Ll/ۚۜۖ;-><init>([ZIZ)V

    return-object v0

    .line 102
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method
