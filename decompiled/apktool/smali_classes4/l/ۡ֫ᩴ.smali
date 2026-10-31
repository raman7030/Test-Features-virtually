.class public final Ll/ۡ֫ᩴ;
.super Ll/ܿᩴᩴ;
.source "97L"

# interfaces
.implements Ll/᩺۟ۘ;
.implements Ll/ۡ۫ᩴ;


# instance fields
.field public final synthetic ᩸:Ll/᩵֫ᩴ;


# direct methods
.method public constructor <init>(Ll/᩵֫ᩴ;)V
    .locals 0

    .line 941
    iput-object p1, p0, Ll/ۡ֫ᩴ;->᩸:Ll/᩵֫ᩴ;

    .line 34
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 1025
    iget-object v0, p0, Ll/ۡ֫ᩴ;->᩸:Ll/᩵֫ᩴ;

    invoke-virtual {v0}, Ll/᩵֫ᩴ;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 6

    .line 961
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-nez v0, :cond_0

    goto :goto_0

    .line 962
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 963
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Character;

    if-nez v0, :cond_1

    goto :goto_0

    .line 964
    :cond_1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    .line 965
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x1

    .line 966
    iget-object v2, p0, Ll/ۡ֫ᩴ;->᩸:Ll/᩵֫ᩴ;

    if-nez v0, :cond_2

    iget-boolean v0, v2, Ll/᩵֫ᩴ;->᩸:Z

    if-eqz v0, :cond_6

    iget-object v0, v2, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    iget v2, v2, Ll/᩵֫ᩴ;->ۛ:I

    aget-object v0, v0, v2

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    return v1

    .line 968
    :cond_2
    iget-object v3, v2, Ll/᩵֫ᩴ;->ۙ:[C

    .line 971
    invoke-static {v0}, Ll/ܰۛۡ;->֫(I)I

    move-result v4

    iget v5, v2, Ll/᩵֫ᩴ;->۬:I

    and-int/2addr v4, v5

    aget-char v5, v3, v4

    if-nez v5, :cond_3

    goto :goto_0

    :cond_3
    if-ne v0, v5, :cond_4

    .line 972
    iget-object v0, v2, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    aget-object v0, v0, v4

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    add-int/2addr v4, v1

    .line 975
    iget v5, v2, Ll/᩵֫ᩴ;->۬:I

    and-int/2addr v4, v5

    aget-char v5, v3, v4

    if-nez v5, :cond_5

    goto :goto_0

    :cond_5
    if-ne v0, v5, :cond_4

    .line 976
    iget-object v0, v2, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    aget-object v0, v0, v4

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_6
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final forEach(Ljava/util/function/Consumer;)V
    .locals 4

    .line 1031
    iget-object v0, p0, Ll/ۡ֫ᩴ;->᩸:Ll/᩵֫ᩴ;

    iget-boolean v1, v0, Ll/᩵֫ᩴ;->᩸:Z

    if-eqz v1, :cond_0

    new-instance v1, Ll/ۢ֫ᩴ;

    iget v2, v0, Ll/᩵֫ᩴ;->ۛ:I

    invoke-direct {v1, v0, v2}, Ll/ۢ֫ᩴ;-><init>(Ll/᩵֫ᩴ;I)V

    invoke-interface {p1, v1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 1032
    :cond_0
    iget-object v1, v0, Ll/᩵֫ᩴ;->ۙ:[C

    .line 1033
    iget v2, v0, Ll/᩵֫ᩴ;->ۛ:I

    :goto_0
    add-int/lit8 v3, v2, -0x1

    if-eqz v2, :cond_2

    aget-char v2, v1, v3

    if-eqz v2, :cond_1

    new-instance v2, Ll/ۢ֫ᩴ;

    invoke-direct {v2, v0, v3}, Ll/ۢ֫ᩴ;-><init>(Ll/᩵֫ᩴ;I)V

    invoke-interface {p1, v2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    :cond_1
    move v2, v3

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final iterator()Ll/۫֡ᩴ;
    .locals 2

    .line 944
    new-instance v0, Ll/ᩳ֫ᩴ;

    iget-object v1, p0, Ll/ۡ֫ᩴ;->᩸:Ll/᩵֫ᩴ;

    invoke-direct {v0, v1}, Ll/ᩳ֫ᩴ;-><init>(Ll/᩵֫ᩴ;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 6

    .line 983
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-nez v0, :cond_0

    goto/16 :goto_0

    .line 984
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 985
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Character;

    if-nez v0, :cond_1

    goto :goto_0

    .line 986
    :cond_1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    .line 987
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x1

    .line 988
    iget-object v2, p0, Ll/ۡ֫ᩴ;->᩸:Ll/᩵֫ᩴ;

    if-nez v0, :cond_2

    .line 989
    iget-boolean v0, v2, Ll/᩵֫ᩴ;->᩸:Z

    if-eqz v0, :cond_6

    iget-object v0, v2, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    iget v3, v2, Ll/᩵֫ᩴ;->ۛ:I

    aget-object v0, v0, v3

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 990
    invoke-static {v2}, Ll/᩵֫ᩴ;->֫(Ll/᩵֫ᩴ;)V

    return v1

    .line 996
    :cond_2
    iget-object v3, v2, Ll/᩵֫ᩴ;->ۙ:[C

    .line 999
    invoke-static {v0}, Ll/ܰۛۡ;->֫(I)I

    move-result v4

    iget v5, v2, Ll/᩵֫ᩴ;->۬:I

    and-int/2addr v4, v5

    aget-char v5, v3, v4

    if-nez v5, :cond_3

    goto :goto_0

    :cond_3
    if-ne v5, v0, :cond_4

    .line 1001
    iget-object v0, v2, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    aget-object v0, v0, v4

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 1002
    invoke-static {v2, v4}, Ll/᩵֫ᩴ;->֫(Ll/᩵֫ᩴ;I)V

    return v1

    :cond_4
    add-int/2addr v4, v1

    .line 1008
    iget v5, v2, Ll/᩵֫ᩴ;->۬:I

    and-int/2addr v4, v5

    aget-char v5, v3, v4

    if-nez v5, :cond_5

    goto :goto_0

    :cond_5
    if-ne v5, v0, :cond_4

    .line 1010
    iget-object v5, v2, Ll/᩵֫ᩴ;->᩺:[Ljava/lang/Object;

    aget-object v5, v5, v4

    invoke-static {v5, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 1011
    invoke-static {v2, v4}, Ll/᩵֫ᩴ;->֫(Ll/᩵֫ᩴ;I)V

    return v1

    :cond_6
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final size()I
    .locals 1

    .line 1020
    iget-object v0, p0, Ll/ۡ֫ᩴ;->᩸:Ll/᩵֫ᩴ;

    iget v0, v0, Ll/᩵֫ᩴ;->ۨ:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ۡ֫ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/۠ۚᩴ;
    .locals 2

    .line 954
    new-instance v0, Ll/ܿ֫ᩴ;

    iget-object v1, p0, Ll/ۡ֫ᩴ;->᩸:Ll/᩵֫ᩴ;

    invoke-direct {v0, v1}, Ll/ܿ֫ᩴ;-><init>(Ll/᩵֫ᩴ;)V

    return-object v0
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 941
    invoke-virtual {p0}, Ll/ۡ֫ᩴ;->spliterator()Ll/۠ۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/۫֡ᩴ;
    .locals 2

    .line 949
    new-instance v0, Ll/ܳ֫ᩴ;

    iget-object v1, p0, Ll/ۡ֫ᩴ;->᩸:Ll/᩵֫ᩴ;

    invoke-direct {v0, v1}, Ll/ܳ֫ᩴ;-><init>(Ll/᩵֫ᩴ;)V

    return-object v0
.end method
