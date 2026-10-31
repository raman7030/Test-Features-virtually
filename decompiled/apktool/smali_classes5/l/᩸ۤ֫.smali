.class public final Ll/᩸ۤ֫;
.super Ljava/lang/Object;
.source "08N4"

# interfaces
.implements Ll/ۜۤ֫;


# direct methods
.method public static ֫(Ll/ᩳᩴ֫;Z)Landroid/media/AudioAttributes;
    .locals 0

    if-eqz p1, :cond_0

    .line 121
    new-instance p0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {p0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 p1, 0x3

    .line 122
    invoke-virtual {p0, p1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p0

    const/16 p1, 0x10

    .line 123
    invoke-virtual {p0, p1}, Landroid/media/AudioAttributes$Builder;->setFlags(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p0

    const/4 p1, 0x1

    .line 124
    invoke-virtual {p0, p1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p0

    .line 125
    invoke-virtual {p0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object p0

    return-object p0

    .line 116
    :cond_0
    invoke-virtual {p0}, Ll/ᩳᩴ֫;->֫()Ll/ܽᩴ֫;

    move-result-object p0

    iget-object p0, p0, Ll/ܽᩴ֫;->֫:Landroid/media/AudioAttributes;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/֨۫֫;Ll/ᩳᩴ֫;ILandroid/content/Context;)Landroid/media/AudioTrack;
    .locals 6

    .line 45
    iget-boolean v0, p1, Ll/֨۫֫;->ܳ:Z

    iget v1, p1, Ll/֨۫֫;->ܽ:I

    iget v2, p1, Ll/֨۫֫;->ۧ:I

    iget v3, p1, Ll/֨۫֫;->ܿ:I

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x17

    if-lt v4, v5, :cond_2

    .line 59
    invoke-static {v3, v2, v1}, Ll/ۘ֨֫;->ۧ(III)Landroid/media/AudioFormat;

    move-result-object v1

    .line 62
    invoke-static {p2, v0}, Ll/᩸ۤ֫;->֫(Ll/ᩳᩴ֫;Z)Landroid/media/AudioAttributes;

    move-result-object p2

    .line 63
    new-instance v0, Landroid/media/AudioTrack$Builder;

    invoke-direct {v0}, Landroid/media/AudioTrack$Builder;-><init>()V

    .line 65
    invoke-virtual {v0, p2}, Landroid/media/AudioTrack$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioTrack$Builder;

    move-result-object p2

    .line 66
    invoke-virtual {p2, v1}, Landroid/media/AudioTrack$Builder;->setAudioFormat(Landroid/media/AudioFormat;)Landroid/media/AudioTrack$Builder;

    move-result-object p2

    const/4 v0, 0x1

    .line 67
    invoke-virtual {p2, v0}, Landroid/media/AudioTrack$Builder;->setTransferMode(I)Landroid/media/AudioTrack$Builder;

    move-result-object p2

    iget v0, p1, Ll/֨۫֫;->֫:I

    .line 68
    invoke-virtual {p2, v0}, Landroid/media/AudioTrack$Builder;->setBufferSizeInBytes(I)Landroid/media/AudioTrack$Builder;

    move-result-object p2

    .line 69
    invoke-virtual {p2, p3}, Landroid/media/AudioTrack$Builder;->setSessionId(I)Landroid/media/AudioTrack$Builder;

    move-result-object p2

    const/16 p3, 0x1d

    if-lt v4, p3, :cond_0

    .line 71
    iget-boolean p1, p1, Ll/֨۫֫;->ᩳ:Z

    .line 81
    invoke-virtual {p2, p1}, Landroid/media/AudioTrack$Builder;->setOffloadedPlayback(Z)Landroid/media/AudioTrack$Builder;

    :cond_0
    const/16 p1, 0x22

    if-lt v4, p1, :cond_1

    if-eqz p4, :cond_1

    .line 74
    invoke-virtual {p2, p4}, Landroid/media/AudioTrack$Builder;->setContext(Landroid/content/Context;)Landroid/media/AudioTrack$Builder;

    .line 76
    :cond_1
    invoke-virtual {p2}, Landroid/media/AudioTrack$Builder;->build()Landroid/media/AudioTrack;

    move-result-object p1

    return-object p1

    .line 102
    :cond_2
    new-instance p4, Landroid/media/AudioTrack;

    .line 103
    invoke-static {p2, v0}, Ll/᩸ۤ֫;->֫(Ll/ᩳᩴ֫;Z)Landroid/media/AudioAttributes;

    move-result-object p2

    .line 104
    invoke-static {v3, v2, v1}, Ll/ۘ֨֫;->ۧ(III)Landroid/media/AudioFormat;

    move-result-object v2

    iget v3, p1, Ll/֨۫֫;->֫:I

    const/4 v4, 0x1

    move-object v0, p4

    move-object v1, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Landroid/media/AudioTrack;-><init>(Landroid/media/AudioAttributes;Landroid/media/AudioFormat;III)V

    return-object p4
.end method
