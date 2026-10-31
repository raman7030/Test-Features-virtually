.class public final Ll/۫᩸ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/security/PrivilegedAction;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ll/۫᩸ᩴ;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()Ljava/lang/Object;
    .locals 7

    iget v0, p0, Ll/۫᩸ᩴ;->a:I

    const-string v1, "org.openjdk.java.util.stream.tripwire"

    packed-switch v0, :pswitch_data_0

    .line 51
    invoke-static {v1}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-string v0, "java.util.secureRandomSeed"

    .line 1149
    invoke-static {v0}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 51
    :pswitch_1
    invoke-static {v1}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 205
    :pswitch_2
    sget-object v0, Ll/۬᩸ᩴ;->a:Ljava/lang/Object;

    .line 149
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 151
    const-class v1, Ll/۬᩸ᩴ;

    .line 152
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v1, v2}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬᩸ᩴ;

    .line 156
    invoke-virtual {v2}, Ll/۬᩸ᩴ;->getScheme()Ljava/lang/String;

    move-result-object v3

    const-string v4, "file"

    .line 159
    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 161
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    :cond_1
    if-ge v5, v4, :cond_2

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v5, v5, 0x1

    check-cast v6, Ll/۬᩸ᩴ;

    .line 162
    invoke-virtual {v6}, Ll/۬᩸ᩴ;->getScheme()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_0

    .line 168
    :cond_2
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
