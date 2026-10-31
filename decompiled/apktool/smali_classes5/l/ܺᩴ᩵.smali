.class public final Ll/ܺᩴ᩵;
.super Ll/ᩳᩴ᩵;
.source "F9Y1"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/֨ۡ᩵;)V
    .locals 2

    const/16 v0, 0x25

    const/16 v1, 0x53

    .line 35
    invoke-direct {p0, p2, v0, v1}, Ll/ᩳᩴ᩵;-><init>(Ll/֨ۡ᩵;BB)V

    .line 36
    iput-object p1, p0, Ll/ᩳᩴ᩵;->ۗ֫:Ljava/lang/String;

    const/4 p1, -0x1

    .line 37
    iput p1, p0, Ll/ᩳᩴ᩵;->֫ۧ:I

    const/4 p1, 0x0

    .line 38
    iput p1, p0, Ll/ᩳᩴ᩵;->ۙ֫:I

    .line 39
    iput p1, p0, Ll/ᩳᩴ᩵;->᩶֫:I

    const/4 p1, 0x2

    .line 41
    iput p1, p0, Ll/ᩳᩴ᩵;->ܰ֫:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 87
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "TransWaitNamedPipe["

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

    .line 87
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
    .locals 3

    add-int/lit8 v0, p1, 0x1

    .line 47
    invoke-virtual {p0}, Ll/ᩳᩴ᩵;->ۡ֫()B

    move-result v1

    aput-byte v1, p2, p1

    add-int/lit8 v1, p1, 0x2

    const/4 v2, 0x0

    .line 48
    aput-byte v2, p2, v0

    add-int/lit8 p1, p1, 0x3

    .line 49
    aput-byte v2, p2, v1

    .line 50
    aput-byte v2, p2, p1

    const/4 p1, 0x4

    return p1
.end method
