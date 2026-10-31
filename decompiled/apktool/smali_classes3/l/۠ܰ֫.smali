.class public final Ll/۠ܰ֫;
.super Ljava/lang/Object;
.source "F8QV"

# interfaces
.implements Ll/ܰܰ֫;


# instance fields
.field public final ֫:Ll/ۚܰ֫;

.field public final ۧ:Ll/֨ܰ֫;


# direct methods
.method public constructor <init>(Ll/ۚܰ֫;Ll/֨ܰ֫;)V
    .locals 0

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput-object p1, p0, Ll/۠ܰ֫;->֫:Ll/ۚܰ֫;

    .line 89
    iput-object p2, p0, Ll/۠ܰ֫;->ۧ:Ll/֨ܰ֫;

    return-void
.end method


# virtual methods
.method public final bridge synthetic ֫(Ll/᩺ܰ֫;)Ll/ۧ۟֫;
    .locals 0

    .line 57
    invoke-virtual {p0, p1}, Ll/۠ܰ֫;->֫(Ll/᩺ܰ֫;)Ll/ܶܰ֫;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩺ܰ֫;)Ll/ܶܰ֫;
    .locals 6

    const-string v0, "createCodec:"

    .line 107
    iget-object v1, p1, Ll/᩺ܰ֫;->֫:Ll/ܿ۟֫;

    iget-object v1, v1, Ll/ܿ۟֫;->ۡ:Ljava/lang/String;

    const/4 v2, 0x0

    .line 111
    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 38
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 112
    invoke-static {v1}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 120
    :try_start_1
    new-instance v1, Ll/᩶ܰ֫;

    iget-object v3, p0, Ll/۠ܰ֫;->ۧ:Ll/֨ܰ֫;

    .line 121
    invoke-virtual {v3}, Ll/֨ܰ֫;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/HandlerThread;

    invoke-direct {v1, v0, v3}, Ll/᩶ܰ֫;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;)V

    .line 123
    new-instance v3, Ll/ܶܰ֫;

    iget-object v4, p0, Ll/۠ܰ֫;->֫:Ll/ۚܰ֫;

    .line 126
    invoke-virtual {v4}, Ll/ۚܰ֫;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/HandlerThread;

    iget-object v5, p1, Ll/᩺ܰ֫;->ᩳ:Ll/ۨܰ֫;

    invoke-direct {v3, v0, v4, v1, v5}, Ll/ܶܰ֫;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Ll/ܽ۟֫;Ll/ۨܰ֫;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 49
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 130
    iget-object v1, p1, Ll/᩺ܰ֫;->ܳ:Landroid/view/Surface;

    if-nez v1, :cond_0

    iget-object v2, p1, Ll/᩺ܰ֫;->֫:Ll/ܿ۟֫;

    iget-boolean v2, v2, Ll/ܿ۟֫;->ᩳ:Z

    if-eqz v2, :cond_0

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x23

    if-lt v2, v4, :cond_0

    const/16 v2, 0x8

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 135
    :goto_0
    iget-object v4, p1, Ll/᩺ܰ֫;->ܿ:Landroid/media/MediaFormat;

    iget-object p1, p1, Ll/᩺ܰ֫;->ۧ:Landroid/media/MediaCrypto;

    invoke-static {v3, v4, v1, p1, v2}, Ll/ܶܰ֫;->֫(Ll/ܶܰ֫;Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v3

    :catch_0
    move-exception p1

    move-object v2, v3

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    move-object v0, v2

    :goto_1
    if-nez v2, :cond_1

    if-eqz v0, :cond_2

    .line 142
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    goto :goto_2

    .line 140
    :cond_1
    invoke-virtual {v2}, Ll/ܶܰ֫;->֫()V

    .line 144
    :cond_2
    :goto_2
    throw p1
.end method
