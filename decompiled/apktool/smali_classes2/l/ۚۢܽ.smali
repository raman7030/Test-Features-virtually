.class public final Ll/ۚۢܽ;
.super Ljava/lang/Thread;
.source "T5RH"


# instance fields
.field public final synthetic ᩸:Ll/᩶ۢܽ;


# direct methods
.method public constructor <init>(Ll/᩶ۢܽ;)V
    .locals 0

    .line 140
    iput-object p1, p0, Ll/ۚۢܽ;->᩸:Ll/᩶ۢܽ;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    const-string v0, ""

    .line 143
    iget-object v1, p0, Ll/ۚۢܽ;->᩸:Ll/᩶ۢܽ;

    iget-object v2, v1, Ll/᩶ۢܽ;->֫:Ll/ܺܺܽ;

    invoke-virtual {v2}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨ᩷ܽ;

    invoke-virtual {v2}, Ll/ۨ᩷ܽ;->ܺ()Ljava/lang/String;

    move-result-object v2

    .line 146
    :try_start_0
    new-instance v3, Ljava/net/URL;

    iget-object v4, v1, Ll/᩶ۢܽ;->֫:Ll/ܺܺܽ;

    invoke-virtual {v4}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۨ᩷ܽ;

    invoke-virtual {v4}, Ll/ۨ᩷ܽ;->ܺ()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 147
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v3

    check-cast v3, Ljava/net/HttpURLConnection;

    const-string v4, "accept"

    const-string v5, "*/*"

    .line 148
    invoke-virtual {v3, v4, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "connection"

    const-string v5, "Keep-Alive"

    .line 149
    invoke-virtual {v3, v4, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "user-agent"

    const-string v5, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) Chrome/46.0.2486.0"

    .line 150
    invoke-virtual {v3, v4, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v4, 0x1388

    .line 151
    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 152
    invoke-virtual {v3, v4}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 153
    invoke-virtual {v3}, Ljava/net/URLConnection;->connect()V

    .line 154
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v4

    const/16 v5, 0xc8

    if-ne v4, v5, :cond_1

    .line 156
    invoke-virtual {v3}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    .line 157
    new-instance v5, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v4}, Ljava/io/InputStream;->available()I

    move-result v6

    mul-int/lit8 v6, v6, 0x2

    invoke-direct {v5, v6}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    const/16 v6, 0x400

    new-array v6, v6, [B

    .line 160
    :goto_0
    invoke-virtual {v4, v6}, Ljava/io/InputStream;->read([B)I

    move-result v7

    if-lez v7, :cond_0

    const/4 v8, 0x0

    .line 161
    invoke-virtual {v5, v6, v8, v7}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 162
    :cond_0
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    .line 163
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v4

    .line 164
    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, v4, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object v5, v0

    .line 168
    :goto_1
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v5

    .line 172
    :catch_0
    invoke-virtual {v1, v0}, Ll/᩶ۢܽ;->֫(Ljava/lang/String;)V

    return-void
.end method
