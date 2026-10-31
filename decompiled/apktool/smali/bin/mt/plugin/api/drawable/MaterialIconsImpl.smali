.class public Lbin/mt/plugin/api/drawable/MaterialIconsImpl;
.super Ljava/lang/Object;
.source "MaterialIconsImpl.java"

# interfaces
.implements Ll/ۗܳ᩷;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static register()V
    .locals 2

    .line 12
    new-instance v0, Lbin/mt/plugin/api/drawable/MaterialIconsImpl;

    invoke-direct {v0}, Lbin/mt/plugin/api/drawable/MaterialIconsImpl;-><init>()V

    const-class v1, Ll/ۗܳ᩷;

    invoke-static {v1, v0}, Lbin/mt/plugin/api/util/ServiceLoader;->register(Ljava/lang/Class;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 2

    const/4 v0, 0x1

    .line 18
    invoke-static {p1, v0}, Ll/᩶᩹ۡ;->֫(Ljava/lang/String;Z)Ll/ܶ᩹ۡ;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Filled material icon not found: "

    .line 0
    invoke-static {v1, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 20
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getOutlined(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 2

    const/4 v0, 0x0

    .line 28
    invoke-static {p1, v0}, Ll/᩶᩹ۡ;->֫(Ljava/lang/String;Z)Ll/ܶ᩹ۡ;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 30
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Outlined material icon not found: "

    .line 0
    invoke-static {v1, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 30
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
