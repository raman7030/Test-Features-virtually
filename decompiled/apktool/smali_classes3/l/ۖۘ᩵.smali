.class public final Ll/ۖۘ᩵;
.super Ll/ۤۖ᩵;
.source "99TX"

# interfaces
.implements Ll/ܳۖ᩵;


# instance fields
.field public ۗ֫:I

.field public ۙ֫:I

.field public ۤ֫:I

.field public ۫֫:J

.field public ۬֫:I

.field public ܶ֫:I

.field public ᩶֫:I

.field public ᩸֫:I

.field public ᩹֫:I


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Ll/ۤۖ᩵;-><init>(Ll/֨ۡ᩵;)V

    return-void
.end method


# virtual methods
.method public final getAttributes()I
    .locals 1

    .line 93
    iget v0, p0, Ll/ۖۘ᩵;->᩶֫:I

    return v0
.end method

.method public final getSize()J
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 218
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SmbComOpenAndXResponse["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 219
    invoke-super {p0}, Ll/ۤۖ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",fid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۖۘ᩵;->᩹֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",fileAttributes="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۖۘ᩵;->᩶֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",lastWriteTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ll/ۖۘ᩵;->۫֫:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",dataSize="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۖۘ᩵;->ۙ֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",grantedAccess="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۖۘ᩵;->۬֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",fileType="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۖۘ᩵;->ۗ֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",deviceState="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۖۘ᩵;->᩸֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",action="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۖۘ᩵;->ܶ֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",serverFid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۖۘ᩵;->ۤ֫:I

    const-string v3, "]"

    .line 0
    invoke-static {v2, v3, v1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 219
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۖ֫()I
    .locals 1

    .line 58
    iget v0, p0, Ll/ۖۘ᩵;->᩹֫:I

    return v0
.end method

.method public final ۘ֫()I
    .locals 1

    .line 112
    iget v0, p0, Ll/ۖۘ᩵;->ۗ֫:I

    return v0
.end method

.method public final ۛ()J
    .locals 2

    .line 145
    iget-wide v0, p0, Ll/ۖۘ᩵;->۫֫:J

    return-wide v0
.end method

.method public final ۧ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܺ֫()I
    .locals 1

    .line 66
    iget v0, p0, Ll/ۖۘ᩵;->ۙ֫:I

    return v0
.end method

.method public final ܽ(I[B)I
    .locals 4

    .line 187
    invoke-static {p1, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۖۘ᩵;->᩹֫:I

    add-int/lit8 v0, p1, 0x2

    .line 189
    invoke-static {v0, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۖۘ᩵;->᩶֫:I

    add-int/lit8 v0, p1, 0x4

    .line 90
    invoke-static {v0, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long v0, v0, v2

    .line 191
    iput-wide v0, p0, Ll/ۖۘ᩵;->۫֫:J

    add-int/lit8 v0, p1, 0x8

    .line 193
    invoke-static {v0, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    iput v0, p0, Ll/ۖۘ᩵;->ۙ֫:I

    add-int/lit8 v0, p1, 0xc

    .line 195
    invoke-static {v0, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۖۘ᩵;->۬֫:I

    add-int/lit8 v0, p1, 0xe

    .line 197
    invoke-static {v0, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۖۘ᩵;->ۗ֫:I

    add-int/lit8 v0, p1, 0x10

    .line 199
    invoke-static {v0, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۖۘ᩵;->᩸֫:I

    add-int/lit8 v0, p1, 0x12

    .line 201
    invoke-static {v0, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۖۘ᩵;->ܶ֫:I

    add-int/lit8 v0, p1, 0x14

    .line 203
    invoke-static {v0, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result p2

    iput p2, p0, Ll/ۖۘ᩵;->ۤ֫:I

    add-int/lit8 p2, p1, 0x1a

    sub-int/2addr p2, p1

    return p2
.end method

.method public final ܿ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ᩻(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
