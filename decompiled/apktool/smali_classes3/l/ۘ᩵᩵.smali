.class public final Ll/ۘ᩵᩵;
.super Ll/۫ᩴ᩵;
.source "59X2"


# instance fields
.field public ֡֫:Ll/۠ۡ᩵;

.field public ۚ֫:I

.field public ᩴ֫:I

.field public final ᩵֫:[B


# direct methods
.method public constructor <init>(ILl/֨ۡ᩵;[B)V
    .locals 0

    .line 70
    invoke-direct {p0, p2}, Ll/۫ᩴ᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 71
    iput-object p3, p0, Ll/ۘ᩵᩵;->᩵֫:[B

    .line 72
    iput p1, p0, Ll/ۘ᩵᩵;->ᩴ֫:I

    return-void
.end method


# virtual methods
.method public final ֡֫()Ll/۠ۡ᩵;
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ۘ᩵᩵;->֡֫:Ll/۠ۡ᩵;

    return-object v0
.end method

.method public final ֫(Ljava/lang/Class;)Ll/۠ۡ᩵;
    .locals 3

    .line 104
    iget-object v0, p0, Ll/ۘ᩵᩵;->֡֫:Ll/۠ۡ᩵;

    if-eqz v0, :cond_1

    .line 255
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v0

    .line 256
    :cond_0
    new-instance p1, Ll/ۗۚ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Incompatible response data "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw p1

    .line 252
    :cond_1
    new-instance p1, Ll/ۗۚ᩵;

    const-string v0, "Failed to decode output data"

    invoke-direct {p1, v0}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۚ֫()I
    .locals 1

    .line 112
    iget v0, p0, Ll/ۘ᩵᩵;->ۚ֫:I

    return v0
.end method

.method public final ۧ(I[B)I
    .locals 9

    .line 160
    invoke-static {p1, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    .line 162
    invoke-virtual {p0, p1, p2}, Ll/ۗᩴ᩵;->ܽ(I[B)I

    move-result p1

    return p1

    :cond_0
    const/16 v1, 0x31

    if-ne v0, v1, :cond_5

    add-int/lit8 v0, p1, 0x4

    .line 167
    invoke-static {v0, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    iput v0, p0, Ll/ۘ᩵᩵;->ᩴ֫:I

    add-int/lit8 v0, p1, 0x8

    const/16 v1, 0x10

    new-array v2, v1, [B

    const/4 v3, 0x0

    .line 171
    invoke-static {p2, v0, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v0, p1, 0x18

    .line 174
    invoke-static {v0, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ܳ֫()I

    move-result v1

    add-int/2addr v1, v0

    add-int/lit8 v0, p1, 0x1c

    .line 177
    invoke-static {v0, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    add-int/lit8 v2, p1, 0x20

    .line 180
    invoke-static {v2, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v2

    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ܳ֫()I

    move-result v4

    add-int/2addr v4, v2

    add-int/lit8 v2, p1, 0x24

    .line 183
    invoke-static {v2, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v2

    add-int/lit8 v5, p1, 0x28

    .line 186
    invoke-static {v5, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    add-int/lit8 v5, p1, 0x30

    .line 191
    iget-object v6, p0, Ll/ۘ᩵᩵;->᩵֫:[B

    const/4 v7, 0x0

    if-nez v6, :cond_1

    .line 216
    iget v8, p0, Ll/ۘ᩵᩵;->ᩴ֫:I

    sparse-switch v8, :sswitch_data_0

    goto :goto_0

    .line 223
    :sswitch_0
    new-instance v7, Ll/ᩴ᩵᩵;

    .line 29
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    .line 225
    :sswitch_1
    new-instance v7, Ll/֨᩵᩵;

    invoke-direct {v7}, Ll/֨᩵᩵;-><init>()V

    goto :goto_0

    .line 220
    :sswitch_2
    new-instance v7, Ll/֡᩵᩵;

    .line 29
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    .line 227
    :sswitch_3
    new-instance v7, Ll/᩵᩵᩵;

    invoke-direct {v7}, Ll/᩵᩵᩵;-><init>()V

    goto :goto_0

    .line 218
    :sswitch_4
    new-instance v7, Ll/ۖۖ᩵;

    invoke-direct {v7}, Ll/ۖۖ᩵;-><init>()V

    .line 191
    :cond_1
    :goto_0
    iput-object v7, p0, Ll/ۘ᩵᩵;->֡֫:Ll/۠ۡ᩵;

    add-int/2addr v1, v0

    .line 196
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-eqz v6, :cond_3

    .line 199
    array-length v1, v6

    if-gt v2, v1, :cond_2

    .line 202
    invoke-static {p2, v4, v6, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 200
    :cond_2
    new-instance p1, Ll/ᩳۖ᩵;

    const-string p2, "Output length exceeds buffer size"

    .line 58
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 200
    throw p1

    .line 203
    :cond_3
    iget-object v1, p0, Ll/ۘ᩵᩵;->֡֫:Ll/۠ۡ᩵;

    if-eqz v1, :cond_4

    .line 204
    invoke-interface {v1, v4, v2, p2}, Ll/۠ۡ᩵;->֫(II[B)I

    .line 206
    :cond_4
    :goto_1
    iput v2, p0, Ll/ۘ᩵᩵;->ۚ֫:I

    add-int/2addr v4, v2

    .line 207
    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    sub-int/2addr p2, p1

    return p2

    .line 164
    :cond_5
    new-instance p1, Ll/ᩳۖ᩵;

    const-string p2, "Expected structureSize = 49"

    .line 58
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 164
    throw p1

    :sswitch_data_0
    .sparse-switch
        0x60194 -> :sswitch_4
        0x11400c -> :sswitch_3
        0x140078 -> :sswitch_2
        0x140204 -> :sswitch_1
        0x1440f2 -> :sswitch_0
        0x1480f2 -> :sswitch_0
    .end sparse-switch
.end method

.method public final ܺ֫()Z
    .locals 3

    .line 142
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ۢ֫()I

    move-result v0

    const v1, -0x3ffffff3    # -2.000003f

    if-eq v0, v1, :cond_2

    if-ne v0, v1, :cond_0

    .line 143
    iget v1, p0, Ll/ۘ᩵᩵;->ᩴ֫:I

    const v2, 0x1440f2    # 1.860008E-39f

    if-eq v1, v2, :cond_2

    const v2, 0x1480f2

    if-eq v1, v2, :cond_2

    :cond_0
    const v1, -0x7ffffffb

    if-ne v0, v1, :cond_1

    iget v0, p0, Ll/ۘ᩵᩵;->ᩴ֫:I

    const v1, 0x11c017

    if-eq v0, v1, :cond_2

    const v1, 0x11400c

    if-eq v0, v1, :cond_2

    const v1, 0x60194

    if-eq v0, v1, :cond_2

    .line 148
    :cond_1
    invoke-super {p0}, Ll/ۗᩴ᩵;->ܺ֫()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ᩵֫()I
    .locals 1

    .line 80
    iget v0, p0, Ll/ۘ᩵᩵;->ᩴ֫:I

    return v0
.end method
