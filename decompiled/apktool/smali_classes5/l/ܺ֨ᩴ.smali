.class public final Ll/ܺ֨ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/᩷۠ᩴ;


# static fields
.field public static final h:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Ll/۟֨ᩴ;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/util/List;

.field public final d:Z

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public volatile g:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "/+"

    .line 52
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ܺ֨ᩴ;->h:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ll/۟֨ᩴ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const-string v0, "/"

    .line 66
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    .line 85
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p2, ""

    .line 86
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    goto :goto_0

    .line 88
    :cond_0
    sget-object v0, Ll/ܺ֨ᩴ;->h:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p2}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ll/᩹۬ᩴ;->stream([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    new-instance v0, Ll/ۡ֨ᩴ;

    const/4 v1, 0x0

    .line 0
    invoke-direct {v0, v1}, Ll/ۡ֨ᩴ;-><init>(I)V

    .line 89
    invoke-interface {p2, v0}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    .line 90
    invoke-static {}, Ll/᩺ۨᩴ;->toUnmodifiableList()Ll/ۨۨᩴ;

    move-result-object v0

    invoke-interface {p2, v0}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    :goto_0
    move-object v4, p2

    move-object v1, p0

    move-object v2, p1

    move-object v5, p3

    move-object v6, p4

    .line 66
    invoke-direct/range {v1 .. v6}, Ll/ܺ֨ᩴ;-><init>(Ll/۟֨ᩴ;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ll/۟֨ᩴ;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object p1, p0, Ll/ܺ֨ᩴ;->a:Ll/۟֨ᩴ;

    .line 76
    iput-boolean p2, p0, Ll/ܺ֨ᩴ;->d:Z

    .line 77
    iput-object p3, p0, Ll/ܺ֨ᩴ;->c:Ljava/util/List;

    .line 94
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p2, :cond_0

    const-string p2, "/"

    goto :goto_0

    :cond_0
    const-string p2, ""

    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p3}, Ll/᩺ۚᩴ;->A(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 79
    iput-object p1, p0, Ll/ܺ֨ᩴ;->b:Ljava/lang/String;

    .line 80
    iput-object p4, p0, Ll/ܺ֨ᩴ;->e:Ljava/lang/String;

    .line 81
    iput-object p5, p0, Ll/ܺ֨ᩴ;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final C()Ll/ܺ֨ᩴ;
    .locals 4

    .line 104
    iget-boolean v0, p0, Ll/ܺ֨ᩴ;->d:Z

    if-eqz v0, :cond_0

    return-object p0

    .line 117
    :cond_0
    new-instance v0, Ll/ܺ֨ᩴ;

    .line 99
    iget-object v1, p0, Ll/ܺ֨ᩴ;->a:Ll/۟֨ᩴ;

    .line 117
    iget-object v2, p0, Ll/ܺ֨ᩴ;->e:Ljava/lang/String;

    iget-object v3, p0, Ll/ܺ֨ᩴ;->f:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v2, v3}, Ll/ܺ֨ᩴ;-><init>(Ll/۟֨ᩴ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    invoke-virtual {v0, p0}, Ll/ܺ֨ᩴ;->n(Ll/᩷۠ᩴ;)Ll/ܺ֨ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 49
    check-cast p1, Ll/᩷۠ᩴ;

    invoke-virtual {p0, p1}, Ll/ܺ֨ᩴ;->compareTo(Ll/᩷۠ᩴ;)I

    move-result p1

    return p1
.end method

.method public final compareTo(Ll/᩷۠ᩴ;)I
    .locals 1

    .line 232
    iget-object v0, p0, Ll/ܺ֨ᩴ;->b:Ljava/lang/String;

    check-cast p1, Ll/ܺ֨ᩴ;

    iget-object p1, p1, Ll/ܺ֨ᩴ;->b:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final endsWith(Ljava/lang/String;)Z
    .locals 4

    .line 192
    new-instance v0, Ll/ܺ֨ᩴ;

    iget-object v1, p0, Ll/ܺ֨ᩴ;->a:Ll/۟֨ᩴ;

    iget-object v2, p0, Ll/ܺ֨ᩴ;->e:Ljava/lang/String;

    iget-object v3, p0, Ll/ܺ֨ᩴ;->f:Ljava/lang/String;

    invoke-direct {v0, v1, p1, v2, v3}, Ll/ܺ֨ᩴ;-><init>(Ll/۟֨ᩴ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ll/ܺ֨ᩴ;->endsWith(Ll/᩷۠ᩴ;)Z

    move-result p1

    return p1
.end method

.method public final endsWith(Ll/᩷۠ᩴ;)Z
    .locals 6

    .line 197
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    instance-of v0, p1, Ll/ܺ֨ᩴ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 201
    :cond_0
    move-object v0, p1

    check-cast v0, Ll/ܺ֨ᩴ;

    .line 104
    iget-boolean v2, v0, Ll/ܺ֨ᩴ;->d:Z

    if-eqz v2, :cond_1

    .line 202
    invoke-virtual {p0, p1}, Ll/ܺ֨ᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 143
    :cond_1
    iget-object p1, v0, Ll/ܺ֨ᩴ;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iget-object v2, p0, Ll/ܺ֨ᩴ;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v2, p1, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Ll/ܺ֨ᩴ;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v3, p1, -0x1

    :goto_0
    if-ltz v3, :cond_4

    sub-int v4, v3, p1

    add-int/2addr v4, v2

    .line 210
    invoke-virtual {p0, v4}, Ll/ܺ֨ᩴ;->l(I)Ll/ܺ֨ᩴ;

    move-result-object v4

    .line 49
    invoke-virtual {v0, v3}, Ll/ܺ֨ᩴ;->l(I)Ll/ܺ֨ᩴ;

    move-result-object v5

    .line 210
    invoke-virtual {v4, v5}, Ll/ܺ֨ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    return v1

    :cond_3
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :cond_4
    const/4 p1, 0x1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 219
    instance-of v0, p1, Ll/ܺ֨ᩴ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 222
    :cond_0
    check-cast p1, Ll/ܺ֨ᩴ;

    invoke-virtual {p0, p1}, Ll/ܺ֨ᩴ;->compareTo(Ll/᩷۠ᩴ;)I

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final getFileName()Ll/᩷۠ᩴ;
    .locals 5

    .line 122
    iget-object v0, p0, Ll/ܺ֨ᩴ;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 123
    iget-boolean v0, p0, Ll/ܺ֨ᩴ;->d:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    return-object p0

    .line 124
    :cond_1
    new-instance v0, Ll/ܺ֨ᩴ;

    iget-object v1, p0, Ll/ܺ֨ᩴ;->a:Ll/۟֨ᩴ;

    iget-object v2, p0, Ll/ܺ֨ᩴ;->c:Ljava/util/List;

    .line 143
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    .line 124
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Ll/ܺ֨ᩴ;->e:Ljava/lang/String;

    iget-object v4, p0, Ll/ܺ֨ᩴ;->f:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ܺ֨ᩴ;-><init>(Ll/۟֨ᩴ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getFileSystem()Ll/۟֨ᩴ;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ܺ֨ᩴ;->a:Ll/۟֨ᩴ;

    return-object v0
.end method

.method public final bridge synthetic getName(I)Ll/᩷۠ᩴ;
    .locals 0

    .line 49
    invoke-virtual {p0, p1}, Ll/ܺ֨ᩴ;->l(I)Ll/ܺ֨ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final getNameCount()I
    .locals 1

    .line 143
    iget-object v0, p0, Ll/ܺ֨ᩴ;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic getParent()Ll/᩷۠ᩴ;
    .locals 1

    .line 49
    invoke-virtual {p0}, Ll/ܺ֨ᩴ;->m()Ll/ܺ֨ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final getRoot()Ll/᩷۠ᩴ;
    .locals 4

    .line 104
    iget-boolean v0, p0, Ll/ܺ֨ᩴ;->d:Z

    if-eqz v0, :cond_0

    .line 110
    new-instance v0, Ll/ܺ֨ᩴ;

    .line 99
    iget-object v1, p0, Ll/ܺ֨ᩴ;->a:Ll/۟֨ᩴ;

    .line 110
    iget-object v2, p0, Ll/ܺ֨ᩴ;->f:Ljava/lang/String;

    iget-object v3, p0, Ll/ܺ֨ᩴ;->e:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v2}, Ll/ܺ֨ᩴ;-><init>(Ll/۟֨ᩴ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 227
    iget-object v0, p0, Ll/ܺ֨ᩴ;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final isAbsolute()Z
    .locals 1

    .line 104
    iget-boolean v0, p0, Ll/ܺ֨ᩴ;->d:Z

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 918
    new-instance v0, Ll/᩺᩸ᩴ;

    invoke-direct {v0, p0}, Ll/᩺᩸ᩴ;-><init>(Ll/ܺ֨ᩴ;)V

    return-object v0
.end method

.method public final l(I)Ll/ܺ֨ᩴ;
    .locals 4

    if-ltz p1, :cond_0

    .line 143
    iget-object v0, p0, Ll/ܺ֨ᩴ;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 152
    new-instance v0, Ll/ܺ֨ᩴ;

    iget-object v1, p0, Ll/ܺ֨ᩴ;->a:Ll/۟֨ᩴ;

    iget-object v2, p0, Ll/ܺ֨ᩴ;->c:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v2, p0, Ll/ܺ֨ᩴ;->e:Ljava/lang/String;

    iget-object v3, p0, Ll/ܺ֨ᩴ;->f:Ljava/lang/String;

    invoke-direct {v0, v1, p1, v2, v3}, Ll/ܺ֨ᩴ;-><init>(Ll/۟֨ᩴ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 149
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 150
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p0, v1, p1

    const-string p1, "Requested name for index (%d) is out of bound in \n%s."

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final m()Ll/ܺ֨ᩴ;
    .locals 5

    .line 143
    iget-object v0, p0, Ll/ܺ֨ᩴ;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 130
    iget-boolean v2, p0, Ll/ܺ֨ᩴ;->d:Z

    if-nez v2, :cond_0

    goto :goto_0

    .line 133
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    iget-boolean v3, p0, Ll/ܺ֨ᩴ;->d:Z

    if-eqz v3, :cond_1

    const-string v3, "/"

    .line 135
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    sub-int/2addr v0, v1

    .line 161
    iget-object v1, p0, Ll/ܺ֨ᩴ;->c:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v1, v3, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/᩺ۚᩴ;->A(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    .line 137
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 138
    new-instance v1, Ll/ܺ֨ᩴ;

    iget-object v2, p0, Ll/ܺ֨ᩴ;->a:Ll/۟֨ᩴ;

    iget-object v3, p0, Ll/ܺ֨ᩴ;->e:Ljava/lang/String;

    iget-object v4, p0, Ll/ܺ֨ᩴ;->f:Ljava/lang/String;

    invoke-direct {v1, v2, v0, v3, v4}, Ll/ܺ֨ᩴ;-><init>(Ll/۟֨ᩴ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final n(Ll/᩷۠ᩴ;)Ll/ܺ֨ᩴ;
    .locals 4

    .line 256
    instance-of v0, p1, Ll/ܺ֨ᩴ;

    if-eqz v0, :cond_1

    .line 264
    move-object v0, p1

    check-cast v0, Ll/ܺ֨ᩴ;

    .line 104
    iget-boolean v0, v0, Ll/ܺ֨ᩴ;->d:Z

    if-eqz v0, :cond_0

    .line 265
    check-cast p1, Ll/ܺ֨ᩴ;

    return-object p1

    .line 267
    :cond_0
    new-instance v0, Ll/ܺ֨ᩴ;

    iget-object v1, p0, Ll/ܺ֨ᩴ;->a:Ll/۟֨ᩴ;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Ll/ܺ֨ᩴ;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Ll/ܺ֨ᩴ;->e:Ljava/lang/String;

    iget-object v3, p0, Ll/ܺ֨ᩴ;->f:Ljava/lang/String;

    invoke-direct {v0, v1, p1, v2, v3}, Ll/ܺ֨ᩴ;-><init>(Ll/۟֨ᩴ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 257
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 261
    invoke-interface {p1}, Ll/᩷۠ᩴ;->getFileSystem()Ll/۟֨ᩴ;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object v1, v2, p1

    const-string p1, "Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s)."

    .line 258
    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final normalize()Ll/᩷۠ᩴ;
    .locals 5

    .line 237
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 238
    iget-object v1, p0, Ll/ܺ֨ᩴ;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 239
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, ".."

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 246
    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 243
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    goto :goto_0

    .line 250
    :cond_2
    new-instance v1, Ll/ܺ֨ᩴ;

    iget-object v2, p0, Ll/ܺ֨ᩴ;->a:Ll/۟֨ᩴ;

    iget-boolean v3, p0, Ll/ܺ֨ᩴ;->d:Z

    .line 94
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz v3, :cond_3

    const-string v3, "/"

    goto :goto_1

    :cond_3
    const-string v3, ""

    :goto_1
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ll/᩺ۚᩴ;->A(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 251
    iget-object v3, p0, Ll/ܺ֨ᩴ;->e:Ljava/lang/String;

    iget-object v4, p0, Ll/ܺ֨ᩴ;->f:Ljava/lang/String;

    invoke-direct {v1, v2, v0, v3, v4}, Ll/ܺ֨ᩴ;-><init>(Ll/۟֨ᩴ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public final varargs register(Ll/ۚ۠ᩴ;[Ll/ᩴ۠ᩴ;)Ll/֡۠ᩴ;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ll/᩵۠ᩴ;

    .line 894
    invoke-virtual {p0, p1, p2, v0}, Ll/ܺ֨ᩴ;->register(Ll/ۚ۠ᩴ;[Ll/ᩴ۠ᩴ;[Ll/᩵۠ᩴ;)Ll/֡۠ᩴ;

    const/4 p1, 0x0

    throw p1
.end method

.method public final varargs register(Ll/ۚ۠ᩴ;[Ll/ᩴ۠ᩴ;[Ll/᩵۠ᩴ;)Ll/֡۠ᩴ;
    .locals 0

    .line 372
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Watch Service is not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final relativize(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;
    .locals 9

    .line 290
    instance-of v0, p1, Ll/ܺ֨ᩴ;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 104
    iget-boolean v0, p0, Ll/ܺ֨ᩴ;->d:Z

    .line 298
    move-object v2, p1

    check-cast v2, Ll/ܺ֨ᩴ;

    .line 104
    iget-boolean v2, v2, Ll/ܺ֨ᩴ;->d:Z

    if-ne v0, v2, :cond_3

    .line 302
    check-cast p1, Ll/ܺ֨ᩴ;

    iget-object p1, p1, Ll/ܺ֨ᩴ;->c:Ljava/util/List;

    .line 304
    iget-object v0, p0, Ll/ܺ֨ᩴ;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 305
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    :goto_0
    if-ge v1, v0, :cond_0

    if-ge v1, v2, :cond_0

    .line 308
    iget-object v3, p0, Ll/ܺ֨ᩴ;->c:Ljava/util/List;

    .line 310
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 314
    :cond_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    move v3, v1

    :goto_1
    if-ge v3, v0, :cond_1

    const-string v4, ".."

    .line 316
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    if-ge v1, v2, :cond_2

    .line 319
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 322
    :cond_2
    new-instance p1, Ll/ܺ֨ᩴ;

    iget-object v4, p0, Ll/ܺ֨ᩴ;->a:Ll/۟֨ᩴ;

    iget-object v7, p0, Ll/ܺ֨ᩴ;->e:Ljava/lang/String;

    iget-object v8, p0, Ll/ܺ֨ᩴ;->f:Ljava/lang/String;

    const/4 v5, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Ll/ܺ֨ᩴ;-><init>(Ll/۟֨ᩴ;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1

    .line 299
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'other\' is different type of Path in absolute property."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 291
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 295
    invoke-interface {p1}, Ll/᩷۠ᩴ;->getFileSystem()Ll/۟֨ᩴ;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v1

    const/4 p1, 0x1

    aput-object v2, v3, p1

    const-string p1, "Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s)."

    .line 292
    invoke-static {p1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;
    .locals 2

    .line 515
    invoke-virtual {p0}, Ll/ܺ֨ᩴ;->getFileSystem()Ll/۟֨ᩴ;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Ll/۟֨ᩴ;->getPath(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܺ֨ᩴ;->resolve(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic resolve(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;
    .locals 0

    .line 49
    invoke-virtual {p0, p1}, Ll/ܺ֨ᩴ;->n(Ll/᩷۠ᩴ;)Ll/ܺ֨ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final resolveSibling(Ljava/lang/String;)Ll/᩷۠ᩴ;
    .locals 4

    .line 285
    new-instance v0, Ll/ܺ֨ᩴ;

    iget-object v1, p0, Ll/ܺ֨ᩴ;->a:Ll/۟֨ᩴ;

    iget-object v2, p0, Ll/ܺ֨ᩴ;->e:Ljava/lang/String;

    iget-object v3, p0, Ll/ܺ֨ᩴ;->f:Ljava/lang/String;

    invoke-direct {v0, v1, p1, v2, v3}, Ll/ܺ֨ᩴ;-><init>(Ll/۟֨ᩴ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ll/ܺ֨ᩴ;->s(Ll/᩷۠ᩴ;)Ll/ܺ֨ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic resolveSibling(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;
    .locals 0

    .line 49
    invoke-virtual {p0, p1}, Ll/ܺ֨ᩴ;->s(Ll/᩷۠ᩴ;)Ll/ܺ֨ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final s(Ll/᩷۠ᩴ;)Ll/ܺ֨ᩴ;
    .locals 4

    .line 272
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ll/ܺ֨ᩴ;

    if-eqz v0, :cond_1

    .line 279
    invoke-virtual {p0}, Ll/ܺ֨ᩴ;->m()Ll/ܺ֨ᩴ;

    move-result-object v0

    if-nez v0, :cond_0

    .line 280
    check-cast p1, Ll/ܺ֨ᩴ;

    return-object p1

    :cond_0
    invoke-virtual {v0, p1}, Ll/ܺ֨ᩴ;->n(Ll/᩷۠ᩴ;)Ll/ܺ֨ᩴ;

    move-result-object p1

    return-object p1

    .line 273
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 277
    invoke-interface {p1}, Ll/᩷۠ᩴ;->getFileSystem()Ll/۟֨ᩴ;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object v1, v2, p1

    const-string p1, "Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s)."

    .line 274
    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final startsWith(Ljava/lang/String;)Z
    .locals 4

    .line 166
    new-instance v0, Ll/ܺ֨ᩴ;

    iget-object v1, p0, Ll/ܺ֨ᩴ;->a:Ll/۟֨ᩴ;

    iget-object v2, p0, Ll/ܺ֨ᩴ;->e:Ljava/lang/String;

    iget-object v3, p0, Ll/ܺ֨ᩴ;->f:Ljava/lang/String;

    invoke-direct {v0, v1, p1, v2, v3}, Ll/ܺ֨ᩴ;-><init>(Ll/۟֨ᩴ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ll/ܺ֨ᩴ;->startsWith(Ll/᩷۠ᩴ;)Z

    move-result p1

    return p1
.end method

.method public final startsWith(Ll/᩷۠ᩴ;)Z
    .locals 5

    .line 171
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    instance-of v0, p1, Ll/ܺ֨ᩴ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 104
    :cond_0
    iget-boolean v0, p0, Ll/ܺ֨ᩴ;->d:Z

    .line 175
    check-cast p1, Ll/ܺ֨ᩴ;

    .line 104
    iget-boolean v2, p1, Ll/ܺ֨ᩴ;->d:Z

    if-eq v0, v2, :cond_1

    return v1

    .line 143
    :cond_1
    iget-object v0, p1, Ll/ܺ֨ᩴ;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v2, p0, Ll/ܺ֨ᩴ;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v2, v0, :cond_2

    return v1

    :cond_2
    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_4

    .line 183
    invoke-virtual {p0, v2}, Ll/ܺ֨ᩴ;->l(I)Ll/ܺ֨ᩴ;

    move-result-object v3

    .line 49
    invoke-virtual {p1, v2}, Ll/ܺ֨ᩴ;->l(I)Ll/ܺ֨ᩴ;

    move-result-object v4

    .line 183
    invoke-virtual {v3, v4}, Ll/ܺ֨ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    return v1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    const/4 p1, 0x1

    return p1
.end method

.method public final subpath(II)Ll/᩷۠ᩴ;
    .locals 3

    .line 157
    new-instance v0, Ll/ܺ֨ᩴ;

    iget-object v1, p0, Ll/ܺ֨ᩴ;->a:Ll/۟֨ᩴ;

    .line 161
    iget-object v2, p0, Ll/ܺ֨ᩴ;->c:Ljava/util/List;

    invoke-interface {v2, p1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ll/᩺ۚᩴ;->A(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p1

    .line 157
    iget-object p2, p0, Ll/ܺ֨ᩴ;->e:Ljava/lang/String;

    iget-object v2, p0, Ll/ܺ֨ᩴ;->f:Ljava/lang/String;

    invoke-direct {v0, v1, p1, p2, v2}, Ll/ܺ֨ᩴ;-><init>(Ll/۟֨ᩴ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final bridge synthetic toAbsolutePath()Ll/᩷۠ᩴ;
    .locals 1

    .line 49
    invoke-virtual {p0}, Ll/ܺ֨ᩴ;->C()Ll/ܺ֨ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final toFile()Ljava/io/File;
    .locals 2

    .line 328
    new-instance v0, Ljava/io/File;

    .line 352
    iget-object v1, p0, Ll/ܺ֨ᩴ;->b:Ljava/lang/String;

    .line 328
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final toRealPath([Ll/ܳ۠ᩴ;)Ll/᩷۠ᩴ;
    .locals 4

    .line 99
    iget-object v0, p0, Ll/ܺ֨ᩴ;->a:Ll/۟֨ᩴ;

    .line 343
    invoke-virtual {v0}, Ll/۟֨ᩴ;->provider()Ll/۬᩸ᩴ;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ll/ۨ֨ᩴ;

    sget-object v2, Ll/ۨ֨ᩴ;->READ:Ll/ۨ֨ᩴ;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, p0, v1}, Ll/۬᩸ᩴ;->checkAccess(Ll/᩷۠ᩴ;[Ll/ۨ֨ᩴ;)V

    .line 344
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    sget-object v0, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 345
    invoke-virtual {p0}, Ll/ܺ֨ᩴ;->C()Ll/ܺ֨ᩴ;

    move-result-object p1

    return-object p1

    .line 347
    :cond_0
    new-instance p1, Ll/ܺ֨ᩴ;

    iget-object v0, p0, Ll/ܺ֨ᩴ;->a:Ll/۟֨ᩴ;

    invoke-virtual {p0}, Ll/ܺ֨ᩴ;->toFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/ܺ֨ᩴ;->e:Ljava/lang/String;

    iget-object v3, p0, Ll/ܺ֨ᩴ;->f:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, v3}, Ll/ܺ֨ᩴ;-><init>(Ll/۟֨ᩴ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 352
    iget-object v0, p0, Ll/ܺ֨ᩴ;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final toUri()Ljava/net/URI;
    .locals 13

    .line 333
    sget-object v0, Ll/ۖ֨ᩴ;->c:[C

    .line 101
    invoke-virtual {p0}, Ll/ܺ֨ᩴ;->C()Ll/ܺ֨ᩴ;

    move-result-object v0

    .line 357
    iget-object v1, v0, Ll/ܺ֨ᩴ;->g:[B

    if-nez v1, :cond_0

    .line 358
    iget-object v1, v0, Ll/ܺ֨ᩴ;->b:Ljava/lang/String;

    .line 51
    sget-object v2, Ll/ۘ֨ᩴ;->a:Ljava/nio/charset/Charset;

    .line 358
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    iput-object v1, v0, Ll/ܺ֨ᩴ;->g:[B

    .line 360
    :cond_0
    iget-object v0, v0, Ll/ܺ֨ᩴ;->g:[B

    .line 102
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "file:///"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    .line 104
    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_3

    .line 105
    aget-byte v3, v0, v2

    and-int/lit16 v3, v3, 0xff

    int-to-char v3, v3

    .line 106
    sget-wide v4, Ll/ۖ֨ᩴ;->a:J

    sget-wide v6, Ll/ۖ֨ᩴ;->b:J

    const/16 v8, 0x40

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x1

    if-ge v3, v8, :cond_1

    shl-long v6, v11, v3

    and-long/2addr v4, v6

    cmp-long v6, v4, v9

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_1
    const/16 v4, 0x80

    if-ge v3, v4, :cond_2

    add-int/lit8 v4, v3, -0x40

    shl-long v4, v11, v4

    and-long/2addr v4, v6

    cmp-long v6, v4, v9

    if-eqz v6, :cond_2

    .line 107
    :goto_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_2
    const/16 v4, 0x25

    .line 109
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 110
    sget-object v4, Ll/ۖ֨ᩴ;->c:[C

    shr-int/lit8 v5, v3, 0x4

    and-int/lit8 v5, v5, 0xf

    aget-char v5, v4, v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v3, v3, 0xf

    .line 111
    aget-char v3, v4, v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 116
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v0

    const/16 v2, 0x2f

    if-eq v0, v2, :cond_4

    .line 124
    invoke-virtual {p0}, Ll/ܺ֨ᩴ;->toFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 125
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 130
    :cond_4
    :try_start_0
    new-instance v0, Ljava/net/URI;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 132
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method
