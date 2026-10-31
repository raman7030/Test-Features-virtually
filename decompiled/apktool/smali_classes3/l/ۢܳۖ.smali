.class public final Ll/ۢܳۖ;
.super Ll/۠ᩳۖ;
.source "J84Z"


# static fields
.field public static final ܽ:Ll/ܶᩳۖ;


# instance fields
.field public final ֫:Ll/۫ܽۖ;

.field public final ۧ:Ll/ۚᩳۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 42
    sget-object v0, Ll/֡ᩳۖ;->᩶:Ll/֡ᩳۖ;

    .line 53
    new-instance v1, Ll/ۜܳۖ;

    invoke-direct {v1, v0}, Ll/ۜܳۖ;-><init>(Ll/ۚᩳۖ;)V

    .line 42
    sput-object v1, Ll/ۢܳۖ;->ܽ:Ll/ܶᩳۖ;

    return-void
.end method

.method public constructor <init>(Ll/۫ܽۖ;Ll/ۚᩳۖ;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    .line 48
    iput-object p1, p0, Ll/ۢܳۖ;->֫:Ll/۫ܽۖ;

    .line 49
    iput-object p2, p0, Ll/ۢܳۖ;->ۧ:Ll/ۚᩳۖ;

    return-void
.end method

.method private ֫(Ll/ܿۜۖ;Ll/ܳۜۖ;)Ljava/io/Serializable;
    .locals 2

    .line 92
    sget-object v0, Ll/᩷ܳۖ;->֫:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    .line 100
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۗ()V

    const/4 p1, 0x0

    return-object p1

    .line 104
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected token: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 98
    :cond_1
    invoke-virtual {p1}, Ll/ܿۜۖ;->ܶ()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 96
    :cond_2
    iget-object p2, p0, Ll/ۢܳۖ;->ۧ:Ll/ۚᩳۖ;

    invoke-interface {p2, p1}, Ll/ۚᩳۖ;->֫(Ll/ܿۜۖ;)Ljava/lang/Number;

    move-result-object p1

    return-object p1

    .line 94
    :cond_3
    invoke-virtual {p1}, Ll/ܿۜۖ;->۬()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static ֫(Ll/ۚᩳۖ;)Ll/ܶᩳۖ;
    .locals 1

    .line 66
    sget-object v0, Ll/֡ᩳۖ;->᩶:Ll/֡ᩳۖ;

    if-ne p0, v0, :cond_0

    .line 67
    sget-object p0, Ll/ۢܳۖ;->ܽ:Ll/ܶᩳۖ;

    return-object p0

    .line 53
    :cond_0
    new-instance v0, Ll/ۜܳۖ;

    invoke-direct {v0, p0}, Ll/ۜܳۖ;-><init>(Ll/ۚᩳۖ;)V

    return-object v0
.end method

.method public static ۧ(Ll/ܿۜۖ;Ll/ܳۜۖ;)Ljava/io/Serializable;
    .locals 1

    .line 78
    sget-object v0, Ll/᩷ܳۖ;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 83
    :cond_0
    invoke-virtual {p0}, Ll/ܿۜۖ;->ܽ()V

    .line 84
    new-instance p0, Ll/᩻ܿۖ;

    invoke-direct {p0}, Ll/᩻ܿۖ;-><init>()V

    return-object p0

    .line 80
    :cond_1
    invoke-virtual {p0}, Ll/ܿۜۖ;->֫()V

    .line 81
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 6

    .line 112
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v0

    .line 114
    invoke-static {p1, v0}, Ll/ۢܳۖ;->ۧ(Ll/ܿۜۖ;Ll/ܳۜۖ;)Ljava/io/Serializable;

    move-result-object v1

    if-nez v1, :cond_0

    .line 116
    invoke-direct {p0, p1, v0}, Ll/ۢܳۖ;->֫(Ll/ܿۜۖ;Ll/ܳۜۖ;)Ljava/io/Serializable;

    move-result-object p1

    return-object p1

    .line 119
    :cond_0
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 122
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ll/ܿۜۖ;->ᩴ()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 125
    instance-of v2, v1, Ljava/util/Map;

    if-eqz v2, :cond_2

    .line 126
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۙ()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    .line 129
    :goto_1
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v3

    .line 130
    invoke-static {p1, v3}, Ll/ۢܳۖ;->ۧ(Ll/ܿۜۖ;Ll/ܳۜۖ;)Ljava/io/Serializable;

    move-result-object v4

    if-eqz v4, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    :goto_2
    if-nez v4, :cond_4

    .line 134
    invoke-direct {p0, p1, v3}, Ll/ۢܳۖ;->֫(Ll/ܿۜۖ;Ll/ܳۜۖ;)Ljava/io/Serializable;

    move-result-object v3

    goto :goto_3

    :cond_4
    move-object v3, v4

    .line 137
    :goto_3
    instance-of v4, v1, Ljava/util/List;

    if-eqz v4, :cond_5

    .line 139
    move-object v2, v1

    check-cast v2, Ljava/util/List;

    .line 140
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 143
    :cond_5
    move-object v4, v1

    check-cast v4, Ljava/util/Map;

    .line 144
    invoke-interface {v4, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_4
    if-eqz v5, :cond_1

    .line 148
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    move-object v1, v3

    goto :goto_0

    .line 154
    :cond_6
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_7

    .line 155
    invoke-virtual {p1}, Ll/ܿۜۖ;->ܳ()V

    goto :goto_5

    .line 157
    :cond_7
    invoke-virtual {p1}, Ll/ܿۜۖ;->᩻()V

    .line 160
    :goto_5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_8

    return-object v1

    .line 164
    :cond_8
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    move-result-object v1

    goto :goto_0
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 2

    if-nez p2, :cond_0

    .line 172
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ۘ()Ll/᩻ۜۖ;

    return-void

    .line 177
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, Ll/ۢܳۖ;->֫:Ll/۫ܽۖ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 665
    invoke-static {v0}, Ll/ܽۜۖ;->֫(Ljava/lang/Class;)Ll/ܽۜۖ;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/۫ܽۖ;->֫(Ll/ܽۜۖ;)Ll/۠ᩳۖ;

    move-result-object v0

    .line 178
    instance-of v1, v0, Ll/ۢܳۖ;

    if-eqz v1, :cond_1

    .line 179
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ܽ()V

    .line 180
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ܳ()V

    return-void

    .line 184
    :cond_1
    invoke-virtual {v0, p1, p2}, Ll/۠ᩳۖ;->֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V

    return-void
.end method
