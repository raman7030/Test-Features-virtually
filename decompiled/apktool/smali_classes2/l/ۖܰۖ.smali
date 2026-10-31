.class public final enum Ll/ۖܰۖ;
.super Ljava/lang/Enum;
.source "S9I7"

# interfaces
.implements Ll/᩸ܰۖ;


# static fields
.field public static final enum ᩶:Ll/ۖܰۖ;

.field public static final synthetic ᩹:[Ll/ۖܰۖ;


# instance fields
.field public ᩸:J


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 63
    new-instance v0, Ll/ۖܰۖ;

    const/4 v1, 0x0

    const/16 v2, 0xf

    const-string v3, "NTLMSSP_REVISION_W2K3"

    invoke-direct {v0, v3, v1, v2}, Ll/ۖܰۖ;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/ۖܰۖ;->᩶:Ll/ۖܰۖ;

    .line 62
    invoke-static {}, Ll/ۖܰۖ;->֫()[Ll/ۖܰۖ;

    move-result-object v0

    sput-object v0, Ll/ۖܰۖ;->᩹:[Ll/ۖܰۖ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 67
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    int-to-long p1, p3

    .line 68
    iput-wide p1, p0, Ll/ۖܰۖ;->᩸:J

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۖܰۖ;
    .locals 1

    .line 62
    const-class v0, Ll/ۖܰۖ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۖܰۖ;

    return-object p0
.end method

.method public static values()[Ll/ۖܰۖ;
    .locals 1

    .line 62
    sget-object v0, Ll/ۖܰۖ;->᩹:[Ll/ۖܰۖ;

    invoke-virtual {v0}, [Ll/ۖܰۖ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۖܰۖ;

    return-object v0
.end method

.method public static synthetic ֫()[Ll/ۖܰۖ;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ll/ۖܰۖ;

    .line 62
    sget-object v1, Ll/ۖܰۖ;->᩶:Ll/ۖܰۖ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public getValue()J
    .locals 2

    .line 73
    iget-wide v0, p0, Ll/ۖܰۖ;->᩸:J

    return-wide v0
.end method
