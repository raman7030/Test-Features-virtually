.class public final Ll/۫֨ۖ;
.super Ljava/lang/Object;
.source "Y3NK"


# static fields
.field public static final ֫:Ll/᩶֨ۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1150
    invoke-static {}, Ll/᩸֨ۖ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ll/᩸֨ۖ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 62
    invoke-static {}, Ll/֡ۜۖ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 63
    new-instance v0, Ll/۬֨ۖ;

    .line 358
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    .line 64
    :cond_0
    new-instance v0, Ll/ۙ֨ۖ;

    .line 358
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 64
    :goto_0
    sput-object v0, Ll/۫֨ۖ;->֫:Ll/᩶֨ۖ;

    return-void
.end method

.method public static ֫(I)I
    .locals 1

    const/16 v0, -0xc

    if-le p0, v0, :cond_0

    const/4 p0, -0x1

    :cond_0
    return p0
.end method

.method public static synthetic ֫(II)I
    .locals 0

    .line 54
    invoke-static {p0, p1}, Ll/۫֨ۖ;->ۧ(II)I

    move-result p0

    return p0
.end method

.method public static synthetic ֫(III)I
    .locals 0

    .line 54
    invoke-static {p0, p1, p2}, Ll/۫֨ۖ;->ۧ(III)I

    move-result p0

    return p0
.end method

.method public static ֫(IILjava/lang/String;[B)I
    .locals 1

    .line 271
    sget-object v0, Ll/۫֨ۖ;->֫:Ll/᩶֨ۖ;

    invoke-virtual {v0, p0, p1, p2, p3}, Ll/᩶֨ۖ;->֫(IILjava/lang/String;[B)I

    move-result p0

    return p0
.end method

.method public static ֫(II[B)I
    .locals 3

    add-int/lit8 v0, p0, -0x1

    .line 172
    aget-byte v0, p2, v0

    sub-int/2addr p1, p0

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v2, 0x2

    if-ne p1, v2, :cond_0

    .line 179
    aget-byte p1, p2, p0

    add-int/2addr p0, v1

    aget-byte p0, p2, p0

    invoke-static {v0, p1, p0}, Ll/۫֨ۖ;->ۧ(III)I

    move-result p0

    return p0

    .line 181
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    .line 177
    :cond_1
    aget-byte p0, p2, p0

    invoke-static {v0, p0}, Ll/۫֨ۖ;->ۧ(II)I

    move-result p0

    return p0

    :cond_2
    const/16 p0, -0xc

    if-le v0, p0, :cond_3

    const/4 p0, -0x1

    return p0

    :cond_3
    return v0
.end method

.method public static ֫(Ljava/lang/String;)I
    .locals 8

    .line 219
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 224
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x80

    if-ge v3, v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    move v3, v0

    :goto_1
    if-ge v2, v0, :cond_6

    .line 230
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x800

    if-ge v4, v5, :cond_1

    rsub-int/lit8 v4, v4, 0x7f

    ushr-int/lit8 v4, v4, 0x1f

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 248
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    :goto_2
    if-ge v2, v4, :cond_5

    .line 251
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-ge v6, v5, :cond_2

    rsub-int/lit8 v6, v6, 0x7f

    ushr-int/lit8 v6, v6, 0x1f

    add-int/2addr v1, v6

    goto :goto_3

    :cond_2
    add-int/lit8 v1, v1, 0x2

    const v7, 0xd800

    if-gt v7, v6, :cond_4

    const v7, 0xdfff

    if-gt v6, v7, :cond_4

    .line 259
    invoke-static {p0, v2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    const/high16 v7, 0x10000

    if-lt v6, v7, :cond_3

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 261
    :cond_3
    new-instance p0, Ll/ۗ֨ۖ;

    invoke-direct {p0, v2, v4}, Ll/ۗ֨ۖ;-><init>(II)V

    throw p0

    :cond_4
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    add-int/2addr v3, v1

    :cond_6
    if-lt v3, v0, :cond_7

    return v3

    .line 241
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "UTF-8 length does not fit in int: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-long v1, v3

    const-wide v3, 0x100000000L

    add-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/nio/ByteBuffer;II)Ljava/lang/String;
    .locals 2

    .line 308
    sget-object v0, Ll/۫֨ۖ;->֫:Ll/᩶֨ۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 604
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 605
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v1

    .line 606
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    add-int/2addr v1, p1

    invoke-virtual {v0, v1, p2, p0}, Ll/᩶֨ۖ;->֫(II[B)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 607
    :cond_0
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 608
    invoke-virtual {v0, p0, p1, p2}, Ll/᩶֨ۖ;->֫(Ljava/nio/ByteBuffer;II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 610
    :cond_1
    invoke-static {p0, p1, p2}, Ll/᩶֨ۖ;->ۧ(Ljava/nio/ByteBuffer;II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫([B)Z
    .locals 3

    .line 125
    array-length v0, p0

    .line 368
    sget-object v1, Ll/۫֨ۖ;->֫:Ll/᩶֨ۖ;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, p0, v2, v0}, Ll/᩶֨ۖ;->֫(I[BII)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    return v2
.end method

.method public static ۧ(II)I
    .locals 1

    const/16 v0, -0xc

    if-gt p0, v0, :cond_1

    const/16 v0, -0x41

    if-le p1, v0, :cond_0

    goto :goto_0

    :cond_0
    shl-int/lit8 p1, p1, 0x8

    xor-int/2addr p0, p1

    return p0

    :cond_1
    :goto_0
    const/4 p0, -0x1

    return p0
.end method

.method public static ۧ(III)I
    .locals 1

    const/16 v0, -0xc

    if-gt p0, v0, :cond_1

    const/16 v0, -0x41

    if-gt p1, v0, :cond_1

    if-le p2, v0, :cond_0

    goto :goto_0

    :cond_0
    shl-int/lit8 p1, p1, 0x8

    xor-int/2addr p0, p1

    shl-int/lit8 p1, p2, 0x10

    xor-int/2addr p0, p1

    return p0

    :cond_1
    :goto_0
    const/4 p0, -0x1

    return p0
.end method

.method public static ۧ(II[B)Ljava/lang/String;
    .locals 1

    .line 318
    sget-object v0, Ll/۫֨ۖ;->֫:Ll/᩶֨ۖ;

    invoke-virtual {v0, p0, p1, p2}, Ll/᩶֨ۖ;->֫(II[B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(II[B)Z
    .locals 2

    .line 368
    sget-object v0, Ll/۫֨ۖ;->֫:Ll/᩶֨ۖ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p2, p0, p1}, Ll/᩶֨ۖ;->֫(I[BII)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    return v1
.end method
