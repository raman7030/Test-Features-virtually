.class public final Ll/ܳܳۡ;
.super Ljava/lang/Object;
.source "TBJG"


# static fields
.field public static final ֫:Ljava/util/LinkedHashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 298
    new-instance v0, Ljava/util/LinkedHashMap;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    sput-object v0, Ll/ܳܳۡ;->֫:Ljava/util/LinkedHashMap;

    .line 300
    new-instance v1, Ll/ۧܳۡ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "<!--"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    new-instance v1, Ll/ܽܳۡ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "<!"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    new-instance v1, Ll/ᩳܳۡ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "<?"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    new-instance v1, Ll/ܿܳۡ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "<"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ljava/io/StringReader;)Ll/֫ܳۡ;
    .locals 5

    const/16 v0, 0xa

    new-array v1, v0, [C

    .line 309
    invoke-virtual {p0, v0}, Ljava/io/Reader;->mark(I)V

    const/4 v2, 0x0

    .line 310
    invoke-virtual {p0, v1, v2, v0}, Ljava/io/Reader;->read([CII)I

    .line 311
    invoke-virtual {p0}, Ljava/io/Reader;->reset()V

    .line 313
    invoke-static {v1}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;

    move-result-object v0

    .line 315
    sget-object v1, Ll/ܳܳۡ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 316
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 317
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/function/Supplier;

    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ܳۡ;

    .line 318
    invoke-virtual {v0, p0}, Ll/֫ܳۡ;->֫(Ljava/io/StringReader;)V

    return-object v0

    .line 323
    :cond_1
    new-instance v0, Ll/᩻ܳۡ;

    .line 329
    invoke-direct {v0, v2}, Ll/֫ܳۡ;-><init>(I)V

    .line 324
    invoke-virtual {v0, p0}, Ll/֫ܳۡ;->֫(Ljava/io/StringReader;)V

    return-object v0
.end method
