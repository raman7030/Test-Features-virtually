.class public final enum Ll/᩸᩵ܿ;
.super Ljava/lang/Enum;
.source "W6WY"


# static fields
.field public static final enum ۗ:Ll/᩸᩵ܿ;

.field public static final enum ۙ:Ll/᩸᩵ܿ;

.field public static final enum ۛ:Ll/᩸᩵ܿ;

.field public static final enum ۤ:Ll/᩸᩵ܿ;

.field public static final enum ۨ:Ll/᩸᩵ܿ;

.field public static final enum ۫:Ll/᩸᩵ܿ;

.field public static final enum ۬:Ll/᩸᩵ܿ;

.field public static final enum ᩶:Ll/᩸᩵ܿ;

.field public static final synthetic ᩸:[Ll/᩸᩵ܿ;

.field public static final enum ᩹:Ll/᩸᩵ܿ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 18
    new-instance v0, Ll/᩸᩵ܿ;

    const-string v1, "NOT_FOUND"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/᩸᩵ܿ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩸᩵ܿ;->۫:Ll/᩸᩵ܿ;

    .line 19
    new-instance v0, Ll/᩸᩵ܿ;

    const-string v1, "ALREADY_EXISTS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/᩸᩵ܿ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩸᩵ܿ;->᩹:Ll/᩸᩵ܿ;

    .line 20
    new-instance v0, Ll/᩸᩵ܿ;

    const-string v1, "NOT_REGULAR_FILE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ll/᩸᩵ܿ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩸᩵ܿ;->ۤ:Ll/᩸᩵ܿ;

    .line 21
    new-instance v0, Ll/᩸᩵ܿ;

    const-string v1, "NOT_DIRECTORY"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ll/᩸᩵ܿ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩸᩵ܿ;->۬:Ll/᩸᩵ܿ;

    .line 22
    new-instance v0, Ll/᩸᩵ܿ;

    const-string v1, "DIRECTORY_NOT_EMPTY"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ll/᩸᩵ܿ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩸᩵ܿ;->ۙ:Ll/᩸᩵ܿ;

    .line 23
    new-instance v0, Ll/᩸᩵ܿ;

    const-string v1, "PERMISSION_DENIED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ll/᩸᩵ܿ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩸᩵ܿ;->ۛ:Ll/᩸᩵ܿ;

    .line 24
    new-instance v0, Ll/᩸᩵ܿ;

    const-string v1, "CROSS_BACKEND"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Ll/᩸᩵ܿ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩸᩵ܿ;->᩶:Ll/᩸᩵ܿ;

    .line 25
    new-instance v0, Ll/᩸᩵ܿ;

    const-string v1, "UNSUPPORTED"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Ll/᩸᩵ܿ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩸᩵ܿ;->ۨ:Ll/᩸᩵ܿ;

    .line 26
    new-instance v0, Ll/᩸᩵ܿ;

    const-string v1, "IO_ERROR"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Ll/᩸᩵ܿ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩸᩵ܿ;->ۗ:Ll/᩸᩵ܿ;

    .line 17
    invoke-static {}, Ll/᩸᩵ܿ;->֫()[Ll/᩸᩵ܿ;

    move-result-object v0

    sput-object v0, Ll/᩸᩵ܿ;->᩸:[Ll/᩸᩵ܿ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩸᩵ܿ;
    .locals 1

    .line 17
    const-class v0, Ll/᩸᩵ܿ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩸᩵ܿ;

    return-object p0
.end method

.method public static values()[Ll/᩸᩵ܿ;
    .locals 1

    .line 17
    sget-object v0, Ll/᩸᩵ܿ;->᩸:[Ll/᩸᩵ܿ;

    invoke-virtual {v0}, [Ll/᩸᩵ܿ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩸᩵ܿ;

    return-object v0
.end method

.method public static synthetic ֫()[Ll/᩸᩵ܿ;
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [Ll/᩸᩵ܿ;

    .line 17
    sget-object v1, Ll/᩸᩵ܿ;->۫:Ll/᩸᩵ܿ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/᩸᩵ܿ;->᩹:Ll/᩸᩵ܿ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/᩸᩵ܿ;->ۤ:Ll/᩸᩵ܿ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/᩸᩵ܿ;->۬:Ll/᩸᩵ܿ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ll/᩸᩵ܿ;->ۙ:Ll/᩸᩵ܿ;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Ll/᩸᩵ܿ;->ۛ:Ll/᩸᩵ܿ;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Ll/᩸᩵ܿ;->᩶:Ll/᩸᩵ܿ;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Ll/᩸᩵ܿ;->ۨ:Ll/᩸᩵ܿ;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Ll/᩸᩵ܿ;->ۗ:Ll/᩸᩵ܿ;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    return-object v0
.end method
