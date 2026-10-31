.class public final Ll/֡ۖۖ;
.super Ll/֨ۖۖ;
.source "99PI"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ll/ᩴۘۖ;


# static fields
.field public static final ۧ֫:Ll/ۘۖۖ;

.field public static final ܽ֫:[Ll/۟֨ۖ;


# instance fields
.field public ֫֫:Ll/᩵ۖۖ;

.field public ۗ:Ljava/lang/Object;

.field public ۙ:Ll/ᩳۖۖ;

.field public final ۛ:Ljava/lang/String;

.field public ۟:Ll/᩷ۡۖ;

.field public final ۤ:Ll/ۚۖۖ;

.field public final ۨ:I

.field public final ۫:Ll/ᩳۖۖ;

.field public ۬:Ll/ۢۖۖ;

.field public ܰ:Ll/ᩳۖۖ;

.field public ᩶:Ll/ܶۖۖ;

.field public final ᩺:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1217
    new-instance v0, Ll/ۘۖۖ;

    .line 1218
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1217
    sput-object v0, Ll/֡ۖۖ;->ۧ֫:Ll/ۘۖۖ;

    .line 1342
    invoke-static {}, Ll/۟֨ۖ;->values()[Ll/۟֨ۖ;

    move-result-object v0

    sput-object v0, Ll/֡ۖۖ;->ܽ֫:[Ll/۟֨ۖ;

    .line 1671
    invoke-static {}, Ll/᩵ۖۖ;->ܿ()[Ll/᩵ۖۖ;

    move-result-object v0

    array-length v0, v0

    invoke-static {}, Ll/ۜۡۖ;->values()[Ll/ۜۡۖ;

    move-result-object v1

    array-length v1, v1

    if-ne v0, v1, :cond_0

    return-void

    .line 1672
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "descriptor.proto has a new declared type but Descriptors.java wasn\'t updated."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Ll/᩷ۡۖ;Ll/ۚۖۖ;Ll/ᩳۖۖ;IZ)V
    .locals 2

    const/4 v0, 0x0

    .line 1730
    invoke-direct {p0, v0}, Ll/֨ۖۖ;-><init>(I)V

    .line 1731
    iput-object p3, p0, Ll/֨ۖۖ;->᩹:Ll/֨ۖۖ;

    .line 1732
    iput p4, p0, Ll/֡ۖۖ;->ۨ:I

    .line 1733
    iput-object p1, p0, Ll/֡ۖۖ;->۟:Ll/᩷ۡۖ;

    .line 1734
    invoke-virtual {p1}, Ll/᩷ۡۖ;->getName()Ljava/lang/String;

    move-result-object p4

    invoke-static {p2, p3, p4}, Ll/᩹ۖۖ;->֫(Ll/ۚۖۖ;Ll/ᩳۖۖ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    iput-object p4, p0, Ll/֡ۖۖ;->ۛ:Ljava/lang/String;

    .line 1735
    iput-object p2, p0, Ll/֡ۖۖ;->ۤ:Ll/ۚۖۖ;

    .line 1737
    invoke-virtual {p1}, Ll/᩷ۡۖ;->hasType()Z

    move-result p4

    if-eqz p4, :cond_0

    .line 1738
    invoke-virtual {p1}, Ll/᩷ۡۖ;->getType()Ll/ۜۡۖ;

    move-result-object p4

    invoke-static {p4}, Ll/᩵ۖۖ;->֫(Ll/ۜۡۖ;)Ll/᩵ۖۖ;

    move-result-object p4

    iput-object p4, p0, Ll/֡ۖۖ;->֫֫:Ll/᩵ۖۖ;

    .line 1741
    :cond_0
    invoke-virtual {p1}, Ll/᩷ۡۖ;->ᩴ()Z

    move-result p4

    iput-boolean p4, p0, Ll/֡ۖۖ;->᩺:Z

    .line 1249
    invoke-virtual {p1}, Ll/᩷ۡۖ;->ܺ()I

    move-result p4

    if-lez p4, :cond_8

    const/4 p4, 0x0

    if-eqz p5, :cond_4

    .line 1748
    invoke-virtual {p1}, Ll/᩷ۡۖ;->ۚ()Z

    move-result p5

    if-eqz p5, :cond_3

    .line 1752
    iput-object p4, p0, Ll/֡ۖۖ;->ۙ:Ll/ᩳۖۖ;

    if-eqz p3, :cond_1

    .line 1754
    iput-object p3, p0, Ll/֡ۖۖ;->۫:Ll/ᩳۖۖ;

    goto :goto_0

    .line 1756
    :cond_1
    iput-object p4, p0, Ll/֡ۖۖ;->۫:Ll/ᩳۖۖ;

    .line 1757
    iput-object p2, p0, Ll/֨ۖۖ;->᩹:Ll/֨ۖۖ;

    .line 1760
    :goto_0
    invoke-virtual {p1}, Ll/᩷ۡۖ;->᩸()Z

    move-result p1

    if-nez p1, :cond_2

    .line 1764
    iput-object p4, p0, Ll/֡ۖۖ;->᩶:Ll/ܶۖۖ;

    goto :goto_2

    .line 1761
    :cond_2
    new-instance p1, Ll/ۜۖۖ;

    const-string p2, "FieldDescriptorProto.oneof_index set for extension field."

    invoke-direct {p1, p0, p2, v0}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw p1

    .line 1749
    :cond_3
    new-instance p1, Ll/ۜۖۖ;

    const-string p2, "FieldDescriptorProto.extendee not set for extension field."

    invoke-direct {p1, p0, p2, v0}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw p1

    .line 1766
    :cond_4
    invoke-virtual {p1}, Ll/᩷ۡۖ;->ۚ()Z

    move-result p5

    if-nez p5, :cond_7

    .line 1770
    iput-object p3, p0, Ll/֡ۖۖ;->ۙ:Ll/ᩳۖۖ;

    .line 1772
    invoke-virtual {p1}, Ll/᩷ۡۖ;->᩸()Z

    move-result p5

    if-eqz p5, :cond_6

    .line 1773
    invoke-virtual {p1}, Ll/᩷ۡۖ;->ۖ()I

    move-result p5

    if-ltz p5, :cond_5

    .line 1774
    invoke-virtual {p1}, Ll/᩷ۡۖ;->ۖ()I

    move-result p5

    invoke-virtual {p3}, Ll/ᩳۖۖ;->ۢ()Ll/᩶᩷ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩶᩷ۖ;->ۘ()I

    move-result v1

    if-ge p5, v1, :cond_5

    .line 1779
    invoke-virtual {p3}, Ll/ᩳۖۖ;->֨()Ljava/util/List;

    move-result-object p3

    invoke-virtual {p1}, Ll/᩷ۡۖ;->ۖ()I

    move-result p1

    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܶۖۖ;

    iput-object p1, p0, Ll/֡ۖۖ;->᩶:Ll/ܶۖۖ;

    .line 1780
    invoke-static {p1}, Ll/ܶۖۖ;->ܽ(Ll/ܶۖۖ;)I

    .line 1781
    iput-object p1, p0, Ll/֨ۖۖ;->᩹:Ll/֨ۖۖ;

    goto :goto_1

    .line 1775
    :cond_5
    new-instance p1, Ll/ۜۖۖ;

    .line 1777
    invoke-virtual {p3}, Ll/ᩳۖۖ;->getName()Ljava/lang/String;

    move-result-object p2

    const-string p3, "FieldDescriptorProto.oneof_index is out of range for type "

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p0, p2, v0}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw p1

    .line 1783
    :cond_6
    iput-object p4, p0, Ll/֡ۖۖ;->᩶:Ll/ܶۖۖ;

    .line 1785
    :goto_1
    iput-object p4, p0, Ll/֡ۖۖ;->۫:Ll/ᩳۖۖ;

    .line 1788
    :goto_2
    invoke-static {p2}, Ll/ۚۖۖ;->֫(Ll/ۚۖۖ;)Ll/᩻ۖۖ;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/᩻ۖۖ;->֫(Ll/֨ۖۖ;)V

    return-void

    .line 1767
    :cond_7
    new-instance p1, Ll/ۜۖۖ;

    const-string p2, "FieldDescriptorProto.extendee set for non-extension field."

    invoke-direct {p1, p0, p2, v0}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw p1

    .line 1744
    :cond_8
    new-instance p1, Ll/ۜۖۖ;

    const-string p2, "Field numbers must be positive integers."

    invoke-direct {p1, p0, p2, v0}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw p1
.end method

.method public static ֫(Ll/֡ۖۖ;)V
    .locals 1

    .line 1793
    iget-object v0, p0, Ll/֡ۖۖ;->۟:Ll/᩷ۡۖ;

    invoke-virtual {v0}, Ll/᩷ۡۖ;->ۘ()Ll/ۗۡۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗۡۖ;->ᩴ()Ll/ۛۢۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/֨ۖۖ;->֫(Ll/ۛۢۖ;)V

    return-void
.end method

.method public static ۧ(Ll/֡ۖۖ;)V
    .locals 10

    .line 1866
    iget-object v0, p0, Ll/֡ۖۖ;->ۤ:Ll/ۚۖۖ;

    const-string v1, "Couldn\'t parse default value: "

    const-string v2, "Unknown enum default value: \""

    iget-object v3, p0, Ll/֡ۖۖ;->۟:Ll/᩷ۡۖ;

    invoke-virtual {v3}, Ll/᩷ۡۖ;->ۚ()Z

    move-result v4

    const/4 v5, 0x0

    const-string v6, "\" is not a message type."

    const-string v7, "\""

    if-eqz v4, :cond_2

    .line 1868
    invoke-static {v0}, Ll/ۚۖۖ;->֫(Ll/ۚۖۖ;)Ll/᩻ۖۖ;

    move-result-object v4

    .line 1869
    invoke-virtual {v3}, Ll/᩷ۡۖ;->᩷()Ljava/lang/String;

    move-result-object v8

    sget-object v9, Ll/ܳۖۖ;->ۙ:Ll/ܳۖۖ;

    .line 1868
    invoke-virtual {v4, v8, p0, v9}, Ll/᩻ۖۖ;->֫(Ljava/lang/String;Ll/֨ۖۖ;Ll/ܳۖۖ;)Ll/֨ۖۖ;

    move-result-object v4

    .line 1870
    instance-of v8, v4, Ll/ᩳۖۖ;

    if-eqz v8, :cond_1

    .line 1874
    check-cast v4, Ll/ᩳۖۖ;

    iput-object v4, p0, Ll/֡ۖۖ;->ۙ:Ll/ᩳۖۖ;

    .line 1249
    invoke-virtual {v3}, Ll/᩷ۡۖ;->ܺ()I

    move-result v8

    .line 1876
    invoke-virtual {v4, v8}, Ll/ᩳۖۖ;->ۧ(I)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    .line 1877
    :cond_0
    new-instance v0, Ll/ۜۖۖ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1429
    iget-object v2, p0, Ll/֡ۖۖ;->ۙ:Ll/ᩳۖۖ;

    .line 1880
    invoke-virtual {v2}, Ll/ᩳۖۖ;->ܿ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\" does not declare "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1249
    invoke-virtual {v3}, Ll/᩷ۡۖ;->ܺ()I

    move-result v2

    .line 1882
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " as an extension number."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1, v5}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw v0

    .line 1871
    :cond_1
    new-instance v0, Ll/ۜۖۖ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1872
    invoke-virtual {v3}, Ll/᩷ۡۖ;->᩷()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1, v5}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw v0

    .line 1887
    :cond_2
    :goto_0
    invoke-virtual {v3}, Ll/᩷ۡۖ;->ۙ()Z

    move-result v4

    if-eqz v4, :cond_b

    .line 1889
    invoke-static {v0}, Ll/ۚۖۖ;->֫(Ll/ۚۖۖ;)Ll/᩻ۖۖ;

    move-result-object v0

    .line 1890
    invoke-virtual {v3}, Ll/᩷ۡۖ;->᩵()Ljava/lang/String;

    move-result-object v4

    sget-object v8, Ll/ܳۖۖ;->ۙ:Ll/ܳۖۖ;

    .line 1889
    invoke-virtual {v0, v4, p0, v8}, Ll/᩻ۖۖ;->֫(Ljava/lang/String;Ll/֨ۖۖ;Ll/ܳۖۖ;)Ll/֨ۖۖ;

    move-result-object v0

    .line 1892
    invoke-virtual {v3}, Ll/᩷ۡۖ;->hasType()Z

    move-result v4

    if-nez v4, :cond_5

    .line 1894
    instance-of v4, v0, Ll/ᩳۖۖ;

    if-eqz v4, :cond_3

    .line 1895
    sget-object v4, Ll/᩵ۖۖ;->۟:Ll/᩵ۖۖ;

    iput-object v4, p0, Ll/֡ۖۖ;->֫֫:Ll/᩵ۖۖ;

    goto :goto_1

    .line 1896
    :cond_3
    instance-of v4, v0, Ll/ۢۖۖ;

    if-eqz v4, :cond_4

    .line 1897
    sget-object v4, Ll/᩵ۖۖ;->۬:Ll/᩵ۖۖ;

    iput-object v4, p0, Ll/֡ۖۖ;->֫֫:Ll/᩵ۖۖ;

    goto :goto_1

    .line 1899
    :cond_4
    new-instance v0, Ll/ۜۖۖ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1900
    invoke-virtual {v3}, Ll/᩷ۡۖ;->᩵()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\" is not a type."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1, v5}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw v0

    .line 1906
    :cond_5
    :goto_1
    iget-object v4, p0, Ll/֡ۖۖ;->֫֫:Ll/᩵ۖۖ;

    invoke-virtual {v4}, Ll/᩵ۖۖ;->֫()Ll/ᩴۖۖ;

    move-result-object v4

    sget-object v8, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-ne v4, v8, :cond_8

    .line 1907
    instance-of v4, v0, Ll/ᩳۖۖ;

    if-eqz v4, :cond_7

    .line 1911
    check-cast v0, Ll/ᩳۖۖ;

    iput-object v0, p0, Ll/֡ۖۖ;->ܰ:Ll/ᩳۖۖ;

    .line 1913
    invoke-virtual {v3}, Ll/᩷ۡۖ;->֡()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_2

    .line 1914
    :cond_6
    new-instance v0, Ll/ۜۖۖ;

    const-string v1, "Messages can\'t have default values."

    invoke-direct {v0, p0, v1, v5}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw v0

    .line 1908
    :cond_7
    new-instance v0, Ll/ۜۖۖ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1909
    invoke-virtual {v3}, Ll/᩷ۡۖ;->᩵()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1, v5}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw v0

    .line 1916
    :cond_8
    iget-object v4, p0, Ll/֡ۖۖ;->֫֫:Ll/᩵ۖۖ;

    invoke-virtual {v4}, Ll/᩵ۖۖ;->֫()Ll/ᩴۖۖ;

    move-result-object v4

    sget-object v6, Ll/ᩴۖۖ;->۬:Ll/ᩴۖۖ;

    if-ne v4, v6, :cond_a

    .line 1917
    instance-of v4, v0, Ll/ۢۖۖ;

    if-eqz v4, :cond_9

    .line 1921
    check-cast v0, Ll/ۢۖۖ;

    iput-object v0, p0, Ll/֡ۖۖ;->۬:Ll/ۢۖۖ;

    goto :goto_2

    .line 1918
    :cond_9
    new-instance v0, Ll/ۜۖۖ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1919
    invoke-virtual {v3}, Ll/᩷ۡۖ;->᩵()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\" is not an enum type."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1, v5}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw v0

    .line 1923
    :cond_a
    new-instance v0, Ll/ۜۖۖ;

    const-string v1, "Field with primitive type has type_name."

    invoke-direct {v0, p0, v1, v5}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw v0

    .line 1926
    :cond_b
    iget-object v0, p0, Ll/֡ۖۖ;->֫֫:Ll/᩵ۖۖ;

    invoke-virtual {v0}, Ll/᩵ۖۖ;->֫()Ll/ᩴۖۖ;

    move-result-object v0

    sget-object v4, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-eq v0, v4, :cond_1a

    iget-object v0, p0, Ll/֡ۖۖ;->֫֫:Ll/᩵ۖۖ;

    invoke-virtual {v0}, Ll/᩵ۖۖ;->֫()Ll/ᩴۖۖ;

    move-result-object v0

    sget-object v4, Ll/ᩴۖۖ;->۬:Ll/ᩴۖۖ;

    if-eq v0, v4, :cond_1a

    .line 1933
    :goto_2
    invoke-virtual {v3}, Ll/᩷ۡۖ;->ۘ()Ll/ۗۡۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗۡۖ;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p0}, Ll/֡ۖۖ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_3

    .line 1934
    :cond_c
    new-instance v0, Ll/ۜۖۖ;

    const-string v1, "[packed = true] can only be specified for repeated primitive fields."

    invoke-direct {v0, p0, v1, v5}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw v0

    .line 1940
    :cond_d
    :goto_3
    invoke-virtual {v3}, Ll/᩷ۡۖ;->֡()Z

    move-result v0

    if-eqz v0, :cond_16

    .line 1941
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-nez v0, :cond_15

    const/16 v0, 0x22

    .line 1947
    :try_start_0
    sget-object v4, Ll/ܽۖۖ;->ۧ:[I

    iget-object v6, p0, Ll/֡ۖۖ;->֫֫:Ll/᩵ۖۖ;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v4, v4, v6
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    const-string v6, "nan"

    const-string v7, "-inf"

    const-string v8, "inf"

    packed-switch v4, :pswitch_data_0

    goto/16 :goto_4

    .line 2011
    :pswitch_0
    :try_start_1
    new-instance v1, Ll/ۜۖۖ;

    const-string v2, "Message type had default value."

    invoke-direct {v1, p0, v2, v5}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw v1

    .line 2003
    :pswitch_1
    iget-object v1, p0, Ll/֡ۖۖ;->۬:Ll/ۢۖۖ;

    invoke-virtual {v3}, Ll/᩷ۡۖ;->ۜ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ll/ۢۖۖ;->֫(Ljava/lang/String;)Ll/ۖۖۖ;

    move-result-object v1

    iput-object v1, p0, Ll/֡ۖۖ;->ۗ:Ljava/lang/Object;

    if-eqz v1, :cond_e

    goto/16 :goto_4

    .line 2005
    :cond_e
    new-instance v1, Ll/ۜۖۖ;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2006
    invoke-virtual {v3}, Ll/᩷ۡۖ;->ۜ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p0, v2, v5}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw v1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1996
    :pswitch_2
    :try_start_2
    invoke-virtual {v3}, Ll/᩷ۡۖ;->ۜ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ۨۚۖ;->ܿ(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object v2

    iput-object v2, p0, Ll/֡ۖۖ;->ۗ:Ljava/lang/Object;
    :try_end_2
    .catch Ll/ۗۚۖ; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    return-void

    :catch_0
    move-exception v2

    .line 1998
    :try_start_3
    new-instance v4, Ll/ۜۖۖ;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1999
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, p0, v1, v2}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v4

    .line 1992
    :pswitch_3
    invoke-virtual {v3}, Ll/᩷ۡۖ;->ۜ()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/֡ۖۖ;->ۗ:Ljava/lang/Object;

    return-void

    .line 1989
    :pswitch_4
    invoke-virtual {v3}, Ll/᩷ۡۖ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Ll/֡ۖۖ;->ۗ:Ljava/lang/Object;

    return-void

    .line 1978
    :pswitch_5
    invoke-virtual {v3}, Ll/᩷ۡۖ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    const-wide/high16 v1, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 1979
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, p0, Ll/֡ۖۖ;->ۗ:Ljava/lang/Object;

    return-void

    .line 1980
    :cond_f
    invoke-virtual {v3}, Ll/᩷ۡۖ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    const-wide/high16 v1, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    .line 1981
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, p0, Ll/֡ۖۖ;->ۗ:Ljava/lang/Object;

    return-void

    .line 1982
    :cond_10
    invoke-virtual {v3}, Ll/᩷ۡۖ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    const-wide/high16 v1, 0x7ff8000000000000L    # Double.NaN

    .line 1983
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, p0, Ll/֡ۖۖ;->ۗ:Ljava/lang/Object;

    return-void

    .line 1985
    :cond_11
    invoke-virtual {v3}, Ll/᩷ۡۖ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, p0, Ll/֡ۖۖ;->ۗ:Ljava/lang/Object;

    return-void

    .line 1967
    :pswitch_6
    invoke-virtual {v3}, Ll/᩷ۡۖ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 1968
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iput-object v1, p0, Ll/֡ۖۖ;->ۗ:Ljava/lang/Object;

    return-void

    .line 1969
    :cond_12
    invoke-virtual {v3}, Ll/᩷ۡۖ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    const/high16 v1, -0x800000    # Float.NEGATIVE_INFINITY

    .line 1970
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iput-object v1, p0, Ll/֡ۖۖ;->ۗ:Ljava/lang/Object;

    return-void

    .line 1971
    :cond_13
    invoke-virtual {v3}, Ll/᩷ۡۖ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 1972
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iput-object v1, p0, Ll/֡ۖۖ;->ۗ:Ljava/lang/Object;

    return-void

    .line 1974
    :cond_14
    invoke-virtual {v3}, Ll/᩷ۡۖ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    iput-object v1, p0, Ll/֡ۖۖ;->ۗ:Ljava/lang/Object;

    return-void

    .line 1964
    :pswitch_7
    invoke-virtual {v3}, Ll/᩷ۡۖ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۨۚۖ;->ᩳ(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, p0, Ll/֡ۖۖ;->ۗ:Ljava/lang/Object;

    return-void

    .line 1960
    :pswitch_8
    invoke-virtual {v3}, Ll/᩷ۡۖ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۨۚۖ;->ۧ(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, p0, Ll/֡ۖۖ;->ۗ:Ljava/lang/Object;

    return-void

    .line 1955
    :pswitch_9
    invoke-virtual {v3}, Ll/᩷ۡۖ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۨۚۖ;->ܽ(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, Ll/֡ۖۖ;->ۗ:Ljava/lang/Object;

    return-void

    .line 1951
    :pswitch_a
    invoke-virtual {v3}, Ll/᩷ۡۖ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۨۚۖ;->֫(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, Ll/֡ۖۖ;->ۗ:Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_1

    :goto_4
    return-void

    :catch_1
    move-exception v1

    .line 2014
    new-instance v2, Ll/ۜۖۖ;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Could not parse default value: \""

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2015
    invoke-virtual {v3}, Ll/᩷ۡۖ;->ۜ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, p0, v0, v1}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2

    .line 1942
    :cond_15
    new-instance v0, Ll/ۜۖۖ;

    const-string v1, "Repeated fields cannot have default values."

    invoke-direct {v0, p0, v1, v5}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw v0

    .line 2019
    :cond_16
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-eqz v0, :cond_17

    .line 2020
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/֡ۖۖ;->ۗ:Ljava/lang/Object;

    return-void

    .line 2022
    :cond_17
    sget-object v0, Ll/ܽۖۖ;->֫:[I

    iget-object v1, p0, Ll/֡ۖۖ;->֫֫:Ll/᩵ۖۖ;

    invoke-virtual {v1}, Ll/᩵ۖۖ;->֫()Ll/ᩴۖۖ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_19

    const/4 v1, 0x2

    if-eq v0, v1, :cond_18

    .line 2032
    iget-object v0, p0, Ll/֡ۖۖ;->֫֫:Ll/᩵ۖۖ;

    invoke-virtual {v0}, Ll/᩵ۖۖ;->֫()Ll/ᩴۖۖ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴۖۖ;->֫(Ll/ᩴۖۖ;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/֡ۖۖ;->ۗ:Ljava/lang/Object;

    return-void

    :cond_18
    const/4 v0, 0x0

    .line 2029
    iput-object v0, p0, Ll/֡ۖۖ;->ۗ:Ljava/lang/Object;

    return-void

    .line 2026
    :cond_19
    iget-object v0, p0, Ll/֡ۖۖ;->۬:Ll/ۢۖۖ;

    invoke-virtual {v0}, Ll/ۢۖۖ;->ܺ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/֡ۖۖ;->ۗ:Ljava/lang/Object;

    return-void

    .line 1927
    :cond_1a
    new-instance v0, Ll/ۜۖۖ;

    const-string v1, "Field with message or enum type missing type_name."

    invoke-direct {v0, p0, v1, v5}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic ܰ()Ll/ۘۖۖ;
    .locals 1

    .line 1215
    sget-object v0, Ll/֡ۖۖ;->ۧ֫:Ll/ۘۖۖ;

    return-object v0
.end method

.method public static synthetic ܽ(Ll/֡ۖۖ;)Z
    .locals 0

    .line 1215
    iget-boolean p0, p0, Ll/֡ۖۖ;->᩺:Z

    return p0
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 1215
    check-cast p1, Ll/֡ۖۖ;

    .line 1596
    iget-object v0, p1, Ll/֡ۖۖ;->ۙ:Ll/ᩳۖۖ;

    iget-object v1, p0, Ll/֡ۖۖ;->ۙ:Ll/ᩳۖۖ;

    if-ne v0, v1, :cond_0

    .line 1249
    iget-object v0, p0, Ll/֡ۖۖ;->۟:Ll/᩷ۡۖ;

    invoke-virtual {v0}, Ll/᩷ۡۖ;->ܺ()I

    move-result v0

    iget-object p1, p1, Ll/֡ۖۖ;->۟:Ll/᩷ۡۖ;

    invoke-virtual {p1}, Ll/᩷ۡۖ;->ܺ()I

    move-result p1

    sub-int/2addr v0, p1

    return v0

    .line 1597
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1243
    iget-object v0, p0, Ll/֡ۖۖ;->۟:Ll/᩷ۡۖ;

    invoke-virtual {v0}, Ll/᩷ۡۖ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getNumber()I
    .locals 1

    .line 1249
    iget-object v0, p0, Ll/֡ۖۖ;->۟:Ll/᩷ۡۖ;

    invoke-virtual {v0}, Ll/᩷ۡۖ;->ܺ()I

    move-result v0

    return v0
.end method

.method public final getType()Ll/᩵ۖۖ;
    .locals 2

    .line 1299
    iget-object v0, p0, Ll/֡ۖۖ;->֫֫:Ll/᩵ۖۖ;

    sget-object v1, Ll/᩵ۖۖ;->۟:Ll/᩵ۖۖ;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Ll/֡ۖۖ;->ܰ:Ll/ᩳۖۖ;

    if-eqz v0, :cond_0

    .line 1300
    invoke-virtual {v0}, Ll/ᩳۖۖ;->ۢ()Ll/᩶᩷ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶᩷ۖ;->ᩴ()Ll/ܽܺۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺۖ;->ۘ()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    iget-object v0, p0, Ll/֡ۖۖ;->ۙ:Ll/ᩳۖۖ;

    if-eqz v0, :cond_1

    .line 1301
    invoke-virtual {v0}, Ll/ᩳۖۖ;->ۢ()Ll/᩶᩷ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶᩷ۖ;->ᩴ()Ll/ܽܺۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺۖ;->ۘ()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    iget-object v0, p0, Ll/֨ۖۖ;->᩸:Ll/ۛۢۖ;

    if-eqz v0, :cond_2

    .line 1303
    invoke-virtual {p0}, Ll/֨ۖۖ;->֫()Ll/ۛۢۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۢۖ;->ۘ()Ll/ۙۢۖ;

    move-result-object v0

    sget-object v1, Ll/ۙۢۖ;->᩶:Ll/ۙۢۖ;

    if-ne v0, v1, :cond_2

    .line 1304
    sget-object v0, Ll/᩵ۖۖ;->ۨ:Ll/᩵ۖۖ;

    return-object v0

    .line 1306
    :cond_2
    iget-object v0, p0, Ll/֡ۖۖ;->֫֫:Ll/᩵ۖۖ;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1259
    iget-object v0, p0, Ll/֡ۖۖ;->ۛ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֡()Ljava/lang/Object;
    .locals 2

    .line 1393
    invoke-virtual {p0}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v0

    sget-object v1, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-eq v0, v1, :cond_0

    .line 1397
    iget-object v0, p0, Ll/֡ۖۖ;->ۗ:Ljava/lang/Object;

    return-object v0

    .line 1394
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "FieldDescriptor.getDefaultValue() called on an embedded message field."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֨()Ll/ᩳۖۖ;
    .locals 4

    .line 1421
    iget-object v0, p0, Ll/֡ۖۖ;->۟:Ll/᩷ۡۖ;

    invoke-virtual {v0}, Ll/᩷ۡۖ;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1530
    iget-object v0, p0, Ll/֡ۖۖ;->۫:Ll/ᩳۖۖ;

    return-object v0

    .line 1527
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This field is not an extension. ("

    const-string v2, ")"

    .line 0
    iget-object v3, p0, Ll/֡ۖۖ;->ۛ:Ljava/lang/String;

    invoke-static {v1, v3, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1528
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ll/ۢ֡ۖ;Ll/ۡ֡ۖ;)Ll/ۢ֡ۖ;
    .locals 0

    .line 2051
    check-cast p1, Ll/ܳ֡ۖ;

    check-cast p2, Ll/᩻֡ۖ;

    invoke-interface {p1, p2}, Ll/ܳ֡ۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ۗ()Z
    .locals 3

    .line 1481
    invoke-virtual {p0}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v0

    sget-object v1, Ll/᩵ۖۖ;->ۨ:Ll/᩵ۖۖ;

    if-eq v0, v1, :cond_0

    goto :goto_1

    .line 1486
    :cond_0
    invoke-virtual {p0}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳۖۖ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 1243
    iget-object v1, p0, Ll/֡ۖۖ;->۟:Ll/᩷ۡۖ;

    invoke-virtual {v1}, Ll/᩷ۡۖ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 1486
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 1491
    :cond_1
    invoke-virtual {p0}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳۖۖ;->ۧ()Ll/ۚۖۖ;

    move-result-object v0

    .line 1291
    iget-object v2, p0, Ll/֡ۖۖ;->ۤ:Ll/ۚۖۖ;

    if-eq v0, v2, :cond_2

    goto :goto_1

    .line 1421
    :cond_2
    invoke-virtual {v1}, Ll/᩷ۡۖ;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1500
    invoke-virtual {p0}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳۖۖ;->ܺ()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {p0}, Ll/֡ۖۖ;->֨()Ll/ᩳۖۖ;

    move-result-object v1

    if-ne v0, v1, :cond_4

    goto :goto_0

    .line 1501
    :cond_3
    invoke-virtual {p0}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳۖۖ;->ܺ()Ll/ᩳۖۖ;

    move-result-object v0

    .line 1429
    iget-object v1, p0, Ll/֡ۖۖ;->ۙ:Ll/ᩳۖۖ;

    if-ne v0, v1, :cond_4

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_4
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ۙ()Z
    .locals 1

    .line 1421
    iget-object v0, p0, Ll/֡ۖۖ;->۟:Ll/᩷ۡۖ;

    invoke-virtual {v0}, Ll/᩷ۡۖ;->ۚ()Z

    move-result v0

    return v0
.end method

.method public final ۚ()Ll/ۢۖۖ;
    .locals 4

    .line 1545
    invoke-virtual {p0}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v0

    sget-object v1, Ll/ᩴۖۖ;->۬:Ll/ᩴۖۖ;

    if-ne v0, v1, :cond_0

    .line 1549
    iget-object v0, p0, Ll/֡ۖۖ;->۬:Ll/ۢۖۖ;

    return-object v0

    .line 1546
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This field is not of enum type. ("

    const-string v2, ")"

    .line 0
    iget-object v3, p0, Ll/֡ۖۖ;->ۛ:Ljava/lang/String;

    invoke-static {v1, v3, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1547
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۛ()Z
    .locals 2

    .line 1346
    invoke-virtual {p0}, Ll/֨ۖۖ;->֫()Ll/ۛۢۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۢۖ;->ܺ()Ll/ܶۢۖ;

    move-result-object v0

    sget-object v1, Ll/ܶۢۖ;->ۛ:Ll/ܶۢۖ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۟֫()Z
    .locals 2

    .line 1360
    iget-object v0, p0, Ll/֡ۖۖ;->۟:Ll/᩷ۡۖ;

    invoke-virtual {v0}, Ll/᩷ۡۖ;->ۡ()Ll/ܳۡۖ;

    move-result-object v0

    sget-object v1, Ll/ܳۡۖ;->ۗ:Ll/ܳۡۖ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۠()I
    .locals 1

    .line 1231
    iget v0, p0, Ll/֡ۖۖ;->ۨ:I

    return v0
.end method

.method public final ۡ()V
    .locals 3

    .line 1853
    iget-object v0, p0, Ll/֡ۖۖ;->ۙ:Ll/ᩳۖۖ;

    if-eqz v0, :cond_1

    .line 1854
    invoke-virtual {v0}, Ll/ᩳۖۖ;->ۢ()Ll/᩶᩷ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶᩷ۖ;->ᩴ()Ll/ܽܺۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺۖ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1421
    iget-object v0, p0, Ll/֡ۖۖ;->۟:Ll/᩷ۡۖ;

    invoke-virtual {v0}, Ll/᩷ۡۖ;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1856
    invoke-virtual {p0}, Ll/֡ۖۖ;->۫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v0

    sget-object v1, Ll/᩵ۖۖ;->۟:Ll/᩵ۖۖ;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 1857
    :cond_0
    new-instance v0, Ll/ۜۖۖ;

    const-string v1, "Extensions of MessageSets must be optional messages."

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۢ()Ll/᩻֡ۖ;
    .locals 1

    .line 1237
    iget-object v0, p0, Ll/֡ۖۖ;->۟:Ll/᩷ۡۖ;

    return-object v0
.end method

.method public final ۤ()Z
    .locals 1

    .line 1379
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/֡ۖۖ;->ᩳۧ()Ll/۟֨ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟֨ۖ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()Ll/ۚۖۖ;
    .locals 1

    .line 1291
    iget-object v0, p0, Ll/֡ۖۖ;->ۤ:Ll/ۚۖۖ;

    return-object v0
.end method

.method public final ۨ()Z
    .locals 4

    .line 1291
    iget-object v0, p0, Ll/֡ۖۖ;->ۤ:Ll/ۚۖۖ;

    .line 1577
    invoke-virtual {v0}, Ll/ۚۖۖ;->ܺ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 1578
    invoke-virtual {p0}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v0

    sget-object v3, Ll/᩵ۖۖ;->۬:Ll/᩵ۖۖ;

    if-ne v0, v3, :cond_4

    iget-object v0, p0, Ll/֡ۖۖ;->۬:Ll/ۢۖۖ;

    .line 2122
    invoke-virtual {v0}, Ll/֨ۖۖ;->֫()Ll/ۛۢۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۢۖ;->ۡ()Ll/֨ۢۖ;

    move-result-object v0

    sget-object v3, Ll/֨ۢۖ;->᩶:Ll/֨ۢۖ;

    if-ne v0, v3, :cond_0

    return v2

    :cond_0
    return v1

    .line 1581
    :cond_1
    invoke-virtual {p0}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v0

    sget-object v3, Ll/᩵ۖۖ;->۬:Ll/᩵ۖۖ;

    if-ne v0, v3, :cond_4

    .line 1582
    invoke-virtual {p0}, Ll/֨ۖۖ;->֫()Ll/ۛۢۖ;

    move-result-object v0

    sget-object v3, Ll/᩻᩵ۖ;->ܽ:Ll/ܺᩴۖ;

    invoke-virtual {v0, v3}, Ll/۫ۘۖ;->ܽ(Ll/ۨۖۖ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ᩵ۖ;

    invoke-virtual {v0}, Ll/ܳ᩵ۖ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/֡ۖۖ;->۬:Ll/ۢۖۖ;

    .line 2122
    invoke-virtual {v0}, Ll/֨ۖۖ;->֫()Ll/ۛۢۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۢۖ;->ۡ()Ll/֨ۢۖ;

    move-result-object v0

    sget-object v3, Ll/֨ۢۖ;->᩶:Ll/֨ۢۖ;

    if-ne v0, v3, :cond_2

    return v2

    :cond_2
    return v1

    :cond_3
    return v2

    :cond_4
    return v1
.end method

.method public final ۫()Z
    .locals 2

    .line 1352
    iget-object v0, p0, Ll/֡ۖۖ;->۟:Ll/᩷ۡۖ;

    invoke-virtual {v0}, Ll/᩷ۡۖ;->ۡ()Ll/ܳۡۖ;

    move-result-object v0

    sget-object v1, Ll/ܳۡۖ;->᩶:Ll/ܳۡۖ;

    if-ne v0, v1, :cond_0

    .line 1353
    invoke-virtual {p0}, Ll/֨ۖۖ;->֫()Ll/ۛۢۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۢۖ;->ܺ()Ll/ܶۢۖ;

    move-result-object v0

    sget-object v1, Ll/ܶۢۖ;->ۛ:Ll/ܶۢۖ;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۬()Z
    .locals 2

    .line 1334
    invoke-virtual {p0}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v0

    sget-object v1, Ll/᩵ۖۖ;->۟:Ll/᩵ۖۖ;

    if-ne v0, v1, :cond_0

    .line 1335
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1336
    invoke-virtual {p0}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳۖۖ;->ۢ()Ll/᩶᩷ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶᩷ۖ;->ᩴ()Ll/ܽܺۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺۖ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܶ()Ll/ᩴۖۖ;
    .locals 1

    .line 1279
    invoke-virtual {p0}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩵ۖۖ;->֫()Ll/ᩴۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final ܺ()Ll/ܶۖۖ;
    .locals 1

    .line 1434
    iget-object v0, p0, Ll/֡ۖۖ;->᩶:Ll/ܶۖۖ;

    return-object v0
.end method

.method public final ܽܽ()Ll/֫۠ۖ;
    .locals 1

    .line 1285
    invoke-virtual {p0}, Ll/֡ۖۖ;->ᩳۧ()Ll/۟֨ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟֨ۖ;->֫()Ll/֫۠ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 1259
    iget-object v0, p0, Ll/֡ۖۖ;->ۛ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳۧ()Ll/۟֨ۖ;
    .locals 2

    .line 1312
    invoke-virtual {p0}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, Ll/֡ۖۖ;->ܽ֫:[Ll/۟֨ۖ;

    aget-object v0, v1, v0

    return-object v0
.end method

.method public final ᩳܽ()Z
    .locals 2

    .line 1369
    invoke-virtual {p0}, Ll/֡ۖۖ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 1372
    :cond_0
    invoke-virtual {p0}, Ll/֨ۖۖ;->֫()Ll/ۛۢۖ;

    move-result-object v0

    .line 1373
    invoke-virtual {v0}, Ll/ۛۢۖ;->ᩴ()Ll/۬ۢۖ;

    move-result-object v0

    sget-object v1, Ll/۬ۢۖ;->ۗ:Ll/۬ۢۖ;

    .line 1374
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ᩴ()Ll/ᩳۖۖ;
    .locals 1

    .line 1429
    iget-object v0, p0, Ll/֡ۖۖ;->ۙ:Ll/ᩳۖۖ;

    return-object v0
.end method

.method public final ᩶()Z
    .locals 3

    .line 1464
    invoke-virtual {p0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 1467
    :cond_0
    iget-boolean v0, p0, Ll/֡ۖۖ;->᩺:Z

    if-nez v0, :cond_2

    .line 1468
    invoke-virtual {p0}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v0

    sget-object v2, Ll/᩵ۖۖ;->۟:Ll/᩵ۖۖ;

    if-eq v0, v2, :cond_2

    .line 1469
    invoke-virtual {p0}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v0

    sget-object v2, Ll/᩵ۖۖ;->ۨ:Ll/᩵ۖۖ;

    if-eq v0, v2, :cond_2

    .line 1421
    iget-object v0, p0, Ll/֡ۖۖ;->۟:Ll/᩷ۡۖ;

    invoke-virtual {v0}, Ll/᩷ۡۖ;->ۚ()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1434
    iget-object v0, p0, Ll/֡ۖۖ;->᩶:Ll/ܶۖۖ;

    if-nez v0, :cond_2

    .line 1472
    invoke-virtual {p0}, Ll/֨ۖۖ;->֫()Ll/ۛۢۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۢۖ;->ܺ()Ll/ܶۢۖ;

    move-result-object v0

    sget-object v2, Ll/ܶۢۖ;->۫:Ll/ܶۢۖ;

    if-eq v0, v2, :cond_1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩷()Ll/ۛۢۖ;
    .locals 5

    .line 1798
    invoke-static {}, Ll/ۛۢۖ;->newBuilder()Ll/֡ۢۖ;

    move-result-object v0

    .line 1799
    iget-object v1, p0, Ll/֡ۖۖ;->ۤ:Ll/ۚۖۖ;

    invoke-virtual {v1}, Ll/ۚۖۖ;->ᩴ()Ll/ۗ᩷ۖ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۗ᩷ۖ;->getNumber()I

    move-result v2

    sget-object v3, Ll/ۗ᩷ۖ;->ۗ:Ll/ۗ᩷ۖ;

    invoke-virtual {v3}, Ll/ۗ᩷ۖ;->getNumber()I

    move-result v3

    if-lt v2, v3, :cond_0

    .line 1800
    invoke-virtual {v0}, Ll/֡ۢۖ;->build()Ll/ۛۢۖ;

    move-result-object v0

    return-object v0

    .line 1803
    :cond_0
    iget-object v2, p0, Ll/֡ۖۖ;->۟:Ll/᩷ۡۖ;

    invoke-virtual {v2}, Ll/᩷ۡۖ;->ۡ()Ll/ܳۡۖ;

    move-result-object v3

    sget-object v4, Ll/ܳۡۖ;->۫:Ll/ܳۡۖ;

    if-ne v3, v4, :cond_1

    .line 1804
    sget-object v3, Ll/ܶۢۖ;->ۛ:Ll/ܶۢۖ;

    invoke-virtual {v0, v3}, Ll/֡ۢۖ;->֫(Ll/ܶۢۖ;)V

    .line 1807
    :cond_1
    invoke-virtual {v2}, Ll/᩷ۡۖ;->getType()Ll/ۜۡۖ;

    move-result-object v3

    sget-object v4, Ll/ۜۡۖ;->ᩳ֫:Ll/ۜۡۖ;

    if-ne v3, v4, :cond_2

    .line 1808
    sget-object v3, Ll/ۙۢۖ;->᩶:Ll/ۙۢۖ;

    invoke-virtual {v0, v3}, Ll/֡ۢۖ;->֫(Ll/ۙۢۖ;)V

    .line 1811
    :cond_2
    invoke-virtual {v1}, Ll/ۚۖۖ;->ᩴ()Ll/ۗ᩷ۖ;

    move-result-object v3

    sget-object v4, Ll/ۗ᩷ۖ;->ۜ֫:Ll/ۗ᩷ۖ;

    if-ne v3, v4, :cond_3

    invoke-virtual {v2}, Ll/᩷ۡۖ;->ۘ()Ll/ۗۡۖ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۗۡۖ;->ۚ()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1812
    sget-object v3, Ll/۬ۢۖ;->ۗ:Ll/۬ۢۖ;

    invoke-virtual {v0, v3}, Ll/֡ۢۖ;->֫(Ll/۬ۢۖ;)V

    .line 1815
    :cond_3
    invoke-virtual {v1}, Ll/ۚۖۖ;->ᩴ()Ll/ۗ᩷ۖ;

    move-result-object v1

    sget-object v3, Ll/ۗ᩷ۖ;->ۢ֫:Ll/ۗ᩷ۖ;

    if-ne v1, v3, :cond_4

    .line 1816
    invoke-virtual {v2}, Ll/᩷ۡۖ;->ۘ()Ll/ۗۡۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗۡۖ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v2}, Ll/᩷ۡۖ;->ۘ()Ll/ۗۡۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗۡۖ;->ۚ()Z

    move-result v1

    if-nez v1, :cond_4

    .line 1817
    sget-object v1, Ll/۬ۢۖ;->᩶:Ll/۬ۢۖ;

    invoke-virtual {v0, v1}, Ll/֡ۢۖ;->֫(Ll/۬ۢۖ;)V

    .line 1821
    :cond_4
    invoke-virtual {v0}, Ll/֡ۢۖ;->build()Ll/ۛۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩸()Ll/ᩳۖۖ;
    .locals 4

    .line 1535
    invoke-virtual {p0}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v0

    sget-object v1, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-ne v0, v1, :cond_0

    .line 1539
    iget-object v0, p0, Ll/֡ۖۖ;->ܰ:Ll/ᩳۖۖ;

    return-object v0

    .line 1536
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This field is not of message type. ("

    const-string v2, ")"

    .line 0
    iget-object v3, p0, Ll/֡ۖۖ;->ۛ:Ljava/lang/String;

    invoke-static {v1, v3, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1537
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩹()Ll/ܶۖۖ;
    .locals 2

    .line 1439
    iget-object v0, p0, Ll/֡ۖۖ;->᩶:Ll/ܶۖۖ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܶۖۖ;->ۚ()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩺()Z
    .locals 2

    .line 1317
    invoke-virtual {p0}, Ll/֡ۖۖ;->getType()Ll/᩵ۖۖ;

    move-result-object v0

    sget-object v1, Ll/᩵ۖۖ;->ܿ֫:Ll/᩵ۖۖ;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 1429
    :cond_0
    iget-object v0, p0, Ll/֡ۖۖ;->ۙ:Ll/ᩳۖۖ;

    .line 1320
    invoke-virtual {v0}, Ll/ᩳۖۖ;->ۢ()Ll/᩶᩷ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶᩷ۖ;->ᩴ()Ll/ܽܺۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺۖ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 1324
    :cond_1
    invoke-virtual {p0}, Ll/֨ۖۖ;->֫()Ll/ۛۢۖ;

    move-result-object v0

    sget-object v1, Ll/᩻᩵ۖ;->ܽ:Ll/ܺᩴۖ;

    .line 1325
    invoke-virtual {v0, v1}, Ll/۫ۘۖ;->ܽ(Ll/ۨۖۖ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ᩵ۖ;

    .line 1326
    invoke-virtual {v0}, Ll/ܳ᩵ۖ;->᩷()Ll/ܿ᩵ۖ;

    move-result-object v0

    sget-object v1, Ll/ܿ᩵ۖ;->ۤ:Ll/ܿ᩵ۖ;

    .line 1327
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    const/4 v0, 0x1

    return v0

    .line 1330
    :cond_2
    invoke-virtual {p0}, Ll/֨ۖۖ;->֫()Ll/ۛۢۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۢۖ;->᩵()Ll/ۤۢۖ;

    move-result-object v0

    sget-object v1, Ll/ۤۢۖ;->ۤ:Ll/ۤۢۖ;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ᩻()Z
    .locals 6

    .line 1826
    iget-object v0, p0, Ll/֡ۖۖ;->ۤ:Ll/ۚۖۖ;

    invoke-virtual {v0}, Ll/ۚۖۖ;->ᩴ()Ll/ۗ᩷ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗ᩷ۖ;->getNumber()I

    move-result v1

    sget-object v2, Ll/ۗ᩷ۖ;->ۗ:Ll/ۗ᩷ۖ;

    invoke-virtual {v2}, Ll/ۗ᩷ۖ;->getNumber()I

    move-result v2

    const/4 v3, 0x0

    if-lt v1, v2, :cond_0

    return v3

    .line 1830
    :cond_0
    iget-object v1, p0, Ll/֡ۖۖ;->۟:Ll/᩷ۡۖ;

    invoke-virtual {v1}, Ll/᩷ۡۖ;->ۡ()Ll/ܳۡۖ;

    move-result-object v2

    sget-object v4, Ll/ܳۡۖ;->۫:Ll/ܳۡۖ;

    const/4 v5, 0x1

    if-ne v2, v4, :cond_1

    return v5

    .line 1834
    :cond_1
    invoke-virtual {v1}, Ll/᩷ۡۖ;->getType()Ll/ۜۡۖ;

    move-result-object v2

    sget-object v4, Ll/ۜۡۖ;->ᩳ֫:Ll/ۜۡۖ;

    if-ne v2, v4, :cond_2

    return v5

    .line 1838
    :cond_2
    invoke-virtual {v1}, Ll/᩷ۡۖ;->ۘ()Ll/ۗۡۖ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۗۡۖ;->ۚ()Z

    move-result v2

    if-eqz v2, :cond_3

    return v5

    .line 1842
    :cond_3
    invoke-virtual {v0}, Ll/ۚۖۖ;->ᩴ()Ll/ۗ᩷ۖ;

    move-result-object v0

    sget-object v2, Ll/ۗ᩷ۖ;->ۢ֫:Ll/ۗ᩷ۖ;

    if-ne v0, v2, :cond_4

    .line 1843
    invoke-virtual {v1}, Ll/᩷ۡۖ;->ۘ()Ll/ۗۡۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗۡۖ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v1}, Ll/᩷ۡۖ;->ۘ()Ll/ۗۡۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗۡۖ;->ۚ()Z

    move-result v0

    if-nez v0, :cond_4

    return v5

    :cond_4
    return v3
.end method
