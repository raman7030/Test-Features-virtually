.class public final Ll/ۢۘ᩵;
.super Ll/ۨۖ᩵;
.source "R9UN"

# interfaces
.implements Ll/ۜۖ᩵;


# instance fields
.field public ֡֫:[Ljava/lang/String;

.field public final ۚ֫:Z


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;Z)V
    .locals 2

    const/16 v0, 0x72

    .line 46
    invoke-direct {p0, p1, v0}, Ll/ۨۖ᩵;-><init>(Ll/֨ۡ᩵;B)V

    .line 47
    iput-boolean p2, p0, Ll/ۢۘ᩵;->ۚ֫:Z

    .line 48
    check-cast p1, Ll/ܰۡ᩵;

    invoke-virtual {p1}, Ll/ܰۡ᩵;->᩻()I

    move-result p2

    invoke-virtual {p0, p2}, Ll/ۨۖ᩵;->ۜ(I)V

    .line 50
    invoke-virtual {p1}, Ll/ܰۡ᩵;->ۚ()Ll/᩸ۡ᩵;

    move-result-object p2

    invoke-virtual {p2}, Ll/᩸ۡ᩵;->ۧ()Z

    move-result p2

    const-string v0, "SMB 2.002"

    const-string v1, "SMB 2.???"

    if-eqz p2, :cond_0

    .line 51
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۢۘ᩵;->֡֫:[Ljava/lang/String;

    return-void

    .line 54
    :cond_0
    invoke-virtual {p1}, Ll/ܰۡ᩵;->֡()Ll/᩸ۡ᩵;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸ۡ᩵;->ۧ()Z

    move-result p1

    const-string p2, "NT LM 0.12"

    if-eqz p1, :cond_1

    .line 55
    filled-new-array {p2, v1, v0}, [Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۢۘ᩵;->֡֫:[Ljava/lang/String;

    return-void

    .line 59
    :cond_1
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۢۘ᩵;->֡֫:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 116
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SmbComNegotiate["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-super {p0}, Ll/ۨۖ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",wordCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۨۖ᩵;->ᩴ֫:I

    const-string v3, ",dialects=NT LM 0.12]"

    .line 0
    invoke-static {v2, v3, v1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 116
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۠()Z
    .locals 1

    .line 73
    iget-boolean v0, p0, Ll/ۢۘ᩵;->ۚ֫:Z

    return v0
.end method

.method public final ۧ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܿ(I[B)I
    .locals 7

    .line 85
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 87
    iget-object v1, p0, Ll/ۢۘ᩵;->֡֫:[Ljava/lang/String;

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, v1, v4

    const/4 v6, 0x2

    .line 88
    invoke-virtual {v0, v6}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 90
    :try_start_0
    invoke-static {v5}, Ll/ۤ֨᩵;->֫(Ljava/lang/String;)[B

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    invoke-virtual {v0, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 92
    new-instance p2, Ll/۬ۡ᩵;

    .line 66
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 92
    throw p2

    .line 97
    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v2

    invoke-static {v1, v3, p2, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 98
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p1

    return p1
.end method

.method public final ᩻(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
