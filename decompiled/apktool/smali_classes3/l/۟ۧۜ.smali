.class public final Ll/۟ۧۜ;
.super Ljava/lang/Object;
.source "26KG"


# static fields
.field public static final ֫:Ljava/util/HashSet;

.field public static final ۧ:Ljava/util/HashSet;


# direct methods
.method public static constructor <clinit>()V
    .locals 12

    .line 31
    new-instance v0, Ljava/util/HashSet;

    const-string v10, "string"

    const-string v11, "style"

    const-string v1, "array"

    const-string v2, "bool"

    const-string v3, "color"

    const-string v4, "dimen"

    const-string v5, "float"

    const-string v6, "fraction"

    const-string v7, "id"

    const-string v8, "integer"

    const-string v9, "plurals"

    filled-new-array/range {v1 .. v11}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Ll/۟ۧۜ;->ۧ:Ljava/util/HashSet;

    .line 34
    new-instance v0, Ljava/util/HashSet;

    const-string v5, "dynamic-attribute"

    const-string v6, "complex"

    const-string v1, "path"

    const-string v2, "reference"

    const-string v3, "dynamic-reference"

    const-string v4, "attribute"

    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Ll/۟ۧۜ;->֫:Ljava/util/HashSet;

    return-void
.end method

.method public static ֫(Ll/᩵ۘܽ;)Ljava/lang/String;
    .locals 2

    const-string v0, "name"

    .line 169
    invoke-virtual {p0, v0}, Ll/᩵ۘܽ;->֫(Ljava/lang/String;)Ll/ᩴۘܽ;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 170
    invoke-virtual {p0}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_0

    .line 173
    invoke-virtual {p0}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "INVALID_VALUE_XML"

    const-string v0, "valueXml requires a non-empty resource name without NUL."

    .line 171
    invoke-static {p0, v0}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ll/᩵ۘܽ;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 186
    invoke-virtual {p0}, Ll/᩵ۘܽ;->᩷()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type"

    .line 187
    invoke-virtual {p0, v1}, Ll/᩵ۘܽ;->֫(Ljava/lang/String;)Ll/ᩴۘܽ;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 188
    :cond_0
    invoke-virtual {p0}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object p0

    :goto_0
    const-string v1, "string-array"

    .line 189
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "integer-array"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v0

    goto :goto_2

    :cond_2
    :goto_1
    const-string v1, "array"

    .line 190
    :goto_2
    sget-object v2, Ll/۟ۧۜ;->֫:Ljava/util/HashSet;

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 191
    sget-object v3, Ll/۟ۧۜ;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v3, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    const-string p0, "Unsupported valueXml root: "

    .line 0
    invoke-static {p0, v0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "UNSUPPORTED_VALUE_XML"

    .line 192
    invoke-static {p1, p0}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_4
    :goto_3
    const-string v0, "INVALID_VALUE_XML"

    if-eqz p1, :cond_7

    if-eqz p0, :cond_6

    .line 196
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    goto :goto_4

    :cond_5
    const-string p0, "valueXml type attribute does not match the target resource type."

    .line 197
    invoke-static {v0, p0}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 199
    :cond_6
    :goto_4
    invoke-static {p1}, Ll/۟ۧۜ;->֫(Ljava/lang/String;)V

    return-object p1

    :cond_7
    if-eqz v2, :cond_d

    if-eqz p0, :cond_c

    .line 217
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_b

    const/4 p1, 0x0

    .line 218
    :goto_5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge p1, v1, :cond_10

    .line 219
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x5f

    if-eq v1, v2, :cond_a

    const/16 v2, 0x61

    if-lt v1, v2, :cond_8

    const/16 v2, 0x7a

    if-le v1, v2, :cond_a

    :cond_8
    if-lez p1, :cond_9

    .line 221
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge p1, v2, :cond_9

    const/16 v2, 0x30

    if-lt v1, v2, :cond_9

    const/16 v2, 0x39

    if-gt v1, v2, :cond_9

    goto :goto_6

    :cond_9
    const-string p0, "Resource type must contain lowercase ASCII letters, digits, or underscores, start with a letter or underscore, and not end in a digit."

    .line 222
    invoke-static {v0, p0}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_a
    :goto_6
    add-int/lit8 p1, p1, 0x1

    goto :goto_5

    :cond_b
    const-string p0, "Resource type must not be empty."

    .line 217
    invoke-static {v0, p0}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_c
    const-string p0, "This valueXml root requires a type attribute when creating a resource."

    .line 205
    invoke-static {v0, p0}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_d
    if-eqz p0, :cond_f

    .line 209
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_e

    goto :goto_7

    :cond_e
    const-string p0, "valueXml type attribute conflicts with its root element."

    invoke-static {v0, p0}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_f
    :goto_7
    move-object p0, v1

    .line 211
    :cond_10
    invoke-static {p0}, Ll/۟ۧۜ;->֫(Ljava/lang/String;)V

    return-object p0
.end method

.method public static bridge synthetic ֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(ILl/ۢ᩻ܽ;)Ll/ۘ᩻ܽ;
    .locals 4

    .line 149
    invoke-interface {p1}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘ᩻ܽ;

    .line 150
    invoke-interface {v2}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v3

    if-ne v3, p0, :cond_0

    if-nez v1, :cond_1

    move-object v1, v2

    goto :goto_0

    :cond_1
    const-string p0, "RESOURCE_TARGET_AMBIGUOUS"

    const-string p1, "Duplicate package IDs prevent adding resources safely."

    .line 151
    invoke-static {p0, p1}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_2
    if-nez v1, :cond_5

    .line 156
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p0

    .line 157
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 158
    invoke-interface {p1}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ᩻ܽ;

    .line 159
    invoke-interface {v1}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "0x"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v1}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v1

    invoke-static {v1}, Ll/ۡᩳۜ;->֫(I)Ljava/lang/String;

    move-result-object v1

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    goto :goto_1

    :cond_4
    const-string p1, "RESOURCE_PACKAGE_NOT_FOUND"

    const-string v0, "Resource package not found; creating packages is not supported."

    .line 161
    invoke-static {p1, v0}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 162
    iget-object v0, p1, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v1, "availablePackageIds"

    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 163
    throw p1

    :cond_5
    return-object v1
