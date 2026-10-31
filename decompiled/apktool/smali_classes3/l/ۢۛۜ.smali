.class public final Ll/ۢۛۜ;
.super Ll/۬ᩴܺ;
.source "X8H6"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:[B

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;[BLjava/lang/String;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢۛۜ;->ܽ:Ljava/lang/String;

    iput-object p3, p0, Ll/ۢۛۜ;->֫:Ljava/lang/String;

    iput-object p2, p0, Ll/ۢۛۜ;->ۧ:[B

    return-void
.end method

.method public static ֫(Ll/᩻ۖܽ;)Ll/ۢۛۜ;
    .locals 11

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    .line 19
    :try_start_0
    invoke-virtual {p0, v0, v1}, Ll/᩻ۖܽ;->seek(J)V

    .line 20
    invoke-virtual {p0}, Ll/᩻ۖܽ;->readInt()I

    move-result v0

    const v1, 0x46464952

    if-eq v0, v1, :cond_0

    goto/16 :goto_5

    :cond_0
    const/4 v0, 0x4

    .line 23
    invoke-virtual {p0, v0}, Ll/᩻ۖܽ;->skipBytes(I)I

    .line 24
    invoke-virtual {p0}, Ll/᩻ۖܽ;->readInt()I

    move-result v0

    const v1, 0x45564157

    if-eq v0, v1, :cond_1

    goto/16 :goto_5

    .line 30
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/᩻ۖܽ;->available()I

    move-result v0

    const/16 v1, 0x8

    if-le v0, v1, :cond_d

    .line 31
    invoke-virtual {p0}, Ll/᩻ۖܽ;->readInt()I

    move-result v0

    .line 32
    invoke-virtual {p0}, Ll/᩻ۖܽ;->readInt()I

    move-result v1

    const v3, 0x20336469

    if-eq v0, v3, :cond_2

    .line 34
    invoke-virtual {p0, v1}, Ll/᩻ۖܽ;->skipBytes(I)I

    goto :goto_0

    .line 37
    :cond_2
    invoke-virtual {p0}, Ll/᩻ۖܽ;->readInt()I

    move-result v0

    const v1, 0xffffff

    and-int/2addr v0, v1

    const v1, 0x334449

    if-eq v0, v1, :cond_3

    goto/16 :goto_5

    :cond_3
    const/4 v0, 0x2

    .line 40
    invoke-virtual {p0, v0}, Ll/᩻ۖܽ;->skipBytes(I)I

    .line 41
    invoke-virtual {p0}, Ll/᩻ۖܽ;->readByte()B

    move-result v1

    invoke-virtual {p0}, Ll/᩻ۖܽ;->readByte()B

    move-result v3

    invoke-virtual {p0}, Ll/᩻ۖܽ;->readByte()B

    move-result v4

    invoke-virtual {p0}, Ll/᩻ۖܽ;->readByte()B

    move-result v5

    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x15

    and-int/lit8 v3, v3, 0x7f

    shl-int/lit8 v3, v3, 0xe

    or-int/2addr v1, v3

    and-int/lit8 v3, v4, 0x7f

    shl-int/lit8 v3, v3, 0x7

    or-int/2addr v1, v3

    and-int/lit8 v3, v5, 0x7f

    or-int/2addr v1, v3

    .line 42
    invoke-virtual {p0}, Ll/᩻ۖܽ;->֫()I

    move-result v3

    int-to-long v3, v3

    int-to-long v5, v1

    invoke-virtual {p0, v3, v4, v5, v6}, Ll/᩻ۖܽ;->ܽ(JJ)Ll/᩻ۖܽ;

    move-result-object p0

    move-object v1, v2

    move-object v3, v1

    move-object v4, v3

    .line 43
    :cond_4
    :goto_1
    invoke-virtual {p0}, Ll/᩻ۖܽ;->available()I

    move-result v5

    const/16 v6, 0xa

    if-le v5, v6, :cond_c

    .line 44
    invoke-virtual {p0}, Ll/᩻ۖܽ;->readInt()I

    move-result v5

    .line 45
    invoke-virtual {p0}, Ll/᩻ۖܽ;->readInt()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->reverseBytes(I)I

    move-result v6

    .line 46
    invoke-virtual {p0, v0}, Ll/᩻ۖܽ;->skipBytes(I)I

    if-nez v5, :cond_5

    goto :goto_4

    :cond_5
    const v7, 0x43495041

    const/4 v8, 0x0

    if-ne v5, v7, :cond_8

    .line 51
    invoke-virtual {p0}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v9

    int-to-long v5, v6

    add-long/2addr v9, v5

    const/4 v5, 0x1

    .line 52
    invoke-virtual {p0, v5}, Ll/᩻ۖܽ;->skipBytes(I)I

    .line 53
    :goto_2
    invoke-virtual {p0}, Ll/᩻ۖܽ;->readByte()B

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_2

    .line 54
    :cond_6
    invoke-virtual {p0, v5}, Ll/᩻ۖܽ;->skipBytes(I)I

    .line 55
    :goto_3
    invoke-virtual {p0}, Ll/᩻ۖܽ;->readByte()B

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_3

    .line 56
    :cond_7
    invoke-virtual {p0}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v5

    sub-long/2addr v9, v5

    long-to-int v5, v9

    if-lez v5, :cond_4

    .line 58
    new-array v1, v5, [B

    .line 187
    invoke-virtual {p0, v1, v8, v5}, Ll/᩻ۖܽ;->֫([BII)V

    goto :goto_1

    :cond_8
    const v7, 0x32544954

    if-ne v5, v7, :cond_9

    .line 62
    new-array v3, v6, [B

    .line 187
    invoke-virtual {p0, v3, v8, v6}, Ll/᩻ۖܽ;->֫([BII)V

    .line 64
    invoke-static {v3}, Ll/ۢۛۜ;->ۧ([B)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_9
    const v7, 0x31455054

    if-ne v5, v7, :cond_a

    .line 66
    new-array v4, v6, [B

    .line 187
    invoke-virtual {p0, v4, v8, v6}, Ll/᩻ۖܽ;->֫([BII)V

    .line 68
    invoke-static {v4}, Ll/ۢۛۜ;->ۧ([B)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_a
    const v7, 0x32455054

    if-ne v5, v7, :cond_b

    if-nez v4, :cond_b

    .line 70
    new-array v4, v6, [B

    .line 187
    invoke-virtual {p0, v4, v8, v6}, Ll/᩻ۖܽ;->֫([BII)V

    .line 72
    invoke-static {v4}, Ll/ۢۛۜ;->ۧ([B)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    .line 74
    :cond_b
    invoke-virtual {p0, v6}, Ll/᩻ۖܽ;->skipBytes(I)I

    goto :goto_1

    .line 77
    :cond_c
    :goto_4
    new-instance p0, Ll/ۢۛۜ;

    invoke-direct {p0, v3, v1, v4}, Ll/ۢۛۜ;-><init>(Ljava/lang/String;[BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_d
    :goto_5
    return-object v2
.end method

.method public static ۧ([B)Ljava/lang/String;
    .locals 6

    .line 86
    array-length v0, p0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    .line 89
    aget-byte v0, p0, v0

    const/4 v2, 0x2

    if-eq v0, v1, :cond_3

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    .line 105
    sget-object v0, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    goto :goto_0

    .line 104
    :cond_1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    goto :goto_0

    .line 103
    :cond_2
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    goto :goto_0

    .line 102
    :cond_3
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    :goto_0
    const/4 v2, 0x1

    .line 94
    :goto_1
    array-length v3, p0

    if-ge v2, v3, :cond_7

    .line 110
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    if-ne v0, v3, :cond_4

    add-int/lit8 v4, v2, 0x1

    .line 111
    array-length v5, p0

    if-ge v4, v5, :cond_5

    aget-byte v5, p0, v2

    if-nez v5, :cond_5

    aget-byte v4, p0, v4

    if-nez v4, :cond_5

    goto :goto_3

    .line 113
    :cond_4
    aget-byte v4, p0, v2

    if-nez v4, :cond_5

    goto :goto_3

    :cond_5
    if-ne v0, v3, :cond_6

    const/4 v3, 0x2

    goto :goto_2

    :cond_6
    const/4 v3, 0x1

    :goto_2
    add-int/2addr v2, v3

    goto :goto_1

    .line 97
    :cond_7
    :goto_3
    new-instance v3, Ljava/lang/String;

    sub-int/2addr v2, v1

    invoke-direct {v3, p0, v1, v2, v0}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v3
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 11
    instance-of v0, p1, Ll/ۢۛۜ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۢۛۜ;

    iget-object v0, p0, Ll/ۢۛۜ;->ܽ:Ljava/lang/String;

    iget-object v1, p1, Ll/ۢۛۜ;->ܽ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۢۛۜ;->֫:Ljava/lang/String;

    iget-object v1, p1, Ll/ۢۛۜ;->֫:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۢۛۜ;->ۧ:[B

    iget-object p1, p1, Ll/ۢۛۜ;->ۧ:[B

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 11
    iget-object v0, p0, Ll/ۢۛۜ;->ܽ:Ljava/lang/String;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    .line 0
    iget-object v2, p0, Ll/ۢۛۜ;->֫:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 11
    iget-object v1, p0, Ll/ۢۛۜ;->ۧ:[B

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 11
    iget-object v2, p0, Ll/ۢۛۜ;->ܽ:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v2, 0x1

    iget-object v3, p0, Ll/ۢۛۜ;->֫:Ljava/lang/String;

    aput-object v3, v0, v2

    const/4 v3, 0x2

    iget-object v4, p0, Ll/ۢۛۜ;->ۧ:[B

    aput-object v4, v0, v3

    const-string v3, "title;author;image"

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    new-array v3, v1, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v4, ";"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "WavID3Info["

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_1
    array-length v5, v3

    if-ge v1, v5, :cond_2

    aget-object v5, v3, v1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v0, v1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v5, v3

    sub-int/2addr v5, v2

    if-eq v1, v5, :cond_1

    const-string v5, ", "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 11
    iget-object v0, p0, Ll/ۢۛۜ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()[B
    .locals 1

    .line 11
    iget-object v0, p0, Ll/ۢۛۜ;->ۧ:[B

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 11
    iget-object v0, p0, Ll/ۢۛۜ;->ܽ:Ljava/lang/String;

    return-object v0
.end method
