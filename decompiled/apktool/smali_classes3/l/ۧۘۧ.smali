.class public final Ll/ۧۘۧ;
.super Ljava/lang/Object;
.source "Q8M2"


# direct methods
.method public static ֫([B)Ll/֫ۘۧ;
    .locals 12

    .line 160
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0, p0}, Ll/ᩳ֨֫;-><init>([B)V

    .line 161
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܿ()I

    move-result p0

    const/16 v1, 0x20

    const/4 v2, 0x0

    if-ge p0, v1, :cond_0

    return-object v2

    :cond_0
    const/4 p0, 0x0

    .line 165
    invoke-virtual {v0, p0}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 166
    invoke-virtual {v0}, Ll/ᩳ֨֫;->֫()I

    move-result v1

    .line 167
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    if-eq v3, v1, :cond_1

    .line 169
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "Advertised atom size ("

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ") does not match buffer size: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    return-object v2

    .line 174
    :cond_1
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result v1

    const v3, 0x70737368    # 3.013775E29f

    if-eq v1, v3, :cond_2

    const-string p0, "Atom type is not pssh: "

    .line 0
    invoke-static {v1, p0}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    return-object v2

    .line 179
    :cond_2
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result v1

    invoke-static {v1}, Ll/᩹ۖۧ;->֫(I)I

    move-result v1

    const/4 v3, 0x1

    if-le v1, v3, :cond_3

    const-string p0, "Unsupported pssh version: "

    .line 0
    invoke-static {v1, p0}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    return-object v2

    .line 184
    :cond_3
    new-instance v4, Ljava/util/UUID;

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ᩴ()J

    move-result-wide v5

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ᩴ()J

    move-result-wide v7

    invoke-direct {v4, v5, v6, v7, v8}, Ljava/util/UUID;-><init>(JJ)V

    if-ne v1, v3, :cond_4

    .line 187
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩹()I

    move-result v3

    .line 188
    new-array v5, v3, [Ljava/util/UUID;

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v3, :cond_5

    .line 190
    new-instance v7, Ljava/util/UUID;

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ᩴ()J

    move-result-wide v8

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ᩴ()J

    move-result-wide v10

    invoke-direct {v7, v8, v9, v10, v11}, Ljava/util/UUID;-><init>(JJ)V

    aput-object v7, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    move-object v5, v2

    .line 193
    :cond_5
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩹()I

    move-result v3

    .line 194
    invoke-virtual {v0}, Ll/ᩳ֨֫;->֫()I

    move-result v6

    if-eq v3, v6, :cond_6

    .line 196
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "Atom data size ("

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ") does not match the bytes left: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    return-object v2

    .line 200
    :cond_6
    new-array v2, v3, [B

    .line 201
    invoke-virtual {v0, p0, v3, v2}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 202
    new-instance p0, Ll/֫ۘۧ;

    invoke-direct {p0, v4, v1, v2, v5}, Ll/֫ۘۧ;-><init>(Ljava/util/UUID;I[B[Ljava/util/UUID;)V

    return-object p0
.end method

.method public static ֫(Ljava/util/UUID;[B)[B
    .locals 3

    .line 140
    invoke-static {p1}, Ll/ۧۘۧ;->֫([B)Ll/֫ۘۧ;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 141
    :cond_0
    iget-object v1, p1, Ll/֫ۘۧ;->ܽ:Ljava/util/UUID;

    .line 144
    invoke-virtual {p0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 145
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v2, "UUID mismatch. Expected: "

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", got: "

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "."

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    return-object v0

    .line 148
    :cond_1
    iget-object p0, p1, Ll/֫ۘۧ;->ۧ:[B

    return-object p0
.end method

.method public static ֫(Ljava/util/UUID;[Ljava/util/UUID;[B)[B
    .locals 6

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 55
    array-length v1, p2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/lit8 v1, v1, 0x20

    if-eqz p1, :cond_1

    .line 58
    array-length v2, p1

    const/16 v3, 0x10

    const/4 v4, 0x4

    invoke-static {v2, v3, v4, v1}, Ll/᩺᩵ܿ;->֫(IIII)I

    move-result v1

    .line 60
    :cond_1
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 61
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    const v1, 0x70737368    # 3.013775E29f

    .line 62
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    if-eqz p1, :cond_2

    const/high16 v1, 0x1000000

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    .line 63
    :goto_1
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 64
    invoke-virtual {p0}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 65
    invoke-virtual {p0}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    if-eqz p1, :cond_3

    .line 67
    array-length p0, p1

    invoke-virtual {v2, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 68
    array-length p0, p1

    const/4 v1, 0x0

    :goto_2
    if-ge v1, p0, :cond_3

    aget-object v3, p1, v1

    .line 69
    invoke-virtual {v3}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 70
    invoke-virtual {v3}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    if-eqz p2, :cond_4

    .line 73
    array-length p0, p2

    if-eqz p0, :cond_4

    .line 74
    array-length p0, p2

    invoke-virtual {v2, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 75
    invoke-virtual {v2, p2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    goto :goto_3

    .line 77
    :cond_4
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 79
    :goto_3
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    return-object p0
.end method
