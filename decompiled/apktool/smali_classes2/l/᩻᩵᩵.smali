.class public final Ll/᩻᩵᩵;
.super Ll/۬ᩴ᩵;
.source "D9X3"

# interfaces
.implements Ll/ۙᩴ᩵;


# instance fields
.field public ۖ֫:B

.field public ۡ֫:B

.field public ۢ֫:[B

.field public ܺ֫:Ll/᩹ۖ᩵;


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;)V
    .locals 1

    .line 47
    sget-object v0, Ll/ۤᩴ᩵;->֫:[B

    invoke-direct {p0, p1, v0}, Ll/᩻᩵᩵;-><init>(Ll/֨ۡ᩵;[B)V

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;[B)V
    .locals 1

    const/16 v0, 0x11

    .line 56
    invoke-direct {p0, p1, v0}, Ll/۬ᩴ᩵;-><init>(Ll/֨ۡ᩵;I)V

    .line 57
    iput-object p2, p0, Ll/᩻᩵᩵;->ۢ֫:[B

    return-void
.end method


# virtual methods
.method public final size()I
    .locals 1

    .line 133
    iget-object v0, p0, Ll/᩻᩵᩵;->ܺ֫:Ll/᩹ۖ᩵;

    invoke-interface {v0}, Ll/᩹ۡ᩵;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x60

    invoke-static {v0}, Ll/ۗᩴ᩵;->ۡ(I)I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/᩹ۖ᩵;)V
    .locals 1

    const/4 v0, 0x1

    .line 76
    iput-byte v0, p0, Ll/᩻᩵᩵;->ۖ֫:B

    .line 101
    invoke-interface {p1}, Ll/᩹ۖ᩵;->ۧ()B

    move-result v0

    .line 84
    iput-byte v0, p0, Ll/᩻᩵᩵;->ۡ֫:B

    .line 110
    iput-object p1, p0, Ll/᩻᩵᩵;->ܺ֫:Ll/᩹ۖ᩵;

    return-void
.end method

.method public final ֫([B)V
    .locals 0

    .line 68
    iput-object p1, p0, Ll/᩻᩵᩵;->ۢ֫:[B

    return-void
.end method

.method public final ۧ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(Ll/ᩴۡ᩵;)Ll/۫ᩴ᩵;
    .locals 1

    .line 122
    new-instance v0, Ll/ۜ᩵᩵;

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    .line 36
    invoke-direct {v0, p1}, Ll/۫ᩴ᩵;-><init>(Ll/֨ۡ᩵;)V

    return-object v0
.end method

.method public final ᩳ(I[B)I
    .locals 6

    const-wide/16 v0, 0x21

    .line 145
    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x2

    .line 146
    iget-byte v1, p0, Ll/᩻᩵᩵;->ۖ֫:B

    aput-byte v1, p2, v0

    add-int/lit8 v0, p1, 0x3

    .line 147
    iget-byte v1, p0, Ll/᩻᩵᩵;->ۡ֫:B

    aput-byte v1, p2, v0

    add-int/lit8 v0, p1, 0x4

    add-int/lit8 v1, p1, 0x8

    add-int/lit8 v2, p1, 0xc

    const/4 v3, 0x0

    int-to-long v4, v3

    .line 155
    invoke-static {v4, v5, v2, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v2, p1, 0x10

    .line 158
    iget-object v4, p0, Ll/᩻᩵᩵;->ۢ֫:[B

    const/16 v5, 0x10

    invoke-static {v4, v3, p2, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v2, p1, 0x20

    .line 161
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ܳ֫()I

    move-result v3

    sub-int v3, v2, v3

    int-to-long v3, v3

    invoke-static {v3, v4, v1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    .line 162
    iget-object v1, p0, Ll/᩻᩵᩵;->ܺ֫:Ll/᩹ۖ᩵;

    invoke-interface {v1, v2, p2}, Ll/᩹ۡ᩵;->֫(I[B)I

    move-result v1

    int-to-long v3, v1

    .line 163
    invoke-static {v3, v4, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/2addr v2, v1

    sub-int/2addr v2, p1

    return v2
.end method
