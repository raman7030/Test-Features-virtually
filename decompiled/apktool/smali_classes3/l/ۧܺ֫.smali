.class public final Ll/ۧܺ֫;
.super Ljava/lang/Object;
.source "M1H2"


# static fields
.field public static final synthetic ܳ:I

.field public static final ᩻:[Ljava/lang/Class;


# instance fields
.field public final ֫:Ljava/util/LinkedHashMap;

.field public final ۧ:Ljava/util/LinkedHashMap;

.field public final ܽ:Ljava/util/LinkedHashMap;

.field public final ܿ:Ljava/util/LinkedHashMap;

.field public final ᩳ:Ll/۠۫ۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x1d

    new-array v0, v0, [Ljava/lang/Class;

    .line 443
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, [Z

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-class v1, [D

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-class v1, [I

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-class v1, [J

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-class v1, Ljava/lang/String;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-class v1, [Ljava/lang/String;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-class v1, Landroid/os/Binder;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-class v1, Landroid/os/Bundle;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-class v1, [B

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-class v1, [C

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-class v1, Ljava/lang/CharSequence;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-class v1, [Ljava/lang/CharSequence;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-class v1, Ljava/util/ArrayList;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    const-class v1, [F

    const/16 v2, 0x14

    aput-object v1, v0, v2

    const-class v1, Landroid/os/Parcelable;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    const-class v1, [Landroid/os/Parcelable;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    const-class v1, Ljava/io/Serializable;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    const-class v1, [S

    const/16 v2, 0x19

    aput-object v1, v0, v2

    const-class v1, Landroid/util/SparseArray;

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    const-class v1, Landroid/util/Size;

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    const-class v1, Landroid/util/SizeF;

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    .line 410
    sput-object v0, Ll/ۧܺ֫;->᩻:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ۧܺ֫;->ܽ:Ljava/util/LinkedHashMap;

    .line 52
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ۧܺ֫;->ܿ:Ljava/util/LinkedHashMap;

    .line 53
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ۧܺ֫;->ۧ:Ljava/util/LinkedHashMap;

    .line 54
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ۧܺ֫;->֫:Ljava/util/LinkedHashMap;

    .line 56
    new-instance v0, Ll/۟ۡ֫;

    invoke-direct {v0, p0}, Ll/۟ۡ֫;-><init>(Ll/ۧܺ֫;)V

    iput-object v0, p0, Ll/ۧܺ֫;->ᩳ:Ll/۠۫ۧ;

    return-void
.end method

.method public constructor <init>(Ljava/util/HashMap;)V
    .locals 2

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ۧܺ֫;->ܽ:Ljava/util/LinkedHashMap;

    .line 52
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Ll/ۧܺ֫;->ܿ:Ljava/util/LinkedHashMap;

    .line 53
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Ll/ۧܺ֫;->ۧ:Ljava/util/LinkedHashMap;

    .line 54
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Ll/ۧܺ֫;->֫:Ljava/util/LinkedHashMap;

    .line 56
    new-instance v1, Ll/۟ۡ֫;

    invoke-direct {v1, p0}, Ll/۟ۡ֫;-><init>(Ll/ۧܺ֫;)V

    iput-object v1, p0, Ll/ۧܺ֫;->ᩳ:Ll/۠۫ۧ;

    .line 81
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public static ֫(Ll/ۧܺ֫;)Landroid/os/Bundle;
    .locals 6

    .line 0
    iget-object v0, p0, Ll/ۧܺ֫;->ܽ:Ljava/util/LinkedHashMap;

    .line 59
    iget-object v1, p0, Ll/ۧܺ֫;->ܿ:Ljava/util/LinkedHashMap;

    invoke-static {v1}, Ll/֡ܶ᩵;->֫(Ljava/util/LinkedHashMap;)Ljava/util/Map;

    move-result-object v1

    .line 60
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠۫ۧ;

    .line 61
    invoke-interface {v2}, Ll/۠۫ۧ;->֫()Landroid/os/Bundle;

    move-result-object v2

    const-string v5, "key"

    .line 0
    invoke-static {v4, v5}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    const/16 v5, 0x1d

    if-ge v3, v5, :cond_5

    .line 401
    sget-object v5, Ll/ۧܺ֫;->᩻:[Ljava/lang/Class;

    aget-object v5, v5, v3

    .line 402
    invoke-static {v5}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-virtual {v5, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 254
    :goto_2
    iget-object v3, p0, Ll/ۧܺ֫;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v3, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ll/ۚۡ֫;

    if-eqz v5, :cond_1

    check-cast v3, Ll/ۚۡ֫;

    goto :goto_3

    :cond_1
    const/4 v3, 0x0

    :goto_3
    if-eqz v3, :cond_2

    .line 257
    invoke-virtual {v3, v2}, Ll/ۚۡ֫;->ۧ(Ljava/lang/Object;)V

    goto :goto_4

    .line 259
    :cond_2
    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    :goto_4
    iget-object v2, p0, Ll/ۧܺ֫;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶۤ᩵;

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {v2}, Ll/ܶۤ᩵;->ܽ()V

    goto :goto_0

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 249
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 250
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Can\'t put value with type "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " into saved state"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 249
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 65
    :cond_6
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object p0

    .line 66
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 67
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 69
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 44
    :cond_7
    new-instance p0, Ll/ܺ۠᩵;

    const-string v0, "keys"

    invoke-direct {p0, v0, v1}, Ll/ܺ۠᩵;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ll/ܺ۠᩵;

    const-string v1, "values"

    invoke-direct {v0, v1, v2}, Ll/ܺ۠᩵;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v1, 0x2

    new-array v1, v1, [Ll/ܺ۠᩵;

    aput-object p0, v1, v3

    const/4 p0, 0x1

    aput-object v0, v1, p0

    .line 72
    invoke-static {v1}, Ll/ܿ۫;->֫([Ll/ܺ۠᩵;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/۠۫ۧ;
    .locals 1

    .line 91
    iget-object v0, p0, Ll/ۧܺ֫;->ᩳ:Ll/۠۫ۧ;

    return-object v0
.end method
