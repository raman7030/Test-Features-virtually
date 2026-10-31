.class public final Ll/ܰܽۘ;
.super Ll/ۖᩳۘ;
.source "39JX"


# static fields
.field public static final ۜ֫:Ll/ᩴᩳۘ;

.field public static ܳ֫:Ll/ᩴᩳۘ;

.field public static final ᩻֫:Ll/ᩴᩳۘ;


# instance fields
.field public final ܿ֫:Ll/ۘܽۘ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 212
    new-instance v0, Ll/ۤܽۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܰܽۘ;->᩻֫:Ll/ᩴᩳۘ;

    .line 229
    new-instance v0, Ll/ۛܽۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܰܽۘ;->ۜ֫:Ll/ᩴᩳۘ;

    .line 427
    new-instance v0, Ll/ۨܽۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܰܽۘ;->ܳ֫:Ll/ᩴᩳۘ;

    return-void
.end method

.method public constructor <init>(Ll/ܽۧۘ;Ll/᩵ᩳۘ;Ll/ۘܽۘ;)V
    .locals 0

    .line 91
    invoke-direct {p0, p1, p2}, Ll/ۖᩳۘ;-><init>(Ll/ܽۧۘ;Ll/᩵ᩳۘ;)V

    .line 92
    iput-object p3, p0, Ll/ܰܽۘ;->ܿ֫:Ll/ۘܽۘ;

    return-void
.end method

