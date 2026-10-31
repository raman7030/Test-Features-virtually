.class public Ll/᩸᩸֫;
.super Ll/ۘ᩸֫;
.source "28PU"


# instance fields
.field public ۗ:Ll/۠ᩴ֫;

.field public ۙ:Ljava/nio/ByteBuffer;

.field public ۛ:Z

.field public ۤ:J

.field public ۫:Ljava/nio/ByteBuffer;

.field public final ۬:I

.field public final ᩶:Ll/ۚ᩸֫;

.field public final ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "media3.decoder"

    .line 38
    invoke-static {v0}, Ll/ܽ᩵֫;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 146
    new-instance v0, Ll/ۚ᩸֫;

    invoke-direct {v0}, Ll/ۚ᩸֫;-><init>()V

    iput-object v0, p0, Ll/᩸᩸֫;->᩶:Ll/ۚ᩸֫;

    .line 147
    iput p1, p0, Ll/᩸᩸֫;->᩹:I

    .line 148
    iput p2, p0, Ll/᩸᩸֫;->۬:I

    return-void
.end method

.method private ᩻(I)Ljava/nio/ByteBuffer;
    .locals 5

    const/4 v0, 0x1

    .line 238
    iget v1, p0, Ll/᩸᩸֫;->᩹:I

    if-ne v1, v0, :cond_0

    .line 239
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x2

    if-ne v1, v0, :cond_1

    .line 241
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1

    .line 243
    :cond_1
    iget-object v0, p0, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_2

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    .line 244
    :goto_0
    new-instance v1, Ll/ܶ᩸֫;

    const-string v2, " < "

    const-string v3, ")"

    const-string v4, "Buffer too small ("

    .line 0
    invoke-static {v4, v0, v2, v3, p1}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    .line 61
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 244
    throw v1
.end method


# virtual methods
.method public final ֡()Z
    .locals 1

    const/high16 v0, 0x40000000    # 2.0f

    .line 208
    invoke-virtual {p0, v0}, Ll/ۘ᩸֫;->ᩳ(I)Z

    move-result v0

    return v0
.end method

.method public ۧ()V
    .locals 1

    .line 227
    invoke-super {p0}, Ll/ۘ᩸֫;->ۧ()V

    .line 228
    iget-object v0, p0, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_0

    .line 229
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 231
    :cond_0
    iget-object v0, p0, Ll/᩸᩸֫;->۫:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_1

    .line 232
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    :cond_1
    const/4 v0, 0x0

    .line 234
    iput-boolean v0, p0, Ll/᩸᩸֫;->ۛ:Z

    return-void
.end method

.method public final ܳ(I)V
    .locals 3
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "data"
        }
    .end annotation

    .line 180
    iget v0, p0, Ll/᩸᩸֫;->۬:I

    add-int/2addr p1, v0

    .line 181
    iget-object v0, p0, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_0

    .line 183
    invoke-direct {p0, p1}, Ll/᩸᩸֫;->᩻(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    return-void

    .line 187
    :cond_0
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v1

    .line 188
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v2

    add-int/2addr p1, v2

    if-lt v1, p1, :cond_1

    .line 191
    iput-object v0, p0, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    return-void

    .line 195
    :cond_1
    invoke-direct {p0, p1}, Ll/᩸᩸֫;->᩻(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 196
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    if-lez v2, :cond_2

    .line 199
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 200
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 203
    :cond_2
    iput-object p1, p0, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public final ᩴ()V
    .locals 1

    .line 217
    iget-object v0, p0, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_0

    .line 218
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 220
    :cond_0
    iget-object v0, p0, Ll/᩸᩸֫;->۫:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_1

    .line 221
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    :cond_1
    return-void
.end method
