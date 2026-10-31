.class public final Ll/ۡܺ֫;
.super Ljava/lang/Object;
.source "MANZ"

# interfaces
.implements Ll/۠۫ۧ;


# instance fields
.field public ֫:Z

.field public ۧ:Landroid/os/Bundle;

.field public final ܽ:Ll/ܶ۫ۧ;

.field public final ᩳ:Ll/ܿ۠᩵;


# direct methods
.method public constructor <init>(Ll/ܶ۫ۧ;Ll/۬ܺ֫;)V
    .locals 1

    const-string v0, "savedStateRegistry"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    iput-object p1, p0, Ll/ۡܺ֫;->ܽ:Ll/ܶ۫ۧ;

    .line 133
    new-instance p1, Ll/ۢܺ֫;

    invoke-direct {p1, p2}, Ll/ۢܺ֫;-><init>(Ll/۬ܺ֫;)V

    invoke-static {p1}, Ll/ܳ۠᩵;->֫(Ll/֫᩹᩵;)Ll/ܿ۠᩵;

    move-result-object p1

    iput-object p1, p0, Ll/ۡܺ֫;->ᩳ:Ll/ܿ۠᩵;

    return-void
.end method

.method private final ܽ()Ll/ܺܺ֫;
    .locals 1

    .line 133
    iget-object v0, p0, Ll/ۡܺ֫;->ᩳ:Ll/ܿ۠᩵;

    invoke-interface {v0}, Ll/ܿ۠᩵;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺܺ֫;

    return-object v0
.end method


# virtual methods
.method public final ֫()Landroid/os/Bundle;
    .locals 5

    .line 138
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 141
    iget-object v1, p0, Ll/ۡܺ֫;->ۧ:Landroid/os/Bundle;

    if-eqz v1, :cond_0

    .line 142
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 146
    :cond_0
    invoke-direct {p0}, Ll/ۡܺ֫;->ܽ()Ll/ܺܺ֫;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺܺ֫;->ᩳ()Ljava/util/LinkedHashMap;

    move-result-object v1

    .line 226
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 146
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧܺ֫;

    .line 147
    invoke-virtual {v2}, Ll/ۧܺ֫;->֫()Ll/۠۫ۧ;

    move-result-object v2

    invoke-interface {v2}, Ll/۠۫ۧ;->֫()Landroid/os/Bundle;

    move-result-object v2

    .line 148
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    invoke-static {v2, v4}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 149
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    .line 154
    iput-boolean v1, p0, Ll/ۡܺ֫;->֫:Z

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 3

    .line 180
    invoke-virtual {p0}, Ll/ۡܺ֫;->ۧ()V

    .line 181
    iget-object v0, p0, Ll/ۡܺ֫;->ۧ:Landroid/os/Bundle;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 182
    :goto_0
    iget-object v2, p0, Ll/ۡܺ֫;->ۧ:Landroid/os/Bundle;

    if-eqz v2, :cond_1

    invoke-virtual {v2, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 183
    :cond_1
    iget-object p1, p0, Ll/ۡܺ֫;->ۧ:Landroid/os/Bundle;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result p1

    const/4 v2, 0x1

    if-ne p1, v2, :cond_2

    .line 184
    iput-object v1, p0, Ll/ۡܺ֫;->ۧ:Landroid/os/Bundle;

    :cond_2
    return-object v0
.end method

.method public final ۧ()V
    .locals 3

    .line 162
    iget-boolean v0, p0, Ll/ۡܺ֫;->֫:Z

    if-nez v0, :cond_2

    .line 163
    iget-object v0, p0, Ll/ۡܺ֫;->ܽ:Ll/ܶ۫ۧ;

    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {v0, v1}, Ll/ܶ۫ۧ;->֫(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 164
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 165
    iget-object v2, p0, Ll/ۡܺ֫;->ۧ:Landroid/os/Bundle;

    if-eqz v2, :cond_0

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    if-eqz v0, :cond_1

    .line 166
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 164
    :cond_1
    iput-object v1, p0, Ll/ۡܺ֫;->ۧ:Landroid/os/Bundle;

    const/4 v0, 0x1

    .line 168
    iput-boolean v0, p0, Ll/ۡܺ֫;->֫:Z

    .line 172
    invoke-direct {p0}, Ll/ۡܺ֫;->ܽ()Ll/ܺܺ֫;

    :cond_2
    return-void
.end method
