.class public Ll/᩶۬ᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static bridge_synchronizedSet(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;
    .locals 1

    .line 1167
    new-instance v0, Ll/ۢۨᩴ;

    .line 1181
    invoke-direct {v0, p0, p1}, Ll/᩺ۛᩴ;-><init>(Ljava/util/Collection;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static synchronizedList(Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 1325
    instance-of v0, p0, Ljava/util/RandomAccess;

    if-eqz v0, :cond_0

    .line 1326
    new-instance v0, Ll/᩻ۨᩴ;

    .line 1458
    invoke-direct {v0, p0}, Ll/֫ۨᩴ;-><init>(Ljava/util/List;)V

    return-object v0

    .line 1327
    :cond_0
    new-instance v0, Ll/֫ۨᩴ;

    invoke-direct {v0, p0}, Ll/֫ۨᩴ;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static synchronizedMap(Ljava/util/Map;)Ljava/util/Map;
    .locals 1

    .line 1513
    new-instance v0, Ll/ᩳۨᩴ;

    invoke-direct {v0, p0}, Ll/ᩳۨᩴ;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public static synchronizedSet(Ljava/util/Set;)Ljava/util/Set;
    .locals 1

    .line 1163
    new-instance v0, Ll/ۢۨᩴ;

    .line 1177
    invoke-direct {v0, p0}, Ll/᩺ۛᩴ;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public static unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 1

    .line 103
    new-instance v0, Ll/ᩴۨᩴ;

    invoke-direct {v0, p0}, Ll/ᩴۨᩴ;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public static unmodifiableList(Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 334
    instance-of v0, p0, Ljava/util/RandomAccess;

    if-eqz v0, :cond_0

    .line 335
    new-instance v0, Ll/ܶܳ᩵;

    .line 472
    invoke-direct {v0, p0}, Ll/֨ۨᩴ;-><init>(Ljava/util/List;)V

    return-object v0

    .line 336
    :cond_0
    new-instance v0, Ll/֨ۨᩴ;

    invoke-direct {v0, p0}, Ll/֨ۨᩴ;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;
    .locals 1

    .line 505
    new-instance v0, Ll/۬ۨᩴ;

    invoke-direct {v0, p0}, Ll/۬ۨᩴ;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public static unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;
    .locals 1

    .line 242
    new-instance v0, Ll/᩹ܳ᩵;

    .line 253
    invoke-direct {v0, p0}, Ll/ᩴۨᩴ;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public static unmodifiableSortedMap(Ljava/util/SortedMap;)Ljava/util/SortedMap;
    .locals 1

    .line 900
    new-instance v0, Ll/ۙܳ᩵;

    invoke-direct {v0, p0}, Ll/ۙܳ᩵;-><init>(Ljava/util/SortedMap;)V

    return-object v0
.end method
