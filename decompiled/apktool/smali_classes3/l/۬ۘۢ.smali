.class public final Ll/۬ۘۢ;
.super Ljava/lang/Object;
.source "67UI"


# static fields
.field public static final ֫:[I

.field public static final ۧ:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [I

    .line 27
    fill-array-data v0, :array_0

    sput-object v0, Ll/۬ۘۢ;->ۧ:[I

    const/4 v0, 0x1

    const/4 v1, 0x2

    const/4 v2, 0x3

    .line 36
    filled-new-array {v0, v1, v2}, [I

    move-result-object v0

    sput-object v0, Ll/۬ۘۢ;->֫:[I

    return-void

    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
    .end array-data
.end method

.method public static ֫()Ljava/lang/String;
    .locals 7

    .line 46
    invoke-static {}, Ll/۬ۘۢ;->ۧ()Ljava/net/Inet4Address;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 48
    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 370
    :cond_0
    :try_start_0
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 371
    invoke-static {v0}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_0

    :cond_1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 323
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/net/NetworkInterface;

    .line 324
    invoke-virtual {v1}, Ljava/net/NetworkInterface;->getName()Ljava/lang/String;

    move-result-object v2

    .line 325
    invoke-virtual {v1}, Ljava/net/NetworkInterface;->isUp()Z

    move-result v3

    .line 326
    invoke-virtual {v1}, Ljava/net/NetworkInterface;->getHardwareAddress()[B

    move-result-object v4

    .line 328
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    if-eqz v4, :cond_3

    .line 330
    array-length v4, v4

    if-lez v4, :cond_3

    const/4 v4, 0x1

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    .line 328
    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "NetworkInterface Name: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", IsUp: "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", HasHardwareAddress: "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/᩶ۘܽ;->ܽ(Ljava/lang/String;)V

    .line 333
    invoke-virtual {v1}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/net/InetAddress;

    .line 334
    instance-of v3, v2, Ljava/net/Inet4Address;

    if-eqz v3, :cond_4

    .line 335
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 337
    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v3

    .line 338
    invoke-virtual {v2}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v4

    .line 339
    invoke-virtual {v2}, Ljava/net/InetAddress;->isLinkLocalAddress()Z

    move-result v2

    .line 335
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, ">> NetworkInterface IPv4: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", IsLoopback: "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", IsLinkLocal: "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/᩶ۘܽ;->ܽ(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const-string v1, "NetworkInterface"

    .line 345
    invoke-static {v1, v0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    const/4 v0, 0x0

    return-object v0
.end method

.method public static ֫(IILjava/util/List;)Ljava/net/Inet4Address;
    .locals 12

    .line 85
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_15

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/NetworkInterface;

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 102
    :try_start_0
    invoke-virtual {v0}, Ljava/net/NetworkInterface;->getName()Ljava/lang/String;

    move-result-object v6
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v7, ""

    if-eqz v6, :cond_1

    .line 363
    :try_start_1
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v6, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_1
    move-object v6, v7

    .line 103
    :goto_1
    invoke-virtual {v0}, Ljava/net/NetworkInterface;->getDisplayName()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_2

    .line 363
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v8, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    .line 104
    :cond_2
    invoke-static {v0, v6}, Ll/۬ۘۢ;->֫(Ljava/net/NetworkInterface;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    goto/16 :goto_7

    :cond_3
    const-string v8, "wlan"

    .line 183
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_e

    const-string v8, "wlan0"

    .line 184
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_e

    const-string v8, "wifi"

    .line 185
    invoke-virtual {v6, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_e

    const-string v8, "mlan"

    .line 186
    invoke-virtual {v6, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v8, "eth"

    .line 193
    invoke-virtual {v6, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_d

    const-string v8, "en"

    .line 194
    invoke-virtual {v6, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_d

    const-string v8, "lan"

    .line 195
    invoke-virtual {v6, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_5

    goto/16 :goto_5

    .line 113
    :cond_5
    invoke-static {v6}, Ll/۬ۘۢ;->֫(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/4 v5, 0x3

    goto/16 :goto_7

    :cond_6
    const-string v8, "tether"

    const-string v9, "usb"

    const-string v10, "rndis"

    .line 217
    invoke-virtual {v6, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_c

    .line 218
    invoke-virtual {v6, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_c

    const-string v11, "ncm"

    .line 219
    invoke-virtual {v6, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_c

    const-string v11, "ecm"

    .line 220
    invoke-virtual {v6, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_c

    .line 221
    invoke-virtual {v6, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_c

    .line 222
    invoke-virtual {v7, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_c

    .line 223
    invoke-virtual {v7, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_c

    .line 224
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_7

    goto :goto_4

    :cond_7
    const-string v8, "bluetooth"

    const-string v9, "bt-pan"

    .line 231
    invoke-virtual {v6, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_b

    const-string v9, "bnep"

    .line 232
    invoke-virtual {v6, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_b

    .line 233
    invoke-virtual {v6, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_b

    .line 234
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_8

    goto :goto_3

    :cond_8
    const-string v7, "p2p"

    .line 241
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_a

    const-string v7, "wlan-direct"

    .line 242
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_9

    goto :goto_2

    .line 127
    :cond_9
    invoke-virtual {v0}, Ljava/net/NetworkInterface;->getHardwareAddress()[B

    move-result-object v6

    .line 128
    invoke-virtual {v0}, Ljava/net/NetworkInterface;->isVirtual()Z

    move-result v7

    if-nez v7, :cond_f

    if-eqz v6, :cond_f

    array-length v6, v6
    :try_end_1
    .catch Ljava/net/SocketException; {:try_start_1 .. :try_end_1} :catch_0

    if-lez v6, :cond_f

    const/4 v5, 0x7

    goto :goto_7

    :cond_a
    :goto_2
    const/4 v5, 0x6

    goto :goto_7

    :cond_b
    :goto_3
    const/4 v5, 0x5

    goto :goto_7

    :cond_c
    :goto_4
    const/4 v5, 0x4

    goto :goto_7

    :cond_d
    :goto_5
    const/4 v5, 0x2

    goto :goto_7

    :cond_e
    :goto_6
    const/4 v5, 0x1

    goto :goto_7

    :catch_0
    nop

    :cond_f
    :goto_7
    if-eq v5, p0, :cond_10

    goto/16 :goto_0

    .line 249
    :cond_10
    invoke-virtual {v0}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v0

    .line 250
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/net/InetAddress;

    .line 263
    instance-of v6, v5, Ljava/net/Inet4Address;

    if-eqz v6, :cond_11

    .line 264
    invoke-virtual {v5}, Ljava/net/InetAddress;->isAnyLocalAddress()Z

    move-result v6

    if-nez v6, :cond_11

    .line 265
    invoke-virtual {v5}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v6

    if-nez v6, :cond_11

    .line 266
    invoke-virtual {v5}, Ljava/net/InetAddress;->isMulticastAddress()Z

    move-result v6

    if-nez v6, :cond_11

    if-ne p1, v4, :cond_12

    .line 274
    invoke-virtual {v5}, Ljava/net/InetAddress;->isLinkLocalAddress()Z

    move-result v6

    if-nez v6, :cond_11

    invoke-virtual {v5}, Ljava/net/InetAddress;->isSiteLocalAddress()Z

    move-result v6

    if-eqz v6, :cond_11

    goto :goto_8

    :cond_12
    if-ne p1, v3, :cond_13

    .line 277
    invoke-virtual {v5}, Ljava/net/InetAddress;->isLinkLocalAddress()Z

    move-result v6

    if-nez v6, :cond_11

    invoke-virtual {v5}, Ljava/net/InetAddress;->isSiteLocalAddress()Z

    move-result v6

    if-nez v6, :cond_11

    goto :goto_8

    :cond_13
    if-ne p1, v2, :cond_11

    .line 279
    invoke-virtual {v5}, Ljava/net/InetAddress;->isLinkLocalAddress()Z

    move-result v6

    if-eqz v6, :cond_11

    :goto_8
    move-object v1, v5

    :cond_14
    if-eqz v1, :cond_0

    .line 91
    check-cast v1, Ljava/net/Inet4Address;

    :cond_15
    return-object v1
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 1

    .line 202
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "ap"

    .line 203
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "ap\\d+"

    .line 204
    invoke-virtual {p0, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "ap_"

    .line 205
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "softap"

    .line 206
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "hotspot"

    .line 207
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "wlan[1-9]\\d*"

    .line 208
    invoke-virtual {p0, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "swlan"

    .line 209
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sap"

    .line 210
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(Ljava/net/NetworkInterface;Ljava/lang/String;)Z
    .locals 1

    .line 141
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Ljava/net/NetworkInterface;->isUp()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ljava/net/NetworkInterface;->isLoopback()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Ljava/net/NetworkInterface;->isVirtual()Z

    move-result p0

    if-eqz p0, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string p0, "lo"

    .line 144
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "rmnet"

    .line 145
    invoke-virtual {p1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "br"

    .line 146
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "br\\d+"

    .line 147
    invoke-virtual {p1, p0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "br-"

    .line 148
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "br_"

    .line 149
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "ccmni"

    .line 150
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "pdp"

    .line 151
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "wwan"

    .line 152
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "ppp"

    .line 153
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "dummy"

    .line 154
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "ifb"

    .line 155
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "veth"

    .line 156
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "virbr"

    .line 157
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "docker"

    .line 158
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "vbox"

    .line 159
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "vmnet"

    .line 160
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "sit"

    .line 161
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "ip6tnl"

    .line 162
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "gre"

    .line 163
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "gretap"

    .line 164
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "vti"

    .line 165
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "clat"

    .line 166
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "v4-"

    .line 167
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "tun"

    .line 168
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "tap"

    .line 169
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "utun"

    .line 170
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "vpn"

    .line 171
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "wg"

    .line 172
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "ipsec"

    .line 173
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "l2tp"

    .line 174
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "tailscale"

    .line 175
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "zt"

    .line 176
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ()Ljava/net/Inet4Address;
    .locals 7

    .line 370
    :try_start_0
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 371
    invoke-static {v0}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 67
    :goto_0
    sget-object v1, Ll/۬ۘۢ;->֫:[I

    const/4 v2, 0x0

    :goto_1
    const/4 v3, 0x3

    if-ge v2, v3, :cond_3

    aget v3, v1, v2

    .line 68
    sget-object v4, Ll/۬ۘۢ;->ۧ:[I

    const/4 v5, 0x0

    :goto_2
    const/4 v6, 0x7

    if-ge v5, v6, :cond_2

    aget v6, v4, v5

    .line 69
    invoke-static {v6, v3, v0}, Ll/۬ۘۢ;->֫(IILjava/util/List;)Ljava/net/Inet4Address;

    move-result-object v6
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v6, :cond_1

    return-object v6

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :catch_0
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method
