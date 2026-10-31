.class public final enum Ll/۫ۧۖ;
.super Ljava/lang/Enum;
.source "17QY"


# static fields
.field public static final enum ۗ:Ll/۫ۧۖ;

.field public static final enum ۙ:Ll/۫ۧۖ;

.field public static final enum ᩶:Ll/۫ۧۖ;

.field public static final synthetic ᩸:[Ll/۫ۧۖ;

.field public static final enum ᩹:Ll/۫ۧۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 162
    new-instance v0, Ll/۫ۧۖ;

    const-string v1, "UPPERCASE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/۫ۧۖ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/۫ۧۖ;->ۙ:Ll/۫ۧۖ;

    .line 163
    new-instance v0, Ll/۫ۧۖ;

    const-string v1, "LOWERCASE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/۫ۧۖ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/۫ۧۖ;->᩹:Ll/۫ۧۖ;

    .line 164
    new-instance v0, Ll/۫ۧۖ;

    const-string v1, "UPPER_CAMEL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ll/۫ۧۖ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/۫ۧۖ;->ۗ:Ll/۫ۧۖ;

    .line 165
    new-instance v0, Ll/۫ۧۖ;

    const-string v1, "LOWER_CAMEL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ll/۫ۧۖ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/۫ۧۖ;->᩶:Ll/۫ۧۖ;

    .line 161
    invoke-static {}, Ll/۫ۧۖ;->֫()[Ll/۫ۧۖ;

    move-result-object v0

    sput-object v0, Ll/۫ۧۖ;->᩸:[Ll/۫ۧۖ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 161
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/۫ۧۖ;
    .locals 1

    .line 161
    const-class v0, Ll/۫ۧۖ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/۫ۧۖ;

    return-object p0
.end method

.method public static values()[Ll/۫ۧۖ;
    .locals 1

    .line 161
    sget-object v0, Ll/۫ۧۖ;->᩸:[Ll/۫ۧۖ;

    invoke-virtual {v0}, [Ll/۫ۧۖ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/۫ۧۖ;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ll/۫ۧۖ;
    .locals 8

    .line 171
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    .line 176
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v1, v6, :cond_2

    .line 177
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v6

    .line 178
    invoke-static {v6}, Ljava/lang/Character;->isAlphabetic(I)Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_1

    :cond_0
    if-eqz v5, :cond_1

    .line 182
    invoke-static {v6}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v2

    const/4 v5, 0x0

    .line 185
    :cond_1
    invoke-static {v6}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v7

    or-int/2addr v3, v7

    .line 186
    invoke-static {v6}, Ljava/lang/Character;->isLowerCase(C)Z

    move-result v6

    or-int/2addr v4, v6

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_5

    if-nez v4, :cond_4

    .line 189
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    if-ne p0, v0, :cond_3

    goto :goto_2

    :cond_3
    sget-object p0, Ll/۫ۧۖ;->ۙ:Ll/۫ۧۖ;

    return-object p0

    :cond_4
    :goto_2
    sget-object p0, Ll/۫ۧۖ;->ۗ:Ll/۫ۧۖ;

    return-object p0

    :cond_5
    if-eqz v3, :cond_6

    .line 191
    sget-object p0, Ll/۫ۧۖ;->᩶:Ll/۫ۧۖ;

    return-object p0

    :cond_6
    sget-object p0, Ll/۫ۧۖ;->᩹:Ll/۫ۧۖ;

    return-object p0

    .line 100
    :cond_7
    new-instance p0, Ll/ܿ᩸ܺ;

    .line 30
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 100
    throw p0
.end method

.method public static synthetic ֫()[Ll/۫ۧۖ;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ll/۫ۧۖ;

    .line 161
    sget-object v1, Ll/۫ۧۖ;->ۙ:Ll/۫ۧۖ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/۫ۧۖ;->᩹:Ll/۫ۧۖ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/۫ۧۖ;->ۗ:Ll/۫ۧۖ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/۫ۧۖ;->᩶:Ll/۫ۧۖ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method
