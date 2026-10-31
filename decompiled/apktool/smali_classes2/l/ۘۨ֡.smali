.class public abstract Ll/ۘۨ֡;
.super Ljava/lang/Object;
.source "71RN"


# instance fields
.field public final ᩸:Ll/֡ۛۡ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 124
    new-instance v0, Ll/֡ۛۡ;

    invoke-direct {v0}, Ll/֡ۛۡ;-><init>()V

    iput-object v0, p0, Ll/ۘۨ֡;->᩸:Ll/֡ۛۡ;

    return-void
.end method


# virtual methods
.method public abstract length()I
.end method

.method public abstract ֫(I)B
.end method

.method public final ֫(Ll/ᩴۨ֡;)V
    .locals 1

    .line 139
    iget-object v0, p0, Ll/ۘۨ֡;->᩸:Ll/֡ۛۡ;

    invoke-virtual {v0, p1}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    return-void
.end method

.method public ۜ(I)I
    .locals 3

    .line 45
    invoke-virtual {p0, p1}, Ll/ۘۨ֡;->ۧ(I)I

    move-result v0

    if-ltz v0, :cond_0

    return v0

    .line 47
    :cond_0
    new-instance v0, Ll/ܶ᩵ۚ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x0

    const-string v2, "Encountered small uint that is out of range at offset 0x%x"

    .line 46
    invoke-direct {v0, p1, v2, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    throw v0
.end method

.method public final ۢ(I)I
    .locals 1

    .line 61
    invoke-virtual {p0, p1}, Ll/ۘۨ֡;->᩻(I)I

    move-result p1

    const v0, 0xffff

    and-int/2addr p1, v0

    return p1
.end method

.method public abstract ۧ(I)I
.end method

.method public final ܳ(I)I
    .locals 3

    .line 53
    invoke-virtual {p0, p1}, Ll/ۘۨ֡;->ۧ(I)I

    move-result v0

    const/4 v1, -0x1

    if-lt v0, v1, :cond_0

    return v0

    .line 55
    :cond_0
    new-instance v0, Ll/ܶ᩵ۚ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x0

    const-string v2, "Encountered optional uint that is out of range at offset 0x%x"

    .line 46
    invoke-direct {v0, p1, v2, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    throw v0
.end method

.method public final ܺ(I)Ll/ᩴۨ֡;
    .locals 1

    .line 128
    iget-object v0, p0, Ll/ۘۨ֡;->᩸:Ll/֡ۛۡ;

    invoke-virtual {v0}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴۨ֡;

    if-eqz v0, :cond_0

    .line 130
    invoke-virtual {v0, p1}, Ll/ᩴۨ֡;->᩷(I)V

    .line 131
    invoke-virtual {v0}, Ll/ᩴۨ֡;->ᩴ()V

    return-object v0

    .line 133
    :cond_0
    new-instance v0, Ll/ᩴۨ֡;

    invoke-direct {v0, p0, p1}, Ll/ᩴۨ֡;-><init>(Ll/ۘۨ֡;I)V

    return-object v0
.end method

.method public abstract ܽ(I)J
.end method

.method public final ᩳ(I)I
    .locals 5

    .line 69
    invoke-virtual {p0, p1}, Ll/ۘۨ֡;->ܽ(I)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    long-to-int p1, v0

    return p1

    .line 71
    :cond_0
    new-instance v0, Ll/ܶ᩵ۚ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x0

    const-string v2, "Encountered out-of-range ulong at offset 0x%x"

    .line 46
    invoke-direct {v0, p1, v2, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    throw v0
.end method

.method public final ᩷(I)I
    .locals 0

    .line 65
    invoke-virtual {p0, p1}, Ll/ۘۨ֡;->֫(I)B

    move-result p1

    and-int/lit16 p1, p1, 0xff

    return p1
.end method

.method public abstract ᩻(I)I
.end method
