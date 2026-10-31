.class public final Ll/ۛۢܺ;
.super Ll/ᩴᩴܺ;
.source "N5A8"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ll/֡ᩴܺ;


# instance fields
.field public final ۙ:Ll/ۨۢܺ;

.field public final ᩶:Ll/۫ܺܺ;

.field public final ᩹:Ljava/util/TreeMap;


# direct methods
.method public constructor <init>(Ll/۫ܺܺ;Ll/ۨۢܺ;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ll/ᩴᩴܺ;-><init>()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 66
    iput-object p1, p0, Ll/ۛۢܺ;->᩶:Ll/۫ܺܺ;

    .line 67
    iput-object p2, p0, Ll/ۛۢܺ;->ۙ:Ll/ۨۢܺ;

    .line 68
    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    iput-object p1, p0, Ll/ۛۢܺ;->᩹:Ljava/util/TreeMap;

    return-void

    .line 63
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "visibility == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 59
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "type == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 34
    check-cast p1, Ll/ۛۢܺ;

    invoke-virtual {p0, p1}, Ll/ۛۢܺ;->֫(Ll/ۛۢܺ;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 76
    instance-of v0, p1, Ll/ۛۢܺ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 80
    :cond_0
    check-cast p1, Ll/ۛۢܺ;

    .line 82
    iget-object v0, p0, Ll/ۛۢܺ;->᩶:Ll/۫ܺܺ;

    iget-object v2, p1, Ll/ۛۢܺ;->᩶:Ll/۫ܺܺ;

    invoke-virtual {v0, v2}, Ll/۫ܺܺ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۛۢܺ;->ۙ:Ll/ۨۢܺ;

    iget-object v2, p1, Ll/ۛۢܺ;->ۙ:Ll/ۨۢܺ;

    if-eq v0, v2, :cond_1

    goto :goto_0

    .line 87
    :cond_1
    iget-object v0, p0, Ll/ۛۢܺ;->᩹:Ljava/util/TreeMap;

    iget-object p1, p1, Ll/ۛۢܺ;->᩹:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method public final getType()Ll/۫ܺܺ;
    .locals 1

    .line 182
    iget-object v0, p0, Ll/ۛۢܺ;->᩶:Ll/۫ܺܺ;

    return-object v0
.end method

.method public final getVisibility()Ll/ۨۢܺ;
    .locals 1

    .line 191
    iget-object v0, p0, Ll/ۛۢܺ;->ۙ:Ll/ۨۢܺ;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .line 95
    iget-object v0, p0, Ll/ۛۢܺ;->᩶:Ll/۫ܺܺ;

    invoke-virtual {v0}, Ll/۫ܺܺ;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 96
    iget-object v1, p0, Ll/ۛۢܺ;->᩹:Ljava/util/TreeMap;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 97
    iget-object v0, p0, Ll/ۛۢܺ;->ۙ:Ll/ۨۢܺ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 145
    invoke-virtual {p0}, Ll/ۛۢܺ;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۛۢܺ;)I
    .locals 3

    .line 106
    iget-object v0, p0, Ll/ۛۢܺ;->᩶:Ll/۫ܺܺ;

    iget-object v1, p1, Ll/ۛۢܺ;->᩶:Ll/۫ܺܺ;

    invoke-virtual {v0, v1}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 112
    :cond_0
    iget-object v0, p0, Ll/ۛۢܺ;->ۙ:Ll/ۨۢܺ;

    iget-object v1, p1, Ll/ۛۢܺ;->ۙ:Ll/ۨۢܺ;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    .line 118
    :cond_1
    iget-object v0, p0, Ll/ۛۢܺ;->᩹:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 119
    iget-object p1, p1, Ll/ۛۢܺ;->᩹:Ljava/util/TreeMap;

    invoke-virtual {p1}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 121
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 122
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ۢܺ;

    .line 123
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟ۢܺ;

    .line 125
    invoke-virtual {v1, v2}, Ll/۟ۢܺ;->֫(Ll/۟ۢܺ;)I

    move-result v1

    if-eqz v1, :cond_2

    return v1

    .line 131
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 p1, 0x1

    return p1

    .line 133
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, -0x1

    return p1

    :cond_5
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 5

    .line 153
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 155
    iget-object v1, p0, Ll/ۛۢܺ;->ۙ:Ll/ۨۢܺ;

    invoke-virtual {v1}, Ll/ۨۢܺ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-annotation "

    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    iget-object v1, p0, Ll/ۛۢܺ;->᩶:Ll/۫ܺܺ;

    invoke-virtual {v1}, Ll/۫ܺܺ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " {"

    .line 158
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    iget-object v1, p0, Ll/ۛۢܺ;->᩹:Ljava/util/TreeMap;

    invoke-virtual {v1}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟ۢܺ;

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_1

    :cond_0
    const-string v4, ", "

    .line 165
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    :goto_1
    invoke-virtual {v3}, Ll/۟ۢܺ;->getName()Ll/۬ܺܺ;

    move-result-object v4

    invoke-virtual {v4}, Ll/۬ܺܺ;->֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ": "

    .line 168
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    invoke-virtual {v3}, Ll/۟ۢܺ;->getValue()Ll/ܰۡܺ;

    move-result-object v3

    invoke-interface {v3}, Ll/֡ᩴܺ;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v1, "}"

    .line 172
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/۟ۢܺ;)V
    .locals 3

    .line 219
    invoke-virtual {p0}, Ll/ᩴᩴܺ;->ᩴ()V

    .line 225
    invoke-virtual {p1}, Ll/۟ۢܺ;->getName()Ll/۬ܺܺ;

    move-result-object v0

    .line 227
    iget-object v1, p0, Ll/ۛۢܺ;->᩹:Ljava/util/TreeMap;

    invoke-virtual {v1, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    .line 231
    invoke-virtual {v1, v0, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 228
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "name already added: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۚ()Ljava/util/Collection;
    .locals 1

    .line 241
    iget-object v0, p0, Ll/ۛۢܺ;->᩹:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/۟ۢܺ;)V
    .locals 2

    .line 202
    invoke-virtual {p0}, Ll/ᩴᩴܺ;->ᩴ()V

    .line 208
    iget-object v0, p0, Ll/ۛۢܺ;->᩹:Ljava/util/TreeMap;

    invoke-virtual {p1}, Ll/۟ۢܺ;->getName()Ll/۬ܺܺ;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
