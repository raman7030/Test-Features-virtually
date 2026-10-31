.class public final enum Ll/ۘ۠ᩴ;
.super Ljava/lang/Enum;
.source "N673"

# interfaces
.implements Ll/᩻۠ᩴ;


# static fields
.field public static final enum APPEND:Ll/ۘ۠ᩴ;

.field public static final enum CREATE:Ll/ۘ۠ᩴ;

.field public static final enum CREATE_NEW:Ll/ۘ۠ᩴ;

.field public static final enum DELETE_ON_CLOSE:Ll/ۘ۠ᩴ;

.field public static final enum DSYNC:Ll/ۘ۠ᩴ;

.field public static final enum READ:Ll/ۘ۠ᩴ;

.field public static final enum SPARSE:Ll/ۘ۠ᩴ;

.field public static final enum SYNC:Ll/ۘ۠ᩴ;

.field public static final enum TRUNCATE_EXISTING:Ll/ۘ۠ᩴ;

.field public static final enum WRITE:Ll/ۘ۠ᩴ;

.field public static final synthetic a:[Ll/ۘ۠ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 18

    .line 38
    new-instance v0, Ll/ۘ۠ᩴ;

    const-string v1, "READ"

    const/4 v2, 0x0

    .line 34
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 38
    sput-object v0, Ll/ۘ۠ᩴ;->READ:Ll/ۘ۠ᩴ;

    .line 43
    new-instance v1, Ll/ۘ۠ᩴ;

    const-string v2, "WRITE"

    const/4 v3, 0x1

    .line 34
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 43
    sput-object v1, Ll/ۘ۠ᩴ;->WRITE:Ll/ۘ۠ᩴ;

    .line 52
    new-instance v2, Ll/ۘ۠ᩴ;

    const-string v3, "APPEND"

    const/4 v4, 0x2

    .line 34
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 52
    sput-object v2, Ll/ۘ۠ᩴ;->APPEND:Ll/ۘ۠ᩴ;

    .line 59
    new-instance v3, Ll/ۘ۠ᩴ;

    const-string v4, "TRUNCATE_EXISTING"

    const/4 v5, 0x3

    .line 34
    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 59
    sput-object v3, Ll/ۘ۠ᩴ;->TRUNCATE_EXISTING:Ll/ۘ۠ᩴ;

    .line 68
    new-instance v4, Ll/ۘ۠ᩴ;

    const-string v6, "CREATE"

    const/4 v7, 0x4

    .line 34
    invoke-direct {v4, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 68
    sput-object v4, Ll/ۘ۠ᩴ;->CREATE:Ll/ۘ۠ᩴ;

    .line 76
    new-instance v6, Ll/ۘ۠ᩴ;

    const-string v8, "CREATE_NEW"

    const/4 v9, 0x5

    .line 34
    invoke-direct {v6, v8, v9}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 76
    sput-object v6, Ll/ۘ۠ᩴ;->CREATE_NEW:Ll/ۘ۠ᩴ;

    .line 100
    new-instance v8, Ll/ۘ۠ᩴ;

    const-string v10, "DELETE_ON_CLOSE"

    const/4 v11, 0x6

    .line 34
    invoke-direct {v8, v10, v11}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 100
    sput-object v8, Ll/ۘ۠ᩴ;->DELETE_ON_CLOSE:Ll/ۘ۠ᩴ;

    .line 108
    new-instance v10, Ll/ۘ۠ᩴ;

    const-string v12, "SPARSE"

    const/4 v13, 0x0

    const/4 v14, 0x7

    .line 34
    invoke-direct {v10, v12, v14}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 108
    sput-object v10, Ll/ۘ۠ᩴ;->SPARSE:Ll/ۘ۠ᩴ;

    .line 116
    new-instance v12, Ll/ۘ۠ᩴ;

    const-string v15, "SYNC"

    const/16 v16, 0x1

    const/16 v14, 0x8

    .line 34
    invoke-direct {v12, v15, v14}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 116
    sput-object v12, Ll/ۘ۠ᩴ;->SYNC:Ll/ۘ۠ᩴ;

    .line 124
    new-instance v14, Ll/ۘ۠ᩴ;

    const-string v15, "DSYNC"

    const/16 v17, 0x2

    const/16 v11, 0x9

    .line 34
    invoke-direct {v14, v15, v11}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 124
    sput-object v14, Ll/ۘ۠ᩴ;->DSYNC:Ll/ۘ۠ᩴ;

    const/16 v15, 0xa

    new-array v15, v15, [Ll/ۘ۠ᩴ;

    aput-object v0, v15, v13

    aput-object v1, v15, v16

    aput-object v2, v15, v17

    aput-object v3, v15, v5

    aput-object v4, v15, v7

    aput-object v6, v15, v9

    const/4 v0, 0x6

    aput-object v8, v15, v0

    const/4 v0, 0x7

    aput-object v10, v15, v0

    const/16 v0, 0x8

    aput-object v12, v15, v0

    aput-object v14, v15, v11

    .line 34
    sput-object v15, Ll/ۘ۠ᩴ;->a:[Ll/ۘ۠ᩴ;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۘ۠ᩴ;
    .locals 1

    .line 34
    const-class v0, Ll/ۘ۠ᩴ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۘ۠ᩴ;

    return-object p0
.end method

.method public static values()[Ll/ۘ۠ᩴ;
    .locals 1

    .line 34
    sget-object v0, Ll/ۘ۠ᩴ;->a:[Ll/ۘ۠ᩴ;

    invoke-virtual {v0}, [Ll/ۘ۠ᩴ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۘ۠ᩴ;

    return-object v0
.end method
