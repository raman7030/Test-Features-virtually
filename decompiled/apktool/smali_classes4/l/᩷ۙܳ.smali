.class public final enum Ll/᩷ۙܳ;
.super Ljava/lang/Enum;
.source "L73J"


# static fields
.field public static final enum ۗ:Ll/᩷ۙܳ;

.field public static final enum ۙ:Ll/᩷ۙܳ;

.field public static final enum ۛ:Ll/᩷ۙܳ;

.field public static final ۤ:[Ljava/lang/String;

.field public static final enum ۨ:Ll/᩷ۙܳ;

.field public static final enum ۫:Ll/᩷ۙܳ;

.field public static final enum ۬:Ll/᩷ۙܳ;

.field public static final enum ܰ:Ll/᩷ۙܳ;

.field public static final synthetic ᩶:[Ll/᩷ۙܳ;

.field public static final enum ᩺:Ll/᩷ۙܳ;


# instance fields
.field public final ᩸:J

.field public final ᩹:J


# direct methods
.method public static constructor <clinit>()V
    .locals 15

    .line 10
    new-instance v7, Ll/᩷ۙܳ;

    const-wide/16 v3, -0x1

    const-wide/16 v5, -0x1

    const-string v1, "ANY"

    const/4 v2, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ll/᩷ۙܳ;-><init>(Ljava/lang/String;IJJ)V

    sput-object v7, Ll/᩷ۙܳ;->ۙ:Ll/᩷ۙܳ;

    .line 11
    new-instance v0, Ll/᩷ۙܳ;

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x1

    const-string v9, "ZERO"

    const/4 v10, 0x1

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Ll/᩷ۙܳ;-><init>(Ljava/lang/String;IJJ)V

    sput-object v0, Ll/᩷ۙܳ;->᩺:Ll/᩷ۙܳ;

    .line 12
    new-instance v0, Ll/᩷ۙܳ;

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x2800

    const-string v2, "ZERO_TO_TEN_KB"

    const/4 v3, 0x2

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Ll/᩷ۙܳ;-><init>(Ljava/lang/String;IJJ)V

    sput-object v0, Ll/᩷ۙܳ;->ܰ:Ll/᩷ۙܳ;

    .line 13
    new-instance v0, Ll/᩷ۙܳ;

    const-wide/16 v11, 0x2800

    const-wide/32 v13, 0x100000

    const-string v9, "TEN_KB_TO_ONE_MB"

    const/4 v10, 0x3

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Ll/᩷ۙܳ;-><init>(Ljava/lang/String;IJJ)V

    sput-object v0, Ll/᩷ۙܳ;->ۛ:Ll/᩷ۙܳ;

    .line 14
    new-instance v0, Ll/᩷ۙܳ;

    const-wide/32 v4, 0x100000

    const-wide/32 v6, 0xa00000

    const-string v2, "ONE_TO_TEN_MB"

    const/4 v3, 0x4

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Ll/᩷ۙܳ;-><init>(Ljava/lang/String;IJJ)V

    sput-object v0, Ll/᩷ۙܳ;->۫:Ll/᩷ۙܳ;

    .line 15
    new-instance v0, Ll/᩷ۙܳ;

    const-wide/32 v11, 0xa00000

    const-wide/32 v13, 0x6400000

    const-string v9, "TEN_TO_ONE_HUNDRED_MB"

    const/4 v10, 0x5

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Ll/᩷ۙܳ;-><init>(Ljava/lang/String;IJJ)V

    sput-object v0, Ll/᩷ۙܳ;->ۨ:Ll/᩷ۙܳ;

    .line 16
    new-instance v0, Ll/᩷ۙܳ;

    const-wide/32 v4, 0x6400000

    const-wide/32 v6, 0x40000000

    const-string v2, "ONE_HUNDRED_MB_TO_ONE_GB"

    const/4 v3, 0x6

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Ll/᩷ۙܳ;-><init>(Ljava/lang/String;IJJ)V

    sput-object v0, Ll/᩷ۙܳ;->۬:Ll/᩷ۙܳ;

    .line 17
    new-instance v0, Ll/᩷ۙܳ;

    const-wide/32 v11, 0x40000000

    const-wide/16 v13, -0x1

    const-string v9, "AT_LEAST_ONE_GB"

    const/4 v10, 0x7

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Ll/᩷ۙܳ;-><init>(Ljava/lang/String;IJJ)V

    sput-object v0, Ll/᩷ۙܳ;->ۗ:Ll/᩷ۙܳ;

    .line 9
    invoke-static {}, Ll/᩷ۙܳ;->᩻()[Ll/᩷ۙܳ;

    move-result-object v0

    sput-object v0, Ll/᩷ۙܳ;->᩶:[Ll/᩷ۙܳ;

    const-string v0, "GB"

    const-string v1, "TB"

    const-string v2, "B"

    const-string v3, "KB"

    const-string v4, "MB"

    .line 19
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/᩷ۙܳ;->ۤ:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJJ)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 28
    iput-wide p3, p0, Ll/᩷ۙܳ;->᩹:J

    .line 29
    iput-wide p5, p0, Ll/᩷ۙܳ;->᩸:J

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩷ۙܳ;
    .locals 1

    .line 9
    const-class v0, Ll/᩷ۙܳ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩷ۙܳ;

    return-object p0
.end method

.method public static values()[Ll/᩷ۙܳ;
    .locals 1

    .line 9
    sget-object v0, Ll/᩷ۙܳ;->᩶:[Ll/᩷ۙܳ;

    invoke-virtual {v0}, [Ll/᩷ۙܳ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩷ۙܳ;

    return-object v0
.end method

.method public static ֫(J)Ljava/lang/String;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-nez v2, :cond_0

    const-string p0, "0"

    return-object p0

    .line 114
    :cond_0
    invoke-static {p0, p1}, Ll/᩷ۙܳ;->ܽ(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(JI)Ljava/lang/String;
    .locals 7

    :goto_0
    if-lez p2, :cond_1

    mul-int/lit8 v0, p2, 0xa

    const-wide/16 v1, 0x1

    shl-long v0, v1, v0

    .line 167
    rem-long v2, p0, v0

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    .line 168
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    div-long/2addr p0, v0

    invoke-virtual {v2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    sget-object p0, Ll/᩷ۙܳ;->ۤ:[Ljava/lang/String;

    aget-object p0, p0, p2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    .line 171
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    sget-object p0, Ll/᩷ۙܳ;->ۤ:[Ljava/lang/String;

    const/4 p1, 0x0

    aget-object p0, p0, p1

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(JJ)Ll/᩷ۙܳ;
    .locals 7

    .line 66
    invoke-static {}, Ll/᩷ۙܳ;->values()[Ll/᩷ۙܳ;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 67
    iget-wide v4, v3, Ll/᩷ۙܳ;->᩹:J

    cmp-long v6, v4, p0

    if-nez v6, :cond_0

    iget-wide v4, v3, Ll/᩷ۙܳ;->᩸:J

    cmp-long v6, v4, p2

    if-nez v6, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(JJ)Ljava/lang/String;
    .locals 3

    .line 78
    invoke-static {p0, p1, p2, p3}, Ll/᩷ۙܳ;->֫(JJ)Ll/᩷ۙܳ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 80
    invoke-virtual {v0}, Ll/᩷ۙܳ;->֫()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-wide/16 v0, -0x1

    cmp-long v2, p0, v0

    if-nez v2, :cond_1

    .line 83
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "< "

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2, p3}, Ll/᩷ۙܳ;->֫(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    cmp-long v2, p2, v0

    if-nez v2, :cond_2

    .line 86
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "\u2265 "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0, p1}, Ll/᩷ۙܳ;->֫(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 88
    :cond_2
    invoke-static {p0, p1, p2, p3}, Ll/᩷ۙܳ;->ܽ(JJ)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(J)Ljava/lang/String;
    .locals 7

    const-wide/16 v0, 0x400

    cmp-long v2, p0, v0

    if-gez v2, :cond_0

    .line 122
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, "B"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-wide/32 v2, 0x40000000

    .line 124
    rem-long v2, p0, v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-nez v6, :cond_1

    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x1e

    shr-long/2addr p0, v1

    const-string v1, "GB"

    .line 0
    invoke-static {v0, p0, p1, v1}, Ll/ܺ۫᩷;->֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-wide/32 v2, 0x100000

    .line 127
    rem-long v2, p0, v2

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    .line 128
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x14

    shr-long/2addr p0, v1

    const-string v1, "MB"

    .line 0
    invoke-static {v0, p0, p1, v1}, Ll/ܺ۫᩷;->֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 130
    :cond_2
    rem-long v0, p0, v0

    cmp-long v2, v0, v4

    if-nez v2, :cond_3

    .line 131
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0xa

    shr-long/2addr p0, v1

    const-string v1, "KB"

    .line 0
    invoke-static {v0, p0, p1, v1}, Ll/ܺ۫᩷;->֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 133
    :cond_3
    invoke-static {p0, p1}, Ll/᩺ۤۡ;->ۧ(J)Ljava/lang/String;

    move-result-object p0

    const-string p1, " "

    const-string v0, ""

    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(JJ)Ljava/lang/String;
    .locals 2

    .line 102
    invoke-static {p0, p1}, Ll/᩷ۙܳ;->ᩳ(J)I

    move-result v0

    .line 103
    invoke-static {p2, p3}, Ll/᩷ۙܳ;->ᩳ(J)I

    move-result v1

    if-le v0, v1, :cond_0

    .line 105
    invoke-static {p0, p1, v1}, Ll/᩷ۙܳ;->֫(JI)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 106
    :cond_0
    invoke-static {p0, p1}, Ll/᩷ۙܳ;->֫(J)Ljava/lang/String;

    move-result-object p0

    :goto_0
    const-string p1, " - "

    .line 0
    invoke-static {p0, p1}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 107
    invoke-static {p2, p3}, Ll/᩷ۙܳ;->֫(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ(J)I
    .locals 13

    const-wide/16 v0, 0x400

    cmp-long v2, p0, v0

    if-gez v2, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const-wide/32 v2, 0x40000000

    .line 143
    rem-long v4, p0, v2

    const/4 v6, 0x3

    const-wide/16 v7, 0x0

    cmp-long v9, v4, v7

    if-nez v9, :cond_1

    return v6

    :cond_1
    const-wide/32 v4, 0x100000

    .line 146
    rem-long v9, p0, v4

    const/4 v11, 0x2

    cmp-long v12, v9, v7

    if-nez v12, :cond_2

    return v11

    .line 149
    :cond_2
    rem-long v0, p0, v0

    const/4 v9, 0x1

    cmp-long v10, v0, v7

    if-nez v10, :cond_3

    return v9

    :cond_3
    cmp-long v0, p0, v4

    if-gez v0, :cond_4

    return v9

    :cond_4
    cmp-long v0, p0, v2

    if-gez v0, :cond_5

    return v11

    :cond_5
    const-wide v0, 0x10000000000L

    cmp-long v2, p0, v0

    if-gez v2, :cond_6

    return v6

    :cond_6
    const/4 p0, 0x4

    return p0
.end method

.method public static ᩳ(JJ)J
    .locals 3

    const-wide/16 v0, -0x1

    cmp-long v2, p0, v0

    if-nez v2, :cond_0

    cmp-long v2, p2, v0

    if-eqz v2, :cond_0

    const-wide/16 p0, 0x0

    :cond_0
    return-wide p0
.end method

.method public static synthetic ᩻()[Ll/᩷ۙܳ;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Ll/᩷ۙܳ;

    .line 9
    sget-object v1, Ll/᩷ۙܳ;->ۙ:Ll/᩷ۙܳ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/᩷ۙܳ;->᩺:Ll/᩷ۙܳ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/᩷ۙܳ;->ܰ:Ll/᩷ۙܳ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/᩷ۙܳ;->ۛ:Ll/᩷ۙܳ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ll/᩷ۙܳ;->۫:Ll/᩷ۙܳ;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Ll/᩷ۙܳ;->ۨ:Ll/᩷ۙܳ;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Ll/᩷ۙܳ;->۬:Ll/᩷ۙܳ;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Ll/᩷ۙܳ;->ۗ:Ll/᩷ۙܳ;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ֫()Ljava/lang/String;
    .locals 11

    .line 50
    sget-object v0, Ll/ۜۙܳ;->֫:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const-wide/16 v1, 0x2800

    const-wide/32 v3, 0x100000

    const-wide/32 v5, 0xa00000

    const-wide/32 v7, 0x6400000

    const-wide/32 v9, 0x40000000

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IncompatibleClassChangeError;

    invoke-direct {v0}, Ljava/lang/IncompatibleClassChangeError;-><init>()V

    throw v0

    .line 58
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\u2265 "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v9, v10}, Ll/᩷ۙܳ;->ܽ(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 57
    :pswitch_1
    invoke-static {v7, v8, v9, v10}, Ll/᩷ۙܳ;->ܽ(JJ)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 56
    :pswitch_2
    invoke-static {v5, v6, v7, v8}, Ll/᩷ۙܳ;->ܽ(JJ)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 55
    :pswitch_3
    invoke-static {v3, v4, v5, v6}, Ll/᩷ۙܳ;->ܽ(JJ)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 54
    :pswitch_4
    invoke-static {v1, v2, v3, v4}, Ll/᩷ۙܳ;->ܽ(JJ)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 53
    :pswitch_5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "0 - "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v2}, Ll/᩷ۙܳ;->ܽ(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_6
    const-wide/16 v0, 0x0

    .line 52
    invoke-static {v0, v1}, Ll/᩷ۙܳ;->ܽ(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_7
    const v0, 0x7f1203c6

    .line 51
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public ۧ()J
    .locals 2

    .line 43
    iget-wide v0, p0, Ll/᩷ۙܳ;->᩸:J

    return-wide v0
.end method

.method public ܿ()J
    .locals 2

    .line 36
    iget-wide v0, p0, Ll/᩷ۙܳ;->᩹:J

    return-wide v0
.end method
