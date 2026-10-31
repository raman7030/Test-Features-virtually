.class public final Ll/ۘۘۖ;
.super Ljava/lang/Object;
.source "29QV"


# instance fields
.field public ֫:Ll/ۖۚۖ;

.field public ۧ:Z

.field public ܽ:Z

.field public ᩳ:Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 926
    sget p1, Ll/᩸ۚۖ;->ۤ:I

    .line 72
    new-instance p1, Ll/ۖۚۖ;

    const/16 v0, 0x10

    invoke-direct {p1, v0}, Ll/᩸ۚۖ;-><init>(I)V

    .line 929
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 930
    iput-object p1, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    const/4 p1, 0x1

    .line 931
    iput-boolean p1, p0, Ll/ۘۘۖ;->ᩳ:Z

    return-void
.end method

.method public static ֫(Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 1

    .line 1023
    instance-of v0, p0, Ll/ۢ֡ۖ;

    if-nez v0, :cond_0

    return-object p0

    .line 1026
    :cond_0
    check-cast p0, Ll/ۢ֡ۖ;

    if-eqz p1, :cond_1

    .line 1028
    invoke-interface {p0}, Ll/ۢ֡ۖ;->buildPartial()Ll/ۡ֡ۖ;

    move-result-object p0

    return-object p0

    .line 1030
    :cond_1
    invoke-interface {p0}, Ll/ۢ֡ۖ;->build()Ll/ۡ֡ۖ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ᩴۘۖ;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 3

    if-nez p1, :cond_0

    return-object p1

    .line 991
    :cond_0
    invoke-interface {p0}, Ll/ᩴۘۖ;->ܽܽ()Ll/֫۠ۖ;

    move-result-object v0

    sget-object v1, Ll/֫۠ۖ;->ۨ:Ll/֫۠ۖ;

    if-ne v0, v1, :cond_6

    .line 992
    invoke-interface {p0}, Ll/ᩴۘۖ;->۟֫()Z

    move-result p0

    if-eqz p0, :cond_5

    .line 993
    instance-of p0, p1, Ljava/util/List;

    if-eqz p0, :cond_4

    .line 999
    move-object p0, p1

    check-cast p0, Ljava/util/List;

    const/4 v0, 0x0

    .line 1000
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 1001
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 1002
    invoke-static {v1, p2}, Ll/ۘۘۖ;->֫(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v1, :cond_2

    if-ne p0, p1, :cond_1

    .line 1009
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object p0, v1

    .line 1011
    :cond_1
    invoke-interface {p0, v0, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-object p0

    .line 994
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Repeated field should contains a List but actually contains type: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 996
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1016
    :cond_5
    invoke-static {p1, p2}, Ll/ۘۘۖ;->֫(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_6
    return-object p1
.end method

.method private ֫(Z)Ll/᩵ۘۖ;
    .locals 3

    .line 955
    iget-object v0, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 956
    invoke-static {}, Ll/᩵ۘۖ;->ۢ()Ll/᩵ۘۖ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    .line 958
    iput-boolean v0, p0, Ll/ۘۘۖ;->ᩳ:Z

    .line 959
    iget-object v1, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    .line 960
    iget-boolean v2, p0, Ll/ۘۘۖ;->ܽ:Z

    if-eqz v2, :cond_1

    .line 963
    invoke-static {v1, v0, v0}, Ll/᩵ۘۖ;->֫(Ll/ۖۚۖ;ZZ)Ll/ۖۚۖ;

    move-result-object v1

    .line 964
    invoke-static {v1, p1}, Ll/ۘۘۖ;->֫(Ll/ۖۚۖ;Z)V

    .line 966
    :cond_1
    new-instance p1, Ll/᩵ۘۖ;

    invoke-direct {p1, v1, v0}, Ll/᩵ۘۖ;-><init>(Ll/᩸ۚۖ;I)V

    .line 967
    iget-boolean v0, p0, Ll/ۘۘۖ;->ۧ:Z

    invoke-static {p1, v0}, Ll/᩵ۘۖ;->֫(Ll/᩵ۘۖ;Z)V

    return-object p1
.end method

.method private ֫(Ljava/util/Map$Entry;)V
    .locals 4

    .line 1293
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴۘۖ;

    .line 1294
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    .line 1295
    instance-of v1, p1, Ll/ۡ᩵ۖ;

    .line 1297
    invoke-interface {v0}, Ll/ᩴۘۖ;->۟֫()Z

    move-result v2

    if-eqz v2, :cond_2

    if-nez v1, :cond_1

    .line 1301
    invoke-virtual {p0, v0}, Ll/ۘۘۖ;->֫(Ll/ᩴۘۖ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_0

    .line 1303
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1304
    iget-object v2, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    invoke-virtual {v2, v0, v1}, Ll/᩸ۚۖ;->֫(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1306
    :cond_0
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 1307
    invoke-static {v0}, Ll/᩵ۘۖ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1299
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Lazy fields can not be repeated"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1309
    :cond_2
    invoke-interface {v0}, Ll/ᩴۘۖ;->ܽܽ()Ll/֫۠ۖ;

    move-result-object v2

    sget-object v3, Ll/֫۠ۖ;->ۨ:Ll/֫۠ۖ;

    if-ne v2, v3, :cond_7

    .line 1310
    invoke-virtual {p0, v0}, Ll/ۘۘۖ;->֫(Ll/ᩴۘۖ;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_4

    .line 1313
    iget-object v2, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    invoke-static {p1}, Ll/᩵ۘۖ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, v0, p1}, Ll/᩸ۚۖ;->֫(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_3

    const/4 p1, 0x1

    .line 1315
    iput-boolean p1, p0, Ll/ۘۘۖ;->ۧ:Z

    :cond_3
    return-void

    :cond_4
    if-eqz v1, :cond_5

    .line 1321
    check-cast p1, Ll/ۡ᩵ۖ;

    invoke-virtual {p1}, Ll/ۡ᩵ۖ;->ܽ()Ll/ۡ֡ۖ;

    move-result-object p1

    .line 1323
    :cond_5
    instance-of v1, v2, Ll/ۢ֡ۖ;

    if-eqz v1, :cond_6

    .line 1324
    check-cast v2, Ll/ۢ֡ۖ;

    check-cast p1, Ll/ۡ֡ۖ;

    invoke-interface {v0, v2, p1}, Ll/ᩴۘۖ;->֫(Ll/ۢ֡ۖ;Ll/ۡ֡ۖ;)Ll/ۢ֡ۖ;

    return-void

    .line 1326
    :cond_6
    check-cast v2, Ll/ۡ֡ۖ;

    .line 1328
    invoke-interface {v2}, Ll/ۡ֡ۖ;->toBuilder()Ll/ۢ֡ۖ;

    move-result-object v1

    check-cast p1, Ll/ۡ֡ۖ;

    invoke-interface {v0, v1, p1}, Ll/ᩴۘۖ;->֫(Ll/ۢ֡ۖ;Ll/ۡ֡ۖ;)Ll/ۢ֡ۖ;

    move-result-object p1

    .line 1329
    invoke-interface {p1}, Ll/ۢ֡ۖ;->build()Ll/ۡ֡ۖ;

    move-result-object p1

    .line 1330
    iget-object v1, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    invoke-virtual {v1, v0, p1}, Ll/᩸ۚۖ;->֫(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_7
    if-nez v1, :cond_8

    .line 1337
    iget-object v1, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    invoke-static {p1}, Ll/᩵ۘۖ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Ll/᩸ۚۖ;->֫(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 1335
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Lazy fields must be message-valued"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ll/ۖۚۖ;Z)V
    .locals 4

    const/4 v0, 0x0

    .line 973
    :goto_0
    invoke-virtual {p0}, Ll/᩸ۚۖ;->ۧ()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 974
    invoke-virtual {p0, v0}, Ll/᩸ۚۖ;->ۧ(I)Ljava/util/Map$Entry;

    move-result-object v1

    .line 983
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴۘۖ;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3, p1}, Ll/ۘۘۖ;->֫(Ll/ᩴۘۖ;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 976
    :cond_0
    invoke-virtual {p0}, Ll/᩸ۚۖ;->ܽ()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 983
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴۘۖ;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2, p1}, Ll/ۘۘۖ;->֫(Ll/ᩴۘۖ;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    return-void
.end method

.method public static ֫(Ll/ᩴۘۖ;Ljava/lang/Object;)V
    .locals 4

    .line 1243
    invoke-interface {p0}, Ll/ᩴۘۖ;->ᩳۧ()Ll/۟֨ۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/᩵ۘۖ;->֫(Ll/۟֨ۖ;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1245
    invoke-interface {p0}, Ll/ᩴۘۖ;->ᩳۧ()Ll/۟֨ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟֨ۖ;->֫()Ll/֫۠ۖ;

    move-result-object v0

    sget-object v1, Ll/֫۠ۖ;->ۨ:Ll/֫۠ۖ;

    if-ne v0, v1, :cond_0

    instance-of v0, p1, Ll/ۢ֡ۖ;

    if-eqz v0, :cond_0

    return-void

    .line 1249
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1253
    invoke-interface {p0}, Ll/ᩴۘۖ;->getNumber()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 1254
    invoke-interface {p0}, Ll/ᩴۘۖ;->ᩳۧ()Ll/۟֨ۖ;

    move-result-object p0

    invoke-virtual {p0}, Ll/۟֨ۖ;->֫()Ll/֫۠ۖ;

    move-result-object p0

    .line 1255
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v1, 0x1

    aput-object p0, v2, v1

    const/4 p0, 0x2

    aput-object p1, v2, p0

    const-string p0, "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"

    .line 1250
    invoke-static {p0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method private ܿ()V
    .locals 3

    .line 1089
    iget-boolean v0, p0, Ll/ۘۘۖ;->ᩳ:Z

    if-nez v0, :cond_0

    .line 1090
    iget-object v0, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, Ll/᩵ۘۖ;->֫(Ll/ۖۚۖ;ZZ)Ll/ۖۚۖ;

    move-result-object v0

    iput-object v0, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    .line 1091
    iput-boolean v2, p0, Ll/ۘۘۖ;->ᩳ:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡ۖۖ;I)Ljava/lang/Object;
    .locals 1

    .line 1158
    iget-boolean v0, p0, Ll/ۘۘۖ;->ܽ:Z

    if-eqz v0, :cond_0

    .line 1159
    invoke-direct {p0}, Ll/ۘۘۖ;->ܿ()V

    .line 1161
    :cond_0
    invoke-virtual {p0, p1, p2}, Ll/ۘۘۖ;->֫(Ll/ᩴۘۖ;I)Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x1

    .line 1162
    invoke-static {p1, p2}, Ll/ۘۘۖ;->֫(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ᩴۘۖ;)Ljava/lang/Object;
    .locals 1

    .line 1081
    iget-object v0, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    invoke-virtual {v0, p1}, Ll/᩸ۚۖ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 1082
    instance-of v0, p1, Ll/ۡ᩵ۖ;

    if-eqz v0, :cond_0

    .line 1083
    check-cast p1, Ll/ۡ᩵ۖ;

    invoke-virtual {p1}, Ll/ۡ᩵ۖ;->ܽ()Ll/ۡ֡ۖ;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public final ֫(Ll/ᩴۘۖ;I)Ljava/lang/Object;
    .locals 1

    .line 1170
    invoke-interface {p1}, Ll/ᩴۘۖ;->۟֫()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1175
    invoke-virtual {p0, p1}, Ll/ۘۘۖ;->֫(Ll/ᩴۘۖ;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 1180
    check-cast p1, Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 1178
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 1171
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "getRepeatedField() can only be called on repeated fields."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Ll/᩵ۘۖ;
    .locals 1

    const/4 v0, 0x0

    .line 940
    invoke-direct {p0, v0}, Ll/ۘۘۖ;->֫(Z)Ll/᩵ۘۖ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֡ۖۖ;)V
    .locals 1

    .line 1130
    invoke-direct {p0}, Ll/ۘۘۖ;->ܿ()V

    .line 1131
    iget-object v0, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    invoke-virtual {v0, p1}, Ll/᩸ۚۖ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1132
    iget-object p1, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 1133
    iput-boolean p1, p0, Ll/ۘۘۖ;->ۧ:Z

    :cond_0
    return-void
.end method

.method public final ֫(Ll/֡ۖۖ;ILjava/lang/Object;)V
    .locals 1

    .line 1190
    invoke-direct {p0}, Ll/ۘۘۖ;->ܿ()V

    .line 1191
    invoke-virtual {p1}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1196
    iget-boolean v0, p0, Ll/ۘۘۖ;->ܽ:Z

    if-nez v0, :cond_1

    instance-of v0, p3, Ll/ۢ֡ۖ;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Ll/ۘۘۖ;->ܽ:Z

    .line 1198
    invoke-virtual {p0, p1}, Ll/ۘۘۖ;->֫(Ll/ᩴۘۖ;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1203
    invoke-static {p1, p3}, Ll/ۘۘۖ;->֫(Ll/ᩴۘۖ;Ljava/lang/Object;)V

    .line 1204
    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p2, p3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 1200
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 1192
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "getRepeatedField() can only be called on repeated fields."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/֡ۖۖ;Ljava/lang/Object;)V
    .locals 2

    .line 1213
    invoke-direct {p0}, Ll/ۘۘۖ;->ܿ()V

    .line 1214
    invoke-virtual {p1}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1219
    iget-boolean v0, p0, Ll/ۘۘۖ;->ܽ:Z

    if-nez v0, :cond_1

    instance-of v0, p2, Ll/ۢ֡ۖ;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Ll/ۘۘۖ;->ܽ:Z

    .line 1221
    invoke-static {p1, p2}, Ll/ۘۘۖ;->֫(Ll/ᩴۘۖ;Ljava/lang/Object;)V

    .line 1223
    invoke-virtual {p0, p1}, Ll/ۘۘۖ;->֫(Ll/ᩴۘۖ;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    .line 1226
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1227
    iget-object v1, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    invoke-virtual {v1, p1, v0}, Ll/᩸ۚۖ;->֫(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 1229
    :cond_2
    check-cast v0, Ljava/util/List;

    .line 1232
    :goto_2
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 1215
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "addRepeatedField() can only be called on repeated fields."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩵ۘۖ;)V
    .locals 2

    .line 1282
    invoke-direct {p0}, Ll/ۘۘۖ;->ܿ()V

    const/4 v0, 0x0

    .line 1283
    :goto_0
    invoke-static {p1}, Ll/᩵ۘۖ;->ۧ(Ll/᩵ۘۖ;)Ll/᩸ۚۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩸ۚۖ;->ۧ()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 1284
    invoke-static {p1}, Ll/᩵ۘۖ;->ۧ(Ll/᩵ۘۖ;)Ll/᩸ۚۖ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/᩸ۚۖ;->ۧ(I)Ljava/util/Map$Entry;

    move-result-object v1

    invoke-direct {p0, v1}, Ll/ۘۘۖ;->֫(Ljava/util/Map$Entry;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1286
    :cond_0
    invoke-static {p1}, Ll/᩵ۘۖ;->ۧ(Ll/᩵ۘۖ;)Ll/᩸ۚۖ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸ۚۖ;->ܽ()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1287
    invoke-direct {p0, v0}, Ll/ۘۘۖ;->֫(Ljava/util/Map$Entry;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final ۧ(Ll/֡ۖۖ;)Ljava/lang/Object;
    .locals 2

    .line 1075
    invoke-virtual {p0, p1}, Ll/ۘۘۖ;->֫(Ll/ᩴۘۖ;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    .line 1076
    invoke-static {p1, v0, v1}, Ll/ۘۘۖ;->֫(Ll/ᩴۘۖ;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Ll/᩵ۘۖ;
    .locals 1

    const/4 v0, 0x1

    .line 945
    invoke-direct {p0, v0}, Ll/ۘۘۖ;->֫(Z)Ll/᩵ۘۖ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/֡ۖۖ;Ljava/lang/Object;)V
    .locals 5

    .line 1101
    invoke-direct {p0}, Ll/ۘۘۖ;->ܿ()V

    .line 1102
    invoke-virtual {p1}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    .line 1103
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_3

    .line 1110
    new-instance v0, Ljava/util/ArrayList;

    check-cast p2, Ljava/util/List;

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1111
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 1112
    invoke-static {p1, v3}, Ll/ۘۘۖ;->֫(Ll/ᩴۘۖ;Ljava/lang/Object;)V

    .line 1113
    iget-boolean v4, p0, Ll/ۘۘۖ;->ܽ:Z

    if-nez v4, :cond_1

    instance-of v3, v3, Ll/ۢ֡ۖ;

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v3, 0x1

    :goto_2
    iput-boolean v3, p0, Ll/ۘۘۖ;->ܽ:Z

    goto :goto_0

    :cond_2
    move-object p2, v0

    goto :goto_3

    .line 1104
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Wrong object type used with protocol message reflection."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1117
    :cond_4
    invoke-static {p1, p2}, Ll/ۘۘۖ;->֫(Ll/ᩴۘۖ;Ljava/lang/Object;)V

    .line 1120
    :goto_3
    instance-of v0, p2, Ll/ۡ᩵ۖ;

    if-eqz v0, :cond_5

    .line 1121
    iput-boolean v2, p0, Ll/ۘۘۖ;->ۧ:Z

    .line 1123
    :cond_5
    iget-boolean v0, p0, Ll/ۘۘۖ;->ܽ:Z

    if-nez v0, :cond_6

    instance-of v0, p2, Ll/ۢ֡ۖ;

    if-eqz v0, :cond_7

    :cond_6
    const/4 v1, 0x1

    :cond_7
    iput-boolean v1, p0, Ll/ۘۘۖ;->ܽ:Z

    .line 1125
    iget-object v0, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    invoke-virtual {v0, p1, p2}, Ll/᩸ۚۖ;->֫(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ܽ()Ljava/util/Map;
    .locals 3

    .line 1047
    iget-boolean v0, p0, Ll/ۘۘۖ;->ۧ:Z

    if-eqz v0, :cond_1

    .line 1048
    iget-object v0, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 1049
    invoke-static {v0, v1, v2}, Ll/᩵ۘۖ;->֫(Ll/ۖۚۖ;ZZ)Ll/ۖۚۖ;

    move-result-object v0

    .line 1050
    iget-object v1, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    invoke-virtual {v1}, Ll/᩸ۚۖ;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1051
    invoke-virtual {v0}, Ll/ۖۚۖ;->᩻()V

    return-object v0

    .line 1053
    :cond_0
    invoke-static {v0, v2}, Ll/ۘۘۖ;->֫(Ll/ۖۚۖ;Z)V

    return-object v0

    .line 1057
    :cond_1
    iget-object v0, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    invoke-virtual {v0}, Ll/᩸ۚۖ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    return-object v0

    :cond_2
    iget-object v0, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(Ll/֡ۖۖ;)Z
    .locals 1

    .line 1062
    invoke-virtual {p1}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1066
    iget-object v0, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    invoke-virtual {v0, p1}, Ll/᩸ۚۖ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 1063
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "hasField() can only be called on non-repeated fields."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩳ()Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1265
    :goto_0
    iget-object v2, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    invoke-virtual {v2}, Ll/᩸ۚۖ;->ۧ()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 1266
    iget-object v2, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    invoke-virtual {v2, v1}, Ll/᩸ۚۖ;->ۧ(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-static {v2}, Ll/᩵ۘۖ;->֫(Ljava/util/Map$Entry;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1270
    :cond_1
    iget-object v1, p0, Ll/ۘۘۖ;->֫:Ll/ۖۚۖ;

    invoke-virtual {v1}, Ll/᩸ۚۖ;->ܽ()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 1271
    invoke-static {v2}, Ll/᩵ۘۖ;->֫(Ljava/util/Map$Entry;)Z

    move-result v2

    if-nez v2, :cond_2

    :goto_1
    return v0

    :cond_3
    const/4 v0, 0x1

    return v0
.end method
