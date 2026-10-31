.class public final Ll/᩷۟ۖ;
.super Ljavax/net/SocketFactory;
.source "M9CP"


# static fields
.field public static final ܽ:Ll/֫᩻֨;


# instance fields
.field public ֫:I

.field public ۧ:Ljava/net/Proxy;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 30
    const-class v0, Ll/᩷۟ۖ;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/᩷۟ۖ;->ܽ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 37
    sget-object v0, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    .line 52
    invoke-direct {p0}, Ljavax/net/SocketFactory;-><init>()V

    .line 53
    iput-object v0, p0, Ll/᩷۟ۖ;->ۧ:Ljava/net/Proxy;

    const/16 v0, 0x1388

    .line 54
    iput v0, p0, Ll/᩷۟ۖ;->֫:I

    return-void
.end method

.method private ֫(Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;)Ljava/net/Socket;
    .locals 2

    .line 83
    new-instance v0, Ljava/net/Socket;

    iget-object v1, p0, Ll/᩷۟ۖ;->ۧ:Ljava/net/Proxy;

    invoke-direct {v0, v1}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    if-eqz p2, :cond_0

    .line 85
    invoke-virtual {v0, p2}, Ljava/net/Socket;->bind(Ljava/net/SocketAddress;)V

    .line 87
    :cond_0
    sget-object p2, Ll/᩷۟ۖ;->ܽ:Ll/֫᩻֨;

    const-string v1, "Connecting to {}"

    invoke-interface {p2, p1, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    iget p2, p0, Ll/᩷۟ۖ;->֫:I

    invoke-virtual {v0, p1, p2}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    const/4 p1, 0x1

    .line 90
    invoke-virtual {v0, p1}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    return-object v0
.end method


# virtual methods
.method public final createSocket()Ljava/net/Socket;
    .locals 2

    .line 59
    new-instance v0, Ljava/net/Socket;

    iget-object v1, p0, Ll/᩷۟ۖ;->ۧ:Ljava/net/Proxy;

    invoke-direct {v0, v1}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    return-object v0
.end method

.method public final createSocket(Ljava/lang/String;I)Ljava/net/Socket;
    .locals 1

    .line 64
    new-instance v0, Ljava/net/InetSocketAddress;

    invoke-direct {v0, p1, p2}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    const/4 p1, 0x0

    invoke-direct {p0, v0, p1}, Ll/᩷۟ۖ;->֫(Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;)Ljava/net/Socket;

    move-result-object p1

    return-object p1
.end method

.method public final createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 1

    .line 69
    new-instance v0, Ljava/net/InetSocketAddress;

    invoke-direct {v0, p1, p2}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    new-instance p1, Ljava/net/InetSocketAddress;

    invoke-direct {p1, p3, p4}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-direct {p0, v0, p1}, Ll/᩷۟ۖ;->֫(Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;)Ljava/net/Socket;

    move-result-object p1

    return-object p1
.end method

.method public final createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;
    .locals 1

    .line 74
    new-instance v0, Ljava/net/InetSocketAddress;

    invoke-direct {v0, p1, p2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    const/4 p1, 0x0

    invoke-direct {p0, v0, p1}, Ll/᩷۟ۖ;->֫(Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;)Ljava/net/Socket;

    move-result-object p1

    return-object p1
.end method

.method public final createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 1

    .line 79
    new-instance v0, Ljava/net/InetSocketAddress;

    invoke-direct {v0, p1, p2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    new-instance p1, Ljava/net/InetSocketAddress;

    invoke-direct {p1, p3, p4}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-direct {p0, v0, p1}, Ll/᩷۟ۖ;->֫(Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;)Ljava/net/Socket;

    move-result-object p1

    return-object p1
.end method
