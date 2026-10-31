.class public final Lbin/mt/plugin/api/drawable/MaterialIcons;
.super Ljava/lang/Object;
.source "MaterialIcons.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static get(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 27
    const-class v0, Ll/ۗܳ᩷;

    invoke-static {v0}, Lbin/mt/plugin/api/util/ServiceLoader;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗܳ᩷;

    invoke-interface {v0, p0}, Ll/ۗܳ᩷;->get(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static getOutlined(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 41
    const-class v0, Ll/ۗܳ᩷;

    invoke-static {v0}, Lbin/mt/plugin/api/util/ServiceLoader;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗܳ᩷;

    invoke-interface {v0, p0}, Ll/ۗܳ᩷;->getOutlined(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method
