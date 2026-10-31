.class public Ll/ܺᩴۘ;
.super Ll/᩸ᩴۘ;
.source "A8CT"


# instance fields
.field public ܽ:[Ll/ۜᩴۘ;


# direct methods
.method public constructor <init>(ILjava/lang/String;D)V
    .locals 0

    .line 28
    invoke-direct {p0, p2}, Ll/᩸ᩴۘ;-><init>(Ljava/lang/String;)V

    .line 29
    invoke-virtual {p0, p1, p3, p4}, Ll/ܺᩴۘ;->֫(ID)V

    return-void
.end method


# virtual methods
.method public ֫(ID)V
    .locals 3

    .line 37
    new-array v0, p1, [Ll/ۜᩴۘ;

    iput-object v0, p0, Ll/ܺᩴۘ;->ܽ:[Ll/ۜᩴۘ;

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    .line 39
    iget-object v1, p0, Ll/ܺᩴۘ;->ܽ:[Ll/ۜᩴۘ;

    new-instance v2, Ll/ۜᩴۘ;

    invoke-direct {v2, p0, p2, p3}, Ll/ۜᩴۘ;-><init>(Ll/ܺᩴۘ;D)V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(I)[D
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ܺᩴۘ;->ܽ:[Ll/ۜᩴۘ;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Ll/ۜᩴۘ;->ܿ()[D

    move-result-object p1

    return-object p1
.end method

.method public final ܿ()[D
    .locals 2

    .line 68
    iget-object v0, p0, Ll/ܺᩴۘ;->ܽ:[Ll/ۜᩴۘ;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ll/ۜᩴۘ;->ܿ()[D

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()V
    .locals 2

    const/4 v0, 0x0

    .line 104
    iget-object v1, p0, Ll/ܺᩴۘ;->ܽ:[Ll/ۜᩴۘ;

    aget-object v0, v1, v0

    invoke-virtual {v0}, Ll/ۜᩴۘ;->֫()V

    return-void
.end method
