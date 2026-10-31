.class public Lbin/mt/json/JSONObject;
.super Lbin/mt/json/JSONValue;
.source "JSONObject.java"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final names:Ljava/util/List;

.field public transient table:Ll/ܰܳܳ;

.field public final values:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 82
    invoke-direct {p0}, Lbin/mt/json/JSONValue;-><init>()V

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    .line 84
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lbin/mt/json/JSONObject;->values:Ljava/util/List;

    .line 85
    new-instance v0, Ll/ܰܳܳ;

    invoke-direct {v0}, Ll/ܰܳܳ;-><init>()V

    iput-object v0, p0, Lbin/mt/json/JSONObject;->table:Ll/ܰܳܳ;

    return-void
.end method

.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 1

    const/4 v0, 0x0

    .line 106
    invoke-direct {p0, p1, v0}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;Z)V

    return-void
.end method

.method public constructor <init>(Lbin/mt/json/JSONObject;Z)V
    .locals 1

    .line 109
    invoke-direct {p0}, Lbin/mt/json/JSONValue;-><init>()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 114
    iget-object p2, p1, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    invoke-static {p2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    .line 115
    iget-object p1, p1, Lbin/mt/json/JSONObject;->values:Ljava/util/List;

    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lbin/mt/json/JSONObject;->values:Ljava/util/List;

    goto :goto_0

    .line 117
    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    iget-object v0, p1, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p2, p0, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    .line 118
    new-instance p2, Ljava/util/ArrayList;

    iget-object p1, p1, Lbin/mt/json/JSONObject;->values:Ljava/util/List;

    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p2, p0, Lbin/mt/json/JSONObject;->values:Ljava/util/List;

    .line 120
    :goto_0
    new-instance p1, Ll/ܰܳܳ;

    invoke-direct {p1}, Ll/ܰܳܳ;-><init>()V

    iput-object p1, p0, Lbin/mt/json/JSONObject;->table:Ll/ܰܳܳ;

    .line 121
    invoke-direct {p0}, Lbin/mt/json/JSONObject;->updateHashIndex()V

    return-void

    .line 111
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "object is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 92
    invoke-direct {p0}, Lbin/mt/json/JSONObject;-><init>()V

    if-eqz p1, :cond_0

    .line 96
    new-instance v0, Ll/۫ܳܳ;

    invoke-direct {v0}, Ll/۫ܳܳ;-><init>()V

    .line 97
    new-instance v1, Lbin/mt/json/JSONParser;

    invoke-direct {v1, v0}, Lbin/mt/json/JSONParser;-><init>(Lbin/mt/json/JSONHandler;)V

    invoke-virtual {v1, p0, p1}, Lbin/mt/json/JSONParser;->parseObject(Lbin/mt/json/JSONObject;Ljava/lang/String;)V

    return-void

    .line 94
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "source is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private declared-synchronized readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 886
    :try_start_0
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 887
    new-instance p1, Ll/ܰܳܳ;

    invoke-direct {p1}, Ll/ܰܳܳ;-><init>()V

    iput-object p1, p0, Lbin/mt/json/JSONObject;->table:Ll/ܰܳܳ;

    .line 888
    invoke-direct {p0}, Lbin/mt/json/JSONObject;->updateHashIndex()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 889
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public static unmodifiableObject(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 135
    new-instance v0, Lbin/mt/json/JSONObject;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;Z)V

    return-object v0
.end method

.method private updateHashIndex()V
    .locals 4

    .line 892
    iget-object v0, p0, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 894
    iget-object v2, p0, Lbin/mt/json/JSONObject;->table:Ll/ܰܳܳ;

    iget-object v3, p0, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3, v1}, Ll/ܰܳܳ;->֫(Ljava/lang/String;I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public add(Ljava/lang/String;D)Lbin/mt/json/JSONObject;
    .locals 0

    .line 206
    invoke-static {p2, p3}, Lbin/mt/json/JSON;->value(D)Lbin/mt/json/JSONValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-object p0
.end method

.method public add(Ljava/lang/String;F)Lbin/mt/json/JSONObject;
    .locals 0

    .line 188
    invoke-static {p2}, Lbin/mt/json/JSON;->value(F)Lbin/mt/json/JSONValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-object p0
.end method

.method public add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;
    .locals 0

    .line 152
    invoke-static {p2}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-object p0
.end method

.method public add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;
    .locals 0

    .line 170
    invoke-static {p2, p3}, Lbin/mt/json/JSON;->value(J)Lbin/mt/json/JSONValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-object p0
.end method

.method public add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;
    .locals 2

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 266
    iget-object v0, p0, Lbin/mt/json/JSONObject;->table:Ll/ܰܳܳ;

    iget-object v1, p0, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Ll/ܰܳܳ;->֫(Ljava/lang/String;I)V

    .line 267
    iget-object v0, p0, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 268
    iget-object p1, p0, Lbin/mt/json/JSONObject;->values:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0

    .line 264
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 261
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "name is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 242
    invoke-static {p2}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-object p0
.end method

.method public add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;
    .locals 0

    .line 224
    invoke-static {p2}, Lbin/mt/json/JSON;->value(Z)Lbin/mt/json/JSONValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-object p0
.end method

.method public asObject()Lbin/mt/json/JSONObject;
    .locals 0

    return-object p0
.end method

.method public contains(Ljava/lang/String;)Z
    .locals 1

    .line 499
    iget-object v0, p0, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    .line 869
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    .line 872
    :cond_2
    check-cast p1, Lbin/mt/json/JSONObject;

    .line 873
    iget-object v2, p0, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    iget-object v3, p1, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lbin/mt/json/JSONObject;->values:Ljava/util/List;

    iget-object p1, p1, Lbin/mt/json/JSONObject;->values:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v0

    :cond_3
    return v1
.end method

.method public get(Ljava/lang/String;)Lbin/mt/json/JSONValue;
    .locals 1

    if-eqz p1, :cond_1

    .line 530
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->indexOf(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 531
    iget-object v0, p0, Lbin/mt/json/JSONObject;->values:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbin/mt/json/JSONValue;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    .line 528
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "name is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getBoolean(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    .line 728
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public getBoolean(Ljava/lang/String;Z)Z
    .locals 0

    .line 716
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 717
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result p1

    return p1

    :cond_0
    return p2
.end method

.method public getBooleanObject(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    .line 739
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 740
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getDouble(Ljava/lang/String;)D
    .locals 2

    const-wide/16 v0, 0x0

    .line 691
    invoke-virtual {p0, p1, v0, v1}, Lbin/mt/json/JSONObject;->getDouble(Ljava/lang/String;D)D

    move-result-wide v0

    return-wide v0
.end method

.method public getDouble(Ljava/lang/String;D)D
    .locals 0

    .line 679
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 680
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asDouble()D

    move-result-wide p1

    return-wide p1

    :cond_0
    return-wide p2
.end method

.method public getDoubleObject(Ljava/lang/String;)Ljava/lang/Double;
    .locals 2

    .line 702
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 703
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asDouble()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getFloat(Ljava/lang/String;)F
    .locals 1

    const/4 v0, 0x0

    .line 654
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->getFloat(Ljava/lang/String;F)F

    move-result p1

    return p1
.end method

.method public getFloat(Ljava/lang/String;F)F
    .locals 0

    .line 642
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 643
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asFloat()F

    move-result p1

    return p1

    :cond_0
    return p2
.end method

.method public getFloatObject(Ljava/lang/String;)Ljava/lang/Float;
    .locals 1

    .line 665
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 666
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asFloat()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getInt(Ljava/lang/String;)I
    .locals 1

    const/4 v0, 0x0

    .line 580
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public getInt(Ljava/lang/String;I)I
    .locals 0

    .line 568
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 569
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asInt()I

    move-result p1

    return p1

    :cond_0
    return p2
.end method

.method public getIntegerObject(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1

    .line 591
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 592
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asInt()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;
    .locals 1

    .line 554
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 555
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 1

    .line 542
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 543
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getLong(Ljava/lang/String;)J
    .locals 2

    const-wide/16 v0, 0x0

    .line 617
    invoke-virtual {p0, p1, v0, v1}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getLong(Ljava/lang/String;J)J
    .locals 0

    .line 605
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 606
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asLong()J

    move-result-wide p1

    return-wide p1

    :cond_0
    return-wide p2
.end method

.method public getLongObject(Ljava/lang/String;)Ljava/lang/Long;
    .locals 2

    .line 628
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 629
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 765
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 753
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 754
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p2
.end method

.method public hashCode()I
    .locals 2

    .line 856
    iget-object v0, p0, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    add-int/lit8 v0, v0, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    .line 857
    iget-object v1, p0, Lbin/mt/json/JSONObject;->values:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public indexOf(Ljava/lang/String;)I
    .locals 2

    .line 877
    iget-object v0, p0, Lbin/mt/json/JSONObject;->table:Ll/ܰܳܳ;

    invoke-virtual {v0, p1}, Ll/ܰܳܳ;->֫(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 878
    iget-object v1, p0, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    .line 881
    :cond_0
    iget-object v0, p0, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    .line 783
    iget-object v0, p0, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public isObject()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3

    .line 803
    iget-object v0, p0, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 804
    iget-object v1, p0, Lbin/mt/json/JSONObject;->values:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 805
    new-instance v2, Ll/᩺ܳܳ;

    invoke-direct {v2, p0, v0, v1}, Ll/᩺ܳܳ;-><init>(Lbin/mt/json/JSONObject;Ljava/util/Iterator;Ljava/util/Iterator;)V

    return-object v2
.end method

.method public merge(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 2

    if-eqz p1, :cond_1

    .line 513
    invoke-virtual {p1}, Lbin/mt/json/JSONObject;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbin/mt/json/JSONObject$Member;

    .line 514
    invoke-static {v0}, Lbin/mt/json/JSONObject$Member;->access$000(Lbin/mt/json/JSONObject$Member;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lbin/mt/json/JSONObject$Member;->access$100(Lbin/mt/json/JSONObject$Member;)Lbin/mt/json/JSONValue;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_0

    :cond_0
    return-object p0

    .line 511
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "object is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public names()Ljava/util/List;
    .locals 1

    .line 793
    iget-object v0, p0, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public put(Ljava/lang/String;D)Lbin/mt/json/JSONObject;
    .locals 0

    .line 400
    invoke-static {p2, p3}, Lbin/mt/json/JSON;->value(D)Lbin/mt/json/JSONValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-object p0
.end method

.method public put(Ljava/lang/String;F)Lbin/mt/json/JSONObject;
    .locals 0

    .line 382
    invoke-static {p2}, Lbin/mt/json/JSON;->value(F)Lbin/mt/json/JSONValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-object p0
.end method

.method public put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;
    .locals 0

    .line 346
    invoke-static {p2}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-object p0
.end method

.method public put(Ljava/lang/String;J)Lbin/mt/json/JSONObject;
    .locals 0

    .line 364
    invoke-static {p2, p3}, Lbin/mt/json/JSON;->value(J)Lbin/mt/json/JSONValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-object p0
.end method

.method public put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;
    .locals 2

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    .line 460
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 462
    iget-object p1, p0, Lbin/mt/json/JSONObject;->values:Ljava/util/List;

    invoke-interface {p1, v0, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-object p0

    .line 464
    :cond_0
    iget-object v0, p0, Lbin/mt/json/JSONObject;->table:Ll/ܰܳܳ;

    iget-object v1, p0, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Ll/ܰܳܳ;->֫(Ljava/lang/String;I)V

    .line 465
    iget-object v0, p0, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 466
    iget-object p1, p0, Lbin/mt/json/JSONObject;->values:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0

    .line 458
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 455
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "name is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 436
    invoke-static {p2}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-object p0
.end method

.method public put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;
    .locals 0

    .line 418
    invoke-static {p2}, Lbin/mt/json/JSON;->value(Z)Lbin/mt/json/JSONValue;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-object p0
.end method

.method public putChecked(Lbin/mt/plugin/api/ui/PluginCompoundButton;)Lbin/mt/json/JSONObject;
    .locals 1

    .line 292
    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginView;->requireId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginCompoundButton;->isChecked()Z

    move-result p1

    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    return-object p0
.end method

.method public putCheckedId(Lbin/mt/plugin/api/ui/PluginRadioGroup;)Lbin/mt/json/JSONObject;
    .locals 1

    .line 328
    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginView;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginRadioGroup;->getCheckedRadioButtonId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    return-object p0
.end method

.method public putCheckedPosition(Lbin/mt/plugin/api/ui/PluginRadioGroup;)Lbin/mt/json/JSONObject;
    .locals 1

    .line 316
    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginView;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginRadioGroup;->getCheckedRadioButtonPosition()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    return-object p0
.end method

.method public putSelection(Lbin/mt/plugin/api/ui/PluginSpinner;)Lbin/mt/json/JSONObject;
    .locals 1

    .line 304
    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginView;->requireId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginSpinner;->getSelection()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    return-object p0
.end method

.method public putText(Lbin/mt/plugin/api/ui/PluginEditText;)Lbin/mt/json/JSONObject;
    .locals 1

    .line 280
    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginView;->requireId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    return-object p0
.end method

.method public remove(Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 1

    if-eqz p1, :cond_1

    .line 482
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->indexOf(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 484
    iget-object v0, p0, Lbin/mt/json/JSONObject;->table:Ll/ܰܳܳ;

    invoke-virtual {v0, p1}, Ll/ܰܳܳ;->֫(I)V

    .line 485
    iget-object v0, p0, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 486
    iget-object v0, p0, Lbin/mt/json/JSONObject;->values:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_0
    return-object p0

    .line 480
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "name is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public size()I
    .locals 1

    .line 774
    iget-object v0, p0, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public write(Ll/֫᩻ܳ;)V
    .locals 3

    .line 826
    invoke-virtual {p1}, Ll/֫᩻ܳ;->ܳ()V

    .line 827
    iget-object v0, p0, Lbin/mt/json/JSONObject;->names:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 828
    iget-object v1, p0, Lbin/mt/json/JSONObject;->values:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 829
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 830
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Ll/֫᩻ܳ;->ܽ(Ljava/lang/String;)V

    .line 831
    invoke-virtual {p1}, Ll/֫᩻ܳ;->ᩳ()V

    .line 832
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbin/mt/json/JSONValue;

    invoke-virtual {v2, p1}, Lbin/mt/json/JSONValue;->write(Ll/֫᩻ܳ;)V

    .line 833
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 834
    invoke-virtual {p1}, Ll/֫᩻ܳ;->᩻()V

    .line 835
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Ll/֫᩻ܳ;->ܽ(Ljava/lang/String;)V

    .line 836
    invoke-virtual {p1}, Ll/֫᩻ܳ;->ᩳ()V

    .line 837
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbin/mt/json/JSONValue;

    invoke-virtual {v2, p1}, Lbin/mt/json/JSONValue;->write(Ll/֫᩻ܳ;)V

    goto :goto_0

    .line 840
    :cond_0
    invoke-virtual {p1}, Ll/֫᩻ܳ;->ܿ()V

    return-void
.end method
