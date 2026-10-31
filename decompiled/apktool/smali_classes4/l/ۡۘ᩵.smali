.class public final Ll/ۡۘ᩵;
.super Ll/ۨۖ᩵;
.source "Y9V3"

# interfaces
.implements Ll/᩷ۖ᩵;


# static fields
.field public static final ۗ֫:Ll/֫᩻֨;


# instance fields
.field public ֡֫:I

.field public ֨֫:I

.field public ۙ֫:Z

.field public ۚ֫:I

.field public ۠֫:I

.field public ܶ֫:I

.field public ᩶֫:I

.field public ᩸֫:Ll/ܰۖ᩵;

.field public ᩹֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 46
    const-class v0, Ll/ۡۘ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۡۘ᩵;->ۗ֫:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/ᩴۡ᩵;)V
    .locals 1

    .line 67
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۨۖ᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 68
    new-instance v0, Ll/ܰۖ᩵;

    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object v0, p0, Ll/ۡۘ᩵;->᩸֫:Ll/ܰۖ᩵;

    .line 69
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0}, Ll/ܰۡ᩵;->ᩳ()I

    move-result v0

    iput v0, p0, Ll/ۡۘ᩵;->֡֫:I

    .line 70
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0}, Ll/ܰۡ᩵;->᩻()I

    move-result v0

    iput v0, p0, Ll/ۡۘ᩵;->۠֫:I

    .line 71
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0}, Ll/ܰۡ᩵;->ۘ()I

    move-result v0

    iput v0, p0, Ll/ۡۘ᩵;->֨֫:I

    .line 72
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0}, Ll/ܰۡ᩵;->ܰ()I

    move-result v0

    iput v0, p0, Ll/ۡۘ᩵;->᩹֫:I

    .line 73
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0}, Ll/ܰۡ᩵;->ۛ()I

    move-result v0

    iput v0, p0, Ll/ۡۘ᩵;->ܶ֫:I

    .line 74
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0}, Ll/ܰۡ᩵;->ܽ֫()I

    move-result v0

    iput v0, p0, Ll/ۡۘ᩵;->᩶֫:I

    .line 75
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    check-cast p1, Ll/ܰۡ᩵;

    invoke-virtual {p1}, Ll/ܰۡ᩵;->ۡ֫()Z

    move-result p1

    iput-boolean p1, p0, Ll/ۡۘ᩵;->ۙ֫:Z

    return-void
.end method


