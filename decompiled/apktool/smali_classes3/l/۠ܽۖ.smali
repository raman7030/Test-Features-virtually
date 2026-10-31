.class public abstract enum Ll/۠ܽۖ;
.super Ljava/lang/Enum;
.source "Q87L"

# interfaces
.implements Ll/ܶܽۖ;


# static fields
.field public static final enum ۗ:Ll/۠ܽۖ;

.field public static final enum ۙ:Ll/۠ܽۖ;

.field public static final enum ۤ:Ll/۠ܽۖ;

.field public static final enum ۫:Ll/۠ܽۖ;

.field public static final enum ۬:Ll/۠ܽۖ;

.field public static final enum ᩶:Ll/۠ܽۖ;

.field public static final synthetic ᩸:[Ll/۠ܽۖ;

.field public static final enum ᩹:Ll/۠ܽۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 34
    new-instance v0, Ll/ۖܽۖ;

    const-string v1, "IDENTITY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ۖܽۖ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/۠ܽۖ;->᩹:Ll/۠ܽۖ;

    .line 52
    new-instance v0, Ll/ۘܽۖ;

    const-string v1, "UPPER_CAMEL_CASE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/ۘܽۖ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/۠ܽۖ;->۬:Ll/۠ܽۖ;

    .line 72
    new-instance v0, Ll/ᩴܽۖ;

    const-string v1, "UPPER_CAMEL_CASE_WITH_SPACES"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ll/ᩴܽۖ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/۠ܽۖ;->۫:Ll/۠ܽۖ;

    .line 94
    new-instance v0, Ll/᩵ܽۖ;

    const-string v1, "UPPER_CASE_WITH_UNDERSCORES"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ll/᩵ܽۖ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/۠ܽۖ;->ۤ:Ll/۠ܽۖ;

    .line 114
    new-instance v0, Ll/֡ܽۖ;

    const-string v1, "LOWER_CASE_WITH_UNDERSCORES"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ll/֡ܽۖ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/۠ܽۖ;->ۗ:Ll/۠ܽۖ;

    .line 141
    new-instance v0, Ll/ۚܽۖ;

    const-string v1, "LOWER_CASE_WITH_DASHES"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ll/ۚܽۖ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/۠ܽۖ;->᩶:Ll/۠ܽۖ;

    .line 168
    new-instance v0, Ll/֨ܽۖ;

    const-string v1, "LOWER_CASE_WITH_DOTS"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Ll/֨ܽۖ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/۠ܽۖ;->ۙ:Ll/۠ܽۖ;

    .line 31
    invoke-static {}, Ll/۠ܽۖ;->֫()[Ll/۠ܽۖ;

    move-result-object v0

    sput-object v0, Ll/۠ܽۖ;->᩸:[Ll/۠ܽۖ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILl/ۖܽۖ;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Ll/۠ܽۖ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/۠ܽۖ;
    .locals 1

    .line 31
    const-class v0, Ll/۠ܽۖ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/۠ܽۖ;

    return-object p0
.end method

.method public static values()[Ll/۠ܽۖ;
    .locals 1

    .line 31
    sget-object v0, Ll/۠ܽۖ;->᩸:[Ll/۠ܽۖ;

    invoke-virtual {v0}, [Ll/۠ܽۖ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/۠ܽۖ;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 193
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 195
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 196
    invoke-static {v3}, Ljava/lang/Character;->isLetter(C)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 197
    invoke-static {v3}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 201
    :cond_0
    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v0

    const/4 v3, 0x1

    if-nez v2, :cond_1

    .line 204
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 0
    invoke-static {v3, p0, v1}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 206
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/2addr v2, v3

    .line 0
    invoke-static {v2, p0, v4}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-object p0
.end method

.method public static ֫(Ljava/lang/String;C)Ljava/lang/String;
    .locals 5

    .line 180
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 182
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 183
    invoke-static {v3}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-eqz v4, :cond_0

    .line 184
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 186
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 188
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫()[Ll/۠ܽۖ;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Ll/۠ܽۖ;

    .line 31
    sget-object v1, Ll/۠ܽۖ;->᩹:Ll/۠ܽۖ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/۠ܽۖ;->۬:Ll/۠ܽۖ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/۠ܽۖ;->۫:Ll/۠ܽۖ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/۠ܽۖ;->ۤ:Ll/۠ܽۖ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ll/۠ܽۖ;->ۗ:Ll/۠ܽۖ;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Ll/۠ܽۖ;->᩶:Ll/۠ܽۖ;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Ll/۠ܽۖ;->ۙ:Ll/۠ܽۖ;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ֫(Ljava/lang/reflect/Field;)Ljava/util/List;
    .locals 0

    .line 53
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public abstract synthetic ۧ(Ljava/lang/reflect/Field;)Ljava/lang/String;
.end method
