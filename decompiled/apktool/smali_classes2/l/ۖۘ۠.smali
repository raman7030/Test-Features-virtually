.class public Ll/ۖۘ۠;
.super Ljava/lang/Object;
.source "43ZG"


# instance fields
.field public ֫:Ll/᩹ۘ۠;

.field public ۧ:Ljava/util/ArrayList;

.field public ܽ:Ll/᩹ۘ۠;

.field public ܿ:Ll/ۙۘ۠;

.field public ᩳ:Ll/ۙۖ۠;


# direct methods
.method public constructor <init>(Ll/ۘۘ۠;Ll/ۙۖ۠;)V
    .locals 1

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۖۘ۠;->ۧ:Ljava/util/ArrayList;

    .line 82
    iput-object p2, p0, Ll/ۖۘ۠;->ᩳ:Ll/ۙۖ۠;

    .line 83
    iget-object p1, p1, Ll/ۘۘ۠;->ܳ:Ll/ۙۘ۠;

    iput-object p1, p0, Ll/ۖۘ۠;->ܿ:Ll/ۙۘ۠;

    .line 84
    sget-object p1, Ll/ۙۘ۠;->ܽ:Ll/᩹ۘ۠;

    iput-object p1, p0, Ll/ۖۘ۠;->֫:Ll/᩹ۘ۠;

    iput-object p1, p0, Ll/ۖۘ۠;->ܽ:Ll/᩹ۘ۠;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 131
    iget-object v0, p0, Ll/ۖۘ۠;->ᩳ:Ll/ۙۖ۠;

    .line 1124
    iget v0, v0, Ll/ۙۖ۠;->ۡ:I

    return v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 135
    iget-object v0, p0, Ll/ۖۘ۠;->ᩳ:Ll/ۙۖ۠;

    .line 1133
    iput p1, v0, Ll/ۙۖ۠;->ۡ:I

    return-void
.end method

.method public final ۧ()Ll/ܰܶ۠;
    .locals 1

    .line 127
    iget-object v0, p0, Ll/ۖۘ۠;->ᩳ:Ll/ۙۖ۠;

    invoke-virtual {v0}, Ll/ۙۖ۠;->ۡ()Ll/ܰܶ۠;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(I)Ll/᩹ۘ۠;
    .locals 3

    if-nez p1, :cond_0

    .line 93
    iget-object p1, p0, Ll/ۖۘ۠;->ܽ:Ll/᩹ۘ۠;

    return-object p1

    .line 101
    :cond_0
    iget-object v0, p0, Ll/ۖۘ۠;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    if-ge v1, p1, :cond_1

    .line 102
    iget-object v2, p0, Ll/ۖۘ۠;->ᩳ:Ll/ۙۖ۠;

    invoke-virtual {v2}, Ll/ۙۖ۠;->ۘ()Ll/᩹ۘ۠;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 p1, p1, -0x1

    .line 96
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹ۘ۠;

    return-object p1
.end method

.method public final ܽ()V
    .locals 2

    .line 111
    iget-object v0, p0, Ll/ۖۘ۠;->ܽ:Ll/᩹ۘ۠;

    iput-object v0, p0, Ll/ۖۘ۠;->֫:Ll/᩹ۘ۠;

    .line 112
    iget-object v0, p0, Ll/ۖۘ۠;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 113
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ۘ۠;

    iput-object v0, p0, Ll/ۖۘ۠;->ܽ:Ll/᩹ۘ۠;

    return-void

    .line 115
    :cond_0
    iget-object v0, p0, Ll/ۖۘ۠;->ᩳ:Ll/ۙۖ۠;

    invoke-virtual {v0}, Ll/ۙۖ۠;->ۘ()Ll/᩹ۘ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ۖۘ۠;->ܽ:Ll/᩹ۘ۠;

    return-void
.end method

.method public final ܿ()Ll/᩹ۘ۠;
    .locals 10

    .line 120
    iget-object v0, p0, Ll/ۖۘ۠;->ܽ:Ll/᩹ۘ۠;

    .line 321
    iget v1, v0, Ll/᩹ۘ۠;->ᩳ:I

    iget-object v2, v0, Ll/᩹ۘ۠;->ܽ:Ll/᩶ۘ۠;

    iget-object v3, v2, Ll/᩶ۘ۠;->᩸:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x2

    if-lt v3, v4, :cond_1

    iget-object v3, v2, Ll/᩶ۘ۠;->᩹:Ll/᩸ۘ۠;

    sget-object v5, Ll/᩸ۘ۠;->᩹:Ll/᩸ۘ۠;

    if-ne v3, v5, :cond_1

    .line 325
    iget-object v3, v2, Ll/᩶ۘ۠;->᩸:Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-virtual {v3, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    iget-object v7, p0, Ll/ۖۘ۠;->ܿ:Ll/ۙۘ۠;

    invoke-virtual {v7, v3}, Ll/ۙۘ۠;->֫(Ljava/lang/String;)Ll/᩶ۘ۠;

    move-result-object v3

    .line 326
    iget-object v2, v2, Ll/᩶ۘ۠;->᩸:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Ll/ۙۘ۠;->֫(Ljava/lang/String;)Ll/᩶ۘ۠;

    move-result-object v2

    if-eqz v3, :cond_0

    if-eqz v2, :cond_0

    .line 331
    new-instance v7, Ll/᩹ۘ۠;

    iget-object v8, v3, Ll/᩶ۘ۠;->᩸:Ljava/lang/String;

    .line 332
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    add-int/2addr v8, v1

    iget-object v9, v0, Ll/᩹ۘ۠;->֫:Ll/ۖܶ۠;

    invoke-direct {v7, v3, v1, v8, v9}, Ll/᩹ۘ۠;-><init>(Ll/᩶ۘ۠;IILl/ۖܶ۠;)V

    new-instance v8, Ll/᩹ۘ۠;

    iget-object v3, v3, Ll/᩶ۘ۠;->᩸:Ljava/lang/String;

    .line 333
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v3, v1

    iget v0, v0, Ll/᩹ۘ۠;->ۧ:I

    const/4 v1, 0x0

    invoke-direct {v8, v2, v3, v0, v1}, Ll/᩹ۘ۠;-><init>(Ll/᩶ۘ۠;IILl/ۖܶ۠;)V

    new-array v0, v4, [Ll/᩹ۘ۠;

    aput-object v7, v0, v5

    aput-object v8, v0, v6

    .line 121
    aget-object v1, v0, v5

    iput-object v1, p0, Ll/ۖۘ۠;->֫:Ll/᩹ۘ۠;

    .line 122
    aget-object v0, v0, v6

    iput-object v0, p0, Ll/ۖۘ۠;->ܽ:Ll/᩹ۘ۠;

    return-object v0

    .line 329
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Cant split - bad subtokens"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 322
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Cant split"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final ᩳ()Ll/᩹ۘ۠;
    .locals 1

    .line 107
    iget-object v0, p0, Ll/ۖۘ۠;->֫:Ll/᩹ۘ۠;

    return-object v0
.end method
