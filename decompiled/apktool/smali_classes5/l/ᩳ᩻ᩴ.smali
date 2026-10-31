.class public final Ll/ᩳ᩻ᩴ;
.super Ll/ܿᩴᩴ;
.source "K9H"

# interfaces
.implements Ll/ۙܳᩴ;
.implements Ll/ۡ۫ᩴ;


# instance fields
.field public final synthetic ᩸:Ll/᩷᩻ᩴ;


# direct methods
.method public constructor <init>(Ll/᩷᩻ᩴ;)V
    .locals 0

    .line 1028
    iput-object p1, p0, Ll/ᩳ᩻ᩴ;->᩸:Ll/᩷᩻ᩴ;

    .line 34
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 1114
    iget-object v0, p0, Ll/ᩳ᩻ᩴ;->᩸:Ll/᩷᩻ᩴ;

    invoke-virtual {v0}, Ll/᩷᩻ᩴ;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 6

    .line 1048
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 1049
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 1050
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto/16 :goto_1

    .line 1051
    :cond_1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Float;

    if-nez v0, :cond_2

    goto :goto_1

    .line 1052
    :cond_2
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 1053
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const/4 v1, 0x1

    .line 1054
    iget-object v2, p0, Ll/ᩳ᩻ᩴ;->᩸:Ll/᩷᩻ᩴ;

    if-nez v0, :cond_3

    iget-boolean v0, v2, Ll/᩷᩻ᩴ;->᩸:Z

    if-eqz v0, :cond_7

    iget-object v0, v2, Ll/᩷᩻ᩴ;->ۨ:[F

    iget v2, v2, Ll/᩷᩻ᩴ;->ۤ:I

    aget v0, v0, v2

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    if-ne v0, p1, :cond_7

    goto :goto_0

    .line 1056
    :cond_3
    iget-object v3, v2, Ll/᩷᩻ᩴ;->᩶:[I

    .line 1059
    invoke-static {v0}, Ll/ܰۛۡ;->֫(I)I

    move-result v4

    iget v5, v2, Ll/᩷᩻ᩴ;->ۗ:I

    and-int/2addr v4, v5

    aget v5, v3, v4

    if-nez v5, :cond_4

    goto :goto_1

    :cond_4
    if-ne v0, v5, :cond_5

    .line 1060
    iget-object v0, v2, Ll/᩷᩻ᩴ;->ۨ:[F

    aget v0, v0, v4

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    if-ne v0, p1, :cond_7

    goto :goto_0

    :cond_5
    add-int/2addr v4, v1

    .line 1063
    iget v5, v2, Ll/᩷᩻ᩴ;->ۗ:I

    and-int/2addr v4, v5

    aget v5, v3, v4

    if-nez v5, :cond_6

    goto :goto_1

    :cond_6
    if-ne v0, v5, :cond_5

    .line 1064
    iget-object v0, v2, Ll/᩷᩻ᩴ;->ۨ:[F

    aget v0, v0, v4

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

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

    .line 1120
    iget-object v0, p0, Ll/ᩳ᩻ᩴ;->᩸:Ll/᩷᩻ᩴ;

    iget-boolean v1, v0, Ll/᩷᩻ᩴ;->᩸:Z

    if-eqz v1, :cond_0

    new-instance v1, Ll/ܽ᩻ᩴ;

    iget v2, v0, Ll/᩷᩻ᩴ;->ۤ:I

    invoke-direct {v1, v0, v2}, Ll/ܽ᩻ᩴ;-><init>(Ll/᩷᩻ᩴ;I)V

    invoke-interface {p1, v1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 1121
    :cond_0
    iget-object v1, v0, Ll/᩷᩻ᩴ;->᩶:[I

    .line 1122
    iget v2, v0, Ll/᩷᩻ᩴ;->ۤ:I

    :goto_0
    add-int/lit8 v3, v2, -0x1

    if-eqz v2, :cond_2

    aget v2, v1, v3

    if-eqz v2, :cond_1

    new-instance v2, Ll/ܽ᩻ᩴ;

    invoke-direct {v2, v0, v3}, Ll/ܽ᩻ᩴ;-><init>(Ll/᩷᩻ᩴ;I)V

    invoke-interface {p1, v2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    :cond_1
    move v2, v3

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final iterator()Ll/۫֡ᩴ;
    .locals 2

    .line 1031
    new-instance v0, Ll/ۨܳᩴ;

    iget-object v1, p0, Ll/ᩳ᩻ᩴ;->᩸:Ll/᩷᩻ᩴ;

    invoke-direct {v0, v1}, Ll/ۨܳᩴ;-><init>(Ll/᩷᩻ᩴ;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 7

    .line 1071
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-nez v0, :cond_0

    goto/16 :goto_0

    .line 1072
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 1073
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto/16 :goto_0

    .line 1074
    :cond_1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/Float;

    if-nez v0, :cond_2

    goto/16 :goto_0

    .line 1075
    :cond_2
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 1076
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const/4 v1, 0x1

    .line 1077
    iget-object v2, p0, Ll/ᩳ᩻ᩴ;->᩸:Ll/᩷᩻ᩴ;

    if-nez v0, :cond_3

    .line 1078
    iget-boolean v0, v2, Ll/᩷᩻ᩴ;->᩸:Z

    if-eqz v0, :cond_7

    iget-object v0, v2, Ll/᩷᩻ᩴ;->ۨ:[F

    iget v3, v2, Ll/᩷᩻ᩴ;->ۤ:I

    aget v0, v0, v3

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    if-ne v0, p1, :cond_7

    .line 1079
    invoke-static {v2}, Ll/᩷᩻ᩴ;->֫(Ll/᩷᩻ᩴ;)V

    return v1

    .line 1085
    :cond_3
    iget-object v3, v2, Ll/᩷᩻ᩴ;->᩶:[I

    .line 1088
    invoke-static {v0}, Ll/ܰۛۡ;->֫(I)I

    move-result v4

    iget v5, v2, Ll/᩷᩻ᩴ;->ۗ:I

    and-int/2addr v4, v5

    aget v5, v3, v4

    if-nez v5, :cond_4

    goto :goto_0

    :cond_4
    if-ne v5, v0, :cond_5

    .line 1090
    iget-object v0, v2, Ll/᩷᩻ᩴ;->ۨ:[F

    aget v0, v0, v4

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    if-ne v0, p1, :cond_7

    .line 1091
    invoke-static {v2, v4}, Ll/᩷᩻ᩴ;->֫(Ll/᩷᩻ᩴ;I)V

    return v1

    :cond_5
    add-int/2addr v4, v1

    .line 1097
    iget v5, v2, Ll/᩷᩻ᩴ;->ۗ:I

    and-int/2addr v4, v5

    aget v5, v3, v4

    if-nez v5, :cond_6

    goto :goto_0

    :cond_6
    if-ne v5, v0, :cond_5

    .line 1099
    iget-object v5, v2, Ll/᩷᩻ᩴ;->ۨ:[F

    aget v5, v5, v4

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    if-ne v5, v6, :cond_5

    .line 1100
    invoke-static {v2, v4}, Ll/᩷᩻ᩴ;->֫(Ll/᩷᩻ᩴ;I)V

    return v1

    :cond_7
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final size()I
    .locals 1

    .line 1109
    iget-object v0, p0, Ll/ᩳ᩻ᩴ;->᩸:Ll/᩷᩻ᩴ;

    iget v0, v0, Ll/᩷᩻ᩴ;->ۛ:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ᩳ᩻ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/۠ۚᩴ;
    .locals 2

    .line 1041
    new-instance v0, Ll/᩺ܳᩴ;

    iget-object v1, p0, Ll/ᩳ᩻ᩴ;->᩸:Ll/᩷᩻ᩴ;

    invoke-direct {v0, v1}, Ll/᩺ܳᩴ;-><init>(Ll/᩷᩻ᩴ;)V

    return-object v0
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 1028
    invoke-virtual {p0}, Ll/ᩳ᩻ᩴ;->spliterator()Ll/۠ۚᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/۫֡ᩴ;
    .locals 2

    .line 1036
    new-instance v0, Ll/ܰܳᩴ;

    iget-object v1, p0, Ll/ᩳ᩻ᩴ;->᩸:Ll/᩷᩻ᩴ;

    invoke-direct {v0, v1}, Ll/ܰܳᩴ;-><init>(Ll/᩷᩻ᩴ;)V

    return-object v0
.end method
