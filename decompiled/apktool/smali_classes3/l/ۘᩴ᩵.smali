.class public final Ll/ۘᩴ᩵;
.super Ll/ᩳᩴ᩵;
.source "B9XZ"


# instance fields
.field public ۜۧ:Ljava/lang/String;

.field public ܳۧ:I

.field public ܿۧ:I

.field public ᩻ۧ:I


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;Ljava/lang/String;Ljava/lang/String;III)V
    .locals 2

    const/16 v0, 0x32

    const/4 v1, 0x1

    .line 68
    invoke-direct {p0, p1, v0, v1}, Ll/ᩳᩴ᩵;-><init>(Ll/֨ۡ᩵;BB)V

    const-string p1, "\\"

    .line 69
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    iput-object p2, p0, Ll/ۨۖ᩵;->ᩳ֫:Ljava/lang/String;

    goto :goto_0

    .line 0
    :cond_0
    invoke-static {v1, p2}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v0

    const/16 v1, 0x5c

    if-eq v0, v1, :cond_1

    .line 72
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۨۖ᩵;->ᩳ֫:Ljava/lang/String;

    goto :goto_0

    .line 74
    :cond_1
    iput-object p2, p0, Ll/ۨۖ᩵;->ᩳ֫:Ljava/lang/String;

    .line 76
    :goto_0
    iput-object p3, p0, Ll/ۘᩴ᩵;->ۜۧ:Ljava/lang/String;

    and-int/lit8 p1, p4, 0x37

    .line 77
    iput p1, p0, Ll/ۘᩴ᩵;->᩻ۧ:I

    const/16 p1, 0x104

    .line 80
    iput p1, p0, Ll/ۘᩴ᩵;->ܿۧ:I

    const/4 p1, 0x0

    .line 82
    iput p1, p0, Ll/ᩳᩴ᩵;->ۧۧ:I

    const/16 p1, 0xa

    .line 83
    iput p1, p0, Ll/ᩳᩴ᩵;->ۙ֫:I

    .line 84
    iput p5, p0, Ll/ۘᩴ᩵;->ܳۧ:I

    .line 85
    iput p6, p0, Ll/ᩳᩴ᩵;->᩶֫:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 144
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Trans2FindFirst2["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    invoke-super {p0}, Ll/ᩳᩴ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",searchAttributes=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",searchCount="

    .line 0
    iget v3, p0, Ll/ۘᩴ᩵;->᩻ۧ:I

    const/4 v4, 0x2

    invoke-static {v3, v4, v2, v1}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 145
    iget v2, p0, Ll/ۘᩴ᩵;->ܳۧ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",flags=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    .line 146
    invoke-static {v2, v4}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",informationLevel=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x3

    const-string v3, ",searchStorageType=0,filename="

    .line 0
    iget v4, p0, Ll/ۘᩴ᩵;->ܿۧ:I

    invoke-static {v4, v2, v3, v1}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 147
    iget-object v2, p0, Ll/ۨۖ᩵;->ᩳ֫:Ljava/lang/String;

    const-string v3, "]"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 147
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۜ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ([B)I
    .locals 5

    .line 102
    iget v0, p0, Ll/ۘᩴ᩵;->᩻ۧ:I

    int-to-long v0, v0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, p1}, Ll/֫֡᩵;->֫(JI[B)V

    .line 104
    iget v0, p0, Ll/ۘᩴ᩵;->ܳۧ:I

    int-to-long v0, v0

    const/4 v3, 0x2

    invoke-static {v0, v1, v3, p1}, Ll/֫֡᩵;->֫(JI[B)V

    int-to-long v0, v2

    const/4 v2, 0x4

    .line 106
    invoke-static {v0, v1, v2, p1}, Ll/֫֡᩵;->֫(JI[B)V

    .line 108
    iget v2, p0, Ll/ۘᩴ᩵;->ܿۧ:I

    int-to-long v2, v2

    const/4 v4, 0x6

    invoke-static {v2, v3, v4, p1}, Ll/֫֡᩵;->֫(JI[B)V

    const/16 v2, 0x8

    .line 110
    invoke-static {v0, v1, v2, p1}, Ll/֫֡᩵;->ۧ(JI[B)V

    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۨۖ᩵;->ᩳ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۘᩴ᩵;->ۜۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xc

    invoke-virtual {p0, v0, v1, p1}, Ll/ۨۖ᩵;->֫(Ljava/lang/String;I[B)I

    move-result p1

    add-int/2addr p1, v1

    return p1
.end method

.method public final ᩷(I[B)I
    .locals 2

    add-int/lit8 v0, p1, 0x1

    .line 92
    invoke-virtual {p0}, Ll/ᩳᩴ᩵;->ۡ֫()B

    move-result v1

    aput-byte v1, p2, p1

    const/4 p1, 0x0

    .line 93
    aput-byte p1, p2, v0

    const/4 p1, 0x2

    return p1
.end method
