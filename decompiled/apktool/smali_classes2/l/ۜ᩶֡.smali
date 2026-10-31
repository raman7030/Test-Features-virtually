.class public final enum Ll/ۜ᩶֡;
.super Ljava/lang/Enum;
.source "N67N"


# static fields
.field public static final enum ۗ:Ll/ۜ᩶֡;

.field public static final enum ۙ:Ll/ۜ᩶֡;

.field public static final enum ۬:Ll/ۜ᩶֡;

.field public static final enum ᩶:Ll/ۜ᩶֡;

.field public static final synthetic ᩸:[Ll/ۜ᩶֡;

.field public static final enum ᩹:Ll/ۜ᩶֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 38
    new-instance v0, Ll/ۜ᩶֡;

    const-string v1, "string"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ۜ᩶֡;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۜ᩶֡;->ۗ:Ll/ۜ᩶֡;

    .line 39
    new-instance v0, Ll/ۜ᩶֡;

    const-string v1, "type"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/ۜ᩶֡;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۜ᩶֡;->۬:Ll/ۜ᩶֡;

    .line 40
    new-instance v0, Ll/ۜ᩶֡;

    const-string v1, "field"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ll/ۜ᩶֡;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۜ᩶֡;->᩹:Ll/ۜ᩶֡;

    .line 41
    new-instance v0, Ll/ۜ᩶֡;

    const-string v1, "method"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ll/ۜ᩶֡;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۜ᩶֡;->᩶:Ll/ۜ᩶֡;

    .line 42
    new-instance v0, Ll/ۜ᩶֡;

    const-string v1, "none"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ll/ۜ᩶֡;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۜ᩶֡;->ۙ:Ll/ۜ᩶֡;

    .line 37
    invoke-static {}, Ll/ۜ᩶֡;->֫()[Ll/ۜ᩶֡;

    move-result-object v0

    sput-object v0, Ll/ۜ᩶֡;->᩸:[Ll/ۜ᩶֡;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۜ᩶֡;
    .locals 1

    .line 37
    const-class v0, Ll/ۜ᩶֡;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۜ᩶֡;

    return-object p0
.end method

.method public static values()[Ll/ۜ᩶֡;
    .locals 1

    .line 37
    sget-object v0, Ll/ۜ᩶֡;->᩸:[Ll/ۜ᩶֡;

    invoke-virtual {v0}, [Ll/ۜ᩶֡;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۜ᩶֡;

    return-object v0
.end method

.method public static synthetic ֫()[Ll/ۜ᩶֡;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ll/ۜ᩶֡;

    .line 37
    sget-object v1, Ll/ۜ᩶֡;->ۗ:Ll/ۜ᩶֡;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۜ᩶֡;->۬:Ll/ۜ᩶֡;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ۜ᩶֡;->᩹:Ll/ۜ᩶֡;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/ۜ᩶֡;->᩶:Ll/ۜ᩶֡;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ll/ۜ᩶֡;->ۙ:Ll/ۜ᩶֡;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ֫(Ll/ۚۙ֡;)Z
    .locals 4

    .line 45
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_5

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v2, 0x2

    if-eq v0, v2, :cond_3

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-eq v0, v2, :cond_0

    return v3

    :cond_0
    if-nez p1, :cond_1

    return v1

    :cond_1
    return v3

    .line 53
    :cond_2
    instance-of p1, p1, Ll/᩹ۙ֡;

    return p1

    .line 51
    :cond_3
    instance-of p1, p1, Ll/ᩴۙ֡;

    return p1

    .line 49
    :cond_4
    instance-of p1, p1, Ll/᩺ۙ֡;

    return p1

    .line 47
    :cond_5
    instance-of p1, p1, Ll/ۨۙ֡;

    return p1
.end method
