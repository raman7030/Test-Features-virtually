.class public Ll/֫ܳۖ;
.super Ll/۠ᩳۖ;
.source "M7SQ"


# static fields
.field public static final ֫:Ll/֫ܳۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 36
    new-instance v0, Ll/֫ܳۖ;

    invoke-direct {v0}, Ll/֫ܳۖ;-><init>()V

    sput-object v0, Ll/֫ܳۖ;->֫:Ll/֫ܳۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    return-void
.end method

.method public static ֫(Ll/ܿۜۖ;Ll/ܳۜۖ;)Ll/᩺ܽۖ;
    .locals 2

    .line 59
    sget-object v0, Ll/۟ܿۖ;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

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

    .line 68
    invoke-virtual {p0}, Ll/ܿۜۖ;->ۗ()V

    .line 69
    sget-object p0, Ll/۟ܽۖ;->֫:Ll/۟ܽۖ;

    return-object p0

    .line 72
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected token: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 66
    :cond_1
    new-instance p1, Ll/ᩳᩳۖ;

    invoke-virtual {p0}, Ll/ܿۜۖ;->ܶ()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-direct {p1, p0}, Ll/ᩳᩳۖ;-><init>(Ljava/lang/Boolean;)V

    return-object p1

    .line 63
    :cond_2
    invoke-virtual {p0}, Ll/ܿۜۖ;->۬()Ljava/lang/String;

    move-result-object p0

    .line 64
    new-instance p1, Ll/ᩳᩳۖ;

    new-instance v0, Ll/ܰᩳۖ;

    invoke-direct {v0, p0}, Ll/ܰᩳۖ;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Ll/ᩳᩳۖ;-><init>(Ljava/lang/Number;)V

    return-object p1

    .line 61
    :cond_3
    new-instance p1, Ll/ᩳᩳۖ;

    invoke-virtual {p0}, Ll/ܿۜۖ;->۬()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ll/ᩳᩳۖ;-><init>(Ljava/lang/String;)V

    return-object p1
.end method

.method public static ֫(Ll/᩺ܽۖ;Ll/᩻ۜۖ;)V
    .locals 2

    if-eqz p0, :cond_a

    .line 148
    instance-of v0, p0, Ll/۟ܽۖ;

    if-eqz v0, :cond_0

    goto/16 :goto_2

    .line 138
    :cond_0
    instance-of v0, p0, Ll/ᩳᩳۖ;

    if-eqz v0, :cond_3

    .line 143
    invoke-virtual {p0}, Ll/᩺ܽۖ;->ۧ()Ll/ᩳᩳۖ;

    move-result-object p0

    .line 144
    invoke-virtual {p0}, Ll/ᩳᩳۖ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 145
    invoke-virtual {p0}, Ll/ᩳᩳۖ;->᩻()Ljava/lang/Number;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll/᩻ۜۖ;->֫(Ljava/lang/Number;)V

    return-void

    .line 146
    :cond_1
    invoke-virtual {p0}, Ll/ᩳᩳۖ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 147
    invoke-virtual {p0}, Ll/ᩳᩳۖ;->ܿ()Z

    move-result p0

    invoke-virtual {p1, p0}, Ll/᩻ۜۖ;->ܽ(Z)V

    return-void

    .line 149
    :cond_2
    invoke-virtual {p0}, Ll/ᩳᩳۖ;->ܽ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll/᩻ۜۖ;->ۧ(Ljava/lang/String;)V

    return-void

    .line 120
    :cond_3
    instance-of v0, p0, Ll/ۛܽۖ;

    if-eqz v0, :cond_6

    .line 153
    invoke-virtual {p1}, Ll/᩻ۜۖ;->֫()V

    if-eqz v0, :cond_5

    .line 177
    check-cast p0, Ll/ۛܽۖ;

    .line 154
    invoke-virtual {p0}, Ll/ۛܽۖ;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ܽۖ;

    .line 155
    invoke-static {v0, p1}, Ll/֫ܳۖ;->֫(Ll/᩺ܽۖ;Ll/᩻ۜۖ;)V

    goto :goto_0

    .line 157
    :cond_4
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ᩳ()V

    return-void

    .line 179
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Not a JSON Array: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 129
    :cond_6
    instance-of v0, p0, Ll/֫ᩳۖ;

    if-eqz v0, :cond_9

    .line 160
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ܽ()V

    if-eqz v0, :cond_8

    .line 162
    check-cast p0, Ll/֫ᩳۖ;

    .line 161
    invoke-virtual {p0}, Ll/֫ᩳۖ;->ᩳ()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 162
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Ll/᩻ۜۖ;->֫(Ljava/lang/String;)V

    .line 163
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ܽۖ;

    invoke-static {v0, p1}, Ll/֫ܳۖ;->֫(Ll/᩺ܽۖ;Ll/᩻ۜۖ;)V

    goto :goto_1

    .line 165
    :cond_7
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ܳ()V

    return-void

    .line 164
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Not a JSON Object: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 168
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Couldn\'t write "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 141
    :cond_a
    :goto_2
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ۘ()Ll/᩻ۜۖ;

    return-void
