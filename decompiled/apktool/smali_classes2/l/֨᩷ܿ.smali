.class public final Ll/֨᩷ܿ;
.super Ll/ۢܺܿ;
.source "SARS"


# instance fields
.field public ۜ:Ljava/util/List;

.field public ܳ:Z

.field public ܽ:Ljava/util/List;

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Ll/ۚ᩷ܿ;

.field public ᩻:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/ۢܺܿ;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Ll/ۢܺܿ;-><init>(Ll/ۢܺܿ;)V

    .line 18
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/֨᩷ܿ;->ܽ:Ljava/util/List;

    .line 19
    iput-object p1, p0, Ll/֨᩷ܿ;->᩻:Ljava/util/List;

    .line 20
    iput-object p1, p0, Ll/֨᩷ܿ;->ۜ:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ll/ۢܺܿ;Ll/۬ۜܽ;)V
    .locals 6

    .line 28
    invoke-direct {p0, p1}, Ll/ۢܺܿ;-><init>(Ll/ۢܺܿ;)V

    .line 18
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/֨᩷ܿ;->ܽ:Ljava/util/List;

    .line 19
    iput-object p1, p0, Ll/֨᩷ܿ;->᩻:Ljava/util/List;

    .line 20
    iput-object p1, p0, Ll/֨᩷ܿ;->ۜ:Ljava/util/List;

    const/16 p1, 0x4f01

    .line 29
    invoke-static {p2, p1}, Ll/᩹ۜܽ;->֫(Ll/۬ۜܽ;I)V

    .line 30
    invoke-virtual {p2}, Ll/۬ۜܽ;->readInt()I

    .line 31
    invoke-virtual {p2}, Ll/۬ۜܽ;->᩵()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/֨᩷ܿ;->ܿ:Ljava/lang/String;

    .line 64
    invoke-virtual {p2}, Ll/۬ۜܽ;->ۛۧ()I

    move-result p1

    .line 65
    invoke-virtual {p2}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v0

    .line 66
    new-instance v1, Ljava/util/ArrayList;

    add-int/lit8 v2, v0, 0x1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 67
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    invoke-virtual {p2}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_0

    .line 89
    invoke-virtual {p2}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v5

    .line 70
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    invoke-virtual {p2}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 73
    :cond_0
    invoke-static {v1, v2, p1}, Ll/ۚ᩷ܿ;->֫(Ljava/util/ArrayList;Ljava/util/ArrayList;I)Ll/ۚ᩷ܿ;

    move-result-object p1

    .line 32
    iput-object p1, p0, Ll/֨᩷ܿ;->ᩳ:Ll/ۚ᩷ܿ;

    .line 33
    invoke-virtual {p2}, Ll/۬ۜܽ;->ܳ()Z

    move-result p1

    iput-boolean p1, p0, Ll/֨᩷ܿ;->ܳ:Z

    .line 34
    invoke-virtual {p2}, Ll/۬ۜܽ;->ۛۧ()I

    move-result p1

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_1
    if-ge v1, p1, :cond_1

    .line 37
    new-instance v2, Ll/᩺᩻ܿ;

    invoke-virtual {p2}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v4

    .line 89
    invoke-virtual {p2}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v5

    .line 38
    invoke-direct {v2, v4, v5}, Ll/᩺᩻ܿ;-><init>(ILjava/lang/String;)V

    .line 37
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 40
    :cond_1
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/֨᩷ܿ;->ܽ:Ljava/util/List;

    .line 41
    invoke-virtual {p2}, Ll/۬ۜܽ;->ۛۧ()I

    move-result p1

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_2
    if-ge v1, p1, :cond_2

    .line 44
    invoke-virtual {p2}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v4

    invoke-static {v4, v2}, Ll/ۗ᩷ܿ;->֫(ILjava/lang/String;)Ll/ۗ᩷ܿ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 46
    :cond_2
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/֨᩷ܿ;->᩻:Ljava/util/List;

    .line 47
    invoke-virtual {p2}, Ll/۬ۜܽ;->ۛۧ()I

    move-result p1

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_3
    if-ge v3, p1, :cond_3

    .line 50
    invoke-virtual {p2}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v1

    .line 51
    invoke-static {p0, p2}, Ll/ۢܺܿ;->֫(Ll/ۢܺܿ;Ll/۬ۜܽ;)Ll/ۢܺܿ;

    move-result-object v2

    .line 52
    new-instance v4, Ll/ۡܺܿ;

    invoke-direct {v4, v1, v2}, Ll/ۡܺܿ;-><init>(ILl/ۢܺܿ;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 54
    :cond_3
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/֨᩷ܿ;->ۜ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۢܺܿ;)Ll/ۢܺܿ;
    .locals 3

    .line 107
    new-instance v0, Ll/֨᩷ܿ;

    invoke-direct {v0, p1}, Ll/֨᩷ܿ;-><init>(Ll/ۢܺܿ;)V

    .line 108
    iget-object p1, p0, Ll/ۢܺܿ;->ۧ:Landroid/graphics/Point;

    iput-object p1, v0, Ll/ۢܺܿ;->ۧ:Landroid/graphics/Point;

    .line 109
    iget-object p1, p0, Ll/֨᩷ܿ;->ܿ:Ljava/lang/String;

    iput-object p1, v0, Ll/֨᩷ܿ;->ܿ:Ljava/lang/String;

    .line 110
    iget-object p1, p0, Ll/֨᩷ܿ;->ᩳ:Ll/ۚ᩷ܿ;

    iput-object p1, v0, Ll/֨᩷ܿ;->ᩳ:Ll/ۚ᩷ܿ;

    .line 111
    iget-object p1, p0, Ll/֨᩷ܿ;->ܽ:Ljava/util/List;

    iput-object p1, v0, Ll/֨᩷ܿ;->ܽ:Ljava/util/List;

    .line 112
    iget-object p1, p0, Ll/֨᩷ܿ;->᩻:Ljava/util/List;

    iput-object p1, v0, Ll/֨᩷ܿ;->᩻:Ljava/util/List;

    .line 113
    iget-object p1, p0, Ll/֨᩷ܿ;->ۜ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    .line 114
    new-instance p1, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/֨᩷ܿ;->ۜ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 115
    iget-object v1, p0, Ll/֨᩷ܿ;->ۜ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡܺܿ;

    .line 116
    invoke-virtual {v2, v0}, Ll/ۡܺܿ;->֫(Ll/ۢܺܿ;)Ll/ۡܺܿ;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 118
    :cond_0
    iput-object p1, v0, Ll/֨᩷ܿ;->ۜ:Ljava/util/List;

    .line 120
    :cond_1
    iget-boolean p1, p0, Ll/֨᩷ܿ;->ܳ:Z

    iput-boolean p1, v0, Ll/֨᩷ܿ;->ܳ:Z

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 129
    iput-object p1, p0, Ll/֨᩷ܿ;->ܿ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/lang/StringBuilder;I)V
    .locals 8

    const-string v0, "\t"

    .line 188
    invoke-static {p2, v0}, Ll/ۢܺ֡;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{\n"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, p2, 0x1

    .line 189
    invoke-static {v1, v0}, Ll/ۢܺ֡;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 190
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "match: "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    iget-object v3, p0, Ll/֨᩷ܿ;->ᩳ:Ll/ۚ᩷ܿ;

    invoke-virtual {v3, p1}, Ll/ۚ᩷ܿ;->֫(Ljava/lang/StringBuilder;)V

    const/16 v3, 0xa

    .line 192
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 193
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "recordAllGroups: "

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v4, p0, Ll/֨᩷ܿ;->ܳ:Z

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 194
    iget-object v4, p0, Ll/֨᩷ܿ;->ܽ:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const-string v6, "\"\n"

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩺᩻ܿ;

    .line 195
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "export: "

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ll/᩺᩻ܿ;->֫()I

    move-result v7

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " => \""

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    invoke-virtual {v5}, Ll/᩺᩻ܿ;->ܽ()Ljava/lang/String;

    move-result-object v5

    .line 10
    invoke-static {v5}, Ll/ܰ᩵ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 196
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 198
    :cond_0
    iget-object v4, p0, Ll/֨᩷ܿ;->᩻:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۗ᩷ܿ;

    .line 199
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v7, v5, Ll/ۗ᩷ܿ;->᩹:I

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ": \""

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v5, Ll/ۗ᩷ܿ;->ۙ:Ljava/lang/String;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 201
    :cond_1
    iget-object v4, p0, Ll/֨᩷ܿ;->ۜ:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۡܺܿ;

    .line 202
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "subMatcher: "

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ll/ۡܺܿ;->֫()I

    move-result v6

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 203
    invoke-virtual {v5}, Ll/ۡܺܿ;->ܽ()Ll/ۢܺܿ;

    move-result-object v5

    invoke-virtual {v5, p1, v1}, Ll/ۢܺܿ;->֫(Ljava/lang/StringBuilder;I)V

    goto :goto_2

    .line 206
    :cond_2
    invoke-static {p2, v0}, Ll/ۢܺ֡;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "}\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫(Ll/ۗ᩷ܿ;)V
    .locals 0

    .line 165
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/֨᩷ܿ;->᩻:Ljava/util/List;

    return-void
.end method

.method public final ֫(Ll/ۚ᩷ܿ;)V
    .locals 0

    .line 145
    iput-object p1, p0, Ll/֨᩷ܿ;->ᩳ:Ll/ۚ᩷ܿ;

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 5

    const/16 v0, 0x4f01

    .line 60
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ۡ(I)V

    .line 61
    invoke-virtual {p1}, Ll/ۤۜܽ;->ܳ()V

    .line 62
    iget-object v0, p0, Ll/֨᩷ܿ;->ܿ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Ljava/lang/String;)V

    .line 63
    iget-object v0, p0, Ll/֨᩷ܿ;->ᩳ:Ll/ۚ᩷ܿ;

    invoke-virtual {v0, p1}, Ll/ۚ᩷ܿ;->֫(Ll/ۤۜܽ;)V

    .line 64
    iget-boolean v0, p0, Ll/֨᩷ܿ;->ܳ:Z

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Z)V

    .line 65
    iget-object v0, p0, Ll/֨᩷ܿ;->ܽ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ۡ(I)V

    .line 66
    iget-object v0, p0, Ll/֨᩷ܿ;->ܽ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺᩻ܿ;

    .line 67
    invoke-virtual {v1}, Ll/᩺᩻ܿ;->֫()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->ۡ(I)V

    .line 68
    invoke-virtual {v1}, Ll/᩺᩻ܿ;->ܽ()Ljava/lang/String;

    move-result-object v1

    .line 94
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 70
    :cond_0
    iget-object v0, p0, Ll/֨᩷ܿ;->᩻:Ljava/util/List;

    .line 71
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 72
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->ۡ(I)V

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_1

    .line 74
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗ᩷ܿ;

    .line 75
    iget-object v4, v3, Ll/ۗ᩷ܿ;->ۙ:Ljava/lang/String;

    invoke-virtual {p1, v4}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 76
    iget v3, v3, Ll/ۗ᩷ܿ;->᩹:I

    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->ۡ(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 78
    :cond_1
    iget-object v0, p0, Ll/֨᩷ܿ;->ۜ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ۡ(I)V

    .line 79
    iget-object v0, p0, Ll/֨᩷ܿ;->ۜ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡܺܿ;

    .line 80
    invoke-virtual {v1}, Ll/ۡܺܿ;->֫()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->ۡ(I)V

    .line 81
    invoke-virtual {v1}, Ll/ۡܺܿ;->ܽ()Ll/ۢܺܿ;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ۢܺܿ;->֫(Ll/ۤۜܽ;)V

    goto :goto_2

    .line 83
    :cond_2
    invoke-virtual {p1}, Ll/ۤۜܽ;->֫()V

    return-void
.end method

.method public final ֫(Ll/ۨۘܽ;)V
    .locals 0

    .line 137
    invoke-static {p1}, Ll/ۚ᩷ܿ;->֫(Ll/ۨۘܽ;)Ll/ۚ᩷ܿ;

    move-result-object p1

    iput-object p1, p0, Ll/֨᩷ܿ;->ᩳ:Ll/ۚ᩷ܿ;

    return-void
.end method

.method public final ֫(Ll/᩷ܺܿ;)V
    .locals 2

    .line 89
    iget-object v0, p0, Ll/֨᩷ܿ;->ᩳ:Ll/ۚ᩷ܿ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    iget-object v0, p0, Ll/֨᩷ܿ;->ܽ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    iget-object v1, p0, Ll/ۢܺܿ;->֫:Ll/ۢܺܿ;

    if-nez v0, :cond_1

    .line 91
    instance-of v0, v1, Ll/۠᩷ܿ;

    if-eqz v0, :cond_0

    move-object v0, v1

    check-cast v0, Ll/۠᩷ܿ;

    invoke-virtual {v0}, Ll/۠᩷ܿ;->ܺ()Ll/ۢܺܿ;

    move-result-object v0

    if-ne v0, p0, :cond_0

    goto :goto_0

    .line 92
    :cond_0
    new-instance p1, Ll/ۘۜܿ;

    iget-object v0, p0, Ll/ۢܺܿ;->ۧ:Landroid/graphics/Point;

    const-string v1, "export is only allowed on a direct start match"

    invoke-direct {p1, v0, v1}, Ll/ۘۜܿ;-><init>(Landroid/graphics/Point;Ljava/lang/String;)V

    throw p1

    .line 95
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/֨᩷ܿ;->ᩳ:Ll/ۚ᩷ܿ;

    invoke-virtual {v0}, Ll/ۚ᩷ܿ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 96
    instance-of v0, v1, Ll/۠᩷ܿ;

    if-eqz v0, :cond_2

    check-cast v1, Ll/۠᩷ܿ;

    invoke-virtual {v1}, Ll/۠᩷ܿ;->᩻()Ll/ۢܺܿ;

    move-result-object v0

    if-ne v0, p0, :cond_2

    goto :goto_1

    .line 97
    :cond_2
    new-instance p1, Ll/ۘۜܿ;

    iget-object v0, p0, Ll/ۢܺܿ;->ۧ:Landroid/graphics/Point;

    const-string v1, "var() is only allowed on a direct end match"

    invoke-direct {p1, v0, v1}, Ll/ۘۜܿ;-><init>(Landroid/graphics/Point;Ljava/lang/String;)V

    throw p1

    .line 100
    :cond_3
    :goto_1
    iget-object v0, p0, Ll/֨᩷ܿ;->ۜ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡܺܿ;

    .line 101
    invoke-virtual {v1}, Ll/ۡܺܿ;->ܽ()Ll/ۢܺܿ;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ۢܺܿ;->֫(Ll/᩷ܺܿ;)V

    goto :goto_2

    :cond_4
    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 183
    iput-boolean p1, p0, Ll/֨᩷ܿ;->ܳ:Z

    return-void
.end method

.method public final ۧ()Ljava/util/List;
    .locals 1

    .line 149
    iget-object v0, p0, Ll/֨᩷ܿ;->ܽ:Ljava/util/List;

    return-object v0
.end method

.method public final ۧ(Ljava/util/ArrayList;)V
    .locals 2

    .line 0
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 153
    iput-object p1, p0, Ll/֨᩷ܿ;->ܽ:Ljava/util/List;

    return-void
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 169
    iget-object v0, p0, Ll/֨᩷ܿ;->ۜ:Ljava/util/List;

    return-object v0
.end method

.method public final ܽ()Ll/ۚ᩷ܿ;
    .locals 1

    .line 141
    iget-object v0, p0, Ll/֨᩷ܿ;->ᩳ:Ll/ۚ᩷ܿ;

    return-object v0
.end method

.method public final ܽ(Ljava/util/ArrayList;)V
    .locals 0

    .line 161
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/֨᩷ܿ;->᩻:Ljava/util/List;

    return-void
.end method

.method public final ܿ()Ljava/util/List;
    .locals 1

    .line 157
    iget-object v0, p0, Ll/֨᩷ܿ;->᩻:Ljava/util/List;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Ll/֨᩷ܿ;->ܿ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ(Ljava/util/ArrayList;)V
    .locals 1

    .line 173
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/֨᩷ܿ;->ۜ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 174
    :cond_1
    :goto_0
    iput-object p1, p0, Ll/֨᩷ܿ;->ۜ:Ljava/util/List;

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 179
    iget-boolean v0, p0, Ll/֨᩷ܿ;->ܳ:Z

    return v0
.end method
