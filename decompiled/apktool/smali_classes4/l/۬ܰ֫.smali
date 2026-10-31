.class public final Ll/۬ܰ֫;
.super Ll/᩸᩸֫;
.source "B8M6"


# instance fields
.field public ۨ:J

.field public ܰ:I

.field public ᩺:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 132
    invoke-direct {p0, v0, v1}, Ll/᩸᩸֫;-><init>(II)V

    const/16 v0, 0x20

    .line 46
    iput v0, p0, Ll/۬ܰ֫;->᩺:I

    return-void
.end method


# virtual methods
.method public final ֨()I
    .locals 1

    .line 79
    iget v0, p0, Ll/۬ܰ֫;->ܰ:I

    return v0
.end method

.method public final ֫(Ll/᩸᩸֫;)Z
    .locals 4

    .line 96
    invoke-virtual {p1}, Ll/᩸᩸֫;->֡()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 97
    invoke-virtual {p1}, Ll/ۘ᩸֫;->ܿ()Z

    move-result v0

    xor-int/2addr v0, v1

    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 98
    invoke-virtual {p1}, Ll/ۘ᩸֫;->᩻()Z

    move-result v0

    xor-int/2addr v0, v1

    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 118
    invoke-virtual {p0}, Ll/۬ܰ֫;->۠()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 122
    :cond_0
    iget v0, p0, Ll/۬ܰ֫;->ܰ:I

    iget v2, p0, Ll/۬ܰ֫;->᩺:I

    if-lt v0, v2, :cond_1

    goto :goto_0

    .line 125
    :cond_1
    iget-object v0, p1, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_2

    .line 126
    iget-object v2, p0, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    if-eqz v2, :cond_2

    .line 128
    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    move-result v2

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    add-int/2addr v0, v2

    const v2, 0x2ee000

    if-le v0, v2, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 102
    :cond_2
    :goto_1
    iget v0, p0, Ll/۬ܰ֫;->ܰ:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/۬ܰ֫;->ܰ:I

    if-nez v0, :cond_3

    .line 103
    iget-wide v2, p1, Ll/᩸᩸֫;->ۤ:J

    iput-wide v2, p0, Ll/᩸᩸֫;->ۤ:J

    .line 104
    invoke-virtual {p1}, Ll/ۘ᩸֫;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 105
    invoke-virtual {p0, v1}, Ll/ۘ᩸֫;->ܿ(I)V

    .line 108
    :cond_3
    iget-object v0, p1, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_4

    .line 110
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    invoke-virtual {p0, v2}, Ll/᩸᩸֫;->ܳ(I)V

    .line 111
    iget-object v2, p0, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 113
    :cond_4
    iget-wide v2, p1, Ll/᩸᩸֫;->ۤ:J

    iput-wide v2, p0, Ll/۬ܰ֫;->ۨ:J

    return v1
.end method

.method public final ۚ()J
    .locals 2

    .line 74
    iget-wide v0, p0, Ll/۬ܰ֫;->ۨ:J

    return-wide v0
.end method

.method public final ۠()Z
    .locals 1

    .line 84
    iget v0, p0, Ll/۬ܰ֫;->ܰ:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()V
    .locals 1

    .line 51
    invoke-super {p0}, Ll/᩸᩸֫;->ۧ()V

    const/4 v0, 0x0

    .line 52
    iput v0, p0, Ll/۬ܰ֫;->ܰ:I

    return-void
.end method

.method public final ᩻(I)V
    .locals 1

    if-lez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 57
    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 58
    iput p1, p0, Ll/۬ܰ֫;->᩺:I

    return-void
.end method
