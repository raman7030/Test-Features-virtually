.class public final Ll/ۖ᩸ܺ;
.super Ljava/lang/Object;
.source "33QT"


# static fields
.field public static final ᩴ:Ll/ۛܶܺ;

.field public static final ᩵:Ll/ᩳ᩸ܺ;


# instance fields
.field public ֫:I

.field public ۖ:Ll/֨᩹ܺ;

.field public ۘ:Ll/᩵᩶ܺ;

.field public ۜ:Ll/ۘ᩶ܺ;

.field public ۡ:Ll/ᩳ᩸ܺ;

.field public ۢ:Z

.field public ۧ:J

.field public ܳ:J

.field public ܺ:Ll/ۧܶܺ;

.field public ܽ:J

.field public ܿ:Ll/֨᩹ܺ;

.field public ᩳ:Ll/ۧܶܺ;

.field public ᩷:Ll/ۛܶܺ;

.field public ᩻:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 205
    new-instance v0, Ll/ۜ᩸ܺ;

    .line 207
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 206
    invoke-static {v0}, Ll/֫᩸ܺ;->֫(Ljava/lang/Object;)Ll/ۛܶܺ;

    move-result-object v0

    sput-object v0, Ll/ۖ᩸ܺ;->ᩴ:Ll/ۛܶܺ;

    .line 268
    new-instance v0, Ll/᩷᩸ܺ;

    invoke-direct {v0}, Ll/᩷᩸ܺ;-><init>()V

    sput-object v0, Ll/ۖ᩸ܺ;->᩵:Ll/ᩳ᩸ܺ;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 311
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 283
    iput-boolean v0, p0, Ll/ۖ᩸ܺ;->ۢ:Z

    const/4 v0, -0x1

    .line 286
    iput v0, p0, Ll/ۖ᩸ܺ;->֫:I

    const-wide/16 v0, -0x1

    .line 287
    iput-wide v0, p0, Ll/ۖ᩸ܺ;->ܳ:J

    .line 288
    iput-wide v0, p0, Ll/ۖ᩸ܺ;->᩻:J

    .line 294
    iput-wide v0, p0, Ll/ۖ᩸ܺ;->ܽ:J

    .line 297
    iput-wide v0, p0, Ll/ۖ᩸ܺ;->ۧ:J

    .line 309
    sget-object v0, Ll/ۖ᩸ܺ;->ᩴ:Ll/ۛܶܺ;

    iput-object v0, p0, Ll/ۖ᩸ܺ;->᩷:Ll/ۛܶܺ;

    return-void
.end method