.end method

.method public static ֫(Ljava/lang/String;Ll/ۘ᩻ܽ;)Ll/᩸ܽܽ;
    .locals 3

    const-string v0, "default"

    const-string v1, "Use canonical variant: "

    .line 234
    :try_start_0
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, ""

    goto :goto_0

    :cond_0
    move-object v2, p0

    :goto_0
    invoke-interface {p1}, Ll/ۘ᩻ܽ;->֫ۧ()Ll/ۤܽܽ;

    move-result-object p1

    invoke-static {v2, p1}, Ll/᩸ܽܽ;->֫(Ljava/lang/String;Ll/ۤܽܽ;)Ll/᩸ܽܽ;

    move-result-object p1

    .line 235
    invoke-virtual {p1}, Ll/᩸ܽܽ;->ܽ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ll/᩸ܽܽ;->ܽ()Ljava/lang/String;

    move-result-object v0

    .line 236
    :goto_1
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    return-object p1

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 239
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    const-string p0, "Invalid resource variant."

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    :goto_2
    const-string p1, "INVALID_RESOURCE_VARIANT"

    invoke-static {p1, p0}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ll/ۡᩳۜ;Ll/ܶ᩻ۜ;)Ll/᩺ۧۜ;
    .locals 35

    move-object/from16 v0, p1

    .line 42
    iget-object v0, v0, Ll/ܶ᩻ۜ;->֫:Ljava/util/ArrayList;

    const-string v1, "variant"

    const-string v2, "resource"

    invoke-virtual/range {p0 .. p0}, Ll/ۡᩳۜ;->ۧ()Ll/᩹ܽۜ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩹ܽۜ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v3

    .line 43
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 44
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 45
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 46
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    const/4 v8, 0x0

    .line 47
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v8, v9, :cond_1c

    .line 48
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/֨᩻ۜ;

    .line 49
    iget-object v10, v9, Ll/֨᩻ۜ;->ܽ:Ljava/lang/String;

    iget-object v15, v9, Ll/֨᩻ۜ;->֫:Ljava/lang/String;

    iget-object v14, v9, Ll/֨᩻ۜ;->ᩳ:Ljava/util/ArrayList;

    .line 53
    :try_start_0
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v11
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_b

    const-string v13, "INVALID_ARGUMENT"

    if-nez v11, :cond_19

    .line 54
    :try_start_1
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    const/16 v16, 0x18

    const/16 v12, 0x10

    if-eqz v11, :cond_0

    iget v9, v9, Ll/֨᩻ۜ;->ۧ:I

    goto :goto_1

    :cond_0
    const/4 v9, 0x2

    .line 55
    invoke-virtual {v10, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v12}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v11

    ushr-long v11, v11, v16

    long-to-int v9, v11

    .line 56
    :goto_1
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v4, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۛۧۜ;

    if-nez v11, :cond_1

    .line 58
    new-instance v11, Ll/ۛۧۜ;

    invoke-static {v9, v3}, Ll/۟ۧۜ;->֫(ILl/ۢ᩻ܽ;)Ll/ۘ᩻ܽ;

    move-result-object v12

    invoke-direct {v11, v12}, Ll/ۛۧۜ;-><init>(Ll/ۘ᩻ܽ;)V

    .line 59
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v4, v9, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :goto_2
    move-object/from16 v17, v10

    :goto_3
    move-object/from16 v31, v14

    goto/16 :goto_13

    :cond_1
    :goto_4
    move-object v12, v11

    .line 64
    iget v9, v12, Ll/ۛۧۜ;->֫:I

    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11
    :try_end_1
    .catch Ll/ۗۛ᩻; {:try_start_1 .. :try_end_1} :catch_b

    move-object/from16 p1, v0

    const-string v0, "RESOURCE_BATCH_CONFLICT"

    move-object/from16 v18, v2

    const-string v2, "INVALID_VALUE_XML"

    if-eqz v11, :cond_b

    const/4 v11, 0x0

    .line 66
    :try_start_2
    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/۠᩻ۜ;

    iget-object v11, v11, Ll/۠᩻ۜ;->֫:Ljava/lang/String;

    invoke-static {v11}, Ll/ܰᩳۜ;->ܳ(Ljava/lang/String;)Ll/᩵ۘܽ;

    move-result-object v11

    move-object/from16 v19, v3

    const/4 v3, 0x0

    .line 67
    invoke-static {v11, v3}, Ll/۟ۧۜ;->֫(Ll/᩵ۘܽ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 68
    invoke-static {v11}, Ll/۟ۧۜ;->֫(Ll/᩵ۘܽ;)Ljava/lang/String;

    move-result-object v11

    const/16 v16, 0x0

    move-object/from16 v20, v4

    move-object/from16 v16, v13

    const/4 v4, 0x0

    .line 177
    :goto_5
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v13

    if-ge v4, v13, :cond_7

    .line 178
    invoke-virtual {v11, v4}, Ljava/lang/String;->charAt(I)C

    move-result v13

    move-object/from16 v21, v6

    const/16 v6, 0x5f

    if-eq v13, v6, :cond_6

    const/16 v6, 0x61

    if-lt v13, v6, :cond_2

    const/16 v6, 0x7a

    if-le v13, v6, :cond_6

    :cond_2
    const/16 v6, 0x41

    if-lt v13, v6, :cond_3

    const/16 v6, 0x5a

    if-le v13, v6, :cond_6

    :cond_3
    if-lez v4, :cond_5

    const/16 v6, 0x30

    if-lt v13, v6, :cond_4

    const/16 v6, 0x39

    if-le v13, v6, :cond_6

    :cond_4
    const/16 v6, 0x2e

    if-ne v13, v6, :cond_5

    goto :goto_6

    :cond_5
    const-string v0, "New resource names must start with a letter or underscore and contain only letters, digits, underscores, or dots."

    .line 181
    invoke-static {v2, v0}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_6
    :goto_6
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v6, v21

    goto :goto_5

    :cond_7
    move-object/from16 v21, v6

    .line 70
    invoke-virtual {v12, v3}, Ll/ۛۧۜ;->֫(Ljava/lang/String;)Ll/ܰۧۜ;

    move-result-object v3

    .line 71
    iget-object v4, v3, Ll/ܰۧۜ;->ᩳ:Ljava/util/HashMap;

    iget-object v6, v3, Ll/ܰۧۜ;->ܳ:Ljava/util/HashSet;

    invoke-virtual {v4, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_9

    .line 73
    invoke-virtual {v6, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    const-string v1, "Multiple adds create the same resource type/name. Combine its variants into one resource add."

    .line 74
    invoke-static {v0, v1}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_2
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_1

    :cond_8
    shl-int/lit8 v0, v9, 0x18

    .line 77
    :try_start_3
    iget v1, v3, Ll/ܰۧۜ;->ۧ:I

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v1

    or-int/2addr v0, v1

    .line 727
    invoke-static {v0}, Ll/ۡᩳۜ;->֫(I)Ljava/lang/String;

    move-result-object v10

    const-string v0, "RESOURCE_ALREADY_EXISTS"

    const-string v1, "Resource type/name already exists; read or edit the existing resource."

    .line 78
    invoke-static {v0, v1}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_3
    .catch Ll/ۗۛ᩻; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    move-object/from16 v31, v14

    goto/16 :goto_12

    .line 80
    :cond_9
    :try_start_4
    iget v4, v3, Ll/ܰۧۜ;->ܿ:I

    const v13, 0xffff

    if-gt v4, v13, :cond_a

    add-int/lit8 v13, v4, 0x1

    .line 81
    iput v13, v3, Ll/ܰۧۜ;->ܿ:I

    .line 82
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v6, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 83
    iget-object v6, v3, Ll/ܰۧۜ;->ᩳ:Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v6, v11, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    iget-object v6, v3, Ll/ܰۧۜ;->֫:Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v6, v13, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v6, 0x0

    const/4 v13, 0x0

    move-object/from16 v17, v10

    move-object v13, v11

    const/16 v28, 0x0

    goto :goto_9

    :cond_a
    const-string v0, "RESOURCE_ID_EXHAUSTED"

    const-string v1, "No unused entry ID remains in this resource type."

    .line 80
    invoke-static {v0, v1}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_4
    .catch Ll/ۗۛ᩻; {:try_start_4 .. :try_end_4} :catch_1

    :catch_1
    move-exception v0

    const/4 v1, 0x0

    move-object/from16 v17, v10

    move-object/from16 v31, v14

    goto/16 :goto_14

    :cond_b
    move-object/from16 v19, v3

    move-object/from16 v20, v4

    move-object/from16 v21, v6

    move-object/from16 v16, v13

    const/4 v3, 0x2

    .line 86
    :try_start_5
    invoke-virtual {v10, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v3

    long-to-int v4, v3

    ushr-int/lit8 v3, v4, 0x10

    and-int/lit16 v3, v3, 0xff

    .line 87
    invoke-virtual {v12, v3}, Ll/ۛۧۜ;->֫(I)Ll/ܰۧۜ;

    move-result-object v3

    const v6, 0xffff

    and-int/2addr v4, v6

    if-nez v3, :cond_c

    const/4 v6, 0x0

    :goto_7
    move-object v11, v6

    goto :goto_8

    .line 89
    :cond_c
    iget-object v6, v3, Ll/ܰۧۜ;->֫:Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v6, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;
    :try_end_5
    .catch Ll/ۗۛ᩻; {:try_start_5 .. :try_end_5} :catch_b

    goto :goto_7

    :goto_8
    const-string v6, "RESOURCE_NOT_FOUND"

    if-eqz v11, :cond_18

    .line 91
    :try_start_6
    iget-object v13, v3, Ll/ܰۧۜ;->ܳ:Ljava/util/HashSet;
    :try_end_6
    .catch Ll/ۗۛ᩻; {:try_start_6 .. :try_end_6} :catch_b

    move-object/from16 v17, v10

    :try_start_7
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v13, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v10
    :try_end_7
    .catch Ll/ۗۛ᩻; {:try_start_7 .. :try_end_7} :catch_a

    if-nez v10, :cond_17

    .line 95
    :try_start_8
    iget-object v6, v3, Ll/ܰۧۜ;->ܽ:Ljava/lang/String;

    invoke-static {v6}, Ll/۟ۧۜ;->֫(Ljava/lang/String;)V
    :try_end_8
    .catch Ll/ۗۛ᩻; {:try_start_8 .. :try_end_8} :catch_9

    const/4 v6, -0x1

    const/4 v13, 0x1

    move-object v13, v11

    const/16 v28, 0x1

    .line 97
    :goto_9
    :try_start_9
    iget-object v11, v3, Ll/ܰۧۜ;->᩻:Ljava/util/HashSet;

    iget-object v10, v3, Ll/ܰۧۜ;->ܽ:Ljava/lang/String;
    :try_end_9
    .catch Ll/ۗۛ᩻; {:try_start_9 .. :try_end_9} :catch_8

    shl-int/lit8 v9, v9, 0x18

    move/from16 v22, v6

    :try_start_a
    iget v6, v3, Ll/ܰۧۜ;->ۧ:I

    shl-int/lit8 v6, v6, 0x10

    or-int/2addr v6, v9

    or-int/2addr v6, v4

    .line 727
    invoke-static {v6}, Ll/ۡᩳۜ;->֫(I)Ljava/lang/String;

    move-result-object v9
    :try_end_a
    .catch Ll/ۗۛ᩻; {:try_start_a .. :try_end_a} :catch_7

    move-object/from16 v29, v2

    .line 99
    :try_start_b
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move/from16 v30, v6

    .line 100
    new-instance v6, Ll/ۤۜۜ;

    invoke-direct {v6, v8, v9, v2}, Ll/ۤۜۜ;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_b
    .catch Ll/ۗۛ᩻; {:try_start_b .. :try_end_b} :catch_6

    const/4 v6, 0x0

    move-object/from16 v17, v9

    .line 101
    :goto_a
    :try_start_c
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v6, v9, :cond_16

    .line 102
    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/۠᩻ۜ;
    :try_end_c
    .catch Ll/ۗۛ᩻; {:try_start_c .. :try_end_c} :catch_5

    move-object/from16 v31, v14

    .line 103
    :try_start_d
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v14

    move-object/from16 v32, v7

    const/16 v7, 0xc8

    if-ge v14, v7, :cond_15

    .line 104
    iget-object v7, v9, Ll/۠᩻ۜ;->֫:Ljava/lang/String;

    iget-object v14, v9, Ll/۠᩻ۜ;->ۧ:Ljava/lang/String;

    invoke-static {v7}, Ll/ܰᩳۜ;->ܳ(Ljava/lang/String;)Ll/᩵ۘܽ;

    move-result-object v7

    move-object/from16 v33, v9

    .line 105
    invoke-static {v7}, Ll/۟ۧۜ;->֫(Ll/᩵ۘܽ;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_14

    .line 106
    invoke-static {v10}, Ll/ۖᩳۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 107
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22
    :try_end_d
    .catch Ll/ۗۛ᩻; {:try_start_d .. :try_end_d} :catch_3

    if-eqz v22, :cond_d

    :try_start_e
    invoke-static {v10}, Ll/ۖᩳۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22
    :try_end_e
    .catch Ll/ۗۛ᩻; {:try_start_e .. :try_end_e} :catch_2

    goto :goto_b

    :catch_2
    move-exception v0

    goto/16 :goto_15

    :cond_d
    const/16 v22, 0x0

    :goto_b
    move-object/from16 v34, v5

    move-object/from16 v5, v22

    .line 106
    :try_start_f
    invoke-static {v7, v5}, Ll/۟ۧۜ;->֫(Ll/᩵ۘܽ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_13

    .line 110
    iget-object v5, v12, Ll/ۛۧۜ;->ܽ:Ll/ۘ᩻ܽ;

    invoke-static {v14, v5}, Ll/۟ۧۜ;->֫(Ljava/lang/String;Ll/ۘ᩻ܽ;)Ll/᩸ܽܽ;

    move-result-object v26

    .line 111
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "\n"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 112
    iget-object v7, v3, Ll/ܰۧۜ;->᩷:Ljava/util/HashSet;

    invoke-virtual {v7, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v7
    :try_end_f
    .catch Ll/ۗۛ᩻; {:try_start_f .. :try_end_f} :catch_3

    if-nez v7, :cond_f

    .line 113
    :try_start_10
    invoke-virtual {v11, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "Multiple values in this request add the same resource variant. Remove duplicate values."

    .line 114
    invoke-static {v0, v1}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_e
    const-string v0, "RESOURCE_VARIANT_ALREADY_EXISTS"

    const-string v1, "Resource variant already exists; use mt_apk_resource_edit to change it."

    .line 116
    invoke-static {v0, v1}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_10
    .catch Ll/ۗۛ᩻; {:try_start_10 .. :try_end_10} :catch_2

    .line 118
    :cond_f
    :try_start_11
    invoke-virtual {v11, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 119
    iget-object v5, v12, Ll/ۛۧۜ;->ܽ:Ll/ۘ᩻ܽ;

    .line 120
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7
    :try_end_11
    .catch Ll/ۗۛ᩻; {:try_start_11 .. :try_end_11} :catch_3

    if-eqz v7, :cond_12

    .line 340
    :try_start_12
    iget-object v7, v3, Ll/ܰۧۜ;->ۜ:Ll/֡᩻ܽ;

    if-eqz v7, :cond_11

    .line 341
    invoke-interface {v7}, Ll/֡᩻ܽ;->ܽۧ()Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_10
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_11

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۜ᩻ܽ;

    .line 342
    invoke-interface {v9, v4}, Ll/ۜ᩻ܽ;->ۧ(I)Ll/᩷᩻ܽ;

    move-result-object v9
    :try_end_12
    .catch Ll/ۗۛ᩻; {:try_start_12 .. :try_end_12} :catch_2

    if-eqz v9, :cond_10

    goto :goto_c

    :cond_11
    const/4 v9, 0x0

    :goto_c
    move-object/from16 v27, v9

    goto :goto_d

    :cond_12
    const/4 v7, 0x0

    move-object/from16 v27, v7

    :goto_d
    move-object/from16 v22, v5

    move-object/from16 v23, v3

    move/from16 v24, v4

    move-object/from16 v25, v13

    .line 119
    :try_start_13
    invoke-static/range {v22 .. v27}, Ll/۟ۧۜ;->֫(Ll/ۘ᩻ܽ;Ll/ܰۧۜ;ILjava/lang/String;Ll/᩸ܽܽ;Ll/᩷᩻ܽ;)[B

    move-result-object v5

    move/from16 v7, v30

    .line 121
    invoke-static {v7, v14, v10, v13, v5}, Ll/ۘᩳۜ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)Ll/ۘᩳۜ;

    move-result-object v5

    move-object/from16 v14, v21

    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    new-instance v5, Ll/ۨۧۜ;

    iget-object v9, v3, Ll/ܰۧۜ;->ܽ:Ljava/lang/String;
    :try_end_13
    .catch Ll/ۗۛ᩻; {:try_start_13 .. :try_end_13} :catch_3

    move-object/from16 v22, v9

    move-object/from16 v21, v17

    move-object/from16 v17, v33

    move-object v9, v5

    move-object/from16 v23, v10

    move v10, v8

    move-object/from16 v24, v11

    move v11, v6

    move-object/from16 v25, v12

    move v12, v7

    move-object/from16 v26, v0

    move-object/from16 v27, v13

    move-object/from16 v0, v16

    move-object/from16 v13, v22

    move-object/from16 v30, v1

    move-object v1, v14

    move-object/from16 v14, v27

    move-object/from16 v22, v15

    move-object/from16 v15, v17

    move-object/from16 v16, v2

    move/from16 v17, v28

    :try_start_14
    invoke-direct/range {v9 .. v17}, Ll/ۨۧۜ;-><init>(IIILjava/lang/String;Ljava/lang/String;Ll/۠᩻ۜ;Ljava/util/ArrayList;Z)V

    move-object/from16 v9, v34

    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v16, v0

    move-object v5, v9

    move-object/from16 v17, v21

    move-object/from16 v15, v22

    move-object/from16 v10, v23

    move-object/from16 v11, v24

    move-object/from16 v12, v25

    move-object/from16 v0, v26

    move-object/from16 v13, v27

    move-object/from16 v14, v31

    move-object/from16 v21, v1

    move-object/from16 v1, v30

    move/from16 v30, v7

    move-object/from16 v7, v32

    goto/16 :goto_a

    :catch_3
    move-exception v0

    :goto_e
    move-object/from16 v21, v17

    goto :goto_f

    :cond_13
    move-object/from16 v21, v17

    const-string v0, "valueXml type does not match the target resource type."

    move-object/from16 v1, v29

    .line 108
    invoke-static {v1, v0}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_14
    move-object/from16 v21, v17

    move-object/from16 v1, v29

    const-string v0, "All values must keep the target resource name."

    .line 105
    invoke-static {v1, v0}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_15
    move-object/from16 v0, v16

    move-object/from16 v21, v17

    const-string v1, "A request supports at most 200 resource values."

    .line 103
    invoke-static {v0, v1}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_14
    .catch Ll/ۗۛ᩻; {:try_start_14 .. :try_end_14} :catch_4

    :catch_4
    move-exception v0

    goto :goto_f

    :cond_16
    move-object/from16 v30, v1

    move-object v9, v5

    move-object/from16 v32, v7

    move-object/from16 v1, v21

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v0, p1

    move-object v6, v1

    move-object/from16 v2, v18

    move-object/from16 v3, v19

    move-object/from16 v4, v20

    move-object/from16 v1, v30

    goto/16 :goto_0

    :catch_5
    move-exception v0

    move-object/from16 v31, v14

    goto :goto_e

    :catch_6
    move-exception v0

    move-object/from16 v21, v9

    move-object/from16 v31, v14

    move/from16 v6, v22

    :goto_f
    move-object/from16 v10, v21

    goto :goto_16

    :catch_7
    move-exception v0

    :goto_10
    move-object/from16 v31, v14

    goto :goto_11

    :catch_8
    move-exception v0

    move/from16 v22, v6

    goto :goto_10

    :goto_11
    move-object/from16 v10, v17

    move/from16 v6, v22

    goto :goto_16

    :catch_9
    move-exception v0

    move-object/from16 v31, v14

    const/4 v1, -0x1

    move-object/from16 v10, v17

    :goto_12
    const/16 v28, 0x1

    move v6, v1

    goto :goto_16

    :cond_17
    move-object/from16 v31, v14

    :try_start_15
    const-string v0, "Variant targets must exist before this request. Put all variants of a new resource in its resource add."

    .line 92
    invoke-static {v6, v0}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_a
    move-exception v0

    goto/16 :goto_3

    :cond_18
    move-object/from16 v17, v10

    move-object/from16 v31, v14

    const-string v0, "Resource not found."

    .line 90
    invoke-static {v6, v0}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_b
    move-exception v0

    goto/16 :goto_2

    :cond_19
    move-object/from16 v17, v10

    move-object v0, v13

    move-object/from16 v31, v14

    const-string v1, "Each add requires at least one value."

    .line 53
    invoke-static {v0, v1}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_15
    .catch Ll/ۗۛ᩻; {:try_start_15 .. :try_end_15} :catch_c

    :catch_c
    move-exception v0

    :goto_13
    const/4 v1, -0x1

    :goto_14
    const/16 v28, 0x0

    move v6, v1

    :goto_15
    move-object/from16 v10, v17

    :goto_16
    if-ltz v6, :cond_1a

    .line 125
    invoke-virtual/range {v31 .. v31}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v6, v1, :cond_1a

    move-object/from16 v1, v31

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠᩻ۜ;

    iget-object v1, v1, Ll/۠᩻ۜ;->ۧ:Ljava/lang/String;

    goto :goto_17

    :cond_1a
    const/4 v1, 0x0

    :goto_17
    if-eqz v28, :cond_1b

    goto :goto_18

    :cond_1b
    const/4 v10, 0x0

    .line 126
    :goto_18
    invoke-static {v0, v8, v6, v10, v1}, Ll/۟ۧۜ;->֫(Ll/ۗۛ᩻;IILjava/lang/String;Ljava/lang/String;)V

    throw v0

    :cond_1c
    move-object/from16 v0, p0

    move-object v9, v5

    move-object v1, v6

    move-object/from16 v32, v7

    .line 129
    invoke-virtual {v0, v1}, Ll/ۡᩳۜ;->֫(Ljava/util/ArrayList;)Ll/᩹ܽۜ;

    move-result-object v0

    .line 130
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 131
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_19
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۨۧۜ;

    .line 133
    :try_start_16
    iget v4, v3, Ll/ۨۧۜ;->ᩳ:I

    iget-object v5, v3, Ll/ۨۧۜ;->᩻:Ll/۠᩻ۜ;

    iget-object v6, v5, Ll/۠᩻ۜ;->ۧ:Ljava/lang/String;

    iget-object v5, v5, Ll/۠᩻ۜ;->֫:Ljava/lang/String;

    invoke-static {v0, v4, v6, v5}, Ll/ܰᩳۜ;->֫(Ll/᩹ܽۜ;ILjava/lang/String;Ljava/lang/String;)[B

    move-result-object v4

    .line 135
    iget v5, v3, Ll/ۨۧۜ;->ᩳ:I

    iget-object v7, v3, Ll/ۨۧۜ;->ܳ:Ljava/lang/String;

    iget-object v8, v3, Ll/ۨۧۜ;->ۧ:Ljava/lang/String;

    invoke-static {v5, v6, v7, v8, v4}, Ll/ۘᩳۜ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)Ll/ۘᩳۜ;

    move-result-object v4

    .line 137
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    iget-object v5, v3, Ll/ۨۧۜ;->ܿ:Ljava/util/ArrayList;

    new-instance v7, Ll/ۨۜۜ;

    .line 256
    iget-object v4, v4, Ll/ۘᩳۜ;->ᩳ:Ljava/lang/String;

    .line 138
    invoke-direct {v7, v6, v4}, Ll/ۨۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_16
    .catch Ll/ۗۛ᩻; {:try_start_16 .. :try_end_16} :catch_d

    goto :goto_19

    :catch_d
    move-exception v0

    .line 140
    iget v1, v3, Ll/ۨۧۜ;->֫:I

    iget v2, v3, Ll/ۨۧۜ;->ۜ:I

    iget-boolean v4, v3, Ll/ۨۧۜ;->ܽ:Z

    if-eqz v4, :cond_1d

    .line 141
    iget v4, v3, Ll/ۨۧۜ;->ᩳ:I

    .line 727
    invoke-static {v4}, Ll/ۡᩳۜ;->֫(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1a

    :cond_1d
    const/4 v4, 0x0

    .line 141
    :goto_1a
    iget-object v3, v3, Ll/ۨۧۜ;->᩻:Ll/۠᩻ۜ;

    iget-object v3, v3, Ll/۠᩻ۜ;->ۧ:Ljava/lang/String;

    .line 140
    invoke-static {v0, v1, v2, v4, v3}, Ll/۟ۧۜ;->֫(Ll/ۗۛ᩻;IILjava/lang/String;Ljava/lang/String;)V

    throw v0

    .line 144
    :cond_1e
    new-instance v0, Ll/᩺ۧۜ;

    move-object/from16 v2, v32

    invoke-direct {v0, v1, v2}, Ll/᩺ۧۜ;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 1

    const-string v0, "attr"

    .line 227
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "^attr-private"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    const-string p0, "UNSUPPORTED_VALUE_XML"

    const-string v0, "Adding attr definitions or their variants is not supported."

    .line 228
    invoke-static {p0, v0}, Ll/۟ۧۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ll/ۗۛ᩻;IILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 266
    iget-object p0, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v0, "failedAddIndex"

    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    if-gez p2, :cond_0

    .line 267
    sget-object p1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object p1

    :goto_0
    const-string p2, "failedValueIndex"

    invoke-virtual {p0, p2, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    if-nez p3, :cond_1

    .line 268
    sget-object p1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_1

    :cond_1
    const-string p1, "resource:"

    invoke-virtual {p1, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    :goto_1
    const-string p2, "locator"

    invoke-virtual {p0, p2, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    if-nez p4, :cond_2

    .line 269
    sget-object p1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_2

    :cond_2
    invoke-static {p4}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    :goto_2
    const-string p2, "variant"

    invoke-virtual {p0, p2, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-void
.end method

.method public static ֫(Ll/ۘ᩻ܽ;Ll/ܰۧۜ;ILjava/lang/String;Ll/᩸ܽܽ;Ll/᩷᩻ܽ;)[B
    .locals 3

    .line 245
    invoke-static {}, Ll/ۡܿܽ;->᩵()Ll/ۡܿܽ;

    move-result-object v0

    .line 246
    invoke-interface {p0}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v1

    invoke-interface {p0}, Ll/ۘ᩻ܽ;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ll/ۡܿܽ;->֫(ILjava/lang/String;)Ll/۠ܿܽ;

    move-result-object v0

    .line 247
    invoke-interface {p0}, Ll/ۘ᩻ܽ;->֫ۧ()Ll/ۤܽܽ;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/۠ܿܽ;->֫(Ll/ۤܽܽ;)V

    .line 248
    iget-object p0, p1, Ll/ܰۧۜ;->ܽ:Ljava/lang/String;

    iget p1, p1, Ll/ܰۧۜ;->ۧ:I

    invoke-virtual {v0, p1, p0}, Ll/۠ܿܽ;->ۧ(ILjava/lang/String;)Ll/᩶ܿܽ;

    move-result-object p0

    const/4 p1, 0x0

    .line 102
    invoke-virtual {p0, p2, p3, p1}, Ll/᩶ܿܽ;->֫(ILjava/lang/String;Z)V

    .line 250
    invoke-virtual {p0, p4}, Ll/᩶ܿܽ;->֫(Ll/᩸ܽܽ;)Ll/ۖܿܽ;

    move-result-object p0

    .line 251
    invoke-virtual {p0, p2}, Ll/ۖܿܽ;->֫(I)Ll/ᩴܿܽ;

    move-result-object p0

    .line 252
    invoke-virtual {p0}, Ll/ᩴܿܽ;->۬()V

    if-eqz p5, :cond_0

    .line 254
    invoke-interface {p5}, Ll/᩷᩻ܽ;->ۛ֫()Z

    move-result p1

    invoke-virtual {p0, p1}, Ll/ᩴܿܽ;->ܽ(Z)V

    .line 255
    invoke-interface {p5}, Ll/᩷᩻ܽ;->᩸()Z

    move-result p1

    invoke-virtual {p0, p1}, Ll/ᩴܿܽ;->ᩳ(Z)V

    .line 257
    :cond_0
    invoke-static {p0}, Ll/᩻ܽۜ;->֫(Ll/᩷᩻ܽ;)[B

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 2

    const-string v0, "warning"

    const/4 v1, 0x0

    .line 261
    invoke-static {v1, p0, p1, v0}, Ll/ۗۛ᩻;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method
