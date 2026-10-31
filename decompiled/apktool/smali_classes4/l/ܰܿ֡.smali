.class public final Ll/ܰܿ֡;
.super Ljava/lang/Object;
.source "44OF"

# interfaces
.implements Ljava/io/Serializable;
.implements Ll/֡ܳ֡;


# instance fields
.field public ۗ:Ll/᩷᩷֡;

.field public ۙ:I

.field public ۛ:I

.field public ۤ:Ljava/lang/String;

.field public ۫:I

.field public ۬:I

.field public ᩶:I

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/֡ܳ֡;)V
    .locals 2

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 35
    iput v0, p0, Ll/ܰܿ֡;->᩹:I

    const/4 v1, 0x0

    .line 41
    iput v1, p0, Ll/ܰܿ֡;->᩸:I

    .line 68
    iput v0, p0, Ll/ܰܿ֡;->᩶:I

    .line 132
    invoke-interface {p1}, Ll/֡ܳ֡;->getType()I

    move-result v0

    iput v0, p0, Ll/ܰܿ֡;->ۛ:I

    .line 133
    invoke-interface {p1}, Ll/֡ܳ֡;->getLine()I

    move-result v0

    iput v0, p0, Ll/ܰܿ֡;->ۙ:I

    .line 134
    invoke-interface {p1}, Ll/֡ܳ֡;->ܽ()I

    move-result v0

    iput v0, p0, Ll/ܰܿ֡;->᩶:I

    .line 135
    invoke-interface {p1}, Ll/֡ܳ֡;->֫()I

    move-result v0

    iput v0, p0, Ll/ܰܿ֡;->᩹:I

    .line 136
    invoke-interface {p1}, Ll/֡ܳ֡;->ۧ()I

    move-result v0

    iput v0, p0, Ll/ܰܿ֡;->᩸:I

    .line 137
    invoke-interface {p1}, Ll/֡ܳ֡;->ᩳ()I

    move-result v0

    iput v0, p0, Ll/ܰܿ֡;->۬:I

    .line 138
    invoke-interface {p1}, Ll/֡ܳ֡;->ܿ()I

    move-result v0

    iput v0, p0, Ll/ܰܿ֡;->۫:I

    .line 140
    instance-of v0, p1, Ll/ܰܿ֡;

    if-eqz v0, :cond_0

    .line 141
    check-cast p1, Ll/ܰܿ֡;

    iget-object v0, p1, Ll/ܰܿ֡;->ۤ:Ljava/lang/String;

    iput-object v0, p0, Ll/ܰܿ֡;->ۤ:Ljava/lang/String;

    .line 142
    iget-object p1, p1, Ll/ܰܿ֡;->ۗ:Ll/᩷᩷֡;

    iput-object p1, p0, Ll/ܰܿ֡;->ۗ:Ll/᩷᩷֡;

    return-void

    .line 145
    :cond_0
    invoke-interface {p1}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܰܿ֡;->ۤ:Ljava/lang/String;

    .line 146
    new-instance v0, Ll/᩷᩷֡;

    invoke-interface {p1}, Ll/֡ܳ֡;->ܳ()Ll/֨ܳ֡;

    move-result-object v1

    invoke-interface {p1}, Ll/֡ܳ֡;->getInputStream()Ll/᩺ܿ֡;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ll/᩷᩷֡;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ܰܿ֡;->ۗ:Ll/᩷᩷֡;

    return-void
.end method

.method public constructor <init>(Ll/᩷᩷֡;IIII)V
    .locals 1

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 35
    iput v0, p0, Ll/ܰܿ֡;->᩹:I

    .line 68
    iput v0, p0, Ll/ܰܿ֡;->᩶:I

    .line 93
    iput-object p1, p0, Ll/ܰܿ֡;->ۗ:Ll/᩷᩷֡;

    .line 94
    iput p2, p0, Ll/ܰܿ֡;->ۛ:I

    .line 95
    iput p3, p0, Ll/ܰܿ֡;->᩸:I

    .line 96
    iput p4, p0, Ll/ܰܿ֡;->۬:I

    .line 97
    iput p5, p0, Ll/ܰܿ֡;->۫:I

    .line 98
    iget-object p2, p1, Ll/᩷᩷֡;->᩸:Ljava/lang/Object;

    if-eqz p2, :cond_0

    .line 99
    check-cast p2, Ll/֨ܳ֡;

    invoke-interface {p2}, Ll/֨ܳ֡;->getLine()I

    move-result p2

    iput p2, p0, Ll/ܰܿ֡;->ۙ:I

    .line 100
    iget-object p1, p1, Ll/᩷᩷֡;->᩸:Ljava/lang/Object;

    check-cast p1, Ll/֨ܳ֡;

    invoke-interface {p1}, Ll/֨ܳ֡;->֫()I

    move-result p1

    iput p1, p0, Ll/ܰܿ֡;->᩹:I

    :cond_0
    return-void
