.class public final Ll/ۨܰ֫;
.super Ljava/lang/Object;
.source "D8SC"


# instance fields
.field public ֫:Landroid/media/LoudnessCodecController;

.field public final ۧ:Ljava/util/HashSet;

.field public final ܽ:Ll/᩶۫᩷;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۨܰ֫;->ۧ:Ljava/util/HashSet;

    .line 68
    sget-object v0, Ll/ۛܰ֫;->ܽ:Ll/᩶۫᩷;

    iput-object v0, p0, Ll/ۨܰ֫;->ܽ:Ll/᩶۫᩷;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۨܰ֫;)Ll/ۛܰ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۨܰ֫;->ܽ:Ll/᩶۫᩷;

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 127
    iget-object v0, p0, Ll/ۨܰ֫;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 128
    iget-object v0, p0, Ll/ۨܰ֫;->֫:Landroid/media/LoudnessCodecController;

    if-eqz v0, :cond_0

    .line 129
    invoke-virtual {v0}, Landroid/media/LoudnessCodecController;->close()V

    :cond_0
    return-void
.end method

.method public final ֫(I)V
    .locals 2

    .line 77
    iget-object v0, p0, Ll/ۨܰ֫;->֫:Landroid/media/LoudnessCodecController;

    if-eqz v0, :cond_0

    .line 78
    invoke-virtual {v0}, Landroid/media/LoudnessCodecController;->close()V

    const/4 v0, 0x0

    .line 79
    iput-object v0, p0, Ll/ۨܰ֫;->֫:Landroid/media/LoudnessCodecController;

    .line 84
    :cond_0
    invoke-static {}, Ll/۫ܰܺ;->֫()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Ll/ۤܰ֫;

    invoke-direct {v1, p0}, Ll/ۤܰ֫;-><init>(Ll/ۨܰ֫;)V

    .line 82
    invoke-static {p1, v0, v1}, Landroid/media/LoudnessCodecController;->create(ILjava/util/concurrent/Executor;Landroid/media/LoudnessCodecController$OnLoudnessCodecUpdateListener;)Landroid/media/LoudnessCodecController;

    move-result-object p1

    .line 91
    iput-object p1, p0, Ll/ۨܰ֫;->֫:Landroid/media/LoudnessCodecController;

    .line 92
    iget-object v0, p0, Ll/ۨܰ֫;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 93
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/MediaCodec;

    invoke-virtual {p1, v1}, Landroid/media/LoudnessCodecController;->addMediaCodec(Landroid/media/MediaCodec;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 95
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ֫(Landroid/media/MediaCodec;)V
    .locals 1

    .line 106
    iget-object v0, p0, Ll/ۨܰ֫;->֫:Landroid/media/LoudnessCodecController;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/media/LoudnessCodecController;->addMediaCodec(Landroid/media/MediaCodec;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 110
    :cond_0
    iget-object v0, p0, Ll/ۨܰ֫;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Z)V

    return-void
.end method

.method public final ۧ(Landroid/media/MediaCodec;)V
    .locals 1

    .line 119
    iget-object v0, p0, Ll/ۨܰ֫;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    iget-object v0, p0, Ll/ۨܰ֫;->֫:Landroid/media/LoudnessCodecController;

    if-eqz v0, :cond_0

    .line 121
    invoke-virtual {v0, p1}, Landroid/media/LoudnessCodecController;->removeMediaCodec(Landroid/media/MediaCodec;)V

    :cond_0
    return-void
.end method
