.class public final Ll/ۗۘ᩵;
.super Ll/ۤۖ᩵;
.source "E9VM"

# interfaces
.implements Ll/ۢۖ᩵;


# instance fields
.field public ܶ֫:Ljava/lang/String;

.field public ᩶֫:Z

.field public ᩸֫:Ljava/lang/String;

.field public ᩹֫:Z


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;Ll/ۨۖ᩵;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2}, Ll/ۤۖ᩵;-><init>(Ll/֨ۡ᩵;Ll/ۨۖ᩵;)V

    const-string p1, ""

    .line 39
    iput-object p1, p0, Ll/ۗۘ᩵;->ܶ֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 143
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SmbComTreeConnectAndXResponse["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    invoke-super {p0}, Ll/ۤۖ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",supportSearchBits="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Ll/ۗۘ᩵;->᩶֫:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ",shareIsInDfs="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Ll/ۗۘ᩵;->᩹֫:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ",service="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۗۘ᩵;->᩸֫:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",nativeFileSystem="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۗۘ᩵;->ܶ֫:Ljava/lang/String;

    const-string v3, "]"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 144
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۙ()Z
    .locals 2

    .line 92
    invoke-virtual {p0}, Ll/ۨۖ᩵;->᩺()I

    move-result v0

    const v1, 0xffff

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۡ()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Ll/ۗۘ᩵;->᩸֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(I[B)I
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    add-int v2, p1, v1

    .line 1099
    aget-byte v2, p2, v2

    if-eqz v2, :cond_1

    add-int/lit8 v2, v1, 0x1

    const/16 v3, 0x20

    if-gt v1, v3, :cond_0

    move v1, v2

    goto :goto_0

    .line 1101
    :cond_0
    new-instance p1, Ll/۬ۡ᩵;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "zero termination not found: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 58
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 1101
    throw p1

    .line 122
    :cond_1
    :try_start_0
    new-instance v2, Ljava/lang/String;

    const-string v3, "ASCII"

    invoke-direct {v2, p2, p1, v1, v3}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    iput-object v2, p0, Ll/ۗۘ᩵;->᩸֫:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v1, p1

    sub-int/2addr v1, p1

    return v1

    :catch_0
    return v0
.end method

.method public final ܽ(I[B)I
    .locals 2

    .line 110
    aget-byte p1, p2, p1

    and-int/lit8 p2, p1, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p2, v1, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Ll/ۗۘ᩵;->᩶֫:Z

    const/4 p2, 0x2

    and-int/2addr p1, p2

    if-ne p1, p2, :cond_1

    const/4 v0, 0x1

    .line 111
    :cond_1
    iput-boolean v0, p0, Ll/ۗۘ᩵;->᩹֫:Z

    return p2
.end method

.method public final ܿ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ᩴ()Z
    .locals 1

    .line 81
    iget-boolean v0, p0, Ll/ۗۘ᩵;->᩹֫:Z

    return v0
.end method

.method public final ᩻(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
