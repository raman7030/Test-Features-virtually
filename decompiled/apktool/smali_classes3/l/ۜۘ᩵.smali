.class public final Ll/ۜۘ᩵;
.super Ll/ۤۖ᩵;
.source "JA0A"

# interfaces
.implements Ll/ۧۖ᩵;


# instance fields
.field public ۗ֫:I

.field public ۙ֫:I

.field public ۤ֫:I

.field public ۫֫:B

.field public ۬֫:I

.field public ܶ֫:I

.field public ᩶֫:I

.field public ᩸֫:I

.field public ᩹֫:I


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;Ljava/lang/String;IIIII)V
    .locals 1

    const/16 v0, -0x5e

    .line 112
    invoke-direct {p0, p1, v0, p2}, Ll/ۤۖ᩵;-><init>(Ll/֨ۡ᩵;BLjava/lang/String;)V

    or-int/lit16 p1, p4, 0x89

    .line 114
    iput p1, p0, Ll/ۜۘ᩵;->᩹֫:I

    .line 117
    iput p6, p0, Ll/ۜۘ᩵;->᩶֫:I

    .line 120
    iput p5, p0, Ll/ۜۘ᩵;->ۤ֫:I

    and-int/lit8 p1, p3, 0x40

    const/4 p2, 0x3

    const/4 p4, 0x2

    const/16 p5, 0x10

    const/16 p6, 0x40

    if-ne p1, p6, :cond_1

    and-int/lit8 p1, p3, 0x10

    if-ne p1, p5, :cond_0

    const/4 p1, 0x5

    .line 127
    iput p1, p0, Ll/ۜۘ᩵;->ܶ֫:I

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    .line 129
    iput p1, p0, Ll/ۜۘ᩵;->ܶ֫:I

    goto :goto_0

    :cond_1
    and-int/lit8 p1, p3, 0x10

    if-ne p1, p5, :cond_3

    const/16 p1, 0x20

    and-int/2addr p3, p1

    if-ne p3, p1, :cond_2

    .line 137
    iput p4, p0, Ll/ۜۘ᩵;->ܶ֫:I

    goto :goto_0

    .line 139
    :cond_2
    iput p2, p0, Ll/ۜۘ᩵;->ܶ֫:I

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    .line 142
    iput p1, p0, Ll/ۜۘ᩵;->ܶ֫:I

    :goto_0
    and-int/lit8 p1, p7, 0x1

    if-nez p1, :cond_4

    or-int/lit8 p1, p7, 0x40

    .line 147
    iput p1, p0, Ll/ۜۘ᩵;->᩸֫:I

    goto :goto_1

    .line 149
    :cond_4
    iput p7, p0, Ll/ۜۘ᩵;->᩸֫:I

    .line 151
    :goto_1
    iput p4, p0, Ll/ۜۘ᩵;->ۗ֫:I

    .line 152
    iput-byte p2, p0, Ll/ۜۘ᩵;->۫֫:B

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 7

    .line 243
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SmbComNTCreateAndX["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 244
    invoke-super {p0}, Ll/ۤۖ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",flags=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۜۘ᩵;->ۙ֫:I

    const-string v3, ",rootDirectoryFid=0,desiredAccess=0x"

    const/4 v4, 0x2

    .line 0
    invoke-static {v2, v4, v3, v1}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v2, ",allocationSize=0,extFileAttributes=0x"

    iget v3, p0, Ll/ۜۘ᩵;->᩹֫:I

    const/4 v5, 0x4

    invoke-static {v3, v5, v2, v1}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 245
    iget v2, p0, Ll/ۜۘ᩵;->᩶֫:I

    const-string v3, ",shareAccess=0x"

    .line 0
    invoke-static {v2, v5, v3, v1}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 246
    iget v2, p0, Ll/ۜۘ᩵;->ۤ֫:I

    const-string v3, ",createDisposition=0x"

    .line 0
    invoke-static {v2, v5, v3, v1}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 247
    iget v2, p0, Ll/ۜۘ᩵;->ܶ֫:I

    const-string v3, ",createOptions=0x"

    .line 0
    invoke-static {v2, v5, v3, v1}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    const/16 v2, 0x8

    const-string v3, ",impersonationLevel=0x"

    iget v6, p0, Ll/ۜۘ᩵;->᩸֫:I

    invoke-static {v6, v2, v3, v1}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 248
    iget v2, p0, Ll/ۜۘ᩵;->ۗ֫:I

    const-string v3, ",securityFlags=0x"

    .line 0
    invoke-static {v2, v5, v3, v1}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 249
    iget-byte v2, p0, Ll/ۜۘ᩵;->۫֫:B

    const-string v3, ",name="

    .line 0
    invoke-static {v2, v4, v3, v1}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 249
    iget-object v2, p0, Ll/ۨۖ᩵;->ᩳ֫:Ljava/lang/String;

    const-string v3, "]"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 249
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۧ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Ll/֫ۖ᩵;
    .locals 1

    .line 163
    invoke-super {p0}, Ll/ۨۖ᩵;->ۧ()Ll/ۨۖ᩵;

    move-result-object v0

    check-cast v0, Ll/᩷ۘ᩵;

    return-object v0
.end method

.method public final ۧ(Ll/ᩴۡ᩵;)Ll/֫ۖ᩵;
    .locals 1

    .line 174
    new-instance v0, Ll/᩷ۘ᩵;

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/᩷ۘ᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 175
    invoke-virtual {p0, v0}, Ll/ۨۖ᩵;->֫(Ll/֫ۖ᩵;)V

    return-object v0
.end method

.method public final ۧ()Ll/ۨۖ᩵;
    .locals 1

    .line 163
    invoke-super {p0}, Ll/ۨۖ᩵;->ۧ()Ll/ۨۖ᩵;

    move-result-object v0

    check-cast v0, Ll/᩷ۘ᩵;

    return-object v0
.end method

.method public final ۧ()Ll/ܰ֨᩵;
    .locals 1

    .line 163
    invoke-super {p0}, Ll/ۨۖ᩵;->ۧ()Ll/ۨۖ᩵;

    move-result-object v0

    check-cast v0, Ll/᩷ۘ᩵;

    return-object v0
.end method

.method public final ܺ֫()V
    .locals 1

    .line 184
    iget v0, p0, Ll/ۜۘ᩵;->ۙ֫:I

    or-int/lit8 v0, v0, 0x16

    iput v0, p0, Ll/ۜۘ᩵;->ۙ֫:I

    return-void
.end method

.method public final ܽ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܿ(I[B)I
    .locals 3

    .line 223
    iget-object v0, p0, Ll/ۨۖ᩵;->ᩳ֫:Ljava/lang/String;

    invoke-virtual {p0, v0, p1, p2}, Ll/ۨۖ᩵;->֫(Ljava/lang/String;I[B)I

    move-result p1

    .line 224
    invoke-virtual {p0}, Ll/ۨۖ᩵;->ۢ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۨۖ᩵;->ᩳ֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    int-to-long v0, v0

    iget v2, p0, Ll/ۜۘ᩵;->۬֫:I

    invoke-static {v0, v1, v2, p2}, Ll/֫֡᩵;->֫(JI[B)V

    return p1
.end method

.method public final ᩻(I[B)I
    .locals 4

    add-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    .line 192
    aput-byte v1, p2, p1

    .line 194
    iput v0, p0, Ll/ۜۘ᩵;->۬֫:I

    add-int/lit8 v0, p1, 0x3

    .line 196
    iget v2, p0, Ll/ۜۘ᩵;->ۙ֫:I

    int-to-long v2, v2

    invoke-static {v2, v3, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x7

    int-to-long v1, v1

    .line 198
    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0xb

    .line 200
    iget v1, p0, Ll/ۜۘ᩵;->᩹֫:I

    int-to-long v1, v1

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0xf

    const-wide/16 v1, 0x0

    .line 202
    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->ܽ(JI[B)V

    add-int/lit8 v0, p1, 0x17

    .line 204
    iget v1, p0, Ll/ۜۘ᩵;->᩶֫:I

    int-to-long v1, v1

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x1b

    .line 206
    iget v1, p0, Ll/ۜۘ᩵;->ۤ֫:I

    int-to-long v1, v1

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x1f

    .line 208
    iget v1, p0, Ll/ۜۘ᩵;->ܶ֫:I

    int-to-long v1, v1

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x23

    .line 210
    iget v1, p0, Ll/ۜۘ᩵;->᩸֫:I

    int-to-long v1, v1

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x27

    .line 212
    iget v1, p0, Ll/ۜۘ᩵;->ۗ֫:I

    int-to-long v1, v1

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x2b

    add-int/lit8 v1, p1, 0x2c

    .line 214
    iget-byte v2, p0, Ll/ۜۘ᩵;->۫֫:B

    aput-byte v2, p2, v0

    sub-int/2addr v1, p1

    return v1
.end method
