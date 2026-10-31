.class public final Ll/᩶ۘۢ;
.super Ljava/lang/Thread;
.source "Q541"


# instance fields
.field public ֫֫:Ll/ܶ᩵ܿ;

.field public ۗ:Ljava/io/OutputStream;

.field public ۙ:Ljava/io/InputStream;

.field public ۛ:[Ljava/lang/String;

.field public ۟:Ll/ܶ᩵ܿ;

.field public ۤ:J

.field public ۧ֫:Z

.field public ۨ:Ljava/lang/String;

.field public ۫:Ljava/lang/String;

.field public ۬:Ljava/net/Socket;

.field public ܰ:J

.field public ܽ֫:Z

.field public ܿ֫:Ll/ܶ᩵ܿ;

.field public ᩳ֫:Ljava/lang/String;

.field public ᩶:Ljava/net/Socket;

.field public ᩸:I

.field public ᩹:Z

.field public ᩺:Ll/᩹ۘۢ;


# direct methods
.method public constructor <init>(Ljava/net/Socket;Ll/᩹ۘۢ;)V
    .locals 5

    .line 43
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Ll/᩶ۘۢ;->᩹:Z

    const/4 v1, 0x0

    .line 24
    iput-object v1, p0, Ll/᩶ۘۢ;->ᩳ֫:Ljava/lang/String;

    .line 25
    iput-boolean v0, p0, Ll/᩶ۘۢ;->ܽ֫:Z

    .line 26
    invoke-static {}, Ll/ܶۘۢ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v2

    iput-object v2, p0, Ll/᩶ۘۢ;->ܿ֫:Ll/ܶ᩵ܿ;

    .line 27
    iput-object v2, p0, Ll/᩶ۘۢ;->֫֫:Ll/ܶ᩵ܿ;

    .line 28
    iput-object v1, p0, Ll/᩶ۘۢ;->۬:Ljava/net/Socket;

    .line 29
    iput-object v1, p0, Ll/᩶ۘۢ;->۟:Ll/ܶ᩵ܿ;

    .line 31
    iput-object v1, p0, Ll/᩶ۘۢ;->ۙ:Ljava/io/InputStream;

    .line 32
    iput-object v1, p0, Ll/᩶ۘۢ;->ۗ:Ljava/io/OutputStream;

    .line 36
    invoke-static {}, Ll/ܶۘۢ;->ۧ()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/᩶ۘۢ;->۫:Ljava/lang/String;

    const-wide/16 v1, -0x1

    .line 37
    iput-wide v1, p0, Ll/᩶ۘۢ;->ܰ:J

    .line 38
    iput-wide v1, p0, Ll/᩶ۘۢ;->ۤ:J

    const-string v1, "Type"

    const-string v2, "Perm"

    const-string v3, "Size"

    const-string v4, "Modify"

    .line 39
    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/᩶ۘۢ;->ۛ:[Ljava/lang/String;

    .line 40
    iput v0, p0, Ll/᩶ۘۢ;->᩸:I

    const-string v0, "SHA-1"

    .line 41
    iput-object v0, p0, Ll/᩶ۘۢ;->ۨ:Ljava/lang/String;

    .line 44
    iput-object p1, p0, Ll/᩶ۘۢ;->᩶:Ljava/net/Socket;

    .line 45
    iput-object p2, p0, Ll/᩶ۘۢ;->᩺:Ll/᩹ۘۢ;

    const/4 p2, 0x1

    .line 46
    iput-boolean p2, p0, Ll/᩶ۘۢ;->ۧ֫:Z

    const/16 p2, 0x7530

    .line 49
    :try_start_0
    invoke-virtual {p1, p2}, Ljava/net/Socket;->setSoTimeout(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 210
    iget-boolean v0, p0, Ll/᩶ۘۢ;->ۧ֫:Z

    if-eqz v0, :cond_0

    const-string v0, "220 FTP-Server ready\r\n"

    .line 211
    invoke-virtual {p0, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    .line 215
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/᩶ۘۢ;->᩶:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    .line 233
    :goto_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    const/16 v2, 0x80

    invoke-direct {v1, v2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 237
    :goto_1
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_4

    const/16 v3, 0xa

    if-ne v4, v3, :cond_1

    const/4 v3, 0x1

    goto :goto_2

    :cond_1
    const/16 v3, 0x2000

    if-ge v2, v3, :cond_3

    add-int/lit8 v2, v2, 0x1

    const/16 v3, 0xd

    if-eq v4, v3, :cond_2

    .line 247
    invoke-virtual {v1, v4}, Ljava/io/ByteArrayOutputStream;->write(I)V

    :cond_2
    const/4 v3, 0x1

    goto :goto_1

    .line 243
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "FTP command line too long"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_2
    if-nez v3, :cond_5

    .line 250
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v2, :cond_5

    const/4 v1, 0x0

    goto :goto_3

    .line 254
    :cond_5
    :try_start_1
    iget-object v2, p0, Ll/᩶ۘۢ;->۫:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    .line 256
    :catch_0
    :try_start_2
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_3
    if-eqz v1, :cond_6

    .line 219
    invoke-static {p0, v1}, Ll/᩸ۘۢ;->֫(Ll/᩶ۘۢ;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    .line 226
    :catch_1
    :cond_6
    invoke-virtual {p0}, Ll/᩶ۘۢ;->ۧ()V

    return-void
.end method

.method public final ֫([B)I
    .locals 3

    .line 108
    iget-object v0, p0, Ll/᩶ۘۢ;->۬:Ljava/net/Socket;

    if-nez v0, :cond_0

    goto :goto_0

    .line 111
    :cond_0
    invoke-virtual {v0}, Ljava/net/Socket;->isConnected()Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    const/4 p1, -0x2

    return p1

    :cond_1
    const/4 v0, 0x0

    .line 117
    :try_start_0
    iget-object v1, p0, Ll/᩶ۘۢ;->ۙ:Ljava/io/InputStream;

    array-length v2, p1

    invoke-virtual {v1, p1, v0, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_1

    :catch_0
    return v0
.end method

.method public final ֫()V
    .locals 2

    .line 177
    iget-object v0, p0, Ll/᩶ۘۢ;->ۙ:Ljava/io/InputStream;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 179
    :try_start_0
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 182
    :catch_0
    iput-object v1, p0, Ll/᩶ۘۢ;->ۙ:Ljava/io/InputStream;

    .line 184
    :cond_0
    iget-object v0, p0, Ll/᩶ۘۢ;->ۗ:Ljava/io/OutputStream;

    if-eqz v0, :cond_1

    .line 186
    :try_start_1
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 189
    :catch_1
    iput-object v1, p0, Ll/᩶ۘۢ;->ۗ:Ljava/io/OutputStream;

    .line 191
    :cond_1
    iget-object v0, p0, Ll/᩶ۘۢ;->۬:Ljava/net/Socket;

    if-eqz v0, :cond_2

    .line 193
    :try_start_2
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_0

    :catch_2
    nop

    .line 197
    :cond_2
    :goto_0
    iput-object v1, p0, Ll/᩶ۘۢ;->۬:Ljava/net/Socket;

    .line 198
    iget-object v0, p0, Ll/᩶ۘۢ;->᩺:Ll/᩹ۘۢ;

    if-eqz v0, :cond_3

    .line 199
    invoke-virtual {v0}, Ll/᩹ۘۢ;->֫()V

    :cond_3
    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 398
    iput-object p1, p0, Ll/᩶ۘۢ;->ۨ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/net/InetAddress;I)V
    .locals 1

    .line 140
    iget-object v0, p0, Ll/᩶ۘۢ;->᩺:Ll/᩹ۘۢ;

    invoke-virtual {v0, p1, p2}, Ll/᩹ۘۢ;->֫(Ljava/net/InetAddress;I)V

    return-void
.end method

.method public final ֫(Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 374
    iput-object p1, p0, Ll/᩶ۘۢ;->۟:Ll/ܶ᩵ܿ;

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    .line 344
    iput-boolean v0, p0, Ll/᩶ۘۢ;->ܽ֫:Z

    return-void

    .line 346
    :cond_0
    iget p1, p0, Ll/᩶ۘۢ;->᩸:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/᩶ۘۢ;->᩸:I

    const/4 v0, 0x3

    if-le p1, v0, :cond_1

    .line 204
    invoke-virtual {p0}, Ll/᩶ۘۢ;->ۧ()V

    :cond_1
    return-void
.end method

.method public final ֫([Ljava/lang/String;)V
    .locals 0

    .line 390
    iput-object p1, p0, Ll/᩶ۘۢ;->ۛ:[Ljava/lang/String;

    return-void
.end method

.method public final ֫(II[B)Z
    .locals 3

    .line 79
    iget-object v0, p0, Ll/᩶ۘۢ;->ۗ:Ljava/io/OutputStream;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x1

    if-nez p2, :cond_1

    return v2

    .line 86
    :cond_1
    :try_start_0
    invoke-virtual {v0, p3, p1, p2}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    iget-object p1, p0, Ll/᩶ۘۢ;->᩺:Ll/᩹ۘۢ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v2

    :catch_0
    return v1
.end method

.method public final ۖ()Z
    .locals 1

    .line 339
    iget-boolean v0, p0, Ll/᩶ۘۢ;->ܽ֫:Z

    return v0
.end method

.method public final ۘ()I
    .locals 1

    .line 131
    iget-object v0, p0, Ll/᩶ۘۢ;->᩺:Ll/᩹ۘۢ;

    invoke-virtual {v0}, Ll/᩹ۘۢ;->ۧ()I

    move-result v0

    return v0
.end method

.method public final ۜ()Ljava/net/Socket;
    .locals 1

    .line 294
    iget-object v0, p0, Ll/᩶ۘۢ;->᩶:Ljava/net/Socket;

    return-object v0
.end method

.method public final ۡ()Z
    .locals 1

    .line 332
    iget-boolean v0, p0, Ll/᩶ۘۢ;->ܽ֫:Z

    if-nez v0, :cond_0

    invoke-static {}, Ll/ܶۘۢ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()Ll/ܶ᩵ܿ;
    .locals 1

    .line 354
    iget-object v0, p0, Ll/᩶ۘۢ;->ܿ֫:Ll/ܶ᩵ܿ;

    return-object v0
.end method

.method public final ۧ()V
    .locals 1

    .line 262
    invoke-virtual {p0}, Ll/᩶ۘۢ;->֫()V

    .line 263
    iget-object v0, p0, Ll/᩶ۘۢ;->᩶:Ljava/net/Socket;

    if-nez v0, :cond_0

    goto :goto_0

    .line 267
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 314
    iput-object p1, p0, Ll/᩶ۘۢ;->ᩳ֫:Ljava/lang/String;

    return-void
.end method

.method public final ۧ(Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 358
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩺()Ll/ܶ᩵ܿ;

    move-result-object p1

    iput-object p1, p0, Ll/᩶ۘۢ;->ܿ֫:Ll/ܶ᩵ܿ;

    return-void
.end method

.method public final ۧ(Z)V
    .locals 0

    .line 310
    iput-boolean p1, p0, Ll/᩶ۘۢ;->᩹:Z

    return-void
.end method

.method public final ܳ()Ll/ܶ᩵ܿ;
    .locals 1

    .line 370
    iget-object v0, p0, Ll/᩶ۘۢ;->۟:Ll/ܶ᩵ܿ;

    return-object v0
.end method

.method public final ܺ()Z
    .locals 1

    .line 306
    iget-boolean v0, p0, Ll/᩶ۘۢ;->᩹:Z

    return v0
.end method

.method public final ܽ()Ljava/net/InetAddress;
    .locals 1

    .line 147
    iget-object v0, p0, Ll/᩶ۘۢ;->᩶:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getLocalAddress()Ljava/net/InetAddress;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 1

    .line 286
    :try_start_0
    iget-object v0, p0, Ll/᩶ۘۢ;->۫:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 288
    :catch_0
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    .line 274
    :goto_0
    :try_start_1
    iget-object v0, p0, Ll/᩶ۘۢ;->᩶:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    .line 275
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 276
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 277
    iget-object v0, p0, Ll/᩶ۘۢ;->᩺:Ll/᩹ۘۢ;

    array-length p1, p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 279
    :catch_1
    invoke-virtual {p0}, Ll/᩶ۘۢ;->ۧ()V

    :goto_1
    return-void
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 394
    iget-object v0, p0, Ll/᩶ۘۢ;->ۨ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()[Ljava/lang/String;
    .locals 1

    .line 386
    iget-object v0, p0, Ll/᩶ۘۢ;->ۛ:[Ljava/lang/String;

    return-object v0
.end method

.method public final ᩴ()Z
    .locals 2

    const/4 v0, 0x0

    .line 160
    :try_start_0
    iget-object v1, p0, Ll/᩶ۘۢ;->᩺:Ll/᩹ۘۢ;

    invoke-virtual {v1}, Ll/᩹ۘۢ;->ܽ()Ljava/net/Socket;

    move-result-object v1

    iput-object v1, p0, Ll/᩶ۘۢ;->۬:Ljava/net/Socket;

    if-nez v1, :cond_0

    return v0

    .line 164
    :cond_0
    invoke-virtual {v1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    iput-object v1, p0, Ll/᩶ۘۢ;->ۙ:Ljava/io/InputStream;

    .line 165
    iget-object v1, p0, Ll/᩶ۘۢ;->۬:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    iput-object v1, p0, Ll/᩶ۘۢ;->ۗ:Ljava/io/OutputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v1, 0x0

    .line 168
    iput-object v1, p0, Ll/᩶ۘۢ;->۬:Ljava/net/Socket;

    return v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 318
    iget-object v0, p0, Ll/᩶ۘۢ;->ᩳ֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩻()Ll/ܶ᩵ܿ;
    .locals 2

    .line 402
    iget-object v0, p0, Ll/᩶ۘۢ;->֫֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Ll/ܶۘۢ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v0

    return-object v0
.end method
