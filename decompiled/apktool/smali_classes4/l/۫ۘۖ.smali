.class public abstract Ll/۫ۘۖ;
.super Ll/ۘᩴۖ;
.source "X93U"

# interfaces
.implements Ll/ۘ֡ۖ;


# static fields
.field public static final serialVersionUID:J = 0x1L


# instance fields
.field public final ᩸:Ll/᩵ۘۖ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 940
    invoke-direct {p0}, Ll/ۘᩴۖ;-><init>()V

    .line 941
    invoke-static {}, Ll/᩵ۘۖ;->ۡ()Ll/᩵ۘۖ;

    move-result-object v0

    iput-object v0, p0, Ll/۫ۘۖ;->᩸:Ll/᩵ۘۖ;

    return-void
.end method

.method public constructor <init>(Ll/ۗۘۖ;)V
    .locals 0

    .line 945
    invoke-direct {p0, p1}, Ll/ۘᩴۖ;-><init>(Ll/᩶ۘۖ;)V

    .line 946
    invoke-static {p1}, Ll/ۗۘۖ;->֫(Ll/ۗۘۖ;)Ll/᩵ۘۖ;

    move-result-object p1

    iput-object p1, p0, Ll/۫ۘۖ;->᩸:Ll/᩵ۘۖ;

    return-void
.end method

.method public static synthetic ֫(Ll/۫ۘۖ;)Ll/᩵ۘۖ;
    .locals 0

    .line 933
    iget-object p0, p0, Ll/۫ۘۖ;->᩸:Ll/᩵ۘۖ;

    return-object p0
.end method

