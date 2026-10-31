.class public final Ll/ܺۗᩳ;
.super Ljava/lang/Object;
.source "R6TK"


# direct methods
.method public static ֫(Ll/۬ۜܽ;I)Ljava/lang/String;
    .locals 7

    .line 75
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    if-ltz v0, :cond_1

    if-gt v0, p1, :cond_1

    int-to-long v1, v0

    .line 76
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v3

    const-wide/16 v5, 0x2

    div-long/2addr v3, v5

    cmp-long p1, v1, v3

    if-gtz p1, :cond_1

    .line 77
    new-array p1, v0, [C

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 78
    invoke-virtual {p0}, Ll/۬ۜܽ;->readShort()S

    move-result v2

    int-to-char v2, v2

    aput-char v2, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 79
    :cond_0
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, p1}, Ljava/lang/String;-><init>([C)V

    return-object p0

    .line 76
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid load checkpoint string length"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫([B)Ll/ۚۙᩳ;
    .locals 23

    move-object/from16 v0, p0

    .line 38
    array-length v1, v0

    const/16 v2, 0x1000

    if-gt v1, v2, :cond_4

    .line 40
    :try_start_0
    new-instance v1, Ll/۬ۜܽ;

    invoke-direct {v1, v0}, Ll/۬ۜܽ;-><init>([B)V

    .line 41
    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_3

    .line 42
    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    if-ltz v0, :cond_2

    .line 43
    invoke-static {}, Ll/֡ۙᩳ;->values()[Ll/֡ۙᩳ;

    move-result-object v3

    array-length v3, v3

    if-ge v0, v3, :cond_2

    if-ltz v2, :cond_2

    invoke-static {}, Ll/᩵ۙᩳ;->values()[Ll/᩵ۙᩳ;

    move-result-object v3

    array-length v3, v3

    if-ge v2, v3, :cond_2

    .line 46
    invoke-static {v1}, Ll/ܺۗᩳ;->֫(Ll/۬ۜܽ;)Z

    move-result v3

    .line 47
    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v9

    .line 48
    invoke-virtual {v1}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v10

    invoke-virtual {v1}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v12

    .line 49
    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v15

    .line 50
    invoke-static {v1}, Ll/ܺۗᩳ;->֫(Ll/۬ۜܽ;)Z

    move-result v16

    const/16 v4, 0x20

    new-array v14, v4, [B

    .line 212
    invoke-virtual {v1, v4, v14}, Ll/۬ۜܽ;->֫(I[B)V

    const/16 v4, 0x50

    .line 52
    invoke-static {v1, v4}, Ll/ܺۗᩳ;->֫(Ll/۬ۜܽ;I)Ljava/lang/String;

    move-result-object v8

    if-eqz v3, :cond_0

    .line 53
    new-instance v3, Ll/ۜ۬ᩳ;

    const/16 v4, 0x400

    invoke-static {v1, v4}, Ll/ܺۗᩳ;->֫(Ll/۬ۜܽ;I)Ljava/lang/String;

    move-result-object v18

    const/16 v4, 0x200

    invoke-static {v1, v4}, Ll/ܺۗᩳ;->֫(Ll/۬ۜܽ;I)Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v1}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v20

    invoke-static {v1}, Ll/ܺۗᩳ;->֫(Ll/۬ۜܽ;)Z

    move-result v22

    move-object/from16 v17, v3

    invoke-direct/range {v17 .. v22}, Ll/ۜ۬ᩳ;-><init>(Ljava/lang/String;Ljava/lang/String;JZ)V

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    move-object v7, v3

    .line 54
    invoke-virtual {v1}, Ll/۬ۜܽ;->available()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    .line 55
    new-instance v1, Ll/ۚۙᩳ;

    invoke-static {}, Ll/֡ۙᩳ;->values()[Ll/֡ۙᩳ;

    move-result-object v3

    aget-object v5, v3, v0

    invoke-static {}, Ll/᩵ۙᩳ;->values()[Ll/᩵ۙᩳ;

    move-result-object v0

    aget-object v6, v0, v2

    move-object v4, v1

    invoke-direct/range {v4 .. v16}, Ll/ۚۙᩳ;-><init>(Ll/֡ۙᩳ;Ll/᩵ۙᩳ;Ll/ۜ۬ᩳ;Ljava/lang/String;IJJ[BIZ)V

    return-object v1

    .line 54
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Trailing load checkpoint bytes"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    goto :goto_1

    .line 44
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid load checkpoint status"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 41
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported load checkpoint version"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_1
    move-exception v0

    .line 58
    :goto_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Invalid load checkpoint"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 38
    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Load checkpoint exceeds record limit"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ll/ۚۙᩳ;)Ll/ۤۜܽ;
    .locals 5

    .line 15
    new-instance v0, Ll/ۤۜܽ;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ll/ۤۜܽ;-><init>(I)V

    const/4 v1, 0x2

    .line 16
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 17
    invoke-virtual {p0}, Ll/ۚۙᩳ;->ܺ()Ll/֡ۙᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 18
    invoke-virtual {p0}, Ll/ۚۙᩳ;->ᩳ()Ll/᩵ۙᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 19
    invoke-virtual {p0}, Ll/ۚۙᩳ;->ۡ()Ll/ۜ۬ᩳ;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 20
    invoke-virtual {p0}, Ll/ۚۙᩳ;->֫()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 21
    invoke-virtual {p0}, Ll/ۚۙᩳ;->᩷()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Ll/ۤۜܽ;->ۧ(J)V

    .line 22
    invoke-virtual {p0}, Ll/ۚۙᩳ;->ۧ()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Ll/ۤۜܽ;->ۧ(J)V

    .line 23
    invoke-virtual {p0}, Ll/ۚۙᩳ;->ܳ()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 24
    invoke-virtual {p0}, Ll/ۚۙᩳ;->᩻()Z

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 25
    invoke-virtual {p0}, Ll/ۚۙᩳ;->ۜ()[B

    move-result-object v1

    .line 44
    array-length v3, v1

    invoke-virtual {v0, v1, v2, v3}, Ll/ۤۜܽ;->write([BII)V

    .line 26
    invoke-virtual {p0}, Ll/ۚۙᩳ;->ܽ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܺۗᩳ;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    .line 27
    invoke-virtual {p0}, Ll/ۚۙᩳ;->ۡ()Ll/ۜ۬ᩳ;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 28
    invoke-virtual {p0}, Ll/ۚۙᩳ;->ۡ()Ll/ۜ۬ᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۜ۬ᩳ;->ܽ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܺۗᩳ;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    .line 29
    invoke-virtual {p0}, Ll/ۚۙᩳ;->ۡ()Ll/ۜ۬ᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۜ۬ᩳ;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܺۗᩳ;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    .line 30
    invoke-virtual {p0}, Ll/ۚۙᩳ;->ۡ()Ll/ۜ۬ᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۜ۬ᩳ;->֫()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    .line 31
    invoke-virtual {p0}, Ll/ۚۙᩳ;->ۡ()Ll/ۜ۬ᩳ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۜ۬ᩳ;->ᩳ()Z

    move-result p0

    invoke-virtual {v0, p0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 33
    :cond_1
    invoke-virtual {v0}, Ll/ۤۜܽ;->size()I

    move-result p0

    const/16 v1, 0x1000

    if-gt p0, v1, :cond_2

    return-object v0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Load checkpoint exceeds record limit"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ۤۜܽ;Ljava/lang/String;)V
    .locals 2

    .line 70
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 v0, 0x0

    .line 71
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    int-to-short v1, v1

    invoke-virtual {p0, v1}, Ll/ۤۜܽ;->֫(S)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ֫(Ll/۬ۜܽ;)Z
    .locals 1

    .line 63
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result p0

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    if-ne p0, v0, :cond_0

    goto :goto_0

    .line 64
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid load checkpoint flag"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    if-ne p0, v0, :cond_2

    return v0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method
