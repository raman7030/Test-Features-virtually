.class public final Ll/۬ۜܺ;
.super Ljava/lang/Object;
.source "8BDT"

# interfaces
.implements Ll/֡ᩴܺ;
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩸:Ll/ܳ᩷ܺ;

.field public final ᩹:Ll/᩹ܺܺ;


# direct methods
.method public constructor <init>(Ll/᩹ܺܺ;Ll/ܰۢܺ;Ll/֫ۜܺ;)V
    .locals 4

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Ll/۬ۜܺ;->᩹:Ll/᩹ܺܺ;

    .line 73
    invoke-virtual {p2}, Ll/ܿᩴܺ;->size()I

    move-result p1

    .line 74
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    .line 78
    invoke-virtual {p2, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩺ۢܺ;

    move-result-object v2

    .line 79
    new-instance v3, Ll/֡᩻ܺ;

    invoke-direct {v3, v2, p3}, Ll/֡᩻ܺ;-><init>(Ll/᩺ۢܺ;Ll/֫ۜܺ;)V

    .line 80
    new-instance v2, Ll/ۚ᩻ܺ;

    invoke-direct {v2, v3}, Ll/ۚ᩻ܺ;-><init>(Ll/֡᩻ܺ;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 83
    :cond_0
    new-instance p1, Ll/ܳ᩷ܺ;

    sget-object p2, Ll/ۘۜܺ;->ۛ:Ll/ۘۜܺ;

    invoke-direct {p1, p2, v0}, Ll/ܳ᩷ܺ;-><init>(Ll/ۘۜܺ;Ljava/util/ArrayList;)V

    iput-object p1, p0, Ll/۬ۜܺ;->᩸:Ll/ܳ᩷ܺ;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 31
    check-cast p1, Ll/۬ۜܺ;

    .line 112
    iget-object v0, p0, Ll/۬ۜܺ;->᩹:Ll/᩹ܺܺ;

    iget-object p1, p1, Ll/۬ۜܺ;->᩹:Ll/᩹ܺܺ;

    invoke-virtual {v0, p1}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 100
    instance-of v0, p1, Ll/۬ۜܺ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 104
    :cond_0
    check-cast p1, Ll/۬ۜܺ;

    iget-object p1, p1, Ll/۬ۜܺ;->᩹:Ll/᩹ܺܺ;

    iget-object v0, p0, Ll/۬ۜܺ;->᩹:Ll/᩹ܺܺ;

    invoke-virtual {v0, p1}, Ll/ܶܺܺ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 92
    iget-object v0, p0, Ll/۬ۜܺ;->᩹:Ll/᩹ܺܺ;

    invoke-virtual {v0}, Ll/ܶܺܺ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 5

    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 151
    iget-object v1, p0, Ll/۬ۜܺ;->᩹:Ll/᩹ܺܺ;

    invoke-virtual {v1}, Ll/ܶܺܺ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    iget-object v1, p0, Ll/۬ۜܺ;->᩸:Ll/ܳ᩷ܺ;

    invoke-virtual {v1}, Ll/ܳ᩷ܺ;->ۡ()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚ᩻ܺ;

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_1

    :cond_0
    const-string v4, ", "

    .line 159
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    :goto_1
    invoke-virtual {v3}, Ll/ۚ᩻ܺ;->ۢ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 164
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֫ۜܺ;)V
    .locals 2

    .line 119
    invoke-virtual {p1}, Ll/֫ۜܺ;->ܺ()Ll/᩸ۜܺ;

    move-result-object v0

    .line 120
    invoke-virtual {p1}, Ll/֫ۜܺ;->ۚ()Ll/ۙۜܺ;

    move-result-object p1

    .line 122
    iget-object v1, p0, Ll/۬ۜܺ;->᩹:Ll/᩹ܺܺ;

    invoke-virtual {v0, v1}, Ll/᩸ۜܺ;->ۧ(Ll/ܽܺܺ;)V

    .line 123
    iget-object v0, p0, Ll/۬ۜܺ;->᩸:Ll/ܳ᩷ܺ;

    invoke-virtual {p1, v0}, Ll/ۙۜܺ;->֫(Ll/ۗۜܺ;)V

    return-void
.end method

.method public final ֫(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V
    .locals 4

    .line 130
    invoke-virtual {p1}, Ll/֫ۜܺ;->ܺ()Ll/᩸ۜܺ;

    move-result-object p1

    iget-object v0, p0, Ll/۬ۜܺ;->᩹:Ll/᩹ܺܺ;

    invoke-virtual {p1, v0}, Ll/᩸ۜܺ;->֫(Ll/ܽܺܺ;)I

    move-result p1

    .line 131
    iget-object v1, p0, Ll/۬ۜܺ;->᩸:Ll/ܳ᩷ܺ;

    invoke-virtual {v1}, Ll/ۗۜܺ;->ܿ()I

    move-result v1

    .line 133
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->֫()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 134
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "    "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ܶܺܺ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p2, v2, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 135
    invoke-static {p1}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "      method_idx:      "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x4

    invoke-virtual {p2, v2, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 137
    invoke-static {v1}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v0

    const-string v3, "      annotations_off: "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 136
    invoke-virtual {p2, v2, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 140
    :cond_0
    invoke-virtual {p2, p1}, Ll/ᩳᩴܺ;->ܿ(I)V

    .line 141
    invoke-virtual {p2, v1}, Ll/ᩳᩴܺ;->ܿ(I)V

    return-void
.end method
