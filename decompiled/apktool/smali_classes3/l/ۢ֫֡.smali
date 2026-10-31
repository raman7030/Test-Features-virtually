.class public final Ll/ۢ֫֡;
.super Ljava/lang/Object;
.source "F4DQ"


# instance fields
.field public final ֫:Ll/ۙ᩺᩵;

.field public final ۜ:Ll/ۡ᩵֡;

.field public final ۧ:Ll/ܽܰ᩵;

.field public final ܳ:Ljava/util/ArrayList;

.field public final ܽ:Ll/᩶ܰ᩵;

.field public ܿ:I

.field public ᩳ:Ljava/util/List;

.field public ᩻:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/ۙ᩺᩵;Ll/ۡ᩵֡;Ll/ܽܰ᩵;Ll/᩶ܰ᩵;)V
    .locals 1

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ۢ֫֡;->᩻:Ljava/util/List;

    .line 51
    iput-object v0, p0, Ll/ۢ֫֡;->ᩳ:Ljava/util/List;

    .line 54
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۢ֫֡;->ܳ:Ljava/util/ArrayList;

    .line 58
    iput-object p1, p0, Ll/ۢ֫֡;->֫:Ll/ۙ᩺᩵;

    .line 59
    iput-object p2, p0, Ll/ۢ֫֡;->ۜ:Ll/ۡ᩵֡;

    .line 60
    iput-object p3, p0, Ll/ۢ֫֡;->ۧ:Ll/ܽܰ᩵;

    .line 61
    iput-object p4, p0, Ll/ۢ֫֡;->ܽ:Ll/᩶ܰ᩵;

    .line 63
    invoke-virtual {p1}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object p2

    invoke-virtual {p1}, Ll/ۙ᩺᩵;->ܳ()Ljava/net/Proxy;

    move-result-object p3

    const/4 p4, 0x0

    if-eqz p3, :cond_0

    .line 126
    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۢ֫֡;->᩻:Ljava/util/List;

    goto :goto_1

    .line 129
    :cond_0
    invoke-virtual {p1}, Ll/ۙ᩺᩵;->ۜ()Ljava/net/ProxySelector;

    move-result-object p1

    invoke-virtual {p2}, Ll/ۨܰ᩵;->ۘ()Ljava/net/URI;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/net/ProxySelector;->select(Ljava/net/URI;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 130
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    .line 131
    invoke-static {p1}, Ll/᩶۟᩵;->֫(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    new-array p1, p1, [Ljava/net/Proxy;

    .line 132
    sget-object p2, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    aput-object p2, p1, p4

    invoke-static {p1}, Ll/᩶۟᩵;->֫([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ll/ۢ֫֡;->᩻:Ljava/util/List;

    .line 134
    :goto_1
    iput p4, p0, Ll/ۢ֫֡;->ܿ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚ۟᩵;Ljava/io/IOException;)V
    .locals 3

    .line 113
    invoke-virtual {p1}, Ll/ۚ۟᩵;->ۧ()Ljava/net/Proxy;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Ll/ۢ֫֡;->֫:Ll/ۙ᩺᩵;

    invoke-virtual {v0}, Ll/ۙ᩺᩵;->ۜ()Ljava/net/ProxySelector;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 115
    invoke-virtual {v0}, Ll/ۙ᩺᩵;->ۜ()Ljava/net/ProxySelector;

    move-result-object v1

    .line 116
    invoke-virtual {v0}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨܰ᩵;->ۘ()Ljava/net/URI;

    move-result-object v0

    invoke-virtual {p1}, Ll/ۚ۟᩵;->ۧ()Ljava/net/Proxy;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v2

    .line 115
    invoke-virtual {v1, v0, v2, p2}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    .line 119
    :cond_0
    iget-object p2, p0, Ll/ۢ֫֡;->ۜ:Ll/ۡ᩵֡;

    invoke-virtual {p2, p1}, Ll/ۡ᩵֡;->ۧ(Ll/ۚ۟᩵;)V

    return-void
.end method

.method public final ֫()Z
    .locals 2

    .line 139
    iget v0, p0, Ll/ۢ֫֡;->ܿ:I

    iget-object v1, p0, Ll/ۢ֫֡;->᩻:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 70
    :cond_0
    iget-object v0, p0, Ll/ۢ֫֡;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()Ll/᩷֫֡;
    .locals 12

    .line 74
    invoke-virtual {p0}, Ll/ۢ֫֡;->֫()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 79
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 139
    :cond_0
    iget v1, p0, Ll/ۢ֫֡;->ܿ:I

    iget-object v2, p0, Ll/ۢ֫֡;->᩻:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iget-object v3, p0, Ll/ۢ֫֡;->ܳ:Ljava/util/ArrayList;

    if-ge v1, v2, :cond_c

    iget v1, p0, Ll/ۢ֫֡;->ܿ:I

    iget-object v2, p0, Ll/ۢ֫֡;->᩻:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iget-object v4, p0, Ll/ۢ֫֡;->֫:Ll/ۙ᩺᩵;

    const-string v5, "No route to "

    if-ge v1, v2, :cond_b

    .line 148
    iget v1, p0, Ll/ۢ֫֡;->ܿ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۢ֫֡;->ܿ:I

    iget-object v2, p0, Ll/ۢ֫֡;->᩻:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/net/Proxy;

    .line 156
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Ll/ۢ֫֡;->ᩳ:Ljava/util/List;

    .line 160
    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    sget-object v6, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v2, v6, :cond_4

    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    sget-object v6, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    if-ne v2, v6, :cond_1

    goto :goto_1

    .line 164
    :cond_1
    invoke-virtual {v1}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v2

    .line 165
    instance-of v6, v2, Ljava/net/InetSocketAddress;

    if-eqz v6, :cond_3

    .line 169
    check-cast v2, Ljava/net/InetSocketAddress;

    .line 205
    invoke-virtual {v2}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v6

    if-nez v6, :cond_2

    .line 210
    invoke-virtual {v2}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 214
    :cond_2
    invoke-virtual {v6}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v6

    .line 171
    :goto_0
    invoke-virtual {v2}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v2

    goto :goto_2

    .line 166
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Proxy.address() is not an InetSocketAddress: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 161
    :cond_4
    :goto_1
    invoke-virtual {v4}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object v6

    .line 162
    invoke-virtual {v4}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۨܰ᩵;->ۢ()I

    move-result v2

    :goto_2
    const/4 v7, 0x1

    if-lt v2, v7, :cond_a

    const v7, 0xffff

    if-gt v2, v7, :cond_a

    .line 179
    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v5

    sget-object v7, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    const/4 v8, 0x0

    if-ne v5, v7, :cond_5

    .line 180
    iget-object v5, p0, Ll/ۢ֫֡;->ᩳ:Ljava/util/List;

    invoke-static {v6, v2}, Ljava/net/InetSocketAddress;->createUnresolved(Ljava/lang/String;I)Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 182
    :cond_5
    iget-object v5, p0, Ll/ۢ֫֡;->ܽ:Ll/᩶ܰ᩵;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    invoke-virtual {v4}, Ll/ۙ᩺᩵;->ܽ()Ll/۠ܰ᩵;

    move-result-object v5

    invoke-interface {v5, v6}, Ll/۠ܰ᩵;->֫(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 186
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_9

    .line 192
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_3
    if-ge v7, v6, :cond_6

    .line 193
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/net/InetAddress;

    .line 194
    iget-object v10, p0, Ll/ۢ֫֡;->ᩳ:Ljava/util/List;

    new-instance v11, Ljava/net/InetSocketAddress;

    invoke-direct {v11, v9, v2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 85
    :cond_6
    :goto_4
    iget-object v2, p0, Ll/ۢ֫֡;->ᩳ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    :goto_5
    if-ge v8, v2, :cond_8

    .line 86
    new-instance v5, Ll/ۚ۟᩵;

    iget-object v6, p0, Ll/ۢ֫֡;->ᩳ:Ljava/util/List;

    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/net/InetSocketAddress;

    invoke-direct {v5, v4, v1, v6}, Ll/ۚ۟᩵;-><init>(Ll/ۙ᩺᩵;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V

    .line 87
    iget-object v6, p0, Ll/ۢ֫֡;->ۜ:Ll/ۡ᩵֡;

    invoke-virtual {v6, v5}, Ll/ۡ᩵֡;->ܽ(Ll/ۚ۟᩵;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 88
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 90
    :cond_7
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    .line 94
    :cond_8
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_7

    .line 187
    :cond_9
    new-instance v0, Ljava/net/UnknownHostException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ll/ۙ᩺᩵;->ܽ()Ll/۠ܰ᩵;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " returned no addresses for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 175
    :cond_a
    new-instance v0, Ljava/net/SocketException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ":"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "; port is out of range"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 145
    :cond_b
    new-instance v0, Ljava/net/SocketException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "; exhausted proxy configurations: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۢ֫֡;->᩻:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 99
    :cond_c
    :goto_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_d

    .line 101
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 102
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 105
    :cond_d
    new-instance v1, Ll/᩷֫֡;

    invoke-direct {v1, v0}, Ll/᩷֫֡;-><init>(Ljava/util/ArrayList;)V

    return-object v1

    .line 75
    :cond_e
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
