.class public Lcom/portaudio/BlockingStream;
.super Ljava/lang/Object;
.source "BlockingStream.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private native getInfo(Ll/ܽۚۘ;)V
.end method

.method private native readFloats([FI)Z
.end method

.method private native readShorts([SI)Z
.end method

.method private native writeFloats([FI)Z
.end method

.method private native writeShorts([SI)Z
.end method


# virtual methods
.method public native abort()V
.end method

.method public native close()V
.end method

.method public native getReadAvailable()I
.end method

.method public native getTime()D
.end method

.method public native getWriteAvailable()I
.end method

.method public native isActive()Z
.end method

.method public native isStopped()Z
.end method

.method public native start()V
.end method

.method public native stop()V
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 183
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BlockingStream: streamPtr = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", inFormat = -1, outFormat = -1"

    .line 184
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
