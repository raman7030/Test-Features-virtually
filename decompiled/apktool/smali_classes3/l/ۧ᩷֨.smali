.class public abstract Ll/ۧ᩷֨;
.super Ljava/lang/Object;
.source "R1T1"


# instance fields
.field public final ֫:[S

.field public final ۧ:[S

.field public final ܽ:[[S

.field public final ᩳ:[[S


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v1, v0, [S

    .line 118
    iput-object v1, p0, Ll/ۧ᩷֨;->֫:[S

    new-array v1, v0, [I

    const/4 v2, 0x1

    const/16 v3, 0x8

    aput v3, v1, v2

    const/4 v4, 0x0

    const/16 v5, 0x10

    aput v5, v1, v4

    .line 119
    sget-object v6, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[S

    iput-object v1, p0, Ll/ۧ᩷֨;->ܽ:[[S

    new-array v0, v0, [I

    aput v3, v0, v2

    aput v5, v0, v4

    .line 120
    invoke-static {v6, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[S

    iput-object v0, p0, Ll/ۧ᩷֨;->ᩳ:[[S

    const/16 v0, 0x100

    new-array v0, v0, [S

    .line 121
    iput-object v0, p0, Ll/ۧ᩷֨;->ۧ:[S

    return-void
.end method


# virtual methods
.method public ֫()V
    .locals 4

    .line 124
    iget-object v0, p0, Ll/ۧ᩷֨;->֫:[S

    invoke-static {v0}, Ll/ۜ᩺ۘ;->֫([S)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 126
    :goto_0
    iget-object v2, p0, Ll/ۧ᩷֨;->ܽ:[[S

    array-length v3, v2

    if-ge v1, v3, :cond_0

    .line 127
    aget-object v2, v2, v1

    invoke-static {v2}, Ll/ۜ᩺ۘ;->֫([S)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 129
    :cond_0
    :goto_1
    iget-object v1, p0, Ll/ۧ᩷֨;->ᩳ:[[S

    array-length v2, v1

    if-ge v0, v2, :cond_1

    .line 130
    aget-object v1, v1, v0

    invoke-static {v1}, Ll/ۜ᩺ۘ;->֫([S)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 132
    :cond_1
    iget-object v0, p0, Ll/ۧ᩷֨;->ۧ:[S

    invoke-static {v0}, Ll/ۜ᩺ۘ;->֫([S)V

    return-void
.end method
