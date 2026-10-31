.class public final Ll/ܽ۟᩵;
.super Ll/۠۟᩵;
.source "V4F9"


# virtual methods
.method public final ֫(Ll/ۘ۟᩵;)I
    .locals 0

    .line 175
    iget p1, p1, Ll/ۘ۟᩵;->ܽ:I

    return p1
.end method

.method public final ֫(Ll/ܽܰ᩵;Ljava/io/IOException;)Ljava/io/IOException;
    .locals 0

    .line 192
    check-cast p1, Ll/᩷۟᩵;

    invoke-virtual {p1, p2}, Ll/᩷۟᩵;->֫(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۡܰ᩵;Ll/ۙ᩺᩵;Ll/ܺ֫֡;)Ljava/net/Socket;
    .locals 0

    .line 163
    invoke-virtual {p1, p2, p3}, Ll/ۡܰ᩵;->֫(Ll/ۙ᩺᩵;Ll/ܺ֫֡;)Ljava/net/Socket;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۡܰ᩵;)Ll/ۡ᩵֡;
    .locals 0

    .line 171
    iget-object p1, p1, Ll/ۡܰ᩵;->ܳ:Ll/ۡ᩵֡;

    return-object p1
.end method

.method public final ֫(Ll/ۡܰ᩵;Ll/ۙ᩺᩵;Ll/ܺ֫֡;Ll/ۚ۟᩵;)Ll/᩻֫֡;
    .locals 0

    .line 154
    invoke-virtual {p1, p2, p3, p4}, Ll/ۡܰ᩵;->֫(Ll/ۙ᩺᩵;Ll/ܺ֫֡;Ll/ۚ۟᩵;)Ll/᩻֫֡;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۖܰ᩵;Ljavax/net/ssl/SSLSocket;Z)V
    .locals 15

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    .line 167
    iget-object v2, v0, Ll/ۖܰ᩵;->ᩳ:[Ljava/lang/String;

    iget-object v3, v0, Ll/ۖܰ᩵;->֫:[Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 168
    sget-object v4, Ll/᩷ܰ᩵;->ܽ:Ljava/util/Comparator;

    invoke-virtual/range {p2 .. p2}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v3}, Ll/᩶۟᩵;->֫(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 169
    :cond_0
    invoke-virtual/range {p2 .. p2}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v4

    :goto_0
    if-eqz v2, :cond_1

    .line 171
    sget-object v5, Ll/᩶۟᩵;->ܿ:Ljava/util/Comparator;

    invoke-virtual/range {p2 .. p2}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v2}, Ll/᩶۟᩵;->֫(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    .line 172
    :cond_1
    invoke-virtual/range {p2 .. p2}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v5

    .line 176
    :goto_1
    invoke-virtual/range {p2 .. p2}, Ljavax/net/ssl/SSLSocket;->getSupportedCipherSuites()[Ljava/lang/String;

    move-result-object v6

    .line 177
    sget-object v7, Ll/᩷ܰ᩵;->ܽ:Ljava/util/Comparator;

    sget-object v8, Ll/᩶۟᩵;->֫:[B

    .line 313
    array-length v8, v6

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_2
    const/4 v11, -0x1

    if-ge v10, v8, :cond_3

    .line 314
    aget-object v12, v6, v10

    move-object v13, v7

    check-cast v13, Ll/ۜܰ᩵;

    const-string v14, "TLS_FALLBACK_SCSV"

    invoke-virtual {v13, v12, v14}, Ll/ۜܰ᩵;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v12

    if-nez v12, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_3
    const/4 v10, -0x1

    :goto_3
    if-eqz p3, :cond_4

    if-eq v10, v11, :cond_4

    .line 180
    aget-object v6, v6, v10

    .line 320
    array-length v7, v4

    add-int/lit8 v8, v7, 0x1

    new-array v8, v8, [Ljava/lang/String;

    .line 321
    array-length v10, v4

    invoke-static {v4, v9, v8, v9, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 322
    aput-object v6, v8, v7

    move-object v4, v8

    .line 184
    :cond_4
    new-instance v6, Ll/ܺܰ᩵;

    .line 269
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 270
    iget-boolean v7, v0, Ll/ۖܰ᩵;->ܽ:Z

    iput-boolean v7, v6, Ll/ܺܰ᩵;->ܽ:Z

    .line 271
    iput-object v3, v6, Ll/ܺܰ᩵;->֫:[Ljava/lang/String;

    .line 272
    iput-object v2, v6, Ll/ܺܰ᩵;->ᩳ:[Ljava/lang/String;

    .line 273
    iget-boolean v0, v0, Ll/ۖܰ᩵;->ۧ:Z

    iput-boolean v0, v6, Ll/ܺܰ᩵;->ۧ:Z

    .line 185
    invoke-virtual {v6, v4}, Ll/ܺܰ᩵;->֫([Ljava/lang/String;)V

    .line 186
    invoke-virtual {v6, v5}, Ll/ܺܰ᩵;->ۧ([Ljava/lang/String;)V

    .line 338
    new-instance v0, Ll/ۖܰ᩵;

    invoke-direct {v0, v6}, Ll/ۖܰ᩵;-><init>(Ll/ܺܰ᩵;)V

    .line 154
    iget-object v2, v0, Ll/ۖܰ᩵;->ᩳ:[Ljava/lang/String;

    if-eqz v2, :cond_5

    .line 155
    invoke-virtual {v1, v2}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    .line 157
    :cond_5
    iget-object v0, v0, Ll/ۖܰ᩵;->֫:[Ljava/lang/String;

    if-eqz v0, :cond_6

    .line 158
    invoke-virtual {v1, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    :cond_6
    return-void
.end method

.method public final ֫(Ll/۫ܰ᩵;Ljava/lang/String;)V
    .locals 0

    .line 136
    invoke-virtual {p1, p2}, Ll/۫ܰ᩵;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/۫ܰ᩵;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 140
    invoke-virtual {p1, p2, p3}, Ll/۫ܰ᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/ۙ᩺᩵;Ll/ۙ᩺᩵;)Z
    .locals 0

    .line 158
    invoke-virtual {p1, p2}, Ll/ۙ᩺᩵;->֫(Ll/ۙ᩺᩵;)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۡܰ᩵;Ll/᩻֫֡;)Z
    .locals 0

    .line 149
    invoke-virtual {p1, p2}, Ll/ۡܰ᩵;->֫(Ll/᩻֫֡;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(Ll/ۡܰ᩵;Ll/᩻֫֡;)V
    .locals 0

    .line 167
    invoke-virtual {p1, p2}, Ll/ۡܰ᩵;->ۧ(Ll/᩻֫֡;)V

    return-void
.end method
