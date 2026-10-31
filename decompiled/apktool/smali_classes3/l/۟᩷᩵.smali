.class public final Ll/۟᩷᩵;
.super Ljava/lang/Object;
.source "C9Z7"

# interfaces
.implements Ll/ۗ᩷᩵;


# static fields
.field public static ۗ:Ll/֫᩻֨;


# instance fields
.field public final ۙ:Ll/ܰ᩷᩵;

.field public ᩶:Ljava/lang/String;

.field public ᩸:Ljava/net/InetAddress;

.field public ᩹:Ljava/net/NetworkInterface;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 34
    const-class v0, Ll/۟᩷᩵;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/String;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/۟᩷᩵;->ۗ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ljava/net/InetAddress;Ljava/lang/String;Ll/ۡۢ᩵;)V
    .locals 1

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    new-instance v0, Ll/ܰ᩷᩵;

    .line 52
    invoke-direct {v0}, Ll/ۙ᩷᩵;-><init>()V

    .line 53
    invoke-virtual {v0, p3}, Ll/ۙ᩷᩵;->֫(Ll/ۡۢ᩵;)V

    .line 121
    iput-object v0, p0, Ll/۟᩷᩵;->ۙ:Ll/ܰ᩷᩵;

    .line 122
    iput-object p1, p0, Ll/۟᩷᩵;->᩸:Ljava/net/InetAddress;

    .line 123
    iput-object p2, p0, Ll/۟᩷᩵;->᩶:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 126
    :try_start_0
    invoke-static {p1}, Ljava/net/NetworkInterface;->getByInetAddress(Ljava/net/InetAddress;)Ljava/net/NetworkInterface;

    move-result-object p1

    iput-object p1, p0, Ll/۟᩷᩵;->᩹:Ljava/net/NetworkInterface;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 128
    sget-object p2, Ll/۟᩷᩵;->ۗ:Ll/֫᩻֨;

    const-string p3, "LocalHostInfo() exception "

    invoke-interface {p2, p3, p1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static ֫(Ljava/net/InetAddress;Ll/ۡۢ᩵;)Ll/۟᩷᩵;
    .locals 6

    const-string v0, ""

    .line 69
    sget-object v1, Ll/۟᩷᩵;->ۗ:Ll/֫᩻֨;

    const/4 v2, 0x0

    if-nez p0, :cond_2

    :try_start_0
    const-string v3, "net.mdns.interface"

    .line 70
    invoke-static {v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 72
    invoke-static {v3}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v3

    goto :goto_0

    .line 74
    :cond_0
    invoke-static {}, Ljava/net/InetAddress;->getLocalHost()Ljava/net/InetAddress;

    move-result-object v3

    .line 75
    invoke-virtual {v3}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 77
    invoke-static {}, Ll/ۙۜ᩵;->֫()Ll/ۗۜ᩵;

    move-result-object v4

    check-cast v4, Ll/۠ۢ᩵;

    invoke-virtual {v4}, Ll/۠ۢ᩵;->֫()[Ljava/net/InetAddress;

    move-result-object v4

    .line 78
    array-length v5, v4

    if-lez v5, :cond_1

    .line 79
    aget-object v3, v4, v2

    .line 83
    :cond_1
    :goto_0
    invoke-virtual {v3}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v4, "Could not find any address beside the loopback."

    .line 84
    invoke-interface {v1, v4}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_2
    move-object v3, p0

    .line 87
    :cond_3
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_4

    .line 88
    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;

    move-result-object v0

    :cond_4
    const-string v4, "in-addr.arpa"

    .line 90
    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_5

    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 91
    :cond_5
    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 94
    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Could not initialize the host network interface on "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "because of an error: "

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v1, p0, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    .line 113
    :try_start_1
    invoke-static {p0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object p0
    :try_end_1
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    move-object v3, p0

    const-string v0, "computer"

    :cond_6
    :goto_3
    const-string p0, ".local"

    .line 101
    invoke-virtual {v0, p0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p0

    if-lez p0, :cond_7

    .line 103
    invoke-virtual {v0, v2, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :cond_7
    const-string p0, "[:%\\.]"

    const-string v1, "-"

    .line 105
    invoke-virtual {v0, p0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, ".local."

    .line 0
    invoke-static {p0, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 107
    new-instance v0, Ll/۟᩷᩵;

    invoke-direct {v0, v3, p0, p1}, Ll/۟᩷᩵;-><init>(Ljava/net/InetAddress;Ljava/lang/String;Ll/ۡۢ᩵;)V

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    const/16 v0, 0x400

    const-string v1, "local host info["

    .line 0
    invoke-static {v0, v1}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 134
    iget-object v1, p0, Ll/۟᩷᩵;->᩶:Ljava/lang/String;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "no name"

    .line 260
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    .line 261
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    iget-object v2, p0, Ll/۟᩷᩵;->᩹:Ljava/net/NetworkInterface;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/net/NetworkInterface;->getDisplayName()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    const-string v2, "???"

    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    .line 263
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    iget-object v2, p0, Ll/۟᩷᩵;->᩸:Ljava/net/InetAddress;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_2
    const-string v2, "no address"

    :goto_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    iget-object v1, p0, Ll/۟᩷᩵;->ۙ:Ll/ܰ᩷᩵;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    .line 267
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۛۢ᩵;ZI)Ljava/util/ArrayList;
    .locals 11

    .line 272
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 217
    iget-object v1, p0, Ll/۟᩷᩵;->᩸:Ljava/net/InetAddress;

    instance-of v2, v1, Ljava/net/Inet4Address;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 218
    new-instance v2, Ll/ۚ᩷᩵;

    .line 134
    iget-object v5, p0, Ll/۟᩷᩵;->᩶:Ljava/lang/String;

    .line 218
    sget-object v7, Ll/ۛۢ᩵;->ۤ:Ll/ۛۢ᩵;

    .line 138
    iget-object v10, p0, Ll/۟᩷᩵;->᩸:Ljava/net/InetAddress;

    .line 206
    sget-object v6, Ll/ۨۢ᩵;->ۙ:Ll/ۨۢ᩵;

    move-object v4, v2

    move v8, p2

    move v9, p3

    invoke-direct/range {v4 .. v10}, Ll/᩵᩷᩵;-><init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;ZILjava/net/InetAddress;)V

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_1

    .line 274
    invoke-virtual {v2, p1}, Ll/ܰۜ᩵;->֫(Ll/ۛۢ᩵;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 275
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    :cond_1
    instance-of v1, v1, Ljava/net/Inet6Address;

    if-eqz v1, :cond_2

    .line 225
    new-instance v3, Ll/֨᩷᩵;

    .line 134
    iget-object v5, p0, Ll/۟᩷᩵;->᩶:Ljava/lang/String;

    .line 225
    sget-object v7, Ll/ۛۢ᩵;->ۤ:Ll/ۛۢ᩵;

    .line 138
    iget-object v10, p0, Ll/۟᩷᩵;->᩸:Ljava/net/InetAddress;

    .line 248
    sget-object v6, Ll/ۨۢ᩵;->۬:Ll/ۨۢ᩵;

    move-object v4, v3

    move v8, p2

    move v9, p3

    invoke-direct/range {v4 .. v10}, Ll/᩵᩷᩵;-><init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;ZILjava/net/InetAddress;)V

    :cond_2
    if-eqz v3, :cond_3

    .line 278
    invoke-virtual {v3, p1}, Ll/ܰۜ᩵;->֫(Ll/ۛۢ᩵;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 279
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    return-object v0
.end method

.method public final ֫(Ll/ۨۢ᩵;I)Ll/۠᩷᩵;
    .locals 7

    .line 231
    sget-object v0, Ll/᩺᩷᩵;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const/4 v4, 0x0

    iget-object v1, p0, Ll/۟᩷᩵;->᩸:Ljava/net/InetAddress;

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 250
    :cond_0
    instance-of p1, v1, Ljava/net/Inet6Address;

    if-eqz p1, :cond_2

    .line 251
    new-instance p1, Ll/۠᩷᩵;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".ip6.arpa."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ll/ۛۢ᩵;->ۤ:Ll/ۛۢ᩵;

    .line 134
    iget-object v6, p0, Ll/۟᩷᩵;->᩶:Ljava/lang/String;

    move-object v1, p1

    move v5, p2

    .line 251
    invoke-direct/range {v1 .. v6}, Ll/۠᩷᩵;-><init>(Ljava/lang/String;Ll/ۛۢ᩵;ZILjava/lang/String;)V

    return-object p1

    .line 243
    :cond_1
    instance-of p1, v1, Ljava/net/Inet4Address;

    if-eqz p1, :cond_2

    .line 244
    new-instance p1, Ll/۠᩷᩵;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".in-addr.arpa."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ll/ۛۢ᩵;->ۤ:Ll/ۛۢ᩵;

    .line 134
    iget-object v6, p0, Ll/۟᩷᩵;->᩶:Ljava/lang/String;

    move-object v1, p1

    move v5, p2

    .line 244
    invoke-direct/range {v1 .. v6}, Ll/۠᩷᩵;-><init>(Ljava/lang/String;Ll/ۛۢ᩵;ZILjava/lang/String;)V

    return-object p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ۨۢ᩵;ZI)Ll/᩵᩷᩵;
    .locals 10

    .line 205
    sget-object v0, Ll/᩺᩷᩵;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    iget-object v1, p0, Ll/۟᩷᩵;->᩸:Ljava/net/InetAddress;

    const/4 v2, 0x0

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    return-object v2

    .line 224
    :cond_0
    instance-of p1, v1, Ljava/net/Inet6Address;

    if-eqz p1, :cond_1

    .line 225
    new-instance p1, Ll/֨᩷᩵;

    .line 134
    iget-object v4, p0, Ll/۟᩷᩵;->᩶:Ljava/lang/String;

    .line 225
    sget-object v6, Ll/ۛۢ᩵;->ۤ:Ll/ۛۢ᩵;

    .line 138
    iget-object v9, p0, Ll/۟᩷᩵;->᩸:Ljava/net/InetAddress;

    .line 248
    sget-object v5, Ll/ۨۢ᩵;->۬:Ll/ۨۢ᩵;

    move-object v3, p1

    move v7, p2

    move v8, p3

    invoke-direct/range {v3 .. v9}, Ll/᩵᩷᩵;-><init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;ZILjava/net/InetAddress;)V

    return-object p1

    :cond_1
    return-object v2

    .line 217
    :cond_2
    instance-of p1, v1, Ljava/net/Inet4Address;

    if-eqz p1, :cond_3

    .line 218
    new-instance p1, Ll/ۚ᩷᩵;

    .line 134
    iget-object v4, p0, Ll/۟᩷᩵;->᩶:Ljava/lang/String;

    .line 218
    sget-object v6, Ll/ۛۢ᩵;->ۤ:Ll/ۛۢ᩵;

    .line 138
    iget-object v9, p0, Ll/۟᩷᩵;->᩸:Ljava/net/InetAddress;

    .line 206
    sget-object v5, Ll/ۨۢ᩵;->ۙ:Ll/ۨۢ᩵;

    move-object v3, p1

    move v7, p2

    move v8, p3

    invoke-direct/range {v3 .. v9}, Ll/᩵᩷᩵;-><init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;ZILjava/net/InetAddress;)V

    return-object p1

    :cond_3
    return-object v2
.end method

.method public final ֫(Ll/֫ۡ᩵;)V
    .locals 1

    .line 297
    iget-object v0, p0, Ll/۟᩷᩵;->ۙ:Ll/ܰ᩷᩵;

    invoke-virtual {v0, p1}, Ll/ۙ᩷᩵;->֫(Ll/֫ۡ᩵;)V

    return-void
.end method

.method public final ֫(Ll/᩷ۡ᩵;)V
    .locals 1

    .line 305
    iget-object v0, p0, Ll/۟᩷᩵;->ۙ:Ll/ܰ᩷᩵;

    invoke-virtual {v0, p1}, Ll/ۙ᩷᩵;->֫(Ll/᩷ۡ᩵;)V

    return-void
.end method

.method public final ֫(Ll/᩷ۡ᩵;Ll/۟ۢ᩵;)V
    .locals 1

    .line 321
    iget-object v0, p0, Ll/۟᩷᩵;->ۙ:Ll/ܰ᩷᩵;

    invoke-virtual {v0, p1, p2}, Ll/ۙ᩷᩵;->֫(Ll/᩷ۡ᩵;Ll/۟ۢ᩵;)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 337
    iget-object v0, p0, Ll/۟᩷᩵;->ۙ:Ll/ܰ᩷᩵;

    invoke-virtual {v0}, Ll/ۙ᩷᩵;->֫()Z

    move-result v0

    return v0
.end method

.method public final ֫(Ll/᩵᩷᩵;)Z
    .locals 3

    .line 160
    invoke-virtual {p1}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object v0

    invoke-virtual {p1}, Ll/ܰۜ᩵;->᩷()Z

    move-result v1

    sget v2, Ll/۬ۢ᩵;->ۧ:I

    invoke-virtual {p0, v0, v1, v2}, Ll/۟᩷᩵;->֫(Ll/ۨۢ᩵;ZI)Ll/᩵᩷᩵;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 78
    invoke-virtual {v0}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object v1

    invoke-virtual {p1}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object v2

    if-ne v1, v2, :cond_0

    .line 320
    invoke-virtual {v0}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 162
    invoke-virtual {v0, p1}, Ll/᩵᩷᩵;->ܽ(Ll/᩹᩷᩵;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۜ()Z
    .locals 1

    .line 401
    iget-object v0, p0, Ll/۟᩷᩵;->ۙ:Ll/ܰ᩷᩵;

    .line 356
    iget-object v0, v0, Ll/ۙ᩷᩵;->ۙ:Ll/۟ۢ᩵;

    invoke-virtual {v0}, Ll/۟ۢ᩵;->ۡ()Z

    move-result v0

    return v0
.end method

.method public final ۡ()V
    .locals 1

    .line 313
    iget-object v0, p0, Ll/۟᩷᩵;->ۙ:Ll/ܰ᩷᩵;

    invoke-virtual {v0}, Ll/ۙ᩷᩵;->ܽ()V

    return-void
.end method

.method public final ۢ()Z
    .locals 2

    .line 301
    iget-object v0, p0, Ll/۟᩷᩵;->ۙ:Ll/ܰ᩷᩵;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 303
    :try_start_0
    sget-object v1, Ll/۟ۢ᩵;->۟:Ll/۟ۢ᩵;

    invoke-virtual {v0, v1}, Ll/ۙ᩷᩵;->֫(Ll/۟ۢ᩵;)V

    const/4 v1, 0x0

    .line 304
    invoke-virtual {v0, v1}, Ll/ۙ᩷᩵;->ۧ(Ll/᩷ۡ᩵;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 306
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 307
    throw v1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Ll/۟᩷᩵;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(Ll/᩷ۡ᩵;Ll/۟ۢ᩵;)Z
    .locals 2

    .line 329
    iget-object v0, p0, Ll/۟᩷᩵;->ۙ:Ll/ܰ᩷᩵;

    .line 180
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 182
    :try_start_0
    iget-object v1, v0, Ll/ۙ᩷᩵;->ۗ:Ll/֫ۡ᩵;

    if-ne v1, p1, :cond_0

    iget-object p1, v0, Ll/ۙ᩷᩵;->ۙ:Ll/۟ۢ᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 184
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 185
    throw p1
.end method

.method public final ܳ()Z
    .locals 1

    .line 385
    iget-object v0, p0, Ll/۟᩷᩵;->ۙ:Ll/ܰ᩷᩵;

    .line 340
    iget-object v0, v0, Ll/ۙ᩷᩵;->ۙ:Ll/۟ۢ᩵;

    invoke-virtual {v0}, Ll/۟ۢ᩵;->᩷()Z

    move-result v0

    return v0
.end method

.method public final ܺ()Z
    .locals 1

    .line 425
    iget-object v0, p0, Ll/۟᩷᩵;->᩸:Ljava/net/InetAddress;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 429
    :cond_0
    iget-object v0, p0, Ll/۟᩷᩵;->ۙ:Ll/ܰ᩷᩵;

    invoke-virtual {v0}, Ll/ۙ᩷᩵;->ᩳ()Z

    move-result v0

    return v0
.end method

.method public final declared-synchronized ܽ()V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 168
    :try_start_0
    invoke-static {}, Ll/᩵ۢ᩵;->֫()Ll/֨ۢ᩵;

    move-result-object v1

    iget-object v2, p0, Ll/۟᩷᩵;->᩶:Ljava/lang/String;

    sget-object v3, Ll/֡ۢ᩵;->᩹:Ll/֡ۢ᩵;

    check-cast v1, Ll/ۚۢ᩵;

    invoke-virtual {v1, v2, v3}, Ll/ۚۢ᩵;->֫(Ljava/lang/String;Ll/֡ۢ᩵;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/۟᩷᩵;->᩶:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ܿ()Z
    .locals 1

    .line 393
    iget-object v0, p0, Ll/۟᩷᩵;->ۙ:Ll/ܰ᩷᩵;

    .line 348
    iget-object v0, v0, Ll/ۙ᩷᩵;->ۙ:Ll/۟ۢ᩵;

    invoke-virtual {v0}, Ll/۟ۢ᩵;->᩻()Z

    move-result v0

    return v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 377
    iget-object v0, p0, Ll/۟᩷᩵;->ۙ:Ll/ܰ᩷᩵;

    .line 332
    iget-object v0, v0, Ll/ۙ᩷᩵;->ۙ:Ll/۟ۢ᩵;

    invoke-virtual {v0}, Ll/۟ۢ᩵;->ۧ()Z

    move-result v0

    return v0
.end method

.method public final ᩷()Z
    .locals 1

    .line 361
    iget-object v0, p0, Ll/۟᩷᩵;->ۙ:Ll/ܰ᩷᩵;

    .line 316
    iget-object v0, v0, Ll/ۙ᩷᩵;->ۙ:Ll/۟ۢ᩵;

    invoke-virtual {v0}, Ll/۟ۢ᩵;->ܺ()Z

    move-result v0

    return v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 409
    iget-object v0, p0, Ll/۟᩷᩵;->ۙ:Ll/ܰ᩷᩵;

    .line 364
    iget-object v0, v0, Ll/ۙ᩷᩵;->ۙ:Ll/۟ۢ᩵;

    invoke-virtual {v0}, Ll/۟ۢ᩵;->ۢ()Z

    move-result v0

    return v0
.end method
