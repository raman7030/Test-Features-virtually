.class public final Ll/۬᩵ܽ;
.super Ljava/lang/Object;
.source "F6VE"


# static fields
.field public static final ܿ:[I


# instance fields
.field public final ֫:Ll/ۗ᩵ܽ;

.field public final ۧ:[[I

.field public final ܽ:Ll/ۗ᩵ܽ;

.field public final ᩳ:[[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    .line 7
    sput-object v0, Ll/۬᩵ܽ;->ܿ:[I

    return-void
.end method

.method public constructor <init>(Ll/ۗ᩵ܽ;Ll/ۗ᩵ܽ;[[I[[I)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Ll/۬᩵ܽ;->ܽ:Ll/ۗ᩵ܽ;

    .line 18
    iput-object p2, p0, Ll/۬᩵ܽ;->֫:Ll/ۗ᩵ܽ;

    .line 19
    iput-object p3, p0, Ll/۬᩵ܽ;->ᩳ:[[I

    .line 20
    iput-object p4, p0, Ll/۬᩵ܽ;->ۧ:[[I

    return-void
.end method

.method public static ֫(Ll/ۛۚܽ;)Ll/ۛۚܽ;
    .locals 4

    .line 70
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    :goto_0
    if-eqz p0, :cond_4

    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ll/ۚۚܽ;

    if-ne v1, v2, :cond_0

    .line 73
    move-object v1, p0

    check-cast v1, Ll/ۚۚܽ;

    .line 74
    iget-boolean v2, v1, Ll/ۚۚܽ;->ܽ:Z

    if-nez v2, :cond_4

    iget-object v2, v1, Ll/ۚۚܽ;->ᩳ:Ll/֨ۚܽ;

    if-eqz v2, :cond_4

    iget-boolean v3, v2, Ll/֨ۚܽ;->ᩳ:Z

    if-nez v3, :cond_4

    iget v3, v2, Ll/֨ۚܽ;->ۧ:I

    if-nez v3, :cond_4

    iget v1, v1, Ll/ۚۚܽ;->ۧ:I

    iget v2, v2, Ll/֨ۚܽ;->ܽ:I

    if-eq v1, v2, :cond_1

    goto :goto_1

    .line 76
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ll/֨ۚܽ;

    if-ne v1, v2, :cond_3

    .line 77
    move-object v1, p0

    check-cast v1, Ll/֨ۚܽ;

    .line 78
    iget-boolean v2, v1, Ll/֨ۚܽ;->ᩳ:Z

    if-nez v2, :cond_4

    iget v1, v1, Ll/֨ۚܽ;->ۧ:I

    if-eqz v1, :cond_1

    goto :goto_1

    .line 82
    :cond_1
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p0, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 83
    :cond_2
    iget-object p0, p0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    goto :goto_0

    :cond_3
    return-object p0

    :cond_4
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ۛ֡ܽ;)Ll/۬᩵ܽ;
    .locals 14

    if-nez p0, :cond_0

    goto/16 :goto_5

    .line 26
    :cond_0
    iget-object v0, p0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-static {v0}, Ll/۬᩵ܽ;->֫(Ll/ۛۚܽ;)Ll/ۛۚܽ;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ll/ۨ֡ܽ;

    if-eq v1, v2, :cond_1

    goto/16 :goto_5

    .line 28
    :cond_1
    check-cast v0, Ll/ۨ֡ܽ;

    iget-object v1, v0, Ll/ۨ֡ܽ;->ᩳ:Ll/ۛۚܽ;

    .line 29
    iget-object v2, v0, Ll/ۨ֡ܽ;->ܽ:[Ll/ۛۚܽ;

    if-eqz v2, :cond_f

    iget v3, v0, Ll/ۨ֡ܽ;->ܿ:I

    const/4 v4, 0x2

    if-lt v3, v4, :cond_f

    array-length v2, v2

    if-gt v3, v2, :cond_f

    if-eqz v1, :cond_f

    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ll/᩺֡ܽ;

    if-eq v2, v3, :cond_2

    goto/16 :goto_5

    .line 33
    :cond_2
    iget-object v2, v1, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-static {v2}, Ll/۬᩵ܽ;->֫(Ll/ۛۚܽ;)Ll/ۛۚܽ;

    move-result-object v2

    if-eqz v2, :cond_f

    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Ll/ۛ֡ܽ;

    if-eq v3, v4, :cond_3

    goto/16 :goto_5

    .line 35
    :cond_3
    check-cast v2, Ll/ۛ֡ܽ;

    .line 36
    iget-object v3, v2, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-static {v3}, Ll/۬᩵ܽ;->֫(Ll/ۛۚܽ;)Ll/ۛۚܽ;

    move-result-object v3

    if-eqz v3, :cond_f

    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Ll/ܶۚܽ;

    if-eq v3, v4, :cond_4

    goto/16 :goto_5

    .line 39
    :cond_4
    iget v3, v0, Ll/ۨ֡ܽ;->ܿ:I

    new-array v4, v3, [[I

    const/16 v5, 0x80

    new-array v6, v5, [I

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 41
    :goto_0
    iget v9, v0, Ll/ۨ֡ܽ;->ܿ:I

    if-ge v8, v9, :cond_a

    .line 42
    iget-object v9, v0, Ll/ۨ֡ܽ;->ܽ:[Ll/ۛۚܽ;

    aget-object v9, v9, v8

    if-eqz v9, :cond_f

    .line 44
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    const-class v11, Ll/ۢ֨ܽ;

    if-ne v10, v11, :cond_f

    iget-object v10, v9, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    if-eq v10, v1, :cond_5

    goto/16 :goto_5

    .line 47
    :cond_5
    check-cast v9, Ll/ۢ֨ܽ;

    iget-object v9, v9, Ll/ۖ֨ܽ;->ۧ:[I

    if-eqz v9, :cond_f

    .line 48
    array-length v10, v9

    if-nez v10, :cond_6

    goto/16 :goto_5

    .line 49
    :cond_6
    array-length v10, v9

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v10, :cond_8

    aget v12, v9, v11

    if-ltz v12, :cond_f

    const v13, 0xffff

    if-le v12, v13, :cond_7

    goto :goto_5

    :cond_7
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 52
    :cond_8
    invoke-virtual {v9}, [I->clone()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [I

    aput-object v10, v4, v8

    .line 53
    aget v9, v9, v7

    if-ge v9, v5, :cond_9

    aget v10, v6, v9

    add-int/lit8 v10, v10, 0x1

    aput v10, v6, v9

    :cond_9
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_a
    new-array v0, v5, [[I

    const/4 v1, 0x0

    :goto_2
    if-ge v1, v5, :cond_c

    .line 57
    aget v8, v6, v1

    if-nez v8, :cond_b

    sget-object v8, Ll/۬᩵ܽ;->ܿ:[I

    goto :goto_3

    :cond_b
    new-array v8, v8, [I

    :goto_3
    aput-object v8, v0, v1

    .line 58
    aput v7, v6, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_c
    const/4 v1, 0x0

    :goto_4
    if-ge v1, v3, :cond_e

    .line 61
    aget-object v8, v4, v1

    aget v8, v8, v7

    if-ge v8, v5, :cond_d

    .line 62
    aget-object v9, v0, v8

    aget v10, v6, v8

    add-int/lit8 v11, v10, 0x1

    aput v11, v6, v8

    aput v1, v9, v10

    :cond_d
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 64
    :cond_e
    new-instance v1, Ll/۬᩵ܽ;

    new-instance v3, Ll/ۗ᩵ܽ;

    iget v5, p0, Ll/ۛ֡ܽ;->ۧ:I

    iget-boolean p0, p0, Ll/ۛ֡ܽ;->ܽ:Z

    invoke-direct {v3, v5, p0}, Ll/ۗ᩵ܽ;-><init>(IZ)V

    new-instance p0, Ll/ۗ᩵ܽ;

    iget v5, v2, Ll/ۛ֡ܽ;->ۧ:I

    iget-boolean v2, v2, Ll/ۛ֡ܽ;->ܽ:Z

    invoke-direct {p0, v5, v2}, Ll/ۗ᩵ܽ;-><init>(IZ)V

    invoke-direct {v1, v3, p0, v4, v0}, Ll/۬᩵ܽ;-><init>(Ll/ۗ᩵ܽ;Ll/ۗ᩵ܽ;[[I[[I)V

    return-object v1

    :cond_f
    :goto_5
    const/4 p0, 0x0

    return-object p0
.end method
