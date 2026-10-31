.class public final Ll/᩸ۘ᩵;
.super Ll/ۤۖ᩵;
.source "Y9SA"


# instance fields
.field public ۙ֫:Ljava/lang/String;

.field public ܶ֫:[B

.field public ᩶֫:Ljava/lang/String;

.field public ᩸֫:Z

.field public ᩹֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;Ll/ۨۖ᩵;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Ll/ۤۖ᩵;-><init>(Ll/֨ۡ᩵;Ll/ۨۖ᩵;)V

    const-string p1, ""

    .line 33
    iput-object p1, p0, Ll/᩸ۘ᩵;->᩶֫:Ljava/lang/String;

    .line 34
    iput-object p1, p0, Ll/᩸ۘ᩵;->᩹֫:Ljava/lang/String;

    .line 35
    iput-object p1, p0, Ll/᩸ۘ᩵;->ۙ֫:Ljava/lang/String;

    const/4 p1, 0x0

    .line 38
    iput-object p1, p0, Ll/᩸ۘ᩵;->ܶ֫:[B

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 140
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SmbComSessionSetupAndXResponse["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    invoke-super {p0}, Ll/ۤۖ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",isLoggedInAsGuest="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Ll/᩸ۘ᩵;->᩸֫:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ",nativeOs="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/᩸ۘ᩵;->᩶֫:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",nativeLanMan="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/᩸ۘ᩵;->᩹֫:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",primaryDomain="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/᩸ۘ᩵;->ۙ֫:Ljava/lang/String;

    const-string v3, "]"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 141
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۖ֫()Z
    .locals 1

    .line 78
    iget-boolean v0, p0, Ll/᩸ۘ᩵;->᩸֫:Z

    return v0
.end method

.method public final ۧ(I[B)I
    .locals 3

    .line 120
    invoke-virtual {p0}, Ll/ۨۖ᩵;->ܳ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 121
    iget-object v0, p0, Ll/᩸ۘ᩵;->ܶ֫:[B

    const/4 v1, 0x0

    array-length v2, v0

    invoke-static {p2, p1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 122
    iget-object v0, p0, Ll/᩸ۘ᩵;->ܶ֫:[B

    array-length v0, v0

    add-int/2addr v0, p1

    goto :goto_0

    :cond_0
    move v0, p1

    .line 125
    :goto_0
    invoke-virtual {p0, v0, p2}, Ll/ۨۖ᩵;->ᩳ(I[B)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/᩸ۘ᩵;->᩶֫:Ljava/lang/String;

    .line 126
    invoke-virtual {p0, v0, v1}, Ll/ۨۖ᩵;->֫(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v1, v0

    .line 127
    invoke-virtual {p0}, Ll/ۨۖ᩵;->ۢ֫()Z

    move-result v0

    invoke-virtual {p0, p2, v1, v0}, Ll/ۨۖ᩵;->֫([BIZ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩸ۘ᩵;->᩹֫:Ljava/lang/String;

    .line 128
    invoke-virtual {p0, v1, v0}, Ll/ۨۖ᩵;->֫(ILjava/lang/String;)I

    move-result v0

    add-int/2addr v0, v1

    .line 129
    invoke-virtual {p0}, Ll/ۨۖ᩵;->ܳ֫()Z

    move-result v1

    if-nez v1, :cond_1

    .line 130
    invoke-virtual {p0}, Ll/ۨۖ᩵;->ۢ֫()Z

    move-result v1

    invoke-virtual {p0, p2, v0, v1}, Ll/ۨۖ᩵;->֫([BIZ)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ll/᩸ۘ᩵;->ۙ֫:Ljava/lang/String;

    .line 131
    invoke-virtual {p0, v0, p2}, Ll/ۨۖ᩵;->֫(ILjava/lang/String;)I

    move-result p2

    add-int/2addr v0, p2

    :cond_1
    sub-int/2addr v0, p1

    return v0
.end method

.method public final ܺ֫()[B
    .locals 1

    .line 86
    iget-object v0, p0, Ll/᩸ۘ᩵;->ܶ֫:[B

    return-object v0
.end method

.method public final ܽ(I[B)I
    .locals 2

    .line 105
    aget-byte v0, p2, p1

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Ll/᩸ۘ᩵;->᩸֫:Z

    add-int/lit8 v0, p1, 0x2

    .line 107
    invoke-virtual {p0}, Ll/ۨۖ᩵;->ܳ֫()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 108
    invoke-static {v0, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result p2

    add-int/lit8 v0, p1, 0x4

    .line 110
    new-array p2, p2, [B

    iput-object p2, p0, Ll/᩸ۘ᩵;->ܶ֫:[B

    :cond_1
    sub-int/2addr v0, p1

    return v0
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
