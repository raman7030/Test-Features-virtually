.class public final Ll/ۢۖۖ;
.super Ll/֨ۖۖ;
.source "99PI"

# interfaces
.implements Ll/۬ᩴۖ;


# instance fields
.field public final ۗ:Ll/ۚۖۖ;

.field public final ۙ:I

.field public final ۛ:[Ll/ۖۖۖ;

.field public ۤ:Ljava/util/HashMap;

.field public final ۨ:[Ll/ۖۖۖ;

.field public ۫:Ll/᩺᩷ۖ;

.field public final ۬:Ljava/lang/String;

.field public ᩶:Ljava/lang/ref/ReferenceQueue;


# direct methods
.method public constructor <init>(Ll/᩺᩷ۖ;Ll/ۚۖۖ;Ll/ᩳۖۖ;)V
    .locals 5

    const/4 v0, 0x0

    .line 2272
    invoke-direct {p0, v0}, Ll/֨ۖۖ;-><init>(I)V

    const/4 v1, 0x0

    .line 2264
    iput-object v1, p0, Ll/ۢۖۖ;->ۤ:Ljava/util/HashMap;

    .line 2265
    iput-object v1, p0, Ll/ۢۖۖ;->᩶:Ljava/lang/ref/ReferenceQueue;

    if-nez p3, :cond_0

    .line 2274
    iput-object p2, p0, Ll/֨ۖۖ;->᩹:Ll/֨ۖۖ;

    goto :goto_0

    .line 2276
    :cond_0
    iput-object p3, p0, Ll/֨ۖۖ;->᩹:Ll/֨ۖۖ;

    .line 2279
    :goto_0
    iput-object p1, p0, Ll/ۢۖۖ;->۫:Ll/᩺᩷ۖ;

    .line 2280
    invoke-virtual {p1}, Ll/᩺᩷ۖ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, p3, v2}, Ll/᩹ۖۖ;->֫(Ll/ۚۖۖ;Ll/ᩳۖۖ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Ll/ۢۖۖ;->۬:Ljava/lang/String;

    .line 2281
    iput-object p2, p0, Ll/ۢۖۖ;->ۗ:Ll/ۚۖۖ;

    .line 2284
    invoke-virtual {p1}, Ll/᩺᩷ۖ;->᩷()I

    move-result p3

    if-eqz p3, :cond_4

    .line 2290
    invoke-virtual {p1}, Ll/᩺᩷ۖ;->᩷()I

    move-result p3

    new-array p3, p3, [Ll/ۖۖۖ;

    iput-object p3, p0, Ll/ۢۖۖ;->ۛ:[Ll/ۖۖۖ;

    const/4 p3, 0x0

    .line 2291
    :goto_1
    invoke-virtual {p1}, Ll/᩺᩷ۖ;->᩷()I

    move-result v2

    if-ge p3, v2, :cond_1

    .line 2292
    iget-object v2, p0, Ll/ۢۖۖ;->ۛ:[Ll/ۖۖۖ;

    new-instance v3, Ll/ۖۖۖ;

    invoke-virtual {p1, p3}, Ll/᩺᩷ۖ;->֫(I)Ll/ᩳۢۖ;

    move-result-object v4

    invoke-direct {v3, v4, p2, p0, p3}, Ll/ۖۖۖ;-><init>(Ll/ᩳۢۖ;Ll/ۚۖۖ;Ll/ۢۖۖ;I)V

    aput-object v3, v2, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    .line 2294
    :cond_1
    iget-object p3, p0, Ll/ۢۖۖ;->ۛ:[Ll/ۖۖۖ;

    invoke-virtual {p3}, [Ll/ۖۖۖ;->clone()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ll/ۖۖۖ;

    iput-object p3, p0, Ll/ۢۖۖ;->ۨ:[Ll/ۖۖۖ;

    .line 2295
    sget-object v2, Ll/ۖۖۖ;->۫:Ljava/util/Comparator;

    invoke-static {p3, v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    const/4 p3, 0x1

    .line 2298
    :goto_2
    invoke-virtual {p1}, Ll/᩺᩷ۖ;->᩷()I

    move-result v2

    if-ge p3, v2, :cond_3

    .line 2299
    iget-object v2, p0, Ll/ۢۖۖ;->ۨ:[Ll/ۖۖۖ;

    aget-object v3, v2, v0

    .line 2300
    aget-object v2, v2, p3

    .line 2301
    invoke-virtual {v3}, Ll/ۖۖۖ;->getNumber()I

    move-result v3

    invoke-virtual {v2}, Ll/ۖۖۖ;->getNumber()I

    move-result v4

    if-eq v3, v4, :cond_2

    .line 2302
    iget-object v3, p0, Ll/ۢۖۖ;->ۨ:[Ll/ۖۖۖ;

    add-int/lit8 v0, v0, 0x1

    aput-object v2, v3, v0

    :cond_2
    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 2305
    iput v0, p0, Ll/ۢۖۖ;->ۙ:I

    .line 2306
    iget-object p3, p0, Ll/ۢۖۖ;->ۨ:[Ll/ۖۖۖ;

    invoke-virtual {p1}, Ll/᩺᩷ۖ;->᩷()I

    move-result p1

    invoke-static {p3, v0, p1, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 2308
    invoke-static {p2}, Ll/ۚۖۖ;->֫(Ll/ۚۖۖ;)Ll/᩻ۖۖ;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/᩻ۖۖ;->֫(Ll/֨ۖۖ;)V

    return-void

    .line 2287
    :cond_4
    new-instance p1, Ll/ۜۖۖ;

    const-string p2, "Enums must contain at least one value."

    invoke-direct {p1, p0, p2, v0}, Ll/ۜۖۖ;-><init>(Ll/֨ۖۖ;Ljava/lang/String;I)V

    throw p1
.end method

.method public static ֫(Ll/ۢۖۖ;)V
    .locals 3

    .line 2313
    iget-object v0, p0, Ll/ۢۖۖ;->۫:Ll/᩺᩷ۖ;

    invoke-virtual {v0}, Ll/᩺᩷ۖ;->ۜ()Ll/֫ۢۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫ۢۖ;->ۘ()Ll/ۛۢۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/֨ۖۖ;->֫(Ll/ۛۢۖ;)V

    .line 2315
    iget-object p0, p0, Ll/ۢۖۖ;->ۛ:[Ll/ۖۖۖ;

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p0, v1

    .line 2316
    invoke-static {v2}, Ll/ۖۖۖ;->֫(Ll/ۖۖۖ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic ۧ(Ll/ۢۖۖ;)Ll/ۚۖۖ;
    .locals 0

    .line 2058
    iget-object p0, p0, Ll/ۢۖۖ;->ۗ:Ll/ۚۖۖ;

    return-object p0
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 2078
    iget-object v0, p0, Ll/ۢۖۖ;->۫:Ll/᩺᩷ۖ;

    invoke-virtual {v0}, Ll/᩺᩷ۖ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)Ll/ۖۖۖ;
    .locals 5

    .line 3360
    iget v0, p0, Ll/ۢۖۖ;->ۙ:I

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_0
    if-gt v1, v0, :cond_1

    add-int v2, v1, v0

    .line 3363
    div-int/lit8 v2, v2, 0x2

    .line 3364
    iget-object v3, p0, Ll/ۢۖۖ;->ۨ:[Ll/ۖۖۖ;

    aget-object v3, v3, v2

    .line 2354
    invoke-virtual {v3}, Ll/ۖۖۖ;->getNumber()I

    move-result v4

    if-ge p1, v4, :cond_0

    add-int/lit8 v0, v2, -0x1

    goto :goto_0

    :cond_0
    if-le p1, v4, :cond_2

    add-int/lit8 v1, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :cond_2
    return-object v3
.end method

.method public final ֫(Ljava/lang/String;)Ll/ۖۖۖ;
    .locals 3

    .line 2182
    iget-object v0, p0, Ll/ۢۖۖ;->ۗ:Ll/ۚۖۖ;

    invoke-static {v0}, Ll/ۚۖۖ;->֫(Ll/ۚۖۖ;)Ll/᩻ۖۖ;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ۢۖۖ;->۬:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2e

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2971
    sget-object v1, Ll/ܳۖۖ;->᩶:Ll/ܳۖۖ;

    invoke-virtual {v0, p1, v1}, Ll/᩻ۖۖ;->֫(Ljava/lang/String;Ll/ܳۖۖ;)Ll/֨ۖۖ;

    move-result-object p1

    .line 2183
    instance-of v0, p1, Ll/ۖۖۖ;

    if-eqz v0, :cond_0

    .line 2184
    check-cast p1, Ll/ۖۖۖ;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۢ()Ll/᩻֡ۖ;
    .locals 1

    .line 2072
    iget-object v0, p0, Ll/ۢۖۖ;->۫:Ll/᩺᩷ۖ;

    return-object v0
.end method

.method public final ۧ(I)Ll/ۖۖۖ;
    .locals 5

    .line 2217
    invoke-virtual {p0, p1}, Ll/ۢۖۖ;->֫(I)Ll/ۖۖۖ;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    move-object v0, p0

    .line 2222
    monitor-enter v0

    .line 2223
    :try_start_0
    iget-object v1, p0, Ll/ۢۖۖ;->᩶:Ljava/lang/ref/ReferenceQueue;

    if-nez v1, :cond_1

    .line 2224
    new-instance v1, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object v1, p0, Ll/ۢۖۖ;->᩶:Ljava/lang/ref/ReferenceQueue;

    .line 2225
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/ۢۖۖ;->ۤ:Ljava/util/HashMap;

    goto :goto_1

    .line 2228
    :cond_1
    :goto_0
    iget-object v1, p0, Ll/ۢۖۖ;->᩶:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v1}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object v1

    check-cast v1, Ll/᩷ۖۖ;

    if-nez v1, :cond_4

    .line 2239
    :goto_1
    iget-object v1, p0, Ll/ۢۖۖ;->ۤ:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    if-nez v1, :cond_2

    const/4 v1, 0x0

    goto :goto_2

    .line 2240
    :cond_2
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۖۖ;

    :goto_2
    if-nez v1, :cond_3

    .line 2243
    new-instance v1, Ll/ۖۖۖ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Ll/ۖۖۖ;-><init>(Ll/ۢۖۖ;Ljava/lang/Integer;)V

    .line 2244
    iget-object v2, p0, Ll/ۢۖۖ;->ۤ:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ll/᩷ۖۖ;

    invoke-direct {v4, p1, v1}, Ll/᩷ۖۖ;-><init>(ILl/ۖۖۖ;)V

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2246
    :cond_3
    monitor-exit v0

    return-object v1

    .line 2232
    :cond_4
    iget-object v2, p0, Ll/ۢۖۖ;->ۤ:Ljava/util/HashMap;

    invoke-static {v1}, Ll/᩷ۖۖ;->֫(Ll/᩷ۖۖ;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 2246
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۧ()Ll/ۚۖۖ;
    .locals 1

    .line 2094
    iget-object v0, p0, Ll/ۢۖۖ;->ۗ:Ll/ۚۖۖ;

    return-object v0
.end method

.method public final ܺ()Ljava/util/List;
    .locals 1

    .line 2151
    iget-object v0, p0, Ll/ۢۖۖ;->ۛ:[Ll/ۖۖۖ;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 2088
    iget-object v0, p0, Ll/ۢۖۖ;->۬:Ljava/lang/String;

    return-object v0
.end method
