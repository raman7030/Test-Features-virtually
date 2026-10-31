.class public final enum Ll/ۛۚܿ;
.super Ljava/lang/Enum;
.source "LAQJ"


# static fields
.field public static final enum ۗ:Ll/ۛۚܿ;

.field public static final enum ۙ:Ll/ۛۚܿ;

.field public static final enum ᩶:Ll/ۛۚܿ;

.field public static final synthetic ᩸:[Ll/ۛۚܿ;

.field public static final enum ᩹:Ll/ۛۚܿ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1600
    new-instance v0, Ll/ۛۚܿ;

    const-string v1, "SHIZUKU"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ۛۚܿ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۛۚܿ;->ۙ:Ll/ۛۚܿ;

    .line 1601
    new-instance v0, Ll/ۛۚܿ;

    const-string v1, "DHIZUKU"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/ۛۚܿ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۛۚܿ;->᩹:Ll/ۛۚܿ;

    .line 1602
    new-instance v0, Ll/ۛۚܿ;

    const-string v1, "SHELL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ll/ۛۚܿ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۛۚܿ;->᩶:Ll/ۛۚܿ;

    .line 1603
    new-instance v0, Ll/ۛۚܿ;

    const-string v1, "SYSTEM"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ll/ۛۚܿ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۛۚܿ;->ۗ:Ll/ۛۚܿ;

    .line 1599
    invoke-static {}, Ll/ۛۚܿ;->ۧ()[Ll/ۛۚܿ;

    move-result-object v0

    sput-object v0, Ll/ۛۚܿ;->᩸:[Ll/ۛۚܿ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1599
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۛۚܿ;
    .locals 1

    .line 1599
    const-class v0, Ll/ۛۚܿ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۛۚܿ;

    return-object p0
.end method

.method public static values()[Ll/ۛۚܿ;
    .locals 1

    .line 1599
    sget-object v0, Ll/ۛۚܿ;->᩸:[Ll/ۛۚܿ;

    invoke-virtual {v0}, [Ll/ۛۚܿ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۛۚܿ;

    return-object v0
.end method

.method public static synthetic ۧ()[Ll/ۛۚܿ;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ll/ۛۚܿ;

    .line 1599
    sget-object v1, Ll/ۛۚܿ;->ۙ:Ll/ۛۚܿ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۛۚܿ;->᩹:Ll/ۛۚܿ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ۛۚܿ;->᩶:Ll/ۛۚܿ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/ۛۚܿ;->ۗ:Ll/ۛۚܿ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ֫()Ll/ۛۚܿ;
    .locals 3

    .line 1606
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    .line 1607
    invoke-static {}, Ll/ۛۚܿ;->values()[Ll/ۛۚܿ;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    .line 1608
    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 1611
    aget-object v0, v1, v0

    return-object v0

    .line 1609
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method
