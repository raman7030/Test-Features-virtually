.class public final Ll/ۨ֨֡;
.super Ljava/lang/Object;
.source "R6M7"


# static fields
.field public static final ܽ:Ljava/util/Map;


# instance fields
.field public final ֫:Ljava/lang/StringBuilder;

.field public ۧ:C


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 0
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 10
    sput-object v0, Ll/ۨ֨֡;->ܽ:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/StringBuilder;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 13
    iput-char v0, p0, Ll/ۨ֨֡;->ۧ:C

    .line 17
    iput-object p1, p0, Ll/ۨ֨֡;->֫:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 58
    iget-char v0, p0, Ll/ۨ֨֡;->ۧ:C

    if-eqz v0, :cond_0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_0

    const-string v0, "\n"

    .line 59
    invoke-virtual {p0, v0}, Ll/ۨ֨֡;->֫(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 65
    :try_start_0
    iget-object v0, p0, Ll/ۨ֨֡;->֫:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    .line 71
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    iput-char p1, p0, Ll/ۨ֨֡;->ۧ:C

    :cond_0
    return-void

    :catch_0
    move-exception p1

    .line 67
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/util/Map;Z)V
    .locals 1

    const-string v0, "<"

    .line 37
    invoke-virtual {p0, v0}, Ll/ۨ֨֡;->֫(Ljava/lang/String;)V

    .line 38
    invoke-virtual {p0, p1}, Ll/ۨ֨֡;->֫(Ljava/lang/String;)V

    if-eqz p2, :cond_1

    .line 39
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    .line 40
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    const-string v0, " "

    .line 41
    invoke-virtual {p0, v0}, Ll/ۨ֨֡;->֫(Ljava/lang/String;)V

    .line 42
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ll/۫֡֡;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۨ֨֡;->֫(Ljava/lang/String;)V

    .line 43
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v0, "=\""

    .line 44
    invoke-virtual {p0, v0}, Ll/ۨ֨֡;->֫(Ljava/lang/String;)V

    .line 45
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p2}, Ll/۫֡֡;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ll/ۨ֨֡;->֫(Ljava/lang/String;)V

    const-string p2, "\""

    .line 46
    invoke-virtual {p0, p2}, Ll/ۨ֨֡;->֫(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_2

    const-string p1, " /"

    .line 51
    invoke-virtual {p0, p1}, Ll/ۨ֨֡;->֫(Ljava/lang/String;)V

    :cond_2
    const-string p1, ">"

    .line 54
    invoke-virtual {p0, p1}, Ll/ۨ֨֡;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 21
    invoke-virtual {p0, p1}, Ll/ۨ֨֡;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 2

    .line 29
    sget-object v0, Ll/ۨ֨֡;->ܽ:Ljava/util/Map;

    const/4 v1, 0x0

    .line 33
    invoke-virtual {p0, p1, v0, v1}, Ll/ۨ֨֡;->֫(Ljava/lang/String;Ljava/util/Map;Z)V

    return-void
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 0

    .line 25
    invoke-static {p1}, Ll/۫֡֡;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۨ֨֡;->֫(Ljava/lang/String;)V

    return-void
.end method
