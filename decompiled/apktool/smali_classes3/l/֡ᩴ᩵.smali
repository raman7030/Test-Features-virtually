.class public final Ll/֡ᩴ᩵;
.super Ll/ᩳᩴ᩵;
.source "G9V0"


# instance fields
.field public final ܳۧ:Ll/ܿ֫ܽ;

.field public ܿۧ:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/֨ۡ᩵;)V
    .locals 2

    const/16 v0, 0x32

    const/16 v1, 0x10

    .line 42
    invoke-direct {p0, p2, v0, v1}, Ll/ᩳᩴ᩵;-><init>(Ll/֨ۡ᩵;BB)V

    const/4 p2, 0x3

    .line 32
    iput p2, p0, Ll/֡ᩴ᩵;->ܿۧ:I

    .line 43
    new-instance p2, Ll/ܿ֫ܽ;

    invoke-direct {p2, p1}, Ll/ܿ֫ܽ;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Ll/֡ᩴ᩵;->ܳۧ:Ll/ܿ֫ܽ;

    const/4 p1, 0x0

    .line 44
    iput p1, p0, Ll/ᩳᩴ᩵;->ۧۧ:I

    .line 45
    iput p1, p0, Ll/ᩳᩴ᩵;->ۙ֫:I

    const/16 p1, 0x1000

    .line 46
    iput p1, p0, Ll/ᩳᩴ᩵;->᩶֫:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 104
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Trans2GetDfsReferral["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    invoke-super {p0}, Ll/ᩳᩴ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",maxReferralLevel=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/֡ᩴ᩵;->ܿۧ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",filename="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۨۖ᩵;->ᩳ֫:Ljava/lang/String;

    const-string v3, "]"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 105
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۜ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ([B)I
    .locals 2

    const/4 v0, 0x0

    .line 73
    iget-object v1, p0, Ll/֡ᩴ᩵;->ܳۧ:Ll/ܿ֫ܽ;

    invoke-virtual {v1, v0, p1}, Ll/ܿ֫ܽ;->֫(I[B)I

    move-result p1

    return p1
.end method

.method public final ᩷(I[B)I
    .locals 2

    add-int/lit8 v0, p1, 0x1

    .line 64
    invoke-virtual {p0}, Ll/ᩳᩴ᩵;->ۡ֫()B

    move-result v1

    aput-byte v1, p2, p1

    const/4 p1, 0x0

    .line 65
    aput-byte p1, p2, v0

    const/4 p1, 0x2

    return p1
.end method
