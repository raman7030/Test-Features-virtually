.class public Lcom/portaudio/PortAudio;
.super Ljava/lang/Object;
.source "PortAudio.java"


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "os.name"

    .line 91
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "win"

    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_1

    const-string v0, "os.arch"

    .line 95
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "64"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "jportaudio_x64"

    .line 97
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "jportaudio_x86"

    .line 101
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v0, "jportaudio"

    .line 106
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 108
    :goto_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "---- JPortAudio version "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/portaudio/PortAudio;->getVersion()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    invoke-static {}, Lcom/portaudio/PortAudio;->getVersionText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 108
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native getDefaultHostApi()I
.end method

.method public static native getDefaultInputDevice()I
.end method

.method public static native getDefaultOutputDevice()I
.end method

.method public static native getDeviceCount()I
.end method

.method public static native getDeviceInfo(ILl/֫ۚۘ;)V
.end method

.method public static native getHostApiCount()I
.end method

.method public static native getHostApiInfo(ILl/ۧۚۘ;)V
.end method

.method public static native getVersion()I
.end method

.method public static native getVersionText()Ljava/lang/String;
.end method

.method public static native hostApiDeviceIndexToDeviceIndex(II)I
.end method

.method public static native hostApiTypeIdToHostApiIndex(I)I
.end method

.method public static native initialize()V
.end method

.method public static native isFormatSupported(Ll/ᩳۚۘ;Ll/ᩳۚۘ;I)I
.end method

.method public static native openStream(Lcom/portaudio/BlockingStream;Ll/ᩳۚۘ;Ll/ᩳۚۘ;III)V
.end method

.method public static native terminate()V
.end method
