.class public abstract Lcom/umeng/analytics/pro/bf;
.super Ljava/lang/Object;
.source "Y48R"

# interfaces
.implements Lcom/umeng/analytics/pro/av;


# static fields
.field public static final c:Ljava/util/Map;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Lcom/umeng/analytics/pro/bc;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 49
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/umeng/analytics/pro/bf;->c:Ljava/util/Map;

    .line 51
    new-instance v1, Lcom/umeng/analytics/pro/bf$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/umeng/analytics/pro/bf$b;-><init>(Lcom/umeng/analytics/pro/bf$1;)V

    const-class v3, Lcom/umeng/analytics/pro/ce;

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    new-instance v1, Lcom/umeng/analytics/pro/bf$d;

    invoke-direct {v1, v2}, Lcom/umeng/analytics/pro/bf$d;-><init>(Lcom/umeng/analytics/pro/bf$1;)V

    const-class v2, Lcom/umeng/analytics/pro/cf;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Lcom/umeng/analytics/pro/bf;->b:Lcom/umeng/analytics/pro/bc;

    .line 46
    iput-object v0, p0, Lcom/umeng/analytics/pro/bf;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/umeng/analytics/pro/bc;Ljava/lang/Object;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/bf;->a(Lcom/umeng/analytics/pro/bc;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lcom/umeng/analytics/pro/bf;)V
    .locals 2

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    iget-object v0, p1, Lcom/umeng/analytics/pro/bf;->b:Lcom/umeng/analytics/pro/bc;

    iput-object v0, p0, Lcom/umeng/analytics/pro/bf;->b:Lcom/umeng/analytics/pro/bc;

    .line 64
    iget-object p1, p1, Lcom/umeng/analytics/pro/bf;->a:Ljava/lang/Object;

    invoke-static {p1}, Lcom/umeng/analytics/pro/bf;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/umeng/analytics/pro/bf;->a:Ljava/lang/Object;

    return-void

    .line 61
    :cond_0
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
.end method

