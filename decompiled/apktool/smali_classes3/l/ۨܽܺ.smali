.class public final Ll/ۨܽܺ;
.super Ljava/lang/Object;
.source "FBEZ"


# instance fields
.field public final ֫:Ll/۬ܺܺ;

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:I

.field public final ܿ:Ll/۬ܺܺ;

.field public final ᩳ:Ll/۬ܺܺ;


# direct methods
.method public constructor <init>(IILl/۬ܺܺ;Ll/۬ܺܺ;Ll/۬ܺܺ;I)V
    .locals 0

    .line 250
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_5

    if-ltz p2, :cond_4

    if-eqz p3, :cond_3

    if-nez p4, :cond_1

    if-eqz p5, :cond_0

    goto :goto_0

    .line 264
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "(descriptor == null) && (signature == null)"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-ltz p6, :cond_2

    .line 272
    iput p1, p0, Ll/ۨܽܺ;->ܳ:I

    .line 273
    iput p2, p0, Ll/ۨܽܺ;->ܽ:I

    .line 274
    iput-object p3, p0, Ll/ۨܽܺ;->ᩳ:Ll/۬ܺܺ;

    .line 275
    iput-object p4, p0, Ll/ۨܽܺ;->֫:Ll/۬ܺܺ;

    .line 276
    iput-object p5, p0, Ll/ۨܽܺ;->ܿ:Ll/۬ܺܺ;

    .line 277
    iput p6, p0, Ll/ۨܽܺ;->ۧ:I

    return-void

    .line 269
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "index < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 260
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "name == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 256
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "length < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 252
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "startPc < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ۧ(Ll/ۨܽܺ;)Ll/۬ܺܺ;
    .locals 0

    .line 323
    iget-object p0, p0, Ll/ۨܽܺ;->ܿ:Ll/۬ܺܺ;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/۬ܺܺ;)Ll/ۨܽܺ;
    .locals 8

    .line 353
    new-instance v7, Ll/ۨܽܺ;

    iget-object v4, p0, Ll/ۨܽܺ;->֫:Ll/۬ܺܺ;

    iget v6, p0, Ll/ۨܽܺ;->ۧ:I

    iget v1, p0, Ll/ۨܽܺ;->ܳ:I

    iget v2, p0, Ll/ۨܽܺ;->ܽ:I

    iget-object v3, p0, Ll/ۨܽܺ;->ᩳ:Ll/۬ܺܺ;

    move-object v0, v7

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, Ll/ۨܽܺ;-><init>(IILl/۬ܺܺ;Ll/۬ܺܺ;Ll/۬ܺܺ;I)V

    return-object v7
.end method

.method public final ֫()Ll/ᩴۡܺ;
    .locals 2

    .line 313
    iget-object v0, p0, Ll/ۨܽܺ;->ᩳ:Ll/۬ܺܺ;

    iget-object v1, p0, Ll/ۨܽܺ;->ܿ:Ll/۬ܺܺ;

    invoke-static {v0, v1}, Ll/ᩴۡܺ;->֫(Ll/۬ܺܺ;Ll/۬ܺܺ;)Ll/ᩴۡܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(II)Z
    .locals 1

    .line 367
    iget v0, p0, Ll/ۨܽܺ;->ۧ:I

    if-ne p2, v0, :cond_0

    iget p2, p0, Ll/ۨܽܺ;->ܳ:I

    if-lt p1, p2, :cond_0

    iget v0, p0, Ll/ۨܽܺ;->ܽ:I

    add-int/2addr p2, v0

    if-ge p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/ۨܽܺ;)Z
    .locals 2

    .line 381
    iget v0, p0, Ll/ۨܽܺ;->ܳ:I

    iget v1, p1, Ll/ۨܽܺ;->ܳ:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ۨܽܺ;->ܽ:I

    iget v1, p1, Ll/ۨܽܺ;->ܽ:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ۨܽܺ;->ۧ:I

    iget v1, p1, Ll/ۨܽܺ;->ۧ:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ۨܽܺ;->ᩳ:Ll/۬ܺܺ;

    iget-object p1, p1, Ll/ۨܽܺ;->ᩳ:Ll/۬ܺܺ;

    .line 384
    invoke-virtual {v0, p1}, Ll/۬ܺܺ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Ll/۟ܺܺ;
    .locals 1

    .line 342
    iget-object v0, p0, Ll/ۨܽܺ;->֫:Ll/۬ܺܺ;

    invoke-virtual {v0}, Ll/۬ܺܺ;->getString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/۟ܺܺ;->֫(Ljava/lang/String;)Ll/۟ܺܺ;

    move-result-object v0

    return-object v0
.end method
