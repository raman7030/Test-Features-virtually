.class public final Ll/ܿ᩵᩵;
.super Ll/۬ᩴ᩵;
.source "JA04"

# interfaces
.implements Ll/ۙᩴ᩵;


# instance fields
.field public ۖ֫:I

.field public ۡ֫:B

.field public ۢ֫:[B

.field public ܺ֫:B


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;)V
    .locals 1

    const/16 v0, 0x10

    .line 57
    invoke-direct {p0, p1, v0}, Ll/۬ᩴ᩵;-><init>(Ll/֨ۡ᩵;I)V

    .line 58
    check-cast p1, Ll/ܰۡ᩵;

    invoke-virtual {p1}, Ll/ܰۡ᩵;->᩵()I

    move-result v0

    invoke-virtual {p1}, Ll/ܰۡ᩵;->ܺ()I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    add-int/lit8 p1, p1, -0x48

    and-int/lit8 p1, p1, -0x8

    iput p1, p0, Ll/ܿ᩵᩵;->ۖ֫:I

    .line 59
    sget-object p1, Ll/ۤᩴ᩵;->֫:[B

    iput-object p1, p0, Ll/ܿ᩵᩵;->ۢ֫:[B

    return-void
.end method


# virtual methods
.method public final size()I
    .locals 1

    const/16 v0, 0x68

    .line 139
    invoke-static {v0}, Ll/ۗᩴ᩵;->ۡ(I)I

    move-result v0

    return v0
.end method

.method public final ֫(B)V
    .locals 1

    const/4 v0, 0x2

    .line 78
    iput-byte v0, p0, Ll/ܿ᩵᩵;->ܺ֫:B

    .line 96
    iput-byte p1, p0, Ll/ܿ᩵᩵;->ۡ֫:B

    return-void
.end method

.method public final ֫([B)V
    .locals 0

    .line 70
    iput-object p1, p0, Ll/ܿ᩵᩵;->ۢ֫:[B

    return-void
.end method

.method public final ۧ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(Ll/ᩴۡ᩵;)Ll/۫ᩴ᩵;
    .locals 3

    .line 124
    new-instance v0, Ll/ܳ᩵᩵;

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    iget-byte v1, p0, Ll/ܿ᩵᩵;->ܺ֫:B

    iget-byte v2, p0, Ll/ܿ᩵᩵;->ۡ֫:B

    invoke-direct {v0, p1, v1, v2}, Ll/ܳ᩵᩵;-><init>(Ll/֨ۡ᩵;BB)V

    return-object v0
.end method

.method public final ᩳ(I[B)I
    .locals 6

    const-wide/16 v0, 0x29

    .line 152
    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x2

    .line 153
    iget-byte v1, p0, Ll/ܿ᩵᩵;->ܺ֫:B

    aput-byte v1, p2, v0

    add-int/lit8 v0, p1, 0x3

    .line 154
    iget-byte v1, p0, Ll/ܿ᩵᩵;->ۡ֫:B

    aput-byte v1, p2, v0

    add-int/lit8 v0, p1, 0x4

    .line 157
    iget v1, p0, Ll/ܿ᩵᩵;->ۖ֫:I

    int-to-long v1, v1

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x8

    add-int/lit8 v1, p1, 0xc

    add-int/lit8 v2, p1, 0x10

    const/4 v3, 0x0

    int-to-long v4, v3

    .line 163
    invoke-static {v4, v5, v2, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v2, p1, 0x14

    .line 165
    invoke-static {v4, v5, v2, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v2, p1, 0x18

    .line 167
    iget-object v4, p0, Ll/ܿ᩵᩵;->ۢ֫:[B

    const/16 v5, 0x10

    invoke-static {v4, v3, p2, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v2, p1, 0x28

    const-wide/16 v3, 0x0

    .line 171
    invoke-static {v3, v4, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    .line 172
    invoke-static {v3, v4, v1, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    sub-int/2addr v2, p1

    return v2
.end method
