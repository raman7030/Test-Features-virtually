.class public abstract Ll/֨᩺ۖ;
.super Ljava/lang/Object;
.source "89EN"


# instance fields
.field public ֫:Ll/۠᩺ۖ;


# direct methods
.method public constructor <init>(Ll/۠᩺ۖ;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Ll/֨᩺ۖ;->֫:Ll/۠᩺ۖ;

    return-void
.end method

.method public static ܿ(Ll/֡֫ۘ;)Ll/֨᩺ۖ;
    .locals 5

    .line 68
    invoke-virtual {p0}, Ll/ۤܰۖ;->᩻()I

    move-result v0

    int-to-long v1, v0

    .line 69
    const-class v3, Ll/۠᩺ۖ;

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Ll/ܶܰۖ;->֫(JLjava/lang/Class;Ll/۟۫ۖ;)Ll/᩸ܰۖ;

    move-result-object v1

    check-cast v1, Ll/۠᩺ۖ;

    .line 70
    sget-object v2, Ll/ۚ᩺ۖ;->֫:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_2

    const/4 v3, 0x3

    if-eq v2, v3, :cond_1

    const/4 v3, 0x4

    if-ne v2, v3, :cond_0

    .line 78
    new-instance v0, Ll/ܶ᩺ۖ;

    .line 29
    sget-object v1, Ll/۠᩺ۖ;->ۗ:Ll/۠᩺ۖ;

    invoke-direct {v0, v1}, Ll/֨᩺ۖ;-><init>(Ll/۠᩺ۖ;)V

    .line 78
    invoke-virtual {v0, p0}, Ll/֨᩺ۖ;->֫(Ll/֡֫ۘ;)V

    return-object v0

    .line 80
    :cond_0
    new-instance p0, Ll/ۧۧۘ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unknown SMB2NegotiateContextType encountered: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " / "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 38
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 80
    throw p0

    .line 76
    :cond_1
    new-instance v0, Ll/᩵᩺ۖ;

    invoke-direct {v0}, Ll/᩵᩺ۖ;-><init>()V

    invoke-virtual {v0, p0}, Ll/֨᩺ۖ;->֫(Ll/֡֫ۘ;)V

    return-object v0

    .line 74
    :cond_2
    new-instance v0, Ll/֡᩺ۖ;

    invoke-direct {v0}, Ll/֡᩺ۖ;-><init>()V

    invoke-virtual {v0, p0}, Ll/֨᩺ۖ;->֫(Ll/֡֫ۘ;)V

    return-object v0

    .line 72
    :cond_3
    new-instance v0, Ll/᩸᩺ۖ;

    invoke-direct {v0}, Ll/᩸᩺ۖ;-><init>()V

    invoke-virtual {v0, p0}, Ll/֨᩺ۖ;->֫(Ll/֡֫ۘ;)V

    return-object v0
.end method


# virtual methods
.method public final ֫()Ll/۠᩺ۖ;
    .locals 1

    .line 112
    iget-object v0, p0, Ll/֨᩺ۖ;->֫:Ll/۠᩺ۖ;

    return-object v0
.end method

.method public final ֫(Ll/֡֫ۘ;)V
    .locals 2

    .line 106
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v0

    const/4 v1, 0x4

    .line 107
    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->ܿ(I)V

    .line 85
    invoke-virtual {p0, p1}, Ll/֨᩺ۖ;->ۧ(Ll/֡֫ۘ;)V

    .line 86
    rem-int/lit8 v0, v0, 0x8

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    rsub-int/lit8 v0, v0, 0x8

    :goto_0
    if-lez v0, :cond_1

    .line 88
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܽ()I

    move-result v1

    if-lt v1, v0, :cond_1

    .line 90
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܿ(I)V

    :cond_1
    return-void
.end method

.method public ۧ(Ll/֡֫ۘ;)V
    .locals 1

    .line 102
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Should be implemented by specific message type"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܽ(Ll/֡֫ۘ;)I
    .locals 4

    .line 47
    new-instance v0, Ll/֡֫ۘ;

    invoke-direct {v0}, Ll/֡֫ۘ;-><init>()V

    .line 48
    invoke-virtual {p0, v0}, Ll/֨᩺ۖ;->ᩳ(Ll/֡֫ۘ;)I

    move-result v1

    .line 62
    iget-object v2, p0, Ll/֨᩺ۖ;->֫:Ll/۠᩺ۖ;

    invoke-virtual {v2}, Ll/۠᩺ۖ;->getValue()J

    move-result-wide v2

    long-to-int v3, v2

    invoke-virtual {p1, v3}, Ll/ۤܰۖ;->ۧ(I)V

    .line 63
    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->ۧ(I)V

    .line 64
    invoke-virtual {p1}, Ll/֡֫ۘ;->ۘ()V

    .line 50
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->֫(Ll/֡֫ۘ;)V

    add-int/lit8 v1, v1, 0x8

    return v1
.end method

.method public ᩳ(Ll/֡֫ۘ;)I
    .locals 1

    .line 58
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Should be implemented by specific SMB2NegotiateContext"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
