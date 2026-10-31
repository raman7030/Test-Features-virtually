.class public final Ll/֨ᩴ᩵;
.super Ll/ᩳᩴ᩵;
.source "L9VN"


# instance fields
.field public ܿۧ:I


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;I)V
    .locals 2

    const/16 v0, 0x32

    const/4 v1, 0x3

    .line 42
    invoke-direct {p0, p1, v0, v1}, Ll/ᩳᩴ᩵;-><init>(Ll/֨ۡ᩵;BB)V

    .line 43
    iput p2, p0, Ll/֨ᩴ᩵;->ܿۧ:I

    const/4 p1, 0x2

    .line 44
    iput p1, p0, Ll/ᩳᩴ᩵;->ܽۧ:I

    const/4 p1, 0x0

    .line 45
    iput p1, p0, Ll/ᩳᩴ᩵;->ۧۧ:I

    .line 46
    iput p1, p0, Ll/ᩳᩴ᩵;->ۙ֫:I

    const/16 p1, 0x320

    .line 47
    iput p1, p0, Ll/ᩳᩴ᩵;->᩶֫:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 120
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Trans2QueryFSInformation["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    invoke-super {p0}, Ll/ᩳᩴ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",informationLevel=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/֨ᩴ᩵;->ܿۧ:I

    const/4 v3, 0x3

    invoke-static {v2, v3}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۜ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ([B)I
    .locals 3

    const/4 v0, -0x1

    .line 84
    iget v1, p0, Ll/֨ᩴ᩵;->ܿۧ:I

    if-eq v1, v0, :cond_1

    const/4 v0, 0x3

    if-ne v1, v0, :cond_0

    const/16 v0, 0x103

    goto :goto_0

    .line 90
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unhandled information level"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 v0, 0x1

    :goto_0
    int-to-long v0, v0

    const/4 v2, 0x0

    .line 64
    invoke-static {v0, v1, v2, p1}, Ll/֫֡᩵;->֫(JI[B)V

    const/4 p1, 0x2

    return p1
.end method

.method public final ᩷(I[B)I
    .locals 2

    add-int/lit8 v0, p1, 0x1

    .line 54
    invoke-virtual {p0}, Ll/ᩳᩴ᩵;->ۡ֫()B

    move-result v1

    aput-byte v1, p2, p1

    const/4 p1, 0x0

    .line 55
    aput-byte p1, p2, v0

    const/4 p1, 0x2

    return p1
.end method
