.class public abstract Ll/ۚܺ֡;
.super Ljava/lang/Object;
.source "I59O"


# static fields
.field public static final ۢ:Ljavax/net/SocketFactory;

.field public static final ᩷:Ljavax/net/ServerSocketFactory;


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۜ:I

.field public ۧ:Ljava/io/InputStream;

.field public ܳ:Ljava/net/Socket;

.field public ܽ:Ljava/io/OutputStream;

.field public ܿ:Ljavax/net/SocketFactory;

.field public ᩳ:Ljavax/net/ServerSocketFactory;

.field public ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 55
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    sput-object v0, Ll/ۚܺ֡;->ۢ:Ljavax/net/SocketFactory;

    .line 58
    invoke-static {}, Ljavax/net/ServerSocketFactory;->getDefault()Ljavax/net/ServerSocketFactory;

    move-result-object v0

    sput-object v0, Ll/ۚܺ֡;->᩷:Ljavax/net/ServerSocketFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0xea60

    .line 120
    iput v0, p0, Ll/ۚܺ֡;->ۜ:I

    .line 134
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    const/4 v0, 0x0

    .line 141
    iput-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    .line 142
    iput-object v0, p0, Ll/ۚܺ֡;->֫:Ljava/lang/String;

    .line 143
    iput-object v0, p0, Ll/ۚܺ֡;->ۧ:Ljava/io/InputStream;

    .line 144
    iput-object v0, p0, Ll/ۚܺ֡;->ܽ:Ljava/io/OutputStream;

    const/4 v0, 0x0

    .line 145
    iput v0, p0, Ll/ۚܺ֡;->᩻:I

    .line 147
    sget-object v0, Ll/ۚܺ֡;->ۢ:Ljavax/net/SocketFactory;

    iput-object v0, p0, Ll/ۚܺ֡;->ܿ:Ljavax/net/SocketFactory;

    .line 148
    sget-object v0, Ll/ۚܺ֡;->᩷:Ljavax/net/ServerSocketFactory;

    iput-object v0, p0, Ll/ۚܺ֡;->ᩳ:Ljavax/net/ServerSocketFactory;

    return-void
.end method


# virtual methods
.method public final ֡()V
    .locals 2

    .line 204
    iget-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    iget v1, p0, Ll/ۚܺ֡;->᩻:I

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    return-void
.end method

.method public final ֨()V
    .locals 1

    .line 357
    invoke-virtual {p0}, Ll/ۚܺ֡;->۠()Ll/֡ܺ֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/֡ܺ֡;->ۧ()V

    return-void
.end method

.method public final ֫(ILjava/lang/String;)V
    .locals 1

    .line 310
    iput-object p2, p0, Ll/ۚܺ֡;->֫:Ljava/lang/String;

    .line 311
    new-instance v0, Ljava/net/InetSocketAddress;

    invoke-direct {v0, p2, p1}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    .line 154
    iget-object p1, p0, Ll/ۚܺ֡;->ܿ:Ljavax/net/SocketFactory;

    invoke-virtual {p1}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object p1

    iput-object p1, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    .line 164
    iget p2, p0, Ll/ۚܺ֡;->ۜ:I

    invoke-virtual {p1, v0, p2}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    .line 165
    invoke-virtual {p0}, Ll/ۚܺ֡;->᩵()V

    return-void
.end method

.method public final ֫(Ll/֫ۖ֡;)V
    .locals 0

    if-nez p1, :cond_0

    .line 737
    sget-object p1, Ll/ۚܺ֡;->ۢ:Ljavax/net/SocketFactory;

    iput-object p1, p0, Ll/ۚܺ֡;->ܿ:Ljavax/net/SocketFactory;

    return-void

    .line 739
    :cond_0
    iput-object p1, p0, Ll/ۚܺ֡;->ܿ:Ljavax/net/SocketFactory;

    return-void
.end method

.method public final ֫(Ll/۟ܺ֡;)V
    .locals 0

    if-nez p1, :cond_0

    .line 723
    sget-object p1, Ll/ۚܺ֡;->᩷:Ljavax/net/ServerSocketFactory;

    iput-object p1, p0, Ll/ۚܺ֡;->ᩳ:Ljavax/net/ServerSocketFactory;

    return-void

    .line 725
    :cond_0
    iput-object p1, p0, Ll/ۚܺ֡;->ᩳ:Ljavax/net/ServerSocketFactory;

    return-void
