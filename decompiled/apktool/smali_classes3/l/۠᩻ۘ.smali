.class public Ll/۠᩻ۘ;
.super Ll/᩵᩻ۘ;
.source "R7W4"


# static fields
.field public static final ᩶:[B


# instance fields
.field public ۠:Ljava/lang/String;

.field public ܶ:Ljava/lang/String;

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 36
    sget-object v0, Ll/᩵ۡۘ;->ܽ:[B

    .line 397
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "direct-tcpip"

    invoke-static {v1, v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 36
    sput-object v0, Ll/۠᩻ۘ;->᩶:[B

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Ll/᩵᩻ۘ;-><init>()V

    const-string v0, "127.0.0.1"

    .line 40
    iput-object v0, p0, Ll/۠᩻ۘ;->ܶ:Ljava/lang/String;

    const/4 v0, 0x0

    .line 41
    iput v0, p0, Ll/۠᩻ۘ;->᩸:I

    .line 45
    sget-object v0, Ll/۠᩻ۘ;->᩶:[B

    iput-object v0, p0, Ll/᩵᩻ۘ;->ۚ:[B

    const/high16 v0, 0x20000

    .line 46
    iput v0, p0, Ll/᩵᩻ۘ;->᩷:I

    .line 47
    iput v0, p0, Ll/᩵᩻ۘ;->ۜ:I

    const/16 v0, 0x4000

    .line 48
    iput v0, p0, Ll/᩵᩻ۘ;->᩻:I

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 3

    const-string p1, "DirectTCPIP thread "

    const/4 v0, 0x0

    .line 58
    iput v0, p0, Ll/᩵᩻ۘ;->ۧ:I

    .line 60
    :try_start_0
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v0

    .line 61
    invoke-virtual {v0}, Ll/۟ۢۘ;->ۢ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 65
    iget-object v1, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    iget-object v1, v1, Ll/᩵᩷ۘ;->֫:Ljava/io/InputStream;

    if-eqz v1, :cond_0

    .line 66
    invoke-virtual {v0}, Ll/۟ۢۘ;->᩻()Ll/ۛۢۘ;

    move-result-object v1

    new-instance v2, Ll/֨᩻ۘ;

    invoke-direct {v2, p0}, Ll/֨᩻ۘ;-><init>(Ll/۠᩻ۘ;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/lang/Thread;

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v1, p0, Ll/᩵᩻ۘ;->֡:Ljava/lang/Thread;

    .line 67
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3085
    iget-object p1, v0, Ll/۟ۢۘ;->ۨ:Ljava/lang/String;

    .line 67
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 71
    iget-object p1, p0, Ll/᩵᩻ۘ;->֡:Ljava/lang/Thread;

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void

    .line 73
    :cond_0
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ܺ()V

    return-void

    .line 62
    :cond_1
    new-instance p1, Ll/۫᩷ۘ;

    const-string v0, "session is down"

    .line 39
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 62
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 76
    iget-object v0, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    invoke-virtual {v0}, Ll/᩵᩷ۘ;->֫()V

    const/4 v0, 0x0

    .line 77
    iput-object v0, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    .line 78
    iget-object v0, p0, Ll/᩵᩻ۘ;->᩵:Ll/۟ۢۘ;

    if-eqz v0, :cond_2

    .line 80
    invoke-virtual {v0, p0}, Ll/۟ۢۘ;->֫(Ll/᩵᩻ۘ;)V

    .line 82
    :cond_2
    instance-of v0, p1, Ll/۫᩷ۘ;

    if-nez v0, :cond_3

    return-void

    .line 83
    :cond_3
    check-cast p1, Ll/۫᩷ۘ;

    throw p1
.end method

.method public final ۜ()V
    .locals 1

    .line 53
    new-instance v0, Ll/᩵᩷ۘ;

    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object v0, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    return-void
.end method

.method public final ۡ()V
    .locals 8

    .line 92
    :try_start_0
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ܺ()V

    .line 94
    new-instance v1, Ll/ܺ᩻ۘ;

    iget v0, p0, Ll/᩵᩻ۘ;->ۘ:I

    invoke-direct {v1, v0}, Ll/ܺ᩻ۘ;-><init>(I)V

    .line 95
    new-instance v2, Ll/۠ۢۘ;

    invoke-direct {v2, v1}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    .line 96
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v3

    .line 99
    :goto_0
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/᩵᩻ۘ;->֡:Ljava/lang/Thread;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    if-eqz v0, :cond_2

    iget-object v0, v0, Ll/᩵᩷ۘ;->֫:Ljava/io/InputStream;

    if-eqz v0, :cond_2

    .line 100
    iget-object v4, v1, Ll/ܺ᩻ۘ;->֫:[B

    array-length v5, v4

    const/16 v6, 0xe

    sub-int/2addr v5, v6

    invoke-virtual {v3}, Ll/۟ۢۘ;->ܽ()I

    move-result v7

    sub-int/2addr v5, v7

    invoke-virtual {v0, v4, v6, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    if-gtz v4, :cond_0

    .line 102
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ܽ()V

    goto :goto_1

    .line 105
    :cond_0
    invoke-virtual {v2}, Ll/۠ۢۘ;->֫()V

    const/16 v0, 0x5e

    .line 106
    invoke-virtual {v1, v0}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 107
    iget v0, p0, Ll/᩵᩻ۘ;->ܺ:I

    invoke-virtual {v1, v0}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 108
    invoke-virtual {v1, v4}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 109
    invoke-virtual {v1, v4}, Ll/ܺ᩻ۘ;->ܽ(I)V

    move-object v0, p0

    .line 110
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    :try_start_1
    iget-boolean v5, p0, Ll/᩵᩻ۘ;->֫:Z

    if-eqz v5, :cond_1

    .line 112
    monitor-exit v0

    goto :goto_1

    .line 113
    :cond_1
    invoke-virtual {v3, v2, p0, v4}, Ll/۟ۢۘ;->֫(Ll/۠ۢۘ;Ll/᩵᩻ۘ;I)V

    .line 114
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 126
    :cond_2
    :goto_1
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ܽ()V

    .line 127
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ۧ()V

    return-void

    .line 119
    :catch_0
    iget-boolean v0, p0, Ll/᩵᩻ۘ;->ܽ:Z

    if-nez v0, :cond_3

    const/4 v0, 0x1

    .line 120
    iput-boolean v0, p0, Ll/᩵᩻ۘ;->ܽ:Z

    .line 122
    :cond_3
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ۧ()V

    return-void
.end method

.method public ܿ()Ll/۠ۢۘ;
    .locals 4

    .line 158
    new-instance v0, Ll/ܺ᩻ۘ;

    iget-object v1, p0, Ll/۠᩻ۘ;->۠:Ljava/lang/String;

    .line 159
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x32

    iget-object v2, p0, Ll/۠᩻ۘ;->ܶ:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v1

    iget-object v1, p0, Ll/᩵᩻ۘ;->᩵:Ll/۟ۢۘ;

    invoke-virtual {v1}, Ll/۟ۢۘ;->ܽ()I

    move-result v1

    add-int/2addr v2, v1

    invoke-direct {v0, v2}, Ll/ܺ᩻ۘ;-><init>(I)V

    .line 160
    new-instance v1, Ll/۠ۢۘ;

    invoke-direct {v1, v0}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    .line 166
    invoke-virtual {v1}, Ll/۠ۢۘ;->֫()V

    const/16 v2, 0x5a

    .line 167
    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 168
    iget-object v2, p0, Ll/᩵᩻ۘ;->ۚ:[B

    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 169
    iget v2, p0, Ll/᩵᩻ۘ;->ܿ:I

    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 170
    iget v2, p0, Ll/᩵᩻ۘ;->ۜ:I

    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 171
    iget v2, p0, Ll/᩵᩻ۘ;->᩻:I

    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 172
    iget-object v2, p0, Ll/۠᩻ۘ;->۠:Ljava/lang/String;

    .line 397
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v2, v3}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v2

    .line 172
    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 173
    iget v2, p0, Ll/۠᩻ۘ;->᩹:I

    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 174
    iget-object v2, p0, Ll/۠᩻ۘ;->ܶ:Ljava/lang/String;

    .line 397
    invoke-static {v2, v3}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v2

    .line 174
    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 175
    iget v2, p0, Ll/۠᩻ۘ;->᩸:I

    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    return-object v1
.end method
