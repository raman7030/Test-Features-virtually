.class public final Ll/ۜᩴ᩵;
.super Ll/ᩳᩴ᩵;
.source "B9ZD"


# instance fields
.field public ܿۧ:I


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;Ljava/lang/String;I)V
    .locals 2

    const/16 v0, 0x25

    const/16 v1, 0x23

    .line 40
    invoke-direct {p0, p1, v0, v1}, Ll/ᩳᩴ᩵;-><init>(Ll/֨ۡ᩵;BB)V

    .line 41
    iput-object p2, p0, Ll/ᩳᩴ᩵;->ۗ֫:Ljava/lang/String;

    .line 42
    iput p3, p0, Ll/ۜᩴ᩵;->ܿۧ:I

    const/4 p1, -0x1

    .line 43
    iput p1, p0, Ll/ᩳᩴ᩵;->֫ۧ:I

    const/4 p1, 0x6

    .line 44
    iput p1, p0, Ll/ᩳᩴ᩵;->ۙ֫:I

    const/4 p1, 0x1

    .line 45
    iput p1, p0, Ll/ᩳᩴ᩵;->᩶֫:I

    const/4 p1, 0x2

    .line 47
    iput p1, p0, Ll/ᩳᩴ᩵;->ܰ֫:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 93
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "TransPeekNamedPipe["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-super {p0}, Ll/ᩳᩴ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",pipeName="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ᩳᩴ᩵;->ۗ֫:Ljava/lang/String;

    const-string v3, "]"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 93
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۜ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ([B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ᩷(I[B)I
    .locals 2

    add-int/lit8 v0, p1, 0x1

    .line 53
    invoke-virtual {p0}, Ll/ᩳᩴ᩵;->ۡ֫()B

    move-result v1

    aput-byte v1, p2, p1

    add-int/lit8 p1, p1, 0x2

    const/4 v1, 0x0

    .line 54
    aput-byte v1, p2, v0

    .line 56
    iget v0, p0, Ll/ۜᩴ᩵;->ܿۧ:I

    int-to-long v0, v0

    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    const/4 p1, 0x4

    return p1
.end method
