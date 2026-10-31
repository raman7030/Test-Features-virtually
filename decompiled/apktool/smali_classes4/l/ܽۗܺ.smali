.class public final Ll/ܽۗܺ;
.super Ljava/util/AbstractMap;
.source "O2OZ"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final ۨ:Ljava/lang/Object;


# instance fields
.field public transient ۗ:I

.field public transient ۙ:[Ljava/lang/Object;

.field public transient ۛ:Ljava/util/Collection;

.field public transient ۤ:[Ljava/lang/Object;

.field public transient ۫:Ljava/lang/Object;

.field public transient ۬:I

.field public transient ᩶:Ljava/util/Set;

.field public transient ᩸:[I

.field public transient ᩹:Ljava/util/Set;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 112
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܽۗܺ;->ۨ:Ljava/lang/Object;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 4

    .line 1009
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 1010
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    if-ltz v0, :cond_1

    .line 1014
    invoke-virtual {p0, v0}, Ll/ܽۗܺ;->ܽ(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 1016
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v2

    .line 1017
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v3

    .line 1018
    invoke-virtual {p0, v2, v3}, Ll/ܽۗܺ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 1012
    :cond_1
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v1, "Invalid size: "

    .line 0
    invoke-static {v0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1012
    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 3

    .line 996
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 997
    invoke-virtual {p0}, Ll/ܽۗܺ;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 800
    invoke-virtual {p0}, Ll/ܽۗܺ;->֫()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 802
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0

    .line 804
    :cond_0
    new-instance v0, Ll/ۛۙܺ;

    invoke-direct {v0, p0}, Ll/ۛۙܺ;-><init>(Ll/ܽۗܺ;)V

    .line 999
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1000
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 1001
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 1002
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ֫(IIII)I
    .locals 8

    .line 430
    invoke-static {p2}, Ll/ᩳۗܺ;->֫(I)Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 p2, p2, -0x1

    if-eqz p4, :cond_0

    and-int/2addr p3, p2

    add-int/lit8 p4, p4, 0x1

    .line 435
    invoke-static {p3, p4, v0}, Ll/ᩳۗܺ;->֫(IILjava/lang/Object;)V

    .line 1035
    :cond_0
    iget-object p3, p0, Ll/ܽۗܺ;->۫:Ljava/lang/Object;

    invoke-static {p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    invoke-direct {p0}, Ll/ܽۗܺ;->ۢ()[I

    move-result-object p4

    const/4 v1, 0x0

    :goto_0
    if-gt v1, p1, :cond_2

    .line 447
    invoke-static {v1, p3}, Ll/ᩳۗܺ;->֫(ILjava/lang/Object;)I

    move-result v2

    :goto_1
    if-eqz v2, :cond_1

    add-int/lit8 v3, v2, -0x1

    .line 456
    aget v4, p4, v3

    not-int v5, p1

    and-int/2addr v5, v4

    or-int/2addr v5, v1

    and-int v6, v5, p2

    .line 462
    invoke-static {v6, v0}, Ll/ᩳۗܺ;->֫(ILjava/lang/Object;)I

    move-result v7

    .line 463
    invoke-static {v6, v2, v0}, Ll/ᩳۗܺ;->֫(IILjava/lang/Object;)V

    .line 464
    invoke-static {v5, v7, p2}, Ll/ᩳۗܺ;->֫(III)I

    move-result v2

    aput v2, p4, v3

    and-int v2, v4, p1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 470
    :cond_2
    iput-object v0, p0, Ll/ܽۗܺ;->۫:Ljava/lang/Object;

    .line 308
    invoke-static {p2}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p1

    rsub-int/lit8 p1, p1, 0x20

    .line 309
    iget p3, p0, Ll/ܽۗܺ;->ۗ:I

    const/16 p4, 0x1f

    .line 310
    invoke-static {p3, p1, p4}, Ll/ᩳۗܺ;->֫(III)I

    move-result p1

    iput p1, p0, Ll/ܽۗܺ;->ۗ:I

    return p2
.end method

.method private ֫(Ljava/lang/Object;)I
    .locals 7

    .line 476
    invoke-virtual {p0}, Ll/ܽۗܺ;->ܽ()Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    return v1

    .line 479
    :cond_0
    invoke-static {p1}, Ll/ۗۗܺ;->֫(Ljava/lang/Object;)I

    move-result v0

    .line 480
    invoke-direct {p0}, Ll/ܽۗܺ;->᩷()I

    move-result v2

    .line 1035
    iget-object v3, p0, Ll/ܽۗܺ;->۫:Ljava/lang/Object;

    invoke-static {v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    and-int v4, v0, v2

    .line 481
    invoke-static {v4, v3}, Ll/ᩳۗܺ;->֫(ILjava/lang/Object;)I

    move-result v3

    if-nez v3, :cond_1

    return v1

    :cond_1
    not-int v4, v2

    and-int/2addr v0, v4

    :cond_2
    add-int/lit8 v3, v3, -0x1

    .line 1069
    invoke-direct {p0}, Ll/ܽۗܺ;->ۢ()[I

    move-result-object v5

    aget v5, v5, v3

    and-int v6, v5, v4

    if-ne v6, v0, :cond_3

    .line 1060
    invoke-direct {p0}, Ll/ܽۗܺ;->ܺ()[Ljava/lang/Object;

    move-result-object v6

    aget-object v6, v6, v3

    .line 490
    invoke-static {p1, v6}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    return v3

    :cond_3
    and-int v3, v5, v2

    if-nez v3, :cond_2

    return v1
.end method

.method public static synthetic ֫(Ll/ܽۗܺ;)I
    .locals 0

    .line 82
    iget p0, p0, Ll/ܽۗܺ;->ۗ:I

    return p0
.end method

.method public static ֫(Ll/ܽۗܺ;I)Ljava/lang/Object;
    .locals 0

    .line 1060
    invoke-direct {p0}, Ll/ܽۗܺ;->ܺ()[Ljava/lang/Object;

    move-result-object p0

    aget-object p0, p0, p1

    return-object p0
.end method

.method public static synthetic ֫(Ll/ܽۗܺ;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 82
    invoke-direct {p0, p1}, Ll/ܽۗܺ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܽۗܺ;ILjava/lang/Object;)V
    .locals 0

    .line 1077
    invoke-direct {p0}, Ll/ܽۗܺ;->ۖ()[Ljava/lang/Object;

    move-result-object p0

    aput-object p2, p0, p1

    return-void
.end method

.method private ۖ()[Ljava/lang/Object;
    .locals 1

    .line 1047
    iget-object v0, p0, Ll/ܽۗܺ;->ۤ:[Ljava/lang/Object;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    return-object v0
.end method

.method private ۢ()[I
    .locals 1

    .line 1039
    iget-object v0, p0, Ll/ܽۗܺ;->᩸:[I

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, [I

    return-object v0
.end method

.method public static synthetic ۧ(Ll/ܽۗܺ;Ljava/lang/Object;)I
    .locals 0

    .line 82
    invoke-direct {p0, p1}, Ll/ܽۗܺ;->֫(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method private ۧ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 531
    invoke-virtual {p0}, Ll/ܽۗܺ;->ܽ()Z

    move-result v0

    sget-object v1, Ll/ܽۗܺ;->ۨ:Ljava/lang/Object;

    if-eqz v0, :cond_0

    return-object v1

    .line 534
    :cond_0
    invoke-direct {p0}, Ll/ܽۗܺ;->᩷()I

    move-result v0

    .line 1035
    iget-object v5, p0, Ll/ܽۗܺ;->۫:Ljava/lang/Object;

    invoke-static {v5}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    invoke-direct {p0}, Ll/ܽۗܺ;->ۢ()[I

    move-result-object v6

    .line 542
    invoke-direct {p0}, Ll/ܽۗܺ;->ܺ()[Ljava/lang/Object;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v3, 0x0

    move-object v2, p1

    move v4, v0

    .line 536
    invoke-static/range {v2 .. v8}, Ll/ᩳۗܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;[I[Ljava/lang/Object;[Ljava/lang/Object;)I

    move-result p1

    const/4 v2, -0x1

    if-ne p1, v2, :cond_1

    return-object v1

    .line 1065
    :cond_1
    invoke-direct {p0}, Ll/ܽۗܺ;->ۖ()[Ljava/lang/Object;

    move-result-object v1

    aget-object v1, v1, p1

    .line 550
    invoke-virtual {p0, p1, v0}, Ll/ܽۗܺ;->֫(II)V

    .line 551
    iget p1, p0, Ll/ܽۗܺ;->۬:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ܽۗܺ;->۬:I

    .line 552
    invoke-virtual {p0}, Ll/ܽۗܺ;->ۧ()V

    return-object v1
.end method

.method public static ۧ(Ll/ܽۗܺ;)Ljava/lang/Object;
    .locals 0

    .line 1035
    iget-object p0, p0, Ll/ܽۗܺ;->۫:Ljava/lang/Object;

    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public static ۧ(Ll/ܽۗܺ;I)Ljava/lang/Object;
    .locals 0

    .line 1065
    invoke-direct {p0}, Ll/ܽۗܺ;->ۖ()[Ljava/lang/Object;

    move-result-object p0

    aget-object p0, p0, p1

    return-object p0
.end method

.method public static synthetic ܳ(Ll/ܽۗܺ;)V
    .locals 1

    .line 82
    iget v0, p0, Ll/ܽۗܺ;->۬:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ܽۗܺ;->۬:I

    return-void
.end method

.method private ܺ()[Ljava/lang/Object;
    .locals 1

    .line 1043
    iget-object v0, p0, Ll/ܽۗܺ;->ۙ:[Ljava/lang/Object;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic ܽ(Ll/ܽۗܺ;)[I
    .locals 0

    .line 82
    invoke-direct {p0}, Ll/ܽۗܺ;->ۢ()[I

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ܿ()Ljava/lang/Object;
    .locals 1

    .line 82
    sget-object v0, Ll/ܽۗܺ;->ۨ:Ljava/lang/Object;

    return-object v0
.end method

.method public static ܿ(I)Ll/ܽۗܺ;
    .locals 1

    .line 109
    new-instance v0, Ll/ܽۗܺ;

    .line 245
    invoke-direct {v0}, Ljava/util/AbstractMap;-><init>()V

    .line 246
    invoke-virtual {v0, p0}, Ll/ܽۗܺ;->ܽ(I)V

    return-object v0
.end method

.method public static synthetic ܿ(Ll/ܽۗܺ;)[Ljava/lang/Object;
    .locals 0

    .line 82
    invoke-direct {p0}, Ll/ܽۗܺ;->ۖ()[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ᩳ(Ll/ܽۗܺ;)[Ljava/lang/Object;
    .locals 0

    .line 82
    invoke-direct {p0}, Ll/ܽۗܺ;->ܺ()[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private ᩷()I
    .locals 2

    .line 315
    iget v0, p0, Ll/ܽۗܺ;->ۗ:I

    and-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x1

    shl-int v0, v1, v0

    sub-int/2addr v0, v1

    return v0
.end method

.method public static synthetic ᩻(Ll/ܽۗܺ;)I
    .locals 0

    .line 82
    invoke-direct {p0}, Ll/ܽۗܺ;->᩷()I

    move-result p0

    return p0
.end method

.method public static ᩻()Ll/ܽۗܺ;
    .locals 2

    .line 95
    new-instance v0, Ll/ܽۗܺ;

    .line 236
    invoke-direct {v0}, Ljava/util/AbstractMap;-><init>()V

    const/4 v1, 0x3

    .line 237
    invoke-virtual {v0, v1}, Ll/ܽۗܺ;->ܽ(I)V

    return-object v0
.end method


# virtual methods
.method public final clear()V
    .locals 6

    .line 974
    invoke-virtual {p0}, Ll/ܽۗܺ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 977
    :cond_0
    invoke-virtual {p0}, Ll/ܽۗܺ;->ۧ()V

    .line 978
    invoke-virtual {p0}, Ll/ܽۗܺ;->֫()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 981
    invoke-virtual {p0}, Ll/ܽۗܺ;->size()I

    move-result v3

    const v4, 0x3fffffff    # 1.9999999f

    const/4 v5, 0x3

    .line 287
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 981
    iput v3, p0, Ll/ܽۗܺ;->ۗ:I

    .line 982
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 983
    iput-object v1, p0, Ll/ܽۗܺ;->۫:Ljava/lang/Object;

    .line 984
    iput v2, p0, Ll/ܽۗܺ;->۬:I

    return-void

    .line 986
    :cond_1
    invoke-direct {p0}, Ll/ܽۗܺ;->ܺ()[Ljava/lang/Object;

    move-result-object v0

    iget v3, p0, Ll/ܽۗܺ;->۬:I

    invoke-static {v0, v2, v3, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 987
    invoke-direct {p0}, Ll/ܽۗܺ;->ۖ()[Ljava/lang/Object;

    move-result-object v0

    iget v3, p0, Ll/ܽۗܺ;->۬:I

    invoke-static {v0, v2, v3, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 1035
    iget-object v0, p0, Ll/ܽۗܺ;->۫:Ljava/lang/Object;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    instance-of v1, v0, [B

    if-eqz v1, :cond_2

    .line 93
    check-cast v0, [B

    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([BB)V

    goto :goto_0

    .line 94
    :cond_2
    instance-of v1, v0, [S

    if-eqz v1, :cond_3

    .line 95
    check-cast v0, [S

    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([SS)V

    goto :goto_0

    .line 97
    :cond_3
    check-cast v0, [I

    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([II)V

    .line 989
    :goto_0
    invoke-direct {p0}, Ll/ܽۗܺ;->ۢ()[I

    move-result-object v0

    iget v1, p0, Ll/ܽۗܺ;->۬:I

    invoke-static {v0, v2, v1, v2}, Ljava/util/Arrays;->fill([IIII)V

    .line 990
    iput v2, p0, Ll/ܽۗܺ;->۬:I

    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 500
    invoke-virtual {p0}, Ll/ܽۗܺ;->֫()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 501
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0, p1}, Ll/ܽۗܺ;->֫(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 3

    .line 891
    invoke-virtual {p0}, Ll/ܽۗܺ;->֫()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 893
    invoke-interface {v0, p1}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 895
    :goto_0
    iget v2, p0, Ll/ܽۗܺ;->۬:I

    if-ge v1, v2, :cond_2

    .line 1065
    invoke-direct {p0}, Ll/ܽۗܺ;->ۖ()[Ljava/lang/Object;

    move-result-object v2

    aget-object v2, v2, v1

    .line 896
    invoke-static {p1, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 728
    iget-object v0, p0, Ll/ܽۗܺ;->᩹:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 732
    new-instance v0, Ll/᩺ۙܺ;

    invoke-direct {v0, p0}, Ll/᩺ۙܺ;-><init>(Ll/ܽۗܺ;)V

    .line 728
    iput-object v0, p0, Ll/ܽۗܺ;->᩹:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 506
    invoke-virtual {p0}, Ll/ܽۗܺ;->֫()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 508
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 510
    :cond_0
    invoke-direct {p0, p1}, Ll/ܽۗܺ;->֫(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 1065
    :cond_1
    invoke-direct {p0}, Ll/ܽۗܺ;->ۖ()[Ljava/lang/Object;

    move-result-object v0

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 886
    invoke-virtual {p0}, Ll/ܽۗܺ;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 672
    iget-object v0, p0, Ll/ܽۗܺ;->᩶:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 676
    new-instance v0, Ll/۟ۙܺ;

    invoke-direct {v0, p0}, Ll/۟ۙܺ;-><init>(Ll/ܽۗܺ;)V

    .line 672
    iput-object v0, p0, Ll/ܽۗܺ;->᩶:Ljava/util/Set;

    :cond_0
    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 333
    invoke-virtual {p0}, Ll/ܽۗܺ;->ܽ()Z

    move-result v0

    const/16 v1, 0x20

    const/4 v2, 0x2

    const/4 v3, 0x4

    const/4 v4, 0x1

    if-eqz v0, :cond_2

    .line 265
    invoke-virtual {p0}, Ll/ܽۗܺ;->ܽ()Z

    move-result v0

    const-string v5, "Arrays already allocated"

    invoke-static {v5, v0}, Ll/ۘܶܺ;->ۧ(Ljava/lang/String;Z)V

    .line 267
    iget v0, p0, Ll/ܽۗܺ;->ۗ:I

    add-int/lit8 v5, v0, 0x1

    .line 64
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 65
    invoke-static {v2}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v5

    int-to-double v6, v5

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    mul-double v6, v6, v8

    double-to-int v6, v6

    if-le v2, v6, :cond_1

    shl-int/lit8 v5, v5, 0x1

    if-lez v5, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v5, 0x40000000    # 2.0f

    .line 72
    :cond_1
    :goto_0
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 269
    invoke-static {v2}, Ll/ᩳۗܺ;->֫(I)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Ll/ܽۗܺ;->۫:Ljava/lang/Object;

    sub-int/2addr v2, v4

    .line 308
    invoke-static {v2}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x20

    .line 309
    iget v3, p0, Ll/ܽۗܺ;->ۗ:I

    const/16 v5, 0x1f

    .line 310
    invoke-static {v3, v2, v5}, Ll/ᩳۗܺ;->֫(III)I

    move-result v2

    iput v2, p0, Ll/ܽۗܺ;->ۗ:I

    .line 272
    new-array v2, v0, [I

    iput-object v2, p0, Ll/ܽۗܺ;->᩸:[I

    .line 273
    new-array v2, v0, [Ljava/lang/Object;

    iput-object v2, p0, Ll/ܽۗܺ;->ۙ:[Ljava/lang/Object;

    .line 274
    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Ll/ܽۗܺ;->ۤ:[Ljava/lang/Object;

    .line 336
    :cond_2
    invoke-virtual {p0}, Ll/ܽۗܺ;->֫()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 338
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 340
    :cond_3
    invoke-direct {p0}, Ll/ܽۗܺ;->ۢ()[I

    move-result-object v0

    .line 341
    invoke-direct {p0}, Ll/ܽۗܺ;->ܺ()[Ljava/lang/Object;

    move-result-object v2

    .line 342
    invoke-direct {p0}, Ll/ܽۗܺ;->ۖ()[Ljava/lang/Object;

    move-result-object v3

    .line 344
    iget v5, p0, Ll/ܽۗܺ;->۬:I

    add-int/lit8 v6, v5, 0x1

    .line 346
    invoke-static {p1}, Ll/ۗۗܺ;->֫(Ljava/lang/Object;)I

    move-result v7

    .line 347
    invoke-direct {p0}, Ll/ܽۗܺ;->᩷()I

    move-result v8

    and-int v9, v7, v8

    .line 1035
    iget-object v10, p0, Ll/ܽۗܺ;->۫:Ljava/lang/Object;

    invoke-static {v10}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    invoke-static {v9, v10}, Ll/ᩳۗܺ;->֫(ILjava/lang/Object;)I

    move-result v10

    if-nez v10, :cond_6

    if-le v6, v8, :cond_5

    if-ge v8, v1, :cond_4

    const/4 v0, 0x4

    goto :goto_1

    :cond_4
    const/4 v0, 0x2

    :goto_1
    add-int/lit8 v1, v8, 0x1

    mul-int v1, v1, v0

    .line 353
    invoke-direct {p0, v8, v1, v7, v5}, Ll/ܽۗܺ;->֫(IIII)I

    move-result v8

    goto/16 :goto_5

    .line 1035
    :cond_5
    iget-object v0, p0, Ll/ܽۗܺ;->۫:Ljava/lang/Object;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    invoke-static {v9, v6, v0}, Ll/ᩳۗܺ;->֫(IILjava/lang/Object;)V

    goto/16 :goto_5

    :cond_6
    not-int v1, v8

    and-int v9, v7, v1

    const/4 v11, 0x0

    :goto_2
    sub-int/2addr v10, v4

    .line 364
    aget v4, v0, v10

    and-int v12, v4, v1

    if-ne v12, v9, :cond_7

    .line 365
    aget-object v12, v2, v10

    .line 366
    invoke-static {p1, v12}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    .line 368
    aget-object p1, v3, v10

    .line 370
    aput-object p2, v3, v10

    return-object p1

    :cond_7
    and-int v12, v4, v8

    add-int/lit8 v11, v11, 0x1

    if-nez v12, :cond_e

    const/16 v1, 0x9

    if-lt v11, v1, :cond_a

    .line 294
    invoke-direct {p0}, Ll/ܽۗܺ;->᩷()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 289
    new-instance v1, Ljava/util/LinkedHashMap;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v1, v0, v2}, Ljava/util/LinkedHashMap;-><init>(IF)V

    .line 605
    invoke-virtual {p0}, Ll/ܽۗܺ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 v0, -0x1

    goto :goto_3

    :cond_8
    const/4 v0, 0x0

    :goto_3
    if-ltz v0, :cond_9

    .line 1060
    invoke-direct {p0}, Ll/ܽۗܺ;->ܺ()[Ljava/lang/Object;

    move-result-object v2

    aget-object v2, v2, v0

    .line 1065
    invoke-direct {p0}, Ll/ܽۗܺ;->ۖ()[Ljava/lang/Object;

    move-result-object v3

    aget-object v3, v3, v0

    .line 296
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    invoke-virtual {p0, v0}, Ll/ܽۗܺ;->ۧ(I)I

    move-result v0

    goto :goto_3

    .line 298
    :cond_9
    iput-object v1, p0, Ll/ܽۗܺ;->۫:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 299
    iput-object v0, p0, Ll/ܽۗܺ;->᩸:[I

    .line 300
    iput-object v0, p0, Ll/ܽۗܺ;->ۙ:[Ljava/lang/Object;

    .line 301
    iput-object v0, p0, Ll/ܽۗܺ;->ۤ:[Ljava/lang/Object;

    .line 302
    invoke-virtual {p0}, Ll/ܽۗܺ;->ۧ()V

    .line 379
    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_a
    if-le v6, v8, :cond_c

    const/16 v0, 0x20

    if-ge v8, v0, :cond_b

    const/4 v0, 0x4

    goto :goto_4

    :cond_b
    const/4 v0, 0x2

    :goto_4
    add-int/lit8 v1, v8, 0x1

    mul-int v1, v1, v0

    .line 384
    invoke-direct {p0, v8, v1, v7, v5}, Ll/ܽۗܺ;->֫(IIII)I

    move-result v8

    goto :goto_5

    .line 386
    :cond_c
    invoke-static {v4, v6, v8}, Ll/ᩳۗܺ;->֫(III)I

    move-result v1

    aput v1, v0, v10

    .line 408
    :goto_5
    invoke-direct {p0}, Ll/ܽۗܺ;->ۢ()[I

    move-result-object v0

    array-length v0, v0

    if-le v6, v0, :cond_d

    ushr-int/lit8 v1, v0, 0x1

    const/4 v2, 0x1

    .line 411
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v1, v0

    or-int/2addr v1, v2

    const v2, 0x3fffffff    # 1.9999999f

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-eq v1, v0, :cond_d

    .line 423
    invoke-direct {p0}, Ll/ܽۗܺ;->ۢ()[I

    move-result-object v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/ܽۗܺ;->᩸:[I

    .line 424
    invoke-direct {p0}, Ll/ܽۗܺ;->ܺ()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۗܺ;->ۙ:[Ljava/lang/Object;

    .line 425
    invoke-direct {p0}, Ll/ܽۗܺ;->ۖ()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۗܺ;->ۤ:[Ljava/lang/Object;

    :cond_d
    const/4 v0, 0x0

    .line 401
    invoke-static {v7, v0, v8}, Ll/ᩳۗܺ;->֫(III)I

    move-result v0

    .line 1081
    invoke-direct {p0}, Ll/ܽۗܺ;->ۢ()[I

    move-result-object v1

    aput v0, v1, v5

    .line 1073
    invoke-direct {p0}, Ll/ܽۗܺ;->ܺ()[Ljava/lang/Object;

    move-result-object v0

    aput-object p1, v0, v5

    .line 1077
    invoke-direct {p0}, Ll/ܽۗܺ;->ۖ()[Ljava/lang/Object;

    move-result-object p1

    aput-object p2, p1, v5

    .line 391
    iput v6, p0, Ll/ܽۗܺ;->۬:I

    .line 392
    invoke-virtual {p0}, Ll/ܽۗܺ;->ۧ()V

    const/4 p1, 0x0

    return-object p1

    :cond_e
    const/4 v4, 0x1

    move v10, v12

    goto/16 :goto_2
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 522
    invoke-virtual {p0}, Ll/ܽۗܺ;->֫()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 524
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 526
    :cond_0
    invoke-direct {p0, p1}, Ll/ܽۗܺ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 527
    sget-object v0, Ll/ܽۗܺ;->ۨ:Ljava/lang/Object;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    :cond_1
    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 880
    invoke-virtual {p0}, Ll/ܽۗܺ;->֫()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 881
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0

    :cond_0
    iget v0, p0, Ll/ܽۗܺ;->۬:I

    return v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 907
    iget-object v0, p0, Ll/ܽۗܺ;->ۛ:Ljava/util/Collection;

    if-nez v0, :cond_0

    .line 911
    new-instance v0, Ll/ۧۗܺ;

    invoke-direct {v0, p0}, Ll/ۧۗܺ;-><init>(Ll/ܽۗܺ;)V

    .line 907
    iput-object v0, p0, Ll/ܽۗܺ;->ۛ:Ljava/util/Collection;

    :cond_0
    return-object v0
.end method

.method public final ֫()Ljava/util/Map;
    .locals 2

    .line 282
    iget-object v0, p0, Ll/ܽۗܺ;->۫:Ljava/lang/Object;

    instance-of v1, v0, Ljava/util/Map;

    if-eqz v1, :cond_0

    .line 283
    check-cast v0, Ljava/util/Map;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(II)V
    .locals 10

    .line 1035
    iget-object v0, p0, Ll/ܽۗܺ;->۫:Ljava/lang/Object;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 562
    invoke-direct {p0}, Ll/ܽۗܺ;->ۢ()[I

    move-result-object v1

    .line 563
    invoke-direct {p0}, Ll/ܽۗܺ;->ܺ()[Ljava/lang/Object;

    move-result-object v2

    .line 564
    invoke-direct {p0}, Ll/ܽۗܺ;->ۖ()[Ljava/lang/Object;

    move-result-object v3

    .line 565
    invoke-virtual {p0}, Ll/ܽۗܺ;->size()I

    move-result v4

    add-int/lit8 v5, v4, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-ge p1, v5, :cond_2

    .line 568
    aget-object v8, v2, v5

    .line 569
    aput-object v8, v2, p1

    .line 570
    aget-object v9, v3, v5

    aput-object v9, v3, p1

    .line 571
    aput-object v7, v2, v5

    .line 572
    aput-object v7, v3, v5

    .line 575
    aget v2, v1, v5

    aput v2, v1, p1

    .line 576
    aput v6, v1, v5

    .line 579
    invoke-static {v8}, Ll/ۗۗܺ;->֫(Ljava/lang/Object;)I

    move-result v2

    and-int/2addr v2, p2

    .line 580
    invoke-static {v2, v0}, Ll/ᩳۗܺ;->֫(ILjava/lang/Object;)I

    move-result v3

    if-ne v3, v4, :cond_0

    add-int/lit8 p1, p1, 0x1

    .line 584
    invoke-static {v2, p1, v0}, Ll/ᩳۗܺ;->֫(IILjava/lang/Object;)V

    return-void

    :cond_0
    :goto_0
    add-int/lit8 v3, v3, -0x1

    .line 591
    aget v0, v1, v3

    and-int v2, v0, p2

    if-ne v2, v4, :cond_1

    add-int/lit8 p1, p1, 0x1

    .line 595
    invoke-static {v0, p1, p2}, Ll/ᩳۗܺ;->֫(III)I

    move-result p1

    aput p1, v1, v3

    return-void

    :cond_1
    move v3, v2

    goto :goto_0

    .line 598
    :cond_2
    aput-object v7, v2, p1

    .line 599
    aput-object v7, v3, p1

    .line 600
    aput v6, v1, p1

    return-void
.end method

.method public final ۧ(I)I
    .locals 1

    add-int/lit8 p1, p1, 0x1

    .line 609
    iget v0, p0, Ll/ܽۗܺ;->۬:I

    if-ge p1, v0, :cond_0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ۧ()V
    .locals 1

    .line 319
    iget v0, p0, Ll/ܽۗܺ;->ۗ:I

    add-int/lit8 v0, v0, 0x20

    iput v0, p0, Ll/ܽۗܺ;->ۗ:I

    return-void
.end method

.method public final ܽ(I)V
    .locals 3

    const/4 v0, 0x1

    if-ltz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Expected size must be >= 0"

    .line 251
    invoke-static {v2, v1}, Ll/ۘܶܺ;->֫(Ljava/lang/String;Z)V

    const v1, 0x3fffffff    # 1.9999999f

    .line 287
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 254
    iput p1, p0, Ll/ܽۗܺ;->ۗ:I

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 259
    iget-object v0, p0, Ll/ܽۗܺ;->۫:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
