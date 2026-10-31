.class public final enum Ll/ۛ᩹᩷;
.super Ljava/lang/Enum;
.source "792D"


# static fields
.field public static final enum ۙ:Ll/ۛ᩹᩷;

.field public static final enum ᩶:Ll/ۛ᩹᩷;

.field public static final synthetic ᩸:[Ll/ۛ᩹᩷;

.field public static final enum ᩹:Ll/ۛ᩹᩷;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 48
    new-instance v0, Ll/ۛ᩹᩷;

    const-string v1, "IMMUTABLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ۛ᩹᩷;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۛ᩹᩷;->ۙ:Ll/ۛ᩹᩷;

    .line 49
    new-instance v0, Ll/ۛ᩹᩷;

    const-string v1, "COLOR_FOLDER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/ۛ᩹᩷;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۛ᩹᩷;->᩶:Ll/ۛ᩹᩷;

    .line 50
    new-instance v0, Ll/ۛ᩹᩷;

    const-string v1, "COLOR_ACCENT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ll/ۛ᩹᩷;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۛ᩹᩷;->᩹:Ll/ۛ᩹᩷;

    .line 47
    invoke-static {}, Ll/ۛ᩹᩷;->᩻()[Ll/ۛ᩹᩷;

    move-result-object v0

    sput-object v0, Ll/ۛ᩹᩷;->᩸:[Ll/ۛ᩹᩷;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۛ᩹᩷;
    .locals 1

    .line 47
    const-class v0, Ll/ۛ᩹᩷;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۛ᩹᩷;

    return-object p0
.end method

.method public static values()[Ll/ۛ᩹᩷;
    .locals 1

    .line 47
    sget-object v0, Ll/ۛ᩹᩷;->᩸:[Ll/ۛ᩹᩷;

    invoke-virtual {v0}, [Ll/ۛ᩹᩷;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۛ᩹᩷;

    return-object v0
.end method

.method public static ֫(Ll/᩸ۖܳ;)Ll/ۛ᩹᩷;
    .locals 1

    .line 65
    sget-object v0, Ll/᩶ۖܳ;->֫ۧ:Ll/᩸ۖܳ;

    if-ne p0, v0, :cond_0

    .line 66
    sget-object p0, Ll/ۛ᩹᩷;->᩶:Ll/ۛ᩹᩷;

    return-object p0

    .line 67
    :cond_0
    sget-object v0, Ll/᩶ۖܳ;->ۨ֫:Ll/᩸ۖܳ;

    if-ne p0, v0, :cond_1

    .line 68
    sget-object p0, Ll/ۛ᩹᩷;->᩹:Ll/ۛ᩹᩷;

    return-object p0

    .line 70
    :cond_1
    sget-object p0, Ll/ۛ᩹᩷;->ۙ:Ll/ۛ᩹᩷;

    return-object p0
.end method

.method public static synthetic ᩻()[Ll/ۛ᩹᩷;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ll/ۛ᩹᩷;

    .line 47
    sget-object v1, Ll/ۛ᩹᩷;->ۙ:Ll/ۛ᩹᩷;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۛ᩹᩷;->᩶:Ll/ۛ᩹᩷;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ۛ᩹᩷;->᩹:Ll/ۛ᩹᩷;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ֫()Z
    .locals 1

    .line 61
    sget-object v0, Ll/ۛ᩹᩷;->᩹:Ll/ۛ᩹᩷;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ۧ()Z
    .locals 1

    .line 57
    sget-object v0, Ll/ۛ᩹᩷;->᩶:Ll/ۛ᩹᩷;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ܿ()Z
    .locals 1

    .line 53
    sget-object v0, Ll/ۛ᩹᩷;->ۙ:Ll/ۛ᩹᩷;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
