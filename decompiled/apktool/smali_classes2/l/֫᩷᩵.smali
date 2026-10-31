.class public final Ll/֫᩷᩵;
.super Ljava/io/ByteArrayInputStream;
.source "J9YE"

# interfaces
.implements Ll/ܶ֨ᩴ;
.implements Ll/֡֨ᩴ;


# static fields
.field public static ᩹:Ll/֫᩻֨;


# instance fields
.field public final ᩸:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 37
    const-class v0, Ll/֫᩷᩵;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/String;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/֫᩷᩵;->᩹:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 1

    const/4 v0, 0x0

    .line 51
    invoke-direct {p0, p1, v0, p2}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    .line 52
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/֫᩷᩵;->᩸:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 8

    .line 120
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 121
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    .line 123
    :goto_0
    iget-object v3, p0, Ll/֫᩷᩵;->᩸:Ljava/util/HashMap;

    if-nez v2, :cond_7

    .line 124
    invoke-virtual {p0}, Ll/֫᩷᩵;->ܽ()I

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_3

    .line 129
    :cond_0
    sget-object v5, Ll/۟ۜ᩵;->֫:[I

    invoke-static {v4}, Ll/۫ۢ᩵;->֫(I)Ll/۫ۢ᩵;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v5, v5, v6

    const/4 v6, 0x1

    if-eq v5, v6, :cond_5

    const/4 v6, 0x2

    sget-object v7, Ll/֫᩷᩵;->᩹:Ll/֫᩻֨;

    if-eq v5, v6, :cond_2

    const/4 v3, 0x3

    if-eq v5, v3, :cond_1

    and-int/lit16 v3, v4, 0xc0

    .line 161
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Unsupported DNS label type: \'{}\'"

    invoke-interface {v7, v3, v4}, Ll/֫᩻֨;->ᩳ(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v3, "Extended label are not currently supported."

    .line 157
    invoke-interface {v7, v3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    goto :goto_0

    .line 140
    :cond_2
    invoke-static {v4}, Ll/۫ۢ᩵;->ۧ(I)I

    move-result v2

    shl-int/lit8 v2, v2, 0x8

    invoke-virtual {p0}, Ll/֫᩷᩵;->ܽ()I

    move-result v4

    or-int/2addr v2, v4

    .line 141
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_3

    .line 144
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Ljava/io/ByteArrayInputStream;->pos:I

    sub-int/2addr v3, v6

    .line 145
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Bad domain name: possible circular name detected. Bad offset: 0x{} at 0x{}"

    .line 143
    invoke-interface {v7, v4, v2, v3}, Ll/֫᩻֨;->ܽ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, ""

    .line 149
    :cond_3
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/StringBuilder;

    .line 151
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_4
    const/4 v2, 0x1

    goto :goto_0

    .line 131
    :cond_5
    iget v3, p0, Ljava/io/ByteArrayInputStream;->pos:I

    sub-int/2addr v3, v6

    .line 132
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v4}, Ll/֫᩷᩵;->֫(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "."

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 133
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/StringBuilder;

    .line 135
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 137
    :cond_6
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 164
    :cond_7
    :goto_3
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 165
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    .line 166
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 168
    :cond_8
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)Ljava/lang/String;
    .locals 4

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    .line 80
    invoke-virtual {p0}, Ll/֫᩷᩵;->ܽ()I

    move-result v2

    shr-int/lit8 v3, v2, 0x4

    packed-switch v3, :pswitch_data_0

    :pswitch_0
    and-int/lit8 v2, v2, 0x3f

    shl-int/lit8 v2, v2, 0x4

    .line 106
    invoke-virtual {p0}, Ll/֫᩷᩵;->ܽ()I

    move-result v3

    and-int/lit8 v3, v3, 0xf

    goto :goto_1

    :pswitch_1
    and-int/lit8 v2, v2, 0xf

    shl-int/lit8 v2, v2, 0xc

    .line 100
    invoke-virtual {p0}, Ll/֫᩷᩵;->ܽ()I

    move-result v3

    and-int/lit8 v3, v3, 0x3f

    shl-int/lit8 v3, v3, 0x6

    or-int/2addr v2, v3

    invoke-virtual {p0}, Ll/֫᩷᩵;->ܽ()I

    move-result v3

    and-int/lit8 v3, v3, 0x3f

    or-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x2

    goto :goto_2

    :pswitch_2
    and-int/lit8 v2, v2, 0x1f

    shl-int/lit8 v2, v2, 0x6

    .line 95
    invoke-virtual {p0}, Ll/֫᩷᩵;->ܽ()I

    move-result v3

    and-int/lit8 v3, v3, 0x3f

    :goto_1
    or-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    :goto_2
    :pswitch_3
    int-to-char v2, v2

    .line 110
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 112
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final ܽ()I
    .locals 1

    .line 60
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final ᩳ()I
    .locals 2

    .line 64
    invoke-virtual {p0}, Ll/֫᩷᩵;->ܽ()I

    move-result v0

    shl-int/lit8 v0, v0, 0x8

    invoke-virtual {p0}, Ll/֫᩷᩵;->ܽ()I

    move-result v1

    or-int/2addr v0, v1

    return v0
.end method
