.class public final Ll/ۚ᩸֫;
.super Ljava/lang/Object;
.source "K8TS"


# instance fields
.field public ֫:I

.field public ۜ:[I

.field public final ۢ:Ll/֡᩸֫;

.field public ۧ:I

.field public ܳ:I

.field public final ܽ:Landroid/media/MediaCodec$CryptoInfo;

.field public ܿ:[B

.field public ᩳ:[B

.field public ᩷:I

.field public ᩻:[I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    new-instance v0, Landroid/media/MediaCodec$CryptoInfo;

    invoke-direct {v0}, Landroid/media/MediaCodec$CryptoInfo;-><init>()V

    iput-object v0, p0, Ll/ۚ᩸֫;->ܽ:Landroid/media/MediaCodec$CryptoInfo;

    .line 94
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    if-lt v1, v2, :cond_0

    new-instance v1, Ll/֡᩸֫;

    invoke-direct {v1, v0}, Ll/֡᩸֫;-><init>(Landroid/media/MediaCodec$CryptoInfo;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-object v1, p0, Ll/ۚ᩸֫;->ۢ:Ll/֡᩸֫;

    return-void
.end method


# virtual methods
.method public final ֫()Landroid/media/MediaCodec$CryptoInfo;
    .locals 1

    .line 140
    iget-object v0, p0, Ll/ۚ᩸֫;->ܽ:Landroid/media/MediaCodec$CryptoInfo;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 159
    :cond_0
    iget-object v0, p0, Ll/ۚ᩸֫;->᩻:[I

    if-nez v0, :cond_1

    const/4 v0, 0x1

    new-array v0, v0, [I

    .line 160
    iput-object v0, p0, Ll/ۚ᩸֫;->᩻:[I

    .line 161
    iget-object v1, p0, Ll/ۚ᩸֫;->ܽ:Landroid/media/MediaCodec$CryptoInfo;

    iput-object v0, v1, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    .line 163
    :cond_1
    iget-object v0, p0, Ll/ۚ᩸֫;->᩻:[I

    const/4 v1, 0x0

    aget v2, v0, v1

    add-int/2addr v2, p1

    aput v2, v0, v1

    return-void
.end method

.method public final ֫(I[I[I[B[BIII)V
    .locals 1

    .line 109
    iput p1, p0, Ll/ۚ᩸֫;->᩷:I

    .line 110
    iput-object p2, p0, Ll/ۚ᩸֫;->᩻:[I

    .line 111
    iput-object p3, p0, Ll/ۚ᩸֫;->ۜ:[I

    .line 112
    iput-object p4, p0, Ll/ۚ᩸֫;->ܿ:[B

    .line 113
    iput-object p5, p0, Ll/ۚ᩸֫;->ᩳ:[B

    .line 114
    iput p6, p0, Ll/ۚ᩸֫;->ܳ:I

    .line 115
    iput p7, p0, Ll/ۚ᩸֫;->ۧ:I

    .line 116
    iput p8, p0, Ll/ۚ᩸֫;->֫:I

    .line 119
    iget-object v0, p0, Ll/ۚ᩸֫;->ܽ:Landroid/media/MediaCodec$CryptoInfo;

    iput p1, v0, Landroid/media/MediaCodec$CryptoInfo;->numSubSamples:I

    .line 120
    iput-object p2, v0, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    .line 121
    iput-object p3, v0, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfEncryptedData:[I

    .line 122
    iput-object p4, v0, Landroid/media/MediaCodec$CryptoInfo;->key:[B

    .line 123
    iput-object p5, v0, Landroid/media/MediaCodec$CryptoInfo;->iv:[B

    .line 124
    iput p6, v0, Landroid/media/MediaCodec$CryptoInfo;->mode:I

    .line 125
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x18

    if-lt p1, p2, :cond_0

    .line 155
    iget-object p1, p0, Ll/ۚ᩸֫;->ۢ:Ll/֡᩸֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    invoke-static {p1, p7, p8}, Ll/֡᩸֫;->֫(Ll/֡᩸֫;II)V

    :cond_0
    return-void
.end method
