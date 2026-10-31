.class public final Ll/᩷ۘ᩵;
.super Ll/ۤۖ᩵;
.source "K9W0"

# interfaces
.implements Ll/ܳۖ᩵;


# instance fields
.field public ۗ֫:Z

.field public ۙ֫:I

.field public ۛ֫:I

.field public ۟֫:B

.field public ۤ֫:I

.field public ۨ֫:Z

.field public ۫֫:I

.field public ۬֫:J

.field public ܰ֫:J

.field public ܶ֫:J

.field public ᩶֫:J

.field public ᩸֫:J

.field public ᩹֫:I

.field public ᩺֫:J


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Ll/ۤۖ᩵;-><init>(Ll/֨ۡ᩵;)V

    return-void
.end method


# virtual methods
.method public final getAttributes()I
    .locals 1

    .line 107
    iget v0, p0, Ll/᩷ۘ᩵;->۫֫:I

    return v0
.end method

.method public final getSize()J
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 246
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SmbComNTCreateAndXResponse["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 247
    invoke-super {p0}, Ll/ۤۖ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",oplockLevel="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v2, p0, Ll/᩷ۘ᩵;->۟֫:B

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",fid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/᩷ۘ᩵;->ۤ֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",createAction=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/᩷ۘ᩵;->᩹֫:I

    const/4 v3, 0x4

    .line 248
    invoke-static {v2, v3}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",creationTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/util/Date;

    iget-wide v4, p0, Ll/᩷ۘ᩵;->᩶֫:J

    invoke-direct {v2, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",lastAccessTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/util/Date;

    iget-wide v4, p0, Ll/᩷ۘ᩵;->᩺֫:J

    invoke-direct {v2, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",lastWriteTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/util/Date;

    iget-wide v4, p0, Ll/᩷ۘ᩵;->ܰ֫:J

    invoke-direct {v2, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",changeTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/util/Date;

    iget-wide v4, p0, Ll/᩷ۘ᩵;->᩸֫:J

    invoke-direct {v2, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",extFileAttributes=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/᩷ۘ᩵;->۫֫:I

    const-string v4, ",allocationSize="

    .line 0
    invoke-static {v2, v3, v4, v1}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 250
    iget-wide v2, p0, Ll/᩷ۘ᩵;->ܶ֫:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",endOfFile="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ll/᩷ۘ᩵;->۬֫:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",fileType="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/᩷ۘ᩵;->ۛ֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",deviceState="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/᩷ۘ᩵;->ۙ֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",directory="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Ll/᩷ۘ᩵;->ۗ֫:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۖ֫()I
    .locals 1

    .line 91
    iget v0, p0, Ll/᩷ۘ᩵;->ۤ֫:I

    return v0
.end method

.method public final ۘ֫()I
    .locals 1

    .line 59
    iget v0, p0, Ll/᩷ۘ᩵;->ۛ֫:I

    return v0
.end method

.method public final ۛ()J
    .locals 2

    .line 163
    iget-wide v0, p0, Ll/᩷ۘ᩵;->ܰ֫:J

    return-wide v0
.end method

.method public final ۧ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܺ֫()J
    .locals 2

    .line 179
    iget-wide v0, p0, Ll/᩷ۘ᩵;->۬֫:J

    return-wide v0
.end method

.method public final ܽ(I[B)I
    .locals 2

    add-int/lit8 v0, p1, 0x1

    .line 210
    aget-byte v1, p2, p1

    iput-byte v1, p0, Ll/᩷ۘ᩵;->۟֫:B

    .line 211
    invoke-static {v0, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/᩷ۘ᩵;->ۤ֫:I

    add-int/lit8 v0, p1, 0x3

    .line 213
    invoke-static {v0, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    iput v0, p0, Ll/᩷ۘ᩵;->᩹֫:I

    add-int/lit8 v0, p1, 0x7

    .line 215
    invoke-static {v0, p2}, Ll/֫֡᩵;->ᩳ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩷ۘ᩵;->᩶֫:J

    add-int/lit8 v0, p1, 0xf

    .line 217
    invoke-static {v0, p2}, Ll/֫֡᩵;->ᩳ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩷ۘ᩵;->᩺֫:J

    add-int/lit8 v0, p1, 0x17

    .line 219
    invoke-static {v0, p2}, Ll/֫֡᩵;->ᩳ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩷ۘ᩵;->ܰ֫:J

    add-int/lit8 v0, p1, 0x1f

    .line 221
    invoke-static {v0, p2}, Ll/֫֡᩵;->ᩳ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩷ۘ᩵;->᩸֫:J

    add-int/lit8 v0, p1, 0x27

    .line 223
    invoke-static {v0, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    iput v0, p0, Ll/᩷ۘ᩵;->۫֫:I

    add-int/lit8 v0, p1, 0x2b

    .line 225
    invoke-static {v0, p2}, Ll/֫֡᩵;->ܽ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩷ۘ᩵;->ܶ֫:J

    add-int/lit8 v0, p1, 0x33

    .line 227
    invoke-static {v0, p2}, Ll/֫֡᩵;->ܽ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩷ۘ᩵;->۬֫:J

    add-int/lit8 v0, p1, 0x3b

    .line 229
    invoke-static {v0, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/᩷ۘ᩵;->ۛ֫:I

    add-int/lit8 v0, p1, 0x3d

    .line 231
    invoke-static {v0, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/᩷ۘ᩵;->ۙ֫:I

    add-int/lit8 v0, p1, 0x3f

    add-int/lit8 v1, p1, 0x40

    .line 233
    aget-byte p2, p2, v0

    and-int/lit16 p2, p2, 0xff

    if-lez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Ll/᩷ۘ᩵;->ۗ֫:Z

    sub-int/2addr v1, p1

    return v1
.end method

.method public final ܿ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ᩴ֫()Z
    .locals 1

    .line 67
    iget-boolean v0, p0, Ll/᩷ۘ᩵;->ۨ֫:Z

    return v0
.end method

.method public final ᩵֫()V
    .locals 1

    const/4 v0, 0x1

    .line 75
    iput-boolean v0, p0, Ll/᩷ۘ᩵;->ۨ֫:Z

    return-void
.end method

.method public final ᩻(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
