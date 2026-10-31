.class public final Ll/ᩴܿܽ;
.super Ll/᩷ᩳܽ;
.source "Z4SS"


# static fields
.field public static final ۛ:Ljava/lang/reflect/Field;

.field public static final ۨ:Ljava/util/Comparator;


# instance fields
.field public ۗ:Z

.field public ۙ:Z

.field public final ۤ:Ljava/util/ArrayList;

.field public ۫:Z

.field public ۬:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 23
    new-instance v0, Ll/ۘܿܽ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ll/۠۬ᩴ;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    move-result-object v0

    sput-object v0, Ll/ᩴܿܽ;->ۨ:Ljava/util/Comparator;

    const/4 v0, 0x0

    .line 35
    :try_start_0
    const-class v1, Ljava/util/ArrayList;

    const-string v2, "elementData"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    :catch_0
    sput-object v0, Ll/ᩴܿܽ;->ۛ:Ljava/lang/reflect/Field;

    return-void
.end method

.method public constructor <init>(Ll/ۖܿܽ;I)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2}, Ll/᩷ᩳܽ;-><init>(Ll/ۜ᩻ܽ;I)V

    const/4 p1, 0x0

    .line 25
    iput-boolean p1, p0, Ll/ᩴܿܽ;->ۗ:Z

    .line 26
    iput-boolean p1, p0, Ll/ᩴܿܽ;->۬:Z

    .line 27
    iput-boolean p1, p0, Ll/ᩴܿܽ;->۫:Z

    .line 28
    iput-boolean p1, p0, Ll/ᩴܿܽ;->ۙ:Z

    .line 29
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ᩴܿܽ;->ۤ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final getType()Ll/֡᩻ܽ;
    .locals 1

    .line 299
    invoke-super {p0}, Ll/᩷ᩳܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/᩶ܿܽ;

    return-object v0
.end method

.method public final getType()Ll/᩶ܿܽ;
    .locals 1

    .line 299
    invoke-super {p0}, Ll/᩷ᩳܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/᩶ܿܽ;

    return-object v0
.end method

.method public final bridge synthetic getValue()Ll/֨᩻ܽ;
    .locals 1

    .line 21
    invoke-virtual {p0}, Ll/ᩴܿܽ;->getValue()Ll/ۙܿܽ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getValue(I)Ll/֨᩻ܽ;
    .locals 0

    .line 21
    invoke-virtual {p0, p1}, Ll/ᩴܿܽ;->getValue(I)Ll/ۙܿܽ;

    move-result-object p1

    return-object p1
.end method

.method public final getValue()Ll/ۙܿܽ;
    .locals 2

    .line 49
    iget-object v0, p0, Ll/ᩴܿܽ;->ۤ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙܿܽ;

    return-object v0
.end method

.method public final getValue(I)Ll/ۙܿܽ;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/ᩴܿܽ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۙܿܽ;

    return-object p1
.end method

.method public final ֡(I)V
    .locals 0

    .line 267
    iput p1, p0, Ll/᩷ᩳܽ;->᩶:I

    return-void
.end method

