.class public final Ll/᩶ۢ᩵;
.super Ll/ۤۜ᩵;
.source "K9YL"

# interfaces
.implements Ll/ܽ᩷᩵;
.implements Ll/ۗ᩷᩵;


# static fields
.field public static ᩳ֫:Ll/֫᩻֨;


# instance fields
.field public ֫֫:Ljava/lang/String;

.field public transient ۗ:Ljava/lang/String;

.field public final ۙ:Ljava/util/Set;

.field public ۛ:I

.field public final ۟:Ll/᩹ۢ᩵;

.field public ۤ:I

.field public ۧ֫:[B

.field public ۨ:Ljava/util/Hashtable;

.field public ۫:Z

.field public ۬:Ljava/lang/String;

.field public ܰ:Ljava/lang/String;

.field public ܽ֫:I

.field public final ᩶:Ljava/util/Set;

.field public ᩸:Ljava/lang/String;

.field public ᩹:Ljava/lang/String;

.field public ᩺:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 45
    const-class v0, Ll/᩶ۢ᩵;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/String;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/᩶ۢ᩵;->ᩳ֫:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/HashMap;Z)V
    .locals 7

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p2

    move v5, p3

    .line 176
    invoke-direct/range {v0 .. v6}, Ll/᩶ۢ᩵;-><init>(Ljava/util/Map;IIIZ[B)V

    .line 179
    :try_start_0
    invoke-static {p1}, Ll/ܺۡ᩵;->֫(Ljava/lang/String;)[B

    move-result-object p2

    iput-object p2, p0, Ll/᩶ۢ᩵;->ۧ֫:[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 184
    iput-object p1, p0, Ll/᩶ۢ᩵;->ܰ:Ljava/lang/String;

    return-void

    :catch_0
    move-exception p1

    .line 181
    new-instance p2, Ljava/lang/RuntimeException;

    const-string p3, "Unexpected exception: "

    .line 0
    invoke-static {p3, p1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/io/IOException;)Ljava/lang/String;

    move-result-object p1

    .line 181
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public constructor <init>(Ljava/util/Map;IIIZ[B)V
    .locals 1

    .line 187
    invoke-direct {p0}, Ll/ۤۜ᩵;-><init>()V

    .line 188
    invoke-static {p1}, Ll/᩶ۢ᩵;->֫(Ljava/util/Map;)Ljava/util/HashMap;

    move-result-object p1

    .line 190
    sget-object v0, Ll/۫ۜ᩵;->᩶:Ll/۫ۜ᩵;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Ll/᩶ۢ᩵;->᩹:Ljava/lang/String;

    .line 191
    sget-object v0, Ll/۫ۜ᩵;->ۗ:Ll/۫ۜ᩵;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Ll/᩶ۢ᩵;->᩺:Ljava/lang/String;

    .line 192
    sget-object v0, Ll/۫ۜ᩵;->᩹:Ll/۫ۜ᩵;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Ll/᩶ۢ᩵;->᩸:Ljava/lang/String;

    .line 193
    sget-object v0, Ll/۫ۜ᩵;->ۙ:Ll/۫ۜ᩵;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Ll/᩶ۢ᩵;->۬:Ljava/lang/String;

    .line 194
    sget-object v0, Ll/۫ۜ᩵;->۬:Ll/۫ۜ᩵;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Ll/᩶ۢ᩵;->֫֫:Ljava/lang/String;

    .line 196
    iput p2, p0, Ll/᩶ۢ᩵;->ۤ:I

    .line 197
    iput p3, p0, Ll/᩶ۢ᩵;->ܽ֫:I

    .line 198
    iput p4, p0, Ll/᩶ۢ᩵;->ۛ:I

    .line 199
    iput-object p6, p0, Ll/᩶ۢ᩵;->ۧ֫:[B

    .line 201
    new-instance p1, Ll/᩹ۢ᩵;

    invoke-direct {p1, p0}, Ll/᩹ۢ᩵;-><init>(Ll/᩶ۢ᩵;)V

    iput-object p1, p0, Ll/᩶ۢ᩵;->۟:Ll/᩹ۢ᩵;

    .line 202
    iput-boolean p5, p0, Ll/᩶ۢ᩵;->۫:Z

    .line 203
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {p1}, Ll/᩶۬ᩴ;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Ll/᩶ۢ᩵;->᩶:Ljava/util/Set;

    .line 204
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {p1}, Ll/᩶۬ᩴ;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Ll/᩶ۢ᩵;->ۙ:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ll/ۤۜ᩵;)V
    .locals 6

    .line 212
    invoke-direct {p0}, Ll/ۤۜ᩵;-><init>()V

    .line 213
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {v0}, Ll/᩶۬ᩴ;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ۢ᩵;->᩶:Ljava/util/Set;

    .line 214
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {v0}, Ll/᩶۬ᩴ;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ۢ᩵;->ۙ:Ljava/util/Set;

    if-eqz p1, :cond_1

    .line 216
    invoke-virtual {p1}, Ll/ۤۜ᩵;->ܽ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ۢ᩵;->᩹:Ljava/lang/String;

    .line 217
    invoke-virtual {p1}, Ll/ۤۜ᩵;->ۖ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ۢ᩵;->᩺:Ljava/lang/String;

    .line 218
    invoke-virtual {p1}, Ll/ۤۜ᩵;->֫()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ۢ᩵;->᩸:Ljava/lang/String;

    .line 219
    invoke-virtual {p1}, Ll/ۤۜ᩵;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ۢ᩵;->۬:Ljava/lang/String;

    .line 220
    invoke-virtual {p1}, Ll/ۤۜ᩵;->֡()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ۢ᩵;->֫֫:Ljava/lang/String;

    .line 221
    invoke-virtual {p1}, Ll/ۤۜ᩵;->ۡ()I

    move-result v0

    iput v0, p0, Ll/᩶ۢ᩵;->ۤ:I

    .line 222
    invoke-virtual {p1}, Ll/ۤۜ᩵;->۠()I

    move-result v0

    iput v0, p0, Ll/᩶ۢ᩵;->ܽ֫:I

    .line 223
    invoke-virtual {p1}, Ll/ۤۜ᩵;->ܺ()I

    move-result v0

    iput v0, p0, Ll/᩶ۢ᩵;->ۛ:I

    .line 224
    invoke-virtual {p1}, Ll/ۤۜ᩵;->ۚ()[B

    move-result-object v0

    iput-object v0, p0, Ll/᩶ۢ᩵;->ۧ֫:[B

    .line 225
    invoke-virtual {p1}, Ll/ۤۜ᩵;->᩹()Z

    move-result v0

    iput-boolean v0, p0, Ll/᩶ۢ᩵;->۫:Z

    .line 226
    invoke-virtual {p1}, Ll/ۤۜ᩵;->ۜ()[Ljava/net/Inet6Address;

    move-result-object v0

    .line 227
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    .line 228
    iget-object v5, p0, Ll/᩶ۢ᩵;->ۙ:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 230
    :cond_0
    invoke-virtual {p1}, Ll/ۤۜ᩵;->ܿ()[Ljava/net/Inet4Address;

    move-result-object p1

    .line 231
    array-length v0, p1

    :goto_1
    if-ge v2, v0, :cond_1

    aget-object v1, p1, v2

    .line 232
    iget-object v3, p0, Ll/᩶ۢ᩵;->᩶:Ljava/util/Set;

    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 235
    :cond_1
    new-instance p1, Ll/᩹ۢ᩵;

    invoke-direct {p1, p0}, Ll/᩹ۢ᩵;-><init>(Ll/᩶ۢ᩵;)V

    iput-object p1, p0, Ll/᩶ۢ᩵;->۟:Ll/᩹ۢ᩵;

    return-void
.end method

.method public static ֫(Ljava/util/Map;)Ljava/util/HashMap;
    .locals 5

    .line 249
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 252
    sget-object v1, Ll/۫ۜ᩵;->᩶:Ll/۫ۜ᩵;

    invoke-interface {p0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "local"

    if-eqz v2, :cond_0

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_2

    .line 253
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    move-object v3, v2

    .line 256
    :cond_2
    :goto_1
    invoke-static {v3}, Ll/᩶ۢ᩵;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 257
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    sget-object v1, Ll/۫ۜ᩵;->ۗ:Ll/۫ۜ᩵;

    invoke-interface {p0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "tcp"

    if-eqz v2, :cond_3

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object v2, v3

    :goto_2
    if-eqz v2, :cond_5

    .line 260
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_4

    goto :goto_3

    :cond_4
    move-object v3, v2

    .line 263
    :cond_5
    :goto_3
    invoke-static {v3}, Ll/᩶ۢ᩵;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 264
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    sget-object v1, Ll/۫ۜ᩵;->᩹:Ll/۫ۜ᩵;

    invoke-interface {p0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    const-string v3, ""

    if-eqz v2, :cond_6

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_4

    :cond_6
    move-object v2, v3

    :goto_4
    if-eqz v2, :cond_7

    .line 267
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_8

    :cond_7
    move-object v2, v3

    .line 270
    :cond_8
    invoke-static {v2}, Ll/᩶ۢ᩵;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 271
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    sget-object v1, Ll/۫ۜ᩵;->ۙ:Ll/۫ۜ᩵;

    invoke-interface {p0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_5

    :cond_9
    move-object v2, v3

    :goto_5
    if-eqz v2, :cond_a

    .line 274
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    move-object v2, v3

    .line 278
    :cond_b
    invoke-static {v2}, Ll/᩶ۢ᩵;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 279
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    sget-object v1, Ll/۫ۜ᩵;->۬:Ll/۫ۜ᩵;

    invoke-interface {p0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    goto :goto_6

    :cond_c
    move-object p0, v3

    :goto_6
    if-eqz p0, :cond_e

    .line 282
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_d

    goto :goto_7

    :cond_d
    move-object v3, p0

    .line 285
    :cond_e
    :goto_7
    invoke-static {v3}, Ll/᩶ۢ᩵;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 286
    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    const-string p0, ""

    return-object p0

    .line 295
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    const-string v0, "."

    .line 296
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 297
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_1
    const-string v1, "_"

    .line 299
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 300
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 302
    :cond_2
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    .line 0
    invoke-static {v2, v0, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_3
    return-object p0
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 44
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->clone()Ll/᩶ۢ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clone()Ll/ۤۜ᩵;
    .locals 1

    .line 44
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->clone()Ll/᩶ۢ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/᩶ۢ᩵;
    .locals 8

    .line 1097
    new-instance v7, Ll/᩶ۢ᩵;

    invoke-virtual {p0}, Ll/᩶ۢ᩵;->۫()Ljava/util/HashMap;

    move-result-object v1

    iget v2, p0, Ll/᩶ۢ᩵;->ۤ:I

    iget v3, p0, Ll/᩶ۢ᩵;->ܽ֫:I

    iget v4, p0, Ll/᩶ۢ᩵;->ۛ:I

    iget-boolean v5, p0, Ll/᩶ۢ᩵;->۫:Z

    iget-object v6, p0, Ll/᩶ۢ᩵;->ۧ֫:[B

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ll/᩶ۢ᩵;-><init>(Ljava/util/Map;IIIZ[B)V

    .line 1098
    iget-object v0, p0, Ll/᩶ۢ᩵;->ܰ:Ljava/lang/String;

    .line 392
    iput-object v0, v7, Ll/᩶ۢ᩵;->ܰ:Ljava/lang/String;

    .line 1099
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ۜ()[Ljava/net/Inet6Address;

    move-result-object v0

    .line 1100
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    .line 1101
    iget-object v5, v7, Ll/᩶ۢ᩵;->ۙ:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1103
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ܿ()[Ljava/net/Inet4Address;

    move-result-object v0

    .line 1104
    array-length v1, v0

    :goto_1
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 1105
    iget-object v4, v7, Ll/᩶ۢ᩵;->᩶:Ljava/util/Set;

    invoke-interface {v4, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-object v7
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1066
    instance-of v0, p1, Ll/᩶ۢ᩵;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ۘ()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Ll/᩶ۢ᩵;

    invoke-virtual {p1}, Ll/᩶ۢ᩵;->ۘ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 333
    iget-object v0, p0, Ll/᩶ۢ᩵;->۬:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1058
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ۘ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1115
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v0, "[ServiceInfoImpl@"

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1116
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " name: \'"

    .line 1117
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1118
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 1119
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x2e

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1121
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ۤ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' address: \'"

    .line 1122
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1123
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->᩷()[Ljava/net/InetAddress;

    move-result-object v0

    .line 1124
    array-length v2, v0

    const/4 v3, 0x0

    if-lez v2, :cond_1

    .line 1125
    array-length v2, v0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    aget-object v5, v0, v4

    .line 1126
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v5, 0x3a

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 510
    iget v5, p0, Ll/᩶ۢ᩵;->ۤ:I

    .line 1126
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v5, 0x20

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const-string v0, "(null):"

    .line 1129
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 510
    iget v0, p0, Ll/᩶ۢ᩵;->ۤ:I

    .line 1129
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_2
    const-string v0, "\' status: \'"

    .line 1131
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ll/᩶ۢ᩵;->۟:Ll/᩹ۢ᩵;

    invoke-virtual {v0}, Ll/ۙ᩷᩵;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1228
    iget-boolean v0, p0, Ll/᩶ۢ᩵;->۫:Z

    if-eqz v0, :cond_3

    const-string v0, "\' is persistent,"

    goto :goto_1

    :cond_3
    const-string v0, "\',"

    .line 1132
    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1134
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ܶ()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, " has data"

    .line 1135
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_4
    const-string v0, " has NO data"

    .line 1138
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1141
    :goto_2
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ۚ()[B

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_8

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 693
    :try_start_0
    iget-object v2, p0, Ll/᩶ۢ᩵;->ۨ:Ljava/util/Hashtable;

    if-nez v2, :cond_5

    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ۚ()[B

    move-result-object v2

    if-eqz v2, :cond_5

    .line 694
    new-instance v2, Ljava/util/Hashtable;

    invoke-direct {v2}, Ljava/util/Hashtable;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 696
    :try_start_1
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ۚ()[B

    move-result-object v4

    invoke-static {v2, v4}, Ll/ܺۡ᩵;->֫(Ljava/util/Hashtable;[B)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catch_0
    move-exception v4

    .line 699
    :try_start_2
    sget-object v5, Ll/᩶ۢ᩵;->ᩳ֫:Ll/֫᩻֨;

    const-string v6, "Malformed TXT Field "

    invoke-interface {v5, v6, v4}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 701
    :goto_3
    iput-object v2, p0, Ll/᩶ۢ᩵;->ۨ:Ljava/util/Hashtable;

    .line 703
    :cond_5
    iget-object v2, p0, Ll/᩶ۢ᩵;->ۨ:Ljava/util/Hashtable;

    if-eqz v2, :cond_6

    goto :goto_4

    :cond_6
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    monitor-exit v0

    .line 1144
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 1145
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 1146
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    sget-object v5, Ll/ܺۡ᩵;->ܽ:[B

    .line 66
    array-length v5, v4

    invoke-static {v3, v5, v4}, Ll/ܺۡ᩵;->֫(II[B)Ljava/lang/String;

    move-result-object v4

    const-string v5, "\n\t"

    .line 1147
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v5, ": "

    .line 0
    invoke-static {v1, v2, v5, v4}, Ll/᩶۫᩷;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_7
    const-string v0, ", empty"

    .line 1150
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_6

    :catchall_0
    move-exception v1

    .line 703
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1

    :cond_8
    :goto_6
    const/16 v0, 0x5d

    .line 1153
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1155
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Ljava/lang/String;
    .locals 1

    .line 674
    iget-object v0, p0, Ll/᩶ۢ᩵;->֫֫:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public final ֨()Ljava/lang/String;
    .locals 8

    .line 313
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ܽ()Ljava/lang/String;

    move-result-object v0

    .line 314
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ۖ()Ljava/lang/String;

    move-result-object v1

    .line 315
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->֫()Ljava/lang/String;

    move-result-object v2

    .line 316
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    const-string v5, ""

    const-string v6, "_"

    const-string v7, "."

    if-lez v4, :cond_0

    .line 0
    invoke-static {v6, v2, v7}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v5

    .line 316
    :goto_0
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1

    .line 0
    invoke-static {v6, v1, v7}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :cond_1
    invoke-static {v3, v5, v0, v7}, Ll/᩺᩵ܿ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 650
    iget-object v0, p0, Ll/᩶ۢ᩵;->᩸:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public final ֫(Ll/ۛۢ᩵;ILl/۟᩷᩵;)Ljava/util/ArrayList;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1168
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1170
    sget-object v3, Ll/ۛۢ᩵;->ۙ:Ll/ۛۢ᩵;

    if-eq v1, v3, :cond_1

    sget-object v3, Ll/ۛۢ᩵;->ۤ:Ll/ۛۢ᩵;

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    return-object v2

    .line 1171
    :cond_1
    :goto_0
    invoke-virtual/range {p0 .. p0}, Ll/᩶ۢ᩵;->֡()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_2

    .line 1172
    new-instance v1, Ll/۠᩷᩵;

    invoke-virtual/range {p0 .. p0}, Ll/᩶ۢ᩵;->ۤ()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ll/ۛۢ᩵;->ۤ:Ll/ۛۢ᩵;

    const/4 v6, 0x0

    invoke-virtual/range {p0 .. p0}, Ll/᩶ۢ᩵;->ۘ()Ljava/lang/String;

    move-result-object v8

    move-object v3, v1

    move/from16 v7, p2

    invoke-direct/range {v3 .. v8}, Ll/۠᩷᩵;-><init>(Ljava/lang/String;Ll/ۛۢ᩵;ZILjava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1174
    :cond_2
    new-instance v1, Ll/۠᩷᩵;

    invoke-virtual/range {p0 .. p0}, Ll/᩶ۢ᩵;->֨()Ljava/lang/String;

    move-result-object v10

    sget-object v5, Ll/ۛۢ᩵;->ۤ:Ll/ۛۢ᩵;

    const/4 v12, 0x0

    invoke-virtual/range {p0 .. p0}, Ll/᩶ۢ᩵;->ۘ()Ljava/lang/String;

    move-result-object v14

    move-object v9, v1

    move-object v11, v5

    move/from16 v13, p2

    invoke-direct/range {v9 .. v14}, Ll/۠᩷᩵;-><init>(Ljava/lang/String;Ll/ۛۢ᩵;ZILjava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1175
    new-instance v1, Ll/ܶ᩷᩵;

    invoke-virtual/range {p0 .. p0}, Ll/᩶ۢ᩵;->ۘ()Ljava/lang/String;

    move-result-object v12

    iget v3, v0, Ll/᩶ۢ᩵;->ۛ:I

    iget v4, v0, Ll/᩶ۢ᩵;->ܽ֫:I

    iget v6, v0, Ll/᩶ۢ᩵;->ۤ:I

    move-object/from16 v7, p3

    .line 134
    iget-object v7, v7, Ll/۟᩷᩵;->᩶:Ljava/lang/String;

    const/4 v8, 0x1

    move-object v11, v1

    move-object v13, v5

    move v14, v8

    move/from16 v15, p2

    move/from16 v16, v3

    move/from16 v17, v4

    move/from16 v18, v6

    move-object/from16 v19, v7

    .line 1175
    invoke-direct/range {v11 .. v19}, Ll/ܶ᩷᩵;-><init>(Ljava/lang/String;Ll/ۛۢ᩵;ZIIIILjava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1176
    new-instance v1, Ll/᩸᩷᩵;

    invoke-virtual/range {p0 .. p0}, Ll/᩶ۢ᩵;->ۘ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Ll/᩶ۢ᩵;->ۚ()[B

    move-result-object v9

    move-object v3, v1

    move v6, v8

    move/from16 v7, p2

    move-object v8, v9

    invoke-direct/range {v3 .. v8}, Ll/᩸᩷᩵;-><init>(Ljava/lang/String;Ll/ۛۢ᩵;ZI[B)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v2
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 353
    iput-object p1, p0, Ll/᩶ۢ᩵;->۬:Ljava/lang/String;

    const/4 p1, 0x0

    .line 354
    iput-object p1, p0, Ll/᩶ۢ᩵;->ۗ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/net/Inet4Address;)V
    .locals 1

    .line 426
    iget-object v0, p0, Ll/᩶ۢ᩵;->᩶:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ljava/net/Inet6Address;)V
    .locals 1

    .line 433
    iget-object v0, p0, Ll/᩶ۢ᩵;->ۙ:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/֫ۡ᩵;)V
    .locals 1

    .line 922
    iget-object v0, p0, Ll/᩶ۢ᩵;->۟:Ll/᩹ۢ᩵;

    invoke-virtual {v0, p1}, Ll/ۙ᩷᩵;->֫(Ll/֫ۡ᩵;)V

    return-void
.end method

.method public final ֫(Ll/ۡۢ᩵;)V
    .locals 1

    .line 1212
    iget-object v0, p0, Ll/᩶ۢ᩵;->۟:Ll/᩹ۢ᩵;

    invoke-virtual {v0, p1}, Ll/᩹ۢ᩵;->֫(Ll/ۡۢ᩵;)V

    return-void
.end method

.method public final ֫(Ll/᩷ۡ᩵;)V
    .locals 1

    .line 962
    iget-object v0, p0, Ll/᩶ۢ᩵;->۟:Ll/᩹ۢ᩵;

    invoke-virtual {v0, p1}, Ll/ۙ᩷᩵;->֫(Ll/᩷ۡ᩵;)V

    return-void
.end method

.method public final ֫(Ll/᩷ۡ᩵;Ll/۟ۢ᩵;)V
    .locals 1

    .line 970
    iget-object v0, p0, Ll/᩶ۢ᩵;->۟:Ll/᩹ۢ᩵;

    invoke-virtual {v0, p1, p2}, Ll/ۙ᩷᩵;->֫(Ll/᩷ۡ᩵;Ll/۟ۢ᩵;)V

    return-void
.end method

.method public final ֫(Ll/᩺ۜ᩵;JLl/ܰۜ᩵;)V
    .locals 6

    .line 717
    instance-of v0, p4, Ll/᩹᩷᩵;

    if-nez v0, :cond_1

    .line 718
    sget-object p1, Ll/᩶ۢ᩵;->ᩳ֫:Ll/֫᩻֨;

    const-string p2, "DNSEntry is not of type \'DNSRecord\' but of type {}"

    if-nez p4, :cond_0

    const-string p3, "null"

    goto :goto_0

    .line 719
    :cond_0
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p3

    .line 718
    :goto_0
    invoke-interface {p1, p3, p2}, Ll/֫᩻֨;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    .line 724
    :cond_1
    check-cast p4, Ll/᩹᩷᩵;

    .line 730
    invoke-virtual {p4, p2, p3}, Ll/᩹᩷᩵;->֫(J)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_6

    .line 782
    sget-object p1, Ll/᩶ۢ᩵;->ᩳ֫:Ll/֫᩻֨;

    sget-object p2, Ll/᩸ۢ᩵;->֫:[I

    invoke-virtual {p4}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p2, p2, p3

    if-eq p2, v2, :cond_2

    if-eq p2, v1, :cond_2

    const-string p2, "Unhandled expired record: {}"

    .line 814
    invoke-interface {p1, p4, p2}, Ll/֫᩻֨;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    .line 785
    :cond_2
    invoke-virtual {p4}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Ll/᩶ۢ᩵;->᩵()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_12

    .line 786
    move-object p2, p4

    check-cast p2, Ll/᩵᩷᩵;

    iget-object p2, p2, Ll/᩵᩷᩵;->ۘ:Ljava/net/InetAddress;

    .line 789
    sget-object p3, Ll/ۨۢ᩵;->ۙ:Ll/ۨۢ᩵;

    invoke-virtual {p4}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    .line 790
    check-cast p2, Ljava/net/Inet4Address;

    .line 793
    iget-object p3, p0, Ll/᩶ۢ᩵;->᩶:Ljava/util/Set;

    invoke-interface {p3, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    const-string p3, "Removed expired IPv4: {}"

    .line 794
    invoke-interface {p1, p2, p3}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_4

    :cond_3
    const-string p3, "Expired IPv4 not in this service: {}"

    .line 797
    invoke-interface {p1, p2, p3}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    .line 800
    :cond_4
    check-cast p2, Ljava/net/Inet6Address;

    .line 803
    iget-object p3, p0, Ll/᩶ۢ᩵;->ۙ:Ljava/util/Set;

    invoke-interface {p3, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    const-string p3, "Removed expired IPv6: {}"

    .line 804
    invoke-interface {p1, p2, p3}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_4

    :cond_5
    const-string p3, "Expired IPv6 not in this service: {}"

    .line 807
    invoke-interface {p1, p2, p3}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    .line 831
    :cond_6
    iget-object v0, p0, Ll/᩶ۢ᩵;->ۙ:Ljava/util/Set;

    iget-object v3, p0, Ll/᩶ۢ᩵;->᩶:Ljava/util/Set;

    .line 833
    sget-object v4, Ll/᩸ۢ᩵;->֫:[I

    invoke-virtual {p4}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    if-eq v4, v2, :cond_e

    if-eq v4, v1, :cond_d

    const/4 v1, 0x3

    if-eq v4, v1, :cond_9

    const/4 p1, 0x4

    if-eq v4, p1, :cond_8

    const/4 p1, 0x5

    if-eq v4, p1, :cond_7

    goto/16 :goto_5

    .line 888
    :cond_7
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->֡()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_12

    invoke-virtual {p4}, Ll/ܰۜ᩵;->ܿ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-eqz p1, :cond_12

    .line 889
    invoke-virtual {p4}, Ll/ܰۜ᩵;->ܿ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩶ۢ᩵;->֫֫:Ljava/lang/String;

    goto/16 :goto_4

    .line 880
    :cond_8
    invoke-virtual {p4}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ۘ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_12

    .line 881
    check-cast p4, Ll/᩸᩷᩵;

    .line 882
    invoke-virtual {p4}, Ll/᩸᩷᩵;->᩵()[B

    move-result-object p1

    iput-object p1, p0, Ll/᩶ۢ᩵;->ۧ֫:[B

    const/4 p1, 0x0

    .line 883
    iput-object p1, p0, Ll/᩶ۢ᩵;->ۨ:Ljava/util/Hashtable;

    goto/16 :goto_4

    .line 857
    :cond_9
    invoke-virtual {p4}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ۘ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 858
    check-cast p4, Ll/ܶ᩷᩵;

    .line 859
    iget-object v1, p0, Ll/᩶ۢ᩵;->ܰ:Ljava/lang/String;

    if-eqz v1, :cond_b

    invoke-virtual {p4}, Ll/ܶ᩷᩵;->ۚ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_1

    :cond_a
    const/4 v2, 0x0

    .line 860
    :cond_b
    :goto_1
    invoke-virtual {p4}, Ll/ܶ᩷᩵;->ۚ()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/᩶ۢ᩵;->ܰ:Ljava/lang/String;

    .line 861
    invoke-virtual {p4}, Ll/ܶ᩷᩵;->᩵()I

    move-result v1

    iput v1, p0, Ll/᩶ۢ᩵;->ۤ:I

    .line 862
    invoke-virtual {p4}, Ll/ܶ᩷᩵;->֨()I

    move-result v1

    iput v1, p0, Ll/᩶ۢ᩵;->ܽ֫:I

    .line 863
    invoke-virtual {p4}, Ll/ܶ᩷᩵;->֡()I

    move-result p4

    iput p4, p0, Ll/᩶ۢ᩵;->ۛ:I

    if-eqz v2, :cond_f

    .line 865
    invoke-interface {v3}, Ljava/util/Set;->clear()V

    .line 866
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 867
    iget-object p4, p0, Ll/᩶ۢ᩵;->ܰ:Ljava/lang/String;

    sget-object v0, Ll/ۨۢ᩵;->ۙ:Ll/ۨۢ᩵;

    sget-object v1, Ll/ۛۢ᩵;->ۤ:Ll/ۛۢ᩵;

    invoke-virtual {p1, p4, v0, v1}, Ll/᩺ۜ᩵;->ۧ(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;)Ljava/util/List;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_2
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰۜ᩵;

    .line 868
    invoke-virtual {p0, p1, p2, p3, v0}, Ll/᩶ۢ᩵;->֫(Ll/᩺ۜ᩵;JLl/ܰۜ᩵;)V

    goto :goto_2

    .line 870
    :cond_c
    iget-object p4, p0, Ll/᩶ۢ᩵;->ܰ:Ljava/lang/String;

    sget-object v0, Ll/ۨۢ᩵;->۬:Ll/ۨۢ᩵;

    sget-object v1, Ll/ۛۢ᩵;->ۤ:Ll/ۛۢ᩵;

    invoke-virtual {p1, p4, v0, v1}, Ll/᩺ۜ᩵;->ۧ(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;)Ljava/util/List;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_3
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰۜ᩵;

    .line 871
    invoke-virtual {p0, p1, p2, p3, v0}, Ll/᩶ۢ᩵;->֫(Ll/᩺ۜ᩵;JLl/ܰۜ᩵;)V

    goto :goto_3

    .line 846
    :cond_d
    invoke-virtual {p4}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Ll/᩶ۢ᩵;->᩵()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_12

    .line 847
    check-cast p4, Ll/᩵᩷᩵;

    .line 346
    iget-object p1, p4, Ll/᩵᩷᩵;->ۘ:Ljava/net/InetAddress;

    .line 848
    instance-of p2, p1, Ljava/net/Inet6Address;

    if-eqz p2, :cond_12

    .line 849
    check-cast p1, Ljava/net/Inet6Address;

    .line 850
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_12

    goto :goto_4

    .line 835
    :cond_e
    invoke-virtual {p4}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Ll/᩶ۢ᩵;->᩵()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_12

    .line 836
    check-cast p4, Ll/᩵᩷᩵;

    .line 346
    iget-object p1, p4, Ll/᩵᩷᩵;->ۘ:Ljava/net/InetAddress;

    .line 837
    instance-of p2, p1, Ljava/net/Inet4Address;

    if-eqz p2, :cond_12

    .line 838
    check-cast p1, Ljava/net/Inet4Address;

    .line 839
    invoke-interface {v3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_12

    .line 1220
    :cond_f
    :goto_4
    iget-object p1, p0, Ll/᩶ۢ᩵;->۟:Ll/᩹ۢ᩵;

    invoke-virtual {p1}, Ll/ۙ᩷᩵;->ۧ()Ll/ۡۢ᩵;

    move-result-object p1

    if-eqz p1, :cond_11

    .line 744
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ܶ()Z

    move-result p2

    if-eqz p2, :cond_10

    .line 759
    new-instance p2, Ll/ܶۢ᩵;

    invoke-virtual {p0}, Ll/᩶ۢ᩵;->֨()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0}, Ll/᩶ۢ᩵;->getName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0}, Ll/᩶ۢ᩵;->clone()Ll/᩶ۢ᩵;

    move-result-object v0

    invoke-direct {p2, p1, p3, p4, v0}, Ll/ܶۢ᩵;-><init>(Ll/ۡۢ᩵;Ljava/lang/String;Ljava/lang/String;Ll/ۤۜ᩵;)V

    .line 760
    invoke-virtual {p1, p2}, Ll/ۡۢ᩵;->֫(Ll/ܶۢ᩵;)V

    :cond_10
    move-object v0, p0

    .line 763
    monitor-enter v0

    .line 764
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 765
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 767
    :cond_11
    sget-object p1, Ll/᩶ۢ᩵;->ᩳ֫:Ll/֫᩻֨;

    const-string p2, "JmDNS not available."

    invoke-interface {p1, p2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_12
    :goto_5
    return-void
.end method

.method public final ֫([B)V
    .locals 0

    .line 1207
    iput-object p1, p0, Ll/᩶ۢ᩵;->ۧ֫:[B

    const/4 p1, 0x0

    .line 1208
    iput-object p1, p0, Ll/᩶ۢ᩵;->ۨ:Ljava/util/Hashtable;

    return-void
.end method

.method public final ֫(Ll/ۤۜ᩵;)Z
    .locals 5

    .line 1265
    instance-of v0, p1, Ll/᩶ۢ᩵;

    if-eqz v0, :cond_0

    .line 1266
    check-cast p1, Ll/᩶ۢ᩵;

    iget-object v0, p1, Ll/᩶ۢ᩵;->ۙ:Ljava/util/Set;

    iget-object p1, p1, Ll/᩶ۢ᩵;->᩶:Ljava/util/Set;

    .line 1267
    iget-object v1, p0, Ll/᩶ۢ᩵;->᩶:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v2

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v3

    if-ne v2, v3, :cond_1

    iget-object v2, p0, Ll/᩶ۢ᩵;->ۙ:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v3

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v4

    if-ne v3, v4, :cond_1

    .line 1268
    invoke-interface {v1, p1}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {v2, v0}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 1271
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->᩷()[Ljava/net/InetAddress;

    move-result-object v0

    .line 1272
    invoke-virtual {p1}, Ll/ۤۜ᩵;->᩷()[Ljava/net/InetAddress;

    move-result-object p1

    .line 1273
    array-length v1, v0

    array-length v2, p1

    if-ne v1, v2, :cond_1

    new-instance v1, Ljava/util/HashSet;

    .line 1274
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    new-instance v0, Ljava/util/HashSet;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫֫()V
    .locals 1

    .line 930
    iget-object v0, p0, Ll/᩶ۢ᩵;->۟:Ll/᩹ۢ᩵;

    invoke-virtual {v0}, Ll/ۙ᩷᩵;->ܽ()V

    return-void
.end method

.method public final ۖ()Ljava/lang/String;
    .locals 1

    .line 666
    iget-object v0, p0, Ll/᩶ۢ᩵;->᩺:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "tcp"

    return-object v0
.end method

.method public final ۗ()Ll/ۡۢ᩵;
    .locals 1

    .line 1220
    iget-object v0, p0, Ll/᩶ۢ᩵;->۟:Ll/᩹ۢ᩵;

    invoke-virtual {v0}, Ll/ۙ᩷᩵;->ۧ()Ll/ۡۢ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ۘ()Ljava/lang/String;
    .locals 8

    .line 362
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ܽ()Ljava/lang/String;

    move-result-object v0

    .line 363
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ۖ()Ljava/lang/String;

    move-result-object v1

    .line 364
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->֫()Ljava/lang/String;

    move-result-object v2

    .line 365
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->getName()Ljava/lang/String;

    move-result-object v3

    .line 369
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    const-string v6, ""

    const-string v7, "."

    if-lez v5, :cond_0

    invoke-virtual {v3, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v6

    :goto_0
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const-string v5, "_"

    if-lez v3, :cond_1

    .line 0
    invoke-static {v5, v2, v7}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v6

    .line 369
    :goto_1
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_2

    .line 0
    invoke-static {v5, v1, v7}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    :cond_2
    invoke-static {v4, v6, v0, v7}, Ll/᩺᩵ܿ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۚ()[B
    .locals 2

    .line 534
    iget-object v0, p0, Ll/᩶ۢ᩵;->ۧ֫:[B

    if-eqz v0, :cond_0

    array-length v1, v0

    if-lez v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Ll/ܺۡ᩵;->ۧ:[B

    return-object v0
.end method

.method public final ۛ()Z
    .locals 1

    .line 1002
    iget-object v0, p0, Ll/᩶ۢ᩵;->۟:Ll/᩹ۢ᩵;

    .line 332
    iget-object v0, v0, Ll/ۙ᩷᩵;->ۙ:Ll/۟ۢ᩵;

    invoke-virtual {v0}, Ll/۟ۢ᩵;->ۧ()Z

    move-result v0

    return v0
.end method

.method public final ۜ()[Ljava/net/Inet6Address;
    .locals 2

    .line 502
    iget-object v0, p0, Ll/᩶ۢ᩵;->ۙ:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v1

    new-array v1, v1, [Ljava/net/Inet6Address;

    invoke-interface {v0, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/net/Inet6Address;

    return-object v0
.end method

.method public final ۟()Z
    .locals 2

    .line 301
    iget-object v0, p0, Ll/᩶ۢ᩵;->۟:Ll/᩹ۢ᩵;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 303
    :try_start_0
    sget-object v1, Ll/۟ۢ᩵;->۟:Ll/۟ۢ᩵;

    invoke-virtual {v0, v1}, Ll/ۙ᩷᩵;->֫(Ll/۟ۢ᩵;)V

    const/4 v1, 0x0

    .line 304
    invoke-virtual {v0, v1}, Ll/᩹ۢ᩵;->ۧ(Ll/᩷ۡ᩵;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 306
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 307
    throw v1
.end method

.method public final ۠()I
    .locals 1

    .line 526
    iget v0, p0, Ll/᩶ۢ᩵;->ܽ֫:I

    return v0
.end method

.method public final ۡ()I
    .locals 1

    .line 510
    iget v0, p0, Ll/᩶ۢ᩵;->ۤ:I

    return v0
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 341
    iget-object v0, p0, Ll/᩶ۢ᩵;->ۗ:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 342
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ۘ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ۢ᩵;->ۗ:Ljava/lang/String;

    .line 344
    :cond_0
    iget-object v0, p0, Ll/᩶ۢ᩵;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۤ()Ljava/lang/String;
    .locals 4

    .line 324
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->֡()Ljava/lang/String;

    move-result-object v0

    .line 325
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    const-string v2, "_"

    const-string v3, "._sub."

    .line 0
    invoke-static {v2, v0, v3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 325
    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/᩶ۢ᩵;->֨()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 392
    iput-object p1, p0, Ll/᩶ۢ᩵;->ܰ:Ljava/lang/String;

    return-void
.end method

.method public final ۧ(Ll/᩷ۡ᩵;Ll/۟ۢ᩵;)Z
    .locals 2

    .line 978
    iget-object v0, p0, Ll/᩶ۢ᩵;->۟:Ll/᩹ۢ᩵;

    .line 180
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 182
    :try_start_0
    iget-object v1, v0, Ll/ۙ᩷᩵;->ۗ:Ll/֫ۡ᩵;

    if-ne v1, p1, :cond_0

    iget-object p1, v0, Ll/ۙ᩷᩵;->ۙ:Ll/۟ۢ᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 184
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 185
    throw p1
.end method

.method public final ۨ()Z
    .locals 1

    .line 994
    iget-object v0, p0, Ll/᩶ۢ᩵;->۟:Ll/᩹ۢ᩵;

    .line 324
    iget-object v0, v0, Ll/ۙ᩷᩵;->ۙ:Ll/۟ۢ᩵;

    invoke-virtual {v0}, Ll/۟ۢ᩵;->ܿ()Z

    move-result v0

    return v0
.end method

.method public final ۫()Ljava/util/HashMap;
    .locals 3

    .line 682
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 684
    sget-object v1, Ll/۫ۜ᩵;->᩶:Ll/۫ۜ᩵;

    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ܽ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 685
    sget-object v1, Ll/۫ۜ᩵;->ۗ:Ll/۫ۜ᩵;

    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ۖ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 686
    sget-object v1, Ll/۫ۜ᩵;->᩹:Ll/۫ۜ᩵;

    invoke-virtual {p0}, Ll/᩶ۢ᩵;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 687
    sget-object v1, Ll/۫ۜ᩵;->ۙ:Ll/۫ۜ᩵;

    invoke-virtual {p0}, Ll/᩶ۢ᩵;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 688
    sget-object v1, Ll/۫ۜ᩵;->۬:Ll/۫ۜ᩵;

    invoke-virtual {p0}, Ll/᩶ۢ᩵;->֡()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final ܰ()Z
    .locals 1

    .line 986
    iget-object v0, p0, Ll/᩶ۢ᩵;->۟:Ll/᩹ۢ᩵;

    .line 316
    iget-object v0, v0, Ll/ۙ᩷᩵;->ۙ:Ll/۟ۢ᩵;

    invoke-virtual {v0}, Ll/۟ۢ᩵;->ܺ()Z

    move-result v0

    return v0
.end method

.method public final ܳ()Ljava/net/Inet6Address;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 471
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ۜ()[Ljava/net/Inet6Address;

    move-result-object v0

    .line 472
    array-length v1, v0

    if-lez v1, :cond_0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final declared-synchronized ܶ()Z
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 385
    :try_start_0
    iget-object v1, p0, Ll/᩶ۢ᩵;->ܰ:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    .line 912
    iget-object v1, p0, Ll/᩶ۢ᩵;->᩶:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    if-gtz v1, :cond_2

    iget-object v1, p0, Ll/᩶ۢ᩵;->ۙ:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    if-lez v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v1, 0x1

    :goto_2
    if-eqz v1, :cond_3

    .line 907
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ۚ()[B

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ۚ()[B

    move-result-object v1

    array-length v1, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez v1, :cond_3

    const/4 v2, 0x1

    :cond_3
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ܺ()I
    .locals 1

    .line 518
    iget v0, p0, Ll/᩶ۢ᩵;->ۛ:I

    return v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 658
    iget-object v0, p0, Ll/᩶ۢ᩵;->᩹:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "local"

    return-object v0
.end method

.method public final ܽ֫()Z
    .locals 1

    .line 1050
    iget-object v0, p0, Ll/᩶ۢ᩵;->۟:Ll/᩹ۢ᩵;

    invoke-virtual {v0}, Ll/ۙ᩷᩵;->ᩳ()Z

    move-result v0

    return v0
.end method

.method public final ܿ()[Ljava/net/Inet4Address;
    .locals 2

    .line 493
    iget-object v0, p0, Ll/᩶ۢ᩵;->᩶:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v1

    new-array v1, v1, [Ljava/net/Inet4Address;

    invoke-interface {v0, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/net/Inet4Address;

    return-object v0
.end method

.method public final ᩳ()Ljava/net/Inet4Address;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 461
    invoke-virtual {p0}, Ll/᩶ۢ᩵;->ܿ()[Ljava/net/Inet4Address;

    move-result-object v0

    .line 462
    array-length v1, v0

    if-lez v1, :cond_0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩵()Ljava/lang/String;
    .locals 1

    .line 377
    iget-object v0, p0, Ll/᩶ۢ᩵;->ܰ:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public final ᩶()Z
    .locals 1

    .line 938
    iget-object v0, p0, Ll/᩶ۢ᩵;->۟:Ll/᩹ۢ᩵;

    invoke-virtual {v0}, Ll/ۙ᩷᩵;->֫()Z

    move-result v0

    return v0
.end method

.method public final ᩷()[Ljava/net/InetAddress;
    .locals 5

    .line 481
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/᩶ۢ᩵;->᩶:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v2

    iget-object v3, p0, Ll/᩶ۢ᩵;->ۙ:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    add-int/2addr v4, v2

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 482
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 483
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 484
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Ljava/net/InetAddress;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/net/InetAddress;

    return-object v0
.end method

.method public final ᩹()Z
    .locals 1

    .line 1228
    iget-boolean v0, p0, Ll/᩶ۢ᩵;->۫:Z

    return v0
.end method
