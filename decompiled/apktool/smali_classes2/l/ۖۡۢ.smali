.class public final Ll/ۖۡۢ;
.super Ljava/lang/Object;
.source "31PG"


# instance fields
.field public ֫:Z

.field public ۧ:Ljava/lang/String;

.field public ܽ:I


# direct methods
.method public constructor <init>(Ll/۠ۛ֡;)V
    .locals 4

    .line 1146
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1147
    invoke-virtual {p1}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object v0

    .line 1148
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2f

    const/16 v3, 0x2e

    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۖۡۢ;->ۧ:Ljava/lang/String;

    .line 1149
    invoke-virtual {p1}, Ll/۠ۛ֡;->֨()I

    move-result v0

    iput v0, p0, Ll/ۖۡۢ;->ܽ:I

    .line 1150
    invoke-virtual {p1}, Ll/۠ۛ֡;->getAnnotations()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-string v3, "Lbin/mt/annotations/MTProtector;"

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧۛ֡;

    .line 1151
    invoke-virtual {v1}, Ll/ۧۛ֡;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1152
    iput-boolean v2, p0, Ll/ۖۡۢ;->֫:Z

    return-void

    .line 1156
    :cond_1
    invoke-virtual {p1}, Ll/۠ۛ֡;->getMethods()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽۨ֡;

    .line 1157
    invoke-virtual {v0}, Ll/ܽۨ֡;->getAnnotations()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷֫ۚ;

    .line 1158
    invoke-interface {v1}, Ll/᩷֫ۚ;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1159
    iput-boolean v2, p0, Ll/ۖۡۢ;->֫:Z

    :cond_4
    return-void
.end method
