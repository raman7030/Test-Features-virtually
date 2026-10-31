.class public final enum Ll/ۡ۠;
.super Ljava/lang/Enum;
.source "31KV"


# static fields
.field public static final enum ۗ:Ll/ۡ۠;

.field public static final enum ۙ:Ll/ۡ۠;

.field public static final enum ۬:Ll/ۡ۠;

.field public static final enum ᩶:Ll/ۡ۠;

.field public static final synthetic ᩸:[Ll/ۡ۠;

.field public static final enum ᩹:Ll/ۡ۠;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    .line 79
    new-instance v0, Ll/ۡ۠;

    const-string v1, "UNRESTRICTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ۡ۠;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۡ۠;->۬:Ll/ۡ۠;

    .line 83
    new-instance v1, Ll/ۡ۠;

    const-string v3, "CONSTANT"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ll/ۡ۠;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ll/ۡ۠;->᩹:Ll/ۡ۠;

    .line 87
    new-instance v3, Ll/ۡ۠;

    const-string v5, "SLACK"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ll/ۡ۠;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ll/ۡ۠;->ۙ:Ll/ۡ۠;

    .line 91
    new-instance v5, Ll/ۡ۠;

    const-string v7, "ERROR"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Ll/ۡ۠;-><init>(Ljava/lang/String;I)V

    sput-object v5, Ll/ۡ۠;->᩶:Ll/ۡ۠;

    .line 95
    new-instance v7, Ll/ۡ۠;

    const-string v9, "UNKNOWN"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Ll/ۡ۠;-><init>(Ljava/lang/String;I)V

    sput-object v7, Ll/ۡ۠;->ۗ:Ll/ۡ۠;

    const/4 v9, 0x5

    new-array v9, v9, [Ll/ۡ۠;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    .line 75
    sput-object v9, Ll/ۡ۠;->᩸:[Ll/ۡ۠;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 75
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۡ۠;
    .locals 1

    .line 75
    const-class v0, Ll/ۡ۠;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۡ۠;

    return-object p0
.end method

.method public static values()[Ll/ۡ۠;
    .locals 1

    .line 75
    sget-object v0, Ll/ۡ۠;->᩸:[Ll/ۡ۠;

    invoke-virtual {v0}, [Ll/ۡ۠;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۡ۠;

    return-object v0
.end method
