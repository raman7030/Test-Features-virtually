.class public final Ll/ۨܶ۠;
.super Ljava/lang/Object;
.source "Q3ZI"


# static fields
.field public static final ܽ:Ll/ۙ֨۠;


# instance fields
.field public ֫:Ll/ۖܶ۠;

.field public ۧ:Ljava/util/LinkedHashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 46
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/ۨܶ۠;->ܽ:Ll/ۙ֨۠;

    return-void
.end method

.method public static ֫(Ll/ۗ֨۠;)Ll/ۨܶ۠;
    .locals 3

    .line 52
    sget-object v0, Ll/ۨܶ۠;->ܽ:Ll/ۙ֨۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨܶ۠;

    if-nez v1, :cond_0

    .line 54
    new-instance v1, Ll/ۨܶ۠;

    .line 58
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 174
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v2

    iput-object v2, v1, Ll/ۨܶ۠;->֫:Ll/ۖܶ۠;

    .line 60
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v2, v1, Ll/ۨܶ۠;->ۧ:Ljava/util/LinkedHashMap;

    .line 61
    invoke-virtual {p0, v0, v1}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    :cond_0
    return-object v1
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/ۨܶ۠;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final ֫(Ll/֡ۖ۠;)Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Ll/ۨܶ۠;->ۧ:Ljava/util/LinkedHashMap;

    iget-object p1, p1, Ll/֡ۖ۠;->ۛ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final ֫()Ljava/util/Set;
    .locals 1

    .line 165
    iget-object v0, p0, Ll/ۨܶ۠;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Runnable;)V
    .locals 2

    .line 177
    iget-object v0, p0, Ll/ۨܶ۠;->֫:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    new-instance v1, Ll/ۖܶ۠;

    invoke-direct {v1, p1, v0}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    .line 177
    iput-object v1, p0, Ll/ۨܶ۠;->֫:Ll/ۖܶ۠;

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 149
    iget-object v0, p0, Ll/ۨܶ۠;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/֡ۖ۠;Ljava/lang/String;)Z
    .locals 2

    .line 112
    iget-object v0, p0, Ll/ۨܶ۠;->ۧ:Ljava/util/LinkedHashMap;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p1, p1, Ll/֡ۖ۠;->ۛ:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()V
    .locals 2

    .line 181
    iget-object v0, p0, Ll/ۨܶ۠;->֫:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    .line 182
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ(Ljava/lang/String;)Z
    .locals 1

    .line 98
    iget-object v0, p0, Ll/ۨܶ۠;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ll/֡ۖ۠;)Z
    .locals 1

    .line 105
    iget-object v0, p0, Ll/ۨܶ۠;->ۧ:Ljava/util/LinkedHashMap;

    iget-object p1, p1, Ll/֡ۖ۠;->ۛ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ll/֡ۖ۠;Ljava/lang/String;)Z
    .locals 2

    .line 145
    iget-object v0, p0, Ll/ۨܶ۠;->ۧ:Ljava/util/LinkedHashMap;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p1, p1, Ll/֡ۖ۠;->ۛ:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(Ll/֡ۖ۠;Ljava/lang/String;)V
    .locals 1

    .line 153
    iget-object v0, p0, Ll/ۨܶ۠;->ۧ:Ljava/util/LinkedHashMap;

    iget-object p1, p1, Ll/֡ۖ۠;->ۛ:Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)Z
    .locals 1

    .line 131
    iget-object v0, p0, Ll/ۨܶ۠;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(Ll/֡ۖ۠;)Z
    .locals 1

    .line 138
    iget-object v0, p0, Ll/ۨܶ۠;->ۧ:Ljava/util/LinkedHashMap;

    iget-object p1, p1, Ll/֡ۖ۠;->ۛ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 1

    .line 161
    iget-object v0, p0, Ll/ۨܶ۠;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
