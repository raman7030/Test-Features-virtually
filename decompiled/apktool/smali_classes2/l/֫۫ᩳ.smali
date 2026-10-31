.class public final Ll/֫۫ᩳ;
.super Ljava/lang/Object;
.source "B6UY"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/16 v0, 0x100

    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    const/4 v3, 0x0

    move v4, v2

    :goto_1
    const/16 v5, 0x8

    if-ge v3, v5, :cond_1

    ushr-int/lit8 v5, v4, 0x1

    and-int/lit8 v4, v4, 0x1

    if-nez v4, :cond_0

    const/4 v4, 0x0

    goto :goto_2

    :cond_0
    const v4, -0x12477ce0

    :goto_2
    xor-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 97
    :cond_1
    aput v4, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 23
    :cond_2
    sput-object v1, Ll/֫۫ᩳ;->ۧ:[I

    return-void
.end method

.method public static ֫(II[B)I
    .locals 1

    .line 145
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    .line 146
    invoke-virtual {v0, p2, p0, p1}, Ljava/util/zip/CRC32;->update([BII)V

    .line 147
    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide p0

    long-to-int p1, p0

    return p1
.end method

.method public static ֫(I[B)I
    .locals 4

    add-int/lit8 v0, p0, 0x18

    const/4 v1, -0x1

    :goto_0
    if-ge p0, v0, :cond_0

    ushr-int/lit8 v2, v1, 0x8

    .line 85
    aget-byte v3, p1, p0

    xor-int/2addr v1, v3

    and-int/lit16 v1, v1, 0xff

    sget-object v3, Ll/֫۫ᩳ;->ۧ:[I

    aget v1, v3, v1

    xor-int/2addr v1, v2

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    not-int p0, v1

    return p0
.end method

.method public static ֫(J[B)J
    .locals 2

    .line 120
    array-length v0, p2

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    .line 121
    new-instance v0, Ll/۬ۜܽ;

    invoke-direct {v0, p2}, Ll/۬ۜܽ;-><init>([B)V

    invoke-static {v0, p0, p1}, Ll/֫۫ᩳ;->֫(Ll/۬ۜܽ;J)J

    move-result-wide p0

    return-wide p0

    .line 120
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Truncated recovery footer"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/۬ۜܽ;J)J
    .locals 6

    .line 126
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v0

    const-wide/16 v2, 0x10

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    .line 127
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    .line 128
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    .line 129
    invoke-virtual {p0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v2

    const p0, 0x4645324d

    if-ne v0, p0, :cond_0

    const/16 p0, 0x30

    if-lt v1, p0, :cond_0

    const p0, 0x100030

    if-gt v1, p0, :cond_0

    const-wide/16 v4, 0x0

    cmp-long p0, v2, v4

    if-ltz p0, :cond_0

    int-to-long v0, v1

    cmp-long p0, p1, v0

    if-ltz p0, :cond_0

    sub-long/2addr p1, v0

    cmp-long p0, v2, p1

    if-nez p0, :cond_0

    return-wide v2

    .line 133
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid recovery record footer"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 126
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Truncated recovery footer"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/۬ۜܽ;)Ll/۟۬ᩳ;
    .locals 10

    .line 66
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v0

    const-wide/16 v2, 0x20

    cmp-long v4, v0, v2

    if-ltz v4, :cond_2

    .line 67
    invoke-virtual {p0}, Ll/۬ۜܽ;->֫()I

    move-result v0

    .line 68
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    const v2, 0x5245324d

    if-ne v1, v2, :cond_1

    .line 69
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v4

    .line 70
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v5

    .line 71
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v6

    .line 72
    invoke-virtual {p0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v7

    .line 73
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    const/4 v2, 0x1

    if-lt v4, v2, :cond_0

    const/4 v2, 0x6

    if-gt v4, v2, :cond_0

    if-ltz v5, :cond_0

    const/high16 v2, 0x100000

    if-gt v5, v2, :cond_0

    const-wide/16 v2, 0x0

    cmp-long v9, v7, v2

    if-lez v9, :cond_0

    .line 74
    iget-object v2, p0, Ll/۬ۜܽ;->᩸:[B

    .line 75
    invoke-static {v0, v2}, Ll/֫۫ᩳ;->֫(I[B)I

    move-result v0

    if-ne v1, v0, :cond_0

    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result p0

    if-nez p0, :cond_0

    .line 78
    new-instance p0, Ll/۟۬ᩳ;

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Ll/۟۬ᩳ;-><init>(IIIJ)V

    return-object p0

    .line 76
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid recovery record header"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 68
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid recovery record magic"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 66
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Truncated recovery header"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ۤۜܽ;IJII)V
    .locals 3

    if-ltz p4, :cond_0

    const/high16 v0, 0x100000

    if-gt p4, v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_0

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    const/4 v0, 0x6

    if-gt p1, v0, :cond_0

    .line 48
    invoke-virtual {p0}, Ll/ۤۜܽ;->getPosition()J

    move-result-wide v0

    long-to-int v1, v0

    const v0, 0x5245324d

    .line 49
    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 50
    invoke-virtual {p0, p1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 51
    invoke-virtual {p0, p4}, Ll/ۤۜܽ;->writeInt(I)V

    .line 52
    invoke-virtual {p0, p5}, Ll/ۤۜܽ;->writeInt(I)V

    .line 53
    invoke-virtual {p0, p2, p3}, Ll/ۤۜܽ;->ۧ(J)V

    .line 54
    invoke-virtual {p0}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object p1

    invoke-static {v1, p1}, Ll/֫۫ᩳ;->֫(I[B)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 p1, 0x0

    .line 55
    invoke-virtual {p0, p1}, Ll/ۤۜܽ;->writeInt(I)V

    return-void

    .line 46
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid recovery record"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ۤۜܽ;JI)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    if-ltz p3, :cond_0

    const/high16 v0, 0x100000

    if-gt p3, v0, :cond_0

    const v0, 0x4645324d

    .line 113
    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->writeInt(I)V

    add-int/lit8 p3, p3, 0x30

    .line 114
    invoke-virtual {p0, p3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 115
    invoke-virtual {p0, p1, p2}, Ll/ۤۜܽ;->ۧ(J)V

    return-void

    .line 111
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid recovery footer"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
