.class public final enum Ll/ۛۖ֡;
.super Ljava/lang/Enum;
.source "799J"


# static fields
.field public static final enum ۗ:Ll/ۛۖ֡;

.field public static final enum ۙ:Ll/ۛۖ֡;

.field public static final enum ۛ:Ll/ۛۖ֡;

.field public static final enum ۤ:Ll/ۛۖ֡;

.field public static final enum ۨ:Ll/ۛۖ֡;

.field public static final enum ۫:Ll/ۛۖ֡;

.field public static final enum ۬:Ll/ۛۖ֡;

.field public static final enum ᩶:Ll/ۛۖ֡;

.field public static final synthetic ᩸:[Ll/ۛۖ֡;

.field public static final enum ᩹:Ll/ۛۖ֡;

.field public static final enum ᩺:Ll/ۛۖ֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 18

    .line 29
    new-instance v0, Ll/ۛۖ֡;

    const-string v1, "IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ۛۖ֡;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۛۖ֡;->۬:Ll/ۛۖ֡;

    .line 34
    new-instance v1, Ll/ۛۖ֡;

    const-string v2, "ALLOCATED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ll/ۛۖ֡;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ll/ۛۖ֡;->᩶:Ll/ۛۖ֡;

    .line 39
    new-instance v2, Ll/ۛۖ֡;

    const-string v3, "EVICTION"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ll/ۛۖ֡;-><init>(Ljava/lang/String;I)V

    sput-object v2, Ll/ۛۖ֡;->ۙ:Ll/ۛۖ֡;

    .line 49
    new-instance v3, Ll/ۛۖ֡;

    const-string v4, "EVICTION_RETURN_TO_HEAD"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ll/ۛۖ֡;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ll/ۛۖ֡;->ۗ:Ll/ۛۖ֡;

    .line 54
    new-instance v4, Ll/ۛۖ֡;

    const-string v6, "VALIDATION"

    const/4 v7, 0x4

    invoke-direct {v4, v6, v7}, Ll/ۛۖ֡;-><init>(Ljava/lang/String;I)V

    sput-object v4, Ll/ۛۖ֡;->ۛ:Ll/ۛۖ֡;

    .line 60
    new-instance v6, Ll/ۛۖ֡;

    const-string v8, "VALIDATION_PREALLOCATED"

    const/4 v9, 0x5

    invoke-direct {v6, v8, v9}, Ll/ۛۖ֡;-><init>(Ljava/lang/String;I)V

    sput-object v6, Ll/ۛۖ֡;->ۨ:Ll/ۛۖ֡;

    .line 67
    new-instance v8, Ll/ۛۖ֡;

    const-string v10, "VALIDATION_RETURN_TO_HEAD"

    const/4 v11, 0x6

    invoke-direct {v8, v10, v11}, Ll/ۛۖ֡;-><init>(Ljava/lang/String;I)V

    sput-object v8, Ll/ۛۖ֡;->᩺:Ll/ۛۖ֡;

    .line 72
    new-instance v10, Ll/ۛۖ֡;

    const-string v12, "INVALID"

    const/4 v13, 0x0

    const/4 v14, 0x7

    invoke-direct {v10, v12, v14}, Ll/ۛۖ֡;-><init>(Ljava/lang/String;I)V

    sput-object v10, Ll/ۛۖ֡;->۫:Ll/ۛۖ֡;

    .line 77
    new-instance v12, Ll/ۛۖ֡;

    const-string v15, "ABANDONED"

    const/16 v16, 0x1

    const/16 v14, 0x8

    invoke-direct {v12, v15, v14}, Ll/ۛۖ֡;-><init>(Ljava/lang/String;I)V

    sput-object v12, Ll/ۛۖ֡;->᩹:Ll/ۛۖ֡;

    .line 82
    new-instance v14, Ll/ۛۖ֡;

    const-string v15, "RETURNING"

    const/16 v17, 0x2

    const/16 v11, 0x9

    invoke-direct {v14, v15, v11}, Ll/ۛۖ֡;-><init>(Ljava/lang/String;I)V

    sput-object v14, Ll/ۛۖ֡;->ۤ:Ll/ۛۖ֡;

    const/16 v15, 0xa

    new-array v15, v15, [Ll/ۛۖ֡;

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

    .line 24
    sput-object v15, Ll/ۛۖ֡;->᩸:[Ll/ۛۖ֡;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۛۖ֡;
    .locals 1

    .line 24
    const-class v0, Ll/ۛۖ֡;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۛۖ֡;

    return-object p0
.end method

.method public static values()[Ll/ۛۖ֡;
    .locals 1

    .line 24
    sget-object v0, Ll/ۛۖ֡;->᩸:[Ll/ۛۖ֡;

    invoke-virtual {v0}, [Ll/ۛۖ֡;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۛۖ֡;

    return-object v0
.end method
