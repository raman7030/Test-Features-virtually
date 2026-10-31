.class public final Ll/᩵۫ۧ;
.super Ljava/lang/Object;
.source "R68J"


# instance fields
.field public final ֫:Ll/ۗ᩵;

.field public final ۧ:Ll/ۚ᩵;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, Ll/ۗ᩵;

    invoke-direct {v0}, Ll/ۗ᩵;-><init>()V

    iput-object v0, p0, Ll/᩵۫ۧ;->֫:Ll/ۗ᩵;

    .line 47
    new-instance v0, Ll/ۚ᩵;

    invoke-direct {v0}, Ll/ۚ᩵;-><init>()V

    iput-object v0, p0, Ll/᩵۫ۧ;->ۧ:Ll/ۚ᩵;

    return-void
.end method

.method private ֫(Ll/ۗ۬ۧ;I)Ll/ۨۗۧ;
    .locals 5

    .line 101
    iget-object v0, p0, Ll/᩵۫ۧ;->֫:Ll/ۗ᩵;

    invoke-virtual {v0, p1}, Ll/ۗ᩵;->֫(Ljava/lang/Object;)I

    move-result p1

    const/4 v1, 0x0

    if-gez p1, :cond_0

    goto :goto_1

    .line 105
    :cond_0
    invoke-virtual {v0, p1}, Ll/ۗ᩵;->ܳ(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘ۫ۧ;

    if-eqz v2, :cond_4

    .line 106
    iget v3, v2, Ll/ۘ۫ۧ;->֫:I

    and-int v4, v3, p2

    if-eqz v4, :cond_4

    not-int v4, p2

    and-int/2addr v3, v4

    .line 107
    iput v3, v2, Ll/ۘ۫ۧ;->֫:I

    const/4 v4, 0x4

    if-ne p2, v4, :cond_1

    .line 110
    iget-object p2, v2, Ll/ۘ۫ۧ;->ܽ:Ll/ۨۗۧ;

    goto :goto_0

    :cond_1
    const/16 v4, 0x8

    if-ne p2, v4, :cond_3

    .line 112
    iget-object p2, v2, Ll/ۘ۫ۧ;->ۧ:Ll/ۨۗۧ;

    :goto_0
    and-int/lit8 v3, v3, 0xc

    if-nez v3, :cond_2

    .line 118
    invoke-virtual {v0, p1}, Ll/ۗ᩵;->ܿ(I)Ljava/lang/Object;

    const/4 p1, 0x0

    .line 318
    iput p1, v2, Ll/ۘ۫ۧ;->֫:I

    .line 319
    iput-object v1, v2, Ll/ۘ۫ۧ;->ܽ:Ll/ۨۗۧ;

    .line 320
    iput-object v1, v2, Ll/ۘ۫ۧ;->ۧ:Ll/ۨۗۧ;

    .line 321
    sget-object p1, Ll/ۘ۫ۧ;->ᩳ:Ll/ۨۤ;

    invoke-virtual {p1, v2}, Ll/ۨۤ;->֫(Ljava/lang/Object;)Z

    :cond_2
    return-object p2

    .line 114
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must provide flag PRE or POST"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    return-object v1
.end method


# virtual methods
.method public final ֫(Ll/ۗ۬ۧ;)Ll/ۨۗۧ;
    .locals 1

    const/16 v0, 0x8

    .line 97
    invoke-direct {p0, p1, v0}, Ll/᩵۫ۧ;->֫(Ll/ۗ۬ۧ;I)Ll/ۨۗۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۗ۬ۧ;Ll/ۨۗۧ;)V
    .locals 2

    const/4 v0, 0x0

    .line 369
    iget-object v1, p0, Ll/᩵۫ۧ;->֫:Ll/ۗ᩵;

    invoke-virtual {v1, p1, v0}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 182
    check-cast v0, Ll/ۘ۫ۧ;

    if-nez v0, :cond_0

    .line 184
    invoke-static {}, Ll/ۘ۫ۧ;->֫()Ll/ۘ۫ۧ;

    move-result-object v0

    .line 185
    invoke-virtual {v1, p1, v0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    :cond_0
    iput-object p2, v0, Ll/ۘ۫ۧ;->ۧ:Ll/ۨۗۧ;

    .line 188
    iget p1, v0, Ll/ۘ۫ۧ;->֫:I

    or-int/lit8 p1, p1, 0x8

    iput p1, v0, Ll/ۘ۫ۧ;->֫:I

    return-void
.end method

.method public final ۧ(Ll/ۗ۬ۧ;)Ll/ۨۗۧ;
    .locals 1

    const/4 v0, 0x4

    .line 86
    invoke-direct {p0, p1, v0}, Ll/᩵۫ۧ;->֫(Ll/ۗ۬ۧ;I)Ll/ۨۗۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ(Ll/ۗ۬ۧ;)V
    .locals 2

    .line 211
    iget-object v0, p0, Ll/᩵۫ۧ;->֫:Ll/ۗ᩵;

    const/4 v1, 0x0

    .line 369
    invoke-virtual {v0, p1, v1}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 211
    check-cast p1, Ll/ۘ۫ۧ;

    if-nez p1, :cond_0

    return-void

    .line 215
    :cond_0
    iget v0, p1, Ll/ۘ۫ۧ;->֫:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p1, Ll/ۘ۫ۧ;->֫:I

    return-void
.end method

.method public final ᩳ(Ll/ۗ۬ۧ;)V
    .locals 3

    .line 260
    iget-object v0, p0, Ll/᩵۫ۧ;->ۧ:Ll/ۚ᩵;

    invoke-virtual {v0}, Ll/ۚ᩵;->ܽ()I

    move-result v1

    :cond_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_1

    .line 261
    invoke-virtual {v0, v1}, Ll/ۚ᩵;->ᩳ(I)Ljava/lang/Object;

    move-result-object v2

    if-ne p1, v2, :cond_0

    .line 262
    invoke-virtual {v0, v1}, Ll/ۚ᩵;->ܽ(I)V

    .line 266
    :cond_1
    iget-object v0, p0, Ll/᩵۫ۧ;->֫:Ll/ۗ᩵;

    invoke-virtual {v0, p1}, Ll/ۗ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘ۫ۧ;

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    .line 318
    iput v0, p1, Ll/ۘ۫ۧ;->֫:I

    const/4 v0, 0x0

    .line 319
    iput-object v0, p1, Ll/ۘ۫ۧ;->ܽ:Ll/ۨۗۧ;

    .line 320
    iput-object v0, p1, Ll/ۘ۫ۧ;->ۧ:Ll/ۨۗۧ;

    .line 321
    sget-object v0, Ll/ۘ۫ۧ;->ᩳ:Ll/ۨۤ;

    invoke-virtual {v0, p1}, Ll/ۨۤ;->֫(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method
