.class public final Ll/᩷۟֫;
.super Ljava/lang/Exception;
.source "W8Q2"


# instance fields
.field public final ۙ:Z

.field public final ᩶:Ljava/lang/String;

.field public final ᩸:Ll/ܿ۟֫;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLl/ܿ۟֫;Ljava/lang/String;)V
    .locals 0

    .line 185
    invoke-direct {p0, p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 186
    iput-object p3, p0, Ll/᩷۟֫;->᩶:Ljava/lang/String;

    .line 187
    iput-boolean p4, p0, Ll/᩷۟֫;->ۙ:Z

    .line 188
    iput-object p5, p0, Ll/᩷۟֫;->᩸:Ll/ܿ۟֫;

    .line 189
    iput-object p6, p0, Ll/᩷۟֫;->᩹:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/۠ᩴ֫;Ljava/lang/Exception;ZLl/ܿ۟֫;)V
    .locals 9

    .line 167
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Decoder init failed: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p4, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v5, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 173
    instance-of p1, p2, Landroid/media/MediaCodec$CodecException;

    if-eqz p1, :cond_0

    move-object p1, p2

    check-cast p1, Landroid/media/MediaCodec$CodecException;

    invoke-virtual {p1}, Landroid/media/MediaCodec$CodecException;->getDiagnosticInfo()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move-object v8, p1

    move-object v2, p0

    move-object v4, p2

    move v6, p3

    move-object v7, p4

    .line 167
    invoke-direct/range {v2 .. v8}, Ll/᩷۟֫;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLl/ܿ۟֫;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ll/۠ᩴ֫;Ll/ۚ۟֫;ZI)V
    .locals 9

    .line 152
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Decoder init failed: ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "], "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v5, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    if-gez p4, :cond_0

    const-string p1, "neg_"

    goto :goto_0

    :cond_0
    const-string p1, ""

    .line 209
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p4}, Ljava/lang/Math;->abs(I)I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/4 v7, 0x0

    move-object v2, p0

    move-object v4, p2

    move v6, p3

    .line 152
    invoke-direct/range {v2 .. v8}, Ll/᩷۟֫;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLl/ܿ۟֫;Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ll/᩷۟֫;)Ll/᩷۟֫;
    .locals 8

    .line 196
    new-instance v7, Ll/᩷۟֫;

    .line 197
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    .line 198
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    iget-object v3, p0, Ll/᩷۟֫;->᩶:Ljava/lang/String;

    iget-boolean v4, p0, Ll/᩷۟֫;->ۙ:Z

    iget-object v5, p0, Ll/᩷۟֫;->᩸:Ll/ܿ۟֫;

    iget-object v6, p0, Ll/᩷۟֫;->᩹:Ljava/lang/String;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ll/᩷۟֫;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLl/ܿ۟֫;Ljava/lang/String;)V

    return-object v7
.end method
