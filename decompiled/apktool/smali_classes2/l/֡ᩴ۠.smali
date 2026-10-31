.class public final Ll/֡ᩴ۠;
.super Ljava/lang/Object;
.source "640U"


# instance fields
.field public final ֫:Ll/ܳۗܽ;

.field public ۜ:Ll/ۖܶ۠;

.field public ۡ:Ll/ۖܶ۠;

.field public final synthetic ۢ:Ll/֨ᩴ۠;

.field public final ۧ:Ll/ۖܰ֨;

.field public ܳ:Ll/ۖܶ۠;

.field public ܺ:Ljava/util/Set;

.field public ܽ:Ljava/util/LinkedHashSet;

.field public ܿ:Ljava/util/HashMap;

.field public final ᩳ:Ll/ۚܶ۠;

.field public ᩷:Ll/ۖܶ۠;

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/֨ᩴ۠;ILjava/util/Set;Ll/ۚܶ۠;)V
    .locals 2

    .line 1068
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ᩴ۠;->ۢ:Ll/֨ᩴ۠;

    .line 1290
    new-instance v0, Ll/ۖܰ֨;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/ۖܰ֨;-><init>(I)V

    iput-object v0, p0, Ll/֡ᩴ۠;->ۧ:Ll/ۖܰ֨;

    .line 1294
    new-instance v0, Ll/ܳۗܽ;

    invoke-direct {v0, v1}, Ll/ܳۗܽ;-><init>(I)V

    iput-object v0, p0, Ll/֡ᩴ۠;->֫:Ll/ܳۗܽ;

    .line 1069
    iput p2, p0, Ll/֡ᩴ۠;->᩻:I

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 1072
    invoke-static {p4}, Ll/۫ۙ;->֫(Ljava/lang/Object;)V

    .line 1073
    iput-object p4, p0, Ll/֡ᩴ۠;->ᩳ:Ll/ۚܶ۠;

    goto :goto_0

    .line 1075
    :cond_0
    new-instance p2, Ll/ۚܶ۠;

    iget-object p4, p1, Ll/֨ᩴ۠;->֫֫:Ll/᩹ܶ۠;

    const/4 v0, 0x0

    .line 138
    invoke-direct {p2, p4, v0}, Ll/ۚܶ۠;-><init>(Ll/᩹ܶ۠;Ljava/util/function/Predicate;)V

    .line 1075
    iput-object p2, p0, Ll/֡ᩴ۠;->ᩳ:Ll/ۚܶ۠;

    .line 1076
    invoke-static {p1}, Ll/֨ᩴ۠;->ܽ(Ll/֨ᩴ۠;)Ll/ۙۡ۠;

    move-result-object p1

    invoke-virtual {p1, p2}, Ll/ۙۡ۠;->֫(Ll/ۚܶ۠;)V

    .line 1080
    :goto_0
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/֡ᩴ۠;->ۡ:Ll/ۖܶ۠;

    .line 1081
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/֡ᩴ۠;->ۜ:Ll/ۖܶ۠;

    .line 1082
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/֡ᩴ۠;->ܳ:Ll/ۖܶ۠;

    .line 1083
    iput-object p3, p0, Ll/֡ᩴ۠;->ܺ:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ll/֨ᩴ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;Ljava/util/Set;Ll/ۚܶ۠;)V
    .locals 1

    const/4 v0, 0x1

    .line 1091
    invoke-direct {p0, p1, v0, p4, p5}, Ll/֡ᩴ۠;-><init>(Ll/֨ᩴ۠;ILjava/util/Set;Ll/ۚܶ۠;)V

    .line 1092
    iput-object p2, p0, Ll/֡ᩴ۠;->᩷:Ll/ۖܶ۠;

    .line 1093
    new-instance p4, Ljava/util/HashMap;

    invoke-direct {p4}, Ljava/util/HashMap;-><init>()V

    iput-object p4, p0, Ll/֡ᩴ۠;->ܿ:Ljava/util/HashMap;

    .line 1099
    invoke-static {p1, p2}, Ll/֨ᩴ۠;->ۧ(Ll/֨ᩴ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p4

    invoke-virtual {p3}, Ll/ۖܶ۠;->ᩳ()Ll/ۖܶ۠;

    move-result-object p3

    invoke-virtual {p4, p3}, Ll/ۖܶ۠;->ܽ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p3

    iput-object p3, p0, Ll/֡ᩴ۠;->ۡ:Ll/ۖܶ۠;

    .line 1101
    invoke-static {p1, p2}, Ll/֨ᩴ۠;->֫(Ll/֨ᩴ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/֡ᩴ۠;->ۜ:Ll/ۖܶ۠;

    .line 1518
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p1

    .line 1519
    invoke-virtual {p2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/֨᩵۠;

    .line 1520
    iget-object p4, p3, Ll/֨᩵۠;->ܰ:Ll/ᩳ᩶۠;

    sget-object p5, Ll/ܽ᩶۠;->۬:Ll/ܽ᩶۠;

    const-string v0, "module-info"

    .line 1552
    invoke-interface {p4, v0, p5}, Ll/ᩳ᩶۠;->֫(Ljava/lang/String;Ll/ܽ᩶۠;)Z

    move-result p4

    if-eqz p4, :cond_0

    .line 1520
    iget-object p4, p3, Ll/֨᩵۠;->ۗ:Ll/ۖܶ۠;

    invoke-virtual {p4}, Ll/ۖܶ۠;->ܽ()Z

    move-result p4

    if-eqz p4, :cond_0

    .line 1521
    iget-object p4, p3, Ll/֨᩵۠;->ۗ:Ll/ۖܶ۠;

    invoke-virtual {p4}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_1
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_0

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ll/ۚۚ۠;

    .line 1522
    sget-object v0, Ll/ᩴۚ۠;->ۗ֫:Ll/ᩴۚ۠;

    invoke-virtual {p5, v0}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 1525
    :cond_1
    sget-object p4, Ll/ᩴۚ۠;->ܿۧ:Ll/ᩴۚ۠;

    invoke-virtual {p5, p4}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result p4

    if-eqz p4, :cond_0

    .line 1526
    iget-object p3, p3, Ll/֨᩵۠;->ۛ:Ll/֡֡֨;

    invoke-virtual {p1, p3}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    goto :goto_0

    .line 1535
    :cond_2
    invoke-virtual {p1}, Ll/ۖܶ۠;->ᩳ()Ll/ۖܶ۠;

    move-result-object p1

    .line 1103
    iput-object p1, p0, Ll/֡ᩴ۠;->ܳ:Ll/ۖܶ۠;

    .line 1105
    invoke-virtual {p0}, Ll/֡ᩴ۠;->ۧ()V

    return-void
.end method

.method private ֫(Ljava/util/HashMap;)Ll/ۖܶ۠;
    .locals 9

    .line 1211
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    .line 1213
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 1214
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 1215
    iget-object v4, p0, Ll/֡ᩴ۠;->ۢ:Ll/֨ᩴ۠;

    invoke-static {v4}, Ll/֨ᩴ۠;->ۘ(Ll/֨ᩴ۠;)Ll/ۛܶ۠;

    move-result-object v5

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 414
    iget-object v5, v5, Ll/ۛܶ۠;->ᩴܽ:Ll/۫ܶ۠;

    invoke-virtual {v5, v6}, Ll/۫ܶ۠;->֫(Ljava/lang/String;)Ll/ۤܶ۠;

    move-result-object v5

    .line 1216
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳ᩶۠;

    .line 1217
    invoke-interface {v3}, Ll/ᩳ᩶۠;->֫()Ll/ܽ᩶۠;

    move-result-object v6

    sget-object v7, Ll/ܽ᩶۠;->᩶:Ll/ܽ᩶۠;

    if-ne v6, v7, :cond_5

    const-string v6, "package-info"

    .line 1544
    invoke-interface {v3, v6, v7}, Ll/ᩳ᩶۠;->֫(Ljava/lang/String;Ll/ܽ᩶۠;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x2e

    .line 332
    invoke-virtual {v5, v6}, Ll/ۤܶ۠;->֫(B)I

    move-result v6

    const/4 v7, 0x0

    invoke-virtual {v5, v7, v6}, Ll/ۤܶ۠;->֫(II)Ll/ۤܶ۠;

    move-result-object v6

    .line 1222
    invoke-static {v4}, Ll/֨ᩴ۠;->᩵(Ll/֨ᩴ۠;)Ll/᩷ۚ֨;

    move-result-object v7

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/֡֡֨;

    invoke-virtual {v7, v8, v6}, Ll/᩷ۚ֨;->ۧ(Ll/֡֡֨;Ll/ۤܶ۠;)Ll/۠֡֨;

    move-result-object v6

    .line 1223
    iget-object v7, v6, Ll/۠֡֨;->ܰ:Ll/ܳ֡֨;

    if-nez v7, :cond_1

    .line 1224
    invoke-static {v4}, Ll/֨ᩴ۠;->᩵(Ll/֨ᩴ۠;)Ll/᩷ۚ֨;

    move-result-object v7

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/֡֡֨;

    invoke-static {v5}, Ll/۬֨۠;->ܽ(Ll/ۤܶ۠;)Ll/ۤܶ۠;

    move-result-object v5

    invoke-virtual {v7, v8, v5, v6}, Ll/᩷ۚ֨;->֫(Ll/֡֡֨;Ll/ۤܶ۠;Ll/᩶֡֨;)Ll/ܳ֡֨;

    move-result-object v5

    iput-object v5, v6, Ll/۠֡֨;->ܰ:Ll/ܳ֡֨;

    .line 1225
    :cond_1
    iget-object v5, v6, Ll/۠֡֨;->ܰ:Ll/ܳ֡֨;

    .line 1226
    invoke-virtual {v5}, Ll/ܳ֡֨;->᩺֫()V

    .line 1227
    iget-object v6, v5, Ll/ܳ֡֨;->ۨ:Ll/ᩳ᩶۠;

    if-nez v6, :cond_2

    .line 1228
    iput-object v3, v5, Ll/ܳ֡֨;->ۨ:Ll/ᩳ᩶۠;

    .line 1229
    :cond_2
    invoke-static {v4}, Ll/֨ᩴ۠;->ۢ(Ll/֨ᩴ۠;)Ll/ۜ֡֨;

    move-result-object v3

    iput-object v3, v5, Ll/ۛ֡֨;->᩸:Ll/ۜ֡֨;

    goto :goto_1

    .line 1231
    :cond_3
    invoke-static {v4}, Ll/֨ᩴ۠;->᩵(Ll/֨ᩴ۠;)Ll/᩷ۚ֨;

    move-result-object v6

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֡֡֨;

    invoke-virtual {v6, v7, v5}, Ll/᩷ۚ֨;->֫(Ll/֡֡֨;Ll/ۤܶ۠;)Ll/ܳ֡֨;

    move-result-object v5

    .line 1232
    invoke-virtual {v5}, Ll/ܳ֡֨;->᩺֫()V

    .line 1233
    iput-object v3, v5, Ll/ܳ֡֨;->ۨ:Ll/ᩳ᩶۠;

    .line 1234
    invoke-static {v4}, Ll/֨ᩴ۠;->ۢ(Ll/֨ᩴ۠;)Ll/ۜ֡֨;

    move-result-object v3

    iput-object v3, v5, Ll/ۛ֡֨;->᩸:Ll/ۜ֡֨;

    .line 1235
    iget-object v3, v5, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v4, v3, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v6, Ll/֨ᩴ֨;->ᩳ֫:Ll/֨ᩴ֨;

    if-ne v4, v6, :cond_4

    .line 1236
    invoke-virtual {v3}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object v3

    invoke-virtual {v3, v5}, Ll/ܰ᩵֨;->ܿ(Ll/ۛ֡֨;)V

    .line 1239
    :cond_4
    :goto_1
    invoke-virtual {v0, v5}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    goto/16 :goto_0

    .line 1218
    :cond_5
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1, v3}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    .line 1242
    :cond_6
    invoke-virtual {v0}, Ll/ۖܶ۠;->ᩳ()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method

.method private ᩳ()V
    .locals 6

    .line 1314
    iget-object v0, p0, Ll/֡ᩴ۠;->ۢ:Ll/֨ᩴ۠;

    invoke-static {v0}, Ll/֨ᩴ۠;->᩻(Ll/֨ᩴ۠;)Ll/ܰ۫֨;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܰ۫֨;->ᩳ()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    iget-object v3, p0, Ll/֡ᩴ۠;->ܺ:Ljava/util/Set;

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫ۤ֨;

    .line 1315
    iget-object v2, v2, Ll/֫ۤ֨;->۫:Ll/֨᩵۠;

    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1317
    :cond_0
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨᩵۠;

    .line 1318
    invoke-static {v0}, Ll/֨ᩴ۠;->ۚ(Ll/֨ᩴ۠;)Ll/ܳ֨۠;

    move-result-object v3

    invoke-virtual {v3, v2}, Ll/ܳ֨۠;->ۧ(Ll/ۚۚ۠;)V

    goto :goto_1

    .line 1320
    :cond_1
    invoke-static {v0}, Ll/֨ᩴ۠;->ۧ(Ll/֨ᩴ۠;)Ll/ܶ۬֨;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ۬֨;->֫()V

    .line 1321
    invoke-static {v0}, Ll/֨ᩴ۠;->᩻(Ll/֨ᩴ۠;)Ll/ܰ۫֨;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܰ۫֨;->ܿ()V

    .line 1322
    invoke-static {v0}, Ll/֨ᩴ۠;->᩷(Ll/֨ᩴ۠;)Ll/ܽᩴ۠;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽᩴ۠;->ܳ()V

    .line 1323
    invoke-static {v0}, Ll/֨ᩴ۠;->ܺ(Ll/֨ᩴ۠;)Ll/ܿᩴ۠;

    move-result-object v1

    const/4 v2, 0x0

    .line 184
    iput v2, v1, Ll/ܿᩴ۠;->֫:I

    .line 1324
    invoke-static {v0}, Ll/֨ᩴ۠;->ܽ(Ll/֨ᩴ۠;)Ll/ۙۡ۠;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۙۡ۠;->ᩳ()V

    .line 1325
    invoke-static {v0}, Ll/֨ᩴ۠;->ۖ(Ll/֨ᩴ۠;)Ll/ۗܰ֨;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗܰ֨;->ۜ()V

    .line 1326
    invoke-static {v0}, Ll/֨ᩴ۠;->֨(Ll/֨ᩴ۠;)Ll/ۛ᩸֨;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛ᩸֨;->֫()V

    .line 1327
    invoke-static {v0}, Ll/֨ᩴ۠;->֫(Ll/֨ᩴ۠;)Ll/۬᩹֨;

    move-result-object v1

    invoke-virtual {v1}, Ll/۬᩹֨;->ᩳ()V

    .line 1328
    invoke-static {v0}, Ll/֨ᩴ۠;->ܳ(Ll/֨ᩴ۠;)Ll/᩸ۖ۠;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩸ۖ۠;->֫()V

    .line 1332
    invoke-static {v0}, Ll/֨ᩴ۠;->᩵(Ll/֨ᩴ۠;)Ll/᩷ۚ֨;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Ll/᩷ۚ֨;->֫(Ll/᩷ۚ֨;)Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ֡֨;

    .line 1333
    iget-object v2, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v3, Ll/֨ᩴ֨;->᩺:Ll/֨ᩴ֨;

    if-ne v2, v3, :cond_2

    .line 1340
    invoke-static {v0}, Ll/֨ᩴ۠;->᩵(Ll/֨ᩴ۠;)Ll/᩷ۚ֨;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Ll/᩷ۚ֨;->֫(Ll/᩷ۚ֨;)Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ֡֨;

    .line 1341
    iget-object v3, v2, Ll/ܳ֡֨;->ۨ:Ll/ᩳ᩶۠;

    if-nez v3, :cond_4

    iget-object v3, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v4, Ll/֨ᩴ֨;->᩺:Ll/֨ᩴ֨;

    if-ne v3, v4, :cond_3

    .line 1342
    :cond_4
    iget-object v3, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    .line 1343
    invoke-virtual {v2}, Ll/ܳ֡֨;->᩺֫()V

    .line 1344
    sget-object v4, Ll/֨ᩴ֨;->᩺:Ll/֨ᩴ֨;

    if-ne v3, v4, :cond_5

    .line 1345
    new-instance v3, Ll/᩶ۚ֨;

    iget-object v4, v2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v4}, Ll/ۙ֨֨;->۫()Ll/ۙ֨֨;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v3, v2, v4, v5}, Ll/᩶ۚ֨;-><init>(Ll/᩶֡֨;Ll/ۙ֨֨;Ll/ۖܶ۠;)V

    iput-object v3, v2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 233
    :cond_5
    iget-object v3, v2, Ll/ۛ֡֨;->᩸:Ll/ۜ֡֨;

    invoke-interface {v3}, Ll/ۜ֡֨;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1348
    invoke-static {v0}, Ll/֨ᩴ۠;->ۢ(Ll/֨ᩴ۠;)Ll/ۜ֡֨;

    move-result-object v3

    iput-object v3, v2, Ll/ۛ֡֨;->᩸:Ll/ۜ֡֨;

    goto :goto_2

    :cond_6
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/LinkedHashSet;Ljava/util/LinkedHashMap;)Ll/֡ᩴ۠;
    .locals 9

    .line 1153
    new-instance v0, Ll/֡ᩴ۠;

    .line 1111
    iget v1, p0, Ll/֡ᩴ۠;->᩻:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iget-object v3, p0, Ll/֡ᩴ۠;->ܺ:Ljava/util/Set;

    const/4 v4, 0x0

    iget-object v5, p0, Ll/֡ᩴ۠;->ۢ:Ll/֨ᩴ۠;

    invoke-direct {v0, v5, v1, v3, v4}, Ll/֡ᩴ۠;-><init>(Ll/֨ᩴ۠;ILjava/util/Set;Ll/ۚܶ۠;)V

    .line 1112
    invoke-direct {p0}, Ll/֡ᩴ۠;->ᩳ()V

    .line 1113
    iget-object v1, p0, Ll/֡ᩴ۠;->ܿ:Ljava/util/HashMap;

    iput-object v1, v0, Ll/֡ᩴ۠;->ܿ:Ljava/util/HashMap;

    .line 1117
    invoke-static {v5}, Ll/֨ᩴ۠;->ܽ(Ll/֨ᩴ۠;)Ll/ۙۡ۠;

    move-result-object v3

    invoke-virtual {v3, p1, v2}, Ll/ۙۡ۠;->֫(Ljava/util/Set;Z)Ll/ۖܶ۠;

    move-result-object p1

    .line 1118
    iget-object v2, p0, Ll/֡ᩴ۠;->᩷:Ll/ۖܶ۠;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    invoke-virtual {p1, v2}, Ll/ۖܶ۠;->ܽ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object v2

    .line 1118
    iput-object v2, v0, Ll/֡ᩴ۠;->᩷:Ll/ۖܶ۠;

    .line 1121
    invoke-virtual {v0}, Ll/֡ᩴ۠;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1122
    invoke-static {v5}, Ll/֨ᩴ۠;->ܽ(Ll/֨ᩴ۠;)Ll/ۙۡ۠;

    move-result-object p1

    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۙۡ۠;->ۧ(Ll/ۖܶ۠;)V

    return-object v0

    .line 1126
    :cond_0
    invoke-static {v5}, Ll/֨ᩴ۠;->ܽ(Ll/֨ᩴ۠;)Ll/ۙۡ۠;

    move-result-object v3

    invoke-virtual {v3, v2}, Ll/ۙۡ۠;->ۧ(Ll/ۖܶ۠;)V

    iput-object v2, v0, Ll/֡ᩴ۠;->᩷:Ll/ۖܶ۠;

    .line 1128
    invoke-direct {v0, v1}, Ll/֡ᩴ۠;->֫(Ljava/util/HashMap;)Ll/ۖܶ۠;

    .line 1129
    invoke-direct {v0, p2}, Ll/֡ᩴ۠;->֫(Ljava/util/HashMap;)Ll/ۖܶ۠;

    move-result-object v1

    .line 1130
    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 1131
    iget-object v3, v0, Ll/֡ᩴ۠;->ܿ:Ljava/util/HashMap;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡֡֨;

    new-instance v6, Ll/۟۟ۚ;

    const/4 v7, 0x1

    invoke-direct {v6, v7}, Ll/۟۟ۚ;-><init>(I)V

    invoke-static {v3, v4, v6}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    goto :goto_0

    .line 1133
    :cond_1
    iget-object p2, v0, Ll/֡ᩴ۠;->᩷:Ll/ۖܶ۠;

    .line 1247
    iget-object v2, v0, Ll/֡ᩴ۠;->ۢ:Ll/֨ᩴ۠;

    invoke-static {v2}, Ll/֨ᩴ۠;->ܽ(Ll/֨ᩴ۠;)Ll/ۙۡ۠;

    move-result-object v2

    invoke-virtual {v2, p2}, Ll/ۙۡ۠;->֫(Ll/ۖܶ۠;)V

    .line 1135
    invoke-virtual {v0}, Ll/֡ᩴ۠;->ܽ()Z

    move-result p2

    if-eqz p2, :cond_2

    return-object v0

    .line 1139
    :cond_2
    invoke-static {v5, p1}, Ll/֨ᩴ۠;->ۧ(Ll/֨ᩴ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p2

    .line 1488
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v2

    .line 1489
    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const-string v6, "package-info"

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܳ֡֨;

    .line 1548
    iget-object v7, v4, Ll/ܳ֡֨;->ۨ:Ll/ᩳ᩶۠;

    sget-object v8, Ll/ܽ᩶۠;->᩶:Ll/ܽ᩶۠;

    .line 1544
    invoke-interface {v7, v6, v8}, Ll/ᩳ᩶۠;->֫(Ljava/lang/String;Ll/ܽ᩶۠;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 1548
    invoke-virtual {v4}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v6

    iget-object v6, v6, Ll/۠֡֨;->ܰ:Ll/ܳ֡֨;

    if-ne v6, v4, :cond_3

    goto :goto_1

    .line 1491
    :cond_3
    invoke-virtual {v2, v4}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v2

    goto :goto_1

    .line 1494
    :cond_4
    invoke-virtual {v2}, Ll/ۖܶ۠;->ᩳ()Ll/ۖܶ۠;

    move-result-object v2

    .line 1540
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    invoke-virtual {v2, p2}, Ll/ۖܶ۠;->ܽ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p2

    .line 1138
    iput-object p2, v0, Ll/֡ᩴ۠;->ۡ:Ll/ۖܶ۠;

    .line 1143
    invoke-static {v5, p1}, Ll/֨ᩴ۠;->֫(Ll/֨ᩴ۠;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p1

    .line 1508
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p2

    .line 1509
    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ֡֨;

    .line 1548
    iget-object v3, v2, Ll/ܳ֡֨;->ۨ:Ll/ᩳ᩶۠;

    sget-object v4, Ll/ܽ᩶۠;->᩶:Ll/ܽ᩶۠;

    .line 1544
    invoke-interface {v3, v6, v4}, Ll/ᩳ᩶۠;->֫(Ljava/lang/String;Ll/ܽ᩶۠;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 1548
    invoke-virtual {v2}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v3

    iget-object v3, v3, Ll/۠֡֨;->ܰ:Ll/ܳ֡֨;

    if-ne v3, v2, :cond_5

    .line 1511
    iget-object v2, v2, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    check-cast v2, Ll/۠֡֨;

    invoke-virtual {p2, v2}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p2

    goto :goto_2

    .line 1514
    :cond_6
    invoke-virtual {p2}, Ll/ۖܶ۠;->ᩳ()Ll/ۖܶ۠;

    move-result-object p2

    .line 1540
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    invoke-virtual {p2, p1}, Ll/ۖܶ۠;->ܽ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p1

    .line 1142
    iput-object p1, v0, Ll/֡ᩴ۠;->ۜ:Ll/ۖܶ۠;

    .line 1146
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, v0, Ll/֡ᩴ۠;->ܳ:Ll/ۖܶ۠;

    .line 1148
    invoke-virtual {v0}, Ll/֡ᩴ۠;->ۧ()V

    return-object v0
.end method

.method public final ֫()V
    .locals 0

    .line 1158
    invoke-direct {p0}, Ll/֡ᩴ۠;->ᩳ()V

    return-void
.end method

.method public final ֫(Z)V
    .locals 2

    if-eqz p1, :cond_0

    .line 1284
    iget-object p1, p0, Ll/֡ᩴ۠;->֫:Ll/ܳۗܽ;

    goto :goto_0

    .line 1285
    :cond_0
    iget-object p1, p0, Ll/֡ᩴ۠;->ۧ:Ll/ۖܰ֨;

    .line 1284
    :goto_0
    iget-object v0, p0, Ll/֡ᩴ۠;->ᩳ:Ll/ۚܶ۠;

    invoke-virtual {v0, p1}, Ll/ۚܶ۠;->֫(Ljava/util/function/Predicate;)V

    .line 1286
    iget-object p1, p0, Ll/֡ᩴ۠;->ۢ:Ll/֨ᩴ۠;

    iget-object v1, p1, Ll/֨ᩴ۠;->֫֫:Ll/᩹ܶ۠;

    invoke-virtual {v1, v0}, Ll/᩹ܶ۠;->֫(Ll/֨ܶ۠;)V

    .line 1287
    invoke-static {p1}, Ll/֨ᩴ۠;->ܽ(Ll/֨ᩴ۠;)Ll/ۙۡ۠;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ۙۡ۠;->֫(Ll/ۚܶ۠;)V

    return-void
.end method

.method public final ֫(ZZ)V
    .locals 11

    .line 1252
    iget-object v0, p0, Ll/֡ᩴ۠;->ᩳ:Ll/ۚܶ۠;

    iget-object v1, p0, Ll/֡ᩴ۠;->ۡ:Ll/ۖܶ۠;

    .line 1298
    iget-object v2, p0, Ll/֡ᩴ۠;->ۢ:Ll/֨ᩴ۠;

    invoke-static {v2}, Ll/֨ᩴ۠;->ᩴ(Ll/֨ᩴ۠;)Z

    move-result v3

    iget-object v4, v2, Ll/֨ᩴ۠;->֫֫:Ll/᩹ܶ۠;

    const/4 v5, 0x1

    if-nez v3, :cond_0

    invoke-static {v2}, Ll/֨ᩴ۠;->۠(Ll/֨ᩴ۠;)Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_0
    if-eqz p1, :cond_1

    .line 1299
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v1

    :goto_0
    if-eqz p1, :cond_2

    .line 1300
    sget-object v6, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    goto :goto_1

    :cond_2
    iget-object v6, p0, Ll/֡ᩴ۠;->ܽ:Ljava/util/LinkedHashSet;

    .line 1301
    :goto_1
    iget v7, p0, Ll/֡ᩴ۠;->᩻:I

    .line 1302
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "{"

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v9, ", "

    .line 1303
    invoke-virtual {v3, v9}, Ll/ۖܶ۠;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "}"

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1305
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    const/4 v9, 0x4

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v7, v9, v10

    aput-object v3, v9, v5

    const/4 v3, 0x2

    aput-object v6, v9, v3

    const/4 v3, 0x3

    aput-object v8, v9, v3

    const-string v3, "x.print.rounds"

    .line 1301
    invoke-virtual {v4, v3, v9}, Ll/᩹ܶ۠;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1254
    :cond_3
    invoke-static {v2}, Ll/֨ᩴ۠;->֡(Ll/֨ᩴ۠;)Ll/᩺ۖ֨;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩺ۖ֨;->֫()Z

    move-result v3

    if-nez v3, :cond_4

    .line 1255
    invoke-static {v2}, Ll/֨ᩴ۠;->֡(Ll/֨ᩴ۠;)Ll/᩺ۖ֨;

    move-result-object v3

    new-instance v6, Ll/᩷ۖ֨;

    sget-object v7, Ll/ۜۖ֨;->ۙ:Ll/ۜۖ֨;

    invoke-direct {v6, v7}, Ll/᩷ۖ֨;-><init>(Ll/ۜۖ֨;)V

    invoke-virtual {v3, v6}, Ll/᩺ۖ֨;->ۧ(Ll/᩷ۖ֨;)V

    :cond_4
    if-eqz p1, :cond_6

    .line 1259
    :try_start_0
    invoke-static {v2}, Ll/֨ᩴ۠;->᩷(Ll/֨ᩴ۠;)Ll/ܽᩴ۠;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1260
    sget-object p1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 1261
    new-instance v1, Ll/۠ᩴ۠;

    invoke-direct {v1, v5, p2, p1, v2}, Ll/۠ᩴ۠;-><init>(ZZLjava/util/Set;Ll/֨ᩴ۠;)V

    .line 1265
    invoke-static {v2}, Ll/֨ᩴ۠;->ܿ(Ll/֨ᩴ۠;)Ll/ܺᩴ۠;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 813
    iget-object p2, p1, Ll/ܺᩴ۠;->᩸:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    .line 856
    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 857
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩵ᩴ۠;

    .line 858
    iget-boolean v6, v3, Ll/᩵ᩴ۠;->֫:Z

    if-eqz v6, :cond_5

    .line 859
    iget-object v6, p1, Ll/ܺᩴ۠;->᩶:Ll/֨ᩴ۠;

    iget-object v3, v3, Ll/᩵ᩴ۠;->ۧ:Ll/᩸᩸۠;

    invoke-static {v6, v3, v1}, Ll/֨ᩴ۠;->֫(Ll/֨ᩴ۠;Ll/᩸᩸۠;Ll/۠ᩴ۠;)V

    goto :goto_2

    .line 1267
    :cond_6
    iget-object p1, p0, Ll/֡ᩴ۠;->ܽ:Ljava/util/LinkedHashSet;

    iget-object p2, p0, Ll/֡ᩴ۠;->ۜ:Ll/ۖܶ۠;

    iget-object v3, p0, Ll/֡ᩴ۠;->ܳ:Ll/ۖܶ۠;

    invoke-static {v2, p1, v1, p2, v3}, Ll/֨ᩴ۠;->֫(Ll/֨ᩴ۠;Ljava/util/LinkedHashSet;Ll/ۖܶ۠;Ll/ۖܶ۠;Ll/ۖܶ۠;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1278
    :cond_7
    invoke-static {v2}, Ll/֨ᩴ۠;->֡(Ll/֨ᩴ۠;)Ll/᩺ۖ֨;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩺ۖ֨;->֫()Z

    move-result p1

    if-nez p1, :cond_8

    .line 1279
    invoke-static {v2}, Ll/֨ᩴ۠;->֡(Ll/֨ᩴ۠;)Ll/᩺ۖ֨;

    move-result-object p1

    new-instance p2, Ll/᩷ۖ֨;

    sget-object v0, Ll/ۜۖ֨;->ۙ:Ll/ۜۖ֨;

    invoke-direct {p2, v0}, Ll/᩷ۖ֨;-><init>(Ll/ۜۖ֨;)V

    invoke-virtual {p1, p2}, Ll/᩺ۖ֨;->֫(Ll/᩷ۖ֨;)V

    :cond_8
    return-void

    :catchall_0
    move-exception p1

    .line 162
    :try_start_1
    new-instance p2, Ll/ܳۗܽ;

    invoke-direct {p2, v5}, Ll/ܳۗܽ;-><init>(I)V

    invoke-virtual {v0, p2}, Ll/ۚܶ۠;->֫(Ljava/util/function/Predicate;)V

    .line 1274
    invoke-virtual {v4, v0}, Ll/᩹ܶ۠;->֫(Ll/֨ܶ۠;)V

    .line 1275
    invoke-static {v2}, Ll/֨ᩴ۠;->ܽ(Ll/֨ᩴ۠;)Ll/ۙۡ۠;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Ll/ۙۡ۠;->֫(Ll/ۚܶ۠;)V

    .line 1276
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p1

    .line 1278
    invoke-static {v2}, Ll/֨ᩴ۠;->֡(Ll/֨ᩴ۠;)Ll/᩺ۖ֨;

    move-result-object p2

    invoke-virtual {p2}, Ll/᩺ۖ֨;->֫()Z

    move-result p2

    if-nez p2, :cond_9

    .line 1279
    invoke-static {v2}, Ll/֨ᩴ۠;->֡(Ll/֨ᩴ۠;)Ll/᩺ۖ֨;

    move-result-object p2

    new-instance v0, Ll/᩷ۖ֨;

    sget-object v1, Ll/ۜۖ֨;->ۙ:Ll/ۜۖ֨;

    invoke-direct {v0, v1}, Ll/᩷ۖ֨;-><init>(Ll/ۜۖ֨;)V

    invoke-virtual {p2, v0}, Ll/᩺ۖ֨;->֫(Ll/᩷ۖ֨;)V

    .line 1280
    :cond_9
    throw p1
.end method

.method public final ۧ()V
    .locals 4

    .line 1198
    new-instance v0, Ll/ۢᩴ۠;

    iget-object v1, p0, Ll/֡ᩴ۠;->ۢ:Ll/֨ᩴ۠;

    invoke-static {v1}, Ll/֨ᩴ۠;->ܳ(Ll/֨ᩴ۠;)Ll/᩸ۖ۠;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۢᩴ۠;-><init>(Ll/᩸ۖ۠;)V

    .line 1200
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v1, p0, Ll/֡ᩴ۠;->ܽ:Ljava/util/LinkedHashSet;

    .line 1201
    iget-object v1, p0, Ll/֡ᩴ۠;->ۡ:Ll/ۖܶ۠;

    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ֡֨;

    .line 1202
    iget-object v3, p0, Ll/֡ᩴ۠;->ܽ:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, v2, v3}, Ll/ۢᩴ۠;->֫(Ll/ۨ᩸۠;Ljava/util/Set;)Ljava/util/Set;

    goto :goto_0

    .line 1203
    :cond_0
    iget-object v1, p0, Ll/֡ᩴ۠;->ۜ:Ll/ۖܶ۠;

    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠֡֨;

    .line 1204
    iget-object v3, p0, Ll/֡ᩴ۠;->ܽ:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, v2, v3}, Ll/ۢᩴ۠;->֫(Ll/ۨ᩸۠;Ljava/util/Set;)Ljava/util/Set;

    goto :goto_1

    .line 1205
    :cond_1
    iget-object v1, p0, Ll/֡ᩴ۠;->ܳ:Ll/ۖܶ۠;

    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡֡֨;

    .line 1206
    iget-object v3, p0, Ll/֡ᩴ۠;->ܽ:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, v2, v3}, Ll/ۢᩴ۠;->֫(Ll/ۨ᩸۠;Ljava/util/Set;)Ljava/util/Set;

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final ܽ()Z
    .locals 6

    .line 1175
    iget-object v0, p0, Ll/֡ᩴ۠;->ۢ:Ll/֨ᩴ۠;

    invoke-static {v0}, Ll/֨ᩴ۠;->ܺ(Ll/֨ᩴ۠;)Ll/ܿᩴ۠;

    move-result-object v1

    .line 172
    iget v1, v1, Ll/ܿᩴ۠;->֫:I

    const/4 v2, 0x1

    if-lez v1, :cond_0

    return v2

    .line 1178
    :cond_0
    iget-object v1, p0, Ll/֡ᩴ۠;->ᩳ:Ll/ۚܶ۠;

    invoke-virtual {v1}, Ll/ۚܶ۠;->֫()Ljava/util/Queue;

    move-result-object v1

    check-cast v1, Ll/ᩴܶ۠;

    invoke-virtual {v1}, Ll/ᩴܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܽܶ۠;

    .line 1179
    sget-object v4, Ll/᩷ᩴ۠;->֫:[I

    invoke-virtual {v3}, Ll/ܽܶ۠;->֫()Ll/ۛ᩹۠;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    if-eq v4, v2, :cond_3

    const/4 v5, 0x2

    if-eq v4, v5, :cond_2

    goto :goto_0

    .line 1186
    :cond_2
    invoke-static {v0}, Ll/֨ᩴ۠;->ۜ(Ll/֨ᩴ۠;)Z

    move-result v4

    if-nez v4, :cond_4

    sget-object v4, Ll/᩶۠۠;->۬:Ll/᩶۠۠;

    invoke-virtual {v3, v4}, Ll/ܽܶ۠;->֫(Ll/᩶۠۠;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    .line 1181
    :cond_3
    invoke-static {v0}, Ll/֨ᩴ۠;->ܶ(Ll/֨ᩴ۠;)Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_4
    :goto_1
    return v2

    :cond_5
    const/4 v0, 0x0

    return v0
.end method
