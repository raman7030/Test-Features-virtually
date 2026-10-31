.class public final Ll/᩹ۘۢ;
.super Ljava/lang/Object;
.source "2AKO"


# instance fields
.field public ֫:Ljava/net/InetAddress;

.field public ۧ:I

.field public ܽ:Ljava/net/ServerSocket;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Ll/᩹ۘۢ;->ܽ:Ljava/net/ServerSocket;

    .line 19
    invoke-direct {p0}, Ll/᩹ۘۢ;->ᩳ()V

    return-void
.end method

.method private ᩳ()V
    .locals 1

    .line 27
    iget-object v0, p0, Ll/᩹ۘۢ;->ܽ:Ljava/net/ServerSocket;

    if-eqz v0, :cond_0

    .line 29
    :try_start_0
    invoke-virtual {v0}, Ljava/net/ServerSocket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    .line 33
    iput-object v0, p0, Ll/᩹ۘۢ;->ܽ:Ljava/net/ServerSocket;

    .line 34
    iput-object v0, p0, Ll/᩹ۘۢ;->֫:Ljava/net/InetAddress;

    const/4 v0, 0x0

    .line 35
    iput v0, p0, Ll/᩹ۘۢ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 0

    .line 113
    invoke-direct {p0}, Ll/᩹ۘۢ;->ᩳ()V

    return-void
.end method

.method public final ֫(Ljava/net/InetAddress;I)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ll/᩹ۘۢ;->ᩳ()V

    .line 53
    iput-object p1, p0, Ll/᩹ۘۢ;->֫:Ljava/net/InetAddress;

    .line 54
    iput p2, p0, Ll/᩹ۘۢ;->ۧ:I

    return-void
.end method

.method public final ۧ()I
    .locals 3

    .line 39
    invoke-direct {p0}, Ll/᩹ۘۢ;->ᩳ()V

    const/4 v0, 0x0

    .line 42
    :try_start_0
    new-instance v1, Ljava/net/ServerSocket;

    const/4 v2, 0x5

    invoke-direct {v1, v0, v2}, Ljava/net/ServerSocket;-><init>(II)V

    iput-object v1, p0, Ll/᩹ۘۢ;->ܽ:Ljava/net/ServerSocket;

    const/16 v2, 0x7530

    .line 43
    invoke-virtual {v1, v2}, Ljava/net/ServerSocket;->setSoTimeout(I)V

    .line 44
    iget-object v1, p0, Ll/᩹ۘۢ;->ܽ:Ljava/net/ServerSocket;

    invoke-virtual {v1}, Ljava/net/ServerSocket;->getLocalPort()I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    .line 46
    :catch_0
    invoke-direct {p0}, Ll/᩹ۘۢ;->ᩳ()V

    return v0
.end method

.method public final ܽ()Ljava/net/Socket;
    .locals 4

    .line 59
    iget-object v0, p0, Ll/᩹ۘۢ;->ܽ:Ljava/net/ServerSocket;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    .line 61
    iget-object v0, p0, Ll/᩹ۘۢ;->֫:Ljava/net/InetAddress;

    if-eqz v0, :cond_1

    iget v0, p0, Ll/᩹ۘۢ;->ۧ:I

    if-nez v0, :cond_0

    goto :goto_0

    .line 67
    :cond_0
    :try_start_0
    new-instance v0, Ljava/net/Socket;

    iget-object v2, p0, Ll/᩹ۘۢ;->֫:Ljava/net/InetAddress;

    iget v3, p0, Ll/᩹ۘۢ;->ۧ:I

    invoke-direct {v0, v2, v3}, Ljava/net/Socket;-><init>(Ljava/net/InetAddress;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    const/16 v2, 0x7530

    .line 75
    :try_start_1
    invoke-virtual {v0, v2}, Ljava/net/Socket;->setSoTimeout(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    .line 77
    :catch_0
    invoke-direct {p0}, Ll/᩹ۘۢ;->ᩳ()V

    return-object v1

    .line 69
    :catch_1
    invoke-direct {p0}, Ll/᩹ۘۢ;->ᩳ()V

    return-object v1

    .line 62
    :cond_1
    :goto_0
    invoke-direct {p0}, Ll/᩹ۘۢ;->ᩳ()V

    return-object v1

    .line 86
    :cond_2
    :try_start_2
    invoke-virtual {v0}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;

    move-result-object v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 90
    :catch_2
    invoke-direct {p0}, Ll/᩹ۘۢ;->ᩳ()V

    return-object v1
.end method
