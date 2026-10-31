.class public Ll/ܿܶ;
.super Ljava/lang/Object;
.source "81CV"

# interfaces
.implements Ll/ۧܶ;


# instance fields
.field public ֫:Z

.field public ۜ:Ll/۠ܶ;

.field public ۡ:Ll/۠ܶ;

.field public ۢ:Ll/ᩳܶ;

.field public ۧ:Ljava/util/ArrayList;

.field public ܳ:Z

.field public ܺ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:Ll/ܳܶ;

.field public ᩷:Ljava/util/ArrayList;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/۠ܶ;)V
    .locals 3

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Ll/ܿܶ;->ۡ:Ll/۠ܶ;

    const/4 v1, 0x0

    .line 24
    iput-boolean v1, p0, Ll/ܿܶ;->֫:Z

    .line 25
    iput-boolean v1, p0, Ll/ܿܶ;->ܳ:Z

    .line 30
    sget-object v2, Ll/ᩳܶ;->ۤ:Ll/ᩳܶ;

    iput-object v2, p0, Ll/ܿܶ;->ۢ:Ll/ᩳܶ;

    const/4 v2, 0x1

    .line 33
    iput v2, p0, Ll/ܿܶ;->ܿ:I

    .line 34
    iput-object v0, p0, Ll/ܿܶ;->ᩳ:Ll/ܳܶ;

    .line 35
    iput-boolean v1, p0, Ll/ܿܶ;->᩻:Z

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    .line 38
    iput-object p1, p0, Ll/ܿܶ;->ۜ:Ll/۠ܶ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܿܶ;->ۜ:Ll/۠ܶ;

    iget-object v1, v1, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    invoke-virtual {v1}, Ll/ܶ۠;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܿܶ;->ۢ:Ll/ᩳܶ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/ܿܶ;->᩻:Z

    if-eqz v1, :cond_0

    iget v1, p0, Ll/ܿܶ;->ܺ:I

    .line 46
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "unresolved"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ") <t="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":d="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()V
    .locals 1

    .line 119
    iget-object v0, p0, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 120
    iget-object v0, p0, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    .line 121
    iput-boolean v0, p0, Ll/ܿܶ;->᩻:Z

    .line 122
    iput v0, p0, Ll/ܿܶ;->ܺ:I

    .line 123
    iput-boolean v0, p0, Ll/ܿܶ;->ܳ:Z

    .line 124
    iput-boolean v0, p0, Ll/ܿܶ;->֫:Z

    return-void
.end method

.method public ֫(I)V
    .locals 1

    .line 50
    iget-boolean v0, p0, Ll/ܿܶ;->᩻:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    .line 54
    iput-boolean v0, p0, Ll/ܿܶ;->᩻:Z

    .line 55
    iput p1, p0, Ll/ܿܶ;->ܺ:I

    .line 56
    iget-object p1, p0, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧܶ;

    .line 57
    invoke-interface {v0, v0}, Ll/ۧܶ;->֫(Ll/ۧܶ;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final ֫(Ll/۠ܶ;)V
    .locals 1

    .line 100
    iget-object v0, p0, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    iget-boolean v0, p0, Ll/ܿܶ;->᩻:Z

    if-eqz v0, :cond_0

    .line 102
    invoke-interface {p1, p1}, Ll/ۧܶ;->֫(Ll/ۧܶ;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۧܶ;)V
    .locals 5

    .line 62
    iget-object p1, p0, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿܶ;

    .line 63
    iget-boolean v1, v1, Ll/ܿܶ;->᩻:Z

    if-nez v1, :cond_0

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    .line 67
    iput-boolean v0, p0, Ll/ܿܶ;->ܳ:Z

    .line 68
    iget-object v1, p0, Ll/ܿܶ;->ۡ:Ll/۠ܶ;

    if-eqz v1, :cond_2

    .line 69
    invoke-interface {v1, p0}, Ll/ۧܶ;->֫(Ll/ۧܶ;)V

    .line 71
    :cond_2
    iget-boolean v1, p0, Ll/ܿܶ;->֫:Z

    if-eqz v1, :cond_3

    .line 72
    iget-object p1, p0, Ll/ܿܶ;->ۜ:Ll/۠ܶ;

    invoke-virtual {p1, p0}, Ll/۠ܶ;->֫(Ll/ۧܶ;)V

    return-void

    .line 77
    :cond_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܿܶ;

    .line 78
    instance-of v4, v3, Ll/ܳܶ;

    if-eqz v4, :cond_4

    goto :goto_0

    :cond_4
    add-int/lit8 v2, v2, 0x1

    move-object v1, v3

    goto :goto_0

    :cond_5
    if-eqz v1, :cond_7

    if-ne v2, v0, :cond_7

    .line 84
    iget-boolean p1, v1, Ll/ܿܶ;->᩻:Z

    if-eqz p1, :cond_7

    .line 85
    iget-object p1, p0, Ll/ܿܶ;->ᩳ:Ll/ܳܶ;

    if-eqz p1, :cond_6

    .line 86
    iget-boolean v0, p1, Ll/ܿܶ;->᩻:Z

    if-eqz v0, :cond_8

    .line 87
    iget v0, p0, Ll/ܿܶ;->ܿ:I

    iget p1, p1, Ll/ܿܶ;->ܺ:I

    mul-int v0, v0, p1

    iput v0, p0, Ll/ܿܶ;->ܽ:I

    .line 92
    :cond_6
    iget p1, v1, Ll/ܿܶ;->ܺ:I

    iget v0, p0, Ll/ܿܶ;->ܽ:I

    add-int/2addr p1, v0

    invoke-virtual {p0, p1}, Ll/ܿܶ;->֫(I)V

    .line 94
    :cond_7
    iget-object p1, p0, Ll/ܿܶ;->ۡ:Ll/۠ܶ;

    if-eqz p1, :cond_8

    .line 95
    invoke-interface {p1, p0}, Ll/ۧܶ;->֫(Ll/ۧܶ;)V

    :cond_8
    :goto_1
    return-void
.end method
