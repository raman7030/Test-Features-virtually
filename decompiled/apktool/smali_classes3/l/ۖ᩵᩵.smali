.class public final Ll/ۖ᩵᩵;
.super Ll/۬ᩴ᩵;
.source "09ZV"

# interfaces
.implements Ll/ۙᩴ᩵;


# instance fields
.field public ۖ֫:Ll/᩹ۡ᩵;

.field public ۘ֫:I

.field public ۡ֫:[B

.field public final ۢ֫:I

.field public ܺ֫:I

.field public final ᩴ֫:[B


# direct methods
.method public constructor <init>(ILl/֨ۡ᩵;[B)V
    .locals 1

    const/16 v0, 0xb

    .line 126
    invoke-direct {p0, p2, v0}, Ll/۬ᩴ᩵;-><init>(Ll/֨ۡ᩵;I)V

    .line 127
    iput p1, p0, Ll/ۖ᩵᩵;->ۢ֫:I

    .line 128
    iput-object p3, p0, Ll/ۖ᩵᩵;->ۡ֫:[B

    .line 129
    check-cast p2, Ll/ܰۡ᩵;

    invoke-virtual {p2}, Ll/ܰۡ᩵;->ܽ֫()I

    move-result p1

    and-int/lit8 p1, p1, -0x8

    iput p1, p0, Ll/ۖ᩵᩵;->ۘ֫:I

    const/4 p1, 0x0

    .line 130
    iput-object p1, p0, Ll/ۖ᩵᩵;->ᩴ֫:[B

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;I)V
    .locals 1

    .line 116
    sget-object v0, Ll/ۤᩴ᩵;->֫:[B

    invoke-direct {p0, p2, p1, v0}, Ll/ۖ᩵᩵;-><init>(ILl/֨ۡ᩵;[B)V

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;[B[B)V
    .locals 1

    const/16 v0, 0xb

    .line 152
    invoke-direct {p0, p1, v0}, Ll/۬ᩴ᩵;-><init>(Ll/֨ۡ᩵;I)V

    const p1, 0x11c017

    .line 153
    iput p1, p0, Ll/ۖ᩵᩵;->ۢ֫:I

    .line 154
    iput-object p2, p0, Ll/ۖ᩵᩵;->ۡ֫:[B

    .line 155
    iput-object p3, p0, Ll/ۖ᩵᩵;->ᩴ֫:[B

    .line 156
    array-length p1, p3

    iput p1, p0, Ll/ۖ᩵᩵;->ۘ֫:I

    return-void
.end method


# virtual methods
.method public final size()I
    .locals 1

    .line 215
    iget-object v0, p0, Ll/ۖ᩵᩵;->ۖ֫:Ll/᩹ۡ᩵;

    if-eqz v0, :cond_0

    .line 216
    invoke-interface {v0}, Ll/᩹ۡ᩵;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/lit8 v0, v0, 0x78

    .line 221
    invoke-static {v0}, Ll/ۗᩴ᩵;->ۡ(I)I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/᩹ۡ᩵;)V
    .locals 0

    .line 194
    iput-object p1, p0, Ll/ۖ᩵᩵;->ۖ֫:Ll/᩹ۡ᩵;

    return-void
.end method

.method public final ֫([B)V
    .locals 0

    .line 141
    iput-object p1, p0, Ll/ۖ᩵᩵;->ۡ֫:[B

    return-void
.end method

.method public final ۘ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 170
    iput v0, p0, Ll/ۖ᩵᩵;->ܺ֫:I

    return-void
.end method

.method public final ۧ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܺ(I)V
    .locals 0

    .line 186
    iput p1, p0, Ll/ۖ᩵᩵;->ۘ֫:I

    return-void
.end method

.method public final ܽ(Ll/ᩴۡ᩵;)Ll/۫ᩴ᩵;
    .locals 3

    .line 162
    new-instance v0, Ll/ۘ᩵᩵;

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    iget-object v1, p0, Ll/ۖ᩵᩵;->ᩴ֫:[B

    iget v2, p0, Ll/ۖ᩵᩵;->ۢ֫:I

    invoke-direct {v0, v2, p1, v1}, Ll/ۘ᩵᩵;-><init>(ILl/֨ۡ᩵;[B)V

    return-object v0
.end method

.method public final ᩳ(I[B)I
    .locals 10

    const-wide/16 v0, 0x39

    .line 233
    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x4

    .line 235
    iget v1, p0, Ll/ۖ᩵᩵;->ۢ֫:I

    int-to-long v1, v1

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x8

    .line 237
    iget-object v1, p0, Ll/ۖ᩵᩵;->ۡ֫:[B

    const/16 v2, 0x10

    const/4 v3, 0x0

    invoke-static {v1, v3, p2, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v0, p1, 0x18

    add-int/lit8 v1, p1, 0x1c

    add-int/lit8 v2, p1, 0x20

    int-to-long v3, v3

    .line 244
    invoke-static {v3, v4, v2, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v2, p1, 0x24

    add-int/lit8 v3, p1, 0x28

    add-int/lit8 v4, p1, 0x2c

    .line 251
    iget v5, p0, Ll/ۖ᩵᩵;->ۘ֫:I

    int-to-long v5, v5

    invoke-static {v5, v6, v4, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v4, p1, 0x30

    .line 254
    iget v5, p0, Ll/ۖ᩵᩵;->ܺ֫:I

    int-to-long v5, v5

    invoke-static {v5, v6, v4, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v4, p1, 0x38

    .line 258
    iget-object v5, p0, Ll/ۖ᩵᩵;->ۖ֫:Ll/᩹ۡ᩵;

    const-wide/16 v6, 0x0

    if-eqz v5, :cond_0

    .line 259
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ܳ֫()I

    move-result v5

    sub-int v5, v4, v5

    int-to-long v8, v5

    invoke-static {v8, v9, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    .line 260
    iget-object v0, p0, Ll/ۖ᩵᩵;->ۖ֫:Ll/᩹ۡ᩵;

    invoke-interface {v0, v4, p2}, Ll/᩹ۡ᩵;->֫(I[B)I

    move-result v0

    int-to-long v8, v0

    .line 261
    invoke-static {v8, v9, v1, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/2addr v4, v0

    goto :goto_0

    .line 264
    :cond_0
    invoke-static {v6, v7, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    .line 265
    invoke-static {v6, v7, v1, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    .line 274
    :goto_0
    invoke-static {v6, v7, v2, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    .line 275
    invoke-static {v6, v7, v3, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    sub-int/2addr v4, p1

    return v4
.end method
