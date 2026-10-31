.class public abstract Ll/ۡܳ֨;
.super Ljava/lang/Object;
.source "34PY"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 1

    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-string p2, ""

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۡܳ֨;

    .line 51
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", "

    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static ۧ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 1

    if-eqz p2, :cond_0

    .line 59
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 60
    invoke-static {p0, p1, p2, p3}, Ll/ۡܳ֨;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public ֫()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
