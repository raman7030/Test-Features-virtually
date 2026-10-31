.class public final Ll/֡ۤܳ;
.super Ljava/lang/Object;
.source "T5BA"


# instance fields
.field public final ֫:Ljava/util/HashSet;

.field public final ۧ:Z


# direct methods
.method public constructor <init>(IZ)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-boolean p2, p0, Ll/֡ۤܳ;->ۧ:Z

    .line 14
    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2, p1}, Ljava/util/HashSet;-><init>(I)V

    iput-object p2, p0, Ll/֡ۤܳ;->֫:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 18
    iget-boolean v0, p0, Ll/֡ۤܳ;->ۧ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iget-object v0, p0, Ll/֡ۤܳ;->֫:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 22
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const-string v0, "\\"

    .line 24
    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "/"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 27
    :cond_1
    iget-boolean v0, p0, Ll/֡ۤܳ;->ۧ:Z

    if-nez v0, :cond_2

    .line 28
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    .line 29
    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    .line 31
    :cond_2
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    return v2

    .line 33
    :cond_3
    iget-object v0, p0, Ll/֡ۤܳ;->֫:Ljava/util/HashSet;

    invoke-virtual {v0, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    return v1

    .line 35
    :cond_4
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 36
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return v2

    :cond_5
    :goto_0
    return v1
.end method
