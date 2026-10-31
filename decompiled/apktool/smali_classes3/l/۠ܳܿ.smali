.class public final Ll/۠ܳܿ;
.super Ljava/lang/Object;
.source "FAV4"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ljava/util/ArrayList;

.field public static ܽ:Ll/ۚۡ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Ll/۠ܳܿ;->ۧ:Ljava/util/ArrayList;

    .line 22
    new-instance v0, Ll/ۚۡ֫;

    invoke-direct {v0}, Ll/ۚۡ֫;-><init>()V

    sput-object v0, Ll/۠ܳܿ;->ܽ:Ll/ۚۡ֫;

    .line 25
    invoke-static {}, Ll/۠ܳܿ;->ܳ()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 8

    .line 143
    new-instance v0, Lbin/mt/json/JSONArray;

    sget-object v1, Ll/۠ܳܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v0, v2}, Lbin/mt/json/JSONArray;-><init>(I)V

    .line 144
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    if-eqz p0, :cond_0

    .line 145
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_2

    .line 148
    :cond_0
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۚܳܿ;

    .line 149
    invoke-virtual {v4}, Ll/ۚܳܿ;->֫()Ljava/util/List;

    move-result-object v5

    .line 150
    new-instance v6, Lbin/mt/json/JSONArray;

    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-direct {v6, v7}, Lbin/mt/json/JSONArray;-><init>(I)V

    .line 151
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܶܳܿ;

    .line 152
    invoke-virtual {v7}, Ll/ܶܳܿ;->ܿ()Lbin/mt/json/JSONObject;

    move-result-object v7

    invoke-virtual {v6, v7}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_1

    .line 154
    :cond_1
    new-instance v5, Lbin/mt/json/JSONObject;

    invoke-direct {v5}, Lbin/mt/json/JSONObject;-><init>()V

    const-string v7, "n"

    .line 155
    invoke-virtual {v4}, Ll/ۚܳܿ;->ۧ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v7, v4}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v4, "d"

    .line 156
    invoke-virtual {v5, v4, v6}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 157
    invoke-virtual {v0, v5}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 159
    :cond_2
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܶܳܿ;
    .locals 2

    .line 122
    new-instance v0, Ll/ܶܳܿ;

    new-instance v1, Ll/ۙᩳܿ;

    invoke-direct {v1, p1}, Ll/ۙᩳܿ;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-direct {v0, p0, v1, p1}, Ll/ܶܳܿ;-><init>(Ljava/lang/String;Ll/ۧܿܿ;Ll/ۧܿܿ;)V

    return-object v0
.end method

