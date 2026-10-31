.class public Ll/ᩳۘۢ;
.super Ll/᩸ۘۢ;
.source "T596"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩶ۘۢ;Ljava/lang/String;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1}, Ll/᩸ۘۢ;-><init>(Ll/᩶ۘۢ;)V

    .line 11
    iput-object p2, p0, Ll/ᩳۘۢ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 19
    iget-object v0, p0, Ll/ᩳۘۢ;->᩶:Ljava/lang/String;

    invoke-static {v0}, Ll/᩸ۘۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "|"

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    iget-object v2, p0, Ll/᩸ۘۢ;->᩸:Ll/᩶ۘۢ;

    if-eqz v1, :cond_0

    const-string v1, "::"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "550 No IPv6 support, reconfigure your client\r\n"

    goto/16 :goto_3

    :cond_0
    const-string v1, ","

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 25
    array-length v1, v0

    const/4 v3, 0x6

    if-eq v1, v3, :cond_1

    const-string v0, "550 Malformed PORT argument\r\n"

    goto/16 :goto_3

    :cond_1
    new-array v1, v3, [I

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 30
    :goto_0
    array-length v5, v0

    if-ge v4, v5, :cond_5

    .line 31
    aget-object v5, v0, v4

    const-string v6, "[0-9]+"

    .line 33
    invoke-virtual {v5, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v6

    const-string v7, "\r\n"

    const-string v8, "550 Invalid PORT argument: "

    if-eqz v6, :cond_4

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v9, 0x3

    if-le v6, v9, :cond_2

    goto :goto_1

    .line 37
    :cond_2
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    aput v6, v1, v4

    const/16 v9, 0xff

    if-le v6, v9, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 0
    :cond_4
    :goto_1
    invoke-static {v8, v5, v7}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_5
    const/4 v0, 0x4

    new-array v4, v0, [B

    :goto_2
    if-ge v3, v0, :cond_6

    .line 45
    aget v5, v1, v3

    int-to-byte v5, v5

    aput-byte v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 49
    :cond_6
    :try_start_0
    invoke-static {v4}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object v3
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    invoke-virtual {v2}, Ll/᩶ۘۢ;->ۜ()Ljava/net/Socket;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v4

    if-eqz v4, :cond_7

    .line 55
    invoke-virtual {v3, v4}, Ljava/net/InetAddress;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    const-string v0, "550 PORT host must match control connection\r\n"

    goto :goto_3

    .line 59
    :cond_7
    aget v0, v1, v0

    mul-int/lit16 v0, v0, 0x100

    const/4 v4, 0x5

    aget v1, v1, v4

    add-int/2addr v0, v1

    if-nez v0, :cond_8

    const-string v0, "550 Invalid PORT argument: port 0\r\n"

    goto :goto_3

    .line 64
    :cond_8
    invoke-virtual {v2, v3, v0}, Ll/᩶ۘۢ;->֫(Ljava/net/InetAddress;I)V

    const/4 v0, 0x0

    goto :goto_3

    :catch_0
    const-string v0, "550 Unknown host\r\n"

    :goto_3
    if-nez v0, :cond_9

    const-string v0, "200 PORT OK\r\n"

    .line 67
    invoke-virtual {v2, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    goto :goto_4

    .line 69
    :cond_9
    invoke-virtual {v2, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    :goto_4
    return-void
.end method