.method private ܽ()V
    .locals 6

    .line 1061
    iget-object v0, p0, Ll/ۖ᩸ܺ;->ۘ:Ll/᩵᩶ܺ;

    const/4 v1, 0x0

    const-wide/16 v2, -0x1

    if-nez v0, :cond_1

    .line 1062
    iget-wide v4, p0, Ll/ۖ᩸ܺ;->᩻:J

    cmp-long v0, v4, v2

    if-nez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    const-string v0, "maximumWeight requires weigher"

    invoke-static {v0, v1}, Ll/ۘܶܺ;->ۧ(Ljava/lang/String;Z)V

    return-void

    .line 1064
    :cond_1
    iget-boolean v0, p0, Ll/ۖ᩸ܺ;->ۢ:Z

    if-eqz v0, :cond_3

    .line 1065
    iget-wide v4, p0, Ll/ۖ᩸ܺ;->᩻:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    :cond_2
    const-string v0, "weigher requires maximumWeight"

    invoke-static {v0, v1}, Ll/ۘܶܺ;->ۧ(Ljava/lang/String;Z)V

    return-void

    .line 1067
    :cond_3
    iget-wide v0, p0, Ll/ۖ᩸ܺ;->᩻:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_4

    .line 1068
    sget-object v0, Ll/ۢ᩸ܺ;->֫:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v2, "ignoring weigher specified without maximumWeight"

    invoke-virtual {v0, v1, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public static ᩳ()Ll/ۖ᩸ܺ;
    .locals 1

    .line 321
    new-instance v0, Ll/ۖ᩸ܺ;

    invoke-direct {v0}, Ll/ۖ᩸ܺ;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1081
    invoke-static {p0}, Ll/ܺܶܺ;->֫(Ljava/lang/Object;)Ll/ۡܶܺ;

    move-result-object v0

    .line 1085
    iget v1, p0, Ll/ۖ᩸ܺ;->֫:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const-string v2, "concurrencyLevel"

    .line 1086
    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/String;I)V

    .line 1088
    :cond_0
    iget-wide v1, p0, Ll/ۖ᩸ܺ;->ܳ:J

    const-wide/16 v3, -0x1

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    const-string v5, "maximumSize"

    .line 1089
    invoke-virtual {v0, v1, v2, v5}, Ll/ۡܶܺ;->֫(JLjava/lang/String;)V

    .line 1091
    :cond_1
    iget-wide v1, p0, Ll/ۖ᩸ܺ;->᩻:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_2

    const-string v5, "maximumWeight"

    .line 1092
    invoke-virtual {v0, v1, v2, v5}, Ll/ۡܶܺ;->֫(JLjava/lang/String;)V

    .line 1094
    :cond_2
    iget-wide v1, p0, Ll/ۖ᩸ܺ;->ܽ:J

    const-string v5, "ns"

    cmp-long v6, v1, v3

    if-eqz v6, :cond_3

    .line 1095
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v6, p0, Ll/ۖ᩸ܺ;->ܽ:J

    .line 0
    invoke-static {v1, v6, v7, v5}, Ll/ܺ۫᩷;->֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "expireAfterWrite"

    .line 1095
    invoke-virtual {v0, v1, v2}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1097
    :cond_3
    iget-wide v1, p0, Ll/ۖ᩸ܺ;->ۧ:J

    cmp-long v6, v1, v3

    if-eqz v6, :cond_4

    .line 1098
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v2, p0, Ll/ۖ᩸ܺ;->ۧ:J

    .line 0
    invoke-static {v1, v2, v3, v5}, Ll/ܺ۫᩷;->֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "expireAfterAccess"

    .line 1098
    invoke-virtual {v0, v1, v2}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1100
    :cond_4
    iget-object v1, p0, Ll/ۖ᩸ܺ;->ܿ:Ll/֨᩹ܺ;

    if-eqz v1, :cond_5

    .line 1101
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ܶ۠ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "keyStrength"

    invoke-virtual {v0, v1, v2}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1103
    :cond_5
    iget-object v1, p0, Ll/ۖ᩸ܺ;->ۖ:Ll/֨᩹ܺ;

    if-eqz v1, :cond_6

    .line 1104
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ܶ۠ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "valueStrength"

    invoke-virtual {v0, v1, v2}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1106
    :cond_6
    iget-object v1, p0, Ll/ۖ᩸ܺ;->ᩳ:Ll/ۧܶܺ;

    if-eqz v1, :cond_7

    const-string v1, "keyEquivalence"

    .line 1107
    invoke-virtual {v0, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;)V

    .line 1109
    :cond_7
    iget-object v1, p0, Ll/ۖ᩸ܺ;->ܺ:Ll/ۧܶܺ;

    if-eqz v1, :cond_8

    const-string v1, "valueEquivalence"

    .line 1110
    invoke-virtual {v0, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;)V

    .line 1112
    :cond_8
    iget-object v1, p0, Ll/ۖ᩸ܺ;->ۜ:Ll/ۘ᩶ܺ;

    if-eqz v1, :cond_9

    const-string v1, "removalListener"

    .line 1113
    invoke-virtual {v0, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;)V

    .line 1115
    :cond_9
    invoke-virtual {v0}, Ll/ۡܶܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ᩴ᩸ܺ;)Ll/֡᩸ܺ;
    .locals 2

    .line 1034
    invoke-direct {p0}, Ll/ۖ᩸ܺ;->ܽ()V

    .line 1035
    new-instance v0, Ll/ۜ᩹ܺ;

    .line 4766
    new-instance v1, Ll/ܳ᩶ܺ;

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4766
    invoke-direct {v1, p0, p1}, Ll/ܳ᩶ܺ;-><init>(Ll/ۖ᩸ܺ;Ll/ᩴ᩸ܺ;)V

    const/4 p1, 0x0

    invoke-direct {v0, v1, p1}, Ll/ۢ᩹ܺ;-><init>(Ll/ܳ᩶ܺ;I)V

    return-object v0
.end method

.method public final ֫()Ll/᩻᩸ܺ;
    .locals 1

    .line 1051
    invoke-direct {p0}, Ll/ۖ᩸ܺ;->ܽ()V

    .line 1053
    new-instance v0, Ll/ۢ᩹ܺ;

    invoke-direct {v0, p0}, Ll/ۢ᩹ܺ;-><init>(Ll/ۖ᩸ܺ;)V

    return-object v0
.end method

