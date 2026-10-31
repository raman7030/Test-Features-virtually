.class public final Ll/ܿۜۘ;
.super Ll/۬᩻ۘ;
.source "R7Z7"


# instance fields
.field public ۫:Z

.field public ۬:Ljava/lang/String;


# virtual methods
.method public final ۜ()V
    .locals 2

    .line 78
    iget-object v0, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    const/4 v1, 0x0

    .line 62
    iput-object v1, v0, Ll/᩵᩷ۘ;->֫:Ljava/io/InputStream;

    .line 79
    iget-object v0, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    .line 44
    iput-object v1, v0, Ll/᩵᩷ۘ;->ۧ:Ljava/io/OutputStream;

    return-void
.end method

.method public final ᩴ()V
    .locals 4

    .line 47
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v0

    .line 54
    :try_start_0
    iget-boolean v1, p0, Ll/۬᩻ۘ;->۠:Z

    if-eqz v1, :cond_0

    .line 55
    new-instance v1, Ll/ۗۢۘ;

    invoke-direct {v1}, Ll/ۗۢۘ;-><init>()V

    .line 56
    invoke-virtual {v1, v0, p0}, Ll/ۗۢۘ;->֫(Ll/۟ۢۘ;Ll/᩵᩻ۘ;)V

    .line 58
    :cond_0
    new-instance v1, Ll/ۤۢۘ;

    invoke-direct {v1}, Ll/ۤۢۘ;-><init>()V

    .line 59
    iget-object v2, p0, Ll/ܿۜۘ;->۬:Ljava/lang/String;

    iget-boolean v3, p0, Ll/ܿۜۘ;->۫:Z

    invoke-virtual {v1, v0, p0, v2, v3}, Ll/ۤۢۘ;->֫(Ll/۟ۢۘ;Ll/ܿۜۘ;Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    iget-object v1, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    iget-object v1, v1, Ll/᩵᩷ۘ;->֫:Ljava/io/InputStream;

    if-eqz v1, :cond_1

    .line 67
    invoke-virtual {v0}, Ll/۟ۢۘ;->᩻()Ll/ۛۢۘ;

    move-result-object v1

    new-instance v2, Ll/ᩳۜۘ;

    invoke-direct {v2, p0}, Ll/ᩳۜۘ;-><init>(Ll/ܿۜۘ;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/lang/Thread;

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v1, p0, Ll/᩵᩻ۘ;->֡:Ljava/lang/Thread;

    .line 68
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Subsystem for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Ll/۟ۢۘ;->ۨ:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 72
    iget-object v0, p0, Ll/᩵᩻ۘ;->֡:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_1
    return-void

    :catch_0
    move-exception v0

    .line 61
    instance-of v1, v0, Ll/۫᩷ۘ;

    if-eqz v1, :cond_2

    .line 62
    check-cast v0, Ll/۫᩷ۘ;

    throw v0

    .line 64
    :cond_2
    new-instance v1, Ll/۫᩷ۘ;

    const-string v2, "ChannelSubsystem"

    .line 43
    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    throw v1
.end method
