.class public final enum Ll/ۘۚۘ;
.super Ljava/lang/Enum;
.source "B8AJ"


# static fields
.field public static final enum ۗ:Ll/ۘۚۘ;

.field public static final enum ۙ:Ll/ۘۚۘ;

.field public static final enum ۬:Ll/ۘۚۘ;

.field public static final enum ᩶:Ll/ۘۚۘ;

.field public static final synthetic ᩹:[Ll/ۘۚۘ;


# instance fields
.field public final ᩸:B


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 25
    new-instance v0, Ll/ۘۚۘ;

    const-string v1, "ONE"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Ll/ۘۚۘ;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Ll/ۘۚۘ;->ۗ:Ll/ۘۚۘ;

    .line 26
    new-instance v0, Ll/ۘۚۘ;

    const-string v1, "TWO"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Ll/ۘۚۘ;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Ll/ۘۚۘ;->۬:Ll/ۘۚۘ;

    .line 27
    new-instance v0, Ll/ۘۚۘ;

    const-string v1, "FOUR"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Ll/ۘۚۘ;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Ll/ۘۚۘ;->ۙ:Ll/ۘۚۘ;

    .line 28
    new-instance v0, Ll/ۘۚۘ;

    const/4 v1, 0x3

    const/16 v2, 0x8

    const-string v3, "EIGHT"

    invoke-direct {v0, v3, v1, v2}, Ll/ۘۚۘ;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Ll/ۘۚۘ;->᩶:Ll/ۘۚۘ;

    .line 24
    invoke-static {}, Ll/ۘۚۘ;->ۧ()[Ll/ۘۚۘ;

    move-result-object v0

    sput-object v0, Ll/ۘۚۘ;->᩹:[Ll/ۘۚۘ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IB)V
    .locals 0

    .line 32
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    add-int/lit8 p3, p3, -0x1

    int-to-byte p1, p3

    .line 33
    iput-byte p1, p0, Ll/ۘۚۘ;->᩸:B

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۘۚۘ;
    .locals 1

    .line 24
    const-class v0, Ll/ۘۚۘ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۘۚۘ;

    return-object p0
.end method

.method public static values()[Ll/ۘۚۘ;
    .locals 1

    .line 24
    sget-object v0, Ll/ۘۚۘ;->᩹:[Ll/ۘۚۘ;

    invoke-virtual {v0}, [Ll/ۘۚۘ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۘۚۘ;

    return-object v0
.end method

.method public static synthetic ۧ()[Ll/ۘۚۘ;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ll/ۘۚۘ;

    .line 24
    sget-object v1, Ll/ۘۚۘ;->ۗ:Ll/ۘۚۘ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۘۚۘ;->۬:Ll/ۘۚۘ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ۘۚۘ;->ۙ:Ll/ۘۚۘ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/ۘۚۘ;->᩶:Ll/ۘۚۘ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ֫()B
    .locals 1

    .line 40
    iget-byte v0, p0, Ll/ۘۚۘ;->᩸:B

    return v0
.end method
