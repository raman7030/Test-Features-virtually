.class public final Ll/ۜ᩸֫;
.super Ljava/lang/Object;
.source "874P"

# interfaces
.implements Ll/ܳ᩸֫;


# static fields
.field public static final ܽ:Ll/ۜ᩸֫;


# instance fields
.field public ֫:I

.field public final ۧ:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 35
    new-instance v0, Ll/ۜ᩸֫;

    .line 36
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-direct {v0, v1}, Ll/ۜ᩸֫;-><init>(Ljava/util/Map;)V

    sput-object v0, Ll/ۜ᩸֫;->ܽ:Ll/ۜ᩸֫;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 43
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-direct {p0, v0}, Ll/ۜ᩸֫;-><init>(Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ᩸֫;->ۧ:Ljava/util/Map;

    return-void
.end method

.method public static ֫(Ljava/util/Map;Ljava/util/Map;)Z
    .locals 3

    .line 131
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    .line 134
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 135
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    .line 136
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 137
    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_1

    return v2

    :cond_2
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 112
    const-class v0, Ll/ۜ᩸֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 115
    :cond_1
    check-cast p1, Ll/ۜ᩸֫;

    iget-object p1, p1, Ll/ۜ᩸֫;->ۧ:Ljava/util/Map;

    iget-object v0, p0, Ll/ۜ᩸֫;->ۧ:Ljava/util/Map;

    invoke-static {v0, p1}, Ll/ۜ᩸֫;->֫(Ljava/util/Map;Ljava/util/Map;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 120
    iget v0, p0, Ll/ۜ᩸֫;->֫:I

    if-nez v0, :cond_1

    .line 122
    iget-object v0, p0, Ll/ۜ᩸֫;->ۧ:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 123
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    move-result v2

    xor-int/2addr v2, v3

    add-int/2addr v1, v2

    goto :goto_0

    .line 125
    :cond_0
    iput v1, p0, Ll/ۜ᩸֫;->֫:I

    .line 127
    :cond_1
    iget v0, p0, Ll/ۜ᩸֫;->֫:I

    return v0
.end method

.method public final ֫(JLjava/lang/String;)J
    .locals 1

    .line 94
    iget-object v0, p0, Ll/ۜ᩸֫;->ۧ:Ljava/util/Map;

    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [B

    if-eqz p3, :cond_0

    .line 96
    invoke-static {p3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide p1

    :cond_0
    return-wide p1
.end method

.method public final ֫()Ljava/util/Set;
    .locals 1

    .line 67
    iget-object v0, p0, Ll/ۜ᩸֫;->ۧ:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩻᩸֫;)Ll/ۜ᩸֫;
    .locals 7

    .line 146
    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Ll/ۜ᩸֫;->ۧ:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 147
    invoke-virtual {p1}, Ll/᩻᩸֫;->ۧ()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    .line 153
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_0

    .line 154
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 148
    :cond_0
    invoke-virtual {p1}, Ll/᩻᩸֫;->֫()Ljava/util/Map;

    move-result-object p1

    .line 159
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 160
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 165
    instance-of v4, v2, Ljava/lang/Long;

    if-eqz v4, :cond_1

    const/16 v4, 0x8

    .line 166
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v4

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    goto :goto_2

    .line 167
    :cond_1
    instance-of v4, v2, Ljava/lang/String;

    if-eqz v4, :cond_2

    .line 168
    check-cast v2, Ljava/lang/String;

    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v2, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    goto :goto_2

    .line 169
    :cond_2
    instance-of v4, v2, [B

    if-eqz v4, :cond_3

    .line 170
    check-cast v2, [B

    .line 160
    :goto_2
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 172
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 59
    :cond_4
    invoke-static {v1, v0}, Ll/ۜ᩸֫;->֫(Ljava/util/Map;Ljava/util/Map;)Z

    move-result p1

    if-eqz p1, :cond_5

    return-object p0

    .line 62
    :cond_5
    new-instance p1, Ll/ۜ᩸֫;

    invoke-direct {p1, v0}, Ll/ۜ᩸֫;-><init>(Ljava/util/Map;)V

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ۜ᩸֫;->ۧ:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 84
    iget-object v0, p0, Ll/ۜ᩸֫;->ۧ:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    if-eqz p1, :cond_0

    .line 86
    new-instance v0, Ljava/lang/String;

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