.end method


# virtual methods
.method public final getInputStream()Ll/᩺ܿ֡;
    .locals 1

    .line 256
    iget-object v0, p0, Ll/ܰܿ֡;->ۗ:Ll/᩷᩷֡;

    iget-object v0, v0, Ll/᩷᩷֡;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/᩺ܿ֡;

    return-object v0
.end method

.method public final getLine()I
    .locals 1

    .line 193
    iget v0, p0, Ll/ܰܿ֡;->ۙ:I

    return v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 4

    .line 162
    iget-object v0, p0, Ll/ܰܿ֡;->ۤ:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    .line 166
    :cond_0
    invoke-virtual {p0}, Ll/ܰܿ֡;->getInputStream()Ll/᩺ܿ֡;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 168
    :cond_1
    invoke-interface {v0}, Ll/ܳܳ֡;->size()I

    move-result v1

    .line 169
    iget v2, p0, Ll/ܰܿ֡;->۬:I

    if-ge v2, v1, :cond_2

    iget v3, p0, Ll/ܰܿ֡;->۫:I

    if-ge v3, v1, :cond_2

    .line 170
    invoke-static {v2, v3}, Ll/ܳ᩷֡;->֫(II)Ll/ܳ᩷֡;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/᩺ܿ֡;->֫(Ll/ܳ᩷֡;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    const-string v0, "<EOF>"

    return-object v0
.end method

.method public final getType()I
    .locals 1

    .line 152
    iget v0, p0, Ll/ܰܿ֡;->ۛ:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 266
    iget v0, p0, Ll/ܰܿ֡;->᩸:I

    if-lez v0, :cond_0

    .line 267
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ",channel="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ܰܿ֡;->᩸:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 269
    :goto_0
    invoke-virtual {p0}, Ll/ܰܿ֡;->getText()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v2, "\n"

    const-string v3, "\\n"

    .line 271
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "\r"

    const-string v3, "\\r"

    .line 272
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "\t"

    const-string v3, "\\t"

    .line 273
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    const-string v1, "<no text>"

    .line 278
    :goto_1
    iget v2, p0, Ll/ܰܿ֡;->ۛ:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    .line 282
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[@"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 241
    iget v4, p0, Ll/ܰܿ֡;->᩶:I

    .line 282
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ","

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, p0, Ll/ܰܿ֡;->۬:I

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ":"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, p0, Ll/ܰܿ֡;->۫:I

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "=\'"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\',<"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ">"

    .line 0
    invoke-static {v3, v2, v1, v0, v4}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    iget v0, p0, Ll/ܰܿ֡;->ۙ:I

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    iget v0, p0, Ll/ܰܿ֡;->᩹:I

    const-string v1, "]"

    .line 0
    invoke-static {v0, v1, v3}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 198
    iget v0, p0, Ll/ܰܿ֡;->᩹:I

    return v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 213
    iput p1, p0, Ll/ܰܿ֡;->᩸:I

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 188
    iput-object p1, p0, Ll/ܰܿ֡;->ۤ:Ljava/lang/String;

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 208
    iget v0, p0, Ll/ܰܿ֡;->᩸:I

    return v0
.end method

.method public final ۧ(I)V
    .locals 0

    .line 203
    iput p1, p0, Ll/ܰܿ֡;->᩹:I

    return-void
.end method

.method public final ܳ()Ll/֨ܳ֡;
    .locals 1

    .line 251
    iget-object v0, p0, Ll/ܰܿ֡;->ۗ:Ll/᩷᩷֡;

    iget-object v0, v0, Ll/᩷᩷֡;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/֨ܳ֡;

    return-object v0
.end method

.method public final ܳ(I)V
    .locals 0

    .line 246
    iput p1, p0, Ll/ܰܿ֡;->᩶:I

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 241
    iget v0, p0, Ll/ܰܿ֡;->᩶:I

    return v0
.end method

.method public final ܽ(I)V
    .locals 0

    .line 157
    iput p1, p0, Ll/ܰܿ֡;->ۙ:I

    return-void
.end method

.method public final ܿ()I
    .locals 1

    .line 232
    iget v0, p0, Ll/ܰܿ֡;->۫:I

    return v0
.end method

.method public final ܿ(I)V
    .locals 0

    .line 236
    iput p1, p0, Ll/ܰܿ֡;->۫:I

    return-void
.end method

.method public final ᩳ()I
    .locals 1

    .line 223
    iget v0, p0, Ll/ܰܿ֡;->۬:I

    return v0
.end method

.method public final ᩳ(I)V
    .locals 0

    .line 227
    iput p1, p0, Ll/ܰܿ֡;->۬:I

    return-void
.end method

.method public final ᩻(I)V
    .locals 0

    .line 218
    iput p1, p0, Ll/ܰܿ֡;->ۛ:I

    return-void
.end method
