.class public final enum Ll/᩷ۚۘ;
.super Ljava/lang/Enum;
.source "O89D"

# interfaces
.implements Ll/᩸ܰۖ;


# static fields
.field public static final enum ۗ:Ll/᩷ۚۘ;

.field public static final enum ۙ:Ll/᩷ۚۘ;

.field public static final enum ۛ:Ll/᩷ۚۘ;

.field public static final enum ۤ:Ll/᩷ۚۘ;

.field public static final enum ۫:Ll/᩷ۚۘ;

.field public static final enum ۬:Ll/᩷ۚۘ;

.field public static final enum ᩶:Ll/᩷ۚۘ;

.field public static final synthetic ᩹:[Ll/᩷ۚۘ;


# instance fields
.field public final ᩸:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 45
    new-instance v0, Ll/᩷ۚۘ;

    const-string v1, "FIRST_FRAGMENT"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Ll/᩷ۚۘ;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/᩷ۚۘ;->ۗ:Ll/᩷ۚۘ;

    .line 49
    new-instance v0, Ll/᩷ۚۘ;

    const-string v1, "LAST_FRAGMENT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Ll/᩷ۚۘ;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/᩷ۚۘ;->۬:Ll/᩷ۚۘ;

    .line 53
    new-instance v0, Ll/᩷ۚۘ;

    const-string v1, "PENDING_CANCEL"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Ll/᩷ۚۘ;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/᩷ۚۘ;->ۛ:Ll/᩷ۚۘ;

    .line 57
    new-instance v0, Ll/᩷ۚۘ;

    const/4 v1, 0x3

    const/16 v2, 0x10

    const-string v4, "CONCURRENT_MULTIPLEXING"

    invoke-direct {v0, v4, v1, v2}, Ll/᩷ۚۘ;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/᩷ۚۘ;->᩶:Ll/᩷ۚۘ;

    .line 61
    new-instance v0, Ll/᩷ۚۘ;

    const-string v1, "DID_NOT_EXECUTE"

    const/16 v2, 0x20

    invoke-direct {v0, v1, v3, v2}, Ll/᩷ۚۘ;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/᩷ۚۘ;->ۙ:Ll/᩷ۚۘ;

    .line 65
    new-instance v0, Ll/᩷ۚۘ;

    const/4 v1, 0x5

    const/16 v2, 0x40

    const-string v3, "MAYBE"

    invoke-direct {v0, v3, v1, v2}, Ll/᩷ۚۘ;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/᩷ۚۘ;->۫:Ll/᩷ۚۘ;

    .line 70
    new-instance v0, Ll/᩷ۚۘ;

    const/4 v1, 0x6

    const/16 v2, 0x80

    const-string v3, "OBJECT_UUID"

    invoke-direct {v0, v3, v1, v2}, Ll/᩷ۚۘ;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/᩷ۚۘ;->ۤ:Ll/᩷ۚۘ;

    .line 41
    invoke-static {}, Ll/᩷ۚۘ;->֫()[Ll/᩷ۚۘ;

    move-result-object v0

    sput-object v0, Ll/᩷ۚۘ;->᩹:[Ll/᩷ۚۘ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 74
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 75
    iput p3, p0, Ll/᩷ۚۘ;->᩸:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩷ۚۘ;
    .locals 1

    .line 41
    const-class v0, Ll/᩷ۚۘ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩷ۚۘ;

    return-object p0
.end method

.method public static values()[Ll/᩷ۚۘ;
    .locals 1

    .line 41
    sget-object v0, Ll/᩷ۚۘ;->᩹:[Ll/᩷ۚۘ;

    invoke-virtual {v0}, [Ll/᩷ۚۘ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩷ۚۘ;

    return-object v0
.end method

.method public static synthetic ֫()[Ll/᩷ۚۘ;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Ll/᩷ۚۘ;

    .line 41
    sget-object v1, Ll/᩷ۚۘ;->ۗ:Ll/᩷ۚۘ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/᩷ۚۘ;->۬:Ll/᩷ۚۘ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/᩷ۚۘ;->ۛ:Ll/᩷ۚۘ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/᩷ۚۘ;->᩶:Ll/᩷ۚۘ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ll/᩷ۚۘ;->ۙ:Ll/᩷ۚۘ;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Ll/᩷ۚۘ;->۫:Ll/᩷ۚۘ;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Ll/᩷ۚۘ;->ۤ:Ll/᩷ۚۘ;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public getValue()J
    .locals 2

    .line 80
    iget v0, p0, Ll/᩷ۚۘ;->᩸:I

    int-to-long v0, v0

    return-wide v0
.end method
