.class public final Ll/ۖۡۘ;
.super Ll/ۢۡۘ;
.source "D7TX"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ll/ۢۡۘ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۟ۢۘ;)Z
    .locals 13

    const-string v0, "ssh-connection"

    .line 34
    invoke-super {p0, p1}, Ll/ۢۡۘ;->֫(Ll/۟ۢۘ;)Z

    .line 36
    iget-object v1, p1, Ll/۟ۢۘ;->ۘ֫:[B

    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Ll/ۢۡۘ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "@"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p1, Ll/۟ۢۘ;->ۨ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 38
    iget v3, p1, Ll/۟ۢۘ;->ᩴ֫:I

    const/16 v4, 0x16

    if-eq v3, v4, :cond_0

    const-string v3, ":"

    .line 0
    invoke-static {v2, v3}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 39
    iget v3, p1, Ll/۟ۢۘ;->ᩴ֫:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    :cond_0
    :goto_0
    :try_start_0
    iget v2, p1, Ll/۟ۢۘ;->ܺ:I

    iget v3, p1, Ll/۟ۢۘ;->ۡ֫:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x0

    if-lt v2, v3, :cond_1

    if-eqz v1, :cond_2

    .line 181
    invoke-static {v1}, Ll/᩵ۡۘ;->ۧ([B)V

    return v4

    :cond_1
    const-string v2, "password"

    if-nez v1, :cond_6

    .line 51
    :try_start_1
    iget-object v3, p0, Ll/ۢۡۘ;->ܽ:Ll/ᩴۡۘ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v3, :cond_3

    if-eqz v1, :cond_2

    .line 181
    invoke-static {v1}, Ll/᩵ۡۘ;->ۧ([B)V

    :cond_2
    return v4

    .line 55
    :cond_3
    :try_start_2
    invoke-interface {v3}, Ll/ᩴۡۘ;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 60
    iget-object v3, p0, Ll/ۢۡۘ;->ܽ:Ll/ᩴۡۘ;

    invoke-interface {v3}, Ll/ᩴۡۘ;->getPassword()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 397
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 393
    invoke-virtual {v3, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    goto :goto_1

    .line 62
    :cond_4
    new-instance p1, Ll/ۗ᩷ۘ;

    .line 39
    invoke-direct {p1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 62
    throw p1

    .line 56
    :cond_5
    new-instance p1, Ll/ۗ᩷ۘ;

    .line 39
    invoke-direct {p1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 56
    throw p1

    .line 69
    :cond_6
    :goto_1
    iget-object v3, p0, Ll/ۢۡۘ;->ᩳ:Ljava/lang/String;

    .line 397
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v3, v5}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v3

    .line 78
    iget-object v6, p0, Ll/ۢۡۘ;->ۧ:Ll/۠ۢۘ;

    invoke-virtual {v6}, Ll/۠ۢۘ;->֫()V

    .line 79
    iget-object v6, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    const/16 v7, 0x32

    invoke-virtual {v6, v7}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 80
    iget-object v6, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v6, v3}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 81
    iget-object v6, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    .line 393
    invoke-virtual {v0, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v8

    .line 81
    invoke-virtual {v6, v8}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 82
    iget-object v6, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    .line 393
    invoke-virtual {v2, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v5

    .line 82
    invoke-virtual {v6, v5}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 83
    iget-object v5, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v5, v4}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 84
    iget-object v5, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v5, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 85
    iget-object v5, p0, Ll/ۢۡۘ;->ۧ:Ll/۠ۢۘ;

    invoke-virtual {p1, v5}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    .line 88
    :goto_2
    iget-object v5, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {p1, v5}, Ll/۟ۢۘ;->֫(Ll/ܺ᩻ۘ;)V

    iput-object v5, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    .line 242
    iget-object v6, v5, Ll/ܺ᩻ۘ;->֫:[B

    const/4 v8, 0x5

    aget-byte v6, v6, v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    and-int/lit16 v6, v6, 0xff

    const/16 v8, 0x34

    const/4 v9, 0x1

    if-ne v6, v8, :cond_7

    .line 181
    invoke-static {v1}, Ll/᩵ۡۘ;->ۧ([B)V

    return v9

    :cond_7
    const/16 v8, 0x35

    if-ne v6, v8, :cond_8

    .line 95
    :try_start_3
    invoke-virtual {v5}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 96
    iget-object v5, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v5}, Ll/ܺ᩻ۘ;->֫()I

    .line 97
    iget-object v5, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v5}, Ll/ܺ᩻ۘ;->֫()I

    .line 98
    iget-object v5, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v5}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v5

    .line 99
    iget-object v6, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v6}, Ll/ܺ᩻ۘ;->᩷()[B

    .line 409
    array-length v6, v5

    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v9, Ljava/lang/String;

    invoke-direct {v9, v5, v4, v6, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_2

    :cond_8
    const/16 v8, 0x3c

    if-ne v6, v8, :cond_d

    .line 107
    invoke-virtual {v5}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 108
    iget-object v5, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v5}, Ll/ܺ᩻ۘ;->֫()I

    .line 109
    iget-object v5, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v5}, Ll/ܺ᩻ۘ;->֫()I

    .line 110
    iget-object v5, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v5}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v5

    .line 111
    iget-object v6, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v6}, Ll/ܺ᩻ۘ;->᩷()[B

    .line 112
    iget-object v6, p0, Ll/ۢۡۘ;->ܽ:Ll/ᩴۡۘ;

    if-eqz v6, :cond_c

    instance-of v8, v6, Ll/᩷ۡۘ;

    if-nez v8, :cond_9

    goto :goto_4

    .line 119
    :cond_9
    check-cast v6, Ll/᩷ۡۘ;

    const-string v8, "New Password: "

    .line 122
    filled-new-array {v8}, [Ljava/lang/String;

    move-result-object v8

    .line 409
    array-length v10, v5

    sget-object v11, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v12, Ljava/lang/String;

    invoke-direct {v12, v5, v4, v10, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 125
    invoke-interface {v6, v8}, Ll/᩷ۡۘ;->֫([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_b

    .line 130
    aget-object v5, v5, v4

    if-eqz v5, :cond_a

    .line 393
    invoke-virtual {v5, v11}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v5

    goto :goto_3

    .line 130
    :cond_a
    sget-object v5, Ll/᩵ۡۘ;->ܽ:[B

    .line 140
    :goto_3
    iget-object v6, p0, Ll/ۢۡۘ;->ۧ:Ll/۠ۢۘ;

    invoke-virtual {v6}, Ll/۠ۢۘ;->֫()V

    .line 141
    iget-object v6, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v6, v7}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 142
    iget-object v6, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    array-length v8, v3

    invoke-virtual {v6, v4, v8, v3}, Ll/ܺ᩻ۘ;->ܽ(II[B)V

    .line 143
    iget-object v6, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    .line 393
    invoke-virtual {v0, v11}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v8

    .line 143
    invoke-virtual {v6, v8}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 144
    iget-object v6, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    .line 393
    invoke-virtual {v2, v11}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v8

    .line 144
    invoke-virtual {v6, v8}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 145
    iget-object v6, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v6, v9}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 146
    iget-object v6, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    array-length v8, v1

    invoke-virtual {v6, v4, v8, v1}, Ll/ܺ᩻ۘ;->ܽ(II[B)V

    .line 147
    iget-object v6, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v6, v5}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 148
    invoke-static {v5}, Ll/᩵ۡۘ;->ۧ([B)V

    .line 150
    iget-object v5, p0, Ll/ۢۡۘ;->ۧ:Ll/۠ۢۘ;

    invoke-virtual {p1, v5}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    goto/16 :goto_2

    .line 127
    :cond_b
    new-instance p1, Ll/ۗ᩷ۘ;

    .line 39
    invoke-direct {p1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 127
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 181
    :cond_c
    :goto_4
    invoke-static {v1}, Ll/᩵ۡۘ;->ۧ([B)V

    return v4

    :cond_d
    const/16 v2, 0x33

    if-ne v6, v2, :cond_f

    .line 154
    :try_start_4
    invoke-virtual {v5}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 155
    iget-object v2, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->֫()I

    .line 156
    iget-object v2, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->֫()I

    .line 157
    iget-object v2, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v2

    .line 158
    iget-object v3, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v3}, Ll/ܺ᩻ۘ;->֫()I

    move-result v3

    if-nez v3, :cond_e

    .line 164
    iget v2, p1, Ll/۟ۢۘ;->ܺ:I

    add-int/2addr v2, v9

    iput v2, p1, Ll/۟ۢۘ;->ܺ:I

    .line 174
    invoke-static {v1}, Ll/᩵ۡۘ;->ۧ([B)V

    const/4 v1, 0x0

    goto/16 :goto_0

    .line 162
    :cond_e
    new-instance p1, Ll/ۛ᩷ۘ;

    .line 409
    array-length v0, v2

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, v2, v4, v0, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 162
    invoke-direct {p1, v5}, Ll/ۛ᩷ۘ;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 181
    :cond_f
    invoke-static {v1}, Ll/᩵ۡۘ;->ۧ([B)V

    return v4

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_10

    invoke-static {v1}, Ll/᩵ۡۘ;->ۧ([B)V

    .line 184
    :cond_10
    throw p1
.end method
