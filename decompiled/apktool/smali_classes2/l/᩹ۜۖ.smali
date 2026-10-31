.class public final Ll/᩹ۜۖ;
.super Ll/۫ۜۖ;
.source "Y4D9"


# static fields
.field public static final serialVersionUID:J = 0x1L


# instance fields
.field public final ۗ:I

.field public final ۬:I


# direct methods
.method public constructor <init>([BII)V
    .locals 1

    .line 1612
    invoke-direct {p0, p1}, Ll/۫ۜۖ;-><init>([B)V

    add-int v0, p2, p3

    .line 1613
    array-length p1, p1

    invoke-static {p2, v0, p1}, Ll/ۛۜۖ;->ۧ(III)I

    .line 1615
    iput p2, p0, Ll/᩹ۜۖ;->۬:I

    .line 1616
    iput p3, p0, Ll/᩹ۜۖ;->ۗ:I

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 1671
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "BoundedByteStream instances are not to be serialized directly"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final size()I
    .locals 1

    .line 1643
    iget v0, p0, Ll/᩹ۜۖ;->ۗ:I

    return v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 2

    .line 1667
    invoke-virtual {p0}, Ll/ۛۜۖ;->ܿ()[B

    move-result-object v0

    .line 439
    new-instance v1, Ll/۫ۜۖ;

    invoke-direct {v1, v0}, Ll/۫ۜۖ;-><init>([B)V

    return-object v1
.end method

.method public final ֫(I)B
    .locals 4

    add-int/lit8 v0, p1, 0x1

    .line 1306
    iget v1, p0, Ll/᩹ۜۖ;->ۗ:I

    sub-int v0, v1, v0

    or-int/2addr v0, p1

    if-gez v0, :cond_1

    if-gez p1, :cond_0

    .line 1308
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v1, "Index < 0: "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1308
    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1310
    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v2, "Index > length: "

    const-string v3, ", "

    .line 0
    invoke-static {v2, p1, v1, v3}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1310
    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1633
    :cond_1
    iget v0, p0, Ll/᩹ۜۖ;->۬:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/۫ۜۖ;->ۙ:[B

    aget-byte p1, p1, v0

    return p1
.end method

.method public final ֫(I[BII)V
    .locals 1

    .line 1648
    iget v0, p0, Ll/᩹ۜۖ;->۬:I

    add-int/2addr v0, p1

    .line 1657
    iget-object p1, p0, Ll/۫ۜۖ;->ۙ:[B

    invoke-static {p1, v0, p2, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final ۧ(I)B
    .locals 1

    .line 1638
    iget v0, p0, Ll/᩹ۜۖ;->۬:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ll/۫ۜۖ;->ۙ:[B

    aget-byte p1, p1, v0

    return p1
.end method

.method public final ᩻()I
    .locals 1

    .line 1648
    iget v0, p0, Ll/᩹ۜۖ;->۬:I

    return v0
.end method