.end method

.method public static ۧ(Ll/ܿۜۖ;Ll/ܳۜۖ;)Ll/᩺ܽۖ;
    .locals 1

    .line 45
    sget-object v0, Ll/۟ܿۖ;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 50
    :cond_0
    invoke-virtual {p0}, Ll/ܿۜۖ;->ܽ()V

    .line 51
    new-instance p0, Ll/֫ᩳۖ;

    invoke-direct {p0}, Ll/֫ᩳۖ;-><init>()V

    return-object p0

    .line 47
    :cond_1
    invoke-virtual {p0}, Ll/ܿۜۖ;->֫()V

    .line 48
    new-instance p0, Ll/ۛܽۖ;

    invoke-direct {p0}, Ll/ۛܽۖ;-><init>()V

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 6

    .line 79
    instance-of v0, p1, Ll/ۧܳۖ;

    if-nez v0, :cond_9

    .line 85
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v0

    .line 87
    invoke-static {p1, v0}, Ll/֫ܳۖ;->ۧ(Ll/ܿۜۖ;Ll/ܳۜۖ;)Ll/᩺ܽۖ;

    move-result-object v1

    if-nez v1, :cond_0

    .line 89
    invoke-static {p1, v0}, Ll/֫ܳۖ;->֫(Ll/ܿۜۖ;Ll/ܳۜۖ;)Ll/᩺ܽۖ;

    move-result-object p1

    return-object p1

    .line 92
    :cond_0
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 95
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ll/ܿۜۖ;->ᩴ()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 98
    instance-of v2, v1, Ll/֫ᩳۖ;

    if-eqz v2, :cond_2

    .line 99
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۙ()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    .line 102
    :goto_1
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v3

    .line 103
    invoke-static {p1, v3}, Ll/֫ܳۖ;->ۧ(Ll/ܿۜۖ;Ll/ܳۜۖ;)Ll/᩺ܽۖ;

    move-result-object v4

    if-eqz v4, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    :goto_2
    if-nez v4, :cond_4

    .line 107
    invoke-static {p1, v3}, Ll/֫ܳۖ;->֫(Ll/ܿۜۖ;Ll/ܳۜۖ;)Ll/᩺ܽۖ;

    move-result-object v3

    goto :goto_3

    :cond_4
    move-object v3, v4

    .line 110
    :goto_3
    instance-of v4, v1, Ll/ۛܽۖ;

    if-eqz v4, :cond_5

    .line 111
    move-object v2, v1

    check-cast v2, Ll/ۛܽۖ;

    invoke-virtual {v2, v3}, Ll/ۛܽۖ;->֫(Ll/᩺ܽۖ;)V

    goto :goto_4

    .line 113
    :cond_5
    move-object v4, v1

    check-cast v4, Ll/֫ᩳۖ;

    invoke-virtual {v4, v2, v3}, Ll/֫ᩳۖ;->֫(Ljava/lang/String;Ll/᩺ܽۖ;)V

    :goto_4
    if-eqz v5, :cond_1

    .line 117
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    move-object v1, v3

    goto :goto_0

    .line 123
    :cond_6
    instance-of v2, v1, Ll/ۛܽۖ;

    if-eqz v2, :cond_7

    .line 124
    invoke-virtual {p1}, Ll/ܿۜۖ;->ܳ()V

    goto :goto_5

    .line 126
    :cond_7
    invoke-virtual {p1}, Ll/ܿۜۖ;->᩻()V

    .line 129
    :goto_5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_8

    return-object v1

    .line 133
    :cond_8
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺ܽۖ;

    goto :goto_0

    .line 80
    :cond_9
    check-cast p1, Ll/ۧܳۖ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    .line 0
    throw p1
.end method

.method public final bridge synthetic ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 0

    .line 35
    check-cast p2, Ll/᩺ܽۖ;

    invoke-static {p2, p1}, Ll/֫ܳۖ;->֫(Ll/᩺ܽۖ;Ll/᩻ۜۖ;)V

    return-void
.end method
