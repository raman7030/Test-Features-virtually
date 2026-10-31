.class public Ll/ᩳ۟֫;
.super Ll/۠᩸֫;
.source "C8UZ"


# instance fields
.field public final ᩸:I


# direct methods
.method public constructor <init>(Ljava/lang/IllegalStateException;Ll/ܿ۟֫;)V
    .locals 3

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Decoder failed: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-nez p2, :cond_0

    move-object p2, v1

    goto :goto_0

    :cond_0
    iget-object p2, p2, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    :goto_0
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 50
    invoke-direct {p0, p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    instance-of p2, p1, Landroid/media/MediaCodec$CodecException;

    if-eqz p2, :cond_1

    .line 45
    move-object v0, p1

    check-cast v0, Landroid/media/MediaCodec$CodecException;

    invoke-virtual {v0}, Landroid/media/MediaCodec$CodecException;->getDiagnosticInfo()Ljava/lang/String;

    move-result-object v1

    .line 48
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-lt v0, v2, :cond_3

    if-eqz p2, :cond_2

    .line 56
    check-cast p1, Landroid/media/MediaCodec$CodecException;

    invoke-virtual {p1}, Landroid/media/MediaCodec$CodecException;->getErrorCode()I

    move-result p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    goto :goto_1

    .line 50
    :cond_3
    invoke-static {v1}, Ll/ۘ֨֫;->֫(Ljava/lang/String;)I

    move-result p1

    :goto_1
    iput p1, p0, Ll/ᩳ۟֫;->᩸:I

    return-void
.end method
