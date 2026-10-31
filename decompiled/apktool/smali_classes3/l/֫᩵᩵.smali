.class public final Ll/֫᩵᩵;
.super Ll/۬ᩴ᩵;
.source "0A1O"

# interfaces
.implements Ll/ܽۖ᩵;


# static fields
.field public static final ۠֫:Ll/֫᩻֨;


# instance fields
.field public ֡֫:Z

.field public ֨֫:I

.field public ۖ֫:Ljava/lang/String;

.field public ۘ֫:I

.field public ۚ֫:Ljava/lang/String;

.field public ۡ֫:I

.field public ۢ֫:I

.field public ܺ֫:I

.field public ᩴ֫:Ljava/lang/String;

.field public ᩵֫:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 40
    const-class v0, Ll/֫᩵᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/֫᩵᩵;->۠֫:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/֨ۡ᩵;)V
    .locals 1

    const/4 v0, 0x5

    .line 234
    invoke-direct {p0, p2, v0}, Ll/۬ᩴ᩵;-><init>(Ll/֨ۡ᩵;I)V

    const p2, 0x120089

    .line 212
    iput p2, p0, Ll/֫᩵᩵;->ܺ֫:I

    const/4 p2, 0x3

    .line 214
    iput p2, p0, Ll/֫᩵᩵;->֨֫:I

    const/4 p2, 0x1

    .line 215
    iput p2, p0, Ll/֫᩵᩵;->ۢ֫:I

    const/4 p2, 0x0

    .line 216
    iput p2, p0, Ll/֫᩵᩵;->ۡ֫:I

    .line 235
    invoke-virtual {p0, p1}, Ll/֫᩵᩵;->֫(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getPath()Ljava/lang/String;
    .locals 2

    .line 252
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\\"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/֫᩵᩵;->᩵֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 423
    iget-object v0, p0, Ll/֫᩵᩵;->᩵֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 428
    :cond_0
    invoke-static {v0}, Ll/ۗᩴ᩵;->ۡ(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x78

    .line 434
    invoke-static {v0}, Ll/ۗᩴ᩵;->ۡ(I)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 558
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-super {p0}, Ll/ۗᩴ᩵;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֫᩵᩵;->᩵֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",resolveDfs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/֫᩵᩵;->֡֫:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 274
    iget-object v0, p0, Ll/֫᩵᩵;->ۚ֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 4

    .line 309
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x5c

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lez v0, :cond_0

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v1, :cond_0

    .line 310
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 313
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v3, :cond_1

    .line 0
    invoke-static {v3, p1}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v0

    if-ne v0, v1, :cond_1

    invoke-static {v3, v2, p1}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 316
    :cond_1
    iput-object p1, p0, Ll/֫᩵᩵;->᩵֫:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 294
    iput-object p1, p0, Ll/֫᩵᩵;->ۖ֫:Ljava/lang/String;

    .line 295
    iput-object p2, p0, Ll/֫᩵᩵;->ۚ֫:Ljava/lang/String;

    .line 296
    iput-object p3, p0, Ll/֫᩵᩵;->ᩴ֫:Ljava/lang/String;

    return-void
.end method

.method public final ۖ(I)V
    .locals 0

    .line 411
    iput p1, p0, Ll/֫᩵᩵;->ۡ֫:I

    return-void
.end method

.method public final ۘ(I)V
    .locals 0

    .line 379
    iput p1, p0, Ll/֫᩵᩵;->ܺ֫:I

    return-void
.end method

.method public final ۧ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܳ()V
    .locals 1

    const/high16 v0, 0x10000000

    .line 327
    invoke-virtual {p0, v0}, Ll/ۗᩴ᩵;->ܳ(I)V

    const/4 v0, 0x1

    .line 328
    iput-boolean v0, p0, Ll/֫᩵᩵;->֡֫:Z

    return-void
.end method

.method public final ܺ(I)V
    .locals 0

    .line 403
    iput p1, p0, Ll/֫᩵᩵;->ۢ֫:I

    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 285
    iget-object v0, p0, Ll/֫᩵᩵;->ۖ֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ(Ll/ᩴۡ᩵;)Ll/۫ᩴ᩵;
    .locals 2

    .line 241
    new-instance v0, Ll/ۧ᩵᩵;

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    iget-object v1, p0, Ll/֫᩵᩵;->᩵֫:Ljava/lang/String;

    invoke-direct {v0, v1, p1}, Ll/ۧ᩵᩵;-><init>(Ljava/lang/String;Ll/֨ۡ᩵;)V

    return-object v0
.end method

.method public final ᩳ(I[B)I
    .locals 10

    .line 447
    sget-object v0, Ll/֫᩵᩵;->۠֫:Ll/֫᩻֨;

    invoke-interface {v0}, Ll/֫᩻֨;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 448
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Opening "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/֫᩵᩵;->᩵֫:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 449
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ܿ֫()I

    move-result v1

    const/4 v2, 0x4

    invoke-static {v1, v2}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Flags are "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_0
    const-wide/16 v0, 0x39

    .line 452
    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x2

    const/4 v1, 0x0

    .line 453
    aput-byte v1, p2, v0

    add-int/lit8 v0, p1, 0x3

    .line 454
    aput-byte v1, p2, v0

    add-int/lit8 v0, p1, 0x4

    const/4 v2, 0x2

    int-to-long v2, v2

    .line 457
    invoke-static {v2, v3, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x8

    const-wide/16 v2, 0x0

    .line 459
    invoke-static {v2, v3, v0, p2}, Ll/֫֡᩵;->ܽ(JI[B)V

    add-int/lit8 v0, p1, 0x18

    .line 463
    iget v4, p0, Ll/֫᩵᩵;->ܺ֫:I

    int-to-long v4, v4

    invoke-static {v4, v5, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x1c

    .line 465
    iget v4, p0, Ll/֫᩵᩵;->ۘ֫:I

    int-to-long v4, v4

    invoke-static {v4, v5, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x20

    .line 467
    iget v4, p0, Ll/֫᩵᩵;->֨֫:I

    int-to-long v4, v4

    invoke-static {v4, v5, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x24

    .line 469
    iget v4, p0, Ll/֫᩵᩵;->ۢ֫:I

    int-to-long v4, v4

    invoke-static {v4, v5, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x28

    .line 471
    iget v4, p0, Ll/֫᩵᩵;->ۡ֫:I

    int-to-long v4, v4

    invoke-static {v4, v5, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x2c

    .line 475
    iget-object v4, p0, Ll/֫᩵᩵;->᩵֫:Ljava/lang/String;

    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    invoke-virtual {v4, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v4

    .line 476
    array-length v5, v4

    int-to-long v5, v5

    add-int/lit8 v7, p1, 0x2e

    invoke-static {v5, v6, v7, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v5, p1, 0x30

    add-int/lit8 v6, p1, 0x34

    add-int/lit8 v7, p1, 0x38

    .line 484
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ܳ֫()I

    move-result v8

    sub-int v8, v7, v8

    int-to-long v8, v8

    invoke-static {v8, v9, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    .line 486
    array-length v0, v4

    invoke-static {v4, v1, p2, v7, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 487
    array-length v0, v4

    if-nez v0, :cond_1

    add-int/lit8 v0, p1, 0x39

    goto :goto_0

    .line 491
    :cond_1
    array-length v0, v4

    add-int/2addr v0, v7

    .line 494
    :goto_0
    invoke-virtual {p0, v0}, Ll/ۗᩴ᩵;->᩻(I)I

    move-result v4

    add-int/2addr v0, v4

    .line 497
    invoke-static {v2, v3, v5, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    int-to-long v1, v1

    .line 540
    invoke-static {v1, v2, v6, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    sub-int/2addr v0, p1

    return v0
.end method

.method public final ᩴ(I)V
    .locals 0

    .line 387
    iput p1, p0, Ll/֫᩵᩵;->ۘ֫:I

    return-void
.end method

.method public final ᩵()Ljava/lang/String;
    .locals 1

    .line 263
    iget-object v0, p0, Ll/֫᩵᩵;->ᩴ֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩵(I)V
    .locals 0

    .line 395
    iput p1, p0, Ll/֫᩵᩵;->֨֫:I

    return-void
.end method
