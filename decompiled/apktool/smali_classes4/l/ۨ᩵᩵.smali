.class public final Ll/ۨ᩵᩵;
.super Ll/۬ᩴ᩵;
.source "BA24"


# instance fields
.field public ۢ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/֨ۡ᩵;)V
    .locals 1

    const/4 v0, 0x3

    .line 45
    invoke-direct {p0, p2, v0}, Ll/۬ᩴ᩵;-><init>(Ll/֨ۡ᩵;I)V

    .line 46
    iput-object p1, p0, Ll/ۨ᩵᩵;->ۢ֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final size()I
    .locals 1

    .line 75
    iget-object v0, p0, Ll/ۨ᩵᩵;->ۢ֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x48

    invoke-static {v0}, Ll/ۗᩴ᩵;->ۡ(I)I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/ۗᩴ᩵;)Z
    .locals 1

    const/4 v0, -0x1

    .line 63
    invoke-virtual {p1, v0}, Ll/ۗᩴ᩵;->ۢ(I)V

    .line 64
    invoke-super {p0, p1}, Ll/ۗᩴ᩵;->֫(Ll/ۗᩴ᩵;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(Ll/ᩴۡ᩵;)Ll/۫ᩴ᩵;
    .locals 1

    .line 52
    new-instance v0, Ll/᩺᩵᩵;

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    .line 138
    invoke-direct {v0, p1}, Ll/۫ᩴ᩵;-><init>(Ll/֨ۡ᩵;)V

    return-object v0
.end method

.method public final ᩳ(I[B)I
    .locals 6

    const-wide/16 v0, 0x9

    .line 87
    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    const/4 v0, 0x0

    int-to-long v1, v0

    add-int/lit8 v3, p1, 0x2

    .line 88
    invoke-static {v1, v2, v3, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v1, p1, 0x4

    .line 91
    iget-object v2, p0, Ll/ۨ᩵᩵;->ۢ֫:Ljava/lang/String;

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    .line 93
    array-length v3, v2

    int-to-long v3, v3

    add-int/lit8 v5, p1, 0x6

    invoke-static {v3, v4, v5, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v3, p1, 0x8

    .line 95
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ܳ֫()I

    move-result v4

    sub-int v4, v3, v4

    int-to-long v4, v4

    invoke-static {v4, v5, v1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    .line 97
    array-length v1, v2

    invoke-static {v2, v0, p2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 98
    array-length p2, v2

    add-int/2addr v3, p2

    sub-int/2addr v3, p1

    return v3
.end method
