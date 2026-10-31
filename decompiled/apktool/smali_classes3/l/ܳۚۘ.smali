.class public final enum Ll/ܳۚۘ;
.super Ljava/lang/Enum;
.source "T89U"


# static fields
.field public static final enum ۛ:Ll/ܳۚۘ;

.field public static final enum ۤ:Ll/ܳۚۘ;

.field public static final enum ۨ:Ll/ܳۚۘ;

.field public static final enum ۫:Ll/ܳۚۘ;

.field public static final synthetic ۬:[Ll/ܳۚۘ;

.field public static final enum ܰ:Ll/ܳۚۘ;

.field public static final enum ᩺:Ll/ܳۚۘ;


# instance fields
.field public final ۗ:[B

.field public final ۙ:Ljava/lang/String;

.field public final ᩶:Ljava/lang/String;

.field public final ᩸:S

.field public final ᩹:S


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 22
    new-instance v0, Ll/ܳۚۘ;

    const-string v1, "winreg interface"

    const-string v2, "338cd001-2244-31f1-aaaa-900038001003:v1.0"

    const-string v3, "WINREG_V1_0"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Ll/ܳۚۘ;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ll/ܳۚۘ;->ܰ:Ll/ܳۚۘ;

    .line 23
    new-instance v0, Ll/ܳۚۘ;

    const-string v1, "srvsvc interface"

    const-string v2, "4b324fc8-1670-01d3-1278-5a47bf6ee188:v3.0"

    const-string v3, "SRVSVC_V3_0"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Ll/ܳۚۘ;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ll/ܳۚۘ;->ۨ:Ll/ܳۚۘ;

    .line 24
    new-instance v0, Ll/ܳۚۘ;

    const-string v1, "lsarpc interface"

    const-string v2, "12345778-1234-ABCD-EF00-0123456789AB:v0.0"

    const-string v3, "LSASVC_V0_0"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Ll/ܳۚۘ;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ll/ܳۚۘ;->۫:Ll/ܳۚۘ;

    .line 25
    new-instance v0, Ll/ܳۚۘ;

    const-string v1, "samr interface"

    const-string v2, "12345778-1234-ABCD-EF00-0123456789AC:v1.0"

    const-string v3, "SAMSVC_V1_0"

    const/4 v4, 0x3

    invoke-direct {v0, v3, v4, v1, v2}, Ll/ܳۚۘ;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ll/ܳۚۘ;->ۛ:Ll/ܳۚۘ;

    .line 26
    new-instance v0, Ll/ܳۚۘ;

    const-string v1, "svcctl_interface"

    const-string v2, "367abb81-9844-35f1-ad32-98f038001003:v2.0"

    const-string v3, "SVCCTL_V2_0"

    const/4 v4, 0x4

    invoke-direct {v0, v3, v4, v1, v2}, Ll/ܳۚۘ;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ll/ܳۚۘ;->᩺:Ll/ܳۚۘ;

    .line 27
    new-instance v0, Ll/ܳۚۘ;

    const-string v1, "NDR transfer syntax identifier"

    const-string v2, "8a885d04-1ceb-11c9-9fe8-08002b104860:v2.0"

    const-string v3, "NDR_32BIT_V2"

    const/4 v4, 0x5

    invoke-direct {v0, v3, v4, v1, v2}, Ll/ܳۚۘ;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ll/ܳۚۘ;->ۤ:Ll/ܳۚۘ;

    .line 21
    invoke-static {}, Ll/ܳۚۘ;->᩷()[Ll/ܳۚۘ;

    move-result-object v0

    sput-object v0, Ll/ܳۚۘ;->۬:[Ll/ܳۚۘ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 11

    .line 35
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    const/16 p1, 0x10

    new-array p2, p1, [B

    .line 31
    iput-object p2, p0, Ll/ܳۚۘ;->ۗ:[B

    .line 36
    iput-object p3, p0, Ll/ܳۚۘ;->᩶:Ljava/lang/String;

    .line 38
    iput-object p4, p0, Ll/ܳۚۘ;->ۙ:Ljava/lang/String;

    const-string p2, ":"

    const/4 p3, 0x2

    .line 40
    invoke-virtual {p4, p2, p3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p2

    const/4 p4, 0x0

    .line 41
    aget-object v0, p2, p4

    const-string v1, "-"

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    .line 42
    aget-object p4, v0, p4

    const/4 v1, 0x1

    aget-object v2, v0, v1

    aget-object v3, v0, p3

    filled-new-array {p4, v2, v3}, [Ljava/lang/String;

    move-result-object p4

    const/4 v2, 0x3

    .line 43
    aget-object v3, v0, v2

    const/4 v4, 0x4

    aget-object v0, v0, v4

    filled-new-array {v3, v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x4

    :goto_0
    if-ge v3, v2, :cond_3

    .line 48
    aget-object v2, p4, v3

    .line 49
    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v6

    .line 50
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, p3

    :goto_1
    if-ltz v2, :cond_2

    move v7, v2

    :goto_2
    add-int/lit8 v8, v2, 0x2

    if-ge v7, v8, :cond_1

    .line 52
    aget-byte v8, v6, v7

    .line 53
    iget-object v9, p0, Ll/ܳۚۘ;->ۗ:[B

    aget-byte v10, v9, v4

    invoke-static {v8, p1}, Ljava/lang/Character;->digit(II)I

    move-result v8

    shl-int/2addr v8, v5

    int-to-byte v8, v8

    or-int/2addr v8, v10

    int-to-byte v8, v8

    aput-byte v8, v9, v4

    if-nez v5, :cond_0

    add-int/lit8 v4, v4, 0x1

    const/4 v5, 0x4

    goto :goto_3

    :cond_0
    const/4 v5, 0x0

    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, -0x2

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    const/4 v2, 0x3

    goto :goto_0

    :cond_3
    const/4 p4, 0x0

    const/4 v2, 0x0

    :goto_4
    if-ge v2, p3, :cond_6

    .line 64
    aget-object v3, v0, v2

    .line 65
    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    array-length v6, v3

    const/4 v7, 0x0

    :goto_5
    if-ge v7, v6, :cond_5

    aget-byte v8, v3, v7

    .line 66
    iget-object v9, p0, Ll/ܳۚۘ;->ۗ:[B

    aget-byte v10, v9, v4

    invoke-static {v8, p1}, Ljava/lang/Character;->digit(II)I

    move-result v8

    shl-int/2addr v8, v5

    int-to-byte v8, v8

    or-int/2addr v8, v10

    int-to-byte v8, v8

    aput-byte v8, v9, v4

    if-nez v5, :cond_4

    add-int/lit8 v4, v4, 0x1

    const/4 v5, 0x4

    goto :goto_6

    :cond_4
    const/4 v5, 0x0

    :goto_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 76
    :cond_6
    aget-object p1, p2, v1

    const-string p2, "\\."

    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p1

    .line 77
    aget-object p2, p1, p4

    invoke-virtual {p2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Short;->valueOf(Ljava/lang/String;)Ljava/lang/Short;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Short;->shortValue()S

    move-result p2

    iput-short p2, p0, Ll/ܳۚۘ;->᩸:S

    .line 78
    aget-object p1, p1, v1

    invoke-static {p1}, Ljava/lang/Short;->valueOf(Ljava/lang/String;)Ljava/lang/Short;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Short;->shortValue()S

    move-result p1

    iput-short p1, p0, Ll/ܳۚۘ;->᩹:S

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ܳۚۘ;
    .locals 1

    .line 21
    const-class v0, Ll/ܳۚۘ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ܳۚۘ;

    return-object p0
.end method

.method public static values()[Ll/ܳۚۘ;
    .locals 1

    .line 21
    sget-object v0, Ll/ܳۚۘ;->۬:[Ll/ܳۚۘ;

    invoke-virtual {v0}, [Ll/ܳۚۘ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܳۚۘ;

    return-object v0
.end method

.method public static synthetic ᩷()[Ll/ܳۚۘ;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Ll/ܳۚۘ;

    .line 21
    sget-object v1, Ll/ܳۚۘ;->ܰ:Ll/ܳۚۘ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ܳۚۘ;->ۨ:Ll/ܳۚۘ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ܳۚۘ;->۫:Ll/ܳۚۘ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/ܳۚۘ;->ۛ:Ll/ܳۚۘ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ll/ܳۚۘ;->᩺:Ll/ܳۚۘ;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Ll/ܳۚۘ;->ۤ:Ll/ܳۚۘ;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Ll/ܳۚۘ;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public ֫()S
    .locals 1

    .line 94
    iget-short v0, p0, Ll/ܳۚۘ;->᩸:S

    return v0
.end method

.method public ۧ()S
    .locals 1

    .line 98
    iget-short v0, p0, Ll/ܳۚۘ;->᩹:S

    return v0
.end method

.method public ܿ()Ljava/lang/String;
    .locals 1

    .line 86
    iget-object v0, p0, Ll/ܳۚۘ;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public ᩻()[B
    .locals 1

    .line 90
    iget-object v0, p0, Ll/ܳۚۘ;->ۗ:[B

    return-object v0
.end method
