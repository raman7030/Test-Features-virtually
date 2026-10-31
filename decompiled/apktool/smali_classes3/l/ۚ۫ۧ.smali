.class public final Ll/ۚ۫ۧ;
.super Ljava/lang/Object;
.source "Q20L"

# interfaces
.implements Ll/ܿۡ֫;


# instance fields
.field public final ᩸:Ll/᩹۫ۧ;


# direct methods
.method public constructor <init>(Ll/᩹۫ۧ;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Ll/ۚ۫ۧ;->᩸:Ll/᩹۫ۧ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 4

    .line 29
    sget-object v0, Ll/᩺ۢ֫;->ۙ:Ll/᩺ۢ֫;

    if-ne p2, v0, :cond_3

    .line 32
    invoke-interface {p1}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/۟ۢ֫;->ۧ(Ll/ܳۡ֫;)V

    .line 33
    iget-object p1, p0, Ll/ۚ۫ۧ;->᩸:Ll/᩹۫ۧ;

    invoke-interface {p1}, Ll/᩹۫ۧ;->getSavedStateRegistry()Ll/ܶ۫ۧ;

    move-result-object p2

    const-string v0, "androidx.savedstate.Restarter"

    .line 34
    invoke-virtual {p2, v0}, Ll/ܶ۫ۧ;->֫(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p2

    if-nez p2, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v0, "classes_to_restore"

    .line 35
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 41
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "Class "

    .line 49
    :try_start_0
    const-class v2, Ll/ۚ۫ۧ;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v0, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ll/֨۫ۧ;

    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v2

    const-string v3, "{\n                Class.\u2026class.java)\n            }"

    .line 48
    invoke-static {v2, v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v3, 0x0

    .line 56
    :try_start_1
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v2, 0x1

    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 66
    :try_start_2
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "{\n                constr\u2026wInstance()\n            }"

    .line 65
    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ll/֨۫ۧ;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 70
    invoke-interface {v1, p1}, Ll/֨۫ۧ;->֫(Ll/᩹۫ۧ;)V

    goto :goto_0

    :catch_0
    move-exception p1

    .line 68
    new-instance p2, Ljava/lang/RuntimeException;

    const-string v1, "Failed to instantiate "

    .line 0
    invoke-static {v1, v0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 68
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 58
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " must have default constructor in order to be automatically recreated"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 58
    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_2
    move-exception p1

    .line 52
    new-instance p2, Ljava/lang/RuntimeException;

    const-string v2, " wasn\'t found"

    .line 0
    invoke-static {v1, v0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 52
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_1
    :goto_1
    return-void

    .line 36
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 30
    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Next event must be ON_CREATE"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method
