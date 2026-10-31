.class public final enum Ll/ۨ᩹ۧ;
.super Ljava/lang/Enum;
.source "I81O"


# static fields
.field public static final enum ۗ:Ll/ۨ᩹ۧ;

.field public static final enum ۙ:Ll/ۨ᩹ۧ;

.field public static final enum ۫:Ll/ۨ᩹ۧ;

.field public static final enum ۬:Ll/ۨ᩹ۧ;

.field public static final enum ᩶:Ll/ۨ᩹ۧ;

.field public static final synthetic ᩹:[Ll/ۨ᩹ۧ;


# instance fields
.field public final ᩸:J


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 24
    new-instance v0, Ll/ۨ᩹ۧ;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-string v4, "DEX_FILES"

    invoke-direct {v0, v4, v1, v2, v3}, Ll/ۨ᩹ۧ;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Ll/ۨ᩹ۧ;->ۗ:Ll/ۨ᩹ۧ;

    .line 30
    new-instance v0, Ll/ۨ᩹ۧ;

    const/4 v1, 0x1

    const-wide/16 v2, 0x1

    const-string v4, "EXTRA_DESCRIPTORS"

    invoke-direct {v0, v4, v1, v2, v3}, Ll/ۨ᩹ۧ;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Ll/ۨ᩹ۧ;->۬:Ll/ۨ᩹ۧ;

    .line 31
    new-instance v0, Ll/ۨ᩹ۧ;

    const/4 v1, 0x2

    const-wide/16 v2, 0x2

    const-string v4, "CLASSES"

    invoke-direct {v0, v4, v1, v2, v3}, Ll/ۨ᩹ۧ;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Ll/ۨ᩹ۧ;->ۙ:Ll/ۨ᩹ۧ;

    .line 32
    new-instance v0, Ll/ۨ᩹ۧ;

    const/4 v1, 0x3

    const-wide/16 v2, 0x3

    const-string v4, "METHODS"

    invoke-direct {v0, v4, v1, v2, v3}, Ll/ۨ᩹ۧ;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Ll/ۨ᩹ۧ;->۫:Ll/ۨ᩹ۧ;

    .line 33
    new-instance v0, Ll/ۨ᩹ۧ;

    const/4 v1, 0x4

    const-wide/16 v2, 0x4

    const-string v4, "AGGREGATION_COUNT"

    invoke-direct {v0, v4, v1, v2, v3}, Ll/ۨ᩹ۧ;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Ll/ۨ᩹ۧ;->᩶:Ll/ۨ᩹ۧ;

    .line 22
    invoke-static {}, Ll/ۨ᩹ۧ;->֫()[Ll/ۨ᩹ۧ;

    move-result-object v0

    sput-object v0, Ll/ۨ᩹ۧ;->᩹:[Ll/ۨ᩹ۧ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJ)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 38
    iput-wide p3, p0, Ll/ۨ᩹ۧ;->᩸:J

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۨ᩹ۧ;
    .locals 1

    .line 22
    const-class v0, Ll/ۨ᩹ۧ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۨ᩹ۧ;

    return-object p0
.end method

.method public static values()[Ll/ۨ᩹ۧ;
    .locals 1

    .line 22
    sget-object v0, Ll/ۨ᩹ۧ;->᩹:[Ll/ۨ᩹ۧ;

    invoke-virtual {v0}, [Ll/ۨ᩹ۧ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۨ᩹ۧ;

    return-object v0
.end method

.method public static ֫(J)Ll/ۨ᩹ۧ;
    .locals 5

    .line 46
    invoke-static {}, Ll/ۨ᩹ۧ;->values()[Ll/ۨ᩹ۧ;

    move-result-object v0

    const/4 v1, 0x0

    .line 47
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_1

    .line 48
    aget-object v2, v0, v1

    invoke-virtual {v2}, Ll/ۨ᩹ۧ;->getValue()J

    move-result-wide v2

    cmp-long v4, v2, p0

    if-nez v4, :cond_0

    .line 49
    aget-object p0, v0, v1

    return-object p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 52
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported FileSection Type "

    .line 0
    invoke-static {p0, p1, v1}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 52
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic ֫()[Ll/ۨ᩹ۧ;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ll/ۨ᩹ۧ;

    .line 22
    sget-object v1, Ll/ۨ᩹ۧ;->ۗ:Ll/ۨ᩹ۧ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۨ᩹ۧ;->۬:Ll/ۨ᩹ۧ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ۨ᩹ۧ;->ۙ:Ll/ۨ᩹ۧ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/ۨ᩹ۧ;->۫:Ll/ۨ᩹ۧ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ll/ۨ᩹ۧ;->᩶:Ll/ۨ᩹ۧ;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public getValue()J
    .locals 2

    .line 42
    iget-wide v0, p0, Ll/ۨ᩹ۧ;->᩸:J

    return-wide v0
.end method
