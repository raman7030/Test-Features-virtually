.class public final enum Ll/۟᩺ܿ;
.super Ljava/lang/Enum;
.source "X4ZQ"

# interfaces
.implements Ll/ᩴܽܳ;


# static fields
.field public static final synthetic ᩸:[Ll/۟᩺ܿ;

.field public static final enum ᩹:Ll/۟᩺ܿ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1043
    new-instance v0, Ll/۟᩺ܿ;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/۟᩺ܿ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/۟᩺ܿ;->᩹:Ll/۟᩺ܿ;

    .line 1042
    invoke-static {}, Ll/۟᩺ܿ;->᩻()[Ll/۟᩺ܿ;

    move-result-object v0

    sput-object v0, Ll/۟᩺ܿ;->᩸:[Ll/۟᩺ܿ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1042
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/۟᩺ܿ;
    .locals 1

    .line 1042
    const-class v0, Ll/۟᩺ܿ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/۟᩺ܿ;

    return-object p0
.end method

.method public static values()[Ll/۟᩺ܿ;
    .locals 1

    .line 1042
    sget-object v0, Ll/۟᩺ܿ;->᩸:[Ll/۟᩺ܿ;

    invoke-virtual {v0}, [Ll/۟᩺ܿ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/۟᩺ܿ;

    return-object v0
.end method

.method public static synthetic ᩻()[Ll/۟᩺ܿ;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ll/۟᩺ܿ;

    .line 1042
    sget-object v1, Ll/۟᩺ܿ;->᩹:Ll/۟᩺ܿ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public bridge synthetic close()V
    .locals 0

    return-void
.end method

.method public length()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic ֫()Ll/֫ۧܳ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ֫(I[BII)V
    .locals 0

    if-nez p1, :cond_0

    if-nez p4, :cond_0

    return-void

    .line 1053
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Empty source"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic ۫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ᩺ۧ()Ll/ᩴܽܳ;
    .locals 0

    return-object p0
.end method
