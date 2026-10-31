.class public final Ll/۟ۖ;
.super Ljava/lang/Object;
.source "K22K"

# interfaces
.implements Ll/᩺ۖ;


# virtual methods
.method public final ֫(Landroid/content/Context;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 521
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-static {p1, p2, p3, p4}, Ll/᩹᩺ۧ;->֫(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Ll/᩹᩺ۧ;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method
