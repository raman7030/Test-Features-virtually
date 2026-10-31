.class public final Ll/᩸᩻ۘ;
.super Ll/۬᩻ۘ;
.source "S7YI"


# instance fields
.field public ۬:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Ll/۬᩻ۘ;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 35
    iput-object v0, p0, Ll/᩸᩻ۘ;->۬:[B

    return-void
.end method


# virtual methods
.method public final ֡()V
    .locals 2

    .line 61
    sget-object v0, Ll/᩵ۡۘ;->ܽ:[B

    .line 397
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "echo \'===SYSTEM_TYPE===\'; uname -s; echo \'===USER_LIST===\'; if [ \"$(uname -s)\" = \"Darwin\" ]; then dscl . -list /Users UniqueID; else cat /etc/passwd; fi; echo \'===GROUP_LIST===\'; if [ \"$(uname -s)\" = \"Darwin\" ]; then dscl . -list /Groups PrimaryGroupID; else cat /etc/group; fi"

    .line 393
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 61
    iput-object v0, p0, Ll/᩸᩻ۘ;->۬:[B

    return-void
.end method

.method public final ۜ()V
    .locals 2

    .line 70
    iget-object v0, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    const/4 v1, 0x0

    .line 62
    iput-object v1, v0, Ll/᩵᩷ۘ;->֫:Ljava/io/InputStream;

    .line 71
    iget-object v0, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    .line 44
    iput-object v1, v0, Ll/᩵᩷ۘ;->ۧ:Ljava/io/OutputStream;

    return-void
.end method

.method public final ᩴ()V
    .locals 4

    .line 39
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v0

    .line 41
    :try_start_0
    invoke-virtual {p0}, Ll/۬᩻ۘ;->᩵()V

    .line 42
    new-instance v1, Ll/ۙۢۘ;

    iget-object v2, p0, Ll/᩸᩻ۘ;->۬:[B

    invoke-direct {v1, v2}, Ll/ۙۢۘ;-><init>([B)V

    .line 43
    invoke-virtual {v1, v0, p0}, Ll/ۙۢۘ;->֫(Ll/۟ۢۘ;Ll/᩵᩻ۘ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    iget-object v1, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    iget-object v1, v1, Ll/᩵᩷ۘ;->֫:Ljava/io/InputStream;

    if-eqz v1, :cond_0

    .line 51
    invoke-virtual {v0}, Ll/۟ۢۘ;->᩻()Ll/ۛۢۘ;

    move-result-object v1

    new-instance v2, Ll/ܶ᩻ۘ;

    invoke-direct {v2, p0}, Ll/ܶ᩻ۘ;-><init>(Ll/᩸᩻ۘ;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/lang/Thread;

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v1, p0, Ll/᩵᩻ۘ;->֡:Ljava/lang/Thread;

    .line 52
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Exec thread "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3085
    iget-object v0, v0, Ll/۟ۢۘ;->ۨ:Ljava/lang/String;

    .line 52
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 56
    iget-object v0, p0, Ll/᩵᩻ۘ;->֡:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_0
    return-void

    :catch_0
    move-exception v0

    .line 45
    instance-of v1, v0, Ll/۫᩷ۘ;

    if-eqz v1, :cond_1

    .line 46
    check-cast v0, Ll/۫᩷ۘ;

    throw v0

    .line 47
    :cond_1
    new-instance v1, Ll/۫᩷ۘ;

    const-string v2, "ChannelExec"

    .line 43
    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    throw v1
.end method
