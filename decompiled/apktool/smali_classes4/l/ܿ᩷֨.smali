.class public abstract Ll/ܿ᩷֨;
.super Ljava/lang/Object;
.source "R1T1"


# instance fields
.field public final ֫:[S

.field public final ۜ:[S

.field public final ۡ:[I

.field public final ۢ:I

.field public final ۧ:[[S

.field public final ܳ:[S

.field public final ܺ:Ll/֡᩷֨;

.field public final ܽ:[[S

.field public final ܿ:[S

.field public final ᩳ:[[S

.field public final ᩷:[S

.field public final ᩻:[[S


# direct methods
.method public constructor <init>(I)V
    .locals 17

    move-object/from16 v0, p0

    .line 55
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x4

    new-array v2, v1, [I

    .line 32
    iput-object v2, v0, Ll/ܿ᩷֨;->ۡ:[I

    .line 33
    new-instance v2, Ll/֡᩷֨;

    .line 28
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object v2, v0, Ll/ܿ᩷֨;->ܺ:Ll/֡᩷֨;

    const/4 v2, 0x2

    new-array v3, v2, [I

    const/4 v4, 0x1

    const/16 v5, 0x10

    aput v5, v3, v4

    const/4 v6, 0x0

    const/16 v7, 0xc

    aput v7, v3, v6

    .line 35
    sget-object v8, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-static {v8, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [[S

    iput-object v3, v0, Ll/ܿ᩷֨;->ᩳ:[[S

    new-array v3, v7, [S

    .line 36
    iput-object v3, v0, Ll/ܿ᩷֨;->ܿ:[S

    new-array v3, v7, [S

    .line 37
    iput-object v3, v0, Ll/ܿ᩷֨;->ܳ:[S

    new-array v3, v7, [S

    .line 38
    iput-object v3, v0, Ll/ܿ᩷֨;->ۜ:[S

    new-array v3, v7, [S

    .line 39
    iput-object v3, v0, Ll/ܿ᩷֨;->᩷:[S

    new-array v3, v2, [I

    aput v5, v3, v4

    aput v7, v3, v6

    .line 40
    invoke-static {v8, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [[S

    iput-object v3, v0, Ll/ܿ᩷֨;->᩻:[[S

    new-array v3, v2, [I

    const/16 v7, 0x40

    aput v7, v3, v4

    aput v1, v3, v6

    .line 41
    invoke-static {v8, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [[S

    iput-object v3, v0, Ll/ܿ᩷֨;->ۧ:[[S

    new-array v3, v2, [S

    new-array v2, v2, [S

    new-array v7, v1, [S

    new-array v1, v1, [S

    const/16 v8, 0x8

    new-array v9, v8, [S

    new-array v10, v8, [S

    new-array v11, v5, [S

    new-array v12, v5, [S

    const/16 v13, 0x20

    const/4 v14, 0x4

    new-array v15, v13, [S

    new-array v13, v13, [S

    const/16 v16, 0x2

    const/16 v5, 0xa

    new-array v5, v5, [[S

    aput-object v3, v5, v6

    aput-object v2, v5, v4

    aput-object v7, v5, v16

    const/4 v2, 0x3

    aput-object v1, v5, v2

    aput-object v9, v5, v14

    const/4 v1, 0x5

    aput-object v10, v5, v1

    const/4 v1, 0x6

    aput-object v11, v5, v1

    const/4 v1, 0x7

    aput-object v12, v5, v1

    aput-object v15, v5, v8

    const/16 v1, 0x9

    aput-object v13, v5, v1

    .line 42
    iput-object v5, v0, Ll/ܿ᩷֨;->ܽ:[[S

    const/16 v1, 0x10

    new-array v1, v1, [S

    .line 47
    iput-object v1, v0, Ll/ܿ᩷֨;->֫:[S

    shl-int v1, v4, p1

    sub-int/2addr v1, v4

    .line 56
    iput v1, v0, Ll/ܿ᩷֨;->ۢ:I

    return-void
.end method


# virtual methods
.method public ֫()V
    .locals 4

    .line 60
    iget-object v0, p0, Ll/ܿ᩷֨;->ۡ:[I

    const/4 v1, 0x0

    aput v1, v0, v1

    const/4 v2, 0x1

    .line 61
    aput v1, v0, v2

    const/4 v2, 0x2

    .line 62
    aput v1, v0, v2

    const/4 v2, 0x3

    .line 63
    aput v1, v0, v2

    .line 64
    iget-object v0, p0, Ll/ܿ᩷֨;->ܺ:Ll/֡᩷֨;

    invoke-virtual {v0}, Ll/֡᩷֨;->ܽ()V

    const/4 v0, 0x0

    .line 66
    :goto_0
    iget-object v2, p0, Ll/ܿ᩷֨;->ᩳ:[[S

    array-length v3, v2

    if-ge v0, v3, :cond_0

    .line 67
    aget-object v2, v2, v0

    invoke-static {v2}, Ll/ۜ᩺ۘ;->֫([S)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 69
    :cond_0
    iget-object v0, p0, Ll/ܿ᩷֨;->ܿ:[S

    invoke-static {v0}, Ll/ۜ᩺ۘ;->֫([S)V

    .line 70
    iget-object v0, p0, Ll/ܿ᩷֨;->ܳ:[S

    invoke-static {v0}, Ll/ۜ᩺ۘ;->֫([S)V

    .line 71
    iget-object v0, p0, Ll/ܿ᩷֨;->ۜ:[S

    invoke-static {v0}, Ll/ۜ᩺ۘ;->֫([S)V

    .line 72
    iget-object v0, p0, Ll/ܿ᩷֨;->᩷:[S

    invoke-static {v0}, Ll/ۜ᩺ۘ;->֫([S)V

    const/4 v0, 0x0

    .line 74
    :goto_1
    iget-object v2, p0, Ll/ܿ᩷֨;->᩻:[[S

    array-length v3, v2

    if-ge v0, v3, :cond_1

    .line 75
    aget-object v2, v2, v0

    invoke-static {v2}, Ll/ۜ᩺ۘ;->֫([S)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 77
    :goto_2
    iget-object v2, p0, Ll/ܿ᩷֨;->ۧ:[[S

    array-length v3, v2

    if-ge v0, v3, :cond_2

    .line 78
    aget-object v2, v2, v0

    invoke-static {v2}, Ll/ۜ᩺ۘ;->֫([S)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 80
    :cond_2
    :goto_3
    iget-object v0, p0, Ll/ܿ᩷֨;->ܽ:[[S

    array-length v2, v0

    if-ge v1, v2, :cond_3

    .line 81
    aget-object v0, v0, v1

    invoke-static {v0}, Ll/ۜ᩺ۘ;->֫([S)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 83
    :cond_3
    iget-object v0, p0, Ll/ܿ᩷֨;->֫:[S

    invoke-static {v0}, Ll/ۜ᩺ۘ;->֫([S)V

    return-void
.end method
