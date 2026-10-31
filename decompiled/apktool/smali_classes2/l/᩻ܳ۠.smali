.class public final Ll/᩻ܳ۠;
.super Ll/۠ܳ۠;
.source "K7QT"


# instance fields
.field public ܳ:Ll/ۘܳ۠;

.field public final synthetic ᩻:Ll/᩹ܳ۠;


# direct methods
.method public varargs constructor <init>(Ll/᩹ܳ۠;Ll/᩷᩶۠;[Ll/֡ۖ۠;)V
    .locals 0

    .line 1136
    iput-object p1, p0, Ll/᩻ܳ۠;->᩻:Ll/᩹ܳ۠;

    .line 1137
    invoke-direct {p0, p1, p2, p3}, Ll/۠ܳ۠;-><init>(Ll/᩹ܳ۠;Ll/֫᩶۠;[Ll/֡ۖ۠;)V

    return-void
.end method

.method private ᩷()V
    .locals 5

    .line 1227
    iget-object v0, p0, Ll/᩻ܳ۠;->ܳ:Ll/ۘܳ۠;

    if-eqz v0, :cond_0

    goto :goto_1

    .line 1231
    :cond_0
    new-instance v0, Ll/ۘܳ۠;

    iget-object v1, p0, Ll/᩻ܳ۠;->᩻:Ll/᩹ܳ۠;

    invoke-direct {v0, v1}, Ll/ۘܳ۠;-><init>(Ll/᩹ܳ۠;)V

    iput-object v0, p0, Ll/᩻ܳ۠;->ܳ:Ll/ۘܳ۠;

    .line 1233
    invoke-virtual {p0}, Ll/᩻ܳ۠;->ܳ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    .line 1234
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫᩶۠;

    .line 1235
    instance-of v3, v2, Ll/ܽܳ۠;

    if-eqz v3, :cond_2

    check-cast v2, Ll/ܽܳ۠;

    .line 1236
    iget-object v3, p0, Ll/᩻ܳ۠;->ܳ:Ll/ۘܳ۠;

    invoke-static {v3}, Ll/ۘܳ۠;->֫(Ll/ۘܳ۠;)Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-static {v2}, Ll/ܽܳ۠;->֫(Ll/ܽܳ۠;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 1237
    iget-object v3, p0, Ll/᩻ܳ۠;->ܳ:Ll/ۘܳ۠;

    invoke-virtual {v3, v2}, Ll/ۘܳ۠;->֫(Ll/ܽܳ۠;)V

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/֫᩶۠;
    .locals 1

    .line 1151
    invoke-direct {p0}, Ll/᩻ܳ۠;->᩷()V

    .line 1152
    iget-object v0, p0, Ll/᩻ܳ۠;->ܳ:Ll/ۘܳ۠;

    invoke-virtual {v0, p1}, Ll/ۘܳ۠;->֫(Ljava/lang/String;)Ll/ܽܳ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/Iterable;)V
    .locals 4

    if-eqz p1, :cond_4

    .line 1190
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷۠ᩴ;

    const/4 v2, 0x0

    new-array v3, v2, [Ll/ܳ۠ᩴ;

    .line 1245
    invoke-static {v1, v3}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    new-array v2, v2, [Ll/ܳ۠ᩴ;

    .line 1250
    invoke-static {v1, v2}, Ll/ܿ۠ᩴ;->isDirectory(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    .line 1255
    :cond_2
    invoke-interface {v1}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "."

    .line 1256
    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    if-lez v3, :cond_3

    .line 1258
    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, ".jar"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, ".jmod"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_0

    .line 1264
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-interface {v1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1194
    :cond_4
    invoke-super {p0, p1}, Ll/۠ܳ۠;->֫(Ljava/lang/Iterable;)V

    const/4 p1, 0x0

    .line 1195
    iput-object p1, p0, Ll/᩻ܳ۠;->ܳ:Ll/ۘܳ۠;

    return-void
.end method

.method public final ֫(Ljava/lang/Iterable;Ljava/lang/String;)V
    .locals 7

    .line 1218
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1219
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1220
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷۠ᩴ;

    .line 1221
    invoke-static {v0}, Ll/ܰܿ۠;->ܽ(Ll/᩷۠ᩴ;)V

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1203
    :cond_0
    invoke-direct {p0}, Ll/᩻ܳ۠;->᩷()V

    .line 1204
    iget-object p1, p0, Ll/᩻ܳ۠;->ܳ:Ll/ۘܳ۠;

    invoke-virtual {p1, p2}, Ll/ۘܳ۠;->֫(Ljava/lang/String;)Ll/ܽܳ۠;

    move-result-object p1

    if-nez p1, :cond_1

    .line 1206
    new-instance p1, Ll/ܽܳ۠;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܰܿ۠;->ۧ:Ll/֫᩶۠;

    invoke-interface {v1}, Ll/֫᩶۠;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x1

    iget-object v1, p0, Ll/᩻ܳ۠;->᩻:Ll/᩹ܳ۠;

    move-object v0, p1

    move-object v2, p0

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Ll/ܽܳ۠;-><init>(Ll/᩹ܳ۠;Ll/ۧܳ۠;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Z)V

    .line 1208
    iget-object p2, p0, Ll/᩻ܳ۠;->ܳ:Ll/ۘܳ۠;

    invoke-virtual {p2, p1}, Ll/ۘܳ۠;->֫(Ll/ܽܳ۠;)V

    goto :goto_1

    .line 1210
    :cond_1
    iput-object v5, p1, Ll/ܽܳ۠;->۬:Ljava/util/Collection;

    .line 1211
    iget-object p2, p0, Ll/᩻ܳ۠;->ܳ:Ll/ۘܳ۠;

    invoke-virtual {p2, p1}, Ll/ۘܳ۠;->ۧ(Ll/ܽܳ۠;)V

    :goto_1
    const/4 p2, 0x1

    .line 1213
    iput-boolean p2, p1, Ll/ܽܳ۠;->᩸:Z

    .line 1214
    iput-boolean p2, p0, Ll/ܰܿ۠;->֫:Z

    return-void
.end method

.method public final ֫(Ll/֡ۖ۠;Ljava/lang/String;)Z
    .locals 1

    .line 1142
    iget-object v0, p0, Ll/ܰܿ۠;->ܽ:Ljava/util/EnumSet;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    .line 1145
    :cond_1
    iget-object p1, p0, Ll/᩻ܳ۠;->᩻:Ll/᩹ܳ۠;

    invoke-static {p1, p2}, Ll/᩹ܳ۠;->֫(Ll/᩹ܳ۠;Ljava/lang/String;)Ll/ᩴܶ۠;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Ll/᩻ܳ۠;->֫(Ljava/lang/Iterable;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(Ll/᩷۠ᩴ;)Z
    .locals 1

    .line 1181
    iget-object v0, p0, Ll/᩻ܳ۠;->ܳ:Ll/ۘܳ۠;

    if-nez v0, :cond_0

    .line 1182
    invoke-direct {p0}, Ll/᩻ܳ۠;->᩷()V

    .line 1184
    :cond_0
    iget-object v0, p0, Ll/᩻ܳ۠;->ܳ:Ll/ۘܳ۠;

    invoke-virtual {v0, p1}, Ll/ۘܳ۠;->֫(Ll/᩷۠ᩴ;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(Ll/᩷۠ᩴ;)Ll/֫᩶۠;
    .locals 1

    .line 1157
    invoke-direct {p0}, Ll/᩻ܳ۠;->᩷()V

    .line 1158
    iget-object v0, p0, Ll/᩻ܳ۠;->ܳ:Ll/ۘܳ۠;

    invoke-virtual {v0, p1}, Ll/ۘܳ۠;->ۧ(Ll/᩷۠ᩴ;)Ll/ܽܳ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ܳ()Ljava/lang/Iterable;
    .locals 3

    .line 1163
    iget-object v0, p0, Ll/᩻ܳ۠;->ܳ:Ll/ۘܳ۠;

    if-eqz v0, :cond_0

    .line 1164
    invoke-virtual {v0}, Ll/ۘܳ۠;->ۧ()Ljava/util/Set;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 1165
    :goto_0
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 1166
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    .line 1167
    :cond_1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 1169
    :goto_1
    iget-object v1, p0, Ll/۠ܳ۠;->ᩳ:Ljava/util/Collection;

    if-nez v1, :cond_2

    return-object v0

    .line 1172
    :cond_2
    new-instance v1, Ll/ᩳܳ۠;

    invoke-direct {v1, p0}, Ll/ᩳܳ۠;-><init>(Ll/᩻ܳ۠;)V

    .line 1174
    new-instance v2, Ll/ܿܳ۠;

    invoke-direct {v2, v0, v1}, Ll/ܿܳ۠;-><init>(Ljava/util/List;Ll/ᩳܳ۠;)V

    return-object v2
.end method
