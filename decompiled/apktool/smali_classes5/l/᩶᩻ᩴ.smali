.class public final Ll/᩶᩻ᩴ;
.super Ll/ܿᩴᩴ;
.source "M1N0"

# interfaces
.implements Ll/ۘ᩻ᩴ;
.implements Ll/ۡ۫ᩴ;


# instance fields
.field public final synthetic ᩸:Ll/ۤ᩻ᩴ;


# direct methods
.method public constructor <init>(Ll/ۤ᩻ᩴ;)V
    .locals 0

    .line 1022
    iput-object p1, p0, Ll/᩶᩻ᩴ;->᩸:Ll/ۤ᩻ᩴ;

    .line 34
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 1108
    iget-object v0, p0, Ll/᩶᩻ᩴ;->᩸:Ll/ۤ᩻ᩴ;

    invoke-virtual {v0}, Ll/ۤ᩻ᩴ;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 6

    .line 1042
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 1043
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 1044
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto :goto_1

    .line 1045
    :cond_1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Integer;

    if-nez v0, :cond_2

    goto :goto_1

    .line 1046
    :cond_2
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 1047
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v1, 0x1

    .line 1048
    iget-object v2, p0, Ll/᩶᩻ᩴ;->᩸:Ll/ۤ᩻ᩴ;

    if-nez v0, :cond_3

    iget-boolean v0, v2, Ll/ۤ᩻ᩴ;->᩹:Z

    if-eqz v0, :cond_7

    iget-object v0, v2, Ll/ۤ᩻ᩴ;->ܰ:[I

    iget v2, v2, Ll/ۤ᩻ᩴ;->ۨ:I

    aget v0, v0, v2

    if-ne v0, p1, :cond_7

    goto :goto_0

    .line 1050
    :cond_3
    iget-object v3, v2, Ll/ۤ᩻ᩴ;->ۗ:[I

    .line 1053
    invoke-static {v0}, Ll/ܰۛۡ;->֫(I)I

    move-result v4

    iget v5, v2, Ll/ۤ᩻ᩴ;->۫:I

    and-int/2addr v4, v5

    aget v5, v3, v4

    if-nez v5, :cond_4

    goto :goto_1

    :cond_4
    if-ne v0, v5, :cond_5

    .line 1054
    iget-object v0, v2, Ll/ۤ᩻ᩴ;->ܰ:[I

    aget v0, v0, v4

    if-ne v0, p1, :cond_7

    goto :goto_0

    :cond_5
    add-int/2addr v4, v1

    .line 1057
    iget v5, v2, Ll/ۤ᩻ᩴ;->۫:I

    and-int/2addr v4, v5

    aget v5, v3, v4

    if-nez v5, :cond_6

    goto :goto_1

    :cond_6
    if-ne v0, v5, :cond_5

    .line 1058
    iget-object v0, v2, Ll/ۤ᩻ᩴ;->ܰ:[I

    aget v0, v0, v4

    if-ne v0, p1, :cond_7

    :goto_0
    return v1

    :cond_7
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final forEach(Ljava/util/function/Consumer;)V
    .locals 4

    .line 1114
    iget-object v0, p0, Ll/᩶᩻ᩴ;->᩸:Ll/ۤ᩻ᩴ;

    iget-boolean v1, v0, Ll/ۤ᩻ᩴ;->᩹:Z

    if-eqz v1, :cond_0

    new-instance v1, Ll/᩹᩻ᩴ;

    iget v2, v0, Ll/ۤ᩻ᩴ;->ۨ:I

    invoke-direct {v1, v0, v2}, Ll/᩹᩻ᩴ;-><init>(Ll/ۤ᩻ᩴ;I)V

    invoke-interface {p1, v1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 1115
    :cond_0
    iget-object v1, v0, Ll/ۤ᩻ᩴ;->ۗ:[I

    .line 1116
    iget v2, v0, Ll/ۤ᩻ᩴ;->ۨ:I

    :goto_0
    add-int/lit8 v3, v2, -0x1

    if-eqz v2, :cond_2

    aget v2, v1, v3

    if-eqz v2, :cond_1

    new-instance v2, Ll/᩹᩻ᩴ;

    invoke-direct {v2, v0, v3}, Ll/᩹᩻ᩴ;-><init>(Ll/ۤ᩻ᩴ;I)V

    invoke-interface {p1, v2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    :cond_1
    move v2, v3

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final iterator()Ll/۫֡ᩴ;
    .locals 2

    .line 1025
    new-instance v0, Ll/֡᩻ᩴ;

    iget-object v1, p0, Ll/᩶᩻ᩴ;->᩸:Ll/ۤ᩻ᩴ;

    invoke-direct {v0, v1}, Ll/֡᩻ᩴ;-><init>(Ll/ۤ᩻ᩴ;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 6

    .line 1065
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-nez v0, :cond_0

    goto/16 :goto_0

    .line 1066
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 1067
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto :goto_0

    .line 1068
    :cond_1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Integer;

    if-nez v0, :cond_2

    goto :goto_0

    .line 1069
    :cond_2
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 1070
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v1, 0x1

    .line 1071
    iget-object v2, p0, Ll/᩶᩻ᩴ;->᩸:Ll/ۤ᩻ᩴ;

    if-nez v0, :cond_3

    .line 1072
    iget-boolean v0, v2, Ll/ۤ᩻ᩴ;->᩹:Z

    if-eqz v0, :cond_7

    iget-object v0, v2, Ll/ۤ᩻ᩴ;->ܰ:[I

    iget v3, v2, Ll/ۤ᩻ᩴ;->ۨ:I

    aget v0, v0, v3

    if-ne v0, p1, :cond_7

    .line 1073
    invoke-static {v2}, Ll/ۤ᩻ᩴ;->֫(Ll/ۤ᩻ᩴ;)V

    return v1

    .line 1079
    :cond_3
    iget-object v3, v2, Ll/ۤ᩻ᩴ;->ۗ:[I

    .line 1082
    invoke-static {v0}, Ll/ܰۛۡ;->֫(I)I

    move-result v4

    iget v5, v2, Ll/ۤ᩻ᩴ;->۫:I

    and-int/2addr v4, v5

    aget v5, v3, v4

    if-nez v5, :cond_4

    goto :goto_0

    :cond_4
    if-ne v5, v0, :cond_5

    .line 1084
    iget-object v0, v2, Ll/ۤ᩻ᩴ;->ܰ:[I

    aget v0, v0, v4

    if-ne v0, p1, :cond_7

    .line 1085
    invoke-static {v2, v4}, Ll/ۤ᩻ᩴ;->֫(Ll/ۤ᩻ᩴ;I)V

    return v1

    :cond_5
    add-int/2addr v4, v1

    .line 1091
    iget v5, v2, Ll/ۤ᩻ᩴ;->۫:I

    and-int/2addr v4, v5

    aget v5, v3, v4

    if-nez v5, :cond_6

    goto :goto_0

    :cond_6
    if-ne v5, v0, :cond_5

    .line 1093
    iget-object v5, v2, Ll/ۤ᩻ᩴ;->ܰ:[I

    aget v5, v5, v4

    if-ne v5, p1, :cond_5

    .line 1094
    invoke-static {v2, v4}, Ll/ۤ᩻ᩴ;->֫(Ll/ۤ᩻ᩴ;I)V

    return v1

    :cond_7
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final size()I
    .locals 1

    .line 1103
    iget-object v0, p0, Ll/᩶᩻ᩴ;->᩸:Ll/ۤ᩻ᩴ;

    iget v0, v0, Ll/ۤ᩻ᩴ;->᩺:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/᩶᩻ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/۠ۚᩴ;
    .locals 2

    .line 1035
    new-instance v0, Ll/ۚ᩻ᩴ;

    iget-object v1, p0, Ll/᩶᩻ᩴ;->᩸:Ll/ۤ᩻ᩴ;

    invoke-direct {v0, v1}, Ll/ۚ᩻ᩴ;-><init>(Ll/ۤ᩻ᩴ;)V

    return-object v0
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 1022
    invoke-virtual {p0}, Ll/᩶᩻ᩴ;->spliterator()Ll/۠ۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/۫֡ᩴ;
    .locals 2

    .line 1030
    new-instance v0, Ll/֨᩻ᩴ;

    iget-object v1, p0, Ll/᩶᩻ᩴ;->᩸:Ll/ۤ᩻ᩴ;

    invoke-direct {v0, v1}, Ll/֨᩻ᩴ;-><init>(Ll/ۤ᩻ᩴ;)V

    return-object v0
.end method
