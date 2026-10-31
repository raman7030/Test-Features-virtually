.class public final Ll/ܶᩴۘ;
.super Ll/ܺᩴۘ;
.source "T8DX"


# direct methods
.method public constructor <init>(I)V
    .locals 3

    const/4 p1, 0x1

    const-wide/16 v0, 0x0

    const-string v2, "Output"

    .line 42
    invoke-direct {p0, p1, v2, v0, v1}, Ll/ܺᩴۘ;-><init>(ILjava/lang/String;D)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x2

    const-wide/16 v1, 0x0

    .line 42
    invoke-direct {p0, v0, p1, v1, v2}, Ll/ܺᩴۘ;-><init>(ILjava/lang/String;D)V

    return-void
.end method


# virtual methods
.method public final ֫(ILl/۠ᩴۘ;I)V
    .locals 1

    .line 52
    iget-object v0, p0, Ll/ܺᩴۘ;->ܽ:[Ll/ۜᩴۘ;

    aget-object p1, v0, p1

    .line 53
    iget-object p2, p2, Ll/ܺᩴۘ;->ܽ:[Ll/ۜᩴۘ;

    aget-object p2, p2, p3

    .line 54
    invoke-virtual {p1, p2}, Ll/ۜᩴۘ;->֫(Ll/ۜᩴۘ;)V

    return-void
.end method

.method public final ܳ()V
    .locals 4

    .line 46
    iget-object v0, p0, Ll/ܺᩴۘ;->ܽ:[Ll/ۜᩴۘ;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 47
    invoke-virtual {v3}, Ll/ۜᩴۘ;->ۧ()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
