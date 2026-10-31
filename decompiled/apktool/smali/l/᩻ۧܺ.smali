.class public final Ll/᩻ۧܺ;
.super Ljava/lang/Object;
.source "TAVS"


# static fields
.field public static final ۧ:Ll/᩻ۧܺ;


# instance fields
.field public final ֫:Ll/ۘۧܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Ll/᩻ۧܺ;

    invoke-direct {v0}, Ll/᩻ۧܺ;-><init>()V

    sput-object v0, Ll/᩻ۧܺ;->ۧ:Ll/᩻ۧܺ;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    new-instance v0, Ll/ۘۧܺ;

    invoke-direct {v0}, Ll/ۘۧܺ;-><init>()V

    iput-object v0, p0, Ll/᩻ۧܺ;->֫:Ll/ۘۧܺ;

    .line 82
    const-class v1, Ljava/lang/Boolean;

    sget-object v2, Ll/᩸֫ܺ;->֫:Ll/᩸֫ܺ;

    invoke-virtual {v0, v2, v1}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    .line 83
    sget-object v1, Ll/۟֫ܺ;->֫:Ll/۟֫ܺ;

    const-class v2, Ljava/lang/Character;

    invoke-virtual {v0, v1, v2}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    .line 84
    sget-object v2, Ll/۫֫ܺ;->֫:Ll/۫֫ܺ;

    const-class v3, Ljava/lang/Byte;

    invoke-virtual {v0, v2, v3}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    .line 85
    const-class v3, Ljava/lang/Short;

    invoke-virtual {v0, v2, v3}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    .line 86
    const-class v3, Ljava/lang/Integer;

    invoke-virtual {v0, v2, v3}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    .line 87
    const-class v3, Ljava/lang/Long;

    invoke-virtual {v0, v2, v3}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    .line 88
    sget-object v2, Ll/ۧۧܺ;->֫:Ll/ۧۧܺ;

    const-class v3, Ljava/lang/Float;

    invoke-virtual {v0, v2, v3}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    .line 89
    const-class v3, Ljava/lang/Double;

    invoke-virtual {v0, v2, v3}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    .line 90
    const-class v3, Ljava/lang/Number;

    invoke-virtual {v0, v2, v3}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    .line 91
    sget-object v2, Ll/ܶ֫ܺ;->֫:Ll/ܶ֫ܺ;

    const-class v3, Ljava/math/BigDecimal;

    invoke-virtual {v0, v2, v3}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    .line 92
    const-class v3, Ljava/math/BigInteger;

    invoke-virtual {v0, v2, v3}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    .line 93
    const-class v2, Ljava/lang/String;

    sget-object v3, Ll/ۢۧܺ;->֫:Ll/ۢۧܺ;

    invoke-virtual {v0, v3, v2}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    .line 94
    const-class v2, [Ljava/lang/Object;

    sget-object v3, Ll/ۚ֫ܺ;->֫:Ll/ۚ֫ܺ;

    invoke-virtual {v0, v3, v2}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    .line 95
    const-class v2, Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    .line 97
    const-class v2, Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, v1, v2}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    .line 98
    const-class v2, Ljava/util/Locale;

    invoke-virtual {v0, v1, v2}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    .line 99
    const-class v2, Ljava/util/Currency;

    invoke-virtual {v0, v1, v2}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    .line 100
    const-class v2, Ljava/util/TimeZone;

    invoke-virtual {v0, v1, v2}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    .line 101
    const-class v2, Ljava/util/UUID;

    invoke-virtual {v0, v1, v2}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    .line 102
    const-class v2, Ljava/net/URI;

    invoke-virtual {v0, v1, v2}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    .line 103
    const-class v2, Ljava/net/URL;

    invoke-virtual {v0, v1, v2}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    .line 104
    const-class v2, Ljava/util/regex/Pattern;

    invoke-virtual {v0, v1, v2}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    .line 105
    const-class v2, Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1, v2}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Class;)Ll/ܽۧܺ;
    .locals 10

    .line 109
    iget-object v0, p0, Ll/᩻ۧܺ;->֫:Ll/ۘۧܺ;

    invoke-virtual {v0, p1}, Ll/ۘۧܺ;->֫(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۧܺ;

    if-nez v1, :cond_17

    .line 113
    const-class v1, Ljava/util/Map;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 114
    new-instance v1, Ll/ܰ֫ܺ;

    .line 32
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 114
    invoke-virtual {v0, v1, p1}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    goto/16 :goto_7

    .line 115
    :cond_0
    const-class v1, Ljava/util/AbstractSequentialList;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    sget-object v2, Ll/᩹֫ܺ;->֫:Ll/᩹֫ܺ;

    if-eqz v1, :cond_1

    .line 116
    invoke-virtual {v0, v2, p1}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    goto/16 :goto_0

    .line 117
    :cond_1
    const-class v1, Ljava/util/List;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 118
    new-instance v1, Ll/᩺֫ܺ;

    .line 29
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 118
    invoke-virtual {v0, v1, p1}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    goto/16 :goto_7

    .line 119
    :cond_2
    const-class v1, Ljava/util/Collection;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 120
    invoke-virtual {v0, v2, p1}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    goto/16 :goto_0

    .line 121
    :cond_3
    const-class v1, Ljava/util/Date;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 122
    sget-object v1, Ll/᩶֫ܺ;->֫:Ll/᩶֫ܺ;

    invoke-virtual {v0, v1, p1}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    goto/16 :goto_7

    .line 123
    :cond_4
    const-class v1, Ll/۠۟ۡ;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    sget-object v2, Ll/۟֫ܺ;->֫:Ll/۟֫ܺ;

    if-eqz v1, :cond_5

    .line 124
    invoke-virtual {v0, v2, p1}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    goto/16 :goto_0

    .line 125
    :cond_5
    const-class v1, Ll/ۤ֫ܺ;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 126
    invoke-virtual {v0, v2, p1}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    goto/16 :goto_0

    .line 127
    :cond_6
    const-class v1, Ll/᩹۟ۡ;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 128
    invoke-virtual {v0, v2, p1}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    goto/16 :goto_0

    .line 129
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Class;->isEnum()Z

    move-result v1

    if-nez v1, :cond_16

    .line 130
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    if-eqz v1, :cond_8

    const-class v3, Ljava/lang/Object;

    if-eq v1, v3, :cond_8

    invoke-virtual {v1}, Ljava/lang/Class;->isEnum()Z

    move-result v1

    if-eqz v1, :cond_8

    goto/16 :goto_6

    .line 132
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 133
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    .line 134
    invoke-virtual {p0, v1}, Ll/᩻ۧܺ;->֫(Ljava/lang/Class;)Ll/ܽۧܺ;

    move-result-object v2

    .line 135
    new-instance v3, Ll/֨֫ܺ;

    invoke-direct {v3, v1, v2}, Ll/֨֫ܺ;-><init>(Ljava/lang/Class;Ll/ܽۧܺ;)V

    invoke-virtual {v0, v3, p1}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    move-object v1, v3

    goto/16 :goto_7

    .line 136
    :cond_9
    const-class v1, Ljava/lang/Throwable;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 137
    new-instance v1, Ll/ۨ֫ܺ;

    invoke-direct {v1, p1}, Ll/ۨ֫ܺ;-><init>(Ljava/lang/Class;)V

    .line 138
    iget v2, v1, Ll/ۨ֫ܺ;->֫:I

    sget-object v3, Ll/᩷ۧܺ;->ۧ֫:Ll/᩷ۧܺ;

    iget v3, v3, Ll/᩷ۧܺ;->᩸:I

    or-int/2addr v2, v3

    iput v2, v1, Ll/ۨ֫ܺ;->֫:I

    .line 139
    invoke-virtual {v0, v1, p1}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    goto/16 :goto_7

    .line 140
    :cond_a
    const-class v1, Ljava/util/TimeZone;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 141
    invoke-virtual {v0, v2, p1}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    goto :goto_0

    .line 142
    :cond_b
    const-class v1, Ljava/nio/charset/Charset;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 143
    invoke-virtual {v0, v2, p1}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    goto :goto_0

    .line 144
    :cond_c
    const-class v1, Ljava/util/Enumeration;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 145
    invoke-virtual {v0, v2, p1}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    :goto_0
    move-object v1, v2

    goto/16 :goto_7

    .line 146
    :cond_d
    const-class v1, Ljava/util/Calendar;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 147
    sget-object v1, Ll/᩶֫ܺ;->֫:Ll/᩶֫ܺ;

    invoke-virtual {v0, v1, p1}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    goto :goto_7

    .line 151
    :cond_e
    invoke-virtual {p1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v1

    array-length v3, v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v3, :cond_12

    aget-object v6, v1, v5

    .line 152
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    const-string v8, "net.sf.cglib.proxy.Factory"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    const/4 v8, 0x1

    if-nez v7, :cond_11

    .line 153
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    const-string v9, "org.springframework.cglib.proxy.Factory"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_f

    goto :goto_2

    .line 156
    :cond_f
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "javassist.util.proxy.ProxyObject"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_10

    goto :goto_3

    :cond_10
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_11
    :goto_2
    const/4 v4, 0x1

    :cond_12
    const/4 v8, 0x0

    :goto_3
    if-nez v4, :cond_15

    if-eqz v8, :cond_13

    goto :goto_5

    .line 170
    :cond_13
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "android.net.Uri$"

    .line 172
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_4

    .line 175
    :cond_14
    new-instance v2, Ll/ۨ֫ܺ;

    invoke-direct {v2, p1}, Ll/ۨ֫ܺ;-><init>(Ljava/lang/Class;)V

    .line 177
    :goto_4
    invoke-virtual {v0, v2, p1}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    goto :goto_0

    .line 163
    :cond_15
    :goto_5
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    .line 165
    invoke-virtual {p0, v1}, Ll/᩻ۧܺ;->֫(Ljava/lang/Class;)Ll/ܽۧܺ;

    move-result-object v1

    .line 166
    invoke-virtual {v0, v1, p1}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    return-object v1

    .line 131
    :cond_16
    :goto_6
    new-instance v1, Ll/ۙ֫ܺ;

    .line 24
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 131
    invoke-virtual {v0, v1, p1}, Ll/ۘۧܺ;->֫(Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    :goto_7
    if-nez v1, :cond_17

    .line 181
    invoke-virtual {v0, p1}, Ll/ۘۧܺ;->֫(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽۧܺ;

    return-object p1

    :cond_17
    return-object v1
.end method
