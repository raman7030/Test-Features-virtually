.class public final enum Ll/ۜۨۖ;
.super Ljava/lang/Enum;
.source "59EU"

# interfaces
.implements Ll/᩸ܰۖ;


# static fields
.field public static final enum ۗ:Ll/ۜۨۖ;

.field public static final enum ۙ:Ll/ۜۨۖ;

.field public static final enum ۬:Ll/ۜۨۖ;

.field public static final ᩶:Ljava/util/Set;

.field public static final synthetic ᩹:[Ll/ۜۨۖ;


# instance fields
.field public ᩸:J


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 28
    new-instance v0, Ll/ۜۨۖ;

    const/4 v1, 0x0

    const-wide/16 v2, 0x1

    const-string v4, "FILE_SHARE_READ"

    invoke-direct {v0, v4, v1, v2, v3}, Ll/ۜۨۖ;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Ll/ۜۨۖ;->ۗ:Ll/ۜۨۖ;

    .line 29
    new-instance v0, Ll/ۜۨۖ;

    const/4 v1, 0x1

    const-wide/16 v2, 0x2

    const-string v4, "FILE_SHARE_WRITE"

    invoke-direct {v0, v4, v1, v2, v3}, Ll/ۜۨۖ;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Ll/ۜۨۖ;->۬:Ll/ۜۨۖ;

    .line 30
    new-instance v0, Ll/ۜۨۖ;

    const/4 v1, 0x2

    const-wide/16 v2, 0x4

    const-string v4, "FILE_SHARE_DELETE"

    invoke-direct {v0, v4, v1, v2, v3}, Ll/ۜۨۖ;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Ll/ۜۨۖ;->ۙ:Ll/ۜۨۖ;

    .line 27
    invoke-static {}, Ll/ۜۨۖ;->֫()[Ll/ۜۨۖ;

    move-result-object v0

    sput-object v0, Ll/ۜۨۖ;->᩹:[Ll/ۜۨۖ;

    .line 32
    const-class v0, Ll/ۜۨۖ;

    invoke-static {v0}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/ۜۨۖ;->᩶:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJ)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 37
    iput-wide p3, p0, Ll/ۜۨۖ;->᩸:J

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۜۨۖ;
    .locals 1

    .line 27
    const-class v0, Ll/ۜۨۖ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۜۨۖ;

    return-object p0
.end method

.method public static values()[Ll/ۜۨۖ;
    .locals 1

    .line 27
    sget-object v0, Ll/ۜۨۖ;->᩹:[Ll/ۜۨۖ;

    invoke-virtual {v0}, [Ll/ۜۨۖ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۜۨۖ;

    return-object v0
.end method

.method public static synthetic ֫()[Ll/ۜۨۖ;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ll/ۜۨۖ;

    .line 27
    sget-object v1, Ll/ۜۨۖ;->ۗ:Ll/ۜۨۖ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۜۨۖ;->۬:Ll/ۜۨۖ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ۜۨۖ;->ۙ:Ll/ۜۨۖ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public getValue()J
    .locals 2

    .line 41
    iget-wide v0, p0, Ll/ۜۨۖ;->᩸:J

    return-wide v0
.end method
