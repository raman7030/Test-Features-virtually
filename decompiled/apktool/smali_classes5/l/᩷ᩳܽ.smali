.class public abstract Ll/᩷ᩳܽ;
.super Ljava/lang/Object;
.source "D5WF"

# interfaces
.implements Ll/᩷᩻ܽ;
.implements Ll/۬ۜᩴ;


# instance fields
.field public ᩶:I

.field public final ᩸:Ll/ۜ᩻ܽ;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/ۜ᩻ܽ;I)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Ll/᩷ᩳܽ;->᩸:Ll/ۜ᩻ܽ;

    .line 24
    iput p2, p0, Ll/᩷ᩳܽ;->᩹:I

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(I)Ljava/lang/Object;
    .locals 0

    .line 60
    invoke-virtual {p0, p1}, Ll/᩷ᩳܽ;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 93
    invoke-virtual {p0, p1}, Ll/᩷ᩳܽ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 230
    new-instance p1, Ljava/lang/NoSuchMethodError;

    invoke-direct {p1}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw p1
.end method

.method public final synthetic containsKey(Ljava/lang/Object;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۗۜᩴ;->֫(Ll/۬ۜᩴ;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 0

    .line 121
    invoke-interface {p0, p1}, Ll/᩷᩻ܽ;->getValue(I)Ll/֨᩻ܽ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۗۜᩴ;->ۧ(Ll/۬ۜᩴ;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getParent()I
    .locals 1

    .line 54
    iget v0, p0, Ll/᩷ᩳܽ;->᩶:I

    return v0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 2

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/᩷ᩳܽ;->ܿ()Ll/ۜ᩻ܽ;

    move-result-object v1

    invoke-interface {v1}, Ll/ۜ᩻ܽ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ll/᩷᩻ܽ;->۟֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getType()Ll/֡᩻ܽ;
    .locals 1

    .line 39
    iget-object v0, p0, Ll/᩷ᩳܽ;->᩸:Ll/ۜ᩻ܽ;

    invoke-interface {v0}, Ll/ۜ᩻ܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v0

    return-object v0
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 0

    .line 111
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final synthetic size()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 84
    invoke-virtual {p0}, Ll/᩷ᩳܽ;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public values()Ljava/lang/Iterable;
    .locals 1

    .line 244
    invoke-virtual {p0}, Ll/᩷ᩳܽ;->ܶ()Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 73
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public ֫()Ll/ۢ᩻ܽ;
    .locals 1

    .line 29
    iget-object v0, p0, Ll/᩷ᩳܽ;->᩸:Ll/ۜ᩻ܽ;

    invoke-interface {v0}, Ll/ۜ᩻ܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/۠᩻ܽ;)V
    .locals 3

    .line 89
    move-object v0, p1

    check-cast v0, Ll/᩷᩻ܽ;

    .line 49
    iget v1, p0, Ll/᩷ᩳܽ;->᩹:I

    .line 90
    invoke-interface {v0}, Ll/᩷᩻ܽ;->ۚۧ()I

    move-result v2

    if-ne v1, v2, :cond_a

    .line 92
    invoke-interface {p0}, Ll/᩷᩻ܽ;->۟֫()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, Ll/᩷᩻ܽ;->۟֫()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 94
    invoke-interface {p0}, Ll/᩷᩻ܽ;->᩻֫()Z

    move-result v1

    invoke-interface {v0}, Ll/᩷᩻ܽ;->᩻֫()Z

    move-result v2

    if-ne v1, v2, :cond_8

    .line 96
    invoke-interface {p0}, Ll/᩷᩻ܽ;->ܽ֫()I

    move-result v1

    invoke-interface {v0}, Ll/᩷᩻ܽ;->ܽ֫()I

    move-result v2

    if-eq v1, v2, :cond_1

    .line 97
    invoke-interface {p0}, Ll/᩷᩻ܽ;->᩻֫()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 98
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ll/᩷ᩳܽ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 100
    :cond_1
    :goto_0
    invoke-interface {p0}, Ll/᩷᩻ܽ;->ۛ֫()Z

    move-result v1

    invoke-interface {v0}, Ll/᩷᩻ܽ;->ۛ֫()Z

    move-result v2

    if-ne v1, v2, :cond_7

    .line 102
    invoke-interface {p0}, Ll/᩷᩻ܽ;->᩸()Z

    move-result v1

    invoke-interface {v0}, Ll/᩷᩻ܽ;->᩸()Z

    move-result v2

    if-ne v1, v2, :cond_6

    .line 104
    invoke-interface {p0}, Ll/᩷᩻ܽ;->ܰ()Z

    move-result v1

    invoke-interface {v0}, Ll/᩷᩻ܽ;->ܰ()Z

    move-result v2

    if-ne v1, v2, :cond_5

    .line 106
    invoke-virtual {p0}, Ll/᩷ᩳܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v1

    invoke-interface {v1}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "style"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 107
    instance-of v1, p0, Ll/ᩴܿܽ;

    if-eqz v1, :cond_2

    .line 108
    move-object v1, p0

    check-cast v1, Ll/ᩴܿܽ;

    sget-object v2, Ll/ᩴܿܽ;->ۨ:Ljava/util/Comparator;

    invoke-virtual {v1, v2}, Ll/ᩴܿܽ;->֫(Ljava/util/Comparator;)V

    .line 110
    :cond_2
    instance-of v1, p1, Ll/ᩴܿܽ;

    if-eqz v1, :cond_3

    .line 111
    check-cast p1, Ll/ᩴܿܽ;

    sget-object v1, Ll/ᩴܿܽ;->ۨ:Ljava/util/Comparator;

    invoke-virtual {p1, v1}, Ll/ᩴܿܽ;->֫(Ljava/util/Comparator;)V

    :cond_3
    const/4 p1, 0x0

    .line 114
    :goto_1
    invoke-interface {p0}, Ll/᩷᩻ܽ;->ܽ֫()I

    move-result v1

    if-ge p1, v1, :cond_4

    .line 115
    invoke-interface {p0, p1}, Ll/᩷᩻ܽ;->getValue(I)Ll/֨᩻ܽ;

    move-result-object v1

    invoke-interface {v0, p1}, Ll/᩷᩻ܽ;->getValue(I)Ll/֨᩻ܽ;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/۠᩻ܽ;->֫(Ll/۠᩻ܽ;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_4
    return-void

    .line 105
    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ll/᩷ᩳܽ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 103
    :cond_6
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ll/᩷ᩳܽ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 101
    :cond_7
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ll/᩷ᩳܽ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 95
    :cond_8
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ll/᩷ᩳܽ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 93
    :cond_9
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ll/᩷ᩳܽ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 91
    :cond_a
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ll/᩷ᩳܽ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final synthetic ֫(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final ۚۧ()I
    .locals 1

    .line 49
    iget v0, p0, Ll/᩷ᩳܽ;->᩹:I

    return v0
.end method

.method public ۧ()Ll/ۘ᩻ܽ;
    .locals 1

    .line 34
    iget-object v0, p0, Ll/᩷ᩳܽ;->᩸:Ll/ۜ᩻ܽ;

    invoke-interface {v0}, Ll/ۜ᩻ܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ֫()I
    .locals 4

    .line 68
    invoke-virtual {p0}, Ll/᩷ᩳܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v0

    .line 69
    invoke-interface {v0}, Ll/֡᩻ܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v1

    .line 70
    invoke-interface {v1}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x18

    .line 71
    invoke-interface {v0}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x10

    .line 49
    iget v2, p0, Ll/᩷ᩳܽ;->᩹:I

    const v3, 0xffff

    and-int/2addr v2, v3

    or-int/2addr v0, v1

    or-int/2addr v0, v2

    return v0
.end method

.method public final ܶ()Ljava/lang/Iterable;
    .locals 2

    .line 58
    new-instance v0, Ll/ۨᩳܽ;

    invoke-interface {p0}, Ll/᩷᩻ܽ;->ܽ֫()I

    move-result v1

    invoke-direct {v0, v1, p0}, Ll/ۨᩳܽ;-><init>(ILl/۬ۜᩴ;)V

    return-object v0
.end method

.method public final synthetic ܽ()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ܿ()Ll/ۜ᩻ܽ;
    .locals 1

    .line 44
    iget-object v0, p0, Ll/᩷ᩳܽ;->᩸:Ll/ۜ᩻ܽ;

    return-object v0
.end method

.method public final ᩴ()Ljava/lang/String;
    .locals 3

    .line 78
    invoke-virtual {p0}, Ll/᩷ᩳܽ;->ۧ֫()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "%08x"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
