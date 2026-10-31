.class public final Ll/᩶᩵ܺ;
.super Ljava/lang/Object;
.source "UB7S"

# interfaces
.implements Ll/ۚ᩵ܺ;


# instance fields
.field public ֫:Z

.field public ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZLjava/lang/String;)V
    .locals 0

    .line 1580
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1581
    iput-boolean p1, p0, Ll/᩶᩵ܺ;->֫:Z

    .line 1582
    iput-object p2, p0, Ll/᩶᩵ܺ;->ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1612
    iget-boolean v0, p0, Ll/᩶᩵ܺ;->֫:Z

    if-eqz v0, :cond_0

    const-string v0, "only-of-type <"

    const-string v1, ">"

    .line 0
    iget-object v2, p0, Ll/᩶᩵ܺ;->ۧ:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "only-child"

    return-object v0
.end method

.method public final ֫(Ll/᩵ۚܺ;)Z
    .locals 5

    .line 1590
    iget-boolean v0, p0, Ll/᩶᩵ܺ;->֫:Z

    iget-object v1, p0, Ll/᩶᩵ܺ;->ۧ:Ljava/lang/String;

    if-eqz v0, :cond_0

    if-nez v1, :cond_0

    invoke-virtual {p1}, Ll/ۚۚܺ;->᩻()Ljava/lang/String;

    move-result-object v1

    .line 1597
    :cond_0
    iget-object p1, p1, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    const/4 v0, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_3

    .line 1599
    invoke-interface {p1}, Ll/ۘۚܺ;->getChildren()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v3, 0x0

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۚۚܺ;

    .line 1600
    check-cast v4, Ll/᩵ۚܺ;

    if-eqz v1, :cond_2

    .line 1601
    invoke-virtual {v4}, Ll/ۚۚܺ;->᩻()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    const/4 v3, 0x1

    :cond_4
    if-ne v3, v2, :cond_5

    return v2

    :cond_5
    return v0
.end method
