.class public final Ll/۫ܽۖ;
.super Ljava/lang/Object;
.source "688Y"


# static fields
.field public static final ۖ:Ll/֡ᩳۖ;

.field public static final ۘ:Ll/֡ᩳۖ;

.field public static final ۡ:Ll/۠ܽۖ;

.field public static final ܺ:Ll/᩸ܽۖ;


# instance fields
.field public final ֫:Ljava/util/List;

.field public final ۜ:Ljava/util/List;

.field public final ۢ:Ll/ۧۤᩴ;

.field public final ۧ:Ljava/util/List;

.field public final ܳ:Z

.field public final ܽ:Ll/᩶ᩳۖ;

.field public final ܿ:Ll/᩸ܽۖ;

.field public final ᩳ:Ljava/util/List;

.field public final ᩷:Ljava/lang/ThreadLocal;

.field public final ᩻:Ll/ܰܿۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 155
    sget-object v0, Ll/᩸ܽۖ;->ᩳ:Ll/᩸ܽۖ;

    sput-object v0, Ll/۫ܽۖ;->ܺ:Ll/᩸ܽۖ;

    .line 162
    sget-object v0, Ll/۠ܽۖ;->᩹:Ll/۠ܽۖ;

    sput-object v0, Ll/۫ܽۖ;->ۡ:Ll/۠ܽۖ;

    .line 163
    sget-object v0, Ll/֡ᩳۖ;->᩶:Ll/֡ᩳۖ;

    sput-object v0, Ll/۫ܽۖ;->ۘ:Ll/֡ᩳۖ;

    .line 164
    sget-object v0, Ll/֡ᩳۖ;->ۙ:Ll/֡ᩳۖ;

    sput-object v0, Ll/۫ܽۖ;->ۖ:Ll/֡ᩳۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 253
    sget-object v0, Ll/ۗᩳۖ;->᩶:Ll/ۗᩳۖ;

    .line 256
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    sget-object v1, Ll/᩷ᩳۖ;->᩹:Ll/᩷ᩳۖ;

    .line 269
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 298
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 180
    new-instance v2, Ljava/lang/ThreadLocal;

    invoke-direct {v2}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v2, p0, Ll/۫ܽۖ;->᩷:Ljava/lang/ThreadLocal;

    .line 184
    new-instance v2, Ll/ۧۤᩴ;

    invoke-direct {v2}, Ll/ۧۤᩴ;-><init>()V

    iput-object v2, p0, Ll/۫ܽۖ;->ۢ:Ll/ۧۤᩴ;

    .line 302
    new-instance v2, Ll/᩶ᩳۖ;

    invoke-direct {v2}, Ll/᩶ᩳۖ;-><init>()V

    iput-object v2, p0, Ll/۫ܽۖ;->ܽ:Ll/᩶ᩳۖ;

    const/4 v3, 0x1

    .line 307
    iput-boolean v3, p0, Ll/۫ܽۖ;->ܳ:Z

    .line 308
    sget-object v3, Ll/۫ܽۖ;->ܺ:Ll/᩸ܽۖ;

    iput-object v3, p0, Ll/۫ܽۖ;->ܿ:Ll/᩸ܽۖ;

    .line 316
    iput-object v1, p0, Ll/۫ܽۖ;->֫:Ljava/util/List;

    .line 317
    iput-object v1, p0, Ll/۫ܽۖ;->ۧ:Ljava/util/List;

    .line 320
    iput-object v1, p0, Ll/۫ܽۖ;->ۜ:Ljava/util/List;

    .line 322
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 325
    sget-object v4, Ll/᩸᩻ۖ;->ۚ:Ll/ܶᩳۖ;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 326
    sget-object v4, Ll/۫ܽۖ;->ۘ:Ll/֡ᩳۖ;

    invoke-static {v4}, Ll/ۢܳۖ;->֫(Ll/ۚᩳۖ;)Ll/ܶᩳۖ;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 329
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 332
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 335
    sget-object v1, Ll/᩸᩻ۖ;->ۙ:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 336
    sget-object v1, Ll/᩸᩻ۖ;->᩵:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 337
    sget-object v1, Ll/᩸᩻ۖ;->ۜ:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 338
    sget-object v1, Ll/᩸᩻ۖ;->᩷:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 339
    sget-object v1, Ll/᩸᩻ۖ;->᩸:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 517
    sget-object v1, Ll/᩸᩻ۖ;->ܶ:Ll/۠ᩳۖ;

    .line 341
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class v5, Ljava/lang/Long;

    invoke-static {v4, v5, v1}, Ll/᩸᩻ۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;Ll/۠ᩳۖ;)Ll/ܶᩳۖ;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 453
    new-instance v4, Ll/᩹ܽۖ;

    invoke-direct {v4}, Ll/۠ᩳۖ;-><init>()V

    .line 343
    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-class v6, Ljava/lang/Double;

    invoke-static {v5, v6, v4}, Ll/᩸᩻ۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;Ll/۠ᩳۖ;)Ll/ܶᩳۖ;

    move-result-object v4

    .line 342
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 480
    new-instance v4, Ll/᩶ܽۖ;

    invoke-direct {v4}, Ll/۠ᩳۖ;-><init>()V

    .line 346
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const-class v6, Ljava/lang/Float;

    invoke-static {v5, v6, v4}, Ll/᩸᩻ۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;Ll/۠ᩳۖ;)Ll/ܶᩳۖ;

    move-result-object v4

    .line 345
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 348
    sget-object v4, Ll/۫ܽۖ;->ۖ:Ll/֡ᩳۖ;

    invoke-static {v4}, Ll/᩻ܳۖ;->֫(Ll/ۚᩳۖ;)Ll/ܶᩳۖ;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 349
    sget-object v4, Ll/᩸᩻ۖ;->ܽ:Ll/ܶᩳۖ;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 350
    sget-object v4, Ll/᩸᩻ۖ;->֫:Ll/ܶᩳۖ;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 541
    new-instance v4, Ll/ۙܽۖ;

    invoke-direct {v4, v1}, Ll/ۙܽۖ;-><init>(Ll/۠ᩳۖ;)V

    .line 552
    invoke-virtual {v4}, Ll/۠ᩳۖ;->֫()Ll/۠ᩳۖ;

    move-result-object v4

    .line 351
    const-class v5, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v5, v4}, Ll/᩸᩻ۖ;->֫(Ljava/lang/Class;Ll/۠ᩳۖ;)Ll/ܶᩳۖ;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 557
    new-instance v4, Ll/ۗܽۖ;

    invoke-direct {v4, v1}, Ll/ۗܽۖ;-><init>(Ll/۠ᩳۖ;)V

    .line 583
    invoke-virtual {v4}, Ll/۠ᩳۖ;->֫()Ll/۠ᩳۖ;

    move-result-object v1

    .line 353
    const-class v4, Ljava/util/concurrent/atomic/AtomicLongArray;

    invoke-static {v4, v1}, Ll/᩸᩻ۖ;->֫(Ljava/lang/Class;Ll/۠ᩳۖ;)Ll/ܶᩳۖ;

    move-result-object v1

    .line 352
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 354
    sget-object v1, Ll/᩸᩻ۖ;->ۧ:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 355
    sget-object v1, Ll/᩸᩻ۖ;->ۡ:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 356
    sget-object v1, Ll/᩸᩻ۖ;->᩶:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 357
    sget-object v1, Ll/᩸᩻ۖ;->᩹:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 358
    const-class v1, Ljava/math/BigDecimal;

    sget-object v4, Ll/᩸᩻ۖ;->ᩳ:Ll/۠ᩳۖ;

    invoke-static {v1, v4}, Ll/᩸᩻ۖ;->֫(Ljava/lang/Class;Ll/۠ᩳۖ;)Ll/ܶᩳۖ;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 359
    const-class v1, Ljava/math/BigInteger;

    sget-object v4, Ll/᩸᩻ۖ;->ܿ:Ll/۠ᩳۖ;

    invoke-static {v1, v4}, Ll/᩸᩻ۖ;->֫(Ljava/lang/Class;Ll/۠ᩳۖ;)Ll/ܶᩳۖ;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 362
    const-class v1, Ll/ܰᩳۖ;

    sget-object v4, Ll/᩸᩻ۖ;->֨:Ll/۠ᩳۖ;

    .line 363
    invoke-static {v1, v4}, Ll/᩸᩻ۖ;->֫(Ljava/lang/Class;Ll/۠ᩳۖ;)Ll/ܶᩳۖ;

    move-result-object v1

    .line 362
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 364
    sget-object v1, Ll/᩸᩻ۖ;->۬:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 365
    sget-object v1, Ll/᩸᩻ۖ;->ۗ:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 366
    sget-object v1, Ll/᩸᩻ۖ;->۫:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 367
    sget-object v1, Ll/᩸᩻ۖ;->ۖ:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 368
    sget-object v1, Ll/᩸᩻ۖ;->۠:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 369
    sget-object v1, Ll/᩸᩻ۖ;->ᩴ:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 370
    sget-object v1, Ll/᩸᩻ۖ;->ܳ:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 371
    sget-object v1, Ll/ۤܿۖ;->ܽ:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 372
    sget-object v1, Ll/᩸᩻ۖ;->ۢ:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 374
    sget-boolean v1, Ll/ۧۜۖ;->ۧ:Z

    if-eqz v1, :cond_0

    .line 375
    sget-object v1, Ll/ۧۜۖ;->ᩳ:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 376
    sget-object v1, Ll/ۧۜۖ;->֫:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 377
    sget-object v1, Ll/ۧۜۖ;->ܽ:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 380
    :cond_0
    sget-object v1, Ll/᩹ܿۖ;->ܽ:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 381
    sget-object v1, Ll/᩸᩻ۖ;->ܺ:Ll/ܶᩳۖ;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 384
    new-instance v1, Ll/ۙܿۖ;

    invoke-direct {v1, v2}, Ll/ۙܿۖ;-><init>(Ll/᩶ᩳۖ;)V

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 385
    new-instance v1, Ll/ᩳܳۖ;

    invoke-direct {v1, v2}, Ll/ᩳܳۖ;-><init>(Ll/᩶ᩳۖ;)V

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 386
    new-instance v1, Ll/ܰܿۖ;

    invoke-direct {v1, v2}, Ll/ܰܿۖ;-><init>(Ll/᩶ᩳۖ;)V

    iput-object v1, p0, Ll/۫ܽۖ;->᩻:Ll/ܰܿۖ;

    .line 387
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 388
    sget-object v4, Ll/᩸᩻ۖ;->ۘ:Ll/ܶᩳۖ;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 389
    new-instance v4, Ll/ۚܳۖ;

    sget-object v5, Ll/۫ܽۖ;->ۡ:Ll/۠ܽۖ;

    invoke-direct {v4, v2, v5, v0, v1}, Ll/ۚܳۖ;-><init>(Ll/᩶ᩳۖ;Ll/ܶܽۖ;Ll/ۗᩳۖ;Ll/ܰܿۖ;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 397
    invoke-static {v3}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/۫ܽۖ;->ᩳ:Ljava/util/List;

    return-void
.end method

.method public static ֫(D)V
    .locals 2

    .line 507
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 508
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p0, " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1535
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{serializeNulls:false,factories:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/۫ܽۖ;->ᩳ:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",instanceCreators:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۫ܽۖ;->ܽ:Ll/᩶ᩳۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/Object;
    .locals 10

    .line 2
    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityOptions;

    .line 1106
    invoke-static {v0}, Ll/ܽۜۖ;->֫(Ljava/lang/Class;)Ll/ܽۜۖ;

    move-result-object v0

    const/4 v1, 0x0

    if-nez p1, :cond_0

    return-object v1

    .line 1168
    :cond_0
    new-instance v2, Ljava/io/StringReader;

    invoke-direct {v2, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 1077
    new-instance p1, Ll/ܿۜۖ;

    invoke-direct {p1, v2}, Ll/ܿۜۖ;-><init>(Ljava/io/StringReader;)V

    .line 1078
    sget-object v2, Ll/ܺᩳۖ;->᩹:Ll/ܺᩳۖ;

    invoke-virtual {p1, v2}, Ll/ܿۜۖ;->֫(Ll/ܺᩳۖ;)V

    const-string v3, "AssertionError (GSON 2.13.2): "

    const-string v4, "Type adapter \'"

    .line 1345
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۘ()Ll/ܺᩳۖ;

    move-result-object v5

    .line 1349
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۘ()Ll/ܺᩳۖ;

    move-result-object v6

    if-ne v6, v2, :cond_1

    .line 1351
    sget-object v2, Ll/ܺᩳۖ;->᩶:Ll/ܺᩳۖ;

    invoke-virtual {p1, v2}, Ll/ܿۜۖ;->֫(Ll/ܺᩳۖ;)V

    .line 1355
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    .line 1357
    :try_start_1
    invoke-virtual {p0, v0}, Ll/۫ܽۖ;->֫(Ll/ܽۜۖ;)Ll/۠ᩳۖ;

    move-result-object v6

    .line 1358
    invoke-virtual {v6, p1}, Ll/۠ᩳۖ;->֫(Ll/ܿۜۖ;)Ljava/lang/Object;

    move-result-object v7

    .line 1359
    invoke-virtual {v0}, Ll/ܽۜۖ;->֫()Ljava/lang/Class;

    move-result-object v8

    invoke-static {v8}, Ll/ۗᩳۘ;->֫(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v8

    if-eqz v7, :cond_3

    .line 1360
    invoke-virtual {v8, v7}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_0

    .line 1361
    :cond_2
    new-instance v8, Ljava/lang/ClassCastException;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "\' returned wrong type; requested "

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1365
    invoke-virtual {v0}, Ll/ܽۜۖ;->֫()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " but got instance of "

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1367
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\nVerify that the adapter was registered for the correct type."

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v8
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1389
    :cond_3
    :goto_0
    invoke-virtual {p1, v5}, Ll/ܿۜۖ;->֫(Ll/ܺᩳۖ;)V

    move-object v1, v7

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v0

    .line 1386
    :try_start_2
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1387
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception v0

    .line 1384
    new-instance v1, Ll/ܳᩳۖ;

    .line 62
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1384
    throw v1

    :catch_3
    move-exception v0

    .line 1381
    new-instance v1, Ll/ܳᩳۖ;

    .line 62
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1381
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_4
    move-exception v0

    const/4 v2, 0x1

    :goto_1
    if-eqz v2, :cond_6

    .line 1389
    invoke-virtual {p1, v5}, Ll/ܿۜۖ;->֫(Ll/ܺᩳۖ;)V

    :goto_2
    if-eqz v1, :cond_5

    .line 1476
    :try_start_3
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object p1

    sget-object v0, Ll/ܳۜۖ;->۬:Ll/ܳۜۖ;

    if-ne p1, v0, :cond_4

    goto :goto_3

    .line 1477
    :cond_4
    new-instance p1, Ll/ܳᩳۖ;

    const-string v0, "JSON document was not fully consumed."

    .line 42
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 1477
    throw p1
    :try_end_3
    .catch Ll/ۜۜۖ; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    :catch_5
    move-exception p1

    .line 1482
    new-instance v0, Ll/ܰܽۖ;

    .line 62
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1482
    throw v0

    :catch_6
    move-exception p1

    .line 1480
    new-instance v0, Ll/ܳᩳۖ;

    .line 62
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1480
    throw v0

    :cond_5
    :goto_3
    return-object v1

    .line 1379
    :cond_6
    :try_start_4
    new-instance v1, Ll/ܳᩳۖ;

    .line 62
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1379
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1389
    :goto_4
    invoke-virtual {p1, v5}, Ll/ܿۜۖ;->֫(Ll/ܺᩳۖ;)V

    .line 1390
    throw v0
.end method

.method public final ֫(Ll/ܶᩳۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;
    .locals 3

    const-string v0, "skipPast must not be null"

    .line 730
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "type must not be null"

    .line 731
    invoke-static {p2, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 733
    iget-object v0, p0, Ll/۫ܽۖ;->᩻:Ll/ܰܿۖ;

    invoke-virtual {v0, p1, p2}, Ll/ܰܿۖ;->֫(Ll/ܶᩳۖ;Ll/ܽۜۖ;)Z

    move-result v1

    if-eqz v1, :cond_0

    move-object p1, v0

    .line 738
    :cond_0
    iget-object v0, p0, Ll/۫ܽۖ;->ᩳ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶᩳۖ;

    if-nez v1, :cond_2

    if-ne v2, p1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    .line 746
    :cond_2
    invoke-interface {v2, p0, p2}, Ll/ܶᩳۖ;->֫(Ll/۫ܽۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    :cond_3
    if-nez v1, :cond_4

    .line 756
    invoke-virtual {p0, p2}, Ll/۫ܽۖ;->֫(Ll/ܽۜۖ;)Ll/۠ᩳۖ;

    move-result-object p1

    return-object p1

    .line 753
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GSON cannot serialize or deserialize "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ܽۜۖ;)Ll/۠ᩳۖ;
    .locals 8

    const-string v0, "type must not be null"

    .line 598
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 599
    iget-object v0, p0, Ll/۫ܽۖ;->ۢ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ᩳۖ;

    if-eqz v1, :cond_0

    return-object v1

    .line 606
    :cond_0
    iget-object v1, p0, Ll/۫ܽۖ;->᩷:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    if-nez v2, :cond_1

    .line 609
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 610
    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    const/4 v3, 0x1

    goto :goto_0

    .line 615
    :cond_1
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۠ᩳۖ;

    if-eqz v3, :cond_2

    return-object v3

    :cond_2
    const/4 v3, 0x0

    .line 623
    :goto_0
    :try_start_0
    new-instance v4, Ll/۬ܽۖ;

    invoke-direct {v4}, Ll/۬ܽۖ;-><init>()V

    .line 624
    invoke-interface {v2, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 626
    iget-object v5, p0, Ll/۫ܽۖ;->ᩳ:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v6, 0x0

    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܶᩳۖ;

    .line 627
    invoke-interface {v6, p0, p1}, Ll/ܶᩳۖ;->֫(Ll/۫ܽۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;

    move-result-object v6

    if-eqz v6, :cond_3

    .line 629
    invoke-virtual {v4, v6}, Ll/۬ܽۖ;->֫(Ll/۠ᩳۖ;)V

    .line 631
    invoke-interface {v2, p1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    if-eqz v3, :cond_5

    .line 637
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    :cond_5
    if-eqz v6, :cond_7

    if-eqz v3, :cond_6

    .line 653
    invoke-virtual {v0, v2}, Ll/ۧۤᩴ;->putAll(Ljava/util/Map;)V

    :cond_6
    return-object v6

    .line 642
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "GSON (2.13.2) cannot handle "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception p1

    if-eqz v3, :cond_8

    .line 637
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 639
    :cond_8
    throw p1
.end method

.method public final ֫(Ljava/io/Writer;)Ll/᩻ۜۖ;
    .locals 1

    .line 1056
    new-instance v0, Ll/᩻ۜۖ;

    invoke-direct {v0, p1}, Ll/᩻ۜۖ;-><init>(Ljava/io/Writer;)V

    .line 1057
    iget-object p1, p0, Ll/۫ܽۖ;->ܿ:Ll/᩸ܽۖ;

    invoke-virtual {v0, p1}, Ll/᩻ۜۖ;->֫(Ll/᩸ܽۖ;)V

    .line 1058
    iget-boolean p1, p0, Ll/۫ܽۖ;->ܳ:Z

    invoke-virtual {v0, p1}, Ll/᩻ۜۖ;->֫(Z)V

    .line 1059
    sget-object p1, Ll/ܺᩳۖ;->᩹:Ll/ܺᩳۖ;

    invoke-virtual {v0, p1}, Ll/᩻ۜۖ;->֫(Ll/ܺᩳۖ;)V

    const/4 p1, 0x0

    .line 1060
    invoke-virtual {v0, p1}, Ll/᩻ۜۖ;->ۧ(Z)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Class;Ll/᩻ۜۖ;)V
    .locals 5

    const-string v0, "AssertionError (GSON 2.13.2): "

    .line 927
    invoke-static {p2}, Ll/ܽۜۖ;->֫(Ljava/lang/reflect/Type;)Ll/ܽۜۖ;

    move-result-object p2

    invoke-virtual {p0, p2}, Ll/۫ܽۖ;->֫(Ll/ܽۜۖ;)Ll/۠ᩳۖ;

    move-result-object p2

    .line 929
    invoke-virtual {p3}, Ll/᩻ۜۖ;->ۜ()Ll/ܺᩳۖ;

    move-result-object v1

    .line 932
    invoke-virtual {p3}, Ll/᩻ۜۖ;->ۜ()Ll/ܺᩳۖ;

    move-result-object v2

    sget-object v3, Ll/ܺᩳۖ;->᩹:Ll/ܺᩳۖ;

    if-ne v2, v3, :cond_0

    .line 934
    sget-object v2, Ll/ܺᩳۖ;->᩶:Ll/ܺᩳۖ;

    invoke-virtual {p3, v2}, Ll/᩻ۜۖ;->֫(Ll/ܺᩳۖ;)V

    .line 937
    :cond_0
    invoke-virtual {p3}, Ll/᩻ۜۖ;->ۖ()Z

    move-result v2

    .line 938
    invoke-virtual {p3}, Ll/᩻ۜۖ;->᩻()Z

    move-result v3

    .line 940
    iget-boolean v4, p0, Ll/۫ܽۖ;->ܳ:Z

    invoke-virtual {p3, v4}, Ll/᩻ۜۖ;->֫(Z)V

    const/4 v4, 0x0

    .line 941
    invoke-virtual {p3, v4}, Ll/᩻ۜۖ;->ۧ(Z)V

    .line 943
    :try_start_0
    invoke-virtual {p2, p3, p1}, Ll/۠ᩳۖ;->֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 950
    invoke-virtual {p3, v1}, Ll/᩻ۜۖ;->֫(Ll/ܺᩳۖ;)V

    .line 951
    invoke-virtual {p3, v2}, Ll/᩻ۜۖ;->֫(Z)V

    .line 952
    invoke-virtual {p3, v3}, Ll/᩻ۜۖ;->ۧ(Z)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 947
    :try_start_1
    new-instance p2, Ljava/lang/AssertionError;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 948
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 945
    new-instance p2, Ll/ܰܽۖ;

    .line 62
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 945
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 950
    :goto_0
    invoke-virtual {p3, v1}, Ll/᩻ۜۖ;->֫(Ll/ܺᩳۖ;)V

    .line 951
    invoke-virtual {p3, v2}, Ll/᩻ۜۖ;->֫(Z)V

    .line 952
    invoke-virtual {p3, v3}, Ll/᩻ۜۖ;->ۧ(Z)V

    .line 953
    throw p1
.end method

.method public final ֫(Ll/᩺ܽۖ;Ll/᩻ۜۖ;)V
    .locals 6

    const-string v0, "AssertionError (GSON 2.13.2): "

    .line 1007
    invoke-virtual {p2}, Ll/᩻ۜۖ;->ۜ()Ll/ܺᩳۖ;

    move-result-object v1

    .line 1008
    invoke-virtual {p2}, Ll/᩻ۜۖ;->ۖ()Z

    move-result v2

    .line 1009
    invoke-virtual {p2}, Ll/᩻ۜۖ;->᩻()Z

    move-result v3

    .line 1011
    iget-boolean v4, p0, Ll/۫ܽۖ;->ܳ:Z

    invoke-virtual {p2, v4}, Ll/᩻ۜۖ;->֫(Z)V

    const/4 v4, 0x0

    .line 1012
    invoke-virtual {p2, v4}, Ll/᩻ۜۖ;->ۧ(Z)V

    .line 1016
    invoke-virtual {p2}, Ll/᩻ۜۖ;->ۜ()Ll/ܺᩳۖ;

    move-result-object v4

    sget-object v5, Ll/ܺᩳۖ;->᩹:Ll/ܺᩳۖ;

    if-ne v4, v5, :cond_0

    .line 1018
    sget-object v4, Ll/ܺᩳۖ;->᩶:Ll/ܺᩳۖ;

    invoke-virtual {p2, v4}, Ll/᩻ۜۖ;->֫(Ll/ܺᩳۖ;)V

    .line 68
    :cond_0
    :try_start_0
    sget-object v4, Ll/᩸᩻ۖ;->֡:Ll/۠ᩳۖ;

    invoke-virtual {v4, p2, p1}, Ll/۠ᩳۖ;->֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1029
    invoke-virtual {p2, v1}, Ll/᩻ۜۖ;->֫(Ll/ܺᩳۖ;)V

    .line 1030
    invoke-virtual {p2, v2}, Ll/᩻ۜۖ;->֫(Z)V

    .line 1031
    invoke-virtual {p2, v3}, Ll/᩻ۜۖ;->ۧ(Z)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 1026
    :try_start_1
    new-instance v4, Ljava/lang/AssertionError;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1027
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    :catch_1
    move-exception p1

    .line 1024
    new-instance v0, Ll/ܰܽۖ;

    .line 62
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1024
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1029
    :goto_0
    invoke-virtual {p2, v1}, Ll/᩻ۜۖ;->֫(Ll/ܺᩳۖ;)V

    .line 1030
    invoke-virtual {p2, v2}, Ll/᩻ۜۖ;->֫(Z)V

    .line 1031
    invoke-virtual {p2, v3}, Ll/᩻ۜۖ;->ۧ(Z)V

    .line 1032
    throw p1
.end method
