.class public Ll/᩸᩹֨;
.super Ljava/lang/Object;
.source "440F"


# static fields
.field public static final ܿ:Ll/᩸᩹֨;


# instance fields
.field public ֫:Ll/۠᩹֨;

.field public final ۧ:Ll/ܳ֡֨;

.field public ܽ:Ll/ܽۘ֨;

.field public ᩳ:Ll/ܽۘ֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1358
    new-instance v0, Ll/ܶ᩹֨;

    const/4 v1, 0x0

    .line 1359
    invoke-direct {v0, v1, v1}, Ll/᩸᩹֨;-><init>(Ll/ܳ֡֨;Ll/۠᩹֨;)V

    .line 1358
    sput-object v0, Ll/᩸᩹֨;->ܿ:Ll/᩸᩹֨;

    return-void
.end method

.method public constructor <init>(Ll/ܳ֡֨;Ll/۠᩹֨;)V
    .locals 0

    .line 1283
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1284
    iput-object p1, p0, Ll/᩸᩹֨;->ۧ:Ll/ܳ֡֨;

    .line 1285
    iput-object p2, p0, Ll/᩸᩹֨;->֫:Ll/۠᩹֨;

    return-void
.end method

.method private ܳ()V
    .locals 3

    .line 233
    :goto_0
    iget-object v0, p0, Ll/᩸᩹֨;->ۧ:Ll/ܳ֡֨;

    iget-object v1, v0, Ll/ۛ֡֨;->᩸:Ll/ۜ֡֨;

    invoke-interface {v1}, Ll/ۜ֡֨;->ܽ()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1291
    invoke-virtual {v0}, Ll/ܳ֡֨;->᩶()V

    goto :goto_0

    .line 1293
    :cond_0
    iget-object v1, p0, Ll/᩸᩹֨;->֫:Ll/۠᩹֨;

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    .line 1295
    iput-object v2, p0, Ll/᩸᩹֨;->֫:Ll/۠᩹֨;

    .line 1296
    invoke-interface {v1, v0}, Ll/۠᩹֨;->֫(Ll/ܳ֡֨;)V

    :cond_1
    return-void
.end method

.method public static ᩻()Ll/᩸᩹֨;
    .locals 1

    .line 1355
    sget-object v0, Ll/᩸᩹֨;->ܿ:Ll/᩸᩹֨;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 1349
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Annotation type for: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩸᩹֨;->ۧ:Ll/ܳ֡֨;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫()Ljava/util/LinkedHashSet;
    .locals 8

    .line 1325
    invoke-direct {p0}, Ll/᩸᩹֨;->ܳ()V

    .line 1326
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1336
    iget-object v1, p0, Ll/᩸᩹֨;->ۧ:Ll/ܳ֡֨;

    invoke-virtual {v1}, Ll/ܳ֡֨;->᩶()V

    .line 1337
    iget-object v1, v1, Ll/ܳ֡֨;->֫֫:Ll/ܰ᩵֨;

    .line 1328
    sget-object v2, Ll/֨᩵֨;->᩹:Ll/֨᩵֨;

    const/4 v3, 0x0

    .line 82
    invoke-virtual {v1, v3, v2}, Ll/۟᩵֨;->֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object v1

    .line 1329
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֡֨;

    .line 1330
    iget-object v3, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v4, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v3, v4, :cond_0

    iget-object v3, v2, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v4, v3, Ll/ۤܶ۠;->᩸:Ll/۫ܶ۠;

    iget-object v4, v4, Ll/۫ܶ۠;->֫:Ll/ۛܶ۠;

    iget-object v4, v4, Ll/ۛܶ۠;->ۨ֫:Ll/ۤܶ۠;

    if-eq v3, v4, :cond_0

    .line 1332
    invoke-virtual {v2}, Ll/ۛ֡֨;->۬()J

    move-result-wide v3

    const-wide/16 v5, 0x1000

    and-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    .line 1333
    check-cast v2, Ll/ۘ֡֨;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final ֫(Ll/ܽۘ֨;)V
    .locals 1

    .line 1310
    iget-object v0, p0, Ll/᩸᩹֨;->ܽ:Ll/ܽۘ֨;

    invoke-static {v0}, Ll/۫ۙ;->ۧ(Ljava/lang/Object;)V

    .line 1311
    iput-object p1, p0, Ll/᩸᩹֨;->ܽ:Ll/ܽۘ֨;

    return-void
.end method

.method public ۧ()Ljava/util/LinkedHashSet;
    .locals 4

    .line 1338
    invoke-direct {p0}, Ll/᩸᩹֨;->ܳ()V

    .line 1339
    invoke-virtual {p0}, Ll/᩸᩹֨;->֫()Ljava/util/LinkedHashSet;

    move-result-object v0

    .line 1340
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1341
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘ֡֨;

    .line 1342
    iget-object v3, v2, Ll/ۘ֡֨;->᩺:Ll/ۡۘ֨;

    if-eqz v3, :cond_0

    .line 1343
    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final ۧ(Ll/ܽۘ֨;)V
    .locals 1

    .line 1320
    iget-object v0, p0, Ll/᩸᩹֨;->ᩳ:Ll/ܽۘ֨;

    invoke-static {v0}, Ll/۫ۙ;->ۧ(Ljava/lang/Object;)V

    .line 1321
    iput-object p1, p0, Ll/᩸᩹֨;->ᩳ:Ll/ܽۘ֨;

    return-void
.end method

.method public ܽ()Ll/ܽۘ֨;
    .locals 1

    .line 1305
    invoke-direct {p0}, Ll/᩸᩹֨;->ܳ()V

    .line 1306
    iget-object v0, p0, Ll/᩸᩹֨;->ܽ:Ll/ܽۘ֨;

    return-object v0
.end method

.method public ܿ()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/ܶ᩹֨;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public ᩳ()Ll/ܽۘ֨;
    .locals 1

    .line 1315
    invoke-direct {p0}, Ll/᩸᩹֨;->ܳ()V

    .line 1316
    iget-object v0, p0, Ll/᩸᩹֨;->ᩳ:Ll/ܽۘ֨;

    return-object v0
.end method
