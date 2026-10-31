.class public final enum Ll/ᩳܶ;
.super Ljava/lang/Enum;
.source "81CV"


# static fields
.field public static final enum ۗ:Ll/ᩳܶ;

.field public static final enum ۙ:Ll/ᩳܶ;

.field public static final enum ۛ:Ll/ᩳܶ;

.field public static final enum ۤ:Ll/ᩳܶ;

.field public static final enum ۫:Ll/ᩳܶ;

.field public static final enum ۬:Ll/ᩳܶ;

.field public static final enum ᩶:Ll/ᩳܶ;

.field public static final synthetic ᩸:[Ll/ᩳܶ;

.field public static final enum ᩹:Ll/ᩳܶ;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    .line 27
    new-instance v0, Ll/ᩳܶ;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ᩳܶ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ᩳܶ;->ۤ:Ll/ᩳܶ;

    new-instance v1, Ll/ᩳܶ;

    const-string v2, "HORIZONTAL_DIMENSION"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ll/ᩳܶ;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ll/ᩳܶ;->ۙ:Ll/ᩳܶ;

    new-instance v2, Ll/ᩳܶ;

    const-string v4, "VERTICAL_DIMENSION"

    const/4 v5, 0x2

    invoke-direct {v2, v4, v5}, Ll/ᩳܶ;-><init>(Ljava/lang/String;I)V

    sput-object v2, Ll/ᩳܶ;->ۛ:Ll/ᩳܶ;

    new-instance v4, Ll/ᩳܶ;

    const-string v6, "LEFT"

    const/4 v7, 0x3

    invoke-direct {v4, v6, v7}, Ll/ᩳܶ;-><init>(Ljava/lang/String;I)V

    sput-object v4, Ll/ᩳܶ;->ۗ:Ll/ᩳܶ;

    new-instance v6, Ll/ᩳܶ;

    const-string v8, "RIGHT"

    const/4 v9, 0x4

    invoke-direct {v6, v8, v9}, Ll/ᩳܶ;-><init>(Ljava/lang/String;I)V

    sput-object v6, Ll/ᩳܶ;->۬:Ll/ᩳܶ;

    new-instance v8, Ll/ᩳܶ;

    const-string v10, "TOP"

    const/4 v11, 0x5

    invoke-direct {v8, v10, v11}, Ll/ᩳܶ;-><init>(Ljava/lang/String;I)V

    sput-object v8, Ll/ᩳܶ;->۫:Ll/ᩳܶ;

    new-instance v10, Ll/ᩳܶ;

    const-string v12, "BOTTOM"

    const/4 v13, 0x6

    invoke-direct {v10, v12, v13}, Ll/ᩳܶ;-><init>(Ljava/lang/String;I)V

    sput-object v10, Ll/ᩳܶ;->᩶:Ll/ᩳܶ;

    new-instance v12, Ll/ᩳܶ;

    const-string v14, "BASELINE"

    const/4 v15, 0x0

    const/4 v13, 0x7

    invoke-direct {v12, v14, v13}, Ll/ᩳܶ;-><init>(Ljava/lang/String;I)V

    sput-object v12, Ll/ᩳܶ;->᩹:Ll/ᩳܶ;

    const/16 v14, 0x8

    new-array v14, v14, [Ll/ᩳܶ;

    aput-object v0, v14, v15

    aput-object v1, v14, v3

    aput-object v2, v14, v5

    aput-object v4, v14, v7

    aput-object v6, v14, v9

    aput-object v8, v14, v11

    const/4 v0, 0x6

    aput-object v10, v14, v0

    aput-object v12, v14, v13

    sput-object v14, Ll/ᩳܶ;->᩸:[Ll/ᩳܶ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ᩳܶ;
    .locals 1

    .line 27
    const-class v0, Ll/ᩳܶ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ᩳܶ;

    return-object p0
.end method

.method public static values()[Ll/ᩳܶ;
    .locals 1

    .line 27
    sget-object v0, Ll/ᩳܶ;->᩸:[Ll/ᩳܶ;

    invoke-virtual {v0}, [Ll/ᩳܶ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ᩳܶ;

    return-object v0
.end method
