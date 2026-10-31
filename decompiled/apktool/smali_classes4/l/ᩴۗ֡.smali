.class public final enum Ll/ᩴۗ֡;
.super Ljava/lang/Enum;
.source "C9TP"


# static fields
.field public static final enum ֫֫:Ll/ᩴۗ֡;

.field public static final enum ۗ:Ll/ᩴۗ֡;

.field public static final synthetic ۙ:[Ll/ᩴۗ֡;

.field public static final enum ۛ:Ll/ᩴۗ֡;

.field public static final enum ۟:Ll/ᩴۗ֡;

.field public static final enum ۤ:Ll/ᩴۗ֡;

.field public static final ۧ֫:[Ll/ᩴۗ֡;

.field public static final enum ۨ:Ll/ᩴۗ֡;

.field public static final enum ۫:Ll/ᩴۗ֡;

.field public static final enum ۬:Ll/ᩴۗ֡;

.field public static final ܰ:I = 0x7

.field public static final ܽ֫:[Ll/ᩴۗ֡;

.field public static final ᩳ֫:Ljava/util/Map;

.field public static final enum ᩺:Ll/ᩴۗ֡;


# instance fields
.field public final ᩶:I

.field public final ᩸:Z

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 20

    .line 41
    new-instance v6, Ll/ᩴۗ֡;

    const-string v4, "whitelist"

    const/4 v5, 0x0

    const-string v1, "WHITELIST"

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ᩴۗ֡;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    sput-object v6, Ll/ᩴۗ֡;->֫֫:Ll/ᩴۗ֡;

    .line 42
    new-instance v0, Ll/ᩴۗ֡;

    const-string v11, "greylist"

    const/4 v12, 0x0

    const-string v8, "GREYLIST"

    const/4 v9, 0x1

    const/4 v10, 0x1

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Ll/ᩴۗ֡;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    sput-object v0, Ll/ᩴۗ֡;->۫:Ll/ᩴۗ֡;

    .line 43
    new-instance v1, Ll/ᩴۗ֡;

    const-string v17, "blacklist"

    const/16 v18, 0x0

    const-string v14, "BLACKLIST"

    const/4 v15, 0x2

    const/16 v16, 0x2

    move-object v13, v1

    invoke-direct/range {v13 .. v18}, Ll/ᩴۗ֡;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    sput-object v1, Ll/ᩴۗ֡;->ۗ:Ll/ᩴۗ֡;

    .line 44
    new-instance v2, Ll/ᩴۗ֡;

    const-string v11, "greylist-max-o"

    const-string v8, "GREYLIST_MAX_O"

    const/4 v9, 0x3

    const/4 v10, 0x3

    move-object v7, v2

    invoke-direct/range {v7 .. v12}, Ll/ᩴۗ֡;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    sput-object v2, Ll/ᩴۗ֡;->ۤ:Ll/ᩴۗ֡;

    .line 45
    new-instance v3, Ll/ᩴۗ֡;

    const-string v17, "greylist-max-p"

    const-string v14, "GREYLIST_MAX_P"

    const/4 v15, 0x4

    const/16 v16, 0x4

    move-object v13, v3

    invoke-direct/range {v13 .. v18}, Ll/ᩴۗ֡;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    sput-object v3, Ll/ᩴۗ֡;->ۛ:Ll/ᩴۗ֡;

    .line 46
    new-instance v4, Ll/ᩴۗ֡;

    const-string v11, "greylist-max-q"

    const-string v8, "GREYLIST_MAX_Q"

    const/4 v9, 0x5

    const/4 v10, 0x5

    move-object v7, v4

    invoke-direct/range {v7 .. v12}, Ll/ᩴۗ֡;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    sput-object v4, Ll/ᩴۗ֡;->ۨ:Ll/ᩴۗ֡;

    .line 47
    new-instance v5, Ll/ᩴۗ֡;

    const-string v17, "greylist-max-r"

    const-string v14, "GREYLIST_MAX_R"

    const/4 v15, 0x6

    const/16 v16, 0x6

    move-object v13, v5

    invoke-direct/range {v13 .. v18}, Ll/ᩴۗ֡;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    sput-object v5, Ll/ᩴۗ֡;->᩺:Ll/ᩴۗ֡;

    .line 48
    new-instance v13, Ll/ᩴۗ֡;

    const-string v11, "core-platform-api"

    const/4 v12, 0x1

    const-string v8, "CORE_PLATFORM_API"

    const/4 v9, 0x7

    const/16 v16, 0x8

    move-object v7, v13

    move/from16 v10, v16

    invoke-direct/range {v7 .. v12}, Ll/ᩴۗ֡;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    sput-object v13, Ll/ᩴۗ֡;->۬:Ll/ᩴۗ֡;

    .line 49
    new-instance v7, Ll/ᩴۗ֡;

    const-string v18, "test-api"

    const/16 v19, 0x1

    const-string v15, "TEST_API"

    const/16 v17, 0x10

    move-object v14, v7

    invoke-direct/range {v14 .. v19}, Ll/ᩴۗ֡;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    sput-object v7, Ll/ᩴۗ֡;->۟:Ll/ᩴۗ֡;

    .line 40
    invoke-static {}, Ll/ᩴۗ֡;->ۧ()[Ll/ᩴۗ֡;

    move-result-object v8

    sput-object v8, Ll/ᩴۗ֡;->ۙ:[Ll/ᩴۗ֡;

    const/4 v8, 0x7

    new-array v8, v8, [Ll/ᩴۗ֡;

    const/4 v9, 0x0

    aput-object v6, v8, v9

    const/4 v6, 0x1

    aput-object v0, v8, v6

    const/4 v0, 0x2

    aput-object v1, v8, v0

    const/4 v1, 0x3

    aput-object v2, v8, v1

    const/4 v1, 0x4

    aput-object v3, v8, v1

    const/4 v1, 0x5

    aput-object v4, v8, v1

    const/4 v1, 0x6

    aput-object v5, v8, v1

    .line 51
    sput-object v8, Ll/ᩴۗ֡;->ܽ֫:[Ll/ᩴۗ֡;

    new-array v0, v0, [Ll/ᩴۗ֡;

    aput-object v13, v0, v9

    aput-object v7, v0, v6

    .line 61
    sput-object v0, Ll/ᩴۗ֡;->ۧ֫:[Ll/ᩴۗ֡;

    .line 69
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ᩴۗ֡;->ᩳ֫:Ljava/util/Map;

    .line 70
    invoke-static {}, Ll/ᩴۗ֡;->values()[Ll/ᩴۗ֡;

    move-result-object v0

    array-length v1, v0

    :goto_0
    if-ge v9, v1, :cond_0

    aget-object v2, v0, v9

    .line 71
    sget-object v3, Ll/ᩴۗ֡;->ᩳ֫:Ljava/util/Map;

    invoke-virtual {v2}, Ll/ᩴۗ֡;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;Z)V
    .locals 0

    .line 81
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 82
    iput p3, p0, Ll/ᩴۗ֡;->᩶:I

    .line 83
    iput-object p4, p0, Ll/ᩴۗ֡;->᩹:Ljava/lang/String;

    .line 84
    iput-boolean p5, p0, Ll/ᩴۗ֡;->᩸:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ᩴۗ֡;
    .locals 1

    .line 40
    const-class v0, Ll/ᩴۗ֡;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ᩴۗ֡;

    return-object p0
.end method

.method public static values()[Ll/ᩴۗ֡;
    .locals 1

    .line 40
    sget-object v0, Ll/ᩴۗ֡;->ۙ:[Ll/ᩴۗ֡;

    invoke-virtual {v0}, [Ll/ᩴۗ֡;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ᩴۗ֡;

    return-object v0
.end method

.method public static ֫(Ljava/lang/Iterable;)I
    .locals 4

    .line 140
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴۗ֡;

    .line 141
    iget-boolean v3, v2, Ll/ᩴۗ֡;->᩸:Z

    if-eqz v3, :cond_0

    .line 142
    iget v2, v2, Ll/ᩴۗ֡;->᩶:I

    add-int/2addr v0, v2

    goto :goto_0

    :cond_0
    if-nez v1, :cond_1

    .line 149
    iget v1, v2, Ll/ᩴۗ֡;->᩶:I

    add-int/2addr v0, v1

    const/4 v1, 0x1

    goto :goto_0

    .line 145
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot combine multiple flags for hidden api restrictions"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    return v0
.end method

.method public static ֫(Ljava/lang/String;)Ll/ᩴۗ֡;
    .locals 1

    .line 157
    sget-object v0, Ll/ᩴۗ֡;->ᩳ֫:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ᩴۗ֡;

    return-object p0
.end method

.method public static ۧ(I)Ljava/lang/String;
    .locals 3

    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    invoke-static {p0}, Ll/ᩴۗ֡;->ᩳ(I)Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴۗ֡;

    .line 127
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-lez v2, :cond_0

    const/16 v2, 0x7c

    .line 128
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 130
    :cond_0
    invoke-virtual {v1}, Ll/ᩴۗ֡;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 132
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۧ()[Ll/ᩴۗ֡;
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [Ll/ᩴۗ֡;

    .line 40
    sget-object v1, Ll/ᩴۗ֡;->֫֫:Ll/ᩴۗ֡;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ᩴۗ֡;->۫:Ll/ᩴۗ֡;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ᩴۗ֡;->ۗ:Ll/ᩴۗ֡;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/ᩴۗ֡;->ۤ:Ll/ᩴۗ֡;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ll/ᩴۗ֡;->ۛ:Ll/ᩴۗ֡;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Ll/ᩴۗ֡;->ۨ:Ll/ᩴۗ֡;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Ll/ᩴۗ֡;->᩺:Ll/ᩴۗ֡;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Ll/ᩴۗ֡;->۬:Ll/ᩴۗ֡;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Ll/ᩴۗ֡;->۟:Ll/ᩴۗ֡;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static ᩳ(I)Ljava/util/Set;
    .locals 6

    .line 108
    sget-object v0, Ll/ᩴۗ֡;->ܽ֫:[Ll/ᩴۗ֡;

    and-int/lit8 v1, p0, 0x7

    aget-object v0, v0, v1

    and-int/lit8 v1, p0, -0x8

    if-nez v1, :cond_0

    .line 112
    invoke-static {v0}, Ll/ۛ۬ܺ;->֫(Ll/ᩴۗ֡;)Ll/ۛ۬ܺ;

    move-result-object p0

    return-object p0

    .line 114
    :cond_0
    sget v1, Ll/ۛ۬ܺ;->᩶:I

    .line 422
    new-instance v1, Ll/۫۬ܺ;

    invoke-direct {v1}, Ll/۫۬ܺ;-><init>()V

    .line 115
    invoke-virtual {v1, v0}, Ll/۫۬ܺ;->֫(Ljava/lang/Object;)Ll/۫۬ܺ;

    .line 116
    sget-object v0, Ll/ᩴۗ֡;->ۧ֫:[Ll/ᩴۗ֡;

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v0, v3

    .line 117
    invoke-virtual {v4, p0}, Ll/ᩴۗ֡;->֫(I)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 118
    invoke-virtual {v1, v4}, Ll/۫۬ܺ;->֫(Ljava/lang/Object;)Ll/۫۬ܺ;

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 121
    :cond_2
    invoke-virtual {v1}, Ll/۫۬ܺ;->֫()Ll/ۛ۬ܺ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    .line 92
    iget v0, p0, Ll/ᩴۗ֡;->᩶:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Ll/ᩴۗ֡;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public ֫()Z
    .locals 1

    .line 104
    iget-boolean v0, p0, Ll/ᩴۗ֡;->᩸:Z

    return v0
.end method

.method public ֫(I)Z
    .locals 3

    .line 96
    iget-boolean v0, p0, Ll/ᩴۗ֡;->᩸:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 97
    iget v0, p0, Ll/ᩴۗ֡;->᩶:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    return v2

    :cond_0
    return v1

    :cond_1
    and-int/lit8 p1, p1, 0x7

    .line 99
    iget v0, p0, Ll/ᩴۗ֡;->᩶:I

    if-ne p1, v0, :cond_2

    return v2

    :cond_2
    return v1
.end method
