.class public final Ll/ܶܿᩳ;
.super Ll/۬ܿᩳ;
.source "45AX"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ll/۬ܿᩳ;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܶܿᩳ;-><init>()V

    return-void
.end method

.method public static ۚ()Ll/ܶܿᩳ;
    .locals 1

    .line 16
    invoke-static {}, Ll/۠ܿᩳ;->֫()Ll/ܶܿᩳ;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final ۘ()Ljava/lang/String;
    .locals 1

    const v0, 0x7f120aa3

    .line 25
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۜ()[B
    .locals 3

    const-string v0, "/assets/"

    const-string v1, "testkey.x509.pem"

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-class v2, Ll/ܶܿᩳ;

    invoke-virtual {v2, v0}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 46
    :cond_0
    invoke-static {}, Ll/ۙ᩸᩷;->ۧ()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    .line 51
    invoke-static {v0, v1}, Ll/֡ۤۡ;->֫(Ljava/io/InputStream;I)[B

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()[B
    .locals 3

    const-string v0, "/assets/"

    const-string v1, "testkey.pk8"

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-class v2, Ll/ܶܿᩳ;

    invoke-virtual {v2, v0}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 46
    :cond_0
    invoke-static {}, Ll/ۙ᩸᩷;->ۧ()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    .line 51
    invoke-static {v0, v1}, Ll/֡ۤۡ;->֫(Ljava/io/InputStream;I)[B

    move-result-object v0

    return-object v0
.end method