.method public static synthetic ֫()V
    .locals 0

    .line 0
    invoke-static {}, Ll/۠ܳܿ;->᩻()V

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;Lbin/mt/json/JSONArray;)V
    .locals 4

    .line 109
    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 110
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Ll/ܶܳܿ;->֫(Lbin/mt/json/JSONObject;)Ll/ܶܳܿ;

    move-result-object v2

    .line 111
    invoke-virtual {v2}, Ll/ܶܳܿ;->֫()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 112
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ֫(Ll/ܶ᩵ܿ;I)V
    .locals 14

    .line 174
    new-instance v0, Lbin/mt/json/JSONArray;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֡ۧ()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lbin/mt/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 175
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result p0

    const v1, 0x7f120474

    if-eqz p0, :cond_10

    const/4 p0, 0x0

    .line 178
    invoke-virtual {v0, p0}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_f

    .line 182
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 183
    invoke-virtual {v2}, Lbin/mt/json/JSONObject;->size()I

    move-result v4

    const/4 v5, 0x2

    if-ne v4, v5, :cond_3

    const-string v4, "n"

    invoke-virtual {v2, v4}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    const-string v6, "d"

    invoke-virtual {v2, v6}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 184
    new-instance p0, Lbin/mt/json/JSONArray;

    invoke-direct {p0, v0}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    .line 185
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_7

    .line 186
    invoke-virtual {p0, v2}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 187
    invoke-virtual {v7, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 188
    invoke-virtual {v7, v6}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v7

    if-eqz v8, :cond_2

    if-eqz v7, :cond_2

    .line 192
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 193
    invoke-virtual {v7}, Lbin/mt/json/JSONArray;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v10, :cond_1

    .line 194
    invoke-virtual {v7, v11}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object v12

    invoke-static {v12}, Ll/ܶܳܿ;->֫(Lbin/mt/json/JSONObject;)Ll/ܶܳܿ;

    move-result-object v12

    .line 195
    invoke-virtual {v12}, Ll/ܶܳܿ;->֫()Z

    move-result v13

    if-eqz v13, :cond_0

    .line 196
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 199
    :cond_1
    new-instance v7, Ll/ۚܳܿ;

    invoke-direct {v7, v8, v9}, Ll/ۚܳܿ;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 190
    :cond_2
    new-instance p0, Ll/᩵ۤۡ;

    invoke-direct {p0, v1}, Ll/᩵ۤۡ;-><init>(I)V

    throw p0

    .line 202
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 203
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v4

    :goto_2
    if-ge p0, v4, :cond_5

    .line 204
    invoke-virtual {v0, p0}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object v6

    invoke-static {v6}, Ll/ܶܳܿ;->֫(Lbin/mt/json/JSONObject;)Ll/ܶܳܿ;

    move-result-object v6

    .line 205
    invoke-virtual {v6}, Ll/ܶܳܿ;->֫()Z

    move-result v7

    if-eqz v7, :cond_4

    .line 208
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p0, p0, 0x1

    goto :goto_2

    .line 206
    :cond_4
    new-instance p0, Ll/᩵ۤۡ;

    invoke-direct {p0, v1}, Ll/᩵ۤۡ;-><init>(I)V

    throw p0

    .line 210
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_e

    if-nez p1, :cond_6

    const p0, 0x7f1205e1

    goto :goto_3

    :cond_6
    const p0, 0x7f120aa3

    .line 213
    :goto_3
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    .line 214
    new-instance v0, Ll/ۚܳܿ;

    invoke-direct {v0, p0, v2}, Ll/ۚܳܿ;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 216
    :cond_7
    sget-object p0, Ll/۠ܳܿ;->ۧ:Ljava/util/ArrayList;

    if-eqz p1, :cond_c

    const/4 v0, 0x1

    if-eq p1, v0, :cond_9

    if-eq p1, v5, :cond_8

    goto :goto_5

    .line 236
    :cond_8
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 237
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_5

    .line 221
    :cond_9
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚܳܿ;

    .line 223
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚܳܿ;

    .line 224
    invoke-virtual {v2}, Ll/ۚܳܿ;->ۧ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ll/ۚܳܿ;->ۧ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 226
    invoke-virtual {v2}, Ll/ۚܳܿ;->֫()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Ll/ۚܳܿ;->֫()Ljava/util/List;

    move-result-object v0

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_4

    .line 231
    :cond_b
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 218
    :cond_c
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 240
    :cond_d
    :goto_5
    new-instance p0, Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, Ll/۠ܳܿ;->ܽ:Ll/ۚۡ֫;

    invoke-virtual {p1, p0}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    .line 241
    invoke-static {}, Ll/۠ܳܿ;->᩻()V

    return-void

    .line 211
    :cond_e
    new-instance p0, Ll/᩵ۤۡ;

    invoke-direct {p0, v1}, Ll/᩵ۤۡ;-><init>(I)V

    throw p0

    .line 180
    :cond_f
    new-instance p0, Ll/᩵ۤۡ;

    invoke-direct {p0, v1}, Ll/᩵ۤۡ;-><init>(I)V

    throw p0

    .line 176
    :cond_10
    new-instance p0, Ll/᩵ۤۡ;

    invoke-direct {p0, v1}, Ll/᩵ۤۡ;-><init>(I)V

    throw p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/util/ArrayList;)V
    .locals 0

    .line 167
    invoke-static {p1}, Ll/۠ܳܿ;->֫(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܶ᩵ܿ;->ۡ(Ljava/lang/String;)V

    return-void
.end method

.method public static ۧ()Ll/ۚۡ֫;
    .locals 1

    .line 130
    sget-object v0, Ll/۠ܳܿ;->ܽ:Ll/ۚۡ֫;

    return-object v0
.end method

.method public static ܳ()V
    .locals 12

    .line 29
    sget v0, Ll/ۙ֡ᩳ;->ᩳ:I

    .line 140
    invoke-static {}, Ll/۠ܳܿ;->ᩳ()V

    .line 30
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "tfg"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 31
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "text_function"

    invoke-interface {v1, v3, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 32
    sget-object v4, Ll/۠ܳܿ;->ۧ:Ljava/util/ArrayList;

    if-eqz v0, :cond_7

    .line 33
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 34
    new-instance v6, Lbin/mt/json/JSONArray;

    invoke-direct {v6, v0}, Lbin/mt/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 35
    invoke-virtual {v6}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v0, :cond_2

    .line 36
    invoke-virtual {v6, v8}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "n"

    .line 37
    invoke-virtual {v9, v10}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "d"

    .line 38
    invoke-virtual {v9, v11}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v9

    if-eqz v10, :cond_1

    if-nez v9, :cond_0

    goto :goto_1

    .line 42
    :cond_0
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 43
    invoke-static {v11, v9}, Ll/۠ܳܿ;->֫(Ljava/util/ArrayList;Lbin/mt/json/JSONArray;)V

    .line 44
    new-instance v9, Ll/ۚܳܿ;

    invoke-direct {v9, v10, v11}, Ll/ۚܳܿ;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 46
    :cond_2
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    if-eqz v1, :cond_5

    .line 50
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 51
    new-instance v2, Lbin/mt/json/JSONArray;

    invoke-direct {v2, v1}, Lbin/mt/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Ll/۠ܳܿ;->֫(Ljava/util/ArrayList;Lbin/mt/json/JSONArray;)V

    .line 52
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    invoke-interface {v1, v3}, Ll/۬ۤۡ;->remove(Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v1

    invoke-interface {v1}, Ll/۬ۤۡ;->apply()V

    .line 53
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    .line 56
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, "backup"

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚܳܿ;

    .line 57
    invoke-virtual {v2}, Ll/ۚܳܿ;->ۧ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 58
    invoke-virtual {v2}, Ll/ۚܳܿ;->֫()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 59
    invoke-virtual {v2}, Ll/ۚܳܿ;->֫()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    .line 65
    :cond_4
    new-instance v1, Ll/ۚܳܿ;

    invoke-direct {v1, v3, v0}, Ll/ۚܳܿ;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 66
    invoke-virtual {v5, v7, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :goto_2
    const/4 v7, 0x1

    .line 71
    :cond_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 72
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    if-eqz v7, :cond_6

    .line 74
    invoke-static {}, Ll/۠ܳܿ;->᩻()V

    :cond_6
    return-void

    .line 79
    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez v1, :cond_8

    .line 118
    new-instance v1, Ll/ܶܳܿ;

    new-instance v3, Ll/ۧܿܿ;

    const/16 v5, 0x9

    invoke-direct {v3, v5}, Ll/ۧܿܿ;-><init>(I)V

    const-string v5, "\u2192"

    invoke-direct {v1, v5, v3, v2}, Ll/ܶܳܿ;-><init>(Ljava/lang/String;Ll/ۧܿܿ;Ll/ۧܿܿ;)V

    .line 81
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "/"

    .line 82
    invoke-static {v1, v1}, Ll/۠ܳܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܶܳܿ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "+"

    .line 83
    invoke-static {v1, v1}, Ll/۠ܳܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܶܳܿ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "-"

    .line 84
    invoke-static {v1, v1}, Ll/۠ܳܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܶܳܿ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "*"

    .line 85
    invoke-static {v1, v1}, Ll/۠ܳܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܶܳܿ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "="

    .line 86
    invoke-static {v1, v1}, Ll/۠ܳܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܶܳܿ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "<"

    .line 87
    invoke-static {v1, v1}, Ll/۠ܳܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܶܳܿ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, ">"

    .line 88
    invoke-static {v1, v1}, Ll/۠ܳܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܶܳܿ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "\""

    .line 89
    invoke-static {v1, v1}, Ll/۠ܳܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܶܳܿ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "\'"

    .line 90
    invoke-static {v1, v1}, Ll/۠ܳܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܶܳܿ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, ";"

    .line 91
    invoke-static {v1, v1}, Ll/۠ܳܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܶܳܿ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "|"

    .line 92
    invoke-static {v1, v1}, Ll/۠ܳܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܶܳܿ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "\\"

    .line 93
    invoke-static {v1, v1}, Ll/۠ܳܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܶܳܿ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "_"

    .line 94
    invoke-static {v1, v1}, Ll/۠ܳܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܶܳܿ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "()"

    const-string v3, "($S$T$E)"

    .line 95
    invoke-static {v1, v3}, Ll/۠ܳܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܶܳܿ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "[]"

    const-string v3, "[$S$T$E]"

    .line 96
    invoke-static {v1, v3}, Ll/۠ܳܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܶܳܿ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "{}"

    const-string v3, "{$S$T$E}"

    .line 97
    invoke-static {v1, v3}, Ll/۠ܳܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܶܳܿ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    new-instance v1, Ll/ܶܳܿ;

    new-instance v3, Ll/ۧܿܿ;

    const/16 v5, 0x16

    invoke-direct {v3, v5}, Ll/ۧܿܿ;-><init>(I)V

    const-string v5, "\u2026"

    invoke-direct {v1, v5, v3, v2}, Ll/ܶܳܿ;-><init>(Ljava/lang/String;Ll/ۧܿܿ;Ll/ۧܿܿ;)V

    .line 98
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 100
    :cond_8
    new-instance v2, Lbin/mt/json/JSONArray;

    invoke-direct {v2, v1}, Lbin/mt/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Ll/۠ܳܿ;->֫(Ljava/util/ArrayList;Lbin/mt/json/JSONArray;)V

    .line 101
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    invoke-interface {v1, v3}, Ll/۬ۤۡ;->remove(Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v1

    invoke-interface {v1}, Ll/۬ۤۡ;->apply()V

    .line 103
    :goto_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 104
    new-instance v1, Ll/ۚܳܿ;

    const v2, 0x7f120aa3

    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ll/ۚܳܿ;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    invoke-static {}, Ll/۠ܳܿ;->᩻()V

    return-void
.end method

.method public static ܽ()Ljava/util/List;
    .locals 1

    .line 126
    sget-object v0, Ll/۠ܳܿ;->ۧ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public static ܿ()V
    .locals 4

    .line 134
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Ll/۠ܳܿ;->ܽ:Ll/ۚۡ֫;

    invoke-virtual {v1, v0}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    .line 135
    new-instance v0, Ll/֨ܳܿ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-class v1, Ll/۠ܳܿ;

    const-wide/16 v2, 0xc8

    invoke-static {v0, v1, v2, v3}, Ll/֫ۨۡ;->֫(Ljava/lang/Runnable;Ljava/lang/Object;J)V

    return-void
.end method

.method public static ᩳ()V
    .locals 2

    .line 139
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Ll/۠ܳܿ;->ܽ:Ll/ۚۡ֫;

    invoke-virtual {v1, v0}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return-void
.end method

.method public static ᩻()V
    .locals 3

    .line 163
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ll/۠ܳܿ;->֫(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "tfg"

    invoke-interface {v0, v2, v1}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method
