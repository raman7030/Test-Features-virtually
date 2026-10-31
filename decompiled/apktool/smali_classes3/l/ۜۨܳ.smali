.class public final Ll/ۜۨܳ;
.super Ljava/lang/Object;
.source "F8CE"

# interfaces
.implements Ll/ۢۨܳ;


# static fields
.field public static final ֫:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/16 v0, 0xd

    const/16 v1, 0x11

    const/4 v2, 0x1

    const/4 v3, 0x5

    const/16 v4, 0x9

    .line 169
    filled-new-array {v2, v3, v4, v0, v1}, [I

    move-result-object v0

    sput-object v0, Ll/ۜۨܳ;->֫:[I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠ۖܽ;)J
    .locals 4

    const-wide/16 v0, 0x4

    const-wide/16 v2, -0x1

    .line 105
    :try_start_0
    invoke-interface {p1, v0, v1}, Ll/۠ۖܽ;->seek(J)V

    .line 106
    invoke-interface {p1}, Ll/۠ۖܽ;->readByte()B

    move-result v0

    invoke-static {v0}, Ll/۠ۨ᩵;->֫(B)Ll/۠ۨ᩵;

    move-result-object v0

    .line 107
    sget-object v1, Ll/֨ۨ᩵;->۬:Ll/֨ۨ᩵;

    invoke-virtual {v0, v1}, Ll/۠ۨ᩵;->֫(Ll/֨ۨ᩵;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 108
    invoke-interface {p1, v0}, Ll/۠ۖܽ;->skipBytes(I)I

    .line 109
    invoke-interface {p1}, Ll/۠ۖܽ;->readLong()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    :cond_0
    return-wide v2
.end method

.method public final ֫(Ljava/io/InputStream;)Ljava/io/InputStream;
    .locals 1

    .line 165
    new-instance v0, Ll/᩵ۨ᩵;

    invoke-direct {v0, p1}, Ll/᩵ۨ᩵;-><init>(Ljava/io/InputStream;)V

    return-object v0
.end method

.method public final ֫(Ljava/io/OutputStream;IJ)Ljava/io/OutputStream;
    .locals 2

    .line 173
    new-instance v0, Ll/᩸ۨ᩵;

    sget-object v1, Ll/ۜۨܳ;->֫:[I

    aget p2, v1, p2

    invoke-direct {v0, p1, p2, p3, p4}, Ll/᩸ۨ᩵;-><init>(Ljava/io/OutputStream;IJ)V

    return-object v0
.end method

.method public final ֫([BI)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x4

    if-ge p2, v1, :cond_0

    goto :goto_1

    .line 79
    :cond_0
    invoke-static {p1, v0, p2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 80
    sget-object p2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 82
    :goto_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result p2

    if-ge p2, v1, :cond_1

    goto :goto_1

    .line 85
    :cond_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p2

    const v2, 0x184d2204

    if-ne p2, v2, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    ushr-int/lit8 p2, p2, 0x4

    const v2, 0x184d2a5

    if-ne p2, v2, :cond_5

    .line 90
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result p2

    if-ge p2, v1, :cond_3

    goto :goto_1

    .line 93
    :cond_3
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p2

    .line 94
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    if-ge v2, p2, :cond_4

    goto :goto_1

    .line 97
    :cond_4
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v2

    add-int/2addr v2, p2

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_0

    :cond_5
    :goto_1
    return v0
.end method
