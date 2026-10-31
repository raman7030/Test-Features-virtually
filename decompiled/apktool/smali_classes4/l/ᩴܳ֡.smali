.class public abstract Ll/ᩴܳ֡;
.super Ljava/lang/Object;
.source "4ASR"


# instance fields
.field public ֫:Ll/ۨܳ֡;

.field public ۧ:Ljava/util/List;

.field public ܽ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 26
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ll/ۘܳ֡;

    .line 31
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 32
    sget-object v1, Ll/ۧܳ֡;->֫:Ll/ۧܳ֡;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    iput-object v0, p0, Ll/ᩴܳ֡;->ۧ:Ljava/util/List;

    const/4 v0, -0x1

    .line 37
    iput v0, p0, Ll/ᩴܳ֡;->ܽ:I

    return-void
.end method


# virtual methods
.method public ֫(II)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ۛܿ֡;)V
    .locals 1

    .line 218
    iget-object v0, p0, Ll/ᩴܳ֡;->ۧ:Ljava/util/List;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ۨܳ֡;)V
    .locals 0

    .line 169
    iput-object p1, p0, Ll/ᩴܳ֡;->֫:Ll/ۨܳ֡;

    return-void
.end method

.method public ֫(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public ֫(Ll/᩵ܳ֡;II)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public abstract ۜ()[Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public final ۢ()V
    .locals 1

    .line 226
    iget-object v0, p0, Ll/ᩴܳ֡;->ۧ:Ljava/util/List;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    return-void
.end method

.method public final ۧ(I)V
    .locals 0

    .line 264
    iput p1, p0, Ll/ᩴܳ֡;->ܽ:I

    return-void
.end method

.method public abstract ܳ()[Ljava/lang/String;
.end method

.method public abstract ܽ()Ll/᩸ܳ֡;
.end method

.method public final ܿ()Ll/ۨܳ֡;
    .locals 1

    .line 150
    iget-object v0, p0, Ll/ᩴܳ֡;->֫:Ll/ۨܳ֡;

    return-object v0
.end method

.method public final ᩳ()Ll/ܺܳ֡;
    .locals 2

    .line 235
    new-instance v0, Ll/ܺܳ֡;

    .line 231
    iget-object v1, p0, Ll/ᩴܳ֡;->ۧ:Ljava/util/List;

    .line 235
    invoke-direct {v0, v1}, Ll/ܺܳ֡;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public ᩷()Ll/ܶܳ֡;
    .locals 8

    .line 58
    invoke-virtual {p0}, Ll/ᩴܳ֡;->ۜ()[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    sget-object v1, Ll/ܶܳ֡;->ܿ:Ll/ܶܳ֡;

    .line 96
    array-length v1, v0

    if-nez v1, :cond_0

    goto :goto_2

    .line 100
    :cond_0
    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    .line 101
    array-length v2, v0

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 102
    :goto_0
    array-length v5, v0

    if-ge v4, v5, :cond_4

    .line 103
    aget-object v5, v0, v4

    if-nez v5, :cond_1

    goto :goto_1

    .line 108
    :cond_1
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    const/4 v7, 0x0

    if-nez v6, :cond_3

    .line 109
    invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x27

    if-ne v5, v6, :cond_2

    .line 111
    aput-object v7, v2, v4

    goto :goto_1

    .line 114
    :cond_2
    invoke-static {v5}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 115
    aput-object v7, v1, v4

    goto :goto_1

    .line 121
    :cond_3
    aput-object v7, v1, v4

    .line 122
    aput-object v7, v2, v4

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 125
    :cond_4
    new-instance v3, Ll/ܶܳ֡;

    invoke-direct {v3, v1, v2, v0}, Ll/ܶܳ֡;-><init>([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V

    return-object v3

    .line 97
    :cond_5
    :goto_2
    sget-object v0, Ll/ܶܳ֡;->ܿ:Ll/ܶܳ֡;

    return-object v0
.end method

.method public final ᩻()I
    .locals 1

    .line 252
    iget v0, p0, Ll/ᩴܳ֡;->ܽ:I

    return v0
.end method
