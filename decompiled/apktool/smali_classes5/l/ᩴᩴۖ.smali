.class public final Ll/ᩴᩴۖ;
.super Ljava/lang/Object;
.source "H9PH"

# interfaces
.implements Ll/᩷֡ۖ;


# static fields
.field public static final ֫:Ll/ᩴᩴۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Ll/ᩴᩴۖ;

    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    sput-object v0, Ll/ᩴᩴۖ;->֫:Ll/ᩴᩴۖ;

    return-void
.end method

.method public static ֫()Ll/ᩴᩴۖ;
    .locals 1

    .line 20
    sget-object v0, Ll/ᩴᩴۖ;->֫:Ll/ᩴᩴۖ;

    return-object v0
.end method


# virtual methods
.method public final ֫(Ljava/lang/Class;)Ll/ۜ֡ۖ;
    .locals 3

    .line 30
    const-class v0, Ll/᩸ᩴۖ;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 36
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    .line 35
    invoke-static {v0}, Ll/᩸ᩴۖ;->֫(Ljava/lang/Class;)Ll/᩸ᩴۖ;

    move-result-object v0

    .line 360
    sget-object v1, Ll/۠ᩴۖ;->ۙ:Ll/۠ᩴۖ;

    .line 290
    invoke-virtual {v0}, Ll/᩸ᩴۖ;->֫()Ljava/lang/Object;

    move-result-object v0

    .line 37
    check-cast v0, Ll/ۜ֡ۖ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 39
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v2, "Unable to get message info for "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 31
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Unsupported message type: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(Ljava/lang/Class;)Z
    .locals 1

    .line 25
    const-class v0, Ll/᩸ᩴۖ;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    return p1
.end method