.method public static a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 68
    instance-of v0, p0, Lcom/umeng/analytics/pro/av;

    if-eqz v0, :cond_0

    .line 69
    check-cast p0, Lcom/umeng/analytics/pro/av;

    invoke-interface {p0}, Lcom/umeng/analytics/pro/av;->deepCopy()Lcom/umeng/analytics/pro/av;

    move-result-object p0

    return-object p0

    .line 70
    :cond_0
    instance-of v0, p0, Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_1

    .line 71
    check-cast p0, Ljava/nio/ByteBuffer;

    invoke-static {p0}, Lcom/umeng/analytics/pro/aw;->d(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p0

    return-object p0

    .line 72
    :cond_1
    instance-of v0, p0, Ljava/util/List;

    if-eqz v0, :cond_2

    .line 73
    check-cast p0, Ljava/util/List;

    invoke-static {p0}, Lcom/umeng/analytics/pro/bf;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0

    .line 74
    :cond_2
    instance-of v0, p0, Ljava/util/Set;

    if-eqz v0, :cond_3

    .line 75
    check-cast p0, Ljava/util/Set;

    invoke-static {p0}, Lcom/umeng/analytics/pro/bf;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    .line 76
    :cond_3
    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_4

    .line 77
    check-cast p0, Ljava/util/Map;

    invoke-static {p0}, Lcom/umeng/analytics/pro/bf;->a(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    :cond_4
    return-object p0
.end method

.method public static a(Ljava/util/List;)Ljava/util/List;
    .locals 2

    .line 100
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 101
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 102
    invoke-static {v1}, Lcom/umeng/analytics/pro/bf;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static a(Ljava/util/Map;)Ljava/util/Map;
    .locals 3

    .line 84
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 85
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 86
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/umeng/analytics/pro/bf;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/umeng/analytics/pro/bf;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static a(Ljava/util/Set;)Ljava/util/Set;
    .locals 2

    .line 92
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 93
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 94
    invoke-static {v1}, Lcom/umeng/analytics/pro/bf;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()Lcom/umeng/analytics/pro/bc;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/umeng/analytics/pro/bf;->b:Lcom/umeng/analytics/pro/bc;

    return-object v0
.end method

.method public abstract a(S)Lcom/umeng/analytics/pro/bc;
.end method

.method public a(I)Ljava/lang/Object;
    .locals 0

    int-to-short p1, p1

    .line 124
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bf;->a(S)Lcom/umeng/analytics/pro/bc;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bf;->a(Lcom/umeng/analytics/pro/bc;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/umeng/analytics/pro/bc;)Ljava/lang/Object;
    .locals 3

    .line 116
    iget-object v0, p0, Lcom/umeng/analytics/pro/bf;->b:Lcom/umeng/analytics/pro/bc;

    if-ne p1, v0, :cond_0

    .line 120
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bf;->b()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 117
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot get the value of field "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " because union\'s set field is "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/umeng/analytics/pro/bf;->b:Lcom/umeng/analytics/pro/bc;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract a(Lcom/umeng/analytics/pro/bu;Lcom/umeng/analytics/pro/bp;)Ljava/lang/Object;
.end method

.method public abstract a(Lcom/umeng/analytics/pro/bu;S)Ljava/lang/Object;
.end method

.method public a(ILjava/lang/Object;)V
    .locals 0

    int-to-short p1, p1

    .line 150
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bf;->a(S)Lcom/umeng/analytics/pro/bc;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/bf;->a(Lcom/umeng/analytics/pro/bc;Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lcom/umeng/analytics/pro/bc;Ljava/lang/Object;)V
    .locals 0

    .line 144
    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/bf;->b(Lcom/umeng/analytics/pro/bc;Ljava/lang/Object;)V

    .line 145
    iput-object p1, p0, Lcom/umeng/analytics/pro/bf;->b:Lcom/umeng/analytics/pro/bc;

    .line 146
    iput-object p2, p0, Lcom/umeng/analytics/pro/bf;->a:Ljava/lang/Object;

    return-void
.end method

.method public abstract a(Lcom/umeng/analytics/pro/bu;)V
.end method

.method public b()Ljava/lang/Object;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/umeng/analytics/pro/bf;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public abstract b(Lcom/umeng/analytics/pro/bc;Ljava/lang/Object;)V
.end method

.method public abstract b(Lcom/umeng/analytics/pro/bu;)V
.end method

.method public b(I)Z
    .locals 0

    int-to-short p1, p1

    .line 136
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bf;->a(S)Lcom/umeng/analytics/pro/bc;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/bf;->b(Lcom/umeng/analytics/pro/bc;)Z

    move-result p1

    return p1
.end method

.method public b(Lcom/umeng/analytics/pro/bc;)Z
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/umeng/analytics/pro/bf;->b:Lcom/umeng/analytics/pro/bc;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public abstract c(Lcom/umeng/analytics/pro/bc;)Lcom/umeng/analytics/pro/bp;
.end method

.method public c()Z
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/umeng/analytics/pro/bf;->b:Lcom/umeng/analytics/pro/bc;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final clear()V
    .locals 1

    const/4 v0, 0x0

    .line 205
    iput-object v0, p0, Lcom/umeng/analytics/pro/bf;->b:Lcom/umeng/analytics/pro/bc;

    .line 206
    iput-object v0, p0, Lcom/umeng/analytics/pro/bf;->a:Ljava/lang/Object;

    return-void
.end method

.method public abstract d()Lcom/umeng/analytics/pro/bz;
.end method

.method public read(Lcom/umeng/analytics/pro/bu;)V
    .locals 2

    .line 140
    sget-object v0, Lcom/umeng/analytics/pro/bf;->c:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->D()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/umeng/analytics/pro/cd;

    invoke-interface {v0}, Lcom/umeng/analytics/pro/cd;->b()Lcom/umeng/analytics/pro/cc;

    move-result-object v0

    invoke-interface {v0, p1, p0}, Lcom/umeng/analytics/pro/cc;->b(Lcom/umeng/analytics/pro/bu;Lcom/umeng/analytics/pro/av;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const-string v0, "<"

    .line 0
    invoke-static {v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 187
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    .line 188
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bf;->a()Lcom/umeng/analytics/pro/bc;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 191
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bf;->b()Ljava/lang/Object;

    move-result-object v1

    .line 192
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/bf;->a()Lcom/umeng/analytics/pro/bc;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/umeng/analytics/pro/bf;->c(Lcom/umeng/analytics/pro/bc;)Lcom/umeng/analytics/pro/bp;

    move-result-object v2

    iget-object v2, v2, Lcom/umeng/analytics/pro/bp;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    .line 193
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    instance-of v2, v1, Ljava/nio/ByteBuffer;

    if-eqz v2, :cond_0

    .line 195
    check-cast v1, Ljava/nio/ByteBuffer;

    invoke-static {v1, v0}, Lcom/umeng/analytics/pro/aw;->a(Ljava/nio/ByteBuffer;Ljava/lang/StringBuilder;)V

    goto :goto_0

    .line 197
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    :goto_0
    const-string v1, ">"

    .line 200
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public write(Lcom/umeng/analytics/pro/bu;)V
    .locals 2

    .line 154
    sget-object v0, Lcom/umeng/analytics/pro/bf;->c:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->D()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/umeng/analytics/pro/cd;

    invoke-interface {v0}, Lcom/umeng/analytics/pro/cd;->b()Lcom/umeng/analytics/pro/cc;

    move-result-object v0

    invoke-interface {v0, p1, p0}, Lcom/umeng/analytics/pro/cc;->a(Lcom/umeng/analytics/pro/bu;Lcom/umeng/analytics/pro/av;)V

    return-void
.end method
