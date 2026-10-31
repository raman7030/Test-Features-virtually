.class public final Ll/֫ۗ֫;
.super Ljava/lang/Object;
.source "H74H"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Z

.field public final ܽ:Ll/۟ۙ֫;


# direct methods
.method public constructor <init>(Ll/۟ۙ֫;ZLjava/lang/String;)V
    .locals 0

    .line 995
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 996
    iput-object p1, p0, Ll/֫ۗ֫;->ܽ:Ll/۟ۙ֫;

    .line 997
    iput-boolean p2, p0, Ll/֫ۗ֫;->ۧ:Z

    .line 998
    iput-object p3, p0, Ll/֫ۗ֫;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1044
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MediaExtractorSampleQueue: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/֫ۗ֫;->ܽ:Ll/۟ۙ֫;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isCompatibilityTrack: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/֫ۗ֫;->ۧ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", compatibilityTrackMimeType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֫ۗ֫;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۙ֫;Ll/᩸᩸֫;)Landroid/media/MediaFormat;
    .locals 8

    .line 1022
    invoke-virtual {p1}, Ll/ۗۙ֫;->֫()V

    .line 1023
    iget-object v0, p0, Ll/֫ۗ֫;->ܽ:Ll/۟ۙ֫;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, p1, p2, v1, v2}, Ll/ۘܽۧ;->֫(Ll/ۗۙ֫;Ll/᩸᩸֫;IZ)I

    .line 1028
    iget-object p2, p1, Ll/ۗۙ֫;->ۧ:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1029
    invoke-virtual {p1}, Ll/ۗۙ֫;->֫()V

    .line 150
    new-instance p1, Landroid/media/MediaFormat;

    invoke-direct {p1}, Landroid/media/MediaFormat;-><init>()V

    const-string v0, "bitrate"

    .line 151
    iget v3, p2, Ll/۠ᩴ֫;->ᩳ:I

    invoke-static {p1, v0, v3}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    const-string v0, "max-bitrate"

    .line 152
    iget v3, p2, Ll/۠ᩴ֫;->ۨ:I

    invoke-static {p1, v0, v3}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    const-string v0, "channel-count"

    .line 153
    iget v3, p2, Ll/۠ᩴ֫;->ܿ:I

    invoke-static {p1, v0, v3}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 155
    iget-object v0, p2, Ll/۠ᩴ֫;->᩻:Ll/᩷ᩴ֫;

    invoke-static {p1, v0}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ll/᩷ᩴ֫;)V

    .line 157
    iget-object v0, p2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v3, "mime"

    if-eqz v0, :cond_0

    .line 202
    invoke-virtual {p1, v3, v0}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    :cond_0
    iget-object v0, p2, Ll/۠ᩴ֫;->ܳ:Ljava/lang/String;

    const-string v4, "codecs-string"

    if-eqz v0, :cond_1

    .line 202
    invoke-virtual {p1, v4, v0}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    :cond_1
    iget v0, p2, Ll/۠ᩴ֫;->֡:F

    const/high16 v5, -0x40800000    # -1.0f

    cmpl-float v5, v0, v5

    if-eqz v5, :cond_2

    const-string v5, "frame-rate"

    .line 242
    invoke-virtual {p1, v5, v0}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    :cond_2
    const-string v0, "width"

    .line 160
    iget v5, p2, Ll/۠ᩴ֫;->᩷֫:I

    invoke-static {p1, v0, v5}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    const-string v0, "height"

    .line 161
    iget v5, p2, Ll/۠ᩴ֫;->۠:I

    invoke-static {p1, v0, v5}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 163
    iget-object v0, p2, Ll/۠ᩴ֫;->᩸:Ljava/util/List;

    invoke-static {p1, v0}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ljava/util/List;)V

    .line 164
    iget v0, p2, Ll/۠ᩴ֫;->ۛ:I

    const/4 v5, -0x1

    if-ne v0, v5, :cond_3

    goto :goto_1

    :cond_3
    const-string v5, "exo-pcm-encoding-int"

    .line 465
    invoke-static {p1, v5, v0}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    if-eqz v0, :cond_5

    if-eq v0, v1, :cond_4

    const/4 v5, 0x3

    if-eq v0, v5, :cond_6

    const/4 v5, 0x4

    if-eq v0, v5, :cond_6

    const/16 v5, 0x15

    if-eq v0, v5, :cond_6

    const/16 v5, 0x16

    if-eq v0, v5, :cond_6

    goto :goto_1

    :cond_4
    const/4 v5, 0x2

    goto :goto_0

    :cond_5
    const/4 v5, 0x0

    :cond_6
    :goto_0
    const-string v0, "pcm-encoding"

    .line 493
    invoke-virtual {p1, v0, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 165
    :goto_1
    iget-object v0, p2, Ll/۠ᩴ֫;->ۙ:Ljava/lang/String;

    if-eqz v0, :cond_7

    const-string v5, "language"

    .line 202
    invoke-virtual {p1, v5, v0}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    const-string v0, "max-input-size"

    .line 166
    iget v5, p2, Ll/۠ᩴ֫;->ۗ:I

    invoke-static {p1, v0, v5}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    const-string v0, "sample-rate"

    .line 167
    iget v5, p2, Ll/۠ᩴ֫;->ܽ֫:I

    invoke-static {p1, v0, v5}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    const-string v0, "caption-service-number"

    .line 168
    iget v5, p2, Ll/۠ᩴ֫;->֫:I

    invoke-static {p1, v0, v5}, Ll/۬ۚ֫;->֫(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    const-string v0, "rotation-degrees"

    .line 169
    iget v5, p2, Ll/۠ᩴ֫;->֫֫:I

    invoke-virtual {p1, v0, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 171
    iget v0, p2, Ll/۠ᩴ֫;->ᩳ֫:I

    and-int/lit8 v5, v0, 0x4

    const/4 v6, 0x1

    if-eqz v5, :cond_8

    const/4 v5, 0x1

    goto :goto_2

    :cond_8
    const/4 v5, 0x0

    :goto_2
    const-string v7, "is-autoselect"

    .line 435
    invoke-virtual {p1, v7, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    and-int/lit8 v5, v0, 0x1

    if-eqz v5, :cond_9

    const/4 v5, 0x1

    goto :goto_3

    :cond_9
    const/4 v5, 0x0

    :goto_3
    const-string v7, "is-default"

    invoke-virtual {p1, v7, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    and-int/2addr v0, v1

    if-eqz v0, :cond_a

    const/4 v2, 0x1

    :cond_a
    const-string v0, "is-forced-subtitle"

    invoke-virtual {p1, v0, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v0, "encoder-delay"

    .line 178
    iget v1, p2, Ll/۠ᩴ֫;->ᩴ:I

    invoke-virtual {p1, v0, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v0, "encoder-padding"

    .line 179
    iget v1, p2, Ll/۠ᩴ֫;->᩵:I

    invoke-virtual {p1, v0, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 181
    iget v0, p2, Ll/۠ᩴ֫;->᩺:F

    const-string v1, "exo-pixel-width-height-ratio-float"

    .line 442
    invoke-virtual {p1, v1, v0}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    const/high16 v1, 0x40000000    # 2.0f

    const/high16 v2, 0x3f800000    # 1.0f

    cmpg-float v5, v0, v2

    if-gez v5, :cond_b

    int-to-float v2, v1

    mul-float v0, v0, v2

    float-to-int v6, v0

    goto :goto_4

    :cond_b
    cmpl-float v2, v0, v2

    if-lez v2, :cond_c

    int-to-float v1, v1

    div-float/2addr v1, v0

    float-to-int v1, v1

    const/high16 v6, 0x40000000    # 2.0f

    goto :goto_4

    :cond_c
    const/4 v1, 0x1

    :goto_4
    const-string v0, "sar-width"

    .line 454
    invoke-virtual {p1, v0, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v0, "sar-height"

    .line 455
    invoke-virtual {p1, v0, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 183
    iget-object v0, p2, Ll/۠ᩴ֫;->ܶ:Ljava/lang/String;

    if-eqz v0, :cond_d

    :try_start_0
    const-string v1, "track-id"

    .line 185
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v1, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    nop

    .line 1005
    :cond_d
    :goto_5
    iget-object v0, p0, Ll/֫ۗ֫;->֫:Ljava/lang/String;

    if-eqz v0, :cond_f

    .line 1006
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_e

    .line 1007
    invoke-virtual {p1, v4}, Landroid/media/MediaFormat;->removeKey(Ljava/lang/String;)V

    .line 1009
    :cond_e
    invoke-virtual {p1, v3, v0}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1012
    :cond_f
    invoke-static {p2}, Ll/ᩳۚ֫;->֫(Ll/۠ᩴ֫;)Landroid/util/Pair;

    move-result-object p2

    if-eqz p2, :cond_10

    .line 1013
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_10

    .line 1014
    iget-object v0, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string v1, "profile"

    invoke-virtual {p1, v1, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 1015
    iget-object p2, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const-string v0, "level"

    invoke-virtual {p1, v0, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_10
    return-object p1
.end method
