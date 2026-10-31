.class public Lbin/mt/json/JSONArray;
.super Lbin/mt/json/JSONValue;
.source "JSONArray.java"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final values:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 67
    invoke-direct {p0}, Lbin/mt/json/JSONValue;-><init>()V

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 76
    invoke-direct {p0}, Lbin/mt/json/JSONValue;-><init>()V

    .line 77
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lbin/mt/json/JSONArray;)V
    .locals 1

    const/4 v0, 0x0

    .line 98
    invoke-direct {p0, p1, v0}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;Z)V

    return-void
.end method

.method public constructor <init>(Lbin/mt/json/JSONArray;Z)V
    .locals 0

    .line 101
    invoke-direct {p0}, Lbin/mt/json/JSONValue;-><init>()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 106
    iget-object p1, p1, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    return-void

    .line 108
    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    iget-object p1, p1, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p2, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    return-void

    .line 103
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "array is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 84
    invoke-direct {p0}, Lbin/mt/json/JSONArray;-><init>()V

    if-eqz p1, :cond_0

    .line 88
    new-instance v0, Ll/۫ܳܳ;

    invoke-direct {v0}, Ll/۫ܳܳ;-><init>()V

    .line 89
    new-instance v1, Lbin/mt/json/JSONParser;

    invoke-direct {v1, v0}, Lbin/mt/json/JSONParser;-><init>(Lbin/mt/json/JSONHandler;)V

    invoke-virtual {v1, p0, p1}, Lbin/mt/json/JSONParser;->parseArray(Lbin/mt/json/JSONArray;Ljava/lang/String;)V

    return-void

    .line 86
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "source is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static unmodifiableArray(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;
    .locals 2

    .line 123
    new-instance v0, Lbin/mt/json/JSONArray;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;Z)V

    return-object v0
.end method


# virtual methods
.method public add(D)Lbin/mt/json/JSONArray;
    .locals 1

    .line 166
    iget-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-static {p1, p2}, Lbin/mt/json/JSON;->value(D)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public add(F)Lbin/mt/json/JSONArray;
    .locals 1

    .line 155
    iget-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-static {p1}, Lbin/mt/json/JSON;->value(F)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public add(I)Lbin/mt/json/JSONArray;
    .locals 1

    .line 133
    iget-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-static {p1}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public add(J)Lbin/mt/json/JSONArray;
    .locals 1

    .line 144
    iget-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-static {p1, p2}, Lbin/mt/json/JSON;->value(J)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;
    .locals 1

    if-eqz p1, :cond_0

    .line 202
    iget-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0

    .line 200
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "value is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public add(Ljava/lang/String;)Lbin/mt/json/JSONArray;
    .locals 1

    .line 188
    iget-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-static {p1}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public add(Z)Lbin/mt/json/JSONArray;
    .locals 1

    .line 177
    iget-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-static {p1}, Lbin/mt/json/JSON;->value(Z)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public asArray()Lbin/mt/json/JSONArray;
    .locals 0

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    .line 587
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    .line 590
    :cond_2
    check-cast p1, Lbin/mt/json/JSONArray;

    .line 591
    iget-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    iget-object p1, p1, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public get(I)Lbin/mt/json/JSONValue;
    .locals 1

    .line 347
    iget-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbin/mt/json/JSONValue;

    return-object p1
.end method

.method public getBoolean(I)Z
    .locals 0

    .line 476
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result p1

    return p1
.end method

.method public getBooleanObject(I)Ljava/lang/Boolean;
    .locals 1

    .line 488
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 489
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

.method public getDouble(I)D
    .locals 2

    .line 452
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asDouble()D

    move-result-wide v0

    return-wide v0
.end method

.method public getDoubleValue(I)Ljava/lang/Double;
    .locals 2

    .line 464
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 465
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

.method public getFloat(I)F
    .locals 0

    .line 428
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asFloat()F

    move-result p1

    return p1
.end method

.method public getFloatObject(I)Ljava/lang/Float;
    .locals 1

    .line 440
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 441
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

.method public getInt(I)I
    .locals 0

    .line 380
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asInt()I

    move-result p1

    return p1
.end method

.method public getIntegerObject(I)Ljava/lang/Integer;
    .locals 1

    .line 392
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 393
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

.method public getJSONArray(I)Lbin/mt/json/JSONArray;
    .locals 0

    .line 369
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object p1

    return-object p1
.end method

.method public getJSONObject(I)Lbin/mt/json/JSONObject;
    .locals 0

    .line 358
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public getLong(I)J
    .locals 2

    .line 404
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asLong()J

    move-result-wide v0

    return-wide v0
.end method

.method public getLongObject(I)Ljava/lang/Long;
    .locals 2

    .line 416
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 417
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

.method public getString(I)Ljava/lang/String;
    .locals 1

    .line 501
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 502
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public hashCode()I
    .locals 1

    .line 565
    iget-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    return v0
.end method

.method public isArray()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 335
    iget-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2

    .line 522
    iget-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 523
    new-instance v1, Ll/ۤܳܳ;

    invoke-direct {v1, p0, v0}, Ll/ۤܳܳ;-><init>(Lbin/mt/json/JSONArray;Ljava/util/Iterator;)V

    return-object v1
.end method

.method public remove(I)Lbin/mt/json/JSONArray;
    .locals 1

    .line 316
    iget-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-object p0
.end method

.method public set(ID)Lbin/mt/json/JSONArray;
    .locals 1

    .line 258
    iget-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-static {p2, p3}, Lbin/mt/json/JSON;->value(D)Lbin/mt/json/JSONValue;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public set(IF)Lbin/mt/json/JSONArray;
    .locals 1

    .line 244
    iget-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-static {p2}, Lbin/mt/json/JSON;->value(F)Lbin/mt/json/JSONValue;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public set(II)Lbin/mt/json/JSONArray;
    .locals 1

    .line 216
    iget-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-static {p2}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public set(IJ)Lbin/mt/json/JSONArray;
    .locals 1

    .line 230
    iget-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-static {p2, p3}, Lbin/mt/json/JSON;->value(J)Lbin/mt/json/JSONValue;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public set(ILbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;
    .locals 1

    if-eqz p2, :cond_0

    .line 303
    iget-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-object p0

    .line 301
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public set(ILjava/lang/String;)Lbin/mt/json/JSONArray;
    .locals 1

    .line 286
    iget-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-static {p2}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public set(IZ)Lbin/mt/json/JSONArray;
    .locals 1

    .line 272
    iget-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-static {p2}, Lbin/mt/json/JSON;->value(Z)Lbin/mt/json/JSONValue;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public size()I
    .locals 1

    .line 326
    iget-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public values()Ljava/util/List;
    .locals 1

    .line 512
    iget-object v0, p0, Lbin/mt/json/JSONArray;->values:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public write(Ll/֫᩻ܳ;)V
    .locals 2

    .line 541
    invoke-virtual {p1}, Ll/֫᩻ܳ;->ۧ()V

    .line 542
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 543
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 544
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbin/mt/json/JSONValue;

    invoke-virtual {v1, p1}, Lbin/mt/json/JSONValue;->write(Ll/֫᩻ܳ;)V

    .line 545
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 546
    invoke-virtual {p1}, Ll/֫᩻ܳ;->ܽ()V

    .line 547
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbin/mt/json/JSONValue;

    invoke-virtual {v1, p1}, Lbin/mt/json/JSONValue;->write(Ll/֫᩻ܳ;)V

    goto :goto_0

    .line 550
    :cond_0
    invoke-virtual {p1}, Ll/֫᩻ܳ;->֫()V

    return-void
.end method
