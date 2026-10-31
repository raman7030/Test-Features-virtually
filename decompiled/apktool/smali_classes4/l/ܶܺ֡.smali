.class public Ll/ܶܺ֡;
.super Ll/ۚܺ֡;
.source "357K"


# static fields
.field public static final ۠:Ljava/lang/String;


# instance fields
.field public ֡:Ljava/util/ArrayList;

.field public ֨:Z

.field public ۖ:Ljava/io/BufferedReader;

.field public ۘ:Ljava/io/BufferedWriter;

.field public ۚ:Ljava/lang/String;

.field public ۡ:Ll/֡ܺ֡;

.field public ܺ:Ljava/lang/String;

.field public ᩴ:Z

.field public ᩵:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 187
    sget-object v0, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ܶܺ֡;->۠:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 252
    invoke-direct {p0}, Ll/ۚܺ֡;-><init>()V

    const/4 v0, 0x1

    .line 234
    iput-boolean v0, p0, Ll/ܶܺ֡;->֨:Z

    .line 254
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܶܺ֡;->֡:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 255
    iput-boolean v0, p0, Ll/ܶܺ֡;->ᩴ:Z

    const/4 v0, 0x0

    .line 256
    iput-object v0, p0, Ll/ܶܺ֡;->ۚ:Ljava/lang/String;

    .line 257
    sget-object v0, Ll/ܶܺ֡;->۠:Ljava/lang/String;

    iput-object v0, p0, Ll/ܶܺ֡;->ܺ:Ljava/lang/String;

    .line 258
    new-instance v0, Ll/֡ܺ֡;

    invoke-direct {v0, p0}, Ll/֡ܺ֡;-><init>(Ll/ܶܺ֡;)V

    iput-object v0, p0, Ll/ܶܺ֡;->ۡ:Ll/֡ܺ֡;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/net/InetAddress;I)I
    .locals 4

    .line 526
    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x25

    .line 527
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-lez v1, :cond_0

    const/4 v2, 0x0

    .line 529
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 531
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "|"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 533
    instance-of v3, p1, Ljava/net/Inet4Address;

    if-eqz v3, :cond_1

    const-string p1, "1"

    .line 534
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 535
    :cond_1
    instance-of p1, p1, Ljava/net/Inet6Address;

    if-eqz p1, :cond_2

    const-string p1, "2"

    .line 536
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 538
    :cond_2
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 539
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 540
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 542
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 543
    sget-object p1, Ll/۬ܺ֡;->ᩳ֫:Ll/۬ܺ֡;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ll/ܶܺ֡;->֫(Ll/۬ܺ֡;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/۬ܺ֡;Ljava/lang/String;)I
    .locals 0

    .line 1234
    invoke-virtual {p1}, Ll/۬ܺ֡;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Ll/ܶܺ֡;->ܽ(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final ۖ()Ljava/lang/String;
    .locals 3

    .line 687
    iget-boolean v0, p0, Ll/ܶܺ֡;->ᩴ:Z

    if-nez v0, :cond_0

    .line 688
    iget-object v0, p0, Ll/ܶܺ֡;->ۚ:Ljava/lang/String;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    .line 690
    iput-boolean v0, p0, Ll/ܶܺ֡;->ᩴ:Z

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܶܺ֡;->֡:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "\r\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 691
    iput-object v0, p0, Ll/ܶܺ֡;->ۚ:Ljava/lang/String;

    return-object v0
.end method

.method public ۙ()V
    .locals 4

    .line 299
    invoke-super {p0}, Ll/ۚܺ֡;->᩵()V

    .line 301
    new-instance v0, Ll/֡ۖ֡;

    new-instance v1, Ljava/io/InputStreamReader;

    iget-object v2, p0, Ll/ۚܺ֡;->ۧ:Ljava/io/InputStream;

    .line 586
    iget-object v3, p0, Ll/ܶܺ֡;->ܺ:Ljava/lang/String;

    .line 301
    invoke-direct {v1, v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 41
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 301
    iput-object v0, p0, Ll/ܶܺ֡;->ۖ:Ljava/io/BufferedReader;

    .line 305
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/OutputStreamWriter;

    iget-object v2, p0, Ll/ۚܺ֡;->ܽ:Ljava/io/OutputStream;

    .line 586
    iget-object v3, p0, Ll/ܶܺ֡;->ܺ:Ljava/lang/String;

    .line 305
    invoke-direct {v1, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    iput-object v0, p0, Ll/ܶܺ֡;->ۘ:Ljava/io/BufferedWriter;

    .line 306
    iget v0, p0, Ll/ۚܺ֡;->ۜ:I

    if-lez v0, :cond_1

    .line 307
    iget-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getSoTimeout()I

    move-result v0

    .line 308
    iget-object v1, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    iget v2, p0, Ll/ۚܺ֡;->ۜ:I

    invoke-virtual {v1, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 310
    :try_start_0
    invoke-virtual {p0}, Ll/ܶܺ֡;->ۜ()I

    .line 312
    iget v1, p0, Ll/ܶܺ֡;->᩵:I

    invoke-static {v1}, Ll/ۧ᩷ܽ;->ۧ(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 313
    invoke-virtual {p0}, Ll/ܶܺ֡;->ۜ()I
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 318
    :cond_0
    iget-object v1, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    invoke-virtual {v1, v0}, Ljava/net/Socket;->setSoTimeout(I)V

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 316
    :try_start_1
    new-instance v2, Ljava/io/IOException;

    const-string v3, "Timed out waiting for initial connect reply"

    invoke-direct {v2, v3, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 318
    :goto_0
    iget-object v2, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    invoke-virtual {v2, v0}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 319
    throw v1

    .line 321
    :cond_1
    invoke-virtual {p0}, Ll/ܶܺ֡;->ۜ()I

    .line 323
    iget v0, p0, Ll/ܶܺ֡;->᩵:I

    invoke-static {v0}, Ll/ۧ᩷ܽ;->ۧ(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 324
    invoke-virtual {p0}, Ll/ܶܺ֡;->ۜ()I

    :cond_2
    return-void
.end method

.method public final ۜ()I
    .locals 9

    const/4 v0, 0x1

    .line 621
    iput-boolean v0, p0, Ll/ܶܺ֡;->ᩴ:Z

    .line 622
    iget-object v0, p0, Ll/ܶܺ֡;->֡:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 623
    iget-object v1, p0, Ll/ܶܺ֡;->ۖ:Ljava/io/BufferedReader;

    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Connection closed without indication."

    if-eqz v1, :cond_9

    .line 629
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x3

    if-lt v3, v4, :cond_8

    const/4 v5, 0x0

    .line 635
    :try_start_0
    invoke-virtual {v1, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 636
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    iput v6, p0, Ll/ܶܺ֡;->᩵:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 640
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v6, "\'"

    .line 642
    iget-boolean v7, p0, Ll/ܶܺ֡;->֨:Z

    if-le v3, v4, :cond_4

    .line 643
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v8, 0x2d

    if-ne v3, v8, :cond_2

    .line 647
    :cond_0
    :goto_0
    iget-object v1, p0, Ll/ܶܺ֡;->ۖ:Ljava/io/BufferedReader;

    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 651
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 771
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-le v3, v4, :cond_0

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v3, v8, :cond_0

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isDigit(C)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    .line 649
    :cond_1
    new-instance v0, Ll/۫ܺ֡;

    .line 44
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 649
    throw v0

    :cond_2
    if-eqz v7, :cond_5

    const/16 v0, 0x20

    if-ne v3, v0, :cond_3

    goto :goto_1

    .line 657
    :cond_3
    new-instance v0, Ll/ۖܺ֡;

    const-string v2, "Invalid server reply: \'"

    .line 0
    invoke-static {v2, v1, v6}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 42
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 657
    throw v0

    :cond_4
    if-nez v7, :cond_7

    .line 663
    :cond_5
    :goto_1
    invoke-virtual {p0}, Ll/ܶܺ֡;->ۖ()Ljava/lang/String;

    invoke-virtual {p0}, Ll/ۚܺ֡;->֨()V

    .line 665
    iget v0, p0, Ll/ܶܺ֡;->᩵:I

    const/16 v1, 0x1a5

    if-eq v0, v1, :cond_6

    return v0

    .line 666
    :cond_6
    new-instance v0, Ll/۫ܺ֡;

    const-string v1, "FTP response 421 received.  Server closed connection."

    .line 44
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 666
    throw v0

    .line 660
    :cond_7
    new-instance v0, Ll/ۖܺ֡;

    const-string v2, "Truncated server reply: \'"

    .line 0
    invoke-static {v2, v1, v6}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 42
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 660
    throw v0

    .line 638
    :catch_0
    new-instance v0, Ll/ۖܺ֡;

    const-string v2, "Could not parse response code.\nServer Reply: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 42
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 638
    throw v0

    .line 631
    :cond_8
    new-instance v0, Ll/ۖܺ֡;

    const-string v2, "Truncated server reply: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 42
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 631
    throw v0

    .line 625
    :cond_9
    new-instance v0, Ll/۫ܺ֡;

    .line 44
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 625
    throw v0
.end method

.method public final ۜ(Ljava/lang/String;)V
    .locals 0

    .line 1329
    iput-object p1, p0, Ll/ܶܺ֡;->ܺ:Ljava/lang/String;

    return-void
.end method

.method public final ۠()Ll/֡ܺ֡;
    .locals 1

    .line 577
    iget-object v0, p0, Ll/ܶܺ֡;->ۡ:Ll/֡ܺ֡;

    return-object v0
.end method

.method public ۡ()V
    .locals 2

    .line 497
    invoke-super {p0}, Ll/ۚܺ֡;->ۡ()V

    const/4 v0, 0x0

    .line 498
    iput-object v0, p0, Ll/ܶܺ֡;->ۖ:Ljava/io/BufferedReader;

    .line 499
    iput-object v0, p0, Ll/ܶܺ֡;->ۘ:Ljava/io/BufferedWriter;

    const/4 v1, 0x0

    .line 500
    iput-boolean v1, p0, Ll/ܶܺ֡;->ᩴ:Z

    .line 501
    iput-object v0, p0, Ll/ܶܺ֡;->ۚ:Ljava/lang/String;

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 678
    iget v0, p0, Ll/ܶܺ֡;->᩵:I

    return v0
.end method

.method public final ۧ(Ljava/net/InetAddress;I)I
    .locals 3

    .line 1069
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1070
    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x2e

    const/16 v2, 0x2c

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    ushr-int/lit8 p1, p2, 0x8

    .line 1072
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1073
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1074
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit16 p1, p2, 0xff

    .line 1076
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1077
    sget-object p1, Ll/۬ܺ֡;->ۤ֫:Ll/۬ܺ֡;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ll/ܶܺ֡;->֫(Ll/۬ܺ֡;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final ܳ(Ljava/lang/String;)I
    .locals 1

    .line 1385
    sget-object v0, Ll/۬ܺ֡;->ᩴۧ:Ll/۬ܺ֡;

    invoke-virtual {p0, v0, p1}, Ll/ܶܺ֡;->֫(Ll/۬ܺ֡;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public ܽ(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1298
    iget-object v0, p0, Ll/ܶܺ֡;->ۘ:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_2

    .line 431
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p2, :cond_0

    const/16 p1, 0x20

    .line 433
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 434
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    const-string p1, "\r\n"

    .line 436
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 437
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1194
    :try_start_0
    iget-object p2, p0, Ll/ܶܺ֡;->ۘ:Ljava/io/BufferedWriter;

    invoke-virtual {p2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 1195
    iget-object p1, p0, Ll/ܶܺ֡;->ۘ:Ljava/io/BufferedWriter;

    invoke-virtual {p1}, Ljava/io/BufferedWriter;->flush()V
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1303
    invoke-virtual {p0}, Ll/ۚܺ֡;->ۚ()V

    .line 1304
    invoke-virtual {p0}, Ll/ܶܺ֡;->ۜ()I

    move-result p1

    return p1

    :catch_0
    move-exception p1

    .line 1197
    invoke-virtual {p0}, Ll/ۚܺ֡;->ܺ()Z

    move-result p2

    if-nez p2, :cond_1

    .line 1198
    new-instance p1, Ll/۫ܺ֡;

    const-string p2, "Connection unexpectedly closed."

    .line 44
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1198
    throw p1

    .line 1200
    :cond_1
    throw p1

    .line 1299
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Connection is not open"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
