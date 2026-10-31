.class public Ll/۬᩻ۘ;
.super Ll/᩵᩻ۘ;
.source "W7UY"


# static fields
.field public static ۗ:[B


# instance fields
.field public ۙ:I

.field public ۠:Z

.field public ܶ:I

.field public ᩶:Ljava/lang/String;

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 33
    sget-object v0, Ll/᩵ۡۘ;->ܽ:[B

    .line 397
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "session"

    invoke-static {v1, v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 33
    sput-object v0, Ll/۬᩻ۘ;->ۗ:[B

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 49
    invoke-direct {p0}, Ll/᩵᩻ۘ;-><init>()V

    const/4 v0, 0x0

    .line 39
    iput-boolean v0, p0, Ll/۬᩻ۘ;->۠:Z

    const-string v0, "vt100"

    .line 41
    iput-object v0, p0, Ll/۬᩻ۘ;->᩶:Ljava/lang/String;

    const/16 v0, 0x50

    .line 42
    iput v0, p0, Ll/۬᩻ۘ;->ܶ:I

    const/16 v0, 0x18

    .line 43
    iput v0, p0, Ll/۬᩻ۘ;->᩹:I

    const/16 v0, 0x280

    .line 44
    iput v0, p0, Ll/۬᩻ۘ;->ۙ:I

    const/16 v0, 0x1e0

    .line 45
    iput v0, p0, Ll/۬᩻ۘ;->᩸:I

    .line 50
    sget-object v0, Ll/۬᩻ۘ;->ۗ:[B

    iput-object v0, p0, Ll/᩵᩻ۘ;->ۚ:[B

    .line 51
    new-instance v0, Ll/᩵᩷ۘ;

    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object v0, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    return-void
.end method


# virtual methods
.method public final ۡ()V
    .locals 8

    .line 229
    new-instance v0, Ll/ܺ᩻ۘ;

    iget v1, p0, Ll/᩵᩻ۘ;->ۘ:I

    invoke-direct {v0, v1}, Ll/ܺ᩻ۘ;-><init>(I)V

    .line 230
    new-instance v1, Ll/۠ۢۘ;

    invoke-direct {v1, v0}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    .line 233
    :try_start_0
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v2

    .line 234
    :goto_0
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ۢ()Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Ll/᩵᩻ۘ;->֡:Ljava/lang/Thread;

    if-eqz v3, :cond_3

    iget-object v3, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    if-eqz v3, :cond_3

    iget-object v3, v3, Ll/᩵᩷ۘ;->֫:Ljava/io/InputStream;

    if-eqz v3, :cond_3

    .line 235
    iget-object v4, v0, Ll/ܺ᩻ۘ;->֫:[B

    array-length v5, v4

    const/16 v6, 0xe

    sub-int/2addr v5, v6

    invoke-virtual {v2}, Ll/۟ۢۘ;->ܽ()I

    move-result v7

    sub-int/2addr v5, v7

    invoke-virtual {v3, v4, v6, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, -0x1

    if-ne v3, v4, :cond_1

    .line 239
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ܽ()V

    goto :goto_1

    .line 242
    :cond_1
    iget-boolean v4, p0, Ll/᩵᩻ۘ;->֫:Z

    if-eqz v4, :cond_2

    goto :goto_1

    .line 245
    :cond_2
    invoke-virtual {v1}, Ll/۠ۢۘ;->֫()V

    const/16 v4, 0x5e

    .line 246
    invoke-virtual {v0, v4}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 247
    iget v4, p0, Ll/᩵᩻ۘ;->ܺ:I

    invoke-virtual {v0, v4}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 248
    invoke-virtual {v0, v3}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 249
    invoke-virtual {v0, v3}, Ll/ܺ᩻ۘ;->ܽ(I)V

    .line 250
    invoke-virtual {v2, v1, p0, v3}, Ll/۟ۢۘ;->֫(Ll/۠ۢۘ;Ll/᩵᩻ۘ;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 256
    :cond_3
    :goto_1
    iget-object v1, p0, Ll/᩵᩻ۘ;->֡:Ljava/lang/Thread;

    if-eqz v1, :cond_4

    move-object v0, v1

    .line 258
    monitor-enter v0

    .line 259
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 260
    monitor-exit v0

    goto :goto_2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_4
    :goto_2
    const/4 v0, 0x0

    .line 262
    iput-object v0, p0, Ll/᩵᩻ۘ;->֡:Ljava/lang/Thread;

    return-void
.end method

.method public final ᩵()V
    .locals 6

    .line 185
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v0

    .line 197
    iget-boolean v1, p0, Ll/۬᩻ۘ;->۠:Z

    if-eqz v1, :cond_0

    .line 198
    new-instance v1, Ll/ۗۢۘ;

    invoke-direct {v1}, Ll/ۗۢۘ;-><init>()V

    .line 199
    iget-object v2, p0, Ll/۬᩻ۘ;->᩶:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ll/ۗۢۘ;->֫(Ljava/lang/String;)V

    .line 200
    iget v2, p0, Ll/۬᩻ۘ;->ۙ:I

    iget v3, p0, Ll/۬᩻ۘ;->᩸:I

    iget v4, p0, Ll/۬᩻ۘ;->ܶ:I

    iget v5, p0, Ll/۬᩻ۘ;->᩹:I

    invoke-virtual {v1, v4, v5, v2, v3}, Ll/ۗۢۘ;->֫(IIII)V

    .line 204
    invoke-virtual {v1, v0, p0}, Ll/ۗۢۘ;->֫(Ll/۟ۢۘ;Ll/᩵᩻ۘ;)V

    :cond_0
    return-void
.end method
