.class public final Ll/ۗ᩹֫;
.super Ljava/lang/Object;
.source "98JC"


# instance fields
.field public ֫:I

.field public ۜ:I

.field public ۡ:J

.field public ۢ:I

.field public ۧ:I

.field public ܳ:I

.field public ܺ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I

.field public ᩷:I

.field public ᩻:I


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    .line 175
    iget v1, v0, Ll/ۗ᩹֫;->֫:I

    .line 189
    iget v2, v0, Ll/ۗ᩹֫;->ۧ:I

    .line 190
    iget v3, v0, Ll/ۗ᩹֫;->᩻:I

    .line 191
    iget v4, v0, Ll/ۗ᩹֫;->᩷:I

    .line 192
    iget v5, v0, Ll/ۗ᩹֫;->ۜ:I

    .line 193
    iget v6, v0, Ll/ۗ᩹֫;->ۢ:I

    .line 194
    iget v7, v0, Ll/ۗ᩹֫;->ܽ:I

    .line 195
    iget v8, v0, Ll/ۗ᩹֫;->ᩳ:I

    .line 196
    iget v9, v0, Ll/ۗ᩹֫;->ܳ:I

    .line 197
    iget v10, v0, Ll/ۗ᩹֫;->ܿ:I

    .line 198
    iget-wide v11, v0, Ll/ۗ᩹֫;->ۡ:J

    .line 199
    iget v13, v0, Ll/ۗ᩹֫;->ܺ:I

    .line 175
    sget-object v14, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1126
    sget-object v14, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v14, ",\n decoderReleases="

    const-string v15, "\n queuedInputBuffers="

    const-string v0, "DecoderCounters {\n decoderInits="

    .line 0
    invoke-static {v0, v1, v14, v15, v2}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n skippedInputBuffers="

    const-string v2, "\n renderedOutputBuffers="

    invoke-static {v0, v3, v1, v4, v2}, Ll/ۛۙܽ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, "\n skippedOutputBuffers="

    const-string v2, "\n droppedBuffers="

    invoke-static {v0, v5, v1, v6, v2}, Ll/ۛۙܽ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, "\n droppedInputBuffers="

    const-string v2, "\n maxConsecutiveDroppedBuffers="

    invoke-static {v0, v7, v1, v8, v2}, Ll/ۛۙܽ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, "\n droppedToKeyframeEvents="

    const-string v2, "\n totalVideoFrameProcessingOffsetUs="

    invoke-static {v0, v9, v1, v10, v2}, Ll/ۛۙܽ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 1126
    invoke-virtual {v0, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "\n videoFrameProcessingOffsetCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
