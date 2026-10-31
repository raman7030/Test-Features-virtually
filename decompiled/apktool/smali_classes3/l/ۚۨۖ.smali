.class public final enum Ll/ۚۨۖ;
.super Ljava/lang/Enum;
.source "09J5"

# interfaces
.implements Ll/᩸ܰۖ;


# static fields
.field public static final enum ۙ:Ll/ۚۨۖ;

.field public static final synthetic ᩶:[Ll/ۚۨۖ;


# instance fields
.field public ᩸:Ljava/lang/String;

.field public ᩹:J


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 26
    new-instance v6, Ll/ۚۨۖ;

    const-wide/16 v3, 0x1

    const-string v5, "SHA-512"

    const-string v1, "SHA_512"

    const/4 v2, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ۚۨۖ;-><init>(Ljava/lang/String;IJLjava/lang/String;)V

    sput-object v6, Ll/ۚۨۖ;->ۙ:Ll/ۚۨۖ;

    .line 25
    invoke-static {}, Ll/ۚۨۖ;->ۧ()[Ll/ۚۨۖ;

    move-result-object v0

    sput-object v0, Ll/ۚۨۖ;->᩶:[Ll/ۚۨۖ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJLjava/lang/String;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 32
    iput-wide p3, p0, Ll/ۚۨۖ;->᩹:J

    .line 33
    iput-object p5, p0, Ll/ۚۨۖ;->᩸:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۚۨۖ;
    .locals 1

    .line 25
    const-class v0, Ll/ۚۨۖ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۚۨۖ;

    return-object p0
.end method

.method public static values()[Ll/ۚۨۖ;
    .locals 1

    .line 25
    sget-object v0, Ll/ۚۨۖ;->᩶:[Ll/ۚۨۖ;

    invoke-virtual {v0}, [Ll/ۚۨۖ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۚۨۖ;

    return-object v0
.end method

.method public static synthetic ۧ()[Ll/ۚۨۖ;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ll/ۚۨۖ;

    .line 25
    sget-object v1, Ll/ۚۨۖ;->ۙ:Ll/ۚۨۖ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public getValue()J
    .locals 2

    .line 37
    iget-wide v0, p0, Ll/ۚۨۖ;->᩹:J

    return-wide v0
.end method

.method public ֫()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/ۚۨۖ;->᩸:Ljava/lang/String;

    return-object v0
.end method
