.class public Ll/᩺ۤ֡;
.super Ll/ۘۨ֡;
.source "698I"


# instance fields
.field public ᩶:[B

.field public final ᩹:I


# direct methods
.method public constructor <init>([BI)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ll/ۘۨ֡;-><init>()V

    .line 48
    iput-object p1, p0, Ll/᩺ۤ֡;->᩶:[B

    .line 49
    iput p2, p0, Ll/᩺ۤ֡;->᩹:I

    return-void
.end method


# virtual methods
.method public final length()I
    .locals 2

    .line 110
    iget-object v0, p0, Ll/᩺ۤ֡;->᩶:[B

    array-length v0, v0

    iget v1, p0, Ll/᩺ۤ֡;->᩹:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final ֫(I)B
    .locals 2

    .line 86
    iget-object v0, p0, Ll/᩺ۤ֡;->᩶:[B

    iget v1, p0, Ll/᩺ۤ֡;->᩹:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method public final ֫(IILjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 3

    .line 105
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Ll/᩺ۤ֡;->᩶:[B

    iget v2, p0, Ll/᩺ۤ֡;->᩹:I

    add-int/2addr v2, p1

    invoke-direct {v0, v1, v2, p2, p3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v0
.end method

.method public final ֫()[B
    .locals 1

    .line 118
    iget-object v0, p0, Ll/᩺ۤ֡;->᩶:[B

    return-object v0
.end method

.method public final ۧ(I)I
    .locals 3

    .line 68
    iget-object v0, p0, Ll/᩺ۤ֡;->᩶:[B

    .line 69
    iget v1, p0, Ll/᩺ۤ֡;->᩹:I

    add-int/2addr p1, v1

    .line 70
    aget-byte v1, v0, p1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v2, p1, 0x1

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    add-int/lit8 v2, p1, 0x2

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    add-int/lit8 p1, p1, 0x3

    aget-byte p1, v0, p1

    shl-int/lit8 p1, p1, 0x18

    or-int/2addr p1, v1

    return p1
.end method

.method public final ۧ([B)V
    .locals 0

    .line 122
    iput-object p1, p0, Ll/᩺ۤ֡;->᩶:[B

    return-void
.end method

.method public final ܽ(I)J
    .locals 8

    .line 54
    iget-object v0, p0, Ll/᩺ۤ֡;->᩶:[B

    .line 55
    iget v1, p0, Ll/᩺ۤ֡;->᩹:I

    add-int/2addr p1, v1

    .line 56
    aget-byte v1, v0, p1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v2, p1, 0x1

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    add-int/lit8 v2, p1, 0x2

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    int-to-long v1, v1

    add-int/lit8 v3, p1, 0x3

    aget-byte v3, v0, v3

    int-to-long v3, v3

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    const/16 v7, 0x18

    shl-long/2addr v3, v7

    or-long/2addr v1, v3

    add-int/lit8 v3, p1, 0x4

    aget-byte v3, v0, v3

    int-to-long v3, v3

    and-long/2addr v3, v5

    const/16 v7, 0x20

    shl-long/2addr v3, v7

    or-long/2addr v1, v3

    add-int/lit8 v3, p1, 0x5

    aget-byte v3, v0, v3

    int-to-long v3, v3

    and-long/2addr v3, v5

    const/16 v7, 0x28

    shl-long/2addr v3, v7

    or-long/2addr v1, v3

    add-int/lit8 v3, p1, 0x6

    aget-byte v3, v0, v3

    int-to-long v3, v3

    and-long/2addr v3, v5

    const/16 v5, 0x30

    shl-long/2addr v3, v5

    or-long/2addr v1, v3

    add-int/lit8 p1, p1, 0x7

    aget-byte p1, v0, p1

    int-to-long v3, p1

    const/16 p1, 0x38

    shl-long/2addr v3, p1

    or-long v0, v1, v3

    return-wide v0
.end method

.method public final ᩻(I)I
    .locals 2

    .line 78
    iget-object v0, p0, Ll/᩺ۤ֡;->᩶:[B

    .line 79
    iget v1, p0, Ll/᩺ۤ֡;->᩹:I

    add-int/2addr p1, v1

    .line 80
    aget-byte v1, v0, p1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 p1, p1, 0x1

    aget-byte p1, v0, p1

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p1, v1

    return p1
.end method
