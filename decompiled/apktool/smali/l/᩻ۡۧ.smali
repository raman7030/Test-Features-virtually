.class public final Ll/᩻ۡۧ;
.super Ll/᩷ۡۧ;
.source "Y8QE"


# instance fields
.field public ۧ:J

.field public ܽ:[J

.field public ᩳ:[J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 52
    new-instance v0, Ll/᩵᩷ۧ;

    invoke-direct {v0}, Ll/᩵᩷ۧ;-><init>()V

    invoke-direct {p0, v0}, Ll/᩷ۡۧ;-><init>(Ll/᩵ۢۧ;)V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 53
    iput-wide v0, p0, Ll/᩻ۡۧ;->ۧ:J

    const/4 v0, 0x0

    new-array v1, v0, [J

    .line 54
    iput-object v1, p0, Ll/᩻ۡۧ;->ᩳ:[J

    new-array v0, v0, [J

    .line 55
    iput-object v0, p0, Ll/᩻ۡۧ;->ܽ:[J

    return-void
.end method

.method public static ֫(ILl/ᩳ֨֫;)Ljava/io/Serializable;
    .locals 4

    if-eqz p0, :cond_b

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_9

    const/4 v1, 0x2

    if-eq p0, v1, :cond_8

    const/4 v2, 0x3

    if-eq p0, v2, :cond_5

    const/16 v2, 0x8

    if-eq p0, v2, :cond_4

    const/16 v2, 0xa

    if-eq p0, v2, :cond_1

    const/16 v0, 0xb

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 244
    :cond_0
    new-instance p0, Ljava/util/Date;

    .line 160
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ᩴ()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v2

    double-to-long v2, v2

    .line 244
    invoke-direct {p0, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 245
    invoke-virtual {p1, v1}, Ll/ᩳ֨֫;->ܳ(I)V

    return-object p0

    .line 183
    :cond_1
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩹()I

    move-result p0

    .line 184
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    if-ge v0, p0, :cond_3

    .line 140
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v2

    .line 187
    invoke-static {v2, p1}, Ll/᩻ۡۧ;->֫(ILl/ᩳ֨֫;)Ljava/io/Serializable;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 189
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-object v1

    .line 261
    :cond_4
    invoke-static {p1}, Ll/᩻ۡۧ;->֫(Ll/ᩳ֨֫;)Ljava/util/HashMap;

    move-result-object p0

    return-object p0

    .line 202
    :cond_5
    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 204
    :cond_6
    :goto_1
    invoke-static {p1}, Ll/᩻ۡۧ;->ۧ(Ll/ᩳ֨֫;)Ljava/lang/String;

    move-result-object v0

    .line 140
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v1

    const/16 v2, 0x9

    if-ne v1, v2, :cond_7

    return-object p0

    .line 209
    :cond_7
    invoke-static {v1, p1}, Ll/᩻ۡۧ;->֫(ILl/ᩳ֨֫;)Ljava/io/Serializable;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 211
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 257
    :cond_8
    invoke-static {p1}, Ll/᩻ۡۧ;->ۧ(Ll/ᩳ֨֫;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 150
    :cond_9
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result p0

    if-ne p0, v1, :cond_a

    const/4 v0, 0x1

    :cond_a
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    .line 160
    :cond_b
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ᩴ()J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ᩳ֨֫;)Ljava/util/HashMap;
    .locals 5

    .line 224
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩹()I

    move-result v0

    .line 225
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 227
    invoke-static {p0}, Ll/᩻ۡۧ;->ۧ(Ll/ᩳ֨֫;)Ljava/lang/String;

    move-result-object v3

    .line 140
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result v4

    .line 229
    invoke-static {v4, p0}, Ll/᩻ۡۧ;->֫(ILl/ᩳ֨֫;)Ljava/io/Serializable;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 231
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public static ۧ(Ll/ᩳ֨֫;)Ljava/lang/String;
    .locals 3

    .line 170
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ۗ()I

    move-result v0

    .line 171
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    .line 172
    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 173
    new-instance v2, Ljava/lang/String;

    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object p0

    invoke-direct {v2, p0, v1, v0}, Ljava/lang/String;-><init>([BII)V

    return-object v2
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 59
    iget-wide v0, p0, Ll/᩻ۡۧ;->ۧ:J

    return-wide v0
.end method

.method public final ֫(JLl/ᩳ֨֫;)Z
    .locals 9

    .line 140
    invoke-virtual {p3}, Ll/ᩳ֨֫;->֨()I

    move-result p1

    const/4 p2, 0x2

    const/4 v0, 0x0

    if-eq p1, p2, :cond_0

    return v0

    .line 87
    :cond_0
    invoke-static {p3}, Ll/᩻ۡۧ;->ۧ(Ll/ᩳ֨֫;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "onMetaData"

    .line 88
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v0

    .line 92
    :cond_1
    invoke-virtual {p3}, Ll/ᩳ֨֫;->֫()I

    move-result p1

    if-nez p1, :cond_2

    return v0

    .line 140
    :cond_2
    invoke-virtual {p3}, Ll/ᩳ֨֫;->֨()I

    move-result p1

    const/16 p2, 0x8

    if-eq p1, p2, :cond_3

    return v0

    .line 101
    :cond_3
    invoke-static {p3}, Ll/᩻ۡۧ;->֫(Ll/ᩳ֨֫;)Ljava/util/HashMap;

    move-result-object p1

    const-string p2, "duration"

    .line 103
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 104
    instance-of p3, p2, Ljava/lang/Double;

    const-wide v1, 0x412e848000000000L    # 1000000.0

    if-eqz p3, :cond_4

    .line 105
    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p2

    const-wide/16 v3, 0x0

    cmpl-double v5, p2, v3

    if-lez v5, :cond_4

    mul-double p2, p2, v1

    double-to-long p2, p2

    .line 107
    iput-wide p2, p0, Ll/᩻ۡۧ;->ۧ:J

    :cond_4
    const-string p2, "keyframes"

    .line 111
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 112
    instance-of p2, p1, Ljava/util/Map;

    if-eqz p2, :cond_6

    .line 113
    check-cast p1, Ljava/util/Map;

    const-string p2, "filepositions"

    .line 114
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    const-string p3, "times"

    .line 115
    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 116
    instance-of p3, p2, Ljava/util/List;

    if-eqz p3, :cond_6

    instance-of p3, p1, Ljava/util/List;

    if-eqz p3, :cond_6

    .line 117
    check-cast p2, Ljava/util/List;

    .line 118
    check-cast p1, Ljava/util/List;

    .line 119
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p3

    .line 120
    new-array v3, p3, [J

    iput-object v3, p0, Ll/᩻ۡۧ;->ᩳ:[J

    .line 121
    new-array v3, p3, [J

    iput-object v3, p0, Ll/᩻ۡۧ;->ܽ:[J

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p3, :cond_6

    .line 123
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 124
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 125
    instance-of v6, v5, Ljava/lang/Double;

    if-eqz v6, :cond_5

    instance-of v6, v4, Ljava/lang/Double;

    if-eqz v6, :cond_5

    .line 126
    iget-object v6, p0, Ll/᩻ۡۧ;->ᩳ:[J

    check-cast v5, Ljava/lang/Double;

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    mul-double v7, v7, v1

    double-to-long v7, v7

    aput-wide v7, v6, v3

    .line 127
    iget-object v5, p0, Ll/᩻ۡۧ;->ܽ:[J

    check-cast v4, Ljava/lang/Double;

    invoke-virtual {v4}, Ljava/lang/Double;->longValue()J

    move-result-wide v6

    aput-wide v6, v5, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    new-array p1, v0, [J

    .line 129
    iput-object p1, p0, Ll/᩻ۡۧ;->ᩳ:[J

    new-array p1, v0, [J

    .line 130
    iput-object p1, p0, Ll/᩻ۡۧ;->ܽ:[J

    :cond_6
    return v0
.end method

.method public final ۧ()[J
    .locals 1

    .line 67
    iget-object v0, p0, Ll/᩻ۡۧ;->ܽ:[J

    return-object v0
.end method

.method public final ܽ()[J
    .locals 1

    .line 63
    iget-object v0, p0, Ll/᩻ۡۧ;->ᩳ:[J

    return-object v0
.end method