.method private ֫(Ll/֡ۖۖ;)V
    .locals 1

    .line 1172
    invoke-virtual {p1}, Ll/֡ۖۖ;->ᩴ()Ll/ᩳۖۖ;

    move-result-object p1

    invoke-virtual {p0}, Ll/ۘᩴۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-void

    .line 1173
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "FieldDescriptor does not match message type."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final getAllFields()Ljava/util/Map;
    .locals 2

    const/4 v0, 0x0

    .line 1105
    invoke-static {p0, v0}, Ll/ۘᩴۖ;->֫(Ll/ۘᩴۖ;Z)Ljava/util/Map;

    move-result-object v0

    .line 1099
    iget-object v1, p0, Ll/۫ۘۖ;->᩸:Ll/᩵ۘۖ;

    invoke-virtual {v1}, Ll/᩵ۘۖ;->ۧ()Ljava/util/Map;

    move-result-object v1

    .line 1106
    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 1107
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final getAllFieldsRaw()Ljava/util/Map;
    .locals 2

    const/4 v0, 0x0

    .line 1113
    invoke-static {p0, v0}, Ll/ۘᩴۖ;->֫(Ll/ۘᩴۖ;Z)Ljava/util/Map;

    move-result-object v0

    .line 1099
    iget-object v1, p0, Ll/۫ۘۖ;->᩸:Ll/᩵ۘۖ;

    invoke-virtual {v1}, Ll/᩵ۘۖ;->ۧ()Ljava/util/Map;

    move-result-object v1

    .line 1114
    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 1115
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 882
    invoke-interface {p0}, Ll/ۘ֡ۖ;->getDefaultInstanceForType()Ll/᩻֡ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final getField(Ll/֡ۖۖ;)Ljava/lang/Object;
    .locals 2

    .line 1130
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1131
    invoke-direct {p0, p1}, Ll/۫ۘۖ;->֫(Ll/֡ۖۖ;)V

    .line 1132
    iget-object v0, p0, Ll/۫ۘۖ;->᩸:Ll/᩵ۘۖ;

    invoke-virtual {v0, p1}, Ll/᩵ۘۖ;->֫(Ll/ᩴۘۖ;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    .line 1134
    invoke-virtual {p1}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1135
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    .line 1136
    :cond_0
    invoke-virtual {p1}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v0

    sget-object v1, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-ne v0, v1, :cond_1

    .line 1139
    invoke-virtual {p1}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object p1

    invoke-static {p1}, Ll/۫ۖۖ;->֫(Ll/ᩳۖۖ;)Ll/۫ۖۖ;

    move-result-object p1

    return-object p1

    .line 1141
    :cond_1
    invoke-virtual {p1}, Ll/֡ۖۖ;->֡()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v0

    .line 1147
    :cond_3
    invoke-super {p0, p1}, Ll/ۘᩴۖ;->getField(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getRepeatedField(Ll/֡ۖۖ;I)Ljava/lang/Object;
    .locals 2

    .line 1163
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1164
    invoke-direct {p0, p1}, Ll/۫ۘۖ;->֫(Ll/֡ۖۖ;)V

    .line 1165
    iget-object v0, p0, Ll/۫ۘۖ;->᩸:Ll/᩵ۘۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    invoke-virtual {p1}, Ll/֡ۖۖ;->۟֫()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 315
    invoke-virtual {v0, p1}, Ll/᩵ۘۖ;->֫(Ll/ᩴۘۖ;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 320
    check-cast p1, Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 318
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 311
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "getRepeatedField() can only be called on repeated fields."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1167
    :cond_2
    invoke-super {p0, p1, p2}, Ll/ۘᩴۖ;->getRepeatedField(Ll/֡ۖۖ;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getRepeatedFieldCount(Ll/֡ۖۖ;)I
    .locals 2

    .line 1153
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1154
    invoke-direct {p0, p1}, Ll/۫ۘۖ;->֫(Ll/֡ۖۖ;)V

    .line 1155
    iget-object v0, p0, Ll/۫ۘۖ;->᩸:Ll/᩵ۘۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    invoke-virtual {p1}, Ll/֡ۖۖ;->۟֫()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 300
    invoke-virtual {v0, p1}, Ll/᩵ۘۖ;->֫(Ll/ᩴۘۖ;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 304
    :cond_0
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    return p1

    .line 296
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "getRepeatedField() can only be called on repeated fields."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1157
    :cond_2
    invoke-super {p0, p1}, Ll/ۘᩴۖ;->getRepeatedFieldCount(Ll/֡ۖۖ;)I

    move-result p1

    return p1
.end method

.method public final hasField(Ll/֡ۖۖ;)Z
    .locals 1

    .line 1120
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1121
    invoke-direct {p0, p1}, Ll/۫ۘۖ;->֫(Ll/֡ۖۖ;)V

    .line 1122
    iget-object v0, p0, Ll/۫ۘۖ;->᩸:Ll/᩵ۘۖ;

    invoke-virtual {v0, p1}, Ll/᩵ۘۖ;->֫(Ll/֡ۖۖ;)Z

    move-result p1

    return p1

    .line 1124
    :cond_0
    invoke-super {p0, p1}, Ll/ۘᩴۖ;->hasField(Ll/֡ۖۖ;)Z

    move-result p1

    return p1
.end method

.method public isInitialized()Z
    .locals 1

    .line 1023
    invoke-super {p0}, Ll/ۘᩴۖ;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1017
    iget-object v0, p0, Ll/۫ۘۖ;->᩸:Ll/᩵ۘۖ;

    invoke-virtual {v0}, Ll/᩵ۘۖ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۜ()Z
    .locals 1

    .line 1017
    iget-object v0, p0, Ll/۫ۘۖ;->᩸:Ll/᩵ۘۖ;

    invoke-virtual {v0}, Ll/᩵ۘۖ;->᩻()Z

    move-result v0

    return v0
.end method

.method public final ۢ()Ljava/util/Map;
    .locals 1

    .line 1099
    iget-object v0, p0, Ll/۫ۘۖ;->᩸:Ll/᩵ۘۖ;

    invoke-virtual {v0}, Ll/᩵ۘۖ;->ۧ()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(Ll/ۨۖۖ;)Ljava/lang/Object;
    .locals 3

    .line 984
    invoke-static {p1}, Ll/ۘᩴۖ;->֫(Ll/ۨۖۖ;)Ll/ۛۖۖ;

    move-result-object p1

    .line 950
    invoke-virtual {p1}, Ll/ۛۖۖ;->ۧ()Ll/֡ۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩴ()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {p0}, Ll/ۘᩴۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object v1

    if-ne v0, v1, :cond_3

    .line 987
    invoke-virtual {p1}, Ll/ۛۖۖ;->ۧ()Ll/֡ۖۖ;

    move-result-object v0

    .line 988
    iget-object v1, p0, Ll/۫ۘۖ;->᩸:Ll/᩵ۘۖ;

    invoke-virtual {v1, v0}, Ll/᩵ۘۖ;->֫(Ll/ᩴۘۖ;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    .line 990
    invoke-virtual {v0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 991
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    .line 992
    :cond_0
    invoke-virtual {v0}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v1

    sget-object v2, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-ne v1, v2, :cond_1

    .line 993
    invoke-virtual {p1}, Ll/ۛۖۖ;->ܽ()Ll/᩻֡ۖ;

    move-result-object p1

    return-object p1

    .line 995
    :cond_1
    invoke-virtual {v0}, Ll/֡ۖۖ;->֡()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۛۖۖ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 998
    :cond_2
    invoke-virtual {p1, v1}, Ll/ۛۖۖ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 952
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Extension is for type \""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 954
    invoke-virtual {p1}, Ll/ۛۖۖ;->ۧ()Ll/֡ۖۖ;

    move-result-object p1

    invoke-virtual {p1}, Ll/֡ۖۖ;->ᩴ()Ll/ᩳۖۖ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩳۖۖ;->ܿ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\" which does not match message type \""

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 956
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩳۖۖ;->ܿ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\"."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩷()I
    .locals 1

    .line 1088
    iget-object v0, p0, Ll/۫ۘۖ;->᩸:Ll/᩵ۘۖ;

    invoke-virtual {v0}, Ll/᩵ۘۖ;->ᩳ()I

    move-result v0

    return v0
.end method
