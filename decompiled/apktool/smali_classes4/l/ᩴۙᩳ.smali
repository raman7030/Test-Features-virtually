.class public final Ll/ᩴۙᩳ;
.super Ljava/lang/Object;
.source "V6TP"


# instance fields
.field public final ֫:[B

.field public final ۧ:Ljava/security/MessageDigest;

.field public final ܽ:Ljava/nio/CharBuffer;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴۙᩳ;->ۧ:Ljava/security/MessageDigest;

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x24

    .line 18
    new-array p1, p1, [B

    iput-object p1, p0, Ll/ᩴۙᩳ;->֫:[B

    .line 20
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asCharBuffer()Ljava/nio/CharBuffer;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴۙᩳ;->ܽ:Ljava/nio/CharBuffer;

    return-void
.end method


# virtual methods
.method public final ֫([BII[C)[B
    .locals 6

    .line 32
    array-length v0, p1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_4

    if-lez p3, :cond_4

    if-ltz p2, :cond_4

    array-length v0, p4

    sub-int/2addr v0, p3

    if-gt p2, v0, :cond_4

    .line 34
    iget-object v0, p0, Ll/ᩴۙᩳ;->ۧ:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->reset()V

    .line 35
    array-length v1, p1

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ᩴۙᩳ;->֫:[B

    invoke-static {p1, v2, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 p1, 0x0

    :goto_0
    const/4 v1, 0x4

    if-ge p1, v1, :cond_0

    add-int/lit8 v1, p1, 0x20

    mul-int/lit8 v4, p1, 0x8

    ushr-int v4, p3, v4

    int-to-byte v4, v4

    .line 36
    aput-byte v4, v3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    add-int/2addr p3, p2

    const/16 p1, 0x24

    :cond_1
    :goto_1
    if-ge p2, p3, :cond_2

    .line 39
    array-length v1, v3

    sub-int/2addr v1, p1

    div-int/lit8 v1, v1, 0x2

    sub-int v4, p3, p2

    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 40
    div-int/lit8 v4, p1, 0x2

    iget-object v5, p0, Ll/ᩴۙᩳ;->ܽ:Ljava/nio/CharBuffer;

    invoke-virtual {v5, v4}, Ljava/nio/CharBuffer;->position(I)Ljava/nio/Buffer;

    .line 41
    invoke-virtual {v5, p4, p2, v1}, Ljava/nio/CharBuffer;->put([CII)Ljava/nio/CharBuffer;

    mul-int/lit8 v4, v1, 0x2

    add-int/2addr p1, v4

    add-int/2addr p2, v1

    .line 44
    array-length v1, v3

    if-ne p1, v1, :cond_1

    .line 45
    invoke-virtual {v0, v3}, Ljava/security/MessageDigest;->update([B)V

    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    if-eqz p1, :cond_3

    .line 49
    invoke-virtual {v0, v3, v2, p1}, Ljava/security/MessageDigest;->update([BII)V

    .line 50
    :cond_3
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    return-object p1

    .line 33
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid load hash batch"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
