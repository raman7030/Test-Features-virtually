.class public Ll/ܰܺ֡;
.super Ll/ۙܺ֡;
.source "42VH"


# static fields
.field public static final ܺ֫:[Ljava/lang/String;


# instance fields
.field public final ۜ֫:Z

.field public ۡ֫:Ljavax/net/ssl/TrustManager;

.field public final ۢ֫:Ljava/lang/String;

.field public ܳ֫:Z

.field public ܿ֫:Ljavax/net/ssl/SSLContext;

.field public ᩳ֫:Ljava/lang/String;

.field public ᩷֫:Ljava/net/Socket;

.field public ᩻֫:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "S"

    const-string v1, "P"

    const-string v2, "C"

    const-string v3, "E"

    .line 70
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ܰܺ֡;->ܺ֫:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2

    .line 220
    invoke-direct {p0}, Ll/ۙܺ֡;-><init>()V

    const-string v0, "TLS"

    .line 125
    iput-object v0, p0, Ll/ܰܺ֡;->ᩳ֫:Ljava/lang/String;

    const/4 v1, 0x1

    .line 134
    iput-boolean v1, p0, Ll/ܰܺ֡;->᩻֫:Z

    .line 137
    iput-boolean v1, p0, Ll/ܰܺ֡;->ܳ֫:Z

    .line 154
    invoke-static {}, Ll/ۙۖ֡;->֫()Ljavax/net/ssl/X509TrustManager;

    move-result-object v1

    iput-object v1, p0, Ll/ܰܺ֡;->ۡ֫:Ljavax/net/ssl/TrustManager;

    .line 221
    iput-object v0, p0, Ll/ܰܺ֡;->ۢ֫:Ljava/lang/String;

    .line 222
    iput-boolean p1, p0, Ll/ܰܺ֡;->ۜ֫:Z

    return-void
.end method

.method private ۧ֫()V
    .locals 5

    .line 708
    iget-object v0, p0, Ll/ܰܺ֡;->ܿ֫:Ljavax/net/ssl/SSLContext;

    if-nez v0, :cond_1

    .line 709
    iget-object v0, p0, Ll/ܰܺ֡;->ۢ֫:Ljava/lang/String;

    .line 45
    iget-object v1, p0, Ll/ܰܺ֡;->ۡ֫:Ljavax/net/ssl/TrustManager;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v3, v2

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    new-array v3, v3, [Ljavax/net/ssl/TrustManager;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    .line 60
    :goto_0
    :try_start_0
    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v0

    .line 61
    invoke-virtual {v0, v2, v3, v2}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 709
    iput-object v0, p0, Ll/ܰܺ֡;->ܿ֫:Ljavax/net/ssl/SSLContext;

    return-void

    :catch_0
    move-exception v0

    .line 63
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Could not initialize SSL context"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫(Z)V
    .locals 0

    .line 1023
    iput-boolean p1, p0, Ll/ܰܺ֡;->᩻֫:Z

    return-void
.end method

.method public final ֫֫()V
    .locals 5

    .line 1101
    iget-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    iput-object v0, p0, Ll/ܰܺ֡;->᩷֫:Ljava/net/Socket;

    .line 1102
    invoke-direct {p0}, Ll/ܰܺ֡;->ۧ֫()V

    .line 1103
    iget-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 353
    iget-object v2, p0, Ll/ܰܺ֡;->ܿ֫:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v2}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v2

    .line 354
    iget-object v3, p0, Ll/ۚܺ֡;->֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/net/Socket;->getPort()I

    move-result v4

    invoke-virtual {v2, v0, v3, v4, v1}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/SSLSocket;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1104
    :goto_0
    iget-boolean v2, p0, Ll/ܰܺ֡;->᩻֫:Z

    invoke-virtual {v0, v2}, Ljavax/net/ssl/SSLSocket;->setEnableSessionCreation(Z)V

    .line 1105
    iget-boolean v2, p0, Ll/ܰܺ֡;->ܳ֫:Z

    invoke-virtual {v0, v2}, Ljavax/net/ssl/SSLSocket;->setUseClientMode(Z)V

    if-eqz v2, :cond_1

    goto :goto_1

    .line 1113
    :cond_1
    invoke-virtual {v0, v1}, Ljavax/net/ssl/SSLSocket;->setNeedClientAuth(Z)V

    .line 1114
    invoke-virtual {v0, v1}, Ljavax/net/ssl/SSLSocket;->setWantClientAuth(Z)V

    .line 1123
    :goto_1
    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 1126
    iput-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    .line 1127
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-virtual {v0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v3

    .line 586
    iget-object v4, p0, Ll/ܶܺ֡;->ܺ:Ljava/lang/String;

    .line 1127
    invoke-direct {v2, v3, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    iput-object v1, p0, Ll/ܶܺ֡;->ۖ:Ljava/io/BufferedReader;

    .line 1128
    new-instance v1, Ljava/io/BufferedWriter;

    new-instance v2, Ljava/io/OutputStreamWriter;

    invoke-virtual {v0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    .line 586
    iget-object v3, p0, Ll/ܶܺ֡;->ܺ:Ljava/lang/String;

    .line 1128
    invoke-direct {v2, v0, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    iput-object v1, p0, Ll/ܶܺ֡;->ۘ:Ljava/io/BufferedWriter;

    return-void
.end method

.method public final ۟()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x4

    if-ge v0, v1, :cond_3

    .line 325
    sget-object v1, Ll/ܰܺ֡;->ܺ֫:[Ljava/lang/String;

    aget-object v1, v1, v0

    const-string v2, "P"

    .line 326
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v0, "PROT"

    .line 528
    invoke-virtual {p0, v0, v2}, Ll/ܰܺ֡;->ܽ(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0xc8

    if-ne v1, v0, :cond_1

    const-string v0, "C"

    .line 531
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 532
    invoke-virtual {p0, v0}, Ll/ۚܺ֡;->֫(Ll/֫ۖ֡;)V

    .line 533
    invoke-virtual {p0, v0}, Ll/ۚܺ֡;->֫(Ll/۟ܺ֡;)V

    return-void

    .line 535
    :cond_0
    new-instance v0, Ll/֫ۖ֡;

    iget-object v1, p0, Ll/ܰܺ֡;->ܿ֫:Ljavax/net/ssl/SSLContext;

    invoke-direct {v0, v1}, Ll/֫ۖ֡;-><init>(Ljavax/net/ssl/SSLContext;)V

    invoke-virtual {p0, v0}, Ll/ۚܺ֡;->֫(Ll/֫ۖ֡;)V

    .line 536
    new-instance v0, Ll/۟ܺ֡;

    iget-object v1, p0, Ll/ܰܺ֡;->ܿ֫:Ljavax/net/ssl/SSLContext;

    invoke-direct {v0, v1}, Ll/۟ܺ֡;-><init>(Ljavax/net/ssl/SSLContext;)V

    invoke-virtual {p0, v0}, Ll/ۚܺ֡;->֫(Ll/۟ܺ֡;)V

    .line 537
    invoke-direct {p0}, Ll/ܰܺ֡;->ۧ֫()V

    return-void

    .line 529
    :cond_1
    new-instance v0, Ljavax/net/ssl/SSLException;

    invoke-virtual {p0}, Ll/ܶܺ֡;->ۖ()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljavax/net/ssl/SSLException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 526
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method

.method public final ۡ()V
    .locals 1

    .line 370
    invoke-super {p0}, Ll/ۙܺ֡;->ۡ()V

    .line 371
    iget-object v0, p0, Ll/ܰܺ֡;->᩷֫:Ljava/net/Socket;

    if-eqz v0, :cond_0

    .line 423
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    :cond_0
    const/4 v0, 0x0

    .line 372
    invoke-virtual {p0, v0}, Ll/ۚܺ֡;->֫(Ll/֫ۖ֡;)V

    .line 373
    invoke-virtual {p0, v0}, Ll/ۚܺ֡;->֫(Ll/۟ܺ֡;)V

    return-void
.end method

.method public ۧ(Ljava/net/Socket;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final ܰ()V
    .locals 3

    const-string v0, "PBSZ"

    const-wide/16 v1, 0x0

    .line 500
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ll/ܰܺ֡;->ܽ(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0xc8

    if-ne v1, v0, :cond_0

    return-void

    .line 502
    :cond_0
    new-instance v0, Ljavax/net/ssl/SSLException;

    invoke-virtual {p0}, Ll/ܶܺ֡;->ۖ()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljavax/net/ssl/SSLException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ܽ(Ljava/lang/String;Ljava/lang/String;)I
    .locals 3

    .line 976
    invoke-super {p0, p1, p2}, Ll/ܶܺ֡;->ܽ(Ljava/lang/String;Ljava/lang/String;)I

    move-result p2

    const-string v0, "CCC"

    .line 978
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 p1, 0xc8

    if-ne p1, p2, :cond_0

    .line 982
    iget-object p1, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->close()V

    .line 983
    iget-object p1, p0, Ll/ܰܺ֡;->᩷֫:Ljava/net/Socket;

    iput-object p1, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    .line 984
    new-instance p1, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    iget-object v1, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    .line 586
    iget-object v2, p0, Ll/ܶܺ֡;->ܺ:Ljava/lang/String;

    .line 984
    invoke-direct {v0, v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {p1, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    iput-object p1, p0, Ll/ܶܺ֡;->ۖ:Ljava/io/BufferedReader;

    .line 985
    new-instance p1, Ljava/io/BufferedWriter;

    new-instance v0, Ljava/io/OutputStreamWriter;

    iget-object v1, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    .line 586
    iget-object v2, p0, Ll/ܶܺ֡;->ܺ:Ljava/lang/String;

    .line 985
    invoke-direct {v0, v1, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-direct {p1, v0}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    iput-object p1, p0, Ll/ܶܺ֡;->ۘ:Ljava/io/BufferedWriter;

    return p2

    .line 980
    :cond_0
    new-instance p1, Ljavax/net/ssl/SSLException;

    invoke-virtual {p0}, Ll/ܶܺ֡;->ۖ()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljavax/net/ssl/SSLException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return p2
.end method

.method public ܿ(Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;
    .locals 11

    .line 791
    invoke-virtual {p0}, Ll/ۙܺ֡;->ۗ()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ۙܺ֡;->ۗ()I

    move-result v0

    if-eq v0, v1, :cond_0

    goto/16 :goto_6

    .line 795
    :cond_0
    invoke-virtual {p0}, Ll/ۚܺ֡;->᩸()Ljava/net/InetAddress;

    move-result-object v0

    instance-of v0, v0, Ljava/net/Inet6Address;

    .line 799
    invoke-virtual {p0}, Ll/ۙܺ֡;->۬()Ll/ۖ᩹ᩴ;

    move-result-object v4

    .line 36
    invoke-virtual {v4}, Ll/ۖ᩹ᩴ;->toMillis()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-lez v8, :cond_1

    const-wide/32 v8, 0x7fffffff

    .line 37
    invoke-static {v4, v5, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    goto :goto_0

    :cond_1
    const-wide/32 v8, -0x80000000

    invoke-static {v4, v5, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    :goto_0
    long-to-int v5, v4

    .line 800
    invoke-virtual {p0}, Ll/ۙܺ֡;->ۗ()I

    move-result v4

    const/4 v8, 0x1

    if-nez v4, :cond_9

    .line 803
    iget-object v4, p0, Ll/ۚܺ֡;->ᩳ:Ljavax/net/ServerSocketFactory;

    .line 1629
    invoke-virtual {p0}, Ll/ۚܺ֡;->ܶ()Ljava/net/InetAddress;

    move-result-object v9

    .line 803
    invoke-virtual {v4, v2, v8, v9}, Ljavax/net/ServerSocketFactory;->createServerSocket(IILjava/net/InetAddress;)Ljava/net/ServerSocket;

    move-result-object v4

    if-eqz v0, :cond_2

    .line 1629
    :try_start_0
    invoke-virtual {p0}, Ll/ۚܺ֡;->ܶ()Ljava/net/InetAddress;

    move-result-object v0

    .line 812
    invoke-virtual {v4}, Ljava/net/ServerSocket;->getLocalPort()I

    move-result v9

    invoke-virtual {p0, v0, v9}, Ll/ܶܺ֡;->֫(Ljava/net/InetAddress;I)I

    move-result v0

    invoke-static {v0}, Ll/ۧ᩷ܽ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    .line 1629
    :cond_2
    invoke-virtual {p0}, Ll/ۚܺ֡;->ܶ()Ljava/net/InetAddress;

    move-result-object v0

    .line 815
    invoke-virtual {v4}, Ljava/net/ServerSocket;->getLocalPort()I

    move-result v9

    invoke-virtual {p0, v0, v9}, Ll/ܶܺ֡;->ۧ(Ljava/net/InetAddress;I)I

    move-result v0

    invoke-static {v0}, Ll/ۧ᩷ܽ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    .line 819
    :cond_3
    invoke-virtual {p0}, Ll/ۙܺ֡;->ۛ()J

    move-result-wide v9

    cmp-long v0, v9, v6

    if-lez v0, :cond_4

    invoke-virtual {p0}, Ll/ۙܺ֡;->ۛ()J

    move-result-wide v6

    invoke-virtual {p0, v6, v7}, Ll/ۙܺ֡;->ۧ(J)Z

    move-result v0

    if-nez v0, :cond_4

    if-eqz v4, :cond_12

    goto :goto_1

    .line 823
    :cond_4
    invoke-virtual {p0, p1, p2}, Ll/ܰܺ֡;->ܽ(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ll/ۧ᩷ܽ;->ۧ(I)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_5

    if-eqz v4, :cond_12

    .line 846
    :goto_1
    invoke-virtual {v4}, Ljava/net/ServerSocket;->close()V

    goto/16 :goto_6

    :cond_5
    if-ltz v5, :cond_6

    .line 832
    :try_start_1
    invoke-virtual {v4, v5}, Ljava/net/ServerSocket;->setSoTimeout(I)V

    .line 834
    :cond_6
    invoke-virtual {v4}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;

    move-result-object p1

    if-ltz v5, :cond_7

    .line 838
    invoke-virtual {p1, v5}, Ljava/net/Socket;->setSoTimeout(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 846
    :cond_7
    invoke-virtual {v4}, Ljava/net/ServerSocket;->close()V

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    if-eqz v4, :cond_8

    .line 803
    :try_start_2
    invoke-virtual {v4}, Ljava/net/ServerSocket;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_8
    :goto_2
    throw p1

    .line 856
    :cond_9
    iget-object v4, p0, Ll/ܶܺ֡;->֡:Ljava/util/ArrayList;

    if-eqz v0, :cond_a

    .line 558
    sget-object v9, Ll/۬ܺ֡;->ܿ֫:Ll/۬ܺ֡;

    .line 1217
    invoke-virtual {p0, v9, v3}, Ll/ܶܺ֡;->֫(Ll/۬ܺ֡;Ljava/lang/String;)I

    move-result v9

    const/16 v10, 0xe5

    if-ne v9, v10, :cond_a

    .line 858
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Ll/ۙܺ֡;->ۢ(Ljava/lang/String;)V

    goto :goto_3

    :cond_a
    if-eqz v0, :cond_b

    goto/16 :goto_6

    .line 1054
    :cond_b
    sget-object v0, Ll/۬ܺ֡;->۫֫:Ll/۬ܺ֡;

    .line 1217
    invoke-virtual {p0, v0, v3}, Ll/ܶܺ֡;->֫(Ll/۬ܺ֡;Ljava/lang/String;)I

    move-result v0

    const/16 v9, 0xe3

    if-eq v0, v9, :cond_c

    goto/16 :goto_6

    .line 867
    :cond_c
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Ll/ۙܺ֡;->ۡ(Ljava/lang/String;)V

    .line 873
    :goto_3
    iget-object v0, p0, Ll/ۚܺ֡;->ܿ:Ljavax/net/SocketFactory;

    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v0

    if-ltz v5, :cond_d

    .line 891
    invoke-virtual {v0, v5}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 894
    :cond_d
    new-instance v4, Ljava/net/InetSocketAddress;

    invoke-virtual {p0}, Ll/ۙܺ֡;->۫()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Ll/ۙܺ֡;->ۤ()I

    move-result v9

    invoke-direct {v4, v5, v9}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    iget v5, p0, Ll/ۚܺ֡;->ۜ:I

    invoke-virtual {v0, v4, v5}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    .line 900
    invoke-virtual {p0}, Ll/ۙܺ֡;->ۛ()J

    move-result-wide v4

    cmp-long v9, v4, v6

    if-lez v9, :cond_e

    invoke-virtual {p0}, Ll/ۙܺ֡;->ۛ()J

    move-result-wide v4

    invoke-virtual {p0, v4, v5}, Ll/ۙܺ֡;->ۧ(J)Z

    move-result v4

    if-nez v4, :cond_e

    new-array p1, v1, [Ljava/io/Closeable;

    aput-object v0, p1, v2

    aput-object v3, p1, v8

    .line 341
    sget-object p2, Ll/᩹ۢ֡;->֫:[B

    .line 435
    new-instance p2, Ll/۠ۢ֡;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    invoke-static {p2, p1}, Ll/᩵ۡ֡;->֫(Ll/֡ۡ֡;[Ljava/lang/Object;)V

    goto :goto_6

    .line 905
    :cond_e
    invoke-virtual {p0, p1, p2}, Ll/ܰܺ֡;->ܽ(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ll/ۧ᩷ܽ;->ۧ(I)Z

    move-result p1

    if-nez p1, :cond_f

    new-array p1, v1, [Ljava/io/Closeable;

    aput-object v0, p1, v2

    aput-object v3, p1, v8

    .line 341
    sget-object p2, Ll/᩹ۢ֡;->֫:[B

    .line 435
    new-instance p2, Ll/۠ۢ֡;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    invoke-static {p2, p1}, Ll/᩵ۡ֡;->֫(Ll/֡ۡ֡;[Ljava/lang/Object;)V

    goto :goto_6

    :cond_f
    move-object p1, v0

    .line 911
    :goto_4
    invoke-virtual {p0}, Ll/ۙܺ֡;->ۨ()Z

    move-result p2

    if-eqz p2, :cond_11

    invoke-virtual {p0, p1}, Ll/ۚܺ֡;->֫(Ljava/net/Socket;)Z

    move-result p2

    if-eqz p2, :cond_10

    goto :goto_5

    .line 913
    :cond_10
    invoke-virtual {p1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object p2

    new-array v0, v1, [Ljava/io/Closeable;

    aput-object p1, v0, v2

    aput-object v3, v0, v8

    .line 341
    sget-object p1, Ll/᩹ۢ֡;->֫:[B

    .line 435
    new-instance p1, Ll/۠ۢ֡;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, v0}, Ll/᩵ۡ֡;->֫(Ll/֡ۡ֡;[Ljava/lang/Object;)V

    .line 917
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Host attempting data connection "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 918
    invoke-virtual {p2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " is not same as server "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۚܺ֡;->᩸()Ljava/net/InetAddress;

    move-result-object p2

    invoke-virtual {p2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    :goto_5
    move-object v3, p1

    .line 283
    :cond_12
    :goto_6
    invoke-virtual {p0, v3}, Ll/ܰܺ֡;->ۧ(Ljava/net/Socket;)V

    .line 284
    instance-of p1, v3, Ljavax/net/ssl/SSLSocket;

    if-eqz p1, :cond_14

    .line 285
    move-object p1, v3

    check-cast p1, Ljavax/net/ssl/SSLSocket;

    .line 287
    iget-boolean p2, p0, Ll/ܰܺ֡;->ܳ֫:Z

    invoke-virtual {p1, p2}, Ljavax/net/ssl/SSLSocket;->setUseClientMode(Z)V

    .line 288
    iget-boolean v0, p0, Ll/ܰܺ֡;->᩻֫:Z

    invoke-virtual {p1, v0}, Ljavax/net/ssl/SSLSocket;->setEnableSessionCreation(Z)V

    if-nez p2, :cond_13

    .line 292
    invoke-virtual {p1, v2}, Ljavax/net/ssl/SSLSocket;->setNeedClientAuth(Z)V

    .line 293
    invoke-virtual {p1, v2}, Ljavax/net/ssl/SSLSocket;->setWantClientAuth(Z)V

    .line 301
    :cond_13
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    :cond_14
    return-object v3
.end method

.method public final ᩵()V
    .locals 2

    .line 238
    iget-boolean v0, p0, Ll/ܰܺ֡;->ۜ֫:Z

    if-eqz v0, :cond_0

    .line 239
    invoke-virtual {p0}, Ll/ۚܺ֡;->֡()V

    .line 240
    invoke-virtual {p0}, Ll/ܰܺ֡;->֫֫()V

    .line 242
    :cond_0
    invoke-super {p0}, Ll/ۙܺ֡;->᩵()V

    if-nez v0, :cond_3

    const-string v0, "AUTH"

    .line 398
    iget-object v1, p0, Ll/ܰܺ֡;->ᩳ֫:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Ll/ܰܺ֡;->ܽ(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x14e

    if-ne v1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v1, 0xea

    if-ne v1, v0, :cond_2

    .line 246
    :goto_0
    invoke-virtual {p0}, Ll/ܰܺ֡;->֫֫()V

    return-void

    .line 403
    :cond_2
    new-instance v0, Ljavax/net/ssl/SSLException;

    invoke-virtual {p0}, Ll/ܶܺ֡;->ۖ()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljavax/net/ssl/SSLException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    return-void
.end method
