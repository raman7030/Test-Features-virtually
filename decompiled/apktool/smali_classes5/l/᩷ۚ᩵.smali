.class public final Ll/᩷ۚ᩵;
.super Ljava/lang/Object;
.source "R9WG"

# interfaces
.implements Ll/ۚۡ᩵;


# static fields
.field public static final ۫:Ll/֫᩻֨;


# instance fields
.field public final ۗ:Ll/ۘ֨᩵;

.field public ۙ:I

.field public final ۬:Z

.field public final ᩶:Ll/۟ۘ᩵;

.field public ᩸:Ll/ܳۚ᩵;

.field public final ᩹:Ll/᩺ۘ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 40
    const-class v0, Ll/᩷ۚ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/᩷ۚ᩵;->۫:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/۬ۚ᩵;Ll/ۘ֨᩵;)V
    .locals 4

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 607
    iget-object p1, p1, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    .line 65
    invoke-virtual {p1}, Ll/ᩳ֨᩵;->ۜ()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Ll/᩷ۚ᩵;->۬:Z

    .line 66
    invoke-virtual {p1}, Ll/ᩳ֨᩵;->ۢ()Ljava/net/URL;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 67
    new-instance p1, Ll/᩺ۘ᩵;

    invoke-virtual {p2}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v0

    invoke-virtual {p2}, Ll/ۘ֨᩵;->ۜ()Ljava/lang/String;

    move-result-object v1

    const/high16 v3, -0x80000000

    invoke-direct {p1, v0, v1, v3}, Ll/᩺ۘ᩵;-><init>(Ll/֨ۡ᩵;Ljava/lang/String;I)V

    iput-object p1, p0, Ll/᩷ۚ᩵;->᩹:Ll/᩺ۘ᩵;

    .line 68
    new-instance p1, Ll/۟ۘ᩵;

    invoke-virtual {p2}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/۟ۘ᩵;-><init>(Ll/֨ۡ᩵;)V

    iput-object p1, p0, Ll/᩷ۚ᩵;->᩶:Ll/۟ۘ᩵;

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_3

    .line 70
    new-instance v0, Ll/᩺ۘ᩵;

    invoke-virtual {p2}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-virtual {p1}, Ll/ᩳ֨᩵;->ۢ()Ljava/net/URL;

    move-result-object p1

    invoke-virtual {p1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object p1

    const/4 v3, -0x1

    invoke-direct {v0, v1, p1, v3}, Ll/᩺ۘ᩵;-><init>(Ll/֨ۡ᩵;Ljava/lang/String;I)V

    iput-object v0, p0, Ll/᩷ۚ᩵;->᩹:Ll/᩺ۘ᩵;

    .line 71
    new-instance p1, Ll/۟ۘ᩵;

    invoke-virtual {p2}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/۟ۘ᩵;-><init>(Ll/֨ۡ᩵;)V

    iput-object p1, p0, Ll/᩷ۚ᩵;->᩶:Ll/۟ۘ᩵;

    .line 76
    :goto_1
    invoke-virtual {p2}, Ll/ۘ֨᩵;->֫()V

    iput-object p2, p0, Ll/᩷ۚ᩵;->ۗ:Ll/ۘ֨᩵;

    .line 88
    :try_start_0
    iget-object p1, p0, Ll/᩷ۚ᩵;->᩹:Ll/᩺ۘ᩵;

    iget-object v0, p0, Ll/᩷ۚ᩵;->᩶:Ll/۟ۘ᩵;

    new-array v1, v2, [Ll/֡ۚ᩵;

    invoke-virtual {p2, p1, v0, v1}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    .line 89
    invoke-direct {p0}, Ll/᩷ۚ᩵;->ܽ()V

    .line 90
    invoke-direct {p0}, Ll/᩷ۚ᩵;->֫()Ll/ܳۚ᩵;

    move-result-object p1

    if-nez p1, :cond_2

    .line 203
    invoke-virtual {p2}, Ll/ۘ֨᩵;->᩹()V

    const/4 p2, 0x0

    .line 204
    iput-object p2, p0, Ll/᩷ۚ᩵;->᩸:Ll/ܳۚ᩵;

    .line 78
    :cond_2
    iput-object p1, p0, Ll/᩷ۚ᩵;->᩸:Ll/ܳۚ᩵;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 80
    iget-object p2, p0, Ll/᩷ۚ᩵;->ۗ:Ll/ۘ֨᩵;

    invoke-virtual {p2}, Ll/ۘ֨᩵;->᩹()V

    .line 81
    throw p1

    .line 73
    :cond_3
    new-instance p2, Ll/ۗۚ᩵;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "The requested list operations is invalid: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ᩳ֨᩵;->ۢ()Ljava/net/URL;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private ֫()Ll/ܳۚ᩵;
    .locals 5

    .line 113
    iget-object v0, p0, Ll/᩷ۚ᩵;->᩶:Ll/۟ۘ᩵;

    invoke-virtual {v0}, Ll/ܿᩴ᩵;->ۘ֫()I

    move-result v1

    const/16 v2, 0xea

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Ll/ܿᩴ᩵;->ܺ֫()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ll/ܿᩴ᩵;->ܺ֫()I

    move-result v1

    .line 114
    :goto_0
    iget v3, p0, Ll/᩷ۚ᩵;->ۙ:I

    if-ge v3, v1, :cond_1

    .line 115
    invoke-virtual {v0}, Ll/ܿᩴ᩵;->ۖ֫()[Ll/ܳۚ᩵;

    move-result-object v0

    iget v1, p0, Ll/᩷ۚ᩵;->ۙ:I

    aget-object v0, v0, v1

    add-int/lit8 v1, v1, 0x1

    .line 116
    iput v1, p0, Ll/᩷ۚ᩵;->ۙ:I

    .line 136
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0

    .line 122
    :cond_1
    iget-boolean v1, p0, Ll/᩷ۚ᩵;->۬:Z

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ll/ܿᩴ᩵;->ۘ֫()I

    move-result v1

    if-ne v1, v2, :cond_2

    .line 123
    invoke-virtual {v0}, Ll/۟ۘ᩵;->֡֫()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/᩷ۚ᩵;->᩹:Ll/᩺ۘ᩵;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v1}, Ll/᩺ۘ᩵;->ۧ(ILjava/lang/String;)V

    .line 124
    invoke-virtual {v0}, Ll/ܿᩴ᩵;->reset()V

    const/16 v1, -0x29

    .line 125
    invoke-virtual {v2, v1}, Ll/ᩳᩴ᩵;->ۧ(B)V

    .line 126
    iget-object v1, p0, Ll/᩷ۚ᩵;->ۗ:Ll/ۘ֨᩵;

    new-array v4, v3, [Ll/֡ۚ᩵;

    invoke-virtual {v1, v2, v0, v4}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    .line 127
    invoke-direct {p0}, Ll/᩷ۚ᩵;->ܽ()V

    .line 128
    iput v3, p0, Ll/᩷ۚ᩵;->ۙ:I

    .line 129
    invoke-direct {p0}, Ll/᩷ۚ᩵;->֫()Ll/ܳۚ᩵;

    move-result-object v0

    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method private ܽ()V
    .locals 3

    .line 102
    iget-object v0, p0, Ll/᩷ۚ᩵;->᩶:Ll/۟ۘ᩵;

    invoke-virtual {v0}, Ll/ܿᩴ᩵;->ۘ֫()I

    move-result v0

    const/16 v1, 0x888

    if-eq v0, v1, :cond_2

    if-eqz v0, :cond_1

    const/16 v1, 0xea

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 107
    :cond_0
    new-instance v1, Ll/ۗۚ᩵;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Ll/ۗۚ᩵;-><init>(IZ)V

    throw v1

    :cond_1
    :goto_0
    return-void

    .line 104
    :cond_2
    new-instance v0, Ll/֡֨᩵;

    invoke-direct {v0}, Ll/֡֨᩵;-><init>()V

    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 193
    iget-object v0, p0, Ll/᩷ۚ᩵;->᩸:Ll/ܳۚ᩵;

    if-eqz v0, :cond_0

    .line 203
    iget-object v0, p0, Ll/᩷ۚ᩵;->ۗ:Ll/ۘ֨᩵;

    invoke-virtual {v0}, Ll/ۘ֨᩵;->᩹()V

    const/4 v0, 0x0

    .line 204
    iput-object v0, p0, Ll/᩷ۚ᩵;->᩸:Ll/ܳۚ᩵;

    :cond_0
    return-void
.end method

.method public final hasNext()Z
    .locals 1

    .line 159
    iget-object v0, p0, Ll/᩷ۚ᩵;->᩸:Ll/ܳۚ᩵;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 5

    .line 170
    iget-object v0, p0, Ll/᩷ۚ᩵;->᩸:Ll/ܳۚ᩵;

    const/4 v1, 0x0

    .line 172
    :try_start_0
    invoke-direct {p0}, Ll/᩷ۚ᩵;->֫()Ll/ܳۚ᩵;

    move-result-object v2

    if-nez v2, :cond_0

    .line 203
    iget-object v2, p0, Ll/᩷ۚ᩵;->ۗ:Ll/ۘ֨᩵;

    invoke-virtual {v2}, Ll/ۘ֨᩵;->᩹()V

    .line 204
    iput-object v1, p0, Ll/᩷ۚ᩵;->᩸:Ll/ܳۚ᩵;

    return-object v0

    .line 177
    :cond_0
    iput-object v2, p0, Ll/᩷ۚ᩵;->᩸:Ll/ܳۚ᩵;
    :try_end_0
    .catch Ll/᩵ۡ᩵; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v2

    .line 179
    sget-object v3, Ll/᩷ۚ᩵;->۫:Ll/֫᩻֨;

    const-string v4, "Enumeration failed"

    invoke-interface {v3, v4, v2}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 180
    iput-object v1, p0, Ll/᩷ۚ᩵;->᩸:Ll/ܳۚ᩵;

    return-object v0
.end method

.method public final remove()V
    .locals 2

    .line 210
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "remove"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
