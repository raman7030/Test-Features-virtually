.class public abstract Ll/᩷֨ۘ;
.super Ljava/lang/Object;
.source "Z2OJ"


# instance fields
.field public final ֫:Ll/ۢ֨ۘ;


# direct methods
.method public constructor <init>(Ll/ۢ֨ۘ;)V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 43
    iput-object p1, p0, Ll/᩷֨ۘ;->֫:Ll/ۢ֨ۘ;

    return-void

    .line 42
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Expecting non-null transport"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final varargs ֫(Ll/ۤۚۘ;[Ll/᩹ۚۘ;)Ll/ۨۚۘ;
    .locals 5

    .line 47
    iget-object v0, p0, Ll/᩷֨ۘ;->֫:Ll/ۢ֨ۘ;

    invoke-virtual {v0, p1}, Ll/ۢ֨ۘ;->֫(Ll/ۤۚۘ;)Ll/ۨۚۘ;

    move-result-object p1

    .line 59
    invoke-virtual {p1}, Ll/ܶۚۘ;->֫()I

    move-result v0

    .line 60
    array-length v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p2, v3

    if-eqz v4, :cond_0

    .line 61
    invoke-virtual {v4, v0}, Ll/᩹ۚۘ;->֫(I)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object p1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 65
    :cond_1
    new-instance p1, Ll/ۢۚۘ;

    .line 49
    invoke-static {v0}, Ll/᩹ۚۘ;->ۧ(I)Ll/᩹ۚۘ;

    move-result-object p2

    if-nez p2, :cond_2

    const-string p2, ""

    goto :goto_1

    .line 50
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "("

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 51
    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "NetrShareEnum[1]"

    aput-object v4, v3, v2

    const/4 v2, 0x1

    aput-object v1, v3, v2

    const/4 v1, 0x2

    aput-object p2, v3, v1

    const-string p2, "%s returned error code: 0x%08X %s"

    invoke-static {p2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 31
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 33
    invoke-static {v0}, Ll/᩹ۚۘ;->ۧ(I)Ll/᩹ۚۘ;

    .line 65
    throw p1
.end method
