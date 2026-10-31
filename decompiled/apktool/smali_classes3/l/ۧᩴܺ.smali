.class public final Ll/ۧᩴܺ;
.super Ljava/lang/Object;
.source "439X"


# instance fields
.field public final ֫:[B

.field public final ۧ:I


# direct methods
.method public constructor <init>([B)V
    .locals 2

    .line 83
    array-length v0, p1

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz v0, :cond_1

    .line 68
    array-length v1, p1

    if-gt v0, v1, :cond_0

    .line 72
    iput-object p1, p0, Ll/ۧᩴܺ;->֫:[B

    .line 74
    iput v0, p0, Ll/ۧᩴܺ;->ۧ:I

    return-void

    .line 69
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "end > bytes.length"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 65
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "end < start"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/ۧᩴܺ;I)I
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۧᩴܺ;->᩻(I)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic ֫(Ll/ۧᩴܺ;)[B
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧᩴܺ;->֫:[B

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۧᩴܺ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۧᩴܺ;->ۧ:I

    return p0
.end method

.method private ۧ(II)V
    .locals 5

    .line 225
    iget v0, p0, Ll/ۧᩴܺ;->ۧ:I

    if-ltz p1, :cond_0

    if-lt p2, p1, :cond_0

    if-gt p2, v0, :cond_0

    return-void

    .line 226
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, ".."

    const-string v3, "; actual size "

    const-string v4, "bad range: "

    .line 0
    invoke-static {v4, p1, v2, v3, p2}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 226
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private ᩻(I)I
    .locals 1

    .line 250
    iget-object v0, p0, Ll/ۧᩴܺ;->֫:[B

    aget-byte p1, v0, p1

    and-int/lit16 p1, p1, 0xff

    return p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 92
    iget v0, p0, Ll/ۧᩴܺ;->ۧ:I

    return v0
.end method

.method public final ֫(I)I
    .locals 1

    add-int/lit8 v0, p1, 0x1

    .line 129
    invoke-direct {p0, p1, v0}, Ll/ۧᩴܺ;->ۧ(II)V

    .line 239
    iget-object v0, p0, Ll/ۧᩴܺ;->֫:[B

    aget-byte p1, v0, p1

    return p1
.end method

.method public final ֫(II)Ll/ۧᩴܺ;
    .locals 1

    .line 104
    invoke-direct {p0, p1, p2}, Ll/ۧᩴܺ;->ۧ(II)V

    .line 105
    iget-object v0, p0, Ll/ۧᩴܺ;->֫:[B

    invoke-static {v0, p1, p2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    .line 106
    new-instance p2, Ll/ۧᩴܺ;

    invoke-direct {p2, p1}, Ll/ۧᩴܺ;-><init>([B)V

    return-object p2
.end method

.method public final ֫(I[B)V
    .locals 3

    .line 210
    array-length v0, p2

    sub-int/2addr v0, p1

    iget v1, p0, Ll/ۧᩴܺ;->ۧ:I

    if-lt v0, v1, :cond_0

    .line 215
    iget-object v0, p0, Ll/ۧᩴܺ;->֫:[B

    const/4 v2, 0x0

    invoke-static {v0, v2, p2, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    .line 211
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "(out.length - offset) < size()"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(I)I
    .locals 2

    add-int/lit8 v0, p1, 0x4

    .line 151
    invoke-direct {p0, p1, v0}, Ll/ۧᩴܺ;->ۧ(II)V

    .line 239
    iget-object v0, p0, Ll/ۧᩴܺ;->֫:[B

    aget-byte v0, v0, p1

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p1, 0x1

    .line 153
    invoke-direct {p0, v1}, Ll/ۧᩴܺ;->᩻(I)I

    move-result v1

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    .line 154
    invoke-direct {p0, v1}, Ll/ۧᩴܺ;->᩻(I)I

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x3

    .line 155
    invoke-direct {p0, p1}, Ll/ۧᩴܺ;->᩻(I)I

    move-result p1

    or-int/2addr p1, v0

    return p1
.end method

.method public final ܳ(I)I
    .locals 1

    add-int/lit8 v0, p1, 0x2

    .line 196
    invoke-direct {p0, p1, v0}, Ll/ۧᩴܺ;->ۧ(II)V

    .line 197
    invoke-direct {p0, p1}, Ll/ۧᩴܺ;->᩻(I)I

    move-result v0

    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 p1, p1, 0x1

    invoke-direct {p0, p1}, Ll/ۧᩴܺ;->᩻(I)I

    move-result p1

    or-int/2addr p1, v0

    return p1
.end method

.method public final ܽ(I)J
    .locals 6

    add-int/lit8 v0, p1, 0x8

    .line 165
    invoke-direct {p0, p1, v0}, Ll/ۧᩴܺ;->ۧ(II)V

    .line 239
    iget-object v0, p0, Ll/ۧᩴܺ;->֫:[B

    aget-byte v1, v0, p1

    shl-int/lit8 v1, v1, 0x18

    add-int/lit8 v2, p1, 0x1

    .line 167
    invoke-direct {p0, v2}, Ll/ۧᩴܺ;->᩻(I)I

    move-result v2

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    add-int/lit8 v2, p1, 0x2

    .line 168
    invoke-direct {p0, v2}, Ll/ۧᩴܺ;->᩻(I)I

    move-result v2

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    add-int/lit8 v2, p1, 0x3

    .line 169
    invoke-direct {p0, v2}, Ll/ۧᩴܺ;->᩻(I)I

    move-result v2

    or-int/2addr v1, v2

    add-int/lit8 v2, p1, 0x4

    .line 239
    aget-byte v0, v0, v2

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v2, p1, 0x5

    .line 171
    invoke-direct {p0, v2}, Ll/ۧᩴܺ;->᩻(I)I

    move-result v2

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v0, v2

    add-int/lit8 v2, p1, 0x6

    .line 172
    invoke-direct {p0, v2}, Ll/ۧᩴܺ;->᩻(I)I

    move-result v2

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v0, v2

    add-int/lit8 p1, p1, 0x7

    .line 173
    invoke-direct {p0, p1}, Ll/ۧᩴܺ;->᩻(I)I

    move-result p1

    or-int/2addr p1, v0

    int-to-long v2, p1

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    int-to-long v0, v1

    const/16 p1, 0x20

    shl-long/2addr v0, p1

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final ܿ(I)I
    .locals 1

    add-int/lit8 v0, p1, 0x1

    .line 185
    invoke-direct {p0, p1, v0}, Ll/ۧᩴܺ;->ۧ(II)V

    .line 186
    invoke-direct {p0, p1}, Ll/ۧᩴܺ;->᩻(I)I

    move-result p1

    return p1
.end method

.method public final ᩳ(I)I
    .locals 1

    add-int/lit8 v0, p1, 0x2

    .line 140
    invoke-direct {p0, p1, v0}, Ll/ۧᩴܺ;->ۧ(II)V

    .line 239
    iget-object v0, p0, Ll/ۧᩴܺ;->֫:[B

    aget-byte v0, v0, p1

    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 p1, p1, 0x1

    .line 141
    invoke-direct {p0, p1}, Ll/ۧᩴܺ;->᩻(I)I

    move-result p1

    or-int/2addr p1, v0

    return p1
.end method
