.class public final enum Ll/ۘ᩸ᩴ;
.super Ljava/lang/Enum;
.source "N673"


# static fields
.field public static final enum END_DIRECTORY:Ll/ۘ᩸ᩴ;

.field public static final enum ENTRY:Ll/ۘ᩸ᩴ;

.field public static final enum START_DIRECTORY:Ll/ۘ᩸ᩴ;

.field public static final synthetic a:[Ll/ۘ᩸ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 113
    new-instance v0, Ll/ۘ᩸ᩴ;

    const-string v1, "START_DIRECTORY"

    const/4 v2, 0x0

    .line 109
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 113
    sput-object v0, Ll/ۘ᩸ᩴ;->START_DIRECTORY:Ll/ۘ᩸ᩴ;

    .line 117
    new-instance v1, Ll/ۘ᩸ᩴ;

    const-string v3, "END_DIRECTORY"

    const/4 v4, 0x1

    .line 109
    invoke-direct {v1, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 117
    sput-object v1, Ll/ۘ᩸ᩴ;->END_DIRECTORY:Ll/ۘ᩸ᩴ;

    .line 121
    new-instance v3, Ll/ۘ᩸ᩴ;

    const-string v5, "ENTRY"

    const/4 v6, 0x2

    .line 109
    invoke-direct {v3, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 121
    sput-object v3, Ll/ۘ᩸ᩴ;->ENTRY:Ll/ۘ᩸ᩴ;

    const/4 v5, 0x3

    new-array v5, v5, [Ll/ۘ᩸ᩴ;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 109
    sput-object v5, Ll/ۘ᩸ᩴ;->a:[Ll/ۘ᩸ᩴ;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۘ᩸ᩴ;
    .locals 1

    .line 109
    const-class v0, Ll/ۘ᩸ᩴ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۘ᩸ᩴ;

    return-object p0
.end method

.method public static values()[Ll/ۘ᩸ᩴ;
    .locals 1

    .line 109
    sget-object v0, Ll/ۘ᩸ᩴ;->a:[Ll/ۘ᩸ᩴ;

    invoke-virtual {v0}, [Ll/ۘ᩸ᩴ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۘ᩸ᩴ;

    return-object v0
.end method
