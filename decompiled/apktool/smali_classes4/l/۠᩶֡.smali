.class public final Ll/۠᩶֡;
.super Ll/֨᩶֡;
.source "F5QL"


# instance fields
.field public ۧ:I

.field public final synthetic ܽ:Ll/᩸᩶֡;


# direct methods
.method public constructor <init>(Ll/᩸᩶֡;)V
    .locals 0

    .line 248
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 187
    iput-object p1, p0, Ll/۠᩶֡;->ܽ:Ll/᩸᩶֡;

    const/4 p1, 0x0

    .line 180
    iput p1, p0, Ll/֨᩶֡;->֫:I

    .line 188
    iput p1, p0, Ll/۠᩶֡;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 3

    .line 251
    iget v0, p0, Ll/֨᩶֡;->֫:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/֨᩶֡;->֫:I

    const/4 v2, -0x1

    if-eq p1, v2, :cond_0

    .line 253
    iget-object p1, p0, Ll/۠᩶֡;->ܽ:Ll/᩸᩶֡;

    invoke-static {p1}, Ll/᩸᩶֡;->ۧ(Ll/᩸᩶֡;)[Ll/ۚۙ֡;

    move-result-object p1

    iget v0, p0, Ll/۠᩶֡;->ۧ:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/۠᩶֡;->ۧ:I

    aget-object p1, p1, v0

    .line 209
    iget p1, p1, Ll/ۚۙ֡;->᩹:I

    add-int/lit8 p1, p1, 0x1

    .line 254
    invoke-static {p1}, Ll/ۧᩳܽ;->ۜ(I)I

    move-result p1

    add-int/2addr p1, v1

    iput p1, p0, Ll/֨᩶֡;->֫:I

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x2

    .line 256
    iput v0, p0, Ll/֨᩶֡;->֫:I

    return-void
.end method

.method public final ֫(II)V
    .locals 0

    .line 192
    iget p1, p0, Ll/֨᩶֡;->֫:I

    add-int/2addr p1, p2

    iput p1, p0, Ll/֨᩶֡;->֫:I

    return-void
.end method

.method public final ֫(IIIIZ)V
    .locals 3

    .line 223
    iget v0, p0, Ll/֨᩶֡;->֫:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/֨᩶֡;->֫:I

    .line 224
    iget-object v0, p0, Ll/۠᩶֡;->ܽ:Ll/᩸᩶֡;

    iget-object v1, v0, Ll/ۚۙ֡;->᩸:Ll/ۗ᩶֡;

    invoke-virtual {v1}, Ll/ۗ᩶֡;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz p5, :cond_0

    .line 225
    iget p5, p0, Ll/֨᩶֡;->֫:I

    invoke-static {p1}, Ll/ۧᩳܽ;->᩻(I)I

    move-result p1

    add-int/2addr p1, p5

    iput p1, p0, Ll/֨᩶֡;->֫:I

    goto :goto_0

    .line 227
    :cond_0
    iget p5, p0, Ll/֨᩶֡;->֫:I

    invoke-static {p1}, Ll/ۧᩳܽ;->ۜ(I)I

    move-result p1

    add-int/2addr p1, p5

    iput p1, p0, Ll/֨᩶֡;->֫:I

    :goto_0
    const/4 p1, -0x1

    if-eq p2, p1, :cond_1

    .line 230
    iget p2, p0, Ll/֨᩶֡;->֫:I

    invoke-static {v0}, Ll/᩸᩶֡;->ۧ(Ll/᩸᩶֡;)[Ll/ۚۙ֡;

    move-result-object p5

    iget v1, p0, Ll/۠᩶֡;->ۧ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/۠᩶֡;->ۧ:I

    aget-object p5, p5, v1

    .line 209
    iget p5, p5, Ll/ۚۙ֡;->᩹:I

    add-int/lit8 p5, p5, 0x1

    .line 231
    invoke-static {p5}, Ll/ۧᩳܽ;->ۜ(I)I

    move-result p5

    add-int/2addr p5, p2

    iput p5, p0, Ll/֨᩶֡;->֫:I

    goto :goto_1

    .line 233
    :cond_1
    iget p2, p0, Ll/֨᩶֡;->֫:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Ll/֨᩶֡;->֫:I

    :goto_1
    if-eq p3, p1, :cond_2

    .line 236
    iget p2, p0, Ll/֨᩶֡;->֫:I

    invoke-static {v0}, Ll/᩸᩶֡;->ۧ(Ll/᩸᩶֡;)[Ll/ۚۙ֡;

    move-result-object p3

    iget p5, p0, Ll/۠᩶֡;->ۧ:I

    add-int/lit8 v1, p5, 0x1

    iput v1, p0, Ll/۠᩶֡;->ۧ:I

    aget-object p3, p3, p5

    .line 209
    iget p3, p3, Ll/ۚۙ֡;->᩹:I

    add-int/lit8 p3, p3, 0x1

    .line 237
    invoke-static {p3}, Ll/ۧᩳܽ;->ۜ(I)I

    move-result p3

    add-int/2addr p3, p2

    iput p3, p0, Ll/֨᩶֡;->֫:I

    goto :goto_2

    .line 239
    :cond_2
    iget p2, p0, Ll/֨᩶֡;->֫:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Ll/֨᩶֡;->֫:I

    :goto_2
    if-eq p4, p1, :cond_3

    .line 242
    iget p1, p0, Ll/֨᩶֡;->֫:I

    invoke-static {v0}, Ll/᩸᩶֡;->ۧ(Ll/᩸᩶֡;)[Ll/ۚۙ֡;

    move-result-object p2

    iget p3, p0, Ll/۠᩶֡;->ۧ:I

    add-int/lit8 p4, p3, 0x1

    iput p4, p0, Ll/۠᩶֡;->ۧ:I

    aget-object p2, p2, p3

    .line 209
    iget p2, p2, Ll/ۚۙ֡;->᩹:I

    add-int/lit8 p2, p2, 0x1

    .line 243
    invoke-static {p2}, Ll/ۧᩳܽ;->ۜ(I)I

    move-result p2

    add-int/2addr p2, p1

    iput p2, p0, Ll/֨᩶֡;->֫:I

    return-void

    .line 245
    :cond_3
    iget p1, p0, Ll/֨᩶֡;->֫:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/֨᩶֡;->֫:I

    return-void
.end method

.method public final ֫(IIIZ)V
    .locals 3

    .line 198
    iget v0, p0, Ll/֨᩶֡;->֫:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/֨᩶֡;->֫:I

    .line 199
    iget-object v0, p0, Ll/۠᩶֡;->ܽ:Ll/᩸᩶֡;

    iget-object v1, v0, Ll/ۚۙ֡;->᩸:Ll/ۗ᩶֡;

    invoke-virtual {v1}, Ll/ۗ᩶֡;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz p4, :cond_0

    .line 200
    iget p4, p0, Ll/֨᩶֡;->֫:I

    invoke-static {p1}, Ll/ۧᩳܽ;->᩻(I)I

    move-result p1

    add-int/2addr p1, p4

    iput p1, p0, Ll/֨᩶֡;->֫:I

    goto :goto_0

    .line 202
    :cond_0
    iget p4, p0, Ll/֨᩶֡;->֫:I

    invoke-static {p1}, Ll/ۧᩳܽ;->ۜ(I)I

    move-result p1

    add-int/2addr p1, p4

    iput p1, p0, Ll/֨᩶֡;->֫:I

    :goto_0
    const/4 p1, -0x1

    if-eq p2, p1, :cond_1

    .line 205
    iget p2, p0, Ll/֨᩶֡;->֫:I

    invoke-static {v0}, Ll/᩸᩶֡;->ۧ(Ll/᩸᩶֡;)[Ll/ۚۙ֡;

    move-result-object p4

    iget v1, p0, Ll/۠᩶֡;->ۧ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/۠᩶֡;->ۧ:I

    aget-object p4, p4, v1

    .line 209
    iget p4, p4, Ll/ۚۙ֡;->᩹:I

    add-int/lit8 p4, p4, 0x1

    .line 206
    invoke-static {p4}, Ll/ۧᩳܽ;->ۜ(I)I

    move-result p4

    add-int/2addr p4, p2

    iput p4, p0, Ll/֨᩶֡;->֫:I

    goto :goto_1

    .line 208
    :cond_1
    iget p2, p0, Ll/֨᩶֡;->֫:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Ll/֨᩶֡;->֫:I

    :goto_1
    if-eq p3, p1, :cond_2

    .line 211
    iget p1, p0, Ll/֨᩶֡;->֫:I

    invoke-static {v0}, Ll/᩸᩶֡;->ۧ(Ll/᩸᩶֡;)[Ll/ۚۙ֡;

    move-result-object p2

    iget p3, p0, Ll/۠᩶֡;->ۧ:I

    add-int/lit8 p4, p3, 0x1

    iput p4, p0, Ll/۠᩶֡;->ۧ:I

    aget-object p2, p2, p3

    .line 209
    iget p2, p2, Ll/ۚۙ֡;->᩹:I

    add-int/lit8 p2, p2, 0x1

    .line 212
    invoke-static {p2}, Ll/ۧᩳܽ;->ۜ(I)I

    move-result p2

    add-int/2addr p2, p1

    iput p2, p0, Ll/֨᩶֡;->֫:I

    return-void

    .line 214
    :cond_2
    iget p1, p0, Ll/֨᩶֡;->֫:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/֨᩶֡;->֫:I

    return-void
.end method