.end method

.method public final ֫(Ljava/net/Socket;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 788
    invoke-virtual {p1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object p1

    .line 478
    iget-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v0

    .line 788
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۘ()Z
    .locals 2

    .line 563
    invoke-virtual {p0}, Ll/ۚܺ֡;->ܺ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    .line 565
    :try_start_0
    iget-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v0

    if-nez v0, :cond_0

    return v1

    .line 568
    :cond_0
    iget-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getPort()I

    move-result v0

    if-nez v0, :cond_1

    return v1

    .line 571
    :cond_1
    iget-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getRemoteSocketAddress()Ljava/net/SocketAddress;

    move-result-object v0

    if-nez v0, :cond_2

    return v1

    .line 574
    :cond_2
    iget-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    move-result v0

    if-eqz v0, :cond_3

    return v1

    .line 580
    :cond_3
    iget-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v0

    if-eqz v0, :cond_4

    return v1

    .line 583
    :cond_4
    iget-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v0

    if-eqz v0, :cond_5

    return v1

    .line 588
    :cond_5
    iget-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    .line 590
    iget-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    :cond_6
    return v1
.end method

.method public final ۚ()V
    .locals 1

    .line 346
    invoke-virtual {p0}, Ll/ۚܺ֡;->۠()Ll/֡ܺ֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/֡ܺ֡;->֫()V

    return-void
.end method

.method public abstract ۠()Ll/֡ܺ֡;
.end method

.method public ۡ()V
    .locals 1

    .line 329
    iget-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    .line 480
    invoke-static {v0}, Ll/᩹ۢ֡;->֫(Ljava/io/Closeable;)V

    .line 330
    iget-object v0, p0, Ll/ۚܺ֡;->ۧ:Ljava/io/InputStream;

    .line 480
    invoke-static {v0}, Ll/᩹ۢ֡;->֫(Ljava/io/Closeable;)V

    .line 331
    iget-object v0, p0, Ll/ۚܺ֡;->ܽ:Ljava/io/OutputStream;

    .line 480
    invoke-static {v0}, Ll/᩹ۢ֡;->֫(Ljava/io/Closeable;)V

    const/4 v0, 0x0

    .line 332
    iput-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    .line 333
    iput-object v0, p0, Ll/ۚܺ֡;->֫:Ljava/lang/String;

    .line 334
    iput-object v0, p0, Ll/ۚܺ֡;->ۧ:Ljava/io/InputStream;

    .line 335
    iput-object v0, p0, Ll/ۚܺ֡;->ܽ:Ljava/io/OutputStream;

    return-void
.end method

.method public final ܶ()Ljava/net/InetAddress;
    .locals 1

    .line 439
    iget-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getLocalAddress()Ljava/net/InetAddress;

    move-result-object v0

    return-object v0
.end method

.method public final ܺ()Z
    .locals 1

    .line 607
    iget-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 611
    :cond_0
    invoke-virtual {v0}, Ljava/net/Socket;->isConnected()Z

    move-result v0

    return v0
.end method

.method public ᩵()V
    .locals 1

    .line 182
    invoke-virtual {p0}, Ll/ۚܺ֡;->֡()V

    .line 183
    iget-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, p0, Ll/ۚܺ֡;->ۧ:Ljava/io/InputStream;

    .line 184
    iget-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    iput-object v0, p0, Ll/ۚܺ֡;->ܽ:Ljava/io/OutputStream;

    return-void
.end method

.method public final ᩶()V
    .locals 1

    const v0, 0xea60

    .line 661
    iput v0, p0, Ll/ۚܺ֡;->᩻:I

    return-void
.end method

.method public final ᩸()Ljava/net/InetAddress;
    .locals 1

    .line 478
    iget-object v0, p0, Ll/ۚܺ֡;->ܳ:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v0

    return-object v0
.end method

.method public final ᩹()V
    .locals 1

    const/16 v0, 0x4e20

    .line 641
    iput v0, p0, Ll/ۚܺ֡;->ۜ:I

    return-void
.end method
