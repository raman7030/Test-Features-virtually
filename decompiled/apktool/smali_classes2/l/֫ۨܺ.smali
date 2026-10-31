.class public abstract enum Ll/֫ۨܺ;
.super Ljava/lang/Enum;
.source "15PL"


# static fields
.field public static final enum ۗ:Ll/֫ۨܺ;

.field public static final enum ۙ:Ll/֫ۨܺ;

.field public static final enum ۬:Ll/֫ۨܺ;

.field public static final enum ᩶:Ll/֫ۨܺ;

.field public static final synthetic ᩸:[Ll/֫ۨܺ;

.field public static final enum ᩹:Ll/֫ۨܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 51
    new-instance v0, Ll/ۛۛܺ;

    const-string v1, "ANY_PRESENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ۛۛܺ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/֫ۨܺ;->᩹:Ll/֫ۨܺ;

    .line 62
    new-instance v0, Ll/ۨۛܺ;

    const-string v1, "LAST_PRESENT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/ۨۛܺ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/֫ۨܺ;->۬:Ll/֫ۨܺ;

    .line 87
    new-instance v0, Ll/᩺ۛܺ;

    const-string v1, "FIRST_PRESENT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ll/᩺ۛܺ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/֫ۨܺ;->ۙ:Ll/֫ۨܺ;

    .line 116
    new-instance v0, Ll/ܰۛܺ;

    const-string v1, "FIRST_AFTER"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ll/ܰۛܺ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/֫ۨܺ;->᩶:Ll/֫ۨܺ;

    .line 130
    new-instance v0, Ll/۟ۛܺ;

    const-string v1, "LAST_BEFORE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ll/۟ۛܺ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/֫ۨܺ;->ۗ:Ll/֫ۨܺ;

    .line 46
    invoke-static {}, Ll/֫ۨܺ;->֫()[Ll/֫ۨܺ;

    move-result-object v0

    sput-object v0, Ll/֫ۨܺ;->᩸:[Ll/֫ۨܺ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILl/ۙۛܺ;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Ll/֫ۨܺ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/֫ۨܺ;
    .locals 1

    .line 46
    const-class v0, Ll/֫ۨܺ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/֫ۨܺ;

    return-object p0
.end method

.method public static values()[Ll/֫ۨܺ;
    .locals 1

    .line 46
    sget-object v0, Ll/֫ۨܺ;->᩸:[Ll/֫ۨܺ;

    invoke-virtual {v0}, [Ll/֫ۨܺ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/֫ۨܺ;

    return-object v0
.end method

.method public static synthetic ֫()[Ll/֫ۨܺ;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ll/֫ۨܺ;

    .line 46
    sget-object v1, Ll/֫ۨܺ;->᩹:Ll/֫ۨܺ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/֫ۨܺ;->۬:Ll/֫ۨܺ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/֫ۨܺ;->ۙ:Ll/֫ۨܺ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/֫ۨܺ;->᩶:Ll/֫ۨܺ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ll/֫ۨܺ;->ۗ:Ll/֫ۨܺ;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public abstract ֫(Ljava/util/Comparator;Ljava/lang/Object;Ljava/util/List;I)I
.end method
