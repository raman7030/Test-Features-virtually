.class public final Ll/ܽ᩵᩵;
.super Ll/۬ᩴ᩵;
.source "EA2I"

# interfaces
.implements Ll/ۙᩴ᩵;


# instance fields
.field public ۖ֫:Ljava/lang/String;

.field public ۘ֫:I

.field public ۡ֫:I

.field public ۢ֫:[B

.field public ܺ֫:B

.field public ᩴ֫:B


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;[B)V
    .locals 1

    const/16 v0, 0xe

    .line 107
    invoke-direct {p0, p1, v0}, Ll/۬ᩴ᩵;-><init>(Ll/֨ۡ᩵;I)V

    const/4 v0, 0x3

    .line 86
    iput-byte v0, p0, Ll/ܽ᩵᩵;->ܺ֫:B

    .line 108
    check-cast p1, Ll/ܰۡ᩵;

    invoke-virtual {p1}, Ll/ܰۡ᩵;->᩵()I

    move-result v0

    invoke-virtual {p1}, Ll/ܰۡ᩵;->ܺ()I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    add-int/lit8 p1, p1, -0x48

    and-int/lit8 p1, p1, -0x8

    iput p1, p0, Ll/ܽ᩵᩵;->ۘ֫:I

    .line 109
    iput-object p2, p0, Ll/ܽ᩵᩵;->ۢ֫:[B

    return-void
.end method


# virtual methods
.method public final size()I
    .locals 1

    .line 175
    iget-object v0, p0, Ll/ܽ᩵᩵;->ۖ֫:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/lit8 v0, v0, 0x60

    invoke-static {v0}, Ll/ۗᩴ᩵;->ۡ(I)I

    move-result v0

    return v0
.end method

.method public final ֫([B)V
    .locals 0

    .line 120
    iput-object p1, p0, Ll/ܽ᩵᩵;->ۢ֫:[B

    return-void
.end method

.method public final ۘ֫()V
    .locals 1

    const/4 v0, 0x4

    .line 136
    iput-byte v0, p0, Ll/ܽ᩵᩵;->ᩴ֫:B

    return-void
.end method

.method public final ۧ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 152
    iput-object p1, p0, Ll/ܽ᩵᩵;->ۖ֫:Ljava/lang/String;

    return-void
.end method

.method public final ܺ(I)V
    .locals 0

    .line 144
    iput p1, p0, Ll/ܽ᩵᩵;->ۡ֫:I

    return-void
.end method

.method public final ܽ(Ll/ᩴۡ᩵;)Ll/۫ᩴ᩵;
    .locals 2

    .line 164
    new-instance v0, Ll/ᩳ᩵᩵;

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    iget-byte v1, p0, Ll/ܽ᩵᩵;->ܺ֫:B

    invoke-direct {v0, p1, v1}, Ll/ᩳ᩵᩵;-><init>(Ll/֨ۡ᩵;B)V

    return-object v0
.end method

.method public final ᩳ(I[B)I
    .locals 7

    const-wide/16 v0, 0x21

    .line 187
    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x2

    .line 188
    iget-byte v1, p0, Ll/ܽ᩵᩵;->ܺ֫:B

    aput-byte v1, p2, v0

    add-int/lit8 v0, p1, 0x3

    .line 189
    iget-byte v1, p0, Ll/ܽ᩵᩵;->ᩴ֫:B

    aput-byte v1, p2, v0

    add-int/lit8 v0, p1, 0x4

    .line 191
    iget v1, p0, Ll/ܽ᩵᩵;->ۡ֫:I

    int-to-long v1, v1

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x8

    .line 193
    iget-object v1, p0, Ll/ܽ᩵᩵;->ۢ֫:[B

    const/16 v2, 0x10

    const/4 v3, 0x0

    invoke-static {v1, v3, p2, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v0, p1, 0x18

    add-int/lit8 v1, p1, 0x1a

    add-int/lit8 v2, p1, 0x1c

    .line 200
    iget v4, p0, Ll/ܽ᩵᩵;->ۘ֫:I

    int-to-long v4, v4

    invoke-static {v4, v5, v2, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v2, p1, 0x20

    .line 203
    iget-object v4, p0, Ll/ܽ᩵᩵;->ۖ֫:Ljava/lang/String;

    if-nez v4, :cond_0

    const-wide/16 v3, 0x0

    .line 204
    invoke-static {v3, v4, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    .line 205
    invoke-static {v3, v4, v1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    goto :goto_0

    .line 207
    :cond_0
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    invoke-virtual {v4, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v4

    .line 208
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ܳ֫()I

    move-result v5

    sub-int v5, v2, v5

    int-to-long v5, v5

    invoke-static {v5, v6, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    .line 209
    array-length v0, v4

    int-to-long v5, v0

    invoke-static {v5, v6, v1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    .line 210
    array-length v0, v4

    invoke-static {v4, v3, p2, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 211
    array-length p2, v4

    add-int/2addr v2, p2

    :goto_0
    sub-int/2addr v2, p1

    return v2
.end method