.method public final ֫(III)Ll/ۙܿܽ;
    .locals 1

    .line 102
    new-instance v0, Ll/ۙܿܽ;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ۙܿܽ;-><init>(Ll/ᩴܿܽ;III)V

    .line 103
    iget-object p1, p0, Ll/ᩴܿܽ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;[Ll/᩸᩻ܽ;I)Ll/ۙܿܽ;
    .locals 1

    .line 120
    new-instance v0, Ll/ۙܿܽ;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ۙܿܽ;-><init>(Ll/ᩴܿܽ;Ljava/lang/String;[Ll/᩸᩻ܽ;I)V

    .line 121
    iget-object p1, p0, Ll/ᩴܿܽ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final ֫()Ll/ۢ᩻ܽ;
    .locals 1

    .line 289
    invoke-super {p0}, Ll/᩷ᩳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ۡܿܽ;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 299
    invoke-super {p0}, Ll/᩷ᩳܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/᩶ܿܽ;

    .line 219
    invoke-virtual {p0}, Ll/᩷ᩳܽ;->ۚۧ()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Ll/᩶ܿܽ;->֫(ILjava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/util/Comparator;)V
    .locals 1

    .line 284
    iget-object v0, p0, Ll/ᩴܿܽ;->ۤ:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method

.method public final ֫(Ll/ۙۜܽ;Ll/۫ܿܽ;)V
    .locals 4

    .line 239
    iget-boolean v0, p0, Ll/ᩴܿܽ;->ۙ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 163
    invoke-virtual {p2, p0}, Ll/۫ܿܽ;->֫(Ll/ᩴܿܽ;)I

    move-result v0

    const v2, 0xffff

    if-le v0, v2, :cond_0

    .line 280
    iput-boolean v1, p0, Ll/ᩴܿܽ;->ۙ:Z

    .line 229
    :cond_0
    iget-boolean v0, p0, Ll/ᩴܿܽ;->۬:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 234
    :goto_0
    iget-boolean v2, p0, Ll/ᩴܿܽ;->۫:Z

    if-eqz v2, :cond_2

    or-int/lit8 v0, v0, 0x4

    .line 239
    :cond_2
    iget-boolean v2, p0, Ll/ᩴܿܽ;->ۙ:Z

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x8

    :cond_3
    const/16 v3, 0x8

    if-eqz v2, :cond_4

    .line 178
    invoke-virtual {p0, v1}, Ll/ᩴܿܽ;->getValue(I)Ll/ۙܿܽ;

    move-result-object v1

    .line 180
    invoke-virtual {p2, p0}, Ll/۫ܿܽ;->֫(Ll/ᩴܿܽ;)I

    move-result p2

    invoke-interface {p1, p2}, Ll/ۙۜܽ;->ۡ(I)V

    .line 182
    invoke-virtual {v1}, Ll/ۛᩳܽ;->ۖ()I

    move-result p2

    and-int/lit16 p2, p2, 0xff

    shl-int/2addr p2, v3

    or-int/2addr p2, v0

    invoke-interface {p1, p2}, Ll/ۙۜܽ;->ۡ(I)V

    .line 184
    invoke-virtual {v1}, Ll/ۙܿܽ;->getValue()I

    move-result p2

    invoke-interface {p1, p2}, Ll/ۙۜܽ;->writeInt(I)V

    return-void

    .line 224
    :cond_4
    iget-boolean v2, p0, Ll/ᩴܿܽ;->ۗ:Z

    if-eqz v2, :cond_6

    const/16 v2, 0x10

    .line 186
    invoke-interface {p1, v2}, Ll/ۙۜܽ;->ۡ(I)V

    or-int/lit8 v0, v0, 0x1

    .line 187
    invoke-interface {p1, v0}, Ll/ۙۜܽ;->ۡ(I)V

    .line 188
    invoke-virtual {p2, p0}, Ll/۫ܿܽ;->֫(Ll/ᩴܿܽ;)I

    move-result p2

    invoke-interface {p1, p2}, Ll/ۙۜܽ;->writeInt(I)V

    .line 189
    invoke-virtual {p0}, Ll/᩷ᩳܽ;->getParent()I

    move-result p2

    invoke-interface {p1, p2}, Ll/ۙۜܽ;->writeInt(I)V

    .line 209
    iget-object p2, p0, Ll/ᩴܿܽ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    .line 190
    invoke-interface {p1, p2}, Ll/ۙۜܽ;->writeInt(I)V

    .line 244
    invoke-virtual {p0}, Ll/᩷ᩳܽ;->ܶ()Ljava/lang/Iterable;

    move-result-object p2

    .line 191
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙܿܽ;

    .line 192
    invoke-virtual {v0}, Ll/ۛᩳܽ;->ۡ֫()I

    move-result v2

    invoke-interface {p1, v2}, Ll/ۙۜܽ;->writeInt(I)V

    .line 31
    invoke-interface {p1, v3}, Ll/ۙۜܽ;->֫(S)V

    .line 32
    invoke-interface {p1, v1}, Ll/ۙۜܽ;->writeByte(I)V

    .line 33
    invoke-virtual {v0}, Ll/ۛᩳܽ;->ۖ()I

    move-result v2

    invoke-interface {p1, v2}, Ll/ۙۜܽ;->writeByte(I)V

    .line 34
    invoke-virtual {v0}, Ll/ۙܿܽ;->getValue()I

    move-result v0

    invoke-interface {p1, v0}, Ll/ۙۜܽ;->writeInt(I)V

    goto :goto_1

    :cond_5
    return-void

    .line 196
    :cond_6
    invoke-interface {p1, v3}, Ll/ۙۜܽ;->ۡ(I)V

    .line 197
    invoke-interface {p1, v0}, Ll/ۙۜܽ;->ۡ(I)V

    .line 198
    invoke-virtual {p2, p0}, Ll/۫ܿܽ;->֫(Ll/ᩴܿܽ;)I

    move-result p2

    invoke-interface {p1, p2}, Ll/ۙۜܽ;->writeInt(I)V

    .line 199
    invoke-virtual {p0, v1}, Ll/ᩴܿܽ;->getValue(I)Ll/ۙܿܽ;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-interface {p1, v3}, Ll/ۙۜܽ;->֫(S)V

    .line 32
    invoke-interface {p1, v1}, Ll/ۙۜܽ;->writeByte(I)V

    .line 33
    invoke-virtual {p2}, Ll/ۛᩳܽ;->ۖ()I

    move-result v0

    invoke-interface {p1, v0}, Ll/ۙۜܽ;->writeByte(I)V

    .line 34
    invoke-virtual {p2}, Ll/ۙܿܽ;->getValue()I

    move-result p2

    invoke-interface {p1, p2}, Ll/ۙۜܽ;->writeInt(I)V

    return-void
.end method

.method public final ֫(Ll/ۙܿܽ;)V
    .locals 1

    .line 92
    invoke-virtual {p1}, Ll/ۙܿܽ;->getEntry()Ll/ᩴܿܽ;

    move-result-object v0

    if-ne v0, p0, :cond_0

    .line 94
    iget-object v0, p0, Ll/ᩴܿܽ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 93
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "value.getEntry() != this"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩷᩻ܽ;)V
    .locals 5

    .line 299
    invoke-super {p0}, Ll/᩷ᩳܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/᩶ܿܽ;

    .line 126
    invoke-virtual {p0}, Ll/᩷ᩳܽ;->ۚۧ()I

    move-result v1

    invoke-interface {p1}, Ll/᩷᩻ܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v2

    invoke-interface {p1}, Ll/᩷᩻ܽ;->ۚۧ()I

    move-result v3

    .line 42
    invoke-virtual {v0, v1}, Ll/ۤᩳܽ;->ܳ(I)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {v2, v3}, Ll/֡᩻ܽ;->ܳ(I)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v4, 0x1

    :goto_1
    invoke-virtual {v0, v1, v4}, Ll/᩶ܿܽ;->ۧ(IZ)V

    .line 43
    invoke-virtual {v0, v1}, Ll/ۤᩳܽ;->᩷(I)I

    move-result v4

    invoke-interface {v2, v3}, Ll/֡᩻ܽ;->᩷(I)I

    move-result v2

    or-int/2addr v2, v4

    invoke-virtual {v0, v1, v2}, Ll/᩶ܿܽ;->ۧ(II)V

    .line 127
    invoke-interface {p1}, Ll/᩷᩻ܽ;->᩻֫()Z

    move-result v0

    invoke-virtual {p0, v0}, Ll/ᩴܿܽ;->ۧ(Z)V

    .line 128
    invoke-interface {p1}, Ll/᩷᩻ܽ;->ۛ֫()Z

    move-result v0

    .line 271
    iput-boolean v0, p0, Ll/ᩴܿܽ;->۬:Z

    .line 129
    invoke-interface {p1}, Ll/᩷᩻ܽ;->᩸()Z

    move-result v0

    .line 275
    iput-boolean v0, p0, Ll/ᩴܿܽ;->۫:Z

    .line 130
    invoke-interface {p1}, Ll/᩷᩻ܽ;->ܰ()Z

    move-result v0

    invoke-virtual {p0, v0}, Ll/ᩴܿܽ;->֫(Z)V

    .line 131
    invoke-interface {p1}, Ll/᩷᩻ܽ;->getParent()I

    move-result v0

    .line 267
    iput v0, p0, Ll/᩷ᩳܽ;->᩶:I

    .line 133
    iget-object v0, p0, Ll/ᩴܿܽ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 135
    :try_start_0
    sget-object v1, Ll/ᩴܿܽ;->ۛ:Ljava/lang/reflect/Field;

    invoke-interface {p1}, Ll/᩷᩻ܽ;->ܽ֫()I

    move-result v2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 137
    :catch_0
    invoke-interface {p1}, Ll/᩷᩻ܽ;->ܽ֫()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    goto :goto_2

    .line 140
    :cond_2
    invoke-interface {p1}, Ll/᩷᩻ܽ;->ܽ֫()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 142
    :goto_2
    invoke-interface {p1}, Ll/᩷᩻ܽ;->values()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨᩻ܽ;

    .line 143
    invoke-interface {v0}, Ll/֨᩻ܽ;->ᩳ֫()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 144
    invoke-interface {v0}, Ll/֨᩻ܽ;->ܿۧ()Ll/ۗ᩻ܽ;

    move-result-object v1

    .line 145
    invoke-interface {v1}, Ll/ۗ᩻ܽ;->᩺֫()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 147
    instance-of v2, v1, Ll/ۗܿܽ;

    if-eqz v2, :cond_3

    .line 148
    invoke-interface {v1}, Ll/ۗ᩻ܽ;->᩶֫()[Ll/᩸᩻ܽ;

    move-result-object v2

    goto :goto_4

    .line 150
    :cond_3
    invoke-interface {v1}, Ll/ۗ᩻ܽ;->ܰ֫()[Ll/᩸᩻ܽ;

    move-result-object v2

    .line 152
    :goto_4
    invoke-interface {v1}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v0

    invoke-virtual {p0, v1, v2, v0}, Ll/ᩴܿܽ;->֫(Ljava/lang/String;[Ll/᩸᩻ܽ;I)Ll/ۙܿܽ;

    goto :goto_3

    .line 154
    :cond_4
    invoke-interface {v1}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v0

    const/4 v2, 0x0

    .line 116
    invoke-virtual {p0, v1, v2, v0}, Ll/ᩴܿܽ;->֫(Ljava/lang/String;[Ll/᩸᩻ܽ;I)Ll/ۙܿܽ;

    goto :goto_3

    .line 157
    :cond_5
    invoke-interface {v0}, Ll/֨᩻ܽ;->getValue()I

    move-result v1

    invoke-interface {v0}, Ll/֨᩻ܽ;->ۖ()I

    move-result v2

    invoke-interface {v0}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v0

    invoke-virtual {p0, v1, v2, v0}, Ll/ᩴܿܽ;->֫(III)Ll/ۙܿܽ;

    goto :goto_3

    :cond_6
    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 280
    iget-boolean p1, p0, Ll/ᩴܿܽ;->ۗ:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll/ᩴܿܽ;->ۙ:Z

    return-void
.end method

.method public final ۛ֫()Z
    .locals 1

    .line 229
    iget-boolean v0, p0, Ll/ᩴܿܽ;->۬:Z

    return v0
.end method

.method public final ۟֫()Ljava/lang/String;
    .locals 2

    .line 299
    invoke-super {p0}, Ll/᩷ᩳܽ;->getType()Ll/֡᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/᩶ܿܽ;

    .line 214
    invoke-virtual {p0}, Ll/᩷ᩳܽ;->ۚۧ()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/᩶ܿܽ;->ܽ(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

.method public final ۧ()Ll/ۘ᩻ܽ;
    .locals 1

    .line 294
    invoke-super {p0}, Ll/᩷ᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/۠ܿܽ;

    return-object v0
.end method

.method public final ۧ(Z)V
    .locals 4

    .line 248
    iget-boolean v0, p0, Ll/ᩴܿܽ;->ۗ:Z

    if-eq v0, p1, :cond_2

    .line 249
    iput-boolean p1, p0, Ll/ᩴܿܽ;->ۗ:Z

    const/4 v0, 0x0

    .line 250
    iget-object v1, p0, Ll/ᩴܿܽ;->ۤ:Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    .line 252
    iput-boolean v0, p0, Ll/ᩴܿܽ;->ۙ:Z

    .line 253
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    .line 254
    invoke-virtual {p0}, Ll/ᩴܿܽ;->getValue()Ll/ۙܿܽ;

    move-result-object p1

    const/high16 v0, 0x2000000

    invoke-virtual {p1, v0}, Ll/ۙܿܽ;->ᩳ(I)V

    return-void

    .line 256
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    const/4 v2, -0x1

    if-eqz p1, :cond_1

    .line 257
    new-instance p1, Ll/ۙܿܽ;

    const/16 v3, 0x10

    invoke-direct {p1, p0, v0, v3, v2}, Ll/ۙܿܽ;-><init>(Ll/ᩴܿܽ;III)V

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 258
    :cond_1
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v0, 0x1

    if-le p1, v0, :cond_2

    .line 259
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 260
    invoke-virtual {p0}, Ll/ᩴܿܽ;->getValue()Ll/ۙܿܽ;

    move-result-object p1

    invoke-virtual {p1, v2}, Ll/ۙܿܽ;->ᩳ(I)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ۬()V
    .locals 4

    .line 83
    new-instance v0, Ll/ۙܿܽ;

    const/4 v1, 0x0

    const/4 v2, -0x1

    invoke-direct {v0, p0, v1, v1, v2}, Ll/ۙܿܽ;-><init>(Ll/ᩴܿܽ;III)V

    .line 84
    iget-object v2, p0, Ll/ᩴܿܽ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 85
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 87
    :cond_0
    invoke-virtual {v2, v1, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ܰ()Z
    .locals 1

    .line 239
    iget-boolean v0, p0, Ll/ᩴܿܽ;->ۙ:Z

    return v0
.end method

.method public final ܽ(Z)V
    .locals 0

    .line 271
    iput-boolean p1, p0, Ll/ᩴܿܽ;->۬:Z

    return-void
.end method

.method public final ܽ֫()I
    .locals 1

    .line 209
    iget-object v0, p0, Ll/ᩴܿܽ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ܿ()Ll/ۖܿܽ;
    .locals 1

    .line 304
    invoke-super {p0}, Ll/᩷ᩳܽ;->ܿ()Ll/ۜ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ۖܿܽ;

    return-object v0
.end method

.method public final ܿ()Ll/ۜ᩻ܽ;
    .locals 1

    .line 304
    invoke-super {p0}, Ll/᩷ᩳܽ;->ܿ()Ll/ۜ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ۖܿܽ;

    return-object v0
.end method

.method public final ᩳ(Z)V
    .locals 0

    .line 275
    iput-boolean p1, p0, Ll/ᩴܿܽ;->۫:Z

    return-void
.end method

.method public final ᩵(I)V
    .locals 1

    .line 204
    iget-object v0, p0, Ll/ᩴܿܽ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method public final ᩶()Ll/۠ܿܽ;
    .locals 1

    .line 294
    invoke-super {p0}, Ll/᩷ᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/۠ܿܽ;

    return-object v0
.end method

.method public final ᩸()Z
    .locals 1

    .line 234
    iget-boolean v0, p0, Ll/ᩴܿܽ;->۫:Z

    return v0
.end method

.method public final ᩻֫()Z
    .locals 1

    .line 224
    iget-boolean v0, p0, Ll/ᩴܿܽ;->ۗ:Z

    return v0
.end method
