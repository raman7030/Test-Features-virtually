.class public Ll/᩷۬ܺ;
.super Ljava/lang/Object;
.source "866M"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public final ᩸:[Ljava/lang/Object;

.field public final ᩹:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/ۢ۬ܺ;)V
    .locals 5

    .line 1133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1135
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/Object;

    .line 1136
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/Object;

    .line 1139
    invoke-virtual {p1}, Ll/ۢ۬ܺ;->entrySet()Ll/ۛ۬ܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object p1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 1140
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v0, v2

    .line 1141
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1144
    :cond_0
    iput-object v0, p0, Ll/᩷۬ܺ;->᩸:[Ljava/lang/Object;

    .line 1145
    iput-object v1, p0, Ll/᩷۬ܺ;->᩹:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final readResolve()Ljava/lang/Object;
    .locals 6

    .line 1154
    iget-object v0, p0, Ll/᩷۬ܺ;->᩸:[Ljava/lang/Object;

    instance-of v1, v0, Ll/ۛ۬ܺ;

    iget-object v2, p0, Ll/᩷۬ܺ;->᩹:[Ljava/lang/Object;

    if-nez v1, :cond_1

    .line 1178
    array-length v1, v0

    invoke-virtual {p0, v1}, Ll/᩷۬ܺ;->֫(I)Ll/ۜ۬ܺ;

    move-result-object v1

    const/4 v3, 0x0

    .line 1180
    :goto_0
    array-length v4, v0

    if-ge v3, v4, :cond_0

    .line 1181
    aget-object v4, v0, v3

    aget-object v5, v2, v3

    invoke-virtual {v1, v4, v5}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1183
    :cond_0
    invoke-virtual {v1}, Ll/ۜ۬ܺ;->ۧ()Ll/ۢ۬ܺ;

    move-result-object v0

    return-object v0

    .line 1158
    :cond_1
    check-cast v0, Ll/ۛ۬ܺ;

    .line 1159
    check-cast v2, Ll/᩺ۗܺ;

    .line 1161
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    invoke-virtual {p0, v1}, Ll/᩷۬ܺ;->֫(I)Ll/ۜ۬ܺ;

    move-result-object v1

    .line 1163
    invoke-virtual {v0}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    .line 1164
    invoke-virtual {v2}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v2

    .line 1166
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1167
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    goto :goto_1

    .line 1170
    :cond_2
    invoke-virtual {v1}, Ll/ۜ۬ܺ;->ۧ()Ll/ۢ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public ֫(I)Ll/ۜ۬ܺ;
    .locals 1

    .line 1190
    new-instance v0, Ll/ۜ۬ܺ;

    invoke-direct {v0, p1}, Ll/ۜ۬ܺ;-><init>(I)V

    return-object v0
.end method