.method public final ֫(I)V
    .locals 4

    .line 459
    iget v0, p0, Ll/ۖ᩸ܺ;->֫:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    if-lez p1, :cond_1

    const/4 v2, 0x1

    .line 463
    :cond_1
    invoke-static {v2}, Ll/ۘܶܺ;->֫(Z)V

    .line 464
    iput p1, p0, Ll/ۖ᩸ܺ;->֫:I

    return-void

    .line 574
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const-string v0, "concurrency level was already set to %s"

    invoke-static {v0, v1}, Ll/ۤܶܺ;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(J)V
    .locals 7

    .line 495
    iget-wide v0, p0, Ll/ۖ᩸ܺ;->ܳ:J

    const/4 v2, 0x0

    const-wide/16 v3, -0x1

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    const-string v6, "maximum size was already set to %s"

    invoke-static {v0, v1, v6, v5}, Ll/ۘܶܺ;->ۧ(JLjava/lang/String;Z)V

    .line 497
    iget-wide v0, p0, Ll/ۖ᩸ܺ;->᩻:J

    cmp-long v5, v0, v3

    if-nez v5, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    const-string v4, "maximum weight was already set to %s"

    invoke-static {v0, v1, v4, v3}, Ll/ۘܶܺ;->ۧ(JLjava/lang/String;Z)V

    .line 501
    iget-object v0, p0, Ll/ۖ᩸ܺ;->ۘ:Ll/᩵᩶ܺ;

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    const-string v1, "maximum size can not be combined with weigher"

    invoke-static {v1, v0}, Ll/ۘܶܺ;->ۧ(Ljava/lang/String;Z)V

    const-wide/16 v0, 0x0

    cmp-long v3, p1, v0

    if-ltz v3, :cond_3

    const/4 v2, 0x1

    :cond_3
    const-string v0, "maximum size must not be negative"

    .line 502
    invoke-static {v0, v2}, Ll/ۘܶܺ;->֫(Ljava/lang/String;Z)V

    .line 503
    iput-wide p1, p0, Ll/ۖ᩸ܺ;->ܳ:J

    return-void
.end method

.method public final ֫(Ll/᩵᩶ܺ;)V
    .locals 6

    .line 581
    iget-object v0, p0, Ll/ۖ᩸ܺ;->ۘ:Ll/᩵᩶ܺ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/ۘܶܺ;->ۧ(Z)V

    .line 582
    iget-boolean v0, p0, Ll/ۖ᩸ܺ;->ۢ:Z

    if-eqz v0, :cond_2

    .line 583
    iget-wide v2, p0, Ll/ۖ᩸ܺ;->ܳ:J

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    const-string v0, "weigher can not be combined with maximum size (%s provided)"

    invoke-static {v2, v3, v0, v1}, Ll/ۘܶܺ;->ۧ(JLjava/lang/String;Z)V

    .line 902
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    iput-object p1, p0, Ll/ۖ᩸ܺ;->ۘ:Ll/᩵᩶ܺ;

    return-void
.end method

.method public final ۧ()V
    .locals 4

    .line 688
    sget-object v0, Ll/֨᩹ܺ;->᩹:Ll/֨᩹ܺ;

    .line 693
    iget-object v1, p0, Ll/ۖ᩸ܺ;->ۖ:Ll/֨᩹ܺ;

    if-nez v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v3, "Value strength was already set to %s"

    invoke-static {v1, v3, v2}, Ll/ۘܶܺ;->ۧ(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 902
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 694
    iput-object v0, p0, Ll/ۖ᩸ܺ;->ۖ:Ll/֨᩹ܺ;

    return-void
.end method

.method public final ۧ(J)V
    .locals 7

    .line 537
    iget-wide v0, p0, Ll/ۖ᩸ܺ;->᩻:J

    const/4 v2, 0x0

    const-wide/16 v3, -0x1

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    const-string v6, "maximum weight was already set to %s"

    invoke-static {v0, v1, v6, v5}, Ll/ۘܶܺ;->ۧ(JLjava/lang/String;Z)V

    .line 541
    iget-wide v0, p0, Ll/ۖ᩸ܺ;->ܳ:J

    cmp-long v5, v0, v3

    if-nez v5, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    const-string v4, "maximum size was already set to %s"

    invoke-static {v0, v1, v4, v3}, Ll/ۘܶܺ;->ۧ(JLjava/lang/String;Z)V

    const-wide/16 v0, 0x0

    cmp-long v3, p1, v0

    if-ltz v3, :cond_2

    const/4 v2, 0x1

    :cond_2
    const-string v0, "maximum weight must not be negative"

    .line 543
    invoke-static {v0, v2}, Ll/ۘܶܺ;->֫(Ljava/lang/String;Z)V

    .line 544
    iput-wide p1, p0, Ll/ۖ᩸ܺ;->᩻:J

    return-void
.end method
