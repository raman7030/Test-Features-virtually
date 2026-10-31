.class public Ll/ܿ۬᩻;
.super Ljava/lang/Object;
.source "K6X0"

# interfaces
.implements Ll/֡ۤۖ;
.implements Ll/۠᩶ۢ;


# direct methods
.method public static ֫()Ljava/util/ArrayList;
    .locals 5

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    :try_start_0
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/net/NetworkInterface;

    .line 27
    invoke-virtual {v2}, Ljava/net/NetworkInterface;->isUp()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/net/NetworkInterface;->isLoopback()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {v2}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/net/InetAddress;

    .line 31
    instance-of v4, v3, Ljava/net/Inet4Address;

    if-eqz v4, :cond_2

    invoke-virtual {v3}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v4

    if-nez v4, :cond_2

    .line 32
    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :cond_3
    return-object v0
.end method

.method public static ֫(I)Ljava/util/ArrayList;
    .locals 5

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 54
    invoke-static {}, Ll/ܿ۬᩻;->֫()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 84
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "http://"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "/mcp"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 55
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ۧ(I)Ljava/lang/String;
    .locals 2

    const-string v0, "http://127.0.0.1:"

    const-string v1, "/mcp"

    .line 0
    invoke-static {p0, v0, v1}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public ֫(Ljava/lang/CharSequence;Ll/ۗ᩶ۢ;Ll/ᩴ᩷ܿ;)V
    .locals 2

    .line 10
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    new-instance v0, Ll/ۢܳۡ;

    invoke-direct {v0}, Ll/ۢܳۡ;-><init>()V

    .line 12
    invoke-virtual {p2}, Ll/ۗ᩶ۢ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 13
    invoke-virtual {v0}, Ll/ۢܳۡ;->ۧ()V

    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p2}, Ll/ۗ᩶ۢ;->֫()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Ll/ۢܳۡ;->֫(Ljava/lang/Integer;)V

    .line 17
    :goto_0
    new-instance p2, Ll/᩷ܳۡ;

    invoke-direct {p2, v0}, Ll/᩷ܳۡ;-><init>(Ll/ۢܳۡ;)V

    invoke-virtual {p2, p1}, Ll/᩷ܳۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-virtual {p3, p1}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    return-void
.end method

.method public ֫(Ll/ᩳ֫֨;)V
    .locals 1

    .line 224
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    return-void

    .line 267
    :pswitch_0
    invoke-virtual {p0, p1}, Ll/ܿ۬᩻;->ۢ(Ll/ᩳ֫֨;)V

    return-void

    .line 258
    :pswitch_1
    invoke-virtual {p0, p1}, Ll/ܿ۬᩻;->ܳ(Ll/ᩳ֫֨;)V

    return-void

    .line 252
    :pswitch_2
    invoke-virtual {p0, p1}, Ll/ܿ۬᩻;->ۧ(Ll/ᩳ֫֨;)V

    return-void

    .line 249
    :pswitch_3
    invoke-virtual {p0, p1}, Ll/ܿ۬᩻;->ᩳ(Ll/ᩳ֫֨;)V

    return-void

    .line 245
    :pswitch_4
    invoke-virtual {p0, p1}, Ll/ܿ۬᩻;->ۜ(Ll/ᩳ֫֨;)V

    return-void

    .line 242
    :pswitch_5
    invoke-virtual {p0, p1}, Ll/ܿ۬᩻;->ܿ(Ll/ᩳ֫֨;)V

    return-void

    .line 239
    :pswitch_6
    invoke-virtual {p0, p1}, Ll/ܿ۬᩻;->ܽ(Ll/ᩳ֫֨;)V

    return-void

    .line 234
    :pswitch_7
    invoke-virtual {p0, p1}, Ll/ܿ۬᩻;->ۡ(Ll/ᩳ֫֨;)V

    return-void

    .line 230
    :pswitch_8
    invoke-virtual {p0, p1}, Ll/ܿ۬᩻;->᩻(Ll/ᩳ֫֨;)V

    return-void

    .line 227
    :pswitch_9
    invoke-virtual {p0, p1}, Ll/ܿ۬᩻;->᩷(Ll/ᩳ֫֨;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public ۜ(Ll/ᩳ֫֨;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ۡ(Ll/ᩳ֫֨;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ۢ(Ll/ᩳ֫֨;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ۧ(Ll/ᩳ֫֨;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ܳ(Ll/ᩳ֫֨;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ܽ(Ll/ᩳ֫֨;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ܿ(Ll/ᩳ֫֨;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ᩳ(Ll/ᩳ֫֨;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ᩷(Ll/ᩳ֫֨;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ᩻(Ll/ᩳ֫֨;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method
