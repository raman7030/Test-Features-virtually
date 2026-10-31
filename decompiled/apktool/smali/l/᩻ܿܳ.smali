.class public final Ll/᩻ܿܳ;
.super Ljava/lang/Object;
.source "O6YT"


# static fields
.field public static final ۧ:Ljava/util/Set;

.field public static final ܽ:Ljava/util/Set;

.field public static final ᩳ:Ljava/util/Set;


# instance fields
.field public final ֫:Ll/۫ۤۡ;


# direct methods
.method public static constructor <clinit>()V
    .locals 25

    const-string v10, "resources.observeElement"

    const-string v11, "sources.showLineNum"

    const-string v0, "console.asyncRender"

    const-string v1, "console.jsExecution"

    const-string v2, "console.catchGlobalErr"

    const-string v3, "console.overrideConsole"

    const-string v4, "console.displayIfErr"

    const-string v5, "console.displayExtraInfo"

    const-string v6, "console.displayUnenumerable"

    const-string v7, "console.displayGetterVal"

    const-string v8, "console.lazyEvaluation"

    const-string v9, "elements.overrideEventTarget"

    .line 15
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    move-result-object v0

    .line 0
    new-instance v1, Ljava/util/HashSet;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const-string v5, "duplicate element: "

    if-ge v4, v2, :cond_1

    aget-object v6, v0, v4

    invoke-static {v6}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 15
    sput-object v0, Ll/᩻ܿܳ;->ۧ:Ljava/util/Set;

    const-string v23, "Light Owl"

    const-string v24, "AMOLED"

    const-string v6, "System preference"

    const-string v7, "Light"

    const-string v8, "Dark"

    const-string v9, "Material Oceanic"

    const-string v10, "Material Darker"

    const-string v11, "Material Lighter"

    const-string v12, "Material Palenight"

    const-string v13, "Material Deep Ocean"

    const-string v14, "Monokai Pro"

    const-string v15, "Dracula"

    const-string v16, "Arc Dark"

    const-string v17, "Atom One Dark"

    const-string v18, "Atom One Light"

    const-string v19, "Solarized Dark"

    const-string v20, "Solarized Light"

    const-string v21, "Github"

    const-string v22, "Night Owl"

    .line 20
    filled-new-array/range {v6 .. v24}, [Ljava/lang/String;

    move-result-object v0

    .line 0
    new-instance v1, Ljava/util/HashSet;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v2, :cond_3

    aget-object v6, v0, v4

    invoke-static {v6}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 20
    sput-object v0, Ll/᩻ܿܳ;->ᩳ:Ljava/util/Set;

    const/4 v0, 0x6

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "infinite"

    aput-object v2, v1, v3

    const-string v2, "250"

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const-string v2, "125"

    const/4 v4, 0x2

    aput-object v2, v1, v4

    const-string v2, "100"

    const/4 v4, 0x3

    aput-object v2, v1, v4

    const-string v2, "50"

    const/4 v4, 0x4

    aput-object v2, v1, v4

    const-string v2, "10"

    const/4 v4, 0x5

    aput-object v2, v1, v4

    .line 0
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(I)V

    :goto_2
    if-ge v3, v0, :cond_5

    aget-object v4, v1, v3

    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v4, v5}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 25
    sput-object v0, Ll/᩻ܿܳ;->ܽ:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ll/۫ۤۡ;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Ll/᩻ܿܳ;->֫:Ll/۫ۤۡ;

    return-void
.end method

