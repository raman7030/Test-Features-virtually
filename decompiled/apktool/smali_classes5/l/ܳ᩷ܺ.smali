.class public final Ll/ܳ᩷ܺ;
.super Ll/ۗۜܺ;
.source "5BGM"


# instance fields
.field public final ۗ:Ll/ۘۜܺ;

.field public final ۬:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۘۜܺ;Ljava/util/ArrayList;)V
    .locals 3

    .line 61
    invoke-static {p2}, Ll/ܳ᩷ܺ;->֫(Ljava/util/ArrayList;)I

    move-result v0

    const/4 v1, 0x0

    .line 103
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗۜܺ;

    .line 104
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1}, Ll/ۗۜܺ;->ۧ()I

    move-result v1

    mul-int v1, v1, v2

    invoke-static {p2}, Ll/ܳ᩷ܺ;->֫(Ljava/util/ArrayList;)I

    move-result v2

    add-int/2addr v1, v2

    .line 61
    invoke-direct {p0, v0, v1}, Ll/ۗۜܺ;-><init>(II)V

    if-eqz p1, :cond_0

    .line 67
    iput-object p2, p0, Ll/ܳ᩷ܺ;->۬:Ljava/util/ArrayList;

    .line 68
    iput-object p1, p0, Ll/ܳ᩷ܺ;->ۗ:Ll/ۘۜܺ;

    return-void

    .line 64
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "itemType == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ljava/util/ArrayList;)I
    .locals 1

    const/4 v0, 0x0

    .line 82
    :try_start_0
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۗۜܺ;

    invoke-virtual {p0}, Ll/ۗۜܺ;->᩻()I

    move-result p0

    const/4 v0, 0x4

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    .line 88
    :catch_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "items == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 85
    :catch_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "items.size() == 0"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 122
    const-class v1, Ll/ܳ᩷ܺ;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    iget-object v1, p0, Ll/ܳ᩷ܺ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 125
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۘۜܺ;
    .locals 1

    .line 112
    iget-object v0, p0, Ll/ܳ᩷ܺ;->ۗ:Ll/ۘۜܺ;

    return-object v0
.end method

.method public final ֫(Ll/֫ۜܺ;)V
    .locals 2

    .line 133
    iget-object v0, p0, Ll/ܳ᩷ܺ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗۜܺ;

    .line 134
    invoke-virtual {v1, p1}, Ll/ۖۜܺ;->֫(Ll/֫ۜܺ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۡ()Ljava/util/List;
    .locals 1

    .line 167
    iget-object v0, p0, Ll/ܳ᩷ܺ;->۬:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 5

    const-string v0, "{"

    const/16 v1, 0x64

    .line 0
    invoke-static {v1, v0}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 148
    iget-object v1, p0, Ll/ܳ᩷ܺ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗۜܺ;

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_1

    :cond_0
    const-string v4, ", "

    .line 152
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    :goto_1
    invoke-virtual {v3}, Ll/ۗۜܺ;->ۢ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v1, "}"

    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V
    .locals 4

    .line 207
    iget-object v0, p0, Ll/ܳ᩷ܺ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 209
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->֫()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 210
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ۗۜܺ;->᩷()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    invoke-virtual {p0}, Ll/ܳ᩷ܺ;->֫()Ll/ۘۜܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۘۜܺ;->֫()Ljava/lang/String;

    move-result-object v3

    .line 210
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p2, v3, v2}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 211
    invoke-static {v1}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "  size: "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {p2, v3, v2}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 214
    :cond_0
    invoke-virtual {p2, v1}, Ll/ᩳᩴܺ;->ܿ(I)V

    .line 216
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗۜܺ;

    .line 217
    invoke-virtual {v1, p1, p2}, Ll/ۗۜܺ;->֫(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۧ(Ll/ۙۜܺ;I)V
    .locals 7

    .line 231
    invoke-virtual {p0}, Ll/ۗۜܺ;->᩻()I

    move-result v0

    add-int/2addr v0, p2

    .line 181
    iget-object p2, p0, Ll/ܳ᩷ܺ;->۬:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v3, -0x1

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۗۜܺ;

    .line 182
    invoke-virtual {v4}, Ll/ۗۜܺ;->ۧ()I

    move-result v5

    if-eqz v1, :cond_0

    .line 185
    invoke-virtual {v4}, Ll/ۗۜܺ;->᩻()I

    move-result v1

    const/4 v2, 0x0

    move v3, v1

    move v2, v5

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    if-ne v5, v2, :cond_2

    .line 192
    invoke-virtual {v4}, Ll/ۗۜܺ;->᩻()I

    move-result v6

    if-ne v6, v3, :cond_1

    .line 198
    :goto_1
    invoke-virtual {v4, p1, v0}, Ll/ۗۜܺ;->֫(Ll/ۙۜܺ;I)I

    move-result v0

    add-int/2addr v0, v5

    goto :goto_0

    .line 193
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "item alignment mismatch"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 189
    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "item size mismatch"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    return-void
.end method
