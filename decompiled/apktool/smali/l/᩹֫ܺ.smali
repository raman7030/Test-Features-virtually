.class public final Ll/᩹֫ܺ;
.super Ljava/lang/Object;
.source "HAUK"

# interfaces
.implements Ll/ܽۧܺ;
.implements Ll/᩵֫ܺ;


# static fields
.field public static final ֫:Ll/᩹֫ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 41
    new-instance v0, Ll/᩹֫ܺ;

    .line 43
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 41
    sput-object v0, Ll/᩹֫ܺ;->֫:Ll/᩹֫ܺ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۨ۟ۡ;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 119
    iget-object v0, p1, Ll/ۨ۟ۡ;->ۛ:Ll/۟۟ۡ;

    invoke-virtual {v0}, Ll/۟۟ۡ;->ܶ()I

    move-result v1

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    const/16 p1, 0x10

    .line 120
    invoke-virtual {v0, p1}, Ll/۟۟ۡ;->ۧ(I)V

    return-object v3

    .line 124
    :cond_0
    const-class v0, Ll/֨۟ۡ;

    if-ne p2, v0, :cond_1

    .line 125
    new-instance p2, Ll/֨۟ۡ;

    invoke-direct {p2}, Ll/֨۟ۡ;-><init>()V

    .line 1110
    invoke-virtual {p1, p2, v3}, Ll/ۨ۟ۡ;->֫(Ljava/util/Collection;Ljava/lang/Object;)V

    return-object p2

    :cond_1
    move-object v0, p2

    .line 132
    :goto_0
    instance-of v1, v0, Ljava/lang/Class;

    if-eqz v1, :cond_a

    .line 133
    check-cast v0, Ljava/lang/Class;

    .line 143
    const-class v1, Ljava/util/AbstractCollection;

    if-eq v0, v1, :cond_9

    const-class v1, Ljava/util/Collection;

    if-ne v0, v1, :cond_2

    goto/16 :goto_2

    .line 146
    :cond_2
    const-class v1, Ljava/util/HashSet;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 147
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    goto :goto_3

    .line 148
    :cond_3
    const-class v1, Ljava/util/LinkedHashSet;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 149
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    goto :goto_3

    .line 150
    :cond_4
    const-class v1, Ljava/util/TreeSet;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 151
    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    goto :goto_3

    .line 152
    :cond_5
    const-class v1, Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 153
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_3

    .line 154
    :cond_6
    const-class v1, Ljava/util/EnumSet;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 156
    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_7

    .line 157
    move-object v0, p2

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    goto :goto_1

    .line 159
    :cond_7
    const-class v0, Ljava/lang/Object;

    .line 161
    :goto_1
    check-cast v0, Ljava/lang/Class;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    goto :goto_3

    .line 164
    :cond_8
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_3

    .line 166
    :catch_0
    new-instance p1, Ll/ܶ۟ۡ;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    const-string p3, "create instane error, class "

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 25
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 166
    throw p1

    .line 145
    :cond_9
    :goto_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 170
    :goto_3
    invoke-static {p2}, Ll/᩵ۧܺ;->ۧ(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p2

    .line 171
    invoke-virtual {p1, p2, v0, p3}, Ll/ۨ۟ۡ;->֫(Ljava/lang/reflect/Type;Ljava/util/Collection;Ljava/lang/Object;)V

    return-object v0

    .line 135
    :cond_a
    instance-of v1, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v1, :cond_b

    .line 136
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v0

    goto/16 :goto_0

    .line 138
    :cond_b
    new-instance p1, Ll/ܶ۟ۡ;

    const-string p2, "TODO"

    .line 25
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 138
    throw p1
.end method

.method public final ֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 6

    .line 48
    iget-object v0, p1, Ll/ۛ֫ܺ;->ۜ:Ll/ۜۧܺ;

    if-nez p2, :cond_1

    .line 51
    iget p1, v0, Ll/ۜۧܺ;->᩶:I

    sget-object p2, Ll/᩷ۧܺ;->ۜ֫:Ll/᩷ۧܺ;

    iget p2, p2, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr p1, p2

    if-eqz p1, :cond_0

    const-string p1, "[]"

    .line 52
    invoke-virtual {v0, p1}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    return-void

    .line 54
    :cond_0
    invoke-virtual {v0}, Ll/ۜۧܺ;->֫()V

    return-void

    .line 60
    :cond_1
    iget v1, v0, Ll/ۜۧܺ;->᩶:I

    sget-object v2, Ll/᩷ۧܺ;->ۧ֫:Ll/᩷ۧܺ;

    iget v3, v2, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v1, v3

    if-eqz v1, :cond_2

    .line 61
    invoke-static {p4}, Ll/᩵ۧܺ;->ۧ(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p4

    goto :goto_0

    :cond_2
    const/4 p4, 0x0

    .line 64
    :goto_0
    move-object v1, p2

    check-cast v1, Ljava/util/Collection;

    .line 66
    iget-object v3, p1, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    .line 67
    invoke-virtual {p1, v3, p2, p3}, Ll/ۛ֫ܺ;->֫(Ll/ܳۧܺ;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    iget p2, v0, Ll/ۜۧܺ;->᩶:I

    iget p3, v2, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr p2, p3

    if-eqz p2, :cond_4

    .line 70
    const-class p2, Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    if-ne p2, p3, :cond_3

    const-string p2, "Set"

    .line 71
    invoke-virtual {v0, p2}, Ll/ۜۧܺ;->append(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 72
    :cond_3
    const-class p2, Ljava/util/TreeSet;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    if-ne p2, p3, :cond_4

    const-string p2, "TreeSet"

    .line 73
    invoke-virtual {v0, p2}, Ll/ۜۧܺ;->append(Ljava/lang/CharSequence;)V

    :cond_4
    :goto_1
    const/16 p2, 0x5b

    .line 79
    :try_start_0
    invoke-virtual {v0, p2}, Ll/ۜۧܺ;->write(I)V

    .line 80
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 p3, 0x0

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v2, p3, 0x1

    if-eqz p3, :cond_5

    const/16 v4, 0x2c

    .line 83
    invoke-virtual {v0, v4}, Ll/ۜۧܺ;->write(I)V

    :cond_5
    if-nez v1, :cond_6

    .line 87
    invoke-virtual {v0}, Ll/ۜۧܺ;->֫()V

    goto :goto_3

    .line 91
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    .line 93
    const-class v5, Ljava/lang/Integer;

    if-ne v4, v5, :cond_7

    .line 94
    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {v0, p3}, Ll/ۜۧܺ;->writeInt(I)V

    goto :goto_3

    .line 98
    :cond_7
    const-class v5, Ljava/lang/Long;

    if-ne v4, v5, :cond_8

    .line 99
    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ll/ۜۧܺ;->ۧ(J)V

    .line 101
    iget p3, v0, Ll/ۜۧܺ;->᩶:I

    sget-object v1, Ll/᩷ۧܺ;->ۧ֫:Ll/᩷ۧܺ;

    iget v1, v1, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr p3, v1

    if-eqz p3, :cond_9

    const/16 p3, 0x4c

    .line 102
    invoke-virtual {v0, p3}, Ll/ۜۧܺ;->write(I)V

    goto :goto_3

    .line 107
    :cond_8
    iget-object v5, p1, Ll/ۛ֫ܺ;->ܽ:Ll/᩻ۧܺ;

    invoke-virtual {v5, v4}, Ll/᩻ۧܺ;->֫(Ljava/lang/Class;)Ll/ܽۧܺ;

    move-result-object v4

    .line 108
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {v4, p1, v1, p3, p4}, Ll/ܽۧܺ;->֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    :cond_9
    :goto_3
    move p3, v2

    goto :goto_2

    :cond_a
    const/16 p2, 0x5d

    .line 110
    invoke-virtual {v0, p2}, Ll/ۜۧܺ;->write(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    iput-object v3, p1, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    return-void

    :catchall_0
    move-exception p2

    iput-object v3, p1, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    .line 113
    throw p2
.end method
