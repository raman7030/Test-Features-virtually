.class public final Ll/ܰۘۘ;
.super Ljava/lang/Object;
.source "O8D0"


# instance fields
.field public ֫:[Ll/ۨۘۘ;

.field public final ۧ:[D


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 149
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    mul-int/lit8 v0, p1, 0x40

    .line 150
    new-array v0, v0, [D

    iput-object v0, p0, Ll/ܰۘۘ;->ۧ:[D

    .line 152
    new-array p1, p1, [Ll/ۨۘۘ;

    iput-object p1, p0, Ll/ܰۘۘ;->֫:[Ll/ۨۘۘ;

    const/4 p1, 0x0

    .line 153
    :goto_0
    iget-object v0, p0, Ll/ܰۘۘ;->֫:[Ll/ۨۘۘ;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    .line 154
    new-instance v1, Ll/ۨۘۘ;

    invoke-direct {v1}, Ll/ۨۘۘ;-><init>()V

    aput-object v1, v0, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(I)I
    .locals 7

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x8

    if-ge v0, v1, :cond_1

    const/4 v1, 0x0

    .line 160
    :goto_1
    iget-object v2, p0, Ll/ܰۘۘ;->֫:[Ll/ۨۘۘ;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    .line 161
    aget-object v2, v2, v1

    .line 162
    invoke-static {v2}, Ll/ۨۘۘ;->֫(Ll/ۨۘۘ;)[D

    move-result-object v2

    add-int/lit8 v3, p1, 0x1

    iget-object v4, p0, Ll/ܰۘۘ;->ۧ:[D

    aget-wide v5, v4, p1

    aput-wide v5, v2, v0

    add-int/lit8 v1, v1, 0x1

    move p1, v3

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return p1
.end method

.method public final ۧ(I)I
    .locals 6

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x8

    if-ge v0, v1, :cond_1

    const/4 v1, 0x0

    .line 170
    :goto_1
    iget-object v2, p0, Ll/ܰۘۘ;->֫:[Ll/ۨۘۘ;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    .line 171
    aget-object v2, v2, v1

    add-int/lit8 v3, p1, 0x1

    .line 172
    invoke-static {v2}, Ll/ۨۘۘ;->֫(Ll/ۨۘۘ;)[D

    move-result-object v2

    aget-wide v4, v2, v0

    iget-object v2, p0, Ll/ܰۘۘ;->ۧ:[D

    aput-wide v4, v2, p1

    add-int/lit8 v1, v1, 0x1

    move p1, v3

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return p1
.end method
