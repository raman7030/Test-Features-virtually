.class public final Ll/ᩴۜܺ;
.super Ll/ۗۜܺ;
.source "052C"


# instance fields
.field public final ۗ:Ll/ۖۜܺ;

.field public final ۤ:Ll/ۘۜܺ;

.field public final ۫:Ll/ۛۜܺ;

.field public final ۬:I


# direct methods
.method public constructor <init>(Ll/ۘۜܺ;Ll/ۛۜܺ;Ll/ۖۜܺ;Ll/ۖۜܺ;I)V
    .locals 2

    const/4 v0, 0x4

    const/16 v1, 0xc

    .line 134
    invoke-direct {p0, v0, v1}, Ll/ۗۜܺ;-><init>(II)V

    if-eqz p1, :cond_3

    if-eqz p3, :cond_2

    if-eqz p4, :cond_1

    if-lez p5, :cond_0

    .line 156
    iput-object p1, p0, Ll/ᩴۜܺ;->ۤ:Ll/ۘۜܺ;

    .line 157
    iput-object p2, p0, Ll/ᩴۜܺ;->۫:Ll/ۛۜܺ;

    .line 158
    iput-object p3, p0, Ll/ᩴۜܺ;->ۗ:Ll/ۖۜܺ;

    .line 160
    iput p5, p0, Ll/ᩴۜܺ;->۬:I

    return-void

    .line 153
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "itemCount <= 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 149
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "lastItem == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 145
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "firstItem == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 137
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "type == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ll/ۙۜܺ;)V
    .locals 2

    const/4 v0, 0x4

    const/16 v1, 0xc

    .line 170
    invoke-direct {p0, v0, v1}, Ll/ۗۜܺ;-><init>(II)V

    if-eqz p1, :cond_0

    .line 176
    sget-object v0, Ll/ۘۜܺ;->᩻֫:Ll/ۘۜܺ;

    iput-object v0, p0, Ll/ᩴۜܺ;->ۤ:Ll/ۘۜܺ;

    .line 177
    iput-object p1, p0, Ll/ᩴۜܺ;->۫:Ll/ۛۜܺ;

    const/4 p1, 0x0

    .line 178
    iput-object p1, p0, Ll/ᩴۜܺ;->ۗ:Ll/ۖۜܺ;

    const/4 p1, 0x1

    .line 180
    iput p1, p0, Ll/ᩴۜܺ;->۬:I

    return-void

    .line 173
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "section == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫([Ll/ۛۜܺ;Ll/ۙۜܺ;)V
    .locals 14

    if-eqz p0, :cond_7

    .line 81
    invoke-virtual {p1}, Ll/ۙۜܺ;->ᩳ()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_6

    .line 86
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x32

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 88
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_5

    aget-object v9, p0, v2

    .line 94
    invoke-virtual {v9}, Ll/ۛۜܺ;->ᩳ()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v10

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v4, v3

    move-object v6, v4

    move-object v7, v6

    const/4 v8, 0x0

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Ll/ۖۜܺ;

    .line 95
    invoke-virtual {v11}, Ll/ۖۜܺ;->֫()Ll/ۘۜܺ;

    move-result-object v12

    if-eq v12, v4, :cond_1

    if-eqz v8, :cond_0

    .line 98
    new-instance v13, Ll/ᩴۜܺ;

    move-object v3, v13

    move-object v5, v9

    invoke-direct/range {v3 .. v8}, Ll/ᩴۜܺ;-><init>(Ll/ۘۜܺ;Ll/ۛۜܺ;Ll/ۖۜܺ;Ll/ۖۜܺ;I)V

    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    const/4 v8, 0x0

    move-object v6, v11

    move-object v4, v12

    :cond_1
    add-int/lit8 v8, v8, 0x1

    move-object v7, v11

    goto :goto_1

    :cond_2
    if-eqz v8, :cond_3

    .line 111
    new-instance v10, Ll/ᩴۜܺ;

    move-object v3, v10

    move-object v5, v9

    invoke-direct/range {v3 .. v8}, Ll/ᩴۜܺ;-><init>(Ll/ۘۜܺ;Ll/ۛۜܺ;Ll/ۖۜܺ;Ll/ۖۜܺ;I)V

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    if-ne v9, p1, :cond_4

    .line 115
    new-instance v3, Ll/ᩴۜܺ;

    invoke-direct {v3, p1}, Ll/ᩴۜܺ;-><init>(Ll/ۙۜܺ;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 119
    :cond_5
    new-instance p0, Ll/ܳ᩷ܺ;

    sget-object v1, Ll/ۘۜܺ;->᩻֫:Ll/ۘۜܺ;

    invoke-direct {p0, v1, v0}, Ll/ܳ᩷ܺ;-><init>(Ll/ۘۜܺ;Ljava/util/ArrayList;)V

    invoke-virtual {p1, p0}, Ll/ۙۜܺ;->֫(Ll/ۗۜܺ;)V

    return-void

    .line 82
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "mapSection.items().size() != 0"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 78
    :cond_7
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "sections == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 196
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 198
    const-class v1, Ll/ᩴۜܺ;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    .line 199
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 200
    iget-object v1, p0, Ll/ᩴۜܺ;->۫:Ll/ۛۜܺ;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    .line 201
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 202
    iget-object v1, p0, Ll/ᩴۜܺ;->ۤ:Ll/ۘۜܺ;

    invoke-virtual {v1}, Ll/ۘۜܺ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    .line 203
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 205
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۘۜܺ;
    .locals 1

    .line 188
    sget-object v0, Ll/ۘۜܺ;->ܳ֫:Ll/ۘۜܺ;

    return-object v0
.end method

.method public final ֫(Ll/֫ۜܺ;)V
    .locals 0

    return-void
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 221
    invoke-virtual {p0}, Ll/ᩴۜܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V
    .locals 6

    .line 229
    iget-object p1, p0, Ll/ᩴۜܺ;->ۤ:Ll/ۘۜܺ;

    invoke-virtual {p1}, Ll/ۘۜܺ;->ۧ()I

    move-result v0

    .line 232
    iget-object v1, p0, Ll/ᩴۜܺ;->۫:Ll/ۛۜܺ;

    iget-object v2, p0, Ll/ᩴۜܺ;->ۗ:Ll/ۖۜܺ;

    if-nez v2, :cond_0

    .line 233
    invoke-virtual {v1}, Ll/ۛۜܺ;->ܽ()I

    move-result v1

    goto :goto_0

    .line 235
    :cond_0
    invoke-virtual {v1, v2}, Ll/ۛۜܺ;->֫(Ll/ۖۜܺ;)I

    move-result v1

    .line 238
    :goto_0
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->֫()Z

    move-result v2

    iget v3, p0, Ll/ᩴۜܺ;->۬:I

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    .line 239
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ۗۜܺ;->᩷()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x20

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/ۘۜܺ;->᩻()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " map"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v4, v2}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 241
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "  type:   "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " // "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x2

    .line 241
    invoke-virtual {p2, v2, p1}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    const-string p1, "  unused: 0"

    .line 243
    invoke-virtual {p2, v2, p1}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 244
    invoke-static {v3}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object p1

    const-string v2, "  size:   "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x4

    invoke-virtual {p2, v2, p1}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 245
    invoke-static {v1}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object p1

    const-string v5, "  offset: "

    invoke-virtual {v5, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v2, p1}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 248
    :cond_1
    invoke-virtual {p2, v0}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 249
    invoke-virtual {p2, v4}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 250
    invoke-virtual {p2, v3}, Ll/ᩳᩴܺ;->ܿ(I)V

    .line 251
    invoke-virtual {p2, v1}, Ll/ᩳᩴܺ;->ܿ(I)V

    return-void
.end method
