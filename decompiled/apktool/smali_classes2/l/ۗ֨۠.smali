.class public final Ll/ۗ֨۠;
.super Ljava/lang/Object;
.source "K66W"


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final ۧ:Ljava/util/HashMap;

.field public final ܽ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 163
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 122
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۗ֨۠;->ۧ:Ljava/util/HashMap;

    .line 168
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۗ֨۠;->֫:Ljava/util/HashMap;

    .line 173
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۗ֨۠;->ܽ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 186
    invoke-virtual {p0, p1}, Ll/ۗ֨۠;->ۧ(Ljava/lang/Class;)Ll/ۙ֨۠;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۙ֨۠;)Ljava/lang/Object;
    .locals 3

    .line 211
    iget-object v0, p0, Ll/ۗ֨۠;->ۧ:Ljava/util/HashMap;

    if-eqz v0, :cond_3

    .line 147
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 148
    instance-of v2, v1, Ll/᩶֨۠;

    if-eqz v2, :cond_2

    check-cast v1, Ll/᩶֨۠;

    .line 149
    invoke-interface {v1, p0}, Ll/᩶֨۠;->֫(Ll/ۗ֨۠;)Ljava/lang/Object;

    move-result-object v1

    .line 150
    instance-of v2, v1, Ll/᩶֨۠;

    if-nez v2, :cond_1

    .line 152
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ll/۫ۙ;->֫(Z)V

    return-object v1

    .line 151
    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "T extends Context.Factory"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_2
    return-object v1

    .line 212
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ֫(Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 0

    .line 190
    invoke-virtual {p0, p1}, Ll/ۗ֨۠;->ۧ(Ljava/lang/Class;)Ll/ۙ֨۠;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Class;Ll/᩶֨۠;)V
    .locals 0

    .line 193
    invoke-virtual {p0, p1}, Ll/ۗ֨۠;->ۧ(Ljava/lang/Class;)Ll/ۙ֨۠;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ll/᩶֨۠;)V

    return-void
.end method

.method public final ֫(Ll/ۙ֨۠;Ljava/lang/Object;)V
    .locals 1

    .line 136
    instance-of v0, p2, Ll/᩶֨۠;

    if-nez v0, :cond_3

    .line 211
    iget-object v0, p0, Ll/ۗ֨۠;->ۧ:Ljava/util/HashMap;

    if-eqz v0, :cond_2

    .line 139
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 140
    instance-of v0, p1, Ll/᩶֨۠;

    if-nez v0, :cond_1

    if-eq p1, p2, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 141
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "duplicate context value"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    return-void

    .line 212
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 137
    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "T extends Context.Factory"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public final ֫(Ll/ۙ֨۠;Ll/᩶֨۠;)V
    .locals 1

    .line 211
    iget-object v0, p0, Ll/ۗ֨۠;->ۧ:Ljava/util/HashMap;

    if-eqz v0, :cond_2

    .line 127
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 211
    iget-object v0, p0, Ll/ۗ֨۠;->֫:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    .line 131
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 212
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 129
    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "duplicate context value"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    .line 212
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ۧ(Ljava/lang/Class;)Ll/ۙ֨۠;
    .locals 2

    .line 211
    iget-object v0, p0, Ll/ۗ֨۠;->ܽ:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    .line 177
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ֨۠;

    if-nez v1, :cond_0

    .line 179
    new-instance v1, Ll/ۙ֨۠;

    invoke-direct {v1}, Ll/ۙ֨۠;-><init>()V

    .line 180
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1

    .line 212
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method
