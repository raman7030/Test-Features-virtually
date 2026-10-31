.class public final enum Ll/ۖ֨ۘ;
.super Ljava/lang/Enum;
.source "Y89J"


# static fields
.field public static final enum ۗ:Ll/ۖ֨ۘ;

.field public static final synthetic ۙ:[Ll/ۖ֨ۘ;

.field public static final ۛ:I = 0xbb8

.field public static final enum ۤ:Ll/ۖ֨ۘ;

.field public static final ۨ:I = 0x1

.field public static final enum ۫:Ll/ۖ֨ۘ;

.field public static final enum ۬:Ll/ۖ֨ۘ;

.field public static final enum ܰ:Ll/ۖ֨ۘ;

.field public static final enum ᩺:Ll/ۖ֨ۘ;


# instance fields
.field public final ᩶:Ll/ܳۚۘ;

.field public final ᩸:Ll/ܳۚۘ;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    .line 36
    new-instance v6, Ll/ۖ֨ۘ;

    sget-object v4, Ll/ܳۚۘ;->ܰ:Ll/ܳۚۘ;

    sget-object v13, Ll/ܳۚۘ;->ۤ:Ll/ܳۚۘ;

    const-string v1, "WINREG"

    const/4 v2, 0x0

    const-string v3, "winreg"

    move-object v0, v6

    move-object v5, v13

    invoke-direct/range {v0 .. v5}, Ll/ۖ֨ۘ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ܳۚۘ;Ll/ܳۚۘ;)V

    sput-object v6, Ll/ۖ֨ۘ;->ܰ:Ll/ۖ֨ۘ;

    .line 37
    new-instance v0, Ll/ۖ֨ۘ;

    sget-object v1, Ll/ܳۚۘ;->ۨ:Ll/ܳۚۘ;

    const-string v8, "SRVSVC"

    const/4 v9, 0x1

    const-string v10, "srvsvc"

    move-object v7, v0

    move-object v11, v1

    move-object v12, v13

    invoke-direct/range {v7 .. v12}, Ll/ۖ֨ۘ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ܳۚۘ;Ll/ܳۚۘ;)V

    sput-object v0, Ll/ۖ֨ۘ;->ۤ:Ll/ۖ֨ۘ;

    .line 38
    new-instance v0, Ll/ۖ֨ۘ;

    const-string v10, "lsarpc"

    sget-object v11, Ll/ܳۚۘ;->۫:Ll/ܳۚۘ;

    const-string v8, "LSASVC"

    const/4 v9, 0x2

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Ll/ۖ֨ۘ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ܳۚۘ;Ll/ܳۚۘ;)V

    sput-object v0, Ll/ۖ֨ۘ;->۬:Ll/ۖ֨ۘ;

    .line 39
    new-instance v0, Ll/ۖ֨ۘ;

    const-string v10, "samr"

    sget-object v11, Ll/ܳۚۘ;->ۛ:Ll/ܳۚۘ;

    const-string v8, "SAMSVC"

    const/4 v9, 0x3

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Ll/ۖ֨ۘ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ܳۚۘ;Ll/ܳۚۘ;)V

    sput-object v0, Ll/ۖ֨ۘ;->۫:Ll/ۖ֨ۘ;

    .line 40
    new-instance v0, Ll/ۖ֨ۘ;

    const/4 v9, 0x4

    const-string v10, "browser"

    const-string v8, "BROWSER_SRVSVC"

    move-object v7, v0

    move-object v11, v1

    invoke-direct/range {v7 .. v12}, Ll/ۖ֨ۘ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ܳۚۘ;Ll/ܳۚۘ;)V

    sput-object v0, Ll/ۖ֨ۘ;->ۗ:Ll/ۖ֨ۘ;

    .line 41
    new-instance v0, Ll/ۖ֨ۘ;

    const-string v10, "svcctl"

    sget-object v11, Ll/ܳۚۘ;->᩺:Ll/ܳۚۘ;

    const-string v8, "SVCCTL"

    const/4 v9, 0x5

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Ll/ۖ֨ۘ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ܳۚۘ;Ll/ܳۚۘ;)V

    sput-object v0, Ll/ۖ֨ۘ;->᩺:Ll/ۖ֨ۘ;

    .line 35
    invoke-static {}, Ll/ۖ֨ۘ;->֫()[Ll/ۖ֨ۘ;

    move-result-object v0

    sput-object v0, Ll/ۖ֨ۘ;->ۙ:[Ll/ۖ֨ۘ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ll/ܳۚۘ;Ll/ܳۚۘ;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 50
    iput-object p3, p0, Ll/ۖ֨ۘ;->᩹:Ljava/lang/String;

    .line 51
    iput-object p4, p0, Ll/ۖ֨ۘ;->᩸:Ll/ܳۚۘ;

    .line 52
    iput-object p5, p0, Ll/ۖ֨ۘ;->᩶:Ll/ܳۚۘ;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۖ֨ۘ;
    .locals 1

    .line 35
    const-class v0, Ll/ۖ֨ۘ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۖ֨ۘ;

    return-object p0
.end method

.method public static values()[Ll/ۖ֨ۘ;
    .locals 1

    .line 35
    sget-object v0, Ll/ۖ֨ۘ;->ۙ:[Ll/ۖ֨ۘ;

    invoke-virtual {v0}, [Ll/ۖ֨ۘ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۖ֨ۘ;

    return-object v0
.end method

.method private ֫(Ll/ܶܽۘ;Ll/ᩳᩳۘ;)Ll/ۚ֨ۘ;
    .locals 5

    .line 72
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    const/4 v1, -0x1

    :goto_0
    const/4 v2, 0x1

    if-ge v1, v2, :cond_1

    .line 75
    :try_start_0
    invoke-direct {p0, p1, p2}, Ll/ۖ֨ۘ;->ۧ(Ll/ܶܽۘ;Ll/ᩳᩳۘ;)Ll/ۚ֨ۘ;

    move-result-object p1
    :try_end_0
    .catch Ll/ᩴ֨ۘ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v3

    .line 77
    invoke-virtual {v0, v3}, Ljava/util/LinkedList;->offer(Ljava/lang/Object;)Z

    .line 78
    sget-object v4, Ll/ܺ֨ۘ;->֫:[I

    invoke-virtual {v3}, Ll/ᩴ֨ۘ;->֫()Ll/۟۫ۖ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    if-ne v3, v2, :cond_0

    const-wide/16 v2, 0xbb8

    .line 82
    :try_start_1
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 84
    new-instance p2, Ljava/io/InterruptedIOException;

    invoke-direct {p2}, Ljava/io/InterruptedIOException;-><init>()V

    .line 85
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 86
    throw p2

    .line 90
    :cond_0
    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩴ֨ۘ;

    throw p1

    .line 94
    :cond_1
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    .line 95
    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩴ֨ۘ;

    throw p1

    .line 96
    :cond_2
    new-instance p1, Ll/۟֫ۘ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unknown error when opening pipe: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ll/ۖᩳۘ;->ܳ()Ll/ܽۧۘ;

    move-result-object p2

    .line 87
    invoke-virtual {p2}, Ll/ܽۧۘ;->ᩳ()Ljava/lang/String;

    move-result-object p2

    .line 96
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 36
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 96
    throw p1
.end method

.method public static synthetic ֫()[Ll/ۖ֨ۘ;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Ll/ۖ֨ۘ;

    .line 35
    sget-object v1, Ll/ۖ֨ۘ;->ܰ:Ll/ۖ֨ۘ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۖ֨ۘ;->ۤ:Ll/ۖ֨ۘ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ۖ֨ۘ;->۬:Ll/ۖ֨ۘ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/ۖ֨ۘ;->۫:Ll/ۖ֨ۘ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ll/ۖ֨ۘ;->ۗ:Ll/ۖ֨ۘ;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Ll/ۖ֨ۘ;->᩺:Ll/ۖ֨ۘ;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method private ۧ(Ll/ܶܽۘ;Ll/ᩳᩳۘ;)Ll/ۚ֨ۘ;
    .locals 2

    .line 100
    new-instance v0, Ll/ۚ֨ۘ;

    iget-object v1, p0, Ll/ۖ֨ۘ;->᩹:Ljava/lang/String;

    invoke-direct {v0, p1, p2, v1}, Ll/ۚ֨ۘ;-><init>(Ll/ܶܽۘ;Ll/ᩳᩳۘ;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public ֫(Ll/ܶܽۘ;)Ll/ۢ֨ۘ;
    .locals 2

    const-string v0, "IPC$"

    .line 56
    invoke-virtual {p1, v0}, Ll/ܶܽۘ;->֫(Ljava/lang/String;)Ll/ۖᩳۘ;

    move-result-object v0

    .line 57
    instance-of v1, v0, Ll/ᩳᩳۘ;

    if-eqz v1, :cond_0

    .line 58
    check-cast v0, Ll/ᩳᩳۘ;

    .line 59
    invoke-direct {p0, p1, v0}, Ll/ۖ֨ۘ;->֫(Ll/ܶܽۘ;Ll/ᩳᩳۘ;)Ll/ۚ֨ۘ;

    move-result-object p1

    .line 60
    new-instance v0, Ll/ۡ֨ۘ;

    invoke-direct {v0, p1}, Ll/ۡ֨ۘ;-><init>(Ll/ۚ֨ۘ;)V

    .line 62
    iget-object p1, p0, Ll/ۖ֨ۘ;->᩸:Ll/ܳۚۘ;

    iget-object v1, p0, Ll/ۖ֨ۘ;->᩶:Ll/ܳۚۘ;

    invoke-virtual {v0, p1, v1}, Ll/ۢ֨ۘ;->֫(Ll/ܳۚۘ;Ll/ܳۚۘ;)V

    return-object v0

    .line 67
    :cond_0
    new-instance p1, Ll/ۖ۟ۖ;

    iget-object v0, p0, Ll/ۖ֨ۘ;->᩹:Ljava/lang/String;

    const-string v1, " not a named pipe."

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 39
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 67
    throw p1
.end method
