.class public final Ll/֡᩸֫;
.super Ljava/lang/Object;
.source "K8TS"


# instance fields
.field public final ֫:Landroid/media/MediaCodec$CryptoInfo;

.field public final ۧ:Landroid/media/MediaCodec$CryptoInfo$Pattern;


# direct methods
.method public constructor <init>(Landroid/media/MediaCodec$CryptoInfo;)V
    .locals 0

    .line 172
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 173
    iput-object p1, p0, Ll/֡᩸֫;->֫:Landroid/media/MediaCodec$CryptoInfo;

    .line 174
    invoke-static {}, Ll/᩵᩸֫;->֫()Landroid/media/MediaCodec$CryptoInfo$Pattern;

    move-result-object p1

    iput-object p1, p0, Ll/֡᩸֫;->ۧ:Landroid/media/MediaCodec$CryptoInfo$Pattern;

    return-void
.end method

.method public static ֫(Ll/֡᩸֫;II)V
    .locals 1

    .line 178
    iget-object v0, p0, Ll/֡᩸֫;->ۧ:Landroid/media/MediaCodec$CryptoInfo$Pattern;

    invoke-virtual {v0, p1, p2}, Landroid/media/MediaCodec$CryptoInfo$Pattern;->set(II)V

    .line 179
    iget-object p1, p0, Ll/֡᩸֫;->֫:Landroid/media/MediaCodec$CryptoInfo;

    iget-object p0, p0, Ll/֡᩸֫;->ۧ:Landroid/media/MediaCodec$CryptoInfo$Pattern;

    invoke-virtual {p1, p0}, Landroid/media/MediaCodec$CryptoInfo;->setPattern(Landroid/media/MediaCodec$CryptoInfo$Pattern;)V

    return-void
.end method
