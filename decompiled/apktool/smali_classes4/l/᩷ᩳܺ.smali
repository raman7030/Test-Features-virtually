.class public final Ll/᩷ᩳܺ;
.super Ljava/lang/Object;
.source "5BHG"


# instance fields
.field public ֫:Ljava/util/BitSet;

.field public ۧ:Ljava/util/BitSet;

.field public ܽ:I

.field public final synthetic ᩳ:Ll/ۡᩳܺ;


# direct methods
.method public constructor <init>(Ll/ۡᩳܺ;I)V
    .locals 1

    .line 276
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ᩳܺ;->ᩳ:Ll/ۡᩳܺ;

    .line 277
    iput p2, p0, Ll/᩷ᩳܺ;->ܽ:I

    .line 278
    new-instance p2, Ljava/util/BitSet;

    invoke-static {p1}, Ll/ۡᩳܺ;->ۧ(Ll/ۡᩳܺ;)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/BitSet;-><init>(I)V

    iput-object p2, p0, Ll/᩷ᩳܺ;->ۧ:Ljava/util/BitSet;

    .line 279
    new-instance p2, Ljava/util/BitSet;

    invoke-static {p1}, Ll/ۡᩳܺ;->ۧ(Ll/ۡᩳܺ;)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/BitSet;-><init>(I)V

    iput-object p2, p0, Ll/᩷ᩳܺ;->֫:Ljava/util/BitSet;

    .line 280
    invoke-static {p1}, Ll/ۡᩳܺ;->ܽ(Ll/ۡᩳܺ;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩷ᩳܺ;)Ljava/util/BitSet;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷ᩳܺ;->ۧ:Ljava/util/BitSet;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/᩷ᩳܺ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩷ᩳܺ;->ܽ:I

    return p0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 299
    iget v0, p0, Ll/᩷ᩳܺ;->ܽ:I

    return v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 318
    iget-object v0, p0, Ll/᩷ᩳܺ;->֫:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    return-void
.end method

.method public final ֫(Ll/۫ܽܺ;[I)V
    .locals 6

    .line 360
    iget-object v0, p0, Ll/᩷ᩳܺ;->֫:Ljava/util/BitSet;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v2

    :goto_0
    if-ltz v2, :cond_1

    .line 362
    iget-object v3, p0, Ll/᩷ᩳܺ;->ᩳ:Ll/ۡᩳܺ;

    invoke-static {v3, v2}, Ll/ۡᩳܺ;->֫(Ll/ۡᩳܺ;I)Ll/ܽۡܺ;

    move-result-object v4

    .line 363
    invoke-virtual {v4}, Ll/ܽۡܺ;->ۜ()Ll/᩷ᩴܺ;

    move-result-object v4

    invoke-virtual {v4, v1}, Ll/᩷ᩴܺ;->get(I)I

    move-result v4

    .line 365
    iget v5, p0, Ll/᩷ᩳܺ;->ܽ:I

    invoke-virtual {p1, v5, v2}, Ll/۫ܽܺ;->ۧ(II)Ll/۫ܽܺ;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 368
    invoke-static {v3, v4, v5, p2}, Ll/ۡᩳܺ;->֫(Ll/ۡᩳܺ;ILl/۫ܽܺ;[I)V

    goto :goto_1

    .line 371
    :cond_0
    invoke-static {v2, p2}, Ll/ܰۘܺ;->ᩳ(I[I)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 361
    invoke-virtual {v0, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v2

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۧ()Ll/᩷ᩴܺ;
    .locals 5

    .line 332
    new-instance v0, Ll/᩷ᩴܺ;

    iget-object v1, p0, Ll/᩷ᩳܺ;->֫:Ljava/util/BitSet;

    invoke-virtual {v1}, Ljava/util/BitSet;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ll/᩷ᩴܺ;-><init>(I)V

    const/4 v2, 0x0

    .line 340
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v3

    :goto_0
    if-ltz v3, :cond_0

    .line 342
    iget-object v4, p0, Ll/᩷ᩳܺ;->ᩳ:Ll/ۡᩳܺ;

    invoke-static {v4, v3}, Ll/ۡᩳܺ;->֫(Ll/ۡᩳܺ;I)Ll/ܽۡܺ;

    move-result-object v4

    .line 343
    invoke-virtual {v4}, Ll/ܽۡܺ;->ۜ()Ll/᩷ᩴܺ;

    move-result-object v4

    invoke-virtual {v4, v2}, Ll/᩷ᩴܺ;->get(I)I

    move-result v4

    invoke-virtual {v0, v4}, Ll/᩷ᩴܺ;->add(I)V

    add-int/lit8 v3, v3, 0x1

    .line 341
    invoke-virtual {v1, v3}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v3

    goto :goto_0

    .line 346
    :cond_0
    invoke-virtual {v0}, Ll/ᩴᩴܺ;->ܺ()V

    return-object v0
.end method

.method public final ۧ(I)V
    .locals 1

    .line 309
    iget-object v0, p0, Ll/᩷ᩳܺ;->ۧ:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    return-void
.end method
