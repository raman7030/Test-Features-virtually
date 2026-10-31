.class public final synthetic Ll/ۙ᩶᩻;
.super Ljava/lang/Object;
.source "Y20N"

# interfaces
.implements Ll/ۙ۫ۡ;


# instance fields
.field public final synthetic ᩸:Ll/۫ܽܽ;

.field public final synthetic ᩹:Ll/۟ۡۡ;


# direct methods
.method public synthetic constructor <init>(Ll/۬᩶᩻;Ll/۫ܽܽ;Ll/۟ۡۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ۙ᩶᩻;->᩸:Ll/۫ܽܽ;

    iput-object p3, p0, Ll/ۙ᩶᩻;->᩹:Ll/۟ۡۡ;

    return-void
.end method


# virtual methods
.method public final ֫()Landroid/graphics/Bitmap;
    .locals 3

    .line 96
    new-instance v0, Ll/ۗ᩶᩻;

    iget-object v1, p0, Ll/ۙ᩶᩻;->᩸:Ll/۫ܽܽ;

    iget-object v2, p0, Ll/ۙ᩶᩻;->᩹:Ll/۟ۡۡ;

    invoke-direct {v0, v1, v2}, Ll/ۗ᩶᩻;-><init>(Ll/۫ܽܽ;Ll/۟ۡۡ;)V

    invoke-static {v0}, Ll/ܿܺۡ;->ۧ(Ll/ۧܺۡ;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
