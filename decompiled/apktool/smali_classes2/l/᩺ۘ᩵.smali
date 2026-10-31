.class public final Ll/᩺ۘ᩵;
.super Ll/ᩳᩴ᩵;
.source "1A38"


# static fields
.field public static final ۜۧ:[Ljava/lang/String;


# instance fields
.field public ܳۧ:Ljava/lang/String;

.field public ܿۧ:Ljava/lang/String;

.field public ᩻ۧ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "WrLehDO\u0000B16BBDz\u0000"

    const-string v1, "WrLehDz\u0000B16BBDz\u0000"

    .line 45
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/᩺ۘ᩵;->ۜۧ:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;Ljava/lang/String;I)V
    .locals 2

    const/16 v0, 0x25

    const/16 v1, 0x68

    .line 59
    invoke-direct {p0, p1, v0, v1}, Ll/ᩳᩴ᩵;-><init>(Ll/֨ۡ᩵;BB)V

    const/4 p1, 0x0

    .line 49
    iput-object p1, p0, Ll/᩺ۘ᩵;->ܳۧ:Ljava/lang/String;

    .line 60
    iput-object p2, p0, Ll/᩺ۘ᩵;->ܿۧ:Ljava/lang/String;

    .line 61
    iput p3, p0, Ll/᩺ۘ᩵;->᩻ۧ:I

    const-string p1, "\\PIPE\\LANMAN"

    .line 62
    iput-object p1, p0, Ll/ᩳᩴ᩵;->ۗ֫:Ljava/lang/String;

    const/16 p1, 0x8

    .line 64
    iput p1, p0, Ll/ᩳᩴ᩵;->ۙ֫:I

    const/16 p1, 0x4000

    .line 65
    iput p1, p0, Ll/ᩳᩴ᩵;->᩶֫:I

    const/4 p1, 0x0

    .line 67
    iput p1, p0, Ll/ᩳᩴ᩵;->ܰ֫:I

    const/16 p1, 0x1388

    .line 68
    iput p1, p0, Ll/ᩳᩴ᩵;->֫ۧ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 142
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "NetServerEnum2["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    invoke-super {p0}, Ll/ᩳᩴ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",name="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ᩳᩴ᩵;->ۗ֫:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",serverTypes="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    iget v2, p0, Ll/᩺ۘ᩵;->᩻ۧ:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    const-string v2, "SV_TYPE_ALL"

    goto :goto_0

    :cond_0
    const-string v2, "SV_TYPE_DOMAIN_ENUM"

    :goto_0
    const-string v3, "]"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 144
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۜ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(ILjava/lang/String;)V
    .locals 0

    .line 74
    invoke-virtual {p0}, Ll/ᩳᩴ᩵;->reset()V

    .line 75
    iput-object p2, p0, Ll/᩺ۘ᩵;->ܳۧ:Ljava/lang/String;

    return-void
.end method

.method public final ܽ([B)I
    .locals 8

    .line 89
    invoke-virtual {p0}, Ll/ᩳᩴ᩵;->ۡ֫()B

    move-result v0

    const/16 v1, 0x68

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 92
    :goto_0
    :try_start_0
    sget-object v1, Ll/᩺ۘ᩵;->ۜۧ:[Ljava/lang/String;

    aget-object v1, v1, v0

    const-string v4, "ASCII"

    invoke-virtual {v1, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    invoke-virtual {p0}, Ll/ᩳᩴ᩵;->ۡ֫()B

    move-result v4

    and-int/lit16 v4, v4, 0xff

    int-to-long v4, v4

    invoke-static {v4, v5, v2, p1}, Ll/֫֡᩵;->֫(JI[B)V

    .line 99
    array-length v4, v1

    const/4 v5, 0x2

    invoke-static {v1, v2, p1, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 100
    array-length v1, v1

    add-int/2addr v5, v1

    const-wide/16 v6, 0x1

    .line 101
    invoke-static {v6, v7, v5, p1}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v4, v1, 0x4

    .line 103
    iget v5, p0, Ll/ᩳᩴ᩵;->᩶֫:I

    int-to-long v5, v5

    invoke-static {v5, v6, v4, p1}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v4, v1, 0x6

    .line 105
    iget v5, p0, Ll/᩺ۘ᩵;->᩻ۧ:I

    int-to-long v5, v5

    invoke-static {v5, v6, v4, p1}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v1, v1, 0xa

    .line 107
    iget-object v4, p0, Ll/᩺ۘ᩵;->ܿۧ:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4, p1, v1, v2}, Ll/ۨۖ᩵;->֫(Ljava/lang/String;[BIZ)I

    move-result v4

    add-int/2addr v1, v4

    if-ne v0, v3, :cond_1

    .line 109
    iget-object v0, p0, Ll/᩺ۘ᩵;->ܳۧ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1, v1, v2}, Ll/ۨۖ᩵;->֫(Ljava/lang/String;[BIZ)I

    move-result p1

    add-int/2addr v1, p1

    :cond_1
    return v1

    :catch_0
    return v2
.end method

.method public final ᩷(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
