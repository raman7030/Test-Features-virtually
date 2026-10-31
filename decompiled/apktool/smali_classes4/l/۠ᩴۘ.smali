.class public Ll/۠ᩴۘ;
.super Ll/ܺᩴۘ;
.source "P8DQ"

# interfaces
.implements Ll/ᩳᩴۘ;


# instance fields
.field public ۜ:Z

.field public ܳ:D

.field public ܿ:D

.field public ᩳ:D

.field public ᩻:[D


# direct methods
.method public constructor <init>(ILjava/lang/String;D)V
    .locals 2

    .line 42
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ܺᩴۘ;-><init>(ILjava/lang/String;D)V

    const-wide/16 v0, 0x0

    .line 30
    iput-wide v0, p0, Ll/۠ᩴۘ;->ܳ:D

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 31
    iput-wide v0, p0, Ll/۠ᩴۘ;->ܿ:D

    const/4 p2, 0x0

    .line 34
    iput-boolean p2, p0, Ll/۠ᩴۘ;->ۜ:Z

    .line 167
    iput-wide p3, p0, Ll/۠ᩴۘ;->ᩳ:D

    .line 44
    new-array v0, p1, [D

    iput-object v0, p0, Ll/۠ᩴۘ;->᩻:[D

    :goto_0
    if-ge p2, p1, :cond_0

    .line 46
    iget-object v0, p0, Ll/۠ᩴۘ;->᩻:[D

    aput-wide p3, v0, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x1

    const-wide/16 v1, 0x0

    .line 55
    invoke-direct {p0, v0, p1, v1, v2}, Ll/۠ᩴۘ;-><init>(ILjava/lang/String;D)V

    return-void
.end method


# virtual methods
.method public final ֫(D)V
    .locals 2

    const/4 v0, 0x0

    .line 96
    iget-object v1, p0, Ll/۠ᩴۘ;->᩻:[D

    aput-wide p1, v1, v0

    .line 97
    new-instance v0, Ll/ۚᩴۘ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۚᩴۘ;-><init>(Ll/۠ᩴۘ;D)V

    invoke-virtual {p0, v0}, Ll/᩸ᩴۘ;->֫(Ll/۠֨ۘ;)V

    return-void
.end method

.method public final ֫(DDD)V
    .locals 0

    .line 159
    iput-wide p1, p0, Ll/۠ᩴۘ;->ܳ:D

    .line 151
    iput-wide p5, p0, Ll/۠ᩴۘ;->ܿ:D

    .line 167
    iput-wide p3, p0, Ll/۠ᩴۘ;->ᩳ:D

    .line 182
    invoke-virtual {p0, p3, p4}, Ll/۠ᩴۘ;->֫(D)V

    return-void
.end method

.method public final ֫(DLl/᩸֨ۘ;)V
    .locals 2

    const/4 v0, 0x0

    .line 78
    iget-object v1, p0, Ll/ܺᩴۘ;->ܽ:[Ll/ۜᩴۘ;

    aget-object v0, v1, v0

    invoke-virtual {v0}, Ll/ۜᩴۘ;->ᩳ()D

    .line 121
    new-instance v0, Ll/֨ᩴۘ;

    invoke-direct {v0, p0, p1, p2}, Ll/֨ᩴۘ;-><init>(Ll/۠ᩴۘ;D)V

    invoke-virtual {p0, p3, v0}, Ll/᩸ᩴۘ;->֫(Ll/᩸֨ۘ;Ll/۠֨ۘ;)V

    return-void
.end method

.method public final ֫(ID)V
    .locals 3

    .line 64
    new-array v0, p1, [Ll/ܿᩴۘ;

    iput-object v0, p0, Ll/ܺᩴۘ;->ܽ:[Ll/ۜᩴۘ;

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    .line 66
    iget-object v1, p0, Ll/ܺᩴۘ;->ܽ:[Ll/ۜᩴۘ;

    new-instance v2, Ll/ܿᩴۘ;

    invoke-direct {v2, p0, p2, p3}, Ll/ܿᩴۘ;-><init>(Ll/۠ᩴۘ;D)V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(J)V
    .locals 4

    .line 79
    iget-object v0, p0, Ll/ܺᩴۘ;->ܽ:[Ll/ۜᩴۘ;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 80
    check-cast v3, Ll/ܿᩴۘ;

    invoke-virtual {v3, p1, p2}, Ll/ۜᩴۘ;->֫(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/۠ᩴۘ;)V
    .locals 7

    .line 155
    iget-wide v1, p1, Ll/۠ᩴۘ;->ܳ:D

    .line 163
    iget-wide v3, p1, Ll/۠ᩴۘ;->ᩳ:D

    .line 141
    iget-wide v5, p1, Ll/۠ᩴۘ;->ܿ:D

    move-object v0, p0

    .line 187
    invoke-virtual/range {v0 .. v6}, Ll/۠ᩴۘ;->֫(DDD)V

    return-void
.end method

.method public final ۜ()Z
    .locals 1

    .line 191
    iget-boolean v0, p0, Ll/۠ᩴۘ;->ۜ:Z

    return v0
.end method

.method public final ۧ(D)V
    .locals 2

    .line 87
    iget-object v0, p0, Ll/ܺᩴۘ;->ܽ:[Ll/ۜᩴۘ;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1, p2}, Ll/ۜᩴۘ;->֫(D)V

    iget-object v0, p0, Ll/۠ᩴۘ;->᩻:[D

    aput-wide p1, v0, v1

    return-void
.end method

.method public final ܳ()D
    .locals 2

    .line 141
    iget-wide v0, p0, Ll/۠ᩴۘ;->ܿ:D

    return-wide v0
.end method

.method public final ᩷()V
    .locals 1

    const/4 v0, 0x1

    .line 206
    iput-boolean v0, p0, Ll/۠ᩴۘ;->ۜ:Z

    return-void
.end method

.method public final ᩻()D
    .locals 2

    .line 155
    iget-wide v0, p0, Ll/۠ᩴۘ;->ܳ:D

    return-wide v0
.end method
