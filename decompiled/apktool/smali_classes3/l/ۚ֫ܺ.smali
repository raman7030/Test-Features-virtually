.class public final Ll/ۚ֫ܺ;
.super Ljava/lang/Object;
.source "NAVP"

# interfaces
.implements Ll/ܽۧܺ;
.implements Ll/᩵֫ܺ;


# static fields
.field public static final ֫:Ll/ۚ֫ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 35
    new-instance v0, Ll/ۚ֫ܺ;

    .line 37
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    sput-object v0, Ll/ۚ֫ܺ;->֫:Ll/ۚ֫ܺ;

    return-void
.end method

.method public static ֫(Ll/ۨ۟ۡ;Ljava/lang/Class;Ll/֨۟ۡ;)Ljava/lang/Object;
    .locals 5

    if-nez p2, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 179
    :cond_0
    invoke-virtual {p2}, Ll/֨۟ۡ;->size()I

    move-result v0

    .line 181
    invoke-static {p1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_4

    .line 183
    invoke-virtual {p2, v2}, Ll/֨۟ۡ;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, p2, :cond_1

    .line 186
    invoke-static {v1, v2, v1}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_2

    .line 191
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 192
    invoke-virtual {p1, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    .line 195
    :cond_2
    check-cast v3, Ll/֨۟ۡ;

    invoke-static {p0, p1, v3}, Ll/ۚ֫ܺ;->֫(Ll/ۨ۟ۡ;Ljava/lang/Class;Ll/֨۟ۡ;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_1

    .line 198
    :cond_3
    iget-object v4, p0, Ll/ۨ۟ۡ;->᩸:Ll/᩻֫ܺ;

    .line 542
    invoke-static {v3, p1, v4}, Ll/᩵ۧܺ;->֫(Ljava/lang/Object;Ljava/lang/Class;Ll/᩻֫ܺ;)Ljava/lang/Object;

    move-result-object v3

    .line 200
    :goto_1
    invoke-static {v1, v2, v3}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 203
    :cond_4
    invoke-virtual {p2, v1}, Ll/֨۟ۡ;->ܽ(Ljava/lang/Object;)V

    .line 204
    invoke-virtual {p2, p1}, Ll/֨۟ۡ;->֫(Ljava/lang/reflect/Type;)V

    return-object v1
.end method


# virtual methods
.method public final ֫(Ll/ۨ۟ۡ;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 134
    iget-object v0, p1, Ll/ۨ۟ۡ;->ۛ:Ll/۟۟ۡ;

    .line 136
    invoke-virtual {v0}, Ll/۟۟ۡ;->ܶ()I

    move-result v1

    const/16 v2, 0x8

    const/4 v3, 0x0

    const/16 v4, 0x10

    if-ne v1, v2, :cond_0

    .line 138
    invoke-virtual {v0, v4}, Ll/۟۟ۡ;->ۧ(I)V

    return-object v3

    .line 142
    :cond_0
    const-class v2, [C

    const/4 v5, 0x4

    if-ne p2, v2, :cond_3

    if-ne v1, v5, :cond_1

    .line 144
    invoke-virtual {v0}, Ll/۟۟ۡ;->۠()Ljava/lang/String;

    move-result-object p1

    .line 145
    invoke-virtual {v0, v4}, Ll/۟۟ۡ;->ۧ(I)V

    .line 146
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p2, 0x2

    if-ne v1, p2, :cond_2

    .line 150
    invoke-virtual {v0}, Ll/۟۟ۡ;->ܳ()Ljava/lang/Number;

    move-result-object p1

    .line 151
    invoke-virtual {v0, v4}, Ll/۟۟ۡ;->ۧ(I)V

    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    return-object p1

    .line 1380
    :cond_2
    invoke-virtual {p1, v3}, Ll/ۨ۟ۡ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 156
    invoke-static {p1}, Ll/ۚ۟ۡ;->ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    return-object p1

    :cond_3
    if-ne v1, v5, :cond_4

    .line 160
    invoke-virtual {v0}, Ll/۟۟ۡ;->֫()[B

    move-result-object p1

    .line 161
    invoke-virtual {v0, v4}, Ll/۟۟ۡ;->ۧ(I)V

    return-object p1

    .line 165
    :cond_4
    check-cast p2, Ljava/lang/Class;

    .line 166
    invoke-virtual {p2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p2

    .line 167
    new-instance v0, Ll/֨۟ۡ;

    invoke-direct {v0}, Ll/֨۟ۡ;-><init>()V

    .line 168
    invoke-virtual {p1, p2, v0, p3}, Ll/ۨ۟ۡ;->֫(Ljava/lang/reflect/Type;Ljava/util/Collection;Ljava/lang/Object;)V

    .line 170
    invoke-static {p1, p2, v0}, Ll/ۚ֫ܺ;->֫(Ll/ۨ۟ۡ;Ljava/lang/Class;Ll/֨۟ۡ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 10

    .line 45
    iget-object p4, p1, Ll/ۛ֫ܺ;->ۜ:Ll/ۜۧܺ;

    iget-object v0, p1, Ll/ۛ֫ܺ;->ܽ:Ll/᩻ۧܺ;

    .line 47
    move-object v1, p2

    check-cast v1, [Ljava/lang/Object;

    const-string v2, "[]"

    if-nez p2, :cond_1

    .line 50
    iget p1, p4, Ll/ۜۧܺ;->᩶:I

    sget-object p2, Ll/᩷ۧܺ;->ۜ֫:Ll/᩷ۧܺ;

    iget p2, p2, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr p1, p2

    if-eqz p1, :cond_0

    .line 51
    invoke-virtual {p4, v2}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    return-void

    .line 53
    :cond_0
    invoke-virtual {p4}, Ll/ۜۧܺ;->֫()V

    return-void

    .line 58
    :cond_1
    array-length v3, v1

    add-int/lit8 v4, v3, -0x1

    const/4 v5, -0x1

    if-ne v4, v5, :cond_2

    .line 63
    invoke-virtual {p4, v2}, Ll/ۜۧܺ;->append(Ljava/lang/CharSequence;)V

    return-void

    .line 67
    :cond_2
    iget-object v2, p1, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    .line 68
    invoke-virtual {p1, v2, p2, p3}, Ll/ۛ֫ܺ;->֫(Ll/ܳۧܺ;Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p2, 0x5b

    .line 73
    :try_start_0
    invoke-virtual {p4, p2}, Ll/ۜۧܺ;->write(I)V

    .line 75
    iget p2, p4, Ll/ۜۧܺ;->᩶:I

    sget-object p3, Ll/᩷ۧܺ;->ۛ:Ll/᩷ۧܺ;

    iget p3, p3, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr p2, p3

    const/16 p3, 0x5d

    const/16 v5, 0x2c

    const/4 v6, 0x0

    if-eqz p2, :cond_5

    .line 76
    invoke-virtual {p1}, Ll/ۛ֫ܺ;->ܽ()V

    .line 77
    invoke-virtual {p1}, Ll/ۛ֫ܺ;->ᩳ()V

    :goto_0
    if-ge v6, v3, :cond_4

    if-eqz v6, :cond_3

    .line 80
    invoke-virtual {p4, v5}, Ll/ۜۧܺ;->write(I)V

    .line 81
    invoke-virtual {p1}, Ll/ۛ֫ܺ;->ᩳ()V

    .line 83
    :cond_3
    aget-object p2, v1, v6

    invoke-virtual {p1, p2}, Ll/ۛ֫ܺ;->֫(Ljava/lang/Object;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 85
    :cond_4
    invoke-virtual {p1}, Ll/ۛ֫ܺ;->֫()V

    .line 86
    invoke-virtual {p1}, Ll/ۛ֫ܺ;->ᩳ()V

    .line 87
    invoke-virtual {p4, p3}, Ll/ۜۧܺ;->write(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    iput-object v2, p1, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    return-void

    :cond_5
    const/4 p2, 0x0

    move-object v3, p2

    move-object v7, v3

    :goto_1
    if-ge v6, v4, :cond_9

    .line 92
    :try_start_1
    aget-object v8, v1, v6

    if-nez v8, :cond_6

    const-string v8, "null,"

    .line 95
    invoke-virtual {p4, v8}, Ll/ۜۧܺ;->append(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 97
    :cond_6
    iget-object v9, p1, Ll/ۛ֫ܺ;->ۡ:Ljava/util/IdentityHashMap;

    if-eqz v9, :cond_7

    invoke-virtual {v9, v8}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    .line 98
    invoke-virtual {p1, v8}, Ll/ۛ֫ܺ;->ۧ(Ljava/lang/Object;)V

    goto :goto_2

    .line 100
    :cond_7
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    if-ne v9, v3, :cond_8

    .line 103
    invoke-interface {v7, p1, v8, p2, p2}, Ll/ܽۧܺ;->֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    goto :goto_2

    .line 106
    :cond_8
    invoke-virtual {v0, v9}, Ll/᩻ۧܺ;->֫(Ljava/lang/Class;)Ll/ܽۧܺ;

    move-result-object v7

    .line 108
    invoke-interface {v7, p1, v8, p2, p2}, Ll/ܽۧܺ;->֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    move-object v3, v9

    .line 111
    :goto_2
    invoke-virtual {p4, v5}, Ll/ۜۧܺ;->write(I)V

    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 115
    :cond_9
    aget-object v1, v1, v4

    if-nez v1, :cond_a

    const-string p2, "null]"

    .line 118
    invoke-virtual {p4, p2}, Ll/ۜۧܺ;->append(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 120
    :cond_a
    iget-object v3, p1, Ll/ۛ֫ܺ;->ۡ:Ljava/util/IdentityHashMap;

    if-eqz v3, :cond_b

    invoke-virtual {v3, v1}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 121
    invoke-virtual {p1, v1}, Ll/ۛ֫ܺ;->ۧ(Ljava/lang/Object;)V

    goto :goto_4

    .line 123
    :cond_b
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 287
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    .line 289
    invoke-virtual {v0, v4}, Ll/᩻ۧܺ;->֫(Ljava/lang/Class;)Ll/ܽۧܺ;

    move-result-object v0

    .line 291
    invoke-interface {v0, p1, v1, v3, p2}, Ll/ܽۧܺ;->֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 125
    :goto_4
    :try_start_3
    invoke-virtual {p4, p3}, Ll/ۜۧܺ;->write(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 128
    :goto_5
    iput-object v2, p1, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    return-void

    :catch_0
    move-exception p2

    .line 293
    :try_start_4
    new-instance p3, Ll/ܶ۟ۡ;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p4

    .line 29
    invoke-direct {p3, p4, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 293
    throw p3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception p2

    .line 128
    iput-object v2, p1, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    .line 129
    throw p2
.end method
