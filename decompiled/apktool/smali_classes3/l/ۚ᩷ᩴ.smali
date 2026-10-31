.class public final Ll/ۚ᩷ᩴ;
.super Ll/ܳᩴᩴ;
.source "X5U"


# instance fields
.field public final ᩸:Ll/֡᩷ᩴ;

.field public final synthetic ᩹:Ll/۟᩷ᩴ;


# direct methods
.method public constructor <init>(Ll/۟᩷ᩴ;)V
    .locals 0

    .line 1031
    iput-object p1, p0, Ll/ۚ᩷ᩴ;->᩹:Ll/۟᩷ᩴ;

    .line 34
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 1032
    new-instance p1, Ll/֡᩷ᩴ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ᩷ᩴ;->᩸:Ll/֡᩷ᩴ;

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 1080
    iget-object v0, p0, Ll/ۚ᩷ᩴ;->᩹:Ll/۟᩷ᩴ;

    invoke-virtual {v0}, Ll/۟᩷ᩴ;->clear()V

    return-void
.end method

.method public final comparator()Ljava/util/Comparator;
    .locals 1

    .line 1036
    iget-object v0, p0, Ll/ۚ᩷ᩴ;->᩸:Ll/֡᩷ᩴ;

    return-object v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 1052
    instance-of v1, p1, Ljava/util/Map$Entry;

    if-nez v1, :cond_0

    goto :goto_0

    .line 1053
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 1054
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    return v0

    .line 1055
    :cond_1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Integer;

    if-nez v1, :cond_2

    return v0

    .line 1056
    :cond_2
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Ll/ۚ᩷ᩴ;->᩹:Ll/۟᩷ᩴ;

    invoke-virtual {v1, v0}, Ll/۟᩷ᩴ;->ܽ(I)Ll/۠᩷ᩴ;

    move-result-object v0

    .line 1057
    invoke-interface {p1, v0}, Ljava/util/Map$Entry;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public final first()Ljava/lang/Object;
    .locals 1

    .line 1085
    iget-object v0, p0, Ll/ۚ᩷ᩴ;->᩹:Ll/۟᩷ᩴ;

    iget-object v0, v0, Ll/۟᩷ᩴ;->ۙ:Ll/۠᩷ᩴ;

    return-object v0
.end method

.method public final headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    .line 1031
    check-cast p1, Ll/ۨۜᩴ;

    .line 1100
    iget-object v0, p0, Ll/ۚ᩷ᩴ;->᩹:Ll/۟᩷ᩴ;

    invoke-interface {p1}, Ll/ۨۜᩴ;->֫()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/۟᩷ᩴ;->᩻(I)Ll/֫ۢᩴ;

    move-result-object p1

    check-cast p1, Ll/ۨ᩷ᩴ;

    invoke-virtual {p1}, Ll/ۨ᩷ᩴ;->ۜ()Ll/֨ۚᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Ll/ܶ֡ᩴ;
    .locals 2

    .line 1041
    new-instance v0, Ll/ܶ᩷ᩴ;

    iget-object v1, p0, Ll/ۚ᩷ᩴ;->᩹:Ll/۟᩷ᩴ;

    .line 1010
    invoke-direct {v0, v1}, Ll/᩺᩷ᩴ;-><init>(Ll/۟᩷ᩴ;)V

    return-object v0
.end method

.method public final last()Ljava/lang/Object;
    .locals 1

    .line 1090
    iget-object v0, p0, Ll/ۚ᩷ᩴ;->᩹:Ll/۟᩷ᩴ;

    iget-object v0, v0, Ll/۟᩷ᩴ;->۬:Ll/۠᩷ᩴ;

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 4

    .line 1063
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 1064
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 1065
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    .line 1066
    :cond_1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Integer;

    if-nez v0, :cond_2

    return v1

    .line 1067
    :cond_2
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Ll/ۚ᩷ᩴ;->᩹:Ll/۟᩷ᩴ;

    invoke-virtual {v2, v0}, Ll/۟᩷ᩴ;->ܽ(I)Ll/۠᩷ᩴ;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 125
    iget-object v3, v0, Ll/ۚܿᩴ;->᩹:Ljava/lang/Object;

    .line 1068
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v3, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    .line 1069
    :cond_3
    iget p1, v0, Ll/ۚܿᩴ;->᩸:I

    invoke-virtual {v2, p1}, Ll/۟᩷ᩴ;->remove(I)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_0
    return v1
.end method

.method public final size()I
    .locals 1

    .line 1075
    iget-object v0, p0, Ll/ۚ᩷ᩴ;->᩹:Ll/۟᩷ᩴ;

    iget v0, v0, Ll/۟᩷ᩴ;->᩸:I

    return v0
.end method

.method public final subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    .line 1031
    check-cast p1, Ll/ۨۜᩴ;

    check-cast p2, Ll/ۨۜᩴ;

    .line 1095
    invoke-interface {p1}, Ll/ۨۜᩴ;->֫()I

    move-result p1

    invoke-interface {p2}, Ll/ۨۜᩴ;->֫()I

    move-result p2

    iget-object v0, p0, Ll/ۚ᩷ᩴ;->᩹:Ll/۟᩷ᩴ;

    invoke-virtual {v0, p1, p2}, Ll/۟᩷ᩴ;->ۧ(II)Ll/֫ۢᩴ;

    move-result-object p1

    check-cast p1, Ll/ۨ᩷ᩴ;

    invoke-virtual {p1}, Ll/ۨ᩷ᩴ;->ۜ()Ll/֨ۚᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    .line 1031
    check-cast p1, Ll/ۨۜᩴ;

    .line 1105
    iget-object v0, p0, Ll/ۚ᩷ᩴ;->᩹:Ll/۟᩷ᩴ;

    invoke-interface {p1}, Ll/ۨۜᩴ;->֫()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/۟᩷ᩴ;->ۡ(I)Ll/֫ۢᩴ;

    move-result-object p1

    check-cast p1, Ll/ۨ᩷ᩴ;

    invoke-virtual {p1}, Ll/ۨ᩷ᩴ;->ۜ()Ll/֨ۚᩴ;

    move-result-object p1

    return-object p1
.end method
