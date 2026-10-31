.class public final enum Ll/ᩴۖۖ;
.super Ljava/lang/Enum;
.source "99PI"


# static fields
.field public static final enum ۗ:Ll/ᩴۖۖ;

.field public static final enum ۙ:Ll/ᩴۖۖ;

.field public static final enum ۛ:Ll/ᩴۖۖ;

.field public static final enum ۤ:Ll/ᩴۖۖ;

.field public static final enum ۨ:Ll/ᩴۖۖ;

.field public static final enum ۫:Ll/ᩴۖۖ;

.field public static final enum ۬:Ll/ᩴۖۖ;

.field public static final enum ᩶:Ll/ᩴۖۖ;

.field public static final synthetic ᩹:[Ll/ᩴۖۖ;

.field public static final enum ᩺:Ll/ᩴۖۖ;


# instance fields
.field public final ᩸:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 17

    .line 1678
    new-instance v0, Ll/ᩴۖۖ;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "INT"

    invoke-direct {v0, v3, v1, v2}, Ll/ᩴۖۖ;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, Ll/ᩴۖۖ;->ۤ:Ll/ᩴۖۖ;

    .line 1679
    new-instance v1, Ll/ᩴۖۖ;

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "LONG"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v2}, Ll/ᩴۖۖ;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v1, Ll/ᩴۖۖ;->ۛ:Ll/ᩴۖۖ;

    .line 1680
    new-instance v2, Ll/ᩴۖۖ;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const-string v4, "FLOAT"

    const/4 v5, 0x2

    invoke-direct {v2, v4, v5, v3}, Ll/ᩴۖۖ;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v2, Ll/ᩴۖۖ;->۫:Ll/ᩴۖۖ;

    .line 1681
    new-instance v3, Ll/ᩴۖۖ;

    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    const-string v5, "DOUBLE"

    const/4 v6, 0x3

    invoke-direct {v3, v5, v6, v4}, Ll/ᩴۖۖ;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v3, Ll/ᩴۖۖ;->ۗ:Ll/ᩴۖۖ;

    .line 1682
    new-instance v4, Ll/ᩴۖۖ;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v7, "BOOLEAN"

    const/4 v8, 0x4

    invoke-direct {v4, v7, v8, v5}, Ll/ᩴۖۖ;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v4, Ll/ᩴۖۖ;->᩶:Ll/ᩴۖۖ;

    .line 1683
    new-instance v5, Ll/ᩴۖۖ;

    const-string v7, ""

    const-string v9, "STRING"

    const/4 v10, 0x5

    invoke-direct {v5, v9, v10, v7}, Ll/ᩴۖۖ;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v5, Ll/ᩴۖۖ;->᩺:Ll/ᩴۖۖ;

    .line 1684
    new-instance v7, Ll/ᩴۖۖ;

    sget-object v9, Ll/ۛۜۖ;->᩹:Ll/ۛۜۖ;

    const-string v11, "BYTE_STRING"

    const/4 v12, 0x6

    invoke-direct {v7, v11, v12, v9}, Ll/ᩴۖۖ;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v7, Ll/ᩴۖۖ;->ۙ:Ll/ᩴۖۖ;

    .line 1685
    new-instance v9, Ll/ᩴۖۖ;

    const-string v11, "ENUM"

    const/4 v13, 0x0

    const/4 v14, 0x7

    const/4 v15, 0x1

    const/4 v12, 0x0

    invoke-direct {v9, v11, v14, v12}, Ll/ᩴۖۖ;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v9, Ll/ᩴۖۖ;->۬:Ll/ᩴۖۖ;

    .line 1686
    new-instance v11, Ll/ᩴۖۖ;

    const-string v14, "MESSAGE"

    const/16 v16, 0x2

    const/16 v10, 0x8

    invoke-direct {v11, v14, v10, v12}, Ll/ᩴۖۖ;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v11, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    const/16 v12, 0x9

    new-array v12, v12, [Ll/ᩴۖۖ;

    aput-object v0, v12, v13

    aput-object v1, v12, v15

    aput-object v2, v12, v16

    aput-object v3, v12, v6

    aput-object v4, v12, v8

    const/4 v0, 0x5

    aput-object v5, v12, v0

    const/4 v0, 0x6

    aput-object v7, v12, v0

    const/4 v0, 0x7

    aput-object v9, v12, v0

    aput-object v11, v12, v10

    .line 1677
    sput-object v12, Ll/ᩴۖۖ;->᩹:[Ll/ᩴۖۖ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    .line 1688
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 1689
    iput-object p3, p0, Ll/ᩴۖۖ;->᩸:Ljava/lang/Object;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ᩴۖۖ;
    .locals 1

    .line 1677
    const-class v0, Ll/ᩴۖۖ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ᩴۖۖ;

    return-object p0
.end method

.method public static values()[Ll/ᩴۖۖ;
    .locals 1

    .line 1677
    sget-object v0, Ll/ᩴۖۖ;->᩹:[Ll/ᩴۖۖ;

    invoke-virtual {v0}, [Ll/ᩴۖۖ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ᩴۖۖ;

    return-object v0
.end method

.method public static synthetic ֫(Ll/ᩴۖۖ;)Ljava/lang/Object;
    .locals 0

    .line 1677
    iget-object p0, p0, Ll/ᩴۖۖ;->᩸:Ljava/lang/Object;

    return-object p0
.end method
