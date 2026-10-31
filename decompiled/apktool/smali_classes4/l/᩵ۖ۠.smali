.class public final enum Ll/᩵ۖ۠;
.super Ljava/lang/Enum;
.source "H7RN"


# static fields
.field public static final enum ۙ:Ll/᩵ۖ۠;

.field public static final enum ᩶:Ll/᩵ۖ۠;

.field public static final synthetic ᩸:[Ll/᩵ۖ۠;

.field public static final enum ᩹:Ll/᩵ۖ۠;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1327
    new-instance v0, Ll/᩵ۖ۠;

    const-string v1, "ALWAYS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/᩵ۖ۠;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩵ۖ۠;->᩹:Ll/᩵ۖ۠;

    .line 1335
    new-instance v0, Ll/᩵ۖ۠;

    const-string v1, "LEGACY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/᩵ۖ۠;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩵ۖ۠;->᩶:Ll/᩵ۖ۠;

    .line 1340
    new-instance v0, Ll/᩵ۖ۠;

    const-string v1, "NONEMPTY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ll/᩵ۖ۠;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩵ۖ۠;->ۙ:Ll/᩵ۖ۠;

    .line 1319
    invoke-static {}, Ll/᩵ۖ۠;->֫()[Ll/᩵ۖ۠;

    move-result-object v0

    sput-object v0, Ll/᩵ۖ۠;->᩸:[Ll/᩵ۖ۠;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1319
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩵ۖ۠;
    .locals 1

    .line 1319
    const-class v0, Ll/᩵ۖ۠;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩵ۖ۠;

    return-object p0
.end method

.method public static values()[Ll/᩵ۖ۠;
    .locals 1

    .line 1319
    sget-object v0, Ll/᩵ۖ۠;->᩸:[Ll/᩵ۖ۠;

    invoke-virtual {v0}, [Ll/᩵ۖ۠;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩵ۖ۠;

    return-object v0
.end method

.method public static ֫(Ll/ۨܶ۠;)Ll/᩵ۖ۠;
    .locals 1

    .line 1343
    sget-object v0, Ll/֡ۖ۠;->᩷ܽ:Ll/֡ۖ۠;

    invoke-virtual {p0, v0}, Ll/ۨܶ۠;->֫(Ll/֡ۖ۠;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    .line 1345
    sget-object p0, Ll/᩵ۖ۠;->᩶:Ll/᩵ۖ۠;

    return-object p0

    .line 52
    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    .line 1346
    invoke-static {p0}, Ll/᩵ۖ۠;->valueOf(Ljava/lang/String;)Ll/᩵ۖ۠;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫()[Ll/᩵ۖ۠;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ll/᩵ۖ۠;

    .line 1319
    sget-object v1, Ll/᩵ۖ۠;->᩹:Ll/᩵ۖ۠;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/᩵ۖ۠;->᩶:Ll/᩵ۖ۠;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/᩵ۖ۠;->ۙ:Ll/᩵ۖ۠;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method
