.class public abstract Ll/᩹ᩳ֡;
.super Ljava/lang/Object;
.source "A4PA"


# instance fields
.field public ֫:Ll/᩻ܿ֡;


# direct methods
.method public constructor <init>(Ll/᩻ܿ֡;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, Ll/᩹ᩳ֡;->֫:Ll/᩻ܿ֡;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 307
    iget-object v0, p0, Ll/᩹ᩳ֡;->֫:Ll/᩻ܿ֡;

    iget v0, v0, Ll/᩻ܿ֡;->ܿ:I

    return v0
.end method

.method public abstract ֫(ILl/ۨᩳ֡;)Ljava/lang/Object;
.end method

.method public abstract ֫(Ll/ۨᩳ֡;)Ljava/lang/Object;
.end method

.method public final ֫(Ll/ۨᩳ֡;ILl/᩶ᩳ֡;)Ljava/lang/Object;
    .locals 2

    .line 104
    invoke-virtual {p0, p1}, Ll/᩹ᩳ֡;->֫(Ll/ۨᩳ֡;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    .line 105
    invoke-interface {p1, v1}, Ll/ۨᩳ֡;->ۧ(I)I

    move-result v1

    if-ne v1, p2, :cond_0

    .line 106
    invoke-interface {p1}, Ll/ۨᩳ֡;->ۧ()V

    const/4 p1, 0x0

    .line 107
    iget-object p2, p0, Ll/᩹ᩳ֡;->֫:Ll/᩻ܿ֡;

    iput-boolean p1, p2, Ll/᩻ܿ֡;->ۧ:Z

    return-object v0

    .line 115
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Ll/᩹ᩳ֡;->ۧ(Ll/ۨᩳ֡;ILl/᩶ᩳ֡;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ll/ۜܿ֡;)Ljava/lang/String;
    .locals 2

    .line 327
    invoke-interface {p1}, Ll/ۜܿ֡;->getText()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 329
    invoke-interface {p1}, Ll/ۜܿ֡;->getType()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const-string v0, "<EOF>"

    goto :goto_0

    .line 333
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ll/ۜܿ֡;->getType()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ">"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    :goto_0
    const-string p1, "\n"

    const-string v1, "\\\\n"

    .line 336
    invoke-virtual {v0, p1, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "\r"

    const-string v1, "\\\\r"

    .line 337
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "\t"

    const-string v1, "\\\\t"

    .line 338
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "\'"

    .line 0
    invoke-static {v0, p1, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Z)Ll/᩶ᩳ֡;
    .locals 5

    .line 533
    iget-object v0, p0, Ll/᩹ᩳ֡;->֫:Ll/᩻ܿ֡;

    iget v1, v0, Ll/᩻ܿ֡;->֫:I

    .line 534
    new-instance v2, Ll/᩶ᩳ֡;

    invoke-direct {v2}, Ll/᩶ᩳ֡;-><init>()V

    :goto_0
    if-ltz v1, :cond_1

    .line 536
    iget-object v3, v0, Ll/᩻ܿ֡;->ܽ:[Ll/᩶ᩳ֡;

    aget-object v3, v3, v1

    .line 541
    invoke-virtual {v2, v3}, Ll/᩶ᩳ֡;->֫(Ll/᩶ᩳ֡;)V

    if-eqz p1, :cond_0

    const/4 v4, 0x1

    .line 544
    invoke-virtual {v3, v4}, Ll/᩶ᩳ֡;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_1

    if-lez v1, :cond_0

    .line 548
    invoke-virtual {v2}, Ll/᩶ᩳ֡;->֫()V

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    return-object v2
.end method

.method public final ֫(Ll/ܳܿ֡;)V
    .locals 3

    .line 179
    iget-object v0, p0, Ll/᩹ᩳ֡;->֫:Ll/᩻ܿ֡;

    iget-boolean v1, v0, Ll/᩻ܿ֡;->ۧ:Z

    if-eqz v1, :cond_0

    return-void

    .line 183
    :cond_0
    iget v1, v0, Ll/᩻ܿ֡;->ܿ:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, v0, Ll/᩻ܿ֡;->ܿ:I

    .line 184
    iput-boolean v2, v0, Ll/᩻ܿ֡;->ۧ:Z

    .line 186
    invoke-virtual {p0}, Ll/᩹ᩳ֡;->ۧ()[Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ll/᩹ᩳ֡;->֫(Ll/ܳܿ֡;[Ljava/lang/String;)V

    return-void
.end method

.method public abstract ֫(Ll/ܳܿ֡;[Ljava/lang/String;)V
.end method

.method public final ֫(Ll/᩶ᩳ֡;)V
    .locals 5

    .line 697
    iget-object v0, p0, Ll/᩹ᩳ֡;->֫:Ll/᩻ܿ֡;

    iget v1, v0, Ll/᩻ܿ֡;->֫:I

    add-int/lit8 v1, v1, 0x1

    iget-object v2, v0, Ll/᩻ܿ֡;->ܽ:[Ll/᩶ᩳ֡;

    array-length v3, v2

    if-lt v1, v3, :cond_0

    .line 698
    array-length v1, v2

    mul-int/lit8 v1, v1, 0x2

    new-array v1, v1, [Ll/᩶ᩳ֡;

    .line 699
    array-length v3, v2

    const/4 v4, 0x0

    invoke-static {v2, v4, v1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 700
    iput-object v1, v0, Ll/᩻ܿ֡;->ܽ:[Ll/᩶ᩳ֡;

    .line 702
    :cond_0
    iget-object v1, v0, Ll/᩻ܿ֡;->ܽ:[Ll/᩶ᩳ֡;

    iget v2, v0, Ll/᩻ܿ֡;->֫:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Ll/᩻ܿ֡;->֫:I

    aput-object p1, v1, v2

    return-void
.end method

.method public ۧ(Ll/ۨᩳ֡;ILl/᩶ᩳ֡;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x2

    .line 127
    invoke-interface {p1, v0}, Ll/ۨᩳ֡;->ۧ(I)I

    move-result v0

    if-ne v0, p2, :cond_0

    .line 594
    new-instance p3, Ll/ۢܿ֡;

    .line 36
    invoke-direct {p3, p2, p1}, Ll/۟ᩳ֡;-><init>(ILl/ۨᩳ֡;)V

    .line 601
    invoke-interface {p1}, Ll/ۨᩳ֡;->ۧ()V

    .line 603
    invoke-virtual {p0, p3}, Ll/᩹ᩳ֡;->֫(Ll/ܳܿ֡;)V

    .line 605
    invoke-virtual {p0, p1}, Ll/᩹ᩳ֡;->֫(Ll/ۨᩳ֡;)Ljava/lang/Object;

    move-result-object p2

    .line 606
    invoke-interface {p1}, Ll/ۨᩳ֡;->ۧ()V

    return-object p2

    :cond_0
    if-eqz p3, :cond_3

    const/4 v0, 0x1

    .line 137
    invoke-virtual {p3, v0}, Ll/᩶ᩳ֡;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 525
    invoke-virtual {p0, v0}, Ll/᩹ᩳ֡;->֫(Z)Ll/᩶ᩳ֡;

    move-result-object v1

    .line 111
    invoke-virtual {p3}, Ll/᩶ᩳ֡;->clone()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/᩶ᩳ֡;

    .line 112
    invoke-virtual {p3, v1}, Ll/᩶ᩳ֡;->֫(Ll/᩶ᩳ֡;)V

    .line 140
    iget-object v1, p0, Ll/᩹ᩳ֡;->֫:Ll/᩻ܿ֡;

    iget v1, v1, Ll/᩻ܿ֡;->֫:I

    if-ltz v1, :cond_1

    .line 141
    invoke-virtual {p3}, Ll/᩶ᩳ֡;->֫()V

    .line 154
    :cond_1
    invoke-interface {p1, v0}, Ll/ۨᩳ֡;->ۧ(I)I

    move-result v1

    invoke-virtual {p3, v1}, Ll/᩶ᩳ֡;->֫(I)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p3, v0}, Ll/᩶ᩳ֡;->֫(I)Z

    move-result p3

    if-eqz p3, :cond_3

    .line 611
    :cond_2
    invoke-virtual {p0, p2, p1}, Ll/᩹ᩳ֡;->֫(ILl/ۨᩳ֡;)Ljava/lang/Object;

    move-result-object p3

    .line 612
    new-instance v0, Ll/ۧܿ֡;

    .line 39
    invoke-direct {v0, p2, p1}, Ll/۟ᩳ֡;-><init>(ILl/ۨᩳ֡;)V

    .line 40
    iput-object p3, v0, Ll/ۧܿ֡;->ۤ:Ljava/lang/Object;

    .line 613
    invoke-virtual {p0, v0}, Ll/᩹ᩳ֡;->֫(Ll/ܳܿ֡;)V

    return-object p3

    .line 617
    :cond_3
    new-instance p3, Ll/۟ᩳ֡;

    invoke-direct {p3, p2, p1}, Ll/۟ᩳ֡;-><init>(ILl/ۨᩳ֡;)V

    .line 618
    throw p3
.end method

.method public ۧ(Ll/ܳܿ֡;[Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 220
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 221
    instance-of v1, p1, Ll/ۢܿ֡;

    const-string v2, " expecting "

    const-string v3, "EOF"

    const/4 v4, -0x1

    if-eqz v1, :cond_1

    .line 222
    check-cast p1, Ll/ۢܿ֡;

    .line 224
    iget v0, p1, Ll/۟ᩳ֡;->۫:I

    if-ne v0, v4, :cond_0

    goto :goto_0

    .line 228
    :cond_0
    aget-object v3, p2, v0

    .line 230
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "extraneous input "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    iget-object p1, p1, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    .line 230
    invoke-virtual {p0, p1}, Ll/᩹ᩳ֡;->֫(Ll/ۜܿ֡;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 233
    :cond_1
    instance-of v1, p1, Ll/ۧܿ֡;

    if-eqz v1, :cond_3

    .line 234
    move-object v0, p1

    check-cast v0, Ll/ۧܿ֡;

    .line 236
    iget v0, v0, Ll/۟ᩳ֡;->۫:I

    if-ne v0, v4, :cond_2

    goto :goto_1

    .line 240
    :cond_2
    aget-object v3, p2, v0

    :goto_1
    const-string p2, "missing "

    const-string v0, " at "

    .line 0
    invoke-static {p2, v3, v0}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 242
    iget-object p1, p1, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    invoke-virtual {p0, p1}, Ll/᩹ᩳ֡;->֫(Ll/ۜܿ֡;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 244
    :cond_3
    instance-of v1, p1, Ll/۟ᩳ֡;

    const-string v5, "mismatched input "

    if-eqz v1, :cond_5

    .line 245
    move-object v0, p1

    check-cast v0, Ll/۟ᩳ֡;

    .line 247
    iget v0, v0, Ll/۟ᩳ֡;->۫:I

    if-ne v0, v4, :cond_4

    goto :goto_2

    .line 251
    :cond_4
    aget-object v3, p2, v0

    .line 253
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    invoke-virtual {p0, p1}, Ll/᩹ᩳ֡;->֫(Ll/ۜܿ֡;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 256
    :cond_5
    instance-of v1, p1, Ll/֫ܿ֡;

    if-eqz v1, :cond_7

    .line 257
    check-cast p1, Ll/֫ܿ֡;

    .line 259
    iget v0, p1, Ll/֫ܿ֡;->۫:I

    if-ne v0, v4, :cond_6

    goto :goto_3

    .line 263
    :cond_6
    aget-object v3, p2, v0

    .line 265
    :goto_3
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "mismatched tree node: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Ll/ܳܿ֡;->ۗ:Ljava/lang/Object;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 268
    :cond_7
    instance-of p2, p1, Ll/ܽܿ֡;

    if-eqz p2, :cond_8

    .line 273
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "no viable alternative at input "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    invoke-virtual {p0, p1}, Ll/᩹ᩳ֡;->֫(Ll/ۜܿ֡;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 275
    :cond_8
    instance-of p2, p1, Ll/ۤᩳ֡;

    if-eqz p2, :cond_9

    .line 278
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "required (...)+ loop did not match anything at input "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    invoke-virtual {p0, p1}, Ll/᩹ᩳ֡;->֫(Ll/ۜܿ֡;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 281
    :cond_9
    instance-of p2, p1, Ll/ܰᩳ֡;

    const-string v1, " expecting set null"

    if-eqz p2, :cond_a

    .line 283
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    invoke-virtual {p0, p1}, Ll/᩹ᩳ֡;->֫(Ll/ۜܿ֡;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 286
    :cond_a
    instance-of p2, p1, Ll/᩺ᩳ֡;

    if-eqz p2, :cond_b

    .line 288
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    invoke-virtual {p0, p1}, Ll/᩹ᩳ֡;->֫(Ll/ۜܿ֡;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 291
    :cond_b
    instance-of p2, p1, Ll/ۛᩳ֡;

    if-eqz p2, :cond_c

    .line 292
    check-cast p1, Ll/ۛᩳ֡;

    .line 293
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "rule "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p1, Ll/ۛᩳ֡;->ۤ:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " failed predicate: {"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Ll/ۛᩳ֡;->۫:Ljava/lang/String;

    const-string v0, "}?"

    .line 0
    invoke-static {p2, p1, v0}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_c
    return-object v0
.end method

.method public final ۧ(Ll/ۨᩳ֡;)V
    .locals 4

    .line 354
    iget-object v0, p0, Ll/᩹ᩳ֡;->֫:Ll/᩻ܿ֡;

    iget v1, v0, Ll/᩻ܿ֡;->ᩳ:I

    invoke-interface {p1}, Ll/ۨᩳ֡;->index()I

    move-result v2

    if-ne v1, v2, :cond_0

    .line 359
    invoke-interface {p1}, Ll/ۨᩳ֡;->ۧ()V

    .line 361
    :cond_0
    invoke-interface {p1}, Ll/ۨᩳ֡;->index()I

    move-result v1

    iput v1, v0, Ll/᩻ܿ֡;->ᩳ:I

    const/4 v0, 0x0

    .line 469
    invoke-virtual {p0, v0}, Ll/᩹ᩳ֡;->֫(Z)Ll/᩶ᩳ֡;

    move-result-object v0

    const/4 v1, 0x1

    .line 687
    invoke-interface {p1, v1}, Ll/ۨᩳ֡;->ۧ(I)I

    move-result v2

    :goto_0
    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    .line 688
    invoke-virtual {v0, v2}, Ll/᩶ᩳ֡;->֫(I)Z

    move-result v2

    if-nez v2, :cond_1

    .line 690
    invoke-interface {p1}, Ll/ۨᩳ֡;->ۧ()V

    .line 691
    invoke-interface {p1, v1}, Ll/ۨᩳ֡;->ۧ(I)I

    move-result v2

    goto :goto_0

    :cond_1
    return-void
.end method

.method public abstract ۧ()[Ljava/lang/String;
.end method
