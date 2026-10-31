.class public final Ll/ۜ᩶᩵;
.super Ljava/lang/Object;
.source "J2NL"


# static fields
.field public static final ֫:Ll/᩷᩶᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"

    .line 26
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷᩶᩵;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    nop

    :goto_0
    if-eqz v0, :cond_0

    goto :goto_1

    .line 34
    :cond_0
    new-instance v0, Ll/᩷᩶᩵;

    invoke-direct {v0}, Ll/᩷᩶᩵;-><init>()V

    :goto_1
    sput-object v0, Ll/ۜ᩶᩵;->֫:Ll/᩷᩶᩵;

    return-void
.end method

.method public static ֫(Ll/۟᩹᩵;)Ljava/lang/String;
    .locals 1

    .line 84
    sget-object v0, Ll/ۜ᩶᩵;->֫:Ll/᩷᩶᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object p0

    const/4 v0, 0x0

    aget-object p0, p0, v0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "kotlin.jvm.functions."

    .line 45
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x15

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static ֫(Ll/ܽ᩶᩵;)Ljava/lang/String;
    .locals 1

    .line 79
    sget-object v0, Ll/ۜ᩶᩵;->֫:Ll/᩷᩶᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object p0

    const/4 v0, 0x0

    aget-object p0, p0, v0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "kotlin.jvm.functions."

    .line 45
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x15

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static ֫(Ljava/lang/Class;)Ll/ۛ᩹᩵;
    .locals 1

    .line 60
    sget-object v0, Ll/ۜ᩶᩵;->֫:Ll/᩷᩶᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    new-instance v0, Ll/ۛ᩹᩵;

    invoke-direct {v0, p0}, Ll/ۛ᩹᩵;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public static ֫(Ll/֫᩶᩵;)V
    .locals 0

    .line 90
    sget-object p0, Ll/ۜ᩶᩵;->֫:Ll/᩷᩶᩵;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public static ֫(Ll/ܿ᩶᩵;)V
    .locals 0

    .line 96
    sget-object p0, Ll/ۜ᩶᩵;->֫:Ll/᩷᩶᩵;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public static ۧ(Ljava/lang/Class;)Ll/ᩳ᩶᩵;
    .locals 1

    .line 51
    sget-object v0, Ll/ۜ᩶᩵;->֫:Ll/᩷᩶᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    new-instance v0, Ll/ᩳ᩶᩵;

    invoke-direct {v0, p0}, Ll/ᩳ᩶᩵;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method
