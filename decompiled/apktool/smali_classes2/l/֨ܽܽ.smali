.class public final Ll/֨ܽܽ;
.super Ljava/lang/Error;
.source "HAQ9"


# static fields
.field public static final ᩸:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Ll/֨ܽܽ;->᩸:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(JLjava/util/Map;)V
    .locals 4

    const-string v0, "Application unresponsive for at least "

    const-string v1, " ms."

    .line 0
    invoke-static {v0, v1, p1, p2}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 38
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    .line 39
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Thread;

    const/16 v1, 0xa

    .line 40
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " (state = "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ljava/lang/StackTraceElement;

    array-length v0, p3

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p3, v1

    const-string v3, "\n    at "

    .line 42
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 45
    :cond_1
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 29
    invoke-direct {p0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 30
    sget-object p1, Ll/֨ܽܽ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Runnable;

    .line 31
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static ֫()Ll/֨ܽܽ;
    .locals 4

    const-string v0, ""

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    .line 65
    invoke-static {v2, v3, v0, v1}, Ll/֨ܽܽ;->֫(JLjava/lang/String;Ll/ܶܽܽ;)Ll/֨ܽܽ;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(J)Ll/֨ܽܽ;
    .locals 3

    .line 101
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    .line 102
    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    .line 103
    new-instance v2, Ll/֨ܽܽ;

    invoke-static {v0, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {v2, p0, p1, v0}, Ll/֨ܽܽ;-><init>(JLjava/util/Map;)V

    return-object v2
.end method

.method public static ֫(JLjava/lang/String;Ll/ܶܽܽ;)Ll/֨ܽܽ;
    .locals 6

    .line 70
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    .line 72
    new-instance v1, Ljava/util/TreeMap;

    new-instance v2, Ll/ۚܽܽ;

    invoke-direct {v2, v0}, Ll/ۚܽܽ;-><init>(Ljava/lang/Thread;)V

    invoke-direct {v1, v2}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 82
    invoke-static {}, Ljava/lang/Thread;->getAllStackTraces()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 83
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Thread;

    if-ne v4, p3, :cond_1

    goto :goto_0

    .line 87
    :cond_1
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/StackTraceElement;

    if-eq v4, v0, :cond_2

    .line 88
    invoke-virtual {v4}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    array-length v5, v3

    if-lez v5, :cond_0

    .line 89
    :cond_2
    invoke-virtual {v1, v4, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 93
    :cond_3
    invoke-virtual {v1, v0}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    .line 94
    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p2

    invoke-virtual {v1, v0, p2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    :cond_4
    new-instance p2, Ll/֨ܽܽ;

    invoke-direct {p2, p0, p1, v1}, Ll/֨ܽܽ;-><init>(JLjava/util/Map;)V

    return-object p2
.end method


# virtual methods
.method public final fillInStackTrace()Ljava/lang/Throwable;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/StackTraceElement;

    .line 51
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 59
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "ANRError: "

    .line 60
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "ANRError"

    return-object v0
.end method