# virtual methods
.method public final getSendBufferSize()I
    .locals 1

    .line 181
    iget v0, p0, Ll/ۡۘ᩵;->᩹֫:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 459
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SmbComNegotiateResponse["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 460
    invoke-super {p0}, Ll/ۨۖ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",wordCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۨۖ᩵;->ᩴ֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",dialectIndex="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۡۘ᩵;->ۚ֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",securityMode=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۡۘ᩵;->᩸֫:Ll/ܰۖ᩵;

    iget v3, v2, Ll/ܰۖ᩵;->ۡ:I

    const/4 v4, 0x1

    const-string v5, ",security="

    .line 0
    invoke-static {v3, v4, v5, v1}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 462
    iget v3, v2, Ll/ܰۖ᩵;->ۢ:I

    if-nez v3, :cond_0

    const-string v3, "share"

    goto :goto_0

    :cond_0
    const-string v3, "user"

    :goto_0
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ",encryptedPasswords="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v3, v2, Ll/ܰۖ᩵;->֫:Z

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ",maxMpxCount="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v2, Ll/ܰۖ᩵;->֡:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ",maxNumberVcs="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v2, Ll/ܰۖ᩵;->ܳ:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ",maxBufferSize="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v2, Ll/ܰۖ᩵;->ܿ:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ",maxRawSize="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v2, Ll/ܰۖ᩵;->᩻:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ",sessionKey=0x"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v2, Ll/ܰۖ᩵;->ۘ:I

    const-string v4, ",capabilities=0x"

    const/16 v5, 0x8

    .line 0
    invoke-static {v3, v5, v4, v1}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 465
    iget v3, v2, Ll/ܰۖ᩵;->᩷:I

    invoke-static {v3, v5}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ",serverTime="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Ljava/util/Date;

    iget-wide v4, v2, Ll/ܰۖ᩵;->ܺ:J

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ",serverTimeZone="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v2, Ll/ܰۖ᩵;->ۖ:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ",encryptionKeyLength="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v2, Ll/ܰۖ᩵;->ܽ:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ",byteCount="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Ll/ۨۖ᩵;->᩸:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ",oemDomainName="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v2, Ll/ܰۖ᩵;->ۜ:Ljava/lang/String;

    const-string v3, "]"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 465
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(Ll/ܰ֨᩵;)V
    .locals 1

    .line 324
    instance-of v0, p1, Ll/ۨۖ᩵;

    if-nez v0, :cond_0

    return-void

    .line 327
    :cond_0
    check-cast p1, Ll/ۨۖ᩵;

    iget-boolean v0, p0, Ll/ۡۘ᩵;->ۙ֫:Z

    invoke-virtual {p1, v0}, Ll/ۨۖ᩵;->ۧ(Z)V

    return-void
.end method

.method public final ֫(Ll/ᩴۡ᩵;)Z
    .locals 1

    .line 119
    invoke-virtual {p0}, Ll/ۨۖ᩵;->ۧ֫()Ll/֨ۡ᩵;

    move-result-object v0

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ᩴۡ᩵;Ll/ۜۖ᩵;)Z
    .locals 6

    .line 127
    iget v0, p0, Ll/ۡۘ᩵;->ۚ֫:I

    const/16 v1, 0xa

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    return v2

    .line 232
    :cond_0
    iget-object v0, p0, Ll/ۡۘ᩵;->᩸֫:Ll/ܰۖ᩵;

    iget v1, v0, Ll/ܰۖ᩵;->᩷:I

    const/high16 v3, -0x80000000

    and-int/2addr v1, v3

    sget-object v4, Ll/ۡۘ᩵;->ۗ֫:Ll/֫᩻֨;

    if-eq v1, v3, :cond_1

    iget v1, v0, Ll/ܰۖ᩵;->ܽ:I

    const/16 v5, 0x8

    if-eq v1, v5, :cond_1

    .line 233
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    check-cast v1, Ll/ܰۡ᩵;

    invoke-virtual {v1}, Ll/ܰۡ᩵;->ۢ()I

    move-result v1

    if-nez v1, :cond_1

    .line 234
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Unexpected encryption key length: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, v0, Ll/ܰۖ᩵;->ܽ:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v4, p1}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    return v2

    .line 238
    :cond_1
    invoke-interface {p2}, Ll/ۜۖ᩵;->۠()Z

    move-result v1

    if-nez v1, :cond_3

    iget-boolean v1, v0, Ll/ܰۖ᩵;->᩵:Z

    if-nez v1, :cond_3

    iget-boolean p2, v0, Ll/ܰۖ᩵;->ᩴ:Z

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    :cond_2
    iget p2, p0, Ll/ۡۘ᩵;->۠֫:I

    const v1, 0xffeb

    and-int/2addr p2, v1

    .line 245
    iput p2, p0, Ll/ۡۘ᩵;->۠֫:I

    goto :goto_0

    .line 239
    :cond_3
    iget v1, p0, Ll/ۡۘ᩵;->۠֫:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/ۡۘ᩵;->۠֫:I

    .line 240
    invoke-interface {p2}, Ll/ۜۖ᩵;->۠()Z

    move-result p2

    if-nez p2, :cond_4

    .line 349
    iget-boolean p2, v0, Ll/ܰۖ᩵;->᩵:Z

    if-eqz p2, :cond_5

    .line 241
    :cond_4
    iget p2, p0, Ll/ۡۘ᩵;->۠֫:I

    or-int/lit8 p2, p2, 0x10

    iput p2, p0, Ll/ۡۘ᩵;->۠֫:I

    .line 248
    :cond_5
    :goto_0
    invoke-interface {v4}, Ll/֫᩻֨;->֫()Z

    move-result p2

    if-eqz p2, :cond_8

    .line 249
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Signing "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 250
    iget v1, p0, Ll/ۡۘ᩵;->۠֫:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_6

    const-string v1, "enabled "

    goto :goto_1

    :cond_6
    const-string v1, "not-enabled "

    :goto_1
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    iget v1, p0, Ll/ۡۘ᩵;->۠֫:I

    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_7

    const-string v1, "required"

    goto :goto_2

    :cond_7
    const-string v1, "not-required"

    :goto_2
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 249
    invoke-interface {v4, p2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 254
    :cond_8
    iget p2, p0, Ll/ۡۘ᩵;->֨֫:I

    iget v1, v0, Ll/ܰۖ᩵;->֡:I

    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, p0, Ll/ۡۘ᩵;->֨֫:I

    const/4 v1, 0x1

    if-ge p2, v1, :cond_9

    .line 256
    iput v1, p0, Ll/ۡۘ᩵;->֨֫:I

    .line 257
    :cond_9
    iget p2, p0, Ll/ۡۘ᩵;->᩹֫:I

    iget v5, v0, Ll/ܰۖ᩵;->ܿ:I

    invoke-static {p2, v5}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, p0, Ll/ۡۘ᩵;->᩹֫:I

    .line 258
    iget p2, p0, Ll/ۡۘ᩵;->ܶ֫:I

    iget v5, v0, Ll/ܰۖ᩵;->ܿ:I

    invoke-static {p2, v5}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, p0, Ll/ۡۘ᩵;->ܶ֫:I

    .line 259
    iget p2, p0, Ll/ۡۘ᩵;->᩶֫:I

    iget v5, v0, Ll/ܰۖ᩵;->ܿ:I

    invoke-static {p2, v5}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, p0, Ll/ۡۘ᩵;->᩶֫:I

    .line 261
    iget p2, p0, Ll/ۡۘ᩵;->֡֫:I

    iget v0, v0, Ll/ܰۖ᩵;->᩷:I

    and-int/2addr p2, v0

    iput p2, p0, Ll/ۡۘ᩵;->֡֫:I

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_a

    or-int/2addr p2, v3

    .line 263
    iput p2, p0, Ll/ۡۘ᩵;->֡֫:I

    .line 265
    :cond_a
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p2

    check-cast p2, Ll/ܰۡ᩵;

    invoke-virtual {p2}, Ll/ܰۡ᩵;->ۡ֫()Z

    move-result p2

    if-nez p2, :cond_b

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_3

    .line 266
    :cond_b
    iget p2, p0, Ll/ۡۘ᩵;->֡֫:I

    or-int/lit8 p2, p2, 0x4

    iput p2, p0, Ll/ۡۘ᩵;->֡֫:I

    .line 269
    :goto_3
    iget p2, p0, Ll/ۡۘ᩵;->֡֫:I

    and-int/lit8 p2, p2, 0x4

    if-nez p2, :cond_c

    .line 271
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    iput-boolean v2, p0, Ll/ۡۘ᩵;->ۙ֫:Z

    .line 276
    iget p1, p0, Ll/ۡۘ᩵;->۠֫:I

    and-int/lit16 p1, p1, 0x7fff

    iput p1, p0, Ll/ۡۘ᩵;->۠֫:I

    goto :goto_4

    .line 279
    :cond_c
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    check-cast p1, Ll/ܰۡ᩵;

    invoke-virtual {p1}, Ll/ܰۡ᩵;->ۡ֫()Z

    move-result p1

    iput-boolean p1, p0, Ll/ۡۘ᩵;->ۙ֫:Z

    .line 282
    :goto_4
    iget-boolean p1, p0, Ll/ۡۘ᩵;->ۙ֫:Z

    if-eqz p1, :cond_d

    const-string p1, "Unicode is enabled"

    .line 283
    invoke-interface {v4, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    return v1

    :cond_d
    const-string p1, "Unicode is disabled"

    .line 285
    invoke-interface {v4, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    return v1
.end method

.method public final ۖ()Z
    .locals 1

    .line 349
    iget-object v0, p0, Ll/ۡۘ᩵;->᩸֫:Ll/ܰۖ᩵;

    iget-boolean v0, v0, Ll/ܰۖ᩵;->᩵:Z

    return v0
.end method

.method public final ۖ֫()I
    .locals 1

    .line 189
    iget v0, p0, Ll/ۡۘ᩵;->۠֫:I

    return v0
.end method

.method public final ۘ֫()I
    .locals 1

    .line 151
    iget v0, p0, Ll/ۡۘ᩵;->֨֫:I

    return v0
.end method

.method public final ۚ()Z
    .locals 2

    .line 338
    iget-object v0, p0, Ll/ۡۘ᩵;->᩸֫:Ll/ܰۖ᩵;

    iget-boolean v1, v0, Ll/ܰۖ᩵;->ᩴ:Z

    if-nez v1, :cond_1

    iget-boolean v0, v0, Ll/ܰۖ᩵;->᩵:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ۡ֫()I
    .locals 1

    .line 151
    iget v0, p0, Ll/ۡۘ᩵;->֨֫:I

    return v0
.end method

.method public final ۧ(I[B)I
    .locals 5

    .line 418
    iget-object v0, p0, Ll/ۡۘ᩵;->᩸֫:Ll/ܰۖ᩵;

    iget v1, v0, Ll/ܰۖ᩵;->᩷:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    const/4 v2, 0x0

    if-nez v1, :cond_2

    .line 419
    iget v1, v0, Ll/ܰۖ᩵;->ܽ:I

    new-array v3, v1, [B

    iput-object v3, v0, Ll/ܰۖ᩵;->ۧ:[B

    .line 420
    invoke-static {p2, p1, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 421
    iget v1, v0, Ll/ܰۖ᩵;->ܽ:I

    add-int v2, p1, v1

    .line 422
    iget v3, p0, Ll/ۨۖ᩵;->᩸:I

    if-le v3, v1, :cond_1

    .line 424
    iget v1, p0, Ll/ۡۘ᩵;->۠֫:I

    const v3, 0x8000

    and-int/2addr v1, v3

    const/16 v4, 0x100

    if-ne v1, v3, :cond_0

    .line 425
    invoke-static {v2, v4, p2}, Ll/ۤ֨᩵;->ۧ(II[B)I

    move-result v1

    .line 426
    invoke-static {v2, v1, p2}, Ll/ۤ֨᩵;->ܽ(II[B)Ljava/lang/String;

    move-result-object p2

    iput-object p2, v0, Ll/ܰۖ᩵;->ۜ:Ljava/lang/String;

    goto :goto_0

    .line 428
    :cond_0
    invoke-static {v2, v4, p2}, Ll/ۤ֨᩵;->֫(II[B)I

    move-result v1

    .line 429
    invoke-virtual {p0}, Ll/ۨۖ᩵;->ۧ֫()Ll/֨ۡ᩵;

    move-result-object v3

    invoke-static {p2, v2, v1, v3}, Ll/ۤ֨᩵;->֫([BIILl/֨ۡ᩵;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, v0, Ll/ܰۖ᩵;->ۜ:Ljava/lang/String;

    :goto_0
    add-int/2addr v2, v1

    goto :goto_1

    .line 433
    :cond_1
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2}, Ljava/lang/String;-><init>()V

    iput-object p2, v0, Ll/ܰۖ᩵;->ۜ:Ljava/lang/String;

    goto :goto_1

    :cond_2
    const/16 v1, 0x10

    new-array v3, v1, [B

    .line 436
    iput-object v3, v0, Ll/ܰۖ᩵;->ᩳ:[B

    .line 437
    invoke-static {p2, p1, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 438
    iget-object v3, v0, Ll/ܰۖ᩵;->ᩳ:[B

    array-length v3, v3

    add-int/2addr v3, p1

    .line 439
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4}, Ljava/lang/String;-><init>()V

    iput-object v4, v0, Ll/ܰۖ᩵;->ۜ:Ljava/lang/String;

    .line 441
    iget v4, p0, Ll/ۨۖ᩵;->᩸:I

    if-le v4, v1, :cond_3

    sub-int/2addr v4, v1

    .line 443
    iput v4, v0, Ll/ܰۖ᩵;->ܽ:I

    .line 444
    new-array v1, v4, [B

    iput-object v1, v0, Ll/ܰۖ᩵;->ۧ:[B

    .line 445
    invoke-static {p2, v3, v1, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 446
    sget-object p2, Ll/ۡۘ᩵;->ۗ֫:Ll/֫᩻֨;

    invoke-interface {p2}, Ll/֫᩻֨;->֫()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 447
    iget-object v1, v0, Ll/ܰۖ᩵;->ۧ:[B

    iget v0, v0, Ll/ܰۖ᩵;->ܽ:I

    .line 448
    invoke-static {v1, v2, v0}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Have initial token "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 447
    invoke-interface {p2, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_3
    move v2, v3

    :goto_1
    sub-int/2addr v2, p1

    return v2
.end method

.method public final ۧ(Ll/۟ܺ᩵;)V
    .locals 1

    .line 299
    instance-of v0, p1, Ll/ۨۖ᩵;

    if-nez v0, :cond_0

    goto :goto_2

    .line 303
    :cond_0
    check-cast p1, Ll/ۨۖ᩵;

    .line 305
    iget v0, p0, Ll/ۡۘ᩵;->۠֫:I

    invoke-virtual {p1, v0}, Ll/ۨۖ᩵;->ܳ(I)V

    .line 306
    invoke-virtual {p1}, Ll/ۨۖ᩵;->᩻֫()Z

    move-result v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Ll/ۡۘ᩵;->ۙ֫:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-virtual {p1, v0}, Ll/ۨۖ᩵;->ۧ(Z)V

    .line 307
    invoke-virtual {p1}, Ll/ۨۖ᩵;->ۢ֫()Z

    move-result v0

    if-eqz v0, :cond_3

    const v0, 0x8000

    .line 308
    invoke-virtual {p1, v0}, Ll/ۨۖ᩵;->ܳ(I)V

    .line 311
    :cond_3
    instance-of v0, p1, Ll/ᩳᩴ᩵;

    if-eqz v0, :cond_4

    .line 312
    check-cast p1, Ll/ᩳᩴ᩵;

    iget v0, p0, Ll/ۡۘ᩵;->᩹֫:I

    invoke-virtual {p1, v0}, Ll/ᩳᩴ᩵;->ۢ(I)V

    :cond_4
    :goto_2
    return-void
.end method

.method public final ۫()I
    .locals 1

    .line 97
    iget v0, p0, Ll/ۡۘ᩵;->᩶֫:I

    return v0
.end method

.method public final ܰ()Z
    .locals 1

    .line 211
    invoke-virtual {p0}, Ll/ۨۖ᩵;->ۧ֫()Ll/֨ۡ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0x1000

    invoke-virtual {p0, v0}, Ll/ۡۘ᩵;->ܽ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܺ()I
    .locals 1

    .line 170
    iget v0, p0, Ll/ۡۘ᩵;->ܶ֫:I

    return v0
.end method

.method public final ܺ֫()I
    .locals 1

    .line 135
    iget v0, p0, Ll/ۡۘ᩵;->֡֫:I

    return v0
.end method

.method public final ܽ(I[B)I
    .locals 6

    .line 377
    invoke-static {p1, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۡۘ᩵;->ۚ֫:I

    add-int/lit8 v1, p1, 0x2

    const/16 v2, 0xa

    if-le v0, v2, :cond_0

    sub-int/2addr v1, p1

    return v1

    :cond_0
    add-int/lit8 v0, p1, 0x3

    .line 382
    aget-byte v1, p2, v1

    and-int/lit16 v2, v1, 0xff

    iget-object v3, p0, Ll/ۡۘ᩵;->᩸֫:Ll/ܰۖ᩵;

    iput v2, v3, Ll/ܰۖ᩵;->ۡ:I

    and-int/lit8 v2, v1, 0x1

    .line 383
    iput v2, v3, Ll/ܰۖ᩵;->ۢ:I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-ne v2, v5, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 384
    :goto_0
    iput-boolean v2, v3, Ll/ܰۖ᩵;->֫:Z

    and-int/lit8 v2, v1, 0x4

    const/4 v5, 0x4

    if-ne v2, v5, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    .line 385
    :goto_1
    iput-boolean v2, v3, Ll/ܰۖ᩵;->ᩴ:Z

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3

    const/4 v4, 0x1

    .line 386
    :cond_3
    iput-boolean v4, v3, Ll/ܰۖ᩵;->᩵:Z

    .line 387
    invoke-static {v0, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, v3, Ll/ܰۖ᩵;->֡:I

    add-int/lit8 v0, p1, 0x5

    .line 389
    invoke-static {v0, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, v3, Ll/ܰۖ᩵;->ܳ:I

    add-int/lit8 v0, p1, 0x7

    .line 391
    invoke-static {v0, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    iput v0, v3, Ll/ܰۖ᩵;->ܿ:I

    add-int/lit8 v0, p1, 0xb

    .line 393
    invoke-static {v0, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    iput v0, v3, Ll/ܰۖ᩵;->᩻:I

    add-int/lit8 v0, p1, 0xf

    .line 395
    invoke-static {v0, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    iput v0, v3, Ll/ܰۖ᩵;->ۘ:I

    add-int/lit8 v0, p1, 0x13

    .line 397
    invoke-static {v0, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    iput v0, v3, Ll/ܰۖ᩵;->᩷:I

    add-int/lit8 v0, p1, 0x17

    .line 399
    invoke-static {v0, p2}, Ll/֫֡᩵;->ᩳ(I[B)J

    move-result-wide v0

    iput-wide v0, v3, Ll/ܰۖ᩵;->ܺ:J

    add-int/lit8 v0, p1, 0x1f

    .line 401
    invoke-static {v0, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    const/16 v1, 0x7fff

    if-le v0, v1, :cond_4

    const/high16 v1, 0x10000

    sub-int/2addr v1, v0

    mul-int/lit8 v0, v1, -0x1

    .line 406
    :cond_4
    iput v0, v3, Ll/ܰۖ᩵;->ۖ:I

    add-int/lit8 v0, p1, 0x21

    add-int/lit8 v1, p1, 0x22

    .line 408
    aget-byte p2, p2, v0

    and-int/lit16 p2, p2, 0xff

    iput p2, v3, Ll/ܰۖ᩵;->ܽ:I

    sub-int/2addr v1, p1

    return v1
.end method

.method public final ܽ(I)Z
    .locals 1

    .line 200
    iget v0, p0, Ll/ۡۘ᩵;->֡֫:I

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܿ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ᩴ֫()I
    .locals 1

    .line 143
    iget v0, p0, Ll/ۡۘ᩵;->᩹֫:I

    return v0
.end method

.method public final ᩵֫()Ll/ܰۖ᩵;
    .locals 1

    .line 357
    iget-object v0, p0, Ll/ۡۘ᩵;->᩸֫:Ll/ܰۖ᩵;

    return-object v0
.end method

.method public final ᩸()Z
    .locals 2

    .line 222
    iget v0, p0, Ll/ۡۘ᩵;->۠֫:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ᩻()Ll/᩸ۡ᩵;
    .locals 1

    .line 86
    sget-object v0, Ll/᩸ۡ᩵;->ۙ:Ll/᩸ۡ᩵;

    return-object v0
.end method
