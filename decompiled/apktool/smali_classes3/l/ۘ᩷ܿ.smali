.class public final Ll/ۘ᩷ܿ;
.super Ll/ۢܺܿ;
.source "L9SS"


# instance fields
.field public ܽ:Ljava/lang/String;

.field public ܿ:I

.field public ᩳ:Ll/ۖ᩷ܿ;


# direct methods
.method public constructor <init>(Ll/ۢܺܿ;Ll/۬ۜܽ;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Ll/ۢܺܿ;-><init>(Ll/ۢܺܿ;)V

    const/16 p1, 0x4f05

    .line 22
    invoke-static {p2, p1}, Ll/᩹ۜܽ;->֫(Ll/۬ۜܽ;I)V

    .line 23
    invoke-virtual {p2}, Ll/۬ۜܽ;->readInt()I

    .line 24
    invoke-virtual {p2}, Ll/۬ۜܽ;->᩵()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۘ᩷ܿ;->ܽ:Ljava/lang/String;

    .line 25
    new-instance p1, Ll/ۖ᩷ܿ;

    invoke-direct {p1, p2}, Ll/ۖ᩷ܿ;-><init>(Ll/۬ۜܽ;)V

    iput-object p1, p0, Ll/ۘ᩷ܿ;->ᩳ:Ll/ۖ᩷ܿ;

    .line 26
    invoke-virtual {p2}, Ll/۬ۜܽ;->᩵()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۙ᩷ܿ;->ۧ(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/ۘ᩷ܿ;->ܿ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۢܺܿ;)Ll/ۢܺܿ;
    .locals 1

    .line 73
    new-instance v0, Ll/ۘ᩷ܿ;

    .line 17
    invoke-direct {v0, p1}, Ll/ۢܺܿ;-><init>(Ll/ۢܺܿ;)V

    .line 74
    iget-object p1, p0, Ll/ۢܺܿ;->ۧ:Landroid/graphics/Point;

    iput-object p1, v0, Ll/ۢܺܿ;->ۧ:Landroid/graphics/Point;

    .line 75
    iget-object p1, p0, Ll/ۘ᩷ܿ;->ܽ:Ljava/lang/String;

    iput-object p1, v0, Ll/ۘ᩷ܿ;->ܽ:Ljava/lang/String;

    .line 76
    iget-object p1, p0, Ll/ۘ᩷ܿ;->ᩳ:Ll/ۖ᩷ܿ;

    iput-object p1, v0, Ll/ۘ᩷ܿ;->ᩳ:Ll/ۖ᩷ܿ;

    .line 77
    iget p1, p0, Ll/ۘ᩷ܿ;->ܿ:I

    iput p1, v0, Ll/ۘ᩷ܿ;->ܿ:I

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 50
    iput-object p1, p0, Ll/ۘ᩷ܿ;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/lang/StringBuilder;I)V
    .locals 4

    const-string v0, "\t"

    .line 83
    invoke-static {p2, v0}, Ll/ۢܺ֡;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 84
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{\n"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "numFormat: \""

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۘ᩷ܿ;->ᩳ:Ll/ۖ᩷ܿ;

    invoke-virtual {v1}, Ll/ۖ᩷ܿ;->ܽ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\"\n"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    iget-object v2, p0, Ll/ۘ᩷ܿ;->ᩳ:Ll/ۖ᩷ܿ;

    invoke-virtual {v2}, Ll/ۖ᩷ܿ;->ᩳ()Ljava/lang/String;

    move-result-object v2

    .line 87
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "iSuffixes: \""

    .line 0
    invoke-static {p1, p2, v0, v3, v2}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    :cond_0
    iget-object v2, p0, Ll/ۘ᩷ܿ;->ᩳ:Ll/ۖ᩷ܿ;

    invoke-virtual {v2}, Ll/ۖ᩷ܿ;->ۧ()Ljava/lang/String;

    move-result-object v2

    .line 91
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "fSuffixes: \""

    .line 0
    invoke-static {p1, p2, v0, v3, v2}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    :cond_1
    iget v2, p0, Ll/ۘ᩷ܿ;->ܿ:I

    invoke-static {v2}, Ll/ۙ᩷ܿ;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v3, "style: \""

    .line 0
    invoke-static {p1, p2, v0, v3, v2}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    :cond_2
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "}\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫(Ll/ۖ᩷ܿ;)V
    .locals 0

    .line 54
    iput-object p1, p0, Ll/ۘ᩷ܿ;->ᩳ:Ll/ۖ᩷ܿ;

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 1

    const/16 v0, 0x4f05

    .line 32
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ۡ(I)V

    .line 33
    invoke-virtual {p1}, Ll/ۤۜܽ;->ܳ()V

    .line 34
    iget-object v0, p0, Ll/ۘ᩷ܿ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Ljava/lang/String;)V

    .line 35
    iget-object v0, p0, Ll/ۘ᩷ܿ;->ᩳ:Ll/ۖ᩷ܿ;

    invoke-virtual {v0, p1}, Ll/ۖ᩷ܿ;->֫(Ll/ۤۜܽ;)V

    .line 36
    iget v0, p0, Ll/ۘ᩷ܿ;->ܿ:I

    invoke-static {v0}, Ll/ۙ᩷ܿ;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Ljava/lang/String;)V

    .line 37
    invoke-virtual {p1}, Ll/ۤۜܽ;->֫()V

    return-void
.end method

.method public final ֫(Ll/᩷ܺܿ;)V
    .locals 0

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 68
    iget v0, p0, Ll/ۘ᩷ܿ;->ܿ:I

    if-nez v0, :cond_0

    sget v0, Ll/ۙ᩷ܿ;->ᩳ:I

    :cond_0
    return v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 63
    invoke-static {p1}, Ll/ۙ᩷ܿ;->ۧ(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/ۘ᩷ܿ;->ܿ:I

    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Ll/ۘ᩷ܿ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Ll/ۖ᩷ܿ;
    .locals 1

    .line 59
    iget-object v0, p0, Ll/ۘ᩷ܿ;->ᩳ:Ll/ۖ᩷ܿ;

    return-object v0
.end method
