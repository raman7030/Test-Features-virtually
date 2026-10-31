.class public final Ll/ۘۧܺ;
.super Ljava/lang/Object;
.source "SAVZ"


# instance fields
.field public final ֫:[Ll/ۖۧܺ;

.field public final ۧ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x3ff

    .line 31
    iput v0, p0, Ll/ۘۧܺ;->ۧ:I

    const/16 v0, 0x400

    new-array v0, v0, [Ll/ۖۧܺ;

    .line 32
    iput-object v0, p0, Ll/ۘۧܺ;->֫:[Ll/ۖۧܺ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ljava/lang/Class;
    .locals 5

    const/4 v0, 0x0

    .line 66
    :goto_0
    iget-object v1, p0, Ll/ۘۧܺ;->֫:[Ll/ۖۧܺ;

    array-length v2, v1

    if-ge v0, v2, :cond_3

    .line 67
    aget-object v1, v1, v0

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    move-object v2, v1

    :goto_1
    if-eqz v2, :cond_2

    .line 74
    iget-object v3, v1, Ll/ۖۧܺ;->֫:Ljava/lang/reflect/Type;

    .line 75
    instance-of v4, v3, Ljava/lang/Class;

    if-eqz v4, :cond_1

    .line 76
    check-cast v3, Ljava/lang/Class;

    .line 77
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    .line 78
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    return-object v3

    .line 73
    :cond_1
    iget-object v2, v2, Ll/ۖۧܺ;->ۧ:Ll/ۖۧܺ;

    goto :goto_1

    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 2

    .line 36
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    .line 37
    iget v1, p0, Ll/ۘۧܺ;->ۧ:I

    and-int/2addr v0, v1

    .line 39
    iget-object v1, p0, Ll/ۘۧܺ;->֫:[Ll/ۖۧܺ;

    aget-object v0, v1, v0

    :goto_0
    if-eqz v0, :cond_1

    .line 40
    iget-object v1, v0, Ll/ۖۧܺ;->֫:Ljava/lang/reflect/Type;

    if-ne p1, v1, :cond_0

    .line 41
    iget-object p1, v0, Ll/ۖۧܺ;->ܽ:Ljava/lang/Object;

    return-object p1

    .line 39
    :cond_0
    iget-object v0, v0, Ll/ۖۧܺ;->ۧ:Ll/ۖۧܺ;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 4

    .line 49
    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    .line 50
    iget v1, p0, Ll/ۘۧܺ;->ۧ:I

    and-int/2addr v0, v1

    .line 52
    iget-object v1, p0, Ll/ۘۧܺ;->֫:[Ll/ۖۧܺ;

    aget-object v2, v1, v0

    :goto_0
    if-eqz v2, :cond_1

    .line 53
    iget-object v3, v2, Ll/ۖۧܺ;->֫:Ljava/lang/reflect/Type;

    if-ne p2, v3, :cond_0

    .line 54
    iput-object p1, v2, Ll/ۖۧܺ;->ܽ:Ljava/lang/Object;

    return-void

    .line 52
    :cond_0
    iget-object v2, v2, Ll/ۖۧܺ;->ۧ:Ll/ۖۧܺ;

    goto :goto_0

    .line 59
    :cond_1
    new-instance v2, Ll/ۖۧܺ;

    aget-object v3, v1, v0

    invoke-direct {v2, p2, p1, v3}, Ll/ۖۧܺ;-><init>(Ljava/lang/reflect/Type;Ljava/lang/Object;Ll/ۖۧܺ;)V

    .line 60
    aput-object v2, v1, v0

    return-void
.end method
