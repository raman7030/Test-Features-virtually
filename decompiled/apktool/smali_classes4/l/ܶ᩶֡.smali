.class public final Ll/ܶ᩶֡;
.super Ll/ᩴ᩶֡;
.source "F5QL"


# instance fields
.field public ֫:I

.field public final synthetic ۧ:Ll/᩸᩶֡;

.field public final synthetic ܽ:Ll/֫ۗ֡;


# direct methods
.method public constructor <init>(Ll/᩸᩶֡;Ll/֫ۗ֡;)V
    .locals 0

    .line 248
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 305
    iput-object p1, p0, Ll/ܶ᩶֡;->ۧ:Ll/᩸᩶֡;

    iput-object p2, p0, Ll/ܶ᩶֡;->ܽ:Ll/֫ۗ֡;

    const/4 p1, 0x0

    .line 306
    iput p1, p0, Ll/ܶ᩶֡;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 3

    .line 363
    sget-object v0, Ll/֡᩶֡;->ۛ:Ll/֡᩶֡;

    iget-byte v0, v0, Ll/֡᩶֡;->᩸:B

    iget-object v1, p0, Ll/ܶ᩶֡;->ܽ:Ll/֫ۗ֡;

    invoke-virtual {v1, v0}, Ll/֫ۗ֡;->ۧ(I)V

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 365
    iget-object p1, p0, Ll/ܶ᩶֡;->ۧ:Ll/᩸᩶֡;

    invoke-static {p1}, Ll/᩸᩶֡;->ۧ(Ll/᩸᩶֡;)[Ll/ۚۙ֡;

    move-result-object p1

    iget v0, p0, Ll/ܶ᩶֡;->֫:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/ܶ᩶֡;->֫:I

    aget-object p1, p1, v0

    .line 209
    iget p1, p1, Ll/ۚۙ֡;->᩹:I

    add-int/lit8 p1, p1, 0x1

    .line 365
    invoke-virtual {v1, p1}, Ll/֫ۗ֡;->ܳ(I)I

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 367
    invoke-virtual {v1, p1}, Ll/֫ۗ֡;->ۧ(I)V

    return-void
.end method

.method public final ֫(II)V
    .locals 2

    .line 310
    iget-object v0, p0, Ll/ܶ᩶֡;->ۧ:Ll/᩸᩶֡;

    invoke-static {v0}, Ll/᩸᩶֡;->֫(Ll/᩸᩶֡;)[B

    move-result-object v0

    iget-object v1, p0, Ll/ܶ᩶֡;->ܽ:Ll/֫ۗ֡;

    invoke-virtual {v1, v0, p1, p2}, Ll/֫ۗ֡;->֫([BII)V

    return-void
.end method

.method public final ֫(IIIIZ)V
    .locals 4

    .line 338
    sget-object v0, Ll/֡᩶֡;->۟:Ll/֡᩶֡;

    iget-byte v0, v0, Ll/֡᩶֡;->᩸:B

    iget-object v1, p0, Ll/ܶ᩶֡;->ܽ:Ll/֫ۗ֡;

    invoke-virtual {v1, v0}, Ll/֫ۗ֡;->ۧ(I)V

    .line 339
    iget-object v0, p0, Ll/ܶ᩶֡;->ۧ:Ll/᩸᩶֡;

    iget-object v2, v0, Ll/ۚۙ֡;->᩸:Ll/ۗ᩶֡;

    invoke-virtual {v2}, Ll/ۗ᩶֡;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_0

    if-eqz p5, :cond_0

    .line 340
    invoke-virtual {v1, p1}, Ll/֫ۗ֡;->ܿ(I)I

    goto :goto_0

    .line 342
    :cond_0
    invoke-virtual {v1, p1}, Ll/֫ۗ֡;->ܳ(I)I

    :goto_0
    const/4 p1, 0x0

    const/4 p5, -0x1

    if-eq p2, p5, :cond_1

    .line 345
    invoke-static {v0}, Ll/᩸᩶֡;->ۧ(Ll/᩸᩶֡;)[Ll/ۚۙ֡;

    move-result-object p2

    iget v2, p0, Ll/ܶ᩶֡;->֫:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/ܶ᩶֡;->֫:I

    aget-object p2, p2, v2

    .line 209
    iget p2, p2, Ll/ۚۙ֡;->᩹:I

    add-int/lit8 p2, p2, 0x1

    .line 345
    invoke-virtual {v1, p2}, Ll/֫ۗ֡;->ܳ(I)I

    goto :goto_1

    .line 347
    :cond_1
    invoke-virtual {v1, p1}, Ll/֫ۗ֡;->ۧ(I)V

    :goto_1
    if-eq p3, p5, :cond_2

    .line 350
    invoke-static {v0}, Ll/᩸᩶֡;->ۧ(Ll/᩸᩶֡;)[Ll/ۚۙ֡;

    move-result-object p2

    iget p3, p0, Ll/ܶ᩶֡;->֫:I

    add-int/lit8 v2, p3, 0x1

    iput v2, p0, Ll/ܶ᩶֡;->֫:I

    aget-object p2, p2, p3

    .line 209
    iget p2, p2, Ll/ۚۙ֡;->᩹:I

    add-int/lit8 p2, p2, 0x1

    .line 350
    invoke-virtual {v1, p2}, Ll/֫ۗ֡;->ܳ(I)I

    goto :goto_2

    .line 352
    :cond_2
    invoke-virtual {v1, p1}, Ll/֫ۗ֡;->ۧ(I)V

    :goto_2
    if-eq p4, p5, :cond_3

    .line 355
    invoke-static {v0}, Ll/᩸᩶֡;->ۧ(Ll/᩸᩶֡;)[Ll/ۚۙ֡;

    move-result-object p1

    iget p2, p0, Ll/ܶ᩶֡;->֫:I

    add-int/lit8 p3, p2, 0x1

    iput p3, p0, Ll/ܶ᩶֡;->֫:I

    aget-object p1, p1, p2

    .line 209
    iget p1, p1, Ll/ۚۙ֡;->᩹:I

    add-int/lit8 p1, p1, 0x1

    .line 355
    invoke-virtual {v1, p1}, Ll/֫ۗ֡;->ܳ(I)I

    return-void

    .line 357
    :cond_3
    invoke-virtual {v1, p1}, Ll/֫ۗ֡;->ۧ(I)V

    return-void
.end method

.method public final ֫(IIIZ)V
    .locals 4

    .line 316
    sget-object v0, Ll/֡᩶֡;->ܰ:Ll/֡᩶֡;

    iget-byte v0, v0, Ll/֡᩶֡;->᩸:B

    iget-object v1, p0, Ll/ܶ᩶֡;->ܽ:Ll/֫ۗ֡;

    invoke-virtual {v1, v0}, Ll/֫ۗ֡;->ۧ(I)V

    .line 317
    iget-object v0, p0, Ll/ܶ᩶֡;->ۧ:Ll/᩸᩶֡;

    iget-object v2, v0, Ll/ۚۙ֡;->᩸:Ll/ۗ᩶֡;

    invoke-virtual {v2}, Ll/ۗ᩶֡;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_0

    if-eqz p4, :cond_0

    .line 318
    invoke-virtual {v1, p1}, Ll/֫ۗ֡;->ܿ(I)I

    goto :goto_0

    .line 320
    :cond_0
    invoke-virtual {v1, p1}, Ll/֫ۗ֡;->ܳ(I)I

    :goto_0
    const/4 p1, 0x0

    const/4 p4, -0x1

    if-eq p2, p4, :cond_1

    .line 323
    invoke-static {v0}, Ll/᩸᩶֡;->ۧ(Ll/᩸᩶֡;)[Ll/ۚۙ֡;

    move-result-object p2

    iget v2, p0, Ll/ܶ᩶֡;->֫:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/ܶ᩶֡;->֫:I

    aget-object p2, p2, v2

    .line 209
    iget p2, p2, Ll/ۚۙ֡;->᩹:I

    add-int/lit8 p2, p2, 0x1

    .line 323
    invoke-virtual {v1, p2}, Ll/֫ۗ֡;->ܳ(I)I

    goto :goto_1

    .line 325
    :cond_1
    invoke-virtual {v1, p1}, Ll/֫ۗ֡;->ۧ(I)V

    :goto_1
    if-eq p3, p4, :cond_2

    .line 328
    invoke-static {v0}, Ll/᩸᩶֡;->ۧ(Ll/᩸᩶֡;)[Ll/ۚۙ֡;

    move-result-object p1

    iget p2, p0, Ll/ܶ᩶֡;->֫:I

    add-int/lit8 p3, p2, 0x1

    iput p3, p0, Ll/ܶ᩶֡;->֫:I

    aget-object p1, p1, p2

    .line 209
    iget p1, p1, Ll/ۚۙ֡;->᩹:I

    add-int/lit8 p1, p1, 0x1

    .line 328
    invoke-virtual {v1, p1}, Ll/֫ۗ֡;->ܳ(I)I

    return-void

    .line 330
    :cond_2
    invoke-virtual {v1, p1}, Ll/֫ۗ֡;->ۧ(I)V

    return-void
.end method
