.class public final Ll/۠ۢ᩵;
.super Ljava/lang/Object;
.source "B9V6"

# interfaces
.implements Ll/ۗۜ᩵;


# static fields
.field public static final ֫:Ll/֫᩻֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 24
    const-class v0, Ll/۠ۢ᩵;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/String;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/۠ۢ᩵;->֫:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()[Ljava/net/InetAddress;
    .locals 7

    .line 39
    sget-object v0, Ll/۠ۢ᩵;->֫:Ll/֫᩻֨;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 42
    :try_start_0
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 43
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/net/NetworkInterface;

    .line 44
    invoke-virtual {v3}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;

    move-result-object v4

    :catch_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 45
    invoke-interface {v4}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/net/InetAddress;

    const-string v6, "Found NetworkInterface/InetAddress: {} -- {}"

    .line 46
    invoke-interface {v0, v6, v3, v5}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_1

    .line 83
    :try_start_1
    invoke-virtual {v3}, Ljava/net/NetworkInterface;->isUp()Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_0

    .line 87
    :cond_1
    invoke-virtual {v3}, Ljava/net/NetworkInterface;->supportsMulticast()Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_0

    .line 91
    :cond_2
    invoke-virtual {v3}, Ljava/net/NetworkInterface;->isLoopback()Z

    move-result v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v6, :cond_3

    goto :goto_0

    .line 48
    :cond_3
    :try_start_2
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/net/SocketException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception v2

    .line 53
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Error while fetching network interfaces addresses: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    .line 55
    :cond_4
    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result v0

    new-array v0, v0, [Ljava/net/InetAddress;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/net/InetAddress;

    return-object v0
.end method