.method public static ֫(Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 5

    .line 100
    sget-object v0, Ll/᩻ܿܳ;->ۧ:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    instance-of p0, p0, Ljava/lang/Boolean;

    return p0

    :cond_0
    const-string v0, "dev-tools.theme"

    .line 101
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    instance-of p1, p0, Ljava/lang/String;

    if-eqz p1, :cond_1

    sget-object p1, Ll/᩻ܿܳ;->ᩳ:Ljava/util/Set;

    invoke-interface {p1, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    return v1

    :cond_1
    return v2

    :cond_2
    const-string v0, "console.maxLogNum"

    .line 102
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    instance-of p1, p0, Ljava/lang/String;

    if-eqz p1, :cond_3

    sget-object p1, Ll/᩻ܿܳ;->ܽ:Ljava/util/Set;

    invoke-interface {p1, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    return v1

    :cond_3
    return v2

    .line 103
    :cond_4
    instance-of v0, p0, Ljava/lang/Number;

    if-nez v0, :cond_5

    return v2

    .line 104
    :cond_5
    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v3

    .line 0
    invoke-static {v3, v4}, Ljava/lang/Double;->isInfinite(D)Z

    move-result p0

    if-nez p0, :cond_8

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    move-result p0

    if-nez p0, :cond_8

    const-string p0, "dev-tools.transparency"

    .line 106
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_7

    const-wide p0, 0x3fc999999999999aL    # 0.2

    cmpl-double v0, v3, p0

    if-ltz v0, :cond_6

    const-wide/high16 p0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v3, p0

    if-gtz v0, :cond_6

    return v1

    :cond_6
    return v2

    :cond_7
    const-string p0, "dev-tools.displaySize"

    .line 107
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_8

    const-wide/high16 p0, 0x4044000000000000L    # 40.0

    cmpl-double v0, v3, p0

    if-ltz v0, :cond_8

    const-wide/high16 p0, 0x4059000000000000L    # 100.0

    cmpg-double v0, v3, p0

    if-gtz v0, :cond_8

    return v1

    :cond_8
    return v2
.end method

.method private ۧ()Lorg/json/JSONObject;
    .locals 6

    .line 41
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "hpic"

    const-string v2, "{}"

    .line 42
    iget-object v3, p0, Ll/᩻ܿܳ;->֫:Ll/۫ۤۡ;

    invoke-interface {v3, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x1000

    if-le v2, v3, :cond_0

    goto :goto_1

    .line 45
    :cond_0
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 46
    invoke-virtual {v2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    .line 47
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 48
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 49
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 50
    invoke-static {v4, v3}, Ll/᩻ܿܳ;->֫(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_2
    :goto_1
    return-object v0
.end method

.method private ۧ(Ljava/lang/String;)Z
    .locals 5

    const/4 v0, 0x0

    .line 68
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 69
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result p1

    const/4 v2, 0x1

    if-ne p1, v2, :cond_0

    const-string p1, "reset"

    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 70
    invoke-direct {p0, p1}, Ll/᩻ܿܳ;->ܽ(Ljava/lang/String;)Z

    move-result p1

    return p1

    .line 72
    :cond_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result p1

    const/4 v3, 0x4

    if-ne p1, v3, :cond_4

    const-string p1, "set"

    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 73
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Ljava/lang/String;

    if-eqz p1, :cond_4

    const/4 p1, 0x2

    invoke-virtual {v1, p1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Ljava/lang/String;

    if-nez v3, :cond_1

    goto :goto_0

    .line 76
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x3

    .line 77
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 78
    invoke-static {v1, p1}, Ll/᩻ܿܳ;->֫(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    return v0

    .line 79
    :cond_2
    invoke-direct {p0}, Ll/᩻ܿܳ;->ۧ()Lorg/json/JSONObject;

    move-result-object v3

    .line 80
    invoke-virtual {v3, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 81
    invoke-virtual {v3, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 82
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/᩻ܿܳ;->ܽ(Ljava/lang/String;)Z

    move-result p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :cond_3
    return v2

    :catch_0
    :cond_4
    :goto_0
    return v0
.end method

.method private ܽ(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    .line 92
    iget-object v1, p0, Ll/᩻ܿܳ;->֫:Ll/۫ۤۡ;

    const-string v2, "hpic"

    invoke-interface {v1, v2, v0}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 93
    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v3

    invoke-interface {v3, v2, p1}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->commit()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 94
    :cond_0
    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1, v2, v0}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->commit()Z

    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final ֫()Lorg/json/JSONObject;
    .locals 2

    .line 35
    iget-object v0, p0, Ll/᩻ܿܳ;->֫:Ll/۫ۤۡ;

    monitor-enter v0

    .line 36
    :try_start_0
    invoke-direct {p0}, Ll/᩻ܿܳ;->ۧ()Lorg/json/JSONObject;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 37
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 2

    if-eqz p1, :cond_1

    .line 60
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x200

    if-le v0, v1, :cond_0

    goto :goto_0

    .line 61
    :cond_0
    iget-object v0, p0, Ll/᩻ܿܳ;->֫:Ll/۫ۤۡ;

    monitor-enter v0

    .line 62
    :try_start_0
    invoke-direct {p0, p1}, Ll/᩻ܿܳ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 63
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
