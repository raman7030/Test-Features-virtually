.class public final enum Ll/۬۠ᩴ;
.super Ljava/lang/Enum;
.source "N673"


# static fields
.field public static final enum GROUP_EXECUTE:Ll/۬۠ᩴ;

.field public static final enum GROUP_READ:Ll/۬۠ᩴ;

.field public static final enum GROUP_WRITE:Ll/۬۠ᩴ;

.field public static final enum OTHERS_EXECUTE:Ll/۬۠ᩴ;

.field public static final enum OTHERS_READ:Ll/۬۠ᩴ;

.field public static final enum OTHERS_WRITE:Ll/۬۠ᩴ;

.field public static final enum OWNER_EXECUTE:Ll/۬۠ᩴ;

.field public static final enum OWNER_READ:Ll/۬۠ᩴ;

.field public static final enum OWNER_WRITE:Ll/۬۠ᩴ;

.field public static final synthetic a:[Ll/۬۠ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 17

    .line 43
    new-instance v0, Ll/۬۠ᩴ;

    const-string v1, "OWNER_READ"

    const/4 v2, 0x0

    .line 38
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 43
    sput-object v0, Ll/۬۠ᩴ;->OWNER_READ:Ll/۬۠ᩴ;

    .line 48
    new-instance v1, Ll/۬۠ᩴ;

    const-string v2, "OWNER_WRITE"

    const/4 v3, 0x1

    .line 38
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 48
    sput-object v1, Ll/۬۠ᩴ;->OWNER_WRITE:Ll/۬۠ᩴ;

    .line 53
    new-instance v2, Ll/۬۠ᩴ;

    const-string v3, "OWNER_EXECUTE"

    const/4 v4, 0x2

    .line 38
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 53
    sput-object v2, Ll/۬۠ᩴ;->OWNER_EXECUTE:Ll/۬۠ᩴ;

    .line 58
    new-instance v3, Ll/۬۠ᩴ;

    const-string v5, "GROUP_READ"

    const/4 v6, 0x3

    .line 38
    invoke-direct {v3, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 58
    sput-object v3, Ll/۬۠ᩴ;->GROUP_READ:Ll/۬۠ᩴ;

    .line 63
    new-instance v5, Ll/۬۠ᩴ;

    const-string v7, "GROUP_WRITE"

    const/4 v8, 0x4

    .line 38
    invoke-direct {v5, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 63
    sput-object v5, Ll/۬۠ᩴ;->GROUP_WRITE:Ll/۬۠ᩴ;

    .line 68
    new-instance v7, Ll/۬۠ᩴ;

    const-string v9, "GROUP_EXECUTE"

    const/4 v10, 0x5

    .line 38
    invoke-direct {v7, v9, v10}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 68
    sput-object v7, Ll/۬۠ᩴ;->GROUP_EXECUTE:Ll/۬۠ᩴ;

    .line 73
    new-instance v9, Ll/۬۠ᩴ;

    const-string v11, "OTHERS_READ"

    const/4 v12, 0x6

    .line 38
    invoke-direct {v9, v11, v12}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 73
    sput-object v9, Ll/۬۠ᩴ;->OTHERS_READ:Ll/۬۠ᩴ;

    .line 78
    new-instance v11, Ll/۬۠ᩴ;

    const-string v13, "OTHERS_WRITE"

    const/4 v14, 0x0

    const/4 v15, 0x7

    .line 38
    invoke-direct {v11, v13, v15}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 78
    sput-object v11, Ll/۬۠ᩴ;->OTHERS_WRITE:Ll/۬۠ᩴ;

    .line 83
    new-instance v13, Ll/۬۠ᩴ;

    const-string v15, "OTHERS_EXECUTE"

    const/16 v16, 0x1

    const/16 v12, 0x8

    .line 38
    invoke-direct {v13, v15, v12}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 83
    sput-object v13, Ll/۬۠ᩴ;->OTHERS_EXECUTE:Ll/۬۠ᩴ;

    const/16 v15, 0x9

    new-array v15, v15, [Ll/۬۠ᩴ;

    aput-object v0, v15, v14

    aput-object v1, v15, v16

    aput-object v2, v15, v4

    aput-object v3, v15, v6

    aput-object v5, v15, v8

    aput-object v7, v15, v10

    const/4 v0, 0x6

    aput-object v9, v15, v0

    const/4 v0, 0x7

    aput-object v11, v15, v0

    aput-object v13, v15, v12

    .line 38
    sput-object v15, Ll/۬۠ᩴ;->a:[Ll/۬۠ᩴ;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/۬۠ᩴ;
    .locals 1

    .line 38
    const-class v0, Ll/۬۠ᩴ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/۬۠ᩴ;

    return-object p0
.end method

.method public static values()[Ll/۬۠ᩴ;
    .locals 1

    .line 38
    sget-object v0, Ll/۬۠ᩴ;->a:[Ll/۬۠ᩴ;

    invoke-virtual {v0}, [Ll/۬۠ᩴ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/۬۠ᩴ;

    return-object v0
.end method