.method public static ֫(Ll/ܰܽۘ;Ll/ܽۧۘ;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ll/۠ۛۖ;Ljava/util/Set;)Ll/᩺ܽۘ;
    .locals 14

    move-object v0, p0

    move-object v9, p1

    .line 107
    invoke-virtual/range {p0 .. p6}, Ll/ۖᩳۘ;->֫(Ll/ܽۧۘ;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ll/۠ۛۖ;Ljava/util/Set;)Ll/᩶ۨۖ;

    move-result-object v10

    .line 109
    :try_start_0
    iget-object v11, v0, Ll/ܰܽۘ;->ܿ֫:Ll/ۘܽۘ;

    iget-object v12, v0, Ll/ۖᩳۘ;->ۗ:Ll/ܶܽۘ;

    new-instance v13, Ll/۬ܽۘ;

    move-object v1, v13

    move-object v2, p0

    move-object v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    invoke-direct/range {v1 .. v8}, Ll/۬ܽۘ;-><init>(Ll/ܰܽۘ;Ll/ܽۧۘ;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ll/۠ۛۖ;Ljava/util/Set;)V

    invoke-interface {v11, v12, v10, p1, v13}, Ll/ۘܽۘ;->֫(Ll/ܶܽۘ;Ll/ܽۨۖ;Ll/ܽۧۘ;Ll/ۖܽۘ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺ܽۘ;

    if-eqz v1, :cond_0

    return-object v1

    .line 125
    :cond_0
    new-instance v1, Ll/᩺ܽۘ;

    invoke-direct {v1, v10, p1, p0}, Ll/᩺ܽۘ;-><init>(Ll/᩶ۨۖ;Ll/ܽۧۘ;Ll/ܰܽۘ;)V
    :try_end_0
    .catch Ll/ܺܽۘ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    .line 127
    new-instance v1, Ll/֨ۨۖ;

    invoke-virtual {v0}, Ll/ܺܽۘ;->ۧ()J

    move-result-wide v2

    sget-object v4, Ll/᩺ۛۖ;->۬:Ll/᩺ۛۖ;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Cannot resolve path "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    move-object p0, v1

    move-wide p1, v2

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v0

    invoke-direct/range {p0 .. p5}, Ll/֨ۨۖ;-><init>(JLl/᩺ۛۖ;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1
.end method

.method private ֫(Ljava/lang/String;Ljava/util/EnumSet;Ll/ᩴᩳۘ;)Z
    .locals 8

    .line 247
    :try_start_0
    sget-object v0, Ll/ۨ۫ۖ;->ᩳ֫:Ll/ۨ۫ۖ;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v3

    sget-object v0, Ll/֫ۤۖ;->ۛ:Ll/֫ۤۖ;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v4

    sget-object v5, Ll/ۜۨۖ;->᩶:Ljava/util/Set;

    sget-object v6, Ll/۠ۛۖ;->ۙ:Ll/۠ۛۖ;

    move-object v1, p0

    move-object v2, p1

    move-object v7, p2

    invoke-virtual/range {v1 .. v7}, Ll/ܰܽۘ;->֫(Ljava/lang/String;Ljava/util/Set;Ljava/util/EnumSet;Ljava/util/Set;Ll/۠ۛۖ;Ljava/util/EnumSet;)Ll/ۗܽۘ;

    move-result-object p1

    const/4 p2, 0x1

    .line 249
    invoke-virtual {p1}, Ll/ۗܽۘ;->close()V
    :try_end_0
    .catch Ll/֨ۨۖ; {:try_start_0 .. :try_end_0} :catch_0

    return p2

    :catch_0
    move-exception p1

    .line 250
    invoke-virtual {p1}, Ll/֨ۨۖ;->ۧ()J

    move-result-wide v0

    invoke-interface {p3, v0, v1}, Ll/ᩴᩳۘ;->֫(J)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 253
    :cond_0
    throw p1
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 566
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DiskShare["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    iget-object v1, p0, Ll/ۖᩳۘ;->۫:Ll/ܽۧۘ;

    .line 566
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/util/Set;Ljava/util/EnumSet;Ljava/util/Set;Ll/۠ۛۖ;Ljava/util/EnumSet;)Ll/ۗܽۘ;
    .locals 13

    move-object v9, p0

    .line 96
    new-instance v10, Ll/ܽۧۘ;

    iget-object v0, v9, Ll/ۖᩳۘ;->۫:Ll/ܽۧۘ;

    move-object v1, p1

    invoke-direct {v10, v0, p1}, Ll/ܽۧۘ;-><init>(Ll/ܽۧۘ;Ljava/lang/String;)V

    .line 137
    :try_start_0
    iget-object v0, v9, Ll/ܰܽۘ;->ܿ֫:Ll/ۘܽۘ;

    iget-object v11, v9, Ll/ۖᩳۘ;->ۗ:Ll/ܶܽۘ;

    new-instance v12, Ll/۫ܽۘ;

    move-object v1, v12

    move-object v2, p0

    move-object v3, v10

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    invoke-direct/range {v1 .. v8}, Ll/۫ܽۘ;-><init>(Ll/ܰܽۘ;Ll/ܽۧۘ;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ll/۠ۛۖ;Ljava/util/Set;)V

    invoke-interface {v0, v11, v10, v12}, Ll/ۘܽۘ;->֫(Ll/ܶܽۘ;Ll/ܽۧۘ;Ll/ۖܽۘ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ܽۘ;
    :try_end_0
    .catch Ll/ܺܽۘ; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    iget-object v1, v0, Ll/᩺ܽۘ;->֫:Ll/᩶ۨۖ;

    iget-object v2, v0, Ll/᩺ܽۘ;->ܽ:Ll/ܽۧۘ;

    iget-object v0, v0, Ll/᩺ܽۘ;->ۧ:Ll/ܰܽۘ;

    .line 166
    invoke-virtual {v1}, Ll/᩶ۨۖ;->ۜ()Ljava/util/EnumSet;

    move-result-object v3

    sget-object v4, Ll/֫ۤۖ;->ۗ:Ll/֫ۤۖ;

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 167
    new-instance v3, Ll/ۙܽۘ;

    invoke-virtual {v1}, Ll/᩶ۨۖ;->᩷()Ll/۫ۛۖ;

    move-result-object v1

    .line 44
    invoke-direct {v3, v1, v0, v2}, Ll/ۗܽۘ;-><init>(Ll/۫ۛۖ;Ll/ܰܽۘ;Ll/ܽۧۘ;)V

    return-object v3

    .line 169
    :cond_0
    new-instance v3, Ll/۟ܽۘ;

    invoke-virtual {v1}, Ll/᩶ۨۖ;->᩷()Ll/۫ۛۖ;

    move-result-object v1

    invoke-direct {v3, v1, v0, v2}, Ll/۟ܽۘ;-><init>(Ll/۫ۛۖ;Ll/ܰܽۘ;Ll/ܽۧۘ;)V

    return-object v3

    :catch_0
    move-exception v0

    .line 148
    new-instance v1, Ll/֨ۨۖ;

    invoke-virtual {v0}, Ll/ܺܽۘ;->֫()Ll/۟۫ۖ;

    move-result-object v2

    invoke-virtual {v2}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v2

    sget-object v4, Ll/᩺ۛۖ;->۬:Ll/᩺ۛۖ;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Cannot resolve path "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    move-object p1, v1

    move-wide p2, v2

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v0

    invoke-direct/range {p1 .. p6}, Ll/֨ۨۖ;-><init>(JLl/᩺ۛۖ;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1
.end method

.method public final ֫(Ljava/lang/String;Ljava/util/EnumSet;Ljava/util/EnumSet;Ljava/util/Set;Ll/۠ۛۖ;Ljava/util/EnumSet;)Ll/ۙܽۘ;
    .locals 7

    if-eqz p6, :cond_0

    .line 177
    invoke-static {p6}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object p6

    goto :goto_0

    :cond_0
    const-class p6, Ll/ܶۛۖ;

    invoke-static {p6}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object p6

    :goto_0
    move-object v6, p6

    .line 178
    sget-object p6, Ll/ܶۛۖ;->ۗ:Ll/ܶۛۖ;

    invoke-virtual {v6, p6}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 179
    sget-object p6, Ll/ܶۛۖ;->۫:Ll/ܶۛۖ;

    invoke-virtual {v6, p6}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    if-eqz p3, :cond_1

    .line 181
    invoke-static {p3}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object p3

    goto :goto_1

    :cond_1
    const-class p3, Ll/֫ۤۖ;

    invoke-static {p3}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object p3

    :goto_1
    move-object v3, p3

    .line 182
    sget-object p3, Ll/֫ۤۖ;->ۗ:Ll/֫ۤۖ;

    invoke-virtual {v3, p3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    .line 184
    invoke-virtual/range {v0 .. v6}, Ll/ܰܽۘ;->֫(Ljava/lang/String;Ljava/util/Set;Ljava/util/EnumSet;Ljava/util/Set;Ll/۠ۛۖ;Ljava/util/EnumSet;)Ll/ۗܽۘ;

    move-result-object p1

    check-cast p1, Ll/ۙܽۘ;

    return-object p1
.end method

.method public final ֫()Ll/ᩴᩳۘ;
    .locals 1

    .line 103
    iget-object v0, p0, Ll/ܰܽۘ;->ܿ֫:Ll/ۘܽۘ;

    invoke-interface {v0}, Ll/ۘܽۘ;->֫()Ll/ᩴᩳۘ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Z)V
    .locals 7

    if-eqz p1, :cond_6

    .line 438
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    if-eqz p2, :cond_4

    .line 443
    :try_start_0
    invoke-virtual {p0, p1}, Ll/ܰܽۘ;->ᩳ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p2

    .line 444
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۤۖ;

    .line 445
    invoke-virtual {v0}, Ll/᩷ۤۖ;->֫()Ljava/lang/String;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ll/᩷ۤۖ;->֫()Ljava/lang/String;

    move-result-object v1

    const-string v2, ".."

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 448
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\\"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ll/᩷ۤۖ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 449
    invoke-virtual {v0}, Ll/ۖۤۖ;->ܿ()J

    move-result-wide v2

    sget-object v0, Ll/֫ۤۖ;->ۗ:Ll/֫ۤۖ;

    invoke-static {v2, v3, v0}, Ll/ܶܰۖ;->֫(JLl/᩸ܰۖ;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 450
    invoke-virtual {p0, v1}, Ll/ܰܽۘ;->ܿ(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    .line 452
    invoke-virtual {p0, v1, v0}, Ll/ܰܽۘ;->֫(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    .line 455
    invoke-virtual {p0, p1, p2}, Ll/ܰܽۘ;->֫(Ljava/lang/String;Z)V

    return-void

    .line 457
    :cond_4
    sget-object p2, Ll/ۨ۫ۖ;->ۨ:Ll/ۨ۫ۖ;

    .line 459
    invoke-static {p2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v2

    sget-object p2, Ll/֫ۤۖ;->ۗ:Ll/֫ۤۖ;

    .line 460
    invoke-static {p2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v3

    sget-object p2, Ll/ۜۨۖ;->ۙ:Ll/ۜۨۖ;

    sget-object v0, Ll/ۜۨۖ;->۬:Ll/ۜۨۖ;

    sget-object v1, Ll/ۜۨۖ;->ۗ:Ll/ۜۨۖ;

    .line 461
    invoke-static {p2, v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v4

    sget-object v5, Ll/۠ۛۖ;->ۙ:Ll/۠ۛۖ;

    sget-object p2, Ll/ܶۛۖ;->ۗ:Ll/ܶۛۖ;

    .line 463
    invoke-static {p2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    .line 457
    invoke-virtual/range {v0 .. v6}, Ll/ܰܽۘ;->֫(Ljava/lang/String;Ljava/util/Set;Ljava/util/EnumSet;Ljava/util/Set;Ll/۠ۛۖ;Ljava/util/EnumSet;)Ll/ۗܽۘ;

    move-result-object p1
    :try_end_0
    .catch Ll/֨ۨۖ; {:try_start_0 .. :try_end_0} :catch_0

    .line 229
    :try_start_1
    iget-object p2, p1, Ll/ۗܽۘ;->ۙ:Ll/ܰܽۘ;

    iget-object v0, p1, Ll/ۗܽۘ;->᩸:Ll/۫ۛۖ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    new-instance v1, Ll/ۢۤۖ;

    .line 25
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 359
    new-instance v2, Ll/֡֫ۘ;

    invoke-direct {v2}, Ll/֡֫ۘ;-><init>()V

    .line 360
    invoke-static {v1}, Ll/ܳۛۖ;->֫(Ll/ۡۛۖ;)Ll/᩵ۤۖ;

    move-result-object v3

    .line 361
    invoke-interface {v3, v1, v2}, Ll/᩵ۤۖ;->֫(Ll/ۡۛۖ;Ll/֡֫ۘ;)V

    .line 363
    sget-object v1, Ll/ۜ᩺ۖ;->᩶:Ll/ۜ᩺ۖ;

    .line 367
    invoke-interface {v3}, Ll/᩵ۤۖ;->֫()Ll/ۧۤۖ;

    move-result-object v3

    .line 368
    invoke-virtual {v2}, Ll/ۤܰۖ;->ᩳ()[B

    move-result-object v2

    .line 363
    invoke-virtual {p2, v0, v1, v3, v2}, Ll/ۖᩳۘ;->֫(Ll/۫ۛۖ;Ll/ۜ᩺ۖ;Ll/ۧۤۖ;[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 466
    :try_start_2
    invoke-virtual {p1}, Ll/ۗܽۘ;->close()V
    :try_end_2
    .catch Ll/֨ۨۖ; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catchall_0
    move-exception p2

    .line 457
    :try_start_3
    invoke-virtual {p1}, Ll/ۗܽۘ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p2
    :try_end_4
    .catch Ll/֨ۨۖ; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    .line 469
    invoke-virtual {p1}, Ll/֨ۨۖ;->ۧ()J

    move-result-wide v0

    sget-object p2, Ll/ܰܽۘ;->ܳ֫:Ll/ᩴᩳۘ;

    check-cast p2, Ll/ۨܽۘ;

    invoke-virtual {p2, v0, v1}, Ll/ۨܽۘ;->֫(J)Z

    move-result p2

    if-eqz p2, :cond_5

    return-void

    .line 472
    :cond_5
    throw p1

    .line 439
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "rmdir: path should be non-null and non-empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 2

    .line 226
    sget-object v0, Ll/ܶۛۖ;->۫:Ll/ܶۛۖ;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sget-object v1, Ll/ܰܽۘ;->᩻֫:Ll/ᩴᩳۘ;

    invoke-direct {p0, p1, v0, v1}, Ll/ܰܽۘ;->֫(Ljava/lang/String;Ljava/util/EnumSet;Ll/ᩴᩳۘ;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(Ljava/lang/String;Ljava/util/EnumSet;Ljava/util/EnumSet;Ljava/util/Set;Ll/۠ۛۖ;Ljava/util/EnumSet;)Ll/۟ܽۘ;
    .locals 7

    if-eqz p6, :cond_0

    .line 195
    invoke-static {p6}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object p6

    goto :goto_0

    :cond_0
    const-class p6, Ll/ܶۛۖ;

    invoke-static {p6}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object p6

    :goto_0
    move-object v6, p6

    .line 196
    sget-object p6, Ll/ܶۛۖ;->۫:Ll/ܶۛۖ;

    invoke-virtual {v6, p6}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 197
    sget-object p6, Ll/ܶۛۖ;->ۗ:Ll/ܶۛۖ;

    invoke-virtual {v6, p6}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    if-eqz p3, :cond_1

    .line 199
    invoke-static {p3}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object p3

    goto :goto_1

    :cond_1
    const-class p3, Ll/֫ۤۖ;

    invoke-static {p3}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object p3

    :goto_1
    move-object v3, p3

    .line 200
    sget-object p3, Ll/֫ۤۖ;->ۗ:Ll/֫ۤۖ;

    invoke-virtual {v3, p3}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    .line 202
    invoke-virtual/range {v0 .. v6}, Ll/ܰܽۘ;->֫(Ljava/lang/String;Ljava/util/Set;Ljava/util/EnumSet;Ljava/util/Set;Ll/۠ۛۖ;Ljava/util/EnumSet;)Ll/ۗܽۘ;

    move-result-object p1

    check-cast p1, Ll/۟ܽۘ;

    return-object p1
.end method

.method public final ۧ(Ljava/lang/String;)Z
    .locals 2

    .line 243
    sget-object v0, Ll/ܶۛۖ;->ۗ:Ll/ܶۛۖ;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sget-object v1, Ll/ܰܽۘ;->ۜ֫:Ll/ᩴᩳۘ;

    invoke-direct {p0, p1, v0, v1}, Ll/ܰܽۘ;->֫(Ljava/lang/String;Ljava/util/EnumSet;Ll/ᩴᩳۘ;)Z

    move-result p1

    return p1
.end method

.method public final ܿ(Ljava/lang/String;)V
    .locals 8

    .line 480
    :try_start_0
    sget-object v0, Ll/ۨ۫ۖ;->ۨ:Ll/ۨ۫ۖ;

    .line 482
    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v3

    sget-object v0, Ll/֫ۤۖ;->ۛ:Ll/֫ۤۖ;

    .line 483
    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v4

    sget-object v0, Ll/ۜۨۖ;->ۙ:Ll/ۜۨۖ;

    sget-object v1, Ll/ۜۨۖ;->۬:Ll/ۜۨۖ;

    sget-object v2, Ll/ۜۨۖ;->ۗ:Ll/ۜۨۖ;

    .line 484
    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v5

    sget-object v6, Ll/۠ۛۖ;->ۙ:Ll/۠ۛۖ;

    sget-object v0, Ll/ܶۛۖ;->۫:Ll/ܶۛۖ;

    .line 486
    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    .line 480
    invoke-virtual/range {v1 .. v7}, Ll/ܰܽۘ;->֫(Ljava/lang/String;Ljava/util/Set;Ljava/util/EnumSet;Ljava/util/Set;Ll/۠ۛۖ;Ljava/util/EnumSet;)Ll/ۗܽۘ;

    move-result-object p1
    :try_end_0
    .catch Ll/֨ۨۖ; {:try_start_0 .. :try_end_0} :catch_0

    .line 229
    :try_start_1
    iget-object v0, p1, Ll/ۗܽۘ;->ۙ:Ll/ܰܽۘ;

    iget-object v1, p1, Ll/ۗܽۘ;->᩸:Ll/۫ۛۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    new-instance v2, Ll/ۢۤۖ;

    .line 25
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 359
    new-instance v3, Ll/֡֫ۘ;

    invoke-direct {v3}, Ll/֡֫ۘ;-><init>()V

    .line 360
    invoke-static {v2}, Ll/ܳۛۖ;->֫(Ll/ۡۛۖ;)Ll/᩵ۤۖ;

    move-result-object v4

    .line 361
    invoke-interface {v4, v2, v3}, Ll/᩵ۤۖ;->֫(Ll/ۡۛۖ;Ll/֡֫ۘ;)V

    .line 363
    sget-object v2, Ll/ۜ᩺ۖ;->᩶:Ll/ۜ᩺ۖ;

    .line 367
    invoke-interface {v4}, Ll/᩵ۤۖ;->֫()Ll/ۧۤۖ;

    move-result-object v4

    .line 368
    invoke-virtual {v3}, Ll/ۤܰۖ;->ᩳ()[B

    move-result-object v3

    .line 363
    invoke-virtual {v0, v1, v2, v4, v3}, Ll/ۖᩳۘ;->֫(Ll/۫ۛۖ;Ll/ۜ᩺ۖ;Ll/ۧۤۖ;[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 489
    :try_start_2
    invoke-virtual {p1}, Ll/ۗܽۘ;->close()V
    :try_end_2
    .catch Ll/֨ۨۖ; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catchall_0
    move-exception v0

    .line 480
    :try_start_3
    invoke-virtual {p1}, Ll/ۗܽۘ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0
    :try_end_4
    .catch Ll/֨ۨۖ; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    .line 490
    invoke-virtual {p1}, Ll/֨ۨۖ;->ۧ()J

    move-result-wide v0

    sget-object v2, Ll/ܰܽۘ;->ܳ֫:Ll/ᩴᩳۘ;

    check-cast v2, Ll/ۨܽۘ;

    invoke-virtual {v2, v0, v1}, Ll/ۨܽۘ;->֫(J)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 493
    :cond_0
    throw p1
.end method

.method public final ᩳ(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 16

    const-string v1, "Directory"

    const-string v2, "{} close failed for {},{},{}"

    .line 292
    sget-object v0, Ll/ۨ۫ۖ;->ܽ֫:Ll/ۨ۫ۖ;

    sget-object v3, Ll/ۨ۫ۖ;->ᩳ֫:Ll/ۨ۫ۖ;

    sget-object v4, Ll/ۨ۫ۖ;->ܳ֫:Ll/ۨ۫ۖ;

    invoke-static {v0, v3, v4}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v7

    sget-object v9, Ll/ۜۨۖ;->᩶:Ljava/util/Set;

    sget-object v10, Ll/۠ۛۖ;->ۙ:Ll/۠ۛۖ;

    const/4 v11, 0x0

    const/4 v8, 0x0

    move-object/from16 v5, p0

    move-object/from16 v6, p1

    .line 291
    invoke-virtual/range {v5 .. v11}, Ll/ܰܽۘ;->֫(Ljava/lang/String;Ljava/util/EnumSet;Ljava/util/EnumSet;Ljava/util/Set;Ll/۠ۛۖ;Ljava/util/EnumSet;)Ll/ۙܽۘ;

    move-result-object v3

    iget-object v4, v3, Ll/ۗܽۘ;->᩸:Ll/۫ۛۖ;

    iget-object v5, v3, Ll/ۗܽۘ;->ۙ:Ll/ܰܽۘ;

    iget-object v6, v3, Ll/ۗܽۘ;->᩶:Ll/ܽۧۘ;

    iget-object v7, v3, Ll/ۗܽۘ;->᩹:Ll/֫᩻֨;

    const/4 v8, 0x4

    const/4 v9, 0x3

    const/4 v10, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x5

    .line 72
    :try_start_0
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 118
    new-instance v0, Ll/᩶ܽۘ;

    invoke-direct {v0, v3}, Ll/᩶ܽۘ;-><init>(Ll/ۙܽۘ;)V

    .line 74
    :goto_0
    invoke-virtual {v0}, Ll/᩶ܽۘ;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_0

    .line 75
    invoke-virtual {v0}, Ll/᩶ܽۘ;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/᩷ۤۖ;

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 97
    :cond_0
    :try_start_1
    invoke-virtual {v3}, Ll/ۗܽۘ;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v14

    :catch_0
    move-exception v0

    move-object v3, v0

    new-array v0, v13, [Ljava/lang/Object;

    aput-object v1, v0, v12

    aput-object v6, v0, v11

    aput-object v5, v0, v10

    aput-object v4, v0, v9

    aput-object v3, v0, v8

    .line 99
    invoke-interface {v7, v2, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v14

    :catchall_0
    move-exception v0

    move-object v14, v0

    .line 97
    :try_start_2
    invoke-virtual {v3}, Ll/ۗܽۘ;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v3, v0

    new-array v0, v13, [Ljava/lang/Object;

    aput-object v1, v0, v12

    aput-object v6, v0, v11

    aput-object v5, v0, v10

    aput-object v4, v0, v9

    aput-object v3, v0, v8

    .line 99
    invoke-interface {v7, v2, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    :goto_1
    throw v14
.end method
