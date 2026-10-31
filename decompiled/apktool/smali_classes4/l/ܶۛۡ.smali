.class public final Ll/ܶۛۡ;
.super Ljavax/net/SocketFactory;
.source "418A"


# instance fields
.field public final ֫:I

.field public ۧ:Ljavax/net/SocketFactory;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljavax/net/SocketFactory;-><init>()V

    .line 11
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Ll/ܶۛۡ;->ۧ:Ljavax/net/SocketFactory;

    const/high16 v0, 0x10000

    .line 19
    iput v0, p0, Ll/ܶۛۡ;->֫:I

    return-void
.end method


# virtual methods
.method public final createSocket()Ljava/net/Socket;
    .locals 2

    .line 23
    iget-object v0, p0, Ll/ܶۛۡ;->ۧ:Ljavax/net/SocketFactory;

    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v0

    .line 24
    iget v1, p0, Ll/ܶۛۡ;->֫:I

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSendBufferSize(I)V

    return-object v0
.end method

.method public final createSocket(Ljava/lang/String;I)Ljava/net/Socket;
    .locals 1

    .line 29
    iget-object v0, p0, Ll/ܶۛۡ;->ۧ:Ljavax/net/SocketFactory;

    invoke-virtual {v0, p1, p2}, Ljavax/net/SocketFactory;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object p1

    .line 30
    iget p2, p0, Ll/ܶۛۡ;->֫:I

    invoke-virtual {p1, p2}, Ljava/net/Socket;->setSendBufferSize(I)V

    return-object p1
.end method

.method public final createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/ܶۛۡ;->ۧ:Ljavax/net/SocketFactory;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/SocketFactory;->createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object p1

    .line 42
    iget p2, p0, Ll/ܶۛۡ;->֫:I

    invoke-virtual {p1, p2}, Ljava/net/Socket;->setSendBufferSize(I)V

    return-object p1
.end method

.method public final createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;
    .locals 1

    .line 35
    iget-object v0, p0, Ll/ܶۛۡ;->ۧ:Ljavax/net/SocketFactory;

    invoke-virtual {v0, p1, p2}, Ljavax/net/SocketFactory;->createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object p1

    .line 36
    iget p2, p0, Ll/ܶۛۡ;->֫:I

    invoke-virtual {p1, p2}, Ljava/net/Socket;->setSendBufferSize(I)V

    return-object p1
.end method

.method public final createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 1

    .line 47
    iget-object v0, p0, Ll/ܶۛۡ;->ۧ:Ljavax/net/SocketFactory;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/SocketFactory;->createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object p1

    .line 48
    iget p2, p0, Ll/ܶۛۡ;->֫:I

    invoke-virtual {p1, p2}, Ljava/net/Socket;->setSendBufferSize(I)V

    return-object p1
.end method
